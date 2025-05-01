package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ChioceItemRecommand1CoverBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17768b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f17769c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17770d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f17771e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17772f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f17773g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17774h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17775i;

    private ChioceItemRecommand1CoverBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f17768b = relativeLayout;
        this.f17769c = simpleDraweeView;
        this.f17770d = textView;
        this.f17771e = simpleDraweeView2;
        this.f17772f = linearLayout;
        this.f17773g = relativeLayout2;
        this.f17774h = textView2;
        this.f17775i = textView3;
    }

    @NonNull
    public static ChioceItemRecommand1CoverBinding bind(@NonNull View view) {
        int i4 = R.id.cover;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.cover);
        if (simpleDraweeView != null) {
            i4 = R.id.desc;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
            if (textView != null) {
                i4 = R.id.icon;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                if (simpleDraweeView2 != null) {
                    i4 = R.id.ll;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll);
                    if (linearLayout != null) {
                        i4 = R.id.main;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.main);
                        if (relativeLayout != null) {
                            i4 = R.id.name;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                            if (textView2 != null) {
                                i4 = R.id.rank;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.rank);
                                if (textView3 != null) {
                                    return new ChioceItemRecommand1CoverBinding((RelativeLayout) view, simpleDraweeView, textView, simpleDraweeView2, linearLayout, relativeLayout, textView2, textView3);
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
    public static ChioceItemRecommand1CoverBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17768b;
    }

    @NonNull
    public static ChioceItemRecommand1CoverBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_recommand_1_cover, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
