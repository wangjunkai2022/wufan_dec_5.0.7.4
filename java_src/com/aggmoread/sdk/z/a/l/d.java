package com.aggmoread.sdk.z.a.l;

import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.aggmoread.sdk.z.a.g.b;
import com.aggmoread.sdk.z.a.l.e;
import com.aggmoread.sdk.z.a.m.l;
import com.aggmoread.sdk.z.a.s.d;
import com.aggmoread.sdk.z.a.t.c;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* loaded from: classes2.dex */
public class d extends com.aggmoread.sdk.z.a.b implements com.aggmoread.sdk.z.a.l.c, e, View.OnClickListener, c.InterfaceC0082c {

    /* renamed from: i  reason: collision with root package name */
    static final String f2295i = d.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private b.a.C0056a f2296a;

    /* renamed from: b  reason: collision with root package name */
    private f f2297b;

    /* renamed from: c  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.g.b f2298c;

    /* renamed from: f  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.t.c f2301f;

    /* renamed from: g  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.s.d f2302g;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2299d = false;

    /* renamed from: e  reason: collision with root package name */
    private volatile int f2300e = 0;

    /* renamed from: h  reason: collision with root package name */
    private volatile long f2303h = 0;

    /* loaded from: classes2.dex */
    class a implements d.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f2304a;

        a(d dVar, e.a aVar) {
            this.f2304a = aVar;
        }

        @Override // com.aggmoread.sdk.z.a.s.d.j
        public void a(MediaPlayer mediaPlayer) {
            e.a aVar = this.f2304a;
            if (aVar != null) {
                aVar.a();
                this.f2304a.e();
            }
        }

        @Override // com.aggmoread.sdk.z.a.s.d.j
        public void a(boolean z4) {
        }

        @Override // com.aggmoread.sdk.z.a.s.d.j
        public void b(MediaPlayer mediaPlayer) {
        }

        @Override // com.aggmoread.sdk.z.a.s.d.j
        public void c(MediaPlayer mediaPlayer) {
        }

        @Override // com.aggmoread.sdk.z.a.s.d.j
        public void d(MediaPlayer mediaPlayer) {
            e.a aVar = this.f2304a;
            if (aVar != null) {
                aVar.d();
            }
        }

        @Override // com.aggmoread.sdk.z.a.s.d.j
        public void e(MediaPlayer mediaPlayer) {
            e.a aVar = this.f2304a;
            if (aVar != null) {
                aVar.e();
            }
        }

        @Override // com.aggmoread.sdk.z.a.s.d.j
        public void f(MediaPlayer mediaPlayer) {
            e.a aVar = this.f2304a;
            if (aVar != null) {
                aVar.f();
            }
        }

        @Override // com.aggmoread.sdk.z.a.s.d.j
        public void g(MediaPlayer mediaPlayer) {
        }
    }

    /* loaded from: classes2.dex */
    class b implements MediaPlayer.OnPreparedListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f2305a;

        b(d dVar, e.a aVar) {
            this.f2305a = aVar;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            e.a aVar = this.f2305a;
            if (aVar != null) {
                aVar.a(mediaPlayer.getDuration());
                this.f2305a.b();
            }
        }
    }

    /* loaded from: classes2.dex */
    class c implements MediaPlayer.OnCompletionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f2306a;

        c(d dVar, e.a aVar) {
            this.f2306a = aVar;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            e.a aVar = this.f2306a;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    /* renamed from: com.aggmoread.sdk.z.a.l.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0064d implements MediaPlayer.OnErrorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e.a f2307a;

        C0064d(d dVar, e.a aVar) {
            this.f2307a = aVar;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
            e.a aVar = this.f2307a;
            if (aVar != null) {
                aVar.a(new com.aggmoread.sdk.z.a.g.e(i4, "extra msg: " + i5));
                return false;
            }
            return false;
        }
    }

    public d(com.aggmoread.sdk.z.a.g.b bVar, b.a.C0056a c0056a) {
        this.f2296a = c0056a;
        this.f2298c = bVar;
        bVar.d().i();
        UUID.randomUUID().toString();
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

    private boolean d() {
        return this.f2299d && this.f2300e < 2 && System.currentTimeMillis() - this.f2303h > 5000;
    }

    private void f() {
        if (this.f2299d || !com.aggmoread.sdk.z.a.m.b.a(this.f2301f)) {
            return;
        }
        this.f2297b.onADExposed();
        com.aggmoread.sdk.z.a.q.a.a("onAdExposure", this.f2296a.f2076q);
        this.f2299d = true;
        this.f2301f.a();
    }

    @Override // com.aggmoread.sdk.z.a.l.c
    public View a(View view, List<View> list, f fVar) {
        view.getContext();
        ArrayList<View> arrayList = new ArrayList<>();
        this.f2297b = fVar;
        if (list != null) {
            if (list.indexOf(view) == -1) {
                com.aggmoread.sdk.z.a.d.c("JHAIMPTAG", "bindView enter, add clickable view");
                arrayList.add(view);
            }
            com.aggmoread.sdk.z.a.d.c("JHAIMPTAG", "bindView enter, view = " + view + " , clickableViews size = " + list.size());
            arrayList.addAll(list);
        } else {
            arrayList.add(view);
        }
        a(arrayList);
        if (view instanceof com.aggmoread.sdk.z.a.t.c) {
            com.aggmoread.sdk.z.a.t.c cVar = (com.aggmoread.sdk.z.a.t.c) view;
            this.f2301f = cVar;
            cVar.a(this);
            return view;
        }
        com.aggmoread.sdk.z.a.t.c cVar2 = new com.aggmoread.sdk.z.a.t.c(view.getContext());
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        this.f2301f = cVar2;
        cVar2.a(this);
        this.f2301f.addView(view);
        return this.f2301f;
    }

    @Override // com.aggmoread.sdk.z.a.t.c.InterfaceC0082c
    public void a(int i4) {
        com.aggmoread.sdk.z.a.d.c("JHAIMPTAG", "onWindowVisibilityChanged = " + i4);
        if (this.f2299d || i4 != 0) {
            return;
        }
        f();
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public void a(com.aggmoread.sdk.z.a.t.f fVar, com.aggmoread.sdk.z.a.s.c cVar, e.a aVar) {
        String str;
        if (this.f2301f == null) {
            str = "container shouldn't be null!";
        } else if (fVar == null) {
            str = "media view shouldn't be null!";
        } else if (fVar.getVisibility() != 0) {
            str = "media view should be visible!";
        } else if (!isVideoAd()) {
            str = "The native ad doesn't contain video!";
        } else if (com.aggmoread.sdk.z.a.m.b.a(this.f2301f, fVar)) {
            com.aggmoread.sdk.z.a.s.d b5 = fVar.b();
            com.aggmoread.sdk.z.a.s.a a5 = fVar.a();
            if (a5 instanceof com.aggmoread.sdk.z.a.s.b) {
                if (cVar == null && this.f2298c.d() != null) {
                    cVar = this.f2298c.d().l();
                }
                if (cVar != null) {
                    ((com.aggmoread.sdk.z.a.s.b) a5).b(cVar.a());
                }
            }
            if (b5 != null) {
                this.f2302g = b5;
                b5.a(new a(this, aVar));
                b5.a(new b(this, aVar));
                b5.a(new c(this, aVar));
                b5.a(new C0064d(this, aVar));
                String o4 = this.f2296a.o();
                if (TextUtils.isEmpty(o4)) {
                    return;
                }
                b5.a(o4);
                b5.requestFocus();
                b5.d();
                return;
            }
            return;
        } else {
            str = "The media view not in container !";
        }
        com.aggmoread.sdk.z.a.d.c("JHAIMPTAG", str);
    }

    @Override // com.aggmoread.sdk.z.a.l.b
    public List<String> b() {
        return this.f2296a.l();
    }

    @Override // com.aggmoread.sdk.z.a.t.c.InterfaceC0082c
    public void c() {
        f();
        String str = f2295i;
        com.aggmoread.sdk.z.a.d.c(str, "dispatchDraw enter , SdkHelper.isShown(nativeAdViewExt) = " + com.aggmoread.sdk.z.a.m.b.a(this.f2301f));
    }

    public int e() {
        return this.f2296a.n();
    }

    @Override // com.aggmoread.sdk.z.a.l.b
    public String getDesc() {
        List<String> g4 = this.f2296a.g();
        if (g4 == null || g4.size() <= 0) {
            return null;
        }
        return g4.get(0);
    }

    @Override // com.aggmoread.sdk.z.a.l.b
    public String getIconUrl() {
        List<String> k4 = this.f2296a.k();
        if (k4 == null || k4.size() <= 0) {
            return null;
        }
        return k4.get(0);
    }

    @Override // com.aggmoread.sdk.z.a.l.b
    public String getImageUrl() {
        List<String> l4 = this.f2296a.l();
        if (l4 == null || l4.size() <= 0) {
            return null;
        }
        return l4.get(0);
    }

    @Override // com.aggmoread.sdk.z.a.l.b
    public String getTitle() {
        return this.f2296a.f2062c;
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public int getVideoCurrentPosition() {
        com.aggmoread.sdk.z.a.s.d dVar = this.f2302g;
        if (dVar != null) {
            return dVar.f();
        }
        return 0;
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public int getVideoDuration() {
        com.aggmoread.sdk.z.a.s.d dVar = this.f2302g;
        if (dVar != null) {
            return dVar.e();
        }
        return 0;
    }

    @Override // com.aggmoread.sdk.z.a.l.c
    public boolean isAppAd() {
        return this.f2296a.r();
    }

    @Override // com.aggmoread.sdk.z.a.l.c
    public boolean isVideoAd() {
        return !TextUtils.isEmpty(this.f2296a.o());
    }

    @Override // android.view.View.OnClickListener, com.aggmoread.sdk.z.a.t.c.InterfaceC0082c
    public void onClick(View view) {
        if (!d()) {
            com.aggmoread.sdk.z.a.d.c("JHAIMPTAG", "abort click , reason: hasExporsed = " + this.f2299d + " , isClicked = " + this.f2300e);
            return;
        }
        this.f2303h = System.currentTimeMillis();
        this.f2300e++;
        this.f2297b.onADClicked();
        com.aggmoread.sdk.z.a.g.c cVar = this.f2301f.f2572c;
        String str = f2295i;
        com.aggmoread.sdk.z.a.d.c(str, "feedsListFrameLayout2 juHeApiAdUrlDefine = " + cVar);
        com.aggmoread.sdk.z.a.d.c(str, "action e x = " + (((float) cVar.f2084a) / ((float) cVar.f2088e)) + " ,y = " + (((float) cVar.f2085b) / ((float) cVar.f2089f)));
        com.aggmoread.sdk.z.a.q.a.a("onAdClick", this.f2296a.f2077r, cVar);
        l.a(this.f2298c, this.f2296a, cVar, this.f2297b);
    }

    @Override // com.aggmoread.sdk.z.a.t.c.InterfaceC0082c
    public void onScrollChanged() {
        f();
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public void pauseVideo() {
        com.aggmoread.sdk.z.a.d.c("JHAIMPTAG", "pauseVideo");
        com.aggmoread.sdk.z.a.s.d dVar = this.f2302g;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.aggmoread.sdk.z.a.l.c
    public void resume() {
        com.aggmoread.sdk.z.a.d.c("JHAIMPTAG", "resume");
        resumeVideo();
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public void resumeVideo() {
        com.aggmoread.sdk.z.a.d.c("JHAIMPTAG", "resumeVideo");
        com.aggmoread.sdk.z.a.s.d dVar = this.f2302g;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public void startVideo() {
        com.aggmoread.sdk.z.a.d.c("JHAIMPTAG", "startVideo");
        com.aggmoread.sdk.z.a.s.d dVar = this.f2302g;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // com.aggmoread.sdk.z.a.l.e
    public void stopVideo() {
        com.aggmoread.sdk.z.a.d.c("JHAIMPTAG", "stopVideo");
        com.aggmoread.sdk.z.a.s.d dVar = this.f2302g;
        if (dVar != null) {
            dVar.p();
        }
    }
}
