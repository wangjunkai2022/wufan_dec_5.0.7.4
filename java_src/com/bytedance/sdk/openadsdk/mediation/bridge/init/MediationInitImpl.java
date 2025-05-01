package com.bytedance.sdk.openadsdk.mediation.bridge.init;

import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationResultBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.MediationValueSetBuilder;
import com.bytedance.sdk.openadsdk.mediation.bridge.valueset.MediationInitConfig;
/* loaded from: classes2.dex */
public abstract class MediationInitImpl implements IMediationInit {
    public MediationInitConfig mInitConfig;

    private void vv() {
        Bridge initCallback = this.mInitConfig.getInitCallback();
        if (initCallback != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8021, this);
            initCallback.call(8266, create.build(), Void.class);
        }
    }

    @Override // com.bykv.vk.openvk.api.proto.Caller
    public <T> T call(int i4, ValueSet valueSet, Class<T> cls) {
        if (i4 == 8240) {
            initAdn((Context) valueSet.objectValue(8009, Context.class), (ValueSet) valueSet.objectValue(8424, ValueSet.class));
        }
        return (T) callFunction(i4, valueSet, cls);
    }

    public <T> T callFunction(int i4, ValueSet valueSet, Class<T> cls) {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.mediation.bridge.init.IMediationInit
    public final void initAdn(Context context, ValueSet valueSet) {
        this.mInitConfig = MediationInitConfig.create(valueSet);
        vv();
        realInitAdn(context, this.mInitConfig);
    }

    public void notifyFail(int i4, String str) {
        Bridge initCallback = this.mInitConfig.getInitCallback();
        if (initCallback != null) {
            MediationResultBuilder create = MediationResultBuilder.create();
            create.setSuccess(false);
            create.setCode(i4);
            create.setMessage(str);
            MediationValueSetBuilder create2 = MediationValueSetBuilder.create();
            create2.add(8022, create);
            initCallback.call(8123, create2.build(), Void.class);
        }
    }

    public void notifySuccess() {
        Bridge initCallback = this.mInitConfig.getInitCallback();
        if (initCallback != null) {
            MediationValueSetBuilder create = MediationValueSetBuilder.create();
            create.add(8021, this);
            initCallback.call(8122, create.build(), Void.class);
        }
    }

    public abstract void realInitAdn(Context context, MediationInitConfig mediationInitConfig);

    @Override // com.bykv.vk.openvk.api.proto.Bridge
    public ValueSet values() {
        return null;
    }

    public void notifyFail(String str) {
        notifyFail(MediationConstant.ErrorCode.ADN_INIT_FAIL, str);
    }
}
