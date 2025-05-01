package com.beizi.fusion.g;

import android.util.Base64;
/* compiled from: Base64Util.java */
/* loaded from: classes2.dex */
public class f {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 0));
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
