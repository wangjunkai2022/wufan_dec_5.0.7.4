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
public final class SearchFailedHeader1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26333b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f26334c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26335d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26336e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f26337f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f26338g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26339h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26340i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f26341j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f26342k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26343l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26344m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26345n;

    private SearchFailedHeader1Binding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f26333b = relativeLayout;
        this.f26334c = linearLayout;
        this.f26335d = textView;
        this.f26336e = linearLayout2;
        this.f26337f = imageView;
        this.f26338g = linearLayout3;
        this.f26339h = textView2;
        this.f26340i = textView3;
        this.f26341j = textView4;
        this.f26342k = textView5;
        this.f26343l = textView6;
        this.f26344m = textView7;
        this.f26345n = textView8;
    }

    @NonNull
    public static SearchFailedHeader1Binding bind(@NonNull View view) {
        int i4 = R.id.failMsg;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.failMsg);
        if (linearLayout != null) {
            i4 = R.id.messageHeader;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.messageHeader);
            if (textView != null) {
                i4 = R.id.messageLayout;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.messageLayout);
                if (linearLayout2 != null) {
                    i4 = R.id.reloadingHeader;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.reloadingHeader);
                    if (imageView != null) {
                        i4 = R.id.searchHeaderLayout;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.searchHeaderLayout);
                        if (linearLayout3 != null) {
                            i4 = R.id.textView;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                            if (textView2 != null) {
                                i4 = R.id.textView2;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                                if (textView3 != null) {
                                    i4 = R.id.tv1;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv1);
                                    if (textView4 != null) {
                                        i4 = R.id.tv2;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv2);
                                        if (textView5 != null) {
                                            i4 = R.id.tv3;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv3);
                                            if (textView6 != null) {
                                                i4 = R.id.tv4;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv4);
                                                if (textView7 != null) {
                                                    i4 = R.id.tvMore;
                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvMore);
                                                    if (textView8 != null) {
                                                        return new SearchFailedHeader1Binding((RelativeLayout) view, linearLayout, textView, linearLayout2, imageView, linearLayout3, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
    public static SearchFailedHeader1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26333b;
    }

    @NonNull
    public static SearchFailedHeader1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.search_failed_header1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
