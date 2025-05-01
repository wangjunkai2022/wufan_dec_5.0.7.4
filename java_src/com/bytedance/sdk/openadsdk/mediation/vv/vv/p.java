package com.bytedance.sdk.openadsdk.mediation.vv.vv;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.TTAdNative;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class p extends com.bytedance.sdk.openadsdk.n.vv.vv.vv.m {
    private TTAdNative.FeedAdListener vv;

    public p(TTAdNative.FeedAdListener feedAdListener) {
        super(feedAdListener);
        this.vv = feedAdListener;
    }

    @Override // com.bytedance.sdk.openadsdk.n.vv.vv.vv.m, com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 164102) {
            List<Bridge> list = (List) valueSet.objectValue(0, List.class);
            if (list == null) {
                list = new ArrayList(0);
            }
            ArrayList arrayList = new ArrayList();
            for (Bridge bridge : list) {
                arrayList.add(new jh(bridge));
            }
            TTAdNative.FeedAdListener feedAdListener = this.vv;
            if (feedAdListener != null) {
                feedAdListener.onFeedAdLoad(arrayList);
                return null;
            }
            return null;
        }
        return (T) super.call(i4, valueSet, cls);
    }
}
