package com.bytedance.sdk.openadsdk.mediation.bridge.valueset;

import android.content.Context;
import com.bykv.vk.openvk.api.proto.Bridge;
import com.bykv.vk.openvk.api.proto.ValueSet;
/* loaded from: classes2.dex */
public class MediationLoaderConfig {
    private ValueSet vv;

    private MediationLoaderConfig(ValueSet valueSet) {
        if (valueSet != null) {
            ValueSet valueSet2 = (ValueSet) valueSet.objectValue(8424, ValueSet.class);
            if (valueSet2 != null) {
                this.vv = valueSet2;
            } else {
                this.vv = valueSet;
            }
        }
    }

    public static MediationLoaderConfig create(ValueSet valueSet) {
        return new MediationLoaderConfig(valueSet);
    }

    private boolean vv() {
        ValueSet valueSet = this.vv;
        return (valueSet == null || valueSet.isEmpty()) ? false : true;
    }

    public String getADNName() {
        return vv() ? this.vv.stringValue(8003) : "";
    }

    public ValueSet getAdSlotValueSet() {
        if (vv()) {
            return (ValueSet) this.vv.objectValue(8548, ValueSet.class);
        }
        return null;
    }

    public int getAdType() {
        if (vv()) {
            return this.vv.intValue(8008);
        }
        return 0;
    }

    public String getClassName() {
        return vv() ? this.vv.stringValue(8010) : "";
    }

    public Context getContext() {
        if (vv()) {
            return (Context) this.vv.objectValue(8009, Context.class);
        }
        return null;
    }

    public Bridge getGMCustomAdLoader() {
        if (vv()) {
            return (Bridge) this.vv.objectValue(8011, Bridge.class);
        }
        return null;
    }

    public ValueSet getMediationCustomServiceConfigValue() {
        if (vv()) {
            return (ValueSet) this.vv.objectValue(8546, ValueSet.class);
        }
        return null;
    }
}
