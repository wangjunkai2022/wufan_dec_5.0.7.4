package com.join.mgps.activity;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.MApplication;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.EveryDayNewGameFragment;
import com.join.kotlin.ui.findgame.FindGameClassfyFragment;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.PapaHomeBeanV9;
import com.join.mgps.dto.SScrollingTxtBeanV2;
import com.join.mgps.dto.SScrollingTxtDTOV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.mgpapa_mainfragment_new_layout_v4)
/* loaded from: classes.dex */
public class PapaMainV4Fragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f36726b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ViewFlipper f36727c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f36728d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f36729e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TabLayout f36730f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ViewPager2 f36731g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<SScrollingTxtBeanV2> f36732h;

    /* renamed from: i  reason: collision with root package name */
    private int f36733i;

    /* loaded from: classes4.dex */
    class a extends ViewPager2.OnPageChangeCallback {
        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i4, float f5, int i5) {
            PapaMainV4Fragment.this.f36730f.setScrollPosition(i4, f5, true, false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i4) {
            super.onPageSelected(i4);
            if (PapaMainV4Fragment.this.f36730f.getTabAt(i4) != null) {
                PapaMainV4Fragment.this.f36730f.getTabAt(i4).select();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b implements TabLayout.OnTabSelectedListener {
        b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            PapaMainV4Fragment.this.f36731g.setCurrentItem(tab.getPosition());
            for (int i4 = 0; i4 < PapaMainV4Fragment.this.f36730f.getTabCount(); i4++) {
                TabLayout.Tab tabAt = PapaMainV4Fragment.this.f36730f.getTabAt(i4);
                if (tabAt != null && tabAt.getCustomView() != null) {
                    TextView textView = (TextView) tabAt.getCustomView().findViewById(R.id.tabText);
                    textView.setTextSize(0, PapaMainV4Fragment.this.getResources().getDimension(tabAt.isSelected() ? R.dimen.wdp32 : R.dimen.wdp28));
                    textView.setTypeface(null, tabAt.isSelected() ? 1 : 0);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            PapaMainV4Fragment.this.f36731g.setCurrentItem(tab.getPosition());
            for (int i4 = 0; i4 < PapaMainV4Fragment.this.f36730f.getTabCount(); i4++) {
                TabLayout.Tab tabAt = PapaMainV4Fragment.this.f36730f.getTabAt(i4);
                if (tabAt != null && tabAt.getCustomView() != null) {
                    TextView textView = (TextView) tabAt.getCustomView().findViewById(R.id.tabText);
                    textView.setTextSize(0, PapaMainV4Fragment.this.getResources().getDimension(tabAt.isSelected() ? R.dimen.wdp32 : R.dimen.wdp28));
                    textView.setTypeface(null, tabAt.isSelected() ? 1 : 0);
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* loaded from: classes4.dex */
    class c {

        /* renamed from: a  reason: collision with root package name */
        String f36736a;

        /* renamed from: b  reason: collision with root package name */
        Fragment f36737b;

        public c(String str, Fragment fragment) {
            this.f36736a = str;
            this.f36737b = fragment;
        }
    }

    /* loaded from: classes4.dex */
    class d extends FragmentStateAdapter {

        /* renamed from: a  reason: collision with root package name */
        List<c> f36739a;

        public d(@NonNull FragmentActivity fragmentActivity, List<c> list) {
            super(fragmentActivity);
            this.f36739a = list;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        public Fragment createFragment(int i4) {
            return this.f36739a.get(i4).f36737b;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f36739a.size();
        }
    }

    private void W(SScrollingTxtDTOV2 sScrollingTxtDTOV2) {
        if (sScrollingTxtDTOV2 == null || sScrollingTxtDTOV2.getText() == null || sScrollingTxtDTOV2.getText().size() <= 0) {
            return;
        }
        ArrayList<SScrollingTxtBeanV2> arrayList = new ArrayList<>(sScrollingTxtDTOV2.getText());
        this.f36732h = arrayList;
        if (arrayList.size() <= 0) {
            this.f36732h = new ArrayList<>();
        }
        this.f36727c.stopFlipping();
        this.f36727c.removeAllViews();
        Iterator<SScrollingTxtBeanV2> it2 = this.f36732h.iterator();
        while (it2.hasNext()) {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.item_search_hint_viewflipper, (ViewGroup) null);
            textView.setText(it2.next().getWord());
            this.f36727c.addView(textView);
        }
        int interval = sScrollingTxtDTOV2.getInterval();
        this.f36733i = interval;
        if (interval < 1) {
            this.f36733i = 1;
        }
        this.f36727c.setFlipInterval(this.f36733i * 1000);
        this.f36727c.startFlipping();
        MApplication.G1 = this.f36732h;
        MApplication.H1 = this.f36733i;
    }

    private void X() {
        List<DownloadTask> r4 = p1.f.K().r();
        if (r4 != null && r4.size() > 0) {
            TextView textView = this.f36729e;
            textView.setText(r4.size() + "");
            this.f36729e.setVisibility(0);
            return;
        }
        this.f36729e.setText("");
        this.f36729e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void V() {
        com.join.mgps.Util.d0.a().d(this);
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.f36726b.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).height = com.join.android.app.common.utils.n.v(getContext());
        this.f36726b.setLayoutParams(layoutParams);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c("精选", new PapaMainV4SubHomeFragment_()));
        arrayList.add(new c("分类", new FindGameClassfyFragment()));
        arrayList.add(new c("新游", new EveryDayNewGameFragment()));
        arrayList.add(new c("网游", new CollectionModuleSevenFragment_()));
        this.f36731g.setAdapter(new d(getActivity(), arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c cVar = (c) it2.next();
            TabLayout.Tab customView = this.f36730f.newTab().setCustomView(R.layout.layout_custom_tab_main_game);
            if (customView.getCustomView() != null) {
                ((TextView) customView.getCustomView().findViewById(R.id.tabText)).setText(cVar.f36736a);
                this.f36730f.addTab(customView);
            }
        }
        this.f36731g.registerOnPageChangeCallback(new a());
        this.f36730f.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new b());
        TabLayout tabLayout = this.f36730f;
        tabLayout.selectTab(tabLayout.getTabAt(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(PapaHomeBeanV9 papaHomeBeanV9) {
        if (papaHomeBeanV9 != null) {
            W(papaHomeBeanV9.getS_scrolling_txt_v2());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void a0() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(3);
        intentDateBean.setJump_type(6);
        IntentUtil.getInstance().intentActivity(getContext(), intentDateBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void b0() {
        IntentUtil.getInstance().goForumProfileMessageActivity(getContext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void c0() {
        ArrayList<SScrollingTxtBeanV2> arrayList = this.f36732h;
        if (arrayList != null && arrayList.size() > 0) {
            ViewFlipper viewFlipper = this.f36727c;
            if (viewFlipper != null && viewFlipper.getCurrentView() != null && !TextUtils.isEmpty(((TextView) this.f36727c.getCurrentView()).getText())) {
                String charSequence = ((TextView) this.f36727c.getCurrentView()).getText().toString();
                int i4 = 0;
                while (true) {
                    if (i4 >= this.f36732h.size()) {
                        i4 = 0;
                        break;
                    } else if (TextUtils.equals(charSequence, this.f36732h.get(i4).getWord())) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 >= 0) {
                    ArrayList<SScrollingTxtBeanV2> arrayList2 = this.f36732h;
                    List<SScrollingTxtBeanV2> subList = arrayList2.subList(i4, arrayList2.size());
                    List<SScrollingTxtBeanV2> subList2 = this.f36732h.subList(0, i4);
                    ArrayList<SScrollingTxtBeanV2> arrayList3 = new ArrayList<>();
                    arrayList3.addAll(subList);
                    arrayList3.addAll(subList2);
                    this.f36732h = arrayList3;
                }
            }
            IntentUtil.getInstance().goSearchHintActivity(getContext(), this.f36732h, this.f36733i);
            return;
        }
        IntentUtil.getInstance().goSearchHintActivity(getContext());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.Util.d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        if (nVar == null || nVar.a() == null) {
            return;
        }
        X();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        X();
    }
}
