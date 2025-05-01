package com.xinzhu.overmind.server.pm.installer;

import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.entity.pm.InstallOption;
import com.xinzhu.overmind.server.pm.MindPackageSettings;
import com.xinzhu.overmind.utils.k;
import com.xinzhu.overmind.utils.q;
import java.io.File;
import java.io.IOException;
/* compiled from: CopyExecutor.java */
/* loaded from: classes6.dex */
public class a implements d {

    /* renamed from: b  reason: collision with root package name */
    private static final String f68198b = "a";

    private void b(MindPackageSettings mindPackageSettings, File file, File file2, InstallOption installOption) throws IOException {
        if (installOption.c(2)) {
            if (installOption.c(8)) {
                if (k.r(file, file2)) {
                    return;
                }
                k.b(file, file2);
                return;
            }
            k.b(file, file2);
        }
    }

    private void c(MindPackageSettings mindPackageSettings, File file) throws Exception {
        if (mindPackageSettings.a()) {
            q.a(file, new File(com.xinzhu.overmind.a.f(mindPackageSettings.f68129b.f68045m), com.xinzhu.overmind.a.K(Overmind.get().use32BitMainPackage() ? com.xinzhu.overmind.a.f67441i : com.xinzhu.overmind.a.f67443k)), !Overmind.get().use32BitMainPackage());
            com.xinzhu.overmind.b.a(f68198b, "apk emptyAbi detected, copy native libs.");
            return;
        }
        if (mindPackageSettings.q()) {
            q.a(file, new File(com.xinzhu.overmind.a.f(mindPackageSettings.f68129b.f68045m), com.xinzhu.overmind.a.K(com.xinzhu.overmind.a.f67441i)), false);
            com.xinzhu.overmind.b.a(f68198b, "apk 32bit detected, copy native libs.");
        }
        if (mindPackageSettings.r()) {
            q.a(file, new File(com.xinzhu.overmind.a.f(mindPackageSettings.f68129b.f68045m), com.xinzhu.overmind.a.K(com.xinzhu.overmind.a.f67443k)), true);
            com.xinzhu.overmind.b.a(f68198b, "apk 64bit detected, copy native libs.");
        }
    }

    @Override // com.xinzhu.overmind.server.pm.installer.d
    public int a(MindPackageSettings mindPackageSettings, InstallOption installOption, int i4) {
        String[] strArr;
        try {
            String str = mindPackageSettings.f68129b.f68054v;
            File file = new File(str);
            File j4 = com.xinzhu.overmind.a.j(mindPackageSettings.f68129b.f68045m);
            c(mindPackageSettings, file);
            b(mindPackageSettings, file, j4, installOption);
            if (installOption.c(2)) {
                mindPackageSettings.f68129b.f68054v = j4.getAbsolutePath();
            }
            if (!com.xinzhu.overmind.utils.d.o(mindPackageSettings.f68129b.f68053u)) {
                for (String str2 : mindPackageSettings.f68129b.f68053u) {
                    File P = com.xinzhu.overmind.a.P(str, str2);
                    if (!P.exists()) {
                        P = com.xinzhu.overmind.a.d0(str, str2);
                    }
                    File S = com.xinzhu.overmind.a.S(mindPackageSettings.f68129b.f68045m, str2);
                    c(mindPackageSettings, P);
                    b(mindPackageSettings, P, S, installOption);
                }
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }
}
