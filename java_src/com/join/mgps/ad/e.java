package com.join.mgps.ad;

import android.content.Context;
import com.join.mgps.ad.c;
import com.qq.e.ads.nativ.ADSize;
import com.qq.e.ads.nativ.NativeExpressAD;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.comm.managers.GDTAdSdk;
import com.qq.e.comm.managers.setting.GlobalSetting;
import com.qq.e.comm.util.AdError;
import java.util.ArrayList;
import java.util.List;
/* compiled from: GDTInfoStreamVideo.java */
/* loaded from: classes4.dex */
public class e extends c<NativeExpressADView> implements NativeExpressAD.NativeExpressADListener {

    /* renamed from: k  reason: collision with root package name */
    public static boolean f39688k;

    /* renamed from: g  reason: collision with root package name */
    private NativeExpressAD f39689g;

    /* renamed from: h  reason: collision with root package name */
    private List<NativeExpressADView> f39690h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f39691i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f39692j;

    public e(Context context, String str, String str2) {
        super("GDT", context, str, str2);
        this.f39690h = new ArrayList();
        this.f39691i = false;
        this.f39692j = false;
    }

    @Override // com.join.mgps.ad.c
    public void a() {
        try {
            if (!f39688k) {
                GDTAdSdk.init(this.f39671a, this.f39672b);
                GlobalSetting.setChannel(1);
                GlobalSetting.setEnableMediationTool(true);
                f39688k = true;
                onInitSuccess();
            } else {
                onInitSuccess();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.ad.c
    public void b(int i4, int i5, int i6) {
        this.f39691i = false;
        try {
            if (this.f39692j) {
                return;
            }
            this.f39692j = true;
            if (this.f39689g == null) {
                this.f39689g = new NativeExpressAD(this.f39671a, new ADSize(i5, i6), this.f39673c, this);
            }
            this.f39689g.loadAD(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
            onError(-1, "广告初始化错误");
        }
    }

    @Override // com.join.mgps.ad.c
    public void c() {
        List<NativeExpressADView> list = this.f39690h;
        if (list != null) {
            for (NativeExpressADView nativeExpressADView : list) {
                nativeExpressADView.destroy();
            }
        }
        this.f39690h = null;
    }

    @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
    public void onADClicked(NativeExpressADView nativeExpressADView) {
        c.a<T> aVar = this.f39675e;
        if (aVar != 0) {
            aVar.onAdClick();
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
    public void onADClosed(NativeExpressADView nativeExpressADView) {
        c.a<T> aVar = this.f39675e;
        if (aVar != 0) {
            aVar.a(nativeExpressADView);
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
    public void onADExposure(NativeExpressADView nativeExpressADView) {
        c.a<T> aVar = this.f39675e;
        if (aVar != 0) {
            aVar.onAdShow();
        }
    }

    @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
    public void onADLeftApplication(NativeExpressADView nativeExpressADView) {
    }

    @Override // com.join.mgps.ad.o, com.join.mgps.ad.m, com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
    public void onADLoaded(List<NativeExpressADView> list) {
        this.f39691i = true;
        this.f39692j = false;
        List<NativeExpressADView> list2 = this.f39690h;
        if (list2 != null) {
            list2.addAll(list);
            c.a<T> aVar = this.f39675e;
            if (aVar != 0) {
                aVar.onADLoaded(list);
            }
        }
    }

    @Override // com.join.mgps.ad.o, com.join.mgps.ad.m
    public void onError(int i4, String str) {
        super.onError(i4, str);
        this.f39691i = false;
        this.f39692j = false;
    }

    @Override // com.qq.e.ads.NativeAbstractAD.BasicADListener
    public void onNoAD(AdError adError) {
        this.f39691i = false;
        this.f39692j = false;
    }

    @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
    public void onRenderFail(NativeExpressADView nativeExpressADView) {
    }

    @Override // com.qq.e.ads.nativ.NativeExpressAD.NativeExpressADListener
    public void onRenderSuccess(NativeExpressADView nativeExpressADView) {
    }
}
