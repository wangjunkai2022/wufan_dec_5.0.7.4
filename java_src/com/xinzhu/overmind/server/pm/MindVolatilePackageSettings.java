package com.xinzhu.overmind.server.pm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AtomicFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
/* loaded from: classes.dex */
public class MindVolatilePackageSettings implements Parcelable {
    public static final Parcelable.Creator<MindVolatilePackageSettings> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public String f68154b;

    /* renamed from: c  reason: collision with root package name */
    public MindPackage f68155c;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<MindVolatilePackageSettings> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindVolatilePackageSettings createFromParcel(Parcel parcel) {
            return new MindVolatilePackageSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindVolatilePackageSettings[] newArray(int i4) {
            return new MindVolatilePackageSettings[i4];
        }
    }

    public MindVolatilePackageSettings() {
    }

    public static MindVolatilePackageSettings a(String str) {
        try {
            Parcel obtain = Parcel.obtain();
            File c02 = com.xinzhu.overmind.a.c0(str);
            if (c02.exists()) {
                byte[] v2 = com.xinzhu.overmind.utils.k.v(c02);
                obtain.unmarshall(v2, 0, v2.length);
                obtain.setDataPosition(0);
                return new MindVolatilePackageSettings(obtain);
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public boolean b() {
        synchronized (this) {
            Parcel obtain = Parcel.obtain();
            AtomicFile atomicFile = new AtomicFile(com.xinzhu.overmind.a.c0(this.f68154b));
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            FileOutputStream startWrite = atomicFile.startWrite();
            com.xinzhu.overmind.utils.k.z(obtain, startWrite);
            atomicFile.finishWrite(startWrite);
            obtain.recycle();
            com.xinzhu.overmind.utils.m.a(startWrite);
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f68154b);
        parcel.writeParcelable(this.f68155c, i4);
    }

    public MindVolatilePackageSettings(MindPackageSettings mindPackageSettings) {
        MindPackage mindPackage = mindPackageSettings.f68129b;
        this.f68154b = mindPackage.f68045m;
        this.f68155c = mindPackage;
    }

    protected MindVolatilePackageSettings(Parcel parcel) {
        this.f68154b = parcel.readString();
        this.f68155c = (MindPackage) parcel.readParcelable(MindPackage.class.getClassLoader());
    }
}
