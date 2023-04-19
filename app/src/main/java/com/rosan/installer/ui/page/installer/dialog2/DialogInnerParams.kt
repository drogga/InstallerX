package com.rosan.installer.ui.page.installer.dialog2

import androidx.compose.runtime.Composable

data class DialogInnerParams(
    val id: String,
    val content: (@Composable () -> Unit)? = null
)
