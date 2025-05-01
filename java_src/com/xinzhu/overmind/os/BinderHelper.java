package com.xinzhu.overmind.os;

import android.os.Binder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserHandle;
import com.xinzhu.haunted.android.os.w;
import com.xinzhu.overmind.server.ProcessRecord;
import com.xinzhu.overmind.server.e;
import com.xinzhu.overmind.server.user.MindUserHandle;
/* loaded from: classes.dex */
public class BinderHelper {

    /* loaded from: classes.dex */
    public static class CallingInfo implements Parcelable {
        public static final Parcelable.Creator<CallingInfo> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f67822b;

        /* renamed from: c  reason: collision with root package name */
        public int f67823c;

        /* renamed from: d  reason: collision with root package name */
        public int f67824d;

        /* renamed from: e  reason: collision with root package name */
        public UserHandle f67825e;

        /* loaded from: classes6.dex */
        class a implements Parcelable.Creator<CallingInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CallingInfo createFromParcel(Parcel parcel) {
                return new CallingInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CallingInfo[] newArray(int i4) {
                return new CallingInfo[i4];
            }
        }

        CallingInfo() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f67822b);
            parcel.writeInt(this.f67823c);
            parcel.writeParcelable(this.f67825e, i4);
        }

        protected CallingInfo(Parcel parcel) {
            this.f67822b = parcel.readInt();
            this.f67823c = parcel.readInt();
            this.f67825e = (UserHandle) parcel.readParcelable(UserHandle.class.getClassLoader());
        }
    }

    public static long a() {
        return Binder.clearCallingIdentity();
    }

    public static CallingInfo b() {
        int callingPid = Binder.getCallingPid();
        ProcessRecord b5 = e.d().b(callingPid);
        CallingInfo callingInfo = new CallingInfo();
        if (b5 != null) {
            callingInfo.f67822b = callingPid;
            int i4 = b5.vuid;
            callingInfo.f67823c = i4;
            callingInfo.f67824d = b5.userId;
            callingInfo.f67825e = (UserHandle) w.c(i4).f67016a;
            return callingInfo;
        }
        callingInfo.f67822b = Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        callingInfo.f67823c = callingUid;
        callingInfo.f67824d = MindUserHandle.k(callingUid);
        callingInfo.f67825e = Binder.getCallingUserHandle();
        return callingInfo;
    }

    public static void c(long j4) {
        Binder.restoreCallingIdentity(j4);
    }
}
