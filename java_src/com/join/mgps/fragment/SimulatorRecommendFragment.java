package com.join.mgps.fragment;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.efs.sdk.base.core.util.PackageUtil;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestSimulatorRecomGamesArgs;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.TipBean;
import com.join.mgps.fragment.SimulatorRecommendFragment;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_simulator_recommend)
/* loaded from: classes3.dex */
public class SimulatorRecommendFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f53120b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f53121c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f53122d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f53123e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Group f53124f;

    /* renamed from: g  reason: collision with root package name */
    private String f53125g;

    /* renamed from: h  reason: collision with root package name */
    private com.join.mgps.rpc.k f53126h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends BaseQuickAdapter<CommonGameInfoBean, BaseViewHolder> {
        public a(@Nullable List<CommonGameInfoBean> list) {
            super(R.layout.layout_simulator_recom_item, list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(CommonGameInfoBean commonGameInfoBean, BaseViewHolder baseViewHolder, View view) {
            IntentDateBean intentDataBean = commonGameInfoBean.getIntentDataBean();
            ExtBean extBean = intentDataBean.getExtBean();
            extBean.setFrom("151");
            extBean.setGameFlag(baseViewHolder.getLayoutPosition() + 1);
            intentDataBean.setExtBean(extBean);
            commonGameInfoBean.getIntentDataBean().setExtBean(extBean);
            IntentUtil.getInstance().intentActivity(this.mContext, intentDataBean);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: b */
        public void convert(@NonNull final BaseViewHolder baseViewHolder, final CommonGameInfoBean commonGameInfoBean) {
            Iterator<TipBean> it2;
            if (commonGameInfoBean.getG_info() == null) {
                commonGameInfoBean.setG_info(new GInfoBean());
            }
            ((TextView) baseViewHolder.getView(R.id.tvGameName)).setText(commonGameInfoBean.getG_info().getName());
            List<TipBean> tag_info = commonGameInfoBean.getG_info().getTag_info();
            String str = "";
            if (tag_info != null) {
                while (tag_info.iterator().hasNext()) {
                    str = str + it2.next().getName() + " ";
                }
            }
            ((TextView) baseViewHolder.getView(R.id.tvTags)).setText(str);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) baseViewHolder.getView(R.id.ivIcon);
            if (simpleDraweeView.getTag() == null || !TextUtils.equals(simpleDraweeView.getTag().toString(), commonGameInfoBean.getG_info().getIco())) {
                MyImageLoader.n(simpleDraweeView, commonGameInfoBean.getG_info().getIco());
                simpleDraweeView.setTag(commonGameInfoBean.getG_info().getIco());
            }
            if (commonGameInfoBean.getBig_pic() != null) {
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) baseViewHolder.getView(R.id.ivPoster);
                if (simpleDraweeView2.getTag() == null || !TextUtils.equals(simpleDraweeView2.getTag().toString(), commonGameInfoBean.getBig_pic())) {
                    MyImageLoader.n(simpleDraweeView2, commonGameInfoBean.getBig_pic());
                    simpleDraweeView2.getHierarchy().x(r.c.f11300g);
                    simpleDraweeView2.setTag(commonGameInfoBean.getBig_pic());
                }
            }
            baseViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.k1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SimulatorRecommendFragment.a.this.c(commonGameInfoBean, baseViewHolder, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        if (getArguments() != null) {
            this.f53125g = getArguments().getString("gameId");
        }
        this.f53126h = com.join.mgps.rpc.impl.i.D0();
        showLoding();
        W();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void W() {
        try {
            if (com.join.android.app.common.utils.j.j(getContext())) {
                RequestSimulatorRecomGamesArgs requestSimulatorRecomGamesArgs = new RequestSimulatorRecomGamesArgs();
                requestSimulatorRecomGamesArgs.setUid(AccountUtil_.getInstance_(getContext()).getUid());
                requestSimulatorRecomGamesArgs.setAppVersion(PackageUtil.getAppVersionCode(getContext()) + "_" + PackageUtil.getAppVersionName(getContext()));
                requestSimulatorRecomGamesArgs.setGameId(this.f53125g);
                RequestModel requestModel = new RequestModel();
                requestModel.setArgs(requestSimulatorRecomGamesArgs);
                requestModel.setDefault(getContext());
                ResponseModel<List<CommonGameInfoBean>> c5 = this.f53126h.c(requestModel.makeSign());
                if (c5 != null && c5.getData() != null) {
                    showMain();
                    updateUi(c5.getData());
                } else {
                    showLodingFailed();
                }
            } else {
                showLodingFailed();
                showTost(getResources().getString(R.string.net_connect_failed));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            showLodingFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        W();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        com.join.mgps.Util.v0.c("显示加载中");
        LinearLayout linearLayout = this.f53122d;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f53123e;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        Group group = this.f53124f;
        if (group != null) {
            group.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f53123e;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f53122d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        Group group = this.f53124f;
        if (group != null) {
            group.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        com.join.mgps.Util.v0.c("显示主界面main");
        LinearLayout linearLayout = this.f53123e;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f53122d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        Group group = this.f53124f;
        if (group != null) {
            group.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        l2.a(getActivity()).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUi(List<CommonGameInfoBean> list) {
        RecyclerView recyclerView = this.f53120b;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f53120b.setAdapter(new a(list));
        }
        TextView textView = this.f53121c;
        if (textView != null) {
            textView.setText(list.size() + "");
        }
    }
}
