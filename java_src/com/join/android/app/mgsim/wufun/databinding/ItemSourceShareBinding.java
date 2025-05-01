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
public abstract class ItemSourceShareBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final FlowLayout f22827b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22828c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22829d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected SourceListItemBean f22830e;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemSourceShareBinding(Object obj, View view, int i4, FlowLayout flowLayout, SimpleDraweeView simpleDraweeView, TextView textView) {
        super(obj, view, i4);
        this.f22827b = flowLayout;
        this.f22828c = simpleDraweeView;
        this.f22829d = textView;
    }

    @Deprecated
    public static ItemSourceShareBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemSourceShareBinding) ViewDataBinding.bind(obj, view, R.layout.item_source_share);
    }

    public static ItemSourceShareBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemSourceShareBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemSourceShareBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_source_share, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemSourceShareBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemSourceShareBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_source_share, null, false, obj);
    }

    @NonNull
    public static ItemSourceShareBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public SourceListItemBean c() {
        return this.f22830e;
    }

    public abstract void f(@Nullable SourceListItemBean sourceListItemBean);

    @NonNull
    public static ItemSourceShareBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
