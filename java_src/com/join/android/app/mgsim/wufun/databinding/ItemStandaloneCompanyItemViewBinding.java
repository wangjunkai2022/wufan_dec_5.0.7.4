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
public final class ItemStandaloneCompanyItemViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22835b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22836c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f22837d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22838e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f22839f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f22840g;

    private ItemStandaloneCompanyItemViewBinding(@NonNull LinearLayout linearLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull View view, @NonNull View view2) {
        this.f22835b = linearLayout;
        this.f22836c = simpleDraweeView;
        this.f22837d = relativeLayout;
        this.f22838e = textView;
        this.f22839f = view;
        this.f22840g = view2;
    }

    @NonNull
    public static ItemStandaloneCompanyItemViewBinding bind(@NonNull View view) {
        int i4 = R.id.standAloneCompanyIv;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.standAloneCompanyIv);
        if (simpleDraweeView != null) {
            i4 = R.id.standAloneCompanyRootRl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.standAloneCompanyRootRl);
            if (relativeLayout != null) {
                i4 = R.id.standAloneCompanyTv;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.standAloneCompanyTv);
                if (textView != null) {
                    i4 = R.id.standAloneLeftVi;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.standAloneLeftVi);
                    if (findChildViewById != null) {
                        i4 = R.id.standAloneRightVi;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.standAloneRightVi);
                        if (findChildViewById2 != null) {
                            return new ItemStandaloneCompanyItemViewBinding((LinearLayout) view, simpleDraweeView, relativeLayout, textView, findChildViewById, findChildViewById2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemStandaloneCompanyItemViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22835b;
    }

    @NonNull
    public static ItemStandaloneCompanyItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_standalone_company_item_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
