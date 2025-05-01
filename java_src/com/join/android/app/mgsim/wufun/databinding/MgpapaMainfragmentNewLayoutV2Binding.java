package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.appbar.AppBarLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView3;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.melnykov.fab.FloatingActionButton;
/* loaded from: classes3.dex */
public final class MgpapaMainfragmentNewLayoutV2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24822b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final AppBarLayout f24823c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FloatingActionButton f24824d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CoordinatorLayout f24825e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f24826f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f24827g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f24828h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f24829i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f24830j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final XListView3 f24831k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final PtrClassicFrameLayout f24832l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f24833m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f24834n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f24835o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f24836p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final View f24837q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f24838r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final RelativeLayout f24839s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final ViewFlipper f24840t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f24841u;

    private MgpapaMainfragmentNewLayoutV2Binding(@NonNull RelativeLayout relativeLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView3, @NonNull XListView3 xListView3, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull ViewFlipper viewFlipper, @NonNull TextView textView3) {
        this.f24822b = relativeLayout;
        this.f24823c = appBarLayout;
        this.f24824d = floatingActionButton;
        this.f24825e = coordinatorLayout;
        this.f24826f = frameLayout;
        this.f24827g = imageView;
        this.f24828h = imageView2;
        this.f24829i = simpleDraweeView;
        this.f24830j = imageView3;
        this.f24831k = xListView3;
        this.f24832l = ptrClassicFrameLayout;
        this.f24833m = imageView4;
        this.f24834n = imageView5;
        this.f24835o = textView;
        this.f24836p = textView2;
        this.f24837q = view;
        this.f24838r = relativeLayout2;
        this.f24839s = relativeLayout3;
        this.f24840t = viewFlipper;
        this.f24841u = textView3;
    }

    @NonNull
    public static MgpapaMainfragmentNewLayoutV2Binding bind(@NonNull View view) {
        int i4 = R.id.appbar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, R.id.appbar);
        if (appBarLayout != null) {
            i4 = R.id.coinFloatad;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, R.id.coinFloatad);
            if (floatingActionButton != null) {
                i4 = R.id.coordinator;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, R.id.coordinator);
                if (coordinatorLayout != null) {
                    i4 = R.id.flTitleSearch;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.flTitleSearch);
                    if (frameLayout != null) {
                        i4 = R.id.imageView2;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView2);
                        if (imageView != null) {
                            i4 = R.id.imageView3;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView3);
                            if (imageView2 != null) {
                                i4 = R.id.ivFloatad;
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivFloatad);
                                if (simpleDraweeView != null) {
                                    i4 = R.id.ivSearchIcon;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivSearchIcon);
                                    if (imageView3 != null) {
                                        i4 = R.id.listview;
                                        XListView3 xListView3 = (XListView3) ViewBindings.findChildViewById(view, R.id.listview);
                                        if (xListView3 != null) {
                                            i4 = R.id.mPtrFrame;
                                            PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                                            if (ptrClassicFrameLayout != null) {
                                                i4 = R.id.movetoTop;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.movetoTop);
                                                if (imageView4 != null) {
                                                    i4 = R.id.search;
                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.search);
                                                    if (imageView5 != null) {
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
                                                                            i4 = R.id.tvSearchHint;
                                                                            ViewFlipper viewFlipper = (ViewFlipper) ViewBindings.findChildViewById(view, R.id.tvSearchHint);
                                                                            if (viewFlipper != null) {
                                                                                i4 = R.id.updateNotice;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.updateNotice);
                                                                                if (textView3 != null) {
                                                                                    return new MgpapaMainfragmentNewLayoutV2Binding((RelativeLayout) view, appBarLayout, floatingActionButton, coordinatorLayout, frameLayout, imageView, imageView2, simpleDraweeView, imageView3, xListView3, ptrClassicFrameLayout, imageView4, imageView5, textView, textView2, findChildViewById, relativeLayout, relativeLayout2, viewFlipper, textView3);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgpapaMainfragmentNewLayoutV2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24822b;
    }

    @NonNull
    public static MgpapaMainfragmentNewLayoutV2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapa_mainfragment_new_layout_v2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
