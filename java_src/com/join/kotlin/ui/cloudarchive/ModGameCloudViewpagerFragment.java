package com.join.kotlin.ui.cloudarchive;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.adapter.CloudArchiveTagAdapter;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.customview.NoScrollViewPager;
import com.join.mgps.dto.ModGameArchiveTagBean;
import com.join.mgps.dto.ModGameDetailBean;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_mod_game_cloud_viewpager)
/* loaded from: classes3.dex */
public class ModGameCloudViewpagerFragment extends Fragment {
    private CloudArchiveTagAdapter cloudArchiveTagAdapter;
    private List<FragmentPagerAdapter.a> fragments;
    private String gameId;
    private ModGameDetailBean modgameBean;
    @ViewById
    RecyclerView subTabList;
    private int type;
    @ViewById
    NoScrollViewPager viewpager;
    private ArrayList<ModGameArchiveTagBean> tags = new ArrayList<>();
    private int defaultSelectedIndex = 0;
    private int lastSelectedTagIndex = 0;

    private void addTagList() {
        ArrayList<ModGameArchiveTagBean> arrayList = this.tags;
        if (arrayList != null && arrayList.size() > 0) {
            this.tags.get(this.defaultSelectedIndex).setSelected(true);
        }
        this.subTabList.setLayoutManager(new LinearLayoutManager(getActivity(), 0, false));
        CloudArchiveTagAdapter cloudArchiveTagAdapter = new CloudArchiveTagAdapter(getActivity(), this.tags);
        this.cloudArchiveTagAdapter = cloudArchiveTagAdapter;
        cloudArchiveTagAdapter.e(new CloudArchiveTagAdapter.a() { // from class: com.join.kotlin.ui.cloudarchive.i
            @Override // com.join.mgps.adapter.CloudArchiveTagAdapter.a
            public final void onSelected(int i4) {
                ModGameCloudViewpagerFragment.this.lambda$addTagList$0(i4);
            }
        });
        this.subTabList.setAdapter(this.cloudArchiveTagAdapter);
    }

    private void initDefaultSelectedIndex() {
        ArrayList<ModGameArchiveTagBean> arrayList;
        ModGameDetailBean modGameDetailBean = this.modgameBean;
        if (modGameDetailBean == null || modGameDetailBean.getCloud_archive_cfg() == null || (arrayList = this.tags) == null || arrayList.size() <= 0) {
            return;
        }
        if (this.modgameBean.getCloud_archive_cfg().getLocation_at() == 2) {
            Iterator<ModGameArchiveTagBean> it2 = this.tags.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ModGameArchiveTagBean next = it2.next();
                if (TextUtils.equals(next.getTagId(), "5")) {
                    this.defaultSelectedIndex = this.tags.indexOf(next);
                    break;
                }
            }
        }
        this.lastSelectedTagIndex = this.defaultSelectedIndex;
    }

    private void initViewPager() {
        this.fragments = new ArrayList();
        Iterator<ModGameArchiveTagBean> it2 = this.tags.iterator();
        while (it2.hasNext()) {
            ModGameArchiveTagBean next = it2.next();
            Bundle bundle = new Bundle();
            ModgameCloudListFragment modgameCloudListFragment = new ModgameCloudListFragment();
            bundle.putString("gameId", this.gameId);
            bundle.putInt("type", this.type);
            bundle.putSerializable("datas", this.modgameBean);
            bundle.putSerializable("tag", next);
            modgameCloudListFragment.setArguments(bundle);
            this.fragments.add(new FragmentPagerAdapter.a(next.getName(), modgameCloudListFragment));
        }
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getFragmentManager(), this.fragments);
        this.viewpager.setOffscreenPageLimit(this.tags.size() - 1);
        this.viewpager.setAdapter(fragmentPagerAdapter);
        this.viewpager.setCurrentItem(this.defaultSelectedIndex);
        this.viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.join.kotlin.ui.cloudarchive.ModGameCloudViewpagerFragment.1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i4) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i4, float f5, int i5) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i4) {
                Iterator it3 = ModGameCloudViewpagerFragment.this.tags.iterator();
                while (it3.hasNext()) {
                    ModGameArchiveTagBean modGameArchiveTagBean = (ModGameArchiveTagBean) it3.next();
                    boolean z4 = false;
                    if (ModGameCloudViewpagerFragment.this.tags.indexOf(modGameArchiveTagBean) == i4) {
                        modGameArchiveTagBean.setCount(0);
                    }
                    if (ModGameCloudViewpagerFragment.this.tags.indexOf(modGameArchiveTagBean) == i4) {
                        z4 = true;
                    }
                    modGameArchiveTagBean.setSelected(z4);
                }
                ModGameCloudViewpagerFragment.this.cloudArchiveTagAdapter.notifyDataSetChanged();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ModGameCloudViewpagerFragment.this.subTabList.getLayoutManager();
                if (linearLayoutManager != null && (linearLayoutManager.findLastCompletelyVisibleItemPosition() < i4 || linearLayoutManager.findFirstCompletelyVisibleItemPosition() > i4)) {
                    ModGameCloudViewpagerFragment.this.subTabList.smoothScrollToPosition(i4);
                }
                if (ModGameCloudViewpagerFragment.this.lastSelectedTagIndex != i4) {
                    com.papa.sim.statistic.p.l(ModGameCloudViewpagerFragment.this.getContext()).O1(Event.clickCloudLabelButton, new Ext().setFrom(String.valueOf(((ModGameArchiveTagBean) ModGameCloudViewpagerFragment.this.tags.get(i4)).getType())).setGameId(ModGameCloudViewpagerFragment.this.gameId).setPosition(((ModGameArchiveTagBean) ModGameCloudViewpagerFragment.this.tags.get(i4)).getTagId()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addTagList$0(int i4) {
        this.viewpager.setCurrentItem(i4, true);
        if (i4 == this.lastSelectedTagIndex) {
            Fragment fragment = this.fragments.get(i4).f41979c;
            if (fragment != null && fragment.isAdded() && fragment.isVisible() && (fragment instanceof ModgameCloudListFragment)) {
                ((ModgameCloudListFragment) fragment).scrollToTop();
                return;
            }
            return;
        }
        this.lastSelectedTagIndex = i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        Bundle arguments = getArguments();
        this.modgameBean = (ModGameDetailBean) arguments.getSerializable("datas");
        this.type = arguments.getInt("type");
        this.gameId = arguments.getString("gameId");
        this.tags = arguments.getParcelableArrayList("tags");
        initDefaultSelectedIndex();
        addTagList();
        initViewPager();
    }
}
