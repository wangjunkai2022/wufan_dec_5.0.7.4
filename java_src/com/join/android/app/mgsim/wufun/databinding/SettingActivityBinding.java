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
public final class SettingActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26487b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26488c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26489d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26490e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f26491f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26492g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f26493h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final RelativeLayout f26494i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26495j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RelativeLayout f26496k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f26497l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26498m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TopbarLeftTitleLayoutBinding f26499n;

    private SettingActivityBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView3, @NonNull TopbarLeftTitleLayoutBinding topbarLeftTitleLayoutBinding) {
        this.f26487b = linearLayout;
        this.f26488c = textView;
        this.f26489d = imageView;
        this.f26490e = imageView2;
        this.f26491f = relativeLayout;
        this.f26492g = imageView3;
        this.f26493h = imageView4;
        this.f26494i = relativeLayout2;
        this.f26495j = textView2;
        this.f26496k = relativeLayout3;
        this.f26497l = relativeLayout4;
        this.f26498m = textView3;
        this.f26499n = topbarLeftTitleLayoutBinding;
    }

    @NonNull
    public static SettingActivityBinding bind(@NonNull View view) {
        int i4 = R.id.about;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.about);
        if (textView != null) {
            i4 = R.id.arrowImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.arrowImage);
            if (imageView != null) {
                i4 = R.id.arrowImageAbout;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.arrowImageAbout);
                if (imageView2 != null) {
                    i4 = R.id.checkVerLayout;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.checkVerLayout);
                    if (relativeLayout != null) {
                        i4 = R.id.imageView3;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView3);
                        if (imageView3 != null) {
                            i4 = R.id.imageView5;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
                            if (imageView4 != null) {
                                i4 = R.id.papaAboutLayout;
                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.papaAboutLayout);
                                if (relativeLayout2 != null) {
                                    i4 = R.id.papaVer;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.papaVer);
                                    if (textView2 != null) {
                                        i4 = R.id.responsibility;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.responsibility);
                                        if (relativeLayout3 != null) {
                                            i4 = R.id.shareToFrendsLayout;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.shareToFrendsLayout);
                                            if (relativeLayout4 != null) {
                                                i4 = R.id.textView;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                                                if (textView3 != null) {
                                                    i4 = R.id.title_bar_layout;
                                                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.title_bar_layout);
                                                    if (findChildViewById != null) {
                                                        return new SettingActivityBinding((LinearLayout) view, textView, imageView, imageView2, relativeLayout, imageView3, imageView4, relativeLayout2, textView2, relativeLayout3, relativeLayout4, textView3, TopbarLeftTitleLayoutBinding.bind(findChildViewById));
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
    public static SettingActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26487b;
    }

    @NonNull
    public static SettingActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.setting_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
