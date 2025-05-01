package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class FcNoticeDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19420b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f19421c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f19422d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19423e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19424f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19425g;

    private FcNoticeDialogBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f19420b = linearLayout;
        this.f19421c = button;
        this.f19422d = button2;
        this.f19423e = textView;
        this.f19424f = textView2;
        this.f19425g = textView3;
    }

    @NonNull
    public static FcNoticeDialogBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_cancle;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_cancle);
        if (button != null) {
            i4 = R.id.dialog_button_ok;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
            if (button2 != null) {
                i4 = R.id.dialog_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
                if (textView != null) {
                    i4 = R.id.textView;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                    if (textView2 != null) {
                        i4 = R.id.tip_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                        if (textView3 != null) {
                            return new FcNoticeDialogBinding((LinearLayout) view, button, button2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static FcNoticeDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19420b;
    }

    @NonNull
    public static FcNoticeDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.fc_notice_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
