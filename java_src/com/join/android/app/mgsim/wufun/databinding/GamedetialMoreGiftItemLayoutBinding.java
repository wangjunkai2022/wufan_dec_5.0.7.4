package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class GamedetialMoreGiftItemLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f21070b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f21071c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f21072d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f21073e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f21074f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f21075g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f21076h;

    private GamedetialMoreGiftItemLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull Button button, @NonNull View view, @NonNull TextView textView2, @NonNull ProgressBar progressBar, @NonNull TextView textView3) {
        this.f21070b = linearLayout;
        this.f21071c = textView;
        this.f21072d = button;
        this.f21073e = view;
        this.f21074f = textView2;
        this.f21075g = progressBar;
        this.f21076h = textView3;
    }

    @NonNull
    public static GamedetialMoreGiftItemLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.content);
        if (textView != null) {
            i4 = R.id.getGift;
            Button button = (Button) ViewBindings.findChildViewById(view, R.id.getGift);
            if (button != null) {
                i4 = R.id.line_h;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.line_h);
                if (findChildViewById != null) {
                    i4 = R.id.percent;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.percent);
                    if (textView2 != null) {
                        i4 = R.id.progress;
                        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, R.id.progress);
                        if (progressBar != null) {
                            i4 = R.id.title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                            if (textView3 != null) {
                                return new GamedetialMoreGiftItemLayoutBinding((LinearLayout) view, textView, button, findChildViewById, textView2, progressBar, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetialMoreGiftItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f21070b;
    }

    @NonNull
    public static GamedetialMoreGiftItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_more_gift_item_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
