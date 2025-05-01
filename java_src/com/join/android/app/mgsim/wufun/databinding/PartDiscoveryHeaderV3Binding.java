package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.youth.banner.Banner;
/* loaded from: classes3.dex */
public final class PartDiscoveryHeaderV3Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f25901b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Banner f25902c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f25903d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f25904e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Group f25905f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f25906g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f25907h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25908i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25909j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25910k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f25911l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25912m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ViewPager2 f25913n;

    private PartDiscoveryHeaderV3Binding(@NonNull ConstraintLayout constraintLayout, @NonNull Banner banner, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull Group group, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ViewPager2 viewPager2) {
        this.f25901b = constraintLayout;
        this.f25902c = banner;
        this.f25903d = imageView;
        this.f25904e = imageView2;
        this.f25905f = group;
        this.f25906g = recyclerView;
        this.f25907h = view;
        this.f25908i = textView;
        this.f25909j = textView2;
        this.f25910k = textView3;
        this.f25911l = textView4;
        this.f25912m = textView5;
        this.f25913n = viewPager2;
    }

    @NonNull
    public static PartDiscoveryHeaderV3Binding bind(@NonNull View view) {
        int i4 = R.id.banner;
        Banner banner = (Banner) ViewBindings.findChildViewById(view, R.id.banner);
        if (banner != null) {
            i4 = R.id.bgBattle;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.bgBattle);
            if (imageView != null) {
                i4 = R.id.bgCommunity;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.bgCommunity);
                if (imageView2 != null) {
                    i4 = R.id.groupEndGame;
                    Group group = (Group) ViewBindings.findChildViewById(view, R.id.groupEndGame);
                    if (group != null) {
                        i4 = R.id.indicator;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.indicator);
                        if (recyclerView != null) {
                            i4 = R.id.statubar;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                            if (findChildViewById != null) {
                                i4 = R.id.tvBattleRoomCount;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBattleRoomCount);
                                if (textView != null) {
                                    i4 = R.id.tvCommunityCount;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvCommunityCount);
                                    if (textView2 != null) {
                                        i4 = R.id.tvMore;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMore);
                                        if (textView3 != null) {
                                            i4 = R.id.tvTitleEndGame;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleEndGame);
                                            if (textView4 != null) {
                                                i4 = R.id.tvTitleForum;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitleForum);
                                                if (textView5 != null) {
                                                    i4 = R.id.vpEndGame;
                                                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.vpEndGame);
                                                    if (viewPager2 != null) {
                                                        return new PartDiscoveryHeaderV3Binding((ConstraintLayout) view, banner, imageView, imageView2, group, recyclerView, findChildViewById, textView, textView2, textView3, textView4, textView5, viewPager2);
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
    public static PartDiscoveryHeaderV3Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f25901b;
    }

    @NonNull
    public static PartDiscoveryHeaderV3Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.part_discovery_header_v3, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
