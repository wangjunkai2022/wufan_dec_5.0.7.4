package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.ExpandLayout;
/* loaded from: classes3.dex */
public final class GamedetailItemEditRecommendBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20541b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20542c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ExpandLayout f20543d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f20544e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f20545f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f20546g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f20547h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f20548i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f20549j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f20550k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f20551l;

    private GamedetailItemEditRecommendBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ExpandLayout expandLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull View view2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f20541b = linearLayout;
        this.f20542c = linearLayout2;
        this.f20543d = expandLayout;
        this.f20544e = imageView;
        this.f20545f = view;
        this.f20546g = view2;
        this.f20547h = linearLayout3;
        this.f20548i = linearLayout4;
        this.f20549j = textView;
        this.f20550k = textView2;
        this.f20551l = textView3;
    }

    @NonNull
    public static GamedetailItemEditRecommendBinding bind(@NonNull View view) {
        int i4 = R.id.backLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.backLayout);
        if (linearLayout != null) {
            i4 = R.id.el_view;
            ExpandLayout expandLayout = (ExpandLayout) ViewBindings.findChildViewById(view, R.id.el_view);
            if (expandLayout != null) {
                i4 = R.id.imageView5;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
                if (imageView != null) {
                    i4 = R.id.layoutTop;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.layoutTop);
                    if (findChildViewById != null) {
                        i4 = R.id.line_h;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.line_h);
                        if (findChildViewById2 != null) {
                            i4 = R.id.ll_container;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_container);
                            if (linearLayout2 != null) {
                                i4 = R.id.look_other;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.look_other);
                                if (linearLayout3 != null) {
                                    i4 = R.id.moreText;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.moreText);
                                    if (textView != null) {
                                        i4 = R.id.titleText;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                                        if (textView2 != null) {
                                            i4 = R.id.tv_view;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_view);
                                            if (textView3 != null) {
                                                return new GamedetailItemEditRecommendBinding((LinearLayout) view, linearLayout, expandLayout, imageView, findChildViewById, findChildViewById2, linearLayout2, linearLayout3, textView, textView2, textView3);
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
    public static GamedetailItemEditRecommendBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20541b;
    }

    @NonNull
    public static GamedetailItemEditRecommendBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_edit_recommend, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
