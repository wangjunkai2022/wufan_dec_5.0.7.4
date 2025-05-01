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
public final class MgFragmentGameTopicFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24405b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24406c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24407d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24408e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24409f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f24410g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f24411h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f24412i;

    private MgFragmentGameTopicFooterBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view) {
        this.f24405b = linearLayout;
        this.f24406c = textView;
        this.f24407d = linearLayout2;
        this.f24408e = textView2;
        this.f24409f = textView3;
        this.f24410g = imageView;
        this.f24411h = imageView2;
        this.f24412i = view;
    }

    @NonNull
    public static MgFragmentGameTopicFooterBinding bind(@NonNull View view) {
        int i4 = R.id.forum_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_name);
        if (textView != null) {
            i4 = R.id.forum_name_parent;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_name_parent);
            if (linearLayout != null) {
                i4 = R.id.forum_post_commit;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_commit);
                if (textView2 != null) {
                    i4 = R.id.forum_post_view;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_view);
                    if (textView3 != null) {
                        i4 = R.id.imageView10;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView10);
                        if (imageView != null) {
                            i4 = R.id.imageView9;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView9);
                            if (imageView2 != null) {
                                i4 = R.id.post_footer_divider;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.post_footer_divider);
                                if (findChildViewById != null) {
                                    return new MgFragmentGameTopicFooterBinding((LinearLayout) view, textView, linearLayout, textView2, textView3, imageView, imageView2, findChildViewById);
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
    public static MgFragmentGameTopicFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24405b;
    }

    @NonNull
    public static MgFragmentGameTopicFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_fragment_game_topic_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
