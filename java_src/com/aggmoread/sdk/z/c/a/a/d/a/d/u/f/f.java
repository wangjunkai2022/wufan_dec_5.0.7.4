package com.aggmoread.sdk.z.c.a.a.d.a.d.u.f;

import com.kwad.sdk.api.KsNativeAd;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* loaded from: classes2.dex */
public class f implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private a f3201a;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();

        void c();

        void d();

        void onVideoPlayError(int i4, int i5);

        void onVideoPlayStart();
    }

    public KsNativeAd.VideoPlayListener a(a aVar) {
        this.f3201a = aVar;
        return (KsNativeAd.VideoPlayListener) Proxy.newProxyInstance(KsNativeAd.VideoPlayListener.class.getClassLoader(), new Class[]{KsNativeAd.VideoPlayListener.class}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (this.f3201a == null) {
            return null;
        }
        if ("onVideoPlayReady".equals(method.getName())) {
            this.f3201a.b();
        } else if ("onVideoPlayStart".equals(method.getName())) {
            this.f3201a.onVideoPlayStart();
        } else if ("onVideoPlayComplete".equals(method.getName())) {
            this.f3201a.a();
        } else if ("onVideoPlayError".equals(method.getName())) {
            this.f3201a.onVideoPlayError(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue());
        } else if ("onVideoPlayPause".equals(method.getName())) {
            this.f3201a.c();
        } else if ("onVideoPlayResume".equals(method.getName())) {
            this.f3201a.d();
        }
        return null;
    }
}
