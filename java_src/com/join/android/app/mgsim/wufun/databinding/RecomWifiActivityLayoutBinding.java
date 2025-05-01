package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class RecomWifiActivityLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26220b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26221c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f26222d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final GridView f26223e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26224f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26225g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26226h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26227i;

    private RecomWifiActivityLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull GridView gridView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f26220b = linearLayout;
        this.f26221c = imageView;
        this.f26222d = button;
        this.f26223e = gridView;
        this.f26224f = linearLayout2;
        this.f26225g = textView;
        this.f26226h = textView2;
        this.f26227i = textView3;
    }

    @NonNull
    public static RecomWifiActivityLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.close);
        if (imageView != null) {
            i4 = R.id.downloadButn;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.downloadButn);
            if (button != null) {
                i4 = R.id.gridviewShowRecomed;
                GridView gridView = (GridView) ViewBindings.findChildViewById(view, R.id.gridviewShowRecomed);
                if (gridView != null) {
                    i4 = R.id.recomWifiLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.recomWifiLayout);
                    if (linearLayout != null) {
                        i4 = R.id.textView13;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView13);
                        if (textView != null) {
                            i4 = R.id.textView15;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView15);
                            if (textView2 != null) {
                                i4 = R.id.titleTextview;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.titleTextview);
                                if (textView3 != null) {
                                    return new RecomWifiActivityLayoutBinding((LinearLayout) view, imageView, button, gridView, linearLayout, textView, textView2, textView3);
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
    public static RecomWifiActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26220b;
    }

    @NonNull
    public static RecomWifiActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.recom_wifi_activity_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
