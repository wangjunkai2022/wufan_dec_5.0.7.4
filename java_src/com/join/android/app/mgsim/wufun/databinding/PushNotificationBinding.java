package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class PushNotificationBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final RelativeLayout f26162b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26163c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final TextView f26164d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26165e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f26166f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f26167g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f26168h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f26169i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final RelativeLayout f26170j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final ImageView f26171k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f26172l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f26173m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f26174n;
    @NonNull

    /* renamed from: o  reason: collision with root package name */
    public final RelativeLayout f26175o;
    @NonNull

    /* renamed from: p  reason: collision with root package name */
    public final TextView f26176p;
    @NonNull

    /* renamed from: q  reason: collision with root package name */
    public final TextView f26177q;
    @NonNull

    /* renamed from: r  reason: collision with root package name */
    public final RelativeLayout f26178r;
    @NonNull

    /* renamed from: s  reason: collision with root package name */
    public final FrameLayout f26179s;

    private PushNotificationBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView3, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull RelativeLayout relativeLayout3, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull RelativeLayout relativeLayout4, @NonNull FrameLayout frameLayout) {
        this.f26162b = relativeLayout;
        this.f26163c = imageView;
        this.f26164d = textView;
        this.f26165e = textView2;
        this.f26166f = textView3;
        this.f26167g = textView4;
        this.f26168h = linearLayout;
        this.f26169i = imageView2;
        this.f26170j = relativeLayout2;
        this.f26171k = imageView3;
        this.f26172l = textView5;
        this.f26173m = textView6;
        this.f26174n = textView7;
        this.f26175o = relativeLayout3;
        this.f26176p = textView8;
        this.f26177q = textView9;
        this.f26178r = relativeLayout4;
        this.f26179s = frameLayout;
    }

    @NonNull
    public static PushNotificationBinding bind(@NonNull View view) {
        int i4 = R.id.push_notification_big_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.push_notification_big_icon);
        if (imageView != null) {
            i4 = R.id.push_notification_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.push_notification_content);
            if (textView != null) {
                i4 = R.id.push_notification_content_one_line;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.push_notification_content_one_line);
                if (textView2 != null) {
                    i4 = R.id.push_notification_date;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.push_notification_date);
                    if (textView3 != null) {
                        i4 = R.id.push_notification_dot;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.push_notification_dot);
                        if (textView4 != null) {
                            i4 = R.id.push_notification_layout_lefttop;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.push_notification_layout_lefttop);
                            if (linearLayout != null) {
                                i4 = R.id.push_notification_small_icon;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.push_notification_small_icon);
                                if (imageView2 != null) {
                                    i4 = R.id.push_notification_style_1;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.push_notification_style_1);
                                    if (relativeLayout != null) {
                                        i4 = R.id.push_notification_style_1_big_icon;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.push_notification_style_1_big_icon);
                                        if (imageView3 != null) {
                                            i4 = R.id.push_notification_style_1_content;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.push_notification_style_1_content);
                                            if (textView5 != null) {
                                                i4 = R.id.push_notification_style_1_date;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.push_notification_style_1_date);
                                                if (textView6 != null) {
                                                    i4 = R.id.push_notification_style_1_title;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.push_notification_style_1_title);
                                                    if (textView7 != null) {
                                                        i4 = R.id.push_notification_style_default;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.push_notification_style_default);
                                                        if (relativeLayout2 != null) {
                                                            i4 = R.id.push_notification_sub_title;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.push_notification_sub_title);
                                                            if (textView8 != null) {
                                                                i4 = R.id.push_notification_title;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, R.id.push_notification_title);
                                                                if (textView9 != null) {
                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) view;
                                                                    i4 = R.id.f15619v;
                                                                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, R.id.f15619v);
                                                                    if (frameLayout != null) {
                                                                        return new PushNotificationBinding(relativeLayout3, imageView, textView, textView2, textView3, textView4, linearLayout, imageView2, relativeLayout, imageView3, textView5, textView6, textView7, relativeLayout2, textView8, textView9, relativeLayout3, frameLayout);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static PushNotificationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public RelativeLayout getRoot() {
        return this.f26162b;
    }

    @NonNull
    public static PushNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.push_notification, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
