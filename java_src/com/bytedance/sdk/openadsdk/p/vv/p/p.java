package com.bytedance.sdk.openadsdk.p.vv.p;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.LocationProvider;
/* loaded from: classes2.dex */
public class p {
    public static final ValueSet vv(LocationProvider locationProvider) {
        a b5 = a.b();
        if (locationProvider == null) {
            return null;
        }
        b5.d(262001, locationProvider.getLatitude());
        b5.d(262002, locationProvider.getLongitude());
        return b5.a();
    }
}
