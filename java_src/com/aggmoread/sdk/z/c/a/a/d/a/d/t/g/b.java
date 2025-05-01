package com.aggmoread.sdk.z.c.a.a.d.a.d.t.g;

import com.qq.e.ads.nativ.NativeExpressAD;
import com.qq.e.ads.nativ.NativeExpressADView;
import com.qq.e.comm.util.AdError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
/* loaded from: classes2.dex */
public class b implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private a f3113a;

    /* loaded from: classes2.dex */
    public interface a {
        void a(NativeExpressADView nativeExpressADView);

        void b(NativeExpressADView nativeExpressADView);

        void b(List<NativeExpressADView> list);

        void c(NativeExpressADView nativeExpressADView);

        void d(NativeExpressADView nativeExpressADView);

        void e(NativeExpressADView nativeExpressADView);

        void f(NativeExpressADView nativeExpressADView);

        void g(NativeExpressADView nativeExpressADView);

        void h(NativeExpressADView nativeExpressADView);

        void onNoAD(AdError adError);
    }

    public b(a aVar) {
        this.f3113a = aVar;
    }

    public NativeExpressAD.NativeExpressADListener a() {
        return (NativeExpressAD.NativeExpressADListener) Proxy.newProxyInstance(NativeExpressAD.NativeExpressADListener.class.getClassLoader(), new Class[]{NativeExpressAD.NativeExpressADListener.class}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (method != null) {
            try {
                if (this.f3113a != null) {
                    String name = method.getName();
                    Object obj2 = objArr[0];
                    if ("onADLoaded".equals(name)) {
                        this.f3113a.b((List) obj2);
                    } else if ("onRenderFail".equals(name)) {
                        this.f3113a.f((NativeExpressADView) obj2);
                    } else if ("onRenderSuccess".equals(name)) {
                        this.f3113a.b((NativeExpressADView) obj2);
                    } else if ("onADExposure".equals(name)) {
                        this.f3113a.c((NativeExpressADView) obj2);
                    } else if ("onADClicked".equals(name)) {
                        this.f3113a.h((NativeExpressADView) obj2);
                    } else if ("onADClosed".equals(name)) {
                        this.f3113a.a((NativeExpressADView) obj2);
                    } else if ("onADLeftApplication".equals(name)) {
                        this.f3113a.e((NativeExpressADView) obj2);
                    } else if ("onADOpenOverlay".equals(name)) {
                        this.f3113a.g((NativeExpressADView) obj2);
                    } else if ("onADCloseOverlay".equals(name)) {
                        this.f3113a.d((NativeExpressADView) obj2);
                    } else if ("onNoAD".equals(name)) {
                        this.f3113a.onNoAD((AdError) obj2);
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
