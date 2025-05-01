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
public final class GameinformationWebtitleBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21133b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21134c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f21135d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f21136e;

    private GameinformationWebtitleBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f21133b = linearLayout;
        this.f21134c = textView;
        this.f21135d = textView2;
        this.f21136e = textView3;
    }

    @NonNull
    public static GameinformationWebtitleBinding bind(@NonNull View view) {
        int i4 = R.id.contentName;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.contentName);
        if (textView != null) {
            i4 = R.id.contentTime;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.contentTime);
            if (textView2 != null) {
                i4 = R.id.content_title;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.content_title);
                if (textView3 != null) {
                    return new GameinformationWebtitleBinding((LinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameinformationWebtitleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21133b;
    }

    @NonNull
    public static GameinformationWebtitleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gameinformation_webtitle, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
