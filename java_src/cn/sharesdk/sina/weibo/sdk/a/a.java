package cn.sharesdk.sina.weibo.sdk.a;

import android.content.Context;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import cn.sharesdk.framework.utils.SSDKLog;
import cn.sharesdk.framework.utils.n;
import cn.sharesdk.sina.weibo.sdk.LoadingBar;
import com.mob.tools.utils.ResHelper;
import java.lang.reflect.Method;
/* compiled from: WeiboWebPageLayout.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private TextView f1120a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f1121b;

    /* renamed from: c  reason: collision with root package name */
    private WebView f1122c;

    /* renamed from: d  reason: collision with root package name */
    private LoadingBar f1123d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayout f1124e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f1125f;

    /* renamed from: g  reason: collision with root package name */
    private Button f1126g;

    /* renamed from: h  reason: collision with root package name */
    private Context f1127h;

    public a(Context context) {
        this.f1127h = context;
    }

    private void e() {
        n.a(this.f1122c.getSettings(), true);
        n.a(this.f1122c, false);
        this.f1122c.getSettings().setSavePassword(false);
        this.f1122c.getSettings().setUserAgentString(Build.MANUFACTURER + "-" + Build.MODEL + "_" + Build.VERSION.RELEASE + "_weibosdk_0031405000_android");
        this.f1122c.requestFocus();
        this.f1122c.setScrollBarStyle(0);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 > 10 && i4 < 17) {
            try {
                Method method = this.f1122c.getClass().getMethod("removeJavascriptInterface", String.class);
                method.setAccessible(true);
                method.invoke(this.f1122c, "searchBoxJavaBridge_");
            } catch (Throwable th) {
                SSDKLog.b().a(th);
            }
        }
        this.f1122c.setWebChromeClient(new WebChromeClient() { // from class: cn.sharesdk.sina.weibo.sdk.a.a.2
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i5) {
                super.onProgressChanged(webView, i5);
                a.this.f1123d.a(i5);
                if (i5 == 100) {
                    a.this.f1123d.setVisibility(4);
                } else {
                    a.this.f1123d.setVisibility(0);
                }
            }
        });
    }

    public TextView b() {
        return this.f1120a;
    }

    public WebView c() {
        return this.f1122c;
    }

    public LinearLayout d() {
        return this.f1124e;
    }

    public RelativeLayout a(int i4) {
        RelativeLayout relativeLayout = new RelativeLayout(this.f1127h);
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(-1);
        RelativeLayout relativeLayout2 = new RelativeLayout(this.f1127h);
        relativeLayout2.setId(ResHelper.getIdRes(this.f1127h, "ssdk_sina_web_title_id"));
        relativeLayout2.setBackgroundColor(-131587);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ResHelper.dipToPx(this.f1127h, 55));
        layoutParams.addRule(10);
        relativeLayout.addView(relativeLayout2, layoutParams);
        TextView textView = new TextView(this.f1127h);
        this.f1120a = textView;
        textView.setTextSize(1, 17.0f);
        this.f1120a.setTextColor(cn.sharesdk.sina.weibo.sdk.a.a(-32256, 1728020992));
        int stringRes = ResHelper.getStringRes(this.f1127h, "ssdk_sina_web_close");
        if (stringRes > 0) {
            this.f1120a.setText(stringRes);
        }
        int dipToPx = ResHelper.dipToPx(this.f1127h, 10);
        this.f1120a.setPadding(dipToPx, 0, dipToPx, 0);
        this.f1120a.setOnTouchListener(new View.OnTouchListener() { // from class: cn.sharesdk.sina.weibo.sdk.a.a.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    view.setBackgroundColor(-1);
                    return false;
                } else if (motionEvent.getAction() == 1) {
                    view.setBackgroundColor(-131587);
                    return false;
                } else {
                    return false;
                }
            }
        });
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(15);
        relativeLayout2.addView(this.f1120a, layoutParams2);
        TextView textView2 = new TextView(this.f1127h);
        this.f1121b = textView2;
        textView2.setTextColor(-11382190);
        this.f1121b.setTextSize(1, 18.0f);
        if (i4 > 0) {
            this.f1121b.setText(i4);
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(13);
        relativeLayout2.addView(this.f1121b, layoutParams3);
        this.f1122c = new WebView(this.f1127h);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams4.addRule(3, relativeLayout2.getId());
        relativeLayout.addView(this.f1122c, layoutParams4);
        this.f1123d = new LoadingBar(this.f1127h);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, ResHelper.dipToPx(this.f1127h, 3));
        layoutParams5.addRule(3, relativeLayout2.getId());
        relativeLayout.addView(this.f1123d, layoutParams5);
        View view = new View(this.f1127h);
        int bitmapRes = ResHelper.getBitmapRes(this.f1127h, "ssdk_weibo_common_shadow_top");
        if (bitmapRes > 0) {
            view.setBackgroundResource(bitmapRes);
        }
        relativeLayout.addView(view, layoutParams5);
        LinearLayout linearLayout = new LinearLayout(this.f1127h);
        this.f1124e = linearLayout;
        linearLayout.setVisibility(8);
        this.f1124e.setGravity(17);
        this.f1124e.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13);
        relativeLayout.addView(this.f1124e, layoutParams6);
        ImageView imageView = new ImageView(this.f1127h);
        int bitmapRes2 = ResHelper.getBitmapRes(this.f1127h, "ssdk_weibo_empty_failed");
        if (bitmapRes2 > 0) {
            imageView.setImageResource(bitmapRes2);
        }
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams7.bottomMargin = ResHelper.dipToPx(this.f1127h, 8);
        this.f1124e.addView(imageView, layoutParams7);
        this.f1125f = new TextView(this.f1127h);
        int stringRes2 = ResHelper.getStringRes(this.f1127h, "ssdk_sina_web_net_error");
        if (stringRes2 > 0) {
            this.f1125f.setText(stringRes2);
        }
        this.f1125f.setTextColor(-4342339);
        this.f1125f.setTextSize(1, 14.0f);
        this.f1124e.addView(this.f1125f, new LinearLayout.LayoutParams(-2, -2));
        Button button = new Button(this.f1127h);
        this.f1126g = button;
        button.setTextColor(-8882056);
        this.f1126g.setGravity(17);
        this.f1126g.setTextSize(1, 16.0f);
        int stringRes3 = ResHelper.getStringRes(this.f1127h, "ssdk_sina_web_refresh");
        if (stringRes3 > 0) {
            this.f1126g.setText(stringRes3);
        }
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(ResHelper.dipToPx(this.f1127h, 142), ResHelper.dipToPx(this.f1127h, 46));
        layoutParams8.topMargin = dipToPx;
        this.f1124e.addView(this.f1126g, layoutParams8);
        e();
        return relativeLayout;
    }

    public Button a() {
        return this.f1126g;
    }
}
