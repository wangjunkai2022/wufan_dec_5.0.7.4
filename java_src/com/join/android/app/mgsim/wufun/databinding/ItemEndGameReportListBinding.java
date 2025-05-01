package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemEndGameReportListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22075b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22076c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22077d;

    private ItemEndGameReportListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f22075b = constraintLayout;
        this.f22076c = imageView;
        this.f22077d = textView;
    }

    @NonNull
    public static ItemEndGameReportListBinding bind(@NonNull View view) {
        int i4 = R.id.ivCheck;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivCheck);
        if (imageView != null) {
            i4 = R.id.tvReason;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvReason);
            if (textView != null) {
                return new ItemEndGameReportListBinding((ConstraintLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemEndGameReportListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22075b;
    }

    @NonNull
    public static ItemEndGameReportListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_end_game_report_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
