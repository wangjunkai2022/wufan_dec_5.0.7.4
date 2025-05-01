package com.join.mgps.Util;

import android.app.Activity;
import android.app.Dialog;
import android.app.DownloadManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.GeolocationPermissions;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.BaseAppCompatActivity;
import com.BaseFragmentActivity;
import com.MApplication;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.http.PointSendUtile;
import com.join.android.app.common.servcie.DownloadService_;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.model.bean.GameDetailBean;
import com.join.kotlin.ui.cloudarchive.dialog.ModPromptCallback;
import com.join.kotlin.ui.cloudarchive.dialog.ModPromptNormalDialog;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.AndroidPermissionDialogActivity;
import com.join.mgps.activity.ChociceDownActivity_;
import com.join.mgps.activity.CopyDialogActivity;
import com.join.mgps.activity.EndGameLaunchActivity_;
import com.join.mgps.activity.GameDetailPermissionActivity_;
import com.join.mgps.activity.GprsNoticeDialogAlphActivity_;
import com.join.mgps.activity.HavenDownActivity_;
import com.join.mgps.activity.LocalGameActivity;
import com.join.mgps.activity.ModGameIndexActivity_;
import com.join.mgps.activity.MyGameManagerActivity_;
import com.join.mgps.activity.PapaPlugGuideActivity_;
import com.join.mgps.activity.PapayPayDetialActivity_;
import com.join.mgps.activity.RankingHomeActivity_;
import com.join.mgps.activity.SimulatorExitPlayActivity;
import com.join.mgps.activity.TagGameListActivity_;
import com.join.mgps.activity.UpdateLodingActivity_;
import com.join.mgps.activity.arena.GameRoomActivity;
import com.join.mgps.activity.hideapp.HideAppCalculatorActivity;
import com.join.mgps.activity.hideapp.HideAppCalculatorActivity_;
import com.join.mgps.activity.hideapp.HideAppNotebookActivity;
import com.join.mgps.activity.hideapp.HideAppNotebookActivity_;
import com.join.mgps.activity.login.LoginCfgsBean;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.activity.mygame.dialog.WufunGameDownFirstNotPermissDialog_;
import com.join.mgps.activity.vipzone.bean.LuckHistoryrequest;
import com.join.mgps.db.tables.DownlodTaskCopyTable;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.db.tables.EMUUpdateTable;
import com.join.mgps.db.tables.FightMainTable;
import com.join.mgps.db.tables.UserPurchaseInfo;
import com.join.mgps.db.tables.WarMatchAndLocalTable;
import com.join.mgps.dialog.DownloadHighSpeedDialog_;
import com.join.mgps.dialog.PlugInstallDialog_;
import com.join.mgps.dto.AndroidPermissionParams;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.BaiduAdDataMain;
import com.join.mgps.dto.BootPageData;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.DetailResultBeanV3;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.DownloadCfg;
import com.join.mgps.dto.DownloadGameArgsBean;
import com.join.mgps.dto.DownloadSpeedupCfgBean;
import com.join.mgps.dto.DownloadUrlBean;
import com.join.mgps.dto.Filepath;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.GameDetailRankingTag;
import com.join.mgps.dto.GameDetialBookTag;
import com.join.mgps.dto.GameDiscoverBean;
import com.join.mgps.dto.GameTagInfoV2_2Bean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.NetBattleStartGameDto;
import com.join.mgps.dto.PayTagInfo;
import com.join.mgps.dto.PdAdCfgBean;
import com.join.mgps.dto.RecGameTagBean;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.RomArchived;
import com.join.mgps.dto.SingleGameModInfoBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.dto.TipNew;
import com.join.mgps.dto.TodayWufunBroadcast;
import com.join.mgps.dto.TodayWufunEverday;
import com.join.mgps.dto.TodayWufunTodayNew;
import com.join.mgps.dto.UpdateIntentDataBean;
import com.join.mgps.dto.WxProgram;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.receiver.NotifcationReceiver;
import com.join.mgps.service.CommonService_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.bean.ButtonBean;
import com.papa91.arc.bean.PopwindowBean;
import com.papa91.arc.dialog.RealNameDialog;
import com.papa91.arc.ext.ToastManager;
import com.papa91.arc.interfaces.RealNameCallBack;
import com.papa91.common.BaseAppConfig;
import com.papa91.common.RealNameCheckInfo;
import com.papa91.view.RealNameLoginDialog;
import com.papa91.wrapper.UserPrefs;
import com.psk.eventmodule.StatFactory;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.analytics.pro.bm;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import org.springframework.util.Base64Utils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes.dex */
public class UtilsMy {

    /* renamed from: a  reason: collision with root package name */
    private static String f27435a = "UtilsMy";

    /* renamed from: b  reason: collision with root package name */
    public static EMUApkTable f27436b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f27437c;

    /* renamed from: d  reason: collision with root package name */
    private static long f27438d;

    /* renamed from: e  reason: collision with root package name */
    private static boolean f27439e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends s1.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27440a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27441b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ UserPrefs f27442c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f27443d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f27444e;

        a(Context context, DownloadTask downloadTask, UserPrefs userPrefs, int i4, int i5) {
            this.f27440a = context;
            this.f27441b = downloadTask;
            this.f27442c = userPrefs;
            this.f27443d = i4;
            this.f27444e = i5;
        }

        @Override // s1.c, s1.b
        public void onAdClose() {
            APKUtils.b0(this.f27440a, this.f27441b);
        }

        @Override // s1.c, s1.b
        public void onAdShow() {
            UserPrefs userPrefs = this.f27442c;
            userPrefs.setAdGamesConfig(this.f27443d + "", this.f27444e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a0 implements RealNameCallBack {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27445a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoomActivity.x f27446b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f27447c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f27448d;

        a0(Context context, GameRoomActivity.x xVar, int i4, String str) {
            this.f27445a = context;
            this.f27446b = xVar;
            this.f27447c = i4;
            this.f27448d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void b(PopwindowBean popwindowBean, GameRoomActivity.x xVar, int i4, Context context, RealNameLoginDialog realNameLoginDialog, int i5, ButtonBean buttonBean) {
            realNameLoginDialog.dismiss();
            if (popwindowBean.isNoAge()) {
                if (xVar != null) {
                    xVar.onSuccess(i4, 0, buttonBean);
                }
            } else if (xVar != null) {
                xVar.onSuccess(i4, 0);
            }
            if (buttonBean.getEventType().intValue() == 4 && (context instanceof Activity)) {
                ((Activity) context).finish();
            }
        }

        @Override // com.papa91.arc.interfaces.RealNameCallBack
        public void onCancel(Dialog dialog, ButtonBean buttonBean) {
            dialog.dismiss();
            GameRoomActivity.x xVar = this.f27446b;
            if (xVar != null) {
                xVar.onSuccess(this.f27447c, 0, buttonBean);
            }
            com.papa.sim.statistic.p.l(this.f27445a).O1(Event.clickClosedRealNameWindow, new Ext().setGameId(this.f27448d));
            if (buttonBean.getEventType().intValue() == 4) {
                Context context = this.f27445a;
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        }

        @Override // com.papa91.arc.interfaces.RealNameCallBack
        public void onEvent(String str, String str2) {
            Event event = Event.realNameDisplayWindow;
            if (str.equals(event.name())) {
                com.papa.sim.statistic.p.l(this.f27445a).O1(event, new Ext().setPosition(str2).setGameId(this.f27448d));
            }
            Event event2 = Event.realNameClickSubmit;
            if (str.equals(event2.name())) {
                com.papa.sim.statistic.p.l(this.f27445a).O1(event2, new Ext().setPosition(str2).setGameId(this.f27448d));
            }
        }

        @Override // com.papa91.arc.interfaces.RealNameCallBack
        public void onFail(int i4) {
        }

        @Override // com.papa91.arc.interfaces.RealNameCallBack
        public void onSuccess(Dialog dialog, final PopwindowBean popwindowBean) {
            if (popwindowBean.isPopup()) {
                final Context context = this.f27445a;
                final GameRoomActivity.x xVar = this.f27446b;
                final int i4 = this.f27447c;
                UtilsMy.M3(context, popwindowBean, new RealNameLoginDialog.OnButnClickLienster() { // from class: com.join.mgps.Util.r2
                    @Override // com.papa91.view.RealNameLoginDialog.OnButnClickLienster
                    public final void clickAnydButn(RealNameLoginDialog realNameLoginDialog, int i5, ButtonBean buttonBean) {
                        UtilsMy.a0.b(PopwindowBean.this, xVar, i4, context, realNameLoginDialog, i5, buttonBean);
                    }
                });
            } else {
                GameRoomActivity.x xVar2 = this.f27446b;
                if (xVar2 != null) {
                    xVar2.onSuccess(this.f27447c, 0);
                }
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements GameRoomActivity.x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27449a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27450b;

        b(Context context, DownloadTask downloadTask) {
            this.f27449a = context;
            this.f27450b = downloadTask;
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
            com.join.android.app.common.utils.e.l0(this.f27449a);
            APKUtils.a0(this.f27449a, this.f27450b.getPackageName());
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            com.join.android.app.common.utils.e.l0(this.f27449a);
            APKUtils.a0(this.f27449a, this.f27450b.getPackageName());
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b0 extends s1.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27451a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27452b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27453c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f27454d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UserPrefs f27455e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f27456f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f27457g;

        b0(Context context, String str, DownloadTask downloadTask, String str2, UserPrefs userPrefs, int i4, int i5) {
            this.f27451a = context;
            this.f27452b = str;
            this.f27453c = downloadTask;
            this.f27454d = str2;
            this.f27455e = userPrefs;
            this.f27456f = i4;
            this.f27457g = i5;
        }

        @Override // s1.c, s1.b
        public void onAdClose() {
            UtilsMy.x2(this.f27451a, this.f27452b, this.f27453c.getPackageName(), this.f27453c, this.f27454d);
        }

        @Override // s1.c, s1.b
        public void onAdShow() {
            UserPrefs userPrefs = this.f27455e;
            userPrefs.setAdGamesConfig(this.f27456f + "", this.f27457g);
        }
    }

    /* loaded from: classes3.dex */
    class c extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27458b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f27459c;

        c(String str, Context context) {
            this.f27458b = str;
            this.f27459c = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            BootPageData bootPageData;
            try {
                Thread.sleep(800L);
                if (this.f27458b == null || (bootPageData = (BootPageData) JsonMapper.getInstance().fromJson(this.f27458b, BootPageData.class)) == null || bootPageData.getPerformance_boot() == null) {
                    return;
                }
                PapaPlugGuideActivity_.k0(this.f27459c).start();
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c0 implements ModPromptCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27460a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27461b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ModPromptNormalDialog f27462c;

        c0(DownloadTask downloadTask, Context context, ModPromptNormalDialog modPromptNormalDialog) {
            this.f27460a = downloadTask;
            this.f27461b = context;
            this.f27462c = modPromptNormalDialog;
        }

        @Override // com.join.kotlin.ui.cloudarchive.dialog.ModPromptCallback
        public void callback1() {
            UtilsMy.n4(this.f27461b, this.f27460a);
            this.f27462c.dismiss();
        }

        @Override // com.join.kotlin.ui.cloudarchive.dialog.ModPromptCallback
        public void callback2() {
            if (APKUtils.L(this.f27460a)) {
                APKUtils.t(this.f27461b, this.f27460a);
            } else if (com.join.android.app.common.utils.n.w() instanceof ModGameIndexActivity_) {
                Intent intent = new Intent(o1.a.f72025s0);
                intent.putExtra("from", "modStdDialog");
                this.f27461b.sendBroadcast(intent);
            } else {
                ModInfoBean modInfoBean = this.f27460a.getModInfoBean();
                ModGameIndexActivity_.o2(this.f27461b).a("modStdDialog").b(this.f27460a.getCrc_link_type_val()).c(modInfoBean != null ? modInfoBean.getMain_game_id() : "").start();
            }
            this.f27462c.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27463b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f27464c;

        d(String str, Context context) {
            this.f27463b = str;
            this.f27464c = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p1.f.K().i0(this.f27463b, true);
            Intent intent = new Intent(o1.a.f72008k);
            intent.putExtra("gameId", this.f27463b);
            this.f27464c.sendBroadcast(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d0 implements Function0<Unit> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27465b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27466c;

        d0(Context context, DownloadTask downloadTask) {
            this.f27465b = context;
            this.f27466c = downloadTask;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public Unit invoke() {
            UtilsMy.y2(this.f27465b, this.f27466c);
            return null;
        }
    }

    /* loaded from: classes3.dex */
    class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27467b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GameDetailRankingTag f27468c;

        e(Context context, GameDetailRankingTag gameDetailRankingTag) {
            this.f27467b = context;
            this.f27468c = gameDetailRankingTag;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingHomeActivity_.j0(this.f27467b).c(1001).b(this.f27468c.getHot_game().getType()).a(this.f27468c.getHot_game().getId()).d(this.f27468c.getHot_game().getSub_title()).start();
        }
    }

    /* loaded from: classes3.dex */
    class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27469b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GameDetailRankingTag f27470c;

        f(Context context, GameDetailRankingTag gameDetailRankingTag) {
            this.f27469b = context;
            this.f27470c = gameDetailRankingTag;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RankingHomeActivity_.j0(this.f27469b).c(1001).b(this.f27470c.getTag_game().getType()).a(this.f27470c.getTag_game().getId()).d(this.f27470c.getTag_game().getSub_title()).start();
        }
    }

    /* loaded from: classes3.dex */
    class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27471b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ TipBean f27472c;

        g(Context context, TipBean tipBean) {
            this.f27471b = context;
            this.f27472c = tipBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGameListActivity_.F0(this.f27471b).b(0).d(this.f27472c.getName()).e(Integer.parseInt(this.f27472c.getId())).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h extends x1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27473a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27474b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f27475c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f27476d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f27477e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ DownloadGameArgsBean f27478f;

        h(Context context, DownloadTask downloadTask, List list, int i4, int i5, DownloadGameArgsBean downloadGameArgsBean) {
            this.f27473a = context;
            this.f27474b = downloadTask;
            this.f27475c = list;
            this.f27476d = i4;
            this.f27477e = i5;
            this.f27478f = downloadGameArgsBean;
        }

        @Override // x1.a, w1.a
        public void b(Activity activity) {
            super.b(activity);
            activity.finish();
        }

        @Override // x1.a, w1.a
        public void c(Activity activity) {
            super.c(activity);
            UtilsMy.j1(this.f27473a, this.f27474b, this.f27475c, this.f27476d, this.f27477e, activity, this.f27478f);
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i extends x1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27479a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27480b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadGameArgsBean f27481c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f27482d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f27483e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f27484f;

        i(Context context, DownloadTask downloadTask, DownloadGameArgsBean downloadGameArgsBean, List list, int i4, int i5) {
            this.f27479a = context;
            this.f27480b = downloadTask;
            this.f27481c = downloadGameArgsBean;
            this.f27482d = list;
            this.f27483e = i4;
            this.f27484f = i5;
        }

        @Override // x1.a, w1.a
        public void b(Activity activity) {
            super.b(activity);
            activity.finish();
        }

        @Override // x1.a, w1.a
        public void c(Activity activity) {
            super.c(activity);
            if (!UtilsMy.p1(this.f27479a, this.f27480b, this.f27481c)) {
                if (this.f27480b.getDown_status() == 5) {
                    UtilsMy.n1(this.f27479a, this.f27480b);
                } else {
                    UtilsMy.U0(this.f27479a, this.f27480b, this.f27482d, this.f27483e, this.f27484f, this.f27481c);
                }
            }
            activity.finish();
        }
    }

    /* loaded from: classes3.dex */
    class j extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27485b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f27486c;

        j(String str, Context context) {
            this.f27485b = str;
            this.f27486c = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(1000L);
                Intent intent = new Intent();
                intent.setAction("com.wufun.get.downFinish");
                intent.putExtra("gameid", this.f27485b);
                LocalBroadcastManager.getInstance(this.f27486c).sendBroadcast(intent);
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class k implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Dialog f27487b;

        k(Dialog dialog) {
            this.f27487b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f27487b.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class l implements GameRoomActivity.x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27488a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27489b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadGameArgsBean f27490c;

        l(Context context, String str, DownloadGameArgsBean downloadGameArgsBean) {
            this.f27488a = context;
            this.f27489b = str;
            this.f27490c = downloadGameArgsBean;
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            UtilsMy.G2(this.f27488a, this.f27489b, this.f27490c);
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class m implements GameRoomActivity.x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27491a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27492b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f27493c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f27494d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f27495e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f27496f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f27497g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f27498h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f27499i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f27500j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f27501k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f27502l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f27503m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ String f27504n;

        m(Context context, String str, int i4, int i5, String str2, String str3, String str4, String str5, boolean z4, String str6, int i6, int i7, String str7, String str8) {
            this.f27491a = context;
            this.f27492b = str;
            this.f27493c = i4;
            this.f27494d = i5;
            this.f27495e = str2;
            this.f27496f = str3;
            this.f27497g = str4;
            this.f27498h = str5;
            this.f27499i = z4;
            this.f27500j = str6;
            this.f27501k = i6;
            this.f27502l = i7;
            this.f27503m = str7;
            this.f27504n = str8;
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this.f27491a).extra("gameDownloadDetail", this.f27492b)).extra("_from", this.f27493c)).extra("_from_type", this.f27494d)).extra("recPosition", this.f27495e)).extra("remarks", this.f27496f)).extra("nodeId", this.f27497g)).extra("volcanoOther", this.f27498h)).extra("fromRecomDown", this.f27499i)).extra("packagePath", this.f27500j)).extra("downType", this.f27501k)).extra("location", this.f27502l)).extra("ext", this.f27503m)).extra("fromRecomDown", this.f27499i)).extra("where", this.f27504n)).a();
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class n extends x1.a {
        n() {
        }

        @Override // x1.a, w1.a
        public void b(Activity activity) {
            super.b(activity);
            activity.finish();
        }

        @Override // x1.a, w1.a
        public void c(Activity activity) {
            super.c(activity);
            activity.finish();
        }
    }

    /* loaded from: classes3.dex */
    class o extends x1.a {
        o() {
        }

        @Override // x1.a, w1.a
        public void b(Activity activity) {
            super.b(activity);
            activity.finish();
        }

        @Override // x1.a, w1.a
        public void c(Activity activity) {
            super.c(activity);
            activity.finish();
        }
    }

    /* loaded from: classes3.dex */
    class p implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f27505b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AlertDialog f27506c;

        p(Activity activity, AlertDialog alertDialog) {
            this.f27505b = activity;
            this.f27506c = alertDialog;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!UtilsMy.f27439e || this.f27505b.isFinishing() || this.f27505b.isDestroyed()) {
                return;
            }
            this.f27506c.show();
        }
    }

    /* loaded from: classes3.dex */
    class q implements c2.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AlertDialog f27507a;

        q(AlertDialog alertDialog) {
            this.f27507a = alertDialog;
        }

        @Override // c2.d
        public void a() {
            boolean unused = UtilsMy.f27439e = true;
        }

        @Override // c2.d
        public void b() {
            AlertDialog alertDialog = this.f27507a;
            if (alertDialog == null || !alertDialog.isShowing()) {
                return;
            }
            this.f27507a.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class r implements c2.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AlertDialog f27508a;

        r(AlertDialog alertDialog) {
            this.f27508a = alertDialog;
        }

        @Override // c2.d
        public void a() {
            boolean unused = UtilsMy.f27439e = true;
        }

        @Override // c2.d
        public void b() {
            AlertDialog alertDialog = this.f27508a;
            if (alertDialog == null || !alertDialog.isShowing()) {
                return;
            }
            this.f27508a.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class s extends x1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27510b;

        s(Context context, DownloadTask downloadTask) {
            this.f27509a = context;
            this.f27510b = downloadTask;
        }

        @Override // x1.a, w1.a
        public void b(Activity activity) {
            super.b(activity);
            activity.finish();
        }

        @Override // x1.a, w1.a
        public void c(Activity activity) {
            super.c(activity);
            UtilsMy.n1(this.f27509a, this.f27510b);
            activity.finish();
        }
    }

    /* loaded from: classes3.dex */
    class t extends x1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27511a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27512b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSub f27513c;

        t(Context context, DownloadTask downloadTask, CollectionBeanSub collectionBeanSub) {
            this.f27511a = context;
            this.f27512b = downloadTask;
            this.f27513c = collectionBeanSub;
        }

        @Override // x1.a, w1.a
        public void b(Activity activity) {
            super.b(activity);
            activity.finish();
        }

        @Override // x1.a, w1.a
        public void c(Activity activity) {
            super.c(activity);
            UtilsMy.T0(this.f27511a, this.f27512b, this.f27513c.getTp_down_url(), this.f27513c.getOther_down_switch(), this.f27513c.getCdn_down_switch());
            activity.finish();
        }
    }

    /* loaded from: classes3.dex */
    class u extends WebChromeClient {
        u() {
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
            callback.invoke(str, true, false);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class v implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27514b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EMUApkTable f27515c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f27516d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f27517e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Dialog f27518f;

        v(DownloadTask downloadTask, EMUApkTable eMUApkTable, int i4, Context context, Dialog dialog) {
            this.f27514b = downloadTask;
            this.f27515c = eMUApkTable;
            this.f27516d = i4;
            this.f27517e = context;
            this.f27518f = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = new DownloadTask();
            DownloadTask downloadTask2 = this.f27514b;
            if (downloadTask2 != null) {
                downloadTask.setId(downloadTask2.getId());
            }
            downloadTask.setPackageName(this.f27515c.getPackage_name());
            downloadTask.setPortraitURL(this.f27515c.getLogo());
            downloadTask.setShowName(this.f27515c.getApk_name());
            downloadTask.setUrl(this.f27515c.getDown_url());
            downloadTask.setTipBeans(null);
            downloadTask.setCrc_link_type_val(this.f27516d + "");
            try {
                String[] split = this.f27515c.getVer().split("_");
                downloadTask.setVer_name(split[1]);
                downloadTask.setVer(split[0]);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            downloadTask.setRomType(this.f27516d + "");
            downloadTask.setPlugin_num(this.f27516d + "");
            downloadTask.setFileType(Dtype.chajian.name());
            downloadTask.setShowSize(this.f27515c.getSize());
            downloadTask.setDescribe(this.f27515c.getVer_info());
            downloadTask.setDown_type(this.f27515c.getDown_type());
            downloadTask.setProgress(0L);
            DownloadTask downloadTask3 = this.f27514b;
            if (downloadTask3 != null) {
                UtilsMy.L0(downloadTask3);
                if (this.f27514b.getDown_type() == 2 && com.join.android.app.common.utils.l.i(this.f27515c)) {
                    com.join.android.app.common.utils.l.e(this.f27515c, downloadTask);
                }
            }
            com.php25.PDownload.d.c(downloadTask, this.f27517e);
            this.f27518f.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class w extends WebViewClient {
        w() {
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
            if (str.startsWith("http://") || str.startsWith("https://")) {
                webView.loadUrl(str);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class x implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Dialog f27519b;

        x(Dialog dialog) {
            this.f27519b = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f27519b.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class y implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27520b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EMUApkTable f27521c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f27522d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Context f27523e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Dialog f27524f;

        y(DownloadTask downloadTask, EMUApkTable eMUApkTable, int i4, Context context, Dialog dialog) {
            this.f27520b = downloadTask;
            this.f27521c = eMUApkTable;
            this.f27522d = i4;
            this.f27523e = context;
            this.f27524f = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = new DownloadTask();
            DownloadTask downloadTask2 = this.f27520b;
            if (downloadTask2 != null) {
                downloadTask.setId(downloadTask2.getId());
            }
            downloadTask.setPackageName(this.f27521c.getPackage_name());
            downloadTask.setPortraitURL(this.f27521c.getLogo());
            downloadTask.setShowName(this.f27521c.getApk_name());
            downloadTask.setUrl(this.f27521c.getDown_url());
            downloadTask.setTipBeans(null);
            downloadTask.setCrc_link_type_val(this.f27522d + "");
            try {
                String[] split = this.f27521c.getVer().split("_");
                downloadTask.setVer_name(split[1]);
                downloadTask.setVer(split[0]);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            downloadTask.setRomType(this.f27522d + "");
            downloadTask.setFileType(Dtype.chajian.name());
            downloadTask.setShowSize(this.f27521c.getSize());
            downloadTask.setDescribe(this.f27521c.getVer_info());
            downloadTask.setDown_type(this.f27521c.getDown_type());
            downloadTask.setProgress(0L);
            DownloadTask downloadTask3 = this.f27520b;
            if (downloadTask3 != null) {
                UtilsMy.L0(downloadTask3);
                if (this.f27520b.getDown_type() == 2 && com.join.android.app.common.utils.l.i(this.f27521c)) {
                    com.join.android.app.common.utils.l.e(this.f27521c, downloadTask);
                }
            }
            com.php25.PDownload.d.f(downloadTask, this.f27523e);
            this.f27524f.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class z implements Callback<ResponseModel<RealNameCheckInfo>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f27525b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f27526c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ GameRoomActivity.x f27527d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f27528e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.wufan.user.service.protobuf.n0 f27529f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ LuckHistoryrequest f27530g;

        z(Activity activity, String str, GameRoomActivity.x xVar, int i4, com.wufan.user.service.protobuf.n0 n0Var, LuckHistoryrequest luckHistoryrequest) {
            this.f27525b = activity;
            this.f27526c = str;
            this.f27527d = xVar;
            this.f27528e = i4;
            this.f27529f = n0Var;
            this.f27530g = luckHistoryrequest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c(GameRoomActivity.x xVar, int i4, RealNameLoginDialog realNameLoginDialog, int i5, ButtonBean buttonBean) {
            realNameLoginDialog.dismiss();
            if (xVar != null) {
                xVar.onSuccess(i4, 0, buttonBean);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(Activity activity, String str, RealNameCheckInfo realNameCheckInfo, final GameRoomActivity.x xVar, final int i4, com.wufan.user.service.protobuf.n0 n0Var, LuckHistoryrequest luckHistoryrequest, RealNameLoginDialog realNameLoginDialog, int i5, ButtonBean buttonBean) {
            if (i5 == 1) {
                com.papa.sim.statistic.p.l(activity).O1(Event.closedRealNameWindow, new Ext().setGameId(str));
            }
            if (buttonBean.getEventType().intValue() == 2) {
                if (realNameCheckInfo.getType() != 1) {
                    UtilsMy.M3(activity, buttonBean.getPopUpWindow(), new RealNameLoginDialog.OnButnClickLienster() { // from class: com.join.mgps.Util.q2
                        @Override // com.papa91.view.RealNameLoginDialog.OnButnClickLienster
                        public final void clickAnydButn(RealNameLoginDialog realNameLoginDialog2, int i6, ButtonBean buttonBean2) {
                            UtilsMy.z.c(GameRoomActivity.x.this, i4, realNameLoginDialog2, i6, buttonBean2);
                        }
                    });
                } else {
                    com.papa.sim.statistic.p.l(activity).O1(Event.realNameDisplayWindow, new Ext().setGameId(str));
                    UtilsMy.K3(activity, realNameCheckInfo, xVar, i4, n0Var.getUid() + "", luckHistoryrequest.getType(), luckHistoryrequest.getAction(), str);
                }
            } else if (buttonBean.getEventType().intValue() == 1) {
                if (xVar != null) {
                    xVar.onSuccess(i4, 0, buttonBean);
                }
                com.papa.sim.statistic.p.l(activity).O1(Event.clickKnowGoRealPage, new Ext().setGameId(str));
                IntentUtil.getInstance().goShareWebActivity(activity, buttonBean.getJumpLink());
            } else if (xVar != null) {
                xVar.onSuccess(i4, 0, buttonBean);
            }
            realNameLoginDialog.dismiss();
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel<RealNameCheckInfo>> call, Throwable th) {
            boolean unused = UtilsMy.f27437c = false;
            GameRoomActivity.x xVar = this.f27527d;
            if (xVar != null) {
                xVar.onFail(this.f27528e);
            }
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel<RealNameCheckInfo>> call, Response<ResponseModel<RealNameCheckInfo>> response) {
            GameRoomActivity.x xVar;
            boolean unused = UtilsMy.f27437c = false;
            if (response == null || response.body() == null || response.body().getCode() != 200) {
                return;
            }
            final RealNameCheckInfo data = response.body().getData();
            if (data == null || !data.isPopup()) {
                if (data != null && (xVar = this.f27527d) != null) {
                    xVar.onSuccess(this.f27528e, data.getEndDuration().intValue());
                    return;
                }
                GameRoomActivity.x xVar2 = this.f27527d;
                if (xVar2 != null) {
                    xVar2.onFail(this.f27528e);
                    return;
                }
                return;
            }
            if (data.isNoAge() && data.getStatus() == 0) {
                com.papa.sim.statistic.p.l(this.f27525b).O1(Event.antiAddtionWindowUp, new Ext().setGameId(this.f27526c));
            }
            if (data.getType() == 1) {
                com.papa.sim.statistic.p.l(this.f27525b).O1(Event.realNameDisplayWindow, new Ext().setGameId(this.f27526c));
                Activity activity = this.f27525b;
                GameRoomActivity.x xVar3 = this.f27527d;
                int i4 = this.f27528e;
                UtilsMy.K3(activity, data, xVar3, i4, this.f27529f.getUid() + "", this.f27530g.getType(), this.f27530g.getAction(), this.f27526c);
                return;
            }
            if (data.isNoAge()) {
                com.papa.sim.statistic.p.l(this.f27525b).O1(Event.nonageAstrictHint, new Ext().setGameId(this.f27526c));
            }
            try {
                if (data.isPopup() && data.getButtonCenter().getEventType().intValue() == 1) {
                    com.papa.sim.statistic.p.l(this.f27525b).O1(Event.realNameUpWindows, new Ext().setGameId(this.f27526c));
                }
                final Activity activity2 = this.f27525b;
                final String str = this.f27526c;
                final GameRoomActivity.x xVar4 = this.f27527d;
                final int i5 = this.f27528e;
                final com.wufan.user.service.protobuf.n0 n0Var = this.f27529f;
                final LuckHistoryrequest luckHistoryrequest = this.f27530g;
                UtilsMy.M3(activity2, data, new RealNameLoginDialog.OnButnClickLienster() { // from class: com.join.mgps.Util.p2
                    @Override // com.papa91.view.RealNameLoginDialog.OnButnClickLienster
                    public final void clickAnydButn(RealNameLoginDialog realNameLoginDialog, int i6, ButtonBean buttonBean) {
                        UtilsMy.z.d(activity2, str, data, xVar4, i5, n0Var, luckHistoryrequest, realNameLoginDialog, i6, buttonBean);
                    }
                });
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public static void A(Context context) {
        Activity activity = MApplication.f1497x.getActivity();
        if (activity == null || (activity instanceof HideAppCalculatorActivity) || (activity instanceof HideAppNotebookActivity)) {
            return;
        }
        PrefDef_ l4 = MApplication.f1497x.l();
        Integer d5 = l4.hide_app_switch().d();
        if (d5.intValue() <= 0 || TextUtils.isEmpty(l4.hide_app_pwd().d())) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290);
        if (viewGroup.findViewById(R.id.hideAppMask) != null) {
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(d5.intValue() == 2 ? R.layout.activity_hide_app_calculator : R.layout.activity_hide_app_notebook, (ViewGroup) null);
        inflate.setId(R.id.hideAppMask);
        viewGroup.addView(inflate, new ViewGroup.LayoutParams(-1, -1));
    }

    public static void A0() {
        Activity activity = MApplication.f1497x.getActivity();
        if ((activity instanceof HideAppCalculatorActivity) || (activity instanceof HideAppNotebookActivity) || (activity instanceof SimulatorExitPlayActivity)) {
            return;
        }
        PrefDef_ l4 = MApplication.f1497x.l();
        Integer d5 = l4.hide_app_switch().d();
        if (d5.intValue() <= 0 || TextUtils.isEmpty(l4.hide_app_pwd().d())) {
            return;
        }
        if (d5.intValue() == 1) {
            HideAppNotebookActivity_.h0(MApplication.f1497x).a(true).start();
        } else if (d5.intValue() == 2) {
            HideAppCalculatorActivity_.t0(MApplication.f1497x).a(true).start();
        }
    }

    public static void A1(DownloadTask downloadTask, DetailResultBeanV3 detailResultBeanV3) {
        if (downloadTask == null || detailResultBeanV3 == null) {
            return;
        }
        downloadTask.setDownload_source_url(detailResultBeanV3.getDownload_source_url());
        downloadTask.setDownload_outside_url(detailResultBeanV3.getDownload_outside_url());
        downloadTask.setDownload_original_switch(detailResultBeanV3.getDownload_original_switch());
        downloadTask.setDownload_source_switch_v1(detailResultBeanV3.getDownload_source_switch_v1());
        downloadTask.setDownload_source_switch_v2(detailResultBeanV3.getDownload_source_switch_v2());
    }

    private static int A2(String str, int i4) {
        return (TextUtils.isEmpty(str) || str.length() < i4 + 1 || str.charAt(i4) != '1') ? 0 : 1;
    }

    public static boolean A3(Context context, TextView textView, int i4, int i5, int i6) {
        if (textView == null) {
            return false;
        }
        if (i5 > 0) {
            textView.setTextColor(context.getResources().getColor(R.color.vip_svip_color));
        } else if (i4 > 0) {
            textView.setTextColor(context.getResources().getColor(R.color.vip_color));
        } else {
            textView.setTextColor(context.getResources().getColor(i6));
            return false;
        }
        return true;
    }

    public static void A4(List<DownloadTask> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (DownloadTask downloadTask : list) {
            DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
            if (f5 != null) {
                downloadTask.setSpeed(f5.getSpeed());
                downloadTask.setCurrentSize(f5.getCurrentSize());
                downloadTask.setProgress(f5.getProgress());
                downloadTask.setStatus(f5.getStatus());
            }
        }
    }

    private static void B(Context context, StartGameMeta startGameMeta, EMUApkTable eMUApkTable) {
        startGameMeta.setApkOrSo(eMUApkTable.getDown_type());
        startGameMeta.setAssetspath(eMUApkTable.getApkPath() + "/assets/");
        startGameMeta.setSopath(eMUApkTable.getApkPath() + "/so/");
        if (eMUApkTable.getDown_type() == 2) {
            startGameMeta.setPackageName(context.getPackageName());
        }
        if (context == null) {
            return;
        }
        PrefDef_ prefDef_ = new PrefDef_(context);
        startGameMeta.setPspAdShowTime(prefDef_.pspAdShowTime().d().intValue());
        startGameMeta.setPspAdShowTimeSwitch(prefDef_.pspAdShowTimeSwitch().d().intValue());
        startGameMeta.setChannelId(com.papa.sim.statistic.k.a(context));
    }

    public static boolean B0(Context context, EMUApkTable eMUApkTable) {
        if (eMUApkTable == null) {
            return false;
        }
        try {
            if (eMUApkTable.getDown_type() == 2) {
                return com.join.android.app.common.utils.l.z(eMUApkTable);
            }
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(eMUApkTable.getPackage_name(), 0);
                if (packageInfo == null) {
                    return false;
                }
                try {
                    int i4 = packageInfo.versionCode;
                    String ver_compatible = eMUApkTable.getVer_compatible();
                    String ver = eMUApkTable.getVer();
                    String[] split = ver_compatible.split("_");
                    String[] split2 = ver.split("_");
                    if (split.length != 2 || i4 >= Integer.parseInt(split[0])) {
                        if (split2.length != 2 || i4 >= Integer.parseInt(split2[0])) {
                            return split.length == 1 && i4 < Integer.parseInt(split[0]);
                        }
                        eMUApkTable.setCanUpdate(true);
                        return false;
                    }
                    return true;
                } catch (Exception unused) {
                }
            } catch (Exception e5) {
                e5.getLocalizedMessage();
                return false;
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return false;
    }

    public static void B1(DownloadTask downloadTask, GameDiscoverBean gameDiscoverBean) {
        if (downloadTask == null || gameDiscoverBean == null) {
            return;
        }
        downloadTask.setDownload_source_url(gameDiscoverBean.getDownload_source_url());
        downloadTask.setDownload_outside_url(gameDiscoverBean.getDownload_outside_url());
        downloadTask.setDownload_original_switch(gameDiscoverBean.getDownload_original_switch());
        downloadTask.setDownload_source_switch_v1(gameDiscoverBean.getDownload_source_switch_v1());
        downloadTask.setDownload_source_switch_v2(gameDiscoverBean.getDownload_source_switch_v2());
    }

    private static int B2(List<TipBean> list) {
        for (TipBean tipBean : list) {
            if ("19".equals(tipBean.getId())) {
                return 19;
            }
        }
        return 0;
    }

    public static boolean B3(Context context, TextView textView, int i4, int i5) {
        if (textView == null) {
            return false;
        }
        if (i5 > 0) {
            textView.setTextColor(Color.parseColor("#ffdc39"));
        } else if (i4 > 0) {
            textView.setTextColor(Color.parseColor("#fd5743"));
        } else {
            textView.setTextColor(Color.parseColor("#8a8a8a"));
            return false;
        }
        return true;
    }

    public static void B4(List<DownloadTask> list, DownloadTask downloadTask) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (DownloadTask downloadTask2 : list) {
            if (downloadTask.getCrc_link_type_val().equals(downloadTask2.getCrc_link_type_val())) {
                DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask2.getCrc_link_type_val());
                if (f5 != null) {
                    downloadTask2.setSpeed(f5.getSpeed());
                    downloadTask2.setCurrentSize(f5.getCurrentSize());
                    downloadTask2.setProgress(f5.getProgress());
                    downloadTask2.setStatus(f5.getStatus());
                    return;
                }
                return;
            }
        }
    }

    public static void C(GameDetailRankingTag gameDetailRankingTag, LinearLayout linearLayout, Context context) {
        if (gameDetailRankingTag == null) {
            return;
        }
        try {
            linearLayout.removeAllViews();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, linearLayout.getResources().getDimensionPixelOffset(R.dimen.wdp14), 0);
            if (gameDetailRankingTag.getHot_game() != null) {
                View inflate = View.inflate(context, R.layout.item_game_detail_bt_ranking_tag, null);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_icon);
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ic_game_detail_bt_ranking);
                ((TextView) inflate.findViewById(R.id.tv_title)).setText(Html.fromHtml(gameDetailRankingTag.getHot_game().getTitle()));
                linearLayout.addView(inflate, layoutParams);
                inflate.setOnClickListener(new e(context, gameDetailRankingTag));
            }
            if (gameDetailRankingTag.getTag_game() != null) {
                View inflate2 = View.inflate(context, R.layout.item_game_detail_bt_ranking_tag, null);
                ImageView imageView2 = (ImageView) inflate2.findViewById(R.id.iv_icon);
                imageView2.setImageResource(R.drawable.ic_game_detail_bt_ranking);
                ((TextView) inflate2.findViewById(R.id.tv_title)).setText(Html.fromHtml(gameDetailRankingTag.getTag_game().getTitle()));
                imageView2.setVisibility(0);
                linearLayout.addView(inflate2, layoutParams);
                inflate2.setOnClickListener(new f(context, gameDetailRankingTag));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
        if ((com.join.mgps.enums.ConstantIntEnum.VA64.value() + "").equals(r7.getTag_id()) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean C0(android.content.Context r6, com.join.mgps.db.tables.EMUApkTable r7) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            if (r7 != 0) goto L6
            return r1
        L6:
            int r2 = r7.getDown_type()     // Catch: java.lang.Exception -> L91
            r3 = 2
            if (r2 != r3) goto L12
            boolean r6 = com.join.android.app.common.utils.l.x(r7)     // Catch: java.lang.Exception -> L91
            return r6
        L12:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L91
            r2.<init>()     // Catch: java.lang.Exception -> L91
            com.join.mgps.enums.ConstantIntEnum r4 = com.join.mgps.enums.ConstantIntEnum.VA32     // Catch: java.lang.Exception -> L91
            int r4 = r4.value()     // Catch: java.lang.Exception -> L91
            r2.append(r4)     // Catch: java.lang.Exception -> L91
            r2.append(r0)     // Catch: java.lang.Exception -> L91
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L91
            java.lang.String r4 = r7.getTag_id()     // Catch: java.lang.Exception -> L91
            boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L91
            r4 = 1
            if (r2 != 0) goto L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L91
            r2.<init>()     // Catch: java.lang.Exception -> L91
            com.join.mgps.enums.ConstantIntEnum r5 = com.join.mgps.enums.ConstantIntEnum.VA64     // Catch: java.lang.Exception -> L91
            int r5 = r5.value()     // Catch: java.lang.Exception -> L91
            r2.append(r5)     // Catch: java.lang.Exception -> L91
            r2.append(r0)     // Catch: java.lang.Exception -> L91
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L91
            java.lang.String r2 = r7.getTag_id()     // Catch: java.lang.Exception -> L91
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L58
        L51:
            boolean r0 = com.join.android.app.common.utils.APKUtils.M(r6, r7)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L58
            return r4
        L58:
            java.lang.String r0 = r7.getPackage_name()     // Catch: java.lang.Exception -> L91
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Exception -> L8c
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r0, r1)     // Catch: java.lang.Exception -> L8c
            if (r6 != 0) goto L67
            return r1
        L67:
            int r6 = r6.versionCode     // Catch: java.lang.Exception -> L95
            java.lang.String r7 = r7.getVer()     // Catch: java.lang.Exception -> L95
            java.lang.String r0 = "_"
            java.lang.String[] r7 = r7.split(r0)     // Catch: java.lang.Exception -> L95
            int r0 = r7.length     // Catch: java.lang.Exception -> L95
            if (r0 != r3) goto L7f
            r0 = r7[r1]     // Catch: java.lang.Exception -> L95
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L95
            if (r6 >= r0) goto L7f
            return r4
        L7f:
            int r0 = r7.length     // Catch: java.lang.Exception -> L95
            if (r0 != r4) goto L95
            r7 = r7[r1]     // Catch: java.lang.Exception -> L95
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L95
            if (r6 >= r7) goto L8b
            r1 = 1
        L8b:
            return r1
        L8c:
            r6 = move-exception
            r6.getLocalizedMessage()     // Catch: java.lang.Exception -> L91
            return r1
        L91:
            r6 = move-exception
            r6.printStackTrace()
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.UtilsMy.C0(android.content.Context, com.join.mgps.db.tables.EMUApkTable):boolean");
    }

    public static void C1(DownloadTask downloadTask, GamedetialModleFourBean gamedetialModleFourBean) {
        if (downloadTask == null || gamedetialModleFourBean == null) {
            return;
        }
        downloadTask.setDownload_source_url(gamedetialModleFourBean.getDownload_source_url());
        downloadTask.setDownload_outside_url(gamedetialModleFourBean.getDownload_outside_url());
        downloadTask.setDownload_original_switch(gamedetialModleFourBean.getDownload_original_switch());
        downloadTask.setDownload_source_switch_v1(gamedetialModleFourBean.getDownload_source_switch_v1());
        downloadTask.setDownload_source_switch_v2(gamedetialModleFourBean.getDownload_source_switch_v2());
    }

    public static void C2(DownloadTask downloadTask) {
        if (downloadTask == null || downloadTask.getSp_tag_info() == null) {
            return;
        }
        TipNew sp_tag_info = downloadTask.getSp_tag_info();
        sp_tag_info.setSingle_game_vm(null);
        downloadTask.setSp_tag_info(sp_tag_info);
    }

    public static void C3(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setBuiltInZoomControls(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            settings.setMixedContentMode(0);
        }
        if (i4 >= 19) {
            try {
                Method method = Class.forName("android.webkit.WebView").getMethod("setWebContentsDebuggingEnabled", Boolean.TYPE);
                if (method != null) {
                    method.setAccessible(true);
                    method.invoke(null, Boolean.TRUE);
                }
            } catch (Exception unused) {
            }
        }
        webView.setFocusable(true);
        webView.setDrawingCacheEnabled(true);
        webView.setScrollBarStyle(0);
        webView.setWebChromeClient(new u());
        webView.setWebViewClient(new w());
    }

    private static void C4(Context context, DownloadTask downloadTask, StartGameMeta startGameMeta) {
        int intValue;
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
        if (accountData != null) {
            if (g2.i(accountData.G())) {
                try {
                    intValue = Integer.valueOf(com.join.mgps.Util.b.vl(com.join.mgps.Util.a.b(new JSONObject(com.join.mgps.Util.a.b(accountData.G())).optString(bm.aM)))).intValue();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                startGameMeta.setVipLevel(intValue);
                startGameMeta.setsVipLevel(accountData.j1());
                startGameMeta.setUserID(accountData.getUid() + "");
            }
            intValue = 0;
            startGameMeta.setVipLevel(intValue);
            startGameMeta.setsVipLevel(accountData.j1());
            startGameMeta.setUserID(accountData.getUid() + "");
        }
        if (downloadTask.getLock_sp() == 0) {
            startGameMeta.setSp(0);
            return;
        }
        List<UserPurchaseInfo> o4 = b2.m0.p().o(AccountUtil_.getInstance_(context).getUid(), downloadTask.getCrc_link_type_val());
        if (o4 != null && o4.size() > 0) {
            UserPurchaseInfo userPurchaseInfo = o4.get(0);
            String isOpenSp = userPurchaseInfo.getIsOpenSp();
            String spExpireTime = userPurchaseInfo.getSpExpireTime();
            if (spExpireTime != null && !spExpireTime.equals("")) {
                try {
                    spExpireTime = new String(Base64Utils.decode(spExpireTime.getBytes("utf-8")));
                } catch (UnsupportedEncodingException e6) {
                    e6.printStackTrace();
                }
            }
            if (isOpenSp != null && isOpenSp.equals("true")) {
                if (spExpireTime != null && Long.parseLong(spExpireTime) - (System.currentTimeMillis() / 1000) > 0) {
                    startGameMeta.setSp(2);
                } else {
                    startGameMeta.setSp(1);
                }
            } else {
                startGameMeta.setSp(1);
            }
            String isOpenCheat = userPurchaseInfo.getIsOpenCheat();
            String cheatExpireTime = userPurchaseInfo.getCheatExpireTime();
            if (cheatExpireTime != null && !cheatExpireTime.equals("")) {
                try {
                    cheatExpireTime = new String(Base64Utils.decode(cheatExpireTime.getBytes("utf-8")));
                } catch (UnsupportedEncodingException e7) {
                    e7.printStackTrace();
                }
            }
            if (isOpenCheat != null && isOpenSp.equals("true")) {
                if (cheatExpireTime != null && Long.parseLong(cheatExpireTime) - (System.currentTimeMillis() / 1000) > 0) {
                    startGameMeta.setCheat(2);
                    return;
                } else {
                    startGameMeta.setCheat(1);
                    return;
                }
            }
            startGameMeta.setCheat(1);
            return;
        }
        startGameMeta.setSp(downloadTask.getLock_sp());
        startGameMeta.setCheat(1);
    }

    public static void D(String str, int i4, String str2, TipNew tipNew, LinearLayout linearLayout, Context context) {
        if (g2.h(str2)) {
            str2 = "1";
        }
        linearLayout.removeAllViews();
        View inflate = LayoutInflater.from(context).inflate(R.layout.appitem_appsize_downcount_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.appdownCount);
        TextView textView2 = (TextView) inflate.findViewById(R.id.appType);
        TextView textView3 = (TextView) inflate.findViewById(R.id.pingfen);
        TextView textView4 = (TextView) inflate.findViewById(R.id.ad_text);
        textView4.setSingleLine();
        textView4.setVisibility(0);
        textView4.setTextColor(Color.parseColor("#AAAAAA"));
        textView4.setBackgroundResource(R.drawable.stroke_red_tip_butn);
        textView4.setText("BT");
        textView.setText(g2.c(i4));
        ((TextView) inflate.findViewById(R.id.appsize)).setText(J2((long) (Double.parseDouble(str2) * 1048576.0d)));
        if (tipNew != null) {
            if (tipNew.getModel() != null) {
                textView2.setText(tipNew.getModel().getName());
            } else {
                textView2.setVisibility(8);
            }
            if (tipNew.getDown_res() != null) {
                textView.setText(tipNew.getDown_res().getName());
            }
        } else {
            textView2.setVisibility(8);
        }
        if (g2.i(str) && !"0".equals(str) && !"0.0".equals(str)) {
            textView3.setText(str + "分");
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        linearLayout.addView(inflate);
    }

    public static boolean D0(String str, String str2, String str3, String str4) {
        if (str != null && str3 != null && str2 != null && str4 != null) {
            try {
                if (!str.equals("") && !"".equals(str3) && !"".equals(str2) && !"".equals(str4)) {
                    if (Integer.parseInt(str) > Integer.parseInt(str3)) {
                        return true;
                    }
                    return !str2.equals(str4);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return false;
    }

    public static void D1(DownloadTask downloadTask, TodayWufunBroadcast todayWufunBroadcast) {
        if (downloadTask == null || todayWufunBroadcast == null) {
            return;
        }
        downloadTask.setDownload_source_url(todayWufunBroadcast.getDownload_source_url());
        downloadTask.setDownload_outside_url(todayWufunBroadcast.getDownload_outside_url());
        downloadTask.setDownload_original_switch(todayWufunBroadcast.getDownload_original_switch());
        downloadTask.setDownload_source_switch_v1(todayWufunBroadcast.getDownload_source_switch_v1());
        downloadTask.setDownload_source_switch_v2(todayWufunBroadcast.getDownload_source_switch_v2());
    }

    public static void D2(Context context, String str, CommonGameInfoBean commonGameInfoBean) {
        DownloadGameArgsBean downloadGameArgsBean = new DownloadGameArgsBean();
        downloadGameArgsBean.setGameId(str);
        if (commonGameInfoBean != null) {
            downloadGameArgsBean.setFrom(commonGameInfoBean.get_from());
            downloadGameArgsBean.setFromType(commonGameInfoBean.get_from_type());
            downloadGameArgsBean.setRemarks(commonGameInfoBean.getReMarks());
            downloadGameArgsBean.setRecPosition(commonGameInfoBean.getRecPosition());
            downloadGameArgsBean.setNodeId(commonGameInfoBean.getNodeId());
            downloadGameArgsBean.setRecPosition(commonGameInfoBean.getVolcanoOtherJsonStr());
            downloadGameArgsBean.setFromRecommend(commonGameInfoBean.isFromRecomDown());
            downloadGameArgsBean.setExt(commonGameInfoBean.getExt());
        }
        ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(context).extra("requestAndChoiceUpdateGameById", str)).extra("_downloadArgs", downloadGameArgsBean)).a();
    }

    public static void D3(Context context) {
    }

    public static void E(String str, int i4, String str2, TipNew tipNew, List<TipBean> list, LinearLayout linearLayout, Context context) {
        String str3;
        TipBean tipBean;
        TipBean tipBean2;
        if (g2.h(str2)) {
            str2 = "1";
        }
        linearLayout.removeAllViews();
        TipBean tipBean3 = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.appitem_appsize_downcount_layout_similar, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.appsize);
        TextView textView2 = (TextView) inflate.findViewById(R.id.appType);
        if (tipNew != null) {
            TipBean model = tipNew.getModel();
            if (model != null) {
                if ("7".equals(model.getId()) || "23".equals(model.getId())) {
                    str3 = "安卓";
                    if (list != null) {
                        ArrayList<TipBean> arrayList = new ArrayList();
                        for (TipBean tipBean4 : list) {
                            if (tipBean4.getId() != null && !tipBean4.getId().equals("") && !tipBean4.getId().equals("44") && !tipBean4.getId().equals("45") && !tipBean4.getId().equals("47") && !tipBean4.getId().equals("48")) {
                                arrayList.add(tipBean4);
                            }
                        }
                        int i5 = 0;
                        if (arrayList.size() == 2) {
                            TipBean tipBean5 = (TipBean) arrayList.get(0);
                            str3 = tipBean5 != null ? tipBean5.getName() : "安卓";
                            if (arrayList.size() > 1 && (tipBean2 = (TipBean) arrayList.get(1)) != null) {
                                str3 = str3 + " · " + tipBean2.getName();
                            }
                        } else if (arrayList.size() == 1) {
                            if (((TipBean) arrayList.get(0)) != null) {
                                str3 = "安卓 · " + tipBean.getName();
                            }
                        } else {
                            for (TipBean tipBean6 : arrayList) {
                                if (!"7".equals(tipBean6.getId())) {
                                    str3 = i5 == 0 ? tipBean6.getName() : str3 + "·" + tipBean6.getName();
                                    i5++;
                                    if (i5 == 2) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    textView2.setText(str3);
                } else {
                    if (list != null) {
                        Iterator<TipBean> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            TipBean next = it2.next();
                            if (g2.i(next.getId()) && !next.getId().equals(tipNew.getModel().getId())) {
                                tipBean3 = next;
                                break;
                            }
                        }
                    }
                    if (tipBean3 != null) {
                        textView2.setText(tipNew.getModel().getName() + " · " + tipBean3.getName());
                    } else {
                        textView2.setText(tipNew.getModel().getName());
                    }
                }
            } else {
                textView2.setVisibility(8);
            }
        } else {
            textView2.setVisibility(8);
        }
        long parseDouble = (long) (Double.parseDouble(str2) * 1048576.0d);
        if (!g2.i(str) || "0".equals(str) || "0.0".equals(str)) {
            textView.setText(J2(parseDouble));
        } else {
            textView.setText(J2(parseDouble) + " · " + str + "分");
        }
        linearLayout.addView(inflate);
    }

    public static boolean E0(String str, String str2) {
        if (str != null) {
            try {
                if (!str.equals("") && !"1".equals(str) && !"0".equals(str)) {
                    if (str2 != null && !"".equals(str2)) {
                        if (Integer.parseInt(str) > Integer.parseInt(str2)) {
                        }
                    }
                    return true;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        return false;
    }

    public static void E1(DownloadTask downloadTask, TodayWufunEverday todayWufunEverday) {
        if (downloadTask == null || todayWufunEverday == null) {
            return;
        }
        downloadTask.setDownload_source_url(todayWufunEverday.getDownload_source_url());
        downloadTask.setDownload_outside_url(todayWufunEverday.getDownload_outside_url());
        downloadTask.setDownload_original_switch(todayWufunEverday.getDownload_original_switch());
        downloadTask.setDownload_source_switch_v1(todayWufunEverday.getDownload_source_switch_v1());
        downloadTask.setDownload_source_switch_v2(todayWufunEverday.getDownload_source_switch_v2());
    }

    public static void E2(Context context, DownloadTask downloadTask) {
        if (downloadTask == null || g2.h(downloadTask.getCrc_link_type_val())) {
            return;
        }
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        DownloadGameArgsBean downloadGameArgsBean = new DownloadGameArgsBean();
        downloadGameArgsBean.setGameId(crc_link_type_val);
        downloadGameArgsBean.setFrom(downloadTask.get_from());
        downloadGameArgsBean.setFromType(downloadTask.get_from_type());
        downloadGameArgsBean.setFromRecommend(downloadTask.isFromRecomDown());
        downloadGameArgsBean.setKeyWord(downloadTask.getKeyword());
        downloadGameArgsBean.setExt(downloadTask.getExt());
        downloadGameArgsBean.setExt1(downloadTask.getExt1());
        ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(context).extra("requestAndChoiceUpdateGameById", crc_link_type_val)).extra("_downloadArgs", downloadGameArgsBean)).a();
    }

    public static boolean E3(DownloadTask downloadTask, Context context) {
        if (!(context instanceof Activity) && MApplication.f1497x.getActivity() != null) {
            MApplication.f1497x.getActivity();
        }
        if (Build.VERSION.SDK_INT >= 28 || ConstantIntEnum.PS2.value() != Integer.parseInt(downloadTask.getPlugin_num())) {
            return false;
        }
        AndroidPermissionParams androidPermissionParams = new AndroidPermissionParams("该游戏在安卓" + Build.VERSION.RELEASE + "版本中可能存在闪退、显示效果不佳、运行不流畅等现象");
        androidPermissionParams.setSingleBtn(true);
        Intent intent = new Intent();
        intent.putExtra(AndroidPermissionDialogActivity.f28377i, androidPermissionParams);
        IntentUtil.getInstance().startActivityWithCallback(context, AndroidPermissionDialogActivity.class, intent, new n());
        return true;
    }

    public static void F(List<RecGameTagBean> list, LinearLayout linearLayout, Context context) {
        if (list == null) {
            return;
        }
        try {
            linearLayout.removeAllViews();
            for (RecGameTagBean recGameTagBean : list) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.rightMargin = (int) context.getResources().getDimension(R.dimen.wdp12);
                View inflate = View.inflate(context, R.layout.item_game_detail_similar_game_tag, null);
                TextView textView = (TextView) inflate.findViewById(R.id.tv_text);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_label);
                if (recGameTagBean.getType() != 1 && recGameTagBean.getType() != 3) {
                    if (recGameTagBean.getType() == 4) {
                        imageView.setVisibility(0);
                        imageView.setImageResource(R.drawable.ic_similar_game_hot);
                    } else {
                        imageView.setVisibility(8);
                    }
                    textView.setText(recGameTagBean.getTitle());
                    linearLayout.addView(inflate, layoutParams);
                }
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ic_similar_game_rank);
                textView.setText(recGameTagBean.getTitle());
                linearLayout.addView(inflate, layoutParams);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void F0(Context context, String str, String str2) throws IOException {
        File file = new File(str2);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            Boolean valueOf = Boolean.valueOf(parentFile.mkdirs());
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append("创建文件是否成功");
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(str2);
        InputStream open = context.getAssets().open(str);
        byte[] bArr = new byte[1024];
        for (int read = open.read(bArr); read > 0; read = open.read(bArr)) {
            fileOutputStream.write(bArr, 0, read);
        }
        fileOutputStream.flush();
        open.close();
        fileOutputStream.close();
    }

    public static void F1(DownloadTask downloadTask, TodayWufunTodayNew todayWufunTodayNew) {
        if (downloadTask == null || todayWufunTodayNew == null) {
            return;
        }
        downloadTask.setDownload_source_url(todayWufunTodayNew.getDownload_source_url());
        downloadTask.setDownload_outside_url(todayWufunTodayNew.getDownload_outside_url());
        downloadTask.setDownload_original_switch(todayWufunTodayNew.getDownload_original_switch());
        downloadTask.setDownload_source_switch_v1(todayWufunTodayNew.getDownload_source_switch_v1());
        downloadTask.setDownload_source_switch_v2(todayWufunTodayNew.getDownload_source_switch_v2());
    }

    public static void F2(Context context, CommonGameInfoBean commonGameInfoBean) {
        String str;
        String str2;
        DownloadGameArgsBean downloadGameArgsBean = new DownloadGameArgsBean();
        String str3 = "";
        if (commonGameInfoBean != null) {
            GInfoBean g_info = commonGameInfoBean.getG_info();
            if (g_info != null) {
                boolean z4 = true;
                if (g_info.getBespeak_switch() == 1 && g_info.getDown_state().intValue() == 6) {
                    if (g_info.getGame_book() == 0) {
                        ((CommonService_.h2) CommonService_.S2(context).extra("onClickGamebeSpeakGameId", g_info.getId())).a();
                        return;
                    } else if (g_info.getGame_book() == 1) {
                        ((CommonService_.h2) CommonService_.S2(context).extra("onClickUnGamebeSpeakGameId", g_info.getId())).a();
                        return;
                    }
                }
                if (g_info.isModGameVm()) {
                    str3 = g_info.getMod_id();
                    str2 = "VIRTUAL_SINGLE";
                } else {
                    str2 = "";
                    str3 = g_info.getId();
                }
                downloadGameArgsBean.setGameId(str3);
                if (g_info.getSp_tag_info() == null || g_info.getSp_tag_info().getModel() == null || !"7".equals(g_info.getSp_tag_info().getModel().getId())) {
                    str2 = "ANDROID_SINGLE";
                } else {
                    z4 = false;
                }
                if (z4) {
                    str = str2;
                    r4 = z4;
                } else {
                    r4 = g2.h(g_info.getPlugin_num()) ? false : m2(Integer.parseInt(g_info.getPlugin_num()));
                    if (r4) {
                        str = Z1(g_info.getPlugin_num()).getDown_type() == 2 ? "SO_SIMULATOR" : "RAW_SIMULATOR";
                    } else {
                        str = str2;
                    }
                }
            } else {
                str = "";
            }
            try {
                String d5 = new PrefDef_(context).androidIdNullsKey().d();
                if (g2.i(d5)) {
                    List list = (List) JsonMapper.getInstance().fromJson(d5, List.class);
                    if (g2.i(MApplication.H) && list.contains(MApplication.H) && r4) {
                        if (IntentUtil.getInstance().goLogin(context)) {
                            return;
                        }
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            downloadGameArgsBean.setFrom(commonGameInfoBean.get_from());
            downloadGameArgsBean.setFromType(commonGameInfoBean.get_from_type());
            downloadGameArgsBean.setKeyWord(commonGameInfoBean.getKeyword());
            downloadGameArgsBean.setRemarks(commonGameInfoBean.getReMarks());
            downloadGameArgsBean.setRecPosition(commonGameInfoBean.getRecPosition());
            downloadGameArgsBean.setNodeId(commonGameInfoBean.getNodeId());
            downloadGameArgsBean.setRecPosition(commonGameInfoBean.getVolcanoOtherJsonStr());
            downloadGameArgsBean.setFromRecommend(commonGameInfoBean.isFromRecomDown());
            downloadGameArgsBean.setExt(commonGameInfoBean.getExt());
            downloadGameArgsBean.setExt1(commonGameInfoBean.getExt1());
            downloadGameArgsBean.setLocation(7);
            boolean booleanValue = new PrefDef_(context).download_game_switch().d().booleanValue();
            if (r4 && booleanValue) {
                z0(context, 2, str3, str, new l(context, str3, downloadGameArgsBean));
                return;
            } else {
                G2(context, str3, downloadGameArgsBean);
                return;
            }
        }
        G2(context, "", downloadGameArgsBean);
    }

    private static void F3(DownloadTask downloadTask, String str, Context context, EMUApkTable eMUApkTable, UpdateIntentDataBean updateIntentDataBean) {
        ((GprsNoticeDialogAlphActivity_.c) GprsNoticeDialogAlphActivity_.i0(context).b(downloadTask).flags(268435456)).d(str).c(true).e(updateIntentDataBean).a(eMUApkTable).start();
    }

    public static void G(List<TipBean> list, LinearLayout linearLayout, Context context) {
        if (list == null) {
            return;
        }
        try {
            linearLayout.removeAllViews();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(4, 0, 4, 0);
            for (TipBean tipBean : list) {
                if (tipBean.getId() != null && !tipBean.getId().equals("") && !tipBean.getId().equals("44") && !tipBean.getId().equals("45") && !tipBean.getId().equals("47") && !tipBean.getId().equals("48")) {
                    TextView textView = new TextView(context);
                    textView.setLayoutParams(layoutParams);
                    textView.setGravity(17);
                    textView.setText(tipBean.getName() + "");
                    textView.setTextColor(Color.parseColor(tipBean.getColor()));
                    textView.setPadding(0, 0, 0, 0);
                    textView.setSingleLine(true);
                    textView.setTextSize(0, context.getResources().getDimension(R.dimen.wdp18));
                    textView.setBackgroundDrawable(k2.a(context, tipBean.getColor() + ""));
                    linearLayout.addView(textView);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static boolean G0(String str, String str2) {
        try {
            File file = new File(str2);
            if (file.isFile() && file.exists()) {
                file.delete();
            }
            File file2 = new File(str);
            if (!file2.exists() || !file2.isFile() || !file2.canRead()) {
                return false;
            }
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (-1 != read) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (Exception e5) {
            StringBuilder sb = new StringBuilder();
            sb.append("copyFile:  Exception");
            sb.append(e5.getMessage());
            e5.printStackTrace();
            return false;
        }
    }

    public static String G1(Context context, int i4) {
        List<BaiduAdDataMain> list = (List) JsonMapper.getInstance().fromJson(com.join.mgps.pref.h.n(context).b(), JsonMapper.getInstance().createCollectionType(List.class, BaiduAdDataMain.class));
        if (list == null) {
            return "";
        }
        for (BaiduAdDataMain baiduAdDataMain : list) {
            if (baiduAdDataMain.getType_id() == i4) {
                return baiduAdDataMain.getAd_id();
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void G2(Context context, String str, DownloadGameArgsBean downloadGameArgsBean) {
        ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(context).extra("requestAndDownloadGameById", str)).extra("_downloadArgs", downloadGameArgsBean)).a();
    }

    public static void G3(Context context, DownloadTask downloadTask, int i4) {
        PendingIntent broadcast;
        if (q1.c(context, downloadTask) || q1.f27992c.equals(downloadTask.getCrc_link_type_val()) || Dtype.chajian.name().equals(downloadTask.getRomType())) {
            return;
        }
        MApplication mApplication = MApplication.f1497x;
        NotificationManager notificationManager = (NotificationManager) mApplication.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel("channel_1", "游戏下载完成通知", 4));
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(mApplication.getResources(), R.drawable.icon);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(mApplication, "channel_1");
        if (i4 != 2) {
            if (i4 == 5) {
                if (g2.i(downloadTask.getMod_info())) {
                    Intent intent = new Intent(o1.a.f72021q0, null, mApplication, NotifcationReceiver.class);
                    ModInfoBean modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("gameId", modInfoBean.getMod_game_id());
                    bundle.putString(ModGameIndexActivity_.f35235d2, modInfoBean.getMain_game_id());
                    bundle.putString("from", downloadTask.get_from() + "");
                    intent.putExtras(bundle);
                    intent.putExtra(NotifcationReceiver.f53994a, downloadTask.getCrc_link_type_val());
                    intent.putExtra(NotifcationReceiver.f53995b, 1);
                    broadcast = PendingIntent.getBroadcast(mApplication, (int) SystemClock.uptimeMillis(), intent, 134217728);
                } else {
                    Intent intent2 = new Intent(o1.a.f72023r0, null, mApplication, NotifcationReceiver.class);
                    intent2.putExtra(NotifcationReceiver.f53994a, downloadTask.getCrc_link_type_val());
                    intent2.putExtra(NotifcationReceiver.f53995b, 1);
                    broadcast = PendingIntent.getBroadcast(mApplication, (int) SystemClock.uptimeMillis(), intent2, 134217728);
                }
                NotificationCompat.Builder smallIcon = builder.setSmallIcon(R.drawable.icon);
                NotificationCompat.Builder autoCancel = smallIcon.setContentTitle(downloadTask.getShowName() + "下载完成").setLargeIcon(decodeResource).setContentIntent(broadcast).setAutoCancel(true);
                autoCancel.setContentText(downloadTask.getShowName() + "下载完成，快来玩耍吧").setOnlyAlertOnce(true).setChannelId("channel_1").setPriority(4);
                notificationManager.notify(downloadTask.getCrc_link_type_val().hashCode(), builder.build());
                return;
            } else if (i4 == 11) {
                if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.android.name())) {
                    Intent intent3 = new Intent(o1.a.f72023r0, null, mApplication, NotifcationReceiver.class);
                    intent3.putExtra(NotifcationReceiver.f53994a, downloadTask.getCrc_link_type_val());
                    intent3.putExtra(NotifcationReceiver.f53995b, 1);
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(mApplication, (int) SystemClock.uptimeMillis(), intent3, 134217728);
                    NotificationCompat.Builder smallIcon2 = builder.setSmallIcon(R.drawable.icon);
                    NotificationCompat.Builder priority = smallIcon2.setContentTitle(downloadTask.getShowName() + "下载完成").setLargeIcon(decodeResource).setAutoCancel(true).setContentIntent(broadcast2).setChannelId("channel_1").setPriority(4);
                    priority.setContentText(downloadTask.getShowName() + "下载完成，点击安装");
                    notificationManager.notify(downloadTask.getCrc_link_type_val().hashCode(), builder.build());
                }
                r0.c(mApplication);
                return;
            } else if (i4 == 7) {
                notificationManager.cancel(downloadTask.getCrc_link_type_val().hashCode());
                return;
            } else if (i4 != 8) {
                return;
            }
        }
        if (downloadTask.isHasDeleteNotify()) {
            return;
        }
        Intent intent4 = new Intent(o1.a.f72023r0, null, mApplication, NotifcationReceiver.class);
        intent4.putExtra(NotifcationReceiver.f53994a, downloadTask.getCrc_link_type_val());
        intent4.putExtra(NotifcationReceiver.f53995b, 0);
        PendingIntent broadcast3 = PendingIntent.getBroadcast(mApplication, (int) SystemClock.uptimeMillis(), intent4, 134217728);
        NotificationCompat.Builder smallIcon3 = builder.setSmallIcon(R.drawable.icon);
        smallIcon3.setContentTitle("正在下载" + downloadTask.getShowName() + " " + downloadTask.getProgress() + "%").setLargeIcon(decodeResource).setContentIntent(broadcast3).setAutoCancel(true).setProgress(100, (int) downloadTask.getProgress(), false).setOnlyAlertOnce(true).setChannelId("channel_1").setPriority(4);
        Intent intent5 = new Intent(o1.a.f72019p0, null, mApplication, NotifcationReceiver.class);
        intent5.putExtra(NotifcationReceiver.f53994a, downloadTask.getCrc_link_type_val());
        builder.setDeleteIntent(PendingIntent.getBroadcast(mApplication, 0, intent5, 134217728));
        notificationManager.notify(downloadTask.getCrc_link_type_val().hashCode(), builder.build());
    }

    public static void H(TipNew tipNew, LinearLayout linearLayout, Context context) {
        linearLayout.removeAllViews();
        View inflate = LayoutInflater.from(context).inflate(R.layout.appitem_appsize_downcount_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.appdownCount);
        TextView textView2 = (TextView) inflate.findViewById(R.id.appsize);
        TextView textView3 = (TextView) inflate.findViewById(R.id.appType);
        TextView textView4 = (TextView) inflate.findViewById(R.id.pingfen);
        textView3.setBackgroundResource(R.drawable.stroke_1bb3ae_butn);
        textView3.setTextColor(Color.parseColor("#1BB3AE"));
        if (tipNew != null) {
            if (tipNew.getModel() != null) {
                textView3.setText(tipNew.getModel().getName());
            } else {
                textView3.setVisibility(8);
            }
            if (tipNew.getDown_res() != null) {
                textView.setText(tipNew.getDown_res().getName());
            }
        } else {
            textView3.setVisibility(8);
        }
        textView4.setVisibility(8);
        textView2.setVisibility(8);
        linearLayout.addView(inflate);
    }

    public static boolean H0(Context context, String str, String str2) {
        try {
            InputStream open = context.getAssets().open(str);
            File file = new File(str2);
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            } else {
                File file2 = new File(file.getParent() + net.lingala.zip4j.util.e.F0 + System.currentTimeMillis());
                file.renameTo(file2);
                file2.delete();
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    open.close();
                    return true;
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static String H1() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            String str = "";
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                str = readLine;
            }
            if (str.contains("Hardware")) {
                return str.split(":\\s+", 2)[1];
            }
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
        } catch (IOException e6) {
            e6.printStackTrace();
        }
        return Build.HARDWARE;
    }

    public static void H2(Context context, String str, CommonGameInfoBean commonGameInfoBean) {
        DownloadGameArgsBean downloadGameArgsBean = new DownloadGameArgsBean();
        downloadGameArgsBean.setGameId(str);
        if (commonGameInfoBean != null) {
            downloadGameArgsBean.setFrom(commonGameInfoBean.get_from());
            downloadGameArgsBean.setFromType(commonGameInfoBean.get_from_type());
            downloadGameArgsBean.setKeyWord(commonGameInfoBean.getKeyword());
            downloadGameArgsBean.setRemarks(commonGameInfoBean.getReMarks());
            downloadGameArgsBean.setRecPosition(commonGameInfoBean.getRecPosition());
            downloadGameArgsBean.setNodeId(commonGameInfoBean.getNodeId());
            downloadGameArgsBean.setRecPosition(commonGameInfoBean.getVolcanoOtherJsonStr());
            downloadGameArgsBean.setFromRecommend(commonGameInfoBean.isFromRecomDown());
            downloadGameArgsBean.setExt(commonGameInfoBean.getExt());
            downloadGameArgsBean.setExt1(commonGameInfoBean.getExt1());
        }
        ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(context).extra("requestAndUpdateGameById", str)).extra("_downloadArgs", downloadGameArgsBean)).a();
    }

    public static void H3(Context context, String str, int i4, int i5) {
        new i1(context, 2);
        Intent intent = new Intent(context, MyGameManagerActivity_.class);
        intent.setFlags(335544320);
        PendingIntent activity = PendingIntent.getActivity(context, (int) SystemClock.uptimeMillis(), intent, 134217728);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel("channel_1", "游戏下载通知", 4));
        }
        if (i5 != 9) {
            if (i5 == 11) {
                if (i4 > 1) {
                    Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.icon);
                    NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(context).setSmallIcon(R.drawable.icon);
                    notificationManager.notify(1, smallIcon.setContentTitle("你有" + str + "等" + i4 + "款游戏需安装").setContentIntent(activity).setAutoCancel(true).setChannelId("channel_1").setPriority(4).setLargeIcon(decodeResource).build());
                } else {
                    Bitmap decodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.icon);
                    NotificationCompat.Builder smallIcon2 = new NotificationCompat.Builder(context).setSmallIcon(R.drawable.icon);
                    notificationManager.notify(1, smallIcon2.setContentTitle("你有" + str + "需安装").setContentIntent(activity).setAutoCancel(true).setPriority(4).setChannelId("channel_1").setLargeIcon(decodeResource2).build());
                }
            }
        } else if (i4 > 1) {
            Bitmap decodeResource3 = BitmapFactory.decodeResource(context.getResources(), R.drawable.icon);
            NotificationCompat.Builder smallIcon3 = new NotificationCompat.Builder(context).setSmallIcon(R.drawable.icon);
            notificationManager.notify(1, smallIcon3.setContentTitle("你有" + str + "等" + i4 + "款游戏需更新").setContentIntent(activity).setAutoCancel(true).setChannelId("channel_1").setPriority(4).setLargeIcon(decodeResource3).build());
        } else {
            Bitmap decodeResource4 = BitmapFactory.decodeResource(context.getResources(), R.drawable.icon);
            NotificationCompat.Builder smallIcon4 = new NotificationCompat.Builder(context).setSmallIcon(R.drawable.icon);
            notificationManager.notify(1, smallIcon4.setContentTitle("你有" + str + "需更新").setChannelId("channel_1").setContentIntent(activity).setAutoCancel(true).setPriority(4).setLargeIcon(decodeResource4).build());
        }
        r0.c(context);
    }

    public static void I(String str, int i4, String str2, TipNew tipNew, List<TipBean> list, LinearLayout linearLayout, Context context) {
        String str3;
        TipBean tipBean;
        TipBean tipBean2;
        String str4 = g2.h(str2) ? "1" : str2;
        linearLayout.removeAllViews();
        TipBean tipBean3 = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.appitem_appsize_downcount_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.appdownCount);
        TextView textView2 = (TextView) inflate.findViewById(R.id.appType);
        TextView textView3 = (TextView) inflate.findViewById(R.id.pingfen);
        textView.setText(g2.c(i4));
        ((TextView) inflate.findViewById(R.id.appsize)).setText(J2((long) (Double.parseDouble(str4) * 1048576.0d)));
        if (tipNew != null) {
            TipBean model = tipNew.getModel();
            if (model != null) {
                if ("7".equals(model.getId()) || "23".equals(model.getId())) {
                    str3 = "安卓";
                    if (list != null) {
                        ArrayList<TipBean> arrayList = new ArrayList();
                        for (TipBean tipBean4 : list) {
                            if (tipBean4.getId() != null && !tipBean4.getId().equals("") && !tipBean4.getId().equals("44") && !tipBean4.getId().equals("45") && !tipBean4.getId().equals("47") && !tipBean4.getId().equals("48")) {
                                arrayList.add(tipBean4);
                            }
                        }
                        if (arrayList.size() == 2) {
                            TipBean tipBean5 = (TipBean) arrayList.get(0);
                            str3 = tipBean5 != null ? tipBean5.getName() : "安卓";
                            if (arrayList.size() > 1 && (tipBean2 = (TipBean) arrayList.get(1)) != null) {
                                str3 = str3 + "·" + tipBean2.getName();
                            }
                        } else if (arrayList.size() == 1) {
                            if (((TipBean) arrayList.get(0)) != null) {
                                str3 = "安卓·" + tipBean.getName();
                            }
                        } else {
                            int i5 = 0;
                            for (TipBean tipBean6 : arrayList) {
                                if (!"7".equals(tipBean6.getId())) {
                                    str3 = i5 == 0 ? tipBean6.getName() : str3 + "·" + tipBean6.getName();
                                    i5++;
                                    if (i5 == 2) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    textView2.setText(str3);
                } else {
                    if (list != null) {
                        Iterator<TipBean> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            TipBean next = it2.next();
                            if (g2.i(next.getId()) && !next.getId().equals(tipNew.getModel().getId())) {
                                tipBean3 = next;
                                break;
                            }
                        }
                    }
                    if (tipBean3 != null) {
                        textView2.setText(tipNew.getModel().getName() + "·" + tipBean3.getName());
                    } else {
                        textView2.setText(tipNew.getModel().getName());
                    }
                }
            } else {
                textView2.setVisibility(8);
            }
            if (tipNew.getDown_res() != null) {
                textView.setText(tipNew.getDown_res().getName());
            }
        } else {
            textView2.setVisibility(8);
        }
        if (g2.i(str) && !"0".equals(str) && !"0.0".equals(str)) {
            textView3.setText(str + "分");
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        linearLayout.addView(inflate);
    }

    private static void I0(String str) {
        try {
            File file = new File(str.replace(com.join.mgps.Util.v.f28104d, Environment.getExternalStorageDirectory().getAbsolutePath()));
            if (file.exists()) {
                boolean delete = delete(file);
                StringBuilder sb = new StringBuilder();
                sb.append(delete);
                sb.append(str);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static int I1(Context context) {
        List<UserPurchaseInfo> o4 = b2.m0.p().o(AccountUtil_.getInstance_(context).getUid(), com.papa.sim.statistic.p.f58883i);
        if (o4 != null && o4.size() > 0) {
            UserPurchaseInfo userPurchaseInfo = o4.get(0);
            String isOpenCheat = userPurchaseInfo.getIsOpenCheat();
            String cheatExpireTime = userPurchaseInfo.getCheatExpireTime();
            if (cheatExpireTime != null && !cheatExpireTime.equals("")) {
                try {
                    cheatExpireTime = new String(Base64Utils.decode(cheatExpireTime.getBytes("utf-8")));
                } catch (UnsupportedEncodingException e5) {
                    e5.printStackTrace();
                }
            }
            if (isOpenCheat != null && isOpenCheat.equals("true") && cheatExpireTime != null && Long.parseLong(cheatExpireTime) - (System.currentTimeMillis() / 1000) > 0) {
                return 2;
            }
        }
        return 1;
    }

    public static void I2(Context context, DownloadTask downloadTask) {
        if (downloadTask == null || g2.h(downloadTask.getCrc_link_type_val())) {
            return;
        }
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        DownloadGameArgsBean downloadGameArgsBean = new DownloadGameArgsBean();
        downloadGameArgsBean.setGameId(crc_link_type_val);
        downloadGameArgsBean.setFrom(downloadTask.get_from());
        downloadGameArgsBean.setFromType(downloadTask.get_from_type());
        downloadGameArgsBean.setFromRecommend(downloadTask.isFromRecomDown());
        downloadGameArgsBean.setKeyWord(downloadTask.getKeyword());
        downloadGameArgsBean.setExt(downloadTask.getExt());
        downloadGameArgsBean.setExt1(downloadTask.getExt1());
        ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(context).extra("requestAndUpdateGameById", crc_link_type_val)).extra("_downloadArgs", downloadGameArgsBean)).a();
    }

    public static void I3(Context context, DownloadTask downloadTask) {
        try {
            PrefDef_ prefDef_ = new PrefDef_(context);
            int intValue = prefDef_.downloadSpeedUpCount().d().intValue();
            int intValue2 = prefDef_.downloadSpeedUpCountCurrent().d().intValue();
            int intValue3 = prefDef_.downloadSpeedUpCountAD().d().intValue();
            int intValue4 = prefDef_.downloadSpeedUpCountCurrentAD().d().intValue();
            if (!com.join.mgps.Util.y.u(prefDef_.downloadSpeedUpLastTime().d().longValue())) {
                prefDef_.downloadSpeedUpCountCurrent().g(0);
                prefDef_.downloadSpeedUpCountCurrentAD().g(0);
                prefDef_.downloadSpeedUpGames().g("");
                intValue2 = 0;
            }
            if (intValue2 < intValue && intValue4 < intValue3) {
                prefDef_.downloadSpeedUpCountCurrent().g(Integer.valueOf(intValue2 + 1));
                prefDef_.downloadSpeedUpLastTime().g(Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void J(List<TipBean> list, TipNew tipNew, LinearLayout linearLayout, Context context) {
        String str;
        TipBean tipBean;
        TipBean tipBean2;
        linearLayout.removeAllViews();
        TipBean tipBean3 = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.appitem_appsize_downcount_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.appdownCount);
        TextView textView2 = (TextView) inflate.findViewById(R.id.appType);
        TextView textView3 = (TextView) inflate.findViewById(R.id.pingfen);
        ((TextView) inflate.findViewById(R.id.appsize)).setVisibility(8);
        if (tipNew != null) {
            TipBean model = tipNew.getModel();
            if (model != null) {
                if ("7".equals(model.getId()) || "23".equals(model.getId())) {
                    str = "安卓";
                    if (list != null) {
                        ArrayList<TipBean> arrayList = new ArrayList();
                        for (TipBean tipBean4 : list) {
                            if (tipBean4.getId() != null && !tipBean4.getId().equals("") && !tipBean4.getId().equals("44") && !tipBean4.getId().equals("45") && !tipBean4.getId().equals("47") && !tipBean4.getId().equals("48")) {
                                arrayList.add(tipBean4);
                            }
                        }
                        int i4 = 0;
                        if (arrayList.size() == 2) {
                            TipBean tipBean5 = (TipBean) arrayList.get(0);
                            str = tipBean5 != null ? tipBean5.getName() : "安卓";
                            if (arrayList.size() > 1 && (tipBean2 = (TipBean) arrayList.get(1)) != null) {
                                str = str + "·" + tipBean2.getName();
                            }
                        } else if (arrayList.size() == 1) {
                            if (((TipBean) arrayList.get(0)) != null) {
                                str = "安卓·" + tipBean.getName();
                            }
                        } else {
                            for (TipBean tipBean6 : arrayList) {
                                if (!"7".equals(tipBean6.getId())) {
                                    str = i4 == 0 ? tipBean6.getName() : str + "·" + tipBean6.getName();
                                    i4++;
                                    if (i4 == 2) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    textView2.setText(str);
                } else {
                    if (list != null) {
                        Iterator<TipBean> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            TipBean next = it2.next();
                            if (g2.i(next.getId()) && !next.getId().equals(tipNew.getModel().getId())) {
                                tipBean3 = next;
                                break;
                            }
                        }
                    }
                    if (tipBean3 != null) {
                        textView2.setText(tipNew.getModel().getName() + "·" + tipBean3.getName());
                    } else {
                        textView2.setText(tipNew.getModel().getName());
                    }
                }
            } else {
                textView2.setVisibility(8);
            }
            if (tipNew.getDown_res() != null) {
                textView.setText(tipNew.getDown_res().getName());
            }
        } else {
            textView2.setVisibility(8);
        }
        linearLayout.addView(inflate);
    }

    public static void J0(DownloadTask downloadTask) {
        try {
            File file = new File(downloadTask.getPath());
            String gameZipPath = downloadTask.getGameZipPath();
            if (gameZipPath != null && !gameZipPath.equals("")) {
                if (!downloadTask.getFileType().equals(Dtype.android.name())) {
                    String fileType = downloadTask.getFileType();
                    Dtype dtype = Dtype.chajian;
                    if (!fileType.equals(dtype.name()) && !APKUtils.G(downloadTask)) {
                        if (!downloadTask.getFileType().equals(dtype.name())) {
                            delete(new File(gameZipPath).getParentFile());
                        }
                    }
                }
                delete(new File(gameZipPath));
            }
            if (file.exists()) {
                delete(file);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static long J1(File file) {
        if (file == null) {
            return 0L;
        }
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles == null) {
                        return 0L;
                    }
                    long j4 = 0;
                    for (File file2 : listFiles) {
                        j4 += J1(file2);
                    }
                    return j4;
                }
                return file.length();
            }
            System.out.println("文件或者文件夹不存在，请检查路径是否正确！");
            return 0L;
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0L;
        }
    }

    public static String J2(long j4) {
        String str;
        if (j4 < 1024) {
            str = Math.round(j4) + "B";
        } else if (j4 < 1048576) {
            StringBuilder sb = new StringBuilder();
            double d5 = j4;
            Double.isNaN(d5);
            sb.append(Math.round(d5 / 1024.0d));
            sb.append("K");
            str = sb.toString();
        } else if (j4 < 1073741824) {
            StringBuilder sb2 = new StringBuilder();
            double d6 = j4;
            Double.isNaN(d6);
            sb2.append(Math.round(d6 / 1048576.0d));
            sb2.append("M");
            str = sb2.toString();
        } else {
            str = new DecimalFormat("0.0").format(((float) j4) / 1.07374182E9f) + "G";
        }
        return (str.equals(".0B") || str.equals(".00B")) ? "0B" : str;
    }

    @Deprecated
    public static void J3(Context context, String str) {
        try {
            PrefDef_ prefDef_ = new PrefDef_(context);
            int intValue = prefDef_.downloadSpeedUpCount().d().intValue();
            int intValue2 = prefDef_.downloadSpeedUpCountCurrent().d().intValue();
            long longValue = prefDef_.downloadSpeedUpLastTime().d().longValue();
            String d5 = prefDef_.downloadSpeedUpGames().d();
            String str2 = "";
            if (TextUtils.isEmpty(d5)) {
                d5 = "";
            }
            if (com.join.mgps.Util.y.u(longValue)) {
                str2 = d5;
            } else {
                prefDef_.downloadSpeedUpCountCurrent().g(0);
                prefDef_.downloadSpeedUpGames().g("");
                intValue2 = 0;
            }
            if (intValue2 >= intValue) {
                return;
            }
            prefDef_.downloadSpeedUpCountCurrent().g(Integer.valueOf(intValue2 + 1));
            prefDef_.downloadSpeedUpLastTime().g(Long.valueOf(System.currentTimeMillis()));
            if (!str2.contains(str)) {
                str2 = str2 + str + ",";
            }
            prefDef_.downloadSpeedUpGames().g(str2);
            if (p1.f.K().F(str) != null) {
                return;
            }
            ((DownloadHighSpeedDialog_.c) DownloadHighSpeedDialog_.i0(context).flags(805306368)).a(str).start();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void K(List<TipBean> list, String str, LinearLayout linearLayout, Context context) {
        if (list == null) {
            return;
        }
        try {
            linearLayout.removeAllViews();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(4, 0, 4, 0);
            for (TipBean tipBean : list) {
                if (tipBean.getId() != null && !tipBean.getId().equals("") && !tipBean.getId().equals("44") && !tipBean.getId().equals("45") && !tipBean.getId().equals("47") && !tipBean.getId().equals("48")) {
                    TextView textView = new TextView(context);
                    textView.setLayoutParams(layoutParams);
                    textView.setGravity(17);
                    textView.setText(tipBean.getName() + "");
                    textView.setTextColor(Color.parseColor(tipBean.getColor()));
                    textView.setPadding(0, 0, 0, 0);
                    textView.setSingleLine(true);
                    textView.setTextSize(0, context.getResources().getDimension(R.dimen.wdp18));
                    textView.setBackgroundDrawable(k2.a(context, tipBean.getColor() + ""));
                    linearLayout.addView(textView);
                }
            }
            TextView textView2 = new TextView(context);
            textView2.setLayoutParams(layoutParams);
            textView2.setGravity(17);
            textView2.setText(str + "");
            textView2.setTextColor(Color.parseColor("#81dfce"));
            textView2.setPadding(0, 0, 0, 0);
            textView2.setSingleLine(true);
            textView2.setTextSize(0, context.getResources().getDimension(R.dimen.wdp18));
            textView2.setBackgroundDrawable(k2.a(context, "#81dfce"));
            linearLayout.addView(textView2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void K0(Context context, String str, String str2, String str3, String str4) {
        File file;
        File file2;
        List<RomArchived> m4 = g0.m(str, str2);
        boolean z4 = false;
        if (str.equals("31")) {
            boolean z5 = false;
            boolean z6 = false;
            for (RomArchived romArchived : m4) {
                if (romArchived.getFileName().contains("_v2")) {
                    z5 = true;
                } else {
                    z6 = true;
                }
            }
            Iterator<RomArchived> it2 = m4.iterator();
            while (it2.hasNext()) {
                RomArchived next = it2.next();
                if (!z6 || z5) {
                    if (z6 && z5) {
                        if (l1.a(str3)) {
                            if (next.getFileName().contains("_v2")) {
                                it2.remove();
                            }
                        } else if (!next.getFileName().contains("_v2")) {
                            it2.remove();
                        }
                    }
                } else if (!l1.a(str3)) {
                    it2.remove();
                }
            }
        }
        if (str.equals("31")) {
            boolean z7 = false;
            for (RomArchived romArchived2 : m4) {
                if (romArchived2.getFileName().contains("_v2")) {
                    z4 = true;
                } else {
                    z7 = true;
                }
            }
            Iterator<RomArchived> it3 = m4.iterator();
            while (it3.hasNext()) {
                RomArchived next2 = it3.next();
                if (!z7 || z4) {
                    if (z7 && z4) {
                        if (l1.a(str3)) {
                            if (next2.getFileName().contains("_v2")) {
                                it3.remove();
                            }
                        } else if (!next2.getFileName().contains("_v2")) {
                            it3.remove();
                        }
                    }
                } else if (!l1.a(str3)) {
                    it3.remove();
                }
            }
        }
        if (m4 == null || m4.size() <= 0) {
            return;
        }
        for (RomArchived romArchived3 : m4) {
            String archivedPath = romArchived3.getArchivedPath();
            delete(new File(archivedPath));
            I0(archivedPath);
            String str5 = context.getFilesDir().toString() + "/emus/" + X1(Integer.parseInt(str4)) + net.lingala.zip4j.util.e.F0 + new File(p4(str2)).getName() + net.lingala.zip4j.util.e.F0;
            delete(new File(str5 + file.getName()));
            String replace = romArchived3.getArchivedImagePath().replace("file://", "");
            delete(new File(replace));
            delete(new File(str5 + file2.getName()));
            I0(replace);
        }
    }

    public static String K1(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return "下载";
        }
        int status = downloadTask.getStatus();
        if (status == 2) {
            return downloadTask.getProgress() + "%";
        } else if (status != 3) {
            if (status != 5) {
                if (status != 42) {
                    if (status != 48) {
                        switch (status) {
                            case 9:
                                return "更新";
                            case 10:
                                return "等待";
                            case 11:
                                return "安装";
                            default:
                                return "下载";
                        }
                    }
                    return "安装中";
                }
                return "更新";
            }
            return "启动";
        } else {
            return "继续";
        }
    }

    public static void K2(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("Papa_Stat_SharedPreferences", 4).edit();
        edit.putString("userAvatarForSimulator", AccountUtil_.getInstance_(context).getAccountData().d0());
        edit.putString("userNameForSimulator", AccountUtil_.getInstance_(context).getAccountData().getNickname());
        edit.putBoolean("touristForSimulator", AccountUtil_.getInstance_(context).isTourist());
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K3(Context context, PopwindowBean popwindowBean, GameRoomActivity.x xVar, int i4, String str, int i5, int i6, String str2) {
        RealNameDialog realNameDialog = new RealNameDialog(context, popwindowBean, new a0(context, xVar, i4, str2));
        if (((Activity) context).isFinishing()) {
            return;
        }
        realNameDialog.show(str, Integer.valueOf(i5), Integer.valueOf(i6));
    }

    public static void L(String str, int i4, String str2, TipNew tipNew, LinearLayout linearLayout, Context context) {
        if (g2.h(str2)) {
            str2 = "1";
        }
        linearLayout.removeAllViews();
        View inflate = LayoutInflater.from(context).inflate(R.layout.appitem_appsize_downcount_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.appdownCount);
        TextView textView2 = (TextView) inflate.findViewById(R.id.appType);
        TextView textView3 = (TextView) inflate.findViewById(R.id.pingfen);
        TextView textView4 = (TextView) inflate.findViewById(R.id.ad_text);
        textView4.setSingleLine();
        textView4.setVisibility(0);
        textView4.setVisibility(0);
        textView.setText(g2.c(i4));
        ((TextView) inflate.findViewById(R.id.appsize)).setText(J2((long) (Double.parseDouble(str2) * 1048576.0d)));
        if (tipNew != null) {
            if (tipNew.getModel() != null) {
                textView2.setText(tipNew.getModel().getName());
            } else {
                textView2.setVisibility(8);
            }
            if (tipNew.getDown_res() != null) {
                textView.setText(tipNew.getDown_res().getName());
            }
        } else {
            textView2.setVisibility(8);
        }
        if (g2.i(str) && !"0".equals(str) && !"0.0".equals(str)) {
            textView3.setText(str + "分");
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        linearLayout.addView(inflate);
    }

    public static void L0(DownloadTask downloadTask) {
        File parentFile;
        try {
            if (downloadTask.getStatus() == 9 || downloadTask.getStatus() == 42 || downloadTask.getStatus() == 0) {
                File file = new File(downloadTask.getPath());
                String gameZipPath = downloadTask.getGameZipPath();
                if (gameZipPath != null && !gameZipPath.equals("")) {
                    if (!downloadTask.getFileType().equals(Dtype.android.name())) {
                        String fileType = downloadTask.getFileType();
                        Dtype dtype = Dtype.chajian;
                        if (!fileType.equals(dtype.name()) && !APKUtils.G(downloadTask)) {
                            if (!downloadTask.getFileType().equals(dtype.name())) {
                                File parentFile2 = new File(gameZipPath).getParentFile();
                                if (parentFile2 != null) {
                                    delete(parentFile2);
                                }
                            } else if (TextUtils.equals(downloadTask.getCrc_link_type_val(), String.valueOf(ConstantIntEnum.PS2.value())) && (parentFile = new File(gameZipPath).getParentFile()) != null) {
                                delete(parentFile);
                            }
                        }
                    }
                    delete(new File(gameZipPath));
                }
                if (file.exists()) {
                    delete(file);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static String L1(TipNew tipNew, List<TipBean> list) {
        TipBean model;
        if (tipNew == null || (model = tipNew.getModel()) == null) {
            return "";
        }
        if (!"7".equals(model.getId()) && !"23".equals(model.getId())) {
            TipBean tipBean = null;
            if (list != null) {
                Iterator<TipBean> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TipBean next = it2.next();
                    if (g2.i(next.getId()) && !next.getId().equals(tipNew.getModel().getId())) {
                        tipBean = next;
                        break;
                    }
                }
            }
            if (tipBean != null) {
                return tipBean.getName();
            }
            return tipNew.getModel().getName();
        } else if (list != null) {
            ArrayList<TipBean> arrayList = new ArrayList();
            for (TipBean tipBean2 : list) {
                if (tipBean2.getId() != null && !tipBean2.getId().equals("") && !tipBean2.getId().equals("44") && !tipBean2.getId().equals("45") && !tipBean2.getId().equals("47") && !tipBean2.getId().equals("48")) {
                    arrayList.add(tipBean2);
                }
            }
            if (arrayList.size() == 1) {
                TipBean tipBean3 = (TipBean) arrayList.get(0);
                return tipBean3 != null ? tipBean3.getName() : "";
            }
            for (TipBean tipBean4 : arrayList) {
                if (!"7".equals(tipBean4.getId())) {
                    return tipBean4.getName();
                }
            }
            return "";
        } else {
            return "";
        }
    }

    public static void L2(EMUApkTable eMUApkTable, Context context) {
        int parseInt = Integer.parseInt(eMUApkTable.getTag_id());
        DownloadTask Z = p1.f.K().Z(parseInt);
        DownloadTask downloadTask = new DownloadTask();
        if (Z != null) {
            downloadTask.setId(Z.getId());
        }
        downloadTask.setStatus(5);
        downloadTask.setPackageName(eMUApkTable.getPackage_name());
        downloadTask.setPortraitURL(eMUApkTable.getLogo());
        downloadTask.setShowName(eMUApkTable.getApk_name());
        downloadTask.setUrl(eMUApkTable.getDown_url());
        downloadTask.setTipBeans(null);
        downloadTask.setCrc_link_type_val(parseInt + "");
        downloadTask.setDown_type(eMUApkTable.getDown_type());
        try {
            String[] split = eMUApkTable.getVer().split("_");
            try {
                if (eMUApkTable.getDown_type() == 2 && !TextUtils.isEmpty(eMUApkTable.getApkPath()) && new File(eMUApkTable.getApkPath()).exists()) {
                    split = new File(eMUApkTable.getApkPath()).getName().split("_");
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            downloadTask.setVer_name(split[1]);
            downloadTask.setVer(split[0]);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        downloadTask.setRomType(parseInt + "");
        downloadTask.setPlugin_num(parseInt + "");
        downloadTask.setFileType(Dtype.chajian.name());
        downloadTask.setShowSize(eMUApkTable.getSize());
        downloadTask.setDescribe(eMUApkTable.getVer_info());
        p1.f.K().m(downloadTask);
    }

    public static void L3(Activity activity, String str) {
        f27439e = false;
        AlertDialog S1 = S1(activity, str);
        if (S1 != null) {
            new Handler().postDelayed(new p(activity, S1), 300L);
        }
        if (activity instanceof BaseAppCompatActivity) {
            ((BaseAppCompatActivity) activity).setChannelPermissionCallBack(new q(S1));
        } else if (activity instanceof BaseFragmentActivity) {
            ((BaseFragmentActivity) activity).setChannelPermissionCallBack(new r(S1));
        }
    }

    public static void M(List<TipBean> list, LinearLayout linearLayout, Context context) {
        if (list == null) {
            return;
        }
        try {
            linearLayout.removeAllViews();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, linearLayout.getResources().getDimensionPixelOffset(R.dimen.wdp14), 0);
            for (TipBean tipBean : list) {
                if (tipBean.getId() != null && !tipBean.getId().equals("") && !tipBean.getId().equals("44") && !tipBean.getId().equals("45") && !tipBean.getId().equals("47") && !tipBean.getId().equals("48")) {
                    TextView textView = new TextView(context);
                    textView.setLayoutParams(layoutParams);
                    textView.setGravity(17);
                    textView.setText(tipBean.getName() + "");
                    textView.setTextColor(Color.parseColor(tipBean.getColor()));
                    int h4 = (int) (com.join.android.app.common.utils.n.n(context).h(context) * 5.0f);
                    textView.setPadding(h4, linearLayout.getResources().getDimensionPixelOffset(R.dimen.wdp1), h4, linearLayout.getResources().getDimensionPixelOffset(R.dimen.wdp1));
                    textView.setSingleLine(true);
                    textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.wdp18));
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setCornerRadius(context.getResources().getDimensionPixelOffset(R.dimen.wdp4));
                    gradientDrawable.setStroke(context.getResources().getDimensionPixelOffset(R.dimen.wdp1), Color.parseColor(tipBean.getColor()));
                    gradientDrawable.setColor(Color.parseColor("#00000000"));
                    textView.setBackgroundDrawable(gradientDrawable);
                    textView.setOnClickListener(new g(context, tipBean));
                    linearLayout.addView(textView);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void M0(DownloadTask downloadTask) {
        N0(downloadTask, true);
    }

    public static String M1(TipNew tipNew, List<TipBean> list) {
        return N1(tipNew, list, "·");
    }

    public static void M2(EMUApkTable eMUApkTable, Context context) {
        int parseInt = Integer.parseInt(eMUApkTable.getTag_id());
        DownloadTask Z = p1.f.K().Z(parseInt);
        DownloadTask downloadTask = new DownloadTask();
        if (Z != null) {
            downloadTask.setId(Z.getId());
        }
        downloadTask.setStatus(9);
        downloadTask.setPackageName(eMUApkTable.getPackage_name());
        downloadTask.setPortraitURL(eMUApkTable.getLogo());
        downloadTask.setShowName(eMUApkTable.getApk_name());
        downloadTask.setUrl(eMUApkTable.getDown_url());
        downloadTask.setTipBeans(null);
        downloadTask.setCrc_link_type_val(parseInt + "");
        downloadTask.setDown_type(eMUApkTable.getDown_type());
        try {
            String[] split = eMUApkTable.getVer().split("_");
            try {
                if (eMUApkTable.getDown_type() == 2 && !TextUtils.isEmpty(eMUApkTable.getApkPath()) && new File(eMUApkTable.getApkPath()).exists()) {
                    split = new File(eMUApkTable.getApkPath()).getName().split("_");
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            downloadTask.setVer_name(split[1]);
            downloadTask.setVer(split[0]);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        downloadTask.setRomType(parseInt + "");
        downloadTask.setPlugin_num(parseInt + "");
        downloadTask.setFileType(Dtype.chajian.name());
        downloadTask.setShowSize(eMUApkTable.getSize());
        downloadTask.setDescribe(eMUApkTable.getVer_info());
        p1.f.K().m(downloadTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M3(Context context, PopwindowBean popwindowBean, RealNameLoginDialog.OnButnClickLienster onButnClickLienster) {
        if (context instanceof Activity) {
            if (((Activity) context).isFinishing()) {
                return;
            }
            RealNameLoginDialog.getInstance(context).setDialogData(popwindowBean).setDialogListener(onButnClickLienster).show();
            return;
        }
        Activity activity = MApplication.f1497x.getActivity();
        if (activity != null) {
            RealNameLoginDialog.getInstance(activity).setDialogData(popwindowBean).setDialogListener(onButnClickLienster).show();
        }
    }

    public static void N(String str, int i4, String str2, TipNew tipNew, LinearLayout linearLayout, Context context) {
        if (g2.h(str2)) {
            str2 = "1";
        }
        linearLayout.removeAllViews();
        View inflate = LayoutInflater.from(context).inflate(R.layout.gamelist_appsize_downcount_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.appdownCount);
        TextView textView2 = (TextView) inflate.findViewById(R.id.appType);
        TextView textView3 = (TextView) inflate.findViewById(R.id.pingfen);
        TextView textView4 = (TextView) inflate.findViewById(R.id.ad_text);
        textView.setText(g2.c(i4));
        ((TextView) inflate.findViewById(R.id.appsize)).setText(J2((long) (Double.parseDouble(str2) * 1048576.0d)));
        if (tipNew != null) {
            if (tipNew.getModel() != null) {
                textView2.setText(tipNew.getModel().getName());
            } else {
                textView2.setVisibility(8);
            }
            if (tipNew.getDown_res() != null) {
                textView.setText(tipNew.getDown_res().getName());
            }
        } else {
            textView2.setVisibility(8);
        }
        if (g2.i(str) && !"0".equals(str) && !"0.0".equals(str)) {
            textView3.setText(str + "分");
            textView3.setVisibility(0);
        } else {
            textView3.setVisibility(8);
        }
        linearLayout.addView(inflate);
    }

    public static void N0(DownloadTask downloadTask, boolean z4) {
        com.php25.PDownload.d.a(downloadTask);
        try {
            if ((!TextUtils.isEmpty(downloadTask.getRomType()) && (downloadTask.getRomType().equals(Dtype.androidobb.name()) || downloadTask.getRomType().equals(Dtype.androiddata.name()))) || Dtype.MOD.name().equals(downloadTask.getRomType()) || APKUtils.L(downloadTask)) {
                if (g2.i(downloadTask.getPackageName())) {
                    if ((APKUtils.G(downloadTask) || APKUtils.L(downloadTask)) && com.join.mgps.va.overmind.d.o().O()) {
                        delete(new File(com.join.mgps.va.overmind.f.f54952a.M(downloadTask.getPackageName())));
                    } else {
                        delete(new File(com.join.mgps.Util.v.f28116p, downloadTask.getPackageName()));
                    }
                }
                if (g2.i(downloadTask.getPackageName())) {
                    if ((APKUtils.G(downloadTask) || APKUtils.L(downloadTask)) && com.join.mgps.va.overmind.d.o().O()) {
                        delete(new File(com.join.mgps.va.overmind.f.f54952a.v(downloadTask.getPackageName())));
                    } else {
                        delete(new File(com.join.mgps.Util.v.f28117q, downloadTask.getPackageName()));
                    }
                }
                if (z4 && g2.i(downloadTask.getGameZipPath())) {
                    delete(new File(downloadTask.getGameZipPath()));
                }
                if (APKUtils.G(downloadTask) || APKUtils.L(downloadTask)) {
                    if (g2.i(downloadTask.getResource_path())) {
                        File file = new File(downloadTask.getResource_path());
                        if (file.exists()) {
                            if (file.getParentFile().getAbsolutePath().endsWith(downloadTask.getPackageName())) {
                                delete(file.getParentFile());
                                if (com.join.mgps.va.overmind.d.o().N(downloadTask.getPackageName())) {
                                    com.join.mgps.va.overmind.h.delete(file.getParentFile().getAbsolutePath().replace("com.join.android.app.mgsim.wufun", "com.join.android.app.mgsim.wufun.addon"));
                                }
                            }
                        } else {
                            delete(file);
                        }
                    }
                    if (z4 && g2.i(downloadTask.getPath())) {
                        delete(new File(downloadTask.getPath()));
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        com.php25.PDownload.d.a(downloadTask);
    }

    public static String N1(TipNew tipNew, List<TipBean> list, String str) {
        TipBean model;
        String str2;
        TipBean tipBean;
        TipBean tipBean2;
        if (tipNew == null || (model = tipNew.getModel()) == null) {
            return "";
        }
        if (!"7".equals(model.getId()) && !"23".equals(model.getId())) {
            TipBean tipBean3 = null;
            if (list != null) {
                Iterator<TipBean> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TipBean next = it2.next();
                    if (g2.i(next.getId()) && !next.getId().equals(tipNew.getModel().getId())) {
                        tipBean3 = next;
                        break;
                    }
                }
            }
            if (tipBean3 != null) {
                return tipNew.getModel().getName() + str + tipBean3.getName();
            }
            return tipNew.getModel().getName();
        }
        str2 = "安卓";
        if (list != null) {
            ArrayList<TipBean> arrayList = new ArrayList();
            for (TipBean tipBean4 : list) {
                if (tipBean4.getId() != null && !tipBean4.getId().equals("") && !tipBean4.getId().equals("44") && !tipBean4.getId().equals("45") && !tipBean4.getId().equals("47") && !tipBean4.getId().equals("48")) {
                    arrayList.add(tipBean4);
                }
            }
            int i4 = 0;
            if (arrayList.size() == 2) {
                TipBean tipBean5 = (TipBean) arrayList.get(0);
                str2 = tipBean5 != null ? tipBean5.getName() : "安卓";
                if (arrayList.size() <= 1 || (tipBean2 = (TipBean) arrayList.get(1)) == null) {
                    return str2;
                }
                return str2 + str + tipBean2.getName();
            } else if (arrayList.size() == 1) {
                if (((TipBean) arrayList.get(0)) != null) {
                    return "安卓" + str + tipBean.getName();
                }
                return "安卓";
            } else {
                for (TipBean tipBean6 : arrayList) {
                    if (!"7".equals(tipBean6.getId())) {
                        str2 = i4 == 0 ? tipBean6.getName() : str2 + str + tipBean6.getName();
                        i4++;
                        if (i4 == 2) {
                            return str2;
                        }
                    }
                }
                return str2;
            }
        }
        return "安卓";
    }

    public static void N2(Context context, String str) {
        new j(str, context).start();
    }

    public static void N3(Context context) {
        AndroidPermissionParams androidPermissionParams = new AndroidPermissionParams("您当前安装的PS2模拟器不支持在悟饭内一键启动游戏，请卸载其他平台的PS2模拟器后重试");
        androidPermissionParams.setSingleBtn(true);
        Intent intent = new Intent();
        intent.putExtra(AndroidPermissionDialogActivity.f28377i, androidPermissionParams);
        IntentUtil.getInstance().startActivityWithCallback(context, AndroidPermissionDialogActivity.class, intent, new o());
    }

    public static void O(String str, int i4, String str2, TipNew tipNew, List<TipBean> list, LinearLayout linearLayout, Context context, boolean z4) {
        String str3;
        TipBean tipBean;
        TipBean tipBean2;
        String str4 = g2.h(str2) ? "1" : str2;
        linearLayout.removeAllViews();
        TipBean tipBean3 = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.appitem_appsize_downcount_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.appdownCount);
        TextView textView2 = (TextView) inflate.findViewById(R.id.appsize);
        TextView textView3 = (TextView) inflate.findViewById(R.id.appType);
        TextView textView4 = (TextView) inflate.findViewById(R.id.pingfen);
        TextView textView5 = (TextView) inflate.findViewById(R.id.ad_text);
        textView5.setSingleLine();
        if (z4) {
            textView5.setVisibility(0);
            textView5.setTextColor(Color.parseColor("#AAAAAA"));
            textView5.setBackgroundResource(R.drawable.stroke_red_tip_butn);
            textView5.setText("视频");
        }
        textView.setText(g2.c(i4));
        textView2.setText(J2((long) (Double.parseDouble(str4) * 1048576.0d)));
        if (tipNew != null) {
            TipBean model = tipNew.getModel();
            if (model != null) {
                if (!"7".equals(model.getId()) && !"23".equals(model.getId())) {
                    Iterator<TipBean> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        TipBean next = it2.next();
                        if (g2.i(next.getId()) && !next.getId().equals(tipNew.getModel().getId())) {
                            tipBean3 = next;
                            break;
                        }
                    }
                    if (tipBean3 != null) {
                        textView3.setText(tipNew.getModel().getName() + "·" + tipBean3.getName());
                    } else {
                        textView3.setText(tipNew.getModel().getName());
                    }
                } else {
                    str3 = "安卓";
                    if (list != null) {
                        ArrayList<TipBean> arrayList = new ArrayList();
                        for (TipBean tipBean4 : list) {
                            if (tipBean4.getId() != null && !tipBean4.getId().equals("") && !tipBean4.getId().equals("44") && !tipBean4.getId().equals("45") && !tipBean4.getId().equals("47") && !tipBean4.getId().equals("48")) {
                                arrayList.add(tipBean4);
                            }
                        }
                        if (arrayList.size() == 2) {
                            TipBean tipBean5 = (TipBean) arrayList.get(0);
                            str3 = tipBean5 != null ? tipBean5.getName() : "安卓";
                            if (arrayList.size() > 1 && (tipBean2 = (TipBean) arrayList.get(1)) != null) {
                                str3 = str3 + "·" + tipBean2.getName();
                            }
                        } else if (arrayList.size() == 1) {
                            if (((TipBean) arrayList.get(0)) != null) {
                                str3 = "安卓·" + tipBean.getName();
                            }
                        } else {
                            int i5 = 0;
                            for (TipBean tipBean6 : arrayList) {
                                if (!"7".equals(tipBean6.getId())) {
                                    str3 = i5 == 0 ? tipBean6.getName() : str3 + "·" + tipBean6.getName();
                                    i5++;
                                    if (i5 == 2) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    textView3.setText(str3);
                }
            } else {
                textView3.setVisibility(8);
            }
            if (tipNew.getDown_res() != null) {
                textView.setText(tipNew.getDown_res().getName());
            }
        } else {
            textView3.setVisibility(8);
        }
        if (g2.i(str) && !"0".equals(str) && !"0.0".equals(str)) {
            textView4.setText(str + "分");
            textView4.setVisibility(0);
        } else {
            textView4.setVisibility(8);
        }
        linearLayout.addView(inflate);
    }

    public static void O0(Context context, DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        PrefDef_ prefDef_ = new PrefDef_(context);
        if (g2.i(prefDef_.lastLaunchModGameId().d()) && prefDef_.lastLaunchModGameId().d().equals(downloadTask.getCrc_link_type_val())) {
            prefDef_.lastLaunchModGameId().g("");
        }
        com.join.mgps.va.overmind.d.o().l0(downloadTask.getPackageName());
        M0(downloadTask);
        x4(downloadTask);
    }

    public static String O1(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return "";
        }
        if (g2.h(downloadTask.getRomType())) {
            downloadTask.setRomType(downloadTask.getPlugin_num());
        }
        String romType = downloadTask.getRomType();
        StringBuilder sb = new StringBuilder();
        ConstantIntEnum constantIntEnum = ConstantIntEnum.FBA;
        sb.append(constantIntEnum.value());
        sb.append("");
        if (romType.equals(sb.toString())) {
            return constantIntEnum.nickName();
        }
        String romType2 = downloadTask.getRomType();
        StringBuilder sb2 = new StringBuilder();
        ConstantIntEnum constantIntEnum2 = ConstantIntEnum.FC;
        sb2.append(constantIntEnum2.value());
        sb2.append("");
        if (romType2.equals(sb2.toString())) {
            return constantIntEnum2.nickName();
        }
        String romType3 = downloadTask.getRomType();
        StringBuilder sb3 = new StringBuilder();
        ConstantIntEnum constantIntEnum3 = ConstantIntEnum.GBA;
        sb3.append(constantIntEnum3.value());
        sb3.append("");
        if (romType3.equals(sb3.toString())) {
            return constantIntEnum3.nickName();
        }
        String romType4 = downloadTask.getRomType();
        StringBuilder sb4 = new StringBuilder();
        ConstantIntEnum constantIntEnum4 = ConstantIntEnum.PSP;
        sb4.append(constantIntEnum4.value());
        sb4.append("");
        if (romType4.equals(sb4.toString())) {
            return constantIntEnum4.nickName();
        }
        String romType5 = downloadTask.getRomType();
        StringBuilder sb5 = new StringBuilder();
        ConstantIntEnum constantIntEnum5 = ConstantIntEnum.NDS;
        sb5.append(constantIntEnum5.value());
        sb5.append("");
        if (romType5.equals(sb5.toString())) {
            return constantIntEnum5.nickName();
        }
        String romType6 = downloadTask.getRomType();
        StringBuilder sb6 = new StringBuilder();
        ConstantIntEnum constantIntEnum6 = ConstantIntEnum.PS2;
        sb6.append(constantIntEnum6.value());
        sb6.append("");
        if (romType6.equals(sb6.toString())) {
            return constantIntEnum6.nickName();
        }
        String romType7 = downloadTask.getRomType();
        StringBuilder sb7 = new StringBuilder();
        ConstantIntEnum constantIntEnum7 = ConstantIntEnum.N3DS;
        sb7.append(constantIntEnum7.value());
        sb7.append("");
        if (romType7.equals(sb7.toString())) {
            return constantIntEnum7.nickName();
        }
        String romType8 = downloadTask.getRomType();
        StringBuilder sb8 = new StringBuilder();
        ConstantIntEnum constantIntEnum8 = ConstantIntEnum.GBC;
        sb8.append(constantIntEnum8.value());
        sb8.append("");
        if (romType8.equals(sb8.toString())) {
            return constantIntEnum8.nickName();
        }
        String romType9 = downloadTask.getRomType();
        StringBuilder sb9 = new StringBuilder();
        ConstantIntEnum constantIntEnum9 = ConstantIntEnum.MD;
        sb9.append(constantIntEnum9.value());
        sb9.append("");
        if (romType9.equals(sb9.toString())) {
            return constantIntEnum9.nickName();
        }
        String romType10 = downloadTask.getRomType();
        StringBuilder sb10 = new StringBuilder();
        ConstantIntEnum constantIntEnum10 = ConstantIntEnum.PS;
        sb10.append(constantIntEnum10.value());
        sb10.append("");
        if (romType10.equals(sb10.toString())) {
            return constantIntEnum10.nickName();
        }
        String romType11 = downloadTask.getRomType();
        StringBuilder sb11 = new StringBuilder();
        ConstantIntEnum constantIntEnum11 = ConstantIntEnum.SFC;
        sb11.append(constantIntEnum11.value());
        sb11.append("");
        if (romType11.equals(sb11.toString())) {
            return constantIntEnum11.nickName();
        }
        String romType12 = downloadTask.getRomType();
        StringBuilder sb12 = new StringBuilder();
        ConstantIntEnum constantIntEnum12 = ConstantIntEnum.WSC;
        sb12.append(constantIntEnum12.value());
        sb12.append("");
        if (romType12.equals(sb12.toString())) {
            return constantIntEnum12.nickName();
        }
        String romType13 = downloadTask.getRomType();
        StringBuilder sb13 = new StringBuilder();
        ConstantIntEnum constantIntEnum13 = ConstantIntEnum.N64;
        sb13.append(constantIntEnum13.value());
        sb13.append("");
        if (romType13.equals(sb13.toString())) {
            return constantIntEnum13.nickName();
        }
        String romType14 = downloadTask.getRomType();
        StringBuilder sb14 = new StringBuilder();
        ConstantIntEnum constantIntEnum14 = ConstantIntEnum.ONS;
        sb14.append(constantIntEnum14.value());
        sb14.append("");
        if (romType14.equals(sb14.toString())) {
            return constantIntEnum14.nickName();
        }
        String romType15 = downloadTask.getRomType();
        StringBuilder sb15 = new StringBuilder();
        ConstantIntEnum constantIntEnum15 = ConstantIntEnum.DC;
        sb15.append(constantIntEnum15.value());
        sb15.append("");
        if (romType15.equals(sb15.toString())) {
            return constantIntEnum15.nickName();
        }
        String romType16 = downloadTask.getRomType();
        StringBuilder sb16 = new StringBuilder();
        ConstantIntEnum constantIntEnum16 = ConstantIntEnum.H5;
        sb16.append(constantIntEnum16.value());
        sb16.append("");
        if (romType16.equals(sb16.toString())) {
            return constantIntEnum16.nickName();
        }
        Iterator<TipBean> it2 = downloadTask.getTipBeans().iterator();
        while (it2.hasNext()) {
            TipBean next = it2.next();
            String name = next.getName();
            ConstantIntEnum constantIntEnum17 = ConstantIntEnum.GAMEOL;
            if (name.indexOf(constantIntEnum17.nickName()) != -1) {
                return constantIntEnum17.nickName();
            }
            String name2 = next.getName();
            ConstantIntEnum constantIntEnum18 = ConstantIntEnum.CONSOLEGAME;
            if (name2.indexOf(constantIntEnum18.nickName()) != -1) {
                return constantIntEnum18.nickName();
            }
            String id = next.getId();
            StringBuilder sb17 = new StringBuilder();
            ConstantIntEnum constantIntEnum19 = ConstantIntEnum.CHOICENESS;
            sb17.append(constantIntEnum19.value());
            sb17.append("");
            if (id.equals(sb17.toString())) {
                return constantIntEnum19.value() + "";
            }
        }
        return LocalGameActivity.f34225s;
    }

    public static void O2(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("com.wufun.get.permission");
        intent.putExtra(GameDetailPermissionActivity_.f31670g, str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void O3(android.content.Context r18, com.github.snowdream.android.app.downloader.DownloadTask r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.UtilsMy.O3(android.content.Context, com.github.snowdream.android.app.downloader.DownloadTask, java.lang.String):void");
    }

    public static void P(List<TipBean> list, LinearLayout linearLayout, Context context) {
        if (list == null) {
            return;
        }
        try {
            linearLayout.removeAllViews();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(4, 0, 4, 0);
            for (TipBean tipBean : list) {
                TextView textView = new TextView(context);
                textView.setLayoutParams(layoutParams);
                textView.setGravity(17);
                textView.setText(tipBean.getName() + "");
                textView.setTextColor(-1);
                textView.setPadding(0, 0, 0, 0);
                textView.setSingleLine(true);
                textView.setTextSize(9.0f);
                textView.setBackgroundDrawable(k2.a(context, tipBean.getColor() + ""));
                linearLayout.addView(textView);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void P0(Context context, String str, String str2) {
        try {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir("Download", str2);
            request.setTitle("文件下载");
            request.setDescription("正在下载");
            request.setNotificationVisibility(1);
            request.setMimeType("application/com.join.mgps.activity.mgmainactivity_");
            request.allowScanningByMediaScanner();
            request.setVisibleInDownloadsUi(true);
            context.getSharedPreferences("downloadplato", 0).edit().putLong("plato", ((DownloadManager) context.getSystemService("download")).enqueue(request)).commit();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static String P1() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress()) {
                        return nextElement.getHostAddress().toString();
                    }
                }
            }
            return null;
        } catch (SocketException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static void P2(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("com.wufun.get.permission");
        intent.putExtra(GameDetailPermissionActivity_.f31670g, str);
        intent.putExtra(TTDownloadField.TT_FILE_PATH, str2);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void P3(Context context, NetBattleStartGameDto netBattleStartGameDto, DownloadTask downloadTask, String str, int i4) {
        EMUApkTable n4;
        if (downloadTask == null) {
            return;
        }
        String gameZipPath = downloadTask.getGameZipPath();
        String substring = gameZipPath.substring(0, gameZipPath.lastIndexOf(h0.f27805a));
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        DownloadTask Z = p1.f.K().Z(Integer.parseInt(downloadTask.getPlugin_num()));
        int i5 = 1;
        if (Z != null && (n4 = b2.p.o().n(Z.getPlugin_num())) != null && n4.getDown_type() == 2 && Z.getDown_type() == 2) {
            if (Z.getStatus() == 11 && n4.getVerCode() == Z.getVerCode()) {
                PlugInstallDialog_.a a5 = PlugInstallDialog_.k0(context).c(n4).a(downloadTask);
                if (Z.getDown_type() == 2 && com.join.android.app.common.utils.l.z(n4)) {
                    i5 = 2;
                }
                a5.b(i5).start();
                return;
            } else if (!com.join.android.app.common.utils.l.s(context, Z, new String[0])) {
                Z.setStatus(0);
                String gameZipPath2 = Z.getGameZipPath();
                if (!TextUtils.isEmpty(gameZipPath2)) {
                    File file = new File(gameZipPath2);
                    if (file.exists()) {
                        file.delete();
                    }
                }
                Z.setPath("");
                Z.setGameZipPath("");
                p1.f.K().m(Z);
                q1(n4, context);
                return;
            }
        }
        EMUApkTable W = W(context, downloadTask);
        if (W != null) {
            int i6 = 33;
            try {
                i6 = Integer.parseInt(downloadTask.getRomType());
            } catch (Exception unused) {
            }
            StringBuilder sb = new StringBuilder();
            sb.append("emuApkTable=");
            sb.append(W.getTag_id());
            PrefDef_ prefDef_ = new PrefDef_(context);
            int intValue = prefDef_.runRomFirst().d().intValue();
            String d5 = prefDef_.insatllAppFirstData().d();
            if (d5 != null && W.getDown_type() == 0) {
                BootPageData bootPageData = (BootPageData) JsonMapper.getInstance().fromJson(d5, BootPageData.class);
                if (intValue > 0 && bootPageData != null && bootPageData.getPerformance_boot() != null) {
                    PapaPlugGuideActivity_.k0(context).a(0).start();
                    prefDef_.runRomFirst().g(Integer.valueOf(intValue - 1));
                    return;
                }
            }
            if (V1(context, crc_link_type_val, downloadTask, W, false)) {
                return;
            }
            StartGameMeta startGameMeta = new StartGameMeta();
            startGameMeta.setPackageName(W.getPackage_name());
            startGameMeta.setActivityName(W.getLaunch_name());
            startGameMeta.setRomPath(substring);
            startGameMeta.setStartMode(i4);
            startGameMeta.setGameID(crc_link_type_val);
            startGameMeta.setType(i6);
            startGameMeta.setRoomID(netBattleStartGameDto.getRoomID());
            startGameMeta.setServerPort(netBattleStartGameDto.getServerPort() + "");
            startGameMeta.setServerIP(netBattleStartGameDto.getServerIP());
            startGameMeta.setPlugin_area_val(downloadTask.getPlugin_area_val());
            startGameMeta.setPorder(netBattleStartGameDto.getPorder());
            startGameMeta.setP1Name(netBattleStartGameDto.getP1Name());
            startGameMeta.setP2Name(netBattleStartGameDto.getP2Name());
            startGameMeta.setOldGame(netBattleStartGameDto.getOldGame());
            startGameMeta.setClientIp(netBattleStartGameDto.getClientIp());
            C4(context, downloadTask, startGameMeta);
            startGameMeta.setToken(AccountUtil_.getInstance_(context).getToken());
            startGameMeta.setTcptype(netBattleStartGameDto.getTcptype());
            startGameMeta.setUdpport(netBattleStartGameDto.getUdpport());
            startGameMeta.setUdpIP(netBattleStartGameDto.getUdpIP());
            startGameMeta.setRamCheck(downloadTask.getSync_memory());
            startGameMeta.setNetState(str);
            startGameMeta.setNetMode(1);
            startGameMeta.setUserIcon(netBattleStartGameDto.getUserIcon());
            startGameMeta.setUserName(netBattleStartGameDto.getUserName());
            startGameMeta.setNetPlayers(netBattleStartGameDto.getNetPlayers());
            startGameMeta.setGamePlayers(netBattleStartGameDto.getGamePlayers());
            startGameMeta.setSp(0);
            startGameMeta.setGroupId(netBattleStartGameDto.getGroupId());
            startGameMeta.setArea(netBattleStartGameDto.getArea());
            startGameMeta.setGametype(B2(downloadTask.getTipBeans()));
            startGameMeta.setRoomMode(netBattleStartGameDto.getRoomMode());
            startGameMeta.setGametype(netBattleStartGameDto.getGameype());
            startGameMeta.setAllowPeripheralJoin(netBattleStartGameDto.isAllowPeripheralJoin());
            startGameMeta.setScoreBoard(netBattleStartGameDto.isOpenBattleScore() ? 1 : 0);
            B(context, startGameMeta, W);
            t2(context, startGameMeta, 1);
        }
    }

    public static void Q(Context context) {
        int i4;
        com.join.mgps.broadcast.a.b(context, AccountUtil_.getInstance_(context).getAccountStr());
        Intent intent = new Intent("com.join.android.app.mgsim.wufun.broadcast.action_login_success");
        try {
            String G = AccountUtil_.getInstance_(context).getAccountData().G();
            i4 = g2.i(G) ? Integer.valueOf(com.join.mgps.Util.b.vl(com.join.mgps.Util.a.b(new JSONObject(com.join.mgps.Util.a.b(G)).optString(bm.aM)))).intValue() : 0;
            try {
                AccountUtil_.getInstance_(context).getAccountData().j1();
            } catch (Exception unused) {
                intent.putExtra(BaseAppConfig.KEY_VIP_LEVEL, i4);
                intent.putExtra("svipLevel", 0);
                intent.putExtra("uid", AccountUtil_.getInstance_(context).getUid() + "");
                intent.putExtra("token", AccountUtil_.getInstance_(context).getToken());
                intent.putExtra("sp", Y1(context));
                intent.putExtra("cheat", I1(context));
                intent.putExtra("tourist", AccountUtil_.getInstance_(context).isTourist());
                context.sendBroadcast(intent);
                com.join.mgps.va.overmind.d.g0(intent);
                K2(context);
            }
        } catch (Exception unused2) {
            i4 = 0;
        }
    }

    public static void Q0(Context context, DownloadTask downloadTask, CollectionBeanSub collectionBeanSub) {
        int i4;
        int i5;
        if (downloadTask != null && collectionBeanSub != null) {
            downloadTask.setExt(collectionBeanSub.getExt());
            String plugin_num = downloadTask.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(downloadTask.getUrl());
                T2(downloadTask, context);
                IntentUtil.getInstance().intentActivity(context, intentDateBean);
                return;
            } else if (y0(collectionBeanSub.getPay_tag_info(), collectionBeanSub.getCrc_sign_id()) > 0) {
                d4(context, downloadTask.getCrc_link_type_val());
                return;
            } else {
                y1(downloadTask, collectionBeanSub);
                if (collectionBeanSub.getDown_status() == 5) {
                    if (downloadTask.getMax_an_compatible_ver() > 0 && (((i5 = Build.VERSION.SDK_INT) < downloadTask.getMin_an_compatible_ver() || i5 > downloadTask.getMax_an_compatible_ver()) && g2.h(downloadTask.getMod_info()))) {
                        AndroidPermissionParams androidPermissionParams = new AndroidPermissionParams("该游戏在安卓" + Build.VERSION.RELEASE + "版本中可能存在闪退、显示效果不佳、运行不流畅等现象");
                        Intent intent = new Intent();
                        intent.putExtra(AndroidPermissionDialogActivity.f28377i, androidPermissionParams);
                        IntentUtil.getInstance().startActivityWithCallback(context, AndroidPermissionDialogActivity.class, intent, new s(context, downloadTask));
                        return;
                    }
                    n1(context, downloadTask);
                    return;
                } else if (downloadTask.getMax_an_compatible_ver() > 0 && (((i4 = Build.VERSION.SDK_INT) < downloadTask.getMin_an_compatible_ver() || i4 > downloadTask.getMax_an_compatible_ver()) && g2.h(downloadTask.getMod_info()))) {
                    AndroidPermissionParams androidPermissionParams2 = new AndroidPermissionParams("该游戏在安卓" + Build.VERSION.RELEASE + "版本中可能存在闪退、显示效果不佳、运行不流畅等现象");
                    Intent intent2 = new Intent();
                    intent2.putExtra(AndroidPermissionDialogActivity.f28377i, androidPermissionParams2);
                    IntentUtil.getInstance().startActivityWithCallback(context, AndroidPermissionDialogActivity.class, intent2, new t(context, downloadTask, collectionBeanSub));
                    return;
                } else {
                    T0(context, downloadTask, collectionBeanSub.getTp_down_url(), collectionBeanSub.getOther_down_switch(), collectionBeanSub.getCdn_down_switch());
                    return;
                }
            }
        }
        ToastManager.show("游戏信息获取异常，请重试");
    }

    public static String Q1(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "#348FD8";
            }
            int parseColor = Color.parseColor(str);
            int red = Color.red(parseColor);
            int green = Color.green(parseColor);
            int blue = Color.blue(parseColor);
            double d5 = red;
            Double.isNaN(d5);
            double d6 = green;
            Double.isNaN(d6);
            double d7 = blue;
            Double.isNaN(d7);
            return ((d5 * 0.299d) + (d6 * 0.587d)) + (d7 * 0.114d) < 192.0d ? str : "#348FD8";
        } catch (Exception e5) {
            e5.printStackTrace();
            return "#348FD8";
        }
    }

    public static void Q2(Context context) {
        Intent intent = new Intent();
        intent.setAction(o1.a.I);
        context.sendBroadcast(intent);
    }

    public static void Q3(Context context) {
        if (d1.b(context) < 26 || Build.VERSION.SDK_INT < 26) {
            try {
                DownloadService_.c0(context).a();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public static void R(Context context) {
        Intent intent = new Intent("com.join.android.app.mgsim.wufun.broadcast.action_raise_vip_success");
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
        if (accountData != null) {
            intent.putExtra("uid", accountData.getUid() + "");
            intent.putExtra("token", accountData.getToken());
            int i4 = 0;
            if (g2.i(accountData.G())) {
                try {
                    i4 = Integer.valueOf(com.join.mgps.Util.b.vl(com.join.mgps.Util.a.b(new JSONObject(com.join.mgps.Util.a.b(accountData.G())).optString(bm.aM)))).intValue();
                } catch (Exception unused) {
                }
            }
            intent.putExtra(BaseAppConfig.KEY_VIP_LEVEL, i4);
            intent.putExtra(BaseAppConfig.KEY_SVIP_LEVEL, accountData.j1());
            intent.putExtra("vip_expire_time", accountData.y());
        }
        intent.putExtra("sp", Y1(context));
        intent.putExtra("cheat", I1(context));
        context.sendBroadcast(intent);
    }

    public static void R0(Context context, DownloadTask downloadTask, List<DownloadUrlBean> list, int i4, int i5) {
        S0(context, downloadTask, list, i4, i5, null);
    }

    public static String R1(String str) {
        try {
            int parseColor = Color.parseColor(str);
            int red = Color.red(parseColor);
            int green = Color.green(parseColor);
            int blue = Color.blue(parseColor);
            int parseColor2 = Color.parseColor("#F7F8F9");
            int red2 = Color.red(parseColor2);
            int green2 = Color.green(parseColor2);
            int blue2 = Color.blue(parseColor2);
            int i4 = red - red2;
            int i5 = green - green2;
            int i6 = (i4 * i4) + (i5 * i5);
            int i7 = blue - blue2;
            int i8 = i6 + (i7 * i7);
            StringBuilder sb = new StringBuilder();
            sb.append("getNotSimilarColor: ");
            sb.append(red);
            sb.append(" ");
            sb.append(red2);
            sb.append(" ");
            sb.append(green);
            sb.append(" ");
            sb.append(green2);
            sb.append(" ");
            sb.append(blue);
            sb.append(" ");
            sb.append(blue2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getNotSimilarColor: ");
            sb2.append(i8);
            return i8 > 10000 ? str : "#348FD8";
        } catch (Exception e5) {
            e5.printStackTrace();
            return "#348FD8";
        }
    }

    public static void R2(Context context) {
        Intent intent = new Intent();
        intent.setAction(o1.a.H);
        context.sendBroadcast(intent);
    }

    public static boolean R3(Context context, String str, String str2, int i4, String str3, int i5, int i6, String str4, String str5, String str6) {
        DownloadTask F = p1.f.K().F(str2);
        EMUApkTable U = U(context, F, true);
        if (U != null) {
            try {
                Integer.parseInt(F.getRomType());
            } catch (Exception unused) {
            }
            StartGameMeta startGameMeta = new StartGameMeta();
            C4(context, F, startGameMeta);
            startGameMeta.setToken(AccountUtil_.getInstance_(context).getToken());
            startGameMeta.setUserID(AccountUtil_.getInstance_(context).getUid());
            if (!TextUtils.isEmpty(U.getTag_id())) {
                startGameMeta.setTagId(Integer.parseInt(U.getTag_id()));
            }
            startGameMeta.setPackageName(U.getPackage_name());
            startGameMeta.setActivityName(U.getLaunch_name());
            String gameZipPath = F.getGameZipPath();
            if (gameZipPath == null) {
                return false;
            }
            startGameMeta.setRomPath(p4(gameZipPath));
            startGameMeta.setStartMode(16);
            startGameMeta.setServerIP(null);
            startGameMeta.setGameID(F.getCrc_link_type_val());
            startGameMeta.setType(Integer.parseInt(U.getTag_id()));
            startGameMeta.setPlugin_area_val(F.getPlugin_area_val());
            startGameMeta.setGametype(B2(F.getTipBeans()));
            startGameMeta.setNetState(str3);
            startGameMeta.setEndGameId(i5);
            startGameMeta.setEndGameTime(i6);
            startGameMeta.setEndId(str5);
            startGameMeta.setSubTitle(str4);
            startGameMeta.setEndGameLevelRules(str6);
            B(context, startGameMeta, U);
            s2(context, startGameMeta);
            return true;
        }
        return false;
    }

    public static EMUApkTable S(Context context, DownloadTask downloadTask, boolean z4) {
        com.papa.sim.statistic.p.f58883i = downloadTask.getCrc_link_type_val();
        EMUApkTable Z1 = Z1(downloadTask.getRomType());
        if (Z1 != null) {
            return l0(context, Z1, z4);
        }
        if (Z1 != null) {
            com.papa.sim.statistic.p.f58882h = Z1.getVer() + "_" + Z1.getTag_id();
        }
        return Z1;
    }

    public static void S0(Context context, DownloadTask downloadTask, List<DownloadUrlBean> list, int i4, int i5, DownloadGameArgsBean downloadGameArgsBean) {
        if (downloadTask.getDown_status() == 6) {
            ((CommonService_.h2) CommonService_.S2(context).extra("onClickGamebeSpeakGameId", downloadTask.getCrc_link_type_val())).a();
            return;
        }
        PointSendUtile.sendPoint(context, downloadTask.getCrc_link_type_val());
        boolean z4 = true;
        if (downloadTask.getCrc_link_type_val().equals("846928650")) {
            z4 = a0("2858865652", "752756546", context);
        } else if (downloadTask.getCrc_link_type_val().equals("752756546")) {
            z4 = a0("846928650", "2943064551", context);
        } else if (downloadTask.getCrc_link_type_val().equals("802190896")) {
            z4 = a0("633053817", "823069764", context);
        } else if (downloadTask.getCrc_link_type_val().equals("633053817")) {
            z4 = a0("802190896", "1306459891", context);
        } else if (downloadTask.getCrc_link_type_val().equals("823069764")) {
            z4 = a0("802190896", "1306459891", context);
        } else if (downloadTask.getCrc_link_type_val().equals("1306459891")) {
            z4 = a0("633053817", "823069764", context);
        } else if (downloadTask.getCrc_link_type_val().equals("2943064551")) {
            z4 = a0("2858865652", "752756546", context);
        } else if (downloadTask.getCrc_link_type_val().equals("2858865652")) {
            z4 = a0("846928650", "2943064551", context);
        }
        if (z4) {
            if (d2(context) && ConstantIntEnum.PS2.value() == Integer.parseInt(downloadTask.getPlugin_num())) {
                AndroidPermissionParams androidPermissionParams = new AndroidPermissionParams("你的手机CPU版本较低，运行游戏时可能会出现不流畅等情况，是否仍要下载？");
                Intent intent = new Intent();
                intent.putExtra(AndroidPermissionDialogActivity.f28377i, androidPermissionParams);
                IntentUtil.getInstance().startActivityWithCallback(context, AndroidPermissionDialogActivity.class, intent, new h(context, downloadTask, list, i4, i5, downloadGameArgsBean));
                return;
            }
            j1(context, downloadTask, list, i4, i5, context, downloadGameArgsBean);
        }
    }

    private static AlertDialog S1(Activity activity, String str) {
        String str2;
        if (activity == null || ContextCompat.checkSelfPermission(activity, str) == 0) {
            return null;
        }
        str.hashCode();
        char c5 = 65535;
        switch (str.hashCode()) {
            case -406040016:
                if (str.equals(com.kuaishou.weapon.p0.g.f55589i)) {
                    c5 = 0;
                    break;
                }
                break;
            case -5573545:
                if (str.equals(com.kuaishou.weapon.p0.g.f55583c)) {
                    c5 = 1;
                    break;
                }
                break;
            case 463403621:
                if (str.equals("android.permission.CAMERA")) {
                    c5 = 2;
                    break;
                }
                break;
            case 1365911975:
                if (str.equals(com.kuaishou.weapon.p0.g.f55590j)) {
                    c5 = 3;
                    break;
                }
                break;
        }
        String str3 = "";
        switch (c5) {
            case 0:
            case 3:
                str3 = "存储权限使用说明";
                str2 = "下载游戏和管理游戏；用于对游戏资源进行必要的缓存和读取。";
                break;
            case 1:
                str3 = "设备信息使用说明";
                str2 = "保障软件使用安全顺畅；协助识别用户，更好地解决用户问题。";
                break;
            case 2:
                str3 = "相机权限使用说明";
                str2 = "用于用户发布帖子和修改头像等相关功能时，使用相机进行拍摄视频/图片。";
                break;
            default:
                str2 = "";
                break;
        }
        if (TextUtils.isEmpty(str3)) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, R.style.AlertDialogCustomTransparent);
        View inflate = activity.getLayoutInflater().inflate(R.layout.dialog_permission_desc, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.tvTitle)).setText(str3);
        ((TextView) inflate.findViewById(R.id.tvDesc)).setText(str2);
        builder.setView(inflate);
        AlertDialog create = builder.create();
        Window window = create.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) activity.getResources().getDimension(R.dimen.wdp700);
        attributes.height = -2;
        attributes.gravity = 48;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setDimAmount(0.0f);
        window.setWindowAnimations(0);
        return create;
    }

    public static void S2(DownloadTask downloadTask, int i4) {
        DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
        F.setStatus(i4);
        F.setVer(downloadTask.getVer());
        downloadTask.setStatus(i4);
        p1.f.K().update(F);
        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
        if (f5 != null) {
            f5.setStatus(F.getStatus());
            f5.setVer(F.getVer());
        }
        if (i4 == 5) {
            com.join.android.app.common.servcie.i.e().k(downloadTask.getCrc_link_type_val());
        }
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, i4));
    }

    public static void S3(Context context, DownloadTask downloadTask) {
        v0.h(PapayPayDetialActivity_.f36841l, System.currentTimeMillis() + "  startfightActivity");
        IntentUtil.getInstance().goGameMainActivity(context, downloadTask.getCrc_link_type_val(), "");
    }

    public static EMUApkTable T(Context context, DownloadTask downloadTask) {
        return U(context, downloadTask, false);
    }

    public static void T0(Context context, DownloadTask downloadTask, List<DownloadUrlBean> list, int i4, int i5) {
        U0(context, downloadTask, list, i4, i5, null);
    }

    public static void T1(Context context, int i4, String str) {
        if (g2.i(str)) {
            U1(context, i4, str, a2(p1.f.K().F(str)));
        }
    }

    public static void T2(DownloadTask downloadTask, Context context) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
        int uid = accountData != null ? accountData.getUid() : 0;
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(context);
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        l4.j(crc_link_type_val, uid + "", null);
        downloadTask.setStatus(5);
        downloadTask.setFileType(Dtype.H5.name());
        downloadTask.setPlugin_num(ConstantIntEnum.H5.value() + "");
        downloadTask.setIsOpen(true);
        DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
        if (F != null) {
            downloadTask.setLastTime(System.currentTimeMillis());
            downloadTask.setOpenTime(System.currentTimeMillis());
            p1.f.K().update(F);
            return;
        }
        downloadTask.setFinishTime(System.currentTimeMillis());
        downloadTask.setLastTime(System.currentTimeMillis());
        downloadTask.setOpenTime(System.currentTimeMillis());
        p1.f.K().k(downloadTask);
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 5));
    }

    public static void T3(Context context, DownloadTask downloadTask) {
        W3(context, downloadTask, "");
    }

    public static EMUApkTable U(Context context, DownloadTask downloadTask, boolean z4) {
        return V(context, downloadTask, false, z4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x013f, code lost:
        r6.setRomType(com.join.mgps.enums.Dtype.androidobbdata.name());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void U0(android.content.Context r5, com.github.snowdream.android.app.downloader.DownloadTask r6, java.util.List<com.join.mgps.dto.DownloadUrlBean> r7, int r8, int r9, com.join.mgps.dto.DownloadGameArgsBean r10) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.UtilsMy.U0(android.content.Context, com.github.snowdream.android.app.downloader.DownloadTask, java.util.List, int, int, com.join.mgps.dto.DownloadGameArgsBean):void");
    }

    public static void U1(Context context, int i4, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("location", Integer.valueOf(i4));
        hashMap.put("typeId", str2);
        ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(context).extra("getPrivateDomainById", str)).extra("_ArgMaps", hashMap)).a();
    }

    public static void U2(PrefDef_ prefDef_, Context context) {
        V2(prefDef_, context, false);
    }

    public static void U3(Context context, DownloadTask downloadTask, int i4) {
        V3(context, downloadTask, i4, "");
    }

    public static EMUApkTable V(Context context, DownloadTask downloadTask, boolean z4, boolean z5) {
        com.papa.sim.statistic.p.f58883i = downloadTask.getCrc_link_type_val();
        EMUApkTable Z1 = Z1(downloadTask.getRomType());
        if (Z1 != null) {
            return j0(context, Z1, z4, z5);
        }
        if (Z1 != null) {
            com.papa.sim.statistic.p.f58882h = Z1.getVer() + "_" + Z1.getTag_id();
        }
        return Z1;
    }

    public static void V0(Context context, GameDetailBean gameDetailBean) {
        g1(context, gameDetailBean.getGame_id(), "ANDROID_SINGLE", gameDetailBean.get_from(), gameDetailBean.get_from_type(), gameDetailBean.getRecPosition(), gameDetailBean.getReMarks(), gameDetailBean.getNodeId(), gameDetailBean.getPosition_path(), false, gameDetailBean.isFromRecomDown(), 7, "", 0, gameDetailBean.getExt(), gameDetailBean.getWhere());
    }

    public static boolean V1(Context context, String str, DownloadTask downloadTask, EMUApkTable eMUApkTable, boolean z4) {
        EMUUpdateTable n4 = b2.q.o().n(str);
        if (n4 == null) {
            return false;
        }
        downloadTask.setUrl(n4.getDown_url_remote());
        downloadTask.setCfg_down_url(n4.getCfg_down_url());
        if (n4.getScreenshot_pic() != null && !n4.getScreenshot_pic().equals("")) {
            downloadTask.setScreenshot_pic(n4.getScreenshot_pic());
        }
        boolean E0 = E0(n4.getRom_lowest_ver(), downloadTask.getVer());
        boolean E02 = E0(n4.getVer(), downloadTask.getVer());
        boolean E03 = E0(n4.getCfg_lowest_ver(), downloadTask.getCfg_ver());
        boolean E04 = E0(n4.getCfg_ver(), downloadTask.getCfg_ver());
        boolean E05 = E0(n4.getSource_lowest_ver(), downloadTask.getSource_ver());
        boolean E06 = E0(n4.getSource_ver(), downloadTask.getSource_ver());
        int parseInt = Integer.parseInt(downloadTask.getPlugin_num());
        if ((Build.VERSION.SDK_INT > 29 && (parseInt == ConstantIntEnum.DC.value() || parseInt == ConstantIntEnum.N64.value() || parseInt == ConstantIntEnum.NDS.value() || parseInt == ConstantIntEnum.ONS.value() || parseInt == ConstantIntEnum.VA32.value() || parseInt == ConstantIntEnum.VA64.value())) || parseInt == ConstantIntEnum.PS2.value() || parseInt == ConstantIntEnum.N3DS.value()) {
            DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
            boolean contains = downloadTask.getGameZipPath().contains(context.getPackageName());
            boolean contains2 = F.getGameZipPath().contains(context.getPackageName());
            if (contains && contains2) {
                if (ContextCompat.checkSelfPermission(context, com.kuaishou.weapon.p0.g.f55590j) != 0) {
                    O2(context, com.kuaishou.weapon.p0.g.f55590j);
                    return true;
                }
                Intent intent = new Intent(context, CopyDialogActivity.class);
                intent.putExtra("gameid", downloadTask.getCrc_link_type_val());
                context.startActivity(intent);
                return true;
            } else if (contains && !contains2) {
                downloadTask.setGameZipPath(F.getGameZipPath());
            }
        }
        if (E02 || E04 || E06 || E0) {
            k4(downloadTask, context, new UpdateIntentDataBean(E0, E02, E03, E04, E05, E06, downloadTask, eMUApkTable, z4));
            return true;
        }
        return false;
    }

    public static void V2(PrefDef_ prefDef_, Context context, boolean z4) {
        if (Build.VERSION.SDK_INT > 29 || z4) {
            prefDef_.sdcardisFirst().g(Boolean.TRUE);
            List<Filepath> a5 = s1.a(context);
            String str = com.join.mgps.Util.v.f28106f;
            String str2 = "";
            if (g2.i(com.join.mgps.pref.h.n(context).h())) {
                String str3 = "";
                for (Filepath filepath : a5) {
                    if (filepath.isIslocal()) {
                        str3 = filepath.getPathHome();
                    } else {
                        str2 = filepath.getPathHome();
                    }
                }
                if (g2.i(str2)) {
                    com.join.mgps.pref.h.n(context).W(str2);
                } else if (g2.i(str3)) {
                    com.join.mgps.pref.h.n(context).W(str3);
                } else {
                    com.join.mgps.pref.h.n(context).W(str);
                }
            } else {
                String str4 = "";
                long j4 = 0;
                for (Filepath filepath2 : a5) {
                    if (filepath2.isIslocal()) {
                        str4 = filepath2.getPathHome();
                    } else {
                        str2 = filepath2.getPathHome();
                        j4 = filepath2.getAvailable();
                    }
                }
                if (g2.i(str2) && j4 != 0) {
                    com.join.mgps.pref.h.n(context).W(str2);
                } else if (g2.i(str4)) {
                    com.join.mgps.pref.h.n(context).W(str4);
                } else {
                    com.join.mgps.pref.h.n(context).W(str);
                }
            }
            for (Filepath filepath3 : a5) {
                File file = new File(filepath3.getPathHome());
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(filepath3.getPathHome() + File.separator + ".nomedia");
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0419  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void V3(android.content.Context r11, com.github.snowdream.android.app.downloader.DownloadTask r12, int r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.UtilsMy.V3(android.content.Context, com.github.snowdream.android.app.downloader.DownloadTask, int, java.lang.String):void");
    }

    public static EMUApkTable W(Context context, DownloadTask downloadTask) {
        com.papa.sim.statistic.p.f58883i = downloadTask.getCrc_link_type_val();
        EMUApkTable n4 = b2.o.o().n(downloadTask.getRomType());
        if (n4 != null) {
            return h0(context, n4);
        }
        if (n4 != null) {
            com.papa.sim.statistic.p.f58882h = n4.getVer() + "_" + n4.getTag_id();
        }
        return n4;
    }

    public static void W0(Context context, AppBean appBean) {
        String game_id;
        int i4;
        int i5;
        boolean z4;
        String str;
        boolean z5;
        String str2;
        if (appBean != null) {
            if (appBean.getMod_info() != null) {
                game_id = appBean.getMod_info().getMod_game_id();
                i4 = appBean.get_from();
                i5 = appBean.get_from_type();
            } else {
                game_id = appBean.getGame_id();
                i4 = appBean.get_from();
                i5 = appBean.get_from_type();
            }
            String str3 = game_id;
            int i6 = i4;
            int i7 = i5;
            appBean.getTag_info();
            String str4 = appBean.getMod_info() != null ? "VIRTUAL_SINGLE" : "";
            if ("7".equals(appBean.getSp_tag_info().getModel().getId())) {
                str = str4;
                z4 = false;
            } else {
                z4 = true;
                str = "ANDROID_SINGLE";
            }
            if (z4) {
                z5 = z4;
                str2 = str;
            } else {
                boolean m22 = g2.h(appBean.getPlugin_num()) ? false : m2(Integer.parseInt(appBean.getPlugin_num()));
                if (m22) {
                    str2 = Z1(appBean.getPlugin_num()).getDown_type() == 2 ? "SO_SIMULATOR" : "RAW_SIMULATOR";
                } else {
                    str2 = str;
                }
                z5 = m22;
            }
            d1(context, str3, str2, i6, i7, appBean.getRecPosition(), appBean.getReMarks(), appBean.getNodeId(), appBean.getPosition_path(), z5);
        }
    }

    public static String W1(List<TipBean> list) {
        for (TipBean tipBean : list) {
            if ("46".equals(tipBean.getId())) {
                return tipBean.getId();
            }
            EMUApkTable t02 = t0(tipBean.getId());
            if (t02 != null) {
                return t02.getTag_id();
            }
        }
        return System.currentTimeMillis() + "";
    }

    public static void W2(TextView textView, int i4, int i5, String str) {
        textView.setTextColor(-12802819);
        boolean z4 = v0(i5, str) > 0;
        if (i4 == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else if (i4 == 2 && !z4) {
            textView.setText("即将开放");
            textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.wdp22));
            textView.setTextColor(-7763575);
            textView.setEnabled(false);
            textView.setBackgroundResource(R.drawable.recom_grey_butn);
        } else if (i4 == 6 && !z4) {
            textView.setText("预约");
            textView.setTextSize(2, 13.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else {
            if (i5 > 0) {
                Resources resources = textView.getResources();
                textView.setText(resources.getString(R.string.pay_game_amount, i5 + ""));
            } else {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
            }
            textView.setTextSize(2, 13.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        }
    }

    public static void W3(Context context, DownloadTask downloadTask, String str) {
        LoginCfgsBean loginCfgsBean;
        boolean z4;
        if (!"login".equals(str)) {
            if (IntentUtil.getInstance().startGameCheckRealnameHasIntent(context, AccountUtil_.getInstance_(context).getAccountData(), "startGame", downloadTask.getCrc_link_type_val())) {
                return;
            }
            if ((AccountUtil_.getInstance_(context).isTourist() || AccountUtil_.getInstance_(context).getAccountData().getUid() == 0) && (loginCfgsBean = MApplication.S) != null && loginCfgsBean.getIs_open_login() == 1) {
                PrefDef_ prefDef_ = new PrefDef_(context);
                if (!com.join.mgps.Util.y.u(prefDef_.lastShowLoginGuiedTime().d().longValue()) && MApplication.S != null) {
                    prefDef_.startgameLogintimes_open_login().g(Integer.valueOf(MApplication.S.getTimes_open_login()));
                    prefDef_.startGameShowLoginNumber().g(Integer.valueOf(MApplication.S.getHow_times_open()));
                }
                int intValue = prefDef_.startGameShowLoginNumber().d().intValue();
                if (intValue > 0) {
                    prefDef_.startGameShowLoginNumber().g(Integer.valueOf(intValue - 1));
                } else {
                    if (loginCfgsBean.getLogin_is_allow_skip() == 1) {
                        int intValue2 = prefDef_.startgameLogintimes_open_login().d().intValue();
                        if (intValue2 > 0) {
                            LoginSplashActivity_.intent(context).gameId(downloadTask.getCrc_link_type_val()).start();
                            prefDef_.startgameLogintimes_open_login().g(Integer.valueOf(intValue2 - 1));
                        }
                    } else {
                        LoginSplashActivity_.intent(context).gameId(downloadTask.getCrc_link_type_val()).start();
                    }
                    z4 = true;
                    prefDef_.lastShowLoginGuiedTime().g(Long.valueOf(System.currentTimeMillis()));
                }
                z4 = false;
                prefDef_.lastShowLoginGuiedTime().g(Long.valueOf(System.currentTimeMillis()));
            } else {
                z4 = false;
            }
            if (z4) {
                return;
            }
        }
        if (downloadTask.isOpen() && g2.i(downloadTask.getTips()) && !downloadTask.getTips().contains("网游")) {
            if (!downloadTask.isNotCheckAddShortcut()) {
                DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
                if (F != null && (F.getUrl().endsWith(".apk") || "androidobb".equals(F.getRomType()) || "46".equals(F.getRomType()))) {
                    String packageName = F.getPackageName();
                    if (!g2.h(packageName) && com.join.mgps.Util.g.e(context, packageName) && !w1.d(context, downloadTask.getCrc_link_type_val())) {
                        com.join.mgps.Util.b0.f0(context).I(context, downloadTask, true, str);
                        return;
                    }
                } else if (!w1.d(context, downloadTask.getCrc_link_type_val())) {
                    com.join.mgps.Util.b0.f0(context).I(context, downloadTask, true, str);
                    return;
                }
            }
            downloadTask.setNotCheckAddShortcut(false);
        }
        V3(context, downloadTask, 0, str);
    }

    public static boolean X(List<TipBean> list) {
        if (list == null) {
            return false;
        }
        for (TipBean tipBean : list) {
            if ((ConstantIntEnum.GAMEOL.value() + "").equals(tipBean.getId())) {
                return true;
            }
        }
        return false;
    }

    public static void X0(Context context, AppBeanMain appBeanMain) {
        String game_id;
        int i4;
        int i5;
        boolean z4;
        String str;
        boolean z5;
        String str2;
        AppBean game_info = appBeanMain.getGame_info();
        if (game_info != null) {
            if (game_info.getMod_info() != null) {
                game_id = game_info.getMod_info().getMod_game_id();
                i4 = game_info.get_from();
                i5 = game_info.get_from_type();
            } else {
                game_id = game_info.getGame_id();
                i4 = game_info.get_from();
                i5 = game_info.get_from_type();
            }
            String str3 = game_id;
            int i6 = i4;
            int i7 = i5;
            game_info.getTag_info();
            String str4 = game_info.getMod_info() != null ? "VIRTUAL_SINGLE" : "";
            if ("7".equals(game_info.getSp_tag_info().getModel().getId())) {
                str = str4;
                z4 = false;
            } else {
                z4 = true;
                str = "ANDROID_SINGLE";
            }
            if (z4) {
                z5 = z4;
                str2 = str;
            } else {
                boolean m22 = g2.h(game_info.getPlugin_num()) ? false : m2(Integer.parseInt(game_info.getPlugin_num()));
                if (m22) {
                    str2 = Z1(game_info.getPlugin_num()).getDown_type() == 2 ? "SO_SIMULATOR" : "RAW_SIMULATOR";
                } else {
                    str2 = str;
                }
                z5 = m22;
            }
            d1(context, str3, str2, i6, i7, game_info.getRecPosition(), game_info.getReMarks(), game_info.getNodeId(), game_info.getPosition_path(), z5);
        }
    }

    public static String X1(int i4) {
        return ConstantIntEnum.FBA.value() == i4 ? "arc" : ConstantIntEnum.NDS.value() == i4 ? "nds" : ConstantIntEnum.PS2.value() == i4 ? "ps2" : ConstantIntEnum.N3DS.value() == i4 ? "3ds" : ConstantIntEnum.GBA.value() == i4 ? "gba" : ConstantIntEnum.PSP.value() == i4 ? "psp" : ConstantIntEnum.FC.value() == i4 ? "fc" : ConstantIntEnum.AVG.value() == i4 ? "avg" : ConstantIntEnum.FIGHT.value() == i4 ? "fight" : ConstantIntEnum.SFC.value() == i4 ? "sfc" : ConstantIntEnum.WORLD.value() == i4 ? "world" : ConstantIntEnum.NET.value() == i4 ? "net" : ConstantIntEnum.MGAME.value() == i4 ? "mgame" : ConstantIntEnum.DATA.value() == i4 ? "data" : ConstantIntEnum.OBB.value() == i4 ? "obb" : ConstantIntEnum.MD.value() == i4 ? "md" : ConstantIntEnum.GBA_ENHANCE.value() == i4 ? "gba" : ConstantIntEnum.PS.value() == i4 ? "ps" : ConstantIntEnum.WSC.value() == i4 ? "wsc" : ConstantIntEnum.GBC.value() == i4 ? "gbc" : ConstantIntEnum.N64.value() == i4 ? "n64" : ConstantIntEnum.ONS.value() == i4 ? "ons" : ConstantIntEnum.DC.value() == i4 ? "dc" : "";
    }

    public static void X2(TextView textView, View view, DownloadTask downloadTask) {
        int down_status = downloadTask.getDown_status();
        int pay_game_amount = downloadTask.getPay_game_amount();
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        downloadTask.getDownload_source_switch_v2();
        view.setEnabled(true);
        textView.setTextColor(-12802819);
        boolean z4 = v0(pay_game_amount, crc_link_type_val) > 0;
        if (down_status == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else if (down_status == 2 && !z4) {
            textView.setText("即将开放");
            textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.wdp22));
            textView.setTextColor(-7763575);
            view.setEnabled(false);
            textView.setBackgroundResource(R.drawable.recom_grey_butn);
        } else if (down_status == 6 && !z4) {
            textView.setText("预约");
            textView.setTextSize(2, 13.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else {
            if (pay_game_amount > 0) {
                Resources resources = textView.getResources();
                textView.setText(resources.getString(R.string.pay_game_amount, pay_game_amount + ""));
            } else {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
            }
            textView.setTextSize(2, 13.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        }
    }

    public static void X3(Context context, NetBattleStartGameDto netBattleStartGameDto, DownloadTask downloadTask) {
        String p4 = p4(downloadTask.getGameZipPath());
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
        if (F != null) {
            downloadTask.setLock_sp(F.getLock_sp());
        }
        EMUApkTable T = T(context, downloadTask);
        if (T != null) {
            int i4 = 33;
            try {
                i4 = Integer.parseInt(downloadTask.getRomType());
            } catch (Exception unused) {
            }
            StartGameMeta startGameMeta = new StartGameMeta();
            startGameMeta.setPackageName(T.getPackage_name());
            startGameMeta.setActivityName(T.getLaunch_name());
            startGameMeta.setRomPath(p4);
            startGameMeta.setStartMode(7);
            startGameMeta.setGameID(crc_link_type_val);
            startGameMeta.setPorder(netBattleStartGameDto.getPorder());
            startGameMeta.setType(i4);
            startGameMeta.setRoomID(netBattleStartGameDto.getRoomID());
            startGameMeta.setServerPort(netBattleStartGameDto.getServerPort() + "");
            startGameMeta.setServerIP(netBattleStartGameDto.getServerIP());
            startGameMeta.setPlugin_area_val(downloadTask.getPlugin_area_val());
            startGameMeta.setP1Name(netBattleStartGameDto.getP1Name());
            startGameMeta.setP2Name(netBattleStartGameDto.getP2Name());
            startGameMeta.setOldGame(netBattleStartGameDto.getOldGame());
            startGameMeta.setClientIp(netBattleStartGameDto.getClientIp());
            C4(context, downloadTask, startGameMeta);
            startGameMeta.setToken(AccountUtil_.getInstance_(context).getToken());
            startGameMeta.setTcptype(netBattleStartGameDto.getTcptype());
            startGameMeta.setUdpport(netBattleStartGameDto.getUdpport());
            startGameMeta.setUserIcon(netBattleStartGameDto.getUserIcon());
            startGameMeta.setUserName(netBattleStartGameDto.getUserName());
            startGameMeta.setRamCheck(downloadTask.getSync_memory());
            startGameMeta.setGametype(B2(downloadTask.getTipBeans()));
            startGameMeta.setScoreBoard(netBattleStartGameDto.isOpenBattleScore() ? 1 : 0);
            B(context, startGameMeta, T);
            t2(context, startGameMeta, 1);
        }
    }

    private void Y(Context context, Bitmap bitmap, View view, float f5) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, -view.getLeft(), -view.getTop(), (Paint) null);
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createBitmap);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, createFromBitmap.getElement());
        create2.setInput(createFromBitmap);
        create2.setRadius(f5);
        create2.forEach(createFromBitmap);
        createFromBitmap.copyTo(createBitmap);
        view.setBackground(new BitmapDrawable(context.getResources(), createBitmap));
        create.destroy();
    }

    public static void Y0(Context context, CollectionBeanSub collectionBeanSub) {
        String game_id;
        int i4;
        int i5;
        boolean z4;
        String str;
        boolean z5;
        String str2;
        if (collectionBeanSub.getMod_info() != null) {
            game_id = collectionBeanSub.getMod_info().getMod_game_id();
            i4 = collectionBeanSub.get_from();
            i5 = collectionBeanSub.get_from_type();
        } else {
            game_id = collectionBeanSub.getGame_id();
            i4 = collectionBeanSub.get_from();
            i5 = collectionBeanSub.get_from_type();
        }
        String str3 = game_id;
        int i6 = i4;
        int i7 = i5;
        String str4 = collectionBeanSub.getMod_info() != null ? "VIRTUAL_SINGLE" : "";
        if (collectionBeanSub.getSp_tag_info() == null || collectionBeanSub.getSp_tag_info().getModel() == null || !"7".equals(collectionBeanSub.getSp_tag_info().getModel().getId())) {
            z4 = true;
            str = "ANDROID_SINGLE";
        } else {
            str = str4;
            z4 = false;
        }
        if (z4) {
            z5 = z4;
            str2 = str;
        } else {
            boolean m22 = g2.h(collectionBeanSub.getPlugin_num()) ? false : m2(Integer.parseInt(collectionBeanSub.getPlugin_num()));
            if (m22) {
                str2 = Z1(collectionBeanSub.getPlugin_num()).getDown_type() == 2 ? "SO_SIMULATOR" : "RAW_SIMULATOR";
            } else {
                str2 = str;
            }
            z5 = m22;
        }
        g1(context, str3, str2, i6, i7, collectionBeanSub.getRecPosition(), collectionBeanSub.getReMarks(), collectionBeanSub.getNodeId(), collectionBeanSub.getPosition_path(), z5, collectionBeanSub.isFromRecomDown(), 7, "", collectionBeanSub.getDownType(), collectionBeanSub.getExt(), collectionBeanSub.getWhere());
    }

    public static int Y1(Context context) {
        DownloadTask F = p1.f.K().F(com.papa.sim.statistic.p.f58883i);
        if (F == null) {
            return 1;
        }
        List<UserPurchaseInfo> o4 = b2.m0.p().o(AccountUtil_.getInstance_(context).getUid(), F.getCrc_link_type_val());
        if (F.getLock_sp() == 0) {
            return 0;
        }
        if (o4 != null && o4.size() > 0) {
            UserPurchaseInfo userPurchaseInfo = o4.get(0);
            String isOpenSp = userPurchaseInfo.getIsOpenSp();
            String spExpireTime = userPurchaseInfo.getSpExpireTime();
            if (spExpireTime != null && !spExpireTime.equals("")) {
                try {
                    spExpireTime = new String(Base64Utils.decode(spExpireTime.getBytes("utf-8")));
                } catch (UnsupportedEncodingException e5) {
                    e5.printStackTrace();
                }
            }
            if (isOpenSp != null && isOpenSp.equals("true") && spExpireTime != null && Long.parseLong(spExpireTime) - (System.currentTimeMillis() / 1000) > 0) {
                return 2;
            }
        }
        return 1;
    }

    public static void Y2(TextView textView, View view, AppBean appBean) {
        int down_status = appBean.getDown_status();
        PayTagInfo pay_tag_info = appBean.getPay_tag_info();
        String game_id = appBean.getGame_id();
        appBean.getDownload_source_switch_v2();
        view.setEnabled(true);
        textView.setTextColor(-12802819);
        boolean z4 = w0(pay_tag_info, game_id) > 0;
        if (down_status == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else if (down_status == 2 && !z4) {
            textView.setText("即将开放");
            textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.wdp22));
            textView.setTextColor(-7763575);
            view.setEnabled(false);
            textView.setBackgroundResource(R.drawable.recom_grey_butn);
        } else if (down_status == 6 && !z4) {
            textView.setText("预约");
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else {
            if (pay_tag_info == null || pay_tag_info.getAmount_check() <= 0) {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
            } else {
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, pay_tag_info.getPayGameAmount()));
            }
            textView.setTextSize(2, 13.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        }
    }

    public static void Y3(Context context, NetBattleStartGameDto netBattleStartGameDto, DownloadTask downloadTask, String str) {
        String p4 = p4(downloadTask.getGameZipPath());
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        EMUApkTable T = T(context, downloadTask);
        if (T != null) {
            int i4 = 33;
            try {
                i4 = Integer.parseInt(downloadTask.getRomType());
            } catch (Exception unused) {
            }
            StartGameMeta startGameMeta = new StartGameMeta();
            startGameMeta.setPackageName(T.getPackage_name());
            startGameMeta.setActivityName(T.getLaunch_name());
            startGameMeta.setRomPath(p4);
            startGameMeta.setStartMode(8);
            startGameMeta.setGameID(crc_link_type_val);
            startGameMeta.setPorder(netBattleStartGameDto.getPorder());
            startGameMeta.setType(i4);
            startGameMeta.setRoomID(netBattleStartGameDto.getRoomID());
            startGameMeta.setServerPort(netBattleStartGameDto.getServerPort() + "");
            startGameMeta.setServerIP(netBattleStartGameDto.getServerIP());
            startGameMeta.setPlugin_area_val(downloadTask.getPlugin_area_val());
            startGameMeta.setP1Name(netBattleStartGameDto.getP1Name());
            startGameMeta.setP2Name(netBattleStartGameDto.getP2Name());
            startGameMeta.setOldGame(netBattleStartGameDto.getOldGame());
            startGameMeta.setClientIp(netBattleStartGameDto.getClientIp());
            C4(context, downloadTask, startGameMeta);
            startGameMeta.setToken(AccountUtil_.getInstance_(context).getToken());
            startGameMeta.setTcptype(netBattleStartGameDto.getTcptype());
            startGameMeta.setUdpport(netBattleStartGameDto.getUdpport());
            startGameMeta.setRamCheck(downloadTask.getSync_memory());
            startGameMeta.setNetState(str);
            startGameMeta.setUserIcon(netBattleStartGameDto.getUserIcon());
            startGameMeta.setUserName(netBattleStartGameDto.getUserName());
            startGameMeta.setGametype(B2(downloadTask.getTipBeans()));
            startGameMeta.setScoreBoard(netBattleStartGameDto.isOpenBattleScore() ? 1 : 0);
            B(context, startGameMeta, T);
            t2(context, startGameMeta, 1);
        }
    }

    public static String Z(String str, String str2, double d5) {
        d5 = (d5 < 0.0d || d5 > 1.0d) ? 0.5d : 0.5d;
        if (str.contains("#") && str2.contains("#") && str.length() == str2.length() && str2.length() == 7) {
            String replace = str.replace("#", "");
            String replace2 = str2.replace("#", "");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("#");
            for (int i4 = 0; i4 < replace.length(); i4++) {
                StringBuilder sb = new StringBuilder();
                double d02 = d0(String.valueOf(replace.charAt(i4)));
                Double.isNaN(d02);
                double d03 = d0(String.valueOf(replace2.charAt(i4)));
                Double.isNaN(d03);
                sb.append((int) ((d02 * d5) + (d03 * (1.0d - d5))));
                sb.append("");
                stringBuffer.append(e0(sb.toString()));
            }
            return stringBuffer.toString();
        }
        return "";
    }

    public static void Z0(Context context, DetailResultBean detailResultBean) {
        String crc_sign_id;
        int i4;
        int i5;
        boolean z4;
        String str;
        boolean z5;
        String str2;
        if (detailResultBean.getMod_info() != null) {
            crc_sign_id = detailResultBean.getMod_info().getMod_game_id();
            i4 = detailResultBean.get_from();
            i5 = detailResultBean.get_from_type();
        } else {
            crc_sign_id = detailResultBean.getCrc_sign_id();
            i4 = detailResultBean.get_from();
            i5 = detailResultBean.get_from_type();
        }
        String str3 = crc_sign_id;
        int i6 = i4;
        int i7 = i5;
        detailResultBean.getTag_info();
        String str4 = detailResultBean.getMod_info() != null ? "VIRTUAL_SINGLE" : "";
        if ("7".equals(detailResultBean.getSp_tag_info().getModel().getId())) {
            str = str4;
            z4 = false;
        } else {
            z4 = true;
            str = "ANDROID_SINGLE";
        }
        if (z4) {
            z5 = z4;
            str2 = str;
        } else {
            boolean m22 = g2.h(detailResultBean.getPlugin_num()) ? false : m2(Integer.parseInt(detailResultBean.getPlugin_num()));
            if (m22) {
                str2 = Z1(detailResultBean.getPlugin_num()).getDown_type() == 2 ? "SO_SIMULATOR" : "RAW_SIMULATOR";
            } else {
                str2 = str;
            }
            z5 = m22;
        }
        d1(context, str3, str2, i6, i7, detailResultBean.getRecPosition(), detailResultBean.getReMarks(), detailResultBean.getNodeId(), detailResultBean.getPosition_path(), z5);
    }

    public static EMUApkTable Z1(String str) {
        EMUApkTable t02;
        if (str == null || (t02 = t0(str)) == null) {
            return null;
        }
        return t02;
    }

    public static void Z2(TextView textView, View view, CollectionBeanSub collectionBeanSub) {
        int down_status = collectionBeanSub.getDown_status();
        PayTagInfo pay_tag_info = collectionBeanSub.getPay_tag_info();
        String game_id = collectionBeanSub.getGame_id();
        collectionBeanSub.getDownload_source_switch_v2();
        view.setEnabled(true);
        textView.setTextColor(-12802819);
        boolean z4 = w0(pay_tag_info, game_id) > 0;
        if (down_status == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else if (down_status == 2 && !z4) {
            textView.setText("即将开放");
            textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.wdp22));
            textView.setTextColor(-7763575);
            view.setEnabled(false);
            textView.setBackgroundResource(R.drawable.recom_grey_butn);
        } else if (down_status == 6 && collectionBeanSub.getGame_book() == 0 && !z4) {
            textView.setText("预约");
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else if (down_status == 6 && collectionBeanSub.getGame_book() == 1 && !z4) {
            textView.setText("已预约");
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else {
            if (pay_tag_info == null || pay_tag_info.getAmount_check() <= 0) {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
            } else {
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, pay_tag_info.getPayGameAmount()));
            }
            textView.setTextSize(2, 13.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        }
    }

    public static void Z3(Context context, String str, String str2, String str3, int i4, String str4, long j4, DownloadTask downloadTask) {
        DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
        if (F != null) {
            downloadTask.setLock_sp(F.getLock_sp());
        }
        EMUApkTable T = T(context, downloadTask);
        if (T != null) {
            StartGameMeta startGameMeta = new StartGameMeta();
            startGameMeta.setPackageName(T.getPackage_name());
            startGameMeta.setActivityName(T.getLaunch_name());
            startGameMeta.setRomPath(p4(str2));
            startGameMeta.setStartMode(i4);
            startGameMeta.setServerIP(str4);
            startGameMeta.setGameID(str);
            startGameMeta.setType(Integer.parseInt(T.getTag_id()));
            startGameMeta.setPlugin_area_val(j4);
            C4(context, downloadTask, startGameMeta);
            startGameMeta.setToken(AccountUtil_.getInstance_(context).getToken());
            startGameMeta.setTcptype(1);
            startGameMeta.setRamCheck(downloadTask.getSync_memory());
            startGameMeta.setGametype(B2(downloadTask.getTipBeans()));
            B(context, startGameMeta, T);
            s2(context, startGameMeta);
        }
    }

    public static String a(long j4) {
        return b(j4, "#.00");
    }

    private static boolean a0(String str, String str2, Context context) {
        DownloadTask F = p1.f.K().F(str);
        DownloadTask F2 = p1.f.K().F(str2);
        if (F == null && F2 == null) {
            return true;
        }
        if (!(context instanceof Activity) && MApplication.f1497x.getActivity() != null) {
            context = MApplication.f1497x.getActivity();
        }
        l2.a(context).b("暂时不能下载此游戏");
        return false;
    }

    public static void a1(Context context, GameDiscoverBean gameDiscoverBean) {
        String crc_sign_id;
        int i4;
        int i5;
        boolean z4;
        String str;
        boolean z5;
        String str2;
        if (gameDiscoverBean.getMod_info() != null) {
            crc_sign_id = gameDiscoverBean.getMod_info().getMod_game_id();
            i4 = gameDiscoverBean.get_from();
            i5 = gameDiscoverBean.get_from_type();
        } else {
            crc_sign_id = gameDiscoverBean.getCrc_sign_id();
            i4 = gameDiscoverBean.get_from();
            i5 = gameDiscoverBean.get_from_type();
        }
        String str3 = crc_sign_id;
        int i6 = i4;
        int i7 = i5;
        gameDiscoverBean.getTag_info();
        String str4 = gameDiscoverBean.getMod_info() != null ? "VIRTUAL_SINGLE" : "";
        if ("7".equals(gameDiscoverBean.getSp_tag_info().getModel().getId())) {
            str = str4;
            z4 = false;
        } else {
            z4 = true;
            str = "ANDROID_SINGLE";
        }
        if (z4) {
            z5 = z4;
            str2 = str;
        } else {
            boolean m22 = g2.h(gameDiscoverBean.getPlugin_num()) ? false : m2(Integer.parseInt(gameDiscoverBean.getPlugin_num()));
            if (m22) {
                str2 = Z1(gameDiscoverBean.getPlugin_num()).getDown_type() == 2 ? "SO_SIMULATOR" : "RAW_SIMULATOR";
            } else {
                str2 = str;
            }
            z5 = m22;
        }
        g1(context, str3, str2, i6, i7, gameDiscoverBean.getRecPosition(), gameDiscoverBean.getReMarks(), gameDiscoverBean.getNodeId(), gameDiscoverBean.getPosition_path(), z5, false, 7, "", 0, null, gameDiscoverBean.getWhere());
    }

    public static String a2(DownloadTask downloadTask) {
        TipNew sp_tag_info;
        if (downloadTask != null && (sp_tag_info = downloadTask.getSp_tag_info()) != null) {
            if (sp_tag_info.getMini_game() != null) {
                return sp_tag_info.getMini_game().getId();
            }
            if (sp_tag_info.getSingle_game_vm() != null) {
                return sp_tag_info.getSingle_game_vm().getId();
            }
            if (APKUtils.G(downloadTask) && g2.i(downloadTask.getMod_info())) {
                return "2046";
            }
            if (sp_tag_info.getModel() != null && "23".equals(sp_tag_info.getModel().getId())) {
                return sp_tag_info.getModel().getId();
            }
            if (sp_tag_info.getModel() != null) {
                return sp_tag_info.getModel().getId();
            }
        }
        return "0";
    }

    public static void a3(TextView textView, View view, GInfoBean gInfoBean) {
        int intValue = gInfoBean.getDown_state().intValue();
        PayTagInfo pay_tag_info = gInfoBean.getPay_tag_info();
        String id = gInfoBean.getId();
        view.setEnabled(true);
        textView.setTextColor(-12802819);
        boolean z4 = w0(pay_tag_info, id) > 0;
        if (intValue == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else if (intValue == 2 && !z4) {
            textView.setText("即将开放");
            textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.wdp22));
            textView.setTextColor(-7763575);
            view.setEnabled(false);
            textView.setBackgroundResource(R.drawable.recom_grey_butn);
        } else if (intValue == 6 && !z4) {
            if (gInfoBean.getGame_book() == 1) {
                textView.setText("已预约");
            } else {
                textView.setText("预约");
            }
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else {
            if (pay_tag_info == null || pay_tag_info.getAmount_check() <= 0) {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
            } else {
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, pay_tag_info.getPayGameAmount()));
            }
            textView.setTextSize(2, 13.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        }
    }

    public static void a4(DownloadTask downloadTask, Context context) {
        String gameZipPath = downloadTask.getGameZipPath();
        if (gameZipPath != null && !gameZipPath.equals("") && new File(gameZipPath).exists()) {
            com.join.android.app.common.utils.e.l0(context).x(context, gameZipPath);
            return;
        }
        downloadTask.setStatus(0);
        downloadTask.setGameZipPath("");
        downloadTask.setPath("");
        downloadTask.setProgress(0L);
        if (downloadTask.getDown_status() == 5) {
            l1(context, downloadTask);
        } else {
            com.php25.PDownload.d.c(downloadTask, context);
        }
    }

    public static String b(long j4, String str) {
        String sb;
        DecimalFormat decimalFormat = new DecimalFormat(str);
        if (j4 < 1024) {
            sb = decimalFormat.format(j4) + "B";
        } else if (j4 < 1048576) {
            StringBuilder sb2 = new StringBuilder();
            double d5 = j4;
            Double.isNaN(d5);
            sb2.append(decimalFormat.format(d5 / 1024.0d));
            sb2.append("KB");
            sb = sb2.toString();
        } else if (j4 < 1073741824) {
            StringBuilder sb3 = new StringBuilder();
            double d6 = j4;
            Double.isNaN(d6);
            sb3.append(decimalFormat.format(d6 / 1048576.0d));
            sb3.append("M");
            sb = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            double d7 = j4;
            Double.isNaN(d7);
            sb4.append(decimalFormat.format(d7 / 1.073741824E9d));
            sb4.append("GB");
            sb = sb4.toString();
        }
        return (sb.equals(".0B") || sb.equals(".00B")) ? "0B" : sb;
    }

    public static boolean b0(Context context, String str) {
        try {
            PrefDef_ prefDef_ = new PrefDef_(context);
            int intValue = prefDef_.downloadSpeedUpCount().d().intValue();
            int intValue2 = prefDef_.downloadSpeedUpCountCurrent().d().intValue();
            long longValue = prefDef_.downloadSpeedUpLastTime().d().longValue();
            String d5 = prefDef_.downloadSpeedUpGames().d();
            String str2 = "";
            if (TextUtils.isEmpty(d5)) {
                d5 = "";
            }
            if (com.join.mgps.Util.y.u(longValue)) {
                str2 = d5;
            } else {
                prefDef_.downloadSpeedUpCountCurrent().g(0);
                prefDef_.downloadSpeedUpGames().g("");
                intValue2 = 0;
            }
            if (intValue2 < intValue && !str2.contains(str)) {
                if (p1.f.K().F(str) == null) {
                    return true;
                }
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return true;
        }
    }

    public static void b1(Context context, GamedetialModleFourBean gamedetialModleFourBean) {
        c1(context, gamedetialModleFourBean, "");
    }

    public static int b2(int i4) {
        if (i4 != 61) {
            if (i4 != 62) {
                switch (i4) {
                    case 10:
                        return ConstantIntEnum.FBA.value();
                    case 11:
                        return ConstantIntEnum.FC.value();
                    case 12:
                        return ConstantIntEnum.GBA.value();
                    case 13:
                        return ConstantIntEnum.SFC.value();
                    case 14:
                        return ConstantIntEnum.PSP.value();
                    case 15:
                        return ConstantIntEnum.FEATURED_ONLINE.value();
                    case 16:
                        return ConstantIntEnum.MD.value();
                    case 17:
                        return ConstantIntEnum.PS.value();
                    case 18:
                        return ConstantIntEnum.LARGE_SINGLE.value();
                    case 19:
                        return ConstantIntEnum.WSC.value();
                    case 20:
                        return ConstantIntEnum.NDS.value();
                    case 21:
                        return ConstantIntEnum.GBC.value();
                    case 22:
                        return ConstantIntEnum.N64.value();
                    case 23:
                        return ConstantIntEnum.ONS.value();
                    case 24:
                        return ConstantIntEnum.DC.value();
                    default:
                        return i4;
                }
            }
            return ConstantIntEnum.PS2.value();
        }
        return ConstantIntEnum.N3DS.value();
    }

    public static void b3(TextView textView, DownloadTask downloadTask) {
        int down_status = downloadTask.getDown_status();
        int pay_game_amount = downloadTask.getPay_game_amount();
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        downloadTask.getDownload_source_switch_v2();
        textView.setTextColor(-12802819);
        boolean z4 = v0(pay_game_amount, crc_link_type_val) > 0;
        if (down_status == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else if (down_status == 2 && !z4) {
            textView.setText("即将开放");
            textView.setEnabled(false);
            textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.wdp22));
            textView.setTextColor(-7763575);
            textView.setBackgroundResource(R.drawable.recom_grey_butn);
        } else if (down_status == 6 && !z4) {
            textView.setText("预约");
            textView.setTextSize(2, 13.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else {
            if (pay_game_amount > 0) {
                Resources resources = textView.getResources();
                textView.setText(resources.getString(R.string.pay_game_amount, pay_game_amount + ""));
            } else {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
            }
            textView.setTextSize(2, 13.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        }
    }

    public static void b4(Context context, NetBattleStartGameDto netBattleStartGameDto, DownloadTask downloadTask, int i4) {
        String gameZipPath = downloadTask.getGameZipPath();
        String substring = gameZipPath.substring(0, gameZipPath.lastIndexOf(h0.f27805a));
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        EMUApkTable T = T(context, downloadTask);
        if (T != null) {
            int i5 = 33;
            try {
                i5 = Integer.parseInt(downloadTask.getRomType());
            } catch (Exception unused) {
            }
            StartGameMeta startGameMeta = new StartGameMeta();
            startGameMeta.setPackageName(T.getPackage_name());
            startGameMeta.setActivityName(T.getLaunch_name());
            startGameMeta.setRomPath(substring);
            startGameMeta.setStartMode(i4);
            startGameMeta.setGameID(crc_link_type_val);
            startGameMeta.setType(i5);
            startGameMeta.setRoomID(netBattleStartGameDto.getRoomID());
            startGameMeta.setServerPort(netBattleStartGameDto.getServerPort() + "");
            startGameMeta.setServerIP(netBattleStartGameDto.getServerIP());
            startGameMeta.setPlugin_area_val(downloadTask.getPlugin_area_val());
            startGameMeta.setPorder(netBattleStartGameDto.getPorder());
            startGameMeta.setP1Name(netBattleStartGameDto.getP1Name());
            startGameMeta.setP2Name(netBattleStartGameDto.getP2Name());
            startGameMeta.setOldGame(netBattleStartGameDto.getOldGame());
            startGameMeta.setClientIp(netBattleStartGameDto.getClientIp());
            C4(context, downloadTask, startGameMeta);
            startGameMeta.setToken(AccountUtil_.getInstance_(context).getToken());
            startGameMeta.setTcptype(netBattleStartGameDto.getTcptype());
            startGameMeta.setUdpport(netBattleStartGameDto.getUdpport());
            startGameMeta.setRamCheck(downloadTask.getSync_memory());
            startGameMeta.setNetMode(1);
            startGameMeta.setUserIcon(netBattleStartGameDto.getUserIcon());
            startGameMeta.setUserName(netBattleStartGameDto.getUserName());
            startGameMeta.setNetPlayers(netBattleStartGameDto.getNetPlayers());
            startGameMeta.setGamePlayers(netBattleStartGameDto.getGamePlayers());
            startGameMeta.setSp(0);
            startGameMeta.setGroupId(netBattleStartGameDto.getGroupId());
            startGameMeta.setArea(netBattleStartGameDto.getArea());
            startGameMeta.setGametype(B2(downloadTask.getTipBeans()));
            B(context, startGameMeta, T);
            t2(context, startGameMeta, 1);
        }
    }

    public static String c(long j4) {
        String sb;
        DecimalFormat decimalFormat = new DecimalFormat("#");
        if (j4 < 1024) {
            sb = decimalFormat.format(j4) + "B";
        } else if (j4 < 1048576) {
            StringBuilder sb2 = new StringBuilder();
            double d5 = j4;
            Double.isNaN(d5);
            sb2.append(decimalFormat.format(d5 / 1024.0d));
            sb2.append("KB");
            sb = sb2.toString();
        } else if (j4 < 1073741824) {
            StringBuilder sb3 = new StringBuilder();
            double d6 = j4;
            Double.isNaN(d6);
            sb3.append(decimalFormat.format(d6 / 1048576.0d));
            sb3.append("M");
            sb = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            double d7 = j4;
            Double.isNaN(d7);
            sb4.append(decimalFormat.format(d7 / 1.073741824E9d));
            sb4.append("G");
            sb = sb4.toString();
        }
        return (sb.equals(".0B") || sb.equals(".00B")) ? "0B" : sb;
    }

    public static boolean c0(Context context, String str) {
        int i4;
        int i5;
        DownloadSpeedupCfgBean downloadSpeedupCfgBean;
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (com.join.mgps.Util.b.piv(AccountUtil_.getInstance_(context).getAccountData())) {
            return false;
        }
        PrefDef_ prefDef_ = new PrefDef_(context);
        int intValue = prefDef_.downloadSpeedUpCount().d().intValue();
        int intValue2 = prefDef_.downloadSpeedUpCountCurrent().d().intValue();
        int intValue3 = prefDef_.downloadSpeedUpCountAD().d().intValue();
        int intValue4 = prefDef_.downloadSpeedUpCountCurrentAD().d().intValue();
        long longValue = prefDef_.downloadSpeedUpLastTime().d().longValue();
        TextUtils.isEmpty(prefDef_.downloadSpeedUpGames().d());
        if (!com.join.mgps.Util.y.u(longValue)) {
            prefDef_.downloadSpeedUpCountCurrent().g(0);
            prefDef_.downloadSpeedUpCountCurrentAD().g(0);
            prefDef_.downloadSpeedUpGames().g("");
            intValue2 = 0;
        }
        if (intValue2 < intValue && intValue4 < intValue3) {
            String d5 = prefDef_.downloadSpeedupCfg().d();
            if (!g2.i(d5) || (downloadSpeedupCfgBean = (DownloadSpeedupCfgBean) JsonMapper.getInstance().fromJson(d5, DownloadSpeedupCfgBean.class)) == null) {
                i4 = 0;
                i5 = 0;
            } else {
                i5 = downloadSpeedupCfgBean.getSwitch_state();
                i4 = downloadSpeedupCfgBean.getNet_status();
            }
            DownloadTask F = p1.f.K().F(str);
            if (F != null && g2.i(F.getTips())) {
                if (!F.getTips().contains("网游") || i5 != 1 || i4 != 1) {
                }
            }
            return true;
        }
        return false;
    }

    public static void c1(Context context, GamedetialModleFourBean gamedetialModleFourBean, String str) {
        String game_id;
        int i4;
        int i5;
        boolean z4;
        String str2;
        boolean z5;
        if (gamedetialModleFourBean.getMod_info() != null) {
            game_id = gamedetialModleFourBean.getMod_info().getMod_game_id();
            i4 = gamedetialModleFourBean.get_from();
            i5 = gamedetialModleFourBean.get_from_type();
        } else {
            game_id = gamedetialModleFourBean.getGame_id();
            i4 = gamedetialModleFourBean.get_from();
            i5 = gamedetialModleFourBean.get_from_type();
        }
        String str3 = game_id;
        int i6 = i4;
        int i7 = i5;
        gamedetialModleFourBean.getTag_info();
        String str4 = gamedetialModleFourBean.getMod_info() != null ? "VIRTUAL_SINGLE" : "";
        if ("7".equals(gamedetialModleFourBean.getSp_tag_info().getModel().getId())) {
            z4 = false;
        } else {
            str4 = "ANDROID_SINGLE";
            z4 = true;
        }
        if (z4) {
            str2 = str4;
            z5 = z4;
        } else {
            boolean m22 = g2.h(gamedetialModleFourBean.getPlugin_num()) ? false : m2(Integer.parseInt(gamedetialModleFourBean.getPlugin_num()));
            if (m22) {
                str4 = Z1(gamedetialModleFourBean.getPlugin_num()).getDown_type() == 2 ? "SO_SIMULATOR" : "RAW_SIMULATOR";
            }
            str2 = str4;
            z5 = m22;
        }
        if (gamedetialModleFourBean.getBespeak_switch() == 1 && gamedetialModleFourBean.getDown_status() == 6) {
            if (gamedetialModleFourBean.getGame_book() == 0) {
                ((CommonService_.h2) CommonService_.S2(context).extra("onClickGamebeSpeakGameId", str3)).a();
                return;
            } else if (gamedetialModleFourBean.getGame_book() == 1) {
                ((CommonService_.h2) CommonService_.S2(context).extra("onClickUnGamebeSpeakGameId", str3)).a();
                return;
            }
        }
        g1(context, str3, str2, i6, i7, gamedetialModleFourBean.getRecPosition(), gamedetialModleFourBean.getReMarks(), gamedetialModleFourBean.getNodeId(), gamedetialModleFourBean.getPosition_path(), z5, false, 6, str, gamedetialModleFourBean.getDownType(), gamedetialModleFourBean.getExt(), gamedetialModleFourBean.getWhere());
    }

    public static String c2(int i4) {
        ConstantIntEnum constantIntEnum = ConstantIntEnum.FBA;
        String nickName = constantIntEnum.nickName();
        if (i4 != 61) {
            if (i4 != 62) {
                switch (i4) {
                    case 10:
                        return constantIntEnum.nickName();
                    case 11:
                        return ConstantIntEnum.FC.nickName();
                    case 12:
                        return ConstantIntEnum.GBA.nickName();
                    case 13:
                        return ConstantIntEnum.SFC.nickName();
                    case 14:
                        return ConstantIntEnum.PSP.nickName();
                    case 15:
                        return ConstantIntEnum.FEATURED_ONLINE.nickName();
                    case 16:
                        return ConstantIntEnum.MD.nickName();
                    case 17:
                        return ConstantIntEnum.PS.nickName();
                    case 18:
                        return ConstantIntEnum.LARGE_SINGLE.nickName();
                    case 19:
                        return ConstantIntEnum.WSC.nickName();
                    case 20:
                        return ConstantIntEnum.NDS.nickName();
                    case 21:
                        return ConstantIntEnum.GBC.nickName();
                    case 22:
                        return ConstantIntEnum.N64.nickName();
                    case 23:
                        return ConstantIntEnum.ONS.nickName();
                    case 24:
                        return ConstantIntEnum.DC.nickName();
                    default:
                        return nickName;
                }
            }
            return ConstantIntEnum.PS2.nickName();
        }
        return ConstantIntEnum.N3DS.nickName();
    }

    public static void c3(TextView textView, AppBean appBean) {
        int down_status = appBean.getDown_status();
        PayTagInfo pay_tag_info = appBean.getPay_tag_info();
        String game_id = appBean.getGame_id();
        appBean.getDownload_source_switch_v2();
        textView.setEnabled(true);
        textView.setTextColor(-12802819);
        boolean z4 = w0(pay_tag_info, game_id) > 0;
        if (down_status == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
            textView.setTextSize(2, 11.0f);
        } else if (down_status == 2 && !z4) {
            textView.setText("即将开放");
            textView.setTextSize(2, 10.0f);
            textView.setTextColor(-7763575);
            textView.setEnabled(false);
            textView.setBackgroundResource(R.drawable.recom_grey_butn);
        } else if (down_status == 6 && !z4) {
            textView.setText("预约");
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else {
            if (pay_tag_info == null || pay_tag_info.getAmount_check() <= 0) {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
            } else {
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, pay_tag_info.getPayGameAmount()));
            }
            textView.setTextColor(-12802819);
            textView.setTextSize(2, 12.0f);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        }
    }

    public static void c4(Context context, String str, DownloadTask downloadTask, int i4, String str2, int i5, int i6, String str3, int i7) {
        String gameZipPath = downloadTask.getGameZipPath();
        String substring = gameZipPath.substring(0, gameZipPath.lastIndexOf(h0.f27805a));
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        EMUApkTable T = T(context, downloadTask);
        if (T != null) {
            int i8 = 33;
            try {
                i8 = Integer.parseInt(downloadTask.getRomType());
            } catch (Exception unused) {
            }
            StartGameMeta startGameMeta = new StartGameMeta();
            startGameMeta.setPackageName(T.getPackage_name());
            startGameMeta.setActivityName(T.getLaunch_name());
            startGameMeta.setRomPath(substring);
            startGameMeta.setStartMode(i4);
            startGameMeta.setGameID(crc_link_type_val);
            startGameMeta.setRankingID(str2);
            startGameMeta.setUserID(str);
            startGameMeta.setGamePlayers(i5);
            startGameMeta.setType(i8);
            startGameMeta.setPlugin_area_val(downloadTask.getPlugin_area_val());
            C4(context, downloadTask, startGameMeta);
            startGameMeta.setToken(AccountUtil_.getInstance_(context).getToken());
            startGameMeta.setRamCheck(downloadTask.getSync_memory());
            startGameMeta.setNetMode(1);
            startGameMeta.setSp(0);
            startGameMeta.setGametype(B2(downloadTask.getTipBeans()));
            startGameMeta.setRankMiniTime(i6);
            startGameMeta.setRolesJson(str3);
            startGameMeta.setRankAutoUpload(i7);
            B(context, startGameMeta, T);
            s2(context, startGameMeta);
        }
    }

    public static String d(long j4) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        double d5 = j4;
        Double.isNaN(d5);
        String format = decimalFormat.format(d5 / 1024.0d);
        return (format.equals(".0") || format.equals(".00")) ? "0" : format;
    }

    private static int d0(String str) {
        return Integer.valueOf(new BigInteger(str, 16).toString()).intValue();
    }

    public static void d1(Context context, String str, String str2, int i4, int i5, String str3, String str4, String str5, StatFactory.VolcanoOther volcanoOther, boolean z4) {
        f1(context, str, str2, i4, i5, str3, str4, str5, volcanoOther, z4, false, 7, "", 0);
    }

    public static boolean d2(Context context) {
        String[] split;
        String H1 = H1();
        if (TextUtils.isEmpty(H1) || H1.equalsIgnoreCase("qcom")) {
            return false;
        }
        if ((H1.toLowerCase().contains("qcom") || H1.toLowerCase().contains("qualcomm")) && (split = H1.split("\\s+")) != null && split.length > 0) {
            for (String str : split) {
                if (str.contains("SDM845") || str.startsWith("SM8")) {
                    return false;
                }
                if (str.startsWith("SM7")) {
                    if (str.length() <= 3) {
                        return false;
                    }
                    if (Character.isDigit(str.charAt(3)) && str.charAt(3) - '0' >= 3) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void d3(TextView textView, CollectionBeanSub collectionBeanSub) {
        int down_status = collectionBeanSub.getDown_status();
        PayTagInfo pay_tag_info = collectionBeanSub.getPay_tag_info();
        String game_id = collectionBeanSub.getGame_id();
        collectionBeanSub.getDownload_source_switch_v2();
        textView.setEnabled(true);
        textView.setTextColor(-12802819);
        boolean z4 = w0(pay_tag_info, game_id) > 0;
        if (down_status == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
            textView.setTextSize(2, 11.0f);
        } else if (down_status == 2 && !z4) {
            textView.setText("即将开放");
            textView.setTextSize(2, 10.0f);
            textView.setTextColor(-7763575);
            textView.setEnabled(false);
            textView.setBackgroundResource(R.drawable.recom_grey_butn);
        } else if (down_status == 6 && !z4) {
            textView.setText("预约");
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else {
            if (pay_tag_info == null || pay_tag_info.getAmount_check() <= 0) {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
            } else {
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, pay_tag_info.getPayGameAmount()));
            }
            textView.setTextColor(-12802819);
            textView.setTextSize(2, 12.0f);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        }
    }

    public static void d4(Context context, String str) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
        if (accountData != null && accountData.n2() != 2) {
            ((CommonService_.h2) CommonService_.S2(context).extra("paygameid", str)).a();
        } else {
            IntentUtil.getInstance().goMyAccountLoginActivity(context);
        }
    }

    public static boolean delete(File file) {
        if (file.exists()) {
            if (file.isFile()) {
                file.getAbsolutePath();
                File file2 = new File(file.getParent() + net.lingala.zip4j.util.e.F0 + System.currentTimeMillis());
                file.renameTo(file2);
                try {
                    return file2.delete();
                } catch (Exception e5) {
                    e5.printStackTrace();
                    return false;
                }
            }
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    for (File file3 : listFiles) {
                        delete(file3);
                    }
                    File file4 = new File(file.getParent() + File.separator + System.currentTimeMillis());
                    file.renameTo(file4);
                    try {
                        return file4.delete();
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                } else {
                    try {
                        File file5 = new File(file.getParent() + File.separator + System.currentTimeMillis());
                        file.renameTo(file5);
                        return file5.delete();
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static String e(long j4, String str) {
        String sb;
        DecimalFormat decimalFormat = new DecimalFormat(str);
        if (j4 <= 0) {
            return "0B";
        }
        if (j4 <= 10240) {
            sb = "0.01M";
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d5 = j4;
            Double.isNaN(d5);
            sb2.append(decimalFormat.format(d5 / 1048576.0d));
            sb2.append("M");
            sb = sb2.toString();
        }
        return sb.equals("0.0M") ? "0.1M" : sb;
    }

    private static String e0(String str) {
        return Integer.toHexString(Integer.parseInt(new BigInteger(str, 10).toString()));
    }

    public static void e1(Context context, String str, String str2, int i4, int i5, String str3, String str4, String str5, StatFactory.VolcanoOther volcanoOther, boolean z4, String str6) {
        g1(context, str, str2, i4, i5, str3, str4, str5, volcanoOther, z4, false, 7, "", 0, null, str6);
    }

    public static boolean e2(AppBean appBean) {
        if (appBean != null && appBean.getTag_info() != null) {
            Iterator<TipBean> it2 = appBean.getTag_info().iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals("242", it2.next().getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void e3(TextView textView, GInfoBean gInfoBean) {
        int intValue = gInfoBean.getDown_state().intValue();
        PayTagInfo pay_tag_info = gInfoBean.getPay_tag_info();
        String id = gInfoBean.getId();
        textView.setEnabled(true);
        textView.setTextColor(-12802819);
        boolean z4 = w0(pay_tag_info, id) > 0;
        if (intValue == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
            textView.setTextSize(2, 11.0f);
        } else if (intValue == 2 && !z4) {
            textView.setText("即将开放");
            textView.setTextSize(2, 10.0f);
            textView.setTextColor(-7763575);
            textView.setEnabled(false);
            textView.setBackgroundResource(R.drawable.recom_grey_butn);
        } else if (intValue == 6 && !z4) {
            textView.setText("预约");
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else {
            if (pay_tag_info == null || pay_tag_info.getAmount_check() <= 0) {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
            } else {
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, pay_tag_info.getPayGameAmount()));
            }
            textView.setTextColor(-12802819);
            textView.setTextSize(2, 12.0f);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        }
    }

    public static void e4(Context context, String str, String str2) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
        if (accountData != null && accountData.n2() != 2) {
            ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(context).extra("paygameid", str)).extra("fromSdk", true)).extra("appkey", str2)).a();
        } else {
            IntentUtil.getInstance().goMyAccountLoginActivity(context);
        }
    }

    public static String f(long j4) {
        String sb;
        DecimalFormat decimalFormat = new DecimalFormat("#");
        if (j4 < 1024) {
            sb = decimalFormat.format(j4) + "B";
        } else if (j4 < 1048576) {
            StringBuilder sb2 = new StringBuilder();
            double d5 = j4;
            Double.isNaN(d5);
            sb2.append(decimalFormat.format(d5 / 1024.0d));
            sb2.append("KB");
            sb = sb2.toString();
        } else if (j4 < 1073741824) {
            StringBuilder sb3 = new StringBuilder();
            double d6 = j4;
            Double.isNaN(d6);
            sb3.append(decimalFormat.format(d6 / 1048576.0d));
            sb3.append("M");
            sb = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            double d7 = j4;
            Double.isNaN(d7);
            sb4.append(decimalFormat.format(d7 / 1.073741824E9d));
            sb4.append("G");
            sb = sb4.toString();
        }
        return (sb.equals(".0B") || sb.equals(".00B")) ? "0B" : sb;
    }

    public static EMUApkTable f0(String str) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(bm.f63454o, str);
            List<EMUApkTable> h4 = b2.p.o().h(hashMap);
            if (h4 == null || h4.size() <= 0) {
                return null;
            }
            Iterator<EMUApkTable> it2 = h4.iterator();
            if (it2.hasNext()) {
                return it2.next();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static void f1(Context context, String str, String str2, int i4, int i5, String str3, String str4, String str5, StatFactory.VolcanoOther volcanoOther, boolean z4, boolean z5, int i6, String str6, int i7) {
        g1(context, str, str2, i4, i5, str3, str4, str5, volcanoOther, z4, z5, 7, str6, i7, null, null);
    }

    public static boolean f2(CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null && collectionBeanSub.getTag_info() != null) {
            Iterator<TipBean> it2 = collectionBeanSub.getTag_info().iterator();
            while (it2.hasNext()) {
                if (TextUtils.equals("242", it2.next().getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void f3(TextView textView, View view, CollectionBeanSub collectionBeanSub) {
        int down_status = collectionBeanSub.getDown_status();
        PayTagInfo pay_tag_info = collectionBeanSub.getPay_tag_info();
        String game_id = collectionBeanSub.getGame_id();
        collectionBeanSub.getDownload_source_switch_v2();
        view.setEnabled(true);
        boolean z4 = w0(pay_tag_info, game_id) > 0;
        if (down_status == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
        } else if (down_status == 2 && !z4) {
            textView.setText("即将开放");
            view.setEnabled(false);
        } else if (down_status == 6 && !z4) {
            textView.setText("预约");
        } else {
            if (pay_tag_info == null || pay_tag_info.getAmount_check() <= 0) {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
            } else {
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, pay_tag_info.getPayGameAmount()));
            }
            textView.setTextSize(2, 13.0f);
        }
    }

    private static void f4(String str, Context context) {
        new c(str, context).start();
    }

    public static String g(long j4) {
        String sb;
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        if (j4 < 1024) {
            sb = j4 + "B";
        } else if (j4 < 1048576) {
            sb = (j4 / 1024) + "KB";
        } else if (j4 < 1073741824) {
            sb = (j4 / 1048576) + "M";
        } else {
            StringBuilder sb2 = new StringBuilder();
            double d5 = j4;
            Double.isNaN(d5);
            sb2.append(decimalFormat.format(d5 / 1.073741824E9d));
            sb2.append("GB");
            sb = sb2.toString();
        }
        return (sb.equals(".0B") || sb.equals(".00B")) ? "0B" : sb;
    }

    public static boolean g0(DomainInfoBean domainInfoBean, int i4) {
        if (domainInfoBean == null) {
            return false;
        }
        PdAdCfgBean convertStr2Bean = PdAdCfgBean.convertStr2Bean(MApplication.f1497x.l().pd_ad_config().d());
        if (convertStr2Bean != null && convertStr2Bean.canShowDownload()) {
            if (convertStr2Bean != null) {
                convertStr2Bean.updateDownloadShowTimes();
            }
            domainInfoBean.setLocation(i4);
            com.join.mgps.Util.b0.f0(MApplication.f1497x).a0(MApplication.f1497x, domainInfoBean);
            return true;
        }
        return false;
    }

    public static void g1(Context context, String str, String str2, int i4, int i5, String str3, String str4, String str5, StatFactory.VolcanoOther volcanoOther, boolean z4, boolean z5, int i6, String str6, int i7, String str7, String str8) {
        try {
            String d5 = new PrefDef_(context).androidIdNullsKey().d();
            if (g2.i(d5)) {
                List list = (List) JsonMapper.getInstance().fromJson(d5, List.class);
                if (g2.i(MApplication.H) && list.contains(MApplication.H) && z4) {
                    if (IntentUtil.getInstance().goLogin(context)) {
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
        String json = volcanoOther != null ? JsonMapper.getInstance().toJson(volcanoOther) : "";
        boolean booleanValue = new PrefDef_(context).download_game_switch().d().booleanValue();
        if (z4 && booleanValue) {
            z0(context, 2, str, str2, new m(context, str, i4, i5, str3, str4, str5, json, z5, str6, i7, i6, str7, str8));
        } else {
            ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(context).extra("gameDownloadDetail", str)).extra("_from", i4)).extra("_from_type", i5)).extra("recPosition", str3)).extra("remarks", str4)).extra("nodeId", str5)).extra("volcanoOther", json)).extra("fromRecomDown", z5)).extra("downType", i7)).extra("location", i6)).extra("ext", str7)).extra("where", str8)).a();
        }
    }

    public static boolean g2(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean != null && commonGameInfoBean.getG_info() != null && commonGameInfoBean.getG_info().getTag_info() != null) {
            for (TipBean tipBean : commonGameInfoBean.getG_info().getTag_info()) {
                if (TextUtils.equals("242", tipBean.getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void g3(TextView textView, View view, GInfoBean gInfoBean) {
        int intValue = gInfoBean.getDown_state().intValue();
        PayTagInfo pay_tag_info = gInfoBean.getPay_tag_info();
        String id = gInfoBean.getId();
        view.setEnabled(true);
        boolean z4 = w0(pay_tag_info, id) > 0;
        if (intValue == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
        } else if (intValue == 2 && !z4) {
            textView.setText("即将开放");
        } else if (intValue == 6 && !z4) {
            if (gInfoBean.getGame_book() == 1) {
                textView.setText("已预约");
            } else {
                textView.setText("预约");
            }
        } else if (pay_tag_info == null || pay_tag_info.getAmount_check() <= 0) {
            textView.setText(textView.getResources().getString(R.string.download_status_download));
        } else {
            textView.setText(textView.getResources().getString(R.string.pay_game_amount, pay_tag_info.getPayGameAmount()));
        }
    }

    public static void g4(Context context, WxProgram wxProgram) {
        try {
            if (wxProgram != null) {
                if (com.join.android.app.common.utils.e.l0(context).d(context, "com.tencent.mm")) {
                    String str = new String(com.join.mgps.Util.k.a(wxProgram.getExtend()), "UTF-8");
                    String str2 = "";
                    if (g2.i(str)) {
                        if (wxProgram.getAbuid() == null) {
                            wxProgram.setAbuid("0");
                        }
                        str2 = com.join.mgps.Util.k.b(str.replace("[abuid]", wxProgram.getAbuid()).getBytes());
                    }
                    String app_id = wxProgram.getApp_id();
                    String original_id = wxProgram.getOriginal_id();
                    o4(context, app_id, original_id, wxProgram.getApp_path() + str2);
                    return;
                }
                com.join.mgps.Util.b0.f0(context).Z(context, wxProgram);
                return;
            }
            ToastManager.show("无法调起微信小程序");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static String h(long j4) {
        String sb;
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j4 < 1000) {
            sb = decimalFormat.format(j4) + "B";
        } else if (j4 < 1000000) {
            StringBuilder sb2 = new StringBuilder();
            double d5 = j4;
            Double.isNaN(d5);
            sb2.append(decimalFormat.format(d5 / 1000.0d));
            sb2.append("KB");
            sb = sb2.toString();
        } else if (j4 < com.squareup.wire.internal.k.f60238a) {
            StringBuilder sb3 = new StringBuilder();
            double d6 = j4;
            Double.isNaN(d6);
            sb3.append(decimalFormat.format(d6 / 1000000.0d));
            sb3.append("M");
            sb = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            double d7 = j4;
            Double.isNaN(d7);
            sb4.append(decimalFormat.format(d7 / 1.0E9d));
            sb4.append("GB");
            sb = sb4.toString();
        }
        return (sb.equals(".0B") || sb.equals(".00B")) ? "0B" : sb;
    }

    private static EMUApkTable h0(Context context, EMUApkTable eMUApkTable) {
        return i0(context, eMUApkTable, false);
    }

    public static void h1(Context context, String str, String str2, int i4, int i5, String str3, String str4, String str5, StatFactory.VolcanoOther volcanoOther, boolean z4, boolean z5, String str6, int i6) {
        f1(context, str, str2, i4, i5, str3, str4, str5, volcanoOther, z4, z5, 7, str6, i6);
    }

    public static boolean h2(Context context, String str) {
        int i4;
        int i5;
        DownloadSpeedupCfgBean downloadSpeedupCfgBean;
        if (context == null) {
            try {
                context = MApplication.j();
            } catch (Exception e5) {
                e5.printStackTrace();
                return false;
            }
        }
        PrefDef_ prefDef_ = new PrefDef_(context);
        int intValue = prefDef_.downloadSpeedUpCountAD().d().intValue();
        int intValue2 = prefDef_.downloadSpeedUpCountCurrentAD().d().intValue();
        long longValue = prefDef_.downloadSpeedUpLastTime().d().longValue();
        TextUtils.isEmpty(prefDef_.downloadSpeedUpGames().d());
        if (!com.join.mgps.Util.y.u(longValue)) {
            prefDef_.downloadSpeedUpCountCurrent().g(0);
            prefDef_.downloadSpeedUpCountCurrentAD().g(0);
            prefDef_.downloadSpeedUpGames().g("");
            intValue2 = 0;
        }
        if (intValue2 >= intValue) {
            return true;
        }
        DownloadTask F = p1.f.K().F(str);
        String d5 = prefDef_.downloadSpeedupCfg().d();
        if (!g2.i(d5) || (downloadSpeedupCfgBean = (DownloadSpeedupCfgBean) JsonMapper.getInstance().fromJson(d5, DownloadSpeedupCfgBean.class)) == null) {
            i4 = 0;
            i5 = 0;
        } else {
            i5 = downloadSpeedupCfgBean.getSwitch_state();
            i4 = downloadSpeedupCfgBean.getNet_status();
        }
        if (F != null && g2.i(F.getTips())) {
            if (F.getTips().contains("网游") && i5 == 1 && i4 == 1) {
                return true;
            }
        }
        return false;
    }

    public static void h3(TextView textView, View view, GInfoBean gInfoBean) {
        int intValue = gInfoBean.getDown_state().intValue();
        PayTagInfo pay_tag_info = gInfoBean.getPay_tag_info();
        String id = gInfoBean.getId();
        view.setEnabled(true);
        textView.setTextColor(-1);
        boolean z4 = w0(pay_tag_info, id) > 0;
        if (intValue == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-1);
            textView.setBackgroundResource(R.drawable.recom_white_butn);
        } else if (intValue == 2 && !z4) {
            textView.setText("即将开放");
            textView.setTextSize(0, textView.getContext().getResources().getDimensionPixelSize(R.dimen.wdp22));
            textView.setTextColor(-7763575);
            view.setEnabled(false);
            textView.setBackgroundResource(R.drawable.recom_grey_butn);
        } else if (intValue == 6 && !z4) {
            textView.setText("预约");
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-1);
            textView.setBackgroundResource(R.drawable.recom_white_butn);
        } else {
            if (pay_tag_info == null || pay_tag_info.getAmount_check() <= 0) {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
            } else {
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, pay_tag_info.getPayGameAmount()));
            }
            textView.setTextSize(2, 13.0f);
            textView.setTextColor(-1);
            textView.setBackgroundResource(R.drawable.recom_white_butn);
        }
    }

    public static void h4(Context context, String str, String str2) {
        i4(context, str, str2, "0");
    }

    public static void i(EMUApkTable eMUApkTable, DownloadTask downloadTask, Context context, int i4) {
        j(eMUApkTable, downloadTask, context, i4, "");
    }

    private static EMUApkTable i0(Context context, EMUApkTable eMUApkTable, boolean z4) {
        return j0(context, eMUApkTable, z4, false);
    }

    public static void i1(Context context, DownloadTask downloadTask) {
        boolean z4;
        String str;
        boolean z5;
        if (downloadTask != null) {
            String crc_link_type_val = downloadTask.getCrc_link_type_val();
            int i4 = downloadTask.get_from();
            int i5 = downloadTask.get_from_type();
            String str2 = downloadTask.getMod_info() != null ? "VIRTUAL_SINGLE" : "";
            if ("7".equals(downloadTask.getSp_tag_info().getModel().getId())) {
                str = str2;
                z4 = false;
            } else {
                z4 = true;
                str = "ANDROID_SINGLE";
            }
            if (z4) {
                z5 = z4;
            } else {
                boolean m22 = g2.h(downloadTask.getPlugin_num()) ? false : m2(Integer.parseInt(downloadTask.getPlugin_num()));
                if (m22) {
                    str = Z1(downloadTask.getPlugin_num()).getDown_type() == 2 ? "SO_SIMULATOR" : "RAW_SIMULATOR";
                }
                z5 = m22;
            }
            d1(context, crc_link_type_val, str, i4, i5, "", "", "", null, z5);
        }
    }

    public static boolean i2(String str) {
        try {
            if (g2.h(str)) {
                return false;
            }
            try {
                return m2(Integer.parseInt(str));
            } catch (Exception e5) {
                e5.printStackTrace();
                return m2(0);
            }
        } catch (Throwable unused) {
            return m2(0);
        }
    }

    public static void i3(TipNew tipNew, View view) {
        try {
            TextView textView = (TextView) view.findViewById(R.id.moneyText);
            if (textView == null) {
                return;
            }
            if (tipNew != null && tipNew.getCoin() != null) {
                textView.setText(tipNew.getCoin().getName());
                textView.setVisibility(0);
            } else {
                textView.setVisibility(4);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void i4(Context context, String str, String str2, String str3) {
        if (g2.i(str)) {
            try {
                WxProgram wxProgram = (WxProgram) JsonMapper.getInstance().fromJson(com.join.mgps.Util.a.b(str), WxProgram.class);
                if (wxProgram != null) {
                    wxProgram.setAbuid(str3);
                    wxProgram.setSceneType(str2);
                    g4(context, wxProgram);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
        if (r1.equals(com.join.mgps.enums.ConstantIntEnum.N3DS.value() + "") != false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(com.join.mgps.db.tables.EMUApkTable r10, com.github.snowdream.android.app.downloader.DownloadTask r11, android.content.Context r12, int r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.UtilsMy.j(com.join.mgps.db.tables.EMUApkTable, com.github.snowdream.android.app.downloader.DownloadTask, android.content.Context, int, java.lang.String):void");
    }

    private static EMUApkTable j0(Context context, EMUApkTable eMUApkTable, boolean z4, boolean z5) {
        APKUtils aPKUtils = new APKUtils();
        if (eMUApkTable == null) {
            return null;
        }
        if (eMUApkTable.getDown_type() == 2) {
            if (!com.join.android.app.common.utils.l.B(eMUApkTable, false, z4)) {
                com.papa.sim.statistic.p.f58882h = eMUApkTable.getVer() + "_" + eMUApkTable.getTag_id();
                return eMUApkTable;
            }
            if (!z5) {
                q1(eMUApkTable, context);
            } else {
                DownloadTask Z = p1.f.K().Z(Integer.parseInt(eMUApkTable.getTag_id()));
                if (Z != null && Z.getStatus() == 11 && Z.getDown_type() == 2) {
                    com.join.android.app.common.servcie.i.e().q(context, Z);
                } else {
                    q1(eMUApkTable, context);
                }
            }
            return null;
        } else if (aPKUtils.d(context, eMUApkTable.getPackage_name())) {
            if (B0(context, eMUApkTable)) {
                q1(eMUApkTable, context);
                return null;
            }
            com.papa.sim.statistic.p.f58882h = eMUApkTable.getVer() + "_" + eMUApkTable.getTag_id();
            return eMUApkTable;
        } else {
            q1(eMUApkTable, context);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j1(Context context, DownloadTask downloadTask, List<DownloadUrlBean> list, int i4, int i5, Context context2, DownloadGameArgsBean downloadGameArgsBean) {
        int i6;
        if (E3(downloadTask, context)) {
            return;
        }
        if (downloadTask.getMax_an_compatible_ver() > 0 && (((i6 = Build.VERSION.SDK_INT) < downloadTask.getMin_an_compatible_ver() || i6 > downloadTask.getMax_an_compatible_ver()) && g2.h(downloadTask.getMod_info()))) {
            AndroidPermissionParams androidPermissionParams = new AndroidPermissionParams("该游戏在安卓" + Build.VERSION.RELEASE + "版本中可能存在闪退、显示效果不佳、运行不流畅等现象");
            Intent intent = new Intent();
            intent.putExtra(AndroidPermissionDialogActivity.f28377i, androidPermissionParams);
            IntentUtil.getInstance().startActivityWithCallback(context, AndroidPermissionDialogActivity.class, intent, new i(context, downloadTask, downloadGameArgsBean, list, i4, i5));
        } else if (p1(context, downloadTask, downloadGameArgsBean)) {
        } else {
            if (downloadTask.getDown_status() == 5) {
                n1(context, downloadTask);
            } else {
                U0(context, downloadTask, list, i4, i5, downloadGameArgsBean);
            }
        }
    }

    public static boolean j2() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            return "harmony".equalsIgnoreCase(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]).toString());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void j3(TipNew tipNew, View view, DownloadTask downloadTask) {
        TextView textView;
        try {
            if (view instanceof TextView) {
                textView = (TextView) view;
            } else {
                textView = (TextView) view.findViewById(R.id.moneyText);
            }
            if (textView == null) {
                return;
            }
            if (downloadTask != null && downloadTask.getStatus() != 0) {
                textView.setVisibility(4);
            } else if (tipNew != null && tipNew.getCoin() != null) {
                textView.setText(tipNew.getCoin().getName());
                textView.setVisibility(0);
            } else {
                textView.setVisibility(4);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static boolean j4(Context context, String str, DownloadTask downloadTask, int i4, String str2, boolean z4) {
        String gameZipPath = downloadTask.getGameZipPath();
        String substring = gameZipPath.substring(0, gameZipPath.lastIndexOf(h0.f27805a));
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        EMUApkTable U = U(context, downloadTask, z4);
        if (U != null) {
            int i5 = 33;
            try {
                i5 = Integer.parseInt(downloadTask.getRomType());
            } catch (Exception unused) {
            }
            StartGameMeta startGameMeta = new StartGameMeta();
            startGameMeta.setPackageName(U.getPackage_name());
            startGameMeta.setActivityName(U.getLaunch_name());
            startGameMeta.setRomPath(substring);
            startGameMeta.setStartMode(i4);
            startGameMeta.setGameID(crc_link_type_val);
            startGameMeta.setUserID(str);
            startGameMeta.setNetState(str2);
            startGameMeta.setType(i5);
            startGameMeta.setPlugin_area_val(downloadTask.getPlugin_area_val());
            C4(context, downloadTask, startGameMeta);
            startGameMeta.setToken(AccountUtil_.getInstance_(context).getToken());
            startGameMeta.setRamCheck(downloadTask.getSync_memory());
            startGameMeta.setNetMode(1);
            startGameMeta.setSp(0);
            startGameMeta.setGametype(B2(downloadTask.getTipBeans()));
            B(context, startGameMeta, U);
            s2(context, startGameMeta);
            return true;
        }
        return false;
    }

    public static void k(DownloadTask downloadTask, Context context, int i4, String str, int i5, String str2, int i6) {
        l(downloadTask, context, i4, str, i5, str2, i6, "");
    }

    public static EMUApkTable k0(Context context, String str) {
        EMUApkTable n4 = b2.p.o().n(str);
        new APKUtils();
        if (n4 == null) {
            return null;
        }
        if (com.join.android.app.common.utils.l.t(context, n4, false, new String[0])) {
            if (B0(context, n4)) {
                return n4;
            }
            com.papa.sim.statistic.p.f58882h = n4.getVer() + "_" + n4.getTag_id();
            return null;
        }
        com.papa.sim.statistic.p.f58882h = n4.getVer() + "_" + n4.getTag_id();
        return n4;
    }

    public static boolean k1(Context context, DownloadTask downloadTask, DownloadGameArgsBean downloadGameArgsBean) {
        if (downloadTask == null || downloadTask.isUncheckSelfSupport() || downloadTask.getSp_tag_info() == null || !((p1.f.K().F(downloadTask.getCrc_link_type_val()) == null || TextUtils.isEmpty(downloadTask.getFileType()) || !downloadTask.getFileType().equals(Dtype.apk.name())) && downloadTask.getSp_tag_info().getSelf_support() == null)) {
            return false;
        }
        ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(context).extra("downGameIdNotSelfSupport", downloadTask.getCrc_link_type_val())).extra("downloadTask", downloadTask)).extra("_downloadArgs", downloadGameArgsBean)).a();
        return true;
    }

    public static boolean k2(List<TipBean> list) {
        if (list != null && list.size() > 0) {
            for (TipBean tipBean : list) {
                if (TextUtils.equals(tipBean.getId(), "7")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void k3(TipNew tipNew, TextView textView) {
        if (textView == null) {
            return;
        }
        if (tipNew != null && tipNew.getCoin() != null) {
            textView.setText(tipNew.getCoin().getName());
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(4);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void k4(com.github.snowdream.android.app.downloader.DownloadTask r5, android.content.Context r6, com.join.mgps.dto.UpdateIntentDataBean r7) {
        /*
            boolean r0 = com.join.android.app.common.utils.j.k(r6)
            if (r0 == 0) goto Lb
            t1(r6, r7)
            goto Lcd
        Lb:
            boolean r0 = com.join.android.app.common.utils.j.i(r6)
            if (r0 == 0) goto Lb7
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
            if (r2 != 0) goto L3d
            java.lang.String r1 = r5.getRomType()
            com.join.mgps.db.tables.EMUApkTable r1 = k0(r6, r1)
        L3d:
            r2 = 1120403456(0x42c80000, float:100.0)
            java.lang.String r3 = r5.getShowSize()     // Catch: java.lang.Exception -> L56
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.Exception -> L56
            if (r1 != 0) goto L4a
            goto L5c
        L4a:
            java.lang.String r4 = r1.getSize()     // Catch: java.lang.Exception -> L54
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.Exception -> L54
            float r3 = r3 + r4
            goto L5c
        L54:
            r4 = move-exception
            goto L59
        L56:
            r4 = move-exception
            r3 = 1120403456(0x42c80000, float:100.0)
        L59:
            r4.printStackTrace()
        L5c:
            if (r0 == 0) goto Lb1
            r4 = 1
            if (r0 == r4) goto L9c
            r4 = 2
            if (r0 == r4) goto L87
            r4 = 3
            if (r0 == r4) goto L74
            r5 = 4
            if (r0 == r5) goto L6b
            goto Lcd
        L6b:
            t1(r6, r7)
            if (r1 == 0) goto Lcd
            r1(r1, r6)
            goto Lcd
        L74:
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L81
            t1(r6, r7)
            if (r1 == 0) goto Lcd
            r1(r1, r6)
            goto Lcd
        L81:
            java.lang.String r0 = "更新资源大于100M，确认使用数据流量吗？"
            F3(r5, r0, r6, r1, r7)
            goto Lcd
        L87:
            r0 = 1112014848(0x42480000, float:50.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L96
            t1(r6, r7)
            if (r1 == 0) goto Lcd
            r1(r1, r6)
            goto Lcd
        L96:
            java.lang.String r0 = "更新资源大于50M，确认使用数据流量吗？"
            F3(r5, r0, r6, r1, r7)
            goto Lcd
        L9c:
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lab
            t1(r6, r7)
            if (r1 == 0) goto Lcd
            r1(r1, r6)
            goto Lcd
        Lab:
            java.lang.String r0 = "更新资源大于30M，确认使用数据流量吗？"
            F3(r5, r0, r6, r1, r7)
            goto Lcd
        Lb1:
            java.lang.String r0 = "游戏资源有更新，确认使用数据流量更新吗？"
            F3(r5, r0, r6, r1, r7)
            goto Lcd
        Lb7:
            boolean r5 = com.join.android.app.common.utils.j.j(r6)
            if (r5 != 0) goto Lca
            t1(r6, r7)
            com.join.mgps.Util.l2 r5 = com.join.mgps.Util.l2.a(r6)
            java.lang.String r6 = "无网络连接"
            r5.b(r6)
            goto Lcd
        Lca:
            t1(r6, r7)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.UtilsMy.k4(com.github.snowdream.android.app.downloader.DownloadTask, android.content.Context, com.join.mgps.dto.UpdateIntentDataBean):void");
    }

    public static void l(DownloadTask downloadTask, Context context, int i4, String str, int i5, String str2, int i6, String str3) {
        EMUApkTable n4 = b2.p.o().n(downloadTask.getPlugin_num());
        StartGameMeta startGameMeta = new StartGameMeta();
        C4(context, downloadTask, startGameMeta);
        startGameMeta.setToken(AccountUtil_.getInstance_(context).getToken());
        startGameMeta.setPackageName(n4.getPackage_name());
        startGameMeta.setActivityName(n4.getLaunch_name());
        startGameMeta.setRomPath(p4(downloadTask.getGameZipPath()));
        startGameMeta.setStartMode(9);
        startGameMeta.setServerIP(str);
        startGameMeta.setServerPort(i5 + "");
        startGameMeta.setFastIP(str2);
        startGameMeta.setGameID(downloadTask.getCrc_link_type_val());
        startGameMeta.setType(Integer.parseInt(n4.getTag_id()));
        startGameMeta.setRoomSilent(i4);
        startGameMeta.setNetPlayers(0);
        startGameMeta.setGamePlayers(i6);
        startGameMeta.setRamCheck(downloadTask.getSync_memory());
        startGameMeta.setPlugin_area_val(downloadTask.getPlugin_area_val());
        startGameMeta.setGametype(B2(downloadTask.getTipBeans()));
        startGameMeta.setCore(str3);
        B(context, startGameMeta, n4);
        s2(context, startGameMeta);
    }

    private static EMUApkTable l0(Context context, EMUApkTable eMUApkTable, boolean z4) {
        APKUtils aPKUtils = new APKUtils();
        if (eMUApkTable == null) {
            return null;
        }
        if (eMUApkTable.getDown_type() == 2) {
            if (com.join.android.app.common.utils.l.B(eMUApkTable, false, z4)) {
                q1(eMUApkTable, context);
                return null;
            }
            com.papa.sim.statistic.p.f58882h = eMUApkTable.getVer() + "_" + eMUApkTable.getTag_id();
            return eMUApkTable;
        } else if (aPKUtils.d(context, eMUApkTable.getPackage_name())) {
            if (B0(context, eMUApkTable)) {
                q1(eMUApkTable, context);
                return null;
            }
            com.papa.sim.statistic.p.f58882h = eMUApkTable.getVer() + "_" + eMUApkTable.getTag_id();
            return eMUApkTable;
        } else {
            q1(eMUApkTable, context);
            return null;
        }
    }

    public static void l1(Context context, DownloadTask downloadTask) {
        S0(context, downloadTask, downloadTask.getTp_down_url(), downloadTask.getOther_down_switch(), downloadTask.getCdn_down_switch(), null);
    }

    public static boolean l2(List<Integer> list) {
        if (list != null && list.size() > 0) {
            for (Integer num : list) {
                if (num.intValue() == 7) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String l3(double d5) {
        return new DecimalFormat("###.00").format(d5);
    }

    public static void l4(Context context, String str) {
        Intent intent = new Intent("com.tools.AdBroadcast");
        intent.putExtra("action", 6);
        intent.putExtra("gameId", str);
        context.sendBroadcast(intent);
    }

    public static void m(DownloadTask downloadTask, Context context, String str) {
        EMUApkTable n4 = b2.p.o().n(downloadTask.getPlugin_num());
        StartGameMeta startGameMeta = new StartGameMeta();
        C4(context, downloadTask, startGameMeta);
        startGameMeta.setToken(AccountUtil_.getInstance_(context).getToken());
        startGameMeta.setPackageName(n4.getPackage_name());
        startGameMeta.setActivityName(n4.getLaunch_name());
        startGameMeta.setRomPath(p4(downloadTask.getGameZipPath()));
        startGameMeta.setStartMode(0);
        startGameMeta.setNetState(str);
        startGameMeta.setServerIP(null);
        startGameMeta.setGameID(downloadTask.getCrc_link_type_val());
        startGameMeta.setType(Integer.parseInt(n4.getTag_id()));
        startGameMeta.setPlugin_area_val(downloadTask.getPlugin_area_val());
        startGameMeta.setGametype(B2(downloadTask.getTipBeans()));
        startGameMeta.setIntentFrom(1);
        B(context, startGameMeta, n4);
        s2(context, startGameMeta);
    }

    public static boolean m0(Context context) {
        boolean createNewFile;
        try {
            String g4 = com.join.mgps.pref.h.n(context).g();
            if (g2.i(g4)) {
                File file = new File(g4);
                if (!file.exists()) {
                    return file.mkdirs();
                }
                File file2 = new File(g4, "test_canwhite.txt");
                if (file2.exists()) {
                    createNewFile = file2.delete();
                } else {
                    createNewFile = file2.createNewFile();
                }
                return createNewFile;
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static void m1(Context context, DownloadTask downloadTask, DownloadGameArgsBean downloadGameArgsBean) {
        S0(context, downloadTask, downloadTask.getTp_down_url(), downloadTask.getOther_down_switch(), downloadTask.getCdn_down_switch(), downloadGameArgsBean);
    }

    public static boolean m2(int i4) {
        return ConstantIntEnum.FBA.value() == i4 || ConstantIntEnum.NDS.value() == i4 || ConstantIntEnum.PS2.value() == i4 || ConstantIntEnum.N3DS.value() == i4 || ConstantIntEnum.GBA.value() == i4 || ConstantIntEnum.PSP.value() == i4 || ConstantIntEnum.FC.value() == i4 || ConstantIntEnum.SFC.value() == i4 || ConstantIntEnum.MD.value() == i4 || ConstantIntEnum.PS.value() == i4 || ConstantIntEnum.WSC.value() == i4 || ConstantIntEnum.GBC.value() == i4 || ConstantIntEnum.N64.value() == i4 || ConstantIntEnum.ONS.value() == i4 || ConstantIntEnum.DC.value() == i4;
    }

    public static void m3(TextView textView, DetailResultBeanV3 detailResultBeanV3) {
        try {
            int down_status = detailResultBeanV3.getDown_status();
            detailResultBeanV3.getPay_tag_info();
            String crc_sign_id = detailResultBeanV3.getCrc_sign_id();
            detailResultBeanV3.getDownload_source_switch_v2();
            textView.setEnabled(true);
            int w02 = w0(detailResultBeanV3.getPay_tag_info(), detailResultBeanV3.getCrc_sign_id());
            boolean z4 = v0(w02, crc_sign_id) > 0;
            if (down_status == 3 && !z4) {
                textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
                textView.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
            } else if ((down_status == 2 || down_status == 6) && !z4) {
                textView.setText("即将开放");
                textView.setEnabled(false);
                textView.setBackgroundResource(R.drawable.detial_simple_grey_selecter);
            } else if (down_status == 6 && !z4) {
                textView.setText("预约");
                textView.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
            } else {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
                if (w02 > 0) {
                    textView.setText(textView.getResources().getString(R.string.pay_game_amount, g2.m(w02)));
                } else {
                    textView.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void m4(Context context, DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        if ((downloadTask.getModInfoBean() != null && downloadTask.getModInfoBean().isIncompatible()) || ((downloadTask.getSingleGameModInfoBean() != null && downloadTask.getSingleGameModInfoBean().isIncompatible()) || (downloadTask.getModInfoBean() == null && downloadTask.getSingleGameModInfoBean() == null))) {
            ModPromptNormalDialog modPromptNormalDialog = new ModPromptNormalDialog(context);
            Resources resources = context.getResources();
            String string = resources.getString(R.string.mod_prompt_tips);
            modPromptNormalDialog.show(string, resources.getString(R.string.mod_prompt_game_incompatible, "" + downloadTask.getShowName(), "" + Build.VERSION.RELEASE), resources.getString(R.string.game_start_continue), resources.getString(R.string.game_start_standard), new c0(downloadTask, context, modPromptNormalDialog));
            return;
        }
        n4(context, downloadTask);
    }

    public static void n0(Context context, DownloadTask downloadTask) {
        EMUApkTable T;
        if (downloadTask.getFileType() == null || !downloadTask.getFileType().equals(Dtype.android.name())) {
            if (downloadTask.getGameZipPath() != null && !new File(downloadTask.getGameZipPath()).exists()) {
                com.php25.PDownload.d.a(downloadTask);
                com.php25.PDownload.d.c(downloadTask, context);
                return;
            }
            String crc_link_type_val = downloadTask.getCrc_link_type_val();
            String gameZipPath = downloadTask.getGameZipPath();
            try {
                if (Integer.parseInt(downloadTask.getRomType()) == -1 || (T = T(context, downloadTask)) == null || gameZipPath == null || V1(context, crc_link_type_val, downloadTask, T, false)) {
                    return;
                }
                v0.h(PapayPayDetialActivity_.f36841l, System.currentTimeMillis() + "  checkfinish");
                S3(context, downloadTask);
            } catch (Exception unused) {
            }
        }
    }

    public static void n1(Context context, DownloadTask downloadTask) {
        ((ChociceDownActivity_.j) ChociceDownActivity_.q0(context).a(downloadTask).flags(268435456)).start();
    }

    public static boolean n2(DownloadTask downloadTask, DownloadTask downloadTask2) {
        if (downloadTask == null || downloadTask2 == null) {
            return false;
        }
        return downloadTask.getCrc_link_type_val().equals(downloadTask2.getCrc_link_type_val()) || downloadTask.getRef_crc_sign_id().equals(downloadTask2.getCrc_link_type_val());
    }

    public static void n3(TextView textView, GamedetialModleFourBean gamedetialModleFourBean) {
        try {
            int down_status = gamedetialModleFourBean.getDown_status();
            gamedetialModleFourBean.getPay_tag_info();
            String game_id = gamedetialModleFourBean.getGame_id();
            gamedetialModleFourBean.getDownload_source_switch_v2();
            textView.setEnabled(true);
            int w02 = w0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id());
            boolean z4 = v0(w02, game_id) > 0;
            if (down_status == 3 && !z4) {
                textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
                textView.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
            } else if (down_status == 2 && !z4) {
                textView.setText("即将开放");
                textView.setEnabled(false);
                textView.setBackgroundResource(R.drawable.detial_simple_grey_selecter);
            } else if (down_status == 6 && gamedetialModleFourBean.getGame_book() == 0 && !z4) {
                textView.setText("预约");
                textView.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
            } else if (down_status == 6 && gamedetialModleFourBean.getGame_book() == 1 && !z4) {
                textView.setText("已预约");
                textView.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
            } else {
                textView.setText(textView.getResources().getString(R.string.download_status_download));
                if (w02 > 0) {
                    textView.setText(textView.getResources().getString(R.string.pay_game_amount, g2.m(w02)));
                } else {
                    textView.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void n4(Context context, DownloadTask downloadTask) {
        if (com.join.mgps.va.overmind.d.o().N(downloadTask.getPackageName())) {
            Activity activity = MApplication.f1497x.getActivity();
            if (APKUtils.b(activity, downloadTask)) {
                return;
            }
            APKUtils.g(activity, new d0(context, downloadTask));
        }
        y2(context, downloadTask);
    }

    public static boolean o0(List<TipBean> list) {
        if (list != null) {
            for (TipBean tipBean : list) {
                if (tipBean.getId().equals("46")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o1(Context context, DownloadTask downloadTask) {
        return false;
    }

    public static boolean o2(List<TipBean> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        for (TipBean tipBean : list) {
            if ("23".equals(tipBean.getId())) {
                return true;
            }
        }
        return false;
    }

    public static void o3(TextView textView, GamedetialModleFourBean gamedetialModleFourBean) {
        textView.setEnabled(true);
        int down_status = gamedetialModleFourBean.getDown_status();
        gamedetialModleFourBean.getPay_tag_info();
        String crc_sign_id = gamedetialModleFourBean.getCrc_sign_id();
        gamedetialModleFourBean.getDownload_source_switch_v2();
        int w02 = w0(gamedetialModleFourBean.getPay_tag_info(), gamedetialModleFourBean.getCrc_sign_id());
        boolean z4 = v0(w02, crc_sign_id) > 0;
        if (down_status == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
        } else if (down_status == 2 && !z4) {
            textView.setText("即将开放");
            textView.setEnabled(false);
            textView.setBackgroundResource(R.drawable.detial_simple_grey_selecter);
        } else if (down_status == 6 && !z4) {
            textView.setText("预约");
            textView.setBackgroundResource(R.drawable.detial_video_install_selecter);
        } else {
            textView.setText("立即获取");
            if (w02 > 0) {
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, g2.m(w02)));
            } else {
                textView.setBackgroundResource(R.drawable.detial_video_install_selecter);
            }
        }
    }

    public static void o4(Context context, String str, String str2, String str3) {
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context, str);
        createWXAPI.registerApp(str);
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = str2;
        req.path = str3;
        req.miniprogramType = 0;
        createWXAPI.sendReq(req);
    }

    public static boolean p0(List<GameTagInfoV2_2Bean> list) {
        if (list != null) {
            for (GameTagInfoV2_2Bean gameTagInfoV2_2Bean : list) {
                if (gameTagInfoV2_2Bean.getId().equals("46")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean p1(Context context, DownloadTask downloadTask, DownloadGameArgsBean downloadGameArgsBean) {
        if (Build.VERSION.SDK_INT > 28 && !m0(context)) {
            if (downloadTask != null) {
                downloadTask.setFromRecomDown(true);
            }
            ((WufunGameDownFirstNotPermissDialog_.IntentBuilder_) WufunGameDownFirstNotPermissDialog_.intent(context).flags(268435456)).start();
        }
        if (downloadTask == null || TextUtils.isEmpty(downloadTask.getDownload_source_switch_v2()) || !"1".equals(downloadTask.getDownload_source_switch_v2()) || (TextUtils.isEmpty(downloadTask.getDownload_source_url()) && TextUtils.isEmpty(downloadTask.getDownload_outside_url()))) {
            return (downloadTask == null || downloadTask.getDown_status() == 5 || !k1(context, downloadTask, downloadGameArgsBean)) ? false : true;
        }
        ((HavenDownActivity_.i) HavenDownActivity_.p0(context).a(downloadTask).flags(268435456)).start();
        return true;
    }

    public static boolean p2(Context context, DownloadTask downloadTask, boolean z4) {
        List<Filepath> a5 = s1.a(context);
        if (a5 == null || a5.size() == 0) {
            if (z4) {
                l2.a(context).b("存储空间不足，请清理空间后再下载");
            }
            return false;
        }
        String g4 = com.join.mgps.pref.h.n(context).g();
        String path = downloadTask.getPath();
        StringBuilder sb = new StringBuilder();
        sb.append("filePath=");
        sb.append(a5);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("downPath=");
        sb2.append(g4);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("path=");
        sb3.append(path);
        if (!g2.h(path)) {
            for (Filepath filepath : a5) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("filepath.getPathRoot()=");
                sb4.append(filepath.getPathRoot());
                if (path.contains(filepath.getPathRoot())) {
                    try {
                        long available = filepath.getAvailable();
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("zip...available size is ");
                        sb5.append(available);
                        sb5.append(";least size is ");
                        sb5.append(com.join.mgps.Util.v.f28102b);
                        if (available <= com.join.mgps.Util.v.f28102b) {
                            if (z4) {
                                l2.a(context).b("存储空间不足，请清理空间后再下载");
                            }
                            return false;
                        }
                        continue;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }
            return true;
        }
        for (Filepath filepath2 : a5) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("filepath.getPathHome()=");
            sb6.append(filepath2.getPathHome());
            if (g4.equals(filepath2.getPathHome())) {
                try {
                    long available2 = filepath2.getAvailable();
                    long size = downloadTask.getSize() * 2;
                    try {
                        size = Long.parseLong(downloadTask.getUnzip_size());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("downloading...available size is ");
                    sb7.append(available2);
                    sb7.append(";least size is ");
                    sb7.append(com.join.mgps.Util.v.f28102b);
                    if (available2 <= com.join.mgps.Util.v.f28102b) {
                        if (z4) {
                            l2.a(context).b("存储空间不足，请清理空间后再下载");
                        }
                        return false;
                    } else if (available2 < size) {
                        l2.a(context).b("存储空间不足，请清理空间后再下载");
                        return false;
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
            }
        }
        return true;
    }

    public static void p3(Button button, GameDiscoverBean gameDiscoverBean) {
        int down_status = gameDiscoverBean.getDown_status();
        PayTagInfo pay_tag_info = gameDiscoverBean.getPay_tag_info();
        String crc_sign_id = gameDiscoverBean.getCrc_sign_id();
        int w02 = w0(pay_tag_info, crc_sign_id);
        button.setEnabled(true);
        boolean z4 = v0(w02, crc_sign_id) > 0;
        if (down_status == 3 && !z4) {
            button.setText(button.getResources().getString(R.string.download_status_pre_download));
            button.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
        } else if (down_status == 2 && !z4) {
            button.setText("即将开放");
            button.setEnabled(false);
            button.setBackgroundResource(R.drawable.detial_simple_grey_selecter);
        } else if (down_status == 6 && !z4) {
            button.setText("预约");
            button.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
        } else {
            button.setText(button.getResources().getString(R.string.download_status_download));
            if (w02 > 0) {
                button.setText(button.getResources().getString(R.string.pay_game_amount, g2.m(w02)));
            } else {
                button.setBackgroundResource(R.drawable.detial_simple_normal_selecter);
            }
        }
    }

    public static String p4(String str) {
        if (str.contains(h0.f27805a)) {
            return !str.contains("/58/") ? str.substring(0, str.lastIndexOf(h0.f27805a)) : str;
        }
        return str;
    }

    public static boolean q0(List<TipBean> list) {
        try {
            for (TipBean tipBean : list) {
                if (tipBean.getId().equals("41")) {
                    return true;
                }
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void q1(com.join.mgps.db.tables.EMUApkTable r17, android.content.Context r18) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.UtilsMy.q1(com.join.mgps.db.tables.EMUApkTable, android.content.Context):void");
    }

    public static boolean q2(List<TipBean> list) {
        for (TipBean tipBean : list) {
            if (tipBean.getId() != null && tipBean.getId().equals("44")) {
                return true;
            }
        }
        return false;
    }

    public static void q3(TextView textView, LinearLayout linearLayout, CollectionBeanSub collectionBeanSub) {
        int down_status = collectionBeanSub.getDown_status();
        PayTagInfo pay_tag_info = collectionBeanSub.getPay_tag_info();
        String game_id = collectionBeanSub.getGame_id();
        collectionBeanSub.getDownload_source_switch_v2();
        linearLayout.setEnabled(true);
        boolean z4 = w0(pay_tag_info, game_id) > 0;
        if (down_status == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
        } else if (down_status == 2 && !z4) {
            textView.setText("即将开放");
            linearLayout.setEnabled(false);
        } else if (down_status == 6 && !z4) {
            textView.setText("预约");
        } else if (pay_tag_info == null || pay_tag_info.getAmount_check() <= 0) {
            textView.setText(textView.getResources().getString(R.string.download_status_download));
        } else {
            textView.setText(textView.getResources().getString(R.string.pay_game_amount, pay_tag_info.getPayGameAmount()));
        }
    }

    public static void q4(Context context) {
        APKUtils.a l4;
        try {
            if (Build.BRAND.toLowerCase().contains("meizu")) {
                for (DownloadTask downloadTask : p1.f.K().w()) {
                    if (com.join.android.app.common.utils.e.l0(context).d(context, downloadTask.getPackageName()) && (l4 = com.join.android.app.common.utils.e.l0(context).l(context, downloadTask.getPackageName())) != null && g2.i(downloadTask.getVer()) && l4.d() == Integer.parseInt(downloadTask.getVer())) {
                        S2(downloadTask, 5);
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static boolean r0(Context context, DownloadTask downloadTask) {
        if (downloadTask == null) {
            return false;
        }
        if (!TextUtils.isEmpty(downloadTask.getPlugin_num()) && m2(Integer.parseInt(downloadTask.getPlugin_num()))) {
            if ("1".equals(MApplication.R.getDown_load_cfg_simulator_speed_limit().getCfg_switch_express())) {
                return false;
            }
        } else {
            boolean z4 = false;
            for (TipBean tipBean : downloadTask.getTipBeans()) {
                if ("23".equals(tipBean.getId())) {
                    z4 = true;
                }
            }
            if (z4) {
                if ("1".equals(MApplication.R.getDown_load_cfg_stand_alone_speed_limit().getCfg_switch_express())) {
                    return false;
                }
            } else if ("1".equals(MApplication.R.getDown_load_cfg_net_game_speed_limit().getCfg_switch_express())) {
                return false;
            }
        }
        return true;
    }

    public static void r1(EMUApkTable eMUApkTable, Context context) {
        int parseInt = Integer.parseInt(eMUApkTable.getTag_id());
        DownloadTask Z = p1.f.K().Z(parseInt);
        if (Z != null) {
            if (Z.getStatus() == 5 && Z.getStatus() != 9 && Z.getStatus() != 42) {
                String[] split = eMUApkTable.getVer().split("_");
                if (Z.getDown_type() == eMUApkTable.getDown_type() && !D0(split[0], split[1], Z.getVer(), Z.getVer_name()) && !TextUtils.isEmpty(Z.getGameZipPath())) {
                    File file = new File(Z.getGameZipPath());
                    if (file.exists()) {
                        if (Z.getDown_type() == 2) {
                            if (com.join.android.app.common.utils.l.I(context, Z, null) && !com.join.android.app.common.utils.l.j(eMUApkTable)) {
                                S2(Z, 5);
                                return;
                            } else {
                                com.php25.PDownload.d.a(Z);
                                return;
                            }
                        }
                        com.join.android.app.common.utils.e.l0(context).w(context, file);
                        return;
                    }
                }
            } else if ((Z.getStatus() != 2 || Z.getStatus() != 10) && Z.getStatus() != 9 && Z.getStatus() != 42) {
                com.php25.PDownload.d.c(Z, context);
                if (context instanceof EndGameLaunchActivity_) {
                    return;
                }
                l2.a(context).b("悟饭插件正在下载...");
                return;
            }
        }
        if ("35".equals(eMUApkTable.getTag_id())) {
            try {
                APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, eMUApkTable.getPackage_name());
                if (com.papa.sim.statistic.pref.b.k(context).o() < 13 && l4.d() < 150) {
                    com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(context, R.style.MyDialog);
                    oVar.setContentView(R.layout.fc_notice_dialog);
                    ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setOnClickListener(new x(oVar));
                    ((Button) oVar.findViewById(R.id.dialog_button_ok)).setOnClickListener(new y(Z, eMUApkTable, parseInt, context, oVar));
                    oVar.show();
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        DownloadTask downloadTask = new DownloadTask();
        if (Z != null) {
            downloadTask.setId(Z.getId());
        }
        downloadTask.setStatus(0);
        downloadTask.setPackageName(eMUApkTable.getPackage_name());
        downloadTask.setPortraitURL(eMUApkTable.getLogo());
        downloadTask.setShowName(eMUApkTable.getApk_name());
        downloadTask.setUrl(eMUApkTable.getDown_url());
        downloadTask.setTipBeans(null);
        downloadTask.setCrc_link_type_val(parseInt + "");
        try {
            String[] split2 = eMUApkTable.getVer().split("_");
            downloadTask.setVer(split2[0]);
            downloadTask.setVer_name(split2[1]);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        downloadTask.setRomType(parseInt + "");
        downloadTask.setPlugin_num(parseInt + "");
        downloadTask.setFileType(Dtype.chajian.name());
        downloadTask.setShowSize(eMUApkTable.getSize());
        downloadTask.setDescribe(eMUApkTable.getVer_info());
        downloadTask.setDown_type(eMUApkTable.getDown_type());
        downloadTask.setProgress(0L);
        if (Z != null) {
            L0(Z);
        }
        if (eMUApkTable.getDown_type() == 2 && com.join.android.app.common.utils.l.i(eMUApkTable)) {
            com.join.android.app.common.utils.l.e(eMUApkTable, downloadTask);
        }
        com.php25.PDownload.d.f(downloadTask, context);
    }

    public static boolean r2(Context context) {
        long I = com.join.mgps.pref.h.n(context).I();
        DownloadCfg down_load_unrestricted_speed = MApplication.R.getDown_load_unrestricted_speed();
        if (I == 0) {
            return true;
        }
        return down_load_unrestricted_speed != null && g2.i(down_load_unrestricted_speed.getCfg_values_express()) && System.currentTimeMillis() - I < ((long) (Integer.parseInt(down_load_unrestricted_speed.getCfg_values_express()) * 86400000));
    }

    public static void r3(Button button, int i4, PayTagInfo payTagInfo, String str) {
        button.setEnabled(true);
        boolean z4 = w0(payTagInfo, str) > 0;
        if (i4 == 3 && !z4) {
            button.setText(button.getResources().getString(R.string.download_status_pre_download));
        } else if (i4 == 2 && !z4) {
            button.setText("即将开放");
            button.setEnabled(false);
            button.setTextColor(-7763575);
            button.setBackgroundResource(R.drawable.recom_grey_butn);
        } else if (payTagInfo == null || payTagInfo.getAmount_check() <= 0) {
            button.setText(button.getResources().getString(R.string.download_status_download));
        } else {
            button.setText(button.getResources().getString(R.string.pay_game_amount, payTagInfo.getPayGameAmount()));
        }
    }

    public static void r4(Context context, DownloadTask downloadTask) {
        com.join.mgps.Util.b0.f0(context).d0(context, downloadTask);
    }

    public static boolean s0(Context context, DownloadTask downloadTask) {
        if (downloadTask == null) {
            return false;
        }
        if (downloadTask.getPlugin_num() != null && m2(Integer.parseInt(downloadTask.getPlugin_num()))) {
            if ("1".equals(MApplication.R.getDown_load_cfg_simulator_speed_limit().getCfg_switch_express())) {
                return false;
            }
        } else {
            boolean z4 = false;
            for (TipBean tipBean : downloadTask.getTipBeans()) {
                if ("23".equals(tipBean.getId())) {
                    z4 = true;
                }
            }
            if (z4) {
                if ("1".equals(MApplication.R.getDown_load_cfg_stand_alone_speed_limit().getCfg_switch_express())) {
                    return false;
                }
            } else if ("1".equals(MApplication.R.getDown_load_cfg_net_game_speed_limit().getCfg_switch_express())) {
                return false;
            }
        }
        return true;
    }

    public static int s1(Context context, String str) {
        if (context == null) {
            try {
                context = MApplication.j();
            } catch (Exception e5) {
                e5.printStackTrace();
                return 0;
            }
        }
        PrefDef_ prefDef_ = new PrefDef_(context);
        return Math.max(0, prefDef_.downloadSpeedUpCountAD().d().intValue() - prefDef_.downloadSpeedUpCountCurrentAD().d().intValue());
    }

    private static void s2(Context context, StartGameMeta startGameMeta) {
        t2(context, startGameMeta, 0);
    }

    public static void s3(Context context, String str, SimpleDraweeView simpleDraweeView) {
        if (g2.h(str.trim()) || simpleDraweeView == null) {
            str = com.join.mgps.rpc.h.L + "/upload/images/headportrait/public/system_1.png";
        }
        MyImageLoader.u(simpleDraweeView, R.drawable.unloginstatus, str);
    }

    public static void s4(Context context, CommonGameInfoBean commonGameInfoBean) {
        com.join.mgps.Util.b0.f0(context).K(context, commonGameInfoBean);
    }

    public static EMUApkTable t0(String str) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("tag_id", str);
            List<EMUApkTable> h4 = b2.p.o().h(hashMap);
            if (h4 == null || h4.size() <= 0) {
                return null;
            }
            Iterator<EMUApkTable> it2 = h4.iterator();
            if (it2.hasNext()) {
                return it2.next();
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static void t1(Context context, UpdateIntentDataBean updateIntentDataBean) {
        DownloadTask downloadTask = updateIntentDataBean.getDownloadTask();
        if (!o1(context, downloadTask) && downloadTask.getDown_status() == 5) {
            ((ChociceDownActivity_.j) ChociceDownActivity_.q0(context).a(downloadTask).b(11).c(updateIntentDataBean).flags(268435456)).start();
        } else {
            UpdateLodingActivity_.o0(context).a(updateIntentDataBean).start();
        }
    }

    private static void t2(Context context, StartGameMeta startGameMeta, int i4) {
        if (i4 == 1) {
            a2.g(context).b(context, startGameMeta);
        } else {
            a2.g(context).a(context, startGameMeta);
        }
        T1(context, 8, startGameMeta.getGameID());
    }

    public static void t3(Button button, DetailResultBean detailResultBean) {
        button.setEnabled(true);
        int down_status = detailResultBean.getDown_status();
        PayTagInfo pay_tag_info = detailResultBean.getPay_tag_info();
        String crc_sign_id = detailResultBean.getCrc_sign_id();
        int w02 = w0(pay_tag_info, crc_sign_id);
        boolean z4 = v0(w02, crc_sign_id) > 0;
        if (down_status == 3 && !z4) {
            button.setText(button.getResources().getString(R.string.download_status_pre_download));
            button.setBackgroundResource(R.drawable.fight_blue_butn);
            button.setTextSize(2, 12.0f);
        } else if (down_status == 2 && !z4) {
            button.setText("即将开放");
            button.setTextSize(2, 11.0f);
            button.setEnabled(false);
            button.setBackgroundResource(R.drawable.fight_grey_butn);
        } else if (down_status == 6 && !z4) {
            button.setText("预约");
            button.setBackgroundResource(R.drawable.fight_blue_butn);
        } else {
            button.setText(button.getResources().getString(R.string.download_status_download));
            button.setTextSize(2, 13.0f);
            if (w02 > 0) {
                button.setText(button.getResources().getString(R.string.pay_game_amount, g2.m(w02)));
            } else {
                button.setBackgroundResource(R.drawable.fight_blue_butn);
            }
        }
    }

    public static void t4(Context context, String str) {
        new d(str, context).start();
    }

    public static boolean u0(List<TipBean> list) {
        if (list != null) {
            for (TipBean tipBean : list) {
                if (tipBean.getId().equals("7")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Bitmap u1(Drawable drawable, int i4, int i5) {
        Bitmap createBitmap = Bitmap.createBitmap(i4, i5, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, i4, i5);
        drawable.draw(canvas);
        return createBitmap;
    }

    public static void u2(Context context, String str) {
        try {
            v2(context, str);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void u3(Context context, String str, SimpleDraweeView simpleDraweeView) {
        if (simpleDraweeView == null) {
            return;
        }
        Context context2 = simpleDraweeView.getContext();
        if (str == null) {
            MyImageLoader.d(simpleDraweeView, R.drawable.net_match_default_user_icon, MyImageLoader.F(context2, R.drawable.net_match_default_user_icon).toString());
        } else {
            MyImageLoader.u(simpleDraweeView, R.drawable.net_match_default_user_icon, str);
        }
    }

    public static void u4(DownloadTask downloadTask) {
        String str;
        if (downloadTask.getCrc_link_type_val() == null || downloadTask.getCrc_link_type_val().equals("")) {
            return;
        }
        DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
        try {
            str = JsonMapper.getInstance().toJson(F);
        } catch (Exception e5) {
            e5.printStackTrace();
            str = "";
        }
        DownlodTaskCopyTable n4 = b2.n.o().n(F.getCrc_link_type_val());
        DownlodTaskCopyTable downlodTaskCopyTable = new DownlodTaskCopyTable();
        if (n4 != null) {
            downlodTaskCopyTable.setId(n4.getId());
        }
        downlodTaskCopyTable.setGameId(F.getCrc_link_type_val());
        downlodTaskCopyTable.setDownloadTask(str);
        b2.n.o().m(downlodTaskCopyTable);
        F.setUrl(F.getCfg_down_url());
        F.setDownloadType(2);
        F.setFileType(Dtype.apk.name());
        p1.f.K().m(F);
        String path = F.getPath();
        if (path != null && !path.equals("")) {
            File file = new File(path);
            if (file.exists()) {
                delete(file);
            }
        }
        com.php25.PDownload.d.c(F, null);
    }

    public static int v0(int i4, String str) {
        if (i4 <= 0 || b2.e0.o().p(str)) {
            return 0;
        }
        return i4;
    }

    public static void v1(DownloadTask downloadTask, FightMainTable fightMainTable) {
        if (downloadTask == null || fightMainTable == null) {
            return;
        }
        downloadTask.setDownload_source_url(fightMainTable.getDownload_source_url());
        downloadTask.setDownload_outside_url(fightMainTable.getDownload_outside_url());
        downloadTask.setDownload_original_switch(fightMainTable.getDownload_original_switch());
        downloadTask.setDownload_source_switch_v1(fightMainTable.getDownload_source_switch_v1());
        downloadTask.setDownload_source_switch_v2(fightMainTable.getDownload_source_switch_v2());
    }

    public static void v2(Context context, String str) {
        PrefDef_ prefDef_;
        int intValue;
        int intValue2;
        String str2;
        try {
            prefDef_ = new PrefDef_(context);
            prefDef_.downloadSpeedUpCount().d().intValue();
            prefDef_.downloadSpeedUpCountCurrent().d().intValue();
            long longValue = prefDef_.downloadSpeedUpLastTime().d().longValue();
            intValue = prefDef_.downloadSpeedUpCountAD().d().intValue();
            intValue2 = prefDef_.downloadSpeedUpCountCurrentAD().d().intValue();
            String d5 = prefDef_.downloadSpeedUpGames().d();
            str2 = "";
            if (TextUtils.isEmpty(d5)) {
                d5 = "";
            }
            if (com.join.mgps.Util.y.u(longValue)) {
                str2 = d5;
            } else {
                prefDef_.downloadSpeedUpCountCurrentAD().g(0);
                prefDef_.downloadSpeedUpGames().g("");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (intValue2 >= intValue) {
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.m(str));
            return;
        }
        prefDef_.downloadSpeedUpCountCurrentAD().g(Integer.valueOf(intValue2 + 1));
        prefDef_.downloadSpeedUpLastTime().g(Long.valueOf(System.currentTimeMillis()));
        if (!str2.contains(str)) {
            str2 = str2 + str + ",";
        }
        prefDef_.downloadSpeedUpGames().g(str2);
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.m(str));
    }

    public static void v3(Context context, String str, SimpleDraweeView simpleDraweeView) {
        if (simpleDraweeView == null) {
            return;
        }
        Context context2 = simpleDraweeView.getContext();
        if (str == null) {
            MyImageLoader.d(simpleDraweeView, R.drawable.net_match_default_user_icon, MyImageLoader.F(context2, R.drawable.net_match_default_user_icon).toString());
        } else {
            MyImageLoader.v(simpleDraweeView, R.drawable.net_match_default_user_icon, str, null);
        }
    }

    public static void v4(Context context, List<com.wufan.user.service.protobuf.d> list) {
        String uid = AccountUtil_.getInstance_(context).getUid();
        b2.m0.p().delete(uid);
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.wufan.user.service.protobuf.d dVar : list) {
            UserPurchaseInfo userPurchaseInfo = new UserPurchaseInfo();
            userPurchaseInfo.setUid(uid);
            long y12 = dVar.y1();
            try {
                userPurchaseInfo.setSpExpireTime(Base64Utils.encodeToString((y12 + "").getBytes("utf-8")));
            } catch (UnsupportedEncodingException e5) {
                e5.printStackTrace();
            }
            long t12 = dVar.t1();
            try {
                userPurchaseInfo.setCheatExpireTime(Base64Utils.encodeToString((t12 + "").getBytes("utf-8")));
            } catch (UnsupportedEncodingException e6) {
                e6.printStackTrace();
            }
            b2.m0.p().k(userPurchaseInfo);
        }
    }

    public static void w(List<GameDetialBookTag> list, LinearLayout linearLayout, Context context) {
        if (list == null) {
            return;
        }
        try {
            linearLayout.removeAllViews();
            for (int i4 = 0; i4 < list.size(); i4++) {
                GameDetialBookTag gameDetialBookTag = list.get(i4);
                View inflate = LayoutInflater.from(context).inflate(R.layout.detial_tag_item_layout, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.tipText);
                LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.itemBack);
                if (i4 == 0) {
                    linearLayout2.setBackgroundResource(R.drawable.detial_tip_first);
                }
                textView.setText(gameDetialBookTag.getTitle());
                linearLayout.addView(inflate);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static int w0(PayTagInfo payTagInfo, String str) {
        if (payTagInfo != null) {
            if (payTagInfo.getPay_game_amount() > 0 && b2.e0.o().p(str)) {
                payTagInfo.setAmount_check(0);
                return 0;
            }
            payTagInfo.setAmount_check(payTagInfo.getPay_game_amount());
            return payTagInfo.getAmount_check();
        }
        return 0;
    }

    public static void w1(DownloadTask downloadTask, WarMatchAndLocalTable warMatchAndLocalTable) {
        if (downloadTask == null || warMatchAndLocalTable == null) {
            return;
        }
        downloadTask.setDownload_source_url(warMatchAndLocalTable.getDownload_source_url());
        downloadTask.setDownload_outside_url(warMatchAndLocalTable.getDownload_outside_url());
        downloadTask.setDownload_original_switch(warMatchAndLocalTable.getDownload_original_switch());
        downloadTask.setDownload_source_switch_v1(warMatchAndLocalTable.getDownload_source_switch_v1());
        downloadTask.setDownload_source_switch_v2(warMatchAndLocalTable.getDownload_source_switch_v2());
    }

    public static String w2(double d5) {
        return new DecimalFormat("#0.00").format(d5);
    }

    public static void w3(Context context) {
        context.startActivity(new Intent("android.settings.SETTINGS"));
    }

    public static void w4(DownloadTask downloadTask) {
        DownloadTask f5;
        if (downloadTask == null || (f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val())) == null) {
            return;
        }
        f5.setProgress(downloadTask.getProgress());
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(downloadTask, 8));
    }

    public static void x(List<GameDetialBookTag> list, LinearLayout linearLayout, Context context) {
        if (list == null) {
            return;
        }
        try {
            linearLayout.removeAllViews();
            for (int i4 = 0; i4 < list.size(); i4++) {
                GameDetialBookTag gameDetialBookTag = list.get(i4);
                View inflate = LayoutInflater.from(context).inflate(R.layout.detial_tag_item_modlethree_layout, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.tipText);
                LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.itemBack);
                if (i4 == 0) {
                    linearLayout2.setBackgroundResource(R.drawable.detial_tip_first_modlethree);
                }
                textView.setText(gameDetialBookTag.getTitle());
                linearLayout.addView(inflate);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static int x0(int i4, String str) {
        return i4;
    }

    public static void x1(DownloadTask downloadTask, AppBean appBean) {
        if (downloadTask == null || appBean == null) {
            return;
        }
        downloadTask.setDownload_source_url(appBean.getDownload_source_url());
        downloadTask.setDownload_outside_url(appBean.getDownload_outside_url());
        downloadTask.setDownload_original_switch(appBean.getDownload_original_switch());
        downloadTask.setDownload_source_switch_v1(appBean.getDownload_source_switch_v1());
        downloadTask.setDownload_source_switch_v2(appBean.getDownload_source_switch_v2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x2(Context context, String str, String str2, DownloadTask downloadTask, String str3) {
        int i4;
        if (g2.i(downloadTask.getMod_info())) {
            ModInfoBean modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class);
            if (modInfoBean != null) {
                APKUtils.W(context, modInfoBean, str3);
            }
        } else {
            boolean z4 = false;
            for (TipBean tipBean : downloadTask.getTipBeans()) {
                if ("23".equals(tipBean.getId())) {
                    z4 = true;
                }
            }
            boolean booleanValue = new PrefDef_(context).launch_game_switch().d().booleanValue();
            if (z4 && booleanValue) {
                z0(context, 1, downloadTask.getCrc_link_type_val(), "ANDROID_SINGLE", new b(context, downloadTask));
            } else {
                com.join.android.app.common.utils.e.l0(context);
                APKUtils.a0(context, downloadTask.getPackageName());
            }
        }
        if (g2.h(downloadTask.getMod_info())) {
            if (APKUtils.G(downloadTask)) {
                i4 = 1;
            } else {
                i4 = APKUtils.L(downloadTask) ? 2 : 0;
            }
            com.papa.sim.statistic.p.l(context).h1(str, AccountUtil_.getInstance_(context).getUid(), i4, downloadTask.get_from(), downloadTask.get_from_type(), downloadTask.getExt());
        }
        t4(context, str);
        T1(context, 12, downloadTask.getCrc_link_type_val());
    }

    public static void x3(TextView textView, DownloadTask downloadTask) {
        int down_status = downloadTask.getDown_status();
        downloadTask.getShowSize();
        int pay_game_amount = downloadTask.getPay_game_amount();
        String crc_link_type_val = downloadTask.getCrc_link_type_val();
        textView.setEnabled(true);
        boolean z4 = v0(pay_game_amount, crc_link_type_val) > 0;
        if (down_status == 3 && !z4) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setBackgroundResource(R.drawable.installbutn_big_normal);
        } else if (down_status == 2 && !z4) {
            textView.setText("即将开放");
            textView.setEnabled(false);
            textView.setBackgroundResource(R.drawable.installbutn_big_grey);
        } else if (down_status == 6 && !z4) {
            textView.setText("预约");
            textView.setBackgroundResource(R.drawable.installbutn_big_normal);
        } else {
            textView.setText(textView.getResources().getString(R.string.download_status_download));
            if (pay_game_amount > 0) {
                textView.setText(textView.getResources().getString(R.string.pay_game_amount, g2.m(pay_game_amount)));
            } else {
                textView.setBackgroundResource(R.drawable.installbutn_big_normal);
            }
        }
    }

    public static void x4(DownloadTask downloadTask) {
        DownloadTask f5;
        if (downloadTask == null || g2.h(downloadTask.getCrc_link_type_val()) || (f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val())) == null) {
            return;
        }
        downloadTask.setStatus(f5.getStatus());
        downloadTask.setSpeed(f5.getSpeed());
        downloadTask.setCurrentSize(f5.getCurrentSize());
        downloadTask.setProgress(f5.getProgress());
    }

    private static void y(StartGameMeta startGameMeta, DownloadTask downloadTask) {
        if (downloadTask == null || TextUtils.isEmpty(downloadTask.getFight_fun())) {
            return;
        }
        try {
            startGameMeta.setScoreBoard(A2(downloadTask.getFight_fun(), 16));
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }

    public static int y0(PayTagInfo payTagInfo, String str) {
        if (payTagInfo != null) {
            return payTagInfo.getPay_game_amount();
        }
        return 0;
    }

    public static void y1(DownloadTask downloadTask, CollectionBeanSub collectionBeanSub) {
        if (downloadTask == null || collectionBeanSub == null) {
            return;
        }
        downloadTask.setDownload_source_url(collectionBeanSub.getDownload_source_url());
        downloadTask.setDownload_outside_url(collectionBeanSub.getDownload_outside_url());
        downloadTask.setDownload_original_switch(collectionBeanSub.getDownload_original_switch());
        downloadTask.setDownload_source_switch_v1(collectionBeanSub.getDownload_source_switch_v1());
        downloadTask.setDownload_source_switch_v2(collectionBeanSub.getDownload_source_switch_v2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void y2(android.content.Context r15, com.github.snowdream.android.app.downloader.DownloadTask r16) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.UtilsMy.y2(android.content.Context, com.github.snowdream.android.app.downloader.DownloadTask):void");
    }

    public static void y3(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        ModInfoBean modInfoBean = downloadTask.getModInfoBean();
        if (modInfoBean != null) {
            modInfoBean.setIncompatible(true);
            downloadTask.setMod_info(JsonMapper.toJsonString(modInfoBean));
            p1.f.K().m(downloadTask);
        }
        SingleGameModInfoBean singleGameModInfoBean = downloadTask.getSingleGameModInfoBean();
        if (singleGameModInfoBean != null) {
            singleGameModInfoBean.setIncompatible(true);
            downloadTask.setSingle_game_mod_info(JsonMapper.toJsonString(singleGameModInfoBean));
            p1.f.K().m(downloadTask);
        }
    }

    public static void y4(DownloadTask downloadTask, DownloadTask downloadTask2) {
        if (downloadTask2 == null || downloadTask == null) {
            return;
        }
        if (APKUtils.L(downloadTask2)) {
            TipNew sp_tag_info = downloadTask2.getSp_tag_info();
            if (sp_tag_info != null) {
                TipNew sp_tag_info2 = downloadTask.getSp_tag_info();
                if (sp_tag_info2 != null) {
                    sp_tag_info2.setSingle_game_vm(sp_tag_info.getSingle_game_vm());
                    downloadTask.setSp_tag_info(sp_tag_info2);
                } else {
                    downloadTask.setSp_tag_info(sp_tag_info);
                }
            }
            try {
                b2.p o4 = b2.p.o();
                EMUApkTable n4 = o4.n(ConstantIntEnum.VM_SINGLE_MOD.value() + "");
                if (n4 != null) {
                    SingleGameModInfoBean singleGameModInfoBean = downloadTask2.getSingleGameModInfoBean();
                    if (singleGameModInfoBean == null) {
                        singleGameModInfoBean = new SingleGameModInfoBean();
                    }
                    if (g2.i(n4.getVer())) {
                        singleGameModInfoBean.setVersion(Integer.valueOf(Integer.parseInt(n4.getVer())));
                    }
                    singleGameModInfoBean.setDownUrl(n4.getDown_url());
                    downloadTask.setSingle_game_mod_info(JsonMapper.toJsonString(singleGameModInfoBean));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } else if (APKUtils.L(downloadTask)) {
            C2(downloadTask);
        }
    }

    public static void z(List<GameTagInfoV2_2Bean> list, String str, LinearLayout linearLayout, Context context) {
        if (list == null) {
            return;
        }
        try {
            linearLayout.removeAllViews();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(4, 0, 4, 0);
            for (GameTagInfoV2_2Bean gameTagInfoV2_2Bean : list) {
                if (gameTagInfoV2_2Bean.getId() != null && !gameTagInfoV2_2Bean.getId().equals("") && !gameTagInfoV2_2Bean.getId().equals("44") && !gameTagInfoV2_2Bean.getId().equals("45") && !gameTagInfoV2_2Bean.getId().equals("47") && !gameTagInfoV2_2Bean.getId().equals("48")) {
                    TextView textView = new TextView(context);
                    textView.setLayoutParams(layoutParams);
                    textView.setGravity(17);
                    textView.setText(gameTagInfoV2_2Bean.getName() + "");
                    textView.setTextColor(Color.parseColor(gameTagInfoV2_2Bean.getColor()));
                    textView.setPadding(0, 0, 0, 0);
                    textView.setSingleLine(true);
                    textView.setTextSize(context.getResources().getDimension(R.dimen.wdp8));
                    textView.setBackgroundDrawable(k2.a(context, gameTagInfoV2_2Bean.getColor() + ""));
                    linearLayout.addView(textView);
                }
            }
            TextView textView2 = new TextView(context);
            textView2.setLayoutParams(layoutParams);
            textView2.setGravity(17);
            textView2.setText(str + "");
            textView2.setTextColor(Color.parseColor("#81dfce"));
            textView2.setPadding(0, 0, 0, 0);
            textView2.setSingleLine(true);
            textView2.setTextSize(context.getResources().getDimension(R.dimen.wdp8));
            textView2.setBackgroundDrawable(k2.a(context, "#81dfce"));
            linearLayout.addView(textView2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void z0(Context context, int i4, String str, String str2, GameRoomActivity.x xVar) {
        Activity activity;
        if (System.currentTimeMillis() - f27438d < 600) {
            return;
        }
        f27438d = System.currentTimeMillis();
        boolean booleanValue = new PrefDef_(context).launch_game_switch().d().booleanValue();
        boolean booleanValue2 = new PrefDef_(context).download_game_switch().d().booleanValue();
        if (i4 == 2) {
            if (!booleanValue2) {
                xVar.onSuccess(i4, 0);
                return;
            }
        } else if (!booleanValue) {
            xVar.onSuccess(i4, 0);
            return;
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = MApplication.f1497x.getActivity();
            if (activity == null) {
                return;
            }
        }
        Activity activity2 = activity;
        RequestModel requestModel = new RequestModel();
        requestModel.setDefault(activity2);
        LuckHistoryrequest luckHistoryrequest = new LuckHistoryrequest();
        if (i4 == 4) {
            luckHistoryrequest.setType(13);
        } else if (i4 == 5) {
            luckHistoryrequest.setType(15);
        } else {
            luckHistoryrequest.setType(10);
        }
        if (i4 == 1 || i4 == 3 || i4 == 4) {
            luckHistoryrequest.setAction(2);
        } else if (i4 == 2) {
            luckHistoryrequest.setAction(1);
        } else {
            luckHistoryrequest.setAction(1);
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(activity2).getAccountData();
        luckHistoryrequest.setUserToken(accountData.getToken());
        luckHistoryrequest.setUid(accountData.getUid());
        luckHistoryrequest.setGameType(str2);
        luckHistoryrequest.setGameId(str);
        requestModel.setArgs(luckHistoryrequest);
        if (f27437c) {
            return;
        }
        f27437c = true;
        com.join.mgps.rpc.impl.i.D0().B0().Y0(requestModel.makeSign()).enqueue(new z(activity2, str, xVar, i4, accountData, luckHistoryrequest));
    }

    public static void z1(DownloadTask downloadTask, DetailResultBean detailResultBean) {
        if (downloadTask == null || detailResultBean == null) {
            return;
        }
        downloadTask.setDownload_source_url(detailResultBean.getDownload_source_url());
        downloadTask.setDownload_outside_url(detailResultBean.getDownload_outside_url());
        downloadTask.setDownload_original_switch(detailResultBean.getDownload_original_switch());
        downloadTask.setDownload_source_switch_v1(detailResultBean.getDownload_source_switch_v1());
        downloadTask.setDownload_source_switch_v2(detailResultBean.getDownload_source_switch_v2());
    }

    public static String z2(String str) {
        return "http://ctimg.mg3721.com/upload/images/headportrait/public/" + str + ".png";
    }

    public static boolean z3(Context context, TextView textView, int i4, int i5) {
        if (textView == null) {
            return false;
        }
        if (i5 > 0) {
            textView.setTextColor(context.getResources().getColor(R.color.vip_svip_color));
        } else if (i4 > 0) {
            textView.setTextColor(context.getResources().getColor(R.color.vip_color));
        } else {
            textView.setTextColor(Color.parseColor("#3b3b3b"));
            return false;
        }
        return true;
    }

    public static void z4(DownloadTask downloadTask, String str) {
        DownloadTask F;
        if (!g2.i(str) || (F = p1.f.K().F(str)) == null) {
            return;
        }
        y4(downloadTask, F);
    }
}
