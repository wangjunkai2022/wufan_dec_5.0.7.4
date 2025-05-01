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
public final class MgGamedetailmoreInfomationItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24562b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f24563c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24564d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24565e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f24566f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f24567g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f24568h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24569i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f24570j;

    private MgGamedetailmoreInfomationItemBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f24562b = linearLayout;
        this.f24563c = simpleDraweeView;
        this.f24564d = linearLayout2;
        this.f24565e = textView;
        this.f24566f = linearLayout3;
        this.f24567g = linearLayout4;
        this.f24568h = view;
        this.f24569i = textView2;
        this.f24570j = textView3;
    }

    @NonNull
    public static MgGamedetailmoreInfomationItemBinding bind(@NonNull View view) {
        int i4 = R.id.informationImage;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.informationImage);
        if (simpleDraweeView != null) {
            i4 = R.id.informationTitle;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.informationTitle);
            if (linearLayout != null) {
                i4 = R.id.informationTv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.informationTv);
                if (textView != null) {
                    i4 = R.id.layoutInformation;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutInformation);
                    if (linearLayout2 != null) {
                        i4 = R.id.layoutTop;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutTop);
                        if (linearLayout3 != null) {
                            i4 = R.id.line_h;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.line_h);
                            if (findChildViewById != null) {
                                i4 = R.id.messageType;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.messageType);
                                if (textView2 != null) {
                                    i4 = R.id.pubtime1;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.pubtime1);
                                    if (textView3 != null) {
                                        return new MgGamedetailmoreInfomationItemBinding((LinearLayout) view, simpleDraweeView, linearLayout, textView, linearLayout2, linearLayout3, findChildViewById, textView2, textView3);
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
    public static MgGamedetailmoreInfomationItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24562b;
    }

    @NonNull
    public static MgGamedetailmoreInfomationItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_gamedetailmore_infomation_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
