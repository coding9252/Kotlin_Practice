package com.android.imagegridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.Toast
import com.android.imagegridview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ImageAdapter 객체를 생성하고 GridView 객체에 연결
        binding.gridview.adapter = ImageAdapter()

        // 항목 클릭 이벤트 처리 코드 추가(클릭되면서 콜백 값으로 parent, view, position, id가 넘어온다. 여기선 position만 썼지만, view를 쓴다면 내가 선택한 view를 가져올 수 있다.)
        binding.gridview.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this@MainActivity,"" + (position + 1) + "번째 선택", Toast.LENGTH_SHORT).show()    // position이 0부터 시작해서 +1을 해준 것
        }
    }
}

class ImageAdapter : BaseAdapter() {        // BaseAdapter()를 부르면 에러 뜨면서 implement members 하라고 뜬다. 클릭하면 override fun들이 자동 생성된다.
    override fun getCount(): Int {
        return mThumbIds.size
    }

    override fun getItem(position: Int): Any {
        return mThumbIds[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val imageView: ImageView
        if (convertView == null) {
            imageView = ImageView(parent!!.context)
            imageView.layoutParams = AbsListView.LayoutParams(200,200)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            imageView.setPadding(8, 8, 8, 8)
        } else {
            imageView = convertView as ImageView
        }

        imageView.setImageResource(mThumbIds.get(position))    // mThumbIds에 있는 해당 포지션의 사진을 넣는다.
        return imageView
    }

    private val mThumbIds = arrayOf<Int>(
        R.drawable.sample_2, R.drawable.sample_3,
        R.drawable.sample_4, R.drawable.sample_5,
        R.drawable.sample_6, R.drawable.sample_7,
        R.drawable.sample_0, R.drawable.sample_1,
        R.drawable.sample_2, R.drawable.sample_3,
        R.drawable.sample_4, R.drawable.sample_5,
        R.drawable.sample_6, R.drawable.sample_7,
        R.drawable.sample_0, R.drawable.sample_1,
        R.drawable.sample_2, R.drawable.sample_3,
        R.drawable.sample_4, R.drawable.sample_5,
        R.drawable.sample_6, R.drawable.sample_7
    )
}