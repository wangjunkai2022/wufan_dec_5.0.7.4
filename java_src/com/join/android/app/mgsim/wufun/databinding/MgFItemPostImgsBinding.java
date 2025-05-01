package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class MgFItemPostImgsBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23749b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23750c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f23751d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f23752e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f23753f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f23754g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final RelativeLayout f23755h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f23756i;

    private MgFItemPostImgsBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull SimpleDraweeView simpleDraweeView3, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull View view) {
        this.f23749b = relativeLayout;
        this.f23750c = textView;
        this.f23751d = simpleDraweeView;
        this.f23752e = simpleDraweeView2;
        this.f23753f = simpleDraweeView3;
        this.f23754g = linearLayout;
        this.f23755h = relativeLayout2;
        this.f23756i = view;
    }

    @NonNull
    public static MgFItemPostImgsBinding bind(@NonNull View view) {
        int i4 = R.id.images_count;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.images_count);
        if (textView != null) {
            i4 = R.id.img_m_1;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_m_1);
            if (simpleDraweeView != null) {
                i4 = R.id.img_m_2;
                SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_m_2);
                if (simpleDraweeView2 != null) {
                    i4 = R.id.img_m_3;
                    SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img_m_3);
                    if (simpleDraweeView3 != null) {
                        i4 = R.id.imgsMain;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.imgsMain);
                        if (linearLayout != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            i4 = R.id.spaceT;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.spaceT);
                            if (findChildViewById != null) {
                                return new MgFItemPostImgsBinding(relativeLayout, textView, simpleDraweeView, simpleDraweeView2, simpleDraweeView3, linearLayout, relativeLayout, findChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgFItemPostImgsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23749b;
    }

    @NonNull
    public static MgFItemPostImgsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_f_item_post_imgs, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
