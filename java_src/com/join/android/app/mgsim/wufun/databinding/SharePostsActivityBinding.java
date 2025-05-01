package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import it.sephiroth.android.library.widget.HListView;
/* loaded from: classes3.dex */
public final class SharePostsActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26525b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f26526c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26527d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26528e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final GridView f26529f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26530g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26531h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26532i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final EditText f26533j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final HListView f26534k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final EditText f26535l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final MgForumTitleLayoutBinding f26536m;

    private SharePostsActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull GridView gridView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull EditText editText, @NonNull HListView hListView, @NonNull EditText editText2, @NonNull MgForumTitleLayoutBinding mgForumTitleLayoutBinding) {
        this.f26525b = relativeLayout;
        this.f26526c = linearLayout;
        this.f26527d = textView;
        this.f26528e = linearLayout2;
        this.f26529f = gridView;
        this.f26530g = textView2;
        this.f26531h = textView3;
        this.f26532i = textView4;
        this.f26533j = editText;
        this.f26534k = hListView;
        this.f26535l = editText2;
        this.f26536m = mgForumTitleLayoutBinding;
    }

    @NonNull
    public static SharePostsActivityBinding bind(@NonNull View view) {
        int i4 = R.id.editMainContainer;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.editMainContainer);
        if (linearLayout != null) {
            i4 = R.id.footer_tip;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.footer_tip);
            if (textView != null) {
                i4 = R.id.helpContainer;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.helpContainer);
                if (linearLayout2 != null) {
                    i4 = R.id.helpGrid;
                    GridView gridView = (GridView) ViewBindings.findChildViewById(view, R.id.helpGrid);
                    if (gridView != null) {
                        i4 = R.id.helpTipV;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.helpTipV);
                        if (textView2 != null) {
                            i4 = R.id.helpTitle;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.helpTitle);
                            if (textView3 != null) {
                                i4 = R.id.myRemainHelpMoney;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.myRemainHelpMoney);
                                if (textView4 != null) {
                                    i4 = R.id.posts_content;
                                    EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.posts_content);
                                    if (editText != null) {
                                        i4 = R.id.posts_pic_hlist;
                                        HListView hListView = (HListView) ViewBindings.findChildViewById(view, R.id.posts_pic_hlist);
                                        if (hListView != null) {
                                            i4 = R.id.posts_title;
                                            EditText editText2 = (EditText) ViewBindings.findChildViewById(view, R.id.posts_title);
                                            if (editText2 != null) {
                                                i4 = R.id.title;
                                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.title);
                                                if (findChildViewById != null) {
                                                    return new SharePostsActivityBinding((RelativeLayout) view, linearLayout, textView, linearLayout2, gridView, textView2, textView3, textView4, editText, hListView, editText2, MgForumTitleLayoutBinding.bind(findChildViewById));
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
    public static SharePostsActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26525b;
    }

    @NonNull
    public static SharePostsActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.share_posts_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
