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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class IntroductionActivityLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f21621b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f21622c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f21623d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f21624e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f21625f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f21626g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f21627h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f21628i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f21629j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f21630k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f21631l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ProgressBar f21632m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f21633n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f21634o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f21635p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f21636q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final FrameLayout f21637r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final RelativeLayout f21638s;

    private IntroductionActivityLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayout linearLayout6, @NonNull LinearLayout linearLayout7, @NonNull ProgressBar progressBar, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull FrameLayout frameLayout3, @NonNull RelativeLayout relativeLayout3) {
        this.f21621b = relativeLayout;
        this.f21622c = frameLayout;
        this.f21623d = frameLayout2;
        this.f21624e = imageView;
        this.f21625f = linearLayout;
        this.f21626g = linearLayout2;
        this.f21627h = linearLayout3;
        this.f21628i = linearLayout4;
        this.f21629j = linearLayout5;
        this.f21630k = linearLayout6;
        this.f21631l = linearLayout7;
        this.f21632m = progressBar;
        this.f21633n = relativeLayout2;
        this.f21634o = textView;
        this.f21635p = textView2;
        this.f21636q = textView3;
        this.f21637r = frameLayout3;
        this.f21638s = relativeLayout3;
    }

    @NonNull
    public static IntroductionActivityLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.fl_content;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_content);
        if (frameLayout != null) {
            i4 = R.id.fl_front_view;
            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.fl_front_view);
            if (frameLayout2 != null) {
                i4 = R.id.iv_praise;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_praise);
                if (imageView != null) {
                    i4 = R.id.ll_close_drawer;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_close_drawer);
                    if (linearLayout != null) {
                        i4 = R.id.ll_comment;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_comment);
                        if (linearLayout2 != null) {
                            i4 = R.id.ll_more;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_more);
                            if (linearLayout3 != null) {
                                i4 = R.id.ll_praise;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_praise);
                                if (linearLayout4 != null) {
                                    i4 = R.id.ll_progress;
                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_progress);
                                    if (linearLayout5 != null) {
                                        i4 = R.id.ll_recommend;
                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_recommend);
                                        if (linearLayout6 != null) {
                                            i4 = R.id.loding_layout;
                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.loding_layout);
                                            if (linearLayout7 != null) {
                                                i4 = R.id.pb_progress;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.pb_progress);
                                                if (progressBar != null) {
                                                    i4 = R.id.rl_menu_layer;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_menu_layer);
                                                    if (relativeLayout != null) {
                                                        i4 = R.id.tv_comment_num;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_comment_num);
                                                        if (textView != null) {
                                                            i4 = R.id.tv_praise_num;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_praise_num);
                                                            if (textView2 != null) {
                                                                i4 = R.id.tv_type;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_type);
                                                                if (textView3 != null) {
                                                                    i4 = R.id.video_view;
                                                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, R.id.video_view);
                                                                    if (frameLayout3 != null) {
                                                                        i4 = R.id.weblayout;
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.weblayout);
                                                                        if (relativeLayout2 != null) {
                                                                            return new IntroductionActivityLayoutBinding((RelativeLayout) view, frameLayout, frameLayout2, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, progressBar, relativeLayout, textView, textView2, textView3, frameLayout3, relativeLayout2);
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
    public static IntroductionActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f21621b;
    }

    @NonNull
    public static IntroductionActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.introduction_activity_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
