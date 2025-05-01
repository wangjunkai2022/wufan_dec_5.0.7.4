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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.quark.model.bean.SourceListItemBean;
import com.join.mgps.customview.FlowLayout;
/* loaded from: classes3.dex */
public abstract class ItemQuarkSearchResultBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final FlowLayout f22559b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22560c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22561d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected SourceListItemBean f22562e;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemQuarkSearchResultBinding(Object obj, View view, int i4, FlowLayout flowLayout, SimpleDraweeView simpleDraweeView, TextView textView) {
        super(obj, view, i4);
        this.f22559b = flowLayout;
        this.f22560c = simpleDraweeView;
        this.f22561d = textView;
    }

    @Deprecated
    public static ItemQuarkSearchResultBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemQuarkSearchResultBinding) ViewDataBinding.bind(obj, view, R.layout.item_quark_search_result);
    }

    public static ItemQuarkSearchResultBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemQuarkSearchResultBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemQuarkSearchResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_quark_search_result, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemQuarkSearchResultBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemQuarkSearchResultBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_quark_search_result, null, false, obj);
    }

    @NonNull
    public static ItemQuarkSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SourceListItemBean c() {
        return this.f22562e;
    }

    public abstract void f(@Nullable SourceListItemBean sourceListItemBean);

    @NonNull
    public static ItemQuarkSearchResultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
