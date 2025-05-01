package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.z;
import java.util.Map;
/* compiled from: BUGLY */
/* loaded from: classes4.dex */
public class UserInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new Parcelable.Creator<UserInfoBean>() { // from class: com.tencent.bugly.crashreport.biz.UserInfoBean.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UserInfoBean createFromParcel(Parcel parcel) {
            return new UserInfoBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UserInfoBean[] newArray(int i4) {
            return new UserInfoBean[i4];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public long f62199a;

    /* renamed from: b  reason: collision with root package name */
    public int f62200b;

    /* renamed from: c  reason: collision with root package name */
    public String f62201c;

    /* renamed from: d  reason: collision with root package name */
    public String f62202d;

    /* renamed from: e  reason: collision with root package name */
    public long f62203e;

    /* renamed from: f  reason: collision with root package name */
    public long f62204f;

    /* renamed from: g  reason: collision with root package name */
    public long f62205g;

    /* renamed from: h  reason: collision with root package name */
    public long f62206h;

    /* renamed from: i  reason: collision with root package name */
    public long f62207i;

    /* renamed from: j  reason: collision with root package name */
    public String f62208j;

    /* renamed from: k  reason: collision with root package name */
    public long f62209k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f62210l;

    /* renamed from: m  reason: collision with root package name */
    public String f62211m;

    /* renamed from: n  reason: collision with root package name */
    public String f62212n;

    /* renamed from: o  reason: collision with root package name */
    public int f62213o;

    /* renamed from: p  reason: collision with root package name */
    public int f62214p;

    /* renamed from: q  reason: collision with root package name */
    public int f62215q;

    /* renamed from: r  reason: collision with root package name */
    public Map<String, String> f62216r;

    /* renamed from: s  reason: collision with root package name */
    public Map<String, String> f62217s;

    public UserInfoBean() {
        this.f62209k = 0L;
        this.f62210l = false;
        this.f62211m = "unknown";
        this.f62214p = -1;
        this.f62215q = -1;
        this.f62216r = null;
        this.f62217s = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f62200b);
        parcel.writeString(this.f62201c);
        parcel.writeString(this.f62202d);
        parcel.writeLong(this.f62203e);
        parcel.writeLong(this.f62204f);
        parcel.writeLong(this.f62205g);
        parcel.writeLong(this.f62206h);
        parcel.writeLong(this.f62207i);
        parcel.writeString(this.f62208j);
        parcel.writeLong(this.f62209k);
        parcel.writeByte(this.f62210l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f62211m);
        parcel.writeInt(this.f62214p);
        parcel.writeInt(this.f62215q);
        z.b(parcel, this.f62216r);
        z.b(parcel, this.f62217s);
        parcel.writeString(this.f62212n);
        parcel.writeInt(this.f62213o);
    }

    public UserInfoBean(Parcel parcel) {
        this.f62209k = 0L;
        this.f62210l = false;
        this.f62211m = "unknown";
        this.f62214p = -1;
        this.f62215q = -1;
        this.f62216r = null;
        this.f62217s = null;
        this.f62200b = parcel.readInt();
        this.f62201c = parcel.readString();
        this.f62202d = parcel.readString();
        this.f62203e = parcel.readLong();
        this.f62204f = parcel.readLong();
        this.f62205g = parcel.readLong();
        this.f62206h = parcel.readLong();
        this.f62207i = parcel.readLong();
        this.f62208j = parcel.readString();
        this.f62209k = parcel.readLong();
        this.f62210l = parcel.readByte() == 1;
        this.f62211m = parcel.readString();
        this.f62214p = parcel.readInt();
        this.f62215q = parcel.readInt();
        this.f62216r = z.b(parcel);
        this.f62217s = z.b(parcel);
        this.f62212n = parcel.readString();
        this.f62213o = parcel.readInt();
    }
}
