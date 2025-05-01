package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CubePtrClassicDefaultHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18293b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18294c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18295d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18296e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f18297f;

    private CubePtrClassicDefaultHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull ProgressBar progressBar) {
        this.f18293b = linearLayout;
        this.f18294c = textView;
        this.f18295d = linearLayout2;
        this.f18296e = textView2;
        this.f18297f = progressBar;
    }

    @NonNull
    public static CubePtrClassicDefaultHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.ptr_classic_header_rotate_view_header_last_update;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.ptr_classic_header_rotate_view_header_last_update);
        if (textView != null) {
            i4 = R.id.ptr_classic_header_rotate_view_header_text;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ptr_classic_header_rotate_view_header_text);
            if (linearLayout != null) {
                i4 = R.id.ptr_classic_header_rotate_view_header_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.ptr_classic_header_rotate_view_header_title);
                if (textView2 != null) {
                    i4 = R.id.ptr_classic_header_rotate_view_progressbar;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.ptr_classic_header_rotate_view_progressbar);
                    if (progressBar != null) {
                        return new CubePtrClassicDefaultHeaderBinding((LinearLayout) view, textView, linearLayout, textView2, progressBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CubePtrClassicDefaultHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18293b;
    }

    @NonNull
    public static CubePtrClassicDefaultHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.cube_ptr_classic_default_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
