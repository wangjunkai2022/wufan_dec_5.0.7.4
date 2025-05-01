package com.beizi.fusion.d;

import android.content.Context;
import android.view.ViewGroup;
import com.beizi.fusion.g.au;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.model.AppEventId;
import java.util.List;
/* compiled from: BannerAdManager.java */
/* loaded from: classes2.dex */
public class d extends e {

    /* renamed from: r  reason: collision with root package name */
    private float f6689r;

    /* renamed from: s  reason: collision with root package name */
    private float f6690s;

    /* renamed from: t  reason: collision with root package name */
    private ViewGroup f6691t;

    public d(Context context, String str, com.beizi.fusion.a aVar, long j4) {
        super(context, str, aVar, j4);
    }

    @Override // com.beizi.fusion.d.e
    protected void a() {
        AppEventId.getInstance(e.f6692a).setAppBannerRequest(this.f6705m);
        com.beizi.fusion.b.b bVar = this.f6695c;
        if (bVar != null) {
            bVar.d("4");
        }
    }

    public int b() {
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

    public void c() {
        m();
    }

    @Override // com.beizi.fusion.d.e
    public com.beizi.fusion.work.a a(AdSpacesBean.ForwardBean forwardBean, String str, AdSpacesBean.BuyerBean buyerBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.work.a aVar) {
        com.beizi.fusion.work.a cVar;
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
            case 62961147:
                if (str.equals("BAIDU")) {
                    c5 = 2;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                cVar = new com.beizi.fusion.work.a.c(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this, this.f6690s, this.f6689r, this.f6691t);
                break;
            case 1:
                cVar = new com.beizi.fusion.work.a.d(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this, this.f6690s, this.f6689r, this.f6691t);
                break;
            case 2:
                cVar = new com.beizi.fusion.work.a.a(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this, this.f6690s, this.f6689r, this.f6691t);
                break;
            default:
                cVar = aVar;
                break;
        }
        return (au.b().equalsIgnoreCase(str) || "BEIZI".equalsIgnoreCase(str)) ? new com.beizi.fusion.work.a.b(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this, this.f6690s, this.f6689r, this.f6691t) : cVar;
    }

    public void a(float f5, float f6, ViewGroup viewGroup) {
        this.f6690s = f5;
        this.f6689r = f6;
        this.f6691t = viewGroup;
        a((ViewGroup) null);
    }
}
