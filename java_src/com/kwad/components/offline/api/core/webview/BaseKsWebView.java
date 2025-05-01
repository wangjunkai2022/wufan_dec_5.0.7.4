package com.kwad.components.offline.api.core.webview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.kwad.sdk.widget.h;
import java.util.UUID;
/* loaded from: classes5.dex */
public abstract class BaseKsWebView extends FrameLayout {
    private boolean enableScroll;
    public DeepLinkListener mDeeplinkListener;
    protected String mUniqueId;
    private h mViewRCHelper;
    public WebLoadListener mWebLoadListener;
    protected WebViewStateListener mWebViewStateListener;

    /* loaded from: classes5.dex */
    public interface DeepLinkListener {
        void onFailed();

        void onSuccess();
    }

    /* loaded from: classes5.dex */
    public interface WebLoadListener {
        void onDownloadStart(String str, String str2, String str3, String str4, long j4);

        void onPageFinished();

        void onPageStart();

        void onReceivedHttpError(int i4, String str, String str2);

        boolean shouldOverrideUrlLoading(WebView webView, String str);
    }

    /* loaded from: classes5.dex */
    public interface WebViewStateListener {
        void onFocusChanged(boolean z4, int i4, Rect rect);

        void onScrollChanged(int i4, int i5, int i6, int i7);

        void onSizeChanged(int i4, int i5, int i6, int i7);

        void onVisibilityChanged(View view, int i4);

        void onWindowFocusChanged(boolean z4);
    }

    public BaseKsWebView(@NonNull Context context) {
        super(context);
        this.enableScroll = true;
        init(context, null);
    }

    private float[] getRadius(float f5, float f6, float f7, float f8) {
        return new float[]{f5, f5, f6, f6, f7, f7, f8, f8};
    }

    private void init(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        h hVar = new h();
        this.mViewRCHelper = hVar;
        hVar.initAttrs(context, attributeSet);
    }

    public abstract void addJavascriptInterface(Object obj, String str);

    public abstract void callJs(String str);

    public abstract void callJs(String str, String str2);

    public abstract boolean canGoBack();

    public abstract boolean canGoForward();

    public abstract void destroy();

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.mViewRCHelper.beforeDispatchDraw(canvas);
        super.dispatchDraw(canvas);
        this.mViewRCHelper.afterDispatchDraw(canvas);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        this.mViewRCHelper.beforeDraw(canvas);
        super.draw(canvas);
        this.mViewRCHelper.afterDraw(canvas);
    }

    public String getUniqueId() {
        if (this.mUniqueId == null) {
            this.mUniqueId = UUID.randomUUID().toString();
        }
        return this.mUniqueId;
    }

    public abstract void goBack();

    public abstract void goForward();

    public abstract void loadUrl(String str);

    @Override // android.view.View
    protected void onFocusChanged(boolean z4, int i4, Rect rect) {
        super.onFocusChanged(z4, i4, rect);
        WebViewStateListener webViewStateListener = this.mWebViewStateListener;
        if (webViewStateListener != null) {
            webViewStateListener.onFocusChanged(z4, i4, rect);
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        WebViewStateListener webViewStateListener = this.mWebViewStateListener;
        if (webViewStateListener != null) {
            webViewStateListener.onScrollChanged(i4, i5, i6, i7);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.mViewRCHelper.onSizeChanged(i4, i5);
        WebViewStateListener webViewStateListener = this.mWebViewStateListener;
        if (webViewStateListener != null) {
            webViewStateListener.onSizeChanged(i4, i5, i6, i7);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        WebViewStateListener webViewStateListener = this.mWebViewStateListener;
        if (webViewStateListener != null) {
            webViewStateListener.onVisibilityChanged(view, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        WebViewStateListener webViewStateListener = this.mWebViewStateListener;
        if (webViewStateListener != null) {
            webViewStateListener.onWindowFocusChanged(z4);
        }
    }

    @Override // android.view.View
    public abstract void scrollBy(int i4, int i5);

    @Override // android.view.View
    public abstract void scrollTo(int i4, int i5);

    public abstract void setAcceptThirdPartyCookies(boolean z4);

    public abstract void setAdCacheId(int i4, String str);

    public abstract void setAdTemplateString(String str);

    public abstract void setAllowContentAccess(boolean z4);

    public abstract void setAllowFileAccess(boolean z4);

    public abstract void setAllowFileAccessFromFileURLs(boolean z4);

    public abstract void setAllowUniversalAccessFromFileURLs(boolean z4);

    public abstract void setCacheMode(int i4);

    public abstract void setContextUniqId(int i4);

    public abstract void setDebugEnabled(boolean z4);

    public abstract void setDeeplinkEnabled(boolean z4);

    public void setDeeplinkListener(DeepLinkListener deepLinkListener) {
        this.mDeeplinkListener = deepLinkListener;
    }

    public abstract void setEnableScroll(boolean z4);

    public abstract void setEnableWebCache(boolean z4);

    public abstract void setInnerDownloadEnabled(boolean z4);

    public abstract void setJavaScriptEnabled(boolean z4);

    public abstract void setMixedContentMode(int i4);

    public void setRadius(float f5, float f6, float f7, float f8) {
        this.mViewRCHelper.setRadius(getRadius(f5, f6, f7, f8));
        postInvalidate();
    }

    public abstract void setSavePassword(boolean z4);

    public abstract void setTextZoom(int i4);

    public void setWebLoadListener(WebLoadListener webLoadListener) {
        this.mWebLoadListener = webLoadListener;
    }

    public void setWebViewStateListener(WebViewStateListener webViewStateListener) {
        this.mWebViewStateListener = webViewStateListener;
    }

    public BaseKsWebView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.enableScroll = true;
        init(context, attributeSet);
    }

    public BaseKsWebView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.enableScroll = true;
        init(context, attributeSet);
    }
}
