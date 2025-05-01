package com.beizi.ad.internal.view;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.beizi.ad.R;
import com.beizi.ad.internal.utilities.HaoboLog;
import com.beizi.ad.internal.utilities.ViewUtil;
/* compiled from: VideoEnabledWebChromeClient.java */
/* loaded from: classes2.dex */
public class h extends a {

    /* renamed from: a  reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f6413a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f6414b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f6415c;

    /* renamed from: d  reason: collision with root package name */
    private AdViewImpl f6416d;

    /* renamed from: e  reason: collision with root package name */
    private AdWebView f6417e;

    public h(Activity activity) {
        this.f6415c = activity;
    }

    private void a(FrameLayout frameLayout) {
        ImageButton imageButton = new ImageButton(this.f6415c);
        imageButton.setImageDrawable(this.f6415c.getResources().getDrawable(17301560));
        imageButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 53));
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.ad.internal.view.h.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                h.this.onHideCustomView();
            }
        });
        frameLayout.addView(imageButton);
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsHidePrompt() {
        AdViewImpl adViewImpl = this.f6416d;
        if (adViewImpl == null || adViewImpl.e() || this.f6416d.a()) {
            return;
        }
        this.f6416d.getAdDispatcher().b();
    }

    @Override // android.webkit.WebChromeClient
    public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        AdWebView adWebView = this.f6417e;
        AlertDialog.Builder builder = new AlertDialog.Builder(adWebView != null ? ViewUtil.getTopContext(adWebView) : this.f6415c);
        builder.setTitle(String.format(this.f6415c.getResources().getString(R.string.html5_geo_permission_prompt_title), str));
        builder.setMessage(R.string.html5_geo_permission_prompt);
        builder.setPositiveButton(R.string.allow, new DialogInterface.OnClickListener() { // from class: com.beizi.ad.internal.view.h.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                callback.invoke(str, true, true);
            }
        });
        builder.setNegativeButton(R.string.deny, new DialogInterface.OnClickListener() { // from class: com.beizi.ad.internal.view.h.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                callback.invoke(str, false, false);
            }
        });
        builder.create().show();
        AdViewImpl adViewImpl = this.f6416d;
        if (adViewImpl == null || adViewImpl.e() || this.f6416d.a()) {
            return;
        }
        this.f6416d.getAdDispatcher().c();
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        ViewGroup viewGroup;
        super.onHideCustomView();
        Activity activity = this.f6415c;
        if (activity != null && this.f6414b != null) {
            AdWebView adWebView = this.f6417e;
            if (adWebView != null) {
                viewGroup = (ViewGroup) adWebView.getRootView().findViewById(16908290);
            } else {
                viewGroup = (ViewGroup) activity.findViewById(16908290);
            }
            if (viewGroup == null) {
                HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.fullscreen_video_hide_error));
                return;
            }
            viewGroup.removeView(this.f6414b);
            WebChromeClient.CustomViewCallback customViewCallback = this.f6413a;
            if (customViewCallback != null) {
                try {
                    customViewCallback.onCustomViewHidden();
                    return;
                } catch (NullPointerException e5) {
                    String str = HaoboLog.baseLogTag;
                    HaoboLog.e(str, "Exception calling customViewCallback  onCustomViewHidden: " + e5.getMessage());
                    return;
                }
            }
            return;
        }
        HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.fullscreen_video_hide_error));
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, int i4, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, customViewCallback);
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        ViewGroup viewGroup;
        super.onShowCustomView(view, customViewCallback);
        Activity activity = this.f6415c;
        if (activity == null) {
            HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.fullscreen_video_show_error));
            return;
        }
        AdWebView adWebView = this.f6417e;
        if (adWebView != null) {
            viewGroup = (ViewGroup) adWebView.getRootView().findViewById(16908290);
        } else {
            viewGroup = (ViewGroup) activity.findViewById(16908290);
        }
        if (viewGroup == null) {
            HaoboLog.w(HaoboLog.baseLogTag, HaoboLog.getString(R.string.fullscreen_video_show_error));
            return;
        }
        this.f6413a = customViewCallback;
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            this.f6414b = frameLayout;
            frameLayout.setClickable(true);
            this.f6414b.setBackgroundColor(-16777216);
            try {
                a(this.f6414b);
                viewGroup.addView(this.f6414b, new ViewGroup.LayoutParams(-1, -1));
                return;
            } catch (Exception e5) {
                HaoboLog.d(HaoboLog.baseLogTag, e5.toString());
                return;
            }
        }
        this.f6414b = null;
    }

    public h(AdWebView adWebView) {
        this.f6415c = (Activity) adWebView.getContextFromMutableContext();
        this.f6417e = adWebView;
        this.f6416d = adWebView.adViewImpl;
    }
}
