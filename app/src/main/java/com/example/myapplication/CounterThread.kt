package com.example.myapplication

import android.app.Activity
import androidx.appcompat.widget.AppCompatTextView
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Aboelmagd on 25/06/2022
 */

class CounterThread(var taskView: AppCompatTextView, var activity: Activity, var taskNum: Int) :
    Thread() {

    var textDisplay: String = taskView.text.toString()

    override fun run() {
        super.run()

        (activity as MainActivity).runOnUiThread {

            val date = SimpleDateFormat("yyyy-MM-dd  HH:mm", Locale.getDefault()).format(Date())

            textDisplay += "$date Task $taskNum\n"
            taskView.text = textDisplay

            sleep(1000) // sleep every task by 3 second

        }

    }
}
