package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class NowWufunActivityLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25556b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25557c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25558d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f25559e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25560f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25561g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25562h;

    private NowWufunActivityLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull FrameLayout frameLayout, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f25556b = linearLayout;
        this.f25557c = textView;
        this.f25558d = textView2;
        this.f25559e = frameLayout;
        this.f25560f = textView3;
        this.f25561g = textView4;
        this.f25562h = textView5;
    }

    @NonNull
    public static NowWufunActivityLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.broadcast;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.broadcast);
        if (textView != null) {
            i4 = R.id.everdayFind;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.everdayFind);
            if (textView2 != null) {
                i4 = R.id.fragmentLayout;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fragmentLayout);
                if (frameLayout != null) {
                    i4 = R.id.nowWufun;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.nowWufun);
                    if (textView3 != null) {
                        i4 = R.id.tallk;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tallk);
                        if (textView4 != null) {
                            i4 = R.id.todayNew;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.todayNew);
                            if (textView5 != null) {
                                return new NowWufunActivityLayoutBinding((LinearLayout) view, textView, textView2, frameLayout, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NowWufunActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25556b;
    }

    @NonNull
    public static NowWufunActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.now_wufun_activity_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
