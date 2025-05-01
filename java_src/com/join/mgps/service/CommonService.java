package com.join.mgps.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import app.mgsim.arena.ArenaConstants;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaRequestFactory;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.SocketError;
import app.mgsim.arena.SocketListener;
import b2.a0;
import b2.d0;
import b2.e0;
import b2.i0;
import com.MApplication;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.github.snowdream.android.app.downloader.b;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.data.ArchiveArgs;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.WifiUtils;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.h0;
import com.join.mgps.Util.j0;
import com.join.mgps.Util.k0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.m1;
import com.join.mgps.Util.q1;
import com.join.mgps.Util.v;
import com.join.mgps.Util.v0;
import com.join.mgps.Util.w0;
import com.join.mgps.Util.x0;
import com.join.mgps.Util.x1;
import com.join.mgps.Util.y;
import com.join.mgps.activity.EndGameLaunchActivity_;
import com.join.mgps.activity.NoticeTopAnimActivityDialog_;
import com.join.mgps.activity.PayNowActivity_;
import com.join.mgps.activity.QuarkDownGameActivity_;
import com.join.mgps.activity.QuarkPromptActivity_;
import com.join.mgps.activity.mygame.data.DataGameListBean;
import com.join.mgps.activity.recomend.DownloadCenterTuijianMain;
import com.join.mgps.activity.recomend.GamedownRecomendItemBean;
import com.join.mgps.activity.recomend.GamedownloadRecomdActivity2_;
import com.join.mgps.activity.recomend.GamedownloadRecomdActivity_;
import com.join.mgps.db.tables.EMUApkArenaTable;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.db.tables.EMUUpdateTable;
import com.join.mgps.db.tables.ForumTable;
import com.join.mgps.db.tables.JoystickTable;
import com.join.mgps.db.tables.PlayGameTimeTable;
import com.join.mgps.db.tables.PurchasedListTable;
import com.join.mgps.db.tables.ShowViewDataBeanTable;
import com.join.mgps.dialog.DownloadMethodMultiDialog_;
import com.join.mgps.dto.APKVersionMainBean;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.ApkVersionbean;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.BaseBean;
import com.join.mgps.dto.BattaleSwitchBean;
import com.join.mgps.dto.BluetoothHandleBlackListData;
import com.join.mgps.dto.BluetoothHandleBlackListRequestBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.CommentTokenBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.DownDeductCoinResponse;
import com.join.mgps.dto.DownloadArgs;
import com.join.mgps.dto.DownloadGameArgsBean;
import com.join.mgps.dto.DownloadScanEvent;
import com.join.mgps.dto.EmuErrorDto;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.FileInfo;
import com.join.mgps.dto.FirstScreenAdDtoData;
import com.join.mgps.dto.ForumBannerBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumRequestBean;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.FriendInviteBean;
import com.join.mgps.dto.GameBespeakBean;
import com.join.mgps.dto.GameMainV4DataBean;
import com.join.mgps.dto.HomeViewSwich;
import com.join.mgps.dto.MiniGameSdkDtoAdCfgValue;
import com.join.mgps.dto.MiniGameSdkDtoRequestArgs;
import com.join.mgps.dto.MiniGameSdkDtoResponseResponseData;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.PapayOrder;
import com.join.mgps.dto.PayGameDetialBean;
import com.join.mgps.dto.PayOrderInfo;
import com.join.mgps.dto.QueryDownloadInfoRequestArgs;
import com.join.mgps.dto.QueryDownloadInfoResponseData;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.RequestAppDetialArgs;
import com.join.mgps.dto.RequestDomainInfoArgs;
import com.join.mgps.dto.RequestEndGameListArgs;
import com.join.mgps.dto.RequestGameBespeakArgs;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestdetialFolowAndBeSpeak;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.SharePostRequest;
import com.join.mgps.dto.ShowViewDataBean;
import com.join.mgps.dto.SingleGameRunAdTextCfgBean;
import com.join.mgps.dto.SpValue;
import com.join.mgps.dto.SplashIntentBean;
import com.join.mgps.dto.TouristLoginRequestBean;
import com.join.mgps.dto.VersionDto;
import com.join.mgps.dto.VideoAdCfgBean;
import com.join.mgps.dto.VideoAdCfgRequestArgs;
import com.join.mgps.dto.WebDiskCfg;
import com.join.mgps.dto.WebDiskInfo;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import com.join.mgps.socket.fight.arena.b;
import com.join.mgps.wrapper.a;
import com.papa.controller.core.ControllerManager;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.activity.EmuBaseActivity;
import com.papa91.arc.common.constants.BAction;
import com.papa91.arc.ext.ToastManager;
import com.papa91.arc.util.SDCardUtil;
import com.psk.eventmodule.StatFactory;
import com.wufan.friend.chat.protocol.w1;
import com.wufan.user.service.protobuf.n0;
import com.wufun.union.ad.AdChannel;
import com.wufun.union.ad.AdService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZip;
import net.sf.sevenzipjbinding.SevenZipException;
import net.sf.sevenzipjbinding.impl.RandomAccessFileInStream;
import net.sf.sevenzipjbinding.simple.ISimpleInArchive;
import net.sf.sevenzipjbinding.simple.ISimpleInArchiveItem;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EService;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
@EService
/* loaded from: classes.dex */
public class CommonService extends Service {
    private static final String T = "CommonService";
    public static boolean U = true;
    public static boolean V = true;
    public static boolean W;
    static boolean X;
    static boolean Y;
    com.papa.controller.core.d A;
    p K;
    private boolean L;
    private String M;
    @Pref

    /* renamed from: c  reason: collision with root package name */
    PrefDef_ f54155c;
    @Bean

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.Util.b f54156d;

    /* renamed from: f  reason: collision with root package name */
    private RecomDatabean f54158f;

    /* renamed from: g  reason: collision with root package name */
    IntentFilter f54159g;

    /* renamed from: h  reason: collision with root package name */
    IntentFilter f54160h;

    /* renamed from: i  reason: collision with root package name */
    IntentFilter f54161i;

    /* renamed from: j  reason: collision with root package name */
    IntentFilter f54162j;

    /* renamed from: k  reason: collision with root package name */
    IntentFilter f54163k;

    /* renamed from: l  reason: collision with root package name */
    r f54164l;

    /* renamed from: m  reason: collision with root package name */
    s f54165m;

    /* renamed from: n  reason: collision with root package name */
    private Context f54166n;

    /* renamed from: o  reason: collision with root package name */
    Thread f54167o;

    /* renamed from: p  reason: collision with root package name */
    private String f54168p;

    /* renamed from: t  reason: collision with root package name */
    b.InterfaceC0290b f54172t;

    /* renamed from: v  reason: collision with root package name */
    private com.join.mgps.socket.fight.arena.b f54174v;

    /* renamed from: x  reason: collision with root package name */
    CountDownTimer f54176x;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.rpc.k f54178z;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f54154b = Executors.newScheduledThreadPool(3);

    /* renamed from: e  reason: collision with root package name */
    Intent f54157e = new Intent("com.join.mgps.activity.sendUI");

    /* renamed from: q  reason: collision with root package name */
    private boolean f54169q = false;

    /* renamed from: r  reason: collision with root package name */
    Handler f54170r = new Handler();

    /* renamed from: s  reason: collision with root package name */
    com.github.snowdream.android.app.downloader.b f54171s = null;

    /* renamed from: u  reason: collision with root package name */
    Map<String, com.github.snowdream.android.app.downloader.c> f54173u = new ConcurrentHashMap(0);

    /* renamed from: w  reason: collision with root package name */
    private boolean f54175w = false;

    /* renamed from: y  reason: collision with root package name */
    private DownloadTask f54177y = null;
    boolean B = false;
    private int C = 5;
    ScheduledExecutorService D = null;
    int E = 0;
    int F = 0;
    int G = 20;
    int H = 0;
    int I = 0;
    String J = "11111";
    boolean N = false;
    AtomicBoolean O = new AtomicBoolean(false);
    HashMap<String, Integer> P = new HashMap<>();
    final HashMap<String, DownloadScanEvent> Q = new HashMap<>();
    ScheduledExecutorService R = Executors.newScheduledThreadPool(3);
    private final SocketListener.NotifyObserver S = new d();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements com.join.android.app.common.http.g {
        a() {
        }

        @Override // com.join.android.app.common.http.g
        public void onRequestProgress(long j4, long j5, boolean z4, String str) {
        }

        @Override // com.join.android.app.common.http.g
        public void onUploadFailed(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements ISequentialOutStream {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f54180b;

        b(File file) {
            this.f54180b = file;
        }

        @Override // net.sf.sevenzipjbinding.ISequentialOutStream
        public int write(byte[] bArr) throws SevenZipException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f54180b, true);
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            return bArr.length;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements b.InterfaceC0385b {
        c() {
        }

        @Override // com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void a() {
            CommonService.this.f54175w = false;
            try {
                CommonService.this.f54174v.d().A(CommonService.this.S);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void b(boolean z4) {
        }

        @Override // com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void c() {
            CommonService.this.f54175w = true;
            try {
                CommonService.this.f54174v.d().z(CommonService.this.S);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    class d implements SocketListener.NotifyObserver {
        d() {
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onError(SocketError socketError) {
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onServerResponse(ArenaResponse arenaResponse) {
            String str;
            ArenaRequest arenaRequest;
            String str2;
            if (arenaResponse == null || (str = arenaResponse.responseType) == null) {
                return;
            }
            if (!str.equals(ArenaConstants.ArenaCommand.PUSH_SCORE_BOARD) && !arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SEND_ROM_LOADED)) {
                if (!arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_LOGIN) || (arenaRequest = arenaResponse.request) == null || (str2 = arenaRequest.register_type) == null || !Objects.equals(str2, ArenaConstants.REGISTER_TYPE_EMU)) {
                    return;
                }
                CommonService.this.q(arenaRequest.roomId + "", arenaRequest.gameId + "", arenaRequest.uid + "", "");
            } else if (arenaResponse.data instanceof String) {
                CommonService.this.u1(arenaResponse.request.roomId + "", (String) arenaResponse.data);
            }
        }
    }

    /* loaded from: classes4.dex */
    class e implements Callback<ResultMainBean> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54184b;

        e(String str) {
            this.f54184b = str;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultMainBean> call, Throwable th) {
            CommonService.this.r0("请求失败！");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResultMainBean> call, Response<ResultMainBean> response) {
            if (response.body().getFlag() == 1) {
                Intent intent = new Intent("com.broadcast.bespeak.sussess");
                intent.putExtra("gameid", this.f54184b);
                CommonService.this.f54166n.sendBroadcast(intent);
                CommonService.this.r0("收到，游戏上架后会通知您");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements w1.k<ResponseModel<DataGameListBean>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DownloadGameArgsBean f54186a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f54187b;

        f(DownloadGameArgsBean downloadGameArgsBean, int i4) {
            this.f54186a = downloadGameArgsBean;
            this.f54187b = i4;
        }

        @Override // w1.k
        public void a(Throwable th) {
            CommonService.this.w1(this.f54186a.getGameId(), 49);
            CommonService.this.r0("获取游戏信息失败");
        }

        @Override // w1.k
        /* renamed from: b */
        public void onSuccess(ResponseModel<DataGameListBean> responseModel) {
            if (responseModel != null) {
                try {
                    if (responseModel.getCode() == 600) {
                        CommonService.this.w1(this.f54186a.getGameId(), 50);
                        DataGameListBean data = responseModel.getData();
                        if (data != null) {
                            List<GamedownRecomendItemBean> gameList = data.getGameList();
                            DomainInfoBean pdInfo = data.getPdInfo();
                            if (pdInfo != null) {
                                pdInfo.setGameId(this.f54186a.getGameId());
                                this.f54186a.setPdInfo(pdInfo);
                            }
                            if (gameList.size() > 0) {
                                boolean z4 = false;
                                GamedownRecomendItemBean gamedownRecomendItemBean = gameList.get(0);
                                int i4 = this.f54187b;
                                if (i4 == 1) {
                                    DownloadTask downloadtaskDown = gamedownRecomendItemBean.getDownloadtaskDown();
                                    if (this.f54186a != null) {
                                        DownloadTask F = p1.f.K().F(this.f54186a.getGameId());
                                        if (F != null) {
                                            UtilsMy.y4(downloadtaskDown, F);
                                            downloadtaskDown.setId(F.getId());
                                        }
                                        downloadtaskDown.setKeyword(this.f54186a.getKeyWord());
                                        downloadtaskDown.set_from(this.f54186a.getFrom());
                                        downloadtaskDown.set_from_type(this.f54186a.getFromType());
                                        downloadtaskDown.setExt(this.f54186a.getExt());
                                        downloadtaskDown.setExt1(this.f54186a.getExt1());
                                    }
                                    if (downloadtaskDown.getDown_status() == 5) {
                                        UtilsMy.l1(CommonService.this.f54166n, downloadtaskDown);
                                        return;
                                    } else {
                                        com.php25.PDownload.d.c(downloadtaskDown, CommonService.this.f54166n);
                                        return;
                                    }
                                } else if (i4 == 2) {
                                    DownloadTask downloadtaskDown2 = gamedownRecomendItemBean.getDownloadtaskDown();
                                    DownloadTask F2 = p1.f.K().F(this.f54186a.getGameId());
                                    if (this.f54186a != null) {
                                        if (F2 != null) {
                                            UtilsMy.y4(downloadtaskDown2, F2);
                                            downloadtaskDown2.setId(F2.getId());
                                        }
                                        downloadtaskDown2.setKeyword(this.f54186a.getKeyWord());
                                        downloadtaskDown2.set_from(this.f54186a.getFrom());
                                        downloadtaskDown2.set_from_type(this.f54186a.getFromType());
                                        downloadtaskDown2.setExt(this.f54186a.getExt());
                                        downloadtaskDown2.setExt1(this.f54186a.getExt1());
                                        downloadtaskDown2.setVer(gamedownRecomendItemBean.getVer());
                                        downloadtaskDown2.setVer_name(gamedownRecomendItemBean.getVer_name());
                                        downloadtaskDown2.setUrl(gamedownRecomendItemBean.getDown_url_remote());
                                    }
                                    if (downloadtaskDown2.getDown_status() == 5) {
                                        UtilsMy.l1(CommonService.this.f54166n, downloadtaskDown2);
                                        return;
                                    }
                                    EMUUpdateTable eMUUpdateTable = null;
                                    HashMap hashMap = new HashMap(1);
                                    hashMap.put("crc_sign_id", downloadtaskDown2.getCrc_link_type_val());
                                    List<EMUUpdateTable> h4 = b2.q.o().h(hashMap);
                                    if (h4 != null && h4.size() > 0) {
                                        eMUUpdateTable = h4.get(0);
                                    }
                                    if (eMUUpdateTable != null) {
                                        downloadtaskDown2.setVer(eMUUpdateTable.getVer());
                                        downloadtaskDown2.setVer_name(eMUUpdateTable.getVer_name());
                                        downloadtaskDown2.setUrl(eMUUpdateTable.getDown_url_remote());
                                        p1.f.K().m(downloadtaskDown2);
                                        UtilsMy.L0(downloadtaskDown2);
                                        if (UtilsMy.x0(downloadtaskDown2.getPay_game_amount(), downloadtaskDown2.getCrc_link_type_val()) > 0) {
                                            UtilsMy.d4(CommonService.this.f54166n, downloadtaskDown2.getCrc_link_type_val());
                                            return;
                                        } else {
                                            UtilsMy.R0(CommonService.this.f54166n, downloadtaskDown2, downloadtaskDown2.getTp_down_url(), downloadtaskDown2.getOther_down_switch(), downloadtaskDown2.getCdn_down_switch());
                                            return;
                                        }
                                    }
                                    return;
                                } else {
                                    DownloadTask downloadtaskDown3 = gamedownRecomendItemBean.getDownloadtaskDown();
                                    boolean e5 = q1.e(gamedownRecomendItemBean.getTag_info());
                                    if (!((q1.q() || q1.s() || q1.m() || q1.n()) ? true : true) || gamedownRecomendItemBean.getWeb_disk_info() == null || gamedownRecomendItemBean.isCpsGame()) {
                                        if (e5) {
                                            Dtype dtype = Dtype.android;
                                            downloadtaskDown3.setFileType(dtype.name());
                                            downloadtaskDown3.setRomType(dtype.name());
                                        }
                                        CommonService.this.K1(this.f54186a, gamedownRecomendItemBean, downloadtaskDown3);
                                        return;
                                    } else if (e5) {
                                        if (gamedownRecomendItemBean.getWeb_disk_info() == null) {
                                            gamedownRecomendItemBean.setWeb_disk_info(new WebDiskInfo());
                                        }
                                        gamedownRecomendItemBean.getWeb_disk_info().setGameId(this.f54186a.getGameId());
                                        ((QuarkDownGameActivity_.a) QuarkDownGameActivity_.i0(CommonService.this.f54166n).flags(268435456)).e(gamedownRecomendItemBean.getWeb_disk_info()).a(gamedownRecomendItemBean.getExt_info()).c(gamedownRecomendItemBean.getGame_id()).d(gamedownRecomendItemBean.getGame_name()).b(gamedownRecomendItemBean.getIco_remote()).start();
                                        return;
                                    } else if (!q1.g() || ((!q1.q() || !UtilsMy.o2(gamedownRecomendItemBean.getTag_info())) && (!q1.n() || !UtilsMy.m2(Integer.parseInt(gamedownRecomendItemBean.getPlugin_num()))))) {
                                        CommonService.this.K1(this.f54186a, gamedownRecomendItemBean, downloadtaskDown3);
                                        return;
                                    } else {
                                        DownloadArgs downloadArgs = new DownloadArgs();
                                        gamedownRecomendItemBean.setExt(this.f54186a.getExt());
                                        downloadArgs.setDownloadTask(downloadtaskDown3);
                                        downloadArgs.setGameInfo(gamedownRecomendItemBean);
                                        ((QuarkPromptActivity_.d) QuarkPromptActivity_.n0(CommonService.this.f54166n).flags(268435456)).b(gamedownRecomendItemBean.getCrc_sign_id()).a(downloadArgs).start();
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                    CommonService.this.w1(this.f54186a.getGameId(), 49);
                    CommonService.this.r0("获取游戏信息失败");
                    return;
                }
            }
            CommonService.this.w1(this.f54186a.getGameId(), 49);
            CommonService.this.r0("获取游戏信息失败");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements Callback<ResponseModel<DataGameListBean>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54189b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f54190c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f54191d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f54192e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f54193f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ DownloadGameArgsBean f54194g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f54195h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f54196i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ QueryDownloadInfoRequestArgs f54197j;

        g(String str, String str2, String str3, int i4, int i5, DownloadGameArgsBean downloadGameArgsBean, boolean z4, String str4, QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs) {
            this.f54189b = str;
            this.f54190c = str2;
            this.f54191d = str3;
            this.f54192e = i4;
            this.f54193f = i5;
            this.f54194g = downloadGameArgsBean;
            this.f54195h = z4;
            this.f54196i = str4;
            this.f54197j = queryDownloadInfoRequestArgs;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel<DataGameListBean>> call, Throwable th) {
            CommonService.this.r0("获取游戏信息失败");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel<DataGameListBean>> call, Response<ResponseModel<DataGameListBean>> response) {
            ResponseModel<DataGameListBean> body;
            DataGameListBean data;
            if (response != null) {
                try {
                    if (response.body() == null || (body = response.body()) == null || body.getCode() != 600 || (data = body.getData()) == null) {
                        return;
                    }
                    List<GamedownRecomendItemBean> gameList = data.getGameList();
                    DomainInfoBean pdInfo = data.getPdInfo();
                    if (gameList.size() > 0) {
                        boolean z4 = false;
                        GamedownRecomendItemBean gamedownRecomendItemBean = gameList.get(0);
                        gamedownRecomendItemBean.setRecPosition(this.f54189b);
                        gamedownRecomendItemBean.setReMarks(this.f54190c);
                        gamedownRecomendItemBean.setNodeId(this.f54191d);
                        gamedownRecomendItemBean.set_from(this.f54192e);
                        gamedownRecomendItemBean.set_from_type(this.f54193f);
                        if (g2.i(this.f54194g.getVolcanoOther())) {
                            gamedownRecomendItemBean.setPosition_path((StatFactory.VolcanoOther) JsonMapper.getInstance().fromJson(this.f54194g.getVolcanoOther(), StatFactory.VolcanoOther.class));
                        }
                        DownloadTask downloadtaskDown = gamedownRecomendItemBean.getDownloadtaskDown();
                        downloadtaskDown.set_from(this.f54192e);
                        downloadtaskDown.set_from_type(this.f54193f);
                        downloadtaskDown.setFromRecomDown(this.f54195h);
                        downloadtaskDown.setKeyword(this.f54196i);
                        String packagePath = this.f54194g.getPackagePath();
                        if (!TextUtils.isEmpty(packagePath) && new File(packagePath).exists()) {
                            downloadtaskDown.setGameZipPath(this.f54194g.getPackagePath());
                            downloadtaskDown.setPath(this.f54194g.getPackagePath());
                        }
                        if (pdInfo != null) {
                            pdInfo.setGameId(this.f54194g.getGameId());
                            this.f54194g.setPdInfo(pdInfo);
                        }
                        boolean e5 = q1.e(gamedownRecomendItemBean.getTag_info());
                        if (!((q1.q() || q1.s() || q1.m() || q1.n()) ? true : true) || gamedownRecomendItemBean.getWeb_disk_info() == null || gamedownRecomendItemBean.isCpsGame()) {
                            if (e5) {
                                Dtype dtype = Dtype.android;
                                downloadtaskDown.setFileType(dtype.name());
                                downloadtaskDown.setRomType(dtype.name());
                            }
                            CommonService.this.K1(this.f54194g, gamedownRecomendItemBean, downloadtaskDown);
                        } else if (e5) {
                            if (gamedownRecomendItemBean.getWeb_disk_info() == null) {
                                gamedownRecomendItemBean.setWeb_disk_info(new WebDiskInfo());
                            }
                            gamedownRecomendItemBean.getWeb_disk_info().setGameId(this.f54197j.getGameId());
                            ((QuarkDownGameActivity_.a) QuarkDownGameActivity_.i0(CommonService.this.f54166n).flags(268435456)).e(gamedownRecomendItemBean.getWeb_disk_info()).a(gamedownRecomendItemBean.getExt_info()).c(gamedownRecomendItemBean.getGame_id()).d(gamedownRecomendItemBean.getGame_name()).b(gamedownRecomendItemBean.getIco_remote()).start();
                        } else if (!q1.g() || ((!q1.q() || !UtilsMy.o2(gamedownRecomendItemBean.getTag_info())) && (!q1.n() || !UtilsMy.m2(Integer.parseInt(gamedownRecomendItemBean.getPlugin_num()))))) {
                            CommonService.this.K1(this.f54194g, gamedownRecomendItemBean, downloadtaskDown);
                        } else {
                            DownloadArgs downloadArgs = new DownloadArgs();
                            gamedownRecomendItemBean.setExt(this.f54194g.getExt());
                            com.php25.PDownload.d.h(downloadtaskDown);
                            downloadArgs.setDownloadTask(downloadtaskDown);
                            downloadArgs.setGameInfo(gamedownRecomendItemBean);
                            downloadArgs.setFrom(this.f54194g.getFrom());
                            ((QuarkPromptActivity_.d) QuarkPromptActivity_.n0(CommonService.this.f54166n).flags(268435456)).b(gamedownRecomendItemBean.getCrc_sign_id()).a(downloadArgs).start();
                        }
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                    CommonService.this.r0("获取游戏信息失败");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements com.join.android.app.common.http.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f54199a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54200b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f54201c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ n0 f54202d;

        h(boolean z4, String str, String str2, n0 n0Var) {
            this.f54199a = z4;
            this.f54200b = str;
            this.f54201c = str2;
            this.f54202d = n0Var;
        }

        @Override // com.join.android.app.common.http.b
        public void a(Object obj) {
            CommonService.this.r0("获取游戏信息失败");
        }

        @Override // com.join.android.app.common.http.b
        public void onSuccess(Object obj) {
            ResultMainBean resultMainBean = (ResultMainBean) obj;
            if (resultMainBean != null && resultMainBean.getFlag() != 0) {
                PayGameDetialBean payGameDetialBean = (PayGameDetialBean) resultMainBean.getMessages().getData();
                if (payGameDetialBean != null) {
                    if (payGameDetialBean.getGame_info() != null) {
                        Intent intent = new Intent(o1.a.G);
                        intent.putExtra("gameData", payGameDetialBean.getGame_info());
                        CommonService.this.sendBroadcast(intent);
                        if (this.f54199a) {
                            CommonService.this.sendBroadcast(new Intent("com.join,mgps.sim.sdkgamePayfinish"));
                            m1.c().e(CommonService.this.f54166n, this.f54200b, this.f54201c);
                        }
                        CommonService.this.I1(payGameDetialBean.getGame_info(), false);
                        return;
                    }
                    CommonService.this.N1(this.f54201c, payGameDetialBean.getOrder_info(), this.f54202d, this.f54199a, this.f54200b);
                }
            } else if (resultMainBean != null && resultMainBean.getFlag() != 0) {
                CommonService.this.r0("获取游戏信息失败");
            } else {
                CommonService.this.r0("获取游戏信息失败");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements Callback<ResponseModel<DataGameListBean>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f54204b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f54205c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ QueryDownloadInfoResponseData f54206d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f54207e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f54208f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f54209g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f54210h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ DownloadGameArgsBean f54211i;

        i(int i4, int i5, QueryDownloadInfoResponseData queryDownloadInfoResponseData, boolean z4, String str, boolean z5, boolean z6, DownloadGameArgsBean downloadGameArgsBean) {
            this.f54204b = i4;
            this.f54205c = i5;
            this.f54206d = queryDownloadInfoResponseData;
            this.f54207e = z4;
            this.f54208f = str;
            this.f54209g = z5;
            this.f54210h = z6;
            this.f54211i = downloadGameArgsBean;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel<DataGameListBean>> call, Throwable th) {
            CommonService.this.r0("获取游戏信息失败");
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel<DataGameListBean>> call, Response<ResponseModel<DataGameListBean>> response) {
            ResponseModel<DataGameListBean> body;
            DataGameListBean data;
            GamedownRecomendItemBean gamedownRecomendItemBean;
            if (response != null) {
                try {
                    if (response.body() == null || (body = response.body()) == null || body.getCode() != 600 || (data = body.getData()) == null) {
                        return;
                    }
                    List<GamedownRecomendItemBean> gameList = data.getGameList();
                    if (gameList.size() <= 0 || (gamedownRecomendItemBean = gameList.get(0)) == null) {
                        return;
                    }
                    gamedownRecomendItemBean.set_from(this.f54204b);
                    gamedownRecomendItemBean.set_from_type(this.f54205c);
                    QueryDownloadInfoResponseData queryDownloadInfoResponseData = this.f54206d;
                    if (queryDownloadInfoResponseData != null) {
                        gamedownRecomendItemBean.setResourceSize(queryDownloadInfoResponseData.getResourceSize());
                        gamedownRecomendItemBean.setActual_size(this.f54206d.getActualSize());
                        gamedownRecomendItemBean.setDown_url_remote(this.f54206d.getDownloadURL());
                        gamedownRecomendItemBean.setResourceUrl(this.f54206d.getResourceURL());
                    }
                    CommonService.this.J1(gamedownRecomendItemBean, true, this.f54207e, this.f54208f, this.f54209g, this.f54210h, this.f54211i);
                } catch (Exception e5) {
                    e5.printStackTrace();
                    CommonService.this.r0("获取游戏信息失败");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j extends Handler {
        j() {
        }

        private void a(String str, String str2) {
            JoystickTable joystickTable = new JoystickTable();
            joystickTable.setName(str);
            joystickTable.setMac(str2);
            joystickTable.setTime(Long.valueOf(System.currentTimeMillis()));
            a0.o().k(joystickTable);
        }

        private void b(String str, String str2, int i4) {
            com.papa.sim.statistic.p.l(CommonService.this.f54166n).b0(AccountUtil_.getInstance_(CommonService.this.f54166n).getUid(), AccountUtil_.getInstance_(CommonService.this.f54166n).isTourist(), str, str2, i4);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            if (message.what == 10000 && (obj = message.obj) != null && (obj instanceof com.papa.controller.core.b)) {
                com.papa.controller.core.b bVar = (com.papa.controller.core.b) obj;
                String d5 = bVar.d();
                String c5 = bVar.c();
                int i4 = (g2.i(bVar.f()) && g2.i(bVar.e())) ? 1 : 0;
                if (!CommonService.this.k0(c5)) {
                    a(d5, c5);
                    b(d5, c5, i4);
                }
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements ControllerManager.d {
        k() {
        }

        @Override // com.papa.controller.core.ControllerManager.d
        public void a(ControllerManager.c cVar) {
        }

        @Override // com.papa.controller.core.ControllerManager.d
        public void b(ControllerManager.c cVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f54215b;

        l(List list) {
            this.f54215b = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService commonService = CommonService.this;
            int i4 = commonService.I;
            if (i4 <= commonService.H) {
                int i5 = commonService.G;
                int i6 = i4 * i5;
                commonService.E = i6;
                commonService.F = Math.min(i6 + i5, this.f54215b.size());
                List list = this.f54215b;
                CommonService commonService2 = CommonService.this;
                List<String> subList = list.subList(commonService2.E, commonService2.F);
                CommonService.this.I++;
                if (subList == null || subList.size() <= 0) {
                    return;
                }
                CommonService.this.u(subList);
                return;
            }
            ScheduledExecutorService scheduledExecutorService = commonService.D;
            if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                return;
            }
            CommonService.this.D.shutdown();
            CommonService.this.D = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements Callback<ResponseModel<DataGameListBean>> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54217b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f54218c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f54219d;

        m(String str, boolean z4, String str2) {
            this.f54217b = str;
            this.f54218c = z4;
            this.f54219d = str2;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel<DataGameListBean>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel<DataGameListBean>> call, Response<ResponseModel<DataGameListBean>> response) {
            ResponseModel<DataGameListBean> body;
            DownloadTask F;
            if (response == null || (body = response.body()) == null || body.getData() == null) {
                return;
            }
            List<GamedownRecomendItemBean> gameList = body.getData().getGameList();
            if (gameList != null && gameList.size() > 0) {
                DownloadCenterTuijianMain downloadCenterTuijianMain = new DownloadCenterTuijianMain();
                downloadCenterTuijianMain.setGameid(this.f54217b);
                downloadCenterTuijianMain.setCollectionList(gameList);
                downloadCenterTuijianMain.setJumpInfo(body.getData().getJumpInfo());
                CommonService.this.f54155c.recomDataJson().g(JsonMapper.getInstance().toJson(downloadCenterTuijianMain));
                CommonService.this.f54166n.sendBroadcast(new Intent("com.hasget.new.recomdwon,data"));
                if (this.f54218c || p1.f.K().F(this.f54217b) == null || !CommonService.V) {
                    return;
                }
                DownloadTask F2 = p1.f.K().F(this.f54217b);
                if (com.join.mgps.pref.h.n(CommonService.this.f54166n).x()) {
                    ((GamedownloadRecomdActivity_.IntentBuilder_) GamedownloadRecomdActivity_.intent(CommonService.this.f54166n).flags(268435456)).gameName(this.f54219d).start();
                } else if (F2 == null || new PrefDef_(CommonService.this.f54166n).downloadSpeedUpGameSize().d().intValue() > F2.getActual_size()) {
                } else {
                    if ((TextUtils.isEmpty(F2.getFileType()) || !F2.getFileType().equals(Dtype.chajian.name())) && !F2.isDisableShowSpeedUpPrompt() && UtilsMy.c0(CommonService.this.f54166n, F2.getCrc_link_type_val())) {
                        ((GamedownloadRecomdActivity2_.IntentBuilder_) GamedownloadRecomdActivity2_.intent(CommonService.this.f54166n).flags(268435456)).gameName(this.f54219d).start();
                    }
                }
            } else if (this.f54218c || (F = p1.f.K().F(this.f54217b)) == null || new PrefDef_(CommonService.this.f54166n).downloadSpeedUpGameSize().d().intValue() > F.getActual_size()) {
            } else {
                if ((TextUtils.isEmpty(F.getFileType()) || !F.getFileType().equals(Dtype.chajian.name())) && !F.isDisableShowSpeedUpPrompt() && UtilsMy.c0(CommonService.this.f54166n, F.getCrc_link_type_val())) {
                    ((GamedownloadRecomdActivity2_.IntentBuilder_) GamedownloadRecomdActivity2_.intent(CommonService.this.f54166n).flags(268435456)).gameName(this.f54219d).start();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    private class n implements Runnable {
        private n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService.this.A();
        }

        /* synthetic */ n(CommonService commonService, e eVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.join.android.app.common.utils.j.j(CommonService.this.getApplicationContext())) {
                CommonService.this.f0();
                CommonService.this.g0();
                CommonService.this.h0(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final String f54223a = EmuBaseActivity.prefix;

        /* renamed from: b  reason: collision with root package name */
        public String f54224b = "com.join.android.app.mgsim.wufun.broadcast.acceptInvitePlay";

        /* renamed from: c  reason: collision with root package name */
        public String f54225c = "com.join.android.app.mgsim.wufun.broadcast.setOnlineState";

        /* renamed from: d  reason: collision with root package name */
        public String f54226d = "com.join.android.app.mgsim.wufun.broadcast.getOnlineState";

        /* renamed from: e  reason: collision with root package name */
        public String f54227e = "com.join.android.app.mgsim.wufun.broadcast.gamePlay";

        /* renamed from: f  reason: collision with root package name */
        public String f54228f = "com.join.android.app.mgsim.wufun.broadcast.addFriends";

        /* renamed from: g  reason: collision with root package name */
        public String f54229g = "com.join.android.app.mgsim.wufun.broadcast.friendsApplication";

        /* renamed from: h  reason: collision with root package name */
        public String f54230h = "com.join.android.app.mgsim.wufun.broadcast.receiveInvitation";

        p() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String stringExtra;
            try {
                stringExtra = intent.getStringExtra("packageName");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (TextUtils.isEmpty(stringExtra) || !stringExtra.equals(CommonService.this.getPackageName())) {
                return;
            }
            String action = intent.getAction();
            if (action.equals(this.f54226d)) {
                int A = com.wufan.friend.chat.c.u().A();
                Intent intent2 = new Intent("com.join.android.app.mgsim.wufun.broadcast.onOnlineState");
                intent2.putExtra(NoticeTopAnimActivityDialog_.f36148o, A);
                CommonService.this.sendBroadcast(intent2);
            } else if (action.equals(this.f54225c)) {
                com.wufan.friend.chat.c.u().U(intent.getIntExtra(NoticeTopAnimActivityDialog_.f36148o, 0));
            } else {
                String str = "0";
                String str2 = "";
                if (action.equals(this.f54224b)) {
                    int intExtra = intent.getIntExtra("accept", 0);
                    FriendInviteBean s4 = com.wufan.friend.chat.c.u().s();
                    if (s4 != null) {
                        try {
                            str2 = com.wufan.friend.chat.c.u().s().getGameId() + "";
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                    if (intExtra == 1) {
                        com.join.mgps.event.q qVar = new com.join.mgps.event.q(7);
                        qVar.n(str2);
                        org.greenrobot.eventbus.c.f().o(qVar);
                        Ext ext = new Ext();
                        ext.setFrom("1");
                        ext.setGameId(str2);
                        n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
                        if (accountData != null) {
                            ext.setUid(accountData.getUid());
                        }
                        if (s4 != null) {
                            if (s4.getSource() != 1) {
                                str = "1";
                            }
                            ext.setPosition(str);
                        }
                        com.papa.sim.statistic.p.l(context).O1(Event.SuccessInvitation, ext);
                        return;
                    } else if (intExtra == 2) {
                        Ext ext2 = new Ext();
                        ext2.setFrom("1");
                        ext2.setGameId(str2);
                        n0 accountData2 = AccountUtil_.getInstance_(context).getAccountData();
                        if (accountData2 != null) {
                            ext2.setUid(accountData2.getUid());
                        }
                        if (s4 != null) {
                            if (s4.getSource() != 1) {
                                str = "1";
                            }
                            ext2.setPosition(str);
                        }
                        com.papa.sim.statistic.p.l(context).O1(Event.OverdueInvitation, ext2);
                        com.wufan.friend.chat.c.u().P();
                        return;
                    } else {
                        Ext ext3 = new Ext();
                        ext3.setFrom("1");
                        ext3.setGameId(str2);
                        n0 accountData3 = AccountUtil_.getInstance_(context).getAccountData();
                        if (accountData3 != null) {
                            ext3.setUid(accountData3.getUid());
                        }
                        if (s4 != null) {
                            if (s4.getSource() != 1) {
                                str = "1";
                            }
                            ext3.setPosition(str);
                        }
                        com.papa.sim.statistic.p.l(context).O1(Event.RefuseInvitation, ext3);
                        com.wufan.friend.chat.c.u().P();
                        return;
                    }
                } else if (action.equals(this.f54227e)) {
                    int intExtra2 = intent.getIntExtra("action", 2);
                    int intExtra3 = intent.getIntExtra("startMode", 0);
                    long parseLong = TextUtils.isEmpty(intent.getStringExtra("gameId")) ? 0L : Long.parseLong(intent.getStringExtra("gameId"));
                    int parseInt = !TextUtils.isEmpty(intent.getStringExtra(CommonService_.a0.f54279g)) ? Integer.parseInt(intent.getStringExtra(CommonService_.a0.f54279g)) : 0;
                    int parseInt2 = !TextUtils.isEmpty(intent.getStringExtra("uid")) ? Integer.parseInt(intent.getStringExtra("uid")) : 0;
                    w0.e("channel", "actionGamePlay startMode=" + intExtra3);
                    com.wufan.friend.chat.c.u().q(intExtra2, intExtra3, parseLong, parseInt, parseInt2);
                    return;
                } else if (action.equals(this.f54228f)) {
                    int intExtra4 = intent.getIntExtra("from", 0);
                    Ext ext4 = new Ext();
                    ext4.setFrom(intExtra4 + "");
                    com.papa.sim.statistic.p.l(context).O1(Event.addFriends, ext4);
                    return;
                } else if (action.equals(this.f54229g)) {
                    int intExtra5 = intent.getIntExtra("action", -1);
                    Ext ext5 = new Ext();
                    ext5.setPosition(intExtra5 + "");
                    com.papa.sim.statistic.p.l(context).O1(Event.Friendsapplication, ext5);
                    return;
                } else if (action.equals(this.f54230h)) {
                    FriendInviteBean s5 = com.wufan.friend.chat.c.u().s();
                    if (s5 != null) {
                        try {
                            str2 = com.wufan.friend.chat.c.u().s().getGameId() + "";
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                    }
                    Ext ext6 = new Ext();
                    ext6.setFrom("1");
                    ext6.setGameId(str2);
                    n0 accountData4 = AccountUtil_.getInstance_(context).getAccountData();
                    if (accountData4 != null) {
                        ext6.setUid(accountData4.getUid());
                    }
                    if (s5 != null) {
                        if (s5.getSource() != 1) {
                            str = "1";
                        }
                        ext6.setPosition(str);
                    }
                    com.papa.sim.statistic.p.l(context).O1(Event.ReceiveInvitation, ext6);
                    return;
                } else {
                    return;
                }
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService.this.d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r extends BroadcastReceiver {
        r() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                CommonService.this.e();
            } catch (Exception unused) {
                CommonService.this.f54157e.putExtra("type", "11");
                CommonService.this.f54157e.putExtra("msg", "登录失败");
                CommonService commonService = CommonService.this;
                commonService.sendBroadcast(commonService.f54157e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s extends BroadcastReceiver {
        s() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (com.wufan.friend.chat.c.u().F()) {
                com.wufan.friend.chat.c.u().h(intent.getStringExtra("text"));
                return;
            }
            com.wufan.friend.chat.c.u().K();
        }
    }

    /* loaded from: classes4.dex */
    static class t extends Handler {
        t() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    /* loaded from: classes4.dex */
    class u implements Runnable {
        u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CommonService.this.X1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (U) {
            v0();
            s();
            w();
        }
    }

    private String B(String str) {
        File file;
        String str2;
        HttpURLConnection httpURLConnection;
        try {
            File file2 = new File(this.f54168p);
            String str3 = System.currentTimeMillis() + ".png";
            if (!file2.exists()) {
                file2.mkdirs();
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(v.f28104d);
                String str4 = File.separator;
                sb.append(str4);
                sb.append("MG");
                sb.append(str4);
                sb.append(".nomedia");
                File file3 = new File(sb.toString());
                if (!file3.exists()) {
                    if (!file3.getParentFile().exists()) {
                        file3.getParentFile().mkdirs();
                    }
                    file3.createNewFile();
                }
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            str2 = this.f54168p + File.separator + str3;
            file = new File(str2);
        } catch (Exception e6) {
            e = e6;
            file = null;
        }
        try {
            if (file.exists()) {
                UtilsMy.delete(file);
            }
            file.createNewFile();
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
        } catch (Exception e7) {
            e = e7;
            e.printStackTrace();
            if (file != null && file.exists()) {
                UtilsMy.delete(file);
            }
            return null;
        }
        if (httpURLConnection.getResponseCode() == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    inputStream.close();
                    fileOutputStream.close();
                    return str2;
                }
            }
        } else {
            if (file.exists()) {
                UtilsMy.delete(file);
            }
            return null;
        }
    }

    private String C(String str) {
        File file;
        String str2;
        HttpURLConnection httpURLConnection;
        try {
            File file2 = new File(this.f54168p);
            String str3 = System.currentTimeMillis() + ".mp4";
            if (!file2.exists()) {
                file2.mkdirs();
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(v.f28104d);
                String str4 = File.separator;
                sb.append(str4);
                sb.append("MG");
                sb.append(str4);
                sb.append(".nomedia");
                File file3 = new File(sb.toString());
                if (!file3.exists()) {
                    if (!file3.getParentFile().exists()) {
                        file3.getParentFile().mkdirs();
                    }
                    file3.createNewFile();
                }
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            str2 = this.f54168p + File.separator + str3;
            file = new File(str2);
        } catch (Exception e6) {
            e = e6;
            file = null;
        }
        try {
            if (file.exists()) {
                UtilsMy.delete(file);
            }
            file.createNewFile();
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
        } catch (Exception e7) {
            e = e7;
            e.printStackTrace();
            if (file != null && file.exists()) {
                UtilsMy.delete(file);
            }
            return null;
        }
        if (httpURLConnection.getResponseCode() == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    inputStream.close();
                    fileOutputStream.close();
                    return str2;
                }
            }
        } else {
            if (file.exists()) {
                UtilsMy.delete(file);
            }
            return null;
        }
    }

    public static List<String> H(String str) {
        File[] listFiles;
        File file = new File(str);
        ArrayList arrayList = new ArrayList();
        if (file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    String name = file2.getName();
                    if (name.endsWith(".apk") || name.endsWith(".zip")) {
                        arrayList.add(file2.getAbsolutePath());
                    }
                } else {
                    List<String> H = H(file2.getAbsolutePath());
                    if (H.size() != 0) {
                        arrayList.addAll(H);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K1(DownloadGameArgsBean downloadGameArgsBean, CollectionBeanSub collectionBeanSub, DownloadTask downloadTask) {
        int i4;
        int i5;
        if (downloadGameArgsBean != null) {
            collectionBeanSub.setRecPosition(downloadGameArgsBean.getRecPosition());
            collectionBeanSub.setReMarks(downloadGameArgsBean.getRemarks());
            collectionBeanSub.setNodeId(downloadGameArgsBean.getNodeId());
            collectionBeanSub.set_from(downloadGameArgsBean.getFrom());
            collectionBeanSub.set_from_type(downloadGameArgsBean.getFromType());
            if (g2.i(downloadGameArgsBean.getVolcanoOther())) {
                collectionBeanSub.setPosition_path((StatFactory.VolcanoOther) JsonMapper.getInstance().fromJson(downloadGameArgsBean.getVolcanoOther(), StatFactory.VolcanoOther.class));
            }
            downloadTask.set_from(downloadGameArgsBean.getFrom());
            downloadTask.set_from_type(downloadGameArgsBean.getFromType());
            downloadTask.setFromRecomDown(downloadGameArgsBean.isFromRecommend());
            downloadTask.setKeyword(downloadGameArgsBean.getKeyWord());
            downloadTask.setExt(downloadGameArgsBean.getExt());
            downloadTask.setExt1(downloadGameArgsBean.getExt1());
        }
        String plugin_num = downloadTask.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val(collectionBeanSub.getDown_url_remote());
            UtilsMy.T2(downloadTask, this.f54166n);
            p1.f.K().m(downloadTask);
            IntentUtil.getInstance().intentActivity(this.f54166n, intentDateBean);
        } else if (UtilsMy.y0(collectionBeanSub.getPay_tag_info(), collectionBeanSub.getCrc_sign_id()) > 0) {
            UtilsMy.d4(this.f54166n, downloadTask.getCrc_link_type_val());
        } else {
            UtilsMy.y1(downloadTask, collectionBeanSub);
            if (collectionBeanSub.getDown_status() == 5) {
                if (downloadTask.getMax_an_compatible_ver() > 0 && (((i5 = Build.VERSION.SDK_INT) < downloadTask.getMin_an_compatible_ver() || i5 > downloadTask.getMax_an_compatible_ver()) && g2.h(downloadTask.getMod_info()))) {
                    this.f54177y = downloadTask;
                    Intent intent = new Intent(o1.a.f72017o0);
                    intent.putExtra("gameid", this.f54177y.getCrc_link_type_val());
                    sendBroadcast(intent);
                    return;
                }
                UtilsMy.l1(this.f54166n, downloadTask);
            } else if (downloadTask.getMax_an_compatible_ver() > 0 && (((i4 = Build.VERSION.SDK_INT) < downloadTask.getMin_an_compatible_ver() || i4 > downloadTask.getMax_an_compatible_ver()) && g2.h(downloadTask.getMod_info()))) {
                this.f54177y = downloadTask;
                Intent intent2 = new Intent(o1.a.f72017o0);
                intent2.putExtra("gameid", this.f54177y.getCrc_link_type_val());
                sendBroadcast(intent2);
            } else {
                UtilsMy.S0(this.f54166n, downloadTask, collectionBeanSub.getTp_down_url(), collectionBeanSub.getOther_down_switch(), collectionBeanSub.getCdn_down_switch(), downloadGameArgsBean);
            }
        }
    }

    private void S() {
        ResultMainBean<List<ApkVersionbean>> C1;
        EMUApkArenaTable eMUApkArenaTable;
        if (!com.join.android.app.common.utils.j.j(this)) {
            return;
        }
        ResultMainBean<List<ApkVersionbean>> resultMainBean = null;
        try {
            C1 = com.join.mgps.rpc.impl.d.P1().C1(RequestBeanUtil.getInstance(this).getApkVersion(2, 2, 0));
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
                                        com.join.android.app.common.utils.l.H(F, eMUApkArenaTable);
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
                                    b2.o.o().k(eMUApkArenaTable2);
                                    com.join.android.app.common.utils.l.H(F, eMUApkArenaTable2);
                                    com.join.android.app.common.utils.l.E(eMUApkArenaTable2);
                                }
                            }
                        }
                    } catch (Exception unused) {
                        resultMainBean = C1;
                        if (resultMainBean != null || this.C <= 0) {
                            return;
                        }
                        v0.d("getEMUVersionForArena", "failed  " + this.f54158f);
                        this.C = this.C - 1;
                        try {
                            Thread.sleep(5000L);
                            S();
                        } catch (InterruptedException unused2) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    resultMainBean = C1;
                    if (resultMainBean == null && this.C > 0) {
                        v0.d("getEMUVersionForArena", "failed  " + this.f54158f);
                        this.C = this.C - 1;
                        try {
                            Thread.sleep(5000L);
                            S();
                        } catch (InterruptedException unused3) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        if (C1 != null || this.C <= 0) {
            return;
        }
        v0.d("getEMUVersionForArena", "failed  " + this.f54158f);
        this.C = this.C - 1;
        Thread.sleep(5000L);
        S();
    }

    private void Y(DownloadGameArgsBean downloadGameArgsBean) {
        try {
            String gameId = downloadGameArgsBean.getGameId();
            boolean isFromRecommend = downloadGameArgsBean.isFromRecommend();
            int from = downloadGameArgsBean.getFrom();
            int fromType = downloadGameArgsBean.getFromType();
            String keyWord = downloadGameArgsBean.getKeyWord();
            String recPosition = downloadGameArgsBean.getRecPosition();
            String remarks = downloadGameArgsBean.getRemarks();
            String nodeId = downloadGameArgsBean.getNodeId();
            RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
            requestModel.setDefault(this.f54166n);
            QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
            ArrayList arrayList = new ArrayList();
            arrayList.add(gameId);
            queryDownloadInfoRequestArgs.setGameIdList(arrayList);
            queryDownloadInfoRequestArgs.setLocation(downloadGameArgsBean.getLocation());
            requestModel.setArgs(queryDownloadInfoRequestArgs);
            com.join.mgps.rpc.impl.i.D0().B0().g1(requestModel).enqueue(new g(recPosition, remarks, nodeId, from, fromType, downloadGameArgsBean, isFromRecommend, keyWord, queryDownloadInfoRequestArgs));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void Y0() {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                if (accountData != null && accountData.getUid() != 0) {
                    ForumResponse<ForumData.ForumProfilePostsData> k4 = com.join.mgps.rpc.impl.g.A0().k(accountData.getUid(), accountData.getToken(), 1, 0, "");
                    ForumData.ForumProfilePostsData data = k4 != null ? k4.getData() : null;
                    if (data != null) {
                        ForumBean.ForumProfilePostUserInfoBean user_info = data.getUser_info();
                        j0.n1(data);
                        k0.I1(this).c1(user_info);
                        return;
                    }
                    return;
                }
                return;
            }
            new ForumBean.ForumProfilePostUserInfoBean();
            ForumTable o4 = b2.t.p().o(ForumBean.ForumEvent.ProfilePosts);
            if (o4 == null || g2.h(o4.getArgs1()) || o4.getArgs1().equals("\"\"")) {
                return;
            }
            k0.I1(this).c1(j0.H(o4.getArgs1()).getUser_info());
        } catch (Exception unused) {
        }
    }

    private void Z0() {
        n0 accountData;
        int i4 = 0;
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                try {
                    accountData = AccountUtil_.getInstance_(this).getAccountData();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                if (accountData != null && accountData.getUid() != 0) {
                    ForumResponse<ForumData.ForumProfileUnreadMessageCountData> K = com.join.mgps.rpc.impl.g.A0().K(accountData.getUid(), accountData.getToken(), "");
                    r0 = K != null ? K.getData() : null;
                    if (r0 != null) {
                        i4 = r0.getUnread();
                    }
                    return;
                }
                return;
            } finally {
                j0.o1(null);
                k0.I1(this).b1(0);
            }
        }
        ForumTable o4 = b2.t.p().o(ForumBean.ForumEvent.ProfileGetUnreadMessageCount);
        if (o4 != null && !g2.h(o4.getArgs1())) {
            i4 = j0.I(o4.getArgs1()).getUnread();
        }
        k0.I1(this).b1(i4);
    }

    private void h1(DownloadGameArgsBean downloadGameArgsBean, int i4) {
        try {
            if (this.f54178z == null) {
                this.f54178z = com.join.mgps.rpc.impl.i.D0();
            }
            if (!com.join.android.app.common.utils.j.j(this.f54166n)) {
                w1(downloadGameArgsBean.getGameId(), 49);
            }
            RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
            requestModel.setDefault(this.f54166n);
            QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
            ArrayList arrayList = new ArrayList();
            arrayList.add(downloadGameArgsBean.getGameId());
            queryDownloadInfoRequestArgs.setGameIdList(arrayList);
            queryDownloadInfoRequestArgs.setLocation(downloadGameArgsBean.getLocation());
            requestModel.setArgs(queryDownloadInfoRequestArgs);
            this.f54178z.A0(requestModel, new f(downloadGameArgsBean, i4));
        } catch (Exception e5) {
            e5.printStackTrace();
            w1(downloadGameArgsBean.getGameId(), 49);
            r0("获取游戏信息失败");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k0(String str) {
        JoystickTable n4 = a0.o().n(str);
        if (n4 == null) {
            return false;
        }
        return com.join.android.app.common.utils.g.g(n4.getTime().longValue());
    }

    private void l1(ControllerManager.c cVar) {
        if (cVar == null) {
            return;
        }
        JoystickTable joystickTable = new JoystickTable();
        joystickTable.setName(cVar.d());
        joystickTable.setMac(cVar.a());
        joystickTable.setTime(Long.valueOf(System.currentTimeMillis()));
        a0.o().k(joystickTable);
    }

    private boolean m0() {
        n0 accountData = AccountUtil_.getInstance_(this.f54166n).getAccountData();
        return accountData != null && g2.i(accountData.getToken());
    }

    private boolean n0() {
        ShowViewDataBean showViewDataBean;
        ShowViewDataBean showViewDataBean2;
        try {
            List<ShowViewDataBeanTable> d5 = i0.o().d();
            ArrayList arrayList = new ArrayList();
            for (ShowViewDataBeanTable showViewDataBeanTable : d5) {
                arrayList.add(showViewDataBeanTable.getShowVieDatabean());
            }
            long currentTimeMillis = System.currentTimeMillis();
            showViewDataBean = null;
            showViewDataBean2 = null;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ShowViewDataBean showViewDataBean3 = (ShowViewDataBean) arrayList.get(i4);
                String is_force = showViewDataBean3.getIs_force();
                if (is_force.equals("1") && showViewDataBean3.getTag_show() != 2) {
                    long parseLong = Long.parseLong(showViewDataBean3.getEnd_times()) * 1000;
                    if (currentTimeMillis > Long.parseLong(showViewDataBean3.getBegin_times()) * 1000 && currentTimeMillis < parseLong) {
                        showViewDataBean = showViewDataBean3;
                    }
                } else if (!is_force.equals("1") && showViewDataBean3.getTag_show() != 2) {
                    long parseLong2 = Long.parseLong(showViewDataBean3.getEnd_times()) * 1000;
                    if (currentTimeMillis > Long.parseLong(showViewDataBean3.getBegin_times()) * 1000 && currentTimeMillis < parseLong2 && showViewDataBean3.getJump_info().size() > 0 && showViewDataBean3.getTag_show() != 2) {
                        showViewDataBean2 = showViewDataBean3;
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (showViewDataBean != null) {
            return D1(showViewDataBean);
        }
        if (showViewDataBean2 != null) {
            return D1(showViewDataBean2);
        }
        return false;
    }

    private void n1(ForumBannerBean.ForumBannerMessagesData forumBannerMessagesData) {
        String n4 = j0.n(forumBannerMessagesData);
        ForumTable forumTable = new ForumTable();
        forumTable.setType(ForumBean.ForumEvent.ForumWelcomeBanner.name());
        forumTable.setArgs1(n4);
        forumTable.setTime(String.valueOf(System.currentTimeMillis() / 1000));
        b2.t.p().u(forumTable);
    }

    private void o0() {
        try {
            if (this.f54169q) {
                return;
            }
            M1();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void o1(ForumData.ForumForumWelcomeData forumForumWelcomeData) {
        String p4 = j0.p(forumForumWelcomeData);
        ForumTable forumTable = new ForumTable();
        forumTable.setType(ForumBean.ForumEvent.ForumWelcome.name());
        forumTable.setArgs1(p4);
        forumTable.setTime(String.valueOf(System.currentTimeMillis() / 1000));
        b2.t.p().u(forumTable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p0() {
        com.wufan.friend.chat.c.u().C();
    }

    private void p1(ForumData.ForumForumWelcomePostsData forumForumWelcomePostsData) {
        if (forumForumWelcomePostsData == null || forumForumWelcomePostsData.getPosts_list() == null || forumForumWelcomePostsData.getPosts_list().size() == 0) {
            return;
        }
        String q4 = j0.q(forumForumWelcomePostsData);
        ForumTable forumTable = new ForumTable();
        forumTable.setType(ForumBean.ForumEvent.ForumWelcomePosts.name());
        forumTable.setArgs1(q4);
        forumTable.setTime(String.valueOf(System.currentTimeMillis() / 1000));
        b2.t.p().u(forumTable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(LinkedHashMap linkedHashMap, String str) {
        i0((FileInfo) linkedHashMap.get(str), this.Q.get(str));
        this.P.remove(str);
    }

    private void s() {
        List<ForumTable> r4 = b2.t.p().r(ForumBean.ForumEvent.PostsPraise);
        if (r4 == null || r4.size() == 0) {
            return;
        }
        for (ForumTable forumTable : r4) {
            String args2 = forumTable.getArgs2();
            if (args2 != null && !g2.h(args2)) {
                ForumRequestBean.ForumPostsPraiseRequestBean G = j0.G(forumTable.getArgs1());
                if (!j0.F(args2).isResult()) {
                    I0(G.getPid());
                }
            }
        }
    }

    private void v0() {
        try {
            if (this.A == null) {
                o0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void w() {
        p1.f.K().v();
    }

    private void w0(String str) {
        String str2;
        try {
            if (com.join.android.app.common.utils.j.j(this.f54166n)) {
                n0 accountData = AccountUtil_.getInstance_(this.f54166n).getAccountData();
                int uid = accountData != null ? accountData.getUid() : 0;
                if (IntentUtil.getInstance().goLogin(this.f54166n)) {
                    r0("请先登录！");
                    return;
                }
                try {
                    PackageInfo packageInfo = this.f54166n.getPackageManager().getPackageInfo(this.f54166n.getPackageName(), 0);
                    str2 = packageInfo.versionCode + "_" + packageInfo.versionName;
                } catch (PackageManager.NameNotFoundException e5) {
                    e5.printStackTrace();
                }
                RequestdetialFolowAndBeSpeak requestdetialFolowAndBeSpeak = new RequestdetialFolowAndBeSpeak();
                requestdetialFolowAndBeSpeak.setApp_ver(str2);
                requestdetialFolowAndBeSpeak.setGame_id(str);
                requestdetialFolowAndBeSpeak.setUid(uid);
                requestdetialFolowAndBeSpeak.setMobile(accountData.z());
                com.join.mgps.rpc.impl.d.P1().O1().d0(RequestBeanUtil.getInstance(this.f54166n).getDetialFollowAnd(requestdetialFolowAndBeSpeak)).enqueue(new e(str));
                return;
            }
            r0("请检查网络！");
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1(String str, int i4) {
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.n(null, str, i4));
    }

    private void x1(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("onEndGameRecordUpload: broad");
        sb.append(str);
        Intent intent = new Intent(BAction.ACTION_ENDGAME_RECORD_UPLOAD_RESULT);
        intent.putExtra("url", str);
        sendBroadcast(intent);
    }

    private void y1(ControllerManager.c cVar) {
        com.papa.sim.statistic.p.l(this.f54166n).b0(AccountUtil_.getInstance_(this.f54166n).getUid(), AccountUtil_.getInstance_(this.f54166n).isTourist(), cVar.d(), cVar.a(), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.L0})
    public void A0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra String str3, @Receiver.Extra int i4, @Receiver.Extra String str4, @Receiver.Extra String str5, @Receiver.Extra String str6) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (str2.equals("battleScoreBoard")) {
            v1(str5, str4, str6, str3);
        } else if (str2.equals("loadRomCompleted")) {
            A1(str5, str4, str6, str3);
        } else if (str2.equals("battleReconnect")) {
            q(str5, str4, str6, str3);
        }
    }

    void A1(String str, String str2, String str3, String str4) {
        w0.e("sendRomLoadedToSvr", str4, "" + str);
        if (!this.f54175w) {
            r();
            return;
        }
        try {
            ArenaRequest arenaRequest = new ArenaRequest(ArenaConstants.ArenaCommand.CMD_SEND_ROM_LOADED);
            try {
                if (!TextUtils.isEmpty(str2)) {
                    arenaRequest.gameId = Long.parseLong(str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    arenaRequest.roomId = Integer.parseInt(str);
                }
                if (!TextUtils.isEmpty(str3)) {
                    arenaRequest.uid = Integer.parseInt(str3);
                }
            } catch (Exception unused) {
            }
            arenaRequest.battleScoreBoard = str4;
            this.f54174v.f(arenaRequest);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {BAction.ACTION_ENDGAME_RECORD_UPLOAD})
    public void B0(@Receiver.Extra String str, @Receiver.Extra String str2) {
        try {
            if (TextUtils.equals(this.M, str)) {
                return;
            }
            this.M = str;
            if (this.L) {
                return;
            }
            this.L = true;
            DownloadTask F = p1.f.K().F(str2);
            String gameZipPath = F.getGameZipPath();
            String substring = gameZipPath.substring(0, gameZipPath.lastIndexOf(net.lingala.zip4j.util.e.F0));
            String substring2 = substring.substring(substring.lastIndexOf(net.lingala.zip4j.util.e.F0), substring.length());
            String str3 = SDCardUtil.getExternalStorageDirectory(this) + "/papa91/" + ("".equals(F.getRomType()) ? "arc" : UtilsMy.X1(Integer.parseInt(F.getRomType()))) + substring2 + net.lingala.zip4j.util.e.F0;
            String str4 = str3 + "10000.rec";
            String str5 = str3 + this.M + ".rec";
            boolean x4 = h0.x(str4);
            if (!x4) {
                str4 = str3 + "10000_v2.rec";
                str5 = str3 + this.M + "_v2.rec";
                x4 = h0.x(str4);
            }
            if (!x4) {
                str4 = str4 + "10000_v3.rec";
                str5 = str3 + this.M + "_v3.rec";
                h0.x(str4);
            }
            if (new File(str4).renameTo(new File(str5))) {
                Z1(str2, str5);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void B1(SharePostRequest sharePostRequest) {
        try {
            ForumResponse<ForumData.ForumResult> f5 = com.join.mgps.rpc.impl.g.A0().f(sharePostRequest.getParams());
            if (f5 != null) {
                v0.d("shareResult ", f5.getError() + "  " + f5.getError_message());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            v0.d("shareResult ", "请求报错");
        }
    }

    public void C0(int i4, List<ControllerManager.c> list) {
        if ((list != null ? list.size() : 0) <= 0) {
            return;
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            ControllerManager.c cVar = list.get(i5);
            if (!k0(cVar.a())) {
                l1(cVar);
                y1(cVar);
            }
        }
    }

    void C1() {
        if (this.A != null) {
            this.A.w(null, new j());
            this.A.v(new k());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void D(String str, String str2, DownloadTask downloadTask, boolean z4, DownloadGameArgsBean downloadGameArgsBean) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                String uid = AccountUtil_.getInstance_(this).getUid();
                String token = AccountUtil_.getInstance_(this).getToken();
                RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
                requestModel.setDefault(this);
                QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
                queryDownloadInfoRequestArgs.setGameId(str);
                queryDownloadInfoRequestArgs.setUid(uid);
                queryDownloadInfoRequestArgs.setToken(token);
                requestModel.setArgs(queryDownloadInfoRequestArgs);
                ResponseModel<QueryDownloadInfoResponseData> q4 = com.join.mgps.rpc.impl.i.D0().q(requestModel);
                if (q4 != null && q4.getCode() == 600) {
                    if (q4.getData() == null) {
                        r0("获取资源失败，请重新再试。");
                        return;
                    } else {
                        F1(str, str2, q4.getData(), downloadTask, z4, downloadGameArgsBean);
                        return;
                    }
                }
                r0("获取资源失败，请重新再试。");
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                r0("获取资源失败，请重新再试。");
                return;
            }
        }
        r0(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.K0})
    public void D0(@Receiver.Extra String str, @Receiver.Extra SpValue spValue) {
        try {
            SharedPreferences sharedPreferences = getSharedPreferences("PrefDef", 4);
            if (spValue != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                if (edit != null) {
                    if (spValue.getValue() instanceof Boolean) {
                        edit.putBoolean(str, ((Boolean) spValue.getValue()).booleanValue());
                    } else if (spValue.getValue() instanceof Integer) {
                        edit.putInt(str, ((Integer) spValue.getValue()).intValue());
                    } else if (spValue.getValue() instanceof String) {
                        edit.putString(str, (String) spValue.getValue());
                    } else if (spValue.getValue() instanceof Float) {
                        edit.putFloat(str, ((Float) spValue.getValue()).floatValue());
                    } else if (spValue.getValue() instanceof Long) {
                        edit.putLong(str, ((Long) spValue.getValue()).longValue());
                    }
                }
                edit.commit();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    boolean D1(ShowViewDataBean showViewDataBean) {
        v0.c("setImageback time =" + System.currentTimeMillis());
        try {
            if (showViewDataBean.getIs_force().equals("1")) {
                showViewDataBean.getJump_info().get(0).getPic_remote();
                return !this.f54155c.lastClickPageAD().d().equals(showViewDataBean.getId() + "");
            }
            for (SplashIntentBean splashIntentBean : showViewDataBean.getJump_info()) {
                if (splashIntentBean.getTag_show() != 2) {
                    return true;
                }
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void E(boolean z4, boolean z5, String str) {
        DownloadTask F;
        WebDiskCfg webDiskCfg = (WebDiskCfg) JsonMapper.getInstance().fromJson(this.f54155c.web_disk_cfg().d(), WebDiskCfg.class);
        if (webDiskCfg == null || g2.h(webDiskCfg.getDown_url()) || g2.h(webDiskCfg.getDown_url_phone())) {
            return;
        }
        if (z5 && com.join.mgps.va.overmind.d.o().O()) {
            F = p1.f.K().F(q1.f27992c);
        } else {
            F = p1.f.K().F(q1.f27993d);
        }
        if (F == null) {
            F = new DownloadTask();
            F.setPackageName(q1.f27991b);
            F.setActual_size(webDiskCfg.getFile_size());
            if (com.join.mgps.va.overmind.d.o().O() && z5) {
                F.setUrl(webDiskCfg.getDown_url());
                F.setCrc_link_type_val(q1.f27992c);
                Dtype dtype = Dtype.MOD;
                F.setFileType(dtype.name());
                F.setRomType(dtype.name());
                F.setTask_down_type(2);
            } else {
                F.setUrl(webDiskCfg.getDown_url_phone());
                F.setCrc_link_type_val(q1.f27993d);
                Dtype dtype2 = Dtype.android;
                F.setFileType(dtype2.name());
                F.setRomType(dtype2.name());
                F.setTask_down_type(2);
            }
            F.setStatus(0);
            F.setShowName("夸克");
            F.setPlugin_num(ConstantIntEnum.MGAME.value() + "");
            F.setOther_down_switch(1);
            F.setVm_device_switch(0);
            F.setPortraitURL(com.join.mgps.rpc.h.L + "/upload/images/7e/08/7e08da9603ec2dd7c2648418ebc6b766.png");
            String ext = F.getExt();
            ExtBean extBean = g2.i(ext) ? (ExtBean) JsonMapper.getInstance().fromJson(ext, ExtBean.class) : null;
            if (extBean == null) {
                extBean = new ExtBean();
            }
            extBean.setPosition(str);
            F.setExt(JsonMapper.toJsonString(extBean));
            p1.f.K().m(F);
        }
        com.php25.PDownload.d.c(F, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.G})
    public void E0(@Receiver.Extra("gameData") CollectionBeanSub collectionBeanSub) {
        if (collectionBeanSub != null) {
            PurchasedListTable n4 = e0.o().n(collectionBeanSub.getGame_id());
            if (n4 == null) {
                n4 = new PurchasedListTable();
            }
            n4.setGame_id(collectionBeanSub.getGame_id());
            e0.o().m(n4);
        }
        if (collectionBeanSub != null) {
            y(collectionBeanSub.getGame_id());
        }
        f1();
    }

    boolean E1() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint"})
    public void F(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra String str3, @Receiver.Extra String str4, @Receiver.Extra String str5) {
        Event[] values;
        Ext ext = new Ext();
        Data data = new Data();
        if (g2.i(str2)) {
            ext.setGameId(str2);
            data.setGameId(Long.parseLong(str2));
        }
        if (g2.i(str4)) {
            ext.setUid(Integer.valueOf(str4).intValue());
        }
        if (g2.i(str3)) {
            ext.setPosition(str3 + "");
        }
        if (g2.i(str5)) {
            ext.setEndId(str5);
        }
        Event event = Event.clickKnowGoRealPage;
        if (event.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event, ext);
            return;
        }
        Event event2 = Event.realNameUpWindows;
        if (event2.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event2, ext);
            return;
        }
        Event event3 = Event.antiAddtionWindowUp;
        if (event3.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event3, ext);
            return;
        }
        Event event4 = Event.realNameAuth;
        if (event4.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event4, ext);
            return;
        }
        Event event5 = Event.nonageAstrictHint;
        if (event5.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event5, ext);
            return;
        }
        Event event6 = Event.realNameClickSubmit;
        if (event6.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event6, ext);
            return;
        }
        Event event7 = Event.clickClosedRealNameWindow;
        if (event7.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event7, ext);
            return;
        }
        Event event8 = Event.realNameDisplayWindow;
        if (event8.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event8, ext);
            return;
        }
        Event event9 = Event.Emu_PatchAd_Pop;
        if (event9.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event9, ext);
            return;
        }
        Event event10 = Event.Emu_PatchAd_Close;
        if (event10.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event10, ext);
            return;
        }
        Event event11 = Event.Emu_PatchAd_Click;
        if (event11.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event11, ext);
            return;
        }
        Event event12 = Event.Emu_ExitAd_Pop;
        if (event12.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event12, ext);
            return;
        }
        Event event13 = Event.Emu_ExitAd_Close;
        if (event13.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event13, ext);
            return;
        }
        Event event14 = Event.Emu_ExitAd_Click;
        if (event14.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event14, ext);
            return;
        }
        Event event15 = Event.Exit_flowad_pop_tt;
        if (event15.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event15, ext);
            return;
        }
        Event event16 = Event.Exit_flowad_pop_gdt;
        if (event16.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event16, ext);
            return;
        }
        Event event17 = Event.Exit_flowad_click;
        if (event17.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event17, ext);
            return;
        }
        Event event18 = Event.Custom_openGoldfinger;
        if (event18.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event18, ext);
            return;
        }
        Event event19 = Event.Custom_closeGoldfinger;
        if (event19.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event19, ext);
            return;
        }
        Event event20 = Event.Customgoldfinger_AdMust_Pop;
        if (event20.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event20, ext);
            return;
        }
        Event event21 = Event.Customgoldfinger_AdMust_Vedio;
        if (event21.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event21, ext);
            return;
        }
        Event event22 = Event.Customgoldfinger_AdMust_Buy;
        if (event22.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event22, ext);
            return;
        }
        Event event23 = Event.Customgoldfinger_AdMust_Close;
        if (event23.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event23, ext);
            return;
        }
        Event event24 = Event.Customgoldfinger_AdUnnecessary_Pop;
        if (event24.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event24, ext);
            return;
        }
        Event event25 = Event.Customgoldfinger_AdUnnecessary_Vedio;
        if (event25.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event25, ext);
            return;
        }
        Event event26 = Event.Customgoldfinger_AdUnnecessary_Buy;
        if (event26.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event26, ext);
            return;
        }
        Event event27 = Event.Customgoldfinger_AdUnnecessary_Close;
        if (event27.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(event27, ext);
            return;
        }
        Event event28 = Event.showVSTaskList;
        if (event28.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).i0(event28, ext, data);
            return;
        }
        Event event29 = Event.gameInStartVS;
        if (event29.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).i0(event29, ext, data);
            return;
        }
        Event event30 = Event.gameInExitVS;
        if (event30.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).i0(event30, ext, data);
            return;
        }
        Event event31 = Event.gameVSSuccess;
        if (event31.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).i0(event31, ext, data);
            return;
        }
        Event event32 = Event.gameVSFail;
        if (event32.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).i0(event32, ext, data);
            return;
        }
        Event event33 = Event.vsKjPopWindow;
        if (event33.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).i0(event33, ext, data);
            return;
        }
        Event event34 = Event.clickGameVSAdVideo;
        if (event34.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).i0(event34, ext, data);
            return;
        }
        Event event35 = Event.expGameVSAdVideo;
        if (event35.name().equals(str)) {
            com.papa.sim.statistic.p.l(getApplicationContext()).i0(event35, ext, data);
            return;
        }
        for (Event event36 : Event.values()) {
            if (event36.name().equals(str)) {
                com.papa.sim.statistic.p.l(getApplicationContext()).O1(event36, ext);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.J0})
    public void F0(@Receiver.Extra String str, @Receiver.Extra boolean z4) {
        getSharedPreferences("PrefDef", 4).edit().putBoolean(str, z4).commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void F1(String str, String str2, QueryDownloadInfoResponseData queryDownloadInfoResponseData, DownloadTask downloadTask, boolean z4, DownloadGameArgsBean downloadGameArgsBean) {
        boolean z5;
        boolean z6;
        DownloadTask downloadTask2 = downloadTask;
        boolean booleanValue = this.f54155c.noPromptDownload().d().booleanValue();
        boolean z7 = true;
        if (queryDownloadInfoResponseData != null) {
            if (queryDownloadInfoResponseData.isForceShow()) {
                queryDownloadInfoResponseData.setSelectedNextTips(true);
                booleanValue = false;
            }
            if (!TextUtils.isEmpty(queryDownloadInfoResponseData.getBtnStatus()) && queryDownloadInfoResponseData.getBtnStatus().equals("open")) {
                booleanValue = false;
            }
        }
        if (downloadTask2 != null) {
            z5 = downloadTask.isUncheckSelfSupport();
            z6 = downloadTask.isDisableShowSpeedUpPrompt();
        } else {
            z5 = false;
            z6 = false;
        }
        if (!booleanValue && !z5 && !(MApplication.f1497x.getActivity() instanceof EndGameLaunchActivity_)) {
            if (downloadTask2 == null) {
                downloadTask2 = new DownloadTask();
            }
            ((DownloadMethodMultiDialog_.k) ((DownloadMethodMultiDialog_.k) ((DownloadMethodMultiDialog_.k) ((DownloadMethodMultiDialog_.k) ((DownloadMethodMultiDialog_.k) ((DownloadMethodMultiDialog_.k) DownloadMethodMultiDialog_.y0(this.f54166n).flags(805306368)).i(str).extra("data", queryDownloadInfoResponseData)).extra("ext", str2)).extra("disableShowSpeedUpPrompt", z6)).extra("fromRecomDown", z4)).extra(DownloadMethodMultiDialog_.L, downloadGameArgsBean)).a(downloadTask2.get_from()).b(downloadTask2.get_from_type()).k((queryDownloadInfoResponseData == null || !queryDownloadInfoResponseData.isForceShow()) ? false : false).start();
            return;
        }
        DownloadTask F = p1.f.K().F(str);
        if (downloadGameArgsBean != null) {
            downloadGameArgsBean.setShowDownRecommend(true ^ UtilsMy.g0(downloadGameArgsBean.getPdInfo(), downloadGameArgsBean.getLocation()));
        }
        if (downloadGameArgsBean == null || downloadGameArgsBean.isShowDownRecommend()) {
            ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this).extra("getDownloadRecomedData", str)).extra("showName", downloadTask.getShowName())).extra("fromRecommendDown", z4)).a();
        }
        if (queryDownloadInfoResponseData != null && F != null && (F.getStatus() == 9 || F.getStatus() == 9)) {
            if (TextUtils.isEmpty(F.getCrc_link_type_val())) {
                return;
            }
            com.php25.PDownload.d.b(F);
            UtilsMy.y4(F, F);
            F.setVer(queryDownloadInfoResponseData.getVer());
            F.setVer_name(queryDownloadInfoResponseData.getVer_name());
            F.setUrl(queryDownloadInfoResponseData.getDownloadURL());
            F.setResource_url_remote(queryDownloadInfoResponseData.getResourceURL());
            F.setActual_size(queryDownloadInfoResponseData.getActualSize());
            F.setRes_actual_size(queryDownloadInfoResponseData.getResourceSize());
            F.setExt(str2);
            F.setFromRecomDown(z4);
            com.php25.PDownload.d.c(F, this);
        } else if (F == null && downloadTask2 != null && queryDownloadInfoResponseData != null) {
            downloadTask2.setVer(queryDownloadInfoResponseData.getVer());
            downloadTask2.setVer_name(queryDownloadInfoResponseData.getVer_name());
            downloadTask2.setUrl(queryDownloadInfoResponseData.getDownloadURL());
            downloadTask2.setResource_url_remote(queryDownloadInfoResponseData.getResourceURL());
            downloadTask2.setActual_size(queryDownloadInfoResponseData.getActualSize());
            downloadTask2.setRes_actual_size(queryDownloadInfoResponseData.getResourceSize());
            downloadTask2.setExt(str2);
            downloadTask.setFromRecomDown(z4);
            com.php25.PDownload.d.c(downloadTask2, this);
        } else {
            T(str, str2, true, queryDownloadInfoResponseData != null ? queryDownloadInfoResponseData.getResourceSize() : 0L, queryDownloadInfoResponseData, z6, downloadTask.get_from(), downloadTask.get_from_type(), true, downloadGameArgsBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.W})
    public void G(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra String str3, @Receiver.Extra String str4, @Receiver.Extra String str5) {
        EmuErrorDto emuErrorDto = new EmuErrorDto();
        emuErrorDto.setGame_id(str);
        emuErrorDto.setUid(str2);
        emuErrorDto.setPlugin_package_name(str3);
        emuErrorDto.setPlugin_version(str4);
        emuErrorDto.setError(str5);
        com.papa.sim.statistic.p.l(getApplicationContext()).h0(JsonMapper.getInstance().toJson(emuErrorDto));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72034x})
    public void G0(Intent intent) {
    }

    void G1(final String str) {
        this.f54170r.post(new Runnable() { // from class: com.join.mgps.service.a
            @Override // java.lang.Runnable
            public final void run() {
                CommonService.this.r0(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.O})
    public void H0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra String str3, @Receiver.Extra long j4) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        List<PlayGameTimeTable> o4 = d0.n().o(str3, str2);
        if (o4 != null && o4.size() > 0) {
            PlayGameTimeTable playGameTimeTable = o4.get(0);
            long gamePlayTotalTime = playGameTimeTable.getGamePlayTotalTime();
            playGameTimeTable.setGamePlayRecentlyTime(System.currentTimeMillis() / 1000);
            playGameTimeTable.setGamePlayTotalTime(gamePlayTotalTime + j4);
            d0.n().m(playGameTimeTable);
        }
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(getApplicationContext());
        l4.N1(str2, j4 + "", str3, UUID.randomUUID().toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    /* renamed from: H1 */
    public void r0(String str) {
        ToastManager.show(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.S})
    public void I(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra String str3, @Receiver.Extra String str4, @Receiver.Extra long j4) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).h(str2, str3, str4, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void I0(int i4) {
        try {
            if (j0.Y0(this)) {
                ForumRequestBean.ForumPostsPraiseRequestBean e02 = j0.e0(this, i4);
                e02.setDevice_id("");
                ForumResponse<ForumData.ForumPostsPraiseData> o4 = com.join.mgps.rpc.impl.g.A0().o(e02.getParams());
                if (o4 == null) {
                    return;
                }
                ForumData.ForumPostsPraiseData data = o4.getData();
                data.isResult();
                j0.m1(e02, data);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I1(CollectionBeanSub collectionBeanSub, boolean z4) {
        J1(collectionBeanSub, z4, false, "", false, false, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.V})
    public void J(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).W0(str2, i4, str3, p1.f.K().L(str2, getApplicationContext()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.X})
    public void J0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.OnClickPSPCutDown, new Ext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J1(CollectionBeanSub collectionBeanSub, boolean z4, boolean z5, String str, boolean z6, boolean z7, DownloadGameArgsBean downloadGameArgsBean) {
        int i4;
        if (collectionBeanSub == null) {
            return;
        }
        try {
            DownloadTask downloadtaskDown = collectionBeanSub.getDownloadtaskDown();
            if (downloadtaskDown != null) {
                downloadtaskDown.setDisableShowSpeedUpPrompt(z6);
                downloadtaskDown.setUncheckSelfSupport(z5);
                downloadtaskDown.setRes_actual_size(collectionBeanSub.getResourceSize());
                downloadtaskDown.setExt(str);
                downloadtaskDown.setFromRecomDown(z7);
                if (z4) {
                    if (UtilsMy.y0(collectionBeanSub.getPay_tag_info(), collectionBeanSub.getCrc_sign_id()) > 0) {
                        n0 accountData = AccountUtil_.getInstance_(this.f54166n).getAccountData();
                        if (accountData != null && accountData.n2() != 2) {
                            UtilsMy.d4(this.f54166n, downloadtaskDown.getCrc_link_type_val());
                            return;
                        }
                        IntentUtil.getInstance().goMyAccountLoginActivityNewTask(this.f54166n);
                    } else if (UtilsMy.x0(downloadtaskDown.getPay_game_amount(), downloadtaskDown.getCrc_link_type_val()) > 0) {
                        UtilsMy.d4(this.f54166n, downloadtaskDown.getCrc_link_type_val());
                    } else {
                        UtilsMy.y1(downloadtaskDown, collectionBeanSub);
                        UtilsMy.U0(this.f54166n, downloadtaskDown, collectionBeanSub.getTp_down_url(), collectionBeanSub.getOther_down_switch(), collectionBeanSub.getCdn_down_switch(), downloadGameArgsBean);
                    }
                } else if (UtilsMy.o1(this.f54166n, downloadtaskDown)) {
                } else {
                    if (collectionBeanSub.getDown_status() == 5) {
                        if (downloadtaskDown.getMax_an_compatible_ver() > 0 && (((i4 = Build.VERSION.SDK_INT) < downloadtaskDown.getMin_an_compatible_ver() || i4 > downloadtaskDown.getMax_an_compatible_ver()) && g2.h(downloadtaskDown.getMod_info()))) {
                            this.f54177y = downloadtaskDown;
                            Intent intent = new Intent(o1.a.f72017o0);
                            intent.putExtra("gameid", this.f54177y.getCrc_link_type_val());
                            sendBroadcast(intent);
                            return;
                        }
                        UtilsMy.l1(this.f54166n, downloadtaskDown);
                        return;
                    }
                    com.php25.PDownload.d.c(downloadtaskDown, this.f54166n);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.I0})
    public void K(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra long j4, @Receiver.Extra String str3) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).W0(str2, j4, str3, p1.f.K().L(str2, getApplicationContext()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.emu.exitVippopup"})
    public void K0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        Ext ext = new Ext();
        ext.setGameId(str2);
        if (g2.i(str3)) {
            ext.setUid(Integer.valueOf(str3).intValue());
        }
        ext.setPosition(i4 + "");
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.exitVippopup, ext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.H0})
    public void L(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra long j4, @Receiver.Extra String str3) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).W0(str2, j4, str3, p1.f.K().L(str2, getApplicationContext()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f71989a0})
    public void L0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.PSPLimitMember, new Ext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void L1(String str, int i4) {
        com.join.mgps.Util.s.j(this.f54166n, str, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.P})
    public void M(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra String str3) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName()) || g2.h(str2)) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).j(str2, str3, p1.f.K().L(str2, getApplicationContext()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.Z})
    public void M0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.PSPLimitPlay, new Ext());
    }

    void M1() {
        try {
            if (this.A == null) {
                this.A = com.papa.controller.core.d.r(this);
                C1();
            }
            com.papa.controller.core.d dVar = this.A;
            if (dVar != null) {
                dVar.x(true);
                this.A.B();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.T})
    public void N(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra String str3, @Receiver.Extra int i4) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).i(str2, str3, i4, p1.f.K().L(str2, getApplicationContext()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.Y})
    public void N0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.PSPLimitPopup, new Ext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void N1(String str, PayOrderInfo payOrderInfo, n0 n0Var, boolean z4, String str2) {
        PapayOrder papayOrder = new PapayOrder();
        papayOrder.PA_OPEN_UID = n0Var.getUid();
        papayOrder.APP_ORDER_ID = "";
        papayOrder.APP_NAME = payOrderInfo.getGame_name();
        papayOrder.PRODUCT_ID = str;
        papayOrder.APPKEY = payOrderInfo.getGame_app_key();
        try {
            papayOrder.MONEY_AMOUNT = (Float.parseFloat(payOrderInfo.getPay_game_amount()) / 100.0f) + "";
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
        papayOrder.PAYSHOWTYPE = payOrderInfo.getPay_show_type();
        papayOrder.PAYTYPE = payOrderInfo.getPay_type();
        papayOrder.PRODUCT_NAME = payOrderInfo.getGame_name();
        if (z4) {
            papayOrder.ORDERTYPE = 3;
        } else {
            papayOrder.ORDERTYPE = 2;
        }
        if (z4) {
            ExtBean extBean = new ExtBean();
            extBean.setFrom("1");
            extBean.setFrom_id(str2);
            extBean.setPosition(str);
            ((PayNowActivity_.k) PayNowActivity_.L0(this.f54166n).c(papayOrder).flags(268435456)).a(extBean).start();
            return;
        }
        ((PayNowActivity_.k) PayNowActivity_.L0(this.f54166n).c(papayOrder).flags(268435456)).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.Q})
    public void O(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra String str3) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).b2(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f71991b0})
    public void O0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.PSPLimitQuit, new Ext());
    }

    void O1() {
        com.papa.controller.core.d dVar = this.A;
        if (dVar != null) {
            dVar.F();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.R})
    public void P(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra String str3, @Receiver.Extra String str4, @Receiver.Extra long j4) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).J2(str2, str3, str4, j4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.emu.NotpromptVippopup"})
    public void P0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        Ext ext = new Ext();
        ext.setGameId(str2);
        ext.setUid(Integer.valueOf(str3).intValue());
        ext.setPosition(i4 + "");
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.NotpromptVippopup, ext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void P1(String str) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Q() {
        com.join.mgps.va.overmind.d.o().d0();
        R();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.emu.onclickFunction"})
    public void Q0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        Ext ext = new Ext();
        ext.setGameId(str2);
        ext.setUid(Integer.valueOf(str3).intValue());
        ext.setPosition(i4 + "");
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.onclickFunction, ext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Q1() {
        AccountBean user_info;
        if (!com.join.android.app.common.utils.j.j(this) || m0()) {
            return;
        }
        try {
            TouristLoginRequestBean touristLoginRequestBean = new TouristLoginRequestBean();
            touristLoginRequestBean.setVersion(com.join.android.app.common.utils.n.n(getApplicationContext()).z());
            touristLoginRequestBean.setDevice_id("");
            touristLoginRequestBean.setMac("");
            touristLoginRequestBean.setSource("2");
            touristLoginRequestBean.setTuid(this.f54155c.touriseTUID().d().longValue());
            touristLoginRequestBean.setSign(x1.g(touristLoginRequestBean));
            AccountResultMainBean<AccountTokenSuccess> s4 = com.join.mgps.rpc.impl.a.c0().s(touristLoginRequestBean.getParams());
            if (s4 == null || s4.getError() != 0 || !s4.getData().is_success() || (user_info = s4.getData().getUser_info()) == null) {
                return;
            }
            n0 accountData = this.f54156d.getAccountData();
            if (accountData == null || accountData.getUid() == 0) {
                AccountUtil_.getInstance_(getApplicationContext()).saveAccountData(b3.a.a(user_info), getApplicationContext());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void R() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                List<DownloadTask> Q = p1.f.K().Q(null);
                ArrayList arrayList = new ArrayList();
                for (DownloadTask downloadTask : Q) {
                    if (downloadTask.getCrc_link_type_val() != null) {
                        arrayList.add(downloadTask.getCrc_link_type_val());
                    }
                }
                if (arrayList.size() == 0) {
                    return;
                }
                this.H = arrayList.size() % this.G == 0 ? arrayList.size() / this.G : (arrayList.size() / this.G) + 1;
                if (this.D == null) {
                    this.D = Executors.newSingleThreadScheduledExecutor();
                }
                this.I = 0;
                this.D.scheduleAtFixedRate(new l(arrayList), 1L, 3L, TimeUnit.SECONDS);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.emu.onclickVippopup"})
    public void R0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        Ext ext = new Ext();
        ext.setGameId(str2);
        ext.setUid(Integer.valueOf(str3).intValue());
        ext.setPosition(i4 + "");
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.onclickVippopup, ext);
    }

    void R1(String str) {
        try {
            this.f54157e.putExtra("type", "4");
            this.f54157e.putExtra("msg", str);
            sendBroadcast(this.f54157e);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.emu.openGoldfinger"})
    public void S0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        try {
            Ext ext = new Ext();
            ext.setGameId(str2);
            ext.setUid(Integer.valueOf(str3).intValue());
            ext.setPosition(i4 + "");
            com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.openGoldfinger, ext);
        } catch (Exception unused) {
        }
    }

    void S1(String str, String str2, String str3) {
        R1("{\"content\":\"" + str + "\",\"color\":6,\"titlename\":\"\",\"vipType\":-1,\"name\":\"" + str2 + "\",\"userId\":\"" + str3 + "\"}");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void T(String str, String str2, boolean z4, long j4, QueryDownloadInfoResponseData queryDownloadInfoResponseData, boolean z5, int i4, int i5, boolean z6, DownloadGameArgsBean downloadGameArgsBean) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
                requestModel.setDefault(this.f54166n);
                QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                queryDownloadInfoRequestArgs.setGameIdList(arrayList);
                if (downloadGameArgsBean != null) {
                    queryDownloadInfoRequestArgs.setLocation(downloadGameArgsBean.getLocation());
                }
                requestModel.setArgs(queryDownloadInfoRequestArgs);
                com.join.mgps.rpc.impl.i.D0().B0().g1(requestModel).enqueue(new i(i4, i5, queryDownloadInfoResponseData, z4, str2, z5, z6, downloadGameArgsBean));
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                r0("获取游戏信息失败");
                return;
            }
        }
        r0("请检查网络连接");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.emu.openKeyskill"})
    public void T0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        Ext ext = new Ext();
        ext.setGameId(str2);
        ext.setUid(Integer.valueOf(str3).intValue());
        ext.setPosition(i4 + "");
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.openKeyskill, ext);
    }

    void T1() {
        try {
            this.f54174v.g();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = me.relex.photodraweeview.d.f71604s1)
    public void U(String str, String str2, boolean z4) {
        String uid = AccountUtil_.getInstance_(this.f54166n).getUid();
        String token = AccountUtil_.getInstance_(this.f54166n).getToken();
        RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
        requestModel.setDefault(this.f54166n);
        QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
        DownloadTask F = p1.f.K().F(str);
        if (F == null) {
            return;
        }
        if (APKUtils.G(F)) {
            queryDownloadInfoRequestArgs.setGameId(((ModInfoBean) JsonMapper.getInstance().fromJson(F.getMod_info(), ModInfoBean.class)).getMain_game_id());
        } else {
            queryDownloadInfoRequestArgs.setGameId(str);
        }
        queryDownloadInfoRequestArgs.setUid(uid);
        queryDownloadInfoRequestArgs.setToken(token);
        queryDownloadInfoRequestArgs.setIsRecommend(com.join.mgps.pref.h.n(this.f54166n).x() ? "rec" : "");
        requestModel.setArgs(queryDownloadInfoRequestArgs);
        if (z4) {
            return;
        }
        com.join.mgps.rpc.impl.i.D0().B0().P0(requestModel).enqueue(new m(str, z4, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.emu.selectLevel"})
    public void U0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        Ext ext = new Ext();
        ext.setGameId(str2);
        ext.setUid(Integer.valueOf(str3).intValue());
        ext.setPosition(i4 + "");
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.selectLevel, ext);
    }

    void U1() {
        p pVar = this.K;
        if (pVar != null) {
            unregisterReceiver(pVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void V() {
        Throwable th;
        int i4;
        int i5;
        int uid;
        ResultMainBean<List<APKVersionMainBean>> r12;
        ApkVersionbean apkVersionbean;
        Exception exc;
        EMUApkTable eMUApkTable;
        String ver;
        HomeViewSwich homeViewSwich;
        int i6;
        if (this.f54155c.plugHasUpdate().d().booleanValue() || W) {
            return;
        }
        int i7 = 1;
        W = true;
        ArrayList<ApkVersionbean> arrayList = (ArrayList) JsonMapper.getInstance().fromJson(getResources().getString(R.string.defalut_app_ver), JsonMapper.getInstance().createCollectionType(ArrayList.class, ApkVersionbean.class));
        v0.d("getEMUVersion", "start");
        HashMap hashMap = new HashMap();
        hashMap.put("tag_id", "31");
        List<EMUApkTable> h4 = b2.p.o().h(hashMap);
        List<EMUApkArenaTable> h5 = b2.o.o().h(hashMap);
        if (h4 != null && h4.size() != 0) {
            V1(arrayList, h4, "31");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ApkVersionbean next = it2.next();
                if (next.getTag_id().equals("31")) {
                    b2.p.o().k(new EMUApkTable(next));
                }
            }
        }
        if (h5 != null && h5.size() != 0) {
            W1(arrayList, h5, "31");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ApkVersionbean next2 = it3.next();
                if (next2.getTag_id().equals("31")) {
                    b2.o.o().k(new EMUApkArenaTable(next2));
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("tag_id", "35");
        List<EMUApkTable> h6 = b2.p.o().h(hashMap2);
        List<EMUApkArenaTable> h7 = b2.o.o().h(hashMap2);
        if (h6 != null && h6.size() != 0) {
            V1(arrayList, h6, "35");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                ApkVersionbean next3 = it4.next();
                if (next3.getTag_id().equals("35")) {
                    b2.p.o().k(new EMUApkTable(next3));
                }
            }
        }
        if (h7 != null && h7.size() != 0) {
            W1(arrayList, h7, "35");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it5 = arrayList.iterator();
            while (it5.hasNext()) {
                ApkVersionbean next4 = it5.next();
                if (next4.getTag_id().equals("35")) {
                    b2.o.o().k(new EMUApkArenaTable(next4));
                }
            }
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("tag_id", "43");
        List<EMUApkTable> h8 = b2.p.o().h(hashMap3);
        List<EMUApkArenaTable> h9 = b2.o.o().h(hashMap3);
        if (h8 != null && h8.size() != 0) {
            V1(arrayList, h8, "43");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ApkVersionbean next5 = it6.next();
                if (next5.getTag_id().equals("43")) {
                    b2.p.o().k(new EMUApkTable(next5));
                }
            }
        }
        if (h9 != null && h9.size() != 0) {
            W1(arrayList, h9, "43");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it7 = arrayList.iterator();
            while (it7.hasNext()) {
                ApkVersionbean next6 = it7.next();
                if (next6.getTag_id().equals("43")) {
                    b2.o.o().k(new EMUApkArenaTable(next6));
                }
            }
        }
        HashMap hashMap4 = new HashMap();
        hashMap4.put("tag_id", "33");
        List<EMUApkTable> h10 = b2.p.o().h(hashMap4);
        List<EMUApkArenaTable> h11 = b2.o.o().h(hashMap4);
        if (h10 != null && h10.size() != 0) {
            V1(arrayList, h10, "33");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it8 = arrayList.iterator();
            while (it8.hasNext()) {
                ApkVersionbean next7 = it8.next();
                if (next7.getTag_id().equals("33")) {
                    b2.p.o().k(new EMUApkTable(next7));
                }
            }
        }
        if (h11 != null && h11.size() != 0) {
            W1(arrayList, h11, "33");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it9 = arrayList.iterator();
            while (it9.hasNext()) {
                ApkVersionbean next8 = it9.next();
                if (next8.getTag_id().equals("33")) {
                    b2.o.o().k(new EMUApkArenaTable(next8));
                }
            }
        }
        HashMap hashMap5 = new HashMap();
        hashMap5.put("tag_id", "34");
        List<EMUApkTable> h12 = b2.p.o().h(hashMap5);
        List<EMUApkArenaTable> h13 = b2.o.o().h(hashMap5);
        if (h12 != null && h12.size() != 0) {
            V1(arrayList, h12, "34");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it10 = arrayList.iterator();
            while (it10.hasNext()) {
                ApkVersionbean next9 = it10.next();
                if (next9.getTag_id().equals("34")) {
                    b2.p.o().k(new EMUApkTable(next9));
                }
            }
        }
        if (h13 != null && h13.size() != 0) {
            W1(arrayList, h13, "34");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it11 = arrayList.iterator();
            while (it11.hasNext()) {
                ApkVersionbean next10 = it11.next();
                if (next10.getTag_id().equals("34")) {
                    b2.o.o().k(new EMUApkArenaTable(next10));
                }
            }
        }
        HashMap hashMap6 = new HashMap();
        hashMap6.put("tag_id", "51");
        List<EMUApkTable> h14 = b2.p.o().h(hashMap6);
        List<EMUApkArenaTable> h15 = b2.o.o().h(hashMap6);
        if (h14 != null && h14.size() != 0) {
            V1(arrayList, h14, "51");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it12 = arrayList.iterator();
            while (it12.hasNext()) {
                ApkVersionbean next11 = it12.next();
                if (next11.getTag_id().equals("51")) {
                    b2.p.o().k(new EMUApkTable(next11));
                }
            }
        }
        if (h15 != null && h15.size() != 0) {
            W1(arrayList, h15, "51");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it13 = arrayList.iterator();
            while (it13.hasNext()) {
                ApkVersionbean next12 = it13.next();
                if (next12.getTag_id().equals("51")) {
                    b2.o.o().k(new EMUApkArenaTable(next12));
                }
            }
        }
        HashMap hashMap7 = new HashMap();
        hashMap7.put("tag_id", "53");
        List<EMUApkTable> h16 = b2.p.o().h(hashMap7);
        List<EMUApkArenaTable> h17 = b2.o.o().h(hashMap7);
        if (h16 != null && h16.size() != 0) {
            V1(arrayList, h16, "53");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it14 = arrayList.iterator();
            while (it14.hasNext()) {
                ApkVersionbean next13 = it14.next();
                if (next13.getTag_id().equals("53")) {
                    b2.p.o().k(new EMUApkTable(next13));
                }
            }
        }
        if (h17 != null && h17.size() != 0) {
            W1(arrayList, h17, "53");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it15 = arrayList.iterator();
            while (it15.hasNext()) {
                ApkVersionbean next14 = it15.next();
                if (next14.getTag_id().equals("53")) {
                    b2.o.o().k(new EMUApkArenaTable(next14));
                }
            }
        }
        HashMap hashMap8 = new HashMap();
        hashMap8.put("tag_id", "54");
        List<EMUApkTable> h18 = b2.p.o().h(hashMap8);
        List<EMUApkArenaTable> h19 = b2.o.o().h(hashMap8);
        if (h18 != null && h18.size() != 0) {
            V1(arrayList, h18, "54");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it16 = arrayList.iterator();
            while (it16.hasNext()) {
                ApkVersionbean next15 = it16.next();
                if (next15.getTag_id().equals("54")) {
                    b2.p.o().k(new EMUApkTable(next15));
                }
            }
        }
        if (h19 != null && h19.size() != 0) {
            W1(arrayList, h19, "54");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it17 = arrayList.iterator();
            while (it17.hasNext()) {
                ApkVersionbean next16 = it17.next();
                if (next16.getTag_id().equals("54")) {
                    b2.o.o().k(new EMUApkArenaTable(next16));
                }
            }
        }
        HashMap hashMap9 = new HashMap();
        hashMap9.put("tag_id", "32");
        List<EMUApkTable> h20 = b2.p.o().h(hashMap9);
        List<EMUApkArenaTable> h21 = b2.o.o().h(hashMap9);
        if ((h20 == null || h20.size() == 0) && arrayList != null) {
            Iterator<ApkVersionbean> it18 = arrayList.iterator();
            while (it18.hasNext()) {
                ApkVersionbean next17 = it18.next();
                if (next17.getTag_id().equals("32")) {
                    b2.p.o().k(new EMUApkTable(next17));
                }
            }
        }
        if ((h21 == null || h21.size() == 0) && arrayList != null) {
            Iterator<ApkVersionbean> it19 = arrayList.iterator();
            while (it19.hasNext()) {
                ApkVersionbean next18 = it19.next();
                if (next18.getTag_id().equals("32")) {
                    b2.o.o().k(new EMUApkArenaTable(next18));
                }
            }
        }
        HashMap hashMap10 = new HashMap();
        hashMap10.put("tag_id", "56");
        List<EMUApkTable> h22 = b2.p.o().h(hashMap10);
        List<EMUApkArenaTable> h23 = b2.o.o().h(hashMap10);
        if (h22 != null && h22.size() != 0) {
            V1(arrayList, h22, "56");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it20 = arrayList.iterator();
            while (it20.hasNext()) {
                ApkVersionbean next19 = it20.next();
                if (next19.getTag_id().equals("56")) {
                    b2.p.o().k(new EMUApkTable(next19));
                }
            }
        }
        if (h23 != null && h23.size() != 0) {
            W1(arrayList, h23, "56");
        } else if (arrayList != null) {
            Iterator<ApkVersionbean> it21 = arrayList.iterator();
            while (it21.hasNext()) {
                ApkVersionbean next20 = it21.next();
                if (next20.getTag_id().equals("56")) {
                    b2.o.o().k(new EMUApkArenaTable(next20));
                }
            }
        }
        HashMap hashMap11 = new HashMap();
        hashMap11.put("tag_id", "57");
        List<EMUApkTable> h24 = b2.p.o().h(hashMap11);
        List<EMUApkArenaTable> h25 = b2.o.o().h(hashMap11);
        if ((h24 == null || h24.size() == 0) && arrayList != null) {
            Iterator<ApkVersionbean> it22 = arrayList.iterator();
            while (it22.hasNext()) {
                ApkVersionbean next21 = it22.next();
                if (next21.getTag_id().equals("57")) {
                    b2.p.o().k(new EMUApkTable(next21));
                }
            }
        }
        if ((h25 == null || h25.size() == 0) && arrayList != null) {
            Iterator<ApkVersionbean> it23 = arrayList.iterator();
            while (it23.hasNext()) {
                ApkVersionbean next22 = it23.next();
                if (next22.getTag_id().equals("57")) {
                    b2.o.o().k(new EMUApkArenaTable(next22));
                }
            }
        }
        HashMap hashMap12 = new HashMap();
        hashMap12.put("tag_id", "58");
        List<EMUApkTable> h26 = b2.p.o().h(hashMap12);
        List<EMUApkTable> h27 = b2.p.o().h(hashMap12);
        if ((h26 == null || h26.size() == 0) && arrayList != null) {
            Iterator<ApkVersionbean> it24 = arrayList.iterator();
            while (it24.hasNext()) {
                ApkVersionbean next23 = it24.next();
                if (next23.getTag_id().equals("58")) {
                    b2.p.o().k(new EMUApkTable(next23));
                }
            }
        }
        if ((h27 == null || h27.size() == 0) && arrayList != null) {
            Iterator<ApkVersionbean> it25 = arrayList.iterator();
            while (it25.hasNext()) {
                ApkVersionbean next24 = it25.next();
                if (next24.getTag_id().equals("58")) {
                    b2.o.o().k(new EMUApkArenaTable(next24));
                }
            }
        }
        HashMap hashMap13 = new HashMap();
        hashMap13.put("tag_id", "60");
        List<EMUApkTable> h28 = b2.p.o().h(hashMap13);
        List<EMUApkTable> h29 = b2.p.o().h(hashMap13);
        if ((h28 == null || h28.size() == 0) && arrayList != null) {
            Iterator<ApkVersionbean> it26 = arrayList.iterator();
            while (it26.hasNext()) {
                ApkVersionbean next25 = it26.next();
                if (next25.getTag_id().equals("60")) {
                    b2.p.o().k(new EMUApkTable(next25));
                }
            }
        }
        if ((h29 == null || h29.size() == 0) && arrayList != null) {
            Iterator<ApkVersionbean> it27 = arrayList.iterator();
            while (it27.hasNext()) {
                ApkVersionbean next26 = it27.next();
                if (next26.getTag_id().equals("60")) {
                    b2.o.o().k(new EMUApkArenaTable(next26));
                }
            }
        }
        HashMap hashMap14 = new HashMap();
        hashMap14.put("tag_id", "166");
        List<EMUApkTable> h30 = b2.p.o().h(hashMap14);
        List<EMUApkTable> h31 = b2.p.o().h(hashMap14);
        if ((h30 == null || h30.size() == 0) && arrayList != null) {
            Iterator<ApkVersionbean> it28 = arrayList.iterator();
            while (it28.hasNext()) {
                ApkVersionbean next27 = it28.next();
                if (next27.getTag_id().equals("166")) {
                    b2.p.o().k(new EMUApkTable(next27));
                }
            }
        }
        if ((h31 == null || h31.size() == 0) && arrayList != null) {
            Iterator<ApkVersionbean> it29 = arrayList.iterator();
            while (it29.hasNext()) {
                ApkVersionbean next28 = it29.next();
                if (next28.getTag_id().equals("166")) {
                    b2.o.o().k(new EMUApkArenaTable(next28));
                }
            }
        }
        if (com.join.android.app.common.utils.j.j(this)) {
            ResultMainBean<List<APKVersionMainBean>> resultMainBean = null;
            try {
                n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                if (accountData != null) {
                    try {
                        uid = accountData.getUid();
                    } catch (Exception unused) {
                        W = false;
                        if (resultMainBean == null) {
                            this.C = i5 - 1;
                            try {
                                Thread.sleep(5000L);
                                V();
                            } catch (InterruptedException unused2) {
                            }
                        }
                        S();
                        e0();
                    } catch (Throwable th2) {
                        th = th2;
                        W = false;
                        if (resultMainBean == null) {
                            this.C = i4 - 1;
                            try {
                                Thread.sleep(5000L);
                                V();
                            } catch (InterruptedException unused3) {
                            }
                        }
                        throw th;
                    }
                } else {
                    uid = 0;
                }
                r12 = com.join.mgps.rpc.impl.d.P1().r1(RequestBeanUtil.getInstance(this).getApkVersion(2, 2, 0, uid));
                if (r12 != null) {
                    try {
                        try {
                            if (r12.getFlag() == 1) {
                                v0.d("getEMUVersion", "sucess");
                                this.f54155c.plugHasUpdate().g(Boolean.TRUE);
                                if (r12.getMessages().getData().size() == 0) {
                                    W = false;
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
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("获得配置：");
                                        sb.append(MApplication.f1492p0.getCounts());
                                        List<HomeViewSwich> cfg = aPKVersionMainBean.getCfg();
                                        if (cfg != null && cfg.size() > 0 && (homeViewSwich = cfg.get(0)) != null) {
                                            try {
                                                String p4 = p(com.join.mgps.Util.a.a(homeViewSwich.getDown_load_speed_limit().getCfg_values(), null));
                                                if (!p4.equals("-1")) {
                                                    homeViewSwich.getDown_load_speed_limit().setCfg_values_express(p4);
                                                } else {
                                                    homeViewSwich.getDown_load_speed_limit().setCfg_values_express("300");
                                                }
                                                String p5 = p(com.join.mgps.Util.a.a(homeViewSwich.getDown_load_size().getCfg_values(), null));
                                                if (!p5.equals("0")) {
                                                    homeViewSwich.getDown_load_size().setCfg_values_express(p5);
                                                } else {
                                                    homeViewSwich.getDown_load_size().setCfg_values_express("500");
                                                }
                                                String p6 = p(com.join.mgps.Util.a.a(homeViewSwich.getDown_load_cfg_net_game_speed_limit().getCfg_switch(), null));
                                                if (!p6.equals("-1")) {
                                                    homeViewSwich.getDown_load_cfg_net_game_speed_limit().setCfg_switch_express(p6);
                                                } else {
                                                    homeViewSwich.getDown_load_cfg_net_game_speed_limit().setCfg_switch_express("0");
                                                }
                                                String p7 = p(com.join.mgps.Util.a.a(homeViewSwich.getDown_load_cfg_simulator_speed_limit().getCfg_switch(), null));
                                                if (!p7.equals("-1")) {
                                                    homeViewSwich.getDown_load_cfg_simulator_speed_limit().setCfg_switch_express(p7);
                                                } else {
                                                    homeViewSwich.getDown_load_cfg_simulator_speed_limit().setCfg_switch_express("0");
                                                }
                                                String p8 = p(com.join.mgps.Util.a.a(homeViewSwich.getDown_load_cfg_stand_alone_speed_limit().getCfg_switch(), null));
                                                if (!p8.equals("-1")) {
                                                    homeViewSwich.getDown_load_cfg_stand_alone_speed_limit().setCfg_switch_express(p8);
                                                } else {
                                                    homeViewSwich.getDown_load_cfg_stand_alone_speed_limit().setCfg_switch_express("0");
                                                }
                                                homeViewSwich.getDown_load_unrestricted_speed().setCfg_values_express(p(com.join.mgps.Util.a.a(homeViewSwich.getDown_load_unrestricted_speed().getCfg_values(), null)));
                                                com.join.mgps.pref.h.n(this.f54166n).N(homeViewSwich);
                                                MApplication.R = homeViewSwich;
                                            } catch (Exception e5) {
                                                e5.printStackTrace();
                                            }
                                            BattaleSwitchBean seep_up_read_only_number_of_win = homeViewSwich.getSeep_up_read_only_number_of_win();
                                            if (seep_up_read_only_number_of_win != null && seep_up_read_only_number_of_win.getCfg_switch() == 1) {
                                                this.f54155c.downloadSpeedUpCount().g(Integer.valueOf(seep_up_read_only_number_of_win.getCfg_values()));
                                            } else {
                                                this.f54155c.downloadSpeedUpCount().g(0);
                                            }
                                            BattaleSwitchBean seep_up_read_only_game_size = homeViewSwich.getSeep_up_read_only_game_size();
                                            if (seep_up_read_only_game_size != null && seep_up_read_only_game_size.getCfg_switch() == 1) {
                                                this.f54155c.downloadSpeedUpGameSize().g(Integer.valueOf(seep_up_read_only_game_size.getCfg_values()));
                                            } else {
                                                this.f54155c.downloadSpeedUpGameSize().g(0);
                                            }
                                            if (!y.u(this.f54155c.downloadSpeedUpLastTime().d().longValue())) {
                                                this.f54155c.downloadSpeedUpCountCurrent().g(0);
                                                this.f54155c.downloadSpeedUpCountCurrentAD().g(0);
                                                this.f54155c.downloadSpeedUpGames().g("");
                                            }
                                            BattaleSwitchBean an_battle_switch = homeViewSwich.getAn_battle_switch();
                                            if (an_battle_switch != null && an_battle_switch.getCfg_switch() == 1) {
                                                this.f54155c.showAnBattle().g(Boolean.TRUE);
                                            } else {
                                                this.f54155c.showAnBattle().g(Boolean.FALSE);
                                            }
                                            BattaleSwitchBean psp_ad_show_time = homeViewSwich.getPsp_ad_show_time();
                                            if (psp_ad_show_time != null) {
                                                this.f54155c.pspAdShowTimeSwitch().g(Integer.valueOf(psp_ad_show_time.getCfg_switch()));
                                                this.f54155c.pspAdShowTime().g(Integer.valueOf(psp_ad_show_time.getCfg_values()));
                                            }
                                            BattaleSwitchBean ranking_menu = homeViewSwich.getRanking_menu();
                                            if (ranking_menu != null) {
                                                this.f54155c.rankingMenu().g(ranking_menu.getCfg_values());
                                            }
                                            BattaleSwitchBean seep_up_read_only_arc_ad_id = homeViewSwich.getSeep_up_read_only_arc_ad_id();
                                            if (seep_up_read_only_arc_ad_id != null && seep_up_read_only_arc_ad_id.getCfg_switch() == 1 && !TextUtils.isEmpty(seep_up_read_only_arc_ad_id.getCfg_values())) {
                                                this.f54155c.adIdArc().g(seep_up_read_only_arc_ad_id.getCfg_values());
                                            }
                                            BattaleSwitchBean seep_up_read_only_psp_ad_id = homeViewSwich.getSeep_up_read_only_psp_ad_id();
                                            if (seep_up_read_only_psp_ad_id != null && seep_up_read_only_psp_ad_id.getCfg_switch() == 1 && !TextUtils.isEmpty(seep_up_read_only_psp_ad_id.getCfg_values())) {
                                                this.f54155c.adIdPsp().g(seep_up_read_only_psp_ad_id.getCfg_values());
                                            }
                                            BattaleSwitchBean seep_up_read_only_down_ad_id = homeViewSwich.getSeep_up_read_only_down_ad_id();
                                            if (seep_up_read_only_down_ad_id != null && seep_up_read_only_down_ad_id.getCfg_switch() == 1 && !TextUtils.isEmpty(seep_up_read_only_down_ad_id.getCfg_values())) {
                                                this.f54155c.adIdDownloadSpeedUp().g(seep_up_read_only_down_ad_id.getCfg_values());
                                            }
                                            BattaleSwitchBean seep_up_read_only_common_s_ad_id = homeViewSwich.getSeep_up_read_only_common_s_ad_id();
                                            if (seep_up_read_only_common_s_ad_id != null && seep_up_read_only_common_s_ad_id.getCfg_switch() == 1 && !TextUtils.isEmpty(seep_up_read_only_common_s_ad_id.getCfg_values())) {
                                                this.f54155c.adIdCommonV().g(seep_up_read_only_common_s_ad_id.getCfg_values());
                                            }
                                            BattaleSwitchBean seep_up_read_only_common_h_ad_id = homeViewSwich.getSeep_up_read_only_common_h_ad_id();
                                            if (seep_up_read_only_common_h_ad_id != null && seep_up_read_only_common_h_ad_id.getCfg_switch() == 1 && !TextUtils.isEmpty(seep_up_read_only_common_h_ad_id.getCfg_values())) {
                                                this.f54155c.adIdCommonH().g(seep_up_read_only_common_h_ad_id.getCfg_values());
                                            }
                                            BattaleSwitchBean nick_name_modify_title = homeViewSwich.getNick_name_modify_title();
                                            if (nick_name_modify_title != null) {
                                                this.f54155c.changeNickNameNotice().g(nick_name_modify_title.getCfg_values());
                                            }
                                            BattaleSwitchBean game_download_boot = homeViewSwich.getGame_download_boot();
                                            if (game_download_boot != null) {
                                                String cfg_values = game_download_boot.getCfg_values();
                                                if (g2.i(cfg_values)) {
                                                    try {
                                                        int intValue = this.f54155c.insatllAppFirst().d().intValue();
                                                        int parseInt = Integer.parseInt(cfg_values);
                                                        if (intValue == -8) {
                                                            this.f54155c.insatllAppFirst().g(Integer.valueOf(parseInt));
                                                        }
                                                    } catch (Exception e6) {
                                                        e6.printStackTrace();
                                                    }
                                                }
                                            }
                                            BattaleSwitchBean game_performance_boot = homeViewSwich.getGame_performance_boot();
                                            if (game_performance_boot != null) {
                                                String cfg_values2 = game_performance_boot.getCfg_values();
                                                if (g2.i(cfg_values2)) {
                                                    try {
                                                        int parseInt2 = Integer.parseInt(cfg_values2);
                                                        if (this.f54155c.runRomFirst().d().intValue() == -8) {
                                                            this.f54155c.runRomFirst().g(Integer.valueOf(parseInt2));
                                                        }
                                                    } catch (Exception e7) {
                                                        e7.printStackTrace();
                                                    }
                                                }
                                            }
                                            BattaleSwitchBean app_down_wifi_status = homeViewSwich.getApp_down_wifi_status();
                                            if (app_down_wifi_status != null) {
                                                String cfg_values3 = app_down_wifi_status.getCfg_values();
                                                if (g2.i(cfg_values3)) {
                                                    try {
                                                        int parseInt3 = Integer.parseInt(cfg_values3);
                                                        if (this.f54155c.wifiDownNumber().d().intValue() == -1) {
                                                            this.f54155c.wifiDownNumber().g(Integer.valueOf(parseInt3));
                                                        }
                                                    } catch (Exception e8) {
                                                        e8.printStackTrace();
                                                    }
                                                }
                                            }
                                            BattaleSwitchBean ext_game_upload_type = homeViewSwich.getExt_game_upload_type();
                                            if (ext_game_upload_type != null && g2.i(ext_game_upload_type.getCfg_values())) {
                                                try {
                                                    this.f54155c.uploadType2().g(ext_game_upload_type.getCfg_values());
                                                } catch (Exception e9) {
                                                    e9.printStackTrace();
                                                }
                                            }
                                            BattaleSwitchBean wf_home_page_position = homeViewSwich.getWf_home_page_position();
                                            if (wf_home_page_position != null && wf_home_page_position.getCfg_switch() == 1) {
                                                this.f54155c.showIndex().g(wf_home_page_position.getCfg_values());
                                            } else {
                                                this.f54155c.showIndex().g("2");
                                            }
                                            BattaleSwitchBean md5_file_tag = homeViewSwich.getMd5_file_tag();
                                            if (md5_file_tag != null && md5_file_tag.getCfg_switch() == 1) {
                                                this.f54155c.md5FileTag().g(md5_file_tag.getCfg_values());
                                                v.f28119s = md5_file_tag.getCfg_values();
                                            } else {
                                                this.f54155c.md5FileTag().g("");
                                            }
                                            try {
                                                this.f54155c.emulatorStartAdCount().g(Integer.valueOf(Integer.parseInt(homeViewSwich.getEmulator_start_ad_count().getCfg_values())));
                                            } catch (Exception e10) {
                                                e10.printStackTrace();
                                            }
                                            this.f54155c.emulatorGoldenFingerUrl().g(homeViewSwich.getEmulator_golden_finger_url().getCfg_values());
                                            this.f54155c.emulatorOneSkillUrl().g(homeViewSwich.getEmulator_one_skill_url().getCfg_values());
                                            this.f54155c.emulatorCheckpointUrl().g(homeViewSwich.getEmulator_checkpoint_url().getCfg_values());
                                        }
                                        this.f54155c.gameTimeLvCfg().g(JsonMapper.toJsonString(aPKVersionMainBean.getPlay_game_time_lv_cfg()));
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
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
                                            Intent intent = new Intent(o1.a.K);
                                            if (Float.parseFloat(A[0]) < parseInt5) {
                                                versionDto.setQiangzhi(true);
                                                intent.putExtra("appUpdateBean", versionDto);
                                            } else {
                                                versionDto.setQiangzhi(false);
                                                intent.putExtra("appUpdateBean", versionDto);
                                            }
                                            sendBroadcast(intent);
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
                                        HashMap hashMap15 = new HashMap();
                                        hashMap15.put("tag_id", apkVersionbean2.getTag_id());
                                        List<EMUApkTable> h32 = b2.p.o().h(hashMap15);
                                        if (h32 != null && h32.size() > 0) {
                                            if (h32.size() > i7) {
                                                for (int i8 = 0; i8 < h32.size(); i8++) {
                                                    b2.p.o().delete((b2.p) h32.get(i8));
                                                }
                                            }
                                            try {
                                                eMUApkTable = h32.get(0);
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
                                                        if (TextUtils.isEmpty(eMUApkTable.getApkPath())) {
                                                            com.join.android.app.common.utils.l.I(this.f54166n, F, eMUApkTable);
                                                        }
                                                        if (C0 && F.getStatus() == 5) {
                                                            F.setUrl(apkVersionbean2.getDown_url());
                                                            if (g2.h(F.getMod_info())) {
                                                                F.setStatus(9);
                                                            }
                                                            F.setDescribe(apkVersionbean2.getVer_info());
                                                            F.setPortraitURL(apkVersionbean2.getLogo());
                                                            F.setShowName(apkVersionbean2.getApk_name());
                                                        } else if (F.getStatus() == 0) {
                                                            F.setStatus(5);
                                                        }
                                                        p1.f.K().m(F);
                                                        if (F.getStatus() == 9 || (C0 && F.getStatus() == 5)) {
                                                            com.join.android.app.common.utils.l.G(this.f54166n, eMUApkTable);
                                                        }
                                                    } else if (C0) {
                                                        if (eMUApkTable.getDown_type() == 2) {
                                                            if (com.join.android.app.common.utils.l.t(this.f54166n, eMUApkTable, false, new String[0])) {
                                                                UtilsMy.M2(eMUApkTable, this.f54166n);
                                                                com.join.android.app.common.utils.l.G(this.f54166n, eMUApkTable);
                                                            }
                                                        } else {
                                                            UtilsMy.M2(eMUApkTable, this.f54166n);
                                                        }
                                                    } else if (com.join.android.app.common.utils.l.t(this.f54166n, eMUApkTable, false, new String[0])) {
                                                        UtilsMy.L2(eMUApkTable, this.f54166n);
                                                    }
                                                } catch (Exception e12) {
                                                    exc = e12;
                                                    exc.printStackTrace();
                                                    b2.p.o().update(eMUApkTable);
                                                    com.join.android.app.common.utils.l.F(eMUApkTable);
                                                    i7 = 1;
                                                }
                                            } catch (Exception e13) {
                                                exc = e13;
                                                eMUApkTable = null;
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
                                                if (TextUtils.isEmpty(eMUApkTable2.getApkPath())) {
                                                    com.join.android.app.common.utils.l.I(this.f54166n, F, eMUApkTable2);
                                                }
                                                if (C02 && F.getStatus() == 5) {
                                                    F.setUrl(apkVersionbean2.getDown_url());
                                                    F.setShowName(apkVersionbean2.getApk_name());
                                                    if (g2.h(F.getMod_info())) {
                                                        F.setStatus(9);
                                                    }
                                                } else if (F.getStatus() == 0) {
                                                    F.setStatus(5);
                                                }
                                                p1.f.K().m(F);
                                                if (F.getStatus() == 9 || (C02 && F.getStatus() == 5)) {
                                                    com.join.android.app.common.utils.l.G(this.f54166n, eMUApkTable2);
                                                }
                                            } else if (C02) {
                                                if (eMUApkTable2.getDown_type() == 2) {
                                                    if (com.join.android.app.common.utils.l.t(this.f54166n, eMUApkTable2, false, new String[0])) {
                                                        UtilsMy.M2(eMUApkTable2, this.f54166n);
                                                    }
                                                } else {
                                                    UtilsMy.M2(eMUApkTable2, this.f54166n);
                                                }
                                            } else if (com.join.android.app.common.utils.l.t(this.f54166n, eMUApkTable2, false, new String[0])) {
                                                UtilsMy.L2(eMUApkTable2, this.f54166n);
                                            }
                                        }
                                        i7 = 1;
                                    }
                                }
                                com.papa.sim.statistic.p.l(getApplicationContext()).E2(true, JsonMapper.getInstance().toJson(b2.p.o().d()));
                            }
                        } catch (Exception unused4) {
                            resultMainBean = r12;
                            W = false;
                            if (resultMainBean == null && (i5 = this.C) > 0) {
                                this.C = i5 - 1;
                                Thread.sleep(5000L);
                                V();
                            }
                            S();
                            e0();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        resultMainBean = r12;
                        W = false;
                        if (resultMainBean == null && (i4 = this.C) > 0) {
                            this.C = i4 - 1;
                            Thread.sleep(5000L);
                            V();
                        }
                        throw th;
                    }
                }
                W = false;
            } catch (Exception unused5) {
                resultMainBean = null;
            } catch (Throwable th4) {
                th = th4;
                resultMainBean = null;
            }
            if (r12 == null && (i6 = this.C) > 0) {
                this.C = i6 - 1;
                Thread.sleep(5000L);
                V();
            }
        } else {
            W = false;
            v0.d("getEMUVersion", "nonet");
        }
        S();
        e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.emu.shareScreenshot"})
    public void V0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        Ext ext = new Ext();
        ext.setGameId(str2);
        ext.setUid(Integer.valueOf(str3).intValue());
        ext.setPosition(i4 + "");
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.shareScreenshot, ext);
    }

    void V1(ArrayList<ApkVersionbean> arrayList, List<EMUApkTable> list, String str) {
        try {
            if (com.join.android.app.common.utils.n.n(this).y() >= 131 && list != null && list.size() != 0 && !TextUtils.isEmpty(str)) {
                if (list.get(0).getDown_type() != 2 && arrayList != null) {
                    Iterator<ApkVersionbean> it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ApkVersionbean next = it2.next();
                        if (next.getTag_id().equals(str)) {
                            b2.p.o().k(new EMUApkTable(next));
                            break;
                        }
                    }
                }
                DownloadTask Z = p1.f.K().Z(Integer.parseInt(str));
                if (Z == null || Z.getDown_type() == 2) {
                    return;
                }
                p1.f.K().delete((p1.f) Z);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void W() {
        if (com.join.android.app.common.utils.j.j(this.f54166n)) {
            RequestEndGameListArgs requestEndGameListArgs = new RequestEndGameListArgs();
            requestEndGameListArgs.setUid(AccountUtil_.getInstance_(this.f54166n).getUid());
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameListArgs);
            requestModel.setDefault(this.f54166n);
            ResponseModel<GameMainV4DataBean.EndGameConfigBean> x4 = com.join.mgps.rpc.impl.i.D0().x(requestModel.makeSign());
            if (x4 == null || x4.getCode() != 200 || x4.getData() == null) {
                return;
            }
            this.f54155c.endGameConfig().g(JsonMapper.toJsonString(x4.getData()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.emu.showvippopup"})
    public void W0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        Ext ext = new Ext();
        ext.setGameId(str2);
        ext.setUid(Integer.valueOf(str3).intValue());
        ext.setPosition(i4 + "");
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.showVippopup, ext);
    }

    void W1(ArrayList<ApkVersionbean> arrayList, List<EMUApkArenaTable> list, String str) {
        try {
            if (com.join.android.app.common.utils.n.n(this).y() >= 131 && list != null && list.size() != 0 && !TextUtils.isEmpty(str)) {
                if (list.get(0).getDown_type() != 2 && arrayList != null) {
                    Iterator<ApkVersionbean> it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        ApkVersionbean next = it2.next();
                        if (next.getTag_id().equals(str)) {
                            b2.o.o().k(new EMUApkArenaTable(next));
                            break;
                        }
                    }
                }
                DownloadTask Z = p1.f.K().Z(Integer.parseInt(str));
                if (Z == null || Z.getDown_type() == 2) {
                    return;
                }
                p1.f.K().delete((p1.f) Z);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    FileInfo X(String str) {
        try {
            PackageManager packageManager = this.f54166n.getPackageManager();
            PackageInfo packageArchiveInfo = packageManager.getPackageArchiveInfo(str, 1);
            if (packageArchiveInfo != null) {
                FileInfo fileInfo = new FileInfo();
                fileInfo.pkg = packageArchiveInfo.packageName;
                fileInfo.versionName = packageArchiveInfo.versionName;
                fileInfo.versionCode = packageArchiveInfo.versionCode;
                fileInfo.path = str;
                fileInfo.time = packageArchiveInfo.lastUpdateTime;
                try {
                    ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                    applicationInfo.sourceDir = str;
                    applicationInfo.publicSourceDir = str;
                    fileInfo.title = ((Object) applicationInfo.loadLabel(packageManager)) + "";
                } catch (Exception unused) {
                    fileInfo.title = packageArchiveInfo.applicationInfo.nonLocalizedLabel.toString();
                }
                fileInfo.size = new File(str).length();
                w0.e(fileInfo + "");
                return fileInfo;
            }
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.emu.uesVippopup"})
    public void X0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra int i4, @Receiver.Extra String str3) {
        Ext ext = new Ext();
        ext.setGameId(str2);
        ext.setUid(Integer.valueOf(str3).intValue());
        ext.setPosition(i4 + "");
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.uesVippopup, ext);
    }

    public void X1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    @Receiver(actions = {o1.a.f72028u, "com.join.android.app.mgsim.wufun.broadcast.action_login_success"})
    public void Y1() {
        X1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 500)
    public void Z() {
        if (com.join.android.app.common.utils.j.j(this.f54166n)) {
            try {
                String uid = AccountUtil_.getInstance_(this).getUid();
                String token = AccountUtil_.getInstance_(this).getToken();
                HashMap hashMap = new HashMap();
                hashMap.put("uid", uid);
                hashMap.put("token", token);
                ResultMainBean<List<AppBean>> a5 = com.join.mgps.rpc.impl.f.b().a(hashMap);
                if (a5 == null || a5.getFlag() != 1 || a5.getMessages() == null || a5.getMessages().getData() == null) {
                    return;
                }
                q1(a5.getMessages().getData());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Z1(String str, String str2) {
        if (com.join.android.app.common.utils.j.j(this)) {
            RequestModel requestModel = new RequestModel();
            requestModel.setDefault(this);
            ArchiveArgs archiveArgs = new ArchiveArgs();
            n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            archiveArgs.setGameId(str);
            archiveArgs.setUid(accountData.getUid());
            requestModel.setArgs(archiveArgs);
            String a5 = com.papa.sim.statistic.k.a(this);
            com.join.android.app.common.http.h b5 = com.join.android.app.common.http.h.b();
            String g4 = b5.g(str2, accountData.getUid() + "", accountData.getToken(), requestModel, a5, new File(str2).getName(), 1, 0, new a());
            try {
                if (g2.i(g4)) {
                    JsonObject asJsonObject = JsonParser.parseString(g4).getAsJsonObject();
                    if (asJsonObject != null && asJsonObject.has("code") && asJsonObject.get("code").getAsInt() == 200 && asJsonObject.has("data")) {
                        JsonArray asJsonArray = asJsonObject.get("data").getAsJsonArray();
                        if (asJsonArray.size() > 0) {
                            JsonObject asJsonObject2 = asJsonArray.get(0).getAsJsonObject();
                            if (asJsonObject2.has("remoteUrl")) {
                                x1(asJsonObject2.get("remoteUrl").getAsString());
                                this.L = false;
                            }
                        }
                    }
                } else {
                    x1(null);
                    this.L = false;
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                x1(null);
                this.L = false;
                return;
            }
        }
        x1(null);
        this.L = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void a0(String str) {
        List<MiniGameSdkDtoAdCfgValue> ad_list;
        if (com.join.android.app.common.utils.j.j(this)) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("fromPkg", str);
                bundle.putString("action", "getMiniGameAdConfigResult");
                List<DownloadTask> H = p1.f.K().H(str);
                String str2 = "";
                String uid = AccountUtil_.getInstance_(this).getUid();
                if (H != null) {
                    Iterator<DownloadTask> it2 = H.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        DownloadTask next = it2.next();
                        if (APKUtils.L(next)) {
                            str2 = next.getCrc_link_type_val();
                            break;
                        }
                    }
                }
                RequestModel<MiniGameSdkDtoRequestArgs> requestModel = new RequestModel<>();
                requestModel.setDefault(this);
                MiniGameSdkDtoRequestArgs miniGameSdkDtoRequestArgs = new MiniGameSdkDtoRequestArgs();
                miniGameSdkDtoRequestArgs.setGameId(str2);
                miniGameSdkDtoRequestArgs.setUid(uid);
                requestModel.setArgs(miniGameSdkDtoRequestArgs);
                ResponseModel<MiniGameSdkDtoResponseResponseData> V2 = com.join.mgps.rpc.impl.i.D0().V(requestModel);
                if (V2 != null) {
                    if (V2.getData() != null && V2.getCode() == 200 && (ad_list = V2.getData().getAd_list()) != null && ad_list.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i4 = 0; i4 < ad_list.size(); i4++) {
                            MiniGameSdkDtoAdCfgValue miniGameSdkDtoAdCfgValue = ad_list.get(i4);
                            c3.b bVar = new c3.b();
                            bVar.b(miniGameSdkDtoAdCfgValue.getSdk_app_id());
                            int i5 = -1;
                            if (miniGameSdkDtoAdCfgValue.getSdk_type() == 1) {
                                i5 = AdChannel.Type.TT.val;
                            } else if (miniGameSdkDtoAdCfgValue.getSdk_type() == 2) {
                                i5 = AdChannel.Type.GDT.val;
                            }
                            bVar.c(i5);
                            arrayList.add(bVar);
                        }
                        AdService.b(this, arrayList);
                    }
                    bundle.putString("data", JsonMapper.toJsonString(V2));
                    a1(bundle);
                    return;
                }
                a1(bundle);
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                a1(bundle);
                return;
            }
        }
        r0(getString(R.string.net_connect_failed));
    }

    void a1(Bundle bundle) {
        Intent intent = new Intent("com.wufun.union.ad.action.AdService");
        intent.setPackage(getPackageName());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startService(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {BAction.ACTION_EMU_GAME_PLAY_TIMES})
    public void a2(@Receiver.Extra String str, @Receiver.Extra Long l4) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Ext ext = new Ext();
        ext.setGameId(str);
        w0.e("liveTime:" + l4 + " receive");
        if (l4.longValue() == 0) {
            return;
        }
        ext.setLiveTime(l4.longValue());
        ext.setClearTime(l4.longValue());
        w0.e("liveTime:" + l4 + " send");
        com.papa.sim.statistic.p.l(this.f54166n).O1(Event.gamePlayTimes, ext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0(String str, int i4, String str2) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                if (this.f54178z == null) {
                    this.f54178z = com.join.mgps.rpc.impl.i.D0();
                }
                RequestDomainInfoArgs requestDomainInfoArgs = new RequestDomainInfoArgs();
                requestDomainInfoArgs.setGameId(str);
                requestDomainInfoArgs.setLocation(Integer.valueOf(i4));
                requestDomainInfoArgs.setTypeId(str2);
                RequestModel requestModel = new RequestModel(this);
                requestModel.setArgs(requestDomainInfoArgs);
                requestModel.makeSign();
                try {
                    ResponseModel<DomainInfoBean> W2 = this.f54178z.W(requestModel.makeSign());
                    if (W2 != null && W2.getData() != null) {
                        W2.getData().setGameId(str);
                        W2.getData().setLaunchTime(System.currentTimeMillis());
                        this.f54155c.privateDomainFeedbackInfo().g(JsonMapper.toJsonString(W2.getData()));
                    } else {
                        this.f54155c.privateDomainFeedbackInfo().g("");
                    }
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    this.f54155c.privateDomainFeedbackInfo().g("");
                    return;
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                this.f54155c.privateDomainFeedbackInfo().g("");
                return;
            }
        }
        this.f54155c.privateDomainFeedbackInfo().g("");
    }

    void b1(String str, String str2, String str3, String str4) {
        w0.e("reconnectJoinRoom", str4, "" + str);
        if (!this.f54175w) {
            r();
            return;
        }
        try {
            ArenaRequest arenaRequest = new ArenaRequest(ArenaConstants.ArenaCommand.CMD_SEND_REJOIN_ROOM);
            try {
                if (!TextUtils.isEmpty(str2)) {
                    arenaRequest.gameId = Long.parseLong(str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    arenaRequest.roomId = Integer.parseInt(str);
                }
                if (!TextUtils.isEmpty(str3)) {
                    arenaRequest.uid = Integer.parseInt(str3);
                }
            } catch (Exception unused) {
            }
            arenaRequest.register_type = ArenaConstants.REGISTER_TYPE_EMU;
            arenaRequest.battleScoreBoard = str4;
            this.f54174v.f(arenaRequest);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void b2(List<BluetoothHandleBlackListData.DataInfo> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        for (int i4 = 0; i4 < list.size(); i4++) {
            BluetoothHandleBlackListData.DataInfo dataInfo = list.get(i4);
            hashMap.put(dataInfo.getId() + "", dataInfo.getModel_number());
        }
        com.join.mgps.joystick.map.a.b().l(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background(delay = 5000)
    public void c0() {
        String C;
        String B;
        Iterator<ShowViewDataBean> it2;
        String C2;
        String B2;
        String B3;
        String C3;
        String C4;
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RequestBeanUtil.getInstance(this).getShowViewDatas();
                RequestModel<RequestGameIdArgs> requestModel = new RequestModel<>();
                requestModel.setDefault(this.f54166n);
                ResponseModel<FirstScreenAdDtoData> body = com.join.mgps.rpc.impl.i.D0().B0().U0(requestModel).execute().body();
                if (body != null && body.getFlag() == 1) {
                    List<ShowViewDataBean> wf_ad_list = body.getData().getWf_ad_list();
                    if (body.getData().getTh_ad_switch() != null) {
                        if (body.getData().getTh_ad_switch().getFx_ad_switch() == 1) {
                            this.f54155c.firstNewSplashV2().g(Boolean.FALSE);
                        }
                        this.f54155c.thAdSwitchCfg().g(JsonMapper.toJsonString(body.getData().getTh_ad_switch()));
                    } else {
                        this.f54155c.thAdSwitchCfg().g("");
                    }
                    if (wf_ad_list.size() > 0) {
                        List<ShowViewDataBeanTable> d5 = i0.o().d();
                        ArrayList<ShowViewDataBean> arrayList = new ArrayList();
                        for (ShowViewDataBeanTable showViewDataBeanTable : d5) {
                            arrayList.add(showViewDataBeanTable.getShowVieDatabean());
                        }
                        File file = new File(this.f54168p);
                        Iterator<ShowViewDataBean> it3 = wf_ad_list.iterator();
                        while (it3.hasNext()) {
                            ShowViewDataBean next = it3.next();
                            for (ShowViewDataBean showViewDataBean : arrayList) {
                                if (next.getStrategy_id().equals(showViewDataBean.getStrategy_id())) {
                                    boolean z4 = false;
                                    showViewDataBean.setNeedDelt(false);
                                    next.setNeedDelt(false);
                                    if (showViewDataBean.getUp_times().equals(next.getUp_times()) && file.exists()) {
                                        for (SplashIntentBean splashIntentBean : showViewDataBean.getJump_info()) {
                                            if (g2.h(splashIntentBean.getPic_remote_local()) || !new File(splashIntentBean.getPic_remote_local()).exists()) {
                                                for (SplashIntentBean splashIntentBean2 : next.getJump_info()) {
                                                    StringBuilder sb = new StringBuilder();
                                                    Iterator<ShowViewDataBean> it4 = it3;
                                                    sb.append(splashIntentBean2.getCrc_link_type_val());
                                                    sb.append("");
                                                    if (sb.toString().equals(splashIntentBean.getCrc_link_type_val())) {
                                                        if (!g2.h(splashIntentBean2.getVedio_url()) && (C3 = C(splashIntentBean2.getVedio_url())) != null) {
                                                            splashIntentBean.setVedio_url(C3);
                                                            z4 = true;
                                                        }
                                                        if (!g2.h(splashIntentBean2.getPic_remote()) && (B3 = B(splashIntentBean2.getPic_remote())) != null) {
                                                            splashIntentBean.setPic_remote_local(B3);
                                                            z4 = true;
                                                        }
                                                    }
                                                    it3 = it4;
                                                }
                                            }
                                            Iterator<ShowViewDataBean> it5 = it3;
                                            if (g2.h(splashIntentBean.getVedio_url_local()) || !new File(splashIntentBean.getVedio_url_local()).exists()) {
                                                for (SplashIntentBean splashIntentBean3 : next.getJump_info()) {
                                                    if ((splashIntentBean3.getCrc_link_type_val() + "").equals(splashIntentBean.getCrc_link_type_val()) && !g2.h(splashIntentBean3.getVedio_url()) && (C4 = C(splashIntentBean3.getVedio_url())) != null) {
                                                        splashIntentBean.setVedio_url_local(C4);
                                                        z4 = true;
                                                    }
                                                }
                                            }
                                            it3 = it5;
                                        }
                                        it2 = it3;
                                        if (z4) {
                                            i0.o().m(showViewDataBean.getShowVieDatabeanTable());
                                            if (this.f54155c.lastClickPageAD().d().equals(showViewDataBean.getId() + "")) {
                                                this.f54155c.lastClickPageAD().g("0");
                                            }
                                        }
                                    }
                                    it2 = it3;
                                    next.setId(showViewDataBean.getId());
                                    for (SplashIntentBean splashIntentBean4 : next.getJump_info()) {
                                        if (!TextUtils.isEmpty(splashIntentBean4.getPic_remote()) && (B2 = B(splashIntentBean4.getPic_remote())) != null) {
                                            splashIntentBean4.setPic_remote_local(B2);
                                        }
                                        if (!TextUtils.isEmpty(splashIntentBean4.getVedio_url()) && (C2 = C(splashIntentBean4.getVedio_url())) != null) {
                                            splashIntentBean4.setVedio_url_local(C2);
                                        }
                                    }
                                    i0.o().m(next.getShowVieDatabeanTable());
                                    if (this.f54155c.lastClickPageAD().d().equals(showViewDataBean.getId() + "")) {
                                        this.f54155c.lastClickPageAD().g("0");
                                    }
                                } else {
                                    it2 = it3;
                                }
                                it3 = it2;
                            }
                        }
                        for (ShowViewDataBean showViewDataBean2 : wf_ad_list) {
                            if (showViewDataBean2.isNeedDelt() || !file.exists()) {
                                for (SplashIntentBean splashIntentBean5 : showViewDataBean2.getJump_info()) {
                                    if (!TextUtils.isEmpty(splashIntentBean5.getPic_remote()) && (B = B(splashIntentBean5.getPic_remote())) != null) {
                                        splashIntentBean5.setPic_remote_local(B);
                                    }
                                    if (!TextUtils.isEmpty(splashIntentBean5.getVedio_url()) && (C = C(splashIntentBean5.getVedio_url())) != null) {
                                        splashIntentBean5.setVedio_url_local(C);
                                    }
                                }
                                i0.o().m(showViewDataBean2.getShowVieDatabeanTable());
                            }
                        }
                        for (ShowViewDataBean showViewDataBean3 : arrayList) {
                            if (showViewDataBean3.isNeedDelt()) {
                                for (SplashIntentBean splashIntentBean6 : showViewDataBean3.getJump_info()) {
                                    if (!TextUtils.isEmpty(splashIntentBean6.getPic_remote())) {
                                        UtilsMy.delete(new File(splashIntentBean6.getPic_remote()));
                                    }
                                    if (!TextUtils.isEmpty(splashIntentBean6.getVedio_url())) {
                                        UtilsMy.delete(new File(splashIntentBean6.getVedio_url()));
                                    }
                                }
                                i0.o().delete((i0) showViewDataBean3.getShowVieDatabeanTable());
                            }
                        }
                        this.f54155c.firstNewSplashV2().g(Boolean.FALSE);
                        this.f54155c.isShowSplash().g(Boolean.valueOf(n0()));
                        return;
                    }
                    this.f54155c.isShowSplash().g(Boolean.FALSE);
                    return;
                }
                this.f54155c.isShowSplash().g(Boolean.FALSE);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72038z})
    public void c1() {
        stopSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d() {
        boolean C0;
        boolean C02;
        ArrayList arrayList = new ArrayList();
        List<DownloadTask> v2 = p1.f.K().v();
        List<DownloadTask> N = p1.f.K().N(false);
        if (N != null && N.size() > 0) {
            Iterator<DownloadTask> it2 = N.iterator();
            while (it2.hasNext()) {
                DownloadTask next = it2.next();
                EMUApkTable f02 = UtilsMy.f0(next.getPackageName());
                if (f02 != null && f02.getDown_type() == 2) {
                    C02 = com.join.android.app.common.utils.l.y(f02, false);
                } else {
                    C02 = UtilsMy.C0(this, f02);
                }
                if (!com.join.android.app.common.utils.l.t(this, f02, false, next.getPackageName())) {
                    next.setStatus(5);
                } else if (C02) {
                    if (UtilsMy.E0(f02.getVer().split("_")[0], next.getVer())) {
                        if (g2.h(next.getMod_info())) {
                            next.setStatus(9);
                            it2.remove();
                        }
                    } else if (next.getGameZipPath() != null && !next.getGameZipPath().equals("")) {
                        if (next.getStatus() == 5 && new File(next.getGameZipPath()).exists()) {
                            next.setStatus(5);
                        } else if (g2.h(next.getMod_info())) {
                            next.setStatus(9);
                            it2.remove();
                        }
                    } else if (g2.h(next.getMod_info())) {
                        next.setStatus(9);
                        it2.remove();
                    }
                } else {
                    next.setStatus(5);
                    it2.remove();
                }
            }
        }
        if (v2 != null) {
            DownloadTask downloadTask = null;
            Iterator<DownloadTask> it3 = v2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                DownloadTask next2 = it3.next();
                if (q1.c(this, next2)) {
                    downloadTask = next2;
                    break;
                }
            }
            if (downloadTask != null) {
                v2.remove(downloadTask);
            }
            arrayList.addAll(v2);
        }
        if (N != null) {
            arrayList.addAll(N);
        }
        if (arrayList.size() > 0) {
            UtilsMy.H3(this, ((DownloadTask) arrayList.get(0)).getShowName(), arrayList.size(), 11);
            return;
        }
        List<DownloadTask> N2 = p1.f.K().N(true);
        ArrayList arrayList2 = new ArrayList();
        if (N2 != null && N2.size() > 0) {
            for (DownloadTask downloadTask2 : N2) {
                if (downloadTask2.getStatus() == 9) {
                    arrayList2.addAll(N2);
                }
            }
        }
        List<DownloadTask> p4 = p1.f.K().p();
        if (p4 == null || p4.size() <= 0) {
            return;
        }
        Iterator<DownloadTask> it4 = p4.iterator();
        while (it4.hasNext()) {
            DownloadTask next3 = it4.next();
            if (next3.getFileType().equals(Dtype.chajian.name())) {
                EMUApkTable f03 = UtilsMy.f0(next3.getPackageName());
                int status = next3.getStatus();
                if (f03 != null && f03.getDown_type() == 2) {
                    C0 = com.join.android.app.common.utils.l.y(f03, false);
                } else {
                    C0 = UtilsMy.C0(this, f03);
                }
                if (!com.join.android.app.common.utils.l.t(this, f03, false, next3.getPackageName())) {
                    next3.setStatus(5);
                } else if (C0) {
                    if (UtilsMy.E0(f03.getVer().split("_")[0], next3.getVer())) {
                        if (g2.h(next3.getMod_info())) {
                            next3.setStatus(9);
                            arrayList2.add(next3);
                            it4.remove();
                        }
                    } else if (next3.getGameZipPath() != null && !next3.getGameZipPath().equals("")) {
                        if (next3.getStatus() == 5 && new File(next3.getGameZipPath()).exists()) {
                            next3.setStatus(5);
                        } else if (g2.h(next3.getMod_info())) {
                            next3.setStatus(9);
                            arrayList2.add(next3);
                            it4.remove();
                        }
                    } else if (g2.h(next3.getMod_info())) {
                        next3.setStatus(9);
                        arrayList2.add(next3);
                        it4.remove();
                    }
                } else {
                    next3.setStatus(5);
                    it4.remove();
                }
                if (status != next3.getStatus()) {
                    UtilsMy.S2(next3, next3.getStatus());
                }
            } else if (next3.getFileType().equals(Dtype.android.name()) && next3.getStatus() == 9 && g2.h(next3.getMod_info())) {
                arrayList2.add(next3);
            }
        }
        if (arrayList2.size() > 0) {
            UtilsMy.H3(this, ((DownloadTask) arrayList2.get(0)).getShowName(), arrayList2.size(), 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d0() {
        if (com.join.android.app.common.utils.j.j(this.f54166n)) {
            try {
                CommentResponse<CommentTokenBean> c5 = com.join.mgps.rpc.impl.e.m().c(RequestBeanUtil.getInstance(this).getTokenRequestBean(AccountUtil_.getInstance_(this).getUid(), ""));
                if (c5 == null || c5.getCode() != 0 || c5.getData_info() == null || TextUtils.isEmpty(c5.getData_info().getToken())) {
                    return;
                }
                String f5 = AESUtils.f(c5.getData_info().getToken() + "|" + c5.getData_info().getTimes());
                StringBuilder sb = new StringBuilder();
                sb.append("token=");
                sb.append(f5);
                w0.e("getToken", sb.toString());
                this.f54155c.commentToken().g(f5);
                this.f54155c.lastCheckInTime().g(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72024s})
    public void d1() {
        AccountUtil_.getInstance_(this.f54166n).accountLoginOut(this.f54166n);
        Q1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e() {
        JSONArray jSONArray;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("MG=>LOGIN1--");
            sb.append(MApplication.V);
            sb.append("");
            n0 accountData = AccountUtil_.getInstance_(this.f54166n).getAccountData();
            int uid = accountData.getUid();
            String token = accountData.getToken();
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(com.join.mgps.rpc.h.f54068n + "/im/account/login?uid=" + uid + "&nickname=" + URLEncoder.encode(accountData.getNickname()) + "&battleRoomId=" + MApplication.V + "&token=" + token).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            if (200 == httpURLConnection.getResponseCode()) {
                JSONObject optJSONObject = new JSONObject(new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8")).readLine()).optJSONObject("data");
                optJSONObject.optString("uid");
                optJSONObject.optString("token");
                String str = "";
                for (int i4 = 0; i4 < new JSONArray(optJSONObject.optString("quickMessages")).length(); i4++) {
                    str = str + jSONArray.getString(i4) + "|";
                }
                if (!str.equals("")) {
                    this.f54157e.putExtra("type", "12");
                    this.f54157e.putExtra("msg", str);
                    sendBroadcast(this.f54157e);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("弹幕");
                sb2.append(str);
                this.J = optJSONObject.optString("chatRoomId");
                if (com.wufan.friend.chat.c.u().F()) {
                    z1();
                    return;
                } else {
                    com.wufan.friend.chat.c.u().K();
                    return;
                }
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("MG=>LOGIN200!");
            sb3.append(httpURLConnection.getResponseCode());
        } catch (Exception e5) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("-->");
            sb4.append(e5.toString());
            X = false;
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e0() {
        Context context;
        Intent intent;
        try {
            if (com.join.android.app.common.utils.j.j(this.f54166n)) {
                try {
                    n0 accountData = AccountUtil_.getInstance_(this.f54166n).getAccountData();
                    if (accountData == null) {
                        accountData = n0.b5();
                    }
                    RequestModel requestModel = new RequestModel();
                    VideoAdCfgRequestArgs videoAdCfgRequestArgs = new VideoAdCfgRequestArgs();
                    videoAdCfgRequestArgs.setUid(accountData.getUid());
                    videoAdCfgRequestArgs.setToken(accountData.getToken());
                    requestModel.setArgs(videoAdCfgRequestArgs);
                    requestModel.setDefault(this.f54166n);
                    ResponseModel<VideoAdCfgBean> D = com.join.mgps.rpc.impl.i.D0().D(requestModel.makeSign());
                    if (D != null && D.getCode() == 200) {
                        VideoAdCfgBean data = D.getData();
                        this.f54155c.arcadeGameAdCfg().g(BaseBean.toJsonStringOrEmpty(data.getArcade_game_ad_cfg()));
                        this.f54155c.singleGameAdCfg().g(BaseBean.toJsonStringOrEmpty(data.getSingle_game_ad_cfg()));
                        this.f54155c.pspGameAdCfg().g(BaseBean.toJsonStringOrEmpty(data.getPsp_game_ad_cfg()));
                        this.f54155c.pspAdShowTimeSwitch().g(Integer.valueOf(data.getPsp_game_ad_cfg().getSwitch_state()));
                        this.f54155c.pspAdShowTime().g(Integer.valueOf(data.getPsp_game_ad_cfg().getCount_down()));
                        this.f54155c.downloadSpeedupCfg().g(BaseBean.toJsonStringOrEmpty(data.getDownload_speedup_cfg()));
                        this.f54155c.mod_normal_ad_cfg().g(BaseBean.toJsonStringOrEmpty(data.getMod_normal_ad_cfg()));
                        this.f54155c.mod_enhance_ad_cfg().g(BaseBean.toJsonStringOrEmpty(data.getMod_enhance_ad_cfg()));
                        this.f54155c.simulator_path_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_path_cfg()));
                        this.f54155c.simulator_fc_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_fc_cfg()));
                        this.f54155c.simulator_gba_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_gba_cfg()));
                        this.f54155c.simulator_psp_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_psp_cfg()));
                        this.f54155c.simulator_jj_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_jj_cfg()));
                        this.f54155c.simulator_gold_finger_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_gold_finger_cfg()));
                        this.f54155c.simulator_exit_information_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_exit_information_cfg()));
                        this.f54155c.simulator_exit_open_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSimulator_exit_open_cfg()));
                        this.f54155c.ssp_cfg().g(BaseBean.toJsonStringOrEmpty(data.getSsp_cfg()));
                        this.f54155c.video_init_cfg().g(BaseBean.toJsonStringOrEmpty(data.getVideo_init_cfg()));
                        if (data.getDownload_speedup_cfg() != null) {
                            if (data.getDownload_speedup_cfg().getSwitch_state() == 1) {
                                this.f54155c.downloadSpeedUpCountAD().g(Integer.valueOf(data.getDownload_speedup_cfg().getSpeedup_times()));
                            } else {
                                this.f54155c.downloadSpeedUpCountAD().g(0);
                            }
                        } else {
                            this.f54155c.downloadSpeedUpCountAD().g(0);
                        }
                    } else if (D != null) {
                        G1(D.getMessage());
                    }
                    context = this.f54166n;
                    intent = new Intent(o1.a.f72027t0);
                } catch (Exception e5) {
                    e5.printStackTrace();
                    G1(this.f54166n.getResources().getString(R.string.request_failure));
                    context = this.f54166n;
                    intent = new Intent(o1.a.f72027t0);
                }
                context.sendBroadcast(intent);
                return;
            }
            G1(this.f54166n.getResources().getString(R.string.net_connect_failed));
        } catch (Throwable th) {
            this.f54166n.sendBroadcast(new Intent(o1.a.f72027t0));
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72013m0})
    public void e1(@Receiver.Extra String str, @Receiver.Extra Integer num) {
        L1(str, num.intValue());
    }

    public void f(String str) {
        this.f54157e.putExtra("type", "4");
        Intent intent = this.f54157e;
        intent.putExtra("msg", str + "");
        sendBroadcast(this.f54157e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void f0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ForumBannerBean.ForumBannerResponseBean Z = com.join.mgps.rpc.impl.d.P1().Z(j0.V(this, 1));
                if (Z != null && Z.getFlag().equals("1") && Z.getMessages() != null && Z.getMessages().getData() != null) {
                    n1(Z.getMessages().getData());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.B, o1.a.H})
    public void f1() {
        Z();
    }

    void g() {
        if (this.f54164l == null) {
            IntentFilter intentFilter = new IntentFilter();
            this.f54159g = intentFilter;
            intentFilter.addAction("com.join.android.app.mgsim.wufun.loginNim");
            r rVar = new r();
            this.f54164l = rVar;
            registerReceiver(rVar, this.f54159g);
        }
        if (this.f54165m == null) {
            IntentFilter intentFilter2 = new IntentFilter();
            this.f54163k = intentFilter2;
            intentFilter2.addAction("com.join.android.app.mgsim.wufun.SendTextMsg");
            s sVar = new s();
            this.f54165m = sVar;
            registerReceiver(sVar, this.f54163k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ForumResponse<ForumData.ForumForumWelcomeData> i02 = com.join.mgps.rpc.impl.g.A0().i0("");
                ForumData.ForumForumWelcomeData data = i02 != null ? i02.getData() : null;
                if (data != null) {
                    o1(data);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void g1() {
        this.K = new p();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(this.K.f54224b);
        intentFilter.addAction(this.K.f54225c);
        intentFilter.addAction(this.K.f54226d);
        intentFilter.addAction(this.K.f54227e);
        intentFilter.addAction(this.K.f54228f);
        intentFilter.addAction(this.K.f54229g);
        intentFilter.addAction(this.K.f54230h);
        registerReceiver(this.K, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0(int i4) {
        ForumResponse<ForumData.ForumForumWelcomePostsData> t02;
        ForumData.ForumForumWelcomePostsData data;
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                n0 T2 = j0.T(this);
                if (j0.Y0(this)) {
                    t02 = com.join.mgps.rpc.impl.g.A0().V(i4, j0.f27864d, T2.getUid(), T2.getToken(), "");
                } else {
                    t02 = com.join.mgps.rpc.impl.g.A0().t0(i4, j0.f27864d, "");
                }
                if (t02 == null || (data = t02.getData()) == null) {
                    return;
                }
                p1(data);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void i0(FileInfo fileInfo, DownloadScanEvent downloadScanEvent) {
        if (fileInfo == null || downloadScanEvent == null) {
            return;
        }
        String str = fileInfo.pkg;
        try {
            DownloadTask task = downloadScanEvent.getTask();
            boolean z4 = false;
            if (task != null) {
                if (g2.h(task.getPath()) && g2.i(fileInfo.getPath())) {
                    String path = fileInfo.getPath();
                    task.setPath(path);
                    if (fileInfo.getFileType() != 2 && fileInfo.getFileType() != 1) {
                        if (fileInfo.getFileType() == 3) {
                            task.setStatus(31);
                        }
                        com.php25.PDownload.d.h(task);
                        task.setSize(fileInfo.getSize());
                        task.setDuration(10L);
                        task.setShowSize(UtilsMy.d(fileInfo.getSize()));
                    }
                    task.setGameZipPath(path);
                    task.setStatus(11);
                    com.php25.PDownload.d.h(task);
                    task.setSize(fileInfo.getSize());
                    task.setDuration(10L);
                    task.setShowSize(UtilsMy.d(fileInfo.getSize()));
                }
                String ext = task.getExt();
                ExtBean extBean = g2.i(ext) ? (ExtBean) JsonMapper.getInstance().fromJson(ext, ExtBean.class) : null;
                if (extBean == null) {
                    extBean = new ExtBean();
                }
                extBean.setQkPosition("qk");
                extBean.setDown_from(1);
                task.setExt(JsonMapper.toJsonString(extBean));
                p1.f.K().m(task);
                DownloadScanEvent downloadScanEvent2 = new DownloadScanEvent();
                downloadScanEvent2.setTask(task);
                org.greenrobot.eventbus.c.f().o(downloadScanEvent2);
                z4 = true;
            }
            if (z4) {
                this.Q.remove(str);
                this.P.remove(str);
                r1();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i1(String str) {
        try {
            if (this.f54178z == null) {
                this.f54178z = com.join.mgps.rpc.impl.i.D0();
            }
            if (com.join.android.app.common.utils.j.j(this.f54166n)) {
                n0 accountData = AccountUtil_.getInstance_(this.f54166n).getAccountData();
                int uid = accountData != null ? accountData.getUid() : 0;
                if (IntentUtil.getInstance().goLogin(this.f54166n)) {
                    r0("请先登录！");
                    w1(str, 49);
                    return;
                }
                RequestGameBespeakArgs requestGameBespeakArgs = new RequestGameBespeakArgs();
                requestGameBespeakArgs.setGameId(str);
                requestGameBespeakArgs.setUid(uid);
                requestGameBespeakArgs.setMobile(accountData.z());
                RequestModel<RequestGameBespeakArgs> requestModel = new RequestModel<>(this.f54166n);
                requestModel.setArgs(requestGameBespeakArgs);
                ResponseModel<GameBespeakBean> q02 = this.f54178z.q0(requestModel);
                if (q02 != null) {
                    if (q02.getFlag() == 1) {
                        GameBespeakBean data = q02.getData();
                        if (data != null) {
                            if (data.getPdInfo() != null) {
                                com.papa.sim.statistic.p.l(this.f54166n).O1(Event.pdGameSearchSubscribe, new Ext().setGameId(str).setTestAbNumber(data.getPdInfo().getAb_test_number()).setIsJoin(data.getPdInfo().getIs_join()));
                            }
                            Intent intent = new Intent("com.broadcast.bespeak.sussess");
                            intent.putExtra("gameid", str);
                            intent.putExtra("game_book", data.isBespeak() ? 1 : 0);
                            intent.putExtra("message", data.getHint());
                            intent.putExtra("pd_info", data.getPdInfo());
                            this.f54166n.sendBroadcast(intent);
                            r0("收到，游戏上架后会通知您");
                            return;
                        }
                        return;
                    }
                    w1(str, 49);
                    return;
                }
                r0("请求失败！");
                w1(str, 49);
                return;
            }
            r0("请检查网络！");
            w1(str, 49);
        } catch (Exception e5) {
            e5.printStackTrace();
            w1(str, 49);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72020q})
    public void j0() {
        l2.a(getApplicationContext()).b("存储空间不足，请清理空间后再下载");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j1() {
        BluetoothHandleBlackListData data;
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                BluetoothHandleBlackListRequestBean bluetoothHandleBlackListRequestBean = new BluetoothHandleBlackListRequestBean();
                bluetoothHandleBlackListRequestBean.setDevice_id("");
                AccountResultMainBean<BluetoothHandleBlackListData> X2 = com.join.mgps.rpc.impl.a.c0().X(bluetoothHandleBlackListRequestBean.getParams());
                if (X2 == null || (data = X2.getData()) == null || !data.is_success()) {
                    return;
                }
                b2(data.getData_info());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k1(String str) {
        try {
            if (com.join.android.app.common.utils.j.j(this.f54166n)) {
                if (this.f54178z == null) {
                    this.f54178z = com.join.mgps.rpc.impl.i.D0();
                }
                n0 accountData = AccountUtil_.getInstance_(this.f54166n).getAccountData();
                int i4 = 0;
                int uid = accountData != null ? accountData.getUid() : 0;
                if (IntentUtil.getInstance().goLogin(this.f54166n)) {
                    r0("请先登录！");
                    w1(str, 49);
                    return;
                }
                RequestGameBespeakArgs requestGameBespeakArgs = new RequestGameBespeakArgs();
                requestGameBespeakArgs.setGameId(str);
                requestGameBespeakArgs.setUid(uid);
                requestGameBespeakArgs.setMobile(accountData.z());
                RequestModel<RequestGameBespeakArgs> requestModel = new RequestModel<>(this.f54166n);
                requestModel.setArgs(requestGameBespeakArgs);
                ResponseModel<GameBespeakBean> m02 = this.f54178z.m0(requestModel);
                if (m02 != null) {
                    if (m02.getFlag() == 1) {
                        GameBespeakBean data = m02.getData();
                        if (data != null) {
                            if (data.getPdInfo() != null) {
                                com.papa.sim.statistic.p.l(this.f54166n).O1(Event.pdGameSearchSubscribe, new Ext().setGameId(str).setTestAbNumber(data.getPdInfo().getAb_test_number()).setIsJoin(data.getPdInfo().getIs_join()));
                            }
                            Intent intent = new Intent("com.broadcast.bespeak.sussess");
                            intent.putExtra("gameid", str);
                            if (!data.isBespeak()) {
                                i4 = 1;
                            }
                            intent.putExtra("game_book", i4);
                            this.f54166n.sendBroadcast(intent);
                        }
                        r0("取消预约成功");
                        return;
                    }
                    w1(str, 49);
                    return;
                }
                r0("请求失败！");
                w1(str, 49);
                return;
            }
            r0("请检查网络！");
            w1(str, 49);
        } catch (Exception e5) {
            e5.printStackTrace();
            w1(str, 49);
        }
    }

    boolean l0(String str) {
        try {
            this.f54166n.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.emu.adInfo"})
    public void m1(@Receiver.Extra String str) {
        this.f54155c.hasShowAdInfo().g(str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        g();
        com.join.android.app.common.http.h.b().c(this);
        com.wufan.friend.chat.c.u();
        w0.e("FriendPresenter srv login");
        com.wufan.friend.chat.c.u().K();
        if (!org.greenrobot.eventbus.c.f().m(this)) {
            org.greenrobot.eventbus.c.f().t(this);
        }
        g1();
        c0();
        r();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f54169q = true;
        try {
            ScheduledExecutorService scheduledExecutorService = this.f54154b;
            if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
                this.f54154b.shutdown();
            }
            O1();
            r rVar = this.f54164l;
            if (rVar != null) {
                unregisterReceiver(rVar);
            }
            s sVar = this.f54165m;
            if (sVar != null) {
                unregisterReceiver(sVar);
            }
            com.github.snowdream.android.app.downloader.b bVar = this.f54171s;
            if (bVar != null) {
                bVar.n();
                this.f54173u.clear();
            }
            if (org.greenrobot.eventbus.c.f().m(this)) {
                org.greenrobot.eventbus.c.f().y(this);
            }
            U1();
            T1();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        super.onDestroy();
    }

    @Subscribe
    public void onFriendEvent(w1 w1Var) {
        com.wufan.friend.chat.protocol.m s02;
        if (w1Var == null) {
            return;
        }
        try {
            if (w1Var.C() == 1 && w1Var.I() == 1) {
                if (w1Var.getData() != null && w1Var.getData().z2() != null && w1Var.getData().z2().D0()) {
                    w0.e("channel", "登录成功！");
                    com.wufan.friend.chat.c.u().T(true);
                    z1();
                } else {
                    w0.e("channel", w1Var.getData().z2().getMessage());
                    this.f54170r.postDelayed(new Runnable() { // from class: com.join.mgps.service.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            CommonService.p0();
                        }
                    }, 5000L);
                }
            }
            if (w1Var.B1() != 6 || w1Var.getData() == null || w1Var.getData().getNotification() == null || (s02 = w1Var.getData().getNotification().s0()) == null) {
                return;
            }
            R1(s02.getMessage());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        String str;
        DownloadTask downloadTask;
        boolean z4;
        this.f54166n = this;
        if (intent != null) {
            String stringExtra = intent.getStringExtra("action");
            if (!TextUtils.isEmpty(stringExtra)) {
                if (stringExtra.equals("launchVGame")) {
                    com.join.mgps.va.overmind.d.o().U(this, 0, intent.getStringExtra("packageName"));
                    return super.onStartCommand(intent, i4, i5);
                } else if (stringExtra.equals("getMiniGameConfig")) {
                    a0(intent.getStringExtra("fromPkg"));
                } else if (stringExtra.equals("adStatisticEvent")) {
                    t1(intent.getStringExtra("fromPkg"), intent.getStringExtra("event"), intent.getStringExtra("adId"));
                } else if (stringExtra.equals("downloadQuark")) {
                    E(intent.getBooleanExtra(NotificationCompat.GROUP_KEY_SILENT, true), intent.getBooleanExtra("isOm", true), intent.getStringExtra("qkPosition"));
                } else if (stringExtra.equals("retrieveQuarkScanEvent")) {
                    s0();
                } else if (stringExtra.equals("quarkScan")) {
                    s1();
                }
            }
        }
        if (intent != null && g2.i(intent.getStringExtra("paygameid"))) {
            t(intent.getStringExtra("paygameid"), intent.getBooleanExtra("fromSdk", false), intent.getStringExtra("appkey"));
        } else if (intent != null && g2.i(intent.getStringExtra("downGameId"))) {
            boolean booleanExtra = intent.getBooleanExtra("uncheckSelfSupport", false);
            boolean booleanExtra2 = intent.getBooleanExtra("disableShowSpeedUpPrompt", false);
            long longExtra = intent.getLongExtra("resourceSize", 0L);
            String stringExtra2 = intent.getStringExtra("ext");
            boolean booleanExtra3 = intent.getBooleanExtra("fromRecomDown", false);
            intent.getBooleanExtra("showRecommend", true);
            T(intent.getStringExtra("downGameId"), stringExtra2, booleanExtra, longExtra, (intent.getSerializableExtra("data") == null || !(intent.getSerializableExtra("data") instanceof QueryDownloadInfoResponseData)) ? null : (QueryDownloadInfoResponseData) intent.getSerializableExtra("data"), booleanExtra2, intent.getIntExtra("_from", 0), intent.getIntExtra("_from_type", 0), booleanExtra3, (DownloadGameArgsBean) intent.getSerializableExtra("_downloadArgs"));
        } else if (intent != null && g2.i(intent.getStringExtra("requestAndDownloadGameById"))) {
            DownloadGameArgsBean downloadGameArgsBean = (DownloadGameArgsBean) intent.getSerializableExtra("_downloadArgs");
            if (downloadGameArgsBean == null) {
                downloadGameArgsBean = new DownloadGameArgsBean();
                downloadGameArgsBean.setGameId(intent.getStringExtra("requestAndDownloadGameById"));
            }
            h1(downloadGameArgsBean, 0);
        } else if (intent != null && g2.i(intent.getStringExtra("requestAndUpdateGameById"))) {
            DownloadGameArgsBean downloadGameArgsBean2 = (DownloadGameArgsBean) intent.getSerializableExtra("_downloadArgs");
            if (downloadGameArgsBean2 == null) {
                downloadGameArgsBean2 = new DownloadGameArgsBean();
                downloadGameArgsBean2.setGameId(intent.getStringExtra("requestAndUpdateGameById"));
            }
            h1(downloadGameArgsBean2, 1);
        } else if (intent != null && g2.i(intent.getStringExtra("requestAndChoiceUpdateGameById"))) {
            DownloadGameArgsBean downloadGameArgsBean3 = (DownloadGameArgsBean) intent.getSerializableExtra("_downloadArgs");
            if (downloadGameArgsBean3 == null) {
                downloadGameArgsBean3 = new DownloadGameArgsBean();
                downloadGameArgsBean3.setGameId(intent.getStringExtra("requestAndChoiceUpdateGameById"));
            }
            h1(downloadGameArgsBean3, 2);
        } else if (intent != null && g2.i(intent.getStringExtra("getPrivateDomainById"))) {
            HashMap hashMap = (HashMap) intent.getSerializableExtra("_ArgMaps");
            if (hashMap != null) {
                try {
                    String stringExtra3 = intent.getStringExtra("getPrivateDomainById");
                    int intValue = hashMap.get("location") instanceof Integer ? ((Integer) hashMap.get("location")).intValue() : 0;
                    String str2 = hashMap.get("typeId") instanceof String ? (String) hashMap.get("typeId") : "0";
                    if (g2.i(stringExtra3) && intValue != 0) {
                        b0(stringExtra3, intValue, str2);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        } else if (intent != null && g2.i(intent.getStringExtra("gameDownloadDetail"))) {
            DownloadGameArgsBean downloadGameArgsBean4 = new DownloadGameArgsBean();
            downloadGameArgsBean4.setGameId(intent.getStringExtra("gameDownloadDetail"));
            downloadGameArgsBean4.setFromRecommend(intent.getBooleanExtra("fromRecomDown", false));
            downloadGameArgsBean4.setFrom(intent.getIntExtra("_from", 0));
            downloadGameArgsBean4.setFromType(intent.getIntExtra("_from_type", 0));
            downloadGameArgsBean4.setKeyWord(intent.getStringExtra("keyWord"));
            downloadGameArgsBean4.setRecPosition(intent.getStringExtra("recPosition"));
            downloadGameArgsBean4.setRemarks(intent.getStringExtra("remarks"));
            downloadGameArgsBean4.setNodeId(intent.getStringExtra("nodeId"));
            downloadGameArgsBean4.setVolcanoOther(intent.getStringExtra("volcanoOther"));
            downloadGameArgsBean4.setLocation(intent.getIntExtra("location", 0));
            downloadGameArgsBean4.setDownType(intent.getIntExtra("downType", 0));
            downloadGameArgsBean4.setExt(intent.getStringExtra("ext"));
            downloadGameArgsBean4.setPackagePath(intent.getStringExtra("packagePath"));
            Y(downloadGameArgsBean4);
        } else if (intent != null && g2.i(intent.getStringExtra("gameDownloadDetail2"))) {
            DownloadTask downloadTask2 = this.f54177y;
            if (downloadTask2 != null && downloadTask2.getCrc_link_type_val().equals(intent.getStringExtra("gameDownloadDetail2"))) {
                if (this.f54177y.getDown_status() == 5) {
                    UtilsMy.n1(this.f54166n, this.f54177y);
                } else {
                    Context context = this.f54166n;
                    DownloadTask downloadTask3 = this.f54177y;
                    UtilsMy.T0(context, downloadTask3, downloadTask3.getTp_down_url(), this.f54177y.getOther_down_switch(), this.f54177y.getCdn_down_switch());
                }
            }
        } else if (intent != null && g2.i(intent.getStringExtra("downGameIdNotSelfSupport"))) {
            String stringExtra4 = intent.getStringExtra("downGameIdNotSelfSupport");
            if (intent.getSerializableExtra("downloadTask") == null || !(intent.getSerializableExtra("downloadTask") instanceof DownloadTask)) {
                str = "";
                downloadTask = null;
                z4 = false;
            } else {
                DownloadTask downloadTask4 = (DownloadTask) intent.getSerializableExtra("downloadTask");
                String ext = downloadTask4.getExt();
                downloadTask = downloadTask4;
                z4 = downloadTask4.isFromRecomDown();
                str = ext;
            }
            D(stringExtra4, str, downloadTask, z4, (DownloadGameArgsBean) intent.getSerializableExtra("_downloadArgs"));
        } else if (intent != null && g2.i(intent.getStringExtra("accountloginSuccess"))) {
            Q();
            W();
        } else if (intent != null && intent.getSerializableExtra("checkcoin") != null) {
            v((DownloadTask) intent.getSerializableExtra("checkcoin"));
        } else if (intent != null && intent.getSerializableExtra("sharePostData") != null) {
            B1((SharePostRequest) intent.getSerializableExtra("sharePostData"));
        } else if (intent != null && intent.getSerializableExtra("getDownloadRecomedData") != null) {
            U((String) intent.getSerializableExtra("getDownloadRecomedData"), intent.getStringExtra("showName"), Boolean.valueOf(intent.getBooleanExtra("fromRecommendDown", false)).booleanValue());
        } else if (intent != null && intent.getSerializableExtra("onClickGamebeSpeakGameId") != null) {
            i1((String) intent.getSerializableExtra("onClickGamebeSpeakGameId"));
        } else if (intent != null && intent.getSerializableExtra("onClickUnGamebeSpeakGameId") != null) {
            k1((String) intent.getSerializableExtra("onClickUnGamebeSpeakGameId"));
        } else if (intent != null && intent.getSerializableExtra("downloadByQuark") != null) {
            z0((DownloadScanEvent) intent.getSerializableExtra("downloadByQuark"));
        } else {
            try {
                if (a.C0392a.a()) {
                    o0();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            this.f54168p = v.d(this.f54166n).getAbsolutePath();
            this.f54154b.scheduleWithFixedDelay(new q(), 0L, 50L, TimeUnit.MINUTES);
            this.f54154b.scheduleWithFixedDelay(new n(this, null), 10L, 30L, TimeUnit.SECONDS);
            Q();
        }
        f1();
        return super.onStartCommand(intent, i4, i5);
    }

    String p(String str) {
        try {
            String[] split = str.split("_");
            return split[0].equals(com.join.android.app.common.utils.n.n(this.f54166n).e(this.f54166n)) ? split[1] : "-1";
        } catch (Exception e5) {
            e5.printStackTrace();
            return "-1";
        }
    }

    void q(String str, String str2, String str3, String str4) {
        if (this.f54174v.e()) {
            com.join.mgps.socket.fight.arena.b bVar = this.f54174v;
            if (bVar != null && bVar.d() != null && this.f54174v.d().s()) {
                b1(str, str2, str3, str4);
                return;
            }
            ArenaRequest login = ArenaRequestFactory.login(ArenaConstants.REGISTER_TYPE_EMU);
            login.isRefreshing = false;
            try {
                if (!TextUtils.isEmpty(str2)) {
                    login.gameId = Long.parseLong(str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    login.roomId = Integer.parseInt(str);
                }
                if (!TextUtils.isEmpty(str3)) {
                    login.uid = Integer.parseInt(str3);
                }
            } catch (Exception unused) {
            }
            this.f54174v.f(login);
            return;
        }
        this.f54174v.bindService();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void q1(List<AppBean> list) {
        e0.o().a();
        if (list != null) {
            p1.e.d(getApplicationContext());
            for (AppBean appBean : list) {
                e0.o().m(new PurchasedListTable(appBean));
            }
        }
        UtilsMy.Q2(this);
        x();
    }

    void r() {
        try {
            com.join.mgps.socket.fight.arena.b bVar = new com.join.mgps.socket.fight.arena.b(this, new c());
            this.f54174v = bVar;
            bVar.bindService();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    synchronized void r1() {
        this.f54155c.quarkGameDownload().g(JsonMapper.getInstance().toJson(this.Q));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void s0() {
        String d5 = this.f54155c.quarkGameDownload().d();
        if (TextUtils.isEmpty(d5)) {
            return;
        }
        try {
            HashMap hashMap = (HashMap) JsonMapper.getInstance().fromJson(d5, JsonMapper.getInstance().createCollectionType(HashMap.class, String.class, DownloadScanEvent.class));
            if (hashMap != null) {
                this.Q.clear();
                this.Q.putAll(hashMap);
            }
            this.O.set(true);
            s1();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void s1() {
        FileInfo X2;
        boolean z4;
        String str;
        FileInfo X3;
        char c5 = 0;
        try {
            try {
                try {
                } catch (Exception e5) {
                    e5.printStackTrace();
                    this.N = false;
                    w0.e("quark scan..end");
                    if (this.O.get()) {
                        this.O.set(false);
                        return;
                    }
                    Thread.sleep(com.join.mgps.data.c.f49010a);
                    if (MApplication.g() > 0 && this.Q.size() > 0) {
                        s1();
                    }
                }
                if (this.N) {
                    this.N = false;
                    w0.e("quark scan..end");
                    if (this.O.get()) {
                        this.O.set(false);
                        return;
                    }
                    try {
                        Thread.sleep(com.join.mgps.data.c.f49010a);
                        if (MApplication.g() <= 0 || this.Q.size() <= 0) {
                            return;
                        }
                        s1();
                        return;
                    } catch (Exception e6) {
                        e6.printStackTrace();
                        return;
                    }
                }
                int i4 = 1;
                this.N = true;
                w0.e("quark scan..start");
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<String> H = H(Environment.getExternalStorageDirectory() + "/Quark/Download");
                if (H != null && H.size() > 0) {
                    int i5 = 0;
                    while (i5 < H.size()) {
                        String str2 = H.get(i5);
                        String[] strArr = new String[i4];
                        strArr[c5] = str2;
                        w0.e(strArr);
                        try {
                            if (str2.endsWith(".zip")) {
                                IInArchive openInArchive = SevenZip.openInArchive(ArchiveFormat.ZIP, new RandomAccessFileInStream(new RandomAccessFile(str2, "r")));
                                ISimpleInArchive simpleInterface = openInArchive.getSimpleInterface();
                                ISimpleInArchiveItem[] archiveItems = simpleInterface.getArchiveItems();
                                int length = archiveItems.length;
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= length) {
                                        z4 = false;
                                        break;
                                    } else if (archiveItems[i6].getPath().toLowerCase().endsWith(".apk")) {
                                        z4 = true;
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                                if (z4) {
                                    ISimpleInArchiveItem[] archiveItems2 = simpleInterface.getArchiveItems();
                                    for (ISimpleInArchiveItem iSimpleInArchiveItem : archiveItems2) {
                                        if (!iSimpleInArchiveItem.isFolder() && iSimpleInArchiveItem.getPath().toLowerCase().endsWith(".apk")) {
                                            w0.e("extract start: ");
                                            File externalFilesDir = this.f54166n.getExternalFilesDir(".extract");
                                            if (!externalFilesDir.exists()) {
                                                externalFilesDir.mkdirs();
                                            }
                                            File file = new File(externalFilesDir, x0.d(str2) + ".apk");
                                            if (file.exists()) {
                                                file.delete();
                                            }
                                            ExtractOperationResult extractSlow = iSimpleInArchiveItem.extractSlow(new b(file));
                                            if (extractSlow == ExtractOperationResult.OK && (X3 = X(file.getAbsolutePath())) != null) {
                                                X3.path = str2;
                                                X3.setFileType(1);
                                                linkedHashMap.put(X3.pkg, X3);
                                            }
                                            w0.e("extract end: " + extractSlow);
                                            openInArchive.close();
                                            file.delete();
                                        }
                                    }
                                } else {
                                    ISimpleInArchiveItem[] archiveItems3 = simpleInterface.getArchiveItems();
                                    int length2 = archiveItems3.length;
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= length2) {
                                            str = "";
                                            break;
                                        }
                                        ISimpleInArchiveItem iSimpleInArchiveItem2 = archiveItems3[i7];
                                        if (iSimpleInArchiveItem2.isFolder()) {
                                            str = iSimpleInArchiveItem2.getPath();
                                            break;
                                        }
                                        i7++;
                                    }
                                    if (g2.i(str)) {
                                        String substring = str.substring(Math.max(str.lastIndexOf(net.lingala.zip4j.util.e.F0), 0));
                                        FileInfo fileInfo = new FileInfo();
                                        fileInfo.pkg = substring;
                                        fileInfo.path = str2;
                                        fileInfo.size = new File(str2).length();
                                        fileInfo.setFileType(3);
                                        linkedHashMap.put(fileInfo.pkg, fileInfo);
                                        try {
                                            w0.e(fileInfo + "");
                                        } catch (IOException e7) {
                                            e = e7;
                                            e.printStackTrace();
                                            i5++;
                                            c5 = 0;
                                            i4 = 1;
                                        }
                                    }
                                }
                            } else if (str2.endsWith(".apk") && (X2 = X(str2)) != null) {
                                X2.setFileType(2);
                                linkedHashMap.put(X2.pkg, X2);
                            }
                        } catch (IOException e8) {
                            e = e8;
                        }
                        i5++;
                        c5 = 0;
                        i4 = 1;
                    }
                }
                boolean z5 = false;
                for (final String str3 : linkedHashMap.keySet()) {
                    if (this.Q.containsKey(str3)) {
                        List<DownloadTask> H2 = p1.f.K().H(str3);
                        if (H2 != null && H2.size() > 0) {
                            this.Q.remove(str3);
                            this.P.remove(str3);
                            z5 |= true;
                        } else if (!this.P.containsKey(str3)) {
                            if (this.f54155c.isQuarkEnable().d().booleanValue()) {
                                this.f54155c.isQuarkEnable().g(Boolean.FALSE);
                            }
                            this.R.schedule(new Runnable() { // from class: com.join.mgps.service.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    CommonService.this.q0(linkedHashMap, str3);
                                }
                            }, 0L, TimeUnit.SECONDS);
                        }
                    }
                }
                if (z5) {
                    r1();
                }
                this.N = false;
                w0.e("quark scan..end");
                if (this.O.get()) {
                    this.O.set(false);
                    return;
                }
                Thread.sleep(com.join.mgps.data.c.f49010a);
                if (MApplication.g() > 0 && this.Q.size() > 0) {
                    s1();
                }
            } catch (Throwable th) {
                this.N = false;
                w0.e("quark scan..end");
                if (this.O.get()) {
                    this.O.set(false);
                    return;
                }
                try {
                    Thread.sleep(com.join.mgps.data.c.f49010a);
                    if (MApplication.g() > 0 && this.Q.size() > 0) {
                        s1();
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
                throw th;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    void t(String str, boolean z4, String str2) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                int uid = accountData != null ? accountData.getUid() : 0;
                String string = !TextUtils.isEmpty(MApplication.H) ? MApplication.H : Settings.System.getString(this.f54166n.getContentResolver(), "android_id");
                RequestAppDetialArgs requestAppDetialArgs = new RequestAppDetialArgs();
                requestAppDetialArgs.setDeviceid(string);
                requestAppDetialArgs.setVersion(com.join.android.app.common.utils.n.n(this.f54166n).y() + "_" + com.join.android.app.common.utils.n.n(this.f54166n).z());
                requestAppDetialArgs.setGame_id(str);
                requestAppDetialArgs.setUid(uid);
                requestAppDetialArgs.setToken(accountData.getToken());
                com.join.mgps.rpc.n.c(requestAppDetialArgs, new h(z4, str2, str, accountData));
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                r0("获取游戏信息失败");
                return;
            }
        }
        r0("请检查网络连接");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72012m})
    public void t0() {
        this.f54155c.apName().d().intValue();
        String apSSID = WifiUtils.getInstance(this).getApSSID();
        if (g2.i(apSSID) && apSSID.startsWith(com.join.mgps.data.c.f49025p)) {
            WifiUtils.getInstance(this).createWiFiAP(WifiUtils.getInstance(this).createAPInfo(apSSID, com.join.mgps.data.c.f49026q), false);
        }
        try {
            if (this.f54155c.isWifiConnectedBefore().d().booleanValue()) {
                WifiUtils.getInstance(this).OpenWifi();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c A[Catch: Exception -> 0x0091, TRY_LEAVE, TryCatch #0 {Exception -> 0x0091, blocks: (B:2:0x0000, B:4:0x0006, B:6:0x000c, B:9:0x0014, B:10:0x0022, B:12:0x0028, B:14:0x0038, B:15:0x003c, B:18:0x0043, B:32:0x007c, B:21:0x0052, B:24:0x005f, B:27:0x006c), top: B:38:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void t1(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L91
            if (r0 != 0) goto L90
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L91
            if (r0 != 0) goto L90
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L91
            if (r0 == 0) goto L14
            goto L90
        L14:
            java.lang.String r0 = ""
            p1.f r1 = p1.f.K()     // Catch: java.lang.Exception -> L91
            java.util.List r1 = r1.H(r5)     // Catch: java.lang.Exception -> L91
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L91
        L22:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L91
            com.github.snowdream.android.app.downloader.DownloadTask r2 = (com.github.snowdream.android.app.downloader.DownloadTask) r2     // Catch: java.lang.Exception -> L91
            java.lang.String r3 = r2.getPackageName()     // Catch: java.lang.Exception -> L91
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Exception -> L91
            if (r3 == 0) goto L22
            java.lang.String r0 = r2.getCrc_link_type_val()     // Catch: java.lang.Exception -> L91
        L3c:
            boolean r5 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L91
            if (r5 == 0) goto L43
            return
        L43:
            r5 = 0
            com.papa.sim.statistic.Event r1 = com.papa.sim.statistic.Event.smallGameStartSDK     // Catch: java.lang.Exception -> L91
            java.lang.String r2 = r1.name()     // Catch: java.lang.Exception -> L91
            boolean r2 = r6.equals(r2)     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L52
        L50:
            r5 = r1
            goto L79
        L52:
            com.papa.sim.statistic.Event r1 = com.papa.sim.statistic.Event.smallRequestAdSDK     // Catch: java.lang.Exception -> L91
            java.lang.String r2 = r1.name()     // Catch: java.lang.Exception -> L91
            boolean r2 = r6.equals(r2)     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L5f
            goto L50
        L5f:
            com.papa.sim.statistic.Event r1 = com.papa.sim.statistic.Event.smallExpAdSDK     // Catch: java.lang.Exception -> L91
            java.lang.String r2 = r1.name()     // Catch: java.lang.Exception -> L91
            boolean r2 = r6.equals(r2)     // Catch: java.lang.Exception -> L91
            if (r2 == 0) goto L6c
            goto L50
        L6c:
            com.papa.sim.statistic.Event r1 = com.papa.sim.statistic.Event.smallVideoDoneAdSDK     // Catch: java.lang.Exception -> L91
            java.lang.String r2 = r1.name()     // Catch: java.lang.Exception -> L91
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Exception -> L91
            if (r6 == 0) goto L79
            goto L50
        L79:
            if (r5 != 0) goto L7c
            return
        L7c:
            android.content.Context r6 = r4.f54166n     // Catch: java.lang.Exception -> L91
            com.join.mgps.Util.AccountUtil_ r6 = com.join.mgps.Util.AccountUtil_.getInstance_(r6)     // Catch: java.lang.Exception -> L91
            java.lang.String r6 = r6.getUid()     // Catch: java.lang.Exception -> L91
            android.content.Context r1 = r4.f54166n     // Catch: java.lang.Exception -> L91
            com.papa.sim.statistic.p r1 = com.papa.sim.statistic.p.l(r1)     // Catch: java.lang.Exception -> L91
            r1.q(r5, r0, r7, r6)     // Catch: java.lang.Exception -> L91
            goto L95
        L90:
            return
        L91:
            r5 = move-exception
            r5.printStackTrace()
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.service.CommonService.t1(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:222:0x063e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0081 A[SYNTHETIC] */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(java.util.List<java.lang.String> r14) {
        /*
            Method dump skipped, instructions count: 1673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.service.CommonService.u(java.util.List):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.U})
    public void u0(@Receiver.Extra String str, @Receiver.Extra String str2, @Receiver.Extra String str3, @Receiver.Extra String str4) {
        if (TextUtils.isEmpty(str) || !str.equals(getPackageName())) {
            return;
        }
        com.papa.sim.statistic.p.l(getApplicationContext()).A1(str2, str3, str4);
    }

    void u1(String str, String str2) {
        w0.e("sendBattleScoreToEmu", str2, "" + str);
        Intent intent = new Intent("com.emu.battle.score");
        intent.putExtra(CommonService_.a0.f54279g, str);
        intent.putExtra("battleScore", str2);
        sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void v(DownloadTask downloadTask) {
        String key;
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                int uid = accountData != null ? accountData.getUid() : 0;
                ResultMainBean<DownDeductCoinResponse> t12 = com.join.mgps.rpc.impl.d.P1().t1(RequestBeanUtil.getInstance(this).getDownDeductCoin(downloadTask.getCrc_link_type_val(), accountData.getToken(), uid, null));
                if (t12 != null && t12.getFlag() != 0) {
                    DownDeductCoinResponse data = t12.getMessages().getData();
                    if (data == null || (key = data.getKey()) == null) {
                        return;
                    }
                    String[] split = AESUtils.c(key).split("\\|");
                    String str = split.length > 0 ? split[0] : "";
                    String str2 = split.length > 1 ? split[1] : "";
                    String str3 = split.length > 2 ? split[2] : "";
                    int parseInt = split.length > 3 ? Integer.parseInt(split[3]) : 0;
                    if (g2.i(str2) && data.getNum().equals(str2) && g2.i(str)) {
                        if ((uid + "").equals(str) && str3.equals(downloadTask.getCrc_link_type_val())) {
                            if (parseInt == 0) {
                                ((NoticeTopAnimActivityDialog_.f) NoticeTopAnimActivityDialog_.n0(this.f54166n).flags(268435456)).b("铜板支付失败，请重试").c(parseInt).start();
                                return;
                            } else if (parseInt == 1) {
                                ((NoticeTopAnimActivityDialog_.f) NoticeTopAnimActivityDialog_.n0(this.f54166n).flags(268435456)).b("正在下载<strong>【" + downloadTask.getShowName() + "】</strong>花费<font color=#FFDD1C>" + downloadTask.getSp_tag_info().getCoin().getName() + "</font>").c(parseInt).start();
                                com.php25.PDownload.d.e(downloadTask, this.f54166n);
                                return;
                            } else if (parseInt == 2) {
                                com.php25.PDownload.d.e(downloadTask, this.f54166n);
                                return;
                            } else if (parseInt == 3) {
                                ((NoticeTopAnimActivityDialog_.f) NoticeTopAnimActivityDialog_.n0(this.f54166n).flags(268435456)).b("需要<font color=#F47500>" + downloadTask.getSp_tag_info().getCoin().getName() + "</font>").c(parseInt).a(data.getBalance()).start();
                                return;
                            } else if (parseInt != 6) {
                                return;
                            } else {
                                ((NoticeTopAnimActivityDialog_.f) NoticeTopAnimActivityDialog_.n0(this.f54166n).flags(268435456)).b("正在下载<strong>【" + downloadTask.getShowName() + "】</strong>花费<font color=#FFDD1C>" + downloadTask.getSp_tag_info().getCoin().getName() + "</font>").c(parseInt).start();
                                com.php25.PDownload.d.e(downloadTask, this.f54166n);
                                return;
                            }
                        }
                    }
                    ((NoticeTopAnimActivityDialog_.f) NoticeTopAnimActivityDialog_.n0(this.f54166n).b("铜板支付失败，请重试").flags(268435456)).c(0).start();
                    return;
                }
                ((NoticeTopAnimActivityDialog_.f) NoticeTopAnimActivityDialog_.n0(this.f54166n).b("铜板支付失败，请重试").flags(268435456)).c(0).start();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                ((NoticeTopAnimActivityDialog_.f) NoticeTopAnimActivityDialog_.n0(this.f54166n).b("铜板支付失败，请重试").flags(268435456)).c(0).start();
                return;
            }
        }
        r0("请检查网络连接");
    }

    void v1(String str, String str2, String str3, String str4) {
        w0.e("sendBattleScoreToSvr", str4, "" + str);
        if (!this.f54175w) {
            r();
            return;
        }
        try {
            ArenaRequest arenaRequest = new ArenaRequest(ArenaConstants.ArenaCommand.CMD_SEND_SCORE_BOARD);
            try {
                if (!TextUtils.isEmpty(str2)) {
                    arenaRequest.gameId = Long.parseLong(str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    arenaRequest.roomId = Integer.parseInt(str);
                }
                if (!TextUtils.isEmpty(str3)) {
                    arenaRequest.uid = Integer.parseInt(str3);
                }
            } catch (Exception unused) {
            }
            arenaRequest.battleScoreBoard = str4;
            this.f54174v.f(arenaRequest);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void x() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    @Receiver(actions = {"android.net.wifi.WIFI_STATE_CHANGED", "android.net.wifi.STATE_CHANGE", "android.net.conn.CONNECTIVITY_CHANGE", "android.net.wifi.SCAN_RESULTS"})
    public void x0(Intent intent) {
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) || action.equals("android.net.wifi.STATE_CHANGE") || action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            boolean j4 = com.join.android.app.common.utils.j.j(this.f54166n);
            StringBuilder sb = new StringBuilder();
            sb.append("网络状态：");
            sb.append(j4);
            if (com.join.android.app.common.utils.j.k(this.f54166n)) {
                if (!this.f54155c.isFightActivity().d().booleanValue()) {
                    this.f54155c.isWifiConnectedBefore().g(Boolean.TRUE);
                }
                this.B = true;
            } else {
                if (!this.f54155c.isFightActivity().d().booleanValue()) {
                    this.f54155c.isWifiConnectedBefore().g(Boolean.FALSE);
                }
                this.B = false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("wifi状态：");
            sb2.append(com.join.android.app.common.utils.j.k(this.f54166n));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("移动网络状态：");
            sb3.append(com.join.android.app.common.utils.j.i(this.f54166n));
            StringBuilder sb4 = new StringBuilder();
            sb4.append("网络连接类型：");
            sb4.append(com.join.android.app.common.utils.j.c(this.f54166n));
            v0.d("getEMUVersion", "net connect");
            if (j4 && !this.f54155c.plugHasUpdate().d().booleanValue()) {
                V();
            }
            if (j4) {
                w0.e("onConnectivityChanged");
                com.wufan.friend.chat.c.u().K();
            }
        }
        if (action.equals("android.net.wifi.SCAN_RESULTS")) {
            if (this.f54155c.isFightActivity().d().booleanValue()) {
                return;
            }
            this.f54155c.isWifiConnectedBefore().g(Boolean.TRUE);
        } else if (action.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("android.net.wifi.WIFI_STATE_CHANGED | ");
            sb5.append(intent.getIntExtra("wifi_state", -1));
            sb5.append(" | ");
            sb5.append(intent.getIntExtra("previous_wifi_state", -1));
            if (this.f54155c.isFightActivity().d().booleanValue()) {
                return;
            }
            if (intent.getIntExtra("wifi_state", -1) == 0 || intent.getIntExtra("wifi_state", -1) == 1) {
                this.f54155c.isWifiConnectedBefore().g(Boolean.FALSE);
            }
        } else if (!action.equals("android.net.wifi.STATE_CHANGE") || this.f54155c.isFightActivity().d().booleanValue()) {
        } else {
            this.f54155c.isWifiConnectedBefore().g(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void y(String str) {
    }

    public void y0(int i4, List<ControllerManager.c> list) {
        C0(i4, list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {BAction.ACTION_EMU_SHOW_HIDE})
    public void z(@Receiver.Extra String str, @Receiver.Extra boolean z4) {
        if (z4) {
            MApplication.f1497x.onActivityStarted(null);
        } else {
            MApplication.f1497x.onActivityStopped(null);
        }
    }

    void z0(DownloadScanEvent downloadScanEvent) {
        if (downloadScanEvent == null || TextUtils.isEmpty(downloadScanEvent.getPkg())) {
            return;
        }
        synchronized (this.Q) {
            if (downloadScanEvent.getStatus() == 1) {
                this.Q.remove(downloadScanEvent.getPkg());
                this.f54155c.quarkGameDownload().g(JsonMapper.getInstance().toJson(this.Q));
                r1();
                return;
            }
            if (this.O.get()) {
                this.O.set(false);
            }
            this.Q.put(downloadScanEvent.getPkg(), downloadScanEvent);
            r1();
            s1();
        }
    }

    void z1() {
        try {
            this.f54157e.putExtra("type", "1");
            this.f54157e.putExtra("msg", "登录成功");
            sendBroadcast(this.f54157e);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
