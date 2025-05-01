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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class BaiduAdListviewItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17493b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17494c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17495d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f17496e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f17497f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f17498g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17499h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17500i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17501j;

    private BaiduAdListviewItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f17493b = linearLayout;
        this.f17494c = textView;
        this.f17495d = textView2;
        this.f17496e = simpleDraweeView;
        this.f17497f = imageView;
        this.f17498g = relativeLayout;
        this.f17499h = textView3;
        this.f17500i = textView4;
        this.f17501j = textView5;
    }

    @NonNull
    public static BaiduAdListviewItemBinding bind(@NonNull View view) {
        int i4 = R.id.native_brand_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.native_brand_name);
        if (textView != null) {
            i4 = R.id.native_cta;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.native_cta);
            if (textView2 != null) {
                i4 = R.id.native_icon_image;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.native_icon_image);
                if (simpleDraweeView != null) {
                    i4 = R.id.native_main_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.native_main_image);
                    if (imageView != null) {
                        i4 = R.id.native_outer_view;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.native_outer_view);
                        if (relativeLayout != null) {
                            i4 = R.id.native_text;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.native_text);
                            if (textView3 != null) {
                                i4 = R.id.native_title;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.native_title);
                                if (textView4 != null) {
                                    i4 = R.id.textView26;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView26);
                                    if (textView5 != null) {
                                        return new BaiduAdListviewItemBinding((LinearLayout) view, textView, textView2, simpleDraweeView, imageView, relativeLayout, textView3, textView4, textView5);
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
    public static BaiduAdListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17493b;
    }

    @NonNull
    public static BaiduAdListviewItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.baidu_ad_listview_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
