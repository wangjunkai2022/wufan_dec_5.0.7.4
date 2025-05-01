package com.join.mgps.Util;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.MApplication;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.mgps.dto.TipBean;
import com.join.mgps.dto.WebDiskCfgDownLoadStateBean;
import com.join.mgps.dto.WebDiskCfgSetupModelEnumBean;
import com.join.mgps.dto.WebDiskPositionBean;
import com.kwad.sdk.core.response.model.SdkConfigData;
import com.papa.sim.statistic.Event;
import com.xinzhu.overmind.Overmind;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: QuarkUtil.java */
/* loaded from: classes3.dex */
public class q1 {

    /* renamed from: a  reason: collision with root package name */
    private static WebDiskPositionBean f27990a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f27991b = "com.quark.browser";

    /* renamed from: c  reason: collision with root package name */
    public static final String f27992c = "3875871586";

    /* renamed from: d  reason: collision with root package name */
    public static final String f27993d = "2057111073";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: QuarkUtil.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f27994b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f27995c;

        a(Intent intent, int i4) {
            this.f27994b = intent;
            this.f27995c = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            Overmind.get().startActivity(this.f27994b, this.f27995c);
        }
    }

    private static void a() {
        if (f27990a == null) {
            String d5 = MApplication.f1497x.l().web_disk_position().d();
            if (g2.i(d5)) {
                f27990a = (WebDiskPositionBean) JsonMapper.getInstance().fromJson(d5, WebDiskPositionBean.class);
            }
        }
    }

    public static boolean b() {
        return MApplication.f1497x.l().ab_side().d().intValue() == 1;
    }

    public static boolean c(Context context, DownloadTask downloadTask) {
        if (downloadTask == null) {
            return false;
        }
        try {
            if (f(downloadTask.getPackageName())) {
                return MApplication.f1497x.l().isQuarkSilentDownload().d().booleanValue();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }

    public static boolean d(int i4) {
        return 134 == i4;
    }

    public static boolean e(ArrayList<TipBean> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return false;
        }
        Iterator<TipBean> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if ("134".equals(it2.next().getId())) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(String str) {
        return !TextUtils.isEmpty(str) && str.equals(f27991b);
    }

    public static boolean g() {
        return !b() || MApplication.f1497x.l().isBsideInt().d().intValue() == 2;
    }

    private static boolean h() {
        try {
            if (MApplication.f1497x.l().isQuarkEnable().d().booleanValue()) {
                return g();
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(java.util.ArrayList<com.join.mgps.dto.TipBean> r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L33
            int r1 = r4.size()
            if (r1 > 0) goto La
            goto L33
        La:
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r4.next()
            com.join.mgps.dto.TipBean r1 = (com.join.mgps.dto.TipBean) r1
            java.lang.String r2 = r1.getId()
            java.lang.String r3 = "134"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L32
            java.lang.String r1 = r1.getId()
            java.lang.String r2 = "23"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto Le
        L32:
            r0 = 1
        L33:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.q1.i(java.util.ArrayList):boolean");
    }

    public static boolean j() {
        if (MApplication.f1497x.l().quark_display_mode().d().intValue() == 0) {
            return false;
        }
        if (MApplication.f1497x.l().quark_display_mode().d().intValue() == 1) {
            return true;
        }
        DownloadTask F = p1.f.K().F(f27992c);
        if (F != null) {
            if (System.currentTimeMillis() - F.getOpenTime() > MApplication.f1497x.l().quark_display_mode().d().intValue() * SdkConfigData.DEFAULT_REQUEST_INTERVAL * 1000) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(String str, int i4) {
        if (!Overmind.getMindPackageManager().k(str).k() || com.xinzhu.overmind.plugin.b.i()) {
            Overmind.get();
            Intent j4 = Overmind.getMindPackageManager().j(str, i4);
            j4.setPackage(f27991b);
            j4.setFlags(268435456);
            MApplication.f1497x.l().has_launch_quark().g(Boolean.TRUE);
            new Thread(new a(j4, i4)).start();
            return true;
        }
        return false;
    }

    public static boolean l(String str) {
        return f27992c.equals(str) && com.join.mgps.va.overmind.d.o().O() && !MApplication.f1497x.l().has_launch_quark().d().booleanValue();
    }

    public static boolean m() {
        a();
        WebDiskPositionBean webDiskPositionBean = f27990a;
        return webDiskPositionBean != null && webDiskPositionBean.getPc_game().getDownload_mode() == WebDiskCfgDownLoadStateBean.PRIVATE_DOMAIN;
    }

    public static boolean n() {
        a();
        WebDiskPositionBean webDiskPositionBean = f27990a;
        return (webDiskPositionBean != null && webDiskPositionBean.getSimulator_game().getDownload_mode() == WebDiskCfgDownLoadStateBean.COMPLEX) && h();
    }

    public static boolean o() {
        a();
        WebDiskPositionBean webDiskPositionBean = f27990a;
        return webDiskPositionBean != null && webDiskPositionBean.getSimulator_game().getSetup_mode() == WebDiskCfgSetupModelEnumBean.VM && com.join.mgps.va.overmind.d.o().O();
    }

    public static boolean p() {
        a();
        WebDiskPositionBean webDiskPositionBean = f27990a;
        return webDiskPositionBean != null && webDiskPositionBean.getPc_game().getSetup_mode() == WebDiskCfgSetupModelEnumBean.VM && com.join.mgps.va.overmind.d.o().O();
    }

    public static boolean q() {
        a();
        WebDiskPositionBean webDiskPositionBean = f27990a;
        return (webDiskPositionBean != null && webDiskPositionBean.getSingle_game().getDownload_mode() == WebDiskCfgDownLoadStateBean.COMPLEX) && h();
    }

    public static boolean r() {
        a();
        WebDiskPositionBean webDiskPositionBean = f27990a;
        return webDiskPositionBean != null && webDiskPositionBean.getSingle_game().getSetup_mode() == WebDiskCfgSetupModelEnumBean.VM && com.join.mgps.va.overmind.d.o().O();
    }

    public static boolean s() {
        a();
        WebDiskPositionBean webDiskPositionBean = f27990a;
        return webDiskPositionBean != null && webDiskPositionBean.getPc_game().getDownload_mode() == WebDiskCfgDownLoadStateBean.WEB_DISK;
    }

    public static void t(Context context, Event event, String str, String str2) {
        com.papa.sim.statistic.p.l(context).S1(event, str, AccountUtil_.getInstance_(context).getAccountData().getUid(), str2, b() ? MApplication.f1497x.l().isBsideInt().d().intValue() : 0);
    }

    public static boolean u(String str) {
        if (f27993d.equals(str)) {
            return false;
        }
        return !(f27992c.equals(str) && l(str)) && f27992c.equals(str) && j();
    }

    public static boolean v() {
        return g();
    }
}
