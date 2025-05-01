package com.join.mgps.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.BaseActivity;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.message.MessageSettingActivity_;
import com.join.mgps.dialog.y0;
import com.join.mgps.dto.APKVersionMainBean;
import com.join.mgps.dto.AccountResultMainBean;
import com.join.mgps.dto.AccountTokenSuccess;
import com.join.mgps.dto.AccoutLoginOutRequest;
import com.join.mgps.dto.ApkVersionbean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.VersionDto;
import com.join.mgps.pref.PrefDef_;
import java.io.File;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.download_setting_activity)
/* loaded from: classes4.dex */
public class DownloadSettingActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f30015b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RelativeLayout f30016c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ImageView f30017d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ImageView f30018e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f30019f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f30020g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f30021h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f30022i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f30023j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f30024k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    View f30025l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    View f30026m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    ImageView f30027n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    RelativeLayout f30028o;

    /* renamed from: p  reason: collision with root package name */
    private Context f30029p;
    @Pref

    /* renamed from: q  reason: collision with root package name */
    PrefDef_ f30030q;

    /* renamed from: t  reason: collision with root package name */
    com.join.mgps.rpc.e f30033t;

    /* renamed from: u  reason: collision with root package name */
    private com.join.mgps.dialog.e f30034u;

    /* renamed from: w  reason: collision with root package name */
    Dialog f30036w;

    /* renamed from: y  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f30038y;

    /* renamed from: r  reason: collision with root package name */
    private boolean f30031r = true;

    /* renamed from: s  reason: collision with root package name */
    private boolean f30032s = true;

    /* renamed from: v  reason: collision with root package name */
    private String f30035v = DownloadSettingActivity.class.getName();

    /* renamed from: x  reason: collision with root package name */
    AlertDialog.Builder f30037x = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f30039b;

        a(boolean z4) {
            this.f30039b = z4;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
            com.join.mgps.pref.h.n(DownloadSettingActivity.this).k0(!this.f30039b);
            DownloadSettingActivity.this.f30027n.setImageResource(R.drawable.ic_notif_closed);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements y0.f {
        c() {
        }

        @Override // com.join.mgps.dialog.y0.f
        public void a() {
            DownloadSettingActivity.this.f30023j.setText("永不提醒");
        }

        @Override // com.join.mgps.dialog.y0.f
        public void b() {
            DownloadSettingActivity.this.f30023j.setText("每次都提醒");
        }

        @Override // com.join.mgps.dialog.y0.f
        public void c() {
            DownloadSettingActivity.this.f30023j.setText("大于50M提醒");
        }

        @Override // com.join.mgps.dialog.y0.f
        public void d() {
            DownloadSettingActivity.this.f30023j.setText("大于30M提醒");
        }

        @Override // com.join.mgps.dialog.y0.f
        public void e() {
            DownloadSettingActivity.this.f30023j.setText("大于100M提醒");
        }
    }

    private void m0() {
        this.f30030q.lastCheckInTime().g(0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        com.join.mgps.Util.v0.d(this.f30035v, "afterview");
        this.f30020g.setText("设置");
        this.f30029p = this;
        this.f30033t = com.join.mgps.rpc.impl.d.P1();
        this.f30024k.setText(com.join.mgps.Util.s.d(this.f30029p));
        if (com.join.mgps.pref.h.n(this).x()) {
            this.f30027n.setImageResource(R.drawable.ic_notif_open);
        } else {
            this.f30027n.setImageResource(R.drawable.ic_notif_closed);
        }
        try {
            if (AccountUtil_.getInstance_(this.f30029p).isTourist() || AccountUtil_.getInstance_(this.f30029p).getAccountData().getUid() == 0) {
                this.f30026m.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        int intValue = this.f30030q.gprsNoticeInfo().d().intValue();
        if (intValue == 0) {
            this.f30023j.setText("每次都提醒");
        } else if (intValue == 1) {
            this.f30023j.setText("大于30M提醒");
        } else if (intValue == 2) {
            this.f30023j.setText("大于50M提醒");
        } else if (intValue == 3) {
            this.f30023j.setText("大于100M提醒");
        } else if (intValue == 4) {
            this.f30023j.setText("永不提醒");
        }
        String g4 = com.join.mgps.pref.h.n(this.f30029p).g();
        this.f30022i.setText(g4);
        long c5 = com.join.mgps.Util.s1.c(g4);
        long b5 = com.join.mgps.Util.s1.b(g4);
        TextView textView = this.f30022i;
        textView.setText("可用空间：" + UtilsMy.h(c5) + net.lingala.zip4j.util.e.F0 + UtilsMy.h(b5) + "\n存储位置：" + g4);
        if (this.f30030q.isAutoWifiDownUpdate().d().booleanValue()) {
            this.f30019f.setImageResource(R.drawable.handshank_virtualkey_on);
        } else {
            this.f30019f.setImageResource(R.drawable.handshank_virtualkey_off);
        }
        if (AccountUtil_.getInstance_(this.f30029p).isTourist()) {
            this.f30025l.setVisibility(8);
        }
        this.f30028o.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void error(String str) {
        com.join.mgps.Util.l2.a(this.f30029p).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        MYAccountDetialActivity_.T0(this.f30029p).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        org.androidannotations.api.sharedpreferences.d isAutoWifiDownUpdate = this.f30030q.isAutoWifiDownUpdate();
        Boolean bool = Boolean.TRUE;
        if (isAutoWifiDownUpdate.e(bool).booleanValue()) {
            this.f30019f.setImageResource(R.drawable.handshank_virtualkey_off);
            this.f30030q.isAutoWifiDownUpdate().g(Boolean.FALSE);
            return;
        }
        this.f30019f.setImageResource(R.drawable.handshank_virtualkey_on);
        this.f30030q.isAutoWifiDownUpdate().g(bool);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        h0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        boolean x4 = com.join.mgps.pref.h.n(this).x();
        if (x4) {
            Dialog dialog = this.f30036w;
            if (dialog == null) {
                this.f30037x = new AlertDialog.Builder(this.f30029p, R.style.AlertDialogCustom);
            } else if (dialog.isShowing()) {
                return;
            }
            this.f30037x.setTitle("提示");
            this.f30037x.setMessage("该设置应用于游戏下载后的推荐，建议您保留开启。");
            this.f30037x.setPositiveButton("仍要关闭", new a(x4));
            this.f30037x.setNegativeButton("取消", new b());
            this.f30036w = this.f30037x.show();
            return;
        }
        com.join.mgps.pref.h.n(this).k0(!x4);
        this.f30027n.setImageResource(R.drawable.ic_notif_open);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        l0();
    }

    @Background
    public void l0() {
        if (com.join.android.app.common.utils.j.j(this.f30029p)) {
            try {
                ResultMainBean<List<APKVersionMainBean>> r12 = this.f30033t.r1(RequestBeanUtil.getInstance(getApplicationContext()).getApkVersion(2, 1, 0));
                ApkVersionbean apkVersionbean = r12.getMessages().getData().get(0).getApp().get(0);
                if (r12.getFlag() == 1) {
                    String[] A = com.join.android.app.common.utils.n.n(getApplicationContext()).A();
                    String ver = apkVersionbean.getVer();
                    int parseInt = Integer.parseInt(ver.split("_")[0]);
                    int parseInt2 = Integer.parseInt(apkVersionbean.getVer_compatible().split("_")[0]);
                    if (Integer.parseInt(A[0]) <= parseInt) {
                        VersionDto versionDto = new VersionDto();
                        versionDto.setAndroidUrl(apkVersionbean.getDown_url());
                        versionDto.setVersionNo(Integer.parseInt(ver.split("_")[0]));
                        versionDto.setInfo(apkVersionbean.getVer_info());
                        versionDto.setHead_pic(apkVersionbean.getHead_pic());
                        versionDto.setTow_tpl_back_ground_pic(apkVersionbean.getTow_tpl_back_ground_pic());
                        versionDto.setTpl_type(apkVersionbean.getTpl_type());
                        if (Integer.parseInt(A[0]) < parseInt) {
                            if (Float.parseFloat(A[0]) < parseInt2) {
                                showVersionDownLoadHint(versionDto, true);
                            } else {
                                showVersionDownLoadHint(versionDto, false);
                            }
                        } else {
                            error("无需更新,已是最新版本");
                        }
                    } else {
                        error("无需更新,已是最新版本");
                    }
                }
                return;
            } catch (Exception unused) {
                error("网络似乎不通哦~");
                return;
            }
        }
        error("网络似乎不通哦~");
    }

    void n0() {
        try {
            String localUserIcon = AccountUtil_.getInstance_(this).getLocalUserIcon();
            if (com.join.mgps.Util.g2.i(localUserIcon)) {
                File file = new File(localUserIcon);
                if (file.exists()) {
                    file.delete();
                    Fresco.getImagePipeline().e(MyImageLoader.G(file));
                }
            }
            AccountUtil_.getInstance_(this).setLocalUserIcon(null);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.v0.d(this.f30035v, "onDestroy");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void p0() {
        t0();
        AccountUtil_.getInstance_(getApplicationContext()).accountLoginOut(getApplicationContext());
        this.f30038y = AccountUtil_.getInstance_(getApplicationContext()).getAccountData();
        n0();
        m0();
        com.join.mgps.broadcast.a.a(this.f30029p);
        com.join.mgps.Util.l2.a(this.f30029p).b("退出登录成功");
        this.f30030q.singleGameShowDialog().g("");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.rl_developer})
    public void q0() {
        DeveloperActivity_.E0(this).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        com.join.mgps.dialog.y0 w4 = com.join.mgps.Util.b0.f0(this.f30029p).w(this.f30029p);
        w4.j(new c());
        w4.k(this.f30030q);
        w4.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72022r})
    public void s0(Intent intent) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.f30029p).b(str);
    }

    @UiThread
    public void showVersionDownLoadHint(VersionDto versionDto, boolean z4) {
        SharedPreferences.Editor edit = getSharedPreferences("VersionXML", 0).edit();
        edit.putBoolean("Mandatory", z4);
        edit.putString("VersionDto", JsonMapper.getInstance().toJson(versionDto));
        edit.commit();
        if (this.f30034u == null) {
            this.f30034u = new com.join.mgps.dialog.e(this, R.style.HKDialogLoading, versionDto, z4);
        }
        if (this.f30034u.isShowing()) {
            return;
        }
        this.f30034u.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t0() {
        if (com.join.android.app.common.utils.j.j(this.f30029p)) {
            try {
                AccoutLoginOutRequest accoutLoginOutRequest = new AccoutLoginOutRequest();
                accoutLoginOutRequest.setUid(this.f30038y.getUid() + "");
                accoutLoginOutRequest.setSign(com.join.mgps.Util.x1.g(accoutLoginOutRequest));
                AccountResultMainBean<AccountTokenSuccess> b5 = com.join.mgps.rpc.impl.a.c0().b(accoutLoginOutRequest.getParams());
                if (b5 != null && b5.getError() == 0) {
                    if (b5.getData().is_success()) {
                        AccountUtil_.getInstance_(getApplicationContext()).accountLoginOut(getApplicationContext());
                    } else {
                        showToast(b5.getData().getError_msg());
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void u0() {
        if (IntentUtil.getInstance().goLogin(this.f30029p)) {
            return;
        }
        MessageSettingActivity_.s0(this.f30029p).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v0() {
        VideoSettingActivity_.n0(this.f30029p).start();
    }
}
