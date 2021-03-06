package org.dbtools.android.domain;

public abstract class RxAndroidBaseManagerReadOnly<T extends AndroidBaseRecord> extends RxAndroidBaseManager<T> {

    public RxAndroidBaseManagerReadOnly(AndroidDatabaseManager androidDatabaseManager) {
        super(androidDatabaseManager);
    }
}
