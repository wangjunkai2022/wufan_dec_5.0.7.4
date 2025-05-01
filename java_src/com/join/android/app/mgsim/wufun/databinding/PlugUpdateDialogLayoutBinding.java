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
public final class PlugUpdateDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25941b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final CheckBox f25942c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25943d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f25944e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f25945f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25946g;

    private PlugUpdateDialogLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull CheckBox checkBox, @NonNull TextView textView, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView2) {
        this.f25941b = linearLayout;
        this.f25942c = checkBox;
        this.f25943d = textView;
        this.f25944e = button;
        this.f25945f = button2;
        this.f25946g = textView2;
    }

    @NonNull
    public static PlugUpdateDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.checkbox;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, R.id.checkbox);
        if (checkBox != null) {
            i4 = R.id.content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.content);
            if (textView != null) {
                i4 = R.id.dialog_button_cancle;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_cancle);
                if (button != null) {
                    i4 = R.id.dialog_button_ok;
                    Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
                    if (button2 != null) {
                        i4 = R.id.title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                        if (textView2 != null) {
                            return new PlugUpdateDialogLayoutBinding((LinearLayout) view, checkBox, textView, button, button2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PlugUpdateDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25941b;
    }

    @NonNull
    public static PlugUpdateDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.plug_update_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
