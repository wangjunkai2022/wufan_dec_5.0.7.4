package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MytestactivitylayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25380b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ScrollView f25381c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25382d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f25383e;

    private MytestactivitylayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ScrollView scrollView, @NonNull TextView textView, @NonNull Button button) {
        this.f25380b = linearLayout;
        this.f25381c = scrollView;
        this.f25382d = textView;
        this.f25383e = button;
    }

    @NonNull
    public static MytestactivitylayoutBinding bind(@NonNull View view) {
        int i4 = R.id.scrollView;
        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
        if (scrollView != null) {
            i4 = R.id.testTextview;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.testTextview);
            if (textView != null) {
                i4 = R.id.testbutn;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.testbutn);
                if (button != null) {
                    return new MytestactivitylayoutBinding((LinearLayout) view, scrollView, textView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MytestactivitylayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25380b;
    }

    @NonNull
    public static MytestactivitylayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mytestactivitylayout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
