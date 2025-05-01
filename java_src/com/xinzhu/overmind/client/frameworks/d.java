package com.xinzhu.overmind.client.frameworks;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.server.os.MindShareFileInfo;
import com.xinzhu.overmind.server.os.b;
import com.xinzhu.overmind.utils.k;
import java.io.File;
import java.util.List;
/* compiled from: MindFileShare.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static final String f67552b = "d";

    /* renamed from: c  reason: collision with root package name */
    private static d f67553c = new d();

    /* renamed from: a  reason: collision with root package name */
    private com.xinzhu.overmind.server.os.b f67554a;

    public static d c() {
        return f67553c;
    }

    private com.xinzhu.overmind.server.os.b d() {
        com.xinzhu.overmind.server.os.b bVar = this.f67554a;
        if (bVar != null && bVar.asBinder().isBinderAlive()) {
            return this.f67554a;
        }
        this.f67554a = b.AbstractBinderC0757b.asInterface(Overmind.get().getService(com.xinzhu.overmind.server.i.f67997i));
        return d();
    }

    public void a(String str, String str2) {
        try {
            k.p(new File(str2).getParentFile());
            ParcelFileDescriptor f5 = f(str);
            if (f5 != null) {
                ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(f5);
                k.e(autoCloseInputStream, new File(str2));
                autoCloseInputStream.close();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void b(String str, String str2) {
        try {
            List<MindShareFileInfo> e5 = e(str);
            if (e5 != null && !e5.isEmpty()) {
                k.p(new File(str2));
                for (MindShareFileInfo mindShareFileInfo : e5) {
                    File file = new File(mindShareFileInfo.f68016b);
                    File file2 = new File(str2, file.getName());
                    if (mindShareFileInfo.f68018d.booleanValue()) {
                        if (!file.getName().equals("oat")) {
                            b(mindShareFileInfo.f68016b, file2.getAbsolutePath());
                        }
                    } else {
                        a(mindShareFileInfo.f68016b, file2.getAbsolutePath());
                    }
                }
                return;
            }
            com.xinzhu.overmind.b.c(f67552b, "copyDirectory get empty file list");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public List<MindShareFileInfo> e(String str) {
        try {
            return d().listFiles(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public ParcelFileDescriptor f(String str) {
        try {
            return d().openAsParcelFile(str);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
