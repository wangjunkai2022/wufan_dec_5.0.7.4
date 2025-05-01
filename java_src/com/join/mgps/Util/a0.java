package com.join.mgps.Util;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.AndroidPermissionDialogActivity;
import com.join.mgps.activity.AppDownFinishDialogActivity;
import com.join.mgps.activity.DiscoveryPaiweiActivity_;
import com.join.mgps.activity.EndGameActivity_;
import com.join.mgps.activity.EndGameDetailActivity_;
import com.join.mgps.activity.EndGameLaunchActivity_;
import com.join.mgps.activity.InstallAppDialogActivity;
import com.join.mgps.activity.PrivateDomainDefaultActivity_;
import com.join.mgps.activity.PrivateDomainDownloadActivity_;
import com.join.mgps.db.tables.EMUApkTable;
import com.join.mgps.dialog.CustomerAlertDialog;
import com.join.mgps.dialog.PlugUpdateDialog_;
import com.join.mgps.dialog.b;
import com.join.mgps.dialog.n0;
import com.join.mgps.dto.AndroidPermissionParams;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.CouponsData;
import com.join.mgps.dto.DomainInfoBean;
import com.join.mgps.dto.ModFeedbackBean;
import com.join.mgps.dto.OnlineCouponConfigBean;
import com.join.mgps.dto.PdAdCfgBean;
import com.join.mgps.dto.WxProgram;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.service.CommonService_;
import java.util.List;
import org.androidannotations.annotations.EBean;
/* compiled from: DialogUtil.java */
@EBean(scope = EBean.Scope.Singleton)
/* loaded from: classes3.dex */
public class a0 {

    /* renamed from: j  reason: collision with root package name */
    private static final String f27531j = "customer_alert";

    /* renamed from: a  reason: collision with root package name */
    Dialog f27532a;

    /* renamed from: b  reason: collision with root package name */
    AlertDialog.Builder f27533b = null;

    /* renamed from: c  reason: collision with root package name */
    com.join.mgps.dialog.m1 f27534c;

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.dialog.q1 f27535d;

    /* renamed from: e  reason: collision with root package name */
    com.join.mgps.dialog.p1 f27536e;

    /* renamed from: f  reason: collision with root package name */
    InstallAppDialogActivity f27537f;

    /* renamed from: g  reason: collision with root package name */
    private com.join.mgps.dialog.u1 f27538g;

    /* renamed from: h  reason: collision with root package name */
    private com.join.android.app.common.dialog.c f27539h;

    /* renamed from: i  reason: collision with root package name */
    private com.join.mgps.dialog.q f27540i;

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class a implements DialogInterface.OnCancelListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f27541b;

        a(n0 n0Var) {
            this.f27541b = n0Var;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            n0 n0Var = this.f27541b;
            if (n0Var != null) {
                n0Var.onCancel();
            }
        }
    }

    /* compiled from: DialogUtil.java */
    /* renamed from: com.join.mgps.Util.a0$a0  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class View$OnClickListenerC0324a0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27543b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f27544c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f27545d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f27546e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ CheckBox f27547f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ EMUApkTable f27548g;

        View$OnClickListenerC0324a0(com.join.mgps.customview.o oVar, Context context, String str, String str2, CheckBox checkBox, EMUApkTable eMUApkTable) {
            this.f27543b = oVar;
            this.f27544c = context;
            this.f27545d = str;
            this.f27546e = str2;
            this.f27547f = checkBox;
            this.f27548g = eMUApkTable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f27543b.dismiss();
            IntentUtil.getInstance().goGameMainActivity(this.f27544c, this.f27545d, this.f27546e);
            if (this.f27547f.isChecked()) {
                try {
                    EMUApkTable eMUApkTable = this.f27548g;
                    eMUApkTable.setNotUpdateversion(Integer.parseInt(eMUApkTable.getVer().split("_")[0]));
                    b2.p.o().update(this.f27548g);
                } catch (NumberFormatException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class b implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27550a;

        b(Context context) {
            this.f27550a = context;
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickCancleButn(com.join.mgps.dialog.b bVar) {
            bVar.dismiss();
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickOKButn(com.join.mgps.dialog.b bVar) {
            IntentUtil.getInstance().goAccountUpgradeActivity(this.f27550a);
            bVar.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class b0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27552b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ EMUApkTable f27553c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f27554d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckBox f27555e;

        b0(com.join.mgps.customview.o oVar, EMUApkTable eMUApkTable, Context context, CheckBox checkBox) {
            this.f27552b = oVar;
            this.f27553c = eMUApkTable;
            this.f27554d = context;
            this.f27555e = checkBox;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.customview.o oVar = this.f27552b;
            if (oVar != null && oVar.isShowing()) {
                this.f27552b.dismiss();
            }
            UtilsMy.q1(this.f27553c, this.f27554d);
            if (this.f27555e.isChecked()) {
                try {
                    EMUApkTable eMUApkTable = this.f27553c;
                    eMUApkTable.setNotUpdateversion(Integer.parseInt(eMUApkTable.getVer().split("_")[0]));
                    b2.p.o().update(this.f27553c);
                } catch (NumberFormatException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27557b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommonGameInfoBean f27558c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27559d;

        c(Context context, CommonGameInfoBean commonGameInfoBean, com.join.mgps.customview.o oVar) {
            this.f27557b = context;
            this.f27558c = commonGameInfoBean;
            this.f27559d = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!com.join.android.app.common.utils.j.j(this.f27557b)) {
                l2.a(this.f27557b).b("无网络连接");
                return;
            }
            UtilsMy.D2(this.f27557b, this.f27558c.getDownloadTask().getCrc_link_type_val(), this.f27558c);
            com.join.mgps.customview.o oVar = this.f27559d;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27559d.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public class c0 implements DialogInterface.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f27561b;

        c0(n0 n0Var) {
            this.f27561b = n0Var;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            a0.this.f27538g = null;
            n0 n0Var = this.f27561b;
            if (n0Var != null) {
                n0Var.onDismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27563b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommonGameInfoBean f27564c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27565d;

        d(Context context, CommonGameInfoBean commonGameInfoBean, com.join.mgps.customview.o oVar) {
            this.f27563b = context;
            this.f27564c = commonGameInfoBean;
            this.f27565d = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UtilsMy.T3(this.f27563b, this.f27564c.getDownloadTask());
            com.join.mgps.customview.o oVar = this.f27565d;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27565d.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public class d0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27567b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f27568c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f27569d;

        /* compiled from: DialogUtil.java */
        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d0 d0Var = d0.this;
                w1.b(d0Var.f27567b, d0Var.f27568c, d0Var.f27569d, a0.this.f27539h.c());
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.c(d0.this.f27569d));
            }
        }

        d0(Context context, String str, String str2) {
            this.f27567b = context;
            this.f27568c = str;
            this.f27569d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                a0.this.f27539h.dismiss();
            } catch (Exception unused) {
            }
            new Handler().postDelayed(new a(), 200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27572b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27573c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27574d;

        e(Context context, DownloadTask downloadTask, com.join.mgps.customview.o oVar) {
            this.f27572b = context;
            this.f27573c = downloadTask;
            this.f27574d = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!com.join.android.app.common.utils.j.j(this.f27572b)) {
                l2.a(this.f27572b).b("无网络连接");
                return;
            }
            UtilsMy.E2(this.f27572b, this.f27573c);
            com.join.mgps.customview.o oVar = this.f27574d;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27574d.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public class e0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PrefDef_ f27576b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27577c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f27578d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f27579e;

        e0(PrefDef_ prefDef_, DownloadTask downloadTask, Context context, String str) {
            this.f27576b = prefDef_;
            this.f27577c = downloadTask;
            this.f27578d = context;
            this.f27579e = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                a0.this.f27539h.dismiss();
            } catch (Exception unused) {
            }
            String d5 = this.f27576b.isNoShowAddShortcut().d();
            if (!g2.h(d5)) {
                if (!d5.contains(this.f27577c.getCrc_link_type_val())) {
                    d5 = d5 + "," + this.f27577c.getCrc_link_type_val();
                }
            } else {
                d5 = this.f27577c.getCrc_link_type_val();
            }
            this.f27576b.isNoShowAddShortcut().g(d5);
            this.f27577c.setNotCheckAddShortcut(true);
            UtilsMy.V3(this.f27578d, this.f27577c, 0, this.f27579e);
            if (a0.this.f27539h != null) {
                try {
                    a0.this.f27539h.dismiss();
                } catch (Exception unused2) {
                }
            }
            this.f27577c.setNotCheckAddShortcut(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27581b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DownloadTask f27582c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27583d;

        f(Context context, DownloadTask downloadTask, com.join.mgps.customview.o oVar) {
            this.f27581b = context;
            this.f27582c = downloadTask;
            this.f27583d = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UtilsMy.T3(this.f27581b, this.f27582c);
            com.join.mgps.customview.o oVar = this.f27583d;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27583d.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public class f0 extends x1.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27585a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27586b;

        f0(Context context, String str) {
            this.f27585a = context;
            this.f27586b = str;
        }

        @Override // x1.a, w1.a
        public void b(Activity activity) {
            super.b(activity);
            activity.finish();
        }

        @Override // x1.a, w1.a
        public void c(Activity activity) {
            super.c(activity);
            ((CommonService_.h2) CommonService_.S2(this.f27585a).extra("gameDownloadDetail2", this.f27586b)).a();
            activity.finish();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class g implements b.c {
        g() {
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickCancleButn(com.join.mgps.dialog.b bVar) {
            bVar.dismiss();
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickOKButn(com.join.mgps.dialog.b bVar) {
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public class g0 implements DialogInterface.OnKeyListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f27589b;

        g0(n0 n0Var) {
            this.f27589b = n0Var;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
            n0 n0Var = this.f27589b;
            if (n0Var != null) {
                return n0Var.a(dialogInterface, i4, keyEvent);
            }
            return false;
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class h implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27591a;

        h(Context context) {
            this.f27591a = context;
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickCancleButn(com.join.mgps.dialog.b bVar) {
            bVar.dismiss();
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickOKButn(com.join.mgps.dialog.b bVar) {
            Context context = this.f27591a;
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
            bVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public class h0 implements DialogInterface.OnCancelListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f27593b;

        h0(n0 n0Var) {
            this.f27593b = n0Var;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            n0 n0Var = this.f27593b;
            if (n0Var != null) {
                n0Var.onCancel();
            }
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class i implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27595a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o0 f27596b;

        i(Context context, o0 o0Var) {
            this.f27595a = context;
            this.f27596b = o0Var;
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickCancleButn(com.join.mgps.dialog.b bVar) {
            bVar.dismiss();
            o0 o0Var = this.f27596b;
            if (o0Var != null) {
                o0Var.a();
            }
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickOKButn(com.join.mgps.dialog.b bVar) {
            IntentUtil.getInstance().goAccountUpgradeActivity(this.f27595a);
            bVar.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class i0 implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27598a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f27599b;

        i0(Context context, n0 n0Var) {
            this.f27598a = context;
            this.f27599b = n0Var;
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickCancleButn(com.join.mgps.dialog.b bVar) {
            n0 n0Var = this.f27599b;
            if (n0Var != null) {
                n0Var.onCancel();
            }
            bVar.dismiss();
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickOKButn(com.join.mgps.dialog.b bVar) {
            IntentUtil.getInstance().goAccountUpgradeActivity(this.f27598a);
            bVar.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27601b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o0 f27602c;

        j(com.join.mgps.customview.o oVar, o0 o0Var) {
            this.f27601b = oVar;
            this.f27602c = o0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.customview.o oVar = this.f27601b;
            if (oVar != null && oVar.isShowing()) {
                this.f27601b.dismiss();
            }
            o0 o0Var = this.f27602c;
            if (o0Var != null) {
                o0Var.a();
            }
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class j0 implements DialogInterface.OnKeyListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f27604b;

        j0(n0 n0Var) {
            this.f27604b = n0Var;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
            n0 n0Var = this.f27604b;
            if (n0Var != null) {
                return n0Var.a(dialogInterface, i4, keyEvent);
            }
            return false;
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class k implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27606b;

        k(Context context) {
            this.f27606b = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.f27606b.getPackageName(), null));
            this.f27606b.startActivity(intent);
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class k0 implements DialogInterface.OnCancelListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f27608b;

        k0(n0 n0Var) {
            this.f27608b = n0Var;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            n0 n0Var = this.f27608b;
            if (n0Var != null) {
                n0Var.onCancel();
            }
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27610b;

        l(com.join.mgps.customview.o oVar) {
            this.f27610b = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goAccountUpgradeActivity(view.getContext());
            com.join.mgps.customview.o oVar = this.f27610b;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27610b.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class l0 implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f27613b;

        l0(Context context, n0 n0Var) {
            this.f27612a = context;
            this.f27613b = n0Var;
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickCancleButn(com.join.mgps.dialog.b bVar) {
            n0 n0Var = this.f27613b;
            if (n0Var != null) {
                n0Var.onCancel();
            }
            bVar.dismiss();
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickOKButn(com.join.mgps.dialog.b bVar) {
            IntentUtil.getInstance().goShareWebActivity(this.f27612a, "http://anv3cjapi.5fun.com/member/battle_kick/index");
            n0 n0Var = this.f27613b;
            if (n0Var != null) {
                n0Var.onDismiss();
            }
            bVar.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class m implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27615b;

        m(com.join.mgps.customview.o oVar) {
            this.f27615b = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.customview.o oVar = this.f27615b;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27615b.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class m0 implements DialogInterface.OnKeyListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f27617b;

        m0(n0 n0Var) {
            this.f27617b = n0Var;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i4, KeyEvent keyEvent) {
            n0 n0Var = this.f27617b;
            if (n0Var != null) {
                return n0Var.a(dialogInterface, i4, keyEvent);
            }
            return false;
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class n implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27619b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27620c;

        n(Context context, com.join.mgps.customview.o oVar) {
            this.f27619b = context;
            this.f27620c = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goVip(this.f27619b);
            com.join.mgps.customview.o oVar = this.f27620c;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27620c.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public interface n0 {
        boolean a(DialogInterface dialogInterface, int i4, KeyEvent keyEvent);

        void onCancel();

        void onDismiss();
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class o implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27622b;

        o(com.join.mgps.customview.o oVar) {
            this.f27622b = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.customview.o oVar = this.f27622b;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27622b.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public interface o0 {
        void a();
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class p implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27624b;

        p(com.join.mgps.customview.o oVar) {
            this.f27624b = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goSvip(view.getContext());
            com.join.mgps.customview.o oVar = this.f27624b;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27624b.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class q implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27626b;

        q(com.join.mgps.customview.o oVar) {
            this.f27626b = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.customview.o oVar = this.f27626b;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27626b.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class r implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27628b;

        r(com.join.mgps.customview.o oVar) {
            this.f27628b = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goVipCdk(view.getContext());
            com.join.mgps.customview.o oVar = this.f27628b;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27628b.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class s implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27630b;

        s(com.join.mgps.customview.o oVar) {
            this.f27630b = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.customview.o oVar = this.f27630b;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27630b.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class t implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w1.c f27632b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27633c;

        t(w1.c cVar, com.join.mgps.customview.o oVar) {
            this.f27632b = cVar;
            this.f27633c = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f27632b.onClickOk();
            com.join.mgps.customview.o oVar = this.f27633c;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27633c.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class u implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w1.c f27635b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27636c;

        u(w1.c cVar, com.join.mgps.customview.o oVar) {
            this.f27635b = cVar;
            this.f27636c = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f27635b.onClickCancle();
            com.join.mgps.customview.o oVar = this.f27636c;
            if (oVar == null || !oVar.isShowing()) {
                return;
            }
            this.f27636c.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    public class v implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27638a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f27639b;

        v(Context context, n0 n0Var) {
            this.f27638a = context;
            this.f27639b = n0Var;
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickCancleButn(com.join.mgps.dialog.b bVar) {
            n0 n0Var = this.f27639b;
            if (n0Var != null) {
                n0Var.onCancel();
            }
            bVar.dismiss();
        }

        @Override // com.join.mgps.dialog.b.c
        public void ClickOKButn(com.join.mgps.dialog.b bVar) {
            IntentUtil.getInstance().goAccountUpgradeActivity(this.f27638a);
            bVar.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class w implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w1.d f27641b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Dialog f27642c;

        w(w1.d dVar, Dialog dialog) {
            this.f27641b = dVar;
            this.f27642c = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w1.d dVar = this.f27641b;
            if (dVar != null) {
                dVar.b(this.f27642c);
            }
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class x implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w1.d f27644b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Dialog f27645c;

        x(w1.d dVar, Dialog dialog) {
            this.f27644b = dVar;
            this.f27645c = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w1.d dVar = this.f27644b;
            if (dVar != null) {
                dVar.a(this.f27645c);
            }
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class y implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27647b;

        y(com.join.mgps.customview.o oVar) {
            this.f27647b = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f27647b.dismiss();
        }
    }

    /* compiled from: DialogUtil.java */
    /* loaded from: classes3.dex */
    class z implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.join.mgps.customview.o f27649b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f27650c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f27651d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f27652e;

        z(com.join.mgps.customview.o oVar, Context context, String str, String str2) {
            this.f27649b = oVar;
            this.f27650c = context;
            this.f27651d = str;
            this.f27652e = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.customview.o oVar = this.f27649b;
            if (oVar != null && oVar.isShowing()) {
                this.f27649b.dismiss();
            }
            if (g2.i(APKUtils.I(this.f27650c))) {
                IntentUtil.getInstance().goQQGroup(this.f27650c, this.f27651d);
                com.join.mgps.Util.j0.M(this.f27650c, this.f27652e);
                l2.a(this.f27650c).b("已复制Q群号，若未能跳转请自行打开qq粘贴群号");
                return;
            }
            com.join.mgps.Util.j0.M(this.f27650c, this.f27652e);
            l2.a(this.f27650c).b("已复制Q群号，若未能跳转请自行打开qq粘贴群号");
        }
    }

    public com.join.mgps.dialog.d1 A(Context context, boolean z4) {
        return new com.join.mgps.dialog.d1(context, (int) R.style.MyprogressDialog, z4);
    }

    public void B(Context context, o0 o0Var) {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(context, R.style.MyDialog);
        oVar.setContentView(R.layout.realname_notice_dialog);
        TextView textView = (TextView) oVar.findViewById(R.id.dialog_content);
        Button button = (Button) oVar.findViewById(R.id.dialog_button_ok);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.setMargins(20, 0, 20, 0);
        button.setLayoutParams(layoutParams);
        ((TextView) oVar.findViewById(R.id.tip_title)).setText("提示");
        textView.setGravity(17);
        textView.setText("为保证点评真实性，\n请安装游戏后再创建点评。");
        ((Button) oVar.findViewById(R.id.dialog_button_cancle)).setVisibility(8);
        button.setText("我知道了");
        button.setOnClickListener(new j(oVar, o0Var));
        oVar.setCancelable(false);
        oVar.show();
    }

    public com.join.mgps.dialog.t1 C(Context context) {
        return new com.join.mgps.dialog.t1(context, R.style.MyDialog);
    }

    public void D(Context context) {
        new com.join.mgps.dialog.b(context, R.style.HKDialogLoading).d("取消").g("确定要退出编辑吗？").j("确定").k("提示").i(new h(context)).show();
    }

    public void E(Context context, int i4) {
        new com.join.mgps.dialog.b(context, R.style.HKDialogLoading).d("稍后").e(8).g(context.getResources().getString(R.string.post_help_coin_coast_tip, Integer.valueOf(i4), Integer.valueOf(i4 * 2), Integer.valueOf(i4))).j("知道了").k("提示").i(new g()).show();
    }

    public com.join.mgps.dialog.e1 F(Context context) {
        return new com.join.mgps.dialog.e1(context, R.style.MyprogressDialog);
    }

    public void H(String str) {
        DownloadTask F = p1.f.K().F(str);
        if (F == null || !q1.f(F.getPackageName())) {
            Intent intent = new Intent();
            intent.putExtra(AppDownFinishDialogActivity.f28454g, str);
            IntentUtil.getInstance().startActivity(MApplication.f1497x.getActivity(), AppDownFinishDialogActivity.class, intent);
        }
    }

    public void I(Context context, DownloadTask downloadTask, boolean z4, String str) {
        Activity activity = context instanceof Activity ? context : null;
        if (activity == null) {
            activity = MApplication.f1497x.getActivity();
        }
        Activity activity2 = activity == null ? context : activity;
        PrefDef_ prefDef_ = new PrefDef_(context);
        String d5 = prefDef_.isNoShowAddShortcut().d();
        boolean z5 = !g2.h(d5) && d5.contains(downloadTask.getCrc_link_type_val());
        if (!TextUtils.isEmpty(d5)) {
            downloadTask.setNotCheckAddShortcut(true);
            UtilsMy.V3(activity2, downloadTask, 0, str);
            downloadTask.setNotCheckAddShortcut(false);
        } else if (z5 && z4) {
            downloadTask.setNotCheckAddShortcut(true);
            UtilsMy.V3(activity2, downloadTask, 0, str);
            downloadTask.setNotCheckAddShortcut(false);
        } else if (downloadTask.isOpen()) {
            String portraitURL = downloadTask.getPortraitURL();
            String showName = downloadTask.getShowName();
            String crc_link_type_val = downloadTask.getCrc_link_type_val();
            if (g2.h(portraitURL)) {
                return;
            }
            com.join.android.app.common.dialog.c cVar = this.f27539h;
            if (cVar != null && cVar.isShowing()) {
                try {
                    this.f27539h.dismiss();
                } catch (Exception unused) {
                }
            }
            com.join.android.app.common.dialog.c cVar2 = new com.join.android.app.common.dialog.c(activity2, crc_link_type_val, showName, portraitURL, downloadTask);
            this.f27539h = cVar2;
            cVar2.show();
            this.f27539h.h(new d0(context, showName, crc_link_type_val));
            this.f27539h.g(new e0(prefDef_, downloadTask, context, str));
        }
    }

    public void J(Context context, DomainInfoBean domainInfoBean, String str) {
        try {
            if (com.join.mgps.Util.y.u(new PrefDef_(context).lastShowBespeakTipTime().d().longValue())) {
                return;
            }
            com.join.mgps.dialog.q qVar = this.f27540i;
            if (qVar != null && qVar.isShowing()) {
                this.f27540i.dismiss();
            }
            com.join.mgps.dialog.q qVar2 = new com.join.mgps.dialog.q(context);
            this.f27540i = qVar2;
            qVar2.a(domainInfoBean, str);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void K(Context context, CommonGameInfoBean commonGameInfoBean) {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(context, R.style.MyDialog);
        oVar.setContentView(R.layout.update_choice_dialog);
        TextView textView = (TextView) oVar.findViewById(R.id.dialog_button_cancel);
        TextView textView2 = (TextView) oVar.findViewById(R.id.dialog_button_ok);
        ((TextView) oVar.findViewById(R.id.tip_title)).setText("更新提示");
        ((TextView) oVar.findViewById(R.id.dialog_content)).setText("【" + commonGameInfoBean.getTitle() + "】可更新版本");
        textView2.setText("立即更新");
        textView.setText("直接启动");
        textView2.setOnClickListener(new c(context, commonGameInfoBean, oVar));
        textView.setOnClickListener(new d(context, commonGameInfoBean, oVar));
        oVar.show();
    }

    public com.join.mgps.customview.o L(Context context) {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(context, R.style.MyDialog);
        oVar.setContentView(R.layout.bind_dialog);
        Button button = (Button) oVar.findViewById(R.id.dialog_button_cancel);
        Button button2 = (Button) oVar.findViewById(R.id.dialog_button_ok);
        ((TextView) oVar.findViewById(R.id.tip_title)).setText("完善资料");
        ((TextView) oVar.findViewById(R.id.dialog_content)).setText(context.getString(R.string.tour_perfect_info_tip));
        ((TextView) oVar.findViewById(R.id.dialog_desci)).setVisibility(8);
        button2.setText("去完善");
        button.setText("下次再说");
        button2.setOnClickListener(new l(oVar));
        button.setOnClickListener(new m(oVar));
        return oVar;
    }

    public com.join.mgps.customview.o M(Context context) {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(context, R.style.MyDialog);
        oVar.setContentView(R.layout.bind_dialog);
        Button button = (Button) oVar.findViewById(R.id.dialog_button_cancel);
        Button button2 = (Button) oVar.findViewById(R.id.dialog_button_ok);
        ((TextView) oVar.findViewById(R.id.tip_title)).setText("提示");
        ((TextView) oVar.findViewById(R.id.dialog_content)).setText("铜板不足，成为悟饭会员每天即可领取300铜板哦~");
        ((TextView) oVar.findViewById(R.id.dialog_desci)).setVisibility(8);
        button2.setText("我要VIP特权");
        button2.setTextColor(context.getResources().getColor(R.color.main_yello_color));
        button.setText("取消");
        button2.setOnClickListener(new n(context, oVar));
        button.setOnClickListener(new o(oVar));
        return oVar;
    }

    public void N(FragmentManager fragmentManager, String str, String str2, String str3, String str4) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(f27531j);
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag);
        }
        CustomerAlertDialog.a(str, str2, str3, str4).show(fragmentManager, f27531j);
        fragmentManager.executePendingTransactions();
    }

    public com.join.mgps.customview.o O(Context context, int i4, w1.c cVar) {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(context, R.style.MyDialog);
        oVar.setContentView(R.layout.bind_dialog);
        Button button = (Button) oVar.findViewById(R.id.dialog_button_cancel);
        Button button2 = (Button) oVar.findViewById(R.id.dialog_button_ok);
        TextView textView = (TextView) oVar.findViewById(R.id.tip_title);
        TextView textView2 = (TextView) oVar.findViewById(R.id.dialog_content);
        TextView textView3 = (TextView) oVar.findViewById(R.id.dialog_desci);
        ImageView imageView = (ImageView) oVar.findViewById(R.id.notice);
        if (i4 == 1) {
            imageView.setVisibility(0);
            textView.setText("预约成功");
            textView2.setText("游戏新动态提醒留意通知栏和消息中心");
            textView3.setText("游戏上线后将为你发放礼包等福利");
            button2.setText("我知道了");
            button.setVisibility(8);
        } else if (i4 == 2) {
            textView.setText("收藏成功");
            imageView.setVisibility(0);
            textView2.setText("游戏新动态提醒留意通知栏和消息中心");
            textView3.setText("游戏新动态包括：游戏开放下载、开测、礼包、活动等");
            button2.setText("我知道了");
            button.setVisibility(8);
        } else if (i4 == 3) {
            textView.setText("取消关注");
            textView2.setText("取消后你将无法及时收到礼包、开测等动态的提醒哦~确定要取消吗？");
            textView3.setVisibility(8);
            button2.setText("确定");
            button.setText("关闭");
        }
        button2.setOnClickListener(new t(cVar, oVar));
        button.setOnClickListener(new u(cVar, oVar));
        return oVar;
    }

    public void P(Context context, String str) {
        AndroidPermissionParams androidPermissionParams = new AndroidPermissionParams("该游戏在安卓" + Build.VERSION.RELEASE + "版本中可能存在闪退、显示效果不佳、运行不流畅等现象");
        Intent intent = new Intent();
        intent.putExtra(AndroidPermissionDialogActivity.f28377i, androidPermissionParams);
        IntentUtil.getInstance().startActivityWithCallback(context, AndroidPermissionDialogActivity.class, intent, new f0(context, str));
    }

    public Dialog Q(Context context, String str, String str2, n0.c cVar) {
        return new com.join.mgps.dialog.n0(context, R.style.HKDialogLoading).d(str2).e(str).b(false).c(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[Catch: Exception -> 0x0064, TryCatch #0 {Exception -> 0x0064, blocks: (B:4:0x0004, B:7:0x000b, B:8:0x000f, B:10:0x0015, B:12:0x0027, B:14:0x0033, B:15:0x0036, B:18:0x003d, B:20:0x0041, B:22:0x0047, B:23:0x004c, B:25:0x0059, B:26:0x005e), top: B:31:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void R(android.content.Context r5, int r6, java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L69
            if (r7 == 0) goto L69
            int r0 = r7.size()     // Catch: java.lang.Exception -> L64
            if (r0 != 0) goto Lb
            goto L69
        Lb:
            java.util.Iterator r0 = r7.iterator()     // Catch: java.lang.Exception -> L64
        Lf:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L64
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L64
            com.github.snowdream.android.app.downloader.DownloadTask r1 = (com.github.snowdream.android.app.downloader.DownloadTask) r1     // Catch: java.lang.Exception -> L64
            java.lang.String r2 = "3875871586"
            java.lang.String r3 = r1.getCrc_link_type_val()     // Catch: java.lang.Exception -> L64
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L64
            if (r2 != 0) goto L33
            java.lang.String r2 = "2057111073"
            java.lang.String r3 = r1.getCrc_link_type_val()     // Catch: java.lang.Exception -> L64
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L64
            if (r2 == 0) goto Lf
        L33:
            r7.remove(r1)     // Catch: java.lang.Exception -> L64
        L36:
            int r0 = r7.size()     // Catch: java.lang.Exception -> L64
            if (r0 != 0) goto L3d
            return
        L3d:
            com.join.mgps.activity.InstallAppDialogActivity r0 = r4.f27537f     // Catch: java.lang.Exception -> L64
            if (r0 == 0) goto L4c
            boolean r0 = r0.isShowing()     // Catch: java.lang.Exception -> L64
            if (r0 == 0) goto L4c
            com.join.mgps.activity.InstallAppDialogActivity r0 = r4.f27537f     // Catch: java.lang.Exception -> L64
            r0.dismiss()     // Catch: java.lang.Exception -> L64
        L4c:
            com.join.mgps.activity.InstallAppDialogActivity r0 = new com.join.mgps.activity.InstallAppDialogActivity     // Catch: java.lang.Exception -> L64
            r0.<init>(r5, r6, r7)     // Catch: java.lang.Exception -> L64
            r4.f27537f = r0     // Catch: java.lang.Exception -> L64
            boolean r5 = r0.isShowing()     // Catch: java.lang.Exception -> L64
            if (r5 == 0) goto L5e
            com.join.mgps.activity.InstallAppDialogActivity r5 = r4.f27537f     // Catch: java.lang.Exception -> L64
            r5.dismiss()     // Catch: java.lang.Exception -> L64
        L5e:
            com.join.mgps.activity.InstallAppDialogActivity r5 = r4.f27537f     // Catch: java.lang.Exception -> L64
            r5.show()     // Catch: java.lang.Exception -> L64
            goto L69
        L64:
            r5 = move-exception
            r5.printStackTrace()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.Util.a0.R(android.content.Context, int, java.util.List):void");
    }

    /* renamed from: S */
    public void G(Context context, String str, DomainInfoBean domainInfoBean) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    com.join.mgps.dialog.m1 m1Var = this.f27534c;
                    if (m1Var != null && m1Var.isShowing()) {
                        this.f27534c.dismiss();
                    }
                    com.join.mgps.dialog.m1 m1Var2 = new com.join.mgps.dialog.m1(context);
                    this.f27534c = m1Var2;
                    if (m1Var2.isShowing()) {
                        this.f27534c.dismiss();
                    }
                    this.f27534c.a(str, domainInfoBean);
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        w0.e("WF", "mod questionnaire " + str);
    }

    public void T(Context context, String str, String str2, ModFeedbackBean modFeedbackBean) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.join.mgps.dialog.p1 p1Var = this.f27536e;
                if (p1Var != null && p1Var.isShowing()) {
                    this.f27536e.dismiss();
                }
                com.join.mgps.dialog.p1 p1Var2 = new com.join.mgps.dialog.p1(context);
                this.f27536e = p1Var2;
                p1Var2.f(str, str2, modFeedbackBean);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void U(Context context, String str, String str2) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.join.mgps.dialog.q1 q1Var = this.f27535d;
                if (q1Var != null && q1Var.isShowing()) {
                    this.f27535d.dismiss();
                }
                com.join.mgps.dialog.q1 q1Var2 = new com.join.mgps.dialog.q1(context);
                this.f27535d = q1Var2;
                q1Var2.b(str, str2);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void V(Context context, OnlineCouponConfigBean onlineCouponConfigBean, int i4) {
        W(context, onlineCouponConfigBean, i4, null);
    }

    public void W(Context context, OnlineCouponConfigBean onlineCouponConfigBean, int i4, n0 n0Var) {
        try {
            com.join.mgps.dialog.u1 u1Var = new com.join.mgps.dialog.u1(context, onlineCouponConfigBean, i4);
            this.f27538g = u1Var;
            u1Var.setOnDismissListener(new c0(n0Var));
            this.f27538g.show();
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(context).getAccountData();
            if (accountData != null && i4 == 3) {
                int n22 = accountData.n2();
                PrefDef_ prefDef_ = new PrefDef_(context);
                if (n22 == 1) {
                    prefDef_.lastQuitShowOnlineCouponTime().g(Long.valueOf(System.currentTimeMillis()));
                } else {
                    prefDef_.lastQuitShowOnlineCouponTimeGuset().g(Long.valueOf(System.currentTimeMillis()));
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void X(Context context, com.tbruyelle.rxpermissions2.b bVar) {
        Dialog dialog = this.f27532a;
        if (dialog != null) {
            if (dialog.isShowing()) {
                this.f27532a.dismiss();
            }
            this.f27532a = null;
        }
        this.f27533b = new AlertDialog.Builder(context, R.style.AlertDialogCustom);
        if (bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55587g)) {
            return;
        }
        this.f27533b.setTitle("提示");
        if (!bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55590j) && !bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55589i)) {
            AlertDialog.Builder builder = this.f27533b;
            builder.setMessage("请去设置中开启权限" + bVar.f62139a);
        } else {
            this.f27533b.setMessage("需要打开读写存储权限，请去设置中开启权限");
        }
        this.f27533b.setPositiveButton("去打开", new k(context));
        this.f27532a = this.f27533b.show();
    }

    public void Y(Context context, String str, EMUApkTable eMUApkTable, String str2) {
        ((PlugUpdateDialog_.a) PlugUpdateDialog_.h0(context).a(str2).b(str).c(eMUApkTable).flags(536870912)).start();
    }

    public void Z(Context context, WxProgram wxProgram) {
        try {
            PrivateDomainDefaultActivity_.j0(context).a(wxProgram).start();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a0(Context context, DomainInfoBean domainInfoBean) {
        try {
            if ((MApplication.f1497x.getActivity() instanceof DiscoveryPaiweiActivity_) || (MApplication.f1497x.getActivity() instanceof EndGameActivity_) || (MApplication.f1497x.getActivity() instanceof EndGameLaunchActivity_) || (MApplication.f1497x.getActivity() instanceof EndGameDetailActivity_)) {
                return;
            }
            ((PrivateDomainDownloadActivity_.a) PrivateDomainDownloadActivity_.f0(context).a(domainInfoBean).flags(809500672)).start();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void b0(Context context, String str, String str2, String str3) {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(context, R.style.MyDialog);
        oVar.setContentView(R.layout.qq_dialog_layout);
        MyImageLoader.d((SimpleDraweeView) oVar.findViewById(R.id.images), R.drawable.banner_normal_icon, str2);
        ((ImageView) oVar.findViewById(R.id.closed)).setOnClickListener(new y(oVar));
        ((Button) oVar.findViewById(R.id.dialog_button_ok)).setOnClickListener(new z(oVar, context, str, str3));
        oVar.setCancelable(false);
        oVar.show();
    }

    public com.join.mgps.customview.o c0(Context context) {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(context, R.style.MyDialog);
        oVar.setContentView(R.layout.bind_dialog);
        Button button = (Button) oVar.findViewById(R.id.dialog_button_cancel);
        Button button2 = (Button) oVar.findViewById(R.id.dialog_button_ok);
        ((TextView) oVar.findViewById(R.id.tip_title)).setText("提示");
        ((TextView) oVar.findViewById(R.id.dialog_content)).setText(context.getString(R.string.need_svip_info_tip));
        ((TextView) oVar.findViewById(R.id.dialog_desci)).setVisibility(8);
        button2.setText("了解SVIP");
        button.setText("下次再说");
        button2.setOnClickListener(new p(oVar));
        button.setOnClickListener(new q(oVar));
        return oVar;
    }

    public Dialog d(Context context, String str, String str2, String str3, String str4, w1.d dVar) {
        Dialog dialog = new Dialog(context, R.style.MyDialog);
        dialog.setContentView(R.layout.dialog_customer_alert);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        Button button = (Button) dialog.findViewById(R.id.dialog_button_cancle);
        Button button2 = (Button) dialog.findViewById(R.id.dialog_button_ok);
        ((TextView) dialog.findViewById(R.id.tip_title)).setText(str);
        ((TextView) dialog.findViewById(R.id.dialog_content)).setText(str2);
        button.setText(str3);
        button2.setText(str4);
        button2.setOnClickListener(new w(dVar, dialog));
        button.setOnClickListener(new x(dVar, dialog));
        return dialog;
    }

    public void d0(Context context, DownloadTask downloadTask) {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(context, R.style.MyDialog);
        oVar.setContentView(R.layout.update_choice_dialog);
        TextView textView = (TextView) oVar.findViewById(R.id.dialog_button_cancel);
        TextView textView2 = (TextView) oVar.findViewById(R.id.dialog_button_ok);
        ((TextView) oVar.findViewById(R.id.tip_title)).setText("更新提示");
        ((TextView) oVar.findViewById(R.id.dialog_content)).setText("【" + downloadTask.getShowName() + "】可更新版本");
        textView2.setText("立即更新");
        textView.setText("直接启动");
        textView2.setOnClickListener(new e(context, downloadTask, oVar));
        textView.setOnClickListener(new f(context, downloadTask, oVar));
        oVar.show();
    }

    public boolean e(final Context context) {
        DownloadTask F;
        final DomainInfoBean domainInfoBean;
        final String d5 = MApplication.f1497x.l().lastLaunchModGameId().d();
        if (g2.i(d5) && (F = p1.f.K().F(d5)) != null && (F.getGame_run_state() == 3 || F.getGame_run_state() == 0)) {
            String d6 = MApplication.f1497x.l().privateDomainFeedbackInfo().d();
            if (g2.i(d6) && (domainInfoBean = (DomainInfoBean) JsonMapper.getInstance().fromJson(d6, DomainInfoBean.class)) != null) {
                PdAdCfgBean convertStr2Bean = PdAdCfgBean.convertStr2Bean(MApplication.f1497x.l().pd_ad_config().d());
                boolean z4 = convertStr2Bean != null && convertStr2Bean.canShowStartUp(F.getFeed_back_show_times());
                if (d5.equals(domainInfoBean.getGameId()) && System.currentTimeMillis() - domainInfoBean.getLaunchTime() < 20000 && z4) {
                    F.setFeed_back_show_times(F.getFeed_back_show_times() + 1);
                    p1.f.K().m(F);
                    new Handler().postDelayed(new Runnable() { // from class: com.join.mgps.Util.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            a0.this.G(context, d5, domainInfoBean);
                        }
                    }, 200L);
                    return true;
                }
            }
        }
        return false;
    }

    public com.join.mgps.customview.o e0(Context context) {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(context, R.style.MyDialog);
        oVar.setContentView(R.layout.bind_dialog);
        Button button = (Button) oVar.findViewById(R.id.dialog_button_cancel);
        Button button2 = (Button) oVar.findViewById(R.id.dialog_button_ok);
        ((TextView) oVar.findViewById(R.id.tip_title)).setText("提示");
        ((TextView) oVar.findViewById(R.id.dialog_content)).setText(context.getString(R.string.need_vip_info_tip));
        ((TextView) oVar.findViewById(R.id.dialog_desci)).setVisibility(8);
        button2.setText("我要成为VIP");
        button.setText("下次再说");
        button2.setOnClickListener(new r(oVar));
        button.setOnClickListener(new s(oVar));
        return oVar;
    }

    public Dialog f(Context context, List<CouponsData> list, c2.c cVar, int i4, boolean z4) {
        com.join.mgps.dialog.d0 d0Var = new com.join.mgps.dialog.d0(context, R.style.DialogCoupon, list, cVar, i4, z4);
        Window window = d0Var.getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        return d0Var;
    }

    public Dialog g(Context context, n0 n0Var) {
        com.join.mgps.dialog.b i4 = new com.join.mgps.dialog.b(context, R.style.HKDialogLoading).d("现在不").g("登陆后，开始悟饭游戏的精彩旅游").j("登录").k("提示").i(new v(context, n0Var));
        i4.setOnKeyListener(new g0(n0Var));
        i4.setOnCancelListener(new h0(n0Var));
        i4.show();
        return i4;
    }

    public com.join.mgps.dialog.b h(Context context) {
        return new com.join.mgps.dialog.b(context, R.style.HKDialogLoading);
    }

    public void i(Context context) {
        new com.join.mgps.dialog.b(context, R.style.HKDialogLoading).d("现在不").g("登陆后，悟饭可以为你永久免费记录成就").j("登录").k("提示").i(new b(context)).show();
    }

    public void j(Context context) {
        IntentUtil.getInstance().goLoginBattle(context);
    }

    public void k(Context context) {
        g(context, null);
    }

    public void l(Context context, String str, String str2, String str3, o0 o0Var) {
        com.join.mgps.dialog.b bVar = new com.join.mgps.dialog.b(context, R.style.HKDialogLoading);
        if (str.isEmpty()) {
            str = "请登录后使用该功能";
        }
        com.join.mgps.dialog.b g4 = bVar.g(str);
        if (str2.isEmpty()) {
            str2 = "登录";
        }
        com.join.mgps.dialog.b j4 = g4.j(str2);
        if (str3.isEmpty()) {
            str3 = "取消";
        }
        j4.d(str3).k("提示").i(new i(context, o0Var)).show();
    }

    public void m(Context context) {
        IntentUtil.getInstance().goLoginInteractive(context);
    }

    public Dialog n(Context context, String str, int i4, n0 n0Var) {
        com.join.mgps.dialog.b i5 = new com.join.mgps.dialog.b(context, R.style.HKDialogLoading).d("取消").g(String.format("把“%s”踢出房间\n需要消耗%d铜板\n您确定要踢出？", str, Integer.valueOf(i4))).j("确定").k("提示").i(new i0(context, n0Var));
        i5.setOnKeyListener(new j0(n0Var));
        i5.setOnCancelListener(new k0(n0Var));
        i5.show();
        return i5;
    }

    public Dialog o(Context context, n0 n0Var) {
        com.join.mgps.dialog.b i4 = new com.join.mgps.dialog.b(context, R.style.HKDialogLoading).d("取消").g("你已被踢出游戏\n开通VIP会员，立即享受防踢特权").j("开通会员").k("提示").i(new l0(context, n0Var));
        i4.setOnKeyListener(new m0(n0Var));
        i4.setOnCancelListener(new a(n0Var));
        i4.show();
        return i4;
    }

    public com.join.mgps.dialog.o p(Context context, int i4) {
        return new com.join.mgps.dialog.o(context, (int) R.style.HKDialogLoading, i4);
    }

    public com.join.mgps.dialog.r q(Context context) {
        return new com.join.mgps.dialog.r(context, R.style.HKDialogLoading);
    }

    public com.join.mgps.dialog.s r(Context context) {
        return new com.join.mgps.dialog.s(context, R.style.HKDialogLoading);
    }

    public com.join.mgps.dialog.t s(Context context) {
        return new com.join.mgps.dialog.t(context, R.style.HKDialogLoading);
    }

    public com.join.mgps.dialog.k0 t(Context context) {
        return new com.join.mgps.dialog.k0(context, R.style.HKDialogLoading);
    }

    public com.join.mgps.dialog.r0 u(Context context) {
        return new com.join.mgps.dialog.r0(context, R.style.HKDialogLoading);
    }

    public com.join.mgps.dialog.x0 v(Context context) {
        return new com.join.mgps.dialog.x0(context, R.style.HKDialogLoading);
    }

    public com.join.mgps.dialog.y0 w(Context context) {
        return new com.join.mgps.dialog.y0(context, R.style.HKDialogLoading);
    }

    public com.join.mgps.dialog.d1 x(Context context) {
        return new com.join.mgps.dialog.d1(context, R.style.MyprogressDialog);
    }

    public com.join.mgps.dialog.d1 y(Context context, String str) {
        return new com.join.mgps.dialog.d1(context, (int) R.style.MyprogressDialog, str);
    }

    public com.join.mgps.dialog.d1 z(Context context, String str, boolean z4) {
        com.join.mgps.dialog.d1 d1Var = new com.join.mgps.dialog.d1(context, R.style.MyprogressDialog, str, z4);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = d1Var.getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            d1Var.getWindow().setAttributes(attributes);
        }
        return d1Var;
    }
}
