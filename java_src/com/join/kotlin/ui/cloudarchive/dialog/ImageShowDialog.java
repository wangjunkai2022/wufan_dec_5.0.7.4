package com.join.kotlin.ui.cloudarchive.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.join.android.app.mgsim.wufun.R;
import com.join.android.app.mgsim.wufun.databinding.ImageShowDialogBinding;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ImageShowDialog.kt */
/* loaded from: classes3.dex */
public final class ImageShowDialog extends DialogFragment implements View.OnClickListener {
    public ImageShowDialogBinding dataBinding;
    @Nullable
    private String imagePath;
    public ClickDelDialogListener listener;
    private int orientation;
    @NotNull
    private final Lazy viewModle$delegate;

    public ImageShowDialog(int i4) {
        Lazy lazy;
        this.orientation = i4;
        lazy = LazyKt__LazyJVMKt.lazy(new Function0<ImageDialogViewmodle>() { // from class: com.join.kotlin.ui.cloudarchive.dialog.ImageShowDialog$viewModle$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ImageDialogViewmodle invoke() {
                return (ImageDialogViewmodle) new ViewModelProvider(ImageShowDialog.this, new ViewModelProvider.NewInstanceFactory()).get(ImageDialogViewmodle.class);
            }
        });
        this.viewModle$delegate = lazy;
    }

    @NotNull
    public final ImageShowDialogBinding getDataBinding() {
        ImageShowDialogBinding imageShowDialogBinding = this.dataBinding;
        if (imageShowDialogBinding != null) {
            return imageShowDialogBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dataBinding");
        return null;
    }

    @Nullable
    public final String getImagePath() {
        return this.imagePath;
    }

    @NotNull
    public final ClickDelDialogListener getListener() {
        ClickDelDialogListener clickDelDialogListener = this.listener;
        if (clickDelDialogListener != null) {
            return clickDelDialogListener;
        }
        Intrinsics.throwUninitializedPropertyAccessException("listener");
        return null;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    @NotNull
    public final ImageDialogViewmodle getViewModle() {
        return (ImageDialogViewmodle) this.viewModle$delegate.getValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.closed) {
            dismiss();
        }
        dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.image_show_dialog, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            inf…          false\n        )");
        setDataBinding((ImageShowDialogBinding) inflate);
        getDataBinding().setLifecycleOwner(this);
        getDataBinding().setVariable(34, getViewModle());
        getDataBinding().setVariable(7, this);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(true);
        }
        getViewModle().getImagePath().setValue(this.imagePath);
        getViewModle().getOrientation().setValue(Integer.valueOf(this.orientation));
        return getDataBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
    }

    public final void setClickDelDialogListener(@NotNull ClickDelDialogListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setListener(listener);
    }

    public final void setDataBinding(@NotNull ImageShowDialogBinding imageShowDialogBinding) {
        Intrinsics.checkNotNullParameter(imageShowDialogBinding, "<set-?>");
        this.dataBinding = imageShowDialogBinding;
    }

    public final void setImageDialogPath(@Nullable String str) {
        this.imagePath = str;
    }

    public final void setImagePath(@Nullable String str) {
        this.imagePath = str;
    }

    public final void setListener(@NotNull ClickDelDialogListener clickDelDialogListener) {
        Intrinsics.checkNotNullParameter(clickDelDialogListener, "<set-?>");
        this.listener = clickDelDialogListener;
    }

    public final void setOrientation(int i4) {
        this.orientation = i4;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(@NotNull FragmentManager manager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        manager.beginTransaction().remove(this).commit();
        super.show(manager, str);
    }
}
