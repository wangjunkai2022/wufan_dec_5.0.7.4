package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ViewActivityTabViewThreeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f27003b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f27004c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f27005d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f27006e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f27007f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f27008g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f27009h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f27010i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27011j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f27012k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f27013l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f27014m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f27015n;

    private ViewActivityTabViewThreeBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f27003b = relativeLayout;
        this.f27004c = imageView;
        this.f27005d = imageView2;
        this.f27006e = imageView3;
        this.f27007f = linearLayout;
        this.f27008g = linearLayout2;
        this.f27009h = linearLayout3;
        this.f27010i = textView;
        this.f27011j = textView2;
        this.f27012k = textView3;
        this.f27013l = textView4;
        this.f27014m = textView5;
        this.f27015n = textView6;
    }

    @NonNull
    public static ViewActivityTabViewThreeBinding bind(@NonNull View view) {
        int i4 = R.id.iv_icon_1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_1);
        if (imageView != null) {
            i4 = R.id.iv_icon_2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_2);
            if (imageView2 != null) {
                i4 = R.id.iv_icon_3;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_3);
                if (imageView3 != null) {
                    i4 = R.id.ll_tab_1;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_tab_1);
                    if (linearLayout != null) {
                        i4 = R.id.ll_tab_2;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_tab_2);
                        if (linearLayout2 != null) {
                            i4 = R.id.ll_tab_3;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_tab_3);
                            if (linearLayout3 != null) {
                                i4 = R.id.tv_desc_1;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_1);
                                if (textView != null) {
                                    i4 = R.id.tv_desc_2;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_2);
                                    if (textView2 != null) {
                                        i4 = R.id.tv_desc_3;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc_3);
                                        if (textView3 != null) {
                                            i4 = R.id.tv_title_1;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_1);
                                            if (textView4 != null) {
                                                i4 = R.id.tv_title_2;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_2);
                                                if (textView5 != null) {
                                                    i4 = R.id.tv_title_3;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title_3);
                                                    if (textView6 != null) {
                                                        return new ViewActivityTabViewThreeBinding((RelativeLayout) view, imageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, textView, textView2, textView3, textView4, textView5, textView6);
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
    public static ViewActivityTabViewThreeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f27003b;
    }

    @NonNull
    public static ViewActivityTabViewThreeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_activity_tab_view_three, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
