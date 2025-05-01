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
import com.join.mgps.customview.CloudDownButn;
/* loaded from: classes3.dex */
public final class CloudListItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17973b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17974c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final CloudDownButn f17975d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f17976e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17977f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SimpleDraweeView f17978g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17979h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17980i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17981j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f17982k;

    private CloudListItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull CloudDownButn cloudDownButn, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f17973b = linearLayout;
        this.f17974c = textView;
        this.f17975d = cloudDownButn;
        this.f17976e = linearLayout2;
        this.f17977f = textView2;
        this.f17978g = simpleDraweeView;
        this.f17979h = textView3;
        this.f17980i = textView4;
        this.f17981j = textView5;
        this.f17982k = textView6;
    }

    @NonNull
    public static CloudListItemBinding bind(@NonNull View view) {
        int i4 = R.id.backUp;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.backUp);
        if (textView != null) {
            i4 = R.id.downButton;
            CloudDownButn cloudDownButn = (CloudDownButn) ViewBindings.findChildViewById(view, R.id.downButton);
            if (cloudDownButn != null) {
                i4 = R.id.iv_more;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_more);
                if (linearLayout != null) {
                    i4 = R.id.shape;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.shape);
                    if (textView2 != null) {
                        i4 = R.id.simv;
                        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.simv);
                        if (simpleDraweeView != null) {
                            i4 = R.id.tv_evalute;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_evalute);
                            if (textView3 != null) {
                                i4 = R.id.tv_good;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_good);
                                if (textView4 != null) {
                                    i4 = R.id.tv_name;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                                    if (textView5 != null) {
                                        i4 = R.id.tv_time;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_time);
                                        if (textView6 != null) {
                                            return new CloudListItemBinding((LinearLayout) view, textView, cloudDownButn, linearLayout, textView2, simpleDraweeView, textView3, textView4, textView5, textView6);
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
    public static CloudListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17973b;
    }

    @NonNull
    public static CloudListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.cloud_list_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
