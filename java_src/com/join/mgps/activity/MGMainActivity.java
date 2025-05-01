package com.join.mgps.activity;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaResponse;
import com.MApplication;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.efs.sdk.base.core.util.PackageUtil;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.dialog.LocalGameThreeDialog;
import com.join.android.app.common.http.MiitHelper;
import com.join.android.app.common.servcie.DownloadBaseActivity;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.findgame.FindGameMainFragment;
import com.join.kotlin.ui.findgame.data.IntentClassfyEvent;
import com.join.kotlin.ui.userrecom.UserRecomRequestArgs;
import com.join.kotlin.ui.userrecom.UserRecomendActivity;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.WifiUtils;
import com.join.mgps.activity.FriendInviteActivity_;
import com.join.mgps.activity.arena.GameRoomActivity;
import com.join.mgps.activity.arena.GameRoomActivity_;
import com.join.mgps.activity.arena.GameRoomListActivity;
import com.join.mgps.activity.arena.NewArenaDownloadActivity_;
import com.join.mgps.activity.login.LoginCfgsBean;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.activity.login.UsercenterFragmentNew;
import com.join.mgps.activity.login.UsercenterFragmentNew_;
import com.join.mgps.activity.message.MessageMainActivity_;
import com.join.mgps.customview.CircleDownloadProgressBar;
import com.join.mgps.customview.LightningView;
import com.join.mgps.customview.ScrollTextViewLayout;
import com.join.mgps.customview.input.InputNumView;
import com.join.mgps.customview.smartpopupwindow.SmartPopupWindow;
import com.join.mgps.db.tables.EMUApkArenaTable;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.db.tables.VideoWatchLogTable;
import com.join.mgps.dialog.o2;
import com.join.mgps.dto.APKVersionMainBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.ApkVersionbean;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.BaseBean;
import com.join.mgps.dto.BattaleSwitchBean;
import com.join.mgps.dto.BootPageData;
import com.join.mgps.dto.BootPageItem;
import com.join.mgps.dto.BootPageRequestArgs;
import com.join.mgps.dto.CfgInfoRequestArgs;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommentSendMessageResultBean;
import com.join.mgps.dto.CommonAdBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ConfigData;
import com.join.mgps.dto.DeviceInfoBean;
import com.join.mgps.dto.DownloadSpeedupCfgBean;
import com.join.mgps.dto.FirstIntentData;
import com.join.mgps.dto.FriendAccountInfo;
import com.join.mgps.dto.FriendBean;
import com.join.mgps.dto.FriendInviteBean;
import com.join.mgps.dto.FriendReqBean;
import com.join.mgps.dto.GameHeadAd;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.dto.HomeViewSwich;
import com.join.mgps.dto.JPushIntentData;
import com.join.mgps.dto.LoginMethodResultData;
import com.join.mgps.dto.MessageRedPointBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.OnlineCouponConfigBean;
import com.join.mgps.dto.PdAdCfgBean;
import com.join.mgps.dto.PlayCfgBean;
import com.join.mgps.dto.PopupAdBean;
import com.join.mgps.dto.PspGameAdCfgBean;
import com.join.mgps.dto.PublicVideoCfgBean;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.RecomeWifiDatabean;
import com.join.mgps.dto.RegisterRequestBean;
import com.join.mgps.dto.RequestCommonAdArgs;
import com.join.mgps.dto.RequestEndGameListArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestUidtagidTagdes;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.RewardBean;
import com.join.mgps.dto.SNKGameInfoBean;
import com.join.mgps.dto.SingleGameAdBean;
import com.join.mgps.dto.SingleGameRunAdTextCfgBean;
import com.join.mgps.dto.TipsInfoBean;
import com.join.mgps.dto.TouristLoginRequestBean;
import com.join.mgps.dto.UninstallOnlineGameArgs;
import com.join.mgps.dto.UninstallOnlineGameBean;
import com.join.mgps.dto.VersionDto;
import com.join.mgps.dto.VideoAdCfgBean;
import com.join.mgps.dto.VideoAdCfgRequestArgs;
import com.join.mgps.dto.VideoAdWatchLogRequest;
import com.join.mgps.enums.Dtype;
import com.join.mgps.fragment.DiscoveryFragmentV4_;
import com.join.mgps.mod.utils.PluginConfig;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.receiver.BootReceiver_;
import com.join.mgps.service.CommonService;
import com.join.mgps.service.CommonService_;
import com.join.mgps.service.UpdateService_;
import com.mob.MobSDK;
import com.mob.OperationCallback;
import com.netease.nis.quicklogin.listener.QuickLoginPreMobileListener;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.ExtFrom;
import com.papa91.VideoStrategyPop;
import com.papa91.arc.bean.ButtonBean;
import com.papa91.arc.ext.ToastManager;
import com.papa91.battle.protocol.GameRoom;
import com.papa91.wrapper.UserPrefs;
import com.uc.crashsdk.export.LogType;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.umcrash.UMCrash;
import com.wufan.user.service.protobuf.k;
import com.xinzhu.overmind.Overmind;
import io.netty.handler.traffic.AbstractTrafficShapingHandler;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.springframework.util.LinkedMultiValueMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tv.danmaku.ijk.media.player.IMediaPlayer;
@EActivity(R.layout.mg_mainlayout)
/* loaded from: classes.dex */
public class MGMainActivity extends DownloadBaseActivity implements com.join.mgps.pref.f {
    public static final String KEY_EXTRAS = "extras";
    public static final String KEY_MEDIACMD = "key_mediacmd";
    public static final String KEY_MEDIACMDPARAMS = "key_mediacmd_params";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TITLE = "title";
    public static final String MESSAGE_RECEIVED_ACTION = "com.example.jpushdemo.MESSAGE_RECEIVED_ACTION";
    private static int MainAppInfoColorMain = -4802890;
    private static int MainYelloColor = -756480;
    public static boolean isCreated;
    public static boolean isForeground;
    private long LastOpHomePageButtonTime;
    private com.wufan.user.service.protobuf.n0 accountBean;
    TextView accountId;
    private com.join.mgps.dialog.c adVipMainDialog;
    private Animation animation;
    private ObjectAnimator animation2;
    private com.join.mgps.dialog.e appUpdateDialog;
    SimpleDraweeView avatar;
    SimpleDraweeView avatar1;
    @ViewById
    TextView bigCenterRound;
    public TextView biground;
    @ViewById
    LinearLayout bottom;
    View button;
    @ViewById
    CircleDownloadProgressBar cdp_down_progress;
    FindGameMainFragment choiceFragment;
    View close;
    SimpleDraweeView coinFloatad;
    private Context context;
    private Activity curActivty;
    @ViewById
    TextView dialogBack;
    Dialog dialogU;
    @ViewById
    ImageView discoverHuojian;
    @ViewById
    ImageView discoverMessage;
    @ViewById
    LinearLayout discoverNormal;
    public LinearLayout downloadLayout;
    public ImageView downloadLine;
    public List<DownloadTask> downloadTasks;
    @ViewById
    SimpleDraweeView downlodingGameIcon;
    @ViewById
    TextView endGameBadge;
    DiscoveryFragmentV4_ fightFragment;
    @ViewById
    ImageView fightImage;
    @ViewById
    RelativeLayout fightSelect;
    @ViewById
    TextView fightText;
    FirstIntentData firstIntentData;
    com.join.mgps.Util.i0 flipCardAnimation;
    private FragmentManager fragmentManager;
    com.join.mgps.rpc.j friendClient;
    TextView gameName;
    com.join.mgps.ad.h gdtAdVideo;
    com.join.mgps.ad.h gdtDownLoadSpeedAd;
    com.join.mgps.ad.h gdtGoldAdVideo;
    com.join.mgps.ad.h gdtPspAd;
    @ViewById
    SimpleDraweeView gifIcon;
    com.join.mgps.ad.l groDownLoadSpeedAd;
    com.join.mgps.ad.l groMAdVideo;
    com.join.mgps.ad.l groPspAd;
    private boolean hasNet;
    public ImageView hasNewFinishedGameImage;
    private boolean hasShowAd;
    @ViewById
    LinearLayout home_tab_default_layout;
    @ViewById
    ImageView home_tab_huojian_image;
    @ViewById
    ImageView home_tab_monkey_image;
    @ViewById
    RelativeLayout home_tab_monkey_layout;
    ImageView imageLoading;
    @ViewById
    ImageView imageView36;
    @Extra
    IntentDateBean intentDateBean;
    @Extra
    IntentDateBean intentDateBean22;
    SmartPopupWindow invitePop;
    private boolean isDestroyed;
    private boolean isFirst;
    private boolean isMessageReceiverRegisted;
    private boolean isPapaMainFragmentHasNewData;
    @Extra
    JPushIntentData jPushIntentData;
    private long lastPreloginSuccessTime;
    private long lastPreloginTime;
    @ViewById
    RelativeLayout layout_others;
    private List<String> listZip;
    private com.join.android.app.common.dialog.f localGameOneDialog;
    private LocalGameThreeDialog localGameThreeDialog;
    private com.join.android.app.common.dialog.k localGameTwoDialog;
    private u0 mAdReceived;
    private DownloadTask mAdVipEvent;
    Dialog mDialog;
    private MessageReceiver mMessageReceiver;
    MyGamePapaFragmentV2_ mPapaActivity;
    com.join.mgps.rpc.e mRpcClient;
    private q.rorbin.badgeview.a messagebadge;
    PapaMainV4Fragment_ mgPapaMainFragment;
    @ViewById
    ImageView mg_category_image;
    @ViewById
    LinearLayout mg_category_tabselect;
    @ViewById
    TextView mg_category_text;
    @ViewById
    ImageView mg_chart_image;
    @ViewById
    RelativeLayout mg_chart_tabselect;
    @ViewById
    TextView mg_chart_text;
    @ViewById
    ImageView mg_emulator_image;
    @ViewById
    RelativeLayout mg_emulator_tabselect;
    @ViewById
    TextView mg_emulator_text;
    @ViewById
    ImageView mg_recom_image;
    @ViewById
    RelativeLayout mg_recom_tabselect;
    @ViewById
    TextView mg_recom_text;
    @ViewById
    TextView miniGameBadge;
    TextView name;
    TextView name1;
    @StringRes(resName = "connect_server_excption")
    String netConnectException;
    @StringRes(resName = "net_excption")
    String netExcption;
    @ViewById
    LinearLayout notice_layout;
    @ViewById
    TextView notice_text;
    @ViewById
    LightningView numberInTab;
    TextView papa_user_round;
    @Pref
    PrefDef_ prefDef;
    com.join.mgps.ad.s reAdVideo;
    com.join.mgps.ad.s reDownLoadSpeedAd;
    com.join.mgps.ad.s rePspAd;
    private v0 receiver;
    private RecomDatabean recomDatabean;
    com.join.mgps.rpc.e recommendClient;
    @ViewById
    TextView red_point;
    com.join.mgps.rpc.b rpcAccountClient;
    com.join.mgps.rpc.c rpcAccountClientV2;
    com.join.mgps.rpc.e rpcClient;
    com.join.mgps.rpc.g rpcConsoleGameClient;
    com.join.mgps.rpc.i rpcForumClient;
    TextView scroll_text;
    public ScrollTextViewLayout scroll_text_layout;
    private String shortcutGameId;
    @ViewById
    ImageView splash;
    com.join.mgps.ad.z ttAdVideo;
    com.join.mgps.ad.z ttDownLoadSpeedAd;
    com.join.mgps.ad.z ttGoldAdVideo;
    com.join.mgps.ad.z ttPspAd;
    @ViewById
    TextView unreadMessageBadge;
    private List<CommonAdBean> updateFeatureList;
    UsercenterFragmentNew userCenterFragment;
    SimpleDraweeView user_icon;
    private VideoStrategyPop videoStrategyPop;
    private String TAG = MGMainActivity.class.getSimpleName();
    private Bitmap mBitmap = null;
    private int num = 0;
    private int messageNum = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f34542n = 0;
    private int tableNum = 0;
    private int positionNum = 3;
    private int classiFy = 0;
    private int classifyPrimaryIndex = 1;
    private int isOpenExit = 1;
    private long startTime = 0;
    private boolean isNotThisGame = false;
    private Map<String, DownloadTask> downloadTasksMap = new ConcurrentHashMap();
    private boolean timeIsFinish = false;
    private Handler handler = new j();
    private String mainPos = "MainPos";
    private DownloadSpeedupCfgBean downloadSpeedupCfgBean = null;
    private PspGameAdCfgBean pspGameAdCfgBean = null;
    AlertDialog.Builder dialog = null;
    boolean isInitOm = false;
    private boolean isfirst35 = false;
    boolean hasPermiss = false;
    private boolean showInstallNoticeOrappDialog = false;
    private boolean hasRunFinishforFinishDialog = false;
    boolean hasBackupIng = false;
    private int backupNumber = 0;
    private int reloadNumber = 5;
    boolean showUpdate = false;
    private long exitTime = 0;
    private boolean activityHasDes = false;
    private boolean isFirstCommendVersion = false;
    private boolean showInstallLayout = true;
    private boolean hasResouse = false;
    private boolean checkHasSo = false;
    private boolean hasNewDownload = false;
    private String downloadUrl = "";
    private String downLoadFileName = "";
    private boolean showMonkey = true;
    long lastcheckDownService = 0;
    private List<String> listTempZip = new ArrayList();
    long timelastSnk = 0;
    private List<String> snkGameList = new ArrayList();
    private boolean isFirstCheck = true;
    private String allJsonStr = "";
    DownloadTask downloadTaskx = null;
    boolean showText = false;
    boolean needStopAnim = false;
    boolean hasRom = false;
    boolean hasPlug = false;

    /* renamed from: r  reason: collision with root package name */
    Runnable f34543r = new Runnable() { // from class: com.join.mgps.activity.h1
        @Override // java.lang.Runnable
        public final void run() {
            MGMainActivity.this.lambda$new$9();
        }
    };
    int currTabNumber = -1;
    String currTabTagId = "";
    String currGameId = "";
    private int preloginQueenCount = 0;
    Handler mHandler = new Handler();
    w0 preloginRunnable = new l0();
    Runnable rePreloginRunnable = new m0();
    private boolean hasGetAvailableLoginMethods = false;
    private boolean hasJumpToOneKeyLogin = false;
    private boolean isLoginedWhenEnter = false;
    private boolean isShowingSplash = false;

    /* loaded from: classes4.dex */
    public enum MediaCmd {
        CMD_PLAY,
        CMD_PLAY_BACKGROUND,
        CMD_PAUSE,
        CMD_STOP,
        CMD_FULLSCREEN,
        CMD_TRANSLATE_Y
    }

    /* loaded from: classes4.dex */
    public class MessageReceiver extends BroadcastReceiver {
        public MessageReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (MGMainActivity.MESSAGE_RECEIVED_ACTION.equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("message");
                String stringExtra2 = intent.getStringExtra(MGMainActivity.KEY_EXTRAS);
                StringBuilder sb = new StringBuilder();
                sb.append("message : ");
                sb.append(stringExtra);
                sb.append("\n");
                if (com.join.mgps.Util.r0.e(stringExtra2)) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("extras : ");
                sb2.append(stringExtra2);
                sb2.append("\n");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Callback<ResponseModel<List<CollectionBeanSub>>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f34546b;

        a(long j4) {
            this.f34546b = j4;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel<List<CollectionBeanSub>>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel<List<CollectionBeanSub>>> call, Response<ResponseModel<List<CollectionBeanSub>>> response) {
            List<CollectionBeanSub> data;
            if (response == null || response.code() != 200 || (data = response.body().getData()) == null || data.size() <= 0 || MGMainActivity.this.isForcedLogin(2)) {
                return;
            }
            Intent intent = new Intent(MGMainActivity.this.context, UserRecomendActivity.class);
            intent.putExtra("listDatas", (Serializable) data);
            intent.putExtra("range", this.f34546b);
            MGMainActivity.this.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a0 extends com.join.mgps.ad.h {

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f34548p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34548p = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void c(String str) {
            super.c(str);
            if (!TextUtils.isEmpty(str)) {
                DownloadTask F = p1.f.K().F(str);
                if (F != null && F.getStatus() == 11) {
                    UtilsMy.a4(F, MGMainActivity.this);
                }
                MGMainActivity mGMainActivity = MGMainActivity.this;
                com.join.mgps.ad.h hVar = mGMainActivity.gdtDownLoadSpeedAd;
                com.join.mgps.ad.d.k(mGMainActivity, 21, str);
            }
            MGMainActivity.this.delayChangeAdshow();
            MGMainActivity mGMainActivity2 = MGMainActivity.this;
            mGMainActivity2.delayLoadRewardAd(mGMainActivity2.gdtDownLoadSpeedAd);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            MGMainActivity.this.sendVideoAdWatchLog(3, 2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34548p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Callback<ResponseModel<ConfigData>> {
        b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel<ConfigData>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel<ConfigData>> call, Response<ResponseModel<ConfigData>> response) {
            ConfigData data;
            if (response == null || response.body() == null || (data = response.body().getData()) == null) {
                return;
            }
            String client_ip = data.getClient_ip();
            try {
                MGMainActivity.this.prefDef.launch_game_switch().g(Boolean.valueOf(data.isLaunch_game_switch()));
                MGMainActivity.this.prefDef.download_game_switch().g(Boolean.valueOf(data.isDownload_game_switch()));
                MGMainActivity.this.prefDef.non_online_user_switch().g(Boolean.valueOf(data.isNon_online_user_switch()));
                MGMainActivity.this.prefDef.androidIdNullsKey().g(JsonMapper.getInstance().toJson(data.getReal_name_black_list()));
                MGMainActivity.this.prefDef.wx_open_appid().g(data.getWx_open_appid());
                MGMainActivity.this.prefDef.isHomepagePlayVideo().g(Boolean.valueOf(data.isHome_page_video_switch()));
                MGMainActivity.this.prefDef.net_game_count_down().g(Integer.valueOf(data.getNet_game_count_down()));
                MGMainActivity.this.prefDef.show_unknown_source().g(Boolean.valueOf(data.isUnknown_source_state()));
                if (data.getFirst_screen_ad_interaction() != null) {
                    com.papa.sim.statistic.pref.b.k(MGMainActivity.this).y(JsonMapper.toJsonString(data.getFirst_screen_ad_interaction()));
                }
                String d5 = com.join.mgps.Util.a.d(client_ip, "UTF-8");
                if (!d5.equals(MApplication.B)) {
                    MApplication.B = d5;
                }
                MGMainActivity.this.prefDef.w_channel_info_switch().g(Boolean.valueOf(data.isW_channel_info_switch()));
                PdAdCfgBean pd_ad_cfg = data.getPd_ad_cfg();
                if (pd_ad_cfg != null) {
                    String d6 = MGMainActivity.this.prefDef.pd_ad_config().d();
                    if (com.join.mgps.Util.g2.i(d6)) {
                        try {
                            PdAdCfgBean pdAdCfgBean = (PdAdCfgBean) JsonMapper.getInstance().fromJson(d6, PdAdCfgBean.class);
                            if (pdAdCfgBean == null || !com.join.mgps.Util.y.u(pdAdCfgBean.getLastUpdateConfigTime())) {
                                pd_ad_cfg.setLastUpdateConfigTime(System.currentTimeMillis());
                                MGMainActivity.this.prefDef.pd_ad_config().g(JsonMapper.toJsonString(pd_ad_cfg));
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                            pd_ad_cfg.setLastUpdateConfigTime(System.currentTimeMillis());
                            MGMainActivity.this.prefDef.pd_ad_config().g(JsonMapper.toJsonString(pd_ad_cfg));
                        }
                    } else {
                        pd_ad_cfg.setLastUpdateConfigTime(System.currentTimeMillis());
                        MGMainActivity.this.prefDef.pd_ad_config().g(JsonMapper.toJsonString(pd_ad_cfg));
                    }
                } else {
                    MGMainActivity.this.prefDef.pd_ad_config().g("");
                }
                if (data.getFound_game_tab() != null) {
                    MGMainActivity.this.prefDef.found_game_tab().g(JsonMapper.toJsonString(data.getFound_game_tab()));
                    TipsInfoBean tips_info = data.getFound_game_tab().getTips_info();
                    if (tips_info != null) {
                        MGMainActivity.this.updateFindGameRetHot(tips_info);
                    }
                }
                if (data.getWeb_disk_cfg() != null) {
                    MGMainActivity.this.prefDef.ab_side().g(Integer.valueOf(data.getWeb_disk_cfg().getAb_side()));
                    int i4 = 2;
                    if (data.getWeb_disk_cfg().getAb_side() == 0) {
                        MGMainActivity.this.prefDef.isBsideInt().g(2);
                    } else {
                        org.androidannotations.api.sharedpreferences.i isBsideInt = MGMainActivity.this.prefDef.isBsideInt();
                        if (!data.isB_side()) {
                            i4 = 1;
                        }
                        isBsideInt.g(Integer.valueOf(i4));
                    }
                    MGMainActivity.this.prefDef.web_disk_cfg().g(JsonMapper.getInstance().toJson(data.getWeb_disk_cfg()));
                    MGMainActivity.this.prefDef.quark_display_mode().g(Integer.valueOf(data.getWeb_disk_cfg().getKk_ico_display()));
                }
                if (data.getWeb_disk_position() != null) {
                    MGMainActivity.this.prefDef.web_disk_position().g(JsonMapper.toJsonString(data.getWeb_disk_position()));
                }
                MGMainActivity.this.addShortCuts();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b0 extends com.join.mgps.ad.h {

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f34551p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34551p = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClose() {
            super.onADClose();
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.h hVar = mGMainActivity.gdtPspAd;
            com.join.mgps.ad.d.i(mGMainActivity, 18);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            MGMainActivity.this.sendVideoAdWatchLog(2, 2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34551p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Callback<ResultMainBean<LoginCfgsBean>> {
        c() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultMainBean<LoginCfgsBean>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResultMainBean<LoginCfgsBean>> call, Response<ResultMainBean<LoginCfgsBean>> response) {
            LoginCfgsBean data;
            if (response != null) {
                try {
                    if (response.body() != null) {
                        ResultMainBean<LoginCfgsBean> body = response.body();
                        if (body.getCode() != 600 || body.getMessages() == null || (data = body.getMessages().getData()) == null) {
                            return;
                        }
                        MApplication.S = data;
                        com.join.mgps.pref.h.n(MGMainActivity.this.context).M(data);
                        if (MGMainActivity.this.prefDef.startGameShowLoginNumber().d().intValue() == -1) {
                            MGMainActivity.this.prefDef.startGameShowLoginNumber().g(Integer.valueOf(data.getHow_times_open()));
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c0 extends com.join.mgps.ad.s {

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f34554r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34554r = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void c(String str) {
            super.c(str);
            if (!TextUtils.isEmpty(str)) {
                DownloadTask F = p1.f.K().F(str);
                if (F != null && F.getStatus() == 11) {
                    UtilsMy.a4(F, MGMainActivity.this);
                }
                MGMainActivity mGMainActivity = MGMainActivity.this;
                com.join.mgps.ad.s sVar = mGMainActivity.reDownLoadSpeedAd;
                com.join.mgps.ad.d.k(mGMainActivity, 21, str);
            }
            MGMainActivity.this.delayChangeAdshow();
            MGMainActivity mGMainActivity2 = MGMainActivity.this;
            mGMainActivity2.delayLoadRewardAd(mGMainActivity2.reDownLoadSpeedAd);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            MGMainActivity.this.sendVideoAdWatchLog(3, 9);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34554r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSub f34556b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f34557c;

        d(CollectionBeanSub collectionBeanSub, com.join.mgps.customview.o oVar) {
            this.f34556b = collectionBeanSub;
            this.f34557c = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!this.f34556b.getGame_id().isEmpty() && !this.f34556b.getGame_info_tpl_type().isEmpty()) {
                IntentUtil.getInstance().intentActivity(MGMainActivity.this, this.f34556b.getIntentDataBean());
            }
            this.f34557c.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d0 extends com.join.mgps.ad.s {

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f34559r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34559r = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClose() {
            super.onADClose();
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.s sVar = mGMainActivity.rePspAd;
            com.join.mgps.ad.d.i(mGMainActivity, 18);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            MGMainActivity.this.sendVideoAdWatchLog(2, 9);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34559r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGMainActivity.this.downloadLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e0 extends com.join.mgps.ad.l {

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f34562s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34562s = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void c(String str) {
            super.c(str);
            if (!TextUtils.isEmpty(str)) {
                DownloadTask F = p1.f.K().F(str);
                if (F != null && F.getStatus() == 11) {
                    UtilsMy.a4(F, MGMainActivity.this);
                }
                MGMainActivity mGMainActivity = MGMainActivity.this;
                com.join.mgps.ad.l lVar = mGMainActivity.groDownLoadSpeedAd;
                com.join.mgps.ad.d.k(mGMainActivity, 21, str);
            }
            MGMainActivity.this.delayChangeAdshow();
            MGMainActivity mGMainActivity2 = MGMainActivity.this;
            mGMainActivity2.delayLoadRewardAd(mGMainActivity2.groDownLoadSpeedAd);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            MGMainActivity.this.sendVideoAdWatchLog(3, 7);
            l(Event.Stopad_GromoreSdk_VideoShow.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34562s);
        }

        @Override // com.join.mgps.ad.l
        public void y() {
            super.y();
            l(Event.Stopad_GromoreSdk_Videoloading.name(), this.f39682f);
        }
    }

    /* loaded from: classes4.dex */
    class f implements Consumer<com.tbruyelle.rxpermissions2.b> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                dialogInterface.dismiss();
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", MGMainActivity.this.getPackageName(), null));
                MGMainActivity.this.startActivity(intent);
            }
        }

        f() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
            if (bVar.f62140b) {
                MGMainActivity mGMainActivity = MGMainActivity.this;
                if (mGMainActivity.hasPermiss) {
                    return;
                }
                mGMainActivity.hasPermiss = ContextCompat.checkSelfPermission(mGMainActivity.context, com.kuaishou.weapon.p0.g.f55590j) == 0;
                MGMainActivity mGMainActivity2 = MGMainActivity.this;
                boolean z4 = mGMainActivity2.hasPermiss;
                if (z4) {
                    mGMainActivity2.startBackups(z4);
                }
            } else if (bVar.f62141c) {
            } else {
                MGMainActivity mGMainActivity3 = MGMainActivity.this;
                Dialog dialog = mGMainActivity3.dialogU;
                if (dialog == null) {
                    mGMainActivity3.dialog = new AlertDialog.Builder(mGMainActivity3.context, R.style.AlertDialogCustom);
                } else if (dialog.isShowing()) {
                    return;
                }
                if (bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55587g)) {
                    return;
                }
                MGMainActivity.this.dialog.setTitle("提示");
                if (!bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55590j) && !bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55589i)) {
                    MGMainActivity.this.dialog.setMessage("请去设置中开启权限");
                } else {
                    MGMainActivity.this.dialog.setMessage("需要打开读写存储权限，请去设置中开启权限");
                }
                MGMainActivity.this.dialog.setPositiveButton("去打开", new a());
                MGMainActivity mGMainActivity4 = MGMainActivity.this;
                mGMainActivity4.dialogU = mGMainActivity4.dialog.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f0 implements MiitHelper.a {
        f0() {
        }

        @Override // com.join.android.app.common.http.MiitHelper.a
        public void a(@NonNull String str) {
            if (!com.join.mgps.Util.g2.i(str)) {
                str = "";
            }
            MApplication.I = str;
            com.papa.sim.statistic.s.f(MApplication.f1497x).u(str);
            MApplication.f1497x.E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity.this.getSNKGameInfo(-1);
            MGMainActivity.this.resetSelfSupportPrmopt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g0 extends com.join.mgps.ad.l {

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f34568s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34568s = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClose() {
            super.onADClose();
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.l lVar = mGMainActivity.groPspAd;
            com.join.mgps.ad.d.i(mGMainActivity, 18);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            MGMainActivity.this.sendVideoAdWatchLog(2, 7);
            l(Event.Stopad_GromoreSdk_VideoShow.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34568s);
        }

        @Override // com.join.mgps.ad.l
        public void y() {
            super.y();
            l(Event.Stopad_GromoreSdk_Videoloading.name(), this.f39682f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements Animation.AnimationListener {
        h() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h0 implements Animation.AnimationListener {
        h0() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            ((com.join.mgps.Util.i0) animation).a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecomDatabean f34572b;

        i(RecomDatabean recomDatabean) {
            this.f34572b = recomDatabean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGMainActivity.this.coinFloatad.setVisibility(8);
            MGMainActivity.this.prefDef.clickFloatViewTime().g(Long.valueOf(System.currentTimeMillis()));
            if (com.join.mgps.Util.g2.i(this.f34572b.getMain().getPic_remote())) {
                IntentUtil.getInstance().intentActivity(MGMainActivity.this.context, this.f34572b.getSub().get(0).getIntentDataBean());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i0 implements InputNumView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.input.a f34574a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArenaRequest f34575b;

        i0(com.join.mgps.customview.input.a aVar, ArenaRequest arenaRequest) {
            this.f34574a = aVar;
            this.f34575b = arenaRequest;
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void a(String str) {
            this.f34574a.c();
            if (this.f34575b == null) {
                return;
            }
            FriendBean friendBean = new FriendBean();
            friendBean.setGameId(this.f34575b.gameId + "");
            friendBean.setRoomId(this.f34575b.roomId);
            friendBean.setElite(this.f34575b.isElite);
            friendBean.setRoomPwd(str);
            com.wufan.friend.chat.c.u().p(friendBean);
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void hide() {
            this.f34574a.c();
        }
    }

    /* loaded from: classes4.dex */
    class j extends Handler {
        j() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                MGMainActivity.this.timeIsFinish = true;
            } else if (i4 != 2) {
                if (i4 != 3) {
                    return;
                }
                MGMainActivity.this.startShowRecommendwifi((RecomeWifiDatabean) message.obj);
            } else {
                RecomeWifiDatabean recomeWifiDatabean = (RecomeWifiDatabean) message.obj;
                if (!MGMainActivity.this.timeIsFinish) {
                    long currentTimeMillis = 3000 - (System.currentTimeMillis() - MGMainActivity.this.startTime);
                    if (currentTimeMillis > 0 && currentTimeMillis < 3000) {
                        Message message2 = new Message();
                        message2.what = 3;
                        message2.obj = message.obj;
                        sendMessageDelayed(message2, currentTimeMillis);
                        return;
                    }
                    MGMainActivity.this.startShowRecommendwifi(recomeWifiDatabean);
                    return;
                }
                MGMainActivity.this.startShowRecommendwifi(recomeWifiDatabean);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j0 implements Callback<ResponseModel> {
        j0() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
            if (response != null && response.body() != null) {
                ResponseModel body = response.body();
                if (body.getError() == 0) {
                    MGMainActivity.this.addSuccess(Boolean.TRUE);
                    return;
                } else {
                    MGMainActivity.this.toast(body.getMsg());
                    return;
                }
            }
            MGMainActivity.this.toast("添加失败");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements View.OnClickListener {

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (MGMainActivity.this.localGameOneDialog != null) {
                    try {
                        MGMainActivity.this.localGameOneDialog.dismiss();
                    } catch (Exception unused) {
                    }
                    MGMainActivity.this.localGameOneDialog = null;
                }
                if (MGMainActivity.this.localGameTwoDialog.a()) {
                    return;
                }
                try {
                    MGMainActivity.this.localGameTwoDialog.dismiss();
                } catch (Exception unused2) {
                }
            }
        }

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MGMainActivity.this.localGameTwoDialog != null) {
                try {
                    MGMainActivity.this.localGameTwoDialog.dismiss();
                } catch (Exception unused) {
                }
                MGMainActivity.this.localGameTwoDialog = null;
            }
            if (MGMainActivity.this.localGameThreeDialog != null) {
                try {
                    MGMainActivity.this.localGameThreeDialog.dismissAllowingStateLoss();
                } catch (Exception unused2) {
                }
                MGMainActivity.this.localGameThreeDialog = null;
            }
            if (ContextCompat.checkSelfPermission(MGMainActivity.this.context, com.kuaishou.weapon.p0.g.f55589i) != 0) {
                UtilsMy.O2(MGMainActivity.this.context, com.kuaishou.weapon.p0.g.f55589i);
                return;
            }
            MGMainActivity.this.localGameTwoDialog = new com.join.android.app.common.dialog.k(MGMainActivity.this.curActivty);
            MGMainActivity.this.localGameTwoDialog.show();
            MGMainActivity.this.localGameTwoDialog.e(new a());
            MGMainActivity.this.changeText();
            MGMainActivity.this.localGameTwoDialog.d("识别中...");
            MGMainActivity.this.localGameTwoDialog.b();
            MGMainActivity.this.checkSNKGame();
            try {
                MGMainActivity.this.localGameOneDialog.dismiss();
            } catch (Exception unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k0 extends AsyncTask<Integer, Void, FriendAccountInfo> {
        k0() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public FriendAccountInfo doInBackground(Integer... numArr) {
            int intValue = numArr[0].intValue();
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(MGMainActivity.this).getAccountData();
                FriendReqBean friendReqBean = new FriendReqBean();
                friendReqBean.setUid(accountData.getUid());
                friendReqBean.setToken(accountData.getToken());
                friendReqBean.setRuid(intValue);
                ResponseModel<FriendAccountInfo> i4 = com.join.mgps.rpc.impl.h.p().i(accountData.getUid() + "", accountData.getToken() + "", intValue + "");
                if (i4 != null) {
                    if (i4.getError() == 0) {
                        return i4.getData();
                    }
                    MGMainActivity.this.toast(i4.getMsg());
                    return null;
                }
                return null;
            } catch (Exception e5) {
                e5.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(FriendAccountInfo friendAccountInfo) {
            super.onPostExecute(friendAccountInfo);
            if (friendAccountInfo == null) {
                return;
            }
            try {
                MyImageLoader.x(MGMainActivity.this.avatar1, friendAccountInfo.getAvatar());
                MGMainActivity.this.name1.setText(friendAccountInfo.getNickName());
                TextView textView = MGMainActivity.this.accountId;
                textView.setText(friendAccountInfo.getAccount() + "");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l extends com.join.mgps.ad.z {

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f34582s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34582s = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            UserPrefs userPrefs = new UserPrefs(MGMainActivity.this.context);
            userPrefs.setFbaAdGamesConfig(str, MGMainActivity.this.accountBean.getUid() + "", i4 + 1, i5 + 1);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.z zVar = mGMainActivity.ttAdVideo;
            com.join.mgps.ad.d.i(mGMainActivity, 9);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            MGMainActivity.this.sendVideoAdWatchLog(1, 1);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34582s);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.z zVar = mGMainActivity.ttAdVideo;
            com.join.mgps.ad.d.i(mGMainActivity, 9);
        }
    }

    /* loaded from: classes4.dex */
    class l0 implements w0 {

        /* renamed from: b  reason: collision with root package name */
        private boolean f34584b;

        /* loaded from: classes4.dex */
        class a extends QuickLoginPreMobileListener {
            a() {
            }

            @Override // com.netease.nis.quicklogin.listener.QuickLoginListener
            public void onGetMobileNumberError(String str, String str2) {
                MApplication.E1 = false;
                if (MGMainActivity.this.preloginQueenCount > 0) {
                    MGMainActivity mGMainActivity = MGMainActivity.this;
                    if (mGMainActivity.mHandler == null) {
                        mGMainActivity.mHandler = new Handler();
                    }
                    MGMainActivity mGMainActivity2 = MGMainActivity.this;
                    mGMainActivity2.mHandler.post(mGMainActivity2.preloginRunnable);
                }
            }

            @Override // com.netease.nis.quicklogin.listener.QuickLoginListener
            public void onGetMobileNumberSuccess(String str, String str2) {
                MGMainActivity.this.lastPreloginSuccessTime = System.currentTimeMillis();
                MApplication.E1 = true;
                if (l0.this.f34584b) {
                    MGMainActivity.this.goToOnekeyLogin();
                }
            }
        }

        l0() {
        }

        @Override // com.join.mgps.activity.MGMainActivity.w0
        public w0 W(boolean z4) {
            this.f34584b = z4;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity.access$2610(MGMainActivity.this);
            if (com.join.android.app.common.utils.j.j(MGMainActivity.this.context) && System.currentTimeMillis() - MGMainActivity.this.lastPreloginTime >= 1500) {
                if ((System.currentTimeMillis() - MGMainActivity.this.lastPreloginSuccessTime >= 60000 || !MApplication.E1) && !MGMainActivity.this.prefDef.firstShowUserPermiss().d().booleanValue()) {
                    MGMainActivity.this.lastPreloginTime = System.currentTimeMillis();
                    MApplication.n().prefetchMobileNumber(new a());
                    MGMainActivity mGMainActivity = MGMainActivity.this;
                    if (mGMainActivity.mHandler == null) {
                        mGMainActivity.mHandler = new Handler();
                    }
                    MGMainActivity mGMainActivity2 = MGMainActivity.this;
                    mGMainActivity2.mHandler.removeCallbacks(mGMainActivity2.rePreloginRunnable);
                    MGMainActivity mGMainActivity3 = MGMainActivity.this;
                    mGMainActivity3.mHandler.postDelayed(mGMainActivity3.rePreloginRunnable, 540000L);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m extends com.join.mgps.ad.h {

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f34587p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34587p = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            UserPrefs userPrefs = new UserPrefs(MGMainActivity.this.context);
            userPrefs.setFbaAdGamesConfig(str, MGMainActivity.this.accountBean.getUid() + "", i4 + 1, i5 + 1);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.h hVar = mGMainActivity.gdtAdVideo;
            com.join.mgps.ad.d.i(mGMainActivity, 9);
            super.b(z4);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            MGMainActivity.this.sendVideoAdWatchLog(1, 2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34587p);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.h hVar = mGMainActivity.gdtAdVideo;
            com.join.mgps.ad.d.i(mGMainActivity, 9);
        }
    }

    /* loaded from: classes4.dex */
    class m0 implements Runnable {
        m0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MApplication.E1 = false;
            MGMainActivity mGMainActivity = MGMainActivity.this;
            if (mGMainActivity.isTourist(mGMainActivity.context)) {
                MGMainActivity mGMainActivity2 = MGMainActivity.this;
                if (mGMainActivity2.mHandler == null) {
                    mGMainActivity2.mHandler = new Handler();
                }
                MGMainActivity mGMainActivity3 = MGMainActivity.this;
                mGMainActivity3.mHandler.post(mGMainActivity3.preloginRunnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n extends com.join.mgps.ad.l {

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f34590s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34590s = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            UserPrefs userPrefs = new UserPrefs(MGMainActivity.this.context);
            userPrefs.setFbaAdGamesConfig(str, MGMainActivity.this.accountBean.getUid() + "", i4 + 1, i5 + 1);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.l lVar = mGMainActivity.groMAdVideo;
            com.join.mgps.ad.d.i(mGMainActivity, 9);
            super.b(z4);
            l(Event.Stopad_GromoreSdk_Videoloading.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            MGMainActivity.this.sendVideoAdWatchLog(1, 2);
            l(Event.Stopad_GromoreSdk_VideoShow.name(), this.f39682f);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34590s);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.l lVar = mGMainActivity.groMAdVideo;
            com.join.mgps.ad.d.i(mGMainActivity, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n0 implements Callback<AccountResultMainBean<LoginMethodResultData>> {
        n0() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<AccountResultMainBean<LoginMethodResultData>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<AccountResultMainBean<LoginMethodResultData>> call, Response<AccountResultMainBean<LoginMethodResultData>> response) {
            AccountResultMainBean<LoginMethodResultData> body = response.body();
            if (body == null || body.getError() != 0 || body.getData() == null) {
                return;
            }
            MGMainActivity.this.prefDef.availableLoginMethod().g(JsonMapper.toJsonString(body.getData().getLoginMethods()));
            MGMainActivity.this.hasGetAvailableLoginMethods = true;
            MGMainActivity.this.goToOnekeyLogin();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o extends com.join.mgps.ad.s {

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ boolean f34593r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34593r = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void a(String str, int i4, int i5) {
            super.a(str, i4, i5);
            UserPrefs userPrefs = new UserPrefs(MGMainActivity.this.context);
            userPrefs.setFbaAdGamesConfig(str, MGMainActivity.this.accountBean.getUid() + "", i4 + 1, i5 + 1);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.s sVar = mGMainActivity.reAdVideo;
            com.join.mgps.ad.d.i(mGMainActivity, 9);
            super.b(z4);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            MGMainActivity.this.sendVideoAdWatchLog(1, 2);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34593r);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.s sVar = mGMainActivity.reAdVideo;
            com.join.mgps.ad.d.i(mGMainActivity, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o0 implements Runnable {
        o0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity.this.queryDownTask();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p extends com.join.mgps.ad.z {

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f34596s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34596s = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void d(String str, int i4, int i5, Map<String, Object> map) {
            super.d(str, i4, i5, map);
            UserPrefs userPrefs = new UserPrefs(MGMainActivity.this.context);
            userPrefs.setGoldFingerAdGamesConfig(str, MGMainActivity.this.accountBean.getUid() + "", i4 + 1, i5 + 1);
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.z zVar = mGMainActivity.ttGoldAdVideo;
            com.join.mgps.ad.d.j(mGMainActivity.context, 1007, map);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34596s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p0 implements Runnable {

        /* loaded from: classes4.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MGMainActivity.this.shortcutGameId = "";
            }
        }

        p0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadTask F = p1.f.K().F(MGMainActivity.this.shortcutGameId);
            if (F != null) {
                UtilsMy.W3(MGMainActivity.this.context, F, "");
                new Handler().postDelayed(new a(), 1500L);
                return;
            }
            MGMainActivity.this.isNotThisGame = true;
            MGMainActivity.this.positionNum = 2;
            MGMainActivity mGMainActivity = MGMainActivity.this;
            mGMainActivity.setTabSelect(mGMainActivity.positionNum);
            MGMainActivity.this.showToast("游戏不存在，请重新下载。");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q extends com.join.mgps.ad.h {

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ boolean f34600p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34600p = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void d(String str, int i4, int i5, Map<String, Object> map) {
            super.d(str, i4, i5, map);
            UserPrefs userPrefs = new UserPrefs(MGMainActivity.this.context);
            userPrefs.setGoldFingerAdGamesConfig(str, MGMainActivity.this.accountBean.getUid() + "", i4 + 1, i5 + 1);
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.h hVar = mGMainActivity.gdtGoldAdVideo;
            com.join.mgps.ad.d.j(mGMainActivity.context, 1007, map);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34600p);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q0 implements Runnable {
        q0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (MGMainActivity.this.jPushIntentData.getType().equals("1")) {
                    if (MGMainActivity.this.jPushIntentData.getJumpInfo() == null || MGMainActivity.this.jPushIntentData.getJumpInfo().getSub() == null || MGMainActivity.this.jPushIntentData.getJumpInfo().getSub().size() <= 0) {
                        MessageMainActivity_.k0(MGMainActivity.this.context).d(true).a(0).start();
                    } else {
                        MessageMainActivity_.k0(MGMainActivity.this.context).d(true).a(0).b(MGMainActivity.this.jPushIntentData.getJumpInfo().getSub().get(0).getIntentDataBean()).start();
                    }
                } else if (MGMainActivity.this.jPushIntentData.getType().equals("2")) {
                    if (MGMainActivity.this.jPushIntentData.getSubType().equals("1")) {
                        MessageMainActivity_.k0(MGMainActivity.this.context).d(true).a(1).c(true).start();
                    } else if (MGMainActivity.this.jPushIntentData.getSubType().equals("2")) {
                        MessageMainActivity_.k0(MGMainActivity.this.context).d(true).a(1).c(false).start();
                    }
                } else if (MGMainActivity.this.jPushIntentData.getType().equals("3")) {
                    if (MGMainActivity.this.jPushIntentData.getSubType().equals("1")) {
                        MessageMainActivity_.k0(MGMainActivity.this.context).d(true).a(2).c(true).start();
                    } else if (MGMainActivity.this.jPushIntentData.getSubType().equals("2")) {
                        MessageMainActivity_.k0(MGMainActivity.this.context).d(true).a(2).c(false).start();
                    }
                }
                MGMainActivity.this.hideRedPoint();
            } catch (Exception e5) {
                e5.getMessage();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MGMainActivity.this.adVipMainDialog == null || com.join.mgps.Util.g2.h(MGMainActivity.this.adVipMainDialog.e())) {
                return;
            }
            Intent intent = new Intent("com.tools.AdBroadcast");
            intent.putExtra("action", 3);
            intent.putExtra("url", MGMainActivity.this.adVipMainDialog.e());
            MGMainActivity.this.sendBroadcast(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r0 implements Runnable {
        r0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity.this.preloadingAD();
            MGMainActivity.this.receiver = new v0(MGMainActivity.this, null);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(BootReceiver_.f53989f);
            MGMainActivity mGMainActivity = MGMainActivity.this;
            mGMainActivity.registerReceiver(mGMainActivity.receiver, intentFilter);
            MGMainActivity.this.initAdBroadcast();
            com.join.mgps.Util.u2.a(MGMainActivity.this.context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MGMainActivity.this.adVipMainDialog == null || com.join.mgps.Util.g2.h(MGMainActivity.this.adVipMainDialog.f())) {
                return;
            }
            Intent intent = new Intent("com.tools.AdBroadcast");
            intent.putExtra("action", 4);
            intent.putExtra("url", MGMainActivity.this.adVipMainDialog.f());
            MGMainActivity.this.sendBroadcast(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s0 implements GameRoomActivity.x {
        s0() {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!com.join.android.app.common.utils.j.j(MGMainActivity.this.context)) {
                MGMainActivity.this.allJsonStr = "";
                MGMainActivity.this.showToast("请联网后重试！");
                return;
            }
            MGMainActivity.this.adVipMainDialog.dismiss();
            MGMainActivity.this.adVipMainDialog = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t0 extends com.facebook.imagepipeline.datasource.b {
        t0() {
        }

        @Override // com.facebook.datasource.b
        public void e(com.facebook.datasource.c<com.facebook.common.references.a<com.facebook.imagepipeline.image.c>> cVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFailureImpl():");
            sb.append(cVar.toString());
        }

        @Override // com.facebook.imagepipeline.datasource.b
        public void g(Bitmap bitmap) {
            MApplication.X = bitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u implements o2.g {
        u() {
        }

        @Override // com.join.mgps.dialog.o2.g
        public void a() {
            if (ContextCompat.checkSelfPermission(MGMainActivity.this.context, com.kuaishou.weapon.p0.g.f55583c) == 0) {
                com.papa.sim.statistic.pref.b.k(MGMainActivity.this.context).F(true);
            }
            com.join.mgps.Util.v.e(MGMainActivity.this.context);
            MGMainActivity.this.prefDef.lastApplyReadPhonePermission().g(Long.valueOf(System.currentTimeMillis()));
            MGMainActivity.this.prefDef.lastApplyReadPhonePermissionOnRecom().g(Long.valueOf(System.currentTimeMillis()));
            MGMainActivity.this.prefDef.firstShowUserPermiss().g(Boolean.FALSE);
            com.papa.sim.statistic.pref.b.k(MGMainActivity.this.context).L(false);
            MGMainActivity.this.dialogBack.setVisibility(8);
            MGMainActivity.this.initOM(MApplication.f1497x);
            MGMainActivity.this.initApplicationData();
            MGMainActivity.this.initApplicationV2();
            MobSDK.submitPolicyGrantResult(true, (OperationCallback<Void>) null);
            MGMainActivity.this.getRootUrl();
            MGMainActivity.this.preLogin(true);
            MGMainActivity.this.afterViewsInitData(true);
            MGMainActivity.this.resume();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u0 extends BroadcastReceiver {
        u0() {
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x02ae  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x02f7  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x03c0  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x0496  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x026a  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onReceive(android.content.Context r26, android.content.Intent r27) {
            /*
                Method dump skipped, instructions count: 1553
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGMainActivity.u0.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* loaded from: classes4.dex */
    class v implements VideoStrategyPop.VideoPopListener {
        v() {
        }

        @Override // com.papa91.VideoStrategyPop.VideoPopListener
        public void onClose() {
            MGMainActivity.this.toStartGame();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class v0 extends BroadcastReceiver {
        private v0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !BootReceiver_.f53989f.equals(intent.getAction())) {
                return;
            }
            try {
                long longExtra = intent.getLongExtra("extra_download_id", -1L);
                DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
                String mimeTypeForDownloadedFile = downloadManager.getMimeTypeForDownloadedFile(longExtra);
                String s4 = com.join.mgps.Util.h0.s(context, downloadManager.getUriForDownloadedFile(longExtra));
                String substring = s4.substring(s4.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
                File file = new File(s4);
                if (file.exists() && substring.startsWith("temp_")) {
                    substring.replace("temp_", "");
                    File file2 = new File(s4.replace("temp_", ""));
                    if (file2.exists()) {
                        file2.delete();
                    }
                    file.renameTo(new File(s4.replace("temp_", "")));
                }
                if ((mimeTypeForDownloadedFile.equals("application/zip") || s4.endsWith("zip")) && com.join.mgps.pref.h.n(context).f()) {
                    org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.t(1));
                }
            } catch (Exception unused) {
            }
        }

        /* synthetic */ v0(MGMainActivity mGMainActivity, j jVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    class w implements PopupWindow.OnDismissListener {
        w() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            MGMainActivity.this.videoStrategyPop.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    public interface w0 extends Runnable {
        w0 W(boolean z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class x implements Runnable {
        x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MGMainActivity.this.shortcutGameId = "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class y extends com.join.mgps.ad.z {

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f34615s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34615s = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void c(String str) {
            super.c(str);
            if (!TextUtils.isEmpty(str)) {
                DownloadTask F = p1.f.K().F(str);
                if (F != null && F.getStatus() == 11) {
                    UtilsMy.a4(F, MGMainActivity.this);
                }
                MGMainActivity mGMainActivity = MGMainActivity.this;
                com.join.mgps.ad.z zVar = mGMainActivity.ttDownLoadSpeedAd;
                com.join.mgps.ad.d.k(mGMainActivity, 21, str);
            }
            MGMainActivity.this.delayChangeAdshow();
            MGMainActivity mGMainActivity2 = MGMainActivity.this;
            mGMainActivity2.delayLoadRewardAd(mGMainActivity2.ttDownLoadSpeedAd);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            MGMainActivity.this.sendVideoAdWatchLog(3, 1);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34615s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class z extends com.join.mgps.ad.z {

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ boolean f34617s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(Context context, String str, String str2, boolean z4) {
            super(context, str, str2);
            this.f34617s = z4;
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClose() {
            super.onADClose();
            MGMainActivity mGMainActivity = MGMainActivity.this;
            com.join.mgps.ad.z zVar = mGMainActivity.ttPspAd;
            com.join.mgps.ad.d.i(mGMainActivity, 18);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADShow() {
            super.onADShow();
            MGMainActivity.this.sendVideoAdWatchLog(2, 1);
        }

        @Override // com.join.mgps.ad.d, com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onInitSuccess() {
            super.onInitSuccess();
            h(this.f34617s);
        }
    }

    static /* synthetic */ int access$2610(MGMainActivity mGMainActivity) {
        int i4 = mGMainActivity.preloginQueenCount;
        mGMainActivity.preloginQueenCount = i4 - 1;
        return i4;
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void changeText() {
        List<String> k4 = com.join.mgps.Util.h0.k(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath());
        this.listZip = k4;
        if (k4 != null && k4.size() != 0) {
            com.join.android.app.common.dialog.k kVar = this.localGameTwoDialog;
            kVar.d("共找到" + this.listZip.size() + "个zip文件");
            this.localGameTwoDialog.c();
            return;
        }
        com.join.android.app.common.dialog.k kVar2 = this.localGameTwoDialog;
        if (kVar2 != null) {
            kVar2.d("未找到游戏");
        }
        this.localGameTwoDialog.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkAndShowUninstallDialog(java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r10) {
        /*
            r9 = this;
            com.join.mgps.pref.PrefDef_ r0 = r9.prefDef
            org.androidannotations.api.sharedpreferences.k r0 = r0.installApplastNoticeTime()
            java.lang.Object r0 = r0.d()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            java.util.Iterator r2 = r10.iterator()
        L14:
            boolean r3 = r2.hasNext()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()
            com.github.snowdream.android.app.downloader.DownloadTask r3 = (com.github.snowdream.android.app.downloader.DownloadTask) r3
            long r6 = r3.getFinishTime()
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 > 0) goto L38
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L38
            int r3 = r3.getStatus()
            r6 = 11
            if (r3 != r6) goto L14
        L38:
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            boolean r1 = r9.activityHasDes
            if (r1 != 0) goto L78
            if (r0 == 0) goto L78
            int r0 = r10.size()
            if (r0 <= 0) goto L78
            com.join.mgps.activity.z0 r0 = new java.util.Comparator() { // from class: com.join.mgps.activity.z0
                static {
                    /*
                        com.join.mgps.activity.z0 r0 = new com.join.mgps.activity.z0
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.join.mgps.activity.z0) com.join.mgps.activity.z0.b com.join.mgps.activity.z0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.z0.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.z0.<init>():void");
                }

                @Override // java.util.Comparator
                public final int compare(java.lang.Object r1, java.lang.Object r2) {
                    /*
                        r0 = this;
                        com.github.snowdream.android.app.downloader.DownloadTask r1 = (com.github.snowdream.android.app.downloader.DownloadTask) r1
                        com.github.snowdream.android.app.downloader.DownloadTask r2 = (com.github.snowdream.android.app.downloader.DownloadTask) r2
                        int r1 = com.join.mgps.activity.MGMainActivity.o0(r1, r2)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.z0.compare(java.lang.Object, java.lang.Object):int");
                }
            }
            java.util.Collections.sort(r10, r0)
            com.join.mgps.pref.PrefDef_ r0 = r9.prefDef
            org.androidannotations.api.sharedpreferences.k r0 = r0.lastShowNotInstallTime()
            java.lang.Object r0 = r0.d()
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            boolean r0 = com.join.mgps.Util.y.u(r0)
            if (r0 != 0) goto L78
            r9.showInstallAppDialogActivity(r5, r10)
            com.join.mgps.pref.PrefDef_ r10 = r9.prefDef
            org.androidannotations.api.sharedpreferences.k r10 = r10.lastShowNotInstallTime()
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.g(r0)
            r9.showInstallNoticeOrappDialog = r4
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGMainActivity.checkAndShowUninstallDialog(java.util.List):void");
    }

    private void checkPlatformVersion() {
        SharedPreferences sharedPreferences = getSharedPreferences("VersionXML", 0);
        try {
            VersionDto versionDto = (VersionDto) com.papa.sim.statistic.JsonMapper.e().fromJson(sharedPreferences.getString("VersionDto", ""), VersionDto.class);
            boolean z4 = sharedPreferences.getBoolean("Mandatory", false);
            if (versionDto != null) {
                String[] A = com.join.android.app.common.utils.n.n(this).A();
                if (Integer.parseInt(A[0]) < versionDto.getVersionNo()) {
                    showVersionDownLoadHint(versionDto, z4);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void clearSelection() {
        this.home_tab_monkey_layout.setVisibility(8);
        this.home_tab_default_layout.setVisibility(0);
        this.mg_recom_image.setImageResource(R.drawable.mg_choice_selectback_normal);
        this.mg_recom_text.setTextColor(MainAppInfoColorMain);
        this.mg_category_image.setImageResource(R.drawable.tab_usercenter_normal);
        this.mg_category_text.setTextColor(MainAppInfoColorMain);
        this.mg_chart_text.setTextColor(MainAppInfoColorMain);
        this.mg_emulator_image.setImageResource(R.drawable.mg_shop_selectback_normal);
        this.mg_emulator_text.setTextColor(MainAppInfoColorMain);
        this.unreadMessageBadge.setVisibility(8);
        this.mg_emulator_text.setText("首页");
        ObjectAnimator objectAnimator = this.animation2;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.mg_emulator_image.animate().rotation(0.0f).setDuration(50L).start();
        }
        this.fightImage.setImageResource(R.drawable.mg_discovery_selectback_normal);
        this.fightText.setTextColor(MainAppInfoColorMain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadLayout() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
        this.scroll_text_layout.p();
        this.imageLoading.setVisibility(8);
        this.prefDef.isNewFinishedGame().g(Boolean.FALSE);
        this.hasNewFinishedGameImage.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PlayCfgBean getAdConfig(List<PlayCfgBean> list, int i4) {
        if (list != null) {
            for (PlayCfgBean playCfgBean : list) {
                if (playCfgBean.getSdk_type() == i4) {
                    return playCfgBean;
                }
            }
        }
        return null;
    }

    private void getArenaPluginInfo() {
        ResultMainBean<List<ApkVersionbean>> resultMainBean;
        ResultMainBean<List<ApkVersionbean>> resultMainBean2;
        ResultMainBean<List<ApkVersionbean>> C1;
        EMUApkArenaTable eMUApkArenaTable;
        if (!com.join.android.app.common.utils.j.j(this)) {
            return;
        }
        try {
            C1 = this.recommendClient.C1(RequestBeanUtil.getInstance(this).getApkVersion(2, 2, 0));
            if (C1 != null) {
                try {
                    try {
                        if (C1.getFlag() == 1) {
                            for (ApkVersionbean apkVersionbean : C1.getMessages().getData()) {
                                DownloadTask F = p1.f.K().F(apkVersionbean.getTag_id());
                                HashMap hashMap = new HashMap();
                                hashMap.put("tag_id", apkVersionbean.getTag_id());
                                List<EMUApkArenaTable> h4 = b2.o.o().h(hashMap);
                                if (h4 != null && h4.size() > 0) {
                                    if (h4.size() > 1) {
                                        for (int i4 = 0; i4 < h4.size(); i4++) {
                                            b2.o.o().delete((b2.o) h4.get(i4));
                                        }
                                    }
                                    try {
                                        eMUApkArenaTable = h4.get(0);
                                    } catch (Exception e5) {
                                        e = e5;
                                        eMUApkArenaTable = null;
                                    }
                                    try {
                                        eMUApkArenaTable.setApk_name(apkVersionbean.getApk_name());
                                        eMUApkArenaTable.setDown_url(apkVersionbean.getDown_url());
                                        eMUApkArenaTable.setLaunch_name(apkVersionbean.getLaunch_name());
                                        eMUApkArenaTable.setLogo(apkVersionbean.getLogo());
                                        eMUApkArenaTable.setPackage_name(apkVersionbean.getPackage_name());
                                        eMUApkArenaTable.setRelease_date(apkVersionbean.getRelease_date());
                                        eMUApkArenaTable.setSize(apkVersionbean.getSize());
                                        eMUApkArenaTable.setTag_id(apkVersionbean.getTag_id());
                                        eMUApkArenaTable.setTeam_info(apkVersionbean.getTeam_info());
                                        eMUApkArenaTable.setVer(apkVersionbean.getVer());
                                        eMUApkArenaTable.setVer_compatible(apkVersionbean.getVer_compatible());
                                        eMUApkArenaTable.setVer_info(apkVersionbean.getVer_info());
                                        eMUApkArenaTable.setDown_type(apkVersionbean.getDown_type());
                                        eMUApkArenaTable.setRemark(JsonMapper.toJsonString(apkVersionbean.getPlugin_md5()));
                                        if (F != null && F.getFileType() != null && F.getFileType().equals(Dtype.chajian.name()) && F.getDown_type() == 2 && eMUApkArenaTable.getDown_type() == 2 && TextUtils.isEmpty(eMUApkArenaTable.getApkPath())) {
                                            eMUApkArenaTable.setApkPath(com.join.android.app.common.utils.l.h(F.getPlugin_num(), new File(F.getGameZipPath())));
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        e.printStackTrace();
                                        b2.o.o().update(eMUApkArenaTable);
                                        com.join.android.app.common.utils.l.E(eMUApkArenaTable);
                                    }
                                    b2.o.o().update(eMUApkArenaTable);
                                    com.join.android.app.common.utils.l.E(eMUApkArenaTable);
                                } else {
                                    EMUApkArenaTable eMUApkArenaTable2 = new EMUApkArenaTable();
                                    eMUApkArenaTable2.setApk_name(apkVersionbean.getApk_name());
                                    eMUApkArenaTable2.setDown_url(apkVersionbean.getDown_url());
                                    eMUApkArenaTable2.setLaunch_name(apkVersionbean.getLaunch_name());
                                    eMUApkArenaTable2.setLogo(apkVersionbean.getLogo());
                                    eMUApkArenaTable2.setPackage_name(apkVersionbean.getPackage_name());
                                    eMUApkArenaTable2.setRelease_date(apkVersionbean.getRelease_date());
                                    eMUApkArenaTable2.setSize(apkVersionbean.getSize());
                                    eMUApkArenaTable2.setTag_id(apkVersionbean.getTag_id());
                                    eMUApkArenaTable2.setTeam_info(apkVersionbean.getTeam_info());
                                    eMUApkArenaTable2.setVer(apkVersionbean.getVer());
                                    eMUApkArenaTable2.setVer_compatible(apkVersionbean.getVer_compatible());
                                    eMUApkArenaTable2.setVer_info(apkVersionbean.getVer_info());
                                    eMUApkArenaTable2.setDown_type(apkVersionbean.getDown_type());
                                    eMUApkArenaTable2.setRemark(JsonMapper.toJsonString(apkVersionbean.getPlugin_md5()));
                                    if (F != null && F.getFileType() != null && F.getFileType().equals(Dtype.chajian.name()) && F.getDown_type() == 2 && eMUApkArenaTable2.getDown_type() == 2 && TextUtils.isEmpty(eMUApkArenaTable2.getApkPath())) {
                                        eMUApkArenaTable2.setApkPath(com.join.android.app.common.utils.l.h(F.getPlugin_num(), new File(F.getGameZipPath())));
                                    }
                                    b2.o.o().k(eMUApkArenaTable2);
                                    com.join.android.app.common.utils.l.E(eMUApkArenaTable2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        resultMainBean = C1;
                        if (resultMainBean == null && this.reloadNumber > 0) {
                            com.join.mgps.Util.v0.d("getEMUVersionForArena", "failed  " + this.recomDatabean);
                            this.reloadNumber = this.reloadNumber - 1;
                            try {
                                Thread.sleep(5000L);
                                getArenaPluginInfo();
                            } catch (InterruptedException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused2) {
                    resultMainBean2 = C1;
                    if (resultMainBean2 != null || this.reloadNumber <= 0) {
                        return;
                    }
                    com.join.mgps.Util.v0.d("getEMUVersionForArena", "failed  " + this.recomDatabean);
                    this.reloadNumber = this.reloadNumber - 1;
                    try {
                        Thread.sleep(5000L);
                        getArenaPluginInfo();
                    } catch (InterruptedException unused3) {
                        return;
                    }
                }
            }
        } catch (Exception unused4) {
            resultMainBean2 = null;
        } catch (Throwable th2) {
            th = th2;
            resultMainBean = null;
        }
        if (C1 != null || this.reloadNumber <= 0) {
            return;
        }
        com.join.mgps.Util.v0.d("getEMUVersionForArena", "failed  " + this.recomDatabean);
        this.reloadNumber = this.reloadNumber - 1;
        Thread.sleep(5000L);
        getArenaPluginInfo();
    }

    private void hideFragments(FragmentTransaction fragmentTransaction) {
        PapaMainV4Fragment_ papaMainV4Fragment_ = this.mgPapaMainFragment;
        if (papaMainV4Fragment_ != null) {
            fragmentTransaction.hide(papaMainV4Fragment_);
        }
        DiscoveryFragmentV4_ discoveryFragmentV4_ = this.fightFragment;
        if (discoveryFragmentV4_ != null) {
            fragmentTransaction.hide(discoveryFragmentV4_);
        }
        MyGamePapaFragmentV2_ myGamePapaFragmentV2_ = this.mPapaActivity;
        if (myGamePapaFragmentV2_ != null) {
            fragmentTransaction.hide(myGamePapaFragmentV2_);
        }
        FindGameMainFragment findGameMainFragment = this.choiceFragment;
        if (findGameMainFragment != null) {
            fragmentTransaction.hide(findGameMainFragment);
        }
        UsercenterFragmentNew usercenterFragmentNew = this.userCenterFragment;
        if (usercenterFragmentNew != null) {
            fragmentTransaction.hide(usercenterFragmentNew);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initAdBroadcast() {
        if (this.mAdReceived == null) {
            this.mAdReceived = new u0();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.tools.AdBroadcast");
            registerReceiver(this.mAdReceived, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initApplicationV2() {
        UMConfigure.init(this, "55af129367e58e94ba0025b7", "channel_1028", 1, null);
        MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.AUTO);
        MobSDK.init(this, "563efaa5a8fe", "47378ac7ef1e9db5870c9cf62ee34a1d");
        com.join.android.app.common.utils.l.o(this);
        com.join.mgps.Util.d2.b(this);
        try {
            new MiitHelper(new f0()).getDeviceIds(this);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 530
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private void initDefaultPluginInfo() {
        /*
            Method dump skipped, instructions count: 2157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGMainActivity.initDefaultPluginInfo():void");
    }

    private void initGDTDownLoadSpeedAd(String str, boolean z4) {
        String str2;
        String str3;
        PlayCfgBean adConfig;
        DownloadSpeedupCfgBean downloadSpeedupCfgBean = (DownloadSpeedupCfgBean) JsonMapper.getInstance().fromJson(this.prefDef.downloadSpeedupCfg().d(), DownloadSpeedupCfgBean.class);
        this.downloadSpeedupCfgBean = downloadSpeedupCfgBean;
        if (downloadSpeedupCfgBean == null || (adConfig = getAdConfig(downloadSpeedupCfgBean.getPlay_cfg(), 2)) == null) {
            str2 = "";
            str3 = str2;
        } else {
            String sdk_key = adConfig.getSdk_key();
            str3 = adConfig.getAd_id();
            str2 = sdk_key;
        }
        if (this.gdtDownLoadSpeedAd == null && com.join.mgps.Util.g2.i(str2)) {
            a0 a0Var = new a0(this, str2, str3, z4);
            this.gdtDownLoadSpeedAd = a0Var;
            a0Var.n(str);
            this.gdtDownLoadSpeedAd.e();
        }
    }

    private void initGDTPspAd(boolean z4) {
        String str;
        String str2;
        PlayCfgBean adConfig;
        try {
            PspGameAdCfgBean pspGameAdCfgBean = (PspGameAdCfgBean) JsonMapper.getInstance().fromJson(this.prefDef.pspGameAdCfg().d(), PspGameAdCfgBean.class);
            this.pspGameAdCfgBean = pspGameAdCfgBean;
            if (pspGameAdCfgBean == null || (adConfig = getAdConfig(pspGameAdCfgBean.getPlay_cfg(), 2)) == null) {
                str = "";
                str2 = str;
            } else {
                String sdk_key = adConfig.getSdk_key();
                str2 = adConfig.getAd_id();
                str = sdk_key;
            }
            if (this.gdtPspAd == null && com.join.mgps.Util.g2.i(str)) {
                b0 b0Var = new b0(this, str, str2, z4);
                this.gdtPspAd = b0Var;
                b0Var.e();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void initGrMDownLoadSpeedAd(String str, boolean z4) {
        String str2;
        String str3;
        PlayCfgBean adConfig;
        DownloadSpeedupCfgBean downloadSpeedupCfgBean = (DownloadSpeedupCfgBean) JsonMapper.getInstance().fromJson(this.prefDef.downloadSpeedupCfg().d(), DownloadSpeedupCfgBean.class);
        this.downloadSpeedupCfgBean = downloadSpeedupCfgBean;
        if (downloadSpeedupCfgBean == null || (adConfig = getAdConfig(downloadSpeedupCfgBean.getPlay_cfg(), 7)) == null) {
            str2 = "";
            str3 = str2;
        } else {
            String sdk_key = adConfig.getSdk_key();
            str3 = adConfig.getAd_id();
            str2 = sdk_key;
        }
        if (this.groDownLoadSpeedAd == null && com.join.mgps.Util.g2.i(str2)) {
            e0 e0Var = new e0(this, str2, str3, z4);
            this.groDownLoadSpeedAd = e0Var;
            e0Var.n(str);
            this.groDownLoadSpeedAd.e();
        }
    }

    private void initGrMPspAd(boolean z4) {
        String str;
        String str2;
        PlayCfgBean adConfig;
        try {
            PspGameAdCfgBean pspGameAdCfgBean = (PspGameAdCfgBean) JsonMapper.getInstance().fromJson(this.prefDef.pspGameAdCfg().d(), PspGameAdCfgBean.class);
            this.pspGameAdCfgBean = pspGameAdCfgBean;
            if (pspGameAdCfgBean == null || (adConfig = getAdConfig(pspGameAdCfgBean.getPlay_cfg(), 7)) == null) {
                str = "";
                str2 = str;
            } else {
                String sdk_key = adConfig.getSdk_key();
                str2 = adConfig.getAd_id();
                str = sdk_key;
            }
            if (this.groPspAd == null && com.join.mgps.Util.g2.i(str)) {
                g0 g0Var = new g0(this, str, str2, z4);
                this.groPspAd = g0Var;
                g0Var.e();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void initREDownLoadSpeedAd(String str, boolean z4) {
        String str2;
        String str3;
        PlayCfgBean adConfig;
        DownloadSpeedupCfgBean downloadSpeedupCfgBean = (DownloadSpeedupCfgBean) JsonMapper.getInstance().fromJson(this.prefDef.downloadSpeedupCfg().d(), DownloadSpeedupCfgBean.class);
        this.downloadSpeedupCfgBean = downloadSpeedupCfgBean;
        if (downloadSpeedupCfgBean == null || (adConfig = getAdConfig(downloadSpeedupCfgBean.getPlay_cfg(), 9)) == null) {
            str2 = "";
            str3 = str2;
        } else {
            String sdk_key = adConfig.getSdk_key();
            str3 = adConfig.getAd_id();
            str2 = sdk_key;
        }
        if (this.reDownLoadSpeedAd == null && com.join.mgps.Util.g2.i(str2)) {
            c0 c0Var = new c0(this, str2, str3, z4);
            this.reDownLoadSpeedAd = c0Var;
            c0Var.n(str);
            this.reDownLoadSpeedAd.e();
        }
    }

    private void initREPspAd(boolean z4) {
        String str;
        String str2;
        PlayCfgBean adConfig;
        try {
            PspGameAdCfgBean pspGameAdCfgBean = (PspGameAdCfgBean) JsonMapper.getInstance().fromJson(this.prefDef.pspGameAdCfg().d(), PspGameAdCfgBean.class);
            this.pspGameAdCfgBean = pspGameAdCfgBean;
            if (pspGameAdCfgBean == null || (adConfig = getAdConfig(pspGameAdCfgBean.getPlay_cfg(), 9)) == null) {
                str = "";
                str2 = str;
            } else {
                String sdk_key = adConfig.getSdk_key();
                str2 = adConfig.getAd_id();
                str = sdk_key;
            }
            if (this.rePspAd == null && com.join.mgps.Util.g2.i(str)) {
                d0 d0Var = new d0(this, str, str2, z4);
                this.rePspAd = d0Var;
                d0Var.e();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void initTTDownLoadSpeedAd(String str, boolean z4) {
        String str2;
        String str3;
        PlayCfgBean adConfig;
        DownloadSpeedupCfgBean downloadSpeedupCfgBean = (DownloadSpeedupCfgBean) JsonMapper.getInstance().fromJson(this.prefDef.downloadSpeedupCfg().d(), DownloadSpeedupCfgBean.class);
        this.downloadSpeedupCfgBean = downloadSpeedupCfgBean;
        if (downloadSpeedupCfgBean == null || (adConfig = getAdConfig(downloadSpeedupCfgBean.getPlay_cfg(), 1)) == null) {
            str2 = "";
            str3 = str2;
        } else {
            String sdk_key = adConfig.getSdk_key();
            str3 = adConfig.getAd_id();
            str2 = sdk_key;
        }
        if (this.ttDownLoadSpeedAd == null && com.join.mgps.Util.g2.i(str2)) {
            y yVar = new y(this, str2, str3, z4);
            this.ttDownLoadSpeedAd = yVar;
            yVar.n(str);
            this.ttDownLoadSpeedAd.e();
        }
    }

    private void initTTPspAd(boolean z4) {
        String str;
        String str2;
        PlayCfgBean adConfig;
        try {
            PspGameAdCfgBean pspGameAdCfgBean = (PspGameAdCfgBean) JsonMapper.getInstance().fromJson(this.prefDef.pspGameAdCfg().d(), PspGameAdCfgBean.class);
            this.pspGameAdCfgBean = pspGameAdCfgBean;
            if (pspGameAdCfgBean == null || (adConfig = getAdConfig(pspGameAdCfgBean.getPlay_cfg(), 1)) == null) {
                str = "";
                str2 = str;
            } else {
                String sdk_key = adConfig.getSdk_key();
                str2 = adConfig.getAd_id();
                str = sdk_key;
            }
            if (this.ttPspAd == null && com.join.mgps.Util.g2.i(str)) {
                z zVar = new z(this, str, str2, z4);
                this.ttPspAd = zVar;
                zVar.e();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isForcedLogin(int i4) {
        return false;
    }

    private boolean isLogined(Context context) {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(context);
        return accountBean != null && com.join.mgps.Util.g2.i(accountBean.getToken());
    }

    private boolean isModMainGame(DownloadTask downloadTask) {
        ModInfoBean modInfoBean = com.join.mgps.Util.g2.i(downloadTask.getMod_info()) ? (ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class) : null;
        return modInfoBean != null && downloadTask.getCrc_link_type_val().equals(modInfoBean.getMain_game_id());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isTourist(Context context) {
        return AccountUtil_.getInstance_(context).isTourist();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$afterViewsInitData$0() {
        setTabSelect(this.positionNum);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$checkAndShowUninstallDialog$2(DownloadTask downloadTask, DownloadTask downloadTask2) {
        if (downloadTask.getFinishTime() > downloadTask2.getFinishTime()) {
            return -1;
        }
        return downloadTask.getFinishTime() < downloadTask2.getFinishTime() ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$checkInstallApp$1(DownloadTask downloadTask, DownloadTask downloadTask2) {
        if (downloadTask.getFinishTime() > downloadTask2.getFinishTime()) {
            return -1;
        }
        return downloadTask.getFinishTime() < downloadTask2.getFinishTime() ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleVideoAdWatchLogRecord$6(VideoWatchLogTable videoWatchLogTable) {
        videoAdWatchLog(videoWatchLogTable, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invite$10(View view) {
        com.wufan.friend.chat.c.u().O();
        this.invitePop.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invite$11(FriendInviteBean friendInviteBean, View view) {
        reject(friendInviteBean.getFromAccountId());
        com.wufan.friend.chat.c.u().P();
        this.invitePop.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$9() {
        SmartPopupWindow smartPopupWindow = this.invitePop;
        if (smartPopupWindow != null && smartPopupWindow.isShowing()) {
            com.wufan.friend.chat.c.u().P();
            this.invitePop.dismiss();
        }
        com.wufan.friend.chat.c.u().P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onFriendEvent$7() {
        com.wufan.friend.chat.c.u().C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFriendInviteEvent$8(boolean z4, FriendInviteBean friendInviteBean) {
        if (!z4) {
            if (com.join.android.app.common.utils.n.n(this).d(this)) {
                Intent intent = new Intent("com.join.android.app.mgsim.wufun.broadcast.showInvitePlay");
                intent.putExtra("userId", friendInviteBean.getFromAccountId() + "");
                intent.putExtra("userName", friendInviteBean.getFromNickname());
                intent.putExtra("userAvatar", friendInviteBean.getAvatar());
                intent.putExtra(CommonService_.a0.f54279g, friendInviteBean.getLobbyRoomId());
                intent.putExtra("gameId", friendInviteBean.getGameId());
                intent.putExtra("gameName", friendInviteBean.getGameName());
                intent.putExtra(UMCrash.SP_KEY_TIMESTAMP, friendInviteBean.getTimestamp());
                sendBroadcast(intent);
                return;
            } else if (com.join.android.app.common.utils.n.n(this).c(this)) {
                ((FriendInviteActivity_.e) FriendInviteActivity_.f1(this).a(friendInviteBean).flags(536870912)).start();
                return;
            } else {
                com.wufan.friend.chat.c.u().Q();
                return;
            }
        }
        ((FriendInviteActivity_.e) FriendInviteActivity_.f1(this).a(friendInviteBean).flags(536870912)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAddFriend$13(View view) {
        this.mDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showAddFriend$14(int i4, View view) {
        if (IntentUtil.getInstance().isLogined(view.getContext()) && !IntentUtil.getInstance().isTourist(view.getContext())) {
            add(i4);
            Ext ext = new Ext();
            ext.setFrom("3");
            com.papa.sim.statistic.p.l(view.getContext()).O1(Event.addFriends, ext);
            this.mDialog.dismiss();
            return;
        }
        IntentUtil.getInstance().goMyAccountLoginActivity(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showVersionDownLoadHint$3(DialogInterface dialogInterface) {
        this.showUpdate = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showupdateDialog$4(DialogInterface dialogInterface) {
        this.showUpdate = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toast$12(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    private void loadIpAddress() {
        com.papa.sim.statistic.pref.b.k(this.context).i();
        RequestModel<CfgInfoRequestArgs> requestModel = new RequestModel<>();
        requestModel.setDefault(this.context);
        CfgInfoRequestArgs cfgInfoRequestArgs = new CfgInfoRequestArgs();
        DeviceInfoBean deviceInfoBean = new DeviceInfoBean();
        try {
            deviceInfoBean.setAndroid_ver(Integer.valueOf(Build.VERSION.SDK_INT));
            deviceInfoBean.setMobile_phone_model(Build.BRAND);
            deviceInfoBean.setOs_sys(Build.VERSION.INCREMENTAL);
            if (com.join.mgps.Util.r1.B()) {
                deviceInfoBean.setUi_ver(notchtools.geek.com.notchtools.helper.c.c().a("ro.miui.ui.version.name"));
            } else if (com.join.mgps.Util.r1.n()) {
                deviceInfoBean.setUi_ver(notchtools.geek.com.notchtools.helper.c.c().a("ro.build.version.emui"));
            } else if (com.join.mgps.Util.r1.A()) {
                deviceInfoBean.setUi_ver(notchtools.geek.com.notchtools.helper.c.c().a("ro.vivo.system.product.version"));
            } else if (com.join.mgps.Util.r1.v()) {
                deviceInfoBean.setUi_ver(notchtools.geek.com.notchtools.helper.c.c().a("ro.build.version.opporom"));
            } else if (com.join.mgps.Util.r1.r()) {
                deviceInfoBean.setUi_ver(notchtools.geek.com.notchtools.helper.c.c().a("ro.flyme.version.id"));
            } else if (com.join.mgps.Util.r1.u()) {
                deviceInfoBean.setUi_ver(notchtools.geek.com.notchtools.helper.c.c().a("ro.build.version.oplusrom"));
            }
            cfgInfoRequestArgs.setUnknown_source_cfg(com.join.mgps.Util.a.e(JsonMapper.toJsonString(deviceInfoBean)));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        cfgInfoRequestArgs.setUid(AccountUtil_.getInstance_(this.context).getAccountData().getUid());
        requestModel.setArgs(cfgInfoRequestArgs);
        com.join.mgps.rpc.impl.i.D0().B0().A0(requestModel).enqueue(new b());
    }

    private void onMygameSelected() {
        try {
            new com.tbruyelle.rxpermissions2.c(this).r(com.kuaishou.weapon.p0.g.f55590j).subscribe(new f());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queryDownTask() {
        try {
            Cursor query = ((DownloadManager) getSystemService("download")).query(new DownloadManager.Query());
            if (query == null) {
                return;
            }
            while (query.moveToNext()) {
                query.getInt(query.getColumnIndexOrThrow("_id"));
                query.getString(query.getColumnIndexOrThrow("title"));
                String string = query.getString(query.getColumnIndexOrThrow("local_uri"));
                query.getString(query.getColumnIndexOrThrow("bytes_so_far"));
                query.getString(query.getColumnIndexOrThrow("total_size"));
                int i4 = query.getInt(query.getColumnIndexOrThrow("status"));
                query.getString(query.getColumnIndexOrThrow("local_filename"));
                if (i4 == 8 && !com.join.mgps.Util.g2.h(string)) {
                    String substring = string.substring(string.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
                    String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                    File file = new File(path, substring);
                    if (file.exists() && substring.startsWith("temp_")) {
                        File file2 = new File(path, substring.replace("temp_", ""));
                        if (file2.exists()) {
                            file2.delete();
                        }
                        file.renameTo(file2);
                    }
                }
            }
            query.close();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resume() {
        if (!new PrefDef_(this).firstShowUserPermiss().d().booleanValue()) {
            if (this.hasNewFinishedGameImage == null) {
                return;
            }
            if (this.prefDef.isNewFinishedGame().d().booleanValue()) {
                this.hasNewFinishedGameImage.setVisibility(0);
            } else {
                this.hasNewFinishedGameImage.setVisibility(8);
            }
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            this.accountBean = accountData;
            if (accountData.y() * 1000 > System.currentTimeMillis()) {
                if (this.mAdVipEvent != null) {
                    toStartGame();
                }
                com.join.mgps.dialog.c cVar = this.adVipMainDialog;
                if (cVar != null && cVar.isShowing()) {
                    this.adVipMainDialog.dismiss();
                    this.adVipMainDialog = null;
                }
            }
            new Handler().postDelayed(new g(), 1000L);
            touristLogin();
            isForeground = true;
            onresumData();
            com.join.mgps.Util.v0.c("MGMainActivityonResume finish time =" + System.currentTimeMillis());
            showDownNotice();
            MessageRedPointBean.MessagesBean.DataBean dataBean = MApplication.M;
            if (dataBean != null) {
                int community_praise_surplus_number = dataBean.getCommunity_praise_surplus_number() + MApplication.M.getCommunity_surplus_number() + MApplication.M.getNotice_surplus_number() + MApplication.M.getPraise_surplus_number() + MApplication.M.getReplay_surplus_number();
                MApplication.Q = community_praise_surplus_number;
                if (community_praise_surplus_number == 0) {
                    hideRedPoint();
                }
            }
            com.wufan.friend.chat.c.u().f(this);
            this.handler.postDelayed(new Runnable() { // from class: com.join.mgps.activity.g1
                @Override // java.lang.Runnable
                public final void run() {
                    MGMainActivity.this.lambda$resume$5();
                }
            }, 500L);
            if (!this.hasPermiss) {
                boolean z4 = ContextCompat.checkSelfPermission(this.context, com.kuaishou.weapon.p0.g.f55590j) == 0;
                this.hasPermiss = z4;
                if (z4) {
                    startBackups(z4);
                }
            }
        }
        startPlayVideo();
        pullUpExtHelper();
    }

    private void saveImageFromUrl(String str, Context context) {
        Fresco.getImagePipeline().i(ImageRequestBuilder.u(Uri.parse(str)).C(true).a(), context).e(new t0(), com.facebook.common.executors.a.a());
    }

    private boolean shouldGetUpdateFeature() {
        return false;
    }

    private void show10Permiss() {
        boolean createNewFile;
        if (Build.VERSION.SDK_INT <= 28 || !this.prefDef.needShowPermissdialog().d().booleanValue()) {
            return;
        }
        try {
            String g4 = com.join.mgps.pref.h.n(this).g();
            if (com.join.mgps.Util.g2.i(g4)) {
                File file = new File(g4);
                if (file.exists()) {
                    File file2 = new File(g4, "test_canwhite.txt");
                    if (file2.exists()) {
                        createNewFile = file2.delete();
                    } else {
                        createNewFile = file2.createNewFile();
                    }
                    if (createNewFile) {
                        this.prefDef.needShowPermissdialog().g(Boolean.FALSE);
                    }
                } else if (file.mkdirs()) {
                    this.prefDef.needShowPermissdialog().g(Boolean.FALSE);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void showAdVipMainDialog(String str) {
        com.join.mgps.dialog.c cVar = new com.join.mgps.dialog.c(MApplication.f1497x.getActivity(), str);
        this.adVipMainDialog = cVar;
        cVar.show();
        this.adVipMainDialog.h(new r());
        this.adVipMainDialog.i(new s());
        this.adVipMainDialog.j(new t());
    }

    private void showVideoPopWin() {
        PublicVideoCfgBean publicVideoCfgBean = MApplication.f1493p1;
        if (publicVideoCfgBean != null) {
            VideoStrategyPop videoStrategyPop = this.videoStrategyPop;
            if (videoStrategyPop == null || !videoStrategyPop.isShowing()) {
                this.prefDef.isShowVideo().g(Boolean.TRUE);
                VideoStrategyPop videoStrategyPop2 = new VideoStrategyPop(this, publicVideoCfgBean.getTimes(), publicVideoCfgBean.getUrl(), new v());
                this.videoStrategyPop = videoStrategyPop2;
                videoStrategyPop2.showAtLocation(videoStrategyPop2.getContentView(), 17, 0, 0);
                this.videoStrategyPop.setOnDismissListener(new w());
            }
        }
    }

    private void startAnimation(com.join.mgps.Util.i0 i0Var, View view, com.join.mgps.Util.n0 n0Var) {
        if (i0Var != null) {
            i0Var.a();
            view.startAnimation(i0Var);
            return;
        }
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        if (width == 0 || height == 0) {
            width = getResources().getDimensionPixelOffset(R.dimen.wdp35);
            height = width;
        }
        com.join.mgps.Util.i0 i0Var2 = new com.join.mgps.Util.i0(0.0f, 180.0f, width, height);
        i0Var2.setInterpolator(n0Var);
        i0Var2.setDuration(2000L);
        i0Var2.setFillAfter(false);
        i0Var2.setRepeatCount(-1);
        i0Var2.setAnimationListener(new h0());
        view.startAnimation(i0Var2);
        this.flipCardAnimation = i0Var2;
    }

    private void stopAlphBreathAnim() {
        com.join.mgps.Util.i0 i0Var = this.flipCardAnimation;
        if (i0Var != null) {
            i0Var.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toStartGame() {
        if (!com.join.mgps.Util.g2.h(this.allJsonStr)) {
            this.prefDef.singleGameShowDialog().g(this.allJsonStr);
            this.allJsonStr = "";
        }
        UtilsMy.U3(this.context, this.mAdVipEvent, 0);
        this.mAdVipEvent = null;
        new Handler().postDelayed(new x(), 1500L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.B})
    public void accountChange(Intent intent) {
        getRedPointData();
        preLogin(false);
    }

    void add(int i4) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            FriendReqBean friendReqBean = new FriendReqBean();
            friendReqBean.setUid(accountData.getUid());
            friendReqBean.setToken(accountData.getToken());
            friendReqBean.setRuid(i4);
            friendReqBean.setRequestInfo("嘿，交个朋友，少年~(*^▽^*)");
            com.join.mgps.rpc.impl.h.p().o().b(friendReqBean).enqueue(new j0());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void addShortCuts() {
        if (this.prefDef.hide_app_switch().d().intValue() == 0) {
            com.join.mgps.Util.w1.a(this);
        } else {
            com.join.mgps.Util.w1.f(this);
        }
    }

    void addSuccess(Boolean bool) {
        if (bool.booleanValue()) {
            toast("已发送加好友申请");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.action_login_success"})
    public void afterLogin() {
        com.wufan.friend.chat.c.u().g();
        if (!com.wufan.friend.chat.c.u().F()) {
            com.wufan.friend.chat.c.u().L(this.accountBean.getUid(), this.accountBean.getToken());
        }
        autoSendAdd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.mRpcClient = com.join.mgps.rpc.impl.d.P1();
        this.friendClient = com.join.mgps.rpc.impl.h.p();
        this.context = this;
        String d5 = this.prefDef.md5FileTag().d();
        if (com.join.mgps.Util.g2.i(d5)) {
            com.join.mgps.Util.v.f28119s = d5;
        }
        int i4 = Build.VERSION.SDK_INT;
        boolean z4 = false;
        if (i4 >= 21) {
            Window window = getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (i4 >= 19) {
            getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        boolean booleanValue = this.prefDef.firstShowUserPermiss().d().booleanValue();
        if (this.prefDef.isFirst35().d().booleanValue() && booleanValue) {
            this.dialogBack.setVisibility(0);
            new com.join.mgps.dialog.o2(this, 1, com.join.mgps.rpc.h.f54056j + com.constant.b.f9470a, new u()).show();
        } else {
            if (booleanValue) {
                initApplicationData();
                initApplicationV2();
                afterViewsInitData(true);
                MobSDK.submitPolicyGrantResult(true, (OperationCallback<Void>) null);
                resume();
            }
            getRootUrl();
            preLogin(true);
            com.papa.sim.statistic.pref.b.k(this.context).F(true);
            this.prefDef.firstShowUserPermiss().g(Boolean.FALSE);
            com.papa.sim.statistic.pref.b.k(this.context).L(false);
            MobSDK.submitPolicyGrantResult(true, (OperationCallback<Void>) null);
            afterViewsInitData(false);
        }
        if (isLogined(this.context) && !isTourist(this.context)) {
            z4 = true;
        }
        this.isLoginedWhenEnter = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x056e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void afterViewsInitData(boolean r20) {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGMainActivity.afterViewsInitData(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void autoSendAdd() {
        Dialog dialog;
        try {
            if (this.button == null || (dialog = this.mDialog) == null || !dialog.isShowing()) {
                return;
            }
            this.button.performClick();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    String backSplitData(String str) {
        try {
            String[] split = str.split("_");
            return split[0].equals(com.join.android.app.common.utils.n.n(this.context).e(this.context)) ? split[1] : "-1";
        } catch (Exception e5) {
            e5.printStackTrace();
            return "-1";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72036y})
    public void backUpGameFinish(Intent intent) {
        checkDownlodingNumber();
    }

    @Override // com.join.mgps.pref.f
    public void callHomePageNewData(Bundle bundle) {
        this.isPapaMainFragmentHasNewData = bundle.getBoolean("homeHasNewData");
        if (this.positionNum == 3) {
            refreshTabIcon();
        }
    }

    @Override // com.join.mgps.pref.f
    public void callOnlineCoupon(Bundle bundle) {
        getOnlineCouponConfig(bundle.getInt("localType"));
    }

    @Override // com.join.mgps.pref.f
    public void callbackClassify(Bundle bundle) {
        setTabSelect(1);
    }

    @Override // com.join.mgps.pref.f
    public void callbackClassifyTipsVisible(Bundle bundle) {
    }

    @Override // com.join.mgps.pref.f
    public void callbackDownloadCenterVisible(Bundle bundle) {
        this.downloadLayout.setVisibility(8);
        this.biground.setVisibility(8);
    }

    @Override // com.join.mgps.pref.f
    public void callbackForumWelcome(Bundle bundle) {
        setTabSelect(3);
    }

    @Override // com.join.mgps.pref.f
    public void callbackFunChart(Bundle bundle) {
        setTabSelect(2);
    }

    @Override // com.join.mgps.pref.f
    public void callbackHome(Bundle bundle) {
        setTabSelect(7);
    }

    @Override // com.join.mgps.pref.f
    public void callbackPlayVideo(Bundle bundle) {
    }

    @Override // com.join.mgps.pref.f
    public void callbackUnReadMessage(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.messageNum = bundle.getInt(com.join.mgps.Util.b2.F1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void checkClipBoard2() {
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
            if (clipboardManager.hasPrimaryClip()) {
                ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                if (itemAt.getText() != null) {
                    String charSequence = itemAt.getText().toString();
                    if (charSequence.length() > 5 && charSequence.charAt(0) == 'w' && charSequence.charAt(1) == 'u' && charSequence.charAt(2) == 'f' && charSequence.charAt(3) == 'a' && charSequence.charAt(4) == 'n') {
                        getDetailData(charSequence.substring(5));
                        clipboardManager.setText("");
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: checkClipboard */
    public void lambda$resume$5() {
        int l4;
        try {
            ClipboardManager clipboardManager = (ClipboardManager) getSystemService("clipboard");
            if (clipboardManager.hasPrimaryClip()) {
                ClipData.Item itemAt = clipboardManager.getPrimaryClip().getItemAt(0);
                if (itemAt.getText() == null || (l4 = com.wufan.friend.chat.c.u().l(itemAt.getText().toString())) == 0) {
                    return;
                }
                showAddFriend(l4);
                clipboardManager.setText("");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void checkDownlodingNumber() {
        this.num = p1.f.K().S();
        this.f34542n = p1.f.K().W(this);
        updateLine(p1.f.K().a0());
        int i4 = this.num;
        if (i4 != 0) {
            updateDownloadingPoint(i4);
        } else if (this.f34542n != 0) {
            updateNoOpenPoint();
        } else {
            updateHidePoint();
        }
    }

    protected boolean checkGameIsInstall(String str) {
        this.hasRom = false;
        this.hasPlug = false;
        DownloadTask F = p1.f.K().F(str);
        if (F != null && F.getStatus() == 5) {
            this.hasRom = true;
            EMUApkTable n4 = b2.o.o().n(F.getPlugin_num());
            if (n4 != null) {
                if (com.join.android.app.common.utils.l.t(this, n4, false, new String[0]) && !UtilsMy.B0(this, n4)) {
                    this.hasPlug = true;
                } else {
                    this.hasPlug = false;
                }
            } else {
                this.hasPlug = true;
            }
        } else {
            this.hasRom = false;
        }
        return this.hasPlug && this.hasRom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034 A[Catch: Exception -> 0x0104, TryCatch #0 {Exception -> 0x0104, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0011, B:8:0x001e, B:10:0x0024, B:11:0x002e, B:13:0x0034, B:15:0x0048, B:17:0x0056, B:19:0x0064, B:24:0x007f, B:26:0x008d, B:28:0x009b, B:30:0x00a1, B:32:0x00a5, B:33:0x00b4, B:34:0x00b7, B:35:0x00ba, B:37:0x00be, B:39:0x00cd, B:41:0x00d3, B:43:0x00e9, B:45:0x00ed, B:46:0x0101), top: B:57:0x0001 }] */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void checkInstallApp() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGMainActivity.checkInstallApp():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1200)
    public void checkPlugNeedUpdate() {
        try {
            for (DownloadTask downloadTask : p1.f.K().d()) {
                if (downloadTask.getFileType().equals(Dtype.chajian.name()) && downloadTask.getStatus() == 9) {
                    return;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void checkPurchasedList() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 1500)
    public void checkQuark() {
        long j4;
        if (this.prefDef.isQuarkEnable().d().booleanValue()) {
            long j5 = 0;
            boolean z4 = false;
            try {
                PackageInfo packageInfo = getApplicationContext().getPackageManager().getPackageInfo(getPackageName(), 0);
                long j6 = packageInfo.firstInstallTime;
                j4 = packageInfo.lastUpdateTime;
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                j4 = 0;
            }
            try {
                j5 = getApplicationContext().getPackageManager().getPackageInfo(com.join.mgps.Util.q1.f27991b, 0).firstInstallTime;
                z4 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (z4 && j4 > j5) {
                this.prefDef.isQuarkEnable().g(Boolean.FALSE);
                return;
            }
            scanQuarkTask();
            if (com.join.android.app.common.utils.e.l0(this).J(this) || !this.prefDef.isQuarkSilentDownload().d().booleanValue()) {
                return;
            }
            ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this).extra("action", "downloadQuark")).extra(NotificationCompat.GROUP_KEY_SILENT, this.prefDef.isQuarkSilentDownload().d())).extra("isOm", com.join.mgps.va.overmind.d.o().O())).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void checkRealName() {
        if (com.join.mgps.Util.y.u(this.prefDef.lastRealNameCheckTime().d().longValue())) {
            return;
        }
        this.prefDef.lastRealNameCheckTime().g(Long.valueOf(System.currentTimeMillis()));
        UtilsMy.z0(this.context, 5, "", "ANDROID_SINGLE", new s0());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void checkSNKGame() {
        if (com.join.android.app.common.utils.j.j(this.context)) {
            List<String> list = this.snkGameList;
            if (list != null && list.size() != 0) {
                try {
                    this.listTempZip.clear();
                    String str = "";
                    for (int i4 = 0; i4 < this.listZip.size(); i4++) {
                        String d5 = com.join.mgps.Util.x0.d(this.listZip.get(i4) + "wufan2019");
                        int i5 = 0;
                        while (true) {
                            if (i5 >= this.snkGameList.size()) {
                                break;
                            } else if (d5.equals(this.snkGameList.get(i5))) {
                                this.listTempZip.add(this.listZip.get(i4));
                                str = str.equals("") ? d5 : str + "," + d5;
                            } else {
                                i5++;
                            }
                        }
                    }
                    if (str.equals("")) {
                        showCheckData(null);
                        return;
                    }
                    ResultMainBean<List<CollectionBeanSub>> A1 = this.mRpcClient.A1(RequestBeanUtil.getInstance(this.context).getSNKGameCheckRequestBean(str));
                    if (A1 != null) {
                        showCheckData(A1.getMessages().getData());
                        return;
                    }
                    return;
                } catch (Exception e5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("e:");
                    sb.append(e5.getMessage());
                    return;
                }
            }
            this.localGameTwoDialog.d("未检测出游戏！");
            this.localGameTwoDialog.b();
            return;
        }
        this.localGameTwoDialog.d("网络链接失败，未检测出游戏！");
        this.localGameTwoDialog.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void checkShowOldUserRecom(boolean z4) {
        if (!z4 && !this.prefDef.firstShowUserPermiss().d().booleanValue()) {
            long longValue = this.prefDef.userLastStartAPP().d().longValue();
            long a5 = com.join.mgps.Util.y.a(longValue, System.currentTimeMillis());
            this.prefDef.userLastStartAPP().g(Long.valueOf(System.currentTimeMillis()));
            if (longValue != 0 && !com.join.mgps.Util.y.u(longValue)) {
                startIntentOldUserRecom(a5);
                return;
            }
        }
        if (this.hasShowAd) {
            return;
        }
        showAdM();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void checkToken() {
        try {
            if (this.rpcAccountClientV2 == null) {
                this.rpcAccountClientV2 = com.join.mgps.rpc.impl.b.k();
            }
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
            if (accountData == null || accountData.n2() == 2) {
                return;
            }
            k.b k32 = com.wufan.user.service.protobuf.k.k3();
            k32.e3(this.accountBean.getUid());
            k32.c3(this.accountBean.getToken());
            k32.Y2(b3.b.a(this));
            HashMap hashMap = new HashMap();
            hashMap.put("uid", k32.getUid() + "");
            hashMap.put("token", k32.getToken());
            hashMap.put("appVersion", k32.getAppVersion());
            k32.a3(com.join.mgps.Util.x1.d(hashMap));
            com.wufan.user.service.protobuf.n i4 = this.rpcAccountClientV2.i(k32.build());
            if (i4 == null || i4.getError() != 701) {
                return;
            }
            showMessage(getString(R.string.pay_token_fail));
            AccountUtil_.getInstance_(getApplicationContext()).accountLoginOut(this);
            touristLogin();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void clearOldCache(PopupAdBean popupAdBean) {
        File[] listFiles;
        String pic_remote;
        if (popupAdBean == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (popupAdBean.getBig_pic() != null && popupAdBean.getBig_pic().size() > 0) {
            int size = popupAdBean.getBig_pic().size();
            for (int i4 = 0; i4 < size; i4++) {
                RecomDatabean recomDatabean = popupAdBean.getBig_pic().get(i4);
                if (recomDatabean.getMain() != null && com.join.mgps.Util.g2.i(recomDatabean.getMain().getPic_remote())) {
                    if (com.join.mgps.Util.g2.i(recomDatabean.getMain().getPic_remote())) {
                        arrayList.add(com.join.mgps.Util.v.b(this.context) + com.join.mgps.Util.h0.o(pic_remote));
                    }
                }
            }
        }
        File b5 = com.join.mgps.Util.v.b(this.context);
        if (b5 != null && b5.exists() && b5.isDirectory()) {
            for (File file : b5.listFiles()) {
                if (file.isFile()) {
                    if (!arrayList.contains(file + "")) {
                        UtilsMy.delete(file);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 2000)
    public void delayChangeAdshow() {
        this.prefDef.lastShowTOUTIAOAd().g("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 300)
    public void delayLoadRewardAd(com.join.mgps.ad.d dVar) {
        if (dVar != null) {
            dVar.h(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 3000)
    public void delaydown(DownloadTask downloadTask) {
        downloadTask.setPath("");
        downloadTask.setId(0);
        com.php25.PDownload.d.c(downloadTask, this.context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72011l0})
    public void downloadPermissGet(Intent intent) {
        startBackups(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72009k0})
    public void downloaddelay(Intent intent) {
        delaydown((DownloadTask) JsonMapper.getInstance().fromJson(intent.getStringExtra("downloadTastJson"), DownloadTask.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f71997e0})
    public void emuOnResume(@Receiver.Extra String str) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName()) || isRunService(this, CommonService_.class.getName())) {
            return;
        }
        updateHistory();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void fightSelect() {
        setTabSelect(4);
        showDownNotice();
    }

    public void full(boolean z4) {
        if (z4) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 1024;
            getWindow().setAttributes(attributes);
            getWindow().addFlags(512);
            return;
        }
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.flags &= -1025;
        getWindow().setAttributes(attributes2);
        getWindow().clearFlags(512);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getAvailableLoginMethods() {
        if (com.join.android.app.common.utils.j.j(this.context)) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.context).getAccountData();
            String account = accountData == null ? null : accountData.getAccount();
            com.join.mgps.rpc.impl.j.b().a().e(PackageUtil.getAppVersionCode(this.context) + "_" + PackageUtil.getAppVersionName(this.context), account).enqueue(new n0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 1500)
    public void getBootPageData() {
        List<BootPageData> data;
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ResultMainBean<List<BootPageData>> C = this.rpcClient.C(RequestBeanUtil.getInstance(this).getBootPageData(new BootPageRequestArgs(Build.MODEL, Build.VERSION.RELEASE, Build.BRAND)));
                if (C == null || C.getFlag() != 1 || (data = C.getMessages().getData()) == null || data.size() <= 0) {
                    return;
                }
                preLoadBootImage(data.get(0));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public int getClassifyPrimaryIndex() {
        return this.classifyPrimaryIndex;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 1000)
    public void getData(boolean z4) {
        setJPushJump();
        getdownloadTask();
        getEMUVersion();
        loadIpAddress();
        getAvailableLoginMethods();
        getEndGameConfig();
        setDefutDownloadPath();
        if (System.currentTimeMillis() - this.prefDef.isFirstRunApkBackupLong().e(0L).longValue() > 86400000 || this.isfirst35) {
            boolean z5 = ContextCompat.checkSelfPermission(this.context, com.kuaishou.weapon.p0.g.f55590j) == 0;
            this.hasPermiss = z5;
            startBackups(z5);
            getHaveGameList();
        }
        if (com.join.mgps.Util.g2.h(this.prefDef.insatllAppFirstData().d())) {
            getBootPageData();
        }
        checkToken();
        if (z4 || this.prefDef.isFirstCommendVersion().d().booleanValue() || !com.join.mgps.Util.g2.h(this.shortcutGameId) || this.prefDef.firstShowUserPermiss().d().booleanValue()) {
            return;
        }
        checkRealName();
        if (shouldGetUpdateFeature()) {
            getUpdateFeature();
        } else {
            getHomePopupAd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDetailData(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            if (this.rpcClient == null) {
                this.rpcClient = com.join.mgps.rpc.impl.d.P1();
            }
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                ResultMainBean<CollectionBeanSub> e12 = this.rpcClient.e1(RequestBeanUtil.getInstance(this).getAppDetialBean(str, accountData != null ? accountData.getUid() : 0, null));
                if (e12 == null || e12.getFlag() == 0) {
                    return;
                }
                showSharedGameDialog(e12.getMessages().getData());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getEMUVersion() {
        Throwable th;
        boolean z4;
        long j4;
        int uid;
        ResultMainBean<List<APKVersionMainBean>> r12;
        ApkVersionbean apkVersionbean;
        Exception exc;
        EMUApkTable eMUApkTable;
        String ver;
        HomeViewSwich homeViewSwich;
        if (this.prefDef.plugHasUpdate().d().booleanValue() || CommonService.W) {
            return;
        }
        int i4 = 1;
        CommonService.W = true;
        try {
            initDefaultPluginInfo();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        int i5 = 0;
        if (com.join.android.app.common.utils.j.j(this)) {
            ResultMainBean<List<APKVersionMainBean>> resultMainBean = null;
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                if (accountData != null) {
                    try {
                        uid = accountData.getUid();
                    } catch (Exception unused) {
                        CommonService.W = false;
                        if (resultMainBean == null) {
                            com.join.mgps.Util.v0.d("getEMUVersion", "failed  " + this.recomDatabean);
                            this.reloadNumber = this.reloadNumber - 1;
                            j4 = 5000;
                            try {
                                Thread.sleep(j4);
                                getEMUVersion();
                            } catch (InterruptedException unused2) {
                            }
                        }
                        getArenaPluginInfo();
                        getVideoAdCfg(true);
                    } catch (Throwable th2) {
                        th = th2;
                        z4 = false;
                        CommonService.W = z4;
                        if (resultMainBean == null) {
                            com.join.mgps.Util.v0.d("getEMUVersion", "failed  " + this.recomDatabean);
                            this.reloadNumber = this.reloadNumber - 1;
                            try {
                                Thread.sleep(5000L);
                                getEMUVersion();
                            } catch (InterruptedException unused3) {
                            }
                        }
                        throw th;
                    }
                } else {
                    uid = 0;
                }
                r12 = this.recommendClient.r1(RequestBeanUtil.getInstance(this).getApkVersion(2, 2, 0, uid));
                if (r12 != null) {
                    try {
                        try {
                            if (r12.getFlag() == 1) {
                                com.join.mgps.Util.v0.d("getEMUVersion", "sucess");
                                this.prefDef.plugHasUpdate().g(Boolean.TRUE);
                                if (r12.getMessages().getData().size() == 0) {
                                    CommonService.W = false;
                                    return;
                                }
                                APKVersionMainBean aPKVersionMainBean = r12.getMessages().getData().get(0);
                                if (aPKVersionMainBean != null) {
                                    apkVersionbean = aPKVersionMainBean.getApp().get(0);
                                    try {
                                        MApplication.Z = aPKVersionMainBean.getSimulator_run_ad_text_cfg();
                                        MApplication.f1492p0 = aPKVersionMainBean.getSingle_game_run_ad_text_cfg();
                                        MApplication.f1493p1 = aPKVersionMainBean.getPublic_video_cfg();
                                        SingleGameRunAdTextCfgBean singleGameRunAdTextCfgBean = MApplication.f1492p0;
                                        if (singleGameRunAdTextCfgBean != null) {
                                            MApplication.f1495v1 = singleGameRunAdTextCfgBean.getCounts();
                                        }
                                        List<HomeViewSwich> cfg = aPKVersionMainBean.getCfg();
                                        if (cfg != null && cfg.size() > 0 && (homeViewSwich = cfg.get(0)) != null) {
                                            try {
                                                String backSplitData = backSplitData(com.join.mgps.Util.a.a(homeViewSwich.getDown_load_speed_limit().getCfg_values(), null));
                                                if (!backSplitData.equals("-1")) {
                                                    homeViewSwich.getDown_load_speed_limit().setCfg_values_express(backSplitData);
                                                } else {
                                                    homeViewSwich.getDown_load_speed_limit().setCfg_values_express("300");
                                                }
                                                String backSplitData2 = backSplitData(com.join.mgps.Util.a.a(homeViewSwich.getDown_load_size().getCfg_values(), null));
                                                if (!backSplitData2.equals("0")) {
                                                    homeViewSwich.getDown_load_size().setCfg_values_express(backSplitData2);
                                                } else {
                                                    homeViewSwich.getDown_load_size().setCfg_values_express("500");
                                                }
                                                String backSplitData3 = backSplitData(com.join.mgps.Util.a.a(homeViewSwich.getDown_load_cfg_net_game_speed_limit().getCfg_switch(), null));
                                                if (!backSplitData3.equals("-1")) {
                                                    homeViewSwich.getDown_load_cfg_net_game_speed_limit().setCfg_switch_express(backSplitData3);
                                                } else {
                                                    homeViewSwich.getDown_load_cfg_net_game_speed_limit().setCfg_switch_express("0");
                                                }
                                                String backSplitData4 = backSplitData(com.join.mgps.Util.a.a(homeViewSwich.getDown_load_cfg_simulator_speed_limit().getCfg_switch(), null));
                                                if (!backSplitData4.equals("-1")) {
                                                    homeViewSwich.getDown_load_cfg_simulator_speed_limit().setCfg_switch_express(backSplitData4);
                                                } else {
                                                    homeViewSwich.getDown_load_cfg_simulator_speed_limit().setCfg_switch_express("0");
                                                }
                                                String backSplitData5 = backSplitData(com.join.mgps.Util.a.a(homeViewSwich.getDown_load_cfg_stand_alone_speed_limit().getCfg_switch(), null));
                                                if (!backSplitData5.equals("-1")) {
                                                    homeViewSwich.getDown_load_cfg_stand_alone_speed_limit().setCfg_switch_express(backSplitData5);
                                                } else {
                                                    homeViewSwich.getDown_load_cfg_stand_alone_speed_limit().setCfg_switch_express("0");
                                                }
                                                homeViewSwich.getDown_load_unrestricted_speed().setCfg_values_express(backSplitData(com.join.mgps.Util.a.a(homeViewSwich.getDown_load_unrestricted_speed().getCfg_values(), null)));
                                                com.join.mgps.pref.h.n(this.context).N(homeViewSwich);
                                                MApplication.R = homeViewSwich;
                                            } catch (Exception e6) {
                                                e6.printStackTrace();
                                            }
                                            BattaleSwitchBean an_battle_switch = homeViewSwich.getAn_battle_switch();
                                            if (an_battle_switch != null && an_battle_switch.getCfg_switch() == 1) {
                                                this.prefDef.showAnBattle().g(Boolean.TRUE);
                                            } else {
                                                this.prefDef.showAnBattle().g(Boolean.FALSE);
                                            }
                                            BattaleSwitchBean seep_up_read_only_number_of_win = homeViewSwich.getSeep_up_read_only_number_of_win();
                                            if (seep_up_read_only_number_of_win != null && seep_up_read_only_number_of_win.getCfg_switch() == 1) {
                                                this.prefDef.downloadSpeedUpCount().g(Integer.valueOf(seep_up_read_only_number_of_win.getCfg_values()));
                                            } else {
                                                this.prefDef.downloadSpeedUpCount().g(0);
                                            }
                                            BattaleSwitchBean seep_up_read_only_game_size = homeViewSwich.getSeep_up_read_only_game_size();
                                            if (seep_up_read_only_game_size != null && seep_up_read_only_game_size.getCfg_switch() == 1) {
                                                this.prefDef.downloadSpeedUpGameSize().g(Integer.valueOf(seep_up_read_only_game_size.getCfg_values()));
                                            } else {
                                                this.prefDef.downloadSpeedUpGameSize().g(0);
                                            }
                                            if (!com.join.mgps.Util.y.u(this.prefDef.downloadSpeedUpLastTime().d().longValue())) {
                                                this.prefDef.downloadSpeedUpCountCurrent().g(0);
                                                this.prefDef.downloadSpeedUpCountCurrentAD().g(0);
                                                this.prefDef.downloadSpeedUpGames().g("");
                                            }
                                            BattaleSwitchBean psp_ad_show_time = homeViewSwich.getPsp_ad_show_time();
                                            if (psp_ad_show_time != null) {
                                                this.prefDef.pspAdShowTimeSwitch().g(Integer.valueOf(psp_ad_show_time.getCfg_switch()));
                                                this.prefDef.pspAdShowTime().g(Integer.valueOf(psp_ad_show_time.getCfg_values()));
                                            }
                                            BattaleSwitchBean ranking_menu = homeViewSwich.getRanking_menu();
                                            if (ranking_menu != null) {
                                                this.prefDef.rankingMenu().g(ranking_menu.getCfg_values());
                                            }
                                            BattaleSwitchBean seep_up_read_only_arc_ad_id = homeViewSwich.getSeep_up_read_only_arc_ad_id();
                                            if (seep_up_read_only_arc_ad_id != null && seep_up_read_only_arc_ad_id.getCfg_switch() == 1 && !TextUtils.isEmpty(seep_up_read_only_arc_ad_id.getCfg_values())) {
                                                this.prefDef.adIdArc().g(seep_up_read_only_arc_ad_id.getCfg_values());
                                            }
                                            BattaleSwitchBean seep_up_read_only_psp_ad_id = homeViewSwich.getSeep_up_read_only_psp_ad_id();
                                            if (seep_up_read_only_psp_ad_id != null && seep_up_read_only_psp_ad_id.getCfg_switch() == 1 && !TextUtils.isEmpty(seep_up_read_only_psp_ad_id.getCfg_values())) {
                                                this.prefDef.adIdPsp().g(seep_up_read_only_psp_ad_id.getCfg_values());
                                            }
                                            BattaleSwitchBean seep_up_read_only_down_ad_id = homeViewSwich.getSeep_up_read_only_down_ad_id();
                                            if (seep_up_read_only_down_ad_id != null && seep_up_read_only_down_ad_id.getCfg_switch() == 1 && !TextUtils.isEmpty(seep_up_read_only_down_ad_id.getCfg_values())) {
                                                this.prefDef.adIdDownloadSpeedUp().g(seep_up_read_only_down_ad_id.getCfg_values());
                                            }
                                            BattaleSwitchBean seep_up_read_only_common_s_ad_id = homeViewSwich.getSeep_up_read_only_common_s_ad_id();
                                            if (seep_up_read_only_common_s_ad_id != null && seep_up_read_only_common_s_ad_id.getCfg_switch() == 1 && !TextUtils.isEmpty(seep_up_read_only_common_s_ad_id.getCfg_values())) {
                                                this.prefDef.adIdCommonV().g(seep_up_read_only_common_s_ad_id.getCfg_values());
                                            }
                                            BattaleSwitchBean seep_up_read_only_common_h_ad_id = homeViewSwich.getSeep_up_read_only_common_h_ad_id();
                                            if (seep_up_read_only_common_h_ad_id != null && seep_up_read_only_common_h_ad_id.getCfg_switch() == 1 && !TextUtils.isEmpty(seep_up_read_only_common_h_ad_id.getCfg_values())) {
                                                this.prefDef.adIdCommonH().g(seep_up_read_only_common_h_ad_id.getCfg_values());
                                            }
                                            initAdBroadcast();
                                            BattaleSwitchBean nick_name_modify_title = homeViewSwich.getNick_name_modify_title();
                                            if (nick_name_modify_title != null) {
                                                this.prefDef.changeNickNameNotice().g(nick_name_modify_title.getCfg_values());
                                            }
                                            BattaleSwitchBean game_download_boot = homeViewSwich.getGame_download_boot();
                                            if (game_download_boot != null) {
                                                String cfg_values = game_download_boot.getCfg_values();
                                                if (com.join.mgps.Util.g2.i(cfg_values)) {
                                                    try {
                                                        int intValue = this.prefDef.insatllAppFirst().d().intValue();
                                                        int parseInt = Integer.parseInt(cfg_values);
                                                        if (intValue == -8) {
                                                            this.prefDef.insatllAppFirst().g(Integer.valueOf(parseInt));
                                                        }
                                                    } catch (Exception e7) {
                                                        e7.printStackTrace();
                                                    }
                                                }
                                            }
                                            BattaleSwitchBean game_performance_boot = homeViewSwich.getGame_performance_boot();
                                            if (game_performance_boot != null) {
                                                String cfg_values2 = game_performance_boot.getCfg_values();
                                                if (com.join.mgps.Util.g2.i(cfg_values2)) {
                                                    try {
                                                        int parseInt2 = Integer.parseInt(cfg_values2);
                                                        if (this.prefDef.runRomFirst().d().intValue() == -8) {
                                                            this.prefDef.runRomFirst().g(Integer.valueOf(parseInt2));
                                                        }
                                                    } catch (Exception e8) {
                                                        e8.printStackTrace();
                                                    }
                                                }
                                            }
                                            BattaleSwitchBean app_down_wifi_status = homeViewSwich.getApp_down_wifi_status();
                                            if (app_down_wifi_status != null) {
                                                String cfg_values3 = app_down_wifi_status.getCfg_values();
                                                if (com.join.mgps.Util.g2.i(cfg_values3)) {
                                                    try {
                                                        int parseInt3 = Integer.parseInt(cfg_values3);
                                                        if (this.prefDef.wifiDownNumber().d().intValue() == -1) {
                                                            this.prefDef.wifiDownNumber().g(Integer.valueOf(parseInt3));
                                                        }
                                                    } catch (Exception e9) {
                                                        e9.printStackTrace();
                                                    }
                                                }
                                            }
                                            BattaleSwitchBean ext_game_upload_type = homeViewSwich.getExt_game_upload_type();
                                            if (ext_game_upload_type != null && com.join.mgps.Util.g2.i(ext_game_upload_type.getCfg_values())) {
                                                try {
                                                    this.prefDef.uploadType2().g(ext_game_upload_type.getCfg_values());
                                                } catch (Exception e10) {
                                                    e10.printStackTrace();
                                                }
                                            }
                                            BattaleSwitchBean wf_home_page_position = homeViewSwich.getWf_home_page_position();
                                            if (wf_home_page_position != null && wf_home_page_position.getCfg_switch() == 1) {
                                                this.prefDef.showIndex().g(wf_home_page_position.getCfg_values());
                                            } else {
                                                this.prefDef.showIndex().g("2");
                                            }
                                            BattaleSwitchBean md5_file_tag = homeViewSwich.getMd5_file_tag();
                                            if (md5_file_tag != null && md5_file_tag.getCfg_switch() == 1) {
                                                this.prefDef.md5FileTag().g(md5_file_tag.getCfg_values());
                                                com.join.mgps.Util.v.f28119s = md5_file_tag.getCfg_values();
                                            } else {
                                                this.prefDef.md5FileTag().g("");
                                            }
                                            try {
                                                this.prefDef.emulatorStartAdCount().g(Integer.valueOf(Integer.parseInt(homeViewSwich.getEmulator_start_ad_count().getCfg_values())));
                                            } catch (Exception e11) {
                                                e11.printStackTrace();
                                            }
                                            this.prefDef.emulatorGoldenFingerUrl().g(homeViewSwich.getEmulator_golden_finger_url().getCfg_values());
                                            this.prefDef.emulatorOneSkillUrl().g(homeViewSwich.getEmulator_one_skill_url().getCfg_values());
                                            this.prefDef.emulatorCheckpointUrl().g(homeViewSwich.getEmulator_checkpoint_url().getCfg_values());
                                        }
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                    }
                                } else {
                                    apkVersionbean = null;
                                }
                                if (r12.getFlag() == 1) {
                                    String[] A = com.join.android.app.common.utils.n.n(this).A();
                                    int parseInt4 = Integer.parseInt(apkVersionbean.getVer().split("_")[0]);
                                    int parseInt5 = Integer.parseInt(apkVersionbean.getVer_compatible().split("_")[0]);
                                    if (Integer.parseInt(A[0]) <= parseInt4) {
                                        VersionDto versionDto = new VersionDto();
                                        versionDto.setAndroidUrl(apkVersionbean.getDown_url());
                                        versionDto.setVersionNo(Integer.parseInt(ver.split("_")[0]));
                                        versionDto.setInfo(apkVersionbean.getVer_info());
                                        versionDto.setHead_pic(apkVersionbean.getHead_pic());
                                        versionDto.setTow_tpl_back_ground_pic(apkVersionbean.getTow_tpl_back_ground_pic());
                                        versionDto.setTpl_type(apkVersionbean.getTpl_type());
                                        if (Integer.parseInt(A[0]) < parseInt4) {
                                            if (Float.parseFloat(A[0]) < parseInt5) {
                                                showVersionDownLoadHint(versionDto, true);
                                            } else {
                                                showVersionDownLoadHint(versionDto, false);
                                            }
                                        }
                                    }
                                }
                                List<ApkVersionbean> plugin = aPKVersionMainBean.getPlugin();
                                if (plugin != null) {
                                    for (ApkVersionbean apkVersionbean2 : plugin) {
                                        DownloadTask F = p1.f.K().F(apkVersionbean2.getTag_id());
                                        if (F != null && !TextUtils.isEmpty(apkVersionbean2.getVer())) {
                                            if (apkVersionbean2.equals(F.getVer() + "_" + F.getVer_name()) && F.getDown_type() != apkVersionbean2.getDown_type()) {
                                                p1.f.K().delete((p1.f) F);
                                                F = null;
                                            }
                                        }
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("tag_id", apkVersionbean2.getTag_id());
                                        List<EMUApkTable> h4 = b2.p.o().h(hashMap);
                                        if (h4 != null && h4.size() > 0) {
                                            if (h4.size() > i4) {
                                                for (int i6 = 0; i6 < h4.size(); i6++) {
                                                    b2.p.o().delete((b2.p) h4.get(i6));
                                                }
                                            }
                                            try {
                                                eMUApkTable = h4.get(i5);
                                            } catch (Exception e13) {
                                                exc = e13;
                                                eMUApkTable = null;
                                            }
                                            try {
                                                eMUApkTable.setApk_name(apkVersionbean2.getApk_name());
                                                eMUApkTable.setDown_url(apkVersionbean2.getDown_url());
                                                eMUApkTable.setLaunch_name(apkVersionbean2.getLaunch_name());
                                                eMUApkTable.setLogo(apkVersionbean2.getLogo());
                                                eMUApkTable.setPackage_name(apkVersionbean2.getPackage_name());
                                                eMUApkTable.setRelease_date(apkVersionbean2.getRelease_date());
                                                eMUApkTable.setSize(apkVersionbean2.getSize());
                                                eMUApkTable.setTag_id(apkVersionbean2.getTag_id());
                                                eMUApkTable.setTeam_info(apkVersionbean2.getTeam_info());
                                                eMUApkTable.setVer(apkVersionbean2.getVer());
                                                eMUApkTable.setVer_compatible(apkVersionbean2.getVer_compatible());
                                                eMUApkTable.setVer_info(apkVersionbean2.getVer_info());
                                                eMUApkTable.setDown_type(apkVersionbean2.getDown_type());
                                                eMUApkTable.setRemark(JsonMapper.toJsonString(apkVersionbean2.getPlugin_md5()));
                                                boolean C0 = UtilsMy.C0(this, eMUApkTable);
                                                if (F != null) {
                                                    if (F.getFileType() != null && F.getFileType().equals(Dtype.chajian.name()) && F.getDown_type() == 2 && eMUApkTable.getDown_type() == 2 && TextUtils.isEmpty(eMUApkTable.getApkPath())) {
                                                        eMUApkTable.setApkPath(com.join.android.app.common.utils.l.h(F.getPlugin_num(), new File(F.getGameZipPath())));
                                                    }
                                                    if (C0 && F.getStatus() == 5) {
                                                        F.setUrl(apkVersionbean2.getDown_url());
                                                        if (com.join.mgps.Util.g2.h(F.getMod_info())) {
                                                            F.setStatus(9);
                                                        }
                                                        F.setShowName(apkVersionbean2.getApk_name());
                                                        F.setDescribe(apkVersionbean2.getVer_info());
                                                        F.setPortraitURL(apkVersionbean2.getLogo());
                                                    } else if (F.getStatus() == 0) {
                                                        F.setStatus(5);
                                                    }
                                                    p1.f.K().m(F);
                                                    if (F.getStatus() == 9 || (C0 && F.getStatus() == 5)) {
                                                        com.join.android.app.common.utils.l.G(this.context, eMUApkTable);
                                                    }
                                                } else if (C0) {
                                                    if (eMUApkTable.getDown_type() == 2) {
                                                        if (com.join.android.app.common.utils.l.t(this.context, eMUApkTable, false, new String[0])) {
                                                            UtilsMy.M2(eMUApkTable, this.context);
                                                        }
                                                    } else {
                                                        UtilsMy.M2(eMUApkTable, this.context);
                                                    }
                                                } else if (com.join.android.app.common.utils.l.t(this.context, eMUApkTable, false, new String[0])) {
                                                    UtilsMy.L2(eMUApkTable, this.context);
                                                }
                                            } catch (Exception e14) {
                                                exc = e14;
                                                exc.printStackTrace();
                                                b2.p.o().update(eMUApkTable);
                                                com.join.android.app.common.utils.l.F(eMUApkTable);
                                                i4 = 1;
                                                i5 = 0;
                                            }
                                            b2.p.o().update(eMUApkTable);
                                            com.join.android.app.common.utils.l.F(eMUApkTable);
                                        } else {
                                            EMUApkTable eMUApkTable2 = new EMUApkTable();
                                            eMUApkTable2.setApk_name(apkVersionbean2.getApk_name());
                                            eMUApkTable2.setDown_url(apkVersionbean2.getDown_url());
                                            eMUApkTable2.setLaunch_name(apkVersionbean2.getLaunch_name());
                                            eMUApkTable2.setLogo(apkVersionbean2.getLogo());
                                            eMUApkTable2.setPackage_name(apkVersionbean2.getPackage_name());
                                            eMUApkTable2.setRelease_date(apkVersionbean2.getRelease_date());
                                            eMUApkTable2.setSize(apkVersionbean2.getSize());
                                            eMUApkTable2.setTag_id(apkVersionbean2.getTag_id());
                                            eMUApkTable2.setTeam_info(apkVersionbean2.getTeam_info());
                                            eMUApkTable2.setVer(apkVersionbean2.getVer());
                                            eMUApkTable2.setVer_compatible(apkVersionbean2.getVer_compatible());
                                            eMUApkTable2.setVer_info(apkVersionbean2.getVer_info());
                                            eMUApkTable2.setDown_type(apkVersionbean2.getDown_type());
                                            eMUApkTable2.setRemark(JsonMapper.toJsonString(apkVersionbean2.getPlugin_md5()));
                                            b2.p.o().k(eMUApkTable2);
                                            com.join.android.app.common.utils.l.F(eMUApkTable2);
                                            boolean C02 = UtilsMy.C0(this, eMUApkTable2);
                                            if (F != null) {
                                                if (F.getFileType() != null && F.getFileType().equals(Dtype.chajian.name()) && F.getDown_type() == 2 && eMUApkTable2.getDown_type() == 2 && TextUtils.isEmpty(eMUApkTable2.getApkPath())) {
                                                    eMUApkTable2.setApkPath(com.join.android.app.common.utils.l.h(F.getPlugin_num(), new File(F.getGameZipPath())));
                                                }
                                                if (C02 && F.getStatus() == 5) {
                                                    F.setUrl(apkVersionbean2.getDown_url());
                                                    F.setShowName(apkVersionbean2.getApk_name());
                                                    if (com.join.mgps.Util.g2.h(F.getMod_info())) {
                                                        F.setStatus(9);
                                                    }
                                                } else if (F.getStatus() == 0) {
                                                    F.setStatus(5);
                                                }
                                                p1.f.K().m(F);
                                                if (F.getStatus() == 9 || (C02 && F.getStatus() == 5)) {
                                                    com.join.android.app.common.utils.l.G(this.context, eMUApkTable2);
                                                }
                                            } else {
                                                if (C02) {
                                                    if (eMUApkTable2.getDown_type() == 2) {
                                                        if (com.join.android.app.common.utils.l.t(this.context, eMUApkTable2, false, new String[0])) {
                                                            UtilsMy.M2(eMUApkTable2, this.context);
                                                        }
                                                    } else {
                                                        UtilsMy.M2(eMUApkTable2, this.context);
                                                    }
                                                } else if (com.join.android.app.common.utils.l.t(this.context, eMUApkTable2, false, new String[0])) {
                                                    UtilsMy.L2(eMUApkTable2, this.context);
                                                }
                                                i4 = 1;
                                                i5 = 0;
                                            }
                                        }
                                        i4 = 1;
                                        i5 = 0;
                                    }
                                }
                                com.papa.sim.statistic.p.l(getApplicationContext()).E2(true, JsonMapper.getInstance().toJson(b2.p.o().d()));
                            }
                        } catch (Exception unused4) {
                            resultMainBean = r12;
                            CommonService.W = false;
                            if (resultMainBean == null && this.reloadNumber > 0) {
                                com.join.mgps.Util.v0.d("getEMUVersion", "failed  " + this.recomDatabean);
                                this.reloadNumber = this.reloadNumber - 1;
                                j4 = 5000;
                                Thread.sleep(j4);
                                getEMUVersion();
                            }
                            getArenaPluginInfo();
                            getVideoAdCfg(true);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        resultMainBean = r12;
                        z4 = false;
                        CommonService.W = z4;
                        if (resultMainBean == null && this.reloadNumber > 0) {
                            com.join.mgps.Util.v0.d("getEMUVersion", "failed  " + this.recomDatabean);
                            this.reloadNumber = this.reloadNumber - 1;
                            Thread.sleep(5000L);
                            getEMUVersion();
                        }
                        throw th;
                    }
                }
                CommonService.W = false;
            } catch (Exception unused5) {
                resultMainBean = null;
            } catch (Throwable th4) {
                th = th4;
                z4 = false;
                resultMainBean = null;
            }
            if (r12 == null && this.reloadNumber > 0) {
                com.join.mgps.Util.v0.d("getEMUVersion", "failed  " + this.recomDatabean);
                this.reloadNumber = this.reloadNumber - 1;
                j4 = 5000;
                Thread.sleep(j4);
                getEMUVersion();
            }
        } else {
            CommonService.W = false;
            checkPlatformVersion();
            com.join.mgps.Util.v0.d("getEMUVersion", "nonet");
        }
        getArenaPluginInfo();
        getVideoAdCfg(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getEndGameConfig() {
        if (com.join.android.app.common.utils.j.j(this.context)) {
            RequestEndGameListArgs requestEndGameListArgs = new RequestEndGameListArgs();
            requestEndGameListArgs.setUid(AccountUtil_.getInstance_(this.context).getUid());
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameListArgs);
            requestModel.setDefault(this.context);
            ResponseModel<GameMainV4DataBean.EndGameConfigBean> x4 = com.join.mgps.rpc.impl.i.D0().x(requestModel.makeSign());
            if (x4 == null || x4.getCode() != 200 || x4.getData() == null) {
                return;
            }
            this.prefDef.endGameConfig().g(JsonMapper.toJsonString(x4.getData()));
        }
    }

    void getFriendInfo(int i4) {
        new k0().execute(Integer.valueOf(i4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getHaveGameList() {
        if (com.join.android.app.common.utils.j.j(this.context)) {
            try {
                if (this.rpcConsoleGameClient == null) {
                    this.rpcConsoleGameClient = com.join.mgps.rpc.impl.f.b();
                }
                String uid = AccountUtil_.getInstance_(this).getUid();
                String token = AccountUtil_.getInstance_(this).getToken();
                HashMap hashMap = new HashMap();
                hashMap.put("uid", uid);
                hashMap.put("token", token);
                ResultMainBean<List<AppBean>> a5 = this.rpcConsoleGameClient.a(hashMap);
                if (a5 == null || a5.getFlag() != 1 || a5.getMessages() == null || a5.getMessages().getData() == null) {
                    return;
                }
                savePurchasedList(a5.getMessages().getData());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getHomePopupAd() {
        List<DownloadTask> v2;
        if (!this.prefDef.firstUninstallTipShow().d().booleanValue() && (v2 = p1.f.K().v()) != null) {
            checkAndShowUninstallDialog(v2);
            if (this.showInstallNoticeOrappDialog) {
                this.prefDef.firstUninstallTipShow().g(Boolean.TRUE);
            }
        }
        if (this.showInstallNoticeOrappDialog) {
            return;
        }
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.context).getAccountData();
                ResultMainBean<PopupAdBean> J = this.rpcClient.J(RequestBeanUtil.getInstance(this).getHomePopupAd(com.join.mgps.Util.b.piv(accountData), accountData.getUid()));
                if (J != null && J.getFlag() == 1) {
                    showHomePopupAd(J.getMessages().getData());
                } else {
                    showHomePopupAd(null);
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showHomePopupAd(null);
                return;
            }
        }
        showHomePopupAd(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getLogincfgs() {
        try {
            com.join.mgps.rpc.impl.d.P1().O1().P1(RequestBeanUtil.getInstance(this.context).getDefalutRequestBean(new RequestUidtagidTagdes())).enqueue(new c());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getOnlineCouponConfig(int i4) {
    }

    public int getPositionNum() {
        return this.positionNum;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getRedPointData() {
        com.wufan.user.service.protobuf.n0 accountData;
        UsercenterFragmentNew usercenterFragmentNew;
        if (!com.join.android.app.common.utils.j.j(this.context) || (accountData = AccountUtil_.getInstance_(this.context).getAccountData()) == null || accountData.getUid() == 0 || AccountUtil_.getInstance_(this.context).isTourist()) {
            return;
        }
        try {
            MessageRedPointBean H1 = this.rpcClient.H1(RequestBeanUtil.getInstance(this.context).getGRedPointNum(accountData.getUid()));
            if (H1 != null && H1.getMessages() != null && H1.getMessages().getData() != null) {
                MessageRedPointBean.MessagesBean.DataBean data = H1.getMessages().getData();
                MApplication.M = data;
                int community_praise_surplus_number = data.getCommunity_praise_surplus_number() + MApplication.M.getCommunity_surplus_number() + MApplication.M.getNotice_surplus_number() + MApplication.M.getPraise_surplus_number() + MApplication.M.getReplay_surplus_number();
                MApplication.Q = community_praise_surplus_number;
                if (community_praise_surplus_number > 0) {
                    if (this.positionNum == 1 && (usercenterFragmentNew = this.userCenterFragment) != null) {
                        usercenterFragmentNew.showNotif();
                    } else {
                        showRedPoint();
                    }
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public CommonRequestBean getRequestBean(int i4) {
        return RequestBeanUtil.getInstance(this).getRecomeAppwifi(i4, 9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getRootUrl() {
        try {
            com.join.android.app.common.http.c.d(this.context);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getSNKGameInfo(int i4) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.timelastSnk < com.join.mgps.data.c.f49010a) {
            return;
        }
        this.timelastSnk = currentTimeMillis;
        if (!com.join.android.app.common.utils.j.j(this.context)) {
            if (i4 == 0) {
                showToast("网络已断开，请连上网络后再试！");
                return;
            }
            return;
        }
        try {
            ResultMainBean<SNKGameInfoBean> V = this.mRpcClient.V(RequestBeanUtil.getInstance(this.context).getPreloadingADRequestBean());
            if (V == null || V.getCode() != 600) {
                return;
            }
            setSNKGameData(V.getMessages().getData());
        } catch (Exception e5) {
            StringBuilder sb = new StringBuilder();
            sb.append("e:");
            sb.append(e5.getMessage());
        }
    }

    public List<String> getSnkGameList() {
        return this.snkGameList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getUnInstallGameInfo(String str, List<DownloadTask> list) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RequestModel requestModel = new RequestModel();
                UninstallOnlineGameArgs uninstallOnlineGameArgs = new UninstallOnlineGameArgs();
                uninstallOnlineGameArgs.setGameId(str);
                requestModel.setArgs(uninstallOnlineGameArgs);
                requestModel.setDefault(this);
                ResponseModel<UninstallOnlineGameBean> t02 = com.join.mgps.rpc.impl.i.D0().t0(requestModel.makeSign());
                if (t02 != null && t02.getCode() == 200 && t02.getData() != null) {
                    UninstallOnlineGameBean data = t02.getData();
                    if (data.getText() != null && data.getText().size() > 0 && data.getCover_image() != null) {
                        gotoInstallAppDialogV2Activity(str, data);
                        return;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        showInstallAppDialogActivity(0, list);
    }

    DownloadTask getUninstallOnlineGame(List<DownloadTask> list) {
        for (DownloadTask downloadTask : list) {
            if (UtilsMy.k2(downloadTask.getTipBeans())) {
                return downloadTask;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getUpdateFeature() {
        if (com.join.android.app.common.utils.j.j(this.context)) {
            AccountUtil_.getInstance_(this.context).getAccountData();
            try {
                RequestCommonAdArgs requestCommonAdArgs = new RequestCommonAdArgs();
                requestCommonAdArgs.setPage(1);
                requestCommonAdArgs.setPositionMarkList(new ArrayList<String>() { // from class: com.join.mgps.activity.MGMainActivity.18
                    {
                        add("HOME_UPGRADE_TIPS_PIC");
                        add("HOME_UPGRADE_TIPS_AD");
                    }
                });
                RequestModel requestModel = new RequestModel(this.context);
                requestModel.setArgs(requestCommonAdArgs);
                ResponseModel<List<CommonAdBean>> v02 = com.join.mgps.rpc.impl.i.D0().v0(requestModel.makeSign());
                if (v02 != null && v02.getData() != null && v02.getData().size() > 0) {
                    List<CommonAdBean> data = v02.getData();
                    this.updateFeatureList = data;
                    for (CommonAdBean commonAdBean : data) {
                        if (TextUtils.equals(commonAdBean.getPosition_mark(), "HOME_UPGRADE_TIPS_PIC")) {
                            UpdateFeatureActivity_.p0(this).a(commonAdBean).startForResult(IMediaPlayer.MEDIA_INFO_OPEN_INPUT);
                            return;
                        }
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        getHomePopupAd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.K})
    public void getUpdateIntent(Intent intent) {
        VersionDto versionDto = (VersionDto) intent.getSerializableExtra("appUpdateBean");
        showVersionDownLoadHint(versionDto, versionDto.isQiangzhi());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getVideoAdCfg(boolean z4) {
        try {
            if (com.join.android.app.common.utils.j.j(this.context)) {
                try {
                    com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.context).getAccountData();
                    if (accountData == null) {
                        accountData = com.wufan.user.service.protobuf.n0.b5();
                    }
                    RequestModel requestModel = new RequestModel();
                    VideoAdCfgRequestArgs videoAdCfgRequestArgs = new VideoAdCfgRequestArgs();
                    videoAdCfgRequestArgs.setUid(accountData.getUid());
                    videoAdCfgRequestArgs.setToken(accountData.getToken());
                    requestModel.setArgs(videoAdCfgRequestArgs);
                    requestModel.setDefault(this.context);
                    ResponseModel<VideoAdCfgBean> D = com.join.mgps.rpc.impl.i.D0().D(requestModel.makeSign());
                    if (D != null && D.getCode() == 200) {
                        VideoAdCfgBean data = D.getData();
                        this.prefDef.arcadeGameAdCfg().g(BaseBean.toJsonStringOrEmpty(data.getArcade_game_ad_cfg()));
                        this.prefDef.singleGameAdCfg().g(BaseBean.toJsonStringOrEmpty(data.getSingle_game_ad_cfg()));
                        this.prefDef.pspGameAdCfg().g(BaseBean.toJsonStringOrEmpty(data.getPsp_game_ad_cfg()));
                        this.prefDef.pspAdShowTimeSwitch().g(Integer.valueOf(data.getPsp_game_ad_cfg().getSwitch_state()));
                        this.prefDef.pspAdShowTime().g(Integer.valueOf(data.getPsp_game_ad_cfg().getCount_down()));
                        this.prefDef.downloadSpeedupCfg().g(BaseBean.toJsonStringOrEmpty(data.getDownload_speedup_cfg()));
                        this.prefDef.mod_normal_ad_cfg().g(BaseBean.toJsonStringOrEmpty(data.getMod_normal_ad_cfg()));
                        this.prefDef.mod_enhance_ad_cfg().g(BaseBean.toJsonStringOrEmpty(data.getMod_enhance_ad_cfg()));
                        this.prefDef.simulator_path_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_path_cfg()));
                        this.prefDef.simulator_fc_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_fc_cfg()));
                        this.prefDef.simulator_gba_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_gba_cfg()));
                        this.prefDef.simulator_psp_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_psp_cfg()));
                        this.prefDef.simulator_jj_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_jj_cfg()));
                        this.prefDef.simulator_gold_finger_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_gold_finger_cfg()));
                        this.prefDef.simulator_exit_information_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_exit_information_cfg()));
                        this.prefDef.simulator_exit_open_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_exit_open_cfg()));
                        this.prefDef.ssp_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSsp_cfg()));
                        this.prefDef.video_init_cfg().g(BaseBean.toJsonStringOrEmpty(data.getVideo_init_cfg()));
                        if (data.getDownload_speedup_cfg() != null) {
                            if (data.getDownload_speedup_cfg().getSwitch_state() == 1) {
                                this.prefDef.downloadSpeedUpCountAD().g(Integer.valueOf(data.getDownload_speedup_cfg().getSpeedup_times()));
                            } else {
                                this.prefDef.downloadSpeedUpCountAD().g(0);
                            }
                        } else {
                            this.prefDef.downloadSpeedUpCountAD().g(0);
                        }
                    } else if (D != null) {
                        showToast(D.getMessage());
                    }
                    if (!z4) {
                        return;
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    showToast(this.context.getResources().getString(R.string.request_failure));
                    if (!z4) {
                        return;
                    }
                }
                initAdVideoConfig();
                return;
            }
            showToast(this.context.getResources().getString(R.string.net_connect_failed));
        } catch (Throwable th) {
            if (z4) {
                initAdVideoConfig();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 1000)
    public void getdownloadTask() {
        List<DownloadTask> d5 = p1.f.K().d();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e5) {
            e5.printStackTrace();
        }
        getdownloadTaskUI(d5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void getdownloadTaskUI(List<DownloadTask> list) {
        this.downloadTasks = list;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : list) {
            if ("46".equals(downloadTask.getPlugin_num()) && downloadTask.getStatus() == 5) {
                if (!Boolean.valueOf(com.join.android.app.common.utils.e.l0(this).d(this, downloadTask.getPackageName()) || com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName())).booleanValue() && downloadTask.getStatus() == 5) {
                    p1.f.K().n(downloadTask.getCrc_link_type_val());
                }
            }
            if (downloadTask.getCrc_link_type_val() != null) {
                this.downloadTasksMap.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void goToOnekeyLogin() {
        if (isForcedLogin(1)) {
            this.hasJumpToOneKeyLogin = true;
            LoginSplashActivity_.intent(this).isForcedLogin(true).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void gotoInstallAppDialogV2Activity(String str, UninstallOnlineGameBean uninstallOnlineGameBean) {
        InstallAppDialogV2Activity_.l0(this.context).b(str).c(uninstallOnlineGameBean.getText().get(0)).a(uninstallOnlineGameBean.getCover_image()).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void handleFailure(ArenaResponse arenaResponse) {
        int i4;
        Activity w4 = com.join.android.app.common.utils.n.w();
        if (w4 == null || (w4 instanceof GameMainActivity3) || (w4 instanceof GameRoomListActivity) || (i4 = arenaResponse.errorType) == 10) {
            return;
        }
        if (i4 == 16) {
            showToast("无法加入，你被禁止加入该房间");
        } else if (i4 == 17) {
            showToast("该房间为比赛专用房间,非参赛选手无法加入");
        } else if (i4 == 9) {
            showToast("房间人数已满你无法加入房间");
        } else if (i4 == 7) {
            showToast("密码输入错误，请重试!");
        } else if (i4 == 8) {
            showToast("房间已经被解散！");
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.q(8));
        } else if (i4 == 11) {
            showToast("铜板不足，无法创建房间!");
        } else if (i4 == 13) {
            showToast("铜板不足，无法加入房间");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 5000)
    public void handleVideoAdWatchLogRecord() {
        List<VideoWatchLogTable> d5 = b2.n0.n().d();
        if (d5 == null || d5.size() <= 0) {
            return;
        }
        for (final VideoWatchLogTable videoWatchLogTable : d5) {
            this.handler.postDelayed(new Runnable() { // from class: com.join.mgps.activity.j1
                @Override // java.lang.Runnable
                public final void run() {
                    MGMainActivity.this.lambda$handleVideoAdWatchLogRecord$6(videoWatchLogTable);
                }
            }, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void hideRedPoint() {
        this.red_point.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1300)
    public void hideSplash() {
        show10Permiss();
        this.splash.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1300)
    public void hideSplash2() {
        show10Permiss();
        this.splash.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void init() {
        if (!com.join.mgps.Util.d0.a().b(this)) {
            com.join.mgps.Util.d0.a().d(this);
        }
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(getApplicationContext());
        l4.o();
        l4.H2(new com.join.mgps.listener.d());
        if (Build.VERSION.SDK_INT >= 11) {
            l4.G2(true);
            l4.F2(true);
        }
        com.papa.sim.statistic.p.l(this).K2(0, AccountUtil_.getInstance_(this).getUid());
        try {
            CommonService_.S2(getApplicationContext()).a();
        } catch (Exception unused) {
        }
        this.prefDef.plugHasUpdate().g(Boolean.FALSE);
        CommonService.W = false;
        com.papa.sim.statistic.p.l(this).X1(AccountUtil_.getInstance_(this).getUid());
        jpushInit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void initAdVideoConfig() {
        initTTDownLoadSpeedAd("", false);
        initTTPspAd(false);
        initGDTDownLoadSpeedAd("", false);
        initGDTPspAd(false);
        initGrMDownLoadSpeedAd("", false);
        initGrMPspAd(false);
        initREDownLoadSpeedAd("", false);
        initREPspAd(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void initApplicationData() {
        MApplication mApplication = MApplication.f1497x;
        mApplication.p();
        mApplication.E();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void initCheckSNKGame(List<String> list, int i4) {
        List<String> list2;
        if (!com.join.android.app.common.utils.j.j(this.context) || (list2 = this.snkGameList) == null || list2.size() <= 0) {
            return;
        }
        String str = "";
        for (int i5 = 0; i5 < list.size(); i5++) {
            try {
                String d5 = com.join.mgps.Util.x0.d(list.get(i5) + "wufan2019");
                int i6 = 0;
                while (true) {
                    if (i6 >= this.snkGameList.size()) {
                        break;
                    } else if (d5.equals(this.snkGameList.get(i6))) {
                        this.listTempZip.add(list.get(i5));
                        str = str.equals("") ? d5 : str + "," + d5;
                    } else {
                        i6++;
                    }
                }
            } catch (Exception e5) {
                StringBuilder sb = new StringBuilder();
                sb.append("e:");
                sb.append(e5.getMessage());
                return;
            }
        }
        if (str.equals("")) {
            showCheckData(null);
            return;
        }
        ResultMainBean<List<CollectionBeanSub>> A1 = this.mRpcClient.A1(RequestBeanUtil.getInstance(this.context).getSNKGameCheckRequestBean(str));
        if (A1 == null || A1.getMessages().getData().size() <= 0) {
            return;
        }
        if (i4 == 1) {
            showCheckData(A1.getMessages().getData());
        } else {
            sanLocalGameIv(1);
        }
    }

    public void initGDTAd(String str, String str2, String str3, int i4, int i5, boolean z4) {
        if (this.gdtAdVideo == null && com.join.mgps.Util.g2.i(str)) {
            m mVar = new m(this, str, str2, z4);
            this.gdtAdVideo = mVar;
            mVar.n(str3);
            this.gdtAdVideo.o(i4);
            this.gdtAdVideo.p(i5);
            this.gdtAdVideo.e();
            return;
        }
        com.join.mgps.ad.h hVar = this.gdtAdVideo;
        if (hVar != null) {
            hVar.h(false);
        }
    }

    public void initGoldGDTAd(String str, String str2, String str3, int i4, int i5, Map<String, Object> map, boolean z4) {
        if (this.gdtGoldAdVideo == null && com.join.mgps.Util.g2.i(str)) {
            q qVar = new q(this, str, str2, z4);
            this.gdtGoldAdVideo = qVar;
            qVar.n(str3);
            this.gdtGoldAdVideo.o(i4);
            this.gdtGoldAdVideo.p(i5);
            this.gdtGoldAdVideo.m(map);
            this.gdtGoldAdVideo.e();
            return;
        }
        com.join.mgps.ad.h hVar = this.gdtGoldAdVideo;
        if (hVar != null) {
            hVar.h(false);
        }
    }

    public void initGoldTTAd(String str, String str2, String str3, int i4, int i5, Map<String, Object> map, boolean z4) {
        if (this.ttGoldAdVideo == null && com.join.mgps.Util.g2.i(str)) {
            p pVar = new p(this, str, str2, z4);
            this.ttGoldAdVideo = pVar;
            pVar.n(str3);
            this.ttGoldAdVideo.o(i4);
            this.ttGoldAdVideo.p(i5);
            this.ttGoldAdVideo.m(map);
            this.ttGoldAdVideo.e();
            return;
        }
        com.join.mgps.ad.z zVar = this.ttGoldAdVideo;
        if (zVar != null) {
            zVar.h(false);
        }
    }

    public void initGroMTTAd(String str, String str2, String str3, int i4, int i5, boolean z4) {
        if (this.groMAdVideo == null && com.join.mgps.Util.g2.i(str)) {
            n nVar = new n(this.context, str, str2, z4);
            this.groMAdVideo = nVar;
            nVar.n(str3);
            this.groMAdVideo.o(i4);
            this.groMAdVideo.p(i5);
            this.groMAdVideo.e();
            return;
        }
        this.groMAdVideo.h(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void initJPushJoinDevice() {
        com.wufan.user.service.protobuf.n0 accountData;
        if (!com.join.android.app.common.utils.j.j(this.context) || (accountData = AccountUtil_.getInstance_(this.context).getAccountData()) == null || accountData.getUid() == 0 || AccountUtil_.getInstance_(this.context).isTourist()) {
            return;
        }
        if (this.rpcAccountClient == null) {
            this.rpcAccountClient = com.join.mgps.rpc.impl.a.c0();
        }
        if (this.rpcAccountClientV2 == null) {
            this.rpcAccountClientV2 = com.join.mgps.rpc.impl.b.k();
        }
        LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
        linkedMultiValueMap.add("uid", AccountUtil_.getInstance_(this.context).getUid() + "");
        linkedMultiValueMap.add("token", AccountUtil_.getInstance_(this.context).getToken());
        this.rpcAccountClient.S(linkedMultiValueMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void initOM(MApplication mApplication) {
        if (this.isInitOm) {
            return;
        }
        this.isInitOm = true;
        try {
            com.xinzhu.overmind.shared.g gVar = new com.xinzhu.overmind.shared.g();
            gVar.g(this.context);
            gVar.f();
            if (com.xinzhu.overmind.utils.e.g()) {
                Overmind.get().setXPEnable(false);
            }
            Overmind.get().getAppLifecycleCallback();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        Overmind.get().doCreate();
        if (Overmind.get().isVirtualProcess()) {
            Overmind.get().setCustomCallback(new com.xinzhu.overmind.shared.b());
        }
    }

    public void initREAd(String str, String str2, String str3, int i4, int i5, boolean z4) {
        if (this.reAdVideo == null && com.join.mgps.Util.g2.i(str)) {
            o oVar = new o(this, str, str2, z4);
            this.reAdVideo = oVar;
            oVar.n(str3);
            this.reAdVideo.o(i4);
            this.reAdVideo.p(i5);
            this.reAdVideo.e();
            return;
        }
        com.join.mgps.ad.s sVar = this.reAdVideo;
        if (sVar != null) {
            sVar.h(false);
        }
    }

    public void initTTAd(String str, String str2, boolean z4) {
        if (this.ttAdVideo == null && com.join.mgps.Util.g2.i(str)) {
            l lVar = new l(this, str, str2, z4);
            this.ttAdVideo = lVar;
            lVar.e();
            return;
        }
        com.join.mgps.ad.z zVar = this.ttAdVideo;
        if (zVar != null) {
            zVar.h(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void initViewS() {
        View inflate = LayoutInflater.from(this.context).inflate(R.layout.mgmain_otherlayout, (ViewGroup) null);
        this.papa_user_round = (TextView) inflate.findViewById(R.id.papa_user_round);
        this.biground = (TextView) inflate.findViewById(R.id.biground);
        this.downloadLayout = (LinearLayout) inflate.findViewById(R.id.downloadLayout);
        this.scroll_text = (TextView) inflate.findViewById(R.id.scroll_text);
        this.scroll_text_layout = (ScrollTextViewLayout) inflate.findViewById(R.id.scroll_text_layout);
        this.hasNewFinishedGameImage = (ImageView) inflate.findViewById(R.id.hasNewFinishedGameImage);
        this.downloadLine = (ImageView) inflate.findViewById(R.id.downloadLine);
        this.imageLoading = (ImageView) inflate.findViewById(R.id.imageLoading);
        this.coinFloatad = (SimpleDraweeView) inflate.findViewById(R.id.coinFloatad);
        this.user_icon = (SimpleDraweeView) inflate.findViewById(R.id.papa_user_icon);
        View findViewById = inflate.findViewById(R.id.statubar);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 21) {
            layoutParams.height = com.join.android.app.common.utils.n.v(this.context);
        }
        findViewById.setLayoutParams(layoutParams);
        this.layout_others.addView(inflate);
        this.downloadLayout.setOnClickListener(new e());
    }

    void invite(final FriendInviteBean friendInviteBean) {
        SmartPopupWindow smartPopupWindow = this.invitePop;
        if (smartPopupWindow != null && smartPopupWindow.isShowing()) {
            this.handler.removeCallbacks(this.f34543r);
            this.invitePop.dismiss();
        }
        com.join.android.app.common.utils.n.n(this);
        Activity w4 = com.join.android.app.common.utils.n.w();
        if (w4 == null) {
            return;
        }
        View inflate = LayoutInflater.from(this).inflate(R.layout.pop_friend_invite, (ViewGroup) null);
        SmartPopupWindow b5 = SmartPopupWindow.f.a(w4, inflate).e(false).d(R.style.animationFromRight).b();
        this.invitePop = b5;
        b5.setWidth(getResources().getDimensionPixelOffset(R.dimen.wdp465));
        this.invitePop.setHeight(getResources().getDimensionPixelOffset(R.dimen.wdp137));
        inflate.findViewById(R.id.accept).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MGMainActivity.this.lambda$invite$10(view);
            }
        });
        inflate.findViewById(R.id.decline).setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MGMainActivity.this.lambda$invite$11(friendInviteBean, view);
            }
        });
        this.avatar = (SimpleDraweeView) inflate.findViewById(R.id.avatar);
        this.name = (TextView) inflate.findViewById(R.id.name);
        this.gameName = (TextView) inflate.findViewById(R.id.gameName);
        this.name.setText(friendInviteBean.getFromNickname());
        this.gameName.setText(friendInviteBean.getGameName());
        MyImageLoader.x(this.avatar, friendInviteBean.getAvatar());
        this.invitePop.B(w4.getWindow().getDecorView(), 3, 4);
        this.handler.postDelayed(this.f34543r, AbstractTrafficShapingHandler.DEFAULT_MAX_TIME);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean isHomePopupAdCached(com.join.mgps.dto.PopupAdBean r8) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            if (r8 == 0) goto L68
            java.util.List r2 = r8.getBig_pic()     // Catch: java.lang.Exception -> L66
            if (r2 == 0) goto L68
            java.util.List r2 = r8.getBig_pic()     // Catch: java.lang.Exception -> L66
            int r2 = r2.size()     // Catch: java.lang.Exception -> L66
            if (r2 <= 0) goto L68
            java.util.List r2 = r8.getBig_pic()     // Catch: java.lang.Exception -> L66
            int r2 = r2.size()     // Catch: java.lang.Exception -> L66
            r3 = 0
            r4 = 0
        L1e:
            if (r3 >= r2) goto L62
            java.util.List r5 = r8.getBig_pic()     // Catch: java.lang.Exception -> L66
            java.lang.Object r5 = r5.get(r3)     // Catch: java.lang.Exception -> L66
            com.join.mgps.dto.RecomDatabean r5 = (com.join.mgps.dto.RecomDatabean) r5     // Catch: java.lang.Exception -> L66
            com.join.mgps.dto.ModleBean r6 = r5.getMain()     // Catch: java.lang.Exception -> L66
            if (r6 == 0) goto L5f
            com.join.mgps.dto.ModleBean r6 = r5.getMain()     // Catch: java.lang.Exception -> L66
            java.lang.String r6 = r6.getPic_remote()     // Catch: java.lang.Exception -> L66
            boolean r6 = com.join.mgps.Util.g2.i(r6)     // Catch: java.lang.Exception -> L66
            if (r6 == 0) goto L5f
            com.join.mgps.dto.ModleBean r5 = r5.getMain()     // Catch: java.lang.Exception -> L66
            java.lang.String r5 = r5.getPic_remote()     // Catch: java.lang.Exception -> L66
            boolean r6 = com.join.mgps.Util.l0.n(r5)     // Catch: java.lang.Exception -> L66
            if (r6 != 0) goto L5d
            boolean r6 = r7.isHomePopupAdLocalCached(r5)     // Catch: java.lang.Exception -> L66
            if (r6 == 0) goto L53
            goto L5d
        L53:
            android.content.Context r6 = r7.context     // Catch: java.lang.Exception -> L66
            java.io.File r6 = com.join.mgps.Util.v.b(r6)     // Catch: java.lang.Exception -> L66
            com.join.mgps.Util.l0.f(r5, r7, r6, r0)     // Catch: java.lang.Exception -> L66
            goto L5f
        L5d:
            int r4 = r4 + 1
        L5f:
            int r3 = r3 + 1
            goto L1e
        L62:
            if (r4 != r2) goto L68
            r2 = 1
            goto L69
        L66:
            r8 = move-exception
            goto Lbf
        L68:
            r2 = 0
        L69:
            if (r8 == 0) goto Lc3
            java.util.List r3 = r8.getMore()     // Catch: java.lang.Exception -> Lbd
            if (r3 == 0) goto Lc3
            java.util.List r3 = r8.getMore()     // Catch: java.lang.Exception -> Lbd
            int r3 = r3.size()     // Catch: java.lang.Exception -> Lbd
            if (r3 <= 0) goto Lc3
            java.util.List r8 = r8.getMore()     // Catch: java.lang.Exception -> Lbd
            java.lang.Object r8 = r8.get(r1)     // Catch: java.lang.Exception -> Lbd
            com.join.mgps.dto.RecomDatabean r8 = (com.join.mgps.dto.RecomDatabean) r8     // Catch: java.lang.Exception -> Lbd
            if (r8 == 0) goto Lc3
            com.join.mgps.dto.ModleBean r1 = r8.getMain()     // Catch: java.lang.Exception -> Lbd
            if (r1 == 0) goto Lc3
            com.join.mgps.dto.ModleBean r1 = r8.getMain()     // Catch: java.lang.Exception -> Lbd
            java.lang.String r1 = r1.getPic_remote()     // Catch: java.lang.Exception -> Lbd
            boolean r1 = com.join.mgps.Util.g2.i(r1)     // Catch: java.lang.Exception -> Lbd
            if (r1 == 0) goto Lc3
            com.join.mgps.dto.ModleBean r8 = r8.getMain()     // Catch: java.lang.Exception -> Lbd
            java.lang.String r8 = r8.getPic_remote()     // Catch: java.lang.Exception -> Lbd
            boolean r1 = com.join.mgps.Util.l0.n(r8)     // Catch: java.lang.Exception -> Lbd
            if (r1 != 0) goto Lba
            boolean r1 = r7.isHomePopupAdLocalCached(r8)     // Catch: java.lang.Exception -> Lbd
            if (r1 == 0) goto Lb0
            goto Lba
        Lb0:
            android.content.Context r1 = r7.context     // Catch: java.lang.Exception -> Lbd
            java.io.File r1 = com.join.mgps.Util.v.b(r1)     // Catch: java.lang.Exception -> Lbd
            com.join.mgps.Util.l0.f(r8, r7, r1, r0)     // Catch: java.lang.Exception -> Lbd
            goto Lc3
        Lba:
            r2 = r2 & 1
            goto Lc3
        Lbd:
            r8 = move-exception
            r1 = r2
        Lbf:
            r8.printStackTrace()
            goto Lc4
        Lc3:
            r1 = r2
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGMainActivity.isHomePopupAdCached(com.join.mgps.dto.PopupAdBean):boolean");
    }

    boolean isHomePopupAdLocalCached(String str) {
        return new File(com.join.mgps.Util.v.b(this.context), com.join.mgps.Util.h0.o(str)).exists();
    }

    public boolean isRunService(Context context, String str) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        try {
            runningServices = ((ActivityManager) context.getSystemService(TTDownloadField.TT_ACTIVITY)).getRunningServices(Integer.MAX_VALUE);
        } catch (SecurityException e5) {
            e5.printStackTrace();
        }
        if (runningServices != null && runningServices.size() > 0) {
            for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                if (str.equals(runningServiceInfo.service.getClassName())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    void jpushInit() {
        try {
            com.join.mgps.Util.r0.i(getApplicationContext());
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = this.prefDef.lastSendAppTime().d().longValue();
            if (currentTimeMillis - longValue > 86400000 || longValue == 0) {
                this.prefDef.needsendRigeister().d().booleanValue();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void mg_category_tabselectClicked() {
        setTabSelect(1);
        showDownNotice();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void mg_chart_tabselectClicked() {
        this.notice_layout.setVisibility(8);
        setTabSelect(2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void mg_emulator_tabselect() {
        PapaMainV4Fragment_ papaMainV4Fragment_;
        showDownNotice();
        if (this.positionNum == 3 && (papaMainV4Fragment_ = this.mgPapaMainFragment) != null && (papaMainV4Fragment_ instanceof PapaMainV4Fragment_) && this.isPapaMainFragmentHasNewData) {
            this.isPapaMainFragmentHasNewData = false;
            Ext ext = new Ext();
            ext.setIsAutoRefresh(2);
            com.papa.sim.statistic.p.l(this.context).G1(ext);
        }
        setTabSelect(3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void mg_recom_tabselectClicked() {
        setTabSelect(7);
        showDownNotice();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        List<CommonAdBean> list;
        int i6;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 10000) {
            this.showInstallLayout = true;
            preLogin(true);
            checkRealName();
            if (shouldGetUpdateFeature()) {
                getUpdateFeature();
            } else {
                getHomePopupAd();
            }
            show10Permiss();
            this.splash.setVisibility(8);
        } else if (i4 != 10002) {
            if (i4 == 10003) {
                com.join.mgps.Util.v0.d("backupData", "提示弹窗2222");
                if (this.showInstallNoticeOrappDialog && (i6 = this.backupNumber) > 0) {
                    showBackupFinishDialog(i6);
                } else {
                    this.hasRunFinishforFinishDialog = true;
                }
                showDownNotice();
            } else if (i4 == 34343) {
                show10Permiss();
                preLogin(true);
                this.splash.setVisibility(8);
            } else if (i4 != 10004 && i4 == 10005 && (list = this.updateFeatureList) != null) {
                for (CommonAdBean commonAdBean : list) {
                    if (TextUtils.equals(commonAdBean.getPosition_mark(), "HOME_UPGRADE_TIPS_AD")) {
                        UpdateFeatureDialog_.j0(this).a(commonAdBean).start();
                        return;
                    }
                }
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAdVipEvent(com.join.mgps.event.b bVar) {
        DownloadTask a5 = bVar.a();
        this.mAdVipEvent = a5;
        if (a5 == null) {
            return;
        }
        String crc_link_type_val = a5.getCrc_link_type_val();
        String d5 = this.prefDef.singleGameShowDialog().d();
        if (com.join.mgps.Util.g2.h(d5)) {
            HashMap hashMap = new HashMap();
            hashMap.put(crc_link_type_val, new SingleGameAdBean(1, System.currentTimeMillis()));
            this.allJsonStr = JsonMapper.getInstance().toJson(hashMap);
            toStartGame();
            return;
        }
        new HashMap();
        Map map = (Map) JsonMapper.getInstance().fromJson(d5, JsonMapper.getInstance().getTypeFactory().constructParametricType(HashMap.class, String.class, SingleGameAdBean.class));
        if (!d5.contains(crc_link_type_val)) {
            map.put(crc_link_type_val, new SingleGameAdBean(1, System.currentTimeMillis()));
            this.allJsonStr = JsonMapper.getInstance().toJson(map);
            toStartGame();
            return;
        }
        SingleGameAdBean singleGameAdBean = (SingleGameAdBean) map.get(crc_link_type_val);
        int counts = singleGameAdBean.getCounts();
        long time = singleGameAdBean.getTime();
        int i4 = MApplication.f1495v1;
        if (!com.join.mgps.Util.y.u(time)) {
            map.put(crc_link_type_val, new SingleGameAdBean(-1, System.currentTimeMillis()));
            this.allJsonStr = JsonMapper.getInstance().toJson(map);
            showAdVipMainDialog(this.mAdVipEvent.getCrc_link_type_val());
        } else if (counts == -1) {
            toStartGame();
        } else {
            int i5 = counts + 1;
            map.put(crc_link_type_val, new SingleGameAdBean(i5, System.currentTimeMillis()));
            this.allJsonStr = JsonMapper.getInstance().toJson(map);
            if (i5 == i4) {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                this.accountBean = accountData;
                if (accountData.y() * 1000 <= System.currentTimeMillis()) {
                    showAdVipMainDialog(this.mAdVipEvent.getCrc_link_type_val());
                    return;
                } else {
                    toStartGame();
                    return;
                }
            }
            toStartGame();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAddShortcutEvent(com.join.mgps.event.c cVar) {
        if (cVar != null) {
            this.mPapaActivity.Z0(cVar.a());
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onArenaResponse(ArenaResponse arenaResponse) {
        if (arenaResponse == null) {
            return;
        }
        handleFailure(arenaResponse);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.papa.sim.statistic.p.l(this).K1(AccountUtil_.getInstance_(getApplicationContext()).getUid());
        if (new PrefDef_(this).firstShowUserPermiss().d().booleanValue()) {
            return;
        }
        MobclickAgent.onEvent(this, "mainPageShow");
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        full(getResources().getConfiguration().orientation == 2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.android.app.common.servcie.DownloadBaseActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        isCreated = true;
        this.prefDef.lastInstallApp().g("");
        MApplication.C1 = false;
        getWindow().getDecorView().setBackground(null);
        this.prefDef.platform().g("wufun");
        this.hasNet = com.join.android.app.common.utils.j.j(this);
        PluginConfig.put(this, com.join.mgps.mod.utils.d.f53632o, "wufun");
        PluginConfig.put(this, com.join.mgps.mod.utils.d.f53633p, "wufunNormal");
        PluginConfig.put(this, com.join.mgps.mod.utils.d.f53634q, com.join.android.app.mgsim.wufun.b.f15663n + "");
        handleVideoAdWatchLogRecord();
    }

    @Override // com.join.android.app.common.servcie.DownloadBaseActivity, com.join.mgps.activity.MyFragmentActivity1, com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.activityHasDes = true;
        com.papa.sim.statistic.p.l(getApplicationContext()).K2(1, AccountUtil_.getInstance_(getApplicationContext()).getUid());
        try {
            if (!this.isBackHome) {
                if (this.isMessageReceiverRegisted) {
                    unregisterReceiver(this.mMessageReceiver);
                    this.isMessageReceiverRegisted = false;
                }
                v0 v0Var = this.receiver;
                if (v0Var != null) {
                    unregisterReceiver(v0Var);
                }
                u0 u0Var = this.mAdReceived;
                if (u0Var != null) {
                    unregisterReceiver(u0Var);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        MApplication.f1496w = true;
        this.isDestroyed = true;
        com.join.mgps.Util.d0.a().e(this);
        if (!this.prefDef.firstShowUserPermiss().d().booleanValue()) {
            com.wufan.friend.chat.c.u().Z();
        }
        com.join.android.app.component.video.h.d();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        super.onDestroy();
    }

    @Override // com.join.android.app.common.servcie.DownloadBaseActivity
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadRuntimeEvent(com.join.mgps.event.l lVar) {
        if (System.currentTimeMillis() - this.lastcheckDownService > 20000) {
            this.lastcheckDownService = System.currentTimeMillis();
            if (!com.php25.PDownload.d.g(this.context)) {
                UtilsMy.Q3(getApplicationContext());
            }
        }
        super.onDownloadRuntimeEvent(lVar);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        if (nVar.c() == 8) {
            updateWaterProgress();
        } else {
            updateStartGameTable(nVar.a());
        }
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            updateUI(a5, 1);
        } else if (c5 != 3) {
            if (c5 == 5) {
                sendHomeDownInstallListPoint();
            } else if (c5 == 6) {
                updateUI(a5, 6);
                return;
            } else if (c5 == 7) {
                a5.setStatus(7);
                updateUI(a5, 3);
                sendHomeDownInstallListPoint();
                return;
            } else if (c5 == 8) {
                updateUI(a5, 4);
                return;
            } else if (c5 != 48) {
                switch (c5) {
                    case 10:
                        if (a5 == null) {
                            return;
                        }
                        updateUI(a5, 7);
                        return;
                    case 11:
                        break;
                    case 12:
                        updateUI(a5, 8);
                        return;
                    case 13:
                        updateUI(a5, 9);
                        return;
                    default:
                        return;
                }
            }
            if (this.isFirstCommendVersion) {
                showDownNotice();
            }
            updateUI(a5, 5);
        } else {
            updateUI(a5, 2);
        }
    }

    @Override // com.BaseAppCompatActivity
    public void onFavoriteChanged(int i4, boolean z4) {
        super.onFavoriteChanged(i4, z4);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFriendEvent(com.wufan.friend.chat.protocol.w1 w1Var) {
        if (w1Var == null) {
            return;
        }
        if (w1Var.C() == 1) {
            if (w1Var.I() == 1) {
                if (w1Var.getData() != null && w1Var.getData().z2() != null && w1Var.getData().z2().D0()) {
                    com.join.mgps.Util.w0.e("channel", "登录成功！");
                    com.wufan.friend.chat.c.u().T(true);
                    com.wufan.friend.chat.c.u().U(0);
                } else {
                    com.join.mgps.Util.w0.e("channel", w1Var.getData().z2().getMessage());
                    this.handler.postDelayed(new Runnable() { // from class: com.join.mgps.activity.y0
                        @Override // java.lang.Runnable
                        public final void run() {
                            MGMainActivity.lambda$onFriendEvent$7();
                        }
                    }, com.join.mgps.data.c.f49010a);
                }
            } else if (w1Var.I() == 5 && w1Var.getData() != null && w1Var.getData().getNotification() != null && w1Var.getData().getNotification().m2() != null) {
                com.wufan.friend.chat.protocol.x m22 = w1Var.getData().getNotification().m2();
                try {
                    if ((m22.g().d() + "").equals(AccountUtil_.getInstance_(this).getUid())) {
                        Intent intent = new Intent("com.join.android.app.mgsim.wufun.broadcast.onOnlineState");
                        intent.putExtra(NoticeTopAnimActivityDialog_.f36148o, m22.getStateValue());
                        sendBroadcast(intent);
                        com.wufan.friend.chat.c.u().W(m22.getStateValue());
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
        if (w1Var.B1() == 4) {
            com.wufan.friend.chat.c.u().M();
        } else if (w1Var.B1() == 1) {
            try {
                FriendInviteBean friendInviteBean = new FriendInviteBean();
                friendInviteBean.set(w1Var.getData().getNotification().i1());
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                if (accountData != null && friendInviteBean.getAccountId() == accountData.getUid()) {
                    com.wufan.friend.chat.c.u().R(friendInviteBean);
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        } else if (w1Var.B1() == 10) {
            if (w1Var.getData() != null && w1Var.getData().getNotification() != null && w1Var.getData().getNotification().L1() != null) {
                showToast(w1Var.getData().getNotification().L1().getMessage());
            }
        } else if (w1Var.B1() == 2) {
            try {
                com.wufan.friend.chat.protocol.x m23 = w1Var.getData().getNotification().m2();
                if ((m23.g().d() + "").equals(AccountUtil_.getInstance_(this).getUid())) {
                    Intent intent2 = new Intent("com.join.android.app.mgsim.wufun.broadcast.onOnlineState");
                    intent2.putExtra(NoticeTopAnimActivityDialog_.f36148o, m23.getStateValue());
                    sendBroadcast(intent2);
                    com.wufan.friend.chat.c.u().W(m23.getStateValue());
                }
            } catch (Exception e7) {
                e7.printStackTrace();
            }
        }
        if (w1Var.getData() == null || w1Var.getData().K0() == null || !w1Var.getData().K0().G0()) {
            return;
        }
        toast(w1Var.getData().K0().getMessage());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFriendInviteEvent(final FriendInviteBean friendInviteBean) {
        if (friendInviteBean == null) {
            return;
        }
        try {
            com.join.android.app.common.utils.n.n(this);
            final boolean G = com.join.android.app.common.utils.n.G(this);
            this.handler.postDelayed(new Runnable() { // from class: com.join.mgps.activity.x0
                @Override // java.lang.Runnable
                public final void run() {
                    MGMainActivity.this.lambda$onFriendInviteEvent$8(G, friendInviteBean);
                }
            }, 200L);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4 && keyEvent.getAction() == 0) {
            if (com.join.android.app.component.video.a.c0(this, "DiscoveryFragment")) {
                return true;
            }
            VideoStrategyPop videoStrategyPop = this.videoStrategyPop;
            if (videoStrategyPop != null && videoStrategyPop.isShowing()) {
                return true;
            }
            if (this.isOpenExit == 1) {
                if (System.currentTimeMillis() - this.exitTime > 2000) {
                    Toast.makeText(getApplicationContext(), "再按一次退出程序", 0).show();
                    this.exitTime = System.currentTimeMillis();
                } else {
                    MApplication.C1 = true;
                    com.papa.sim.statistic.p.l(getApplicationContext()).K2(1, AccountUtil_.getInstance_(getApplicationContext()).getUid());
                    try {
                        if (this.isMessageReceiverRegisted) {
                            unregisterReceiver(this.mMessageReceiver);
                            this.isMessageReceiverRegisted = false;
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    finish();
                    sendBroadcast(new Intent(o1.a.f72038z));
                }
                return true;
            }
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity
    public void onNetworkChanged(int i4) {
        super.onNetworkChanged(i4);
        this.hasNet = com.join.android.app.common.utils.j.j(this);
        preLogin(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            int i4 = extras.getInt(this.mainPos);
            if (i4 != 0) {
                this.positionNum = i4;
            }
            String string = extras.getString("currTabTagId", "");
            this.currTabTagId = string;
            if (com.join.mgps.Util.g2.i(string)) {
                this.currTabNumber = extras.getInt("currTabNumber", -1);
            }
            this.currGameId = extras.getString("currGameId");
            this.classiFy = extras.getInt("classiFy");
            this.classifyPrimaryIndex = extras.getInt("classifyPrimaryIndex");
            this.intentDateBean = (IntentDateBean) extras.getSerializable("intentDateBean");
        }
        try {
            IntentDateBean intentDateBean = (IntentDateBean) intent.getSerializableExtra("intentActivityBean");
            if (intentDateBean != null) {
                IntentUtil.getInstance().intentActivity(this, intentDateBean);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        setJPushJump();
        setTabSelect(this.positionNum);
        if (TextUtils.equals("uninstall", intent.getStringExtra("dynamicShortcutType"))) {
            UninstallWufunActivity_.I0(this).start();
            setIntent(new Intent());
        }
    }

    @Override // com.join.android.app.common.servcie.DownloadBaseActivity, com.join.mgps.activity.MyFragmentActivity1, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        isForeground = false;
        if (!new PrefDef_(this).firstShowUserPermiss().d().booleanValue()) {
            MobclickAgent.onPause(this);
        }
        super.onPause();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onRecivedIntentEvent(IntentClassfyEvent intentClassfyEvent) {
        this.currTabNumber = intentClassfyEvent.getType();
        setTabSelect(7);
    }

    @Override // com.join.mgps.activity.MyFragmentActivity1, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        resume();
        if (getIntent() == null || !TextUtils.equals("uninstall", getIntent().getStringExtra("dynamicShortcutType"))) {
            return;
        }
        UninstallWufunActivity_.I0(this).start();
        setIntent(new Intent());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onToastEvent(com.join.mgps.event.v vVar) {
        if (vVar == null || TextUtils.isEmpty(vVar.a())) {
            return;
        }
        showToast(vVar.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 1000)
    public void onresumData() {
        try {
            com.papa.sim.statistic.p.l(this).X1(AccountUtil_.getInstance_(this).getUid());
            com.constant.a.d();
            checkDownlodingNumber();
            if (!new PrefDef_(this).firstShowUserPermiss().d().booleanValue()) {
                MobclickAgent.onResume(this);
                MobclickAgent.onEvent(this, "ym_test156");
            }
            updateAndroidApp();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void preLoad(PopupAdBean popupAdBean) {
        RecomDatabean recomDatabean;
        if (popupAdBean != null) {
            try {
                if (popupAdBean.getBig_pic() != null && popupAdBean.getBig_pic().size() > 0) {
                    int size = popupAdBean.getBig_pic().size();
                    for (int i4 = 0; i4 < size; i4++) {
                        RecomDatabean recomDatabean2 = popupAdBean.getBig_pic().get(i4);
                        if (recomDatabean2.getMain() != null && com.join.mgps.Util.g2.i(recomDatabean2.getMain().getPic_remote())) {
                            String pic_remote = recomDatabean2.getMain().getPic_remote();
                            if (!isHomePopupAdLocalCached(pic_remote)) {
                                com.join.mgps.Util.l0.f(pic_remote, this, com.join.mgps.Util.v.b(this.context), null);
                            }
                        }
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        if (popupAdBean == null || popupAdBean.getMore() == null || popupAdBean.getMore().size() <= 0 || (recomDatabean = popupAdBean.getMore().get(0)) == null || recomDatabean.getMain() == null || !com.join.mgps.Util.g2.i(recomDatabean.getMain().getPic_remote())) {
            return;
        }
        String pic_remote2 = recomDatabean.getMain().getPic_remote();
        if (isHomePopupAdLocalCached(pic_remote2)) {
            return;
        }
        com.join.mgps.Util.l0.f(pic_remote2, this, com.join.mgps.Util.v.b(this.context), null);
    }

    void preLoadBootImage(BootPageData bootPageData) {
        String[] pic;
        String[] pic2;
        if (bootPageData != null) {
            this.prefDef.insatllAppFirstData().g(JsonMapper.getInstance().toJson(bootPageData));
            BootPageItem game_setup_boot = bootPageData.getGame_setup_boot();
            BootPageItem performance_boot = bootPageData.getPerformance_boot();
            if (game_setup_boot != null) {
                for (String str : game_setup_boot.getPic()) {
                    if (!isHomePopupAdLocalCached(str)) {
                        com.join.mgps.Util.l0.f(str, this, com.join.mgps.Util.v.b(this.context), null);
                    }
                }
            }
            if (performance_boot != null) {
                for (String str2 : performance_boot.getPic()) {
                    if (!isHomePopupAdLocalCached(str2)) {
                        com.join.mgps.Util.l0.f(str2, this, com.join.mgps.Util.v.b(this.context), null);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void preLogin(boolean z4) {
        this.preloginQueenCount++;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.preloginRunnable);
        } else {
            this.mHandler = new Handler();
        }
        this.mHandler.post(this.preloginRunnable.W(z4));
        if (z4) {
            goToOnekeyLogin();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void preloadingAD() {
        if (com.join.android.app.common.utils.j.j(this.context)) {
            try {
                ResultMainBean<List<GameHeadAd>> v12 = this.recommendClient.v1(RequestBeanUtil.getInstance(this.context).getPreloadingADRequestBean());
                if (v12 == null || v12.getCode() != 600) {
                    return;
                }
                setADCacheData(v12.getMessages().getData());
            } catch (Exception e5) {
                StringBuilder sb = new StringBuilder();
                sb.append("e:");
                sb.append(e5.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void pullUpExtHelper() {
    }

    public void raseVipToMgsim(int i4, String str, String str2) {
        if (com.join.mgps.Util.g2.h(str2)) {
            str2 = com.join.mgps.rpc.h.f54056j + "/member/vip_view/welfare/third_other_ad";
        }
        ComponentName componentName = new ComponentName(this, "com.join.mgps.activity.ShareWebActivity_");
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.setAction("android.intent.action.VIEW");
        intent.putExtra("PAPA_EMU_INTENT_EXTRA_ACTION_FROM", i4 + "");
        intent.putExtra("gameId", str + "");
        intent.putExtra("url", str2);
        intent.setAction("com.join.mgps.papa.share_webview_raiseVip");
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void receiveDelete(DownloadTask downloadTask) {
        List<DownloadTask> list = this.downloadTasks;
        if (list == null) {
            return;
        }
        Iterator<DownloadTask> it2 = list.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.downloadTasksMap.remove(next.getCrc_link_type_val());
                it2.remove();
                List<DownloadTask> R = p1.f.K().R(null);
                if (R != null && R.size() == 0) {
                    this.prefDef.isNewFinishedGame().g(Boolean.FALSE);
                    ImageView imageView = this.hasNewFinishedGameImage;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                }
                checkDownlodingNumber();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void receiveStart(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            try {
                if (!TextUtils.isEmpty(downloadTask.getCrc_link_type_val())) {
                    com.join.mgps.Util.w1.g(this, downloadTask.getCrc_link_type_val());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        UtilsMy.A4(this.downloadTasks);
        Map<String, DownloadTask> map = this.downloadTasksMap;
        if (map == null) {
            return;
        }
        if (map.containsKey(downloadTask.getCrc_link_type_val())) {
            if (i4 != 1 && i4 != 7) {
                if (downloadTask.getStatus() == 3 || downloadTask.getStatus() == 6) {
                    checkDownlodingNumber();
                    return;
                }
                return;
            }
            checkDownlodingNumber();
            return;
        }
        List<DownloadTask> list = this.downloadTasks;
        if (list != null) {
            list.add(downloadTask);
        }
        this.downloadTasksMap.put(downloadTask.getCrc_link_type_val(), downloadTask);
        String[] strArr = {"", "size", "", "size"};
        ScrollTextViewLayout scrollTextViewLayout = this.scroll_text_layout;
        if (scrollTextViewLayout != null) {
            scrollTextViewLayout.setTextArray(strArr);
            this.scroll_text_layout.setIsStop(false);
            this.scroll_text_layout.n();
        }
        checkDownlodingNumber();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.downloadTasksMap;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            if (this.downloadTasks == null) {
                this.downloadTasks = new ArrayList();
            }
            this.downloadTasks.add(downloadTask);
            this.downloadTasksMap.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        DownloadTask downloadTask2 = this.downloadTasksMap.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        checkDownlodingNumber();
        this.prefDef.isNewFinishedGame().g(Boolean.TRUE);
        ImageView imageView = this.hasNewFinishedGameImage;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72027t0})
    public void receivedInitAdVideoConfig(Intent intent) {
        initAdVideoConfig();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.intent.showtoast"})
    public void recivedShowToast(Intent intent) {
        showMessage(intent.getStringExtra("message"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.E})
    public void recveidDownLiveRes(Intent intent) {
        String stringExtra = intent.getStringExtra("downLoadUrl");
        com.join.mgps.Util.v0.d("liveResLog", "recveidDownLiveRes");
        if (this.downloadUrl.equals(stringExtra)) {
            this.hasNewDownload = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.F})
    public void recveidcoinfloat(Intent intent) {
        if (this.coinFloatad == null) {
            return;
        }
        RecomDatabean recomDatabean = null;
        if (intent != null) {
            try {
                recomDatabean = (RecomDatabean) intent.getSerializableExtra("coinFloatData");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (recomDatabean != null && recomDatabean.getMain().getAd_switch() == 1) {
            if (com.join.android.app.common.utils.g.g(this.prefDef.clickFloatViewTime().d().longValue())) {
                this.coinFloatad.setVisibility(8);
                return;
            }
            this.coinFloatad.setVisibility(8);
            if (com.join.mgps.Util.g2.i(recomDatabean.getMain().getPic_remote())) {
                MyImageLoader.i(this.coinFloatad, recomDatabean.getMain().getPic_remote(), r.c.f11294a);
                this.coinFloatad.setVisibility(0);
                this.coinFloatad.setOnClickListener(new i(recomDatabean));
                return;
            }
            this.coinFloatad.setVisibility(8);
            return;
        }
        this.coinFloatad.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void refreshTabIcon() {
        if (this.isPapaMainFragmentHasNewData) {
            this.mg_emulator_image.setImageResource(R.drawable.mg_main_has_new_data);
            this.mg_emulator_text.setText("刷新推荐");
            this.unreadMessageBadge.setVisibility(0);
            ObjectAnimator objectAnimator = this.animation2;
            if (objectAnimator == null || !objectAnimator.isRunning()) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mg_emulator_image, Key.ROTATION, 0.0f, 720.0f);
                this.animation2 = ofFloat;
                ofFloat.setInterpolator(new DecelerateInterpolator());
                this.animation2.setDuration(2500L);
                this.animation2.start();
                ImageView imageView = this.mg_emulator_image;
                imageView.setPivotX(imageView.getMeasuredWidth() / 2);
                ImageView imageView2 = this.mg_emulator_image;
                imageView2.setPivotY(imageView2.getMeasuredHeight() / 2);
            }
            if (System.currentTimeMillis() - this.LastOpHomePageButtonTime > 1000) {
                Ext ext = new Ext();
                ext.setIsAutoRefresh(1);
                com.papa.sim.statistic.p.l(this.context).G1(ext);
                this.LastOpHomePageButtonTime = System.currentTimeMillis();
                return;
            }
            return;
        }
        ObjectAnimator objectAnimator2 = this.animation2;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
            this.mg_emulator_image.animate().rotation(0.0f).setDuration(50L).start();
        }
        this.mg_emulator_image.setImageResource(R.drawable.mg_shop_selectback_pressed);
        this.mg_emulator_text.setText("首页");
        this.unreadMessageBadge.setVisibility(8);
    }

    public void registerMessageReceiver() {
        this.mMessageReceiver = new MessageReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.setPriority(1000);
        intentFilter.addAction(MESSAGE_RECEIVED_ACTION);
        registerReceiver(this.mMessageReceiver, intentFilter);
        this.isMessageReceiverRegisted = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void reject(int i4) {
        try {
            if (com.ta.utdid2.android.utils.f.f(this)) {
                HashMap hashMap = new HashMap();
                hashMap.put("uid", AccountUtil_.getInstance_(this).getUid());
                hashMap.put("token", AccountUtil_.getInstance_(this).getToken());
                hashMap.put("friendId", Integer.valueOf(i4));
                this.friendClient.j(hashMap);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void resetSelfSupportPrmopt() {
        int y2 = com.join.android.app.common.utils.n.n(this).y();
        if (this.prefDef.versionCode().d().intValue() != y2) {
            this.prefDef.noPromptDownload().g(Boolean.FALSE);
            this.prefDef.versionCode().g(Integer.valueOf(y2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void rewadCopper() {
        com.wufan.user.service.protobuf.n0 accountData;
        List<RewardBean> data;
        RewardBean rewardBean;
        try {
            if (!com.join.android.app.common.utils.j.j(this) || (accountData = AccountUtil_.getInstance_(this).getAccountData()) == null) {
                return;
            }
            ResultMainBean<List<RewardBean>> i02 = this.rpcClient.i0(RequestBeanUtil.getInstance(this).vipMessage(accountData.getUid()));
            if (i02 == null || i02.getFlag() != 1 || (data = i02.getMessages().getData()) == null || data.size() <= 0 || (rewardBean = data.get(0)) == null) {
                return;
            }
            toastData(rewardBean);
            this.papa_user_round.setVisibility(0);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void sanLocalGameIv(int i4) {
        try {
            this.curActivty = MApplication.f1497x.getActivity();
            List<String> list = this.snkGameList;
            if (list != null && list.size() != 0) {
                if (i4 == 0) {
                    Activity activity = this.curActivty;
                    if (activity != null || (activity instanceof FragmentActivity)) {
                        com.join.android.app.common.dialog.f fVar = this.localGameOneDialog;
                        if (fVar != null) {
                            try {
                                fVar.dismiss();
                            } catch (Exception unused) {
                            }
                            this.localGameOneDialog = null;
                        }
                        com.join.android.app.common.dialog.f fVar2 = new com.join.android.app.common.dialog.f(this.curActivty, i4);
                        this.localGameOneDialog = fVar2;
                        fVar2.show();
                        this.localGameOneDialog.f(new k());
                        return;
                    }
                    return;
                }
                List<String> k4 = com.join.mgps.Util.h0.k(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath());
                this.listZip = k4;
                if (k4 == null || k4.size() <= 0) {
                    return;
                }
                initCheckSNKGame(this.listZip, i4);
                return;
            }
            this.isFirstCheck = true;
            getSNKGameInfo(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void savePurchasedList(List<AppBean> list) {
        b2.e0.o().a();
        if (list != null) {
            for (AppBean appBean : list) {
                b2.e0.o().m(new PurchasedListTable(appBean));
            }
        }
        UtilsMy.Q2(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void saveUUID() {
        String str = Environment.getExternalStorageDirectory().getAbsolutePath() + File.separator + ".papakey";
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        File file = new File(str);
        if (!file.exists()) {
            String uuid = UUID.randomUUID().toString();
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
                com.join.mgps.Util.g0.A(".papakey", absolutePath, uuid);
                com.join.mgps.pref.h.n(this.context).w0(uuid);
                return;
            } catch (IOException e5) {
                e5.printStackTrace();
                return;
            }
        }
        try {
            if (com.join.mgps.Util.g2.h(com.join.mgps.pref.h.n(this.context).H())) {
                String x4 = com.join.mgps.Util.g0.x(MApplication.f1497x, str);
                if (com.join.mgps.Util.g2.h(x4)) {
                    String uuid2 = UUID.randomUUID().toString();
                    try {
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                        com.join.mgps.Util.g0.A(".papakey", absolutePath, uuid2);
                        com.join.mgps.pref.h.n(this.context).w0(uuid2);
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                } else {
                    com.join.mgps.pref.h.n(this.context).w0(x4);
                }
            }
        } catch (IOException e7) {
            e7.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 3000)
    public void scanQuarkTask() {
        if (ContextCompat.checkSelfPermission(this, com.kuaishou.weapon.p0.g.f55589i) == 0) {
            ((CommonService_.h2) CommonService_.S2(this).extra("action", "retrieveQuarkScanEvent")).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 800)
    public void selectTableDelay() {
        setTabSelect(this.positionNum);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1000)
    public void sendHomeDownInstallListPoint() {
        try {
            ArrayList<Long> B = p1.f.K().B();
            Ext ext = new Ext();
            ext.setGameList(JsonMapper.getInstance().toJson(B));
            com.papa.sim.statistic.p.l(this.context).O1(Event.homeDownInstallList, ext);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void sendRegister(String str) {
        sendRigester(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void sendRigester(String str) {
        List<CommentSendMessageResultBean> data;
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RegisterRequestBean registerRequestBean = new RegisterRequestBean();
                registerRequestBean.setReg_id(str);
                registerRequestBean.setTimes(System.currentTimeMillis());
                ResultMainBean<List<CommentSendMessageResultBean>> J1 = this.recommendClient.J1(RequestBeanUtil.getInstance(this).sendRegisterId(registerRequestBean));
                if (J1 == null || J1.getFlag() == 0 || (data = J1.getMessages().getData()) == null || data.size() <= 0) {
                    return;
                }
                CommentSendMessageResultBean commentSendMessageResultBean = data.get(0);
                if (commentSendMessageResultBean.getVal() == null || commentSendMessageResultBean.getVal().equals("") || !commentSendMessageResultBean.getVal().equals("true")) {
                    return;
                }
                this.prefDef.needsendRigeister().g(Boolean.FALSE);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void sendVideoAdWatchLog(int i4, int i5) {
        VideoWatchLogTable videoWatchLogTable = new VideoWatchLogTable();
        videoWatchLogTable.setSceneType(i4);
        videoWatchLogTable.setSdkType(i5);
        videoWatchLogTable.setUserId(this.accountBean.getUid());
        videoAdWatchLog(videoWatchLogTable, false);
        handleVideoAdWatchLogRecord();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void serverConnectionException() {
        com.join.android.app.common.manager.a.h().j(this, this.netConnectException, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void setADCacheData(List<GameHeadAd> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        GameHeadAd gameHeadAd = list.get(0);
        if (gameHeadAd.getMain() == null || gameHeadAd.getSub() == null || gameHeadAd.getSub().size() <= 0) {
            return;
        }
        MApplication.W = gameHeadAd;
        String pic_remote = gameHeadAd.getMain().getPic_remote();
        StringBuilder sb = new StringBuilder();
        sb.append("iamgeUrl:");
        sb.append(pic_remote);
        if (com.join.mgps.Util.g2.h(pic_remote)) {
            return;
        }
        saveImageFromUrl(pic_remote, this.context);
    }

    public void setClassifyPrimaryIndex(int i4) {
        this.classifyPrimaryIndex = i4;
    }

    void setDefutDownloadPath() {
        com.join.mgps.Util.v.e(this.context);
        com.join.mgps.pref.h.n(this).V(com.join.mgps.Util.v.f28105e);
        show10Permiss();
    }

    public void setHomeTabImage(boolean z4) {
        this.showMonkey = z4;
        if (z4) {
            this.home_tab_monkey_image.startAnimation(AnimationUtils.loadAnimation(this, R.anim.papamain_tabhome_movedown2));
            this.home_tab_huojian_image.startAnimation(AnimationUtils.loadAnimation(this, R.anim.papamain_tabhome_movedown));
            return;
        }
        this.home_tab_monkey_image.startAnimation(AnimationUtils.loadAnimation(this, R.anim.papamain_tabhome_move));
        this.home_tab_huojian_image.startAnimation(AnimationUtils.loadAnimation(this, R.anim.papamain_tabhome_move2));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void setJPushJump() {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGMainActivity.setJPushJump():void");
    }

    public void setPapaMainFragmentLastPosition(String str) {
        PapaMainV4Fragment_ papaMainV4Fragment_ = this.mgPapaMainFragment;
        if (papaMainV4Fragment_ != null) {
            boolean z4 = papaMainV4Fragment_ instanceof PapaMainV4Fragment_;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void setSNKGameData(SNKGameInfoBean sNKGameInfoBean) {
        List<String> k4;
        this.snkGameList = sNKGameInfoBean.getScanning_md5();
        if (this.isFirstCheck) {
            this.isFirstCheck = false;
            if (this.context.getSharedPreferences("downloadplato", 0).getLong("plato", 0L) <= 0 || (k4 = com.join.mgps.Util.h0.k(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath())) == null || k4.size() <= 0) {
                return;
            }
            initCheckSNKGame(k4, 1);
        }
    }

    public void setSnkGameList(List<String> list) {
        this.snkGameList = list;
    }

    public void setTabSelect(int i4) {
        IntentDateBean intentDateBean;
        this.positionNum = i4;
        clearSelection();
        FragmentManager fragmentManager = this.fragmentManager;
        if (fragmentManager == null) {
            return;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        hideFragments(beginTransaction);
        updateStartGameTable(null);
        LinearLayout linearLayout = this.discoverNormal;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        switch (i4) {
            case 1:
            case 6:
                Fragment fragment = this.userCenterFragment;
                if (fragment == null) {
                    UsercenterFragmentNew_ usercenterFragmentNew_ = new UsercenterFragmentNew_();
                    this.userCenterFragment = usercenterFragmentNew_;
                    beginTransaction.add(R.id.mg_mian_fragmentlayout, usercenterFragmentNew_);
                } else {
                    beginTransaction.show(fragment);
                    this.userCenterFragment.refreshUserCenter();
                }
                this.mg_category_image.setImageResource(R.drawable.tab_usercenter_pressed);
                this.mg_category_text.setTextColor(MainYelloColor);
                hideRedPoint();
                break;
            case 2:
            case 5:
                Fragment fragment2 = this.mPapaActivity;
                if (fragment2 == null) {
                    MyGamePapaFragmentV2_ myGamePapaFragmentV2_ = new MyGamePapaFragmentV2_();
                    this.mPapaActivity = myGamePapaFragmentV2_;
                    beginTransaction.add(R.id.mg_mian_fragmentlayout, myGamePapaFragmentV2_);
                } else {
                    beginTransaction.show(fragment2);
                }
                com.papa.sim.statistic.p.l(this.context).O1(Event.enterMyGameTab, new Ext());
                this.mg_chart_text.setTextColor(MainYelloColor);
                this.mPapaActivity.n1();
                break;
            case 3:
                this.home_tab_monkey_layout.setVisibility(8);
                Fragment fragment3 = this.mgPapaMainFragment;
                if (fragment3 == null) {
                    this.mgPapaMainFragment = new PapaMainV4Fragment_();
                    FirstIntentData a5 = com.join.mgps.Util.d1.a(this);
                    if (a5 != null && (intentDateBean = a5.getIntentDateBean()) != null && intentDateBean.getLink_type() == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putString("gameId", intentDateBean.getCrc_link_type_val());
                        this.mgPapaMainFragment.setArguments(bundle);
                    }
                    beginTransaction.add(R.id.mg_mian_fragmentlayout, this.mgPapaMainFragment);
                } else {
                    beginTransaction.show(fragment3);
                }
                if (com.join.mgps.Util.g2.h(this.shortcutGameId)) {
                    com.papa.sim.statistic.p.l(this).v(ExtFrom.home.name(), AccountUtil_.getInstance_(this).getUid());
                }
                refreshTabIcon();
                this.mg_emulator_text.setTextColor(MainYelloColor);
                break;
            case 4:
                com.papa.sim.statistic.p.l(this).n2(AccountUtil_.getInstance_(this).getUid(), "findTab");
                Fragment fragment4 = this.fightFragment;
                if (fragment4 == null) {
                    DiscoveryFragmentV4_ discoveryFragmentV4_ = new DiscoveryFragmentV4_();
                    this.fightFragment = discoveryFragmentV4_;
                    beginTransaction.add(R.id.mg_mian_fragmentlayout, discoveryFragmentV4_);
                    this.discoverNormal.setVisibility(0);
                } else {
                    beginTransaction.show(fragment4);
                }
                this.fightImage.setImageResource(R.drawable.mg_discovery_selectback_pressed);
                this.fightText.setTextColor(MainYelloColor);
                TextView textView = this.endGameBadge;
                if (textView != null) {
                    textView.setVisibility(8);
                    this.prefDef.hasShowEndGameBadge().g(Boolean.TRUE);
                    break;
                }
                break;
            case 7:
                Bundle bundle2 = new Bundle();
                bundle2.putInt("currTabNumber", this.currTabNumber);
                if (com.join.mgps.Util.g2.i(this.currTabTagId)) {
                    bundle2.putString("currTabTagId", this.currTabTagId);
                }
                bundle2.putString("currGameId", this.currGameId);
                com.papa.sim.statistic.p.l(this).j2(AccountUtil_.getInstance_(this).getUid());
                Fragment fragment5 = this.choiceFragment;
                if (fragment5 == null) {
                    FindGameMainFragment findGameMainFragment = new FindGameMainFragment();
                    this.choiceFragment = findGameMainFragment;
                    findGameMainFragment.setArguments(bundle2);
                    beginTransaction.add(R.id.mg_mian_fragmentlayout, this.choiceFragment);
                } else {
                    beginTransaction.show(fragment5);
                    this.choiceFragment.setSelectedTab(bundle2);
                }
                this.mg_recom_image.setImageResource(R.drawable.mg_choice_selectback_pressed);
                this.mg_recom_text.setTextColor(MainYelloColor);
                TextView textView2 = this.miniGameBadge;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.prefDef.hasShowMiniGameBadge().g(Boolean.TRUE);
                    break;
                }
                break;
        }
        try {
            this.positionNum = i4;
            beginTransaction.commitAllowingStateLoss();
            LinearLayout linearLayout2 = this.downloadLayout;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            TextView textView3 = this.biground;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            if (i4 != 3) {
                if (this.hasNewFinishedGameImage != null) {
                    if (this.prefDef.isNewFinishedGame().d().booleanValue()) {
                        this.hasNewFinishedGameImage.setVisibility(0);
                    } else {
                        this.hasNewFinishedGameImage.setVisibility(8);
                    }
                }
                ScrollTextViewLayout scrollTextViewLayout = this.scroll_text_layout;
                if (scrollTextViewLayout != null && scrollTextViewLayout.m()) {
                    this.scroll_text_layout.p();
                }
            }
            checkDownlodingNumber();
            startPlayVideo();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        TextView textView4 = this.endGameBadge;
        if (textView4 != null) {
            textView4.setVisibility(this.prefDef.hasShowEndGameBadge().d().booleanValue() ? 8 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void setwifiStadu() {
        String apSSID = WifiUtils.getInstance(getApplicationContext()).getApSSID();
        if (com.join.mgps.Util.g2.i(apSSID)) {
            WifiUtils.getInstance(this).createWiFiAP(WifiUtils.getInstance(getApplicationContext()).createAPInfo(apSSID, com.join.mgps.data.c.f49026q), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showAdM() {
        try {
            if (this.showInstallLayout) {
                checkInstallApp();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void showAddFriend(final int i4) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (accountData == null || accountData.getUid() == i4 || accountData.getUid() == 0) {
            return;
        }
        if (this.mDialog == null) {
            Dialog dialog = new Dialog(this, R.style.newtrans_floating_dialog);
            this.mDialog = dialog;
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = dialog.getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                this.mDialog.getWindow().setAttributes(attributes);
            }
            View inflate = LayoutInflater.from(this).inflate(R.layout.dialog_friend_add, (ViewGroup) null);
            this.close = inflate.findViewById(R.id.close);
            this.button = inflate.findViewById(R.id.button);
            this.name1 = (TextView) inflate.findViewById(R.id.name);
            this.accountId = (TextView) inflate.findViewById(R.id.accountId);
            this.avatar1 = (SimpleDraweeView) inflate.findViewById(R.id.avatar);
            this.mDialog.setContentView(inflate);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.wdp526);
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.wdp509);
            Window window = this.mDialog.getWindow();
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            if (dimensionPixelOffset == 0) {
                dimensionPixelOffset = -1;
            }
            attributes2.width = dimensionPixelOffset;
            if (dimensionPixelOffset2 == 0) {
                dimensionPixelOffset2 = -1;
            }
            attributes2.height = dimensionPixelOffset2;
            window.setGravity(17);
            this.close.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.d1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MGMainActivity.this.lambda$showAddFriend$13(view);
                }
            });
        }
        this.button.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MGMainActivity.this.lambda$showAddFriend$14(i4, view);
            }
        });
        getFriendInfo(i4);
        if (!this.mDialog.isShowing()) {
            this.mDialog.show();
        }
        com.papa.sim.statistic.p.l(this).O1(Event.showInviteCode, new Ext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showBackupFinishDialog(int i4) {
        if (!this.activityHasDes && i4 > 0) {
            Intent intent = new Intent();
            intent.setAction(o1.a.f72036y);
            sendBroadcast(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dd A[Catch: Exception -> 0x00e6, TRY_LEAVE, TryCatch #1 {Exception -> 0x00e6, blocks: (B:38:0x00ba, B:40:0x00be, B:43:0x00c3, B:45:0x00c7, B:49:0x00dd, B:46:0x00d2), top: B:71:0x00ba }] */
    @org.androidannotations.annotations.UiThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showCheckData(java.util.List<com.join.mgps.dto.CollectionBeanSub> r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGMainActivity.showCheckData(java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 1500)
    public void showDownNotice() {
    }

    void showDownloadVideoAd(String str) {
        this.prefDef.lastShowTOUTIAOAd().g(str);
        DownloadSpeedupCfgBean downloadSpeedupCfgBean = (DownloadSpeedupCfgBean) JsonMapper.getInstance().fromJson(this.prefDef.downloadSpeedupCfg().d(), DownloadSpeedupCfgBean.class);
        this.downloadSpeedupCfgBean = downloadSpeedupCfgBean;
        if (downloadSpeedupCfgBean != null) {
            PlayCfgBean playCfgBean = null;
            if (downloadSpeedupCfgBean.getPlay_cfg() != null && this.downloadSpeedupCfgBean.getPlay_cfg().size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (PlayCfgBean playCfgBean2 : this.downloadSpeedupCfgBean.getPlay_cfg()) {
                    arrayList.add(Double.valueOf(playCfgBean2.getProbability()));
                }
                int b5 = com.join.mgps.ad.p.b(arrayList);
                if (b5 < this.downloadSpeedupCfgBean.getPlay_cfg().size()) {
                    playCfgBean = this.downloadSpeedupCfgBean.getPlay_cfg().get(b5);
                }
            }
            if (playCfgBean != null) {
                if (playCfgBean.getSdk_type() == 1) {
                    com.join.mgps.ad.z zVar = this.ttDownLoadSpeedAd;
                    if (zVar == null) {
                        initTTDownLoadSpeedAd(str, true);
                    } else {
                        zVar.r(this, str);
                    }
                } else if (playCfgBean.getSdk_type() == 2) {
                    com.join.mgps.ad.h hVar = this.gdtDownLoadSpeedAd;
                    if (hVar == null) {
                        initGDTDownLoadSpeedAd(str, true);
                    } else {
                        hVar.r(this, str);
                    }
                } else if (playCfgBean.getSdk_type() != 4) {
                    if (playCfgBean.getSdk_type() == 7) {
                        com.join.mgps.ad.l lVar = this.groDownLoadSpeedAd;
                        if (lVar == null) {
                            initGrMDownLoadSpeedAd(str, true);
                        } else {
                            lVar.r(this, str);
                        }
                    } else if (playCfgBean.getSdk_type() == 9) {
                        com.join.mgps.ad.s sVar = this.reDownLoadSpeedAd;
                        if (sVar == null) {
                            initREDownLoadSpeedAd(str, true);
                        } else {
                            sVar.r(this, str);
                        }
                    }
                }
            }
        }
    }

    public void showGoldFingerVideo(PlayCfgBean playCfgBean, String str, int i4, int i5, int i6, boolean z4) {
        if (playCfgBean != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(NoticeTopAnimActivityDialog_.f36148o, Integer.valueOf(i6));
            hashMap.put("close", Boolean.valueOf(z4));
            if (playCfgBean.getSdk_type() == 1) {
                com.join.mgps.ad.z zVar = this.ttGoldAdVideo;
                if (zVar == null) {
                    initGoldTTAd(playCfgBean.getSdk_key(), playCfgBean.getAd_id(), str, i4, i5, hashMap, true);
                } else {
                    zVar.t(this, str, i4, i5, hashMap);
                }
            } else if (playCfgBean.getSdk_type() == 2) {
                com.join.mgps.ad.h hVar = this.gdtGoldAdVideo;
                if (hVar == null) {
                    initGoldGDTAd(playCfgBean.getSdk_key(), playCfgBean.getAd_id(), str, i4, i5, hashMap, true);
                } else {
                    hVar.t(this, str, i4, i5, hashMap);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009e, code lost:
        if (isHomePopupAdCached(r8) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[Catch: Exception -> 0x00e1, TryCatch #0 {Exception -> 0x00e1, blocks: (B:3:0x0001, B:7:0x0038, B:9:0x003e, B:11:0x004c, B:13:0x0052, B:15:0x005e, B:17:0x0069, B:23:0x0090, B:30:0x00a3, B:32:0x00c8, B:34:0x00cf, B:26:0x009a, B:21:0x0073), top: B:42:0x0001 }] */
    @org.androidannotations.annotations.UiThread(delay = 500)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void showHomePopupAd(com.join.mgps.dto.PopupAdBean r8) {
        /*
            r7 = this;
            r0 = 0
            com.join.mgps.pref.PrefDef_ r1 = r7.prefDef     // Catch: java.lang.Exception -> Le1
            org.androidannotations.api.sharedpreferences.k r1 = r1.homePopupAdLastTime()     // Catch: java.lang.Exception -> Le1
            java.lang.Object r1 = r1.d()     // Catch: java.lang.Exception -> Le1
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Exception -> Le1
            long r1 = r1.longValue()     // Catch: java.lang.Exception -> Le1
            com.join.mgps.pref.PrefDef_ r3 = r7.prefDef     // Catch: java.lang.Exception -> Le1
            org.androidannotations.api.sharedpreferences.i r3 = r3.homePopupAdCount()     // Catch: java.lang.Exception -> Le1
            java.lang.Object r3 = r3.d()     // Catch: java.lang.Exception -> Le1
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> Le1
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> Le1
            com.join.mgps.pref.PrefDef_ r4 = r7.prefDef     // Catch: java.lang.Exception -> Le1
            org.androidannotations.api.sharedpreferences.p r4 = r4.homePopupAdLast()     // Catch: java.lang.Exception -> Le1
            java.lang.Object r4 = r4.d()     // Catch: java.lang.Exception -> Le1
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Le1
            boolean r1 = com.join.android.app.common.utils.g.g(r1)     // Catch: java.lang.Exception -> Le1
            if (r1 != 0) goto L36
            java.lang.String r4 = ""
            r3 = 0
        L36:
            if (r8 != 0) goto L4a
            boolean r1 = com.join.mgps.Util.g2.i(r4)     // Catch: java.lang.Exception -> Le1
            if (r1 == 0) goto L4a
            com.join.android.app.common.utils.JsonMapper r8 = com.join.android.app.common.utils.JsonMapper.getInstance()     // Catch: java.lang.Exception -> Le1
            java.lang.Class<com.join.mgps.dto.PopupAdBean> r1 = com.join.mgps.dto.PopupAdBean.class
            java.lang.Object r8 = r8.fromJson(r4, r1)     // Catch: java.lang.Exception -> Le1
            com.join.mgps.dto.PopupAdBean r8 = (com.join.mgps.dto.PopupAdBean) r8     // Catch: java.lang.Exception -> Le1
        L4a:
            if (r8 == 0) goto Le5
            java.lang.String r1 = r8.getAd_switch()     // Catch: java.lang.Exception -> Le1
            if (r1 == 0) goto Le5
            java.lang.String r1 = r8.getAd_switch()     // Catch: java.lang.Exception -> Le1
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> Le1
            if (r1 == 0) goto Le5
            java.lang.String r1 = com.join.android.app.common.utils.JsonMapper.toJsonString(r8)     // Catch: java.lang.Exception -> Le1
            boolean r2 = r1.equals(r4)     // Catch: java.lang.Exception -> Le1
            r4 = 1
            if (r2 == 0) goto L73
            int r2 = r8.getStart_up_counts()     // Catch: java.lang.Exception -> Le1
            if (r3 >= r2) goto L71
            r2 = 1
            goto L8e
        L71:
            r2 = 0
            goto L8e
        L73:
            com.join.mgps.pref.PrefDef_ r2 = r7.prefDef     // Catch: java.lang.Exception -> Le1
            org.androidannotations.api.sharedpreferences.p r2 = r2.homePopupAdLast()     // Catch: java.lang.Exception -> Le1
            r2.g(r1)     // Catch: java.lang.Exception -> Le1
            com.join.mgps.pref.PrefDef_ r2 = r7.prefDef     // Catch: java.lang.Exception -> Le1
            org.androidannotations.api.sharedpreferences.i r2 = r2.homePopupAdCount()     // Catch: java.lang.Exception -> Le1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> Le1
            r2.g(r3)     // Catch: java.lang.Exception -> Le1
            r7.clearOldCache(r8)     // Catch: java.lang.Exception -> Le1
            r2 = 1
            r3 = 0
        L8e:
            if (r2 == 0) goto La0
            java.lang.String r1 = com.join.android.app.common.utils.JsonMapper.toJsonString(r8)     // Catch: java.lang.Exception -> Le1
            r7.preLoad(r8)     // Catch: java.lang.Exception -> Le1
            if (r3 != 0) goto L9a
            goto La1
        L9a:
            boolean r8 = r7.isHomePopupAdCached(r8)     // Catch: java.lang.Exception -> Le1
            if (r8 != 0) goto La1
        La0:
            r2 = 0
        La1:
            if (r2 == 0) goto Le5
            com.join.mgps.pref.PrefDef_ r8 = r7.prefDef     // Catch: java.lang.Exception -> Le1
            org.androidannotations.api.sharedpreferences.k r8 = r8.homePopupAdLastTime()     // Catch: java.lang.Exception -> Le1
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Le1
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> Le1
            r8.g(r2)     // Catch: java.lang.Exception -> Le1
            com.join.mgps.pref.PrefDef_ r8 = r7.prefDef     // Catch: java.lang.Exception -> Le1
            org.androidannotations.api.sharedpreferences.i r8 = r8.homePopupAdCount()     // Catch: java.lang.Exception -> Le1
            int r3 = r3 + r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> Le1
            r8.g(r2)     // Catch: java.lang.Exception -> Le1
            r7.showInstallLayout = r0     // Catch: java.lang.Exception -> Le1
            boolean r8 = r7.activityHasDes     // Catch: java.lang.Exception -> Le1
            if (r8 != 0) goto Le5
            r8 = 2
            boolean r8 = r7.isForcedLogin(r8)     // Catch: java.lang.Exception -> Le1
            if (r8 != 0) goto Le5
            r7.hasShowAd = r4     // Catch: java.lang.Exception -> Le1
            android.content.Context r8 = r7.context     // Catch: java.lang.Exception -> Le1
            com.join.mgps.activity.HomePopupAdActivity_$c r8 = com.join.mgps.activity.HomePopupAdActivity_.m0(r8)     // Catch: java.lang.Exception -> Le1
            com.join.mgps.activity.HomePopupAdActivity_$c r8 = r8.a(r1)     // Catch: java.lang.Exception -> Le1
            r1 = 10002(0x2712, float:1.4016E-41)
            r8.startForResult(r1)     // Catch: java.lang.Exception -> Le1
            return
        Le1:
            r8 = move-exception
            r8.printStackTrace()
        Le5:
            boolean r8 = r7.hasShowAd
            if (r8 != 0) goto Lec
            r7.checkShowOldUserRecom(r0)
        Lec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGMainActivity.showHomePopupAd(com.join.mgps.dto.PopupAdBean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showInputRoomPwdDialog(ArenaRequest arenaRequest) {
        com.join.mgps.customview.input.a aVar = new com.join.mgps.customview.input.a(this, "请输入房间密码", 4, false);
        aVar.g(new i0(aVar, arenaRequest));
        aVar.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showInstallAppDialogActivity(int i4, List<DownloadTask> list) {
        if (this.hasDialog || this.showUpdate || list == null) {
            return;
        }
        com.join.mgps.Util.b0.f0(this).R(this.context, i4, list);
        this.hasDialog = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        ToastManager.show(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showOnlineCouponDialog(OnlineCouponConfigBean onlineCouponConfigBean, int i4) {
        com.join.mgps.Util.b0.f0(this.context).V(this.context, onlineCouponConfigBean, i4);
        com.papa.sim.statistic.p.l(this).Q1(Event.homeSuccessUpRedBag, AccountUtil_.getInstance_(this).getAccountData().getUid());
    }

    void showPspVideoAd() {
        PspGameAdCfgBean pspGameAdCfgBean = (PspGameAdCfgBean) JsonMapper.getInstance().fromJson(this.prefDef.pspGameAdCfg().d(), PspGameAdCfgBean.class);
        this.pspGameAdCfgBean = pspGameAdCfgBean;
        if (pspGameAdCfgBean != null) {
            int i4 = 0;
            if (pspGameAdCfgBean.getPlay_cfg() != null && this.pspGameAdCfgBean.getPlay_cfg().size() > 0) {
                ArrayList arrayList = new ArrayList();
                for (PlayCfgBean playCfgBean : this.pspGameAdCfgBean.getPlay_cfg()) {
                    arrayList.add(Double.valueOf(playCfgBean.getProbability()));
                }
                i4 = com.join.mgps.ad.p.b(arrayList);
            }
            PlayCfgBean playCfgBean2 = this.pspGameAdCfgBean.getPlay_cfg().get(i4);
            if (playCfgBean2.getSdk_type() == 1) {
                com.join.mgps.ad.z zVar = this.ttPspAd;
                if (zVar == null) {
                    initTTPspAd(true);
                } else {
                    zVar.q(this);
                }
            } else if (playCfgBean2.getSdk_type() == 2) {
                com.join.mgps.ad.h hVar = this.gdtPspAd;
                if (hVar == null) {
                    initGDTPspAd(true);
                } else {
                    hVar.q(this);
                }
            } else if (playCfgBean2.getSdk_type() != 4) {
                if (playCfgBean2.getSdk_type() == 7) {
                    com.join.mgps.ad.l lVar = this.groPspAd;
                    if (lVar == null) {
                        initGrMPspAd(true);
                    } else {
                        lVar.q(this);
                    }
                } else if (playCfgBean2.getSdk_type() == 9) {
                    com.join.mgps.ad.s sVar = this.rePspAd;
                    if (sVar == null) {
                        initREPspAd(true);
                    } else {
                        sVar.q(this);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showRedPoint() {
        this.red_point.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showSharedGameDialog(CollectionBeanSub collectionBeanSub) {
        try {
            com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.context, R.style.MyDialog);
            oVar.setContentView(R.layout.shared_game);
            oVar.setCanceledOnTouchOutside(true);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) oVar.findViewById(R.id.game_icon);
            TextView textView = (TextView) oVar.findViewById(R.id.game_name);
            TextView textView2 = (TextView) oVar.findViewById(R.id.game_info);
            Button button = (Button) oVar.findViewById(R.id.ok);
            if (!collectionBeanSub.getIco_remote().isEmpty()) {
                MyImageLoader.d(simpleDraweeView, R.drawable.main_normal_icon, collectionBeanSub.getIco_remote());
            }
            if (!collectionBeanSub.getGame_name().isEmpty()) {
                textView.setText(collectionBeanSub.getGame_name());
            }
            if (!collectionBeanSub.getInfo().isEmpty()) {
                textView2.setText(collectionBeanSub.getInfo());
            }
            button.setOnClickListener(new d(collectionBeanSub, oVar));
            oVar.show();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.context).b(str);
    }

    @UiThread
    public void showVersionDownLoadHint(VersionDto versionDto, boolean z4) {
        int intValue = this.prefDef.wifiDownNumber().d().intValue();
        if (com.join.android.app.common.utils.j.k(this.context) && !z4 && (intValue == -1 || intValue > 0)) {
            this.prefDef.wifiDownNumber().g(Integer.valueOf(intValue - 1));
            ((UpdateService_.a) ((UpdateService_.a) ((UpdateService_.a) UpdateService_.p(this.context).extra("url", versionDto.getAndroidUrl())).extra("downNotInstall", true)).extra("papaUpdateinfo", versionDto)).a();
            return;
        }
        SharedPreferences.Editor edit = getSharedPreferences("VersionXML", 0).edit();
        edit.putBoolean("Mandatory", z4);
        edit.putString("VersionDto", JsonMapper.getInstance().toJson(versionDto));
        edit.commit();
        com.join.mgps.dialog.e eVar = this.appUpdateDialog;
        if (eVar == null) {
            this.appUpdateDialog = new com.join.mgps.dialog.e(this, R.style.HKDialogLoading, versionDto, z4);
        } else {
            eVar.d(versionDto, z4);
        }
        this.appUpdateDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.join.mgps.activity.b1
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MGMainActivity.this.lambda$showVersionDownLoadHint$3(dialogInterface);
            }
        });
        this.appUpdateDialog.show();
        this.showUpdate = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f71999f0})
    public void showupdateDialog(Intent intent) {
        com.join.mgps.dialog.e eVar = new com.join.mgps.dialog.e(this, R.style.HKDialogLoading, (VersionDto) intent.getSerializableExtra("papaUpdateinfo"));
        this.appUpdateDialog = eVar;
        eVar.show();
        this.appUpdateDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.join.mgps.activity.v0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MGMainActivity.this.lambda$showupdateDialog$4(dialogInterface);
            }
        });
        this.showUpdate = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 400)
    public void startAlphaBreathAnimation(View view) {
        view.setLayerType(1, null);
        startAnimation(this.flipCardAnimation, view, new com.join.mgps.Util.n0(0.7f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0563 A[Catch: all -> 0x0592, Exception -> 0x0596, TryCatch #0 {all -> 0x0592, blocks: (B:3:0x0009, B:8:0x0011, B:10:0x0033, B:13:0x003d, B:15:0x0049, B:16:0x0050, B:18:0x0066, B:19:0x007a, B:21:0x0080, B:25:0x00a4, B:27:0x00b0, B:29:0x00bc, B:31:0x00c2, B:32:0x00c9, B:34:0x00cf, B:35:0x00d6, B:37:0x00dc, B:38:0x00df, B:40:0x00e5, B:42:0x00eb, B:43:0x00f2, B:44:0x00f6, B:46:0x00fd, B:47:0x0103, B:50:0x0116, B:52:0x0120, B:54:0x012f, B:55:0x013e, B:57:0x0151, B:59:0x0157, B:60:0x0165, B:62:0x016b, B:64:0x017b, B:66:0x0181, B:68:0x018b, B:71:0x019c, B:73:0x01a2, B:75:0x01b0, B:77:0x01b6, B:79:0x01be, B:83:0x01e6, B:84:0x01e9, B:88:0x01f0, B:89:0x01f5, B:90:0x0201, B:92:0x0207, B:93:0x0211, B:95:0x0217, B:97:0x022b, B:98:0x022f, B:99:0x0233, B:102:0x023e, B:104:0x0246, B:106:0x024c, B:108:0x0256, B:110:0x0266, B:112:0x026c, B:114:0x0272, B:116:0x027d, B:117:0x028e, B:119:0x029c, B:123:0x02c4, B:125:0x02c9, B:126:0x02dd, B:128:0x02e3, B:129:0x02ed, B:131:0x02f3, B:133:0x0307, B:134:0x030b, B:135:0x0314, B:137:0x031a, B:138:0x0328, B:140:0x0344, B:142:0x034b, B:143:0x038a, B:145:0x0390, B:147:0x03ad, B:149:0x03b3, B:151:0x03c9, B:162:0x03fd, B:164:0x040b, B:152:0x03cd, B:154:0x03d7, B:156:0x03e2, B:158:0x03e8, B:159:0x03ec, B:161:0x03f2, B:167:0x0437, B:169:0x045d, B:171:0x0473, B:173:0x0481, B:175:0x048b, B:178:0x04b6, B:180:0x04c0, B:191:0x04f6, B:193:0x0504, B:177:0x04b1, B:181:0x04c4, B:183:0x04d0, B:185:0x04db, B:187:0x04e1, B:188:0x04e5, B:190:0x04eb, B:195:0x052f, B:202:0x053c, B:205:0x0558, B:207:0x0563, B:209:0x056d, B:211:0x0575, B:212:0x0586, B:204:0x0542, B:199:0x0536), top: B:227:0x0009 }] */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startBackups(boolean r19) {
        /*
            Method dump skipped, instructions count: 1447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.MGMainActivity.startBackups(boolean):void");
    }

    public void startDownloadActivity(String str, int i4) {
        Intent intent = new Intent(this, NewArenaDownloadActivity_.class);
        intent.putExtra("gameId", str);
        intent.putExtra(NewArenaDownloadActivity_.P, this.hasPlug);
        intent.putExtra(NewArenaDownloadActivity_.Q, this.hasRom);
        intent.putExtra("from", "MGMainActivity_" + i4);
        startActivityForResult(intent, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = me.relex.photodraweeview.d.f71604s1)
    public void startGameRoom(com.join.mgps.event.q qVar) {
        if (qVar == null || qVar.d() == null) {
            return;
        }
        int h4 = qVar.h();
        String f5 = qVar.f();
        GameRoom d5 = qVar.d();
        int i4 = 2;
        if (qVar.i() != 1) {
            i4 = qVar.i() == 2 ? 3 : 1;
        }
        ((GameRoomActivity_.a0) GameRoomActivity_.V2(this).l(h4).h(f5).d(d5.getGameName()).i(d5).k(i4).flags(536870912)).start();
        Ext ext = new Ext();
        ext.setFrom("1");
        ext.setGameId(d5.getGameId() + "");
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.context).getAccountData();
        if (accountData != null) {
            ext.setUid(accountData.getUid());
        }
        ext.setPosition(i4 + "");
        com.papa.sim.statistic.p.l(this.context).O1(Event.JoinLobbyroom, ext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void startIntentOldUserRecom(long j4) {
        if (com.join.android.app.common.utils.j.j(this.context)) {
            RequestModel requestModel = new RequestModel();
            requestModel.setDefault(this);
            UserRecomRequestArgs userRecomRequestArgs = new UserRecomRequestArgs();
            ArrayList arrayList = new ArrayList();
            for (DownloadTask downloadTask : p1.f.K().d()) {
                arrayList.add(downloadTask.getCrc_link_type_val());
                if (APKUtils.G(downloadTask)) {
                    arrayList.add(((ModInfoBean) JsonMapper.getInstance().fromJson(downloadTask.getMod_info(), ModInfoBean.class)).getMain_game_id());
                }
            }
            userRecomRequestArgs.setDownloadedGameIdList(arrayList);
            userRecomRequestArgs.setDuration(j4);
            userRecomRequestArgs.setUid(AccountUtil_.getInstance_(this).getAccountData().getUid());
            requestModel.setArgs(userRecomRequestArgs);
            com.join.mgps.rpc.impl.i.D0().B0().Q0(requestModel.makeSign()).enqueue(new a(j4));
        }
    }

    void startLineAnimation() {
        this.downloadLine.setImageResource(R.drawable.line_blue_bg);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.img_translate);
        this.animation = loadAnimation;
        loadAnimation.setFillAfter(true);
        this.imageLoading.setVisibility(0);
        this.imageLoading.startAnimation(this.animation);
        this.animation.setAnimationListener(new h());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void startLoadRecommendwifi() {
        RecomeWifiDatabean data;
        List<CollectionBeanSub> game_list;
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ResultMainBean<RecomeWifiDatabean> I = this.rpcClient.I(getRequestBean(1));
                if (I == null || I.getFlag() != 1 || (game_list = (data = I.getMessages().getData()).getGame_list()) == null || game_list.size() <= 0) {
                    return;
                }
                Message message = new Message();
                message.what = 2;
                message.obj = data;
                this.handler.sendMessage(message);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 400)
    public void startPlayVideo() {
        DiscoveryFragmentV4_ discoveryFragmentV4_;
        int i4 = this.positionNum;
        if (i4 == 3 || i4 != 4 || (discoveryFragmentV4_ = this.fightFragment) == null) {
            return;
        }
        discoveryFragmentV4_.d0();
    }

    void startShowRecommendwifi(RecomeWifiDatabean recomeWifiDatabean) {
        if (this.isDestroyed) {
            return;
        }
        Intent intent = new Intent(this, RecomWifiActivity_.class);
        intent.putExtra("data", recomeWifiDatabean);
        startActivity(intent);
    }

    void stopLineAnimation() {
        ImageView imageView = this.imageLoading;
        if (imageView == null) {
            return;
        }
        imageView.clearAnimation();
        this.imageLoading.setVisibility(8);
        int i4 = this.positionNum;
        if (i4 == 3 || i4 == 7 || i4 == 1) {
            this.downloadLine.setImageResource(R.drawable.line_grey_bg);
        } else if (i4 != 2 && i4 != 5) {
            this.downloadLine.setImageResource(R.drawable.line_white_bg);
        } else {
            this.downloadLine.setImageResource(R.drawable.line_grey_bg);
        }
    }

    void toast(final String str) {
        this.handler.post(new Runnable() { // from class: com.join.mgps.activity.w0
            @Override // java.lang.Runnable
            public final void run() {
                MGMainActivity.this.lambda$toast$12(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void toastData(RewardBean rewardBean) {
        if (rewardBean != null) {
            rewardBean.getOn_off();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 1000)
    public void touristLogin() {
        if (!com.join.android.app.common.utils.j.j(this) || isLogined(this)) {
            return;
        }
        this.rpcAccountClient = com.join.mgps.rpc.impl.a.c0();
        try {
            TouristLoginRequestBean touristLoginRequestBean = new TouristLoginRequestBean();
            touristLoginRequestBean.setVersion(com.join.android.app.common.utils.n.n(this).z());
            touristLoginRequestBean.setDevice_id("");
            touristLoginRequestBean.setMac("");
            touristLoginRequestBean.setSource("2");
            touristLoginRequestBean.setTuid(this.prefDef.touriseTUID().d().longValue());
            touristLoginRequestBean.setSign(com.join.mgps.Util.x1.g(touristLoginRequestBean));
            AccountUtil_.getInstance_(this.context).setLocalUserIcon("");
            AccountResultMainBean<AccountTokenSuccess> s4 = this.rpcAccountClient.s(touristLoginRequestBean.getParams());
            if (s4 != null && s4.getError() == 0 && s4.getData().is_success()) {
                AccountUtil_.getInstance_(this).saveAccountData(b3.a.a(s4.getData().getUser_info()), this);
                UtilsMy.K2(this);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72008k})
    public void unreadnotify(@Receiver.Extra String str) {
        updateStartGameTable(p1.f.K().F(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void updateAndroidApp() {
        APKUtils.a l4;
        try {
            for (DownloadTask downloadTask : p1.f.K().v()) {
                if (com.join.android.app.common.utils.e.l0(this).d(this, downloadTask.getPackageName()) && (l4 = com.join.android.app.common.utils.e.l0(this).l(this, downloadTask.getPackageName())) != null && com.join.mgps.Util.g2.i(downloadTask.getVer()) && l4.d() == Integer.parseInt(downloadTask.getVer())) {
                    UtilsMy.S2(downloadTask, 5);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadingPoint(int i4) {
        TextView textView = this.biground;
        if (textView == null) {
            return;
        }
        if (this.positionNum != 4) {
            this.downloadLayout.setVisibility(8);
            this.biground.setVisibility(8);
            return;
        }
        if (i4 < 100) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.width = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            this.biground.setLayoutParams(layoutParams);
            this.biground.setCompoundDrawables(null, null, null, null);
            this.biground.setBackgroundResource(R.drawable.mygame_big_round);
            this.biground.setPadding(1, 0, 0, 1);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams2.width = getResources().getDimensionPixelOffset(R.dimen.dp70);
            layoutParams2.height = getResources().getDimensionPixelOffset(R.dimen.round_large_size);
            layoutParams2.setMargins(0, (int) TypedValue.applyDimension(1, 7.0f, getResources().getDisplayMetrics()), 4, 0);
            this.biground.setGravity(17);
            this.biground.setLayoutParams(layoutParams2);
            this.biground.setCompoundDrawables(null, null, null, null);
            this.biground.setBackgroundResource(R.drawable.message_round);
            this.biground.setPadding(1, 0, 2, 1);
        }
        TextView textView2 = this.biground;
        textView2.setText(i4 + "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateFindGameRetHot(TipsInfoBean tipsInfoBean) {
        if (this.miniGameBadge == null) {
            return;
        }
        if (tipsInfoBean != null && tipsInfoBean.getDisplay_switch().booleanValue()) {
            this.miniGameBadge.setText(tipsInfoBean.getTitle());
            this.miniGameBadge.setVisibility(this.prefDef.hasShowMiniGameBadge().d().booleanValue() ? 8 : 0);
            return;
        }
        this.miniGameBadge.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateHidePoint() {
        stopLineAnimation();
        TextView textView = this.biground;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
        this.biground.setText("");
        this.bigCenterRound.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateHistory() {
        CommonService_.S2(getApplicationContext()).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateLine(int i4) {
        ScrollTextViewLayout scrollTextViewLayout = this.scroll_text_layout;
        if (scrollTextViewLayout == null) {
            return;
        }
        int i5 = this.positionNum;
        if (i5 == 3 || i5 == 7 || i5 == 1) {
            scrollTextViewLayout.setDrawable(getResources().getDrawable(R.drawable.papa_download_selector));
        } else if (i5 != 2 && i5 != 5 && i5 != 1) {
            scrollTextViewLayout.setDrawable(getResources().getDrawable(R.drawable.papa_download_butn));
        } else {
            scrollTextViewLayout.setDrawable(getResources().getDrawable(R.drawable.papa_download_selector));
        }
        if (i4 == 0) {
            stopLineAnimation();
            return;
        }
        this.downloadLine.setImageResource(R.drawable.line_blue_bg);
        startLineAnimation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateNoOpenPoint() {
        if (this.biground == null) {
            return;
        }
        stopLineAnimation();
        this.biground.setVisibility(8);
        this.biground.setText("");
        Drawable drawable = getResources().getDrawable(R.drawable.mygame_litle_round);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.bigCenterRound.setVisibility(0);
        this.bigCenterRound.setCompoundDrawables(drawable, null, null, null);
        this.bigCenterRound.setBackgroundResource(R.color.transparent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void updateStartGameTable(DownloadTask downloadTask) {
        try {
            int i4 = this.positionNum;
            if (2 != i4 && 5 != i4) {
                List<DownloadTask> d5 = p1.f.K().d();
                Iterator<DownloadTask> it2 = d5.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getCrc_link_type_val().length() <= 3) {
                        it2.remove();
                    }
                }
                if (d5.size() > 0) {
                    if (downloadTask != null && downloadTask.getStatus() == 2) {
                        this.downloadTaskx = downloadTask;
                    } else {
                        long j4 = 0;
                        for (DownloadTask downloadTask2 : d5) {
                            if (downloadTask2.getStatus() == 2 && j4 < downloadTask2.getStartTime()) {
                                j4 = downloadTask2.getStartTime();
                                this.downloadTaskx = downloadTask2;
                            }
                        }
                    }
                    if (this.downloadTaskx != null) {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(this.downloadTaskx.getCrc_link_type_val());
                        if (f5 != null && f5.getStatus() == 2) {
                            if (com.join.mgps.Util.q1.f(this.downloadTaskx.getPackageName())) {
                                this.cdp_down_progress.setVisibility(8);
                                this.downlodingGameIcon.setVisibility(8);
                            } else {
                                this.downlodingGameIcon.setVisibility(0);
                                this.cdp_down_progress.setVisibility(0);
                                MyImageLoader.h(this.downlodingGameIcon, this.downloadTaskx.getPortraitURL());
                            }
                            this.cdp_down_progress.setProgress((int) f5.getProgress());
                            int i5 = this.positionNum;
                            if (2 == i5 || 5 == i5) {
                                this.cdp_down_progress.setVisibility(8);
                                this.mg_chart_image.setVisibility(0);
                                this.downlodingGameIcon.setVisibility(8);
                            }
                            stopAlphBreathAnim();
                            return;
                        }
                        this.downlodingGameIcon.setVisibility(8);
                        this.cdp_down_progress.setVisibility(8);
                        this.mg_chart_image.setVisibility(0);
                    }
                }
                List<DownloadTask> X = p1.f.K().X(this.context);
                if (X != null) {
                    Iterator<DownloadTask> it3 = X.iterator();
                    while (it3.hasNext()) {
                        DownloadTask next = it3.next();
                        if (next != null && (TextUtils.equals(com.join.mgps.Util.q1.f27993d, next.getCrc_link_type_val()) || TextUtils.equals(com.join.mgps.Util.q1.f27992c, next.getCrc_link_type_val()))) {
                            it3.remove();
                        }
                    }
                }
                DownloadTask downloadTask3 = null;
                if (X != null && X.size() > 0) {
                    this.numberInTab.setVisibility(0);
                    this.downlodingGameIcon.setVisibility(8);
                    this.cdp_down_progress.setVisibility(8);
                    stopAlphBreathAnim();
                    int i6 = this.positionNum;
                    if (2 != i6 && 5 != i6) {
                        long j5 = 0;
                        for (DownloadTask downloadTask4 : X) {
                            if (!com.join.mgps.Util.q1.c(this, downloadTask4) && (j5 == 0 || j5 < downloadTask4.getFinishTime())) {
                                j5 = downloadTask4.getFinishTime();
                                downloadTask3 = downloadTask4;
                            }
                        }
                        if (downloadTask3 != null) {
                            DownloadTask downloadTask5 = this.downloadTaskx;
                            if (downloadTask5 != null && com.join.mgps.Util.q1.f(downloadTask5.getPackageName())) {
                                this.mg_chart_image.setVisibility(0);
                                return;
                            }
                            MyImageLoader.h(this.gifIcon, downloadTask3.getPortraitURL());
                            this.gifIcon.setVisibility(0);
                            startAlphaBreathAnimation(this.gifIcon);
                            this.mg_chart_image.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    this.gifIcon.setVisibility(8);
                    this.mg_chart_image.setVisibility(0);
                    return;
                }
                long j6 = 0;
                for (DownloadTask downloadTask6 : d5) {
                    if (downloadTask6.getStatus() == 5 && (j6 == 0 || j6 < downloadTask6.getOpenTime())) {
                        j6 = downloadTask6.getOpenTime();
                        downloadTask3 = downloadTask6;
                    }
                }
                if (downloadTask3 != null) {
                    MyImageLoader.h(this.gifIcon, downloadTask3.getPortraitURL());
                    this.gifIcon.setVisibility(0);
                    this.mg_chart_image.setVisibility(8);
                    return;
                }
                this.numberInTab.setVisibility(8);
                this.mg_chart_image.setVisibility(0);
                this.gifIcon.setVisibility(8);
                stopAlphBreathAnim();
                return;
            }
            this.gifIcon.setVisibility(8);
            this.downlodingGameIcon.setVisibility(8);
            this.cdp_down_progress.setVisibility(8);
            this.numberInTab.setVisibility(8);
            this.mg_chart_image.setImageResource(R.drawable.mg_main_chart_normal);
            this.mg_chart_image.setVisibility(0);
            stopAlphBreathAnim();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void updateUI(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            if (i4 != 1 && i4 != 2) {
                if (i4 == 3) {
                    receiveDelete(downloadTask);
                    return;
                } else if (i4 == 5) {
                    receiveSuccess(downloadTask);
                    return;
                } else if (i4 != 7 && i4 != 8 && i4 != 9) {
                    return;
                }
            }
            receiveStart(downloadTask, i4);
        }
    }

    void updateWaterProgress() {
        DownloadTask f5;
        if (this.downloadTaskx == null || (f5 = com.join.android.app.common.servcie.i.e().f(this.downloadTaskx.getCrc_link_type_val())) == null) {
            return;
        }
        this.cdp_down_progress.setProgress((int) f5.getProgress());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void videoAdWatchLog(VideoWatchLogTable videoWatchLogTable, boolean z4) {
        if (com.join.android.app.common.utils.j.j(this)) {
            RequestModel requestModel = new RequestModel();
            VideoAdWatchLogRequest videoAdWatchLogRequest = new VideoAdWatchLogRequest();
            videoAdWatchLogRequest.setUid(videoWatchLogTable.getUserId());
            videoAdWatchLogRequest.setSdkType(videoWatchLogTable.getSdkType());
            videoAdWatchLogRequest.setSceneType(videoWatchLogTable.getSceneType());
            requestModel.setArgs(videoAdWatchLogRequest);
            requestModel.setDefault(this.context);
            ResponseModel<Boolean> l4 = com.join.mgps.rpc.impl.i.D0().l(requestModel.makeSign());
            if (l4 == null || l4.getCode() != 200) {
                return;
            }
            if (!l4.getData().booleanValue()) {
                b2.n0.n().m(videoWatchLogTable);
                return;
            } else if (z4) {
                b2.n0.n().delete((b2.n0) videoWatchLogTable);
                return;
            } else {
                getVideoAdCfg(false);
                return;
            }
        }
        b2.n0.n().m(videoWatchLogTable);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onDownloadRuntimeEvent(com.join.mgps.event.t tVar) {
        com.join.android.app.common.dialog.f fVar = this.localGameOneDialog;
        if (fVar != null) {
            fVar.dismiss();
            this.localGameOneDialog = null;
        }
        com.join.android.app.common.dialog.k kVar = this.localGameTwoDialog;
        if (kVar != null) {
            kVar.dismiss();
            this.localGameTwoDialog = null;
        }
        LocalGameThreeDialog localGameThreeDialog = this.localGameThreeDialog;
        if (localGameThreeDialog != null) {
            try {
                localGameThreeDialog.dismissAllowingStateLoss();
            } catch (Exception unused) {
            }
            this.localGameThreeDialog = null;
        }
        sanLocalGameIv(tVar.a());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.r rVar) {
        getRedPointData();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onFriendEvent(com.join.mgps.event.q qVar) {
        if (qVar == null) {
            return;
        }
        if (qVar.a() == 1) {
            com.wufan.friend.chat.c.u().L(AccountUtil_.getInstance_(this).getAccountData() != null ? AccountUtil_.getInstance_(this).getAccountData().getUid() : 0, AccountUtil_.getInstance_(this).getToken());
        } else if (qVar.a() == 2) {
            showToast("已发送对战邀请！");
        } else if (qVar.a() == 3) {
            startGameRoom(qVar);
        } else if (qVar.a() == 5) {
            reject(qVar.b());
        } else if (qVar.a() == 7) {
            String c5 = qVar.c();
            if (!checkGameIsInstall(c5)) {
                startDownloadActivity(c5, IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START);
            } else {
                com.wufan.friend.chat.c.u().O();
            }
        }
    }
}
