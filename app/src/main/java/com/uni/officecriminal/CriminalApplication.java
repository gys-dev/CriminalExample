package com.uni.officecriminal;

import android.app.Application;

import com.uni.officecriminal.model.DaoMaster;
import com.uni.officecriminal.model.DaoSession;

import org.greenrobot.greendao.database.Database;

public class CriminalApplication extends Application {
    private DaoSession daoSession;
    private static  CriminalApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        DBOpenHelper helper = new DBOpenHelper(this, "notes-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
        instance = this;
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
