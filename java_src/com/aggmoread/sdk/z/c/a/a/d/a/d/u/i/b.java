package com.aggmoread.sdk.z.c.a.a.d.a.d.u.i;

import androidx.annotation.Nullable;
import com.kwad.sdk.api.KsLoadManager;
import com.kwad.sdk.api.KsRewardVideoAd;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
/* loaded from: classes2.dex */
public class b implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private a f3235a;

    /* loaded from: classes2.dex */
    public interface a {
        void c(@Nullable List<KsRewardVideoAd> list);

        void d(@Nullable List<KsRewardVideoAd> list);

        void onError(int i4, String str);

        void onRequestResult(int i4);
    }

    public b(a aVar) {
        this.f3235a = aVar;
    }

    public KsLoadManager.RewardVideoAdListener a() {
        return (KsLoadManager.RewardVideoAdListener) Proxy.newProxyInstance(KsLoadManager.RewardVideoAdListener.class.getClassLoader(), new Class[]{KsLoadManager.RewardVideoAdListener.class}, this);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (this.f3235a == null) {
            return null;
        }
        if ("onError".equals(name)) {
            this.f3235a.onError(((Integer) objArr[0]).intValue(), (String) objArr[1]);
        } else if ("onRewardVideoResult".equals(name)) {
            this.f3235a.c(objArr[0] == null ? null : (List) objArr[0]);
        } else if ("onRequestResult".equals(name)) {
            this.f3235a.onRequestResult(((Integer) objArr[0]).intValue());
        } else if ("onRewardVideoAdLoad".equals(name)) {
            this.f3235a.d(objArr[0] == null ? null : (List) objArr[0]);
        }
        return null;
    }
}
