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
public final class MustPlayTitleLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f25177b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f25178c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25179d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25180e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f25181f;

    private MustPlayTitleLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f25177b = linearLayout;
        this.f25178c = linearLayout2;
        this.f25179d = textView;
        this.f25180e = textView2;
        this.f25181f = textView3;
    }

    @NonNull
    public static MustPlayTitleLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.section_follow;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.section_follow);
        if (linearLayout != null) {
            i4 = R.id.textView;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
            if (textView != null) {
                i4 = R.id.titleName;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.titleName);
                if (textView2 != null) {
                    i4 = R.id.titleline;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.titleline);
                    if (textView3 != null) {
                        return new MustPlayTitleLayoutBinding((LinearLayout) view, linearLayout, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MustPlayTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f25177b;
    }

    @NonNull
    public static MustPlayTitleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.must_play_title_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
