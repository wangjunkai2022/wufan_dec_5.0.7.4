package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class AppitemAppsizeDowncountLayoutSimilarBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17462b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17463c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17464d;

    private AppitemAppsizeDowncountLayoutSimilarBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f17462b = linearLayout;
        this.f17463c = textView;
        this.f17464d = textView2;
    }

    @NonNull
    public static AppitemAppsizeDowncountLayoutSimilarBinding bind(@NonNull View view) {
        int i4 = R.id.appType;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appType);
        if (textView != null) {
            i4 = R.id.appsize;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appsize);
            if (textView2 != null) {
                return new AppitemAppsizeDowncountLayoutSimilarBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static AppitemAppsizeDowncountLayoutSimilarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17462b;
    }

    @NonNull
    public static AppitemAppsizeDowncountLayoutSimilarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.appitem_appsize_downcount_layout_similar, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
