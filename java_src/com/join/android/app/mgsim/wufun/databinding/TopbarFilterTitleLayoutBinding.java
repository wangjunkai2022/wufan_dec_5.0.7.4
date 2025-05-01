package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class TopbarFilterTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26753b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26754c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26755d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26756e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ToggleButton f26757f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ToggleButton f26758g;

    private TopbarFilterTitleLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull ToggleButton toggleButton, @NonNull ToggleButton toggleButton2) {
        this.f26753b = relativeLayout;
        this.f26754c = textView;
        this.f26755d = textView2;
        this.f26756e = linearLayout;
        this.f26757f = toggleButton;
        this.f26758g = toggleButton2;
    }

    @NonNull
    public static TopbarFilterTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.backTextView;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.backTextView);
        if (textView != null) {
            i4 = R.id.romTypeTitle;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.romTypeTitle);
            if (textView2 != null) {
                i4 = R.id.searchImage;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.searchImage);
                if (linearLayout != null) {
                    i4 = R.id.toggleButton;
                    ToggleButton toggleButton = (ToggleButton) ViewBindings.findChildViewById(view, R.id.toggleButton);
                    if (toggleButton != null) {
                        i4 = R.id.toggleButtonRom;
                        ToggleButton toggleButton2 = (ToggleButton) ViewBindings.findChildViewById(view, R.id.toggleButtonRom);
                        if (toggleButton2 != null) {
                            return new TopbarFilterTitleLayoutBinding((RelativeLayout) view, textView, textView2, linearLayout, toggleButton, toggleButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static TopbarFilterTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26753b;
    }

    @NonNull
    public static TopbarFilterTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.topbar_filter_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
