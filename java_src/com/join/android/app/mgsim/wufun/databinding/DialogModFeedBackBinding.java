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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogModFeedBackBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18872b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18873c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f18874d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18875e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18876f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18877g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18878h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18879i;

    private DialogModFeedBackBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f18872b = linearLayout;
        this.f18873c = imageView;
        this.f18874d = simpleDraweeView;
        this.f18875e = textView;
        this.f18876f = textView2;
        this.f18877g = textView3;
        this.f18878h = textView4;
        this.f18879i = textView5;
    }

    @NonNull
    public static DialogModFeedBackBinding bind(@NonNull View view) {
        int i4 = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
        if (imageView != null) {
            i4 = R.id.sdv_image;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.sdv_image);
            if (simpleDraweeView != null) {
                i4 = R.id.tv_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_content);
                if (textView != null) {
                    i4 = R.id.tv_name;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                    if (textView2 != null) {
                        i4 = R.id.tv_opt_1;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_opt_1);
                        if (textView3 != null) {
                            i4 = R.id.tv_opt_2;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_opt_2);
                            if (textView4 != null) {
                                i4 = R.id.tv_title;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                if (textView5 != null) {
                                    return new DialogModFeedBackBinding((LinearLayout) view, imageView, simpleDraweeView, textView, textView2, textView3, textView4, textView5);
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
    public static DialogModFeedBackBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18872b;
    }

    @NonNull
    public static DialogModFeedBackBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_mod_feed_back, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
