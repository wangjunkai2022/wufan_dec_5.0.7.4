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
public final class NonticeTopAnimDialogLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f25507b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f25508c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25509d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f25510e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f25511f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f25512g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f25513h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f25514i;

    private NonticeTopAnimDialogLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout2, @NonNull LinearLayout linearLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f25507b = relativeLayout;
        this.f25508c = button;
        this.f25509d = textView;
        this.f25510e = relativeLayout2;
        this.f25511f = linearLayout;
        this.f25512g = textView2;
        this.f25513h = textView3;
        this.f25514i = textView4;
    }

    @NonNull
    public static NonticeTopAnimDialogLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.dialog_button_ok;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.dialog_button_ok);
        if (button != null) {
            i4 = R.id.dialog_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.dialog_content);
            if (textView != null) {
                i4 = R.id.dialogLayout;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.dialogLayout);
                if (relativeLayout != null) {
                    i4 = R.id.iv_close;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.iv_close);
                    if (linearLayout != null) {
                        i4 = R.id.nonticeText;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.nonticeText);
                        if (textView2 != null) {
                            i4 = R.id.sub_content;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.sub_content);
                            if (textView3 != null) {
                                i4 = R.id.tv_position;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_position);
                                if (textView4 != null) {
                                    return new NonticeTopAnimDialogLayoutBinding((RelativeLayout) view, button, textView, relativeLayout, linearLayout, textView2, textView3, textView4);
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
    public static NonticeTopAnimDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f25507b;
    }

    @NonNull
    public static NonticeTopAnimDialogLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.nontice_top_anim_dialog_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
