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
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.base.widget.recycleview.XQuickRecyclerView;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.ui.notice.ClickProxy;
import com.join.kotlin.zone.viewmodel.CommonZoneViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityCommonZoneBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f15809b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f15810c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XQuickRecyclerView f15811d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected CommonZoneViewModel f15812e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected ClickProxy f15813f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected LoadBindClickProxy f15814g;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityCommonZoneBinding(Object obj, View view, int i4, ImageView imageView, TextView textView, XQuickRecyclerView xQuickRecyclerView) {
        super(obj, view, i4);
        this.f15809b = imageView;
        this.f15810c = textView;
        this.f15811d = xQuickRecyclerView;
    }

    @Deprecated
    public static ActivityCommonZoneBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityCommonZoneBinding) ViewDataBinding.bind(obj, view, R.layout.activity_common_zone);
    }

    public static ActivityCommonZoneBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityCommonZoneBinding f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityCommonZoneBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_common_zone, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityCommonZoneBinding g(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityCommonZoneBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_common_zone, null, false, obj);
    }

    @NonNull
    public static ActivityCommonZoneBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return f(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ClickProxy c() {
        return this.f15813f;
    }

    @Nullable
    public LoadBindClickProxy d() {
        return this.f15814g;
    }

    @Nullable
    public CommonZoneViewModel e() {
        return this.f15812e;
    }

    public abstract void h(@Nullable ClickProxy clickProxy);

    public abstract void i(@Nullable LoadBindClickProxy loadBindClickProxy);

    public abstract void j(@Nullable CommonZoneViewModel commonZoneViewModel);

    @NonNull
    public static ActivityCommonZoneBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return g(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
