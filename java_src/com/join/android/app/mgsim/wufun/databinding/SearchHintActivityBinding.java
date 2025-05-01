package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.customview.ForumLoadingView;
/* loaded from: classes3.dex */
public final class SearchHintActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26353b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ListView f26354c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f26355d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f26356e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final FlowLayout f26357f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f26358g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ForumLoadingView f26359h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final SearchRecommendLayoutBinding f26360i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final SearchBarLayoutBinding f26361j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final View f26362k;

    private SearchHintActivityBinding(@NonNull RelativeLayout relativeLayout, @NonNull ListView listView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull FlowLayout flowLayout, @NonNull View view, @NonNull ForumLoadingView forumLoadingView, @NonNull SearchRecommendLayoutBinding searchRecommendLayoutBinding, @NonNull SearchBarLayoutBinding searchBarLayoutBinding, @NonNull View view2) {
        this.f26353b = relativeLayout;
        this.f26354c = listView;
        this.f26355d = imageView;
        this.f26356e = linearLayout;
        this.f26357f = flowLayout;
        this.f26358g = view;
        this.f26359h = forumLoadingView;
        this.f26360i = searchRecommendLayoutBinding;
        this.f26361j = searchBarLayoutBinding;
        this.f26362k = view2;
    }

    @NonNull
    public static SearchHintActivityBinding bind(@NonNull View view) {
        int i4 = R.id.autoListView;
        ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.autoListView);
        if (listView != null) {
            i4 = R.id.clearHistoryx;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.clearHistoryx);
            if (imageView != null) {
                i4 = R.id.clearLayout;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.clearLayout);
                if (linearLayout != null) {
                    i4 = R.id.historyFlow;
                    FlowLayout flowLayout = (FlowLayout) ViewBindings.findChildViewById(view, R.id.historyFlow);
                    if (flowLayout != null) {
                        i4 = R.id.line;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                        if (findChildViewById != null) {
                            i4 = R.id.loadingView;
                            ForumLoadingView forumLoadingView = (ForumLoadingView) ViewBindings.findChildViewById(view, R.id.loadingView);
                            if (forumLoadingView != null) {
                                i4 = R.id.recommend;
                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.recommend);
                                if (findChildViewById2 != null) {
                                    SearchRecommendLayoutBinding bind = SearchRecommendLayoutBinding.bind(findChildViewById2);
                                    i4 = R.id.search_bar_layout;
                                    View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.search_bar_layout);
                                    if (findChildViewById3 != null) {
                                        SearchBarLayoutBinding bind2 = SearchBarLayoutBinding.bind(findChildViewById3);
                                        i4 = R.id.statubar;
                                        View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.statubar);
                                        if (findChildViewById4 != null) {
                                            return new SearchHintActivityBinding((RelativeLayout) view, listView, imageView, linearLayout, flowLayout, findChildViewById, forumLoadingView, bind, bind2, findChildViewById4);
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
    public static SearchHintActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26353b;
    }

    @NonNull
    public static SearchHintActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.search_hint_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
