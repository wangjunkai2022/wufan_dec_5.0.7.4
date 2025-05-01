package com.join.mgps.activity.mygame.dialog;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.BaseActivity;
import com.MApplication;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.github.snowdream.android.app.downloader.b;
import com.github.snowdream.android.app.downloader.c;
import com.join.android.app.common.servcie.i;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.d0;
import com.join.mgps.Util.g0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.v;
import com.join.mgps.Util.v0;
import com.join.mgps.Util.w0;
import com.join.mgps.Util.w2;
import com.join.mgps.dto.QueryDownloadInfoRequestArgs;
import com.join.mgps.dto.QueryDownloadInfoResponseData;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.event.n;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa.sim.statistic.p;
import com.papa91.arc.ext.ToastManager;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.lingala.zip4j.util.e;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import p1.f;
@EActivity(R.layout.plugdown_dialog_layout)
/* loaded from: classes.dex */
public class PlugDownDialogAcitivity extends BaseActivity {
    private static b factory;
    static b.InterfaceC0290b listener;
    private static Map<String, c> tasks = new ConcurrentHashMap(0);
    @ViewById
    TextView appSize;
    IStartEmuGameCallback callback;
    @ViewById
    TextView cancle;
    DownloadTask downloadTask;
    List<DownloadTask> downloadTasks;
    @Extra
    int downloadType = 1;
    DownloadTask gameTask;
    @Extra
    String gameid;
    @ViewById
    TextView info;
    DownloadTask lastGame;
    @ViewById
    TextView lodingInfo;
    @ViewById
    TextView ok;
    @Extra
    String plugNumber;
    @ViewById
    ProgressBar progressBar;
    @ViewById
    ProgressBar progressBarZip;
    @ViewById
    TextView title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface IStartEmuGameCallback {
        void onStartEmuGame();
    }

    /* loaded from: classes4.dex */
    public class UNZIPResThread extends Thread {
        private DownloadTask mDownloadTask;
        ProgressMonitor progressMonitor = null;
        long initSize = 0;

        /* loaded from: classes4.dex */
        class ProgressMonitor extends Thread {
            File mFile;
            private boolean monitor = true;

            public ProgressMonitor(File file) {
                this.mFile = file;
                UNZIPResThread.this.initSize = UtilsMy.J1(file);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                super.run();
                while (this.monitor && UNZIPResThread.this.mDownloadTask != null) {
                    try {
                        File file = this.mFile;
                        if (file != null) {
                            long J1 = UtilsMy.J1(file);
                            StringBuilder sb = new StringBuilder();
                            sb.append("zip currentSize =");
                            sb.append(J1);
                            long res_actual_size = UNZIPResThread.this.mDownloadTask.getRes_actual_size() * 2;
                            if (res_actual_size <= 0) {
                                res_actual_size = 1;
                            }
                            UNZIPResThread uNZIPResThread = UNZIPResThread.this;
                            PlugDownDialogAcitivity plugDownDialogAcitivity = PlugDownDialogAcitivity.this;
                            long j4 = uNZIPResThread.initSize;
                            plugDownDialogAcitivity.updateUnzipRes(J1 - j4, res_actual_size, (int) (((J1 - j4) * 100) / res_actual_size));
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("totalSize=");
                            sb2.append(res_actual_size);
                            sb2.append(";zip progress =");
                            sb2.append(UNZIPResThread.this.mDownloadTask.getProgress());
                            Thread.sleep(1000L);
                        }
                    } catch (InterruptedException e5) {
                        e5.printStackTrace();
                        this.monitor = false;
                        return;
                    }
                }
            }

            public void setMonitor(boolean z4) {
                this.monitor = z4;
            }
        }

        public UNZIPResThread(DownloadTask downloadTask, Context context) {
            this.mDownloadTask = downloadTask;
        }

        boolean hasResource() {
            try {
                DownloadTask downloadTask = this.mDownloadTask;
                if (downloadTask != null && !TextUtils.isEmpty(downloadTask.getResource_url_remote()) && !TextUtils.isEmpty(this.mDownloadTask.getResource_path()) && (this.mDownloadTask.getResource_path().endsWith(".zip") || this.mDownloadTask.getResource_path().endsWith(".zip/"))) {
                    File file = new File(this.mDownloadTask.getResource_path());
                    if (file.exists()) {
                        return file.isFile();
                    }
                    return false;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return false;
        }

        @Override // java.lang.Thread
        public void interrupt() {
            super.interrupt();
            DownloadTask downloadTask = this.mDownloadTask;
            if (downloadTask != null) {
                downloadTask.set_from_type(0);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            File file;
            Exception e5;
            IStartEmuGameCallback iStartEmuGameCallback;
            super.run();
            File file2 = null;
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    try {
                        if (hasResource()) {
                            file = new File(this.mDownloadTask.getResource_path());
                            try {
                                ProgressMonitor progressMonitor = new ProgressMonitor(file.getParentFile());
                                this.progressMonitor = progressMonitor;
                                progressMonitor.start();
                                w2.f(file, file.getParent(), this.mDownloadTask.getPackageName());
                                file2 = file;
                            } catch (Exception e6) {
                                e5 = e6;
                                e5.printStackTrace();
                                ProgressMonitor progressMonitor2 = this.progressMonitor;
                                if (progressMonitor2 != null) {
                                    progressMonitor2.setMonitor(false);
                                }
                                ProgressMonitor progressMonitor3 = this.progressMonitor;
                                if (progressMonitor3 != null) {
                                    progressMonitor3.setMonitor(false);
                                }
                                if (file != null) {
                                    UtilsMy.delete(file);
                                }
                                this.mDownloadTask.set_from_type(0);
                                IStartEmuGameCallback iStartEmuGameCallback2 = PlugDownDialogAcitivity.this.callback;
                                if (iStartEmuGameCallback2 != null) {
                                    iStartEmuGameCallback2.onStartEmuGame();
                                    return;
                                }
                                return;
                            }
                        }
                        ProgressMonitor progressMonitor4 = this.progressMonitor;
                        if (progressMonitor4 != null) {
                            progressMonitor4.setMonitor(false);
                        }
                        if (file2 != null) {
                            UtilsMy.delete(file2);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("romsPath6-");
                        sb.append(this.mDownloadTask.getGameZipPath());
                        this.mDownloadTask.setStatus(5);
                        f.K().m(PlugDownDialogAcitivity.this.downloadTask);
                        DownloadTask downloadTask = this.mDownloadTask;
                        if (downloadTask != null && downloadTask.getResource_path() != null) {
                            try {
                                g0.A(".downloadTask", new File(this.mDownloadTask.getResource_path()).getParent(), JsonMapper.getInstance().toJson(this.mDownloadTask));
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        this.mDownloadTask.set_from_type(0);
                        iStartEmuGameCallback = PlugDownDialogAcitivity.this.callback;
                        if (iStartEmuGameCallback == null) {
                            return;
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                        this.mDownloadTask.set_from_type(0);
                        iStartEmuGameCallback = PlugDownDialogAcitivity.this.callback;
                        if (iStartEmuGameCallback == null) {
                            return;
                        }
                    }
                    iStartEmuGameCallback.onStartEmuGame();
                } catch (Throwable th2) {
                    this.mDownloadTask.set_from_type(0);
                    IStartEmuGameCallback iStartEmuGameCallback3 = PlugDownDialogAcitivity.this.callback;
                    if (iStartEmuGameCallback3 != null) {
                        iStartEmuGameCallback3.onStartEmuGame();
                    }
                    throw th2;
                }
            } catch (Exception e9) {
                file = null;
                e5 = e9;
            } catch (Throwable th3) {
                th = th3;
                ProgressMonitor progressMonitor5 = this.progressMonitor;
                if (progressMonitor5 != null) {
                    progressMonitor5.setMonitor(false);
                }
                if (0 != 0) {
                    UtilsMy.delete(null);
                }
                throw th;
            }
        }
    }

    private void checkAndDownRes() {
        DownloadTask downloadTask = this.gameTask;
        if (downloadTask != null && !downloadTask.isUncheckSelfSupport() && this.gameTask.getSp_tag_info() != null && this.gameTask.getSp_tag_info().getSelf_support() == null) {
            downloadGameNotSelfSupport(this.gameid, this.gameTask);
        } else {
            startDownloadRes(this.gameTask.getResource_url_remote());
        }
    }

    private String getResFileName(String str) {
        String substring = str.substring(str.lastIndexOf(e.F0) + 1, str.length());
        if (substring.length() > 50) {
            if (substring.contains("?")) {
                return substring.substring(0, substring.indexOf("?"));
            }
            return substring.substring(0, 45);
        }
        return substring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void normalStartGame() {
        DownloadTask downloadTask = this.lastGame;
        if (downloadTask != null && downloadTask.getStatus() == 5) {
            this.gameTask.setCheckRes(false);
            UtilsMy.V3(this, this.gameTask, 0, "");
            p.l(this).O1(Event.StartgameLoadFininsh, new Ext());
        }
        finish();
    }

    private void receiveDelete(DownloadTask downloadTask) {
        notifyUi();
    }

    private void receiveError(DownloadTask downloadTask) {
        try {
            notifyUi();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        notifyUi();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        try {
            this.downloadTasks = f.K().d();
            if (g2.i(this.gameid)) {
                this.lastGame = f.K().F(this.gameid);
            } else {
                for (DownloadTask downloadTask2 : this.downloadTasks) {
                    if (downloadTask2.getPlugin_num().equals(this.plugNumber) && !this.plugNumber.equals(downloadTask2.getCrc_link_type_val()) && downloadTask2.getStatus() == 5) {
                        int i4 = (downloadTask2.getFinishTime() > 0L ? 1 : (downloadTask2.getFinishTime() == 0L ? 0 : -1));
                        this.lastGame = downloadTask2;
                    }
                }
            }
            DownloadTask downloadTask3 = this.lastGame;
            if (downloadTask3 != null) {
                this.title.setText(downloadTask3.getShowName());
            }
            TextView textView = this.appSize;
            textView.setText(downloadTask.getShowName() + "初始化完成");
            this.lodingInfo.setText("");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        notifyUi();
    }

    private void startDownloadRes(String str) {
        DownloadTask downloadTask = this.gameTask;
        if (downloadTask == null) {
            IStartEmuGameCallback iStartEmuGameCallback = this.callback;
            if (iStartEmuGameCallback != null) {
                iStartEmuGameCallback.onStartEmuGame();
                return;
            } else {
                finish();
                return;
            }
        }
        String name = downloadTask.getName();
        if (g2.h(name)) {
            name = getResFileName(str);
        }
        c cVar = new c(str, name, v.f28107g + this.gameTask.getRomType() + "/roms", 0L);
        factory.b(cVar);
        if (tasks == null) {
            IStartEmuGameCallback iStartEmuGameCallback2 = this.callback;
            if (iStartEmuGameCallback2 != null) {
                iStartEmuGameCallback2.onStartEmuGame();
            }
        } else if (cVar.l() != null && !cVar.l().equals("")) {
            String l4 = cVar.l();
            if (tasks.get(cVar.l()) != null) {
                IStartEmuGameCallback iStartEmuGameCallback3 = this.callback;
                if (iStartEmuGameCallback3 != null) {
                    iStartEmuGameCallback3.onStartEmuGame();
                    return;
                }
                return;
            }
            synchronized (tasks) {
                tasks.put(l4, cVar);
            }
        } else {
            IStartEmuGameCallback iStartEmuGameCallback4 = this.callback;
            if (iStartEmuGameCallback4 != null) {
                iStartEmuGameCallback4.onStartEmuGame();
            }
        }
    }

    private void updateProgressPartly() {
        DownloadTask f5 = i.e().f(this.downloadTask.getCrc_link_type_val());
        long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
        if (this.downloadTask.getSize() == 0) {
            TextView textView = this.appSize;
            textView.setText("正在下载（" + UtilsMy.a(f5.getCurrentSize()) + e.F0 + UtilsMy.a(parseDouble) + ")");
        } else {
            TextView textView2 = this.appSize;
            textView2.setText("正在下载（" + UtilsMy.a(f5.getCurrentSize()) + e.F0 + UtilsMy.a(parseDouble) + ")");
        }
        if (this.downloadTask.getStatus() == 12) {
            this.progressBarZip.setProgress((int) f5.getProgress());
        } else {
            this.progressBar.setProgress((int) f5.getProgress());
        }
        if (this.downloadTask.getStatus() == 2) {
            TextView textView3 = this.lodingInfo;
            textView3.setText(f5.getProgress() + "%");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        MApplication.U = true;
        v0.d("PlugDownDialogAcitivity", "PlugDownDialogAcitivity oncreate");
        d0.a().d(this);
        this.downloadTask = f.K().Z(Integer.parseInt(this.plugNumber));
        this.downloadTasks = f.K().d();
        if (this.downloadTask == null) {
            finish();
            return;
        }
        this.gameTask = f.K().F(this.gameid);
        int i4 = this.downloadType;
        if (i4 == 2 || i4 == 3) {
            initPreDownloadFactory();
            if (this.downloadType == 2) {
                this.callback = new IStartEmuGameCallback() { // from class: com.join.mgps.activity.mygame.dialog.PlugDownDialogAcitivity.1
                    @Override // com.join.mgps.activity.mygame.dialog.PlugDownDialogAcitivity.IStartEmuGameCallback
                    public void onStartEmuGame() {
                        PlugDownDialogAcitivity.this.normalStartGame();
                    }
                };
                checkAndDownRes();
            }
        }
        this.title.setText(this.downloadTask.getShowName());
        TextView textView = this.info;
        textView.setText("初次加载游戏需初始化" + UtilsMy.X1(Integer.parseInt(this.downloadTask.getPlugin_num())) + "资源文件，请稍后…");
        if (this.downloadTask.getStatus() == 5) {
            for (DownloadTask downloadTask : this.downloadTasks) {
                if (downloadTask.getPlugin_num().equals(this.plugNumber) && !this.plugNumber.equals(downloadTask.getCrc_link_type_val()) && downloadTask.getStatus() == 5) {
                    int i5 = (downloadTask.getFinishTime() > 0L ? 1 : (downloadTask.getFinishTime() == 0L ? 0 : -1));
                    this.lastGame = downloadTask;
                }
            }
            if (g2.i(this.gameid)) {
                this.lastGame = f.K().F(this.gameid);
            }
            DownloadTask downloadTask2 = this.lastGame;
            if (downloadTask2 != null) {
                this.title.setText(downloadTask2.getShowName());
            }
            TextView textView2 = this.appSize;
            textView2.setText(this.downloadTask.getShowName() + "初始化完成");
            p.l(this).O1(Event.showEmuLoadFininsh, new Ext());
        } else {
            p.l(this).O1(Event.showEmuLoading, new Ext());
        }
        notifyUi();
        getWindow().getDecorView().setSystemUiVisibility(1028);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void cancle() {
        finish();
        p.l(this).O1(Event.EmuLoadingBackground, new Ext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void downloadGameNotSelfSupport(String str, DownloadTask downloadTask) {
        if (j.j(this)) {
            try {
                String uid = AccountUtil_.getInstance_(this).getUid();
                String token = AccountUtil_.getInstance_(this).getToken();
                RequestModel<QueryDownloadInfoRequestArgs> requestModel = new RequestModel<>();
                requestModel.setDefault(this);
                QueryDownloadInfoRequestArgs queryDownloadInfoRequestArgs = new QueryDownloadInfoRequestArgs();
                queryDownloadInfoRequestArgs.setGameId(str);
                queryDownloadInfoRequestArgs.setUid(uid);
                queryDownloadInfoRequestArgs.setToken(token);
                requestModel.setArgs(queryDownloadInfoRequestArgs);
                ResponseModel<QueryDownloadInfoResponseData> q4 = com.join.mgps.rpc.impl.i.D0().q(requestModel);
                if (q4 != null && q4.getCode() == 600) {
                    if (q4.getData() == null) {
                        showTost("获取资源失败，请重新再试。");
                        IStartEmuGameCallback iStartEmuGameCallback = this.callback;
                        if (iStartEmuGameCallback != null) {
                            iStartEmuGameCallback.onStartEmuGame();
                            return;
                        }
                        return;
                    }
                    QueryDownloadInfoResponseData data = q4.getData();
                    downloadTask.setVer(data.getVer());
                    downloadTask.setVer_name(data.getVer_name());
                    downloadTask.setUrl(data.getDownloadURL());
                    downloadTask.setResource_url_remote(data.getResourceURL());
                    downloadTask.setActual_size(data.getActualSize());
                    downloadTask.setRes_actual_size(data.getResourceSize());
                    downloadTask.setFromRecomDown(false);
                    startDownloadRes(downloadTask.getResource_url_remote());
                    return;
                }
                showTost("获取资源失败，请重新再试。");
                IStartEmuGameCallback iStartEmuGameCallback2 = this.callback;
                if (iStartEmuGameCallback2 != null) {
                    iStartEmuGameCallback2.onStartEmuGame();
                    return;
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showTost("获取资源失败，请重新再试。");
                IStartEmuGameCallback iStartEmuGameCallback3 = this.callback;
                if (iStartEmuGameCallback3 != null) {
                    iStartEmuGameCallback3.onStartEmuGame();
                    return;
                }
                return;
            }
        }
        showTost(getString(R.string.net_connect_failed));
        IStartEmuGameCallback iStartEmuGameCallback4 = this.callback;
        if (iStartEmuGameCallback4 != null) {
            iStartEmuGameCallback4.onStartEmuGame();
        }
    }

    public void initPreDownloadFactory() {
        factory = b.e();
        b.InterfaceC0290b interfaceC0290b = new b.InterfaceC0290b() { // from class: com.join.mgps.activity.mygame.dialog.PlugDownDialogAcitivity.4
            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void onError(String str) {
                IStartEmuGameCallback iStartEmuGameCallback = PlugDownDialogAcitivity.this.callback;
                if (iStartEmuGameCallback != null) {
                    iStartEmuGameCallback.onStartEmuGame();
                }
            }

            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void onFinish(String str) {
                w0.a("onFinish onStart - " + str, new Object[0]);
                c cVar = (c) PlugDownDialogAcitivity.tasks.get(str);
                if (cVar != null) {
                    PlugDownDialogAcitivity.this.gameTask.setResource_path(cVar.j().getAbsolutePath());
                    f.K().m(PlugDownDialogAcitivity.this.gameTask);
                }
                PlugDownDialogAcitivity plugDownDialogAcitivity = PlugDownDialogAcitivity.this;
                new UNZIPResThread(plugDownDialogAcitivity.gameTask, plugDownDialogAcitivity).start();
                PlugDownDialogAcitivity.tasks.remove(str);
            }

            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void onProgress(final String str, final int i4, String str2) {
                w0.a("PreDownloadPlug", "PreDownloadPlug onProgress - " + str + " progress=" + i4 + " speed" + str2);
                PlugDownDialogAcitivity.this.runOnUiThread(new Runnable() { // from class: com.join.mgps.activity.mygame.dialog.PlugDownDialogAcitivity.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        c cVar = (c) PlugDownDialogAcitivity.tasks.get(str);
                        if (cVar != null) {
                            TextView textView = PlugDownDialogAcitivity.this.appSize;
                            textView.setText("正在下载（" + UtilsMy.a(cVar.g()) + e.F0 + UtilsMy.a(cVar.i()) + ")");
                            PlugDownDialogAcitivity.this.progressBar.setProgress(i4);
                        }
                    }
                });
            }

            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void onStart(String str) {
                w0.a("PreDownloadPlug onStart - " + str, new Object[0]);
                PlugDownDialogAcitivity.this.runOnUiThread(new Runnable() { // from class: com.join.mgps.activity.mygame.dialog.PlugDownDialogAcitivity.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        PlugDownDialogAcitivity.this.progressBar.setProgress(0);
                        TextView textView = PlugDownDialogAcitivity.this.info;
                        textView.setText("加载游戏需初始化" + UtilsMy.X1(Integer.parseInt(PlugDownDialogAcitivity.this.gameTask.getPlugin_num())) + "资源文件，请稍后…");
                        TextView textView2 = PlugDownDialogAcitivity.this.appSize;
                        textView2.setText("正在下载（" + UtilsMy.a(PlugDownDialogAcitivity.this.gameTask.getRes_currentSize()) + e.F0 + UtilsMy.a(PlugDownDialogAcitivity.this.gameTask.getRes_actual_size()) + ")");
                    }
                });
            }

            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void onStop(String str) {
            }

            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void onWait(String str) {
            }

            @Override // com.github.snowdream.android.app.downloader.b.InterfaceC0290b
            public void updateSize(String str, long j4) {
                DownloadTask downloadTask = PlugDownDialogAcitivity.this.gameTask;
                if (downloadTask != null) {
                    downloadTask.setRes_actual_size(j4);
                }
            }
        };
        listener = interfaceC0290b;
        factory.m(interfaceC0290b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void notifyUi() {
        DownloadTask downloadTask = this.downloadTask;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        long parseDouble = (long) (Double.parseDouble(this.downloadTask.getShowSize()) * 1024.0d * 1024.0d);
        v0.d("plugDownDialog", "statues=" + status + "");
        if (status != 2) {
            if (status != 3) {
                if (status != 5) {
                    if (status != 6) {
                        if (status != 42) {
                            switch (status) {
                                case 10:
                                    if (this.downloadTask != null) {
                                        TextView textView = this.appSize;
                                        textView.setText("正在下载（" + UtilsMy.a(this.downloadTask.getCurrentSize()) + e.F0 + UtilsMy.a(parseDouble) + ")");
                                        try {
                                            this.progressBar.setProgress((int) this.downloadTask.getProgress());
                                        } catch (Exception e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                    this.lodingInfo.setText("等待中");
                                    return;
                                case 11:
                                    this.appSize.setText("下载完成");
                                    this.progressBar.setProgress(100);
                                    this.cancle.setText("去查看");
                                    this.ok.setText("安装");
                                    return;
                                case 12:
                                    TextView textView2 = this.appSize;
                                    textView2.setText("正在下载（" + UtilsMy.a(this.downloadTask.getCurrentSize()) + e.F0 + UtilsMy.a(parseDouble) + ")");
                                    this.lodingInfo.setText("解压中..");
                                    this.progressBarZip.setVisibility(0);
                                    this.progressBar.setVisibility(8);
                                    this.progressBarZip.setProgress((int) this.downloadTask.getProgress());
                                    return;
                                case 13:
                                    TextView textView3 = this.appSize;
                                    textView3.setText("正在下载（" + UtilsMy.a(this.downloadTask.getCurrentSize()) + e.F0 + UtilsMy.a(parseDouble) + ")");
                                    this.progressBarZip.setProgress((int) this.downloadTask.getProgress());
                                    return;
                                default:
                                    return;
                            }
                        }
                    }
                }
                TextView textView4 = this.appSize;
                textView4.setText(this.downloadTask.getShowName() + "初始化完成");
                this.progressBar.setProgress(100);
                this.downloadTasks = f.K().d();
                if (g2.i(this.gameid)) {
                    this.lastGame = f.K().F(this.gameid);
                } else {
                    for (DownloadTask downloadTask2 : this.downloadTasks) {
                        if (downloadTask2.getPlugin_num().equals(this.plugNumber) && !this.plugNumber.equals(downloadTask2.getCrc_link_type_val()) && downloadTask2.getStatus() == 5) {
                            int i4 = (downloadTask2.getFinishTime() > 0L ? 1 : (downloadTask2.getFinishTime() == 0L ? 0 : -1));
                            this.lastGame = downloadTask2;
                        }
                    }
                }
                IStartEmuGameCallback iStartEmuGameCallback = new IStartEmuGameCallback() { // from class: com.join.mgps.activity.mygame.dialog.PlugDownDialogAcitivity.3
                    @Override // com.join.mgps.activity.mygame.dialog.PlugDownDialogAcitivity.IStartEmuGameCallback
                    public void onStartEmuGame() {
                        PlugDownDialogAcitivity.this.normalStartGame();
                    }
                };
                this.callback = iStartEmuGameCallback;
                if (this.downloadType == 1) {
                    iStartEmuGameCallback.onStartEmuGame();
                    return;
                } else {
                    checkAndDownRes();
                    return;
                }
            }
            DownloadTask downloadTask3 = this.downloadTask;
            if (downloadTask3 != null) {
                try {
                    if (downloadTask3.getSize() == 0) {
                        TextView textView5 = this.appSize;
                        textView5.setText(UtilsMy.a(this.downloadTask.getCurrentSize()) + e.F0 + UtilsMy.a(parseDouble));
                    } else {
                        TextView textView6 = this.appSize;
                        textView6.setText(UtilsMy.a(this.downloadTask.getCurrentSize()) + e.F0 + UtilsMy.a(parseDouble));
                    }
                    this.progressBar.setProgress((int) this.downloadTask.getProgress());
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
            this.lodingInfo.setText("暂停中");
            return;
        }
        UtilsMy.x4(this.downloadTask);
        DownloadTask downloadTask4 = this.downloadTask;
        if (downloadTask4 != null) {
            if (downloadTask4.getSize() == 0) {
                TextView textView7 = this.appSize;
                textView7.setText("正在下载（" + UtilsMy.a(this.downloadTask.getCurrentSize()) + e.F0 + UtilsMy.a(parseDouble) + ")");
            } else {
                TextView textView8 = this.appSize;
                textView8.setText("正在下载（" + UtilsMy.a(this.downloadTask.getCurrentSize()) + e.F0 + UtilsMy.a(parseDouble) + ")");
            }
            this.progressBar.setProgress((int) this.downloadTask.getProgress());
            this.downloadTask.getSpeed();
            TextView textView9 = this.lodingInfo;
            textView9.setText(this.downloadTask.getProgress() + "%");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void ok() {
        DownloadTask downloadTask = this.downloadTask;
        int status = downloadTask != null ? downloadTask.getStatus() : 0;
        if (status != 5) {
            if (status != 11) {
                finish();
                return;
            } else {
                com.join.android.app.common.utils.e.l0(this).x(this, this.downloadTask.getGameZipPath());
                return;
            }
        }
        IStartEmuGameCallback iStartEmuGameCallback = new IStartEmuGameCallback() { // from class: com.join.mgps.activity.mygame.dialog.PlugDownDialogAcitivity.2
            @Override // com.join.mgps.activity.mygame.dialog.PlugDownDialogAcitivity.IStartEmuGameCallback
            public void onStartEmuGame() {
                DownloadTask downloadTask2 = PlugDownDialogAcitivity.this.lastGame;
                if (downloadTask2 != null) {
                    downloadTask2.setCheckRes(false);
                    PlugDownDialogAcitivity plugDownDialogAcitivity = PlugDownDialogAcitivity.this;
                    UtilsMy.T3(plugDownDialogAcitivity, plugDownDialogAcitivity.lastGame);
                }
                p.l(PlugDownDialogAcitivity.this).O1(Event.startAfterEmuLoad, new Ext());
                PlugDownDialogAcitivity.this.finish();
            }
        };
        this.callback = iStartEmuGameCallback;
        if (this.downloadType == 1) {
            iStartEmuGameCallback.onStartEmuGame();
        } else {
            checkAndDownRes();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d0.a().e(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(n nVar) {
        if (nVar.c() == 8) {
            updateProgressPartly();
        } else if (this.plugNumber.equals(nVar.a().getCrc_link_type_val())) {
            this.downloadTask = nVar.a();
            int c5 = nVar.c();
            if (c5 == 2) {
                updateUI(this.downloadTask, 1);
            } else if (c5 == 3) {
                updateUI(this.downloadTask, 2);
            } else if (c5 == 5) {
                updateUI(this.downloadTask, 5);
            } else if (c5 == 6) {
                updateUI(this.downloadTask, 6);
            } else if (c5 == 7) {
                this.downloadTask.setStatus(7);
                updateUI(this.downloadTask, 3);
            } else if (c5 == 10) {
                DownloadTask downloadTask = this.downloadTask;
                if (downloadTask == null) {
                    return;
                }
                updateUI(downloadTask, 7);
            } else if (c5 == 12) {
                updateUI(this.downloadTask, 8);
            } else if (c5 != 13) {
            } else {
                updateUI(this.downloadTask, 9);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MApplication.U = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        MApplication.U = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showTost(String str) {
        ToastManager.show(str);
    }

    void updateUI(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    receiveStart(downloadTask);
                    return;
                case 3:
                    receiveDelete(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    receiveSuccess(downloadTask);
                    return;
                case 6:
                    receiveError(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUnzipRes(long j4, long j5, int i4) {
        TextView textView = this.appSize;
        textView.setText("正在解压（" + UtilsMy.a(j4) + e.F0 + UtilsMy.a(j5) + ")");
        this.lodingInfo.setText("解压中..");
        this.progressBarZip.setVisibility(0);
        this.progressBar.setVisibility(8);
        this.progressBarZip.setProgress(i4);
    }
}
