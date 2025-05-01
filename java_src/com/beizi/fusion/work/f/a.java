package com.beizi.fusion.work.f;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.beizi.fusion.NativeUnifiedAdResponse;
import com.beizi.fusion.d.h;
import com.beizi.fusion.g.av;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.List;
import java.util.Map;
/* compiled from: BaseNativeUnifiedWorker.java */
/* loaded from: classes2.dex */
public class a extends com.beizi.fusion.work.a implements com.beizi.fusion.d.c {

    /* renamed from: n  reason: collision with root package name */
    protected Context f7530n;

    /* renamed from: o  reason: collision with root package name */
    protected long f7531o;

    /* renamed from: p  reason: collision with root package name */
    protected float f7532p;

    /* renamed from: q  reason: collision with root package name */
    protected float f7533q;

    /* renamed from: r  reason: collision with root package name */
    protected NativeUnifiedAdResponse f7534r;

    /* renamed from: s  reason: collision with root package name */
    protected FrameLayout f7535s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f7536t = false;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f7537u = false;

    public a(Context context, long j4, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean, com.beizi.fusion.d.e eVar, int i4) {
        this.f7530n = context;
        this.f7531o = j4;
        this.f7373e = buyerBean;
        this.f7372d = eVar;
        this.f7379k = i4;
        this.f7374f = forwardBean;
        this.f7532p = av.l(context);
        this.f7533q = av.m(context);
        r();
    }

    private void aU() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar == null) {
            return;
        }
        Map<String, com.beizi.fusion.work.a> q4 = eVar.q();
        StringBuilder sb = new StringBuilder();
        sb.append(g());
        sb.append(" NativeUnifiedWorker:");
        sb.append(q4.toString());
        Z();
        h hVar = this.f7375g;
        if (hVar == h.SUCCESS) {
            aV();
            this.f7372d.a(g(), (View) null);
        } else if (hVar == h.FAIL) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("other worker shown,");
            sb2.append(g());
            sb2.append(" remove");
        }
    }

    private void aV() {
        this.f7534r = new NativeUnifiedAdResponse() { // from class: com.beizi.fusion.work.f.a.1
            @Override // com.beizi.fusion.NativeUnifiedAdResponse
            public String getActionText() {
                return a.this.aO();
            }

            @Override // com.beizi.fusion.NativeUnifiedAdResponse
            public String getDescription() {
                return a.this.aJ();
            }

            @Override // com.beizi.fusion.NativeUnifiedAdResponse
            public int getECPM() {
                String j4 = a.this.j();
                if (j4 != null) {
                    try {
                        return Integer.parseInt(j4);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        return -1;
                    }
                }
                return -1;
            }

            @Override // com.beizi.fusion.NativeUnifiedAdResponse
            public String getIconUrl() {
                return a.this.aK();
            }

            @Override // com.beizi.fusion.NativeUnifiedAdResponse
            public String getImageUrl() {
                return a.this.aL();
            }

            @Override // com.beizi.fusion.NativeUnifiedAdResponse
            public List<String> getImgList() {
                return a.this.aM();
            }

            @Override // com.beizi.fusion.NativeUnifiedAdResponse
            public int getMaterialType() {
                return a.this.aN();
            }

            @Override // com.beizi.fusion.NativeUnifiedAdResponse
            public String getTitle() {
                return a.this.aI();
            }

            @Override // com.beizi.fusion.NativeUnifiedAdResponse
            public View getVideoView() {
                return a.this.aR();
            }

            @Override // com.beizi.fusion.NativeUnifiedAdResponse
            public ViewGroup getViewContainer() {
                return a.this.aQ();
            }

            @Override // com.beizi.fusion.NativeUnifiedAdResponse
            public boolean isVideo() {
                return a.this.aP();
            }

            @Override // com.beizi.fusion.NativeUnifiedAdResponse
            public void registerViewForInteraction(List<View> list) {
                a.this.a(list);
            }
        };
    }

    public void a(List<View> list) {
    }

    @Override // com.beizi.fusion.work.a
    public NativeUnifiedAdResponse aD() {
        return this.f7534r;
    }

    public void aG() {
    }

    public void aH() {
    }

    public String aI() {
        return null;
    }

    public String aJ() {
        return null;
    }

    public String aK() {
        return null;
    }

    public String aL() {
        return null;
    }

    public List<String> aM() {
        return null;
    }

    public int aN() {
        return 0;
    }

    public String aO() {
        return null;
    }

    public boolean aP() {
        return false;
    }

    public ViewGroup aQ() {
        return null;
    }

    public View aR() {
        return null;
    }

    public void aS() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void aT() {
        try {
            if (Y()) {
                aU();
            } else {
                O();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beizi.fusion.work.a
    public void ab() {
        this.f7378j = com.beizi.fusion.f.a.ADSHOW;
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar != null && eVar.r() != 2) {
            this.f7372d.b(g());
        }
        if (this.f7536t) {
            return;
        }
        this.f7536t = true;
        az();
        C();
        D();
        ah();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        com.beizi.fusion.d.e eVar = this.f7372d;
        if (eVar != null && eVar.r() != 2) {
            this.f7372d.d(g());
        }
        if (this.f7537u) {
            return;
        }
        this.f7537u = true;
        E();
        ai();
    }

    @Override // com.beizi.fusion.work.a
    public void d() {
        if (this.f7372d == null) {
            return;
        }
        this.f7376h = this.f7373e.getAppId();
        this.f7377i = this.f7373e.getSpaceId();
        this.f7371c = this.f7373e.getBuyerSpaceUuId();
        com.beizi.fusion.b.d dVar = this.f7369a;
        if (dVar != null) {
            com.beizi.fusion.b.b a5 = dVar.a().a(this.f7371c);
            this.f7370b = a5;
            if (a5 != null) {
                s();
                aG();
            }
        }
    }

    @Override // com.beizi.fusion.work.a
    public void f() {
    }

    @Override // com.beizi.fusion.work.a
    public String g() {
        return null;
    }

    @Override // com.beizi.fusion.work.a
    public com.beizi.fusion.f.a i() {
        return this.f7378j;
    }

    @Override // com.beizi.fusion.work.a
    public AdSpacesBean.BuyerBean k() {
        return this.f7373e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.beizi.fusion.work.a
    public void l() {
        w();
        ag();
        aH();
    }
}
