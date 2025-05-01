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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityHideAppCalculatorBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16510b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16511c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f16512d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f16513e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f16514f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f16515g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16516h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16517i;

    private ActivityHideAppCalculatorBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f16510b = linearLayout;
        this.f16511c = imageView;
        this.f16512d = relativeLayout;
        this.f16513e = linearLayout2;
        this.f16514f = recyclerView;
        this.f16515g = view;
        this.f16516h = textView;
        this.f16517i = textView2;
    }

    @NonNull
    public static ActivityHideAppCalculatorBinding bind(@NonNull View view) {
        int i4 = R.id.back_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back_image);
        if (imageView != null) {
            i4 = R.id.headview;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.headview);
            if (relativeLayout != null) {
                i4 = R.id.hideAppMask;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.hideAppMask);
                if (linearLayout != null) {
                    i4 = R.id.rvKeyBoard;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rvKeyBoard);
                    if (recyclerView != null) {
                        i4 = R.id.statubar;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                        if (findChildViewById != null) {
                            i4 = R.id.title_textview;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_textview);
                            if (textView != null) {
                                i4 = R.id.tvCalResult;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvCalResult);
                                if (textView2 != null) {
                                    return new ActivityHideAppCalculatorBinding((LinearLayout) view, imageView, relativeLayout, linearLayout, recyclerView, findChildViewById, textView, textView2);
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
    public static ActivityHideAppCalculatorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16510b;
    }

    @NonNull
    public static ActivityHideAppCalculatorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_hide_app_calculator, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
