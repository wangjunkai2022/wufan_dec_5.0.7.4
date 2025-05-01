package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
public final class LayoutPapaMainHomeV4WufunColumnBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23230b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f23231c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f23232d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23233e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f23234f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f23235g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f23236h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23237i;

    private LayoutPapaMainHomeV4WufunColumnBinding(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull TextView textView2) {
        this.f23230b = constraintLayout;
        this.f23231c = frameLayout;
        this.f23232d = simpleDraweeView;
        this.f23233e = textView;
        this.f23234f = simpleDraweeView2;
        this.f23235g = view;
        this.f23236h = recyclerView;
        this.f23237i = textView2;
    }

    @NonNull
    public static LayoutPapaMainHomeV4WufunColumnBinding bind(@NonNull View view) {
        int i4 = R.id.card_dzg;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.card_dzg);
        if (frameLayout != null) {
            i4 = R.id.dzg_img;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.dzg_img);
            if (simpleDraweeView != null) {
                i4 = R.id.dzg_sub_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dzg_sub_title);
                if (textView != null) {
                    i4 = R.id.img_ad;
                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_ad);
                    if (simpleDraweeView2 != null) {
                        i4 = R.id.img_new;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.img_new);
                        if (findChildViewById != null) {
                            i4 = R.id.rv_new;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_new);
                            if (recyclerView != null) {
                                i4 = R.id.tv_new_count;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_new_count);
                                if (textView2 != null) {
                                    return new LayoutPapaMainHomeV4WufunColumnBinding((ConstraintLayout) view, frameLayout, simpleDraweeView, textView, simpleDraweeView2, findChildViewById, recyclerView, textView2);
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
    public static LayoutPapaMainHomeV4WufunColumnBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23230b;
    }

    @NonNull
    public static LayoutPapaMainHomeV4WufunColumnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_papa_main_home_v4_wufun_column, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
