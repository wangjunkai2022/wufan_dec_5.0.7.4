package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgGamedetailInfomationItemTopBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24495b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24496c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f24497d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f24498e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24499f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f24500g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f24501h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24502i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f24503j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f24504k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f24505l;

    private MgGamedetailInfomationItemTopBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f24495b = linearLayout;
        this.f24496c = imageView;
        this.f24497d = imageView2;
        this.f24498e = simpleDraweeView;
        this.f24499f = textView;
        this.f24500g = linearLayout2;
        this.f24501h = view;
        this.f24502i = textView2;
        this.f24503j = textView3;
        this.f24504k = textView4;
        this.f24505l = textView5;
    }

    @NonNull
    public static MgGamedetailInfomationItemTopBinding bind(@NonNull View view) {
        int i4 = R.id.imageView16;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView16);
        if (imageView != null) {
            i4 = R.id.imageView17;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView17);
            if (imageView2 != null) {
                i4 = R.id.informationImage;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.informationImage);
                if (simpleDraweeView != null) {
                    i4 = R.id.informationTv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.informationTv);
                    if (textView != null) {
                        i4 = R.id.layoutInformation;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutInformation);
                        if (linearLayout != null) {
                            i4 = R.id.line;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                            if (findChildViewById != null) {
                                i4 = R.id.messageType;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.messageType);
                                if (textView2 != null) {
                                    i4 = R.id.pubtime;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.pubtime);
                                    if (textView3 != null) {
                                        i4 = R.id.pv;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.pv);
                                        if (textView4 != null) {
                                            i4 = R.id.uv;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.uv);
                                            if (textView5 != null) {
                                                return new MgGamedetailInfomationItemTopBinding((LinearLayout) view, imageView, imageView2, simpleDraweeView, textView, linearLayout, findChildViewById, textView2, textView3, textView4, textView5);
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
    public static MgGamedetailInfomationItemTopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24495b;
    }

    @NonNull
    public static MgGamedetailInfomationItemTopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_gamedetail_infomation_item_top, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
