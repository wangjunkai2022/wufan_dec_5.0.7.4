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
public final class MgForumProfileFavoritesHeaderBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24205b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final View f24206c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24207d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24208e;

    private MgForumProfileFavoritesHeaderBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f24205b = linearLayout;
        this.f24206c = view;
        this.f24207d = textView;
        this.f24208e = textView2;
    }

    @NonNull
    public static MgForumProfileFavoritesHeaderBinding bind(@NonNull View view) {
        int i4 = R.id.forum_post_divider;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.forum_post_divider);
        if (findChildViewById != null) {
            i4 = R.id.timestampTv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.timestampTv);
            if (textView != null) {
                i4 = R.id.typeTv;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.typeTv);
                if (textView2 != null) {
                    return new MgForumProfileFavoritesHeaderBinding((LinearLayout) view, findChildViewById, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumProfileFavoritesHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24205b;
    }

    @NonNull
    public static MgForumProfileFavoritesHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_profile_favorites_header, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
