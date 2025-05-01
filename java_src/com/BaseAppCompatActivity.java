package com;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.db.DatabaseHelper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.c0;
import com.join.mgps.Util.c2;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.q0;
import com.join.mgps.Util.q1;
import com.join.mgps.Util.v0;
import com.join.mgps.Util.w0;
import com.join.mgps.activity.DiscoveryPaiweiActivity_;
import com.join.mgps.activity.EndGameActivity_;
import com.join.mgps.activity.EndGameDetailActivity_;
import com.join.mgps.activity.EndGameLaunchActivity_;
import com.join.mgps.activity.GameDetailPermissionActivity_;
import com.join.mgps.activity.GameMainActivity3_;
import com.join.mgps.activity.ModGameIndexActivity;
import com.join.mgps.activity.NewArenaMainActivty_;
import com.join.mgps.activity.SimulatorExitPlayActivity_;
import com.join.mgps.activity.mygame.dialog.UnzipFailedDialog_;
import com.join.mgps.broadcast.NetBroadcastReceiver;
import com.join.mgps.customview.LoadingLayout;
import com.join.mgps.customview.r;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.wrapper.SystemUiHider.a;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.Observable;
import java.util.Observer;
/* loaded from: classes2.dex */
public class BaseAppCompatActivity extends AppCompatActivity implements Observer, LoadingLayout.b, LoadingLayout.a {
    public static final int PERMISSION_INSTALL_RESULT_CODE = 10010;
    private EmuOutResultReceiver adResultReceiver;
    com.join.mgps.dialog.d apkInstallDialog;
    private c2.d baiduChannelPermissionCallBack;
    private t broadcasExt;
    View contentView;
    Dialog dialogU;
    String fialePath;
    String gameid;
    GestureDetector gestureDetector;
    private Handler hideHandler;
    private Runnable hideRunnable;
    private com.join.android.app.common.dialog.e loading;
    protected Handler mHandler;
    protected LoadingLayout mLoadingLayout;
    private NetBroadcastReceiver netBroadcastReceiver;
    PopupWindow popupWindow;
    PrefDef_ prefDef_;
    int rangeBottom;
    int rangeTop;
    v recver;
    private w time;
    protected com.join.mgps.wrapper.SystemUiHider.a uiHider;
    protected String loadingHintMsg = null;
    boolean isfirst = true;
    protected boolean isBackHome = false;
    protected boolean hasDialog = false;
    protected boolean canShowFeedBack = true;
    boolean hasdestroyed = false;
    private DatabaseHelper databaseHelper = null;
    private boolean fullScreenFlag = false;
    int fullScreenCfg = 0;
    boolean isInBackground = false;
    long lastShowPopTime = 0;
    boolean isSo = false;
    AlertDialog.Builder dialog = null;
    private Handler handlerx = new f();
    long timeLastDe = 0;
    private final IntentFilter intentFilter12_ = new IntentFilter();
    private final BroadcastReceiver onReciviedReceiver_ = new g();
    int REQUEST_CODE = 10101;

    /* loaded from: classes2.dex */
    public class EmuOutResultReceiver extends BroadcastReceiver {

        /* loaded from: classes2.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                }
            }
        }

        public EmuOutResultReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (o1.a.G0.equals(intent.getAction())) {
                MApplication.f1497x.G(true);
            }
            new Thread(new a()).start();
        }
    }

    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f1422b;

        a(String str) {
            this.f1422b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v0.d("popwindow", "onClick main dismiss");
            BaseAppCompatActivity.this.popupWindow.dismiss();
            if (BaseAppCompatActivity.this.isSo) {
                com.papa.sim.statistic.p.l(view.getContext()).O1(Event.enterSoStartMyGame, new Ext().setGameId(this.f1422b));
            } else {
                com.papa.sim.statistic.p.l(view.getContext()).O1(Event.enterSinStartMyGame, new Ext().setGameId(this.f1422b));
            }
            IntentUtil.getInstance().goMyGameManagerActivity(view.getContext());
        }
    }

    /* loaded from: classes2.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f1424b;

        b(DownloadTask downloadTask) {
            this.f1424b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BaseAppCompatActivity.this.isSo) {
                com.papa.sim.statistic.p.l(view.getContext()).O1(Event.onclickSoGameStart, new Ext().setGameId(this.f1424b.getCrc_link_type_val()));
            } else {
                com.papa.sim.statistic.p.l(view.getContext()).O1(Event.onclickSinGameStart, new Ext().setGameId(this.f1424b.getCrc_link_type_val()));
            }
            UtilsMy.T3(view.getContext(), this.f1424b);
            BaseAppCompatActivity.this.popupWindow.dismiss();
            v0.d("popwindow", "onClick ok dismiss");
        }
    }

    /* loaded from: classes2.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseAppCompatActivity.this.popupWindow.dismiss();
            v0.d("popwindow", "onClick cancle dismiss");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements w1.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f1427a;

        /* loaded from: classes2.dex */
        class a implements Consumer<com.tbruyelle.rxpermissions2.b> {
            a() {
            }

            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
                if (bVar.f62139a.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                    d dVar = d.this;
                    String str = dVar.f1427a.f1456b;
                    if (str != null) {
                        BaseAppCompatActivity.this.fialePath = str;
                    }
                    BaseAppCompatActivity.this.handlerx.sendEmptyMessage(1);
                }
            }
        }

        d(u uVar) {
            this.f1427a = uVar;
        }

        @Override // w1.c
        public void onClickCancle() {
            new com.tbruyelle.rxpermissions2.c(BaseAppCompatActivity.this).r("android.permission.REQUEST_INSTALL_PACKAGES").subscribe(new a());
        }

        @Override // w1.c
        public void onClickOk() {
            BaseAppCompatActivity.this.startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + BaseAppCompatActivity.this.getPackageName())), 10010);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements Consumer<com.tbruyelle.rxpermissions2.b> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                dialogInterface.dismiss();
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", BaseAppCompatActivity.this.getPackageName(), null));
                BaseAppCompatActivity.this.startActivity(intent);
            }
        }

        e() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
            if (bVar.f62140b) {
                if (bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55583c)) {
                    String i4 = com.join.android.app.common.utils.n.n(MApplication.f1497x).i();
                    MApplication.f1498y = i4;
                    try {
                        MApplication.f1498y = com.join.mgps.Util.a.d(i4, "");
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            } else if (!bVar.f62141c) {
                if (bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55583c)) {
                    return;
                }
                BaseAppCompatActivity baseAppCompatActivity = BaseAppCompatActivity.this;
                Dialog dialog = baseAppCompatActivity.dialogU;
                if (dialog == null) {
                    baseAppCompatActivity.dialog = new AlertDialog.Builder(baseAppCompatActivity, R.style.AlertDialogCustom);
                } else if (dialog.isShowing()) {
                    return;
                }
                BaseAppCompatActivity.this.dialog.setTitle("提示");
                if (!bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55590j) && !bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55589i)) {
                    BaseAppCompatActivity.this.dialog.setMessage("请去设置中开启权限");
                } else {
                    BaseAppCompatActivity.this.dialog.setMessage("需要打开读写存储权限，请去设置中开启权限");
                }
                BaseAppCompatActivity.this.dialog.setPositiveButton("去打开", new a());
                BaseAppCompatActivity baseAppCompatActivity2 = BaseAppCompatActivity.this;
                baseAppCompatActivity2.dialogU = baseAppCompatActivity2.dialog.show();
            }
            if (BaseAppCompatActivity.this.baiduChannelPermissionCallBack != null) {
                BaseAppCompatActivity.this.baiduChannelPermissionCallBack.b();
            }
        }
    }

    /* loaded from: classes2.dex */
    class f extends Handler {
        f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i4 = message.what;
                if (i4 == 1) {
                    com.join.android.app.common.utils.e.l0(BaseAppCompatActivity.this).y(BaseAppCompatActivity.this, new File(BaseAppCompatActivity.this.fialePath));
                } else if (i4 == 3) {
                    try {
                        BaseAppCompatActivity.this.showDownFinish((String) message.obj);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } else {
                    BaseAppCompatActivity baseAppCompatActivity = BaseAppCompatActivity.this;
                    if (baseAppCompatActivity.isInBackground) {
                        return;
                    }
                    baseAppCompatActivity.requestPermission((u) message.obj);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    class g extends BroadcastReceiver {
        g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(final Context context, Intent intent) {
            if (o1.a.f72015n0.equals(intent.getAction())) {
                BaseAppCompatActivity.this.onRecivied(intent, context);
            } else if (o1.a.N.equals(intent.getAction())) {
                if (BaseAppCompatActivity.this.isInBackground) {
                    return;
                }
                final String stringExtra = intent.getStringExtra("plugNumber");
                final String stringExtra2 = intent.getStringExtra("gameZipPath");
                final String stringExtra3 = intent.getStringExtra("PackageName");
                final String stringExtra4 = intent.getStringExtra("romType");
                String stringExtra5 = intent.getStringExtra("gameName");
                if (TextUtils.equals(stringExtra, String.valueOf(ConstantIntEnum.FC.value())) || TextUtils.equals(stringExtra, String.valueOf(ConstantIntEnum.GBA.value())) || TextUtils.equals(stringExtra, String.valueOf(ConstantIntEnum.FBA.value())) || TextUtils.equals(stringExtra, String.valueOf(ConstantIntEnum.MD.value())) || TextUtils.equals(stringExtra, String.valueOf(ConstantIntEnum.SFC.value())) || TextUtils.equals(stringExtra, String.valueOf(ConstantIntEnum.PSP.value())) || TextUtils.equals(stringExtra, String.valueOf(ConstantIntEnum.PS.value())) || TextUtils.equals(stringExtra, String.valueOf(ConstantIntEnum.WSC.value())) || TextUtils.equals(stringExtra, String.valueOf(ConstantIntEnum.GBC.value()))) {
                    return;
                }
                com.join.mgps.customview.r rVar = new com.join.mgps.customview.r(context);
                rVar.b(new r.a() { // from class: com.c
                    @Override // com.join.mgps.customview.r.a
                    public final void a(String str) {
                        UtilsMy.K0(context, stringExtra, stringExtra2, stringExtra3, stringExtra4);
                    }
                });
                long currentTimeMillis = System.currentTimeMillis();
                BaseAppCompatActivity baseAppCompatActivity = BaseAppCompatActivity.this;
                if (currentTimeMillis - baseAppCompatActivity.timeLastDe > 2000) {
                    rVar.c(baseAppCompatActivity.getWindow().getDecorView().getRootView(), stringExtra5);
                    BaseAppCompatActivity.this.timeLastDe = System.currentTimeMillis();
                }
            } else {
                BaseAppCompatActivity baseAppCompatActivity2 = BaseAppCompatActivity.this;
                if (baseAppCompatActivity2.isInBackground) {
                    return;
                }
                b0.f0(baseAppCompatActivity2).P(BaseAppCompatActivity.this, intent.getStringExtra("gameid"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f1434b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f1435c;

        h(Intent intent, Context context) {
            this.f1434b = intent;
            this.f1435c = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
            BaseAppCompatActivity.this.getUNzipPermiss(this.f1434b.getStringExtra("gameId"), BaseAppCompatActivity.this);
            com.papa.sim.statistic.p.l(this.f1435c).O1(Event.Unzip_getpermission, new Ext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class i implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f1437b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f1438c;

        i(Intent intent, Context context) {
            this.f1437b = intent;
            this.f1438c = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
            BaseAppCompatActivity.this.setUnzipFailedStatus(this.f1437b.getStringExtra("gameId"));
            com.papa.sim.statistic.p.l(this.f1438c).O1(Event.Unzip_cancelpermission, new Ext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class j implements Consumer<com.tbruyelle.rxpermissions2.b> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1440b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f1441c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                dialogInterface.dismiss();
                Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", BaseAppCompatActivity.this.getPackageName(), null));
                BaseAppCompatActivity.this.startActivity(intent);
            }
        }

        j(Context context, String str) {
            this.f1440b = context;
            this.f1441c = str;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
            if (bVar.f62140b) {
                if (ContextCompat.checkSelfPermission(this.f1440b, com.kuaishou.weapon.p0.g.f55590j) == 0) {
                    com.papa.sim.statistic.p.l(this.f1440b).O1(Event.Unzip_permissionsuccess, new Ext());
                    DownloadTask F = p1.f.K().F(this.f1441c);
                    if (F != null) {
                        if (Integer.parseInt(F.getPlugin_num()) == ConstantIntEnum.MGAME.value()) {
                            com.join.android.app.common.servcie.i.e().r(this.f1440b, F, false);
                        } else {
                            com.join.android.app.common.servcie.i.e().r(this.f1440b, F, true);
                        }
                    }
                }
            } else if (bVar.f62141c) {
                BaseAppCompatActivity.this.setUnzipFailedStatus(this.f1441c);
            } else {
                BaseAppCompatActivity.this.setUnzipFailedStatus(this.f1441c);
                BaseAppCompatActivity baseAppCompatActivity = BaseAppCompatActivity.this;
                Dialog dialog = baseAppCompatActivity.dialogU;
                if (dialog == null) {
                    baseAppCompatActivity.dialog = new AlertDialog.Builder(baseAppCompatActivity, R.style.AlertDialogCustom);
                } else if (dialog.isShowing()) {
                    return;
                }
                BaseAppCompatActivity.this.dialog.setTitle("提示");
                if (!bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55590j) && !bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55589i)) {
                    BaseAppCompatActivity.this.dialog.setMessage("请去设置中开启权限");
                } else {
                    BaseAppCompatActivity.this.dialog.setMessage("需要打开读写存储权限，请去设置中开启权限");
                }
                BaseAppCompatActivity.this.dialog.setPositiveButton("去打开", new a());
                BaseAppCompatActivity baseAppCompatActivity2 = BaseAppCompatActivity.this;
                baseAppCompatActivity2.dialogU = baseAppCompatActivity2.dialog.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class k implements NetBroadcastReceiver.a {
        k() {
        }

        @Override // com.join.mgps.broadcast.NetBroadcastReceiver.a
        public void a(int i4) {
            BaseAppCompatActivity.this.onNetworkChanged(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = BaseAppCompatActivity.this.mLoadingLayout;
            if (loadingLayout != null) {
                loadingLayout.h();
            }
        }
    }

    /* loaded from: classes2.dex */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = BaseAppCompatActivity.this.mLoadingLayout;
            if (loadingLayout != null) {
                loadingLayout.d();
            }
        }
    }

    /* loaded from: classes2.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = BaseAppCompatActivity.this.mLoadingLayout;
            if (loadingLayout != null) {
                loadingLayout.i();
            }
        }
    }

    /* loaded from: classes2.dex */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = BaseAppCompatActivity.this.mLoadingLayout;
            if (loadingLayout != null) {
                loadingLayout.g();
            }
        }
    }

    /* loaded from: classes2.dex */
    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingLayout loadingLayout = BaseAppCompatActivity.this.mLoadingLayout;
            if (loadingLayout != null) {
                loadingLayout.j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseAppCompatActivity.this.uiHider.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class r implements a.b {
        r() {
        }

        @Override // com.join.mgps.wrapper.SystemUiHider.a.b
        public void onVisibilityChange(boolean z4) {
            if (z4) {
                BaseAppCompatActivity.this.hideUiDelayed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class s implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1452b;

        s(View view) {
            this.f1452b = view;
        }

        private boolean a(View view) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            return ((float) (view.getBottom() - rect.bottom)) > view.getResources().getDisplayMetrics().density * 100.0f;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (a(this.f1452b)) {
                BaseAppCompatActivity.this.showKeyBoardHandler();
            } else {
                BaseAppCompatActivity.this.hideKeyBoardHandler();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class t extends BroadcastReceiver {
        t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BaseAppCompatActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class u {

        /* renamed from: a  reason: collision with root package name */
        public String f1455a;

        /* renamed from: b  reason: collision with root package name */
        public String f1456b;

        u() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class v extends BroadcastReceiver {
        v() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                return;
            }
            String action = intent.getAction();
            if (action.equals("com.wufun.get.downFinish")) {
                BaseAppCompatActivity.this.showDownFinishPre(intent.getStringExtra("gameid"));
            } else if (action.equals("com.wufun.get.permission")) {
                u uVar = new u();
                uVar.f1455a = intent.getStringExtra(GameDetailPermissionActivity_.f31670g);
                uVar.f1456b = intent.getStringExtra(TTDownloadField.TT_FILE_PATH);
                Message message = new Message();
                message.what = 2;
                message.obj = uVar;
                BaseAppCompatActivity.this.handlerx.sendMessageDelayed(message, 500L);
            }
        }
    }

    /* loaded from: classes2.dex */
    class w extends CountDownTimer {
        public w(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            try {
                BaseAppCompatActivity baseAppCompatActivity = BaseAppCompatActivity.this;
                if (baseAppCompatActivity.popupWindow == null || baseAppCompatActivity == null || baseAppCompatActivity.isFinishing()) {
                    return;
                }
                v0.d("popwindow", "onFinish TimeCount dismiss");
                BaseAppCompatActivity.this.popupWindow.dismiss();
                BaseAppCompatActivity.this.popupWindow = null;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
        }
    }

    private void clearHiderListener() {
        com.join.mgps.wrapper.SystemUiHider.a aVar = this.uiHider;
        if (aVar != null) {
            aVar.d(null);
        }
        Handler handler = this.hideHandler;
        if (handler != null) {
            handler.removeCallbacks(this.hideRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getUNzipPermiss(String str, Context context) {
        try {
            new com.tbruyelle.rxpermissions2.c(this).r(com.kuaishou.weapon.p0.g.f55590j).subscribe(new j(context, str));
            UtilsMy.L3(this, com.kuaishou.weapon.p0.g.f55590j);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void initPopData(String str) {
        this.gameid = str;
        this.contentView.findViewById(R.id.main).setOnClickListener(new a(str));
        TextView textView = (TextView) this.contentView.findViewById(R.id.title);
        TextView textView2 = (TextView) this.contentView.findViewById(R.id.ok);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) this.contentView.findViewById(R.id.icon);
        TextView textView3 = (TextView) this.contentView.findViewById(R.id.info);
        ImageView imageView = (ImageView) this.contentView.findViewById(R.id.cancle);
        DownloadTask F = p1.f.K().F(str);
        if (Dtype.apk.name().equals(F.getFileType())) {
            textView3.setText("下载完成");
            this.isSo = true;
            com.papa.sim.statistic.p.l(this).O1(Event.showSoGameStart, new Ext().setGameId(F.getCrc_link_type_val()));
        } else {
            com.papa.sim.statistic.p.l(this).O1(Event.showSinGameStart, new Ext().setGameId(F.getCrc_link_type_val()));
            this.isSo = false;
            textView3.setText("安装完成");
        }
        MyImageLoader.h(simpleDraweeView, F.getPortraitURL());
        textView.setText(F.getShowName());
        textView2.setText("开始游戏");
        textView2.setOnClickListener(new b(F));
        imageView.setOnClickListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResume$0() {
        com.join.mgps.Util.p.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRecivied(Intent intent, Context context) {
        if (this.isInBackground) {
            return;
        }
        com.papa.sim.statistic.p.l(context).O1(Event.Unzip_nopermission, new Ext());
        Dialog dialog = this.dialogU;
        if (dialog == null) {
            this.dialog = new AlertDialog.Builder(context, R.style.AlertDialogCustom);
        } else if (dialog.isShowing()) {
            return;
        }
        this.dialog.setTitle("解压失败");
        this.dialog.setMessage("未获取到存储权限");
        this.dialog.setPositiveButton("去获取", new h(intent, context));
        this.dialog.setNegativeButton("取消", new i(intent, context));
        AlertDialog show = this.dialog.show();
        this.dialogU = show;
        if (show != null) {
            show.setCanceledOnTouchOutside(false);
            this.dialogU.setCancelable(false);
        }
    }

    @TargetApi(19)
    private void setTranslucentStatus(boolean z4) {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z4) {
            attributes.flags |= TTAdConstant.KEY_CLICK_AREA;
        } else {
            attributes.flags &= -67108865;
        }
        window.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnzipFailedStatus(String str) {
        if (TextUtils.equals(str, String.valueOf(ConstantIntEnum.PS2.value())) || TextUtils.equals(str, String.valueOf(ConstantIntEnum.N3DS.value()))) {
            DownloadTask F = p1.f.K().F(str);
            F.setStatus(13);
            p1.f.K().j0(F, F.getStatus());
            com.join.android.app.common.servcie.i.e().i(F);
            d0.a().c(new com.join.mgps.event.n(F, F.getStatus()));
        }
    }

    public static void setWindowStatusBarColor(Activity activity, int i4) {
        c2.q(activity, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDownFinish(String str) {
        if (this.isInBackground) {
            return;
        }
        try {
            if ((MApplication.f1497x.getActivity() instanceof ModGameIndexActivity) || (MApplication.f1497x.getActivity() instanceof GameMainActivity3_) || (MApplication.f1497x.getActivity() instanceof NewArenaMainActivty_) || (MApplication.f1497x.getActivity() instanceof EndGameLaunchActivity_) || (MApplication.f1497x.getActivity() instanceof DiscoveryPaiweiActivity_) || (MApplication.f1497x.getActivity() instanceof EndGameActivity_) || (MApplication.f1497x.getActivity() instanceof EndGameDetailActivity_) || (MApplication.f1497x.getActivity() instanceof EndGameLaunchActivity_)) {
                return;
            }
            b0.f0(this).H(str);
            this.hasDialog = true;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDownFinishPre(String str) {
        Message message = new Message();
        message.obj = str;
        message.what = 3;
        this.handlerx.sendMessageDelayed(message, 500L);
    }

    private void showOnlineCouponDialog() {
    }

    private synchronized void updateHider() {
        int i4;
        try {
            boolean z4 = this.fullScreenFlag;
            if (z4) {
                if (z4) {
                    i4 = 6;
                } else {
                    i4 = com.join.mgps.wrapper.a.f55010b < 11 ? 3 : 1;
                }
                this.fullScreenCfg = i4;
            } else {
                this.fullScreenCfg = 0;
            }
            if (this.fullScreenCfg != 0) {
                this.hideHandler = new Handler();
                this.hideRunnable = new q();
                com.join.mgps.wrapper.SystemUiHider.a a5 = com.join.mgps.wrapper.SystemUiHider.a.a(this, findViewById(16908290), this.fullScreenCfg);
                this.uiHider = a5;
                a5.e();
                this.uiHider.d(new r());
            }
            com.join.mgps.wrapper.SystemUiHider.a aVar = this.uiHider;
            if (aVar != null && aVar.c()) {
                this.uiHider.b();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.customview.LoadingLayout.b
    public void callBack() {
        showLoadingLayoutBase();
        loadDataBase();
    }

    public void createDB(String str) {
        p1.e.d(this).b(str);
    }

    public void dismissLoading() {
        com.join.android.app.common.dialog.e eVar = this.loading;
        if (eVar == null) {
            return;
        }
        try {
            eVar.dismiss();
        } catch (Exception unused) {
        }
    }

    public DatabaseHelper getHelper() {
        if (this.databaseHelper == null) {
            this.databaseHelper = p1.e.d(this).c();
        }
        return this.databaseHelper;
    }

    public int getLoadingLayoutResID() {
        return 0;
    }

    public int getLoadingMarginTop() {
        return c0.a(this, 48.0f);
    }

    public void hideKeyBoardHandler() {
    }

    public void hideLoadingLayoutBase() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new m());
        }
    }

    protected void hideUiDelayed() {
    }

    public boolean isHindeLoadingLayout() {
        return this.mLoadingLayout.e();
    }

    public void loadDataBase() {
    }

    @Override // com.join.mgps.customview.LoadingLayout.a
    public void noDataCallBack() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, @Nullable Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 != 10010 || Build.VERSION.SDK_INT < 26) {
            return;
        }
        boolean canRequestPackageInstalls = getPackageManager().canRequestPackageInstalls();
        if (g2.i(this.fialePath) && canRequestPackageInstalls) {
            this.handlerx.sendEmptyMessage(1);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.broadcasExt == null) {
            this.broadcasExt = new t();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(o1.a.f72038z);
            registerReceiver(this.broadcasExt, intentFilter);
        }
        this.prefDef_ = new PrefDef_(this);
        this.hasdestroyed = false;
        if (this.netBroadcastReceiver == null) {
            try {
                this.intentFilter12_.addAction(o1.a.f72015n0);
                this.intentFilter12_.addAction(o1.a.f72017o0);
                this.intentFilter12_.addAction(o1.a.N);
                registerReceiver(this.onReciviedReceiver_, this.intentFilter12_);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            NetBroadcastReceiver netBroadcastReceiver = new NetBroadcastReceiver();
            this.netBroadcastReceiver = netBroadcastReceiver;
            netBroadcastReceiver.a(new k());
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            registerReceiver(this.netBroadcastReceiver, intentFilter2);
        }
        setupKeyboardHandler(this);
        if (this.recver == null) {
            this.recver = new v();
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.wufun.get.permission");
            intentFilter3.addAction("com.wufun.get.downFinish");
            LocalBroadcastManager.getInstance(this).registerReceiver(this.recver, intentFilter3);
        }
        this.rangeTop = getResources().getDimensionPixelOffset(R.dimen.wdp200);
        this.rangeBottom = com.join.android.app.common.utils.n.n(this).k(this);
        if (this.adResultReceiver == null) {
            this.adResultReceiver = new EmuOutResultReceiver();
            IntentFilter intentFilter4 = new IntentFilter();
            intentFilter4.addAction(o1.a.V);
            intentFilter4.addAction(o1.a.G0);
            registerReceiver(this.adResultReceiver, intentFilter4);
        }
        com.join.mgps.va.overmind.d.o().S(getIntent());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.mHandler = null;
        }
        this.hasdestroyed = true;
        if (!isFinishing() && this.popupWindow != null) {
            v0.d("popwindow", "onDestroy  dismiss");
            this.popupWindow.dismiss();
            this.popupWindow = null;
        }
        unregisterReceiver(this.broadcasExt);
        unregisterReceiver(this.netBroadcastReceiver);
        unregisterReceiver(this.adResultReceiver);
        try {
            BroadcastReceiver broadcastReceiver = this.onReciviedReceiver_;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.recver);
        org.androidannotations.api.c.m(this).o(this);
        c2.d dVar = this.baiduChannelPermissionCallBack;
        if (dVar != null) {
            dVar.b();
        }
        super.onDestroy();
    }

    public void onFavoriteChanged(int i4, boolean z4) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onNetworkChanged(int i4) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        com.join.mgps.va.overmind.d.o().S(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.popupWindow != null && !this.hasdestroyed) {
            try {
                v0.d("popwindow", "onPause  dismiss");
                this.popupWindow.dismiss();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        c2.d dVar = this.baiduChannelPermissionCallBack;
        if (dVar != null) {
            dVar.b();
            this.baiduChannelPermissionCallBack.a();
        }
        this.isInBackground = true;
        clearHiderListener();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i4, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i4, strArr, iArr);
        if (strArr != null) {
            try {
                if (strArr.length <= 0 || com.papa.sim.statistic.pref.b.k(this).l()) {
                    return;
                }
                for (String str : strArr) {
                    if (str.equals(com.kuaishou.weapon.p0.g.f55583c)) {
                        com.papa.sim.statistic.pref.b.k(this).F(true);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        DownloadTask F;
        DownloadTask F2;
        super.onResume();
        this.hasDialog = false;
        v0.d("basappac", "onResume");
        this.isInBackground = false;
        if (!new PrefDef_(this).firstShowUserPermiss().d().booleanValue()) {
            q0.a(this);
        }
        if (this.mHandler == null) {
            this.mHandler = new Handler();
        }
        this.mHandler.postDelayed(new Runnable() { // from class: com.b
            @Override // java.lang.Runnable
            public final void run() {
                BaseAppCompatActivity.this.lambda$onResume$0();
            }
        }, 500L);
        org.androidannotations.api.c.m(this).r(this);
        if (this.isfirst) {
            this.isfirst = false;
            return;
        }
        PrefDef_ prefDef_ = new PrefDef_(this);
        String d5 = prefDef_.lastInstallApp().d();
        if (g2.i(d5) && (F2 = p1.f.K().F(d5)) != null && F2.getStatus() == 11 && !F2.getCrc_link_type_val().equals(new PrefDef_(this).lastShowTOUTIAOAd().d()) && !com.join.android.app.common.utils.e.l0(this).d(this, F2.getPackageName())) {
            if ((TextUtils.isEmpty(F2.getPackageName()) || !F2.getPackageName().equals(q1.f27991b)) && !(MApplication.f1497x.getActivity() instanceof ModGameIndexActivity)) {
                UnzipFailedDialog_.intent(this).gameId(F2.getCrc_link_type_val()).from(2).start();
            }
            this.hasDialog = true;
        }
        if (!this.hasDialog) {
            String d6 = prefDef_.lastInstallAppFinish().d();
            if (g2.i(d6) && (F = p1.f.K().F(d6)) != null) {
                String packageName = F.getPackageName();
                if (g2.i(d6) && !g2.h(packageName) && com.join.mgps.Util.g.e(this, packageName) && g2.i(F.getTips()) && !F.getTips().contains("网游")) {
                    showDownFinishPre(d6);
                    prefDef_.lastInstallAppFinish().g("");
                }
            }
        }
        if (!this.hasDialog && this.canShowFeedBack && !(this instanceof SimulatorExitPlayActivity_)) {
            this.hasDialog = b0.f0(this).e(this);
        }
        c2.d dVar = this.baiduChannelPermissionCallBack;
        if (dVar != null) {
            dVar.b();
        }
        UtilsMy.Q3(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        dismissLoading();
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z4) {
        com.join.mgps.wrapper.SystemUiHider.a aVar = this.uiHider;
        if (aVar != null) {
            if (z4 && this.fullScreenFlag) {
                aVar.b();
            } else {
                aVar.f();
            }
        }
        super.onWindowFocusChanged(z4);
    }

    void requestPermission(u uVar) {
        if (uVar == null || TextUtils.isEmpty(uVar.f1455a)) {
            return;
        }
        w0.e("request permission");
        String str = uVar.f1455a;
        if (ContextCompat.checkSelfPermission(this, str) == 0) {
            return;
        }
        UtilsMy.L3(this, str);
        if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
            String str2 = uVar.f1456b;
            if (g2.h(str2)) {
                return;
            }
            this.fialePath = str2;
            if (this.prefDef_.show_unknown_source().d().booleanValue() && Build.VERSION.SDK_INT >= 26) {
                com.join.mgps.dialog.d dVar = this.apkInstallDialog;
                if (dVar != null && dVar.isShowing()) {
                    this.apkInstallDialog.dismiss();
                }
                com.join.mgps.dialog.d dVar2 = new com.join.mgps.dialog.d(this);
                this.apkInstallDialog = dVar2;
                dVar2.b(new d(uVar));
                this.apkInstallDialog.show();
                return;
            }
            this.handlerx.sendEmptyMessage(1);
            return;
        }
        try {
            new com.tbruyelle.rxpermissions2.c(this).r(str).subscribe(new e());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void resolveStatusModeConflict() {
        Configuration configuration = getResources().getConfiguration();
        if (configuration != null && configuration.orientation == 2) {
            setSystemUiHide(true);
        } else {
            setSystemUiHide(false);
        }
        setStatusBar();
    }

    public void setChannelPermissionCallBack(c2.d dVar) {
        this.baiduChannelPermissionCallBack = dVar;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        setStatusBar();
        LoadingLayout loadingLayout = (LoadingLayout) LayoutInflater.from(this).inflate(R.layout.layout_papa_loading, (ViewGroup) null);
        this.mLoadingLayout = loadingLayout;
        String str = this.loadingHintMsg;
        if (str != null) {
            loadingLayout.setLoadingHintMsg(str);
        }
        int loadingLayoutResID = getLoadingLayoutResID();
        if (loadingLayoutResID > 0) {
            this.mLoadingLayout.b(getWindow().getDecorView().getRootView(), loadingLayoutResID);
            this.mLoadingLayout.setRefreshCallBackListener(this);
            this.mLoadingLayout.setLoadingLayoutMarginTop(getLoadingMarginTop());
        }
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public void setLoadingFailMsg(String str) {
        this.mLoadingLayout.setFailedMessage(str);
    }

    public void setLoadingHintMsg(String str) {
        this.loadingHintMsg = str;
    }

    public void setNoDataListener() {
        this.mLoadingLayout.setNoDataCallBackListener(this);
    }

    void setStatusBar() {
        String str = Build.BRAND;
        if (!"vivo".equals(str.toLowerCase()) && !"oppo".equals(str.toLowerCase())) {
            c2.o(this, -1, true);
            return;
        }
        c2.o(this, -8421505, true);
        c2.c(this, c2.d(this));
    }

    public void setSystemUiHide(boolean z4) {
        this.fullScreenFlag = z4;
        updateHider();
        if (this.uiHider != null) {
            findViewById(16908290).getSystemUiVisibility();
            if (this.fullScreenFlag) {
                if (this.uiHider.c()) {
                    this.uiHider.b();
                    return;
                }
                return;
            }
            if (!this.uiHider.c()) {
                this.uiHider.f();
            }
            this.uiHider.f();
        }
    }

    public void setTextViewNoData(String str) {
        LoadingLayout loadingLayout = this.mLoadingLayout;
        if (loadingLayout != null) {
            loadingLayout.setTextViewNoData(str);
        }
    }

    public void setmLoadingHintMsgLoading(String str) {
        this.mLoadingLayout.setLoadingHintMsg(str);
    }

    public void setupKeyboardHandler(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(new s(decorView.getRootView()));
    }

    public void showFailLayoutBase() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new o());
        }
    }

    public void showKeyBoardHandler() {
    }

    public void showLoading() {
        com.join.android.app.common.dialog.e eVar = new com.join.android.app.common.dialog.e(this);
        this.loading = eVar;
        eVar.show();
    }

    public void showLoadingLayoutBase() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new l());
        }
    }

    public void showNoDataLayoutBase() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new n());
        }
    }

    public void showNoDataLayoutTwo() {
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new p());
        }
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        setStatusBar();
        LoadingLayout loadingLayout = (LoadingLayout) LayoutInflater.from(this).inflate(R.layout.layout_papa_loading, (ViewGroup) null);
        this.mLoadingLayout = loadingLayout;
        String str = this.loadingHintMsg;
        if (str != null) {
            loadingLayout.setLoadingHintMsg(str);
        }
        int loadingLayoutResID = getLoadingLayoutResID();
        if (loadingLayoutResID > 0) {
            this.mLoadingLayout.b(getWindow().getDecorView().getRootView(), loadingLayoutResID);
            this.mLoadingLayout.setRefreshCallBackListener(this);
            this.mLoadingLayout.setLoadingLayoutMarginTop(getLoadingMarginTop());
        }
        this.mHandler = new Handler(Looper.getMainLooper());
    }
}
