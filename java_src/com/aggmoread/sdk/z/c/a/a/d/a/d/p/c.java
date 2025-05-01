package com.aggmoread.sdk.z.c.a.a.d.a.d.p;

import com.baidu.mobads.sdk.api.BaiduNativeManager;
import com.baidu.mobads.sdk.api.ExpressInterstitialListener;
import com.baidu.mobads.sdk.api.ExpressResponse;
import com.baidu.mobads.sdk.api.MobadsPermissionSettings;
import com.baidu.mobads.sdk.api.NativeResponse;
import com.baidu.mobads.sdk.api.SplashInteractionListener;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static c f2938a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f2939a;

        a(c cVar, j jVar) {
            this.f2939a = jVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method != null) {
                try {
                    if (this.f2939a != null) {
                        String name = method.getName();
                        if ("onAdClick".equals(name)) {
                            this.f2939a.onAdClick();
                        } else if ("onADLoaded".equals(name)) {
                            this.f2939a.f();
                        } else if ("onAdClose".equals(name)) {
                            this.f2939a.g();
                        } else if ("onAdFailed".equals(name)) {
                            this.f2939a.b(((Integer) objArr[0]).intValue(), (String) objArr[1]);
                        } else if ("onNoAd".equals(name)) {
                            this.f2939a.a(((Integer) objArr[0]).intValue(), (String) objArr[1]);
                        } else if ("onAdCacheSuccess".equals(name)) {
                            this.f2939a.e();
                        } else if ("onAdCacheFailed".equals(name)) {
                            this.f2939a.b();
                        } else if ("onADExposed".equals(name)) {
                            this.f2939a.onADExposed();
                        } else if ("onADExposureFailed".equals(name)) {
                            this.f2939a.h();
                        } else if ("onVideoDownloadSuccess".equals(name)) {
                            this.f2939a.onVideoDownloadSuccess();
                        } else if ("onVideoDownloadFailed".equals(name)) {
                            this.f2939a.onVideoDownloadFailed();
                        } else if ("onLpClosed".equals(name)) {
                            this.f2939a.c();
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

    /* loaded from: classes2.dex */
    class b implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f2940a;

        b(c cVar, g gVar) {
            this.f2940a = gVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method != null) {
                try {
                    if (this.f2940a != null) {
                        if ("onDislikeWindowShow".equals(method.getName())) {
                            this.f2940a.a();
                        } else if ("onDislikeItemClick".equals(method.getName())) {
                            this.f2940a.c();
                        } else if ("onDislikeWindowClose".equals(method.getName())) {
                            this.f2940a.b();
                        }
                    }
                    return null;
                } catch (Exception unused) {
                    return null;
                }
            }
            return null;
        }
    }

    /* renamed from: com.aggmoread.sdk.z.c.a.a.d.a.d.p.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0106c implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f2941a;

        C0106c(c cVar, k kVar) {
            this.f2941a = kVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method != null) {
                try {
                    if (this.f2941a != null) {
                        String name = method.getName();
                        if ("onLpClosed".equals(name)) {
                            this.f2941a.c();
                        } else if ("onAdPresent".equals(name)) {
                            this.f2941a.g();
                        } else if ("onAdExposed".equals(name)) {
                            this.f2941a.onAdExposed();
                        } else if ("onAdDismissed".equals(name)) {
                            this.f2941a.a();
                        } else if ("onAdSkip".equals(name)) {
                            this.f2941a.d();
                        } else if ("onAdClick".equals(name)) {
                            this.f2941a.onAdClick();
                        } else if ("onAdCacheSuccess".equals(name)) {
                            this.f2941a.e();
                        } else if ("onAdCacheFailed".equals(name)) {
                            this.f2941a.b();
                        } else if ("onADLoaded".equals(name)) {
                            this.f2941a.f();
                        } else if ("onAdFailed".equals(name)) {
                            this.f2941a.onAdFailed((String) objArr[0]);
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

    /* loaded from: classes2.dex */
    class d implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f2942a;

        d(i iVar) {
            this.f2942a = iVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method != null) {
                try {
                    if (this.f2942a != null) {
                        String name = method.getName();
                        if ("onNoAd".equals(name)) {
                            f a5 = c.this.a(objArr);
                            Object obj2 = a5.f2948c;
                            this.f2942a.b(a5.f2946a, a5.f2947b, obj2 instanceof NativeResponse ? (NativeResponse) obj2 : null);
                        } else if ("onNativeFail".equals(name)) {
                            f a6 = c.this.a(objArr);
                            Object obj3 = a6.f2948c;
                            this.f2942a.a(a6.f2946a, a6.f2947b, obj3 instanceof NativeResponse ? (NativeResponse) obj3 : null);
                        } else if ("onNativeLoad".equals(name)) {
                            this.f2942a.a((List) objArr[0]);
                        } else if ("onVideoDownloadSuccess".equals(name)) {
                            this.f2942a.onVideoDownloadSuccess();
                        } else if ("onVideoDownloadFailed".equals(name)) {
                            this.f2942a.onVideoDownloadFailed();
                        } else if ("onLpClosed".equals(name)) {
                            this.f2942a.c();
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    class e implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f2944a;

        e(h hVar) {
            this.f2944a = hVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method != null) {
                try {
                    if (this.f2944a != null) {
                        String name = method.getName();
                        if ("onNoAd".equals(name)) {
                            f a5 = c.this.a(objArr);
                            Object obj2 = a5.f2948c;
                            this.f2944a.b(a5.f2946a, a5.f2947b, obj2 instanceof ExpressResponse ? (ExpressResponse) obj2 : null);
                        } else if ("onNativeFail".equals(name)) {
                            f a6 = c.this.a(objArr);
                            Object obj3 = a6.f2948c;
                            this.f2944a.a(a6.f2946a, a6.f2947b, obj3 instanceof ExpressResponse ? (ExpressResponse) obj3 : null);
                        } else if ("onNativeLoad".equals(name)) {
                            this.f2944a.a((List) objArr[0]);
                        } else if ("onVideoDownloadSuccess".equals(name)) {
                            this.f2944a.onVideoDownloadSuccess();
                        } else if ("onVideoDownloadFailed".equals(name)) {
                            this.f2944a.onVideoDownloadFailed();
                        } else if ("onLpClosed".equals(name)) {
                            this.f2944a.c();
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f2946a;

        /* renamed from: b  reason: collision with root package name */
        public String f2947b;

        /* renamed from: c  reason: collision with root package name */
        public Object f2948c;

        private f() {
            this.f2946a = -1;
        }

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public interface g {
        void a();

        void b();

        void c();
    }

    /* loaded from: classes2.dex */
    public interface h {
        void a(int i4, String str, ExpressResponse expressResponse);

        void a(List<ExpressResponse> list);

        void b(int i4, String str, ExpressResponse expressResponse);

        void c();

        void onVideoDownloadFailed();

        void onVideoDownloadSuccess();
    }

    /* loaded from: classes2.dex */
    public interface i {
        void a(int i4, String str, NativeResponse nativeResponse);

        void a(List<NativeResponse> list);

        void b(int i4, String str, NativeResponse nativeResponse);

        void c();

        void onVideoDownloadFailed();

        void onVideoDownloadSuccess();
    }

    /* loaded from: classes2.dex */
    public interface j {
        void a(int i4, String str);

        void b();

        void b(int i4, String str);

        void c();

        void e();

        void f();

        void g();

        void h();

        void onADExposed();

        void onAdClick();

        void onVideoDownloadFailed();

        void onVideoDownloadSuccess();
    }

    /* loaded from: classes2.dex */
    public interface k {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();

        void onAdClick();

        void onAdExposed();

        void onAdFailed(String str);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f a(Object[] objArr) {
        f fVar = new f(null);
        if (objArr != null) {
            if (objArr.length >= 1) {
                fVar.f2946a = ((Integer) objArr[0]).intValue();
            }
            if (objArr.length >= 2 && (objArr[1] instanceof String)) {
                fVar.f2947b = objArr[1].toString();
            }
            if (objArr.length >= 3) {
                fVar.f2948c = objArr[2];
            }
        }
        return fVar;
    }

    public static synchronized c a() {
        c cVar;
        synchronized (c.class) {
            if (f2938a == null) {
                synchronized (c.class) {
                    if (f2938a == null) {
                        f2938a = new c();
                    }
                }
            }
            cVar = f2938a;
        }
        return cVar;
    }

    public static void a(boolean z4) {
        com.aggmoread.sdk.z.c.a.a.e.e.a("bd ap " + z4);
        try {
            MobadsPermissionSettings.setLimitPersonalAds(z4);
        } catch (Exception e5) {
            com.aggmoread.sdk.z.c.a.a.e.e.a("ap e" + e5);
        }
    }

    public BaiduNativeManager.ExpressAdListener a(h hVar) {
        return (BaiduNativeManager.ExpressAdListener) Proxy.newProxyInstance(BaiduNativeManager.ExpressAdListener.class.getClassLoader(), new Class[]{BaiduNativeManager.ExpressAdListener.class}, new e(hVar));
    }

    public BaiduNativeManager.FeedAdListener a(i iVar) {
        return (BaiduNativeManager.FeedAdListener) Proxy.newProxyInstance(BaiduNativeManager.FeedAdListener.class.getClassLoader(), new Class[]{BaiduNativeManager.FeedAdListener.class}, new d(iVar));
    }

    public ExpressInterstitialListener a(j jVar) {
        return (ExpressInterstitialListener) Proxy.newProxyInstance(ExpressInterstitialListener.class.getClassLoader(), new Class[]{ExpressInterstitialListener.class}, new a(this, jVar));
    }

    public ExpressResponse.ExpressDislikeListener a(g gVar) {
        return (ExpressResponse.ExpressDislikeListener) Proxy.newProxyInstance(ExpressResponse.ExpressDislikeListener.class.getClassLoader(), new Class[]{ExpressResponse.ExpressDislikeListener.class}, new b(this, gVar));
    }

    public SplashInteractionListener a(k kVar) {
        return (SplashInteractionListener) Proxy.newProxyInstance(SplashInteractionListener.class.getClassLoader(), new Class[]{SplashInteractionListener.class}, new C0106c(this, kVar));
    }
}
