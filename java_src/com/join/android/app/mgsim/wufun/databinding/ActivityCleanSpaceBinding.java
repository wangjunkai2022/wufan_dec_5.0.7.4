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
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityCleanSpaceBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f15752b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f15753c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CardView f15754d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f15755e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f15756f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Group f15757g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final Group f15758h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final Group f15759i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RelativeLayout f15760j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final NestedScrollView f15761k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RecyclerView f15762l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RecyclerView f15763m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final View f15764n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f15765o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f15766p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f15767q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f15768r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f15769s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f15770t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f15771u;

    private ActivityCleanSpaceBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull CardView cardView, @NonNull ImageView imageView2, @NonNull FrameLayout frameLayout, @NonNull Group group, @NonNull Group group2, @NonNull Group group3, @NonNull RelativeLayout relativeLayout, @NonNull NestedScrollView nestedScrollView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f15752b = constraintLayout;
        this.f15753c = imageView;
        this.f15754d = cardView;
        this.f15755e = imageView2;
        this.f15756f = frameLayout;
        this.f15757g = group;
        this.f15758h = group2;
        this.f15759i = group3;
        this.f15760j = relativeLayout;
        this.f15761k = nestedScrollView;
        this.f15762l = recyclerView;
        this.f15763m = recyclerView2;
        this.f15764n = view;
        this.f15765o = textView;
        this.f15766p = textView2;
        this.f15767q = textView3;
        this.f15768r = textView4;
        this.f15769s = textView5;
        this.f15770t = textView6;
        this.f15771u = textView7;
    }

    @NonNull
    public static ActivityCleanSpaceBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.cardCleanSys;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cardCleanSys);
            if (cardView != null) {
                i4 = R.id.checkboxSys;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.checkboxSys);
                if (imageView2 != null) {
                    i4 = R.id.flBottom;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.flBottom);
                    if (frameLayout != null) {
                        i4 = R.id.groupContent;
                        Group group = (Group) ViewBindings.findChildViewById(view, R.id.groupContent);
                        if (group != null) {
                            i4 = R.id.groupMyGame;
                            Group group2 = (Group) ViewBindings.findChildViewById(view, R.id.groupMyGame);
                            if (group2 != null) {
                                i4 = R.id.groupSimulator;
                                Group group3 = (Group) ViewBindings.findChildViewById(view, R.id.groupSimulator);
                                if (group3 != null) {
                                    i4 = R.id.headview;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.headview);
                                    if (relativeLayout != null) {
                                        i4 = R.id.nes;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, R.id.nes);
                                        if (nestedScrollView != null) {
                                            i4 = R.id.rvMyGame;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvMyGame);
                                            if (recyclerView != null) {
                                                i4 = R.id.rvSimulator;
                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvSimulator);
                                                if (recyclerView2 != null) {
                                                    i4 = R.id.statubar;
                                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                                                    if (findChildViewById != null) {
                                                        i4 = R.id.title_textview;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                                        if (textView != null) {
                                                            i4 = R.id.tvClean;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvClean);
                                                            if (textView2 != null) {
                                                                i4 = R.id.tvDescMyGame;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDescMyGame);
                                                                if (textView3 != null) {
                                                                    i4 = R.id.tvSysSpace;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvSysSpace);
                                                                    if (textView4 != null) {
                                                                        i4 = R.id.tvTitleMyGame;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleMyGame);
                                                                        if (textView5 != null) {
                                                                            i4 = R.id.tvTitleSimulator;
                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleSimulator);
                                                                            if (textView6 != null) {
                                                                                i4 = R.id.tvTotalData;
                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalData);
                                                                                if (textView7 != null) {
                                                                                    return new ActivityCleanSpaceBinding((ConstraintLayout) view, imageView, cardView, imageView2, frameLayout, group, group2, group3, relativeLayout, nestedScrollView, recyclerView, recyclerView2, findChildViewById, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static ActivityCleanSpaceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f15752b;
    }

    @NonNull
    public static ActivityCleanSpaceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_clean_space, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
