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
public abstract class ItemCommonZoneTitleBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f21814b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected String f21815c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemCommonZoneTitleBinding(Object obj, View view, int i4, TextView textView) {
        super(obj, view, i4);
        this.f21814b = textView;
    }

    @Deprecated
    public static ItemCommonZoneTitleBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemCommonZoneTitleBinding) ViewDataBinding.bind(obj, view, R.layout.item_common_zone_title);
    }

    public static ItemCommonZoneTitleBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneTitleBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemCommonZoneTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_title, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemCommonZoneTitleBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemCommonZoneTitleBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_common_zone_title, null, false, obj);
    }

    @NonNull
    public static ItemCommonZoneTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public String c() {
        return this.f21815c;
    }

    public abstract void f(@Nullable String str);

    @NonNull
    public static ItemCommonZoneTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
