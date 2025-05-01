package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogInviteFightErrorBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18791b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18792c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18793d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f18794e;

    private DialogInviteFightErrorBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull Button button2) {
        this.f18791b = linearLayout;
        this.f18792c = button;
        this.f18793d = textView;
        this.f18794e = button2;
    }

    @NonNull
    public static DialogInviteFightErrorBinding bind(@NonNull View view) {
        int i4 = R.id.cancel;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.cancel);
        if (button != null) {
            i4 = R.id.info;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.info);
            if (textView != null) {
                i4 = R.id.rebuild;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.rebuild);
                if (button2 != null) {
                    return new DialogInviteFightErrorBinding((LinearLayout) view, button, textView, button2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogInviteFightErrorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18791b;
    }

    @NonNull
    public static DialogInviteFightErrorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_invite_fight_error, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
