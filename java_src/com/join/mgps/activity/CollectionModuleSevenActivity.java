package com.join.mgps.activity;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseAppCompatActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.adapter.CollectionModuleSevenAdapter;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.CollectionModuleSevenArgs;
import com.join.mgps.dto.CollectionModuleSevenBean;
import com.join.mgps.dto.CollectionModuleSevenItemBean;
import com.join.mgps.dto.CollectionModuleSevenSubBean;
import com.join.mgps.dto.CollectionSevenListBean;
import com.join.mgps.dto.CommonGameInfoBean;
import com.join.mgps.dto.GInfoBean;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa.sim.statistic.Data;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_collection_module_seven)
/* loaded from: classes.dex */
public class CollectionModuleSevenActivity extends BaseAppCompatActivity {

    /* renamed from: r  reason: collision with root package name */
    private static final String f29102r = "CollectionModuleSeven";

    /* renamed from: b  reason: collision with root package name */
    private Context f29103b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f29104c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f29105d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f29106e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f29107f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ImageView f29108g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    ImageView f29109h;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    String f29110i;

    /* renamed from: k  reason: collision with root package name */
    private CollectionModuleSevenAdapter f29112k;

    /* renamed from: l  reason: collision with root package name */
    private com.join.android.app.component.video.g f29113l;

    /* renamed from: o  reason: collision with root package name */
    private int f29116o;

    /* renamed from: p  reason: collision with root package name */
    private int f29117p;

    /* renamed from: j  reason: collision with root package name */
    private List<CollectionSevenListBean> f29111j = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private Map<String, DownloadTask> f29114m = new ConcurrentHashMap();

    /* renamed from: n  reason: collision with root package name */
    private List<CommonGameInfoBean> f29115n = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    private boolean f29118q = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 == 0) {
                CollectionModuleSevenActivity.this.autoPlay();
                CollectionModuleSevenActivity.this.l0();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null) {
                CollectionModuleSevenActivity.this.f29116o = linearLayoutManager.findLastVisibleItemPosition();
                CollectionModuleSevenActivity.this.f29117p = linearLayoutManager.findFirstVisibleItemPosition();
            }
        }
    }

    private void k0(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean == null || commonGameInfoBean.getG_info() == null) {
            return;
        }
        DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
        GInfoBean g_info = commonGameInfoBean.getG_info();
        String plugin_num = g_info.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            IntentDateBean intentDataBean = commonGameInfoBean.getIntentDataBean();
            UtilsMy.T2(downloadTask, this.f29103b);
            IntentUtil.getInstance().intentActivity(this.f29103b, intentDataBean);
        } else if (downloadTask == null) {
            if (UtilsMy.o0(g_info.getTag_info()) && com.join.android.app.common.utils.e.l0(this.f29103b).d(this.f29103b, g_info.getPackage_name())) {
                APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f29103b).l(this.f29103b, g_info.getPackage_name());
                if (!com.join.mgps.Util.g2.i(g_info.getVer()) || l4.d() >= Integer.parseInt(g_info.getVer())) {
                    com.join.android.app.common.utils.e.l0(this.f29103b);
                    APKUtils.a0(this.f29103b, g_info.getPackage_name());
                    return;
                }
            }
            if (UtilsMy.y0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                UtilsMy.d4(this.f29103b, g_info.getId());
            } else {
                UtilsMy.F2(this.f29103b, commonGameInfoBean);
            }
        } else {
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            downloadTask.set_from(commonGameInfoBean.get_from());
            downloadTask.set_from_type(commonGameInfoBean.get_from_type());
            if (UtilsMy.w0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status != 13) {
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(this.f29103b, downloadTask);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        UtilsMy.r4(this.f29103b, downloadTask);
                                        return;
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (!com.join.android.app.common.utils.j.j(this.f29103b)) {
                                                    com.join.mgps.Util.l2.a(this.f29103b).b("无网络连接");
                                                    return;
                                                } else {
                                                    UtilsMy.I2(this.f29103b, downloadTask);
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(downloadTask, this.f29103b);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(downloadTask, this.f29103b);
                        return;
                    }
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                }
                com.php25.PDownload.d.l(this.f29103b, downloadTask);
                return;
            }
            UtilsMy.F2(this.f29103b, commonGameInfoBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        try {
            try {
                if (!this.f29118q) {
                    this.f29118q = true;
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f29104c.getLayoutManager();
                    if (linearLayoutManager != null) {
                        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                        for (int i4 = 0; i4 <= findLastVisibleItemPosition; i4++) {
                            CollectionSevenListBean collectionSevenListBean = this.f29111j.get(i4);
                            if (!collectionSevenListBean.isHasExposure()) {
                                collectionSevenListBean.setHasExposure(true);
                                int itemType = collectionSevenListBean.getItemType();
                                if ((itemType == 2 || itemType == 3) && (collectionSevenListBean.getItem() instanceof CommonGameInfoBean)) {
                                    CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) collectionSevenListBean.getItem();
                                    if (UtilsMy.g2(commonGameInfoBean)) {
                                        try {
                                            Ext ext = new Ext();
                                            ext.setResultCode("discount_game");
                                            ext.setScenesCode(getClass().getSimpleName());
                                            Data data = new Data();
                                            data.setGameId(Long.parseLong(commonGameInfoBean.getG_info().getId()));
                                            com.papa.sim.statistic.p.l(this.f29103b).Y(Event.expGameAdPage, ext, data);
                                        } catch (Exception e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } finally {
                this.f29118q = false;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m0(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        Object item = this.f29111j.get(i4).getItem();
        if (item instanceof CommonGameInfoBean) {
            IntentUtil.getInstance().intentActivity(this, ((CommonGameInfoBean) item).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        Object item = this.f29111j.get(i4).getItem();
        if (item instanceof CommonGameInfoBean) {
            CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) item;
            if (commonGameInfoBean.getG_info() != null) {
                if (commonGameInfoBean.getJp_info() != null && commonGameInfoBean.getJp_info().getLink_type().intValue() != 1) {
                    IntentUtil.getInstance().intentActivity(this.f29103b, commonGameInfoBean.getIntentDataBean());
                } else {
                    k0(commonGameInfoBean);
                }
            }
        }
    }

    private void o0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x0929 A[Catch: Exception -> 0x0b76, TryCatch #3 {Exception -> 0x0b76, blocks: (B:156:0x0796, B:158:0x07b0, B:160:0x07b4, B:162:0x07ba, B:164:0x07cc, B:166:0x07d2, B:168:0x07e4, B:170:0x07ea, B:172:0x0805, B:174:0x080e, B:175:0x082f, B:177:0x0835, B:180:0x0840, B:182:0x084a, B:184:0x0856, B:186:0x0862, B:188:0x086e, B:190:0x087a, B:192:0x0886, B:194:0x0892, B:196:0x089e, B:198:0x08a4, B:200:0x08ae, B:203:0x08c6, B:204:0x08e2, B:206:0x0929, B:208:0x0933, B:210:0x0945, B:212:0x0953, B:214:0x096d, B:216:0x097b, B:217:0x099e, B:218:0x09c4, B:219:0x09fe, B:220:0x0a38, B:236:0x0a55, B:238:0x0a5a, B:239:0x0a64, B:240:0x0a6e, B:241:0x0a93, B:242:0x0a9d, B:243:0x0ac0, B:244:0x0ae5, B:245:0x0b09, B:246:0x0b2d, B:247:0x0b52, B:173:0x080a), top: B:259:0x0796 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0a38 A[Catch: Exception -> 0x0b76, TryCatch #3 {Exception -> 0x0b76, blocks: (B:156:0x0796, B:158:0x07b0, B:160:0x07b4, B:162:0x07ba, B:164:0x07cc, B:166:0x07d2, B:168:0x07e4, B:170:0x07ea, B:172:0x0805, B:174:0x080e, B:175:0x082f, B:177:0x0835, B:180:0x0840, B:182:0x084a, B:184:0x0856, B:186:0x0862, B:188:0x086e, B:190:0x087a, B:192:0x0886, B:194:0x0892, B:196:0x089e, B:198:0x08a4, B:200:0x08ae, B:203:0x08c6, B:204:0x08e2, B:206:0x0929, B:208:0x0933, B:210:0x0945, B:212:0x0953, B:214:0x096d, B:216:0x097b, B:217:0x099e, B:218:0x09c4, B:219:0x09fe, B:220:0x0a38, B:236:0x0a55, B:238:0x0a5a, B:239:0x0a64, B:240:0x0a6e, B:241:0x0a93, B:242:0x0a9d, B:243:0x0ac0, B:244:0x0ae5, B:245:0x0b09, B:246:0x0b2d, B:247:0x0b52, B:173:0x080a), top: B:259:0x0796 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027d A[Catch: Exception -> 0x078f, TryCatch #1 {Exception -> 0x078f, blocks: (B:41:0x00c6, B:44:0x00da, B:46:0x00e4, B:48:0x00e8, B:50:0x00ee, B:52:0x0100, B:54:0x0106, B:56:0x0118, B:58:0x0123, B:60:0x013e, B:62:0x0147, B:63:0x0167, B:65:0x016d, B:68:0x0177, B:70:0x0181, B:72:0x018d, B:74:0x0199, B:76:0x01a5, B:78:0x01b1, B:80:0x01bd, B:82:0x01c9, B:84:0x01d5, B:86:0x01db, B:88:0x01e5, B:91:0x01fc, B:93:0x021c, B:95:0x027d, B:97:0x029b, B:99:0x02c2, B:101:0x02d4, B:103:0x02e2, B:105:0x02fc, B:107:0x030a, B:108:0x032d, B:109:0x0353, B:110:0x038d, B:111:0x03c7, B:130:0x03ee, B:131:0x0445, B:132:0x049f, B:133:0x04e2, B:134:0x0543, B:138:0x0594, B:148:0x0625, B:147:0x0622, B:149:0x063d, B:150:0x06d0, B:151:0x0713, B:152:0x0750, B:61:0x0143, B:139:0x05d2, B:141:0x05dc, B:143:0x0619, B:142:0x05fb), top: B:255:0x00c6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q0(com.github.snowdream.android.app.downloader.DownloadTask r19) {
        /*
            Method dump skipped, instructions count: 2972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.CollectionModuleSevenActivity.q0(com.github.snowdream.android.app.downloader.DownloadTask):void");
    }

    private void receiveDelete(DownloadTask downloadTask) {
        for (CommonGameInfoBean commonGameInfoBean : this.f29115n) {
            if (commonGameInfoBean.getG_info() != null && (TextUtils.equals(commonGameInfoBean.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(commonGameInfoBean.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                commonGameInfoBean.setDownloadTask(null);
            }
        }
        o0();
        q0(downloadTask);
    }

    private void receiveError(DownloadTask downloadTask) {
        for (CommonGameInfoBean commonGameInfoBean : this.f29115n) {
            if (commonGameInfoBean.getG_info() != null && (TextUtils.equals(commonGameInfoBean.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(commonGameInfoBean.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                commonGameInfoBean.setDownloadTask(downloadTask);
            }
        }
        o0();
        q0(downloadTask);
    }

    private void receiveStart(DownloadTask downloadTask) {
        for (CommonGameInfoBean commonGameInfoBean : this.f29115n) {
            if (commonGameInfoBean.getG_info() != null && (TextUtils.equals(commonGameInfoBean.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(commonGameInfoBean.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                commonGameInfoBean.setDownloadTask(downloadTask);
            }
        }
        o0();
        q0(downloadTask);
    }

    private void receiveSuccess(DownloadTask downloadTask) {
        for (CommonGameInfoBean commonGameInfoBean : this.f29115n) {
            if (commonGameInfoBean.getG_info() != null && (TextUtils.equals(commonGameInfoBean.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(commonGameInfoBean.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                commonGameInfoBean.setDownloadTask(downloadTask);
            }
        }
        o0();
        q0(downloadTask);
    }

    private CommonGameInfoBean s0(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean == null) {
            return commonGameInfoBean;
        }
        Iterator<DownloadTask> it2 = p1.f.K().d().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DownloadTask next = it2.next();
            if (commonGameInfoBean.getG_info() != null && TextUtils.equals(next.getCrc_link_type_val(), commonGameInfoBean.getG_info().getMod_id())) {
                next.set_from(168);
                next.set_from_type(168);
                commonGameInfoBean.setDownloadTask(next);
                break;
            } else if (commonGameInfoBean.getG_info() != null && TextUtils.equals(next.getCrc_link_type_val(), commonGameInfoBean.getG_info().getId())) {
                next.set_from(168);
                next.set_from_type(168);
                commonGameInfoBean.setDownloadTask(next);
            }
        }
        commonGameInfoBean.set_from(168);
        commonGameInfoBean.set_from_type(168);
        return commonGameInfoBean;
    }

    private void updateProgressPartly() {
        int i4 = this.f29117p;
        if (i4 >= 0) {
            while (i4 <= Math.min(this.f29116o + 1, this.f29112k.getItemCount() - 1)) {
                CollectionSevenListBean collectionSevenListBean = (CollectionSevenListBean) this.f29112k.getItem(i4);
                if (collectionSevenListBean != null && collectionSevenListBean.getItemType() == 3) {
                    try {
                        CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) collectionSevenListBean.getItem();
                        RecyclerView.ViewHolder childViewHolder = this.f29104c.getChildViewHolder(this.f29104c.getChildAt(i4 - this.f29117p));
                        if (childViewHolder instanceof BaseViewHolder) {
                            BaseViewHolder baseViewHolder = (BaseViewHolder) childViewHolder;
                            if (commonGameInfoBean != null && commonGameInfoBean.getDownloadTask() != null) {
                                DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
                                DownloadTask f5 = com.join.android.app.common.servcie.i.e().f(downloadTask.getCrc_link_type_val());
                                if (f5 != null) {
                                    long parseDouble = (long) (Double.parseDouble(f5.getShowSize()) * 1024.0d * 1024.0d);
                                    if (downloadTask.getSize() == 0) {
                                        baseViewHolder.setText(R.id.appSize, UtilsMy.g(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(parseDouble));
                                    } else {
                                        baseViewHolder.setText(R.id.appSize, UtilsMy.g(f5.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.g(parseDouble));
                                    }
                                    if (downloadTask.getStatus() == 12) {
                                        baseViewHolder.setProgress(R.id.progressBarZip, (int) f5.getProgress());
                                    } else {
                                        baseViewHolder.setProgress(R.id.progressBar, (int) f5.getProgress());
                                    }
                                    if (downloadTask.getStatus() == 2) {
                                        baseViewHolder.setText(R.id.loding_info, f5.getSpeed() + "/S");
                                    }
                                }
                            }
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
                i4++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterviews() {
        this.f29103b = this;
        if (TextUtils.isEmpty(this.f29110i)) {
            showMessage("专区id不存在");
            finish();
        }
        com.join.mgps.Util.d0.a().d(this);
        this.f29113l = new com.join.android.app.component.video.g(this.f29104c, "PapaMainV3Fragment");
        this.f29104c.setLayoutManager(new LinearLayoutManager(this.f29103b));
        CollectionModuleSevenAdapter collectionModuleSevenAdapter = new CollectionModuleSevenAdapter(this.f29111j, this.f29113l);
        this.f29112k = collectionModuleSevenAdapter;
        this.f29104c.setAdapter(collectionModuleSevenAdapter);
        this.f29112k.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.mgps.activity.e
            @Override // com.join.mgps.base.BaseQuickAdapter.j
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                CollectionModuleSevenActivity.this.m0(baseQuickAdapter, view, i4);
            }
        });
        this.f29112k.setOnItemChildClickListener(new BaseQuickAdapter.h() { // from class: com.join.mgps.activity.d
            @Override // com.join.mgps.base.BaseQuickAdapter.h
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                CollectionModuleSevenActivity.this.n0(baseQuickAdapter, view, i4);
            }
        });
        this.f29104c.addOnScrollListener(new a());
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void autoPlay() {
        com.join.android.app.component.video.g gVar = this.f29113l;
        if (gVar != null) {
            gVar.g(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        if (com.join.android.app.common.utils.j.j(this.f29103b)) {
            try {
                showLoding();
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this.f29103b);
                CollectionModuleSevenArgs collectionModuleSevenArgs = new CollectionModuleSevenArgs();
                collectionModuleSevenArgs.setTemplateId(this.f29110i);
                requestModel.setArgs(collectionModuleSevenArgs);
                ResponseModel<CollectionModuleSevenBean> body = com.join.mgps.rpc.impl.i.D0().B0().o0(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200 && body.getData() != null) {
                    r0(body.getData());
                } else {
                    showLodingFailed();
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingFailed();
                return;
            }
        }
        showMessage("当前网络不可用");
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
        com.join.android.app.component.video.g gVar = this.f29113l;
        if (gVar != null) {
            gVar.t();
        }
    }

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
                } else if (c5 == 7) {
                    updateUI(a5, 3);
                } else if (c5 == 8) {
                    Map<String, DownloadTask> map = this.f29114m;
                    if (map != null && !map.isEmpty()) {
                        updateProgressPartly();
                    }
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            updateUI(a5, 7);
                            break;
                        case 12:
                            updateUI(a5, 8);
                            break;
                        case 13:
                            updateUI(a5, 9);
                            break;
                    }
                }
            }
            updateUI(a5, 5);
        } else {
            updateUI(a5, 2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("receiveStart: ");
        sb.append(nVar.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.join.android.app.component.video.g gVar = this.f29113l;
        if (gVar != null) {
            gVar.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.join.android.app.component.video.g gVar = this.f29113l;
        if (gVar != null) {
            gVar.A();
        }
        List<DownloadTask> d5 = p1.f.K().d();
        if (d5 == null || d5.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : d5) {
            this.f29114m.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0() {
        LinearLayout linearLayout = this.f29107f;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f29106e;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void r0(CollectionModuleSevenBean collectionModuleSevenBean) {
        p0();
        if (collectionModuleSevenBean != null && collectionModuleSevenBean.getTemplate_items() != null) {
            this.f29105d.setText(collectionModuleSevenBean.getTitle());
            for (CollectionModuleSevenSubBean collectionModuleSevenSubBean : collectionModuleSevenBean.getTemplate_items()) {
                if (collectionModuleSevenSubBean != null && collectionModuleSevenSubBean.getModel_val() != null) {
                    int model_type = collectionModuleSevenSubBean.getModel_type();
                    CollectionModuleSevenItemBean model_val = collectionModuleSevenSubBean.getModel_val();
                    if (model_val != null && !TextUtils.isEmpty(model_val.getTitle())) {
                        CollectionSevenListBean collectionSevenListBean = new CollectionSevenListBean();
                        collectionSevenListBean.setType(1);
                        if (collectionModuleSevenSubBean.getModel_val() != null) {
                            collectionSevenListBean.setTitle(collectionModuleSevenSubBean.getModel_val().getTitle());
                            collectionSevenListBean.setSubTitle(collectionModuleSevenSubBean.getModel_val().getSub_title());
                            collectionSevenListBean.setCollection_id(collectionModuleSevenSubBean.getModel_val().getCollection_id());
                            collectionSevenListBean.setTpl_type(collectionModuleSevenSubBean.getModel_val().getTpl_type());
                        } else {
                            collectionSevenListBean.setTitle(collectionModuleSevenSubBean.getTitle());
                        }
                        this.f29111j.add(collectionSevenListBean);
                    }
                    if (model_type == 1) {
                        if (model_val != null && model_val.getGame_info() != null) {
                            CommonGameInfoBean game_info = model_val.getGame_info();
                            if (!TextUtils.isEmpty(model_val.getCover_url())) {
                                game_info.setBig_pic(model_val.getCover_url());
                            }
                            if (!TextUtils.isEmpty(model_val.getVideo_url())) {
                                game_info.setV_url(model_val.getVideo_url());
                            }
                            this.f29111j.add(new CollectionSevenListBean(2, s0(game_info)));
                            this.f29115n.add(model_val.getGame_info());
                        }
                    } else if (model_type == 2) {
                        if (model_val != null && model_val.getCollection_list() != null) {
                            List<CommonGameInfoBean> collection_list = model_val.getCollection_list();
                            for (CommonGameInfoBean commonGameInfoBean : collection_list) {
                                s0(commonGameInfoBean);
                            }
                            this.f29111j.add(new CollectionSevenListBean(4, collection_list));
                            this.f29115n.addAll(model_val.getCollection_list());
                        }
                        if (model_val != null && model_val.getGame_list() != null) {
                            for (CommonGameInfoBean commonGameInfoBean2 : model_val.getGame_list()) {
                                this.f29111j.add(new CollectionSevenListBean(3, s0(commonGameInfoBean2)));
                                this.f29115n.add(commonGameInfoBean2);
                            }
                        }
                    } else if (model_type == 3) {
                        if (model_val != null && model_val.getGame_big() != null) {
                            CommonGameInfoBean game_big = model_val.getGame_big();
                            if (!TextUtils.isEmpty(model_val.getCover_url())) {
                                game_big.setBig_pic(model_val.getCover_url());
                            }
                            if (!TextUtils.isEmpty(model_val.getVideo_url())) {
                                game_big.setV_url(model_val.getVideo_url());
                            }
                            this.f29111j.add(new CollectionSevenListBean(2, s0(game_big)));
                            this.f29115n.add(model_val.getGame_big());
                        }
                        if (model_val != null && model_val.getGame_list() != null) {
                            for (CommonGameInfoBean commonGameInfoBean3 : model_val.getGame_list()) {
                                this.f29111j.add(new CollectionSevenListBean(3, s0(commonGameInfoBean3)));
                                this.f29115n.add(commonGameInfoBean3);
                            }
                        }
                    } else if (model_type == 4) {
                        if (model_val != null && model_val.getGame_big_list() != null) {
                            for (CommonGameInfoBean commonGameInfoBean4 : model_val.getGame_big_list()) {
                                this.f29111j.add(new CollectionSevenListBean(2, s0(commonGameInfoBean4)));
                                this.f29115n.add(commonGameInfoBean4);
                            }
                        }
                    } else if (model_type == 5) {
                        if (model_val != null && model_val.getGame_list() != null) {
                            for (CommonGameInfoBean commonGameInfoBean5 : model_val.getGame_list()) {
                                this.f29111j.add(new CollectionSevenListBean(3, s0(commonGameInfoBean5)));
                                this.f29115n.add(commonGameInfoBean5);
                            }
                        }
                    } else if (model_type == 6) {
                        if (model_val != null && model_val.getCollection_list() != null) {
                            List<CommonGameInfoBean> collection_list2 = model_val.getCollection_list();
                            for (CommonGameInfoBean commonGameInfoBean6 : collection_list2) {
                                s0(commonGameInfoBean6);
                            }
                            this.f29111j.add(new CollectionSevenListBean(4, collection_list2));
                            this.f29115n.addAll(model_val.getCollection_list());
                        }
                    } else if (model_type == 7 && model_val != null && model_val.getAdvert_list() != null) {
                        this.f29111j.add(new CollectionSevenListBean(5, model_val.getAdvert_list()));
                    }
                }
            }
            CollectionModuleSevenAdapter collectionModuleSevenAdapter = this.f29112k;
            if (collectionModuleSevenAdapter != null) {
                collectionModuleSevenAdapter.replaceData(this.f29111j);
            }
            autoPlay();
            l0();
            return;
        }
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f29103b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f29106e;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f29107f;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f29107f;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f29106e;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this.f29103b).b(str);
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
