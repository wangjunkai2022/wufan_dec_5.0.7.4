package com.xinzhu.overmind.server.os;

import android.net.Uri;
import android.os.Process;
import android.os.RemoteException;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.provider.FileProvider;
import com.xinzhu.overmind.server.os.d;
import com.xinzhu.overmind.server.user.MindUserHandle;
import java.io.File;
/* compiled from: MindStorageManagerService.java */
/* loaded from: classes.dex */
public class h extends d.b implements com.xinzhu.overmind.server.d {
    private static h sService = new h();
    private StorageManager mStorageManager = (StorageManager) Overmind.getContext().getSystemService("storage");

    public static h get() {
        return sService;
    }

    @Override // com.xinzhu.overmind.server.os.d
    public Uri getUriForFile(String str) throws RemoteException {
        return FileProvider.f(Overmind.getContext(), com.xinzhu.overmind.client.f.h(), new File(str));
    }

    @Override // com.xinzhu.overmind.server.os.d
    public StorageVolume[] getVolumeList(int i4, String str, int i5, int i6) throws RemoteException {
        try {
            StorageVolume[] h4 = com.xinzhu.haunted.android.os.storage.c.h(MindUserHandle.k(Process.myUid()), 0);
            for (StorageVolume storageVolume : h4) {
                com.xinzhu.haunted.android.os.storage.d dVar = new com.xinzhu.haunted.android.os.storage.d(storageVolume);
                dVar.f(com.xinzhu.overmind.a.F(i6));
                if (com.xinzhu.overmind.utils.e.y()) {
                    dVar.e(com.xinzhu.overmind.a.F(i6));
                }
            }
            return h4;
        } catch (Exception e5) {
            e5.printStackTrace();
            return new StorageVolume[0];
        }
    }

    @Override // com.xinzhu.overmind.server.d
    public void systemReady() {
    }
}
