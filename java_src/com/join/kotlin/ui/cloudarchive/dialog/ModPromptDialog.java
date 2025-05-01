package com.join.kotlin.ui.cloudarchive.dialog;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.join.android.app.mgsim.wufun.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ModPromptDialog.kt */
@SourceDebugExtension({"SMAP\nModPromptDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModPromptDialog.kt\ncom/join/kotlin/ui/cloudarchive/dialog/ModPromptDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
/* loaded from: classes3.dex */
public class ModPromptDialog extends DialogFragment {
    @Nullable
    private ModPromptCallback listener;
    public View vClose;
    public TextView vDesc;
    public TextView vNegative;
    public TextView vPositive;
    public TextView vTitle;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$0(ModPromptDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$2(ModPromptDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ModPromptCallback modPromptCallback = this$0.listener;
        if (modPromptCallback != null) {
            modPromptCallback.callback1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$3(ModPromptDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ModPromptCallback modPromptCallback = this$0.listener;
        if (modPromptCallback != null) {
            modPromptCallback.callback2();
        }
    }

    private final void setContent(String str, String str2, String str3, String str4, final ModPromptCallback modPromptCallback) {
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
        getVPositive().setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.cloudarchive.dialog.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModPromptDialog.setContent$lambda$8(ModPromptCallback.this, view);
            }
        });
        getVNegative().setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.cloudarchive.dialog.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModPromptDialog.setContent$lambda$9(ModPromptCallback.this, view);
            }
        });
    }

    static /* synthetic */ void setContent$default(ModPromptDialog modPromptDialog, String str, String str2, String str3, String str4, ModPromptCallback modPromptCallback, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setContent");
        }
        if ((i4 & 1) != 0) {
            str = null;
        }
        if ((i4 & 2) != 0) {
            str2 = null;
        }
        if ((i4 & 4) != 0) {
            str3 = null;
        }
        if ((i4 & 8) != 0) {
            str4 = null;
        }
        if ((i4 & 16) != 0) {
            modPromptCallback = null;
        }
        modPromptDialog.setContent(str, str2, str3, str4, modPromptCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setContent$lambda$8(ModPromptCallback modPromptCallback, View view) {
        if (modPromptCallback != null) {
            modPromptCallback.callback1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setContent$lambda$9(ModPromptCallback modPromptCallback, View view) {
        if (modPromptCallback != null) {
            modPromptCallback.callback2();
        }
    }

    public int getLayoutId() {
        return R.layout.dialog_mod_prompt;
    }

    @Nullable
    public final ModPromptCallback getListener() {
        return this.listener;
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

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(getLayoutId(), viewGroup, false);
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
        getVClose().setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.cloudarchive.dialog.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModPromptDialog.onCreateView$lambda$0(ModPromptDialog.this, view);
            }
        });
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("gameName", "");
            Intrinsics.checkNotNullExpressionValue(str, "it.getString(\"gameName\", \"\")");
        } else {
            str = "";
        }
        String string = getString(R.string.mod_prompt_tips);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.mod_prompt_tips)");
        String string2 = getString(R.string.mod_prompt_game_incompatible, str, "" + Build.VERSION.RELEASE);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(\n            R…VERSION.RELEASE\n        )");
        String string3 = getString(R.string.game_start_continue);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.game_start_continue)");
        String string4 = getString(R.string.game_start_standard);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.game_start_standard)");
        getVTitle().setText(string);
        getVDesc().setText(string2);
        getVPositive().setText(string3);
        getVNegative().setText(string4);
        getVPositive().setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.cloudarchive.dialog.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModPromptDialog.onCreateView$lambda$2(ModPromptDialog.this, view);
            }
        });
        getVNegative().setOnClickListener(new View.OnClickListener() { // from class: com.join.kotlin.ui.cloudarchive.dialog.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ModPromptDialog.onCreateView$lambda$3(ModPromptDialog.this, view);
            }
        });
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        int i4 = displayMetrics.widthPixels;
        Dialog dialog2 = getDialog();
        Intrinsics.checkNotNull(dialog2);
        Window window2 = dialog2.getWindow();
        Intrinsics.checkNotNull(window2);
        window.setLayout(i4, window2.getAttributes().height);
        Dialog dialog3 = getDialog();
        Intrinsics.checkNotNull(dialog3);
        Window window3 = dialog3.getWindow();
        Intrinsics.checkNotNull(window3);
        window3.setBackgroundDrawable(new ColorDrawable(0));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
    }

    public final void setListener(@Nullable ModPromptCallback modPromptCallback) {
        this.listener = modPromptCallback;
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

    public final void show(@NotNull FragmentManager manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        super.show(manager, "prompt");
    }
}
