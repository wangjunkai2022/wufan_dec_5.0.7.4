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
public final class LayoutMygameEditItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23155b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23156c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f23157d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f23158e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f23159f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f23160g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23161h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f23162i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f23163j;

    private LayoutMygameEditItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout3) {
        this.f23155b = linearLayout;
        this.f23156c = textView;
        this.f23157d = imageView;
        this.f23158e = simpleDraweeView;
        this.f23159f = imageView2;
        this.f23160g = linearLayout2;
        this.f23161h = textView2;
        this.f23162i = imageView3;
        this.f23163j = linearLayout3;
    }

    @NonNull
    public static LayoutMygameEditItemBinding bind(@NonNull View view) {
        int i4 = R.id.appInfo;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appInfo);
        if (textView != null) {
            i4 = R.id.giftPackageSwitch;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.giftPackageSwitch);
            if (imageView != null) {
                i4 = R.id.img;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.img);
                if (simpleDraweeView != null) {
                    i4 = R.id.isSelector;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.isSelector);
                    if (imageView2 != null) {
                        i4 = R.id.linearLayoutApp;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linearLayoutApp);
                        if (linearLayout != null) {
                            i4 = R.id.name;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                            if (textView2 != null) {
                                i4 = R.id.notOpen;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.notOpen);
                                if (imageView3 != null) {
                                    i4 = R.id.status;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.status);
                                    if (linearLayout2 != null) {
                                        return new LayoutMygameEditItemBinding((LinearLayout) view, textView, imageView, simpleDraweeView, imageView2, linearLayout, textView2, imageView3, linearLayout2);
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
    public static LayoutMygameEditItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23155b;
    }

    @NonNull
    public static LayoutMygameEditItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_mygame_edit_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
