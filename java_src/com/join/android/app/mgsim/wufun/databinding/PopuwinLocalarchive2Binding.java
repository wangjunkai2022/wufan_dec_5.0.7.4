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
public final class PopuwinLocalarchive2Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26134b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26135c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26136d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26137e;

    private PopuwinLocalarchive2Binding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f26134b = linearLayout;
        this.f26135c = textView;
        this.f26136d = textView2;
        this.f26137e = textView3;
    }

    @NonNull
    public static PopuwinLocalarchive2Binding bind(@NonNull View view) {
        int i4 = R.id.good;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.good);
        if (textView != null) {
            i4 = R.id.introduce;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.introduce);
            if (textView2 != null) {
                i4 = R.id.plagiarize;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.plagiarize);
                if (textView3 != null) {
                    return new PopuwinLocalarchive2Binding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopuwinLocalarchive2Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26134b;
    }

    @NonNull
    public static PopuwinLocalarchive2Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.popuwin_localarchive2, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
