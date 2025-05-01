package com.tencent.stat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.tencent.stat.common.StatLogger;
import com.umeng.analytics.pro.aw;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class w extends SQLiteOpenHelper {
    public w(Context context) {
        super(context, com.tencent.stat.common.k.v(context), (SQLiteDatabase.CursorFactory) null, 3);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        StatLogger statLogger;
        Cursor cursor = null;
        String str = null;
        try {
            Cursor query = sQLiteDatabase.query(aw.f63382m, null, null, null, null, null, null);
            try {
                ContentValues contentValues = new ContentValues();
                if (query.moveToNext()) {
                    str = query.getString(0);
                    query.getInt(1);
                    query.getString(2);
                    query.getLong(3);
                    contentValues.put("uid", com.tencent.stat.common.k.c(str));
                }
                if (str != null) {
                    sQLiteDatabase.update(aw.f63382m, contentValues, "uid=?", new String[]{str});
                }
                query.close();
            } catch (Throwable th) {
                th = th;
                cursor = query;
                try {
                    statLogger = n.f63007e;
                    statLogger.e(th);
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        StatLogger statLogger;
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query(com.umeng.analytics.pro.f.ax, null, null, null, null, null, null);
            ArrayList<x> arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                arrayList.add(new x(cursor.getLong(0), cursor.getString(1), cursor.getInt(2), cursor.getInt(3)));
            }
            ContentValues contentValues = new ContentValues();
            for (x xVar : arrayList) {
                contentValues.put("content", com.tencent.stat.common.k.c(xVar.f63032b));
                sQLiteDatabase.update(com.umeng.analytics.pro.f.ax, contentValues, "event_id=?", new String[]{Long.toString(xVar.f63031a)});
            }
        } catch (Throwable th) {
            try {
                statLogger = n.f63007e;
                statLogger.e(th);
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("create table if not exists events(event_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, content TEXT, status INTEGER, send_count INTEGER, timestamp LONG)");
        sQLiteDatabase.execSQL("create table if not exists user(uid TEXT PRIMARY KEY, user_type INTEGER, app_ver TEXT, ts INTEGER)");
        sQLiteDatabase.execSQL("create table if not exists config(type INTEGER PRIMARY KEY NOT NULL, content TEXT, md5sum TEXT, version INTEGER)");
        sQLiteDatabase.execSQL("create table if not exists keyvalues(key TEXT PRIMARY KEY NOT NULL, value TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        StatLogger statLogger;
        statLogger = n.f63007e;
        statLogger.debug("upgrade DB from oldVersion " + i4 + " to newVersion " + i5);
        if (i4 == 1) {
            sQLiteDatabase.execSQL("create table if not exists keyvalues(key TEXT PRIMARY KEY NOT NULL, value TEXT)");
            a(sQLiteDatabase);
            b(sQLiteDatabase);
        }
        if (i4 == 2) {
            a(sQLiteDatabase);
            b(sQLiteDatabase);
        }
    }
}
