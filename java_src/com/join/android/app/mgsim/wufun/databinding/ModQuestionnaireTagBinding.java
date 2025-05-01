package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.join.android.app.mgsim.wufun.R;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class ModQuestionnaireTagBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final TextView f24946b;

    private ModQuestionnaireTagBinding(@NonNull TextView textView) {
        this.f24946b = textView;
    }

    @NonNull
    public static ModQuestionnaireTagBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        return new ModQuestionnaireTagBinding((TextView) view);
    }

    @NonNull
    public static ModQuestionnaireTagBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public TextView getRoot() {
        return this.f24946b;
    }

    @NonNull
    public static ModQuestionnaireTagBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mod_questionnaire_tag, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
