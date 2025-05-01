package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutDiscoveryPaiweiViewpagerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22990b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22991c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CardView f22992d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CardView f22993e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final CardView f22994f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f22995g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final Group f22996h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RecyclerView f22997i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22998j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f22999k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f23000l;

    private LayoutDiscoveryPaiweiViewpagerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull CardView cardView, @NonNull CardView cardView2, @NonNull CardView cardView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull Group group, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f22990b = constraintLayout;
        this.f22991c = imageView;
        this.f22992d = cardView;
        this.f22993e = cardView2;
        this.f22994f = cardView3;
        this.f22995g = simpleDraweeView;
        this.f22996h = group;
        this.f22997i = recyclerView;
        this.f22998j = textView;
        this.f22999k = textView2;
        this.f23000l = textView3;
    }

    @NonNull
    public static LayoutDiscoveryPaiweiViewpagerBinding bind(@NonNull View view) {
        int i4 = R.id.bgChanllengeCount;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.bgChanllengeCount);
        if (imageView != null) {
            i4 = R.id.btnStart;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.btnStart);
            if (cardView != null) {
                i4 = R.id.card;
                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card);
                if (cardView2 != null) {
                    i4 = R.id.flMyRank;
                    CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, R.id.flMyRank);
                    if (cardView3 != null) {
                        i4 = R.id.imgCover;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.imgCover);
                        if (simpleDraweeView != null) {
                            i4 = R.id.main;
                            Group group = (Group) ViewBindings.findChildViewById(view, R.id.main);
                            if (group != null) {
                                i4 = R.id.rvRank;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvRank);
                                if (recyclerView != null) {
                                    i4 = R.id.tvChanllengeCount;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvChanllengeCount);
                                    if (textView != null) {
                                        i4 = R.id.tvMyRank;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMyRank);
                                        if (textView2 != null) {
                                            i4 = R.id.tvStart;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvStart);
                                            if (textView3 != null) {
                                                return new LayoutDiscoveryPaiweiViewpagerBinding((ConstraintLayout) view, imageView, cardView, cardView2, cardView3, simpleDraweeView, group, recyclerView, textView, textView2, textView3);
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
    public static LayoutDiscoveryPaiweiViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22990b;
    }

    @NonNull
    public static LayoutDiscoveryPaiweiViewpagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_discovery_paiwei_viewpager, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
