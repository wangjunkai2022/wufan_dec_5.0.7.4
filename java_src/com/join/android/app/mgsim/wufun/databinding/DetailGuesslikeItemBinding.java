package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MStarBar;
/* loaded from: classes3.dex */
public final class DetailGuesslikeItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CardView f18395b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18396c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18397d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18398e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final MStarBar f18399f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f18400g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f18401h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f18402i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f18403j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f18404k;

    private DetailGuesslikeItemBinding(@NonNull CardView cardView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull MStarBar mStarBar, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f18395b = cardView;
        this.f18396c = textView;
        this.f18397d = textView2;
        this.f18398e = textView3;
        this.f18399f = mStarBar;
        this.f18400g = simpleDraweeView;
        this.f18401h = simpleDraweeView2;
        this.f18402i = linearLayout;
        this.f18403j = textView4;
        this.f18404k = textView5;
    }

    @NonNull
    public static DetailGuesslikeItemBinding bind(@NonNull View view) {
        int i4 = R.id.appName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
        if (textView != null) {
            i4 = R.id.comment;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.comment);
            if (textView2 != null) {
                i4 = R.id.gameScore;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.gameScore);
                if (textView3 != null) {
                    i4 = R.id.gameStar;
                    MStarBar mStarBar = (MStarBar) ViewBindings.findChildViewById(view, R.id.gameStar);
                    if (mStarBar != null) {
                        i4 = R.id.icon;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                        if (simpleDraweeView != null) {
                            i4 = R.id.img;
                            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img);
                            if (simpleDraweeView2 != null) {
                                i4 = R.id.main;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                                if (linearLayout != null) {
                                    i4 = R.id.scrolNew;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.scrolNew);
                                    if (textView4 != null) {
                                        i4 = R.id.tag;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tag);
                                        if (textView5 != null) {
                                            return new DetailGuesslikeItemBinding((CardView) view, textView, textView2, textView3, mStarBar, simpleDraweeView, simpleDraweeView2, linearLayout, textView4, textView5);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DetailGuesslikeItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CardView getRoot() {
        return this.f18395b;
    }

    @NonNull
    public static DetailGuesslikeItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.detail_guesslike_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
