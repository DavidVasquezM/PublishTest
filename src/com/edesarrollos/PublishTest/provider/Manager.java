package com.edesarrollos.PublishTest.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.edesarrollos.PublishTest.db.Ads;
import com.edesarrollos.PublishTest.db.User;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by edesarrollos on 28/07/2015.
 */
public class Manager extends OrmLiteSqliteOpenHelper {

    public Manager(Context context) {
        super(context, Contract.DATABASE_NAME, null, Contract.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        try {
            TableUtils.createTableIfNotExists(connectionSource, User.class);
            TableUtils.createTableIfNotExists(connectionSource, Ads.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        try {
            TableUtils.dropTable(connectionSource, User.class, true);
            TableUtils.createTable(connectionSource, User.class);
            TableUtils.dropTable(connectionSource, Ads.class, true);
            TableUtils.createTable(connectionSource, Ads.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
