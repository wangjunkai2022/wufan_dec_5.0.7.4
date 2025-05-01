package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.dialog.ImageDialogViewmodle;
/* loaded from: classes3.dex */
public abstract class ImageShowDialogBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f21497b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f21498c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f21499d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f21500e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f21501f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final FrameLayout f21502g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected ImageDialogViewmodle f21503h;
    @Bindable

    /* renamed from: i  reason: collision with root package name */
    protected View.OnClickListener f21504i;

    /* JADX INFO: Access modifiers changed from: protected */
    public ImageShowDialogBinding(Object obj, View view, int i4, ImageView imageView, ImageView imageView2, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, LinearLayout linearLayout, FrameLayout frameLayout) {
        super(obj, view, i4);
        this.f21497b = imageView;
        this.f21498c = imageView2;
        this.f21499d = simpleDraweeView;
        this.f21500e = simpleDraweeView2;
        this.f21501f = linearLayout;
        this.f21502g = frameLayout;
    }

    @Deprecated
    public static ImageShowDialogBinding b(@NonNull View view, @Nullable Object obj) {
        return (ImageShowDialogBinding) ViewDataBinding.bind(obj, view, R.layout.image_show_dialog);
    }

    public static ImageShowDialogBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ImageShowDialogBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ImageShowDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.image_show_dialog, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ImageShowDialogBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ImageShowDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.image_show_dialog, null, false, obj);
    }

    @NonNull
    public static ImageShowDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public View.OnClickListener c() {
        return this.f21504i;
    }

    @Nullable
    public ImageDialogViewmodle d() {
        return this.f21503h;
    }

    public abstract void g(@Nullable View.OnClickListener onClickListener);

    public abstract void h(@Nullable ImageDialogViewmodle imageDialogViewmodle);

    @NonNull
    public static ImageShowDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
