package com.join.mgps.pref;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.efs.sdk.base.core.util.PackageUtil;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.v;
import com.join.mgps.activity.login.LoginCfgsBean;
import com.join.mgps.dto.DownloadCfg;
import com.join.mgps.dto.HomeViewSwich;
import com.papa.sim.statistic.JsonMapper;
/* compiled from: PrefUtil.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    static h f53654c;

    /* renamed from: a  reason: collision with root package name */
    SharedPreferences f53655a;

    /* renamed from: b  reason: collision with root package name */
    Context f53656b;

    private h(Context context) {
        this.f53656b = context;
        this.f53655a = context.getSharedPreferences("Papa_Stat_SharedPreferences", 0);
    }

    public static h n(Context context) {
        if (f53654c == null) {
            f53654c = new h(context);
        }
        return f53654c;
    }

    public boolean A() {
        return this.f53655a.getBoolean("refreshForumIndexWhenResume", false);
    }

    public String B() {
        return this.f53655a.getString("RequestHeaders", "");
    }

    public boolean C() {
        return this.f53655a.getBoolean("ShowDialogNewGBAPlug", false);
    }

    public boolean D() {
        return this.f53655a.getBoolean("showForumLabelTip", true);
    }

    public boolean E() {
        return this.f53655a.getBoolean("showPostHelpCoastTip", true);
    }

    public String F() {
        return this.f53655a.getString("StartGameGuessLikeNoDataList", "");
    }

    public String G() {
        return this.f53655a.getString("statisticVisit", "0");
    }

    public String H() {
        return this.f53655a.getString("papauuidkey", "");
    }

    public long I() {
        return this.f53655a.getLong("firstInstall36Time", 0L);
    }

    public LoginCfgsBean J() {
        LoginCfgsBean loginCfgsBean = new LoginCfgsBean();
        try {
            String string = this.f53655a.getString("loginCfgs", "");
            return g2.i(string) ? (LoginCfgsBean) JsonMapper.e().fromJson(string, LoginCfgsBean.class) : loginCfgsBean;
        } catch (Exception e5) {
            e5.printStackTrace();
            return loginCfgsBean;
        }
    }

    public String K() {
        return this.f53655a.getString("shareGameTimeAndTimes", "");
    }

    public boolean L() {
        return this.f53655a.getBoolean("actived", false);
    }

    public void M(LoginCfgsBean loginCfgsBean) {
        if (loginCfgsBean != null) {
            String json = JsonMapper.e().toJson(loginCfgsBean);
            SharedPreferences.Editor edit = this.f53655a.edit();
            edit.putString("loginCfgs", json);
            edit.commit();
        }
    }

    public void N(HomeViewSwich homeViewSwich) {
        if (homeViewSwich != null) {
            String json = JsonMapper.e().toJson(homeViewSwich);
            SharedPreferences.Editor edit = this.f53655a.edit();
            edit.putString("wufunPlugsdata", json);
            edit.commit();
        }
    }

    public void O(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("actived", z4);
        edit.commit();
    }

    public void P(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("autoPlayVideoOnWifi", z4);
        edit.commit();
    }

    public void Q(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("baiduAdData", str);
        edit.commit();
    }

    public void R(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("DNSHttpUrl", str);
        edit.commit();
    }

    public void S(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("dailyReward", str);
        edit.commit();
    }

    public void T(int i4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putInt("DefautVideoPlayType", i4);
        edit.commit();
    }

    public void U(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("DownZipNoticeIsShow", z4);
        edit.commit();
    }

    public void V(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString(TTDownloadField.TT_DOWNLOAD_PATH, str);
        edit.commit();
        v.f28105e = str;
    }

    public void W(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("downloadPathAPKROM", str);
        edit.commit();
    }

    public void X(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("EmuApkTableList", str);
        edit.commit();
    }

    public void Y(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("everdayLogin", str);
        edit.commit();
    }

    public void Z(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("firstSetUserIcon", z4);
        edit.commit();
    }

    public boolean a() {
        return this.f53655a.getBoolean("autoPlayVideoOnWifi", true);
    }

    public void a0(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("firstSetUserIcon", z4);
        edit.commit();
    }

    public String b() {
        return this.f53655a.getString("baiduAdData", "");
    }

    public void b0(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("statisticGameList", str);
        edit.commit();
    }

    public String c() {
        return this.f53655a.getString("DNSHttpUrl", "");
    }

    public void c0(com.papa.sim.statistic.pref.a aVar) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        if (aVar == null) {
            edit.putString("liveStat", "");
        } else {
            edit.putString("liveStat", JsonMapper.e().toJson(aVar));
        }
        edit.commit();
    }

    public String d() {
        return this.f53655a.getString("dailyReward", "0");
    }

    public void d0(int i4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putInt("NewGBAPlugType", i4);
        edit.commit();
    }

    public int e() {
        return this.f53655a.getInt("DefautVideoPlayType", 0);
    }

    public void e0(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("isGet", z4);
        edit.commit();
    }

    public boolean f() {
        return this.f53655a.getBoolean("DownZipNoticeIsShow", true);
    }

    public void f0(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("isGetLike", z4);
        edit.commit();
    }

    public String g() {
        return this.f53655a.getString(TTDownloadField.TT_DOWNLOAD_PATH, "");
    }

    public void g0(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("isGetReplay", z4);
        edit.commit();
    }

    public String h() {
        return this.f53655a.getString("downloadPathAPKROM", "");
    }

    public void h0(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("NoticeIsRemind", z4);
        edit.commit();
    }

    public String i() {
        return this.f53655a.getString("EmuApkTableList", "");
    }

    public void i0(int i4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putInt("OldDatabaseVersion", i4);
        edit.commit();
    }

    public String j() {
        return this.f53655a.getString("everdayLogin", "");
    }

    public void j0(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("PlugUpdateNoticeShow", z4);
        edit.commit();
    }

    public boolean k() {
        return this.f53655a.getBoolean("firstSetUserIcon", true);
    }

    public void k0(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("PushAdSwitch", z4);
        edit.commit();
    }

    public boolean l() {
        return this.f53655a.getBoolean("firstSetUserIcon", true);
    }

    public void l0(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("QdAdIdConfig" + PackageUtil.getAppVersionName(this.f53656b), str);
        edit.commit();
    }

    public String m() {
        return this.f53655a.getString("statisticGameList", "0");
    }

    public void m0(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("QdAdIdData" + PackageUtil.getAppVersionName(this.f53656b), str);
        edit.commit();
    }

    public void n0(int i4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putInt("RecomendVideoPlayType", i4);
        edit.commit();
    }

    public com.papa.sim.statistic.pref.a o() {
        String string = this.f53655a.getString("liveStat", "");
        if (string != null) {
            try {
                if (string.equals("")) {
                    return null;
                }
                return (com.papa.sim.statistic.pref.a) JsonMapper.e().fromJson(string, com.papa.sim.statistic.pref.a.class);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public void o0(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("refreshForumIndexWhenResume", z4);
        edit.commit();
    }

    public int p() {
        return this.f53655a.getInt("NewGBAPlugType", 0);
    }

    public void p0(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("RequestHeaders", str);
        edit.commit();
    }

    public boolean q() {
        return this.f53655a.getBoolean("isGet", true);
    }

    public void q0(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("ShowDialogNewGBAPlug", z4);
        edit.commit();
    }

    public boolean r() {
        return this.f53655a.getBoolean("isGetLike", true);
    }

    public void r0(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("showForumLabelTip", z4);
        edit.commit();
    }

    public boolean s() {
        return this.f53655a.getBoolean("isGetReplay", true);
    }

    public void s0(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("showInstallAppTotice", z4);
        edit.commit();
    }

    public boolean t() {
        return this.f53655a.getBoolean("NoticeIsRemind", true);
    }

    public void t0(boolean z4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putBoolean("showPostHelpCoastTip", z4);
        edit.commit();
    }

    public int u() {
        return this.f53655a.getInt("OldDatabaseVersion", 13);
    }

    public void u0(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("StartGameGuessLikeNoDataList", str);
        edit.commit();
    }

    public boolean v() {
        return this.f53655a.getBoolean("PlugUpdateNoticeShow", true);
    }

    public void v0(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("statisticVisit", str);
        edit.commit();
    }

    public HomeViewSwich w() {
        HomeViewSwich homeViewSwich = new HomeViewSwich();
        homeViewSwich.setDown_load_cfg_net_game_speed_limit(new DownloadCfg("0", "0"));
        homeViewSwich.setDown_load_cfg_simulator_speed_limit(new DownloadCfg("1", "0"));
        homeViewSwich.setDown_load_cfg_stand_alone_speed_limit(new DownloadCfg("1", "0"));
        homeViewSwich.setDown_load_size(new DownloadCfg("0", "500"));
        homeViewSwich.setDown_load_speed_limit(new DownloadCfg("0", "300"));
        homeViewSwich.setDown_load_unrestricted_speed(new DownloadCfg("0", "1"));
        try {
            String string = this.f53655a.getString("wufunPlugsdata", "");
            return g2.i(string) ? (HomeViewSwich) JsonMapper.e().fromJson(string, HomeViewSwich.class) : homeViewSwich;
        } catch (Exception e5) {
            e5.printStackTrace();
            return homeViewSwich;
        }
    }

    public void w0(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("papauuidkey", str);
        edit.commit();
    }

    public boolean x() {
        return this.f53655a.getBoolean("PushAdSwitch", true);
    }

    public void x0(long j4) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putLong("firstInstall36Time", j4);
        edit.commit();
    }

    public String y() {
        SharedPreferences sharedPreferences = this.f53655a;
        return sharedPreferences.getString("QdAdIdData" + PackageUtil.getAppVersionName(this.f53656b), "");
    }

    public void y0(String str) {
        SharedPreferences.Editor edit = this.f53655a.edit();
        edit.putString("shareGameTimeAndTimes", str);
        edit.commit();
    }

    public int z() {
        return this.f53655a.getInt("RecomendVideoPlayType", 1);
    }

    public boolean z0() {
        return this.f53655a.getBoolean("showInstallAppTotice", false);
    }
}
