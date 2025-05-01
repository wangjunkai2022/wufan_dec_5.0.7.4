package com.join.mgps.fragment;

import android.content.Context;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.fragment.app.Fragment;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.t1;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.GameOLHeadAdBean;
import com.join.mgps.dto.GameSignleCompanyListbean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.game_single_conpany_layout)
/* loaded from: classes3.dex */
public class GameSingleCompanyFragment extends Fragment implements AbsListView.OnScrollListener {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    PtrClassicFrameLayout f51954b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView2 f51955c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f51956d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f51957e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    ImageView f51958f;

    /* renamed from: g  reason: collision with root package name */
    com.join.mgps.rpc.e f51959g;

    /* renamed from: h  reason: collision with root package name */
    private t1 f51960h;

    /* renamed from: i  reason: collision with root package name */
    private Context f51961i;

    /* renamed from: k  reason: collision with root package name */
    List<v1.b> f51963k;

    /* renamed from: j  reason: collision with root package name */
    private boolean f51962j = false;

    /* renamed from: l  reason: collision with root package name */
    private int f51964l = 1;

    /* loaded from: classes3.dex */
    class a implements com.join.mgps.customview.g {
        a() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            if (GameSingleCompanyFragment.this.f51962j) {
                return;
            }
            GameSingleCompanyFragment.this.f51964l = 1;
            GameSingleCompanyFragment.this.Z();
        }
    }

    /* loaded from: classes3.dex */
    class b implements com.join.mgps.customview.f {
        b() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            if (GameSingleCompanyFragment.this.f51962j) {
                return;
            }
            GameSingleCompanyFragment.this.Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void X() {
        this.f51959g = com.join.mgps.rpc.impl.d.P1();
        this.f51961i = getActivity();
        t1 t1Var = new t1(this.f51961i);
        this.f51960h = t1Var;
        this.f51963k = t1Var.b();
        showLoding();
        Z();
        this.f51955c.setPreLoadCount(10);
        this.f51955c.setPullRefreshEnable(new a());
        this.f51955c.setPullLoadEnable(new b());
        this.f51955c.setOnScrollListener(this);
        this.f51955c.setAdapter((ListAdapter) this.f51960h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Z() {
        if (com.join.android.app.common.utils.j.j(this.f51961i)) {
            this.f51962j = true;
            try {
                try {
                    ResultMainBean<GameSignleCompanyListbean> F0 = this.f51959g.F0(a0(this.f51964l));
                    if (F0 != null && F0.getFlag() == 1) {
                        GameSignleCompanyListbean data = F0.getMessages().getData();
                        if (data != null) {
                            ArrayList arrayList = new ArrayList();
                            List<GameOLHeadAdBean> list = data.getList();
                            if (list != null && list.size() > 0) {
                                v1.b bVar = null;
                                for (int i4 = 0; i4 < list.size(); i4++) {
                                    if (i4 != 0 && i4 % 2 != 0) {
                                        bVar.d(list.get(i4));
                                        arrayList.add(bVar);
                                    }
                                    bVar = new v1.b();
                                    bVar.c(list.get(i4));
                                }
                                if (list.size() != 0 && list.size() % 2 == 1) {
                                    v1.b bVar2 = new v1.b();
                                    bVar2.c(list.get(list.size() - 1));
                                    arrayList.add(bVar2);
                                }
                                this.f51964l++;
                                showMain(arrayList);
                                d0();
                            } else if (this.f51964l == 1) {
                                showLodingFailed();
                            } else {
                                c0();
                            }
                        }
                    } else {
                        d0();
                        showLodingFailed();
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    d0();
                    showLodingFailed();
                }
                return;
            } finally {
                this.f51962j = false;
            }
        }
        d0();
        showLodingFailed();
    }

    public CommonRequestBean a0(int i4) {
        return RequestBeanUtil.getInstance(this.f51961i).getGameOLRequest(i4, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void b0() {
        this.f51964l = 1;
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c0() {
        this.f51955c.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d0() {
        this.f51955c.u();
        this.f51955c.v();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f51964l = 1;
        showLoding();
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(getActivity());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f51956d.setVisibility(0);
        this.f51957e.setVisibility(8);
        this.f51954b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<v1.b> list = this.f51963k;
        if (list == null || list.size() == 0) {
            this.f51957e.setVisibility(0);
            this.f51956d.setVisibility(8);
            this.f51954b.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain(List<v1.b> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.f51957e.setVisibility(8);
        this.f51956d.setVisibility(8);
        this.f51954b.setVisibility(0);
        if (this.f51964l == 2) {
            this.f51963k.clear();
        }
        this.f51963k.addAll(list);
        if (this.f51964l == 2) {
            this.f51963k.size();
        }
        com.join.mgps.Util.v0.d("infoo", this.f51963k.size() + "   showMain");
        this.f51960h.notifyDataSetChanged();
    }
}
