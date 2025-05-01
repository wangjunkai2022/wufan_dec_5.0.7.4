package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.common.AppListItemShowBean;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.customview.DownloadViewStroke;
/* loaded from: classes3.dex */
public abstract class UserRecomendListitemBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f26878b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final DownloadViewStroke f26879c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f26880d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26881e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26882f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26883g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26884h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26885i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ProgressBar f26886j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ProgressBar f26887k;
    @Bindable

    /* renamed from: l  reason: collision with root package name */
    protected CollectionBeanSubBusiness f26888l;
    @Bindable

    /* renamed from: m  reason: collision with root package name */
    protected AppListItemShowBean f26889m;

    /* JADX INFO: Access modifiers changed from: protected */
    public UserRecomendListitemBinding(Object obj, View view, int i4, TextView textView, DownloadViewStroke downloadViewStroke, SimpleDraweeView simpleDraweeView, TextView textView2, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView3, ProgressBar progressBar, ProgressBar progressBar2) {
        super(obj, view, i4);
        this.f26878b = textView;
        this.f26879c = downloadViewStroke;
        this.f26880d = simpleDraweeView;
        this.f26881e = textView2;
        this.f26882f = linearLayout;
        this.f26883g = imageView;
        this.f26884h = linearLayout2;
        this.f26885i = textView3;
        this.f26886j = progressBar;
        this.f26887k = progressBar2;
    }

    @Deprecated
    public static UserRecomendListitemBinding b(@NonNull View view, @Nullable Object obj) {
        return (UserRecomendListitemBinding) ViewDataBinding.bind(obj, view, R.layout.user_recomend_listitem);
    }

    public static UserRecomendListitemBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static UserRecomendListitemBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (UserRecomendListitemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.user_recomend_listitem, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static UserRecomendListitemBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (UserRecomendListitemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.user_recomend_listitem, null, false, obj);
    }

    @NonNull
    public static UserRecomendListitemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CollectionBeanSubBusiness c() {
        return this.f26888l;
    }

    @Nullable
    public AppListItemShowBean d() {
        return this.f26889m;
    }

    public abstract void g(@Nullable CollectionBeanSubBusiness collectionBeanSubBusiness);

    public abstract void h(@Nullable AppListItemShowBean appListItemShowBean);

    @NonNull
    public static UserRecomendListitemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
