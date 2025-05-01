package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.modleregin.modle.VideoModle;
/* loaded from: classes3.dex */
public abstract class VideoDbsLayoutBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDraweeView f26896b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f26897c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f26898d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected c f26899e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected VideoModle f26900f;

    /* JADX INFO: Access modifiers changed from: protected */
    public VideoDbsLayoutBinding(Object obj, View view, int i4, SimpleDraweeView simpleDraweeView, SimpleDraweeView simpleDraweeView2, FrameLayout frameLayout) {
        super(obj, view, i4);
        this.f26896b = simpleDraweeView;
        this.f26897c = simpleDraweeView2;
        this.f26898d = frameLayout;
    }

    @Deprecated
    public static VideoDbsLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (VideoDbsLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.video_dbs_layout);
    }

    public static VideoDbsLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static VideoDbsLayoutBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (VideoDbsLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.video_dbs_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static VideoDbsLayoutBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (VideoDbsLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.video_dbs_layout, null, false, obj);
    }

    @NonNull
    public static VideoDbsLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public VideoModle c() {
        return this.f26900f;
    }

    @Nullable
    public c d() {
        return this.f26899e;
    }

    public abstract void g(@Nullable VideoModle videoModle);

    public abstract void h(@Nullable c cVar);

    @NonNull
    public static VideoDbsLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
