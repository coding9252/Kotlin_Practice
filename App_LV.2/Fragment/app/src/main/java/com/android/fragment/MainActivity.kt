package com.android.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.android.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), FragmentDataListener {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.run {
            fragment1Btn.setOnClickListener{
                // [1] Activity -> FirstFragment
                val dataToSend = "Hello First Fragment! \n From Activity"
                val fragment = FirstFragment.newInstance(dataToSend)
                setFragment(fragment)
            }

            fragment2Btn.setOnClickListener {
                // [1] Activity -> SecondFragment
                val dataToSend = "Hello Second Fragment!\n From Activity"
                val fragment = SecondFragment.newInstance(dataToSend)
                setFragment(fragment)
            }

        }
        setFragment(FirstFragment())    // 프로그램 시작 시 FirstFragment를 먼저 띄우라고 넣어준 코드
    }

    private fun setFragment(frag : Fragment) {    // build.gradle(Module :app)에 implementation("androidx.fragment:fragment-ktx:1.6.2") 추가해 주기.
        supportFragmentManager.commit {
            replace(R.id.frameLayout, frag)       // frag에 FirstFragment가 오면 FirstFragment가 들어가고 SecondFragment가 오면 SecondFragment가 들어감. 그걸 frameLayout(화면)에 뿌림
            setReorderingAllowed(true)
            addToBackStack("")
        }
    }

    // [3] Fragment -> Activity
    override fun onDataReceived(data: String) {
        // Fragment에서 받은 데이터를 처리
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show()
    }
}