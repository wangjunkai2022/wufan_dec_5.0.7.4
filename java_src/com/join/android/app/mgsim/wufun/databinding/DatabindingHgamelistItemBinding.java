package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.business.CollectionBeanSubBusiness;
/* loaded from: classes3.dex */
public abstract class DatabindingHgamelistItemBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f18322b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f18323c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18324d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected CollectionBeanSubBusiness f18325e;

    /* JADX INFO: Access modifiers changed from: protected */
    public DatabindingHgamelistItemBinding(Object obj, View view, int i4, TextView textView, SimpleDraweeView simpleDraweeView, LinearLayout linearLayout) {
        super(obj, view, i4);
        this.f18322b = textView;
        this.f18323c = simpleDraweeView;
        this.f18324d = linearLayout;
    }

    @Deprecated
    public static DatabindingHgamelistItemBinding b(@NonNull View view, @Nullable Object obj) {
        return (DatabindingHgamelistItemBinding) ViewDataBinding.bind(obj, view, R.layout.databinding_hgamelist_item);
    }

    public static DatabindingHgamelistItemBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static DatabindingHgamelistItemBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (DatabindingHgamelistItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.databinding_hgamelist_item, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static DatabindingHgamelistItemBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (DatabindingHgamelistItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.databinding_hgamelist_item, null, false, obj);
    }

    @NonNull
    public static DatabindingHgamelistItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public CollectionBeanSubBusiness c() {
        return this.f18325e;
    }

    public abstract void f(@Nullable CollectionBeanSubBusiness collectionBeanSubBusiness);

    @NonNull
    public static DatabindingHgamelistItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
