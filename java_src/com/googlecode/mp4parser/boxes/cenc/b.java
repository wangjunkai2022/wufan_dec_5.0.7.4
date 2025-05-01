package com.googlecode.mp4parser.boxes.cenc;

import com.googlecode.mp4parser.authoring.f;
import com.googlecode.mp4parser.util.c;
import com.googlecode.mp4parser.util.n;
import com.mp4parser.iso23001.part7.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
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
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
/* compiled from: CencEncryptingSampleList.java */
/* loaded from: classes3.dex */
public class b extends AbstractList<f> {

    /* renamed from: b  reason: collision with root package name */
    private final String f13763b;

    /* renamed from: c  reason: collision with root package name */
    Cipher f13764c;

    /* renamed from: d  reason: collision with root package name */
    List<com.mp4parser.iso23001.part7.a> f13765d;

    /* renamed from: e  reason: collision with root package name */
    n<Integer, SecretKey> f13766e;

    /* renamed from: f  reason: collision with root package name */
    List<f> f13767f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CencEncryptingSampleList.java */
    /* renamed from: com.googlecode.mp4parser.boxes.cenc.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0298b implements f {

        /* renamed from: f  reason: collision with root package name */
        static final /* synthetic */ boolean f13768f = false;

        /* renamed from: a  reason: collision with root package name */
        private final f f13769a;

        /* renamed from: b  reason: collision with root package name */
        private final com.mp4parser.iso23001.part7.a f13770b;

        /* renamed from: c  reason: collision with root package name */
        private final Cipher f13771c;

        /* renamed from: d  reason: collision with root package name */
        private final SecretKey f13772d;

        /* synthetic */ C0298b(b bVar, f fVar, com.mp4parser.iso23001.part7.a aVar, Cipher cipher, SecretKey secretKey, C0298b c0298b) {
            this(fVar, aVar, cipher, secretKey);
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public ByteBuffer a() {
            ByteBuffer byteBuffer = (ByteBuffer) this.f13769a.a().rewind();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit());
            com.mp4parser.iso23001.part7.a aVar = this.f13770b;
            b.this.c(aVar.f57254a, this.f13772d);
            try {
                a.k[] kVarArr = aVar.f57255b;
                if (kVarArr != null) {
                    for (a.k kVar : kVarArr) {
                        byte[] bArr = new byte[kVar.clear()];
                        byteBuffer.get(bArr);
                        allocate.put(bArr);
                        if (kVar.a() > 0) {
                            byte[] bArr2 = new byte[c.a(kVar.a())];
                            byteBuffer.get(bArr2);
                            allocate.put(this.f13771c.update(bArr2));
                        }
                    }
                } else {
                    int limit = byteBuffer.limit();
                    byte[] bArr3 = new byte[limit];
                    byteBuffer.get(bArr3);
                    if (!"cbc1".equals(b.this.f13763b)) {
                        if ("cenc".equals(b.this.f13763b)) {
                            allocate.put(this.f13771c.doFinal(bArr3));
                        }
                    } else {
                        int i4 = (limit / 16) * 16;
                        allocate.put(this.f13771c.doFinal(bArr3, 0, i4));
                        allocate.put(bArr3, i4, limit - i4);
                    }
                }
                byteBuffer.rewind();
                allocate.rewind();
                return allocate;
            } catch (BadPaddingException e5) {
                throw new RuntimeException(e5);
            } catch (IllegalBlockSizeException e6) {
                throw new RuntimeException(e6);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public void b(WritableByteChannel writableByteChannel) throws IOException {
            a.k[] kVarArr;
            ByteBuffer byteBuffer = (ByteBuffer) this.f13769a.a().rewind();
            b.this.c(this.f13770b.f57254a, this.f13772d);
            try {
                a.k[] kVarArr2 = this.f13770b.f57255b;
                if (kVarArr2 != null && kVarArr2.length > 0) {
                    byte[] bArr = new byte[byteBuffer.limit()];
                    byteBuffer.get(bArr);
                    int i4 = 0;
                    for (a.k kVar : this.f13770b.f57255b) {
                        int clear = i4 + kVar.clear();
                        if (kVar.a() > 0) {
                            this.f13771c.update(bArr, clear, c.a(kVar.a()), bArr, clear);
                            i4 = (int) (clear + kVar.a());
                        } else {
                            i4 = clear;
                        }
                    }
                    writableByteChannel.write(ByteBuffer.wrap(bArr));
                } else {
                    int limit = byteBuffer.limit();
                    byte[] bArr2 = new byte[limit];
                    byteBuffer.get(bArr2);
                    if (!"cbc1".equals(b.this.f13763b)) {
                        if ("cenc".equals(b.this.f13763b)) {
                            writableByteChannel.write(ByteBuffer.wrap(this.f13771c.doFinal(bArr2)));
                        }
                    } else {
                        int i5 = (limit / 16) * 16;
                        writableByteChannel.write(ByteBuffer.wrap(this.f13771c.doFinal(bArr2, 0, i5)));
                        writableByteChannel.write(ByteBuffer.wrap(bArr2, i5, limit - i5));
                    }
                }
                byteBuffer.rewind();
            } catch (BadPaddingException e5) {
                throw new RuntimeException(e5);
            } catch (IllegalBlockSizeException e6) {
                throw new RuntimeException(e6);
            } catch (ShortBufferException e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // com.googlecode.mp4parser.authoring.f
        public long getSize() {
            return this.f13769a.getSize();
        }

        private C0298b(f fVar, com.mp4parser.iso23001.part7.a aVar, Cipher cipher, SecretKey secretKey) {
            this.f13769a = fVar;
            this.f13770b = aVar;
            this.f13771c = cipher;
            this.f13772d = secretKey;
        }
    }

    public b(SecretKey secretKey, List<f> list, List<com.mp4parser.iso23001.part7.a> list2) {
        this(new n(0, secretKey), list, list2, "cenc");
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public f get(int i4) {
        f fVar = this.f13767f.get(i4);
        return this.f13766e.get(Integer.valueOf(i4)) != null ? new C0298b(this, fVar, this.f13765d.get(i4), this.f13764c, this.f13766e.get(Integer.valueOf(i4)), null) : fVar;
    }

    protected void c(byte[] bArr, SecretKey secretKey) {
        try {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f13764c.init(1, secretKey, new IvParameterSpec(bArr2));
        } catch (InvalidAlgorithmParameterException e5) {
            throw new RuntimeException(e5);
        } catch (InvalidKeyException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13767f.size();
    }

    public b(n<Integer, SecretKey> nVar, List<f> list, List<com.mp4parser.iso23001.part7.a> list2, String str) {
        this.f13766e = new n<>();
        this.f13765d = list2;
        this.f13766e = nVar;
        this.f13763b = str;
        this.f13767f = list;
        try {
            if ("cenc".equals(str)) {
                this.f13764c = Cipher.getInstance("AES/CTR/NoPadding");
            } else if ("cbc1".equals(str)) {
                this.f13764c = Cipher.getInstance(com.kuaishou.weapon.p0.b.f55291a);
            } else {
                throw new RuntimeException("Only cenc & cbc1 is supported as encryptionAlgo");
            }
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException(e5);
        } catch (NoSuchPaddingException e6) {
            throw new RuntimeException(e6);
        }
    }
}
