package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.quark.proxy.QuarkInstallClickProxy;
import com.join.kotlin.quark.viewmodel.QuarkInstallViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityQuarkInstallBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f16858b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f16859c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16860d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16861e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16862f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected QuarkInstallViewModel f16863g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected QuarkInstallClickProxy f16864h;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityQuarkInstallBinding(Object obj, View view, int i4, ImageView imageView, ProgressBar progressBar, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i4);
        this.f16858b = imageView;
        this.f16859c = progressBar;
        this.f16860d = textView;
        this.f16861e = textView2;
        this.f16862f = textView3;
    }

    @Deprecated
    public static ActivityQuarkInstallBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityQuarkInstallBinding) ViewDataBinding.bind(obj, view, R.layout.activity_quark_install);
    }

    public static ActivityQuarkInstallBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityQuarkInstallBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityQuarkInstallBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_quark_install, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityQuarkInstallBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityQuarkInstallBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_quark_install, null, false, obj);
    }

    @NonNull
    public static ActivityQuarkInstallBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public QuarkInstallClickProxy c() {
        return this.f16864h;
    }

    @Nullable
    public QuarkInstallViewModel d() {
        return this.f16863g;
    }

    public abstract void g(@Nullable QuarkInstallClickProxy quarkInstallClickProxy);

    public abstract void h(@Nullable QuarkInstallViewModel quarkInstallViewModel);

    @NonNull
    public static ActivityQuarkInstallBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
