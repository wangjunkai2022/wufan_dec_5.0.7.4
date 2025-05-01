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
import com.join.mgps.customview.CloudDownButn1;
/* loaded from: classes3.dex */
public final class CloudListItem3Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17960b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f17961c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17962d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final CloudDownButn1 f17963e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17964f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f17965g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f17966h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f17967i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17968j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final SimpleDraweeView f17969k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f17970l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f17971m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17972n;

    private CloudListItem3Binding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull CloudDownButn1 cloudDownButn1, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull TextView textView3, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f17960b = linearLayout;
        this.f17961c = textView;
        this.f17962d = textView2;
        this.f17963e = cloudDownButn1;
        this.f17964f = linearLayout2;
        this.f17965g = linearLayout3;
        this.f17966h = linearLayout4;
        this.f17967i = linearLayout5;
        this.f17968j = textView3;
        this.f17969k = simpleDraweeView;
        this.f17970l = textView4;
        this.f17971m = textView5;
        this.f17972n = textView6;
    }

    @NonNull
    public static CloudListItem3Binding bind(@NonNull View view) {
        int i4 = R.id.authorname;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.authorname);
        if (textView != null) {
            i4 = R.id.backUp;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.backUp);
            if (textView2 != null) {
                i4 = R.id.downButton;
                CloudDownButn1 cloudDownButn1 = (CloudDownButn1) ViewBindings.findChildViewById(view, R.id.downButton);
                if (cloudDownButn1 != null) {
                    i4 = R.id.ll_author;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_author);
                    if (linearLayout != null) {
                        i4 = R.id.ll_info;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_info);
                        if (linearLayout2 != null) {
                            i4 = R.id.ll_vip;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_vip);
                            if (linearLayout3 != null) {
                                LinearLayout linearLayout4 = (LinearLayout) view;
                                i4 = R.id.shape;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.shape);
                                if (textView3 != null) {
                                    i4 = R.id.simv;
                                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.simv);
                                    if (simpleDraweeView != null) {
                                        i4 = R.id.tv_name;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name);
                                        if (textView4 != null) {
                                            i4 = R.id.tvcouldnum;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvcouldnum);
                                            if (textView5 != null) {
                                                i4 = R.id.tvgoodpraisenum;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvgoodpraisenum);
                                                if (textView6 != null) {
                                                    return new CloudListItem3Binding(linearLayout4, textView, textView2, cloudDownButn1, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView3, simpleDraweeView, textView4, textView5, textView6);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static CloudListItem3Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17960b;
    }

    @NonNull
    public static CloudListItem3Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.cloud_list_item3, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
