package com.example.andreii.mysuperarchitecture.presentation.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import com.example.andreii.mysuperarchitecture.BR



abstract class BaseMvvmActivity<VM:BaseViewModel<R>,R:BaseRouter<*>,B: ViewDataBinding> :BaseActivity() {

    protected lateinit var viewModel: VM
    protected  lateinit var binding:B
    public lateinit var router:R
    abstract  fun provideViewModel():VM
    abstract  fun  provideRouter():R
    abstract  fun provideLayourId():Int

//    var myHandler: MyHandlers = MyHandlers()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = provideViewModel()
        binding =DataBindingUtil.setContentView(this,provideLayourId())
        binding.setVariable(BR.viewModel,viewModel)
       // binding.setVariable(BR.viewModel,viewModel)
        router = provideRouter()
  //      binding.setVariable(BR.myHandler,myHandler)

    }

    override fun onResume() {
        super.onResume()
        viewModel.addRouter(router)
    }
    override  fun onPause(){
        super.onPause()
        viewModel.removeRouter()
    }
}