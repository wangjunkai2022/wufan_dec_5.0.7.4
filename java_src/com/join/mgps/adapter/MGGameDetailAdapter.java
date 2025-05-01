package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.drawable.r;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentAllListActivity_;
import com.join.mgps.activity.CommentCreatActivity_;
import com.join.mgps.activity.DetialMoreServiceListActivity_;
import com.join.mgps.activity.GameDetialGiftMoreActivity_;
import com.join.mgps.activity.GameDetialInformationMoreActivity_;
import com.join.mgps.activity.GiftsDetailActivity_;
import com.join.mgps.activity.HotVoucherActivity_;
import com.join.mgps.activity.ImagePagerActivity;
import com.join.mgps.activity.MyVoucherGameActivity_;
import com.join.mgps.activity.UpdateRecordActivity_;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.customview.CarouselViewPager2;
import com.join.mgps.customview.MyGridView;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.AccountVoucher;
import com.join.mgps.dto.AccountVoucherStatus;
import com.join.mgps.dto.AccountVoucherStatusBean;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.BannerImage;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentBaseBean;
import com.join.mgps.dto.DetailResultBeanV3;
import com.join.mgps.dto.DetialIntentBean;
import com.join.mgps.dto.DetialShowImageBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.GameCommitListBean;
import com.join.mgps.dto.GameDetialBookTag;
import com.join.mgps.dto.GameDetialStrategyItem;
import com.join.mgps.dto.GameDetialStrategyTag;
import com.join.mgps.dto.GamePromptBean;
import com.join.mgps.dto.GameVoucherBean;
import com.join.mgps.dto.GiftPackageDataInfoBean;
import com.join.mgps.dto.InformationCommentBean;
import com.join.mgps.dto.RecommendAdInfoBean;
import com.join.mgps.dto.RecommendAdInfoData;
import com.join.mgps.dto.RecommendGameBean;
import com.join.mgps.dto.RecommendInfomationBean;
import com.join.mgps.dto.ServiceState;
import com.join.mgps.dto.TipBean;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class MGGameDetailAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private final String f43374b;

    /* renamed from: c  reason: collision with root package name */
    private int f43375c;

    /* renamed from: e  reason: collision with root package name */
    private final RelativeLayout f43377e;

    /* renamed from: f  reason: collision with root package name */
    private Context f43378f;

    /* renamed from: g  reason: collision with root package name */
    private DetailResultBeanV3 f43379g;

    /* renamed from: o  reason: collision with root package name */
    private Drawable f43387o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f43388p;

    /* renamed from: q  reason: collision with root package name */
    private Handler f43389q;

    /* renamed from: s  reason: collision with root package name */
    private List<y0> f43391s;

    /* renamed from: t  reason: collision with root package name */
    private LinearLayout.LayoutParams f43392t;

    /* renamed from: u  reason: collision with root package name */
    private u0 f43393u;

    /* renamed from: w  reason: collision with root package name */
    private TextView f43395w;

    /* renamed from: x  reason: collision with root package name */
    private TextView f43396x;

    /* renamed from: d  reason: collision with root package name */
    String f43376d = getClass().getSimpleName();

    /* renamed from: h  reason: collision with root package name */
    private boolean f43380h = true;

    /* renamed from: i  reason: collision with root package name */
    private List<String> f43381i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private boolean f43382j = false;

    /* renamed from: k  reason: collision with root package name */
    private int f43383k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f43384l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f43385m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f43386n = 0;

    /* renamed from: r  reason: collision with root package name */
    private List<RecommendGameBean> f43390r = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    private boolean f43394v = true;

    /* renamed from: y  reason: collision with root package name */
    v0 f43397y = null;

    /* renamed from: z  reason: collision with root package name */
    long f43398z = System.currentTimeMillis();

    /* loaded from: classes4.dex */
    public enum ViewType {
        TITLE,
        VIEWPAGE,
        UPDATE_RECORD,
        WEB,
        GAME_GIFTS,
        GAMEAD,
        MESSAGE,
        RECOMMEND,
        INFORMATION,
        COMMIT_HEADER,
        COMMIT,
        COMMIT_REPLY,
        COMMIT_FOOTER,
        GAME_ITEM_TOP,
        GAME_GIFTS_ITEM,
        GAME_GIFTS_BOTTOM,
        VOUCHER,
        DETIAL_ADGROUP,
        INFORMATIONTOP,
        SERVICEITEM,
        STRAYTEGYTABLE,
        STRAYTEGYITEM_IMAGE,
        STRAYTEGYITEM_NOIMAGE,
        GAME_FAST_ENTRY,
        GIFT_AND_SERVICE,
        NULLITEM
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f43399b;

        a(List list) {
            this.f43399b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list = this.f43399b;
            if (list == null || list.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(MGGameDetailAdapter.this.f43378f, ((BannerBean) this.f43399b.get(0)).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a0 implements View.OnClickListener {
        a0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MGGameDetailAdapter.this.f43393u != null) {
                MGGameDetailAdapter.this.f43393u.a(Boolean.valueOf(MGGameDetailAdapter.this.f43394v));
                ImageView imageView = (ImageView) view;
                if (MGGameDetailAdapter.this.f43394v) {
                    imageView.setImageResource(R.drawable.detial_more_up);
                    MGGameDetailAdapter.this.f43394v = false;
                    return;
                }
                imageView.setImageResource(R.drawable.forum_ext_func);
                MGGameDetailAdapter.this.f43394v = true;
            }
        }
    }

    /* loaded from: classes4.dex */
    public class a1 {

        /* renamed from: a  reason: collision with root package name */
        RelativeLayout f43402a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43403b;

        public a1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f43405b;

        b(List list) {
            this.f43405b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list = this.f43405b;
            if (list == null || list.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(MGGameDetailAdapter.this.f43378f, ((BannerBean) this.f43405b.get(0)).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f43407b;

        b0(List list) {
            this.f43407b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list = this.f43407b;
            if (list == null || list.size() <= 0 || ((RecommendAdInfoData) this.f43407b.get(0)).getSub() == null || ((RecommendAdInfoData) this.f43407b.get(0)).getSub().size() <= 0) {
                return;
            }
            RecommendAdInfoBean recommendAdInfoBean = ((RecommendAdInfoData) this.f43407b.get(0)).getSub().get(0);
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setJump_type(recommendAdInfoBean.getJump_type());
            intentDateBean.setLink_type(recommendAdInfoBean.getLink_type());
            intentDateBean.setLink_type_val(recommendAdInfoBean.getLink_type_val());
            intentDateBean.setTpl_type(recommendAdInfoBean.getTpl_type());
            intentDateBean.setCrc_link_type_val(recommendAdInfoBean.getCrc_link_type_val());
            IntentUtil.getInstance().intentActivity(MGGameDetailAdapter.this.f43378f, intentDateBean);
        }
    }

    /* loaded from: classes4.dex */
    public class b1 {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f43409a;

        /* renamed from: b  reason: collision with root package name */
        RelativeLayout f43410b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43411c;

        /* renamed from: d  reason: collision with root package name */
        TextView f43412d;

        public b1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43414b;

        c(String str) {
            this.f43414b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goQQGroup(MGGameDetailAdapter.this.f43378f, this.f43414b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y0.t f43416b;

        c0(y0.t tVar) {
            this.f43416b = tVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UpdateRecordActivity_.g0(MGGameDetailAdapter.this.f43378f).a(this.f43416b.f43717b).start();
        }
    }

    /* loaded from: classes4.dex */
    public class c1 {

        /* renamed from: a  reason: collision with root package name */
        private FrameLayout f43418a;

        /* renamed from: b  reason: collision with root package name */
        private CarouselViewPager2 f43419b;

        /* renamed from: c  reason: collision with root package name */
        private ViewGroup f43420c;

        /* renamed from: d  reason: collision with root package name */
        private View f43421d;

        /* renamed from: e  reason: collision with root package name */
        ArrayList<BannerImage> f43422e = new ArrayList<>();

        /* renamed from: f  reason: collision with root package name */
        ImageView[] f43423f = new ImageView[0];

        /* loaded from: classes4.dex */
        class a extends ViewPager.SimpleOnPageChangeListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ MGGameDetailAdapter f43425b;

            a(MGGameDetailAdapter mGGameDetailAdapter) {
                this.f43425b = mGGameDetailAdapter;
            }

            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i4) {
                super.onPageSelected(i4);
                int size = i4 % c1.this.f43422e.size();
                for (int i5 = 0; i5 < c1.this.f43422e.size(); i5++) {
                    c1.this.f43423f[size].setBackgroundResource(R.drawable.point_selected);
                    if (size != i5) {
                        c1.this.f43423f[i5].setBackgroundResource(R.drawable.point_normal);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f43427b;

            b(List list) {
                this.f43427b = list;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                int currentItem = c1.this.f43419b.getCurrentItem();
                c1 c1Var = c1.this;
                List list = this.f43427b;
                c1Var.d(list, currentItem % list.size());
            }
        }

        public c1(View view) {
            this.f43421d = view;
            this.f43420c = (ViewGroup) view.findViewById(R.id.point_group);
            CarouselViewPager2 carouselViewPager2 = (CarouselViewPager2) view.findViewById(R.id.top_ad_viewpager);
            this.f43419b = carouselViewPager2;
            carouselViewPager2.addOnPageChangeListener(new a(MGGameDetailAdapter.this));
            this.f43418a = (FrameLayout) view.findViewById(R.id.onlyOne);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(List<BannerBean> list, int i4) {
            if (list == null || list.size() == 0) {
                return;
            }
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setJump_type(list.get(i4).getJump_type());
            intentDateBean.setLink_type(list.get(i4).getLink_type());
            intentDateBean.setLink_type_val(list.get(i4).getLink_type_val());
            if (list.get(i4).getLink_type() == 1) {
                intentDateBean.setTpl_type(list.get(i4).getGame_info_tpl_type());
            } else {
                intentDateBean.setTpl_type(list.get(i4).getTpl_type());
            }
            intentDateBean.setCrc_link_type_val(list.get(i4).getCrc_link_type_val());
            intentDateBean.setObject(list.get(i4).getTitle());
            IntentUtil.getInstance().intentActivity(MGGameDetailAdapter.this.f43378f, intentDateBean);
        }

        public void c(List<BannerBean> list) {
            this.f43422e.clear();
            for (int i4 = 0; i4 < list.size(); i4++) {
                BannerImage bannerImage = new BannerImage();
                SimpleDraweeView simpleDraweeView = new SimpleDraweeView(MGGameDetailAdapter.this.f43378f);
                MyImageLoader.d(simpleDraweeView, R.drawable.banner_normal_icon, list.get(i4).getPic_remote());
                simpleDraweeView.setScaleType(ImageView.ScaleType.FIT_XY);
                bannerImage.setImageView(simpleDraweeView);
                bannerImage.setUrl(list.get(i4).getPic_remote());
                this.f43422e.add(bannerImage);
                simpleDraweeView.setOnClickListener(new b(list));
            }
            int dimensionPixelOffset = MGGameDetailAdapter.this.f43378f.getResources().getDimensionPixelOffset(R.dimen.round_pointmagin_l_r_size);
            int dimensionPixelOffset2 = MGGameDetailAdapter.this.f43378f.getResources().getDimensionPixelOffset(R.dimen.round_point_size);
            this.f43420c.removeAllViews();
            this.f43423f = new ImageView[list.size()];
            int i5 = 0;
            while (true) {
                ImageView[] imageViewArr = this.f43423f;
                if (i5 >= imageViewArr.length) {
                    break;
                }
                if (i5 <= 8) {
                    imageViewArr[i5] = new ImageView(MGGameDetailAdapter.this.f43378f);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelOffset2, dimensionPixelOffset2);
                    layoutParams.gravity = 1;
                    layoutParams.setMargins(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                    this.f43423f[i5].setLayoutParams(layoutParams);
                    if (i5 == 0) {
                        this.f43423f[i5].setBackgroundResource(R.drawable.point_selected);
                    } else {
                        this.f43423f[i5].setBackgroundResource(R.drawable.point_normal);
                    }
                    this.f43420c.addView(this.f43423f[i5]);
                }
                i5++;
            }
            ArrayList<BannerImage> arrayList = this.f43422e;
            if (arrayList == null || arrayList.size() == 0) {
                return;
            }
            this.f43418a.setVisibility(4);
            this.f43419b.setVisibility(0);
            if (this.f43422e.size() == 1) {
                SimpleDraweeView imageView = this.f43422e.get(0).getImageView();
                MyImageLoader.h(imageView, this.f43422e.get(0).getUrl());
                this.f43418a.addView(imageView);
                this.f43418a.setVisibility(0);
                this.f43419b.setVisibility(4);
                return;
            }
            this.f43419b.setAdapter(new SimpleCarouselAdapter(MGGameDetailAdapter.this.f43378f, this.f43419b, list));
            this.f43419b.getAdapter().notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f43429b;

        d(List list) {
            this.f43429b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list = this.f43429b;
            if (list == null || list.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(MGGameDetailAdapter.this.f43378f, ((BannerBean) this.f43429b.get(0)).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d0 implements AdapterView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y0.u f43431a;

        d0(y0.u uVar) {
            this.f43431a = uVar;
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            try {
                Intent intent = new Intent(MGGameDetailAdapter.this.f43378f, ImagePagerActivity.class);
                String[] strArr = new String[MGGameDetailAdapter.this.f43381i.size()];
                for (int i5 = 0; i5 < MGGameDetailAdapter.this.f43381i.size(); i5++) {
                    strArr[i5] = (String) MGGameDetailAdapter.this.f43381i.get(i5);
                }
                if (com.join.mgps.Util.g2.i(this.f43431a.f43721d) && i4 == 0) {
                    FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                    videoInfo.m(this.f43431a.f43721d);
                    videoInfo.h(strArr[0]);
                    FullScreenActivity_.i0(MGGameDetailAdapter.this.f43378f).a(videoInfo).start();
                    return;
                }
                intent.putExtra("image_urls", strArr);
                intent.putExtra("image_index", i4);
                MGGameDetailAdapter.this.f43378f.startActivity(intent);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class d1 {

        /* renamed from: a  reason: collision with root package name */
        public LinearLayout f43433a;

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f43434b;

        /* renamed from: c  reason: collision with root package name */
        public LinearLayout f43435c;

        /* renamed from: d  reason: collision with root package name */
        public LinearLayout f43436d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f43437e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f43438f;

        /* renamed from: g  reason: collision with root package name */
        public SimpleDraweeView f43439g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f43440h;

        /* renamed from: i  reason: collision with root package name */
        public SimpleDraweeView f43441i;

        /* renamed from: j  reason: collision with root package name */
        public SimpleDraweeView f43442j;

        /* renamed from: k  reason: collision with root package name */
        public SimpleDraweeView f43443k;

        /* renamed from: l  reason: collision with root package name */
        public TextView f43444l;

        /* renamed from: m  reason: collision with root package name */
        public TextView f43445m;

        /* renamed from: n  reason: collision with root package name */
        public TextView f43446n;

        public d1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f43448b;

        e(List list) {
            this.f43448b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list = this.f43448b;
            if (list == null || list.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(MGGameDetailAdapter.this.f43378f, ((BannerBean) this.f43448b.get(0)).getIntentDataBean());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e0 implements View.OnClickListener {
        e0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailAdapter.this.f43397y.i();
        }
    }

    /* loaded from: classes4.dex */
    public class e1 {

        /* renamed from: a  reason: collision with root package name */
        public LinearLayout f43451a;

        public e1(View view) {
            this.f43451a = (LinearLayout) view.findViewById(R.id.group);
            view.setTag(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43453b;

        f(String str) {
            this.f43453b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goQQChart(MGGameDetailAdapter.this.f43378f, this.f43453b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f0 implements View.OnClickListener {
        f0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MGGameDetailAdapter.this.f43397y.k();
        }
    }

    /* loaded from: classes4.dex */
    public class f1 {

        /* renamed from: a  reason: collision with root package name */
        RelativeLayout f43456a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f43457b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43458c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f43459d;

        public f1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43461b;

        g(String str) {
            this.f43461b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goQQGroup(MGGameDetailAdapter.this.f43378f, this.f43461b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g0 implements View.OnClickListener {
        g0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DetialMoreServiceListActivity_.r0(MGGameDetailAdapter.this.f43378f).a(MGGameDetailAdapter.this.f43379g.getCrc_sign_id()).start();
        }
    }

    /* loaded from: classes4.dex */
    public class g1 {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f43464a;

        public g1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f43466b;

        h(List list) {
            this.f43466b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list = this.f43466b;
            if (list == null || list.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(MGGameDetailAdapter.this.f43378f, ((BannerBean) this.f43466b.get(0)).getIntentDataBean());
        }
    }

    /* loaded from: classes4.dex */
    class h0 implements u0 {
        h0() {
        }

        @Override // com.join.mgps.adapter.MGGameDetailAdapter.u0
        public void a(Boolean bool) {
            if (bool.booleanValue()) {
                if (MGGameDetailAdapter.this.f43395w != null) {
                    MGGameDetailAdapter.this.f43395w.setVisibility(0);
                }
                if (MGGameDetailAdapter.this.f43396x != null) {
                    MGGameDetailAdapter.this.f43396x.setVisibility(8);
                    return;
                }
                return;
            }
            if (MGGameDetailAdapter.this.f43395w != null) {
                MGGameDetailAdapter.this.f43395w.setVisibility(8);
            }
            if (MGGameDetailAdapter.this.f43396x != null) {
                MGGameDetailAdapter.this.f43396x.setVisibility(0);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class h1 {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f43469a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f43470b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43471c;

        /* renamed from: d  reason: collision with root package name */
        TextView f43472d;

        /* renamed from: e  reason: collision with root package name */
        TextView f43473e;

        /* renamed from: f  reason: collision with root package name */
        TextView f43474f;

        /* renamed from: g  reason: collision with root package name */
        RelativeLayout f43475g;

        /* renamed from: h  reason: collision with root package name */
        TextView f43476h;

        /* renamed from: i  reason: collision with root package name */
        TextView f43477i;

        public h1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f43479b;

        i(List list) {
            this.f43479b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list = this.f43479b;
            if (list == null || list.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(MGGameDetailAdapter.this.f43378f, ((BannerBean) this.f43479b.get(0)).getIntentDataBean());
        }
    }

    /* loaded from: classes4.dex */
    class i0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f43481b;

        i0(InformationCommentBean informationCommentBean) {
            this.f43481b = informationCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f43481b.isHasPraised()) {
                com.join.mgps.Util.l2.a(MGGameDetailAdapter.this.f43378f).b("你已赞过");
            } else if (AccountUtil_.getInstance_(MGGameDetailAdapter.this.f43378f).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(MGGameDetailAdapter.this.f43378f);
            } else {
                ((ImageView) view).setImageResource(R.drawable.like);
                view.startAnimation(AnimationUtils.loadAnimation(MGGameDetailAdapter.this.f43378f, R.anim.scale_reset));
                v0 v0Var = MGGameDetailAdapter.this.f43397y;
                if (v0Var != null) {
                    v0Var.a(this.f43481b);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class i1 {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f43483a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f43484b;

        /* renamed from: c  reason: collision with root package name */
        public LinearLayout f43485c;

        public i1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43487b;

        j(String str) {
            this.f43487b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goQQGroup(MGGameDetailAdapter.this.f43378f, this.f43487b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean.Sub f43489b;

        j0(InformationCommentBean.Sub sub) {
            this.f43489b = sub;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v0 v0Var = MGGameDetailAdapter.this.f43397y;
            if (v0Var != null) {
                v0Var.e(this.f43489b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class j1 {

        /* renamed from: a  reason: collision with root package name */
        public LinearLayout f43491a;

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f43492b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f43493c;

        /* renamed from: d  reason: collision with root package name */
        public LinearLayout f43494d;

        /* renamed from: e  reason: collision with root package name */
        public LinearLayout f43495e;

        /* renamed from: f  reason: collision with root package name */
        public SimpleDraweeView f43496f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f43497g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f43498h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f43499i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f43500j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f43501k;

        /* renamed from: l  reason: collision with root package name */
        public TextView f43502l;

        /* renamed from: m  reason: collision with root package name */
        public TextView f43503m;

        /* renamed from: n  reason: collision with root package name */
        public TextView f43504n;

        /* renamed from: o  reason: collision with root package name */
        public LinearLayout f43505o;

        /* renamed from: p  reason: collision with root package name */
        public LinearLayout f43506p;

        /* renamed from: q  reason: collision with root package name */
        public LinearLayout f43507q;

        public j1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements View.OnClickListener {
        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameDetialGiftMoreActivity_.T0(MGGameDetailAdapter.this.f43378f).a(MGGameDetailAdapter.this.f43379g.getCrc_sign_id()).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f43510b;

        k0(CommentBaseBean commentBaseBean) {
            this.f43510b = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v0 v0Var = MGGameDetailAdapter.this.f43397y;
            if (v0Var != null) {
                v0Var.f(this.f43510b);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class k1 {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f43512a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f43513b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43514c;

        /* renamed from: d  reason: collision with root package name */
        TextView f43515d;

        /* renamed from: e  reason: collision with root package name */
        LinearLayout f43516e;

        /* renamed from: f  reason: collision with root package name */
        LinearLayout f43517f;

        /* renamed from: g  reason: collision with root package name */
        View f43518g;

        /* renamed from: h  reason: collision with root package name */
        public TextView f43519h;

        public k1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f43521b;

        l(List list) {
            this.f43521b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list = this.f43521b;
            if (list == null || list.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(MGGameDetailAdapter.this.f43378f, ((BannerBean) this.f43521b.get(0)).getIntentDataBean());
        }
    }

    /* loaded from: classes4.dex */
    class l0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43523b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43524c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f43525d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ y0.r f43526e;

        l0(int i4, int i5, String str, y0.r rVar) {
            this.f43523b = i4;
            this.f43524c = i5;
            this.f43525d = str;
            this.f43526e = rVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f43523b == 0) {
                return;
            }
            InformationCommentBean informationCommentBean = new InformationCommentBean();
            ArrayList arrayList = new ArrayList();
            for (int i4 = this.f43523b; i4 >= 0; i4--) {
                y0 y0Var = (y0) MGGameDetailAdapter.this.f43391s.get(this.f43524c - i4);
                y0.r rVar = y0Var.b() == ViewType.COMMIT_REPLY ? (y0.r) y0Var.a() : null;
                if (rVar != null && this.f43525d == rVar.f43697a) {
                    arrayList.addAll(rVar.f43698b.getSub());
                }
            }
            for (int i5 = 0; i5 <= this.f43523b; i5++) {
                MGGameDetailAdapter.this.f43391s.remove(this.f43524c - i5);
            }
            informationCommentBean.setSub(arrayList);
            MGGameDetailAdapter.this.f43391s.add(this.f43524c - this.f43523b, MGGameDetailAdapter.this.l(this.f43525d, informationCommentBean, this.f43526e.f43699c, true));
            MGGameDetailAdapter.this.notifyDataSetChanged();
        }
    }

    /* loaded from: classes4.dex */
    public class l1 {

        /* renamed from: a  reason: collision with root package name */
        public TextView f43528a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f43529b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f43530c;

        /* renamed from: d  reason: collision with root package name */
        public LinearLayout f43531d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f43532e;

        /* renamed from: f  reason: collision with root package name */
        public SimpleDraweeView f43533f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f43534g;

        public l1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f43536b;

        m(List list) {
            this.f43536b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List list = this.f43536b;
            if (list == null || list.size() <= 0) {
                return;
            }
            IntentUtil.getInstance().intentActivity(MGGameDetailAdapter.this.f43378f, ((BannerBean) this.f43536b.get(0)).getIntentDataBean());
        }
    }

    /* loaded from: classes4.dex */
    class m0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43538b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ InformationCommentBean f43539c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f43540d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ y0.r f43541e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f43542f;

        m0(int i4, InformationCommentBean informationCommentBean, String str, y0.r rVar, int i5) {
            this.f43538b = i4;
            this.f43539c = informationCommentBean;
            this.f43540d = str;
            this.f43541e = rVar;
            this.f43542f = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (i4 < this.f43538b) {
                InformationCommentBean informationCommentBean = new InformationCommentBean(this.f43539c);
                List<InformationCommentBean.Sub> sub = informationCommentBean.getSub();
                ArrayList arrayList = new ArrayList();
                int i6 = i4 + 3;
                if (i6 < sub.size()) {
                    arrayList.addAll(sub.subList(i4, i6));
                } else {
                    arrayList.addAll(sub.subList(i4, sub.size()));
                    z4 = true;
                }
                informationCommentBean.setSub(arrayList);
                y0 l4 = MGGameDetailAdapter.this.l(this.f43540d, informationCommentBean, this.f43541e.f43699c, i5 == 0);
                y0.r rVar = (y0.r) l4.a();
                rVar.f43701e = i5;
                rVar.f43702f = z4;
                rVar.f43700d = i5 == 0;
                MGGameDetailAdapter.this.V(l4, !z4);
                MGGameDetailAdapter.this.f43391s.add(this.f43542f + i5 + 1, l4);
                i5++;
                i4 = i6;
            }
            MGGameDetailAdapter.this.f43391s.remove(this.f43542f);
            MGGameDetailAdapter.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m1 {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f43544a;

        /* renamed from: b  reason: collision with root package name */
        View f43545b;

        /* renamed from: c  reason: collision with root package name */
        public LinearLayout f43546c;

        /* renamed from: d  reason: collision with root package name */
        public ImageView f43547d;

        m1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43549b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String[] f43550c;

        n(int i4, String[] strArr) {
            this.f43549b = i4;
            this.f43550c = strArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.join.mgps.Util.j0.G0(view.getContext(), this.f43549b, this.f43550c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f43552b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43553c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f43554d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f43555e;

        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                long longValue = Long.valueOf(n0.this.f43555e.getText().toString()).longValue();
                TextView textView = n0.this.f43555e;
                textView.setText((longValue + 1) + "");
                n0 n0Var = n0.this;
                MGGameDetailAdapter.this.k(n0Var.f43553c);
                n0 n0Var2 = n0.this;
                v0 v0Var = MGGameDetailAdapter.this.f43397y;
                if (v0Var != null) {
                    v0Var.b(n0Var2.f43552b, n0Var2.f43553c, 1);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        n0(CommentBaseBean commentBaseBean, int i4, ImageView imageView, TextView textView) {
            this.f43552b = commentBaseBean;
            this.f43553c = i4;
            this.f43554d = imageView;
            this.f43555e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentBaseBean commentBaseBean;
            long currentTimeMillis = System.currentTimeMillis();
            MGGameDetailAdapter mGGameDetailAdapter = MGGameDetailAdapter.this;
            if (currentTimeMillis - mGGameDetailAdapter.f43398z < 500) {
                return;
            }
            mGGameDetailAdapter.f43398z = currentTimeMillis;
            if (IntentUtil.getInstance().goLoginInteractive(MGGameDetailAdapter.this.f43378f) || (commentBaseBean = this.f43552b) == null) {
                return;
            }
            if (commentBaseBean.getIs_praise() == 1) {
                MGGameDetailAdapter.this.g0(this.f43553c);
                this.f43554d.setImageResource(R.drawable.up_ic);
                v0 v0Var = MGGameDetailAdapter.this.f43397y;
                if (v0Var != null) {
                    v0Var.b(this.f43552b, this.f43553c, 2);
                    return;
                }
                return;
            }
            this.f43552b.setIs_praise(1);
            if (AccountUtil_.getInstance_(MGGameDetailAdapter.this.f43378f).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(MGGameDetailAdapter.this.f43378f);
                return;
            }
            this.f43554d.setImageResource(R.drawable.uped_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(MGGameDetailAdapter.this.f43378f, R.anim.scale_reset);
            this.f43554d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new a());
        }
    }

    /* loaded from: classes4.dex */
    public class n1 {

        /* renamed from: a  reason: collision with root package name */
        TextView f43558a;

        public n1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43560b;

        o(int i4) {
            this.f43560b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
            forumPostsBean.setPid(this.f43560b);
            com.join.mgps.Util.j0.v0(MGGameDetailAdapter.this.f43378f, forumPostsBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o0 implements View.OnClickListener {
        o0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DetialMoreServiceListActivity_.r0(MGGameDetailAdapter.this.f43378f).a(MGGameDetailAdapter.this.f43379g.getCrc_sign_id()).start();
        }
    }

    /* loaded from: classes4.dex */
    public class o1 {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f43563a;

        /* renamed from: b  reason: collision with root package name */
        MyGridView f43564b;

        public o1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameDetialStrategyTag f43566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f43567c;

        p(GameDetialStrategyTag gameDetialStrategyTag, List list) {
            this.f43566b = gameDetialStrategyTag;
            this.f43567c = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DetialIntentBean detialIntentBean = new DetialIntentBean();
            detialIntentBean.setGameId(MGGameDetailAdapter.this.f43379g.getCrc_sign_id());
            detialIntentBean.setIntentType(5);
            detialIntentBean.setStartegyTab(this.f43566b.getTag_id());
            detialIntentBean.setStrategyTags(this.f43567c);
            GameDetialInformationMoreActivity_.B0(MGGameDetailAdapter.this.f43378f).a(detialIntentBean).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class p0 implements View.OnClickListener {
        p0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DetialMoreServiceListActivity_.r0(MGGameDetailAdapter.this.f43378f).a(MGGameDetailAdapter.this.f43379g.getCrc_sign_id()).start();
        }
    }

    /* loaded from: classes4.dex */
    public class p1 {

        /* renamed from: a  reason: collision with root package name */
        TextView f43570a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f43571b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f43572c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f43573d;

        public p1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendInfomationBean f43575b;

        q(RecommendInfomationBean recommendInfomationBean) {
            this.f43575b = recommendInfomationBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
                forumPostsBean.setPid(this.f43575b.getPost_id());
                com.join.mgps.Util.j0.v0(MGGameDetailAdapter.this.f43378f, forumPostsBean);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f43577b;

        q0(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f43577b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f43577b.getGift_package_status() == 0) {
                Message message = new Message();
                message.what = 3;
                message.obj = this.f43577b;
                MGGameDetailAdapter.this.f43389q.sendMessage(message);
                return;
            }
            Message message2 = new Message();
            message2.what = 2;
            message2.obj = this.f43577b;
            MGGameDetailAdapter.this.f43389q.sendMessage(message2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class q1 {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f43579a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43580b;

        /* renamed from: c  reason: collision with root package name */
        LinearLayout f43581c;

        /* renamed from: d  reason: collision with root package name */
        TextView f43582d;

        /* renamed from: e  reason: collision with root package name */
        TextView f43583e;

        /* renamed from: f  reason: collision with root package name */
        TextView f43584f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f43585g;

        /* renamed from: h  reason: collision with root package name */
        public Button f43586h;

        /* renamed from: i  reason: collision with root package name */
        public SimpleDraweeView f43587i;

        /* renamed from: j  reason: collision with root package name */
        public LinearLayout f43588j;

        /* renamed from: k  reason: collision with root package name */
        public Button f43589k;

        /* renamed from: l  reason: collision with root package name */
        public LinearLayout f43590l;

        /* renamed from: m  reason: collision with root package name */
        public TextView f43591m;

        /* renamed from: n  reason: collision with root package name */
        public HorizontalScrollView f43592n;

        q1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f43594b;

        r(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f43594b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(MGGameDetailAdapter.this.f43378f).getAccountData();
            if (accountData == null) {
                GiftsDetailActivity_.P0(MGGameDetailAdapter.this.f43378f).c(this.f43594b).start();
            } else {
                GiftsDetailActivity_.P0(MGGameDetailAdapter.this.f43378f).c(this.f43594b).a(accountData.getUid()).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class r0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f43596b;

        r0(long j4) {
            this.f43596b = j4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goForumFid(MGGameDetailAdapter.this.f43378f, (int) this.f43596b);
        }
    }

    /* loaded from: classes4.dex */
    public class r1 {

        /* renamed from: a  reason: collision with root package name */
        RelativeLayout f43598a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43599b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f43600c;

        /* renamed from: d  reason: collision with root package name */
        View f43601d;

        public r1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GiftPackageDataInfoBean f43603b;

        s(GiftPackageDataInfoBean giftPackageDataInfoBean) {
            this.f43603b = giftPackageDataInfoBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f43603b.getGift_package_status() == 0) {
                Message message = new Message();
                message.what = 3;
                message.obj = this.f43603b;
                MGGameDetailAdapter.this.f43389q.sendMessage(message);
                return;
            }
            Message message2 = new Message();
            message2.what = 2;
            message2.obj = this.f43603b;
            MGGameDetailAdapter.this.f43389q.sendMessage(message2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43605b;

        s0(String str) {
            this.f43605b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goQQChart(MGGameDetailAdapter.this.f43378f, this.f43605b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class s1 {

        /* renamed from: a  reason: collision with root package name */
        HListView f43607a;

        s1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetialIntentBean f43609b;

        t(DetialIntentBean detialIntentBean) {
            this.f43609b = detialIntentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int intentType = this.f43609b.getIntentType();
            if (intentType == 1 || intentType == 2) {
                GameDetialInformationMoreActivity_.B0(MGGameDetailAdapter.this.f43378f).a(this.f43609b).start();
            } else if (intentType == 3) {
                DetialMoreServiceListActivity_.r0(MGGameDetailAdapter.this.f43378f).a(this.f43609b.getGameId()).start();
            } else if (intentType != 4) {
            } else {
                GameDetialGiftMoreActivity_.T0(MGGameDetailAdapter.this.f43378f).a(this.f43609b.getGameId()).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class t0 implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43611b;

        t0(String str) {
            this.f43611b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goQQGroup(MGGameDetailAdapter.this.f43378f, this.f43611b);
        }
    }

    /* loaded from: classes4.dex */
    public class t1 {

        /* renamed from: a  reason: collision with root package name */
        TextView f43613a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43614b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43615c;

        /* renamed from: d  reason: collision with root package name */
        TextView f43616d;

        /* renamed from: e  reason: collision with root package name */
        LinearLayout f43617e;

        /* renamed from: f  reason: collision with root package name */
        LinearLayout f43618f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameVoucherBean f43620b;

            a(GameVoucherBean gameVoucherBean) {
                this.f43620b = gameVoucherBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Message obtainMessage = MGGameDetailAdapter.this.f43389q.obtainMessage();
                obtainMessage.what = 4;
                obtainMessage.obj = this.f43620b;
                MGGameDetailAdapter.this.f43389q.sendMessage(obtainMessage);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class b implements View.OnClickListener {
            b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AccountVoucher accountVoucher = new AccountVoucher();
                accountVoucher.setGame_id(Long.parseLong(MGGameDetailAdapter.this.f43379g.getCrc_sign_id()));
                accountVoucher.setGame_name(MGGameDetailAdapter.this.f43379g.getGame_name());
                accountVoucher.setStatus(new AccountVoucherStatus(new AccountVoucherStatusBean(0.0d, 0), null));
                accountVoucher.setGame_tpl(MGGameDetailAdapter.this.f43379g.getGame_info_tpl_type());
                accountVoucher.setSp_tpl_two_position(MGGameDetailAdapter.this.f43379g.getSp_tpl_two_position());
                MyVoucherGameActivity_.y0(MGGameDetailAdapter.this.f43378f).a(accountVoucher).start();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HotVoucherActivity_.w0(MGGameDetailAdapter.this.f43378f).start();
            }
        }

        public t1(View view) {
            this.f43613a = (TextView) view.findViewById(R.id.voucherPrice);
            this.f43614b = (TextView) view.findViewById(R.id.voucherContent);
            this.f43616d = (TextView) view.findViewById(R.id.voucherGameGet);
            this.f43615c = (TextView) view.findViewById(R.id.voucherGameNumber);
            this.f43617e = (LinearLayout) view.findViewById(R.id.layoutGamevoucher);
            this.f43618f = (LinearLayout) view.findViewById(R.id.gameVoucherRight);
        }

        public void a(GameVoucherBean gameVoucherBean) {
            if (gameVoucherBean != null) {
                TextView textView = this.f43613a;
                textView.setText("￥" + gameVoucherBean.getGame_coupon_money());
                this.f43614b.setText(gameVoucherBean.getGame_coupon_title());
                int game_coupon_status = gameVoucherBean.getGame_coupon_status();
                if (game_coupon_status == 1) {
                    TextView textView2 = this.f43615c;
                    String string = MGGameDetailAdapter.this.f43378f.getString(R.string.voucher_surplus);
                    textView2.setText(String.format(string, gameVoucherBean.getGame_coupon_surplus_number() + ""));
                    this.f43616d.setText(MGGameDetailAdapter.this.f43378f.getString(R.string.voucher_get));
                    this.f43615c.setPadding(0, com.join.mgps.Util.c0.a(MGGameDetailAdapter.this.f43378f, 15.0f), 0, 0);
                    this.f43615c.setTextColor(MGGameDetailAdapter.this.f43378f.getResources().getColorStateList(R.color.app_blue_color));
                    this.f43616d.setVisibility(0);
                    this.f43618f.setOnClickListener(new a(gameVoucherBean));
                } else if (game_coupon_status == 2) {
                    this.f43615c.setTextColor(MGGameDetailAdapter.this.f43378f.getResources().getColorStateList(R.color.gray));
                    this.f43615c.setText(MGGameDetailAdapter.this.f43378f.getString(R.string.voucher_is_get));
                    this.f43616d.setText(MGGameDetailAdapter.this.f43378f.getString(R.string.voucher_detail));
                    this.f43615c.setPadding(0, com.join.mgps.Util.c0.a(MGGameDetailAdapter.this.f43378f, 15.0f), 0, 0);
                    this.f43616d.setVisibility(0);
                    this.f43618f.setOnClickListener(new b());
                } else if (game_coupon_status != 3) {
                } else {
                    this.f43615c.setTextColor(MGGameDetailAdapter.this.f43378f.getResources().getColorStateList(R.color.gray));
                    this.f43616d.setText("看看其他");
                    this.f43615c.setText(MGGameDetailAdapter.this.f43378f.getString(R.string.voucher_get_out));
                    this.f43615c.setPadding(0, com.join.mgps.Util.c0.a(MGGameDetailAdapter.this.f43378f, 15.0f), 0, 0);
                    this.f43618f.setOnClickListener(new c());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentAllListActivity_.H0(MGGameDetailAdapter.this.f43378f).f(MGGameDetailAdapter.this.f43379g.getCrc_sign_id()).i(MGGameDetailAdapter.this.f43379g.getPackage_name()).h(MGGameDetailAdapter.this.f43379g.getPlugin_num()).g(0).j(MGGameDetailAdapter.this.f43379g.getGame_score().getSgc_switch()).a(MGGameDetailAdapter.this.f43379g.getBespeak_switch()).d("0").start();
        }
    }

    /* loaded from: classes4.dex */
    interface u0 {
        void a(Boolean bool);
    }

    /* loaded from: classes4.dex */
    public class u1 {

        /* renamed from: a  reason: collision with root package name */
        LinearLayout f43625a;

        public u1(View view) {
            this.f43625a = (LinearLayout) view.findViewById(R.id.layout_voucher_game_item);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class v implements View.OnClickListener {
        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DetialMoreServiceListActivity_.r0(MGGameDetailAdapter.this.f43378f).a(MGGameDetailAdapter.this.f43379g.getCrc_sign_id()).start();
        }
    }

    /* loaded from: classes4.dex */
    public interface v0 {
        void a(InformationCommentBean informationCommentBean);

        void b(CommentBaseBean commentBaseBean, int i4, int i5);

        void c(CommentBaseBean commentBaseBean, int i4, int i5);

        void d(CommentBaseBean commentBaseBean);

        void e(InformationCommentBean.Sub sub);

        void f(CommentBaseBean commentBaseBean);

        void g();

        void h();

        void i();

        void j();

        void k();
    }

    /* loaded from: classes4.dex */
    public class v1 {

        /* renamed from: a  reason: collision with root package name */
        TextView f43628a;

        /* renamed from: b  reason: collision with root package name */
        TextView f43629b;

        /* renamed from: c  reason: collision with root package name */
        TextView f43630c;

        /* renamed from: d  reason: collision with root package name */
        TextView f43631d;

        public v1() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class w implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f43633b;

        w(CommentBaseBean commentBaseBean) {
            this.f43633b = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v0 v0Var;
            CommentBaseBean commentBaseBean = this.f43633b;
            if (commentBaseBean == null || (v0Var = MGGameDetailAdapter.this.f43397y) == null) {
                return;
            }
            v0Var.d(commentBaseBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class w0 {

        /* renamed from: a  reason: collision with root package name */
        public TextView f43635a;

        /* renamed from: b  reason: collision with root package name */
        public RelativeLayout f43636b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f43637c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f43638d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f43639e;

        /* renamed from: f  reason: collision with root package name */
        public LinearLayout f43640f;

        public w0(View view) {
            this.f43636b = (RelativeLayout) view.findViewById(R.id.forum_post_media_container);
            this.f43635a = (TextView) view.findViewById(R.id.images_count);
            this.f43640f = (LinearLayout) view.findViewById(R.id.viewBottom);
            view.setTag(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class x implements View.OnClickListener {
        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(MGGameDetailAdapter.this.f43378f).getAccountData();
            if (com.join.mgps.Util.g2.h(accountData.getNickname()) || (accountData.getAccount().equals(accountData.getNickname()) && accountData.getAccount().startsWith("pa"))) {
                IntentUtil.getInstance().goChangeNickname(MGGameDetailAdapter.this.f43378f);
            } else if (IntentUtil.getInstance().goLoginInteractive(MGGameDetailAdapter.this.f43378f)) {
            } else {
                if (MGGameDetailAdapter.this.f43379g.getSelf_comment() != null) {
                    CommentAllListBean.SelfCommentBean self_comment = MGGameDetailAdapter.this.f43379g.getSelf_comment();
                    CommentCreatActivity_.w0(MGGameDetailAdapter.this.f43378f).f(MGGameDetailAdapter.this.f43379g.getCrc_sign_id()).j(MGGameDetailAdapter.this.f43379g.getPackage_name()).d("0").c(self_comment.getId()).e(Float.valueOf(self_comment.getStars_score()).floatValue()).a(MGGameDetailAdapter.this.f43379g.getBespeak_switch()).h(MGGameDetailAdapter.this.f43379g.getPlugin_num()).g(0).b(self_comment.getContent()).start();
                    return;
                }
                CommentCreatActivity_.w0(MGGameDetailAdapter.this.f43378f).f(MGGameDetailAdapter.this.f43379g.getCrc_sign_id()).j(MGGameDetailAdapter.this.f43379g.getPackage_name()).h(MGGameDetailAdapter.this.f43379g.getPlugin_num()).g(0).a(MGGameDetailAdapter.this.f43379g.getBespeak_switch()).d("0").start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class x0 {

        /* renamed from: a  reason: collision with root package name */
        public LinearLayout f43643a;

        /* renamed from: b  reason: collision with root package name */
        public View f43644b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f43645c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f43646d;

        /* renamed from: e  reason: collision with root package name */
        public View f43647e;

        /* renamed from: f  reason: collision with root package name */
        public View f43648f;

        /* renamed from: g  reason: collision with root package name */
        public LinearLayout f43649g;

        x0() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class y implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendInfomationBean f43651b;

        y(RecommendInfomationBean recommendInfomationBean) {
            this.f43651b = recommendInfomationBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
                forumPostsBean.setPid(this.f43651b.getPost_id());
                com.join.mgps.Util.j0.v0(MGGameDetailAdapter.this.f43378f, forumPostsBean);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class y0 {

        /* renamed from: a  reason: collision with root package name */
        ViewType f43653a;

        /* renamed from: b  reason: collision with root package name */
        Object f43654b;

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f43659a;

            /* renamed from: b  reason: collision with root package name */
            public String f43660b;

            /* renamed from: c  reason: collision with root package name */
            public String f43661c;

            public b(boolean z4, String str, String str2) {
                this.f43659a = z4;
                this.f43660b = str;
                this.f43661c = str2;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f43662a;

            /* renamed from: b  reason: collision with root package name */
            public int f43663b;

            /* renamed from: c  reason: collision with root package name */
            public int f43664c;

            /* renamed from: d  reason: collision with root package name */
            public String f43665d;

            /* renamed from: e  reason: collision with root package name */
            public String f43666e;

            public c(int i4, int i5, int i6, String str, String str2) {
                this.f43662a = i4;
                this.f43663b = i5;
                this.f43664c = i6;
                this.f43665d = str;
                this.f43666e = str2;
            }
        }

        /* loaded from: classes4.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            List<BannerBean> f43667a;

            public d(List<BannerBean> list) {
                this.f43667a = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class e {

            /* renamed from: a  reason: collision with root package name */
            String f43668a;

            /* renamed from: b  reason: collision with root package name */
            long f43669b;

            /* renamed from: c  reason: collision with root package name */
            String f43670c;

            /* renamed from: d  reason: collision with root package name */
            String f43671d;

            /* renamed from: e  reason: collision with root package name */
            List<BannerBean> f43672e;

            public e(long j4, String str, String str2, List<BannerBean> list, String str3) {
                this.f43669b = j4;
                this.f43670c = str;
                this.f43671d = str2;
                this.f43672e = list;
                this.f43668a = str3;
            }
        }

        /* loaded from: classes4.dex */
        public static class f {

            /* renamed from: a  reason: collision with root package name */
            public int f43673a;

            /* renamed from: b  reason: collision with root package name */
            public List<RecommendAdInfoData> f43674b;

            public f(int i4, List<RecommendAdInfoData> list) {
                this.f43673a = i4;
                this.f43674b = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class g {

            /* renamed from: a  reason: collision with root package name */
            public boolean f43675a;

            public g(boolean z4) {
                this.f43675a = z4;
            }
        }

        /* loaded from: classes4.dex */
        public static class h {

            /* renamed from: a  reason: collision with root package name */
            public boolean f43676a;

            /* renamed from: b  reason: collision with root package name */
            public GiftPackageDataInfoBean f43677b;

            public h(boolean z4, GiftPackageDataInfoBean giftPackageDataInfoBean) {
                this.f43676a = z4;
                this.f43677b = giftPackageDataInfoBean;
            }
        }

        /* loaded from: classes4.dex */
        public static class i {

            /* renamed from: a  reason: collision with root package name */
            public boolean f43678a;

            /* renamed from: b  reason: collision with root package name */
            public Object f43679b;

            /* renamed from: c  reason: collision with root package name */
            public int f43680c;

            public i(boolean z4, int i4, Object obj) {
                this.f43678a = z4;
                this.f43679b = obj;
                this.f43680c = i4;
            }
        }

        /* loaded from: classes4.dex */
        public static class j {

            /* renamed from: a  reason: collision with root package name */
            List<GiftPackageDataInfoBean> f43681a;

            /* renamed from: b  reason: collision with root package name */
            List<ServiceState> f43682b;

            public j(List<GiftPackageDataInfoBean> list, List<ServiceState> list2) {
                this.f43681a = list;
                this.f43682b = list2;
            }
        }

        /* loaded from: classes4.dex */
        public static class k {

            /* renamed from: a  reason: collision with root package name */
            public RecommendInfomationBean f43683a;

            /* renamed from: b  reason: collision with root package name */
            public int f43684b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f43685c;

            public k(boolean z4, int i4, RecommendInfomationBean recommendInfomationBean) {
                this.f43685c = z4;
                this.f43684b = i4;
                this.f43683a = recommendInfomationBean;
            }
        }

        /* loaded from: classes4.dex */
        public static class l {

            /* renamed from: a  reason: collision with root package name */
            String f43686a;

            /* renamed from: b  reason: collision with root package name */
            int f43687b;

            /* renamed from: c  reason: collision with root package name */
            long f43688c;

            public l(String str, int i4, long j4) {
                this.f43686a = str;
                this.f43687b = i4;
                this.f43688c = j4;
            }
        }

        /* loaded from: classes4.dex */
        public static class n {

            /* renamed from: a  reason: collision with root package name */
            List<GameDetialStrategyTag> f43691a;

            public n(List<GameDetialStrategyTag> list) {
                this.f43691a = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class o {

            /* renamed from: a  reason: collision with root package name */
            DetialIntentBean f43692a;

            /* renamed from: b  reason: collision with root package name */
            String f43693b;

            public o(DetialIntentBean detialIntentBean, String str) {
                this.f43692a = detialIntentBean;
                this.f43693b = str;
            }
        }

        /* loaded from: classes4.dex */
        public static class p {

            /* renamed from: a  reason: collision with root package name */
            public List<GamePromptBean> f43694a;

            public p(List<GamePromptBean> list) {
                this.f43694a = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class q {

            /* renamed from: a  reason: collision with root package name */
            public int f43695a;

            /* renamed from: b  reason: collision with root package name */
            public List<RecommendGameBean> f43696b;

            public q(int i4, List<RecommendGameBean> list) {
                this.f43695a = i4;
                this.f43696b = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class r {

            /* renamed from: a  reason: collision with root package name */
            public String f43697a;

            /* renamed from: b  reason: collision with root package name */
            public InformationCommentBean f43698b;

            /* renamed from: c  reason: collision with root package name */
            public int f43699c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f43700d;

            /* renamed from: e  reason: collision with root package name */
            public int f43701e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f43702f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f43703g;

            public r(String str, InformationCommentBean informationCommentBean, int i4, boolean z4) {
                this.f43697a = str;
                this.f43698b = informationCommentBean;
                this.f43699c = i4;
                this.f43700d = z4;
            }
        }

        /* loaded from: classes4.dex */
        public static class s {

            /* renamed from: a  reason: collision with root package name */
            public String f43704a;

            /* renamed from: b  reason: collision with root package name */
            public String f43705b;

            /* renamed from: c  reason: collision with root package name */
            public ArrayList<TipBean> f43706c;

            /* renamed from: d  reason: collision with root package name */
            public int f43707d;

            /* renamed from: e  reason: collision with root package name */
            public int f43708e;

            /* renamed from: f  reason: collision with root package name */
            public String f43709f;

            /* renamed from: g  reason: collision with root package name */
            public String f43710g;

            /* renamed from: h  reason: collision with root package name */
            public List<GameDetialBookTag> f43711h;

            /* renamed from: i  reason: collision with root package name */
            public String f43712i;

            /* renamed from: j  reason: collision with root package name */
            public int f43713j;

            /* renamed from: k  reason: collision with root package name */
            public int f43714k;

            /* renamed from: l  reason: collision with root package name */
            public int f43715l;

            public s(String str, String str2, ArrayList<TipBean> arrayList, int i4, int i5, String str3, String str4, int i6, int i7, String str5, List<GameDetialBookTag> list, int i8) {
                this.f43704a = str;
                this.f43705b = str2;
                this.f43706c = arrayList;
                this.f43707d = i4;
                this.f43708e = i5;
                this.f43709f = str3;
                this.f43710g = str4;
                this.f43713j = i6;
                this.f43714k = i7;
                this.f43712i = str5;
                this.f43711h = list;
                this.f43715l = i8;
            }
        }

        /* loaded from: classes4.dex */
        public static class t {

            /* renamed from: a  reason: collision with root package name */
            public int f43716a;

            /* renamed from: b  reason: collision with root package name */
            public String f43717b;

            public t(int i4, String str) {
                this.f43716a = i4;
                this.f43717b = str;
            }
        }

        /* loaded from: classes4.dex */
        public static class u {

            /* renamed from: a  reason: collision with root package name */
            public String f43718a;

            /* renamed from: b  reason: collision with root package name */
            public List<DetialShowImageBean> f43719b;

            /* renamed from: c  reason: collision with root package name */
            public int f43720c;

            /* renamed from: d  reason: collision with root package name */
            public String f43721d;

            public u(String str, List<DetialShowImageBean> list, int i4, String str2) {
                this.f43718a = str;
                this.f43719b = list;
                this.f43720c = i4;
                this.f43721d = str2;
            }
        }

        /* loaded from: classes4.dex */
        public static class v {

            /* renamed from: a  reason: collision with root package name */
            public boolean f43722a;

            /* renamed from: b  reason: collision with root package name */
            public GameVoucherBean f43723b;

            public v(boolean z4, GameVoucherBean gameVoucherBean) {
                this.f43722a = z4;
                this.f43723b = gameVoucherBean;
            }
        }

        /* loaded from: classes4.dex */
        public static class w {

            /* renamed from: a  reason: collision with root package name */
            public String f43724a;

            /* renamed from: b  reason: collision with root package name */
            public String f43725b;

            /* renamed from: c  reason: collision with root package name */
            public int f43726c;

            public w(String str, String str2, int i4) {
                this.f43724a = str;
                this.f43725b = str2;
                this.f43726c = i4;
            }
        }

        public y0() {
        }

        public Object a() {
            return this.f43654b;
        }

        public ViewType b() {
            return this.f43653a;
        }

        public void c(Object obj) {
            this.f43654b = obj;
        }

        public void d(ViewType viewType) {
            this.f43653a = viewType;
        }

        public y0(ViewType viewType, Object obj) {
            this.f43653a = viewType;
            this.f43654b = obj;
        }

        /* loaded from: classes4.dex */
        public static class m {

            /* renamed from: a  reason: collision with root package name */
            GameDetialStrategyItem f43689a;

            /* renamed from: b  reason: collision with root package name */
            boolean f43690b;

            public m(GameDetialStrategyItem gameDetialStrategyItem) {
                this.f43690b = false;
                this.f43689a = gameDetialStrategyItem;
            }

            public m(GameDetialStrategyItem gameDetialStrategyItem, boolean z4) {
                this.f43690b = false;
                this.f43689a = gameDetialStrategyItem;
                this.f43690b = z4;
            }
        }

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f43655a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f43656b;

            /* renamed from: c  reason: collision with root package name */
            public GameCommitListBean.GameCommitList f43657c;

            /* renamed from: d  reason: collision with root package name */
            public CommentBaseBean f43658d;

            public a(boolean z4, GameCommitListBean.GameCommitList gameCommitList, boolean z5) {
                this.f43655a = z4;
                this.f43656b = z5;
                this.f43657c = gameCommitList;
            }

            public a(boolean z4, CommentBaseBean commentBaseBean, boolean z5) {
                this.f43655a = z4;
                this.f43656b = z5;
                this.f43658d = commentBaseBean;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class z implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameDetialStrategyItem f43727b;

        z(GameDetialStrategyItem gameDetialStrategyItem) {
            this.f43727b = gameDetialStrategyItem;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
                forumPostsBean.setPid(this.f43727b.getId());
                com.join.mgps.Util.j0.v0(MGGameDetailAdapter.this.f43378f, forumPostsBean);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class z0 {

        /* renamed from: a  reason: collision with root package name */
        RelativeLayout f43729a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f43730b;

        /* renamed from: c  reason: collision with root package name */
        ImageView f43731c;

        /* renamed from: d  reason: collision with root package name */
        TextView f43732d;

        /* renamed from: e  reason: collision with root package name */
        TextView f43733e;

        /* renamed from: f  reason: collision with root package name */
        TextView f43734f;

        /* renamed from: g  reason: collision with root package name */
        TextView f43735g;

        /* renamed from: h  reason: collision with root package name */
        VipView f43736h;

        /* renamed from: i  reason: collision with root package name */
        public View f43737i;

        public z0() {
        }
    }

    public MGGameDetailAdapter(Context context, DetailResultBeanV3 detailResultBeanV3, Handler handler, RelativeLayout relativeLayout, List<y0> list) {
        this.f43378f = context;
        this.f43379g = detailResultBeanV3;
        this.f43389q = handler;
        this.f43377e = relativeLayout;
        this.f43391s = list;
        this.f43387o = context.getResources().getDrawable(R.drawable.game_detail_ok);
        this.f43388p = this.f43378f.getResources().getDrawable(R.drawable.game_detail_warn);
        Drawable drawable = this.f43387o;
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), this.f43387o.getMinimumHeight());
        this.f43388p.setBounds(0, 0, this.f43387o.getMinimumWidth(), this.f43387o.getMinimumHeight());
        this.f43374b = detailResultBeanV3.getBackground_color();
        this.f43375c = detailResultBeanV3.getSp_tpl_two_position();
        this.f43393u = new h0();
    }

    private View A(int i4, View view, ViewGroup viewGroup) {
        View view2;
        i1 i1Var;
        y0.o oVar = (y0.o) getItem(i4);
        DetialIntentBean detialIntentBean = oVar.f43692a;
        if (view == null) {
            i1Var = new i1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_gifts_top, (ViewGroup) null);
            i1Var.f43484b = (TextView) view2.findViewById(R.id.titleText);
            i1Var.f43485c = (LinearLayout) view2.findViewById(R.id.look_other);
            X(view2.findViewById(R.id.backLayout));
            if (this.f43375c == 0) {
                i1Var.f43484b.setTextColor(-1);
                ((TextView) view2.findViewById(R.id.moreText)).setTextColor(-10592674);
                view2.findViewById(R.id.line_h).setVisibility(8);
            }
            view2.setTag(i1Var);
        } else {
            view2 = view;
            i1Var = (i1) view.getTag();
        }
        if (detialIntentBean == null) {
            i1Var.f43485c.setVisibility(8);
        } else {
            i1Var.f43485c.setVisibility(0);
        }
        i1Var.f43484b.setText(oVar.f43693b);
        i1Var.f43485c.setOnClickListener(new t(detialIntentBean));
        return view2;
    }

    private View B(int i4, View view, ViewGroup viewGroup) {
        View view2;
        m1 m1Var;
        if (view == null) {
            m1Var = new m1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_message, (ViewGroup) null);
            m1Var.f43544a = (LinearLayout) view2.findViewById(R.id.itemLayout);
            m1Var.f43545b = view2.findViewById(R.id.itemLine);
            m1Var.f43546c = (LinearLayout) view2.findViewById(R.id.messageLayoutMain);
            m1Var.f43547d = (ImageView) view2.findViewById(R.id.moreImage);
            X((LinearLayout) view2.findViewById(R.id.backLayout));
            view2.setTag(m1Var);
        } else {
            view2 = view;
            m1Var = (m1) view.getTag();
        }
        List<GamePromptBean> list = ((y0.p) getItem(i4)).f43694a;
        if (list != null && list.size() > 0) {
            m1Var.f43544a.setVisibility(0);
            m1Var.f43545b.setVisibility(0);
            m1Var.f43547d.setOnClickListener(new a0());
            if (this.f43375c == 0) {
                m1Var.f43545b.setVisibility(8);
            }
            m1Var.f43544a.removeAllViewsInLayout();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(36, 0, 0, 0);
            layoutParams.gravity = 19;
            for (int i5 = 0; i5 < list.size(); i5++) {
                GamePromptBean gamePromptBean = list.get(i5);
                if (gamePromptBean != null) {
                    TextView textView = new TextView(this.f43378f);
                    textView.setText(gamePromptBean.getText().toString());
                    if (gamePromptBean.getId() == 1) {
                        textView.setCompoundDrawables(this.f43387o, null, null, null);
                    } else {
                        textView.setCompoundDrawables(this.f43388p, null, null, null);
                    }
                    textView.setCompoundDrawablePadding(10);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 10.0f);
                    textView.setTextColor(-8355712);
                    m1Var.f43544a.addView(textView, layoutParams);
                }
            }
        } else {
            m1Var.f43544a.setVisibility(8);
            m1Var.f43545b.setVisibility(8);
        }
        m1Var.f43546c.removeAllViewsInLayout();
        RelativeLayout relativeLayout = this.f43377e;
        if (relativeLayout != null) {
            m1Var.f43546c.addView(relativeLayout);
        }
        return view2;
    }

    private View C(int i4, View view, ViewGroup viewGroup) {
        View view2;
        n1 n1Var;
        String str = (String) getItem(i4);
        if (view == null) {
            n1Var = new n1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.detial_null_item, (ViewGroup) null);
            n1Var.f43558a = (TextView) view2.findViewById(R.id.itemNul);
            view2.setTag(n1Var);
        } else {
            view2 = view;
            n1Var = (n1) view.getTag();
        }
        if (this.f43375c == 0) {
            X(n1Var.f43558a);
        } else if ("1".equals(str)) {
            n1Var.f43558a.setBackgroundColor(0);
        } else {
            n1Var.f43558a.setBackgroundColor(-1);
        }
        return view2;
    }

    private View D(int i4, View view, ViewGroup viewGroup) {
        View view2;
        o1 o1Var;
        if (view == null) {
            o1Var = new o1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_recommend, (ViewGroup) null);
            o1Var.f43564b = (MyGridView) view2.findViewById(R.id.recomListView);
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.layoutContent);
            o1Var.f43563a = linearLayout;
            X(linearLayout);
            if (this.f43375c == 0) {
                view2.findViewById(R.id.line_h).setVisibility(8);
            }
            view2.setTag(o1Var);
        } else {
            view2 = view;
            o1Var = (o1) view.getTag();
        }
        y0.q qVar = (y0.q) getItem(i4);
        int i5 = qVar.f43695a;
        if (i5 == 0) {
            o1Var.f43563a.setVisibility(8);
        } else if (i5 == 1) {
            o1Var.f43563a.setVisibility(0);
            com.join.mgps.adapter.v0 v0Var = new com.join.mgps.adapter.v0(this.f43378f, this.f43390r);
            o1Var.f43564b.setAdapter((ListAdapter) v0Var);
            List<RecommendGameBean> list = qVar.f43696b;
            if (list != null && list.size() > 0) {
                this.f43390r.clear();
                this.f43390r.addAll(qVar.f43696b);
                v0Var.notifyDataSetChanged();
            }
        } else {
            o1Var.f43563a.setVisibility(8);
        }
        return view2;
    }

    private View E(int i4, View view, ViewGroup viewGroup) {
        x0 x0Var;
        y0.r rVar;
        try {
            if (view != null) {
                x0Var = (x0) view.getTag();
            } else {
                x0Var = new x0();
                view = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_game_comment_activity_item_comment_message_reply, (ViewGroup) null);
                x0Var.f43649g = (LinearLayout) view.findViewById(R.id.parentLayout);
                x0Var.f43643a = (LinearLayout) view.findViewById(R.id.comment_reply_container);
                x0Var.f43644b = view.findViewById(R.id.comment_reply_divider);
                x0Var.f43645c = (TextView) view.findViewById(R.id.comment_reply_content);
                x0Var.f43646d = (TextView) view.findViewById(R.id.comment_reply_more);
                x0Var.f43647e = view.findViewById(R.id.line);
                x0Var.f43648f = view.findViewById(R.id.bottom);
                X(x0Var.f43649g);
                view.setTag(x0Var);
            }
            rVar = (y0.r) getItem(i4);
            if (this.f43375c == 0) {
                x0Var.f43644b.setBackgroundColor(-13290187);
                x0Var.f43647e.setBackgroundColor(-13290187);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (rVar == null || rVar.f43698b == null) {
            return view;
        }
        if (rVar.f43700d) {
            x0Var.f43644b.setVisibility(0);
        } else {
            x0Var.f43644b.setVisibility(8);
        }
        if (!rVar.f43703g) {
            x0Var.f43647e.setVisibility(0);
            x0Var.f43648f.setVisibility(0);
        } else {
            x0Var.f43647e.setVisibility(8);
            x0Var.f43648f.setVisibility(8);
        }
        x0Var.f43643a.removeAllViews();
        return view;
    }

    private View F(int i4, View view, ViewGroup viewGroup) {
        p1 p1Var;
        y0.l lVar = (y0.l) getItem(i4);
        String str = lVar.f43686a;
        if (view == null) {
            view = LayoutInflater.from(this.f43378f).inflate(R.layout.game_detial_service_item_layout, (ViewGroup) null);
            p1Var = new p1();
            p1Var.f43570a = (TextView) view.findViewById(R.id.message);
            p1Var.f43571b = (TextView) view.findViewById(R.id.messageType);
            p1Var.f43572c = (TextView) view.findViewById(R.id.date);
            p1Var.f43573d = (TextView) view.findViewById(R.id.dateMorning);
            X(view.findViewById(R.id.backLayout));
            if (this.f43375c == 0) {
                view.findViewById(R.id.line).setVisibility(8);
            }
            view.setTag(p1Var);
        } else {
            p1Var = (p1) view.getTag();
        }
        if (this.f43375c == 0) {
            p1Var.f43571b.setBackgroundDrawable(com.join.mgps.Util.k2.d(this.f43378f, "#3ca4fd", 2));
            p1Var.f43571b.setTextColor(Color.parseColor("#3ca4fd"));
        } else {
            p1Var.f43571b.setBackgroundDrawable(com.join.mgps.Util.k2.a(this.f43378f, "#3ca4fd"));
        }
        p1Var.f43571b.setVisibility(0);
        if (lVar.f43687b == 1) {
            p1Var.f43571b.setText("开服");
        } else {
            p1Var.f43571b.setText("合服");
        }
        p1Var.f43570a.setText(str);
        p1Var.f43572c.setText(com.join.mgps.Util.y.l(lVar.f43688c));
        String i5 = com.join.mgps.Util.y.i(lVar.f43688c);
        String str2 = "上午";
        if (com.join.mgps.Util.g2.i(i5)) {
            int parseInt = Integer.parseInt(i5);
            if (parseInt > 12) {
                str2 = "下午" + (parseInt - 12) + "点";
            } else {
                str2 = "上午" + parseInt + "点";
            }
        }
        p1Var.f43573d.setText(str2);
        return view;
    }

    private View G(int i4, View view, ViewGroup viewGroup) {
        w0 w0Var;
        GameDetialStrategyItem gameDetialStrategyItem = ((y0.m) getItem(i4)).f43689a;
        if (view == null) {
            view = LayoutInflater.from(this.f43378f).inflate(R.layout.game_detial_item_strategy_itemimage3, (ViewGroup) null);
            w0Var = new w0(view);
            w0Var.f43637c = (TextView) view.findViewById(R.id.pubtime);
            w0Var.f43638d = (TextView) view.findViewById(R.id.pv);
            w0Var.f43639e = (TextView) view.findViewById(R.id.uv);
            w0Var.f43639e = (TextView) view.findViewById(R.id.uv);
            X(view.findViewById(R.id.forum_post_media_container));
            X(view.findViewById(R.id.viewBottom));
            if (this.f43375c == 0) {
                w0Var.f43637c.setTextColor(-10592674);
                w0Var.f43638d.setTextColor(-10592674);
                w0Var.f43639e.setTextColor(-10592674);
                view.findViewById(R.id.line).setVisibility(8);
            }
        } else {
            w0Var = (w0) view.getTag();
        }
        try {
            TextView textView = w0Var.f43638d;
            textView.setText(gameDetialStrategyItem.getCommit() + "");
            TextView textView2 = w0Var.f43639e;
            textView2.setText(gameDetialStrategyItem.getView() + "");
            w0Var.f43637c.setText(com.join.android.app.common.utils.g.b(gameDetialStrategyItem.getAdd_time()));
            R(w0Var.f43636b, gameDetialStrategyItem);
            int id = gameDetialStrategyItem.getId();
            a0(view, id);
            a0(w0Var.f43636b, id);
            a0(w0Var.f43636b, id);
            a0(w0Var.f43640f, id);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    private View H(int i4, View view, ViewGroup viewGroup) {
        e1 e1Var;
        y0.n nVar = (y0.n) getItem(i4);
        if (view == null) {
            view = LayoutInflater.from(this.f43378f).inflate(R.layout.forum_strategy_tag_grid, (ViewGroup) null);
            e1Var = new e1(view);
            X(view.findViewById(R.id.group));
            view.findViewById(R.id.line).setVisibility(8);
        } else {
            e1Var = (e1) view.getTag();
        }
        if (e1Var == null) {
            return view;
        }
        m(e1Var, nVar);
        return view;
    }

    private View I(int i4, View view, ViewGroup viewGroup) {
        View view2;
        k1 k1Var;
        if (view == null) {
            k1Var = new k1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_infomation_item, (ViewGroup) null);
            k1Var.f43513b = (SimpleDraweeView) view2.findViewById(R.id.informationImage);
            k1Var.f43514c = (TextView) view2.findViewById(R.id.informationTv);
            k1Var.f43515d = (TextView) view2.findViewById(R.id.pubtime);
            k1Var.f43519h = (TextView) view2.findViewById(R.id.messageType);
            k1Var.f43512a = (LinearLayout) view2.findViewById(R.id.layoutInformation);
            k1Var.f43516e = (LinearLayout) view2.findViewById(R.id.informationTitle);
            k1Var.f43517f = (LinearLayout) view2.findViewById(R.id.layoutTop);
            k1Var.f43518g = view2.findViewById(R.id.line_h);
            X(view2.findViewById(R.id.layoutInformation));
            if (this.f43375c == 0) {
                k1Var.f43514c.setTextColor(-7434610);
                k1Var.f43515d.setTextColor(-10592674);
                k1Var.f43518g.setVisibility(8);
            }
            view2.setTag(k1Var);
        } else {
            view2 = view;
            k1Var = (k1) view.getTag();
        }
        y0.m mVar = (y0.m) getItem(i4);
        GameDetialStrategyItem gameDetialStrategyItem = mVar.f43689a;
        if (gameDetialStrategyItem.getTag_name() != null) {
            k1Var.f43519h.setText(gameDetialStrategyItem.getTag_name().getTitle());
            if (com.join.mgps.Util.g2.i(gameDetialStrategyItem.getTag_name().getTitle())) {
                GameDetialBookTag tag_name = gameDetialStrategyItem.getTag_name();
                if (tag_name != null) {
                    if (com.join.mgps.Util.g2.h(tag_name.getColor())) {
                        tag_name.setColor("#8dbbec");
                    }
                    if (this.f43375c == 0) {
                        k1Var.f43519h.setBackgroundDrawable(com.join.mgps.Util.k2.d(this.f43378f, gameDetialStrategyItem.getTag_name().getColor(), gameDetialStrategyItem.getTag_name().getTitle().length()));
                        k1Var.f43519h.setTextColor(Color.parseColor(gameDetialStrategyItem.getTag_name().getColor()));
                    } else {
                        TextView textView = k1Var.f43519h;
                        Context context = this.f43378f;
                        textView.setBackgroundDrawable(com.join.mgps.Util.k2.a(context, gameDetialStrategyItem.getTag_name().getColor() + ""));
                    }
                }
                k1Var.f43519h.setVisibility(0);
            } else {
                k1Var.f43519h.setVisibility(8);
            }
        }
        if (mVar.f43690b) {
            k1Var.f43515d.setVisibility(8);
        } else {
            k1Var.f43515d.setVisibility(0);
        }
        k1Var.f43515d.setText(com.join.android.app.common.utils.g.b(gameDetialStrategyItem.getAdd_time()));
        k1Var.f43514c.setText(gameDetialStrategyItem.getSubject());
        k1Var.f43512a.setOnClickListener(new z(gameDetialStrategyItem));
        return view2;
    }

    private View K(int i4, View view, ViewGroup viewGroup) {
        View view2;
        q1 q1Var;
        if (view == null) {
            q1Var = new q1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_title, (ViewGroup) null);
            q1Var.f43579a = (SimpleDraweeView) view2.findViewById(R.id.appIcon);
            q1Var.f43580b = (TextView) view2.findViewById(R.id.appName);
            q1Var.f43581c = (LinearLayout) view2.findViewById(R.id.tipsLayout);
            q1Var.f43582d = (TextView) view2.findViewById(R.id.appDownloadCount);
            q1Var.f43584f = (TextView) view2.findViewById(R.id.appCompany);
            q1Var.f43583e = (TextView) view2.findViewById(R.id.appSize);
            q1Var.f43587i = (SimpleDraweeView) view2.findViewById(R.id.gameInfoLayout);
            q1Var.f43588j = (LinearLayout) view2.findViewById(R.id.titleMoreLayout);
            q1Var.f43585g = (LinearLayout) view2.findViewById(R.id.titleMoreTip);
            q1Var.f43586h = (Button) view2.findViewById(R.id.titleMoreBookButn);
            q1Var.f43589k = (Button) view2.findViewById(R.id.gameFollowButn);
            q1Var.f43590l = (LinearLayout) view2.findViewById(R.id.titlelayout);
            q1Var.f43591m = (TextView) view2.findViewById(R.id.textNullToTwo);
            q1Var.f43592n = (HorizontalScrollView) view2.findViewById(R.id.scrollView);
            view2.setTag(q1Var);
        } else {
            view2 = view;
            q1Var = (q1) view.getTag();
        }
        y0.s sVar = (y0.s) getItem(i4);
        q1Var.f43589k.setOnClickListener(new e0());
        q1Var.f43586h.setOnClickListener(new f0());
        if (sVar.f43715l == 1) {
            List<GameDetialBookTag> list = sVar.f43711h;
            if (list != null && list.size() > 0) {
                UtilsMy.w(sVar.f43711h, q1Var.f43585g, this.f43378f);
            }
            q1Var.f43588j.setVisibility(0);
            q1Var.f43590l.setBackgroundColor(16777215);
        } else {
            q1Var.f43588j.setVisibility(8);
            q1Var.f43590l.setBackgroundColor(-1);
        }
        q1Var.f43589k.setBackgroundResource(R.drawable.recom_blue_butn);
        q1Var.f43589k.setTextColor(this.f43378f.getResources().getColor(R.color.app_blue_color));
        if (this.f43375c == 0) {
            q1Var.f43587i.setVisibility(0);
            q1Var.f43580b.setTextColor(-1);
            MyImageLoader.d(q1Var.f43587i, R.drawable.arena_dialog_bg, sVar.f43712i);
            q1Var.f43591m.setVisibility(0);
            q1Var.f43588j.setBackgroundColor(0);
            q1Var.f43590l.setBackgroundColor(0);
            q1Var.f43589k.setBackgroundResource(R.drawable.detial_white_stroke_butn);
            q1Var.f43589k.setTextColor(-1);
            ArrayList<TipBean> arrayList = sVar.f43706c;
            if (arrayList != null && arrayList.size() > 0) {
                q1Var.f43592n.setVisibility(0);
            } else {
                q1Var.f43592n.setVisibility(8);
            }
        } else {
            q1Var.f43587i.setVisibility(8);
            q1Var.f43591m.setVisibility(8);
            q1Var.f43588j.setBackgroundColor(-1);
            if (sVar.f43715l == 1) {
                q1Var.f43580b.setTextColor(-1);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) q1Var.f43587i.getLayoutParams();
                int h4 = (int) (com.join.android.app.common.utils.n.n(this.f43378f).h(this.f43378f) * 253.0f);
                com.join.mgps.Util.v0.d("sssss", h4 + "");
                layoutParams.height = h4;
                q1Var.f43587i.setLayoutParams(layoutParams);
                q1Var.f43587i.setVisibility(0);
                q1Var.f43590l.setBackgroundColor(0);
                q1Var.f43588j.setBackgroundColor(0);
                q1Var.f43589k.setBackgroundResource(R.drawable.detial_white_stroke_butn);
                q1Var.f43589k.setTextColor(-1);
                MyImageLoader.d(q1Var.f43587i, R.drawable.arena_dialog_bg, sVar.f43712i);
            } else {
                q1Var.f43590l.setBackgroundColor(-1);
            }
        }
        if (sVar.f43713j == 1) {
            q1Var.f43589k.setText("已收藏");
        } else {
            q1Var.f43589k.setText("收藏");
        }
        if (sVar.f43714k == 1) {
            q1Var.f43586h.setText("已预约");
            q1Var.f43586h.setEnabled(false);
        } else {
            q1Var.f43586h.setText("预约");
        }
        MyImageLoader.h(q1Var.f43579a, sVar.f43704a);
        if (sVar.f43705b != null) {
            q1Var.f43580b.setText(sVar.f43705b + "");
        }
        UtilsMy.I(this.f43379g.getScore(), this.f43379g.getDown_count(), this.f43379g.getSize(), this.f43379g.getSp_tag_info(), this.f43379g.getTag_info(), q1Var.f43581c, this.f43378f);
        int i5 = sVar.f43707d;
        if (i5 <= 0) {
            i5 = sVar.f43708e;
        }
        if (sVar.f43715l == 1) {
            q1Var.f43581c.setVisibility(8);
            if (this.f43379g.getBespeak_count() == null) {
                q1Var.f43582d.setText("0人预约");
            } else {
                q1Var.f43582d.setText(this.f43379g.getBespeak_count() + "人预约");
            }
        } else {
            q1Var.f43581c.setVisibility(4);
            if (i5 >= 100000) {
                q1Var.f43582d.setText((i5 / 10000) + "万热度");
            } else if (i5 >= 10000) {
                StringBuilder sb = new StringBuilder();
                double round = Math.round(i5 / 1000);
                Double.isNaN(round);
                sb.append(round / 10.0d);
                sb.append("万");
                String sb2 = sb.toString();
                q1Var.f43582d.setText(sb2 + "热度");
            } else {
                q1Var.f43582d.setText(i5 + "热度");
            }
        }
        q1Var.f43584f.setText(sVar.f43709f);
        if (sVar.f43710g != null) {
            q1Var.f43583e.setText(sVar.f43710g + "M");
        }
        return view2;
    }

    private View L(int i4, View view, ViewGroup viewGroup) {
        View view2;
        r1 r1Var;
        if (view == null) {
            r1Var = new r1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_update, (ViewGroup) null);
            r1Var.f43598a = (RelativeLayout) view2.findViewById(R.id.giftsLayout);
            r1Var.f43599b = (TextView) view2.findViewById(R.id.giftsTitle);
            r1Var.f43600c = (ImageView) view2.findViewById(R.id.arrowImage);
            r1Var.f43601d = view2.findViewById(R.id.lineUpdate);
            view2.setTag(r1Var);
        } else {
            view2 = view;
            r1Var = (r1) view.getTag();
        }
        y0.t tVar = (y0.t) getItem(i4);
        if (tVar.f43716a == 1) {
            r1Var.f43598a.setVisibility(0);
            r1Var.f43601d.setVisibility(0);
            r1Var.f43599b.setText("更新记录");
            r1Var.f43598a.setOnClickListener(new c0(tVar));
        } else {
            r1Var.f43598a.setVisibility(8);
            r1Var.f43601d.setVisibility(8);
        }
        return view2;
    }

    private View M(int i4, View view, ViewGroup viewGroup) {
        View view2;
        s1 s1Var;
        if (view == null) {
            s1Var = new s1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_viewpage, (ViewGroup) null);
            s1Var.f43607a = (HListView) view2.findViewById(R.id.screenListView);
            X((LinearLayout) view2.findViewById(R.id.backLayout));
            view2.setTag(s1Var);
        } else {
            view2 = view;
            s1Var = (s1) view.getTag();
        }
        y0.u uVar = (y0.u) getItem(i4);
        if (this.f43381i.size() == 0) {
            if (com.join.mgps.Util.g2.i(uVar.f43718a) && uVar.f43719b == null) {
                s1Var.f43607a.setVisibility(8);
            } else {
                if (com.join.mgps.Util.g2.i(uVar.f43718a)) {
                    this.f43381i.add(uVar.f43718a);
                    this.f43382j = true;
                } else {
                    this.f43382j = false;
                }
                if (uVar.f43719b != null) {
                    for (int i5 = 0; i5 < uVar.f43719b.size(); i5++) {
                        this.f43381i.add(uVar.f43719b.get(i5).getRemote().getPath());
                    }
                }
                if (this.f43381i.size() == 0) {
                    s1Var.f43607a.setVisibility(8);
                } else {
                    s1Var.f43607a.setVisibility(0);
                    s1Var.f43607a.setAdapter((ListAdapter) new com.join.mgps.adapter.o0(this.f43378f, uVar.f43720c, this.f43381i, this.f43382j));
                    s1Var.f43607a.setOnItemClickListener(new d0(uVar));
                }
            }
        }
        return view2;
    }

    private View N(int i4, View view, ViewGroup viewGroup) {
        t1 t1Var;
        if (view == null) {
            view = LayoutInflater.from(this.f43378f).inflate(R.layout.layout_voucher_game_detail, (ViewGroup) null);
            t1Var = new t1(view);
            view.setTag(t1Var);
        } else {
            t1Var = (t1) view.getTag();
        }
        y0.v vVar = (y0.v) getItem(i4);
        if (vVar.f43722a) {
            t1Var.a(vVar.f43723b);
            t1Var.f43617e.setVisibility(0);
        } else {
            t1Var.f43617e.setVisibility(8);
        }
        return view;
    }

    private View O(int i4, View view, ViewGroup viewGroup) {
        View view2;
        v1 v1Var;
        if (view == null) {
            v1Var = new v1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_web, (ViewGroup) null);
            v1Var.f43628a = (TextView) view2.findViewById(R.id.htmlEditRecommend);
            v1Var.f43629b = (TextView) view2.findViewById(R.id.htmlGameDescribe);
            v1Var.f43631d = (TextView) view2.findViewById(R.id.htmlGameDescribeShort);
            v1Var.f43630c = (TextView) view2.findViewById(R.id.textMore);
            X((RelativeLayout) view2.findViewById(R.id.backLayout));
            if (this.f43375c == 0) {
                view2.findViewById(R.id.lineView).setVisibility(8);
            }
            view2.setTag(v1Var);
        } else {
            view2 = view;
            v1Var = (v1) view.getTag();
        }
        y0.w wVar = (y0.w) getItem(i4);
        v1Var.f43628a.setText(wVar.f43724a);
        if (wVar.f43725b != null) {
            v1Var.f43629b.setVisibility(0);
            v1Var.f43629b.setText(wVar.f43725b);
            v1Var.f43631d.setText(wVar.f43725b);
            v1Var.f43631d.setVisibility(0);
            v1Var.f43629b.setVisibility(8);
            v1Var.f43631d.setMaxLines(2);
            this.f43395w = v1Var.f43629b;
            this.f43396x = v1Var.f43631d;
        }
        return view2;
    }

    private void Q(View view, y0.r rVar, boolean z4, int i4) {
        View view2;
        int i5;
        boolean z5;
        int i6;
        int i7;
        String str = rVar.f43697a;
        int i8 = rVar.f43701e;
        boolean z6 = rVar.f43702f;
        InformationCommentBean informationCommentBean = rVar.f43698b;
        List<InformationCommentBean.Sub> sub = informationCommentBean.getSub();
        LinearLayout linearLayout = (LinearLayout) view;
        linearLayout.removeAllViews();
        int size = sub.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size + 1) {
            if (i10 <= 3 || !z4) {
                View inflate = LayoutInflater.from(this.f43378f).inflate(R.layout.comment_reply_item, (ViewGroup) null);
                inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                TextView textView = (TextView) inflate.findViewById(R.id.comment_reply_content);
                TextView textView2 = (TextView) inflate.findViewById(R.id.comment_reply_more);
                if ((i10 != size || size <= 3) && !(i8 > 0 && z6 && i10 == size)) {
                    view2 = inflate;
                    i5 = i8;
                    z5 = z6;
                    i6 = i10;
                    if (i6 == 3 && z4 && size > 3) {
                        textView.setVisibility(8);
                        textView2.setVisibility(0);
                        textView2.setText(textView2.getResources().getString(R.string.comment_item_content_more, Integer.valueOf(size - 3)));
                        i7 = size;
                        view2.setOnClickListener(new m0(size, informationCommentBean, str, rVar, i4));
                    } else {
                        i7 = size;
                        if (i6 < i7 && (i6 < 3 || !z4)) {
                            textView.setVisibility(0);
                            textView2.setVisibility(8);
                            InformationCommentBean.Sub sub2 = sub.get(i6);
                            String content = sub2.getContent();
                            sub2.getComment_id();
                            try {
                                textView.setText(Html.fromHtml(content));
                                Z(view2, sub2);
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                            linearLayout.addView(view2);
                        }
                    }
                } else {
                    textView.setVisibility(8);
                    textView2.setVisibility(i9);
                    textView2.setText("收起");
                    int i11 = i8;
                    view2 = inflate;
                    i5 = i8;
                    i6 = i10;
                    z5 = z6;
                    view2.setOnClickListener(new l0(i11, i4, str, rVar));
                    i7 = size;
                }
                linearLayout.addView(view2);
            } else {
                i5 = i8;
                z5 = z6;
                i6 = i10;
                i7 = size;
            }
            i10 = i6 + 1;
            size = i7;
            i8 = i5;
            z6 = z5;
            i9 = 0;
        }
    }

    private void R(RelativeLayout relativeLayout, GameDetialStrategyItem gameDetialStrategyItem) {
        gameDetialStrategyItem.getPic_list();
        if (this.f43392t == null) {
            this.f43392t = J();
        }
        String[] pic_list = gameDetialStrategyItem.getPic_list();
        int[] iArr = {R.id.img_m_1, R.id.img_m_2, R.id.img_m_3};
        for (int i4 = 0; i4 < 3; i4++) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) relativeLayout.findViewById(iArr[i4]);
            if (i4 >= gameDetialStrategyItem.getPic_list().length) {
                simpleDraweeView.setVisibility(8);
            } else {
                W(simpleDraweeView, i4, gameDetialStrategyItem.getPic_list()[i4], i4 + 0, pic_list);
            }
        }
    }

    private void X(View view) {
        if (this.f43375c == 0) {
            view.setBackgroundColor(1275068416);
        }
    }

    private void Z(View view, InformationCommentBean.Sub sub) {
        view.setOnClickListener(new j0(sub));
    }

    private void b0(View view, CommentBaseBean commentBaseBean) {
        view.setOnClickListener(new w(commentBaseBean));
    }

    private void c0(View view, InformationCommentBean informationCommentBean) {
        view.setOnClickListener(new i0(informationCommentBean));
    }

    private void d0(ImageView imageView, TextView textView, CommentBaseBean commentBaseBean, int i4) {
        n0 n0Var = new n0(commentBaseBean, i4, imageView, textView);
        imageView.setOnClickListener(n0Var);
        textView.setOnClickListener(n0Var);
    }

    private void e0(View view, CommentBaseBean commentBaseBean) {
        view.setOnClickListener(new k0(commentBaseBean));
    }

    private void m(e1 e1Var, y0.n nVar) {
        S(e1Var.f43451a, nVar.f43691a);
    }

    private View n(int i4, View view, ViewGroup viewGroup) {
        View view2;
        a1 a1Var;
        if (view == null) {
            a1Var = new a1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_record_footer, (ViewGroup) null);
            a1Var.f43403b = (TextView) view2.findViewById(R.id.showAllCommit);
            RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.commentFooterLayout);
            a1Var.f43402a = relativeLayout;
            X(relativeLayout);
            if (this.f43375c == 0) {
                a1Var.f43403b.setBackgroundResource(R.drawable.detial_grey_stroke_butn);
                a1Var.f43403b.setTextColor(-5723992);
            }
            view2.setTag(a1Var);
        } else {
            view2 = view;
            a1Var = (a1) view.getTag();
        }
        y0.b bVar = (y0.b) getItem(i4);
        if (bVar.f43659a) {
            a1Var.f43402a.setVisibility(0);
        } else {
            a1Var.f43402a.setVisibility(8);
        }
        TextView textView = a1Var.f43403b;
        textView.setText("查看全部" + bVar.f43660b + "条评论");
        a1Var.f43403b.setOnClickListener(new u());
        return view2;
    }

    private View o(int i4, View view, ViewGroup viewGroup) {
        View view2;
        b1 b1Var;
        if (view == null) {
            b1Var = new b1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_record_header, (ViewGroup) null);
            b1Var.f43411c = (TextView) view2.findViewById(R.id.commitImage);
            b1Var.f43412d = (TextView) view2.findViewById(R.id.commitCount);
            b1Var.f43409a = (LinearLayout) view2.findViewById(R.id.layoutBottom);
            RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.commentHeaderLayout);
            b1Var.f43410b = relativeLayout;
            X(relativeLayout);
            if (this.f43375c == 0) {
                ((TextView) view2.findViewById(R.id.commitTv)).setTextColor(-1);
                b1Var.f43412d.setTextColor(-9145228);
                b1Var.f43411c.setTextColor(-5723992);
                b1Var.f43411c.setBackgroundResource(R.drawable.detial_grey_stroke_butn);
            }
            view2.setTag(b1Var);
        } else {
            view2 = view;
            b1Var = (b1) view.getTag();
        }
        y0.c cVar = (y0.c) getItem(i4);
        if (cVar.f43662a == 0 && cVar.f43663b == 0) {
            b1Var.f43409a.setVisibility(8);
        } else {
            b1Var.f43409a.setVisibility(0);
        }
        if (cVar.f43664c == 1) {
            b1Var.f43410b.setVisibility(0);
            TextView textView = b1Var.f43412d;
            textView.setText(" (" + cVar.f43665d + ") ");
            b1Var.f43411c.setOnClickListener(new x());
        } else {
            b1Var.f43410b.setVisibility(8);
        }
        return view2;
    }

    private View p(int i4, View view, ViewGroup viewGroup) {
        return E(i4, view, viewGroup);
    }

    private View q(int i4, View view, ViewGroup viewGroup) {
        View view2;
        z0 z0Var;
        if (view == null) {
            z0Var = new z0();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.game_detail_comment_item_layout, (ViewGroup) null);
            z0Var.f43729a = (RelativeLayout) view2.findViewById(R.id.main);
            z0Var.f43730b = (SimpleDraweeView) view2.findViewById(R.id.usericon);
            z0Var.f43731c = (ImageView) view2.findViewById(R.id.parise);
            z0Var.f43732d = (TextView) view2.findViewById(R.id.username);
            z0Var.f43733e = (TextView) view2.findViewById(R.id.time);
            z0Var.f43734f = (TextView) view2.findViewById(R.id.content);
            z0Var.f43735g = (TextView) view2.findViewById(R.id.pariseNumber);
            z0Var.f43736h = (VipView) view2.findViewById(R.id.levelTv);
            z0Var.f43737i = view2.findViewById(R.id.line);
            X(z0Var.f43729a);
            if (this.f43375c == 0) {
                z0Var.f43737i.setBackgroundColor(-13290187);
                z0Var.f43734f.setTextColor(-10395295);
                z0Var.f43732d.setTextColor(-1);
                z0Var.f43733e.setTextColor(-5658199);
                z0Var.f43735g.setTextColor(-6250336);
            }
            view2.setTag(z0Var);
        } else {
            view2 = view;
            z0Var = (z0) view.getTag();
        }
        y0.a aVar = (y0.a) getItem(i4);
        if (aVar.f43656b) {
            z0Var.f43737i.setVisibility(8);
        } else {
            z0Var.f43737i.setVisibility(0);
        }
        if (aVar.f43655a) {
            z0Var.f43729a.setVisibility(0);
            CommentBaseBean commentBaseBean = aVar.f43658d;
            z0Var.f43733e.setText(com.join.android.app.common.utils.g.a(Long.parseLong(commentBaseBean.getAdd_times() + "000")));
            z0Var.f43734f.setText(commentBaseBean.getContent());
            TextView textView = z0Var.f43735g;
            textView.setText(commentBaseBean.getPraise_count() + "");
            if (commentBaseBean.getIs_praise() == 1) {
                z0Var.f43731c.setImageResource(R.drawable.like);
            } else {
                z0Var.f43731c.setImageResource(R.drawable.unlike);
            }
            if (com.join.mgps.Util.g2.i(commentBaseBean.getHead_portrait())) {
                UtilsMy.s3(this.f43378f, commentBaseBean.getHead_portrait(), z0Var.f43730b);
            }
            e0(z0Var.f43729a, commentBaseBean);
            d0(z0Var.f43731c, z0Var.f43735g, commentBaseBean, i4);
            b0(z0Var.f43734f, commentBaseBean);
            z0Var.f43732d.setText(Html.fromHtml(commentBaseBean.getUser_name()));
            z0Var.f43736h.setVipData(commentBaseBean.getVip_level(), commentBaseBean.getSvip_level());
            com.join.mgps.Util.j0.S0(z0Var.f43730b, z0Var.f43732d, z0Var.f43733e);
            com.join.mgps.Util.j0.U0(z0Var.f43736h);
        } else {
            z0Var.f43729a.setVisibility(8);
        }
        return view2;
    }

    private View r(int i4, View view, ViewGroup viewGroup) {
        c1 c1Var;
        List<BannerBean> list = ((y0.d) getItem(i4)).f43667a;
        if (view == null) {
            view = LayoutInflater.from(this.f43378f).inflate(R.layout.gamedetial_ad_group_layout, (ViewGroup) null);
            c1Var = new c1(view);
            X(view.findViewById(R.id.top_ad_viewpager));
            view.setTag(c1Var);
        } else {
            c1Var = (c1) view.getTag();
        }
        c1Var.c(list);
        return view;
    }

    private View s(int i4, View view, ViewGroup viewGroup) {
        d1 d1Var;
        View view2;
        y0.e eVar = (y0.e) getItem(i4);
        if (this.f43379g.getFast_entry_switch() == 0) {
            eVar.f43672e = null;
        }
        List<BannerBean> list = eVar.f43672e;
        long j4 = eVar.f43669b;
        String str = eVar.f43670c;
        String str2 = eVar.f43671d;
        if (view == null) {
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.fast_entry_layout, (ViewGroup) null);
            d1Var = new d1();
            d1Var.f43433a = (LinearLayout) view2.findViewById(R.id.autoLayout);
            d1Var.f43441i = (SimpleDraweeView) view2.findViewById(R.id.forumImage);
            d1Var.f43442j = (SimpleDraweeView) view2.findViewById(R.id.qqImage);
            d1Var.f43443k = (SimpleDraweeView) view2.findViewById(R.id.weiCharImage);
            d1Var.f43434b = (LinearLayout) view2.findViewById(R.id.weichartLayout);
            d1Var.f43435c = (LinearLayout) view2.findViewById(R.id.qqLayout);
            d1Var.f43436d = (LinearLayout) view2.findViewById(R.id.forum_layout);
            d1Var.f43440h = (LinearLayout) view2.findViewById(R.id.bottomLayout);
            d1Var.f43437e = (TextView) view2.findViewById(R.id.today_number);
            d1Var.f43444l = (TextView) view2.findViewById(R.id.forumText);
            d1Var.f43445m = (TextView) view2.findViewById(R.id.qqText);
            d1Var.f43446n = (TextView) view2.findViewById(R.id.weiCharText);
            d1Var.f43438f = (TextView) view2.findViewById(R.id.fastFourlayoutText);
            d1Var.f43439g = (SimpleDraweeView) view2.findViewById(R.id.fastFourlayoutImage);
            if (this.f43375c == 0) {
                d1Var.f43434b.setBackgroundResource(R.drawable.detial_fastentry_butn_two);
                d1Var.f43435c.setBackgroundResource(R.drawable.detial_fastentry_butn_two);
                d1Var.f43436d.setBackgroundResource(R.drawable.detial_fastentry_butn_two);
                d1Var.f43433a.setBackgroundResource(R.drawable.detial_fastentry_butn_two);
                view2.findViewById(R.id.title).setVisibility(0);
                X(view2.findViewById(R.id.mainlayout));
            }
            view2.setTag(d1Var);
        } else {
            d1Var = (d1) view.getTag();
            view2 = view;
        }
        if (j4 != 0) {
            d1Var.f43437e.setVisibility(8);
            d1Var.f43436d.setOnClickListener(new r0(j4));
            if (com.join.mgps.Util.g2.i(str)) {
                d1Var.f43435c.setOnClickListener(new s0(str));
                if (com.join.mgps.Util.g2.i(str2)) {
                    d1Var.f43434b.setOnClickListener(new t0(str2));
                    if (list != null && list.size() > 0) {
                        BannerBean bannerBean = list.get(0);
                        d1Var.f43438f.setText(bannerBean.getLabel());
                        MyImageLoader.h(d1Var.f43439g, bannerBean.getPic_remote());
                        d1Var.f43433a.setOnClickListener(new a(list));
                    } else {
                        d1Var.f43433a.setVisibility(4);
                    }
                } else {
                    d1Var.f43433a.setVisibility(4);
                    if (list != null && list.size() > 0) {
                        BannerBean bannerBean2 = list.get(0);
                        d1Var.f43446n.setText(bannerBean2.getLabel());
                        MyImageLoader.h(d1Var.f43443k, bannerBean2.getPic_remote());
                        d1Var.f43434b.setOnClickListener(new b(list));
                    } else {
                        d1Var.f43434b.setVisibility(4);
                        d1Var.f43440h.setVisibility(8);
                    }
                }
            } else {
                d1Var.f43433a.setVisibility(4);
                if (com.join.mgps.Util.g2.i(str2)) {
                    d1Var.f43435c.setOnClickListener(new c(str2));
                    MyImageLoader.d(d1Var.f43442j, R.drawable.detial_weichart, "");
                    d1Var.f43445m.setText("玩家讨论区");
                    if (list != null && list.size() > 0) {
                        BannerBean bannerBean3 = list.get(0);
                        d1Var.f43446n.setText(bannerBean3.getLabel());
                        MyImageLoader.h(d1Var.f43443k, bannerBean3.getPic_remote());
                        d1Var.f43434b.setOnClickListener(new d(list));
                    } else {
                        d1Var.f43440h.setVisibility(8);
                    }
                } else {
                    d1Var.f43440h.setVisibility(8);
                    if (list != null && list.size() > 0) {
                        BannerBean bannerBean4 = list.get(0);
                        d1Var.f43445m.setText(bannerBean4.getLabel());
                        MyImageLoader.h(d1Var.f43442j, bannerBean4.getPic_remote());
                        d1Var.f43435c.setOnClickListener(new e(list));
                    }
                }
            }
        } else {
            d1Var.f43437e.setVisibility(8);
            d1Var.f43433a.setVisibility(4);
            if (com.join.mgps.Util.g2.i(str)) {
                d1Var.f43436d.setOnClickListener(new f(str));
                MyImageLoader.d(d1Var.f43441i, R.drawable.detial_qq, "");
                d1Var.f43444l.setText("官方客服");
                if (com.join.mgps.Util.g2.i(str2)) {
                    d1Var.f43435c.setOnClickListener(new g(str2));
                    MyImageLoader.d(d1Var.f43442j, R.drawable.detial_weichart, "");
                    d1Var.f43445m.setText("玩家讨论区");
                    if (list != null && list.size() > 0) {
                        BannerBean bannerBean5 = list.get(0);
                        d1Var.f43446n.setText(bannerBean5.getLabel());
                        MyImageLoader.h(d1Var.f43443k, bannerBean5.getPic_remote());
                        d1Var.f43434b.setOnClickListener(new h(list));
                    } else {
                        d1Var.f43446n.setVisibility(8);
                    }
                } else {
                    d1Var.f43440h.setVisibility(8);
                    if (list != null && list.size() > 0) {
                        BannerBean bannerBean6 = list.get(0);
                        d1Var.f43445m.setText(bannerBean6.getLabel());
                        MyImageLoader.h(d1Var.f43442j, bannerBean6.getPic_remote());
                        d1Var.f43435c.setOnClickListener(new i(list));
                    } else {
                        d1Var.f43435c.setVisibility(4);
                    }
                }
            } else {
                d1Var.f43440h.setVisibility(8);
                if (com.join.mgps.Util.g2.i(str2)) {
                    d1Var.f43436d.setOnClickListener(new j(str2));
                    MyImageLoader.d(d1Var.f43441i, R.drawable.detial_weichart, "");
                    d1Var.f43444l.setText("玩家讨论区");
                    if (list != null && list.size() > 0) {
                        BannerBean bannerBean7 = list.get(0);
                        d1Var.f43445m.setText(bannerBean7.getLabel());
                        MyImageLoader.h(d1Var.f43442j, bannerBean7.getPic_remote());
                        d1Var.f43435c.setOnClickListener(new l(list));
                    } else {
                        d1Var.f43435c.setVisibility(4);
                    }
                } else {
                    d1Var.f43435c.setVisibility(4);
                    if (list != null && list.size() > 0) {
                        BannerBean bannerBean8 = list.get(0);
                        d1Var.f43444l.setText(bannerBean8.getLabel());
                        MyImageLoader.h(d1Var.f43441i, bannerBean8.getPic_remote());
                        d1Var.f43436d.setOnClickListener(new m(list));
                    }
                }
            }
        }
        return view2;
    }

    private View t(int i4, View view, ViewGroup viewGroup) {
        View view2;
        f1 f1Var;
        if (view == null) {
            f1Var = new f1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_gifts, (ViewGroup) null);
            f1Var.f43456a = (RelativeLayout) view2.findViewById(R.id.giftsLayout);
            f1Var.f43458c = (TextView) view2.findViewById(R.id.giftsTitle);
            f1Var.f43457b = (SimpleDraweeView) view2.findViewById(R.id.giftsImage);
            f1Var.f43459d = (ImageView) view2.findViewById(R.id.arrowImage);
            X(f1Var.f43456a);
            view2.setTag(f1Var);
        } else {
            view2 = view;
            f1Var = (f1) view.getTag();
        }
        y0.f fVar = (y0.f) getItem(i4);
        List<RecommendAdInfoData> list = fVar.f43674b;
        if (fVar.f43673a == 1) {
            f1Var.f43456a.setVisibility(0);
            if (list != null && list.size() > 0) {
                f1Var.f43458c.setText(list.get(0).getMain().getLabel());
            }
            MyImageLoader.h(f1Var.f43457b, (list == null || list.size() <= 0 || list.get(0).getMain() == null) ? "" : list.get(0).getMain().getPic_remote());
            f1Var.f43456a.setOnClickListener(new b0(list));
        } else {
            f1Var.f43456a.setVisibility(8);
        }
        return view2;
    }

    private View u(int i4, View view, ViewGroup viewGroup) {
        View view2;
        g1 g1Var;
        if (view == null) {
            g1Var = new g1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_gifts_bottom, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.layoutBottom);
            g1Var.f43464a = linearLayout;
            X(linearLayout);
            view2.setTag(g1Var);
        } else {
            view2 = view;
            g1Var = (g1) view.getTag();
        }
        if (((y0.g) getItem(i4)).f43675a) {
            g1Var.f43464a.setVisibility(0);
        } else {
            g1Var.f43464a.setVisibility(8);
        }
        return view2;
    }

    private View v(int i4, View view, ViewGroup viewGroup) {
        View view2;
        h1 h1Var;
        if (view == null) {
            h1Var = new h1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_gifts_item, (ViewGroup) null);
            h1Var.f43469a = (LinearLayout) view2.findViewById(R.id.layoutContent);
            h1Var.f43470b = (SimpleDraweeView) view2.findViewById(R.id.giftIcon);
            h1Var.f43471c = (TextView) view2.findViewById(R.id.giftName);
            h1Var.f43472d = (TextView) view2.findViewById(R.id.giftSurplus);
            h1Var.f43473e = (TextView) view2.findViewById(R.id.giftCount);
            h1Var.f43474f = (TextView) view2.findViewById(R.id.giftContent);
            h1Var.f43476h = (TextView) view2.findViewById(R.id.getGiftTextView);
            h1Var.f43477i = (TextView) view2.findViewById(R.id.giftSurplusTitle);
            h1Var.f43475g = (RelativeLayout) view2.findViewById(R.id.rightButnLayout);
            view2.setTag(h1Var);
            X(h1Var.f43469a);
        } else {
            view2 = view;
            h1Var = (h1) view.getTag();
        }
        y0.h hVar = (y0.h) getItem(i4);
        if (hVar.f43676a) {
            GiftPackageDataInfoBean giftPackageDataInfoBean = hVar.f43677b;
            h1Var.f43469a.setVisibility(0);
            h1Var.f43469a.setOnClickListener(new r(giftPackageDataInfoBean));
            MyImageLoader.h(h1Var.f43470b, giftPackageDataInfoBean.getGift_package_pic());
            h1Var.f43471c.setText(giftPackageDataInfoBean.getGift_package_title());
            TextView textView = h1Var.f43474f;
            textView.setText("礼包内容:" + giftPackageDataInfoBean.getGift_package_content());
            TextView textView2 = h1Var.f43473e;
            textView2.setText(giftPackageDataInfoBean.getGift_package_count() + "");
            if (giftPackageDataInfoBean.getGift_package_status() == 0) {
                h1Var.f43476h.setText("领取");
                TextView textView3 = h1Var.f43477i;
                textView3.setText("（剩余:" + giftPackageDataInfoBean.getGift_package_surplus() + net.lingala.zip4j.util.e.F0 + giftPackageDataInfoBean.getGift_package_count() + "）");
            } else {
                h1Var.f43472d.setText("该礼包已领取");
                h1Var.f43476h.setText("查看");
            }
            TextView textView4 = h1Var.f43477i;
            textView4.setText("（剩余:" + giftPackageDataInfoBean.getGift_package_surplus() + net.lingala.zip4j.util.e.F0 + giftPackageDataInfoBean.getGift_package_count() + "）");
            h1Var.f43475g.setOnClickListener(new s(giftPackageDataInfoBean));
        } else {
            h1Var.f43469a.setVisibility(8);
        }
        return view2;
    }

    private View w(int i4, View view, ViewGroup viewGroup) {
        f1 f1Var;
        if (view == null) {
            f1Var = new f1();
            view = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_gifts, (ViewGroup) null);
            f1Var.f43456a = (RelativeLayout) view.findViewById(R.id.giftsLayout);
            f1Var.f43458c = (TextView) view.findViewById(R.id.giftsTitle);
            f1Var.f43457b = (SimpleDraweeView) view.findViewById(R.id.giftsImage);
            f1Var.f43459d = (ImageView) view.findViewById(R.id.arrowImage);
            X(f1Var.f43456a);
            view.setTag(f1Var);
        } else {
            f1Var = (f1) view.getTag();
        }
        f1Var.f43456a.setVisibility(8);
        return view;
    }

    private View x(int i4, View view, ViewGroup viewGroup) {
        View view2;
        j1 j1Var;
        y0.j jVar = (y0.j) getItem(i4);
        if (view == null) {
            j1Var = new j1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.detial_gift_and_service_layout, (ViewGroup) null);
            j1Var.f43491a = (LinearLayout) view2.findViewById(R.id.informationLayout);
            j1Var.f43492b = (LinearLayout) view2.findViewById(R.id.giftLayout);
            j1Var.f43493c = (TextView) view2.findViewById(R.id.line);
            j1Var.f43494d = (LinearLayout) view2.findViewById(R.id.look_other);
            j1Var.f43495e = (LinearLayout) view2.findViewById(R.id.look_other2);
            j1Var.f43496f = (SimpleDraweeView) view2.findViewById(R.id.giftIcon);
            j1Var.f43497g = (TextView) view2.findViewById(R.id.getGift);
            j1Var.f43498h = (TextView) view2.findViewById(R.id.giftMessage);
            j1Var.f43499i = (TextView) view2.findViewById(R.id.messageType1);
            j1Var.f43500j = (TextView) view2.findViewById(R.id.messageType2);
            j1Var.f43501k = (TextView) view2.findViewById(R.id.time1);
            j1Var.f43502l = (TextView) view2.findViewById(R.id.time2);
            j1Var.f43503m = (TextView) view2.findViewById(R.id.message1);
            j1Var.f43504n = (TextView) view2.findViewById(R.id.message2);
            j1Var.f43505o = (LinearLayout) view2.findViewById(R.id.backLayout2);
            j1Var.f43506p = (LinearLayout) view2.findViewById(R.id.backLayout22);
            j1Var.f43507q = (LinearLayout) view2.findViewById(R.id.backLayout1);
            view2.setTag(j1Var);
        } else {
            view2 = view;
            j1Var = (j1) view.getTag();
        }
        List<GiftPackageDataInfoBean> list = jVar.f43681a;
        List<ServiceState> list2 = jVar.f43682b;
        j1Var.f43494d.setOnClickListener(new k());
        j1Var.f43495e.setOnClickListener(new v());
        j1Var.f43507q.setOnClickListener(new g0());
        j1Var.f43505o.setOnClickListener(new o0());
        j1Var.f43506p.setOnClickListener(new p0());
        if (list != null && list.size() != 0) {
            GiftPackageDataInfoBean giftPackageDataInfoBean = list.get(0);
            MyImageLoader.h(j1Var.f43496f, list.get(0).getGift_package_pic());
            j1Var.f43498h.setText(list.get(0).getGift_package_title());
            if (giftPackageDataInfoBean.getGift_package_status() == 0) {
                j1Var.f43497g.setText("领取");
            } else {
                j1Var.f43497g.setText("查看");
            }
            j1Var.f43497g.setOnClickListener(new q0(giftPackageDataInfoBean));
        } else {
            j1Var.f43491a.setVisibility(8);
            j1Var.f43493c.setVisibility(8);
        }
        if (list2 != null && list2.size() != 0) {
            ServiceState serviceState = list2.get(0);
            if (this.f43375c == 0) {
                j1Var.f43499i.setBackgroundDrawable(com.join.mgps.Util.k2.d(this.f43378f, "#3ca4fd", 2));
                j1Var.f43499i.setTextColor(Color.parseColor("#3ca4fd"));
            } else {
                j1Var.f43499i.setBackgroundDrawable(com.join.mgps.Util.k2.a(this.f43378f, "#3ca4fd"));
            }
            j1Var.f43499i.setVisibility(0);
            j1Var.f43501k.setText(com.join.android.app.common.utils.g.c(serviceState.getAdd_time()));
            j1Var.f43503m.setText(serviceState.getTitle());
            if (serviceState.getType() == 1) {
                j1Var.f43499i.setText("开服");
            } else {
                j1Var.f43499i.setText("合服");
            }
            j1Var.f43499i.setBackgroundDrawable(com.join.mgps.Util.k2.d(this.f43378f, "#3ca4fd", 2));
            if (list2.size() > 1) {
                ServiceState serviceState2 = list2.get(1);
                if (this.f43375c == 0) {
                    j1Var.f43500j.setBackgroundDrawable(com.join.mgps.Util.k2.d(this.f43378f, "#3ca4fd", 2));
                    j1Var.f43500j.setTextColor(Color.parseColor("#3ca4fd"));
                } else {
                    j1Var.f43500j.setBackgroundDrawable(com.join.mgps.Util.k2.a(this.f43378f, "#3ca4fd"));
                }
                j1Var.f43500j.setVisibility(0);
                j1Var.f43502l.setText(com.join.android.app.common.utils.g.c(serviceState2.getAdd_time()));
                j1Var.f43504n.setText(serviceState2.getTitle());
                if (serviceState2.getType() == 1) {
                    j1Var.f43500j.setText("开服");
                } else {
                    j1Var.f43500j.setText("合服");
                }
                j1Var.f43500j.setBackgroundDrawable(com.join.mgps.Util.k2.d(this.f43378f, "#3ca4fd", 2));
            }
        } else {
            j1Var.f43492b.setVisibility(8);
            j1Var.f43493c.setVisibility(8);
        }
        return view2;
    }

    private View y(int i4, View view, ViewGroup viewGroup) {
        View view2;
        k1 k1Var;
        if (view == null) {
            k1Var = new k1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_infomation_item, (ViewGroup) null);
            k1Var.f43513b = (SimpleDraweeView) view2.findViewById(R.id.informationImage);
            k1Var.f43514c = (TextView) view2.findViewById(R.id.informationTv);
            k1Var.f43519h = (TextView) view2.findViewById(R.id.messageType);
            k1Var.f43515d = (TextView) view2.findViewById(R.id.pubtime);
            k1Var.f43512a = (LinearLayout) view2.findViewById(R.id.layoutInformation);
            k1Var.f43516e = (LinearLayout) view2.findViewById(R.id.informationTitle);
            k1Var.f43517f = (LinearLayout) view2.findViewById(R.id.layoutTop);
            k1Var.f43518g = view2.findViewById(R.id.line_h);
            X(k1Var.f43512a);
            if (this.f43375c == 0) {
                k1Var.f43518g.setVisibility(8);
                k1Var.f43514c.setTextColor(-7434610);
                k1Var.f43515d.setTextColor(-10592674);
                k1Var.f43518g.setVisibility(8);
            }
            view2.setTag(k1Var);
        } else {
            view2 = view;
            k1Var = (k1) view.getTag();
        }
        RecommendInfomationBean recommendInfomationBean = ((y0.k) getItem(i4)).f43683a;
        k1Var.f43519h.setText(recommendInfomationBean.getType());
        if (com.join.mgps.Util.g2.i(recommendInfomationBean.getType())) {
            if (this.f43375c == 0) {
                k1Var.f43519h.setBackgroundDrawable(com.join.mgps.Util.k2.d(this.f43378f, recommendInfomationBean.getType_color(), recommendInfomationBean.getType().length()));
                k1Var.f43519h.setTextColor(Color.parseColor(recommendInfomationBean.getType_color()));
            } else {
                TextView textView = k1Var.f43519h;
                Context context = this.f43378f;
                textView.setBackgroundDrawable(com.join.mgps.Util.k2.a(context, recommendInfomationBean.getType_color() + ""));
            }
            k1Var.f43519h.setVisibility(0);
        } else {
            k1Var.f43519h.setVisibility(8);
        }
        k1Var.f43515d.setText(com.join.android.app.common.utils.g.b(recommendInfomationBean.getTimes()));
        k1Var.f43514c.setText(recommendInfomationBean.getTitle());
        k1Var.f43512a.setOnClickListener(new y(recommendInfomationBean));
        return view2;
    }

    private View z(int i4, View view, ViewGroup viewGroup) {
        View view2;
        l1 l1Var;
        if (view == null) {
            l1Var = new l1();
            view2 = LayoutInflater.from(this.f43378f).inflate(R.layout.mg_gamedetail_infomation_item_top, (ViewGroup) null);
            l1Var.f43533f = (SimpleDraweeView) view2.findViewById(R.id.informationImage);
            l1Var.f43531d = (LinearLayout) view2.findViewById(R.id.layoutInformation);
            l1Var.f43528a = (TextView) view2.findViewById(R.id.pubtime);
            l1Var.f43534g = (TextView) view2.findViewById(R.id.messageType);
            l1Var.f43532e = (TextView) view2.findViewById(R.id.informationTv);
            l1Var.f43529b = (TextView) view2.findViewById(R.id.pv);
            l1Var.f43530c = (TextView) view2.findViewById(R.id.uv);
            X(l1Var.f43531d);
            if (this.f43375c == 0) {
                l1Var.f43532e.setTextColor(-7434610);
                l1Var.f43528a.setTextColor(-10592674);
                l1Var.f43529b.setTextColor(-10592674);
                l1Var.f43530c.setTextColor(-10592674);
                view2.findViewById(R.id.line).setVisibility(8);
            }
            view2.setTag(l1Var);
        } else {
            view2 = view;
            l1Var = (l1) view.getTag();
        }
        RecommendInfomationBean recommendInfomationBean = ((y0.k) getItem(i4)).f43683a;
        MyImageLoader.h(l1Var.f43533f, recommendInfomationBean.getPic_list()[0]);
        TextView textView = l1Var.f43529b;
        textView.setText(recommendInfomationBean.getCommit() + "");
        TextView textView2 = l1Var.f43530c;
        textView2.setText(recommendInfomationBean.getView() + "");
        l1Var.f43528a.setText(com.join.android.app.common.utils.g.b(recommendInfomationBean.getTimes()));
        l1Var.f43532e.setText(recommendInfomationBean.getTitle());
        l1Var.f43534g.setText(recommendInfomationBean.getType());
        if (com.join.mgps.Util.g2.i(recommendInfomationBean.getType())) {
            if (this.f43375c == 0) {
                if (com.join.mgps.Util.g2.h(recommendInfomationBean.getType_color())) {
                    recommendInfomationBean.setType_color("#8dbbec");
                }
                l1Var.f43534g.setBackgroundDrawable(com.join.mgps.Util.k2.d(this.f43378f, recommendInfomationBean.getType_color(), recommendInfomationBean.getType().length()));
                l1Var.f43534g.setTextColor(Color.parseColor(recommendInfomationBean.getType_color()));
            } else {
                TextView textView3 = l1Var.f43534g;
                Context context = this.f43378f;
                textView3.setBackgroundDrawable(com.join.mgps.Util.k2.a(context, recommendInfomationBean.getType_color() + ""));
            }
            l1Var.f43534g.setVisibility(0);
        } else {
            l1Var.f43534g.setVisibility(8);
        }
        l1Var.f43531d.setOnClickListener(new q(recommendInfomationBean));
        return view2;
    }

    LinearLayout.LayoutParams J() {
        DisplayMetrics displayMetrics = this.f43378f.getResources().getDisplayMetrics();
        int dimensionPixelSize = ((displayMetrics.widthPixels - (this.f43378f.getResources().getDimensionPixelSize(R.dimen.dp48) * 2)) - (((int) (displayMetrics.density * 6.0f)) * 2)) / 3;
        return new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
    }

    public v0 P() {
        return this.f43397y;
    }

    public void S(ViewGroup viewGroup, List<GameDetialStrategyTag> list) {
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (list == null || list.size() == 0) {
            return;
        }
        TextView[] textViewArr = null;
        for (int i4 = 0; i4 < list.size(); i4++) {
            GameDetialStrategyTag gameDetialStrategyTag = list.get(i4);
            int i5 = i4 % 4;
            if (i5 == 0) {
                View inflate = LayoutInflater.from(this.f43378f).inflate(R.layout.forum_theme_category_item, (ViewGroup) null);
                TextView[] textViewArr2 = {(TextView) inflate.findViewById(R.id.tv1), (TextView) inflate.findViewById(R.id.tv2), (TextView) inflate.findViewById(R.id.tv3), (TextView) inflate.findViewById(R.id.tv4)};
                viewGroup.addView(inflate);
                textViewArr = textViewArr2;
            }
            String tag_name = gameDetialStrategyTag.getTag_name();
            int color = this.f43378f.getResources().getColor(R.color.game_detail_tab_text_color);
            TextView textView = textViewArr[i5];
            textView.setVisibility(0);
            textView.setText(tag_name);
            textView.setTextColor(color);
            if (this.f43375c == 0) {
                textView.setBackgroundResource(R.drawable.detail_strategy_tab_backtwo);
                if (i4 == 0) {
                    textView.setBackgroundResource(R.drawable.detial_strategy_table_back_two_selected);
                    textView.setTextColor(-1);
                } else {
                    textView.setTextColor(Color.parseColor("#7b410b"));
                }
            }
            textView.setOnClickListener(new p(gameDetialStrategyTag, list));
        }
    }

    public void T(int i4, int i5) {
        CommentBaseBean commentBaseBean = ((y0.a) getItem(i4)).f43658d;
        long longValue = Long.valueOf(commentBaseBean.getDespise_count()).longValue();
        if (commentBaseBean.getIs_despise() == 1) {
            commentBaseBean.setIs_despise(0);
            long j4 = longValue - 1;
            if (j4 < 0) {
                commentBaseBean.setDespise_count("0");
            } else {
                commentBaseBean.setDespise_count(j4 + "");
            }
        } else if (i5 != 1) {
            commentBaseBean.setIs_despise(1);
            commentBaseBean.setDespise_count((longValue + 1) + "");
        }
        notifyDataSetChanged();
    }

    public void U(int i4, int i5) {
        CommentBaseBean commentBaseBean = ((y0.a) getItem(i4)).f43658d;
        long praise_count = commentBaseBean.getPraise_count();
        if (commentBaseBean.getIs_praise() == 1) {
            commentBaseBean.setIs_praise(0);
            long j4 = praise_count - 1;
            if (j4 < 0) {
                commentBaseBean.setPraise_count(0L);
            } else {
                commentBaseBean.setPraise_count(j4);
            }
        } else if (i5 != 1) {
            commentBaseBean.setIs_praise(1);
            commentBaseBean.setPraise_count(praise_count + 1);
        }
        notifyDataSetChanged();
    }

    void V(y0 y0Var, boolean z4) {
        if (y0Var == null) {
            return;
        }
        try {
            ((y0.r) y0Var.a()).f43703g = z4;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void W(SimpleDraweeView simpleDraweeView, int i4, String str, int i5, String[] strArr) {
        if (this.f43392t == null) {
            this.f43392t = J();
        }
        int i6 = (int) (this.f43378f.getResources().getDisplayMetrics().density * 6.0f);
        LinearLayout.LayoutParams layoutParams = this.f43392t;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
        if (i4 > 0) {
            layoutParams2.setMargins(i6, 0, 0, 0);
        } else {
            layoutParams2.setMargins(0, 0, 0, 0);
        }
        if (!com.join.mgps.Util.g2.h(str)) {
            simpleDraweeView.setVisibility(0);
            simpleDraweeView.setLayoutParams(layoutParams2);
            simpleDraweeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            MyImageLoader.i(simpleDraweeView, str, r.c.f11300g);
            simpleDraweeView.setOnClickListener(new n(i5, strArr));
            return;
        }
        simpleDraweeView.setVisibility(8);
    }

    public void Y(v0 v0Var) {
        this.f43397y = v0Var;
    }

    public void a0(View view, int i4) {
        view.setOnClickListener(new o(i4));
    }

    public void f0(int i4) {
        this.f43375c = i4;
    }

    public void g0(int i4) {
        CommentBaseBean commentBaseBean = ((y0.a) getItem(i4)).f43658d;
        long praise_count = commentBaseBean.getPraise_count();
        commentBaseBean.setIs_praise(0);
        long j4 = praise_count - 1;
        if (j4 < 0) {
            commentBaseBean.setPraise_count(0L);
        } else {
            commentBaseBean.setPraise_count(j4);
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<y0> list = this.f43391s;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<y0> list = this.f43391s;
        if (list != null) {
            return list.get(i4).a();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        List<y0> list = this.f43391s;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f43391s.get(i4).b().ordinal();
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.TITLE.ordinal()) {
            return K(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.VIEWPAGE.ordinal()) {
            return M(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.UPDATE_RECORD.ordinal()) {
            return L(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.WEB.ordinal()) {
            return O(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.GAME_GIFTS.ordinal()) {
            return w(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.GAMEAD.ordinal()) {
            return t(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.MESSAGE.ordinal()) {
            return B(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.RECOMMEND.ordinal()) {
            return D(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.INFORMATION.ordinal()) {
            return y(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.COMMIT_HEADER.ordinal()) {
            return o(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.COMMIT.ordinal()) {
            return q(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.COMMIT_REPLY.ordinal()) {
            return p(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.COMMIT_FOOTER.ordinal()) {
            return n(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.GAME_ITEM_TOP.ordinal()) {
            return A(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.GAME_GIFTS_ITEM.ordinal()) {
            return v(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.GAME_GIFTS_BOTTOM.ordinal()) {
            return u(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.VOUCHER.ordinal()) {
            return N(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.DETIAL_ADGROUP.ordinal()) {
            return r(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.INFORMATIONTOP.ordinal()) {
            return z(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.SERVICEITEM.ordinal()) {
            return F(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.STRAYTEGYTABLE.ordinal()) {
            return H(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.STRAYTEGYITEM_IMAGE.ordinal()) {
            return G(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.STRAYTEGYITEM_NOIMAGE.ordinal()) {
            return I(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.GAME_FAST_ENTRY.ordinal()) {
            return s(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.GIFT_AND_SERVICE.ordinal()) {
            return x(i4, view, viewGroup);
        }
        return itemViewType == ViewType.NULLITEM.ordinal() ? C(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    public void k(int i4) {
        CommentBaseBean commentBaseBean = ((y0.a) getItem(i4)).f43658d;
        long praise_count = commentBaseBean.getPraise_count();
        commentBaseBean.setIs_praise(1);
        commentBaseBean.setPraise_count(praise_count + 1);
        notifyDataSetChanged();
    }

    y0 l(String str, InformationCommentBean informationCommentBean, int i4, boolean z4) {
        return new y0(ViewType.COMMIT_REPLY, new y0.r(str, informationCommentBean, i4, z4));
    }
}
