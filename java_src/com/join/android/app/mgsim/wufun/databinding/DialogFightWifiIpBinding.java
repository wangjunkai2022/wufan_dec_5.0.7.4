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
import com.join.mgps.customview.input.InputUnderLine;
/* loaded from: classes3.dex */
public final class DialogFightWifiIpBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18748b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18749c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f18750d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18751e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final InputUnderLine f18752f;

    private DialogFightWifiIpBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull TextView textView, @NonNull InputUnderLine inputUnderLine) {
        this.f18748b = relativeLayout;
        this.f18749c = imageView;
        this.f18750d = button;
        this.f18751e = textView;
        this.f18752f = inputUnderLine;
    }

    @NonNull
    public static DialogFightWifiIpBinding bind(@NonNull View view) {
        int i4 = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_close);
        if (imageView != null) {
            i4 = R.id.join;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.join);
            if (button != null) {
                i4 = R.id.tv_top;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_top);
                if (textView != null) {
                    i4 = R.id.txtIP;
                    InputUnderLine inputUnderLine = (InputUnderLine) ViewBindings.findChildViewById(view, R.id.txtIP);
                    if (inputUnderLine != null) {
                        return new DialogFightWifiIpBinding((RelativeLayout) view, imageView, button, textView, inputUnderLine);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogFightWifiIpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18748b;
    }

    @NonNull
    public static DialogFightWifiIpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_fight_wifi_ip, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
