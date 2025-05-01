package com.join.mgps.activity;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.BaseFragmentActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.fragment.PaPaBannerListFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_papa_banner_list)
/* loaded from: classes.dex */
public class PaPaBannerListActivity extends BaseFragmentActivity {

    /* renamed from: n  reason: collision with root package name */
    public static final int f36335n = 1;
    @Extra

    /* renamed from: b  reason: collision with root package name */
    int f36336b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    String f36337c;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    boolean f36338d;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    String f36339e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    boolean f36340f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    TextView f36341g;
    @ViewById(R.id.title_normal_search_img)

    /* renamed from: h  reason: collision with root package name */
    ImageView f36342h;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: i  reason: collision with root package name */
    CustomerDownloadView f36343i;

    /* renamed from: j  reason: collision with root package name */
    Map<String, DownloadTask> f36344j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    Map<String, DownloadTask> f36345k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    private FragmentManager f36346l;

    /* renamed from: m  reason: collision with root package name */
    private PaPaBannerListFragment f36347m;

    private void hideFragments(FragmentTransaction fragmentTransaction) {
        PaPaBannerListFragment paPaBannerListFragment = this.f36347m;
        if (paPaBannerListFragment != null) {
            fragmentTransaction.hide(paPaBannerListFragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f36346l = getSupportFragmentManager();
        this.f36341g.setText(this.f36337c);
        if (this.f36338d) {
            getDownloadTaskInfo();
            org.greenrobot.eventbus.c.f().t(this);
            this.f36342h.setVisibility(0);
            this.f36343i.setVisibility(0);
        }
        f0();
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36344j
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36344j
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36345k
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36345k
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36344j
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36344j
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36345k
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36345k
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36345k
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36345k
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36344j
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36344j
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36345k
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36345k
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36345k
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36345k
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36344j
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36344j
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36345k
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36345k
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PaPaBannerListActivity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    void f0() {
        FragmentTransaction beginTransaction = this.f36346l.beginTransaction();
        hideFragments(beginTransaction);
        PaPaBannerListFragment paPaBannerListFragment = this.f36347m;
        if (paPaBannerListFragment == null) {
            if (this.f36336b == 1) {
                HashMap hashMap = new HashMap();
                hashMap.put("title", this.f36337c);
                hashMap.put("isSingle", this.f36340f ? "1" : "0");
                hashMap.put("factory_id", this.f36339e);
                hashMap.put("_from", "121");
                this.f36347m = PaPaBannerListFragment.m0(1, hashMap);
            }
            beginTransaction.add(R.id.container, this.f36347m);
        } else {
            beginTransaction.show(paPaBannerListFragment);
        }
        beginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f36344j.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f36345k.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h0() {
        SearchHintActivity_.G1(this).start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f36338d) {
            org.greenrobot.eventbus.c.f().y(this);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        try {
            changeDownloadTaskNumber(nVar.a(), nVar.c());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        try {
            int size = this.f36344j.size();
            int size2 = this.f36345k.size();
            this.f36343i.setDownloadGameNum(size);
            if (size2 > 0) {
                this.f36343i.d();
            } else {
                this.f36343i.g();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
