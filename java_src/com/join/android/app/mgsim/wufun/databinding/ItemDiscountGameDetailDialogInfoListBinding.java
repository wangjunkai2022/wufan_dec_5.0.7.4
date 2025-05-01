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
import com.join.kotlin.discount.model.bean.GameDetailDialogInfoBean;
/* loaded from: classes3.dex */
public abstract class ItemDiscountGameDetailDialogInfoListBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f21941b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected GameDetailDialogInfoBean f21942c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemDiscountGameDetailDialogInfoListBinding(Object obj, View view, int i4, TextView textView) {
        super(obj, view, i4);
        this.f21941b = textView;
    }

    @Deprecated
    public static ItemDiscountGameDetailDialogInfoListBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemDiscountGameDetailDialogInfoListBinding) ViewDataBinding.bind(obj, view, R.layout.item_discount_game_detail_dialog_info_list);
    }

    public static ItemDiscountGameDetailDialogInfoListBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailDialogInfoListBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemDiscountGameDetailDialogInfoListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_dialog_info_list, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailDialogInfoListBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemDiscountGameDetailDialogInfoListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_dialog_info_list, null, false, obj);
    }

    @NonNull
    public static ItemDiscountGameDetailDialogInfoListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailDialogInfoBean c() {
        return this.f21942c;
    }

    public abstract void f(@Nullable GameDetailDialogInfoBean gameDetailDialogInfoBean);

    @NonNull
    public static ItemDiscountGameDetailDialogInfoListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
