package com.join.mgps.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.findgame.data.TagData;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.g2;
import com.join.mgps.activity.vipzone.bean.LuckHistoryrequest;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.customview.SlidingTabLayout1;
import com.join.mgps.customview.ViewPagerCompat;
import com.join.mgps.dto.RankingMainDataBean;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.pref.PrefDef_;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
@EFragment(R.layout.fragment_rank)
/* loaded from: classes3.dex */
public class RankingFragment extends BaseFragment {
    @Pref

    /* renamed from: b  reason: collision with root package name */
    PrefDef_ f52630b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    SlidingTabLayout1 f52631c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ViewPagerCompat f52632d;

    /* renamed from: e  reason: collision with root package name */
    NavigationAdapter f52633e;

    /* renamed from: f  reason: collision with root package name */
    String f52634f;

    /* renamed from: g  reason: collision with root package name */
    String f52635g;

    /* renamed from: h  reason: collision with root package name */
    int f52636h = 0;

    /* renamed from: i  reason: collision with root package name */
    int f52637i = 0;

    /* renamed from: j  reason: collision with root package name */
    private List<TagData> f52638j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Callback<ResponseModel<RankingMainDataBean>> {
        a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<ResponseModel<RankingMainDataBean>> call, Throwable th) {
            RankingFragment.this.W();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<ResponseModel<RankingMainDataBean>> call, Response<ResponseModel<RankingMainDataBean>> response) {
            PrefDef_ prefDef_;
            ResponseModel<RankingMainDataBean> body = response.body();
            if (body == null || body.getData() == null || body.getData().getRank_type() == null || body.getData().getRank_type().size() <= 0) {
                RankingFragment.this.W();
                return;
            }
            String jsonString = JsonMapper.toJsonString(body.getData().getRank_type());
            if (!RankingFragment.this.f52634f.equals(jsonString) && (prefDef_ = RankingFragment.this.f52630b) != null) {
                prefDef_.rankingMenu2().g(jsonString);
            }
            RankingFragment.this.a0(body.getData().getRank_type());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        if (TextUtils.isEmpty(this.f52634f)) {
            this.f52634f = "[{\"id\":1,\"title\":\"网游榜\"},{\"id\":2,\"title\":\"单机榜\"},{\"id\":3,\"title\":\"模拟器榜\"}]";
        }
        List<TagData> list = (List) JsonMapper.getInstance().fromJson(this.f52634f, JsonMapper.getInstance().createCollectionType(List.class, TagData.class));
        if (list.isEmpty()) {
            list = (List) JsonMapper.getInstance().fromJson("[{\"id\":1,\"title\":\"网游榜\"},{\"id\":2,\"title\":\"单机榜\"},{\"id\":3,\"title\":\"模拟器榜\"}]", JsonMapper.getInstance().createCollectionType(List.class, TagData.class));
        }
        a0(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void X() {
        RequestModel requestModel = new RequestModel(getActivity());
        LuckHistoryrequest luckHistoryrequest = new LuckHistoryrequest();
        luckHistoryrequest.setType(0);
        luckHistoryrequest.setPage(1);
        luckHistoryrequest.setUid(AccountUtil_.getInstance_(getActivity()).getAccountData().getUid());
        requestModel.setArgs(luckHistoryrequest);
        com.join.mgps.rpc.impl.i.D0().B0().a1(requestModel.makeSign()).enqueue(new a());
    }

    public void Z(String str) {
        this.f52635g = str;
        if (g2.i(str)) {
            try {
                this.f52637i = Integer.parseInt(str);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        List<TagData> list = this.f52638j;
        if (list != null) {
            int i4 = 0;
            Iterator<TagData> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (it2.next().getId() == this.f52637i) {
                    this.f52636h = i4;
                    break;
                } else {
                    i4++;
                }
            }
            ViewPagerCompat viewPagerCompat = this.f52632d;
            if (viewPagerCompat != null) {
                viewPagerCompat.setCurrentItem(this.f52636h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a0(List<TagData> list) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            this.f52638j = list;
            int i4 = 0;
            for (TagData tagData : list) {
                arrayList.add(RankingItemFragment.o0(tagData.getId() + "", tagData.getTitle()));
                arrayList2.add(tagData.getTitle());
                if (tagData.getId() == this.f52637i) {
                    this.f52636h = i4;
                }
                i4++;
            }
            NavigationAdapter navigationAdapter = new NavigationAdapter(getChildFragmentManager(), arrayList, arrayList2);
            this.f52633e = navigationAdapter;
            navigationAdapter.d(arrayList, arrayList2);
            this.f52633e.notifyDataSetChanged();
            this.f52632d.setAdapter(this.f52633e);
            this.f52631c.setViewPager(this.f52632d);
            if (g2.i(this.f52635g)) {
                this.f52632d.setCurrentItem(this.f52636h);
                return;
            }
            Bundle arguments = getArguments();
            if (arguments != null) {
                int i5 = arguments.getInt("table", 0);
                this.f52636h = i5;
                this.f52632d.setCurrentItem(i5);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f52634f = this.f52630b.rankingMenu2().d();
        if (g2.i(this.f52635g)) {
            try {
                this.f52637i = Integer.parseInt(this.f52635g);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        X();
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
        if (this.f52633e == null || this.f52632d == null || !isVisible()) {
            return;
        }
        Fragment item = this.f52633e.getItem(this.f52632d.getCurrentItem());
        if (item instanceof RankingItemFragment) {
            ((RankingItemFragment) item).lazyLoad();
        }
    }
}
