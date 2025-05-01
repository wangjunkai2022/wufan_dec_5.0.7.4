package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.quark.proxy.UploadSourceHopeClickProxy;
import com.join.kotlin.quark.viewmodel.UploadSourceHopeViewModel;
/* loaded from: classes3.dex */
public abstract class ActivityUploadSourceHopeBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f17196b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final EditText f17197c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f17198d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f17199e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final NestedScrollView f17200f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f17201g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17202h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17203i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f17204j;
    @Bindable

    /* renamed from: k  reason: collision with root package name */
    protected UploadSourceHopeViewModel f17205k;
    @Bindable

    /* renamed from: l  reason: collision with root package name */
    protected UploadSourceHopeClickProxy f17206l;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityUploadSourceHopeBinding(Object obj, View view, int i4, ImageView imageView, EditText editText, EditText editText2, ImageView imageView2, NestedScrollView nestedScrollView, RecyclerView recyclerView, TextView textView, TextView textView2, LinearLayout linearLayout) {
        super(obj, view, i4);
        this.f17196b = imageView;
        this.f17197c = editText;
        this.f17198d = editText2;
        this.f17199e = imageView2;
        this.f17200f = nestedScrollView;
        this.f17201g = recyclerView;
        this.f17202h = textView;
        this.f17203i = textView2;
        this.f17204j = linearLayout;
    }

    @Deprecated
    public static ActivityUploadSourceHopeBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityUploadSourceHopeBinding) ViewDataBinding.bind(obj, view, R.layout.activity_upload_source_hope);
    }

    public static ActivityUploadSourceHopeBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityUploadSourceHopeBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityUploadSourceHopeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_upload_source_hope, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityUploadSourceHopeBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityUploadSourceHopeBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_upload_source_hope, null, false, obj);
    }

    @NonNull
    public static ActivityUploadSourceHopeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public UploadSourceHopeClickProxy c() {
        return this.f17206l;
    }

    @Nullable
    public UploadSourceHopeViewModel d() {
        return this.f17205k;
    }

    public abstract void g(@Nullable UploadSourceHopeClickProxy uploadSourceHopeClickProxy);

    public abstract void h(@Nullable UploadSourceHopeViewModel uploadSourceHopeViewModel);

    @NonNull
    public static ActivityUploadSourceHopeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
