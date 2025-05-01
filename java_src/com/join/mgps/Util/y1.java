package com.join.mgps.Util;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
/* compiled from: SignUtils.java */
/* loaded from: classes3.dex */
public class y1 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f28151a = "RSA";

    /* renamed from: b  reason: collision with root package name */
    private static final String f28152b = "SHA1WithRSA";

    /* renamed from: c  reason: collision with root package name */
    private static final String f28153c = "UTF-8";

    public static String a(String str, String str2) {
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance(f28151a).generatePrivate(new PKCS8EncodedKeySpec(k.a(str2)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initSign(generatePrivate);
            signature.update(str.getBytes("UTF-8"));
            return k.b(signature.sign());
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
