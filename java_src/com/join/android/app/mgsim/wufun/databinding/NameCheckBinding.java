package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class NameCheckBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final FrameLayout f25384b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25385c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f25386d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f25387e;

    private NameCheckBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull EditText editText, @NonNull Button button) {
        this.f25384b = frameLayout;
        this.f25385c = textView;
        this.f25386d = editText;
        this.f25387e = button;
    }

    @NonNull
    public static NameCheckBinding bind(@NonNull View view) {
        int i4 = R.id.changeNickNameNotice;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.changeNickNameNotice);
        if (textView != null) {
            i4 = R.id.name;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.name);
            if (editText != null) {
                i4 = R.id.ok;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.ok);
                if (button != null) {
                    return new NameCheckBinding((FrameLayout) view, textView, editText, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NameCheckBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public FrameLayout getRoot() {
        return this.f25384b;
    }

    @NonNull
    public static NameCheckBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.name_check, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
