package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ViewEqualizerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27035b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f27036c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f27037d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f27038e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f27039f;

    private ViewEqualizerBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4) {
        this.f27035b = linearLayout;
        this.f27036c = view;
        this.f27037d = view2;
        this.f27038e = view3;
        this.f27039f = view4;
    }

    @NonNull
    public static ViewEqualizerBinding bind(@NonNull View view) {
        int i4 = R.id.music_bar1;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.music_bar1);
        if (findChildViewById != null) {
            i4 = R.id.music_bar2;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.music_bar2);
            if (findChildViewById2 != null) {
                i4 = R.id.music_bar3;
                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.music_bar3);
                if (findChildViewById3 != null) {
                    i4 = R.id.music_bar4;
                    View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.music_bar4);
                    if (findChildViewById4 != null) {
                        return new ViewEqualizerBinding((LinearLayout) view, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ViewEqualizerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27035b;
    }

    @NonNull
    public static ViewEqualizerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_equalizer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
