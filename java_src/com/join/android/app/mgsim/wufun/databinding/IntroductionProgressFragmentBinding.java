package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CornersLinearLayout;
/* loaded from: classes3.dex */
public final class IntroductionProgressFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final CornersLinearLayout f21644b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21645c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f21646d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f21647e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f21648f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f21649g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21650h;

    private IntroductionProgressFragmentBinding(@NonNull CornersLinearLayout cornersLinearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView2) {
        this.f21644b = cornersLinearLayout;
        this.f21645c = textView;
        this.f21646d = imageView;
        this.f21647e = imageView2;
        this.f21648f = linearLayout;
        this.f21649g = recyclerView;
        this.f21650h = textView2;
    }

    @NonNull
    public static IntroductionProgressFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.editText5;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.editText5);
        if (textView != null) {
            i4 = R.id.imageView44;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView44);
            if (imageView != null) {
                i4 = R.id.iv_close;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
                if (imageView2 != null) {
                    i4 = R.id.ll_empty;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_empty);
                    if (linearLayout != null) {
                        i4 = R.id.rv_list_data;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_list_data);
                        if (recyclerView != null) {
                            i4 = R.id.tv_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                            if (textView2 != null) {
                                return new IntroductionProgressFragmentBinding((CornersLinearLayout) view, textView, imageView, imageView2, linearLayout, recyclerView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static IntroductionProgressFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public CornersLinearLayout getRoot() {
        return this.f21644b;
    }

    @NonNull
    public static IntroductionProgressFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.introduction_progress_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
