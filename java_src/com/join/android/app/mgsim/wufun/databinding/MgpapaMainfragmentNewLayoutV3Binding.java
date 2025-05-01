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
import com.join.android.app.component.xrecyclerview.XRecyclerView2;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.melnykov.fab.FloatingActionButton;
/* loaded from: classes3.dex */
public final class MgpapaMainfragmentNewLayoutV3Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24842b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final AppBarLayout f24843c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final FloatingActionButton f24844d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CoordinatorLayout f24845e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final FrameLayout f24846f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f24847g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f24848h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SimpleDraweeView f24849i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f24850j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final XRecyclerView2 f24851k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final PtrClassicFrameLayout f24852l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f24853m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final ImageView f24854n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final TextView f24855o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f24856p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final View f24857q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f24858r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final RelativeLayout f24859s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final ViewFlipper f24860t;
    @NonNull

    /* renamed from: u  reason: collision with root package name */
    public final TextView f24861u;

    private MgpapaMainfragmentNewLayoutV3Binding(@NonNull RelativeLayout relativeLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView3, @NonNull XRecyclerView2 xRecyclerView2, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull ViewFlipper viewFlipper, @NonNull TextView textView3) {
        this.f24842b = relativeLayout;
        this.f24843c = appBarLayout;
        this.f24844d = floatingActionButton;
        this.f24845e = coordinatorLayout;
        this.f24846f = frameLayout;
        this.f24847g = imageView;
        this.f24848h = imageView2;
        this.f24849i = simpleDraweeView;
        this.f24850j = imageView3;
        this.f24851k = xRecyclerView2;
        this.f24852l = ptrClassicFrameLayout;
        this.f24853m = imageView4;
        this.f24854n = imageView5;
        this.f24855o = textView;
        this.f24856p = textView2;
        this.f24857q = view;
        this.f24858r = relativeLayout2;
        this.f24859s = relativeLayout3;
        this.f24860t = viewFlipper;
        this.f24861u = textView3;
    }

    @NonNull
    public static MgpapaMainfragmentNewLayoutV3Binding bind(@NonNull View view) {
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
                                        XRecyclerView2 xRecyclerView2 = (XRecyclerView2) ViewBindings.findChildViewById(view, R.id.listview);
                                        if (xRecyclerView2 != null) {
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
                                                                                    return new MgpapaMainfragmentNewLayoutV3Binding((RelativeLayout) view, appBarLayout, floatingActionButton, coordinatorLayout, frameLayout, imageView, imageView2, simpleDraweeView, imageView3, xRecyclerView2, ptrClassicFrameLayout, imageView4, imageView5, textView, textView2, findChildViewById, relativeLayout, relativeLayout2, viewFlipper, textView3);
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
    public static MgpapaMainfragmentNewLayoutV3Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24842b;
    }

    @NonNull
    public static MgpapaMainfragmentNewLayoutV3Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapa_mainfragment_new_layout_v3, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
