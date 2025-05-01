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
import com.join.kotlin.ui.account.viewmodle.UnbindViewModle;
import com.join.kotlin.ui.notice.ClickProxy;
/* loaded from: classes3.dex */
public abstract class UnbindThridpartActivityBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f26797b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26798c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26799d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected ClickProxy f26800e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected UnbindViewModle f26801f;

    /* JADX INFO: Access modifiers changed from: protected */
    public UnbindThridpartActivityBinding(Object obj, View view, int i4, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i4);
        this.f26797b = imageView;
        this.f26798c = textView;
        this.f26799d = textView2;
    }

    @Deprecated
    public static UnbindThridpartActivityBinding b(@NonNull View view, @Nullable Object obj) {
        return (UnbindThridpartActivityBinding) ViewDataBinding.bind(obj, view, R.layout.unbind_thridpart_activity);
    }

    public static UnbindThridpartActivityBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static UnbindThridpartActivityBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (UnbindThridpartActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.unbind_thridpart_activity, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static UnbindThridpartActivityBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (UnbindThridpartActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.unbind_thridpart_activity, null, false, obj);
    }

    @NonNull
    public static UnbindThridpartActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ClickProxy c() {
        return this.f26800e;
    }

    @Nullable
    public UnbindViewModle d() {
        return this.f26801f;
    }

    public abstract void g(@Nullable ClickProxy clickProxy);

    public abstract void h(@Nullable UnbindViewModle unbindViewModle);

    @NonNull
    public static UnbindThridpartActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
