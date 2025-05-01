package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.quark.proxy.SourceSaveClickProxy;
import com.join.kotlin.quark.viewmodel.SourceSaveViewModel;
/* loaded from: classes3.dex */
public abstract class ActivitySourceSaveBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f17020b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f17021c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f17022d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17023e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17024f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f17025g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17026h;
    @Bindable

    /* renamed from: i  reason: collision with root package name */
    protected SourceSaveViewModel f17027i;
    @Bindable

    /* renamed from: j  reason: collision with root package name */
    protected SourceSaveClickProxy f17028j;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivitySourceSaveBinding(Object obj, View view, int i4, ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i4);
        this.f17020b = constraintLayout;
        this.f17021c = simpleDraweeView;
        this.f17022d = simpleDraweeView2;
        this.f17023e = textView;
        this.f17024f = textView2;
        this.f17025g = textView3;
        this.f17026h = textView4;
    }

    @Deprecated
    public static ActivitySourceSaveBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivitySourceSaveBinding) ViewDataBinding.bind(obj, view, R.layout.activity_source_save);
    }

    public static ActivitySourceSaveBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivitySourceSaveBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivitySourceSaveBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_source_save, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivitySourceSaveBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivitySourceSaveBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_source_save, null, false, obj);
    }

    @NonNull
    public static ActivitySourceSaveBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SourceSaveClickProxy c() {
        return this.f17028j;
    }

    @Nullable
    public SourceSaveViewModel d() {
        return this.f17027i;
    }

    public abstract void g(@Nullable SourceSaveClickProxy sourceSaveClickProxy);

    public abstract void h(@Nullable SourceSaveViewModel sourceSaveViewModel);

    @NonNull
    public static ActivitySourceSaveBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
