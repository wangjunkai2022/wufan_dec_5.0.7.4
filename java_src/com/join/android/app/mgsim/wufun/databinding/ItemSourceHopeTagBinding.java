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
import com.join.kotlin.quark.model.bean.SourceTabItemBean;
/* loaded from: classes3.dex */
public abstract class ItemSourceHopeTagBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f22821b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected SourceTabItemBean f22822c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemSourceHopeTagBinding(Object obj, View view, int i4, TextView textView) {
        super(obj, view, i4);
        this.f22821b = textView;
    }

    @Deprecated
    public static ItemSourceHopeTagBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemSourceHopeTagBinding) ViewDataBinding.bind(obj, view, R.layout.item_source_hope_tag);
    }

    public static ItemSourceHopeTagBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemSourceHopeTagBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemSourceHopeTagBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_source_hope_tag, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemSourceHopeTagBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemSourceHopeTagBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_source_hope_tag, null, false, obj);
    }

    @NonNull
    public static ItemSourceHopeTagBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SourceTabItemBean c() {
        return this.f22822c;
    }

    public abstract void f(@Nullable SourceTabItemBean sourceTabItemBean);

    @NonNull
    public static ItemSourceHopeTagBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
