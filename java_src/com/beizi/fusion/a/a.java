package com.beizi.fusion.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.beizi.fusion.g.af;
/* compiled from: AdSQLiteOpenHelper.java */
/* loaded from: classes2.dex */
public class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f6501a;

    private a(Context context) {
        super(context, "beizi_ad.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Context context) {
        if (f6501a == null) {
            synchronized (a.class) {
                if (f6501a == null) {
                    f6501a = new a(context.getApplicationContext());
                }
            }
        }
        return f6501a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        if (Build.VERSION.SDK_INT < 16 || i5 <= i4) {
            return;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("Sqlite_master", new String[]{"name"}, "type=?", new String[]{"table"}, null, null, null);
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    if (string != null && string.startsWith("T_")) {
                        af.c("BeiZis", "before alter table ");
                        sQLiteDatabase.execSQL("alter table " + string + " add column space_id");
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                if (cursor == null) {
                    return;
                }
            }
            cursor.close();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
