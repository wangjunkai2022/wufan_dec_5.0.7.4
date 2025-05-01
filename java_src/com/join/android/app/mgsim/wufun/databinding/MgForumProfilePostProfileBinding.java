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
public final class MgForumProfilePostProfileBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f24227b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24228c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f24229d;

    private MgForumProfilePostProfileBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f24227b = relativeLayout;
        this.f24228c = imageView;
        this.f24229d = textView;
    }

    @NonNull
    public static MgForumProfilePostProfileBinding bind(@NonNull View view) {
        int i4 = R.id.post_profile_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.post_profile_image);
        if (imageView != null) {
            i4 = R.id.post_profile_message;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.post_profile_message);
            if (textView != null) {
                return new MgForumProfilePostProfileBinding((RelativeLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumProfilePostProfileBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f24227b;
    }

    @NonNull
    public static MgForumProfilePostProfileBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_profile_post_profile, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
