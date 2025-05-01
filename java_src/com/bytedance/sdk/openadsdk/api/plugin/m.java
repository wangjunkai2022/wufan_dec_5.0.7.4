package com.bytedance.sdk.openadsdk.api.plugin;
/* loaded from: classes2.dex */
public class m {
    private static final StringBuffer vv = new StringBuffer();

    public static void vv(String str, String str2) {
        StringBuffer stringBuffer = vv;
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append(';');
        stringBuffer.append(str);
        stringBuffer.append(';');
        stringBuffer.append(str2);
        stringBuffer.append('\n');
    }

    public static String vv() {
        return vv.toString();
    }
}
