package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
/* loaded from: classes3.dex */
public abstract class ModChoiceDialogItemBinding extends ViewDataBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final LinearLayout f24891b;
    @Bindable

    /* renamed from: c  reason: collision with root package name */
    protected ArchiveData f24892c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ModChoiceDialogItemBinding(Object obj, View view, int i4, LinearLayout linearLayout) {
        super(obj, view, i4);
        this.f24891b = linearLayout;
    }

    @Deprecated
    public static ModChoiceDialogItemBinding b(@NonNull View view, @Nullable Object obj) {
        return (ModChoiceDialogItemBinding) ViewDataBinding.bind(obj, view, R.layout.mod_choice_dialog_item);
    }

    public static ModChoiceDialogItemBinding bind(@NonNull View view) {
        return b(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ModChoiceDialogItemBinding d(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4, @Nullable Object obj) {
        return (ModChoiceDialogItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_choice_dialog_item, viewGroup, z4, obj);
    }

    @NonNull
    @Deprecated
    public static ModChoiceDialogItemBinding e(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ModChoiceDialogItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.mod_choice_dialog_item, null, false, obj);
    }

    @NonNull
    public static ModChoiceDialogItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        return d(layoutInflater, viewGroup, z4, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ArchiveData c() {
        return this.f24892c;
    }

    public abstract void f(@Nullable ArchiveData archiveData);

    @NonNull
    public static ModChoiceDialogItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, DataBindingUtil.getDefaultComponent());
    }
}
