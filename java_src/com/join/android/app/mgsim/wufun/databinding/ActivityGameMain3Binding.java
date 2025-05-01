package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityGameMain3Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f16248b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f16249c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f16250d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f16251e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f16252f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f16253g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final GridView f16254h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RecyclerView f16255i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16256j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f16257k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ConstraintLayout f16258l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f16259m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f16260n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f16261o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f16262p;

    private ActivityGameMain3Binding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull GridView gridView, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout3, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull TextView textView3) {
        this.f16248b = constraintLayout;
        this.f16249c = view;
        this.f16250d = imageView;
        this.f16251e = constraintLayout2;
        this.f16252f = frameLayout;
        this.f16253g = simpleDraweeView;
        this.f16254h = gridView;
        this.f16255i = recyclerView;
        this.f16256j = textView;
        this.f16257k = imageView2;
        this.f16258l = constraintLayout3;
        this.f16259m = linearLayout;
        this.f16260n = textView2;
        this.f16261o = imageView3;
        this.f16262p = textView3;
    }

    @NonNull
    public static ActivityGameMain3Binding bind(@NonNull View view) {
        int i4 = R.id.back;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.back);
        if (findChildViewById != null) {
            i4 = R.id.battleHall;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.battleHall);
            if (imageView != null) {
                i4 = R.id.constraintLayout9;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout9);
                if (constraintLayout != null) {
                    i4 = R.id.frameLayout;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.frameLayout);
                    if (frameLayout != null) {
                        i4 = R.id.gameImg;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.gameImg);
                        if (simpleDraweeView != null) {
                            i4 = R.id.gameMainNewLeftGv;
                            GridView gridView = (GridView) ViewBindings.findChildViewById(view, R.id.gameMainNewLeftGv);
                            if (gridView != null) {
                                i4 = R.id.gameMainNewRv;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.gameMainNewRv);
                                if (recyclerView != null) {
                                    i4 = R.id.gameName;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameName);
                                    if (textView != null) {
                                        i4 = R.id.imageView80;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView80);
                                        if (imageView2 != null) {
                                            i4 = R.id.leftContainer;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.leftContainer);
                                            if (constraintLayout2 != null) {
                                                i4 = R.id.ll_loading;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_loading);
                                                if (linearLayout != null) {
                                                    i4 = R.id.roomCount;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.roomCount);
                                                    if (textView2 != null) {
                                                        i4 = R.id.startGame;
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.startGame);
                                                        if (imageView3 != null) {
                                                            i4 = R.id.tv_loading_info;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_loading_info);
                                                            if (textView3 != null) {
                                                                return new ActivityGameMain3Binding((ConstraintLayout) view, findChildViewById, imageView, constraintLayout, frameLayout, simpleDraweeView, gridView, recyclerView, textView, imageView2, constraintLayout2, linearLayout, textView2, imageView3, textView3);
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
    public static ActivityGameMain3Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f16248b;
    }

    @NonNull
    public static ActivityGameMain3Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_game_main_3, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
