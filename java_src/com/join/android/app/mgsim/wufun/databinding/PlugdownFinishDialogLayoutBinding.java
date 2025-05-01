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
public final class PlugdownFinishDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25957b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f25958c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f25959d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f25960e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25961f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25962g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25963h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25964i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25965j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ProgressBar f25966k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final ProgressBar f25967l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f25968m;

    private PlugdownFinishDialogLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2, @NonNull TextView textView4, @NonNull ProgressBar progressBar, @NonNull ProgressBar progressBar2, @NonNull TextView textView5) {
        this.f25957b = relativeLayout;
        this.f25958c = textView;
        this.f25959d = imageView;
        this.f25960e = simpleDraweeView;
        this.f25961f = textView2;
        this.f25962g = linearLayout;
        this.f25963h = textView3;
        this.f25964i = linearLayout2;
        this.f25965j = textView4;
        this.f25966k = progressBar;
        this.f25967l = progressBar2;
        this.f25968m = textView5;
    }

    @NonNull
    public static PlugdownFinishDialogLayoutBinding bind(@NonNull View view) {
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
                                                    return new PlugdownFinishDialogLayoutBinding((RelativeLayout) view, textView, imageView, simpleDraweeView, textView2, linearLayout, textView3, linearLayout2, textView4, progressBar, progressBar2, textView5);
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
    public static PlugdownFinishDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25957b;
    }

    @NonNull
    public static PlugdownFinishDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.plugdown_finish_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
