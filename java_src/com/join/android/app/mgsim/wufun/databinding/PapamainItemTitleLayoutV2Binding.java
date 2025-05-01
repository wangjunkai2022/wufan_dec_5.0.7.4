package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PapamainItemTitleLayoutV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f25763b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25764c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25765d;

    private PapamainItemTitleLayoutV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f25763b = constraintLayout;
        this.f25764c = textView;
        this.f25765d = textView2;
    }

    @NonNull
    public static PapamainItemTitleLayoutV2Binding bind(@NonNull View view) {
        int i4 = R.id.tvSubTitle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvSubTitle);
        if (textView != null) {
            i4 = R.id.tvTitle;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle);
            if (textView2 != null) {
                return new PapamainItemTitleLayoutV2Binding((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapamainItemTitleLayoutV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f25763b;
    }

    @NonNull
    public static PapamainItemTitleLayoutV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_item_title_layout_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
