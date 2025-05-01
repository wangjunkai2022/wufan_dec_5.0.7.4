package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.proguard.z;
import java.util.Map;
import java.util.UUID;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public class CrashDetailBean implements Parcelable, Comparable<CrashDetailBean> {
    public static final Parcelable.Creator<CrashDetailBean> CREATOR = new Parcelable.Creator<CrashDetailBean>() { // from class: com.tencent.bugly.crashreport.crash.CrashDetailBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CrashDetailBean createFromParcel(Parcel parcel) {
            return new CrashDetailBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CrashDetailBean[] newArray(int i4) {
            return new CrashDetailBean[i4];
        }
    };
    public String A;
    public String B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public String J;
    public String K;
    public String L;
    public long M;
    public boolean N;
    public Map<String, String> O;
    public Map<String, String> P;
    public int Q;
    public int R;
    public Map<String, String> S;
    public Map<String, String> T;
    public byte[] U;
    public String V;
    public String W;
    private String X;

    /* renamed from: a  reason: collision with root package name */
    public long f62317a;

    /* renamed from: b  reason: collision with root package name */
    public int f62318b;

    /* renamed from: c  reason: collision with root package name */
    public String f62319c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f62320d;

    /* renamed from: e  reason: collision with root package name */
    public String f62321e;

    /* renamed from: f  reason: collision with root package name */
    public String f62322f;

    /* renamed from: g  reason: collision with root package name */
    public String f62323g;

    /* renamed from: h  reason: collision with root package name */
    public Map<String, PlugInBean> f62324h;

    /* renamed from: i  reason: collision with root package name */
    public Map<String, PlugInBean> f62325i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f62326j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f62327k;

    /* renamed from: l  reason: collision with root package name */
    public int f62328l;

    /* renamed from: m  reason: collision with root package name */
    public String f62329m;

    /* renamed from: n  reason: collision with root package name */
    public String f62330n;

    /* renamed from: o  reason: collision with root package name */
    public String f62331o;

    /* renamed from: p  reason: collision with root package name */
    public String f62332p;

    /* renamed from: q  reason: collision with root package name */
    public String f62333q;

    /* renamed from: r  reason: collision with root package name */
    public long f62334r;

    /* renamed from: s  reason: collision with root package name */
    public String f62335s;

    /* renamed from: t  reason: collision with root package name */
    public int f62336t;

    /* renamed from: u  reason: collision with root package name */
    public String f62337u;

    /* renamed from: v  reason: collision with root package name */
    public String f62338v;

    /* renamed from: w  reason: collision with root package name */
    public String f62339w;

    /* renamed from: x  reason: collision with root package name */
    public String f62340x;

    /* renamed from: y  reason: collision with root package name */
    public byte[] f62341y;

    /* renamed from: z  reason: collision with root package name */
    public Map<String, String> f62342z;

    public CrashDetailBean() {
        this.f62317a = -1L;
        this.f62318b = 0;
        this.f62319c = UUID.randomUUID().toString();
        this.f62320d = false;
        this.f62321e = "";
        this.f62322f = "";
        this.f62323g = "";
        this.f62324h = null;
        this.f62325i = null;
        this.f62326j = false;
        this.f62327k = false;
        this.f62328l = 0;
        this.f62329m = "";
        this.f62330n = "";
        this.f62331o = "";
        this.f62332p = "";
        this.f62333q = "";
        this.f62334r = -1L;
        this.f62335s = null;
        this.f62336t = 0;
        this.f62337u = "";
        this.f62338v = "";
        this.f62339w = null;
        this.f62340x = null;
        this.f62341y = null;
        this.f62342z = null;
        this.A = "";
        this.B = "";
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = "";
        this.X = "";
        this.J = "";
        this.K = "";
        this.L = "";
        this.M = -1L;
        this.N = false;
        this.O = null;
        this.P = null;
        this.Q = -1;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(CrashDetailBean crashDetailBean) {
        CrashDetailBean crashDetailBean2 = crashDetailBean;
        if (crashDetailBean2 != null) {
            long j4 = this.f62334r - crashDetailBean2.f62334r;
            if (j4 <= 0) {
                return j4 < 0 ? -1 : 0;
            }
            return 1;
        }
        return 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f62318b);
        parcel.writeString(this.f62319c);
        parcel.writeByte(this.f62320d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f62321e);
        parcel.writeString(this.f62322f);
        parcel.writeString(this.f62323g);
        parcel.writeByte(this.f62326j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f62327k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f62328l);
        parcel.writeString(this.f62329m);
        parcel.writeString(this.f62330n);
        parcel.writeString(this.f62331o);
        parcel.writeString(this.f62332p);
        parcel.writeString(this.f62333q);
        parcel.writeLong(this.f62334r);
        parcel.writeString(this.f62335s);
        parcel.writeInt(this.f62336t);
        parcel.writeString(this.f62337u);
        parcel.writeString(this.f62338v);
        parcel.writeString(this.f62339w);
        z.b(parcel, this.f62342z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeLong(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeLong(this.F);
        parcel.writeLong(this.G);
        parcel.writeLong(this.H);
        parcel.writeString(this.I);
        parcel.writeString(this.X);
        parcel.writeString(this.J);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
        parcel.writeLong(this.M);
        parcel.writeByte(this.N ? (byte) 1 : (byte) 0);
        z.b(parcel, this.O);
        z.a(parcel, this.f62324h);
        z.a(parcel, this.f62325i);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        z.b(parcel, this.S);
        z.b(parcel, this.T);
        parcel.writeByteArray(this.U);
        parcel.writeByteArray(this.f62341y);
        parcel.writeString(this.V);
        parcel.writeString(this.W);
        parcel.writeString(this.f62340x);
    }

    public CrashDetailBean(Parcel parcel) {
        this.f62317a = -1L;
        this.f62318b = 0;
        this.f62319c = UUID.randomUUID().toString();
        this.f62320d = false;
        this.f62321e = "";
        this.f62322f = "";
        this.f62323g = "";
        this.f62324h = null;
        this.f62325i = null;
        this.f62326j = false;
        this.f62327k = false;
        this.f62328l = 0;
        this.f62329m = "";
        this.f62330n = "";
        this.f62331o = "";
        this.f62332p = "";
        this.f62333q = "";
        this.f62334r = -1L;
        this.f62335s = null;
        this.f62336t = 0;
        this.f62337u = "";
        this.f62338v = "";
        this.f62339w = null;
        this.f62340x = null;
        this.f62341y = null;
        this.f62342z = null;
        this.A = "";
        this.B = "";
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = "";
        this.X = "";
        this.J = "";
        this.K = "";
        this.L = "";
        this.M = -1L;
        this.N = false;
        this.O = null;
        this.P = null;
        this.Q = -1;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.f62318b = parcel.readInt();
        this.f62319c = parcel.readString();
        this.f62320d = parcel.readByte() == 1;
        this.f62321e = parcel.readString();
        this.f62322f = parcel.readString();
        this.f62323g = parcel.readString();
        this.f62326j = parcel.readByte() == 1;
        this.f62327k = parcel.readByte() == 1;
        this.f62328l = parcel.readInt();
        this.f62329m = parcel.readString();
        this.f62330n = parcel.readString();
        this.f62331o = parcel.readString();
        this.f62332p = parcel.readString();
        this.f62333q = parcel.readString();
        this.f62334r = parcel.readLong();
        this.f62335s = parcel.readString();
        this.f62336t = parcel.readInt();
        this.f62337u = parcel.readString();
        this.f62338v = parcel.readString();
        this.f62339w = parcel.readString();
        this.f62342z = z.b(parcel);
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readLong();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.F = parcel.readLong();
        this.G = parcel.readLong();
        this.H = parcel.readLong();
        this.I = parcel.readString();
        this.X = parcel.readString();
        this.J = parcel.readString();
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.M = parcel.readLong();
        this.N = parcel.readByte() == 1;
        this.O = z.b(parcel);
        this.f62324h = z.a(parcel);
        this.f62325i = z.a(parcel);
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.S = z.b(parcel);
        this.T = z.b(parcel);
        this.U = parcel.createByteArray();
        this.f62341y = parcel.createByteArray();
        this.V = parcel.readString();
        this.W = parcel.readString();
        this.f62340x = parcel.readString();
    }
}
