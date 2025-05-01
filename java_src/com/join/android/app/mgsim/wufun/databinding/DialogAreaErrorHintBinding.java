package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogAreaErrorHintBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18544b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18545c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f18546d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f18547e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18548f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f18549g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18550h;

    private DialogAreaErrorHintBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull TextView textView2) {
        this.f18544b = relativeLayout;
        this.f18545c = button;
        this.f18546d = button2;
        this.f18547e = button3;
        this.f18548f = textView;
        this.f18549g = linearLayout;
        this.f18550h = textView2;
    }

    @NonNull
    public static DialogAreaErrorHintBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_cancle;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_cancle);
        if (button != null) {
            i4 = R.id.dialog_button_ok;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
            if (button2 != null) {
                i4 = R.id.dialog_button_sure;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_sure);
                if (button3 != null) {
                    i4 = R.id.dialog_content;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
                    if (textView != null) {
                        i4 = R.id.iv_close;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
                        if (linearLayout != null) {
                            i4 = R.id.tip_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                            if (textView2 != null) {
                                return new DialogAreaErrorHintBinding((RelativeLayout) view, button, button2, button3, textView, linearLayout, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogAreaErrorHintBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18544b;
    }

    @NonNull
    public static DialogAreaErrorHintBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_area_error_hint, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
