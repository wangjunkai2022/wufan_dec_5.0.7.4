package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.HistogramView;
import com.join.mgps.customview.MStarBar;
/* loaded from: classes3.dex */
public final class CommentListHeadViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18132b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MStarBar f18133c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18134d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18135e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18136f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18137g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final HistogramView f18138h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final HistogramView f18139i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f18140j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f18141k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final HistogramView f18142l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final LinearLayout f18143m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f18144n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final LinearLayout f18145o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final LinearLayout f18146p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final HistogramView f18147q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final HistogramView f18148r;

    private CommentListHeadViewBinding(@NonNull LinearLayout linearLayout, @NonNull MStarBar mStarBar, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull HistogramView histogramView, @NonNull HistogramView histogramView2, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull HistogramView histogramView3, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull HistogramView histogramView4, @NonNull HistogramView histogramView5) {
        this.f18132b = linearLayout;
        this.f18133c = mStarBar;
        this.f18134d = textView;
        this.f18135e = textView2;
        this.f18136f = textView3;
        this.f18137g = textView4;
        this.f18138h = histogramView;
        this.f18139i = histogramView2;
        this.f18140j = linearLayout2;
        this.f18141k = view;
        this.f18142l = histogramView3;
        this.f18143m = linearLayout3;
        this.f18144n = imageView;
        this.f18145o = linearLayout4;
        this.f18146p = linearLayout5;
        this.f18147q = histogramView4;
        this.f18148r = histogramView5;
    }

    @NonNull
    public static CommentListHeadViewBinding bind(@NonNull View view) {
        int i4 = R.id.comment_head_mstarBar;
        MStarBar mStarBar = (MStarBar) ViewBindings.findChildViewById(view, R.id.comment_head_mstarBar);
        if (mStarBar != null) {
            i4 = R.id.comment_head_nopoint_tx;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.comment_head_nopoint_tx);
            if (textView != null) {
                i4 = R.id.comment_head_num_tx;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.comment_head_num_tx);
                if (textView2 != null) {
                    i4 = R.id.comment_head_point_tx;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.comment_head_point_tx);
                    if (textView3 != null) {
                        i4 = R.id.editText5;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.editText5);
                        if (textView4 != null) {
                            i4 = R.id.fiveHv;
                            HistogramView histogramView = (HistogramView) ViewBindings.findChildViewById(view, R.id.fiveHv);
                            if (histogramView != null) {
                                i4 = R.id.fourHv;
                                HistogramView histogramView2 = (HistogramView) ViewBindings.findChildViewById(view, R.id.fourHv);
                                if (histogramView2 != null) {
                                    i4 = R.id.goCommit;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.goCommit);
                                    if (linearLayout != null) {
                                        i4 = R.id.line_one;
                                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line_one);
                                        if (findChildViewById != null) {
                                            i4 = R.id.oneHv;
                                            HistogramView histogramView3 = (HistogramView) ViewBindings.findChildViewById(view, R.id.oneHv);
                                            if (histogramView3 != null) {
                                                i4 = R.id.point_ll;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.point_ll);
                                                if (linearLayout2 != null) {
                                                    i4 = R.id.progressBar2;
                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.progressBar2);
                                                    if (imageView != null) {
                                                        i4 = R.id.starlayout;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.starlayout);
                                                        if (linearLayout3 != null) {
                                                            i4 = R.id.start_ll;
                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.start_ll);
                                                            if (linearLayout4 != null) {
                                                                i4 = R.id.threeHv;
                                                                HistogramView histogramView4 = (HistogramView) ViewBindings.findChildViewById(view, R.id.threeHv);
                                                                if (histogramView4 != null) {
                                                                    i4 = R.id.twoHv;
                                                                    HistogramView histogramView5 = (HistogramView) ViewBindings.findChildViewById(view, R.id.twoHv);
                                                                    if (histogramView5 != null) {
                                                                        return new CommentListHeadViewBinding((LinearLayout) view, mStarBar, textView, textView2, textView3, textView4, histogramView, histogramView2, linearLayout, findChildViewById, histogramView3, linearLayout2, imageView, linearLayout3, linearLayout4, histogramView4, histogramView5);
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
    public static CommentListHeadViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18132b;
    }

    @NonNull
    public static CommentListHeadViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.comment_list_head_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
