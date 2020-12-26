package com.uni.officecriminal;

import android.content.Context;

import com.uni.officecriminal.model.DaoMaster;

import org.greenrobot.greendao.database.Database;

import java.sql.Array;
import java.util.ArrayList;

public class DBOpenHelper extends DaoMaster.OpenHelper {
    public DBOpenHelper(Context context, String name) {
        super(context, name);
    }

    @Override
    public void onCreate(Database db) {
        super.onCreate(db);
    }

    @Override
    public void onUpgrade(Database db, int oldVersion, int newVersion) {
        super.onUpgrade(db, oldVersion, newVersion);
        if (newVersion > oldVersion) {
            RunSQL(db);
        }
    }

    public void RunSQL(Database db) {
        ArrayList<String> querys = new ArrayList<String>();
        querys.add("INSERT INTO \"CRIMINAL\" VALUES (1,'Chao2', 'Ban2', 33, 'Imag2');");
        querys.add("INSERT INTO \"CRIMINAL\" VALUES (2, 'Chao', 'Ban', 33, 'Imag');");
        querys.add("INSERT INTO \"CRIMINAL\" VALUES (3,'Toi La Nguoi Viet Nam','Nguoi dan ong tu hao noi toi la nguoi viet nam',1,'iamg.sds');");
        querys.add("INSERT INTO \"CRIMINAL\" VALUES (4,'Sad thing is i can do','Meo meo meo',33,'Imang');");
        querys.add("INSERT INTO \"CRIMINAL\" VALUES (5,'Tran Duc Y','Tran Duc Y La Doanh Nhan Noi Tieng',1,'hehe');");
        querys.add("INSERT INTO \"CRIMINAL\" VALUES (6,'Meo Con Vui Ve','CHu Meo Con Vui Ve Di CHoi Voi CHu',1,'Imag');");

        for (String query: querys) {
            db.execSQL(query);
        }
    }
}
