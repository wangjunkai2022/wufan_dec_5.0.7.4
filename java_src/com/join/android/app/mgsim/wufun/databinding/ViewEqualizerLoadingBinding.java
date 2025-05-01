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
public final class ViewEqualizerLoadingBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27040b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f27041c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f27042d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f27043e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f27044f;

    private ViewEqualizerLoadingBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4) {
        this.f27040b = linearLayout;
        this.f27041c = view;
        this.f27042d = view2;
        this.f27043e = view3;
        this.f27044f = view4;
    }

    @NonNull
    public static ViewEqualizerLoadingBinding bind(@NonNull View view) {
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
                        return new ViewEqualizerLoadingBinding((LinearLayout) view, findChildViewById, findChildViewById2, findChildViewById3, findChildViewById4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ViewEqualizerLoadingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27040b;
    }

    @NonNull
    public static ViewEqualizerLoadingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_equalizer_loading, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
