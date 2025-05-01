package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MyGridView;
/* loaded from: classes3.dex */
public final class PartDiscoveryHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25891b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final MyGridView f25892c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25893d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f25894e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final GridView f25895f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f25896g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f25897h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25898i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25899j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final RelativeLayout f25900k;

    private PartDiscoveryHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull MyGridView myGridView, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull GridView gridView, @NonNull LinearLayout linearLayout3, @NonNull View view, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout) {
        this.f25891b = linearLayout;
        this.f25892c = myGridView;
        this.f25893d = linearLayout2;
        this.f25894e = imageView;
        this.f25895f = gridView;
        this.f25896g = linearLayout3;
        this.f25897h = view;
        this.f25898i = linearLayout4;
        this.f25899j = textView;
        this.f25900k = relativeLayout;
    }

    @NonNull
    public static PartDiscoveryHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.discoveryBottomGv;
        MyGridView myGridView = (MyGridView) ViewBindings.findChildViewById(view, R.id.discoveryBottomGv);
        if (myGridView != null) {
            i4 = R.id.discoveryCommunityLl;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.discoveryCommunityLl);
            if (linearLayout != null) {
                i4 = R.id.discoverySearchIv;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.discoverySearchIv);
                if (imageView != null) {
                    i4 = R.id.discoveryTopGv;
                    GridView gridView = (GridView) ViewBindings.findChildViewById(view, R.id.discoveryTopGv);
                    if (gridView != null) {
                        i4 = R.id.discoveryTopRl;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.discoveryTopRl);
                        if (linearLayout2 != null) {
                            i4 = R.id.statubar;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                            if (findChildViewById != null) {
                                i4 = R.id.toCommunityLl;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.toCommunityLl);
                                if (linearLayout3 != null) {
                                    i4 = R.id.toCommunityTx;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.toCommunityTx);
                                    if (textView != null) {
                                        i4 = R.id.toFightRl;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.toFightRl);
                                        if (relativeLayout != null) {
                                            return new PartDiscoveryHeaderBinding((LinearLayout) view, myGridView, linearLayout, imageView, gridView, linearLayout2, findChildViewById, linearLayout3, textView, relativeLayout);
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
    public static PartDiscoveryHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25891b;
    }

    @NonNull
    public static PartDiscoveryHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.part_discovery_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
