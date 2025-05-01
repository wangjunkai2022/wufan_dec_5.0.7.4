package com.bytedance.sdk.openadsdk.mediation;

import android.os.Bundle;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bytedance.sdk.openadsdk.TTAdManager;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.mediation.vv.vv.n;
import com.bytedance.sdk.openadsdk.mediation.vv.vv.vv.m;
/* loaded from: classes2.dex */
public class MediationManagerVisitor {

    /* renamed from: m  reason: collision with root package name */
    private static volatile Bridge f8811m;
    private static volatile MediationManagerVisitor vv;

    /* renamed from: p  reason: collision with root package name */
    private m f8812p;

    private MediationManagerVisitor() {
    }

    public static MediationManagerVisitor getInstance() {
        if (vv == null) {
            synchronized (MediationManagerVisitor.class) {
                if (vv == null) {
                    vv = new MediationManagerVisitor();
                }
            }
        }
        return vv;
    }

    public synchronized IMediationManager getMediationManager() {
        Bundle bundle = new Bundle();
        bundle.putString("mediation_manager", "mediation_manager");
        TTAdManager adManager = TTAdSdk.getAdManager();
        if (adManager != null) {
            f8811m = (Bridge) adManager.getExtra(null, bundle);
        }
        if (f8811m != null) {
            if (this.f8812p == null) {
                this.f8812p = new n(f8811m);
            }
            return this.f8812p;
        }
        return null;
    }
}
