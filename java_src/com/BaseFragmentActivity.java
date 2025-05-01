package com;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
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
import com.join.mgps.activity.MiniGameLoadingActivity;
import com.join.mgps.activity.ModGameIndexActivity;
import com.join.mgps.activity.NewArenaMainActivty_;
import com.join.mgps.activity.PrivateDomainDefaultActivity;
import com.join.mgps.activity.PrivateDomainDownloadActivity;
import com.join.mgps.activity.mygame.dialog.UnzipFailedDialog;
import com.join.mgps.activity.mygame.dialog.UnzipFailedDialog_;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import io.reactivex.functions.Consumer;
import java.io.File;
/* loaded from: classes2.dex */
public class BaseFragmentActivity extends FragmentActivity {
    public static final int PERMISSION_INSTALL_RESULT_CODE = 10010;
    com.join.mgps.dialog.d apkInstallDialog;
    private c2.d baiduChannelPermissionCallBack;
    private n broadcasExt;
    View contentView;
    Dialog dialogU;
    String fialePath;
    String gameid;
    GestureDetector gestureDetector;
    AlertDialog permissionDialog;
    PopupWindow popupWindow;
    PrefDef_ prefDef_;
    p recver;
    private q time;
    private Handler mHandler = new Handler();
    boolean hasdestroyed = false;
    boolean isfirst = true;
    boolean isInBackground = false;
    long lastShowPopTime = 0;
    boolean isSo = false;
    AlertDialog.Builder dialog = null;
    private Handler handlerx = new m();
    private final IntentFilter intentFilter12_ = new IntentFilter();
    private final BroadcastReceiver onReciviedReceiver_ = new a();

    /* loaded from: classes2.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (o1.a.f72015n0.equals(intent.getAction())) {
                BaseFragmentActivity.this.onRecivied(intent, context);
                return;
            }
            BaseFragmentActivity baseFragmentActivity = BaseFragmentActivity.this;
            if (baseFragmentActivity.isInBackground) {
                return;
            }
            b0.f0(baseFragmentActivity).P(BaseFragmentActivity.this, intent.getStringExtra("gameid"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class b implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f1461b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f1462c;

        b(Intent intent, Context context) {
            this.f1461b = intent;
            this.f1462c = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
            BaseFragmentActivity.this.getUNzipPermiss(this.f1461b.getStringExtra("gameId"), BaseFragmentActivity.this);
            com.papa.sim.statistic.p.l(this.f1462c).O1(Event.Unzip_getpermission, new Ext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class c implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f1464b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Context f1465c;

        c(Intent intent, Context context) {
            this.f1464b = intent;
            this.f1465c = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
            BaseFragmentActivity.this.setUnzipFailedStatus(this.f1464b.getStringExtra("gameId"));
            com.papa.sim.statistic.p.l(this.f1465c).O1(Event.Unzip_cancelpermission, new Ext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class d implements Consumer<com.tbruyelle.rxpermissions2.b> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f1467b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f1468c;

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
                intent.setData(Uri.fromParts("package", BaseFragmentActivity.this.getPackageName(), null));
                BaseFragmentActivity.this.startActivity(intent);
            }
        }

        d(Context context, String str) {
            this.f1467b = context;
            this.f1468c = str;
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
            if (bVar.f62140b) {
                if (ContextCompat.checkSelfPermission(this.f1467b, com.kuaishou.weapon.p0.g.f55590j) == 0) {
                    com.papa.sim.statistic.p.l(this.f1467b).O1(Event.Unzip_permissionsuccess, new Ext());
                    DownloadTask F = p1.f.K().F(this.f1468c);
                    if (F != null) {
                        if (Integer.parseInt(F.getPlugin_num()) == ConstantIntEnum.MGAME.value()) {
                            com.join.android.app.common.servcie.i.e().r(this.f1467b, F, false);
                        } else {
                            com.join.android.app.common.servcie.i.e().r(this.f1467b, F, true);
                        }
                    }
                }
            } else if (bVar.f62141c) {
                BaseFragmentActivity.this.setUnzipFailedStatus(this.f1468c);
            } else {
                BaseFragmentActivity.this.setUnzipFailedStatus(this.f1468c);
                BaseFragmentActivity baseFragmentActivity = BaseFragmentActivity.this;
                Dialog dialog = baseFragmentActivity.dialogU;
                if (dialog == null) {
                    baseFragmentActivity.dialog = new AlertDialog.Builder(baseFragmentActivity, R.style.AlertDialogCustom);
                } else if (dialog.isShowing()) {
                    return;
                }
                BaseFragmentActivity.this.dialog.setTitle("提示");
                if (!bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55590j) && !bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55589i)) {
                    BaseFragmentActivity.this.dialog.setMessage("请去设置中开启权限");
                } else {
                    BaseFragmentActivity.this.dialog.setMessage("需要打开读写存储权限，请去设置中开启权限");
                }
                BaseFragmentActivity.this.dialog.setPositiveButton("去打开", new a());
                BaseFragmentActivity baseFragmentActivity2 = BaseFragmentActivity.this;
                baseFragmentActivity2.dialogU = baseFragmentActivity2.dialog.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f1471b;

        e(String str) {
            this.f1471b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseFragmentActivity.this.popupWindow.dismiss();
            BaseFragmentActivity baseFragmentActivity = BaseFragmentActivity.this;
            baseFragmentActivity.popupWindow = null;
            if (baseFragmentActivity.isSo) {
                com.papa.sim.statistic.p.l(view.getContext()).O1(Event.enterSoStartMyGame, new Ext().setGameId(this.f1471b));
            } else {
                com.papa.sim.statistic.p.l(view.getContext()).O1(Event.enterSinStartMyGame, new Ext().setGameId(this.f1471b));
            }
            IntentUtil.getInstance().goMyGameManagerActivity(view.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DownloadTask f1473b;

        f(DownloadTask downloadTask) {
            this.f1473b = downloadTask;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BaseFragmentActivity.this.isSo) {
                com.papa.sim.statistic.p.l(view.getContext()).O1(Event.onclickSoGameStart, new Ext().setGameId(this.f1473b.getCrc_link_type_val()));
            } else {
                com.papa.sim.statistic.p.l(view.getContext()).O1(Event.onclickSinGameStart, new Ext().setGameId(this.f1473b.getCrc_link_type_val()));
            }
            UtilsMy.T3(view.getContext(), this.f1473b);
            BaseFragmentActivity.this.popupWindow.dismiss();
            BaseFragmentActivity.this.popupWindow = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseFragmentActivity.this.popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            BaseFragmentActivity.this.gestureDetector.onTouchEvent(motionEvent);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class i extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1477b;

        i(int i4) {
            this.f1477b = i4;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
            if (motionEvent.getX() - motionEvent2.getX() <= this.f1477b && motionEvent2.getX() - motionEvent.getX() <= this.f1477b && motionEvent.getY() - motionEvent2.getY() <= this.f1477b) {
                return motionEvent2.getY() - motionEvent.getY() > ((float) this.f1477b);
            }
            BaseFragmentActivity.this.popupWindow.dismiss();
            BaseFragmentActivity baseFragmentActivity = BaseFragmentActivity.this;
            baseFragmentActivity.popupWindow = null;
            if (baseFragmentActivity.isSo) {
                com.papa.sim.statistic.p.l(baseFragmentActivity.contentView.getContext()).O1(Event.exitSoGameStart, new Ext().setGameId(BaseFragmentActivity.this.gameid));
            } else {
                com.papa.sim.statistic.p.l(baseFragmentActivity.contentView.getContext()).O1(Event.exitSinGameStart, new Ext().setGameId(BaseFragmentActivity.this.gameid));
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    class j implements Consumer<com.tbruyelle.rxpermissions2.b> {
        j() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
            boolean z4 = bVar.f62140b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class k implements w1.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f1480a;

        /* loaded from: classes2.dex */
        class a implements Consumer<com.tbruyelle.rxpermissions2.b> {
            a() {
            }

            @Override // io.reactivex.functions.Consumer
            /* renamed from: a */
            public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
                if (bVar.f62139a.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                    k kVar = k.this;
                    String str = kVar.f1480a.f1488b;
                    if (str != null) {
                        BaseFragmentActivity.this.fialePath = str;
                    }
                    BaseFragmentActivity.this.handlerx.sendEmptyMessage(1);
                }
            }
        }

        k(o oVar) {
            this.f1480a = oVar;
        }

        @Override // w1.c
        public void onClickCancle() {
            new com.tbruyelle.rxpermissions2.c(BaseFragmentActivity.this).r("android.permission.REQUEST_INSTALL_PACKAGES").subscribe(new a());
        }

        @Override // w1.c
        public void onClickOk() {
            BaseFragmentActivity.this.startActivityForResult(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + BaseFragmentActivity.this.getPackageName())), 10010);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class l implements Consumer<com.tbruyelle.rxpermissions2.b> {

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
                intent.setData(Uri.fromParts("package", BaseFragmentActivity.this.getPackageName(), null));
                BaseFragmentActivity.this.startActivity(intent);
            }
        }

        l() {
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
            } else if (bVar.f62141c) {
            } else {
                BaseFragmentActivity baseFragmentActivity = BaseFragmentActivity.this;
                Dialog dialog = baseFragmentActivity.dialogU;
                if (dialog == null) {
                    baseFragmentActivity.dialog = new AlertDialog.Builder(baseFragmentActivity, R.style.AlertDialogCustom);
                } else if (dialog.isShowing()) {
                    return;
                }
                BaseFragmentActivity.this.dialog.setTitle("提示");
                if (!bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55590j) && !bVar.f62139a.equals(com.kuaishou.weapon.p0.g.f55589i)) {
                    BaseFragmentActivity.this.dialog.setMessage("请去设置中开启权限");
                } else {
                    BaseFragmentActivity.this.dialog.setMessage("需要打开读写存储权限，请去设置中开启权限");
                }
                BaseFragmentActivity.this.dialog.setPositiveButton("去打开", new a());
                BaseFragmentActivity baseFragmentActivity2 = BaseFragmentActivity.this;
                baseFragmentActivity2.dialogU = baseFragmentActivity2.dialog.show();
            }
        }
    }

    /* loaded from: classes2.dex */
    class m extends Handler {
        m() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                int i4 = message.what;
                if (i4 == 1) {
                    com.join.android.app.common.utils.e.l0(BaseFragmentActivity.this).y(BaseFragmentActivity.this, new File(BaseFragmentActivity.this.fialePath));
                } else if (i4 == 3) {
                    try {
                        BaseFragmentActivity.this.showDownFinish((String) message.obj);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } else {
                    BaseFragmentActivity baseFragmentActivity = BaseFragmentActivity.this;
                    if (baseFragmentActivity.isInBackground) {
                        return;
                    }
                    baseFragmentActivity.requestPermission((o) message.obj);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class n extends BroadcastReceiver {
        n() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BaseFragmentActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class o {

        /* renamed from: a  reason: collision with root package name */
        public String f1487a;

        /* renamed from: b  reason: collision with root package name */
        public String f1488b;

        o() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class p extends BroadcastReceiver {
        p() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                return;
            }
            String action = intent.getAction();
            if (action.equals("com.wufun.get.downFinish")) {
                BaseFragmentActivity.this.showDownFinishPre(intent.getStringExtra("gameid"));
            } else if (action.equals("com.wufun.get.permission")) {
                o oVar = new o();
                oVar.f1487a = intent.getStringExtra(GameDetailPermissionActivity_.f31670g);
                oVar.f1488b = intent.getStringExtra(TTDownloadField.TT_FILE_PATH);
                Message message = new Message();
                message.what = 2;
                message.obj = oVar;
                BaseFragmentActivity.this.handlerx.sendMessageDelayed(message, 500L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class q extends CountDownTimer {
        public q(long j4, long j5) {
            super(j4, j5);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            BaseFragmentActivity baseFragmentActivity = BaseFragmentActivity.this;
            if (baseFragmentActivity.popupWindow == null || baseFragmentActivity == null || baseFragmentActivity.isFinishing()) {
                return;
            }
            BaseFragmentActivity.this.popupWindow.dismiss();
            BaseFragmentActivity.this.popupWindow = null;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getUNzipPermiss(String str, Context context) {
        try {
            new com.tbruyelle.rxpermissions2.c(this).r(com.kuaishou.weapon.p0.g.f55590j).subscribe(new d(context, str));
            UtilsMy.L3(this, com.kuaishou.weapon.p0.g.f55590j);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void initPopData(String str) {
        View findViewById = this.contentView.findViewById(R.id.main);
        this.gameid = str;
        findViewById.setOnClickListener(new e(str));
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
        textView2.setOnClickListener(new f(F));
        imageView.setOnClickListener(new g());
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
        this.dialog.setPositiveButton("去获取", new b(intent, context));
        this.dialog.setNegativeButton("取消", new c(intent, context));
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
        DownloadTask F = p1.f.K().F(str);
        boolean z4 = true;
        boolean z5 = F != null && APKUtils.L(F);
        if (!this.isInBackground || z5) {
            try {
                if (System.currentTimeMillis() - this.lastShowPopTime <= 2000 || (MApplication.f1497x.getActivity() instanceof ModGameIndexActivity) || (MApplication.f1497x.getActivity() instanceof GameMainActivity3_) || (MApplication.f1497x.getActivity() instanceof NewArenaMainActivty_) || (MApplication.f1497x.getActivity() instanceof MiniGameLoadingActivity) || (MApplication.f1497x.getActivity() instanceof PrivateDomainDownloadActivity) || (MApplication.f1497x.getActivity() instanceof PrivateDomainDefaultActivity) || (MApplication.f1497x.getActivity() instanceof UnzipFailedDialog) || (MApplication.f1497x.getActivity() instanceof EndGameLaunchActivity_) || (MApplication.f1497x.getActivity() instanceof DiscoveryPaiweiActivity_) || (MApplication.f1497x.getActivity() instanceof EndGameActivity_) || (MApplication.f1497x.getActivity() instanceof EndGameDetailActivity_) || (MApplication.f1497x.getActivity() instanceof EndGameLaunchActivity_)) {
                    return;
                }
                if (!z5) {
                    q qVar = this.time;
                    if (qVar != null) {
                        qVar.onFinish();
                    } else {
                        this.time = new q(com.join.mgps.data.c.f49010a, 1000L);
                    }
                    this.time.start();
                }
                if (z5) {
                    b0.f0(this).H(str);
                    return;
                }
                PopupWindow popupWindow = this.popupWindow;
                if (popupWindow != null) {
                    if (!popupWindow.isShowing() && System.currentTimeMillis() - this.lastShowPopTime > 5000) {
                        v0.d("popwindow", "33333333333");
                        PopupWindow popupWindow2 = this.popupWindow;
                        View view = this.contentView;
                        com.join.android.app.common.utils.n.n(this);
                        popupWindow2.showAtLocation(view, 48, 0, com.join.android.app.common.utils.n.v(this));
                        this.lastShowPopTime = System.currentTimeMillis();
                    }
                } else {
                    if (F != null && q1.f(F.getPackageName())) {
                        z4 = false;
                    }
                    if (z4) {
                        showPopwindow();
                    }
                }
                initPopData(str);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDownFinishPre(String str) {
        Message message = new Message();
        message.obj = str;
        message.what = 3;
        this.handlerx.sendMessageDelayed(message, 300L);
    }

    private void showPopwindow() {
        this.contentView = LayoutInflater.from(this).inflate(R.layout.appdown_finish_dialog_layout, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(this.contentView, -1, -2);
        this.popupWindow = popupWindow;
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        this.popupWindow.setOutsideTouchable(false);
        this.popupWindow.setTouchable(true);
        this.popupWindow.setAnimationStyle(R.style.ClickToast);
        this.popupWindow.setTouchInterceptor(new h());
        int dimensionPixelOffset = this.contentView.getContext().getResources().getDimensionPixelOffset(R.dimen.wdp30);
        if (this.gestureDetector == null) {
            this.gestureDetector = new GestureDetector(this.contentView.getContext(), new i(dimensionPixelOffset));
        }
        if (this.popupWindow.isShowing() || System.currentTimeMillis() - this.lastShowPopTime <= 5000) {
            return;
        }
        PopupWindow popupWindow2 = this.popupWindow;
        View view = this.contentView;
        com.join.android.app.common.utils.n.n(this);
        popupWindow2.showAtLocation(view, 48, 0, com.join.android.app.common.utils.n.v(this));
        this.lastShowPopTime = System.currentTimeMillis();
    }

    public boolean checkPermiss(String str) {
        return ContextCompat.checkSelfPermission(this, str) == 0;
    }

    public void getPermison(String str) {
        o oVar = new o();
        oVar.f1487a = str;
        requestPermission(oVar);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.hasdestroyed = false;
        this.broadcasExt = new n();
        this.prefDef_ = new PrefDef_(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(o1.a.f72038z);
        registerReceiver(this.broadcasExt, intentFilter);
        try {
            this.intentFilter12_.addAction(o1.a.f72015n0);
            this.intentFilter12_.addAction(o1.a.f72017o0);
            registerReceiver(this.onReciviedReceiver_, this.intentFilter12_);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.recver = new p();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.wufun.get.permission");
        intentFilter2.addAction("com.wufun.get.downFinish");
        LocalBroadcastManager.getInstance(this).registerReceiver(this.recver, intentFilter2);
        com.join.mgps.va.overmind.d.o().S(getIntent());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        PopupWindow popupWindow;
        try {
            super.onDestroy();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (!isFinishing() && (popupWindow = this.popupWindow) != null) {
            popupWindow.dismiss();
            this.popupWindow = null;
        }
        c2.d dVar = this.baiduChannelPermissionCallBack;
        if (dVar != null) {
            dVar.b();
        }
        this.hasdestroyed = true;
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.recver);
        try {
            unregisterReceiver(this.broadcasExt);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            BroadcastReceiver broadcastReceiver = this.onReciviedReceiver_;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
            }
        } catch (Exception e7) {
            e7.printStackTrace();
        }
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
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null && !this.hasdestroyed) {
            try {
                popupWindow.dismiss();
                this.popupWindow = null;
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
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        DownloadTask F;
        DownloadTask F2;
        super.onResume();
        boolean z4 = false;
        this.isInBackground = false;
        if (!new PrefDef_(this).firstShowUserPermiss().d().booleanValue()) {
            q0.a(this);
        }
        if (this.mHandler == null) {
            this.mHandler = new Handler();
        }
        this.mHandler.postDelayed(new Runnable() { // from class: com.d
            @Override // java.lang.Runnable
            public final void run() {
                BaseFragmentActivity.this.lambda$onResume$0();
            }
        }, 500L);
        PrefDef_ prefDef_ = new PrefDef_(this);
        if (this.isfirst) {
            this.isfirst = false;
            return;
        }
        String d5 = prefDef_.lastInstallApp().d();
        if (g2.i(d5) && (F2 = p1.f.K().F(d5)) != null && F2.getStatus() == 11 && !F2.getCrc_link_type_val().equals(new PrefDef_(this).lastShowTOUTIAOAd().d()) && !com.join.android.app.common.utils.e.l0(this).d(this, F2.getPackageName()) && ((TextUtils.isEmpty(F2.getPackageName()) || !F2.getPackageName().equals(q1.f27991b)) && !(MApplication.f1497x.getActivity() instanceof ModGameIndexActivity))) {
            UnzipFailedDialog_.intent(this).gameId(F2.getCrc_link_type_val()).from(2).start();
            z4 = true;
        }
        if (!z4) {
            String d6 = prefDef_.lastInstallAppFinish().d();
            if (g2.i(d6) && (F = p1.f.K().F(d6)) != null) {
                String packageName = F.getPackageName();
                if (g2.i(d6) && !g2.h(packageName) && com.join.mgps.Util.g.e(this, packageName) && g2.i(F.getTips()) && !F.getTips().contains("网游")) {
                    showDownFinishPre(d6);
                    prefDef_.lastInstallAppFinish().g("");
                }
            }
        }
        c2.d dVar = this.baiduChannelPermissionCallBack;
        if (dVar != null) {
            dVar.b();
        }
        UtilsMy.Q3(this);
    }

    void requestPermission(o oVar) {
        if (oVar == null || TextUtils.isEmpty(oVar.f1487a)) {
            return;
        }
        w0.e("request permission");
        String str = oVar.f1487a;
        if (ContextCompat.checkSelfPermission(this, str) == 0) {
            return;
        }
        UtilsMy.L3(this, str);
        AlertDialog alertDialog = this.permissionDialog;
        if (alertDialog != null) {
            alertDialog.show();
        }
        if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
            String str2 = oVar.f1488b;
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
                dVar2.b(new k(oVar));
                this.apkInstallDialog.show();
                return;
            }
            this.handlerx.sendEmptyMessage(1);
            return;
        }
        try {
            new com.tbruyelle.rxpermissions2.c(this).r(str).subscribe(new l());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void setChannelPermissionCallBack(c2.d dVar) {
        this.baiduChannelPermissionCallBack = dVar;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        String str = Build.BRAND;
        if (!"vivo".equals(str.toLowerCase()) && !"oppo".equals(str.toLowerCase())) {
            c2.o(this, -1, true);
            return;
        }
        c2.o(this, -8421505, true);
        c2.c(this, c2.d(this));
    }

    public boolean checkPermiss(String... strArr) {
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(this, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public void getPermison(String... strArr) {
        try {
            new com.tbruyelle.rxpermissions2.c(this).r(strArr).subscribe(new j());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        String str = Build.BRAND;
        if (!"vivo".equals(str.toLowerCase()) && !"oppo".equals(str.toLowerCase())) {
            c2.o(this, -1, true);
            return;
        }
        c2.o(this, -8421505, true);
        c2.c(this, c2.d(this));
    }
}
