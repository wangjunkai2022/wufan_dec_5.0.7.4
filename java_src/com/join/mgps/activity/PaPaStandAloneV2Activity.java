package com.join.mgps.activity;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.BaseFragmentActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.CustomerDownloadView;
import com.join.mgps.customview.InterceptEventViewPager;
import com.join.mgps.customview.TabPageIndicator;
import com.join.mgps.fragment.PaPaStandAloneV2Fragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
@EActivity(R.layout.activity_papa_standalone_v2)
/* loaded from: classes.dex */
public class PaPaStandAloneV2Activity extends BaseFragmentActivity {

    /* renamed from: j  reason: collision with root package name */
    static String[] f36371j = {"推荐", "最新", "单机榜"};
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f36372b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    InterceptEventViewPager f36373c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TabPageIndicator f36374d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    ImageView f36375e;
    @ViewById(R.id.title_normal_download_cdv)

    /* renamed from: f  reason: collision with root package name */
    CustomerDownloadView f36376f;

    /* renamed from: g  reason: collision with root package name */
    private Fragment[] f36377g = new Fragment[f36371j.length];

    /* renamed from: h  reason: collision with root package name */
    Map<String, DownloadTask> f36378h = new HashMap();

    /* renamed from: i  reason: collision with root package name */
    Map<String, DownloadTask> f36379i = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a extends FragmentPagerAdapter {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return PaPaStandAloneV2Activity.f36371j.length;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i4) {
            return PaPaStandAloneV2Activity.this.h0(i4);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i4) {
            return PaPaStandAloneV2Activity.f36371j[i4];
        }
    }

    private int g0(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                return i4 != 2 ? -1 : 3;
            }
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Fragment h0(int i4) {
        Fragment fragment = this.f36377g[i4];
        if (fragment != null) {
            return fragment;
        }
        int g02 = g0(i4);
        if (i4 == 0 || i4 == 1) {
            PaPaStandAloneV2Fragment h02 = PaPaStandAloneV2Fragment.h0(g02);
            this.f36377g[i4] = h02;
            return h02;
        } else if (i4 != 2) {
            return null;
        } else {
            ClassifyListFragment l02 = ClassifyListFragment.l0(1001, "1", 1);
            this.f36377g[i4] = l02;
            return l02;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f36375e.setVisibility(0);
        this.f36376f.setVisibility(0);
        this.f36372b.setText("单机游戏");
        org.greenrobot.eventbus.c.f().t(this);
        a aVar = new a(getSupportFragmentManager());
        this.f36373c.setIsAsParentViewPager(true);
        this.f36373c.setAdapter(aVar);
        this.f36373c.setOffscreenPageLimit(3);
        this.f36373c.setCurrentItem(0);
        this.f36374d.setViewPager(this.f36373c);
        getDownloadTaskInfo();
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
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36379i
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L2d
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36379i
            r4.put(r0, r3)
        L2d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36378h
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36378h
            r4.put(r0, r3)
            goto La7
        L3b:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36379i
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L48
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36379i
            r3.remove(r0)
        L48:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36378h
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36378h
            r3.remove(r0)
            goto La7
        L56:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36378h
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36378h
            r3.remove(r0)
            goto La7
        L64:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36379i
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto L71
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36379i
            r3.remove(r0)
        L71:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36378h
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36378h
            r3.remove(r0)
            goto La7
        L7f:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36378h
            boolean r3 = r3.containsKey(r0)
            if (r3 == 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r3 = r2.f36378h
            r3.remove(r0)
            goto La7
        L8d:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36379i
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto L9a
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36379i
            r4.put(r0, r3)
        L9a:
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36378h
            boolean r4 = r4.containsKey(r0)
            if (r4 != 0) goto La7
            java.util.Map<java.lang.String, com.github.snowdream.android.app.downloader.DownloadTask> r4 = r2.f36378h
            r4.put(r0, r3)
        La7:
            r2.updateDownloadView()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.PaPaStandAloneV2Activity.changeDownloadTaskNumber(com.github.snowdream.android.app.downloader.DownloadTask, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getDownloadTaskInfo() {
        List<DownloadTask> r4 = p1.f.K().r();
        List<DownloadTask> q4 = p1.f.K().q();
        if (q4 != null && q4.size() > 0) {
            for (DownloadTask downloadTask : q4) {
                this.f36379i.put(downloadTask.getCrc_link_type_val(), downloadTask);
            }
        }
        if (r4 != null && r4.size() > 0) {
            for (DownloadTask downloadTask2 : r4) {
                this.f36378h.put(downloadTask2.getCrc_link_type_val(), downloadTask2);
            }
        }
        updateDownloadView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void i0() {
        IntentUtil.getInstance().goMyGameManagerActivity(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        SearchHintActivity_.G1(this).start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(com.join.mgps.event.n nVar) {
        changeDownloadTaskNumber(nVar.a(), nVar.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        UtilsMy.q4(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateDownloadView() {
        int size = this.f36379i.size();
        int size2 = this.f36378h.size();
        this.f36376f.setDownloadGameNum(size);
        if (size2 > 0) {
            this.f36376f.d();
        } else {
            this.f36376f.g();
        }
    }
}
