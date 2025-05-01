package com.papa.sim.statistic.pref;

import android.content.Context;
import android.content.SharedPreferences;
import com.papa.sim.statistic.JsonMapper;
/* compiled from: PrefUtil.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    static b f59484d;

    /* renamed from: a  reason: collision with root package name */
    SharedPreferences f59485a;

    /* renamed from: b  reason: collision with root package name */
    Context f59486b;

    /* renamed from: c  reason: collision with root package name */
    private Object f59487c;

    private b(Context context) {
        this.f59486b = context;
        this.f59485a = context.getSharedPreferences("Papa_Stat_SharedPreferences", 0);
    }

    public static b k(Context context) {
        if (f59484d == null) {
            f59484d = new b(context);
        }
        return f59484d;
    }

    public void A(boolean z4) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putBoolean("firstSetUserCenter", z4);
        edit.commit();
    }

    public void B(boolean z4) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putBoolean("firstSetUserIcon", z4);
        edit.commit();
    }

    public void C(String str) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putString("statisticGameList", str);
        edit.commit();
    }

    public void D(int i4) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putInt("_home_ab_page_type", i4);
        edit.commit();
    }

    public void E(String str) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putString("wufun_idfinal", str);
        edit.commit();
    }

    public void F(boolean z4) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putBoolean("getIsShowDiviceDialog", z4);
        edit.commit();
    }

    public void G(a aVar) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        if (aVar == null) {
            edit.putString("liveStat", "");
        } else {
            edit.putString("liveStat", JsonMapper.e().toJson(aVar));
        }
        edit.commit();
    }

    public void H(int i4) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putInt("NewGBAPlugType", i4);
        edit.commit();
    }

    public void I(int i4) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putInt("OldDatabaseVersion", i4);
        edit.commit();
    }

    public void J(boolean z4) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putBoolean("ShowDialogNewGBAPlug", z4);
        edit.commit();
    }

    public void K(String str) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putString("statisticVisit", str);
        edit.commit();
    }

    public void L(boolean z4) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putBoolean("firstShowUserPermiss", z4);
        edit.commit();
    }

    public String a() {
        return this.f59485a.getString("dailyReward", "0");
    }

    public int b() {
        return this.f59485a.getInt("_detail_ab_page_type", 0);
    }

    public String c() {
        return this.f59485a.getString("EmuApkTableList", "");
    }

    public String d() {
        return this.f59485a.getString("first_screen_ad_interaction", "");
    }

    public boolean e() {
        return this.f59485a.getBoolean("firstSetUserBg", true);
    }

    public boolean f() {
        return this.f59485a.getBoolean("firstSetUserCenter", true);
    }

    public boolean g() {
        return this.f59485a.getBoolean("firstSetUserIcon", true);
    }

    public String h() {
        return this.f59485a.getString("statisticGameList", "0");
    }

    public int i() {
        return this.f59485a.getInt("_home_ab_page_type", 0);
    }

    public String j() {
        return this.f59485a.getString("wufun_idfinal", "");
    }

    public boolean l() {
        return this.f59485a.getBoolean("getIsShowDiviceDialog", false);
    }

    public a m() {
        String string = this.f59485a.getString("liveStat", "");
        if (string != null) {
            try {
                if (string.equals("")) {
                    return null;
                }
                return (a) JsonMapper.e().fromJson(string, a.class);
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public int n() {
        return this.f59485a.getInt("NewGBAPlugType", 0);
    }

    public int o() {
        return this.f59485a.getInt("OldDatabaseVersion", 13);
    }

    public boolean p() {
        return this.f59485a.getBoolean("ShowDialogNewGBAPlug", false);
    }

    public String q() {
        return this.f59485a.getString("statisticVisit", "0");
    }

    public String r() {
        return this.f59485a.getString("papauuidkey", "");
    }

    public boolean s() {
        return this.f59485a.getBoolean("firstShowUserPermiss", true);
    }

    public boolean t() {
        return this.f59485a.getBoolean("actived", false);
    }

    public void u(boolean z4) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putBoolean("actived", z4);
        edit.commit();
    }

    public void v(String str) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putString("dailyReward", str);
        edit.commit();
    }

    public void w(int i4) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putInt("_detail_ab_page_type", i4);
        edit.commit();
    }

    public void x(String str) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putString("EmuApkTableList", str);
        edit.commit();
    }

    public void y(String str) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putString("first_screen_ad_interaction", str);
        edit.commit();
    }

    public void z(boolean z4) {
        SharedPreferences.Editor edit = this.f59485a.edit();
        edit.putBoolean("firstSetUserBg", z4);
        edit.commit();
    }
}
