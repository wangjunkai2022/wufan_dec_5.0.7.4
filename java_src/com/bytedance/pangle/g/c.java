package com.bytedance.pangle.g;

import android.util.ArrayMap;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
@RequiresApi(api = 21)
/* loaded from: classes2.dex */
public final class c {

    /* loaded from: classes2.dex */
    static class a extends Exception {
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final List<X509Certificate> f8396a;

        /* renamed from: b  reason: collision with root package name */
        public final List<Integer> f8397b;

        public b(List<X509Certificate> list, List<Integer> list2) {
            this.f8396a = list;
            this.f8397b = list2;
        }
    }

    /* renamed from: com.bytedance.pangle.g.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0218c {

        /* renamed from: a  reason: collision with root package name */
        public final X509Certificate[] f8398a;

        /* renamed from: b  reason: collision with root package name */
        public final b f8399b;

        /* renamed from: c  reason: collision with root package name */
        public byte[] f8400c;

        public C0218c(X509Certificate[] x509CertificateArr, b bVar) {
            this.f8398a = x509CertificateArr;
            this.f8399b = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0218c a(RandomAccessFile randomAccessFile, m mVar) {
        ArrayMap arrayMap = new ArrayMap();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer a5 = f.a(mVar.f8416a);
                int i4 = 0;
                C0218c c0218c = null;
                while (a5.hasRemaining()) {
                    try {
                        c0218c = a(f.a(a5), arrayMap, certificateFactory);
                        i4++;
                    } catch (a unused) {
                    } catch (IOException e5) {
                        e = e5;
                        throw new SecurityException("Failed to parse/verify signer #" + i4 + " block", e);
                    } catch (SecurityException e6) {
                        e = e6;
                        throw new SecurityException("Failed to parse/verify signer #" + i4 + " block", e);
                    } catch (BufferUnderflowException e7) {
                        e = e7;
                        throw new SecurityException("Failed to parse/verify signer #" + i4 + " block", e);
                    }
                }
                if (i4 <= 0 || c0218c == null) {
                    throw new SecurityException("No signers found");
                }
                if (i4 == 1) {
                    if (!arrayMap.isEmpty()) {
                        f.a(arrayMap, randomAccessFile, mVar);
                        if (arrayMap.containsKey(3)) {
                            c0218c.f8400c = f.a((byte[]) arrayMap.get(3), randomAccessFile.length(), mVar);
                        }
                        return c0218c;
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("APK Signature Scheme V3 only supports one signer: multiple signers found.");
            } catch (IOException e8) {
                throw new SecurityException("Failed to read list of signers", e8);
            }
        } catch (CertificateException e9) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e9);
        }
    }

    private static C0218c a(ByteBuffer byteBuffer, Map<Integer, byte[]> map, CertificateFactory certificateFactory) {
        ByteBuffer a5 = f.a(byteBuffer);
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        ByteBuffer a6 = f.a(byteBuffer);
        byte[] b5 = f.b(byteBuffer);
        ArrayList arrayList = new ArrayList();
        int i6 = -1;
        int i7 = 0;
        byte[] bArr = null;
        while (true) {
            int i8 = 8;
            boolean z4 = true;
            if (!a6.hasRemaining()) {
                if (i6 == -1) {
                    if (i7 == 0) {
                        throw new SecurityException("No signatures found");
                    }
                    throw new SecurityException("No supported signatures found");
                }
                String c5 = f.c(i6);
                Pair<String, ? extends AlgorithmParameterSpec> d5 = f.d(i6);
                String str = (String) d5.first;
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) d5.second;
                try {
                    PublicKey generatePublic = KeyFactory.getInstance(c5).generatePublic(new X509EncodedKeySpec(b5));
                    Signature signature = Signature.getInstance(str);
                    signature.initVerify(generatePublic);
                    if (algorithmParameterSpec != null) {
                        signature.setParameter(algorithmParameterSpec);
                    }
                    signature.update(a5);
                    if (signature.verify(bArr)) {
                        a5.clear();
                        ByteBuffer a7 = f.a(a5);
                        ArrayList arrayList2 = new ArrayList();
                        byte[] bArr2 = null;
                        int i9 = 0;
                        while (a7.hasRemaining()) {
                            i9++;
                            try {
                                ByteBuffer a8 = f.a(a7);
                                if (a8.remaining() >= i8) {
                                    int i10 = a8.getInt();
                                    arrayList2.add(Integer.valueOf(i10));
                                    if (i10 == i6) {
                                        bArr2 = f.b(a8);
                                    }
                                    i8 = 8;
                                } else {
                                    throw new IOException("Record too short");
                                }
                            } catch (IOException | BufferUnderflowException e5) {
                                throw new IOException("Failed to parse digest record #".concat(String.valueOf(i9)), e5);
                            }
                        }
                        if (arrayList.equals(arrayList2)) {
                            int a9 = f.a(i6);
                            byte[] put = map.put(Integer.valueOf(a9), bArr2);
                            if (put != null && !MessageDigest.isEqual(put, bArr2)) {
                                throw new SecurityException(f.b(a9) + " contents digest does not match the digest specified by a preceding signer");
                            }
                            ByteBuffer a10 = f.a(a5);
                            ArrayList arrayList3 = new ArrayList();
                            int i11 = 0;
                            while (a10.hasRemaining()) {
                                i11++;
                                byte[] b6 = f.b(a10);
                                try {
                                    arrayList3.add(new p((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(b6)), b6));
                                } catch (CertificateException e6) {
                                    throw new SecurityException("Failed to decode certificate #".concat(String.valueOf(i11)), e6);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                if (Arrays.equals(b5, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                    if (a5.getInt() == i4) {
                                        if (a5.getInt() == i5) {
                                            return a(f.a(a5), arrayList3, certificateFactory);
                                        }
                                        throw new SecurityException("maxSdkVersion mismatch between signed and unsigned in v3 signer block.");
                                    }
                                    throw new SecurityException("minSdkVersion mismatch between signed and unsigned in v3 signer block.");
                                }
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                            throw new SecurityException("No certificates listed");
                        }
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                    throw new SecurityException(str + " signature did not verify");
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e7) {
                    throw new SecurityException("Failed to verify " + str + " signature", e7);
                }
            }
            i7++;
            try {
                ByteBuffer a11 = f.a(a6);
                if (a11.remaining() >= 8) {
                    int i12 = a11.getInt();
                    arrayList.add(Integer.valueOf(i12));
                    if (i12 != 513 && i12 != 514 && i12 != 769 && i12 != 1057 && i12 != 1059 && i12 != 1061) {
                        switch (i12) {
                            case 257:
                            case com.join.mgps.socket.fight.arena.a.f54751i /* 258 */:
                            case 259:
                            case 260:
                                break;
                            default:
                                z4 = false;
                                break;
                        }
                    }
                    if (z4 && (i6 == -1 || f.a(i12, i6) > 0)) {
                        bArr = f.b(a11);
                        i6 = i12;
                    }
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e8) {
                throw new SecurityException("Failed to parse signature record #".concat(String.valueOf(i7)), e8);
            }
        }
    }

    private static C0218c a(ByteBuffer byteBuffer, List<X509Certificate> list, CertificateFactory certificateFactory) {
        X509Certificate[] x509CertificateArr = (X509Certificate[]) list.toArray(new X509Certificate[list.size()]);
        b bVar = null;
        while (byteBuffer.hasRemaining()) {
            ByteBuffer a5 = f.a(byteBuffer);
            if (a5.remaining() >= 4) {
                if (a5.getInt() == 1000370060) {
                    if (bVar == null) {
                        bVar = a(a5, certificateFactory);
                        try {
                            if (bVar.f8396a.size() > 0) {
                                List<X509Certificate> list2 = bVar.f8396a;
                                if (!Arrays.equals(list2.get(list2.size() - 1).getEncoded(), x509CertificateArr[0].getEncoded())) {
                                    throw new SecurityException("Terminal certificate in Proof-of-rotation record does not match APK signing certificate");
                                }
                            } else {
                                continue;
                            }
                        } catch (CertificateEncodingException e5) {
                            throw new SecurityException("Failed to encode certificate when comparing Proof-of-rotation record and signing certificate", e5);
                        }
                    } else {
                        throw new SecurityException("Encountered multiple Proof-of-rotation records when verifying APK Signature Scheme v3 signature");
                    }
                }
            } else {
                throw new IOException("Remaining buffer too short to contain additional attribute ID. Remaining: " + a5.remaining());
            }
        }
        return new C0218c(x509CertificateArr, bVar);
    }

    private static b a(ByteBuffer byteBuffer, CertificateFactory certificateFactory) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        try {
            byteBuffer.getInt();
            HashSet hashSet = new HashSet();
            int i5 = -1;
            p pVar = null;
            while (byteBuffer.hasRemaining()) {
                i4++;
                ByteBuffer a5 = f.a(byteBuffer);
                ByteBuffer a6 = f.a(a5);
                int i6 = a5.getInt();
                int i7 = a5.getInt();
                byte[] b5 = f.b(a5);
                if (pVar != null) {
                    Pair<String, ? extends AlgorithmParameterSpec> d5 = f.d(i5);
                    PublicKey publicKey = pVar.getPublicKey();
                    Signature signature = Signature.getInstance((String) d5.first);
                    signature.initVerify(publicKey);
                    Object obj = d5.second;
                    if (obj != null) {
                        signature.setParameter((AlgorithmParameterSpec) obj);
                    }
                    signature.update(a6);
                    if (!signature.verify(b5)) {
                        throw new SecurityException("Unable to verify signature of certificate #" + i4 + " using " + ((String) d5.first) + " when verifying Proof-of-rotation record");
                    }
                }
                a6.rewind();
                byte[] b6 = f.b(a6);
                int i8 = a6.getInt();
                if (pVar != null && i5 != i8) {
                    throw new SecurityException("Signing algorithm ID mismatch for certificate #" + i4 + " when verifying Proof-of-rotation record");
                }
                pVar = new p((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(b6)), b6);
                if (!hashSet.contains(pVar)) {
                    hashSet.add(pVar);
                    arrayList.add(pVar);
                    arrayList2.add(Integer.valueOf(i6));
                    i5 = i7;
                } else {
                    throw new SecurityException("Encountered duplicate entries in Proof-of-rotation record at certificate #" + i4 + ".  All signing certificates should be unique");
                }
            }
            return new b(arrayList, arrayList2);
        } catch (IOException e5) {
            e = e5;
            throw new IOException("Failed to parse Proof-of-rotation record", e);
        } catch (BufferUnderflowException e6) {
            e = e6;
            throw new IOException("Failed to parse Proof-of-rotation record", e);
        } catch (InvalidAlgorithmParameterException e7) {
            e = e7;
            throw new SecurityException("Failed to verify signature over signed data for certificate #0 when verifying Proof-of-rotation record", e);
        } catch (InvalidKeyException e8) {
            e = e8;
            throw new SecurityException("Failed to verify signature over signed data for certificate #0 when verifying Proof-of-rotation record", e);
        } catch (NoSuchAlgorithmException e9) {
            e = e9;
            throw new SecurityException("Failed to verify signature over signed data for certificate #0 when verifying Proof-of-rotation record", e);
        } catch (SignatureException e10) {
            e = e10;
            throw new SecurityException("Failed to verify signature over signed data for certificate #0 when verifying Proof-of-rotation record", e);
        } catch (CertificateException e11) {
            throw new SecurityException("Failed to decode certificate #0 when verifying Proof-of-rotation record", e11);
        }
    }
}
