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
public final class GamedetialFavortiesItemLayoutv2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20893b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20894c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f20895d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f20896e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20897f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20898g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f20899h;

    private GamedetialFavortiesItemLayoutv2Binding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f20893b = linearLayout;
        this.f20894c = textView;
        this.f20895d = linearLayout2;
        this.f20896e = relativeLayout;
        this.f20897f = textView2;
        this.f20898g = textView3;
        this.f20899h = textView4;
    }

    @NonNull
    public static GamedetialFavortiesItemLayoutv2Binding bind(@NonNull View view) {
        int i4 = R.id.follow;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.follow);
        if (textView != null) {
            i4 = R.id.iconLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iconLayout);
            if (linearLayout != null) {
                i4 = R.id.main;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.main);
                if (relativeLayout != null) {
                    i4 = R.id.name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                    if (textView2 != null) {
                        i4 = R.id.number;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.number);
                        if (textView3 != null) {
                            i4 = R.id.title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                            if (textView4 != null) {
                                return new GamedetialFavortiesItemLayoutv2Binding((LinearLayout) view, textView, linearLayout, relativeLayout, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetialFavortiesItemLayoutv2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20893b;
    }

    @NonNull
    public static GamedetialFavortiesItemLayoutv2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_favorties_item_layoutv2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
