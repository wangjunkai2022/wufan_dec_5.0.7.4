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
public final class PapamainBespeakBottomLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25646b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25647c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25648d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25649e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25650f;

    private PapamainBespeakBottomLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f25646b = linearLayout;
        this.f25647c = textView;
        this.f25648d = textView2;
        this.f25649e = textView3;
        this.f25650f = textView4;
    }

    @NonNull
    public static PapamainBespeakBottomLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.butn;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.butn);
        if (textView != null) {
            i4 = R.id.subtitle;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.subtitle);
            if (textView2 != null) {
                i4 = R.id.textView71;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView71);
                if (textView3 != null) {
                    i4 = R.id.title;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                    if (textView4 != null) {
                        return new PapamainBespeakBottomLayoutBinding((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapamainBespeakBottomLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25646b;
    }

    @NonNull
    public static PapamainBespeakBottomLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_bespeak_bottom_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
