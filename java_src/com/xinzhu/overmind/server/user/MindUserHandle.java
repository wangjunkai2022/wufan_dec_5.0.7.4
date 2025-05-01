package com.xinzhu.overmind.server.user;

import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.UserHandle;
import com.xinzhu.haunted.android.os.w;
/* loaded from: classes.dex */
public final class MindUserHandle implements Parcelable {

    /* renamed from: c  reason: collision with root package name */
    public static final int f68233c = 100000;

    /* renamed from: d  reason: collision with root package name */
    public static final int f68234d = -1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f68236f = -2;

    /* renamed from: h  reason: collision with root package name */
    public static final int f68238h = -3;

    /* renamed from: i  reason: collision with root package name */
    public static final int f68239i = -4;

    /* renamed from: k  reason: collision with root package name */
    public static final int f68241k = -10000;
    @Deprecated

    /* renamed from: l  reason: collision with root package name */
    public static final int f68242l = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f68244n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f68245o = 0;

    /* renamed from: q  reason: collision with root package name */
    public static final boolean f68247q = true;

    /* renamed from: r  reason: collision with root package name */
    public static final int f68248r = -1;

    /* renamed from: s  reason: collision with root package name */
    public static final int f68249s = 0;

    /* renamed from: t  reason: collision with root package name */
    public static final int f68250t = 10000;

    /* renamed from: u  reason: collision with root package name */
    public static final int f68251u = 19999;

    /* renamed from: v  reason: collision with root package name */
    public static final int f68252v = 50000;

    /* renamed from: w  reason: collision with root package name */
    public static final int f68253w = 20000;

    /* renamed from: b  reason: collision with root package name */
    final int f68254b;

    /* renamed from: e  reason: collision with root package name */
    public static final MindUserHandle f68235e = new MindUserHandle(-1);

    /* renamed from: g  reason: collision with root package name */
    public static final MindUserHandle f68237g = new MindUserHandle(-2);

    /* renamed from: j  reason: collision with root package name */
    public static final MindUserHandle f68240j = new MindUserHandle(-3);
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    public static final MindUserHandle f68243m = new MindUserHandle(0);

    /* renamed from: p  reason: collision with root package name */
    public static final MindUserHandle f68246p = new MindUserHandle(0);
    public static final Parcelable.Creator<MindUserHandle> CREATOR = new a();

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<MindUserHandle> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindUserHandle createFromParcel(Parcel parcel) {
            return new MindUserHandle(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindUserHandle[] newArray(int i4) {
            return new MindUserHandle[i4];
        }
    }

    public MindUserHandle(int i4) {
        this.f68254b = i4;
    }

    public static int a(int i4) {
        return i4 % 100000;
    }

    public static int b(int i4) {
        return c(k(i4), a(i4));
    }

    public static int c(int i4, int i5) {
        if (i5 < 10000 || i5 > 19999) {
            return -1;
        }
        return h(i4, (i5 - 10000) + 20000);
    }

    public static int d() {
        return a(Binder.getCallingUid());
    }

    public static int e() {
        return k(Binder.getCallingUid());
    }

    public static int f(int i4) {
        return g(k(i4), a(i4));
    }

    public static int g(int i4, int i5) {
        if (i5 < 10000 || i5 > 19999) {
            if (i5 < 0 || i5 > 10000) {
                return -1;
            }
            return i5;
        }
        return (i5 - 10000) + f68252v;
    }

    public static int h(int i4, int i5) {
        return (i4 * 100000) + (i5 % 100000);
    }

    public static int i(int i4) {
        return h(i4, 9997);
    }

    public static MindUserHandle j(int i4) {
        return s(k(i4));
    }

    public static int k(int i4) {
        return i4 / 100000;
    }

    public static boolean l(int i4) {
        int a5;
        return i4 > 0 && (a5 = a(i4)) >= 10000 && a5 <= 19999;
    }

    public static boolean m(int i4) {
        return i4 >= 0 && a(i4) < 10000;
    }

    public static boolean o(int i4, int i5) {
        if (a(i4) == a(i5)) {
            return true;
        }
        if (i4 == 1000 || i5 == 1000) {
            return i4 == Process.myUid() || i5 == Process.myUid();
        }
        return false;
    }

    public static boolean p(int i4, int i5) {
        return k(i4) == k(i5);
    }

    public static int r() {
        return k(Process.myUid());
    }

    public static MindUserHandle s(int i4) {
        return i4 == 0 ? f68246p : new MindUserHandle(i4);
    }

    public static int t(String str) {
        if ("all".equals(str)) {
            return -1;
        }
        if ("current".equals(str) || "cur".equals(str)) {
            return -2;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException("Bad user number: " + str);
        }
    }

    public static MindUserHandle u(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt != -10000) {
            return new MindUserHandle(readInt);
        }
        return null;
    }

    public static void w(MindUserHandle mindUserHandle, Parcel parcel) {
        if (mindUserHandle != null) {
            mindUserHandle.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(-10000);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            try {
                return this.f68254b == ((MindUserHandle) obj).f68254b;
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public int getIdentifier() {
        return this.f68254b;
    }

    public int hashCode() {
        return this.f68254b;
    }

    @Deprecated
    public boolean n() {
        return equals(f68243m);
    }

    public boolean q() {
        return equals(f68246p);
    }

    public String toString() {
        return "UserHandle{" + this.f68254b + "}";
    }

    public UserHandle v() {
        return (UserHandle) w.c(this.f68254b).f67016a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f68254b);
    }

    public MindUserHandle(Parcel parcel) {
        this.f68254b = parcel.readInt();
    }
}
