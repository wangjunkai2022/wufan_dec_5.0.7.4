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
public final class ForumThemeListHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19597b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19598c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f19599d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f19600e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19601f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f19602g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19603h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f19604i;

    private ForumThemeListHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull View view2, @NonNull TextView textView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull View view3) {
        this.f19597b = linearLayout;
        this.f19598c = linearLayout2;
        this.f19599d = view;
        this.f19600e = view2;
        this.f19601f = textView;
        this.f19602g = linearLayout3;
        this.f19603h = textView2;
        this.f19604i = view3;
    }

    @NonNull
    public static ForumThemeListHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.category_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.category_layout);
        if (linearLayout != null) {
            i4 = R.id.category_rank_arrow;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.category_rank_arrow);
            if (findChildViewById != null) {
                i4 = R.id.category_rank_image_category;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.category_rank_image_category);
                if (findChildViewById2 != null) {
                    i4 = R.id.category_rank_text_category;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.category_rank_text_category);
                    if (textView != null) {
                        i4 = R.id.search_layout;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.search_layout);
                        if (linearLayout2 != null) {
                            i4 = R.id.search_tv;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.search_tv);
                            if (textView2 != null) {
                                i4 = R.id.search_view;
                                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.search_view);
                                if (findChildViewById3 != null) {
                                    return new ForumThemeListHeaderBinding((LinearLayout) view, linearLayout, findChildViewById, findChildViewById2, textView, linearLayout2, textView2, findChildViewById3);
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
    public static ForumThemeListHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19597b;
    }

    @NonNull
    public static ForumThemeListHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.forum_theme_list_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
