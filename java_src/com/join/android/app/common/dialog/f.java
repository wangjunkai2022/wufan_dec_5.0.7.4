package com.join.android.app.common.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.join.android.app.mgsim.wufun.R;
import com.umeng.analytics.MobclickAgent;
import m.framework.ui.widget.asyncview.AsyncImageView;
/* compiled from: LocalGameOneDialog.java */
/* loaded from: classes3.dex */
public class f extends AlertDialog {

    /* renamed from: b  reason: collision with root package name */
    private Button f14576b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f14577c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f14578d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f14579e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f14580f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f14581g;

    /* renamed from: h  reason: collision with root package name */
    private int f14582h;

    /* compiled from: LocalGameOneDialog.java */
    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.pref.h.n(f.this.getContext()).U(false);
            f.this.dismiss();
        }
    }

    /* compiled from: LocalGameOneDialog.java */
    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {

        /* compiled from: LocalGameOneDialog.java */
        /* loaded from: classes3.dex */
        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                f.this.dismiss();
            }
        }

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.f14580f.setVisibility(4);
            f.this.f14581g.setImageResource(R.drawable.ic_local_game_scan);
            f.this.f14578d.setText("扫描提示");
            f.this.f14577c.setText("如再次需要扫描，请前往【我的游戏】点击本地游戏按钮。");
            f.this.f14576b.setText("我知道了");
            f.this.f14576b.setOnClickListener(new a());
        }
    }

    public f(@NonNull Context context, int i4) {
        super(context);
        this.f14582h = 0;
        this.f14582h = i4;
    }

    public void f(View.OnClickListener onClickListener) {
        this.f14576b.setOnClickListener(onClickListener);
    }

    public void g(String str, View.OnClickListener onClickListener) {
        this.f14576b.setOnClickListener(onClickListener);
        this.f14576b.setText(str);
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        Window window = getWindow();
        window.setBackgroundDrawableResource(AsyncImageView.DEFAULT_TRANSPARENT);
        window.setGravity(17);
        setContentView(R.layout.dialog_localgame_one_view);
        this.f14576b = (Button) findViewById(R.id.localGameOneBt);
        this.f14578d = (TextView) findViewById(R.id.localGameOneTitleTv);
        this.f14577c = (TextView) findViewById(R.id.localGameOneContentTv);
        this.f14579e = (TextView) findViewById(R.id.localGameOneNotTv);
        this.f14580f = (ImageView) findViewById(R.id.localGameOneCloseTv);
        this.f14581g = (ImageView) findViewById(R.id.localGameOneTopIv);
        this.f14579e.setOnClickListener(new a());
        this.f14580f.setOnClickListener(new b());
        int i4 = this.f14582h;
        if (i4 == 0) {
            setCancelable(true);
            this.f14578d.setText("本地游戏运行帮助");
            this.f14577c.setText("悟饭支持本地扫描了，下载文件至'Download'文件夹，点击下方的扫描游戏，即可添加游戏至我的游戏。");
            this.f14580f.setVisibility(4);
        } else if (i4 == 1) {
            MobclickAgent.onEvent(getContext(), "onFindNewFile");
            setCancelable(false);
            this.f14578d.setText("新增文件提示");
            this.f14577c.setText("检测到'Download'目录下有新增zip文件，是否进行扫描识别？");
            this.f14580f.setVisibility(0);
        }
    }
}
