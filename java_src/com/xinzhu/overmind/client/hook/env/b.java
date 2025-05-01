package com.xinzhu.overmind.client.hook.env;

import android.content.pm.PackageManager;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.frameworks.i;
import com.xinzhu.overmind.server.user.MindUserInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: GmsEnv.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f67611a = "b";

    /* renamed from: b  reason: collision with root package name */
    private static final ArrayList<String> f67612b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f67613c = "com.google.android.gms";

    /* renamed from: d  reason: collision with root package name */
    public static final String f67614d = "com.google.android.gsf";

    /* renamed from: e  reason: collision with root package name */
    public static final String f67615e = "com.android.vending";

    /* renamed from: f  reason: collision with root package name */
    public static final String f67616f = "com.google.android.gsf.login";

    /* renamed from: g  reason: collision with root package name */
    public static final String f67617g = "com.google.android.play.games";

    /* renamed from: h  reason: collision with root package name */
    private static final ArrayList<String> f67618h;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f67612b = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        f67618h = arrayList2;
        arrayList.add(f67613c);
        arrayList.add(f67614d);
        arrayList.add(f67615e);
        arrayList.add(f67616f);
        arrayList.add(f67617g);
        arrayList2.add(f67613c);
        arrayList2.add(f67614d);
        arrayList2.add(f67615e);
        arrayList2.add(f67616f);
        arrayList2.add(f67617g);
        arrayList2.add("com.google.android.backuptransport");
        arrayList2.add("com.google.android.backup");
        arrayList2.add("com.google.android.configupdater");
        arrayList2.add("com.google.android.syncadapters.contacts");
        arrayList2.add("com.google.android.feedback");
        arrayList2.add("com.google.android.onetimeinitializer");
        arrayList2.add("com.google.android.partnersetup");
        arrayList2.add("com.google.android.setupwizard");
        arrayList2.add("com.google.android.syncadapters.calendar");
    }

    public static boolean a() {
        return Overmind.get().isInstalled(f67613c) && Overmind.get().isInstalled(f67614d) && Overmind.get().isInstalled(f67615e);
    }

    public static boolean b() {
        return Overmind.isPkgInstalledOutside(f67613c) && Overmind.isPkgInstalledOutside(f67614d) && Overmind.isPkgInstalledOutside(f67615e);
    }

    public static void c() {
        if (a()) {
            return;
        }
        d(0);
        for (MindUserInfo mindUserInfo : i.d().f()) {
            d(mindUserInfo.f68255b);
        }
    }

    public static void d(int i4) {
        Iterator<String> it2 = f67612b.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            try {
                if (Overmind.get().isInstalled(next)) {
                    Overmind.get().installPackageAsUser_Exist(next, i4);
                } else {
                    Overmind.get().installPackageAsUser_Storage(new File(Overmind.getPackageManager().getPackageInfo(next, 0).applicationInfo.publicSourceDir), i4);
                }
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
            }
        }
    }

    public static void e() {
        File[] listFiles;
        File externalFilesDir = Overmind.getContext().getExternalFilesDir("GmsApkDir");
        if (!externalFilesDir.exists() || (listFiles = externalFilesDir.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        for (MindUserInfo mindUserInfo : i.d().f()) {
            for (File file : listFiles) {
                Overmind.get().installPackageAsUser_Storage(file, mindUserInfo.f68255b);
            }
        }
    }

    public static boolean f(String str) {
        return f67618h.contains(str);
    }

    public static void g(boolean z4) {
        Iterator<String> it2 = f67612b.iterator();
        while (it2.hasNext()) {
            Overmind.getMindPackageManager().D(it2.next(), z4);
        }
    }
}
