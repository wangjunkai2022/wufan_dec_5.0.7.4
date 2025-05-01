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
public final class GamelistAppsizeDowncountLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21137b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21138c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21139d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21140e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21141f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f21142g;

    private GamelistAppsizeDowncountLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f21137b = linearLayout;
        this.f21138c = textView;
        this.f21139d = textView2;
        this.f21140e = textView3;
        this.f21141f = textView4;
        this.f21142g = textView5;
    }

    @NonNull
    public static GamelistAppsizeDowncountLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.ad_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.ad_text);
        if (textView != null) {
            i4 = R.id.appType;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.appType);
            if (textView2 != null) {
                i4 = R.id.appdownCount;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.appdownCount);
                if (textView3 != null) {
                    i4 = R.id.appsize;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.appsize);
                    if (textView4 != null) {
                        i4 = R.id.pingfen;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.pingfen);
                        if (textView5 != null) {
                            return new GamelistAppsizeDowncountLayoutBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamelistAppsizeDowncountLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21137b;
    }

    @NonNull
    public static GamelistAppsizeDowncountLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamelist_appsize_downcount_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
