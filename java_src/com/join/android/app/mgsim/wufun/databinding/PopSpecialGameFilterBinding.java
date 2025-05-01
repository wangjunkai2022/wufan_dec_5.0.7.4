package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PopSpecialGameFilterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26108b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f26109c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26110d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26111e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26112f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26113g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26114h;

    private PopSpecialGameFilterBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f26108b = constraintLayout;
        this.f26109c = view;
        this.f26110d = textView;
        this.f26111e = textView2;
        this.f26112f = linearLayout;
        this.f26113g = textView3;
        this.f26114h = textView4;
    }

    @NonNull
    public static PopSpecialGameFilterBinding bind(@NonNull View view) {
        int i4 = R.id.bg;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.bg);
        if (findChildViewById != null) {
            i4 = R.id.fastLayout;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.fastLayout);
            if (textView != null) {
                i4 = R.id.fingerLayout;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.fingerLayout);
                if (textView2 != null) {
                    i4 = R.id.layoutMain;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutMain);
                    if (linearLayout != null) {
                        i4 = R.id.modLayout;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.modLayout);
                        if (textView3 != null) {
                            i4 = R.id.onekeyLayout;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.onekeyLayout);
                            if (textView4 != null) {
                                return new PopSpecialGameFilterBinding((ConstraintLayout) view, findChildViewById, textView, textView2, linearLayout, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopSpecialGameFilterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26108b;
    }

    @NonNull
    public static PopSpecialGameFilterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_special_game_filter, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
