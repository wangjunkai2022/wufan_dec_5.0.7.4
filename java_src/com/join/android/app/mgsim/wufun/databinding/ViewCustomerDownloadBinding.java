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
/* loaded from: classes3.dex */
public final class ViewCustomerDownloadBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f27025b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f27026c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f27027d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f27028e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f27029f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f27030g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f27031h;

    private ViewCustomerDownloadBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView4) {
        this.f27025b = relativeLayout;
        this.f27026c = imageView;
        this.f27027d = imageView2;
        this.f27028e = imageView3;
        this.f27029f = textView;
        this.f27030g = textView2;
        this.f27031h = imageView4;
    }

    @NonNull
    public static ViewCustomerDownloadBinding bind(@NonNull View view) {
        int i4 = R.id.download_icon_img;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.download_icon_img);
        if (imageView != null) {
            i4 = R.id.download_line_point_view;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.download_line_point_view);
            if (imageView2 != null) {
                i4 = R.id.download_line_view;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.download_line_view);
                if (imageView3 != null) {
                    i4 = R.id.download_num_anim_txt;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.download_num_anim_txt);
                    if (textView != null) {
                        i4 = R.id.download_num_hint_txt;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.download_num_hint_txt);
                        if (textView2 != null) {
                            i4 = R.id.download_red_point;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.download_red_point);
                            if (imageView4 != null) {
                                return new ViewCustomerDownloadBinding((RelativeLayout) view, imageView, imageView2, imageView3, textView, textView2, imageView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ViewCustomerDownloadBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f27025b;
    }

    @NonNull
    public static ViewCustomerDownloadBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.view_customer_download, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
