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
public final class ActivityMessageSettingBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f16607b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f16608c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f16609d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final LinearLayout f16610e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f16611f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f16612g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f16613h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final LinearLayout f16614i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f16615j;

    private ActivityMessageSettingBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout3, @NonNull ImageView imageView4, @NonNull LinearLayout linearLayout4, @NonNull TextView textView) {
        this.f16607b = linearLayout;
        this.f16608c = imageView;
        this.f16609d = imageView2;
        this.f16610e = linearLayout2;
        this.f16611f = imageView3;
        this.f16612g = linearLayout3;
        this.f16613h = imageView4;
        this.f16614i = linearLayout4;
        this.f16615j = textView;
    }

    @NonNull
    public static ActivityMessageSettingBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.isGetLikeIv;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.isGetLikeIv);
            if (imageView2 != null) {
                i4 = R.id.isGetLikeLl;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.isGetLikeLl);
                if (linearLayout != null) {
                    i4 = R.id.isGetMessageIv;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.isGetMessageIv);
                    if (imageView3 != null) {
                        i4 = R.id.isGetMessageLl;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.isGetMessageLl);
                        if (linearLayout2 != null) {
                            i4 = R.id.isGetReplayIv;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, R.id.isGetReplayIv);
                            if (imageView4 != null) {
                                i4 = R.id.isGetReplayLl;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.isGetReplayLl);
                                if (linearLayout3 != null) {
                                    i4 = R.id.title;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title);
                                    if (textView != null) {
                                        return new ActivityMessageSettingBinding((LinearLayout) view, imageView, imageView2, linearLayout, imageView3, linearLayout2, imageView4, linearLayout3, textView);
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
    public static ActivityMessageSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f16607b;
    }

    @NonNull
    public static ActivityMessageSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.activity_message_setting, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
