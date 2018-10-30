package com.example.domain.usecases

import com.example.domain.repositories.StudentRepository
import io.reactivex.Completable

class DeleteStudentUseCase (private val studentRepository: StudentRepository): BaseUseCase() {
    fun delete (studentId:String):Completable{
        return studentRepository.delete(studentId)
    }
}