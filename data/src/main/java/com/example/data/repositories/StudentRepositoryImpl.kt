package com.example.data.repositories

import com.example.domain.entity.Student
import com.example.domain.entity.StudentSearch
import com.example.domain.repositories.StudentRepository
import io.reactivex.Completable
import io.reactivex.Observable

class StudentRepositoryImpl :StudentRepository {
    override  fun get():Observable<List<Student>>{
       var list =  listOf(
                Student("0", "Sergey", "Sergeev","","man",25),
                Student("1", "Michael", "Michailov","","man",35),
                Student("2", "Kate", "Michailova","","woman",27),
                Student("3", "Joan", "Ivanova","","woman",31))
               return Observable.just(list)
    }

    override fun search(search: StudentSearch): Observable<List<Student>> {

        var list =  listOf<Student>(
                Student("0", "Sergey", "Sergeev","","man",25),
                Student("2", "Kate", "Michailova","","woman",27))
        return Observable.just(list)
    }

    override fun update(student: Student): Completable {
        return Completable.complete()
    }

    override fun delete(studentId: String): Completable {
        return Completable.complete()
    }
}