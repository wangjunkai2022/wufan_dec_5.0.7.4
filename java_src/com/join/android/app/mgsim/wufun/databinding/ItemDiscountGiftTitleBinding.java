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
/* loaded from: classes3.dex */
public abstract class ItemDiscountGiftTitleBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f21985b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected String f21986c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemDiscountGiftTitleBinding(Object obj, View view, int i4, TextView textView) {
        super(obj, view, i4);
        this.f21985b = textView;
    }

    @Deprecated
    public static ItemDiscountGiftTitleBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemDiscountGiftTitleBinding) ViewDataBinding.bind(obj, view, R.layout.item_discount_gift_title);
    }

    public static ItemDiscountGiftTitleBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGiftTitleBinding c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemDiscountGiftTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_gift_title, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGiftTitleBinding d(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemDiscountGiftTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_gift_title, null, false, obj);
    }

    @NonNull
    public static ItemDiscountGiftTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return c(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    public abstract void e(@Nullable String str);

    @Nullable
    public String getTitle() {
        return this.f21986c;
    }

    @NonNull
    public static ItemDiscountGiftTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
