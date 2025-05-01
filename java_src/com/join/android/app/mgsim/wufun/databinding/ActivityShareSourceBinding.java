package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.quark.proxy.ShareSourceClickProxy;
import com.join.kotlin.quark.viewmodel.ShareSourceViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityShareSourceBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final EditText f16975b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16976c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16977d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16978e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16979f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f16980g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected ShareSourceViewModel f16981h;
    @Bindable

    /* renamed from: i  reason: collision with root package name */
    protected ShareSourceClickProxy f16982i;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityShareSourceBinding(Object obj, View view, int i4, EditText editText, ImageView imageView, TextView textView, TextView textView2, TextView textView3, View view2) {
        super(obj, view, i4);
        this.f16975b = editText;
        this.f16976c = imageView;
        this.f16977d = textView;
        this.f16978e = textView2;
        this.f16979f = textView3;
        this.f16980g = view2;
    }

    @Deprecated
    public static ActivityShareSourceBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityShareSourceBinding) ViewDataBinding.bind(obj, view, R.layout.activity_share_source);
    }

    public static ActivityShareSourceBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityShareSourceBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityShareSourceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_share_source, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityShareSourceBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityShareSourceBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_share_source, null, false, obj);
    }

    @NonNull
    public static ActivityShareSourceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ShareSourceClickProxy c() {
        return this.f16982i;
    }

    @Nullable
    public ShareSourceViewModel d() {
        return this.f16981h;
    }

    public abstract void g(@Nullable ShareSourceClickProxy shareSourceClickProxy);

    public abstract void h(@Nullable ShareSourceViewModel shareSourceViewModel);

    @NonNull
    public static ActivityShareSourceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
