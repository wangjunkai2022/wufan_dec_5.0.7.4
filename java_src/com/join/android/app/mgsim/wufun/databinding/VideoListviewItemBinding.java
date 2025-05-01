package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class VideoListviewItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26959b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26960c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f26961d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f26962e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f26963f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f26964g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26965h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f26966i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SimpleDraweeView f26967j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26968k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26969l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26970m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final SimpleDraweeView f26971n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f26972o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26973p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ProgressBar f26974q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final ProgressBar f26975r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final RelativeLayout f26976s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final LinearLayout f26977t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final LinearLayout f26978u;
    @NonNull

    /* renamed from: v  reason: collision with root package name */
    public final FrameLayout f26979v;

    private VideoListviewItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull View view, @NonNull View view2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull FrameLayout frameLayout) {
        this.f26959b = linearLayout;
        this.f26960c = textView;
        this.f26961d = simpleDraweeView;
        this.f26962e = imageView;
        this.f26963f = view;
        this.f26964g = view2;
        this.f26965h = linearLayout2;
        this.f26966i = linearLayout3;
        this.f26967j = simpleDraweeView2;
        this.f26968k = textView2;
        this.f26969l = textView3;
        this.f26970m = textView4;
        this.f26971n = simpleDraweeView3;
        this.f26972o = textView5;
        this.f26973p = textView6;
        this.f26974q = progressBar;
        this.f26975r = progressBar2;
        this.f26976s = relativeLayout;
        this.f26977t = linearLayout4;
        this.f26978u = linearLayout5;
        this.f26979v = frameLayout;
    }

    @NonNull
    public static VideoListviewItemBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.bannerView;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.bannerView);
            if (simpleDraweeView != null) {
                i4 = R.id.giftPackageSwich;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftPackageSwich);
                if (imageView != null) {
                    i4 = R.id.line;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                    if (findChildViewById != null) {
                        i4 = R.id.line_top;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.line_top);
                        if (findChildViewById2 != null) {
                            i4 = R.id.linearLayout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout);
                            if (linearLayout != null) {
                                i4 = R.id.linearLayout2;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                                if (linearLayout2 != null) {
                                    i4 = R.id.loading;
                                    SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.loading);
                                    if (simpleDraweeView2 != null) {
                                        i4 = R.id.loding_info;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.loding_info);
                                        if (textView2 != null) {
                                            i4 = R.id.mgListviewItemAppname;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemAppname);
                                            if (textView3 != null) {
                                                i4 = R.id.mgListviewItemDescribe;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemDescribe);
                                                if (textView4 != null) {
                                                    i4 = R.id.mgListviewItemIcon;
                                                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.mgListviewItemIcon);
                                                    if (simpleDraweeView3 != null) {
                                                        i4 = R.id.mgListviewItemInstall;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemInstall);
                                                        if (textView5 != null) {
                                                            i4 = R.id.moneyText;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                                                            if (textView6 != null) {
                                                                i4 = R.id.progressBar;
                                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                                                if (progressBar != null) {
                                                                    i4 = R.id.progressBarZip;
                                                                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                                                    if (progressBar2 != null) {
                                                                        i4 = R.id.rLayoutRight;
                                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rLayoutRight);
                                                                        if (relativeLayout != null) {
                                                                            i4 = R.id.relateLayoutApp;
                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.relateLayoutApp);
                                                                            if (linearLayout3 != null) {
                                                                                i4 = R.id.tipsLayout;
                                                                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.tipsLayout);
                                                                                if (linearLayout4 != null) {
                                                                                    i4 = R.id.videoContner;
                                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.videoContner);
                                                                                    if (frameLayout != null) {
                                                                                        return new VideoListviewItemBinding((LinearLayout) view, textView, simpleDraweeView, imageView, findChildViewById, findChildViewById2, linearLayout, linearLayout2, simpleDraweeView2, textView2, textView3, textView4, simpleDraweeView3, textView5, textView6, progressBar, progressBar2, relativeLayout, linearLayout3, linearLayout4, frameLayout);
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
    public static VideoListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26959b;
    }

    @NonNull
    public static VideoListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.video_listview_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
