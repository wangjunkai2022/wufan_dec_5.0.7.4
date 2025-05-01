package com.join.kotlin.ui.cloudarchive.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.join.android.app.mgsim.wufun.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ModPromptNormalDialog.kt */
@SourceDebugExtension({"SMAP\nModPromptNormalDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModPromptNormalDialog.kt\ncom/join/kotlin/ui/cloudarchive/dialog/ModPromptNormalDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
/* loaded from: classes3.dex */
public final class ModPromptNormalDialog extends AlertDialog {
    public View vClose;
    public TextView vDesc;
    public TextView vNegative;
    public TextView vPositive;
    public TextView vTitle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModPromptNormalDialog(@NotNull Context context) {
        super(context, R.style.PapaTheme_Dialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(ModPromptNormalDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$5(ModPromptCallback modPromptCallback, View view) {
        if (modPromptCallback != null) {
            modPromptCallback.callback1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$6(ModPromptCallback modPromptCallback, View view) {
        if (modPromptCallback != null) {
            modPromptCallback.callback2();
        }
    }

    @NotNull
    public final View getVClose() {
        View view = this.vClose;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vClose");
        return null;
    }

    @NotNull
    public final TextView getVDesc() {
        TextView textView = this.vDesc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vDesc");
        return null;
    }

    @NotNull
    public final TextView getVNegative() {
        TextView textView = this.vNegative;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vNegative");
        return null;
    }

    @NotNull
    public final TextView getVPositive() {
        TextView textView = this.vPositive;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vPositive");
        return null;
    }

    @NotNull
    public final TextView getVTitle() {
        TextView textView = this.vTitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vTitle");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AlertDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_mod_prompt1, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.tv_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tv_title)");
        setVTitle((TextView) findViewById);
        View findViewById2 = inflate.findViewById(R.id.tv_desc);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.tv_desc)");
        setVDesc((TextView) findViewById2);
        View findViewById3 = inflate.findViewById(R.id.tv_mod_opt_left);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.tv_mod_opt_left)");
        setVPositive((TextView) findViewById3);
        View findViewById4 = inflate.findViewById(R.id.tv_mod_opt_right);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.tv_mod_opt_right)");
        setVNegative((TextView) findViewById4);
        View findViewById5 = inflate.findViewById(R.id.ivClose);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.ivClose)");
        setVClose(findViewById5);
        getVClose().setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.cloudarchive.dialog.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModPromptNormalDialog.onCreate$lambda$0(ModPromptNormalDialog.this, view);
            }
        });
        setContentView(inflate);
    }

    public final void setVClose(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.vClose = view;
    }

    public final void setVDesc(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.vDesc = textView;
    }

    public final void setVNegative(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.vNegative = textView;
    }

    public final void setVPositive(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.vPositive = textView;
    }

    public final void setVTitle(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.vTitle = textView;
    }

    public final void show(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable final ModPromptCallback modPromptCallback) {
        super.show();
        boolean z4 = true;
        getVDesc().setVisibility(str2 == null || str2.length() == 0 ? 8 : 0);
        getVPositive().setVisibility(str3 == null || str3.length() == 0 ? 8 : 0);
        TextView vNegative = getVNegative();
        if (str4 != null && str4.length() != 0) {
            z4 = false;
        }
        vNegative.setVisibility(z4 ? 8 : 0);
        if (str != null) {
            getVTitle().setText(str);
        }
        if (str2 != null) {
            getVDesc().setText(str2);
        }
        if (str3 != null) {
            getVPositive().setText(str3);
        }
        if (str4 != null) {
            getVNegative().setText(str4);
        }
        getVPositive().setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.cloudarchive.dialog.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModPromptNormalDialog.show$lambda$5(ModPromptCallback.this, view);
            }
        });
        getVNegative().setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.cloudarchive.dialog.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModPromptNormalDialog.show$lambda$6(ModPromptCallback.this, view);
            }
        });
    }
}
