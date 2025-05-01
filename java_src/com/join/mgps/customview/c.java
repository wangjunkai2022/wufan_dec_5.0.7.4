package com.join.mgps.customview;

import android.content.Context;
import com.join.mgps.dto.ForumBean;
import org.androidannotations.api.a;
/* compiled from: ForumExtFuncPopWindow_.java */
/* loaded from: classes4.dex */
public final class c extends com.join.mgps.customview.b {
    private Object A;

    /* renamed from: z  reason: collision with root package name */
    private Context f48401z;

    /* compiled from: ForumExtFuncPopWindow_.java */
    /* loaded from: classes4.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ForumBean.ForumPostsBean f48402b;

        a(ForumBean.ForumPostsBean forumPostsBean) {
            this.f48402b = forumPostsBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.super.j(this.f48402b);
        }
    }

    /* compiled from: ForumExtFuncPopWindow_.java */
    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f48404b;

        b(String str) {
            this.f48404b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.super.r(this.f48404b);
        }
    }

    /* compiled from: ForumExtFuncPopWindow_.java */
    /* renamed from: com.join.mgps.customview.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class RunnableC0358c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f48406b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f48407c;

        RunnableC0358c(int i4, boolean z4) {
            this.f48406b = i4;
            this.f48407c = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.super.i(this.f48406b, this.f48407c);
        }
    }

    /* compiled from: ForumExtFuncPopWindow_.java */
    /* loaded from: classes4.dex */
    class d extends a.c {
        d(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                c.super.e();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* compiled from: ForumExtFuncPopWindow_.java */
    /* loaded from: classes4.dex */
    class e extends a.c {
        e(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                c.super.d();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* compiled from: ForumExtFuncPopWindow_.java */
    /* loaded from: classes4.dex */
    class f extends a.c {
        f(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                c.super.f();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    /* compiled from: ForumExtFuncPopWindow_.java */
    /* loaded from: classes4.dex */
    class g extends a.c {
        g(String str, long j4, String str2) {
            super(str, j4, str2);
        }

        @Override // org.androidannotations.api.a.c
        public void execute() {
            try {
                c.super.c();
            } catch (Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
            }
        }
    }

    private c(Context context) {
        super(context);
        this.f48401z = context;
        B();
    }

    public static c A(Context context, Object obj) {
        return new c(context, obj);
    }

    private void B() {
    }

    public static c z(Context context) {
        return new c(context);
    }

    public void C(Context context) {
        this.f48401z = context;
        B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.customview.b
    public void c() {
        org.androidannotations.api.a.l(new g("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.customview.b
    public void d() {
        org.androidannotations.api.a.l(new e("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.customview.b
    public void e() {
        org.androidannotations.api.a.l(new d("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.customview.b
    public void f() {
        org.androidannotations.api.a.l(new f("", 0L, ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.customview.b
    public void i(int i4, boolean z4) {
        org.androidannotations.api.b.e("", new RunnableC0358c(i4, z4), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.customview.b
    public void j(ForumBean.ForumPostsBean forumPostsBean) {
        org.androidannotations.api.b.e("", new a(forumPostsBean), 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.customview.b
    public void r(String str) {
        org.androidannotations.api.b.e("", new b(str), 0L);
    }

    private c(Context context, Object obj) {
        super(context);
        this.f48401z = context;
        this.A = obj;
        B();
    }
}
