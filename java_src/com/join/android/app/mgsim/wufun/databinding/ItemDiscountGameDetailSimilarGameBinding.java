package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.dto.CollectionBeanSub;
/* loaded from: classes3.dex */
public abstract class ItemDiscountGameDetailSimilarGameBinding extends ViewDataBinding {
    @Bindable

    /* renamed from: b  reason: collision with root package name */
    protected CollectionBeanSub f21966b;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemDiscountGameDetailSimilarGameBinding(Object obj, View view, int i4) {
        super(obj, view, i4);
    }

    @Deprecated
    public static ItemDiscountGameDetailSimilarGameBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemDiscountGameDetailSimilarGameBinding) ViewDataBinding.bind(obj, view, R.layout.item_discount_game_detail_similar_game);
    }

    public static ItemDiscountGameDetailSimilarGameBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailSimilarGameBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemDiscountGameDetailSimilarGameBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_similar_game, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailSimilarGameBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemDiscountGameDetailSimilarGameBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_similar_game, null, false, obj);
    }

    @NonNull
    public static ItemDiscountGameDetailSimilarGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CollectionBeanSub c() {
        return this.f21966b;
    }

    public abstract void f(@Nullable CollectionBeanSub collectionBeanSub);

    @NonNull
    public static ItemDiscountGameDetailSimilarGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
