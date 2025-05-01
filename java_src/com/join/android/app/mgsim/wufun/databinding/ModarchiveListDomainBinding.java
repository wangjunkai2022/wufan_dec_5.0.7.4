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
public abstract class ModarchiveListDomainBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final SimpleDraweeView f25032b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CardView f25033c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25034d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected DomainInfoBean f25035e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected OnClickArchiveListener f25036f;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModarchiveListDomainBinding(Object obj, View view, int i4, SimpleDraweeView simpleDraweeView, CardView cardView, TextView textView) {
        super(obj, view, i4);
        this.f25032b = simpleDraweeView;
        this.f25033c = cardView;
        this.f25034d = textView;
    }

    @Deprecated
    public static ModarchiveListDomainBinding b(@NonNull View view, @Nullable Object obj) {
        return (ModarchiveListDomainBinding) ViewDataBinding.bind(obj, view, R.layout.modarchive_list_domain);
    }

    public static ModarchiveListDomainBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModarchiveListDomainBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModarchiveListDomainBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_list_domain, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModarchiveListDomainBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModarchiveListDomainBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_list_domain, null, false, obj);
    }

    @NonNull
    public static ModarchiveListDomainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public OnClickArchiveListener c() {
        return this.f25036f;
    }

    @Nullable
    public DomainInfoBean d() {
        return this.f25035e;
    }

    public abstract void g(@Nullable OnClickArchiveListener onClickArchiveListener);

    public abstract void h(@Nullable DomainInfoBean domainInfoBean);

    @NonNull
    public static ModarchiveListDomainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
