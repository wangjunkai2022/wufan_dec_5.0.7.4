package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.widget.CornersLinearLayout;
import com.join.kotlin.ui.modleregin.modle.MustplayItemBean;
import com.join.kotlin.ui.modleregin.modle.VideoModle;
import com.join.mgps.customview.DownloadViewStroke;
/* loaded from: classes3.dex */
public abstract class MustplayItemLayoutBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f25182b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25183c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final DownloadViewStroke f25184d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25185e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25186f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25187g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final CornersLinearLayout f25188h;
    @Bindable

    /* renamed from: i  reason: collision with root package name */
    protected c f25189i;
    @Bindable

    /* renamed from: j  reason: collision with root package name */
    protected MustplayItemBean f25190j;
    @Bindable

    /* renamed from: k  reason: collision with root package name */
    protected VideoModle f25191k;

    /* JADX INFO: Access modifiers changed from: protected */
    public MustplayItemLayoutBinding(Object obj, View view, int i4, TextView textView, TextView textView2, DownloadViewStroke downloadViewStroke, TextView textView3, TextView textView4, LinearLayout linearLayout, CornersLinearLayout cornersLinearLayout) {
        super(obj, view, i4);
        this.f25182b = textView;
        this.f25183c = textView2;
        this.f25184d = downloadViewStroke;
        this.f25185e = textView3;
        this.f25186f = textView4;
        this.f25187g = linearLayout;
        this.f25188h = cornersLinearLayout;
    }

    @Deprecated
    public static MustplayItemLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (MustplayItemLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.mustplay_item_layout);
    }

    public static MustplayItemLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static MustplayItemLayoutBinding f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (MustplayItemLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mustplay_item_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static MustplayItemLayoutBinding g(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (MustplayItemLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mustplay_item_layout, null, false, obj);
    }

    @NonNull
    public static MustplayItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return f(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public MustplayItemBean c() {
        return this.f25190j;
    }

    @Nullable
    public VideoModle d() {
        return this.f25191k;
    }

    @Nullable
    public c e() {
        return this.f25189i;
    }

    public abstract void h(@Nullable MustplayItemBean mustplayItemBean);

    public abstract void i(@Nullable VideoModle videoModle);

    public abstract void j(@Nullable c cVar);

    @NonNull
    public static MustplayItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return g(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
