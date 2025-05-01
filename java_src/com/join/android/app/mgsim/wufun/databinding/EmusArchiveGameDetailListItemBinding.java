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
import com.join.kotlin.ui.cloudarchive.adapter.OnEmusClickArchiveListener;
import com.join.mgps.dto.CloudListDataBean;
/* loaded from: classes3.dex */
public abstract class EmusArchiveGameDetailListItemBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f19305b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f19306c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19307d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19308e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19309f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19310g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f19311h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f19312i;
    @Bindable

    /* renamed from: j  reason: collision with root package name */
    protected CloudListDataBean f19313j;
    @Bindable

    /* renamed from: k  reason: collision with root package name */
    protected OnEmusClickArchiveListener f19314k;

    /* JADX INFO: Access modifiers changed from: protected */
    public EmusArchiveGameDetailListItemBinding(Object obj, View view, int i4, TextView textView, RelativeLayout relativeLayout, TextView textView2, ImageView imageView, TextView textView3, TextView textView4, SimpleDraweeView simpleDraweeView, TextView textView5) {
        super(obj, view, i4);
        this.f19305b = textView;
        this.f19306c = relativeLayout;
        this.f19307d = textView2;
        this.f19308e = imageView;
        this.f19309f = textView3;
        this.f19310g = textView4;
        this.f19311h = simpleDraweeView;
        this.f19312i = textView5;
    }

    @Deprecated
    public static EmusArchiveGameDetailListItemBinding b(@NonNull View view, @Nullable Object obj) {
        return (EmusArchiveGameDetailListItemBinding) ViewDataBinding.bind(obj, view, R.layout.emus_archive_game_detail_list_item);
    }

    public static EmusArchiveGameDetailListItemBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static EmusArchiveGameDetailListItemBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (EmusArchiveGameDetailListItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.emus_archive_game_detail_list_item, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static EmusArchiveGameDetailListItemBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (EmusArchiveGameDetailListItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.emus_archive_game_detail_list_item, null, false, obj);
    }

    @NonNull
    public static EmusArchiveGameDetailListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public OnEmusClickArchiveListener c() {
        return this.f19314k;
    }

    @Nullable
    public CloudListDataBean d() {
        return this.f19313j;
    }

    public abstract void g(@Nullable OnEmusClickArchiveListener onEmusClickArchiveListener);

    public abstract void h(@Nullable CloudListDataBean cloudListDataBean);

    @NonNull
    public static EmusArchiveGameDetailListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
