package com.join.mgps.fragment;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import app.mgsim.arena.ArenaConstants;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaRequestFactory;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.SocketError;
import app.mgsim.arena.SocketListener;
import com.MApplication;
import com.alipay.sdk.app.PayTask;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.component.album.MyAlbumActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.StartGameMeta;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.h2;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.x1;
import com.join.mgps.activity.PayNowActivity_;
import com.join.mgps.activity.SearchHintActivity_;
import com.join.mgps.activity.SearchLabelActivity_;
import com.join.mgps.activity.arena.GameRoomActivity;
import com.join.mgps.activity.arena.NewArenaDownloadActivity_;
import com.join.mgps.activity.label.MainLabelActivity_;
import com.join.mgps.activity.posting.PostingActivity;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.adapter.FullScreenActivity_;
import com.join.mgps.customview.LJNestScrollWebView;
import com.join.mgps.customview.input.InputNumView;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.db.tables.H5GameAccountDataTable;
import com.join.mgps.dialog.y1;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CreateVipData;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GroupInfoBean;
import com.join.mgps.dto.LiveUploadData;
import com.join.mgps.dto.NetBattleStartGameDto;
import com.join.mgps.dto.PaOpenBean;
import com.join.mgps.dto.PapayOrder;
import com.join.mgps.dto.PapayResult;
import com.join.mgps.dto.PayResult;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.dto.TipNew;
import com.join.mgps.dto.VipMoneyRequest;
import com.join.mgps.dto.WebAccountDataBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.fragment.CommonWebviewFragment;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.socket.fight.arena.b;
import com.mgsim.common.fragment.BackHandledFragment;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.bean.ButtonBean;
import com.papa91.arc.common.constants.BAction;
import com.papa91.battle.protocol.BattleArea;
import com.papa91.battle.protocol.GameRoom;
import com.papa91.battle.protocol.RoomCategory;
import com.papa91.battle.protocol.RoomPosition;
import com.papa91.wrapper.UserPrefs;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.commonsdk.UMConfigure;
import com.wufan.user.service.protobuf.b0;
import com.wufan.user.service.protobuf.k;
import com.wufan.user.service.protobuf.n0;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import net.bither.util.b;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_common_webview)
/* loaded from: classes.dex */
public class CommonWebviewFragment extends Fragment implements LJNestScrollWebView.b, h2.e {
    public static final int E1 = 1;
    public static final int F1 = 2;
    public static final int G1 = 5000;
    public static final int H1 = 5001;
    public static final int I1 = 5002;
    public static final int J1 = 5003;
    private static final int K1 = 2;
    private static final int L1 = 4112;
    private static final int M1 = 100;
    private static final int N1 = 200;
    private static final int O1 = 10;
    Dialog A;
    private BackHandledFragment C1;
    private boolean D1;
    private com.join.mgps.socket.fight.arena.b G;
    private String H;
    @Bean
    com.join.mgps.Util.b I;
    private int K;
    private int L;
    private int M;
    private int N;
    private GameRoom P;
    private com.join.mgps.dialog.b1 Q;
    private com.join.mgps.dialog.d1 R;
    private Dialog U;
    private Uri V;
    private Uri W;
    private h2 Y;
    Iterator<String> Z;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f50472e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f50473f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f50474g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    RelativeLayout f50475h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LJNestScrollWebView f50476i;

    /* renamed from: j  reason: collision with root package name */
    com.join.mgps.rpc.e f50477j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.rpc.b f50478k;

    /* renamed from: l  reason: collision with root package name */
    com.join.mgps.rpc.c f50479l;

    /* renamed from: m  reason: collision with root package name */
    String f50480m;

    /* renamed from: n  reason: collision with root package name */
    private long f50481n;

    /* renamed from: o  reason: collision with root package name */
    private Context f50482o;

    /* renamed from: q  reason: collision with root package name */
    private View f50486q;

    /* renamed from: r  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f50487r;
    @Pref

    /* renamed from: t  reason: collision with root package name */
    PrefDef_ f50489t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f50490u;

    /* renamed from: v  reason: collision with root package name */
    private com.join.mgps.dialog.g0 f50491v;

    /* renamed from: w  reason: collision with root package name */
    private y1 f50493w;

    /* renamed from: x  reason: collision with root package name */
    private WebChromeClient f50494x;

    /* renamed from: b  reason: collision with root package name */
    String f50469b = "ShareWebActivity";

    /* renamed from: c  reason: collision with root package name */
    private String f50470c = "PAPA_EMU_INTENT_EXTRA_ACTION_FROM";

    /* renamed from: d  reason: collision with root package name */
    private Handler f50471d = new Handler();

    /* renamed from: p  reason: collision with root package name */
    private boolean f50483p = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f50488s = false;

    /* renamed from: y  reason: collision with root package name */
    private boolean f50495y = false;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.dialog.d1 f50496z = null;
    AlertDialog.Builder B = null;
    private final PostingActivity.m C = new e();
    @SuppressLint({"HandlerLeak"})
    private Handler D = new g();
    boolean E = false;
    long F = 0;
    private final SocketListener.NotifyObserver J = new j();
    private int O = -1;
    boolean S = false;
    boolean T = false;
    private boolean X = false;

    /* renamed from: p0  reason: collision with root package name */
    private boolean f50484p0 = false;

    /* renamed from: p1  reason: collision with root package name */
    private List<String> f50485p1 = new ArrayList();

    /* renamed from: v1  reason: collision with root package name */
    List<String> f50492v1 = new ArrayList();
    private b.e A1 = new c();
    private List<String> B1 = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommonWebviewFragment.this.N0(200);
            CommonWebviewFragment.this.U.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommonWebviewFragment.this.U.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    class c implements b.e {
        c() {
        }

        private void b(List<String> list) {
            if (list == null || list.size() <= 0) {
                return;
            }
            com.join.mgps.Util.v0.d("uploadData", "  togglePostSubmit " + list.size());
            CommonWebviewFragment.this.B1.clear();
            CommonWebviewFragment.this.B1.addAll(list);
            CommonWebviewFragment.this.G0();
            CommonWebviewFragment.this.n1();
            CommonWebviewFragment.this.f50484p0 = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00a2 A[SYNTHETIC] */
        @Override // net.bither.util.b.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.lang.Boolean r9, java.util.Map<java.lang.String, java.lang.String> r10, java.util.Map<java.lang.String, java.lang.Integer> r11) {
            /*
                r8 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r9)
                java.lang.String r1 = "   "
                r0.append(r1)
                int r1 = r10.size()
                r0.append(r1)
                java.lang.String r1 = "  "
                r0.append(r1)
                int r1 = r11.size()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "uploadData"
                com.join.mgps.Util.v0.d(r1, r0)
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto La9
                com.join.mgps.fragment.CommonWebviewFragment r9 = com.join.mgps.fragment.CommonWebviewFragment.this
                java.util.List<java.lang.String> r9 = r9.f50492v1
                if (r9 == 0) goto La9
                int r9 = r9.size()
                if (r9 == 0) goto La9
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                r0 = 0
                r1 = 0
            L43:
                com.join.mgps.fragment.CommonWebviewFragment r2 = com.join.mgps.fragment.CommonWebviewFragment.this
                java.util.List<java.lang.String> r2 = r2.f50492v1
                int r2 = r2.size()
                if (r1 >= r2) goto La5
                com.join.mgps.fragment.CommonWebviewFragment r2 = com.join.mgps.fragment.CommonWebviewFragment.this
                java.util.List<java.lang.String> r2 = r2.f50492v1
                java.lang.Object r2 = r2.get(r1)
                java.lang.String r2 = (java.lang.String) r2
                java.util.Set r3 = r11.keySet()
                r4 = 1
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L81
                r5 = 0
            L61:
                boolean r6 = r3.hasNext()     // Catch: java.lang.Exception -> L7f
                if (r6 == 0) goto L86
                java.lang.Object r6 = r3.next()     // Catch: java.lang.Exception -> L7f
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L7f
                java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> L7f
                r7.<init>(r6)     // Catch: java.lang.Exception -> L7f
                java.lang.String r7 = r7.getName()     // Catch: java.lang.Exception -> L7f
                boolean r7 = r2.contains(r7)     // Catch: java.lang.Exception -> L7f
                if (r7 == 0) goto L61
                r2 = r6
                r5 = 1
                goto L61
            L7f:
                r3 = move-exception
                goto L83
            L81:
                r3 = move-exception
                r5 = 0
            L83:
                r3.printStackTrace()
            L86:
                if (r5 != 0) goto L97
                java.lang.Object r3 = r11.get(r2)     // Catch: java.lang.Exception -> L93
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L93
                int r5 = r3.intValue()     // Catch: java.lang.Exception -> L93
                goto L97
            L93:
                r3 = move-exception
                r3.printStackTrace()
            L97:
                java.lang.Object r2 = r10.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r5 != r4) goto La2
                r9.add(r2)
            La2:
                int r1 = r1 + 1
                goto L43
            La5:
                r8.b(r9)
                goto Lad
            La9:
                r9 = 0
                r8.b(r9)
            Lad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.fragment.CommonWebviewFragment.c.a(java.lang.Boolean, java.util.Map, java.util.Map):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements View.OnKeyListener {
        d() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            com.join.mgps.Util.v0.b(CommonWebviewFragment.this.f50469b, "onKeyDown() called.");
            if (i4 == 4 && keyEvent.getRepeatCount() == 0) {
                if (CommonWebviewFragment.this.inCustomView()) {
                    CommonWebviewFragment.this.f50494x.onHideCustomView();
                    return true;
                }
                if (CommonWebviewFragment.this.f50480m.contains("?")) {
                    CommonWebviewFragment commonWebviewFragment = CommonWebviewFragment.this;
                    String str = commonWebviewFragment.f50480m;
                    commonWebviewFragment.f50480m = str.substring(0, str.lastIndexOf("?"));
                }
                WebView webView = CommonWebviewFragment.this.f50476i.getWebView();
                if (webView != null && com.join.android.app.common.utils.j.j(CommonWebviewFragment.this.getContext())) {
                    webView.loadUrl("javascript:papaBackPageUp()");
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    class e implements PostingActivity.m {
        e() {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void a(int i4) {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void b(int i4) {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void c(GroupInfoBean groupInfoBean) {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void d(int i4) {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void e(int i4) {
            if (i4 == 4355 && CommonWebviewFragment.this.f50493w != null) {
                CommonWebviewFragment.this.f50493w.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements LJNestScrollWebView.c {
        f() {
        }

        @Override // com.join.mgps.customview.LJNestScrollWebView.c
        public void a() {
            CommonWebviewFragment.this.a1();
        }
    }

    /* loaded from: classes3.dex */
    class g extends Handler {
        g() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 2) {
                return;
            }
            PayResult payResult = new PayResult((String) message.obj);
            payResult.getResult();
            String resultStatus = payResult.getResultStatus();
            if (TextUtils.equals(resultStatus, "9000")) {
                Toast.makeText(CommonWebviewFragment.this.f50482o, "支付成功", 1);
            } else if (TextUtils.equals(resultStatus, "8000")) {
                Toast.makeText(CommonWebviewFragment.this.f50482o, "支付结果确认中", 0).show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f50504b;

        h(String str) {
            this.f50504b = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                String pay = new PayTask(CommonWebviewFragment.this.getActivity()).pay(com.join.mgps.Util.w.a(this.f50504b), true);
                Message message = new Message();
                message.what = 2;
                message.obj = pay;
                CommonWebviewFragment.this.D.sendMessage(message);
            } catch (Exception e5) {
                e5.printStackTrace();
                Message message2 = new Message();
                message2.what = 3;
                CommonWebviewFragment.this.D.sendMessage(message2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class i extends b.c {
        i() {
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void c() {
            super.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class j implements SocketListener.NotifyObserver {
        j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(NetBattleStartGameDto netBattleStartGameDto, DownloadTask downloadTask) {
            UtilsMy.P3(CommonWebviewFragment.this.f50482o, netBattleStartGameDto, downloadTask, null, com.join.mgps.socket.fight.arena.c.i(CommonWebviewFragment.this.P.getBattleArea(), false));
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onError(SocketError socketError) {
            CommonWebviewFragment.this.Z0(socketError);
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onServerResponse(ArenaResponse arenaResponse) {
            int elite;
            ArenaRequest arenaRequest = arenaResponse.request;
            if (arenaRequest != null) {
                String str = arenaRequest.register_type;
                if (str == ArenaConstants.REGISTER_TYPE_ARENAMAIN || str == ArenaConstants.REGISTER_TYPE_PUBLIC) {
                    if (arenaResponse.responseCode == 0) {
                        CommonWebviewFragment.this.S0(arenaResponse);
                    } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_LOGIN)) {
                        if (TextUtils.isEmpty(CommonWebviewFragment.this.H)) {
                            return;
                        }
                        CommonWebviewFragment commonWebviewFragment = CommonWebviewFragment.this;
                        commonWebviewFragment.J0(commonWebviewFragment.H);
                    } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SEARCH_ROOM_BY_ID)) {
                        CommonWebviewFragment.this.T0((GameRoom) arenaResponse.data);
                    } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_JOIN_ROOM)) {
                        CommonWebviewFragment.this.A0();
                        GameRoom gameRoom = (GameRoom) arenaResponse.data;
                        CommonWebviewFragment.this.G.d().E(null);
                        p1.f K = p1.f.K();
                        final DownloadTask F = K.F("" + gameRoom.getGameId());
                        CommonWebviewFragment.this.H0();
                        CommonWebviewFragment.this.W0();
                        int i4 = CommonWebviewFragment.this.K + CommonWebviewFragment.this.L + CommonWebviewFragment.this.M + CommonWebviewFragment.this.N;
                        final NetBattleStartGameDto netBattleStartGameDto = new NetBattleStartGameDto();
                        netBattleStartGameDto.setGameID(CommonWebviewFragment.this.P.getGameId() + "");
                        netBattleStartGameDto.setRoomID(gameRoom.getBattleServerAddr().getBattleRoomId() + "");
                        netBattleStartGameDto.setUserID(CommonWebviewFragment.this.f50487r.getUid() + "");
                        netBattleStartGameDto.setServerIP(gameRoom.getBattleServerAddr().getHost());
                        netBattleStartGameDto.setServerPort(gameRoom.getBattleServerAddr().getPort());
                        if (gameRoom.getRoomCategory() == RoomCategory.LIVE) {
                            elite = 3;
                        } else {
                            elite = gameRoom.getRoomCategory() == RoomCategory.TOURNAMENT ? 2 : CommonWebviewFragment.this.P.getElite();
                        }
                        netBattleStartGameDto.setRoomMode(elite);
                        netBattleStartGameDto.setAllowPeripheralJoin(CommonWebviewFragment.this.P.getAllowPeripheralJoin());
                        netBattleStartGameDto.setAllowPCJoin(CommonWebviewFragment.this.P.getAllowPCJoin());
                        netBattleStartGameDto.setGameype(CommonWebviewFragment.this.P.getGameType().getNumber());
                        netBattleStartGameDto.setGroupId(CommonWebviewFragment.this.P.getRoomId());
                        netBattleStartGameDto.setP1Name("");
                        netBattleStartGameDto.setP2Name("");
                        netBattleStartGameDto.setOldGame(0);
                        netBattleStartGameDto.setUserName(CommonWebviewFragment.this.f50487r.getNickname());
                        netBattleStartGameDto.setUserIcon(CommonWebviewFragment.this.f50487r.d0());
                        netBattleStartGameDto.setGamePlayers(CommonWebviewFragment.this.P.getSeatsNumber());
                        netBattleStartGameDto.setTcptype(1);
                        netBattleStartGameDto.setPorder(CommonWebviewFragment.this.O);
                        netBattleStartGameDto.setNetPlayers(i4);
                        if (!CommonWebviewFragment.this.P.getElite()) {
                            netBattleStartGameDto.setOpenBattleScore(CommonWebviewFragment.this.P.getOpenBattleScore());
                        }
                        CommonWebviewFragment.this.G.f(ArenaRequestFactory.startLobbyGame(ArenaConstants.REGISTER_TYPE_GAMEROOM, CommonWebviewFragment.this.P.getRoomId()));
                        if (CommonWebviewFragment.this.P != null && CommonWebviewFragment.this.P.getRoomId() != 0) {
                            com.wufan.friend.chat.c.u().i(0, CommonWebviewFragment.this.P.getRoomId());
                        }
                        CommonWebviewFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.join.mgps.fragment.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                CommonWebviewFragment.j.this.b(netBattleStartGameDto, F);
                            }
                        });
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class k implements InputNumView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.input.a f50508a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f50509b;

        k(com.join.mgps.customview.input.a aVar, GameRoom gameRoom) {
            this.f50508a = aVar;
            this.f50509b = gameRoom;
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void a(String str) {
            this.f50508a.c();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            CommonWebviewFragment.this.e1("正在获取房间...");
            CommonWebviewFragment.this.I0(this.f50509b, str);
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void hide() {
            this.f50508a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommonWebviewFragment.this.N0(100);
            CommonWebviewFragment.this.U.dismiss();
        }
    }

    /* loaded from: classes3.dex */
    public class m {

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f50513b;

            a(boolean z4) {
                this.f50513b = z4;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean g4 = com.join.android.app.common.utils.g.g(CommonWebviewFragment.this.f50489t.lastCheckInTime().d().longValue());
                if (this.f50513b) {
                    if (g4) {
                        return;
                    }
                    CommonWebviewFragment.this.f50489t.lastCheckInTime().g(Long.valueOf(System.currentTimeMillis()));
                } else if (g4) {
                    CommonWebviewFragment.this.f50489t.lastCheckInTime().g(0L);
                }
            }
        }

        /* loaded from: classes3.dex */
        class a0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50515b;

            a0(String str) {
                this.f50515b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    IntentUtil.getInstance().goQQGroup(CommonWebviewFragment.this.f50482o, this.f50515b);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes3.dex */
        class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50517b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f50518c;

            b(String str, String str2) {
                this.f50517b = str;
                this.f50518c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                videoInfo.m(this.f50517b);
                videoInfo.h(this.f50518c);
                FullScreenActivity_.i0(CommonWebviewFragment.this.f50482o).a(videoInfo).start();
            }
        }

        /* loaded from: classes3.dex */
        class b0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50520b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f50521c;

            b0(String str, String str2) {
                this.f50520b = str;
                this.f50521c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.papa.sim.statistic.p.l(CommonWebviewFragment.this.f50482o).p(this.f50520b, this.f50521c, AccountUtil_.getInstance_(CommonWebviewFragment.this.f50482o).getUid());
            }
        }

        /* loaded from: classes3.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebviewFragment.this.f50488s = true;
                IntentUtil.getInstance().goAccountUpgradeActivity(CommonWebviewFragment.this.f50482o);
            }
        }

        /* loaded from: classes3.dex */
        class c0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50524b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f50525c;

            c0(String str, String str2) {
                this.f50524b = str;
                this.f50525c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z4;
                try {
                    List<DownloadTask> I = p1.f.K().I(this.f50524b);
                    DownloadTask downloadTask = null;
                    if (I != null && I.size() > 0) {
                        String str = "";
                        String str2 = "";
                        boolean z5 = false;
                        loop0: while (true) {
                            z4 = false;
                            for (DownloadTask downloadTask2 : I) {
                                if (Dtype.MOD.name().equals(downloadTask2.getFileType())) {
                                    str = downloadTask2.getCrc_link_type_val();
                                    z5 = com.join.mgps.va.overmind.d.o().F(downloadTask2.getPackageName()) && downloadTask2.getStatus() == 5;
                                } else {
                                    str2 = downloadTask2.getCrc_link_type_val();
                                    if (com.join.android.app.common.utils.e.l0(CommonWebviewFragment.this.getContext()).d(CommonWebviewFragment.this.getContext(), downloadTask2.getPackageName()) && downloadTask2.getStatus() == 5) {
                                        z4 = true;
                                    }
                                }
                            }
                            break loop0;
                        }
                        if (z5 && z4) {
                            downloadTask = p1.f.K().F(str);
                        } else if (z5) {
                            downloadTask = p1.f.K().F(str);
                        } else if (z4) {
                            downloadTask = p1.f.K().F(str2);
                        } else {
                            downloadTask = p1.f.K().F(str);
                            if (downloadTask == null) {
                                downloadTask = p1.f.K().F(str2);
                            }
                        }
                    }
                    if (downloadTask == null) {
                        return;
                    }
                    if ("login".equals(this.f50525c)) {
                        UtilsMy.W3(CommonWebviewFragment.this.getContext(), downloadTask, this.f50525c);
                    } else {
                        UtilsMy.T3(CommonWebviewFragment.this.getContext(), downloadTask);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes3.dex */
        class d implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50527b;

            d(String str) {
                this.f50527b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    CommonWebviewFragment.this.f50482o.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + this.f50527b + "&version=1")));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes3.dex */
        class d0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50529b;

            d0(String str) {
                this.f50529b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    IntentDateBean intentDateBean = (IntentDateBean) JsonMapper.getInstance().fromJson(this.f50529b, IntentDateBean.class);
                    intentDateBean.setExtBean(new ExtBean(120));
                    if (intentDateBean.getObject() != null && (intentDateBean.getObject() instanceof Map)) {
                        HashMap hashMap = (HashMap) intentDateBean.getObject();
                        if (hashMap.containsKey("from") && hashMap.get("from") != null && (hashMap.get("from") instanceof Integer)) {
                            intentDateBean.setExtBean(new ExtBean(((Integer) hashMap.get("from")).intValue()));
                        }
                    }
                    IntentUtil.getInstance().intentActivity(CommonWebviewFragment.this.getContext(), intentDateBean);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes3.dex */
        class e implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f50531b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f50532c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f50533d;

            e(int i4, String str, int i5) {
                this.f50531b = i4;
                this.f50532c = str;
                this.f50533d = i5;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.join.mgps.Util.s.q(CommonWebviewFragment.this.f50482o, this.f50531b, this.f50532c, this.f50533d, 5);
            }
        }

        /* loaded from: classes3.dex */
        class e0 implements Runnable {
            e0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                WebAccountDataBean webAccountDataBean = new WebAccountDataBean();
                CommonWebviewFragment commonWebviewFragment = CommonWebviewFragment.this;
                commonWebviewFragment.f50487r = AccountUtil_.getInstance_(commonWebviewFragment.f50482o).getAccountData();
                webAccountDataBean.setAccountBean(AccountBean.convert(CommonWebviewFragment.this.f50487r));
                if (CommonWebviewFragment.this.f50487r == null) {
                    CommonWebviewFragment.this.f50488s = true;
                    IntentUtil.getInstance().goMyAccountLoginActivity(CommonWebviewFragment.this.f50482o, 0, 2);
                    return;
                }
                webAccountDataBean.setHasLogin(true);
                LJNestScrollWebView lJNestScrollWebView = CommonWebviewFragment.this.f50476i;
                lJNestScrollWebView.w("javascript:papaPutAccountData(" + JsonMapper.getInstance().toJson(webAccountDataBean) + ")");
            }
        }

        /* loaded from: classes3.dex */
        class f implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50536b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f50537c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f50538d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f50539e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f50540f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f50541g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String f50542h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f50543i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ String f50544j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ String f50545k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ String f50546l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ String f50547m;

            f(String str, int i4, String str2, String str3, String str4, int i5, String str5, String str6, String str7, String str8, String str9, String str10) {
                this.f50536b = str;
                this.f50537c = i4;
                this.f50538d = str2;
                this.f50539e = str3;
                this.f50540f = str4;
                this.f50541g = i5;
                this.f50542h = str5;
                this.f50543i = str6;
                this.f50544j = str7;
                this.f50545k = str8;
                this.f50546l = str9;
                this.f50547m = str10;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    PapayOrder papayOrder = new PapayOrder();
                    papayOrder.APPKEY = this.f50536b;
                    papayOrder.PAYTYPE = this.f50537c;
                    papayOrder.NOTIFY_URI = this.f50538d;
                    papayOrder.APP_NAME = this.f50539e;
                    papayOrder.APP_ORDER_ID = this.f50540f;
                    papayOrder.PA_OPEN_UID = this.f50541g;
                    papayOrder.APP_USER_ID = this.f50542h;
                    papayOrder.APP_USER_NAME = "";
                    papayOrder.PRODUCT_ID = this.f50543i;
                    papayOrder.PRODUCT_NAME = this.f50544j;
                    papayOrder.MONEY_AMOUNT = this.f50545k;
                    papayOrder.APP_DISTRICT = 1;
                    papayOrder.APP_SERVER = 1;
                    papayOrder.APP_EXT1 = this.f50546l;
                    papayOrder.APP_EXT2 = this.f50547m;
                    papayOrder.PAYORRECHARGE = 1;
                    CommonWebviewFragment.this.j1(papayOrder);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes3.dex */
        class f0 implements Runnable {
            f0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                WebAccountDataBean webAccountDataBean = new WebAccountDataBean();
                CommonWebviewFragment commonWebviewFragment = CommonWebviewFragment.this;
                commonWebviewFragment.f50487r = AccountUtil_.getInstance_(commonWebviewFragment.f50482o).getAccountData();
                webAccountDataBean.setAccountBean(AccountBean.convert(CommonWebviewFragment.this.f50487r));
                AccountUtil_.getInstance_(CommonWebviewFragment.this.f50482o).accountLoginOut(CommonWebviewFragment.this.f50482o);
                CommonWebviewFragment.this.f50488s = true;
                IntentUtil.getInstance().goMyAccountLoginActivity(CommonWebviewFragment.this.f50482o, 0, 2);
            }
        }

        /* loaded from: classes3.dex */
        class g implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50550b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f50551c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f50552d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f50553e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f50554f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ String f50555g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String f50556h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f50557i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ String f50558j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ String f50559k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ String f50560l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ String f50561m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ String f50562n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ String f50563o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ String f50564p;

            g(String str, int i4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
                this.f50550b = str;
                this.f50551c = i4;
                this.f50552d = str2;
                this.f50553e = str3;
                this.f50554f = str4;
                this.f50555g = str5;
                this.f50556h = str6;
                this.f50557i = str7;
                this.f50558j = str8;
                this.f50559k = str9;
                this.f50560l = str10;
                this.f50561m = str11;
                this.f50562n = str12;
                this.f50563o = str13;
                this.f50564p = str14;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    PapayOrder papayOrder = new PapayOrder();
                    papayOrder.APPKEY = this.f50550b;
                    papayOrder.PAYTYPE = this.f50551c;
                    papayOrder.NOTIFY_URI = this.f50552d;
                    papayOrder.APP_NAME = this.f50553e;
                    papayOrder.APP_ORDER_ID = this.f50554f;
                    if (g2.i(this.f50555g)) {
                        papayOrder.PA_OPEN_UID = Integer.parseInt(this.f50555g);
                    }
                    papayOrder.APP_USER_ID = this.f50556h;
                    papayOrder.APP_USER_NAME = this.f50553e;
                    papayOrder.PRODUCT_ID = this.f50557i;
                    papayOrder.PRODUCT_NAME = this.f50558j;
                    papayOrder.MONEY_AMOUNT = this.f50559k;
                    papayOrder.APP_DISTRICT = 1;
                    papayOrder.APP_SERVER = 1;
                    papayOrder.APP_EXT1 = this.f50560l;
                    papayOrder.APP_EXT2 = this.f50561m;
                    papayOrder.PAYORRECHARGE = 1;
                    papayOrder.PRIVATEKEY = this.f50562n;
                    papayOrder.TOKEN = this.f50563o;
                    if (g2.i(this.f50564p)) {
                        papayOrder.PAYSHOWTYPE = Integer.parseInt(this.f50564p);
                    }
                    CommonWebviewFragment.this.j1(papayOrder);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes3.dex */
        class g0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50566b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f50567c;

            g0(String str, int i4) {
                this.f50566b = str;
                this.f50567c = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                ShareBean shareBean = (ShareBean) JsonMapper.getInstance().fromJson(this.f50566b, ShareBean.class);
                shareBean.setFrom(5);
                com.join.mgps.Util.s.p(CommonWebviewFragment.this.f50482o, this.f50567c, shareBean);
            }
        }

        /* loaded from: classes3.dex */
        class h implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f50569b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f50570c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f50571d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f50572e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f50573f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ String f50574g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String f50575h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f50576i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ String f50577j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ String f50578k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ String f50579l;

            h(int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
                this.f50569b = i4;
                this.f50570c = str;
                this.f50571d = str2;
                this.f50572e = str3;
                this.f50573f = str4;
                this.f50574g = str5;
                this.f50575h = str6;
                this.f50576i = str7;
                this.f50577j = str8;
                this.f50578k = str9;
                this.f50579l = str10;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    PapayOrder papayOrder = new PapayOrder();
                    papayOrder.APPKEY = "qh97";
                    papayOrder.PAYTYPE = this.f50569b;
                    papayOrder.NOTIFY_URI = this.f50570c;
                    papayOrder.APP_NAME = this.f50571d;
                    papayOrder.APP_ORDER_ID = this.f50572e;
                    if (g2.i(this.f50573f)) {
                        papayOrder.PA_OPEN_UID = Integer.parseInt(this.f50573f);
                    }
                    papayOrder.APP_USER_ID = this.f50574g;
                    papayOrder.APP_USER_NAME = this.f50571d;
                    papayOrder.PRODUCT_ID = this.f50575h;
                    papayOrder.PRODUCT_NAME = this.f50576i;
                    papayOrder.MONEY_AMOUNT = this.f50577j;
                    papayOrder.APP_DISTRICT = 1;
                    papayOrder.APP_SERVER = 1;
                    papayOrder.APP_EXT1 = this.f50578k;
                    papayOrder.APP_EXT2 = this.f50579l;
                    papayOrder.PAYORRECHARGE = 2;
                    CommonWebviewFragment.this.j1(papayOrder);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes3.dex */
        class h0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50581b;

            h0(String str) {
                this.f50581b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if ("".equals(this.f50581b)) {
                    return;
                }
                CommonWebviewFragment.this.f50476i.w(this.f50581b);
            }
        }

        /* loaded from: classes3.dex */
        class i implements Runnable {
            i() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IntentUtil.getInstance().goAccountCenterActivity(CommonWebviewFragment.this.f50482o);
            }
        }

        /* loaded from: classes3.dex */
        class j implements Runnable {
            j() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IntentUtil.getInstance().goJoystickManager(CommonWebviewFragment.this.f50482o);
            }
        }

        /* loaded from: classes3.dex */
        class k implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50585b;

            k(String str) {
                this.f50585b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.join.mgps.Util.s.s(CommonWebviewFragment.this.getContext(), this.f50585b, 5);
            }
        }

        /* loaded from: classes3.dex */
        class l implements Runnable {
            l() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IntentUtil.getInstance().goCodesBoxActivity(CommonWebviewFragment.this.f50482o);
            }
        }

        /* renamed from: com.join.mgps.fragment.CommonWebviewFragment$m$m  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class RunnableC0366m implements Runnable {
            RunnableC0366m() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IntentUtil.getInstance().goDownloadCenterActivity(CommonWebviewFragment.this.f50482o);
            }
        }

        /* loaded from: classes3.dex */
        class n implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50589b;

            n(String str) {
                this.f50589b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                l2.a(CommonWebviewFragment.this.f50482o).b(this.f50589b);
            }
        }

        /* loaded from: classes3.dex */
        class o implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f50591b;

            o(int i4) {
                this.f50591b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    CommonWebviewFragment.this.f50496z.b();
                    CommonWebviewFragment.this.F0(this.f50591b);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes3.dex */
        class p implements Runnable {
            p() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebviewFragment.this.U0();
            }
        }

        /* loaded from: classes3.dex */
        class q implements Runnable {
            q() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IntentUtil.getInstance().goMYAccountDetialActivity(CommonWebviewFragment.this.f50482o);
            }
        }

        /* loaded from: classes3.dex */
        class r implements Runnable {
            r() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IntentUtil.getInstance().goForumProfileMessageActivity(CommonWebviewFragment.this.f50482o);
            }
        }

        /* loaded from: classes3.dex */
        class s implements Runnable {
            s() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebviewFragment.this.O0();
            }
        }

        /* loaded from: classes3.dex */
        class t implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50597b;

            t(String str) {
                this.f50597b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebviewFragment.this.P0(this.f50597b);
            }
        }

        /* loaded from: classes3.dex */
        class u implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50599b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f50600c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f50601d;

            u(String str, String str2, String str3) {
                this.f50599b = str;
                this.f50600c = str2;
                this.f50601d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebviewFragment.this.Q0(this.f50599b, this.f50600c, this.f50601d);
            }
        }

        /* loaded from: classes3.dex */
        class v implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50603b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f50604c;

            v(String str, String str2) {
                this.f50603b = str;
                this.f50604c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.papa.sim.statistic.p.l(CommonWebviewFragment.this.f50482o).p(this.f50603b, this.f50604c, AccountUtil_.getInstance_(CommonWebviewFragment.this.f50482o).getUid());
            }
        }

        /* loaded from: classes3.dex */
        class w implements Runnable {
            w() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebviewFragment.this.R0();
            }
        }

        /* loaded from: classes3.dex */
        class x implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50607b;

            x(String str) {
                this.f50607b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (g2.h(this.f50607b)) {
                        return;
                    }
                    StartGameMeta startGameMeta = (StartGameMeta) JsonMapper.getInstance().fromJson(this.f50607b, StartGameMeta.class);
                    Intent intent = new Intent();
                    intent.addFlags(8388608);
                    intent.setComponent(new ComponentName(startGameMeta.getPackageName(), startGameMeta.getActivityName()));
                    String uid = AccountUtil_.getInstance_(CommonWebviewFragment.this.f50482o).getUid();
                    intent.putExtra("uid", uid);
                    startGameMeta.setUserID(uid);
                    startGameMeta.setPa_package_name(CommonWebviewFragment.this.f50482o.getPackageName());
                    intent.putExtra("jsonData", JsonMapper.getInstance().toJson(startGameMeta));
                    intent.setAction("android.intent.action.VIEW");
                    try {
                        CommonWebviewFragment.this.f50482o.startActivity(intent);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        }

        /* loaded from: classes3.dex */
        class y implements Runnable {
            y() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CommonWebviewFragment.this.setFullScreen();
            }
        }

        /* loaded from: classes3.dex */
        class z implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f50610b;

            /* loaded from: classes3.dex */
            class a implements GameRoomActivity.x {
                a() {
                }

                @Override // com.join.mgps.activity.arena.GameRoomActivity.x
                public void onFail(int i4) {
                }

                @Override // com.join.mgps.activity.arena.GameRoomActivity.x
                public void onSuccess(int i4, int i5) {
                    z zVar = z.this;
                    CommonWebviewFragment.this.Y0(zVar.f50610b);
                }

                @Override // com.join.mgps.activity.arena.GameRoomActivity.x
                public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
                }
            }

            z(String str) {
                this.f50610b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    UtilsMy.z0(CommonWebviewFragment.this.f50482o, 4, "", "FIGHT_LOBBY", new a());
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        public m() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit d(String str) {
            com.join.android.app.common.utils.e.l0(CommonWebviewFragment.this.f50482o).w(CommonWebviewFragment.this.f50482o, new File(str));
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit e(String str) {
            com.join.android.app.common.utils.e.l0(CommonWebviewFragment.this.f50482o).w(CommonWebviewFragment.this.f50482o, new File(str));
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Intent intent = new Intent(BAction.ACTION_REAL_NAME_RESULT);
            intent.putExtra("result", 1);
            CommonWebviewFragment.this.getActivity().sendBroadcast(intent);
            com.join.mgps.va.overmind.d.h0(intent, Integer.parseInt("0"));
        }

        @JavascriptInterface
        public void changeAccount(String str) {
            try {
                AccountUtil_.getInstance_(CommonWebviewFragment.this.f50482o).saveAccountData(b3.a.a((AccountBean) JsonMapper.getInstance().fromJson(str, AccountBean.class)), CommonWebviewFragment.this.f50482o);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @JavascriptInterface
        public boolean checkAppHasInstall(String str) {
            try {
                return com.join.android.app.common.utils.e.l0(CommonWebviewFragment.this.f50482o).d(CommonWebviewFragment.this.f50482o, str);
            } catch (Exception e5) {
                e5.printStackTrace();
                return false;
            }
        }

        @JavascriptInterface
        public String checkAppInfo(String str) {
            APKUtils.a aVar;
            try {
                aVar = com.join.android.app.common.utils.e.l0(CommonWebviewFragment.this.f50482o).l(CommonWebviewFragment.this.f50482o, str);
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
            return com.join.android.app.common.utils.j.j(CommonWebviewFragment.this.f50482o) ? 1 : 0;
        }

        @JavascriptInterface
        public String checkWufunPapaPlatform() {
            return "wufun";
        }

        @JavascriptInterface
        public void checkin(boolean z4) {
            CommonWebviewFragment.this.f50471d.post(new a(z4));
        }

        @JavascriptInterface
        public void copyToClipboard(String str) {
            if (g2.i(str)) {
                com.join.mgps.Util.j0.M(CommonWebviewFragment.this.f50482o, str);
                l2.a(CommonWebviewFragment.this.f50482o).b("复制成功！");
            }
        }

        @JavascriptInterface
        public void creatVipOrder(int i4) {
            CommonWebviewFragment.this.f50471d.post(new o(i4));
        }

        @JavascriptInterface
        public void downloadApkGameByUrl(String str, String str2, String str3, String str4) {
            if (System.currentTimeMillis() - CommonWebviewFragment.this.F < 1000) {
                return;
            }
            List<DownloadTask> H = p1.f.K().H(str4);
            if (H == null || H.size() <= 0) {
                DownloadTask downloadTask = new DownloadTask();
                downloadTask.setUrl(str);
                downloadTask.setShowName(str2);
                downloadTask.setPackageName(str4);
                downloadTask.setPlugin_num("46");
                downloadTask.setDtype(Dtype.android.name());
                downloadTask.setPortraitURL(str3);
                ArrayList arrayList = new ArrayList();
                TipBean tipBean = new TipBean();
                tipBean.setId("7");
                tipBean.setName("网游");
                tipBean.setColor("#8dbbec");
                arrayList.add(tipBean);
                downloadTask.setTips(JsonMapper.toJsonString(arrayList));
                TipNew tipNew = new TipNew();
                TipBean tipBean2 = new TipBean();
                tipBean2.setName("安卓");
                tipBean2.setColor("#f47500");
                tipBean2.setId("7");
                tipNew.setModel(tipBean2);
                TipBean tipBean3 = new TipBean();
                tipBean3.setName("外部");
                tipBean3.setColor("#f47500");
                tipBean3.setId("1024");
                tipNew.setModel(tipBean2);
                tipNew.setOut_game(tipBean3);
                downloadTask.setSp_tag_info(tipNew);
                downloadTask.setCrc_link_type_val(System.currentTimeMillis() + "");
                com.php25.PDownload.d.c(downloadTask, CommonWebviewFragment.this.f50482o);
                com.papa.sim.statistic.p.l(CommonWebviewFragment.this.f50482o).O1(Event.tencentArena, new Ext().setReMarks(str2));
            }
        }

        @JavascriptInterface
        public void downloadFile(String str, String str2) {
            UtilsMy.P0(CommonWebviewFragment.this.f50482o, str, str2);
        }

        @JavascriptInterface
        public void downloadGame(String str) {
            com.php25.PDownload.d.c((DownloadTask) JsonMapper.getInstance().fromJson(str, DownloadTask.class), CommonWebviewFragment.this.f50482o);
        }

        @JavascriptInterface
        public void downloadGameByGameId(String str) {
            CommonWebviewFragment.this.L0(str, null, 0);
        }

        @JavascriptInterface
        public void downloadGameByGameIdAndFrom(String str, int i4) {
            CommonWebviewFragment.this.L0(str, null, i4);
        }

        @JavascriptInterface
        public void downloadGameByGameIdAndUrl(String str, String str2) {
            CommonWebviewFragment.this.L0(str, str2, 0);
        }

        @JavascriptInterface
        public void downloadGameByGameIdIfNoGame(String str) {
            if (p1.f.K().F(str) == null) {
                CommonWebviewFragment.this.L0(str, null, 0);
            }
        }

        @JavascriptInterface
        public String findAllGames() {
            List<DownloadTask> d5 = p1.f.K().d();
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
        public int gameProgress(String str) {
            try {
                return (int) p1.f.K().F(str).getProgress();
            } catch (Exception unused) {
                return 0;
            }
        }

        @JavascriptInterface
        public void getAccount() {
            CommonWebviewFragment.this.f50471d.post(new e0());
        }

        @JavascriptInterface
        public String getAccountVer2() {
            WebAccountDataBean webAccountDataBean = new WebAccountDataBean();
            CommonWebviewFragment commonWebviewFragment = CommonWebviewFragment.this;
            commonWebviewFragment.f50487r = AccountUtil_.getInstance_(commonWebviewFragment.f50482o).getAccountData();
            if (CommonWebviewFragment.this.f50487r != null) {
                webAccountDataBean.setAccountBean(AccountBean.convert(CommonWebviewFragment.this.f50487r));
                webAccountDataBean.setHasLogin(true);
            } else {
                webAccountDataBean.setHasLogin(false);
            }
            JsonMapper.getInstance().toJson(webAccountDataBean);
            return JsonMapper.getInstance().toJson(webAccountDataBean);
        }

        @JavascriptInterface
        public String getAesAndroidId() {
            return g2.g(MApplication.G);
        }

        @JavascriptInterface
        public String getAllH5game() {
            List<DownloadTask> t4 = p1.f.K().t();
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
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).e(CommonWebviewFragment.this.f50482o);
        }

        @JavascriptInterface
        public String getAndroidVersion() {
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).s();
        }

        @JavascriptInterface
        public String getAppversionName() {
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).z();
        }

        @JavascriptInterface
        public String getDeviceId() {
            return com.papa.sim.statistic.s.f(CommonWebviewFragment.this.f50482o).b();
        }

        @JavascriptInterface
        public String getIMEI() {
            return com.papa.sim.statistic.s.f(CommonWebviewFragment.this.f50482o).b();
        }

        @JavascriptInterface
        public int getNowVersion() {
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).y();
        }

        @JavascriptInterface
        public String getPackageName() {
            return CommonWebviewFragment.this.getContext().getPackageName();
        }

        @JavascriptInterface
        public String getPapaUIDAndToken() {
            CommonWebviewFragment commonWebviewFragment = CommonWebviewFragment.this;
            commonWebviewFragment.f50487r = AccountUtil_.getInstance_(commonWebviewFragment.f50482o).getAccountData();
            if (CommonWebviewFragment.this.f50487r == null || CommonWebviewFragment.this.f50487r.n2() != 1) {
                IntentUtil.getInstance().goMyAccountLoginActivity(CommonWebviewFragment.this.f50482o, 0, 2);
                return "";
            }
            return JsonMapper.toJsonString(new PaOpenBean(CommonWebviewFragment.this.f50487r.getUid(), CommonWebviewFragment.this.f50487r.getToken()));
        }

        @JavascriptInterface
        public String getPhoneModle() {
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).q();
        }

        @JavascriptInterface
        public String getSdkIntentData() {
            return "";
        }

        @JavascriptInterface
        public String getSdkIntentData(String str) {
            SharedPreferences sharedPreferences = CommonWebviewFragment.this.f50482o.getSharedPreferences("Papa_Stat_SharedPreferences", 0);
            return sharedPreferences.getString("papasdk_" + str, "");
        }

        @JavascriptInterface
        public int getSingleGameADCount() {
            return new UserPrefs(CommonWebviewFragment.this.f50482o).getAdGamesHasSeeCount();
        }

        @JavascriptInterface
        public String getStringByKey(String str) {
            SharedPreferences sharedPreferences = CommonWebviewFragment.this.f50482o.getSharedPreferences("Papa_Stat_SharedPreferences", 0);
            return sharedPreferences.getString("papaH5_" + str, "");
        }

        @JavascriptInterface
        public String getUMIDString() {
            try {
                return UMConfigure.getUMIDString(CommonWebviewFragment.this.f50482o);
            } catch (Exception unused) {
                return "";
            }
        }

        @JavascriptInterface
        public String getVendor() {
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).x();
        }

        @JavascriptInterface
        public void goAccountCenter() {
            CommonWebviewFragment.this.f50471d.post(new i());
        }

        @JavascriptInterface
        public void goAccountDetial() {
            CommonWebviewFragment.this.f50471d.post(new q());
        }

        @JavascriptInterface
        public void goBackUrl(String str) {
            CommonWebviewFragment.this.f50471d.post(new h0(str));
        }

        @JavascriptInterface
        public void goChoiceUploadImage() {
            CommonWebviewFragment.this.f50471d.post(new s());
        }

        @JavascriptInterface
        public void goCodesBoxActivity() {
            CommonWebviewFragment.this.f50471d.post(new l());
        }

        @JavascriptInterface
        public void goDownloadCenter() {
            CommonWebviewFragment.this.f50471d.post(new RunnableC0366m());
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
            CommonWebviewFragment.this.f50471d.post(new j());
        }

        @JavascriptInterface
        public void goMainLabel(String str) {
            CommonWebviewFragment.this.f50471d.post(new t(str));
        }

        @JavascriptInterface
        public void goProfileMessage() {
            CommonWebviewFragment.this.f50471d.post(new r());
        }

        @JavascriptInterface
        public void goQQGroup(String str) {
            CommonWebviewFragment.this.f50471d.post(new a0(str));
        }

        @JavascriptInterface
        public void goSearchLabel() {
            CommonWebviewFragment.this.f50471d.post(new w());
        }

        @JavascriptInterface
        public void goStartLive() {
        }

        @JavascriptInterface
        public int inquiryGameStatus(String str) {
            DownloadTask downloadTask;
            boolean z4;
            List<DownloadTask> I = p1.f.K().I(str);
            if (I == null || I.size() <= 0) {
                downloadTask = null;
            } else {
                String str2 = "";
                String str3 = "";
                boolean z5 = false;
                loop0: while (true) {
                    z4 = false;
                    for (DownloadTask downloadTask2 : I) {
                        if (Dtype.MOD.name().equals(downloadTask2.getFileType())) {
                            str2 = downloadTask2.getCrc_link_type_val();
                            z5 = com.join.mgps.va.overmind.d.o().F(downloadTask2.getPackageName()) && downloadTask2.getStatus() == 5;
                        } else {
                            str3 = downloadTask2.getCrc_link_type_val();
                            if (com.join.android.app.common.utils.e.l0(CommonWebviewFragment.this.getContext()).d(CommonWebviewFragment.this.getContext(), downloadTask2.getPackageName()) && downloadTask2.getStatus() == 5) {
                                z4 = true;
                            }
                        }
                    }
                    break loop0;
                }
                if (z5 && z4) {
                    downloadTask = p1.f.K().F(str2);
                } else if (z5) {
                    downloadTask = p1.f.K().F(str2);
                } else if (z4) {
                    downloadTask = p1.f.K().F(str3);
                } else {
                    downloadTask = p1.f.K().F(str2);
                    if (downloadTask == null) {
                        downloadTask = p1.f.K().F(str3);
                    }
                }
            }
            if (downloadTask == null) {
                return -1;
            }
            return downloadTask.getStatus();
        }

        @JavascriptInterface
        public int inquiryGameStatusByPackage(String str) {
            List<DownloadTask> H = p1.f.K().H(str);
            if (H == null || H.size() <= 0) {
                return -1;
            }
            return H.get(0).getStatus();
        }

        @JavascriptInterface
        public int instalApk(String str) {
            DownloadTask F = p1.f.K().F(str);
            if (F == null || !Dtype.android.name().equals(F.getFileType())) {
                return -1;
            }
            APKUtils.k0(F.getGameZipPath(), F, new Function1() { // from class: com.join.mgps.fragment.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit d5;
                    d5 = CommonWebviewFragment.m.this.d((String) obj);
                    return d5;
                }
            });
            return 1;
        }

        @JavascriptInterface
        public int instalApkByPackageName(String str) {
            List<DownloadTask> H = p1.f.K().H(str);
            if (H == null || H.size() <= 0) {
                return 1;
            }
            DownloadTask downloadTask = H.get(0);
            APKUtils.k0(downloadTask.getGameZipPath(), downloadTask, new Function1() { // from class: com.join.mgps.fragment.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit e5;
                    e5 = CommonWebviewFragment.m.this.e((String) obj);
                    return e5;
                }
            });
            return 1;
        }

        @JavascriptInterface
        public void intentQQ(String str) {
            CommonWebviewFragment.this.f50471d.post(new d(str));
        }

        @JavascriptInterface
        public void intentToCompletAccount() {
            CommonWebviewFragment.this.f50471d.post(new c());
        }

        @JavascriptInterface
        public void joinAction(String str, String str2) {
            CommonWebviewFragment.this.f50471d.post(new b0(str, str2));
        }

        @JavascriptInterface
        public void jumpGameMatch(String str) {
            CommonWebviewFragment.this.f50471d.post(new z(str));
        }

        @JavascriptInterface
        public void liveIntentTo(int i4) {
        }

        @JavascriptInterface
        public void login() {
            CommonWebviewFragment.this.f50471d.post(new f0());
        }

        @JavascriptInterface
        public void openAction(String str, String str2) {
            CommonWebviewFragment.this.f50471d.post(new v(str, str2));
        }

        @JavascriptInterface
        public void papaLiveCropImage() {
            CommonWebviewFragment.this.f50471d.post(new p());
        }

        @JavascriptInterface
        public void payByPapa(String str, int i4, String str2, String str3, String str4, int i5, String str5, String str6, String str7, String str8, String str9, String str10) {
            CommonWebviewFragment.this.f50471d.post(new f(str, i4, str2, str3, str4, i5, str5, str6, str7, str8, str9, str10));
        }

        @JavascriptInterface
        public void payGameFinish(int i4) {
        }

        @JavascriptInterface
        public void playVideo(String str, String str2) {
            CommonWebviewFragment.this.f50471d.post(new b(str, str2));
        }

        @JavascriptInterface
        public void rechargePabiFrom(String str, int i4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            CommonWebviewFragment.this.f50471d.post(new h(i4, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11));
        }

        @JavascriptInterface
        public void saveStringByKey(String str, String str2) {
            SharedPreferences.Editor edit = CommonWebviewFragment.this.f50482o.getSharedPreferences("Papa_Stat_SharedPreferences", 0).edit();
            edit.putString("papaH5_" + str, str2);
            edit.commit();
        }

        @JavascriptInterface
        public void setFullScreenJs(String str) {
            CommonWebviewFragment.this.f50471d.post(new y());
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
        public void shareFromJson(String str) {
            CommonWebviewFragment.this.f50471d.post(new k(str));
        }

        @JavascriptInterface
        public void shareToOne(int i4, String str) {
            CommonWebviewFragment.this.f50471d.post(new g0(str, i4));
        }

        @JavascriptInterface
        public void shareToOneImageOrText(int i4, String str, int i5) {
            CommonWebviewFragment.this.f50471d.post(new e(i4, str, i5));
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
        public void startGame(String str, String str2) {
            CommonWebviewFragment.this.f50471d.post(new c0(str, str2));
        }

        @JavascriptInterface
        public void startGameFromJson(String str) {
            CommonWebviewFragment.this.f50471d.post(new x(str));
        }

        @JavascriptInterface
        public void startH5Game(String str) {
            CollectionBeanSub collectionBeanSub;
            DownloadTask downloadtaskDown;
            try {
                if (!g2.i(str) || (collectionBeanSub = (CollectionBeanSub) JsonMapper.getInstance().fromJson(str, CollectionBeanSub.class)) == null || (downloadtaskDown = collectionBeanSub.getDownloadtaskDown()) == null) {
                    return;
                }
                UtilsMy.T2(downloadtaskDown, CommonWebviewFragment.this.f50482o);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @JavascriptInterface
        public void startIntent(String str) {
            CommonWebviewFragment.this.f50471d.post(new d0(str));
        }

        @JavascriptInterface
        public void startWechatApp(String str, String str2, String str3) {
            IWXAPI createWXAPI = WXAPIFactory.createWXAPI(CommonWebviewFragment.this.f50482o, str);
            createWXAPI.registerApp(str);
            WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
            req.userName = str2;
            req.path = str3;
            req.miniprogramType = 0;
            createWXAPI.sendReq(req);
        }

        @JavascriptInterface
        public int stopDown(String str) {
            DownloadTask F = p1.f.K().F(str);
            if (F == null) {
                return -1;
            }
            com.php25.PDownload.d.i(F);
            return 1;
        }

        @JavascriptInterface
        public int stopDownByPackageName(String str) {
            List<DownloadTask> H = p1.f.K().H(str);
            if (H == null || H.size() == 0) {
                return -1;
            }
            for (DownloadTask downloadTask : H) {
                com.php25.PDownload.d.i(downloadTask);
            }
            return 1;
        }

        @JavascriptInterface
        public void toastText(String str) {
            CommonWebviewFragment.this.f50471d.post(new n(str));
        }

        @JavascriptInterface
        public void updateAccount() {
            CommonWebviewFragment.this.getUserInfo();
        }

        @JavascriptInterface
        public void updateRealNameState() {
            try {
                CommonWebviewFragment.this.f50471d.post(new Runnable() { // from class: com.join.mgps.fragment.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        CommonWebviewFragment.m.this.f();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void updateVip() {
            CommonWebviewFragment.this.D0();
        }

        @JavascriptInterface
        public void goMainLabel(String str, String str2, String str3) {
            CommonWebviewFragment.this.f50471d.post(new u(str, str2, str3));
        }

        @JavascriptInterface
        public void payByPapa(String str, String str2, int i4, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            CommonWebviewFragment.this.f50471d.post(new g(str, i4, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str2, str13, str14));
        }
    }

    /* loaded from: classes3.dex */
    public class n {
        public n() {
        }

        @JavascriptInterface
        public void alipay(String str) {
            if (g2.i(str)) {
                CommonWebviewFragment.this.k1(str);
            }
        }

        @JavascriptInterface
        public boolean checkAppHasInstall(String str) {
            try {
                return com.join.android.app.common.utils.e.l0(CommonWebviewFragment.this.f50482o).d(CommonWebviewFragment.this.f50482o, str);
            } catch (Exception e5) {
                e5.printStackTrace();
                return false;
            }
        }

        @JavascriptInterface
        public int gameProgress(String str) {
            try {
                return (int) p1.f.K().F(str).getProgress();
            } catch (Exception unused) {
                return 0;
            }
        }

        @JavascriptInterface
        public String getAndroidVersion() {
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).s();
        }

        @JavascriptInterface
        public String getAppversionName() {
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).z();
        }

        @JavascriptInterface
        public String getData(String str) {
            List<H5GameAccountDataTable> n4 = b2.w.o().n(str);
            if (n4 != null) {
                ArrayList arrayList = new ArrayList();
                for (H5GameAccountDataTable h5GameAccountDataTable : n4) {
                    arrayList.add((AccountBean) JsonMapper.getInstance().fromJson(h5GameAccountDataTable.getAccount_data(), AccountBean.class));
                }
                return JsonMapper.getInstance().toJson(arrayList);
            }
            return "[]";
        }

        @JavascriptInterface
        public String getDeviceId() {
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).i();
        }

        @JavascriptInterface
        public String getGameName() {
            try {
                return CommonWebviewFragment.this.getResources().getString(R.string.app_name);
            } catch (Exception unused) {
                return "";
            }
        }

        @JavascriptInterface
        public String getIMEI() {
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).i();
        }

        @JavascriptInterface
        public int getNowVersion() {
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).y();
        }

        @JavascriptInterface
        public String getPhoneModle() {
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).q();
        }

        @JavascriptInterface
        public String getQdId() {
            return com.papa.sim.statistic.k.a(CommonWebviewFragment.this.f50482o);
        }

        @JavascriptInterface
        public String getUMIDString() {
            try {
                return UMConfigure.getUMIDString(CommonWebviewFragment.this.f50482o);
            } catch (Exception unused) {
                return "";
            }
        }

        @JavascriptInterface
        public String getVendor() {
            return com.join.android.app.common.utils.n.n(CommonWebviewFragment.this.f50482o).x();
        }

        @JavascriptInterface
        public void openWeb(String str) {
            IntentUtil.getInstance().goShareWebActivity(CommonWebviewFragment.this.f50482o, str);
        }

        @JavascriptInterface
        public void setData(String str, String str2) {
            List<H5GameAccountDataTable> n4 = b2.w.o().n(str);
            if (n4 != null && n4.size() > 0) {
                boolean z4 = false;
                for (H5GameAccountDataTable h5GameAccountDataTable : n4) {
                    if (((AccountBean) JsonMapper.getInstance().fromJson(h5GameAccountDataTable.getAccount_data(), AccountBean.class)).getUid() == ((AccountBean) JsonMapper.getInstance().fromJson(str2, AccountBean.class)).getUid()) {
                        h5GameAccountDataTable.setAppkey(str);
                        h5GameAccountDataTable.setAccount_data(str2);
                        b2.w.o().update(h5GameAccountDataTable);
                        z4 = true;
                    }
                }
                if (z4) {
                    return;
                }
                H5GameAccountDataTable h5GameAccountDataTable2 = new H5GameAccountDataTable();
                h5GameAccountDataTable2.setAppkey(str);
                h5GameAccountDataTable2.setAccount_data(str2);
                b2.w.o().k(h5GameAccountDataTable2);
                return;
            }
            H5GameAccountDataTable h5GameAccountDataTable3 = new H5GameAccountDataTable();
            h5GameAccountDataTable3.setAppkey(str);
            h5GameAccountDataTable3.setAccount_data(str2);
            b2.w.o().k(h5GameAccountDataTable3);
        }

        @JavascriptInterface
        public void setScreenLandOrPort(int i4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class o extends WebViewClient {
        public o(Context context) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (str.endsWith(".zip")) {
                return;
            }
            String str2 = CommonWebviewFragment.this.f50469b;
            com.join.mgps.Util.v0.b(str2, "onPageFinished() called." + str);
            if (str.startsWith(com.facebook.common.util.f.f10923a) || str.startsWith("https") || str.startsWith("file://")) {
                CommonWebviewFragment.this.f50480m = str;
            }
            if (!CommonWebviewFragment.this.f50480m.equals("data:text/html,chromewebdata") && !CommonWebviewFragment.this.f50483p) {
                webView.getSettings().setBlockNetworkImage(false);
                webView.getLayoutParams().height = -2;
                return;
            }
            CommonWebviewFragment.this.showLodingFailed();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            String str2 = CommonWebviewFragment.this.f50469b;
            com.join.mgps.Util.v0.b(str2, "onPageStarted() called." + str);
            if (str.endsWith(".zip")) {
                return;
            }
            if (str.startsWith(com.facebook.common.util.f.f10923a) || str.startsWith("https") || str.startsWith("file://")) {
                CommonWebviewFragment.this.f50480m = str;
            }
            CommonWebviewFragment.this.showLoding();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i4, String str, String str2) {
            super.onReceivedError(webView, i4, str, str2);
            String str3 = CommonWebviewFragment.this.f50469b;
            com.join.mgps.Util.v0.b(str3, "onReceivedError() called." + str2);
            if (str2.endsWith(".zip")) {
                return;
            }
            CommonWebviewFragment.this.f50483p = true;
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
            com.join.mgps.Util.v0.b(CommonWebviewFragment.this.f50469b, "shouldOverrideUrlLoading() called.");
            if (!com.join.android.app.common.utils.j.j(CommonWebviewFragment.this.f50482o)) {
                l2.a(CommonWebviewFragment.this.f50482o).b(CommonWebviewFragment.this.getString(R.string.net_connect_failed));
            } else if (!str.startsWith("weixin:")) {
                if (!str.startsWith(com.facebook.common.util.f.f10923a) && !str.startsWith("https") && !str.startsWith("file://")) {
                    try {
                        CommonWebviewFragment.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    return true;
                }
                CommonWebviewFragment.this.f50480m = str;
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

    private boolean B0(String str) {
        this.S = false;
        this.T = false;
        DownloadTask F = p1.f.K().F(str);
        if (F != null && F.getStatus() == 5) {
            this.S = true;
            EMUApkTable n4 = b2.p.o().n(F.getPlugin_num());
            if (n4 != null) {
                if (com.join.android.app.common.utils.l.t(this.f50482o, n4, false, new String[0]) && !UtilsMy.B0(this.f50482o, n4)) {
                    this.T = true;
                } else {
                    this.T = false;
                }
            } else {
                this.T = true;
            }
        } else {
            this.S = false;
        }
        return this.T && this.S;
    }

    private boolean C0() {
        if (Build.VERSION.SDK_INT >= 23) {
            ArrayList arrayList = new ArrayList();
            if (ContextCompat.checkSelfPermission(getContext(), com.kuaishou.weapon.p0.g.f55590j) != 0) {
                arrayList.add(com.kuaishou.weapon.p0.g.f55590j);
            }
            if (ContextCompat.checkSelfPermission(getContext(), "android.permission.CAMERA") != 0) {
                arrayList.add("android.permission.CAMERA");
            }
            if (ContextCompat.checkSelfPermission(getContext(), com.kuaishou.weapon.p0.g.f55583c) != 0) {
                arrayList.add(com.kuaishou.weapon.p0.g.f55583c);
            }
            if (arrayList.size() != 0) {
                ActivityCompat.requestPermissions(getActivity(), (String[]) arrayList.toArray(new String[0]), 2);
                return false;
            }
            return true;
        }
        return true;
    }

    private Uri E0(String str) {
        String str2 = Environment.getExternalStorageDirectory() + "/wufan91/live";
        File file = new File(str2, this.f50487r.getUid() + str + System.currentTimeMillis() + ".jpg");
        if (ContextCompat.checkSelfPermission(getActivity(), com.kuaishou.weapon.p0.g.f55590j) != 0) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{com.kuaishou.weapon.p0.g.f55590j}, 2);
            return null;
        }
        try {
            File file2 = new File(str2);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            Toast.makeText(getContext(), "生成封面失败", 0).show();
        }
        return FileProvider.getUriForFile(getContext(), getContext().getPackageName() + ".fileprovider", file);
    }

    private List<String> M0(Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            return (List) intent.getExtras().get(MyAlbumActivity.f14984x);
        }
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(int i4) {
        if (!this.f50490u) {
            Toast.makeText(getContext(), getString(R.string.tip_no_permission), 0).show();
            return;
        }
        File[] listFiles = new File(Environment.getExternalStorageDirectory() + "/wufan91/live").listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.exists() && file.isFile() && file.getName().endsWith(".jpg")) {
                    UtilsMy.delete(file);
                }
            }
        }
        if (i4 == 100) {
            this.V = E0("");
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", this.V);
            startActivityForResult(intent, 100);
        } else if (i4 == 200) {
            this.V = E0("_select");
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.setType("image/*");
            startActivityForResult(intent2, 200);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        Dialog dialog = new Dialog(getActivity(), R.style.floate_dialog);
        this.U = dialog;
        dialog.setContentView(R.layout.dialog_pic_choose);
        Display defaultDisplay = getActivity().getWindowManager().getDefaultDisplay();
        Window window = this.U.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(80);
        attributes.width = defaultDisplay.getWidth();
        this.U.getWindow().setAttributes(attributes);
        ((TextView) this.U.findViewById(R.id.chos_camera)).setOnClickListener(new l());
        ((TextView) this.U.findViewById(R.id.pic_lib)).setOnClickListener(new a());
        ((TextView) this.U.findViewById(R.id.btn_cancel)).setOnClickListener(new b());
        this.U.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        RoomPosition p12 = this.P.getP1();
        if (p12.getUid() == 0) {
            this.K = 0;
        } else {
            if (p12.getUid() == this.I.getAccountData().getUid()) {
                this.O = 0;
            }
            this.K = 1;
        }
        RoomPosition p22 = this.P.getP2();
        if (p22.getUid() == 0) {
            this.L = 0;
        } else {
            if (p22.getUid() == this.I.getAccountData().getUid()) {
                this.O = 1;
            }
            this.L = 1;
        }
        RoomPosition p32 = this.P.getP3();
        if (p32.getUid() == 0) {
            this.M = 0;
        } else {
            if (p32.getUid() == this.I.getAccountData().getUid()) {
                this.O = 2;
            }
            this.M = 1;
        }
        RoomPosition p4 = this.P.getP4();
        if (p4.getUid() == 0) {
            this.N = 0;
            return;
        }
        if (p4.getUid() == this.I.getAccountData().getUid()) {
            this.O = 3;
        }
        this.N = 1;
    }

    private boolean X0(String str) {
        try {
            this.f50482o.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        getActivity().startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 43234);
    }

    private void c1(GameRoom gameRoom) {
        com.join.mgps.dialog.b1 b1Var = this.Q;
        if (b1Var != null) {
            b1Var.a();
        }
        com.join.mgps.dialog.b1 b1Var2 = new com.join.mgps.dialog.b1(getActivity());
        this.Q = b1Var2;
        b1Var2.d("加入失败，您与" + gameRoom.getRoomId() + "房间不在同一战区\n请进入该游戏房间列表，并切换至【" + com.join.mgps.socket.fight.arena.c.d(gameRoom.getBattleArea()) + "】后再查找房间号进入");
        this.Q.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1(String str) {
        com.join.mgps.dialog.d1 d1Var = this.R;
        if (d1Var != null && d1Var.isShowing()) {
            this.R.dismiss();
        }
        com.join.mgps.dialog.d1 z4 = com.join.mgps.Util.b0.f0(this.f50482o).z(this.f50482o, str, false);
        this.R = z4;
        z4.b();
    }

    private void h1(int i4) {
        Intent intent = new Intent(this.f50482o, NewArenaDownloadActivity_.class);
        intent.putExtra("gameId", "" + this.P.getGameId());
        intent.putExtra(NewArenaDownloadActivity_.P, this.T);
        intent.putExtra(NewArenaDownloadActivity_.Q, this.S);
        startActivityForResult(intent, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k1(String str) {
        new h(str).start();
    }

    private void lodeWebView(String str) {
        String str2 = this.f50469b;
        com.join.mgps.Util.v0.b(str2, "lodeWebView() called." + str);
        try {
            if (com.join.android.app.common.utils.j.j(getContext())) {
                LJNestScrollWebView lJNestScrollWebView = this.f50476i;
                if (lJNestScrollWebView == null) {
                    return;
                }
                lJNestScrollWebView.setVisibility(0);
                this.f50476i.setBarHeight(getResources().getDimensionPixelOffset(R.dimen.web_loding_progress_h));
                this.f50476i.setClickable(true);
                this.f50476i.setUseWideViewPort(true);
                this.f50476i.setSupportZoom(false);
                this.f50476i.setBuiltInZoomControls(false);
                this.f50476i.setJavaScriptEnabled(true);
                this.f50476i.setCacheMode(-1);
                this.f50476i.setWebViewClient(new o(getContext()));
                this.f50476i.r(new m());
                this.f50476i.s(new n());
                this.f50476i.w(str);
                this.f50476i.setonShowFileChooser(new f());
                this.f50476i.setActivity(getActivity());
            } else {
                showLodingFailed();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n1() {
        Iterator<String> it2 = this.B1.iterator();
        this.Z = it2;
        if (it2 != null && it2.hasNext()) {
            h2 h2Var = this.Y;
            h2Var.f(this.Z.next(), this.f50487r.getUid() + "", this.f50487r.getToken());
            this.Z.remove();
            return;
        }
        LiveUploadData liveUploadData = new LiveUploadData();
        liveUploadData.setCode(1);
        if (this.f50485p1.size() == 0) {
            liveUploadData.setCode(0);
        } else {
            try {
                List<String> list = this.f50485p1;
                liveUploadData.setData((String[]) list.toArray(new String[list.size()]));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        String json = JsonMapper.getInstance().toJson(liveUploadData);
        LJNestScrollWebView lJNestScrollWebView = this.f50476i;
        lJNestScrollWebView.w("javascript:papaChoiceAndUploadImg('" + json + "')");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFullScreen() {
        getActivity().getWindow().setFlags(1024, 1024);
    }

    private com.wufan.user.service.protobuf.n0 z0(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    @Override // com.join.mgps.Util.h2.e
    public void A(int i4, String str) {
        com.join.mgps.Util.v0.d("uploadData", "  onUploadResult " + str);
        if (this.f50484p0) {
            if (i4 == 0) {
                this.f50485p1.add(str);
            }
            Iterator<String> it2 = this.Z;
            if (it2 != null && it2.hasNext()) {
                n1();
                return;
            }
            LiveUploadData liveUploadData = new LiveUploadData();
            liveUploadData.setCode(0);
            try {
                List<String> list = this.f50485p1;
                liveUploadData.setData((String[]) list.toArray(new String[list.size()]));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            String json = JsonMapper.getInstance().toJson(liveUploadData);
            LJNestScrollWebView lJNestScrollWebView = this.f50476i;
            lJNestScrollWebView.w("javascript:papaChoiceAndUploadImg('" + json + "')");
            this.f50496z.dismiss();
            this.f50496z.a("请稍候...");
            this.f50484p0 = false;
            return;
        }
        this.f50496z.dismiss();
        this.f50496z.a("请稍候...");
        if (i4 == 0) {
            LJNestScrollWebView lJNestScrollWebView2 = this.f50476i;
            lJNestScrollWebView2.w("javascript:papaLiveCropImage2('" + str + "')");
            Toast.makeText(getContext(), "上传成功", 0).show();
        } else {
            Context context = getContext();
            Toast.makeText(context, "上传失败，错误码 " + i4, 0).show();
        }
        this.X = false;
    }

    void A0() {
        com.join.mgps.socket.fight.arena.b bVar = this.G;
        if (bVar == null || bVar.d() == null) {
            return;
        }
        com.join.mgps.Util.v0.b(this.f50469b, "--- removeObserver---");
        this.G.d().A(this.J);
        this.G.g();
        this.G.stopService();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void D0() {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
            if (accountData == null || accountData.n2() == 2) {
                return;
            }
            k.b k32 = com.wufan.user.service.protobuf.k.k3();
            k32.e3(this.f50487r.getUid());
            k32.c3(this.f50487r.getToken());
            k32.Y2(b3.b.a(getContext()));
            HashMap hashMap = new HashMap();
            hashMap.put("uid", k32.getUid() + "");
            hashMap.put("token", k32.getToken());
            hashMap.put("appVersion", k32.getAppVersion());
            k32.a3(x1.d(hashMap));
            com.wufan.user.service.protobuf.n d5 = this.f50479l.d(k32.build());
            if (d5 == null || d5.getData() == null) {
                return;
            }
            com.wufan.user.service.protobuf.f data = d5.getData();
            this.f50487r = this.f50487r.toBuilder().s4(data.M()).j4(data.V1()).q4(data.y()).k4(data.G()).build();
            AccountUtil_.getInstance_(getContext()).saveAccountData(this.f50487r, getContext());
            UtilsMy.R(getContext());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void F0(int i4) {
        this.f50487r = AccountUtil_.getInstance_(this.f50482o).getAccountData();
        try {
            VipMoneyRequest vipMoneyRequest = new VipMoneyRequest();
            vipMoneyRequest.setMonth(i4);
            vipMoneyRequest.setToken(this.f50487r.getToken());
            vipMoneyRequest.setUid(this.f50487r.getUid());
            AccountResultMainBean<CreateVipData> w4 = this.f50478k.w(vipMoneyRequest.getParams());
            H0();
            if (w4 != null) {
                if (w4.getError() == 0) {
                    CreateVipData data = w4.getData();
                    data.setMonth(i4);
                    l1(data);
                } else if (w4.getError() == 701) {
                    this.f50488s = true;
                    IntentUtil.getInstance().goMyAccountLoginActivity(this.f50482o, 0, 2);
                }
            }
        } catch (Exception unused) {
            H0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G0() {
        this.f50496z.b();
        this.f50496z.a("正在上传图片请稍候");
        this.f50496z.setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void H0() {
        com.join.mgps.dialog.d1 d1Var = this.f50496z;
        if (d1Var != null) {
            d1Var.dismiss();
        }
        com.join.mgps.dialog.d1 d1Var2 = this.R;
        if (d1Var2 != null) {
            d1Var2.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I0(GameRoom gameRoom, String str) {
        this.G.f(ArenaRequestFactory.joinRoom(ArenaConstants.REGISTER_TYPE_ARENAMAIN, gameRoom.getRoomId(), str, gameRoom.getElite()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void J0(String str) {
        this.G.f(ArenaRequestFactory.searchRoomById(ArenaConstants.REGISTER_TYPE_ARENAMAIN, Integer.parseInt(str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void K0() {
        IntentUtil.getInstance().goMyGameManagerActivity(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void L0(String str, String str2, int i4) {
        if (com.join.android.app.common.utils.j.j(getContext())) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getContext()).getAccountData();
                ResultMainBean<List<DetailResultBean>> R = this.f50477j.R(RequestBeanUtil.getInstance(getContext()).getAppDetialBean(str, accountData != null ? accountData.getUid() : 0, null));
                if (R != null && R.getFlag() != 0) {
                    List<DetailResultBean> data = R.getMessages().getData();
                    if (data.size() != 0) {
                        DetailResultBean detailResultBean = data.get(0);
                        detailResultBean.set_from(110);
                        if (i4 > 0) {
                            detailResultBean.set_from(i4);
                        }
                        if (str2 != null) {
                            detailResultBean.setDown_url_remote(str2);
                        }
                        g1(detailResultBean);
                        return;
                    }
                    return;
                } else if (R != null && R.getFlag() != 0) {
                    showTost("获取游戏信息失败");
                    return;
                } else {
                    showTost("获取游戏信息失败");
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showTost("获取游戏信息失败");
                return;
            }
        }
        showTost("获取游戏信息失败");
    }

    public void O0() {
        boolean z4 = false;
        if (ContextCompat.checkSelfPermission(this.f50482o, com.kuaishou.weapon.p0.g.f55590j) != 0) {
            UtilsMy.O2(this.f50482o, com.kuaishou.weapon.p0.g.f55590j);
        } else if (ContextCompat.checkSelfPermission(this.f50482o, com.kuaishou.weapon.p0.g.f55589i) != 0) {
            UtilsMy.O2(this.f50482o, com.kuaishou.weapon.p0.g.f55589i);
        } else {
            z4 = true;
        }
        if (z4) {
            Intent intent = new Intent(getContext(), MyAlbumActivity.class);
            Bundle bundle = new Bundle();
            this.f50485p1.clear();
            this.f50492v1.clear();
            bundle.putSerializable(MyAlbumActivity.f14984x, (Serializable) this.f50492v1);
            intent.putExtras(bundle);
            startActivityForResult(intent, 256);
        }
    }

    public void P0(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                MainLabelActivity_.P0(this).d(Integer.parseInt(str)).start();
            } else {
                com.join.mgps.Util.v0.d("uploadData", "  goMyMainLabel tag_id is null ");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void Q0(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str)) {
                int parseInt = TextUtils.isEmpty(str2) ? 0 : Integer.parseInt(str2);
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                IntentUtil.getInstance().goMainLabelActivity(getContext(), Integer.parseInt(str), parseInt, str3);
                return;
            }
            com.join.mgps.Util.v0.d("uploadData", "  goMyMainLabel tag_id is null ");
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
    }

    public void R0() {
        SearchLabelActivity_.v(this).a(1).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void S0(ArenaResponse arenaResponse) {
        String str;
        int i4 = arenaResponse.errorType;
        if (i4 == 7) {
            str = "密码输入错误，请重试";
        } else if (i4 == 8) {
            str = "房间不存在";
        } else if (i4 == 9) {
            str = "房间已满，无法加入!";
        } else if (i4 == 13) {
            str = "铜板不足，无法加入房间";
        } else if (i4 == 1001) {
            str = arenaResponse.errorInfo;
        } else if (i4 == 16) {
            str = "无法加入，你被禁止加入该房间";
        } else if (i4 != 17) {
            l2.a(this.f50482o).b(com.join.mgps.socket.fight.arena.c.g(arenaResponse));
            str = "";
        } else {
            str = "该房间为比赛专用房间,非参赛选手无法加入";
        }
        l2.a(this.f50482o).b(str);
        H0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void T0(GameRoom gameRoom) {
        H0();
        this.P = gameRoom;
        if (!gameRoom.getAllowPeripheralJoin() && com.join.mgps.socket.fight.arena.c.o(this.f50482o)) {
            l2.a(this.f50482o).b("禁止外设用户加入!");
        } else if (this.P.getBattleArea().getNumber() != BattleArea.ALL.getNumber() && this.P.getBattleArea().getNumber() != this.G.d().n().getNumber()) {
            c1(gameRoom);
        } else {
            if (!B0("" + gameRoom.getGameId())) {
                h1(L1);
            } else if (gameRoom.getHasJoinPassword()) {
                d1(gameRoom);
            } else {
                I0(gameRoom, "");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V0(boolean z4) {
        if (z4) {
            l2.a(this.f50482o).b("正在连接服务器，请稍候...");
        }
        com.join.mgps.socket.fight.arena.b bVar = new com.join.mgps.socket.fight.arena.b(getActivity(), new i());
        this.G = bVar;
        bVar.bindService();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Y0(String str) {
        this.H = str;
        if (!com.join.android.app.common.utils.j.j(this.f50482o)) {
            Toast.makeText(this.f50482o, "当前网络不可用，请检查网络", 0).show();
        } else if (!o1()) {
            f1();
        } else {
            com.join.mgps.socket.fight.arena.b bVar = this.G;
            if (bVar != null && bVar.d() == null) {
                V0(true);
                return;
            }
            this.G.d().z(this.J);
            this.f50496z.b();
            this.f50496z.setCancelable(true);
            if (!this.G.d().s()) {
                this.G.f(ArenaRequestFactory.login(ArenaConstants.REGISTER_TYPE_ARENAMAIN));
            } else {
                J0(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z0(SocketError socketError) {
        int i4 = socketError.errorType;
        if (i4 != 6 && i4 != 3 && i4 != 4) {
            l2.a(this.f50482o).b("网络异常，请稍后重试!");
            return;
        }
        l2.a(this.f50482o).b(socketError.errorInfo);
        f1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f50477j = com.join.mgps.rpc.impl.d.P1();
        this.f50478k = com.join.mgps.rpc.impl.a.c0();
        this.f50479l = com.join.mgps.rpc.impl.b.k();
        com.join.mgps.Util.v0.b(this.f50469b, "afterView() called.");
        try {
            this.f50482o = getContext();
            String string = getArguments().getString("url");
            this.f50480m = string;
            if (string == null) {
                this.f50480m = "";
            }
            if (!this.f50480m.contains("http://") && !this.f50480m.contains("file://") && !this.f50480m.contains("https://")) {
                this.f50480m = "http://" + this.f50480m;
            }
            if (this.f50480m.contains("?")) {
                lodeWebView(this.f50480m + "&ver=" + Build.VERSION.RELEASE);
            } else {
                lodeWebView(this.f50480m + "?ver=" + Build.VERSION.RELEASE);
            }
            TextView textView = this.f50474g;
            if (textView != null) {
                textView.setText("网页加载失败，再试试吧~");
            }
            LJNestScrollWebView lJNestScrollWebView = this.f50476i;
            if (lJNestScrollWebView != null) {
                lJNestScrollWebView.setMethodListenter(this);
            }
            this.f50496z = com.join.mgps.Util.b0.f0(this.f50482o).x(this.f50482o);
            com.join.mgps.Util.d0.a().d(this);
            this.Y = new h2(getContext(), this);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void b1() {
        SearchHintActivity_.G1(this.f50482o).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d1(GameRoom gameRoom) {
        com.join.mgps.customview.input.a aVar = new com.join.mgps.customview.input.a(this.f50482o, "请输入房间密码", 4, false);
        aVar.g(new k(aVar, gameRoom));
        aVar.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f1() {
        com.join.mgps.Util.b0.f0(this.f50482o).j(this.f50482o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g1(DetailResultBean detailResultBean) {
        if (detailResultBean.getMod_info() != null) {
            detailResultBean.getMod_info().getMod_game_id();
            detailResultBean.get_from();
            detailResultBean.get_from_type();
        } else {
            detailResultBean.getCrc_sign_id();
            detailResultBean.get_from();
            detailResultBean.get_from_type();
        }
        detailResultBean.getTag_info();
        detailResultBean.getMod_info();
        boolean z4 = !"7".equals(detailResultBean.getSp_tag_info().getModel().getId());
        if (!z4) {
            z4 = g2.h(detailResultBean.getPlugin_num()) ? false : UtilsMy.m2(Integer.parseInt(detailResultBean.getPlugin_num()));
            if (z4) {
                UtilsMy.Z1(detailResultBean.getPlugin_num()).getDown_type();
            }
        }
        try {
            String d5 = new PrefDef_(this.f50482o).androidIdNullsKey().d();
            if (g2.i(d5)) {
                List list = (List) JsonMapper.getInstance().fromJson(d5, List.class);
                if (g2.i(MApplication.H) && list.contains(MApplication.H) && z4) {
                    if (IntentUtil.getInstance().goLogin(this.f50482o)) {
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
        i1(detailResultBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getUserInfo() {
        if (this.E) {
            return;
        }
        this.E = true;
        this.f50487r = AccountUtil_.getInstance_(getContext()).getAccountData();
        if (com.join.android.app.common.utils.j.j(getContext())) {
            com.wufan.user.service.protobuf.n0 n0Var = this.f50487r;
            if (n0Var != null && !TextUtils.isEmpty(n0Var.getToken())) {
                try {
                    b0.b k32 = com.wufan.user.service.protobuf.b0.k3();
                    k32.e3(this.f50487r.getUid());
                    k32.c3(this.f50487r.getToken());
                    k32.Y2(b3.b.a(getContext()));
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", k32.getUid() + "");
                    hashMap.put("token", k32.getToken());
                    hashMap.put("appVersion", k32.getAppVersion());
                    k32.a3(x1.d(hashMap));
                    com.wufan.user.service.protobuf.d0 e5 = this.f50479l.e(k32.build());
                    if (e5 != null) {
                        if (e5.getError() == 200) {
                            com.wufan.user.service.protobuf.n0 data = e5.getData();
                            if (data != null && data.getUid() != 0) {
                                n0.b builder = this.f50487r.toBuilder();
                                builder.j4(data.j1()).s4(data.M()).W3(data.x2()).Q3(data.O2()).e4(data.O1()).Z3(data.F2()).M3(data.Y0()).k4(data.G()).build();
                                if (g2.i(data.getNickname())) {
                                    builder.c4(data.getNickname());
                                }
                                this.f50487r = builder.build();
                                AccountUtil_.getInstance_(getContext()).saveAccountData(this.f50487r, getContext());
                            }
                        } else {
                            e5.getError();
                        }
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            } else {
                Intent intent = new Intent();
                intent.setAction(o1.a.f72024s);
                getContext().sendBroadcast(intent);
                return;
            }
        }
        this.E = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i1(DetailResultBean detailResultBean) {
        List<DownloadTask> H;
        boolean z4;
        if (detailResultBean == null) {
            return;
        }
        try {
            if (detailResultBean.getMod_info() != null) {
                H = p1.f.K().G(detailResultBean.getMod_info().getMod_game_id(), detailResultBean.getMod_info().getMain_game_id());
            } else {
                H = p1.f.K().H(detailResultBean.getPackage_name());
            }
            if (H != null && H.size() > 0) {
                boolean z5 = false;
                loop0: while (true) {
                    z4 = false;
                    for (DownloadTask downloadTask : H) {
                        if (Dtype.MOD.name().equals(downloadTask.getFileType())) {
                            z5 = com.join.mgps.va.overmind.d.o().F(downloadTask.getPackageName()) && downloadTask.getStatus() == 5;
                        } else if (com.join.android.app.common.utils.e.l0(getContext()).d(getContext(), downloadTask.getPackageName()) && downloadTask.getStatus() == 5) {
                            z4 = true;
                        }
                    }
                    break loop0;
                }
                if (z5 && z4) {
                    r0 = p1.f.K().F(detailResultBean.getMod_info().getMain_game_id());
                } else if (z5) {
                    if (detailResultBean.getMod_info() != null) {
                        r0 = p1.f.K().F(detailResultBean.getMod_info().getMod_game_id());
                    }
                } else if (z4) {
                    r0 = p1.f.K().F(detailResultBean.getMod_info().getMain_game_id());
                } else {
                    r0 = detailResultBean.getMod_info() != null ? p1.f.K().F(detailResultBean.getMod_info().getMod_game_id()) : null;
                    if (r0 == null) {
                        r0 = p1.f.K().F(detailResultBean.getMod_info().getMain_game_id());
                    }
                }
            }
            if (r0 == null) {
                if (detailResultBean.getMod_info() == null) {
                    r0 = detailResultBean.getDownloadtaskDown();
                } else {
                    UtilsMy.Z0(this.f50482o, detailResultBean);
                    return;
                }
            }
            if (r0 != null) {
                if (UtilsMy.x0(r0.getPay_game_amount(), r0.getCrc_link_type_val()) > 0) {
                    UtilsMy.d4(this.f50482o, r0.getCrc_link_type_val());
                    return;
                }
                UtilsMy.z1(r0, detailResultBean);
                if (UtilsMy.o1(this.f50482o, r0)) {
                    return;
                }
                if (detailResultBean.getDown_status() == 5) {
                    UtilsMy.l1(this.f50482o, r0);
                } else {
                    UtilsMy.R0(this.f50482o, r0, r0.getTp_down_url(), r0.getOther_down_switch(), r0.getCdn_down_switch());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public boolean inCustomView() {
        return this.f50486q != null;
    }

    public void j1(PapayOrder papayOrder) {
        PayNowActivity_.L0(this.f50482o).c(papayOrder).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l1(CreateVipData createVipData) {
        try {
            this.f50487r = AccountUtil_.getInstance_(this.f50482o).getAccountData();
            PapayOrder papayOrder = new PapayOrder();
            papayOrder.APPKEY = "16000431";
            papayOrder.PAYTYPE = 0;
            papayOrder.NOTIFY_URI = com.join.mgps.rpc.h.f54056j + "/member/buy_vip/callback";
            papayOrder.APP_NAME = "悟饭充值";
            papayOrder.APP_ORDER_ID = "papavip" + System.currentTimeMillis() + "";
            papayOrder.PA_OPEN_UID = this.f50487r.getUid();
            papayOrder.APP_USER_ID = this.f50487r.getUid() + "";
            papayOrder.APP_USER_NAME = this.f50487r.getNickname();
            papayOrder.PRODUCT_ID = "month" + createVipData.getMonth();
            papayOrder.PRODUCT_NAME = "会员充值";
            papayOrder.MONEY_AMOUNT = createVipData.getAmount() + "";
            papayOrder.APP_DISTRICT = 1;
            papayOrder.APP_SERVER = 1;
            papayOrder.APP_EXT1 = createVipData.getExtra();
            papayOrder.APP_EXT2 = "";
            papayOrder.PAYORRECHARGE = 1;
            papayOrder.ORDERTYPE = 1;
            papayOrder.PAYSHOWTYPE = 3;
            papayOrder.TOKEN = this.f50487r.getToken();
            j1(papayOrder);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void loding_faile() {
        com.join.mgps.Util.v0.b(this.f50469b, "loding_faile() called.");
        if (this.f50476i != null) {
            this.f50483p = false;
            lodeWebView(this.f50480m);
        }
    }

    public void m1(Uri uri) {
        this.W = E0("_crop");
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 340);
        intent.putExtra("aspectY", 290);
        intent.putExtra("outputX", 340);
        intent.putExtra("outputY", 290);
        intent.putExtra("scale", true);
        intent.putExtra("scaleUpIfNeeded", true);
        intent.putExtra("return-data", false);
        intent.putExtra("output", this.W);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        startActivityForResult(intent, 10);
    }

    @Override // com.join.mgps.customview.LJNestScrollWebView.b
    public void noMethod() {
        WebView webView = this.f50476i.getWebView();
        if (webView == null || !webView.canGoBack()) {
            return;
        }
        webView.goBack();
    }

    boolean o1() {
        com.wufan.user.service.protobuf.n0 z02 = z0(this.f50482o);
        this.f50487r = z02;
        return (z02 == null || AccountUtil_.getInstance_(this.f50482o).isTourist()) ? false : true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i4, int i5, Intent intent) {
        String s4;
        if (i5 == -1) {
            if (i4 == 10) {
                this.X = true;
                com.facebook.imagepipeline.core.g imagePipeline = Fresco.getImagePipeline();
                imagePipeline.h(this.W);
                imagePipeline.f(this.W);
                imagePipeline.e(this.W);
                h2 h2Var = this.Y;
                String path = this.W.getPath();
                h2Var.f(path, this.f50487r.getUid() + "", this.f50487r.getToken());
                this.f50496z.b();
                this.f50496z.a("正在上传直播封面");
                this.f50496z.setCancelable(false);
            } else if (i4 == 100) {
                m1(this.V);
            } else if (i4 == 200 && (s4 = com.join.mgps.Util.h0.s(getContext(), intent.getData())) != null) {
                m1(Uri.fromFile(new File(s4)));
            }
        }
        if (i4 == 256) {
            if (this.f50492v1 == null) {
                this.f50492v1 = new ArrayList();
            }
            this.f50492v1.clear();
            this.f50492v1.addAll(M0(intent));
            net.bither.util.b.q().y();
        } else if (i4 == L1 && i5 == -1) {
            if (this.P.getHasJoinPassword()) {
                d1(this.P);
            } else if (this.P.getHasJoinPassword()) {
                d1(this.P);
            } else {
                e1("正在获取房间...");
                I0(this.P, "");
            }
        }
        this.f50476i.q(i4, i5, intent);
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
                LJNestScrollWebView lJNestScrollWebView = this.f50476i;
                if (lJNestScrollWebView != null) {
                    lJNestScrollWebView.getWebView().restoreState(bundle);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        this.f50476i.setOnKeyListener(new d());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        A0();
        this.f50495y = true;
        com.join.mgps.Util.d0.a().e(this);
        if (this.A1 != null) {
            net.bither.util.b.q().z(this.A1);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        if (a5 == null) {
            return;
        }
        if (APKUtils.G(a5)) {
            LJNestScrollWebView lJNestScrollWebView = this.f50476i;
            lJNestScrollWebView.w("javascript:papaGameStatusNotify(" + a5.getRef_crc_sign_id() + "," + a5.getStatus() + ")");
            return;
        }
        LJNestScrollWebView lJNestScrollWebView2 = this.f50476i;
        lJNestScrollWebView2.w("javascript:papaGameStatusNotify(" + a5.getCrc_link_type_val() + "," + a5.getStatus() + ")");
    }

    @Override // com.join.mgps.customview.LJNestScrollWebView.b
    public void onHideCustomView() {
        this.f50486q = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        LJNestScrollWebView lJNestScrollWebView = this.f50476i;
        if (lJNestScrollWebView != null) {
            try {
                lJNestScrollWebView.getWebView().getClass().getMethod("onPause", new Class[0]).invoke(this.f50476i.getWebView(), null);
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
    public void onRequestPermissionsResult(int i4, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        if (i4 != 2) {
            return;
        }
        for (int i5 : iArr) {
            if (i5 != 0) {
                return;
            }
        }
        this.f50490u = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f50476i.w("javascript:papaActivityOnResume()");
        LJNestScrollWebView lJNestScrollWebView = this.f50476i;
        if (lJNestScrollWebView != null) {
            try {
                lJNestScrollWebView.getWebView().getClass().getMethod("onResume", new Class[0]).invoke(this.f50476i.getWebView(), null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
        this.f50487r = AccountUtil_.getInstance_(this.f50482o).getAccountData();
        if (this.f50488s) {
            if (this.f50476i != null) {
                WebAccountDataBean webAccountDataBean = new WebAccountDataBean();
                if (this.f50487r != null) {
                    webAccountDataBean.setHasLogin(true);
                } else {
                    webAccountDataBean.setHasLogin(false);
                }
                webAccountDataBean.setAccountBean(AccountBean.convert(this.f50487r));
                LJNestScrollWebView lJNestScrollWebView2 = this.f50476i;
                lJNestScrollWebView2.w("javascript:papaPutAccountData(" + JsonMapper.getInstance().toJson(webAccountDataBean) + ")");
            }
            this.f50488s = false;
        }
        net.bither.util.b.q().e(this.A1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f50476i.getWebView().saveState(bundle);
    }

    @Override // com.join.mgps.customview.LJNestScrollWebView.b
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback, WebChromeClient webChromeClient) {
        this.f50486q = view;
        if (view == null) {
            return;
        }
        this.f50475h.setVisibility(8);
        getActivity().setRequestedOrientation(0);
        setFullScreen();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        com.join.mgps.Util.v0.b(this.f50469b, "setNetwork() called.");
        UtilsMy.w3(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            com.join.mgps.Util.v0.b(this.f50469b, "showLoding() called.");
            this.f50472e.setVisibility(8);
            this.f50473f.setVisibility(8);
            LJNestScrollWebView lJNestScrollWebView = this.f50476i;
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
            com.join.mgps.Util.v0.b(this.f50469b, "showLodingFailed() called.");
            this.f50473f.setVisibility(0);
            this.f50472e.setVisibility(8);
            LJNestScrollWebView lJNestScrollWebView = this.f50476i;
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
            com.join.mgps.Util.v0.b(this.f50469b, "showMain() called.");
            this.f50473f.setVisibility(8);
            this.f50472e.setVisibility(8);
            LJNestScrollWebView lJNestScrollWebView = this.f50476i;
            if (lJNestScrollWebView != null) {
                lJNestScrollWebView.setVisibility(0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.customview.LJNestScrollWebView.b
    public void showMainWebview() {
        LJNestScrollWebView lJNestScrollWebView = this.f50476i;
        if (lJNestScrollWebView == null || lJNestScrollWebView.getVisibility() == 0) {
            return;
        }
        showMain();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        l2.a(this.f50482o).b(str);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(PapayResult papayResult) {
        if (papayResult != null) {
            int status = papayResult.getStatus();
            if (status == 1) {
                this.f50476i.w("javascript:papaPayResult(5000)");
            } else if (status == 2) {
                this.f50476i.w("javascript:papaPayResult(5001)");
            } else if (status == 3) {
                this.f50476i.w("javascript:papaPayResult(5002)");
            } else if (status != 4) {
            } else {
                this.f50476i.w("javascript:papaPayResult(5003)");
            }
        }
    }
}
