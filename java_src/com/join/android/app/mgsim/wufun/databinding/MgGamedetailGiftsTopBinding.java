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
/* loaded from: classes3.dex */
public final class MgGamedetailGiftsTopBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24477b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f24478c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f24479d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f24480e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f24481f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f24482g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f24483h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24484i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f24485j;

    private MgGamedetailGiftsTopBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull View view2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f24477b = linearLayout;
        this.f24478c = linearLayout2;
        this.f24479d = imageView;
        this.f24480e = view;
        this.f24481f = view2;
        this.f24482g = linearLayout3;
        this.f24483h = textView;
        this.f24484i = textView2;
        this.f24485j = textView3;
    }

    @NonNull
    public static MgGamedetailGiftsTopBinding bind(@NonNull View view) {
        int i4 = R.id.backLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.backLayout);
        if (linearLayout != null) {
            i4 = R.id.imageView5;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
            if (imageView != null) {
                i4 = R.id.layoutTop;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.layoutTop);
                if (findChildViewById != null) {
                    i4 = R.id.line_h;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.line_h);
                    if (findChildViewById2 != null) {
                        i4 = R.id.look_other;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.look_other);
                        if (linearLayout2 != null) {
                            i4 = R.id.moreText;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.moreText);
                            if (textView != null) {
                                i4 = R.id.textView9;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView9);
                                if (textView2 != null) {
                                    i4 = R.id.titleText;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                                    if (textView3 != null) {
                                        return new MgGamedetailGiftsTopBinding((LinearLayout) view, linearLayout, imageView, findChildViewById, findChildViewById2, linearLayout2, textView, textView2, textView3);
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
    public static MgGamedetailGiftsTopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24477b;
    }

    @NonNull
    public static MgGamedetailGiftsTopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_gamedetail_gifts_top, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
