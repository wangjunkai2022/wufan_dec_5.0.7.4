package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumForumActivityTopItemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f23851b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f23852c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f23853d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f23854e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23855f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f23856g;

    private MgForumForumActivityTopItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull Button button2, @NonNull TextView textView, @NonNull ImageView imageView2) {
        this.f23851b = relativeLayout;
        this.f23852c = button;
        this.f23853d = imageView;
        this.f23854e = button2;
        this.f23855f = textView;
        this.f23856g = imageView2;
    }

    @NonNull
    public static MgForumForumActivityTopItemBinding bind(@NonNull View view) {
        int i4 = R.id.forum_post_best;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.forum_post_best);
        if (button != null) {
            i4 = R.id.forum_post_pic;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.forum_post_pic);
            if (imageView != null) {
                i4 = R.id.forum_post_stickie;
                Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.forum_post_stickie);
                if (button2 != null) {
                    i4 = R.id.forum_post_subject;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_subject);
                    if (textView != null) {
                        i4 = R.id.forum_post_video;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.forum_post_video);
                        if (imageView2 != null) {
                            return new MgForumForumActivityTopItemBinding((RelativeLayout) view, button, imageView, button2, textView, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumForumActivityTopItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f23851b;
    }

    @NonNull
    public static MgForumForumActivityTopItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_forum_activity_top_item, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
