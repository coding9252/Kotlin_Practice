package com.gahyeon.miseya

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.gahyeon.miseya.data.DustItem
import com.gahyeon.miseya.databinding.ActivityMainBinding
import com.gahyeon.miseya.retrofit.NetWorkClient
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    var items = mutableListOf<DustItem>()  // 전역변수 선언

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.spinnerViewSido.setOnSpinnerItemSelectedListener<String> { _, _, _, text ->  // text: spinner에서 선택한 지역
            communicateNetWork(setUpDustParameter(text))
        }

        binding.spinnerViewGoo.setOnSpinnerItemSelectedListener<String> { _, _, _, text ->

            Log.d("miseya", "selectedItem: spinnerViewGoo selected >  $text")
            var selectedItem = items.filter { f -> f.stationName == text }
            Log.d("miseya", "selectedItem: sidoName > " + selectedItem[0].sidoName)
            Log.d("miseya", "selectedItem: pm10Value > " + selectedItem[0].pm10Value)

            binding.tvCityname.text = selectedItem[0].sidoName + "  " + selectedItem[0].stationName  // selectedItem이 여러 개일 수 있다. 예를 들어 용산구를 선택했을 때 용산구 데이터가 여러 개일 수 있는데 우리는 실시간 데이터를 원하기 때문에 0번째 것만 사용하는 것.
            binding.tvDate.text = selectedItem[0].dataTime
            binding.tvP10value.text = selectedItem[0].pm10Value + " ㎍/㎥"

            when (getGrade(selectedItem[0].pm10Value)) {
                1 -> {
                    binding.mainBg.setBackgroundColor(Color.parseColor("#9ED2EC"))
                    binding.ivFace.setImageResource(R.drawable.lv1)
                    binding.tvP10grade.text = "좋음"
                }

                2 -> {
                    binding.mainBg.setBackgroundColor(Color.parseColor("#D6A478"))
                    binding.ivFace.setImageResource(R.drawable.lv2)
                    binding.tvP10grade.text = "보통"
                }

                3 -> {
                    binding.mainBg.setBackgroundColor(Color.parseColor("#DF7766"))
                    binding.ivFace.setImageResource(R.drawable.lv3)
                    binding.tvP10grade.text = "나쁨"
                }

                4 -> {
                    binding.mainBg.setBackgroundColor(Color.parseColor("#BB3320"))
                    binding.ivFace.setImageResource(R.drawable.lv4)
                    binding.tvP10grade.text = "매우나쁨"
                }
            }
        }
    }

    // 여기부터 http 통신을 하기 위한 코루틴의 별도 thread
    private fun communicateNetWork(param: HashMap<String, String>) = lifecycleScope.launch() {

        val responseData = NetWorkClient.dustNetWork.getDust(param)

        Log.d("Parsing Dust ::", responseData.toString())

        items = responseData.response.dustBody.dustItem!!

        val goo = ArrayList<String>()  // 지역 선택에 ~구 리스트를 뿌려주는 작업.
        items.forEach {
            Log.d("add Item :", it.stationName)
            goo.add(it.stationName)  // item(response 받은 데이터)에서 stationName(지역명)을 꺼내서 for문이 돌면서 goo에 리스트를 넣음.
        }

        // 별도 thread에서는 ui에 있는 레이아웃들을 건드릴 수 없다. 건드리려면 ui thread를 실행시킨다고 별도로 지정해 줘야 함.
        runOnUiThread {
            binding.spinnerViewGoo.setItems(goo)  // 2번째 스피너에 goo를 setItems으로 넣음
        }

    }

    private fun setUpDustParameter(sido: String): HashMap<String, String> {  // api의 요청변수(Request Parameter)의 키-값
        val authKey =
            "2Z1zOtQt1qEn7nBjoeaTOxHj6RVd3Pls03B6Plg1yUoO24srtbEewjLxjlCnoyz9vOubVtcR04571819tH1i8g=="  // 환경공단에서 발급 받은 일반 인증키(Decoding)

        return hashMapOf(  // api 요청 변수의 항목명(영문)과 정확히 일치해야 한다.
            "serviceKey" to authKey,  // "api 요청 변수의 항목명(영문)" to value값
            "returnType" to "json",
            "numOfRows" to "100",
            "pageNo" to "1",
            "sidoName" to sido,
            "ver" to "1.0"
        )
    }

    fun getGrade(value: String): Int {
        val mValue = value.toInt()
        var grade = 1
        grade = if (mValue >= 0 && mValue <= 30) {
            1
        } else if (mValue >= 31 && mValue <= 80) {
            2
        } else if (mValue >= 81 && mValue <= 100) {
            3
        } else 4
        return grade
    }
}