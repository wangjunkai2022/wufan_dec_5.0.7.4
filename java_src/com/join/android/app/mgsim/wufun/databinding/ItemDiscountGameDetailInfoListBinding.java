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
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.discount.model.bean.GameDetailInfoItemBean;
/* loaded from: classes3.dex */
public abstract class ItemDiscountGameDetailInfoListBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f21948b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21949c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected GameDetailInfoItemBean f21950d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemDiscountGameDetailInfoListBinding(Object obj, View view, int i4, ImageView imageView, TextView textView) {
        super(obj, view, i4);
        this.f21948b = imageView;
        this.f21949c = textView;
    }

    @Deprecated
    public static ItemDiscountGameDetailInfoListBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemDiscountGameDetailInfoListBinding) ViewDataBinding.bind(obj, view, R.layout.item_discount_game_detail_info_list);
    }

    public static ItemDiscountGameDetailInfoListBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailInfoListBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemDiscountGameDetailInfoListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_info_list, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailInfoListBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemDiscountGameDetailInfoListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_info_list, null, false, obj);
    }

    @NonNull
    public static ItemDiscountGameDetailInfoListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailInfoItemBean c() {
        return this.f21950d;
    }

    public abstract void f(@Nullable GameDetailInfoItemBean gameDetailInfoItemBean);

    @NonNull
    public static ItemDiscountGameDetailInfoListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
