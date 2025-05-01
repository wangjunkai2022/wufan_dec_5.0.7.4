package com.xinzhu.overmind.server.pm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AtomicFile;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.pm.InstallOption;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class MindReliablePackageSettings implements Parcelable {
    public static final Parcelable.Creator<MindReliablePackageSettings> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public String f68147b;

    /* renamed from: c  reason: collision with root package name */
    public int f68148c;

    /* renamed from: d  reason: collision with root package name */
    public InstallOption f68149d;

    /* renamed from: e  reason: collision with root package name */
    public HashSet<String> f68150e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f68151f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f68152g;

    /* renamed from: h  reason: collision with root package name */
    public Map<Integer, MindPackageUserState> f68153h;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<MindReliablePackageSettings> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindReliablePackageSettings createFromParcel(Parcel parcel) {
            return new MindReliablePackageSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindReliablePackageSettings[] newArray(int i4) {
            return new MindReliablePackageSettings[i4];
        }
    }

    public MindReliablePackageSettings() {
        this.f68150e = new HashSet<>();
        this.f68151f = true;
        this.f68152g = false;
        this.f68153h = new HashMap();
    }

    public static MindReliablePackageSettings b(String str) {
        try {
            Parcel obtain = Parcel.obtain();
            File R = com.xinzhu.overmind.a.R(str);
            if (R.exists()) {
                byte[] v2 = com.xinzhu.overmind.utils.k.v(R);
                obtain.unmarshall(v2, 0, v2.length);
                obtain.setDataPosition(0);
                return new MindReliablePackageSettings(obtain);
            }
            return null;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private MindPackageUserState i(int i4) {
        MindPackageUserState mindPackageUserState = this.f68153h.get(Integer.valueOf(i4));
        if (mindPackageUserState == null) {
            MindPackageUserState mindPackageUserState2 = new MindPackageUserState();
            this.f68153h.put(Integer.valueOf(i4), mindPackageUserState2);
            return mindPackageUserState2;
        }
        return mindPackageUserState;
    }

    public boolean a() {
        return this.f68150e.isEmpty();
    }

    public boolean c(int i4) {
        return j(i4).f68146d;
    }

    public boolean d(int i4) {
        return j(i4).f68144b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f68151f ? a() ? Overmind.get().use32BitMainPackage() ? com.xinzhu.overmind.a.f67441i : com.xinzhu.overmind.a.f67443k : Overmind.get().use32BitMainPackage() ? r() ? com.xinzhu.overmind.a.f67441i : com.xinzhu.overmind.a.f67443k : s() ? com.xinzhu.overmind.a.f67443k : com.xinzhu.overmind.a.f67441i : Overmind.get().use32BitMainPackage() ? this.f68152g ? com.xinzhu.overmind.a.f67443k : com.xinzhu.overmind.a.f67441i : this.f68152g ? com.xinzhu.overmind.a.f67441i : com.xinzhu.overmind.a.f67443k;
    }

    public boolean f(int i4) {
        return j(i4).f68145c;
    }

    public List<Integer> g() {
        return new ArrayList(this.f68153h.keySet());
    }

    public List<MindPackageUserState> h() {
        return new ArrayList(this.f68153h.values());
    }

    public MindPackageUserState j(int i4) {
        MindPackageUserState mindPackageUserState = this.f68153h.get(Integer.valueOf(i4));
        if (mindPackageUserState == null) {
            mindPackageUserState = new MindPackageUserState();
        }
        MindPackageUserState mindPackageUserState2 = new MindPackageUserState(mindPackageUserState);
        if (this.f68153h.get(-1) != null) {
            mindPackageUserState2.f68144b = true;
        }
        return mindPackageUserState2;
    }

    public void k(int i4) {
        this.f68153h.remove(Integer.valueOf(i4));
    }

    public boolean l() {
        if (this.f68151f) {
            if (a()) {
                return false;
            }
            if (Overmind.get().use32BitMainPackage()) {
                if (r()) {
                    return false;
                }
            } else if (s()) {
                return false;
            }
            return true;
        }
        return this.f68152g;
    }

    public boolean m() {
        synchronized (this) {
            Parcel obtain = Parcel.obtain();
            AtomicFile atomicFile = new AtomicFile(com.xinzhu.overmind.a.R(this.f68147b));
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

    public void n(boolean z4, int i4) {
        i(i4).f68146d = z4;
    }

    public void o(boolean z4, int i4) {
        i(i4).f68144b = z4;
    }

    public void p(boolean z4) {
        if (Overmind.get().isServerProcess()) {
            this.f68151f = false;
            this.f68152g = z4;
            return;
        }
        throw new RuntimeException("calling setRunWithPlugin not in server process!");
    }

    public void q(boolean z4, int i4) {
        i(i4).f68145c = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean r() {
        /*
            r3 = this;
            java.util.HashSet<java.lang.String> r0 = r3.f68150e
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "armeabi"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L22
            java.lang.String r2 = "armeabi-v7a"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L6
        L22:
            r0 = 1
            return r0
        L24:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.server.pm.MindReliablePackageSettings.r():boolean");
    }

    public boolean s() {
        Iterator<String> it2 = this.f68150e.iterator();
        while (it2.hasNext()) {
            if ("arm64-v8a".equals(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean t() {
        return Overmind.get().use32BitMainPackage() ? s() : r();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f68147b);
        parcel.writeInt(this.f68148c);
        parcel.writeParcelable(this.f68149d, i4);
        parcel.writeSerializable(this.f68150e);
        parcel.writeByte(this.f68151f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68152g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f68153h.size());
        for (Map.Entry<Integer, MindPackageUserState> entry : this.f68153h.entrySet()) {
            parcel.writeValue(entry.getKey());
            parcel.writeParcelable(entry.getValue(), i4);
        }
    }

    public MindReliablePackageSettings(MindPackageSettings mindPackageSettings) {
        this.f68150e = new HashSet<>();
        this.f68151f = true;
        this.f68152g = false;
        this.f68153h = new HashMap();
        this.f68147b = mindPackageSettings.f68129b.f68045m;
        this.f68148c = mindPackageSettings.f68130c;
        this.f68149d = mindPackageSettings.f68131d;
        this.f68150e = mindPackageSettings.f68132e;
        this.f68151f = mindPackageSettings.f68133f;
        this.f68152g = mindPackageSettings.f68134g;
        this.f68153h = mindPackageSettings.f68135h;
    }

    protected MindReliablePackageSettings(Parcel parcel) {
        this.f68150e = new HashSet<>();
        this.f68151f = true;
        this.f68152g = false;
        this.f68153h = new HashMap();
        this.f68147b = parcel.readString();
        this.f68148c = parcel.readInt();
        this.f68149d = (InstallOption) parcel.readParcelable(InstallOption.class.getClassLoader());
        this.f68150e = (HashSet) parcel.readSerializable();
        this.f68151f = parcel.readByte() != 0;
        this.f68152g = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.f68153h = new HashMap(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f68153h.put((Integer) parcel.readValue(Integer.class.getClassLoader()), (MindPackageUserState) parcel.readParcelable(MindPackageUserState.class.getClassLoader()));
        }
    }
}
