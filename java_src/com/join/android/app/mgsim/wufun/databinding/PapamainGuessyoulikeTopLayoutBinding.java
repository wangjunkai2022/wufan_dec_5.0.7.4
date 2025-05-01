package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PapamainGuessyoulikeTopLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25744b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25745c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25746d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f25747e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25748f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25749g;

    private PapamainGuessyoulikeTopLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f25744b = relativeLayout;
        this.f25745c = textView;
        this.f25746d = textView2;
        this.f25747e = relativeLayout2;
        this.f25748f = textView3;
        this.f25749g = textView4;
    }

    @NonNull
    public static PapamainGuessyoulikeTopLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.guessyoulikeTitle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.guessyoulikeTitle);
        if (textView != null) {
            i4 = R.id.hideh5;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.hideh5);
            if (textView2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i4 = R.id.textView3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView3);
                if (textView3 != null) {
                    i4 = R.id.textView5;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView5);
                    if (textView4 != null) {
                        return new PapamainGuessyoulikeTopLayoutBinding(relativeLayout, textView, textView2, relativeLayout, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapamainGuessyoulikeTopLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25744b;
    }

    @NonNull
    public static PapamainGuessyoulikeTopLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papamain_guessyoulike_top_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
