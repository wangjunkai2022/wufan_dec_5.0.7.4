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
public abstract class ModNoticeArchiveDialogBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f24933b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f24934c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24935d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected DelArchiveDialogViewModle f24936e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected View.OnClickListener f24937f;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModNoticeArchiveDialogBinding(Object obj, View view, int i4, ImageView imageView, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i4);
        this.f24933b = imageView;
        this.f24934c = linearLayout;
        this.f24935d = textView;
    }

    @Deprecated
    public static ModNoticeArchiveDialogBinding b(@NonNull View view, @Nullable Object obj) {
        return (ModNoticeArchiveDialogBinding) ViewDataBinding.bind(obj, view, R.layout.mod_notice_archive_dialog);
    }

    public static ModNoticeArchiveDialogBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModNoticeArchiveDialogBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModNoticeArchiveDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_notice_archive_dialog, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModNoticeArchiveDialogBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModNoticeArchiveDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_notice_archive_dialog, null, false, obj);
    }

    @NonNull
    public static ModNoticeArchiveDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener c() {
        return this.f24937f;
    }

    @Nullable
    public DelArchiveDialogViewModle d() {
        return this.f24936e;
    }

    public abstract void g(@Nullable View.OnClickListener onClickListener);

    public abstract void h(@Nullable DelArchiveDialogViewModle delArchiveDialogViewModle);

    @NonNull
    public static ModNoticeArchiveDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
