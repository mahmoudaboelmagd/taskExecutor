package com.example.myapplication

import android.app.Activity
import java.util.concurrent.Executors

/**
 * Created by Aboelmagd on 25/06/2022
 */

class ExecutorPresentor(activity: Activity) : Contract.Presenter {
    var activity = activity as MainActivity

    var tasksList: MutableList<Int> = ArrayList()

    init {
        (activity as MainActivity).initView()
    }

    fun taskExecutor(list: MutableList<Int>) {
        val executor = Executors.newScheduledThreadPool(2)
        for (item in list) {
            val counterThread = CounterThread(activity.taskView!!, activity, item)
            executor.execute(counterThread)
            list.remove(item)
        }
    }

    override fun onTaskOneClick() {
        tasksList.add(1)
        taskExecutor(tasksList)
    }

    override fun onTaskTwoClick() {
        tasksList.add(2)
        taskExecutor(tasksList)
    }

    override fun onTaskThreeClick() {
        tasksList.add(3)
        taskExecutor(tasksList)
    }

    override fun onTaskFourClick() {
        tasksList.add(4)
        taskExecutor(tasksList)
    }

}
