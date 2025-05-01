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
public final class ViewIntroductionCommontInputBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27065b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f27066c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f27067d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f27068e;

    private ViewIntroductionCommontInputBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull EditText editText, @NonNull TextView textView) {
        this.f27065b = linearLayout;
        this.f27066c = linearLayout2;
        this.f27067d = editText;
        this.f27068e = textView;
    }

    @NonNull
    public static ViewIntroductionCommontInputBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.et_content;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.et_content);
        if (editText != null) {
            i4 = R.id.tv_commit;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_commit);
            if (textView != null) {
                return new ViewIntroductionCommontInputBinding(linearLayout, linearLayout, editText, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ViewIntroductionCommontInputBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27065b;
    }

    @NonNull
    public static ViewIntroductionCommontInputBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_introduction_commont_input, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
