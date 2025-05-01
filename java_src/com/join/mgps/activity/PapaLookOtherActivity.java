package com.join.mgps.activity;

import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.BaseFragmentActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.dto.CollectionDataBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.fragment.CollectionModuleFourFragment_;
import com.join.mgps.fragment.CollectionModuleTwoFragment_;
import com.papa.sim.statistic.Where;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.papeverday_new_activity_layout)
/* loaded from: classes.dex */
public class PapaLookOtherActivity extends BaseFragmentActivity {

    /* renamed from: u  reason: collision with root package name */
    private static final String f36437u = "PapaLookOtherActivity";

    /* renamed from: b  reason: collision with root package name */
    private FragmentManager f36438b;

    /* renamed from: d  reason: collision with root package name */
    com.join.mgps.rpc.e f36440d;
    @StringRes(resName = "net_excption")

    /* renamed from: e  reason: collision with root package name */
    String f36441e;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: f  reason: collision with root package name */
    String f36442f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f36443g;

    /* renamed from: h  reason: collision with root package name */
    private int f36444h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    LinearLayout f36445i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f36446j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    FrameLayout f36447k;
    @ViewById(R.id.title_normal_search_img)

    /* renamed from: l  reason: collision with root package name */
    ImageView f36448l;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: m  reason: collision with root package name */
    CustomerDownloadView f36449m;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    RelativeLayout f36453q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    ImageView f36454r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    TextView f36455s;

    /* renamed from: t  reason: collision with root package name */
    private String f36456t;

    /* renamed from: c  reason: collision with root package name */
    private int f36439c = 1;

    /* renamed from: n  reason: collision with root package name */
    private boolean f36450n = false;

    /* renamed from: o  reason: collision with root package name */
    Map<String, DownloadTask> f36451o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    Map<String, DownloadTask> f36452p = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f36440d = com.join.mgps.rpc.impl.d.P1();
        this.f36443g.setText("大家都在玩");
        g0();
        showLoding();
        getDownloadTaskInfo();
        org.greenrobot.eventbus.c.f().t(this);
        this.f36448l.setVisibility(0);
        this.f36449m.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
        if (r4 != 11) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask r3, int r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r3.getCrc_link_type_val()
            r1 = 2
            if (r4 == r1) goto L8d
            r1 = 3
            if (r4 == r1) goto L7f
            r1 = 5
            if (r4 == r1) goto L64
            r1 = 6
            if (r4 == r1) goto L56
            r1 = 7
            if (r4 == r1) goto L3b
            r1 = 10
            if (r4 == r1) goto L20
            r3 = 11
            if (r4 == r3) goto L71
            goto La7
        L20:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36451o
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36451o
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36452p
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36452p
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36451o
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36451o
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36452p
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36452p
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36452p
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36452p
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36451o
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36451o
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36452p
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36452p
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36452p
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36452p
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36451o
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36451o
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36452p
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36452p
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PapaLookOtherActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void f0() {
        IntentUtil.getInstance().goCollectionCommentActivity(this, this.f36456t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void g0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                ResultMainBean<List<CollectionDataBean>> s4 = this.f36440d.s(RequestBeanUtil.getInstance(this).getLookOther(this.f36439c, new ExtBean("home", "5-0")));
                if (s4 != null && s4.getFlag() == 1) {
                    List<CollectionDataBean> data = s4.getMessages().getData();
                    if (data.size() > 0) {
                        CollectionDataBean collectionDataBean = data.get(0);
                        if (collectionDataBean.getTpl_type() != null) {
                            j0(Integer.parseInt(collectionDataBean.getTpl_type()), collectionDataBean);
                        }
                        if (collectionDataBean.getInfo() != null && collectionDataBean.getInfo().size() > 0 && collectionDataBean.getInfo().get(0).getMain() != null) {
                            String crc_collection_id = collectionDataBean.getInfo().get(0).getMain().getCrc_collection_id();
                            this.f36456t = crc_collection_id;
                            try {
                                if (com.join.mgps.Util.g2.i(crc_collection_id)) {
                                    l0(collectionDataBean.getComment_switch(), collectionDataBean.getComment_count());
                                }
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                    k0();
                    return;
                }
                showLodingFailed();
                return;
            } catch (Exception e6) {
                e6.printStackTrace();
                showLodingFailed();
                return;
            }
        }
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f36451o.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f36452p.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    boolean h0() {
        if (Build.VERSION.SDK_INT >= 17) {
            return isDestroyed();
        }
        return this.f36450n;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        com.join.android.app.common.manager.a.h().j(this, this.f36441e, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0(int i4, CollectionDataBean collectionDataBean) {
        this.f36438b = getSupportFragmentManager();
        Bundle bundle = new Bundle();
        if (collectionDataBean.getInfo() == null || collectionDataBean.getInfo().size() == 0) {
            return;
        }
        bundle.putString("collection_id", collectionDataBean.getInfo().get(0).getMain().getCrc_collection_id());
        FragmentTransaction beginTransaction = this.f36438b.beginTransaction();
        if (i4 == 2) {
            CollectionModuleTwoFragment_ collectionModuleTwoFragment_ = new CollectionModuleTwoFragment_();
            collectionModuleTwoFragment_.l0(collectionDataBean);
            collectionModuleTwoFragment_.setArguments(bundle);
            beginTransaction.add(R.id.fragment, collectionModuleTwoFragment_);
        } else if (i4 == 4) {
            CollectionModuleFourFragment_ collectionModuleFourFragment_ = new CollectionModuleFourFragment_();
            collectionModuleFourFragment_.k0(collectionDataBean);
            collectionModuleFourFragment_.setArguments(bundle);
            beginTransaction.add((int) R.id.fragment, collectionModuleFourFragment_);
        }
        if (h0()) {
            return;
        }
        beginTransaction.commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        this.f36446j.setVisibility(8);
        this.f36445i.setVisibility(8);
        this.f36447k.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(int i4, int i5) {
        if (i4 == 1) {
            this.f36453q.setVisibility(0);
            this.f36454r.setVisibility(0);
            if (i5 > 0) {
                this.f36455s.setVisibility(0);
            }
            TextView textView = this.f36455s;
            textView.setText(i5 + "");
            return;
        }
        this.f36453q.setVisibility(8);
        this.f36454r.setVisibility(8);
        this.f36455s.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void m0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        SearchHintActivity_.G1(this).start();
        com.papa.sim.statistic.p.l(this).u2(Where.lookOther, AccountUtil_.getInstance_(this).getUid());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f36450n = true;
        org.greenrobot.eventbus.c.f().y(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        changeDownloadTaskNumber(nVar.a(), nVar.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f36439c = 1;
        showLoding();
        if (this.f36444h == 0) {
            return;
        }
        this.f36443g.setText("大家都在玩");
        g0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void serverConnectionException() {
        com.join.android.app.common.manager.a.h().j(this, this.f36442f, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f36445i.setVisibility(0);
        this.f36446j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        this.f36446j.setVisibility(0);
        this.f36445i.setVisibility(8);
        this.f36447k.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int size = this.f36451o.size();
        int size2 = this.f36452p.size();
        this.f36449m.setDownloadGameNum(size);
        StringBuilder sb = new StringBuilder();
        sb.append("updateDownloadView: ");
        sb.append(size2);
        sb.append("::::已经进入下载队列中的数量:::");
        sb.append(size);
        if (size2 > 0) {
            this.f36449m.d();
        } else {
            this.f36449m.g();
        }
    }
}
