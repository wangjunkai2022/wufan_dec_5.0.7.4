package com.join.mgps.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import app.mgsim.arena.ArenaConstants;
import app.mgsim.arena.ArenaRequest;
import app.mgsim.arena.ArenaRequestFactory;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.SocketError;
import app.mgsim.arena.SocketListener;
import com.BaseFragmentActivity;
import com.MApplication;
import com.alipay.sdk.app.PayTask;
import com.bytedance.sdk.openadsdk.TTAdConstant;
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
import com.join.mgps.Util.h2;
import com.join.mgps.activity.ShareWebActivity;
import com.join.mgps.activity.arena.GameRoomActivity;
import com.join.mgps.activity.arena.NewArenaDownloadActivity_;
import com.join.mgps.activity.label.MainLabelActivity_;
import com.join.mgps.activity.posting.PostingActivity;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.adapter.FullScreenActivity_;
import com.join.mgps.customview.LJWebView;
import com.join.mgps.customview.input.InputNumView;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.db.tables.H5GameAccountDataTable;
import com.join.mgps.dto.AccountBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CreateVipData;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GroupInfoBean;
import com.join.mgps.dto.IntentDataMain;
import com.join.mgps.dto.LiveUploadData;
import com.join.mgps.dto.NetBattleStartGameDto;
import com.join.mgps.dto.PaOpenBean;
import com.join.mgps.dto.PapayOrder;
import com.join.mgps.dto.PapayResult;
import com.join.mgps.dto.PayResult;
import com.join.mgps.dto.RequestDomainInfoArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ShareBean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.dto.TipNew;
import com.join.mgps.dto.UpdateIntentDataBean;
import com.join.mgps.dto.VipMoneyRequest;
import com.join.mgps.dto.WebAccountDataBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.socket.fight.arena.b;
import com.mgsim.common.fragment.BackHandledFragment;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.bean.ButtonBean;
import com.papa91.arc.common.constants.BAction;
import com.papa91.arc.ext.ToastManager;
import com.papa91.battle.protocol.BattleArea;
import com.papa91.battle.protocol.GameRoom;
import com.papa91.battle.protocol.RoomCategory;
import com.papa91.battle.protocol.RoomPosition;
import com.papa91.wrapper.UserPrefs;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.wufan.user.service.protobuf.b0;
import com.wufan.user.service.protobuf.k;
import com.wufan.user.service.protobuf.n0;
import io.reactivex.functions.Consumer;
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
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.share_activity_layout)
/* loaded from: classes.dex */
public class ShareWebActivity extends BaseFragmentActivity implements LJWebView.b, h2.e, com.mgsim.common.fragment.a {
    public static final int V1 = 1;
    public static final int W1 = 2;
    public static final int X1 = 5000;
    public static final int Y1 = 5001;
    public static final int Z1 = 5002;

    /* renamed from: a2  reason: collision with root package name */
    public static final int f37508a2 = 5003;

    /* renamed from: b2  reason: collision with root package name */
    private static final int f37509b2 = 2;

    /* renamed from: c2  reason: collision with root package name */
    private static final int f37510c2 = 4112;

    /* renamed from: d2  reason: collision with root package name */
    private static final int f37511d2 = 100;

    /* renamed from: e2  reason: collision with root package name */
    private static final int f37512e2 = 200;

    /* renamed from: f2  reason: collision with root package name */
    private static final int f37513f2 = 10;
    private int A1;
    private com.wufan.user.service.protobuf.n0 B;
    private int B1;
    @Extra
    IntentDateBean D;
    private GameRoom D1;
    @Extra
    IntentDataMain E;
    private com.join.mgps.dialog.b1 E1;
    private com.join.mgps.dialog.d1 F1;
    private View G;
    private WebChromeClient I;
    private Dialog I1;
    private Uri J1;
    @Pref
    PrefDef_ K;
    private Uri K1;
    private boolean L;
    private com.join.mgps.dialog.g0 M;
    private com.join.mgps.Util.h2 M1;
    private com.join.mgps.dialog.y1 N;
    Iterator<String> N1;
    Dialog Q;
    private BackHandledFragment T1;
    com.join.mgps.rpc.k U;
    private boolean U1;
    private com.join.mgps.socket.fight.arena.b X;
    private String Y;
    @Bean
    com.join.mgps.Util.b Z;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f37517e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f37518f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    RelativeLayout f37519g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f37520h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f37521i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f37522j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    FrameLayout f37523k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    RelativeLayout f37524l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    LJWebView f37525m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ImageView f37526n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    ImageView f37527o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    ImageView f37528p;

    /* renamed from: p1  reason: collision with root package name */
    private int f37530p1;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    ImageView f37531q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    ImageView f37532r;
    @ViewById(R.id.video_view)

    /* renamed from: s  reason: collision with root package name */
    FrameLayout f37533s;

    /* renamed from: t  reason: collision with root package name */
    com.join.mgps.rpc.e f37534t;

    /* renamed from: u  reason: collision with root package name */
    com.join.mgps.rpc.b f37535u;

    /* renamed from: v  reason: collision with root package name */
    com.join.mgps.rpc.c f37536v;

    /* renamed from: v1  reason: collision with root package name */
    private int f37537v1;

    /* renamed from: w  reason: collision with root package name */
    private String f37538w;

    /* renamed from: x  reason: collision with root package name */
    private String f37539x;

    /* renamed from: y  reason: collision with root package name */
    private long f37540y;

    /* renamed from: z  reason: collision with root package name */
    private Activity f37541z;

    /* renamed from: b  reason: collision with root package name */
    String f37514b = "ShareWebActivity";

    /* renamed from: c  reason: collision with root package name */
    private String f37515c = "PAPA_EMU_INTENT_EXTRA_ACTION_FROM";

    /* renamed from: d  reason: collision with root package name */
    private Handler f37516d = new Handler();
    private boolean A = false;
    private boolean C = false;
    @Extra
    boolean F = true;
    private int H = 0;
    private boolean J = false;
    com.join.mgps.dialog.d1 O = null;
    boolean P = false;
    AlertDialog.Builder R = null;
    private final PostingActivity.m S = new h();
    @SuppressLint({"HandlerLeak"})
    private Handler T = new k();
    boolean V = false;
    long W = 0;

    /* renamed from: p0  reason: collision with root package name */
    private final SocketListener.NotifyObserver f37529p0 = new n();
    private int C1 = -1;
    boolean G1 = false;
    boolean H1 = false;
    private boolean L1 = false;
    private boolean O1 = false;
    private List<String> P1 = new ArrayList();
    List<String> Q1 = new ArrayList();
    private b.e R1 = new e();
    private List<String> S1 = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements InputNumView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.input.a f37542a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameRoom f37543b;

        a(com.join.mgps.customview.input.a aVar, GameRoom gameRoom) {
            this.f37542a = aVar;
            this.f37543b = gameRoom;
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void a(String str) {
            this.f37542a.c();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ShareWebActivity.this.J1("正在获取房间...");
            ShareWebActivity.this.a1(this.f37543b, str);
        }

        @Override // com.join.mgps.customview.input.InputNumView.d
        public void hide() {
            this.f37542a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareWebActivity.this.j1(100);
            ShareWebActivity.this.I1.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareWebActivity.this.j1(200);
            ShareWebActivity.this.I1.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ShareWebActivity.this.I1.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class e implements b.e {
        e() {
        }

        private void b(List<String> list) {
            if (list == null || list.size() <= 0) {
                return;
            }
            com.join.mgps.Util.v0.d("uploadData", "  togglePostSubmit " + list.size());
            ShareWebActivity.this.S1.clear();
            ShareWebActivity.this.S1.addAll(list);
            ShareWebActivity.this.Z0();
            ShareWebActivity.this.S1();
            ShareWebActivity.this.O1 = true;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00a1 A[SYNTHETIC] */
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
                if (r9 == 0) goto La8
                com.join.mgps.activity.ShareWebActivity r9 = com.join.mgps.activity.ShareWebActivity.this
                java.util.List<java.lang.String> r9 = r9.Q1
                if (r9 == 0) goto La8
                int r9 = r9.size()
                if (r9 == 0) goto La8
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                r0 = 0
                r1 = 0
            L42:
                com.join.mgps.activity.ShareWebActivity r2 = com.join.mgps.activity.ShareWebActivity.this
                java.util.List<java.lang.String> r2 = r2.Q1
                int r2 = r2.size()
                if (r1 >= r2) goto La4
                com.join.mgps.activity.ShareWebActivity r2 = com.join.mgps.activity.ShareWebActivity.this
                java.util.List<java.lang.String> r2 = r2.Q1
                java.lang.Object r2 = r2.get(r1)
                java.lang.String r2 = (java.lang.String) r2
                java.util.Set r3 = r11.keySet()
                r4 = 1
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L80
                r5 = 0
            L60:
                boolean r6 = r3.hasNext()     // Catch: java.lang.Exception -> L7e
                if (r6 == 0) goto L85
                java.lang.Object r6 = r3.next()     // Catch: java.lang.Exception -> L7e
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L7e
                java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> L7e
                r7.<init>(r6)     // Catch: java.lang.Exception -> L7e
                java.lang.String r7 = r7.getName()     // Catch: java.lang.Exception -> L7e
                boolean r7 = r2.contains(r7)     // Catch: java.lang.Exception -> L7e
                if (r7 == 0) goto L60
                r2 = r6
                r5 = 1
                goto L60
            L7e:
                r3 = move-exception
                goto L82
            L80:
                r3 = move-exception
                r5 = 0
            L82:
                r3.printStackTrace()
            L85:
                if (r5 != 0) goto L96
                java.lang.Object r3 = r11.get(r2)     // Catch: java.lang.Exception -> L92
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L92
                int r5 = r3.intValue()     // Catch: java.lang.Exception -> L92
                goto L96
            L92:
                r3 = move-exception
                r3.printStackTrace()
            L96:
                java.lang.Object r2 = r10.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r5 != r4) goto La1
                r9.add(r2)
            La1:
                int r1 = r1 + 1
                goto L42
            La4:
                r8.b(r9)
                goto Lac
            La8:
                r9 = 0
                r8.b(r9)
            Lac:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ShareWebActivity.e.a(java.lang.Boolean, java.util.Map, java.util.Map):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements DownloadListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f37549a;

        f(IntentDateBean intentDateBean) {
            this.f37549a = intentDateBean;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j4) {
            ShareWebActivity.this.c1(str, this.f37549a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements Consumer<com.tbruyelle.rxpermissions2.b> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f37551b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f37552c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37554b;

            a(String str) {
                this.f37554b = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(ShareWebActivity.this.f37541z);
                a5.b(this.f37554b + "正在下载");
                Activity activity = ShareWebActivity.this.f37541z;
                String str = g.this.f37552c;
                UtilsMy.P0(activity, str, "temp_" + this.f37554b);
                ShareWebActivity.this.M.dismiss();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= 11) {
                    ((ClipboardManager) ShareWebActivity.this.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, g.this.f37552c));
                } else {
                    ((ClipboardManager) ShareWebActivity.this.getSystemService("clipboard")).setText(g.this.f37552c);
                }
                ShareWebActivity.this.M.dismiss();
                if (ShareWebActivity.this.N != null) {
                    ShareWebActivity.this.N.c();
                }
                ShareWebActivity shareWebActivity = ShareWebActivity.this;
                shareWebActivity.N = new com.join.mgps.dialog.y1(shareWebActivity, shareWebActivity.S, 4355, "提示", "已复制地址至剪切板，请自行使用浏览器打开。", "我知道了");
                ShareWebActivity.this.N.e();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class c implements DialogInterface.OnClickListener {
            c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                dialogInterface.dismiss();
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", ShareWebActivity.this.getPackageName(), null));
                ShareWebActivity.this.startActivity(intent);
            }
        }

        g(IntentDateBean intentDateBean, String str) {
            this.f37551b = intentDateBean;
            this.f37552c = str;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
            if (bVar.f62140b) {
                Object object = this.f37551b.getObject();
                UpdateIntentDataBean updateIntentDataBean = null;
                try {
                    if (object instanceof UpdateIntentDataBean) {
                        updateIntentDataBean = (UpdateIntentDataBean) object;
                    }
                } catch (Exception unused) {
                }
                if (updateIntentDataBean != null && com.join.mgps.Util.v.f28122v.equals(this.f37551b.getFrom())) {
                    updateIntentDataBean.getDownloadTask().setUrl(this.f37552c);
                    if (UtilsMy.o1(ShareWebActivity.this.f37541z, updateIntentDataBean.getDownloadTask())) {
                        return;
                    }
                    ChociceDownActivity_.q0(ShareWebActivity.this.f37541z).a(updateIntentDataBean.getDownloadTask()).c(updateIntentDataBean).b(10).start();
                } else if (updateIntentDataBean != null && "11".equals(this.f37551b.getFrom())) {
                    updateIntentDataBean.getDownloadTask().setUrl(this.f37552c);
                    if (UtilsMy.o1(ShareWebActivity.this.f37541z, updateIntentDataBean.getDownloadTask())) {
                        return;
                    }
                    ChociceDownActivity_.q0(ShareWebActivity.this.f37541z).a(updateIntentDataBean.getDownloadTask()).c(updateIntentDataBean).b(12).start();
                } else {
                    if (!ShareWebActivity.this.K.firstShowUserPermiss().d().booleanValue()) {
                        MobclickAgent.onEvent(ShareWebActivity.this.f37541z, "onSourceDownloadBegin");
                    }
                    String str = this.f37552c;
                    String substring = str.substring(str.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                    ShareWebActivity.this.B1(substring);
                    if (ShareWebActivity.this.M != null) {
                        ShareWebActivity.this.M.dismiss();
                    }
                    ShareWebActivity.this.M = new com.join.mgps.dialog.g0(ShareWebActivity.this.f37541z);
                    ShareWebActivity.this.M.show();
                    ShareWebActivity.this.M.a(new a(substring));
                    ShareWebActivity.this.M.b(new b());
                }
            } else if (bVar.f62141c) {
            } else {
                ShareWebActivity shareWebActivity = ShareWebActivity.this;
                Dialog dialog = shareWebActivity.Q;
                if (dialog == null) {
                    shareWebActivity.R = new AlertDialog.Builder(shareWebActivity.f37541z, R.style.AlertDialogCustom);
                } else if (dialog.isShowing()) {
                    return;
                }
                if (bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55587g)) {
                    return;
                }
                ShareWebActivity.this.O.setTitle("提示");
                if (!bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55590j) && !bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55589i)) {
                    ShareWebActivity.this.R.setMessage("请去设置中开启权限");
                } else {
                    ShareWebActivity.this.R.setMessage("需要打开读写存储权限，请去设置中开启权限");
                }
                ShareWebActivity.this.R.setPositiveButton("去打开", new c());
                ShareWebActivity shareWebActivity2 = ShareWebActivity.this;
                shareWebActivity2.Q = shareWebActivity2.R.show();
            }
        }
    }

    /* loaded from: classes4.dex */
    class h implements PostingActivity.m {
        h() {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void a(int i4) {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void b(int i4) {
            ShareWebActivity.this.finish();
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void c(GroupInfoBean groupInfoBean) {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void d(int i4) {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void e(int i4) {
            if (i4 == 4355 && ShareWebActivity.this.N != null) {
                ShareWebActivity.this.N.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements LJWebView.c {
        i() {
        }

        @Override // com.join.mgps.customview.LJWebView.c
        public void a() {
            ShareWebActivity.this.A1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements GameRoomActivity.x {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DetailResultBean f37560a;

        j(DetailResultBean detailResultBean) {
            this.f37560a = detailResultBean;
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            ShareWebActivity.this.N1(this.f37560a);
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    /* loaded from: classes4.dex */
    class k extends Handler {
        k() {
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
                ShareWebActivity.this.finish();
                Toast.makeText(ShareWebActivity.this.f37541z, "支付成功", 1);
            } else if (TextUtils.equals(resultStatus, "8000")) {
                Toast.makeText(ShareWebActivity.this.f37541z, "支付结果确认中", 0).show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37563b;

        l(String str) {
            this.f37563b = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                String pay = new PayTask(ShareWebActivity.this.f37541z).pay(com.join.mgps.Util.w.a(this.f37563b), true);
                Message message = new Message();
                message.what = 2;
                message.obj = pay;
                ShareWebActivity.this.T.sendMessage(message);
            } catch (Exception e5) {
                e5.printStackTrace();
                Message message2 = new Message();
                message2.what = 3;
                ShareWebActivity.this.T.sendMessage(message2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m extends b.c {
        m() {
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void c() {
            super.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements SocketListener.NotifyObserver {
        n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(NetBattleStartGameDto netBattleStartGameDto, DownloadTask downloadTask) {
            UtilsMy.P3(ShareWebActivity.this.f37541z, netBattleStartGameDto, downloadTask, null, com.join.mgps.socket.fight.arena.c.i(ShareWebActivity.this.D1.getBattleArea(), false));
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onError(SocketError socketError) {
            ShareWebActivity.this.z1(socketError);
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onServerResponse(ArenaResponse arenaResponse) {
            int elite;
            ArenaRequest arenaRequest = arenaResponse.request;
            if (arenaRequest != null) {
                String str = arenaRequest.register_type;
                if (str == ArenaConstants.REGISTER_TYPE_ARENAMAIN || str == ArenaConstants.REGISTER_TYPE_PUBLIC) {
                    if (arenaResponse.responseCode == 0) {
                        ShareWebActivity.this.handleFailure(arenaResponse);
                    } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_LOGIN)) {
                        if (TextUtils.isEmpty(ShareWebActivity.this.Y)) {
                            return;
                        }
                        ShareWebActivity shareWebActivity = ShareWebActivity.this;
                        shareWebActivity.b1(shareWebActivity.Y);
                    } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SEARCH_ROOM_BY_ID)) {
                        ShareWebActivity.this.p1((GameRoom) arenaResponse.data);
                    } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_JOIN_ROOM)) {
                        ShareWebActivity.this.V0();
                        GameRoom gameRoom = (GameRoom) arenaResponse.data;
                        ShareWebActivity.this.X.d().E(null);
                        p1.f K = p1.f.K();
                        final DownloadTask F = K.F("" + gameRoom.getGameId());
                        ShareWebActivity.this.dismissLoadingDialog();
                        ShareWebActivity.this.t1();
                        int i4 = ShareWebActivity.this.f37530p1 + ShareWebActivity.this.f37537v1 + ShareWebActivity.this.A1 + ShareWebActivity.this.B1;
                        final NetBattleStartGameDto netBattleStartGameDto = new NetBattleStartGameDto();
                        netBattleStartGameDto.setGameID(ShareWebActivity.this.D1.getGameId() + "");
                        netBattleStartGameDto.setRoomID(gameRoom.getBattleServerAddr().getBattleRoomId() + "");
                        netBattleStartGameDto.setUserID(ShareWebActivity.this.B.getUid() + "");
                        netBattleStartGameDto.setServerIP(gameRoom.getBattleServerAddr().getHost());
                        netBattleStartGameDto.setServerPort(gameRoom.getBattleServerAddr().getPort());
                        if (gameRoom.getRoomCategory() == RoomCategory.LIVE) {
                            elite = 3;
                        } else {
                            elite = gameRoom.getRoomCategory() == RoomCategory.TOURNAMENT ? 2 : ShareWebActivity.this.D1.getElite();
                        }
                        netBattleStartGameDto.setRoomMode(elite);
                        netBattleStartGameDto.setAllowPeripheralJoin(ShareWebActivity.this.D1.getAllowPeripheralJoin());
                        netBattleStartGameDto.setAllowPCJoin(ShareWebActivity.this.D1.getAllowPCJoin());
                        netBattleStartGameDto.setGameype(ShareWebActivity.this.D1.getGameType().getNumber());
                        netBattleStartGameDto.setGroupId(ShareWebActivity.this.D1.getRoomId());
                        netBattleStartGameDto.setP1Name("");
                        netBattleStartGameDto.setP2Name("");
                        netBattleStartGameDto.setOldGame(0);
                        netBattleStartGameDto.setUserName(ShareWebActivity.this.B.getNickname());
                        netBattleStartGameDto.setUserIcon(ShareWebActivity.this.B.d0());
                        netBattleStartGameDto.setGamePlayers(ShareWebActivity.this.D1.getSeatsNumber());
                        netBattleStartGameDto.setTcptype(1);
                        netBattleStartGameDto.setPorder(ShareWebActivity.this.C1);
                        netBattleStartGameDto.setNetPlayers(i4);
                        if (!ShareWebActivity.this.D1.getElite()) {
                            netBattleStartGameDto.setOpenBattleScore(ShareWebActivity.this.D1.getOpenBattleScore());
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(">>>>>>>>>>>>>>>>>>>tbl>>>>>>>>>>>>>>>>>>>>>>join game!!!!!! ");
                        sb.append(netBattleStartGameDto.toString());
                        ShareWebActivity.this.X.f(ArenaRequestFactory.startLobbyGame(ArenaConstants.REGISTER_TYPE_GAMEROOM, ShareWebActivity.this.D1.getRoomId()));
                        if (ShareWebActivity.this.D1 != null && ShareWebActivity.this.D1.getRoomId() != 0) {
                            com.wufan.friend.chat.c.u().i(0, ShareWebActivity.this.D1.getRoomId());
                        }
                        ShareWebActivity.this.runOnUiThread(new Runnable() { // from class: com.join.mgps.activity.v2
                            @Override // java.lang.Runnable
                            public final void run() {
                                ShareWebActivity.n.this.b(netBattleStartGameDto, F);
                            }
                        });
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class o {

        /* loaded from: classes4.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37568b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f37569c;

            a(String str, int i4) {
                this.f37568b = str;
                this.f37569c = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                ShareBean shareBean = (ShareBean) JsonMapper.getInstance().fromJson(this.f37568b, ShareBean.class);
                shareBean.setFrom(5);
                com.join.mgps.Util.s.p(ShareWebActivity.this.f37541z, this.f37569c, shareBean);
            }
        }

        /* loaded from: classes4.dex */
        class a0 implements Runnable {
            a0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IntentUtil.getInstance().goMYAccountDetialActivity(ShareWebActivity.this.f37541z);
            }
        }

        /* loaded from: classes4.dex */
        class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37572b;

            b(String str) {
                this.f37572b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if ("".equals(this.f37572b)) {
                    ShareWebActivity.this.e1();
                } else {
                    ShareWebActivity.this.f37525m.w(this.f37572b);
                }
            }
        }

        /* loaded from: classes4.dex */
        class b0 implements Runnable {
            b0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IntentUtil.getInstance().goForumProfileMessageActivity(ShareWebActivity.this.f37541z);
            }
        }

        /* loaded from: classes4.dex */
        class c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f37575b;

            c(int i4) {
                this.f37575b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i4 = this.f37575b;
                if (i4 == 0) {
                    ShareWebActivity.this.setRequestedOrientation(4);
                    ShareWebActivity.this.H = 0;
                } else if (i4 == 1) {
                    ShareWebActivity.this.setRequestedOrientation(0);
                    ShareWebActivity.this.H = 1;
                } else if (i4 == 2) {
                    ShareWebActivity.this.setRequestedOrientation(1);
                    ShareWebActivity.this.H = 2;
                } else if (i4 != 3) {
                } else {
                    ShareWebActivity.this.F1();
                    ShareWebActivity.this.H = 3;
                }
            }
        }

        /* loaded from: classes4.dex */
        class c0 implements Runnable {
            c0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ShareWebActivity.this.goMyAlbumActivity4PickPic();
            }
        }

        /* loaded from: classes4.dex */
        class d implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f37578b;

            d(boolean z4) {
                this.f37578b = z4;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f37578b) {
                    ShareWebActivity.this.f37519g.setVisibility(0);
                } else {
                    ShareWebActivity.this.f37519g.setVisibility(8);
                }
            }
        }

        /* loaded from: classes4.dex */
        class d0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37580b;

            d0(String str) {
                this.f37580b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                ShareWebActivity.this.m1(this.f37580b);
            }
        }

        /* loaded from: classes4.dex */
        class e implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f37582b;

            e(boolean z4) {
                this.f37582b = z4;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean g4 = com.join.android.app.common.utils.g.g(ShareWebActivity.this.K.lastCheckInTime().d().longValue());
                if (this.f37582b) {
                    if (g4) {
                        return;
                    }
                    ShareWebActivity.this.K.lastCheckInTime().g(Long.valueOf(System.currentTimeMillis()));
                } else if (g4) {
                    ShareWebActivity.this.K.lastCheckInTime().g(0L);
                }
            }
        }

        /* loaded from: classes4.dex */
        class e0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37584b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f37585c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f37586d;

            e0(String str, String str2, String str3) {
                this.f37584b = str;
                this.f37585c = str2;
                this.f37586d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                ShareWebActivity.this.n1(this.f37584b, this.f37585c, this.f37586d);
            }
        }

        /* loaded from: classes4.dex */
        class f implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37588b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f37589c;

            f(String str, String str2) {
                this.f37588b = str;
                this.f37589c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                videoInfo.m(this.f37588b);
                videoInfo.h(this.f37589c);
                FullScreenActivity_.i0(ShareWebActivity.this.f37541z).a(videoInfo).start();
            }
        }

        /* loaded from: classes4.dex */
        class f0 implements Runnable {
            f0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ShareWebActivity.this.o1();
            }
        }

        /* loaded from: classes4.dex */
        class g implements Runnable {
            g() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ShareWebActivity.this.C = true;
                IntentUtil.getInstance().goAccountUpgradeActivity(ShareWebActivity.this.f37541z);
            }
        }

        /* loaded from: classes4.dex */
        class g0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37593b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f37594c;

            g0(String str, String str2) {
                this.f37593b = str;
                this.f37594c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.papa.sim.statistic.p.l(ShareWebActivity.this.f37541z).p(this.f37593b, this.f37594c, AccountUtil_.getInstance_(ShareWebActivity.this.f37541z).getUid());
            }
        }

        /* loaded from: classes4.dex */
        class h implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37596b;

            h(String str) {
                this.f37596b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    ShareWebActivity.this.f37541z.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + this.f37596b + "&version=1")));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes4.dex */
        class h0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37598b;

            /* loaded from: classes4.dex */
            class a implements View.OnClickListener {
                a() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (System.currentTimeMillis() - ShareWebActivity.this.f37540y <= 2000) {
                        return;
                    }
                    ShareWebActivity.this.f37540y = System.currentTimeMillis();
                    h0 h0Var = h0.this;
                    com.join.mgps.Util.s.s(ShareWebActivity.this, h0Var.f37598b, 5);
                }
            }

            h0(String str) {
                this.f37598b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str = this.f37598b;
                if (str != null && !str.equals("")) {
                    ShareWebActivity.this.f37522j.setVisibility(0);
                    ShareWebActivity.this.f37522j.setOnClickListener(new a());
                    return;
                }
                ShareWebActivity.this.f37522j.setVisibility(8);
            }
        }

        /* loaded from: classes4.dex */
        class i implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f37601b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f37602c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f37603d;

            i(int i4, String str, int i5) {
                this.f37601b = i4;
                this.f37602c = str;
                this.f37603d = i5;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.join.mgps.Util.s.q(ShareWebActivity.this.f37541z, this.f37601b, this.f37602c, this.f37603d, 5);
            }
        }

        /* loaded from: classes4.dex */
        class i0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37605b;

            i0(String str) {
                this.f37605b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (com.join.mgps.Util.g2.h(this.f37605b)) {
                        return;
                    }
                    StartGameMeta startGameMeta = (StartGameMeta) JsonMapper.getInstance().fromJson(this.f37605b, StartGameMeta.class);
                    Intent intent = new Intent();
                    intent.addFlags(8388608);
                    intent.setComponent(new ComponentName(startGameMeta.getPackageName(), startGameMeta.getActivityName()));
                    String uid = AccountUtil_.getInstance_(ShareWebActivity.this.f37541z).getUid();
                    intent.putExtra("uid", uid);
                    startGameMeta.setUserID(uid);
                    startGameMeta.setPa_package_name(ShareWebActivity.this.f37541z.getPackageName());
                    intent.putExtra("jsonData", JsonMapper.getInstance().toJson(startGameMeta));
                    intent.setAction("android.intent.action.VIEW");
                    try {
                        ShareWebActivity.this.f37541z.startActivity(intent);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        }

        /* loaded from: classes4.dex */
        class j implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37607b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f37608c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f37609d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f37610e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f37611f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f37612g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String f37613h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f37614i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ String f37615j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ String f37616k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ String f37617l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ String f37618m;

            j(String str, int i4, String str2, String str3, String str4, int i5, String str5, String str6, String str7, String str8, String str9, String str10) {
                this.f37607b = str;
                this.f37608c = i4;
                this.f37609d = str2;
                this.f37610e = str3;
                this.f37611f = str4;
                this.f37612g = i5;
                this.f37613h = str5;
                this.f37614i = str6;
                this.f37615j = str7;
                this.f37616k = str8;
                this.f37617l = str9;
                this.f37618m = str10;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    PapayOrder papayOrder = new PapayOrder();
                    papayOrder.APPKEY = this.f37607b;
                    papayOrder.PAYTYPE = this.f37608c;
                    papayOrder.NOTIFY_URI = this.f37609d;
                    papayOrder.APP_NAME = this.f37610e;
                    papayOrder.APP_ORDER_ID = this.f37611f;
                    papayOrder.PA_OPEN_UID = this.f37612g;
                    papayOrder.APP_USER_ID = this.f37613h;
                    papayOrder.APP_USER_NAME = "";
                    papayOrder.PRODUCT_ID = this.f37614i;
                    papayOrder.PRODUCT_NAME = this.f37615j;
                    papayOrder.MONEY_AMOUNT = this.f37616k;
                    papayOrder.APP_DISTRICT = 1;
                    papayOrder.APP_SERVER = 1;
                    papayOrder.APP_EXT1 = this.f37617l;
                    papayOrder.APP_EXT2 = this.f37618m;
                    papayOrder.PAYORRECHARGE = 1;
                    ShareWebActivity.this.O1(papayOrder);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes4.dex */
        class j0 implements Runnable {
            j0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ShareWebActivity.this.F1();
            }
        }

        /* loaded from: classes4.dex */
        class k implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37621b;

            k(String str) {
                this.f37621b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.join.mgps.Util.s.s(ShareWebActivity.this, this.f37621b, 5);
            }
        }

        /* loaded from: classes4.dex */
        class k0 implements Runnable {
            k0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ShareWebActivity.this.C1();
            }
        }

        /* loaded from: classes4.dex */
        class l implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37624b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f37625c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f37626d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f37627e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f37628f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ String f37629g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String f37630h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f37631i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ String f37632j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ String f37633k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ String f37634l;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ String f37635m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ String f37636n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ String f37637o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ String f37638p;

            l(String str, int i4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
                this.f37624b = str;
                this.f37625c = i4;
                this.f37626d = str2;
                this.f37627e = str3;
                this.f37628f = str4;
                this.f37629g = str5;
                this.f37630h = str6;
                this.f37631i = str7;
                this.f37632j = str8;
                this.f37633k = str9;
                this.f37634l = str10;
                this.f37635m = str11;
                this.f37636n = str12;
                this.f37637o = str13;
                this.f37638p = str14;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    PapayOrder papayOrder = new PapayOrder();
                    papayOrder.APPKEY = this.f37624b;
                    papayOrder.PAYTYPE = this.f37625c;
                    papayOrder.NOTIFY_URI = this.f37626d;
                    papayOrder.APP_NAME = this.f37627e;
                    papayOrder.APP_ORDER_ID = this.f37628f;
                    if (com.join.mgps.Util.g2.i(this.f37629g)) {
                        papayOrder.PA_OPEN_UID = Integer.parseInt(this.f37629g);
                    }
                    papayOrder.APP_USER_ID = this.f37630h;
                    papayOrder.APP_USER_NAME = this.f37627e;
                    papayOrder.PRODUCT_ID = this.f37631i;
                    papayOrder.PRODUCT_NAME = this.f37632j;
                    papayOrder.MONEY_AMOUNT = this.f37633k;
                    papayOrder.APP_DISTRICT = 1;
                    papayOrder.APP_SERVER = 1;
                    papayOrder.APP_EXT1 = this.f37634l;
                    papayOrder.APP_EXT2 = this.f37635m;
                    papayOrder.PAYORRECHARGE = 1;
                    papayOrder.PRIVATEKEY = this.f37636n;
                    papayOrder.TOKEN = this.f37637o;
                    if (com.join.mgps.Util.g2.i(this.f37638p)) {
                        papayOrder.PAYSHOWTYPE = Integer.parseInt(this.f37638p);
                    }
                    ShareWebActivity.this.O1(papayOrder);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes4.dex */
        class l0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37640b;

            /* loaded from: classes4.dex */
            class a implements GameRoomActivity.x {
                a() {
                }

                @Override // com.join.mgps.activity.arena.GameRoomActivity.x
                public void onFail(int i4) {
                }

                @Override // com.join.mgps.activity.arena.GameRoomActivity.x
                public void onSuccess(int i4, int i5) {
                    l0 l0Var = l0.this;
                    ShareWebActivity.this.w1(l0Var.f37640b);
                }

                @Override // com.join.mgps.activity.arena.GameRoomActivity.x
                public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
                }
            }

            l0(String str) {
                this.f37640b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    UtilsMy.z0(ShareWebActivity.this.f37541z, 4, "", "FIGHT_LOBBY", new a());
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes4.dex */
        class m implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f37643b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f37644c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f37645d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f37646e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f37647f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ String f37648g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ String f37649h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ String f37650i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ String f37651j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ String f37652k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ String f37653l;

            m(int i4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
                this.f37643b = i4;
                this.f37644c = str;
                this.f37645d = str2;
                this.f37646e = str3;
                this.f37647f = str4;
                this.f37648g = str5;
                this.f37649h = str6;
                this.f37650i = str7;
                this.f37651j = str8;
                this.f37652k = str9;
                this.f37653l = str10;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    PapayOrder papayOrder = new PapayOrder();
                    papayOrder.APPKEY = "qh97";
                    papayOrder.PAYTYPE = this.f37643b;
                    papayOrder.NOTIFY_URI = this.f37644c;
                    papayOrder.APP_NAME = this.f37645d;
                    papayOrder.APP_ORDER_ID = this.f37646e;
                    if (com.join.mgps.Util.g2.i(this.f37647f)) {
                        papayOrder.PA_OPEN_UID = Integer.parseInt(this.f37647f);
                    }
                    papayOrder.APP_USER_ID = this.f37648g;
                    papayOrder.APP_USER_NAME = this.f37645d;
                    papayOrder.PRODUCT_ID = this.f37649h;
                    papayOrder.PRODUCT_NAME = this.f37650i;
                    papayOrder.MONEY_AMOUNT = this.f37651j;
                    papayOrder.APP_DISTRICT = 1;
                    papayOrder.APP_SERVER = 1;
                    papayOrder.APP_EXT1 = this.f37652k;
                    papayOrder.APP_EXT2 = this.f37653l;
                    papayOrder.PAYORRECHARGE = 2;
                    ShareWebActivity.this.O1(papayOrder);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes4.dex */
        class m0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37655b;

            m0(String str) {
                this.f37655b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    IntentUtil.getInstance().goQQGroup(ShareWebActivity.this.f37541z, this.f37655b);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes4.dex */
        class n implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f37657b;

            n(boolean z4) {
                this.f37657b = z4;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f37657b) {
                    ShareWebActivity.this.f37526n.setVisibility(0);
                } else {
                    ShareWebActivity.this.f37526n.setVisibility(8);
                }
            }
        }

        /* loaded from: classes4.dex */
        class n0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37659b;

            n0(String str) {
                this.f37659b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                ShareWebActivity.this.f37520h.setText(this.f37659b);
            }
        }

        /* renamed from: com.join.mgps.activity.ShareWebActivity$o$o  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class RunnableC0334o implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f37661b;

            RunnableC0334o(boolean z4) {
                this.f37661b = z4;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f37661b) {
                    ShareWebActivity.this.f37532r.setVisibility(0);
                } else {
                    ShareWebActivity.this.f37532r.setVisibility(8);
                }
            }
        }

        /* loaded from: classes4.dex */
        class o0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37663b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f37664c;

            o0(String str, String str2) {
                this.f37663b = str;
                this.f37664c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z4;
                try {
                    List<DownloadTask> I = p1.f.K().I(this.f37663b);
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
                                    if (com.join.android.app.common.utils.e.l0(ShareWebActivity.this).d(ShareWebActivity.this, downloadTask2.getPackageName()) && downloadTask2.getStatus() == 5) {
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
                    if ("login".equals(this.f37664c)) {
                        UtilsMy.W3(ShareWebActivity.this, downloadTask, this.f37664c);
                    } else {
                        UtilsMy.T3(ShareWebActivity.this, downloadTask);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes4.dex */
        class p implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f37666b;

            p(boolean z4) {
                this.f37666b = z4;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f37666b) {
                    ShareWebActivity.this.f37527o.setVisibility(0);
                } else {
                    ShareWebActivity.this.f37527o.setVisibility(8);
                }
            }
        }

        /* loaded from: classes4.dex */
        class p0 implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37668b;

            p0(String str) {
                this.f37668b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    IntentDateBean intentDateBean = (IntentDateBean) JsonMapper.getInstance().fromJson(this.f37668b, IntentDateBean.class);
                    intentDateBean.setExtBean(new ExtBean(120));
                    if (intentDateBean.getObject() != null && (intentDateBean.getObject() instanceof Map)) {
                        HashMap hashMap = (HashMap) intentDateBean.getObject();
                        if (hashMap.containsKey("from") && hashMap.get("from") != null && (hashMap.get("from") instanceof Integer)) {
                            intentDateBean.setExtBean(new ExtBean(((Integer) hashMap.get("from")).intValue()));
                        }
                    }
                    if (intentDateBean.getLink_type() == 5) {
                        MApplication.f1497x.G(true);
                    }
                    IntentUtil.getInstance().intentActivity(ShareWebActivity.this, intentDateBean);
                } catch (Exception e5) {
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
                IntentUtil.getInstance().goAccountCenterActivity(ShareWebActivity.this.f37541z);
            }
        }

        /* loaded from: classes4.dex */
        class q0 implements Runnable {
            q0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                WebAccountDataBean webAccountDataBean = new WebAccountDataBean();
                ShareWebActivity shareWebActivity = ShareWebActivity.this;
                shareWebActivity.B = AccountUtil_.getInstance_(shareWebActivity.f37541z).getAccountData();
                webAccountDataBean.setAccountBean(AccountBean.convert(ShareWebActivity.this.B));
                if (ShareWebActivity.this.B == null) {
                    ShareWebActivity.this.C = true;
                    IntentUtil.getInstance().goMyAccountLoginActivity(ShareWebActivity.this.f37541z, 0, 2);
                    return;
                }
                webAccountDataBean.setHasLogin(true);
                LJWebView lJWebView = ShareWebActivity.this.f37525m;
                lJWebView.w("javascript:papaPutAccountData(" + JsonMapper.getInstance().toJson(webAccountDataBean) + ")");
            }
        }

        /* loaded from: classes4.dex */
        class r implements Runnable {
            r() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IntentUtil.getInstance().goJoystickManager(ShareWebActivity.this.f37541z);
            }
        }

        /* loaded from: classes4.dex */
        class r0 implements Runnable {
            r0() {
            }

            @Override // java.lang.Runnable
            public void run() {
                WebAccountDataBean webAccountDataBean = new WebAccountDataBean();
                ShareWebActivity shareWebActivity = ShareWebActivity.this;
                shareWebActivity.B = AccountUtil_.getInstance_(shareWebActivity.f37541z).getAccountData();
                webAccountDataBean.setAccountBean(AccountBean.convert(ShareWebActivity.this.B));
                if (!AccountUtil_.getInstance_(ShareWebActivity.this.f37541z).isTourist() && ShareWebActivity.this.B != null && !TextUtils.isEmpty(ShareWebActivity.this.B.getToken())) {
                    AccountUtil_.getInstance_(ShareWebActivity.this.f37541z).accountLoginOut(ShareWebActivity.this.f37541z);
                }
                ShareWebActivity.this.C = true;
                IntentUtil.getInstance().goMyAccountLoginActivity(ShareWebActivity.this.f37541z, 0, 2);
            }
        }

        /* loaded from: classes4.dex */
        class s implements Runnable {
            s() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IntentUtil.getInstance().goCodesBoxActivity(ShareWebActivity.this.f37541z);
            }
        }

        /* loaded from: classes4.dex */
        class t implements Runnable {
            t() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IntentUtil.getInstance().goDownloadCenterActivity(ShareWebActivity.this.f37541z);
            }
        }

        /* loaded from: classes4.dex */
        class u implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f37676b;

            u(boolean z4) {
                this.f37676b = z4;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f37676b) {
                    ShareWebActivity.this.f37531q.setVisibility(0);
                } else {
                    ShareWebActivity.this.f37531q.setVisibility(8);
                }
            }
        }

        /* loaded from: classes4.dex */
        class v implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37678b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f37679c;

            v(String str, String str2) {
                this.f37678b = str;
                this.f37679c = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.papa.sim.statistic.p.l(ShareWebActivity.this.f37541z).p(this.f37678b, this.f37679c, AccountUtil_.getInstance_(ShareWebActivity.this.f37541z).getUid());
            }
        }

        /* loaded from: classes4.dex */
        class w implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f37681b;

            w(boolean z4) {
                this.f37681b = z4;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f37681b) {
                    ShareWebActivity.this.f37528p.setVisibility(0);
                } else {
                    ShareWebActivity.this.f37528p.setVisibility(8);
                }
            }
        }

        /* loaded from: classes4.dex */
        class x implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f37683b;

            x(String str) {
                this.f37683b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.join.mgps.Util.l2.a(ShareWebActivity.this.f37541z).b(this.f37683b);
            }
        }

        /* loaded from: classes4.dex */
        class y implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f37685b;

            y(int i4) {
                this.f37685b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    ShareWebActivity.this.O.b();
                    ShareWebActivity.this.Y0(this.f37685b);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        /* loaded from: classes4.dex */
        class z implements Runnable {
            z() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ShareWebActivity.this.r1();
            }
        }

        public o() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit d(String str) {
            com.join.android.app.common.utils.e.l0(ShareWebActivity.this.f37541z).w(ShareWebActivity.this.f37541z, new File(str));
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit e(String str) {
            com.join.android.app.common.utils.e.l0(ShareWebActivity.this.f37541z).w(ShareWebActivity.this.f37541z, new File(str));
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Intent intent = new Intent(BAction.ACTION_REAL_NAME_RESULT);
            intent.putExtra("result", 1);
            ShareWebActivity.this.sendBroadcast(intent);
            IntentDateBean intentDateBean = ShareWebActivity.this.D;
            String str = "0";
            if (intentDateBean != null) {
                String ext3 = intentDateBean.getExt3();
                if (!com.join.mgps.Util.g2.h(ext3)) {
                    str = ext3;
                }
            }
            com.join.mgps.va.overmind.d.h0(intent, Integer.parseInt(str));
        }

        @JavascriptInterface
        public void changeAccount(String str) {
            try {
                AccountUtil_.getInstance_(ShareWebActivity.this.f37541z).saveAccountData(b3.a.a((AccountBean) JsonMapper.getInstance().fromJson(str, AccountBean.class)), ShareWebActivity.this.f37541z);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @JavascriptInterface
        public int channelType() {
            return 1;
        }

        @JavascriptInterface
        public boolean checkAppHasInstall(String str) {
            try {
                return com.join.android.app.common.utils.e.l0(ShareWebActivity.this.f37541z).d(ShareWebActivity.this.f37541z, str);
            } catch (Exception e5) {
                e5.printStackTrace();
                return false;
            }
        }

        @JavascriptInterface
        public String checkAppInfo(String str) {
            APKUtils.a aVar;
            try {
                aVar = com.join.android.app.common.utils.e.l0(ShareWebActivity.this.f37541z).l(ShareWebActivity.this.f37541z, str);
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
            return com.join.android.app.common.utils.j.j(ShareWebActivity.this.f37541z) ? 1 : 0;
        }

        @JavascriptInterface
        public String checkWufunPapaPlatform() {
            return "wufun";
        }

        @JavascriptInterface
        public void checkin(boolean z4) {
            ShareWebActivity.this.f37516d.post(new e(z4));
        }

        @JavascriptInterface
        public void copyToClipboard(String str) {
            if (com.join.mgps.Util.g2.i(str)) {
                com.join.mgps.Util.j0.M(ShareWebActivity.this.f37541z, str);
                com.join.mgps.Util.l2.a(ShareWebActivity.this.f37541z).b("复制成功！");
            }
        }

        @JavascriptInterface
        public void creatVipOrder(int i4) {
            ShareWebActivity.this.f37516d.post(new y(i4));
        }

        @JavascriptInterface
        public void downloadApkGameByUrl(String str, String str2, String str3, String str4) {
            if (System.currentTimeMillis() - ShareWebActivity.this.W < 1000) {
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
                com.php25.PDownload.d.c(downloadTask, ShareWebActivity.this.f37541z);
                com.papa.sim.statistic.p.l(ShareWebActivity.this.f37541z).O1(Event.tencentArena, new Ext().setReMarks(str2));
            }
        }

        @JavascriptInterface
        public void downloadFile(String str, String str2) {
            UtilsMy.P0(ShareWebActivity.this.f37541z, str, str2);
        }

        @JavascriptInterface
        public void downloadGame(String str) {
            com.php25.PDownload.d.c((DownloadTask) JsonMapper.getInstance().fromJson(str, DownloadTask.class), ShareWebActivity.this.f37541z);
        }

        @JavascriptInterface
        public void downloadGameByGameId(String str) {
            ShareWebActivity.this.h1(str, null, 0);
        }

        @JavascriptInterface
        public void downloadGameByGameIdAndFrom(String str, int i4) {
            ShareWebActivity.this.h1(str, null, i4);
        }

        @JavascriptInterface
        public void downloadGameByGameIdAndUrl(String str, String str2) {
            ShareWebActivity.this.h1(str, str2, 0);
        }

        @JavascriptInterface
        public void downloadGameByGameIdIfNoGame(String str) {
            if (p1.f.K().F(str) == null) {
                ShareWebActivity.this.h1(str, null, 0);
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
            ShareWebActivity.this.f37516d.post(new q0());
        }

        @JavascriptInterface
        public String getAccountVer2() {
            WebAccountDataBean webAccountDataBean = new WebAccountDataBean();
            ShareWebActivity shareWebActivity = ShareWebActivity.this;
            shareWebActivity.B = AccountUtil_.getInstance_(shareWebActivity.f37541z).getAccountData();
            if (ShareWebActivity.this.B != null) {
                webAccountDataBean.setAccountBean(AccountBean.convert(ShareWebActivity.this.B));
                webAccountDataBean.setHasLogin(true);
            } else {
                webAccountDataBean.setHasLogin(false);
            }
            JsonMapper.getInstance().toJson(webAccountDataBean);
            return JsonMapper.getInstance().toJson(webAccountDataBean);
        }

        @JavascriptInterface
        public String getAesAndroidId() {
            return com.join.mgps.Util.g2.g(MApplication.G);
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
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).e(ShareWebActivity.this.f37541z);
        }

        @JavascriptInterface
        public String getAndroidVersion() {
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).s();
        }

        @JavascriptInterface
        public String getAppversionName() {
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).z();
        }

        @JavascriptInterface
        public String getDeviceId() {
            return com.papa.sim.statistic.s.f(ShareWebActivity.this.f37541z).b();
        }

        @JavascriptInterface
        public String getIMEI() {
            return com.papa.sim.statistic.s.f(ShareWebActivity.this.f37541z).b();
        }

        @JavascriptInterface
        public int getNowVersion() {
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).y();
        }

        @JavascriptInterface
        public String getOaid() {
            return com.papa.sim.statistic.s.f(ShareWebActivity.this.f37541z).j();
        }

        @JavascriptInterface
        public String getPackageName() {
            return ShareWebActivity.this.getPackageName();
        }

        @JavascriptInterface
        public String getPapaUIDAndToken() {
            ShareWebActivity shareWebActivity = ShareWebActivity.this;
            shareWebActivity.B = AccountUtil_.getInstance_(shareWebActivity.f37541z).getAccountData();
            if (ShareWebActivity.this.B == null || ShareWebActivity.this.B.n2() != 1) {
                IntentUtil.getInstance().goMyAccountLoginActivity(ShareWebActivity.this.f37541z, 0, 2);
                return "";
            }
            return JsonMapper.toJsonString(new PaOpenBean(ShareWebActivity.this.B.getUid(), ShareWebActivity.this.B.getToken()));
        }

        @JavascriptInterface
        public String getPhoneModle() {
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).q();
        }

        @JavascriptInterface
        public String getSdkIntentData(String str) {
            SharedPreferences sharedPreferences = ShareWebActivity.this.getSharedPreferences("Papa_Stat_SharedPreferences", 0);
            return sharedPreferences.getString("papasdk_" + str, "");
        }

        @JavascriptInterface
        public int getSingleGameADCount() {
            return new UserPrefs(ShareWebActivity.this.f37541z).getAdGamesHasSeeCount();
        }

        @JavascriptInterface
        public String getStringByKey(String str) {
            SharedPreferences sharedPreferences = ShareWebActivity.this.f37541z.getSharedPreferences("Papa_Stat_SharedPreferences", 0);
            return sharedPreferences.getString("papaH5_" + str, "");
        }

        @JavascriptInterface
        public String getUMIDString() {
            try {
                return UMConfigure.getUMIDString(ShareWebActivity.this.f37541z);
            } catch (Exception unused) {
                return "";
            }
        }

        @JavascriptInterface
        public String getVendor() {
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).x();
        }

        @JavascriptInterface
        public void goAccountCenter() {
            ShareWebActivity.this.f37516d.post(new q());
        }

        @JavascriptInterface
        public void goAccountDetial() {
            ShareWebActivity.this.f37516d.post(new a0());
        }

        @JavascriptInterface
        public void goBackUrl(String str) {
            ShareWebActivity.this.f37516d.post(new b(str));
        }

        @JavascriptInterface
        public void goChoiceUploadImage() {
            ShareWebActivity.this.f37516d.post(new c0());
        }

        @JavascriptInterface
        public void goCodesBoxActivity() {
            ShareWebActivity.this.f37516d.post(new s());
        }

        @JavascriptInterface
        public void goDownloadCenter() {
            ShareWebActivity.this.f37516d.post(new t());
        }

        @JavascriptInterface
        public void goGameDetail(String str) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(1);
            intentDateBean.setCrc_link_type_val(str);
            intentDateBean.setExtBean(new ExtBean(120));
            IntentUtil.getInstance().intentActivity(ShareWebActivity.this, intentDateBean);
        }

        @JavascriptInterface
        public void goHandShark() {
            ShareWebActivity.this.f37516d.post(new r());
        }

        @JavascriptInterface
        public void goMainLabel(String str) {
            ShareWebActivity.this.f37516d.post(new d0(str));
        }

        @JavascriptInterface
        public void goProfileMessage() {
            ShareWebActivity.this.f37516d.post(new b0());
        }

        @JavascriptInterface
        public void goQQGroup(String str) {
            ShareWebActivity.this.f37516d.post(new m0(str));
        }

        @JavascriptInterface
        public void goSearchLabel() {
            ShareWebActivity.this.f37516d.post(new f0());
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
                            if (com.join.android.app.common.utils.e.l0(ShareWebActivity.this).d(ShareWebActivity.this, downloadTask2.getPackageName()) && downloadTask2.getStatus() == 5) {
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
            APKUtils.k0(F.getGameZipPath(), F, new Function1() { // from class: com.join.mgps.activity.y2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit d5;
                    d5 = ShareWebActivity.o.this.d((String) obj);
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
            APKUtils.k0(downloadTask.getGameZipPath(), downloadTask, new Function1() { // from class: com.join.mgps.activity.x2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit e5;
                    e5 = ShareWebActivity.o.this.e((String) obj);
                    return e5;
                }
            });
            return 1;
        }

        @JavascriptInterface
        public void intentQQ(String str) {
            ShareWebActivity.this.f37516d.post(new h(str));
        }

        @JavascriptInterface
        public void intentToCompletAccount() {
            ShareWebActivity.this.f37516d.post(new g());
        }

        @JavascriptInterface
        public void joinAction(String str, String str2) {
            ShareWebActivity.this.f37516d.post(new g0(str, str2));
        }

        @JavascriptInterface
        public void jumpGameMatch(String str) {
            ShareWebActivity.this.f37516d.post(new l0(str));
        }

        @JavascriptInterface
        public void launchMiniProgram(int i4, String str, String str2) {
            ShareWebActivity.this.k1(i4, str, str2);
        }

        @JavascriptInterface
        public void liveIntentTo(int i4) {
        }

        @JavascriptInterface
        public void login() {
            ShareWebActivity.this.f37516d.post(new r0());
        }

        @JavascriptInterface
        public void openAction(String str, String str2) {
            ShareWebActivity.this.f37516d.post(new v(str, str2));
        }

        @JavascriptInterface
        public void papaLiveCropImage() {
            ShareWebActivity.this.f37516d.post(new z());
        }

        @JavascriptInterface
        public void payByPapa(String str, int i4, String str2, String str3, String str4, int i5, String str5, String str6, String str7, String str8, String str9, String str10) {
            ShareWebActivity.this.f37516d.post(new j(str, i4, str2, str3, str4, i5, str5, str6, str7, str8, str9, str10));
        }

        @JavascriptInterface
        public void payGameFinish(int i4) {
            if (i4 == 1) {
                ShareWebActivity.this.setResult(10010);
            } else if (i4 == 2) {
                ShareWebActivity.this.setResult(10011);
            }
            ShareWebActivity.this.finish();
        }

        @JavascriptInterface
        public void playVideo(String str, String str2) {
            ShareWebActivity.this.f37516d.post(new f(str, str2));
        }

        @JavascriptInterface
        public void rechargePabiFrom(String str, int i4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            ShareWebActivity.this.f37516d.post(new m(i4, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11));
        }

        @JavascriptInterface
        public void saveStringByKey(String str, String str2) {
            SharedPreferences.Editor edit = ShareWebActivity.this.f37541z.getSharedPreferences("Papa_Stat_SharedPreferences", 0).edit();
            edit.putString("papaH5_" + str, str2);
            edit.commit();
        }

        @JavascriptInterface
        public void setFullScreenJs(String str) {
            ShareWebActivity.this.f37516d.post(new j0());
        }

        @JavascriptInterface
        public void setQuitFullScreenJs(String str) {
            ShareWebActivity.this.f37516d.post(new k0());
        }

        @JavascriptInterface
        public void setScreenLandOrPort(int i4) {
            ShareWebActivity.this.f37516d.post(new c(i4));
        }

        @JavascriptInterface
        public void setTitle(String str) {
            ShareWebActivity.this.f37516d.post(new n0(str));
        }

        @JavascriptInterface
        public void shareFromJson(String str) {
            ShareWebActivity.this.f37516d.post(new k(str));
        }

        @JavascriptInterface
        public void shareToOne(int i4, String str) {
            ShareWebActivity.this.f37516d.post(new a(str, i4));
        }

        @JavascriptInterface
        public void shareToOneImageOrText(int i4, String str, int i5) {
            ShareWebActivity.this.f37516d.post(new i(i4, str, i5));
        }

        @JavascriptInterface
        public void showBackNew(boolean z4) {
            ShareWebActivity.this.f37516d.post(new w(z4));
        }

        @JavascriptInterface
        public void showDownLiveDialog() {
        }

        @JavascriptInterface
        public void showDownload(boolean z4) {
            ShareWebActivity.this.f37516d.post(new RunnableC0334o(z4));
        }

        @JavascriptInterface
        public void showFinish(boolean z4) {
            ShareWebActivity.this.f37516d.post(new u(z4));
        }

        @JavascriptInterface
        public void showRefresh(boolean z4) {
            ShareWebActivity.this.f37516d.post(new n(z4));
        }

        @JavascriptInterface
        public void showSearch(boolean z4) {
            ShareWebActivity.this.f37516d.post(new p(z4));
        }

        @JavascriptInterface
        public void showShareButn(String str) {
            ShareWebActivity.this.f37516d.post(new h0(str));
        }

        @JavascriptInterface
        public void showTitle(boolean z4) {
            ShareWebActivity.this.f37516d.post(new d(z4));
        }

        @JavascriptInterface
        public void startGame(String str, String str2) {
            ShareWebActivity.this.f37516d.post(new o0(str, str2));
        }

        @JavascriptInterface
        public void startGameFromJson(String str) {
            ShareWebActivity.this.f37516d.post(new i0(str));
        }

        @JavascriptInterface
        public void startH5Game(String str) {
            CollectionBeanSub collectionBeanSub;
            DownloadTask downloadtaskDown;
            try {
                if (!com.join.mgps.Util.g2.i(str) || (collectionBeanSub = (CollectionBeanSub) JsonMapper.getInstance().fromJson(str, CollectionBeanSub.class)) == null || (downloadtaskDown = collectionBeanSub.getDownloadtaskDown()) == null) {
                    return;
                }
                UtilsMy.T2(downloadtaskDown, ShareWebActivity.this.f37541z);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @JavascriptInterface
        public void startIntent(String str) {
            ShareWebActivity.this.f37516d.post(new p0(str));
        }

        @JavascriptInterface
        public void startWechatApp(String str, String str2, String str3) {
            IWXAPI createWXAPI = WXAPIFactory.createWXAPI(ShareWebActivity.this.f37541z, str);
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
            ShareWebActivity.this.f37516d.post(new x(str));
        }

        @JavascriptInterface
        public void updateAccount() {
            ShareWebActivity.this.l1();
        }

        @JavascriptInterface
        public void updateRealNameState() {
            try {
                ShareWebActivity.this.f37516d.post(new Runnable() { // from class: com.join.mgps.activity.w2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ShareWebActivity.o.this.f();
                    }
                });
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void updateVip() {
            ShareWebActivity.this.checkToken();
        }

        @JavascriptInterface
        public void goMainLabel(String str, String str2, String str3) {
            ShareWebActivity.this.f37516d.post(new e0(str, str2, str3));
        }

        @JavascriptInterface
        public void payByPapa(String str, String str2, int i4, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            ShareWebActivity.this.f37516d.post(new l(str, i4, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str2, str13, str14));
        }

        @JavascriptInterface
        public String getSdkIntentData() {
            IntentDataMain intentDataMain = ShareWebActivity.this.E;
            return intentDataMain != null ? intentDataMain.getData() : "";
        }
    }

    /* loaded from: classes4.dex */
    public class p {

        /* loaded from: classes4.dex */
        class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f37689b;

            a(int i4) {
                this.f37689b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i4 = this.f37689b;
                if (i4 == 0) {
                    ShareWebActivity.this.setRequestedOrientation(4);
                } else if (i4 == 1) {
                    ShareWebActivity.this.setRequestedOrientation(0);
                } else if (i4 == 2) {
                    ShareWebActivity.this.setRequestedOrientation(1);
                } else if (i4 != 3) {
                } else {
                    ShareWebActivity.this.F1();
                }
            }
        }

        public p() {
        }

        @JavascriptInterface
        public void alipay(String str) {
            if (com.join.mgps.Util.g2.i(str)) {
                ShareWebActivity.this.P1(str);
            }
        }

        @JavascriptInterface
        public boolean checkAppHasInstall(String str) {
            try {
                return com.join.android.app.common.utils.e.l0(ShareWebActivity.this.f37541z).d(ShareWebActivity.this.f37541z, str);
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
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).s();
        }

        @JavascriptInterface
        public String getAppversionName() {
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).z();
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
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).i();
        }

        @JavascriptInterface
        public String getGameName() {
            try {
                return ShareWebActivity.this.getResources().getString(R.string.app_name);
            } catch (Exception unused) {
                return "";
            }
        }

        @JavascriptInterface
        public String getIMEI() {
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).i();
        }

        @JavascriptInterface
        public int getNowVersion() {
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).y();
        }

        @JavascriptInterface
        public String getOaid() {
            return com.papa.sim.statistic.s.f(ShareWebActivity.this.f37541z).j();
        }

        @JavascriptInterface
        public String getPhoneModle() {
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).q();
        }

        @JavascriptInterface
        public String getQdId() {
            return com.papa.sim.statistic.k.a(ShareWebActivity.this.f37541z);
        }

        @JavascriptInterface
        public String getUMIDString() {
            try {
                return UMConfigure.getUMIDString(ShareWebActivity.this.f37541z);
            } catch (Exception unused) {
                return "";
            }
        }

        @JavascriptInterface
        public String getVendor() {
            return com.join.android.app.common.utils.n.n(ShareWebActivity.this.f37541z).x();
        }

        @JavascriptInterface
        public void openWeb(String str) {
            IntentUtil.getInstance().goShareWebActivity(ShareWebActivity.this.f37541z, str);
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
            ShareWebActivity.this.f37516d.post(new a(i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class q extends WebViewClient {
        public q(Context context) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (str.endsWith(".zip")) {
                return;
            }
            String str2 = ShareWebActivity.this.f37514b;
            com.join.mgps.Util.v0.b(str2, "onPageFinished() called." + str);
            if (str.startsWith(com.facebook.common.util.f.f10923a) || str.startsWith("https") || str.startsWith("file://")) {
                ShareWebActivity.this.f37538w = str;
            }
            if (!ShareWebActivity.this.f37538w.equals("data:text/html,chromewebdata") && !ShareWebActivity.this.A) {
                webView.getSettings().setBlockNetworkImage(false);
            } else {
                ShareWebActivity.this.showLodingFailed();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            String str2 = ShareWebActivity.this.f37514b;
            com.join.mgps.Util.v0.b(str2, "onPageStarted() called." + str);
            if (str.endsWith(".zip")) {
                return;
            }
            if (str.startsWith(com.facebook.common.util.f.f10923a) || str.startsWith("https") || str.startsWith("file://")) {
                ShareWebActivity.this.f37538w = str;
            }
            ShareWebActivity.this.showLoding();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i4, String str, String str2) {
            super.onReceivedError(webView, i4, str, str2);
            String str3 = ShareWebActivity.this.f37514b;
            com.join.mgps.Util.v0.b(str3, "onReceivedError() called." + str2);
            if (str2.endsWith(".zip")) {
                return;
            }
            ShareWebActivity.this.A = true;
            webView.loadDataWithBaseURL(null, "", "text/html", "utf-8", null);
            ShareWebActivity.this.showLodingFailed();
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
            com.join.mgps.Util.v0.b(ShareWebActivity.this.f37514b, "shouldOverrideUrlLoading() called.");
            if (!com.join.android.app.common.utils.j.j(ShareWebActivity.this.f37541z)) {
                com.join.mgps.Util.l2.a(ShareWebActivity.this.f37541z).b(ShareWebActivity.this.getString(R.string.net_connect_failed));
            } else if (!str.startsWith("weixin:")) {
                if (str.startsWith(com.facebook.common.util.f.f10923a) || str.startsWith("https") || str.startsWith("file://")) {
                    ShareWebActivity.this.f37538w = str;
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                try {
                    ShareWebActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return true;
            } else {
                try {
                    ShareWebActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A1() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        this.f37541z.startActivityForResult(Intent.createChooser(intent, "Image Chooser"), 43234);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B1(String str) {
        DownloadManager downloadManager = (DownloadManager) getSystemService("download");
        Cursor query = downloadManager.query(new DownloadManager.Query());
        while (query.moveToNext()) {
            int i4 = query.getInt(query.getColumnIndex("_id"));
            String string = query.getString(query.getColumnIndex("title"));
            String string2 = query.getString(query.getColumnIndex("local_uri"));
            int i5 = query.getInt(query.getColumnIndex("status"));
            String string3 = query.getString(query.getColumnIndex("bytes_so_far"));
            String string4 = query.getString(query.getColumnIndex("total_size"));
            StringBuilder sb = new StringBuilder();
            sb.append("downId:");
            sb.append(i4);
            sb.append(",status:");
            sb.append(i5);
            sb.append(",title:");
            sb.append(string);
            sb.append(",address:");
            sb.append(string2);
            sb.append(",size:");
            sb.append(string3);
            sb.append(",sizeTotal:");
            sb.append(string4);
            if (!com.join.mgps.Util.g2.h(string2)) {
                String substring = string2.substring(string2.lastIndexOf(net.lingala.zip4j.util.e.F0) + 1);
                String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                new File(path, substring);
                if (("temp_" + str).equals(substring)) {
                    File file = new File(path, str);
                    if (file.exists()) {
                        file.delete();
                    }
                    File file2 = new File(path, substring);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    downloadManager.remove(i4);
                }
            }
        }
        query.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 != 3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C1() {
        /*
            r3 = this;
            android.widget.FrameLayout r0 = r3.f37533s
            r1 = 8
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r3.f37524l
            r1 = 0
            r0.setVisibility(r1)
            android.widget.RelativeLayout r0 = r3.f37519g
            r0.setVisibility(r1)
            int r0 = r3.H
            if (r0 == 0) goto L28
            r2 = 1
            if (r0 == r2) goto L24
            r1 = 2
            if (r0 == r1) goto L20
            r1 = 3
            if (r0 == r1) goto L28
            goto L2c
        L20:
            r3.setRequestedOrientation(r2)
            goto L2c
        L24:
            r3.setRequestedOrientation(r1)
            goto L2c
        L28:
            r0 = 4
            r3.setRequestedOrientation(r0)
        L2c:
            android.view.Window r0 = r3.getWindow()
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r1 = r0.flags
            r1 = r1 & (-1025(0xfffffffffffffbff, float:NaN))
            r0.flags = r1
            android.view.Window r1 = r3.getWindow()
            r1.setAttributes(r0)
            android.view.Window r0 = r3.getWindow()
            r1 = 512(0x200, float:7.175E-43)
            r0.clearFlags(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ShareWebActivity.C1():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:1|(22:3|(2:5|(2:7|(2:9|(2:11|(2:13|(1:15))(1:56))(1:57))(1:58))(1:59))(1:60)|16|17|18|19|(1:21)(1:52)|22|23|24|26|27|28|29|30|31|32|33|34|(1:36)(1:40)|37|38)|61|16|17|18|19|(0)(0)|22|23|24|26|27|28|29|30|31|32|33|34|(0)(0)|37|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
        r2.printStackTrace();
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
        r4 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
        r4 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
        r4.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r2.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f4, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String E1(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.ShareWebActivity.E1(java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F1() {
        getWindow().setFlags(1024, 1024);
    }

    private void H1(GameRoom gameRoom) {
        com.join.mgps.dialog.b1 b1Var = this.E1;
        if (b1Var != null) {
            b1Var.a();
        }
        com.join.mgps.dialog.b1 b1Var2 = new com.join.mgps.dialog.b1(this.f37541z);
        this.E1 = b1Var2;
        b1Var2.d("加入失败，您与" + gameRoom.getRoomId() + "房间不在同一战区\n请进入该游戏房间列表，并切换至【" + com.join.mgps.socket.fight.arena.c.d(gameRoom.getBattleArea()) + "】后再查找房间号进入");
        this.E1.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1(String str) {
        com.join.mgps.dialog.d1 d1Var = this.F1;
        if (d1Var != null && d1Var.isShowing()) {
            this.F1.dismiss();
        }
        com.join.mgps.dialog.d1 z4 = com.join.mgps.Util.b0.f0(this.f37541z).z(this.f37541z, str, false);
        this.F1 = z4;
        z4.b();
    }

    private void M1(int i4) {
        Intent intent = new Intent(this.f37541z, NewArenaDownloadActivity_.class);
        intent.putExtra("gameId", "" + this.D1.getGameId());
        intent.putExtra(NewArenaDownloadActivity_.P, this.H1);
        intent.putExtra(NewArenaDownloadActivity_.Q, this.G1);
        startActivityForResult(intent, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P1(String str) {
        new l(str).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S1() {
        Iterator<String> it2 = this.S1.iterator();
        this.N1 = it2;
        if (it2 != null && it2.hasNext()) {
            com.join.mgps.Util.h2 h2Var = this.M1;
            h2Var.f(this.N1.next(), this.B.getUid() + "", this.B.getToken());
            this.N1.remove();
            return;
        }
        LiveUploadData liveUploadData = new LiveUploadData();
        liveUploadData.setCode(1);
        if (this.P1.size() == 0) {
            liveUploadData.setCode(0);
        } else {
            try {
                List<String> list = this.P1;
                liveUploadData.setData((String[]) list.toArray(new String[list.size()]));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        String json = JsonMapper.getInstance().toJson(liveUploadData);
        LJWebView lJWebView = this.f37525m;
        lJWebView.w("javascript:papaChoiceAndUploadImg('" + json + "')");
    }

    private boolean W0() {
        if (Build.VERSION.SDK_INT >= 23) {
            ArrayList arrayList = new ArrayList();
            if (ContextCompat.checkSelfPermission(this, com.kuaishou.weapon.p0.g.f55590j) != 0) {
                arrayList.add(com.kuaishou.weapon.p0.g.f55590j);
            }
            if (ContextCompat.checkSelfPermission(this, "android.permission.CAMERA") != 0) {
                arrayList.add("android.permission.CAMERA");
            }
            if (ContextCompat.checkSelfPermission(this, com.kuaishou.weapon.p0.g.f55583c) != 0) {
                arrayList.add(com.kuaishou.weapon.p0.g.f55583c);
            }
            if (arrayList.size() != 0) {
                ActivityCompat.requestPermissions(this, (String[]) arrayList.toArray(new String[0]), 2);
                return false;
            }
            return true;
        }
        return true;
    }

    private Uri X0(String str) {
        String str2 = Environment.getExternalStorageDirectory() + "/wufan91/live";
        File file = new File(str2, this.B.getUid() + str + System.currentTimeMillis() + ".jpg");
        if (ContextCompat.checkSelfPermission(this, com.kuaishou.weapon.p0.g.f55590j) != 0) {
            ActivityCompat.requestPermissions(this, new String[]{com.kuaishou.weapon.p0.g.f55590j}, 2);
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
            Toast.makeText(this, "生成封面失败", 0).show();
        }
        return FileProvider.getUriForFile(this, getPackageName() + ".fileprovider", file);
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private boolean checkGameIsInstall(String str) {
        this.G1 = false;
        this.H1 = false;
        DownloadTask F = p1.f.K().F(str);
        if (F != null && F.getStatus() == 5) {
            this.G1 = true;
            EMUApkTable n4 = b2.p.o().n(F.getPlugin_num());
            if (n4 != null) {
                if (com.join.android.app.common.utils.l.t(this.f37541z, n4, false, new String[0]) && !UtilsMy.B0(this.f37541z, n4)) {
                    this.H1 = true;
                } else {
                    this.H1 = false;
                }
            } else {
                this.H1 = true;
            }
        } else {
            this.G1 = false;
        }
        return this.H1 && this.G1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1() {
        Activity splashActivity = IntentUtil.getInstance().getSplashActivity();
        if (splashActivity != null) {
            splashActivity.finish();
            IntentUtil.getInstance().setSplashActivity(null);
            Intent intent = new Intent();
            intent.setClass(splashActivity, MGMainActivity_.class);
            intent.setFlags(TTAdConstant.KEY_CLICK_AREA);
            intent.addFlags(536870912);
            startActivity(intent);
        }
        backModGame();
        finish();
    }

    private List<String> i1(Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            return (List) intent.getExtras().get(MyAlbumActivity.f14984x);
        }
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(int i4) {
        if (!this.L) {
            Toast.makeText(this, getString(R.string.tip_no_permission), 0).show();
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
            this.J1 = X0("");
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", this.J1);
            startActivityForResult(intent, 100);
        } else if (i4 == 200) {
            this.J1 = X0("_select");
            Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
            intent2.setType("image/*");
            startActivityForResult(intent2, 200);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1() {
        Dialog dialog = new Dialog(this, R.style.floate_dialog);
        this.I1 = dialog;
        dialog.setContentView(R.layout.dialog_pic_choose);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Window window = this.I1.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(80);
        attributes.width = defaultDisplay.getWidth();
        this.I1.getWindow().setAttributes(attributes);
        ((TextView) this.I1.findViewById(R.id.chos_camera)).setOnClickListener(new b());
        ((TextView) this.I1.findViewById(R.id.pic_lib)).setOnClickListener(new c());
        ((TextView) this.I1.findViewById(R.id.btn_cancel)).setOnClickListener(new d());
        this.I1.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t1() {
        RoomPosition p12 = this.D1.getP1();
        if (p12.getUid() == 0) {
            this.f37530p1 = 0;
        } else {
            if (p12.getUid() == this.Z.getAccountData().getUid()) {
                this.C1 = 0;
            }
            this.f37530p1 = 1;
        }
        RoomPosition p22 = this.D1.getP2();
        if (p22.getUid() == 0) {
            this.f37537v1 = 0;
        } else {
            if (p22.getUid() == this.Z.getAccountData().getUid()) {
                this.C1 = 1;
            }
            this.f37537v1 = 1;
        }
        RoomPosition p32 = this.D1.getP3();
        if (p32.getUid() == 0) {
            this.A1 = 0;
        } else {
            if (p32.getUid() == this.Z.getAccountData().getUid()) {
                this.C1 = 2;
            }
            this.A1 = 1;
        }
        RoomPosition p4 = this.D1.getP4();
        if (p4.getUid() == 0) {
            this.B1 = 0;
            return;
        }
        if (p4.getUid() == this.Z.getAccountData().getUid()) {
            this.C1 = 3;
        }
        this.B1 = 1;
    }

    private boolean u1(String str) {
        try {
            this.f37541z.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private boolean v1(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    private void x1(String str) {
        String str2 = this.f37514b;
        com.join.mgps.Util.v0.b(str2, "lodeWebView() called." + str);
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                LJWebView lJWebView = this.f37525m;
                if (lJWebView == null) {
                    return;
                }
                lJWebView.setVisibility(0);
                this.f37525m.setBarHeight(getResources().getDimensionPixelOffset(R.dimen.web_loding_progress_h));
                this.f37525m.setClickable(true);
                this.f37525m.setUseWideViewPort(true);
                this.f37525m.setSupportZoom(false);
                this.f37525m.setBuiltInZoomControls(false);
                this.f37525m.setJavaScriptEnabled(true);
                this.f37525m.setCacheMode(-1);
                this.f37525m.setWebViewClient(new q(this));
                if (this.F) {
                    this.f37525m.r(new o());
                }
                this.f37525m.s(new p());
                this.f37525m.w(str);
                this.f37525m.setonShowFileChooser(new i());
                this.f37525m.setActivity(this);
                return;
            }
            showLodingFailed();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.Util.h2.e
    public void A(int i4, String str) {
        com.join.mgps.Util.v0.d("uploadData", "  onUploadResult " + str);
        if (this.O1) {
            if (i4 == 0) {
                this.P1.add(str);
            }
            Iterator<String> it2 = this.N1;
            if (it2 != null && it2.hasNext()) {
                S1();
                return;
            }
            LiveUploadData liveUploadData = new LiveUploadData();
            liveUploadData.setCode(0);
            try {
                List<String> list = this.P1;
                liveUploadData.setData((String[]) list.toArray(new String[list.size()]));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            String json = JsonMapper.getInstance().toJson(liveUploadData);
            LJWebView lJWebView = this.f37525m;
            lJWebView.w("javascript:papaChoiceAndUploadImg('" + json + "')");
            this.O.dismiss();
            this.O.a("请稍候...");
            this.O1 = false;
            return;
        }
        this.O.dismiss();
        this.O.a("请稍候...");
        if (i4 == 0) {
            LJWebView lJWebView2 = this.f37525m;
            lJWebView2.w("javascript:papaLiveCropImage2('" + str + "')");
            Toast.makeText(this, "上传成功", 0).show();
        } else {
            Toast.makeText(this, "上传失败，错误码 " + i4, 0).show();
        }
        this.L1 = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void D1() {
        x1(this.f37538w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void G1(DomainInfoBean domainInfoBean, String str) {
        com.papa.sim.statistic.p.l(getApplicationContext()).O1(Event.pdReceiveCoupon, new Ext().setIsJoin(domainInfoBean.getIs_join()).setTestAbNumber(domainInfoBean.getAb_test_number()));
        UtilsMy.i4(this, domainInfoBean.getInfo(), "real_name", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void I1(GameRoom gameRoom) {
        com.join.mgps.customview.input.a aVar = new com.join.mgps.customview.input.a(this.f37541z, "请输入房间密码", 4, false);
        aVar.g(new a(aVar, gameRoom));
        aVar.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void K1() {
        com.join.mgps.Util.b0.f0(this.f37541z).j(this.f37541z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void L1() {
        try {
            com.join.mgps.Util.v0.b(this.f37514b, "showMain() called.");
            this.f37518f.setVisibility(8);
            this.f37517e.setVisibility(8);
            LJWebView lJWebView = this.f37525m;
            if (lJWebView != null) {
                lJWebView.setVisibility(0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void N1(DetailResultBean detailResultBean) {
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
                        } else if (com.join.android.app.common.utils.e.l0(this).d(this, downloadTask.getPackageName()) && downloadTask.getStatus() == 5) {
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
                    UtilsMy.Z0(this.f37541z, detailResultBean);
                    return;
                }
            }
            if (r0 != null) {
                if (UtilsMy.x0(r0.getPay_game_amount(), r0.getCrc_link_type_val()) > 0) {
                    UtilsMy.d4(this.f37541z, r0.getCrc_link_type_val());
                    return;
                }
                UtilsMy.z1(r0, detailResultBean);
                if (UtilsMy.o1(this.f37541z, r0)) {
                    return;
                }
                if (detailResultBean.getDown_status() == 5) {
                    UtilsMy.l1(this.f37541z, r0);
                } else {
                    UtilsMy.R0(this.f37541z, r0, r0.getTp_down_url(), r0.getOther_down_switch(), r0.getCdn_down_switch());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void O1(PapayOrder papayOrder) {
        PayNowActivity_.L0(this.f37541z).c(papayOrder).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q1(CreateVipData createVipData) {
        try {
            this.B = AccountUtil_.getInstance_(this.f37541z).getAccountData();
            PapayOrder papayOrder = new PapayOrder();
            papayOrder.APPKEY = "16000431";
            papayOrder.PAYTYPE = 0;
            papayOrder.NOTIFY_URI = com.join.mgps.rpc.h.f54056j + "/member/buy_vip/callback";
            papayOrder.APP_NAME = "悟饭充值";
            papayOrder.APP_ORDER_ID = "papavip" + System.currentTimeMillis() + "";
            papayOrder.PA_OPEN_UID = this.B.getUid();
            papayOrder.APP_USER_ID = this.B.getUid() + "";
            papayOrder.APP_USER_NAME = this.B.getNickname();
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
            papayOrder.TOKEN = this.B.getToken();
            O1(papayOrder);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void R1(Uri uri) {
        this.K1 = X0("_crop");
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
        intent.putExtra("output", this.K1);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        startActivityForResult(intent, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void T0() {
        if (this.f37539x.equals(this.f37538w)) {
            e1();
        }
        WebView webView = this.f37525m.getWebView();
        if (webView != null && com.join.android.app.common.utils.j.j(this)) {
            webView.loadUrl("javascript:papaBackPageUp()");
        } else {
            e1();
        }
    }

    boolean T1() {
        com.wufan.user.service.protobuf.n0 accountBean = accountBean(this.f37541z);
        this.B = accountBean;
        return (accountBean == null || AccountUtil_.getInstance_(this.f37541z).isTourist()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void U0() {
        e1();
    }

    @Override // com.mgsim.common.fragment.a
    public void V(BackHandledFragment backHandledFragment) {
        this.T1 = backHandledFragment;
    }

    void V0() {
        com.join.mgps.socket.fight.arena.b bVar = this.X;
        if (bVar == null || bVar.d() == null) {
            return;
        }
        com.join.mgps.Util.v0.b(this.f37514b, "--- removeObserver---");
        this.X.d().A(this.f37529p0);
        this.X.g();
        this.X.stopService();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Y0(int i4) {
        this.B = AccountUtil_.getInstance_(this.f37541z).getAccountData();
        try {
            VipMoneyRequest vipMoneyRequest = new VipMoneyRequest();
            vipMoneyRequest.setMonth(i4);
            vipMoneyRequest.setToken(this.B.getToken());
            vipMoneyRequest.setUid(this.B.getUid());
            AccountResultMainBean<CreateVipData> w4 = this.f37535u.w(vipMoneyRequest.getParams());
            dismissLoadingDialog();
            if (w4 != null) {
                if (w4.getError() == 0) {
                    CreateVipData data = w4.getData();
                    data.setMonth(i4);
                    Q1(data);
                } else if (w4.getError() == 701) {
                    this.C = true;
                    IntentUtil.getInstance().goMyAccountLoginActivity(this.f37541z, 0, 2);
                }
            }
        } catch (Exception unused) {
            dismissLoadingDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z0() {
        this.O.b();
        this.O.a("正在上传图片请稍候");
        this.O.setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a1(GameRoom gameRoom, String str) {
        this.X.f(ArenaRequestFactory.joinRoom(ArenaConstants.REGISTER_TYPE_ARENAMAIN, gameRoom.getRoomId(), str, gameRoom.getElite()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3 */
    @AfterViews
    public void afterview() {
        this.f37534t = com.join.mgps.rpc.impl.d.P1();
        this.f37535u = com.join.mgps.rpc.impl.a.c0();
        this.f37536v = com.join.mgps.rpc.impl.b.k();
        com.join.mgps.Util.v0.b(this.f37514b, "afterView() called.");
        IntentDateBean intentDateBean = this.D;
        if (intentDateBean != null && TextUtils.equals(intentDateBean.getExt1(), "modGame")) {
            MApplication.f1497x.G(true);
        }
        try {
            this.f37541z = this;
            if ("com.join.mgps.papa.share_webview_raiseVip".equals(getIntent().getAction())) {
                this.D = new IntentDateBean();
                String stringExtra = getIntent().getStringExtra(this.f37515c);
                String stringExtra2 = getIntent().getStringExtra("gameId");
                this.f37538w = com.join.mgps.rpc.h.f54056j + "/member/vip_view/welcome?gameId=" + stringExtra2;
                if (stringExtra.equals("1")) {
                    this.f37538w = com.join.mgps.rpc.h.f54056j + "/member/vip_view/welfare/battle_bullet_screen?gameId=" + stringExtra2;
                } else if (stringExtra.equals("2")) {
                    this.f37538w = com.join.mgps.rpc.h.f54056j + "/member/vip_view/welfare/game_level?gameId=" + stringExtra2;
                } else if (stringExtra.equals("3")) {
                    this.f37538w = com.join.mgps.rpc.h.f54056j + "/member/vip_view/welfare/game_one_key_skill?gameId=" + stringExtra2;
                } else if (stringExtra.equals("4")) {
                    this.f37538w = com.join.mgps.rpc.h.f54056j + "/member/vip_view/welfare/game_more_archive?gameId=" + stringExtra2;
                } else if (stringExtra.equals("5")) {
                    this.f37538w = com.join.mgps.rpc.h.f54056j + "/member/vip_view/welfare/game_bug?gameId=" + stringExtra2;
                } else if (stringExtra.equals("6")) {
                    this.f37538w = com.join.mgps.rpc.h.f54056j + "/member/vip_view/welfare/game_practice?gameId=" + stringExtra2;
                } else if (stringExtra.equals("7")) {
                    this.f37538w = com.join.mgps.rpc.h.f54056j + "/member/vip_view/welfare/game_enhance?gameId=" + stringExtra2;
                } else if (stringExtra.equals("8")) {
                    this.f37538w = com.join.mgps.rpc.h.f54056j + "/member/vip_view/welfare/ad?gameId=" + stringExtra2;
                } else if (stringExtra.equals("9")) {
                    this.f37538w = getIntent().getStringExtra("url");
                }
                this.D.setLink_type_val(this.f37538w);
                this.P = true;
            }
            IntentDateBean intentDateBean2 = this.D;
            this.f37538w = intentDateBean2.getLink_type_val();
            this.f37539x = intentDateBean2.getLink_type_val();
            int i4 = 0;
            i4 = 0;
            i4 = 0;
            i4 = 0;
            if (intentDateBean2.getFrom().equals("11")) {
                s1(false);
            }
            if (this.f37538w == null) {
                this.f37538w = "";
            }
            if (com.join.android.app.common.http.c.f14632c && this.f37538w.contains("http://")) {
                this.f37538w = this.f37538w.replace("http://", "https://");
            }
            if (!this.f37538w.contains("http://") && !this.f37538w.contains("file://") && !this.f37538w.contains("https://")) {
                this.f37538w = "https://" + this.f37538w;
            }
            if (this.f37538w.contains("jump_url_type")) {
                this.f37538w = E1(this.f37538w);
            }
            try {
                if (intentDateBean2.getObject() != null) {
                    Object object = intentDateBean2.getObject();
                    if (object instanceof UpdateIntentDataBean) {
                        UpdateIntentDataBean updateIntentDataBean = (UpdateIntentDataBean) object;
                        if (updateIntentDataBean.getDownloadTask() != null) {
                            i4 = APKUtils.G(updateIntentDataBean.getDownloadTask());
                        }
                    }
                }
            } catch (Exception unused) {
            }
            if (this.f37538w.contains("?")) {
                x1(this.f37538w + "&ver=" + Build.VERSION.RELEASE + "&type=" + i4);
            } else {
                x1(this.f37538w + "?ver=" + Build.VERSION.RELEASE + "&type=" + i4);
            }
            if (intentDateBean2.getObject() instanceof String) {
                this.f37520h.setText((String) intentDateBean2.getObject());
            }
            TextView textView = this.f37521i;
            if (textView != null) {
                textView.setText("网页加载失败，再试试吧~");
            }
            LJWebView lJWebView = this.f37525m;
            if (lJWebView != null) {
                lJWebView.setMethodListenter(this);
            }
            this.O = com.join.mgps.Util.b0.f0(this.f37541z).x(this.f37541z);
            com.join.mgps.Util.d0.a().d(this);
            this.M1 = new com.join.mgps.Util.h2(this, this);
            this.f37525m.getWebView().setDownloadListener(new f(intentDateBean2));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void b1(String str) {
        this.X.f(ArenaRequestFactory.searchRoomById(ArenaConstants.REGISTER_TYPE_ARENAMAIN, Integer.parseInt(str)));
    }

    void backModGame() {
        IntentDateBean intentDateBean = this.D;
        if (intentDateBean == null) {
            return;
        }
        String ext1 = intentDateBean.getExt1();
        String ext2 = this.D.getExt2();
        String ext3 = this.D.getExt3();
        String ext4 = this.D.getExt4();
        if ("3ds".equals(ext1) && !TextUtils.isEmpty(ext2) && !TextUtils.isEmpty(ext4)) {
            DownloadTask F = p1.f.K().F(ext4);
            if (F != null) {
                UtilsMy.j(null, F, this.f37541z, 0, "1");
            }
        } else if (TextUtils.isEmpty(ext1) || TextUtils.isEmpty(ext2) || !ext1.equals("modGame")) {
        } else {
            if (com.join.mgps.Util.g2.h(ext3)) {
                ext3 = "0";
            }
            com.join.mgps.va.overmind.d.o().U(this, Integer.parseInt(ext3), ext2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c1(String str, IntentDateBean intentDateBean) {
        try {
            new com.tbruyelle.rxpermissions2.c(this).s(com.kuaishou.weapon.p0.g.f55590j, com.kuaishou.weapon.p0.g.f55589i).subscribe(new g(intentDateBean, str));
            UtilsMy.L3(this, com.kuaishou.weapon.p0.g.f55590j);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void checkToken() {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
            if (accountData == null || accountData.n2() == 2) {
                return;
            }
            k.b k32 = com.wufan.user.service.protobuf.k.k3();
            k32.e3(this.B.getUid());
            k32.c3(this.B.getToken());
            k32.Y2(b3.b.a(this));
            HashMap hashMap = new HashMap();
            hashMap.put("uid", k32.getUid() + "");
            hashMap.put("token", k32.getToken());
            hashMap.put("appVersion", k32.getAppVersion());
            k32.a3(com.join.mgps.Util.x1.d(hashMap));
            com.wufan.user.service.protobuf.n d5 = this.f37536v.d(k32.build());
            if (d5 == null || d5.getData() == null) {
                return;
            }
            com.wufan.user.service.protobuf.f data = d5.getData();
            this.B = this.B.toBuilder().s4(data.M()).j4(data.V1()).q4(data.y()).k4(data.G()).build();
            AccountUtil_.getInstance_(this).saveAccountData(this.B, this);
            UtilsMy.R(this);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void d1() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void dismissLoadingDialog() {
        com.join.mgps.dialog.d1 d1Var = this.O;
        if (d1Var != null) {
            d1Var.dismiss();
        }
        com.join.mgps.dialog.d1 d1Var2 = this.F1;
        if (d1Var2 != null) {
            d1Var2.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72001g0})
    public void f1(Intent intent) {
        finish();
    }

    public String g1(Context context) {
        String simOperator;
        try {
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (simOperator == null) {
            return "13-4-0";
        }
        if (!simOperator.equals("46000") && !simOperator.equals("46002")) {
            return simOperator.equals("46001") ? "13-4-2" : simOperator.equals("46003") ? "13-4-3" : "13-4-0";
        }
        return "13-4-1";
    }

    public void goMyAlbumActivity4PickPic() {
        boolean z4 = false;
        if (ContextCompat.checkSelfPermission(this.f37541z, com.kuaishou.weapon.p0.g.f55590j) != 0) {
            UtilsMy.O2(this.f37541z, com.kuaishou.weapon.p0.g.f55590j);
        } else if (ContextCompat.checkSelfPermission(this.f37541z, com.kuaishou.weapon.p0.g.f55589i) != 0) {
            UtilsMy.O2(this.f37541z, com.kuaishou.weapon.p0.g.f55589i);
        } else {
            z4 = true;
        }
        if (z4) {
            Intent intent = new Intent(this, MyAlbumActivity.class);
            Bundle bundle = new Bundle();
            this.P1.clear();
            this.Q1.clear();
            bundle.putSerializable(MyAlbumActivity.f14984x, (Serializable) this.Q1);
            intent.putExtras(bundle);
            startActivityForResult(intent, 256);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h1(String str, String str2, int i4) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                ResultMainBean<List<DetailResultBean>> R = this.f37534t.R(RequestBeanUtil.getInstance(this).getAppDetialBean(str, accountData != null ? accountData.getUid() : 0, null));
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
                        startDown(detailResultBean);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void handleFailure(ArenaResponse arenaResponse) {
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
            com.join.mgps.Util.l2.a(this.f37541z).b(com.join.mgps.socket.fight.arena.c.g(arenaResponse));
            str = "";
        } else {
            str = "该房间为比赛专用房间,非参赛选手无法加入";
        }
        com.join.mgps.Util.l2.a(this.f37541z).b(str);
        dismissLoadingDialog();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004c -> B:22:0x005a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:22:0x005a). Please submit an issue!!! */
    @Background
    public void k1(int i4, String str, String str2) {
        if (com.join.android.app.common.utils.j.j(this)) {
            if (this.U == null) {
                this.U = com.join.mgps.rpc.impl.i.D0();
            }
            try {
                RequestDomainInfoArgs requestDomainInfoArgs = new RequestDomainInfoArgs();
                requestDomainInfoArgs.setLocation(Integer.valueOf(i4));
                RequestModel requestModel = new RequestModel(this);
                requestModel.setArgs(requestDomainInfoArgs);
                requestModel.makeSign();
                try {
                    ResponseModel<DomainInfoBean> W = this.U.W(requestModel.makeSign());
                    if (W != null && W.getData() != null) {
                        G1(W.getData(), str);
                    } else {
                        IntentUtil.getInstance().goShareWebActivity(this, str2);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            return;
        }
        ToastManager.show("网络异常，请检查网络连接");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l1() {
        if (this.V) {
            return;
        }
        this.V = true;
        this.B = AccountUtil_.getInstance_(this).getAccountData();
        if (com.join.android.app.common.utils.j.j(this)) {
            com.wufan.user.service.protobuf.n0 n0Var = this.B;
            if (n0Var != null && !TextUtils.isEmpty(n0Var.getToken())) {
                try {
                    b0.b k32 = com.wufan.user.service.protobuf.b0.k3();
                    k32.e3(this.B.getUid());
                    k32.c3(this.B.getToken());
                    k32.Y2(b3.b.a(this));
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", k32.getUid() + "");
                    hashMap.put("token", k32.getToken());
                    hashMap.put("appVersion", k32.getAppVersion());
                    k32.a3(com.join.mgps.Util.x1.d(hashMap));
                    com.wufan.user.service.protobuf.d0 e5 = this.f37536v.e(k32.build());
                    if (e5 != null) {
                        if (e5.getError() == 200) {
                            com.wufan.user.service.protobuf.n0 data = e5.getData();
                            if (data != null && data.getUid() != 0) {
                                n0.b builder = this.B.toBuilder();
                                builder.j4(data.j1()).s4(data.M()).W3(data.x2()).Q3(data.O2()).e4(data.O1()).Z3(data.F2()).M3(data.Y0()).k4(data.G()).build();
                                if (com.join.mgps.Util.g2.i(data.getNickname())) {
                                    builder.c4(data.getNickname());
                                }
                                this.B = builder.build();
                                AccountUtil_.getInstance_(this).saveAccountData(this.B, this);
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
                sendBroadcast(intent);
                return;
            }
        }
        this.V = false;
    }

    public void m1(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                MainLabelActivity_.O0(this).d(Integer.parseInt(str)).start();
            } else {
                com.join.mgps.Util.v0.d("uploadData", "  goMyMainLabel tag_id is null ");
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void n1(String str, String str2, String str3) {
        try {
            if (!TextUtils.isEmpty(str)) {
                int parseInt = TextUtils.isEmpty(str2) ? 0 : Integer.parseInt(str2);
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                IntentUtil.getInstance().goMainLabelActivity(this, Integer.parseInt(str), parseInt, str3);
                return;
            }
            com.join.mgps.Util.v0.d("uploadData", "  goMyMainLabel tag_id is null ");
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.customview.LJWebView.b
    public void noMethod() {
        WebView webView = this.f37525m.getWebView();
        if (webView != null && webView.canGoBack()) {
            webView.goBack();
        } else {
            e1();
        }
    }

    public void o1() {
        SearchLabelActivity_.u(this).a(1).start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        String s4;
        if (i5 == -1) {
            if (i4 == 10) {
                this.L1 = true;
                com.facebook.imagepipeline.core.g imagePipeline = Fresco.getImagePipeline();
                imagePipeline.h(this.K1);
                imagePipeline.f(this.K1);
                imagePipeline.e(this.K1);
                com.join.mgps.Util.h2 h2Var = this.M1;
                String path = this.K1.getPath();
                h2Var.f(path, this.B.getUid() + "", this.B.getToken());
                this.O.b();
                this.O.a("正在上传直播封面");
                this.O.setCancelable(false);
            } else if (i4 == 100) {
                R1(this.J1);
            } else if (i4 == 200 && (s4 = com.join.mgps.Util.h0.s(this, intent.getData())) != null) {
                R1(Uri.fromFile(new File(s4)));
            }
        }
        if (i4 == 256) {
            if (this.Q1 == null) {
                this.Q1 = new ArrayList();
            }
            this.Q1.clear();
            this.Q1.addAll(i1(intent));
            net.bither.util.b.q().y();
        } else if (i4 == f37510c2 && i5 == -1) {
            if (this.D1.getHasJoinPassword()) {
                I1(this.D1);
            } else if (this.D1.getHasJoinPassword()) {
                I1(this.D1);
            } else {
                J1("正在获取房间...");
                a1(this.D1, "");
            }
        }
        this.f37525m.q(i4, i5, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BackHandledFragment backHandledFragment = this.T1;
        if (backHandledFragment == null || !backHandledFragment.a()) {
            if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
                super.onBackPressed();
            } else {
                getSupportFragmentManager().popBackStack();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            try {
                LJWebView lJWebView = this.f37525m;
                if (lJWebView != null) {
                    lJWebView.getWebView().restoreState(bundle);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        V0();
        this.J = true;
        this.f37525m.w("");
        com.join.mgps.Util.d0.a().e(this);
        try {
            if (this.E != null) {
                moveTaskToBack(true);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (this.R1 != null) {
            net.bither.util.b.q().z(this.R1);
        }
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        if (a5 == null) {
            return;
        }
        if (APKUtils.G(a5)) {
            LJWebView lJWebView = this.f37525m;
            lJWebView.w("javascript:papaGameStatusNotify(" + a5.getRef_crc_sign_id() + "," + a5.getStatus() + ")");
            return;
        }
        LJWebView lJWebView2 = this.f37525m;
        lJWebView2.w("javascript:papaGameStatusNotify(" + a5.getCrc_link_type_val() + "," + a5.getStatus() + ")");
    }

    @Override // com.join.mgps.customview.LJWebView.b
    public void onHideCustomView() {
        this.G = null;
        C1();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        com.join.mgps.Util.v0.b(this.f37514b, "onKeyDown() called.");
        if (i4 == 4 && keyEvent.getRepeatCount() == 0) {
            if (q1()) {
                this.I.onHideCustomView();
                return true;
            }
            if (com.join.mgps.Util.g2.i(this.f37539x) && this.f37539x.equals(this.f37538w)) {
                e1();
            }
            String str = this.f37539x;
            if (str == null) {
                e1();
                return true;
            }
            if (str.contains("?")) {
                String str2 = this.f37539x;
                str = str2.substring(0, str2.lastIndexOf("?"));
            }
            if (this.f37538w.contains("?")) {
                String str3 = this.f37538w;
                this.f37538w = str3.substring(0, str3.lastIndexOf("?"));
            }
            if (com.join.mgps.Util.g2.i(this.f37539x) && str.equals(this.f37538w)) {
                e1();
            }
            WebView webView = this.f37525m.getWebView();
            if (webView != null && com.join.android.app.common.utils.j.j(this)) {
                webView.loadUrl("javascript:papaBackPageUp()");
                return true;
            }
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LJWebView lJWebView = this.f37525m;
        if (lJWebView != null) {
            try {
                lJWebView.getWebView().getClass().getMethod("onPause", new Class[0]).invoke(this.f37525m.getWebView(), null);
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

    @Override // com.join.mgps.customview.LJWebView.b
    public void onReceivedTitle(String str) {
        TextView textView = this.f37520h;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
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
        this.L = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f37525m.w("javascript:papaActivityOnResume()");
        LJWebView lJWebView = this.f37525m;
        if (lJWebView != null) {
            try {
                lJWebView.getWebView().getClass().getMethod("onResume", new Class[0]).invoke(this.f37525m.getWebView(), null);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (NoSuchMethodException e6) {
                e6.printStackTrace();
            } catch (InvocationTargetException e7) {
                e7.printStackTrace();
            }
        }
        this.B = AccountUtil_.getInstance_(this.f37541z).getAccountData();
        if (this.C) {
            if (this.f37525m != null) {
                WebAccountDataBean webAccountDataBean = new WebAccountDataBean();
                if (this.B != null) {
                    webAccountDataBean.setHasLogin(true);
                } else {
                    webAccountDataBean.setHasLogin(false);
                }
                webAccountDataBean.setAccountBean(AccountBean.convert(this.B));
                LJWebView lJWebView2 = this.f37525m;
                lJWebView2.w("javascript:papaPutAccountData(" + JsonMapper.getInstance().toJson(webAccountDataBean) + ")");
            }
            this.C = false;
        }
        net.bither.util.b.q().e(this.R1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f37525m.getWebView().saveState(bundle);
    }

    @Override // com.join.mgps.customview.LJWebView.b
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback, WebChromeClient webChromeClient) {
        this.G = view;
        if (view == null) {
            return;
        }
        this.I = webChromeClient;
        this.f37524l.setVisibility(8);
        this.f37519g.setVisibility(8);
        this.f37533s.removeAllViews();
        this.f37533s.setVisibility(0);
        this.f37533s.addView(view, new RelativeLayout.LayoutParams(-1, -1));
        setRequestedOrientation(0);
        F1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p1(GameRoom gameRoom) {
        dismissLoadingDialog();
        this.D1 = gameRoom;
        if (!gameRoom.getAllowPeripheralJoin() && com.join.mgps.socket.fight.arena.c.o(this.f37541z)) {
            com.join.mgps.Util.l2.a(this.f37541z).b("禁止外设用户加入!");
        } else if (this.D1.getBattleArea().getNumber() != BattleArea.ALL.getNumber() && this.D1.getBattleArea().getNumber() != this.X.d().n().getNumber()) {
            H1(gameRoom);
        } else {
            if (!checkGameIsInstall("" + gameRoom.getGameId())) {
                M1(f37510c2);
            } else if (gameRoom.getHasJoinPassword()) {
                I1(gameRoom);
            } else {
                a1(gameRoom, "");
            }
        }
    }

    public boolean q1() {
        return this.G != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void s1(boolean z4) {
        if (z4) {
            com.join.mgps.Util.l2.a(this.f37541z).b("正在连接服务器，请稍候...");
        }
        com.join.mgps.socket.fight.arena.b bVar = new com.join.mgps.socket.fight.arena.b(this.f37541z, new m());
        this.X = bVar;
        bVar.bindService();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void search() {
        SearchHintActivity_.G1(this.f37541z).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        com.join.mgps.Util.v0.b(this.f37514b, "setNetwork() called.");
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            com.join.mgps.Util.v0.b(this.f37514b, "showLoding() called.");
            this.f37517e.setVisibility(8);
            this.f37518f.setVisibility(8);
            LJWebView lJWebView = this.f37525m;
            if (lJWebView != null) {
                lJWebView.setVisibility(0);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            com.join.mgps.Util.v0.b(this.f37514b, "showLodingFailed() called.");
            this.f37518f.setVisibility(0);
            this.f37517e.setVisibility(8);
            LJWebView lJWebView = this.f37525m;
            if (lJWebView != null) {
                lJWebView.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.customview.LJWebView.b
    public void showMainWebview() {
        LJWebView lJWebView = this.f37525m;
        if (lJWebView == null || lJWebView.getVisibility() == 0) {
            return;
        }
        L1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        com.join.mgps.Util.l2.a(this.f37541z).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void startDown(DetailResultBean detailResultBean) {
        String crc_sign_id;
        boolean z4;
        String str;
        if (detailResultBean.getMod_info() != null) {
            crc_sign_id = detailResultBean.getMod_info().getMod_game_id();
            detailResultBean.get_from();
            detailResultBean.get_from_type();
        } else {
            crc_sign_id = detailResultBean.getCrc_sign_id();
            detailResultBean.get_from();
            detailResultBean.get_from_type();
        }
        detailResultBean.getTag_info();
        String str2 = detailResultBean.getMod_info() != null ? "VIRTUAL_SINGLE" : "";
        if ("7".equals(detailResultBean.getSp_tag_info().getModel().getId())) {
            str = str2;
            z4 = false;
        } else {
            z4 = true;
            str = "ANDROID_SINGLE";
        }
        if (!z4) {
            boolean m22 = com.join.mgps.Util.g2.h(detailResultBean.getPlugin_num()) ? false : UtilsMy.m2(Integer.parseInt(detailResultBean.getPlugin_num()));
            if (m22) {
                str = UtilsMy.Z1(detailResultBean.getPlugin_num()).getDown_type() == 2 ? "SO_SIMULATOR" : "RAW_SIMULATOR";
            }
            z4 = m22;
        }
        try {
            String d5 = new PrefDef_(this.f37541z).androidIdNullsKey().d();
            if (com.join.mgps.Util.g2.i(d5)) {
                List list = (List) JsonMapper.getInstance().fromJson(d5, List.class);
                if (com.join.mgps.Util.g2.i(MApplication.H) && list.contains(MApplication.H) && z4) {
                    if (IntentUtil.getInstance().goLogin(this.f37541z)) {
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
        boolean booleanValue = new PrefDef_(this.f37541z).download_game_switch().d().booleanValue();
        if (z4 && booleanValue) {
            UtilsMy.z0(this.f37541z, 2, crc_sign_id, str, new j(detailResultBean));
        } else {
            N1(detailResultBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w1(String str) {
        this.Y = str;
        if (!com.join.android.app.common.utils.j.j(this.f37541z)) {
            Toast.makeText(this.f37541z, "当前网络不可用，请检查网络", 0).show();
        } else if (!T1()) {
            K1();
        } else {
            com.join.mgps.socket.fight.arena.b bVar = this.X;
            if (bVar != null && bVar.d() == null) {
                s1(true);
                return;
            }
            this.X.d().z(this.f37529p0);
            this.O.b();
            this.O.setCancelable(true);
            if (!this.X.d().s()) {
                this.X.f(ArenaRequestFactory.login(ArenaConstants.REGISTER_TYPE_ARENAMAIN));
            } else {
                b1(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void y1() {
        com.join.mgps.Util.v0.b(this.f37514b, "loding_faile() called.");
        if (this.f37525m != null) {
            this.A = false;
            x1(this.f37538w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z1(SocketError socketError) {
        int i4 = socketError.errorType;
        if (i4 != 6 && i4 != 3 && i4 != 4) {
            com.join.mgps.Util.l2.a(this.f37541z).b("网络异常，请稍后重试!");
            return;
        }
        com.join.mgps.Util.l2.a(this.f37541z).b(socketError.errorInfo);
        K1();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(PapayResult papayResult) {
        if (papayResult != null) {
            int status = papayResult.getStatus();
            if (status == 1) {
                this.f37525m.w("javascript:papaPayResult(5000)");
            } else if (status == 2) {
                this.f37525m.w("javascript:papaPayResult(5001)");
            } else if (status == 3) {
                this.f37525m.w("javascript:papaPayResult(5002)");
            } else if (status != 4) {
            } else {
                this.f37525m.w("javascript:papaPayResult(5003)");
            }
        }
    }
}
