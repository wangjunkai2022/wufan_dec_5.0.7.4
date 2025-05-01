package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ViewGameDetailGameInfoPcBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27053b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final HorizontalScrollView f27054c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f27055d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f27056e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f27057f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f27058g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final SimpleDraweeView f27059h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f27060i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27061j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27062k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final View f27063l;

    private ViewGameDetailGameInfoPcBinding(@NonNull LinearLayout linearLayout, @NonNull HorizontalScrollView horizontalScrollView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view) {
        this.f27053b = linearLayout;
        this.f27054c = horizontalScrollView;
        this.f27055d = linearLayout2;
        this.f27056e = linearLayout3;
        this.f27057f = simpleDraweeView;
        this.f27058g = simpleDraweeView2;
        this.f27059h = simpleDraweeView3;
        this.f27060i = textView;
        this.f27061j = textView2;
        this.f27062k = textView3;
        this.f27063l = view;
    }

    @NonNull
    public static ViewGameDetailGameInfoPcBinding bind(@NonNull View view) {
        int i4 = R.id.hsv_tags;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, R.id.hsv_tags);
        if (horizontalScrollView != null) {
            i4 = R.id.ll_share_by;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_share_by);
            if (linearLayout != null) {
                i4 = R.id.ll_tags;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_tags);
                if (linearLayout2 != null) {
                    i4 = R.id.sdv_game_icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_game_icon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.sdv_share_user;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_share_user);
                        if (simpleDraweeView2 != null) {
                            i4 = R.id.sdv_top_ad;
                            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_top_ad);
                            if (simpleDraweeView3 != null) {
                                i4 = R.id.tv_app_name;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_app_name);
                                if (textView != null) {
                                    i4 = R.id.tv_game_desc;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_game_desc);
                                    if (textView2 != null) {
                                        i4 = R.id.tv_score;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_score);
                                        if (textView3 != null) {
                                            i4 = R.id.v_score;
                                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_score);
                                            if (findChildViewById != null) {
                                                return new ViewGameDetailGameInfoPcBinding((LinearLayout) view, horizontalScrollView, linearLayout, linearLayout2, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, textView, textView2, textView3, findChildViewById);
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
    public static ViewGameDetailGameInfoPcBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27053b;
    }

    @NonNull
    public static ViewGameDetailGameInfoPcBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_game_detail_game_info_pc, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
