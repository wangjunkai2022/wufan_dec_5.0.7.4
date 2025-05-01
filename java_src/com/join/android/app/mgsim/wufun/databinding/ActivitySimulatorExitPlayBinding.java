package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivitySimulatorExitPlayBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f16996b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f16997c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f16998d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f16999e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17000f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f17001g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f17002h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17003i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ProgressBar f17004j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17005k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RecyclerView f17006l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f17007m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17008n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f17009o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f17010p;

    private ActivitySimulatorExitPlayBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView3, @NonNull ProgressBar progressBar, @NonNull TextView textView4, @NonNull RecyclerView recyclerView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f16996b = constraintLayout;
        this.f16997c = simpleDraweeView;
        this.f16998d = textView;
        this.f16999e = constraintLayout2;
        this.f17000f = textView2;
        this.f17001g = imageView;
        this.f17002h = imageView2;
        this.f17003i = textView3;
        this.f17004j = progressBar;
        this.f17005k = textView4;
        this.f17006l = recyclerView;
        this.f17007m = textView5;
        this.f17008n = textView6;
        this.f17009o = textView7;
        this.f17010p = textView8;
    }

    @NonNull
    public static ActivitySimulatorExitPlayBinding bind(@NonNull View view) {
        int i4 = R.id.adIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.adIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.adTitle;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.adTitle);
            if (textView != null) {
                i4 = R.id.constraintLayout7;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout7);
                if (constraintLayout != null) {
                    i4 = R.id.exit;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.exit);
                    if (textView2 != null) {
                        i4 = R.id.info;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.info);
                        if (imageView != null) {
                            i4 = R.id.levelIcon;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.levelIcon);
                            if (imageView2 != null) {
                                i4 = R.id.levelName;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.levelName);
                                if (textView3 != null) {
                                    i4 = R.id.progressBar;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progressBar);
                                    if (progressBar != null) {
                                        i4 = R.id.progressTv;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.progressTv);
                                        if (textView4 != null) {
                                            i4 = R.id.recyclerView;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                                            if (recyclerView != null) {
                                                i4 = R.id.resume;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.resume);
                                                if (textView5 != null) {
                                                    i4 = R.id.save;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.save);
                                                    if (textView6 != null) {
                                                        i4 = R.id.title;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                        if (textView7 != null) {
                                                            i4 = R.id.tvTips;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTips);
                                                            if (textView8 != null) {
                                                                return new ActivitySimulatorExitPlayBinding((ConstraintLayout) view, simpleDraweeView, textView, constraintLayout, textView2, imageView, imageView2, textView3, progressBar, textView4, recyclerView, textView5, textView6, textView7, textView8);
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
    public static ActivitySimulatorExitPlayBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f16996b;
    }

    @NonNull
    public static ActivitySimulatorExitPlayBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_simulator_exit_play, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
