package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class NotificationJpushViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25551b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f25552c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25553d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f25554e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25555f;

    private NotificationJpushViewBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2) {
        this.f25551b = linearLayout;
        this.f25552c = imageView;
        this.f25553d = textView;
        this.f25554e = linearLayout2;
        this.f25555f = textView2;
    }

    @NonNull
    public static NotificationJpushViewBinding bind(@NonNull View view) {
        int i4 = R.id.notifyIv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.notifyIv);
        if (imageView != null) {
            i4 = R.id.notifyProgressTv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.notifyProgressTv);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i4 = R.id.notifyTitleTv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.notifyTitleTv);
                if (textView2 != null) {
                    return new NotificationJpushViewBinding(linearLayout, imageView, textView, linearLayout, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static NotificationJpushViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25551b;
    }

    @NonNull
    public static NotificationJpushViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.notification_jpush_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
