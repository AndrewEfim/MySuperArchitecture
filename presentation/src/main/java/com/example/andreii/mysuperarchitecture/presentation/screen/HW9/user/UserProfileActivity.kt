package com.example.andreii.mysuperarchitecture.presentation.screen.HW9.user

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProviders
import com.example.andreii.mysuperarchitecture.R
import com.example.andreii.mysuperarchitecture.databinding.ActivityUserProfileBinding
import com.example.andreii.mysuperarchitecture.presentation.base.BaseMvvmActivity

@SuppressLint("Registered")
class UserProfileActivity : BaseMvvmActivity<
        UserProfileViewModel
        , UserRouter
        , ActivityUserProfileBinding>() {



    override fun provideViewModel(): UserProfileViewModel {
        return ViewModelProviders.of(this).get(UserProfileViewModel::class.java)
    }

    override fun provideRouter(): UserRouter {
        return UserRouter(this)
    }

    override fun provideLayourId(): Int = R.layout.activity_user_profile

}