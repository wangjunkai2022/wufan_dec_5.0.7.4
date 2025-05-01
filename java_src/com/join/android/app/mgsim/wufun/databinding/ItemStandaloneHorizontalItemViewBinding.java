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
public final class ItemStandaloneHorizontalItemViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22843b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f22844c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f22845d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SimpleDraweeView f22846e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22847f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f22848g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f22849h;

    private ItemStandaloneHorizontalItemViewBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout2) {
        this.f22843b = linearLayout;
        this.f22844c = textView;
        this.f22845d = imageView;
        this.f22846e = simpleDraweeView;
        this.f22847f = textView2;
        this.f22848g = textView3;
        this.f22849h = linearLayout2;
    }

    @NonNull
    public static ItemStandaloneHorizontalItemViewBinding bind(@NonNull View view) {
        int i4 = R.id.appname1;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appname1);
        if (textView != null) {
            i4 = R.id.flag;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.flag);
            if (imageView != null) {
                i4 = R.id.image1;
                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.image1);
                if (simpleDraweeView != null) {
                    i4 = R.id.mgListviewItemInstall;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.mgListviewItemInstall);
                    if (textView2 != null) {
                        i4 = R.id.moneyText;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.moneyText);
                        if (textView3 != null) {
                            LinearLayout linearLayout = (LinearLayout) view;
                            return new ItemStandaloneHorizontalItemViewBinding(linearLayout, textView, imageView, simpleDraweeView, textView2, textView3, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemStandaloneHorizontalItemViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22843b;
    }

    @NonNull
    public static ItemStandaloneHorizontalItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_standalone_horizontal_item_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
