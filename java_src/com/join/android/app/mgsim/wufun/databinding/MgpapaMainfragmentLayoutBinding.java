package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import in.srain.cube.views.GridViewWithHeaderAndFooter;
/* loaded from: classes3.dex */
public final class MgpapaMainfragmentLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24796b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final GridViewWithHeaderAndFooter f24797c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f24798d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f24799e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f24800f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f24801g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f24802h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24803i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f24804j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f24805k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final RelativeLayout f24806l;

    private MgpapaMainfragmentLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull GridViewWithHeaderAndFooter gridViewWithHeaderAndFooter, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull TextView textView, @NonNull ImageView imageView6, @NonNull TextView textView2, @NonNull RelativeLayout relativeLayout2) {
        this.f24796b = relativeLayout;
        this.f24797c = gridViewWithHeaderAndFooter;
        this.f24798d = imageView;
        this.f24799e = imageView2;
        this.f24800f = imageView3;
        this.f24801g = imageView4;
        this.f24802h = imageView5;
        this.f24803i = textView;
        this.f24804j = imageView6;
        this.f24805k = textView2;
        this.f24806l = relativeLayout2;
    }

    @NonNull
    public static MgpapaMainfragmentLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.gridView;
        GridViewWithHeaderAndFooter gridViewWithHeaderAndFooter = (GridViewWithHeaderAndFooter) ViewBindings.findChildViewById(view, R.id.gridView);
        if (gridViewWithHeaderAndFooter != null) {
            i4 = R.id.imageView2;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView2);
            if (imageView != null) {
                i4 = R.id.imageView3;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView3);
                if (imageView2 != null) {
                    i4 = R.id.monkey_icon;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.monkey_icon);
                    if (imageView3 != null) {
                        i4 = R.id.movetoTop;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.movetoTop);
                        if (imageView4 != null) {
                            i4 = R.id.round_point;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.round_point);
                            if (imageView5 != null) {
                                i4 = R.id.searchBack;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.searchBack);
                                if (textView != null) {
                                    i4 = R.id.share;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, R.id.share);
                                    if (imageView6 != null) {
                                        i4 = R.id.textView;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                                        if (textView2 != null) {
                                            i4 = R.id.title;
                                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.title);
                                            if (relativeLayout != null) {
                                                return new MgpapaMainfragmentLayoutBinding((RelativeLayout) view, gridViewWithHeaderAndFooter, imageView, imageView2, imageView3, imageView4, imageView5, textView, imageView6, textView2, relativeLayout);
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
    public static MgpapaMainfragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24796b;
    }

    @NonNull
    public static MgpapaMainfragmentLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapa_mainfragment_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
