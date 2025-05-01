package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemTagReportReasonBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22888b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22889c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22890d;

    private ItemTagReportReasonBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f22888b = linearLayout;
        this.f22889c = imageView;
        this.f22890d = textView;
    }

    @NonNull
    public static ItemTagReportReasonBinding bind(@NonNull View view) {
        int i4 = R.id.iv_check;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_check);
        if (imageView != null) {
            i4 = R.id.tv_reason_text;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_reason_text);
            if (textView != null) {
                return new ItemTagReportReasonBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemTagReportReasonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22888b;
    }

    @NonNull
    public static ItemTagReportReasonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_tag_report_reason, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
