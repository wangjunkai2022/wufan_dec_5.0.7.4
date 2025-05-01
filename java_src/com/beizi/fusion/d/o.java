package com.beizi.fusion.d;

import android.content.Context;
import android.view.ViewGroup;
import com.beizi.fusion.g.au;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.model.AppEventId;
import java.util.List;
/* compiled from: NativeAdManager.java */
/* loaded from: classes2.dex */
public class o extends e {

    /* renamed from: r  reason: collision with root package name */
    private float f6751r;

    /* renamed from: s  reason: collision with root package name */
    private float f6752s;

    /* renamed from: t  reason: collision with root package name */
    private int f6753t;

    public o(Context context, String str, com.beizi.fusion.a aVar, long j4, int i4) {
        super(context, str, aVar, j4);
        this.f6753t = i4;
    }

    public void A() {
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
        com.beizi.fusion.work.a fVar;
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
            case 1921014029:
                if (str.equals("KUAISHOU")) {
                    c5 = 3;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                fVar = new com.beizi.fusion.work.nativead.f(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this, this.f6751r, this.f6752s);
                break;
            case 1:
                if (this.f6753t == 3) {
                    fVar = new com.beizi.fusion.work.nativead.h(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this, this.f6751r, this.f6752s);
                    break;
                } else {
                    fVar = new com.beizi.fusion.work.nativead.g(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this, this.f6751r, this.f6752s);
                    break;
                }
            case 2:
                fVar = new com.beizi.fusion.work.nativead.a(e.f6692a, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this, this.f6751r, this.f6752s);
                break;
            case 3:
                fVar = new com.beizi.fusion.work.nativead.i(e.f6692a, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this, this.f6751r, this.f6752s);
                break;
            default:
                fVar = aVar;
                break;
        }
        if (au.b().equalsIgnoreCase(str) || "BEIZI".equalsIgnoreCase(str)) {
            int i4 = this.f6753t;
            if (i4 == 4) {
                return new com.beizi.fusion.work.nativead.c(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this, this.f6751r, this.f6752s);
            }
            if (i4 == 5) {
                return new com.beizi.fusion.work.nativead.d(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this, this.f6751r, this.f6752s);
            }
            return new com.beizi.fusion.work.nativead.e(this.f6694b, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this, this.f6751r, this.f6752s);
        }
        return fVar;
    }

    public void a(float f5, float f6) {
        this.f6751r = f5;
        this.f6752s = f6;
        a((ViewGroup) null);
    }
}
