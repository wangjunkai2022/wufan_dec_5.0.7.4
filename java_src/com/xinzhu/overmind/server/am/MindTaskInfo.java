package com.xinzhu.overmind.server.am;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class MindTaskInfo implements Parcelable {
    public static final Parcelable.Creator<MindTaskInfo> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public int f67913b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f67914c;

    /* renamed from: d  reason: collision with root package name */
    public ComponentName f67915d;

    /* renamed from: e  reason: collision with root package name */
    public ComponentName f67916e;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<MindTaskInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindTaskInfo createFromParcel(Parcel parcel) {
            return new MindTaskInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindTaskInfo[] newArray(int i4) {
            return new MindTaskInfo[i4];
        }
    }

    public MindTaskInfo(int i4, Intent intent, ComponentName componentName, ComponentName componentName2) {
        this.f67913b = i4;
        this.f67914c = intent;
        this.f67915d = componentName;
        this.f67916e = componentName2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f67913b);
        parcel.writeParcelable(this.f67914c, i4);
        parcel.writeParcelable(this.f67915d, i4);
        parcel.writeParcelable(this.f67916e, i4);
    }

    protected MindTaskInfo(Parcel parcel) {
        this.f67913b = parcel.readInt();
        this.f67914c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f67915d = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
        this.f67916e = (ComponentName) parcel.readParcelable(ComponentName.class.getClassLoader());
    }
}
