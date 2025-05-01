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
public final class GameDetialServiceItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20324b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20325c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20326d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20327e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f20328f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20329g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f20330h;

    private GameDetialServiceItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f20324b = linearLayout;
        this.f20325c = linearLayout2;
        this.f20326d = textView;
        this.f20327e = textView2;
        this.f20328f = view;
        this.f20329g = textView3;
        this.f20330h = textView4;
    }

    @NonNull
    public static GameDetialServiceItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.backLayout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.backLayout);
        if (linearLayout != null) {
            i4 = R.id.date;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.date);
            if (textView != null) {
                i4 = R.id.dateMorning;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.dateMorning);
                if (textView2 != null) {
                    i4 = R.id.line;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                    if (findChildViewById != null) {
                        i4 = R.id.message;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.message);
                        if (textView3 != null) {
                            i4 = R.id.messageType;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.messageType);
                            if (textView4 != null) {
                                return new GameDetialServiceItemLayoutBinding((LinearLayout) view, linearLayout, textView, textView2, findChildViewById, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameDetialServiceItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20324b;
    }

    @NonNull
    public static GameDetialServiceItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_detial_service_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
