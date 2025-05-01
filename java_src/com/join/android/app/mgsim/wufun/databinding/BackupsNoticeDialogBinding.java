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
public final class BackupsNoticeDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17485b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f17486c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f17487d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f17488e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f17489f;

    private BackupsNoticeDialogBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.f17485b = linearLayout;
        this.f17486c = button;
        this.f17487d = textView;
        this.f17488e = imageView;
        this.f17489f = textView2;
    }

    @NonNull
    public static BackupsNoticeDialogBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_ok;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
        if (button != null) {
            i4 = R.id.dialog_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
            if (textView != null) {
                i4 = R.id.imageView;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView);
                if (imageView != null) {
                    i4 = R.id.tip_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                    if (textView2 != null) {
                        return new BackupsNoticeDialogBinding((LinearLayout) view, button, textView, imageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static BackupsNoticeDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17485b;
    }

    @NonNull
    public static BackupsNoticeDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.backups_notice_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
