package com.coremedia.iso;

import java.io.UnsupportedEncodingException;
/* compiled from: Utf8.java */
/* loaded from: classes2.dex */
public final class l {
    public static String a(byte[] bArr) {
        if (bArr != null) {
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e5) {
                throw new Error(e5);
            }
        }
        return null;
    }

    public static byte[] b(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e5) {
                throw new Error(e5);
            }
        }
        return null;
    }

    public static int c(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8").length;
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException();
            }
        }
        return 0;
    }
}
