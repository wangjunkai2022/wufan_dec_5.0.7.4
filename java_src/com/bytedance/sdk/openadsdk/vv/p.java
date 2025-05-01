package com.bytedance.sdk.openadsdk.vv;

import android.app.Application;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAppContextHolder;
import com.bytedance.sdk.openadsdk.vv.vv;
/* loaded from: classes2.dex */
public final class p implements Bridge {
    private static volatile p vv;

    /* renamed from: m  reason: collision with root package name */
    private m f8985m;

    /* renamed from: p  reason: collision with root package name */
    private vv f8986p = new vv();

    private p() {
    }

    public static p vv() {
        if (vv == null) {
            synchronized (p.class) {
                if (vv == null) {
                    vv = new p();
                }
            }
        }
        return vv;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        Bridge vv2;
        switch (i4) {
            case 2:
                return (T) this.f8986p.vv();
            case 3:
                return (T) TTAppContextHolder.getContext();
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                m mVar = this.f8985m;
                if (mVar == null || (vv2 = mVar.vv(4)) == null) {
                    return null;
                }
                return (T) vv2.call(i4, valueSet, cls);
            case 9:
                Object objectValue = valueSet.objectValue(0, Object.class);
                if (objectValue instanceof EventListener) {
                    vv((EventListener) objectValue);
                    break;
                }
                break;
            case 10:
                m mVar2 = this.f8985m;
                if (mVar2 == null) {
                    return null;
                }
                return (T) mVar2.vv(valueSet.intValue(0));
        }
        return null;
    }

    public Application.ActivityLifecycleCallbacks m() {
        return this.f8986p;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return a.b().f(10000, 5).a();
    }

    public void vv(m mVar) {
        this.f8985m = mVar;
    }

    private void vv(final EventListener eventListener) {
        this.f8986p.vv(new vv.InterfaceC0230vv() { // from class: com.bytedance.sdk.openadsdk.vv.p.1
            @Override // com.bytedance.sdk.openadsdk.vv.vv.InterfaceC0230vv
            public void m() {
                eventListener.onEvent(1, null);
            }

            @Override // com.bytedance.sdk.openadsdk.vv.vv.InterfaceC0230vv
            public void vv() {
                eventListener.onEvent(0, null);
            }
        });
    }
}
