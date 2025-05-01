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
import com.join.android.app.component.xrecyclerview.XRecyclerView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.CustomerDownloadView;
/* loaded from: classes3.dex */
public final class VipSpecialzoneActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f27109b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ConstraintLayout f27110c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f27111d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CustomerDownloadView f27112e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f27113f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f27114g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final XRecyclerView f27115h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f27116i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f27117j;

    private VipSpecialzoneActivityBinding(@NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull CustomerDownloadView customerDownloadView, @NonNull View view, @NonNull TextView textView, @NonNull XRecyclerView xRecyclerView, @NonNull ImageView imageView2, @NonNull TextView textView2) {
        this.f27109b = linearLayout;
        this.f27110c = constraintLayout;
        this.f27111d = imageView;
        this.f27112e = customerDownloadView;
        this.f27113f = view;
        this.f27114g = textView;
        this.f27115h = xRecyclerView;
        this.f27116i = imageView2;
        this.f27117j = textView2;
    }

    @NonNull
    public static VipSpecialzoneActivityBinding bind(@NonNull View view) {
        int i4 = R.id.appbar;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.appbar);
        if (constraintLayout != null) {
            i4 = R.id.back;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
            if (imageView != null) {
                i4 = R.id.downloadView;
                CustomerDownloadView customerDownloadView = (CustomerDownloadView) ViewBindings.findChildViewById(view, R.id.downloadView);
                if (customerDownloadView != null) {
                    i4 = R.id.filter;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.filter);
                    if (findChildViewById != null) {
                        i4 = R.id.filterArr;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.filterArr);
                        if (textView != null) {
                            i4 = R.id.recyclerView;
                            XRecyclerView xRecyclerView = (XRecyclerView) ViewBindings.findChildViewById(view, R.id.recyclerView);
                            if (xRecyclerView != null) {
                                i4 = R.id.search;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.search);
                                if (imageView2 != null) {
                                    i4 = R.id.title;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                    if (textView2 != null) {
                                        return new VipSpecialzoneActivityBinding((LinearLayout) view, constraintLayout, imageView, customerDownloadView, findChildViewById, textView, xRecyclerView, imageView2, textView2);
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
    public static VipSpecialzoneActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f27109b;
    }

    @NonNull
    public static VipSpecialzoneActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.vip_specialzone_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
