package com.bytedance.sdk.openadsdk.n.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.p.vv.vv.b;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class m implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTAdNative.FeedAdListener f8959m;
    private ValueSet vv = a.f8190c;

    public m(TTAdNative.FeedAdListener feedAdListener) {
        this.f8959m = feedAdListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8959m == null) {
            return null;
        }
        switch (i4) {
            case 164101:
                this.f8959m.onError(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 164102:
                List<Bridge> list = (List) valueSet.objectValue(0, List.class);
                if (list == null) {
                    list = new ArrayList(0);
                }
                ArrayList arrayList = new ArrayList();
                for (Bridge bridge : list) {
                    arrayList.add(new b(bridge));
                }
                this.f8959m.onFeedAdLoad(arrayList);
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
