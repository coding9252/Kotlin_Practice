package com.android.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.android.simplelistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 데이터 원본 준비
        val items = arrayOf<String?>("item1", "item2", "item3", "item4", "item5", "item6", "item7", "item8", "item5", "item6", "item7", "item8", "item5", "item6", "item7", "item8", "item5", "item6",  "item7", "item8")

        // 어댑터 준비 (배열 객체 이용, simple_list_item_1 리소스 사용)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)    // ArrayAdapter를 쓸 것이고, 한 줄만 나오는 뷰 형식을 쓰고, 거기에 데이터 원본 items를 넣어줌.

        binding.ListView.adapter = adapter    // 위 adapter 변수를 ListView 어댑터에 연결해 줌.
    }
}