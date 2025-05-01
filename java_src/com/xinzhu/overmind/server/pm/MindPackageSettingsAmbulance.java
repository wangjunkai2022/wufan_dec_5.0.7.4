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
public class MindPackageSettingsAmbulance implements Parcelable {

    /* renamed from: b  reason: collision with root package name */
    public MindPackageAmbulance f68137b;

    /* renamed from: c  reason: collision with root package name */
    public int f68138c;

    /* renamed from: d  reason: collision with root package name */
    public InstallOption f68139d;

    /* renamed from: e  reason: collision with root package name */
    public HashSet<String> f68140e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f68141f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f68142g;

    /* renamed from: h  reason: collision with root package name */
    public Map<Integer, MindPackageUserState> f68143h;

    /* renamed from: i  reason: collision with root package name */
    static final MindPackageUserState f68136i = new MindPackageUserState();
    public static final Parcelable.Creator<MindPackageSettingsAmbulance> CREATOR = new a();

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<MindPackageSettingsAmbulance> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MindPackageSettingsAmbulance createFromParcel(Parcel parcel) {
            return new MindPackageSettingsAmbulance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MindPackageSettingsAmbulance[] newArray(int i4) {
            return new MindPackageSettingsAmbulance[i4];
        }
    }

    public MindPackageSettingsAmbulance() {
        this.f68140e = new HashSet<>();
        this.f68141f = true;
        this.f68142g = false;
        this.f68143h = new HashMap();
    }

    private MindPackageUserState h(int i4) {
        MindPackageUserState mindPackageUserState = this.f68143h.get(Integer.valueOf(i4));
        if (mindPackageUserState == null) {
            MindPackageUserState mindPackageUserState2 = new MindPackageUserState();
            this.f68143h.put(Integer.valueOf(i4), mindPackageUserState2);
            return mindPackageUserState2;
        }
        return mindPackageUserState;
    }

    public boolean a() {
        return this.f68140e.isEmpty();
    }

    public boolean b(int i4) {
        return i(i4).f68146d;
    }

    public boolean c(int i4) {
        return i(i4).f68144b;
    }

    public String d() {
        return this.f68141f ? a() ? Overmind.get().use32BitMainPackage() ? com.xinzhu.overmind.a.f67441i : com.xinzhu.overmind.a.f67443k : Overmind.get().use32BitMainPackage() ? q() ? com.xinzhu.overmind.a.f67441i : com.xinzhu.overmind.a.f67443k : r() ? com.xinzhu.overmind.a.f67443k : com.xinzhu.overmind.a.f67441i : Overmind.get().use32BitMainPackage() ? this.f68142g ? com.xinzhu.overmind.a.f67443k : com.xinzhu.overmind.a.f67441i : this.f68142g ? com.xinzhu.overmind.a.f67441i : com.xinzhu.overmind.a.f67443k;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e(int i4) {
        return i(i4).f68145c;
    }

    public List<Integer> f() {
        return new ArrayList(this.f68143h.keySet());
    }

    public List<MindPackageUserState> g() {
        return new ArrayList(this.f68143h.values());
    }

    public MindPackageUserState i(int i4) {
        MindPackageUserState mindPackageUserState = this.f68143h.get(Integer.valueOf(i4));
        if (mindPackageUserState == null) {
            mindPackageUserState = new MindPackageUserState();
        }
        MindPackageUserState mindPackageUserState2 = new MindPackageUserState(mindPackageUserState);
        if (this.f68143h.get(-1) != null) {
            mindPackageUserState2.f68144b = true;
        }
        return mindPackageUserState2;
    }

    public void j(int i4) {
        this.f68143h.remove(Integer.valueOf(i4));
    }

    public boolean k() {
        if (this.f68141f) {
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
        return this.f68142g;
    }

    public boolean l() {
        synchronized (this) {
            Parcel obtain = Parcel.obtain();
            AtomicFile atomicFile = new AtomicFile(com.xinzhu.overmind.a.Q(this.f68137b.f68093n));
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
            this.f68141f = false;
            this.f68142g = z4;
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
            java.util.HashSet<java.lang.String> r0 = r3.f68140e
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
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.overmind.server.pm.MindPackageSettingsAmbulance.q():boolean");
    }

    public boolean r() {
        Iterator<String> it2 = this.f68140e.iterator();
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
        parcel.writeParcelable(this.f68137b, i4);
        parcel.writeInt(this.f68138c);
        parcel.writeParcelable(this.f68139d, i4);
        parcel.writeSerializable(this.f68140e);
        parcel.writeByte(this.f68141f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68142g ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f68143h.size());
        for (Map.Entry<Integer, MindPackageUserState> entry : this.f68143h.entrySet()) {
            parcel.writeValue(entry.getKey());
            parcel.writeParcelable(entry.getValue(), i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MindPackageSettingsAmbulance(Parcel parcel) {
        this.f68140e = new HashSet<>();
        this.f68141f = true;
        this.f68142g = false;
        this.f68143h = new HashMap();
        String readString = parcel.readString();
        String simpleName = getClass().getSimpleName();
        com.xinzhu.overmind.b.c(simpleName, "MindPackageSettingsAmbulance read class " + readString);
        this.f68137b = new MindPackageAmbulance(parcel);
        this.f68138c = parcel.readInt();
        this.f68139d = (InstallOption) parcel.readParcelable(InstallOption.class.getClassLoader());
        this.f68140e = (HashSet) parcel.readSerializable();
        this.f68141f = parcel.readByte() != 0;
        this.f68142g = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.f68143h = new HashMap(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            this.f68143h.put((Integer) parcel.readValue(Integer.class.getClassLoader()), (MindPackageUserState) parcel.readParcelable(MindPackageUserState.class.getClassLoader()));
        }
    }
}
