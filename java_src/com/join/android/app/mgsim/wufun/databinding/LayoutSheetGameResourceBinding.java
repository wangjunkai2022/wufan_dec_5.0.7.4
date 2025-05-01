package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class LayoutSheetGameResourceBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f23301b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f23302c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f23303d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f23304e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ConstraintLayout f23305f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23306g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f23307h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f23308i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ConstraintLayout f23309j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f23310k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RecyclerView f23311l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f23312m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f23313n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f23314o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f23315p;

    private LayoutSheetGameResourceBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView2, @NonNull RecyclerView recyclerView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f23301b = constraintLayout;
        this.f23302c = imageView;
        this.f23303d = imageView2;
        this.f23304e = imageView3;
        this.f23305f = constraintLayout2;
        this.f23306g = textView;
        this.f23307h = linearLayout;
        this.f23308i = linearLayout2;
        this.f23309j = constraintLayout3;
        this.f23310k = textView2;
        this.f23311l = recyclerView;
        this.f23312m = textView3;
        this.f23313n = textView4;
        this.f23314o = textView5;
        this.f23315p = textView6;
    }

    @NonNull
    public static LayoutSheetGameResourceBinding bind(@NonNull View view) {
        int i4 = R.id.checkboxAgreement;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.checkboxAgreement);
        if (imageView != null) {
            i4 = R.id.checkboxNoMore;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.checkboxNoMore);
            if (imageView2 != null) {
                i4 = R.id.close;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
                if (imageView3 != null) {
                    i4 = R.id.constraintLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraintLayout);
                    if (constraintLayout != null) {
                        i4 = R.id.download;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.download);
                        if (textView != null) {
                            i4 = R.id.llAgreement;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llAgreement);
                            if (linearLayout != null) {
                                i4 = R.id.llNoMore;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llNoMore);
                                if (linearLayout2 != null) {
                                    i4 = R.id.outside;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.outside);
                                    if (constraintLayout2 != null) {
                                        i4 = R.id.protocol;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.protocol);
                                        if (textView2 != null) {
                                            i4 = R.id.recyclerView;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                                            if (recyclerView != null) {
                                                i4 = R.id.subTitle;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.subTitle);
                                                if (textView3 != null) {
                                                    i4 = R.id.textView77;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView77);
                                                    if (textView4 != null) {
                                                        i4 = R.id.title;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                        if (textView5 != null) {
                                                            i4 = R.id.userProtocolTxt;
                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.userProtocolTxt);
                                                            if (textView6 != null) {
                                                                return new LayoutSheetGameResourceBinding((ConstraintLayout) view, imageView, imageView2, imageView3, constraintLayout, textView, linearLayout, linearLayout2, constraintLayout2, textView2, recyclerView, textView3, textView4, textView5, textView6);
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
    public static LayoutSheetGameResourceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f23301b;
    }

    @NonNull
    public static LayoutSheetGameResourceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_sheet_game_resource, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
