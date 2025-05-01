package com.bytedance.sdk.openadsdk.mediation.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class m extends com.bytedance.sdk.openadsdk.n.vv.vv.vv.vv {
    private TTAdNative.DrawFeedAdListener vv;

    public m(TTAdNative.DrawFeedAdListener drawFeedAdListener) {
        super(drawFeedAdListener);
        this.vv = drawFeedAdListener;
    }

    @Override // com.bytedance.sdk.openadsdk.n.vv.vv.vv.vv, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 172102) {
            List<Bridge> list = (List) valueSet.objectValue(0, List.class);
            if (list == null) {
                list = new ArrayList(0);
            }
            ArrayList arrayList = new ArrayList();
            for (Bridge bridge : list) {
                arrayList.add(new b(bridge));
            }
            TTAdNative.DrawFeedAdListener drawFeedAdListener = this.vv;
            if (drawFeedAdListener != null) {
                drawFeedAdListener.onDrawFeedAdLoad(arrayList);
                return null;
            }
            return null;
        }
        return (T) super.call(i4, valueSet, cls);
    }
}
