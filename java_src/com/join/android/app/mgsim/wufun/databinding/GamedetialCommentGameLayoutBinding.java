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
public final class GamedetialCommentGameLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20873b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f20874c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final View f20875d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final View f20876e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f20877f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f20878g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f20879h;

    private GamedetialCommentGameLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull View view, @NonNull View view2, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView) {
        this.f20873b = linearLayout;
        this.f20874c = linearLayout2;
        this.f20875d = view;
        this.f20876e = view2;
        this.f20877f = imageView;
        this.f20878g = linearLayout3;
        this.f20879h = textView;
    }

    @NonNull
    public static GamedetialCommentGameLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.goCommit;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.goCommit);
        if (linearLayout != null) {
            i4 = R.id.layoutTop;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.layoutTop);
            if (findChildViewById != null) {
                i4 = R.id.layoutTop2;
                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.layoutTop2);
                if (findChildViewById2 != null) {
                    i4 = R.id.progressBar2;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.progressBar2);
                    if (imageView != null) {
                        i4 = R.id.starlayout;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.starlayout);
                        if (linearLayout2 != null) {
                            i4 = R.id.textMessage;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textMessage);
                            if (textView != null) {
                                return new GamedetialCommentGameLayoutBinding((LinearLayout) view, linearLayout, findChildViewById, findChildViewById2, imageView, linearLayout2, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GamedetialCommentGameLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20873b;
    }

    @NonNull
    public static GamedetialCommentGameLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.gamedetial_comment_game_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
