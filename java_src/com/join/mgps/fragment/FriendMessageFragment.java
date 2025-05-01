package com.join.mgps.fragment;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.FriendActivity;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_friend_msg)
/* loaded from: classes3.dex */
public class FriendMessageFragment extends BaseFragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f51596b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f51597c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    View f51598d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ViewPager f51599e;

    /* renamed from: f  reason: collision with root package name */
    List<Fragment> f51600f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    PagerAdapter f51601g;

    /* loaded from: classes3.dex */
    class a extends FragmentPagerAdapter {
        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return FriendMessageFragment.this.f51600f.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i4) {
            return FriendMessageFragment.this.f51600f.get(i4);
        }
    }

    /* loaded from: classes3.dex */
    class b implements ViewPager.OnPageChangeListener {
        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            FriendMessageFragment.this.f51596b.setSelected(i4 == 0);
            FriendMessageFragment.this.f51597c.setSelected(i4 == 1);
            if (i4 == 1 && FriendMessageFragment.this.f51600f.size() > 1 && (FriendMessageFragment.this.f51600f.get(1) instanceof FriendMsgLikeFragment)) {
                ((FriendMsgLikeFragment) FriendMessageFragment.this.f51600f.get(1)).c0();
                if (com.wufan.friend.chat.c.u().r() != null) {
                    com.wufan.friend.chat.c.u().r().setLikedCount(0);
                }
                View view = FriendMessageFragment.this.f51598d;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(View view) {
        this.f51599e.setCurrentItem(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(View view) {
        this.f51599e.setCurrentItem(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0() {
        List<Fragment> list = this.f51600f;
        if (list != null) {
            ((FriendMsgRequestFragment) list.get(0)).e0();
            ((FriendMsgLikeFragment) this.f51600f.get(1)).f0();
            if (this.f51599e.getCurrentItem() == 1 && this.f51600f.size() > 1 && (this.f51600f.get(1) instanceof FriendMsgLikeFragment)) {
                ((FriendMsgLikeFragment) this.f51600f.get(1)).c0();
                if (com.wufan.friend.chat.c.u().r() != null) {
                    com.wufan.friend.chat.c.u().r().setLikedCount(0);
                }
                View view = this.f51598d;
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            if (this.f51598d != null) {
                if (com.wufan.friend.chat.c.u().r() != null && com.wufan.friend.chat.c.u().r().getLikedCount() > 0) {
                    this.f51598d.setVisibility(0);
                } else {
                    this.f51598d.setVisibility(8);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void Z() {
        if (getContext() instanceof FriendActivity) {
            ((FriendActivity) getContext()).T0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f51596b.setSelected(true);
        this.f51600f.add(new FriendMsgRequestFragment_());
        this.f51600f.add(new FriendMsgLikeFragment_());
        a aVar = new a(getChildFragmentManager());
        this.f51601g = aVar;
        this.f51599e.setAdapter(aVar);
        this.f51599e.addOnPageChangeListener(new b());
        this.f51599e.setOffscreenPageLimit(1);
        this.f51599e.setCurrentItem(0);
        this.f51596b.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendMessageFragment.this.a0(view);
            }
        });
        this.f51597c.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.fragment.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FriendMessageFragment.this.b0(view);
            }
        });
        if (com.wufan.friend.chat.c.u().r() != null && com.wufan.friend.chat.c.u().r().getLikedCount() > 0) {
            this.f51598d.setVisibility(0);
        } else {
            this.f51598d.setVisibility(8);
        }
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z4) {
        super.onHiddenChanged(z4);
        if (z4) {
            return;
        }
        this.mHandler.postDelayed(new Runnable() { // from class: com.join.mgps.fragment.t0
            @Override // java.lang.Runnable
            public final void run() {
                FriendMessageFragment.this.c0();
            }
        }, 500L);
    }
}
