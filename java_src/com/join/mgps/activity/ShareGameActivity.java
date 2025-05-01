package com.join.mgps.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.tencent.qzone.QZone;
import cn.sharesdk.wechat.friends.Wechat;
import cn.sharesdk.wechat.moments.WechatMoments;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.dto.GameShareData;
import com.join.mgps.dto.RequestGameShareTag;
import com.join.mgps.dto.RequestUidtagidTagdes;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.ShareGameTodayData;
import com.join.mgps.dto.TipBean;
import com.tencent.bugly.Bugly;
import com.umeng.analytics.MobclickAgent;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagFlowLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_share_game)
/* loaded from: classes4.dex */
public class ShareGameActivity extends AppCompatActivity {
    @ViewById
    TextView A;
    @ViewById
    TextView B;
    @ViewById
    TextView C;
    @ViewById
    TextView D;
    @ViewById
    TextView E;
    @ViewById
    TagFlowLayout F;
    @ViewById
    ImageView G;
    @ViewById
    ImageView H;
    @ViewById
    ImageView I;
    @ViewById
    EditText J;
    @ViewById
    ImageView K;
    @Extra
    DownloadTask L;
    LayoutInflater M;
    Context N;
    com.join.mgps.rpc.e O;
    ShareGameTodayData P;
    com.wufan.user.service.protobuf.n0 Q;
    String R;
    boolean S = false;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f37393b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    SimpleDraweeView f37394c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f37395d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f37396e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f37397f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f37398g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    SimpleDraweeView f37399h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    SimpleDraweeView f37400i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f37401j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f37402k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    LinearLayout f37403l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    LinearLayout f37404m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    LinearLayout f37405n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    LinearLayout f37406o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    LinearLayout f37407p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    MStarBar f37408q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    MStarBar f37409r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    MStarBar f37410s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    MStarBar f37411t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    SimpleDraweeView f37412u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    SimpleDraweeView f37413v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    SimpleDraweeView f37414w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    SimpleDraweeView f37415x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    SimpleDraweeView f37416y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    TextView f37417z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends com.zhy.view.flowlayout.b<TipBean> {
        a(List list) {
            super(list);
        }

        @Override // com.zhy.view.flowlayout.b
        /* renamed from: j */
        public View d(FlowLayout flowLayout, int i4, TipBean tipBean) {
            ShareGameActivity shareGameActivity = ShareGameActivity.this;
            TextView textView = (TextView) shareGameActivity.M.inflate(R.layout.share_flowlayout_tagitem, (ViewGroup) shareGameActivity.F, false);
            textView.setText(tipBean.getName());
            return textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements TagFlowLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f37419a;

        b(List list) {
            this.f37419a = list;
        }

        @Override // com.zhy.view.flowlayout.TagFlowLayout.b
        public boolean a(View view, int i4, FlowLayout flowLayout) {
            try {
                DownloadTask F = p1.f.K().F(ShareGameActivity.this.L.getCrc_link_type_val());
                F.setIs_boot_commented(1);
                p1.f.K().update(F);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (i4 + 1 == this.f37419a.size()) {
                ShareGameActivity.this.f37405n.setVisibility(8);
                ShareGameActivity.this.f37401j.setVisibility(8);
                ShareGameActivity.this.f37404m.setVisibility(0);
                o2.a.c(ShareGameActivity.this.J);
                ShareGameActivity.this.K.setVisibility(0);
                ShareGameActivity.this.I.setVisibility(8);
                ShareGameActivity.this.H.setVisibility(8);
                MobclickAgent.onEvent(ShareGameActivity.this.N, "OnRemarkInput");
            } else if (AccountUtil_.getInstance_(ShareGameActivity.this.N).isTourist()) {
                ShareGameActivity.this.v0(1, ((TipBean) this.f37419a.get(i4)).getContent(), ((TipBean) this.f37419a.get(i4)).getId());
            } else {
                MobclickAgent.onEvent(ShareGameActivity.this.N, "OnRemarkShare");
                ShareGameActivity.this.f37406o.setVisibility(0);
                ShareGameActivity.this.K.setVisibility(0);
                ShareGameActivity.this.H.setVisibility(8);
                ShareGameActivity.this.f37407p.setVisibility(0);
                ShareGameActivity.this.f37401j.setVisibility(8);
                ShareGameActivity.this.f37403l.setVisibility(8);
                ShareGameActivity.this.E.setText(((TipBean) this.f37419a.get(i4)).getContent());
                if (ShareGameActivity.this.Q.n2() == 2) {
                    ShareGameActivity shareGameActivity = ShareGameActivity.this;
                    shareGameActivity.q0(shareGameActivity.f37408q.getStarMark(), ShareGameActivity.this.D);
                } else {
                    ShareGameActivity.this.o0(((TipBean) this.f37419a.get(i4)).getId());
                }
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements TagFlowLayout.a {
        c() {
        }

        @Override // com.zhy.view.flowlayout.TagFlowLayout.a
        public void a(Set<Integer> set) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements MStarBar.a {
        d() {
        }

        @Override // com.join.mgps.customview.MStarBar.a
        public void a(float f5) {
            double d5 = f5;
            ShareGameActivity.this.f37409r.setStarMark(d5);
            ShareGameActivity.this.f37411t.setStarMark(d5);
            ShareGameActivity.this.f37410s.setStarMark(d5);
            if (f5 > 2.0f) {
                ShareGameActivity.this.f37402k.setVisibility(8);
                ShareGameActivity.this.I.setVisibility(8);
                ShareGameActivity.this.f37403l.setVisibility(0);
                ShareGameActivity.this.K.setVisibility(8);
                MobclickAgent.onEvent(ShareGameActivity.this.N, "onRemarkLabel");
                ShareGameActivity.this.H.setVisibility(0);
                return;
            }
            ShareGameActivity.this.f37405n.setVisibility(8);
            ShareGameActivity.this.f37401j.setVisibility(8);
            ShareGameActivity.this.f37404m.setVisibility(0);
            ShareGameActivity.this.K.setVisibility(0);
            ShareGameActivity.this.I.setVisibility(8);
            o2.a.c(ShareGameActivity.this.J);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ShareGameActivity.this.J.getText().toString().trim().length() == 0) {
                com.join.mgps.Util.l2.a(ShareGameActivity.this.N).b("评价不能为空");
                return;
            }
            try {
                DownloadTask F = p1.f.K().F(ShareGameActivity.this.L.getCrc_link_type_val());
                F.setIs_boot_commented(1);
                p1.f.K().update(F);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (AccountUtil_.getInstance_(ShareGameActivity.this.N).isTourist()) {
                ShareGameActivity shareGameActivity = ShareGameActivity.this;
                shareGameActivity.v0(2, shareGameActivity.J.getText().toString(), "1");
            } else {
                ShareGameActivity.this.f37404m.setVisibility(8);
                MobclickAgent.onEvent(ShareGameActivity.this.N, "OnRemarkShare");
                ShareGameActivity.this.f37406o.setVisibility(0);
                ShareGameActivity.this.f37407p.setVisibility(0);
                ShareGameActivity shareGameActivity2 = ShareGameActivity.this;
                shareGameActivity2.E.setText(shareGameActivity2.J.getText());
                if (ShareGameActivity.this.Q.n2() == 2) {
                    ShareGameActivity shareGameActivity3 = ShareGameActivity.this;
                    shareGameActivity3.q0(shareGameActivity3.f37408q.getStarMark(), ShareGameActivity.this.D);
                }
                ShareGameActivity shareGameActivity4 = ShareGameActivity.this;
                shareGameActivity4.p0(shareGameActivity4.J.getText().toString());
            }
            o2.a.b(ShareGameActivity.this.J);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements w1.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f37424a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37425b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37426c;

        f(String str, String str2, int i4) {
            this.f37424a = str;
            this.f37425b = str2;
            this.f37426c = i4;
        }

        @Override // w1.d
        public void a(Dialog dialog) {
            MobclickAgent.onEvent(ShareGameActivity.this.N, "OnRemarkShare");
            ShareGameActivity.this.f37406o.setVisibility(0);
            ShareGameActivity.this.K.setVisibility(0);
            ShareGameActivity.this.f37407p.setVisibility(0);
            ShareGameActivity.this.f37401j.setVisibility(8);
            ShareGameActivity.this.f37403l.setVisibility(8);
            ShareGameActivity.this.H.setVisibility(8);
            ShareGameActivity.this.f37404m.setVisibility(8);
            ShareGameActivity.this.f37406o.setVisibility(0);
            ShareGameActivity.this.f37407p.setVisibility(0);
            ShareGameActivity.this.E.setText(this.f37425b);
            if (this.f37426c == 1) {
                if (ShareGameActivity.this.Q.n2() == 2) {
                    ShareGameActivity shareGameActivity = ShareGameActivity.this;
                    shareGameActivity.q0(shareGameActivity.f37408q.getStarMark(), ShareGameActivity.this.D);
                }
                ShareGameActivity.this.o0(this.f37424a);
            } else {
                if (ShareGameActivity.this.Q.n2() == 2) {
                    ShareGameActivity shareGameActivity2 = ShareGameActivity.this;
                    shareGameActivity2.q0(shareGameActivity2.f37408q.getStarMark(), ShareGameActivity.this.D);
                }
                ShareGameActivity shareGameActivity3 = ShareGameActivity.this;
                shareGameActivity3.p0(shareGameActivity3.J.getText().toString());
            }
            dialog.dismiss();
        }

        @Override // w1.d
        public void b(Dialog dialog) {
            ShareGameActivity shareGameActivity = ShareGameActivity.this;
            shareGameActivity.R = this.f37424a;
            shareGameActivity.E.setText(this.f37425b);
            LoginSplashActivity_.intent(ShareGameActivity.this.N).start();
            dialog.dismiss();
        }
    }

    public static boolean i0(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            for (int i4 = 0; i4 < installedPackages.size(); i4++) {
                if (installedPackages.get(i4).packageName.toLowerCase(Locale.ENGLISH).equals("com.tencent.mobileqq")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean j0(Context context) {
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            for (int i4 = 0; i4 < installedPackages.size(); i4++) {
                if (installedPackages.get(i4).packageName.toLowerCase(Locale.ENGLISH).equals("com.tencent.mm")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(float f5, TextView textView) {
        int i4 = (int) f5;
        if (i4 == 1) {
            textView.setText("浪费生命");
        } else if (i4 == 2) {
            textView.setText("打发时间");
        } else if (i4 == 3) {
            textView.setText("值得一玩");
        } else if (i4 == 4) {
            textView.setText("强烈推荐");
        } else if (i4 != 5) {
            textView.setText("点击星星评分");
        } else {
            textView.setText("必玩神作");
        }
    }

    private static void s0(Context context, String str, int i4) {
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setImagePath(str);
        ShareSDK.getPlatform(QZone.NAME).share(shareParams);
    }

    private static void t0(Context context, Bitmap bitmap, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put("Id", "4");
        hashMap.put("SortId", "1");
        hashMap.put(com.alipay.sdk.packet.d.f4899h, "wxf04635c4c318fe2d");
        hashMap.put("AppSecret", "8e21d75298829047b830ac5034b7073c");
        hashMap.put("BypassApproval", Bugly.SDK_IS_DEV);
        hashMap.put("Enable", "true");
        ShareSDK.setPlatformDevInfo(WechatMoments.NAME, hashMap);
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setShareType(2);
        shareParams.setTitle("分享");
        shareParams.setImageData(bitmap);
        ShareSDK.getPlatform(Wechat.NAME).share(shareParams);
    }

    private static void u0(Context context, Bitmap bitmap, int i4) {
        HashMap hashMap = new HashMap();
        hashMap.put("Id", "4");
        hashMap.put("SortId", "1");
        hashMap.put(com.alipay.sdk.packet.d.f4899h, "wxf04635c4c318fe2d");
        hashMap.put("AppSecret", "8e21d75298829047b830ac5034b7073c");
        hashMap.put("BypassApproval", Bugly.SDK_IS_DEV);
        hashMap.put("Enable", "true");
        String str = Wechat.NAME;
        ShareSDK.setPlatformDevInfo(str, hashMap);
        Platform.ShareParams shareParams = new Platform.ShareParams();
        shareParams.setShareType(2);
        shareParams.setTitle("分享");
        shareParams.setImageData(bitmap);
        ShareSDK.getPlatform(str).share(shareParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.N = this;
        this.O = com.join.mgps.rpc.impl.d.P1();
        MobclickAgent.onEvent(this.N, "onRemarkBegin");
        MyImageLoader.L(this.f37394c, this.L.getPortraitURL(), 6, 15);
        String K = com.join.mgps.pref.h.n(this.N).K();
        if (com.join.mgps.Util.g2.h(K)) {
            this.P = new ShareGameTodayData();
        } else {
            this.P = (ShareGameTodayData) JsonMapper.getInstance().fromJson(K, ShareGameTodayData.class);
        }
        if (this.P == null) {
            this.P = new ShareGameTodayData();
        }
        if (!com.join.android.app.common.utils.g.g(this.P.getLastTime())) {
            this.P.setLastTime(System.currentTimeMillis());
            this.P.setGameid1(this.L.getCrc_link_type_val());
            this.P.setGameid2(null);
            this.P.setGameid3(null);
            this.P.setHasShare(false);
        } else {
            String crc_link_type_val = this.L.getCrc_link_type_val();
            if (!crc_link_type_val.equals(this.P.getGameid1()) && !crc_link_type_val.equals(this.P.getGameid2()) && !crc_link_type_val.equals(this.P.getGameid3())) {
                if (this.P.getGameid1() == null) {
                    this.P.setGameid1(crc_link_type_val);
                } else if (this.P.getGameid2() == null) {
                    this.P.setGameid2(crc_link_type_val);
                } else if (this.P.getGameid3() == null) {
                    this.P.setGameid3(crc_link_type_val);
                }
            }
        }
        com.join.mgps.pref.h.n(this.N).y0(JsonMapper.getInstance().toJson(this.P));
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        this.f37402k.setVisibility(0);
        this.I.setVisibility(0);
        this.f37403l.setVisibility(8);
        this.H.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.B})
    public void e0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        this.Q = accountData;
        MyImageLoader.h(this.f37400i, accountData.d0());
        MyImageLoader.h(this.f37412u, this.Q.d0());
        MyImageLoader.h(this.f37413v, this.Q.d0());
        MyImageLoader.h(this.f37416y, this.Q.d0());
        this.f37417z.setText(this.Q.getNickname());
        this.A.setText(this.Q.getNickname());
        this.D.setText(this.Q.getNickname());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        if (this.f37404m.getVisibility() == 0) {
            MobclickAgent.onEvent(this.N, "onRemarkBegin");
            this.f37405n.setVisibility(0);
            this.f37401j.setVisibility(0);
            this.f37404m.setVisibility(8);
            this.K.setVisibility(8);
            if (this.f37408q.getStarMark() > 2.0f) {
                this.H.setVisibility(0);
                this.I.setVisibility(8);
            } else {
                this.H.setVisibility(8);
                this.I.setVisibility(0);
            }
            o2.a.b(this.J);
            return;
        }
        w0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        if (!j0(this.N)) {
            com.join.mgps.Util.l2.a(this.N).b("沒有安裝微信");
            return;
        }
        MobclickAgent.onEvent(this.N, "OnRemarkShareChannel", "friends");
        r0();
        this.f37406o.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(this.f37406o.getDrawingCache());
        this.f37406o.setDrawingCacheEnabled(false);
        t0(this.N, createBitmap, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        try {
            DownloadTask F = p1.f.K().F(this.L.getCrc_link_type_val());
            F.setIs_boot_commented(1);
            p1.f.K().update(F);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        w0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        if (!i0(this.N)) {
            com.join.mgps.Util.l2.a(this.N).b("沒有安裝qq");
            return;
        }
        MobclickAgent.onEvent(this.N, "OnRemarkShareChannel", "qZone");
        r0();
        this.f37406o.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(this.f37406o.getDrawingCache());
        this.f37406o.setDrawingCacheEnabled(false);
        String str = com.join.mgps.Util.v.f28111k + "shareImage.png";
        com.join.mgps.Util.p1.n(createBitmap, str);
        s0(this.N, str, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData() {
        try {
            ResultMainBean<GameShareData> n12 = this.O.n1(RequestBeanUtil.getInstance(this.N).getDetialmoreServer(this.L.getCrc_link_type_val()));
            if (n12 != null && n12.getFlag() == 1) {
                x0(n12.getMessages().getData());
            } else {
                n0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        if (!i0(this.N)) {
            com.join.mgps.Util.l2.a(this.N).b("沒有安裝qq");
            return;
        }
        MobclickAgent.onEvent(this.N, "OnRemarkShareChannel", "qq");
        r0();
        this.f37406o.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(this.f37406o.getDrawingCache());
        this.f37406o.setDrawingCacheEnabled(false);
        String str = com.join.mgps.Util.v.f28111k + "shareImage.png";
        com.join.mgps.Util.p1.n(createBitmap, str);
        com.join.mgps.Util.s.l(this.N, str, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 2000)
    public void n0() {
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void o0(String str) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.N).getAccountData();
            if (accountData != null && accountData.getUid() != 0 && accountData.n2() != 2) {
                RequestGameShareTag requestGameShareTag = new RequestGameShareTag();
                requestGameShareTag.setGame_id(this.L.getCrc_link_type_val());
                requestGameShareTag.setUid(accountData.getUid());
                requestGameShareTag.setScore(this.f37408q.getStarMark() + "");
                requestGameShareTag.setTag_des_id(str);
                requestGameShareTag.setTag_des_type(0);
                requestGameShareTag.setToken(accountData.getToken());
                this.O.E1(RequestBeanUtil.getInstance(this.N).getDefalutRequestBean(requestGameShareTag));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, @Nullable Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i5 == 10011) {
            MobclickAgent.onEvent(this.N, "OnRemarkShare");
            this.f37406o.setVisibility(0);
            this.K.setVisibility(0);
            this.f37407p.setVisibility(0);
            this.f37401j.setVisibility(8);
            this.I.setVisibility(8);
            this.f37403l.setVisibility(8);
            this.H.setVisibility(8);
            this.f37404m.setVisibility(8);
            this.f37406o.setVisibility(0);
            this.f37407p.setVisibility(0);
            if (i4 == 1) {
                o0(this.R);
            } else {
                p0(this.J.getText().toString());
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        UtilsMy.U3(this, this.L, 0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0(String str) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.N).getAccountData();
            if (accountData != null && accountData.getUid() != 0 && accountData.n2() != 2) {
                RequestUidtagidTagdes requestUidtagidTagdes = new RequestUidtagidTagdes();
                requestUidtagidTagdes.setGame_id(this.L.getCrc_link_type_val());
                requestUidtagidTagdes.setUid(accountData.getUid());
                requestUidtagidTagdes.setScore(this.f37408q.getStarMark() + "");
                requestUidtagidTagdes.setTag_des(str);
                requestUidtagidTagdes.setToken(accountData.getToken());
                this.O.k1(RequestBeanUtil.getInstance(this.N).getDefalutRequestBean(requestUidtagidTagdes));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void r0() {
        if (this.S) {
            return;
        }
        this.S = true;
        try {
            DownloadTask F = p1.f.K().F(this.L.getCrc_link_type_val());
            F.setIs_boot_commented(1);
            p1.f.K().update(F);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.P.setHasShare(true);
        com.join.mgps.pref.h.n(this.N).y0(JsonMapper.getInstance().toJson(this.P));
    }

    void v0(int i4, String str, String str2) {
        com.join.mgps.Util.b0.f0(this.N).d(this.N, "登陆后保存点评数据", "悟饭为你记录每一份评价", "跳过", "去登陆", new f(str2, str, i4)).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        UtilsMy.U3(this, this.L, 0);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0(GameShareData gameShareData) {
        this.Q = AccountUtil_.getInstance_(this).getAccountData();
        SimpleDraweeView simpleDraweeView = this.f37393b;
        String cover = gameShareData.getStatistics_info().getCover();
        r.c cVar = r.c.f11300g;
        MyImageLoader.i(simpleDraweeView, cover, cVar);
        MyImageLoader.i(this.f37414w, gameShareData.getStatistics_info().getCover(), cVar);
        MyImageLoader.h(this.f37399h, this.L.getPortraitURL());
        MyImageLoader.h(this.f37415x, this.L.getPortraitURL());
        MyImageLoader.h(this.f37400i, this.Q.d0());
        MyImageLoader.h(this.f37412u, this.Q.d0());
        MyImageLoader.h(this.f37413v, this.Q.d0());
        MyImageLoader.h(this.f37416y, this.Q.d0());
        if (!gameShareData.getStatistics_info().getCounts().equals("0")) {
            TextView textView = this.f37395d;
            textView.setText(gameShareData.getStatistics_info().getCounts() + "人平均打分" + gameShareData.getStatistics_info().getAvg_score());
            TextView textView2 = this.f37396e;
            textView2.setText(gameShareData.getStatistics_info().getCounts() + "人平均打分" + gameShareData.getStatistics_info().getAvg_score());
        } else {
            this.f37396e.setVisibility(4);
            this.f37395d.setVisibility(4);
        }
        MyImageLoader.L(this.f37394c, gameShareData.getStatistics_info().getCover(), 6, 15);
        this.f37397f.setText(this.L.getShowName());
        this.C.setText(this.L.getShowName());
        this.M = LayoutInflater.from(this);
        this.f37417z.setText(this.Q.getNickname());
        this.A.setText(this.Q.getNickname());
        this.D.setText(this.Q.getNickname());
        List<TipBean> tag_info = gameShareData.getTag_info();
        TipBean tipBean = new TipBean();
        tipBean.setName("+自定义");
        tag_info.add(tipBean);
        this.F.setAdapter(new a(tag_info));
        this.F.setOnTagClickListener(new b(tag_info));
        this.F.setOnSelectListener(new c());
        this.f37408q.setOnStarChangeListener(new d());
        this.B.setOnClickListener(new e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void y0() {
        if (!j0(this.N)) {
            com.join.mgps.Util.l2.a(this.N).b("沒有安裝微信");
            return;
        }
        MobclickAgent.onEvent(this.N, "OnRemarkShareChannel", "weichart");
        r0();
        this.f37406o.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(this.f37406o.getDrawingCache());
        this.f37406o.setDrawingCacheEnabled(false);
        u0(this.N, createBitmap, 1);
    }
}
