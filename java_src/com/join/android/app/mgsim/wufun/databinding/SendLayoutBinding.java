package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SendLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26476b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26477c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26478d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f26479e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final EditText f26480f;

    private SendLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Button button, @NonNull EditText editText) {
        this.f26476b = relativeLayout;
        this.f26477c = textView;
        this.f26478d = textView2;
        this.f26479e = button;
        this.f26480f = editText;
    }

    @NonNull
    public static SendLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.connect_state;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.connect_state);
        if (textView != null) {
            i4 = R.id.device_name;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.device_name);
            if (textView2 != null) {
                i4 = R.id.send;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.send);
                if (button != null) {
                    i4 = R.id.send_data;
                    EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.send_data);
                    if (editText != null) {
                        return new SendLayoutBinding((RelativeLayout) view, textView, textView2, button, editText);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static SendLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26476b;
    }

    @NonNull
    public static SendLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.send_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
