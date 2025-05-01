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
public final class ItemPapaStandaloneRecTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f22549b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f22550c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22551d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f22552e;

    private ItemPapaStandaloneRecTitleBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f22549b = linearLayout;
        this.f22550c = view;
        this.f22551d = textView;
        this.f22552e = textView2;
    }

    @NonNull
    public static ItemPapaStandaloneRecTitleBinding bind(@NonNull View view) {
        int i4 = R.id.line;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
        if (findChildViewById != null) {
            i4 = R.id.tv_all;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_all);
            if (textView != null) {
                i4 = R.id.tv_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                if (textView2 != null) {
                    return new ItemPapaStandaloneRecTitleBinding((LinearLayout) view, findChildViewById, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemPapaStandaloneRecTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f22549b;
    }

    @NonNull
    public static ItemPapaStandaloneRecTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_papa_standalone_rec_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
