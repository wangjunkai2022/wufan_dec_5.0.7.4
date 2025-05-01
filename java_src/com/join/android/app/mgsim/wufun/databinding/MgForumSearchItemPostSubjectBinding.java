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
public final class MgForumSearchItemPostSubjectBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24279b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f24280c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f24281d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24282e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f24283f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f24284g;

    private MgForumSearchItemPostSubjectBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull View view, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3) {
        this.f24279b = linearLayout;
        this.f24280c = button;
        this.f24281d = view;
        this.f24282e = textView;
        this.f24283f = linearLayout2;
        this.f24284g = linearLayout3;
    }

    @NonNull
    public static MgForumSearchItemPostSubjectBinding bind(@NonNull View view) {
        int i4 = R.id.forum_post_best;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.forum_post_best);
        if (button != null) {
            i4 = R.id.forum_post_divider;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.forum_post_divider);
            if (findChildViewById != null) {
                i4 = R.id.forum_post_subject;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_subject);
                if (textView != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    i4 = R.id.subject_parent;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.subject_parent);
                    if (linearLayout2 != null) {
                        return new MgForumSearchItemPostSubjectBinding(linearLayout, button, findChildViewById, textView, linearLayout, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumSearchItemPostSubjectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24279b;
    }

    @NonNull
    public static MgForumSearchItemPostSubjectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_search_item_post_subject, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
