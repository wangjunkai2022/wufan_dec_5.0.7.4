package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.MyInnerScrollView;
import com.join.mgps.customview.NoScrollListView;
/* loaded from: classes3.dex */
public final class MgGameCommitLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final MyInnerScrollView f24427b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final NoScrollListView f24428c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final MyInnerScrollView f24429d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f24430e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final View f24431f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final RelativeLayout f24432g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f24433h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ProgressBar f24434i;

    private MgGameCommitLayoutBinding(@NonNull MyInnerScrollView myInnerScrollView, @NonNull NoScrollListView noScrollListView, @NonNull MyInnerScrollView myInnerScrollView2, @NonNull TextView textView, @NonNull View view, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView2, @NonNull ProgressBar progressBar) {
        this.f24427b = myInnerScrollView;
        this.f24428c = noScrollListView;
        this.f24429d = myInnerScrollView2;
        this.f24430e = textView;
        this.f24431f = view;
        this.f24432g = relativeLayout;
        this.f24433h = textView2;
        this.f24434i = progressBar;
    }

    @NonNull
    public static MgGameCommitLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.commitListView;
        NoScrollListView noScrollListView = (NoScrollListView) ViewBindings.findChildViewById(view, R.id.commitListView);
        if (noScrollListView != null) {
            MyInnerScrollView myInnerScrollView = (MyInnerScrollView) view;
            i4 = R.id.textMsg;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textMsg);
            if (textView != null) {
                i4 = R.id.transparentView;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.transparentView);
                if (findChildViewById != null) {
                    i4 = R.id.xlistview_footer_content;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.xlistview_footer_content);
                    if (relativeLayout != null) {
                        i4 = R.id.xlistview_footer_hint_textview;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.xlistview_footer_hint_textview);
                        if (textView2 != null) {
                            i4 = R.id.xlistview_footer_progressbar;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.xlistview_footer_progressbar);
                            if (progressBar != null) {
                                return new MgGameCommitLayoutBinding(myInnerScrollView, noScrollListView, myInnerScrollView, textView, findChildViewById, relativeLayout, textView2, progressBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MgGameCommitLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public MyInnerScrollView getRoot() {
        return this.f24427b;
    }

    @NonNull
    public static MgGameCommitLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mg_game_commit_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
