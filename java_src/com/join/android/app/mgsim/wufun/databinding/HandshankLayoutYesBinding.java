package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.HandShankAdView;
/* loaded from: classes3.dex */
public final class HandshankLayoutYesBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21408b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f21409c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ListView f21410d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final HandShankAdView f21411e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21412f;

    private HandshankLayoutYesBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull ListView listView, @NonNull HandShankAdView handShankAdView, @NonNull TextView textView) {
        this.f21408b = linearLayout;
        this.f21409c = frameLayout;
        this.f21410d = listView;
        this.f21411e = handShankAdView;
        this.f21412f = textView;
    }

    @NonNull
    public static HandshankLayoutYesBinding bind(@NonNull View view) {
        int i4 = R.id.handshank_tip_lay;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.handshank_tip_lay);
        if (frameLayout != null) {
            i4 = R.id.listview;
            ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.listview);
            if (listView != null) {
                i4 = R.id.mAdView;
                HandShankAdView handShankAdView = (HandShankAdView) ViewBindings.findChildViewById(view, R.id.mAdView);
                if (handShankAdView != null) {
                    i4 = R.id.papahandList;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.papahandList);
                    if (textView != null) {
                        return new HandshankLayoutYesBinding((LinearLayout) view, frameLayout, listView, handShankAdView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static HandshankLayoutYesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21408b;
    }

    @NonNull
    public static HandshankLayoutYesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.handshank_layout_yes, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
