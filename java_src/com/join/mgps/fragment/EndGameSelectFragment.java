package com.join.mgps.fragment;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.EndGameActivity_;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.EndGameListBean;
import com.join.mgps.dto.EndGameNameListBean;
import com.join.mgps.dto.RequestEndGameTypeArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.FragmentArg;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_end_game_select)
/* loaded from: classes3.dex */
public class EndGameSelectFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f51176b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f51177c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f51178d;
    @FragmentArg

    /* renamed from: e  reason: collision with root package name */
    int f51179e;

    /* renamed from: g  reason: collision with root package name */
    private Context f51181g;

    /* renamed from: i  reason: collision with root package name */
    private c f51183i;

    /* renamed from: f  reason: collision with root package name */
    private int f51180f = 1;

    /* renamed from: h  reason: collision with root package name */
    private List<EndGameNameListBean> f51182h = new ArrayList();

    /* loaded from: classes3.dex */
    class a implements BaseQuickAdapter.l {
        a() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.l
        public void onLoadMoreRequested() {
            EndGameSelectFragment.W(EndGameSelectFragment.this);
            EndGameSelectFragment endGameSelectFragment = EndGameSelectFragment.this;
            endGameSelectFragment.b0(endGameSelectFragment.f51180f);
        }
    }

    /* loaded from: classes3.dex */
    class b implements BaseQuickAdapter.j {
        b() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            int i5 = 0;
            while (i5 < EndGameSelectFragment.this.f51182h.size()) {
                ((EndGameNameListBean) EndGameSelectFragment.this.f51182h.get(i5)).setSelected(i5 == i4);
                i5++;
            }
            EndGameSelectFragment.this.f51183i.setNewData(EndGameSelectFragment.this.f51182h);
            if (EndGameSelectFragment.this.getActivity() instanceof EndGameActivity_) {
                ((EndGameActivity_) EndGameSelectFragment.this.getActivity()).s0(((EndGameNameListBean) EndGameSelectFragment.this.f51182h.get(i4)).getGameId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends BaseQuickAdapter<EndGameNameListBean, BaseViewHolder> {
        public c(@Nullable List<EndGameNameListBean> list) {
            super(R.layout.item_end_game_select_grid, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, EndGameNameListBean endGameNameListBean) {
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.ivIcon), endGameNameListBean.getGameIcon());
            baseViewHolder.setText(R.id.tvGameName, endGameNameListBean.getGameName());
            baseViewHolder.getView(R.id.selector).setSelected(endGameNameListBean.isSelected());
            baseViewHolder.setTextColor(R.id.tvGameName, Color.parseColor(endGameNameListBean.isSelected() ? "#3FABFF" : "#000000"));
        }
    }

    static /* synthetic */ int W(EndGameSelectFragment endGameSelectFragment) {
        int i4 = endGameSelectFragment.f51180f;
        endGameSelectFragment.f51180f = i4 + 1;
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void a0() {
        this.f51181g = getContext();
        this.f51183i = new c(this.f51182h);
        this.f51176b.setLayoutManager(new GridLayoutManager(getContext(), 4));
        this.f51176b.setAdapter(this.f51183i);
        this.f51183i.setOnLoadMoreListener(new a(), this.f51176b);
        this.f51183i.setOnItemClickListener(new b());
        showLoding();
        b0(this.f51180f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void b0(int i4) {
        if (com.join.android.app.common.utils.j.j(this.f51181g)) {
            RequestEndGameTypeArgs requestEndGameTypeArgs = new RequestEndGameTypeArgs();
            requestEndGameTypeArgs.setUid(AccountUtil_.getInstance_(this.f51181g).getUid());
            requestEndGameTypeArgs.setPage(i4);
            requestEndGameTypeArgs.setModelType(this.f51179e);
            RequestModel requestModel = new RequestModel();
            requestModel.setArgs(requestEndGameTypeArgs);
            requestModel.setDefault(this.f51181g);
            ResponseModel<EndGameListBean> I = com.join.mgps.rpc.impl.i.D0().I(requestModel.makeSign());
            if (I == null || I.getCode() != 200) {
                return;
            }
            if (I.getData() != null && I.getData().getGameList() != null && I.getData().getGameList().size() > 0) {
                e0(I.getData(), i4);
            } else {
                c0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c0() {
        this.f51183i.loadMoreComplete();
        this.f51183i.loadMoreEnd(true);
    }

    public void d0(String str) {
        List<EndGameNameListBean> list = this.f51182h;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (EndGameNameListBean endGameNameListBean : this.f51182h) {
            endGameNameListBean.setSelected(TextUtils.equals(endGameNameListBean.getGameId(), str));
        }
        c cVar = this.f51183i;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0(EndGameListBean endGameListBean, int i4) {
        showMain();
        if (this.f51182h == null) {
            this.f51182h = new ArrayList();
        }
        this.f51182h.addAll(endGameListBean.getGameList());
        c cVar = this.f51183i;
        if (cVar != null) {
            cVar.loadMoreComplete();
            this.f51183i.setNewData(this.f51182h);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setMenuVisibility(boolean z4) {
        super.setMenuVisibility(z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        LinearLayout linearLayout = this.f51177c;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f51178d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        RecyclerView recyclerView = this.f51176b;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f51178d;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f51177c;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        RecyclerView recyclerView = this.f51176b;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        LinearLayout linearLayout = this.f51178d;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f51177c;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        RecyclerView recyclerView = this.f51176b;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        l2.a(getContext()).b(str);
    }
}
