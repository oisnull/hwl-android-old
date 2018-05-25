package com.hwl.beta.db.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import org.greenrobot.greendao.AbstractDaoMaster;
import org.greenrobot.greendao.database.StandardDatabase;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseOpenHelper;
import org.greenrobot.greendao.identityscope.IdentityScopeType;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/**
 * Master of DAO (schema version 22): knows all DAOs.
 */
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 22;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(Database db, boolean ifNotExists) {
        ChatGroupMessageDao.createTable(db, ifNotExists);
        ChatRecordMessageDao.createTable(db, ifNotExists);
        ChatUserMessageDao.createTable(db, ifNotExists);
        ChatUserSettingDao.createTable(db, ifNotExists);
        CircleDao.createTable(db, ifNotExists);
        CircleCommentDao.createTable(db, ifNotExists);
        CircleImageDao.createTable(db, ifNotExists);
        CircleLikeDao.createTable(db, ifNotExists);
        CircleMessageDao.createTable(db, ifNotExists);
        FriendDao.createTable(db, ifNotExists);
        FriendRequestDao.createTable(db, ifNotExists);
        GroupInfoDao.createTable(db, ifNotExists);
        GroupUserInfoDao.createTable(db, ifNotExists);
        NearCircleDao.createTable(db, ifNotExists);
        NearCircleCommentDao.createTable(db, ifNotExists);
        NearCircleImageDao.createTable(db, ifNotExists);
        NearCircleLikeDao.createTable(db, ifNotExists);
        NearCircleMessageDao.createTable(db, ifNotExists);
    }

    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(Database db, boolean ifExists) {
        ChatGroupMessageDao.dropTable(db, ifExists);
        ChatRecordMessageDao.dropTable(db, ifExists);
        ChatUserMessageDao.dropTable(db, ifExists);
        ChatUserSettingDao.dropTable(db, ifExists);
        CircleDao.dropTable(db, ifExists);
        CircleCommentDao.dropTable(db, ifExists);
        CircleImageDao.dropTable(db, ifExists);
        CircleLikeDao.dropTable(db, ifExists);
        CircleMessageDao.dropTable(db, ifExists);
        FriendDao.dropTable(db, ifExists);
        FriendRequestDao.dropTable(db, ifExists);
        GroupInfoDao.dropTable(db, ifExists);
        GroupUserInfoDao.dropTable(db, ifExists);
        NearCircleDao.dropTable(db, ifExists);
        NearCircleCommentDao.dropTable(db, ifExists);
        NearCircleImageDao.dropTable(db, ifExists);
        NearCircleLikeDao.dropTable(db, ifExists);
        NearCircleMessageDao.dropTable(db, ifExists);
    }

    /**
     * WARNING: Drops all table on Upgrade! Use only during development.
     * Convenience method using a {@link DevOpenHelper}.
     */
    public static DaoSession newDevSession(Context context, String name) {
        Database db = new DevOpenHelper(context, name).getWritableDb();
        DaoMaster daoMaster = new DaoMaster(db);
        return daoMaster.newSession();
    }

    public DaoMaster(SQLiteDatabase db) {
        this(new StandardDatabase(db));
    }

    public DaoMaster(Database db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(ChatGroupMessageDao.class);
        registerDaoClass(ChatRecordMessageDao.class);
        registerDaoClass(ChatUserMessageDao.class);
        registerDaoClass(ChatUserSettingDao.class);
        registerDaoClass(CircleDao.class);
        registerDaoClass(CircleCommentDao.class);
        registerDaoClass(CircleImageDao.class);
        registerDaoClass(CircleLikeDao.class);
        registerDaoClass(CircleMessageDao.class);
        registerDaoClass(FriendDao.class);
        registerDaoClass(FriendRequestDao.class);
        registerDaoClass(GroupInfoDao.class);
        registerDaoClass(GroupUserInfoDao.class);
        registerDaoClass(NearCircleDao.class);
        registerDaoClass(NearCircleCommentDao.class);
        registerDaoClass(NearCircleImageDao.class);
        registerDaoClass(NearCircleLikeDao.class);
        registerDaoClass(NearCircleMessageDao.class);
    }

    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }

    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }

    /**
     * Calls {@link #createAllTables(Database, boolean)} in {@link #onCreate(Database)} -
     */
    public static abstract class OpenHelper extends DatabaseOpenHelper {
        public OpenHelper(Context context, String name) {
            super(context, name, SCHEMA_VERSION);
        }

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(Database db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }

    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name) {
            super(context, name);
        }

        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(Database db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

}
