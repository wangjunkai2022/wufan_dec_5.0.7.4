package com.cmic.sso.sdk.e;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
/* compiled from: RSAUtil.java */
/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9331a = "i";

    /* renamed from: d  reason: collision with root package name */
    private static i f9332d;

    /* renamed from: b  reason: collision with root package name */
    private PublicKey f9333b = null;

    /* renamed from: c  reason: collision with root package name */
    private PublicKey f9334c = null;

    private i() {
        try {
            b();
            if (this.f9334c == null) {
                c();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static i a() {
        if (f9332d == null) {
            f9332d = new i();
        }
        return f9332d;
    }

    private void c() throws Exception {
        try {
            this.f9334c = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA6YCzxZS0FaWDOdtwgcHJ\n4aw0AoExz4atTkUlZJIf9eNLj7ogTlQGANNzE2R/uskFse2GsCqJKFTk4UraBkzf\naQu/yuFwKjURi0gEqyna1wQ3Anh3e6J/Pvhrp7vJyyRF3gZQCHElna1CWEN1zyT9\n+APJWeeIsUEJHi0FSf3EmwAtNgcJwLYed8Lrem+2+qvFY8RRjH3w4jT/wl2HKGEY\nYal33Q/OxoAE80SAD+DuXjpeynY1slzFV/Pi2qYmsnuBsnlDPQgJzxQKfCHl8xLf\nsjV57o+phSlqM0B5aPiMScxWJmCzFRX4NKcjt6KGP+3GpzmTyrpavnYQtHasperH\nmQIDAQAB\n", 0)));
        } catch (NullPointerException unused) {
            throw new Exception("公钥输入流为空");
        }
    }

    public String b(byte[] bArr) {
        if (this.f9333b == null) {
            c.a(f9331a, "mServerPublicKey == null");
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
            cipher.init(1, this.f9334c);
            return Base64.encodeToString(cipher.doFinal(bArr), 0);
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    public String a(byte[] bArr) {
        if (this.f9333b == null) {
            c.a(f9331a, "mServerPublicKey == null");
            return "";
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA256AndMGF1Padding");
            cipher.init(1, this.f9333b);
            return q.a(cipher.doFinal(bArr));
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    private void b() throws Exception {
        try {
            this.f9333b = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC/YHP9utFGOhGk7Xf5L7jOgQz5\nv2JKxdrIE3yzYsHoZJwzKC7Ttx380UZmBFzr5I1k6FFMn/YGXd4ts6UHT/nzsCIc\ngZlTTem7Pjdm1V9bJgQ6iQvFHsvT+vNgJ3wAIRd+iCMXm8y96yZhD2+SH5odBYS2\nZzwTYXBQDvB/rTfdjwIDAQAB", 0)));
        } catch (NullPointerException e5) {
            e5.printStackTrace();
        }
    }
}
