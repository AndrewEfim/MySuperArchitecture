package com.example.andreii.mysuperarchitecture.presentation.screen.HW9.user

import android.databinding.ObservableField
import android.graphics.Color
import android.util.Log
import android.view.View
import com.example.andreii.mysuperarchitecture.presentation.base.BaseViewModel
import com.example.domain.entity.User
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class UserProfileViewModel : BaseViewModel<UserRouter>() {

    private val TAG = "myLog"
            //    private val getUserUseCase = UseCaseProvider.provideGetUserUseCase()
    var userId = ObservableField<String>("no data")
    var genderColor = ObservableField<Int>(0)
    var userName = ObservableField<String>("no data")
    var userSurName = ObservableField<String>("no data")
    var userAge = ObservableField<String>("no data")
    var userGender = ObservableField<String>("no data")
    var userImageUrl = ObservableField<String>("no data")


    fun workWithObservable() {

        Observable.just(User("0", "Дуэйн", "Джонсон", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Dwayne_Johnson_2%2C_2013.jpg/267px-Dwayne_Johnson_2%2C_2013.jpg", "man", "46"),
                User("1", "Нив", "Кэмпбелл", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Neve_Campbell_04_%2821268333696%29.jpg/250px-Neve_Campbell_04_%2821268333696%29.jpg", "woman", "45"))
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<User> {
                    override fun onSubscribe(d: Disposable) {

                    }

                    override fun onNext(user: User) {

                        userName.set(user.name)
                        userSurName.set(user.surname)
                        userAge.set(user.age)
                        userGender.set(user.gender)
                        userImageUrl.set(user.imageurl)
                        userId.set(user.id)
                        changeColor()
                        Log.d(TAG, "name" + userName.get())

                    }

                    override fun onError(e: Throwable) {

                    }

                    override fun onComplete() {

                    }
                })
    }

    init {
        workWithObservable()
        Log.d(TAG, "workWithObservable()" + genderColor)
    }
    fun changeId(view: View) {

        if (userGender.get().equals("woman")) {
            userGender.set("man")
            userName.set("Дуэйн")
            userAge.set("46")
            userSurName.set("Джонсон")
            userImageUrl.set("https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/Dwayne_Johnson_2%2C_2013.jpg/267px-Dwayne_Johnson_2%2C_2013.jpg")
            changeColor()

            Log.d(TAG, "my Handler position  if" + userGender.get())
        } else {
            userGender.set("woman")
            userName.set("Нив")
            userImageUrl
                    .set("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2d/Neve_Campbell_04_%2821268333696%29.jpg/250px-Neve_Campbell_04_%2821268333696%29.jpg")
            userAge.set("45")
            userSurName.set("Кэмпбелл")
            changeColor()
            Log.d(TAG, "my Handler position  else" + userGender.get())
        }

    }

    fun changeColor() {
        if (userGender.get().equals("man")) {
            genderColor.set(Color.BLUE)
            Log.d(TAG, "colorBlue" + genderColor.get())

        } else if (userGender.get().equals("woman")) {
            genderColor.set(Color.RED)
            Log.d(TAG, "colorRED" + genderColor.get())
        }
    }

}