package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgpapaMainfragmentNewLayoutV4Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f24862b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f24863c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TabLayout f24864d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24865e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24866f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ViewFlipper f24867g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f24868h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f24869i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final View f24870j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ViewPager2 f24871k;

    private MgpapaMainfragmentNewLayoutV4Binding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull TabLayout tabLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ViewFlipper viewFlipper, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view2, @NonNull ViewPager2 viewPager2) {
        this.f24862b = constraintLayout;
        this.f24863c = view;
        this.f24864d = tabLayout;
        this.f24865e = textView;
        this.f24866f = textView2;
        this.f24867g = viewFlipper;
        this.f24868h = imageView;
        this.f24869i = imageView2;
        this.f24870j = view2;
        this.f24871k = viewPager2;
    }

    @NonNull
    public static MgpapaMainfragmentNewLayoutV4Binding bind(@NonNull View view) {
        int i4 = R.id.statubar;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.statubar);
        if (findChildViewById != null) {
            i4 = R.id.tablayout;
            TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, R.id.tablayout);
            if (tabLayout != null) {
                i4 = R.id.tv_download_count;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_download_count);
                if (textView != null) {
                    i4 = R.id.tv_message_count;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_message_count);
                    if (textView2 != null) {
                        i4 = R.id.tvSearchHint;
                        ViewFlipper viewFlipper = (ViewFlipper) ViewBindings.findChildViewById(view, R.id.tvSearchHint);
                        if (viewFlipper != null) {
                            i4 = R.id.v_download;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.v_download);
                            if (imageView != null) {
                                i4 = R.id.v_message;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.v_message);
                                if (imageView2 != null) {
                                    i4 = R.id.v_search;
                                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.v_search);
                                    if (findChildViewById2 != null) {
                                        i4 = R.id.viewpager;
                                        ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, R.id.viewpager);
                                        if (viewPager2 != null) {
                                            return new MgpapaMainfragmentNewLayoutV4Binding((ConstraintLayout) view, findChildViewById, tabLayout, textView, textView2, viewFlipper, imageView, imageView2, findChildViewById2, viewPager2);
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
    public static MgpapaMainfragmentNewLayoutV4Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f24862b;
    }

    @NonNull
    public static MgpapaMainfragmentNewLayoutV4Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapa_mainfragment_new_layout_v4, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
