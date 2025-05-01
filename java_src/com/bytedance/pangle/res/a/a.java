package com.bytedance.pangle.res.a;

import androidx.core.view.InputDeviceCompat;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f8515f = Logger.getLogger(a.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f8516a;

    /* renamed from: b  reason: collision with root package name */
    private final h f8517b;

    /* renamed from: c  reason: collision with root package name */
    private final g f8518c;

    /* renamed from: d  reason: collision with root package name */
    private final e f8519d;

    /* renamed from: e  reason: collision with root package name */
    private C0221a f8520e;

    /* renamed from: com.bytedance.pangle.res.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0221a {

        /* renamed from: a  reason: collision with root package name */
        public final short f8521a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8522b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8523c;

        /* renamed from: d  reason: collision with root package name */
        public final int f8524d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8525e;

        private C0221a(short s4, int i4, int i5, int i6) {
            this.f8521a = s4;
            this.f8522b = i4;
            this.f8523c = i5;
            this.f8524d = i6;
            this.f8525e = i6 + i5;
        }

        public static C0221a a(g gVar, e eVar) {
            int a5 = eVar.a();
            try {
                return new C0221a(gVar.readShort(), gVar.readShort(), gVar.readInt(), a5);
            } catch (EOFException unused) {
                return new C0221a((short) -1, 0, 0, eVar.a());
            }
        }
    }

    public a(byte[] bArr, h hVar) {
        e eVar = new e(new ByteArrayInputStream(bArr));
        this.f8519d = eVar;
        this.f8518c = new g(new i(eVar));
        this.f8516a = bArr;
        this.f8517b = hVar;
    }

    private String a(int i4) {
        int i5;
        short s4;
        StringBuilder sb = new StringBuilder(16);
        while (true) {
            i5 = i4 - 1;
            if (i4 == 0 || this.f8518c.readByte() == 0) {
                break;
            }
            sb.append((char) s4);
            i4 = i5;
        }
        this.f8518c.skipBytes(i5);
        return sb.toString();
    }

    private void b() {
        b(515);
        int readInt = this.f8518c.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f8518c.readInt();
            this.f8518c.skipBytes(256);
        }
        while (j().f8521a == 513) {
            c();
        }
    }

    private void c() {
        d();
        short s4 = j().f8521a;
        while (s4 == 514) {
            d();
            s4 = j().f8521a;
        }
        while (s4 == 513) {
            e();
            if (this.f8519d.a() < this.f8520e.f8525e) {
                Logger logger = f8515f;
                logger.warning("Unknown data detected. Skipping: " + (this.f8520e.f8525e - this.f8519d.a()) + " byte(s)");
                e eVar = this.f8519d;
                eVar.skip((long) (this.f8520e.f8525e - eVar.a()));
            }
            s4 = j().f8521a;
        }
    }

    private void d() {
        b(514);
        this.f8518c.readUnsignedByte();
        this.f8518c.skipBytes(3);
        this.f8518c.skipBytes(this.f8518c.readInt() * 4);
    }

    private void e() {
        b(InputDeviceCompat.SOURCE_DPAD);
        this.f8518c.readUnsignedByte();
        this.f8518c.readByte();
        this.f8518c.skipBytes(2);
        int readInt = this.f8518c.readInt();
        int readInt2 = this.f8518c.readInt();
        i();
        int i4 = (this.f8520e.f8524d + readInt2) - (readInt * 4);
        if (i4 != this.f8519d.a()) {
            f8515f.warning("Invalid data detected. Skipping: " + (i4 - this.f8519d.a()) + " byte(s)");
            this.f8518c.skipBytes(i4 - this.f8519d.a());
        }
        int[] a5 = this.f8518c.a(readInt);
        HashSet hashSet = new HashSet();
        for (int i5 : a5) {
            if (i5 != -1 && !hashSet.contains(Integer.valueOf(i5))) {
                f();
                hashSet.add(Integer.valueOf(i5));
            }
        }
    }

    private void f() {
        if (this.f8518c.readShort() >= 0) {
            short readShort = this.f8518c.readShort();
            this.f8518c.readInt();
            if ((readShort & 1) == 0) {
                h();
                return;
            } else {
                g();
                return;
            }
        }
        throw new RuntimeException("Entry size is under 0 bytes.");
    }

    private void g() {
        int a5 = k.a(this.f8518c);
        k.a(this.f8516a, this.f8518c.readInt(), a5, this.f8517b);
        int readInt = this.f8518c.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int a6 = k.a(this.f8518c);
            k.a(this.f8516a, this.f8518c.readInt(), a6, this.f8517b);
            h();
        }
    }

    private void h() {
        this.f8518c.a();
        this.f8518c.b();
        byte readByte = this.f8518c.readByte();
        int a5 = k.a(this.f8518c);
        int readInt = this.f8518c.readInt();
        if (readByte == 1) {
            k.a(this.f8516a, readInt, a5, this.f8517b);
        }
        if (readByte == 2) {
            k.a(this.f8516a, readInt, a5, this.f8517b);
        }
    }

    private void i() {
        int readInt = this.f8518c.readInt();
        int i4 = 28;
        if (readInt >= 28) {
            this.f8518c.readShort();
            this.f8518c.readShort();
            this.f8518c.readByte();
            this.f8518c.readByte();
            this.f8518c.readByte();
            this.f8518c.readByte();
            this.f8518c.readByte();
            this.f8518c.readByte();
            this.f8518c.readUnsignedShort();
            this.f8518c.readByte();
            this.f8518c.readByte();
            this.f8518c.readByte();
            this.f8518c.skipBytes(1);
            this.f8518c.readShort();
            this.f8518c.readShort();
            this.f8518c.readShort();
            this.f8518c.skipBytes(2);
            if (readInt >= 32) {
                this.f8518c.readByte();
                this.f8518c.readByte();
                this.f8518c.readShort();
                i4 = 32;
            }
            if (readInt >= 36) {
                this.f8518c.readShort();
                this.f8518c.readShort();
                i4 = 36;
            }
            if (readInt >= 48) {
                a(4).toCharArray();
                a(8).toCharArray();
                i4 = 48;
            }
            if (readInt >= 52) {
                this.f8518c.readByte();
                this.f8518c.readByte();
                this.f8518c.skipBytes(2);
                i4 = 52;
            }
            if (readInt >= 56) {
                this.f8518c.skipBytes(4);
                i4 = 56;
            }
            int i5 = readInt - 56;
            if (i5 > 0) {
                byte[] bArr = new byte[i5];
                i4 += i5;
                this.f8518c.readFully(bArr);
                BigInteger bigInteger = new BigInteger(1, bArr);
                if (bigInteger.equals(BigInteger.ZERO)) {
                    f8515f.fine(String.format("Config flags size > %d, but exceeding bytes are all zero, so it should be ok.", 56));
                } else {
                    f8515f.warning(String.format("Config flags size > %d. Size = %d. Exceeding bytes: 0x%X.", 56, Integer.valueOf(readInt), bigInteger));
                }
            }
            int i6 = readInt - i4;
            if (i6 > 0) {
                this.f8518c.skipBytes(i6);
                return;
            }
            return;
        }
        throw new RuntimeException("Config size < 28");
    }

    private C0221a j() {
        C0221a a5 = C0221a.a(this.f8518c, this.f8519d);
        this.f8520e = a5;
        return a5;
    }

    public final void a() {
        j();
        b(2);
        int readInt = this.f8518c.readInt();
        l.a(this.f8518c);
        j();
        for (int i4 = 0; i4 < readInt; i4++) {
            b(512);
            this.f8518c.readInt();
            this.f8518c.skipBytes(256);
            this.f8518c.skipBytes(4);
            this.f8518c.skipBytes(4);
            this.f8518c.skipBytes(4);
            this.f8518c.skipBytes(4);
            if (this.f8520e.f8522b == 288 && this.f8518c.readInt() > 0) {
                throw new RuntimeException("don't support");
            }
            l.a(this.f8518c);
            l.a(this.f8518c);
            j();
            boolean z4 = true;
            while (z4) {
                short s4 = this.f8520e.f8521a;
                if (s4 == 514) {
                    c();
                } else if (s4 != 515) {
                    z4 = false;
                } else {
                    b();
                }
            }
        }
    }

    private void b(int i4) {
        if (this.f8520e.f8521a != i4) {
            throw new RuntimeException(String.format("Invalid chunk type: expected=0x%08x, got=0x%08x", Integer.valueOf(i4), Short.valueOf(this.f8520e.f8521a)));
        }
    }
}
