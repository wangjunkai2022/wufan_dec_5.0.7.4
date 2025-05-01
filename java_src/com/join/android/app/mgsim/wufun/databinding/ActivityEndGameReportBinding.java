package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityEndGameReportBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16064b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f16065c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f16066d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f16067e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ConstraintLayout f16068f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f16069g;

    private ActivityEndGameReportBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull EditText editText, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView) {
        this.f16064b = linearLayout;
        this.f16065c = textView;
        this.f16066d = editText;
        this.f16067e = linearLayout2;
        this.f16068f = constraintLayout;
        this.f16069g = recyclerView;
    }

    @NonNull
    public static ActivityEndGameReportBinding bind(@NonNull View view) {
        int i4 = R.id.btnSubmit;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btnSubmit);
        if (textView != null) {
            i4 = R.id.etDesc;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.etDesc);
            if (editText != null) {
                i4 = R.id.llMain;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llMain);
                if (linearLayout != null) {
                    i4 = R.id.outside;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.outside);
                    if (constraintLayout != null) {
                        i4 = R.id.rvReportType;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvReportType);
                        if (recyclerView != null) {
                            return new ActivityEndGameReportBinding((LinearLayout) view, textView, editText, linearLayout, constraintLayout, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityEndGameReportBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16064b;
    }

    @NonNull
    public static ActivityEndGameReportBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_end_game_report, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
