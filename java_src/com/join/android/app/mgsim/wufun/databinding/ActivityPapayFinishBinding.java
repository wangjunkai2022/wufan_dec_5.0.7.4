package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityPapayFinishBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16721b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f16722c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f16723d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f16724e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f16725f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f16726g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f16727h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f16728i;

    private ActivityPapayFinishBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f16721b = linearLayout;
        this.f16722c = button;
        this.f16723d = imageView;
        this.f16724e = textView;
        this.f16725f = textView2;
        this.f16726g = linearLayout2;
        this.f16727h = textView3;
        this.f16728i = textView4;
    }

    @NonNull
    public static ActivityPapayFinishBinding bind(@NonNull View view) {
        int i4 = R.id.backButn;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.backButn);
        if (button != null) {
            i4 = R.id.imageSuccessOrFailed;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageSuccessOrFailed);
            if (imageView != null) {
                i4 = R.id.orderid;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.orderid);
                if (textView != null) {
                    i4 = R.id.pabiNumber;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.pabiNumber);
                    if (textView2 != null) {
                        i4 = R.id.paySuccess;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.paySuccess);
                        if (linearLayout != null) {
                            i4 = R.id.userName;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.userName);
                            if (textView3 != null) {
                                i4 = R.id.vipRecharge;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.vipRecharge);
                                if (textView4 != null) {
                                    return new ActivityPapayFinishBinding((LinearLayout) view, button, imageView, textView, textView2, linearLayout, textView3, textView4);
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
    public static ActivityPapayFinishBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16721b;
    }

    @NonNull
    public static ActivityPapayFinishBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_papay_finish, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
