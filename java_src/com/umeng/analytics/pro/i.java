package com.umeng.analytics.pro;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: UMDBManager.java */
/* loaded from: classes6.dex */
class i {

    /* renamed from: b  reason: collision with root package name */
    private static SQLiteOpenHelper f63784b;

    /* renamed from: d  reason: collision with root package name */
    private static Context f63785d;

    /* renamed from: a  reason: collision with root package name */
    private AtomicInteger f63786a;

    /* renamed from: c  reason: collision with root package name */
    private SQLiteDatabase f63787c;

    /* compiled from: UMDBManager.java */
    /* loaded from: classes6.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final i f63788a = new i();

        private a() {
        }
    }

    public static i a(Context context) {
        if (f63785d == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f63785d = applicationContext;
            f63784b = h.a(applicationContext);
        }
        return a.f63788a;
    }

    public synchronized void b() {
        try {
            if (this.f63786a.decrementAndGet() == 0) {
                this.f63787c.close();
            }
        } catch (Throwable unused) {
        }
    }

    private i() {
        this.f63786a = new AtomicInteger();
    }

    public synchronized SQLiteDatabase a() {
        if (this.f63786a.incrementAndGet() == 1) {
            this.f63787c = f63784b.getWritableDatabase();
        }
        return this.f63787c;
    }
}
