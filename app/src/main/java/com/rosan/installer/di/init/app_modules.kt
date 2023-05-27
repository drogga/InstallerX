package com.rosan.installer.di.init

import com.rosan.installer.di.appModule
import com.rosan.installer.di.installerModule
import com.rosan.installer.di.reflectModule
import com.rosan.installer.di.resModule
import com.rosan.installer.di.roomModule
import com.rosan.installer.di.serializationModule
import com.rosan.installer.di.viewModelModule
import com.rosan.installer.di.workerModule

val appModules = listOf(
    roomModule,
    viewModelModule,
    serializationModule,
    appModule,
    resModule,
    workerModule,
    installerModule,
    reflectModule
)
