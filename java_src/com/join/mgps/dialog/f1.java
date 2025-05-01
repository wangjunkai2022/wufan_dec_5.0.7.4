package com.join.mgps.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathData;
import com.join.mgps.Util.UtilsMy;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
/* compiled from: ModDownloadDialog.java */
/* loaded from: classes4.dex */
public class f1 extends p implements View.OnClickListener, DialogInterface.OnShowListener {
    public static final int A = 2;
    public static final int B = 3;

    /* renamed from: y  reason: collision with root package name */
    public static final int f49379y = 0;

    /* renamed from: z  reason: collision with root package name */
    public static final int f49380z = 1;

    /* renamed from: k  reason: collision with root package name */
    TextView f49381k;

    /* renamed from: l  reason: collision with root package name */
    TextView f49382l;

    /* renamed from: m  reason: collision with root package name */
    TextView f49383m;

    /* renamed from: n  reason: collision with root package name */
    TextView f49384n;

    /* renamed from: o  reason: collision with root package name */
    TextView f49385o;

    /* renamed from: p  reason: collision with root package name */
    ProgressBar f49386p;

    /* renamed from: q  reason: collision with root package name */
    LinearLayout f49387q;

    /* renamed from: r  reason: collision with root package name */
    ImageView f49388r;

    /* renamed from: s  reason: collision with root package name */
    a f49389s;

    /* renamed from: t  reason: collision with root package name */
    private int f49390t;

    /* renamed from: u  reason: collision with root package name */
    private String f49391u;

    /* renamed from: v  reason: collision with root package name */
    private int f49392v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f49393w;

    /* renamed from: x  reason: collision with root package name */
    ModGameArchivePathData f49394x;

    /* compiled from: ModDownloadDialog.java */
    /* loaded from: classes4.dex */
    public interface a {
        void a(f1 f1Var);

        void b(f1 f1Var);
    }

    public f1(@NonNull Context context) {
        super(context, R.style.Dialog);
        this.f49390t = 0;
        this.f49392v = 1;
        this.f49393w = false;
    }

    private void A() {
        this.f49387q.setVisibility(8);
        this.f49383m.setVisibility(0);
        this.f49383m.setText("发现新版本，是否更新");
        this.f49381k.setText("忽略");
        this.f49382l.setText("立即更新");
        this.f49382l.setBackgroundResource(R.drawable.btn_mod_install);
    }

    private void B() {
        this.f49387q.setVisibility(0);
        this.f49383m.setVisibility(8);
        this.f49385o.setText("等待中");
        this.f49381k.setText("后台下载");
        this.f49382l.setText("等待中");
        this.f49382l.setBackgroundResource(R.drawable.btn_mod_stop);
    }

    private void m() {
        this.f49381k = (TextView) findViewById(R.id.tv_mod_opt_left);
        this.f49382l = (TextView) findViewById(R.id.tv_mod_opt_right);
        this.f49383m = (TextView) findViewById(R.id.tv_mod_title);
        this.f49384n = (TextView) findViewById(R.id.tv_mod_progress);
        this.f49386p = (ProgressBar) findViewById(R.id.pb_mod_progress);
        this.f49387q = (LinearLayout) findViewById(R.id.ll_mod_download);
        this.f49385o = (TextView) findViewById(R.id.tv_mod_status);
        this.f49381k.setOnClickListener(this);
        this.f49382l.setOnClickListener(this);
    }

    private void n() {
        this.f49382l = (TextView) findViewById(R.id.tv_mod_opt_right);
        this.f49388r = (ImageView) findViewById(R.id.iv_close);
        this.f49382l.setOnClickListener(this);
        this.f49388r.setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.centerText);
        ImageView imageView = (ImageView) findViewById(R.id.centerImage);
        if (this.f49394x == null) {
            textView.setText("稳定流畅");
            imageView.setImageResource(R.drawable.ic_mod_stable);
            return;
        }
        textView.setText("云存档");
        imageView.setImageResource(R.drawable.ic_mod_cloud);
    }

    private void y() {
        this.f49387q.setVisibility(0);
        this.f49383m.setVisibility(8);
        this.f49385o.setText("下载中");
        this.f49381k.setText("后台下载");
        this.f49382l.setText("暂停");
        this.f49382l.setBackgroundResource(R.drawable.btn_mod_stop);
    }

    private void z(boolean z4) {
        this.f49387q.setVisibility(8);
        this.f49383m.setVisibility(0);
        if (z4) {
            this.f49383m.setText("启动标准版需安装游戏至本地");
        } else {
            this.f49383m.setText("启动增强版需\n安装游戏至虚拟机");
        }
        this.f49381k.setText("取消");
        if (this.f49393w) {
            this.f49382l.setText("一键导入");
        } else {
            this.f49382l.setText("立即安装");
        }
        this.f49382l.setBackgroundResource(R.drawable.btn_mod_install);
    }

    public void C(int i4, boolean z4, boolean z5) {
        this.f49390t = i4;
        if (i4 != 0) {
            if (i4 == 1) {
                setContentView(R.layout.dialog_mod_download_install);
                m();
                A();
                return;
            } else if (i4 == 2) {
                setContentView(R.layout.dialog_mod_download);
                m();
                y();
                return;
            } else if (i4 != 3) {
                return;
            } else {
                setContentView(R.layout.dialog_mod_download);
                m();
                B();
                return;
            }
        }
        this.f49393w = z5;
        if (z4) {
            setContentView(R.layout.dialog_mod_download_install);
            m();
            z(z4);
            return;
        }
        setContentView(R.layout.dialog_mod_download_new);
        n();
        if (z5) {
            this.f49382l.setText("一键导入");
        } else {
            this.f49382l.setText("立即安装");
        }
        com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(getContext());
        Event event = Event.modDownloadTip;
        Ext gameId = new Ext().setGameId(this.f49391u);
        l4.O1(event, gameId.setPosition(this.f49392v + ""));
    }

    public void D(DownloadTask downloadTask) {
        if (downloadTask != null) {
            this.f49386p.setProgress((int) downloadTask.getProgress());
            long parseDouble = (long) (Double.parseDouble(downloadTask.getShowSize()) * 1000.0d * 1000.0d);
            com.join.mgps.Util.w0.e("updateStatus: " + UtilsMy.a(parseDouble));
            TextView textView = this.f49384n;
            textView.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
            int status = downloadTask.getStatus();
            if (status != 2) {
                if (status != 3) {
                    if (status == 10) {
                        this.f49385o.setText("等待中");
                        this.f49382l.setText("等待中");
                        this.f49382l.setBackgroundResource(R.drawable.btn_mod_stop);
                        return;
                    } else if (status != 27) {
                        return;
                    }
                }
                this.f49385o.setText("暂停");
                this.f49382l.setText("继续");
                this.f49382l.setBackgroundResource(R.drawable.btn_mod_install);
                return;
            }
            this.f49385o.setText("下载中");
            this.f49382l.setText("暂停");
            this.f49382l.setBackgroundResource(R.drawable.btn_mod_stop);
        }
    }

    public int o() {
        return this.f49392v;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar;
        int id = view.getId();
        if (id == R.id.tv_mod_opt_left) {
            a aVar2 = this.f49389s;
            if (aVar2 != null) {
                aVar2.b(this);
            }
        } else if (id == R.id.tv_mod_opt_right) {
            a aVar3 = this.f49389s;
            if (aVar3 != null) {
                aVar3.a(this);
            }
        } else if (id != R.id.iv_close || (aVar = this.f49389s) == null) {
        } else {
            aVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.dialog.p, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        setOnShowListener(this);
    }

    public void onShow(DialogInterface dialogInterface) {
    }

    public void p(ModGameArchivePathData modGameArchivePathData) {
        this.f49394x = modGameArchivePathData;
    }

    public void q(String str) {
        this.f49383m.setText(str);
    }

    public void r(String str) {
        this.f49391u = str;
    }

    public void s(@DrawableRes int i4) {
        this.f49381k.setBackgroundResource(i4);
    }

    public void t(String str) {
        this.f49381k.setText(str);
    }

    public void u(a aVar) {
        this.f49389s = aVar;
    }

    public void v(int i4) {
        this.f49392v = i4;
    }

    public void w(@DrawableRes int i4) {
        this.f49382l.setBackgroundResource(i4);
    }

    public void x(String str) {
        this.f49382l.setText(str);
    }
}
