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
import com.join.mgps.customview.MyGridView;
/* loaded from: classes3.dex */
public final class GamedetailItemFactoryRecommendBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20552b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20553c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f20554d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f20555e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final MyGridView f20556f;

    private GamedetailItemFactoryRecommendBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull MyGridView myGridView) {
        this.f20552b = linearLayout;
        this.f20553c = textView;
        this.f20554d = linearLayout2;
        this.f20555e = view;
        this.f20556f = myGridView;
    }

    @NonNull
    public static GamedetailItemFactoryRecommendBinding bind(@NonNull View view) {
        int i4 = R.id.giftsTitle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.giftsTitle);
        if (textView != null) {
            i4 = R.id.layoutContent;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layoutContent);
            if (linearLayout != null) {
                i4 = R.id.line_h;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line_h);
                if (findChildViewById != null) {
                    i4 = R.id.recomListView;
                    MyGridView myGridView = (MyGridView) ViewBindings.findChildViewById(view, R.id.recomListView);
                    if (myGridView != null) {
                        return new GamedetailItemFactoryRecommendBinding((LinearLayout) view, textView, linearLayout, findChildViewById, myGridView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetailItemFactoryRecommendBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20552b;
    }

    @NonNull
    public static GamedetailItemFactoryRecommendBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetail_item_factory_recommend, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
