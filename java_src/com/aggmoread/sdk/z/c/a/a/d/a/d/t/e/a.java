package com.aggmoread.sdk.z.c.a.a.d.a.d.t.e;

import com.qq.e.ads.banner2.UnifiedBannerADListener;
import com.qq.e.comm.util.AdError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/* loaded from: classes2.dex */
public class a implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private InterfaceC0125a f3102a;

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.t.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0125a {
        void a();

        void b();

        void onADClicked();

        void onADCloseOverlay();

        void onADExposure();

        void onADLeftApplication();

        void onADOpenOverlay();

        void onNoAD(AdError adError);
    }

    public a(InterfaceC0125a interfaceC0125a) {
        this.f3102a = interfaceC0125a;
    }

    public UnifiedBannerADListener a() {
        return (UnifiedBannerADListener) Proxy.newProxyInstance(UnifiedBannerADListener.class.getClassLoader(), new Class[]{UnifiedBannerADListener.class}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (method != null) {
            try {
                if (this.f3102a != null) {
                    String name = method.getName();
                    if ("onADReceive".equals(name)) {
                        this.f3102a.a();
                    } else if ("onADExposure".equals(name)) {
                        this.f3102a.onADExposure();
                    } else if ("onADClicked".equals(name)) {
                        this.f3102a.onADClicked();
                    } else if ("onADClosed".equals(name)) {
                        this.f3102a.b();
                    } else if ("onADLeftApplication".equals(name)) {
                        this.f3102a.onADLeftApplication();
                    } else if ("onADOpenOverlay".equals(name)) {
                        this.f3102a.onADOpenOverlay();
                    } else if ("onADCloseOverlay".equals(name)) {
                        this.f3102a.onADCloseOverlay();
                    } else if ("onNoAD".equals(name)) {
                        this.f3102a.onNoAD((AdError) objArr[0]);
                    }
                }
                return null;
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
