package com.xinzhu.overmind.server.os;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.xinzhu.overmind.Overmind;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/* loaded from: classes.dex */
public class MindDeviceInfo implements Parcelable {
    public static final Parcelable.Creator<MindDeviceInfo> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public boolean f68007b;

    /* renamed from: c  reason: collision with root package name */
    public String f68008c;

    /* renamed from: d  reason: collision with root package name */
    public String f68009d;

    /* renamed from: e  reason: collision with root package name */
    public String f68010e;

    /* renamed from: f  reason: collision with root package name */
    public String f68011f;

    /* renamed from: g  reason: collision with root package name */
    public String f68012g;

    /* renamed from: h  reason: collision with root package name */
    public String f68013h;

    /* renamed from: i  reason: collision with root package name */
    public String f68014i;

    /* renamed from: j  reason: collision with root package name */
    public Map<String, String> f68015j = new HashMap();

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<MindDeviceInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindDeviceInfo createFromParcel(Parcel parcel) {
            return new MindDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindDeviceInfo[] newArray(int i4) {
            return new MindDeviceInfo[i4];
        }
    }

    public MindDeviceInfo() {
    }

    public static MindDeviceInfo a() {
        MindDeviceInfo mindDeviceInfo = new MindDeviceInfo();
        mindDeviceInfo.f68007b = true;
        if (!Overmind.get().useRandomGeneratedVirtualDevice()) {
            mindDeviceInfo.f68008c = "3541065001663722161";
            mindDeviceInfo.f68009d = "976188710578541";
            mindDeviceInfo.f68010e = "97618871057854142254";
            mindDeviceInfo.f68011f = "stub";
            mindDeviceInfo.f68012g = "stub";
            mindDeviceInfo.f68013h = "2134043431";
        } else {
            mindDeviceInfo.f68008c = b(16);
            mindDeviceInfo.f68009d = c(15);
            mindDeviceInfo.f68010e = c(20);
            mindDeviceInfo.f68011f = d();
            mindDeviceInfo.f68012g = d();
            mindDeviceInfo.f68013h = Build.SERIAL;
        }
        mindDeviceInfo.f68015j.put("BRAND", Build.BRAND);
        mindDeviceInfo.f68015j.put("MODEL", Build.MODEL);
        mindDeviceInfo.f68015j.put("PRODUCT", Build.PRODUCT);
        mindDeviceInfo.f68015j.put("DEVICE", Build.DEVICE);
        mindDeviceInfo.f68015j.put("BOARD", Build.BOARD);
        mindDeviceInfo.f68015j.put("DISPLAY", Build.DISPLAY);
        mindDeviceInfo.f68015j.put("ID", Build.ID);
        mindDeviceInfo.f68015j.put("MANUFACTURER", Build.MANUFACTURER);
        mindDeviceInfo.f68015j.put("FINGERPRINT", Build.FINGERPRINT);
        return mindDeviceInfo;
    }

    private static String b(int i4) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < i4) {
            sb.append(Integer.toHexString(random.nextInt()));
        }
        return sb.toString().substring(0, i4);
    }

    private static String c(int i4) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < i4) {
            sb.append(random.nextInt(10));
        }
        return sb.toString().substring(0, i4);
    }

    private static String d() {
        Random random = new Random();
        String str = "";
        for (int i4 = 0; i4 < 6; i4++) {
            int nextInt = random.nextInt(255);
            str = str + String.format("%02x", Integer.valueOf(nextInt));
            if (i4 != 5) {
                str = str + ":";
            }
        }
        return str.toUpperCase();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeByte(this.f68007b ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f68008c);
        parcel.writeString(this.f68009d);
        parcel.writeString(this.f68010e);
        parcel.writeString(this.f68011f);
        parcel.writeString(this.f68012g);
        parcel.writeString(this.f68013h);
        parcel.writeString(this.f68014i);
        parcel.writeInt(this.f68015j.size());
        for (Map.Entry<String, String> entry : this.f68015j.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    protected MindDeviceInfo(Parcel parcel) {
        this.f68007b = parcel.readByte() != 0;
        this.f68008c = parcel.readString();
        this.f68009d = parcel.readString();
        this.f68010e = parcel.readString();
        this.f68011f = parcel.readString();
        this.f68012g = parcel.readString();
        this.f68013h = parcel.readString();
        this.f68014i = parcel.readString();
        int readInt = parcel.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f68015j.put(parcel.readString(), parcel.readString());
        }
    }
}
