package com.aggmoread.sdk.z.c.a.a.d.a.d.t.i;

import com.qq.e.ads.interstitial2.UnifiedInterstitialADListener;
import com.qq.e.comm.util.AdError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* loaded from: classes2.dex */
public class b implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private a f3155a;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();

        void c();

        void onADClicked();

        void onADExposure();

        void onADLeftApplication();

        void onNoAD(AdError adError);

        void onRenderFail();

        void onRenderSuccess();

        void onVideoCached();
    }

    public b(a aVar) {
        this.f3155a = aVar;
    }

    public UnifiedInterstitialADListener a() {
        return (UnifiedInterstitialADListener) Proxy.newProxyInstance(UnifiedInterstitialADListener.class.getClassLoader(), new Class[]{UnifiedInterstitialADListener.class}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (this.f3155a == null) {
            return null;
        }
        if ("onADReceive".equals(name)) {
            this.f3155a.a();
        } else if ("onVideoCached".equals(name)) {
            this.f3155a.onVideoCached();
        } else if ("onNoAD".equals(name)) {
            this.f3155a.onNoAD((AdError) objArr[0]);
        } else if ("onADOpened".equals(name)) {
            this.f3155a.c();
        } else if ("onADExposure".equals(name)) {
            this.f3155a.onADExposure();
        } else if ("onADClicked".equals(name)) {
            this.f3155a.onADClicked();
        } else if ("onADLeftApplication".equals(name)) {
            this.f3155a.onADLeftApplication();
        } else if ("onADClosed".equals(name)) {
            this.f3155a.b();
        } else if ("onRenderSuccess".equals(name)) {
            this.f3155a.onRenderSuccess();
        } else if ("onRenderFail".equals(name)) {
            this.f3155a.onRenderFail();
        }
        return null;
    }
}
