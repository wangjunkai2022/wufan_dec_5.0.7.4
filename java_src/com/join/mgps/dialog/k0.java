package com.join.mgps.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.Filepath;
import java.util.List;
/* compiled from: DownloadPathSetDialog.java */
/* loaded from: classes4.dex */
public class k0 extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private Context f49480b;

    /* renamed from: c  reason: collision with root package name */
    private String f49481c;

    /* renamed from: d  reason: collision with root package name */
    private String f49482d;

    /* renamed from: e  reason: collision with root package name */
    private Filepath f49483e;

    /* renamed from: f  reason: collision with root package name */
    private Filepath f49484f;

    /* renamed from: g  reason: collision with root package name */
    private d f49485g;

    /* compiled from: DownloadPathSetDialog.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(8);
            intentDateBean.setLink_type_val("12410");
            IntentUtil.getInstance().intentActivity(k0.this.f49480b, intentDateBean);
        }
    }

    /* compiled from: DownloadPathSetDialog.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k0.this.f49485g.b(k0.this.f49483e);
            try {
                if (k0.this.f49483e.getAvailable() < 10485760) {
                    com.join.mgps.Util.l2.a(k0.this.f49480b).b("存储空间小于10M可能存储空间不足");
                }
                com.join.mgps.pref.h.n(k0.this.f49480b).V(k0.this.f49481c);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            k0.this.dismiss();
        }
    }

    /* compiled from: DownloadPathSetDialog.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k0.this.f49485g.a(k0.this.f49484f);
            if (k0.this.f49484f.getAvailable() < 10485760) {
                com.join.mgps.Util.l2.a(k0.this.f49480b).b("存储空间小于10M可能存储空间不足");
            }
            com.join.mgps.pref.h.n(k0.this.f49480b).V(k0.this.f49482d);
            k0.this.dismiss();
        }
    }

    /* compiled from: DownloadPathSetDialog.java */
    /* loaded from: classes4.dex */
    public interface d {
        void a(Filepath filepath);

        void b(Filepath filepath);
    }

    public k0(Context context) {
        super(context);
        this.f49481c = "";
        this.f49482d = "";
        this.f49480b = context;
    }

    public void g(d dVar) {
        this.f49485g = dVar;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.download_path_set_dialog_layout);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBoxlocal);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBoxSd);
        TextView textView = (TextView) findViewById(R.id.localpath);
        TextView textView2 = (TextView) findViewById(R.id.localsize);
        TextView textView3 = (TextView) findViewById(R.id.changeSdkard);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.noticelayout);
        TextView textView4 = (TextView) findViewById(R.id.sdpath);
        TextView textView5 = (TextView) findViewById(R.id.sdSize);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.localPathLayout);
        RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.sdPathLayout);
        relativeLayout2.setVisibility(8);
        String g4 = com.join.mgps.pref.h.n(this.f49480b).g();
        List<Filepath> a5 = com.join.mgps.Util.s1.a(this.f49480b);
        if (a5 != null && a5.size() != 0) {
            for (Filepath filepath : a5) {
                if (filepath.isIslocal()) {
                    this.f49483e = filepath;
                    if (g4.equals(filepath.getPathHome())) {
                        checkBox.setChecked(true);
                        checkBox2.setChecked(false);
                    }
                    textView.setText(filepath.getPathHome());
                    this.f49481c = filepath.getPathHome();
                    textView2.setText("可用:" + UtilsMy.a(filepath.getAvailable()) + "/总" + UtilsMy.a(filepath.getAllsize()));
                } else {
                    this.f49484f = filepath;
                    if (g4.equals(filepath.getPathHome())) {
                        checkBox.setChecked(false);
                        checkBox2.setChecked(true);
                    }
                    relativeLayout2.setVisibility(0);
                    textView4.setText(filepath.getPathHome());
                    this.f49482d = filepath.getPathHome();
                    textView5.setText("可用:" + UtilsMy.a(filepath.getAvailable()) + "/总" + UtilsMy.a(filepath.getAllsize()));
                    if (this.f49482d.contains("/Android/data")) {
                        linearLayout.setVisibility(0);
                    } else {
                        linearLayout.setVisibility(8);
                    }
                }
            }
            linearLayout.setOnClickListener(new a());
            relativeLayout.setOnClickListener(new b());
            relativeLayout2.setOnClickListener(new c());
            return;
        }
        relativeLayout.setVisibility(8);
        linearLayout.setVisibility(0);
        textView3.setText("没有可选下载位置", TextView.BufferType.SPANNABLE);
    }

    public k0(Context context, int i4) {
        super(context, i4);
        this.f49481c = "";
        this.f49482d = "";
        this.f49480b = context;
    }

    protected k0(Context context, boolean z4, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z4, onCancelListener);
        this.f49481c = "";
        this.f49482d = "";
        this.f49480b = context;
    }
}
