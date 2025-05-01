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
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityDiscoveryPaiweiBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f15981b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f15982c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f15983d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Group f15984e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f15985f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f15986g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f15987h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ViewPager2 f15988i;

    private ActivityDiscoveryPaiweiBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull Group group, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull TextView textView, @NonNull ViewPager2 viewPager2) {
        this.f15981b = constraintLayout;
        this.f15982c = imageView;
        this.f15983d = relativeLayout;
        this.f15984e = group;
        this.f15985f = recyclerView;
        this.f15986g = view;
        this.f15987h = textView;
        this.f15988i = viewPager2;
    }

    @NonNull
    public static ActivityDiscoveryPaiweiBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.headview;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.headview);
            if (relativeLayout != null) {
                i4 = R.id.main;
                Group group = (Group) ViewBindings.findChildViewById(view, R.id.main);
                if (group != null) {
                    i4 = R.id.rvGame;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvGame);
                    if (recyclerView != null) {
                        i4 = R.id.statubar;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                        if (findChildViewById != null) {
                            i4 = R.id.title_textview;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                            if (textView != null) {
                                i4 = R.id.vpRank;
                                ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.vpRank);
                                if (viewPager2 != null) {
                                    return new ActivityDiscoveryPaiweiBinding((ConstraintLayout) view, imageView, relativeLayout, group, recyclerView, findChildViewById, textView, viewPager2);
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
    public static ActivityDiscoveryPaiweiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f15981b;
    }

    @NonNull
    public static ActivityDiscoveryPaiweiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_discovery_paiwei, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
