package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.model.bean.CommentDetailBean;
import com.join.kotlin.discount.proxy.ItemGameDetailCommentListClickProxy;
import com.join.mgps.customview.CollapsedTextView;
/* loaded from: classes3.dex */
public abstract class ItemGameDetailCommentLayoutBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDraweeView f22213b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CollapsedTextView f22214c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f22215d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22216e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f22217f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f22218g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f22219h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22220i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22221j;
    @Bindable

    /* renamed from: k  reason: collision with root package name */
    protected CommentDetailBean f22222k;
    @Bindable

    /* renamed from: l  reason: collision with root package name */
    protected ItemGameDetailCommentListClickProxy f22223l;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemGameDetailCommentLayoutBinding(Object obj, View view, int i4, SimpleDraweeView simpleDraweeView, CollapsedTextView collapsedTextView, View view2, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView2, TextView textView3) {
        super(obj, view, i4);
        this.f22213b = simpleDraweeView;
        this.f22214c = collapsedTextView;
        this.f22215d = view2;
        this.f22216e = textView;
        this.f22217f = imageView;
        this.f22218g = imageView2;
        this.f22219h = imageView3;
        this.f22220i = textView2;
        this.f22221j = textView3;
    }

    @Deprecated
    public static ItemGameDetailCommentLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemGameDetailCommentLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.item_game_detail_comment_layout);
    }

    public static ItemGameDetailCommentLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemGameDetailCommentLayoutBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemGameDetailCommentLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_game_detail_comment_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemGameDetailCommentLayoutBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemGameDetailCommentLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_game_detail_comment_layout, null, false, obj);
    }

    @NonNull
    public static ItemGameDetailCommentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ItemGameDetailCommentListClickProxy c() {
        return this.f22223l;
    }

    @Nullable
    public CommentDetailBean d() {
        return this.f22222k;
    }

    public abstract void g(@Nullable ItemGameDetailCommentListClickProxy itemGameDetailCommentListClickProxy);

    public abstract void h(@Nullable CommentDetailBean commentDetailBean);

    @NonNull
    public static ItemGameDetailCommentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
