package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.model.bean.GiftItemBean;
import com.join.kotlin.discount.proxy.GameDetailGiftClickProxy;
/* loaded from: classes3.dex */
public abstract class ItemDiscountGiftContentBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f21973b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21974c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21975d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21976e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected GiftItemBean f21977f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected GameDetailGiftClickProxy f21978g;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemDiscountGiftContentBinding(Object obj, View view, int i4, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i4);
        this.f21973b = textView;
        this.f21974c = textView2;
        this.f21975d = textView3;
        this.f21976e = textView4;
    }

    @Deprecated
    public static ItemDiscountGiftContentBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemDiscountGiftContentBinding) ViewDataBinding.bind(obj, view, R.layout.item_discount_gift_content);
    }

    public static ItemDiscountGiftContentBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGiftContentBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemDiscountGiftContentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_gift_content, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGiftContentBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemDiscountGiftContentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_gift_content, null, false, obj);
    }

    @NonNull
    public static ItemDiscountGiftContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailGiftClickProxy c() {
        return this.f21978g;
    }

    @Nullable
    public GiftItemBean d() {
        return this.f21977f;
    }

    public abstract void g(@Nullable GameDetailGiftClickProxy gameDetailGiftClickProxy);

    public abstract void h(@Nullable GiftItemBean giftItemBean);

    @NonNull
    public static ItemDiscountGiftContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
