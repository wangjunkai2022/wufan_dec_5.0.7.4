package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.KeyboardListenLayout;
import com.join.mgps.customview.XListView2;
import com.join.mgps.ptr.PtrClassicFrameLayout;
/* loaded from: classes3.dex */
public final class InformationCommentActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final KeyboardListenLayout f21548b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f21549c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f21550d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final PtrClassicFrameLayout f21551e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final KeyboardListenLayout f21552f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final XListView2 f21553g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21554h;

    private InformationCommentActivityBinding(@NonNull KeyboardListenLayout keyboardListenLayout, @NonNull FrameLayout frameLayout, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding, @NonNull PtrClassicFrameLayout ptrClassicFrameLayout, @NonNull KeyboardListenLayout keyboardListenLayout2, @NonNull XListView2 xListView2, @NonNull TextView textView) {
        this.f21548b = keyboardListenLayout;
        this.f21549c = frameLayout;
        this.f21550d = mgForumTitleLayoutBinding;
        this.f21551e = ptrClassicFrameLayout;
        this.f21552f = keyboardListenLayout2;
        this.f21553g = xListView2;
        this.f21554h = textView;
    }

    @NonNull
    public static InformationCommentActivityBinding bind(@NonNull View view) {
        int i4 = R.id.layout_forum_posts_main;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.layout_forum_posts_main);
        if (frameLayout != null) {
            i4 = R.id.layout_forum_posts_title;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.layout_forum_posts_title);
            if (findChildViewById != null) {
                MgForumTitleLayoutBinding bind = MgForumTitleLayoutBinding.bind(findChildViewById);
                i4 = R.id.mPtrFrame;
                PtrClassicFrameLayout ptrClassicFrameLayout = (PtrClassicFrameLayout) ViewBindings.findChildViewById(view, R.id.mPtrFrame);
                if (ptrClassicFrameLayout != null) {
                    KeyboardListenLayout keyboardListenLayout = (KeyboardListenLayout) view;
                    i4 = R.id.mg_forum_post_comment_list;
                    XListView2 xListView2 = (XListView2) ViewBindings.findChildViewById(view, R.id.mg_forum_post_comment_list);
                    if (xListView2 != null) {
                        i4 = R.id.noMessage;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.noMessage);
                        if (textView != null) {
                            return new InformationCommentActivityBinding(keyboardListenLayout, frameLayout, bind, ptrClassicFrameLayout, keyboardListenLayout, xListView2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static InformationCommentActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public KeyboardListenLayout getRoot() {
        return this.f21548b;
    }

    @NonNull
    public static InformationCommentActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.information_comment_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
