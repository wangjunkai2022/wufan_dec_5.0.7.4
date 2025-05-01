package com.xinzhu.overmind.server.pm;

import android.os.RemoteException;
import com.xinzhu.overmind.entity.pm.InstallOption;
import com.xinzhu.overmind.server.pm.d;
import com.xinzhu.overmind.utils.v;
import java.util.ArrayList;
/* compiled from: MindPackageInstallerService.java */
/* loaded from: classes.dex */
public class h extends d.b implements com.xinzhu.overmind.server.d {
    public static final String TAG = "MindPackageInstallerService";
    private static h sService = new h();

    public static h get() {
        return sService;
    }

    @Override // com.xinzhu.overmind.server.pm.d
    public int installPackageAsExist(MindPackageSettings mindPackageSettings, int i4) throws RemoteException {
        ArrayList<com.xinzhu.overmind.server.pm.installer.d> arrayList = new ArrayList();
        arrayList.add(new com.xinzhu.overmind.server.pm.installer.c());
        InstallOption installOption = mindPackageSettings.f68131d;
        for (com.xinzhu.overmind.server.pm.installer.d dVar : arrayList) {
            int a5 = dVar.a(mindPackageSettings, installOption, i4);
            v.a(TAG, "installPackageAsUser_Storage: " + dVar.getClass().getSimpleName() + " exec: " + a5);
            if (a5 != 0) {
                return a5;
            }
        }
        return 0;
    }

    @Override // com.xinzhu.overmind.server.pm.d
    public int installPackageAsUser(MindPackageSettings mindPackageSettings, int i4) throws RemoteException {
        ArrayList<com.xinzhu.overmind.server.pm.installer.d> arrayList = new ArrayList();
        arrayList.add(new com.xinzhu.overmind.server.pm.installer.c());
        arrayList.add(new com.xinzhu.overmind.server.pm.installer.b());
        arrayList.add(new com.xinzhu.overmind.server.pm.installer.a());
        InstallOption installOption = mindPackageSettings.f68131d;
        for (com.xinzhu.overmind.server.pm.installer.d dVar : arrayList) {
            int a5 = dVar.a(mindPackageSettings, installOption, i4);
            v.a(TAG, "installPackageAsUser_Storage: " + dVar.getClass().getSimpleName() + " exec: " + a5);
            if (a5 != 0) {
                return a5;
            }
        }
        return 0;
    }

    @Override // com.xinzhu.overmind.server.d
    public void systemReady() {
    }

    @Override // com.xinzhu.overmind.server.pm.d
    public int uninstallPackageAsUser(MindPackageSettings mindPackageSettings, boolean z4, int i4) {
        ArrayList<com.xinzhu.overmind.server.pm.installer.d> arrayList = new ArrayList();
        if (z4) {
            arrayList.add(new com.xinzhu.overmind.server.pm.installer.e());
        }
        arrayList.add(new com.xinzhu.overmind.server.pm.installer.f());
        InstallOption installOption = mindPackageSettings.f68131d;
        for (com.xinzhu.overmind.server.pm.installer.d dVar : arrayList) {
            int a5 = dVar.a(mindPackageSettings, installOption, i4);
            v.a(TAG, "uninstallPackageAsUser: " + dVar.getClass().getSimpleName() + " exec: " + a5);
            if (a5 != 0) {
                return a5;
            }
        }
        return 0;
    }

    @Override // com.xinzhu.overmind.server.pm.d
    public int updatePackage(MindPackageSettings mindPackageSettings) {
        ArrayList<com.xinzhu.overmind.server.pm.installer.d> arrayList = new ArrayList();
        arrayList.add(new com.xinzhu.overmind.server.pm.installer.b());
        arrayList.add(new com.xinzhu.overmind.server.pm.installer.a());
        InstallOption installOption = mindPackageSettings.f68131d;
        for (com.xinzhu.overmind.server.pm.installer.d dVar : arrayList) {
            int a5 = dVar.a(mindPackageSettings, installOption, -1);
            v.a(TAG, "updatePackage: " + dVar.getClass().getSimpleName() + " exec: " + a5);
            if (a5 != 0) {
                return a5;
            }
        }
        return 0;
    }
}
