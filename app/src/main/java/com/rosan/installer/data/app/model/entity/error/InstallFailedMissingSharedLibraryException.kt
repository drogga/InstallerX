package com.rosan.installer.data.app.model.entity.error

class InstallFailedMissingSharedLibraryException : Exception {
    constructor() : super()

    constructor(message: String?) : super(message)
}