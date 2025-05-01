package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogFightWifiErrorBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18743b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18744c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18745d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f18746e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18747f;

    private DialogFightWifiErrorBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull Button button, @NonNull TextView textView2) {
        this.f18743b = relativeLayout;
        this.f18744c = imageView;
        this.f18745d = textView;
        this.f18746e = button;
        this.f18747f = textView2;
    }

    @NonNull
    public static DialogFightWifiErrorBinding bind(@NonNull View view) {
        int i4 = R.id.cancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.cancel);
        if (imageView != null) {
            i4 = R.id.info;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.info);
            if (textView != null) {
                i4 = R.id.setting;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.setting);
                if (button != null) {
                    i4 = R.id.title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                    if (textView2 != null) {
                        return new DialogFightWifiErrorBinding((RelativeLayout) view, imageView, textView, button, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogFightWifiErrorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18743b;
    }

    @NonNull
    public static DialogFightWifiErrorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_fight_wifi_error, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
