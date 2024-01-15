package com.android.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerview.databinding.ItemRecyclerviewBinding

class MyAdapter(val mItems: MutableList<MyItem>) : RecyclerView.Adapter<MyAdapter.Holder>() {    // MyAdapter를 생성할 때 mItems에 MainActivity에 만든 데이터들이 들어온다. 인자로 리스트를 넣어주고, RecyclerView의 Adapter를 상속받음. 상속받으면 ItemId, ItemCount를 꼭 오버라이딩해야 한다.

    interface ItemClick {
        fun onClick(view : View, position : Int)
    }

    var itemClick : ItemClick? = null    // itemClick은 타입이 ItemClick

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {    // 뷰홀더를 화면에 보이는 만큼의 뷰만큼만 틀을 만들고, 그 후엔 이것들을 재사용. 아직 데이터는 안 들어간 상태 ex)데이터 리스트가 23개여도 화면에 한 번에 보이는 뷰가 7개라면 7번만 실행
        val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)  // xml을 recyclerview에 직접 넣을 수 없고, xml을 컴퓨터가 알아들을 수 있는 실제 view 객체로 변환해서 넣어야 하는데 이 변환하는 것을 inflate라고 한다.
        Log.d("myAdapter", "onCreateViewHolder()")
        return Holder(binding)    // binding을 Holder에 넣어줌
    }  // 아직 데이터 안 들어감. 껍데기만 n개(핸드폰 화면에 띄울 수 있는 view의 수) 만들어진 것

    override fun onBindViewHolder(holder: Holder, position: Int) {                  // onBindViewHolder가 데이터 리스트만큼 23번 돌면서 mItems에 있는 23개를 하나하나 실행켜서 데이터를 채움(화면에 보이는데까지만 실행됨. 밑으로 스크롤해서 새로 보여질 때 또 onBindViewHolder가 불림) Holder에 차례대로 들어옴.
        Log.d("myAdapter", "onBindViewHolder()  position = $position")    // position은 0번째 부터 들어옴, 스크롤 돼서 위로 올라간 뷰홀더를 재사용하기 위해 그 홀더와 몇번 포지션에 있는 데이터를 연결
        holder.itemView.setOnClickListener {  //클릭 이벤트 추가 부분
            itemClick?.onClick(it, position)
        }
        holder.iconImageView.setImageResource(mItems[position].aIcon)
        holder.name.text = mItems[position].aName
        holder.age.text = mItems[position].aAge
    }

    override fun getItemId(position: Int): Long {    //
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return mItems.size  // 개수 리턴
    }

    inner class Holder(val binding: ItemRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root) {    // holder를 만들고 계속해서 재활용. inner class는 클래스 안의 클래스라서 외부 클래스의 값들을 참조할 수 있다.
        val iconImageView = binding.iconItem
        val name = binding.textItem1
        val age = binding.textItem2
    }
}