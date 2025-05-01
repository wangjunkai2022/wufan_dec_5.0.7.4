package com.join.mgps.activity;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.BaseActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.DetailResultBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.GiftPackageDataOperationBean;
import com.join.mgps.dto.GiftPackageInfoBean;
import com.join.mgps.dto.GiftPackageOperationBean;
import com.join.mgps.enums.Dtype;
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
@EActivity(R.layout.gift_detail_activity)
/* loaded from: classes.dex */
public class GiftsDetailActivity extends BaseActivity {

    /* renamed from: b  reason: collision with root package name */
    com.join.mgps.rpc.e f33343b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f33344c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f33345d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ScrollView f33346e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f33347f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    SimpleDraweeView f33348g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f33349h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f33350i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f33351j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f33352k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f33353l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f33354m;
    @Extra("")

    /* renamed from: n  reason: collision with root package name */
    String f33355n;
    @Extra

    /* renamed from: o  reason: collision with root package name */
    int f33356o;
    @Extra

    /* renamed from: p  reason: collision with root package name */
    GiftPackageDataInfoBean f33357p;

    /* renamed from: q  reason: collision with root package name */
    private Context f33358q;

    /* renamed from: r  reason: collision with root package name */
    private Dialog f33359r;

    /* renamed from: s  reason: collision with root package name */
    private Button f33360s;

    /* renamed from: t  reason: collision with root package name */
    private TextView f33361t;

    /* renamed from: u  reason: collision with root package name */
    private DownloadTask f33362u;

    /* renamed from: v  reason: collision with root package name */
    private DetailResultBean f33363v;

    /* renamed from: w  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f33364w;

    /* renamed from: x  reason: collision with root package name */
    private com.join.mgps.customview.o f33365x;

    /* renamed from: y  reason: collision with root package name */
    private com.join.mgps.customview.o f33366y;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.customview.o f33367z = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask F;
            if (GiftsDetailActivity.this.f33359r != null && GiftsDetailActivity.this.f33359r.isShowing()) {
                GiftsDetailActivity.this.f33359r.dismiss();
            }
            int status = GiftsDetailActivity.this.f33362u != null ? GiftsDetailActivity.this.f33362u.getStatus() : 0;
            if (UtilsMy.w0(GiftsDetailActivity.this.f33363v.getPay_tag_info(), GiftsDetailActivity.this.f33363v.getCrc_sign_id()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 5) {
                    UtilsMy.T3(GiftsDetailActivity.this.f33358q, GiftsDetailActivity.this.f33362u);
                    return;
                } else if (status != 9 && status != 43) {
                    return;
                }
            }
            if (GiftsDetailActivity.this.f33363v != null) {
                if (UtilsMy.y0(GiftsDetailActivity.this.f33363v.getPay_tag_info(), GiftsDetailActivity.this.f33363v.getCrc_sign_id()) > 0) {
                    UtilsMy.d4(GiftsDetailActivity.this.f33358q, GiftsDetailActivity.this.f33362u.getCrc_link_type_val());
                } else {
                    if (com.join.mgps.Util.g2.i(GiftsDetailActivity.this.f33362u.getCrc_link_type_val()) && (F = p1.f.K().F(GiftsDetailActivity.this.f33362u.getCrc_link_type_val())) != null) {
                        UtilsMy.y4(GiftsDetailActivity.this.f33362u, F);
                    }
                    UtilsMy.z1(GiftsDetailActivity.this.f33362u, GiftsDetailActivity.this.f33363v);
                    if (!UtilsMy.o1(GiftsDetailActivity.this.f33358q, GiftsDetailActivity.this.f33362u)) {
                        if (GiftsDetailActivity.this.f33363v.getDown_status() == 5) {
                            UtilsMy.l1(GiftsDetailActivity.this.f33358q, GiftsDetailActivity.this.f33362u);
                        } else {
                            UtilsMy.R0(GiftsDetailActivity.this.f33358q, GiftsDetailActivity.this.f33362u, GiftsDetailActivity.this.f33363v.getTp_down_url(), GiftsDetailActivity.this.f33363v.getOther_down_switch(), GiftsDetailActivity.this.f33363v.getCdn_down_switch());
                        }
                    }
                }
            }
            GiftsDetailActivity.this.f33362u.setStatus(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ClipboardManager) GiftsDetailActivity.this.f33358q.getSystemService("clipboard")).setText(GiftsDetailActivity.this.f33357p.getGift_package_code());
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(GiftsDetailActivity.this.f33358q);
            a5.b(GiftsDetailActivity.this.f33357p.getGift_package_code() + "已复制到剪贴板");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (GiftsDetailActivity.this.f33359r == null || !GiftsDetailActivity.this.f33359r.isShowing()) {
                return;
            }
            GiftsDetailActivity.this.f33359r.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements DialogInterface.OnDismissListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            GiftsDetailActivity.this.v0();
        }
    }

    private boolean k0(String str) {
        if (com.join.mgps.Util.g2.h(str)) {
            com.join.mgps.Util.l2.a(this.f33358q).b(this.f33358q.getString(R.string.unknow_gift_type));
            return false;
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f33358q).getAccountData();
        if (str.equals("6")) {
            if (!com.join.mgps.Util.b.piv(accountData)) {
                B0();
                return false;
            }
        } else if (str.equals("7") && accountData.j1() <= 0) {
            A0();
            return false;
        }
        return true;
    }

    private void l0() {
        com.join.mgps.customview.o oVar = this.f33367z;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.f33367z.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0() {
        com.join.mgps.customview.o oVar = this.f33365x;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.f33365x = com.join.mgps.Util.b0.f0(this.f33358q).c0(this.f33358q);
        }
        this.f33365x.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0() {
        com.join.mgps.customview.o oVar = this.f33367z;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.f33367z = com.join.mgps.Util.b0.f0(this).e0(this);
        }
        this.f33367z.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f33343b = com.join.mgps.rpc.impl.d.P1();
        this.f33358q = this;
        com.join.mgps.Util.d0.a().d(this);
        this.f33347f.setText("礼包详情");
        this.f33349h.setText(this.f33357p.getGift_package_title());
        this.f33351j.setText(this.f33357p.getGift_package_code());
        TextView textView = this.f33353l;
        textView.setText(com.join.mgps.Util.y.x(this.f33357p.getGift_package_times_begin()) + " 至 " + com.join.mgps.Util.y.x(this.f33357p.getGift_package_times_end()));
        MyImageLoader.f(this.f33348g, R.drawable.banner_normal_icon, this.f33357p.getGift_package_pic(), MyImageLoader.D(this.f33358q));
        v0();
        y0();
        this.f33364w = com.join.mgps.Util.b0.f0(this.f33358q).x(this.f33358q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        u0();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void m0() {
        DetailResultBean detailResultBean = this.f33363v;
        if (detailResultBean == null || detailResultBean.getCrc_sign_id() == null) {
            return;
        }
        DownloadTask F = p1.f.K().F(this.f33363v.getCrc_sign_id());
        this.f33362u = F;
        if (F == null) {
            this.f33362u = this.f33363v.getDownloadtaskDown();
            if (UtilsMy.o0(this.f33363v.getTag_info())) {
                this.f33362u.setFileType(Dtype.android.name());
                if (com.join.android.app.common.utils.e.l0(getApplicationContext()).d(getApplicationContext(), this.f33363v.getPackage_name())) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(getApplicationContext()).l(getApplicationContext(), this.f33363v.getPackage_name());
                    if (com.join.mgps.Util.g2.i(this.f33363v.getVer()) && l4.d() < Integer.parseInt(this.f33363v.getVer())) {
                        this.f33362u.setStatus(9);
                    } else {
                        this.f33362u.setStatus(5);
                    }
                } else {
                    this.f33362u.setStatus(0);
                }
            } else {
                this.f33362u.setStatus(0);
            }
        } else {
            F.setDownloadType(this.f33363v.getDownloadType());
            this.f33362u.setScreenshot_pic(this.f33363v.getScreenshot_pic());
        }
        x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0() {
        if (com.join.android.app.common.utils.j.j(this.f33358q)) {
            try {
                GiftPackageInfoBean P0 = this.f33343b.P0(p0());
                if (P0 != null) {
                    GiftPackageDataInfoBean data = P0.getMessages().getData();
                    this.f33357p = data;
                    if (data != null) {
                        z0();
                        return;
                    }
                    return;
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                r0();
                return;
            }
        }
        r0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0() {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                    GiftPackageOperationBean f02 = this.f33343b.f0(RequestBeanUtil.getInstance(this).getGiftPackageOperationRequestBean(this.f33356o, this.f33357p.getGift_package_id(), this.f33355n));
                    if (f02 != null) {
                        if (f02.getFlag().equals("0")) {
                            String error_info = f02.getError_info();
                            if (error_info != null && f02.getCode().equals("1001")) {
                                showToast(error_info);
                            }
                            return;
                        }
                        List<GiftPackageDataOperationBean> data = f02.getMessages().getData();
                        if (data != null && data.size() > 0) {
                            GiftPackageDataOperationBean giftPackageDataOperationBean = data.get(0);
                            w0(giftPackageDataOperationBean);
                            GiftPackageDataInfoBean gift_info = giftPackageDataOperationBean.getGift_info();
                            if (gift_info != null) {
                                t0(gift_info.getGift_package_code());
                            }
                        } else {
                            showToast("领取失败");
                        }
                    } else {
                        showToast("领取失败");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                q0();
            } else {
                showToast("领取失败");
            }
        } finally {
            q0();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        u0();
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        l0();
        com.join.mgps.Util.d0.a().e(this);
        Dialog dialog = this.f33359r;
        if (dialog != null && dialog.isShowing()) {
            this.f33359r.dismiss();
        }
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        if (a5 == null || this.f33362u == null || !a5.getCrc_link_type_val().equals(this.f33362u.getCrc_link_type_val())) {
            return;
        }
        this.f33362u = a5;
        int c5 = nVar.c();
        if (c5 != 5) {
            if (c5 == 8) {
                DownloadTask downloadTask = this.f33362u;
                if (downloadTask == null || downloadTask.getPath() == null) {
                    return;
                }
                UtilsMy.x4(this.f33362u);
                return;
            } else if (c5 != 11 && c5 != 48) {
                return;
            }
        }
        if (this.f33362u == null || !a5.getCrc_link_type_val().equals(this.f33362u.getCrc_link_type_val())) {
            return;
        }
        this.f33362u = a5;
    }

    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        n0();
    }

    public CommonRequestBean p0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f33358q).getAccountData();
        if (accountData != null) {
            this.f33356o = accountData.getUid();
        }
        return RequestBeanUtil.getInstance(this.f33358q).getGiftPackageInfoRequestBean(this.f33356o, this.f33357p.getGift_package_id());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        com.join.mgps.dialog.d1 d1Var = this.f33364w;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.f33364w.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0() {
        this.f33344c.setVisibility(8);
        this.f33345d.setVisibility(0);
        this.f33346e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        y0();
        n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        if (this.f33357p.getGift_package_status() == 1) {
            if (this.f33357p.getGift_package_overdue() == 1) {
                com.join.mgps.Util.l2.a(this.f33358q).b("该礼包已过期");
                return;
            }
            ((ClipboardManager) this.f33358q.getSystemService("clipboard")).setText(this.f33357p.getGift_package_code());
            com.join.mgps.Util.l2 a5 = com.join.mgps.Util.l2.a(this.f33358q);
            a5.b(this.f33357p.getGift_package_code() + "已复制到剪贴板");
            return;
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f33358q).getAccountData();
        if (IntentUtil.getInstance().goLoginNetGame(this) || !k0(this.f33357p.getGift_package_type())) {
            return;
        }
        this.f33356o = accountData.getUid();
        com.join.mgps.dialog.d1 d1Var = this.f33364w;
        if (d1Var != null) {
            d1Var.b();
        }
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.f33358q).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0(String str) {
        this.f33351j.setText(str);
        this.f33350i.setText("复制");
    }

    void u0() {
        if (this.f33357p == null) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("receivedOemDetail", JsonMapper.getInstance().toJson(this.f33357p));
        setResult(100, intent);
    }

    void v0() {
        if (this.f33357p.getGift_package_status() == 1) {
            if (this.f33357p.getGift_package_overdue() == 1) {
                this.f33350i.setText("已过期");
                this.f33350i.setTextColor(-7763575);
                this.f33350i.setBackgroundResource(R.drawable.recom_grey_butn);
                return;
            }
            this.f33350i.setText("复制");
            this.f33350i.setTextColor(-358375);
            this.f33350i.setBackgroundResource(R.drawable.recom_maincolor_butn);
            return;
        }
        this.f33350i.setText("领取");
        this.f33350i.setTextColor(-358375);
        this.f33350i.setBackgroundResource(R.drawable.recom_maincolor_butn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0(GiftPackageDataOperationBean giftPackageDataOperationBean) {
        GiftPackageDataInfoBean gift_info = giftPackageDataOperationBean.getGift_info();
        this.f33357p.setGift_package_status(1);
        this.f33357p.setGift_package_overdue(gift_info.getGift_package_overdue());
        this.f33357p.setGift_package_code(gift_info.getGift_package_code());
        this.f33350i.setBackgroundResource(R.drawable.recom_maincolor_butn);
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.f33358q, R.style.MyDialog);
        this.f33359r = oVar;
        oVar.setContentView(R.layout.save_code_dialog);
        this.f33360s = (Button) this.f33359r.findViewById(R.id.dialog_button_cancle);
        Button button = (Button) this.f33359r.findViewById(R.id.dialog_button_ok);
        TextView textView = (TextView) this.f33359r.findViewById(R.id.saveCodeTv);
        this.f33361t = (TextView) this.f33359r.findViewById(R.id.moneyText);
        textView.setText("领取");
        ((TextView) this.f33359r.findViewById(R.id.tip_title)).setText("领号成功");
        button.setText("关闭");
        ((TextView) this.f33359r.findViewById(R.id.saveCodeContent)).setText(this.f33357p.getGift_package_code());
        this.f33360s.setOnClickListener(new a());
        textView.setOnClickListener(new b());
        button.setOnClickListener(new c());
        this.f33359r.setOnDismissListener(new d());
        this.f33363v = giftPackageDataOperationBean.getGame_info();
        m0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0() {
        Dialog dialog;
        DownloadTask downloadTask = this.f33362u;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (UtilsMy.w0(this.f33363v.getPay_tag_info(), this.f33363v.getCrc_sign_id()) > 0) {
            status = 43;
        }
        if (status != 0) {
            if (status == 5) {
                this.f33360s.setText("启动游戏");
            } else if (status != 9 && status != 43) {
                this.f33360s.setText("下载中..");
            }
            this.f33351j.setText(this.f33357p.getGift_package_code());
            dialog = this.f33359r;
            if (dialog != null || dialog.isShowing()) {
            }
            this.f33359r.show();
            return;
        }
        this.f33360s.setText("下载游戏");
        DetailResultBean detailResultBean = this.f33363v;
        if (detailResultBean != null) {
            UtilsMy.w0(detailResultBean.getPay_tag_info(), this.f33363v.getCrc_sign_id());
            UtilsMy.r3(this.f33360s, this.f33363v.getDown_status(), this.f33363v.getPay_tag_info(), this.f33363v.getCrc_sign_id());
            UtilsMy.k3(this.f33363v.getSp_tag_info(), this.f33361t);
        }
        this.f33351j.setText(this.f33357p.getGift_package_code());
        dialog = this.f33359r;
        if (dialog != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0() {
        this.f33345d.setVisibility(8);
        this.f33344c.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0() {
        this.f33344c.setVisibility(8);
        this.f33345d.setVisibility(8);
        this.f33346e.setVisibility(0);
        this.f33349h.setText(this.f33357p.getGift_package_title());
        this.f33351j.setText(this.f33357p.getGift_package_code());
        MyImageLoader.f(this.f33348g, R.drawable.banner_normal_icon, this.f33357p.getGift_package_pic(), MyImageLoader.D(this.f33358q));
        this.f33352k.setText(this.f33357p.getGift_package_content());
        TextView textView = this.f33353l;
        textView.setText(com.join.mgps.Util.y.x(this.f33357p.getGift_package_times_begin()) + " 至 " + com.join.mgps.Util.y.x(this.f33357p.getGift_package_times_end()));
        this.f33354m.setText(this.f33357p.getGift_package_explain());
        v0();
    }
}
