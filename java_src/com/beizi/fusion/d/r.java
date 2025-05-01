package com.beizi.fusion.d;

import android.content.Context;
import android.view.ViewGroup;
import com.beizi.fusion.g.au;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.model.AppEventId;
import java.util.List;
/* compiled from: NativeUnifiedAdManager.java */
/* loaded from: classes2.dex */
public class r extends e {

    /* renamed from: r  reason: collision with root package name */
    private int f6754r;

    public r(Context context, String str, com.beizi.fusion.a aVar, long j4, int i4) {
        super(context, str, aVar, j4);
        this.f6754r = i4;
    }

    public int A() {
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

    public void B() {
        m();
    }

    public void C() {
        n();
    }

    @Override // com.beizi.fusion.d.e
    protected void a() {
        AppEventId.getInstance(e.f6692a).setAppNativeRequest(this.f6705m);
        com.beizi.fusion.b.b bVar = this.f6695c;
        if (bVar != null) {
            bVar.d("5");
        }
    }

    public void b() {
        a((ViewGroup) null);
    }

    public boolean c() {
        return this.f6704l;
    }

    @Override // com.beizi.fusion.d.e
    public com.beizi.fusion.work.a a(AdSpacesBean.ForwardBean forwardBean, String str, AdSpacesBean.BuyerBean buyerBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.work.a aVar) {
        long sleepTime = forwardBean.getSleepTime();
        str.hashCode();
        char c5 = 65535;
        switch (str.hashCode()) {
            case 67034:
                if (str.equals("CSJ")) {
                    c5 = 0;
                    break;
                }
                break;
            case 70423:
                if (str.equals("GDT")) {
                    c5 = 1;
                    break;
                }
                break;
            case 1921014029:
                if (str.equals("KUAISHOU")) {
                    c5 = 2;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                aVar = new com.beizi.fusion.work.f.c(this.f6694b, sleepTime, buyerBean, forwardBean, this, this.f6754r);
                break;
            case 1:
                aVar = new com.beizi.fusion.work.f.d(this.f6694b, sleepTime, buyerBean, forwardBean, this, this.f6754r);
                break;
            case 2:
                aVar = new com.beizi.fusion.work.f.e(this.f6694b, sleepTime, buyerBean, forwardBean, this, this.f6754r);
                break;
        }
        return (au.b().equalsIgnoreCase(str) || "BEIZI".equalsIgnoreCase(str)) ? new com.beizi.fusion.work.f.b(this.f6694b, sleepTime, buyerBean, forwardBean, this, this.f6754r) : aVar;
    }
}
