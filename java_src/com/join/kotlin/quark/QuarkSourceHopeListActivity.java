package com.join.kotlin.quark;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ActivityQuarkSourceHopeListBinding;
import com.join.kotlin.base.activity.BaseVmDbActivity;
import com.join.kotlin.quark.callback.IChangeSortCallback;
import com.join.kotlin.quark.pop.SortPopWindow;
import com.join.kotlin.quark.proxy.SourceHopeClickProxy;
import com.join.kotlin.quark.viewmodel.SourceHopeViewModel;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.LocalGameActivity;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.dto.ExtBean;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: QuarkSourceHopeListActivity.kt */
@SourceDebugExtension({"SMAP\nQuarkSourceHopeListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuarkSourceHopeListActivity.kt\ncom/join/kotlin/quark/QuarkSourceHopeListActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n1855#2,2:246\n*S KotlinDebug\n*F\n+ 1 QuarkSourceHopeListActivity.kt\ncom/join/kotlin/quark/QuarkSourceHopeListActivity\n*L\n173#1:246,2\n*E\n"})
/* loaded from: classes3.dex */
public final class QuarkSourceHopeListActivity extends BaseVmDbActivity<SourceHopeViewModel, ActivityQuarkSourceHopeListBinding> implements SourceHopeClickProxy, IChangeSortCallback {
    @Nullable
    private FragmentPagerAdapter adapter;
    @Nullable
    private ExtBean extBean;
    @NotNull
    private ArrayList<FragmentPagerAdapter.a> fragments = new ArrayList<>();
    @Nullable
    private SortPopWindow sortPopWindow;
    @Nullable
    private Integer statusState1;

    private final void getView(ArrayList<String> arrayList) {
        View view;
        View customView;
        View customView2;
        if (getMDatabind().f16906c.getTabCount() == 0) {
            return;
        }
        int tabCount = getMDatabind().f16906c.getTabCount();
        int i4 = 0;
        while (true) {
            view = null;
            if (i4 >= tabCount) {
                break;
            }
            View inflate = LayoutInflater.from(this).inflate(R.layout.layout_source_share_tab_item, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(this).inflate(R.lay…rce_share_tab_item, null)");
            View findViewById = inflate.findViewById(R.id.tv_name);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById).setText(arrayList.get(i4));
            TabLayout.Tab tabAt = getMDatabind().f16906c.getTabAt(i4);
            if (tabAt != null) {
                tabAt.setCustomView(inflate);
            }
            i4++;
        }
        TabLayout.Tab tabAt2 = getMDatabind().f16906c.getTabAt(0);
        View findViewById2 = (tabAt2 == null || (customView2 = tabAt2.getCustomView()) == null) ? null : customView2.findViewById(R.id.tv_name);
        Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById2;
        textView.setTextColor(-16777216);
        textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp32));
        textView.setTypeface(textView.getTypeface(), 1);
        TabLayout.Tab tabAt3 = getMDatabind().f16906c.getTabAt(0);
        if (tabAt3 != null && (customView = tabAt3.getCustomView()) != null) {
            view = customView.findViewById(R.id.iv_ind);
        }
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStatus(TabLayout.Tab tab) {
        if (getMDatabind().f16906c.getTabCount() == 0) {
            return;
        }
        int tabCount = getMDatabind().f16906c.getTabCount();
        for (int i4 = 0; i4 < tabCount; i4++) {
            TabLayout.Tab tabAt = getMDatabind().f16906c.getTabAt(i4);
            View customView = tabAt != null ? tabAt.getCustomView() : null;
            if (customView != null) {
                if (i4 == tab.getPosition()) {
                    customView.findViewById(R.id.iv_ind).setVisibility(0);
                    View findViewById = customView.findViewById(R.id.tv_name);
                    Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView = (TextView) findViewById;
                    textView.setTextColor(-16777216);
                    textView.setTypeface(textView.getTypeface(), 1);
                    textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp32));
                } else {
                    customView.findViewById(R.id.iv_ind).setVisibility(4);
                    View findViewById2 = customView.findViewById(R.id.tv_name);
                    Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView2 = (TextView) findViewById2;
                    textView2.setTextColor(Color.parseColor("#000000"));
                    textView2.setTypeface(textView2.getTypeface(), 0);
                    textView2.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.wdp28));
                }
            }
        }
    }

    private final void showSortPop(View view) {
        SortPopWindow sortPopWindow = this.sortPopWindow;
        if (sortPopWindow != null) {
            Intrinsics.checkNotNull(sortPopWindow);
            if (sortPopWindow.isShowing()) {
                SortPopWindow sortPopWindow2 = this.sortPopWindow;
                Intrinsics.checkNotNull(sortPopWindow2);
                sortPopWindow2.dismiss();
            }
        }
        if (this.sortPopWindow == null) {
            this.sortPopWindow = new SortPopWindow(this, -2, -2);
        }
        SortPopWindow sortPopWindow3 = this.sortPopWindow;
        if (sortPopWindow3 != null) {
            Intrinsics.checkNotNull(sortPopWindow3);
            if (sortPopWindow3.getContentView() != null) {
                SortPopWindow sortPopWindow4 = this.sortPopWindow;
                Intrinsics.checkNotNull(sortPopWindow4);
                sortPopWindow4.getContentView().measure(0, 0);
                SortPopWindow sortPopWindow5 = this.sortPopWindow;
                Intrinsics.checkNotNull(sortPopWindow5);
                int measuredHeight = sortPopWindow5.getContentView().getMeasuredHeight();
                SortPopWindow sortPopWindow6 = this.sortPopWindow;
                Intrinsics.checkNotNull(sortPopWindow6);
                sortPopWindow6.setHeight(measuredHeight);
            }
        }
        SortPopWindow sortPopWindow7 = this.sortPopWindow;
        Intrinsics.checkNotNull(sortPopWindow7);
        sortPopWindow7.showAsDropDown(view, 0, -((int) getResources().getDimension(R.dimen.wdp6)));
        SortPopWindow sortPopWindow8 = this.sortPopWindow;
        Intrinsics.checkNotNull(sortPopWindow8);
        sortPopWindow8.getBtnSxz().setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.quark.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                QuarkSourceHopeListActivity.showSortPop$lambda$5(QuarkSourceHopeListActivity.this, view2);
            }
        });
        SortPopWindow sortPopWindow9 = this.sortPopWindow;
        Intrinsics.checkNotNull(sortPopWindow9);
        sortPopWindow9.getBtnYsx().setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.quark.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                QuarkSourceHopeListActivity.showSortPop$lambda$6(QuarkSourceHopeListActivity.this, view2);
            }
        });
        SortPopWindow sortPopWindow10 = this.sortPopWindow;
        Intrinsics.checkNotNull(sortPopWindow10);
        sortPopWindow10.getBtnAll().setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.quark.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                QuarkSourceHopeListActivity.showSortPop$lambda$7(QuarkSourceHopeListActivity.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSortPop$lambda$5(QuarkSourceHopeListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.changeSort(0);
        this$0.getMDatabind().f16908e.setText("实现中");
        SortPopWindow sortPopWindow = this$0.sortPopWindow;
        Intrinsics.checkNotNull(sortPopWindow);
        sortPopWindow.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSortPop$lambda$6(QuarkSourceHopeListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.changeSort(1);
        this$0.getMDatabind().f16908e.setText("已实现");
        SortPopWindow sortPopWindow = this$0.sortPopWindow;
        Intrinsics.checkNotNull(sortPopWindow);
        sortPopWindow.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSortPop$lambda$7(QuarkSourceHopeListActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.changeSort(null);
        this$0.getMDatabind().f16908e.setText(LocalGameActivity.f34225s);
        SortPopWindow sortPopWindow = this$0.sortPopWindow;
        Intrinsics.checkNotNull(sortPopWindow);
        sortPopWindow.dismiss();
    }

    public final void changeSort(@Nullable Integer num) {
        this.statusState1 = num;
        for (FragmentPagerAdapter.a aVar : this.fragments) {
            Fragment fragment = aVar.f41979c;
            if (fragment instanceof IChangeSortCallback) {
                Intrinsics.checkNotNull(fragment, "null cannot be cast to non-null type com.join.kotlin.quark.callback.IChangeSortCallback");
                ((IChangeSortCallback) fragment).onStatusChanged();
            }
        }
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void createObserver() {
        SourceHopeFragment sourceHopeFragment = new SourceHopeFragment();
        Bundle bundle = new Bundle();
        bundle.putString("_keyword", ((SourceHopeViewModel) getMViewModel()).getKeyword());
        bundle.putInt("_sortType", 2);
        sourceHopeFragment.setArguments(bundle);
        this.fragments.add(new FragmentPagerAdapter.a(((SourceHopeViewModel) getMViewModel()).getTabItems().get(0), sourceHopeFragment));
        SourceHopeFragment sourceHopeFragment2 = new SourceHopeFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("_keyword", ((SourceHopeViewModel) getMViewModel()).getKeyword());
        bundle2.putInt("_sortType", 1);
        sourceHopeFragment2.setArguments(bundle2);
        this.fragments.add(new FragmentPagerAdapter.a(((SourceHopeViewModel) getMViewModel()).getTabItems().get(1), sourceHopeFragment2));
        SourceHopeFragment sourceHopeFragment3 = new SourceHopeFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putString("_keyword", ((SourceHopeViewModel) getMViewModel()).getKeyword());
        bundle3.putInt("_sortType", 3);
        sourceHopeFragment3.setArguments(bundle3);
        this.fragments.add(new FragmentPagerAdapter.a(((SourceHopeViewModel) getMViewModel()).getTabItems().get(2), sourceHopeFragment3));
        FragmentPagerAdapter fragmentPagerAdapter = this.adapter;
        if (fragmentPagerAdapter != null) {
            fragmentPagerAdapter.e(this.fragments);
            fragmentPagerAdapter.notifyDataSetChanged();
        }
        getView(((SourceHopeViewModel) getMViewModel()).getTabItems());
        getMDatabind().f16906c.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.join.kotlin.quark.QuarkSourceHopeListActivity$createObserver$2
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabReselected(@NotNull TabLayout.Tab tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
                QuarkSourceHopeListActivity.this.setStatus(tab);
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabSelected(@NotNull TabLayout.Tab tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
                QuarkSourceHopeListActivity.this.setStatus(tab);
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public void onTabUnselected(@NotNull TabLayout.Tab tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
            }
        });
    }

    @Nullable
    public final FragmentPagerAdapter getAdapter() {
        return this.adapter;
    }

    @Nullable
    public final ExtBean getExtBean() {
        return this.extBean;
    }

    @NotNull
    public final ArrayList<FragmentPagerAdapter.a> getFragments() {
        return this.fragments;
    }

    @Nullable
    public final SortPopWindow getSortPopWindow() {
        return this.sortPopWindow;
    }

    @Override // com.join.kotlin.quark.callback.IChangeSortCallback
    @Nullable
    public Integer getStatusState() {
        return this.statusState1;
    }

    @Nullable
    public final Integer getStatusState1() {
        return this.statusState1;
    }

    @Override // com.join.kotlin.base.activity.BaseVmActivity
    public void initView(@Nullable Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            if (this.extBean != null) {
                com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(this);
                Event event = Event.visitPCPageZone;
                Ext ext = new Ext();
                ExtBean extBean = this.extBean;
                Intrinsics.checkNotNull(extBean);
                l4.O1(event, ext.setFrom(extBean.getFrom()));
            }
            ((SourceHopeViewModel) getMViewModel()).setKeyword(intent.getStringExtra("_keyword"));
        }
        getMDatabind().h((SourceHopeViewModel) getMViewModel());
        this.adapter = new FragmentPagerAdapter(getSupportFragmentManager());
        getMDatabind().f16909f.setAdapter(this.adapter);
        getMDatabind().f16906c.setupWithViewPager(getMDatabind().f16909f);
        getMDatabind().h((SourceHopeViewModel) getMViewModel());
        getMDatabind().g(this);
    }

    @Override // com.join.kotlin.quark.proxy.SourceHopeClickProxy
    public void onBackClick() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    @Override // com.join.kotlin.quark.proxy.SourceHopeClickProxy
    public void onSortTypeClick() {
        TextView textView = getMDatabind().f16908e;
        Intrinsics.checkNotNullExpressionValue(textView, "mDatabind.tvSort");
        showSortPop(textView);
    }

    @Override // com.join.kotlin.quark.callback.IChangeSortCallback
    public void onStatusChanged() {
    }

    @Override // com.join.kotlin.quark.proxy.SourceHopeClickProxy
    public void onWishCreateClick() {
        Intent intent = new Intent(this, CreateSourceHopeActivity.class);
        intent.putExtra("_keyword", ((SourceHopeViewModel) getMViewModel()).getKeyword());
        startActivity(intent);
    }

    public final void setAdapter(@Nullable FragmentPagerAdapter fragmentPagerAdapter) {
        this.adapter = fragmentPagerAdapter;
    }

    public final void setExtBean(@Nullable ExtBean extBean) {
        this.extBean = extBean;
    }

    public final void setFragments(@NotNull ArrayList<FragmentPagerAdapter.a> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.fragments = arrayList;
    }

    public final void setSortPopWindow(@Nullable SortPopWindow sortPopWindow) {
        this.sortPopWindow = sortPopWindow;
    }

    public final void setStatusState1(@Nullable Integer num) {
        this.statusState1 = num;
    }
}
