package com.bytedance.sdk.openadsdk.n.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.p.vv.vv.q;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class o implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTAdNative.NativeExpressAdListener f8960m;
    private ValueSet vv = a.f8190c;

    public o(TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        this.f8960m = nativeExpressAdListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8960m == null) {
            return null;
        }
        switch (i4) {
            case 153101:
                this.f8960m.onError(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 153102:
                List<Bridge> list = (List) valueSet.objectValue(0, List.class);
                if (list == null) {
                    list = new ArrayList(0);
                }
                ArrayList arrayList = new ArrayList();
                for (Bridge bridge : list) {
                    arrayList.add(new q(bridge));
                }
                this.f8960m.onNativeExpressAdLoad(arrayList);
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
