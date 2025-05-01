package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener;
import com.join.mgps.dto.DomainInfoBean;
/* loaded from: classes3.dex */
public abstract class ModarchiveListDomain2Binding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDraweeView f25022b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CardView f25023c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25024d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected DomainInfoBean f25025e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected OnClickArchiveListener f25026f;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModarchiveListDomain2Binding(Object obj, View view, int i4, SimpleDraweeView simpleDraweeView, CardView cardView, TextView textView) {
        super(obj, view, i4);
        this.f25022b = simpleDraweeView;
        this.f25023c = cardView;
        this.f25024d = textView;
    }

    @Deprecated
    public static ModarchiveListDomain2Binding b(@NonNull View view, @Nullable Object obj) {
        return (ModarchiveListDomain2Binding) ViewDataBinding.bind(obj, view, R.layout.modarchive_list_domain2);
    }

    public static ModarchiveListDomain2Binding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModarchiveListDomain2Binding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModarchiveListDomain2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_list_domain2, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModarchiveListDomain2Binding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModarchiveListDomain2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_list_domain2, null, false, obj);
    }

    @NonNull
    public static ModarchiveListDomain2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public OnClickArchiveListener c() {
        return this.f25026f;
    }

    @Nullable
    public DomainInfoBean d() {
        return this.f25025e;
    }

    public abstract void g(@Nullable OnClickArchiveListener onClickArchiveListener);

    public abstract void h(@Nullable DomainInfoBean domainInfoBean);

    @NonNull
    public static ModarchiveListDomain2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
