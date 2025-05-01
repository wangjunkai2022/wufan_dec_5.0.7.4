package com.aggmoread.sdk.z.c.a.a.d.a.d.t.g;

import com.qq.e.ads.nativ.NativeADUnifiedListener;
import com.qq.e.ads.nativ.NativeUnifiedADData;
import com.qq.e.comm.util.AdError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
/* loaded from: classes2.dex */
public class g implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private a f3135a;

    /* loaded from: classes2.dex */
    public interface a {
        void b(List<NativeUnifiedADData> list);

        void onNoAD(AdError adError);
    }

    public g(a aVar) {
        this.f3135a = aVar;
    }

    public NativeADUnifiedListener a() {
        return (NativeADUnifiedListener) Proxy.newProxyInstance(NativeADUnifiedListener.class.getClassLoader(), new Class[]{NativeADUnifiedListener.class}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (method != null) {
            try {
                if (this.f3135a != null) {
                    String name = method.getName();
                    Object obj2 = objArr[0];
                    if ("onADLoaded".equals(name)) {
                        this.f3135a.b((List) obj2);
                    } else if ("onNoAD".equals(name)) {
                        this.f3135a.onNoAD((AdError) obj2);
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
