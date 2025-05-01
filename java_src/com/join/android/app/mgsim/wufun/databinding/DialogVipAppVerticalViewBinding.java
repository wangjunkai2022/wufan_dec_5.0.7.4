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
public final class DialogVipAppVerticalViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19079b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f19080c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19081d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19082e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19083f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19084g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f19085h;

    private DialogVipAppVerticalViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayout linearLayout) {
        this.f19079b = relativeLayout;
        this.f19080c = simpleDraweeView;
        this.f19081d = textView;
        this.f19082e = textView2;
        this.f19083f = textView3;
        this.f19084g = textView4;
        this.f19085h = linearLayout;
    }

    @NonNull
    public static DialogVipAppVerticalViewBinding bind(@NonNull View view) {
        int i4 = R.id.mainDialogAdImg;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.mainDialogAdImg);
        if (simpleDraweeView != null) {
            i4 = R.id.mainDialogCancelTv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.mainDialogCancelTv);
            if (textView != null) {
                i4 = R.id.mainDialogContenTv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.mainDialogContenTv);
                if (textView2 != null) {
                    i4 = R.id.mainDialogOkIv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.mainDialogOkIv);
                    if (textView3 != null) {
                        i4 = R.id.mainDialogTopTv;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.mainDialogTopTv);
                        if (textView4 != null) {
                            i4 = R.id.rootLl;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.rootLl);
                            if (linearLayout != null) {
                                return new DialogVipAppVerticalViewBinding((RelativeLayout) view, simpleDraweeView, textView, textView2, textView3, textView4, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogVipAppVerticalViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19079b;
    }

    @NonNull
    public static DialogVipAppVerticalViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_vip_app_vertical_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
