package com.bytedance.pangle.g;

import android.content.pm.Signature;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.bytedance.pangle.g.c;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.Certificate;
@RequiresApi(api = 21)
/* loaded from: classes2.dex */
public final class d {
    public static o a(String str) {
        int[] iArr;
        RandomAccessFile randomAccessFile = null;
        Signature[] signatureArr = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
                try {
                    try {
                        f.a(str, randomAccessFile2, com.huaksj.vasdolly.common.e.f14494a, 1896449818);
                        try {
                            try {
                                try {
                                    m mVar = f.f8401a.get(str).get(com.huaksj.vasdolly.common.e.f14494a);
                                    if (mVar != null) {
                                        c.C0218c a5 = c.a(randomAccessFile2, mVar);
                                        Signature[] a6 = a(new Certificate[][]{a5.f8398a});
                                        c.b bVar = a5.f8399b;
                                        if (bVar != null) {
                                            int size = bVar.f8396a.size();
                                            Signature[] signatureArr2 = new Signature[size];
                                            iArr = new int[a5.f8399b.f8397b.size()];
                                            for (int i4 = 0; i4 < size; i4++) {
                                                signatureArr2[i4] = new Signature(a5.f8399b.f8396a.get(i4).getEncoded());
                                                iArr[i4] = a5.f8399b.f8397b.get(i4).intValue();
                                            }
                                            signatureArr = signatureArr2;
                                        } else {
                                            iArr = null;
                                        }
                                        o oVar = new o(a6, 3, signatureArr, iArr);
                                        try {
                                            randomAccessFile2.close();
                                        } catch (Exception unused) {
                                        }
                                        return oVar;
                                    }
                                    throw new n("findVerifiedSigner, No APK Signature Scheme v3 signature in package");
                                } catch (Exception e5) {
                                    throw new q(4, "Failed to collect certificates from " + str + " using APK Signature Scheme v2", e5);
                                }
                            } catch (n unused2) {
                                o a7 = a.a(str);
                                try {
                                    randomAccessFile2.close();
                                } catch (Exception unused3) {
                                }
                                return a7;
                            }
                        } catch (n unused4) {
                            m mVar2 = f.f8401a.get(str).get(1896449818);
                            if (mVar2 != null) {
                                o oVar2 = new o(a(b.a(randomAccessFile2, mVar2).f8394a));
                                try {
                                    randomAccessFile2.close();
                                } catch (Exception unused5) {
                                }
                                return oVar2;
                            }
                            throw new n("findVerifiedSigner, No APK Signature Scheme v2 signature in package");
                        } catch (Exception e6) {
                            throw new q(4, "Failed to collect certificates from " + str + " using APK Signature Scheme v3", e6);
                        }
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        if (randomAccessFile != null) {
                            try {
                                randomAccessFile.close();
                            } catch (Exception unused6) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    throw new q(4, "Failed to collect certificates from " + str + " when findSignatureInfo at once", e7);
                }
            } catch (Exception unused7) {
                throw new q(6, "failed to read apk file, minSignatureSchemeVersion : 1, apkPath : ".concat(String.valueOf(str)));
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static Signature[] a(Certificate[][] certificateArr) {
        Signature[] signatureArr = new Signature[certificateArr.length];
        for (int i4 = 0; i4 < certificateArr.length; i4++) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21 && i5 <= 28) {
                Constructor a5 = com.bytedance.pangle.b.b.a.a(Signature.class, Certificate[].class);
                if (a5 != null) {
                    a5.setAccessible(true);
                }
                if (a5 != null && a5.isAccessible()) {
                    try {
                        signatureArr[i4] = (Signature) a5.newInstance(certificateArr[i4]);
                    } catch (IllegalAccessException e5) {
                        e5.printStackTrace();
                    } catch (InstantiationException e6) {
                        e6.printStackTrace();
                    } catch (InvocationTargetException e7) {
                        e7.printStackTrace();
                    }
                }
            } else {
                signatureArr[i4] = new Signature(certificateArr[i4][0].getEncoded());
            }
        }
        return signatureArr;
    }
}
