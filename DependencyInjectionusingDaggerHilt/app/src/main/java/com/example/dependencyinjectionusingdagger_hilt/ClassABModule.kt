package com.example.dependencyinjectionusingdagger_hilt

import dagger.Module
import dagger.Provides

@Module
object ClassABModule {

    @Provides
    fun providesClassA(): ClassA {
        return ClassA()
    }

    @Provides
    fun providesClassB(): ClassB {
        return ClassB()
    }
}