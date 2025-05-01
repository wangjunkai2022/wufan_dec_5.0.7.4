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
import com.join.mgps.customview.MultilineTextView;
/* loaded from: classes3.dex */
public final class ChioceItemOrderMainBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f17758b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f17759c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17760d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final MultilineTextView f17761e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17762f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f17763g;

    private ChioceItemOrderMainBinding(@NonNull RelativeLayout relativeLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull MultilineTextView multilineTextView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2) {
        this.f17758b = relativeLayout;
        this.f17759c = simpleDraweeView;
        this.f17760d = textView;
        this.f17761e = multilineTextView;
        this.f17762f = linearLayout;
        this.f17763g = textView2;
    }

    @NonNull
    public static ChioceItemOrderMainBinding bind(@NonNull View view) {
        int i4 = R.id.cover;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.cover);
        if (simpleDraweeView != null) {
            i4 = R.id.date;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.date);
            if (textView != null) {
                i4 = R.id.desc;
                MultilineTextView multilineTextView = (MultilineTextView) ViewBindings.findChildViewById(view, R.id.desc);
                if (multilineTextView != null) {
                    i4 = R.id.detail;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.detail);
                    if (linearLayout != null) {
                        i4 = R.id.name;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.name);
                        if (textView2 != null) {
                            return new ChioceItemOrderMainBinding((RelativeLayout) view, simpleDraweeView, textView, multilineTextView, linearLayout, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ChioceItemOrderMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f17758b;
    }

    @NonNull
    public static ChioceItemOrderMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.chioce_item_order_main, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
