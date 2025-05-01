package com.bytedance.sdk.openadsdk.n.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.p.vv.vv.k;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class vv implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTAdNative.DrawFeedAdListener f8963m;
    private ValueSet vv = a.f8190c;

    public vv(TTAdNative.DrawFeedAdListener drawFeedAdListener) {
        this.f8963m = drawFeedAdListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8963m == null) {
            return null;
        }
        switch (i4) {
            case 172101:
                this.f8963m.onError(valueSet.intValue(0), (String) valueSet.objectValue(1, String.class));
                break;
            case 172102:
                List<Bridge> list = (List) valueSet.objectValue(0, List.class);
                if (list == null) {
                    list = new ArrayList(0);
                }
                ArrayList arrayList = new ArrayList();
                for (Bridge bridge : list) {
                    arrayList.add(new k(bridge));
                }
                this.f8963m.onDrawFeedAdLoad(arrayList);
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
