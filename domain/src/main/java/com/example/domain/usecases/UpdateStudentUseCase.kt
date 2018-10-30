package com.example.domain.usecases

import com.example.domain.entity.Student
import com.example.domain.repositories.StudentRepository
import io.reactivex.Completable

class UpdateStudentUseCase (private  val studentRepository: StudentRepository):BaseUseCase() {
    fun update(student:Student):Completable{
        return studentRepository.update(student)
    }
}