package com.tencent.bugly.proguard;

import java.util.List;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private StringBuilder f62635a;

    /* renamed from: b  reason: collision with root package name */
    private int f62636b;

    public h(StringBuilder sb, int i4) {
        this.f62636b = 0;
        this.f62635a = sb;
        this.f62636b = i4;
    }

    private void a(String str) {
        for (int i4 = 0; i4 < this.f62636b; i4++) {
            this.f62635a.append('\t');
        }
        if (str != null) {
            StringBuilder sb = this.f62635a;
            sb.append(str);
            sb.append(": ");
        }
    }

    public final h a(boolean z4, String str) {
        a(str);
        StringBuilder sb = this.f62635a;
        sb.append(z4 ? 'T' : 'F');
        sb.append('\n');
        return this;
    }

    public final h a(byte b5, String str) {
        a(str);
        StringBuilder sb = this.f62635a;
        sb.append((int) b5);
        sb.append('\n');
        return this;
    }

    public final h a(short s4, String str) {
        a(str);
        StringBuilder sb = this.f62635a;
        sb.append((int) s4);
        sb.append('\n');
        return this;
    }

    public final h a(int i4, String str) {
        a(str);
        StringBuilder sb = this.f62635a;
        sb.append(i4);
        sb.append('\n');
        return this;
    }

    public final h a(long j4, String str) {
        a(str);
        StringBuilder sb = this.f62635a;
        sb.append(j4);
        sb.append('\n');
        return this;
    }

    public final h a(String str, String str2) {
        a(str2);
        if (str == null) {
            this.f62635a.append("null\n");
        } else {
            StringBuilder sb = this.f62635a;
            sb.append(str);
            sb.append('\n');
        }
        return this;
    }

    public final h a(byte[] bArr, String str) {
        a(str);
        if (bArr == null) {
            this.f62635a.append("null\n");
            return this;
        } else if (bArr.length == 0) {
            StringBuilder sb = this.f62635a;
            sb.append(bArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb2 = this.f62635a;
            sb2.append(bArr.length);
            sb2.append(", [\n");
            h hVar = new h(this.f62635a, this.f62636b + 1);
            for (byte b5 : bArr) {
                hVar.a(null);
                StringBuilder sb3 = hVar.f62635a;
                sb3.append((int) b5);
                sb3.append('\n');
            }
            a(null);
            StringBuilder sb4 = this.f62635a;
            sb4.append(']');
            sb4.append('\n');
            return this;
        }
    }

    public final <K, V> h a(Map<K, V> map, String str) {
        a(str);
        if (map == null) {
            this.f62635a.append("null\n");
            return this;
        } else if (map.isEmpty()) {
            StringBuilder sb = this.f62635a;
            sb.append(map.size());
            sb.append(", {}\n");
            return this;
        } else {
            StringBuilder sb2 = this.f62635a;
            sb2.append(map.size());
            sb2.append(", {\n");
            h hVar = new h(this.f62635a, this.f62636b + 1);
            h hVar2 = new h(this.f62635a, this.f62636b + 2);
            for (Map.Entry<K, V> entry : map.entrySet()) {
                hVar.a(null);
                StringBuilder sb3 = hVar.f62635a;
                sb3.append('(');
                sb3.append('\n');
                hVar2.a((h) entry.getKey(), (String) null);
                hVar2.a((h) entry.getValue(), (String) null);
                hVar.a(null);
                StringBuilder sb4 = hVar.f62635a;
                sb4.append(')');
                sb4.append('\n');
            }
            a(null);
            StringBuilder sb5 = this.f62635a;
            sb5.append('}');
            sb5.append('\n');
            return this;
        }
    }

    private <T> h a(T[] tArr, String str) {
        a(str);
        if (tArr == null) {
            this.f62635a.append("null\n");
            return this;
        } else if (tArr.length == 0) {
            StringBuilder sb = this.f62635a;
            sb.append(tArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb2 = this.f62635a;
            sb2.append(tArr.length);
            sb2.append(", [\n");
            h hVar = new h(this.f62635a, this.f62636b + 1);
            for (T t4 : tArr) {
                hVar.a((h) t4, (String) null);
            }
            a(null);
            StringBuilder sb3 = this.f62635a;
            sb3.append(']');
            sb3.append('\n');
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> h a(T t4, String str) {
        if (t4 == null) {
            this.f62635a.append("null\n");
        } else if (t4 instanceof Byte) {
            byte byteValue = ((Byte) t4).byteValue();
            a(str);
            StringBuilder sb = this.f62635a;
            sb.append((int) byteValue);
            sb.append('\n');
        } else if (t4 instanceof Boolean) {
            boolean booleanValue = ((Boolean) t4).booleanValue();
            a(str);
            StringBuilder sb2 = this.f62635a;
            sb2.append(booleanValue ? 'T' : 'F');
            sb2.append('\n');
        } else if (t4 instanceof Short) {
            short shortValue = ((Short) t4).shortValue();
            a(str);
            StringBuilder sb3 = this.f62635a;
            sb3.append((int) shortValue);
            sb3.append('\n');
        } else if (t4 instanceof Integer) {
            int intValue = ((Integer) t4).intValue();
            a(str);
            StringBuilder sb4 = this.f62635a;
            sb4.append(intValue);
            sb4.append('\n');
        } else if (t4 instanceof Long) {
            long longValue = ((Long) t4).longValue();
            a(str);
            StringBuilder sb5 = this.f62635a;
            sb5.append(longValue);
            sb5.append('\n');
        } else if (t4 instanceof Float) {
            float floatValue = ((Float) t4).floatValue();
            a(str);
            StringBuilder sb6 = this.f62635a;
            sb6.append(floatValue);
            sb6.append('\n');
        } else if (t4 instanceof Double) {
            double doubleValue = ((Double) t4).doubleValue();
            a(str);
            StringBuilder sb7 = this.f62635a;
            sb7.append(doubleValue);
            sb7.append('\n');
        } else if (t4 instanceof String) {
            a((String) t4, str);
        } else if (t4 instanceof Map) {
            a((Map) t4, str);
        } else if (t4 instanceof List) {
            a(((List) t4).toArray(), str);
        } else if (t4 instanceof k) {
            a((k) t4, str);
        } else if (t4 instanceof byte[]) {
            a((byte[]) t4, str);
        } else if (t4 instanceof boolean[]) {
            a((h) ((boolean[]) t4), str);
        } else {
            int i4 = 0;
            if (t4 instanceof short[]) {
                short[] sArr = (short[]) t4;
                a(str);
                if (sArr.length == 0) {
                    StringBuilder sb8 = this.f62635a;
                    sb8.append(sArr.length);
                    sb8.append(", []\n");
                } else {
                    StringBuilder sb9 = this.f62635a;
                    sb9.append(sArr.length);
                    sb9.append(", [\n");
                    h hVar = new h(this.f62635a, this.f62636b + 1);
                    int length = sArr.length;
                    while (i4 < length) {
                        short s4 = sArr[i4];
                        hVar.a(null);
                        StringBuilder sb10 = hVar.f62635a;
                        sb10.append((int) s4);
                        sb10.append('\n');
                        i4++;
                    }
                    a(null);
                    StringBuilder sb11 = this.f62635a;
                    sb11.append(']');
                    sb11.append('\n');
                }
            } else if (t4 instanceof int[]) {
                int[] iArr = (int[]) t4;
                a(str);
                if (iArr.length == 0) {
                    StringBuilder sb12 = this.f62635a;
                    sb12.append(iArr.length);
                    sb12.append(", []\n");
                } else {
                    StringBuilder sb13 = this.f62635a;
                    sb13.append(iArr.length);
                    sb13.append(", [\n");
                    h hVar2 = new h(this.f62635a, this.f62636b + 1);
                    int length2 = iArr.length;
                    while (i4 < length2) {
                        int i5 = iArr[i4];
                        hVar2.a(null);
                        StringBuilder sb14 = hVar2.f62635a;
                        sb14.append(i5);
                        sb14.append('\n');
                        i4++;
                    }
                    a(null);
                    StringBuilder sb15 = this.f62635a;
                    sb15.append(']');
                    sb15.append('\n');
                }
            } else if (t4 instanceof long[]) {
                long[] jArr = (long[]) t4;
                a(str);
                if (jArr.length == 0) {
                    StringBuilder sb16 = this.f62635a;
                    sb16.append(jArr.length);
                    sb16.append(", []\n");
                } else {
                    StringBuilder sb17 = this.f62635a;
                    sb17.append(jArr.length);
                    sb17.append(", [\n");
                    h hVar3 = new h(this.f62635a, this.f62636b + 1);
                    int length3 = jArr.length;
                    while (i4 < length3) {
                        long j4 = jArr[i4];
                        hVar3.a(null);
                        StringBuilder sb18 = hVar3.f62635a;
                        sb18.append(j4);
                        sb18.append('\n');
                        i4++;
                    }
                    a(null);
                    StringBuilder sb19 = this.f62635a;
                    sb19.append(']');
                    sb19.append('\n');
                }
            } else if (t4 instanceof float[]) {
                float[] fArr = (float[]) t4;
                a(str);
                if (fArr.length == 0) {
                    StringBuilder sb20 = this.f62635a;
                    sb20.append(fArr.length);
                    sb20.append(", []\n");
                } else {
                    StringBuilder sb21 = this.f62635a;
                    sb21.append(fArr.length);
                    sb21.append(", [\n");
                    h hVar4 = new h(this.f62635a, this.f62636b + 1);
                    int length4 = fArr.length;
                    while (i4 < length4) {
                        float f5 = fArr[i4];
                        hVar4.a(null);
                        StringBuilder sb22 = hVar4.f62635a;
                        sb22.append(f5);
                        sb22.append('\n');
                        i4++;
                    }
                    a(null);
                    StringBuilder sb23 = this.f62635a;
                    sb23.append(']');
                    sb23.append('\n');
                }
            } else if (t4 instanceof double[]) {
                double[] dArr = (double[]) t4;
                a(str);
                if (dArr.length == 0) {
                    StringBuilder sb24 = this.f62635a;
                    sb24.append(dArr.length);
                    sb24.append(", []\n");
                } else {
                    StringBuilder sb25 = this.f62635a;
                    sb25.append(dArr.length);
                    sb25.append(", [\n");
                    h hVar5 = new h(this.f62635a, this.f62636b + 1);
                    int length5 = dArr.length;
                    while (i4 < length5) {
                        double d5 = dArr[i4];
                        hVar5.a(null);
                        StringBuilder sb26 = hVar5.f62635a;
                        sb26.append(d5);
                        sb26.append('\n');
                        i4++;
                    }
                    a(null);
                    StringBuilder sb27 = this.f62635a;
                    sb27.append(']');
                    sb27.append('\n');
                }
            } else if (t4.getClass().isArray()) {
                a((Object[]) t4, str);
            } else {
                throw new b("write object error: unsupport type.");
            }
        }
        return this;
    }

    public final h a(k kVar, String str) {
        a(str);
        StringBuilder sb = this.f62635a;
        sb.append('{');
        sb.append('\n');
        if (kVar == null) {
            StringBuilder sb2 = this.f62635a;
            sb2.append('\t');
            sb2.append("null");
        } else {
            kVar.a(this.f62635a, this.f62636b + 1);
        }
        a(null);
        StringBuilder sb3 = this.f62635a;
        sb3.append('}');
        sb3.append('\n');
        return this;
    }
}
