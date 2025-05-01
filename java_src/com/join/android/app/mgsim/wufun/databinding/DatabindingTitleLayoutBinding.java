package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.modleregin.modle.TitleModle;
/* loaded from: classes3.dex */
public abstract class DatabindingTitleLayoutBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f18340b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18341c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18342d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected Boolean f18343e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected View.OnClickListener f18344f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected TitleModle f18345g;

    /* JADX INFO: Access modifiers changed from: protected */
    public DatabindingTitleLayoutBinding(Object obj, View view, int i4, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i4);
        this.f18340b = textView;
        this.f18341c = textView2;
        this.f18342d = textView3;
    }

    @Deprecated
    public static DatabindingTitleLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (DatabindingTitleLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.databinding_title_layout);
    }

    public static DatabindingTitleLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DatabindingTitleLayoutBinding f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (DatabindingTitleLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.databinding_title_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static DatabindingTitleLayoutBinding g(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DatabindingTitleLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.databinding_title_layout, null, false, obj);
    }

    @NonNull
    public static DatabindingTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return f(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener c() {
        return this.f18344f;
    }

    @Nullable
    public TitleModle d() {
        return this.f18345g;
    }

    @Nullable
    public Boolean e() {
        return this.f18343e;
    }

    public abstract void h(@Nullable View.OnClickListener onClickListener);

    public abstract void i(@Nullable TitleModle titleModle);

    public abstract void j(@Nullable Boolean bool);

    @NonNull
    public static DatabindingTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return g(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
