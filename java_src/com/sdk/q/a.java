package com.sdk.q;

import com.sdk.f.g;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f60091a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f60092b = Boolean.valueOf(g.f60051b);

    public static PublicKey a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(new com.sdk.h.a().a(str)));
        } catch (Exception e5) {
            com.sdk.o.b.a(f60091a, e5.toString(), f60092b);
            return null;
        }
    }
}
