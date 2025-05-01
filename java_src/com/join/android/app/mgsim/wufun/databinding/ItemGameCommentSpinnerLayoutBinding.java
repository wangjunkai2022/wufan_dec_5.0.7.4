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
/* loaded from: classes3.dex */
public abstract class ItemGameCommentSpinnerLayoutBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final View f22178b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22179c;
    @Bindable

    /* renamed from: d  reason: collision with root package name */
    protected String f22180d;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemGameCommentSpinnerLayoutBinding(Object obj, View view, int i4, View view2, TextView textView) {
        super(obj, view, i4);
        this.f22178b = view2;
        this.f22179c = textView;
    }

    @Deprecated
    public static ItemGameCommentSpinnerLayoutBinding b(@NonNull View view, @Nullable Object obj) {
        return (ItemGameCommentSpinnerLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.item_game_comment_spinner_layout);
    }

    public static ItemGameCommentSpinnerLayoutBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ItemGameCommentSpinnerLayoutBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ItemGameCommentSpinnerLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_game_comment_spinner_layout, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ItemGameCommentSpinnerLayoutBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ItemGameCommentSpinnerLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_game_comment_spinner_layout, null, false, obj);
    }

    @NonNull
    public static ItemGameCommentSpinnerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public String c() {
        return this.f22180d;
    }

    public abstract void f(@Nullable String str);

    @NonNull
    public static ItemGameCommentSpinnerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
