package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PopMyGameDeletesouceGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f26065b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26066c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26067d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26068e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26069f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f26070g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f26071h;

    private PopMyGameDeletesouceGameBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull View view, @NonNull View view2) {
        this.f26065b = constraintLayout;
        this.f26066c = textView;
        this.f26067d = textView2;
        this.f26068e = textView3;
        this.f26069f = textView4;
        this.f26070g = view;
        this.f26071h = view2;
    }

    @NonNull
    public static PopMyGameDeletesouceGameBinding bind(@NonNull View view) {
        int i4 = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cancel);
        if (textView != null) {
            i4 = R.id.delete;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.delete);
            if (textView2 != null) {
                i4 = R.id.name;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                if (textView3 != null) {
                    i4 = R.id.title;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                    if (textView4 != null) {
                        i4 = R.id.view5;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.view5);
                        if (findChildViewById != null) {
                            i4 = R.id.view8;
                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.view8);
                            if (findChildViewById2 != null) {
                                return new PopMyGameDeletesouceGameBinding((ConstraintLayout) view, textView, textView2, textView3, textView4, findChildViewById, findChildViewById2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopMyGameDeletesouceGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f26065b;
    }

    @NonNull
    public static PopMyGameDeletesouceGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_my_game_deletesouce_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
