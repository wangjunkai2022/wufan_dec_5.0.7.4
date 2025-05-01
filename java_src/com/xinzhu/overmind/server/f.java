package com.xinzhu.overmind.server;

import android.content.pm.PackageManager;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.pm.InstallOption;
import com.xinzhu.overmind.server.accounts.MindAccountManagerService;
/* compiled from: MindSystem.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static f f67976a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f67977b;

    public static f a() {
        if (f67976a == null) {
            synchronized (f.class) {
                if (f67976a == null) {
                    f67976a = new f();
                }
            }
        }
        return f67976a;
    }

    public void b() {
        f67977b = true;
        com.xinzhu.overmind.a.f0();
        com.xinzhu.overmind.server.user.c.get().systemReady();
        com.xinzhu.overmind.server.pm.i.get().systemReady();
        com.xinzhu.overmind.server.am.f.get().systemReady();
        com.xinzhu.overmind.server.am.g.get().systemReady();
        com.xinzhu.overmind.server.os.h.get().systemReady();
        com.xinzhu.overmind.server.pm.h.get().systemReady();
        com.xinzhu.overmind.server.os.g.get().systemReady();
        MindAccountManagerService.get().systemReady();
        for (String str : com.xinzhu.overmind.client.hook.env.a.a()) {
            try {
                com.xinzhu.overmind.server.pm.i iVar = com.xinzhu.overmind.server.pm.i.get();
                if (!iVar.isInstalled(str, 0)) {
                    iVar.installPackageAsUser(Overmind.getContext().getPackageManager().getPackageInfo(str, 0).applicationInfo.publicSourceDir, InstallOption.b(), 0);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        f67977b = false;
    }
}
