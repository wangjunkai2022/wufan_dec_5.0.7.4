package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.BtReginSlidinTablayout;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class BtViewpagerLayoutBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final BtReginSlidinTablayout f17655b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ViewPager f17656c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected FragmentManager f17657d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected List<String> f17658e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected List<Fragment> f17659f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected ViewPager f17660g;

    /* JADX INFO: Access modifiers changed from: protected */
    public BtViewpagerLayoutBinding(Object obj, View view, int i4, BtReginSlidinTablayout btReginSlidinTablayout, ViewPager viewPager) {
        super(obj, view, i4);
        this.f17655b = btReginSlidinTablayout;
        this.f17656c = viewPager;
    }

    @Deprecated
    public static BtViewpagerLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (BtViewpagerLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.bt_viewpager_layout);
    }

    public static BtViewpagerLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static BtViewpagerLayoutBinding g(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (BtViewpagerLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_viewpager_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static BtViewpagerLayoutBinding h(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (BtViewpagerLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_viewpager_layout, null, false, obj);
    }

    @NonNull
    public static BtViewpagerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return g(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public FragmentManager c() {
        return this.f17657d;
    }

    @Nullable
    public List<Fragment> d() {
        return this.f17659f;
    }

    @Nullable
    public List<String> e() {
        return this.f17658e;
    }

    @Nullable
    public ViewPager f() {
        return this.f17660g;
    }

    public abstract void i(@Nullable FragmentManager fragmentManager);

    public abstract void j(@Nullable List<Fragment> list);

    public abstract void k(@Nullable List<String> list);

    public abstract void l(@Nullable ViewPager viewPager);

    @NonNull
    public static BtViewpagerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return h(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
