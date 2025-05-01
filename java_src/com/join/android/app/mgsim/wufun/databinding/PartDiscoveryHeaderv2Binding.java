package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class PartDiscoveryHeaderv2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25917b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final HListView f25918c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f25919d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final GridView f25920e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f25921f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25922g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25923h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f25924i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f25925j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f25926k;

    private PartDiscoveryHeaderv2Binding(@NonNull LinearLayout linearLayout, @NonNull HListView hListView, @NonNull LinearLayout linearLayout2, @NonNull GridView gridView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f25917b = linearLayout;
        this.f25918c = hListView;
        this.f25919d = linearLayout2;
        this.f25920e = gridView;
        this.f25921f = relativeLayout;
        this.f25922g = textView;
        this.f25923h = textView2;
        this.f25924i = linearLayout3;
        this.f25925j = textView3;
        this.f25926k = textView4;
    }

    @NonNull
    public static PartDiscoveryHeaderv2Binding bind(@NonNull View view) {
        int i4 = R.id.discoveryBottomGv;
        HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.discoveryBottomGv);
        if (hListView != null) {
            i4 = R.id.discoveryCommunityLl;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.discoveryCommunityLl);
            if (linearLayout != null) {
                i4 = R.id.discoveryTopGv;
                GridView gridView = (GridView) ViewBindings.findChildViewById(view, R.id.discoveryTopGv);
                if (gridView != null) {
                    i4 = R.id.discoveryTopRl;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.discoveryTopRl);
                    if (relativeLayout != null) {
                        i4 = R.id.number;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.number);
                        if (textView != null) {
                            i4 = R.id.title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                            if (textView2 != null) {
                                i4 = R.id.toCommunityLl;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.toCommunityLl);
                                if (linearLayout2 != null) {
                                    i4 = R.id.toCommunityTx;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.toCommunityTx);
                                    if (textView3 != null) {
                                        i4 = R.id.toFightRl;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.toFightRl);
                                        if (textView4 != null) {
                                            return new PartDiscoveryHeaderv2Binding((LinearLayout) view, hListView, linearLayout, gridView, relativeLayout, textView, textView2, linearLayout2, textView3, textView4);
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
    public static PartDiscoveryHeaderv2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25917b;
    }

    @NonNull
    public static PartDiscoveryHeaderv2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.part_discovery_headerv2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
