package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.domain.common.LoadBindClickProxy;
import com.join.kotlin.ui.endgame.EndGameSlotViewModel;
import com.join.kotlin.ui.endgame.ISlotListener;
/* loaded from: classes3.dex */
public abstract class ActivityEndGameSlotListBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f16075b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f16076c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final XRecyclerView f16077d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16078e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16079f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected EndGameSlotViewModel f16080g;
    @Bindable

    /* renamed from: h  reason: collision with root package name */
    protected RecyclerView.Adapter f16081h;
    @Bindable

    /* renamed from: i  reason: collision with root package name */
    protected LoadBindClickProxy f16082i;
    @Bindable

    /* renamed from: j  reason: collision with root package name */
    protected ISlotListener f16083j;

    /* JADX INFO: Access modifiers changed from: protected */
    public ActivityEndGameSlotListBinding(Object obj, View view, int i4, ImageView imageView, LinearLayout linearLayout, XRecyclerView xRecyclerView, TextView textView, TextView textView2) {
        super(obj, view, i4);
        this.f16075b = imageView;
        this.f16076c = linearLayout;
        this.f16077d = xRecyclerView;
        this.f16078e = textView;
        this.f16079f = textView2;
    }

    @Deprecated
    public static ActivityEndGameSlotListBinding b(@NonNull View view, @Nullable Object obj) {
        return (ActivityEndGameSlotListBinding) ViewDataBinding.bind(obj, view, R.layout.activity_end_game_slot_list);
    }

    public static ActivityEndGameSlotListBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityEndGameSlotListBinding g(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ActivityEndGameSlotListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_end_game_slot_list, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ActivityEndGameSlotListBinding h(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityEndGameSlotListBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_end_game_slot_list, null, false, obj);
    }

    @NonNull
    public static ActivityEndGameSlotListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return g(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public RecyclerView.Adapter c() {
        return this.f16081h;
    }

    @Nullable
    public ISlotListener d() {
        return this.f16083j;
    }

    @Nullable
    public LoadBindClickProxy e() {
        return this.f16082i;
    }

    @Nullable
    public EndGameSlotViewModel f() {
        return this.f16080g;
    }

    public abstract void i(@Nullable RecyclerView.Adapter adapter);

    public abstract void j(@Nullable ISlotListener iSlotListener);

    public abstract void k(@Nullable LoadBindClickProxy loadBindClickProxy);

    public abstract void l(@Nullable EndGameSlotViewModel endGameSlotViewModel);

    @NonNull
    public static ActivityEndGameSlotListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return h(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
