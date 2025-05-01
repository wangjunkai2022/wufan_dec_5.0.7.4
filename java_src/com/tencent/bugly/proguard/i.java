package com.tencent.bugly.proguard;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f62637a;

    /* renamed from: b  reason: collision with root package name */
    private String f62638b = "GBK";

    /* compiled from: BUGLY */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public byte f62639a;

        /* renamed from: b  reason: collision with root package name */
        public int f62640b;
    }

    public i() {
    }

    private boolean[] d(int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        if (aVar.f62639a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                boolean[] zArr = new boolean[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    zArr[i5] = a((byte) 0, 0, true) != 0;
                }
                return zArr;
            }
            throw new g("size invalid: " + a5);
        }
        throw new g("type mismatch.");
    }

    private short[] e(int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        if (aVar.f62639a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                short[] sArr = new short[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    sArr[i5] = a(sArr[0], 0, true);
                }
                return sArr;
            }
            throw new g("size invalid: " + a5);
        }
        throw new g("type mismatch.");
    }

    private int[] f(int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        if (aVar.f62639a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                int[] iArr = new int[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    iArr[i5] = a(iArr[0], 0, true);
                }
                return iArr;
            }
            throw new g("size invalid: " + a5);
        }
        throw new g("type mismatch.");
    }

    private long[] g(int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        if (aVar.f62639a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                long[] jArr = new long[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    jArr[i5] = a(jArr[0], 0, true);
                }
                return jArr;
            }
            throw new g("size invalid: " + a5);
        }
        throw new g("type mismatch.");
    }

    private float[] h(int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        if (aVar.f62639a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                float[] fArr = new float[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    fArr[i5] = a(fArr[0], 0, true);
                }
                return fArr;
            }
            throw new g("size invalid: " + a5);
        }
        throw new g("type mismatch.");
    }

    private double[] i(int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        if (aVar.f62639a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                double[] dArr = new double[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    dArr[i5] = a(dArr[0], 0, true);
                }
                return dArr;
            }
            throw new g("size invalid: " + a5);
        }
        throw new g("type mismatch.");
    }

    public final void a(byte[] bArr) {
        ByteBuffer byteBuffer = this.f62637a;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        this.f62637a = ByteBuffer.wrap(bArr);
    }

    public final String b(int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        byte b5 = aVar.f62639a;
        if (b5 == 6) {
            int i5 = this.f62637a.get();
            if (i5 < 0) {
                i5 += 256;
            }
            byte[] bArr = new byte[i5];
            this.f62637a.get(bArr);
            try {
                return new String(bArr, this.f62638b);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        } else if (b5 == 7) {
            int i6 = this.f62637a.getInt();
            if (i6 <= 104857600 && i6 >= 0) {
                byte[] bArr2 = new byte[i6];
                this.f62637a.get(bArr2);
                try {
                    return new String(bArr2, this.f62638b);
                } catch (UnsupportedEncodingException unused2) {
                    return new String(bArr2);
                }
            }
            throw new g("String too long: " + i6);
        } else {
            throw new g("type mismatch.");
        }
    }

    public final byte[] c(int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        byte b5 = aVar.f62639a;
        if (b5 == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                byte[] bArr = new byte[a5];
                for (int i5 = 0; i5 < a5; i5++) {
                    bArr[i5] = a(bArr[0], 0, true);
                }
                return bArr;
            }
            throw new g("size invalid: " + a5);
        } else if (b5 == 13) {
            a aVar2 = new a();
            a(aVar2, this.f62637a);
            if (aVar2.f62639a == 0) {
                int a6 = a(0, 0, true);
                if (a6 >= 0) {
                    byte[] bArr2 = new byte[a6];
                    this.f62637a.get(bArr2);
                    return bArr2;
                }
                throw new g("invalid size, tag: " + i4 + ", type: " + ((int) aVar.f62639a) + ", " + ((int) aVar2.f62639a) + ", size: " + a6);
            }
            throw new g("type mismatch, tag: " + i4 + ", type: " + ((int) aVar.f62639a) + ", " + ((int) aVar2.f62639a));
        } else {
            throw new g("type mismatch.");
        }
    }

    public i(byte[] bArr) {
        this.f62637a = ByteBuffer.wrap(bArr);
    }

    private static int a(a aVar, ByteBuffer byteBuffer) {
        byte b5 = byteBuffer.get();
        aVar.f62639a = (byte) (b5 & 15);
        int i4 = (b5 & 240) >> 4;
        aVar.f62640b = i4;
        if (i4 == 15) {
            aVar.f62640b = byteBuffer.get();
            return 2;
        }
        return 1;
    }

    public i(byte[] bArr, int i4) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        this.f62637a = wrap;
        wrap.position(4);
    }

    private boolean a(int i4) {
        int i5;
        try {
            a aVar = new a();
            while (true) {
                int a5 = a(aVar, this.f62637a.duplicate());
                i5 = aVar.f62640b;
                if (i4 <= i5 || aVar.f62639a == 11) {
                    break;
                }
                ByteBuffer byteBuffer = this.f62637a;
                byteBuffer.position(byteBuffer.position() + a5);
                a(aVar.f62639a);
            }
        } catch (g | BufferUnderflowException unused) {
        }
        return i4 == i5;
    }

    private void a() {
        a aVar = new a();
        do {
            a(aVar, this.f62637a);
            a(aVar.f62639a);
        } while (aVar.f62639a != 11);
    }

    private void a(byte b5) {
        int i4 = 0;
        switch (b5) {
            case 0:
                ByteBuffer byteBuffer = this.f62637a;
                byteBuffer.position(byteBuffer.position() + 1);
                return;
            case 1:
                ByteBuffer byteBuffer2 = this.f62637a;
                byteBuffer2.position(byteBuffer2.position() + 2);
                return;
            case 2:
                ByteBuffer byteBuffer3 = this.f62637a;
                byteBuffer3.position(byteBuffer3.position() + 4);
                return;
            case 3:
                ByteBuffer byteBuffer4 = this.f62637a;
                byteBuffer4.position(byteBuffer4.position() + 8);
                return;
            case 4:
                ByteBuffer byteBuffer5 = this.f62637a;
                byteBuffer5.position(byteBuffer5.position() + 4);
                return;
            case 5:
                ByteBuffer byteBuffer6 = this.f62637a;
                byteBuffer6.position(byteBuffer6.position() + 8);
                return;
            case 6:
                int i5 = this.f62637a.get();
                if (i5 < 0) {
                    i5 += 256;
                }
                ByteBuffer byteBuffer7 = this.f62637a;
                byteBuffer7.position(byteBuffer7.position() + i5);
                return;
            case 7:
                int i6 = this.f62637a.getInt();
                ByteBuffer byteBuffer8 = this.f62637a;
                byteBuffer8.position(byteBuffer8.position() + i6);
                return;
            case 8:
                int a5 = a(0, 0, true);
                while (i4 < (a5 << 1)) {
                    a aVar = new a();
                    a(aVar, this.f62637a);
                    a(aVar.f62639a);
                    i4++;
                }
                return;
            case 9:
                int a6 = a(0, 0, true);
                while (i4 < a6) {
                    a aVar2 = new a();
                    a(aVar2, this.f62637a);
                    a(aVar2.f62639a);
                    i4++;
                }
                return;
            case 10:
                a();
                return;
            case 11:
            case 12:
                return;
            case 13:
                a aVar3 = new a();
                a(aVar3, this.f62637a);
                if (aVar3.f62639a == 0) {
                    int a7 = a(0, 0, true);
                    ByteBuffer byteBuffer9 = this.f62637a;
                    byteBuffer9.position(byteBuffer9.position() + a7);
                    return;
                }
                throw new g("skipField with invalid type, type value: " + ((int) b5) + ", " + ((int) aVar3.f62639a));
            default:
                throw new g("invalid type.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> T[] b(T t4, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return null;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        if (aVar.f62639a == 9) {
            int a5 = a(0, 0, true);
            if (a5 >= 0) {
                T[] tArr = (T[]) ((Object[]) Array.newInstance(t4.getClass(), a5));
                for (int i5 = 0; i5 < a5; i5++) {
                    tArr[i5] = a((i) t4, 0, true);
                }
                return tArr;
            }
            throw new g("size invalid: " + a5);
        }
        throw new g("type mismatch.");
    }

    public final boolean a(int i4, boolean z4) {
        return a((byte) 0, i4, z4) != 0;
    }

    public final byte a(byte b5, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return b5;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        byte b6 = aVar.f62639a;
        if (b6 != 0) {
            if (b6 == 12) {
                return (byte) 0;
            }
            throw new g("type mismatch.");
        }
        return this.f62637a.get();
    }

    public final short a(short s4, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return s4;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        byte b5 = aVar.f62639a;
        if (b5 != 0) {
            if (b5 != 1) {
                if (b5 == 12) {
                    return (short) 0;
                }
                throw new g("type mismatch.");
            }
            return this.f62637a.getShort();
        }
        return this.f62637a.get();
    }

    public final int a(int i4, int i5, boolean z4) {
        if (!a(i5)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return i4;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        byte b5 = aVar.f62639a;
        if (b5 != 0) {
            if (b5 != 1) {
                if (b5 != 2) {
                    if (b5 == 12) {
                        return 0;
                    }
                    throw new g("type mismatch.");
                }
                return this.f62637a.getInt();
            }
            return this.f62637a.getShort();
        }
        return this.f62637a.get();
    }

    public final long a(long j4, int i4, boolean z4) {
        int i5;
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return j4;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        byte b5 = aVar.f62639a;
        if (b5 == 0) {
            i5 = this.f62637a.get();
        } else if (b5 == 1) {
            i5 = this.f62637a.getShort();
        } else if (b5 != 2) {
            if (b5 != 3) {
                if (b5 == 12) {
                    return 0L;
                }
                throw new g("type mismatch.");
            }
            return this.f62637a.getLong();
        } else {
            i5 = this.f62637a.getInt();
        }
        return i5;
    }

    private float a(float f5, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return f5;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        byte b5 = aVar.f62639a;
        if (b5 != 4) {
            if (b5 == 12) {
                return 0.0f;
            }
            throw new g("type mismatch.");
        }
        return this.f62637a.getFloat();
    }

    private double a(double d5, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return d5;
        }
        a aVar = new a();
        a(aVar, this.f62637a);
        byte b5 = aVar.f62639a;
        if (b5 != 4) {
            if (b5 != 5) {
                if (b5 == 12) {
                    return 0.0d;
                }
                throw new g("type mismatch.");
            }
            return this.f62637a.getDouble();
        }
        return this.f62637a.getFloat();
    }

    public final <K, V> HashMap<K, V> a(Map<K, V> map, int i4, boolean z4) {
        return (HashMap) a(new HashMap(), map, i4, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> Map<K, V> a(Map<K, V> map, Map<K, V> map2, int i4, boolean z4) {
        if (map2 != null && !map2.isEmpty()) {
            Map.Entry<K, V> next = map2.entrySet().iterator().next();
            K key = next.getKey();
            V value = next.getValue();
            if (a(i4)) {
                a aVar = new a();
                a(aVar, this.f62637a);
                if (aVar.f62639a == 8) {
                    int a5 = a(0, 0, true);
                    if (a5 < 0) {
                        throw new g("size invalid: " + a5);
                    }
                    for (int i5 = 0; i5 < a5; i5++) {
                        map.put(a((i) key, 0, true), a((i) value, 1, true));
                    }
                } else {
                    throw new g("type mismatch.");
                }
            } else if (z4) {
                throw new g("require field not exist.");
            }
            return map;
        }
        return new HashMap();
    }

    private <T> T[] a(T[] tArr, int i4, boolean z4) {
        if (tArr != null && tArr.length != 0) {
            return (T[]) b(tArr[0], i4, z4);
        }
        throw new g("unable to get type of key and value.");
    }

    public final k a(k kVar, int i4, boolean z4) {
        if (!a(i4)) {
            if (z4) {
                throw new g("require field not exist.");
            }
            return null;
        }
        try {
            k kVar2 = (k) kVar.getClass().newInstance();
            a aVar = new a();
            a(aVar, this.f62637a);
            if (aVar.f62639a == 10) {
                kVar2.a(this);
                a();
                return kVar2;
            }
            throw new g("type mismatch.");
        } catch (Exception e5) {
            throw new g(e5.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> Object a(T t4, int i4, boolean z4) {
        if (t4 instanceof Byte) {
            return Byte.valueOf(a((byte) 0, i4, z4));
        }
        if (t4 instanceof Boolean) {
            return Boolean.valueOf(a((byte) 0, i4, z4) != 0);
        } else if (t4 instanceof Short) {
            return Short.valueOf(a((short) 0, i4, z4));
        } else {
            if (t4 instanceof Integer) {
                return Integer.valueOf(a(0, i4, z4));
            }
            if (t4 instanceof Long) {
                return Long.valueOf(a(0L, i4, z4));
            }
            if (t4 instanceof Float) {
                return Float.valueOf(a(0.0f, i4, z4));
            }
            if (t4 instanceof Double) {
                return Double.valueOf(a(0.0d, i4, z4));
            }
            if (t4 instanceof String) {
                return String.valueOf(b(i4, z4));
            }
            if (t4 instanceof Map) {
                return (HashMap) a(new HashMap(), (Map) t4, i4, z4);
            } else if (t4 instanceof List) {
                List list = (List) t4;
                if (list == null || list.isEmpty()) {
                    return new ArrayList();
                }
                Object[] b5 = b(list.get(0), i4, z4);
                if (b5 == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : b5) {
                    arrayList.add(obj);
                }
                return arrayList;
            } else if (t4 instanceof k) {
                return a((k) t4, i4, z4);
            } else {
                if (t4.getClass().isArray()) {
                    if (!(t4 instanceof byte[]) && !(t4 instanceof Byte[])) {
                        if (t4 instanceof boolean[]) {
                            return d(i4, z4);
                        }
                        if (t4 instanceof short[]) {
                            return e(i4, z4);
                        }
                        if (t4 instanceof int[]) {
                            return f(i4, z4);
                        }
                        if (t4 instanceof long[]) {
                            return g(i4, z4);
                        }
                        if (t4 instanceof float[]) {
                            return h(i4, z4);
                        }
                        if (t4 instanceof double[]) {
                            return i(i4, z4);
                        }
                        return a((Object[]) t4, i4, z4);
                    }
                    return c(i4, z4);
                }
                throw new g("read object error: unsupport type.");
            }
        }
    }

    public final int a(String str) {
        this.f62638b = str;
        return 0;
    }
}
