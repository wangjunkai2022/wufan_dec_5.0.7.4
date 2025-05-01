package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class ActivityBuildGameFromBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f15715b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final EditText f15716c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final RelativeLayout f15717d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final RelativeLayout f15718e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f15719f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final View f15720g;

    private ActivityBuildGameFromBinding(@NonNull RelativeLayout relativeLayout, @NonNull EditText editText, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView, @NonNull View view) {
        this.f15715b = relativeLayout;
        this.f15716c = editText;
        this.f15717d = relativeLayout2;
        this.f15718e = relativeLayout3;
        this.f15719f = textView;
        this.f15720g = view;
    }

    @NonNull
    public static ActivityBuildGameFromBinding bind(@NonNull View view) {
        int i4 = R.id.ed_game;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.ed_game);
        if (editText != null) {
            i4 = R.id.iv_back;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.iv_back);
            if (relativeLayout != null) {
                i4 = R.id.rl_title;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.rl_title);
                if (relativeLayout2 != null) {
                    i4 = R.id.tv_finish;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_finish);
                    if (textView != null) {
                        i4 = R.id.view_line;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.view_line);
                        if (findChildViewById != null) {
                            return new ActivityBuildGameFromBinding((RelativeLayout) view, editText, relativeLayout, relativeLayout2, textView, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ActivityBuildGameFromBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f15715b;
    }

    @NonNull
    public static ActivityBuildGameFromBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_build_game_from, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
