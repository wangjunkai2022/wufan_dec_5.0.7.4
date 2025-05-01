package com.join.mgps.pref;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.join.mgps.dto.PayCenterOrderRequest;
import org.androidannotations.api.sharedpreferences.i;
import org.androidannotations.api.sharedpreferences.j;
import org.androidannotations.api.sharedpreferences.k;
import org.androidannotations.api.sharedpreferences.n;
import org.androidannotations.api.sharedpreferences.o;
import org.androidannotations.api.sharedpreferences.p;
/* loaded from: classes.dex */
public final class PrefDef_ extends n {

    /* loaded from: classes4.dex */
    public static final class a extends org.androidannotations.api.sharedpreferences.e<a> {
        a(SharedPreferences sharedPreferences) {
            super(sharedPreferences);
        }

        public o<a> A() {
            return i("adIdPsp");
        }

        public o<a> A0() {
            return i("gameTypeList");
        }

        public org.androidannotations.api.sharedpreferences.c<a> A1() {
            return b("isOnlyWifiReconnect");
        }

        public o<a> A2() {
            return i("myGameTabAdShowIndex");
        }

        public o<a> A3() {
            return i("simulator_psp_cfg");
        }

        public o<a> B() {
            return i("addedShortcutGames");
        }

        public o<a> B0() {
            return i("gameWorldActive");
        }

        public org.androidannotations.api.sharedpreferences.c<a> B1() {
            return b("isQuarkEnable");
        }

        public org.androidannotations.api.sharedpreferences.c<a> B2() {
            return b("needShowPermissdialog");
        }

        public o<a> B3() {
            return i("singleGameAdCfg");
        }

        public o<a> C() {
            return i("androidIdNullsKey");
        }

        public o<a> C0() {
            return i("gameWorldGradeList");
        }

        public org.androidannotations.api.sharedpreferences.c<a> C1() {
            return b("isQuarkSilentDownload");
        }

        public org.androidannotations.api.sharedpreferences.c<a> C2() {
            return b("needsendRigeister");
        }

        public o<a> C3() {
            return i("singleGameShowDialog");
        }

        public org.androidannotations.api.sharedpreferences.c<a> D() {
            return b("annonunceWhenDownload");
        }

        public o<a> D0() {
            return i("gameWorldWorshipTop");
        }

        public org.androidannotations.api.sharedpreferences.c<a> D1() {
            return b("isReloadClassify");
        }

        public org.androidannotations.api.sharedpreferences.h<a> D2() {
            return g("net_game_count_down");
        }

        public org.androidannotations.api.sharedpreferences.c<a> D3() {
            return b("soundnowIsNoSound");
        }

        public org.androidannotations.api.sharedpreferences.c<a> E() {
            return b("anti_addiction_switch");
        }

        public org.androidannotations.api.sharedpreferences.h<a> E0() {
            return g("getArchiveCoinPref");
        }

        public org.androidannotations.api.sharedpreferences.c<a> E1() {
            return b("isShowEditorRecoomand");
        }

        public org.androidannotations.api.sharedpreferences.c<a> E2() {
            return b("noFavoriteTips");
        }

        public o<a> E3() {
            return i("ssidBefore");
        }

        public org.androidannotations.api.sharedpreferences.h<a> F() {
            return g("apName");
        }

        public o<a> F0() {
            return i("getLastPayType");
        }

        public org.androidannotations.api.sharedpreferences.c<a> F1() {
            return b("isShowLuckyEggBadge");
        }

        public org.androidannotations.api.sharedpreferences.c<a> F2() {
            return b("noPromptDownload");
        }

        public o<a> F3() {
            return i("ssp_cfg");
        }

        public o<a> G() {
            return i("arcadeGameAdCfg");
        }

        public org.androidannotations.api.sharedpreferences.c<a> G0() {
            return b("gprsIsOpen");
        }

        public org.androidannotations.api.sharedpreferences.c<a> G1() {
            return b("isShowSplash");
        }

        public org.androidannotations.api.sharedpreferences.c<a> G2() {
            return b("non_online_user_switch");
        }

        public org.androidannotations.api.sharedpreferences.h<a> G3() {
            return g("startGameShowLoginNumber");
        }

        public o<a> H() {
            return i("arenaDialogAdData");
        }

        public org.androidannotations.api.sharedpreferences.h<a> H0() {
            return g("gprsNoticeInfo");
        }

        public org.androidannotations.api.sharedpreferences.c<a> H1() {
            return b("isShowVideo");
        }

        public org.androidannotations.api.sharedpreferences.h<a> H2() {
            return g("normalDownloadCount");
        }

        public org.androidannotations.api.sharedpreferences.h<a> H3() {
            return g("startgameLogintimes_open_login");
        }

        public org.androidannotations.api.sharedpreferences.c<a> I() {
            return b("autoLogin");
        }

        public o<a> I0() {
            return i("hasShowAdInfo");
        }

        public org.androidannotations.api.sharedpreferences.c<a> I1() {
            return b("isWifiConnectedBefore");
        }

        public o<a> I2() {
            return i("offlineId");
        }

        public org.androidannotations.api.sharedpreferences.h<a> I3() {
            return g("startgametimes_open_certify");
        }

        public o<a> J() {
            return i("availableLoginMethod");
        }

        public org.androidannotations.api.sharedpreferences.c<a> J0() {
            return b("hasShowEndGameBadge");
        }

        public j<a> J1() {
            return h("lastApplyReadPhonePermission");
        }

        public o<a> J2() {
            return i("packageName");
        }

        public o<a> J3() {
            return i("statisticVisit");
        }

        public o<a> K() {
            return i("battleWelcomeIn");
        }

        public org.androidannotations.api.sharedpreferences.c<a> K0() {
            return b("hasShowMiniGameBadge");
        }

        public j<a> K1() {
            return h("lastApplyReadPhonePermissionOnRecom");
        }

        public o<a> K2() {
            return i("packageType");
        }

        public o<a> K3() {
            return i("thAdSwitchCfg");
        }

        public o<a> L() {
            return i("changeNickNameNotice");
        }

        public o<a> L0() {
            return i("hasShowModInstallGames");
        }

        public j<a> L1() {
            return h("lastCheckInTime");
        }

        public org.androidannotations.api.sharedpreferences.h<a> L2() {
            return g("pageVersion");
        }

        public org.androidannotations.api.sharedpreferences.h<a> L3() {
            return g("todayShowRealNameCount");
        }

        public org.androidannotations.api.sharedpreferences.c<a> M() {
            return b("classFyFirstOpen");
        }

        public org.androidannotations.api.sharedpreferences.c<a> M0() {
            return b("has_launch_quark");
        }

        public j<a> M1() {
            return h("lastCheckTokenTick");
        }

        public o<a> M2() {
            return i("pd_ad_config");
        }

        public o<a> M3() {
            return i("token");
        }

        public j<a> N() {
            return h("clickFloatViewTime");
        }

        public org.androidannotations.api.sharedpreferences.c<a> N0() {
            return b("hideGameTopAd");
        }

        public o<a> N1() {
            return i("lastClickPageAD");
        }

        public o<a> N2() {
            return i("platform");
        }

        public j<a> N3() {
            return h("touriseTUID");
        }

        public o<a> O() {
            return i("cloudVipLink");
        }

        public o<a> O0() {
            return i("hide_app_pwd");
        }

        public j<a> O1() {
            return h("lastGameShowOnlineCouponTime");
        }

        public org.androidannotations.api.sharedpreferences.c<a> O2() {
            return b("plugHasUpdate");
        }

        public org.androidannotations.api.sharedpreferences.c<a> O3() {
            return b("uncompleteDownload");
        }

        public o<a> P() {
            return i("commentToken");
        }

        public org.androidannotations.api.sharedpreferences.h<a> P0() {
            return g("hide_app_switch");
        }

        public j<a> P1() {
            return h("lastGameShowOnlineCouponTimeGuest");
        }

        public o<a> P2() {
            return i("privateDomainFeedbackInfo");
        }

        public o<a> P3() {
            return i("upLoadConfig");
        }

        public j<a> Q() {
            return h("commentnoticeTime");
        }

        public o<a> Q0() {
            return i("homeAllData");
        }

        public o<a> Q1() {
            return i("lastGameTimePeriod");
        }

        public org.androidannotations.api.sharedpreferences.h<a> Q2() {
            return g("pspAdShowTime");
        }

        public o<a> Q3() {
            return i("upLoadFileName");
        }

        public o<a> R() {
            return i("community_entrance_title");
        }

        public o<a> R0() {
            return i("homeAllDataV3");
        }

        public o<a> R1() {
            return i("lastGameTimePeriodGuest");
        }

        public org.androidannotations.api.sharedpreferences.h<a> R2() {
            return g("pspAdShowTimeSwitch");
        }

        public o<a> R3() {
            return i("upLoadGame");
        }

        public org.androidannotations.api.sharedpreferences.c<a> S() {
            return b("continueOnWifi");
        }

        public o<a> S0() {
            return i("homeAllDataV4");
        }

        public o<a> S1() {
            return i("lastHomeDataMd5");
        }

        public o<a> S2() {
            return i("pspGameAdCfg");
        }

        public org.androidannotations.api.sharedpreferences.h<a> S3() {
            return g("upLoadState");
        }

        public o<a> T() {
            return i("defaultSearchKeyword");
        }

        public o<a> T0() {
            return i("homeFastThe_new");
        }

        public o<a> T1() {
            return i("lastInstallApp");
        }

        public o<a> T2() {
            return i("quarkGameDownload");
        }

        public org.androidannotations.api.sharedpreferences.c<a> T3() {
            return b("uploadRecoderNotice");
        }

        public o<a> U() {
            return i(TTDownloadField.TT_DOWNLOAD_PATH);
        }

        public o<a> U0() {
            return i("homeFastTopic");
        }

        public o<a> U1() {
            return i("lastInstallAppFinish");
        }

        public org.androidannotations.api.sharedpreferences.h<a> U2() {
            return g("quark_click_count");
        }

        public o<a> U3() {
            return i("uploadType2");
        }

        public org.androidannotations.api.sharedpreferences.h<a> V() {
            return g("downloadSpeedUpCount");
        }

        public o<a> V0() {
            return i("homeFastWillpay");
        }

        public o<a> V1() {
            return i("lastLaunchModGameId");
        }

        public org.androidannotations.api.sharedpreferences.h<a> V2() {
            return g("quark_display_count");
        }

        public o<a> V3() {
            return i("userCenterViewConfigs");
        }

        public org.androidannotations.api.sharedpreferences.h<a> W() {
            return g("downloadSpeedUpCountAD");
        }

        public org.androidannotations.api.sharedpreferences.h<a> W0() {
            return g("homePopupAdCount");
        }

        public o<a> W1() {
            return i("lastLoginAccount");
        }

        public org.androidannotations.api.sharedpreferences.h<a> W2() {
            return g("quark_display_mode");
        }

        public o<a> W3() {
            return i("userCenterViewConfigsv2");
        }

        public org.androidannotations.api.sharedpreferences.h<a> X() {
            return g("downloadSpeedUpCountCurrent");
        }

        public o<a> X0() {
            return i("homePopupAdLast");
        }

        public j<a> X1() {
            return h("lastMainShowOnlineCouponTime");
        }

        public org.androidannotations.api.sharedpreferences.h<a> X2() {
            return g("quark_feed_back_not_ask");
        }

        public o<a> X3() {
            return i("userId");
        }

        public org.androidannotations.api.sharedpreferences.h<a> Y() {
            return g("downloadSpeedUpCountCurrentAD");
        }

        public j<a> Y0() {
            return h("homePopupAdLastTime");
        }

        public j<a> Y1() {
            return h("lastMainShowOnlineCouponTimeGuest");
        }

        public o<a> Y2() {
            return i("quark_last_down_game_info");
        }

        public j<a> Y3() {
            return h("userLastStartAPP");
        }

        public org.androidannotations.api.sharedpreferences.h<a> Z() {
            return g("downloadSpeedUpGameSize");
        }

        public org.androidannotations.api.sharedpreferences.h<a> Z0() {
            return g("insatllAppFirst");
        }

        public o<a> Z1() {
            return i("lastMainTimePeriod");
        }

        public org.androidannotations.api.sharedpreferences.c<a> Z2() {
            return b("rankNotify");
        }

        public j<a> Z3() {
            return h("userLastStartGame");
        }

        public o<a> a0() {
            return i("downloadSpeedUpGames");
        }

        public o<a> a1() {
            return i("insatllAppFirstData");
        }

        public o<a> a2() {
            return i("lastMainTimePeriodGuest");
        }

        public o<a> a3() {
            return i("rankingMenu");
        }

        public org.androidannotations.api.sharedpreferences.h<a> a4() {
            return g(TTDownloadField.TT_VERSION_CODE);
        }

        public j<a> b0() {
            return h("downloadSpeedUpLastTime");
        }

        public j<a> b1() {
            return h("installApplastNoticeTime");
        }

        public j<a> b2() {
            return h("lastQuitShowOnlineCouponTime");
        }

        public o<a> b3() {
            return i("rankingMenu2");
        }

        public o<a> b4() {
            return i("video_init_cfg");
        }

        public o<a> c0() {
            return i("downloadSpeedupCfg");
        }

        public org.androidannotations.api.sharedpreferences.c<a> c1() {
            return b("isAcActived");
        }

        public j<a> c2() {
            return h("lastQuitShowOnlineCouponTimeGuset");
        }

        public o<a> c3() {
            return i("recomDataJson");
        }

        public org.androidannotations.api.sharedpreferences.h<a> c4() {
            return g("virtualDeviceState");
        }

        public org.androidannotations.api.sharedpreferences.c<a> d0() {
            return b("download_game_switch");
        }

        public org.androidannotations.api.sharedpreferences.c<a> d1() {
            return b("isAutoWifiDownUpdate");
        }

        public j<a> d2() {
            return h("lastRealNameCheckTime");
        }

        public o<a> d3() {
            return i("rpcUserId");
        }

        public org.androidannotations.api.sharedpreferences.c<a> d4() {
            return b("w_channel_info_switch");
        }

        public o<a> e0() {
            return i("emuApkTableList");
        }

        public org.androidannotations.api.sharedpreferences.h<a> e1() {
            return g("isBsideInt");
        }

        public j<a> e2() {
            return h("lastSendAppTime");
        }

        public org.androidannotations.api.sharedpreferences.h<a> e3() {
            return g("runRomFirst");
        }

        public o<a> e4() {
            return i("web_disk_cfg");
        }

        public o<a> f0() {
            return i("emulatorCheckpointUrl");
        }

        public org.androidannotations.api.sharedpreferences.c<a> f1() {
            return b("isCanShowAddShortcut");
        }

        public j<a> f2() {
            return h("lastShowBespeakTipTime");
        }

        public o<a> f3() {
            return i("sdcardData");
        }

        public o<a> f4() {
            return i("web_disk_position");
        }

        public o<a> g0() {
            return i("emulatorGoldenFingerUrl");
        }

        public org.androidannotations.api.sharedpreferences.c<a> g1() {
            return b("isFcActived");
        }

        public j<a> g2() {
            return h("lastShowLoginGuiedTime");
        }

        public org.androidannotations.api.sharedpreferences.c<a> g3() {
            return b("sdcardisFirst");
        }

        public org.androidannotations.api.sharedpreferences.h<a> g4() {
            return g("web_disk_switch");
        }

        public o<a> h0() {
            return i("emulatorOneSkillUrl");
        }

        public org.androidannotations.api.sharedpreferences.c<a> h1() {
            return b("isFightActivity");
        }

        public j<a> h2() {
            return h("lastShowNotInstallTime");
        }

        public o<a> h3() {
            return i("searchHintCache");
        }

        public o<a> h4() {
            return i("wf_app_about");
        }

        public org.androidannotations.api.sharedpreferences.h<a> i0() {
            return g("emulatorStartAdCount");
        }

        public org.androidannotations.api.sharedpreferences.c<a> i1() {
            return b("isFirst35");
        }

        public j<a> i2() {
            return h("lastShowNotOpenTime");
        }

        public o<a> i3() {
            return i("searchguesslikeData");
        }

        public org.androidannotations.api.sharedpreferences.h<a> i4() {
            return g("wifiDownNumber");
        }

        public o<a> j0() {
            return i("endGameConfig");
        }

        public org.androidannotations.api.sharedpreferences.c<a> j1() {
            return b("isFirstClickClassify");
        }

        public j<a> j2() {
            return h("lastShowRealNameTime");
        }

        public org.androidannotations.api.sharedpreferences.c<a> j3() {
            return b("shareTipClosed");
        }

        public org.androidannotations.api.sharedpreferences.c<a> j4() {
            return b("wifiIsOpen");
        }

        public org.androidannotations.api.sharedpreferences.c<a> k() {
            return b("DownloadRecoderNotice");
        }

        public o<a> k0() {
            return i("fightWifiInputIP");
        }

        public org.androidannotations.api.sharedpreferences.c<a> k1() {
            return b("isFirstCommendVersion");
        }

        public o<a> k2() {
            return i("lastShowSplashImage");
        }

        public org.androidannotations.api.sharedpreferences.c<a> k3() {
            return b("showAnBattle");
        }

        public o<a> k4() {
            return i("worldStart");
        }

        public org.androidannotations.api.sharedpreferences.c<a> l() {
            return b("DownloadRecoderNoticeMarcket");
        }

        public org.androidannotations.api.sharedpreferences.c<a> l0() {
            return b("firstArena");
        }

        public org.androidannotations.api.sharedpreferences.c<a> l1() {
            return b("isFirstCouldShowPopw");
        }

        public o<a> l2() {
            return i("lastShowTOUTIAOAd");
        }

        public org.androidannotations.api.sharedpreferences.c<a> l3() {
            return b("showGuideCreateEndGame");
        }

        public o<a> l4() {
            return i("worshipMarqueeHistory");
        }

        public org.androidannotations.api.sharedpreferences.c<a> m() {
            return b("FirstShowMYgameTopTip");
        }

        public org.androidannotations.api.sharedpreferences.c<a> m0() {
            return b("firstArenaFilterVisit");
        }

        public org.androidannotations.api.sharedpreferences.c<a> m1() {
            return b("isFirstCustomApk");
        }

        public o<a> m2() {
            return i("lastStartSimulatorCore");
        }

        public org.androidannotations.api.sharedpreferences.c<a> m3() {
            return b("showHistroyHint");
        }

        public o<a> m4() {
            return i("wx_open_appid");
        }

        public org.androidannotations.api.sharedpreferences.h<a> n() {
            return g("Member_id");
        }

        public org.androidannotations.api.sharedpreferences.c<a> n0() {
            return b("firstClickShoubing");
        }

        public org.androidannotations.api.sharedpreferences.c<a> n1() {
            return b("isFirstLocalShowPopw");
        }

        public o<a> n2() {
            return i("lastTopTip");
        }

        public o<a> n3() {
            return i("showIndex");
        }

        public o<a> o() {
            return i("Member_name");
        }

        public org.androidannotations.api.sharedpreferences.c<a> o0() {
            return b("firstClickUsericon");
        }

        public org.androidannotations.api.sharedpreferences.c<a> o1() {
            return b("isFirstRemeShowPopw");
        }

        public j<a> o2() {
            return h("last_update_time");
        }

        public o<a> o3() {
            return i("showName");
        }

        public o<a> p() {
            return i("PaBiData");
        }

        public org.androidannotations.api.sharedpreferences.c<a> p0() {
            return b("firstInstallAppCompanyDialog");
        }

        public org.androidannotations.api.sharedpreferences.c<a> p1() {
            return b("isFirstRun");
        }

        public org.androidannotations.api.sharedpreferences.c<a> p2() {
            return b("launch_game_switch");
        }

        public org.androidannotations.api.sharedpreferences.c<a> p3() {
            return b("show_unknown_source");
        }

        public org.androidannotations.api.sharedpreferences.h<a> q() {
            return g("ab_side");
        }

        public org.androidannotations.api.sharedpreferences.c<a> q0() {
            return b("firstIntentgamedetialVideo");
        }

        public org.androidannotations.api.sharedpreferences.c<a> q1() {
            return b("isFirstRunApkBackup");
        }

        public o<a> q2() {
            return i("liveSubtitle");
        }

        public org.androidannotations.api.sharedpreferences.c<a> q3() {
            return b("simulatorLaunchAchievementTabRedPointShown");
        }

        public o<a> r() {
            return i("accountData");
        }

        public org.androidannotations.api.sharedpreferences.c<a> r0() {
            return b("firstNewSplash");
        }

        public j<a> r1() {
            return h("isFirstRunApkBackupLong");
        }

        public o<a> r2() {
            return i("liveTitle");
        }

        public o<a> r3() {
            return i("simulator_exit_information_cfg");
        }

        public o<a> s() {
            return i("accountDataV2");
        }

        public org.androidannotations.api.sharedpreferences.c<a> s0() {
            return b("firstNewSplashV2");
        }

        public j<a> s1() {
            return h("isFirstRunGameCarefullyLong");
        }

        public o<a> s2() {
            return i("localUserIcon");
        }

        public o<a> s3() {
            return i("simulator_exit_open_cfg");
        }

        public o<a> t() {
            return i("accountDataV3");
        }

        public org.androidannotations.api.sharedpreferences.c<a> t0() {
            return b("firstShowUserPermiss");
        }

        public org.androidannotations.api.sharedpreferences.c<a> t1() {
            return b("isFirstRunRecomeWifi");
        }

        public o<a> t2() {
            return i("location");
        }

        public o<a> t3() {
            return i("simulator_fc_cfg");
        }

        public o<a> u() {
            return i("accountLoginToken");
        }

        public org.androidannotations.api.sharedpreferences.c<a> u0() {
            return b("firstUninstallTipShow");
        }

        public org.androidannotations.api.sharedpreferences.c<a> u1() {
            return b("isFirstbuyShowPopw");
        }

        public o<a> u2() {
            return i("lodingImageMD5");
        }

        public o<a> u3() {
            return i("simulator_gba_cfg");
        }

        public org.androidannotations.api.sharedpreferences.h<a> v() {
            return g("accountLoginUID");
        }

        public org.androidannotations.api.sharedpreferences.c<a> v0() {
            return b("forumFirstClickUsericon");
        }

        public org.androidannotations.api.sharedpreferences.c<a> v1() {
            return b("isHideAdBlock");
        }

        public org.androidannotations.api.sharedpreferences.c<a> v2() {
            return b("loginPermissHasallow");
        }

        public o<a> v3() {
            return i("simulator_gold_finger_cfg");
        }

        public o<a> w() {
            return i("adIdArc");
        }

        public o<a> w0() {
            return i("found_game_tab");
        }

        public org.androidannotations.api.sharedpreferences.c<a> w1() {
            return b("isHomepagePlayVideo");
        }

        public o<a> w2() {
            return i("md5FileTag");
        }

        public o<a> w3() {
            return i("simulator_jj_cfg");
        }

        public o<a> x() {
            return i("adIdCommonH");
        }

        public o<a> x0() {
            return i("gameHasFeedBack");
        }

        public org.androidannotations.api.sharedpreferences.c<a> x1() {
            return b("isLogin");
        }

        public o<a> x2() {
            return i("mod_enhance_ad_cfg");
        }

        public org.androidannotations.api.sharedpreferences.h<a> x3() {
            return g("simulator_last_ad_position");
        }

        public o<a> y() {
            return i("adIdCommonV");
        }

        public o<a> y0() {
            return i("gameTimeLvCfg");
        }

        public org.androidannotations.api.sharedpreferences.c<a> y1() {
            return b("isNewFinishedGame");
        }

        public o<a> y2() {
            return i("mod_normal_ad_cfg");
        }

        public o<a> y3() {
            return i("simulator_path_cfg");
        }

        public o<a> z() {
            return i("adIdDownloadSpeedUp");
        }

        public o<a> z0() {
            return i("gameTopAd");
        }

        public o<a> z1() {
            return i("isNoShowAddShortcut");
        }

        public o<a> z2() {
            return i("myGameAllTabSort");
        }

        public o<a> z3() {
            return i("simulator_play_records");
        }
    }

    public PrefDef_(Context context) {
        super(context.getSharedPreferences("PrefDef", 0));
    }

    public org.androidannotations.api.sharedpreferences.d DownloadRecoderNotice() {
        return booleanField("DownloadRecoderNotice", true);
    }

    public org.androidannotations.api.sharedpreferences.d DownloadRecoderNoticeMarcket() {
        return booleanField("DownloadRecoderNoticeMarcket", true);
    }

    public org.androidannotations.api.sharedpreferences.d FirstShowMYgameTopTip() {
        return booleanField("FirstShowMYgameTopTip", true);
    }

    public i Member_id() {
        return intField("Member_id", 1);
    }

    public p Member_name() {
        return stringField("Member_name", "");
    }

    public p PaBiData() {
        return stringField("PaBiData", "");
    }

    public i ab_side() {
        return intField("ab_side", 0);
    }

    public p accountData() {
        return stringField("accountData", "");
    }

    public p accountDataV2() {
        return stringField("accountDataV2", "");
    }

    public p accountDataV3() {
        return stringField("accountDataV3", "");
    }

    public p accountLoginToken() {
        return stringField("accountLoginToken", "");
    }

    public i accountLoginUID() {
        return intField("accountLoginUID", -1);
    }

    public p adIdArc() {
        return stringField("adIdArc", "");
    }

    public p adIdCommonH() {
        return stringField("adIdCommonH", "919681372");
    }

    public p adIdCommonV() {
        return stringField("adIdCommonV", "919681774");
    }

    public p adIdDownloadSpeedUp() {
        return stringField("adIdDownloadSpeedUp", "919681084");
    }

    public p adIdPsp() {
        return stringField("adIdPsp", "919681132");
    }

    public p addedShortcutGames() {
        return stringField("addedShortcutGames", "");
    }

    public p androidIdNullsKey() {
        return stringField("androidIdNullsKey", "");
    }

    public org.androidannotations.api.sharedpreferences.d annonunceWhenDownload() {
        return booleanField("annonunceWhenDownload", true);
    }

    public org.androidannotations.api.sharedpreferences.d anti_addiction_switch() {
        return booleanField("anti_addiction_switch", false);
    }

    public i apName() {
        return intField("apName", 0);
    }

    public p arcadeGameAdCfg() {
        return stringField("arcadeGameAdCfg", "");
    }

    public p arenaDialogAdData() {
        return stringField("arenaDialogAdData", "");
    }

    public org.androidannotations.api.sharedpreferences.d autoLogin() {
        return booleanField("autoLogin", true);
    }

    public p availableLoginMethod() {
        return stringField("availableLoginMethod", "");
    }

    public p battleWelcomeIn() {
        return stringField("battleWelcomeIn", "");
    }

    public p changeNickNameNotice() {
        return stringField("changeNickNameNotice", "消耗铜板更改昵称");
    }

    public org.androidannotations.api.sharedpreferences.d classFyFirstOpen() {
        return booleanField("classFyFirstOpen", true);
    }

    public k clickFloatViewTime() {
        return longField("clickFloatViewTime", 0L);
    }

    public p cloudVipLink() {
        return stringField("cloudVipLink", "http://anv3btapi.5fun.com/user/activity/cloud_archive");
    }

    public p commentToken() {
        return stringField("commentToken", "");
    }

    public k commentnoticeTime() {
        return longField("commentnoticeTime", 0L);
    }

    public p community_entrance_title() {
        return stringField("community_entrance_title", "去社区看看");
    }

    public org.androidannotations.api.sharedpreferences.d continueOnWifi() {
        return booleanField("continueOnWifi", true);
    }

    public p defaultSearchKeyword() {
        return stringField("defaultSearchKeyword", "");
    }

    public p downloadPath() {
        return stringField(TTDownloadField.TT_DOWNLOAD_PATH, "");
    }

    public i downloadSpeedUpCount() {
        return intField("downloadSpeedUpCount", 0);
    }

    public i downloadSpeedUpCountAD() {
        return intField("downloadSpeedUpCountAD", 0);
    }

    public i downloadSpeedUpCountCurrent() {
        return intField("downloadSpeedUpCountCurrent", 0);
    }

    public i downloadSpeedUpCountCurrentAD() {
        return intField("downloadSpeedUpCountCurrentAD", 0);
    }

    public i downloadSpeedUpGameSize() {
        return intField("downloadSpeedUpGameSize", 0);
    }

    public p downloadSpeedUpGames() {
        return stringField("downloadSpeedUpGames", "");
    }

    public k downloadSpeedUpLastTime() {
        return longField("downloadSpeedUpLastTime", 0L);
    }

    public p downloadSpeedupCfg() {
        return stringField("downloadSpeedupCfg", "");
    }

    public org.androidannotations.api.sharedpreferences.d download_game_switch() {
        return booleanField("download_game_switch", true);
    }

    public a edit() {
        return new a(getSharedPreferences());
    }

    public p emuApkTableList() {
        return stringField("emuApkTableList", "");
    }

    public p emulatorCheckpointUrl() {
        return stringField("emulatorCheckpointUrl", "");
    }

    public p emulatorGoldenFingerUrl() {
        return stringField("emulatorGoldenFingerUrl", "");
    }

    public p emulatorOneSkillUrl() {
        return stringField("emulatorOneSkillUrl", "");
    }

    public i emulatorStartAdCount() {
        return intField("emulatorStartAdCount", 0);
    }

    public p endGameConfig() {
        return stringField("endGameConfig", "");
    }

    public p fightWifiInputIP() {
        return stringField("fightWifiInputIP", "");
    }

    public org.androidannotations.api.sharedpreferences.d firstArena() {
        return booleanField("firstArena", true);
    }

    public org.androidannotations.api.sharedpreferences.d firstArenaFilterVisit() {
        return booleanField("firstArenaFilterVisit", true);
    }

    public org.androidannotations.api.sharedpreferences.d firstClickShoubing() {
        return booleanField("firstClickShoubing", true);
    }

    public org.androidannotations.api.sharedpreferences.d firstClickUsericon() {
        return booleanField("firstClickUsericon", true);
    }

    public org.androidannotations.api.sharedpreferences.d firstInstallAppCompanyDialog() {
        return booleanField("firstInstallAppCompanyDialog", true);
    }

    public org.androidannotations.api.sharedpreferences.d firstIntentgamedetialVideo() {
        return booleanField("firstIntentgamedetialVideo", true);
    }

    public org.androidannotations.api.sharedpreferences.d firstNewSplash() {
        return booleanField("firstNewSplash", true);
    }

    public org.androidannotations.api.sharedpreferences.d firstNewSplashV2() {
        return booleanField("firstNewSplashV2", true);
    }

    public org.androidannotations.api.sharedpreferences.d firstShowUserPermiss() {
        return booleanField("firstShowUserPermiss", true);
    }

    public org.androidannotations.api.sharedpreferences.d firstUninstallTipShow() {
        return booleanField("firstUninstallTipShow", false);
    }

    public org.androidannotations.api.sharedpreferences.d forumFirstClickUsericon() {
        return booleanField("forumFirstClickUsericon", true);
    }

    public p found_game_tab() {
        return stringField("found_game_tab", "{\"tips_info\":{\"title\":\"闪玩\",\"display_switch\":true},\"title_info\":[{\"index\":4,\"title\":\"闪玩\",\"display_index\":1,\"selected\":false},{\"index\":0,\"title\":\"精选\",\"display_index\":2,\"selected\":true},{\"index\":1,\"title\":\"排行\",\"display_index\":3,\"selected\":false},{\"index\":2,\"title\":\"分类\",\"display_index\":4,\"selected\":false},{\"index\":3,\"title\":\"游戏单\",\"display_index\":5,\"selected\":false}]}");
    }

    public p gameHasFeedBack() {
        return stringField("gameHasFeedBack", "");
    }

    public p gameTimeLvCfg() {
        return stringField("gameTimeLvCfg", "");
    }

    public p gameTopAd() {
        return stringField("gameTopAd", "");
    }

    public p gameTypeList() {
        return stringField("gameTypeList", "");
    }

    public p gameWorldActive() {
        return stringField("gameWorldActive", "");
    }

    public p gameWorldGradeList() {
        return stringField("gameWorldGradeList", "");
    }

    public p gameWorldWorshipTop() {
        return stringField("gameWorldWorshipTop", "");
    }

    public i getArchiveCoinPref() {
        return intField("getArchiveCoinPref", 20);
    }

    public p getLastPayType() {
        return stringField("getLastPayType", PayCenterOrderRequest.ACTION_ALI_PAY);
    }

    public org.androidannotations.api.sharedpreferences.d gprsIsOpen() {
        return booleanField("gprsIsOpen", true);
    }

    public i gprsNoticeInfo() {
        return intField("gprsNoticeInfo", 4);
    }

    public p hasShowAdInfo() {
        return stringField("hasShowAdInfo", "");
    }

    public org.androidannotations.api.sharedpreferences.d hasShowEndGameBadge() {
        return booleanField("hasShowEndGameBadge", false);
    }

    public org.androidannotations.api.sharedpreferences.d hasShowMiniGameBadge() {
        return booleanField("hasShowMiniGameBadge", false);
    }

    public p hasShowModInstallGames() {
        return stringField("hasShowModInstallGames", "");
    }

    public org.androidannotations.api.sharedpreferences.d has_launch_quark() {
        return booleanField("has_launch_quark", false);
    }

    public org.androidannotations.api.sharedpreferences.d hideGameTopAd() {
        return booleanField("hideGameTopAd", false);
    }

    public p hide_app_pwd() {
        return stringField("hide_app_pwd", "");
    }

    public i hide_app_switch() {
        return intField("hide_app_switch", 0);
    }

    public p homeAllData() {
        return stringField("homeAllData", "");
    }

    public p homeAllDataV3() {
        return stringField("homeAllDataV3", "");
    }

    public p homeAllDataV4() {
        return stringField("homeAllDataV4", "");
    }

    public p homeFastThe_new() {
        return stringField("homeFastThe_new", "");
    }

    public p homeFastTopic() {
        return stringField("homeFastTopic", "");
    }

    public p homeFastWillpay() {
        return stringField("homeFastWillpay", "");
    }

    public i homePopupAdCount() {
        return intField("homePopupAdCount", 0);
    }

    public p homePopupAdLast() {
        return stringField("homePopupAdLast", "");
    }

    public k homePopupAdLastTime() {
        return longField("homePopupAdLastTime", 0L);
    }

    public i insatllAppFirst() {
        return intField("insatllAppFirst", -8);
    }

    public p insatllAppFirstData() {
        return stringField("insatllAppFirstData", "");
    }

    public k installApplastNoticeTime() {
        return longField("installApplastNoticeTime", 0L);
    }

    public org.androidannotations.api.sharedpreferences.d isAcActived() {
        return booleanField("isAcActived", false);
    }

    public org.androidannotations.api.sharedpreferences.d isAutoWifiDownUpdate() {
        return booleanField("isAutoWifiDownUpdate", true);
    }

    public i isBsideInt() {
        return intField("isBsideInt", 0);
    }

    public org.androidannotations.api.sharedpreferences.d isCanShowAddShortcut() {
        return booleanField("isCanShowAddShortcut", true);
    }

    public org.androidannotations.api.sharedpreferences.d isFcActived() {
        return booleanField("isFcActived", false);
    }

    public org.androidannotations.api.sharedpreferences.d isFightActivity() {
        return booleanField("isFightActivity", false);
    }

    public org.androidannotations.api.sharedpreferences.d isFirst35() {
        return booleanField("isFirst35", true);
    }

    public org.androidannotations.api.sharedpreferences.d isFirstClickClassify() {
        return booleanField("isFirstClickClassify", true);
    }

    public org.androidannotations.api.sharedpreferences.d isFirstCommendVersion() {
        return booleanField("isFirstCommendVersion", true);
    }

    public org.androidannotations.api.sharedpreferences.d isFirstCouldShowPopw() {
        return booleanField("isFirstCouldShowPopw", true);
    }

    public org.androidannotations.api.sharedpreferences.d isFirstCustomApk() {
        return booleanField("isFirstCustomApk", true);
    }

    public org.androidannotations.api.sharedpreferences.d isFirstLocalShowPopw() {
        return booleanField("isFirstLocalShowPopw", true);
    }

    public org.androidannotations.api.sharedpreferences.d isFirstRemeShowPopw() {
        return booleanField("isFirstRemeShowPopw", true);
    }

    public org.androidannotations.api.sharedpreferences.d isFirstRun() {
        return booleanField("isFirstRun", true);
    }

    public org.androidannotations.api.sharedpreferences.d isFirstRunApkBackup() {
        return booleanField("isFirstRunApkBackup", true);
    }

    public k isFirstRunApkBackupLong() {
        return longField("isFirstRunApkBackupLong", 0L);
    }

    public k isFirstRunGameCarefullyLong() {
        return longField("isFirstRunGameCarefullyLong", 0L);
    }

    public org.androidannotations.api.sharedpreferences.d isFirstRunRecomeWifi() {
        return booleanField("isFirstRunRecomeWifi", true);
    }

    public org.androidannotations.api.sharedpreferences.d isFirstbuyShowPopw() {
        return booleanField("isFirstbuyShowPopw", true);
    }

    public org.androidannotations.api.sharedpreferences.d isHideAdBlock() {
        return booleanField("isHideAdBlock", false);
    }

    public org.androidannotations.api.sharedpreferences.d isHomepagePlayVideo() {
        return booleanField("isHomepagePlayVideo", true);
    }

    public org.androidannotations.api.sharedpreferences.d isLogin() {
        return booleanField("isLogin", false);
    }

    public org.androidannotations.api.sharedpreferences.d isNewFinishedGame() {
        return booleanField("isNewFinishedGame", false);
    }

    public p isNoShowAddShortcut() {
        return stringField("isNoShowAddShortcut", "");
    }

    public org.androidannotations.api.sharedpreferences.d isOnlyWifiReconnect() {
        return booleanField("isOnlyWifiReconnect", true);
    }

    public org.androidannotations.api.sharedpreferences.d isQuarkEnable() {
        return booleanField("isQuarkEnable", true);
    }

    public org.androidannotations.api.sharedpreferences.d isQuarkSilentDownload() {
        return booleanField("isQuarkSilentDownload", true);
    }

    public org.androidannotations.api.sharedpreferences.d isReloadClassify() {
        return booleanField("isReloadClassify", true);
    }

    public org.androidannotations.api.sharedpreferences.d isShowEditorRecoomand() {
        return booleanField("isShowEditorRecoomand", true);
    }

    public org.androidannotations.api.sharedpreferences.d isShowLuckyEggBadge() {
        return booleanField("isShowLuckyEggBadge", true);
    }

    public org.androidannotations.api.sharedpreferences.d isShowSplash() {
        return booleanField("isShowSplash", false);
    }

    public org.androidannotations.api.sharedpreferences.d isShowVideo() {
        return booleanField("isShowVideo", false);
    }

    public org.androidannotations.api.sharedpreferences.d isWifiConnectedBefore() {
        return booleanField("isWifiConnectedBefore", false);
    }

    public k lastApplyReadPhonePermission() {
        return longField("lastApplyReadPhonePermission", 0L);
    }

    public k lastApplyReadPhonePermissionOnRecom() {
        return longField("lastApplyReadPhonePermissionOnRecom", 0L);
    }

    public k lastCheckInTime() {
        return longField("lastCheckInTime", 0L);
    }

    public k lastCheckTokenTick() {
        return longField("lastCheckTokenTick", 0L);
    }

    public p lastClickPageAD() {
        return stringField("lastClickPageAD", "12345");
    }

    public k lastGameShowOnlineCouponTime() {
        return longField("lastGameShowOnlineCouponTime", 0L);
    }

    public k lastGameShowOnlineCouponTimeGuest() {
        return longField("lastGameShowOnlineCouponTimeGuest", 0L);
    }

    public p lastGameTimePeriod() {
        return stringField("lastGameTimePeriod", "");
    }

    public p lastGameTimePeriodGuest() {
        return stringField("lastGameTimePeriodGuest", "");
    }

    public p lastHomeDataMd5() {
        return stringField("lastHomeDataMd5", "");
    }

    public p lastInstallApp() {
        return stringField("lastInstallApp", "");
    }

    public p lastInstallAppFinish() {
        return stringField("lastInstallAppFinish", "");
    }

    public p lastLaunchModGameId() {
        return stringField("lastLaunchModGameId", "");
    }

    public p lastLoginAccount() {
        return stringField("lastLoginAccount", "");
    }

    public k lastMainShowOnlineCouponTime() {
        return longField("lastMainShowOnlineCouponTime", 0L);
    }

    public k lastMainShowOnlineCouponTimeGuest() {
        return longField("lastMainShowOnlineCouponTimeGuest", 0L);
    }

    public p lastMainTimePeriod() {
        return stringField("lastMainTimePeriod", "");
    }

    public p lastMainTimePeriodGuest() {
        return stringField("lastMainTimePeriodGuest", "");
    }

    public k lastQuitShowOnlineCouponTime() {
        return longField("lastQuitShowOnlineCouponTime", 0L);
    }

    public k lastQuitShowOnlineCouponTimeGuset() {
        return longField("lastQuitShowOnlineCouponTimeGuset", 0L);
    }

    public k lastRealNameCheckTime() {
        return longField("lastRealNameCheckTime", 0L);
    }

    public k lastSendAppTime() {
        return longField("lastSendAppTime", 0L);
    }

    public k lastShowBespeakTipTime() {
        return longField("lastShowBespeakTipTime", 0L);
    }

    public k lastShowLoginGuiedTime() {
        return longField("lastShowLoginGuiedTime", 0L);
    }

    public k lastShowNotInstallTime() {
        return longField("lastShowNotInstallTime", 0L);
    }

    public k lastShowNotOpenTime() {
        return longField("lastShowNotOpenTime", 0L);
    }

    public k lastShowRealNameTime() {
        return longField("lastShowRealNameTime", 0L);
    }

    public p lastShowSplashImage() {
        return stringField("lastShowSplashImage", "");
    }

    public p lastShowTOUTIAOAd() {
        return stringField("lastShowTOUTIAOAd", "");
    }

    public p lastStartSimulatorCore() {
        return stringField("lastStartSimulatorCore", "");
    }

    public p lastTopTip() {
        return stringField("lastTopTip", "");
    }

    public k last_update_time() {
        return longField("last_update_time", 0L);
    }

    public org.androidannotations.api.sharedpreferences.d launch_game_switch() {
        return booleanField("launch_game_switch", true);
    }

    public p liveSubtitle() {
        return stringField("liveSubtitle", "直播火热内侧中");
    }

    public p liveTitle() {
        return stringField("liveTitle", "啪友直播");
    }

    public p localUserIcon() {
        return stringField("localUserIcon", "");
    }

    public p location() {
        return stringField("location", "");
    }

    public p lodingImageMD5() {
        return stringField("lodingImageMD5", "");
    }

    public org.androidannotations.api.sharedpreferences.d loginPermissHasallow() {
        return booleanField("loginPermissHasallow", false);
    }

    public p md5FileTag() {
        return stringField("md5FileTag", "");
    }

    public p mod_enhance_ad_cfg() {
        return stringField("mod_enhance_ad_cfg", "");
    }

    public p mod_normal_ad_cfg() {
        return stringField("mod_normal_ad_cfg", "");
    }

    public p myGameAllTabSort() {
        return stringField("myGameAllTabSort", "");
    }

    public p myGameTabAdShowIndex() {
        return stringField("myGameTabAdShowIndex", "");
    }

    public org.androidannotations.api.sharedpreferences.d needShowPermissdialog() {
        return booleanField("needShowPermissdialog", true);
    }

    public org.androidannotations.api.sharedpreferences.d needsendRigeister() {
        return booleanField("needsendRigeister", true);
    }

    public i net_game_count_down() {
        return intField("net_game_count_down", 5000);
    }

    public org.androidannotations.api.sharedpreferences.d noFavoriteTips() {
        return booleanField("noFavoriteTips", false);
    }

    public org.androidannotations.api.sharedpreferences.d noPromptDownload() {
        return booleanField("noPromptDownload", false);
    }

    public org.androidannotations.api.sharedpreferences.d non_online_user_switch() {
        return booleanField("non_online_user_switch", false);
    }

    public i normalDownloadCount() {
        return intField("normalDownloadCount", 0);
    }

    public p offlineId() {
        return stringField("offlineId", "");
    }

    public p packageName() {
        return stringField("packageName", "com.join.android.app.mgsim.wufun");
    }

    public p packageType() {
        return stringField("packageType", "wufunNormal");
    }

    public i pageVersion() {
        return intField("pageVersion", 0);
    }

    public p pd_ad_config() {
        return stringField("pd_ad_config", "");
    }

    public p platform() {
        return stringField("platform", "wufun");
    }

    public org.androidannotations.api.sharedpreferences.d plugHasUpdate() {
        return booleanField("plugHasUpdate", false);
    }

    public p privateDomainFeedbackInfo() {
        return stringField("privateDomainFeedbackInfo", "");
    }

    public i pspAdShowTime() {
        return intField("pspAdShowTime", 5);
    }

    public i pspAdShowTimeSwitch() {
        return intField("pspAdShowTimeSwitch", 1);
    }

    public p pspGameAdCfg() {
        return stringField("pspGameAdCfg", "");
    }

    public p quarkGameDownload() {
        return stringField("quarkGameDownload", "");
    }

    public i quark_click_count() {
        return intField("quark_click_count", 0);
    }

    public i quark_display_count() {
        return intField("quark_display_count", 0);
    }

    public i quark_display_mode() {
        return intField("quark_display_mode", 0);
    }

    public i quark_feed_back_not_ask() {
        return intField("quark_feed_back_not_ask", 0);
    }

    public p quark_last_down_game_info() {
        return stringField("quark_last_down_game_info", "");
    }

    public org.androidannotations.api.sharedpreferences.d rankNotify() {
        return booleanField("rankNotify", true);
    }

    public p rankingMenu() {
        return stringField("rankingMenu", "1|网游榜,2|单机榜,3|模拟器榜");
    }

    public p rankingMenu2() {
        return stringField("rankingMenu2", "[{\"id\":1,\"title\":\"网游榜\"},{\"id\":2,\"title\":\"单机榜\"},{\"id\":3,\"title\":\"模拟器榜\"}]");
    }

    public p recomDataJson() {
        return stringField("recomDataJson", "");
    }

    public p rpcUserId() {
        return stringField("rpcUserId", "");
    }

    public i runRomFirst() {
        return intField("runRomFirst", -8);
    }

    public p sdcardData() {
        return stringField("sdcardData", "");
    }

    public org.androidannotations.api.sharedpreferences.d sdcardisFirst() {
        return booleanField("sdcardisFirst", true);
    }

    public p searchHintCache() {
        return stringField("searchHintCache", "");
    }

    public p searchguesslikeData() {
        return stringField("searchguesslikeData", "");
    }

    public org.androidannotations.api.sharedpreferences.d shareTipClosed() {
        return booleanField("shareTipClosed", false);
    }

    public org.androidannotations.api.sharedpreferences.d showAnBattle() {
        return booleanField("showAnBattle", false);
    }

    public org.androidannotations.api.sharedpreferences.d showGuideCreateEndGame() {
        return booleanField("showGuideCreateEndGame", true);
    }

    public org.androidannotations.api.sharedpreferences.d showHistroyHint() {
        return booleanField("showHistroyHint", true);
    }

    public p showIndex() {
        return stringField("showIndex", "2");
    }

    public p showName() {
        return stringField("showName", "");
    }

    public org.androidannotations.api.sharedpreferences.d show_unknown_source() {
        return booleanField("show_unknown_source", false);
    }

    public org.androidannotations.api.sharedpreferences.d simulatorLaunchAchievementTabRedPointShown() {
        return booleanField("simulatorLaunchAchievementTabRedPointShown", true);
    }

    public p simulator_exit_information_cfg() {
        return stringField("simulator_exit_information_cfg", "");
    }

    public p simulator_exit_open_cfg() {
        return stringField("simulator_exit_open_cfg", "");
    }

    public p simulator_fc_cfg() {
        return stringField("simulator_fc_cfg", "");
    }

    public p simulator_gba_cfg() {
        return stringField("simulator_gba_cfg", "");
    }

    public p simulator_gold_finger_cfg() {
        return stringField("simulator_gold_finger_cfg", "");
    }

    public p simulator_jj_cfg() {
        return stringField("simulator_jj_cfg", "");
    }

    public i simulator_last_ad_position() {
        return intField("simulator_last_ad_position", 0);
    }

    public p simulator_path_cfg() {
        return stringField("simulator_path_cfg", "");
    }

    public p simulator_play_records() {
        return stringField("simulator_play_records", "");
    }

    public p simulator_psp_cfg() {
        return stringField("simulator_psp_cfg", "");
    }

    public p singleGameAdCfg() {
        return stringField("singleGameAdCfg", "");
    }

    public p singleGameShowDialog() {
        return stringField("singleGameShowDialog", "");
    }

    public org.androidannotations.api.sharedpreferences.d soundnowIsNoSound() {
        return booleanField("soundnowIsNoSound", true);
    }

    public p ssidBefore() {
        return stringField("ssidBefore", "-1");
    }

    public p ssp_cfg() {
        return stringField("ssp_cfg", "");
    }

    public i startGameShowLoginNumber() {
        return intField("startGameShowLoginNumber", -1);
    }

    public i startgameLogintimes_open_login() {
        return intField("startgameLogintimes_open_login", -1);
    }

    public i startgametimes_open_certify() {
        return intField("startgametimes_open_certify", -1);
    }

    public p statisticVisit() {
        return stringField("statisticVisit", "-1");
    }

    public p thAdSwitchCfg() {
        return stringField("thAdSwitchCfg", "");
    }

    public i todayShowRealNameCount() {
        return intField("todayShowRealNameCount", -1);
    }

    public p token() {
        return stringField("token", "");
    }

    public k touriseTUID() {
        return longField("touriseTUID", 0L);
    }

    public org.androidannotations.api.sharedpreferences.d uncompleteDownload() {
        return booleanField("uncompleteDownload", true);
    }

    public p upLoadConfig() {
        return stringField("upLoadConfig", "");
    }

    public p upLoadFileName() {
        return stringField("upLoadFileName", "");
    }

    public p upLoadGame() {
        return stringField("upLoadGame", "");
    }

    public i upLoadState() {
        return intField("upLoadState", 0);
    }

    public org.androidannotations.api.sharedpreferences.d uploadRecoderNotice() {
        return booleanField("uploadRecoderNotice", true);
    }

    public p uploadType2() {
        return stringField("uploadType2", "");
    }

    public p userCenterViewConfigs() {
        return stringField("userCenterViewConfigs", "");
    }

    public p userCenterViewConfigsv2() {
        return stringField("userCenterViewConfigsv2", "");
    }

    public p userId() {
        return stringField("userId", "");
    }

    public k userLastStartAPP() {
        return longField("userLastStartAPP", 0L);
    }

    public k userLastStartGame() {
        return longField("userLastStartGame", 0L);
    }

    public i versionCode() {
        return intField(TTDownloadField.TT_VERSION_CODE, 0);
    }

    public p video_init_cfg() {
        return stringField("video_init_cfg", "");
    }

    public i virtualDeviceState() {
        return intField("virtualDeviceState", -1);
    }

    public org.androidannotations.api.sharedpreferences.d w_channel_info_switch() {
        return booleanField("w_channel_info_switch", true);
    }

    public p web_disk_cfg() {
        return stringField("web_disk_cfg", "");
    }

    public p web_disk_position() {
        return stringField("web_disk_position", "{\"single_game\":{\"download_mode\":\"SIMPLE\",\"setup_mode\":\"VM\"},\"simulator_game\":{\"download_mode\":\"SIMPLE\",\"setup_mode\":\"VM\"},\"pc_game\":{\"download_mode\":\"PRIVATE_DOMAIN\",\"setup_mode\":\"NON_VM\"}}");
    }

    public i web_disk_switch() {
        return intField("web_disk_switch", 1);
    }

    public p wf_app_about() {
        return stringField("wf_app_about", "[{\"tpl_type\":0,\"bg_color\":\"\",\"title\":\"悟饭官网\",\"sub_title\":\"top_menu\",\"big_pic\":\"\",\"big_pic_h\":\"\",\"v_url\":\"\",\"label\":\"top_menu\",\"description\":\"www.5fun.com\",\"ad_switch\":1,\"quit_switch\":0,\"jp_info\":{\"link_type\":5,\"link_type_val\":\"http://www.5fun.com\",\"crc_link_type_val\":\"1287161774\",\"jump_type\":0,\"third_type\":0,\"is_more\":0,\"tpl_type\":0}},{\"tpl_type\":0,\"bg_color\":\"\",\"title\":\"悟饭公众号\",\"sub_title\":\"top_menu\",\"big_pic\":\"\",\"big_pic_h\":\"\",\"v_url\":\"\",\"label\":\"top_menu\",\"description\":\"wufangame\",\"ad_switch\":1,\"quit_switch\":0,\"jp_info\":{\"link_type\":5,\"link_type_val\":\"action_copy\",\"crc_link_type_val\":\"995819660\",\"jump_type\":0,\"third_type\":0,\"is_more\":0,\"tpl_type\":0}},{\"tpl_type\":0,\"bg_color\":\"\",\"title\":\"隐私政策\",\"sub_title\":\"top_menu\",\"big_pic\":\"\",\"big_pic_h\":\"\",\"v_url\":\"\",\"label\":\"top_menu\",\"description\":\"\",\"ad_switch\":1,\"quit_switch\":0,\"jp_info\":{\"link_type\":4,\"link_type_val\":\"http://anv3cjapi.wufan88.com/static/yszc.html?ver=10&type=0\",\"crc_link_type_val\":\"3126855503\",\"jump_type\":0,\"third_type\":0,\"is_more\":0,\"tpl_type\":0}},{\"tpl_type\":0,\"bg_color\":\"\",\"title\":\"用户协议\",\"sub_title\":\"top_menu\",\"big_pic\":\"\",\"big_pic_h\":\"\",\"v_url\":\"\",\"label\":\"top_menu\",\"description\":\"\",\"ad_switch\":1,\"quit_switch\":0,\"jp_info\":{\"link_type\":4,\"link_type_val\":\"http://anv3cjapi.wufan88.com/static/yhxkxy.html?ver=10&type=0\",\"crc_link_type_val\":\"3958127345\",\"jump_type\":0,\"third_type\":0,\"is_more\":0,\"tpl_type\":0}},{\"tpl_type\":0,\"bg_color\":\"\",\"title\":\"免责声明\",\"sub_title\":\"top_menu\",\"big_pic\":\"\",\"big_pic_h\":\"\",\"v_url\":\"\",\"label\":\"top_menu\",\"description\":\"\",\"ad_switch\":1,\"quit_switch\":0,\"jp_info\":{\"link_type\":4,\"link_type_val\":\"http://anv3cjapi.5fun.com/static/wf_mianze.html\",\"crc_link_type_val\":\"1302798286\",\"jump_type\":0,\"third_type\":0,\"is_more\":0,\"tpl_type\":0}},{\"tpl_type\":0,\"bg_color\":\"\",\"title\":\"版权所有：嘉兴微梦科技有限公司\",\"sub_title\":\"bottom\",\"big_pic\":\"\",\"big_pic_h\":\"\",\"v_url\":\"\",\"label\":\"bottom\",\"description\":\"\",\"ad_switch\":1,\"quit_switch\":0,\"jp_info\":{\"link_type\":5,\"link_type_val\":\"http://www.5fun.com\",\"crc_link_type_val\":\"1287161774\",\"jump_type\":0,\"third_type\":0,\"is_more\":0,\"tpl_type\":0}},{\"tpl_type\":0,\"bg_color\":\"\",\"title\":\"备案号：浙ICP备2021037593号-8A\",\"sub_title\":\"bottom\",\"big_pic\":\"\",\"big_pic_h\":\"\",\"v_url\":\"\",\"label\":\"bottom\",\"description\":\"\",\"ad_switch\":1,\"quit_switch\":0,\"jp_info\":{\"link_type\":5,\"link_type_val\":\"https://beian.miit.gov.cn\",\"crc_link_type_val\":\"2117562251\",\"jump_type\":0,\"third_type\":0,\"is_more\":0,\"tpl_type\":0}},{\"tpl_type\":0,\"bg_color\":\"\",\"title\":\"增值电信业务许可证：浙B2-20220692\",\"sub_title\":\"bottom\",\"big_pic\":\"\",\"big_pic_h\":\"\",\"v_url\":\"\",\"label\":\"bottom\",\"description\":\"\",\"ad_switch\":1,\"quit_switch\":0,\"jp_info\":{\"link_type\":5,\"link_type_val\":\"\\\"https://tsm.miit.gov.cn\\\"\",\"crc_link_type_val\":\"1271180405\",\"jump_type\":0,\"third_type\":0,\"is_more\":0,\"tpl_type\":0}}]");
    }

    public i wifiDownNumber() {
        return intField("wifiDownNumber", -1);
    }

    public org.androidannotations.api.sharedpreferences.d wifiIsOpen() {
        return booleanField("wifiIsOpen", true);
    }

    public p worldStart() {
        return stringField("worldStart", "");
    }

    public p worshipMarqueeHistory() {
        return stringField("worshipMarqueeHistory", "");
    }

    public p wx_open_appid() {
        return stringField("wx_open_appid", "");
    }
}
