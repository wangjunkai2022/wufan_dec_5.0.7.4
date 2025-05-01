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
public final class AndroidPermissDialogBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17362b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f17363c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f17364d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f17365e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f17366f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f17367g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f17368h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f17369i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final LinearLayout f17370j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f17371k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final LinearLayout f17372l;

    private AndroidPermissDialogBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4) {
        this.f17362b = linearLayout;
        this.f17363c = imageView;
        this.f17364d = button;
        this.f17365e = button2;
        this.f17366f = button3;
        this.f17367g = textView;
        this.f17368h = textView2;
        this.f17369i = imageView2;
        this.f17370j = linearLayout2;
        this.f17371k = linearLayout3;
        this.f17372l = linearLayout4;
    }

    @NonNull
    public static AndroidPermissDialogBinding bind(@NonNull View view) {
        int i4 = R.id.closed;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.closed);
        if (imageView != null) {
            i4 = R.id.dialog_button_close;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_close);
            if (button != null) {
                i4 = R.id.dialog_button_i_know;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_i_know);
                if (button2 != null) {
                    i4 = R.id.dialog_button_keep;
                    Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_keep);
                    if (button3 != null) {
                        i4 = R.id.dialog_content;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
                        if (textView != null) {
                            i4 = R.id.dialog_title;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_title);
                            if (textView2 != null) {
                                i4 = R.id.dialog_title_image;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.dialog_title_image);
                                if (imageView2 != null) {
                                    i4 = R.id.llBtn;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llBtn);
                                    if (linearLayout != null) {
                                        i4 = R.id.llBtnIKnow;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.llBtnIKnow);
                                        if (linearLayout2 != null) {
                                            i4 = R.id.ll_content;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_content);
                                            if (linearLayout3 != null) {
                                                return new AndroidPermissDialogBinding((LinearLayout) view, imageView, button, button2, button3, textView, textView2, imageView2, linearLayout, linearLayout2, linearLayout3);
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
    public static AndroidPermissDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17362b;
    }

    @NonNull
    public static AndroidPermissDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.android_permiss_dialog, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
