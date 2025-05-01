package com.bytedance.sdk.openadsdk.live;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.android.live.base.api.ILiveHostContextParam;
import com.bytedance.android.live.base.api.ILiveInitCallback;
import com.bytedance.android.live.base.api.IOuterLiveService;
import com.bytedance.android.live.base.api.MethodChannelService;
import com.bytedance.android.openliveplugin.LivePluginHelper;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.TTCustomController;
import com.bytedance.sdk.openadsdk.TTPluginListener;
import com.bytedance.sdk.openadsdk.api.p;
import com.bytedance.sdk.openadsdk.live.core.TTHostPermissionInner;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.p.vv.vv.wv;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class m implements Bridge {
    private static final m vv = new m();

    /* renamed from: i  reason: collision with root package name */
    private Map<String, String> f8799i;

    /* renamed from: m  reason: collision with root package name */
    private ITTLiveTokenInjectionAuth f8800m;

    /* renamed from: o  reason: collision with root package name */
    private volatile C0226m f8801o;

    /* renamed from: p  reason: collision with root package name */
    private volatile Bridge f8802p;

    /* renamed from: com.bytedance.sdk.openadsdk.live.m$m  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private final class C0226m implements TTPluginListener {

        /* renamed from: m  reason: collision with root package name */
        String f8803m;
        int vv;

        private C0226m() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTPluginListener
        public Bundle config() {
            return null;
        }

        @Override // com.bytedance.sdk.openadsdk.TTPluginListener
        public void onPluginListener(int i4, ClassLoader classLoader, Resources resources, Bundle bundle) {
            vv(i4, classLoader, resources, bundle, false);
        }

        @Override // com.bytedance.sdk.openadsdk.TTPluginListener
        public String packageName() {
            return "com.byted.live.lite";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vv(int i4, ClassLoader classLoader, Resources resources, Bundle bundle, boolean z4) {
            this.vv = i4;
            if (m.this.f8802p != null) {
                m.this.f8802p.call(3, a.b().f(0, i4).h(1, classLoader).h(2, resources).h(3, bundle).h(4, m.this.vv(z4)).a(), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void vv(int i4, String str, boolean z4) {
            this.vv = i4;
            this.f8803m = str;
            if (m.this.f8802p != null) {
                a f5 = a.b().f(0, i4);
                if (str != null) {
                    f5.i(1, str);
                }
                f5.h(2, m.this.vv(z4));
                m.this.f8802p.call(2, f5.a(), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class vv implements Bridge {
        private ILiveAdCustomConfig vv;

        vv(ILiveAdCustomConfig iLiveAdCustomConfig) {
            this.vv = iLiveAdCustomConfig;
        }

        @Override // com.bykv.vk.openvk.api.proto.Caller
        public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                return null;
                            }
                            this.vv.onEventV3(valueSet.stringValue(0), (JSONObject) valueSet.objectValue(1, JSONObject.class));
                            return null;
                        }
                        return (T) this.vv.invoke(valueSet.intValue(0), (Bundle) valueSet.objectValue(1, Bundle.class));
                    }
                    return (T) this.vv.convertToEnterMethod(valueSet.intValue(0), valueSet.booleanValue(1));
                }
                return (T) this.vv.convertToEnterFromMerge(valueSet.intValue(0));
            }
            return (T) Integer.valueOf(this.vv.openLR(valueSet.stringValue(0)));
        }

        @Override // com.bykv.vk.openvk.api.proto.Bridge
        public ValueSet values() {
            return a.b().f(10000, 1).a();
        }
    }

    private m() {
    }

    private Context getContext(Object obj) {
        if (obj instanceof Context) {
            return (Context) obj;
        }
        return null;
    }

    private Object i(Map<String, Object> map) {
        try {
            String str = (String) map.get(TTLiveConstants.EXPAND_METHOD_NAME_KEY);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            IOuterLiveService liveRoomService = LivePluginHelper.getLiveRoomService();
            Object[] objArr = (Object[]) map.get(TTLiveConstants.EXPAND_METHOD_PARAM_KEY);
            if (objArr != null) {
                return liveRoomService.callExpandMethod(str, objArr);
            }
            return liveRoomService.callExpandMethod(str, new Object[0]);
        } catch (Throwable th) {
            p.m("TTLiveSDkBridge", th);
            return null;
        }
    }

    private Boolean o(Map<String, Object> map) {
        try {
            String str = (String) map.get(TTLiveConstants.SCHEME_URI_KEY);
            if (TextUtils.isEmpty(str)) {
                return Boolean.FALSE;
            }
            Context context = getContext(map.get("context"));
            Uri parse = Uri.parse(str);
            if (parse != null && context != null) {
                return Boolean.valueOf(com.bytedance.sdk.openadsdk.live.vv.vv(context, parse));
            }
            return Boolean.FALSE;
        } catch (Throwable th) {
            p.m("TTLiveSDkBridge", th);
            return Boolean.FALSE;
        }
    }

    private TTCustomController p(Map map) {
        Object obj = map.get(TTLiveConstants.INIT_CUSTOM_CONTROLLER);
        if (obj instanceof Bridge) {
            return new wv((Bridge) obj);
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 5) {
            m((Map) valueSet.objectValue(0, Map.class));
            return null;
        } else if (i4 != 9) {
            return (T) vv(cls, i4, (Map) valueSet.objectValue(0, Map.class));
        } else {
            this.f8802p = (Bridge) valueSet.objectValue(0, Bridge.class);
            if (this.f8801o != null) {
                if (this.f8801o.vv == 2 || this.f8801o.vv == -3) {
                    this.f8801o.vv(this.f8801o.vv, this.f8801o.f8803m, true);
                } else if (this.f8801o.vv != 0) {
                    this.f8801o.vv(this.f8801o.vv, null, null, null, true);
                }
            } else {
                this.f8801o = new C0226m();
                Bridge bridge = (Bridge) com.bytedance.sdk.openadsdk.vv.p.vv().call(10, a.c(1).f(0, 4).a(), Bridge.class);
                ValueSet a5 = a.c(1).h(0, this.f8801o).a();
                if (bridge != null) {
                    bridge.call(106, a5, Void.class);
                }
            }
            return null;
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return a.b().f(10000, 2).a();
    }

    private void m(Map map) {
        ILiveHostContextParam.Builder hostActionParam = new ILiveHostContextParam.Builder().setAppName(String.valueOf(map.get("app_name"))).setChannel(String.valueOf(map.get("channel"))).setIsDebug(Boolean.valueOf(String.valueOf(map.get("debug"))).booleanValue()).setECHostAppId(String.valueOf(map.get(TTLiveConstants.INIT_EC_HOST_APPID))).setPartner(String.valueOf(map.get("partner"))).provideMethodChannel(new MethodChannelService() { // from class: com.bytedance.sdk.openadsdk.live.m.1
            @Override // com.bytedance.android.live.base.api.MethodChannelService
            public String identity() {
                return MediationConstant.ADN_PANGLE;
            }

            @Override // com.bytedance.android.live.base.api.MethodChannelService
            public Object invokeMethod(String str, Map<String, String> map2) {
                if (m.this.f8802p != null) {
                    return m.this.f8802p.call(0, a.b().i(0, str).h(1, map2).a(), Object.class);
                }
                return null;
            }
        }).setPartnerSecret(TTLiveConstants.INIT_PARTENER_SECERET).setHostPermission(new TTHostPermissionInner(p(map))).setHostActionParam(new com.bytedance.sdk.openadsdk.live.core.vv(this.f8802p));
        ITTLiveTokenInjectionAuth iTTLiveTokenInjectionAuth = this.f8800m;
        if (iTTLiveTokenInjectionAuth != null) {
            hostActionParam.setInjectionAuth(new com.bytedance.sdk.openadsdk.live.core.m(iTTLiveTokenInjectionAuth));
        }
        Map<String, String> map2 = this.f8799i;
        if (map2 != null) {
            hostActionParam.addHostInitExtra(map2);
        }
        ILiveInitCallback iLiveInitCallback = new ILiveInitCallback() { // from class: com.bytedance.sdk.openadsdk.live.m.2
            @Override // com.bytedance.android.live.base.api.ILiveInitCallback
            public void onLiveInitFailed(String str) {
                p.vv("TTLiveSDkBridge", "onLiveInitFailed! ", str);
                if (m.this.f8801o != null) {
                    m.this.f8801o.vv(-3, str, false);
                }
            }

            @Override // com.bytedance.android.live.base.api.ILiveInitCallback
            public void onLiveInitFinish() {
                p.m("TTLiveSDkBridge", "onLiveInitFinish!");
                com.bytedance.sdk.openadsdk.live.vv.vv();
                if (m.this.f8801o != null) {
                    m.this.f8801o.vv(2, null, false);
                }
                m.this.f8799i = null;
                m.this.f8800m = null;
            }
        };
        if (TTAppContextHolder.getContext() instanceof Application) {
            hostActionParam.setContext((Application) TTAppContextHolder.getContext());
        }
        boolean booleanValue = Boolean.valueOf(String.valueOf(map.get(TTLiveConstants.INIT_SUB_PROCESS))).booleanValue();
        p.vv("TTLiveSDkBridge", "execute live sdk initLive method end, (方法顺利执行结果)result: ", Boolean.valueOf(com.bytedance.sdk.openadsdk.live.vv.vv(TTAppContextHolder.getContext(), String.valueOf(map.get(TTLiveConstants.INIT_GENERATE_APPID)), hostActionParam, iLiveInitCallback, booleanValue)), " subProcess=", Boolean.valueOf(booleanValue));
    }

    public static m vv() {
        return vv;
    }

    public static Bridge vv(ILiveAdCustomConfig iLiveAdCustomConfig) {
        return new vv(iLiveAdCustomConfig);
    }

    public void vv(ITTLiveTokenInjectionAuth iTTLiveTokenInjectionAuth) {
        this.f8800m = iTTLiveTokenInjectionAuth;
    }

    public void vv(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        this.f8799i = map;
    }

    public <T> T vv(Class<T> cls, int i4, Map<String, Object> map) {
        if (i4 == 0) {
            if (!com.bytedance.sdk.openadsdk.live.vv.vv(getContext(map.get("context")), vv(map.get(TTLiveConstants.BUNDLE_KEY)))) {
                return (T) 2;
            }
            return (T) 0;
        } else if (i4 != 7) {
            if (i4 != 8) {
                return null;
            }
            return (T) o(map);
        } else {
            return (T) i(map);
        }
    }

    private Bundle vv(Object obj) {
        if (obj instanceof Bundle) {
            return (Bundle) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map vv(boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("onlyUpdateState", Boolean.valueOf(z4));
        return hashMap;
    }
}
