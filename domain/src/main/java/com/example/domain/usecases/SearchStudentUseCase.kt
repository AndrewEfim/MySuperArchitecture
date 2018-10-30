package com.example.domain.usecases

import com.example.domain.entity.Student
import com.example.domain.entity.StudentSearch
import com.example.domain.repositories.StudentRepository
import io.reactivex.Observable

class SearchStudentUseCase (private val studentRepository: StudentRepository):BaseUseCase() {
    fun search(searchStudent:StudentSearch):Observable<List<Student>>{
        return studentRepository.search(searchStudent)
    }
}