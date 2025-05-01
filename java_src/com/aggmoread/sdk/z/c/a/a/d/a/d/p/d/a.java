package com.aggmoread.sdk.z.c.a.a.d.a.d.p.d;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.aggmoread.sdk.z.c.a.a.d.a.c;
import com.aggmoread.sdk.z.c.a.a.d.b.d;
import com.aggmoread.sdk.z.c.a.a.d.b.e;
import com.aggmoread.sdk.z.c.a.a.d.b.i;
import com.aggmoread.sdk.z.c.a.a.d.b.k;
import com.aggmoread.sdk.z.c.a.a.d.b.l;
import com.aggmoread.sdk.z.c.a.a.e.e;
import com.aggmoread.sdk.z.c.a.a.e.k;
import com.aggmoread.sdk.z.c.a.a.e.m;
import com.baidu.mobads.sdk.api.FeedPortraitVideoView;
import com.baidu.mobads.sdk.api.IFeedPortraitListener;
import com.baidu.mobads.sdk.api.NativeResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class a extends com.aggmoread.sdk.z.c.a.a.d.a.d.b {

    /* renamed from: p  reason: collision with root package name */
    private String f2949p;

    /* renamed from: q  reason: collision with root package name */
    private NativeResponse f2950q;

    /* renamed from: r  reason: collision with root package name */
    private com.aggmoread.sdk.z.c.a.a.d.b.m.a f2951r;

    /* renamed from: s  reason: collision with root package name */
    private FeedPortraitVideoView f2952s;

    /* renamed from: t  reason: collision with root package name */
    private AtomicBoolean f2953t;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class View$OnAttachStateChangeListenerC0107a implements View.OnAttachStateChangeListener {

        /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.d.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0108a implements IFeedPortraitListener {
            C0108a() {
            }

            public void pauseBtnClick() {
                e.b(a.this.f2949p, "pauseBtnClick ");
            }

            public void playCompletion() {
                e.b(a.this.f2949p, "playCompletion ");
                if (((com.aggmoread.sdk.z.c.a.a.d.a.d.b) a.this).f2822m != null) {
                    ((com.aggmoread.sdk.z.c.a.a.d.a.d.b) a.this).f2822m.onVideoComplete();
                }
            }

            public void playError() {
                e.b(a.this.f2949p, "playError ");
                if (((com.aggmoread.sdk.z.c.a.a.d.a.d.b) a.this).f2822m != null) {
                    ((com.aggmoread.sdk.z.c.a.a.d.a.d.b) a.this).f2822m.a(new i(-1000, "bd:视频素材播放失败！"));
                }
            }

            public void playPause() {
                e.b(a.this.f2949p, "playPause ");
                if (((com.aggmoread.sdk.z.c.a.a.d.a.d.b) a.this).f2822m != null) {
                    ((com.aggmoread.sdk.z.c.a.a.d.a.d.b) a.this).f2822m.onVideoPause();
                }
            }

            public void playRenderingStart() {
                e.b(a.this.f2949p, "playRenderingStart ");
                if (((com.aggmoread.sdk.z.c.a.a.d.a.d.b) a.this).f2822m != null) {
                    ((com.aggmoread.sdk.z.c.a.a.d.a.d.b) a.this).f2822m.onVideoStart();
                }
            }

            public void playResume() {
                e.b(a.this.f2949p, "playResume ");
                if (((com.aggmoread.sdk.z.c.a.a.d.a.d.b) a.this).f2822m != null) {
                    ((com.aggmoread.sdk.z.c.a.a.d.a.d.b) a.this).f2822m.onVideoStart();
                }
            }
        }

        View$OnAttachStateChangeListenerC0107a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            e.b(a.this.f2949p, "onViewAttachedToWindow enter ");
            if (!a.this.f2953t.compareAndSet(false, true)) {
                if (a.this.f2952s != null) {
                    a.this.f2952s.play();
                    return;
                }
                return;
            }
            if (a.this.f2952s == null) {
                ViewParent parent = a.this.f2951r.getParent();
                if (parent instanceof ViewGroup) {
                    Activity a5 = m.a((View) parent);
                    String str = a.this.f2949p;
                    e.b(str, "getView onViewAttachedToWindow " + a5);
                    if (a5 != null) {
                        a.this.f2952s = new FeedPortraitVideoView(a5);
                    } else {
                        a.this.f2952s = new FeedPortraitVideoView(a.this.f2798d.f3260d);
                    }
                }
            }
            if (a.this.f2952s != null) {
                a.this.f2952s.setUseDownloadFrame(true);
                a.this.f2952s.setFeedPortraitListener(new C0108a());
                String str2 = a.this.f2949p;
                e.b(str2, "portraitVideoView parent " + a.this.f2952s);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 17;
                a.this.f2951r.addView((View) a.this.f2952s, (ViewGroup.LayoutParams) layoutParams);
                ArrayList arrayList = new ArrayList();
                arrayList.add(a.this.f2952s);
                a aVar = a.this;
                aVar.a(aVar.f2951r, arrayList);
                e.b(a.this.f2949p, "render enter ");
                l.a(a.this.f2951r, a.this.f2804j);
                a aVar2 = a.this;
                l.a(aVar2.f2798d.f3258b, aVar2.f2804j, com.aggmoread.sdk.z.c.a.a.c.i.INFORMATION_FLOW, aVar2.f2951r, new View[0], new WeakReference(a.this.f2951r), null);
                a aVar3 = a.this;
                l.b(aVar3.f2798d.f3258b, aVar3.f2799e.e(), a.this.f2799e.b());
                byte[] b5 = a.this.f2798d.f3274r.b();
                if (b5 != null) {
                    l.a(a.this.f2798d.f3258b, b5);
                }
                a aVar4 = a.this;
                l.a(aVar4.f2804j, aVar4.f2799e);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements NativeResponse.AdInteractionListener {
        b() {
        }

        public void onADExposed() {
            e.b(a.this.f2949p, "onADExposed ");
            HashMap hashMap = new HashMap();
            a.this.f2801g = System.currentTimeMillis();
            hashMap.put(k.f3504a, a.this.f2799e.f3308b.a(e.c.f3330f, "-1"));
            l.a((Object) a.this.f2804j, true, true);
            a.this.d();
        }

        public void onADExposureFailed(int i4) {
            com.aggmoread.sdk.z.c.a.a.e.e.a(a.this.f2949p, "onADError %d", Integer.valueOf(i4));
            a.this.a(new i(-1000, String.valueOf(i4)));
        }

        public void onADStatusChanged() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(a.this.f2949p, "onADStatusChanged");
        }

        public void onAdClick() {
            com.aggmoread.sdk.z.c.a.a.e.e.b(a.this.f2949p, "onADClicked");
            a aVar = a.this;
            aVar.f2800f++;
            aVar.j();
        }

        public void onAdUnionClick() {
        }
    }

    public a(NativeResponse nativeResponse, d dVar, com.aggmoread.sdk.z.c.a.a.d.b.e eVar, Map<String, Object> map) {
        super(dVar, eVar, map);
        this.f2949p = "AMDRAWTAGBD";
        new AtomicBoolean();
        this.f2953t = new AtomicBoolean();
        this.f2950q = nativeResponse;
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.b(this.f2821l, com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(nativeResponse), eVar);
        this.f2951r = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(dVar.f3260d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        com.aggmoread.sdk.z.c.a.a.c.n.b bVar;
        com.aggmoread.sdk.z.c.a.a.d.b.k kVar = new com.aggmoread.sdk.z.c.a.a.d.b.k(this.f2798d, this.f2799e);
        boolean a5 = kVar.a(k.b.f3448n, this.f2796b).a(this.f2799e, a(), this.f2801g, this.f2804j);
        kVar.b();
        l.a((Object) this.f2804j, false, true);
        if (!a5 || (bVar = this.f2823n) == null) {
            return;
        }
        bVar.onAdClicked();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.a
    public com.aggmoread.sdk.z.c.a.a.d.b.m.a a() {
        String str = this.f2949p;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "ac " + this.f2951r);
        com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar = this.f2951r;
        return aVar != null ? aVar : super.a();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.a
    public void a(c cVar) {
    }

    protected void a(com.aggmoread.sdk.z.c.a.a.d.b.m.a aVar, List<View> list) {
        if (this.f2950q == null || aVar == null || this.f2952s == null) {
            return;
        }
        this.f2950q.registerViewForInteraction(this.f2952s, list, new ArrayList(), new b());
        this.f2952s.setAdData(this.f2950q);
        this.f2952s.play();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.b
    public void b(int i4) {
        super.b(i4);
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f2950q, i4);
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.b
    public void b(int i4, int i5, String str) {
        com.aggmoread.sdk.z.c.a.a.d.a.d.p.a.a(this.f2950q, "203");
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public void destroy() {
        if (this.f2950q != null) {
            this.f2950q = null;
            this.f2952s = null;
            this.f2951r = null;
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.d.a.d.b
    protected String getTitle() {
        return this.f2950q.getTitle();
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public View getView() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f2949p, "getView");
        if (this.f2951r == null) {
            this.f2951r = new com.aggmoread.sdk.z.c.a.a.d.b.m.a(this.f2798d.f3260d.getApplicationContext());
        }
        String str = this.f2949p;
        com.aggmoread.sdk.z.c.a.a.e.e.b(str, "getView " + this.f2951r);
        this.f2951r.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0107a());
        return this.f2951r;
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public void render() {
        com.aggmoread.sdk.z.c.a.a.e.e.b(this.f2949p, "render");
        if (this.f2950q == null) {
            com.aggmoread.sdk.z.c.a.a.e.e.b(this.f2949p, "render failed");
            return;
        }
        if (this.f2952s == null) {
            this.f2952s = new FeedPortraitVideoView(this.f2798d.f3260d);
        }
        com.aggmoread.sdk.z.c.a.a.c.n.b bVar = this.f2823n;
        if (bVar != null) {
            bVar.onRenderSuccess();
        }
    }

    @Override // com.aggmoread.sdk.z.c.a.a.c.n.a
    public void renderActivity(Activity activity) {
        render();
    }
}
