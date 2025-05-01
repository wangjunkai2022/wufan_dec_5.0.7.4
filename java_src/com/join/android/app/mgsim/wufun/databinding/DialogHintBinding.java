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
public final class DialogHintBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18786b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18787c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18788d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18789e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f18790f;

    private DialogHintBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout2) {
        this.f18786b = relativeLayout;
        this.f18787c = linearLayout;
        this.f18788d = textView;
        this.f18789e = textView2;
        this.f18790f = relativeLayout2;
    }

    @NonNull
    public static DialogHintBinding bind(@NonNull View view) {
        int i4 = R.id.iv_close;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
        if (linearLayout != null) {
            i4 = R.id.tv_hint;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_hint);
            if (textView != null) {
                i4 = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView2 != null) {
                    i4 = R.id.tv_top;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.tv_top);
                    if (relativeLayout != null) {
                        return new DialogHintBinding((RelativeLayout) view, linearLayout, textView, textView2, relativeLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogHintBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18786b;
    }

    @NonNull
    public static DialogHintBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_hint, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
