package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityUninstallWufunBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f17146b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f17147c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CardView f17148d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CardView f17149e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f17150f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f17151g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f17152h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f17153i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RecyclerView f17154j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f17155k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f17156l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f17157m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17158n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f17159o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f17160p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f17161q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f17162r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f17163s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f17164t;

    private ActivityUninstallWufunBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull CardView cardView, @NonNull CardView cardView2, @NonNull FrameLayout frameLayout, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.f17146b = constraintLayout;
        this.f17147c = imageView;
        this.f17148d = cardView;
        this.f17149e = cardView2;
        this.f17150f = frameLayout;
        this.f17151g = relativeLayout;
        this.f17152h = linearLayout;
        this.f17153i = linearLayout2;
        this.f17154j = recyclerView;
        this.f17155k = view;
        this.f17156l = textView;
        this.f17157m = textView2;
        this.f17158n = textView3;
        this.f17159o = textView4;
        this.f17160p = textView5;
        this.f17161q = textView6;
        this.f17162r = textView7;
        this.f17163s = textView8;
        this.f17164t = textView9;
    }

    @NonNull
    public static ActivityUninstallWufunBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.cardClean;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cardClean);
            if (cardView != null) {
                i4 = R.id.cardRecom;
                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.cardRecom);
                if (cardView2 != null) {
                    i4 = R.id.flRecom;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.flRecom);
                    if (frameLayout != null) {
                        i4 = R.id.headview;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.headview);
                        if (relativeLayout != null) {
                            i4 = R.id.llBottom;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llBottom);
                            if (linearLayout != null) {
                                i4 = R.id.llLocalArchiveGame;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llLocalArchiveGame);
                                if (linearLayout2 != null) {
                                    i4 = R.id.rvRecom;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvRecom);
                                    if (recyclerView != null) {
                                        i4 = R.id.statubar;
                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                                        if (findChildViewById != null) {
                                            i4 = R.id.title_textview;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                            if (textView != null) {
                                                i4 = R.id.tvClean;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvClean);
                                                if (textView2 != null) {
                                                    i4 = R.id.tvCleanSpace;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvCleanSpace);
                                                    if (textView3 != null) {
                                                        i4 = R.id.tvFinish;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvFinish);
                                                        if (textView4 != null) {
                                                            i4 = R.id.tvGameTag;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameTag);
                                                            if (textView5 != null) {
                                                                i4 = R.id.tvNoArchieveGame;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvNoArchieveGame);
                                                                if (textView6 != null) {
                                                                    i4 = R.id.tvTotalDataSize;
                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalDataSize);
                                                                    if (textView7 != null) {
                                                                        i4 = R.id.tvTotalGamePkgSize;
                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalGamePkgSize);
                                                                        if (textView8 != null) {
                                                                            i4 = R.id.tvUninstall;
                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvUninstall);
                                                                            if (textView9 != null) {
                                                                                return new ActivityUninstallWufunBinding((ConstraintLayout) view, imageView, cardView, cardView2, frameLayout, relativeLayout, linearLayout, linearLayout2, recyclerView, findChildViewById, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static ActivityUninstallWufunBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f17146b;
    }

    @NonNull
    public static ActivityUninstallWufunBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_uninstall_wufun, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
