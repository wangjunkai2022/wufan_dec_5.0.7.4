package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemMyGameGuesslikeItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f22479b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22480c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22481d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f22482e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f22483f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f22484g;

    private ItemMyGameGuesslikeItemBinding(@NonNull CardView cardView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ProgressBar progressBar, @NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView) {
        this.f22479b = cardView;
        this.f22480c = textView;
        this.f22481d = textView2;
        this.f22482e = progressBar;
        this.f22483f = relativeLayout;
        this.f22484g = simpleDraweeView;
    }

    @NonNull
    public static ItemMyGameGuesslikeItemBinding bind(@NonNull View view) {
        int i4 = R.id.appName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
        if (textView != null) {
            i4 = R.id.mgListviewItemInstall;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemInstall);
            if (textView2 != null) {
                i4 = R.id.pb_loading;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_loading);
                if (progressBar != null) {
                    i4 = R.id.rLayoutRight;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                    if (relativeLayout != null) {
                        i4 = R.id.sdv_image;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_image);
                        if (simpleDraweeView != null) {
                            return new ItemMyGameGuesslikeItemBinding((CardView) view, textView, textView2, progressBar, relativeLayout, simpleDraweeView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemMyGameGuesslikeItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f22479b;
    }

    @NonNull
    public static ItemMyGameGuesslikeItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_my_game_guesslike_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
