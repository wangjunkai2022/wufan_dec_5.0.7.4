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
public final class MgForumPostActivityItemPostFooterBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24051b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f24052c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f24053d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24054e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24055f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f24056g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f24057h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f24058i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f24059j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f24060k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final View f24061l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f24062m;

    private MgForumPostActivityItemPostFooterBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView4, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull View view, @NonNull TextView textView5) {
        this.f24051b = linearLayout;
        this.f24052c = textView;
        this.f24053d = linearLayout2;
        this.f24054e = textView2;
        this.f24055f = textView3;
        this.f24056g = imageView;
        this.f24057h = linearLayout3;
        this.f24058i = textView4;
        this.f24059j = imageView2;
        this.f24060k = imageView3;
        this.f24061l = view;
        this.f24062m = textView5;
    }

    @NonNull
    public static MgForumPostActivityItemPostFooterBinding bind(@NonNull View view) {
        int i4 = R.id.forum_name;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_name);
        if (textView != null) {
            i4 = R.id.forum_name_parent;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_name_parent);
            if (linearLayout != null) {
                i4 = R.id.forum_post_commit;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_commit);
                if (textView2 != null) {
                    i4 = R.id.forum_post_praise;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_praise);
                    if (textView3 != null) {
                        i4 = R.id.forum_post_praise_icon;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.forum_post_praise_icon);
                        if (imageView != null) {
                            i4 = R.id.forum_post_praise_parent;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.forum_post_praise_parent);
                            if (linearLayout2 != null) {
                                i4 = R.id.forum_post_view;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_view);
                                if (textView4 != null) {
                                    i4 = R.id.imageView10;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView10);
                                    if (imageView2 != null) {
                                        i4 = R.id.imageView9;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.imageView9);
                                        if (imageView3 != null) {
                                            i4 = R.id.post_footer_divider;
                                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.post_footer_divider);
                                            if (findChildViewById != null) {
                                                i4 = R.id.textView19;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView19);
                                                if (textView5 != null) {
                                                    return new MgForumPostActivityItemPostFooterBinding((LinearLayout) view, textView, linearLayout, textView2, textView3, imageView, linearLayout2, textView4, imageView2, imageView3, findChildViewById, textView5);
                                                }
                                            }
                                        }
                                    }
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
    public static MgForumPostActivityItemPostFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24051b;
    }

    @NonNull
    public static MgForumPostActivityItemPostFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_post_footer, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
