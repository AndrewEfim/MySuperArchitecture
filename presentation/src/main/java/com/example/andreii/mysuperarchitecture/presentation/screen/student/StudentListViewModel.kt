package com.example.andreii.mysuperarchitecture.presentation.screen.student

import android.databinding.ObservableField
import com.example.andreii.mysuperarchitecture.fuctories.UseCaseProvider
import com.example.andreii.mysuperarchitecture.presentation.base.BaseViewModel
import io.reactivex.rxkotlin.subscribeBy

class StudentListViewModel() : BaseViewModel<StudentRouter>() {
//    private val getStudentUseCase = UseCaseProvider
//            .provideGetStudentUseCase()
//
//    private val searchStudentUseCase = UseCaseProvider
//            .provideSearchStudentUseCase()

    val studentSize = ObservableField<String>("No data")

    init {

            }
        }


