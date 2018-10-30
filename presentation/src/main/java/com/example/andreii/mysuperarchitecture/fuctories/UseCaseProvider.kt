package com.example.andreii.mysuperarchitecture.fuctories

import com.example.data.repositories.StudentRepositoryImpl
import com.example.data.repositories.UserRepositoryImpl
import com.example.domain.usecases.GetStudentUseCase
import com.example.domain.usecases.GetUserUseCase
import com.example.domain.usecases.SearchStudentUseCase

object UseCaseProvider {

//    fun provideGetStudentUseCase():GetStudentUseCase{
//        val repository = StudentRepositoryImpl()
//        val useCase = GetStudentUseCase(repository)
//        return useCase
//    }
//    fun provideSearchStudentUseCase():SearchStudentUseCase{
//        return SearchStudentUseCase(StudentRepositoryImpl())
//    }
//
    fun provideGetUserUseCase():GetUserUseCase{
        val repository = UserRepositoryImpl()

        val useCase = GetUserUseCase(repository)
        return useCase
    }

}