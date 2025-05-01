package com.join.mgps.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.DownloadCenterActivity;
import com.join.mgps.db.tables.DownloadHistoryTable;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.db.tables.EMUUpdateTable;
import com.join.mgps.dto.DownloadCenterBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: DownloadCenterAdapter.java */
/* loaded from: classes4.dex */
public class m extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    Activity f44670c;

    /* renamed from: d  reason: collision with root package name */
    ListView f44671d;

    /* renamed from: b  reason: collision with root package name */
    String f44669b = getClass().getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    DownloadCenterBean f44672e = new DownloadCenterBean();

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44673b;

        a(DownloadTask downloadTask) {
            this.f44673b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int status = this.f44673b.getStatus();
            if (status == 5) {
                UtilsMy.W3(m.this.f44670c, this.f44673b, "1");
                return;
            }
            EMUUpdateTable eMUUpdateTable = null;
            if (status != 9) {
                if (status == 11) {
                    UtilsMy.a4(this.f44673b, m.this.f44670c);
                } else if (status != 42) {
                } else {
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("crc_sign_id", this.f44673b.getCrc_link_type_val());
                    List<EMUUpdateTable> h4 = b2.q.o().h(hashMap);
                    if (h4 != null && h4.size() > 0) {
                        eMUUpdateTable = h4.get(0);
                    }
                    DownloadTask F = p1.f.K().F(this.f44673b.getCrc_link_type_val());
                    if (F != null) {
                        this.f44673b.setId(F.getId());
                    }
                    if (eMUUpdateTable != null) {
                        this.f44673b.setVer(eMUUpdateTable.getVer());
                        this.f44673b.setVer_name(eMUUpdateTable.getVer_name());
                        this.f44673b.setUrl(eMUUpdateTable.getDown_url_remote());
                        UtilsMy.r4(m.this.f44670c, this.f44673b);
                    }
                    m.this.notifyDataSetChanged();
                }
            } else if (!com.join.android.app.common.utils.j.j(m.this.f44670c)) {
                com.join.mgps.Util.l2.a(m.this.f44670c).b("无网络连接");
            } else if (UtilsMy.o1(m.this.f44670c, this.f44673b)) {
            } else {
                if (this.f44673b.getDown_status() == 5) {
                    UtilsMy.l1(m.this.f44670c, this.f44673b);
                    return;
                }
                TextView textView = (TextView) view.findViewById(R.id.mgListviewItemInstall);
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("crc_sign_id", this.f44673b.getCrc_link_type_val());
                List<EMUUpdateTable> h5 = b2.q.o().h(hashMap2);
                if (h5 != null && h5.size() > 0) {
                    eMUUpdateTable = h5.get(0);
                }
                DownloadTask F2 = p1.f.K().F(this.f44673b.getCrc_link_type_val());
                if (F2 != null) {
                    this.f44673b.setId(F2.getId());
                }
                if (eMUUpdateTable != null) {
                    this.f44673b.setVer(eMUUpdateTable.getVer());
                    this.f44673b.setVer_name(eMUUpdateTable.getVer_name());
                    this.f44673b.setUrl(eMUUpdateTable.getDown_url_remote());
                    p1.f.K().m(this.f44673b);
                    UtilsMy.L0(p1.f.K().F(this.f44673b.getCrc_link_type_val()));
                    com.php25.PDownload.d.c(this.f44673b, m.this.f44670c);
                    textView.setBackgroundResource(R.drawable.recom_green_butn);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    public class a0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44675b;

        a0(DownloadTask downloadTask) {
            this.f44675b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(m.this.f44670c, this.f44675b);
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44677b;

        b(DownloadTask downloadTask) {
            this.f44677b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!com.join.android.app.common.utils.j.j(m.this.f44670c)) {
                com.join.mgps.Util.l2.a(m.this.f44670c).b("无网络连接");
                return;
            }
            int downloadType = this.f44677b.getDownloadType();
            if (downloadType != 0 && downloadType != 1) {
                if (downloadType != 2) {
                    return;
                }
                UtilsMy.u4(this.f44677b);
                return;
            }
            TextView textView = (TextView) view.findViewById(R.id.mgListviewItemInstall);
            m.this.c(this.f44677b);
            EMUUpdateTable eMUUpdateTable = null;
            HashMap hashMap = new HashMap(1);
            hashMap.put("crc_sign_id", this.f44677b.getCrc_link_type_val());
            List<EMUUpdateTable> h4 = b2.q.o().h(hashMap);
            if (h4 != null && h4.size() > 0) {
                eMUUpdateTable = h4.get(0);
            }
            if (eMUUpdateTable != null) {
                this.f44677b.setVer(eMUUpdateTable.getVer());
                this.f44677b.setVer_name(eMUUpdateTable.getVer_name());
                this.f44677b.setUrl(eMUUpdateTable.getDown_url_remote());
                com.php25.PDownload.d.c(this.f44677b, m.this.f44670c);
                textView.setBackgroundResource(R.drawable.recom_green_butn);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    public class b0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44679b;

        b0(DownloadTask downloadTask) {
            this.f44679b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.php25.PDownload.d.i(this.f44679b);
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44681b;

        c(DownloadTask downloadTask) {
            this.f44681b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f44681b;
            if (downloadTask == null || downloadTask.getGameZipPath() == null) {
                return;
            }
            if (new File(this.f44681b.getGameZipPath()).exists()) {
                UtilsMy.W3(m.this.f44670c, this.f44681b, "1");
                String str = m.this.f44669b;
                return;
            }
            com.php25.PDownload.d.c(this.f44681b, m.this.f44670c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    public class c0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44683b;

        c0(DownloadTask downloadTask) {
            this.f44683b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.php25.PDownload.d.l(m.this.f44670c, this.f44683b);
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44685b;

        d(DownloadTask downloadTask) {
            this.f44685b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.this.c(this.f44685b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    public class d0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44687b;

        d0(DownloadTask downloadTask) {
            this.f44687b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.php25.PDownload.d.i(this.f44687b);
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44689b;

        e(DownloadTask downloadTask) {
            this.f44689b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(m.this.f44670c, this.f44689b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    public class e0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44691b;

        e0(DownloadTask downloadTask) {
            this.f44691b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.php25.PDownload.d.c(this.f44691b, m.this.f44670c);
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44693b;

        f(DownloadTask downloadTask) {
            this.f44693b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f44693b.getFileType() == null || !this.f44693b.getFileType().equals(Dtype.chajian.name())) {
                IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(m.this.f44670c, this.f44693b);
            }
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class f0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44695b;

        f0(DownloadTask downloadTask) {
            this.f44695b = downloadTask;
        }

        void a(Context context) {
            DownloadTask downloadTask = this.f44695b;
            if (downloadTask != null && (downloadTask.getStatus() == 3 || this.f44695b.getStatus() == 1 || this.f44695b.getStatus() == 6)) {
                com.php25.PDownload.d.c(this.f44695b, context);
            }
            String crc_link_type_val = this.f44695b.getCrc_link_type_val();
            com.join.mgps.Util.l2.a(context).b("已接入专属通道，加速成功！");
            UtilsMy.l4(context, crc_link_type_val);
            UtilsMy.u2(context, crc_link_type_val);
            p1.f.K().F(crc_link_type_val);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.papa.sim.statistic.p.l(view.getContext()).O1(Event.CenterAccelerationDownload, new Ext().setGameId(this.f44695b.getCrc_link_type_val()));
            a(view.getContext());
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class g implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44697b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44698c;

        /* compiled from: DownloadCenterAdapter.java */
        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Dialog f44700b;

            a(Dialog dialog) {
                this.f44700b = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f44700b.dismiss();
            }
        }

        /* compiled from: DownloadCenterAdapter.java */
        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f44702b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Dialog f44703c;

            b(boolean z4, Dialog dialog) {
                this.f44702b = z4;
                this.f44703c = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f44702b) {
                    com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(m.this.f44670c);
                    g gVar = g.this;
                    if (l02.d(m.this.f44670c, gVar.f44698c.getPackageName())) {
                        UtilsMy.L0(g.this.f44698c);
                        com.join.android.app.common.utils.e l03 = com.join.android.app.common.utils.e.l0(m.this.f44670c);
                        g gVar2 = g.this;
                        APKUtils.a l4 = l03.l(m.this.f44670c, gVar2.f44698c.getPackageName());
                        if (l4 != null) {
                            DownloadTask downloadTask = g.this.f44698c;
                            downloadTask.setVer(l4.d() + "");
                        }
                        UtilsMy.S2(g.this.f44698c, 5);
                        m.this.f44672e.getDownloadUpdateFiles().remove(g.this.f44698c);
                        m.this.notifyDataSetChanged();
                    } else {
                        g gVar3 = g.this;
                        m.this.c(gVar3.f44698c);
                        UtilsMy.A4(m.this.f44672e.getDownloadUpdateFiles());
                        m.this.notifyDataSetChanged();
                    }
                } else {
                    g gVar4 = g.this;
                    m.this.c(gVar4.f44698c);
                    UtilsMy.A4(m.this.f44672e.getDownloadUpdateFiles());
                    m.this.notifyDataSetChanged();
                }
                this.f44703c.dismiss();
            }
        }

        g(int i4, DownloadTask downloadTask) {
            this.f44697b = i4;
            this.f44698c = downloadTask;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            boolean z4;
            com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(m.this.f44670c, R.style.MyDialog);
            oVar.setContentView(R.layout.delete_center_dialog);
            Button button = (Button) oVar.findViewById(R.id.dialog_button_cancle);
            TextView textView = (TextView) oVar.findViewById(R.id.dialog_content);
            ((TextView) oVar.findViewById(R.id.tip_title)).setText("删除任务");
            if (m.this.f44672e.getStayInstalledDownloadTasks() != null && m.this.f44672e.getStayInstalledDownloadTasks().size() != 0) {
                String fileType = m.this.f44672e.getStayInstalledDownloadTasks().size() > (this.f44697b - m.this.f44672e.getDownloadFiles().size()) + (-2) ? m.this.f44672e.getStayInstalledDownloadTasks().get((this.f44697b - m.this.f44672e.getDownloadFiles().size()) - 2).getFileType() : "";
                if (fileType != null && fileType.equals(Dtype.chajian.name())) {
                    if (com.join.android.app.common.utils.e.l0(m.this.f44670c).d(m.this.f44670c, this.f44698c.getPackageName())) {
                        textView.setText("你确定要删除该任务及已下载的安装包？");
                    }
                } else if (fileType != null && fileType.equals(Dtype.android.name())) {
                    if (com.join.android.app.common.utils.e.l0(m.this.f44670c).d(m.this.f44670c, this.f44698c.getPackageName())) {
                        textView.setText("你确定要删除该任务及已下载的安装包？");
                    }
                } else {
                    z4 = false;
                    textView.setText("你确定要删除该任务及已下载的安装包？");
                    button.setOnClickListener(new a(oVar));
                    Button button2 = (Button) oVar.findViewById(R.id.dialog_button_ok);
                    button2.setText("删除");
                    button2.setOnClickListener(new b(z4, oVar));
                    oVar.show();
                }
                z4 = true;
                textView.setText("你确定要删除该任务及已下载的安装包？");
                button.setOnClickListener(new a(oVar));
                Button button22 = (Button) oVar.findViewById(R.id.dialog_button_ok);
                button22.setText("删除");
                button22.setOnClickListener(new b(z4, oVar));
                oVar.show();
            }
            return true;
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class g0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44705b;

        g0(DownloadTask downloadTask) {
            this.f44705b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(m.this.f44670c, this.f44705b);
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44707b;

        h(DownloadTask downloadTask) {
            this.f44707b = downloadTask;
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00bb -> B:28:0x00be). Please submit an issue!!! */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int status = this.f44707b.getStatus();
            if (status != 5) {
                if (status == 9) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("tag_id", this.f44707b.getCrc_link_type_val());
                    List<EMUApkTable> h4 = b2.p.o().h(hashMap);
                    if (!com.join.android.app.common.utils.j.j(m.this.f44670c)) {
                        com.join.mgps.Util.l2.a(m.this.f44670c).b("无网络连接");
                        return;
                    }
                    if (h4.size() > 0) {
                        m.this.j(h4.get(0));
                    }
                    m.this.f44672e.getDownloadUpdateFiles().remove(this.f44707b);
                    m.this.notifyDataSetChanged();
                    return;
                } else if (status != 11) {
                    return;
                }
            }
            try {
                if (new File(this.f44707b.getGameZipPath()).exists()) {
                    if (this.f44707b.getDown_type() != 2) {
                        com.join.android.app.common.utils.e.l0(m.this.f44670c).x(m.this.f44670c, this.f44707b.getGameZipPath());
                    } else {
                        com.join.android.app.common.servcie.i.e().q(m.this.f44670c, this.f44707b);
                    }
                } else {
                    com.php25.PDownload.d.a(this.f44707b);
                    this.f44707b.setStatus(0);
                    com.php25.PDownload.d.c(this.f44707b, m.this.f44670c);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class h0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44709b;

        h0(DownloadTask downloadTask) {
            this.f44709b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f44709b.getFileType() == null || !this.f44709b.getFileType().equals(Dtype.chajian.name())) {
                IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(m.this.f44670c, this.f44709b);
            }
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44711b;

        i(DownloadTask downloadTask) {
            this.f44711b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int status = this.f44711b.getStatus();
            if (status == 5) {
                UtilsMy.W3(m.this.f44670c, this.f44711b, "1");
                return;
            }
            EMUUpdateTable eMUUpdateTable = null;
            if (status != 9) {
                if (status == 11) {
                    UtilsMy.a4(this.f44711b, m.this.f44670c);
                } else if (status != 42) {
                } else {
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("crc_sign_id", this.f44711b.getCrc_link_type_val());
                    List<EMUUpdateTable> h4 = b2.q.o().h(hashMap);
                    if (h4 != null && h4.size() > 0) {
                        eMUUpdateTable = h4.get(0);
                    }
                    DownloadTask F = p1.f.K().F(this.f44711b.getCrc_link_type_val());
                    if (F != null) {
                        this.f44711b.setId(F.getId());
                    }
                    if (eMUUpdateTable != null) {
                        this.f44711b.setVer(eMUUpdateTable.getVer());
                        this.f44711b.setVer_name(eMUUpdateTable.getVer_name());
                        this.f44711b.setUrl(eMUUpdateTable.getDown_url_remote());
                        UtilsMy.r4(m.this.f44670c, this.f44711b);
                    }
                    m.this.notifyDataSetChanged();
                }
            } else if (!com.join.android.app.common.utils.j.j(m.this.f44670c)) {
                com.join.mgps.Util.l2.a(m.this.f44670c).b("无网络连接");
            } else if (UtilsMy.o1(m.this.f44670c, this.f44711b)) {
            } else {
                if (this.f44711b.getDown_status() == 5) {
                    UtilsMy.l1(m.this.f44670c, this.f44711b);
                    return;
                }
                TextView textView = (TextView) view.findViewById(R.id.mgListviewItemInstall);
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("crc_sign_id", this.f44711b.getCrc_link_type_val());
                List<EMUUpdateTable> h5 = b2.q.o().h(hashMap2);
                if (h5 != null && h5.size() > 0) {
                    eMUUpdateTable = h5.get(0);
                }
                DownloadTask F2 = p1.f.K().F(this.f44711b.getCrc_link_type_val());
                if (F2 != null) {
                    this.f44711b.setId(F2.getId());
                }
                if (eMUUpdateTable != null) {
                    this.f44711b.setVer(eMUUpdateTable.getVer());
                    this.f44711b.setVer_name(eMUUpdateTable.getVer_name());
                    this.f44711b.setUrl(eMUUpdateTable.getDown_url_remote());
                    p1.f.K().m(this.f44711b);
                    UtilsMy.L0(p1.f.K().F(this.f44711b.getCrc_link_type_val()));
                    com.php25.PDownload.d.c(this.f44711b, m.this.f44670c);
                    textView.setBackgroundResource(R.drawable.recom_green_butn);
                }
                m.this.f44672e.getDownloadUpdateFiles().remove(this.f44711b);
                m.this.notifyDataSetChanged();
            }
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class i0 implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44713b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44714c;

        /* compiled from: DownloadCenterAdapter.java */
        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Dialog f44716b;

            a(Dialog dialog) {
                this.f44716b = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f44716b.dismiss();
            }
        }

        /* compiled from: DownloadCenterAdapter.java */
        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f44718b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Dialog f44719c;

            b(boolean z4, Dialog dialog) {
                this.f44718b = z4;
                this.f44719c = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f44718b) {
                    com.join.android.app.common.utils.e l02 = com.join.android.app.common.utils.e.l0(m.this.f44670c);
                    i0 i0Var = i0.this;
                    if (l02.d(m.this.f44670c, i0Var.f44714c.getPackageName())) {
                        UtilsMy.L0(i0.this.f44714c);
                        com.join.android.app.common.utils.e l03 = com.join.android.app.common.utils.e.l0(m.this.f44670c);
                        i0 i0Var2 = i0.this;
                        APKUtils.a l4 = l03.l(m.this.f44670c, i0Var2.f44714c.getPackageName());
                        if (l4 != null) {
                            DownloadTask downloadTask = i0.this.f44714c;
                            downloadTask.setVer(l4.d() + "");
                        }
                        UtilsMy.S2(i0.this.f44714c, 5);
                        m.this.f44672e.getStayInstalledDownloadTasks().remove(i0.this.f44714c);
                        m.this.notifyDataSetChanged();
                    } else {
                        i0 i0Var3 = i0.this;
                        m.this.c(i0Var3.f44714c);
                        UtilsMy.A4(m.this.f44672e.getStayInstalledDownloadTasks());
                        m.this.notifyDataSetChanged();
                    }
                } else {
                    i0 i0Var4 = i0.this;
                    m.this.c(i0Var4.f44714c);
                    UtilsMy.A4(m.this.f44672e.getStayInstalledDownloadTasks());
                    m.this.notifyDataSetChanged();
                }
                this.f44719c.dismiss();
            }
        }

        i0(int i4, DownloadTask downloadTask) {
            this.f44713b = i4;
            this.f44714c = downloadTask;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(m.this.f44670c, R.style.MyDialog);
            oVar.setContentView(R.layout.delete_center_dialog);
            Button button = (Button) oVar.findViewById(R.id.dialog_button_cancle);
            TextView textView = (TextView) oVar.findViewById(R.id.dialog_content);
            ((TextView) oVar.findViewById(R.id.tip_title)).setText("删除任务");
            if (m.this.f44672e.getStayInstalledDownloadTasks() != null && m.this.f44672e.getStayInstalledDownloadTasks().size() != 0) {
                String fileType = m.this.f44672e.getStayInstalledDownloadTasks().get((this.f44713b - m.this.f44672e.getDownloadFiles().size()) - 2).getFileType();
                boolean z4 = false;
                if (fileType != null && fileType.equals(Dtype.chajian.name())) {
                    if (com.join.android.app.common.utils.e.l0(m.this.f44670c).d(m.this.f44670c, this.f44714c.getPackageName())) {
                        textView.setText("你确定要删除该任务及已下载的安装包？");
                        z4 = true;
                    }
                    textView.setText("你确定要删除该任务及已下载的安装包？");
                    button.setOnClickListener(new a(oVar));
                    Button button2 = (Button) oVar.findViewById(R.id.dialog_button_ok);
                    button2.setText("删除");
                    button2.setOnClickListener(new b(z4, oVar));
                    oVar.show();
                } else {
                    if (fileType != null && fileType.equals(Dtype.android.name())) {
                        if (com.join.android.app.common.utils.e.l0(m.this.f44670c).d(m.this.f44670c, this.f44714c.getPackageName())) {
                            textView.setText("你确定要删除该任务及已下载的安装包？");
                        }
                        z4 = true;
                    }
                    textView.setText("你确定要删除该任务及已下载的安装包？");
                    button.setOnClickListener(new a(oVar));
                    Button button22 = (Button) oVar.findViewById(R.id.dialog_button_ok);
                    button22.setText("删除");
                    button22.setOnClickListener(new b(z4, oVar));
                    oVar.show();
                }
            }
            return true;
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44721b;

        j(DownloadTask downloadTask) {
            this.f44721b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!com.join.android.app.common.utils.j.j(m.this.f44670c)) {
                com.join.mgps.Util.l2.a(m.this.f44670c).b("无网络连接");
                return;
            }
            int downloadType = this.f44721b.getDownloadType();
            if (downloadType != 0 && downloadType != 1) {
                if (downloadType != 2) {
                    return;
                }
                UtilsMy.u4(this.f44721b);
                return;
            }
            TextView textView = (TextView) view.findViewById(R.id.mgListviewItemInstall);
            m.this.c(this.f44721b);
            EMUUpdateTable eMUUpdateTable = null;
            HashMap hashMap = new HashMap(1);
            hashMap.put("crc_sign_id", this.f44721b.getCrc_link_type_val());
            List<EMUUpdateTable> h4 = b2.q.o().h(hashMap);
            if (h4 != null && h4.size() > 0) {
                eMUUpdateTable = h4.get(0);
            }
            if (eMUUpdateTable != null) {
                this.f44721b.setVer(eMUUpdateTable.getVer());
                this.f44721b.setVer_name(eMUUpdateTable.getVer_name());
                this.f44721b.setUrl(eMUUpdateTable.getDown_url_remote());
                com.php25.PDownload.d.c(this.f44721b, m.this.f44670c);
                textView.setBackgroundResource(R.drawable.recom_green_butn);
            }
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class j0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44723b;

        j0(DownloadTask downloadTask) {
            this.f44723b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(4);
            intentDateBean.setLink_type_val(this.f44723b.getUrl());
            IntentUtil.getInstance().intentActivity(m.this.f44670c, intentDateBean);
            UtilsMy.t4(m.this.f44670c, this.f44723b.getCrc_link_type_val());
            UtilsMy.T1(m.this.f44670c, 12, this.f44723b.getCrc_link_type_val());
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class k0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44726b;

        k0(DownloadTask downloadTask) {
            this.f44726b = downloadTask;
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a5 -> B:27:0x00a8). Please submit an issue!!! */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int status = this.f44726b.getStatus();
            if (status != 5) {
                if (status == 9) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("tag_id", this.f44726b.getCrc_link_type_val());
                    List<EMUApkTable> h4 = b2.p.o().h(hashMap);
                    if (!com.join.android.app.common.utils.j.j(m.this.f44670c)) {
                        com.join.mgps.Util.l2.a(m.this.f44670c).b("无网络连接");
                        return;
                    } else if (h4.size() > 0) {
                        m.this.j(h4.get(0));
                        return;
                    } else {
                        return;
                    }
                } else if (status != 11) {
                    return;
                }
            }
            try {
                if (new File(this.f44726b.getGameZipPath()).exists()) {
                    if (com.join.android.app.common.utils.l.I(m.this.f44670c, this.f44726b, null)) {
                        UtilsMy.S2(this.f44726b, 5);
                    } else {
                        com.join.android.app.common.utils.e.l0(m.this.f44670c).x(m.this.f44670c, this.f44726b.getGameZipPath());
                    }
                } else {
                    com.php25.PDownload.d.a(this.f44726b);
                    this.f44726b.setStatus(0);
                    com.php25.PDownload.d.c(this.f44726b, m.this.f44670c);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44728b;

        l(DownloadTask downloadTask) {
            this.f44728b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f44728b;
            if (downloadTask == null || downloadTask.getGameZipPath() == null) {
                return;
            }
            if (new File(this.f44728b.getGameZipPath()).exists()) {
                UtilsMy.W3(m.this.f44670c, this.f44728b, "1");
                String str = m.this.f44669b;
                return;
            }
            com.php25.PDownload.d.c(this.f44728b, m.this.f44670c);
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class l0 {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f44730a;

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f44731b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f44732c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f44733d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f44734e;

        /* renamed from: f  reason: collision with root package name */
        public LinearLayout f44735f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f44736g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f44737h;

        /* renamed from: i  reason: collision with root package name */
        public LinearLayout f44738i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f44739j;

        /* renamed from: k  reason: collision with root package name */
        RelativeLayout f44740k;

        l0() {
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* renamed from: com.join.mgps.adapter.m$m  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class View$OnClickListenerC0342m implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44742b;

        View$OnClickListenerC0342m(DownloadTask downloadTask) {
            this.f44742b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.this.c(this.f44742b);
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class m0 {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f44744a;

        /* renamed from: b  reason: collision with root package name */
        public ImageView f44745b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f44746c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f44747d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f44748e;

        /* renamed from: f  reason: collision with root package name */
        public LinearLayout f44749f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f44750g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f44751h;

        /* renamed from: i  reason: collision with root package name */
        public LinearLayout f44752i;

        /* renamed from: j  reason: collision with root package name */
        public ImageView f44753j;

        m0() {
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class n implements View.OnClickListener {

        /* compiled from: DownloadCenterAdapter.java */
        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Dialog f44756b;

            a(Dialog dialog) {
                this.f44756b = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f44756b.dismiss();
            }
        }

        /* compiled from: DownloadCenterAdapter.java */
        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Dialog f44758b;

            b(Dialog dialog) {
                this.f44758b = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                b2.k.n().a();
                m.this.f44672e.setHistoryDownloadFiles(null);
                m.this.notifyDataSetChanged();
                ((DownloadCenterActivity) m.this.f44670c).r0();
                this.f44758b.dismiss();
            }
        }

        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(m.this.f44670c, R.style.MyDialog);
            oVar.setContentView(R.layout.delete_center_dialog);
            ((TextView) oVar.findViewById(R.id.tip_title)).setText("删除任务");
            ((TextView) oVar.findViewById(R.id.dialog_content)).setText("你确定要清空所有下载历史？");
            ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setOnClickListener(new a(oVar));
            Button button = (Button) oVar.findViewById(R.id.dialog_button_ok);
            button.setText("清空历史");
            button.setOnClickListener(new b(oVar));
            oVar.show();
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class n0 {

        /* renamed from: a  reason: collision with root package name */
        public TextView f44760a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f44761b;

        /* renamed from: c  reason: collision with root package name */
        public LinearLayout f44762c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f44763d;

        /* renamed from: e  reason: collision with root package name */
        private LinearLayout f44764e;

        n0() {
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (DownloadTask downloadTask : p1.f.K().x()) {
                if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.chajian.name())) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("tag_id", downloadTask.getCrc_link_type_val());
                    List<EMUApkTable> h4 = b2.p.o().h(hashMap);
                    if (!com.join.android.app.common.utils.j.j(m.this.f44670c)) {
                        com.join.mgps.Util.l2.a(m.this.f44670c).b("无网络连接");
                        return;
                    }
                    if (h4.size() > 0) {
                        UtilsMy.q1(h4.get(0), m.this.f44670c);
                    }
                    Iterator<DownloadTask> it2 = m.this.f44672e.getDownloadUpdateFiles().iterator();
                    while (it2 != null && it2.hasNext()) {
                        if (it2.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                            it2.remove();
                        }
                    }
                } else if (downloadTask.getFileType() != null && downloadTask.getFileType().equals(Dtype.android.name())) {
                    if (!com.join.android.app.common.utils.j.j(m.this.f44670c)) {
                        com.join.mgps.Util.l2.a(m.this.f44670c).b("无网络连接");
                        return;
                    }
                    EMUUpdateTable eMUUpdateTable = null;
                    HashMap hashMap2 = new HashMap(1);
                    hashMap2.put("crc_sign_id", downloadTask.getCrc_link_type_val());
                    List<EMUUpdateTable> h5 = b2.q.o().h(hashMap2);
                    if (h5 != null && h5.size() > 0) {
                        eMUUpdateTable = h5.get(0);
                    }
                    DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
                    if (F != null) {
                        downloadTask.setId(F.getId());
                    }
                    if (eMUUpdateTable != null) {
                        downloadTask.setVer(eMUUpdateTable.getVer());
                        downloadTask.setVer_name(eMUUpdateTable.getVer_name());
                        downloadTask.setUrl(eMUUpdateTable.getDown_url_remote());
                        p1.f.K().m(downloadTask);
                        UtilsMy.L0(p1.f.K().F(downloadTask.getCrc_link_type_val()));
                        com.php25.PDownload.d.c(downloadTask, m.this.f44670c);
                    }
                    Iterator<DownloadTask> it3 = m.this.f44672e.getDownloadUpdateFiles().iterator();
                    while (it3 != null && it3.hasNext()) {
                        if (it3.next().getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                            it3.remove();
                        }
                    }
                }
            }
            m.this.notifyDataSetChanged();
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    public class o0 {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f44767a;

        /* renamed from: b  reason: collision with root package name */
        public ImageView f44768b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f44769c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f44770d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f44771e;

        /* renamed from: f  reason: collision with root package name */
        public LinearLayout f44772f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f44773g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f44774h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f44775i;

        /* renamed from: j  reason: collision with root package name */
        public ProgressBar f44776j;

        /* renamed from: k  reason: collision with root package name */
        public ProgressBar f44777k;

        /* renamed from: l  reason: collision with root package name */
        public LinearLayout f44778l;

        /* renamed from: m  reason: collision with root package name */
        public View f44779m;

        /* renamed from: n  reason: collision with root package name */
        RelativeLayout f44780n;

        public o0() {
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class p implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44782b;

        p(DownloadTask downloadTask) {
            this.f44782b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(m.this.f44670c, this.f44782b);
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class p0 {

        /* renamed from: a  reason: collision with root package name */
        public TextView f44784a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f44785b;

        /* renamed from: c  reason: collision with root package name */
        public LinearLayout f44786c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f44787d;

        /* renamed from: e  reason: collision with root package name */
        private LinearLayout f44788e;

        p0() {
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class q implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44790b;

        q(DownloadTask downloadTask) {
            this.f44790b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f44790b.getFileType() == null || !this.f44790b.getFileType().equals(Dtype.chajian.name())) {
                IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(m.this.f44670c, this.f44790b);
            }
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class q0 {

        /* renamed from: a  reason: collision with root package name */
        public TextView f44792a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f44793b;

        /* renamed from: c  reason: collision with root package name */
        public LinearLayout f44794c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f44795d;

        /* renamed from: e  reason: collision with root package name */
        private LinearLayout f44796e;

        q0() {
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class r implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44798b;

        /* compiled from: DownloadCenterAdapter.java */
        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Dialog f44800b;

            a(Dialog dialog) {
                this.f44800b = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f44800b.dismiss();
            }
        }

        /* compiled from: DownloadCenterAdapter.java */
        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Dialog f44802b;

            b(Dialog dialog) {
                this.f44802b = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DownloadHistoryTable p4 = b2.k.n().p(r.this.f44798b.getCrc_link_type_val());
                if (p4 != null) {
                    b2.k.n().delete((b2.k) p4);
                    m.this.f44672e.getHistoryDownloadFiles().remove(r.this.f44798b);
                    m.this.notifyDataSetChanged();
                    ((DownloadCenterActivity) m.this.f44670c).r0();
                }
                this.f44802b.dismiss();
            }
        }

        r(DownloadTask downloadTask) {
            this.f44798b = downloadTask;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(m.this.f44670c, R.style.MyDialog);
            oVar.setContentView(R.layout.delete_center_dialog);
            ((TextView) oVar.findViewById(R.id.tip_title)).setText("删除任务");
            ((TextView) oVar.findViewById(R.id.dialog_content)).setText("你确定要删除该历史记录？");
            ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setOnClickListener(new a(oVar));
            Button button = (Button) oVar.findViewById(R.id.dialog_button_ok);
            button.setText("删除");
            button.setOnClickListener(new b(oVar));
            oVar.show();
            return true;
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class s implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44804b;

        s(DownloadTask downloadTask) {
            this.f44804b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int status = this.f44804b.getStatus();
            if (status == 5) {
                try {
                    if (new File(this.f44804b.getGameZipPath()).exists()) {
                        com.join.android.app.common.utils.e.l0(m.this.f44670c).x(m.this.f44670c, this.f44804b.getGameZipPath());
                    } else {
                        com.php25.PDownload.d.a(this.f44804b);
                        this.f44804b.setStatus(0);
                        com.php25.PDownload.d.c(this.f44804b, m.this.f44670c);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } else if (status != 9) {
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("tag_id", this.f44804b.getCrc_link_type_val());
                List<EMUApkTable> h4 = b2.p.o().h(hashMap);
                if (!com.join.android.app.common.utils.j.j(m.this.f44670c)) {
                    com.join.mgps.Util.l2.a(m.this.f44670c).b("无网络连接");
                } else if (h4.size() > 0) {
                    m.this.f44672e.getHistoryDownloadFiles().remove(this.f44804b);
                    m.this.notifyDataSetChanged();
                    m.this.j(h4.get(0));
                }
            }
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class t implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44806b;

        t(DownloadTask downloadTask) {
            this.f44806b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int status = this.f44806b.getStatus();
            if (status == 5) {
                UtilsMy.W3(m.this.f44670c, this.f44806b, "1");
                return;
            }
            EMUUpdateTable eMUUpdateTable = null;
            if (status != 9) {
                if (status == 11) {
                    UtilsMy.a4(this.f44806b, m.this.f44670c);
                } else if (status != 42) {
                } else {
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("crc_sign_id", this.f44806b.getCrc_link_type_val());
                    List<EMUUpdateTable> h4 = b2.q.o().h(hashMap);
                    if (h4 != null && h4.size() > 0) {
                        eMUUpdateTable = h4.get(0);
                    }
                    DownloadTask F = p1.f.K().F(this.f44806b.getCrc_link_type_val());
                    if (F != null) {
                        this.f44806b.setId(F.getId());
                    }
                    if (eMUUpdateTable != null) {
                        this.f44806b.setVer(eMUUpdateTable.getVer());
                        this.f44806b.setVer_name(eMUUpdateTable.getVer_name());
                        this.f44806b.setUrl(eMUUpdateTable.getDown_url_remote());
                        UtilsMy.r4(m.this.f44670c, this.f44806b);
                    }
                    m.this.notifyDataSetChanged();
                }
            } else if (!com.join.android.app.common.utils.j.j(m.this.f44670c)) {
                com.join.mgps.Util.l2.a(m.this.f44670c).b("无网络连接");
            } else if (UtilsMy.o1(m.this.f44670c, this.f44806b)) {
            } else {
                if (this.f44806b.getDown_status() == 5) {
                    UtilsMy.l1(m.this.f44670c, this.f44806b);
                    return;
                }
                TextView textView = (TextView) view.findViewById(R.id.mgListviewItemInstall);
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("crc_sign_id", this.f44806b.getCrc_link_type_val());
                List<EMUUpdateTable> h5 = b2.q.o().h(hashMap2);
                if (h5 != null && h5.size() > 0) {
                    eMUUpdateTable = h5.get(0);
                }
                DownloadTask F2 = p1.f.K().F(this.f44806b.getCrc_link_type_val());
                if (F2 != null) {
                    this.f44806b.setId(F2.getId());
                }
                if (eMUUpdateTable != null) {
                    this.f44806b.setVer(eMUUpdateTable.getVer());
                    this.f44806b.setVer_name(eMUUpdateTable.getVer_name());
                    this.f44806b.setUrl(eMUUpdateTable.getDown_url_remote());
                    p1.f.K().m(this.f44806b);
                    UtilsMy.L0(p1.f.K().F(this.f44806b.getCrc_link_type_val()));
                    m.this.f44672e.getHistoryDownloadFiles().remove(this.f44806b);
                    DownloadHistoryTable p4 = b2.k.n().p(this.f44806b.getCrc_link_type_val());
                    if (p4 != null) {
                        b2.k.n().delete((b2.k) p4);
                    }
                    m.this.notifyDataSetChanged();
                    ((DownloadCenterActivity) m.this.f44670c).r0();
                    com.php25.PDownload.d.c(this.f44806b, m.this.f44670c);
                    textView.setBackgroundResource(R.drawable.recom_green_butn);
                }
            }
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class u implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44808b;

        u(DownloadTask downloadTask) {
            this.f44808b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!com.join.android.app.common.utils.j.j(m.this.f44670c)) {
                com.join.mgps.Util.l2.a(m.this.f44670c).b("无网络连接");
                return;
            }
            int downloadType = this.f44808b.getDownloadType();
            if (downloadType != 0 && downloadType != 1) {
                if (downloadType != 2) {
                    return;
                }
                UtilsMy.u4(this.f44808b);
                return;
            }
            TextView textView = (TextView) view.findViewById(R.id.mgListviewItemInstall);
            m.this.c(this.f44808b);
            EMUUpdateTable eMUUpdateTable = null;
            HashMap hashMap = new HashMap(1);
            hashMap.put("crc_sign_id", this.f44808b.getCrc_link_type_val());
            List<EMUUpdateTable> h4 = b2.q.o().h(hashMap);
            if (h4 != null && h4.size() > 0) {
                eMUUpdateTable = h4.get(0);
            }
            if (eMUUpdateTable != null) {
                this.f44808b.setVer(eMUUpdateTable.getVer());
                this.f44808b.setVer_name(eMUUpdateTable.getVer_name());
                this.f44808b.setUrl(eMUUpdateTable.getDown_url_remote());
                com.php25.PDownload.d.c(this.f44808b, m.this.f44670c);
                textView.setBackgroundResource(R.drawable.recom_green_butn);
            }
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class v implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44810b;

        v(int i4) {
            this.f44810b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (m.this.f44672e.getDownloadFiles().size() == 0) {
                    return;
                }
                DownloadTask downloadTask = m.this.f44672e.getDownloadFiles().get(this.f44810b - 1);
                downloadTask.set_from_type(128);
                if (downloadTask.getFileType() == null || !downloadTask.getFileType().equals(Dtype.chajian.name())) {
                    IntentUtil.getInstance().goGameDetialActivityBYDownloadTAsk(m.this.f44670c, downloadTask);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class w implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44812b;

        /* compiled from: DownloadCenterAdapter.java */
        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Dialog f44814b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ DownloadTask f44815c;

            a(Dialog dialog, DownloadTask downloadTask) {
                this.f44814b = dialog;
                this.f44815c = downloadTask;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                this.f44814b.dismiss();
                if (this.f44815c.getStatus() == 12 || this.f44815c.getStatus() == 13 || this.f44815c.getStatus() == 5 || this.f44815c.getStatus() == 11) {
                    return;
                }
                com.php25.PDownload.d.c(this.f44815c, m.this.f44670c);
            }
        }

        /* compiled from: DownloadCenterAdapter.java */
        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f44817b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ DownloadTask f44818c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Dialog f44819d;

            b(boolean z4, DownloadTask downloadTask, Dialog dialog) {
                this.f44817b = z4;
                this.f44818c = downloadTask;
                this.f44819d = dialog;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f44817b) {
                    if (com.join.android.app.common.utils.e.l0(m.this.f44670c).d(m.this.f44670c, this.f44818c.getPackageName())) {
                        UtilsMy.L0(this.f44818c);
                        APKUtils.a l4 = com.join.android.app.common.utils.e.l0(m.this.f44670c).l(m.this.f44670c, this.f44818c.getPackageName());
                        if (l4 != null) {
                            DownloadTask downloadTask = this.f44818c;
                            downloadTask.setVer(l4.d() + "");
                        }
                        UtilsMy.S2(this.f44818c, 5);
                        m.this.f44672e.getDownloadFiles().remove(this.f44818c);
                        m.this.notifyDataSetChanged();
                    } else {
                        m.this.a(this.f44818c);
                    }
                } else {
                    m.this.a(this.f44818c);
                }
                this.f44819d.dismiss();
            }
        }

        w(int i4) {
            this.f44812b = i4;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            DownloadTask downloadTask;
            com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(m.this.f44670c, R.style.MyDialog);
            oVar.setContentView(R.layout.delete_center_dialog);
            Button button = (Button) oVar.findViewById(R.id.dialog_button_cancle);
            Button button2 = (Button) oVar.findViewById(R.id.dialog_button_ok);
            ((TextView) oVar.findViewById(R.id.tip_title)).setText("删除任务");
            button2.setText("删除");
            TextView textView = (TextView) oVar.findViewById(R.id.dialog_content);
            boolean z4 = false;
            if (m.this.f44672e.getDownloadFiles() != null && m.this.f44672e.getDownloadFiles().size() > 1) {
                if (m.this.f44672e.getDownloadFiles().size() > this.f44812b - 1) {
                    downloadTask = m.this.f44672e.getDownloadFiles().get(this.f44812b - 1);
                }
                downloadTask = null;
            } else {
                if (m.this.f44672e.getDownloadFiles() != null && m.this.f44672e.getDownloadFiles().size() > 0) {
                    downloadTask = m.this.f44672e.getDownloadFiles().get(0);
                }
                downloadTask = null;
            }
            if (downloadTask == null) {
                return true;
            }
            if (m.this.getCount() > this.f44812b - 1) {
                String fileType = downloadTask.getFileType();
                if (fileType != null && fileType.equals(Dtype.chajian.name())) {
                    if (com.join.android.app.common.utils.e.l0(m.this.f44670c).d(m.this.f44670c, downloadTask.getPackageName()) && downloadTask.getStatus() == 5) {
                        textView.setText("你确定要删除该任务及已下载的本地文件？");
                        z4 = true;
                    }
                } else if (fileType != null && fileType.equals(Dtype.android.name())) {
                    if (com.join.android.app.common.utils.e.l0(m.this.f44670c).d(m.this.f44670c, downloadTask.getPackageName())) {
                        textView.setText("你确定要删除该任务及已下载的本地文件？");
                    }
                    z4 = true;
                }
            }
            textView.setText("你确定要删除该任务及已下载的本地文件？");
            button.setOnClickListener(new a(oVar, downloadTask));
            button2.setOnClickListener(new b(z4, downloadTask, oVar));
            if (downloadTask.getStatus() != 12 && downloadTask.getStatus() != 13) {
                com.php25.PDownload.d.i(downloadTask);
            }
            oVar.show();
            return true;
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class x implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44821b;

        x(DownloadTask downloadTask) {
            this.f44821b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DownloadTask downloadTask = this.f44821b;
            if (downloadTask == null || downloadTask.getGameZipPath() == null) {
                return;
            }
            if (new File(this.f44821b.getGameZipPath()).exists()) {
                UtilsMy.W3(m.this.f44670c, this.f44821b, "1");
                String str = m.this.f44669b;
                return;
            }
            com.php25.PDownload.d.c(this.f44821b, m.this.f44670c);
        }
    }

    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    class y implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44823b;

        y(DownloadTask downloadTask) {
            this.f44823b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.this.c(this.f44823b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DownloadCenterAdapter.java */
    /* loaded from: classes4.dex */
    public class z implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f44825b;

        z(DownloadTask downloadTask) {
            this.f44825b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.this.a(this.f44825b);
            Activity activity = m.this.f44670c;
            Toast.makeText(activity, "删除应用程序   " + this.f44825b.getShowName(), 1).show();
        }
    }

    public m(Activity activity) {
        this.f44670c = activity;
    }

    private void e(DownloadTask downloadTask, o0 o0Var) {
        downloadTask.set_from_type(128);
        MyImageLoader.h(o0Var.f44767a, downloadTask.getPortraitURL());
        o0Var.f44769c.setText(downloadTask.getShowName());
        if (downloadTask.getGift_package_switch() == 1) {
            o0Var.f44768b.setVisibility(0);
        } else {
            o0Var.f44768b.setVisibility(8);
        }
        if (downloadTask.getRomType() != null && downloadTask.getFileType().equals(Dtype.chajian.name()) && com.join.mgps.Util.g2.h(downloadTask.getPortraitURL())) {
            o0Var.f44767a.setImageResource(R.drawable.papa_chajian_icon);
        }
        if (downloadTask.getSize() == 0) {
            downloadTask.setSize(p1.f.K().F(downloadTask.getCrc_link_type_val()).getSize());
        }
        o0Var.f44776j.setProgress((int) downloadTask.getProgress());
        StringBuilder sb = new StringBuilder();
        sb.append("progressBar=");
        sb.append(o0Var.f44776j.getProgress());
        sb.append(";name=");
        sb.append(downloadTask.getShowName());
        sb.append(downloadTask.getPath());
        sb.append(";");
        sb.append(downloadTask.getSize());
        o0Var.f44772f.setOnClickListener(new z(downloadTask));
        o0Var.f44774h.setOnClickListener(new a0(downloadTask));
        long parseDouble = (long) (Double.parseDouble(!TextUtils.isEmpty(downloadTask.getShowSize()) ? downloadTask.getShowSize() : "0") * 1024.0d * 1024.0d);
        TextView textView = o0Var.f44770d;
        textView.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
        if (downloadTask.getSize() == 0) {
            if (!TextUtils.isEmpty(downloadTask.getShowSize()) && !downloadTask.getShowSize().contains("-")) {
                o0Var.f44770d.setVisibility(0);
            } else {
                o0Var.f44770d.setVisibility(4);
            }
        } else if (downloadTask.getSize() <= 0) {
            o0Var.f44770d.setVisibility(4);
        } else {
            o0Var.f44770d.setVisibility(0);
        }
        if (downloadTask.getStatus() == 2) {
            o0Var.f44776j.setVisibility(0);
            o0Var.f44777k.setVisibility(8);
            UtilsMy.x4(downloadTask);
            o0Var.f44775i.setBackgroundResource(R.drawable.recom_blue_butn);
            o0Var.f44775i.setText("暂停");
            o0Var.f44775i.setTextColor(this.f44670c.getResources().getColor(R.color.app_blue_color));
            String speed = downloadTask.getSpeed();
            TextView textView2 = o0Var.f44771e;
            textView2.setText(speed + "/S");
            o0Var.f44776j.setProgress((int) downloadTask.getProgress());
            o0Var.f44780n.setOnClickListener(new b0(downloadTask));
        } else if (downloadTask.getStatus() == 27) {
            o0Var.f44775i.setText("暂停中");
        } else if (downloadTask.getStatus() == 12) {
            TextView textView3 = o0Var.f44770d;
            textView3.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
            o0Var.f44771e.setText("解压中..");
            o0Var.f44776j.setVisibility(8);
            o0Var.f44777k.setVisibility(0);
            o0Var.f44777k.setProgress((int) downloadTask.getProgress());
            o0Var.f44780n.setOnClickListener(null);
            o0Var.f44775i.setBackgroundResource(R.drawable.extract);
            o0Var.f44775i.setText("解压中");
            o0Var.f44775i.setTextColor(this.f44670c.getResources().getColor(R.color.app_grey_color));
        } else if (downloadTask.getStatus() == 13) {
            TextView textView4 = o0Var.f44770d;
            textView4.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
            o0Var.f44771e.setText("请点击按钮重新解压");
            o0Var.f44776j.setVisibility(8);
            o0Var.f44777k.setVisibility(0);
            o0Var.f44777k.setProgress((int) downloadTask.getProgress());
            o0Var.f44775i.setBackgroundResource(R.drawable.reextract);
            o0Var.f44775i.setText("解压");
            o0Var.f44775i.setTextColor(this.f44670c.getResources().getColor(R.color.app_blue_color));
            o0Var.f44780n.setOnClickListener(new c0(downloadTask));
        } else if (downloadTask.getStatus() == 10) {
            o0Var.f44776j.setVisibility(0);
            o0Var.f44777k.setVisibility(8);
            o0Var.f44771e.setText("等待中");
            o0Var.f44775i.setBackgroundResource(R.drawable.recom_blue_butn);
            o0Var.f44775i.setText("等待");
            o0Var.f44775i.setTextColor(this.f44670c.getResources().getColor(R.color.app_blue_color));
            o0Var.f44780n.setOnClickListener(new d0(downloadTask));
        } else {
            o0Var.f44776j.setVisibility(0);
            o0Var.f44777k.setVisibility(8);
            o0Var.f44771e.setText("暂停中");
            o0Var.f44775i.setBackgroundResource(R.drawable.recom_blue_butn);
            o0Var.f44775i.setText("继续");
            o0Var.f44775i.setTextColor(this.f44670c.getResources().getColor(R.color.app_blue_color));
            o0Var.f44776j.setProgress((int) downloadTask.getProgress());
            o0Var.f44780n.setOnClickListener(new e0(downloadTask));
        }
    }

    public void a(DownloadTask downloadTask) {
        try {
            if (downloadTask.getStatus() == 9) {
                com.php25.PDownload.d.b(downloadTask);
            } else {
                com.php25.PDownload.d.a(downloadTask);
            }
            try {
                if (downloadTask.getRomType().equals(Dtype.androidobb.name()) || downloadTask.getRomType().equals(Dtype.androiddata.name()) || downloadTask.getRomType().equals(Dtype.androidobbdata.name())) {
                    UtilsMy.delete(new File(com.join.mgps.Util.v.f28116p, downloadTask.getPackageName()));
                    UtilsMy.delete(new File(com.join.mgps.Util.v.f28117q, downloadTask.getPackageName()));
                    UtilsMy.delete(new File(downloadTask.getGameZipPath()));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            this.f44672e.getDownloadFiles().remove(downloadTask);
            UtilsMy.A4(this.f44672e.getDownloadFiles());
            notifyDataSetChanged();
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    boolean b(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return false;
        }
        if (UtilsMy.h2(this.f44670c, downloadTask.getCrc_link_type_val()) || new PrefDef_(this.f44670c).downloadSpeedUpGameSize().d().intValue() > downloadTask.getActual_size()) {
            return false;
        }
        return TextUtils.isEmpty(downloadTask.getFileType()) || !downloadTask.getFileType().equals(Dtype.chajian.name());
    }

    public void c(DownloadTask downloadTask) {
        com.php25.PDownload.d.a(downloadTask);
        try {
            if (downloadTask.getRomType().equals(Dtype.androidobb.name()) || downloadTask.getRomType().equals(Dtype.androiddata.name()) || downloadTask.getRomType().equals(Dtype.androidobbdata.name())) {
                UtilsMy.delete(new File(com.join.mgps.Util.v.f28116p, downloadTask.getPackageName()));
                UtilsMy.delete(new File(com.join.mgps.Util.v.f28117q, downloadTask.getPackageName()));
                UtilsMy.delete(new File(downloadTask.getGameZipPath()));
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f44672e.getStayInstalledDownloadTasks().remove(downloadTask);
        notifyDataSetChanged();
    }

    public void d(List<DownloadTask> list, String str) {
        for (DownloadTask downloadTask : list) {
            if (downloadTask.getStatus() == 10) {
                if (downloadTask.getStatus() == 9 && downloadTask.getDownloadType() == 1) {
                    com.php25.PDownload.d.b(downloadTask);
                } else if (downloadTask.getStatus() != 5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("downloadTask.getStatus()=");
                    sb.append(downloadTask.getStatus());
                    com.php25.PDownload.d.a(downloadTask);
                }
            }
        }
        for (DownloadTask downloadTask2 : list) {
            if (downloadTask2.getStatus() == 9 && downloadTask2.getDownloadType() == 1) {
                com.php25.PDownload.d.b(downloadTask2);
            } else if (downloadTask2.getStatus() != 5 && downloadTask2.getStatus() != 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("downloadTask.getStatus()=");
                sb2.append(downloadTask2.getStatus());
                com.php25.PDownload.d.a(downloadTask2);
            }
        }
        if (str.equals("deleteFromRunning")) {
            this.f44672e.getDownloadFiles().clear();
        } else if (str.equals("deleteFromInstall")) {
            this.f44672e.getStayInstalledDownloadTasks().clear();
        }
        notifyDataSetChanged();
    }

    public DownloadCenterBean f() {
        return this.f44672e;
    }

    public ListView g() {
        return this.f44671d;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        int size = this.f44672e.getStayInstalledDownloadTasks().size();
        int size2 = this.f44672e.getDownloadFiles().size();
        return size + size2 + this.f44672e.getHistoryDownloadFiles().size() + this.f44672e.getDownloadUpdateFiles().size() + 4;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        if (i4 <= 0 || i4 > this.f44672e.getDownloadFiles().size()) {
            return null;
        }
        return this.f44672e.getDownloadFiles().get(i4 - 1);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (i4 <= this.f44672e.getDownloadFiles().size()) {
            return 1;
        }
        if (i4 == this.f44672e.getDownloadFiles().size() + 1) {
            return 2;
        }
        if (i4 < this.f44672e.getDownloadFiles().size() + this.f44672e.getStayInstalledDownloadTasks().size() + 2) {
            return 3;
        }
        if (i4 == this.f44672e.getDownloadFiles().size() + this.f44672e.getStayInstalledDownloadTasks().size() + 2) {
            return 6;
        }
        if (i4 < this.f44672e.getDownloadFiles().size() + this.f44672e.getStayInstalledDownloadTasks().size() + 3 + this.f44672e.getDownloadUpdateFiles().size()) {
            return 7;
        }
        return i4 == ((this.f44672e.getDownloadFiles().size() + this.f44672e.getStayInstalledDownloadTasks().size()) + 3) + this.f44672e.getDownloadUpdateFiles().size() ? 4 : 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0136: MOVE  (r11 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:19:0x0135 */
    /* JADX WARN: Removed duplicated region for block: B:144:0x070b A[Catch: Exception -> 0x007c, TRY_LEAVE, TryCatch #0 {Exception -> 0x007c, blocks: (B:8:0x0034, B:59:0x02de, B:61:0x032d, B:62:0x0335, B:65:0x033e, B:67:0x0373, B:69:0x0379, B:70:0x0390, B:73:0x03a0, B:75:0x03e3, B:76:0x03eb, B:79:0x03fb, B:92:0x0498, B:94:0x04c0, B:96:0x04df, B:141:0x06fe, B:97:0x0513, B:99:0x0519, B:101:0x0529, B:103:0x053a, B:105:0x056b, B:107:0x0579, B:109:0x0587, B:118:0x05dd, B:116:0x059e, B:117:0x05be, B:108:0x057f, B:104:0x0543, B:119:0x05e9, B:121:0x05ef, B:123:0x05ff, B:135:0x0685, B:132:0x0619, B:133:0x0639, B:134:0x0659, B:136:0x0690, B:138:0x06c4, B:140:0x06f8, B:139:0x06ee, B:144:0x070b, B:157:0x07b4, B:159:0x07dc, B:161:0x07ec, B:163:0x07fd, B:165:0x082e, B:167:0x083c, B:169:0x084a, B:180:0x0930, B:168:0x0842, B:164:0x0806, B:170:0x087c, B:172:0x0882, B:174:0x0892, B:175:0x08c2, B:177:0x08f6, B:179:0x092a, B:178:0x0920, B:183:0x093d, B:185:0x098e, B:186:0x0996, B:189:0x099f, B:191:0x09f0, B:192:0x09f8, B:195:0x0a01, B:209:0x0ab4, B:211:0x0adc, B:213:0x0aec, B:215:0x0afd, B:217:0x0b2e, B:219:0x0b3c, B:221:0x0b4a, B:228:0x0b9c, B:251:0x0ca6, B:226:0x0b5d, B:227:0x0b7d, B:220:0x0b42, B:216:0x0b06, B:229:0x0ba8, B:231:0x0bae, B:233:0x0bbe, B:245:0x0c44, B:242:0x0bd8, B:243:0x0bf8, B:244:0x0c18, B:246:0x0c4f, B:248:0x0c83, B:250:0x0ca0, B:249:0x0c96, B:22:0x0145, B:32:0x01a1), top: B:261:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x093d A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:8:0x0034, B:59:0x02de, B:61:0x032d, B:62:0x0335, B:65:0x033e, B:67:0x0373, B:69:0x0379, B:70:0x0390, B:73:0x03a0, B:75:0x03e3, B:76:0x03eb, B:79:0x03fb, B:92:0x0498, B:94:0x04c0, B:96:0x04df, B:141:0x06fe, B:97:0x0513, B:99:0x0519, B:101:0x0529, B:103:0x053a, B:105:0x056b, B:107:0x0579, B:109:0x0587, B:118:0x05dd, B:116:0x059e, B:117:0x05be, B:108:0x057f, B:104:0x0543, B:119:0x05e9, B:121:0x05ef, B:123:0x05ff, B:135:0x0685, B:132:0x0619, B:133:0x0639, B:134:0x0659, B:136:0x0690, B:138:0x06c4, B:140:0x06f8, B:139:0x06ee, B:144:0x070b, B:157:0x07b4, B:159:0x07dc, B:161:0x07ec, B:163:0x07fd, B:165:0x082e, B:167:0x083c, B:169:0x084a, B:180:0x0930, B:168:0x0842, B:164:0x0806, B:170:0x087c, B:172:0x0882, B:174:0x0892, B:175:0x08c2, B:177:0x08f6, B:179:0x092a, B:178:0x0920, B:183:0x093d, B:185:0x098e, B:186:0x0996, B:189:0x099f, B:191:0x09f0, B:192:0x09f8, B:195:0x0a01, B:209:0x0ab4, B:211:0x0adc, B:213:0x0aec, B:215:0x0afd, B:217:0x0b2e, B:219:0x0b3c, B:221:0x0b4a, B:228:0x0b9c, B:251:0x0ca6, B:226:0x0b5d, B:227:0x0b7d, B:220:0x0b42, B:216:0x0b06, B:229:0x0ba8, B:231:0x0bae, B:233:0x0bbe, B:245:0x0c44, B:242:0x0bd8, B:243:0x0bf8, B:244:0x0c18, B:246:0x0c4f, B:248:0x0c83, B:250:0x0ca0, B:249:0x0c96, B:22:0x0145, B:32:0x01a1), top: B:261:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x099f A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:8:0x0034, B:59:0x02de, B:61:0x032d, B:62:0x0335, B:65:0x033e, B:67:0x0373, B:69:0x0379, B:70:0x0390, B:73:0x03a0, B:75:0x03e3, B:76:0x03eb, B:79:0x03fb, B:92:0x0498, B:94:0x04c0, B:96:0x04df, B:141:0x06fe, B:97:0x0513, B:99:0x0519, B:101:0x0529, B:103:0x053a, B:105:0x056b, B:107:0x0579, B:109:0x0587, B:118:0x05dd, B:116:0x059e, B:117:0x05be, B:108:0x057f, B:104:0x0543, B:119:0x05e9, B:121:0x05ef, B:123:0x05ff, B:135:0x0685, B:132:0x0619, B:133:0x0639, B:134:0x0659, B:136:0x0690, B:138:0x06c4, B:140:0x06f8, B:139:0x06ee, B:144:0x070b, B:157:0x07b4, B:159:0x07dc, B:161:0x07ec, B:163:0x07fd, B:165:0x082e, B:167:0x083c, B:169:0x084a, B:180:0x0930, B:168:0x0842, B:164:0x0806, B:170:0x087c, B:172:0x0882, B:174:0x0892, B:175:0x08c2, B:177:0x08f6, B:179:0x092a, B:178:0x0920, B:183:0x093d, B:185:0x098e, B:186:0x0996, B:189:0x099f, B:191:0x09f0, B:192:0x09f8, B:195:0x0a01, B:209:0x0ab4, B:211:0x0adc, B:213:0x0aec, B:215:0x0afd, B:217:0x0b2e, B:219:0x0b3c, B:221:0x0b4a, B:228:0x0b9c, B:251:0x0ca6, B:226:0x0b5d, B:227:0x0b7d, B:220:0x0b42, B:216:0x0b06, B:229:0x0ba8, B:231:0x0bae, B:233:0x0bbe, B:245:0x0c44, B:242:0x0bd8, B:243:0x0bf8, B:244:0x0c18, B:246:0x0c4f, B:248:0x0c83, B:250:0x0ca0, B:249:0x0c96, B:22:0x0145, B:32:0x01a1), top: B:261:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0a01 A[Catch: Exception -> 0x007c, TRY_LEAVE, TryCatch #0 {Exception -> 0x007c, blocks: (B:8:0x0034, B:59:0x02de, B:61:0x032d, B:62:0x0335, B:65:0x033e, B:67:0x0373, B:69:0x0379, B:70:0x0390, B:73:0x03a0, B:75:0x03e3, B:76:0x03eb, B:79:0x03fb, B:92:0x0498, B:94:0x04c0, B:96:0x04df, B:141:0x06fe, B:97:0x0513, B:99:0x0519, B:101:0x0529, B:103:0x053a, B:105:0x056b, B:107:0x0579, B:109:0x0587, B:118:0x05dd, B:116:0x059e, B:117:0x05be, B:108:0x057f, B:104:0x0543, B:119:0x05e9, B:121:0x05ef, B:123:0x05ff, B:135:0x0685, B:132:0x0619, B:133:0x0639, B:134:0x0659, B:136:0x0690, B:138:0x06c4, B:140:0x06f8, B:139:0x06ee, B:144:0x070b, B:157:0x07b4, B:159:0x07dc, B:161:0x07ec, B:163:0x07fd, B:165:0x082e, B:167:0x083c, B:169:0x084a, B:180:0x0930, B:168:0x0842, B:164:0x0806, B:170:0x087c, B:172:0x0882, B:174:0x0892, B:175:0x08c2, B:177:0x08f6, B:179:0x092a, B:178:0x0920, B:183:0x093d, B:185:0x098e, B:186:0x0996, B:189:0x099f, B:191:0x09f0, B:192:0x09f8, B:195:0x0a01, B:209:0x0ab4, B:211:0x0adc, B:213:0x0aec, B:215:0x0afd, B:217:0x0b2e, B:219:0x0b3c, B:221:0x0b4a, B:228:0x0b9c, B:251:0x0ca6, B:226:0x0b5d, B:227:0x0b7d, B:220:0x0b42, B:216:0x0b06, B:229:0x0ba8, B:231:0x0bae, B:233:0x0bbe, B:245:0x0c44, B:242:0x0bd8, B:243:0x0bf8, B:244:0x0c18, B:246:0x0c4f, B:248:0x0c83, B:250:0x0ca0, B:249:0x0c96, B:22:0x0145, B:32:0x01a1), top: B:261:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02de A[Catch: Exception -> 0x007c, TRY_ENTER, TryCatch #0 {Exception -> 0x007c, blocks: (B:8:0x0034, B:59:0x02de, B:61:0x032d, B:62:0x0335, B:65:0x033e, B:67:0x0373, B:69:0x0379, B:70:0x0390, B:73:0x03a0, B:75:0x03e3, B:76:0x03eb, B:79:0x03fb, B:92:0x0498, B:94:0x04c0, B:96:0x04df, B:141:0x06fe, B:97:0x0513, B:99:0x0519, B:101:0x0529, B:103:0x053a, B:105:0x056b, B:107:0x0579, B:109:0x0587, B:118:0x05dd, B:116:0x059e, B:117:0x05be, B:108:0x057f, B:104:0x0543, B:119:0x05e9, B:121:0x05ef, B:123:0x05ff, B:135:0x0685, B:132:0x0619, B:133:0x0639, B:134:0x0659, B:136:0x0690, B:138:0x06c4, B:140:0x06f8, B:139:0x06ee, B:144:0x070b, B:157:0x07b4, B:159:0x07dc, B:161:0x07ec, B:163:0x07fd, B:165:0x082e, B:167:0x083c, B:169:0x084a, B:180:0x0930, B:168:0x0842, B:164:0x0806, B:170:0x087c, B:172:0x0882, B:174:0x0892, B:175:0x08c2, B:177:0x08f6, B:179:0x092a, B:178:0x0920, B:183:0x093d, B:185:0x098e, B:186:0x0996, B:189:0x099f, B:191:0x09f0, B:192:0x09f8, B:195:0x0a01, B:209:0x0ab4, B:211:0x0adc, B:213:0x0aec, B:215:0x0afd, B:217:0x0b2e, B:219:0x0b3c, B:221:0x0b4a, B:228:0x0b9c, B:251:0x0ca6, B:226:0x0b5d, B:227:0x0b7d, B:220:0x0b42, B:216:0x0b06, B:229:0x0ba8, B:231:0x0bae, B:233:0x0bbe, B:245:0x0c44, B:242:0x0bd8, B:243:0x0bf8, B:244:0x0c18, B:246:0x0c4f, B:248:0x0c83, B:250:0x0ca0, B:249:0x0c96, B:22:0x0145, B:32:0x01a1), top: B:261:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033e A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:8:0x0034, B:59:0x02de, B:61:0x032d, B:62:0x0335, B:65:0x033e, B:67:0x0373, B:69:0x0379, B:70:0x0390, B:73:0x03a0, B:75:0x03e3, B:76:0x03eb, B:79:0x03fb, B:92:0x0498, B:94:0x04c0, B:96:0x04df, B:141:0x06fe, B:97:0x0513, B:99:0x0519, B:101:0x0529, B:103:0x053a, B:105:0x056b, B:107:0x0579, B:109:0x0587, B:118:0x05dd, B:116:0x059e, B:117:0x05be, B:108:0x057f, B:104:0x0543, B:119:0x05e9, B:121:0x05ef, B:123:0x05ff, B:135:0x0685, B:132:0x0619, B:133:0x0639, B:134:0x0659, B:136:0x0690, B:138:0x06c4, B:140:0x06f8, B:139:0x06ee, B:144:0x070b, B:157:0x07b4, B:159:0x07dc, B:161:0x07ec, B:163:0x07fd, B:165:0x082e, B:167:0x083c, B:169:0x084a, B:180:0x0930, B:168:0x0842, B:164:0x0806, B:170:0x087c, B:172:0x0882, B:174:0x0892, B:175:0x08c2, B:177:0x08f6, B:179:0x092a, B:178:0x0920, B:183:0x093d, B:185:0x098e, B:186:0x0996, B:189:0x099f, B:191:0x09f0, B:192:0x09f8, B:195:0x0a01, B:209:0x0ab4, B:211:0x0adc, B:213:0x0aec, B:215:0x0afd, B:217:0x0b2e, B:219:0x0b3c, B:221:0x0b4a, B:228:0x0b9c, B:251:0x0ca6, B:226:0x0b5d, B:227:0x0b7d, B:220:0x0b42, B:216:0x0b06, B:229:0x0ba8, B:231:0x0bae, B:233:0x0bbe, B:245:0x0c44, B:242:0x0bd8, B:243:0x0bf8, B:244:0x0c18, B:246:0x0c4f, B:248:0x0c83, B:250:0x0ca0, B:249:0x0c96, B:22:0x0145, B:32:0x01a1), top: B:261:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03a0 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:8:0x0034, B:59:0x02de, B:61:0x032d, B:62:0x0335, B:65:0x033e, B:67:0x0373, B:69:0x0379, B:70:0x0390, B:73:0x03a0, B:75:0x03e3, B:76:0x03eb, B:79:0x03fb, B:92:0x0498, B:94:0x04c0, B:96:0x04df, B:141:0x06fe, B:97:0x0513, B:99:0x0519, B:101:0x0529, B:103:0x053a, B:105:0x056b, B:107:0x0579, B:109:0x0587, B:118:0x05dd, B:116:0x059e, B:117:0x05be, B:108:0x057f, B:104:0x0543, B:119:0x05e9, B:121:0x05ef, B:123:0x05ff, B:135:0x0685, B:132:0x0619, B:133:0x0639, B:134:0x0659, B:136:0x0690, B:138:0x06c4, B:140:0x06f8, B:139:0x06ee, B:144:0x070b, B:157:0x07b4, B:159:0x07dc, B:161:0x07ec, B:163:0x07fd, B:165:0x082e, B:167:0x083c, B:169:0x084a, B:180:0x0930, B:168:0x0842, B:164:0x0806, B:170:0x087c, B:172:0x0882, B:174:0x0892, B:175:0x08c2, B:177:0x08f6, B:179:0x092a, B:178:0x0920, B:183:0x093d, B:185:0x098e, B:186:0x0996, B:189:0x099f, B:191:0x09f0, B:192:0x09f8, B:195:0x0a01, B:209:0x0ab4, B:211:0x0adc, B:213:0x0aec, B:215:0x0afd, B:217:0x0b2e, B:219:0x0b3c, B:221:0x0b4a, B:228:0x0b9c, B:251:0x0ca6, B:226:0x0b5d, B:227:0x0b7d, B:220:0x0b42, B:216:0x0b06, B:229:0x0ba8, B:231:0x0bae, B:233:0x0bbe, B:245:0x0c44, B:242:0x0bd8, B:243:0x0bf8, B:244:0x0c18, B:246:0x0c4f, B:248:0x0c83, B:250:0x0ca0, B:249:0x0c96, B:22:0x0145, B:32:0x01a1), top: B:261:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03fb A[Catch: Exception -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x007c, blocks: (B:8:0x0034, B:59:0x02de, B:61:0x032d, B:62:0x0335, B:65:0x033e, B:67:0x0373, B:69:0x0379, B:70:0x0390, B:73:0x03a0, B:75:0x03e3, B:76:0x03eb, B:79:0x03fb, B:92:0x0498, B:94:0x04c0, B:96:0x04df, B:141:0x06fe, B:97:0x0513, B:99:0x0519, B:101:0x0529, B:103:0x053a, B:105:0x056b, B:107:0x0579, B:109:0x0587, B:118:0x05dd, B:116:0x059e, B:117:0x05be, B:108:0x057f, B:104:0x0543, B:119:0x05e9, B:121:0x05ef, B:123:0x05ff, B:135:0x0685, B:132:0x0619, B:133:0x0639, B:134:0x0659, B:136:0x0690, B:138:0x06c4, B:140:0x06f8, B:139:0x06ee, B:144:0x070b, B:157:0x07b4, B:159:0x07dc, B:161:0x07ec, B:163:0x07fd, B:165:0x082e, B:167:0x083c, B:169:0x084a, B:180:0x0930, B:168:0x0842, B:164:0x0806, B:170:0x087c, B:172:0x0882, B:174:0x0892, B:175:0x08c2, B:177:0x08f6, B:179:0x092a, B:178:0x0920, B:183:0x093d, B:185:0x098e, B:186:0x0996, B:189:0x099f, B:191:0x09f0, B:192:0x09f8, B:195:0x0a01, B:209:0x0ab4, B:211:0x0adc, B:213:0x0aec, B:215:0x0afd, B:217:0x0b2e, B:219:0x0b3c, B:221:0x0b4a, B:228:0x0b9c, B:251:0x0ca6, B:226:0x0b5d, B:227:0x0b7d, B:220:0x0b42, B:216:0x0b06, B:229:0x0ba8, B:231:0x0bae, B:233:0x0bbe, B:245:0x0c44, B:242:0x0bd8, B:243:0x0bf8, B:244:0x0c18, B:246:0x0c4f, B:248:0x0c83, B:250:0x0ca0, B:249:0x0c96, B:22:0x0145, B:32:0x01a1), top: B:261:0x0023 }] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r28, android.view.View r29, android.view.ViewGroup r30) {
        /*
            Method dump skipped, instructions count: 3257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.m.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 8;
    }

    public void h(String str) {
    }

    public void i(ListView listView) {
        this.f44671d = listView;
    }

    void j(EMUApkTable eMUApkTable) {
        DownloadTask Z = p1.f.K().Z(Integer.parseInt(eMUApkTable.getTag_id()));
        if (Z != null && com.join.android.app.common.utils.l.i(eMUApkTable)) {
            com.join.android.app.common.utils.l.e(eMUApkTable, Z);
        }
        UtilsMy.q1(eMUApkTable, this.f44670c);
    }
}
