package com.beizi.fusion;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import java.util.Map;
/* compiled from: MBridgeSDKManager.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    private static d f6504e;

    /* renamed from: a  reason: collision with root package name */
    private Context f6505a;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f6506b;

    /* renamed from: c  reason: collision with root package name */
    private volatile String f6507c;

    /* renamed from: d  reason: collision with root package name */
    private volatile c f6508d;

    /* renamed from: f  reason: collision with root package name */
    private MBridgeSDK f6509f;

    /* compiled from: MBridgeSDKManager.java */
    /* loaded from: classes2.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final b f6524a = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MBridgeSDKManager.java */
    /* renamed from: com.beizi.fusion.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0186b implements SDKInitStatusListener {

        /* renamed from: a  reason: collision with root package name */
        private String f6565a;

        /* renamed from: b  reason: collision with root package name */
        private String f6566b;

        /* renamed from: c  reason: collision with root package name */
        private c f6567c;

        public C0186b(String str, String str2, c cVar) {
            this.f6565a = str;
            this.f6566b = str2;
            this.f6567c = cVar;
        }

        public void onInitFail(String str) {
            d unused = b.f6504e = d.SDK_STATE_INITIALIZE_FAILURE;
            c cVar = this.f6567c;
            if (cVar != null) {
                cVar.a("sdk initialize failed： an exception occurs");
            }
        }

        public void onInitSuccess() {
            d unused = b.f6504e = d.SDK_STATE_INITIALIZE_SUCCESS;
            c cVar = this.f6567c;
            if (cVar != null) {
                cVar.a(this.f6565a, this.f6566b);
            }
        }
    }

    /* compiled from: MBridgeSDKManager.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a(String str);

        void a(String str, String str2);
    }

    /* compiled from: MBridgeSDKManager.java */
    /* loaded from: classes2.dex */
    public enum d {
        SDK_STATE_UN_INITIALIZE,
        SDK_STATE_INITIALIZING,
        SDK_STATE_INITIALIZE_SUCCESS,
        SDK_STATE_INITIALIZE_FAILURE
    }

    private b() {
        f6504e = d.SDK_STATE_UN_INITIALIZE;
    }

    public static b a() {
        return a.f6524a;
    }

    public synchronized void a(Context context, String str, String str2, boolean z4, Map<String, String> map, c cVar) {
        d dVar = f6504e;
        d dVar2 = d.SDK_STATE_INITIALIZING;
        if (dVar == dVar2) {
            if (cVar != null) {
                cVar.a("sdk is initializing");
            }
            return;
        }
        this.f6508d = cVar;
        if (a(context, str, str2)) {
            if (f6504e == d.SDK_STATE_INITIALIZE_SUCCESS && TextUtils.equals(this.f6507c, str2) && TextUtils.equals(this.f6506b, str)) {
                if (this.f6508d != null) {
                    this.f6508d.a(this.f6506b, this.f6507c);
                }
                return;
            }
            f6504e = dVar2;
            this.f6505a = context;
            this.f6506b = str;
            this.f6507c = str2;
            a(z4, map, this.f6508d);
        }
    }

    private void a(boolean z4, Map<String, String> map, c cVar) {
        try {
            MBridgeConstans.DEBUG = z4;
            com.mbridge.msdk.system.a mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            this.f6509f = mBridgeSDK;
            Map mBConfigurationMap = mBridgeSDK.getMBConfigurationMap(this.f6507c, this.f6506b);
            if (map != null && !map.isEmpty()) {
                mBConfigurationMap.putAll(map);
            }
            this.f6509f.init(mBConfigurationMap, this.f6505a, new C0186b(this.f6506b, this.f6507c, this.f6508d));
        } catch (Exception e5) {
            f6504e = d.SDK_STATE_INITIALIZE_FAILURE;
            if (this.f6508d != null) {
                cVar.a(e5.getMessage());
            }
        }
    }

    private boolean a(Context context, String str, String str2) {
        String str3;
        boolean z4;
        boolean z5 = false;
        if (context == null) {
            str3 = "context must not null";
            z4 = false;
        } else {
            str3 = "";
            z4 = true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            z5 = z4;
        } else if (TextUtils.isEmpty(str3)) {
            str3 = "appKey or appID must not null";
        } else {
            str3 = str3 + " & appKey or appID must not null";
        }
        if (!z5 && !TextUtils.isEmpty(str3) && this.f6508d != null) {
            f6504e = d.SDK_STATE_INITIALIZE_FAILURE;
            this.f6508d.a(str3);
        }
        return z5;
    }
}
