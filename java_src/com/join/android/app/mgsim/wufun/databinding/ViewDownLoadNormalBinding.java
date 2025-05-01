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
public final class ViewDownLoadNormalBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27032b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f27033c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f27034d;

    private ViewDownLoadNormalBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f27032b = linearLayout;
        this.f27033c = textView;
        this.f27034d = textView2;
    }

    @NonNull
    public static ViewDownLoadNormalBinding bind(@NonNull View view) {
        int i4 = R.id.tv_sub_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_sub_text);
        if (textView != null) {
            i4 = R.id.tv_text;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_text);
            if (textView2 != null) {
                return new ViewDownLoadNormalBinding((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ViewDownLoadNormalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27032b;
    }

    @NonNull
    public static ViewDownLoadNormalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_down_load_normal, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
