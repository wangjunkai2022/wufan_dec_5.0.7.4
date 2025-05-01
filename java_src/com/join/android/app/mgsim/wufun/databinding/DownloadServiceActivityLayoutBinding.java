package com.join.android.app.mgsim.wufun.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes3.dex */
public final class DownloadServiceActivityLayoutBinding implements ViewBinding {
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    private final LinearLayout f19200b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final Button f19201c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final Button f19202d;
    @NonNull

    /* renamed from: e  reason: collision with root package name */
    public final Button f19203e;
    @NonNull

    /* renamed from: f  reason: collision with root package name */
    public final Button f19204f;
    @NonNull

    /* renamed from: g  reason: collision with root package name */
    public final Button f19205g;
    @NonNull

    /* renamed from: h  reason: collision with root package name */
    public final Button f19206h;
    @NonNull

    /* renamed from: i  reason: collision with root package name */
    public final ListView f19207i;
    @NonNull

    /* renamed from: j  reason: collision with root package name */
    public final TextView f19208j;
    @NonNull

    /* renamed from: k  reason: collision with root package name */
    public final TextView f19209k;

    private DownloadServiceActivityLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull Button button3, @NonNull Button button4, @NonNull Button button5, @NonNull Button button6, @NonNull ListView listView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f19200b = linearLayout;
        this.f19201c = button;
        this.f19202d = button2;
        this.f19203e = button3;
        this.f19204f = button4;
        this.f19205g = button5;
        this.f19206h = button6;
        this.f19207i = listView;
        this.f19208j = textView;
        this.f19209k = textView2;
    }

    @NonNull
    public static DownloadServiceActivityLayoutBinding bind(@NonNull View view) {
        int i4 = R.id.btnStartService;
        Button button = (Button) ViewBindings.findChildViewById(view, R.id.btnStartService);
        if (button != null) {
            i4 = R.id.btnWeixin;
            Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.btnWeixin);
            if (button2 != null) {
                i4 = R.id.deleteDownload;
                Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.deleteDownload);
                if (button3 != null) {
                    i4 = R.id.doInstall;
                    Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.doInstall);
                    if (button4 != null) {
                        i4 = R.id.downloadCenter;
                        Button button5 = (Button) ViewBindings.findChildViewById(view, R.id.downloadCenter);
                        if (button5 != null) {
                            i4 = R.id.installedList;
                            Button button6 = (Button) ViewBindings.findChildViewById(view, R.id.installedList);
                            if (button6 != null) {
                                i4 = R.id.listView;
                                ListView listView = (ListView) ViewBindings.findChildViewById(view, R.id.listView);
                                if (listView != null) {
                                    i4 = R.id.txtIndicator;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.txtIndicator);
                                    if (textView != null) {
                                        i4 = R.id.txtWeixinIndicator;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txtWeixinIndicator);
                                        if (textView2 != null) {
                                            return new DownloadServiceActivityLayoutBinding((LinearLayout) view, button, button2, button3, button4, button5, button6, listView, textView, textView2);
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
    public static DownloadServiceActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* renamed from: a */
    public LinearLayout getRoot() {
        return this.f19200b;
    }

    @NonNull
    public static DownloadServiceActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z4) {
        View inflate = layoutInflater.inflate(R.layout.download_service_activity_layout, viewGroup, false);
        if (z4) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
