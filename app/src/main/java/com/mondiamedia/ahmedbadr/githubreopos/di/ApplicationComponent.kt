package com.mondiamedia.ahmedbadr.githubreopos.di

import com.mondiamedia.ahmedbadr.githubreopos.views.activities.MainActivity

import dagger.Component

@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
}