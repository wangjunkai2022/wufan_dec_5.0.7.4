package com.join.mgps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.base.dialog.BaseDialogActivity;
import com.join.mgps.enums.Dtype;
import com.papa.sim.statistic.Event;
import com.papa.sim.statistic.Ext;
import java.util.ArrayList;
import java.util.List;
import me.relex.circleindicator.CircleIndicator;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
/* loaded from: classes.dex */
public class AppDownFinishDialogActivity extends BaseDialogActivity {

    /* renamed from: g  reason: collision with root package name */
    public static final String f28454g = "_game_id";

    /* renamed from: b  reason: collision with root package name */
    private CardPagerAdapter f28455b;

    /* renamed from: c  reason: collision with root package name */
    private ViewPager f28456c;

    /* renamed from: d  reason: collision with root package name */
    private CircleIndicator f28457d;

    /* renamed from: e  reason: collision with root package name */
    String f28458e;

    /* renamed from: f  reason: collision with root package name */
    List<String> f28459f = new ArrayList();

    /* loaded from: classes4.dex */
    public class CardPagerAdapter extends PagerAdapter implements b {

        /* renamed from: b  reason: collision with root package name */
        private List<c> f28461b = new ArrayList();

        /* renamed from: a  reason: collision with root package name */
        private List<View> f28460a = new ArrayList();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f28463b;

            a(c cVar) {
                this.f28463b = cVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!this.f28463b.f28467a.isSo()) {
                    if (this.f28463b.f28467a.isMod()) {
                        com.papa.sim.statistic.p.l(view.getContext()).O1(Event.onclickSinGameStart, new Ext().setGameId(this.f28463b.f28467a.getCrc_link_type_val()).setGameFlag(1));
                    } else {
                        com.papa.sim.statistic.p.l(view.getContext()).O1(Event.onclickSinGameStart, new Ext().setGameId(this.f28463b.f28467a.getCrc_link_type_val()).setGameFlag(1));
                    }
                    com.papa.sim.statistic.p.l(view.getContext()).O1(Event.onclickSinGameStart, new Ext().setGameId(this.f28463b.f28467a.getCrc_link_type_val()).setGameFlag(1));
                } else if (this.f28463b.f28467a.isMod()) {
                    com.papa.sim.statistic.p.l(view.getContext()).O1(Event.onclickSoGameStart, new Ext().setGameId(this.f28463b.f28467a.getCrc_link_type_val()).setGameFlag(1));
                } else {
                    com.papa.sim.statistic.p.l(view.getContext()).O1(Event.onclickSoGameStart, new Ext().setGameId(this.f28463b.f28467a.getCrc_link_type_val()));
                }
                UtilsMy.T3(view.getContext(), this.f28463b.f28467a);
                AppDownFinishDialogActivity.this.finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ c f28465b;

            b(c cVar) {
                this.f28465b = cVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (this.f28465b.f28467a.isSo()) {
                    if (this.f28465b.f28467a.isMod()) {
                        com.papa.sim.statistic.p.l(view.getContext()).O1(Event.exitSoGameStart, new Ext().setGameId(this.f28465b.f28467a.getCrc_link_type_val()).setGameFlag(1));
                    } else {
                        com.papa.sim.statistic.p.l(view.getContext()).O1(Event.exitSoGameStart, new Ext().setGameId(this.f28465b.f28467a.getCrc_link_type_val()));
                    }
                } else if (this.f28465b.f28467a.isMod()) {
                    com.papa.sim.statistic.p.l(view.getContext()).O1(Event.exitSinGameStart, new Ext().setGameId(this.f28465b.f28467a.getCrc_link_type_val()).setGameFlag(1));
                } else {
                    com.papa.sim.statistic.p.l(view.getContext()).O1(Event.exitSinGameStart, new Ext().setGameId(this.f28465b.f28467a.getCrc_link_type_val()).setGameFlag(1));
                }
                AppDownFinishDialogActivity.this.finish();
            }
        }

        public CardPagerAdapter() {
        }

        private void c(c cVar, View view) {
            if (cVar.f28467a == null) {
                return;
            }
            TextView textView = (TextView) view.findViewById(R.id.info);
            TextView textView2 = (TextView) view.findViewById(R.id.title);
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.icon);
            ImageView imageView = (ImageView) view.findViewById(R.id.cancle);
            TextView textView3 = (TextView) view.findViewById(R.id.tv_score);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_star);
            TextView textView4 = (TextView) view.findViewById(R.id.tipsLayout);
            if (!com.join.mgps.Util.g2.h(cVar.f28467a.getScore()) && Float.valueOf(cVar.f28467a.getScore()).floatValue() > 0.0f) {
                textView3.setVisibility(0);
                textView3.setText(cVar.f28467a.getScore());
                imageView2.setVisibility(0);
            } else {
                textView3.setVisibility(8);
                imageView2.setVisibility(8);
            }
            if (cVar.f28467a.getSp_tag_info() != null && cVar.f28467a.getSp_tag_info().getModel() != null) {
                textView4.setVisibility(0);
                textView4.setText(cVar.f28467a.getSp_tag_info().getModel().getName());
            } else {
                textView4.setVisibility(8);
            }
            if (Dtype.apk.name().equals(cVar.f28467a.getFileType())) {
                textView.setText("下载完成");
                if (cVar.f28467a.isMod()) {
                    com.papa.sim.statistic.p.l(AppDownFinishDialogActivity.this).O1(Event.showSoGameStart, new Ext().setGameId(cVar.f28467a.getCrc_link_type_val()).setGameFlag(1));
                } else {
                    com.papa.sim.statistic.p.l(AppDownFinishDialogActivity.this).O1(Event.showSoGameStart, new Ext().setGameId(cVar.f28467a.getCrc_link_type_val()));
                }
            } else {
                if (cVar.f28467a.isMod()) {
                    com.papa.sim.statistic.p.l(AppDownFinishDialogActivity.this).O1(Event.showSinGameStart, new Ext().setGameId(cVar.f28467a.getCrc_link_type_val()).setGameFlag(1));
                } else {
                    com.papa.sim.statistic.p.l(AppDownFinishDialogActivity.this).O1(Event.showSinGameStart, new Ext().setGameId(cVar.f28467a.getCrc_link_type_val()));
                }
                textView.setText("安装完成");
            }
            MyImageLoader.h(simpleDraweeView, cVar.f28467a.getPortraitURL());
            textView2.setText(cVar.f28467a.getShowName());
            view.findViewById(R.id.tv_ok).setOnClickListener(new a(cVar));
            imageView.setOnClickListener(new b(cVar));
        }

        @Override // com.join.mgps.activity.AppDownFinishDialogActivity.b
        public View a(int i4) {
            return this.f28460a.get(i4);
        }

        public void b(c cVar) {
            this.f28460a.add(null);
            this.f28461b.add(cVar);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
            viewGroup.removeView((View) obj);
            this.f28460a.set(i4, null);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f28461b.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i4) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_app_down_finish, viewGroup, false);
            viewGroup.addView(inflate);
            c(this.f28461b.get(i4), inflate);
            this.f28460a.set(i4, inflate);
            return inflate;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        View a(int i4);

        int getCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public DownloadTask f28467a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f28468b;

        private c() {
        }
    }

    private void f0() {
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra(f28454g);
            this.f28458e = stringExtra;
            if (!com.join.mgps.Util.g2.i(stringExtra) || this.f28459f.contains(this.f28458e)) {
                return;
            }
            this.f28459f.add(this.f28458e);
            DownloadTask F = p1.f.K().F(this.f28458e);
            c cVar = new c();
            cVar.f28467a = F;
            this.f28455b.b(cVar);
            this.f28455b.notifyDataSetChanged();
            this.f28457d.setViewPager(this.f28456c);
        }
    }

    void initView() {
        this.f28456c = (ViewPager) findViewById(R.id.viewPager);
        this.f28459f.clear();
        this.f28455b = new CardPagerAdapter();
        this.f28457d = (CircleIndicator) findViewById(R.id.indicator);
        this.f28456c.setAdapter(this.f28455b);
        this.f28457d.setViewPager(this.f28456c);
        this.f28456c.setOffscreenPageLimit(3);
        f0();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onAppDownFinishEvent(com.join.mgps.event.o oVar) {
        if (oVar == null || getClass() != oVar.a()) {
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.base.dialog.BaseDialogActivity, com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.appdown_finish_activity);
        com.join.mgps.Util.c2.s(this);
        org.greenrobot.eventbus.c.f().t(this);
        initView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.f().y(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        f0();
    }
}
