package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.dialog.ChoiceArchiveDialogViewModle;
/* loaded from: classes3.dex */
public abstract class ModChoiceArchiveDialogBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f24879b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f24880c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f24881d;
    @Bindable

    /* renamed from: e  reason: collision with root package name */
    protected ChoiceArchiveDialogViewModle f24882e;
    @Bindable

    /* renamed from: f  reason: collision with root package name */
    protected View.OnClickListener f24883f;
    @Bindable

    /* renamed from: g  reason: collision with root package name */
    protected RecyclerView.Adapter<RecyclerView.ViewHolder> f24884g;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModChoiceArchiveDialogBinding(Object obj, View view, int i4, ImageView imageView, LinearLayout linearLayout, RecyclerView recyclerView) {
        super(obj, view, i4);
        this.f24879b = imageView;
        this.f24880c = linearLayout;
        this.f24881d = recyclerView;
    }

    @Deprecated
    public static ModChoiceArchiveDialogBinding b(@NonNull View view, @Nullable Object obj) {
        return (ModChoiceArchiveDialogBinding) ViewDataBinding.bind(obj, view, R.layout.mod_choice_archive_dialog);
    }

    public static ModChoiceArchiveDialogBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModChoiceArchiveDialogBinding f(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModChoiceArchiveDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_choice_archive_dialog, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModChoiceArchiveDialogBinding g(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModChoiceArchiveDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_choice_archive_dialog, null, false, obj);
    }

    @NonNull
    public static ModChoiceArchiveDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return f(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public RecyclerView.Adapter<RecyclerView.ViewHolder> c() {
        return this.f24884g;
    }

    @Nullable
    public View.OnClickListener d() {
        return this.f24883f;
    }

    @Nullable
    public ChoiceArchiveDialogViewModle e() {
        return this.f24882e;
    }

    public abstract void h(@Nullable RecyclerView.Adapter<RecyclerView.ViewHolder> adapter);

    public abstract void i(@Nullable View.OnClickListener onClickListener);

    public abstract void j(@Nullable ChoiceArchiveDialogViewModle choiceArchiveDialogViewModle);

    @NonNull
    public static ModChoiceArchiveDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return g(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
