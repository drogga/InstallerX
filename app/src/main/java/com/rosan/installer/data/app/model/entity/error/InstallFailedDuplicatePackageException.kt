package com.rosan.installer.data.app.model.entity.error

class InstallFailedDuplicatePackageException : Exception {
    constructor() : super()

    constructor(message: String?) : super(message)
}