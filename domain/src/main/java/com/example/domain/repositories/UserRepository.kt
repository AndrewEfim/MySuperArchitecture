package com.example.domain.repositories

import com.example.domain.entity.Student
import com.example.domain.entity.User
import io.reactivex.Observable

interface UserRepository: BaseRepository {
    fun get(): Observable<List<User>>

  //  fun getUser(user:List<User>): String
    //fun getUser(int i):Observable<List<User>>{return Observable.just(List<User>.get()) }

}