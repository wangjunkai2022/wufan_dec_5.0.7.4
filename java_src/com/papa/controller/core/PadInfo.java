package com.papa.controller.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
/* loaded from: classes5.dex */
public class PadInfo implements Parcelable {
    public static final byte A = 0;
    public static final byte B = 1;
    public static final int C = -1;
    public static final Parcelable.Creator<PadInfo> CREATOR = new a();

    /* renamed from: z  reason: collision with root package name */
    public static final byte f58030z = -1;

    /* renamed from: b  reason: collision with root package name */
    protected String f58031b;

    /* renamed from: c  reason: collision with root package name */
    protected String f58032c;

    /* renamed from: d  reason: collision with root package name */
    protected String f58033d;

    /* renamed from: e  reason: collision with root package name */
    protected String f58034e;

    /* renamed from: f  reason: collision with root package name */
    protected String f58035f;

    /* renamed from: g  reason: collision with root package name */
    protected String f58036g;

    /* renamed from: h  reason: collision with root package name */
    protected String f58037h;

    /* renamed from: i  reason: collision with root package name */
    protected String f58038i;

    /* renamed from: j  reason: collision with root package name */
    protected String f58039j;

    /* renamed from: k  reason: collision with root package name */
    protected String f58040k;

    /* renamed from: l  reason: collision with root package name */
    protected String f58041l;

    /* renamed from: m  reason: collision with root package name */
    protected String f58042m;

    /* renamed from: n  reason: collision with root package name */
    protected String f58043n;

    /* renamed from: o  reason: collision with root package name */
    protected String f58044o;

    /* renamed from: p  reason: collision with root package name */
    protected byte f58045p;

    /* renamed from: q  reason: collision with root package name */
    protected byte f58046q;

    /* renamed from: r  reason: collision with root package name */
    protected int f58047r;

    /* renamed from: s  reason: collision with root package name */
    protected int f58048s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f58049t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f58050u;

    /* renamed from: v  reason: collision with root package name */
    protected boolean f58051v;

    /* renamed from: w  reason: collision with root package name */
    protected boolean f58052w;

    /* renamed from: x  reason: collision with root package name */
    protected String f58053x;

    /* renamed from: y  reason: collision with root package name */
    protected HashMap<Integer, Float> f58054y;

    /* loaded from: classes5.dex */
    class a implements Parcelable.Creator<PadInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PadInfo createFromParcel(Parcel parcel) {
            return new PadInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PadInfo[] newArray(int i4) {
            return new PadInfo[i4];
        }
    }

    public PadInfo() {
        this.f58031b = "";
        this.f58032c = "";
        this.f58033d = "";
        this.f58034e = "";
        this.f58035f = "";
        this.f58036g = "";
        this.f58037h = "";
        this.f58038i = "";
        this.f58039j = "";
        this.f58040k = "";
        this.f58041l = "";
        this.f58042m = "";
        this.f58043n = "";
        this.f58044o = "";
        this.f58045p = (byte) -1;
        this.f58046q = (byte) -1;
        this.f58047r = -1;
        this.f58048s = 0;
        this.f58049t = false;
        this.f58050u = false;
        this.f58051v = false;
        this.f58052w = false;
        this.f58053x = "";
        this.f58054y = new HashMap<>();
    }

    private HashMap<Integer, Integer> j(com.papa.controller.core.hardware.d dVar) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] iArr = {109, 19, 20, 21, 22, 96, 97, 99, 100, 102, 103, 104, 105, 106, 107, 108, 198, 199, 200, 201};
        int[] iArr2 = {dVar.r(), dVar.E(), dVar.s(), dVar.x(), dVar.A(), dVar.k(), dVar.q(), dVar.F(), dVar.G(), dVar.v(), dVar.y(), dVar.w(), dVar.z(), dVar.C(), dVar.D(), dVar.B(), dVar.t(), dVar.u(), (dVar.l() << 8) | dVar.m(), dVar.o() | (dVar.n() << 8)};
        if (this.f58054y.size() == 0) {
            for (int i4 = 0; i4 < 20; i4++) {
                this.f58054y.put(Integer.valueOf(iArr[i4]), Float.valueOf(0.0f));
            }
        }
        for (int i5 = 0; i5 < 20; i5++) {
            hashMap.put(Integer.valueOf(iArr[i5]), Integer.valueOf(iArr2[i5]));
        }
        return hashMap;
    }

    private PadMotionEvent m(com.papa.controller.core.hardware.d dVar) {
        try {
            int l4 = dVar.l();
            return new PadMotionEvent(System.currentTimeMillis(), this.f58047r, this.f58031b, 200, ((l4 - 128) * 1.0f) / 128.0f, ((dVar.m() - 128) * 1.0f) / 128.0f);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private PadMotionEvent n(com.papa.controller.core.hardware.d dVar) {
        try {
            int n4 = dVar.n();
            return new PadMotionEvent(System.currentTimeMillis(), this.f58047r, this.f58031b, 201, ((n4 - 128) * 1.0f) / 128.0f, ((dVar.o() - 128) * 1.0f) / 128.0f);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public boolean A() {
        return this.f58049t;
    }

    public void B(int i4) {
        this.f58048s = i4;
    }

    public void C(int i4) {
        this.f58047r = i4;
    }

    public void D(String str) {
        this.f58035f = str;
    }

    public void E(String str) {
        this.f58038i = str;
    }

    public void F(String str) {
        this.f58036g = str;
    }

    public void G(String str) {
        this.f58053x = str;
    }

    public void H(boolean z4) {
        this.f58051v = z4;
    }

    public void I(boolean z4) {
        this.f58052w = z4;
    }

    public void J(String str) {
        this.f58037h = str;
    }

    public void K(HashMap<Integer, Float> hashMap) {
        this.f58054y = hashMap;
    }

    public void L(String str) {
        this.f58034e = str;
    }

    public void M(byte b5) {
        this.f58045p = b5;
    }

    public void N(byte b5) {
        this.f58046q = b5;
    }

    public void O(String str) {
        this.f58031b = str;
    }

    public void P(String str) {
        this.f58039j = str;
    }

    public void Q(String str) {
        this.f58043n = str;
    }

    public void R(String str) {
        this.f58044o = str;
    }

    public void S(boolean z4) {
        this.f58050u = z4;
    }

    public void T(String str) {
        this.f58033d = str;
    }

    public void U(String str) {
        this.f58040k = str;
    }

    public void V(String str) {
        this.f58041l = str;
    }

    public void W(String str) {
        this.f58042m = str;
    }

    public void X(String str) {
        this.f58032c = str;
    }

    public void Y(boolean z4) {
        this.f58049t = z4;
    }

    public void a(c cVar, com.papa.controller.core.hardware.d dVar) {
        float f5;
        HashMap<Integer, Integer> j4 = j(dVar);
        int[] iArr = {109, 19, 20, 21, 22, 106, 107, 108, 198, 199};
        int i4 = 0;
        while (true) {
            f5 = 1.0f;
            if (i4 >= 10) {
                break;
            }
            int i5 = iArr[i4];
            if (j4.containsKey(Integer.valueOf(i5)) && this.f58054y.containsKey(Integer.valueOf(i5))) {
                float intValue = j4.get(Integer.valueOf(i5)).intValue() * 1.0f;
                if (this.f58054y.get(Integer.valueOf(i5)).floatValue() != intValue) {
                    int i6 = intValue != 1.0f ? 0 : 1;
                    PadKeyEvent padKeyEvent = new PadKeyEvent(System.currentTimeMillis(), this.f58047r, this.f58031b, i5, i6 ^ 1, i6 != 0 ? intValue : 0.0f);
                    this.f58054y.put(Integer.valueOf(i5), Float.valueOf(i6 != 0 ? intValue : 0.0f));
                    if (i6 != 0) {
                        cVar.j(i5, padKeyEvent);
                    } else {
                        cVar.D(i5, padKeyEvent);
                    }
                }
            }
            i4++;
        }
        int[] iArr2 = {96, 97, 99, 100, 102, 103, 104, 105};
        int i7 = 0;
        while (i7 < 8) {
            int i8 = iArr2[i7];
            if (j4.containsKey(Integer.valueOf(i8)) && this.f58054y.containsKey(Integer.valueOf(i8))) {
                float intValue2 = (j4.get(Integer.valueOf(i8)).intValue() * f5) / 255.0f;
                if (this.f58054y.get(Integer.valueOf(i8)).floatValue() != intValue2) {
                    int i9 = intValue2 > 0.0f ? 1 : 0;
                    PadKeyEvent padKeyEvent2 = new PadKeyEvent(System.currentTimeMillis(), this.f58047r, this.f58031b, i8, i9 ^ 1, intValue2);
                    this.f58054y.put(Integer.valueOf(i8), Float.valueOf(i9 != 0 ? intValue2 : 0.0f));
                    cVar.M(i8, intValue2, padKeyEvent2);
                }
            }
            i7++;
            f5 = 1.0f;
        }
        PadMotionEvent m4 = m(dVar);
        if (m4 != null) {
            float l4 = (dVar.l() << 8) | dVar.m();
            if (this.f58054y.get(Integer.valueOf(m4.d())).floatValue() != l4) {
                this.f58054y.put(Integer.valueOf(m4.d()), Float.valueOf(l4));
                cVar.w(m4.e(), m4.f(), m4);
            }
        }
        PadMotionEvent n4 = n(dVar);
        if (n4 != null) {
            float o4 = dVar.o() | (dVar.n() << 8);
            if (this.f58054y.get(Integer.valueOf(n4.d())).floatValue() != o4) {
                this.f58054y.put(Integer.valueOf(n4.d()), Float.valueOf(o4));
                cVar.x(n4.e(), n4.f(), n4);
            }
        }
    }

    public int b() {
        return this.f58048s;
    }

    public int c() {
        return this.f58047r;
    }

    public String d() {
        return this.f58035f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f58038i;
    }

    public String f() {
        return this.f58036g;
    }

    public String g() {
        return this.f58053x;
    }

    public String getType() {
        return this.f58033d;
    }

    public String h() {
        return this.f58037h;
    }

    public HashMap<Integer, Float> i() {
        return this.f58054y;
    }

    public String k() {
        return this.f58034e;
    }

    public byte l() {
        return this.f58045p;
    }

    public byte o() {
        return this.f58046q;
    }

    public String p() {
        return this.f58031b;
    }

    public String q() {
        return this.f58039j;
    }

    public String r() {
        return this.f58043n;
    }

    public String s() {
        return this.f58044o;
    }

    public String t() {
        return this.f58040k;
    }

    public String u() {
        return this.f58041l;
    }

    public String v() {
        return this.f58042m;
    }

    public String w() {
        return this.f58032c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f58031b);
        parcel.writeString(this.f58032c);
        parcel.writeString(this.f58033d);
        parcel.writeString(this.f58034e);
        parcel.writeString(this.f58035f);
        parcel.writeString(this.f58036g);
        parcel.writeString(this.f58037h);
        parcel.writeString(this.f58038i);
        parcel.writeString(this.f58039j);
        parcel.writeString(this.f58040k);
        parcel.writeString(this.f58041l);
        parcel.writeString(this.f58042m);
        parcel.writeString(this.f58043n);
        parcel.writeString(this.f58044o);
        parcel.writeByte(this.f58045p);
        parcel.writeByte(this.f58046q);
        parcel.writeInt(this.f58047r);
        parcel.writeInt(this.f58048s);
        parcel.writeByte(this.f58049t ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f58050u ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f58051v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f58052w ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f58053x);
        parcel.writeMap(this.f58054y);
    }

    public boolean x() {
        return this.f58051v;
    }

    public boolean y() {
        return this.f58052w;
    }

    public boolean z() {
        return this.f58050u;
    }

    public PadInfo(String str, String str2, String str3, String str4, String str5) {
        this.f58031b = "";
        this.f58032c = "";
        this.f58033d = "";
        this.f58034e = "";
        this.f58035f = "";
        this.f58036g = "";
        this.f58037h = "";
        this.f58038i = "";
        this.f58039j = "";
        this.f58040k = "";
        this.f58041l = "";
        this.f58042m = "";
        this.f58043n = "";
        this.f58044o = "";
        this.f58045p = (byte) -1;
        this.f58046q = (byte) -1;
        this.f58047r = -1;
        this.f58048s = 0;
        this.f58049t = false;
        this.f58050u = false;
        this.f58051v = false;
        this.f58052w = false;
        this.f58053x = "";
        this.f58054y = new HashMap<>();
        this.f58031b = str;
        this.f58032c = str2;
        this.f58033d = str3;
        this.f58034e = str4;
        this.f58035f = str5;
    }

    public PadInfo(Parcel parcel) {
        this.f58031b = "";
        this.f58032c = "";
        this.f58033d = "";
        this.f58034e = "";
        this.f58035f = "";
        this.f58036g = "";
        this.f58037h = "";
        this.f58038i = "";
        this.f58039j = "";
        this.f58040k = "";
        this.f58041l = "";
        this.f58042m = "";
        this.f58043n = "";
        this.f58044o = "";
        this.f58045p = (byte) -1;
        this.f58046q = (byte) -1;
        this.f58047r = -1;
        this.f58048s = 0;
        this.f58049t = false;
        this.f58050u = false;
        this.f58051v = false;
        this.f58052w = false;
        this.f58053x = "";
        this.f58054y = new HashMap<>();
        this.f58031b = parcel.readString();
        this.f58032c = parcel.readString();
        this.f58033d = parcel.readString();
        this.f58034e = parcel.readString();
        this.f58035f = parcel.readString();
        this.f58036g = parcel.readString();
        this.f58037h = parcel.readString();
        this.f58038i = parcel.readString();
        this.f58039j = parcel.readString();
        this.f58040k = parcel.readString();
        this.f58041l = parcel.readString();
        this.f58042m = parcel.readString();
        this.f58043n = parcel.readString();
        this.f58044o = parcel.readString();
        this.f58045p = parcel.readByte();
        this.f58046q = parcel.readByte();
        this.f58047r = parcel.readInt();
        this.f58048s = parcel.readInt();
        this.f58049t = parcel.readByte() != 0;
        this.f58050u = parcel.readByte() != 0;
        this.f58051v = parcel.readByte() != 0;
        this.f58052w = parcel.readByte() != 0;
        this.f58053x = parcel.readString();
        this.f58054y = parcel.readHashMap(null);
    }
}
