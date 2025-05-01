package org.jboss.netty.buffer;

import com.join.mgps.activity.PayNowActivity_;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
/* compiled from: DirectChannelBufferFactory.java */
/* loaded from: classes7.dex */
public class j extends b {

    /* renamed from: i  reason: collision with root package name */
    private static final j f72476i = new j(ByteOrder.BIG_ENDIAN);

    /* renamed from: j  reason: collision with root package name */
    private static final j f72477j = new j(ByteOrder.LITTLE_ENDIAN);

    /* renamed from: b  reason: collision with root package name */
    private final Object f72478b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f72479c;

    /* renamed from: d  reason: collision with root package name */
    private final int f72480d;

    /* renamed from: e  reason: collision with root package name */
    private e f72481e;

    /* renamed from: f  reason: collision with root package name */
    private int f72482f;

    /* renamed from: g  reason: collision with root package name */
    private e f72483g;

    /* renamed from: h  reason: collision with root package name */
    private int f72484h;

    public j() {
        this(ByteOrder.BIG_ENDIAN);
    }

    private e g(int i4) {
        e a5;
        synchronized (this.f72478b) {
            e eVar = this.f72481e;
            if (eVar == null) {
                e B = h.B(ByteOrder.BIG_ENDIAN, this.f72480d);
                this.f72481e = B;
                a5 = B.a(0, i4);
                this.f72482f = i4;
            } else {
                int capacity = eVar.capacity();
                int i5 = this.f72482f;
                if (capacity - i5 >= i4) {
                    a5 = this.f72481e.a(i5, i4);
                    this.f72482f += i4;
                } else {
                    e B2 = h.B(ByteOrder.BIG_ENDIAN, this.f72480d);
                    this.f72481e = B2;
                    a5 = B2.a(0, i4);
                    this.f72482f = i4;
                }
            }
        }
        return a5;
    }

    private e h(int i4) {
        e a5;
        synchronized (this.f72479c) {
            e eVar = this.f72483g;
            if (eVar == null) {
                e B = h.B(ByteOrder.LITTLE_ENDIAN, this.f72480d);
                this.f72483g = B;
                a5 = B.a(0, i4);
                this.f72484h = i4;
            } else {
                int capacity = eVar.capacity();
                int i5 = this.f72484h;
                if (capacity - i5 >= i4) {
                    a5 = this.f72483g.a(i5, i4);
                    this.f72484h += i4;
                } else {
                    e B2 = h.B(ByteOrder.LITTLE_ENDIAN, this.f72480d);
                    this.f72483g = B2;
                    a5 = B2.a(0, i4);
                    this.f72484h = i4;
                }
            }
        }
        return a5;
    }

    public static f i() {
        return f72476i;
    }

    public static f j(ByteOrder byteOrder) {
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return f72476i;
        }
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return f72477j;
        }
        Objects.requireNonNull(byteOrder, "defaultEndianness");
        throw new IllegalStateException("Should not reach here");
    }

    @Override // org.jboss.netty.buffer.f
    public e b(ByteOrder byteOrder, byte[] bArr, int i4, int i5) {
        Objects.requireNonNull(bArr, "array");
        if (i4 < 0) {
            throw new IndexOutOfBoundsException("offset: " + i4);
        } else if (i5 == 0) {
            return h.f72468c;
        } else {
            if (i4 + i5 <= bArr.length) {
                e f5 = f(byteOrder, i5);
                f5.b0(bArr, i4, i5);
                return f5;
            }
            throw new IndexOutOfBoundsException("length: " + i5);
        }
    }

    @Override // org.jboss.netty.buffer.f
    public e c(ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly() && byteBuffer.isDirect()) {
            return h.Z(byteBuffer);
        }
        e f5 = f(byteBuffer.order(), byteBuffer.remaining());
        int position = byteBuffer.position();
        f5.z0(byteBuffer);
        byteBuffer.position(position);
        return f5;
    }

    @Override // org.jboss.netty.buffer.f
    public e f(ByteOrder byteOrder, int i4) {
        e h4;
        Objects.requireNonNull(byteOrder, PayNowActivity_.W);
        if (i4 < 0) {
            throw new IllegalArgumentException("capacity: " + i4);
        } else if (i4 == 0) {
            return h.f72468c;
        } else {
            if (i4 >= this.f72480d) {
                return h.B(byteOrder, i4);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                h4 = g(i4);
            } else {
                h4 = h(i4);
            }
            h4.clear();
            return h4;
        }
    }

    public j(int i4) {
        this(ByteOrder.BIG_ENDIAN, i4);
    }

    public j(ByteOrder byteOrder) {
        this(byteOrder, 1048576);
    }

    public j(ByteOrder byteOrder, int i4) {
        super(byteOrder);
        this.f72478b = new Object();
        this.f72479c = new Object();
        if (i4 > 0) {
            this.f72480d = i4;
            return;
        }
        throw new IllegalArgumentException("preallocatedBufCapacity must be greater than 0: " + i4);
    }
}
