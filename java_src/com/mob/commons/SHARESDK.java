package com.mob.commons;

import cn.sharesdk.framework.ShareSDK;
import java.lang.reflect.Method;
/* loaded from: classes5.dex */
public class SHARESDK implements MobProduct {
    private void initBusiness() {
        try {
            Method declaredMethod = Class.forName("cn.sharesdk.framework").getDeclaredMethod("init", new Class[0]);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused) {
        }
    }

    @Override // com.mob.commons.MobProduct
    public String getProductTag() {
        initBusiness();
        return ShareSDK.SDK_TAG;
    }

    @Override // com.mob.commons.MobProduct
    public int getSdkver() {
        initBusiness();
        return ShareSDK.SDK_VERSION_CODE;
    }
}
