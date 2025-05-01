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
import com.join.kotlin.discount.model.bean.GameServerInfoBean;
import com.join.kotlin.discount.proxy.GameDetailServerBookDialogClickProxy;
/* loaded from: classes3.dex */
public abstract class ItemDiscountGameDetailServerListBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final View f21957b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected GameServerInfoBean f21958c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected GameDetailServerBookDialogClickProxy f21959d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemDiscountGameDetailServerListBinding(Object obj, View view, int i4, View view2) {
        super(obj, view, i4);
        this.f21957b = view2;
    }

    @Deprecated
    public static ItemDiscountGameDetailServerListBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemDiscountGameDetailServerListBinding) ViewDataBinding.bind(obj, view, R.layout.item_discount_game_detail_server_list);
    }

    public static ItemDiscountGameDetailServerListBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailServerListBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemDiscountGameDetailServerListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_server_list, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemDiscountGameDetailServerListBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemDiscountGameDetailServerListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_discount_game_detail_server_list, null, false, obj);
    }

    @NonNull
    public static ItemDiscountGameDetailServerListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public GameDetailServerBookDialogClickProxy c() {
        return this.f21959d;
    }

    @Nullable
    public GameServerInfoBean d() {
        return this.f21958c;
    }

    public abstract void g(@Nullable GameDetailServerBookDialogClickProxy gameDetailServerBookDialogClickProxy);

    public abstract void h(@Nullable GameServerInfoBean gameServerInfoBean);

    @NonNull
    public static ItemDiscountGameDetailServerListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
