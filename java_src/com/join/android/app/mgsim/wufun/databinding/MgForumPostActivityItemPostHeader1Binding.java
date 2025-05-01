package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MgForumPostActivityItemPostHeader1Binding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f24099b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f24100c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f24101d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24102e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f24103f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f24104g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f24105h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f24106i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f24107j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f24108k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f24109l;

    private MgForumPostActivityItemPostHeader1Binding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull TextView textView3) {
        this.f24099b = linearLayout;
        this.f24100c = imageView;
        this.f24101d = relativeLayout;
        this.f24102e = textView;
        this.f24103f = textView2;
        this.f24104g = linearLayout2;
        this.f24105h = linearLayout3;
        this.f24106i = imageView2;
        this.f24107j = imageView3;
        this.f24108k = imageView4;
        this.f24109l = textView3;
    }

    @NonNull
    public static MgForumPostActivityItemPostHeader1Binding bind(@NonNull View view) {
        int i4 = R.id.flagBestAnswer;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.flagBestAnswer);
        if (imageView != null) {
            i4 = R.id.forumExtFunc;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.forumExtFunc);
            if (relativeLayout != null) {
                i4 = R.id.forum_post_add_time;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.forum_post_add_time);
                if (textView != null) {
                    i4 = R.id.groupName;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.groupName);
                    if (textView2 != null) {
                        i4 = R.id.groupParent;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.groupParent);
                        if (linearLayout != null) {
                            i4 = R.id.layout_posts_top;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.layout_posts_top);
                            if (linearLayout2 != null) {
                                i4 = R.id.locIcon;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.locIcon);
                                if (imageView2 != null) {
                                    i4 = R.id.moreFunc;
                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.moreFunc);
                                    if (imageView3 != null) {
                                        i4 = R.id.replyFunc;
                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.replyFunc);
                                        if (imageView4 != null) {
                                            i4 = R.id.topMoneyTx;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.topMoneyTx);
                                            if (textView3 != null) {
                                                return new MgForumPostActivityItemPostHeader1Binding((LinearLayout) view, imageView, relativeLayout, textView, textView2, linearLayout, linearLayout2, imageView2, imageView3, imageView4, textView3);
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
    public static MgForumPostActivityItemPostHeader1Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f24099b;
    }

    @NonNull
    public static MgForumPostActivityItemPostHeader1Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_forum_post_activity_item_post_header1, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
