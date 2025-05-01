package com.join.mgps.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.fragment.app.FragmentActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.customview.ForumLoadingView;
import com.join.mgps.dto.OemBean;
import com.join.mgps.dto.OemData;
import com.join.mgps.dto.OemRequestBean;
import com.join.mgps.dto.OemResponse;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.mg_forum_forum_gift_detail_activity)
/* loaded from: classes4.dex */
public class OemDetailActivity extends FragmentActivity {
    public static final String I = "key_oem_detail";
    public static final int J = 1;
    OemBean.OemDetailBean B;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    View f36222c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    RelativeLayout f36223d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f36224e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    View f36225f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ForumLoadingView f36226g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f36227h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f36228i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f36229j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    SimpleDraweeView f36230k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f36231l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f36232m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    LinearLayout f36233n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f36234o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    TextView f36235p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    TextView f36236q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    Button f36237r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    Button f36238s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    TextView f36239t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    TextView f36240u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    TextView f36241v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    TextView f36242w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    View f36243x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    TextView f36244y;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.rpc.m f36245z;

    /* renamed from: b  reason: collision with root package name */
    private String f36221b = getClass().getSimpleName();
    boolean A = false;
    final int C = 1;
    final int D = 2;
    Handler E = new b();
    boolean F = false;
    com.join.mgps.customview.o G = null;
    com.join.mgps.customview.o H = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends ForumLoadingView.e {
        a(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            if (view.getId() == R.id.setNetwork) {
                OemDetailActivity.this.q0();
            }
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
        }
    }

    /* loaded from: classes4.dex */
    class b extends Handler {
        b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i4 = message.what;
            if (i4 == 1) {
                OemDetailActivity.this.C0((String) message.obj);
            } else if (i4 != 2) {
            } else {
                try {
                    OemDetailActivity.this.v0();
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.Util.j0.M(view.getContext(), OemDetailActivity.this.B.getGift_cdk());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (OemDetailActivity.this.h0(OemDetailActivity.this.B.getType())) {
                OemDetailActivity.this.t0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String url = OemDetailActivity.this.B.getUrl();
            if (com.join.mgps.Util.g2.h(url)) {
                OemDetailActivity.this.showToast("礼包获取失败");
            } else {
                com.join.mgps.Util.j0.P0(view.getContext(), url);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.Util.j0.P0(view.getContext(), OemDetailActivity.this.B.getUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (OemDetailActivity.this.l0()) {
                com.join.mgps.Util.j0.P0(view.getContext(), OemDetailActivity.this.B.getUrl());
                return;
            }
            OemDetailActivity.this.showToast("您的銅板不足");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i extends ForumLoadingView.e {
        i(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            super.a(view);
            IntentUtil.getInstance().goWirelessSettings(view.getContext());
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            OemDetailActivity.this.q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j extends ForumLoadingView.e {
        j(ForumLoadingView forumLoadingView) {
            super(forumLoadingView);
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void a(View view) {
            if (view.getId() == R.id.setNetwork) {
                OemDetailActivity.this.q0();
            }
        }

        @Override // com.join.mgps.customview.ForumLoadingView.e
        public void b() {
            super.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h0(String str) {
        if (com.join.mgps.Util.g2.h(str)) {
            com.join.mgps.Util.l2.a(this).b(getString(R.string.unknow_gift_type));
            return false;
        }
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        if (str.equals("6")) {
            if (!com.join.mgps.Util.b.piv(accountData)) {
                D0();
                return false;
            }
        } else if (str.equals("7") && accountData.j1() <= 0) {
            B0();
            return false;
        }
        return true;
    }

    private void i0() {
        com.join.mgps.customview.o oVar = this.G;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.G.dismiss();
    }

    private void j0() {
        com.join.mgps.customview.o oVar = this.H;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.H.dismiss();
    }

    private void m0() {
        this.f36224e.setText("详情");
    }

    private void n0() {
        g0(1);
    }

    private void p0() {
        o0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0() {
        g0(1);
        if (com.join.android.app.common.utils.j.j(this)) {
            p0();
            return;
        }
        showToast(getString(R.string.net_connect_failed));
        g0(9);
    }

    private void r0(int i4, OemData.GiftDetailData giftDetailData) {
        if (this.B == null) {
            this.B = new OemBean.OemDetailBean();
        }
        JsonMapper.getInstance();
        this.B = (OemBean.OemDetailBean) JsonMapper.getInstance().fromJson(JsonMapper.toJsonString(giftDetailData), OemBean.OemDetailBean.class);
        u0();
    }

    private void s0(OemData.GiftGetCdkData giftGetCdkData) {
        try {
            String gift_cdk = giftGetCdkData.getGift_cdk();
            if (com.join.mgps.Util.g2.i(gift_cdk)) {
                this.B.setIs_used(Boolean.TRUE);
                this.B.setGift_cdk(gift_cdk);
                if (com.join.mgps.Util.g2.i(this.B.getMy_oem())) {
                    OemBean.OemDetailBean oemDetailBean = this.B;
                    oemDetailBean.setMy_oem((Integer.parseInt(this.B.getMy_oem()) + 1) + "");
                }
                if (this.B.getSurplus() > 0) {
                    OemBean.OemDetailBean oemDetailBean2 = this.B;
                    oemDetailBean2.setSurplus(oemDetailBean2.getSurplus() - 1);
                }
            }
            u0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void A0() {
        OemBean.OemDetailBean oemDetailBean = this.B;
        if (oemDetailBean != null && oemDetailBean.getIs_used().booleanValue()) {
            Intent intent = new Intent();
            intent.putExtra("receivedOemDetail", JsonMapper.getInstance().toJson(this.B));
            setResult(1, intent);
        }
    }

    @UiThread
    void B0() {
        com.join.mgps.customview.o oVar = this.G;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.G = com.join.mgps.Util.b0.f0(this).c0(this);
        }
        this.G.show();
    }

    void C0(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    @UiThread
    void D0() {
        com.join.mgps.customview.o oVar = this.H;
        if (oVar != null) {
            if (oVar.isShowing()) {
                return;
            }
        } else {
            this.H = com.join.mgps.Util.b0.f0(this).e0(this);
        }
        this.H.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        m0();
        n0();
        k0();
        this.f36245z = com.join.mgps.rpc.impl.m.c();
        this.f36226g.m();
        q0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        A0();
        finish();
    }

    @UiThread
    void g0(int i4) {
        this.f36226g.setFailedReloadingRes(R.drawable.reload_butn_selector);
        this.f36226g.setFailedImgRes(R.drawable.set_net_butn);
        if (i4 == 1) {
            this.f36226g.j(1);
        } else if (i4 == 2) {
            this.f36226g.j(2);
        } else if (i4 == 9) {
            ForumLoadingView forumLoadingView = this.f36226g;
            forumLoadingView.setListener(new i(forumLoadingView));
            this.f36226g.j(9);
        } else if (i4 == 10) {
            this.f36226g.j(10);
            this.f36226g.setFailedMsg("没有更多详情哦~");
            ForumLoadingView forumLoadingView2 = this.f36226g;
            forumLoadingView2.setListener(new j(forumLoadingView2));
            this.f36226g.setReloadingVisibility(0);
            this.f36226g.setFailedImgVisibility(0);
            this.f36226g.setFailedImgRes(R.drawable.btn_refresh);
            this.f36226g.setFailedReloadingRes(R.drawable.icon_no_rec);
        } else if (i4 != 16) {
        } else {
            this.f36226g.j(10);
            this.f36226g.setFailedMsg("加载失败，再试试吧~");
            ForumLoadingView forumLoadingView3 = this.f36226g;
            forumLoadingView3.setListener(new a(forumLoadingView3));
            this.f36226g.setReloadingVisibility(0);
            this.f36226g.setFailedImgVisibility(0);
            this.f36226g.setFailedImgRes(R.drawable.btn_refresh);
            this.f36226g.setFailedReloadingRes(R.drawable.icon_no_rec);
        }
    }

    public void k0() {
        try {
            String str = (String) getIntent().getSerializableExtra(I);
            if (com.join.mgps.Util.g2.h(str)) {
                finish();
            } else {
                this.B = (OemBean.OemDetailBean) JsonMapper.getInstance().fromJson(str, OemBean.OemDetailBean.class);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    boolean l0() {
        return AccountUtil_.getInstance_(this).getAccountData().O1() >= ((long) (com.join.mgps.Util.g2.i(this.B.getMoney_num()) ? Integer.parseInt(this.B.getMoney_num()) : 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0(int i4) {
        int i5;
        if (com.join.android.app.common.utils.j.j(this)) {
            if (this.A) {
                return;
            }
            try {
                try {
                    OemRequestBean.GetOemDetailRequestBean getOemDetailRequestBean = new OemRequestBean.GetOemDetailRequestBean();
                    com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(this);
                    if (com.join.mgps.Util.j0.Y0(this)) {
                        i5 = T.getUid();
                        T.getToken();
                    } else {
                        i5 = 0;
                    }
                    OemBean.OemDetailBean oemDetailBean = this.B;
                    String id = oemDetailBean != null ? oemDetailBean.getId() : "";
                    getOemDetailRequestBean.setUid(i5 + "");
                    getOemDetailRequestBean.setOid(id);
                    OemResponse<OemData.GiftDetailData> b5 = this.f36245z.b(i5, id);
                    if (b5 != null && b5.getError() == 0 && b5.getData() != null) {
                        OemData.GiftDetailData data = b5.getData();
                        if (data == null) {
                            if (i4 == 1) {
                                g0(10);
                            }
                            return;
                        }
                        r0(i4, data);
                        g0(2);
                    } else {
                        g0(16);
                    }
                } catch (Exception e5) {
                    g0(16);
                    e5.printStackTrace();
                }
                return;
            } finally {
                this.A = false;
            }
        }
        showToast(getString(R.string.net_connect_failed));
        g0(9);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        back_image();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        j0();
        i0();
        super.onDestroy();
    }

    void showToast(String str) {
        Message obtainMessage = this.E.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = str;
        obtainMessage.sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void t0() {
        String str;
        int i4;
        if (com.join.android.app.common.utils.j.j(this)) {
            if (this.F) {
                return;
            }
            try {
                try {
                    String str2 = "礼包码获取失败";
                    OemRequestBean.ReceiveCdkRequestBean receiveCdkRequestBean = new OemRequestBean.ReceiveCdkRequestBean();
                    com.wufan.user.service.protobuf.n0 T = com.join.mgps.Util.j0.T(this);
                    if (com.join.mgps.Util.j0.Y0(this)) {
                        i4 = T.getUid();
                        str = T.getToken();
                    } else {
                        str = "";
                        i4 = 0;
                    }
                    OemBean.OemDetailBean oemDetailBean = this.B;
                    String id = oemDetailBean != null ? oemDetailBean.getId() : "";
                    receiveCdkRequestBean.setUid(i4 + "");
                    receiveCdkRequestBean.setOid(id);
                    OemResponse<OemData.GiftGetCdkData> a5 = this.f36245z.a(i4, str, id);
                    if (a5 != null && a5.getError() == 0) {
                        OemData.GiftGetCdkData data = a5.getData();
                        if (data != null && com.join.mgps.Util.g2.i(data.getGift_cdk())) {
                            s0(data);
                            showToast("礼包码获取成功");
                        } else {
                            if (!com.join.mgps.Util.g2.h("")) {
                                str2 = "";
                            }
                            showToast(str2);
                        }
                    } else {
                        showToast("礼包码获取失败");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            } finally {
                this.F = false;
            }
        }
        showToast(getString(R.string.net_connect_failed));
    }

    void u0() {
        Message obtainMessage = this.E.obtainMessage();
        obtainMessage.what = 2;
        obtainMessage.sendToTarget();
    }

    @UiThread
    void v0() {
        this.f36231l.setText(this.B.getName());
        this.f36232m.setText(getString(R.string.cdk_expired_date, new Object[]{com.join.mgps.Util.y.D(this.B.getEnd_time() * 1000)}));
        String content = this.B.getContent();
        String use_method = this.B.getUse_method();
        this.f36240u.setText(content);
        this.f36242w.setText(use_method);
        if (com.join.mgps.Util.g2.h(content)) {
            this.f36239t.setVisibility(8);
            this.f36240u.setVisibility(8);
        } else {
            this.f36239t.setVisibility(0);
            this.f36240u.setVisibility(0);
        }
        if (com.join.mgps.Util.g2.h(use_method)) {
            this.f36241v.setVisibility(8);
            this.f36242w.setVisibility(8);
        } else {
            this.f36241v.setVisibility(0);
            this.f36242w.setVisibility(0);
        }
        this.f36243x.setOnClickListener(new c());
        this.f36244y.setText(getString(R.string.my_cdk_count, new Object[]{this.B.getMy_oem() + ""}));
        this.f36231l.setTextColor(getResources().getColor(R.color.gift_type_normal));
        String type = this.B.getType();
        this.f36227h.setVisibility(8);
        this.f36228i.setVisibility(8);
        this.f36229j.setVisibility(8);
        this.f36233n.setVisibility(8);
        this.f36236q.setVisibility(8);
        if (com.join.mgps.Util.g2.i(type)) {
            if (type.equals("4")) {
                this.f36231l.setTextColor(getResources().getColor(R.color.gift_type_exchange));
                z0();
            } else if (type.equals("3")) {
                this.f36231l.setTextColor(getResources().getColor(R.color.gift_type_exclusive));
                y0();
            } else if (type.equals("2")) {
                x0();
            } else if (type.equals("1") || type.equals("5")) {
                w0();
            }
        }
        MyImageLoader.h(this.f36230k, this.B.getIcon());
    }

    void w0() {
        int parseInt;
        this.f36227h.setVisibility(0);
        this.f36233n.setVisibility(0);
        this.f36237r.setOnClickListener(null);
        getResources();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.B.getSurplus());
        sb2.append("");
        sb.append(com.join.mgps.Util.g2.i(sb2.toString()) ? Integer.valueOf(this.B.getSurplus()) : "0");
        sb.append("个");
        String string = getString(R.string.cdk_propotion, new Object[]{sb.toString()});
        if (com.join.mgps.Util.g2.h(this.B.getSurplus() + "")) {
            parseInt = 0;
        } else {
            parseInt = Integer.parseInt(this.B.getSurplus() + "");
        }
        this.f36234o.setText(string);
        if (this.B.getIs_used().booleanValue()) {
            this.f36235p.setText(this.B.getGift_cdk());
            this.f36237r.setBackgroundResource(R.drawable.receive_orange);
            this.f36237r.setText("复制");
            this.f36237r.setOnClickListener(new d());
        } else if (parseInt < 1) {
            this.f36227h.setVisibility(8);
            this.f36229j.setVisibility(0);
        } else {
            this.f36235p.setText(getString(R.string.receive_cdk_tip));
            this.f36237r.setBackgroundResource(R.drawable.receive_orange);
            this.f36237r.setText("领取");
            this.f36237r.setOnClickListener(new e());
        }
    }

    void x0() {
        this.f36228i.setVisibility(0);
        this.f36238s.setText(getString(R.string.receive_cdk_button2));
        this.f36238s.setOnClickListener(new f());
    }

    void y0() {
        this.f36228i.setVisibility(0);
        this.f36236q.setVisibility(0);
        this.f36238s.setText(getString(R.string.receive_cdk_button3));
        this.f36238s.setOnClickListener(new g());
    }

    void z0() {
        this.f36228i.setVisibility(0);
        this.f36236q.setVisibility(0);
        this.f36238s.setText(getString(R.string.receive_cdk_button4));
        this.f36238s.setOnClickListener(new h());
    }
}
