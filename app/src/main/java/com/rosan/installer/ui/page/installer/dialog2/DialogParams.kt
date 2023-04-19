package com.rosan.installer.ui.page.installer.dialog2

private val emptyInnerParams = DialogInnerParams("empty")

data class DialogParams(
    val icon: DialogInnerParams = emptyInnerParams,
    val title: DialogInnerParams = emptyInnerParams,
    val subtitle: DialogInnerParams = emptyInnerParams,
    val text: DialogInnerParams = emptyInnerParams,
    val content: DialogInnerParams = emptyInnerParams,
    val buttons: DialogInnerParams = emptyInnerParams
)
