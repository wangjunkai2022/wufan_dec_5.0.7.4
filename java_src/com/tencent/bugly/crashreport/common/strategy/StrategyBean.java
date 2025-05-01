package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.z;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes5.dex */
public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new Parcelable.Creator<StrategyBean>() { // from class: com.tencent.bugly.crashreport.common.strategy.StrategyBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StrategyBean createFromParcel(Parcel parcel) {
            return new StrategyBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StrategyBean[] newArray(int i4) {
            return new StrategyBean[i4];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static String f62279a = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: b  reason: collision with root package name */
    public static String f62280b = "https://android.bugly.qq.com/rqd/async";

    /* renamed from: c  reason: collision with root package name */
    public long f62281c;

    /* renamed from: d  reason: collision with root package name */
    public long f62282d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f62283e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f62284f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f62285g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f62286h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f62287i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f62288j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f62289k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f62290l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f62291m;

    /* renamed from: n  reason: collision with root package name */
    public long f62292n;

    /* renamed from: o  reason: collision with root package name */
    public long f62293o;

    /* renamed from: p  reason: collision with root package name */
    public String f62294p;

    /* renamed from: q  reason: collision with root package name */
    public String f62295q;

    /* renamed from: r  reason: collision with root package name */
    public String f62296r;

    /* renamed from: s  reason: collision with root package name */
    public Map<String, String> f62297s;

    /* renamed from: t  reason: collision with root package name */
    public int f62298t;

    /* renamed from: u  reason: collision with root package name */
    public long f62299u;

    /* renamed from: v  reason: collision with root package name */
    public long f62300v;

    public StrategyBean() {
        this.f62281c = -1L;
        this.f62282d = -1L;
        this.f62283e = true;
        this.f62284f = true;
        this.f62285g = true;
        this.f62286h = true;
        this.f62287i = false;
        this.f62288j = true;
        this.f62289k = true;
        this.f62290l = true;
        this.f62291m = true;
        this.f62293o = 30000L;
        this.f62294p = f62279a;
        this.f62295q = f62280b;
        this.f62298t = 10;
        this.f62299u = q.a.f73127b;
        this.f62300v = -1L;
        this.f62282d = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("S(@L@L");
        sb.append("@)");
        sb.setLength(0);
        sb.append("*^@K#K");
        sb.append("@!");
        this.f62296r = sb.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f62282d);
        parcel.writeByte(this.f62283e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f62284f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f62285g ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f62294p);
        parcel.writeString(this.f62295q);
        parcel.writeString(this.f62296r);
        z.b(parcel, this.f62297s);
        parcel.writeByte(this.f62286h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f62287i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f62290l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f62291m ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f62293o);
        parcel.writeByte(this.f62288j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f62289k ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f62292n);
        parcel.writeInt(this.f62298t);
        parcel.writeLong(this.f62299u);
        parcel.writeLong(this.f62300v);
    }

    public StrategyBean(Parcel parcel) {
        this.f62281c = -1L;
        this.f62282d = -1L;
        boolean z4 = true;
        this.f62283e = true;
        this.f62284f = true;
        this.f62285g = true;
        this.f62286h = true;
        this.f62287i = false;
        this.f62288j = true;
        this.f62289k = true;
        this.f62290l = true;
        this.f62291m = true;
        this.f62293o = 30000L;
        this.f62294p = f62279a;
        this.f62295q = f62280b;
        this.f62298t = 10;
        this.f62299u = q.a.f73127b;
        this.f62300v = -1L;
        try {
            this.f62282d = parcel.readLong();
            this.f62283e = parcel.readByte() == 1;
            this.f62284f = parcel.readByte() == 1;
            this.f62285g = parcel.readByte() == 1;
            this.f62294p = parcel.readString();
            this.f62295q = parcel.readString();
            this.f62296r = parcel.readString();
            this.f62297s = z.b(parcel);
            this.f62286h = parcel.readByte() == 1;
            this.f62287i = parcel.readByte() == 1;
            this.f62290l = parcel.readByte() == 1;
            this.f62291m = parcel.readByte() == 1;
            this.f62293o = parcel.readLong();
            this.f62288j = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z4 = false;
            }
            this.f62289k = z4;
            this.f62292n = parcel.readLong();
            this.f62298t = parcel.readInt();
            this.f62299u = parcel.readLong();
            this.f62300v = parcel.readLong();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
