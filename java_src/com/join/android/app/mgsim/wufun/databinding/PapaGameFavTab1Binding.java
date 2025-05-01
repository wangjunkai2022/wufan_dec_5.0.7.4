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
public final class PapaGameFavTab1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25628b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25629c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25630d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f25631e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25632f;

    private PapaGameFavTab1Binding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2) {
        this.f25628b = relativeLayout;
        this.f25629c = textView;
        this.f25630d = linearLayout;
        this.f25631e = relativeLayout2;
        this.f25632f = textView2;
    }

    @NonNull
    public static PapaGameFavTab1Binding bind(@NonNull View view) {
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
                    return new PapaGameFavTab1Binding(relativeLayout, textView, linearLayout, relativeLayout, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PapaGameFavTab1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25628b;
    }

    @NonNull
    public static PapaGameFavTab1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.papa_game_fav_tab1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
