package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.DelArchiveDialogViewModle;
/* loaded from: classes3.dex */
public abstract class ModCommentlArchiveDialogBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f24898b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24899c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f24900d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f24901e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ConstraintLayout f24902f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ConstraintLayout f24903g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ConstraintLayout f24904h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24905i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f24906j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ConstraintLayout f24907k;
    @Bindable

    /* renamed from: l  reason: collision with root package name */
    protected DelArchiveDialogViewModle f24908l;
    @Bindable

    /* renamed from: m  reason: collision with root package name */
    protected View.OnClickListener f24909m;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModCommentlArchiveDialogBinding(Object obj, View view, int i4, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView, TextView textView2, ConstraintLayout constraintLayout4) {
        super(obj, view, i4);
        this.f24898b = imageView;
        this.f24899c = imageView2;
        this.f24900d = imageView3;
        this.f24901e = imageView4;
        this.f24902f = constraintLayout;
        this.f24903g = constraintLayout2;
        this.f24904h = constraintLayout3;
        this.f24905i = textView;
        this.f24906j = textView2;
        this.f24907k = constraintLayout4;
    }

    @Deprecated
    public static ModCommentlArchiveDialogBinding b(@NonNull View view, @Nullable Object obj) {
        return (ModCommentlArchiveDialogBinding) ViewDataBinding.bind(obj, view, R.layout.mod_commentl_archive_dialog);
    }

    public static ModCommentlArchiveDialogBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModCommentlArchiveDialogBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModCommentlArchiveDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_commentl_archive_dialog, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModCommentlArchiveDialogBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModCommentlArchiveDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_commentl_archive_dialog, null, false, obj);
    }

    @NonNull
    public static ModCommentlArchiveDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener c() {
        return this.f24909m;
    }

    @Nullable
    public DelArchiveDialogViewModle d() {
        return this.f24908l;
    }

    public abstract void g(@Nullable View.OnClickListener onClickListener);

    public abstract void h(@Nullable DelArchiveDialogViewModle delArchiveDialogViewModle);

    @NonNull
    public static ModCommentlArchiveDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
