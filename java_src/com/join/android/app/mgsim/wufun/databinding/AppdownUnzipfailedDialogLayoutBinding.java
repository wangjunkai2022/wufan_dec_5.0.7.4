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
public final class AppdownUnzipfailedDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17444b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17445c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f17446d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f17447e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17448f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f17449g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17450h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f17451i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17452j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ProgressBar f17453k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ProgressBar f17454l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f17455m;

    private AppdownUnzipfailedDialogLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull TextView textView4, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull TextView textView5) {
        this.f17444b = relativeLayout;
        this.f17445c = textView;
        this.f17446d = imageView;
        this.f17447e = simpleDraweeView;
        this.f17448f = textView2;
        this.f17449g = linearLayout;
        this.f17450h = textView3;
        this.f17451i = linearLayout2;
        this.f17452j = textView4;
        this.f17453k = progressBar;
        this.f17454l = progressBar2;
        this.f17455m = textView5;
    }

    @NonNull
    public static AppdownUnzipfailedDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appSize;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appSize);
        if (textView != null) {
            i4 = R.id.cancle;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.cancle);
            if (imageView != null) {
                i4 = R.id.icon;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
                if (simpleDraweeView != null) {
                    i4 = R.id.info;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.info);
                    if (textView2 != null) {
                        i4 = R.id.linearLayout2;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayout2);
                        if (linearLayout != null) {
                            i4 = R.id.lodingInfo;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.lodingInfo);
                            if (textView3 != null) {
                                i4 = R.id.main;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                                if (linearLayout2 != null) {
                                    i4 = R.id.ok;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.ok);
                                    if (textView4 != null) {
                                        i4 = R.id.progressBar;
                                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                        if (progressBar != null) {
                                            i4 = R.id.progressBarZip;
                                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBarZip);
                                            if (progressBar2 != null) {
                                                i4 = R.id.title;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                if (textView5 != null) {
                                                    return new AppdownUnzipfailedDialogLayoutBinding((RelativeLayout) view, textView, imageView, simpleDraweeView, textView2, linearLayout, textView3, linearLayout2, textView4, progressBar, progressBar2, textView5);
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
    public static AppdownUnzipfailedDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17444b;
    }

    @NonNull
    public static AppdownUnzipfailedDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.appdown_unzipfailed_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
