package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class MediacontrollerBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f23666b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final ImageButton f23667c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final ImageButton f23668d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final SeekBar f23669e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final TextView f23670f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f23671g;

    private MediacontrollerBinding(@NonNull LinearLayout linearLayout, @NonNull ImageButton imageButton, @NonNull ImageButton imageButton2, @NonNull SeekBar seekBar, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f23666b = linearLayout;
        this.f23667c = imageButton;
        this.f23668d = imageButton2;
        this.f23669e = seekBar;
        this.f23670f = textView;
        this.f23671g = textView2;
    }

    @NonNull
    public static MediacontrollerBinding bind(@NonNull View view) {
        int i4 = R.id.mediacontroller_full_screen;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, R.id.mediacontroller_full_screen);
        if (imageButton != null) {
            i4 = R.id.mediacontroller_play_pause;
            ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, R.id.mediacontroller_play_pause);
            if (imageButton2 != null) {
                i4 = R.id.mediacontroller_seekbar;
                SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(view, R.id.mediacontroller_seekbar);
                if (seekBar != null) {
                    i4 = R.id.mediacontroller_time_current;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.mediacontroller_time_current);
                    if (textView != null) {
                        i4 = R.id.mediacontroller_time_total;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.mediacontroller_time_total);
                        if (textView2 != null) {
                            return new MediacontrollerBinding((LinearLayout) view, imageButton, imageButton2, seekBar, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }

    @NonNull
    public static MediacontrollerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f23666b;
    }

    @NonNull
    public static MediacontrollerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.mediacontroller, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
