package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CirclePageIndicator;
/* loaded from: classes3.dex */
public final class MgMiniDetialLayoutBinding implements ViewBinding {
    @NonNull
    public final RelativeLayout A;
    @NonNull
    public final TextView B;
    @NonNull
    public final LinearLayout C;
    @NonNull
    public final WebView D;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24635b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24636c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24637d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f24638e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f24639f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f24640g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f24641h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f24642i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RelativeLayout f24643j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ViewPager f24644k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f24645l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f24646m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final Button f24647n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f24648o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final CirclePageIndicator f24649p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final Button f24650q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f24651r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final Button f24652s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f24653t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f24654u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final LinearLayout f24655v;
    @NonNull

    /* renamed from: w  reason: collision with root package name */
    public final RelativeLayout f24656w;
    @NonNull

    /* renamed from: x  reason: collision with root package name */
    public final ScrollView f24657x;
    @NonNull

    /* renamed from: y  reason: collision with root package name */
    public final ImageView f24658y;
    @NonNull

    /* renamed from: z  reason: collision with root package name */
    public final LinearLayout f24659z;

    private MgMiniDetialLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ProgressBar progressBar, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout3, @NonNull ViewPager viewPager, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout4, @NonNull Button button, @NonNull TextView textView3, @NonNull CirclePageIndicator circlePageIndicator, @NonNull Button button2, @NonNull RelativeLayout relativeLayout5, @NonNull Button button3, @NonNull ImageView imageView2, @NonNull TextView textView4, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout6, @NonNull ScrollView scrollView, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout4, @NonNull RelativeLayout relativeLayout7, @NonNull TextView textView5, @NonNull LinearLayout linearLayout5, @NonNull WebView webView) {
        this.f24635b = relativeLayout;
        this.f24636c = textView;
        this.f24637d = linearLayout;
        this.f24638e = relativeLayout2;
        this.f24639f = progressBar;
        this.f24640g = imageView;
        this.f24641h = linearLayout2;
        this.f24642i = simpleDraweeView;
        this.f24643j = relativeLayout3;
        this.f24644k = viewPager;
        this.f24645l = textView2;
        this.f24646m = relativeLayout4;
        this.f24647n = button;
        this.f24648o = textView3;
        this.f24649p = circlePageIndicator;
        this.f24650q = button2;
        this.f24651r = relativeLayout5;
        this.f24652s = button3;
        this.f24653t = imageView2;
        this.f24654u = textView4;
        this.f24655v = linearLayout3;
        this.f24656w = relativeLayout6;
        this.f24657x = scrollView;
        this.f24658y = imageView3;
        this.f24659z = linearLayout4;
        this.A = relativeLayout7;
        this.B = textView5;
        this.C = linearLayout5;
        this.D = webView;
    }

    @NonNull
    public static MgMiniDetialLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
        if (textView != null) {
            i4 = R.id.appinfo;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.appinfo);
            if (linearLayout != null) {
                i4 = R.id.bottomLayout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.bottomLayout);
                if (relativeLayout != null) {
                    i4 = R.id.butnProgressBar;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.butnProgressBar);
                    if (progressBar != null) {
                        i4 = R.id.butn_showdownload;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.butn_showdownload);
                        if (imageView != null) {
                            i4 = R.id.detialDownBottom;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.detialDownBottom);
                            if (linearLayout2 != null) {
                                i4 = R.id.detialIconImage;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.detialIconImage);
                                if (simpleDraweeView != null) {
                                    i4 = R.id.detial_main_layout;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.detial_main_layout);
                                    if (relativeLayout2 != null) {
                                        i4 = R.id.detial_mini_viewpager;
                                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.detial_mini_viewpager);
                                        if (viewPager != null) {
                                            i4 = R.id.downCountAndSize;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.downCountAndSize);
                                            if (textView2 != null) {
                                                i4 = R.id.downloadRLayout;
                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.downloadRLayout);
                                                if (relativeLayout3 != null) {
                                                    i4 = R.id.fourmButn;
                                                    Button button = (Button) ViewBindings.findChildViewById(view, R.id.fourmButn);
                                                    if (button != null) {
                                                        i4 = R.id.iWillUp;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.iWillUp);
                                                        if (textView3 != null) {
                                                            i4 = R.id.indecater;
                                                            CirclePageIndicator circlePageIndicator = (CirclePageIndicator) ViewBindings.findChildViewById(view, R.id.indecater);
                                                            if (circlePageIndicator != null) {
                                                                i4 = R.id.instalButtomButn;
                                                                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.instalButtomButn);
                                                                if (button2 != null) {
                                                                    i4 = R.id.instalbutnLayout;
                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.instalbutnLayout);
                                                                    if (relativeLayout4 != null) {
                                                                        i4 = R.id.installButn;
                                                                        Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.installButn);
                                                                        if (button3 != null) {
                                                                            i4 = R.id.loding_back;
                                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.loding_back);
                                                                            if (imageView2 != null) {
                                                                                i4 = R.id.percent;
                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.percent);
                                                                                if (textView4 != null) {
                                                                                    i4 = R.id.progress_layout;
                                                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.progress_layout);
                                                                                    if (linearLayout3 != null) {
                                                                                        i4 = R.id.progressbarLayout;
                                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.progressbarLayout);
                                                                                        if (relativeLayout5 != null) {
                                                                                            i4 = R.id.scrollView;
                                                                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                                                            if (scrollView != null) {
                                                                                                i4 = R.id.shareBtn;
                                                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.shareBtn);
                                                                                                if (imageView3 != null) {
                                                                                                    i4 = R.id.shareLayout;
                                                                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.shareLayout);
                                                                                                    if (linearLayout4 != null) {
                                                                                                        i4 = R.id.shareRLayout;
                                                                                                        RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.shareRLayout);
                                                                                                        if (relativeLayout6 != null) {
                                                                                                            i4 = R.id.shareUser;
                                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.shareUser);
                                                                                                            if (textView5 != null) {
                                                                                                                i4 = R.id.tipsLayout;
                                                                                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                                                                                if (linearLayout5 != null) {
                                                                                                                    i4 = R.id.webView;
                                                                                                                    WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.webView);
                                                                                                                    if (webView != null) {
                                                                                                                        return new MgMiniDetialLayoutBinding((RelativeLayout) view, textView, linearLayout, relativeLayout, progressBar, imageView, linearLayout2, simpleDraweeView, relativeLayout2, viewPager, textView2, relativeLayout3, button, textView3, circlePageIndicator, button2, relativeLayout4, button3, imageView2, textView4, linearLayout3, relativeLayout5, scrollView, imageView3, linearLayout4, relativeLayout6, textView5, linearLayout5, webView);
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
    public static MgMiniDetialLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24635b;
    }

    @NonNull
    public static MgMiniDetialLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_mini_detial_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
