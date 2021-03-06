package com.gionee.sqliteoptimize.database.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.gionee.sqliteoptimize.database.entity.ChatImage;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CHAT_IMAGE.
*/
public class ChatImageDao extends AbstractDao<ChatImage, Long> {

    public static final String TABLENAME = "CHAT_IMAGE";

    /**
     * Properties of entity ChatImage.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property LocalPath = new Property(1, String.class, "localPath", false, "LOCAL_PATH");
        public final static Property LocalResz = new Property(2, String.class, "localResz", false, "LOCAL_RESZ");
        public final static Property Url = new Property(3, String.class, "url", false, "URL");
        public final static Property UrlResz = new Property(4, String.class, "urlResz", false, "URL_RESZ");
    };


    public ChatImageDao(DaoConfig config) {
        super(config);
    }
    
    public ChatImageDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'CHAT_IMAGE' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'LOCAL_PATH' TEXT," + // 1: localPath
                "'LOCAL_RESZ' TEXT," + // 2: localResz
                "'URL' TEXT," + // 3: url
                "'URL_RESZ' TEXT);"); // 4: urlResz
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'CHAT_IMAGE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ChatImage entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String localPath = entity.getLocalPath();
        if (localPath != null) {
            stmt.bindString(2, localPath);
        }
 
        String localResz = entity.getLocalResz();
        if (localResz != null) {
            stmt.bindString(3, localResz);
        }
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(4, url);
        }
 
        String urlResz = entity.getUrlResz();
        if (urlResz != null) {
            stmt.bindString(5, urlResz);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ChatImage readEntity(Cursor cursor, int offset) {
        ChatImage entity = new ChatImage( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // localPath
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // localResz
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // url
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // urlResz
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ChatImage entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLocalPath(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLocalResz(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUrl(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUrlResz(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ChatImage entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ChatImage entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
