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
public final class MgFItemPostSubjectLabelBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23766b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f23767c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f23768d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23769e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f23770f;

    private MgFItemPostSubjectLabelBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull View view, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f23766b = linearLayout;
        this.f23767c = button;
        this.f23768d = view;
        this.f23769e = textView;
        this.f23770f = linearLayout2;
    }

    @NonNull
    public static MgFItemPostSubjectLabelBinding bind(@NonNull View view) {
        int i4 = R.id.best;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.best);
        if (button != null) {
            i4 = R.id.forum_post_divider;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.forum_post_divider);
            if (findChildViewById != null) {
                i4 = R.id.subject;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.subject);
                if (textView != null) {
                    i4 = R.id.subjectMain;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.subjectMain);
                    if (linearLayout != null) {
                        return new MgFItemPostSubjectLabelBinding((LinearLayout) view, button, findChildViewById, textView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgFItemPostSubjectLabelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23766b;
    }

    @NonNull
    public static MgFItemPostSubjectLabelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_f_item_post_subject_label, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
