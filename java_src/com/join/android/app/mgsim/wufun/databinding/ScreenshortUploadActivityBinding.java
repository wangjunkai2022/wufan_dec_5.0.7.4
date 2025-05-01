package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.screenshot.SlidingTabLayoutScreenShort;
/* loaded from: classes3.dex */
public final class ScreenshortUploadActivityBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f26305b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f26306c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final EditText f26307d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f26308e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final SimpleDraweeView f26309f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final SlidingTabLayoutScreenShort f26310g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final ViewPager f26311h;

    private ScreenshortUploadActivityBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull EditText editText, @NonNull TextView textView, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SlidingTabLayoutScreenShort slidingTabLayoutScreenShort, @NonNull ViewPager viewPager) {
        this.f26305b = linearLayout;
        this.f26306c = imageView;
        this.f26307d = editText;
        this.f26308e = textView;
        this.f26309f = simpleDraweeView;
        this.f26310g = slidingTabLayoutScreenShort;
        this.f26311h = viewPager;
    }

    @NonNull
    public static ScreenshortUploadActivityBinding bind(@NonNull View view) {
        int i4 = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.back);
        if (imageView != null) {
            i4 = R.id.commitMessage;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, R.id.commitMessage);
            if (editText != null) {
                i4 = R.id.finishButn;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.finishButn);
                if (textView != null) {
                    i4 = R.id.imgUpload;
                    SimpleDraweeView simpleDraweeView = (SimpleDraweeView) ViewBindings.findChildViewById(view, R.id.imgUpload);
                    if (simpleDraweeView != null) {
                        i4 = R.id.selecter;
                        SlidingTabLayoutScreenShort slidingTabLayoutScreenShort = (SlidingTabLayoutScreenShort) ViewBindings.findChildViewById(view, R.id.selecter);
                        if (slidingTabLayoutScreenShort != null) {
                            i4 = R.id.viewPager;
                            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, R.id.viewPager);
                            if (viewPager != null) {
                                return new ScreenshortUploadActivityBinding((LinearLayout) view, imageView, editText, textView, simpleDraweeView, slidingTabLayoutScreenShort, viewPager);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static ScreenshortUploadActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f26305b;
    }

    @NonNull
    public static ScreenshortUploadActivityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.screenshort_upload_activity, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
