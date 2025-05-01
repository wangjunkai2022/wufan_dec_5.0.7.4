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
public final class GameDetialmoreServiceItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20344b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20345c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20346d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f20347e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20348f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20349g;

    private GameDetialmoreServiceItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull View view, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f20344b = linearLayout;
        this.f20345c = textView;
        this.f20346d = textView2;
        this.f20347e = view;
        this.f20348f = textView3;
        this.f20349g = textView4;
    }

    @NonNull
    public static GameDetialmoreServiceItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.date;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.date);
        if (textView != null) {
            i4 = R.id.dateMorning;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.dateMorning);
            if (textView2 != null) {
                i4 = R.id.line_h;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line_h);
                if (findChildViewById != null) {
                    i4 = R.id.message;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.message);
                    if (textView3 != null) {
                        i4 = R.id.messageType;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.messageType);
                        if (textView4 != null) {
                            return new GameDetialmoreServiceItemLayoutBinding((LinearLayout) view, textView, textView2, findChildViewById, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameDetialmoreServiceItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20344b;
    }

    @NonNull
    public static GameDetialmoreServiceItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_detialmore_service_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
