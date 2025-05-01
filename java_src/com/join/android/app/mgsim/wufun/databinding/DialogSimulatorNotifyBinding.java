package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogSimulatorNotifyBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19026b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f19027c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CheckBox f19028d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19029e;

    private DialogSimulatorNotifyBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull CheckBox checkBox, @NonNull TextView textView) {
        this.f19026b = linearLayout;
        this.f19027c = button;
        this.f19028d = checkBox;
        this.f19029e = textView;
    }

    @NonNull
    public static DialogSimulatorNotifyBinding bind(@NonNull View view) {
        int i4 = R.id.btn_ok;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btn_ok);
        if (button != null) {
            i4 = R.id.chk_notify;
            CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.chk_notify);
            if (checkBox != null) {
                i4 = R.id.tv_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                if (textView != null) {
                    return new DialogSimulatorNotifyBinding((LinearLayout) view, button, checkBox, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogSimulatorNotifyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19026b;
    }

    @NonNull
    public static DialogSimulatorNotifyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_simulator_notify, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
