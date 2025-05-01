package com.bytedance.sdk.openadsdk.mediation.init;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class MediationConfigUserInfoForSegment implements Serializable {
    public static final String GENDER_FEMALE = "female";
    public static final String GENDER_MALE = "male";
    public static final String GENDER_UNKNOWN = "unknown";

    /* renamed from: n  reason: collision with root package name */
    private Map<String, String> f8936n;
    public final String TAG = "TTMediationSDK";
    private String vv = "";

    /* renamed from: m  reason: collision with root package name */
    private String f8935m = "";

    /* renamed from: p  reason: collision with root package name */
    private String f8938p = "";

    /* renamed from: i  reason: collision with root package name */
    private int f8934i = 0;

    /* renamed from: o  reason: collision with root package name */
    private String f8937o = "";

    /* renamed from: u  reason: collision with root package name */
    private String f8939u = "";

    public static boolean checkValid(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[A-Za-z0-9-_]{1,100}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
        if (r7 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto Lb9
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L13
            goto Lb9
        L13:
            com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment r7 = (com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment) r7
            int r2 = r6.getAge()
            int r3 = r7.getAge()
            if (r2 != r3) goto L67
            java.lang.String r2 = r6.getUserValueGroup()
            java.lang.String r3 = r7.getUserValueGroup()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.getUserId()
            java.lang.String r3 = r7.getUserId()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.getChannel()
            java.lang.String r3 = r7.getChannel()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.getSubChannel()
            java.lang.String r3 = r7.getSubChannel()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            java.lang.String r2 = r6.getGender()
            java.lang.String r3 = r7.getGender()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L67
            r2 = 1
            goto L68
        L67:
            r2 = 0
        L68:
            java.util.Map r7 = r7.getCustomInfos()
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.f8936n
            if (r3 == 0) goto Lad
            if (r7 == 0) goto Lad
            int r3 = r3.size()
            int r4 = r7.size()
            if (r3 != r4) goto Lb3
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.f8936n
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L86:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb1
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L86
            java.util.Map<java.lang.String, java.lang.String> r5 = r6.f8936n
            java.lang.Object r5 = r5.get(r4)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.Object r4 = r7.get(r4)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = android.text.TextUtils.equals(r5, r4)
            if (r4 == 0) goto Lb3
            goto L86
        Lad:
            if (r3 != 0) goto Lb3
            if (r7 != 0) goto Lb3
        Lb1:
            r7 = 1
            goto Lb4
        Lb3:
            r7 = 0
        Lb4:
            if (r2 == 0) goto Lb9
            if (r7 == 0) goto Lb9
            return r0
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.mediation.init.MediationConfigUserInfoForSegment.equals(java.lang.Object):boolean");
    }

    public int getAge() {
        return this.f8934i;
    }

    @Nullable
    public String getChannel() {
        return this.f8935m;
    }

    @Nullable
    public Map<String, String> getCustomInfos() {
        return this.f8936n;
    }

    @Nullable
    public String getGender() {
        return this.f8937o;
    }

    @Nullable
    public String getSubChannel() {
        return this.f8938p;
    }

    @Nullable
    public String getUserId() {
        return this.vv;
    }

    @Nullable
    public String getUserValueGroup() {
        return this.f8939u;
    }

    public void setAge(int i4) {
        this.f8934i = i4;
    }

    public void setChannel(String str) {
        if (checkValid(str)) {
            this.f8935m = str;
        }
    }

    public void setCustomInfos(Map<String, String> map) {
        this.f8936n = new HashMap();
        if (map == null || map.size() <= 0) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                if (!checkValid(entry.getKey())) {
                    StringBuilder sb = new StringBuilder("流量分组");
                    sb.append(entry.getKey());
                    sb.append("字段存在不合法输入");
                } else if (!checkValid(entry.getValue())) {
                    StringBuilder sb2 = new StringBuilder("流量分组");
                    sb2.append(entry.getKey());
                    sb2.append("字段的值");
                    sb2.append(entry.getValue());
                    sb2.append("存在不合法输入");
                } else {
                    this.f8936n.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public void setGender(String str) {
        if (checkValid(str)) {
            this.f8937o = str;
        }
    }

    public void setSubChannel(String str) {
        if (checkValid(str)) {
            this.f8938p = str;
        }
    }

    public void setUserId(String str) {
        if (checkValid(str)) {
            this.vv = str;
        }
    }

    public void setUserValueGroup(String str) {
        if (checkValid(str)) {
            this.f8939u = str;
        }
    }
}
