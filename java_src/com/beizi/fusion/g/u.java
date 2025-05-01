package com.beizi.fusion.g;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.beizi.fusion.R;
import com.beizi.fusion.g.v;
import com.qq.e.comm.compliance.DownloadConfirmCallBack;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
/* compiled from: DownloadApkConfirmDialog.java */
/* loaded from: classes2.dex */
public class u extends Dialog implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private Context f7012a;

    /* renamed from: b  reason: collision with root package name */
    private int f7013b;

    /* renamed from: c  reason: collision with root package name */
    private DownloadConfirmCallBack f7014c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f7015d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f7016e;

    /* renamed from: f  reason: collision with root package name */
    private Button f7017f;

    /* renamed from: g  reason: collision with root package name */
    private ViewGroup f7018g;

    /* renamed from: h  reason: collision with root package name */
    private ProgressBar f7019h;

    /* renamed from: i  reason: collision with root package name */
    private Button f7020i;

    /* renamed from: j  reason: collision with root package name */
    private String f7021j;

    public u(Context context, String str, DownloadConfirmCallBack downloadConfirmCallBack) {
        super(context, R.style.DownloadConfirmDialogFullScreen);
        this.f7012a = context;
        this.f7014c = downloadConfirmCallBack;
        this.f7021j = str;
        this.f7013b = context.getResources().getConfiguration().orientation;
        requestWindowFeature(1);
        setCanceledOnTouchOutside(true);
        b();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        super.cancel();
        DownloadConfirmCallBack downloadConfirmCallBack = this.f7014c;
        if (downloadConfirmCallBack != null) {
            downloadConfirmCallBack.onCancel();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f7016e) {
            DownloadConfirmCallBack downloadConfirmCallBack = this.f7014c;
            if (downloadConfirmCallBack != null) {
                downloadConfirmCallBack.onCancel();
            }
            dismiss();
        } else if (view == this.f7017f) {
            DownloadConfirmCallBack downloadConfirmCallBack2 = this.f7014c;
            if (downloadConfirmCallBack2 != null) {
                downloadConfirmCallBack2.onConfirm();
            }
            dismiss();
        } else if (view == this.f7020i) {
            a(this.f7021j);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        int o4 = av.o(this.f7012a);
        int n4 = av.n(this.f7012a);
        Window window = getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i4 = this.f7013b;
        if (i4 == 1) {
            attributes.width = -1;
            double d5 = o4;
            Double.isNaN(d5);
            attributes.height = (int) (d5 * 0.6d);
            attributes.gravity = 80;
            attributes.windowAnimations = R.style.DownloadConfirmDialogAnimationUp;
        } else if (i4 == 2) {
            double d6 = n4;
            Double.isNaN(d6);
            attributes.width = (int) (d6 * 0.5d);
            attributes.height = -1;
            attributes.gravity = 5;
            attributes.windowAnimations = R.style.DownloadConfirmDialogAnimationRight;
        }
        attributes.dimAmount = 0.5f;
        window.setAttributes(attributes);
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.beizi.fusion.g.u.2
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                try {
                    u.this.getWindow().setWindowAnimations(0);
                } catch (Throwable unused) {
                }
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        try {
            a(this.f7021j);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("load error url:");
            sb.append(this.f7021j);
        }
    }

    private void b() {
        setContentView(R.layout.download_confirm_dialog);
        View findViewById = findViewById(R.id.download_confirm_root);
        int i4 = this.f7013b;
        if (i4 == 1) {
            findViewById.setBackgroundResource(R.drawable.download_confirm_background_portrait);
        } else if (i4 == 2) {
            findViewById.setBackgroundResource(R.drawable.download_confirm_background_landscape);
        }
        ImageView imageView = (ImageView) findViewById(R.id.download_confirm_close);
        this.f7016e = imageView;
        imageView.setOnClickListener(this);
        Button button = (Button) findViewById(R.id.download_confirm_reload_button);
        this.f7020i = button;
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.download_confirm_confirm);
        this.f7017f = button2;
        button2.setOnClickListener(this);
        this.f7019h = (ProgressBar) findViewById(R.id.download_confirm_progress_bar);
        this.f7018g = (ViewGroup) findViewById(R.id.download_confirm_content);
        c();
    }

    private void c() {
        this.f7015d = new TextView(this.f7012a);
        ScrollView scrollView = new ScrollView(this.f7012a);
        scrollView.addView(this.f7015d);
        ((FrameLayout) findViewById(R.id.download_confirm_holder)).addView(scrollView);
    }

    public void a() {
        this.f7017f.setText("立即安装");
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f7019h.setVisibility(8);
            this.f7018g.setVisibility(8);
            this.f7020i.setVisibility(0);
            this.f7020i.setText("抱歉，应用信息获取失败");
            this.f7020i.setEnabled(false);
            return;
        }
        new ah() { // from class: com.beizi.fusion.g.u.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public void onPostExecute(String str2) {
                try {
                    u.this.f7019h.setVisibility(8);
                    u.this.f7020i.setVisibility(8);
                    u.this.f7018g.setVisibility(0);
                    v.a b5 = v.b(str2);
                    if (b5 == null) {
                        u.this.f7019h.setVisibility(8);
                        u.this.f7020i.setVisibility(0);
                        u.this.f7018g.setVisibility(8);
                        return;
                    }
                    u.this.f7015d.append("icon链接:\n");
                    u.this.f7015d.append(b5.f7029a);
                    u.this.f7015d.append("\n应用名:\n");
                    TextView textView = u.this.f7015d;
                    textView.append("\t" + b5.f7030b);
                    u.this.f7015d.append("\n应用版本:\n");
                    TextView textView2 = u.this.f7015d;
                    textView2.append("\t" + b5.f7031c);
                    u.this.f7015d.append("\n开发者:\n");
                    TextView textView3 = u.this.f7015d;
                    textView3.append("\t" + b5.f7032d);
                    u.this.f7015d.append("\n应用大小:\n");
                    TextView textView4 = u.this.f7015d;
                    textView4.append("\t" + u.a(b5.f7036h));
                    u.this.f7015d.append("\n更新时间:\n");
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    TextView textView5 = u.this.f7015d;
                    textView5.append("\t" + simpleDateFormat.format(new Date(b5.f7035g)));
                    u.this.f7015d.append("\n隐私条款链接:\n");
                    u.this.f7015d.append(b5.f7034f);
                    u.this.f7015d.append("\n权限信息:\n");
                    List<String> list = b5.f7033e;
                    if (list != null && list.size() > 0) {
                        Iterator<String> it2 = b5.f7033e.iterator();
                        while (it2.hasNext()) {
                            TextView textView6 = u.this.f7015d;
                            textView6.append("\t" + it2.next() + "\n");
                        }
                    }
                    Linkify.addLinks(u.this.f7015d, Patterns.WEB_URL, (String) null, (Linkify.MatchFilter) null, new Linkify.TransformFilter() { // from class: com.beizi.fusion.g.u.1.1
                        @Override // android.text.util.Linkify.TransformFilter
                        public final String transformUrl(Matcher matcher, String str3) {
                            return matcher.group();
                        }
                    });
                    u.this.f7019h.setVisibility(8);
                    u.this.f7020i.setVisibility(8);
                    u.this.f7018g.setVisibility(0);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }.execute(str);
    }

    public static String a(long j4) {
        if (j4 <= 0) {
            return "0";
        }
        double d5 = j4;
        int log10 = (int) (Math.log10(d5) / Math.log10(1024.0d));
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.##");
        double pow = Math.pow(1024.0d, log10);
        Double.isNaN(d5);
        sb.append(decimalFormat.format(d5 / pow));
        sb.append(" ");
        sb.append(new String[]{"B", "kB", "MB", "GB", "TB"}[log10]);
        return sb.toString();
    }
}
