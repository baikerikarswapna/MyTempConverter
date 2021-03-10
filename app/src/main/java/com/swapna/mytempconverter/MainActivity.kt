package com.swapna.mytempconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.swapna.core.MyCore
import com.swapna.temperatureconverter.MyTempConverter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyCore.printCoreMessage("Hello core")
        MyTempConverter.printTemp(32)
    }
}