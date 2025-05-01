package com.qq.e.comm.managers.plugin;

import com.kuaishou.weapon.p0.t;
/* loaded from: classes5.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f59868a = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", t.f55693l, "c", t.f55701t, com.kwad.sdk.m.e.TAG, com.xinzhu.overmind.utils.helpers.f.f68332a};

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i4 : bArr) {
            if (i4 < 0) {
                i4 += 256;
            }
            StringBuilder sb = new StringBuilder();
            String[] strArr = f59868a;
            sb.append(strArr[i4 / 16]);
            sb.append(strArr[i4 % 16]);
            stringBuffer.append(sb.toString());
        }
        return stringBuffer.toString();
    }
}
