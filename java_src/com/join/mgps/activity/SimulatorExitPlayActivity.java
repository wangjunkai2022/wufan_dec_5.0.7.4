package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.adapter.SimulatorExitPlayFriendAdapter;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.FriendBackGameRspBean;
import com.join.mgps.dto.FriendReqBean;
import com.join.mgps.dto.GameMasteryLevel;
import com.join.mgps.dto.GameTimeLevel;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestSimulatorAchievementListArgs;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.SimulatorAchievementBean;
import com.join.mgps.dto.SimulatorExitListBean;
import com.join.mgps.dto.SimulatorExitPlayRequestArgs;
import com.join.mgps.dto.SimulatorExitPlayResponseData;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.bean.AchievementBean;
import com.qq.e.ads.nativ.NativeExpressADView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
@EActivity(R.layout.activity_simulator_exit_play)
/* loaded from: classes.dex */
public class SimulatorExitPlayActivity extends BaseAppCompatActivity implements SimulatorExitPlayFriendAdapter.a {
    private boolean A;
    private boolean B;
    private boolean C;
    @Pref
    PrefDef_ D;
    List<SimulatorExitListBean> E = null;
    int F = -1;
    int G = 0;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f37805b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    SimpleDraweeView f37806c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f37807d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    RecyclerView f37808e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    View f37809f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    View f37810g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f37811h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f37812i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f37813j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ProgressBar f37814k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f37815l;

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.rpc.k f37816m;

    /* renamed from: n  reason: collision with root package name */
    com.join.mgps.rpc.j f37817n;

    /* renamed from: o  reason: collision with root package name */
    SimulatorExitPlayFriendAdapter f37818o;
    @Extra

    /* renamed from: p  reason: collision with root package name */
    String f37819p;
    @Extra

    /* renamed from: q  reason: collision with root package name */
    int f37820q;
    @Extra

    /* renamed from: r  reason: collision with root package name */
    boolean f37821r;
    @Extra

    /* renamed from: s  reason: collision with root package name */
    int f37822s;
    @Extra

    /* renamed from: t  reason: collision with root package name */
    int f37823t;
    @Extra

    /* renamed from: u  reason: collision with root package name */
    int f37824u;
    @Extra

    /* renamed from: v  reason: collision with root package name */
    String f37825v;
    @Extra

    /* renamed from: w  reason: collision with root package name */
    int[] f37826w;
    @Extra

    /* renamed from: x  reason: collision with root package name */
    boolean f37827x;
    @Extra

    /* renamed from: y  reason: collision with root package name */
    String f37828y;

    /* renamed from: z  reason: collision with root package name */
    private SimulatorExitPlayResponseData f37829z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends LinearLayoutManager {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Callback<ResponseModel> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f37831b;

        b(int i4) {
            this.f37831b = i4;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
            if (response != null && response.body() != null) {
                ResponseModel body = response.body();
                if (body.getError() == 0) {
                    SimulatorExitPlayActivity.this.g0(this.f37831b);
                    return;
                } else {
                    SimulatorExitPlayActivity.this.toast(body.getMsg());
                    return;
                }
            }
            SimulatorExitPlayActivity.this.toast("添加失败");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements TTAdDislike.DislikeInteractionCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TTNativeExpressAd f37833a;

        c(TTNativeExpressAd tTNativeExpressAd) {
            this.f37833a = tTNativeExpressAd;
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
        public void onCancel() {
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
        public void onSelected(int i4, String str, boolean z4) {
            SimulatorExitPlayFriendAdapter simulatorExitPlayFriendAdapter = SimulatorExitPlayActivity.this.f37818o;
            if (simulatorExitPlayFriendAdapter != null) {
                simulatorExitPlayFriendAdapter.x(this.f37833a);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
        public void onShow() {
        }
    }

    private void n0() {
        int i4 = 8;
        this.f37810g.setVisibility((this.B && this.C) ? 8 : 0);
        TextView textView = this.f37815l;
        if (this.B && this.C) {
            i4 = 0;
        }
        textView.setVisibility(i4);
        ViewGroup.LayoutParams layoutParams = this.f37814k.getLayoutParams();
        layoutParams.width = (int) getResources().getDimension((this.B && this.C) ? R.dimen.wdp408 : R.dimen.wdp280);
        this.f37814k.setLayoutParams(layoutParams);
        this.f37812i.setTextColor((this.B && this.C) ? Color.parseColor("#82888E") : getResources().getColor(R.color.white));
        ViewGroup.LayoutParams layoutParams2 = this.f37813j.getLayoutParams();
        Resources resources = getResources();
        boolean z4 = this.B;
        int i5 = R.dimen.wdp53;
        layoutParams2.width = (int) resources.getDimension((z4 && this.C) ? R.dimen.wdp53 : R.dimen.wdp83);
        Resources resources2 = getResources();
        if (!this.B || !this.C) {
            i5 = R.dimen.wdp83;
        }
        layoutParams2.height = (int) resources2.getDimension(i5);
        this.f37813j.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(AppBeanMain appBeanMain, View view) {
        IntentUtil.getInstance().intentActivity(this, appBeanMain.getIntentDataBean());
    }

    private boolean s0() {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
        return accountData == null || !com.join.mgps.Util.b.piv(accountData);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0(SimulatorAchievementBean simulatorAchievementBean) {
        Gson gson = new Gson();
        String string = getSharedPreferences("Papa_Stat_SharedPreferences", 4).getString("achievement_done", "");
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(string)) {
            Iterator<JsonElement> it2 = JsonParser.parseString(string).getAsJsonArray().iterator();
            while (it2.hasNext()) {
                arrayList.add((AchievementBean.AchievementInfo) gson.fromJson(it2.next(), (Class<Object>) AchievementBean.AchievementInfo.class));
            }
        }
        TextView textView = this.f37812i;
        textView.setText(arrayList.size() + net.lingala.zip4j.util.e.F0 + simulatorAchievementBean.getTarget());
        this.f37814k.setMax(simulatorAchievementBean.getTarget());
        this.f37814k.setProgress(arrayList.size());
        TextView textView2 = this.f37815l;
        textView2.setText("还有" + (simulatorAchievementBean.getTarget() - arrayList.size()) + "个成就等你解锁");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void add(int i4) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            FriendReqBean friendReqBean = new FriendReqBean();
            friendReqBean.setUid(accountData.getUid());
            friendReqBean.setToken(accountData.getToken());
            friendReqBean.setRuid(i4);
            friendReqBean.setRequestInfo("嘿，交个朋友，少年~(*^▽^*)");
            com.join.mgps.rpc.impl.h.p().o().b(friendReqBean).enqueue(new b(i4));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    @Receiver(actions = {"com.join.android.app.mgsim.wufun.broadcast.action_login_success"})
    public void afterLogin() {
        r0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f37805b.setText("对局详情");
        this.f37816m = com.join.mgps.rpc.impl.i.D0();
        this.f37817n = com.join.mgps.rpc.impl.h.p();
        this.B = this.D.pageVersion().d().intValue() == 2;
        if (this.f37821r) {
            y0(8);
        } else {
            y0(0);
            if (AccountUtil_.getInstance_(this).isTourist()) {
                this.f37809f.setVisibility(0);
            } else {
                this.f37809f.setVisibility(8);
            }
        }
        x0();
        SimulatorExitPlayFriendAdapter simulatorExitPlayFriendAdapter = new SimulatorExitPlayFriendAdapter(this);
        this.f37818o = simulatorExitPlayFriendAdapter;
        simulatorExitPlayFriendAdapter.z(this);
        a aVar = new a(this);
        aVar.setOrientation(0);
        this.f37808e.setLayoutManager(aVar);
        this.f37808e.setAdapter(this.f37818o);
        com.papa.sim.statistic.p.l(this).O1(Event.ExitGame_Recommend, new Ext());
        n0();
    }

    @Override // com.join.mgps.adapter.SimulatorExitPlayFriendAdapter.a
    public void e(int i4) {
        if (IntentUtil.getInstance().isLogined(this) && !IntentUtil.getInstance().isTourist(this)) {
            add(i4);
            Ext ext = new Ext();
            ext.setFrom("1");
            com.papa.sim.statistic.p.l(this).O1(Event.addFriends, ext);
            return;
        }
        IntentUtil.getInstance().goLogin(this);
    }

    @Override // com.join.mgps.adapter.SimulatorExitPlayFriendAdapter.a
    public void f(int i4) {
        if (IntentUtil.getInstance().isLogined(this) && !IntentUtil.getInstance().isTourist(this)) {
            p0(i4);
        } else {
            IntentUtil.getInstance().goLogin(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0(int i4) {
        FriendBackGameRspBean.FriendInfo friendInfo;
        toast("已发送加好友申请");
        SimulatorExitPlayFriendAdapter simulatorExitPlayFriendAdapter = this.f37818o;
        if (simulatorExitPlayFriendAdapter == null) {
            return;
        }
        Iterator it2 = simulatorExitPlayFriendAdapter.getData().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SimulatorExitListBean simulatorExitListBean = (SimulatorExitListBean) it2.next();
            if ((simulatorExitListBean.getData() instanceof FriendBackGameRspBean.FriendInfo) && (friendInfo = (FriendBackGameRspBean.FriendInfo) simulatorExitListBean.getData()) != null && friendInfo.getUid() == i4) {
                friendInfo.setSendFriendRequestStatus(true);
                break;
            }
        }
        this.f37818o.notifyDataSetChanged();
    }

    void h0(List<SimulatorExitListBean> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            SimulatorExitListBean simulatorExitListBean = list.get(i4);
            NativeExpressADView nativeExpressADView = (NativeExpressADView) simulatorExitListBean.getData();
            int i5 = this.G + 4;
            this.G = i5;
            if (i5 < this.f37818o.getData().size()) {
                this.f37818o.addData(this.G - 1, (int) simulatorExitListBean);
                this.f37818o.notifyItemInserted(this.G - 1);
                if (i4 > 0) {
                    nativeExpressADView.render();
                }
            }
        }
    }

    void i0(List<SimulatorExitListBean> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            SimulatorExitListBean simulatorExitListBean = list.get(i4);
            TTNativeExpressAd tTNativeExpressAd = (TTNativeExpressAd) simulatorExitListBean.getObj();
            int i5 = this.G + 4;
            this.G = i5;
            if (i5 < this.f37818o.getData().size()) {
                this.f37818o.addData(this.G - 1, (int) simulatorExitListBean);
                tTNativeExpressAd.setDislikeCallback(this, new c(tTNativeExpressAd));
                this.f37818o.notifyItemInserted(this.G - 1);
                if (i4 > 0) {
                    tTNativeExpressAd.render();
                }
            }
        }
    }

    void j0() {
        int i4;
        SimulatorExitPlayResponseData simulatorExitPlayResponseData = this.f37829z;
        if (simulatorExitPlayResponseData == null || simulatorExitPlayResponseData.getGameMasteryLevel() == null) {
            return;
        }
        try {
            GameMasteryLevel gameMasteryLevel = this.f37829z.getGameMasteryLevel();
            int i5 = 0;
            int[] iArr = new int[0];
            int i6 = this.f37820q;
            int current_lv_times = gameMasteryLevel.getCurrent_lv_times();
            int next_lv_times = gameMasteryLevel.getNext_lv_times();
            if (TextUtils.isEmpty(gameMasteryLevel.getLevel())) {
                i4 = 0;
            } else if (gameMasteryLevel.getLevel().equals("传说")) {
                i4 = 5;
            } else if (gameMasteryLevel.getLevel().equals("宗师")) {
                i4 = 4;
            } else if (gameMasteryLevel.getLevel().equals("精英")) {
                i4 = 3;
            } else {
                i4 = gameMasteryLevel.getLevel().equals("资深") ? 2 : 1;
            }
            try {
                ArrayList arrayList = (ArrayList) JsonMapper.getInstance().fromJson(this.D.gameTimeLvCfg().d(), JsonMapper.getInstance().createCollectionType(ArrayList.class, GameTimeLevel.class));
                if (arrayList != null) {
                    iArr = new int[arrayList.size()];
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        iArr[i7] = ((GameTimeLevel) arrayList.get(i7)).getVal();
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            int i8 = current_lv_times + i6;
            int i9 = 0;
            while (i5 < iArr.length) {
                i4 = i5 + 1;
                next_lv_times = iArr[i5] - i9;
                i9 = iArr[i5];
                if (i8 <= next_lv_times || i5 == iArr.length - 1) {
                    break;
                }
                i8 -= next_lv_times;
                i5 = i4;
            }
            this.f37823t = Math.min(i8, next_lv_times);
            this.f37824u = next_lv_times;
            this.f37822s = i4;
            x0();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        try {
            if (this.f37827x) {
                Ext ext = new Ext();
                ext.setEndId(this.f37828y);
                ext.setGameId(this.f37819p);
                Data data = new Data();
                data.setGameId(Long.parseLong(this.f37819p));
                com.papa.sim.statistic.p.l(this).i0(Event.gameVSFail, ext, data);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        v0(1);
        com.join.mgps.va.overmind.d.o().R();
        if (s0()) {
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.a(2));
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0() {
        SimulatorAchievementBean data;
        if (com.join.android.app.common.utils.j.j(this)) {
            RequestSimulatorAchievementListArgs requestSimulatorAchievementListArgs = new RequestSimulatorAchievementListArgs();
            EMUApkTable n4 = b2.p.o().n(p1.f.K().F(this.f37819p).getPlugin_num());
            requestSimulatorAchievementListArgs.setUid(AccountUtil_.getInstance_(this).getUid());
            requestSimulatorAchievementListArgs.setPlugVersion(String.valueOf(n4 == null ? 0 : n4.getVerCode()));
            requestSimulatorAchievementListArgs.setGameId(this.f37819p);
            requestSimulatorAchievementListArgs.setToken(AccountUtil_.getInstance_(this).getToken());
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestSimulatorAchievementListArgs);
            requestModel.setDefault(this);
            ResponseModel<SimulatorAchievementBean> f02 = this.f37816m.f0(requestModel.makeSign());
            if (f02 == null || f02.getData() == null || (data = f02.getData()) == null) {
                return;
            }
            z0(data);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        IntentUtil.getInstance().goShareWebActivity(this, this.f37825v);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAdEvent(com.join.mgps.event.u uVar) {
        SimulatorExitPlayFriendAdapter simulatorExitPlayFriendAdapter;
        if (uVar == null) {
            return;
        }
        if (uVar.c() == 6) {
            if (uVar.b() == null || !(uVar.b() instanceof NativeExpressADView) || (simulatorExitPlayFriendAdapter = this.f37818o) == null) {
                return;
            }
            simulatorExitPlayFriendAdapter.w((NativeExpressADView) uVar.b());
        } else if (uVar.c() == 5 && (uVar.b() instanceof List)) {
            if (this.E == null) {
                this.E = new ArrayList();
            }
            int i4 = 0;
            if (uVar.a() == 1) {
                this.F = 1;
                List list = (List) uVar.b();
                if (list == null || list.size() <= 0) {
                    return;
                }
                while (i4 < list.size()) {
                    TTNativeExpressAd tTNativeExpressAd = (TTNativeExpressAd) list.get(i4);
                    SimulatorExitListBean simulatorExitListBean = new SimulatorExitListBean(4, tTNativeExpressAd.getExpressAdView());
                    simulatorExitListBean.setObj(tTNativeExpressAd);
                    this.E.add(simulatorExitListBean);
                    if (i4 == 0) {
                        tTNativeExpressAd.render();
                    }
                    i4++;
                }
            } else if (uVar.a() == 2) {
                this.F = 2;
                List list2 = (List) uVar.b();
                if (list2 == null || list2.size() <= 0) {
                    return;
                }
                while (i4 < list2.size()) {
                    NativeExpressADView nativeExpressADView = (NativeExpressADView) list2.get(i4);
                    SimulatorExitListBean simulatorExitListBean2 = new SimulatorExitListBean(4, nativeExpressADView);
                    simulatorExitListBean2.setObj(nativeExpressADView);
                    this.E.add(simulatorExitListBean2);
                    if (i4 == 0) {
                        nativeExpressADView.render();
                    }
                    i4++;
                }
            }
        }
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().setStatusBarColor(-16777216);
            getWindow().setNavigationBarColor(-16777216);
        }
        org.greenrobot.eventbus.c.f().t(this);
        if (s0()) {
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.a(4));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this);
        try {
            List<SimulatorExitListBean> list = this.E;
            if (list != null) {
                for (SimulatorExitListBean simulatorExitListBean : list) {
                    if (simulatorExitListBean.getObj() instanceof TTNativeExpressAd) {
                        ((TTNativeExpressAd) simulatorExitListBean.getObj()).destroy();
                    } else if (simulatorExitListBean.getObj() instanceof NativeExpressADView) {
                        ((NativeExpressADView) simulatorExitListBean.getObj()).destroy();
                    }
                }
                this.E.clear();
                this.E = null;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f37821r) {
            y0(8);
        } else {
            y0(0);
            if (AccountUtil_.getInstance_(this).isTourist()) {
                this.f37809f.setVisibility(0);
            } else {
                this.f37809f.setVisibility(8);
                j0();
            }
        }
        SimulatorExitPlayFriendAdapter simulatorExitPlayFriendAdapter = this.f37818o;
        if (simulatorExitPlayFriendAdapter != null && simulatorExitPlayFriendAdapter.getData() != null && this.f37818o.getData().size() < 1) {
            r0();
        }
        if (this.B) {
            l0();
        }
    }

    @Background
    public void p0(int i4) {
        try {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            HashMap hashMap = new HashMap();
            hashMap.put("uid", Integer.valueOf(accountData.getUid()));
            hashMap.put("token", accountData.getToken());
            hashMap.put("likeUid", Integer.valueOf(i4));
            ResponseModel a5 = this.f37817n.a(hashMap);
            if (a5 != null) {
                if (a5.getError() == 0) {
                    q0(i4);
                } else {
                    toast(a5.getMsg());
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0(int i4) {
        FriendBackGameRspBean.FriendInfo friendInfo;
        toast("点赞成功");
        SimulatorExitPlayFriendAdapter simulatorExitPlayFriendAdapter = this.f37818o;
        if (simulatorExitPlayFriendAdapter == null) {
            return;
        }
        Iterator it2 = simulatorExitPlayFriendAdapter.getData().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            SimulatorExitListBean simulatorExitListBean = (SimulatorExitListBean) it2.next();
            if ((simulatorExitListBean.getData() instanceof FriendBackGameRspBean.FriendInfo) && (friendInfo = (FriendBackGameRspBean.FriendInfo) simulatorExitListBean.getData()) != null && friendInfo.getUid() == i4) {
                friendInfo.setLikeStatus(false);
                break;
            }
        }
        this.f37818o.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                RequestModel<SimulatorExitPlayRequestArgs> requestModel = new RequestModel<>();
                requestModel.setDefault(this).setArgs(new SimulatorExitPlayRequestArgs());
                requestModel.getArgs().setUid(accountData.getUid() + "");
                requestModel.getArgs().setToken(accountData.getToken() + "");
                requestModel.getArgs().setGameId(this.f37819p);
                if (this.f37826w == null) {
                    this.f37826w = new int[0];
                }
                ArrayList arrayList = new ArrayList();
                for (int i4 : this.f37826w) {
                    arrayList.add(Integer.valueOf(i4));
                }
                requestModel.getArgs().setBattleUidList(arrayList);
                ResponseModel<SimulatorExitPlayResponseData> x02 = this.f37816m.x0(requestModel);
                if (x02 != null) {
                    if (x02.getFlag() == 1) {
                        w0(x02.getData());
                        return;
                    } else {
                        toast(x02.getMessage());
                        return;
                    }
                }
                toast(getString(R.string.request_failure));
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        updateTitle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void resume() {
        if (s0()) {
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.a(3));
        }
        v0(0);
        com.join.mgps.va.overmind.d.o().e();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void t0() {
        IntentUtil.getInstance().goMyAccountLoginActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void toast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    public void u0(String str, String str2) {
        Intent intent = new Intent("com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint");
        intent.putExtra(CommonService_.b0.f54290b, str);
        intent.putExtra("gameId", str2);
        sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateTitle() {
        if (com.join.android.app.common.utils.j.j(this)) {
            this.f37805b.setText("为您推荐以下游戏");
        } else {
            this.f37805b.setText("网络已断开，请检查网络设置");
        }
    }

    void v0(int i4) {
        Intent intent = new Intent();
        intent.setAction("com.emu.ad.result");
        intent.putExtra("adAction", 100);
        intent.putExtra("exit", i4);
        sendBroadcast(intent);
        com.join.mgps.va.overmind.d.g0(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0(SimulatorExitPlayResponseData simulatorExitPlayResponseData) {
        List<SimulatorExitListBean> list;
        this.f37829z = simulatorExitPlayResponseData;
        if (simulatorExitPlayResponseData == null) {
            return;
        }
        if (this.f37818o != null) {
            ArrayList arrayList = new ArrayList();
            if (simulatorExitPlayResponseData.getBuddyList() != null && simulatorExitPlayResponseData.getBuddyList().size() > 0) {
                this.f37805b.setText("对局详情");
                Iterator<FriendBackGameRspBean.FriendInfo> it2 = simulatorExitPlayResponseData.getBuddyList().iterator();
                while (it2.hasNext()) {
                    String uid = AccountUtil_.getInstance_(this).getUid();
                    if (uid.equals(it2.next().getUid() + "")) {
                        it2.remove();
                    }
                }
                for (FriendBackGameRspBean.FriendInfo friendInfo : simulatorExitPlayResponseData.getBuddyList()) {
                    arrayList.add(new SimulatorExitListBean(2, friendInfo));
                }
            } else {
                this.f37805b.setText("为您推荐以下游戏");
            }
            if (simulatorExitPlayResponseData.getGameList() != null && simulatorExitPlayResponseData.getGameList().size() > 0) {
                for (GamedetialModleFourBean gamedetialModleFourBean : simulatorExitPlayResponseData.getGameList()) {
                    arrayList.add(new SimulatorExitListBean(1, gamedetialModleFourBean));
                }
            }
            if (simulatorExitPlayResponseData.getPd_info() != null && arrayList.size() > 0) {
                arrayList.add(1, new SimulatorExitListBean(5, simulatorExitPlayResponseData.getPd_info()));
                if (!this.A) {
                    com.papa.sim.statistic.p.l(this).O1(Event.pdSimulatorOutDetails, new Ext().setGameId(this.f37819p).setIsJoin(simulatorExitPlayResponseData.getPd_info().getIs_join()).setTestAbNumber(simulatorExitPlayResponseData.getPd_info().getAb_test_number()));
                    this.A = true;
                }
            }
            this.f37818o.setNewData(arrayList);
            if (s0() && (list = this.E) != null && list.size() > 0) {
                int i4 = this.F;
                if (i4 == 1) {
                    i0(this.E);
                } else if (i4 == 2) {
                    h0(this.E);
                }
            }
        }
        j0();
        if (simulatorExitPlayResponseData.getAdInfo() != null && simulatorExitPlayResponseData.getAdInfo().getMain() != null && simulatorExitPlayResponseData.getAdInfo().getMain().getAd_switch() == 1) {
            this.f37806c.setVisibility(0);
            this.f37807d.setVisibility(0);
            if (simulatorExitPlayResponseData.getAdInfo().getMain() != null) {
                MyImageLoader.h(this.f37806c, simulatorExitPlayResponseData.getAdInfo().getMain().getPic_remote());
                this.f37807d.setText(simulatorExitPlayResponseData.getAdInfo().getMain().getTitle());
            }
            if (simulatorExitPlayResponseData.getAdInfo().getSub() == null || simulatorExitPlayResponseData.getAdInfo().getSub().size() <= 0) {
                return;
            }
            final AppBeanMain appBeanMain = simulatorExitPlayResponseData.getAdInfo().getSub().get(0);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.join.mgps.activity.z2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimulatorExitPlayActivity.this.o0(appBeanMain, view);
                }
            };
            this.f37806c.setOnClickListener(onClickListener);
            this.f37807d.setOnClickListener(onClickListener);
            return;
        }
        this.f37806c.setVisibility(8);
        this.f37807d.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0() {
        int i4;
        String str;
        String str2;
        if (this.f37821r) {
            return;
        }
        int i5 = this.f37822s;
        if (i5 == 5) {
            i4 = R.drawable.gameleve5;
            str = "传说";
            str2 = "#FF760C";
        } else if (i5 == 4) {
            i4 = R.drawable.gameleve4;
            str = "宗师";
            str2 = "#F9C439";
        } else if (i5 == 3) {
            i4 = R.drawable.gameleve2;
            str = "精英";
            str2 = "#DB64EE";
        } else if (i5 == 2) {
            i4 = R.drawable.gameleve3;
            str = "资深";
            str2 = "#65C73C";
        } else {
            i4 = R.drawable.gameleve1;
            str = "见习";
            str2 = "#21E1E5";
        }
        if (this.B && this.C) {
            this.f37811h.setText(GameMainActivity4.F2);
            this.f37811h.setTextColor(Color.parseColor("#C1D0DD"));
            this.f37813j.setImageResource(R.drawable.ic_title_achievement);
            this.f37810g.setVisibility(8);
            this.f37815l.setVisibility(0);
            return;
        }
        this.f37811h.setTextColor(Color.parseColor(str2));
        this.f37814k.setMax(100);
        this.f37814k.invalidate();
        if (this.f37824u == 0) {
            this.f37824u = this.f37823t;
        }
        int i6 = this.f37824u;
        if (i6 != 0) {
            this.f37814k.setProgress((this.f37823t * 100) / i6);
            TextView textView = this.f37812i;
            textView.setText(this.f37823t + net.lingala.zip4j.util.e.F0 + this.f37824u);
        }
        this.f37811h.setText(str);
        this.f37813j.setImageResource(i4);
        this.f37810g.setVisibility(0);
        this.f37815l.setVisibility(8);
    }

    void y0(int i4) {
        this.f37809f.setVisibility(i4);
        this.f37811h.setVisibility(i4);
        this.f37812i.setVisibility(i4);
        this.f37813j.setVisibility(i4);
        this.f37814k.setVisibility(i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0(SimulatorAchievementBean simulatorAchievementBean) {
        boolean z4 = simulatorAchievementBean.getTarget() > 0;
        this.C = z4;
        if (z4) {
            x0();
            n0();
        }
        if (!AccountUtil_.getInstance_(this).isTourist()) {
            TextView textView = this.f37812i;
            textView.setText(simulatorAchievementBean.getDone() + net.lingala.zip4j.util.e.F0 + simulatorAchievementBean.getTarget());
            this.f37814k.setMax(simulatorAchievementBean.getTarget());
            this.f37814k.setProgress(simulatorAchievementBean.getDone());
            if (simulatorAchievementBean.getTarget() <= simulatorAchievementBean.getDone()) {
                this.f37815l.setText("已解锁所有成就");
                return;
            }
            TextView textView2 = this.f37815l;
            textView2.setText("还有" + (simulatorAchievementBean.getTarget() - simulatorAchievementBean.getDone()) + "个成就等你解锁");
            return;
        }
        A0(simulatorAchievementBean);
    }
}
