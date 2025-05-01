package com.join.mgps.activity;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.dialog.callback.IDialogActivityCallback;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.ad.RewardAdParams;
import com.join.mgps.base.dialog.BaseDialogActivity;
import com.join.mgps.broadcast.NetBroadcastReceiver;
import com.join.mgps.dto.RequestInfoArgs;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.dto.SearchPostsBean;
import com.join.mgps.dto.SingleGameAdCfgBean;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.common.BaseAppConfig;
import com.papa91.wrapper.UserPrefs;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/* loaded from: classes4.dex */
public class RewardAdDialogActivity extends BaseDialogActivity implements View.OnClickListener {

    /* renamed from: v  reason: collision with root package name */
    public static final String f37110v = "_RewardAdParams";

    /* renamed from: b  reason: collision with root package name */
    ImageView f37111b;

    /* renamed from: c  reason: collision with root package name */
    TextView f37112c;

    /* renamed from: d  reason: collision with root package name */
    RelativeLayout f37113d;

    /* renamed from: e  reason: collision with root package name */
    TextView f37114e;

    /* renamed from: f  reason: collision with root package name */
    TextView f37115f;

    /* renamed from: g  reason: collision with root package name */
    TextView f37116g;

    /* renamed from: h  reason: collision with root package name */
    TextView f37117h;

    /* renamed from: i  reason: collision with root package name */
    SimpleDraweeView f37118i;

    /* renamed from: j  reason: collision with root package name */
    NetBroadcastReceiver f37119j;

    /* renamed from: m  reason: collision with root package name */
    private SingleGameAdCfgBean f37122m;

    /* renamed from: n  reason: collision with root package name */
    private String f37123n;

    /* renamed from: o  reason: collision with root package name */
    private String f37124o;

    /* renamed from: p  reason: collision with root package name */
    private int f37125p;

    /* renamed from: r  reason: collision with root package name */
    com.join.mgps.ad.n f37127r;

    /* renamed from: s  reason: collision with root package name */
    RewardAdParams f37128s;

    /* renamed from: u  reason: collision with root package name */
    d f37130u;

    /* renamed from: k  reason: collision with root package name */
    private boolean f37120k = true;

    /* renamed from: l  reason: collision with root package name */
    private int f37121l = 1;

    /* renamed from: q  reason: collision with root package name */
    private boolean f37126q = false;

    /* renamed from: t  reason: collision with root package name */
    boolean f37129t = false;

    /* loaded from: classes4.dex */
    class a implements NetBroadcastReceiver.a {
        a() {
        }

        @Override // com.join.mgps.broadcast.NetBroadcastReceiver.a
        public void a(int i4) {
            if (i4 == 1) {
                RewardAdDialogActivity rewardAdDialogActivity = RewardAdDialogActivity.this;
                if (rewardAdDialogActivity.f37129t) {
                    rewardAdDialogActivity.f37129t = true;
                    rewardAdDialogActivity.s0();
                    com.join.mgps.ad.a.g(RewardAdDialogActivity.this).h(RewardAdDialogActivity.this.f37121l, RewardAdDialogActivity.this.f37124o, RewardAdDialogActivity.this.f37123n, RewardAdDialogActivity.this.f37127r);
                }
            }
            RewardAdDialogActivity.this.v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Callback<ResultMainBean<SearchPostsBean>> {
        b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResultMainBean<SearchPostsBean>> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResultMainBean<SearchPostsBean>> call, Response<ResultMainBean<SearchPostsBean>> response) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends com.join.mgps.ad.t {
        c() {
        }

        @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
        public void b(boolean z4) {
            super.b(z4);
            RewardAdDialogActivity.this.f37126q = false;
        }

        @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onADClose() {
            super.onADClose();
            RewardAdDialogActivity.this.finish();
            if (((BaseDialogActivity) RewardAdDialogActivity.this).callback instanceof s1.b) {
                ((s1.b) ((BaseDialogActivity) RewardAdDialogActivity.this).callback).onAdClose();
            }
        }

        @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onError(int i4, String str) {
            super.onError(i4, str);
            RewardAdDialogActivity.this.f37126q = true;
        }

        @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoCached() {
            super.onVideoCached();
            RewardAdDialogActivity.this.f37126q = false;
        }

        @Override // com.join.mgps.ad.t, com.join.mgps.ad.n
        public void onVideoComplete() {
            super.onVideoComplete();
            UserPrefs userPrefs = new UserPrefs(RewardAdDialogActivity.this);
            userPrefs.setAdGamesHasSeeCount(userPrefs.getAdGamesHasSeeCount() + 1);
            if (((BaseDialogActivity) RewardAdDialogActivity.this).callback instanceof s1.b) {
                ((s1.b) ((BaseDialogActivity) RewardAdDialogActivity.this).callback).onAdShow();
            }
            RewardAdDialogActivity.this.u0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i4 = intent.getExtras().getInt(BaseAppConfig.KEY_VIP_LEVEL);
            intent.getExtras().getInt(BaseAppConfig.KEY_SVIP_LEVEL);
            if (i4 > 0) {
                Intent intent2 = new Intent();
                intent2.setAction(o1.a.f72001g0);
                RewardAdDialogActivity.this.sendBroadcast(intent2);
                if (((BaseDialogActivity) RewardAdDialogActivity.this).callback instanceof s1.b) {
                    ((s1.b) ((BaseDialogActivity) RewardAdDialogActivity.this).callback).onAdClose();
                }
                RewardAdDialogActivity.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        if (this.f37127r == null) {
            this.f37127r = new c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        RequestInfoArgs requestInfoArgs = new RequestInfoArgs();
        requestInfoArgs.setUid(AccountUtil_.getInstance_(this).getAccountData().getUid());
        RequestInfoArgs.RequestInfoinfo requestInfoinfo = new RequestInfoArgs.RequestInfoinfo();
        requestInfoinfo.setTime(System.currentTimeMillis());
        requestInfoinfo.setType(1);
        requestInfoinfo.setUid(AccountUtil_.getInstance_(this).getAccountData().getUid() + "");
        requestInfoArgs.setInfo(com.papa.sim.statistic.http.c.b(JsonMapper.getInstance().toJson(requestInfoinfo)));
        com.join.mgps.rpc.impl.d.P1().O1().L1(RequestBeanUtil.getInstance(this).getDefalutRequestBean(requestInfoArgs)).enqueue(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            this.f37120k = true;
            this.f37116g.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f37115f.getLayoutParams();
            layoutParams.topMargin = (int) getResources().getDimension(R.dimen.wdp11);
            this.f37115f.setLayoutParams(layoutParams);
            SingleGameAdCfgBean singleGameAdCfgBean = this.f37122m;
            if (singleGameAdCfgBean != null) {
                if (singleGameAdCfgBean.getFree_receive_vip() == 1) {
                    this.f37112c.setText(this.f37122m.getF_tip_text());
                    this.f37115f.setText(this.f37122m.getF_btn_text());
                    this.f37117h.setText(this.f37122m.getB_btn_text());
                    this.f37116g.setText(this.f37122m.getF_ic_text());
                    try {
                        int parseInt = Integer.parseInt(this.f37122m.getF_ic_text());
                        int adGamesHasSeeCount = new UserPrefs(this).getAdGamesHasSeeCount();
                        if (parseInt - adGamesHasSeeCount > 0) {
                            TextView textView = this.f37116g;
                            textView.setText("仅需" + adGamesHasSeeCount + "次");
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    this.f37112c.setText(this.f37122m.getTip_text());
                    this.f37115f.setText(this.f37122m.getT_btn_text());
                    this.f37117h.setText(this.f37122m.getB_btn_text());
                }
            }
            MyImageLoader.d(this.f37118i, R.drawable.ic_gdt_ad_tv, this.f37122m.getF_play_ic());
            return;
        }
        this.f37120k = false;
        this.f37116g.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f37115f.getLayoutParams();
        layoutParams2.topMargin = 0;
        this.f37115f.setLayoutParams(layoutParams2);
        this.f37112c.setText("观看视频广告可以支持悟饭更好\n更快上传单机游戏资源");
        this.f37115f.setText("开启网络看广告");
        this.f37117h.setText("狠心拒绝，离线游戏");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f37111b) {
            finish();
        } else if (view == this.f37113d) {
            if (this.f37120k) {
                SingleGameAdCfgBean singleGameAdCfgBean = this.f37122m;
                if (singleGameAdCfgBean != null) {
                    if (singleGameAdCfgBean.getFree_receive_vip() == 1) {
                        IntentUtil.getInstance().goShareWebActivity(this, this.f37122m.getF_btn_url());
                    } else {
                        SingleGameAdCfgBean singleGameAdCfgBean2 = this.f37122m;
                        if (singleGameAdCfgBean2 != null && com.join.mgps.Util.g2.i(singleGameAdCfgBean2.getT_btn_url())) {
                            Intent intent = new Intent("com.tools.AdBroadcast");
                            intent.putExtra("action", 3);
                            intent.putExtra("url", this.f37122m.getT_btn_url());
                            sendBroadcast(intent);
                        }
                    }
                }
                com.papa.sim.statistic.p.l(this).O1(Event.onMemberAdvert23, new Ext());
                return;
            }
            com.papa.sim.statistic.p.l(this).O1(Event.onAdvert23_offline, new Ext());
            UtilsMy.w3(this);
        } else if (view == this.f37117h) {
            boolean z4 = this.f37120k;
            if (z4 && !this.f37126q) {
                Activity activity = MApplication.f1497x.getActivity();
                if (activity != null) {
                    com.join.mgps.ad.a.g(this).i(activity);
                }
                com.papa.sim.statistic.p.l(this).O1(Event.onAdvert23, new Ext());
                IDialogActivityCallback iDialogActivityCallback = this.callback;
                if (iDialogActivityCallback instanceof s1.b) {
                    ((s1.b) iDialogActivityCallback).onAdShow();
                    return;
                }
                return;
            }
            if (z4 && this.f37126q) {
                com.join.mgps.Util.l2.a(this).b("视频加载失败");
            } else {
                com.papa.sim.statistic.p.l(this).O1(Event.gameAdvert23_offline, new Ext());
            }
            finish();
            IDialogActivityCallback iDialogActivityCallback2 = this.callback;
            if (iDialogActivityCallback2 instanceof s1.b) {
                ((s1.b) iDialogActivityCallback2).onAdClose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.dialog.BaseDialogActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_reward_ad);
        com.join.mgps.Util.c2.s(this);
        this.f37111b = (ImageView) findViewById(R.id.iv_close);
        this.f37112c = (TextView) findViewById(R.id.tv_ad_tip);
        this.f37113d = (RelativeLayout) findViewById(R.id.rl_opt_vip);
        this.f37115f = (TextView) findViewById(R.id.tv_opt_vip);
        this.f37116g = (TextView) findViewById(R.id.tv_ad_vip_tip);
        this.f37117h = (TextView) findViewById(R.id.tv_opt_view_ad);
        this.f37118i = (SimpleDraweeView) findViewById(R.id.icon);
        this.f37111b.setOnClickListener(this);
        this.f37116g.setOnClickListener(this);
        this.f37117h.setOnClickListener(this);
        this.f37113d.setOnClickListener(this);
        if (getIntent() != null) {
            RewardAdParams rewardAdParams = (RewardAdParams) getIntent().getSerializableExtra(f37110v);
            this.f37128s = rewardAdParams;
            if (rewardAdParams != null) {
                this.f37121l = rewardAdParams.b();
                this.f37122m = this.f37128s.d();
                this.f37123n = this.f37128s.a();
                this.f37124o = this.f37128s.c();
                this.f37125p = this.f37128s.e();
            }
        }
        if (com.join.android.app.common.utils.j.j(this)) {
            com.papa.sim.statistic.p.l(this).O1(Event.showAdvert23, new Ext());
        } else {
            this.f37129t = true;
            com.papa.sim.statistic.p.l(this).O1(Event.showAdvert23_offline, new Ext());
        }
        v0();
        s0();
        com.join.mgps.ad.a.g(this).h(this.f37121l, this.f37124o, this.f37123n, this.f37127r);
        NetBroadcastReceiver netBroadcastReceiver = new NetBroadcastReceiver();
        this.f37119j = netBroadcastReceiver;
        netBroadcastReceiver.a(new a());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.f37119j, intentFilter);
        t0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        NetBroadcastReceiver netBroadcastReceiver = this.f37119j;
        if (netBroadcastReceiver != null) {
            unregisterReceiver(netBroadcastReceiver);
            this.f37119j = null;
        }
        d dVar = this.f37130u;
        if (dVar != null) {
            unregisterReceiver(dVar);
            this.f37130u = null;
        }
        com.join.mgps.ad.a.g(this).b();
    }

    void t0() {
        this.f37130u = new d();
        IntentFilter intentFilter = new IntentFilter("com.join.android.app.mgsim.wufun.broadcast.action_raise_vip_success");
        intentFilter.addAction("com.join.android.app.mgsim.wufan.mha.broadcast.action_raise_vip_success");
        registerReceiver(this.f37130u, intentFilter);
    }
}
