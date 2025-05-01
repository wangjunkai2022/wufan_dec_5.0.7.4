package com.xinzhu.overmind.entity;

import android.app.Service;
import android.app.job.JobInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class JobRecord implements Parcelable {
    public static final Parcelable.Creator<JobRecord> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public JobInfo f67771b;

    /* renamed from: c  reason: collision with root package name */
    public ServiceInfo f67772c;

    /* renamed from: d  reason: collision with root package name */
    public Service f67773d;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<JobRecord> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public JobRecord createFromParcel(Parcel parcel) {
            return new JobRecord(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public JobRecord[] newArray(int i4) {
            return new JobRecord[i4];
        }
    }

    public JobRecord() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f67771b, i4);
        parcel.writeParcelable(this.f67772c, i4);
    }

    protected JobRecord(Parcel parcel) {
        this.f67771b = (JobInfo) parcel.readParcelable(JobInfo.class.getClassLoader());
        this.f67772c = (ServiceInfo) parcel.readParcelable(ServiceInfo.class.getClassLoader());
    }
}
