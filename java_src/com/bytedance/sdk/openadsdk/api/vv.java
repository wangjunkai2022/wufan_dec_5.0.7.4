package com.bytedance.sdk.openadsdk.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.Loader;
import com.bykv.vk.openvk.api.proto.Manager;
import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.AdConfig;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.downloadnew.core.DownloadBridgeFactory;
import com.bytedance.sdk.openadsdk.downloadnew.core.ExitInstallListener;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.bytedance.sdk.openadsdk.mediation.MediationApiLog;
import com.bytedance.sdk.openadsdk.mediation.MediationTTLiveTokenInjectionAuthImpl;
import com.bytedance.sdk.openadsdk.mediation.bridge.init.MediationInitCLassLoader;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes2.dex */
public abstract class vv {
    private TTAdSdk.InitCallback vv;

    /* loaded from: classes2.dex */
    private class i implements EventListener {
        private i() {
        }

        @Override // com.bykv.vk.openvk.api.proto.EventListener
        public ValueSet onEvent(int i4, Result result) {
            vv.this.m(result);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public interface m<T> {
        void vv(T t4);
    }

    /* loaded from: classes2.dex */
    public static abstract class p implements TTAdManager {

        /* renamed from: m  reason: collision with root package name */
        private volatile boolean f8754m;

        /* renamed from: p  reason: collision with root package name */
        private List<WeakReference<m<Manager>>> f8755p = new CopyOnWriteArrayList();
        private volatile Manager vv;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.bytedance.sdk.openadsdk.api.vv$p$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        public class AnonymousClass1 extends AbstractC0224vv<Loader> {

            /* renamed from: m  reason: collision with root package name */
            final m<Manager> f8757m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ SoftReference f8758p;
            Loader vv;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SoftReference softReference) {
                super();
                this.f8758p = softReference;
                this.f8757m = new m<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.vv.p.1.1
                    @Override // com.bytedance.sdk.openadsdk.api.vv.m
                    public void vv(Manager manager) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        anonymousClass1.vv = manager.createLoader((Context) anonymousClass1.f8758p.get());
                    }
                };
            }

            @Override // com.bytedance.sdk.openadsdk.api.vv.AbstractC0224vv
            public void vv(final m<Loader> mVar, int i4) {
                Loader loader = this.vv;
                if (loader != null) {
                    mVar.vv(loader);
                } else {
                    p.this.call(new m<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.vv.p.1.2
                        @Override // com.bytedance.sdk.openadsdk.api.vv.m
                        public void vv(Manager manager) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            p.this.vv(anonymousClass1.f8757m);
                            AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                            anonymousClass12.vv = manager.createLoader((Context) anonymousClass12.f8758p.get());
                            mVar.vv(AnonymousClass1.this.vv);
                        }
                    }, i4 + 10000);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void call(final m<Manager> mVar, final int i4) {
            if (this.vv != null) {
                try {
                    mVar.vv(this.vv);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.api.p.i("_tt_ad_sdk_", "Unexpected manager call error: " + th.getMessage());
                    vv(th);
                }
            } else if (!this.f8754m && i4 > 10000) {
                throw new IllegalStateException("广告SDK未Ready, 请在load(请求广告）之前，先调用init and start方法，以避免无法请求广告");
            } else {
                com.bytedance.sdk.openadsdk.o.vv.vv().vv(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.vv.p.7
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (p.this.vv != null) {
                                mVar.vv(p.this.vv);
                                return;
                            }
                            com.bytedance.sdk.openadsdk.api.p.i("_tt_ad_sdk_", "Not ready, no manager: " + i4);
                        } catch (Throwable th2) {
                            com.bytedance.sdk.openadsdk.api.p.i("_tt_ad_sdk_", "Unexpected manager call error: " + th2.getMessage());
                            p.this.vv(th2);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T m(Manager manager, Class<T> cls, Bundle bundle) {
            return (T) manager.getBridge(1).call(6, a.c(2).h(9, cls).h(10, bundle).a(), cls);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public TTAdNative createAdNative(Context context) {
            return new o(new AnonymousClass1(new SoftReference(context))).vv();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public String getBiddingToken(AdSlot adSlot) {
            return getBiddingToken(adSlot, false, adSlot.getAdType() > 0 ? adSlot.getAdType() : adSlot.getNativeAdType());
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public <T> T getExtra(final Class<T> cls, final Bundle bundle) {
            if (this.vv != null) {
                return (T) m(this.vv, cls, bundle);
            }
            call(new m<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.vv.p.4
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Manager manager) {
                    p.m(p.this.vv, cls, bundle);
                }
            }, 6);
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public String getPluginVersion() {
            return this.vv != null ? this.vv.values().stringValue(12) : "";
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public String getSDKVersion() {
            return "6.2.1.7";
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public int getThemeStatus() {
            if (this.vv != null) {
                return this.vv.values().intValue(11);
            }
            return 0;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public void register(final Object obj) {
            call(new m<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.vv.p.2
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Manager manager) {
                    manager.getBridge(1).call(4, a.c(1).h(8, p.this.vv(obj)).a(), Void.class);
                }
            }, 4);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public void requestPermissionIfNecessary(final Context context) {
            call(new m<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.vv.p.5
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Manager manager) {
                    manager.getBridge(1).call(3, a.c(1).h(7, context).a(), Void.class);
                }
            }, 3);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public void setThemeStatus(final int i4) {
            call(new m<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.vv.p.6
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Manager manager) {
                    manager.getBridge(1).call(1, a.b().f(11, i4).a(), Void.class);
                }
            }, 1);
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public boolean tryShowInstallDialogWhenExit(Activity activity, ExitInstallListener exitInstallListener) {
            HashMap hashMap = new HashMap();
            hashMap.put(TTDownloadField.TT_ACTIVITY, activity);
            hashMap.put(TTDownloadField.TT_EXIT_INSTALL_LISTENER, exitInstallListener);
            return ((Boolean) DownloadBridgeFactory.getDownloadBridge(TTAppContextHolder.getContext()).call(0, a.c(1).h(0, hashMap).a(), Boolean.class)).booleanValue();
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public void unregister(final Object obj) {
            call(new m<Manager>() { // from class: com.bytedance.sdk.openadsdk.api.vv.p.3
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Manager manager) {
                    manager.getBridge(1).call(5, a.c(1).h(8, obj).a(), Void.class);
                }
            }, 5);
        }

        protected Object vv(Object obj) {
            return obj;
        }

        protected void vv(Throwable th) {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdManager
        public String getBiddingToken(AdSlot adSlot, boolean z4, int i4) {
            if (i4 <= 0) {
                i4 = adSlot.getAdType() > 0 ? adSlot.getAdType() : adSlot.getNativeAdType();
            }
            ValueSet a5 = a.k(com.bytedance.sdk.openadsdk.p.vv.p.m.m(adSlot)).j(13, z4).f(14, i4).a();
            if (this.vv != null) {
                return (String) this.vv.getBridge(1).call(2, a5, String.class);
            }
            return null;
        }

        public void vv(boolean z4) {
            this.f8754m = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vv(Manager manager) {
            this.vv = manager;
            if (this.vv != null) {
                Iterator<WeakReference<m<Manager>>> it2 = this.f8755p.iterator();
                while (it2.hasNext()) {
                    WeakReference<m<Manager>> next = it2.next();
                    m<Manager> mVar = next != null ? next.get() : null;
                    if (mVar != null) {
                        mVar.vv(manager);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vv(m<Manager> mVar) {
            this.f8755p.add(new WeakReference<>(mVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.api.vv$vv  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0224vv<T> {
        private AbstractC0224vv() {
        }

        abstract void vv(m<T> mVar, int i4);
    }

    public abstract p m();

    public abstract void m(Context context, a aVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(Result result) {
        vv(result);
        if (result.isSuccess()) {
            com.bytedance.sdk.openadsdk.api.p.m("_tt_ad_sdk_", "init sdk success ");
            TTAdSdk.InitCallback initCallback = this.vv;
            if (initCallback != null) {
                initCallback.success();
            }
        } else {
            com.bytedance.sdk.openadsdk.api.p.o("_tt_ad_sdk_", "int sdk failed, code: " + result.code() + ", message: " + result.message());
            TTAdSdk.InitCallback initCallback2 = this.vv;
            if (initCallback2 != null) {
                initCallback2.fail(result.code(), result.message() != null ? result.message() : "");
            }
        }
        this.vv = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean m(Context context, AdConfig adConfig, TTAdSdk.InitCallback initCallback) {
        return false;
    }

    protected abstract com.bytedance.sdk.openadsdk.vv.m p();

    public void vv(final Context context, AdConfig adConfig, TTAdSdk.InitCallback initCallback) {
        com.bytedance.sdk.openadsdk.vv.p.vv().vv(p());
        if (m(context, adConfig, initCallback)) {
            this.vv = initCallback;
            final a k4 = a.k(com.bytedance.sdk.openadsdk.p.vv.p.vv.vv(adConfig));
            k4.g(1, SystemClock.elapsedRealtime());
            k4.i(5, "main");
            k4.j(4, true);
            k4.f(6, 999);
            k4.f(10, 6217);
            k4.i(11, "6.2.1.7");
            k4.i(12, "com.byted.pangle");
            k4.j(14, false);
            k4.h(16, com.bytedance.sdk.openadsdk.vv.p.vv());
            Thread currentThread = Thread.currentThread();
            k4.i(2, currentThread.getName());
            k4.f(3, currentThread.getPriority());
            k4.h(15, new i());
            k4.h(8301, new MediationInitCLassLoader());
            if (adConfig instanceof TTAdConfig) {
                k4.h(8318, new MediationTTLiveTokenInjectionAuthImpl(((TTAdConfig) adConfig).getInjectionAuth()));
            }
            if (adConfig != null) {
                MediationApiLog.setDebug(Boolean.valueOf(adConfig.isDebug()));
            }
            if (!vv(context, k4)) {
                com.bytedance.sdk.openadsdk.o.vv.vv().vv(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.vv.1
                    @Override // java.lang.Runnable
                    public void run() {
                        vv.this.m(context, k4);
                    }
                });
            }
            m().vv(true);
        }
    }

    protected void vv(Result result) {
    }

    public abstract boolean vv();

    public abstract boolean vv(Context context, a aVar);

    /* loaded from: classes2.dex */
    private static class o extends com.bytedance.sdk.openadsdk.p.vv.vv {
        private AbstractC0224vv<Loader> vv;

        o(AbstractC0224vv<Loader> abstractC0224vv) {
            this.vv = abstractC0224vv;
        }

        private void vv(m<Loader> mVar, int i4) {
            com.bytedance.sdk.openadsdk.api.p.m("_tt_ad_sdk_", "load ad slot type: ".concat(String.valueOf(i4)));
            this.vv.vv(mVar, i4);
        }

        @Override // com.bytedance.sdk.openadsdk.p.vv.vv
        public void i(final ValueSet valueSet, final Bridge bridge) {
            vv(new m<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.vv.o.5
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Loader loader) {
                    loader.load(1, a.k(valueSet).h(1, bridge).a(), null);
                }
            }, 1);
        }

        @Override // com.bytedance.sdk.openadsdk.p.vv.vv
        public void m(final ValueSet valueSet, final Bridge bridge) {
            vv(new m<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.vv.o.3
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Loader loader) {
                    loader.load(6, a.k(valueSet).h(1, bridge).a(), null);
                }
            }, 6);
        }

        @Override // com.bytedance.sdk.openadsdk.p.vv.vv
        public void n(final ValueSet valueSet, final Bridge bridge) {
            vv(new m<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.vv.o.9
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Loader loader) {
                    loader.load(5, a.k(valueSet).j(2, true).h(1, bridge).a(), null);
                }
            }, 5);
        }

        @Override // com.bytedance.sdk.openadsdk.p.vv.vv
        public void o(final ValueSet valueSet, final Bridge bridge) {
            vv(new m<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.vv.o.7
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Loader loader) {
                    loader.load(7, a.k(valueSet).h(1, bridge).a(), null);
                }
            }, 7);
        }

        @Override // com.bytedance.sdk.openadsdk.p.vv.vv
        public void p(final ValueSet valueSet, final Bridge bridge) {
            vv(new m<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.vv.o.4
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Loader loader) {
                    loader.load(9, a.k(valueSet).h(1, bridge).a(), null);
                }
            }, 9);
        }

        @Override // com.bytedance.sdk.openadsdk.p.vv.vv
        public void qv(final ValueSet valueSet, final Bridge bridge) {
            vv(new m<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.vv.o.10
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Loader loader) {
                    loader.load(9, a.k(valueSet).j(2, true).h(1, bridge).a(), null);
                }
            }, 9);
        }

        @Override // com.bytedance.sdk.openadsdk.p.vv.vv
        public void u(final ValueSet valueSet, final Bridge bridge) {
            vv(new m<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.vv.o.8
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Loader loader) {
                    loader.load(8, a.k(valueSet).h(1, bridge).a(), null);
                }
            }, 8);
        }

        @Override // com.bytedance.sdk.openadsdk.p.vv.vv
        public void wv(final ValueSet valueSet, final Bridge bridge) {
            vv(new m<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.vv.o.2
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Loader loader) {
                    loader.load(1, a.k(valueSet).j(2, true).h(1, bridge).a(), null);
                }
            }, 1);
        }

        @Override // com.bytedance.sdk.openadsdk.p.vv.vv
        public void vv(final ValueSet valueSet, final Bridge bridge) {
            vv(new m<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.vv.o.1
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Loader loader) {
                    loader.load(5, a.k(valueSet).h(1, bridge).a(), null);
                }
            }, 5);
        }

        @Override // com.bytedance.sdk.openadsdk.p.vv.vv
        public void vv(final ValueSet valueSet, final Bridge bridge, final int i4) {
            vv(new m<Loader>() { // from class: com.bytedance.sdk.openadsdk.api.vv.o.6
                @Override // com.bytedance.sdk.openadsdk.api.vv.m
                public void vv(Loader loader) {
                    loader.load(3, a.k(valueSet).f(3, i4).h(1, bridge).a(), null);
                }
            }, 3);
        }

        @Override // com.bytedance.sdk.openadsdk.p.vv.vv
        public Pair<Integer, String> vv(Exception exc) {
            com.bytedance.sdk.openadsdk.api.p.i("_tt_ad_sdk_", "Load ad failed: " + exc.getMessage());
            if ((exc instanceof IllegalStateException) && "广告SDK未Ready, 请在load(请求广告）之前，先调用init and start方法，以避免无法请求广告".equals(exc.getMessage())) {
                return new Pair<>(4208, exc.getMessage());
            }
            Integer valueOf = Integer.valueOf((int) TTAdConstant.INIT_FAILED_CREATE_INVOKE_FAILED);
            return new Pair<>(valueOf, "Load ad failed: " + exc.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void vv(Manager manager) {
        com.bytedance.sdk.openadsdk.api.p.m("_tt_ad_sdk_", "update manager");
        m().vv(manager);
        m().register(com.bytedance.sdk.openadsdk.vv.p.vv());
    }
}
