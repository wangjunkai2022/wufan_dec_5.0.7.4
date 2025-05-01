package com.join.mgps.activity;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import com.join.mgps.fragment.BaseFragment;
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
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EFragment(R.layout.fragment_collection_module_seven)
/* loaded from: classes.dex */
public class CollectionModuleSevenFragment extends BaseFragment {

    /* renamed from: o  reason: collision with root package name */
    private static final String f29136o = "CollectionModuleSeven";

    /* renamed from: b  reason: collision with root package name */
    private Context f29137b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f29138c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f29139d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f29140e;

    /* renamed from: f  reason: collision with root package name */
    String f29141f;

    /* renamed from: h  reason: collision with root package name */
    private CollectionModuleSevenAdapter f29143h;

    /* renamed from: i  reason: collision with root package name */
    private com.join.android.app.component.video.g f29144i;

    /* renamed from: l  reason: collision with root package name */
    private int f29147l;

    /* renamed from: m  reason: collision with root package name */
    private int f29148m;

    /* renamed from: g  reason: collision with root package name */
    private List<CollectionSevenListBean> f29142g = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private Map<String, DownloadTask> f29145j = new ConcurrentHashMap();

    /* renamed from: k  reason: collision with root package name */
    private List<CommonGameInfoBean> f29146k = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    private boolean f29149n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends RecyclerView.OnScrollListener {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i4) {
            super.onScrollStateChanged(recyclerView, i4);
            if (i4 == 0) {
                CollectionModuleSevenFragment.this.c0();
                CollectionModuleSevenFragment.this.expDiscountGame();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i4, int i5) {
            super.onScrolled(recyclerView, i4, i5);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null) {
                CollectionModuleSevenFragment.this.f29147l = linearLayoutManager.findLastVisibleItemPosition();
                CollectionModuleSevenFragment.this.f29148m = linearLayoutManager.findFirstVisibleItemPosition();
            }
        }
    }

    private void d0(CommonGameInfoBean commonGameInfoBean) {
        if (commonGameInfoBean == null || commonGameInfoBean.getG_info() == null) {
            return;
        }
        DownloadTask downloadTask = commonGameInfoBean.getDownloadTask();
        GInfoBean g_info = commonGameInfoBean.getG_info();
        String plugin_num = g_info.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            IntentDateBean intentDataBean = commonGameInfoBean.getIntentDataBean();
            UtilsMy.T2(downloadTask, this.f29137b);
            IntentUtil.getInstance().intentActivity(this.f29137b, intentDataBean);
        } else if (downloadTask == null) {
            if (UtilsMy.o0(g_info.getTag_info()) && com.join.android.app.common.utils.e.l0(this.f29137b).d(this.f29137b, g_info.getPackage_name())) {
                APKUtils.a l4 = com.join.android.app.common.utils.e.l0(this.f29137b).l(this.f29137b, g_info.getPackage_name());
                if (!com.join.mgps.Util.g2.i(g_info.getVer()) || l4.d() >= Integer.parseInt(g_info.getVer())) {
                    com.join.android.app.common.utils.e.l0(this.f29137b);
                    APKUtils.a0(this.f29137b, g_info.getPackage_name());
                    return;
                }
            }
            if (UtilsMy.y0(g_info.getPay_tag_info(), g_info.getId()) > 0) {
                UtilsMy.d4(this.f29137b, g_info.getId());
            } else {
                UtilsMy.F2(this.f29137b, commonGameInfoBean);
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
                                UtilsMy.T3(this.f29137b, downloadTask);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        UtilsMy.r4(this.f29137b, downloadTask);
                                        return;
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (!com.join.android.app.common.utils.j.j(this.f29137b)) {
                                                    com.join.mgps.Util.l2.a(this.f29137b).b("无网络连接");
                                                    return;
                                                } else {
                                                    UtilsMy.I2(this.f29137b, downloadTask);
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(downloadTask, this.f29137b);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(downloadTask, this.f29137b);
                        return;
                    }
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                }
                com.php25.PDownload.d.l(this.f29137b, downloadTask);
                return;
            }
            UtilsMy.F2(this.f29137b, commonGameInfoBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void expDiscountGame() {
        try {
            try {
                if (isAdded() && !this.f29149n) {
                    this.f29149n = true;
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f29138c.getLayoutManager();
                    if (linearLayoutManager != null) {
                        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                        for (int i4 = 0; i4 <= findLastVisibleItemPosition; i4++) {
                            CollectionSevenListBean collectionSevenListBean = this.f29142g.get(i4);
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
                                            com.papa.sim.statistic.p.l(this.f29137b).Y(Event.expGameAdPage, ext, data);
                                        } catch (Exception e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } finally {
            this.f29149n = false;
        }
    }

    private void f0() {
        for (Fragment fragment : getParentFragmentManager().getFragments()) {
            if (fragment instanceof PapaMainV4SubHomeFragment_) {
                this.f29141f = ((PapaMainV4SubHomeFragment_) fragment).q0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g0(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        Object item = this.f29142g.get(i4).getItem();
        if (item instanceof CommonGameInfoBean) {
            IntentUtil.getInstance().intentActivity(this.f29137b, ((CommonGameInfoBean) item).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h0(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
        Object item = this.f29142g.get(i4).getItem();
        if (item instanceof CommonGameInfoBean) {
            CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) item;
            if (commonGameInfoBean.getG_info() != null) {
                if (commonGameInfoBean.getJp_info() != null && commonGameInfoBean.getJp_info().getLink_type().intValue() != 1) {
                    IntentUtil.getInstance().intentActivity(this.f29137b, commonGameInfoBean.getIntentDataBean());
                } else {
                    d0(commonGameInfoBean);
                }
            }
        }
    }

    private void i0() {
    }

    private void j0(DownloadTask downloadTask) {
        for (CommonGameInfoBean commonGameInfoBean : this.f29146k) {
            if (commonGameInfoBean.getG_info() != null && (TextUtils.equals(commonGameInfoBean.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(commonGameInfoBean.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                commonGameInfoBean.setDownloadTask(null);
            }
        }
        i0();
        o0(downloadTask);
    }

    private void k0(DownloadTask downloadTask) {
        for (CommonGameInfoBean commonGameInfoBean : this.f29146k) {
            if (commonGameInfoBean.getG_info() != null && (TextUtils.equals(commonGameInfoBean.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(commonGameInfoBean.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                commonGameInfoBean.setDownloadTask(downloadTask);
            }
        }
        i0();
        o0(downloadTask);
    }

    private void l0(DownloadTask downloadTask) {
        for (CommonGameInfoBean commonGameInfoBean : this.f29146k) {
            if (commonGameInfoBean.getG_info() != null && (TextUtils.equals(commonGameInfoBean.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(commonGameInfoBean.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                commonGameInfoBean.setDownloadTask(downloadTask);
            }
        }
        i0();
        o0(downloadTask);
    }

    private void m0(DownloadTask downloadTask) {
        for (CommonGameInfoBean commonGameInfoBean : this.f29146k) {
            if (commonGameInfoBean.getG_info() != null && (TextUtils.equals(commonGameInfoBean.getG_info().getId(), downloadTask.getCrc_link_type_val()) || TextUtils.equals(commonGameInfoBean.getG_info().getMod_id(), downloadTask.getCrc_link_type_val()))) {
                commonGameInfoBean.setDownloadTask(downloadTask);
            }
        }
        i0();
        o0(downloadTask);
    }

    /* JADX WARN: Removed duplicated region for block: B:206:0x0929 A[Catch: Exception -> 0x0b76, TryCatch #3 {Exception -> 0x0b76, blocks: (B:156:0x0796, B:158:0x07b0, B:160:0x07b4, B:162:0x07ba, B:164:0x07cc, B:166:0x07d2, B:168:0x07e4, B:170:0x07ea, B:172:0x0805, B:174:0x080e, B:175:0x082f, B:177:0x0835, B:180:0x0840, B:182:0x084a, B:184:0x0856, B:186:0x0862, B:188:0x086e, B:190:0x087a, B:192:0x0886, B:194:0x0892, B:196:0x089e, B:198:0x08a4, B:200:0x08ae, B:203:0x08c6, B:204:0x08e2, B:206:0x0929, B:208:0x0933, B:210:0x0945, B:212:0x0953, B:214:0x096d, B:216:0x097b, B:217:0x099e, B:218:0x09c4, B:219:0x09fe, B:220:0x0a38, B:236:0x0a55, B:238:0x0a5a, B:239:0x0a64, B:240:0x0a6e, B:241:0x0a93, B:242:0x0a9d, B:243:0x0ac0, B:244:0x0ae5, B:245:0x0b09, B:246:0x0b2d, B:247:0x0b52, B:173:0x080a), top: B:259:0x0796 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0a38 A[Catch: Exception -> 0x0b76, TryCatch #3 {Exception -> 0x0b76, blocks: (B:156:0x0796, B:158:0x07b0, B:160:0x07b4, B:162:0x07ba, B:164:0x07cc, B:166:0x07d2, B:168:0x07e4, B:170:0x07ea, B:172:0x0805, B:174:0x080e, B:175:0x082f, B:177:0x0835, B:180:0x0840, B:182:0x084a, B:184:0x0856, B:186:0x0862, B:188:0x086e, B:190:0x087a, B:192:0x0886, B:194:0x0892, B:196:0x089e, B:198:0x08a4, B:200:0x08ae, B:203:0x08c6, B:204:0x08e2, B:206:0x0929, B:208:0x0933, B:210:0x0945, B:212:0x0953, B:214:0x096d, B:216:0x097b, B:217:0x099e, B:218:0x09c4, B:219:0x09fe, B:220:0x0a38, B:236:0x0a55, B:238:0x0a5a, B:239:0x0a64, B:240:0x0a6e, B:241:0x0a93, B:242:0x0a9d, B:243:0x0ac0, B:244:0x0ae5, B:245:0x0b09, B:246:0x0b2d, B:247:0x0b52, B:173:0x080a), top: B:259:0x0796 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x027d A[Catch: Exception -> 0x078f, TryCatch #1 {Exception -> 0x078f, blocks: (B:41:0x00c6, B:44:0x00da, B:46:0x00e4, B:48:0x00e8, B:50:0x00ee, B:52:0x0100, B:54:0x0106, B:56:0x0118, B:58:0x0123, B:60:0x013e, B:62:0x0147, B:63:0x0167, B:65:0x016d, B:68:0x0177, B:70:0x0181, B:72:0x018d, B:74:0x0199, B:76:0x01a5, B:78:0x01b1, B:80:0x01bd, B:82:0x01c9, B:84:0x01d5, B:86:0x01db, B:88:0x01e5, B:91:0x01fc, B:93:0x021c, B:95:0x027d, B:97:0x029b, B:99:0x02c2, B:101:0x02d4, B:103:0x02e2, B:105:0x02fc, B:107:0x030a, B:108:0x032d, B:109:0x0353, B:110:0x038d, B:111:0x03c7, B:130:0x03ee, B:131:0x0445, B:132:0x049f, B:133:0x04e2, B:134:0x0543, B:138:0x0594, B:148:0x0625, B:147:0x0622, B:149:0x063d, B:150:0x06d0, B:151:0x0713, B:152:0x0750, B:61:0x0143, B:139:0x05d2, B:141:0x05dc, B:143:0x0619, B:142:0x05fb), top: B:255:0x00c6, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void o0(com.github.snowdream.android.app.downloader.DownloadTask r19) {
        /*
            Method dump skipped, instructions count: 2972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.CollectionModuleSevenFragment.o0(com.github.snowdream.android.app.downloader.DownloadTask):void");
    }

    private void q0() {
        int i4 = this.f29148m;
        if (i4 >= 0) {
            while (i4 <= Math.min(this.f29147l + 1, this.f29143h.getItemCount() - 1)) {
                CollectionSevenListBean collectionSevenListBean = (CollectionSevenListBean) this.f29143h.getItem(i4);
                if (collectionSevenListBean != null && collectionSevenListBean.getItemType() == 3) {
                    try {
                        CommonGameInfoBean commonGameInfoBean = (CommonGameInfoBean) collectionSevenListBean.getItem();
                        RecyclerView.ViewHolder childViewHolder = this.f29138c.getChildViewHolder(this.f29138c.getChildAt(i4 - this.f29148m));
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
                next.set_from(210);
                next.set_from_type(210);
                commonGameInfoBean.setDownloadTask(next);
                break;
            } else if (commonGameInfoBean.getG_info() != null && TextUtils.equals(next.getCrc_link_type_val(), commonGameInfoBean.getG_info().getId())) {
                next.set_from(210);
                next.set_from_type(210);
                commonGameInfoBean.setDownloadTask(next);
            }
        }
        commonGameInfoBean.set_from(210);
        commonGameInfoBean.set_from_type(210);
        return commonGameInfoBean;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void b0() {
        this.f29137b = getContext();
        com.join.mgps.Util.d0.a().d(this);
        this.f29144i = new com.join.android.app.component.video.g(this.f29138c, "PapaMainV3Fragment");
        this.f29138c.setLayoutManager(new LinearLayoutManager(this.f29137b));
        CollectionModuleSevenAdapter collectionModuleSevenAdapter = new CollectionModuleSevenAdapter(this.f29142g, this.f29144i);
        this.f29143h = collectionModuleSevenAdapter;
        this.f29138c.setAdapter(collectionModuleSevenAdapter);
        this.f29143h.setOnItemClickListener(new BaseQuickAdapter.j() { // from class: com.join.mgps.activity.g
            @Override // com.join.mgps.base.BaseQuickAdapter.j
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                CollectionModuleSevenFragment.this.g0(baseQuickAdapter, view, i4);
            }
        });
        this.f29143h.setOnItemChildClickListener(new BaseQuickAdapter.h() { // from class: com.join.mgps.activity.f
            @Override // com.join.mgps.base.BaseQuickAdapter.h
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i4) {
                CollectionModuleSevenFragment.this.h0(baseQuickAdapter, view, i4);
            }
        });
        this.f29138c.addOnScrollListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread(delay = 500)
    public void c0() {
        com.join.android.app.component.video.g gVar = this.f29144i;
        if (gVar != null) {
            gVar.g(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e0() {
        if (com.join.android.app.common.utils.j.j(this.f29137b)) {
            try {
                showLoding();
                if (TextUtils.isEmpty(this.f29141f)) {
                    f0();
                }
                if (TextUtils.isEmpty(this.f29141f)) {
                    showMessage("专区id不存在");
                    showLodingFailed();
                    return;
                }
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this.f29137b);
                CollectionModuleSevenArgs collectionModuleSevenArgs = new CollectionModuleSevenArgs();
                collectionModuleSevenArgs.setTemplateId(this.f29141f);
                requestModel.setArgs(collectionModuleSevenArgs);
                ResponseModel<CollectionModuleSevenBean> body = com.join.mgps.rpc.impl.i.D0().B0().o0(requestModel.makeSign()).execute().body();
                if (body != null && body.getCode() == 200 && body.getData() != null) {
                    p0(body.getData());
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
        showMessage("当前网络不可用");
        showLodingFailed();
    }

    @Override // com.join.mgps.fragment.BaseFragment
    protected void lazyLoad() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n0(String str) {
        this.f29141f = str;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.join.mgps.Util.d0.a().e(this);
        super.onDestroy();
        com.join.android.app.component.video.g gVar = this.f29144i;
        if (gVar != null) {
            gVar.t();
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        DownloadTask a5 = nVar.a();
        int c5 = nVar.c();
        if (c5 == 2) {
            r0(a5, 1);
        } else if (c5 != 3) {
            if (c5 != 5) {
                if (c5 == 6) {
                    r0(a5, 6);
                } else if (c5 == 7) {
                    r0(a5, 3);
                } else if (c5 == 8) {
                    Map<String, DownloadTask> map = this.f29145j;
                    if (map != null && !map.isEmpty()) {
                        q0();
                    }
                } else if (c5 != 48) {
                    switch (c5) {
                        case 10:
                            r0(a5, 7);
                            break;
                        case 12:
                            r0(a5, 8);
                            break;
                        case 13:
                            r0(a5, 9);
                            break;
                    }
                }
            }
            r0(a5, 5);
        } else {
            r0(a5, 2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("receiveStart: ");
        sb.append(nVar.c());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.join.android.app.component.video.g gVar = this.f29144i;
        if (gVar != null) {
            gVar.u();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f29142g.isEmpty()) {
            e0();
        }
        com.join.android.app.component.video.g gVar = this.f29144i;
        if (gVar != null) {
            gVar.A();
        }
        List<DownloadTask> d5 = p1.f.K().d();
        if (d5 == null || d5.size() <= 0) {
            return;
        }
        for (DownloadTask downloadTask : d5) {
            this.f29145j.put(downloadTask.getCrc_link_type_val(), downloadTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void p0(CollectionModuleSevenBean collectionModuleSevenBean) {
        showMain();
        if (collectionModuleSevenBean != null && collectionModuleSevenBean.getTemplate_items() != null) {
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
                        this.f29142g.add(collectionSevenListBean);
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
                            this.f29142g.add(new CollectionSevenListBean(2, s0(game_info)));
                            this.f29146k.add(model_val.getGame_info());
                        }
                    } else if (model_type == 2) {
                        if (model_val != null && model_val.getCollection_list() != null) {
                            List<CommonGameInfoBean> collection_list = model_val.getCollection_list();
                            for (CommonGameInfoBean commonGameInfoBean : collection_list) {
                                s0(commonGameInfoBean);
                            }
                            this.f29142g.add(new CollectionSevenListBean(4, collection_list));
                            this.f29146k.addAll(model_val.getCollection_list());
                        }
                        if (model_val != null && model_val.getGame_list() != null) {
                            for (CommonGameInfoBean commonGameInfoBean2 : model_val.getGame_list()) {
                                this.f29142g.add(new CollectionSevenListBean(3, s0(commonGameInfoBean2)));
                                this.f29146k.add(commonGameInfoBean2);
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
                            this.f29142g.add(new CollectionSevenListBean(2, s0(game_big)));
                            this.f29146k.add(model_val.getGame_big());
                        }
                        if (model_val != null && model_val.getGame_list() != null) {
                            for (CommonGameInfoBean commonGameInfoBean3 : model_val.getGame_list()) {
                                this.f29142g.add(new CollectionSevenListBean(3, s0(commonGameInfoBean3)));
                                this.f29146k.add(commonGameInfoBean3);
                            }
                        }
                    } else if (model_type == 4) {
                        if (model_val != null && model_val.getGame_big_list() != null) {
                            for (CommonGameInfoBean commonGameInfoBean4 : model_val.getGame_big_list()) {
                                this.f29142g.add(new CollectionSevenListBean(2, s0(commonGameInfoBean4)));
                                this.f29146k.add(commonGameInfoBean4);
                            }
                        }
                    } else if (model_type == 5) {
                        if (model_val != null && model_val.getGame_list() != null) {
                            for (CommonGameInfoBean commonGameInfoBean5 : model_val.getGame_list()) {
                                this.f29142g.add(new CollectionSevenListBean(3, s0(commonGameInfoBean5)));
                                this.f29146k.add(commonGameInfoBean5);
                            }
                        }
                    } else if (model_type == 6) {
                        if (model_val != null && model_val.getCollection_list() != null) {
                            List<CommonGameInfoBean> collection_list2 = model_val.getCollection_list();
                            for (CommonGameInfoBean commonGameInfoBean6 : collection_list2) {
                                s0(commonGameInfoBean6);
                            }
                            this.f29142g.add(new CollectionSevenListBean(4, collection_list2));
                            this.f29146k.addAll(model_val.getCollection_list());
                        }
                    } else if (model_type == 7 && model_val != null && model_val.getAdvert_list() != null) {
                        this.f29142g.add(new CollectionSevenListBean(5, model_val.getAdvert_list()));
                    }
                }
            }
            CollectionModuleSevenAdapter collectionModuleSevenAdapter = this.f29143h;
            if (collectionModuleSevenAdapter != null) {
                collectionModuleSevenAdapter.replaceData(this.f29142g);
            }
            c0();
            expDiscountGame();
            return;
        }
        showLodingFailed();
    }

    void r0(DownloadTask downloadTask, int i4) {
        if (downloadTask != null) {
            switch (i4) {
                case 1:
                case 2:
                case 7:
                case 8:
                case 9:
                    l0(downloadTask);
                    return;
                case 3:
                    j0(downloadTask);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    m0(downloadTask);
                    return;
                case 6:
                    k0(downloadTask);
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f29137b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f29139d;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f29140e;
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
        LinearLayout linearLayout = this.f29140e;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f29139d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMain() {
        LinearLayout linearLayout = this.f29140e;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f29139d;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this.f29137b).b(str);
    }
}
