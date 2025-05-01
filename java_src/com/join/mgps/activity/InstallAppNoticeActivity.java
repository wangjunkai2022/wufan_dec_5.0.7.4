package com.join.mgps.activity;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import com.BaseActivity;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.component.photoviewer.MultiTouchViewPager;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.BootPageData;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import me.relex.circleindicator.CircleIndicator;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.install_app_notice_layout)
/* loaded from: classes4.dex */
public class InstallAppNoticeActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    SimpleDraweeView f34097b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    MultiTouchViewPager f34098c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    CircleIndicator f34099d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f34100e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    String f34101f;
    @Extra

    /* renamed from: g  reason: collision with root package name */
    String f34102g;

    /* renamed from: h  reason: collision with root package name */
    BootPageData f34103h;

    /* renamed from: i  reason: collision with root package name */
    DraweePagerAdapter f34104i;

    /* renamed from: j  reason: collision with root package name */
    DownloadTask f34105j;

    /* loaded from: classes4.dex */
    public class DraweePagerAdapter extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        List<String> f34106a;

        /* loaded from: classes4.dex */
        class a extends com.facebook.drawee.controller.b<com.facebook.imagepipeline.image.f> {
            a() {
            }

            @Override // com.facebook.drawee.controller.b, com.facebook.drawee.controller.c
            /* renamed from: b */
            public void onFinalImageSet(String str, com.facebook.imagepipeline.image.f fVar, Animatable animatable) {
                super.onFinalImageSet(str, fVar, animatable);
            }
        }

        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InstallAppNoticeActivity.this.i0();
            }
        }

        public DraweePagerAdapter() {
        }

        public List<String> b() {
            return this.f34106a;
        }

        public void c(List<String> list) {
            this.f34106a = list;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            List<String> list = this.f34106a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            Uri parse;
            String str = this.f34106a.get(i4);
            Context context = viewGroup.getContext();
            View inflate = LayoutInflater.from(context).inflate(R.layout.home_popup_ad_item, (ViewGroup) null);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) inflate.findViewById(R.id.adImage);
            simpleDraweeView.getHierarchy().H(R.drawable.main_normal_icon);
            com.facebook.drawee.backends.pipeline.e newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
            if (InstallAppNoticeActivity.this.isHomePopupAdLocalCached(str)) {
                parse = com.join.mgps.Util.l0.j(new File(com.join.mgps.Util.v.b(context), com.join.mgps.Util.h0.o(str)));
            } else {
                parse = Uri.parse(str);
            }
            newDraweeControllerBuilder.a(parse);
            newDraweeControllerBuilder.c(simpleDraweeView.getController());
            newDraweeControllerBuilder.H(new a());
            simpleDraweeView.setController(newDraweeControllerBuilder.build());
            simpleDraweeView.setClickable(true);
            try {
                viewGroup.addView(inflate, -1, -1);
                simpleDraweeView.setOnClickListener(new b());
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return inflate;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InstallAppNoticeActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0() {
        com.join.android.app.common.utils.e.l0(this).w(this, new File(this.f34105j.getGameZipPath()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        try {
            this.f34103h = (BootPageData) JsonMapper.getInstance().fromJson(com.join.mgps.Util.g2.g(this.f34101f), BootPageData.class);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f34105j = p1.f.K().F(this.f34102g);
        BootPageData bootPageData = this.f34103h;
        if (bootPageData == null || bootPageData.getGame_setup_boot() == null || com.join.mgps.Util.g2.h(this.f34103h.getGame_setup_boot().getTitle()) || this.f34103h.getGame_setup_boot().getPic().length == 0) {
            finish();
        }
        this.f34100e.setText(this.f34103h.getGame_setup_boot().getTitle() + "下载完成，请按下图操作");
        ArrayList arrayList = new ArrayList();
        for (String str : this.f34103h.getGame_setup_boot().getPic()) {
            arrayList.add(str);
        }
        DraweePagerAdapter draweePagerAdapter = new DraweePagerAdapter();
        this.f34104i = draweePagerAdapter;
        draweePagerAdapter.c(arrayList);
        this.f34098c.setAdapter(this.f34104i);
        this.f34099d.setViewPager(this.f34098c);
        try {
            this.f34097b.setOnClickListener(new a());
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public void h0(Context context, AppBeanMain appBeanMain) {
        if (appBeanMain == null) {
            return;
        }
        IntentUtil.getInstance().intentActivity(context, new IntentDateBean(appBeanMain.getLink_type(), appBeanMain.getJump_type(), appBeanMain.getLink_type_val(), appBeanMain.getCrc_link_type_val(), appBeanMain.getTpl_type(), null));
    }

    boolean isHomePopupAdLocalCached(String str) {
        return new File(com.join.mgps.Util.v.b(this), com.join.mgps.Util.h0.o(str)).exists();
    }
}
