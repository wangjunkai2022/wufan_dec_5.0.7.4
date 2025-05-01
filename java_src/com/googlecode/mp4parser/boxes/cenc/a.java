package com.googlecode.mp4parser.boxes.cenc;

import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.authoring.g;
import com.googlecode.mp4parser.util.c;
import com.googlecode.mp4parser.util.n;
import com.mp4parser.iso23001.part7.a;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
/* compiled from: CencDecryptingSampleList.java */
/* loaded from: classes3.dex */
public class a extends AbstractList<f> {

    /* renamed from: b  reason: collision with root package name */
    List<com.mp4parser.iso23001.part7.a> f13759b;

    /* renamed from: c  reason: collision with root package name */
    n<Integer, SecretKey> f13760c;

    /* renamed from: d  reason: collision with root package name */
    List<f> f13761d;

    /* renamed from: e  reason: collision with root package name */
    String f13762e;

    public a(SecretKey secretKey, List<f> list, List<com.mp4parser.iso23001.part7.a> list2) {
        this(new n(0, secretKey), list, list2, "cenc");
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public f get(int i4) {
        f fVar;
        if (this.f13760c.get(Integer.valueOf(i4)) != null) {
            ByteBuffer a5 = this.f13761d.get(i4).a();
            a5.rewind();
            ByteBuffer allocate = ByteBuffer.allocate(a5.limit());
            com.mp4parser.iso23001.part7.a aVar = this.f13759b.get(i4);
            Cipher b5 = b(this.f13760c.get(Integer.valueOf(i4)), aVar.f57254a);
            try {
                a.k[] kVarArr = aVar.f57255b;
                if (kVarArr != null && kVarArr.length > 0) {
                    for (a.k kVar : kVarArr) {
                        int clear = kVar.clear();
                        int a6 = c.a(kVar.a());
                        byte[] bArr = new byte[clear];
                        a5.get(bArr);
                        allocate.put(bArr);
                        if (a6 > 0) {
                            byte[] bArr2 = new byte[a6];
                            a5.get(bArr2);
                            allocate.put(b5.update(bArr2));
                        }
                    }
                    if (a5.remaining() > 0) {
                        System.err.println("Decrypted sample but still data remaining: " + fVar.getSize());
                    }
                    allocate.put(b5.doFinal());
                } else {
                    int limit = a5.limit();
                    byte[] bArr3 = new byte[limit];
                    a5.get(bArr3);
                    if ("cbc1".equals(this.f13762e)) {
                        int i5 = (limit / 16) * 16;
                        allocate.put(b5.doFinal(bArr3, 0, i5));
                        allocate.put(bArr3, i5, limit - i5);
                    } else if ("cenc".equals(this.f13762e)) {
                        allocate.put(b5.doFinal(bArr3));
                    }
                }
                a5.rewind();
                allocate.rewind();
                return new g(allocate);
            } catch (BadPaddingException e5) {
                throw new RuntimeException(e5);
            } catch (IllegalBlockSizeException e6) {
                throw new RuntimeException(e6);
            }
        }
        return this.f13761d.get(i4);
    }

    Cipher b(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        try {
            if ("cenc".equals(this.f13762e)) {
                Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
                cipher.init(2, secretKey, new IvParameterSpec(bArr2));
                return cipher;
            } else if ("cbc1".equals(this.f13762e)) {
                Cipher cipher2 = Cipher.getInstance(com.kuaishou.weapon.p0.b.f55291a);
                cipher2.init(2, secretKey, new IvParameterSpec(bArr2));
                return cipher2;
            } else {
                throw new RuntimeException("Only cenc & cbc1 is supported as encryptionAlgo");
            }
        } catch (InvalidAlgorithmParameterException e5) {
            throw new RuntimeException(e5);
        } catch (InvalidKeyException e6) {
            throw new RuntimeException(e6);
        } catch (NoSuchAlgorithmException e7) {
            throw new RuntimeException(e7);
        } catch (NoSuchPaddingException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13761d.size();
    }

    public a(n<Integer, SecretKey> nVar, List<f> list, List<com.mp4parser.iso23001.part7.a> list2, String str) {
        this.f13760c = new n<>();
        this.f13759b = list2;
        this.f13760c = nVar;
        this.f13761d = list;
        this.f13762e = str;
    }
}
