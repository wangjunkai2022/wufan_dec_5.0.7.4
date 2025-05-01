package com.xinzhu.overmind.server.os;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
/* loaded from: classes.dex */
public class MindShareFileInfo implements Parcelable {
    public static final Parcelable.Creator<MindShareFileInfo> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public String f68016b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f68017c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f68018d;

    /* renamed from: e  reason: collision with root package name */
    public long f68019e;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<MindShareFileInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindShareFileInfo createFromParcel(Parcel parcel) {
            return new MindShareFileInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindShareFileInfo[] newArray(int i4) {
            return new MindShareFileInfo[i4];
        }
    }

    public MindShareFileInfo(File file) {
        this.f68016b = file.getAbsolutePath();
        this.f68017c = Boolean.valueOf(file.exists());
        this.f68018d = Boolean.valueOf(file.isDirectory());
        this.f68019e = a(file);
    }

    private static long a(File file) {
        try {
            if (!file.exists() || file.isDirectory()) {
                return 0L;
            }
            return new FileInputStream(file).available();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NonNull
    public String toString() {
        return "MindShareFileInfo{path=" + this.f68016b + ", exists=" + this.f68017c + ", isDirectory='" + this.f68018d + "', fileSize=" + this.f68019e + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f68016b);
        parcel.writeByte(this.f68017c.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68018d.booleanValue() ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f68019e);
    }

    protected MindShareFileInfo(Parcel parcel) {
        this.f68016b = parcel.readString();
        this.f68017c = Boolean.valueOf(parcel.readByte() != 0);
        this.f68018d = Boolean.valueOf(parcel.readByte() != 0);
        this.f68019e = parcel.readLong();
    }
}
