package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathDataV2;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.UninstallGuessLikeAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.ArchievePathMultiArgs;
import com.join.mgps.dto.ArchievePathMultiBean;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.GamedetialModleFourBean;
import com.join.mgps.dto.RequestGameIdArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.UninstallGuessLikeArgs;
import com.join.mgps.dto.UninstallGuessLikeBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import com.papa91.arc.util.FileUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_uninstall_wufun)
/* loaded from: classes.dex */
public class UninstallWufunActivity extends BaseAppCompatActivity {
    private ActivityResultLauncher<Intent> A;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f38099b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RelativeLayout f38100c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f38101d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    CardView f38102e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f38103f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f38104g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f38105h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f38106i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f38107j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    CardView f38108k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    FrameLayout f38109l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    View f38110m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    View f38111n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f38112o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    RecyclerView f38113p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    TextView f38114q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    TextView f38115r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    TextView f38116s;

    /* renamed from: t  reason: collision with root package name */
    private com.join.mgps.rpc.k f38117t;

    /* renamed from: v  reason: collision with root package name */
    private UninstallGuessLikeAdapter f38119v;

    /* renamed from: y  reason: collision with root package name */
    private Context f38122y;

    /* renamed from: z  reason: collision with root package name */
    private ArrayList<DownloadTask> f38123z;

    /* renamed from: u  reason: collision with root package name */
    private List<CommonGameInfoBean> f38118u = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    List<DownloadTask> f38120w = new ArrayList();

    /* renamed from: x  reason: collision with root package name */
    Map<String, DownloadTask> f38121x = new ConcurrentHashMap();
    private ArrayList<String> B = new ArrayList<>();
    List<DownloadTask> C = new ArrayList();
    private int D = 0;
    private int E = 0;

    /* loaded from: classes4.dex */
    class a implements ActivityResultCallback<ActivityResult> {
        a() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        /* renamed from: a */
        public void onActivityResult(ActivityResult activityResult) {
            if (activityResult.getResultCode() == 10001) {
                UninstallWufunActivity.this.n0();
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends RecyclerView.OnScrollListener {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
            RecyclerView recyclerView2 = UninstallWufunActivity.this.f38113p;
            if (recyclerView2 == null || recyclerView2.getLayoutManager() == null) {
                return;
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) UninstallWufunActivity.this.f38113p.getLayoutManager();
            UninstallWufunActivity.this.D = gridLayoutManager.findLastVisibleItemPosition();
            UninstallWufunActivity.this.E = gridLayoutManager.findFirstVisibleItemPosition();
        }
    }

    private List<String> k0(DownloadTask downloadTask) {
        File[] listFiles;
        File[] listFiles2;
        ArrayList arrayList = new ArrayList();
        String X1 = UtilsMy.X1(Integer.parseInt(downloadTask.getPlugin_num()));
        if (TextUtils.isEmpty(X1)) {
            return arrayList;
        }
        Pattern compile = Pattern.compile("\\.\\d+$");
        Pattern compile2 = Pattern.compile("\\.\\d+\\.png$");
        StringBuilder sb = new StringBuilder();
        sb.append(getExternalFilesDir("papa91"));
        String str = File.separator;
        sb.append(str);
        sb.append(X1);
        sb.append(str);
        sb.append(downloadTask.getPackageName());
        File file = new File(sb.toString());
        if (file.exists() && file.isDirectory() && file.listFiles() != null && file.listFiles().length > 0) {
            for (File file2 : file.listFiles()) {
                if (compile.matcher(file2.getName()).find() || compile2.matcher(file2.getName()).find()) {
                    arrayList.add(file2.getAbsolutePath());
                }
            }
        }
        File file3 = new File(getFilesDir() + "/emus/" + UtilsMy.X1(Integer.parseInt(downloadTask.getPlugin_num())) + File.separator + downloadTask.getPackageName());
        if (file3.exists() && file3.isDirectory() && file3.listFiles() != null && file3.listFiles().length > 0) {
            for (File file4 : file3.listFiles()) {
                if (compile.matcher(file4.getName()).find() || compile2.matcher(file4.getName()).find()) {
                    arrayList.add(file4.getAbsolutePath());
                }
            }
        }
        return arrayList;
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.f38120w.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.f38121x.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CommonGameInfoBean commonGameInfoBean : this.f38119v.getData()) {
                    GInfoBean g_info = commonGameInfoBean.getG_info();
                    if (g_info != null) {
                        if (commonGameInfoBean.isModGameVm()) {
                            DownloadTask downloadTask2 = this.f38121x.get(g_info.getMod_id());
                            DownloadTask downloadTask3 = this.f38121x.get(g_info.getId());
                            if (downloadTask2 == null && downloadTask3 == null) {
                                commonGameInfoBean.setDownloadTask(null);
                            } else if (downloadTask2 != null) {
                                commonGameInfoBean.setDownloadTask(downloadTask2);
                            } else if (downloadTask3 != null) {
                                commonGameInfoBean.setDownloadTask(downloadTask3);
                            } else if (g_info.getId().equals(downloadTask.getCrc_link_type_val())) {
                                commonGameInfoBean.setDownloadTask(null);
                            }
                        } else if (g_info.getId().equals(downloadTask.getCrc_link_type_val())) {
                            commonGameInfoBean.setDownloadTask(null);
                        }
                    }
                }
            }
        }
        m0();
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f38121x;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            m0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.A4(this.f38120w);
        if (!this.f38121x.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f38120w.add(downloadTask);
            this.f38121x.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        m0();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.f38121x;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.f38120w.add(downloadTask);
            this.f38121x.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        DownloadTask downloadTask2 = this.f38121x.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        m0();
    }

    private void updateDowStateList(DownloadTask downloadTask) {
        for (int i4 = 0; i4 < this.f38119v.getItemCount(); i4++) {
            try {
                CommonGameInfoBean item = this.f38119v.getItem(i4);
                GInfoBean g_info = item.getG_info();
                if (g_info != null) {
                    if (item.isModGameVm()) {
                        DownloadTask downloadTask2 = this.f38121x.get(g_info.getId());
                        boolean z4 = true;
                        boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                        DownloadTask downloadTask3 = this.f38121x.get(g_info.getMod_id());
                        if (downloadTask3 == null || downloadTask3.getStatus() != 5) {
                            z4 = false;
                        }
                        if (z4 && z5 && downloadTask.getCrc_link_type_val().equals(g_info.getId())) {
                            item.setDownloadTask(downloadTask);
                        } else if (z4 && downloadTask.getCrc_link_type_val().equals(g_info.getMod_id())) {
                            item.setDownloadTask(downloadTask);
                        } else if (z5 && downloadTask.getCrc_link_type_val().equals(g_info.getId())) {
                            item.setDownloadTask(downloadTask);
                        } else {
                            DownloadTask F = p1.f.K().F(g_info.getMod_id());
                            if (F == null) {
                                F = p1.f.K().F(g_info.getId());
                            }
                            if (F != null && downloadTask.getCrc_link_type_val().equals(F.getCrc_link_type_val())) {
                                item.setDownloadTask(downloadTask);
                            }
                        }
                    } else if (downloadTask.getCrc_link_type_val().equals(g_info.getId())) {
                        item.setDownloadTask(downloadTask);
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
    }

    private void updateProgressPartly() {
        DownloadTask downloadTask;
        if (this.E < 0 || this.D >= this.f38119v.getItemCount()) {
            return;
        }
        for (int i4 = this.E; i4 <= this.D; i4++) {
            CommonGameInfoBean item = this.f38119v.getItem(i4);
            if (item != null && (downloadTask = item.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                RecyclerView.ViewHolder childViewHolder = this.f38113p.getChildViewHolder(this.f38113p.getChildAt(i4 - this.E));
                if (childViewHolder instanceof BaseViewHolder) {
                    BaseViewHolder baseViewHolder = (BaseViewHolder) childViewHolder;
                    try {
                        DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                        if (f5 == null) {
                            return;
                        }
                        baseViewHolder.setText(R.id.tvLaunch, f5.getProgress() + "%");
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r3.getCrc_link_type_val().equals(r1.getMod_id()) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
        r0.setDownloadTask(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v0(java.util.List<com.join.mgps.dto.CommonGameInfoBean> r11) {
        /*
            r10 = this;
            java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r0 = r10.f38120w
            if (r0 != 0) goto L5
            return
        L5:
            java.util.Iterator r11 = r11.iterator()
        L9:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto Le3
            java.lang.Object r0 = r11.next()
            com.join.mgps.dto.CommonGameInfoBean r0 = (com.join.mgps.dto.CommonGameInfoBean) r0
            com.join.mgps.dto.GInfoBean r1 = r0.getG_info()
            if (r1 == 0) goto L9
            java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r2 = r10.f38120w
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9
            java.lang.Object r3 = r2.next()
            com.github.snowdream.android.app.downloader.DownloadTask r3 = (com.github.snowdream.android.app.downloader.DownloadTask) r3
            boolean r4 = r0.isModGameVm()
            if (r4 == 0) goto Ld0
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r10.f38121x
            java.lang.String r5 = r1.getId()
            java.lang.Object r4 = r4.get(r5)
            com.github.snowdream.android.app.downloader.DownloadTask r4 = (com.github.snowdream.android.app.downloader.DownloadTask) r4
            r5 = 1
            r6 = 5
            r7 = 0
            if (r4 == 0) goto L4c
            int r4 = r4.getStatus()
            if (r4 != r6) goto L4c
            r4 = 1
            goto L4d
        L4c:
            r4 = 0
        L4d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r8 = r10.f38121x
            java.lang.String r9 = r1.getMod_id()
            java.lang.Object r8 = r8.get(r9)
            com.github.snowdream.android.app.downloader.DownloadTask r8 = (com.github.snowdream.android.app.downloader.DownloadTask) r8
            if (r8 == 0) goto L62
            int r8 = r8.getStatus()
            if (r8 != r6) goto L62
            goto L63
        L62:
            r5 = 0
        L63:
            if (r5 == 0) goto L79
            if (r4 == 0) goto L79
            java.lang.String r6 = r3.getCrc_link_type_val()
            java.lang.String r7 = r1.getId()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L79
            r0.setDownloadTask(r3)
            goto L21
        L79:
            if (r5 == 0) goto L8d
            java.lang.String r5 = r3.getCrc_link_type_val()
            java.lang.String r6 = r1.getMod_id()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L8d
            r0.setDownloadTask(r3)
            goto L21
        L8d:
            if (r4 == 0) goto La1
            java.lang.String r4 = r3.getCrc_link_type_val()
            java.lang.String r5 = r1.getId()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto La1
            r0.setDownloadTask(r3)
            goto L21
        La1:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r10.f38121x
            java.lang.String r5 = r1.getMod_id()
            java.lang.Object r4 = r4.get(r5)
            com.github.snowdream.android.app.downloader.DownloadTask r4 = (com.github.snowdream.android.app.downloader.DownloadTask) r4
            if (r4 != 0) goto Lbb
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r10.f38121x
            java.lang.String r5 = r1.getId()
            java.lang.Object r4 = r4.get(r5)
            com.github.snowdream.android.app.downloader.DownloadTask r4 = (com.github.snowdream.android.app.downloader.DownloadTask) r4
        Lbb:
            if (r4 == 0) goto L21
            java.lang.String r5 = r3.getCrc_link_type_val()
            java.lang.String r4 = r4.getCrc_link_type_val()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L21
            r0.setDownloadTask(r3)
            goto L21
        Ld0:
            java.lang.String r4 = r3.getCrc_link_type_val()
            java.lang.String r5 = r1.getId()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L21
            r0.setDownloadTask(r3)
            goto L21
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.UninstallWufunActivity.v0(java.util.List):void");
    }

    private void w0(String str, int i4) {
        if (com.join.mgps.Util.g2.h(str)) {
            return;
        }
        for (int i5 = 0; i5 < this.f38119v.getItemCount(); i5++) {
            CommonGameInfoBean item = this.f38119v.getItem(i5);
            GInfoBean g_info = item.getG_info();
            if (g_info != null && (str.equals(g_info.getId()) || str.equals(g_info.getMod_id()))) {
                item.setRequestStatus(i4);
                this.f38119v.notifyItemChanged(i5);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        com.join.mgps.Util.d0.a().d(this);
        this.f38117t = com.join.mgps.rpc.impl.i.D0();
        this.f38122y = this;
        this.f38119v = new UninstallGuessLikeAdapter(this.f38118u);
        this.f38113p.setLayoutManager(new GridLayoutManager(this, 2));
        this.f38113p.setAdapter(this.f38119v);
        this.f38101d.setText("卸载应用");
        this.A = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new a());
        this.f38113p.addOnScrollListener(new b());
        i0();
        j0();
        com.papa.sim.statistic.p.l(this.f38122y).O1(Event.goUninstallPage, new Ext());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        Intent intent = new Intent();
        intent.setClass(this.f38122y, MGMainActivity_.class);
        intent.setFlags(603979776);
        Bundle bundle = new Bundle();
        bundle.putInt("MainPos", 3);
        intent.putExtras(bundle);
        startActivity(intent);
        super.finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0(int i4) {
        if (com.join.android.app.common.utils.j.j(this.f38122y)) {
            try {
                if (i4 <= this.B.size() - 1) {
                    String str = this.B.get(i4);
                    com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f38122y).getAccountData();
                    if (accountData == null) {
                        accountData = com.wufan.user.service.protobuf.n0.f5().build();
                    }
                    RequestModel requestModel = new RequestModel();
                    requestModel.setDefault(this.f38122y);
                    RequestGameIdArgs requestGameIdArgs = new RequestGameIdArgs(str, 1, accountData.getUid());
                    requestGameIdArgs.setDownloadedGameIdList(p1.f.K().A());
                    requestModel.setArgs(requestGameIdArgs);
                    ResponseModel<GamedetialModleFourBean> body = com.join.mgps.rpc.impl.i.D0().B0().p(requestModel.makeSign()).execute().body();
                    if (body != null && body.getCode() == 200) {
                        this.C.add(body.getData().getDownloadtaskDown());
                    }
                    h0(i4 + 1);
                    return;
                }
                o0();
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                o0();
                return;
            }
        }
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        this.f38123z = p1.f.K().C();
        ArrayList arrayList = new ArrayList();
        Iterator<DownloadTask> it2 = this.f38123z.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (next.getModInfoBean() != null && TextUtils.equals(String.valueOf(next.getCrc_link_type_val()), next.getModInfoBean().getMod_game_id())) {
                arrayList.add(next.getCrc_link_type_val());
            }
        }
        if (arrayList.size() > 0) {
            l0(arrayList);
        } else {
            u0(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        showLoding();
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.b5();
                }
                RequestModel requestModel = new RequestModel();
                UninstallGuessLikeArgs uninstallGuessLikeArgs = new UninstallGuessLikeArgs();
                uninstallGuessLikeArgs.setUid(String.valueOf(accountData.getUid()));
                requestModel.setArgs(uninstallGuessLikeArgs);
                requestModel.setDefault(this);
                ResponseModel<UninstallGuessLikeBean> t4 = this.f38117t.t(requestModel.makeSign());
                if (t4 != null && t4.getCode() == 200 && t4.getData() != null) {
                    t0(t4.getData());
                    return;
                } else {
                    showLodingFailed();
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingFailed();
                return;
            }
        }
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0(List<String> list) {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
                if (accountData == null) {
                    accountData = com.wufan.user.service.protobuf.n0.b5();
                }
                RequestModel requestModel = new RequestModel();
                ArchievePathMultiArgs archievePathMultiArgs = new ArchievePathMultiArgs();
                archievePathMultiArgs.setUid(String.valueOf(accountData.getUid()));
                archievePathMultiArgs.setDownloadedGameIdList(list);
                requestModel.setArgs(archievePathMultiArgs);
                requestModel.setDefault(this);
                ResponseModel<ArchievePathMultiBean> r4 = this.f38117t.r(requestModel.makeSign());
                if (r4 == null || r4.getCode() != 200 || r4.getData() == null) {
                    return;
                }
                u0(r4);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    void m0() {
        UninstallGuessLikeAdapter uninstallGuessLikeAdapter = this.f38119v;
        if (uninstallGuessLikeAdapter != null) {
            uninstallGuessLikeAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        this.B.clear();
        this.C.clear();
        i0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        List<DownloadTask> subList;
        if (this.C.size() <= 0) {
            this.f38116s.setVisibility(0);
            this.f38105h.setVisibility(8);
            return;
        }
        this.f38116s.setVisibility(8);
        this.f38105h.setVisibility(0);
        new ArrayList();
        if (this.C.size() <= 4) {
            subList = this.C;
        } else {
            subList = this.C.subList(0, 4);
        }
        this.f38105h.removeAllViews();
        for (DownloadTask downloadTask : subList) {
            View inflate = LayoutInflater.from(this.f38122y).inflate(R.layout.item_uninstall_local_archieve_game, (ViewGroup) null);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(R.id.icon);
            simpleDraweeView.setVisibility(0);
            ((TextView) inflate.findViewById(R.id.count)).setVisibility(8);
            MyImageLoader.n(simpleDraweeView, downloadTask.getPortraitURL());
            this.f38105h.addView(inflate);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) inflate.getLayoutParams();
            layoutParams.weight = 1.0f;
            inflate.setLayoutParams(layoutParams);
        }
        if (this.C.size() >= 5) {
            View inflate2 = LayoutInflater.from(this.f38122y).inflate(R.layout.item_uninstall_local_archieve_game, (ViewGroup) null);
            TextView textView = (TextView) inflate2.findViewById(R.id.count);
            ((SimpleDraweeView) inflate2.findViewById(R.id.icon)).setVisibility(8);
            textView.setVisibility(0);
            textView.setText(this.C.size() + "");
            this.f38105h.addView(inflate2);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) inflate2.getLayoutParams();
            layoutParams2.weight = 1.0f;
            inflate2.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            updateUI(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    updateUI(a5, 6);
                    return;
                } else if (c5 == 7) {
                    a5.setStatus(7);
                    updateUI(a5, 3);
                    return;
                } else if (c5 != 8) {
                    switch (c5) {
                        case 10:
                            if (a5 == null) {
                                return;
                            }
                            updateUI(a5, 7);
                            return;
                        case 11:
                            break;
                        case 12:
                            updateUI(a5, 8);
                            return;
                        case 13:
                            updateUI(a5, 9);
                            return;
                        default:
                            switch (c5) {
                                case 48:
                                    break;
                                case 49:
                                case 50:
                                    w0(nVar.b(), nVar.c());
                                    return;
                                default:
                                    return;
                            }
                    }
                } else {
                    Map<String, DownloadTask> map = this.f38121x;
                    if (map == null || map.isEmpty()) {
                        return;
                    }
                    updateProgressPartly();
                    return;
                }
            }
            updateUI(a5, 5);
        } else {
            updateUI(a5, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        try {
            this.f38109l.setVisibility(0);
            this.f38110m.setVisibility(8);
            this.f38111n.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q0() {
        com.papa.sim.statistic.p.l(this.f38122y).O1(Event.clickClearBtn, new Ext());
        if (this.A != null) {
            this.A.launch(new Intent(this, CleanSpaceActivity_.class));
            return;
        }
        CleanSpaceActivity_.R0(this).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void r0() {
        com.papa.sim.statistic.p.l(this.f38122y).O1(Event.clickPauseUninstallBtn, new Ext());
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        j0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void s0() {
        com.papa.sim.statistic.p.l(this.f38122y).O1(Event.clickUninstallBtn, new Ext());
        UninstallWufunReasonActivity_.t0(this.f38122y).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.f38110m.setVisibility(0);
            this.f38111n.setVisibility(8);
            this.f38109l.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            this.f38110m.setVisibility(8);
            this.f38111n.setVisibility(0);
            this.f38109l.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void t0(UninstallGuessLikeBean uninstallGuessLikeBean) {
        if (uninstallGuessLikeBean == null || uninstallGuessLikeBean.getGuessYouLikeInfo() == null || uninstallGuessLikeBean.getGuessYouLikeInfo().size() <= 0) {
            return;
        }
        p0();
        if (this.f38118u == null) {
            this.f38118u = new ArrayList();
        }
        List<CommonGameInfoBean> guessYouLikeInfo = uninstallGuessLikeBean.getGuessYouLikeInfo();
        this.f38118u = guessYouLikeInfo;
        for (CommonGameInfoBean commonGameInfoBean : guessYouLikeInfo) {
            commonGameInfoBean.set_from(167);
            commonGameInfoBean.set_from_type(167);
            if (commonGameInfoBean.getG_info() != null) {
                DownloadTask F = p1.f.K().F(commonGameInfoBean.getG_info().getId());
                DownloadTask F2 = p1.f.K().F(commonGameInfoBean.getG_info().getMod_id());
                if (F != null) {
                    commonGameInfoBean.setDownloadTask(F);
                } else if (F2 != null) {
                    commonGameInfoBean.setDownloadTask(F2);
                }
            }
        }
        UninstallGuessLikeAdapter uninstallGuessLikeAdapter = this.f38119v;
        if (uninstallGuessLikeAdapter != null) {
            uninstallGuessLikeAdapter.setNewData(this.f38118u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0(ResponseModel<ArchievePathMultiBean> responseModel) {
        long j4;
        File[] listFiles;
        String packageName;
        String replace = com.join.mgps.va.overmind.f.f54952a.b0().replace("/sdcard", "");
        long j5 = 0;
        if (responseModel != null) {
            j4 = 0;
            for (ModGameArchivePathDataV2 modGameArchivePathDataV2 : responseModel.getData().getCloud_archive_path_list()) {
                if (modGameArchivePathDataV2 != null) {
                    String mainLocalPath = modGameArchivePathDataV2.getMainLocalPath();
                    String b02 = com.join.mgps.va.overmind.f.f54952a.b0();
                    if (mainLocalPath.startsWith("/data/data")) {
                        mainLocalPath = mainLocalPath.replace("/data/data", "/data/user/0");
                        b02 = b02.replace("/sdcard", "");
                    }
                    File file = new File(b02 + mainLocalPath);
                    DownloadTask F = p1.f.K().F(modGameArchivePathDataV2.getGameId());
                    if (file.exists()) {
                        j4 += FileUtils.fileSize(file.getAbsolutePath());
                        if (F != null) {
                            this.C.add(F);
                        }
                    }
                }
            }
        } else {
            j4 = 0;
        }
        ArrayList<DownloadTask> arrayList = this.f38123z;
        if (arrayList != null) {
            Iterator<DownloadTask> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                DownloadTask next = it2.next();
                List<String> k02 = k0(next);
                if (k02 != null && k02.size() > 0) {
                    this.C.add(next);
                    for (String str : k02) {
                        File file2 = new File(str);
                        if (file2.exists()) {
                            j4 += file2.length();
                        }
                    }
                }
                String plugin_num = next.getPlugin_num();
                if (!TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.FC.value())) && !TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.GBA.value())) && !TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.FBA.value())) && !TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.MD.value())) && !TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.SFC.value())) && !TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.PSP.value())) && !TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.PS.value())) && !TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.WSC.value())) && !TextUtils.equals(plugin_num, String.valueOf(ConstantIntEnum.GBC.value()))) {
                    if ((next.getModInfoBean() != null && TextUtils.equals(String.valueOf(next.getCrc_link_type_val()), next.getModInfoBean().getMod_game_id())) || next.isSingleGame()) {
                        if (next.isMod() && next.getModInfoBean() != null) {
                            packageName = next.getModInfoBean().getMod_package_name();
                        } else {
                            packageName = next.isSingleGame() ? next.getPackageName() : "";
                        }
                        if (!TextUtils.isEmpty(packageName)) {
                            j5 += FileUtils.fileSize(replace + "/data/user/0/" + packageName) + FileUtils.fileSize(replace + "/data/app/" + packageName) + FileUtils.fileSize(replace + "/data/user_de/0/" + packageName) + FileUtils.fileSize(replace + "/sdcard/Android/data/" + packageName) + FileUtils.fileSize(replace + "/sdcard/Android/obb/" + packageName);
                        }
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(getExternalFilesDir("wufan91"));
                    String str2 = File.separator;
                    sb.append(str2);
                    sb.append(plugin_num);
                    sb.append(str2);
                    sb.append("roms");
                    sb.append(str2);
                    sb.append(next.getPackageName());
                    File file3 = new File(sb.toString());
                    if (file3.exists()) {
                        j5 += FileUtils.fileSize(file3.getAbsolutePath());
                    }
                }
            }
        }
        File externalFilesDir = getExternalFilesDir("backup");
        if (externalFilesDir.exists() && externalFilesDir.isDirectory() && externalFilesDir.listFiles() != null && externalFilesDir.listFiles().length > 0) {
            j4 += FileUtils.fileSize(externalFilesDir.getAbsolutePath());
            for (File file4 : externalFilesDir.listFiles()) {
                if (file4.exists() && file4.isDirectory()) {
                    this.B.add(file4.getName());
                }
            }
            ArrayList<String> arrayList2 = this.B;
            if (arrayList2 != null && arrayList2.size() > 0) {
                h0(0);
            } else {
                o0();
            }
        } else {
            o0();
        }
        long fileSize = FileUtils.fileSize(getExternalCacheDir().getAbsolutePath()) + FileUtils.fileSize(getCacheDir().getAbsolutePath());
        this.f38107j.setText(UtilsMy.e(j4, "0.0"));
        this.f38106i.setText(UtilsMy.e(j5, "0.0"));
        this.f38103f.setText("可清理" + UtilsMy.e(j4 + j5 + fileSize, "0.0") + "文件");
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
}
