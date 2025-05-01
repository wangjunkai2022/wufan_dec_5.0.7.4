package com.umeng.analytics.process;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: UMProcessDBManager.java */
/* loaded from: classes6.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f63999a;

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentHashMap<String, a> f64000b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private Context f64001c;

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(Context context) {
        if (f63999a == null) {
            synchronized (c.class) {
                if (f63999a == null) {
                    f63999a = new c();
                }
            }
        }
        c cVar = f63999a;
        cVar.f64001c = context;
        return cVar;
    }

    private a c(String str) {
        if (this.f64000b.get(str) == null) {
            a a5 = a.a(this.f64001c, str);
            this.f64000b.put(str, a5);
            return a5;
        }
        return this.f64000b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void b(String str) {
        c(str).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UMProcessDBManager.java */
    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private AtomicInteger f64002a = new AtomicInteger();

        /* renamed from: b  reason: collision with root package name */
        private SQLiteOpenHelper f64003b;

        /* renamed from: c  reason: collision with root package name */
        private SQLiteDatabase f64004c;

        private a() {
        }

        static a a(Context context, String str) {
            Context appContext = UMGlobalContext.getAppContext(context);
            a aVar = new a();
            aVar.f64003b = b.a(appContext, str);
            return aVar;
        }

        synchronized void b() {
            try {
                if (this.f64002a.decrementAndGet() == 0) {
                    this.f64004c.close();
                }
            } catch (Throwable unused) {
            }
        }

        synchronized SQLiteDatabase a() {
            if (this.f64002a.incrementAndGet() == 1) {
                this.f64004c = this.f64003b.getWritableDatabase();
            }
            return this.f64004c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized SQLiteDatabase a(String str) {
        return c(str).a();
    }
}
