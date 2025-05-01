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
public abstract class ModDelArchiveDialogBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f24918b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24919c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24920d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24921e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected DelArchiveDialogViewModle f24922f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected View.OnClickListener f24923g;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModDelArchiveDialogBinding(Object obj, View view, int i4, TextView textView, ImageView imageView, LinearLayout linearLayout, TextView textView2) {
        super(obj, view, i4);
        this.f24918b = textView;
        this.f24919c = imageView;
        this.f24920d = linearLayout;
        this.f24921e = textView2;
    }

    @Deprecated
    public static ModDelArchiveDialogBinding b(@NonNull View view, @Nullable Object obj) {
        return (ModDelArchiveDialogBinding) ViewDataBinding.bind(obj, view, R.layout.mod_del_archive_dialog);
    }

    public static ModDelArchiveDialogBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModDelArchiveDialogBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModDelArchiveDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_del_archive_dialog, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModDelArchiveDialogBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModDelArchiveDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_del_archive_dialog, null, false, obj);
    }

    @NonNull
    public static ModDelArchiveDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener c() {
        return this.f24923g;
    }

    @Nullable
    public DelArchiveDialogViewModle d() {
        return this.f24922f;
    }

    public abstract void g(@Nullable View.OnClickListener onClickListener);

    public abstract void h(@Nullable DelArchiveDialogViewModle delArchiveDialogViewModle);

    @NonNull
    public static ModDelArchiveDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
