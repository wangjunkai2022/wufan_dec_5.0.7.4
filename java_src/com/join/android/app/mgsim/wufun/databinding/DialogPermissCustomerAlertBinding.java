package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogPermissCustomerAlertBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18947b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ScrollView f18948c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f18949d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f18950e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final WebView f18951f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18952g;

    private DialogPermissCustomerAlertBinding(@NonNull LinearLayout linearLayout, @NonNull ScrollView scrollView, @NonNull Button button, @NonNull Button button2, @NonNull WebView webView, @NonNull TextView textView) {
        this.f18947b = linearLayout;
        this.f18948c = scrollView;
        this.f18949d = button;
        this.f18950e = button2;
        this.f18951f = webView;
        this.f18952g = textView;
    }

    @NonNull
    public static DialogPermissCustomerAlertBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_app_update_sv;
        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.dialog_app_update_sv);
        if (scrollView != null) {
            i4 = R.id.dialog_button_cancel;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_cancel);
            if (button != null) {
                i4 = R.id.dialog_button_ok;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
                if (button2 != null) {
                    i4 = R.id.info;
                    WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.info);
                    if (webView != null) {
                        i4 = R.id.tip_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                        if (textView != null) {
                            return new DialogPermissCustomerAlertBinding((LinearLayout) view, scrollView, button, button2, webView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogPermissCustomerAlertBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18947b;
    }

    @NonNull
    public static DialogPermissCustomerAlertBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_permiss_customer_alert, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
