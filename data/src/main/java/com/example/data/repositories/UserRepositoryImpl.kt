package com.example.data.repositories

import com.example.domain.entity.User
import com.example.domain.repositories.UserRepository
import io.reactivex.Observable

class UserRepositoryImpl : UserRepository {
    fun getUser(user: List<User>): String {
        val user = user.get(0).name
        return user
    }

    override fun get(): Observable<List<User>> {

        var list = listOf(
                User("0", "Дуэйн", "Джонсон"
                        , "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Dwayne_Johnson_2%2C_2013.jpg/267px-Dwayne_Johnson_2%2C_2013.jpg"
                        , "man", "46"),
                User("1", "Нив", "Кэмпбелл"
                        , "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Neve_Campbell_04_%2821268333696%29.jpg/250px-Neve_Campbell_04_%2821268333696%29.jpg"
                        , "woman", "45"),
                User("2", "Kate", "Michailova", "", "woman", "27"),
                User("3", "Joan", "Ivanova", "", "woman", "31"))
        return Observable.just(list)
    }


}