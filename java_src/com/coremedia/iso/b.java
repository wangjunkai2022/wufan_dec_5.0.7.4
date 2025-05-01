package com.coremedia.iso;

import java.io.UnsupportedEncodingException;
/* compiled from: Ascii.java */
/* loaded from: classes2.dex */
public final class b {
    public static String a(byte[] bArr) {
        if (bArr != null) {
            try {
                return new String(bArr, "us-ascii");
            } catch (UnsupportedEncodingException e5) {
                throw new Error(e5);
            }
        }
        return null;
    }

    public static byte[] b(String str) {
        if (str != null) {
            try {
                return str.getBytes("us-ascii");
            } catch (UnsupportedEncodingException e5) {
                throw new Error(e5);
            }
        }
        return null;
    }
}
