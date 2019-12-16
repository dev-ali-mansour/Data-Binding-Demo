package dev.alimansour.databindingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dev.alimansour.databindingdemo.databinding.ActivityMainBinding
import dev.alimansour.databindingdemo.model.Student


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val mStudent = Student("Ali Mansour", "dev.ali.mansour@gmail.com")
        binding.student = mStudent
    }
}
