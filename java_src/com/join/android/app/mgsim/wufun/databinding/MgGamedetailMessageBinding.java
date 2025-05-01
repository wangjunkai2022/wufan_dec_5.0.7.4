package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgGamedetailMessageBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24506b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f24507c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24508d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f24509e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f24510f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f24511g;

    private MgGamedetailMessageBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull View view, @NonNull LinearLayout linearLayout4, @NonNull ImageView imageView) {
        this.f24506b = linearLayout;
        this.f24507c = linearLayout2;
        this.f24508d = linearLayout3;
        this.f24509e = view;
        this.f24510f = linearLayout4;
        this.f24511g = imageView;
    }

    @NonNull
    public static MgGamedetailMessageBinding bind(@NonNull View view) {
        int i4 = R.id.backLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.backLayout);
        if (linearLayout != null) {
            i4 = R.id.itemLayout;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.itemLayout);
            if (linearLayout2 != null) {
                i4 = R.id.itemLine;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.itemLine);
                if (findChildViewById != null) {
                    i4 = R.id.messageLayoutMain;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.messageLayoutMain);
                    if (linearLayout3 != null) {
                        i4 = R.id.moreImage;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.moreImage);
                        if (imageView != null) {
                            return new MgGamedetailMessageBinding((LinearLayout) view, linearLayout, linearLayout2, findChildViewById, linearLayout3, imageView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgGamedetailMessageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24506b;
    }

    @NonNull
    public static MgGamedetailMessageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_gamedetail_message, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
