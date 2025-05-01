package com.danikula.videocache.sourcestorage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.danikula.videocache.n;
import com.danikula.videocache.r;
/* compiled from: DatabaseSourceInfoStorage.java */
/* loaded from: classes2.dex */
class a extends SQLiteOpenHelper implements c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f10143b = "SourceInfo";

    /* renamed from: c  reason: collision with root package name */
    private static final String f10144c = "_id";

    /* renamed from: d  reason: collision with root package name */
    private static final String f10145d = "url";

    /* renamed from: f  reason: collision with root package name */
    private static final String f10147f = "mime";

    /* renamed from: h  reason: collision with root package name */
    private static final String f10149h = "CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);";

    /* renamed from: e  reason: collision with root package name */
    private static final String f10146e = "length";

    /* renamed from: g  reason: collision with root package name */
    private static final String[] f10148g = {"_id", "url", f10146e, "mime"};

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        n.d(context);
    }

    private ContentValues b(r rVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", rVar.f10139a);
        contentValues.put(f10146e, Long.valueOf(rVar.f10140b));
        contentValues.put("mime", rVar.f10141c);
        return contentValues;
    }

    private r d(Cursor cursor) {
        return new r(cursor.getString(cursor.getColumnIndexOrThrow("url")), cursor.getLong(cursor.getColumnIndexOrThrow(f10146e)), cursor.getString(cursor.getColumnIndexOrThrow("mime")));
    }

    @Override // com.danikula.videocache.sourcestorage.c
    public void a(String str, r rVar) {
        n.a(str, rVar);
        boolean z4 = get(str) != null;
        ContentValues b5 = b(rVar);
        if (z4) {
            getWritableDatabase().update(f10143b, b5, "url=?", new String[]{str});
        } else {
            getWritableDatabase().insert(f10143b, null, b5);
        }
    }

    @Override // com.danikula.videocache.sourcestorage.c
    public r get(String str) {
        Throwable th;
        Cursor cursor;
        n.d(str);
        r rVar = null;
        try {
            cursor = getReadableDatabase().query(f10143b, f10148g, "url=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        rVar = d(cursor);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return rVar;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        n.d(sQLiteDatabase);
        sQLiteDatabase.execSQL(f10149h);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }

    @Override // com.danikula.videocache.sourcestorage.c
    public void release() {
        close();
    }
}
