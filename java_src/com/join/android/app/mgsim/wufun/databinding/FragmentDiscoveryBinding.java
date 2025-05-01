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
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class FragmentDiscoveryBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19729b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f19730c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f19731d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19732e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19733f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final CustomerDownloadView f19734g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final XListView2 f19735h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final PtrClassicFrameLayout f19736i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final View f19737j;

    private FragmentDiscoveryBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull CustomerDownloadView customerDownloadView, @NonNull XListView2 xListView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull View view) {
        this.f19729b = relativeLayout;
        this.f19730c = relativeLayout2;
        this.f19731d = relativeLayout3;
        this.f19732e = imageView;
        this.f19733f = textView;
        this.f19734g = customerDownloadView;
        this.f19735h = xListView2;
        this.f19736i = ptrClassicFrameLayout;
        this.f19737j = view;
    }

    @NonNull
    public static FragmentDiscoveryBinding bind(@NonNull View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i4 = R.id.discoveryTitleRl;
        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.discoveryTitleRl);
        if (relativeLayout2 != null) {
            i4 = R.id.discoveryTitleSearchIv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.discoveryTitleSearchIv);
            if (imageView != null) {
                i4 = R.id.discoveryTitleTx;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.discoveryTitleTx);
                if (textView != null) {
                    i4 = R.id.downloadView1;
                    CustomerDownloadView customerDownloadView = (CustomerDownloadView) ViewBindings.findChildViewById(view, R.id.downloadView1);
                    if (customerDownloadView != null) {
                        i4 = R.id.listView;
                        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listView);
                        if (xListView2 != null) {
                            i4 = R.id.mPtrFrame;
                            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                            if (ptrClassicFrameLayout != null) {
                                i4 = R.id.statubar;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                                if (findChildViewById != null) {
                                    return new FragmentDiscoveryBinding(relativeLayout, relativeLayout, relativeLayout2, imageView, textView, customerDownloadView, xListView2, ptrClassicFrameLayout, findChildViewById);
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
    public static FragmentDiscoveryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19729b;
    }

    @NonNull
    public static FragmentDiscoveryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_discovery, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
