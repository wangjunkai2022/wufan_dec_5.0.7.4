package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityUninstallWufunGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f17165b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f17166c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f17167d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CardView f17168e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f17169f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f17170g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final FrameLayout f17171h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ConstraintLayout f17172i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ConstraintLayout f17173j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17174k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SimpleDraweeView f17175l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final SimpleDraweeView f17176m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17177n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f17178o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f17179p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f17180q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f17181r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final RecyclerView f17182s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final View f17183t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f17184u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final FrameLayout f17185v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final TextView f17186w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final TextView f17187x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final TextView f17188y;

    private ActivityUninstallWufunGameBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull CardView cardView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull FrameLayout frameLayout2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull RelativeLayout relativeLayout, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull TextView textView6, @NonNull FrameLayout frameLayout3, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.f17165b = constraintLayout;
        this.f17166c = imageView;
        this.f17167d = frameLayout;
        this.f17168e = cardView;
        this.f17169f = imageView2;
        this.f17170g = imageView3;
        this.f17171h = frameLayout2;
        this.f17172i = constraintLayout2;
        this.f17173j = constraintLayout3;
        this.f17174k = textView;
        this.f17175l = simpleDraweeView;
        this.f17176m = simpleDraweeView2;
        this.f17177n = textView2;
        this.f17178o = textView3;
        this.f17179p = textView4;
        this.f17180q = textView5;
        this.f17181r = relativeLayout;
        this.f17182s = recyclerView;
        this.f17183t = view;
        this.f17184u = textView6;
        this.f17185v = frameLayout3;
        this.f17186w = textView7;
        this.f17187x = textView8;
        this.f17188y = textView9;
    }

    @NonNull
    public static ActivityUninstallWufunGameBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.cardDelete;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.cardDelete);
            if (frameLayout != null) {
                i4 = R.id.cardRecom;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cardRecom);
                if (cardView != null) {
                    i4 = R.id.checkbox1;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.checkbox1);
                    if (imageView2 != null) {
                        i4 = R.id.checkbox2;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.checkbox2);
                        if (imageView3 != null) {
                            i4 = R.id.flRecom;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.flRecom);
                            if (frameLayout2 != null) {
                                i4 = R.id.game1;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.game1);
                                if (constraintLayout != null) {
                                    i4 = R.id.game2;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.game2);
                                    if (constraintLayout2 != null) {
                                        i4 = R.id.gameDesc1;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameDesc1);
                                        if (textView != null) {
                                            i4 = R.id.gameIcon1;
                                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon1);
                                            if (simpleDraweeView != null) {
                                                i4 = R.id.gameIcon2;
                                                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameIcon2);
                                                if (simpleDraweeView2 != null) {
                                                    i4 = R.id.gameName1;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gameName1);
                                                    if (textView2 != null) {
                                                        i4 = R.id.gameName2;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.gameName2);
                                                        if (textView3 != null) {
                                                            i4 = R.id.gameStatus1;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.gameStatus1);
                                                            if (textView4 != null) {
                                                                i4 = R.id.gameStatus2;
                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.gameStatus2);
                                                                if (textView5 != null) {
                                                                    i4 = R.id.headview;
                                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.headview);
                                                                    if (relativeLayout != null) {
                                                                        i4 = R.id.rvRecom;
                                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvRecom);
                                                                        if (recyclerView != null) {
                                                                            i4 = R.id.statubar;
                                                                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                                                                            if (findChildViewById != null) {
                                                                                i4 = R.id.title_textview;
                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                                                                if (textView6 != null) {
                                                                                    i4 = R.id.toComment;
                                                                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.toComment);
                                                                                    if (frameLayout3 != null) {
                                                                                        i4 = R.id.tvDeleteAll;
                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDeleteAll);
                                                                                        if (textView7 != null) {
                                                                                            i4 = R.id.tvDeleteGameOnly;
                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDeleteGameOnly);
                                                                                            if (textView8 != null) {
                                                                                                i4 = R.id.tvGameTag;
                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameTag);
                                                                                                if (textView9 != null) {
                                                                                                    return new ActivityUninstallWufunGameBinding((ConstraintLayout) view, imageView, frameLayout, cardView, imageView2, imageView3, frameLayout2, constraintLayout, constraintLayout2, textView, simpleDraweeView, simpleDraweeView2, textView2, textView3, textView4, textView5, relativeLayout, recyclerView, findChildViewById, textView6, frameLayout3, textView7, textView8, textView9);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityUninstallWufunGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f17165b;
    }

    @NonNull
    public static ActivityUninstallWufunGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_uninstall_wufun_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
