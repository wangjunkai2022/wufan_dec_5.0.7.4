package com.xinzhu.overmind.plugin;

import android.app.ActivityManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.frameworks.d;
import com.xinzhu.overmind.plugin.a;
import com.xinzhu.overmind.server.os.MindShareFileInfo;
import com.xinzhu.overmind.server.pm.MindPackageSettings;
import com.xinzhu.overmind.utils.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public class MindPluginMonitor extends ContentProvider {

    /* renamed from: c  reason: collision with root package name */
    private static final String f67826c = MindPluginMonitor.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private Binder f67827b;

    /* loaded from: classes6.dex */
    class a extends a.b {
        a() {
        }

        private boolean isFileAccessible(File file) {
            try {
                if (file.exists()) {
                    new FileInputStream(file).close();
                    return true;
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // com.xinzhu.overmind.plugin.a
        public MindShareFileInfo checkFile(String str) throws RemoteException {
            return new MindShareFileInfo(new File(str));
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void copyDir(String str, String str2) throws RemoteException {
            String str3 = MindPluginMonitor.f67826c;
            com.xinzhu.overmind.b.a(str3, "copyDir from :" + str + " to :" + str2);
            d.c().b(str, str2);
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void copyFile(String str, String str2) throws RemoteException {
            String str3 = MindPluginMonitor.f67826c;
            com.xinzhu.overmind.b.a(str3, "copyFile from :" + str + " to :" + str2);
            d.c().a(str, str2);
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void deleteAllPackages() throws RemoteException {
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void deleteFileOrDir(String str) throws RemoteException {
            k.k(str);
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void deletePackage(String str, int i4) throws RemoteException {
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void finishPlugin() throws RemoteException {
        }

        @Override // com.xinzhu.overmind.plugin.a
        public List<ActivityManager.RecentTaskInfo> getRecentTasks(int i4, int i5) throws RemoteException {
            return ((ActivityManager) Overmind.getContext().getSystemService(TTDownloadField.TT_ACTIVITY)).getRecentTasks(i4, i5);
        }

        @Override // com.xinzhu.overmind.plugin.a
        public List<ActivityManager.RunningAppProcessInfo> getRunningAppProcesses() throws RemoteException {
            return ((ActivityManager) Overmind.getContext().getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningAppProcesses();
        }

        @Override // com.xinzhu.overmind.plugin.a
        public int initWorks() throws RemoteException {
            com.xinzhu.overmind.b.c(MindPluginMonitor.f67826c, "MindPluginMonitor encureConnected");
            return 0;
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void killProcess(int i4) throws RemoteException {
            Process.killProcess(i4);
        }

        @Override // com.xinzhu.overmind.plugin.a
        public List<MindShareFileInfo> listFiles(String str) throws RemoteException {
            ArrayList arrayList = new ArrayList();
            File[] listFiles = new File(str).listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file : listFiles) {
                    arrayList.add(new MindShareFileInfo(file));
                }
            }
            return arrayList;
        }

        @Override // com.xinzhu.overmind.plugin.a
        public ParcelFileDescriptor openAsParcelFile(String str) throws RemoteException {
            try {
                return ParcelFileDescriptor.open(new File(str), 268435456);
            } catch (FileNotFoundException e5) {
                e5.printStackTrace();
                return null;
            }
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void syncAllPackages() throws RemoteException {
            File[] listFiles;
            boolean z4;
            try {
                com.xinzhu.overmind.b.c(MindPluginMonitor.f67826c, "syncAllPackages invoked " + Overmind.getHostPkg() + " " + com.xinzhu.overmind.a.i().getAbsolutePath());
                List<MindShareFileInfo> e5 = d.c().e(com.xinzhu.overmind.a.h().getAbsolutePath());
                if (com.xinzhu.overmind.a.i().listFiles() != null) {
                    for (File file : com.xinzhu.overmind.a.i().listFiles()) {
                        if (e5 == null || e5.isEmpty()) {
                            z4 = false;
                        } else {
                            z4 = false;
                            for (MindShareFileInfo mindShareFileInfo : e5) {
                                if (file.getName().equals(new File(mindShareFileInfo.f68016b).getName())) {
                                    z4 = true;
                                }
                            }
                        }
                        if (!z4) {
                            k.j(file);
                            com.xinzhu.overmind.b.c(MindPluginMonitor.f67826c, "syncAllPackages delete unexist package " + file.getName());
                        }
                    }
                }
                if (e5 == null || e5.isEmpty()) {
                    return;
                }
                for (MindShareFileInfo mindShareFileInfo2 : e5) {
                    String name = new File(mindShareFileInfo2.f68016b).getName();
                    MindPackageSettings k4 = Overmind.getMindPackageManager().k(name);
                    if (k4 != null && k4.s()) {
                        File e6 = com.xinzhu.overmind.a.e(name);
                        if (!e6.exists()) {
                            com.xinzhu.overmind.b.c(MindPluginMonitor.f67826c, "syncAllPackages copy package " + name);
                            d.c().b(mindShareFileInfo2.f68016b, e6.getAbsolutePath());
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // com.xinzhu.overmind.plugin.a
        public void syncPackage(String str, int i4) throws RemoteException {
            try {
                String str2 = MindPluginMonitor.f67826c;
                com.xinzhu.overmind.b.c(str2, "syncPackage invoked " + str + " " + i4);
                k.j(com.xinzhu.overmind.a.e(str));
                d.c().b(com.xinzhu.overmind.a.d(str).getAbsolutePath(), com.xinzhu.overmind.a.e(str).getAbsolutePath());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // android.content.ContentProvider
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        if (str.equals("init")) {
            Bundle bundle2 = new Bundle();
            com.xinzhu.overmind.utils.helpers.d.d(bundle2, "PluginMonitor", this.f67827b);
            return bundle2;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f67827b = new a();
        return true;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        return 0;
    }
}
