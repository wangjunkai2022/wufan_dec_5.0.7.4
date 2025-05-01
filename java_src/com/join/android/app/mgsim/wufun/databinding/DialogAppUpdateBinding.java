package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogAppUpdateBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18530b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18531c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f18532d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f18533e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f18534f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f18535g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ScrollView f18536h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final WebView f18537i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f18538j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Button f18539k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final SimpleDraweeView f18540l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final RelativeLayout f18541m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final RelativeLayout f18542n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final Button f18543o;

    private DialogAppUpdateBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView2, @NonNull ScrollView scrollView, @NonNull WebView webView, @NonNull TextView textView, @NonNull Button button2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull Button button3) {
        this.f18530b = relativeLayout;
        this.f18531c = button;
        this.f18532d = imageView;
        this.f18533e = linearLayout;
        this.f18534f = relativeLayout2;
        this.f18535g = imageView2;
        this.f18536h = scrollView;
        this.f18537i = webView;
        this.f18538j = textView;
        this.f18539k = button2;
        this.f18540l = simpleDraweeView;
        this.f18541m = relativeLayout3;
        this.f18542n = relativeLayout4;
        this.f18543o = button3;
    }

    @NonNull
    public static DialogAppUpdateBinding bind(@NonNull View view) {
        int i4 = R.id.cancel;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.cancel);
        if (button != null) {
            i4 = R.id.dialog_app_update_bottom_img;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.dialog_app_update_bottom_img);
            if (imageView != null) {
                i4 = R.id.dialog_app_update_bottom_ll;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.dialog_app_update_bottom_ll);
                if (linearLayout != null) {
                    i4 = R.id.dialog_app_update_bottom_rl;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.dialog_app_update_bottom_rl);
                    if (relativeLayout != null) {
                        i4 = R.id.dialog_app_update_header_img;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.dialog_app_update_header_img);
                        if (imageView2 != null) {
                            i4 = R.id.dialog_app_update_sv;
                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.dialog_app_update_sv);
                            if (scrollView != null) {
                                i4 = R.id.info;
                                WebView webView = (WebView) ViewBindings.findChildViewById(view, R.id.info);
                                if (webView != null) {
                                    i4 = R.id.installNotice;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.installNotice);
                                    if (textView != null) {
                                        i4 = R.id.newClosed;
                                        Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.newClosed);
                                        if (button2 != null) {
                                            i4 = R.id.newUpdateImage;
                                            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.newUpdateImage);
                                            if (simpleDraweeView != null) {
                                                i4 = R.id.newVersion;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.newVersion);
                                                if (relativeLayout2 != null) {
                                                    i4 = R.id.oldVersion;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.oldVersion);
                                                    if (relativeLayout3 != null) {
                                                        i4 = R.id.updateNow;
                                                        Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.updateNow);
                                                        if (button3 != null) {
                                                            return new DialogAppUpdateBinding((RelativeLayout) view, button, imageView, linearLayout, relativeLayout, imageView2, scrollView, webView, textView, button2, simpleDraweeView, relativeLayout2, relativeLayout3, button3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogAppUpdateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18530b;
    }

    @NonNull
    public static DialogAppUpdateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_app_update, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
