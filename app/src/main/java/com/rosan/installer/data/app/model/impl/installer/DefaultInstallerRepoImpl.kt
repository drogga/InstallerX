package com.rosan.installer.data.app.model.impl.installer

import android.os.IBinder

class DefaultInstallerRepoImpl : IBinderInstallerRepoImpl() {
    override suspend fun iBinderWrapper(iBinder: IBinder): IBinder = iBinder
}