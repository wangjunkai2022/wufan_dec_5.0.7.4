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
public final class GameInformationCommentTopBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f20389b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final TextView f20390c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f20391d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f20392e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f20393f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f20394g;

    private GameInformationCommentTopBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f20389b = linearLayout;
        this.f20390c = textView;
        this.f20391d = textView2;
        this.f20392e = textView3;
        this.f20393f = textView4;
        this.f20394g = textView5;
    }

    @NonNull
    public static GameInformationCommentTopBinding bind(@NonNull View view) {
        int i4 = R.id.comment_number;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.comment_number);
        if (textView != null) {
            i4 = R.id.more;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.more);
            if (textView2 != null) {
                i4 = R.id.textView3;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView3);
                if (textView3 != null) {
                    i4 = R.id.textView9;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView9);
                    if (textView4 != null) {
                        i4 = R.id.xx;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.xx);
                        if (textView5 != null) {
                            return new GameInformationCommentTopBinding((LinearLayout) view, textView, textView2, textView3, textView4, textView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static GameInformationCommentTopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f20389b;
    }

    @NonNull
    public static GameInformationCommentTopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.game_information_comment_top, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
