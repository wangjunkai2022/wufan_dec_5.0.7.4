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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class ItemRecommedFragmentBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22596b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f22597c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f22598d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f22599e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final PtrClassicFrameLayout f22600f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final XListView2 f22601g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f22602h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f22603i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f22604j;

    private ItemRecommedFragmentBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull XListView2 xListView2, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f22596b = linearLayout;
        this.f22597c = imageView;
        this.f22598d = linearLayout2;
        this.f22599e = linearLayout3;
        this.f22600f = ptrClassicFrameLayout;
        this.f22601g = xListView2;
        this.f22602h = relativeLayout;
        this.f22603i = textView;
        this.f22604j = textView2;
    }

    @NonNull
    public static ItemRecommedFragmentBinding bind(@NonNull View view) {
        int i4 = R.id.iv_redbroadcast;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_redbroadcast);
        if (imageView != null) {
            i4 = R.id.ll_lookdetail;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_lookdetail);
            if (linearLayout != null) {
                i4 = R.id.ll_nodata;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_nodata);
                if (linearLayout2 != null) {
                    i4 = R.id.myswip;
                    PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.myswip);
                    if (ptrClassicFrameLayout != null) {
                        i4 = R.id.rcy_recommed;
                        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.rcy_recommed);
                        if (xListView2 != null) {
                            i4 = R.id.rl_showtitle_bc;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_showtitle_bc);
                            if (relativeLayout != null) {
                                i4 = R.id.tv_show_nodata;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_show_nodata);
                                if (textView != null) {
                                    i4 = R.id.tv_showtitle_bc;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_showtitle_bc);
                                    if (textView2 != null) {
                                        return new ItemRecommedFragmentBinding((LinearLayout) view, imageView, linearLayout, linearLayout2, ptrClassicFrameLayout, xListView2, relativeLayout, textView, textView2);
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
    public static ItemRecommedFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22596b;
    }

    @NonNull
    public static ItemRecommedFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_recommed_fragment, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
