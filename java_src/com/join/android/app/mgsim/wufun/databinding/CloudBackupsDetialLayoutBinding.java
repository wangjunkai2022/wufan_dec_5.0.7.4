package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class CloudBackupsDetialLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f17910b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f17911c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f17912d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final TextView f17913e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f17914f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final TextView f17915g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f17916h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final TextView f17917i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f17918j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final Button f17919k;
    @NonNull

    /* renamed from: l  reason: collision with root package name */
    public final TextView f17920l;
    @NonNull

    /* renamed from: m  reason: collision with root package name */
    public final TextView f17921m;
    @NonNull

    /* renamed from: n  reason: collision with root package name */
    public final TextView f17922n;

    private CloudBackupsDetialLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull LinearLayout linearLayout3, @NonNull TextView textView2, @NonNull LinearLayout linearLayout4, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Button button2, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f17910b = linearLayout;
        this.f17911c = button;
        this.f17912d = linearLayout2;
        this.f17913e = textView;
        this.f17914f = linearLayout3;
        this.f17915g = textView2;
        this.f17916h = linearLayout4;
        this.f17917i = textView3;
        this.f17918j = textView4;
        this.f17919k = button2;
        this.f17920l = textView5;
        this.f17921m = textView6;
        this.f17922n = textView7;
    }

    @NonNull
    public static CloudBackupsDetialLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.deletbutn;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.deletbutn);
        if (button != null) {
            i4 = R.id.gameHostory;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.gameHostory);
            if (linearLayout != null) {
                i4 = R.id.gameHostoryNumber;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.gameHostoryNumber);
                if (textView != null) {
                    i4 = R.id.gameKeySet;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.gameKeySet);
                    if (linearLayout2 != null) {
                        i4 = R.id.gameKeySetNumber;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.gameKeySetNumber);
                        if (textView2 != null) {
                            i4 = R.id.gameList;
                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.gameList);
                            if (linearLayout3 != null) {
                                i4 = R.id.gamelistnumber;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.gamelistnumber);
                                if (textView3 != null) {
                                    i4 = R.id.phoneType;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.phoneType);
                                    if (textView4 != null) {
                                        i4 = R.id.recoder;
                                        Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.recoder);
                                        if (button2 != null) {
                                            i4 = R.id.textView;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.textView);
                                            if (textView5 != null) {
                                                i4 = R.id.textView3;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.textView3);
                                                if (textView6 != null) {
                                                    i4 = R.id.timeText;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.timeText);
                                                    if (textView7 != null) {
                                                        return new CloudBackupsDetialLayoutBinding((LinearLayout) view, button, linearLayout, textView, linearLayout2, textView2, linearLayout3, textView3, textView4, button2, textView5, textView6, textView7);
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
    public static CloudBackupsDetialLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f17910b;
    }

    @NonNull
    public static CloudBackupsDetialLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.cloud_backups_detial_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
