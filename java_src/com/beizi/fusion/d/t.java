package com.beizi.fusion.d;

import android.content.Context;
import android.view.View;
import com.beizi.fusion.g.au;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.model.AppEventId;
import java.util.List;
/* compiled from: SplashManager.java */
/* loaded from: classes2.dex */
public class t extends e {

    /* renamed from: r  reason: collision with root package name */
    private int f6758r;

    /* renamed from: s  reason: collision with root package name */
    private int f6759s;

    public t(Context context, String str, View view, com.beizi.fusion.a aVar, long j4) {
        super(context, str, aVar, j4);
        this.f6699g = view;
    }

    public void A() {
        com.beizi.fusion.work.a aVar;
        if (this.f6707o || (aVar = this.f6701i) == null || this.f6706n) {
            return;
        }
        aVar.aF();
        this.f6701i.f();
        this.f6706n = true;
    }

    public int B() {
        String j4;
        com.beizi.fusion.work.a aVar = this.f6701i;
        if (aVar == null || (j4 = aVar.j()) == null) {
            return -1;
        }
        try {
            return Integer.parseInt(j4);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public void C() {
        com.beizi.fusion.g.h.b().c().execute(new Runnable() { // from class: com.beizi.fusion.d.t.1
            @Override // java.lang.Runnable
            public void run() {
                com.beizi.fusion.b.c.a(e.f6692a).b(new com.beizi.fusion.b.b(b.f6675b, "", "200.500", "", b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), ""));
            }
        });
    }

    @Override // com.beizi.fusion.d.e
    protected void a() {
        AppEventId.getInstance(e.f6692a).setAppSplashRequest(this.f6705m);
        com.beizi.fusion.b.b bVar = this.f6695c;
        if (bVar != null) {
            bVar.d("2");
        }
    }

    public int b() {
        return this.f6758r;
    }

    public int c() {
        return this.f6759s;
    }

    public void b(int i4) {
        this.f6758r = i4;
    }

    public void c(int i4) {
        this.f6759s = i4;
    }

    @Override // com.beizi.fusion.d.e
    public com.beizi.fusion.work.a a(AdSpacesBean.ForwardBean forwardBean, String str, AdSpacesBean.BuyerBean buyerBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.work.a aVar) {
        com.beizi.fusion.work.a jVar;
        com.beizi.fusion.work.a bVar = (au.b().equalsIgnoreCase(str) || "BEIZI".equalsIgnoreCase(str)) ? new com.beizi.fusion.work.splash.b(this.f6694b, this.f6697e, this.f6698f, this.f6699g, this.f6696d, buyerBean, forwardBean, list, this) : aVar;
        str.hashCode();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -2130632690:
                if (str.equals("INMOBI")) {
                    c5 = 0;
                    break;
                }
                break;
            case -2114267227:
                if (str.equals("JADYUN")) {
                    c5 = 1;
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c5 = 2;
                    break;
                }
                break;
            case 67034:
                if (str.equals("CSJ")) {
                    c5 = 3;
                    break;
                }
                break;
            case 70423:
                if (str.equals("GDT")) {
                    c5 = 4;
                    break;
                }
                break;
            case 76672:
                if (str.equals("MTG")) {
                    c5 = 5;
                    break;
                }
                break;
            case 62961147:
                if (str.equals("BAIDU")) {
                    c5 = 6;
                    break;
                }
                break;
            case 1780672330:
                if (str.equals("CSJ_NST")) {
                    c5 = 7;
                    break;
                }
                break;
            case 1921014029:
                if (str.equals("KUAISHOU")) {
                    c5 = '\b';
                    break;
                }
                break;
            case 2141820391:
                if (str.equals("HUAWEI")) {
                    c5 = '\t';
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                return new com.beizi.fusion.work.splash.i(this.f6694b, this.f6697e, this.f6698f, this.f6699g, this.f6696d, buyerBean, forwardBean, list, this);
            case 1:
                jVar = new com.beizi.fusion.work.splash.j(this.f6694b, this.f6697e, this.f6698f, this.f6699g, this.f6696d, buyerBean, forwardBean, list, b(), c(), this);
                break;
            case 2:
                jVar = new com.beizi.fusion.work.splash.g(this.f6694b, this.f6697e, this.f6698f, this.f6699g, this.f6696d, buyerBean, forwardBean, list, b(), c(), this);
                break;
            case 3:
                jVar = new com.beizi.fusion.work.splash.e(this.f6694b, this.f6697e, this.f6698f, this.f6699g, this.f6696d, buyerBean, forwardBean, list, b(), c(), this);
                break;
            case 4:
                return new com.beizi.fusion.work.splash.f(this.f6694b, this.f6697e, this.f6698f, this.f6699g, this.f6696d, buyerBean, forwardBean, list, this);
            case 5:
                return new com.beizi.fusion.work.splash.l(this.f6694b, this.f6697e, this.f6698f, this.f6696d, buyerBean, forwardBean, this);
            case 6:
                return new com.beizi.fusion.work.splash.a(this.f6694b, this.f6697e, this.f6698f, this.f6699g, this.f6696d, buyerBean, forwardBean, list, this);
            case 7:
                return new com.beizi.fusion.work.splash.d(this.f6694b, this.f6697e, this.f6698f, this.f6699g, this.f6696d, buyerBean, forwardBean, list, this);
            case '\b':
                return new com.beizi.fusion.work.splash.k(this.f6694b, this.f6697e, this.f6698f, this.f6696d, buyerBean, forwardBean, list, this);
            case '\t':
                return new com.beizi.fusion.work.splash.h(this.f6694b, this.f6697e, this.f6698f, this.f6696d, buyerBean, forwardBean, this);
            default:
                return bVar;
        }
        return jVar;
    }
}
