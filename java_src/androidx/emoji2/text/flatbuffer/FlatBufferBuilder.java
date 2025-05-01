package androidx.emoji2.text.flatbuffer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* loaded from: classes2.dex */
public class FlatBufferBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    ByteBuffer bb;
    ByteBufferFactory bb_factory;
    boolean finished;
    boolean force_defaults;
    int minalign;
    boolean nested;
    int num_vtables;
    int object_start;
    int space;
    final Utf8 utf8;
    int vector_num_elems;
    int[] vtable;
    int vtable_in_use;
    int[] vtables;

    /* loaded from: classes2.dex */
    static class ByteBufferBackedInputStream extends InputStream {
        ByteBuffer buf;

        public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
            this.buf = byteBuffer;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            try {
                return this.buf.get() & 255;
            } catch (BufferUnderflowException unused) {
                return -1;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ByteBufferFactory {
        public abstract ByteBuffer newByteBuffer(int i4);

        public void releaseByteBuffer(ByteBuffer byteBuffer) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class HeapByteBufferFactory extends ByteBufferFactory {
        public static final HeapByteBufferFactory INSTANCE = new HeapByteBufferFactory();

        @Override // androidx.emoji2.text.flatbuffer.FlatBufferBuilder.ByteBufferFactory
        public ByteBuffer newByteBuffer(int i4) {
            return ByteBuffer.allocate(i4).order(ByteOrder.LITTLE_ENDIAN);
        }
    }

    public FlatBufferBuilder(int i4, ByteBufferFactory byteBufferFactory) {
        this(i4, byteBufferFactory, null, Utf8.getDefault());
    }

    @Deprecated
    private int dataStart() {
        finished();
        return this.space;
    }

    static ByteBuffer growByteBuffer(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        int capacity = byteBuffer.capacity();
        if (((-1073741824) & capacity) == 0) {
            int i4 = capacity == 0 ? 1 : capacity << 1;
            byteBuffer.position(0);
            ByteBuffer newByteBuffer = byteBufferFactory.newByteBuffer(i4);
            newByteBuffer.position(newByteBuffer.clear().capacity() - capacity);
            newByteBuffer.put(byteBuffer);
            return newByteBuffer;
        }
        throw new AssertionError("FlatBuffers: cannot grow buffer beyond 2 gigabytes.");
    }

    public static boolean isFieldPresent(Table table, int i4) {
        return table.__offset(i4) != 0;
    }

    public void Nested(int i4) {
        if (i4 != offset()) {
            throw new AssertionError("FlatBuffers: struct must be serialized inline.");
        }
    }

    public void addBoolean(boolean z4) {
        prep(1, 0);
        putBoolean(z4);
    }

    public void addByte(byte b5) {
        prep(1, 0);
        putByte(b5);
    }

    public void addDouble(double d5) {
        prep(8, 0);
        putDouble(d5);
    }

    public void addFloat(float f5) {
        prep(4, 0);
        putFloat(f5);
    }

    public void addInt(int i4) {
        prep(4, 0);
        putInt(i4);
    }

    public void addLong(long j4) {
        prep(8, 0);
        putLong(j4);
    }

    public void addOffset(int i4) {
        prep(4, 0);
        putInt((offset() - i4) + 4);
    }

    public void addShort(short s4) {
        prep(2, 0);
        putShort(s4);
    }

    public void addStruct(int i4, int i5, int i6) {
        if (i5 != i6) {
            Nested(i5);
            slot(i4);
        }
    }

    public void clear() {
        this.space = this.bb.capacity();
        this.bb.clear();
        this.minalign = 1;
        while (true) {
            int i4 = this.vtable_in_use;
            if (i4 <= 0) {
                this.vtable_in_use = 0;
                this.nested = false;
                this.finished = false;
                this.object_start = 0;
                this.num_vtables = 0;
                this.vector_num_elems = 0;
                return;
            }
            int[] iArr = this.vtable;
            int i5 = i4 - 1;
            this.vtable_in_use = i5;
            iArr[i5] = 0;
        }
    }

    public int createByteVector(byte[] bArr) {
        int length = bArr.length;
        startVector(1, length, 1);
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - length;
        this.space = i4;
        byteBuffer.position(i4);
        this.bb.put(bArr);
        return endVector();
    }

    public <T extends Table> int createSortedVectorOfTables(T t4, int[] iArr) {
        t4.sortTables(iArr, this.bb);
        return createVectorOfTables(iArr);
    }

    public int createString(CharSequence charSequence) {
        int encodedLength = this.utf8.encodedLength(charSequence);
        addByte((byte) 0);
        startVector(1, encodedLength, 1);
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - encodedLength;
        this.space = i4;
        byteBuffer.position(i4);
        this.utf8.encodeUtf8(charSequence, this.bb);
        return endVector();
    }

    public ByteBuffer createUnintializedVector(int i4, int i5, int i6) {
        int i7 = i4 * i5;
        startVector(i4, i5, i6);
        ByteBuffer byteBuffer = this.bb;
        int i8 = this.space - i7;
        this.space = i8;
        byteBuffer.position(i8);
        ByteBuffer order = this.bb.slice().order(ByteOrder.LITTLE_ENDIAN);
        order.limit(i7);
        return order;
    }

    public int createVectorOfTables(int[] iArr) {
        notNested();
        startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            addOffset(iArr[length]);
        }
        return endVector();
    }

    public ByteBuffer dataBuffer() {
        finished();
        return this.bb;
    }

    public int endTable() {
        int i4;
        if (this.vtable != null && this.nested) {
            addInt(0);
            int offset = offset();
            int i5 = this.vtable_in_use - 1;
            while (i5 >= 0 && this.vtable[i5] == 0) {
                i5--;
            }
            int i6 = i5 + 1;
            while (i5 >= 0) {
                int[] iArr = this.vtable;
                addShort((short) (iArr[i5] != 0 ? offset - iArr[i5] : 0));
                i5--;
            }
            addShort((short) (offset - this.object_start));
            addShort((short) ((i6 + 2) * 2));
            int i7 = 0;
            loop2: while (true) {
                if (i7 >= this.num_vtables) {
                    i4 = 0;
                    break;
                }
                int capacity = this.bb.capacity() - this.vtables[i7];
                int i8 = this.space;
                short s4 = this.bb.getShort(capacity);
                if (s4 == this.bb.getShort(i8)) {
                    for (int i9 = 2; i9 < s4; i9 += 2) {
                        if (this.bb.getShort(capacity + i9) != this.bb.getShort(i8 + i9)) {
                            break;
                        }
                    }
                    i4 = this.vtables[i7];
                    break loop2;
                }
                i7++;
            }
            if (i4 != 0) {
                int capacity2 = this.bb.capacity() - offset;
                this.space = capacity2;
                this.bb.putInt(capacity2, i4 - offset);
            } else {
                int i10 = this.num_vtables;
                int[] iArr2 = this.vtables;
                if (i10 == iArr2.length) {
                    this.vtables = Arrays.copyOf(iArr2, i10 * 2);
                }
                int[] iArr3 = this.vtables;
                int i11 = this.num_vtables;
                this.num_vtables = i11 + 1;
                iArr3[i11] = offset();
                ByteBuffer byteBuffer = this.bb;
                byteBuffer.putInt(byteBuffer.capacity() - offset, offset() - offset);
            }
            this.nested = false;
            return offset;
        }
        throw new AssertionError("FlatBuffers: endTable called without startTable");
    }

    public int endVector() {
        if (this.nested) {
            this.nested = false;
            putInt(this.vector_num_elems);
            return offset();
        }
        throw new AssertionError("FlatBuffers: endVector called without startVector");
    }

    protected void finish(int i4, boolean z4) {
        prep(this.minalign, (z4 ? 4 : 0) + 4);
        addOffset(i4);
        if (z4) {
            addInt(this.bb.capacity() - this.space);
        }
        this.bb.position(this.space);
        this.finished = true;
    }

    public void finishSizePrefixed(int i4) {
        finish(i4, true);
    }

    public void finished() {
        if (!this.finished) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
    }

    public FlatBufferBuilder forceDefaults(boolean z4) {
        this.force_defaults = z4;
        return this;
    }

    public FlatBufferBuilder init(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this.bb_factory = byteBufferFactory;
        this.bb = byteBuffer;
        byteBuffer.clear();
        this.bb.order(ByteOrder.LITTLE_ENDIAN);
        this.minalign = 1;
        this.space = this.bb.capacity();
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.object_start = 0;
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        return this;
    }

    public void notNested() {
        if (this.nested) {
            throw new AssertionError("FlatBuffers: object serialization must not be nested.");
        }
    }

    public int offset() {
        return this.bb.capacity() - this.space;
    }

    public void pad(int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer byteBuffer = this.bb;
            int i6 = this.space - 1;
            this.space = i6;
            byteBuffer.put(i6, (byte) 0);
        }
    }

    public void prep(int i4, int i5) {
        if (i4 > this.minalign) {
            this.minalign = i4;
        }
        int capacity = ((((this.bb.capacity() - this.space) + i5) ^ (-1)) + 1) & (i4 - 1);
        while (this.space < capacity + i4 + i5) {
            int capacity2 = this.bb.capacity();
            ByteBuffer byteBuffer = this.bb;
            ByteBuffer growByteBuffer = growByteBuffer(byteBuffer, this.bb_factory);
            this.bb = growByteBuffer;
            if (byteBuffer != growByteBuffer) {
                this.bb_factory.releaseByteBuffer(byteBuffer);
            }
            this.space += this.bb.capacity() - capacity2;
        }
        pad(capacity);
    }

    public void putBoolean(boolean z4) {
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - 1;
        this.space = i4;
        byteBuffer.put(i4, z4 ? (byte) 1 : (byte) 0);
    }

    public void putByte(byte b5) {
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - 1;
        this.space = i4;
        byteBuffer.put(i4, b5);
    }

    public void putDouble(double d5) {
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - 8;
        this.space = i4;
        byteBuffer.putDouble(i4, d5);
    }

    public void putFloat(float f5) {
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - 4;
        this.space = i4;
        byteBuffer.putFloat(i4, f5);
    }

    public void putInt(int i4) {
        ByteBuffer byteBuffer = this.bb;
        int i5 = this.space - 4;
        this.space = i5;
        byteBuffer.putInt(i5, i4);
    }

    public void putLong(long j4) {
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - 8;
        this.space = i4;
        byteBuffer.putLong(i4, j4);
    }

    public void putShort(short s4) {
        ByteBuffer byteBuffer = this.bb;
        int i4 = this.space - 2;
        this.space = i4;
        byteBuffer.putShort(i4, s4);
    }

    public void required(int i4, int i5) {
        int capacity = this.bb.capacity() - i4;
        if (this.bb.getShort((capacity - this.bb.getInt(capacity)) + i5) != 0) {
            return;
        }
        throw new AssertionError("FlatBuffers: field " + i5 + " must be set");
    }

    public byte[] sizedByteArray(int i4, int i5) {
        finished();
        byte[] bArr = new byte[i5];
        this.bb.position(i4);
        this.bb.get(bArr);
        return bArr;
    }

    public InputStream sizedInputStream() {
        finished();
        ByteBuffer duplicate = this.bb.duplicate();
        duplicate.position(this.space);
        duplicate.limit(this.bb.capacity());
        return new ByteBufferBackedInputStream(duplicate);
    }

    public void slot(int i4) {
        this.vtable[i4] = offset();
    }

    public void startTable(int i4) {
        notNested();
        int[] iArr = this.vtable;
        if (iArr == null || iArr.length < i4) {
            this.vtable = new int[i4];
        }
        this.vtable_in_use = i4;
        Arrays.fill(this.vtable, 0, i4, 0);
        this.nested = true;
        this.object_start = offset();
    }

    public void startVector(int i4, int i5, int i6) {
        notNested();
        this.vector_num_elems = i5;
        int i7 = i4 * i5;
        prep(4, i7);
        prep(i6, i7);
        this.nested = true;
    }

    public FlatBufferBuilder(int i4, ByteBufferFactory byteBufferFactory, ByteBuffer byteBuffer, Utf8 utf8) {
        this.minalign = 1;
        this.vtable = null;
        this.vtable_in_use = 0;
        this.nested = false;
        this.finished = false;
        this.vtables = new int[16];
        this.num_vtables = 0;
        this.vector_num_elems = 0;
        this.force_defaults = false;
        i4 = i4 <= 0 ? 1 : i4;
        this.bb_factory = byteBufferFactory;
        if (byteBuffer != null) {
            this.bb = byteBuffer;
            byteBuffer.clear();
            this.bb.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.bb = byteBufferFactory.newByteBuffer(i4);
        }
        this.utf8 = utf8;
        this.space = this.bb.capacity();
    }

    public void addBoolean(int i4, boolean z4, boolean z5) {
        if (this.force_defaults || z4 != z5) {
            addBoolean(z4);
            slot(i4);
        }
    }

    public void addByte(int i4, byte b5, int i5) {
        if (this.force_defaults || b5 != i5) {
            addByte(b5);
            slot(i4);
        }
    }

    public void addDouble(int i4, double d5, double d6) {
        if (this.force_defaults || d5 != d6) {
            addDouble(d5);
            slot(i4);
        }
    }

    public void addFloat(int i4, float f5, double d5) {
        if (this.force_defaults || f5 != d5) {
            addFloat(f5);
            slot(i4);
        }
    }

    public void addInt(int i4, int i5, int i6) {
        if (this.force_defaults || i5 != i6) {
            addInt(i5);
            slot(i4);
        }
    }

    public void addLong(int i4, long j4, long j5) {
        if (this.force_defaults || j4 != j5) {
            addLong(j4);
            slot(i4);
        }
    }

    public void addShort(int i4, short s4, int i5) {
        if (this.force_defaults || s4 != i5) {
            addShort(s4);
            slot(i4);
        }
    }

    public void finishSizePrefixed(int i4, String str) {
        finish(i4, str, true);
    }

    public void addOffset(int i4, int i5, int i6) {
        if (this.force_defaults || i5 != i6) {
            addOffset(i5);
            slot(i4);
        }
    }

    public byte[] sizedByteArray() {
        return sizedByteArray(this.space, this.bb.capacity() - this.space);
    }

    public int createByteVector(byte[] bArr, int i4, int i5) {
        startVector(1, i5, 1);
        ByteBuffer byteBuffer = this.bb;
        int i6 = this.space - i5;
        this.space = i6;
        byteBuffer.position(i6);
        this.bb.put(bArr, i4, i5);
        return endVector();
    }

    public void finish(int i4) {
        finish(i4, false);
    }

    public int createString(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        addByte((byte) 0);
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.bb;
        int i4 = this.space - remaining;
        this.space = i4;
        byteBuffer2.position(i4);
        this.bb.put(byteBuffer);
        return endVector();
    }

    protected void finish(int i4, String str, boolean z4) {
        prep(this.minalign, (z4 ? 4 : 0) + 8);
        if (str.length() == 4) {
            for (int i5 = 3; i5 >= 0; i5--) {
                addByte((byte) str.charAt(i5));
            }
            finish(i4, z4);
            return;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public int createByteVector(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        startVector(1, remaining, 1);
        ByteBuffer byteBuffer2 = this.bb;
        int i4 = this.space - remaining;
        this.space = i4;
        byteBuffer2.position(i4);
        this.bb.put(byteBuffer);
        return endVector();
    }

    public void finish(int i4, String str) {
        finish(i4, str, false);
    }

    public FlatBufferBuilder(int i4) {
        this(i4, HeapByteBufferFactory.INSTANCE, null, Utf8.getDefault());
    }

    public FlatBufferBuilder() {
        this(1024);
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer, ByteBufferFactory byteBufferFactory) {
        this(byteBuffer.capacity(), byteBufferFactory, byteBuffer, Utf8.getDefault());
    }

    public FlatBufferBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, new HeapByteBufferFactory());
    }
}
