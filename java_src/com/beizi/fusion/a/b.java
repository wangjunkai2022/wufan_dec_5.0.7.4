package com.beizi.fusion.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.y;
import com.beizi.fusion.model.EventItem;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DaoManager.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f6502a;

    /* renamed from: b  reason: collision with root package name */
    private a f6503b;

    private b(Context context) {
        this.f6503b = a.a(context);
    }

    public static b a(Context context) {
        if (f6502a == null) {
            synchronized (b.class) {
                if (f6502a == null) {
                    f6502a = new b(context);
                }
            }
        }
        return f6502a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized boolean b(java.lang.String r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            if (r12 != 0) goto L6
            monitor-exit(r11)
            return r0
        L6:
            r1 = 0
            com.beizi.fusion.a.a r2 = r11.f6503b     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            android.database.sqlite.SQLiteDatabase r3 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            java.lang.String r2 = "count('*') as c"
            java.lang.String[] r5 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            java.lang.String r6 = "type=? and name =?"
            r2 = 2
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            java.lang.String r2 = "table"
            r7[r0] = r2     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            java.lang.String r12 = r12.trim()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            r2 = 1
            r7[r2] = r12     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            java.lang.String r4 = "Sqlite_master"
            r8 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            boolean r12 = r1.moveToNext()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            if (r12 == 0) goto L50
            int r12 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            r3.<init>()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            java.lang.String r4 = "DaoManager count:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            r3.append(r12)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4e
            if (r12 <= 0) goto L50
            r0 = 1
            goto L50
        L47:
            r12 = move-exception
            if (r1 == 0) goto L4d
            r1.close()     // Catch: java.lang.Throwable -> L54
        L4d:
            throw r12     // Catch: java.lang.Throwable -> L54
        L4e:
            if (r1 == 0) goto L57
        L50:
            r1.close()     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        L57:
            monitor-exit(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.a.b.b(java.lang.String):boolean");
    }

    private synchronized void c(String str) {
        SQLiteDatabase writableDatabase = this.f6503b.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            String str2 = "create table " + str + "(id integer primary key autoincrement,event_code nvarchar,channel nvarchar,space_id nvarchar," + UMCrash.SP_KEY_TIMESTAMP + " nvarchar)";
            af.a("DaoManager", "sql createTable tableName = " + str2);
            writableDatabase.execSQL(str2);
            writableDatabase.setTransactionSuccessful();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        writableDatabase.endTransaction();
    }

    private synchronized void d(String str) {
        boolean b5 = b(str);
        af.a("DaoManager", "sql table is exist == " + b5);
        if (!b5) {
            c(str);
        }
    }

    private synchronized int e(String str) {
        int i4;
        i4 = 0;
        Cursor query = this.f6503b.getWritableDatabase().query(str, null, null, null, null, null, null);
        if (query != null) {
            i4 = query.getCount();
            query.close();
        }
        return i4;
    }

    private EventItem a(Cursor cursor) {
        EventItem eventItem = new EventItem();
        eventItem.setCode(cursor.getString(cursor.getColumnIndex("event_code")));
        eventItem.setChannel(cursor.getString(cursor.getColumnIndex("channel")));
        eventItem.setSpaceId(cursor.getString(cursor.getColumnIndex("space_id")));
        eventItem.setTimeStamp(cursor.getString(cursor.getColumnIndex(UMCrash.SP_KEY_TIMESTAMP)));
        return eventItem;
    }

    private ContentValues a(EventItem eventItem) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_code", eventItem.getCode());
        contentValues.put("channel", eventItem.getChannel());
        contentValues.put("space_id", eventItem.getSpaceId());
        contentValues.put(UMCrash.SP_KEY_TIMESTAMP, eventItem.getTimeStamp());
        return contentValues;
    }

    public synchronized void a(String str, EventItem eventItem) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = "T_" + str;
        d(str2);
        int e5 = e(str2);
        long insert = this.f6503b.getWritableDatabase().insert(str2, null, a(eventItem));
        StringBuilder sb = new StringBuilder();
        sb.append("insert before size == ");
        sb.append(e5);
        sb.append(", insert data success = ");
        sb.append(insert != -1);
        af.a("DaoManager", sb.toString());
        a(str2, Math.max(86400000L, y.b(str) * 2));
    }

    public synchronized List<EventItem> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = "T_" + str;
        d(str2);
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f6503b.getWritableDatabase().query(str2, null, null, null, null, null, null);
        if (query != null && query.getCount() > 0) {
            query.moveToFirst();
            do {
                arrayList.add(a(query));
            } while (query.moveToNext());
            query.close();
        }
        return arrayList;
    }

    public synchronized void a(String str, long j4) {
        long currentTimeMillis = System.currentTimeMillis() - j4;
        int e5 = e(str);
        if (e5 > 0 && j4 > 0 && currentTimeMillis > 0) {
            boolean z4 = true;
            int delete = this.f6503b.getWritableDatabase().delete(str, "timestamp<=?", new String[]{String.valueOf(currentTimeMillis)});
            StringBuilder sb = new StringBuilder();
            sb.append("start first delete data success = ");
            if (delete <= 0) {
                z4 = false;
            }
            sb.append(z4);
            sb.append(", intervalTime = ");
            sb.append(j4);
            af.a("DaoManager", sb.toString());
        }
        if (e5 >= 1000) {
            this.f6503b.getWritableDatabase().execSQL("delete from " + str + " where rowid in(select rowid from " + str + " order by id limit 200)");
            af.a("DaoManager", "start second delete data");
        }
    }
}
