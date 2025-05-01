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
import com.join.kotlin.ui.modleregin.modle.BtGameListItem;
import com.join.mgps.customview.DownloadViewStroke;
/* loaded from: classes3.dex */
public abstract class BtListitemBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f17592b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final DownloadViewStroke f17593c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f17594d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17595e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17596f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f17597g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f17598h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17599i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ProgressBar f17600j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ProgressBar f17601k;
    @Bindable

    /* renamed from: l  reason: collision with root package name */
    protected BtGameListItem f17602l;
    @Bindable

    /* renamed from: m  reason: collision with root package name */
    protected AppListItemShowBean f17603m;

    /* JADX INFO: Access modifiers changed from: protected */
    public BtListitemBinding(Object obj, View view, int i4, TextView textView, DownloadViewStroke downloadViewStroke, SimpleDraweeView simpleDraweeView, TextView textView2, LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView3, ProgressBar progressBar, ProgressBar progressBar2) {
        super(obj, view, i4);
        this.f17592b = textView;
        this.f17593c = downloadViewStroke;
        this.f17594d = simpleDraweeView;
        this.f17595e = textView2;
        this.f17596f = linearLayout;
        this.f17597g = imageView;
        this.f17598h = linearLayout2;
        this.f17599i = textView3;
        this.f17600j = progressBar;
        this.f17601k = progressBar2;
    }

    @Deprecated
    public static BtListitemBinding b(@NonNull View view, @Nullable Object obj) {
        return (BtListitemBinding) ViewDataBinding.bind(obj, view, R.layout.bt_listitem);
    }

    public static BtListitemBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static BtListitemBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (BtListitemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_listitem, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static BtListitemBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (BtListitemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_listitem, null, false, obj);
    }

    @NonNull
    public static BtListitemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BtGameListItem c() {
        return this.f17602l;
    }

    @Nullable
    public AppListItemShowBean d() {
        return this.f17603m;
    }

    public abstract void g(@Nullable BtGameListItem btGameListItem);

    public abstract void h(@Nullable AppListItemShowBean appListItemShowBean);

    @NonNull
    public static BtListitemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
