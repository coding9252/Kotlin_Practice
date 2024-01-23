package com.android.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.fragment.databinding.FragmentSecondBinding
import java.lang.RuntimeException

private const val ARG_PARAM1 = "param1"

class SecondFragment : Fragment() {

    // [3] SecondFragment -> Activity
    private var listener: FragmentDataListener? = null

    private var param1: String? = null

    private val _binding by lazy { FragmentSecondBinding.inflate(layoutInflater) }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        // [3] SecondFragment -> Activity
        if (context is FragmentDataListener) { // is로 타입 체크
            listener = context
        } else { throw RuntimeException("$context must implement FragmentDataListener")

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // [1] Activity -> Fragment
        // [2] Fragment -> Fragment
        binding.tvFrag2Text.text = param1

        // [3] SecondFragment -> Activity
        binding.btnSendActivity.setOnClickListener {
            val dataToSend = "Hello from SecondFragment!"
            listener?.onDataReceived(dataToSend)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
        // [1] Activity -> FirstFragment
            // [2] Fragment -> Fragment
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                }
            }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Binding 객체 해제
        _binding = null
        listener = null
    }
}