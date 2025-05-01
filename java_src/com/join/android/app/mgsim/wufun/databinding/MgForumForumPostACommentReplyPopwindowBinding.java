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
public final class MgForumForumPostACommentReplyPopwindowBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23881b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f23882c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f23883d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f23884e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23885f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23886g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final View f23887h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final View f23888i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final View f23889j;

    private MgForumForumPostACommentReplyPopwindowBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f23881b = linearLayout;
        this.f23882c = linearLayout2;
        this.f23883d = textView;
        this.f23884e = textView2;
        this.f23885f = textView3;
        this.f23886g = textView4;
        this.f23887h = view;
        this.f23888i = view2;
        this.f23889j = view3;
    }

    @NonNull
    public static MgForumForumPostACommentReplyPopwindowBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i4 = R.id.delete;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.delete);
        if (textView != null) {
            i4 = R.id.reply;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.reply);
            if (textView2 != null) {
                i4 = R.id.report;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.report);
                if (textView3 != null) {
                    i4 = R.id.resolve;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.resolve);
                    if (textView4 != null) {
                        i4 = R.id.v_delete;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.v_delete);
                        if (findChildViewById != null) {
                            i4 = R.id.v_report;
                            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.v_report);
                            if (findChildViewById2 != null) {
                                i4 = R.id.v_resolve;
                                View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.v_resolve);
                                if (findChildViewById3 != null) {
                                    return new MgForumForumPostACommentReplyPopwindowBinding(linearLayout, linearLayout, textView, textView2, textView3, textView4, findChildViewById, findChildViewById2, findChildViewById3);
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
    public static MgForumForumPostACommentReplyPopwindowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23881b;
    }

    @NonNull
    public static MgForumForumPostACommentReplyPopwindowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_forum_post_a_comment_reply_popwindow, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
