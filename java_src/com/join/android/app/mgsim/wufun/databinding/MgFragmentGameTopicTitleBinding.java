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
public final class MgFragmentGameTopicTitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24418b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24419c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24420d;

    private MgFragmentGameTopicTitleBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2) {
        this.f24418b = linearLayout;
        this.f24419c = textView;
        this.f24420d = linearLayout2;
    }

    @NonNull
    public static MgFragmentGameTopicTitleBinding bind(@NonNull View view) {
        int i4 = R.id.forum_post_subject;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_subject);
        if (textView != null) {
            i4 = R.id.subject_parent;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.subject_parent);
            if (linearLayout != null) {
                return new MgFragmentGameTopicTitleBinding((LinearLayout) view, textView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgFragmentGameTopicTitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24418b;
    }

    @NonNull
    public static MgFragmentGameTopicTitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_fragment_game_topic_title, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
