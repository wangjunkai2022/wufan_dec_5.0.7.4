package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogAcceptInviteFightBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18493b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18494c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f18495d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final EditText f18496e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f18497f;

    private DialogAcceptInviteFightBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull EditText editText, @NonNull Button button3) {
        this.f18493b = linearLayout;
        this.f18494c = button;
        this.f18495d = button2;
        this.f18496e = editText;
        this.f18497f = button3;
    }

    @NonNull
    public static DialogAcceptInviteFightBinding bind(@NonNull View view) {
        int i4 = R.id.acceptBtn;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.acceptBtn);
        if (button != null) {
            i4 = R.id.cancelBtn;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.cancelBtn);
            if (button2 != null) {
                i4 = R.id.inputTxt;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.inputTxt);
                if (editText != null) {
                    i4 = R.id.pasteBtn;
                    Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.pasteBtn);
                    if (button3 != null) {
                        return new DialogAcceptInviteFightBinding((LinearLayout) view, button, button2, editText, button3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogAcceptInviteFightBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18493b;
    }

    @NonNull
    public static DialogAcceptInviteFightBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_accept_invite_fight, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
