package com.xinzhu.overmind.server.pm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AtomicFile;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.pm.InstallOption;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class MindPackageSettings implements Parcelable {
    public static final Parcelable.Creator<MindPackageSettings> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public MindPackage f68129b;

    /* renamed from: c  reason: collision with root package name */
    public int f68130c;

    /* renamed from: d  reason: collision with root package name */
    public InstallOption f68131d;

    /* renamed from: e  reason: collision with root package name */
    public HashSet<String> f68132e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f68133f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f68134g;

    /* renamed from: h  reason: collision with root package name */
    public Map<Integer, MindPackageUserState> f68135h;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<MindPackageSettings> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindPackageSettings createFromParcel(Parcel parcel) {
            return new MindPackageSettings(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindPackageSettings[] newArray(int i4) {
            return new MindPackageSettings[i4];
        }
    }

    public MindPackageSettings() {
        this.f68132e = new HashSet<>();
        this.f68133f = true;
        this.f68134g = false;
        this.f68135h = new HashMap();
    }

    private MindPackageUserState h(int i4) {
        MindPackageUserState mindPackageUserState = this.f68135h.get(Integer.valueOf(i4));
        if (mindPackageUserState == null) {
            MindPackageUserState mindPackageUserState2 = new MindPackageUserState();
            this.f68135h.put(Integer.valueOf(i4), mindPackageUserState2);
            return mindPackageUserState2;
        }
        return mindPackageUserState;
    }

    public boolean a() {
        return this.f68132e.isEmpty();
    }

    public boolean b(int i4) {
        return i(i4).f68146d;
    }

    public boolean c(int i4) {
        return i(i4).f68144b;
    }

    public String d() {
        return this.f68133f ? a() ? Overmind.get().use32BitMainPackage() ? com.xinzhu.overmind.a.f67441i : com.xinzhu.overmind.a.f67443k : Overmind.get().use32BitMainPackage() ? q() ? com.xinzhu.overmind.a.f67441i : com.xinzhu.overmind.a.f67443k : r() ? com.xinzhu.overmind.a.f67443k : com.xinzhu.overmind.a.f67441i : Overmind.get().use32BitMainPackage() ? this.f68134g ? com.xinzhu.overmind.a.f67443k : com.xinzhu.overmind.a.f67441i : this.f68134g ? com.xinzhu.overmind.a.f67441i : com.xinzhu.overmind.a.f67443k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e(int i4) {
        return i(i4).f68145c;
    }

    public List<Integer> f() {
        return new ArrayList(this.f68135h.keySet());
    }

    public List<MindPackageUserState> g() {
        return new ArrayList(this.f68135h.values());
    }

    public MindPackageUserState i(int i4) {
        MindPackageUserState mindPackageUserState = this.f68135h.get(Integer.valueOf(i4));
        if (mindPackageUserState == null) {
            mindPackageUserState = new MindPackageUserState();
        }
        MindPackageUserState mindPackageUserState2 = new MindPackageUserState(mindPackageUserState);
        if (this.f68135h.get(-1) != null) {
            mindPackageUserState2.f68144b = true;
        }
        return mindPackageUserState2;
    }

    public void j(int i4) {
        this.f68135h.remove(Integer.valueOf(i4));
    }

    public boolean k() {
        if (this.f68133f) {
            if (a()) {
                return false;
            }
            if (Overmind.get().use32BitMainPackage()) {
                if (q()) {
                    return false;
                }
            } else if (r()) {
                return false;
            }
            return true;
        }
        return this.f68134g;
    }

    public boolean l() {
        synchronized (this) {
            new MindVolatilePackageSettings(this).b();
            new MindReliablePackageSettings(this).m();
            Parcel obtain = Parcel.obtain();
            AtomicFile atomicFile = new AtomicFile(com.xinzhu.overmind.a.Q(this.f68129b.f68045m));
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

    public void m(boolean z4, int i4) {
        h(i4).f68146d = z4;
    }

    public void n(boolean z4, int i4) {
        h(i4).f68144b = z4;
    }

    public void o(boolean z4) {
        if (Overmind.get().isServerProcess()) {
            this.f68133f = false;
            this.f68134g = z4;
            return;
        }
        throw new RuntimeException("calling setRunWithPlugin not in server process!");
    }

    public void p(boolean z4, int i4) {
        h(i4).f68145c = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q() {
        /*
            r3 = this;
            java.util.HashSet<java.lang.String> r0 = r3.f68132e
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
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.server.pm.MindPackageSettings.q():boolean");
    }

    public boolean r() {
        Iterator<String> it2 = this.f68132e.iterator();
        while (it2.hasNext()) {
            if ("arm64-v8a".equals(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean s() {
        return Overmind.get().use32BitMainPackage() ? r() : q();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f68129b, i4);
        parcel.writeInt(this.f68130c);
        parcel.writeParcelable(this.f68131d, i4);
        parcel.writeSerializable(this.f68132e);
        parcel.writeByte(this.f68133f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68134g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f68135h.size());
        for (Map.Entry<Integer, MindPackageUserState> entry : this.f68135h.entrySet()) {
            parcel.writeValue(entry.getKey());
            parcel.writeParcelable(entry.getValue(), i4);
        }
    }

    public MindPackageSettings(MindReliablePackageSettings mindReliablePackageSettings, MindVolatilePackageSettings mindVolatilePackageSettings) {
        this.f68132e = new HashSet<>();
        this.f68133f = true;
        this.f68134g = false;
        this.f68135h = new HashMap();
        this.f68129b = mindVolatilePackageSettings.f68155c;
        this.f68130c = mindReliablePackageSettings.f68148c;
        this.f68131d = mindReliablePackageSettings.f68149d;
        this.f68132e = mindReliablePackageSettings.f68150e;
        this.f68133f = mindReliablePackageSettings.f68151f;
        this.f68134g = mindReliablePackageSettings.f68152g;
        this.f68135h = mindReliablePackageSettings.f68153h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MindPackageSettings(Parcel parcel) {
        this.f68132e = new HashSet<>();
        this.f68133f = true;
        this.f68134g = false;
        this.f68135h = new HashMap();
        this.f68129b = (MindPackage) parcel.readParcelable(MindPackage.class.getClassLoader());
        this.f68130c = parcel.readInt();
        this.f68131d = (InstallOption) parcel.readParcelable(InstallOption.class.getClassLoader());
        this.f68132e = (HashSet) parcel.readSerializable();
        this.f68133f = parcel.readByte() != 0;
        this.f68134g = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.f68135h = new HashMap(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f68135h.put((Integer) parcel.readValue(Integer.class.getClassLoader()), (MindPackageUserState) parcel.readParcelable(MindPackageUserState.class.getClassLoader()));
        }
    }
}
