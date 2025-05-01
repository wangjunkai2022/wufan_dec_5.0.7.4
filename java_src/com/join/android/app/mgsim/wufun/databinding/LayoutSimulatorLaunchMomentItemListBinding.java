package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutSimulatorLaunchMomentItemListBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23388b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f23389c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Group f23390d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f23391e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f23392f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f23393g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f23394h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f23395i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f23396j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23397k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f23398l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f23399m;

    private LayoutSimulatorLaunchMomentItemListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull Group group, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull View view2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f23388b = constraintLayout;
        this.f23389c = view;
        this.f23390d = group;
        this.f23391e = simpleDraweeView;
        this.f23392f = imageView;
        this.f23393g = linearLayout;
        this.f23394h = recyclerView;
        this.f23395i = view2;
        this.f23396j = textView;
        this.f23397k = textView2;
        this.f23398l = textView3;
        this.f23399m = textView4;
    }

    @NonNull
    public static LayoutSimulatorLaunchMomentItemListBinding bind(@NonNull View view) {
        int i4 = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.divider);
        if (findChildViewById != null) {
            i4 = R.id.groupAchievement;
            Group group = (Group) ViewBindings.findChildViewById(view, R.id.groupAchievement);
            if (group != null) {
                i4 = R.id.ivAvatar;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivAvatar);
                if (simpleDraweeView != null) {
                    i4 = R.id.ivLike;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivLike);
                    if (imageView != null) {
                        i4 = R.id.llLike;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llLike);
                        if (linearLayout != null) {
                            i4 = R.id.rvAchievement;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvAchievement);
                            if (recyclerView != null) {
                                i4 = R.id.treeLine;
                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.treeLine);
                                if (findChildViewById2 != null) {
                                    i4 = R.id.tvAchievementTitle;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvAchievementTitle);
                                    if (textView != null) {
                                        i4 = R.id.tvDesc;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDesc);
                                        if (textView2 != null) {
                                            i4 = R.id.tvLikeCount;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLikeCount);
                                            if (textView3 != null) {
                                                i4 = R.id.tvName;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvName);
                                                if (textView4 != null) {
                                                    return new LayoutSimulatorLaunchMomentItemListBinding((ConstraintLayout) view, findChildViewById, group, simpleDraweeView, imageView, linearLayout, recyclerView, findChildViewById2, textView, textView2, textView3, textView4);
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
    public static LayoutSimulatorLaunchMomentItemListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23388b;
    }

    @NonNull
    public static LayoutSimulatorLaunchMomentItemListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simulator_launch_moment_item_list, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
