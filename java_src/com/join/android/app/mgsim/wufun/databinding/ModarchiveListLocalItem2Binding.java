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
public abstract class ModarchiveListLocalItem2Binding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f25092b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25093c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25094d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f25095e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25096f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f25097g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25098h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f25099i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f25100j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25101k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25102l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25103m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f25104n;
    @Bindable

    /* renamed from: o  reason: collision with root package name */
    protected ArchiveData f25105o;
    @Bindable

    /* renamed from: p  reason: collision with root package name */
    protected OnClickArchiveListener f25106p;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModarchiveListLocalItem2Binding(Object obj, View view, int i4, TextView textView, ImageView imageView, TextView textView2, ImageView imageView2, TextView textView3, RelativeLayout relativeLayout, TextView textView4, ImageView imageView3, ImageView imageView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        super(obj, view, i4);
        this.f25092b = textView;
        this.f25093c = imageView;
        this.f25094d = textView2;
        this.f25095e = imageView2;
        this.f25096f = textView3;
        this.f25097g = relativeLayout;
        this.f25098h = textView4;
        this.f25099i = imageView3;
        this.f25100j = imageView4;
        this.f25101k = textView5;
        this.f25102l = textView6;
        this.f25103m = textView7;
        this.f25104n = textView8;
    }

    @Deprecated
    public static ModarchiveListLocalItem2Binding b(@NonNull View view, @Nullable Object obj) {
        return (ModarchiveListLocalItem2Binding) ViewDataBinding.bind(obj, view, R.layout.modarchive_list_local_item2);
    }

    public static ModarchiveListLocalItem2Binding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModarchiveListLocalItem2Binding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModarchiveListLocalItem2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_list_local_item2, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModarchiveListLocalItem2Binding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModarchiveListLocalItem2Binding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_list_local_item2, null, false, obj);
    }

    @NonNull
    public static ModarchiveListLocalItem2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public OnClickArchiveListener c() {
        return this.f25106p;
    }

    @Nullable
    public ArchiveData d() {
        return this.f25105o;
    }

    public abstract void g(@Nullable OnClickArchiveListener onClickArchiveListener);

    public abstract void h(@Nullable ArchiveData archiveData);

    @NonNull
    public static ModarchiveListLocalItem2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
