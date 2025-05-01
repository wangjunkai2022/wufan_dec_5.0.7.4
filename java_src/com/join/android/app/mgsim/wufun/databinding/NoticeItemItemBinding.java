package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.notice.ClickProxy;
import com.join.mgps.dto.BTActivityBean;
/* loaded from: classes3.dex */
public abstract class NoticeItemItemBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f25529b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25530c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25531d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25532e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected BTActivityBean f25533f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected ClickProxy f25534g;

    /* JADX INFO: Access modifiers changed from: protected */
    public NoticeItemItemBinding(Object obj, View view, int i4, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i4);
        this.f25529b = constraintLayout;
        this.f25530c = textView;
        this.f25531d = textView2;
        this.f25532e = textView3;
    }

    @Deprecated
    public static NoticeItemItemBinding b(@NonNull View view, @Nullable Object obj) {
        return (NoticeItemItemBinding) ViewDataBinding.bind(obj, view, R.layout.notice_item_item);
    }

    public static NoticeItemItemBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static NoticeItemItemBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (NoticeItemItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.notice_item_item, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static NoticeItemItemBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (NoticeItemItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.notice_item_item, null, false, obj);
    }

    @NonNull
    public static NoticeItemItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public BTActivityBean c() {
        return this.f25533f;
    }

    @Nullable
    public ClickProxy d() {
        return this.f25534g;
    }

    public abstract void g(@Nullable BTActivityBean bTActivityBean);

    public abstract void h(@Nullable ClickProxy clickProxy);

    @NonNull
    public static NoticeItemItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
