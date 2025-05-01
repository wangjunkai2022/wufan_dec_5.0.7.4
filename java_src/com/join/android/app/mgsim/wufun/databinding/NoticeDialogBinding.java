package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class NoticeDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25515b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f25516c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f25517d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25518e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f25519f;

    private NoticeDialogBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.f25515b = linearLayout;
        this.f25516c = button;
        this.f25517d = button2;
        this.f25518e = textView;
        this.f25519f = imageView;
    }

    @NonNull
    public static NoticeDialogBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_close;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_close);
        if (button != null) {
            i4 = R.id.dialog_button_keep;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_keep);
            if (button2 != null) {
                i4 = R.id.dialog_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
                if (textView != null) {
                    i4 = R.id.dialog_title_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.dialog_title_image);
                    if (imageView != null) {
                        return new NoticeDialogBinding((LinearLayout) view, button, button2, textView, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NoticeDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25515b;
    }

    @NonNull
    public static NoticeDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.notice_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
