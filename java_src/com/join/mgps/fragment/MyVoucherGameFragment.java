package com.join.mgps.fragment;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.y2;
import com.join.mgps.customview.XListView;
import com.join.mgps.dto.AccountVoucherGame;
import com.join.mgps.dto.ResultMainBean;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EFragment(R.layout.layout_listview)
/* loaded from: classes3.dex */
public class MyVoucherGameFragment extends BaseFragment implements com.join.mgps.customview.f, com.join.mgps.customview.g {

    /* renamed from: b  reason: collision with root package name */
    private Context f52395b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    XListView f52396c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f52397d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f52398e;

    /* renamed from: f  reason: collision with root package name */
    com.join.mgps.rpc.b f52399f;

    /* renamed from: g  reason: collision with root package name */
    private int f52400g = 1;

    /* renamed from: h  reason: collision with root package name */
    private y2 f52401h;

    /* renamed from: i  reason: collision with root package name */
    private List<AccountVoucherGame> f52402i;

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V() {
        this.f52396c.setNoMore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W() {
        this.f52396c.q();
        this.f52396c.r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X() {
        this.f52398e.setVisibility(8);
        this.f52397d.setVisibility(8);
        this.f52396c.setVisibility(0);
        this.f52401h.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f52399f = com.join.mgps.rpc.impl.a.c0();
        this.f52395b = getActivity();
        ArrayList arrayList = new ArrayList();
        this.f52402i = arrayList;
        arrayList.add(new AccountVoucherGame());
        this.f52402i.add(new AccountVoucherGame());
        this.f52402i.add(new AccountVoucherGame());
        this.f52402i.add(new AccountVoucherGame());
        y2 y2Var = new y2(this.f52402i, this.f52395b);
        this.f52401h = y2Var;
        this.f52396c.setAdapter((ListAdapter) y2Var);
        X();
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadData() {
        if (com.join.android.app.common.utils.j.j(this.f52395b)) {
            try {
                ResultMainBean<List<AccountVoucherGame>> f5 = this.f52399f.f(new LinkedMultiValueMap());
                if (f5 != null) {
                    if (f5.getFlag() == 1) {
                        List<AccountVoucherGame> data = f5.getMessages().getData();
                        if (data != null) {
                            if (data.size() > 0) {
                                if (this.f52400g == 1) {
                                    this.f52402i.clear();
                                    this.f52402i.addAll(data);
                                } else {
                                    this.f52402i.addAll(data);
                                }
                                X();
                                return;
                            }
                            V();
                            return;
                        }
                        W();
                        return;
                    }
                    V();
                    return;
                }
                showLodingFailed();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingFailed();
                return;
            }
        }
        W();
        showLodingFailed();
    }

    @Override // com.join.mgps.customview.f
    public void onLoadMore() {
        this.f52400g++;
        loadData();
    }

    @Override // com.join.mgps.customview.g
    public void onRefresh() {
        this.f52400g = 1;
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f52400g = 1;
        showLoding();
        loadData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f52395b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f52397d.setVisibility(0);
        this.f52398e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        List<AccountVoucherGame> list = this.f52402i;
        if (list == null || list.size() == 0) {
            this.f52398e.setVisibility(0);
            this.f52397d.setVisibility(8);
            this.f52396c.setVisibility(8);
        }
    }
}
