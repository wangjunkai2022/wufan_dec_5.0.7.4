package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.LJWebView;
/* loaded from: classes3.dex */
public final class ActivityWebViewSearchBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f17259b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f17260c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final BottomSheetLayout f17261d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f17262e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final DownloadTitleLayoutBinding f17263f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f17264g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17265h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ConstraintLayout f17266i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ConstraintLayout f17267j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ConstraintLayout f17268k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f17269l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f17270m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f17271n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f17272o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f17273p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final Button f17274q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final TextView f17275r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f17276s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f17277t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final ConstraintLayout f17278u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final LJWebView f17279v;

    private ActivityWebViewSearchBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull BottomSheetLayout bottomSheetLayout, @NonNull LinearLayout linearLayout, @NonNull DownloadTitleLayoutBinding downloadTitleLayoutBinding, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull ConstraintLayout constraintLayout5, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout4, @NonNull Button button, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ConstraintLayout constraintLayout6, @NonNull LJWebView lJWebView) {
        this.f17259b = constraintLayout;
        this.f17260c = constraintLayout2;
        this.f17261d = bottomSheetLayout;
        this.f17262e = linearLayout;
        this.f17263f = downloadTitleLayoutBinding;
        this.f17264g = imageView;
        this.f17265h = textView;
        this.f17266i = constraintLayout3;
        this.f17267j = constraintLayout4;
        this.f17268k = constraintLayout5;
        this.f17269l = linearLayout2;
        this.f17270m = imageView2;
        this.f17271n = linearLayout3;
        this.f17272o = imageView3;
        this.f17273p = linearLayout4;
        this.f17274q = button;
        this.f17275r = textView2;
        this.f17276s = textView3;
        this.f17277t = textView4;
        this.f17278u = constraintLayout6;
        this.f17279v = lJWebView;
    }

    @NonNull
    public static ActivityWebViewSearchBinding bind(@NonNull View view) {
        int i4 = R.id.actionBar;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.actionBar);
        if (constraintLayout != null) {
            i4 = R.id.bottomSheetLayout;
            BottomSheetLayout bottomSheetLayout = (BottomSheetLayout) ViewBindings.findChildViewById(view, R.id.bottomSheetLayout);
            if (bottomSheetLayout != null) {
                i4 = R.id.close;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.close);
                if (linearLayout != null) {
                    i4 = R.id.downloadCenter;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.downloadCenter);
                    if (findChildViewById != null) {
                        DownloadTitleLayoutBinding bind = DownloadTitleLayoutBinding.bind(findChildViewById);
                        i4 = R.id.imageView11;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView11);
                        if (imageView != null) {
                            i4 = R.id.inputUrl;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.inputUrl);
                            if (textView != null) {
                                i4 = R.id.layoutFail;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.layoutFail);
                                if (constraintLayout2 != null) {
                                    i4 = R.id.layoutLoading;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.layoutLoading);
                                    if (constraintLayout3 != null) {
                                        i4 = R.id.main;
                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.main);
                                        if (constraintLayout4 != null) {
                                            i4 = R.id.next;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.next);
                                            if (linearLayout2 != null) {
                                                i4 = R.id.nextImg;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.nextImg);
                                                if (imageView2 != null) {
                                                    i4 = R.id.prev;
                                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.prev);
                                                    if (linearLayout3 != null) {
                                                        i4 = R.id.prevImg;
                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.prevImg);
                                                        if (imageView3 != null) {
                                                            i4 = R.id.refresh;
                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.refresh);
                                                            if (linearLayout4 != null) {
                                                                i4 = R.id.sniffer;
                                                                Button button = (Button) ViewBindings.findChildViewById(view, R.id.sniffer);
                                                                if (button != null) {
                                                                    i4 = R.id.textView32;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView32);
                                                                    if (textView2 != null) {
                                                                        i4 = R.id.textView33;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView33);
                                                                        if (textView3 != null) {
                                                                            i4 = R.id.tipSniffing;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tipSniffing);
                                                                            if (textView4 != null) {
                                                                                i4 = R.id.toolbar;
                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.toolbar);
                                                                                if (constraintLayout5 != null) {
                                                                                    i4 = R.id.web;
                                                                                    LJWebView lJWebView = (LJWebView) ViewBindings.findChildViewById(view, R.id.web);
                                                                                    if (lJWebView != null) {
                                                                                        return new ActivityWebViewSearchBinding((ConstraintLayout) view, constraintLayout, bottomSheetLayout, linearLayout, bind, imageView, textView, constraintLayout2, constraintLayout3, constraintLayout4, linearLayout2, imageView2, linearLayout3, imageView3, linearLayout4, button, textView2, textView3, textView4, constraintLayout5, lJWebView);
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
    public static ActivityWebViewSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f17259b;
    }

    @NonNull
    public static ActivityWebViewSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_web_view_search, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
