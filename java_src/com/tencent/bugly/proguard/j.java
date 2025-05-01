package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f62641a;

    /* renamed from: b  reason: collision with root package name */
    private String f62642b;

    public j(int i4) {
        this.f62642b = "GBK";
        this.f62641a = ByteBuffer.allocate(i4);
    }

    public final ByteBuffer a() {
        return this.f62641a;
    }

    public final byte[] b() {
        byte[] bArr = new byte[this.f62641a.position()];
        System.arraycopy(this.f62641a.array(), 0, bArr, 0, this.f62641a.position());
        return bArr;
    }

    private void a(int i4) {
        if (this.f62641a.remaining() < i4) {
            ByteBuffer allocate = ByteBuffer.allocate((this.f62641a.capacity() + i4) << 1);
            allocate.put(this.f62641a.array(), 0, this.f62641a.position());
            this.f62641a = allocate;
        }
    }

    private void b(byte b5, int i4) {
        if (i4 < 15) {
            this.f62641a.put((byte) (b5 | (i4 << 4)));
        } else if (i4 < 256) {
            this.f62641a.put((byte) (b5 | 240));
            this.f62641a.put((byte) i4);
        } else {
            throw new b("tag is too large: " + i4);
        }
    }

    public j() {
        this(128);
    }

    public final void a(boolean z4, int i4) {
        a(z4 ? (byte) 1 : (byte) 0, i4);
    }

    public final void a(byte b5, int i4) {
        a(3);
        if (b5 == 0) {
            b((byte) 12, i4);
            return;
        }
        b((byte) 0, i4);
        this.f62641a.put(b5);
    }

    public final void a(short s4, int i4) {
        a(4);
        if (s4 >= -128 && s4 <= 127) {
            a((byte) s4, i4);
            return;
        }
        b((byte) 1, i4);
        this.f62641a.putShort(s4);
    }

    public final void a(int i4, int i5) {
        a(6);
        if (i4 >= -32768 && i4 <= 32767) {
            a((short) i4, i5);
            return;
        }
        b((byte) 2, i5);
        this.f62641a.putInt(i4);
    }

    public final void a(long j4, int i4) {
        a(10);
        if (j4 >= -2147483648L && j4 <= 2147483647L) {
            a((int) j4, i4);
            return;
        }
        b((byte) 3, i4);
        this.f62641a.putLong(j4);
    }

    public final void a(String str, int i4) {
        byte[] bytes;
        try {
            bytes = str.getBytes(this.f62642b);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        a(bytes.length + 10);
        if (bytes.length > 255) {
            b((byte) 7, i4);
            this.f62641a.putInt(bytes.length);
            this.f62641a.put(bytes);
            return;
        }
        b((byte) 6, i4);
        this.f62641a.put((byte) bytes.length);
        this.f62641a.put(bytes);
    }

    public final <K, V> void a(Map<K, V> map, int i4) {
        a(8);
        b((byte) 8, i4);
        a(map == null ? 0 : map.size(), 0);
        if (map != null) {
            for (Map.Entry<K, V> entry : map.entrySet()) {
                a(entry.getKey(), 0);
                a(entry.getValue(), 1);
            }
        }
    }

    public final void a(byte[] bArr, int i4) {
        a(bArr.length + 8);
        b((byte) 13, i4);
        b((byte) 0, 0);
        a(bArr.length, 0);
        this.f62641a.put(bArr);
    }

    public final <T> void a(Collection<T> collection, int i4) {
        a(8);
        b((byte) 9, i4);
        a(collection == null ? 0 : collection.size(), 0);
        if (collection != null) {
            for (T t4 : collection) {
                a(t4, 0);
            }
        }
    }

    public final void a(k kVar, int i4) {
        a(2);
        b((byte) 10, i4);
        kVar.a(this);
        a(2);
        b((byte) 11, 0);
    }

    public final void a(Object obj, int i4) {
        if (obj instanceof Byte) {
            a(((Byte) obj).byteValue(), i4);
        } else if (obj instanceof Boolean) {
            a(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0, i4);
        } else if (obj instanceof Short) {
            a(((Short) obj).shortValue(), i4);
        } else if (obj instanceof Integer) {
            a(((Integer) obj).intValue(), i4);
        } else if (obj instanceof Long) {
            a(((Long) obj).longValue(), i4);
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            a(6);
            b((byte) 4, i4);
            this.f62641a.putFloat(floatValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            a(10);
            b((byte) 5, i4);
            this.f62641a.putDouble(doubleValue);
        } else if (obj instanceof String) {
            a((String) obj, i4);
        } else if (obj instanceof Map) {
            a((Map) obj, i4);
        } else if (obj instanceof List) {
            a((Collection) ((List) obj), i4);
        } else if (obj instanceof k) {
            a(2);
            b((byte) 10, i4);
            ((k) obj).a(this);
            a(2);
            b((byte) 11, 0);
        } else if (obj instanceof byte[]) {
            a((byte[]) obj, i4);
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            a(8);
            b((byte) 9, i4);
            a(zArr.length, 0);
            for (boolean z4 : zArr) {
                a(z4 ? (byte) 1 : (byte) 0, 0);
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            a(8);
            b((byte) 9, i4);
            a(sArr.length, 0);
            for (short s4 : sArr) {
                a(s4, 0);
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            a(8);
            b((byte) 9, i4);
            a(iArr.length, 0);
            for (int i5 : iArr) {
                a(i5, 0);
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            a(8);
            b((byte) 9, i4);
            a(jArr.length, 0);
            for (long j4 : jArr) {
                a(j4, 0);
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            a(8);
            b((byte) 9, i4);
            a(fArr.length, 0);
            for (float f5 : fArr) {
                a(6);
                b((byte) 4, 0);
                this.f62641a.putFloat(f5);
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            a(8);
            b((byte) 9, i4);
            a(dArr.length, 0);
            for (double d5 : dArr) {
                a(10);
                b((byte) 5, 0);
                this.f62641a.putDouble(d5);
            }
        } else if (obj.getClass().isArray()) {
            Object[] objArr = (Object[]) obj;
            a(8);
            b((byte) 9, i4);
            a(objArr.length, 0);
            for (Object obj2 : objArr) {
                a(obj2, 0);
            }
        } else if (obj instanceof Collection) {
            a((Collection) obj, i4);
        } else {
            throw new b("write object error: unsupport type. " + obj.getClass());
        }
    }

    public final int a(String str) {
        this.f62642b = str;
        return 0;
    }
}
