package com.beizi.ad.internal.b.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.beizi.ad.internal.b.k;
import com.beizi.ad.internal.b.p;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
/* compiled from: DatabaseSourceInfoStorage.java */
/* loaded from: classes2.dex */
class a extends SQLiteOpenHelper implements c {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f5776a = {"_id", "url", "length", IMediaFormat.KEY_MIME};

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        k.a(context);
    }

    @Override // com.beizi.ad.internal.b.b.c
    public p a(String str) {
        Throwable th;
        Cursor cursor;
        k.a(str);
        p pVar = null;
        try {
            cursor = getReadableDatabase().query("SourceInfo", f5776a, "url=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        pVar = a(cursor);
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
            return pVar;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        k.a(sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }

    @Override // com.beizi.ad.internal.b.b.c
    public void a(String str, p pVar) {
        k.a(str, pVar);
        boolean z4 = a(str) != null;
        ContentValues a5 = a(pVar);
        if (z4) {
            getWritableDatabase().update("SourceInfo", a5, "url=?", new String[]{str});
        } else {
            getWritableDatabase().insert("SourceInfo", null, a5);
        }
    }

    private p a(Cursor cursor) {
        return new p(cursor.getString(cursor.getColumnIndexOrThrow("url")), cursor.getInt(cursor.getColumnIndexOrThrow("length")), cursor.getString(cursor.getColumnIndexOrThrow(IMediaFormat.KEY_MIME)));
    }

    private ContentValues a(p pVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", pVar.f5830a);
        contentValues.put("length", Integer.valueOf(pVar.f5831b));
        contentValues.put(IMediaFormat.KEY_MIME, pVar.f5832c);
        return contentValues;
    }
}
