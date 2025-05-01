package com.join.mgps.activity.screenshot;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.BaseAppCompatActivity;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.manager.b;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.common.utils.n;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.dto.ResultMainBean;
import com.join.mgps.rpc.impl.d;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import net.lingala.zip4j.util.e;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.screenshort_bigimag_layout)
/* loaded from: classes4.dex */
public class ScreenShortBigImagActivity extends BaseAppCompatActivity {
    CarImagesBrowseAdapter adapter;
    @ViewById
    ImageView back;
    @ViewById
    LinearLayout bottomLayout;
    Context context;
    @Extra
    String gameId;
    List<ScreenShortListItemBean> listItemBeans;
    @ViewById
    TextView message;
    @ViewById
    TextView nameAndDate;
    @Extra
    int pn;
    @Extra
    int position;
    @ViewById
    TextView positionShow;
    private b tintManager;
    @Extra
    int typeId;
    @ViewById
    ViewPager viewPager;

    /* loaded from: classes4.dex */
    public class CarImagesBrowseAdapter extends PagerAdapter {
        int heigjt;
        private int mChildCount;
        private Context mContext;
        private LinkedList<View> mViewCache = new LinkedList<>();
        int with;

        public CarImagesBrowseAdapter(Context context) {
            this.heigjt = n.n(ScreenShortBigImagActivity.this.context).k(ScreenShortBigImagActivity.this);
            this.with = n.n(ScreenShortBigImagActivity.this.context).B(ScreenShortBigImagActivity.this);
            this.mContext = context;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            View view = (View) obj;
            viewGroup.removeView(view);
            this.mViewCache.add(view);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return ScreenShortBigImagActivity.this.listItemBeans.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            int i4 = this.mChildCount;
            if (i4 > 0) {
                this.mChildCount = i4 - 1;
                return -2;
            }
            return super.getItemPosition(obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            SimpleDraweeView simpleDraweeView;
            if (this.mViewCache.size() == 0) {
                SimpleDraweeView simpleDraweeView2 = new SimpleDraweeView(this.mContext);
                simpleDraweeView2.setBackgroundColor(-15460322);
                simpleDraweeView = simpleDraweeView2;
            } else {
                simpleDraweeView = this.mViewCache.removeFirst();
            }
            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) simpleDraweeView;
            viewGroup.setFitsSystemWindows(true);
            viewGroup.setClipToPadding(true);
            simpleDraweeView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
            MyImageLoader.i(simpleDraweeView3, ScreenShortBigImagActivity.this.listItemBeans.get(i4).getPicPath(), r.c.f11296c);
            viewGroup.addView(simpleDraweeView, -1, -1);
            return simpleDraweeView;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void notifyDataSetChanged() {
            this.mChildCount = getCount();
            super.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().addFlags(TTAdConstant.KEY_CLICK_AREA);
        }
        Bundle bundleExtra = getIntent().getBundleExtra("datas");
        if (bundleExtra != null) {
            this.listItemBeans = (List) bundleExtra.getSerializable("datas");
        }
        if (this.listItemBeans == null) {
            this.listItemBeans = new ArrayList();
        }
        try {
            this.message.setText(this.listItemBeans.get(this.position).getDescribe());
            TextView textView = this.positionShow;
            textView.setText((this.position + 1) + e.F0 + this.listItemBeans.size());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.join.mgps.activity.screenshot.ScreenShortBigImagActivity.1
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i4) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i4, float f5, int i5) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i4) {
                if (i4 + 4 > ScreenShortBigImagActivity.this.listItemBeans.size()) {
                    ScreenShortBigImagActivity screenShortBigImagActivity = ScreenShortBigImagActivity.this;
                    screenShortBigImagActivity.loadListData(screenShortBigImagActivity.pn);
                }
                TextView textView2 = ScreenShortBigImagActivity.this.positionShow;
                textView2.setText((i4 + 1) + e.F0 + ScreenShortBigImagActivity.this.listItemBeans.size());
                ScreenShortBigImagActivity screenShortBigImagActivity2 = ScreenShortBigImagActivity.this;
                screenShortBigImagActivity2.message.setText(screenShortBigImagActivity2.listItemBeans.get(i4).getDescribe());
                TextView textView3 = ScreenShortBigImagActivity.this.nameAndDate;
                textView3.setText(ScreenShortBigImagActivity.this.listItemBeans.get(i4).getNickname() + "\u3000\u3000" + ScreenShortBigImagActivity.this.listItemBeans.get(i4).getAddTime());
            }
        });
        CarImagesBrowseAdapter carImagesBrowseAdapter = new CarImagesBrowseAdapter(this);
        this.adapter = carImagesBrowseAdapter;
        this.viewPager.setAdapter(carImagesBrowseAdapter);
        this.viewPager.setCurrentItem(this.position);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void loadListData(int i4) {
        List<ScreenShortListItemBean> data;
        try {
            ResultMainBean<List<ScreenShortListItemBean>> w4 = d.P1().w(RequestBeanUtil.getInstance(this.context).getScreenShortListRequest(this.gameId, i4, this.typeId));
            if (w4 == null || w4.getFlag() != 1 || (data = w4.getMessages().getData()) == null || data.size() <= 0) {
                return;
            }
            updateUi(data);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void updateUi(List<ScreenShortListItemBean> list) {
        if (list != null && list.size() > 0) {
            this.pn++;
        }
        this.listItemBeans.addAll(list);
        this.adapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void viewPager() {
        if (this.positionShow.getVisibility() == 0) {
            this.positionShow.setVisibility(8);
            this.bottomLayout.setVisibility(8);
            this.back.setVisibility(8);
            return;
        }
        this.positionShow.setVisibility(0);
        this.bottomLayout.setVisibility(0);
        this.back.setVisibility(0);
    }
}
