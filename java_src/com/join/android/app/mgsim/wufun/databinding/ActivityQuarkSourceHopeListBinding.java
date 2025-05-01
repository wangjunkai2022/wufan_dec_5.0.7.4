package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.quark.proxy.SourceHopeClickProxy;
import com.join.kotlin.quark.viewmodel.SourceHopeViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityQuarkSourceHopeListBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f16905b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TabLayout f16906c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16907d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16908e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ViewPager f16909f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected SourceHopeViewModel f16910g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected SourceHopeClickProxy f16911h;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityQuarkSourceHopeListBinding(Object obj, View view, int i4, ImageView imageView, TabLayout tabLayout, TextView textView, TextView textView2, ViewPager viewPager) {
        super(obj, view, i4);
        this.f16905b = imageView;
        this.f16906c = tabLayout;
        this.f16907d = textView;
        this.f16908e = textView2;
        this.f16909f = viewPager;
    }

    @Deprecated
    public static ActivityQuarkSourceHopeListBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityQuarkSourceHopeListBinding) ViewDataBinding.bind(obj, view, R.layout.activity_quark_source_hope_list);
    }

    public static ActivityQuarkSourceHopeListBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityQuarkSourceHopeListBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityQuarkSourceHopeListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_quark_source_hope_list, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityQuarkSourceHopeListBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityQuarkSourceHopeListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_quark_source_hope_list, null, false, obj);
    }

    @NonNull
    public static ActivityQuarkSourceHopeListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SourceHopeClickProxy c() {
        return this.f16911h;
    }

    @Nullable
    public SourceHopeViewModel d() {
        return this.f16910g;
    }

    public abstract void g(@Nullable SourceHopeClickProxy sourceHopeClickProxy);

    public abstract void h(@Nullable SourceHopeViewModel sourceHopeViewModel);

    @NonNull
    public static ActivityQuarkSourceHopeListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
