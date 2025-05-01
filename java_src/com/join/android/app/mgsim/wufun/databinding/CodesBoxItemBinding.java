package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CodesBoxItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18025b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f18026c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18027d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18028e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f18029f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18030g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18031h;

    private CodesBoxItemBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f18025b = linearLayout;
        this.f18026c = simpleDraweeView;
        this.f18027d = textView;
        this.f18028e = textView2;
        this.f18029f = linearLayout2;
        this.f18030g = textView3;
        this.f18031h = textView4;
    }

    @NonNull
    public static CodesBoxItemBinding bind(@NonNull View view) {
        int i4 = R.id.giftIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.giftIcon);
        if (simpleDraweeView != null) {
            i4 = R.id.giftNameTime;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.giftNameTime);
            if (textView != null) {
                i4 = R.id.giftNameTv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.giftNameTv);
                if (textView2 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i4 = R.id.saveCodeContent;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.saveCodeContent);
                    if (textView3 != null) {
                        i4 = R.id.saveCodeTv;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.saveCodeTv);
                        if (textView4 != null) {
                            return new CodesBoxItemBinding(linearLayout, simpleDraweeView, textView, textView2, linearLayout, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CodesBoxItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18025b;
    }

    @NonNull
    public static CodesBoxItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.codes_box_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
