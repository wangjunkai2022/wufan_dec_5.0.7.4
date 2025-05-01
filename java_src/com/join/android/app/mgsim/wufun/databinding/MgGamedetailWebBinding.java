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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgGamedetailWebBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24553b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final RelativeLayout f24554c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24555d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24556e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24557f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24558g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f24559h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f24560i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f24561j;

    private MgGamedetailWebBinding(@NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull View view, @NonNull TextView textView6) {
        this.f24553b = linearLayout;
        this.f24554c = relativeLayout;
        this.f24555d = textView;
        this.f24556e = textView2;
        this.f24557f = textView3;
        this.f24558g = textView4;
        this.f24559h = textView5;
        this.f24560i = view;
        this.f24561j = textView6;
    }

    @NonNull
    public static MgGamedetailWebBinding bind(@NonNull View view) {
        int i4 = R.id.backLayout;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.backLayout);
        if (relativeLayout != null) {
            i4 = R.id.editRecommend;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.editRecommend);
            if (textView != null) {
                i4 = R.id.gameDescribe;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gameDescribe);
                if (textView2 != null) {
                    i4 = R.id.htmlEditRecommend;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.htmlEditRecommend);
                    if (textView3 != null) {
                        i4 = R.id.htmlGameDescribe;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.htmlGameDescribe);
                        if (textView4 != null) {
                            i4 = R.id.htmlGameDescribeShort;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.htmlGameDescribeShort);
                            if (textView5 != null) {
                                i4 = R.id.lineView;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.lineView);
                                if (findChildViewById != null) {
                                    i4 = R.id.textMore;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textMore);
                                    if (textView6 != null) {
                                        return new MgGamedetailWebBinding((LinearLayout) view, relativeLayout, textView, textView2, textView3, textView4, textView5, findChildViewById, textView6);
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
    public static MgGamedetailWebBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24553b;
    }

    @NonNull
    public static MgGamedetailWebBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_gamedetail_web, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
