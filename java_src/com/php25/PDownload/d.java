package com.php25.PDownload;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.MApplication;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.servcie.i;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.d1;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.v;
import com.join.mgps.activity.GprsNoticeDialogAlphActivity_;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.SingleGameModInfoBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.dto.TipNew;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.event.k;
import com.join.mgps.service.CommonService_;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: DownloadTool.java */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f59642a = "com.php25.PDownload.d";

    /* compiled from: DownloadTool.java */
    /* loaded from: classes5.dex */
    class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f59643b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f59644c;

        a(DownloadTask downloadTask, Context context) {
            this.f59643b = downloadTask;
            this.f59644c = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
            d.c(this.f59643b, this.f59644c);
        }
    }

    public static void a(DownloadTask downloadTask) {
        try {
            if (!g(MApplication.f1497x)) {
                UtilsMy.Q3(MApplication.f1497x);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        UtilsMy.G3(MApplication.f1497x, downloadTask, 7);
        org.greenrobot.eventbus.c.f().o(new k(downloadTask, 16));
    }

    public static void b(DownloadTask downloadTask) {
        org.greenrobot.eventbus.c.f().o(new k(downloadTask, 17));
    }

    public static void c(DownloadTask downloadTask, Context context) {
        if (g2.h(v.f28104d) || v.f28104d.equals(Environment.getExternalStorageDirectory().getAbsolutePath())) {
            v.e(context);
        }
        TipNew sp_tag_info = downloadTask.getSp_tag_info();
        if (sp_tag_info != null && sp_tag_info.getCoin() != null) {
            ((CommonService_.h2) CommonService_.S2(context).extra("checkcoin", downloadTask)).a();
        } else {
            e(downloadTask, context);
        }
    }

    public static void d(DownloadTask downloadTask, Context context) {
        new a(downloadTask, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(com.github.snowdream.android.app.downloader.DownloadTask r5, android.content.Context r6) {
        /*
            h(r5)
            boolean r0 = com.join.android.app.common.utils.j.k(r6)
            if (r0 == 0) goto L26
            java.lang.String r0 = r5.getFileType()     // Catch: java.lang.Exception -> L1d
            com.join.mgps.enums.Dtype r1 = com.join.mgps.enums.Dtype.apk     // Catch: java.lang.Exception -> L1d
            java.lang.String r1 = r1.name()     // Catch: java.lang.Exception -> L1d
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L1d
            if (r0 == 0) goto L21
            com.join.mgps.Util.UtilsMy.T(r6, r5)     // Catch: java.lang.Exception -> L1d
            goto L21
        L1d:
            r0 = move-exception
            r0.printStackTrace()
        L21:
            f(r5, r6)
            goto Le4
        L26:
            boolean r0 = com.join.android.app.common.utils.j.i(r6)
            if (r0 == 0) goto Ld2
            com.join.mgps.pref.PrefDef_ r0 = new com.join.mgps.pref.PrefDef_
            r0.<init>(r6)
            org.androidannotations.api.sharedpreferences.i r0 = r0.gprsNoticeInfo()
            java.lang.Object r0 = r0.d()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 0
            com.join.mgps.enums.Dtype r2 = com.join.mgps.enums.Dtype.chajian
            java.lang.String r2 = r2.name()
            java.lang.String r3 = r5.getFileType()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L58
            java.lang.String r1 = r5.getRomType()
            com.join.mgps.db.tables.EMUApkTable r1 = com.join.mgps.Util.UtilsMy.k0(r6, r1)
        L58:
            r2 = 1120403456(0x42c80000, float:100.0)
            java.lang.String r3 = r5.getShowSize()     // Catch: java.lang.Exception -> L71
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Exception -> L71
            if (r1 != 0) goto L65
            goto L77
        L65:
            java.lang.String r4 = r1.getSize()     // Catch: java.lang.Exception -> L6f
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.Exception -> L6f
            float r3 = r3 + r4
            goto L77
        L6f:
            r4 = move-exception
            goto L74
        L71:
            r4 = move-exception
            r3 = 1120403456(0x42c80000, float:100.0)
        L74:
            r4.printStackTrace()
        L77:
            if (r0 == 0) goto Lcc
            r4 = 1
            if (r0 == r4) goto Lb7
            r4 = 2
            if (r0 == r4) goto La2
            r4 = 3
            if (r0 == r4) goto L8f
            r2 = 4
            if (r0 == r2) goto L86
            goto Le4
        L86:
            f(r5, r6)
            if (r1 == 0) goto Le4
            com.join.mgps.Util.UtilsMy.r1(r1, r6)
            goto Le4
        L8f:
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L9c
            f(r5, r6)
            if (r1 == 0) goto Le4
            com.join.mgps.Util.UtilsMy.r1(r1, r6)
            goto Le4
        L9c:
            java.lang.String r0 = "下载内容大于100M，确认使用流量下载吗？"
            k(r5, r0, r6, r1)
            goto Le4
        La2:
            r0 = 1112014848(0x42480000, float:50.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lb1
            f(r5, r6)
            if (r1 == 0) goto Le4
            com.join.mgps.Util.UtilsMy.r1(r1, r6)
            goto Le4
        Lb1:
            java.lang.String r0 = "下载内容大于50M，确认使用流量下载吗？"
            k(r5, r0, r6, r1)
            goto Le4
        Lb7:
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lc6
            f(r5, r6)
            if (r1 == 0) goto Le4
            com.join.mgps.Util.UtilsMy.r1(r1, r6)
            goto Le4
        Lc6:
            java.lang.String r0 = "下载内容大于30M，确认使用流量下载吗？"
            k(r5, r0, r6, r1)
            goto Le4
        Lcc:
            java.lang.String r0 = "下载任务将使用数据流量，确认下载吗？"
            k(r5, r0, r6, r1)
            goto Le4
        Ld2:
            boolean r0 = com.join.android.app.common.utils.j.j(r6)
            if (r0 != 0) goto Le1
            f(r5, r6)
            java.lang.String r5 = "无网络连接"
            com.papa91.arc.ext.ToastManager.show(r5)
            goto Le4
        Le1:
            f(r5, r6)
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.php25.PDownload.d.e(com.github.snowdream.android.app.downloader.DownloadTask, android.content.Context):void");
    }

    public static void f(DownloadTask downloadTask, Context context) {
        if (!g(context)) {
            UtilsMy.Q3(context);
        }
        org.greenrobot.eventbus.c.f().o(new k(downloadTask, 14));
    }

    public static boolean g(Context context) {
        try {
            if (d1.b(context) < 26 || Build.VERSION.SDK_INT < 26) {
                ArrayList arrayList = (ArrayList) ((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningServices(100);
                if (arrayList != null && arrayList.size() > 0) {
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        if (((ActivityManager.RunningServiceInfo) arrayList.get(i4)).service.getClassName().toString().equals("com.join.android.app.common.servcie.DownloadService_")) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static void h(DownloadTask downloadTask) {
        ModInfoBean modInfoBean;
        try {
            boolean z4 = false;
            if (((TextUtils.isEmpty(downloadTask.getPlugin_num()) || !g2.j(downloadTask.getPlugin_num())) ? 0 : Integer.parseInt(downloadTask.getPlugin_num())) == ConstantIntEnum.MGAME.value()) {
                if (g2.i(downloadTask.getMod_info()) && (modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class)) != null && (z4 = downloadTask.getCrc_link_type_val().equals(modInfoBean.getMod_game_id()))) {
                    downloadTask.setResource_url_remote(modInfoBean.getDown_url());
                    Dtype dtype = Dtype.MOD;
                    downloadTask.setFileType(dtype.name());
                    downloadTask.setRomType(dtype.name());
                }
                if (!z4) {
                    SingleGameModInfoBean singleGameModInfoBean = (SingleGameModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getSingle_game_mod_info(), SingleGameModInfoBean.class);
                    if (g2.i(downloadTask.getSingle_game_mod_info()) && singleGameModInfoBean != null) {
                        downloadTask.setResource_url_remote(singleGameModInfoBean.getDownUrl());
                    }
                    Dtype dtype2 = Dtype.android;
                    downloadTask.setFileType(dtype2.name());
                    downloadTask.setRomType(dtype2.name());
                }
            }
            if (downloadTask.getTipBeans() != null) {
                Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
                while (it2.hasNext()) {
                    TipBean next = it2.next();
                    String id = next.getId();
                    if (id.equals(ConstantIntEnum.DATA.value() + "")) {
                        downloadTask.setRomType(Dtype.androiddata.name());
                    } else {
                        String id2 = next.getId();
                        if (id2.equals(ConstantIntEnum.OBB.value() + "")) {
                            downloadTask.setRomType(Dtype.androidobb.name());
                        }
                    }
                    String id3 = next.getId();
                    if (id3.equals(ConstantIntEnum.OBBDATA.value() + "")) {
                        downloadTask.setRomType(Dtype.androidobbdata.name());
                        return;
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void i(DownloadTask downloadTask) {
        try {
            if (!g(MApplication.f1497x)) {
                UtilsMy.Q3(MApplication.f1497x);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        org.greenrobot.eventbus.c.f().o(new k(downloadTask, 15));
    }

    public static double j(String str, long j4) {
        File file = new File(str);
        if (!file.exists() || j4 == 0) {
            return 0.0d;
        }
        return (file.length() * 100) / j4;
    }

    private static void k(DownloadTask downloadTask, String str, Context context, EMUApkTable eMUApkTable) {
        ((GprsNoticeDialogAlphActivity_.c) GprsNoticeDialogAlphActivity_.i0(context).b(downloadTask).flags(268435456)).d(str).a(eMUApkTable).start();
    }

    public static void l(Context context, DownloadTask downloadTask) {
        if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.apk.name())) {
            i.e().r(context, downloadTask, true);
        } else if (downloadTask.getFileType() != null && downloadTask.getDown_type() == 2 && downloadTask.getFileType().equals(Dtype.chajian.name())) {
            i.e().q(context, downloadTask);
        } else if (ConstantIntEnum.PS2.value() == Integer.parseInt(downloadTask.getPlugin_num())) {
            i.e().q(context, downloadTask);
        } else {
            i.e().r(context, downloadTask, false);
        }
    }
}
