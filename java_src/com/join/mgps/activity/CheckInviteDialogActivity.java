package com.join.mgps.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.mgsim.arena.ArenaConstants;
import app.mgsim.arena.ArenaRequestFactory;
import app.mgsim.arena.ArenaResponse;
import app.mgsim.arena.SocketError;
import app.mgsim.arena.SocketListener;
import com.BaseActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.arena.GameRoomActivity_;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.ArenaInviteBean;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.socket.fight.arena.a;
import com.join.mgps.socket.fight.arena.b;
import com.papa91.battle.protocol.BattleArea;
import com.papa91.battle.protocol.GameRoom;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.net_whole_invite_dialog)
/* loaded from: classes4.dex */
public class CheckInviteDialogActivity extends BaseActivity {
    public static String N = null;
    public static String O = null;
    public static String P = null;
    public static String Q = null;
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = 2;
    public static ArenaInviteBean U;
    private boolean A;
    @ViewById
    LinearLayout B;
    private int F;
    private com.join.mgps.dialog.b1 G;
    private com.join.mgps.socket.fight.arena.a I;
    private com.join.mgps.socket.fight.arena.b J;
    com.join.mgps.rpc.e L;
    DetailResultBean M;
    @Extra

    /* renamed from: b  reason: collision with root package name */
    String f28524b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f28525c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    Button f28526d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f28527e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    SimpleDraweeView f28528f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f28529g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f28530h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    SimpleDraweeView f28531i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f28532j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f28533k;

    /* renamed from: l  reason: collision with root package name */
    private String f28534l;

    /* renamed from: m  reason: collision with root package name */
    private String f28535m;

    /* renamed from: n  reason: collision with root package name */
    private String f28536n;

    /* renamed from: o  reason: collision with root package name */
    private String f28537o;

    /* renamed from: p  reason: collision with root package name */
    private String f28538p;

    /* renamed from: q  reason: collision with root package name */
    private String f28539q;

    /* renamed from: r  reason: collision with root package name */
    private String f28540r;

    /* renamed from: s  reason: collision with root package name */
    private String f28541s;

    /* renamed from: t  reason: collision with root package name */
    private Long f28542t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    LinearLayout f28543u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    LinearLayout f28544v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    LinearLayout f28545w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    LinearLayout f28546x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    TextView f28547y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f28548z;
    Handler C = new Handler();
    Runnable D = new a();
    Runnable E = new b();
    private final SocketListener.NotifyObserver H = new f();
    com.join.mgps.customview.o K = null;

    /* loaded from: classes4.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(CheckInviteDialogActivity.this).flags(268435456)).start();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CheckInviteDialogActivity.this.j0(null);
        }
    }

    /* loaded from: classes4.dex */
    class c extends b.c {
        c() {
        }

        @Override // com.join.mgps.socket.fight.arena.b.c, com.join.mgps.socket.fight.arena.b.InterfaceC0385b
        public void c() {
            super.c();
            CheckInviteDialogActivity.this.J.d().z(CheckInviteDialogActivity.this.H);
        }
    }

    /* loaded from: classes4.dex */
    class d extends a.b0 {
        d() {
        }

        @Override // com.join.mgps.socket.fight.arena.a.b0, com.join.mgps.socket.fight.arena.a.y
        public void W(int i4, int i5, Object obj) {
            super.W(i4, i5, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements DialogInterface.OnDismissListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            CheckInviteDialogActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    class f implements SocketListener.NotifyObserver {
        f() {
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onError(SocketError socketError) {
            CheckInviteDialogActivity.this.showToast("网络异常！");
            CheckInviteDialogActivity.this.finish();
        }

        @Override // app.mgsim.arena.SocketListener.NotifyObserver
        public void onServerResponse(ArenaResponse arenaResponse) {
            if (CheckInviteDialogActivity.this.v0()) {
                return;
            }
            if (arenaResponse.responseCode == 0) {
                CheckInviteDialogActivity.this.r0(arenaResponse);
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_LOGIN)) {
                CheckInviteDialogActivity.this.t0();
            } else if (arenaResponse.responseType.equals(ArenaConstants.ArenaCommand.CMD_SHARE_JOIN_ROOM)) {
                GameRoom gameRoom = (GameRoom) arenaResponse.data;
                if (gameRoom.getBattleArea().getNumber() == BattleArea.ALL.getNumber() || gameRoom.getBattleArea().getNumber() == CheckInviteDialogActivity.this.J.d().n().getNumber()) {
                    CheckInviteDialogActivity.this.J.d().E(null);
                    p1.f K = p1.f.K();
                    GameRoomActivity_.V2(CheckInviteDialogActivity.this).h(arenaResponse.joinSpectatorReason).d(K.F("" + gameRoom.getGameId()).getShowName()).i(gameRoom).start();
                    com.papa.sim.statistic.p.l(CheckInviteDialogActivity.this).x(AccountUtil_.getInstance_(CheckInviteDialogActivity.this).getUid(), gameRoom.getRoomId(), CheckInviteDialogActivity.O);
                    CheckInviteDialogActivity.this.finish();
                    return;
                }
                CheckInviteDialogActivity.this.x0(gameRoom);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements DialogInterface.OnDismissListener {
        g() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            CheckInviteDialogActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CheckInviteDialogActivity.this.finish();
        }
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private void l0() {
        com.join.mgps.customview.o oVar = this.K;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.K.dismiss();
    }

    private void s0() {
        if (this.J.d().s()) {
            t0();
        } else {
            this.J.f(ArenaRequestFactory.login(ArenaConstants.REGISTER_TYPE_SHARE_JOIN_ROOM));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v0() {
        if (isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && isDestroyed();
    }

    private boolean w0(String str) {
        try {
            getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.L = com.join.mgps.rpc.impl.d.P1();
        setFinishOnTouchOutside(false);
        String str = this.f28524b;
        N = str;
        try {
            this.f28541s = str.substring(str.indexOf("【") + 1, this.f28524b.indexOf("】"));
            int indexOf = this.f28524b.indexOf(o0(9786));
            this.f28540r = this.f28524b.substring(indexOf + 1, this.f28524b.lastIndexOf(o0(9786)));
            int indexOf2 = this.f28524b.indexOf("$");
            int lastIndexOf = this.f28524b.lastIndexOf("$");
            if (lastIndexOf < 0) {
                finish();
                return;
            }
            this.F = Integer.valueOf(this.f28524b.substring(indexOf2 + 3, lastIndexOf)).intValue();
            int indexOf3 = this.f28524b.indexOf(m.a.f71490d);
            int lastIndexOf2 = this.f28524b.lastIndexOf(m.a.f71490d);
            if (indexOf3 > 0) {
                Q = this.f28524b.substring(indexOf3 + 4, lastIndexOf2);
            }
            int indexOf4 = this.f28524b.indexOf("#");
            int lastIndexOf3 = this.f28524b.lastIndexOf("#");
            if (lastIndexOf3 < 0) {
                finish();
            }
            O = this.f28524b.substring(indexOf4 + 3, lastIndexOf3);
            String str2 = this.f28524b;
            this.f28542t = Long.valueOf(str2.substring(str2.indexOf("￥") + 1, this.f28524b.lastIndexOf("￥")));
            ArenaInviteBean arenaInviteBean = new ArenaInviteBean();
            U = arenaInviteBean;
            arenaInviteBean.setGameId(this.f28542t);
            U.setGroupId(O);
            U.setNo(P);
            U.setPassword(Q);
            if (this.F > 0 && !TextUtils.isEmpty(O) && this.f28542t.longValue() > 0) {
                com.join.mgps.socket.fight.arena.b bVar = new com.join.mgps.socket.fight.arena.b(this, new c());
                this.J = bVar;
                bVar.bindService();
                this.I = new com.join.mgps.socket.fight.arena.a(this, new d());
                u0(3000);
                return;
            }
            finish();
        } catch (Exception unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                int uid = accountData != null ? accountData.getUid() : 0;
                RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(this);
                ResultMainBean<List<DetailResultBean>> R2 = this.L.R(requestBeanUtil.getAppDetialBean(this.f28542t + "", uid, null));
                if (R2 != null && R2.getFlag() != 0) {
                    List<DetailResultBean> data = R2.getMessages().getData();
                    if (data.size() != 0) {
                        DetailResultBean detailResultBean = data.get(0);
                        this.M = detailResultBean;
                        j0(detailResultBean);
                        return;
                    }
                    return;
                } else if (R2 != null && R2.getFlag() != 0) {
                    showLodingFailed();
                    return;
                } else {
                    showLodingFailed();
                    return;
                }
            } catch (Exception unused) {
                showLodingFailed();
                return;
            }
        }
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0(DetailResultBean detailResultBean) {
        if (detailResultBean == null) {
            p1.f K = p1.f.K();
            DownloadTask F = K.F(this.f28542t + "");
            if (F != null && F.getStatus() == 5) {
                this.f28548z = true;
                EMUApkTable n4 = b2.o.o().n(F.getPlugin_num());
                if (n4 != null) {
                    if (com.join.android.app.common.utils.l.t(this, n4, false, new String[0])) {
                        if (UtilsMy.B0(this, n4)) {
                            this.A = false;
                            this.f28537o = n4.getLogo();
                            this.f28538p = n4.getApk_name();
                            this.f28539q = n4.getSize();
                        } else {
                            this.A = true;
                        }
                    } else {
                        this.A = false;
                        this.f28537o = n4.getLogo();
                        this.f28538p = n4.getApk_name();
                        this.f28539q = n4.getSize();
                    }
                } else {
                    this.A = true;
                }
                y0();
                return;
            }
            this.f28548z = false;
            getData();
            return;
        }
        this.f28535m = detailResultBean.getGame_name();
        this.f28534l = detailResultBean.getIco_remote();
        this.f28536n = detailResultBean.getSize();
        this.f28548z = false;
        EMUApkTable n5 = b2.p.o().n(detailResultBean.getPlugin_num());
        if (n5 != null) {
            if (com.join.android.app.common.utils.l.t(this, n5, false, new String[0])) {
                if (UtilsMy.B0(this, n5)) {
                    this.A = false;
                    this.f28537o = n5.getLogo();
                    this.f28538p = n5.getApk_name();
                    this.f28539q = n5.getSize();
                } else {
                    this.A = true;
                }
            } else {
                this.A = false;
                this.f28537o = n5.getLogo();
                this.f28538p = n5.getApk_name();
                this.f28539q = n5.getSize();
            }
        }
        y0();
    }

    void k0() {
        this.I.x().setOnDismissListener(new g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        this.C.removeCallbacks(this.D);
        this.C.removeCallbacks(this.E);
        N = "";
        O = "";
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        O = "";
        this.f28526d.setText("我知道了");
        this.f28527e.setVisibility(8);
        this.f28543u.setVisibility(8);
        boolean z4 = this.f28548z;
        if (!z4 && !this.A) {
            TextView textView = this.f28525c;
            textView.setText("正在下载" + this.f28535m + "、" + this.f28538p);
        } else if (!z4) {
            TextView textView2 = this.f28525c;
            textView2.setText("正在下载" + this.f28535m + "...");
        } else if (!this.A) {
            TextView textView3 = this.f28525c;
            textView3.setText("正在下载" + this.f28538p);
        }
        this.f28547y.setVisibility(0);
        this.f28547y.setText("下载完成后，请再次复制\"约战口令\"即可快速加入约战~");
        if (!this.A && this.f28548z) {
            p1.f K = p1.f.K();
            DownloadTask F = K.F(this.f28542t + "");
            if (F != null) {
                UtilsMy.q1(b2.o.o().n(F.getPlugin_num()), this);
            }
        } else if (UtilsMy.o1(this, this.M.getDownloadtaskDown())) {
        } else {
            if (this.M.getDown_status() == 5) {
                UtilsMy.l1(this, this.M.getDownloadtaskDown());
            } else {
                com.php25.PDownload.d.c(this.M.getDownloadtaskDown(), this);
            }
        }
    }

    public String o0(int i4) {
        return String.valueOf(Character.toChars(i4));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.socket.fight.arena.b bVar = this.J;
        if (bVar != null) {
            if (bVar.d() != null) {
                this.J.d().z(this.H);
            }
            this.J.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        if (this.f28524b.contains("大厅对战")) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(3);
            intentDateBean.setJump_type(3);
            intentDateBean.setObject(U);
            IntentUtil.getInstance().intentActivity(this, intentDateBean);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void q0() {
        N = "";
        if (com.join.android.app.common.utils.j.j(this)) {
            if (this.J.e()) {
                s0();
                return;
            } else {
                this.J.bindService();
                return;
            }
        }
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0(ArenaResponse arenaResponse) {
        showToast(com.join.mgps.socket.fight.arena.c.g(arenaResponse));
        int i4 = arenaResponse.errorType;
        if (i4 == 8) {
            this.I.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "房间已经被解散!", "确定");
            k0();
        } else if (i4 == 9) {
            this.I.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "房间已满，无法加入!", "确定");
            k0();
        } else if (i4 == 13) {
            this.I.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "铜板不足，无法加入房间", "确定");
            k0();
        } else if (i4 == 16) {
            this.I.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "无法加入，你被禁止加入该房间", "确定");
            k0();
        } else if (i4 != 17) {
            showToast(com.join.mgps.socket.fight.arena.c.g(arenaResponse));
            new Handler().postDelayed(new h(), 2000L);
        } else {
            this.I.D(com.join.mgps.socket.fight.arena.a.f54752j, 257, Integer.valueOf(arenaResponse.errorType), "该房间为比赛专用房间,非参赛选手无法加入", "确定");
            k0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        u0(500);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        this.f28526d.setText("我知道了");
        this.f28527e.setVisibility(8);
        this.f28525c.setVisibility(8);
        this.f28543u.setVisibility(8);
        this.f28547y.setVisibility(8);
        this.f28546x.setVisibility(8);
        this.B.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        if (v0()) {
            return;
        }
        com.join.mgps.Util.l2.a(this).b(str);
    }

    void t0() {
        this.J.d().C(ArenaRequestFactory.shareJoinRoom(ArenaConstants.REGISTER_TYPE_SHARE_JOIN_ROOM, Long.valueOf(O).longValue(), this.F, this.f28542t.longValue(), Q));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0(int i4) {
        this.f28525c.setText("正在进入【" + this.f28541s + "】挑战好友" + o0(9786) + this.f28540r + o0(9786));
        this.f28525c.setVisibility(0);
        this.f28543u.setVisibility(8);
        this.f28547y.setVisibility(8);
        this.B.setVisibility(8);
        this.f28527e.setVisibility(8);
        this.f28546x.setVisibility(0);
        if (AccountUtil_.getInstance_(this).getAccountData() == null) {
            this.C.postDelayed(this.D, i4);
        } else {
            this.C.postDelayed(this.E, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0(GameRoom gameRoom) {
        com.join.mgps.dialog.b1 b1Var = this.G;
        if (b1Var != null) {
            b1Var.a();
        }
        com.join.mgps.dialog.b1 b1Var2 = new com.join.mgps.dialog.b1(this);
        this.G = b1Var2;
        b1Var2.d("加入失败，您与" + gameRoom.getRoomId() + "房间不在同一战区\n请进入该游戏房间列表，并切换至【" + com.join.mgps.socket.fight.arena.c.d(gameRoom.getBattleArea()) + "】后再查找房间号进入");
        this.G.e();
        this.G.b().setOnDismissListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0() {
        if (this.A && this.f28548z) {
            q0();
            return;
        }
        this.B.setVisibility(8);
        if (!this.f28548z) {
            this.f28527e.setVisibility(0);
            this.f28543u.setVisibility(0);
            this.f28546x.setVisibility(8);
            this.f28544v.setVisibility(0);
            UtilsMy.u3(this, this.f28534l, this.f28528f);
            this.f28529g.setText(this.f28535m);
            TextView textView = this.f28530h;
            textView.setText(this.f28536n + "M");
        }
        if (!this.A) {
            this.f28527e.setVisibility(0);
            this.f28543u.setVisibility(0);
            this.f28546x.setVisibility(8);
            this.f28545w.setVisibility(0);
            UtilsMy.u3(this, this.f28537o, this.f28531i);
            this.f28532j.setText(this.f28538p);
            TextView textView2 = this.f28533k;
            textView2.setText(this.f28539q + "M");
        }
        boolean z4 = this.f28548z;
        if (!z4 && !this.A) {
            TextView textView3 = this.f28525c;
            textView3.setText("你需要先下载游戏<" + this.f28535m + ">和" + this.f28538p);
            this.f28525c.setGravity(3);
        } else if (!z4) {
            TextView textView4 = this.f28525c;
            textView4.setText("你需要先下载游戏<" + this.f28535m + SimpleComparison.GREATER_THAN_OPERATION);
            this.f28525c.setGravity(17);
        } else if (this.A) {
        } else {
            TextView textView5 = this.f28525c;
            textView5.setText("你需要先下载" + this.f28538p);
            this.f28525c.setGravity(17);
        }
    }

    boolean z0() {
        return (accountBean(this) == null || AccountUtil_.getInstance_(this).isTourist()) ? false : true;
    }
}
