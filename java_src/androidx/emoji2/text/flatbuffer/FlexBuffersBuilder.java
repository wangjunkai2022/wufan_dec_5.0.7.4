package androidx.emoji2.text.flatbuffer;

import androidx.emoji2.text.flatbuffer.FlexBuffers;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class FlexBuffersBuilder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int BUILDER_FLAG_NONE = 0;
    public static final int BUILDER_FLAG_SHARE_ALL = 7;
    public static final int BUILDER_FLAG_SHARE_KEYS = 1;
    public static final int BUILDER_FLAG_SHARE_KEYS_AND_STRINGS = 3;
    public static final int BUILDER_FLAG_SHARE_KEY_VECTORS = 4;
    public static final int BUILDER_FLAG_SHARE_STRINGS = 2;
    private static final int WIDTH_16 = 1;
    private static final int WIDTH_32 = 2;
    private static final int WIDTH_64 = 3;
    private static final int WIDTH_8 = 0;
    private final ReadWriteBuf bb;
    private boolean finished;
    private final int flags;
    private Comparator<Value> keyComparator;
    private final HashMap<String, Integer> keyPool;
    private final ArrayList<Value> stack;
    private final HashMap<String, Integer> stringPool;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class Value {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final double dValue;
        long iValue;
        int key;
        final int minBitWidth;
        final int type;

        Value(int i4, int i5, int i6, long j4) {
            this.key = i4;
            this.type = i5;
            this.minBitWidth = i6;
            this.iValue = j4;
            this.dValue = Double.MIN_VALUE;
        }

        static Value blob(int i4, int i5, int i6, int i7) {
            return new Value(i4, i6, i7, i5);
        }

        static Value bool(int i4, boolean z4) {
            return new Value(i4, 26, 0, z4 ? 1L : 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int elemWidth(int i4, int i5) {
            return elemWidth(this.type, this.minBitWidth, this.iValue, i4, i5);
        }

        static Value float32(int i4, float f5) {
            return new Value(i4, 3, 2, f5);
        }

        static Value float64(int i4, double d5) {
            return new Value(i4, 3, 3, d5);
        }

        static Value int16(int i4, int i5) {
            return new Value(i4, 1, 1, i5);
        }

        static Value int32(int i4, int i5) {
            return new Value(i4, 1, 2, i5);
        }

        static Value int64(int i4, long j4) {
            return new Value(i4, 1, 3, j4);
        }

        static Value int8(int i4, int i5) {
            return new Value(i4, 1, 0, i5);
        }

        private static byte packedType(int i4, int i5) {
            return (byte) (i4 | (i5 << 2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int paddingBytes(int i4, int i5) {
            return ((i4 ^ (-1)) + 1) & (i5 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType() {
            return storedPackedType(0);
        }

        private int storedWidth(int i4) {
            if (FlexBuffers.isTypeInline(this.type)) {
                return Math.max(this.minBitWidth, i4);
            }
            return this.minBitWidth;
        }

        static Value uInt16(int i4, int i5) {
            return new Value(i4, 2, 1, i5);
        }

        static Value uInt32(int i4, int i5) {
            return new Value(i4, 2, 2, i5);
        }

        static Value uInt64(int i4, long j4) {
            return new Value(i4, 2, 3, j4);
        }

        static Value uInt8(int i4, int i5) {
            return new Value(i4, 2, 0, i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int elemWidth(int i4, int i5, long j4, int i6, int i7) {
            if (FlexBuffers.isTypeInline(i4)) {
                return i5;
            }
            for (int i8 = 1; i8 <= 32; i8 *= 2) {
                int widthUInBits = FlexBuffersBuilder.widthUInBits((int) (((paddingBytes(i6, i8) + i6) + (i7 * i8)) - j4));
                if ((1 << widthUInBits) == i8) {
                    return widthUInBits;
                }
            }
            return 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte storedPackedType(int i4) {
            return packedType(storedWidth(i4), this.type);
        }

        Value(int i4, int i5, int i6, double d5) {
            this.key = i4;
            this.type = i5;
            this.minBitWidth = i6;
            this.dValue = d5;
            this.iValue = Long.MIN_VALUE;
        }
    }

    public FlexBuffersBuilder(int i4) {
        this(new ArrayReadWriteBuf(i4), 1);
    }

    private int align(int i4) {
        int i5 = 1 << i4;
        int paddingBytes = Value.paddingBytes(this.bb.writePosition(), i5);
        while (true) {
            int i6 = paddingBytes - 1;
            if (paddingBytes == 0) {
                return i5;
            }
            this.bb.put((byte) 0);
            paddingBytes = i6;
        }
    }

    private Value createKeyVector(int i4, int i5) {
        long j4 = i5;
        int max = Math.max(0, widthUInBits(j4));
        int i6 = i4;
        while (i6 < this.stack.size()) {
            i6++;
            max = Math.max(max, Value.elemWidth(4, 0, this.stack.get(i6).key, this.bb.writePosition(), i6));
        }
        int align = align(max);
        writeInt(j4, align);
        int writePosition = this.bb.writePosition();
        while (i4 < this.stack.size()) {
            int i7 = this.stack.get(i4).key;
            writeOffset(this.stack.get(i4).key, align);
            i4++;
        }
        return new Value(-1, FlexBuffers.toTypedVector(4, 0), max, writePosition);
    }

    private Value createVector(int i4, int i5, int i6, boolean z4, boolean z5, Value value) {
        int i7;
        int i8;
        int i9 = i6;
        long j4 = i9;
        int max = Math.max(0, widthUInBits(j4));
        if (value != null) {
            max = Math.max(max, value.elemWidth(this.bb.writePosition(), 0));
            i7 = 3;
        } else {
            i7 = 1;
        }
        int i10 = 4;
        int i11 = max;
        for (int i12 = i5; i12 < this.stack.size(); i12++) {
            i11 = Math.max(i11, this.stack.get(i12).elemWidth(this.bb.writePosition(), i12 + i7));
            if (z4 && i12 == i5) {
                i10 = this.stack.get(i12).type;
                if (!FlexBuffers.isTypedVectorElementType(i10)) {
                    throw new FlexBuffers.FlexBufferException("TypedVector does not support this element type");
                }
            }
        }
        int i13 = i5;
        int align = align(i11);
        if (value != null) {
            writeOffset(value.iValue, align);
            writeInt(1 << value.minBitWidth, align);
        }
        if (!z5) {
            writeInt(j4, align);
        }
        int writePosition = this.bb.writePosition();
        for (int i14 = i13; i14 < this.stack.size(); i14++) {
            writeAny(this.stack.get(i14), align);
        }
        if (!z4) {
            while (i13 < this.stack.size()) {
                this.bb.put(this.stack.get(i13).storedPackedType(i11));
                i13++;
            }
        }
        if (value != null) {
            i8 = 9;
        } else if (z4) {
            if (!z5) {
                i9 = 0;
            }
            i8 = FlexBuffers.toTypedVector(i10, i9);
        } else {
            i8 = 10;
        }
        return new Value(i4, i8, i11, writePosition);
    }

    private int putKey(String str) {
        if (str == null) {
            return -1;
        }
        int writePosition = this.bb.writePosition();
        if ((this.flags & 1) != 0) {
            Integer num = this.keyPool.get(str);
            if (num == null) {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                this.bb.put(bytes, 0, bytes.length);
                this.bb.put((byte) 0);
                this.keyPool.put(str, Integer.valueOf(writePosition));
                return writePosition;
            }
            return num.intValue();
        }
        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
        this.bb.put(bytes2, 0, bytes2.length);
        this.bb.put((byte) 0);
        this.keyPool.put(str, Integer.valueOf(writePosition));
        return writePosition;
    }

    static int widthUInBits(long j4) {
        if (j4 <= FlexBuffers.Unsigned.byteToUnsignedInt((byte) -1)) {
            return 0;
        }
        if (j4 <= FlexBuffers.Unsigned.shortToUnsignedInt((short) -1)) {
            return 1;
        }
        return j4 <= FlexBuffers.Unsigned.intToUnsignedLong(-1) ? 2 : 3;
    }

    private void writeAny(Value value, int i4) {
        int i5 = value.type;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            if (i5 == 3) {
                writeDouble(value.dValue, i4);
                return;
            } else if (i5 != 26) {
                writeOffset(value.iValue, i4);
                return;
            }
        }
        writeInt(value.iValue, i4);
    }

    private Value writeBlob(int i4, byte[] bArr, int i5, boolean z4) {
        int widthUInBits = widthUInBits(bArr.length);
        writeInt(bArr.length, align(widthUInBits));
        int writePosition = this.bb.writePosition();
        this.bb.put(bArr, 0, bArr.length);
        if (z4) {
            this.bb.put((byte) 0);
        }
        return Value.blob(i4, writePosition, i5, widthUInBits);
    }

    private void writeDouble(double d5, int i4) {
        if (i4 == 4) {
            this.bb.putFloat((float) d5);
        } else if (i4 == 8) {
            this.bb.putDouble(d5);
        }
    }

    private void writeInt(long j4, int i4) {
        if (i4 == 1) {
            this.bb.put((byte) j4);
        } else if (i4 == 2) {
            this.bb.putShort((short) j4);
        } else if (i4 == 4) {
            this.bb.putInt((int) j4);
        } else if (i4 != 8) {
        } else {
            this.bb.putLong(j4);
        }
    }

    private void writeOffset(long j4, int i4) {
        writeInt((int) (this.bb.writePosition() - j4), i4);
    }

    private Value writeString(int i4, String str) {
        return writeBlob(i4, str.getBytes(StandardCharsets.UTF_8), 5, true);
    }

    public int endMap(String str, int i4) {
        int putKey = putKey(str);
        ArrayList<Value> arrayList = this.stack;
        Collections.sort(arrayList.subList(i4, arrayList.size()), this.keyComparator);
        Value createVector = createVector(putKey, i4, this.stack.size() - i4, false, false, createKeyVector(i4, this.stack.size() - i4));
        while (this.stack.size() > i4) {
            ArrayList<Value> arrayList2 = this.stack;
            arrayList2.remove(arrayList2.size() - 1);
        }
        this.stack.add(createVector);
        return (int) createVector.iValue;
    }

    public int endVector(String str, int i4, boolean z4, boolean z5) {
        Value createVector = createVector(putKey(str), i4, this.stack.size() - i4, z4, z5, null);
        while (this.stack.size() > i4) {
            ArrayList<Value> arrayList = this.stack;
            arrayList.remove(arrayList.size() - 1);
        }
        this.stack.add(createVector);
        return (int) createVector.iValue;
    }

    public ByteBuffer finish() {
        int align = align(this.stack.get(0).elemWidth(this.bb.writePosition(), 0));
        writeAny(this.stack.get(0), align);
        this.bb.put(this.stack.get(0).storedPackedType());
        this.bb.put((byte) align);
        this.finished = true;
        return ByteBuffer.wrap(this.bb.data(), 0, this.bb.writePosition());
    }

    public ReadWriteBuf getBuffer() {
        return this.bb;
    }

    public int putBlob(byte[] bArr) {
        return putBlob(null, bArr);
    }

    public void putBoolean(boolean z4) {
        putBoolean(null, z4);
    }

    public void putFloat(float f5) {
        putFloat((String) null, f5);
    }

    public void putInt(int i4) {
        putInt((String) null, i4);
    }

    public int putString(String str) {
        return putString(null, str);
    }

    public void putUInt(int i4) {
        putUInt(null, i4);
    }

    public void putUInt64(BigInteger bigInteger) {
        putUInt64(null, bigInteger.longValue());
    }

    public int startMap() {
        return this.stack.size();
    }

    public int startVector() {
        return this.stack.size();
    }

    public FlexBuffersBuilder() {
        this(256);
    }

    private void putUInt64(String str, long j4) {
        this.stack.add(Value.uInt64(putKey(str), j4));
    }

    public int putBlob(String str, byte[] bArr) {
        Value writeBlob = writeBlob(putKey(str), bArr, 25, false);
        this.stack.add(writeBlob);
        return (int) writeBlob.iValue;
    }

    public void putBoolean(String str, boolean z4) {
        this.stack.add(Value.bool(putKey(str), z4));
    }

    public void putFloat(String str, float f5) {
        this.stack.add(Value.float32(putKey(str), f5));
    }

    public void putInt(String str, int i4) {
        putInt(str, i4);
    }

    public int putString(String str, String str2) {
        long j4;
        int putKey = putKey(str);
        if ((this.flags & 2) != 0) {
            Integer num = this.stringPool.get(str2);
            if (num == null) {
                Value writeString = writeString(putKey, str2);
                this.stringPool.put(str2, Integer.valueOf((int) writeString.iValue));
                this.stack.add(writeString);
                j4 = writeString.iValue;
            } else {
                this.stack.add(Value.blob(putKey, num.intValue(), 5, widthUInBits(str2.length())));
                return num.intValue();
            }
        } else {
            Value writeString2 = writeString(putKey, str2);
            this.stack.add(writeString2);
            j4 = writeString2.iValue;
        }
        return (int) j4;
    }

    public void putUInt(long j4) {
        putUInt(null, j4);
    }

    @Deprecated
    public FlexBuffersBuilder(ByteBuffer byteBuffer, int i4) {
        this(new ArrayReadWriteBuf(byteBuffer.array()), i4);
    }

    private void putUInt(String str, long j4) {
        Value uInt64;
        int putKey = putKey(str);
        int widthUInBits = widthUInBits(j4);
        if (widthUInBits == 0) {
            uInt64 = Value.uInt8(putKey, (int) j4);
        } else if (widthUInBits == 1) {
            uInt64 = Value.uInt16(putKey, (int) j4);
        } else if (widthUInBits == 2) {
            uInt64 = Value.uInt32(putKey, (int) j4);
        } else {
            uInt64 = Value.uInt64(putKey, j4);
        }
        this.stack.add(uInt64);
    }

    public void putFloat(double d5) {
        putFloat((String) null, d5);
    }

    public void putInt(String str, long j4) {
        int putKey = putKey(str);
        if (-128 <= j4 && j4 <= 127) {
            this.stack.add(Value.int8(putKey, (int) j4));
        } else if (-32768 <= j4 && j4 <= 32767) {
            this.stack.add(Value.int16(putKey, (int) j4));
        } else if (-2147483648L <= j4 && j4 <= 2147483647L) {
            this.stack.add(Value.int32(putKey, (int) j4));
        } else {
            this.stack.add(Value.int64(putKey, j4));
        }
    }

    public FlexBuffersBuilder(ReadWriteBuf readWriteBuf, int i4) {
        this.stack = new ArrayList<>();
        this.keyPool = new HashMap<>();
        this.stringPool = new HashMap<>();
        this.finished = false;
        this.keyComparator = new Comparator<Value>() { // from class: androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.1
            @Override // java.util.Comparator
            public int compare(Value value, Value value2) {
                byte b5;
                byte b6;
                int i5 = value.key;
                int i6 = value2.key;
                do {
                    b5 = FlexBuffersBuilder.this.bb.get(i5);
                    b6 = FlexBuffersBuilder.this.bb.get(i6);
                    if (b5 == 0) {
                        return b5 - b6;
                    }
                    i5++;
                    i6++;
                } while (b5 == b6);
                return b5 - b6;
            }
        };
        this.bb = readWriteBuf;
        this.flags = i4;
    }

    public void putFloat(String str, double d5) {
        this.stack.add(Value.float64(putKey(str), d5));
    }

    public void putInt(long j4) {
        putInt((String) null, j4);
    }

    public FlexBuffersBuilder(ByteBuffer byteBuffer) {
        this(byteBuffer, 1);
    }
}
