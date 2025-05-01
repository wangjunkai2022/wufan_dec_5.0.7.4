package com.sdk.q;

import com.sdk.f.g;
import com.sdk.r.c;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
/* loaded from: classes5.dex */
public class b extends com.sdk.i.a {

    /* renamed from: a  reason: collision with root package name */
    public static String f60093a = "RSA/ECB/PKCS1Padding";

    static {
        boolean z4 = g.f60051b;
    }

    public static String a(String str, String str2) {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) a.a(str2);
        if (com.sdk.o.b.a(str).booleanValue()) {
            throw new Exception("rsaAes key is null");
        }
        byte[] a5 = c.a(str);
        if (rSAPublicKey != null) {
            try {
                Cipher cipher = Cipher.getInstance(f60093a);
                cipher.init(2, rSAPublicKey);
                return new String(cipher.doFinal(a5), Charset.defaultCharset()).trim();
            } catch (InvalidKeyException unused) {
                throw new InvalidKeyException("解密公钥非法,请检查");
            } catch (NoSuchAlgorithmException unused2) {
                throw new NoSuchAlgorithmException("无此解密算法");
            } catch (BadPaddingException unused3) {
                throw new BadPaddingException("密文数据已损坏");
            } catch (IllegalBlockSizeException unused4) {
                throw new IllegalBlockSizeException("密文长度非法");
            } catch (NoSuchPaddingException unused5) {
                throw new NoSuchPaddingException("解密出错！不支持该填充机制");
            }
        }
        throw new Exception("解密公钥为空, 请设置");
    }

    public static String b(String str, String str2) {
        PublicKey a5 = a.a(str);
        Cipher cipher = Cipher.getInstance(f60093a);
        cipher.init(1, a5);
        return c.a(cipher.doFinal(str2.getBytes(Charset.defaultCharset()))).toString();
    }
}
