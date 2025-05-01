package com.join.mgps.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.kotlin.ui.cloudarchive.data.ModGameArchivePathDataV2;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.gamedetail.GamedetailVideoMainActivity_;
import com.join.mgps.adapter.UninstallGuessLikeAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.ArchievePathMultiArgs;
import com.join.mgps.dto.ArchievePathMultiBean;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.UninstallGuessLikeArgs;
import com.join.mgps.dto.UninstallGuessLikeBean;
import com.join.mgps.enums.ConstantIntEnum;
import com.join.mgps.enums.Dtype;
import com.join.mgps.receiver.BootReceiver_;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
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
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_uninstall_wufun_game)
/* loaded from: classes.dex */
public class UninstallWufunGameActivity extends BaseAppCompatActivity {
    private com.join.mgps.rpc.k A;
    private UninstallGuessLikeAdapter C;
    private DownloadTask F;
    private Context G;
    private ModGameArchivePathDataV2 H;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    View f38148b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RelativeLayout f38149c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f38150d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    FrameLayout f38151e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    FrameLayout f38152f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    SimpleDraweeView f38153g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f38154h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f38155i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f38156j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f38157k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    ConstraintLayout f38158l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    SimpleDraweeView f38159m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f38160n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f38161o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    ImageView f38162p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    ConstraintLayout f38163q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    TextView f38164r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    TextView f38165s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    CardView f38166t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    FrameLayout f38167u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    RecyclerView f38168v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    View f38169w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    View f38170x;
    @Extra

    /* renamed from: y  reason: collision with root package name */
    String f38171y;

    /* renamed from: z  reason: collision with root package name */
    private String f38172z;
    private List<CommonGameInfoBean> B = new ArrayList();
    List<DownloadTask> D = new ArrayList();
    Map<String, DownloadTask> E = new ConcurrentHashMap();
    private int I = 0;
    private int J = 0;
    private int K = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
            RecyclerView recyclerView2 = UninstallWufunGameActivity.this.f38168v;
            if (recyclerView2 == null || recyclerView2.getLayoutManager() == null) {
                return;
            }
            GridLayoutManager gridLayoutManager = (GridLayoutManager) UninstallWufunGameActivity.this.f38168v.getLayoutManager();
            UninstallWufunGameActivity.this.I = gridLayoutManager.findLastVisibleItemPosition();
            UninstallWufunGameActivity.this.J = gridLayoutManager.findFirstVisibleItemPosition();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38175b;

        b(String str) {
            this.f38175b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadTask F = p1.f.K().F(this.f38175b);
            if (F == null || F.getStatus() == 7) {
                UninstallWufunGameActivity.this.f38161o.setVisibility(0);
                UninstallWufunGameActivity.this.f38162p.setVisibility(8);
                UninstallWufunGameActivity.this.f38162p.setSelected(false);
                UninstallWufunGameActivity.this.v0();
                UninstallWufunGameActivity.this.w0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f38177b;

        c(String str) {
            this.f38177b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadTask F = p1.f.K().F(this.f38177b);
            if (F == null || F.getStatus() == 7) {
                UninstallWufunGameActivity.this.f38156j.setVisibility(0);
                UninstallWufunGameActivity.this.f38157k.setVisibility(8);
                UninstallWufunGameActivity.this.f38157k.setSelected(false);
                UninstallWufunGameActivity.this.v0();
                UninstallWufunGameActivity.this.w0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f38179b;

        d(Intent intent) {
            this.f38179b = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            String stringExtra = this.f38179b.getStringExtra("packageName");
            if (this.f38179b.getStringExtra("actionFrom").equals(BootReceiver_.f53985b) && UninstallWufunGameActivity.this.F != null && TextUtils.equals(UninstallWufunGameActivity.this.F.getPackageName(), stringExtra)) {
                DownloadTask F = p1.f.K().F(UninstallWufunGameActivity.this.f38171y);
                if (F != null && F.getStatus() != 7) {
                    UninstallWufunGameActivity.k0(UninstallWufunGameActivity.this);
                    if (UninstallWufunGameActivity.this.K <= 3) {
                        new Handler().postDelayed(this, 1000L);
                        return;
                    }
                    return;
                }
                UninstallWufunGameActivity.this.f38161o.setVisibility(0);
                UninstallWufunGameActivity.this.f38162p.setVisibility(8);
                UninstallWufunGameActivity.this.f38162p.setSelected(false);
                UninstallWufunGameActivity.this.v0();
                UninstallWufunGameActivity.this.w0();
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
    private void F0(java.util.List<com.join.mgps.dto.CommonGameInfoBean> r11) {
        /*
            r10 = this;
            java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r0 = r10.D
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
            java.util.List<com.github.snowdream.android.app.downloader.DownloadTask> r2 = r10.D
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9
            java.lang.Object r3 = r2.next()
            com.github.snowdream.android.app.downloader.DownloadTask r3 = (com.github.snowdream.android.app.downloader.DownloadTask) r3
            boolean r4 = r0.isModGameVm()
            if (r4 == 0) goto Ld0
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r10.E
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r8 = r10.E
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r10.E
            java.lang.String r5 = r1.getMod_id()
            java.lang.Object r4 = r4.get(r5)
            com.github.snowdream.android.app.downloader.DownloadTask r4 = (com.github.snowdream.android.app.downloader.DownloadTask) r4
            if (r4 != 0) goto Lbb
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r10.E
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
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.UninstallWufunGameActivity.F0(java.util.List):void");
    }

    private void G0(String str, int i4) {
        if (com.join.mgps.Util.g2.h(str)) {
            return;
        }
        for (int i5 = 0; i5 < this.C.getItemCount(); i5++) {
            CommonGameInfoBean item = this.C.getItem(i5);
            GInfoBean g_info = item.getG_info();
            if (g_info != null && (str.equals(g_info.getId()) || str.equals(g_info.getMod_id()))) {
                item.setRequestStatus(i4);
                this.C.notifyItemChanged(i5);
                return;
            }
        }
    }

    static /* synthetic */ int k0(UninstallWufunGameActivity uninstallWufunGameActivity) {
        int i4 = uninstallWufunGameActivity.K;
        uninstallWufunGameActivity.K = i4 + 1;
        return i4;
    }

    private String q0() {
        ModGameArchivePathDataV2 modGameArchivePathDataV2;
        if (p1.f.K().F(this.f38172z) == null || (modGameArchivePathDataV2 = this.H) == null || modGameArchivePathDataV2.getMainLocalPath() == null) {
            return null;
        }
        String mainLocalPath = this.H.getMainLocalPath();
        String b02 = com.join.mgps.va.overmind.f.f54952a.b0();
        if (mainLocalPath.startsWith("/data/data")) {
            mainLocalPath = mainLocalPath.replace("/data/data", "/data/user/0");
            b02 = b02.replace("/sdcard", "");
        }
        return b02 + mainLocalPath;
    }

    private List<String> r0(DownloadTask downloadTask) {
        File[] listFiles;
        downloadTask.getPlugin_num();
        ArrayList arrayList = new ArrayList();
        String X1 = UtilsMy.X1(Integer.parseInt(downloadTask.getPlugin_num()));
        if (TextUtils.isEmpty(X1)) {
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getExternalFilesDir("papa91"));
        String str = File.separator;
        sb.append(str);
        sb.append(X1);
        sb.append(str);
        sb.append(downloadTask.getPackageName());
        File file = new File(sb.toString());
        if (file.exists() && file.isDirectory()) {
            Pattern compile = Pattern.compile("\\.\\d+$");
            Pattern compile2 = Pattern.compile("\\.\\d+\\.png$");
            if (file.listFiles() != null && file.listFiles().length > 0) {
                for (File file2 : file.listFiles()) {
                    if (compile.matcher(file2.getName()).find() || compile2.matcher(file2.getName()).find()) {
                        arrayList.add(file2.getAbsolutePath());
                    }
                }
            }
        }
        return arrayList;
    }

    private void receiveDelete(DownloadTask downloadTask) {
        Iterator<DownloadTask> it2 = this.D.iterator();
        while (it2.hasNext()) {
            DownloadTask next = it2.next();
            if (next.getCrc_link_type_val().equals(downloadTask.getCrc_link_type_val())) {
                this.E.remove(next.getCrc_link_type_val());
                it2.remove();
                for (CommonGameInfoBean commonGameInfoBean : this.C.getData()) {
                    GInfoBean g_info = commonGameInfoBean.getG_info();
                    if (g_info != null) {
                        if (commonGameInfoBean.isModGameVm()) {
                            DownloadTask downloadTask2 = this.E.get(g_info.getMod_id());
                            DownloadTask downloadTask3 = this.E.get(g_info.getId());
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
        u0();
    }

    private void receiveError(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.E;
        if (map == null || downloadTask == null) {
            return;
        }
        try {
            UtilsMy.x4(map.get(downloadTask.getCrc_link_type_val()));
            u0();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void receiveStart(DownloadTask downloadTask) {
        UtilsMy.A4(this.D);
        if (!this.E.containsKey(downloadTask.getCrc_link_type_val())) {
            this.D.add(downloadTask);
            this.E.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        u0();
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        Map<String, DownloadTask> map = this.E;
        if (map == null || downloadTask == null) {
            return;
        }
        if (!map.containsKey(downloadTask.getCrc_link_type_val())) {
            this.D.add(downloadTask);
            this.E.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
        updateDowStateList(downloadTask);
        DownloadTask downloadTask2 = this.E.get(downloadTask.getCrc_link_type_val());
        if (downloadTask2 == null) {
            return;
        }
        downloadTask2.setStatus(downloadTask.getStatus());
        downloadTask2.setVer(downloadTask.getVer());
        downloadTask2.setCfg_ver(downloadTask.getCfg_ver());
        downloadTask2.setSource_ver(downloadTask.getSource_ver());
        u0();
    }

    private void t0() {
        List<DownloadTask> G;
        DownloadTask downloadTask = this.F;
        if (downloadTask == null) {
            return;
        }
        if (com.join.mgps.Util.g2.i(downloadTask.getMod_info())) {
            ModInfoBean modInfoBean = (ModInfoBean) JsonMapper.getInstance().fromJson(this.F.getMod_info(), ModInfoBean.class);
            if (modInfoBean != null && (G = p1.f.K().G(modInfoBean.getMain_game_id(), modInfoBean.getMod_game_id())) != null) {
                for (DownloadTask downloadTask2 : G) {
                    if (Dtype.MOD.name().equals(downloadTask2.getFileType())) {
                        this.f38172z = downloadTask2.getCrc_link_type_val();
                        this.f38158l.setVisibility(0);
                        this.f38154h.setText("增强版");
                        MyImageLoader.h(this.f38153g, downloadTask2.getPortraitURL());
                        s0(new ArrayList<String>() { // from class: com.join.mgps.activity.UninstallWufunGameActivity.2
                            {
                                add(UninstallWufunGameActivity.this.f38172z);
                            }
                        });
                    } else {
                        this.f38171y = downloadTask2.getCrc_link_type_val();
                        this.f38163q.setVisibility(0);
                        this.f38160n.setText("标准版");
                        MyImageLoader.h(this.f38159m, downloadTask2.getPortraitURL());
                    }
                }
            }
        } else if (this.F.isSingleGame()) {
            this.f38172z = this.F.getCrc_link_type_val();
            this.f38158l.setVisibility(0);
            this.f38154h.setText(this.F.getShowName());
            this.f38155i.setVisibility(8);
            MyImageLoader.h(this.f38153g, this.F.getPortraitURL());
        } else {
            this.f38158l.setVisibility(8);
            this.f38171y = this.F.getCrc_link_type_val();
            this.f38163q.setVisibility(0);
            this.f38172z = this.F.getCrc_link_type_val();
            this.f38160n.setText(this.F.getShowName());
            this.f38162p.setVisibility(8);
            MyImageLoader.h(this.f38159m, this.F.getPortraitURL());
        }
        this.f38156j.setVisibility(8);
        this.f38161o.setVisibility(8);
        if (this.f38158l.getVisibility() == 0 && this.f38163q.getVisibility() == 0) {
            this.f38157k.setVisibility(0);
            this.f38162p.setVisibility(0);
            this.f38165s.setVisibility(8);
            this.f38164r.setBackgroundResource(R.drawable.shape_46c1ff_r8);
            this.f38164r.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (this.f38158l.getVisibility() != 0) {
            this.f38157k.setVisibility(8);
            this.f38162p.setVisibility(8);
            this.f38165s.setVisibility(8);
            this.f38164r.setBackgroundResource(R.drawable.shape_46c1ff_r8);
            this.f38164r.setTextColor(Color.parseColor("#FFFFFF"));
            if ((TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.FBA.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.FC.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.GBA.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.MD.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.SFC.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.PSP.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.PS.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.WSC.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.GBC.value()))) && r0(this.F).size() > 0) {
                this.f38165s.setVisibility(0);
                this.f38164r.setBackgroundResource(R.drawable.shape_e6e6e6_r8);
                this.f38164r.setTextColor(Color.parseColor("#929292"));
            }
        } else if (this.f38163q.getVisibility() != 0) {
            this.f38157k.setVisibility(8);
            this.f38162p.setVisibility(8);
            if (this.F.isSingleGame()) {
                this.f38165s.setVisibility(8);
                this.f38164r.setBackgroundResource(R.drawable.shape_46c1ff_r8);
                this.f38164r.setTextColor(Color.parseColor("#FFFFFF"));
                return;
            }
            this.f38165s.setVisibility(0);
        }
    }

    private void updateDowStateList(DownloadTask downloadTask) {
        for (int i4 = 0; i4 < this.C.getItemCount(); i4++) {
            try {
                CommonGameInfoBean item = this.C.getItem(i4);
                GInfoBean g_info = item.getG_info();
                if (g_info != null) {
                    if (item.isModGameVm()) {
                        DownloadTask downloadTask2 = this.E.get(g_info.getId());
                        boolean z4 = true;
                        boolean z5 = downloadTask2 != null && downloadTask2.getStatus() == 5;
                        DownloadTask downloadTask3 = this.E.get(g_info.getMod_id());
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
        if (this.J < 0 || this.I >= this.C.getItemCount()) {
            return;
        }
        for (int i4 = this.J; i4 <= this.I; i4++) {
            CommonGameInfoBean item = this.C.getItem(i4);
            if (item != null && (downloadTask = item.getDownloadTask()) != null && (downloadTask.getStatus() == 2 || downloadTask.getStatus() == 12)) {
                RecyclerView.ViewHolder childViewHolder = this.f38168v.getChildViewHolder(this.f38168v.getChildAt(i4 - this.J));
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void A0() {
        try {
            this.f38167u.setVisibility(0);
            this.f38169w.setVisibility(8);
            this.f38170x.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        ExtBean extBean = new ExtBean();
        if (this.F.getExt() != null) {
            extBean = (ExtBean) JsonMapper.getInstance().fromJson(this.F.getExt(), ExtBean.class);
        }
        ModInfoBean modInfoBean = this.F.getModInfoBean();
        GamedetailVideoMainActivity_.intent(this).gameId(modInfoBean == null ? this.f38171y : modInfoBean.getMain_game_id()).isShowComment(true).extBean(extBean).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void C0() {
        if (this.f38158l.getVisibility() == 0 && this.f38163q.getVisibility() == 0 && !this.f38157k.isSelected() && !this.f38162p.isSelected()) {
            showToast("请至少选择一个要删除的游戏");
            return;
        }
        if (this.f38157k.isSelected() || (this.f38158l.getVisibility() == 0 && this.f38163q.getVisibility() != 0)) {
            m0(this.f38172z);
        }
        if (this.f38162p.isSelected() || (this.f38163q.getVisibility() == 0 && this.f38158l.getVisibility() != 0)) {
            l0(this.f38171y);
        }
        Ext ext = new Ext();
        ext.setGameId(this.f38171y);
        ext.setClearStatus(2);
        com.papa.sim.statistic.p.l(this.G).O1(Event.uninstallGameSuccess, ext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void D0() {
        ModGameArchivePathDataV2 modGameArchivePathDataV2;
        if (this.f38158l.getVisibility() == 0 && this.f38163q.getVisibility() == 0 && !this.f38157k.isSelected() && !this.f38162p.isSelected()) {
            showToast("请至少选择一个要删除的游戏");
            return;
        }
        if (this.f38157k.isSelected() || (this.f38158l.getVisibility() == 0 && this.f38163q.getVisibility() != 0)) {
            DownloadTask F = p1.f.K().F(this.f38172z);
            if (F != null && (modGameArchivePathDataV2 = this.H) != null && modGameArchivePathDataV2.getMainLocalPath() != null) {
                String mainLocalPath = this.H.getMainLocalPath();
                String b02 = com.join.mgps.va.overmind.f.f54952a.b0();
                if (mainLocalPath.startsWith("/data/data")) {
                    mainLocalPath = mainLocalPath.replace("/data/data", "/data/user/0");
                    b02 = b02.replace("/sdcard", "");
                }
                x0(b02 + mainLocalPath, F.getCrc_link_type_val());
            }
            m0(this.f38172z);
        }
        if (this.f38162p.isSelected() || (this.f38163q.getVisibility() == 0 && this.f38158l.getVisibility() != 0)) {
            if (TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.FBA.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.FC.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.GBA.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.MD.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.SFC.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.PSP.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.PS.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.WSC.value())) || TextUtils.equals(this.F.getPlugin_num(), String.valueOf(ConstantIntEnum.GBC.value()))) {
                y0(r0(this.F), this.F.getCrc_link_type_val());
            }
            l0(this.f38171y);
        }
        Ext ext = new Ext();
        ext.setGameId(this.f38171y);
        ext.setClearStatus(1);
        com.papa.sim.statistic.p.l(this.G).O1(Event.uninstallGameSuccess, ext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void E0(UninstallGuessLikeBean uninstallGuessLikeBean) {
        if (uninstallGuessLikeBean == null || uninstallGuessLikeBean.getGuessYouLikeInfo() == null || uninstallGuessLikeBean.getGuessYouLikeInfo().size() <= 0) {
            return;
        }
        A0();
        if (this.B == null) {
            this.B = new ArrayList();
        }
        List<CommonGameInfoBean> guessYouLikeInfo = uninstallGuessLikeBean.getGuessYouLikeInfo();
        this.B = guessYouLikeInfo;
        for (CommonGameInfoBean commonGameInfoBean : guessYouLikeInfo) {
            commonGameInfoBean.set_from(168);
            commonGameInfoBean.set_from_type(168);
            if (commonGameInfoBean.getG_info() != null) {
                DownloadTask F = p1.f.K().F(commonGameInfoBean.getG_info().getId());
                DownloadTask F2 = p1.f.K().F(commonGameInfoBean.getG_info().getMod_id());
                if (F != null) {
                    commonGameInfoBean.setDownloadTask(F);
                    this.D.add(F);
                    this.E.put(F.getCrc_link_type_val(), F);
                } else if (F2 != null) {
                    commonGameInfoBean.setDownloadTask(F2);
                    this.D.add(F2);
                    this.E.put(F2.getCrc_link_type_val(), F2);
                }
            }
        }
        UninstallGuessLikeAdapter uninstallGuessLikeAdapter = this.C;
        if (uninstallGuessLikeAdapter != null) {
            uninstallGuessLikeAdapter.setNewData(this.B);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.G = this;
        com.join.mgps.Util.d0.a().d(this);
        DownloadTask F = p1.f.K().F(this.f38171y);
        this.F = F;
        if (F == null) {
            finish();
            return;
        }
        t0();
        this.A = com.join.mgps.rpc.impl.i.D0();
        this.C = new UninstallGuessLikeAdapter(this.B);
        this.f38168v.setLayoutManager(new GridLayoutManager(this, 2));
        this.f38168v.setAdapter(this.C);
        this.f38168v.addOnScrollListener(new a());
        p0();
        Ext ext = new Ext();
        ext.setGameId(this.f38171y);
        com.papa.sim.statistic.p.l(this.G).O1(Event.goUninstallGamePage, ext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.f72016o})
    public void apkInstalRecver(Intent intent) {
        this.K = 0;
        new Handler().postDelayed(new d(intent), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    void l0(String str) {
        DownloadTask F;
        if (this.f38161o.getVisibility() == 0 || (F = p1.f.K().F(str)) == null) {
            return;
        }
        boolean z4 = false;
        if (F.getStatus() == 2) {
            this.f38161o.setVisibility(0);
            this.f38162p.setVisibility(8);
            this.f38162p.setSelected(false);
        }
        String fileType = F.getFileType();
        if (!TextUtils.isEmpty(fileType) && fileType.equals(Dtype.android.name())) {
            z4 = true;
        }
        if (z4) {
            if (com.join.android.app.common.utils.e.l0(this.G).d(this.G, F.getPackageName())) {
                if (F.getStatus() != 5 && F.getStatus() != 9) {
                    UtilsMy.J0(F);
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.G).l(this.G, F.getPackageName());
                    if (l4 != null) {
                        F.setVer(l4.d() + "");
                    }
                    UtilsMy.S2(F, 5);
                } else {
                    com.join.android.app.common.utils.e.l0(this.G).f0(this.G, F.getPackageName());
                }
            } else {
                UtilsMy.M0(F);
                UtilsMy.x4(F);
            }
        } else {
            UtilsMy.M0(F);
            UtilsMy.x4(F);
        }
        new Handler().postDelayed(new b(str), 1000L);
    }

    void m0(String str) {
        if (this.f38156j.getVisibility() == 0) {
            return;
        }
        DownloadTask F = p1.f.K().F(str);
        if (F != null && F.getStatus() == 48) {
            showToast("游戏安装中无法删除");
            return;
        }
        if (F != null && F.getStatus() == 2) {
            this.f38156j.setVisibility(0);
            this.f38157k.setVisibility(8);
            this.f38157k.setSelected(false);
        }
        UtilsMy.O0(this.G, F);
        new Handler().postDelayed(new c(str), 1000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        if (this.f38156j.getVisibility() != 0 && this.f38157k.getVisibility() == 0) {
            ImageView imageView = this.f38157k;
            imageView.setSelected(!imageView.isSelected());
            this.f38165s.setVisibility(this.f38157k.isSelected() ? 0 : 8);
            this.f38164r.setBackgroundResource(this.f38157k.isSelected() ? R.drawable.shape_e6e6e6_r8 : R.drawable.shape_46c1ff_r8);
            this.f38164r.setTextColor(Color.parseColor(this.f38157k.isSelected() ? "#929292" : "#FFFFFF"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        if (this.f38161o.getVisibility() != 0 && this.f38162p.getVisibility() == 0) {
            ImageView imageView = this.f38162p;
            imageView.setSelected(!imageView.isSelected());
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
                                    G0(nVar.b(), nVar.c());
                                    return;
                                default:
                                    return;
                            }
                    }
                } else {
                    Map<String, DownloadTask> map = this.E;
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
    @Background
    public void p0() {
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
                uninstallGuessLikeArgs.setGameId(TextUtils.isEmpty(this.f38172z) ? this.f38171y : this.f38172z);
                requestModel.setArgs(uninstallGuessLikeArgs);
                requestModel.setDefault(this);
                ResponseModel<UninstallGuessLikeBean> M = this.A.M(requestModel.makeSign());
                if (M != null && M.getCode() == 200 && M.getData() != null) {
                    E0(M.getData());
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
    @Click
    public void relodingimag() {
        showLoding();
        p0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void s0(List<String> list) {
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
                ResponseModel<ArchievePathMultiBean> r4 = this.A.r(requestModel.makeSign());
                if (r4 != null && r4.getCode() == 200 && r4.getData() != null && r4.getData().getCloud_archive_path_list() != null && r4.getData().getCloud_archive_path_list().size() > 0) {
                    this.H = r4.getData().getCloud_archive_path_list().get(0);
                    v0();
                    return;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            z0(false);
        }
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
            this.f38169w.setVisibility(0);
            this.f38170x.setVisibility(8);
            this.f38167u.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            this.f38169w.setVisibility(8);
            this.f38170x.setVisibility(0);
            this.f38167u.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this.G).b(str);
    }

    void u0() {
        UninstallGuessLikeAdapter uninstallGuessLikeAdapter = this.C;
        if (uninstallGuessLikeAdapter != null) {
            uninstallGuessLikeAdapter.notifyDataSetChanged();
        }
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
    public void v0() {
        String q02 = q0();
        File file = q02 != null ? new File(q02) : null;
        if (file != null && file.exists() && file.length() > 0) {
            if (this.f38158l.getVisibility() == 0 && this.f38163q.getVisibility() == 0) {
                this.f38165s.setVisibility(8);
                this.f38164r.setBackgroundResource(R.drawable.shape_46c1ff_r8);
                this.f38164r.setTextColor(Color.parseColor("#FFFFFF"));
            } else {
                this.f38165s.setVisibility(0);
                this.f38164r.setBackgroundResource(R.drawable.shape_e6e6e6_r8);
                this.f38164r.setTextColor(Color.parseColor("#929292"));
            }
            this.f38155i.setVisibility(0);
            return;
        }
        this.f38165s.setVisibility(8);
        this.f38164r.setBackgroundResource(R.drawable.shape_46c1ff_r8);
        this.f38164r.setTextColor(Color.parseColor("#FFFFFF"));
        this.f38155i.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void w0() {
        if (this.f38158l.getVisibility() != 0 && this.f38161o.getVisibility() == 0) {
            this.f38164r.setVisibility(8);
        } else if (this.f38163q.getVisibility() != 0 && this.f38156j.getVisibility() == 0) {
            this.f38164r.setVisibility(8);
        } else if (this.f38158l.getVisibility() == 0 && this.f38163q.getVisibility() == 0 && this.f38156j.getVisibility() == 0 && this.f38161o.getVisibility() == 0) {
            this.f38164r.setVisibility(8);
        }
    }

    void x0(String str, String str2) {
        try {
            if (new File(str).exists()) {
                com.join.mgps.Util.h0.d(str, getExternalFilesDir("backup") + File.separator + str2);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void y0(List<String> list, String str) {
        try {
            String str2 = getExternalFilesDir("backup") + File.separator + str;
            for (String str3 : list) {
                if (new File(str3).exists()) {
                    com.join.mgps.Util.h0.c(str3, str2 + File.separator + str3.substring(str3.lastIndexOf(net.lingala.zip4j.util.e.F0)));
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void z0(boolean z4) {
        this.f38165s.setVisibility(z4 ? 0 : 8);
        this.f38164r.setBackgroundResource(z4 ? R.drawable.shape_e6e6e6_r8 : R.drawable.shape_46c1ff_r8);
        this.f38164r.setTextColor(Color.parseColor(z4 ? "#929292" : "#FFFFFF"));
    }
}
