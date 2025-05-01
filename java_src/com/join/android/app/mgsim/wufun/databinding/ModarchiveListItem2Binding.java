package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
/* loaded from: classes3.dex */
public abstract class ModarchiveListItem2Binding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f25042b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25043c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25044d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f25045e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25046f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f25047g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f25048h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25049i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25050j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f25051k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25052l;
    @Bindable

    /* renamed from: m  reason: collision with root package name */
    protected ArchiveData f25053m;
    @Bindable

    /* renamed from: n  reason: collision with root package name */
    protected OnClickArchiveListener f25054n;
    @Bindable

    /* renamed from: o  reason: collision with root package name */
    protected Boolean f25055o;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModarchiveListItem2Binding(Object obj, View view, int i4, TextView textView, ImageView imageView, TextView textView2, RelativeLayout relativeLayout, TextView textView3, ImageView imageView2, ImageView imageView3, TextView textView4, TextView textView5, SimpleDraweeView simpleDraweeView, TextView textView6) {
        super(obj, view, i4);
        this.f25042b = textView;
        this.f25043c = imageView;
        this.f25044d = textView2;
        this.f25045e = relativeLayout;
        this.f25046f = textView3;
        this.f25047g = imageView2;
        this.f25048h = imageView3;
        this.f25049i = textView4;
        this.f25050j = textView5;
        this.f25051k = simpleDraweeView;
        this.f25052l = textView6;
    }

    @Deprecated
    public static ModarchiveListItem2Binding b(@NonNull View view, @Nullable Object obj) {
        return (ModarchiveListItem2Binding) ViewDataBinding.bind(obj, view, R.layout.modarchive_list_item2);
    }

    public static ModarchiveListItem2Binding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModarchiveListItem2Binding f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModarchiveListItem2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_list_item2, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModarchiveListItem2Binding g(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModarchiveListItem2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_list_item2, null, false, obj);
    }

    @NonNull
    public static ModarchiveListItem2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return f(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public OnClickArchiveListener c() {
        return this.f25054n;
    }

    @Nullable
    public Boolean d() {
        return this.f25055o;
    }

    @Nullable
    public ArchiveData e() {
        return this.f25053m;
    }

    public abstract void h(@Nullable OnClickArchiveListener onClickArchiveListener);

    public abstract void i(@Nullable Boolean bool);

    public abstract void j(@Nullable ArchiveData archiveData);

    @NonNull
    public static ModarchiveListItem2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return g(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
