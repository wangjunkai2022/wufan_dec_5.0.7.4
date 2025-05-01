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
public abstract class ModarchiveListItemBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f25067b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25068c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25069d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f25070e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25071f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f25072g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f25073h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25074i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25075j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25076k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SimpleDraweeView f25077l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25078m;
    @Bindable

    /* renamed from: n  reason: collision with root package name */
    protected ArchiveData f25079n;
    @Bindable

    /* renamed from: o  reason: collision with root package name */
    protected OnClickArchiveListener f25080o;
    @Bindable

    /* renamed from: p  reason: collision with root package name */
    protected Boolean f25081p;
    @Bindable

    /* renamed from: q  reason: collision with root package name */
    protected Boolean f25082q;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModarchiveListItemBinding(Object obj, View view, int i4, TextView textView, ImageView imageView, TextView textView2, RelativeLayout relativeLayout, TextView textView3, ImageView imageView2, ImageView imageView3, TextView textView4, TextView textView5, TextView textView6, SimpleDraweeView simpleDraweeView, TextView textView7) {
        super(obj, view, i4);
        this.f25067b = textView;
        this.f25068c = imageView;
        this.f25069d = textView2;
        this.f25070e = relativeLayout;
        this.f25071f = textView3;
        this.f25072g = imageView2;
        this.f25073h = imageView3;
        this.f25074i = textView4;
        this.f25075j = textView5;
        this.f25076k = textView6;
        this.f25077l = simpleDraweeView;
        this.f25078m = textView7;
    }

    @Deprecated
    public static ModarchiveListItemBinding b(@NonNull View view, @Nullable Object obj) {
        return (ModarchiveListItemBinding) ViewDataBinding.bind(obj, view, R.layout.modarchive_list_item);
    }

    public static ModarchiveListItemBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModarchiveListItemBinding g(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModarchiveListItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_list_item, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModarchiveListItemBinding h(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModarchiveListItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_list_item, null, false, obj);
    }

    @NonNull
    public static ModarchiveListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return g(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public OnClickArchiveListener c() {
        return this.f25080o;
    }

    @Nullable
    public Boolean d() {
        return this.f25081p;
    }

    @Nullable
    public Boolean e() {
        return this.f25082q;
    }

    @Nullable
    public ArchiveData f() {
        return this.f25079n;
    }

    public abstract void i(@Nullable OnClickArchiveListener onClickArchiveListener);

    public abstract void j(@Nullable Boolean bool);

    public abstract void k(@Nullable Boolean bool);

    public abstract void l(@Nullable ArchiveData archiveData);

    @NonNull
    public static ModarchiveListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return h(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
