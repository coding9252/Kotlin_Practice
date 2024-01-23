package com.android.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.fragment.databinding.FragmentFirstBinding

private const val ARG_PARAM1 = "param1"

class FirstFragment : Fragment() {
    private var param1: String? = null

    private val binding by lazy { FragmentFirstBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {  // arguments가 null이 아닐 때만 let이 실행
            param1 = it.getString(ARG_PARAM1)  // 프래그먼트가 onCreate될 때 arguments 안에 번들이라는 객체로 들어있는 것을 꺼내서 전역변수 param1에 받아온 string 값을 넣어줌.
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // [1] Activity -> SecondFragment
        binding.tvFrag1Text.text = param1

        //[2] Fragment -> Fragment
        binding.btnGoFrag2.setOnClickListener {
            val dataToSend = "Hello Fragment2! \n From Fragment1"
            val fragment2 = SecondFragment.newInstance(dataToSend)

            requireActivity().supportFragmentManager.beginTransaction()  // newInstance에 dataToSend 넣은 것을 가지고 프래그먼트 교체!
                .replace(R.id.frameLayout, fragment2)
                .addToBackStack(null)
                .commit()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            // [1] Activity -> SecondFragment
            FirstFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)  // param1에 들어온 데이터를 arguments에 저장
                }
            }
    }
}