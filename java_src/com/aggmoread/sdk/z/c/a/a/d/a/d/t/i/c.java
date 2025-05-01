package com.aggmoread.sdk.z.c.a.a.d.a.d.t.i;

import com.aggmoread.sdk.z.c.a.a.e.e;
import com.qq.e.ads.interstitial2.UnifiedInterstitialMediaListener;
import com.qq.e.comm.util.AdError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* loaded from: classes2.dex */
public class c implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private a f3156a;

    /* loaded from: classes2.dex */
    public interface a {
        void a(long j4);

        void b();

        void c();

        void onVideoComplete();

        void onVideoError(AdError adError);

        void onVideoInit();

        void onVideoLoading();

        void onVideoPause();

        void onVideoStart();
    }

    public c(a aVar) {
        this.f3156a = aVar;
    }

    public UnifiedInterstitialMediaListener a() {
        return (UnifiedInterstitialMediaListener) Proxy.newProxyInstance(UnifiedInterstitialMediaListener.class.getClassLoader(), new Class[]{UnifiedInterstitialMediaListener.class}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (this.f3156a == null) {
            return null;
        }
        e.b("INTERSTITIALTAG", "name = " + name);
        if ("onVideoInit".equals(name)) {
            this.f3156a.onVideoInit();
        } else if ("onVideoLoading".equals(name)) {
            this.f3156a.onVideoLoading();
        } else if ("onVideoReady".equals(name)) {
            this.f3156a.a(((Long) objArr[0]).longValue());
        } else if ("onVideoStart".equals(name)) {
            this.f3156a.onVideoStart();
        } else if ("onVideoPause".equals(name)) {
            this.f3156a.onVideoPause();
        } else if ("onVideoComplete".equals(name)) {
            this.f3156a.onVideoComplete();
        } else if ("onVideoError".equals(name)) {
            this.f3156a.onVideoError((AdError) objArr[0]);
        } else if ("onVideoPageOpen".equals(name)) {
            this.f3156a.c();
        } else if ("onVideoPageClose".equals(name)) {
            this.f3156a.b();
        }
        return null;
    }
}
