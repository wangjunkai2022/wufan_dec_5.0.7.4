package com.join.mgps.fragment;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.gson.JsonObject;
import com.join.android.app.common.http.d;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.DiscoveryPaiweiActivity_;
import com.join.mgps.activity.GamePaiWeiActivty_;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dto.Constant;
import com.join.mgps.dto.DiscoveryPaiweiGameBean;
import com.join.mgps.dto.DiscoveryPaiweiGameDetailBean;
import com.join.mgps.dto.DiscoveryPaiweiGameRankBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.service.CommonService_;
import com.papa91.arc.util.SignUtils;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Request;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
@EFragment(R.layout.layout_discovery_paiwei_viewpager)
/* loaded from: classes.dex */
public class DiscoveryPaiweiDetailFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f50946b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f50947c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    CardView f50948d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f50949e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f50950f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Group f50951g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f50952h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f50953i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f50954j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f50955k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    CardView f50956l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f50957m;
    @FragmentArg

    /* renamed from: n  reason: collision with root package name */
    String f50958n;
    @FragmentArg

    /* renamed from: o  reason: collision with root package name */
    int f50959o;

    /* renamed from: p  reason: collision with root package name */
    private Context f50960p;

    /* renamed from: q  reason: collision with root package name */
    private AccountUtil_ f50961q;

    /* renamed from: r  reason: collision with root package name */
    private List<DiscoveryPaiweiGameRankBean> f50962r;

    /* renamed from: s  reason: collision with root package name */
    private int f50963s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f50964t;

    /* renamed from: u  reason: collision with root package name */
    private final String f50965u = com.join.mgps.rpc.h.f54065m + "/game/discover/detail";

    /* renamed from: v  reason: collision with root package name */
    private b f50966v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends d.p<String> {
        a() {
        }

        @Override // com.join.android.app.common.http.d.p
        public void d(Request request, Exception exc) {
            exc.printStackTrace();
            DiscoveryPaiweiDetailFragment.this.showLodingFailed();
        }

        @Override // com.join.android.app.common.http.d.p
        /* renamed from: f */
        public void e(String str) {
            DiscoveryPaiweiDetailFragment.this.b0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends BaseQuickAdapter<DiscoveryPaiweiGameRankBean, BaseViewHolder> {
        public b(@Nullable List<DiscoveryPaiweiGameRankBean> list) {
            super(R.layout.item_discovery_paiwei_list, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, DiscoveryPaiweiGameRankBean discoveryPaiweiGameRankBean) {
            String str;
            BaseViewHolder text = baseViewHolder.setText(R.id.tvRank, String.valueOf(baseViewHolder.getLayoutPosition() + 1)).setVisible(R.id.ivRank, baseViewHolder.getLayoutPosition() <= 2).setVisible(R.id.tvRank, baseViewHolder.getLayoutPosition() > 2).setText(R.id.tvNickname, discoveryPaiweiGameRankBean.getNickname());
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            if (discoveryPaiweiGameRankBean.getCost_coin() > 0) {
                str = discoveryPaiweiGameRankBean.getCost_coin() + "币 ";
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(discoveryPaiweiGameRankBean.getUse_time());
            BaseViewHolder text2 = text.setText(R.id.tvScore, sb.toString());
            if (discoveryPaiweiGameRankBean.getRole() != null && discoveryPaiweiGameRankBean.getRole_rank() > 0) {
                str2 = "第" + discoveryPaiweiGameRankBean.getRole_rank() + discoveryPaiweiGameRankBean.getRole();
            }
            text2.setText(R.id.tvDesc, str2);
            UtilsMy.v3(this.mContext, discoveryPaiweiGameRankBean.getAvatar(), (SimpleDraweeView) baseViewHolder.getView(R.id.avatar));
            if (baseViewHolder.getLayoutPosition() == 0) {
                baseViewHolder.setImageResource(R.id.ivRank, R.drawable.ic_discovery_paiwei_rank_1).setBackgroundRes(R.id.avatarBg, R.drawable.shape_paiwei_ring_rank_1);
            } else if (baseViewHolder.getLayoutPosition() == 1) {
                baseViewHolder.setImageResource(R.id.ivRank, R.drawable.ic_discovery_paiwei_rank_2).setBackgroundRes(R.id.avatarBg, R.drawable.shape_paiwei_ring_rank_2);
            } else if (baseViewHolder.getLayoutPosition() == 2) {
                baseViewHolder.setImageResource(R.id.ivRank, R.drawable.ic_discovery_paiwei_rank_3).setBackgroundRes(R.id.avatarBg, R.drawable.shape_paiwei_ring_rank_3);
            } else {
                baseViewHolder.setBackgroundRes(R.id.avatarBg, R.color.transparent);
            }
        }
    }

    private void X(boolean z4) {
        DownloadTask F = p1.f.K().F(this.f50958n);
        if (UtilsMy.V(this.f50960p, F, false, true) == null) {
            return;
        }
        String fight_fun = F.getFight_fun();
        if (fight_fun.length() > 12 && a0(this.f50960p, F) && fight_fun.charAt(12) == '1') {
            this.f50963s = 1;
        }
        if (fight_fun.length() > 14 && a0(this.f50960p, F) && fight_fun.charAt(14) == '1') {
            this.f50963s = 14;
        }
        int i4 = this.f50963s;
        if (i4 != 1 && i4 != 14) {
            showMessage("该游戏暂不支持排位赛");
        } else if (com.join.android.app.common.utils.j.j(this.f50960p)) {
            if (UtilsMy.W(this.f50960p, F) == null && !z4) {
                Toast.makeText(this.f50960p, "正在下载插件...", 1).show();
            } else if (MApplication.f1497x.getActivity() instanceof DiscoveryPaiweiActivity_) {
                GamePaiWeiActivty_.o0(this.f50960p).a(this.f50958n).b(this.f50959o).c(this.f50963s).start();
            }
        } else {
            showMessage("无网络连接");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        FragmentActivity activity = getActivity();
        this.f50960p = activity;
        this.f50961q = AccountUtil_.getInstance_(activity);
        com.join.mgps.Util.d0.a().d(this);
        this.f50962r = new ArrayList();
        this.f50966v = new b(this.f50962r);
        this.f50947c.setLayoutManager(new LinearLayoutManager(this.f50960p));
        this.f50947c.setAdapter(this.f50966v);
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void W() {
        if (p1.f.K().F(this.f50958n) == null) {
            ((CommonService_.h2) ((CommonService_.h2) ((CommonService_.h2) CommonService_.S2(this.f50960p).extra("gameDownloadDetail", this.f50958n)).extra("fromRecomDown", true)).extra("_from", 155)).a();
            this.f50964t = true;
            return;
        }
        X(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Z() {
        showLoding();
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("gameId", this.f50958n);
        jsonObject.addProperty("token", this.f50961q.getToken());
        jsonObject.addProperty("uid ", this.f50961q.getUid());
        jsonObject.addProperty(Constant.MD5, SignUtils.buildRequestSign(jsonObject));
        com.join.android.app.common.http.d.G().H().v(this.f50965u, jsonObject, new a(), null);
    }

    boolean a0(Context context, DownloadTask downloadTask) {
        int i4;
        if (downloadTask == null) {
            return false;
        }
        try {
            i4 = Integer.parseInt(downloadTask.getPlugin_num());
        } catch (Exception unused) {
            i4 = 0;
        }
        try {
            if (i4 == ConstantIntEnum.FBA.value() || i4 == ConstantIntEnum.FC.value()) {
                EMUApkTable n4 = b2.o.o().n(downloadTask.getRomType());
                if (new APKUtils().d(context, n4.getPackage_name())) {
                    try {
                        try {
                            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(n4.getPackage_name(), 0);
                            if (packageInfo == null) {
                                return false;
                            }
                            try {
                                return packageInfo.versionCode > 330;
                            } catch (Exception e5) {
                                e5.printStackTrace();
                                return true;
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                            return false;
                        }
                    } catch (Exception e7) {
                        e7.printStackTrace();
                        return false;
                    }
                } else if (n4.getDown_type() == 2 && n4.getDown_type() == 2) {
                    return com.join.android.app.common.utils.l.t(context, n4, false, new String[0]);
                } else {
                    return false;
                }
            }
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void b0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("code") == 200) {
                DiscoveryPaiweiGameBean discoveryPaiweiGameBean = (DiscoveryPaiweiGameBean) JsonMapper.getInstance().fromJson(jSONObject.optString("data"), DiscoveryPaiweiGameBean.class);
                if (discoveryPaiweiGameBean != null && discoveryPaiweiGameBean.getDetail() != null) {
                    showMain();
                    DiscoveryPaiweiGameDetailBean detail = discoveryPaiweiGameBean.getDetail();
                    if (detail.getRank_list() != null) {
                        this.f50962r.addAll(detail.getRank_list());
                        this.f50966v.replaceData(this.f50962r);
                    }
                    MyImageLoader.n(this.f50946b, detail.getBig_img());
                    TextView textView = this.f50950f;
                    if (textView != null) {
                        textView.setText("今日" + detail.getNum() + "人挑战");
                    }
                    CardView cardView = this.f50948d;
                    if (cardView == null || this.f50949e == null) {
                        return;
                    }
                    cardView.setVisibility(0);
                    if (detail.getMonth_best() != null) {
                        TextView textView2 = this.f50949e;
                        textView2.setText("第" + detail.getMonth_best().getRank() + "名");
                        return;
                    }
                    this.f50949e.setText("暂无成绩");
                    return;
                }
                showEmpty();
                return;
            }
            String optString = jSONObject.optString("message");
            if (!TextUtils.isEmpty(optString)) {
                showMessage(optString);
            }
            showLodingFailed();
        } catch (JSONException e5) {
            e5.printStackTrace();
            showLodingFailed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            DownloadTask F = p1.f.K().F(this.f50958n);
            if (TextUtils.equals(a5.getCrc_link_type_val(), this.f50958n) || (this.f50964t && F != null && TextUtils.equals(a5.getCrc_link_type_val(), F.getPlugin_num()))) {
                this.f50955k.setText("下载中");
                this.f50956l.setClickable(false);
            }
        } else if (c5 == 5) {
            DownloadTask F2 = p1.f.K().F(this.f50958n);
            if (TextUtils.equals(a5.getCrc_link_type_val(), this.f50958n) || (this.f50964t && F2 != null && TextUtils.equals(a5.getCrc_link_type_val(), F2.getPlugin_num()))) {
                this.f50955k.setText("去挑战");
                this.f50956l.setClickable(true);
                X(true);
            }
        } else if (c5 == 11 || c5 == 48) {
            DownloadTask F3 = p1.f.K().F(this.f50958n);
            if (TextUtils.equals(a5.getCrc_link_type_val(), this.f50958n) || (this.f50964t && F3 != null && TextUtils.equals(a5.getCrc_link_type_val(), F3.getPlugin_num()))) {
                this.f50955k.setText("安装中");
                this.f50956l.setClickable(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        if (this.f50962r == null) {
            this.f50962r = new ArrayList();
        }
        this.f50962r.clear();
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f50960p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showEmpty() {
        LinearLayout linearLayout = this.f50954j;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f50952h;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f50953i;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        Group group = this.f50951g;
        if (group != null) {
            group.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.Util.v0.c("显示加载中");
        LinearLayout linearLayout = this.f50954j;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f50952h;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f50953i;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        Group group = this.f50951g;
        if (group != null) {
            group.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f50954j;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f50953i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        LinearLayout linearLayout3 = this.f50952h;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        Group group = this.f50951g;
        if (group != null) {
            group.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        com.join.mgps.Util.v0.c("显示主界面main");
        LinearLayout linearLayout = this.f50954j;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f50953i;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f50952h;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        Group group = this.f50951g;
        if (group != null) {
            group.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(this.f50960p).b(str);
    }
}
