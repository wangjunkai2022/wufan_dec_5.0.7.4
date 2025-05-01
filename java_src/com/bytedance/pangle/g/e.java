package com.bytedance.pangle.g;

import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.pangle.Zeus;
import com.bytedance.pangle.log.ZeusLogger;
/* loaded from: classes2.dex */
public final class e {
    public static boolean a(String str, String str2) {
        o a5;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (com.bytedance.pangle.util.i.a()) {
                a5 = d.a(str);
            } else {
                a5 = a.a(str);
            }
            Signature[] signatureArr = a5 != null ? a5.f8422b : null;
            byte[] decode = Base64.decode(Zeus.getPlugin(str2).mSignature, 0);
            if (decode != null && decode.length != 0) {
                int i4 = 0;
                for (Signature signature : signatureArr) {
                    i4 += signature.toByteArray().length;
                }
                byte[] bArr = new byte[i4];
                int i5 = 0;
                for (Signature signature2 : signatureArr) {
                    System.arraycopy(signature2.toByteArray(), 0, bArr, i5, signature2.toByteArray().length);
                    i5 += signature2.toByteArray().length;
                }
                boolean a6 = o.a(bArr, decode);
                if (!a6) {
                    ZeusLogger.w(ZeusLogger.TAG_INSTALL, "ApkSignatureVerify verify plugin signature error : ".concat(String.valueOf(str)));
                }
                return a6;
            }
            ZeusLogger.w(ZeusLogger.TAG_INSTALL, "ApkSignatureVerify get hostSignature error : ".concat(String.valueOf(str)));
            return false;
        } catch (q e5) {
            ZeusLogger.w(ZeusLogger.TAG_INSTALL, "ApkSignatureVerify verify plugin signature error : ".concat(String.valueOf(str)), e5);
            return false;
        }
    }
}
