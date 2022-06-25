package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity(), Contract.View, View.OnClickListener {

    var taskView: AppCompatTextView? = null
    var task1: AppCompatTextView? = null
    var task2: AppCompatTextView? = null
    var task3: AppCompatTextView? = null
    var task4: AppCompatTextView? = null

    var presenter: ExecutorPresentor? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = ExecutorPresentor(this)
    }

    override fun initView() {
        taskView = findViewById(R.id.task_view)
        task1 = findViewById(R.id.task_1)
        task2 = findViewById(R.id.task_2)
        task3 = findViewById(R.id.task_3)
        task4 = findViewById(R.id.task_4)
        task1?.setOnClickListener(this)
        task2?.setOnClickListener(this)
        task3?.setOnClickListener(this)
        task4?.setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.task_1 -> {
                editLayout(1)
                presenter?.onTaskOneClick()
            }
            R.id.task_2 -> {
                editLayout(2)
                presenter?.onTaskTwoClick()
            }

            R.id.task_3 -> {
                editLayout(3)
                presenter?.onTaskThreeClick()
            }

            R.id.task_4 -> {
                editLayout(4)
                presenter?.onTaskFourClick()
            }
        }
    }

    private fun editLayout(pos: Int) {
        task1!!.setTextColor(getColor(R.color.black))
        task2!!.setTextColor(getColor(R.color.black))
        task3!!.setTextColor(getColor(R.color.black))
        task4!!.setTextColor(getColor(R.color.black))

        task1!!.setBackgroundResource(R.drawable.tab_white)
        task2!!.setBackgroundResource(R.drawable.tab_white)
        task3!!.setBackgroundResource(R.drawable.tab_white)
        task4!!.setBackgroundResource(R.drawable.tab_white)

        when (pos) {
            1 -> {
                task1!!.setTextColor(getColor(R.color.white))
                task1!!.setBackgroundResource(R.drawable.tab_black)
            }
            2 -> {
                task2!!.setTextColor(getColor(R.color.white))
                task2!!.setBackgroundResource(R.drawable.tab_black)
            }
            3 -> {
                task3!!.setTextColor(getColor(R.color.white))
                task3!!.setBackgroundResource(R.drawable.tab_black)
            }
            4 -> {
                task4!!.setTextColor(getColor(R.color.white))
                task4!!.setBackgroundResource(R.drawable.tab_black)
            }
        }
    }

}
