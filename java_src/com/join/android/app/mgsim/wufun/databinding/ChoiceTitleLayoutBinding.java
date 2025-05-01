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
public final class ChoiceTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17832b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17833c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17834d;

    private ChoiceTitleLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f17832b = linearLayout;
        this.f17833c = textView;
        this.f17834d = textView2;
    }

    @NonNull
    public static ChoiceTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.more;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.more);
        if (textView != null) {
            i4 = R.id.titleName;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleName);
            if (textView2 != null) {
                return new ChoiceTitleLayoutBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ChoiceTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17832b;
    }

    @NonNull
    public static ChoiceTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.choice_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
