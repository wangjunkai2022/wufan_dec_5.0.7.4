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
public final class LayoutSimulatorLaunchMomentItemHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23380b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f23381c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23382d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23383e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23384f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23385g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f23386h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f23387i;

    private LayoutSimulatorLaunchMomentItemHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f23380b = linearLayout;
        this.f23381c = textView;
        this.f23382d = textView2;
        this.f23383e = textView3;
        this.f23384f = textView4;
        this.f23385g = textView5;
        this.f23386h = textView6;
        this.f23387i = textView7;
    }

    @NonNull
    public static LayoutSimulatorLaunchMomentItemHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.tvBattle;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tvBattle);
        if (textView != null) {
            i4 = R.id.tvLastPlayTime;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tvLastPlayTime);
            if (textView2 != null) {
                i4 = R.id.tvOnlinePlayerCount;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tvOnlinePlayerCount);
                if (textView3 != null) {
                    i4 = R.id.tvTitle1;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle1);
                    if (textView4 != null) {
                        i4 = R.id.tvTitle2;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle2);
                        if (textView5 != null) {
                            i4 = R.id.tvTitle3;
                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTitle3);
                            if (textView6 != null) {
                                i4 = R.id.tvTotalPlayTime;
                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tvTotalPlayTime);
                                if (textView7 != null) {
                                    return new LayoutSimulatorLaunchMomentItemHeaderBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
    public static LayoutSimulatorLaunchMomentItemHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23380b;
    }

    @NonNull
    public static LayoutSimulatorLaunchMomentItemHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.layout_simulator_launch_moment_item_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
