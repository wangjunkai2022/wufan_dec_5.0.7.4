package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DownloadChoiceUrlLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f19160b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f19161c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19162d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f19163e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f19164f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f19165g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19166h;

    private DownloadChoiceUrlLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5) {
        this.f19160b = relativeLayout;
        this.f19161c = linearLayout;
        this.f19162d = textView;
        this.f19163e = textView2;
        this.f19164f = textView3;
        this.f19165g = textView4;
        this.f19166h = textView5;
    }

    @NonNull
    public static DownloadChoiceUrlLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.allpath;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.allpath);
        if (linearLayout != null) {
            i4 = R.id.cancletext;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.cancletext);
            if (textView != null) {
                i4 = R.id.ok;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.ok);
                if (textView2 != null) {
                    i4 = R.id.textView5;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.textView5);
                    if (textView3 != null) {
                        i4 = R.id.textView6;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.textView6);
                        if (textView4 != null) {
                            i4 = R.id.titleText;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.titleText);
                            if (textView5 != null) {
                                return new DownloadChoiceUrlLayoutBinding((RelativeLayout) view, linearLayout, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static DownloadChoiceUrlLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f19160b;
    }

    @NonNull
    public static DownloadChoiceUrlLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.download_choice_url_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
