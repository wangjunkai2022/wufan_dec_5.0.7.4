package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.DelArchiveDialogViewModle;
/* loaded from: classes3.dex */
public abstract class ModRedownArchiveDialogBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f24947b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24948c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24949d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24950e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24951f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f24952g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected DelArchiveDialogViewModle f24953h;
    @Bindable

    /* renamed from: i  reason: collision with root package name */
    protected View.OnClickListener f24954i;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModRedownArchiveDialogBinding(Object obj, View view, int i4, TextView textView, ImageView imageView, LinearLayout linearLayout, TextView textView2, TextView textView3, ImageView imageView2) {
        super(obj, view, i4);
        this.f24947b = textView;
        this.f24948c = imageView;
        this.f24949d = linearLayout;
        this.f24950e = textView2;
        this.f24951f = textView3;
        this.f24952g = imageView2;
    }

    @Deprecated
    public static ModRedownArchiveDialogBinding b(@NonNull View view, @Nullable Object obj) {
        return (ModRedownArchiveDialogBinding) ViewDataBinding.bind(obj, view, R.layout.mod_redown_archive_dialog);
    }

    public static ModRedownArchiveDialogBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModRedownArchiveDialogBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModRedownArchiveDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_redown_archive_dialog, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModRedownArchiveDialogBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModRedownArchiveDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_redown_archive_dialog, null, false, obj);
    }

    @NonNull
    public static ModRedownArchiveDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener c() {
        return this.f24954i;
    }

    @Nullable
    public DelArchiveDialogViewModle d() {
        return this.f24953h;
    }

    public abstract void g(@Nullable View.OnClickListener onClickListener);

    public abstract void h(@Nullable DelArchiveDialogViewModle delArchiveDialogViewModle);

    @NonNull
    public static ModRedownArchiveDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
