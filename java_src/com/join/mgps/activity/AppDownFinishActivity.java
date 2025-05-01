package com.join.mgps.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.BaseAppCompatActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.enums.Dtype;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.List;
import me.relex.circleindicator.CircleIndicator;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
@EActivity(R.layout.appdown_finish_activity)
/* loaded from: classes4.dex */
public class AppDownFinishActivity extends BaseAppCompatActivity {

    /* renamed from: b  reason: collision with root package name */
    protected int f28430b;

    /* renamed from: c  reason: collision with root package name */
    protected int f28431c;

    /* renamed from: d  reason: collision with root package name */
    private CardPagerAdapter f28432d;

    /* renamed from: e  reason: collision with root package name */
    private ViewPager f28433e;

    /* renamed from: f  reason: collision with root package name */
    private CircleIndicator f28434f;
    @Extra

    /* renamed from: g  reason: collision with root package name */
    String f28435g;

    /* renamed from: i  reason: collision with root package name */
    b f28437i;

    /* renamed from: h  reason: collision with root package name */
    List<String> f28436h = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private ContentObserver f28438j = new a(new Handler());

    /* loaded from: classes4.dex */
    public class CardPagerAdapter extends PagerAdapter implements c {

        /* renamed from: b  reason: collision with root package name */
        private List<d> f28440b = new ArrayList();

        /* renamed from: a  reason: collision with root package name */
        private List<View> f28439a = new ArrayList();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f28442b;

            a(d dVar) {
                this.f28442b = dVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UtilsMy.T3(view.getContext(), this.f28442b.f28447a);
                if (this.f28442b.f28448b) {
                    com.papa.sim.statistic.p.l(view.getContext()).O1(Event.onclickSoGameStart, new Ext().setGameId(this.f28442b.f28447a.getCrc_link_type_val()));
                } else {
                    com.papa.sim.statistic.p.l(view.getContext()).O1(Event.onclickSinGameStart, new Ext().setGameId(this.f28442b.f28447a.getCrc_link_type_val()));
                }
                AppDownFinishActivity.this.finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AppDownFinishActivity.this.finish();
            }
        }

        public CardPagerAdapter() {
        }

        private void c(d dVar, View view) {
            TextView textView = (TextView) view.findViewById(R.id.info);
            TextView textView2 = (TextView) view.findViewById(R.id.title);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.icon);
            ImageView imageView = (ImageView) view.findViewById(R.id.cancle);
            if (Dtype.apk.name().equals(dVar.f28447a.getFileType())) {
                textView.setText("下载完成");
                dVar.f28448b = true;
                com.papa.sim.statistic.p.l(AppDownFinishActivity.this).O1(Event.showSoGameStart, new Ext().setGameId(dVar.f28447a.getCrc_link_type_val()));
            } else {
                com.papa.sim.statistic.p.l(AppDownFinishActivity.this).O1(Event.showSinGameStart, new Ext().setGameId(dVar.f28447a.getCrc_link_type_val()));
                dVar.f28448b = false;
                textView.setText("安装完成");
            }
            MyImageLoader.h(simpleDraweeView, dVar.f28447a.getPortraitURL());
            textView2.setText(dVar.f28447a.getShowName());
            view.findViewById(R.id.tv_ok).setOnClickListener(new a(dVar));
            imageView.setOnClickListener(new b());
        }

        @Override // com.join.mgps.activity.AppDownFinishActivity.c
        public View a(int i4) {
            return this.f28439a.get(i4);
        }

        public void b(d dVar) {
            this.f28439a.add(null);
            this.f28440b.add(dVar);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
            this.f28439a.set(i4, null);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f28440b.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_app_down_finish, viewGroup, false);
            viewGroup.addView(inflate);
            c(this.f28440b.get(i4), inflate);
            this.f28439a.set(i4, inflate);
            return inflate;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* loaded from: classes4.dex */
    class a extends ContentObserver {
        a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            if (Build.VERSION.SDK_INT < 21) {
                Settings.System.getInt(AppDownFinishActivity.this.getContentResolver(), "navigationbar_is_min", 0);
            } else {
                Settings.Global.getInt(AppDownFinishActivity.this.getContentResolver(), "navigationbar_is_min", 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b extends ContentObserver {
        b(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z4) {
            super.onChange(z4);
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        View a(int i4);

        int getCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public DownloadTask f28447a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f28448b;

        private d() {
        }

        /* synthetic */ d(AppDownFinishActivity appDownFinishActivity, a aVar) {
            this();
        }
    }

    private void registerNavigationBarObserver() {
        if (Build.VERSION.SDK_INT < 21) {
            getContentResolver().registerContentObserver(Settings.System.getUriFor("navigationbar_is_min"), true, this.f28438j);
        } else {
            getContentResolver().registerContentObserver(Settings.Global.getUriFor("navigationbar_is_min"), true, this.f28438j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterview() {
        this.f28433e = (ViewPager) findViewById(R.id.viewPager);
        try {
            TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{16842926});
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = getTheme().obtainStyledAttributes(resourceId, new int[]{16842938, 16842939});
            this.f28430b = obtainStyledAttributes2.getResourceId(0, 0);
            this.f28431c = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
        } catch (Resources.NotFoundException e5) {
            e5.printStackTrace();
        }
        this.f28436h.clear();
        this.f28436h.add(this.f28435g);
        this.f28432d = new CardPagerAdapter();
        DownloadTask F = p1.f.K().F(this.f28435g);
        d dVar = new d(this, null);
        dVar.f28447a = F;
        this.f28432d.b(dVar);
        this.f28434f = (CircleIndicator) findViewById(R.id.indicator);
        this.f28433e.setAdapter(this.f28432d);
        this.f28434f.setViewPager(this.f28433e);
        this.f28433e.setOffscreenPageLimit(3);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        try {
            overridePendingTransition(this.f28430b, this.f28431c);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            getContentResolver().unregisterContentObserver(this.f28437i);
            getContentResolver().unregisterContentObserver(this.f28438j);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey("gameId")) {
            this.f28435g = extras.getString("gameId");
        }
        if (!this.f28436h.contains(this.f28435g)) {
            this.f28436h.add(this.f28435g);
            DownloadTask F = p1.f.K().F(this.f28435g);
            d dVar = new d(this, null);
            dVar.f28447a = F;
            this.f28432d.b(dVar);
            this.f28432d.notifyDataSetChanged();
            this.f28434f.setViewPager(this.f28433e);
        }
        try {
            registerContentResolver();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void registerContentResolver() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f28437i = new b(new Handler());
            getContentResolver().registerContentObserver(Settings.Global.getUriFor("navigationbar_hide_bar_enabled"), true, this.f28437i);
            registerNavigationBarObserver();
        }
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i4) {
        super.setContentView(i4);
        getWindow().setGravity(80);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        getWindow().setAttributes(attributes);
        com.join.mgps.Util.c2.o(this, 16777215, true);
    }
}
