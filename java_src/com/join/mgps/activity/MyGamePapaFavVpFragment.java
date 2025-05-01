package com.join.mgps.activity;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.MApplication;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.GameFromPopoWinBean;
import com.join.mgps.fragment.BaseFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EFragment(R.layout.fragment_my_game_papa_fav_vp)
/* loaded from: classes4.dex */
public class MyGamePapaFavVpFragment extends BaseFragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    RecyclerView f35751b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ViewPager2 f35752c;

    /* renamed from: d  reason: collision with root package name */
    private Context f35753d;

    /* renamed from: f  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f35755f;

    /* renamed from: g  reason: collision with root package name */
    private String f35756g;

    /* renamed from: h  reason: collision with root package name */
    private String f35757h;

    /* renamed from: i  reason: collision with root package name */
    com.join.mgps.rpc.b f35758i;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<GameFromPopoWinBean.DataBean> f35759j;

    /* renamed from: k  reason: collision with root package name */
    private e f35760k;

    /* renamed from: m  reason: collision with root package name */
    private d f35762m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f35763n;

    /* renamed from: p  reason: collision with root package name */
    private boolean f35765p;

    /* renamed from: e  reason: collision with root package name */
    int f35754e = 1;

    /* renamed from: l  reason: collision with root package name */
    private boolean f35761l = true;

    /* renamed from: o  reason: collision with root package name */
    private int f35764o = 0;

    /* renamed from: q  reason: collision with root package name */
    private boolean f35766q = false;

    /* loaded from: classes4.dex */
    class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 == 0 && MyGamePapaFavVpFragment.this.f35761l) {
                MyGamePapaFavVpFragment myGamePapaFavVpFragment = MyGamePapaFavVpFragment.this;
                myGamePapaFavVpFragment.f35754e++;
                myGamePapaFavVpFragment.a0();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements BaseQuickAdapter.j {
        b() {
        }

        @Override // com.join.mgps.base.BaseQuickAdapter.j
        public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
            ViewPager2 viewPager2 = MyGamePapaFavVpFragment.this.f35752c;
            if (viewPager2 == null || viewPager2.getCurrentItem() == i4) {
                return;
            }
            MyGamePapaFavVpFragment.this.f35752c.setCurrentItem(i4);
            MyGamePapaFavVpFragment.this.g0(i4);
            MyGamePapaFavVpFragment.this.f35760k.notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    class c extends ViewPager2.OnPageChangeCallback {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i4) {
            super.onPageSelected(i4);
            RecyclerView recyclerView = MyGamePapaFavVpFragment.this.f35751b;
            if (recyclerView != null) {
                recyclerView.smoothScrollToPosition(i4);
                MyGamePapaFavVpFragment.this.g0(i4);
                MyGamePapaFavVpFragment.this.f35760k.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends FragmentStateAdapter {

        /* renamed from: a  reason: collision with root package name */
        private List<GameFromPopoWinBean.DataBean> f35770a;

        /* renamed from: b  reason: collision with root package name */
        private List<Long> f35771b;

        public d(@NonNull Fragment fragment, List<GameFromPopoWinBean.DataBean> list) {
            super(fragment);
            this.f35771b = new ArrayList();
            this.f35770a = list;
            c();
        }

        private void c() {
            this.f35771b.clear();
            for (GameFromPopoWinBean.DataBean dataBean : this.f35770a) {
                List<Long> list = this.f35771b;
                list.add(Long.valueOf((dataBean.getTitle() + dataBean.getId()).hashCode()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(String str) {
            for (int i4 = 0; i4 < getItemCount(); i4++) {
                FragmentManager childFragmentManager = MyGamePapaFavVpFragment.this.getChildFragmentManager();
                Fragment findFragmentByTag = childFragmentManager.findFragmentByTag(com.xinzhu.overmind.utils.helpers.f.f68332a + getItemId(i4));
                if (findFragmentByTag != null && (findFragmentByTag instanceof MyGamePapaFavFragment_)) {
                    ((MyGamePapaFavFragment_) findFragmentByTag).u0(str);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(List<GameFromPopoWinBean.DataBean> list, boolean z4) {
            this.f35770a = list;
            c();
            notifyDataSetChanged();
            if (MyGamePapaFavVpFragment.this.f35754e == 1 && z4) {
                for (int i4 = 0; i4 < getItemCount(); i4++) {
                    FragmentManager childFragmentManager = MyGamePapaFavVpFragment.this.getChildFragmentManager();
                    Fragment findFragmentByTag = childFragmentManager.findFragmentByTag(com.xinzhu.overmind.utils.helpers.f.f68332a + getItemId(i4));
                    if (findFragmentByTag != null && (findFragmentByTag instanceof MyGamePapaFavFragment_)) {
                        GameFromPopoWinBean.DataBean dataBean = list.get(i4);
                        ((MyGamePapaFavFragment_) findFragmentByTag).t0(dataBean.getTitle(), dataBean.getId());
                    }
                }
            }
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public boolean containsItem(long j4) {
            return this.f35771b.contains(Long.valueOf(j4));
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public Fragment createFragment(int i4) {
            GameFromPopoWinBean.DataBean dataBean = this.f35770a.get(i4);
            return MyGamePapaFavFragment_.O0().b(dataBean.getId()).c(dataBean.getTitle()).build();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f35770a.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i4) {
            GameFromPopoWinBean.DataBean dataBean = this.f35770a.get(i4);
            return (dataBean.getTitle() + dataBean.getId()).hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e extends BaseQuickAdapter<GameFromPopoWinBean.DataBean, BaseViewHolder> {
        public e(@Nullable List<GameFromPopoWinBean.DataBean> list) {
            super(R.layout.item_my_game_papa_fav_tag, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, GameFromPopoWinBean.DataBean dataBean) {
            baseViewHolder.setText(R.id.tvTag, dataBean.getTitle()).setTextColor(R.id.tvTag, Color.parseColor(dataBean.isSelected() ? "#FFFFFF" : "#262626")).setBackgroundRes(R.id.tvTag, dataBean.isSelected() ? R.drawable.shape_tag_my_papa_game_selected : R.drawable.shape_tag_my_papa_game_unselected);
        }
    }

    private boolean b0() {
        File externalFilesDir = this.f35753d.getExternalFilesDir("backup");
        boolean z4 = externalFilesDir.exists() && externalFilesDir.isDirectory() && externalFilesDir.listFiles() != null && externalFilesDir.listFiles().length > 0;
        this.f35763n = z4;
        return z4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void X() {
        com.wufan.user.service.protobuf.n0 n0Var;
        Context context = getContext();
        this.f35753d = context;
        this.f35755f = AccountUtil_.getInstance_(context).getAccountData();
        if (!AccountUtil_.getInstance_(this.f35753d).isTourist() && (n0Var = this.f35755f) != null && !TextUtils.isEmpty(n0Var.getToken())) {
            this.f35765p = true;
        }
        this.f35756g = "";
        RequestBeanUtil.getInstance(this.f35753d);
        this.f35757h = RequestBeanUtil.getVersionAndVersionName();
        this.f35758i = com.join.mgps.rpc.impl.a.c0();
        this.f35759j = new ArrayList<>();
        GameFromPopoWinBean.DataBean dataBean = new GameFromPopoWinBean.DataBean();
        dataBean.setTitle(LocalGameActivity.f34225s);
        this.f35759j.add(dataBean);
        if (b0()) {
            GameFromPopoWinBean.DataBean dataBean2 = new GameFromPopoWinBean.DataBean();
            dataBean2.setTitle("存档");
            this.f35759j.add(dataBean2);
        }
        this.f35751b.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        e eVar = new e(this.f35759j);
        this.f35760k = eVar;
        this.f35751b.setAdapter(eVar);
        this.f35751b.addOnScrollListener(new a());
        this.f35760k.setOnItemClickListener(new b());
        this.f35752c.registerOnPageChangeCallback(new c());
        a0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(boolean z4) {
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f35753d).getAccountData();
        boolean z5 = this.f35763n;
        if (accountData == null || this.f35755f == null) {
            return;
        }
        if (z4 || accountData.getUid() != this.f35755f.getUid() || MApplication.I1 || b0() != z5) {
            this.f35755f = accountData;
            this.f35759j.clear();
            GameFromPopoWinBean.DataBean dataBean = new GameFromPopoWinBean.DataBean();
            dataBean.setTitle(LocalGameActivity.f34225s);
            this.f35759j.add(dataBean);
            if (b0()) {
                GameFromPopoWinBean.DataBean dataBean2 = new GameFromPopoWinBean.DataBean();
                dataBean2.setTitle("存档");
                this.f35759j.add(dataBean2);
            }
            e eVar = this.f35760k;
            if (eVar != null) {
                eVar.notifyDataSetChanged();
            }
            this.f35761l = true;
            this.f35754e = 1;
            a0();
            MApplication.I1 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void a0() {
        com.wufan.user.service.protobuf.n0 n0Var;
        try {
            if (!AccountUtil_.getInstance_(this.f35753d).isTourist() && (n0Var = this.f35755f) != null && !TextUtils.isEmpty(n0Var.getToken())) {
                if (com.join.android.app.common.utils.j.j(this.f35753d)) {
                    LinkedMultiValueMap linkedMultiValueMap = new LinkedMultiValueMap();
                    com.wufan.user.service.protobuf.n0 n0Var2 = this.f35755f;
                    linkedMultiValueMap.add("uid", Integer.valueOf(n0Var2 == null ? 0 : n0Var2.getUid()));
                    linkedMultiValueMap.add("page", Integer.valueOf(this.f35754e));
                    linkedMultiValueMap.add("type", 1);
                    linkedMultiValueMap.add("device_id", this.f35756g);
                    linkedMultiValueMap.add("version", this.f35757h);
                    GameFromPopoWinBean r4 = this.f35758i.r(linkedMultiValueMap);
                    if (r4 != null && r4.getError() == 0 && r4.getData() != null && r4.getData().size() != 0) {
                        this.f35759j.addAll(r4.getData());
                        if (this.f35754e == 1) {
                            if (this.f35764o < this.f35759j.size()) {
                                this.f35759j.get(this.f35764o).setSelected(true);
                            } else {
                                this.f35759j.get(0).setSelected(true);
                            }
                        }
                        c0(true);
                        return;
                    }
                    h0();
                    c0(true);
                    return;
                }
                h0();
                c0(true);
                return;
            }
            h0();
            c0(false);
        } catch (Exception e5) {
            e5.printStackTrace();
            c0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c0(boolean z4) {
        ArrayList<GameFromPopoWinBean.DataBean> arrayList = new ArrayList<>();
        Iterator<GameFromPopoWinBean.DataBean> it2 = this.f35759j.iterator();
        while (it2.hasNext()) {
            GameFromPopoWinBean.DataBean next = it2.next();
            Iterator<GameFromPopoWinBean.DataBean> it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    GameFromPopoWinBean.DataBean next2 = it3.next();
                    if (!TextUtils.equals(next2.getTitle(), next.getTitle()) || !TextUtils.equals(next2.getId(), next.getId())) {
                    }
                } else {
                    arrayList.add(next);
                    break;
                }
            }
        }
        Iterator<GameFromPopoWinBean.DataBean> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            GameFromPopoWinBean.DataBean next3 = it4.next();
            if (!TextUtils.isEmpty(next3.getGame_count()) && Integer.parseInt(next3.getGame_count()) <= 0) {
                it4.remove();
            }
        }
        this.f35759j = arrayList;
        e eVar = this.f35760k;
        if (eVar != null) {
            eVar.setNewData(arrayList);
        }
        if (getActivity() != null) {
            if (this.f35762m == null) {
                this.f35762m = new d(this, this.f35759j);
                this.f35752c.setOffscreenPageLimit(Math.max(this.f35759j.size() - 1, 1));
                this.f35752c.setAdapter(this.f35762m);
                return;
            }
            this.f35752c.setOffscreenPageLimit(Math.max(this.f35759j.size() - 1, 1));
            this.f35762m.e(this.f35759j, z4);
            this.f35762m.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(String str) {
        d dVar = this.f35762m;
        if (dVar != null) {
            dVar.d(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0(String str) {
        ArrayList<GameFromPopoWinBean.DataBean> arrayList = this.f35759j;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<GameFromPopoWinBean.DataBean> it2 = this.f35759j.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(it2.next().getId(), str)) {
                it2.remove();
            }
        }
        c0(false);
    }

    public void f0(boolean z4) {
        this.f35766q = z4;
    }

    void g0(int i4) {
        ArrayList<GameFromPopoWinBean.DataBean> arrayList = this.f35759j;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        int i5 = 0;
        while (i5 < this.f35759j.size()) {
            this.f35759j.get(i5).setSelected(i5 == i4);
            i5++;
        }
        this.f35764o = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        this.f35761l = false;
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f35765p) {
            this.f35765p = false;
            return;
        }
        Z(this.f35766q);
        this.f35766q = false;
    }
}
