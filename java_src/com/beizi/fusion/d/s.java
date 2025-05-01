package com.beizi.fusion.d;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.model.AppEventId;
import java.util.List;
/* compiled from: RewardedVideoManager.java */
/* loaded from: classes2.dex */
public class s extends e {

    /* renamed from: r  reason: collision with root package name */
    private int f6755r;

    /* renamed from: s  reason: collision with root package name */
    private String f6756s;

    /* renamed from: t  reason: collision with root package name */
    private String f6757t;

    public s(Context context, String str, com.beizi.fusion.a aVar, long j4, int i4) {
        super(context, str, aVar, j4);
        this.f6755r = i4;
    }

    public boolean A() {
        return this.f6704l;
    }

    public void B() {
        a((ViewGroup) null);
    }

    public int C() {
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

    public void D() {
        m();
    }

    @Override // com.beizi.fusion.d.e
    protected void a() {
        AppEventId.getInstance(e.f6692a).setAppRewardedVideoRequest(this.f6705m);
        com.beizi.fusion.b.b bVar = this.f6695c;
        if (bVar != null) {
            bVar.d("1");
        }
    }

    public String b() {
        return this.f6756s;
    }

    public String c() {
        return this.f6757t;
    }

    public void g(String str) {
        this.f6756s = str;
    }

    public void h(String str) {
        this.f6757t = str;
    }

    @Override // com.beizi.fusion.d.e
    public com.beizi.fusion.work.a a(AdSpacesBean.ForwardBean forwardBean, String str, AdSpacesBean.BuyerBean buyerBean, List<AdSpacesBean.RenderViewBean> list, com.beizi.fusion.work.a aVar) {
        com.beizi.fusion.work.a aVar2;
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
            case 2141820391:
                if (str.equals("HUAWEI")) {
                    c5 = 4;
                    break;
                }
                break;
        }
        switch (c5) {
            case 0:
                return new com.beizi.fusion.work.g.b(e.f6692a, this.f6697e, b(), c(), this.f6698f, sleepTime, buyerBean, forwardBean, this);
            case 1:
                return new com.beizi.fusion.work.g.c(e.f6692a, this.f6697e, b(), c(), this.f6698f, sleepTime, buyerBean, forwardBean, this);
            case 2:
                aVar2 = new com.beizi.fusion.work.g.a(e.f6692a, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this);
                break;
            case 3:
                return new com.beizi.fusion.work.g.e(e.f6692a, this.f6697e, b(), c(), this.f6698f, sleepTime, buyerBean, forwardBean, this);
            case 4:
                aVar2 = new com.beizi.fusion.work.g.d(e.f6692a, this.f6697e, this.f6698f, sleepTime, buyerBean, forwardBean, this);
                break;
            default:
                return aVar;
        }
        return aVar2;
    }

    public void a(Activity activity) {
        com.beizi.fusion.work.a aVar;
        if (activity == null || (aVar = this.f6701i) == null) {
            return;
        }
        aVar.a(activity);
    }
}
