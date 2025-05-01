package com.join.mgps.activity.gamedetail;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.MApplication;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.http.c;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.e;
import com.join.android.app.common.utils.g;
import com.join.android.app.common.utils.j;
import com.join.android.app.common.utils.n;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.StartGameMeta;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.j0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.v0;
import com.join.mgps.activity.gamedetail.CommonWebviewFragment;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.adapter.FullScreenActivity_;
import com.join.mgps.customview.LJNestScrollWebView;
import com.join.mgps.dialog.d1;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.p;
import com.papa.sim.statistic.s;
import com.papa91.wrapper.UserPrefs;
import com.php25.PDownload.d;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.commonsdk.UMConfigure;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import p1.f;
@EFragment(R.layout.fragment_common_webview)
/* loaded from: classes4.dex */
public class CommonWebviewFragment extends Fragment implements LJNestScrollWebView.b {
    private Context context;
    @ViewById
    TextView failedMessage;
    private long lastClick;
    @ViewById
    LinearLayout loding_faile;
    @ViewById
    LinearLayout loding_layout;
    private d1 mDataLoadingDialog;
    @Pref
    PrefDef_ prefDef;
    String url;
    @ViewById
    LJNestScrollWebView web;
    @ViewById
    RelativeLayout weblayout;
    private View xCustomView;
    String TAG = "ShareWebActivity";
    private Handler mHandler = new Handler();
    private boolean isError = false;
    d1 dialog = null;

    /* loaded from: classes4.dex */
    public class WebJSPInterfaceMethedBean {
        public WebJSPInterfaceMethedBean() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit lambda$instalApk$0(String str) {
            e.l0(CommonWebviewFragment.this.context).w(CommonWebviewFragment.this.context, new File(str));
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit lambda$instalApkByPackageName$1(String str) {
            e.l0(CommonWebviewFragment.this.context).w(CommonWebviewFragment.this.context, new File(str));
            return null;
        }

        @JavascriptInterface
        public void changeAccount(String str) {
            try {
                AccountUtil_.getInstance_(CommonWebviewFragment.this.context).saveAccountData(b3.a.a((AccountBean) JsonMapper.getInstance().fromJson(str, AccountBean.class)), CommonWebviewFragment.this.context);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @JavascriptInterface
        public boolean checkAppHasInstall(String str) {
            try {
                return e.l0(CommonWebviewFragment.this.context).d(CommonWebviewFragment.this.context, str);
            } catch (Exception e5) {
                e5.printStackTrace();
                return false;
            }
        }

        @JavascriptInterface
        public String checkAppInfo(String str) {
            APKUtils.a aVar;
            try {
                aVar = e.l0(CommonWebviewFragment.this.context).l(CommonWebviewFragment.this.context, str);
            } catch (Exception e5) {
                e5.printStackTrace();
                aVar = null;
            }
            return JsonMapper.getInstance().toJson(aVar);
        }

        @JavascriptInterface
        public int checkLiveRes() {
            return 0;
        }

        @JavascriptInterface
        public int checkNetWork() {
            return j.j(CommonWebviewFragment.this.context) ? 1 : 0;
        }

        @JavascriptInterface
        public String checkWufunPapaPlatform() {
            return "wufun";
        }

        @JavascriptInterface
        public void checkin(final boolean z4) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.8
                @Override // java.lang.Runnable
                public void run() {
                    boolean g4 = g.g(CommonWebviewFragment.this.prefDef.lastCheckInTime().d().longValue());
                    if (z4) {
                        if (g4) {
                            return;
                        }
                        CommonWebviewFragment.this.prefDef.lastCheckInTime().g(Long.valueOf(System.currentTimeMillis()));
                    } else if (g4) {
                        CommonWebviewFragment.this.prefDef.lastCheckInTime().g(0L);
                    }
                }
            });
        }

        @JavascriptInterface
        public void copyToClipboard(String str) {
            if (g2.i(str)) {
                j0.M(CommonWebviewFragment.this.context, str);
                l2.a(CommonWebviewFragment.this.context).b("复制成功！");
            }
        }

        @JavascriptInterface
        public void downloadApkGameByUrl(String str, String str2, String str3, String str4) {
        }

        @JavascriptInterface
        public void downloadFile(String str, String str2) {
            UtilsMy.P0(CommonWebviewFragment.this.context, str, str2);
        }

        @JavascriptInterface
        public void downloadGame(String str) {
            d.c((DownloadTask) JsonMapper.getInstance().fromJson(str, DownloadTask.class), CommonWebviewFragment.this.context);
        }

        @JavascriptInterface
        public void downloadGameByGameId(String str) {
        }

        @JavascriptInterface
        public void downloadGameByGameIdAndUrl(String str, String str2) {
        }

        @JavascriptInterface
        public void downloadGameByGameIdIfNoGame(String str) {
        }

        @JavascriptInterface
        public String findAllGames() {
            List<DownloadTask> d5 = f.K().d();
            if (d5 == null || d5.size() <= 0) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            Iterator<DownloadTask> it2 = d5.iterator();
            while (it2.hasNext()) {
                stringBuffer.append("," + it2.next().getCrc_link_type_val());
            }
            return stringBuffer.toString().replaceFirst(",", "");
        }

        @JavascriptInterface
        public void getAccount() {
        }

        @JavascriptInterface
        public String getAesAndroidId() {
            return g2.g(MApplication.G);
        }

        @JavascriptInterface
        public String getAllH5game() {
            List<DownloadTask> t4 = f.K().t();
            if (t4 != null) {
                ArrayList arrayList = new ArrayList();
                for (DownloadTask downloadTask : t4) {
                    arrayList.add(downloadTask.getCrc_link_type_val());
                }
                return JsonMapper.getInstance().toJson(arrayList);
            }
            return JsonMapper.getInstance().toJson(new ArrayList());
        }

        @JavascriptInterface
        public String getAndroidId() {
            return n.n(CommonWebviewFragment.this.context).e(CommonWebviewFragment.this.context);
        }

        @JavascriptInterface
        public String getAndroidVersion() {
            return n.n(CommonWebviewFragment.this.context).s();
        }

        @JavascriptInterface
        public String getAppversionName() {
            return n.n(CommonWebviewFragment.this.context).z();
        }

        @JavascriptInterface
        public String getDeviceId() {
            return s.f(CommonWebviewFragment.this.context).b();
        }

        @JavascriptInterface
        public String getIMEI() {
            return s.f(CommonWebviewFragment.this.context).b();
        }

        @JavascriptInterface
        public int getNowVersion() {
            return n.n(CommonWebviewFragment.this.context).y();
        }

        @JavascriptInterface
        public String getPackageName() {
            return CommonWebviewFragment.this.getContext().getPackageName();
        }

        @JavascriptInterface
        public String getPhoneModle() {
            return n.n(CommonWebviewFragment.this.context).q();
        }

        @JavascriptInterface
        public String getSdkIntentData(String str) {
            SharedPreferences sharedPreferences = CommonWebviewFragment.this.context.getSharedPreferences("Papa_Stat_SharedPreferences", 0);
            return sharedPreferences.getString("papasdk_" + str, "");
        }

        @JavascriptInterface
        public int getSingleGameADCount() {
            return new UserPrefs(CommonWebviewFragment.this.context).getAdGamesHasSeeCount();
        }

        @JavascriptInterface
        public String getStringByKey(String str) {
            SharedPreferences sharedPreferences = CommonWebviewFragment.this.context.getSharedPreferences("Papa_Stat_SharedPreferences", 0);
            return sharedPreferences.getString("papaH5_" + str, "");
        }

        @JavascriptInterface
        public String getUMIDString() {
            try {
                return UMConfigure.getUMIDString(CommonWebviewFragment.this.context);
            } catch (Exception unused) {
                return "";
            }
        }

        @JavascriptInterface
        public String getVendor() {
            return n.n(CommonWebviewFragment.this.context).x();
        }

        @JavascriptInterface
        public void goAccountCenter() {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.12
                @Override // java.lang.Runnable
                public void run() {
                    IntentUtil.getInstance().goAccountCenterActivity(CommonWebviewFragment.this.context);
                }
            });
        }

        @JavascriptInterface
        public void goAccountDetial() {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.17
                @Override // java.lang.Runnable
                public void run() {
                    IntentUtil.getInstance().goMYAccountDetialActivity(CommonWebviewFragment.this.context);
                }
            });
        }

        @JavascriptInterface
        public void goBackUrl(final String str) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.7
                @Override // java.lang.Runnable
                public void run() {
                    if ("".equals(str)) {
                        return;
                    }
                    CommonWebviewFragment.this.web.w(str);
                }
            });
        }

        @JavascriptInterface
        public void goCodesBoxActivity() {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.14
                @Override // java.lang.Runnable
                public void run() {
                    IntentUtil.getInstance().goCodesBoxActivity(CommonWebviewFragment.this.context);
                }
            });
        }

        @JavascriptInterface
        public void goDownloadCenter() {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.15
                @Override // java.lang.Runnable
                public void run() {
                    IntentUtil.getInstance().goDownloadCenterActivity(CommonWebviewFragment.this.context);
                }
            });
        }

        @JavascriptInterface
        public void goGameDetail(String str) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(1);
            intentDateBean.setCrc_link_type_val(str);
            intentDateBean.setExtBean(new ExtBean(120));
            IntentUtil.getInstance().intentActivity(CommonWebviewFragment.this.getContext(), intentDateBean);
        }

        @JavascriptInterface
        public void goHandShark() {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.13
                @Override // java.lang.Runnable
                public void run() {
                    IntentUtil.getInstance().goJoystickManager(CommonWebviewFragment.this.context);
                }
            });
        }

        @JavascriptInterface
        public void goProfileMessage() {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.18
                @Override // java.lang.Runnable
                public void run() {
                    IntentUtil.getInstance().goForumProfileMessageActivity(CommonWebviewFragment.this.context);
                }
            });
        }

        @JavascriptInterface
        public void goQQGroup(final String str) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.21
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IntentUtil.getInstance().goQQGroup(CommonWebviewFragment.this.context, str);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        }

        @JavascriptInterface
        public void goStartLive() {
        }

        @JavascriptInterface
        public int inquiryGameStatus(String str) {
            return -1;
        }

        @JavascriptInterface
        public int inquiryGameStatusByPackage(String str) {
            List<DownloadTask> H = f.K().H(str);
            if (H == null || H.size() <= 0) {
                return -1;
            }
            return H.get(0).getStatus();
        }

        @JavascriptInterface
        public int instalApk(String str) {
            DownloadTask F = f.K().F(str);
            if (F == null || !Dtype.android.name().equals(F.getFileType())) {
                return -1;
            }
            APKUtils.k0(F.getGameZipPath(), F, new Function1() { // from class: com.join.mgps.activity.gamedetail.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit lambda$instalApk$0;
                    lambda$instalApk$0 = CommonWebviewFragment.WebJSPInterfaceMethedBean.this.lambda$instalApk$0((String) obj);
                    return lambda$instalApk$0;
                }
            });
            return 1;
        }

        @JavascriptInterface
        public int instalApkByPackageName(String str) {
            List<DownloadTask> H = f.K().H(str);
            if (H == null || H.size() <= 0) {
                return 1;
            }
            DownloadTask downloadTask = H.get(0);
            APKUtils.k0(downloadTask.getGameZipPath(), downloadTask, new Function1() { // from class: com.join.mgps.activity.gamedetail.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit lambda$instalApkByPackageName$1;
                    lambda$instalApkByPackageName$1 = CommonWebviewFragment.WebJSPInterfaceMethedBean.this.lambda$instalApkByPackageName$1((String) obj);
                    return lambda$instalApkByPackageName$1;
                }
            });
            return 1;
        }

        @JavascriptInterface
        public void intentQQ(final String str) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.10
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        CommonWebviewFragment.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + str + "&version=1")));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        }

        @JavascriptInterface
        public void intentToCompletAccount() {
        }

        @JavascriptInterface
        public void joinAction(final String str, final String str2) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.3
                @Override // java.lang.Runnable
                public void run() {
                    p.l(CommonWebviewFragment.this.context).p(str, str2, AccountUtil_.getInstance_(CommonWebviewFragment.this.context).getUid());
                }
            });
        }

        @JavascriptInterface
        public void jumpGameMatch(String str) {
        }

        @JavascriptInterface
        public void liveIntentTo(int i4) {
        }

        @JavascriptInterface
        public void login() {
        }

        @JavascriptInterface
        public void openAction(final String str, final String str2) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.2
                @Override // java.lang.Runnable
                public void run() {
                    p.l(CommonWebviewFragment.this.context).p(str, str2, AccountUtil_.getInstance_(CommonWebviewFragment.this.context).getUid());
                }
            });
        }

        @JavascriptInterface
        public void payByPapa(String str, int i4, String str2, String str3, String str4, int i5, String str5, String str6, String str7, String str8, String str9, String str10) {
        }

        @JavascriptInterface
        public void payByPapa(String str, String str2, int i4, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        }

        @JavascriptInterface
        public void payGameFinish(int i4) {
        }

        @JavascriptInterface
        public void playVideo(final String str, final String str2) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.9
                @Override // java.lang.Runnable
                public void run() {
                    FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                    videoInfo.m(str);
                    videoInfo.h(str2);
                    FullScreenActivity_.i0(CommonWebviewFragment.this.context).a(videoInfo).start();
                }
            });
        }

        @JavascriptInterface
        public void rechargePabiFrom(String str, int i4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        }

        @JavascriptInterface
        public void saveStringByKey(String str, String str2) {
            SharedPreferences.Editor edit = CommonWebviewFragment.this.context.getSharedPreferences("Papa_Stat_SharedPreferences", 0).edit();
            edit.putString("papaH5_" + str, str2);
            edit.commit();
        }

        @JavascriptInterface
        public void setFullScreenJs(String str) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.20
                @Override // java.lang.Runnable
                public void run() {
                    CommonWebviewFragment.this.setFullScreen();
                }
            });
        }

        @JavascriptInterface
        public void setQuitFullScreenJs(String str) {
        }

        @JavascriptInterface
        public void setScreenLandOrPort(int i4) {
        }

        @JavascriptInterface
        public void setTitle(String str) {
        }

        @JavascriptInterface
        public void shareFromJson(final String str) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.1
                @Override // java.lang.Runnable
                public void run() {
                    com.join.mgps.Util.s.s(CommonWebviewFragment.this.getContext(), str, 5);
                }
            });
        }

        @JavascriptInterface
        public void shareToOne(final int i4, final String str) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.6
                @Override // java.lang.Runnable
                public void run() {
                    ShareBean shareBean = (ShareBean) JsonMapper.getInstance().fromJson(str, ShareBean.class);
                    shareBean.setFrom(5);
                    com.join.mgps.Util.s.p(CommonWebviewFragment.this.context, i4, shareBean);
                }
            });
        }

        @JavascriptInterface
        public void shareToOneImageOrText(final int i4, final String str, final int i5) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.11
                @Override // java.lang.Runnable
                public void run() {
                    com.join.mgps.Util.s.q(CommonWebviewFragment.this.context, i4, str, i5, 5);
                }
            });
        }

        @JavascriptInterface
        public void showBackNew(boolean z4) {
        }

        @JavascriptInterface
        public void showDownLiveDialog() {
        }

        @JavascriptInterface
        public void showDownload(boolean z4) {
        }

        @JavascriptInterface
        public void showFinish(boolean z4) {
        }

        @JavascriptInterface
        public void showRefresh(boolean z4) {
        }

        @JavascriptInterface
        public void showSearch(boolean z4) {
        }

        @JavascriptInterface
        public void showShareButn(String str) {
        }

        @JavascriptInterface
        public void showTitle(boolean z4) {
        }

        @JavascriptInterface
        public void startGame(final String str, final String str2) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.4
                @Override // java.lang.Runnable
                public void run() {
                    boolean z4;
                    try {
                        List<DownloadTask> I = f.K().I(str);
                        DownloadTask downloadTask = null;
                        if (I != null && I.size() > 0) {
                            String str3 = "";
                            String str4 = "";
                            boolean z5 = false;
                            loop0: while (true) {
                                z4 = false;
                                for (DownloadTask downloadTask2 : I) {
                                    if (Dtype.MOD.name().equals(downloadTask2.getFileType())) {
                                        str3 = downloadTask2.getCrc_link_type_val();
                                        z5 = com.join.mgps.va.overmind.d.o().F(downloadTask2.getPackageName()) && downloadTask2.getStatus() == 5;
                                    } else {
                                        str4 = downloadTask2.getCrc_link_type_val();
                                        if (e.l0(CommonWebviewFragment.this.getContext()).d(CommonWebviewFragment.this.getContext(), downloadTask2.getPackageName()) && downloadTask2.getStatus() == 5) {
                                            z4 = true;
                                        }
                                    }
                                }
                                break loop0;
                            }
                            if (z5 && z4) {
                                downloadTask = f.K().F(str3);
                            } else if (z5) {
                                downloadTask = f.K().F(str3);
                            } else if (z4) {
                                downloadTask = f.K().F(str4);
                            } else {
                                downloadTask = f.K().F(str3);
                                if (downloadTask == null) {
                                    downloadTask = f.K().F(str4);
                                }
                            }
                        }
                        if (downloadTask == null) {
                            return;
                        }
                        if ("login".equals(str2)) {
                            UtilsMy.W3(CommonWebviewFragment.this.getContext(), downloadTask, str2);
                        } else {
                            UtilsMy.T3(CommonWebviewFragment.this.getContext(), downloadTask);
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        }

        @JavascriptInterface
        public void startGameFromJson(final String str) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.19
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (g2.h(str)) {
                            return;
                        }
                        StartGameMeta startGameMeta = (StartGameMeta) JsonMapper.getInstance().fromJson(str, StartGameMeta.class);
                        Intent intent = new Intent();
                        intent.addFlags(8388608);
                        intent.setComponent(new ComponentName(startGameMeta.getPackageName(), startGameMeta.getActivityName()));
                        String uid = AccountUtil_.getInstance_(CommonWebviewFragment.this.context).getUid();
                        intent.putExtra("uid", uid);
                        startGameMeta.setUserID(uid);
                        startGameMeta.setPa_package_name(CommonWebviewFragment.this.context.getPackageName());
                        intent.putExtra("jsonData", JsonMapper.getInstance().toJson(startGameMeta));
                        intent.setAction("android.intent.action.VIEW");
                        try {
                            CommonWebviewFragment.this.context.startActivity(intent);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            });
        }

        @JavascriptInterface
        public void startH5Game(String str) {
            CollectionBeanSub collectionBeanSub;
            DownloadTask downloadtaskDown;
            try {
                if (!g2.i(str) || (collectionBeanSub = (CollectionBeanSub) JsonMapper.getInstance().fromJson(str, CollectionBeanSub.class)) == null || (downloadtaskDown = collectionBeanSub.getDownloadtaskDown()) == null) {
                    return;
                }
                UtilsMy.T2(downloadtaskDown, CommonWebviewFragment.this.context);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @JavascriptInterface
        public void startIntent(final String str) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        IntentDateBean intentDateBean = (IntentDateBean) JsonMapper.getInstance().fromJson(str, IntentDateBean.class);
                        intentDateBean.setExtBean(new ExtBean(120));
                        IntentUtil.getInstance().intentActivity(CommonWebviewFragment.this.getContext(), intentDateBean);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            });
        }

        @JavascriptInterface
        public void startWechatApp(String str, String str2, String str3) {
            IWXAPI createWXAPI = WXAPIFactory.createWXAPI(CommonWebviewFragment.this.context, str);
            createWXAPI.registerApp(str);
            WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
            req.userName = str2;
            req.path = str3;
            req.miniprogramType = 0;
            createWXAPI.sendReq(req);
        }

        @JavascriptInterface
        public int stopDown(String str) {
            DownloadTask F = f.K().F(str);
            if (F == null) {
                return -1;
            }
            d.i(F);
            return 1;
        }

        @JavascriptInterface
        public int stopDownByPackageName(String str) {
            List<DownloadTask> H = f.K().H(str);
            if (H == null || H.size() == 0) {
                return -1;
            }
            for (DownloadTask downloadTask : H) {
                d.i(downloadTask);
            }
            return 1;
        }

        @JavascriptInterface
        public void toastText(final String str) {
            CommonWebviewFragment.this.mHandler.post(new Runnable() { // from class: com.join.mgps.activity.gamedetail.CommonWebviewFragment.WebJSPInterfaceMethedBean.16
                @Override // java.lang.Runnable
                public void run() {
                    l2.a(CommonWebviewFragment.this.context).b(str);
                }
            });
        }

        @JavascriptInterface
        public void updateAccount() {
        }

        @JavascriptInterface
        public void updateRealNameState() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class WebViewClientXY extends WebViewClient {
        public WebViewClientXY(Context context) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (str.endsWith(".zip")) {
                return;
            }
            String str2 = CommonWebviewFragment.this.TAG;
            v0.b(str2, "onPageFinished() called." + str);
            if (str.startsWith(com.facebook.common.util.f.f10923a) || str.startsWith("https") || str.startsWith("file://")) {
                CommonWebviewFragment.this.url = str;
            }
            if (!CommonWebviewFragment.this.url.equals("data:text/html,chromewebdata") && !CommonWebviewFragment.this.isError) {
                webView.getSettings().setBlockNetworkImage(false);
                webView.getLayoutParams().height = -2;
                return;
            }
            CommonWebviewFragment.this.showLodingFailed();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            String str2 = CommonWebviewFragment.this.TAG;
            v0.b(str2, "onPageStarted() called." + str);
            if (str.endsWith(".zip")) {
                return;
            }
            if (str.startsWith(com.facebook.common.util.f.f10923a) || str.startsWith("https") || str.startsWith("file://")) {
                CommonWebviewFragment.this.url = str;
            }
            CommonWebviewFragment.this.showLoding();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i4, String str, String str2) {
            super.onReceivedError(webView, i4, str, str2);
            String str3 = CommonWebviewFragment.this.TAG;
            v0.b(str3, "onReceivedError() called." + str2);
            if (str2.endsWith(".zip")) {
                return;
            }
            CommonWebviewFragment.this.isError = true;
            webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            CommonWebviewFragment.this.showLodingFailed();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError == 3 || primaryError == 5) {
                sslErrorHandler.proceed();
            }
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            v0.b(CommonWebviewFragment.this.TAG, "shouldOverrideUrlLoading() called.");
            if (!j.j(CommonWebviewFragment.this.context)) {
                l2.a(CommonWebviewFragment.this.context).b(CommonWebviewFragment.this.getString(R.string.net_connect_failed));
            } else if (!str.startsWith("weixin:")) {
                if (!str.startsWith(com.facebook.common.util.f.f10923a) && !str.startsWith("https") && !str.startsWith("file://")) {
                    try {
                        CommonWebviewFragment.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    return true;
                }
                CommonWebviewFragment.this.url = str;
                return super.shouldOverrideUrlLoading(webView, str);
            } else {
                try {
                    CommonWebviewFragment.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            return true;
        }
    }

    private void lodeWebView(String str) {
        String str2 = this.TAG;
        v0.b(str2, "lodeWebView() called." + str);
        try {
            if (j.j(getContext())) {
                LJNestScrollWebView lJNestScrollWebView = this.web;
                if (lJNestScrollWebView == null) {
                    return;
                }
                lJNestScrollWebView.setVisibility(0);
                this.web.setBarHeight(getResources().getDimensionPixelOffset(R.dimen.web_loding_progress_h));
                this.web.setClickable(true);
                this.web.setUseWideViewPort(true);
                this.web.setSupportZoom(false);
                this.web.setBuiltInZoomControls(false);
                this.web.setJavaScriptEnabled(true);
                this.web.setCacheMode(-1);
                this.web.setWebViewClient(new WebViewClientXY(getContext()));
                this.web.r(new WebJSPInterfaceMethedBean());
                this.web.w(str);
                this.web.setActivity(getActivity());
            } else {
                showLodingFailed();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullScreen() {
        getActivity().getWindow().setFlags(1024, 1024);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        v0.b(this.TAG, "afterView() called.");
        try {
            this.context = getContext();
            String string = getArguments().getString("url");
            this.url = string;
            if (string == null) {
                this.url = "";
            }
            if (c.f14632c && this.url.contains("http://")) {
                this.url = this.url.replace("http://", "https://");
            }
            if (!this.url.contains("http://") && !this.url.contains("file://") && !this.url.contains("https://")) {
                this.url = "https://" + this.url;
            }
            lodeWebView(this.url);
            TextView textView = this.failedMessage;
            if (textView != null) {
                textView.setText("网页加载失败，再试试吧~");
            }
            LJNestScrollWebView lJNestScrollWebView = this.web;
            if (lJNestScrollWebView != null) {
                lJNestScrollWebView.setMethodListenter(this);
            }
            this.dialog = b0.f0(this.context).x(this.context);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public boolean inCustomView() {
        return this.xCustomView != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void loding_faile() {
        v0.b(this.TAG, "loding_faile() called.");
        if (this.web != null) {
            this.isError = false;
            lodeWebView(this.url);
        }
    }

    @Override // com.join.mgps.customview.LJNestScrollWebView.b
    public void noMethod() {
        WebView webView = this.web.getWebView();
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        webView.goBack();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (bundle != null) {
            try {
                LJNestScrollWebView lJNestScrollWebView = this.web;
                if (lJNestScrollWebView != null) {
                    lJNestScrollWebView.getWebView().restoreState(bundle);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.join.mgps.customview.LJNestScrollWebView.b
    public void onHideCustomView() {
        this.xCustomView = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        LJNestScrollWebView lJNestScrollWebView = this.web;
        if (lJNestScrollWebView != null) {
            try {
                lJNestScrollWebView.getWebView().getClass().getMethod("onPause", new Class[0]).invoke(this.web.getWebView(), null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
        super.onPause();
    }

    @Override // com.join.mgps.customview.LJNestScrollWebView.b
    public void onReceivedTitle(String str) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.web.w("javascript:papaActivityOnResume()");
        LJNestScrollWebView lJNestScrollWebView = this.web;
        if (lJNestScrollWebView != null) {
            try {
                lJNestScrollWebView.getWebView().getClass().getMethod("onResume", new Class[0]).invoke(this.web.getWebView(), null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.web.getWebView().saveState(bundle);
    }

    @Override // com.join.mgps.customview.LJNestScrollWebView.b
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback, WebChromeClient webChromeClient) {
        this.xCustomView = view;
        if (view == null) {
            return;
        }
        this.weblayout.setVisibility(8);
        getActivity().setRequestedOrientation(0);
        setFullScreen();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        v0.b(this.TAG, "setNetwork() called.");
        UtilsMy.w3(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            v0.b(this.TAG, "showLoding() called.");
            this.loding_layout.setVisibility(8);
            this.loding_faile.setVisibility(8);
            LJNestScrollWebView lJNestScrollWebView = this.web;
            if (lJNestScrollWebView != null) {
                lJNestScrollWebView.setVisibility(0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            v0.b(this.TAG, "showLodingFailed() called.");
            this.loding_faile.setVisibility(0);
            this.loding_layout.setVisibility(8);
            LJNestScrollWebView lJNestScrollWebView = this.web;
            if (lJNestScrollWebView != null) {
                lJNestScrollWebView.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        try {
            v0.b(this.TAG, "showMain() called.");
            this.loding_faile.setVisibility(8);
            this.loding_layout.setVisibility(8);
            LJNestScrollWebView lJNestScrollWebView = this.web;
            if (lJNestScrollWebView != null) {
                lJNestScrollWebView.setVisibility(0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.customview.LJNestScrollWebView.b
    public void showMainWebview() {
        LJNestScrollWebView lJNestScrollWebView = this.web;
        if (lJNestScrollWebView == null || lJNestScrollWebView.getVisibility() == 0) {
            return;
        }
        showMain();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        l2.a(this.context).b(str);
    }
}
