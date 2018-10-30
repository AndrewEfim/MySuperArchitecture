package com.example.domain.usecases

import com.example.domain.entity.User
import com.example.domain.repositories.UserRepository
import io.reactivex.Observable

class GetUserUseCase (private val userRepository: UserRepository):BaseUseCase() {
    fun get(): Observable<List<User>> {
        return userRepository.get()
    }


}