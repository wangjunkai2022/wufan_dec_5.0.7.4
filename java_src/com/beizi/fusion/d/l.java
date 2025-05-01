package com.beizi.fusion.d;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.beizi.fusion.g.au;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.List;
/* compiled from: InterstitialAdManager.java */
/* loaded from: classes2.dex */
public class l extends e {

    /* renamed from: r  reason: collision with root package name */
    private int f6746r;

    /* renamed from: s  reason: collision with root package name */
    private int f6747s;

    public l(Context context, String str, com.beizi.fusion.a aVar, long j4, int i4) {
        super(context, str, aVar, j4);
        this.f6747s = 0;
        this.f6747s = i4;
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

    @Override // com.beizi.fusion.d.e
    protected void a() {
        com.beizi.fusion.b.b bVar = this.f6695c;
        if (bVar != null) {
            bVar.d("3");
        }
    }

    public void b(int i4) {
        this.f6746r = i4;
    }

    public void c() {
        a((ViewGroup) null);
    }

    public boolean b() {
        return this.f6704l;
    }

    @Override // com.beizi.fusion.d.e
    public com.beizi.fusion.work.a a(AdSpacesBean.ForwardBean forwardBean, String str, AdSpacesBean.BuyerBean buyerBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.work.a aVar) {
        String adType = buyerBean.getAdType();
        long sleepTime = forwardBean.getSleepTime();
        com.beizi.fusion.work.a aVar2 = (au.b().equalsIgnoreCase(str) || "BEIZI".equalsIgnoreCase(str)) ? new com.beizi.fusion.work.interstitial.a(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this) : aVar;
        if ("NATIVE".equalsIgnoreCase(adType)) {
            str.hashCode();
            if (str.equals("GDT")) {
                return new com.beizi.fusion.work.interstitial.d(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this);
            }
            return !str.equals("KUAISHOU") ? aVar2 : new com.beizi.fusion.work.interstitial.e(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this);
        }
        str.hashCode();
        if (str.equals("CSJ")) {
            return new com.beizi.fusion.work.interstitial.b(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this);
        }
        return !str.equals("GDT") ? aVar2 : new com.beizi.fusion.work.interstitial.c(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this);
    }

    public void a(Activity activity) {
        com.beizi.fusion.work.a aVar;
        if (activity == null || (aVar = this.f6701i) == null) {
            return;
        }
        aVar.a(activity);
    }
}
