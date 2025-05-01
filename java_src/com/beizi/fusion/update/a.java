package com.beizi.fusion.update;

import android.content.Context;
import android.text.TextUtils;
import com.beizi.fusion.d.w;
import com.beizi.fusion.g.ad;
import com.beizi.fusion.g.at;
import com.beizi.fusion.g.d;
import com.beizi.fusion.g.z;
import com.beizi.fusion.model.GlobalConfig;
import com.beizi.fusion.model.IncentiveConfig;
import com.beizi.fusion.model.ResponseInfo;
/* compiled from: HeartResponse.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private Context f7126a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, String str) {
        if (str == null) {
            return;
        }
        this.f7126a = context;
        a(str);
    }

    private void a(String str) {
        String b5 = d.b(ad.a(), str);
        if (TextUtils.isEmpty(b5)) {
            return;
        }
        try {
            String b6 = z.b(b5);
            String str2 = (String) at.b(this.f7126a, "globalConfig", "");
            if ("".equals(str2)) {
                at.a(this.f7126a, "globalConfig", (Object) d.a(ad.a(), b6));
            }
            String b7 = d.b(ad.a(), str2);
            GlobalConfig objectFromData = GlobalConfig.objectFromData(b6);
            GlobalConfig objectFromData2 = GlobalConfig.objectFromData(b7);
            if (objectFromData != null) {
                ResponseInfo.getInstance(this.f7126a).setGlobalConfig(objectFromData);
                if (!TextUtils.isEmpty(objectFromData.getConfigVersion())) {
                    if (objectFromData2 != null) {
                        objectFromData2.setConfigVersion(objectFromData.getConfigVersion());
                    }
                    if (ResponseInfo.getInstance(this.f7126a).getManager() == null) {
                        ResponseInfo.getInstance(this.f7126a).setConfigVersion(objectFromData.getConfigVersion());
                    }
                }
                if (objectFromData.getExpireTime() > 0) {
                    if (objectFromData2 != null) {
                        objectFromData2.setExpireTime(objectFromData.getExpireTime());
                    }
                    ResponseInfo.getInstance(this.f7126a).setExpireTime(objectFromData.getExpireTime());
                }
                if (objectFromData.getMaxValidTime() > 0) {
                    if (objectFromData2 != null) {
                        objectFromData2.setMaxValidTime(objectFromData.getMaxValidTime());
                    }
                    ResponseInfo.getInstance(this.f7126a).setMaxValidTime(objectFromData.getMaxValidTime());
                }
                if (objectFromData.getConfigurator() != null) {
                    if (objectFromData2 != null) {
                        objectFromData2.setConfigurator(objectFromData.getConfigurator());
                    }
                    if (ResponseInfo.getInstance(this.f7126a).getManager() == null) {
                        ResponseInfo.getInstance(this.f7126a).setConfigurator(objectFromData.getConfigurator());
                    }
                }
                if (objectFromData.getMessenger() != null) {
                    if (objectFromData2 != null) {
                        objectFromData2.setMessenger(objectFromData.getMessenger());
                    }
                    if (ResponseInfo.getInstance(this.f7126a).getManager() == null) {
                        ResponseInfo.getInstance(this.f7126a).setMessenger(objectFromData.getMessenger());
                    }
                }
                if (objectFromData.getManager() != null) {
                    if (objectFromData2 != null) {
                        objectFromData2.setManager(objectFromData.getManager());
                    }
                    if (ResponseInfo.getInstance(this.f7126a).getManager() == null) {
                        ResponseInfo.getInstance(this.f7126a).setManager(objectFromData.getManager());
                    }
                }
                if (objectFromData.getTaskConfig() != null) {
                    if (objectFromData2 != null) {
                        objectFromData2.setTaskConfig(objectFromData.getTaskConfig());
                    }
                    ResponseInfo.getInstance(this.f7126a).setTaskConfig(objectFromData.getTaskConfig());
                }
                if (objectFromData.getAdPlusConfig() != null) {
                    if (objectFromData2 != null) {
                        objectFromData2.setAdPlusConfig(objectFromData.getAdPlusConfig());
                    }
                    ResponseInfo.getInstance(this.f7126a).setAdPlusConfig(objectFromData.getAdPlusConfig());
                    w.a(this.f7126a);
                }
                IncentiveConfig incentiveConfig = objectFromData.getIncentiveConfig();
                if (incentiveConfig != null) {
                    if (objectFromData2 != null) {
                        objectFromData2.setIncentiveConfig(incentiveConfig);
                    }
                    ResponseInfo.getInstance(this.f7126a).setIncentiveConfig(incentiveConfig);
                    w.a(this.f7126a, incentiveConfig);
                }
                if (!TextUtils.isEmpty(objectFromData.getCrashUrl())) {
                    if (objectFromData2 != null) {
                        objectFromData2.setCrashUrl(objectFromData.getCrashUrl());
                    }
                    ResponseInfo.getInstance(this.f7126a).setCrashUrl(objectFromData.getCrashUrl());
                }
                String objectToJson = GlobalConfig.objectToJson(objectFromData2);
                if (TextUtils.isEmpty(objectToJson)) {
                    return;
                }
                at.a(this.f7126a, "globalConfig", (Object) d.a(ad.a(), objectToJson));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
