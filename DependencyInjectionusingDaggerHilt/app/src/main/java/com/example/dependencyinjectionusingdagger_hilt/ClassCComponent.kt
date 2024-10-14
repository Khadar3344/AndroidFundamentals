package com.example.dependencyinjectionusingdagger_hilt

import dagger.Component

@Component(modules = [ClassABModule::class])
interface ClassCComponent {
    fun getClassCInstance(): ClassC
}