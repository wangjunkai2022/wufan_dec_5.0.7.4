package com.tencent.stat;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.stat.common.StatLogger;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes6.dex */
public class n {

    /* renamed from: e  reason: collision with root package name */
    private static StatLogger f63007e = com.tencent.stat.common.k.b();

    /* renamed from: f  reason: collision with root package name */
    private static n f63008f = null;

    /* renamed from: a  reason: collision with root package name */
    Handler f63009a;

    /* renamed from: d  reason: collision with root package name */
    private w f63012d;

    /* renamed from: b  reason: collision with root package name */
    volatile int f63010b = 0;

    /* renamed from: c  reason: collision with root package name */
    DeviceInfo f63011c = null;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<String, String> f63013g = new HashMap<>();

    private n(Context context) {
        this.f63009a = null;
        try {
            HandlerThread handlerThread = new HandlerThread("StatStore");
            handlerThread.start();
            StatLogger statLogger = f63007e;
            statLogger.w("Launch store thread:" + handlerThread);
            this.f63009a = new Handler(handlerThread.getLooper());
            Context applicationContext = context.getApplicationContext();
            w wVar = new w(applicationContext);
            this.f63012d = wVar;
            wVar.getWritableDatabase();
            this.f63012d.getReadableDatabase();
            b(applicationContext);
            c();
            f();
            this.f63009a.post(new o(this));
        } catch (Throwable th) {
            f63007e.e(th);
        }
    }

    public static synchronized n a(Context context) {
        n nVar;
        synchronized (n.class) {
            if (f63008f == null) {
                f63008f = new n(context);
            }
            nVar = f63008f;
        }
        return nVar;
    }

    public static n b() {
        return f63008f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(int i4) {
        try {
        } finally {
        }
        if (this.f63010b > 0 && i4 > 0) {
            f63007e.i("Load " + Integer.toString(this.f63010b) + " unsent events");
            ArrayList arrayList = new ArrayList();
            ArrayList<x> arrayList2 = new ArrayList();
            if (i4 == -1 || i4 > StatConfig.a()) {
                i4 = StatConfig.a();
            }
            this.f63010b -= i4;
            c(arrayList2, i4);
            f63007e.i("Peek " + Integer.toString(arrayList2.size()) + " unsent events.");
            if (!arrayList2.isEmpty()) {
                b(arrayList2, 2);
                for (x xVar : arrayList2) {
                    arrayList.add(xVar.f63032b);
                }
                d.b().b(arrayList, new u(this, arrayList2, i4));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(com.tencent.stat.a.e eVar, c cVar) {
        if (StatConfig.getMaxStoreEventCount() <= 0) {
            return;
        }
        this.f63012d.getWritableDatabase().beginTransaction();
        if (this.f63010b > StatConfig.getMaxStoreEventCount()) {
            f63007e.warn("Too many events stored in db.");
            this.f63010b -= this.f63012d.getWritableDatabase().delete(com.umeng.analytics.pro.f.ax, "event_id in (select event_id from events where timestamp in (select min(timestamp) from events) limit 1)", null);
        }
        ContentValues contentValues = new ContentValues();
        String c5 = com.tencent.stat.common.k.c(eVar.d());
        contentValues.put("content", c5);
        contentValues.put("send_count", "0");
        contentValues.put("status", Integer.toString(1));
        contentValues.put(UMCrash.SP_KEY_TIMESTAMP, Long.valueOf(eVar.b()));
        if (this.f63012d.getWritableDatabase().insert(com.umeng.analytics.pro.f.ax, null, contentValues) == -1) {
            f63007e.error("Failed to store event:" + c5);
        } else {
            this.f63010b++;
            this.f63012d.getWritableDatabase().setTransactionSuccessful();
            if (cVar != null) {
                cVar.a();
            }
        }
        try {
            this.f63012d.getWritableDatabase().endTransaction();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(b bVar) {
        boolean z4;
        long insert;
        Cursor cursor = null;
        try {
            String a5 = bVar.a();
            String a6 = com.tencent.stat.common.k.a(a5);
            ContentValues contentValues = new ContentValues();
            contentValues.put("content", bVar.f62924b.toString());
            contentValues.put("md5sum", a6);
            bVar.f62925c = a6;
            contentValues.put("version", Integer.valueOf(bVar.f62926d));
            Cursor query = this.f63012d.getReadableDatabase().query("config", null, null, null, null, null, null);
            while (true) {
                try {
                    if (!query.moveToNext()) {
                        z4 = false;
                        break;
                    } else if (query.getInt(0) == bVar.f62923a) {
                        z4 = true;
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    f63007e.e(th);
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
            if (true == z4) {
                insert = this.f63012d.getWritableDatabase().update("config", contentValues, "type=?", new String[]{Integer.toString(bVar.f62923a)});
            } else {
                contentValues.put("type", Integer.valueOf(bVar.f62923a));
                insert = this.f63012d.getWritableDatabase().insert("config", null, contentValues);
            }
            if (insert == -1) {
                f63007e.e("Failed to store cfg:" + a5);
            } else {
                f63007e.d("Sucessed to store cfg:" + a5);
            }
            query.close();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(List<x> list) {
        f63007e.i("Delete " + list.size() + " sent events in thread:" + Thread.currentThread());
        this.f63012d.getWritableDatabase().beginTransaction();
        Iterator<x> it2 = list.iterator();
        while (it2.hasNext()) {
            this.f63010b -= this.f63012d.getWritableDatabase().delete(com.umeng.analytics.pro.f.ax, "event_id = ?", new String[]{Long.toString(it2.next().f63031a)});
        }
        this.f63012d.getWritableDatabase().setTransactionSuccessful();
        this.f63010b = (int) DatabaseUtils.queryNumEntries(this.f63012d.getReadableDatabase(), com.umeng.analytics.pro.f.ax);
        try {
            this.f63012d.getWritableDatabase().endTransaction();
        } catch (SQLiteException e5) {
            f63007e.e((Exception) e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(List<x> list, int i4) {
        int update;
        f63007e.i("Update " + list.size() + " sending events to status:" + i4 + " in thread:" + Thread.currentThread());
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.toString(i4));
        this.f63012d.getWritableDatabase().beginTransaction();
        for (x xVar : list) {
            if (xVar.f63034d + 1 > StatConfig.getMaxSendRetryCount()) {
                this.f63010b -= this.f63012d.getWritableDatabase().delete(com.umeng.analytics.pro.f.ax, "event_id=?", new String[]{Long.toString(xVar.f63031a)});
            } else {
                contentValues.put("send_count", Integer.valueOf(xVar.f63034d + 1));
                f63007e.i("Update event:" + xVar.f63031a + " for content:" + contentValues);
                if (this.f63012d.getWritableDatabase().update(com.umeng.analytics.pro.f.ax, contentValues, "event_id=?", new String[]{Long.toString(xVar.f63031a)}) <= 0) {
                    f63007e.e("Failed to update db, error code:" + Integer.toString(update));
                }
            }
        }
        this.f63012d.getWritableDatabase().setTransactionSuccessful();
        this.f63010b = (int) DatabaseUtils.queryNumEntries(this.f63012d.getReadableDatabase(), com.umeng.analytics.pro.f.ax);
        try {
            this.f63012d.getWritableDatabase().endTransaction();
        } catch (SQLiteException e5) {
            f63007e.e((Exception) e5);
        }
    }

    private void c(List<x> list, int i4) {
        Cursor cursor = null;
        try {
            cursor = this.f63012d.getReadableDatabase().query(com.umeng.analytics.pro.f.ax, null, "status=?", new String[]{Integer.toString(1)}, null, null, "event_id", Integer.toString(i4));
            while (cursor.moveToNext()) {
                list.add(new x(cursor.getLong(0), com.tencent.stat.common.k.d(cursor.getString(1)), cursor.getInt(2), cursor.getInt(3)));
            }
        } catch (Throwable th) {
            try {
                f63007e.e(th);
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("status", (Integer) 1);
            this.f63012d.getWritableDatabase().update(com.umeng.analytics.pro.f.ax, contentValues, "status=?", new String[]{Long.toString(2L)});
            this.f63010b = (int) DatabaseUtils.queryNumEntries(this.f63012d.getReadableDatabase(), com.umeng.analytics.pro.f.ax);
            StatLogger statLogger = f63007e;
            statLogger.i("Total " + this.f63010b + " unsent events.");
        } catch (Throwable th) {
            f63007e.e(th);
        }
    }

    private void f() {
        Cursor cursor = null;
        try {
            cursor = this.f63012d.getReadableDatabase().query("keyvalues", null, null, null, null, null, null);
            while (cursor.moveToNext()) {
                this.f63013g.put(cursor.getString(0), cursor.getString(1));
            }
        } catch (Throwable th) {
            try {
                f63007e.e(th);
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    public int a() {
        return this.f63010b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i4) {
        this.f63009a.post(new v(this, i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(com.tencent.stat.a.e eVar, c cVar) {
        if (StatConfig.isEnableStatService()) {
            try {
                if (Thread.currentThread().getId() == this.f63009a.getLooper().getThread().getId()) {
                    b(eVar, cVar);
                } else {
                    this.f63009a.post(new r(this, eVar, cVar));
                }
            } catch (Throwable th) {
                f63007e.e(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        if (bVar == null) {
            return;
        }
        this.f63009a.post(new s(this, bVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<x> list) {
        try {
            if (Thread.currentThread().getId() == this.f63009a.getLooper().getThread().getId()) {
                b(list);
            } else {
                this.f63009a.post(new q(this, list));
            }
        } catch (SQLiteException e5) {
            f63007e.e((Exception) e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(List<x> list, int i4) {
        try {
            if (Thread.currentThread().getId() == this.f63009a.getLooper().getThread().getId()) {
                b(list, i4);
            } else {
                this.f63009a.post(new p(this, list, i4));
            }
        } catch (Throwable th) {
            f63007e.e(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[Catch: all -> 0x0193, TryCatch #0 {all -> 0x0193, blocks: (B:9:0x001c, B:11:0x0026, B:13:0x0043, B:17:0x0058, B:19:0x0062, B:20:0x0064, B:22:0x006c, B:24:0x006f, B:26:0x0073, B:38:0x0096, B:40:0x0099, B:46:0x00d1, B:48:0x0103, B:50:0x0116, B:53:0x0126, B:55:0x0130, B:57:0x0136, B:59:0x014c, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:30:0x007e, B:32:0x0084, B:35:0x008e), top: B:81:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[Catch: all -> 0x0193, TryCatch #0 {all -> 0x0193, blocks: (B:9:0x001c, B:11:0x0026, B:13:0x0043, B:17:0x0058, B:19:0x0062, B:20:0x0064, B:22:0x006c, B:24:0x006f, B:26:0x0073, B:38:0x0096, B:40:0x0099, B:46:0x00d1, B:48:0x0103, B:50:0x0116, B:53:0x0126, B:55:0x0130, B:57:0x0136, B:59:0x014c, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:30:0x007e, B:32:0x0084, B:35:0x008e), top: B:81:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103 A[Catch: all -> 0x0193, TryCatch #0 {all -> 0x0193, blocks: (B:9:0x001c, B:11:0x0026, B:13:0x0043, B:17:0x0058, B:19:0x0062, B:20:0x0064, B:22:0x006c, B:24:0x006f, B:26:0x0073, B:38:0x0096, B:40:0x0099, B:46:0x00d1, B:48:0x0103, B:50:0x0116, B:53:0x0126, B:55:0x0130, B:57:0x0136, B:59:0x014c, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:30:0x007e, B:32:0x0084, B:35:0x008e), top: B:81:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0116 A[Catch: all -> 0x0193, TryCatch #0 {all -> 0x0193, blocks: (B:9:0x001c, B:11:0x0026, B:13:0x0043, B:17:0x0058, B:19:0x0062, B:20:0x0064, B:22:0x006c, B:24:0x006f, B:26:0x0073, B:38:0x0096, B:40:0x0099, B:46:0x00d1, B:48:0x0103, B:50:0x0116, B:53:0x0126, B:55:0x0130, B:57:0x0136, B:59:0x014c, B:41:0x00b0, B:43:0x00b6, B:45:0x00bc, B:30:0x007e, B:32:0x0084, B:35:0x008e), top: B:81:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.tencent.stat.DeviceInfo b(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.stat.n.b(android.content.Context):com.tencent.stat.DeviceInfo");
    }

    void c() {
        this.f63009a.post(new t(this));
    }
}
