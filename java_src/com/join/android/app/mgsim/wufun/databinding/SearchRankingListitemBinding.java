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
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class SearchRankingListitemBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26420b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f26421c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final SimpleDraweeView f26422d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f26423e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f26424f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26425g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f26426h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f26427i;

    private SearchRankingListitemBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull View view, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f26420b = linearLayout;
        this.f26421c = textView;
        this.f26422d = simpleDraweeView;
        this.f26423e = view;
        this.f26424f = linearLayout2;
        this.f26425g = textView2;
        this.f26426h = textView3;
        this.f26427i = textView4;
    }

    @NonNull
    public static SearchRankingListitemBinding bind(@NonNull View view) {
        int i4 = R.id.appName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.appName);
        if (textView != null) {
            i4 = R.id.icon;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.icon);
            if (simpleDraweeView != null) {
                i4 = R.id.line;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line);
                if (findChildViewById != null) {
                    i4 = R.id.main;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.main);
                    if (linearLayout != null) {
                        i4 = R.id.rankingNumber;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.rankingNumber);
                        if (textView2 != null) {
                            i4 = R.id.rankingNumberBack;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.rankingNumberBack);
                            if (textView3 != null) {
                                i4 = R.id.tag;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tag);
                                if (textView4 != null) {
                                    return new SearchRankingListitemBinding((LinearLayout) view, textView, simpleDraweeView, findChildViewById, linearLayout, textView2, textView3, textView4);
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
    public static SearchRankingListitemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26420b;
    }

    @NonNull
    public static SearchRankingListitemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.search_ranking_listitem, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
