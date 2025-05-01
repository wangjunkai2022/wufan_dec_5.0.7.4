package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.XListView2;
/* loaded from: classes3.dex */
public final class FragmentMyGameV1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f20014b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f20015c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20016d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f20017e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20018f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f20019g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final XListView2 f20020h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f20021i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final FragmentMyGameItemUpdateBinding f20022j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f20023k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f20024l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f20025m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final LinearLayout f20026n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final ConstraintLayout f20027o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f20028p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f20029q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final View f20030r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final TextView f20031s;
    @NonNull

    /* renamed from: t  reason: collision with root package name */
    public final TextView f20032t;

    private FragmentMyGameV1Binding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull XListView2 xListView2, @NonNull LinearLayout linearLayout, @NonNull FragmentMyGameItemUpdateBinding fragmentMyGameItemUpdateBinding, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull View view2, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f20014b = constraintLayout;
        this.f20015c = constraintLayout2;
        this.f20016d = imageView;
        this.f20017e = view;
        this.f20018f = textView;
        this.f20019g = imageView2;
        this.f20020h = xListView2;
        this.f20021i = linearLayout;
        this.f20022j = fragmentMyGameItemUpdateBinding;
        this.f20023k = textView2;
        this.f20024l = textView3;
        this.f20025m = imageView3;
        this.f20026n = linearLayout2;
        this.f20027o = constraintLayout3;
        this.f20028p = imageView4;
        this.f20029q = imageView5;
        this.f20030r = view2;
        this.f20031s = textView4;
        this.f20032t = textView5;
    }

    @NonNull
    public static FragmentMyGameV1Binding bind(@NonNull View view) {
        int i4 = R.id.appbar;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.appbar);
        if (constraintLayout != null) {
            i4 = R.id.back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
            if (imageView != null) {
                i4 = R.id.filter;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.filter);
                if (findChildViewById != null) {
                    i4 = R.id.filterArr;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.filterArr);
                    if (textView != null) {
                        i4 = R.id.ivOnlineCouponBottomClose;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.ivOnlineCouponBottomClose);
                        if (imageView2 != null) {
                            i4 = R.id.listView;
                            XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.listView);
                            if (xListView2 != null) {
                                i4 = R.id.llOnlineCouponBottom;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llOnlineCouponBottom);
                                if (linearLayout != null) {
                                    i4 = R.id.needUpdate;
                                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.needUpdate);
                                    if (findChildViewById2 != null) {
                                        FragmentMyGameItemUpdateBinding bind = FragmentMyGameItemUpdateBinding.bind(findChildViewById2);
                                        i4 = R.id.plugProgress;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.plugProgress);
                                        if (textView2 != null) {
                                            i4 = R.id.plugType;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.plugType);
                                            if (textView3 != null) {
                                                i4 = R.id.plugs;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.plugs);
                                                if (imageView3 != null) {
                                                    i4 = R.id.plugsDownloadTip;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.plugsDownloadTip);
                                                    if (linearLayout2 != null) {
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                        i4 = R.id.search;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.search);
                                                        if (imageView4 != null) {
                                                            i4 = R.id.settings;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, R.id.settings);
                                                            if (imageView5 != null) {
                                                                i4 = R.id.statubar;
                                                                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.statubar);
                                                                if (findChildViewById3 != null) {
                                                                    i4 = R.id.title;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                                                    if (textView4 != null) {
                                                                        i4 = R.id.tvOnlineCouponBottomDesc;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOnlineCouponBottomDesc);
                                                                        if (textView5 != null) {
                                                                            return new FragmentMyGameV1Binding(constraintLayout2, constraintLayout, imageView, findChildViewById, textView, imageView2, xListView2, linearLayout, bind, textView2, textView3, imageView3, linearLayout2, constraintLayout2, imageView4, imageView5, findChildViewById3, textView4, textView5);
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
    public static FragmentMyGameV1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f20014b;
    }

    @NonNull
    public static FragmentMyGameV1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fragment_my_game_v1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
