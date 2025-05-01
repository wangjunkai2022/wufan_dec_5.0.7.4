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
public abstract class NoticeWhiteDialogBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f25538b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25539c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25540d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected DelArchiveDialogViewModle f25541e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected View.OnClickListener f25542f;

    /* JADX INFO: Access modifiers changed from: protected */
    public NoticeWhiteDialogBinding(Object obj, View view, int i4, ImageView imageView, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i4);
        this.f25538b = imageView;
        this.f25539c = linearLayout;
        this.f25540d = textView;
    }

    @Deprecated
    public static NoticeWhiteDialogBinding b(@NonNull View view, @Nullable Object obj) {
        return (NoticeWhiteDialogBinding) ViewDataBinding.bind(obj, view, R.layout.notice_white_dialog);
    }

    public static NoticeWhiteDialogBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static NoticeWhiteDialogBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (NoticeWhiteDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.notice_white_dialog, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static NoticeWhiteDialogBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (NoticeWhiteDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.notice_white_dialog, null, false, obj);
    }

    @NonNull
    public static NoticeWhiteDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener c() {
        return this.f25542f;
    }

    @Nullable
    public DelArchiveDialogViewModle d() {
        return this.f25541e;
    }

    public abstract void g(@Nullable View.OnClickListener onClickListener);

    public abstract void h(@Nullable DelArchiveDialogViewModle delArchiveDialogViewModle);

    @NonNull
    public static NoticeWhiteDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
