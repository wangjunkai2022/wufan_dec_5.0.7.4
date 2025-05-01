package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public final class CollectionThreeItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18065b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ProgressBar f18066c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f18067d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f18068e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f18069f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f18070g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final Button f18071h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f18072i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f18073j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f18074k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f18075l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f18076m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f18077n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f18078o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f18079p;

    private CollectionThreeItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull ProgressBar progressBar, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull LinearLayout linearLayout3, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView3, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18065b = relativeLayout;
        this.f18066c = progressBar;
        this.f18067d = imageView;
        this.f18068e = linearLayout;
        this.f18069f = simpleDraweeView;
        this.f18070g = simpleDraweeView2;
        this.f18071h = button;
        this.f18072i = linearLayout2;
        this.f18073j = imageView2;
        this.f18074k = textView;
        this.f18075l = linearLayout3;
        this.f18076m = relativeLayout2;
        this.f18077n = imageView3;
        this.f18078o = textView2;
        this.f18079p = textView3;
    }

    @NonNull
    public static CollectionThreeItemBinding bind(@NonNull View view) {
        int i4 = R.id.butnProgressBar;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.butnProgressBar);
        if (progressBar != null) {
            i4 = R.id.butn_showdownload;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.butn_showdownload);
            if (imageView != null) {
                i4 = R.id.detialDownBottom;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.detialDownBottom);
                if (linearLayout != null) {
                    i4 = R.id.imgBackground;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.imgBackground);
                    if (simpleDraweeView != null) {
                        i4 = R.id.imgIcon;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.imgIcon);
                        if (simpleDraweeView2 != null) {
                            i4 = R.id.instalButtomButn;
                            Button button = (Button) ViewBindings.findChildViewById(view, R.id.instalButtomButn);
                            if (button != null) {
                                i4 = R.id.instalbutnLayout;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.instalbutnLayout);
                                if (linearLayout2 != null) {
                                    i4 = R.id.loveButn;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.loveButn);
                                    if (imageView2 != null) {
                                        i4 = R.id.percent;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.percent);
                                        if (textView != null) {
                                            i4 = R.id.progress_layout;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.progress_layout);
                                            if (linearLayout3 != null) {
                                                i4 = R.id.progressbarLayout;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.progressbarLayout);
                                                if (relativeLayout != null) {
                                                    i4 = R.id.shareButn;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.shareButn);
                                                    if (imageView3 != null) {
                                                        i4 = R.id.tvGameDes;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameDes);
                                                        if (textView2 != null) {
                                                            i4 = R.id.tvGameTitle;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameTitle);
                                                            if (textView3 != null) {
                                                                return new CollectionThreeItemBinding((RelativeLayout) view, progressBar, imageView, linearLayout, simpleDraweeView, simpleDraweeView2, button, linearLayout2, imageView2, textView, linearLayout3, relativeLayout, imageView3, textView2, textView3);
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
    public static CollectionThreeItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18065b;
    }

    @NonNull
    public static CollectionThreeItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.collection_three_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
