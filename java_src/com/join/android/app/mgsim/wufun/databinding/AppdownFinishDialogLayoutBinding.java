package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class AppdownFinishDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17430b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17431c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f17432d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17433e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f17434f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f17435g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f17436h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17437i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f17438j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RelativeLayout f17439k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f17440l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ProgressBar f17441m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ProgressBar f17442n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f17443o;

    private AppdownFinishDialogLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull LinearLayout linearLayout, @NonNull TextView textView4, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView5, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull TextView textView6) {
        this.f17430b = relativeLayout;
        this.f17431c = textView;
        this.f17432d = imageView;
        this.f17433e = textView2;
        this.f17434f = simpleDraweeView;
        this.f17435g = textView3;
        this.f17436h = linearLayout;
        this.f17437i = textView4;
        this.f17438j = linearLayout2;
        this.f17439k = relativeLayout2;
        this.f17440l = textView5;
        this.f17441m = progressBar;
        this.f17442n = progressBar2;
        this.f17443o = textView6;
    }

    @NonNull
    public static AppdownFinishDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.cancle;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.cancle);
            if (imageView != null) {
                i4 = R.id.goMygame;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.goMygame);
                if (textView2 != null) {
                    i4 = R.id.icon;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                    if (simpleDraweeView != null) {
                        i4 = R.id.info;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.info);
                        if (textView3 != null) {
                            i4 = R.id.linearLayout2;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                            if (linearLayout != null) {
                                i4 = R.id.lodingInfo;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.lodingInfo);
                                if (textView4 != null) {
                                    i4 = R.id.main;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                                    if (linearLayout2 != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                        i4 = R.id.ok;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.ok);
                                        if (textView5 != null) {
                                            i4 = R.id.progressBar;
                                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                            if (progressBar != null) {
                                                i4 = R.id.progressBarZip;
                                                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                                if (progressBar2 != null) {
                                                    i4 = R.id.title;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                    if (textView6 != null) {
                                                        return new AppdownFinishDialogLayoutBinding(relativeLayout, textView, imageView, textView2, simpleDraweeView, textView3, linearLayout, textView4, linearLayout2, relativeLayout, textView5, progressBar, progressBar2, textView6);
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
    public static AppdownFinishDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17430b;
    }

    @NonNull
    public static AppdownFinishDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.appdown_finish_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
