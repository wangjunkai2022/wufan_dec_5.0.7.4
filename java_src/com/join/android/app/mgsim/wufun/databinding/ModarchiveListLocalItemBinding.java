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
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.adapter.OnClickArchiveListener;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
/* loaded from: classes3.dex */
public abstract class ModarchiveListLocalItemBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f25117b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25118c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25119d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f25120e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25121f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f25122g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25123h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f25124i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f25125j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25126k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25127l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25128m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f25129n;
    @Bindable

    /* renamed from: o  reason: collision with root package name */
    protected ArchiveData f25130o;
    @Bindable

    /* renamed from: p  reason: collision with root package name */
    protected OnClickArchiveListener f25131p;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModarchiveListLocalItemBinding(Object obj, View view, int i4, TextView textView, ImageView imageView, TextView textView2, ImageView imageView2, TextView textView3, RelativeLayout relativeLayout, TextView textView4, ImageView imageView3, ImageView imageView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        super(obj, view, i4);
        this.f25117b = textView;
        this.f25118c = imageView;
        this.f25119d = textView2;
        this.f25120e = imageView2;
        this.f25121f = textView3;
        this.f25122g = relativeLayout;
        this.f25123h = textView4;
        this.f25124i = imageView3;
        this.f25125j = imageView4;
        this.f25126k = textView5;
        this.f25127l = textView6;
        this.f25128m = textView7;
        this.f25129n = textView8;
    }

    @Deprecated
    public static ModarchiveListLocalItemBinding b(@NonNull View view, @Nullable Object obj) {
        return (ModarchiveListLocalItemBinding) ViewDataBinding.bind(obj, view, R.layout.modarchive_list_local_item);
    }

    public static ModarchiveListLocalItemBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModarchiveListLocalItemBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModarchiveListLocalItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_list_local_item, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModarchiveListLocalItemBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModarchiveListLocalItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_list_local_item, null, false, obj);
    }

    @NonNull
    public static ModarchiveListLocalItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public OnClickArchiveListener c() {
        return this.f25131p;
    }

    @Nullable
    public ArchiveData d() {
        return this.f25130o;
    }

    public abstract void g(@Nullable OnClickArchiveListener onClickArchiveListener);

    public abstract void h(@Nullable ArchiveData archiveData);

    @NonNull
    public static ModarchiveListLocalItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
