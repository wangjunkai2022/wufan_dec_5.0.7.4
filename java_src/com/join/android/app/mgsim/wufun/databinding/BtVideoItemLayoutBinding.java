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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.component.video.c;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.widget.CornersLinearLayout;
import com.join.kotlin.ui.modleregin.modle.MustplayItemBean;
import com.join.kotlin.ui.modleregin.modle.VideoModle;
import com.join.mgps.customview.DownloadViewStroke;
/* loaded from: classes3.dex */
public abstract class BtVideoItemLayoutBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final DownloadViewStroke f17639b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17640c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f17641d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17642e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17643f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final CornersLinearLayout f17644g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected Boolean f17645h;
    @Bindable

    /* renamed from: i  reason: collision with root package name */
    protected c f17646i;
    @Bindable

    /* renamed from: j  reason: collision with root package name */
    protected MustplayItemBean f17647j;
    @Bindable

    /* renamed from: k  reason: collision with root package name */
    protected VideoModle f17648k;

    /* JADX INFO: Access modifiers changed from: protected */
    public BtVideoItemLayoutBinding(Object obj, View view, int i4, DownloadViewStroke downloadViewStroke, TextView textView, SimpleDraweeView simpleDraweeView, TextView textView2, LinearLayout linearLayout, CornersLinearLayout cornersLinearLayout) {
        super(obj, view, i4);
        this.f17639b = downloadViewStroke;
        this.f17640c = textView;
        this.f17641d = simpleDraweeView;
        this.f17642e = textView2;
        this.f17643f = linearLayout;
        this.f17644g = cornersLinearLayout;
    }

    @Deprecated
    public static BtVideoItemLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (BtVideoItemLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.bt_video_item_layout);
    }

    public static BtVideoItemLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static BtVideoItemLayoutBinding g(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (BtVideoItemLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_video_item_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static BtVideoItemLayoutBinding h(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (BtVideoItemLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.bt_video_item_layout, null, false, obj);
    }

    @NonNull
    public static BtVideoItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return g(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public MustplayItemBean c() {
        return this.f17647j;
    }

    @Nullable
    public Boolean d() {
        return this.f17645h;
    }

    @Nullable
    public VideoModle e() {
        return this.f17648k;
    }

    @Nullable
    public c f() {
        return this.f17646i;
    }

    public abstract void i(@Nullable MustplayItemBean mustplayItemBean);

    public abstract void j(@Nullable Boolean bool);

    public abstract void k(@Nullable VideoModle videoModle);

    public abstract void l(@Nullable c cVar);

    @NonNull
    public static BtVideoItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return h(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
