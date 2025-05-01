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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutMainLabelHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23134b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23135c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f23136d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f23137e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f23138f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f23139g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f23140h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23141i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f23142j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23143k;

    private LayoutMainLabelHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView2, @NonNull View view, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f23134b = linearLayout;
        this.f23135c = textView;
        this.f23136d = imageView;
        this.f23137e = simpleDraweeView;
        this.f23138f = imageView2;
        this.f23139g = view;
        this.f23140h = relativeLayout;
        this.f23141i = textView2;
        this.f23142j = textView3;
        this.f23143k = textView4;
    }

    @NonNull
    public static LayoutMainLabelHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.btnFocus;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btnFocus);
        if (textView != null) {
            i4 = R.id.iv_close_send_posting;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close_send_posting);
            if (imageView != null) {
                i4 = R.id.iv_label_icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.iv_label_icon);
                if (simpleDraweeView != null) {
                    i4 = R.id.iv_posts_filter_switch;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_posts_filter_switch);
                    if (imageView2 != null) {
                        i4 = R.id.rl_last;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.rl_last);
                        if (findChildViewById != null) {
                            i4 = R.id.rl_posts_filter;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_posts_filter);
                            if (relativeLayout != null) {
                                i4 = R.id.tv_label_introduction;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_introduction);
                                if (textView2 != null) {
                                    i4 = R.id.tv_label_name;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_label_name);
                                    if (textView3 != null) {
                                        i4 = R.id.tv_posts_filter_name;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_posts_filter_name);
                                        if (textView4 != null) {
                                            return new LayoutMainLabelHeaderBinding((LinearLayout) view, textView, imageView, simpleDraweeView, imageView2, findChildViewById, relativeLayout, textView2, textView3, textView4);
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
    public static LayoutMainLabelHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23134b;
    }

    @NonNull
    public static LayoutMainLabelHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_main_label_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
