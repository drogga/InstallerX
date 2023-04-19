package com.rosan.installer.ui.page.installer.dialog2

import com.rosan.installer.data.installer.repo.InstallerRepo

sealed class DialogViewAction {
    data class CollectRepo(val repo: InstallerRepo) : DialogViewAction()
    object Close : DialogViewAction()
    object Analyse : DialogViewAction()
    object InstallChoice : DialogViewAction()
    object InstallPrepare : DialogViewAction()
    object Install : DialogViewAction()
    object Background : DialogViewAction()
}