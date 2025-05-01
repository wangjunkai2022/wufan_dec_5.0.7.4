package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.MApplication;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.adapter.FragmentPagerAdapter;
import com.join.mgps.fragment.GameFromBuildFragment;
import com.join.mgps.fragment.GameFromBuildFragment_;
import com.join.mgps.fragment.GameSubscribeFragment;
import com.join.mgps.fragment.GameSubscribeFragment_;
import com.join.mgps.fragment.GmaeFormPostFragment;
import com.join.mgps.fragment.GmaeFormPostFragment_;
import java.util.ArrayList;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_game_and_profile)
/* loaded from: classes4.dex */
public class GameAndProfileActivity extends MyFragmentActivity1 {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SlidingTabLayout f31422b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ViewPager f31423c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f31424d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    RelativeLayout f31425e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f31426f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f31427g;
    @Extra

    /* renamed from: h  reason: collision with root package name */
    int f31428h = 0;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    int f31429i = 0;

    /* renamed from: j  reason: collision with root package name */
    GmaeFormPostFragment f31430j;

    /* renamed from: k  reason: collision with root package name */
    GameSubscribeFragment f31431k;

    /* renamed from: l  reason: collision with root package name */
    GameFromBuildFragment f31432l;

    /* renamed from: m  reason: collision with root package name */
    Context f31433m;

    /* renamed from: n  reason: collision with root package name */
    com.wufan.user.service.protobuf.n0 f31434n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewPager.OnPageChangeListener {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
            if (i4 == 0) {
                GameAndProfileActivity.this.f31426f.setVisibility(0);
            } else {
                GameAndProfileActivity.this.f31426f.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void f0() {
        this.f31433m = this;
        MApplication.T = false;
        FragmentPagerAdapter fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager());
        ArrayList arrayList = new ArrayList();
        this.f31434n = AccountUtil_.getInstance_(this.f31433m).getAccountData();
        this.f31430j = new GmaeFormPostFragment_();
        this.f31431k = new GameSubscribeFragment_();
        this.f31432l = new GameFromBuildFragment_();
        Bundle bundle = new Bundle();
        bundle.putInt("uid", this.f31429i);
        this.f31430j.setArguments(bundle);
        this.f31431k.setArguments(bundle);
        this.f31432l.setArguments(bundle);
        FragmentPagerAdapter.a aVar = new FragmentPagerAdapter.a("创建", this.f31432l);
        FragmentPagerAdapter.a aVar2 = new FragmentPagerAdapter.a("订阅", this.f31431k);
        FragmentPagerAdapter.a aVar3 = new FragmentPagerAdapter.a("帖子", this.f31430j);
        int uid = this.f31434n.getUid();
        int i4 = this.f31429i;
        if (uid != i4 && i4 != 0) {
            this.f31426f.setVisibility(8);
            this.f31422b.setVisibility(8);
            int i5 = this.f31428h;
            if (i5 == 0) {
                this.f31427g.setText("创建的游戏单");
                arrayList.add(aVar);
            } else if (i5 == 1) {
                this.f31427g.setText("订阅的游戏单");
                arrayList.add(aVar2);
            }
        } else {
            arrayList.add(aVar);
            arrayList.add(aVar2);
            arrayList.add(aVar3);
            this.f31426f.setVisibility(0);
        }
        fragmentPagerAdapter.e(arrayList);
        this.f31423c.setAdapter(fragmentPagerAdapter);
        this.f31423c.setOffscreenPageLimit(3);
        this.f31423c.setOnPageChangeListener(new a());
        this.f31422b.setViewPager(this.f31423c);
        if (this.f31434n.getUid() == this.f31429i) {
            int i6 = this.f31428h;
            if (i6 == 0) {
                this.f31423c.setCurrentItem(0);
            } else if (i6 == 1) {
                this.f31423c.setCurrentItem(1);
            } else if (i6 == 2) {
                this.f31423c.setCurrentItem(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        if (!com.join.mgps.Util.g2.h(this.f31434n.getNickname()) && (!this.f31434n.getAccount().equals(this.f31434n.getNickname()) || !this.f31434n.getAccount().startsWith("pa"))) {
            MApplication.T = true;
            startActivity(new Intent(this, BuildGameFromActivity_.class));
            return;
        }
        IntentUtil.getInstance().goChangeNickname(this.f31433m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void iv_back() {
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (this.f31430j instanceof GmaeFormPostFragment) {
            GmaeFormPostFragment.I0(i4, keyEvent);
        }
        return super.onKeyDown(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.MyFragmentActivity1, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (MApplication.T && this.f31429i == 0) {
            this.f31432l.a0();
            MApplication.T = false;
        }
    }
}
