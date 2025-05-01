package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumProfileFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24209b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f24210c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f24211d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24212e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final RelativeLayout f24213f;

    private MgForumProfileFooterBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull SimpleDraweeView simpleDraweeView, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout) {
        this.f24209b = linearLayout;
        this.f24210c = linearLayout2;
        this.f24211d = simpleDraweeView;
        this.f24212e = textView;
        this.f24213f = relativeLayout;
    }

    @NonNull
    public static MgForumProfileFooterBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.post_profile_image;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.post_profile_image);
        if (simpleDraweeView != null) {
            i4 = R.id.post_profile_message;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.post_profile_message);
            if (textView != null) {
                i4 = R.id.post_profile_post_profile;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.post_profile_post_profile);
                if (relativeLayout != null) {
                    return new MgForumProfileFooterBinding(linearLayout, linearLayout, simpleDraweeView, textView, relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumProfileFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24209b;
    }

    @NonNull
    public static MgForumProfileFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_profile_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
