package com.aggmoread.sdk.z.c.a.a.d.a.d.u.g;

import androidx.annotation.Nullable;
import com.kwad.sdk.api.KsFullScreenVideoAd;
import com.kwad.sdk.api.KsLoadManager;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
/* loaded from: classes2.dex */
public class b implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private a f3214a;

    /* loaded from: classes2.dex */
    public interface a {
        void a(@Nullable List<KsFullScreenVideoAd> list);

        void b(@Nullable List<KsFullScreenVideoAd> list);

        void onError(int i4, String str);

        void onRequestResult(int i4);
    }

    public b(a aVar) {
        this.f3214a = aVar;
    }

    public KsLoadManager.FullScreenVideoAdListener a() {
        return (KsLoadManager.FullScreenVideoAdListener) Proxy.newProxyInstance(KsLoadManager.FullScreenVideoAdListener.class.getClassLoader(), new Class[]{KsLoadManager.FullScreenVideoAdListener.class}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (this.f3214a == null) {
            return null;
        }
        if ("onError".equals(name)) {
            this.f3214a.onError(((Integer) objArr[0]).intValue(), (String) objArr[1]);
        } else if ("onFullScreenVideoResult".equals(name)) {
            this.f3214a.b(objArr[0] == null ? null : (List) objArr[0]);
        } else if ("onRequestResult".equals(name)) {
            this.f3214a.onRequestResult(((Integer) objArr[0]).intValue());
        } else if ("onFullScreenVideoAdLoad".equals(name)) {
            this.f3214a.a(objArr[0] == null ? null : (List) objArr[0]);
        }
        return null;
    }
}
