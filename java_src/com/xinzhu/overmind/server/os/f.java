package com.xinzhu.overmind.server.os;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.xinzhu.overmind.server.os.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: MindFileShareService.java */
/* loaded from: classes.dex */
public class f extends b.AbstractBinderC0757b implements com.xinzhu.overmind.server.d {
    private static f sService = new f();

    public static f get() {
        return sService;
    }

    @Override // com.xinzhu.overmind.server.os.b
    public List<MindShareFileInfo> listFiles(String str) throws RemoteException {
        File[] listFiles = new File(str).listFiles();
        ArrayList arrayList = new ArrayList();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new MindShareFileInfo(file));
            }
        }
        return arrayList;
    }

    @Override // com.xinzhu.overmind.server.os.b
    public ParcelFileDescriptor openAsParcelFile(String str) throws RemoteException {
        try {
            return ParcelFileDescriptor.open(new File(str), 268435456);
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    @Override // com.xinzhu.overmind.server.d
    public void systemReady() {
    }
}
