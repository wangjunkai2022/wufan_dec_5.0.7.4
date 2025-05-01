package cn.sharesdk.framework.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import cn.sharesdk.framework.utils.SSDKLog;
/* compiled from: DBProvider.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f858b;

    /* renamed from: a  reason: collision with root package name */
    private a f859a = new a();

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f858b == null) {
                f858b = new b();
            }
            bVar = f858b;
        }
        return bVar;
    }

    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3) {
        SQLiteDatabase writableDatabase = this.f859a.getWritableDatabase();
        SSDKLog.b().a("Query table: %s", str);
        try {
            return writableDatabase.query(str, strArr, str2, strArr2, null, null, str3);
        } catch (Exception e5) {
            SSDKLog.b().b(e5, "when query database occur error table:%s,", str);
            return null;
        }
    }

    public long a(String str, ContentValues contentValues) {
        try {
            return this.f859a.getWritableDatabase().replace(str, null, contentValues);
        } catch (Exception e5) {
            SSDKLog.b().b(e5, "when insert database occur error table:%s,", str);
            return -1L;
        }
    }

    public int a(String str, String str2, String[] strArr) {
        int i4;
        try {
            i4 = this.f859a.getWritableDatabase().delete(str, str2, strArr);
        } catch (Exception e5) {
            e = e5;
            i4 = 0;
        }
        try {
            SSDKLog.b().a("Deleted %d rows from table: %s", Integer.valueOf(i4), str);
        } catch (Exception e6) {
            e = e6;
            SSDKLog.b().b(e, "when delete database occur error table:%s,", str);
            return i4;
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.database.Cursor] */
    public int a(String str) {
        Throwable th;
        Cursor cursor;
        Exception e5;
        ?? sb = new StringBuilder("select ");
        sb.append("count(*) from ");
        sb.append(str);
        int i4 = 0;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f859a.getClass().getMethod("getWritableDatabase", new Class[0]).invoke(this.f859a, new Object[0]);
                cursor = (Cursor) sQLiteDatabase.getClass().getDeclaredMethod("rawQuery", String.class, String[].class).invoke(sQLiteDatabase, sb.toString(), null);
                try {
                    boolean moveToNext = cursor.moveToNext();
                    sb = cursor;
                    if (moveToNext) {
                        i4 = cursor.getInt(0);
                        sb = cursor;
                    }
                } catch (Exception e6) {
                    e5 = e6;
                    SSDKLog.b().b(e5);
                    sb = cursor;
                    sb.close();
                    return i4;
                }
            } catch (Throwable th2) {
                th = th2;
                sb.close();
                throw th;
            }
        } catch (Exception e7) {
            cursor = null;
            e5 = e7;
        } catch (Throwable th3) {
            sb = 0;
            th = th3;
            sb.close();
            throw th;
        }
        sb.close();
        return i4;
    }
}
