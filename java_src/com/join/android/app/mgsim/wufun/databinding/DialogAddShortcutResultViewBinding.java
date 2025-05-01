package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DialogAddShortcutResultViewBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f18505b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f18506c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f18507d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f18508e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18509f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f18510g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f18511h;

    private DialogAddShortcutResultViewBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f18505b = relativeLayout;
        this.f18506c = imageView;
        this.f18507d = relativeLayout2;
        this.f18508e = imageView2;
        this.f18509f = textView;
        this.f18510g = textView2;
        this.f18511h = textView3;
    }

    @NonNull
    public static DialogAddShortcutResultViewBinding bind(@NonNull View view) {
        int i4 = R.id.iv1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv1);
        if (imageView != null) {
            i4 = R.id.rl1;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl1);
            if (relativeLayout != null) {
                i4 = R.id.shortcutCloseIv;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.shortcutCloseIv);
                if (imageView2 != null) {
                    i4 = R.id.shortcutCreateTv;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.shortcutCreateTv);
                    if (textView != null) {
                        i4 = R.id.tv1;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv1);
                        if (textView2 != null) {
                            i4 = R.id.tv2;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv2);
                            if (textView3 != null) {
                                return new DialogAddShortcutResultViewBinding((RelativeLayout) view, imageView, relativeLayout, imageView2, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogAddShortcutResultViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f18505b;
    }

    @NonNull
    public static DialogAddShortcutResultViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_add_shortcut_result_view, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
