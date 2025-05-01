package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ItemGameRecommendView1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f22319b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f22320c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f22321d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f22322e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f22323f;

    private ItemGameRecommendView1Binding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2) {
        this.f22319b = constraintLayout;
        this.f22320c = simpleDraweeView;
        this.f22321d = textView;
        this.f22322e = view;
        this.f22323f = textView2;
    }

    @NonNull
    public static ItemGameRecommendView1Binding bind(@NonNull View view) {
        int i4 = R.id.bg;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.bg);
        if (simpleDraweeView != null) {
            i4 = R.id.desc;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.desc);
            if (textView != null) {
                i4 = R.id.tbg;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.tbg);
                if (findChildViewById != null) {
                    i4 = R.id.title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                    if (textView2 != null) {
                        return new ItemGameRecommendView1Binding((ConstraintLayout) view, simpleDraweeView, textView, findChildViewById, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ItemGameRecommendView1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f22319b;
    }

    @NonNull
    public static ItemGameRecommendView1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.item_game_recommend_view1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
