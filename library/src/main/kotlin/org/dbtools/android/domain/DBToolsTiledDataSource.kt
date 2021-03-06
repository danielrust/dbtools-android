@file:Suppress("unused")

package org.dbtools.android.domain

import android.arch.paging.TiledDataSource

@Deprecated("Use DBToolsPositionalDataSource instead", ReplaceWith("DBToolsPositionalDataSource<T>", "org.dbtools.android.domain.DBToolsPositionalDataSource"))
abstract class DBToolsTiledDataSource<T>() : TiledDataSource<T>() {

    private val tableChangeListener = DBToolsTableChangeListener { invalidate() }

    constructor(tableChangeManager: KotlinAndroidBaseManager<*>, databaseName: String = tableChangeManager.getDatabaseName()) : this() {
        addTableChangeListener(tableChangeManager, databaseName)
    }

    constructor(tableChangeManagers: List<KotlinAndroidBaseManager<*>>) : this() {
        tableChangeManagers.forEach { tableChangeManager ->
            addTableChangeListener(tableChangeManager, tableChangeManager.getDatabaseName())
        }
    }

    @Throws(IllegalArgumentException::class)
    constructor(tableChangeManagers: List<KotlinAndroidBaseManager<*>>, databaseNames: List<String>) : this() {
        if (tableChangeManagers.size != databaseNames.size) {
            throw IllegalArgumentException("tableChangeManagers size must be equal to databaseNames size")
        }

        tableChangeManagers.zip(databaseNames).forEach { (tableChangeManager, databaseName) ->
            addTableChangeListener(tableChangeManager, databaseName)
        }
    }

    private fun addTableChangeListener(tableChangeManager: KotlinAndroidBaseManager<*>, databaseName: String) {
        tableChangeManager.addWeakTableChangeListener(tableChangeListener, databaseName)
    }
}