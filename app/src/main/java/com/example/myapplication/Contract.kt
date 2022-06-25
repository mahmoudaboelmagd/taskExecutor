package com.example.myapplication

/**
 * Created by Aboelmagd on 25/06/2022
 */

class Contract {
    interface View {
        fun initView()
    }

    interface Presenter {
        fun onTaskOneClick()
        fun onTaskTwoClick()
        fun onTaskThreeClick()
        fun onTaskFourClick()
    }

}
