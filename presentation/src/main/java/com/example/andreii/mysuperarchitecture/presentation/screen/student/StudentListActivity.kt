package com.example.andreii.mysuperarchitecture.presentation.screen.student

import android.arch.lifecycle.ViewModelProviders
import com.example.andreii.mysuperarchitecture.R
import com.example.andreii.mysuperarchitecture.databinding.ActivityStudentListBinding
import com.example.andreii.mysuperarchitecture.presentation.base.BaseMvvmActivity

class StudentListActivity : BaseMvvmActivity<
        StudentListViewModel
        , StudentRouter,
        ActivityStudentListBinding>() {

    override fun provideRouter(): StudentRouter {
        return StudentRouter(this)
    }

    override fun provideLayourId(): Int = R.layout.activity_student_list

    override fun provideViewModel(): StudentListViewModel {
        return ViewModelProviders.of(this).get(StudentListViewModel::class.java)

   }
}