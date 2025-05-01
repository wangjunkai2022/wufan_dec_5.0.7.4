package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumForumASendPostPopwindowBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23823b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23824c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f23825d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f23826e;

    private MgForumForumASendPostPopwindowBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4) {
        this.f23823b = linearLayout;
        this.f23824c = linearLayout2;
        this.f23825d = linearLayout3;
        this.f23826e = linearLayout4;
    }

    @NonNull
    public static MgForumForumASendPostPopwindowBinding bind(@NonNull View view) {
        int i4 = R.id.cancel;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.cancel);
        if (linearLayout != null) {
            i4 = R.id.goSendHelp;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.goSendHelp);
            if (linearLayout2 != null) {
                i4 = R.id.goSendPost;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.goSendPost);
                if (linearLayout3 != null) {
                    return new MgForumForumASendPostPopwindowBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgForumForumASendPostPopwindowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23823b;
    }

    @NonNull
    public static MgForumForumASendPostPopwindowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_forum_a_send_post_popwindow, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
