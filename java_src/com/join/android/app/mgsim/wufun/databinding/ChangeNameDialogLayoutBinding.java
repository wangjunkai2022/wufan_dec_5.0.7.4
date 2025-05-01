package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ChangeNameDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17708b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17709c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f17710d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17711e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17712f;

    private ChangeNameDialogLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull EditText editText, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f17708b = linearLayout;
        this.f17709c = textView;
        this.f17710d = editText;
        this.f17711e = textView2;
        this.f17712f = textView3;
    }

    @NonNull
    public static ChangeNameDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.changeNickNameNotice;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.changeNickNameNotice);
        if (textView != null) {
            i4 = R.id.name;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.name);
            if (editText != null) {
                i4 = R.id.savebutn;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.savebutn);
                if (textView2 != null) {
                    i4 = R.id.textView2;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                    if (textView3 != null) {
                        return new ChangeNameDialogLayoutBinding((LinearLayout) view, textView, editText, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ChangeNameDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17708b;
    }

    @NonNull
    public static ChangeNameDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.change_name_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
