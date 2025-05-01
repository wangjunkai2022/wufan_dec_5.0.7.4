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
public final class PopMyGamePlugBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26092b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26093c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26094d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f26095e;

    private PopMyGamePlugBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view) {
        this.f26092b = linearLayout;
        this.f26093c = textView;
        this.f26094d = textView2;
        this.f26095e = view;
    }

    @NonNull
    public static PopMyGamePlugBinding bind(@NonNull View view) {
        int i4 = R.id.delete;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.delete);
        if (textView != null) {
            i4 = R.id.detail;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.detail);
            if (textView2 != null) {
                i4 = R.id.line;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                if (findChildViewById != null) {
                    return new PopMyGamePlugBinding((LinearLayout) view, textView, textView2, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopMyGamePlugBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26092b;
    }

    @NonNull
    public static PopMyGamePlugBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_my_game_plug, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
