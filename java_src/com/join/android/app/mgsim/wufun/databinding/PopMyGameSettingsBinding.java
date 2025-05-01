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
public final class PopMyGameSettingsBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26096b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26097c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26098d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26099e;

    private PopMyGameSettingsBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f26096b = linearLayout;
        this.f26097c = textView;
        this.f26098d = textView2;
        this.f26099e = textView3;
    }

    @NonNull
    public static PopMyGameSettingsBinding bind(@NonNull View view) {
        int i4 = R.id.cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cancel);
        if (textView != null) {
            i4 = R.id.scan;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.scan);
            if (textView2 != null) {
                i4 = R.id.settings;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.settings);
                if (textView3 != null) {
                    return new PopMyGameSettingsBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static PopMyGameSettingsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26096b;
    }

    @NonNull
    public static PopMyGameSettingsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.pop_my_game_settings, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
