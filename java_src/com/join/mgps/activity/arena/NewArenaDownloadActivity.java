package com.join.mgps.activity.arena;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import b2.o;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.servcie.i;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.common.utils.j;
import com.join.android.app.common.utils.l;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.arena.GameRoomActivity;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.FriendInviteBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.event.n;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.rpc.e;
import com.join.mgps.rpc.impl.d;
import com.papa91.arc.bean.ButtonBean;
import com.wufan.friend.chat.c;
import com.wufan.user.service.protobuf.n0;
import java.io.File;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p1.f;
@EActivity(R.layout.dialog_arena_download_game_plugin)
/* loaded from: classes.dex */
public class NewArenaDownloadActivity extends Activity {
    private int A = 1;
    private int B = 2;
    private int C = 3;
    private int D = 1;
    private EMUApkTable E;
    String F;
    private String G;
    private String H;
    private String I;
    private String J;
    private String K;
    private String L;
    @Extra

    /* renamed from: b  reason: collision with root package name */
    String f38862b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    boolean f38863c;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    boolean f38864d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    String f38865e;

    /* renamed from: f  reason: collision with root package name */
    e f38866f;

    /* renamed from: g  reason: collision with root package name */
    DetailResultBean f38867g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    SimpleDraweeView f38868h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f38869i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f38870j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ProgressBar f38871k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f38872l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    SimpleDraweeView f38873m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f38874n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    ProgressBar f38875o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f38876p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    Button f38877q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    LinearLayout f38878r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    LinearLayout f38879s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    ImageView f38880t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    Button f38881u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    View f38882v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    LinearLayout f38883w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    LinearLayout f38884x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    LinearLayout f38885y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    TextView f38886z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements GameRoomActivity.x {
        a() {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onFail(int i4) {
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5) {
            NewArenaDownloadActivity.this.c();
        }

        @Override // com.join.mgps.activity.arena.GameRoomActivity.x
        public void onSuccess(int i4, int i5, ButtonBean buttonBean) {
        }
    }

    private boolean j(String str) {
        try {
            getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void a() {
        this.f38866f = d.P1();
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        Intent intent = getIntent();
        this.f38862b = intent.getStringExtra("gameId");
        this.f38863c = intent.getBooleanExtra(NewArenaDownloadActivity_.P, false);
        this.f38864d = intent.getBooleanExtra(NewArenaDownloadActivity_.Q, false);
        d0.a().d(this);
        setFinishOnTouchOutside(false);
        g();
        i();
        p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void b() {
        String str;
        DetailResultBean detailResultBean = this.f38867g;
        if (detailResultBean == null) {
            return;
        }
        int i4 = 0;
        if (!TextUtils.isEmpty(detailResultBean.getPlugin_num()) && g2.j(this.f38867g.getPlugin_num())) {
            i4 = Integer.parseInt(this.f38867g.getPlugin_num());
        }
        if (UtilsMy.m2(i4)) {
            str = UtilsMy.Z1(this.f38867g.getPlugin_num()).getDown_type() == 2 ? "SO_SIMULATOR" : "RAW_SIMULATOR";
        } else {
            str = "";
        }
        try {
            String d5 = new PrefDef_(this).androidIdNullsKey().d();
            if (g2.i(d5)) {
                List list = (List) JsonMapper.getInstance().fromJson(d5, List.class);
                if (g2.i(MApplication.H) && list.contains(MApplication.H)) {
                    if (IntentUtil.getInstance().goLogin(this)) {
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (new PrefDef_(this).download_game_switch().d().booleanValue()) {
            UtilsMy.z0(this, 2, this.f38862b, str, new a());
        } else {
            c();
        }
    }

    void c() {
        DownloadTask downloadTask;
        int i4 = this.D;
        if (i4 == this.A) {
            DetailResultBean detailResultBean = this.f38867g;
            if (detailResultBean != null) {
                downloadTask = detailResultBean.getDownloadtaskDown();
                downloadTask.setFromRecomDown(true);
            } else {
                downloadTask = null;
            }
            if (downloadTask != null) {
                downloadTask.setDisableShowSpeedUpPrompt(true);
            }
            if (this.f38867g != null && UtilsMy.p1(this, downloadTask, null)) {
                if (downloadTask == null || TextUtils.isEmpty(downloadTask.getDownload_source_switch_v2()) || !"1".equals(downloadTask.getDownload_source_switch_v2())) {
                    return;
                }
                if (TextUtils.isEmpty(downloadTask.getDownload_source_url()) && TextUtils.isEmpty(downloadTask.getDownload_outside_url())) {
                    return;
                }
                finish();
                return;
            }
            DetailResultBean detailResultBean2 = this.f38867g;
            if (detailResultBean2 != null && detailResultBean2.getDown_status() == 5) {
                UtilsMy.n1(this, downloadTask);
                return;
            }
            this.f38886z.setText("点击关闭按钮后，游戏会在后台\n继续下载哦~");
            this.D = this.B;
            this.f38877q.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_btn_border_gray_four_1));
            if (!this.f38863c) {
                DetailResultBean detailResultBean3 = this.f38867g;
                if (detailResultBean3 != null) {
                    this.F = detailResultBean3.getPlugin_num();
                }
                this.E = o.o().n(this.F);
                DownloadTask F = f.K().F(this.F);
                if (F != null) {
                    if (F.getUrl().equals(this.E.getDown_url()) && F.getVerCode() == this.E.getVerCode() && (this.E.getDown_type() != 2 || !l.A(this.E, false))) {
                        File file = F.getGameZipPath() != null ? new File(F.getGameZipPath()) : null;
                        if ((F.getStatus() == 5 || F.getStatus() == 11) && file != null && file.exists()) {
                            if (l.H(F, null)) {
                                UtilsMy.S2(F, 5);
                            } else {
                                com.join.android.app.common.utils.e.l0(this).w(this, file);
                            }
                        }
                    } else if (F.getStatus() == 5) {
                        F.setStatus(9);
                        if (this.E.getDown_type() == 2) {
                            UtilsMy.L0(F);
                        }
                        f.K().update(F);
                    } else if (!l.i(this.E) && (F.getDown_type() != 2 || F.getStatus() != 11)) {
                        if (F.getStatus() == 36 || F.getStatus() == 12) {
                            return;
                        }
                        com.php25.PDownload.d.i(F);
                        com.php25.PDownload.d.a(F);
                        f.K().delete((f) F);
                    } else {
                        i.e().q(this, F);
                        return;
                    }
                }
                e();
            }
            if (this.f38864d) {
                return;
            }
            f();
        } else if (i4 == this.C) {
            Intent intent = new Intent();
            intent.putExtra("gameId", this.f38862b);
            setResult(-1, intent);
            finish();
            if (TextUtils.isEmpty(this.f38865e) || !this.f38865e.equals("MGMainActivity_10004")) {
                return;
            }
            c.u().O();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void d(DetailResultBean detailResultBean) {
        this.f38867g = detailResultBean;
        if (detailResultBean == null) {
            f K = f.K();
            DownloadTask F = K.F(this.f38862b + "");
            if (F != null && F.getStatus() == 5) {
                this.f38864d = true;
                EMUApkTable n4 = o.o().n(F.getPlugin_num());
                if (n4 != null) {
                    if (l.t(this, n4, false, new String[0])) {
                        if (UtilsMy.B0(this, n4)) {
                            this.f38863c = false;
                            this.G = n4.getLogo();
                            this.H = n4.getApk_name();
                            this.I = n4.getSize();
                            this.F = n4.getTag_id();
                        } else {
                            this.f38863c = true;
                        }
                    } else {
                        this.F = n4.getTag_id();
                        this.f38863c = false;
                        this.G = n4.getLogo();
                        this.H = n4.getApk_name();
                        this.I = n4.getSize();
                    }
                } else {
                    this.f38863c = true;
                }
                o();
                return;
            }
            this.f38864d = false;
            g();
            return;
        }
        detailResultBean.set_from(120);
        this.K = detailResultBean.getGame_name();
        this.J = detailResultBean.getIco_remote();
        this.L = detailResultBean.getSize();
        this.f38864d = false;
        EMUApkTable n5 = o.o().n(detailResultBean.getPlugin_num());
        this.E = n5;
        if (n5 != null) {
            if (l.t(this, n5, false, new String[0])) {
                if (UtilsMy.B0(this, this.E)) {
                    this.f38863c = false;
                    this.G = this.E.getLogo();
                    this.H = this.E.getApk_name();
                    this.I = this.E.getSize();
                    this.F = this.E.getTag_id();
                } else {
                    this.f38863c = true;
                }
            } else {
                this.f38863c = false;
                this.G = this.E.getLogo();
                this.H = this.E.getApk_name();
                this.I = this.E.getSize();
                this.F = this.E.getTag_id();
            }
        }
        o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void e() {
        UtilsMy.q1(this.E, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 800)
    public void f() {
        DetailResultBean detailResultBean = this.f38867g;
        if (detailResultBean == null) {
            return;
        }
        DownloadTask downloadtaskDown = detailResultBean.getDownloadtaskDown();
        downloadtaskDown.setFromRecomDown(true);
        downloadtaskDown.setDisableShowSpeedUpPrompt(true);
        com.php25.PDownload.d.c(downloadtaskDown, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g() {
        if (j.j(this)) {
            try {
                n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                int uid = accountData != null ? accountData.getUid() : 0;
                RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(this);
                ResultMainBean<List<DetailResultBean>> R = this.f38866f.R(requestBeanUtil.getAppDetialBean(this.f38862b + "", uid, null));
                if (R != null && R.getFlag() != 0) {
                    List<DetailResultBean> data = R.getMessages().getData();
                    if (data.size() != 0) {
                        DetailResultBean detailResultBean = data.get(0);
                        this.f38867g = detailResultBean;
                        d(detailResultBean);
                        return;
                    }
                    return;
                } else if (R != null && R.getFlag() != 0) {
                    n();
                    return;
                } else {
                    n();
                    return;
                }
            } catch (Exception unused) {
                n();
                d(this.f38867g);
                return;
            }
        }
        n();
        d(this.f38867g);
    }

    void h() {
        FriendInviteBean s4 = c.u().s();
        if (s4 == null || TextUtils.isEmpty(this.f38862b) || s4.getGameId() == 0) {
            return;
        }
        String str = this.f38862b;
        if (str.equals("" + s4.getGameId())) {
            c.u().P();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i() {
        this.f38883w.setVisibility(8);
        this.f38878r.setVisibility(0);
        this.f38879s.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k() {
        h();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l() {
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n() {
        this.f38883w.setVisibility(8);
        this.f38878r.setVisibility(8);
        this.f38879s.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o() {
        f K = f.K();
        DownloadTask F = K.F(this.f38862b + "");
        this.f38883w.setVisibility(0);
        this.f38878r.setVisibility(8);
        this.f38879s.setVisibility(8);
        StringBuilder sb = new StringBuilder("你需要下载游戏 ");
        if (!this.f38864d) {
            this.f38885y.setVisibility(0);
            SimpleDraweeView simpleDraweeView = this.f38868h;
            if (simpleDraweeView != null) {
                simpleDraweeView.getContext();
                String str = this.J;
                if (str == null) {
                    MyImageLoader.f(this.f38868h, R.drawable.net_match_default_user_icon, MyImageLoader.F(this, R.drawable.net_match_default_user_icon).toString(), MyImageLoader.D(this));
                } else {
                    MyImageLoader.v(this.f38868h, R.drawable.net_match_default_user_icon, str, MyImageLoader.D(this));
                }
            }
            TextView textView = this.f38869i;
            if (textView != null) {
                textView.setText(this.K);
            }
            TextView textView2 = this.f38872l;
            if (textView2 != null) {
                textView2.setText(this.L + "M");
            }
            if (F != null) {
                if (F.getStatus() == 5) {
                    this.f38871k.setVisibility(4);
                    this.f38864d = true;
                    this.f38872l.setText("下载完成");
                } else {
                    this.f38871k.setProgress((int) F.getProgress());
                }
            }
        }
        if (!this.f38863c) {
            this.f38884x.setVisibility(0);
            SimpleDraweeView simpleDraweeView2 = this.f38873m;
            if (simpleDraweeView2 == null) {
                return;
            }
            Context context = simpleDraweeView2.getContext();
            String str2 = this.G;
            if (str2 == null) {
                MyImageLoader.f(this.f38873m, R.drawable.net_match_default_user_icon, MyImageLoader.F(context, R.drawable.net_match_default_user_icon).toString(), MyImageLoader.D(this));
            } else {
                MyImageLoader.v(this.f38873m, R.drawable.net_match_default_user_icon, str2, MyImageLoader.D(this));
            }
            this.f38874n.setText(this.H);
            TextView textView3 = this.f38876p;
            textView3.setText(this.I + "M");
            EMUApkTable n4 = o.o().n(this.F);
            DownloadTask F2 = f.K().F(this.F);
            if (n4 != null && F2 != null && F2.getUrl().equals(n4.getDown_url())) {
                if (F2.getStatus() == 48) {
                    this.f38877q.setText("安装中");
                    this.f38875o.setProgress(100);
                } else if (F2.getStatus() == 11) {
                    this.f38877q.setText("安装");
                    this.f38875o.setProgress(100);
                } else {
                    this.f38875o.setProgress((int) F2.getProgress());
                }
            }
        }
        this.f38886z.setText(sb.deleteCharAt(sb.length() - 1).toString());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        h();
        super.onBackPressed();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        d0.a().e(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(n nVar) {
        boolean z4;
        DownloadTask a5 = nVar.a();
        if (this.E == null || this.f38863c || !this.f38864d || a5 == null || a5.getUrl().equals(this.E.getDown_url()) || a5.getCrc_link_type_val().equals(this.f38862b)) {
            int c5 = nVar.c();
            boolean z5 = true;
            if (c5 != 5) {
                if (c5 == 8) {
                    boolean z6 = this.f38863c;
                    if (z6 && this.f38864d) {
                        return;
                    }
                    if (z6) {
                        z4 = false;
                    } else {
                        i e5 = i.e();
                        DownloadTask f5 = e5.f(this.F + "");
                        if (f5 == null) {
                            return;
                        }
                        EMUApkTable eMUApkTable = this.E;
                        if (eMUApkTable != null && !eMUApkTable.getDown_url().equals(f5.getUrl())) {
                            return;
                        }
                        this.f38875o.setVisibility(0);
                        this.f38875o.setProgress((int) f5.getProgress());
                        TextView textView = this.f38876p;
                        textView.setText(UtilsMy.a(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a((long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d)));
                        z4 = true;
                    }
                    if (this.f38864d) {
                        z5 = z4;
                    } else {
                        i e6 = i.e();
                        DownloadTask f6 = e6.f(this.f38862b + "");
                        if (f6 == null) {
                            return;
                        }
                        this.f38871k.setVisibility(0);
                        this.f38871k.setProgress((int) f6.getProgress());
                        long parseDouble = (long) (Double.parseDouble(f6.getShowSize()) * 1024.0d * 1024.0d);
                        TextView textView2 = this.f38872l;
                        textView2.setText(UtilsMy.a(f6.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    }
                    if (z5) {
                        this.f38886z.setText("点击关闭按钮后，游戏会在后台\n继续下载哦~");
                        this.D = this.B;
                        this.f38877q.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_btn_border_gray_four_1));
                        return;
                    }
                    return;
                } else if (c5 != 11 && c5 != 48) {
                    return;
                }
            }
            DownloadTask a6 = nVar.a();
            if (a6 == null || a6.getCrc_link_type_val().equals(this.f38862b) || a6.getFileType().equals(Dtype.chajian.name())) {
                if (a6.getFileType().equals(Dtype.chajian.name())) {
                    this.f38863c = true;
                    this.f38876p.setText("下载完成");
                    this.f38875o.setVisibility(4);
                } else if (a6.getFileType().equals(Dtype.apk.name())) {
                    this.f38864d = true;
                    this.f38872l.setText("下载完成");
                    this.f38871k.setVisibility(4);
                }
                p();
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p() {
        f K = f.K();
        DownloadTask F = K.F(this.f38862b + "");
        if (F != null && this.F == null) {
            this.F = F.getPlugin_num();
        }
        if (this.E == null && this.F != null) {
            this.E = o.o().n(this.F);
        }
        EMUApkTable eMUApkTable = this.E;
        if (eMUApkTable != null) {
            if (l.t(this, eMUApkTable, false, new String[0]) && !UtilsMy.B0(this, this.E)) {
                if (F != null && F.getStatus() == 5) {
                    this.D = this.C;
                    this.f38877q.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_btn_border_blue_four));
                    this.f38877q.setText("进入房间");
                    return;
                }
                this.f38877q.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_btn_border_gray_four_1));
            } else if (F != null) {
                DownloadTask F2 = f.K().F(F.getPlugin_num());
                if (F.getStatus() == 5 && F2 != null && F2.getStatus() == 11) {
                    l2.a(this).b("插件正在安装...");
                    i.e().q(this, F2);
                    finish();
                }
            }
        }
    }
}
