package com.join.mgps.Util;

import android.content.Context;
import org.androidannotations.api.a;
/* compiled from: StartGame_.java */
/* loaded from: classes3.dex */
public final class a2 extends z1 {

    /* renamed from: d  reason: collision with root package name */
    private static a2 f27655d;

    /* renamed from: b  reason: collision with root package name */
    private Context f27656b;

    /* renamed from: c  reason: collision with root package name */
    private Object f27657c;

    /* compiled from: StartGame_.java */
    /* loaded from: classes3.dex */
    class a extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27658b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f27659c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, long j4, String str2, Context context, String str3) {
            super(str, j4, str2);
            this.f27658b = context;
            this.f27659c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                a2.super.c(this.f27658b, this.f27659c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* compiled from: StartGame_.java */
    /* loaded from: classes3.dex */
    class b extends a.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27661b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f27662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j4, String str2, Context context, String str3) {
            super(str, j4, str2);
            this.f27661b = context;
            this.f27662c = str3;
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                a2.super.d(this.f27661b, this.f27662c);
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    private a2(Context context) {
        this.f27656b = context;
    }

    public static a2 g(Context context) {
        if (f27655d == null) {
            a4.c c5 = a4.c.c(null);
            a2 a2Var = new a2(context.getApplicationContext());
            f27655d = a2Var;
            a2Var.h();
            a4.c.c(c5);
        }
        return f27655d;
    }

    private void h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.Util.z1
    public void c(Context context, String str) {
        org.androidannotations.api.a.l(new a("", 0L, "", context, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.Util.z1
    public void d(Context context, String str) {
        org.androidannotations.api.a.l(new b("", 0L, "", context, str));
    }

    private a2(Context context, Object obj) {
        this.f27656b = context;
        this.f27657c = obj;
    }
}
