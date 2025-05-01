package com.join.android.app.common.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import b2.p;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.github.snowdream.android.app.downloader.b;
import com.join.android.app.common.servcie.r;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.h0;
import com.join.mgps.Util.v;
import com.join.mgps.Util.w0;
import com.join.mgps.Util.x0;
import com.join.mgps.db.tables.EMUApkArenaTable;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dialog.PlugInstallDialog_;
import com.join.mgps.dto.ApkVersionRemarkBean;
import com.join.mgps.dto.CheckFileBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.papa.sim.statistic.Event;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PluginUtils.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final String f14892a = "PluginUtils";

    /* renamed from: b  reason: collision with root package name */
    private static String f14893b;

    /* renamed from: c  reason: collision with root package name */
    private static Context f14894c;

    /* renamed from: d  reason: collision with root package name */
    private static com.github.snowdream.android.app.downloader.b f14895d;

    /* renamed from: e  reason: collision with root package name */
    static b.InterfaceC0290b f14896e;

    /* renamed from: f  reason: collision with root package name */
    private static Map<String, com.github.snowdream.android.app.downloader.c> f14897f = new ConcurrentHashMap(0);

    /* renamed from: g  reason: collision with root package name */
    private static Map<String, EMUApkTable> f14898g = new ConcurrentHashMap(0);

    /* compiled from: PluginUtils.java */
    /* loaded from: classes3.dex */
    class a extends AsyncTask<EMUApkTable, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EMUApkTable f14899a;

        a(EMUApkTable eMUApkTable) {
            this.f14899a = eMUApkTable;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(EMUApkTable... eMUApkTableArr) {
            EMUApkTable eMUApkTable;
            try {
                eMUApkTable = this.f14899a;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (eMUApkTable != null && eMUApkTable.getDown_type() == 2) {
                String apkPath = this.f14899a.getApkPath();
                ApkVersionRemarkBean apkVersionRemarkBean = (ApkVersionRemarkBean) JsonMapper.getInstance().fromJson(this.f14899a.getRemark(), ApkVersionRemarkBean.class);
                DownloadTask Z = p1.f.K().Z(Integer.parseInt(this.f14899a.getTag_id()));
                if (apkVersionRemarkBean != null && apkVersionRemarkBean.getCheck_files() != null && apkVersionRemarkBean.getCheck_files().size() > 0) {
                    for (CheckFileBean checkFileBean : apkVersionRemarkBean.getCheck_files()) {
                        try {
                            File file = new File(apkPath + net.lingala.zip4j.util.e.F0 + checkFileBean.getFile());
                            if (!file.exists()) {
                                checkFileBean.setPreCalcCheck("");
                            } else {
                                checkFileBean.setPreCalcCheck(x0.c(file));
                            }
                            if (Z == null) {
                                checkFileBean.setPreCalcBak("");
                            } else {
                                File file2 = new File(Z.getPath() + net.lingala.zip4j.util.e.F0 + checkFileBean.getFile());
                                if (!file2.exists()) {
                                    checkFileBean.setPreCalcBak("");
                                } else {
                                    checkFileBean.setPreCalcBak(x0.c(file2));
                                }
                            }
                        } catch (NumberFormatException e6) {
                            e6.printStackTrace();
                        }
                    }
                }
                this.f14899a.setRemark(JsonMapper.toJsonString(apkVersionRemarkBean));
                p.o().m(this.f14899a);
                return null;
            }
            return null;
        }
    }

    /* compiled from: PluginUtils.java */
    /* loaded from: classes3.dex */
    class b extends AsyncTask<EMUApkArenaTable, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EMUApkArenaTable f14900a;

        b(EMUApkArenaTable eMUApkArenaTable) {
            this.f14900a = eMUApkArenaTable;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(EMUApkArenaTable... eMUApkArenaTableArr) {
            EMUApkArenaTable eMUApkArenaTable;
            try {
                eMUApkArenaTable = this.f14900a;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (eMUApkArenaTable != null && eMUApkArenaTable.getDown_type() == 2) {
                String apkPath = this.f14900a.getApkPath();
                ApkVersionRemarkBean apkVersionRemarkBean = (ApkVersionRemarkBean) JsonMapper.getInstance().fromJson(this.f14900a.getRemark(), ApkVersionRemarkBean.class);
                DownloadTask Z = p1.f.K().Z(Integer.parseInt(this.f14900a.getTag_id()));
                if (apkVersionRemarkBean != null && apkVersionRemarkBean.getCheck_files() != null && apkVersionRemarkBean.getCheck_files().size() > 0) {
                    for (CheckFileBean checkFileBean : apkVersionRemarkBean.getCheck_files()) {
                        try {
                            File file = new File(apkPath + net.lingala.zip4j.util.e.F0 + checkFileBean.getFile());
                            if (!file.exists()) {
                                checkFileBean.setPreCalcCheck("");
                            } else {
                                checkFileBean.setPreCalcCheck(x0.c(file));
                            }
                            if (Z == null) {
                                checkFileBean.setPreCalcBak("");
                            } else {
                                File file2 = new File(Z.getPath() + net.lingala.zip4j.util.e.F0 + checkFileBean.getFile());
                                if (!file2.exists()) {
                                    checkFileBean.setPreCalcBak("");
                                } else {
                                    checkFileBean.setPreCalcBak(x0.c(file2));
                                }
                            }
                        } catch (NumberFormatException e6) {
                            e6.printStackTrace();
                        }
                    }
                }
                this.f14900a.setRemark(JsonMapper.toJsonString(apkVersionRemarkBean));
                b2.o.o().m(this.f14900a);
                return null;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PluginUtils.java */
    /* loaded from: classes3.dex */
    public class c extends AsyncTask<String, Integer, String> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            try {
                String str = strArr[0];
                String str2 = strArr[1];
                String str3 = strArr[2];
                String str4 = strArr[3];
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                File[] listFiles = new File(str).listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.isDirectory() && file.getName().startsWith("o_")) {
                            file.delete();
                        }
                    }
                }
                File file2 = new File(str, "o_" + str2 + "_s_" + str3 + "_d_" + str4);
                if (!file2.getParentFile().exists()) {
                    file2.mkdirs();
                    return null;
                } else if (file2.exists()) {
                    return null;
                } else {
                    file2.mkdir();
                    return null;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PluginUtils.java */
    /* loaded from: classes3.dex */
    public class d implements b.InterfaceC0290b {
        d() {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onError(String str) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onFinish(String str) {
            int lastIndexOf;
            com.github.snowdream.android.app.downloader.c cVar = (com.github.snowdream.android.app.downloader.c) l.f14897f.get(str);
            EMUApkTable eMUApkTable = (EMUApkTable) l.f14898g.get(str);
            if (cVar == null || eMUApkTable == null) {
                return;
            }
            String str2 = "pre_" + eMUApkTable.getTag_id() + "_" + eMUApkTable.getVer();
            String str3 = v.f28107g + eMUApkTable.getTag_id() + "/roms/";
            File file = new File(str3 + str2);
            String str4 = str2 + ".zip";
            try {
                if (!TextUtils.isEmpty(eMUApkTable.getDown_url()) && (lastIndexOf = eMUApkTable.getDown_url().lastIndexOf(net.lingala.zip4j.util.e.F0)) != -1 && lastIndexOf + 1 < eMUApkTable.getDown_url().length()) {
                    str4 = eMUApkTable.getDown_url().substring(eMUApkTable.getDown_url().lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (file.isFile() && file.exists()) {
                long length = file.length();
                file.renameTo(new File(file.getParent() + net.lingala.zip4j.util.e.F0 + str4));
                DownloadTask F = p1.f.K().F(eMUApkTable.getTag_id());
                if (F != null) {
                    String path = F.getPath();
                    if (!TextUtils.isEmpty(path) && new File(path).exists()) {
                        h0.h(path, true);
                    }
                    F.setPath(str3 + str4);
                    F.setGameZipPath(str3 + str4);
                    F.setStatus(11);
                    F.setSize(length);
                    F.setVer(eMUApkTable.getVerCode() + "");
                    F.setVer_name(eMUApkTable.getVerName() + "");
                    F.setShowSize(((length / 1024) / 1024) + "");
                    p1.f.K().m(F);
                    UtilsMy.S2(F, 11);
                    r.b(l.f14894c, F, Event.gameDownload);
                    com.papa.sim.statistic.p.l(l.f14894c).f0(F.getRomType(), F.getVer() + "_" + F.getVer_name(), AccountUtil_.getInstance_(l.f14894c).getUid());
                }
                if (!l.w(eMUApkTable, false) && F != null) {
                    com.join.android.app.common.servcie.i.e().q(l.f14894c, F);
                }
            }
            l.f14897f.remove(str);
            l.f14898g.remove(str);
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onProgress(String str, int i4, String str2) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onStart(String str) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onStop(String str) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void onWait(String str) {
        }

        @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
        public void updateSize(String str, long j4) {
        }
    }

    public static boolean A(EMUApkTable eMUApkTable, boolean z4) {
        return B(eMUApkTable, z4, false);
    }

    public static boolean B(EMUApkTable eMUApkTable, boolean z4, boolean z5) {
        EMUApkTable n4;
        EMUApkArenaTable g4;
        if (eMUApkTable != null) {
            String apkPath = eMUApkTable.getApkPath();
            w0.e(f14892a, "isNeedDownloadMust  - 0");
            if (!z5 && !w(eMUApkTable, z4)) {
                if (eMUApkTable.isArena()) {
                    EMUApkTable n5 = p.o().n(eMUApkTable.getTag_id());
                    String apkPath2 = n5.getApkPath();
                    if (!TextUtils.isEmpty(apkPath2) && new File(apkPath2).exists() && n5.getDown_url().equals(eMUApkTable.getDown_url()) && !TextUtils.isEmpty(n5.getVer()) && !TextUtils.isEmpty(eMUApkTable.getVer()) && n5.getVer().equals(eMUApkTable.getVer())) {
                        w0.e(f14892a, "isNeedDownloadMust  - 2");
                        if (!k(n5, z4) && (g4 = b2.o.o().g(Integer.valueOf(eMUApkTable.getId()))) != null) {
                            g4.setApkPath(n5.getApkPath());
                            b2.o.o().update(g4);
                            return false;
                        }
                    }
                } else {
                    EMUApkTable n6 = b2.o.o().n(eMUApkTable.getTag_id());
                    String apkPath3 = n6.getApkPath();
                    if (!TextUtils.isEmpty(apkPath3) && new File(apkPath3).exists() && n6.getDown_url().equals(eMUApkTable.getDown_url()) && !TextUtils.isEmpty(n6.getVer()) && !TextUtils.isEmpty(eMUApkTable.getVer()) && n6.getVer().equals(eMUApkTable.getVer())) {
                        w0.e(f14892a, "isNeedDownloadMust  - 3");
                        if (!k(n6, z4) && (n4 = p.o().n(eMUApkTable.getTag_id())) != null) {
                            n4.setApkPath(n6.getApkPath());
                            p.o().update(n4);
                            return false;
                        }
                    }
                }
            } else {
                w0.e(f14892a, "isNeedDownloadMust  - 1");
                try {
                    if (!TextUtils.isEmpty(apkPath)) {
                        String name = new File(apkPath).getName();
                        String ver_compatible = eMUApkTable.getVer_compatible();
                        if (ver_compatible != null) {
                            try {
                                if (Integer.parseInt(g2.n(name.split("_")[0])) < Integer.parseInt(g2.n(ver_compatible.split("_")[0]))) {
                                    return true;
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                return false;
            }
        }
        return true;
    }

    public static boolean C(EMUApkTable eMUApkTable) {
        if (eMUApkTable == null || eMUApkTable.getDown_type() != 2) {
            return false;
        }
        String m4 = m(eMUApkTable);
        return !TextUtils.isEmpty(m4) && new File(m4).exists();
    }

    private static boolean D(EMUApkTable eMUApkTable) {
        if (eMUApkTable == null || eMUApkTable.getDown_type() != 2) {
            return false;
        }
        String n4 = n(eMUApkTable);
        return !TextUtils.isEmpty(n4) && new File(n4).exists();
    }

    public static void E(EMUApkArenaTable eMUApkArenaTable) {
        new b(eMUApkArenaTable).execute(eMUApkArenaTable);
    }

    public static void F(EMUApkTable eMUApkTable) {
        new a(eMUApkTable).execute(eMUApkTable);
    }

    public static void G(Context context, EMUApkTable eMUApkTable) {
        DownloadTask F;
        int lastIndexOf;
        if (eMUApkTable == null || eMUApkTable.getDown_type() != 2 || !j.k(context) || (F = p1.f.K().F(eMUApkTable.getTag_id())) == null || F.getStatus() == 11) {
            return;
        }
        if (C(eMUApkTable)) {
            String str = "pre_" + eMUApkTable.getTag_id() + "_" + eMUApkTable.getVer();
            String str2 = v.f28107g + eMUApkTable.getTag_id() + "/roms/";
            File file = new File(str2 + str + ".zip");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".zip");
            String sb2 = sb.toString();
            try {
                if (!TextUtils.isEmpty(eMUApkTable.getDown_url()) && (lastIndexOf = eMUApkTable.getDown_url().lastIndexOf(net.lingala.zip4j.util.e.F0)) != -1 && lastIndexOf + 1 < eMUApkTable.getDown_url().length()) {
                    sb2 = eMUApkTable.getDown_url().substring(eMUApkTable.getDown_url().lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (file.isFile() && file.exists()) {
                long length = file.length();
                file.renameTo(new File(file.getParent() + net.lingala.zip4j.util.e.F0 + sb2));
                String path = F.getPath();
                if (!TextUtils.isEmpty(path) && new File(path).exists()) {
                    h0.h(path, true);
                }
                F.setPath(str2 + sb2);
                F.setGameZipPath(str2 + sb2);
                F.setStatus(11);
                F.setSize(length);
                F.setVer(eMUApkTable.getVerCode() + "");
                F.setVer_name(eMUApkTable.getVerName() + "");
                F.setShowSize(((length / 1024) / 1024) + "");
                p1.f.K().m(F);
                return;
            }
            return;
        }
        String str3 = "pre_" + eMUApkTable.getTag_id() + "_" + eMUApkTable.getVer();
        String str4 = v.f28107g + eMUApkTable.getTag_id() + "/roms/";
        if (!new File(str4 + str3).exists()) {
            com.papa.sim.statistic.p.l(context).a2(F.getRomType(), eMUApkTable.getVer(), AccountUtil_.getInstance_(context).getUid());
        }
        com.github.snowdream.android.app.downloader.c cVar = new com.github.snowdream.android.app.downloader.c(eMUApkTable.getDown_url(), str3, str4, 0L);
        f14895d.b(cVar);
        if (f14897f == null || cVar.l() == null || cVar.l().equals("")) {
            return;
        }
        String l4 = cVar.l();
        if (f14897f.get(cVar.l()) != null) {
            return;
        }
        synchronized (f14897f) {
            f14897f.put(l4, cVar);
            f14898g.put(l4, eMUApkTable);
        }
    }

    public static boolean H(DownloadTask downloadTask, EMUApkArenaTable eMUApkArenaTable) {
        if (downloadTask == null) {
            return false;
        }
        if (eMUApkArenaTable == null) {
            eMUApkArenaTable = b2.o.o().g(Integer.valueOf(p.o().n(downloadTask.getPlugin_num()).getId()));
        }
        if (!TextUtils.isEmpty(downloadTask.getGameZipPath()) && new File(downloadTask.getGameZipPath()).exists() && downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.chajian.name()) && downloadTask.getDown_type() == 2 && eMUApkArenaTable.getDown_type() == 2 && (TextUtils.isEmpty(eMUApkArenaTable.getApkPath()) || !new File(eMUApkArenaTable.getApkPath()).exists())) {
            if (new File(downloadTask.getGameZipPath()).isDirectory()) {
                eMUApkArenaTable.setApkPath(h(downloadTask.getPlugin_num(), new File(downloadTask.getGameZipPath())));
                b2.o.o().update(eMUApkArenaTable);
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean I(Context context, DownloadTask downloadTask, EMUApkTable eMUApkTable) {
        if (downloadTask == null) {
            return false;
        }
        w0.e(f14892a, "restoreEmuApkSo called " + downloadTask.getPlugin_num() + " " + downloadTask.getShowName());
        if (eMUApkTable == null) {
            eMUApkTable = p.o().n(downloadTask.getPlugin_num());
        }
        if (!TextUtils.isEmpty(downloadTask.getGameZipPath()) && new File(downloadTask.getGameZipPath()).exists() && downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.chajian.name()) && downloadTask.getDown_type() == 2 && eMUApkTable.getDown_type() == 2) {
            if (downloadTask.getStatus() == 5 && new File(downloadTask.getGameZipPath()).isDirectory() && (TextUtils.isEmpty(eMUApkTable.getApkPath()) || !new File(eMUApkTable.getApkPath()).exists())) {
                eMUApkTable.setApkPath(h(downloadTask.getPlugin_num(), new File(downloadTask.getGameZipPath())));
                p.o().update(eMUApkTable);
            } else if (downloadTask.getStatus() == 11) {
                if (!TextUtils.isEmpty(eMUApkTable.getApkPath()) && new File(eMUApkTable.getApkPath()).exists()) {
                    PlugInstallDialog_.k0(context).c(eMUApkTable).start();
                }
                com.join.android.app.common.servcie.i.e().q(context, downloadTask);
            }
            w0.e(f14892a, "restoreEmuApkSo finished");
            return true;
        }
        w0.e(f14892a, "restoreEmuApkSo don't need restore");
        return false;
    }

    public static void delete(String str) {
        h0.h(f14893b + str + net.lingala.zip4j.util.e.F0, false);
    }

    public static void e(EMUApkTable eMUApkTable, DownloadTask downloadTask) {
        int lastIndexOf;
        if (C(eMUApkTable)) {
            String str = "pre_" + eMUApkTable.getTag_id() + "_" + eMUApkTable.getVer();
            String str2 = v.f28107g + eMUApkTable.getTag_id() + "/roms/";
            File file = new File(str2 + str + ".zip");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".zip");
            String sb2 = sb.toString();
            try {
                if (!TextUtils.isEmpty(eMUApkTable.getDown_url()) && (lastIndexOf = eMUApkTable.getDown_url().lastIndexOf(net.lingala.zip4j.util.e.F0)) != -1 && lastIndexOf + 1 < eMUApkTable.getDown_url().length()) {
                    sb2 = eMUApkTable.getDown_url().substring(eMUApkTable.getDown_url().lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (file.isFile() && file.exists()) {
                f14895d.c(eMUApkTable.getDown_url());
                f14895d.l(eMUApkTable.getDown_url());
                f14897f.remove(eMUApkTable.getDown_url());
                f14898g.remove(eMUApkTable.getDown_url());
                long length = file.length();
                file.renameTo(new File(file.getParent() + net.lingala.zip4j.util.e.F0 + sb2));
                if (downloadTask != null) {
                    String path = downloadTask.getPath();
                    if (!TextUtils.isEmpty(path) && new File(path).exists()) {
                        h0.h(path, true);
                    }
                    downloadTask.setPath(str2 + sb2);
                    downloadTask.setGameZipPath(str2 + sb2);
                    downloadTask.setStatus(11);
                    downloadTask.setSize(length);
                    downloadTask.setVer(eMUApkTable.getVerCode() + "");
                    downloadTask.setVer_name(eMUApkTable.getVerName() + "");
                    downloadTask.setShowSize(((length / 1024) / 1024) + "");
                    p1.f.K().m(downloadTask);
                    g(eMUApkTable);
                    if (t(f14894c, eMUApkTable, false, new String[0])) {
                        return;
                    }
                    com.join.android.app.common.servcie.i.e().q(f14894c, downloadTask);
                }
            }
        } else if (D(eMUApkTable)) {
            f(eMUApkTable, downloadTask);
        } else {
            g(eMUApkTable);
            String m4 = m(eMUApkTable);
            if (TextUtils.isEmpty(m4)) {
                return;
            }
            File file2 = new File(m4);
            if (file2.exists()) {
                file2.delete();
            } else if (m4.endsWith(".zip")) {
                File file3 = new File(m4.substring(0, m4.lastIndexOf(".zip")));
                if (file3.exists()) {
                    file3.delete();
                }
            }
        }
    }

    private static boolean f(EMUApkTable eMUApkTable, DownloadTask downloadTask) {
        String str = "pre_" + eMUApkTable.getTag_id() + "_" + eMUApkTable.getVer();
        String str2 = v.f28107g + eMUApkTable.getTag_id() + "/roms/";
        File file = new File(str2 + str);
        if (file.isFile()) {
            long length = file.length();
            com.github.snowdream.android.app.downloader.c cVar = f14897f.get(eMUApkTable.getDown_url());
            if (cVar != null) {
                length = cVar.g();
            }
            f14895d.c(eMUApkTable.getDown_url());
            f14895d.l(eMUApkTable.getDown_url());
            f14897f.remove(eMUApkTable.getDown_url());
            f14898g.remove(eMUApkTable.getDown_url());
            try {
                if (!TextUtils.isEmpty(eMUApkTable.getDown_url())) {
                    str = eMUApkTable.getDown_url().substring(eMUApkTable.getDown_url().lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            file.renameTo(new File(file.getParent() + net.lingala.zip4j.util.e.F0 + str));
            if (downloadTask != null) {
                String path = downloadTask.getPath();
                if (!TextUtils.isEmpty(path) && new File(path).exists()) {
                    h0.h(path, true);
                }
                downloadTask.setPath(str2 + str);
                downloadTask.setGameZipPath(str2 + str);
                downloadTask.setStatus(2);
                downloadTask.setSize(0L);
                downloadTask.setProgress(0L);
                downloadTask.setVer(eMUApkTable.getVerCode() + "");
                downloadTask.setVer_name(eMUApkTable.getVerName() + "");
                downloadTask.setShowSize(((length / 1024) / 1024) + "");
                p1.f.K().m(downloadTask);
                g(eMUApkTable);
            }
            return true;
        }
        return false;
    }

    private static void g(EMUApkTable eMUApkTable) {
        com.github.snowdream.android.app.downloader.b bVar = f14895d;
        if (bVar == null || eMUApkTable == null) {
            return;
        }
        bVar.c(eMUApkTable.getDown_url());
        f14895d.l(eMUApkTable.getDown_url());
        f14897f.remove(eMUApkTable.getDown_url());
        f14898g.remove(eMUApkTable.getDown_url());
    }

    public static String h(String str, File file) {
        String str2 = f14893b + str + net.lingala.zip4j.util.e.F0;
        if (file == null || !file.exists()) {
            return str2;
        }
        h0.h(str2, false);
        h0.e(file.getPath(), str2);
        return str2 + file.getName().replace(".zip", "");
    }

    public static boolean i(EMUApkTable eMUApkTable) {
        try {
            if (C(eMUApkTable)) {
                e(eMUApkTable, p1.f.K().Z(Integer.parseInt(eMUApkTable.getTag_id())));
            }
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
        return D(eMUApkTable) || C(eMUApkTable);
    }

    public static boolean j(EMUApkTable eMUApkTable) {
        return k(eMUApkTable, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x02f8 A[Catch: NumberFormatException -> 0x0287, TryCatch #2 {NumberFormatException -> 0x0287, blocks: (B:108:0x027c, B:110:0x0282, B:118:0x0296, B:130:0x02d9, B:132:0x02df, B:134:0x02e5, B:136:0x02eb, B:139:0x02f3, B:141:0x02f8, B:143:0x0302, B:144:0x030f), top: B:206:0x027c }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0346 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean k(com.join.mgps.db.tables.EMUApkTable r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.utils.l.k(com.join.mgps.db.tables.EMUApkTable, boolean):boolean");
    }

    public static int l(String str, int i4) {
        if (TextUtils.isEmpty(str) && (str.equals("35") || str.equals("31") || str.equals("33"))) {
            return 2;
        }
        return i4;
    }

    private static String m(EMUApkTable eMUApkTable) {
        return n(eMUApkTable) + ".zip";
    }

    private static String n(EMUApkTable eMUApkTable) {
        if (eMUApkTable == null) {
            return "";
        }
        String str = "pre_" + eMUApkTable.getTag_id() + "_" + eMUApkTable.getVer();
        return (v.f28107g + eMUApkTable.getTag_id() + "/roms/") + str;
    }

    public static void o(Context context) {
        f14894c = context;
        f14893b = context.getDir("jniLibs", 0).getAbsolutePath() + net.lingala.zip4j.util.e.F0;
        if (!new File(f14893b).exists()) {
            new File(f14893b).mkdir();
        }
        p();
    }

    public static void p() {
        f14895d = com.github.snowdream.android.app.downloader.b.e();
        d dVar = new d();
        f14896e = dVar;
        f14895d.m(dVar);
    }

    public static boolean q(EMUApkTable eMUApkTable) {
        if (eMUApkTable != null) {
            if (!v(eMUApkTable)) {
                return true;
            }
            String apkPath = eMUApkTable.getApkPath();
            if (!TextUtils.isEmpty(apkPath)) {
                File file = new File(apkPath);
                if (file.exists()) {
                    String name = file.getName();
                    String ver = eMUApkTable.getVer();
                    if (ver != null) {
                        try {
                            if (Integer.parseInt(name.split("_")[0]) < Integer.parseInt(ver.split("_")[0])) {
                                return true;
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean r(Context context, DownloadTask downloadTask, boolean z4, String... strArr) {
        String str;
        EMUApkTable n4 = (downloadTask == null || !downloadTask.getFileType().equals(Dtype.chajian.name())) ? null : p.o().n(downloadTask.getPlugin_num());
        if (n4 == null) {
            str = "";
        } else if (n4.getDown_type() == 2) {
            return v(n4);
        } else {
            str = n4.getPackage_name();
        }
        if (TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            str = strArr[0];
        }
        return e.l0(context).d(context, str);
    }

    public static boolean s(Context context, DownloadTask downloadTask, String... strArr) {
        return r(context, downloadTask, true, strArr);
    }

    public static boolean t(Context context, EMUApkTable eMUApkTable, boolean z4, String... strArr) {
        String str;
        if (eMUApkTable == null) {
            str = "";
        } else if (eMUApkTable.getDown_type() == 2) {
            return w(eMUApkTable, z4);
        } else {
            str = eMUApkTable.getPackage_name();
        }
        if (TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            str = strArr[0];
        }
        return e.l0(context).d(context, str);
    }

    public static boolean u(Context context, EMUApkTable eMUApkTable, String... strArr) {
        return t(context, eMUApkTable, true, strArr);
    }

    private static boolean v(EMUApkTable eMUApkTable) {
        return w(eMUApkTable, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean w(EMUApkTable eMUApkTable, boolean z4) {
        DownloadTask Z;
        EMUApkTable n4;
        EMUApkArenaTable g4;
        w0.e(f14892a, "isInstalled  called");
        if (eMUApkTable != null) {
            String apkPath = eMUApkTable.getApkPath();
            if ((TextUtils.isEmpty(apkPath) || !new File(apkPath).exists()) && (Z = p1.f.K().Z(Integer.parseInt(eMUApkTable.getTag_id()))) != null && Z.getDown_type() == 2 && ConstantIntEnum.PS2.value() != Integer.parseInt(Z.getPlugin_num()) && !TextUtils.isEmpty(Z.getGameZipPath()) && new File(Z.getGameZipPath()).exists()) {
                I(f14894c, Z, eMUApkTable);
            }
            if (TextUtils.isEmpty(apkPath)) {
                File file = new File(f14893b + eMUApkTable.getTag_id());
                if (file.exists() && file.list().length > 0) {
                    apkPath = file.getAbsolutePath() + net.lingala.zip4j.util.e.F0 + file.list()[0];
                    EMUApkTable n5 = p.o().n(eMUApkTable.getTag_id());
                    w0.e(f14892a, "isInstalled  - retrieve path " + apkPath);
                    n5.setApkPath(apkPath);
                    p.o().update(n5);
                }
            }
            if (!TextUtils.isEmpty(apkPath) && new File(apkPath).exists()) {
                w0.e(f14892a, "isInstalled  - checking file corrupt");
                return !k(eMUApkTable, z4);
            } else if (eMUApkTable.isArena()) {
                EMUApkTable n6 = p.o().n(eMUApkTable.getTag_id());
                String apkPath2 = n6.getApkPath();
                if (!TextUtils.isEmpty(apkPath2) && new File(apkPath2).exists() && n6.getDown_url().equals(eMUApkTable.getDown_url())) {
                    w0.e(f14892a, "isInstalled  - recovery from arena, checking file");
                    if (!k(eMUApkTable, z4) && (g4 = b2.o.o().g(Integer.valueOf(eMUApkTable.getId()))) != null) {
                        g4.setApkPath(n6.getApkPath());
                        b2.o.o().update(g4);
                        w0.e(f14892a, "isInstalled  - recovery from arena");
                        return true;
                    }
                }
            } else {
                EMUApkTable n7 = b2.o.o().n(eMUApkTable.getTag_id());
                String apkPath3 = n7.getApkPath();
                if (!TextUtils.isEmpty(apkPath3) && new File(apkPath3).exists() && n7.getDown_url().equals(eMUApkTable.getDown_url())) {
                    w0.e(f14892a, "isInstalled  - recovery from emu, checking file");
                    if (!k(eMUApkTable, z4) && (n4 = p.o().n(eMUApkTable.getTag_id())) != null) {
                        n4.setApkPath(n7.getApkPath());
                        p.o().update(n4);
                        w0.e(f14892a, "isInstalled  - recovery from emu");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean x(EMUApkTable eMUApkTable) {
        return y(eMUApkTable, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean y(com.join.mgps.db.tables.EMUApkTable r4, boolean r5) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.android.app.common.utils.l.y(com.join.mgps.db.tables.EMUApkTable, boolean):boolean");
    }

    public static boolean z(EMUApkTable eMUApkTable) {
        return A(eMUApkTable, true);
    }
}
