package com.android.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.android.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 데이터 원본 준비
        val dataList = mutableListOf<MyItem>()    // data Class를 만들고(MyItem), dataList에 샘플 데이터들을 추가한다. 지금은 샘플 데이터를 쓰지만, 실제 프로젝트 진행할 떄는 네트워크를 통해 서버에서 데이터를 받아올 것이다.
        dataList.add(MyItem(R.drawable.sample_0, "Chopa", "9"))
        dataList.add(MyItem(R.drawable.sample_1, "Chopa", "9"))
        dataList.add(MyItem(R.drawable.sample_2, "Chopa", "9"))
        dataList.add(MyItem(R.drawable.sample_3, "Duckman", "8.5"))
        dataList.add(MyItem(R.drawable.sample_4, "Duckman", "8.5"))
        dataList.add(MyItem(R.drawable.sample_5, "Duckman", "8.5"))
        dataList.add(MyItem(R.drawable.sample_6, "Ddakji", "5"))
        dataList.add(MyItem(R.drawable.sample_7, "Ddakji", "5"))

        val adapter = MyAdapter(dataList)    // adapter는 MyAdapter이고, 그 안에 실제로 보여줄 dataList를 넣음.
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this)    // layoutManager는 레이아웃을 어떻게 구성할건지.

        adapter.itemClick = object : MyAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                val name: String = dataList[position].aName
                Toast.makeText(this@MainActivity," $name 선택!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}