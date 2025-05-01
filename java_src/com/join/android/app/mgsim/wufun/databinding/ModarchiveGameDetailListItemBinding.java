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
public abstract class ModarchiveGameDetailListItemBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f24997b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24998c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24999d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f25000e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25001f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f25002g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f25003h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25004i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25005j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25006k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SimpleDraweeView f25007l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25008m;
    @Bindable

    /* renamed from: n  reason: collision with root package name */
    protected ArchiveData f25009n;
    @Bindable

    /* renamed from: o  reason: collision with root package name */
    protected OnClickArchiveListener f25010o;
    @Bindable

    /* renamed from: p  reason: collision with root package name */
    protected Boolean f25011p;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModarchiveGameDetailListItemBinding(Object obj, View view, int i4, TextView textView, ImageView imageView, TextView textView2, RelativeLayout relativeLayout, TextView textView3, ImageView imageView2, ImageView imageView3, TextView textView4, TextView textView5, TextView textView6, SimpleDraweeView simpleDraweeView, TextView textView7) {
        super(obj, view, i4);
        this.f24997b = textView;
        this.f24998c = imageView;
        this.f24999d = textView2;
        this.f25000e = relativeLayout;
        this.f25001f = textView3;
        this.f25002g = imageView2;
        this.f25003h = imageView3;
        this.f25004i = textView4;
        this.f25005j = textView5;
        this.f25006k = textView6;
        this.f25007l = simpleDraweeView;
        this.f25008m = textView7;
    }

    @Deprecated
    public static ModarchiveGameDetailListItemBinding b(@NonNull View view, @Nullable Object obj) {
        return (ModarchiveGameDetailListItemBinding) ViewDataBinding.bind(obj, view, R.layout.modarchive_game_detail_list_item);
    }

    public static ModarchiveGameDetailListItemBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModarchiveGameDetailListItemBinding f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModarchiveGameDetailListItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_game_detail_list_item, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModarchiveGameDetailListItemBinding g(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModarchiveGameDetailListItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.modarchive_game_detail_list_item, null, false, obj);
    }

    @NonNull
    public static ModarchiveGameDetailListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return f(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public OnClickArchiveListener c() {
        return this.f25010o;
    }

    @Nullable
    public Boolean d() {
        return this.f25011p;
    }

    @Nullable
    public ArchiveData e() {
        return this.f25009n;
    }

    public abstract void h(@Nullable OnClickArchiveListener onClickArchiveListener);

    public abstract void i(@Nullable Boolean bool);

    public abstract void j(@Nullable ArchiveData archiveData);

    @NonNull
    public static ModarchiveGameDetailListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return g(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
