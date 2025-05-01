package com.join.mgps.activity;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.BaseFragmentActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.MViewpagerV4;
import com.join.mgps.customview.NavigationAdapter;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.CollectionDataBeanInfo;
import com.join.mgps.dto.CollectionModuleBean;
import com.join.mgps.dto.CollectionModuleDataBean;
import com.join.mgps.dto.CollectionModuleMessageBean;
import com.join.mgps.dto.CommonRequestBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.fragment.CollectionThreeSubFragment_;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.collection_three_fragment_layout)
/* loaded from: classes4.dex */
public class CollectionModuleThreeActivity extends BaseFragmentActivity {

    /* renamed from: b  reason: collision with root package name */
    private Context f29226b;

    /* renamed from: c  reason: collision with root package name */
    private FragmentManager f29227c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<Fragment> f29228d;

    /* renamed from: e  reason: collision with root package name */
    private NavigationAdapter f29229e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    MViewpagerV4 f29230f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f29231g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f29232h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    RelativeLayout f29233i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    ImageView f29234j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    ImageView f29235k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f29236l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f29237m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f29238n;

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.rpc.e f29239o;

    /* renamed from: p  reason: collision with root package name */
    private int f29240p = 1;

    /* renamed from: q  reason: collision with root package name */
    private int f29241q;
    @Extra

    /* renamed from: r  reason: collision with root package name */
    String f29242r;
    @Extra

    /* renamed from: s  reason: collision with root package name */
    ExtBean f29243s;

    /* renamed from: t  reason: collision with root package name */
    private List<String> f29244t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements ViewPager.OnPageChangeListener {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i4) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i4, float f5, int i5) {
            CollectionModuleThreeActivity collectionModuleThreeActivity = CollectionModuleThreeActivity.this;
            collectionModuleThreeActivity.f29236l.setText((CharSequence) collectionModuleThreeActivity.f29244t.get(i4));
            TextView textView = CollectionModuleThreeActivity.this.f29237m;
            textView.setText((i4 + 1) + net.lingala.zip4j.util.e.F0 + CollectionModuleThreeActivity.this.f29241q);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i4) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f29239o = com.join.mgps.rpc.impl.d.P1();
        try {
            this.f29226b = this;
            this.f29227c = getSupportFragmentManager();
            this.f29244t = new ArrayList();
            ArrayList<Fragment> arrayList = new ArrayList<>();
            this.f29228d = arrayList;
            this.f29229e = new NavigationAdapter(this.f29227c, arrayList, this.f29244t);
            showLoding();
            String str = this.f29242r;
            if (str != null) {
                h0(str);
            } else {
                showLodingFailed();
            }
            this.f29230f.setIntercept(false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0(String str) {
        if (com.join.android.app.common.utils.j.j(this.f29226b)) {
            try {
                CollectionModuleBean c12 = this.f29239o.c1(i0(str, this.f29240p));
                if (c12 != null) {
                    CollectionModuleMessageBean messages = c12.getMessages();
                    if (messages != null) {
                        List<CollectionModuleDataBean> data = messages.getData();
                        if (data != null && data.size() > 0 && data.get(0) != null && data.get(0).getInfo() != null && data.get(0).getInfo().size() > 0 && data.get(0).getInfo().get(0) != null && data.get(0).getInfo().get(0).size() > 0) {
                            this.f29241q = data.get(0).getInfo().get(0).size();
                            k0(c12.getMessages().getData().get(0).getInfo().get(0));
                        } else {
                            showLodingFailed();
                        }
                    } else {
                        showLodingFailed();
                    }
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
        showLodingFailed();
    }

    public CommonRequestBean i0(String str, int i4) {
        return RequestBeanUtil.getInstance(this.f29226b).getCollectionRequestBean(str, i4, 100, "", "", this.f29243s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(List<CollectionDataBeanInfo> list) {
        this.f29230f.setVisibility(0);
        this.f29233i.setVisibility(0);
        this.f29232h.setVisibility(8);
        this.f29231g.setVisibility(8);
        if (this.f29241q > 0) {
            for (int i4 = 0; i4 < this.f29241q; i4++) {
                CollectionDataBeanInfo collectionDataBeanInfo = list.get(i4);
                this.f29244t.add(collectionDataBeanInfo.getMain().getCollection_title());
                CollectionThreeSubFragment_ collectionThreeSubFragment_ = new CollectionThreeSubFragment_();
                collectionThreeSubFragment_.X(collectionDataBeanInfo);
                try {
                    for (CollectionBeanSub collectionBeanSub : collectionDataBeanInfo.getSub()) {
                        ExtBean extBean = this.f29243s;
                        if (extBean != null && extBean.isKeepOrginFrom() && !TextUtils.isEmpty(this.f29243s.getOrginFrom())) {
                            try {
                                collectionBeanSub.set_from(Integer.parseInt(this.f29243s.getOrginFrom()));
                                collectionBeanSub.set_from_type(Integer.parseInt(this.f29243s.getOrginFrom()));
                            } catch (Exception unused) {
                            }
                        } else {
                            ExtBean extBean2 = this.f29243s;
                            if (extBean2 != null && extBean2.get_from_type() == 134) {
                                collectionBeanSub.set_from(13401);
                                collectionBeanSub.set_from_type(13401);
                            } else {
                                collectionBeanSub.set_from(111);
                                collectionBeanSub.set_from_type(121);
                            }
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                this.f29228d.add(collectionThreeSubFragment_);
            }
            this.f29229e.d(this.f29228d, this.f29244t);
            this.f29229e.notifyDataSetChanged();
            this.f29230f.setAdapter(this.f29229e);
            this.f29230f.setOffscreenPageLimit(4);
            this.f29230f.setOnPageChangeListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        this.f29240p = 1;
        showLoding();
        h0(this.f29242r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f29226b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        this.f29230f.setVisibility(8);
        this.f29233i.setVisibility(8);
        this.f29231g.setVisibility(0);
        this.f29232h.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        this.f29230f.setVisibility(8);
        this.f29233i.setVisibility(8);
        this.f29232h.setVisibility(0);
        this.f29231g.setVisibility(8);
    }
}
