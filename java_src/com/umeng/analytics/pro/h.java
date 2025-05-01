package com.umeng.analytics.pro;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.umeng.analytics.pro.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UMDBCreater.java */
/* loaded from: classes6.dex */
public class h extends SQLiteOpenHelper {

    /* renamed from: b  reason: collision with root package name */
    private static Context f63781b;

    /* renamed from: a  reason: collision with root package name */
    private String f63782a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UMDBCreater.java */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final h f63783a = new h(h.f63781b, j.b(h.f63781b), g.f63715b, null, 2);

        private a() {
        }
    }

    public static h a(Context context) {
        if (f63781b == null) {
            f63781b = context.getApplicationContext();
        }
        return a.f63783a;
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f63782a = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f63782a = "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        if (!j.a(sQLiteDatabase, g.d.f63756a, "__av")) {
            j.a(sQLiteDatabase, g.d.f63756a, "__sp", "TEXT");
            j.a(sQLiteDatabase, g.d.f63756a, "__pp", "TEXT");
            j.a(sQLiteDatabase, g.d.f63756a, "__av", "TEXT");
            j.a(sQLiteDatabase, g.d.f63756a, "__vc", "TEXT");
        }
        if (!j.a(sQLiteDatabase, g.b.f63730a, "__av")) {
            j.a(sQLiteDatabase, g.b.f63730a, "__av", "TEXT");
            j.a(sQLiteDatabase, g.b.f63730a, "__vc", "TEXT");
        }
        if (j.a(sQLiteDatabase, g.a.f63719a, "__av")) {
            return;
        }
        j.a(sQLiteDatabase, g.a.f63719a, "__av", "TEXT");
        j.a(sQLiteDatabase, g.a.f63719a, "__vc", "TEXT");
    }

    private void f(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase, g.d.f63756a);
        a(sQLiteDatabase, g.b.f63730a);
        a(sQLiteDatabase, g.a.f63719a);
        a();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                c(sQLiteDatabase);
                d(sQLiteDatabase);
                b(sQLiteDatabase);
                a(sQLiteDatabase);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused2) {
            j.a(f63781b);
            if (sQLiteDatabase == null) {
                return;
            }
        } catch (Throwable unused3) {
            if (sQLiteDatabase == null) {
                return;
            }
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Throwable unused4) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        if (i5 <= i4 || i4 != 1) {
            return;
        }
        try {
            try {
                e(sQLiteDatabase);
            } catch (Exception unused) {
                f(sQLiteDatabase);
            }
        } catch (Exception unused2) {
            e(sQLiteDatabase);
        }
    }

    private h(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i4) {
        this(new e(context, str), str2, cursorFactory, i4);
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f63782a = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    private h(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i4) {
        super(context, TextUtils.isEmpty(str) ? g.f63715b : str, cursorFactory, i4);
        this.f63782a = null;
        a();
    }

    public void a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!j.a(g.d.f63756a, writableDatabase)) {
                c(writableDatabase);
            }
            if (!j.a(g.c.f63743a, writableDatabase)) {
                d(writableDatabase);
            }
            if (!j.a(g.b.f63730a, writableDatabase)) {
                b(writableDatabase);
            }
            if (j.a(g.a.f63719a, writableDatabase)) {
                return;
            }
            a(writableDatabase);
        } catch (Exception unused) {
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f63782a = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)";
            sQLiteDatabase.execSQL("create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)");
        } catch (SQLException unused) {
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        } catch (SQLException unused) {
        }
    }
}
