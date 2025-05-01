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
public final class DialogForumBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f18753b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f18754c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f18755d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18756e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f18757f;

    private DialogForumBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f18753b = linearLayout;
        this.f18754c = button;
        this.f18755d = button2;
        this.f18756e = textView;
        this.f18757f = textView2;
    }

    @NonNull
    public static DialogForumBinding bind(@NonNull View view) {
        int i4 = R.id.negative_btn;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.negative_btn);
        if (button != null) {
            i4 = R.id.positive_btn;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.positive_btn);
            if (button2 != null) {
                i4 = R.id.tip_content;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tip_content);
                if (textView != null) {
                    i4 = R.id.tip_title;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tip_title);
                    if (textView2 != null) {
                        return new DialogForumBinding((LinearLayout) view, button, button2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DialogForumBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f18753b;
    }

    @NonNull
    public static DialogForumBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.dialog_forum, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
