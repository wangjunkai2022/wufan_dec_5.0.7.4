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
public final class PapaGameFavTab2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25633b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25634c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25635d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f25636e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25637f;

    private PapaGameFavTab2Binding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2) {
        this.f25633b = relativeLayout;
        this.f25634c = textView;
        this.f25635d = linearLayout;
        this.f25636e = relativeLayout2;
        this.f25637f = textView2;
    }

    @NonNull
    public static PapaGameFavTab2Binding bind(@NonNull View view) {
        int i4 = R.id.count;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.count);
        if (textView != null) {
            i4 = R.id.llMain;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llMain);
            if (linearLayout != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i4 = R.id.name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                if (textView2 != null) {
                    return new PapaGameFavTab2Binding(relativeLayout, textView, linearLayout, relativeLayout, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapaGameFavTab2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25633b;
    }

    @NonNull
    public static PapaGameFavTab2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papa_game_fav_tab2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
