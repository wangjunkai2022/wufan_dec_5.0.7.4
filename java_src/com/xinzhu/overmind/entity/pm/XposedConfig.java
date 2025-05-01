package com.xinzhu.overmind.entity.pm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public class XposedConfig implements Parcelable {
    public static final Parcelable.Creator<XposedConfig> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public boolean f67800b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, Boolean> f67801c;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<XposedConfig> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public XposedConfig createFromParcel(Parcel parcel) {
            return new XposedConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public XposedConfig[] newArray(int i4) {
            return new XposedConfig[i4];
        }
    }

    public XposedConfig() {
        this.f67801c = new HashMap();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f67800b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f67801c.size());
        for (Map.Entry<String, Boolean> entry : this.f67801c.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeValue(entry.getValue());
        }
    }

    public XposedConfig(Parcel parcel) {
        this.f67801c = new HashMap();
        this.f67800b = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.f67801c = new HashMap(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f67801c.put(parcel.readString(), (Boolean) parcel.readValue(Boolean.class.getClassLoader()));
        }
    }
}
