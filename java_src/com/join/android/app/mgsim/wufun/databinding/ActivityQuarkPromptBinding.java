package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityQuarkPromptBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f16879b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16880c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f16881d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f16882e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f16883f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f16884g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RecyclerView f16885h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16886i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16887j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f16888k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f16889l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f16890m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f16891n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f16892o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final View f16893p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final View f16894q;

    private ActivityQuarkPromptBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull View view, @NonNull View view2) {
        this.f16879b = constraintLayout;
        this.f16880c = imageView;
        this.f16881d = constraintLayout2;
        this.f16882e = imageView2;
        this.f16883f = imageView3;
        this.f16884g = textView;
        this.f16885h = recyclerView;
        this.f16886i = textView2;
        this.f16887j = textView3;
        this.f16888k = textView4;
        this.f16889l = textView5;
        this.f16890m = textView6;
        this.f16891n = textView7;
        this.f16892o = textView8;
        this.f16893p = view;
        this.f16894q = view2;
    }

    @NonNull
    public static ActivityQuarkPromptBinding bind(@NonNull View view) {
        int i4 = R.id.bg;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.bg);
        if (imageView != null) {
            i4 = R.id.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.container);
            if (constraintLayout != null) {
                i4 = R.id.iv_light;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_light);
                if (imageView2 != null) {
                    i4 = R.id.iv_mobile;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_mobile);
                    if (imageView3 != null) {
                        i4 = R.id.ivRecommend;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.ivRecommend);
                        if (textView != null) {
                            i4 = R.id.rv_tip_list;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_tip_list);
                            if (recyclerView != null) {
                                i4 = R.id.tv_count_desc;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_count_desc);
                                if (textView2 != null) {
                                    i4 = R.id.tv_count_down;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_count_down);
                                    if (textView3 != null) {
                                        i4 = R.id.tv_count_pre;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_count_pre);
                                        if (textView4 != null) {
                                            i4 = R.id.tvDownloadNormal;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDownloadNormal);
                                            if (textView5 != null) {
                                                i4 = R.id.tvDownloadQuark;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDownloadQuark);
                                                if (textView6 != null) {
                                                    i4 = R.id.tv_file_name;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_file_name);
                                                    if (textView7 != null) {
                                                        i4 = R.id.tv_file_time;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_file_time);
                                                        if (textView8 != null) {
                                                            i4 = R.id.v_line;
                                                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_line);
                                                            if (findChildViewById != null) {
                                                                i4 = R.id.v_quark_down;
                                                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.v_quark_down);
                                                                if (findChildViewById2 != null) {
                                                                    return new ActivityQuarkPromptBinding((ConstraintLayout) view, imageView, constraintLayout, imageView2, imageView3, textView, recyclerView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, findChildViewById, findChildViewById2);
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
    public static ActivityQuarkPromptBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f16879b;
    }

    @NonNull
    public static ActivityQuarkPromptBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_quark_prompt, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
