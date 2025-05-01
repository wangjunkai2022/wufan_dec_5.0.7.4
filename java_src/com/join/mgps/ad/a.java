package com.join.mgps.ad;

import android.app.Activity;
import android.content.Context;
import com.MApplication;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.papa.sim.statistic.Event;
import java.util.Map;
/* compiled from: AdManager.java */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: o  reason: collision with root package name */
    private static a f39631o = null;

    /* renamed from: p  reason: collision with root package name */
    public static final int f39632p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f39633q = 2;

    /* renamed from: r  reason: collision with root package name */
    public static final int f39634r = 3;

    /* renamed from: s  reason: collision with root package name */
    public static final int f39635s = 4;

    /* renamed from: t  reason: collision with root package name */
    public static final int f39636t = 5;

    /* renamed from: u  reason: collision with root package name */
    public static final int f39637u = 7;

    /* renamed from: v  reason: collision with root package name */
    public static final int f39638v = 8;

    /* renamed from: w  reason: collision with root package name */
    public static final int f39639w = 9;

    /* renamed from: a  reason: collision with root package name */
    private z f39640a;

    /* renamed from: b  reason: collision with root package name */
    private h f39641b;

    /* renamed from: c  reason: collision with root package name */
    private l f39642c;

    /* renamed from: d  reason: collision with root package name */
    private s f39643d;

    /* renamed from: e  reason: collision with root package name */
    private Context f39644e;

    /* renamed from: f  reason: collision with root package name */
    private String f39645f;

    /* renamed from: g  reason: collision with root package name */
    private String f39646g;

    /* renamed from: h  reason: collision with root package name */
    private String f39647h;

    /* renamed from: i  reason: collision with root package name */
    private String f39648i;

    /* renamed from: j  reason: collision with root package name */
    private String f39649j;

    /* renamed from: k  reason: collision with root package name */
    private String f39650k;

    /* renamed from: l  reason: collision with root package name */
    private int f39651l = 1;

    /* renamed from: m  reason: collision with root package name */
    private boolean f39652m = false;

    /* renamed from: n  reason: collision with root package name */
    private n f39653n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdManager.java */
    /* renamed from: com.join.mgps.ad.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class C0338a extends z {

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f39654s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0338a(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f39654s = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            if (a.this.f39653n != null) {
                a.this.f39653n.a(str, i4, i5);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
            if (a.this.f39653n != null) {
                a.this.f39653n.b(z4);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void c(String str) {
            super.c(str);
            if (a.this.f39653n != null) {
                a.this.f39653n.c(str);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
            MApplication.f1497x.G(true);
            if (a.this.f39653n != null) {
                a.this.f39653n.onADClick();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClose() {
            super.onADClose();
            if (a.this.f39653n != null) {
                a.this.f39653n.onADClose();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADExpose() {
            super.onADExpose();
            if (a.this.f39653n != null) {
                a.this.f39653n.onADExpose();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            if (a.this.f39653n != null) {
                a.this.f39653n.onADShow();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onError(int i4, String str) {
            super.onError(i4, str);
            if (a.this.f39653n != null) {
                a.this.f39653n.onError(i4, str);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f39654s);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onReward(Map<String, Object> map) {
            super.onReward(map);
            if (a.this.f39653n != null) {
                a.this.f39653n.onReward(map);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
            if (a.this.f39653n != null) {
                a.this.f39653n.onVideoCached();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoComplete() {
            super.onVideoComplete();
            if (a.this.f39653n != null) {
                a.this.f39653n.onVideoComplete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdManager.java */
    /* loaded from: classes4.dex */
    public class b extends h {

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f39656p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f39656p = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            if (a.this.f39653n != null) {
                a.this.f39653n.a(str, i4, i5);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
            if (a.this.f39653n != null) {
                a.this.f39653n.b(z4);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void c(String str) {
            super.c(str);
            if (a.this.f39653n != null) {
                a.this.f39653n.c(str);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
            MApplication.f1497x.G(true);
            if (a.this.f39653n != null) {
                a.this.f39653n.onADClick();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClose() {
            super.onADClose();
            if (a.this.f39653n != null) {
                a.this.f39653n.onADClose();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADExpose() {
            super.onADExpose();
            if (a.this.f39653n != null) {
                a.this.f39653n.onADExpose();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            if (a.this.f39653n != null) {
                a.this.f39653n.onADShow();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onError(int i4, String str) {
            super.onError(i4, str);
            if (a.this.f39653n != null) {
                a.this.f39653n.onError(i4, str);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f39656p);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onReward(Map<String, Object> map) {
            super.onReward(map);
            if (a.this.f39653n != null) {
                a.this.f39653n.onReward(map);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
            if (a.this.f39653n != null) {
                a.this.f39653n.onVideoCached();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoComplete() {
            super.onVideoComplete();
            if (a.this.f39653n != null) {
                a.this.f39653n.onVideoComplete();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdManager.java */
    /* loaded from: classes4.dex */
    public class c extends l {

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f39658s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f39658s = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            if (a.this.f39653n != null) {
                a.this.f39653n.a(str, i4, i5);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
            if (a.this.f39653n != null) {
                a.this.f39653n.b(z4);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void c(String str) {
            super.c(str);
            if (a.this.f39653n != null) {
                a.this.f39653n.c(str);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
            MApplication.f1497x.G(true);
            if (a.this.f39653n != null) {
                a.this.f39653n.onADClick();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClose() {
            super.onADClose();
            if (a.this.f39653n != null) {
                a.this.f39653n.onADClose();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADExpose() {
            super.onADExpose();
            if (a.this.f39653n != null) {
                a.this.f39653n.onADExpose();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            if (a.this.f39653n != null) {
                a.this.f39653n.onADShow();
            }
            l(Event.Stopad_GromoreSdk_VideoShow.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onError(int i4, String str) {
            super.onError(i4, str);
            if (a.this.f39653n != null) {
                a.this.f39653n.onError(i4, str);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f39658s);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onReward(Map<String, Object> map) {
            super.onReward(map);
            if (a.this.f39653n != null) {
                a.this.f39653n.onReward(map);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
            if (a.this.f39653n != null) {
                a.this.f39653n.onVideoCached();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoComplete() {
            super.onVideoComplete();
            if (a.this.f39653n != null) {
                a.this.f39653n.onVideoComplete();
            }
        }

        @Override // com.join.mgps.ad.l
        public void y() {
            super.y();
            l(Event.Stopad_GromoreSdk_Videoloading.name(), this.f39682f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdManager.java */
    /* loaded from: classes4.dex */
    public class d extends s {

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f39660r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f39660r = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            if (a.this.f39653n != null) {
                a.this.f39653n.a(str, i4, i5);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
            if (a.this.f39653n != null) {
                a.this.f39653n.b(z4);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void c(String str) {
            super.c(str);
            if (a.this.f39653n != null) {
                a.this.f39653n.c(str);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClick() {
            super.onADClick();
            MApplication.f1497x.G(true);
            if (a.this.f39653n != null) {
                a.this.f39653n.onADClick();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClose() {
            super.onADClose();
            if (a.this.f39653n != null) {
                a.this.f39653n.onADClose();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADExpose() {
            super.onADExpose();
            if (a.this.f39653n != null) {
                a.this.f39653n.onADExpose();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            if (a.this.f39653n != null) {
                a.this.f39653n.onADShow();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onError(int i4, String str) {
            super.onError(i4, str);
            if (a.this.f39653n != null) {
                a.this.f39653n.onError(i4, str);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f39660r);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onReward(Map<String, Object> map) {
            super.onReward(map);
            if (a.this.f39653n != null) {
                a.this.f39653n.onReward(map);
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
            if (a.this.f39653n != null) {
                a.this.f39653n.onVideoCached();
            }
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoComplete() {
            super.onVideoComplete();
            if (a.this.f39653n != null) {
                a.this.f39653n.onVideoComplete();
            }
        }
    }

    private a(Context context) {
        this.f39644e = context;
    }

    private void c(String str, String str2, boolean z4) {
        if (g2.h(str) || g2.h(str2)) {
            return;
        }
        if (this.f39641b != null && str2.equals(this.f39645f)) {
            h hVar = this.f39641b;
            if (hVar != null) {
                hVar.g();
                return;
            }
            return;
        }
        this.f39645f = str2;
        b bVar = new b(this.f39644e, str, str2, z4);
        this.f39641b = bVar;
        bVar.e();
    }

    private void d(String str, String str2, boolean z4) {
        if (g2.h(str) || g2.h(str2)) {
            return;
        }
        if (this.f39642c != null && str2.equals(this.f39649j)) {
            l lVar = this.f39642c;
            if (lVar != null) {
                lVar.g();
                return;
            }
            return;
        }
        this.f39649j = str2;
        c cVar = new c(this.f39644e, str, str2, z4);
        this.f39642c = cVar;
        cVar.e();
    }

    private void e(String str, String str2, boolean z4) {
        if (g2.h(str) || g2.h(str2)) {
            return;
        }
        if (this.f39643d != null && str2.equals(this.f39650k)) {
            s sVar = this.f39643d;
            if (sVar != null) {
                sVar.g();
                return;
            }
            return;
        }
        this.f39650k = str2;
        d dVar = new d(this.f39644e, str, str2, z4);
        this.f39643d = dVar;
        dVar.e();
    }

    private void f(String str, String str2, boolean z4) {
        if (g2.h(str) || g2.h(str2)) {
            return;
        }
        if (this.f39640a != null && str2.equals(this.f39646g)) {
            z zVar = this.f39640a;
            if (zVar != null) {
                zVar.g();
                return;
            }
            return;
        }
        this.f39646g = str2;
        C0338a c0338a = new C0338a(this.f39644e, str, str2, z4);
        this.f39640a = c0338a;
        c0338a.e();
    }

    public static a g(Context context) {
        if (f39631o == null) {
            f39631o = new a(context);
        }
        return f39631o;
    }

    public void b() {
        this.f39653n = null;
    }

    public void h(int i4, String str, String str2, n nVar) {
        this.f39653n = nVar;
        if (i4 == 2) {
            c(str, str2, false);
        } else if (i4 != 3 && i4 != 4) {
            if (i4 == 7) {
                d(str, str2, false);
            } else if (i4 == 9) {
                e(str, str2, false);
            } else {
                f(str, str2, false);
            }
        }
        this.f39651l = i4;
        this.f39652m = true;
    }

    public void i(Activity activity) {
        s sVar;
        l lVar;
        h hVar;
        z zVar;
        if (this.f39652m) {
            int i4 = this.f39651l;
            if (i4 == 1 && (zVar = this.f39640a) != null) {
                zVar.q(activity);
                return;
            } else if (i4 == 2 && (hVar = this.f39641b) != null) {
                hVar.q(activity);
                return;
            } else if (i4 == 7 && (lVar = this.f39642c) != null) {
                lVar.q(activity);
                return;
            } else if (i4 != 9 || (sVar = this.f39643d) == null) {
                return;
            } else {
                sVar.q(activity);
                return;
            }
        }
        l2.a(activity).b("please call method load before show");
    }
}
