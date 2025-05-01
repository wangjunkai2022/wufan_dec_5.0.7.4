package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
/* loaded from: classes3.dex */
public final class TopbarLeftTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26764b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26765c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26766d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f26767e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26768f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f26769g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f26770h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final CustomerDownloadView f26771i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f26772j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26773k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final View f26774l;

    private TopbarLeftTitleLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull ImageView imageView3, @NonNull RelativeLayout relativeLayout3, @NonNull CustomerDownloadView customerDownloadView, @NonNull ImageView imageView4, @NonNull TextView textView2, @NonNull View view) {
        this.f26764b = relativeLayout;
        this.f26765c = imageView;
        this.f26766d = imageView2;
        this.f26767e = relativeLayout2;
        this.f26768f = textView;
        this.f26769g = imageView3;
        this.f26770h = relativeLayout3;
        this.f26771i = customerDownloadView;
        this.f26772j = imageView4;
        this.f26773k = textView2;
        this.f26774l = view;
    }

    @NonNull
    public static TopbarLeftTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.comment;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.comment);
            if (imageView2 != null) {
                i4 = R.id.commentParent;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.commentParent);
                if (relativeLayout != null) {
                    i4 = R.id.roundMessage;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.roundMessage);
                    if (textView != null) {
                        i4 = R.id.share;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.share);
                        if (imageView3 != null) {
                            RelativeLayout relativeLayout2 = (RelativeLayout) view;
                            i4 = R.id.title_normal_download_cdv;
                            CustomerDownloadView customerDownloadView = (CustomerDownloadView) ViewBindings.findChildViewById(view, R.id.title_normal_download_cdv);
                            if (customerDownloadView != null) {
                                i4 = R.id.title_normal_search_img;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.title_normal_search_img);
                                if (imageView4 != null) {
                                    i4 = R.id.title_textview;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                                    if (textView2 != null) {
                                        i4 = R.id.topBarline;
                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.topBarline);
                                        if (findChildViewById != null) {
                                            return new TopbarLeftTitleLayoutBinding(relativeLayout2, imageView, imageView2, relativeLayout, textView, imageView3, relativeLayout2, customerDownloadView, imageView4, textView2, findChildViewById);
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
    public static TopbarLeftTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26764b;
    }

    @NonNull
    public static TopbarLeftTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.topbar_left_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
