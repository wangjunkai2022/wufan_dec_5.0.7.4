package com.aggmoread.sdk.z.b.c;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.aggmoread.sdk.z.a.d;
import com.aggmoread.sdk.z.a.g.e;
import com.aggmoread.sdk.z.a.l.c;
import com.aggmoread.sdk.z.a.l.e;
import com.aggmoread.sdk.z.a.l.f;
import com.aggmoread.sdk.z.a.t.b;
import com.aggmoread.sdk.z.a.t.c;
import com.aggmoread.sdk.z.b.a.a;
import com.aggmoread.sdk.z.b.e.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* loaded from: classes2.dex */
public class b extends com.aggmoread.sdk.z.a.b implements c, c.InterfaceC0082c {

    /* renamed from: a  reason: collision with root package name */
    private a.C0083a.C0084a f2666a;

    /* renamed from: b  reason: collision with root package name */
    private f f2667b;

    /* renamed from: c  reason: collision with root package name */
    private com.aggmoread.sdk.z.b.a.a f2668c;

    /* renamed from: f  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.t.c f2671f;

    /* renamed from: g  reason: collision with root package name */
    private com.aggmoread.sdk.z.b.e.a f2672g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2673h;

    /* renamed from: i  reason: collision with root package name */
    private WeakReference<Activity> f2674i;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f2669d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2670e = false;

    /* renamed from: j  reason: collision with root package name */
    private a.b f2675j = new C0089b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.aggmoread.sdk.z.a.j.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.aggmoread.sdk.z.a.g.c f2676b;

        a(com.aggmoread.sdk.z.a.g.c cVar) {
            this.f2676b = cVar;
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void a() {
            super.a();
            d.c("DSPNVEIFACEIMPL", "apkIsDownLoading  ");
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void a(long j4) {
            super.a(j4);
            d.c("DSPNVEIFACEIMPL", "onApkInstalled  ");
            com.aggmoread.sdk.z.a.q.a.a("onApkInstalled", b.this.f2666a.f2632o, this.f2676b);
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void a(long j4, int i4, String str) {
            super.a(j4, i4, str);
            d.c("DSPNVEIFACEIMPL", "onApkInstalledError  ");
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void b() {
            super.b();
            d.c("DSPNVEIFACEIMPL", "onStartDownload  ");
            com.aggmoread.sdk.z.a.q.a.a("onStartDownload", b.this.f2666a.f2627j, this.f2676b);
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void b(long j4) {
            super.b(j4);
            d.c("DSPNVEIFACEIMPL", "onDownloadSuccess  ");
            com.aggmoread.sdk.z.a.q.a.a("onDownloadCompleted", b.this.f2666a.f2631n, this.f2676b);
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void b(long j4, int i4, String str) {
            super.b(j4, i4, str);
            d.c("DSPNVEIFACEIMPL", "onDownloadFail  ");
        }

        @Override // com.aggmoread.sdk.z.a.j.c
        public void c(long j4) {
            super.c(j4);
            d.c("DSPNVEIFACEIMPL", "onStartApkInstaller  ");
            com.aggmoread.sdk.z.a.q.a.a("onStartApkInstaller", b.this.f2666a.f2628k, this.f2676b);
        }
    }

    /* renamed from: com.aggmoread.sdk.z.b.c.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0089b implements a.b {
        C0089b() {
        }

        @Override // com.aggmoread.sdk.z.b.e.a.b
        public void a() {
            b bVar = b.this;
            bVar.a(bVar.f2671f.f2572c);
        }

        @Override // com.aggmoread.sdk.z.b.e.a.b
        public void b() {
            if (b.this.f2672g != null) {
                b.this.f2672g.a();
                b.this.f2672g = null;
            }
        }

        @Override // com.aggmoread.sdk.z.b.e.a.b
        public void onRenderSuccess() {
            b.this.f2673h = true;
        }
    }

    public b(com.aggmoread.sdk.z.b.a.a aVar, a.C0083a.C0084a c0084a) {
        this.f2666a = c0084a;
        this.f2668c = aVar;
        aVar.d().h();
        UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.aggmoread.sdk.z.a.g.c cVar) {
        Intent a5;
        Context a6 = com.aggmoread.sdk.z.a.h.a.d().a();
        String str = this.f2666a.f2626i;
        if (!com.aggmoread.sdk.z.a.m.d.c(a6, str) || (a5 = com.aggmoread.sdk.z.a.m.d.a(a6, str)) == null) {
            a(this.f2666a.a(), cVar);
            return;
        }
        d.c("DSPNVEIFACEIMPL", "intent = " + a5);
        a5.addFlags(268435456);
        a6.startActivity(a5);
    }

    private void a(String str, com.aggmoread.sdk.z.a.g.c cVar) {
        try {
            a.C0083a.C0084a c0084a = this.f2666a;
            new com.aggmoread.sdk.z.a.j.b(this.f2668c.d().i(), this.f2668c.d().h(), new a(cVar)).a(str, c0084a.f2626i, c0084a.f2618a);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(ArrayList<View> arrayList) {
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            View view = arrayList.get(i4);
            if (view != null) {
                view.setFocusable(true);
                view.setClickable(true);
            }
        }
    }

    private void b(com.aggmoread.sdk.z.a.g.c cVar) {
        String str = this.f2666a.f2621d;
        if (TextUtils.isEmpty(str)) {
            this.f2667b.a(new e(50008, "跳转地址异常"));
            return;
        }
        d.c("DSPNVEIFACEIMPL", "startWebActivity = " + str);
        String a5 = com.aggmoread.sdk.z.a.q.a.a(str, cVar);
        d.c("DSPNVEIFACEIMPL", "startWebActivity final = " + a5);
        com.aggmoread.sdk.z.a.t.b.a(this.f2668c.d().i(), this.f2666a.f2618a, a5, b.a.f2569a);
    }

    private boolean d() {
        return this.f2669d && !this.f2670e;
    }

    private Activity e() {
        WeakReference<Activity> weakReference = this.f2674i;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void f() {
        d.c("DSPNVEIFACEIMPL", "retry shown = " + com.aggmoread.sdk.z.a.m.b.a(this.f2671f) + ", has " + this.f2669d);
        if (this.f2669d || !com.aggmoread.sdk.z.a.m.b.a(this.f2671f)) {
            return;
        }
        this.f2667b.onADExposed();
        com.aggmoread.sdk.z.a.q.a.a("onAdExposure", this.f2666a.f2629l);
        this.f2669d = true;
        this.f2671f.a();
    }

    @Override // com.aggmoread.sdk.z.a.l.c
    public View a(View view, List<View> list, f fVar) {
        if (!TextUtils.isEmpty(this.f2666a.f2633p)) {
            this.f2672g = new com.aggmoread.sdk.z.b.e.a(this.f2675j);
            Activity e5 = e();
            if (e5 == null && (view.getContext() instanceof Activity)) {
                e5 = (Activity) view.getContext();
            }
            this.f2672g.a(e5, this.f2666a.f2633p);
        }
        ArrayList<View> arrayList = new ArrayList<>();
        this.f2667b = fVar;
        if (list != null) {
            if (list.indexOf(view) == -1) {
                d.c("DSPNVEIFACEIMPL", "bindView enter, add clickable view");
                arrayList.add(view);
            }
            d.c("DSPNVEIFACEIMPL", "bindView enter, view = " + view + " , clickableViews size = " + list.size());
            arrayList.addAll(list);
        } else {
            arrayList.add(view);
        }
        a(arrayList);
        if (view instanceof com.aggmoread.sdk.z.a.t.c) {
            com.aggmoread.sdk.z.a.t.c cVar = (com.aggmoread.sdk.z.a.t.c) view;
            this.f2671f = cVar;
            cVar.a(this);
            d.c("DSPNVEIFACEIMPL", "bindView abort, title = " + getTitle());
            return view;
        }
        com.aggmoread.sdk.z.a.t.c cVar2 = new com.aggmoread.sdk.z.a.t.c(view.getContext());
        this.f2671f = cVar2;
        cVar2.a(this);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        this.f2671f.addView(view);
        return this.f2671f;
    }

    @Override // com.aggmoread.sdk.z.a.t.c.InterfaceC0082c
    public void a(int i4) {
        d.c("DSPNVEIFACEIMPL", "onWindowVisibilityChanged = " + i4);
        if (this.f2669d || i4 != 0) {
            return;
        }
        f();
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public void a(com.aggmoread.sdk.z.a.t.f fVar, com.aggmoread.sdk.z.a.s.c cVar, e.a aVar) {
    }

    @Override // com.aggmoread.sdk.z.a.l.b
    public List<String> b() {
        List<String> list = this.f2666a.f2624g;
        return list == null ? new ArrayList() : list;
    }

    @Override // com.aggmoread.sdk.z.a.t.c.InterfaceC0082c
    public void c() {
        d.c("DSPNVEIFACEIMPL", "dispatchDraw enter , SdkHelper.isShown(nativeAdViewExt) = " + com.aggmoread.sdk.z.a.m.b.a(this.f2671f));
        f();
    }

    @Override // com.aggmoread.sdk.z.a.l.b
    public String getDesc() {
        return this.f2666a.f2619b;
    }

    @Override // com.aggmoread.sdk.z.a.l.b
    public String getIconUrl() {
        String str = this.f2666a.f2620c;
        return (str == null || !str.isEmpty()) ? getImageUrl() : this.f2666a.f2620c;
    }

    @Override // com.aggmoread.sdk.z.a.l.b
    public String getImageUrl() {
        List<String> list = this.f2666a.f2624g;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.aggmoread.sdk.z.a.l.b
    public String getTitle() {
        return this.f2666a.f2618a;
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public int getVideoCurrentPosition() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public int getVideoDuration() {
        return 0;
    }

    @Override // com.aggmoread.sdk.z.a.l.c
    public boolean isAppAd() {
        return this.f2666a.c();
    }

    @Override // com.aggmoread.sdk.z.a.l.c
    public boolean isVideoAd() {
        return false;
    }

    @Override // com.aggmoread.sdk.z.a.t.c.InterfaceC0082c
    public void onClick(View view) {
        List<String> a5;
        String str;
        if (!d()) {
            d.c("DSPNVEIFACEIMPL", "abort click , reason: hasExporsed = " + this.f2669d + " , isClicked = " + this.f2670e);
            return;
        }
        this.f2670e = true;
        this.f2667b.onADClicked();
        com.aggmoread.sdk.z.a.g.c cVar = this.f2671f.f2572c;
        d.c("DSPNVEIFACEIMPL", "feedsListFrameLayout2 adUrlDefine = " + cVar);
        float f5 = ((float) cVar.f2084a) / ((float) cVar.f2088e);
        float f6 = ((float) cVar.f2085b) / ((float) cVar.f2089f);
        d.c("DSPNVEIFACEIMPL", "action e x = " + f5 + " ,y = " + f6);
        com.aggmoread.sdk.z.a.q.a.a("onAdClick", this.f2666a.f2630m, cVar);
        String str2 = this.f2666a.f2622e;
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            try {
                Intent intent = new Intent();
                intent.setData(Uri.parse(this.f2666a.f2622e));
                intent.addFlags(268435456);
                this.f2668c.d().i().startActivity(intent);
                com.aggmoread.sdk.z.a.q.a.a("onStartAppSuccess", this.f2666a.a(3), cVar);
                d.c("DSPNVEIFACEIMPL", "onStartAppSuccess");
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                if (e5 instanceof ActivityNotFoundException) {
                    a5 = this.f2666a.a(0);
                    str = "onAppNotExist";
                } else {
                    a5 = this.f2666a.a(2);
                    str = "onStartAppFailed";
                }
                com.aggmoread.sdk.z.a.q.a.a(str, a5, cVar);
                d.c("DSPNVEIFACEIMPL", str);
            }
        }
        if (!this.f2666a.c()) {
            try {
                b(cVar);
            } catch (com.aggmoread.sdk.z.a.t.e e6) {
                e6.printStackTrace();
            }
        } else if (TextUtils.isEmpty(this.f2666a.f2633p)) {
            a(cVar);
        } else {
            if (this.f2672g == null) {
                d.c("DSPNVEIFACEIMPL", "PP null");
                this.f2672g = new com.aggmoread.sdk.z.b.e.a(this.f2675j);
                Activity e7 = e();
                if (e7 == null && (view.getContext() instanceof Activity)) {
                    e7 = (Activity) view.getContext();
                }
                this.f2672g.a(e7, this.f2666a.f2633p);
            }
            this.f2672g.a(view.getContext(), view);
        }
    }

    @Override // com.aggmoread.sdk.z.a.t.c.InterfaceC0082c
    public void onScrollChanged() {
        d.c("DSPNVEIFACEIMPL", "scroll ");
        f();
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public void pauseVideo() {
    }

    @Override // com.aggmoread.sdk.z.a.l.c
    public void resume() {
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public void resumeVideo() {
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public void startVideo() {
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public void stopVideo() {
    }
}
