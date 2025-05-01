package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityEndGameBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f16018b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16019c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f16020d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16021e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f16022f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f16023g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f16024h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RecyclerView f16025i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RecyclerView f16026j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f16027k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final View f16028l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f16029m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ViewPager2 f16030n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ViewPager2 f16031o;

    private ActivityEndGameBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull View view, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull View view2, @NonNull View view3, @NonNull TextView textView2, @NonNull ViewPager2 viewPager2, @NonNull ViewPager2 viewPager22) {
        this.f16018b = constraintLayout;
        this.f16019c = imageView;
        this.f16020d = constraintLayout2;
        this.f16021e = textView;
        this.f16022f = view;
        this.f16023g = imageView2;
        this.f16024h = relativeLayout;
        this.f16025i = recyclerView;
        this.f16026j = recyclerView2;
        this.f16027k = view2;
        this.f16028l = view3;
        this.f16029m = textView2;
        this.f16030n = viewPager2;
        this.f16031o = viewPager22;
    }

    @NonNull
    public static ActivityEndGameBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.clGameSelect;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.clGameSelect);
            if (constraintLayout != null) {
                i4 = R.id.createEndGame;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.createEndGame);
                if (textView != null) {
                    i4 = R.id.divider;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
                    if (findChildViewById != null) {
                        i4 = R.id.ivExpand;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivExpand);
                        if (imageView2 != null) {
                            i4 = R.id.rlTitle;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rlTitle);
                            if (relativeLayout != null) {
                                i4 = R.id.rvGameSelect;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvGameSelect);
                                if (recyclerView != null) {
                                    i4 = R.id.rvGameSelectTag;
                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvGameSelectTag);
                                    if (recyclerView2 != null) {
                                        i4 = R.id.shadowMask;
                                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.shadowMask);
                                        if (findChildViewById2 != null) {
                                            i4 = R.id.statubar;
                                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.statubar);
                                            if (findChildViewById3 != null) {
                                                i4 = R.id.title_textview;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                                if (textView2 != null) {
                                                    i4 = R.id.viewpager;
                                                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.viewpager);
                                                    if (viewPager2 != null) {
                                                        i4 = R.id.vpGameList;
                                                        ViewPager2 viewPager22 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.vpGameList);
                                                        if (viewPager22 != null) {
                                                            return new ActivityEndGameBinding((ConstraintLayout) view, imageView, constraintLayout, textView, findChildViewById, imageView2, relativeLayout, recyclerView, recyclerView2, findChildViewById2, findChildViewById3, textView2, viewPager2, viewPager22);
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
    public static ActivityEndGameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f16018b;
    }

    @NonNull
    public static ActivityEndGameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_end_game, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
