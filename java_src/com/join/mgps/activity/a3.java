package com.join.mgps.activity;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.findgame.data.FindChoiceResultData;
import com.join.kotlin.ui.findgame.data.GameTypeData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.vipzone.bean.LuckHistoryrequest;
import com.join.mgps.adapter.SimulatorFastEntryHomeAdapter;
import com.join.mgps.customview.ScrollTextViewLayout;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestOnlineCouponArgs;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.SimulatorFastEntryBean;
import com.join.mgps.dto.SimulatorFastEntryListBean;
import com.join.mgps.pref.PrefDef_;
import com.uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
/* compiled from: SimulatorFastEntryActivity.java */
@EActivity(R.layout.activity_simulator_fast_entry)
/* loaded from: classes4.dex */
class a3 extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RelativeLayout f38488b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f38489c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f38490d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ScrollTextViewLayout f38491e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f38492f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f38493g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    RecyclerView f38494h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f38495i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f38496j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    View f38497k;

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            Window window = getWindow();
            window.clearFlags(TTAdConstant.KEY_CLICK_AREA);
            window.getDecorView().setSystemUiVisibility(LogType.UNEXP_ANR);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        } else if (i4 >= 19) {
            getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        showLoding();
        h0();
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void f0() {
        IntentUtil.getInstance().goSearchHintActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0(SimulatorFastEntryBean simulatorFastEntryBean) {
        if (TextUtils.isEmpty(simulatorFastEntryBean.getSearch_bar_hint())) {
            this.f38492f.setHint(simulatorFastEntryBean.getSearch_bar_hint());
        }
        ArrayList arrayList = new ArrayList();
        if (simulatorFastEntryBean.getFast_entry() != null && simulatorFastEntryBean.getFast_entry().size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            List<SimulatorFastEntryBean.FastEntryBean> fast_entry = simulatorFastEntryBean.getFast_entry();
            int size = fast_entry.size();
            int i4 = (size + 9) / 10;
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 * 10;
                i5++;
                arrayList2.add(fast_entry.subList(i6, Math.min(i5 * 10, size)));
            }
            arrayList.add(new SimulatorFastEntryListBean(1, arrayList2));
            arrayList.add(new SimulatorFastEntryListBean(6, Float.valueOf(getResources().getDimension(R.dimen.wdp20))));
        }
        if (simulatorFastEntryBean.getThe_new() != null && simulatorFastEntryBean.getThe_new().size() > 0) {
            arrayList.add(new SimulatorFastEntryListBean(2, simulatorFastEntryBean.getThe_new()));
            arrayList.add(new SimulatorFastEntryListBean(6, Float.valueOf(getResources().getDimension(R.dimen.wdp30))));
        }
        if (simulatorFastEntryBean.getWill_play() != null && simulatorFastEntryBean.getWill_play().getGames() != null && simulatorFastEntryBean.getWill_play().getGames().size() > 0) {
            arrayList.add(new SimulatorFastEntryListBean(3, simulatorFastEntryBean.getWill_play()));
            arrayList.add(new SimulatorFastEntryListBean(6, Float.valueOf(getResources().getDimension(R.dimen.wdp30))));
        }
        if (simulatorFastEntryBean.getChange_game() != null && simulatorFastEntryBean.getChange_game().size() > 0) {
            arrayList.add(new SimulatorFastEntryListBean(0, "改版游戏"));
            arrayList.add(new SimulatorFastEntryListBean(6, Float.valueOf(getResources().getDimension(R.dimen.wdp24))));
            arrayList.add(new SimulatorFastEntryListBean(4, simulatorFastEntryBean.getChange_game()));
            arrayList.add(new SimulatorFastEntryListBean(6, Float.valueOf(getResources().getDimension(R.dimen.wdp6))));
        }
        if (simulatorFastEntryBean.getTag_game() != null && simulatorFastEntryBean.getTag_game().size() > 0) {
            for (int i7 = 0; i7 < simulatorFastEntryBean.getTag_game().size(); i7++) {
                SimulatorFastEntryBean.TagGameBean tagGameBean = simulatorFastEntryBean.getTag_game().get(i7);
                arrayList.add(new SimulatorFastEntryListBean(0, tagGameBean.getTitle(), tagGameBean.getId()));
                arrayList.add(new SimulatorFastEntryListBean(6, Float.valueOf(getResources().getDimension(R.dimen.wdp24))));
                arrayList.add(new SimulatorFastEntryListBean(5, tagGameBean.getList()));
                arrayList.add(new SimulatorFastEntryListBean(6, Float.valueOf(getResources().getDimension(R.dimen.wdp30))));
            }
        }
        this.f38494h.setLayoutManager(new LinearLayoutManager(this));
        this.f38494h.setAdapter(new SimulatorFastEntryHomeAdapter(this, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        try {
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(new RequestOnlineCouponArgs());
            requestModel.setDefault(this);
            ResponseModel<SimulatorFastEntryBean> body = com.join.mgps.rpc.impl.i.D0().B0().N0(requestModel.makeSign()).execute().body();
            if (body != null && body.getCode() == 200 && body.getData() != null) {
                i0();
                g0(body.getData());
            } else {
                showLodingFailed();
            }
        } catch (Exception e5) {
            showLodingFailed();
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0() {
        try {
            RequestModel requestModel = new RequestModel();
            LuckHistoryrequest luckHistoryrequest = new LuckHistoryrequest();
            luckHistoryrequest.setPage(1);
            luckHistoryrequest.setUid(AccountUtil_.getInstance_(this).getAccountData().getUid());
            requestModel.setArgs(luckHistoryrequest);
            requestModel.setDefault(this);
            ResponseModel<FindChoiceResultData> body = com.join.mgps.rpc.impl.i.D0().B0().z1(requestModel.makeSign()).execute().body();
            if (body == null || body.getCode() != 200 || body.getData() == null) {
                return;
            }
            List<GameTypeData> game_type = body.getData().getGame_type();
            game_type.add(0, new GameTypeData(0, "精选", 0, null, true));
            try {
                new PrefDef_(this).gameTypeList().g(JsonMapper.getInstance().toJson(game_type));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } catch (Exception e6) {
            showLodingFailed();
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        com.join.mgps.Util.v0.c("显示主界面main");
        LinearLayout linearLayout = this.f38496j;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f38495i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        RecyclerView recyclerView = this.f38494h;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        RelativeLayout relativeLayout = this.f38488b;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.Util.v0.c("显示加载中");
        LinearLayout linearLayout = this.f38495i;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f38496j;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        RecyclerView recyclerView = this.f38494h;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f38496j;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f38495i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        RecyclerView recyclerView = this.f38494h;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.f38488b;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }
}
