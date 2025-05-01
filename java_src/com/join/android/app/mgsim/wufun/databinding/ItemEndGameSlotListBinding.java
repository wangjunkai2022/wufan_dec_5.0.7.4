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
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.endgame.adapter.ISlotAdapterListener;
import com.join.mgps.dto.ArchiveListBean;
/* loaded from: classes3.dex */
public abstract class ItemEndGameSlotListBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final TextView f22084b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected ArchiveListBean f22085c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected ISlotAdapterListener f22086d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemEndGameSlotListBinding(Object obj, View view, int i4, TextView textView) {
        super(obj, view, i4);
        this.f22084b = textView;
    }

    @Deprecated
    public static ItemEndGameSlotListBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemEndGameSlotListBinding) ViewDataBinding.bind(obj, view, R.layout.item_end_game_slot_list);
    }

    public static ItemEndGameSlotListBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemEndGameSlotListBinding e(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemEndGameSlotListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_end_game_slot_list, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemEndGameSlotListBinding f(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemEndGameSlotListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_end_game_slot_list, null, false, obj);
    }

    @NonNull
    public static ItemEndGameSlotListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return e(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ArchiveListBean c() {
        return this.f22085c;
    }

    @Nullable
    public ISlotAdapterListener d() {
        return this.f22086d;
    }

    public abstract void g(@Nullable ArchiveListBean archiveListBean);

    public abstract void h(@Nullable ISlotAdapterListener iSlotAdapterListener);

    @NonNull
    public static ItemEndGameSlotListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return f(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
