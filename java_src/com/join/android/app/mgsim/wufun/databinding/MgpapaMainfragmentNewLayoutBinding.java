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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.melnykov.fab.FloatingActionButton;
/* loaded from: classes3.dex */
public final class MgpapaMainfragmentNewLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24807b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FloatingActionButton f24808c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f24809d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f24810e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f24811f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final XListView2 f24812g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final PtrClassicFrameLayout f24813h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f24814i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f24815j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f24816k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f24817l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final View f24818m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f24819n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RelativeLayout f24820o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f24821p;

    private MgpapaMainfragmentNewLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull XListView2 xListView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView3) {
        this.f24807b = relativeLayout;
        this.f24808c = floatingActionButton;
        this.f24809d = imageView;
        this.f24810e = imageView2;
        this.f24811f = simpleDraweeView;
        this.f24812g = xListView2;
        this.f24813h = ptrClassicFrameLayout;
        this.f24814i = imageView3;
        this.f24815j = imageView4;
        this.f24816k = textView;
        this.f24817l = textView2;
        this.f24818m = view;
        this.f24819n = relativeLayout2;
        this.f24820o = relativeLayout3;
        this.f24821p = textView3;
    }

    @NonNull
    public static MgpapaMainfragmentNewLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.coinFloatad;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, R.id.coinFloatad);
        if (floatingActionButton != null) {
            i4 = R.id.imageView2;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView2);
            if (imageView != null) {
                i4 = R.id.imageView3;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView3);
                if (imageView2 != null) {
                    i4 = R.id.ivFloatad;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivFloatad);
                    if (simpleDraweeView != null) {
                        i4 = R.id.listview;
                        XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listview);
                        if (xListView2 != null) {
                            i4 = R.id.mPtrFrame;
                            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                            if (ptrClassicFrameLayout != null) {
                                i4 = R.id.movetoTop;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.movetoTop);
                                if (imageView3 != null) {
                                    i4 = R.id.search;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.search);
                                    if (imageView4 != null) {
                                        i4 = R.id.searchBack;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.searchBack);
                                        if (textView != null) {
                                            i4 = R.id.searchContent;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.searchContent);
                                            if (textView2 != null) {
                                                i4 = R.id.statubar;
                                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
                                                if (findChildViewById != null) {
                                                    i4 = R.id.title;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.title);
                                                    if (relativeLayout != null) {
                                                        i4 = R.id.titleSearch;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.titleSearch);
                                                        if (relativeLayout2 != null) {
                                                            i4 = R.id.updateNotice;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.updateNotice);
                                                            if (textView3 != null) {
                                                                return new MgpapaMainfragmentNewLayoutBinding((RelativeLayout) view, floatingActionButton, imageView, imageView2, simpleDraweeView, xListView2, ptrClassicFrameLayout, imageView3, imageView4, textView, textView2, findChildViewById, relativeLayout, relativeLayout2, textView3);
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
    public static MgpapaMainfragmentNewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24807b;
    }

    @NonNull
    public static MgpapaMainfragmentNewLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapa_mainfragment_new_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
