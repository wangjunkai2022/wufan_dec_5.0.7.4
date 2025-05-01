package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class TopbarTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26786b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f26787c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26788d;

    private TopbarTitleLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f26786b = relativeLayout;
        this.f26787c = linearLayout;
        this.f26788d = textView;
    }

    @NonNull
    public static TopbarTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.searchImage;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.searchImage);
        if (linearLayout != null) {
            i4 = R.id.textTitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textTitle);
            if (textView != null) {
                return new TopbarTitleLayoutBinding((RelativeLayout) view, linearLayout, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static TopbarTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26786b;
    }

    @NonNull
    public static TopbarTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.topbar_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
