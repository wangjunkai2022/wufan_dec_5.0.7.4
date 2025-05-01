package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.ModGameCloudViewModle;
import com.join.kotlin.ui.cloudarchive.adapter.MyPagerAdapter;
/* loaded from: classes3.dex */
public abstract class ModgameCloudArchiveFragmentBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final SlidingTabLayout f25142b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f25143c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ViewPager f25144d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected ModGameCloudViewModle f25145e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected MyPagerAdapter f25146f;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModgameCloudArchiveFragmentBinding(Object obj, View view, int i4, SlidingTabLayout slidingTabLayout, RelativeLayout relativeLayout, ViewPager viewPager) {
        super(obj, view, i4);
        this.f25142b = slidingTabLayout;
        this.f25143c = relativeLayout;
        this.f25144d = viewPager;
    }

    @Deprecated
    public static ModgameCloudArchiveFragmentBinding b(@NonNull View view, @Nullable Object obj) {
        return (ModgameCloudArchiveFragmentBinding) ViewDataBinding.bind(obj, view, R.layout.modgame_cloud_archive_fragment);
    }

    public static ModgameCloudArchiveFragmentBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModgameCloudArchiveFragmentBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModgameCloudArchiveFragmentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modgame_cloud_archive_fragment, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModgameCloudArchiveFragmentBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModgameCloudArchiveFragmentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modgame_cloud_archive_fragment, null, false, obj);
    }

    @NonNull
    public static ModgameCloudArchiveFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public MyPagerAdapter c() {
        return this.f25146f;
    }

    @Nullable
    public ModGameCloudViewModle d() {
        return this.f25145e;
    }

    public abstract void g(@Nullable MyPagerAdapter myPagerAdapter);

    public abstract void h(@Nullable ModGameCloudViewModle modGameCloudViewModle);

    @NonNull
    public static ModgameCloudArchiveFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
