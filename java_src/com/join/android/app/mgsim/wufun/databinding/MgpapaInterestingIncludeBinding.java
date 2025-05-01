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
import androidx.viewpager.widget.ViewPager;
import com.join.android.app.mgsim.wufun.R;
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class MgpapaInterestingIncludeBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24751b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24752c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ViewPager f24753d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f24754e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final HListView f24755f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24756g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f24757h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24758i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f24759j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f24760k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f24761l;

    private MgpapaInterestingIncludeBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ViewPager viewPager, @NonNull LinearLayout linearLayout, @NonNull HListView hListView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull LinearLayout linearLayout2) {
        this.f24751b = relativeLayout;
        this.f24752c = imageView;
        this.f24753d = viewPager;
        this.f24754e = linearLayout;
        this.f24755f = hListView;
        this.f24756g = textView;
        this.f24757h = textView2;
        this.f24758i = textView3;
        this.f24759j = textView4;
        this.f24760k = textView5;
        this.f24761l = linearLayout2;
    }

    @NonNull
    public static MgpapaInterestingIncludeBinding bind(@NonNull View view) {
        int i4 = R.id.imageView5;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView5);
        if (imageView != null) {
            i4 = R.id.interestingGallery;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.interestingGallery);
            if (viewPager != null) {
                i4 = R.id.intersetingMore;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.intersetingMore);
                if (linearLayout != null) {
                    i4 = R.id.interstinglist;
                    HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.interstinglist);
                    if (hListView != null) {
                        i4 = R.id.mgpapinterstingTitle;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.mgpapinterstingTitle);
                        if (textView != null) {
                            i4 = R.id.textView;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                            if (textView2 != null) {
                                i4 = R.id.textView11;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView11);
                                if (textView3 != null) {
                                    i4 = R.id.textView2;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView2);
                                    if (textView4 != null) {
                                        i4 = R.id.textView6;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView6);
                                        if (textView5 != null) {
                                            i4 = R.id.top;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.top);
                                            if (linearLayout2 != null) {
                                                return new MgpapaInterestingIncludeBinding((RelativeLayout) view, imageView, viewPager, linearLayout, hListView, textView, textView2, textView3, textView4, textView5, linearLayout2);
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
    public static MgpapaInterestingIncludeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24751b;
    }

    @NonNull
    public static MgpapaInterestingIncludeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapa_interesting_include, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
