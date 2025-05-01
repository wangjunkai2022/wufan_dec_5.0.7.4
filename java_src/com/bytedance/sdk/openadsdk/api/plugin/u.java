package com.bytedance.sdk.openadsdk.api.plugin;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.Initializer;
import com.bykv.vk.openvk.api.proto.Result;
import com.bykv.vv.vv.vv.vv.a;
import com.bykv.vv.vv.vv.vv.b;
import com.bytedance.android.openliveplugin.process.LiveProcessUtils;
import com.bytedance.pangle.Zeus;
import com.bytedance.sdk.openadsdk.AdConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTPluginListener;
import com.bytedance.sdk.openadsdk.api.plugin.o;
import com.bytedance.sdk.openadsdk.api.vv;
import com.bytedance.sdk.openadsdk.live.ILiveAdCustomConfig;
import dalvik.system.BaseDexClassLoader;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class u extends com.bytedance.sdk.openadsdk.api.vv {
    private static final vv vv = new vv();

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.vv.m f8728i = new com.bytedance.sdk.openadsdk.vv.m() { // from class: com.bytedance.sdk.openadsdk.api.plugin.u.1
        @Override // com.bytedance.sdk.openadsdk.vv.m
        public Bridge vv(int i4) {
            return u.this.vv(i4);
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private volatile Initializer f8729m;

    /* renamed from: p  reason: collision with root package name */
    private i f8730p;

    /* loaded from: classes2.dex */
    private static final class vv extends vv.p {
        private vv() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.vv.p
        protected void vv(Throwable th) {
            o.vv(th);
        }

        @Override // com.bytedance.sdk.openadsdk.api.vv.p
        protected Object vv(Object obj) {
            boolean z4 = obj instanceof TTPluginListener;
            if (z4) {
                o.vv(TTAppContextHolder.getContext()).vv((TTPluginListener) obj);
            }
            if (!z4) {
                return obj instanceof ILiveAdCustomConfig ? com.bytedance.sdk.openadsdk.live.m.vv((ILiveAdCustomConfig) obj) : obj;
            }
            TTPluginListener tTPluginListener = (TTPluginListener) obj;
            return o.vv(TTAppContextHolder.getContext()).vv(tTPluginListener.packageName(), tTPluginListener.config());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.vv
    protected boolean m(Context context, AdConfig adConfig, TTAdSdk.InitCallback initCallback) {
        super.m(context, adConfig, initCallback);
        this.f8730p = i.vv("duration");
        if (LiveProcessUtils.inLiveProcess(TTAppContextHolder.getContext()).booleanValue()) {
            return false;
        }
        p.vv(adConfig);
        if (Build.VERSION.SDK_INT < 21) {
            m(b.b().f(false).c(4204).e("Only support >= 5.0").a());
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.vv
    protected com.bytedance.sdk.openadsdk.vv.m p() {
        return this.f8728i;
    }

    @Override // com.bytedance.sdk.openadsdk.api.vv
    protected void vv(Result result) {
        if (result.isSuccess()) {
            Bundle bundle = new Bundle();
            bundle.putInt("action", 0);
            ExecutorService executorService = (ExecutorService) TTAdSdk.getAdManager().getExtra(ExecutorService.class, bundle);
            if (executorService != null) {
                com.bytedance.sdk.openadsdk.o.vv.vv().vv(executorService);
            }
            p.vv();
            return;
        }
        p.vv(result.code(), result.message(), 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.api.vv
    public void m(Context context, a aVar) {
        i iVar = this.f8730p;
        if (iVar == null) {
            iVar = i.vv("duration");
        }
        iVar.m("wait_asyn_cost");
        try {
            Initializer vv2 = vv(iVar);
            try {
                if (vv2 != null) {
                    vv(vv2.getManager());
                    try {
                        iVar.vv();
                        JSONObject jSONObject = new JSONObject();
                        iVar.vv(jSONObject, 20L);
                        jSONObject.put("zeus", o.vv(TTAppContextHolder.getContext()).vv());
                        vv2.init(context, aVar.h(9, jSONObject).a());
                        if (context != null) {
                            Zeus.hookHuaWeiVerifier((Application) context.getApplicationContext());
                            return;
                        }
                        return;
                    } catch (Exception e5) {
                        Zeus.unInstallPlugin("com.byted.pangle");
                        m(b.b().f(false).c(4207).e("Init error").a());
                        throw e5;
                    }
                }
                m(b.b().f(false).c(TTAdConstant.INIT_FAILED_CREATE_INITIALIZER_FAILED).e("Init error").a());
            } catch (Throwable th) {
                th.printStackTrace();
                b c5 = b.b().f(false).c(4203);
                m(c5.e("UnExpected initializer error :" + th.getMessage()).a());
            }
        } catch (com.bytedance.sdk.openadsdk.api.plugin.vv e6) {
            e6.printStackTrace();
            m(b.b().f(false).c(e6.vv()).e(e6.getMessage()).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bridge vv(int i4) {
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    return null;
                }
                return com.bytedance.sdk.openadsdk.api.plugin.vv.vv.vv();
            }
            return com.bytedance.sdk.openadsdk.downloadnew.i.vv(TTAppContextHolder.getContext());
        }
        return com.bytedance.sdk.openadsdk.live.m.vv();
    }

    @Override // com.bytedance.sdk.openadsdk.api.vv
    public boolean vv(Context context, a aVar) {
        if (this.f8729m != null) {
            this.f8729m.init(context, aVar.a());
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.api.vv
    public boolean vv() {
        if (this.f8729m != null) {
            return this.f8729m.isInitSuccess();
        }
        return false;
    }

    private Initializer vv(i iVar) throws com.bytedance.sdk.openadsdk.api.plugin.vv {
        if (this.f8729m == null) {
            synchronized (this) {
                if (this.f8729m == null) {
                    com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", "Create initializer");
                    this.f8729m = m(iVar);
                }
            }
        }
        return this.f8729m;
    }

    @Override // com.bytedance.sdk.openadsdk.api.vv
    public vv.p m() {
        return vv;
    }

    private static Initializer m(i iVar) throws com.bytedance.sdk.openadsdk.api.plugin.vv {
        try {
            iVar.m("call_create_initializer");
            BaseDexClassLoader vv2 = o.vv(TTAppContextHolder.getContext()).vv(iVar);
            if (vv2 != null) {
                Class<?> loadClass = vv2.loadClass(TTAdSdk.INITIALIZER_CLASS_NAME);
                iVar.m("get_init_class_cost");
                Bundle bundle = new Bundle();
                bundle.putLong("call_init_time", iVar.m());
                bundle.putSerializable(PluginConstants.KEY_PL_UPDATE_EVENT_LISTENER, new o.p());
                iVar.m("create_bundle_cost");
                Method declaredMethod = loadClass.getDeclaredMethod("getNewInstance", Bundle.class);
                iVar.m("get_init_method_cost");
                Initializer initializer = (Initializer) declaredMethod.invoke(null, bundle);
                iVar.m("get_init_instance_cost");
                com.bytedance.sdk.openadsdk.api.p.m("TTPluginManager", "Create initializer success");
                return initializer;
            }
            throw new com.bytedance.sdk.openadsdk.api.plugin.vv(4205, "Get initializer failed");
        } catch (Throwable th) {
            if (th instanceof com.bytedance.sdk.openadsdk.api.plugin.vv) {
                throw new com.bytedance.sdk.openadsdk.api.plugin.vv(4205, "(" + th.vv() + ", " + th.getMessage() + ")");
            }
            throw new com.bytedance.sdk.openadsdk.api.plugin.vv(4206, th.getMessage());
        }
    }
}
