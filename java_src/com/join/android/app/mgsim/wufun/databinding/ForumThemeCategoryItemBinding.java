package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ForumThemeCategoryItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19590b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19591c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19592d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19593e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19594f;

    private ForumThemeCategoryItemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f19590b = linearLayout;
        this.f19591c = textView;
        this.f19592d = textView2;
        this.f19593e = textView3;
        this.f19594f = textView4;
    }

    @NonNull
    public static ForumThemeCategoryItemBinding bind(@NonNull View view) {
        int i4 = R.id.tv1;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv1);
        if (textView != null) {
            i4 = R.id.tv2;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv2);
            if (textView2 != null) {
                i4 = R.id.tv3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv3);
                if (textView3 != null) {
                    i4 = R.id.tv4;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv4);
                    if (textView4 != null) {
                        return new ForumThemeCategoryItemBinding((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ForumThemeCategoryItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19590b;
    }

    @NonNull
    public static ForumThemeCategoryItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.forum_theme_category_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
