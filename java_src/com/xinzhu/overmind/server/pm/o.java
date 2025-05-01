package com.xinzhu.overmind.server.pm;

import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.os.Parcel;
import android.util.ArrayMap;
import android.util.AtomicFile;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.pm.InstallOption;
import com.xinzhu.overmind.utils.v;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Settings.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: d  reason: collision with root package name */
    public static final String f68229d = "Settings";

    /* renamed from: a  reason: collision with root package name */
    final ArrayMap<String, MindPackageSettings> f68230a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Integer> f68231b;

    /* renamed from: c  reason: collision with root package name */
    private int f68232c;

    public o() {
        ArrayMap<String, MindPackageSettings> arrayMap = new ArrayMap<>();
        this.f68230a = arrayMap;
        this.f68231b = new HashMap();
        this.f68232c = 0;
        synchronized (arrayMap) {
            f();
        }
    }

    private int a(MindPackageSettings mindPackageSettings) {
        int i4;
        MindPackage mindPackage = mindPackageSettings.f68129b;
        String str = mindPackage.f68047o;
        if (str == null) {
            str = mindPackage.f68045m;
        }
        Integer num = this.f68231b.get(str);
        if (num != null) {
            i4 = num.intValue();
        } else {
            int i5 = this.f68232c;
            if (i5 >= 19999) {
                return -1;
            }
            int i6 = i5 + 1;
            this.f68232c = i6;
            this.f68231b.put(str, Integer.valueOf(i6));
            i4 = this.f68232c;
        }
        return i4 + 10000;
    }

    private int b(MindPackageSettings mindPackageSettings, int i4) {
        MindPackage mindPackage = mindPackageSettings.f68129b;
        String str = mindPackage.f68047o;
        if (str == null) {
            str = mindPackage.f68045m;
        }
        Integer num = this.f68231b.get(str);
        if (num != null) {
            return num.intValue() + 10000;
        }
        if (i4 >= 19999) {
            return -1;
        }
        this.f68232c = Math.max(this.f68232c, i4);
        this.f68231b.put(str, Integer.valueOf(i4));
        return i4 + 10000;
    }

    private void f() {
        Parcel obtain = Parcel.obtain();
        try {
            byte[] v2 = com.xinzhu.overmind.utils.k.v(com.xinzhu.overmind.a.W());
            obtain.unmarshall(v2, 0, v2.length);
            obtain.setDataPosition(0);
            this.f68232c = obtain.readInt();
            HashMap readHashMap = obtain.readHashMap(HashMap.class.getClassLoader());
            synchronized (this.f68231b) {
                this.f68231b.clear();
                this.f68231b.putAll(readHashMap);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
        obtain.recycle();
    }

    private void i() {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(com.xinzhu.overmind.a.W());
        FileOutputStream fileOutputStream = null;
        try {
            try {
                obtain.writeInt(this.f68232c);
                obtain.writeMap(this.f68231b);
                fileOutputStream = atomicFile.startWrite();
                com.xinzhu.overmind.utils.k.z(obtain, fileOutputStream);
                atomicFile.finishWrite(fileOutputStream);
            } catch (Exception e5) {
                e5.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
            }
        } finally {
            obtain.recycle();
        }
    }

    private void k(File file) {
        String name = file.getName();
        Parcel obtain = Parcel.obtain();
        File Q = com.xinzhu.overmind.a.Q(name);
        if (Q.exists()) {
            try {
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    obtain.setDataPosition(0);
                    com.xinzhu.overmind.b.c(f68229d, "package settings run into old ambulance routine");
                    MindPackageSettingsAmbulance mindPackageSettingsAmbulance = new MindPackageSettingsAmbulance(obtain);
                    MindPackageSettings mindPackageSettings = new MindPackageSettings();
                    mindPackageSettings.f68130c = mindPackageSettingsAmbulance.f68138c;
                    InstallOption installOption = mindPackageSettingsAmbulance.f68139d;
                    mindPackageSettings.f68131d = installOption;
                    mindPackageSettings.f68135h = mindPackageSettingsAmbulance.f68143h;
                    mindPackageSettings.f68132e = mindPackageSettingsAmbulance.f68140e;
                    mindPackageSettings.f68133f = mindPackageSettingsAmbulance.f68141f;
                    mindPackageSettings.f68134g = mindPackageSettingsAmbulance.f68142g;
                    if (installOption.f67788b == 1) {
                        try {
                            i.get().installPackageAsUser(Overmind.getContext().getPackageManager().getPackageInfo(name, 0).applicationInfo.publicSourceDir, InstallOption.b(), -1);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    } else {
                        File d5 = com.xinzhu.overmind.a.d(name);
                        for (Map.Entry<Integer, MindPackageUserState> entry : mindPackageSettings.f68135h.entrySet()) {
                            int intValue = entry.getKey().intValue();
                            entry.getValue();
                            com.xinzhu.overmind.b.c(f68229d, "try to fix corrupted settings by transfer, userId: " + intValue + " path: " + d5);
                            i.get().installPackageAsTransfer(d5.getAbsolutePath(), intValue, mindPackageSettings.f68130c);
                        }
                    }
                } finally {
                    obtain.recycle();
                }
            }
            if (com.xinzhu.overmind.a.R(name).exists() && com.xinzhu.overmind.a.c0(name).exists()) {
                com.xinzhu.overmind.b.c(f68229d, "package settings run into new routine");
                MindReliablePackageSettings b5 = MindReliablePackageSettings.b(name);
                MindVolatilePackageSettings a5 = MindVolatilePackageSettings.a(name);
                if (a5 != null && b5 != null) {
                    MindPackageSettings mindPackageSettings2 = new MindPackageSettings(b5, a5);
                    if (b5.f68149d.c(1)) {
                        String str = Overmind.getContext().getPackageManager().getPackageInfo(name, 128).applicationInfo.sourceDir;
                        if (!str.equals(a5.f68155c.f68054v)) {
                            com.xinzhu.overmind.server.e.d().k(a5.f68155c.f68045m);
                            a5.f68155c.f68054v = str;
                            h.get().updatePackage(mindPackageSettings2);
                        }
                    }
                    this.f68230a.put(mindPackageSettings2.f68129b.f68045m, mindPackageSettings2);
                    MindPackage mindPackage = a5.f68155c;
                    mindPackage.f68051s = j.f(mindPackage, 0, MindPackageUserState.a(), 0);
                    mindPackageSettings2.l();
                } else {
                    v.c(f68229d, "fatal error when fetch package settings, check it!!!!!!!!!");
                }
                return;
            }
            com.xinzhu.overmind.b.c(f68229d, "package settings run into old normal routine");
            byte[] v2 = com.xinzhu.overmind.utils.k.v(Q);
            obtain.unmarshall(v2, 0, v2.length);
            obtain.setDataPosition(0);
            MindPackageSettings mindPackageSettings3 = new MindPackageSettings(obtain);
            if (mindPackageSettings3.f68131d.c(1)) {
                String str2 = Overmind.getContext().getPackageManager().getPackageInfo(name, 128).applicationInfo.sourceDir;
                if (!str2.equals(mindPackageSettings3.f68129b.f68054v)) {
                    com.xinzhu.overmind.server.e.d().k(mindPackageSettings3.f68129b.f68045m);
                    mindPackageSettings3.f68129b.f68054v = str2;
                    h.get().updatePackage(mindPackageSettings3);
                }
            }
            this.f68230a.put(mindPackageSettings3.f68129b.f68045m, mindPackageSettings3);
            MindPackage mindPackage2 = mindPackageSettings3.f68129b;
            mindPackage2.f68051s = j.f(mindPackage2, 0, MindPackageUserState.a(), 0);
            mindPackageSettings3.l();
            com.xinzhu.overmind.b.c(f68229d, "new mps save success");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MindPackageSettings c(String str, PackageParser.Package r4, InstallOption installOption) {
        MindPackageSettings mindPackageSettings = new MindPackageSettings();
        mindPackageSettings.f68131d = installOption;
        mindPackageSettings.f68129b = new MindPackage(r4);
        synchronized (this.f68230a) {
            MindPackageSettings mindPackageSettings2 = this.f68230a.get(str);
            if (mindPackageSettings2 != null) {
                mindPackageSettings.f68130c = mindPackageSettings2.f68130c;
                mindPackageSettings.f68135h = mindPackageSettings2.f68135h;
                mindPackageSettings.f68133f = mindPackageSettings2.f68133f;
                mindPackageSettings.f68134g = mindPackageSettings2.f68134g;
            } else if (!g(mindPackageSettings)) {
                throw new RuntimeException("registerAppIdLPw err.");
            }
        }
        this.f68230a.put(mindPackageSettings.f68129b.f68045m, mindPackageSettings);
        MindPackage mindPackage = mindPackageSettings.f68129b;
        mindPackage.f68051s = j.f(mindPackage, 0, MindPackageUserState.a(), 0);
        if (com.xinzhu.overmind.client.hook.env.b.f(str) && Overmind.get().use32BitMainPackage() && mindPackageSettings.r()) {
            mindPackageSettings.o(true);
        }
        return mindPackageSettings;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MindPackageSettings d(String str, PackageParser.Package r4, int i4) {
        MindPackageSettings mindPackageSettings = new MindPackageSettings();
        mindPackageSettings.f68129b = new MindPackage(r4);
        synchronized (this.f68230a) {
            MindPackageSettings mindPackageSettings2 = this.f68230a.get(str);
            if (mindPackageSettings2 != null) {
                mindPackageSettings.f68130c = mindPackageSettings2.f68130c;
                mindPackageSettings.f68135h = mindPackageSettings2.f68135h;
            } else if (!h(mindPackageSettings, i4)) {
                throw new RuntimeException("registerAppIdLPw err.");
            }
        }
        this.f68230a.put(mindPackageSettings.f68129b.f68045m, mindPackageSettings);
        MindPackage mindPackage = mindPackageSettings.f68129b;
        mindPackage.f68051s = j.f(mindPackage, 0, MindPackageUserState.a(), 0);
        return mindPackageSettings;
    }

    public MindPackageSettings e(int i4) {
        synchronized (this.f68230a) {
            for (MindPackageSettings mindPackageSettings : this.f68230a.values()) {
                if (mindPackageSettings.f68130c == i4) {
                    return mindPackageSettings;
                }
            }
            return null;
        }
    }

    boolean g(MindPackageSettings mindPackageSettings) {
        boolean z4;
        if (mindPackageSettings.f68130c == 0) {
            mindPackageSettings.f68130c = a(mindPackageSettings);
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z5 = mindPackageSettings.f68130c >= 0 ? z4 : false;
        i();
        return z5;
    }

    boolean h(MindPackageSettings mindPackageSettings, int i4) {
        boolean z4;
        com.xinzhu.overmind.b.a(f68229d, "registerAppIdTransfer " + mindPackageSettings.f68129b.f68045m + " " + i4);
        if (mindPackageSettings.f68130c == 0) {
            mindPackageSettings.f68130c = b(mindPackageSettings, i4);
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z5 = mindPackageSettings.f68130c >= 0 ? z4 : false;
        i();
        return z5;
    }

    public void j() {
        synchronized (this.f68230a) {
            File h4 = com.xinzhu.overmind.a.h();
            com.xinzhu.overmind.utils.k.p(h4);
            File[] listFiles = h4.listFiles();
            if (!com.xinzhu.overmind.utils.d.o(listFiles)) {
                for (File file : listFiles) {
                    if (file.isDirectory() && !file.getName().equals("system")) {
                        k(file);
                    }
                }
            }
        }
    }
}
