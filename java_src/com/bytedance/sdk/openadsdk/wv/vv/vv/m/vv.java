package com.bytedance.sdk.openadsdk.wv.vv.vv.m;

import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bykv.vv.vv.vv.vv.a;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.p.vv.vv.b;
/* loaded from: classes2.dex */
public class vv implements Bridge {

    /* renamed from: m  reason: collision with root package name */
    private final TTFeedAd.VideoAdListener f8991m;
    private ValueSet vv = a.f8190c;

    public vv(TTFeedAd.VideoAdListener videoAdListener) {
        this.f8991m = videoAdListener;
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (this.f8991m == null) {
            return null;
        }
        switch (i4) {
            case 161101:
                this.f8991m.onVideoLoad(new b((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 161102:
                this.f8991m.onVideoError(valueSet.intValue(0), valueSet.intValue(1));
                break;
            case 161103:
                this.f8991m.onVideoAdPaused(new b((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 161104:
                this.f8991m.onVideoAdStartPlay(new b((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 161105:
                this.f8991m.onVideoAdContinuePlay(new b((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
            case 161106:
                this.f8991m.onProgressUpdate(valueSet.longValue(0), valueSet.longValue(1));
                break;
            case 161107:
                this.f8991m.onVideoAdComplete(new b((Bridge) valueSet.objectValue(0, Bridge.class)));
                break;
        }
        return null;
    }

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return this.vv;
    }
}
