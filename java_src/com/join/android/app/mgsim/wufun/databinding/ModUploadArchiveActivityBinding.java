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
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.textfield.TextInputEditText;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.ModUploadArchiveViewModle;
/* loaded from: classes3.dex */
public abstract class ModUploadArchiveActivityBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f24972b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24973c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f24974d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f24975e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextInputEditText f24976f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24977g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f24978h;
    @Bindable

    /* renamed from: i  reason: collision with root package name */
    protected ModUploadArchiveViewModle f24979i;
    @Bindable

    /* renamed from: j  reason: collision with root package name */
    protected View.OnClickListener f24980j;
    @Bindable

    /* renamed from: k  reason: collision with root package name */
    protected TextViewBindingAdapter.OnTextChanged f24981k;
    @Bindable

    /* renamed from: l  reason: collision with root package name */
    protected TextViewBindingAdapter.BeforeTextChanged f24982l;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModUploadArchiveActivityBinding(Object obj, View view, int i4, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, TextInputEditText textInputEditText, TextView textView, SimpleDraweeView simpleDraweeView) {
        super(obj, view, i4);
        this.f24972b = linearLayout;
        this.f24973c = imageView;
        this.f24974d = imageView2;
        this.f24975e = imageView3;
        this.f24976f = textInputEditText;
        this.f24977g = textView;
        this.f24978h = simpleDraweeView;
    }

    @Deprecated
    public static ModUploadArchiveActivityBinding b(@NonNull View view, @Nullable Object obj) {
        return (ModUploadArchiveActivityBinding) ViewDataBinding.bind(obj, view, R.layout.mod_upload_archive_activity);
    }

    public static ModUploadArchiveActivityBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModUploadArchiveActivityBinding g(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModUploadArchiveActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_upload_archive_activity, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModUploadArchiveActivityBinding h(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModUploadArchiveActivityBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_upload_archive_activity, null, false, obj);
    }

    @NonNull
    public static ModUploadArchiveActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return g(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public TextViewBindingAdapter.OnTextChanged c() {
        return this.f24981k;
    }

    @Nullable
    public TextViewBindingAdapter.BeforeTextChanged d() {
        return this.f24982l;
    }

    @Nullable
    public View.OnClickListener e() {
        return this.f24980j;
    }

    @Nullable
    public ModUploadArchiveViewModle f() {
        return this.f24979i;
    }

    public abstract void i(@Nullable TextViewBindingAdapter.OnTextChanged onTextChanged);

    public abstract void j(@Nullable TextViewBindingAdapter.BeforeTextChanged beforeTextChanged);

    public abstract void k(@Nullable View.OnClickListener onClickListener);

    public abstract void l(@Nullable ModUploadArchiveViewModle modUploadArchiveViewModle);

    @NonNull
    public static ModUploadArchiveActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return h(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
