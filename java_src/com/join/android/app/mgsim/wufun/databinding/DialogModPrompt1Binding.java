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
public final class DialogModPrompt1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18885b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18886c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f18887d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18888e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18889f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18890g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18891h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f18892i;

    private DialogModPrompt1Binding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f18885b = linearLayout;
        this.f18886c = imageView;
        this.f18887d = linearLayout2;
        this.f18888e = textView;
        this.f18889f = textView2;
        this.f18890g = textView3;
        this.f18891h = textView4;
        this.f18892i = textView5;
    }

    @NonNull
    public static DialogModPrompt1Binding bind(@NonNull View view) {
        int i4 = R.id.ivClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.ivClose);
        if (imageView != null) {
            i4 = R.id.ll_mod_download;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_mod_download);
            if (linearLayout != null) {
                i4 = R.id.tv_desc;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_desc);
                if (textView != null) {
                    i4 = R.id.tv_mod_opt_left;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mod_opt_left);
                    if (textView2 != null) {
                        i4 = R.id.tv_mod_opt_right;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mod_opt_right);
                        if (textView3 != null) {
                            i4 = R.id.tv_mod_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_mod_title);
                            if (textView4 != null) {
                                i4 = R.id.tv_title;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_title);
                                if (textView5 != null) {
                                    return new DialogModPrompt1Binding((LinearLayout) view, imageView, linearLayout, textView, textView2, textView3, textView4, textView5);
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
    public static DialogModPrompt1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18885b;
    }

    @NonNull
    public static DialogModPrompt1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_mod_prompt1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
