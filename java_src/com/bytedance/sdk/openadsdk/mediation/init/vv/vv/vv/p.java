package com.bytedance.sdk.openadsdk.mediation.init.vv.vv.vv;

import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment;
/* loaded from: classes2.dex */
public class p {
    public static final ValueSet vv(MediationConfigUserInfoForSegment mediationConfigUserInfoForSegment) {
        a b5 = a.b();
        if (mediationConfigUserInfoForSegment == null) {
            return null;
        }
        b5.h(265007, mediationConfigUserInfoForSegment.getCustomInfos());
        b5.i(265001, mediationConfigUserInfoForSegment.getUserId());
        b5.i(265002, mediationConfigUserInfoForSegment.getChannel());
        b5.i(265003, mediationConfigUserInfoForSegment.getSubChannel());
        b5.f(265004, mediationConfigUserInfoForSegment.getAge());
        b5.i(265005, mediationConfigUserInfoForSegment.getGender());
        b5.i(265006, mediationConfigUserInfoForSegment.getUserValueGroup());
        return b5.a();
    }
}
