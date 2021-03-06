package com.gionee.sqliteoptimize.database.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.gionee.sqliteoptimize.database.entity.GroupInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table GROUP_INFO.
*/
public class GroupInfoDao extends AbstractDao<GroupInfo, Long> {

    public static final String TABLENAME = "GROUP_INFO";

    /**
     * Properties of entity GroupInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Gid = new Property(0, long.class, "gid", true, "GID");
        public final static Property GroupSeq = new Property(1, int.class, "groupSeq", false, "GROUP_SEQ");
        public final static Property GroupName = new Property(2, String.class, "groupName", false, "GROUP_NAME");
        public final static Property GroupAvatar = new Property(3, String.class, "groupAvatar", false, "GROUP_AVATAR");
        public final static Property CreateTime = new Property(4, int.class, "createTime", false, "CREATE_TIME");
        public final static Property Creator = new Property(5, int.class, "creator", false, "CREATOR");
        public final static Property GroupMemNum = new Property(6, int.class, "groupMemNum", false, "GROUP_MEM_NUM");
        public final static Property GroupDescribe = new Property(7, String.class, "groupDescribe", false, "GROUP_DESCRIBE");
        public final static Property Flag = new Property(8, int.class, "flag", false, "FLAG");
        public final static Property Adminer = new Property(9, int.class, "adminer", false, "ADMINER");
    };


    public GroupInfoDao(DaoConfig config) {
        super(config);
    }
    
    public GroupInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'GROUP_INFO' (" + //
                "'GID' INTEGER PRIMARY KEY NOT NULL ," + // 0: gid
                "'GROUP_SEQ' INTEGER NOT NULL ," + // 1: groupSeq
                "'GROUP_NAME' TEXT," + // 2: groupName
                "'GROUP_AVATAR' TEXT," + // 3: groupAvatar
                "'CREATE_TIME' INTEGER NOT NULL ," + // 4: createTime
                "'CREATOR' INTEGER NOT NULL ," + // 5: creator
                "'GROUP_MEM_NUM' INTEGER NOT NULL ," + // 6: groupMemNum
                "'GROUP_DESCRIBE' TEXT," + // 7: groupDescribe
                "'FLAG' INTEGER NOT NULL ," + // 8: flag
                "'ADMINER' INTEGER NOT NULL );"); // 9: adminer
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'GROUP_INFO'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, GroupInfo entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getGid());
        stmt.bindLong(2, entity.getGroupSeq());
 
        String groupName = entity.getGroupName();
        if (groupName != null) {
            stmt.bindString(3, groupName);
        }
 
        String groupAvatar = entity.getGroupAvatar();
        if (groupAvatar != null) {
            stmt.bindString(4, groupAvatar);
        }
        stmt.bindLong(5, entity.getCreateTime());
        stmt.bindLong(6, entity.getCreator());
        stmt.bindLong(7, entity.getGroupMemNum());
 
        String groupDescribe = entity.getGroupDescribe();
        if (groupDescribe != null) {
            stmt.bindString(8, groupDescribe);
        }
        stmt.bindLong(9, entity.getFlag());
        stmt.bindLong(10, entity.getAdminer());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public GroupInfo readEntity(Cursor cursor, int offset) {
        GroupInfo entity = new GroupInfo( //
            cursor.getLong(offset + 0), // gid
            cursor.getInt(offset + 1), // groupSeq
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // groupName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // groupAvatar
            cursor.getInt(offset + 4), // createTime
            cursor.getInt(offset + 5), // creator
            cursor.getInt(offset + 6), // groupMemNum
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // groupDescribe
            cursor.getInt(offset + 8), // flag
            cursor.getInt(offset + 9) // adminer
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, GroupInfo entity, int offset) {
        entity.setGid(cursor.getLong(offset + 0));
        entity.setGroupSeq(cursor.getInt(offset + 1));
        entity.setGroupName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setGroupAvatar(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCreateTime(cursor.getInt(offset + 4));
        entity.setCreator(cursor.getInt(offset + 5));
        entity.setGroupMemNum(cursor.getInt(offset + 6));
        entity.setGroupDescribe(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setFlag(cursor.getInt(offset + 8));
        entity.setAdminer(cursor.getInt(offset + 9));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(GroupInfo entity, long rowId) {
        entity.setGid(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(GroupInfo entity) {
        if(entity != null) {
            return entity.getGid();
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
