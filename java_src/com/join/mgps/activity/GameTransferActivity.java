package com.join.mgps.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.WifiUtils;
import com.join.mgps.adapter.GameTransferHistoryAdapter;
import com.join.mgps.adapter.GameTransferListAdapter;
import com.join.mgps.customview.DrawableDividerItemDecoration;
import com.join.mgps.customview.PaPaLinearLayoutManager;
import com.join.mgps.dto.GameTransferBean;
import com.join.mgps.dto.RomArchived;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.receiver.ApWifiConnectedReceiver;
import com.join.mgps.receiver.NetWorkConnectedReceiver;
import com.join.mgps.receiver.WifiAPBroadcastReceiver;
import com.join.mgps.service.SocketClientService;
import com.join.mgps.service.SocketServerService;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.SystemService;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_game_transfer)
/* loaded from: classes.dex */
public class GameTransferActivity extends BaseActivity {
    public static final String A1;
    public static final String B1;

    /* renamed from: p1  reason: collision with root package name */
    private static final String f32797p1 = "GameTransferActivity";

    /* renamed from: v1  reason: collision with root package name */
    public static final String f32798v1;
    File A;
    Iterator<DownloadTask> B;
    SparseArray<GameTransferBean> C;
    SparseArray<GameTransferBean> D;
    int E;
    Map<String, DownloadTask> F;
    List<DownloadTask> P;
    List<DownloadTask> Q;
    @SystemService
    PowerManager R;
    com.join.mgps.socket.b U;
    ApWifiConnectedReceiver V;
    NetWorkConnectedReceiver W;
    @ViewById(R.id.game_transfer_title_txt)

    /* renamed from: b  reason: collision with root package name */
    TextView f32799b;
    @ViewById(R.id.game_transfer_right_phone_txt)

    /* renamed from: c  reason: collision with root package name */
    TextView f32800c;
    @ViewById(R.id.game_transfer_list_rv)

    /* renamed from: d  reason: collision with root package name */
    RecyclerView f32801d;
    @Bean

    /* renamed from: e  reason: collision with root package name */
    GameTransferListAdapter f32802e;
    @ViewById(R.id.game_transfer_historyList_rv)

    /* renamed from: f  reason: collision with root package name */
    RecyclerView f32803f;
    @Bean

    /* renamed from: g  reason: collision with root package name */
    GameTransferHistoryAdapter f32804g;
    @ViewById(R.id.game_transfer_bottom_navigation_left_txt)

    /* renamed from: h  reason: collision with root package name */
    TextView f32805h;
    @ViewById(R.id.game_transfer_bottom_navigation_right_txt)

    /* renamed from: k  reason: collision with root package name */
    TextView f32808k;
    @ViewById(R.id.game_transfer_ok_btn)

    /* renamed from: l  reason: collision with root package name */
    Button f32809l;
    @ViewById(R.id.game_transfer_selected_num_txt)

    /* renamed from: m  reason: collision with root package name */
    TextView f32810m;
    @ViewById(R.id.game_transfer_list_choose_all_txt)

    /* renamed from: n  reason: collision with root package name */
    TextView f32811n;
    @ViewById(R.id.game_transfer_history_hint_rl)

    /* renamed from: p  reason: collision with root package name */
    RelativeLayout f32813p;

    /* renamed from: q  reason: collision with root package name */
    Context f32815q;
    @Extra

    /* renamed from: r  reason: collision with root package name */
    int f32816r;

    /* renamed from: s  reason: collision with root package name */
    long f32817s;

    /* renamed from: t  reason: collision with root package name */
    com.join.mgps.socket.server.a f32818t;

    /* renamed from: u  reason: collision with root package name */
    com.join.mgps.socket.client.a f32819u;

    /* renamed from: v  reason: collision with root package name */
    List<DownloadTask> f32820v;

    /* renamed from: w  reason: collision with root package name */
    List<DownloadTask> f32821w;

    /* renamed from: x  reason: collision with root package name */
    List<DownloadTask> f32822x;

    /* renamed from: y  reason: collision with root package name */
    List<GameTransferBean> f32823y;
    @Pref

    /* renamed from: z  reason: collision with root package name */
    PrefDef_ f32824z;

    /* renamed from: i  reason: collision with root package name */
    final int f32806i = 1;

    /* renamed from: j  reason: collision with root package name */
    final int f32807j = 2;

    /* renamed from: o  reason: collision with root package name */
    boolean f32812o = false;
    ExecutorService G = Executors.newCachedThreadPool();
    e H = null;
    com.join.mgps.task.b I = null;
    Future J = null;
    com.join.mgps.task.d K = null;
    Future L = null;
    boolean M = false;
    DownloadTask N = null;
    String O = null;
    PowerManager.WakeLock S = null;
    Socket T = null;
    int X = 0;
    List<DownloadTask> Y = new ArrayList();
    ServiceConnection Z = new a();

    /* renamed from: p0  reason: collision with root package name */
    com.join.mgps.customview.o f32814p0 = null;

    /* loaded from: classes4.dex */
    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder instanceof SocketClientService.a) {
                GameTransferActivity.this.T = ((SocketClientService.a) iBinder).getSocket();
            } else if (iBinder instanceof SocketServerService.a) {
                GameTransferActivity.this.T = ((SocketServerService.a) iBinder).getSocket();
            }
            GameTransferActivity.this.J0();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameTransferActivity.this.r0();
            GameTransferActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameTransferActivity.this.r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d extends Thread {

        /* renamed from: b  reason: collision with root package name */
        private boolean f32828b = true;

        /* renamed from: c  reason: collision with root package name */
        File f32829c;

        /* renamed from: d  reason: collision with root package name */
        long f32830d;

        /* renamed from: e  reason: collision with root package name */
        String f32831e;

        public d(File file, long j4, String str) {
            this.f32829c = file;
            this.f32830d = j4;
            this.f32831e = str;
        }

        public void a(boolean z4) {
            this.f32828b = z4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            super.run();
            while (this.f32828b) {
                try {
                    File file = this.f32829c;
                    if (file != null) {
                        long J1 = UtilsMy.J1(file);
                        StringBuilder sb = new StringBuilder();
                        sb.append("zip currentSize =");
                        sb.append(J1);
                        long j4 = this.f32830d * 2;
                        long j5 = 0;
                        if (j4 != 0 && J1 != 0) {
                            j5 = (J1 * 100) / j4;
                        }
                        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.x(5, this.f32831e, j5));
                        Thread.sleep(1000L);
                    }
                } catch (InterruptedException e5) {
                    e5.printStackTrace();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f32833b = true;

        e() {
        }

        public void a(boolean z4) {
            this.f32833b = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (this.f32833b) {
                try {
                    Thread.sleep(1000L);
                    long currentTimeMillis = System.currentTimeMillis() - GameTransferActivity.this.f32817s;
                    String unused = GameTransferActivity.f32797p1;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onTick: 间隔");
                    sb.append(currentTimeMillis);
                    if (currentTimeMillis > com.join.mgps.data.c.f49010a) {
                        String unused2 = GameTransferActivity.f32797p1;
                        this.f32833b = false;
                        GameTransferActivity.this.finish();
                    }
                } catch (InterruptedException e5) {
                    Thread.currentThread().interrupt();
                    e5.printStackTrace();
                }
            }
        }
    }

    static {
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        f32798v1 = absolutePath;
        A1 = absolutePath + "/Android/obb";
        B1 = absolutePath + "/Android/data";
    }

    private void b1(File file, DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        com.join.mgps.socket.entity.d dVar = new com.join.mgps.socket.entity.d();
        dVar.f(downloadTask.getPackageName() + com.join.mgps.Util.h0.f27805a + com.join.mgps.Util.h0.n(file.getAbsolutePath()));
        dVar.g(file.getAbsolutePath());
        dVar.h(file.length());
        dVar.i(downloadTask.getCrc_link_type_val());
        com.join.mgps.Util.w0.e(f32797p1, "transferFile: 文件名称" + dVar.a());
        downloadTask.setSize(file.length());
        this.U.j(dVar);
        com.papa.sim.statistic.p.l(this).q0(downloadTask.getCrc_link_type_val(), AccountUtil_.getInstance_(this).getUid());
    }

    private void d1(DownloadTask downloadTask) {
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.x(6, downloadTask.getCrc_link_type_val()));
        downloadTask.setStatus(12);
        p1.f.K().k(downloadTask);
        UtilsMy.S2(downloadTask, 12);
        new com.join.mgps.task.e(downloadTask, this.f32815q, true).start();
    }

    private void e1(DownloadTask downloadTask) {
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.x(6, downloadTask.getCrc_link_type_val()));
        UtilsMy.S2(downloadTask, 12);
        new com.join.mgps.task.h(downloadTask, this.f32815q, com.join.mgps.Util.v.f28105e + downloadTask.getRomType() + "/roms").start();
    }

    private void g0(GameTransferBean gameTransferBean) {
        DownloadTask downloadTask = this.F.get(gameTransferBean.getId());
        downloadTask.setPath(gameTransferBean.getFilePath());
        String fileType = downloadTask.getFileType();
        if (Dtype.android.name().equals(fileType)) {
            if (com.join.android.app.common.utils.e.l0(this.f32815q).l(this.f32815q, downloadTask.getPackageName()).d() >= Integer.parseInt(downloadTask.getVer())) {
                UtilsMy.delete(new File(downloadTask.getPath()));
                return;
            }
            DownloadTask F = p1.f.K().F(downloadTask.getCrc_link_type_val());
            if (F != null) {
                downloadTask.setId(F.getId());
                return;
            }
            downloadTask.set_from_type(1);
            if (Dtype.androiddata.name().equals(downloadTask.getRomType())) {
                d1(downloadTask);
            } else if (Dtype.androidobb.name().equals(downloadTask.getRomType())) {
                d1(downloadTask);
            } else {
                downloadTask.setStatus(11);
                downloadTask.setGameZipPath(downloadTask.getPath());
                p1.f.K().k(downloadTask);
                UtilsMy.S2(downloadTask, 11);
                org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.x(7, downloadTask.getCrc_link_type_val()));
            }
        } else if (Dtype.apk.name().equals(fileType)) {
            DownloadTask F2 = p1.f.K().F(downloadTask.getCrc_link_type_val());
            if (F2 != null) {
                downloadTask.setId(F2.getId());
                return;
            }
            downloadTask.setStatus(12);
            p1.f.K().k(downloadTask);
            e1(downloadTask);
        } else if (Dtype.chajian.name().equals(fileType)) {
            downloadTask.setStatus(11);
            downloadTask.setGameZipPath(downloadTask.getPath());
            DownloadTask F3 = p1.f.K().F(downloadTask.getCrc_link_type_val());
            if (F3 != null) {
                downloadTask.setId(F3.getId());
            }
            p1.f.K().k(downloadTask);
            this.f32822x.add(downloadTask);
            UtilsMy.S2(downloadTask, 11);
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.x(7, downloadTask.getCrc_link_type_val()));
        }
    }

    private boolean l0(DownloadTask downloadTask) {
        long c5 = com.join.mgps.Util.s1.c(this.A.getAbsolutePath());
        long parseLong = downloadTask.getUnzip_size() != null ? Long.parseLong(downloadTask.getUnzip_size()) : 0L;
        if (parseLong == 0) {
            parseLong = Float.parseFloat(downloadTask.getShowSize()) * 1000.0f * 1000.0f;
        }
        if (parseLong > c5) {
            toast("存储空间不足传输失败");
            return false;
        }
        return true;
    }

    private boolean m0(DownloadTask downloadTask) {
        long c5 = com.join.mgps.Util.s1.c(this.A.getAbsolutePath());
        long parseLong = downloadTask.getUnzip_size() != null ? Long.parseLong(downloadTask.getUnzip_size()) : 0L;
        if (parseLong == 0) {
            parseLong = Float.parseFloat(downloadTask.getShowSize()) * 1000.0f * 1000.0f;
        }
        String fileType = downloadTask.getFileType();
        if (!Dtype.android.name().equals(fileType) ? !(!Dtype.apk.name().equals(fileType) && !Dtype.chajian.name().equals(fileType)) : !(!Dtype.androiddata.name().equals(downloadTask.getRomType()) && !Dtype.androidobb.name().equals(downloadTask.getRomType()) && !Dtype.androidobbdata.name().equals(downloadTask.getRomType()))) {
            parseLong *= 2;
        }
        if (parseLong > c5) {
            toast("存储空间不足传输失败");
            return false;
        }
        return true;
    }

    private String o1(DownloadTask downloadTask) {
        return q1(downloadTask, B1 + File.separator + downloadTask.getPackageName());
    }

    private void p0(DownloadTask downloadTask) {
        for (RomArchived romArchived : com.join.mgps.Util.g0.l(downloadTask.getPlugin_num(), downloadTask.getGameZipPath())) {
            String archivedPath = romArchived.getArchivedPath();
            String archivedImagePath = romArchived.getArchivedImagePath();
            if (com.join.mgps.Util.g2.i(archivedPath)) {
                File file = new File(archivedPath);
                if (file.exists()) {
                    com.join.mgps.Util.h0.c(archivedPath, new File(downloadTask.getGameZipPath()).getParent() + File.separator + file.getName());
                }
            }
            if (com.join.mgps.Util.g2.i(archivedImagePath)) {
                File file2 = new File(archivedImagePath);
                if (file2.exists()) {
                    com.join.mgps.Util.h0.c(archivedImagePath, new File(downloadTask.getGameZipPath()).getParent() + File.separator + file2.getName());
                }
            }
        }
    }

    private String p1(DownloadTask downloadTask) {
        return q1(downloadTask, A1 + File.separator + downloadTask.getPackageName());
    }

    private String q1(DownloadTask downloadTask, String str) {
        File file;
        long parseFloat;
        d dVar;
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.x(5, downloadTask.getCrc_link_type_val()));
        if (this.N.getStatus() == 11) {
            file = new File(this.N.getGameZipPath());
        } else {
            try {
                file = new File(getPackageManager().getApplicationInfo(downloadTask.getPackageName(), 0).sourceDir);
            } catch (PackageManager.NameNotFoundException e5) {
                e5.printStackTrace();
                file = null;
            }
        }
        File file2 = new File(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(file2);
        arrayList.add(file);
        File file3 = new File(this.A.getAbsolutePath() + File.separator + downloadTask.getPackageName() + ".zip");
        if (!file3.exists()) {
            new File(file3.getParent()).mkdirs();
        }
        if (!file3.exists()) {
            try {
                file3.createNewFile();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }
        String showSize = downloadTask.getShowSize();
        try {
            try {
                if (com.join.mgps.Util.g2.i(showSize)) {
                    try {
                        parseFloat = Float.parseFloat(showSize) * 1000.0f * 1000.0f;
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                    dVar = new d(file3, parseFloat, downloadTask.getCrc_link_type_val());
                    dVar.start();
                    com.join.mgps.Util.w2.l(arrayList, file3);
                    dVar.a(false);
                    return file3.getAbsolutePath();
                }
                dVar.start();
                com.join.mgps.Util.w2.l(arrayList, file3);
                dVar.a(false);
                return file3.getAbsolutePath();
            } catch (Throwable th) {
                dVar.a(false);
                throw th;
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.x(8, downloadTask.getCrc_link_type_val()));
            UtilsMy.delete(file3);
            dVar.a(false);
            return "";
        }
        parseFloat = 0;
        dVar = new d(file3, parseFloat, downloadTask.getCrc_link_type_val());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        if (this.M) {
            String uid = AccountUtil_.getInstance_(this).getUid();
            DownloadTask downloadTask = this.N;
            com.papa.sim.statistic.p.l(this).n0(downloadTask != null ? downloadTask.getCrc_link_type_val() : "", uid);
        }
        com.join.mgps.customview.o oVar = this.f32814p0;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.f32814p0.dismiss();
    }

    private String r1(DownloadTask downloadTask) {
        long parseFloat;
        d dVar;
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.x(5, downloadTask.getCrc_link_type_val()));
        File parentFile = new File(downloadTask.getGameZipPath()).getParentFile();
        File file = new File(this.A.getAbsolutePath() + File.separator + parentFile.getName() + ".zip");
        if (!file.exists()) {
            new File(file.getParent()).mkdirs();
        }
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        String showSize = downloadTask.getShowSize();
        try {
            try {
                if (com.join.mgps.Util.g2.i(showSize)) {
                    try {
                        parseFloat = Float.parseFloat(showSize) * 1000.0f * 1000.0f;
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    p0(downloadTask);
                    dVar = new d(file, parseFloat, downloadTask.getCrc_link_type_val());
                    dVar.start();
                    com.join.mgps.Util.w2.j(parentFile, file);
                    dVar.a(false);
                    return file.getAbsolutePath();
                }
                dVar.start();
                com.join.mgps.Util.w2.j(parentFile, file);
                dVar.a(false);
                return file.getAbsolutePath();
            } catch (Throwable th) {
                dVar.a(false);
                throw th;
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.x(8, downloadTask.getCrc_link_type_val()));
            UtilsMy.delete(file);
            dVar.a(false);
            return "";
        }
        parseFloat = 0;
        p0(downloadTask);
        dVar = new d(file, parseFloat, downloadTask.getCrc_link_type_val());
    }

    private DownloadTask x0(String str) {
        if (com.join.mgps.Util.g2.h(str)) {
            return null;
        }
        int i4 = 0;
        while (true) {
            List<DownloadTask> list = this.f32820v;
            if (list == null || i4 >= list.size()) {
                return null;
            }
            DownloadTask downloadTask = this.f32820v.get(i4);
            if (downloadTask.getCrc_link_type_val().equals(str)) {
                downloadTask.set_from_type(1);
                return downloadTask;
            }
            i4++;
        }
    }

    private DownloadTask y0(int i4) {
        List<DownloadTask> list = this.f32820v;
        if (list == null) {
            return null;
        }
        return list.get(i4);
    }

    int A0(String str) {
        List<DownloadTask> list;
        if (str == null || (list = this.f32820v) == null) {
            return -1;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            DownloadTask downloadTask = this.f32820v.get(i4);
            if (downloadTask != null && str.equals(downloadTask.getCrc_link_type_val())) {
                return i4;
            }
        }
        return -1;
    }

    int B0(String str) {
        GameTransferListAdapter gameTransferListAdapter;
        if (str == null || (gameTransferListAdapter = this.f32802e) == null) {
            return -1;
        }
        SparseArray<GameTransferBean> c5 = gameTransferListAdapter.c();
        int size = c5.size();
        for (int i4 = 0; i4 < size; i4++) {
            GameTransferBean gameTransferBean = c5.get(i4);
            if (gameTransferBean != null && str.equals(gameTransferBean.getId())) {
                return i4;
            }
        }
        return -1;
    }

    String C0(int i4) {
        List<DownloadTask> list = this.f32820v;
        if (list == null || list.size() < i4) {
            return null;
        }
        return this.f32820v.get(i4).getVer();
    }

    String D0(String str) {
        DownloadTask x02 = x0(str);
        return x02 != null ? x02.getVer() : "";
    }

    int E0(String str) {
        SparseArray<GameTransferBean> c5 = this.f32804g.c();
        for (int i4 = 0; i4 < c5.size(); i4++) {
            GameTransferBean gameTransferBean = c5.get(i4);
            if (gameTransferBean != null && str.equals(gameTransferBean.getId())) {
                return i4;
            }
        }
        return -1;
    }

    int F0(String str) {
        List<DownloadTask> list;
        if (str == null || (list = this.f32822x) == null) {
            return -1;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            DownloadTask downloadTask = this.f32822x.get(i4);
            if (downloadTask != null) {
                boolean equals = str.equals(downloadTask.getCrc_link_type_val());
                StringBuilder sb = new StringBuilder();
                sb.append("getPlugTaskListIndex: 是否存在");
                sb.append(equals);
                if (equals) {
                    return i4;
                }
            }
        }
        return -1;
    }

    String G0(int i4) {
        List<DownloadTask> list = this.f32822x;
        if (list == null || list.size() < i4) {
            return null;
        }
        return this.f32822x.get(i4).getVer();
    }

    void H0() {
        if (this.f32820v != null) {
            for (int i4 = 0; i4 < this.f32820v.size(); i4++) {
                this.C.put(i4, v0(this.f32820v.get(i4), -1));
            }
        }
    }

    void I0() {
        this.f32801d.addItemDecoration(new DrawableDividerItemDecoration(getResources().getDrawable(R.drawable.recyclerview_horizontal_divider), true, false));
        this.f32801d.getItemAnimator().setChangeDuration(0L);
        this.f32801d.setHasFixedSize(true);
        this.f32801d.setOverScrollMode(2);
        PaPaLinearLayoutManager paPaLinearLayoutManager = new PaPaLinearLayoutManager(this);
        paPaLinearLayoutManager.setOrientation(1);
        this.f32801d.setLayoutManager(paPaLinearLayoutManager);
        this.f32802e.h(this.C);
        this.f32801d.setAdapter(this.f32802e);
        this.f32803f.addItemDecoration(new DrawableDividerItemDecoration(getResources().getDrawable(R.drawable.recyclerview_horizontal_divider), true, false));
        this.f32803f.getItemAnimator().setChangeDuration(0L);
        this.f32803f.setHasFixedSize(true);
        this.f32803f.setOverScrollMode(2);
        PaPaLinearLayoutManager paPaLinearLayoutManager2 = new PaPaLinearLayoutManager(this);
        paPaLinearLayoutManager2.setOrientation(1);
        this.f32803f.setLayoutManager(paPaLinearLayoutManager2);
        this.f32804g.h(this.D);
        this.f32803f.setAdapter(this.f32804g);
    }

    void J0() {
        if (this.T == null) {
            return;
        }
        int i4 = this.f32816r;
        if (i4 == 2) {
            this.f32818t = new com.join.mgps.socket.server.a(this.f32815q, this.T);
        } else if (i4 == 1) {
            this.f32819u = new com.join.mgps.socket.client.a(this.f32815q, this.T);
        }
        this.f32817s = System.currentTimeMillis();
        L0();
    }

    void K0() {
        com.join.mgps.task.d dVar = new com.join.mgps.task.d(this.f32815q, true, 2000L);
        this.K = dVar;
        this.L = this.G.submit(dVar);
    }

    void L0() {
        e eVar = new e();
        this.H = eVar;
        this.J = this.G.submit(eVar);
    }

    void M0(int i4) {
        if (i4 == 1) {
            if (this.f32805h.isTextSelectable()) {
                return;
            }
            this.f32805h.setSelected(true);
            this.f32808k.setSelected(false);
            this.f32801d.setVisibility(0);
            this.f32803f.setVisibility(8);
            this.f32809l.setVisibility(0);
            this.f32811n.setVisibility(0);
            this.f32810m.setVisibility(0);
            this.f32813p.setVisibility(8);
        } else if (i4 != 2 || this.f32808k.isTextSelectable()) {
        } else {
            this.f32808k.setSelected(true);
            this.f32805h.setSelected(false);
            this.f32801d.setVisibility(8);
            this.f32803f.setVisibility(0);
            this.f32809l.setVisibility(8);
            this.f32811n.setVisibility(8);
            this.f32810m.setVisibility(8);
            if (this.f32824z.showHistroyHint().d().booleanValue()) {
                this.f32813p.setVisibility(0);
            }
        }
    }

    void N0() {
        if (this.M) {
            return;
        }
        if (this.f32821w.size() > 0) {
            this.f32809l.setEnabled(true);
        } else {
            this.f32809l.setEnabled(false);
        }
    }

    void O0() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(WifiAPBroadcastReceiver.f53999b);
        intentFilter.addAction("android.net.wifi.WIFI_HOTSPOT_CLIENTS_CHANGED");
        ApWifiConnectedReceiver apWifiConnectedReceiver = new ApWifiConnectedReceiver();
        this.V = apWifiConnectedReceiver;
        registerReceiver(apWifiConnectedReceiver, intentFilter);
    }

    void P0() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        NetWorkConnectedReceiver netWorkConnectedReceiver = new NetWorkConnectedReceiver();
        this.W = netWorkConnectedReceiver;
        registerReceiver(netWorkConnectedReceiver, intentFilter);
    }

    public void Q0(GameTransferBean gameTransferBean) {
        if (gameTransferBean == null || this.f32821w == null) {
            return;
        }
        String id = gameTransferBean.getId();
        for (DownloadTask downloadTask : this.f32821w) {
            if (downloadTask.getCrc_link_type_val().equals(id)) {
                downloadTask.set_from_type(0);
                this.f32821w.remove(downloadTask);
                return;
            }
        }
    }

    public void R0(int i4) {
        if (i4 > this.C.size()) {
            return;
        }
        if (i4 == this.C.size() - 1) {
            this.C.remove(i4);
            return;
        }
        SparseArray<GameTransferBean> sparseArray = this.C;
        while (i4 < sparseArray.size() - 1) {
            int i5 = i4 + 1;
            this.C.put(i4, sparseArray.get(i5));
            i4 = i5;
        }
        this.C.remove(this.C.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    @org.androidannotations.annotations.Background
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S0() {
        /*
            r5 = this;
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r5.N
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = r0.getFileType()
            r1 = 0
            com.join.mgps.enums.Dtype r2 = com.join.mgps.enums.Dtype.android
            java.lang.String r2 = r2.name()
            boolean r2 = r2.equals(r0)
            r3 = 0
            if (r2 == 0) goto L90
            com.join.mgps.enums.Dtype r0 = com.join.mgps.enums.Dtype.androiddata
            java.lang.String r0 = r0.name()
            com.github.snowdream.android.app.downloader.DownloadTask r2 = r5.N
            java.lang.String r2 = r2.getRomType()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3b
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r5.N
            java.lang.String r0 = r5.o1(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = com.join.mgps.Util.g2.h(r0)
            if (r0 == 0) goto Ldb
            return
        L3b:
            com.join.mgps.enums.Dtype r0 = com.join.mgps.enums.Dtype.androidobb
            java.lang.String r0 = r0.name()
            com.github.snowdream.android.app.downloader.DownloadTask r2 = r5.N
            java.lang.String r2 = r2.getRomType()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L5f
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r5.N
            java.lang.String r0 = r5.p1(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = com.join.mgps.Util.g2.h(r0)
            if (r0 == 0) goto Ldb
            return
        L5f:
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r5.N
            int r0 = r0.getStatus()
            r2 = 11
            if (r0 != r2) goto L75
            java.io.File r1 = new java.io.File
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r5.N
            java.lang.String r0 = r0.getPath()
            r1.<init>(r0)
            goto Ldb
        L75:
            java.io.File r0 = new java.io.File     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            com.github.snowdream.android.app.downloader.DownloadTask r4 = r5.N     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            java.lang.String r2 = r2.sourceDir     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            r0.<init>(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8b
            goto Ld5
        L8b:
            r0 = move-exception
            r0.printStackTrace()
            goto Ldb
        L90:
            com.join.mgps.enums.Dtype r2 = com.join.mgps.enums.Dtype.apk
            java.lang.String r2 = r2.name()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto Lb4
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r5.N
            r0.getRomType()
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r5.N
            java.lang.String r0 = r5.r1(r0)
            boolean r1 = com.join.mgps.Util.g2.h(r0)
            if (r1 == 0) goto Lae
            return
        Lae:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            goto Ldb
        Lb4:
            com.join.mgps.enums.Dtype r2 = com.join.mgps.enums.Dtype.chajian
            java.lang.String r2 = r2.name()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Ldb
            java.io.File r0 = new java.io.File     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld7
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld7
            com.github.snowdream.android.app.downloader.DownloadTask r4 = r5.N     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld7
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld7
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld7
            java.lang.String r2 = r2.sourceDir     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld7
            r0.<init>(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Ld7
        Ld5:
            r1 = r0
            goto Ldb
        Ld7:
            r0 = move-exception
            r0.printStackTrace()
        Ldb:
            if (r1 == 0) goto Le9
            boolean r0 = r1.exists()
            if (r0 == 0) goto Le9
            com.github.snowdream.android.app.downloader.DownloadTask r0 = r5.N
            r5.b1(r1, r0)
            goto Lfd
        Le9:
            org.greenrobot.eventbus.c r0 = org.greenrobot.eventbus.c.f()
            com.join.mgps.event.x r1 = new com.join.mgps.event.x
            r2 = 8
            com.github.snowdream.android.app.downloader.DownloadTask r3 = r5.N
            java.lang.String r3 = r3.getCrc_link_type_val()
            r1.<init>(r2, r3)
            r0.o(r1)
        Lfd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.GameTransferActivity.S0():void");
    }

    void T0() {
        w0();
        this.Q.addAll(this.f32821w);
        this.Q.addAll(this.P);
        this.U.n(this.Q);
        this.f32821w.clear();
        this.P.clear();
        this.B = this.Q.iterator();
    }

    void U0(int i4) {
        this.f32810m.setText(getResources().getString(R.string.choose_game_num, Integer.valueOf(i4)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V0() {
        com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this, R.style.MyDialog);
        this.f32814p0 = oVar;
        oVar.setContentView(R.layout.bind_dialog);
        Button button = (Button) this.f32814p0.findViewById(R.id.dialog_button_cancel);
        Button button2 = (Button) this.f32814p0.findViewById(R.id.dialog_button_ok);
        ((TextView) this.f32814p0.findViewById(R.id.tip_title)).setText("提示");
        ((TextView) this.f32814p0.findViewById(R.id.dialog_content)).setText("退出会中断连接及正在进行的传输，确认退出吗？");
        ((TextView) this.f32814p0.findViewById(R.id.dialog_desci)).setVisibility(8);
        button.setText("确认");
        button2.setText("取消");
        button.setOnClickListener(new b());
        button2.setOnClickListener(new c());
        com.join.mgps.customview.o oVar2 = this.f32814p0;
        if (oVar2 == null || oVar2.isShowing()) {
            return;
        }
        this.f32814p0.show();
    }

    void W0() {
        V0();
    }

    void X0() {
        try {
            SparseArray<GameTransferBean> c5 = this.f32802e.c();
            SparseArray<GameTransferBean> sparseArray = new SparseArray<>();
            if (c5 != null) {
                for (int i4 = 0; i4 < c5.size(); i4++) {
                    GameTransferBean gameTransferBean = c5.get(i4);
                    if (gameTransferBean.getTransferStatus() == 3) {
                        sparseArray.put(i4, gameTransferBean);
                        R0(i4);
                    }
                }
                j0(sparseArray);
                this.f32802e.notifyDataSetChanged();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void Y0() {
        com.join.mgps.socket.client.a aVar;
        if (this.B.hasNext()) {
            DownloadTask next = this.B.next();
            this.N = next;
            String crc_link_type_val = next.getCrc_link_type_val();
            String ver = this.N.getVer();
            String fileType = this.N.getFileType();
            if (l0(this.N)) {
                this.U.m(crc_link_type_val + ":" + ver + ":" + fileType);
            } else {
                this.U.l(crc_link_type_val);
                m1(crc_link_type_val);
            }
        } else {
            if (this.f32816r == 1 && (aVar = this.f32819u) != null) {
                aVar.e();
            }
            this.U.o();
            this.M = false;
            this.f32802e.l(false);
            this.f32802e.notifyDataSetChanged();
            this.Q.clear();
        }
        n1();
    }

    void Z0() {
        Future future;
        if (this.K == null || (future = this.L) == null || future.isCancelled()) {
            return;
        }
        this.K.d(false);
        this.L.cancel(true);
    }

    void a1() {
        e eVar = this.H;
        if (eVar == null || this.J == null) {
            return;
        }
        eVar.a(false);
        this.J.cancel(true);
    }

    void bindService() {
        Intent intent;
        int i4 = this.f32816r;
        if (i4 == 2) {
            intent = new Intent(this, SocketServerService.class);
        } else {
            intent = i4 == 1 ? new Intent(this, SocketClientService.class) : null;
        }
        bindService(intent, this.Z, 1);
    }

    void c1() {
        NetWorkConnectedReceiver netWorkConnectedReceiver = this.W;
        if (netWorkConnectedReceiver != null) {
            unregisterReceiver(netWorkConnectedReceiver);
        }
        ApWifiConnectedReceiver apWifiConnectedReceiver = this.V;
        if (apWifiConnectedReceiver != null) {
            unregisterReceiver(apWifiConnectedReceiver);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void canApClientConnect(List<com.join.mgps.event.e> list) {
        if (list == null) {
            return;
        }
        if (list.size() == 0) {
            int i4 = this.X + 1;
            this.X = i4;
            if (i4 > 1) {
                finish();
                return;
            }
            return;
        }
        this.X = 0;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void chooseSendFileEvent(GameTransferBean gameTransferBean) {
        if (gameTransferBean == null || this.f32820v == null) {
            return;
        }
        String id = gameTransferBean.getId();
        if (gameTransferBean.isSelectedTransfer()) {
            this.f32821w.add(x0(id));
            if (this.f32821w.size() == this.E) {
                this.f32812o = true;
                this.f32811n.setSelected(true);
            }
        } else {
            Q0(gameTransferBean);
            if (this.f32812o) {
                this.f32812o = false;
                this.f32811n.setSelected(false);
            }
        }
        List<DownloadTask> list = this.f32821w;
        if (list != null) {
            U0(list.size());
        }
        N0();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void connectedEvent(String str) {
        if (str.equals(com.join.mgps.socket.entity.b.f54681h)) {
            finish();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void dialogEvent(String str) {
        if (str.equals("ok")) {
            finish();
        }
    }

    void f1() {
        if (this.C == null || this.f32821w == null) {
            return;
        }
        SparseArray<GameTransferBean> c5 = this.f32802e.c();
        int size = this.f32821w.size();
        StringBuilder sb = new StringBuilder();
        sb.append("updateGameFileStatu2Waiting: size");
        sb.append(size);
        for (int i4 = 0; i4 < size; i4++) {
            int B0 = B0(this.f32821w.get(i4).getCrc_link_type_val());
            GameTransferBean gameTransferBean = c5.get(B0);
            gameTransferBean.setTransferStatus(1);
            gameTransferBean.setSelectedTransfer(false);
            c5.setValueAt(B0, gameTransferBean);
            this.f32823y.add(gameTransferBean);
        }
        this.f32802e.l(true);
        this.f32802e.notifyDataSetChanged();
        T0();
        this.E -= this.f32821w.size();
    }

    void g1(boolean z4) {
        GameTransferListAdapter gameTransferListAdapter = this.f32802e;
        if (gameTransferListAdapter == null) {
            return;
        }
        SparseArray<GameTransferBean> c5 = gameTransferListAdapter.c();
        int size = c5.size();
        for (int i4 = 0; i4 < size; i4++) {
            GameTransferBean gameTransferBean = c5.get(i4);
            if (!this.f32823y.contains(gameTransferBean)) {
                StringBuilder sb = new StringBuilder();
                sb.append("updateGameListCheckStatus: index:::");
                sb.append(i4);
                sb.append(":::checked:::");
                sb.append(z4);
                gameTransferBean.setSelectedTransfer(z4);
                c5.setValueAt(i4, gameTransferBean);
                if (z4) {
                    DownloadTask x02 = x0(gameTransferBean.getId());
                    if (!this.f32821w.contains(x02)) {
                        this.f32821w.add(x02);
                    }
                } else {
                    Q0(gameTransferBean);
                }
            }
        }
        this.f32802e.notifyDataSetChanged();
        List<DownloadTask> list = this.f32821w;
        if (list != null) {
            int size2 = list.size();
            U0(this.f32821w.size());
            if (size2 > 0) {
                this.f32809l.setEnabled(true);
            } else {
                this.f32809l.setEnabled(false);
            }
        }
    }

    void h1(String str, int i4) {
        if (str == null) {
            return;
        }
        SparseArray<GameTransferBean> c5 = this.f32802e.c();
        int size = c5.size();
        for (int i5 = 0; i5 < size; i5++) {
            GameTransferBean valueAt = c5.valueAt(i5);
            if (valueAt.getId().equals(str)) {
                valueAt.setTransferStatus(i4);
                c5.setValueAt(i5, valueAt);
                this.f32802e.notifyItemChanged(i5);
                return;
            }
        }
    }

    void i1(String str, int i4) {
        if (str == null) {
            return;
        }
        SparseArray<GameTransferBean> c5 = this.f32804g.c();
        int size = c5.size();
        for (int i5 = 0; i5 < size; i5++) {
            GameTransferBean valueAt = c5.valueAt(i5);
            if (valueAt.getId().equals(str)) {
                valueAt.setTransferStatus(i4);
                c5.setValueAt(i5, valueAt);
                this.f32804g.notifyItemChanged(i5);
                return;
            }
        }
    }

    void init() {
        this.f32815q = getApplicationContext();
        this.U = com.join.mgps.socket.b.d();
        File file = new File(com.join.mgps.Util.s1.h(this.f32815q));
        this.A = file;
        if (!file.exists()) {
            this.A.mkdirs();
        }
        PowerManager.WakeLock newWakeLock = this.R.newWakeLock(268435482, "My Lock");
        this.S = newWakeLock;
        newWakeLock.acquire();
        bindService();
    }

    void initData() {
        this.f32820v = p1.f.K().R(null);
        this.f32822x = p1.f.K().M();
        this.f32821w = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.F = new HashMap();
        this.f32823y = new ArrayList();
        this.C = new SparseArray<>();
        H0();
        this.E = this.f32820v.size();
        this.D = new SparseArray<>();
    }

    void initView() {
        I0();
        int i4 = this.f32816r;
        if (i4 == 2) {
            M0(2);
            O0();
            K0();
        } else if (i4 == 1) {
            M0(1);
            P0();
            this.U.f();
        }
    }

    public void j0(SparseArray<GameTransferBean> sparseArray) {
        int size = this.C.size();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            this.C.put(size + i4, sparseArray.get(sparseArray.keyAt(i4)));
        }
    }

    void j1() {
        String str = this.O;
        if (str == null || com.join.mgps.Util.g2.h(str)) {
            return;
        }
        int E0 = E0(this.O);
        SparseArray<GameTransferBean> c5 = this.f32804g.c();
        if (E0 == -1 || E0 >= c5.size()) {
            return;
        }
        GameTransferBean gameTransferBean = c5.get(E0);
        gameTransferBean.setProgerss(100);
        gameTransferBean.setTransferStatus(9);
        gameTransferBean.setSelectedTransfer(false);
        c5.setValueAt(E0, gameTransferBean);
        this.f32804g.notifyItemChanged(E0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(DownloadTask downloadTask) {
        if (Dtype.apk.name().equals(downloadTask.getFileType())) {
            com.join.mgps.Util.g0.f(downloadTask.getGameZipPath(), downloadTask.getPackageName(), Integer.parseInt(downloadTask.getPlugin_num()));
        }
    }

    void k1() {
        DownloadTask downloadTask = this.N;
        if (downloadTask == null || this.f32802e == null) {
            return;
        }
        int B0 = B0(downloadTask.getCrc_link_type_val());
        SparseArray<GameTransferBean> c5 = this.f32802e.c();
        if (B0 != -1 && B0 < c5.size()) {
            GameTransferBean gameTransferBean = c5.get(B0);
            com.papa.sim.statistic.p.l(this).r0(gameTransferBean.getId(), AccountUtil_.getInstance_(this).getUid());
            gameTransferBean.setProgerss(100);
            gameTransferBean.setTransferStatus(3);
            gameTransferBean.setSelectedTransfer(false);
            c5.setValueAt(B0, gameTransferBean);
            this.f32802e.notifyItemChanged(B0);
            this.U.q();
            Y0();
            return;
        }
        this.U.q();
        Y0();
    }

    void l1(String str) {
        if (str == null) {
            return;
        }
        int E0 = E0(str);
        this.f32804g.c().valueAt(E0).setTransferStatus(4);
        this.f32804g.notifyItemChanged(E0);
    }

    void m1(String str) {
        if (str == null) {
            return;
        }
        int B0 = B0(str);
        if (B0 < 0) {
            Y0();
            return;
        }
        SparseArray<GameTransferBean> c5 = this.f32802e.c();
        GameTransferBean gameTransferBean = c5.get(B0);
        gameTransferBean.setTransferStatus(4);
        c5.setValueAt(B0, gameTransferBean);
        this.f32802e.notifyItemChanged(B0);
        Y0();
    }

    void n0(String str) {
        int A0;
        String D0;
        if (str == null || com.join.mgps.Util.g2.h(str)) {
            return;
        }
        String[] split = str.split(":");
        if (split.length != 3) {
            return;
        }
        String str2 = split[0];
        this.O = str2;
        String str3 = split[1];
        String str4 = split[2];
        Dtype dtype = Dtype.chajian;
        if (dtype.name().equals(str4)) {
            A0 = F0(this.O);
        } else {
            A0 = A0(this.O);
        }
        DownloadTask downloadTask = this.F.get(this.O);
        if (!m0(downloadTask)) {
            l1(str2);
            this.U.e(str2);
        } else if (A0 == -1) {
            if (!Dtype.android.name().equals(str4)) {
                this.U.i();
            } else if (downloadTask != null) {
                String packageName = downloadTask.getPackageName();
                if (com.join.android.app.common.utils.e.l0(this.f32815q).d(this.f32815q, packageName)) {
                    p1.f.K().k(downloadTask);
                    UtilsMy.S2(p1.f.K().F(this.O), 5);
                    if (Integer.parseInt(str3) > com.join.android.app.common.utils.e.l0(this.f32815q).l(this.f32815q, packageName).d()) {
                        this.U.i();
                        return;
                    } else {
                        this.U.h();
                        return;
                    }
                }
                this.U.i();
            } else {
                this.U.i();
            }
        } else {
            if (dtype.name().equals(str4)) {
                D0 = G0(A0);
            } else {
                D0 = D0(this.O);
            }
            if (Integer.parseInt(str3) > Integer.parseInt(D0)) {
                this.U.i();
            } else {
                this.U.h();
            }
        }
    }

    synchronized void n1() {
        SparseArray<GameTransferBean> c5 = this.f32802e.c();
        if (this.M) {
            List<GameTransferBean> list = this.f32823y;
            int size = list != null ? list.size() : 0;
            int i4 = 0;
            for (int i5 = 0; c5 != null && i5 < c5.size(); i5++) {
                GameTransferBean gameTransferBean = c5.get(i5);
                if (gameTransferBean != null && gameTransferBean.getTransferStatus() == 3) {
                    i4++;
                }
            }
            if (size > 0 && i4 < size) {
                Button button = this.f32809l;
                button.setText(String.format("已完成 %s/%s", i4 + "", size + ""));
            } else {
                this.f32809l.setText(R.string.game_transfer_transfer_ok);
            }
        } else {
            N0();
            this.f32809l.setText(R.string.game_transfer_transfer_ok);
        }
        X0();
    }

    void o0(String str) {
        if (str != null) {
            this.Y.addAll((ArrayList) JsonMapper.getInstance().fromJson(str, JsonMapper.getInstance().createCollectionType(ArrayList.class, DownloadTask.class)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.game_transfer_bottom_navigation_left_txt, R.id.game_transfer_bottom_navigation_right_txt, R.id.game_transfer_ok_btn, R.id.game_transfer_list_hint_close_img, R.id.game_transfer_list_choose_all_txt, R.id.game_transfer_back_img})
    public void onClick(View view) {
        com.join.mgps.socket.client.a aVar;
        switch (view.getId()) {
            case R.id.game_transfer_back_img /* 2131297920 */:
                W0();
                return;
            case R.id.game_transfer_bottom_navigation_left_txt /* 2131297923 */:
                M0(1);
                return;
            case R.id.game_transfer_bottom_navigation_right_txt /* 2131297924 */:
                M0(2);
                return;
            case R.id.game_transfer_list_choose_all_txt /* 2131297933 */:
                if (this.M) {
                    return;
                }
                boolean z4 = !this.f32812o;
                this.f32812o = z4;
                this.f32811n.setSelected(z4);
                g1(this.f32812o);
                return;
            case R.id.game_transfer_list_hint_close_img /* 2131297934 */:
                this.f32824z.edit().m3().b(false).a();
                this.f32813p.setVisibility(8);
                return;
            case R.id.game_transfer_ok_btn /* 2131297938 */:
                StringBuilder sb = new StringBuilder();
                sb.append("onClick: +时候可用");
                sb.append(this.f32809l.isEnabled());
                if (!this.M) {
                    if (this.f32816r == 1 && (aVar = this.f32819u) != null) {
                        aVar.f();
                    }
                    this.M = true;
                    this.f32809l.setEnabled(false);
                    f1();
                    return;
                }
                toast("请等待当前传输完成");
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.join.mgps.socket.server.a aVar = this.f32818t;
        if (aVar != null) {
            aVar.b();
        }
        com.join.mgps.socket.client.a aVar2 = this.f32819u;
        if (aVar2 != null) {
            aVar2.b();
        }
        stopService();
        this.U.b();
        org.greenrobot.eventbus.c.f().y(this);
        if (this.f32816r == 2) {
            com.join.mgps.Util.f.i(this.f32815q).f();
            WifiUtils.getInstance(this.f32815q).openWifi(this.f32815q);
        }
        a1();
        Z0();
        c1();
        PowerManager.WakeLock wakeLock = this.S;
        if (wakeLock != null) {
            wakeLock.release();
        }
        ExecutorService executorService = this.G;
        if (executorService != null && !executorService.isShutdown()) {
            this.G.shutdownNow();
        }
        com.join.mgps.customview.o oVar = this.f32814p0;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.f32814p0.dismiss();
        this.f32814p0 = null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        if (nVar.c() != 5) {
            return;
        }
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.x(9, a5.getCrc_link_type_val()));
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            W0();
            return false;
        }
        return false;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onSocketReceiverEvent(com.join.mgps.socket.entity.a aVar) {
        com.join.mgps.socket.client.a aVar2;
        if (aVar == null) {
            return;
        }
        this.f32817s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("onSocketReceiverEvent: ");
        sb.append(this.f32817s);
        if (aVar instanceof com.join.mgps.socket.entity.c) {
            com.join.mgps.socket.entity.c cVar = (com.join.mgps.socket.entity.c) aVar;
            int i4 = cVar.f54698w;
            if (i4 == 0) {
                t0(cVar);
            } else if (i4 == 1) {
                s0(cVar);
            }
        } else if (aVar instanceof com.join.mgps.socket.entity.g) {
            String str = ((com.join.mgps.socket.entity.g) aVar).f54711s;
            if (str.equals(com.join.mgps.socket.entity.a.f54660f)) {
                if (this.f32816r == 2) {
                    this.U.k();
                }
            } else if (str.startsWith(com.join.mgps.socket.entity.a.f54661g)) {
                this.f32800c.setText(str.substring(5));
                int i5 = this.f32816r;
                if (i5 == 2) {
                    this.U.f();
                } else if (i5 == 1) {
                    this.f32819u.e();
                }
            } else if (str.startsWith(com.join.mgps.socket.entity.a.f54667m)) {
                if (this.f32816r == 1) {
                    this.f32819u.f();
                }
                int indexOf = str.indexOf(":");
                int parseInt = Integer.parseInt(str.substring(5, indexOf));
                o0(str.substring(indexOf + 1));
                if (this.Y.size() == parseInt) {
                    z0();
                    this.U.g();
                } else {
                    this.U.a();
                }
                this.f32809l.setEnabled(false);
                this.M = true;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onSocketReceiverEvent: 是否可用");
                sb2.append(this.f32809l.isEnabled());
            } else if (str.equals(com.join.mgps.socket.entity.a.f54669o)) {
                Y0();
            } else if (str.startsWith(com.join.mgps.socket.entity.a.f54671q)) {
                l1(str.substring(8));
            } else if (str.startsWith(com.join.mgps.socket.entity.a.f54672r)) {
                m1(str.substring(8));
            } else if (str.startsWith(com.join.mgps.socket.entity.a.f54663i)) {
                n0(str.substring(5));
            } else if (str.equals(com.join.mgps.socket.entity.a.f54664j)) {
                S0();
            } else if (str.equals(com.join.mgps.socket.entity.a.f54665k)) {
                k1();
            } else if (str.equals(com.join.mgps.socket.entity.a.f54666l)) {
                j1();
            } else if (str.equals(com.join.mgps.socket.entity.a.f54670p)) {
                if (this.f32816r == 1 && (aVar2 = this.f32819u) != null) {
                    aVar2.e();
                }
                this.M = false;
                this.f32809l.setEnabled(true);
                this.f32802e.l(this.M);
                this.f32802e.notifyDataSetChanged();
            }
        }
    }

    public void q0(String str) {
        if (str == null || !str.contains(this.A.getAbsolutePath())) {
            return;
        }
        com.join.mgps.task.b bVar = new com.join.mgps.task.b(str);
        this.I = bVar;
        this.J = this.G.submit(bVar);
    }

    void s0(com.join.mgps.socket.entity.c cVar) {
        if (cVar == null) {
            return;
        }
        int E0 = E0(cVar.f54699x);
        GameTransferBean valueAt = this.f32804g.c().valueAt(E0);
        valueAt.setTransferStatus(cVar.f54697v);
        valueAt.setFilePath(cVar.f54695t);
        int i4 = cVar.f54697v;
        if (i4 == 2) {
            valueAt.setProgerss(cVar.f54696u);
            this.f32804g.notifyItemChanged(E0);
        } else if (i4 == 3) {
            this.f32804g.notifyItemChanged(E0);
            g0(valueAt);
        } else if (i4 != 4) {
        } else {
            this.f32804g.notifyItemChanged(E0);
        }
    }

    void stopService() {
        Intent intent;
        unbindService(this.Z);
        int i4 = this.f32816r;
        if (i4 == 2) {
            intent = new Intent(this, SocketServerService.class);
        } else {
            intent = i4 == 1 ? new Intent(this, SocketClientService.class) : null;
        }
        stopService(intent);
    }

    void t0(com.join.mgps.socket.entity.c cVar) {
        if (cVar == null) {
            return;
        }
        int B0 = B0(cVar.f54699x);
        if (B0 < 0) {
            int i4 = cVar.f54697v;
            if (i4 == 4 || i4 == 3) {
                Y0();
                return;
            }
            return;
        }
        SparseArray<GameTransferBean> c5 = this.f32802e.c();
        GameTransferBean gameTransferBean = c5.get(B0);
        gameTransferBean.setTransferStatus(cVar.f54697v);
        c5.setValueAt(B0, gameTransferBean);
        int i5 = cVar.f54697v;
        if (i5 == 2) {
            gameTransferBean.setProgerss(cVar.f54696u);
            this.f32802e.notifyItemChanged(B0);
        } else if (i5 != 3) {
            if (i5 != 4) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("SendFile:;;;;Failed index");
            sb.append(B0);
            sb.append(":::名称::::");
            sb.append(gameTransferBean.getGameName());
            this.f32802e.notifyItemChanged(B0);
            q0(cVar.f54695t);
            Y0();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SendFile:;;;;Success index");
            sb2.append(B0);
            sb2.append(":::名称::::");
            sb2.append(gameTransferBean.getGameName());
            String uid = AccountUtil_.getInstance_(this).getUid();
            com.papa.sim.statistic.p.l(this).r0(gameTransferBean.getId(), uid);
            this.f32802e.notifyItemChanged(B0);
            q0(cVar.f54695t);
            Y0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void toast(String str) {
        com.join.mgps.Util.l2.a(this.f32815q).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void u0() {
        init();
        initData();
        initView();
        org.greenrobot.eventbus.c.f().t(this);
    }

    GameTransferBean v0(DownloadTask downloadTask, int i4) {
        if (downloadTask == null) {
            return null;
        }
        GameTransferBean gameTransferBean = new GameTransferBean();
        gameTransferBean.setId(downloadTask.getCrc_link_type_val());
        gameTransferBean.setGameName(downloadTask.getShowName());
        gameTransferBean.setFileType(downloadTask.getFileType());
        gameTransferBean.setTransferStatus(i4);
        gameTransferBean.setFilePath(downloadTask.getPath());
        gameTransferBean.setSize(downloadTask.getShowSize());
        gameTransferBean.setIconUrl(downloadTask.getPortraitURL());
        return gameTransferBean;
    }

    void w0() {
        List<DownloadTask> list;
        if (this.f32821w == null || (list = this.f32822x) == null) {
            return;
        }
        for (DownloadTask downloadTask : list) {
            String crc_link_type_val = downloadTask.getCrc_link_type_val();
            Iterator<DownloadTask> it2 = this.f32821w.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String romType = it2.next().getRomType();
                if (romType != null && romType.equals(crc_link_type_val)) {
                    File file = null;
                    try {
                        file = new File(getPackageManager().getApplicationInfo(downloadTask.getPackageName(), 0).sourceDir);
                    } catch (PackageManager.NameNotFoundException e5) {
                        e5.printStackTrace();
                    }
                    if (file != null && file.exists()) {
                        this.P.add(downloadTask);
                    }
                }
            }
        }
    }

    void z0() {
        this.F.clear();
        for (DownloadTask downloadTask : this.Y) {
            this.F.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        SparseArray sparseArray = new SparseArray();
        for (int i4 = 0; i4 < this.Y.size(); i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append("getDownloadTask: 名称");
            sb.append(this.Y.get(i4).getName());
            sparseArray.put(i4, v0(this.Y.get(i4), 1));
        }
        this.f32804g.a(sparseArray);
        this.f32802e.l(true);
        this.f32802e.notifyDataSetChanged();
        this.Y.clear();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getDownloadTask: 传输记录");
        sb2.append(this.f32804g.c().size());
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void zipEvent(com.join.mgps.event.x xVar) {
        if (xVar == null) {
            return;
        }
        String str = xVar.f49946b;
        this.f32817s = System.currentTimeMillis();
        switch (xVar.f49945a) {
            case 5:
                h1(str, 5);
                this.U.p();
                return;
            case 6:
                i1(str, 6);
                return;
            case 7:
                i1(str, 7);
                return;
            case 8:
                i1(str, 8);
                return;
            case 9:
                i1(str, 9);
                DownloadTask downloadTask = this.F.get(str);
                k0(downloadTask);
                q0(downloadTask.getPath());
                return;
            default:
                return;
        }
    }
}
