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
public final class MgForumPostActivityItemPostSubjectBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24146b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f24147c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24148d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f24149e;

    private MgForumPostActivityItemPostSubjectBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f24146b = linearLayout;
        this.f24147c = button;
        this.f24148d = textView;
        this.f24149e = linearLayout2;
    }

    @NonNull
    public static MgForumPostActivityItemPostSubjectBinding bind(@NonNull View view) {
        int i4 = R.id.forum_post_best;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.forum_post_best);
        if (button != null) {
            i4 = R.id.forum_post_subject;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_subject);
            if (textView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new MgForumPostActivityItemPostSubjectBinding(linearLayout, button, textView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumPostActivityItemPostSubjectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24146b;
    }

    @NonNull
    public static MgForumPostActivityItemPostSubjectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_post_subject, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
