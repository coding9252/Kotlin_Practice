package com.android.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.recyclerview.databinding.ItemRecyclerviewBinding

class MyAdapter(val mItems: MutableList<MyItem>) : RecyclerView.Adapter<MyAdapter.Holder>() {    // 인자로 리스트를 넣어주고, RecyclerView의 Adapter를 상속받음. 상속받으면 ItemId, ItemCount를 꼭 오버라이딩해야 한다.

    interface ItemClick {
        fun onClick(view : View, position : Int)
    }

    var itemClick : ItemClick? = null    // itemClick은 타입이 ItemClick

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemRecyclerviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)    // binding을 Holder에 넣어줌
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {    // onBindViewHolder가 8번 돌면서 mItems에 있는 8개를 하나하나 실행시킴(화면에 보이는데까지만 실행됨. 밑으로 스크롤해서 보여질 때 onBindViewHolder가 불림) Holder에 차례대로 들어옴. position은 0번째 부터 들어옴
        holder.itemView.setOnClickListener {  //클릭 이벤트 추가 부분
            itemClick?.onClick(it, position)
        }
        holder.iconImageView.setImageResource(mItems[position].aIcon)
        holder.name.text = mItems[position].aName
        holder.age.text = mItems[position].aAge
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

    inner class Holder(val binding: ItemRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root) {    // holder를 만들고 계속해서 재활용
        val iconImageView = binding.iconItem
        val name = binding.textItem1
        val age = binding.textItem2
    }
}