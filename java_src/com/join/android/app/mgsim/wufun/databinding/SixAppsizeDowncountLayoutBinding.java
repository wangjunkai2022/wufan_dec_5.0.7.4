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
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SixAppsizeDowncountLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26620b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26621c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26622d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26623e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26624f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26625g;

    private SixAppsizeDowncountLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f26620b = linearLayout;
        this.f26621c = textView;
        this.f26622d = textView2;
        this.f26623e = textView3;
        this.f26624f = textView4;
        this.f26625g = textView5;
    }

    @NonNull
    public static SixAppsizeDowncountLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.appType;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appType);
        if (textView != null) {
            i4 = R.id.appdownCount;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appdownCount);
            if (textView2 != null) {
                i4 = R.id.appsize;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.appsize);
                if (textView3 != null) {
                    i4 = R.id.pingfen;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.pingfen);
                    if (textView4 != null) {
                        i4 = R.id.tongban;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tongban);
                        if (textView5 != null) {
                            return new SixAppsizeDowncountLayoutBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SixAppsizeDowncountLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26620b;
    }

    @NonNull
    public static SixAppsizeDowncountLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.six_appsize_downcount_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
