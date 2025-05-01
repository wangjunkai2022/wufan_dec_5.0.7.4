package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GiftDetailActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21334b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21335c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f21336d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21337e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21338f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21339g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21340h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f21341i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ScrollView f21342j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f21343k;

    private GiftDetailActivityBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ScrollView scrollView, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding) {
        this.f21334b = linearLayout;
        this.f21335c = textView;
        this.f21336d = simpleDraweeView;
        this.f21337e = textView2;
        this.f21338f = textView3;
        this.f21339g = textView4;
        this.f21340h = textView5;
        this.f21341i = textView6;
        this.f21342j = scrollView;
        this.f21343k = topbarLeftTitleLayoutBinding;
    }

    @NonNull
    public static GiftDetailActivityBinding bind(@NonNull View view) {
        int i4 = R.id.giftContent;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.giftContent);
        if (textView != null) {
            i4 = R.id.giftIcon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.giftIcon);
            if (simpleDraweeView != null) {
                i4 = R.id.giftMethod;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.giftMethod);
                if (textView2 != null) {
                    i4 = R.id.giftNameTv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.giftNameTv);
                    if (textView3 != null) {
                        i4 = R.id.giftTime;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.giftTime);
                        if (textView4 != null) {
                            i4 = R.id.saveCodeContent;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.saveCodeContent);
                            if (textView5 != null) {
                                i4 = R.id.saveCodeTv;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.saveCodeTv);
                                if (textView6 != null) {
                                    i4 = R.id.scrollView;
                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                    if (scrollView != null) {
                                        i4 = R.id.title_bar_layout;
                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
                                        if (findChildViewById != null) {
                                            return new GiftDetailActivityBinding((LinearLayout) view, textView, simpleDraweeView, textView2, textView3, textView4, textView5, textView6, scrollView, TopbarLeftTitleLayoutBinding.bind(findChildViewById));
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
    public static GiftDetailActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21334b;
    }

    @NonNull
    public static GiftDetailActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gift_detail_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
