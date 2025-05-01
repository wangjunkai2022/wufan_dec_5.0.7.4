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
public final class MgpapaHomeGameNewsLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final ConstraintLayout f24734b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final SimpleDraweeView f24735c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ConstraintLayout f24736d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24737e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24738f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f24739g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f24740h;

    private MgpapaHomeGameNewsLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull SimpleDraweeView simpleDraweeView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view) {
        this.f24734b = constraintLayout;
        this.f24735c = simpleDraweeView;
        this.f24736d = constraintLayout2;
        this.f24737e = textView;
        this.f24738f = textView2;
        this.f24739g = textView3;
        this.f24740h = view;
    }

    @NonNull
    public static MgpapaHomeGameNewsLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.ivGameIcon;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.ivGameIcon);
        if (simpleDraweeView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i4 = R.id.tvDate;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvDate);
            if (textView != null) {
                i4 = R.id.tvDesc;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvDesc);
                if (textView2 != null) {
                    i4 = R.id.tvGameName;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvGameName);
                    if (textView3 != null) {
                        i4 = R.id.viewTag;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.viewTag);
                        if (findChildViewById != null) {
                            return new MgpapaHomeGameNewsLayoutBinding(constraintLayout, simpleDraweeView, constraintLayout, textView, textView2, textView3, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgpapaHomeGameNewsLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public ConstraintLayout getRoot() {
        return this.f24734b;
    }

    @NonNull
    public static MgpapaHomeGameNewsLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mgpapa_home_game_news_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
