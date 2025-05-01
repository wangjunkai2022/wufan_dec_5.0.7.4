package com.join.mgps.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.business.RecomDatabeanBusiness;
import com.join.mgps.customview.HorizontalRecyclerView;
import com.join.mgps.dto.AppBean;
import com.join.mgps.dto.AppBeanMain;
import com.join.mgps.dto.DownloadUrlBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ModInfoBean;
import com.join.mgps.dto.ModleBean;
import com.join.mgps.dto.PayTagInfo;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.dto.TipBean;
import com.join.mgps.enums.ConstantIntEnum;
import it.sephiroth.android.library.widget.HListView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public class EverydayNewGameAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f40205b;

    /* renamed from: c  reason: collision with root package name */
    private List<j> f40206c;

    /* renamed from: d  reason: collision with root package name */
    private i f40207d;

    /* loaded from: classes4.dex */
    public class GameListAdapter1 extends RecyclerView.Adapter {

        /* renamed from: a  reason: collision with root package name */
        private Context f40208a;

        /* renamed from: b  reason: collision with root package name */
        private List<CollectionBeanSubBusiness> f40209b;

        public GameListAdapter1(Context context) {
            this.f40208a = context;
        }

        public int a() {
            List<CollectionBeanSubBusiness> list = this.f40209b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public View b(int i4, View view, ViewGroup viewGroup) {
            GameListHolder1 gameListHolder1;
            if (view == null) {
                view = LayoutInflater.from(this.f40208a).inflate(R.layout.intersting_horiz_listitem, viewGroup, false);
            }
            if (view.getTag() == null) {
                gameListHolder1 = new GameListHolder1(view);
            } else {
                gameListHolder1 = (GameListHolder1) view.getTag();
            }
            SimpleDraweeView simpleDraweeView = gameListHolder1.f40211a;
            ImageView imageView = gameListHolder1.f40212b;
            TextView textView = gameListHolder1.f40213c;
            TextView textView2 = gameListHolder1.f40214d;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) getItem(i4);
            UtilsMy.j3(collectionBeanSubBusiness.getSp_tag_info(), view, collectionBeanSubBusiness.getDownloadTask());
            boolean g4 = com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getGame_open_time()) ? com.join.android.app.common.utils.g.g(Long.parseLong(collectionBeanSubBusiness.getGame_open_time()) * 1000) : false;
            imageView.setVisibility(0);
            if (g4) {
                imageView.setImageResource(R.drawable.flag_new);
            } else {
                imageView.setImageResource(R.drawable.flag_old);
            }
            String ico_remote = collectionBeanSubBusiness.getIco_remote();
            textView.setText(collectionBeanSubBusiness.getGame_name());
            MyImageLoader.h(simpleDraweeView, ico_remote);
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(1);
            intentDateBean.setTpl_type(collectionBeanSubBusiness.getGame_info_tpl_type() + "");
            intentDateBean.setCrc_link_type_val(collectionBeanSubBusiness.getGame_id());
            intentDateBean.setJump_type(collectionBeanSubBusiness.getSp_tpl_two_position());
            intentDateBean.setExtBean(new ExtBean(collectionBeanSubBusiness.get_from_type()));
            EverydayNewGameAdapter.this.q(textView, intentDateBean);
            EverydayNewGameAdapter.this.q(simpleDraweeView, intentDateBean);
            EverydayNewGameAdapter.this.d(textView2, collectionBeanSubBusiness);
            return view;
        }

        public Object getItem(int i4) {
            List<CollectionBeanSubBusiness> list = this.f40209b;
            if (list == null || i4 >= list.size()) {
                return null;
            }
            return this.f40209b.get(i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i4) {
            return 0L;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
            if (viewHolder == null) {
                return;
            }
            b(i4, viewHolder.itemView, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
            return new GameListHolder1(LayoutInflater.from(EverydayNewGameAdapter.this.f40205b).inflate(R.layout.intersting_horiz_listitem, viewGroup, false));
        }

        public void setItems(List<CollectionBeanSubBusiness> list) {
            this.f40209b = list;
        }
    }

    /* loaded from: classes4.dex */
    public class GameListHolder1 extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f40211a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f40212b;

        /* renamed from: c  reason: collision with root package name */
        TextView f40213c;

        /* renamed from: d  reason: collision with root package name */
        TextView f40214d;

        public GameListHolder1(View view) {
            super(view);
            this.f40211a = (SimpleDraweeView) view.findViewById(R.id.image1);
            this.f40212b = (ImageView) view.findViewById(R.id.flag);
            this.f40213c = (TextView) view.findViewById(R.id.appname1);
            this.f40214d = (TextView) view.findViewById(R.id.mgListviewItemInstall);
            view.setTag(this);
        }
    }

    /* loaded from: classes4.dex */
    public enum ViewType {
        VIEW_AD,
        VIEW_EXPLOSION,
        VIEW_SECTION_TITLE,
        VIEW_GAME_LIST
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f40216b;

        a(IntentDateBean intentDateBean) {
            this.f40216b = intentDateBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().intentActivity(view.getContext(), this.f40216b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AppBean f40218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f40219b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j4, long j5, AppBean appBean, e eVar) {
            super(j4, j5);
            this.f40218a = appBean;
            this.f40219b = eVar;
        }

        long[] a(long j4) {
            long j5 = j4 / 1000;
            return new long[]{j5 / 86400, (j5 % 86400) / 3600, (j5 % 3600) / 60, (j5 % 60) / 60};
        }

        public String b(long j4) {
            return new SimpleDateFormat("dd:hh").format(Long.valueOf(j4));
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            EverydayNewGameAdapter.this.r(this.f40219b, this.f40218a);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j4) {
            try {
                long[] a5 = a(j4);
                long j5 = a5[0];
                long j6 = a5[1];
                long j7 = 0;
                if (a5[2] > 0 || a5[3] > 0) {
                    j6++;
                }
                if (j6 == 24) {
                    j5++;
                } else {
                    j7 = j6;
                }
                String str = (j4 / 1000) + "";
                this.f40218a.setResidual_time(str);
                EverydayNewGameAdapter.this.k(str);
                this.f40219b.f40227b.setText(j5 + "");
                this.f40219b.f40228c.setText(j7 + "");
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        private final Object f40221b;

        public c(Object obj) {
            this.f40221b = obj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String ver;
            String packageName;
            String down_url_remote;
            List<DownloadUrlBean> tp_down_url;
            int other_down_switch;
            int cdn_down_switch;
            ArrayList<TipBean> tag_info;
            boolean equals;
            int i4;
            int i5;
            DownloadTask downloadTask;
            int i6;
            Context context = view.getContext();
            Object obj = this.f40221b;
            if (obj instanceof CollectionBeanSubBusiness) {
                CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) obj;
                downloadTask = collectionBeanSubBusiness.getDownloadTask();
                ver = collectionBeanSubBusiness.getVer();
                collectionBeanSubBusiness.getVer_name();
                packageName = collectionBeanSubBusiness.getPackage_name();
                down_url_remote = collectionBeanSubBusiness.getDown_url_remote();
                tp_down_url = collectionBeanSubBusiness.getTp_down_url();
                other_down_switch = collectionBeanSubBusiness.getOther_down_switch();
                cdn_down_switch = collectionBeanSubBusiness.getCdn_down_switch();
                tag_info = collectionBeanSubBusiness.getTag_info();
                String plugin_num = collectionBeanSubBusiness.getPlugin_num();
                equals = plugin_num.equals(ConstantIntEnum.H5.value() + "");
                if (collectionBeanSubBusiness.getPay_tag_info() != null) {
                    i6 = collectionBeanSubBusiness.getPay_tag_info().getPay_game_amount();
                    i5 = i6;
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                if (i6 > 0) {
                    b2.e0.o().p(collectionBeanSubBusiness.getCrc_sign_id());
                }
            } else if (!(obj instanceof RecomDatabeanBusiness)) {
                return;
            } else {
                RecomDatabeanBusiness recomDatabeanBusiness = (RecomDatabeanBusiness) obj;
                AppBean game_info = recomDatabeanBusiness.getSub().get(0).getGame_info();
                DownloadTask a5 = recomDatabeanBusiness.a();
                ver = game_info.getVer();
                game_info.getVer_name();
                packageName = game_info.getPackageName();
                down_url_remote = game_info.getDown_url_remote();
                tp_down_url = game_info.getTp_down_url();
                other_down_switch = game_info.getOther_down_switch();
                cdn_down_switch = game_info.getCdn_down_switch();
                tag_info = game_info.getTag_info();
                equals = (ConstantIntEnum.H5.value() + "").equals(game_info.getPlugin_num());
                if (game_info.getPay_tag_info() != null) {
                    i4 = game_info.getPay_tag_info().getPay_game_amount();
                    i5 = i4;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (i4 > 0) {
                    b2.e0.o().p(game_info.getCrc_sign_id());
                }
                downloadTask = a5;
            }
            if (equals) {
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(down_url_remote);
                UtilsMy.T2(downloadTask, context);
                IntentUtil.getInstance().intentActivity(context, intentDateBean);
                return;
            }
            if (downloadTask == null) {
                if (UtilsMy.o0(tag_info) && com.join.android.app.common.utils.e.l0(context).d(context, packageName)) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, packageName);
                    if (!com.join.mgps.Util.g2.i(ver) || l4.d() >= Integer.parseInt(ver)) {
                        com.join.android.app.common.utils.e.l0(context);
                        APKUtils.a0(context, packageName);
                        return;
                    }
                }
                Object obj2 = this.f40221b;
                if (obj2 instanceof CollectionBeanSubBusiness) {
                    CollectionBeanSubBusiness collectionBeanSubBusiness2 = (CollectionBeanSubBusiness) obj2;
                    if (collectionBeanSubBusiness2.getMod_info() == null) {
                        downloadTask = collectionBeanSubBusiness2.getDownloadtaskDown();
                    } else {
                        UtilsMy.Y0(context, collectionBeanSubBusiness2);
                        return;
                    }
                } else if (!(obj2 instanceof RecomDatabeanBusiness)) {
                    return;
                } else {
                    AppBean game_info2 = ((RecomDatabeanBusiness) obj2).getSub().get(0).getGame_info();
                    if (game_info2.getMod_info() == null) {
                        downloadTask = game_info2.getDownloadtaskDown();
                    } else {
                        UtilsMy.W0(context, game_info2);
                        return;
                    }
                }
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.x0(i5, downloadTask.getCrc_link_type_val()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status != 13) {
                    if (status != 2) {
                        if (status != 3) {
                            if (status == 5) {
                                UtilsMy.T3(context, downloadTask);
                                return;
                            } else if (status != 6) {
                                if (status != 7) {
                                    if (status == 42) {
                                        if (!com.join.android.app.common.utils.j.j(context)) {
                                            com.join.mgps.Util.l2.a(context).b("无网络连接");
                                            return;
                                        } else {
                                            UtilsMy.r4(context, downloadTask);
                                            return;
                                        }
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (!com.join.android.app.common.utils.j.j(context)) {
                                                    com.join.mgps.Util.l2.a(context).b("无网络连接");
                                                    return;
                                                } else {
                                                    UtilsMy.I2(context, downloadTask);
                                                    return;
                                                }
                                            case 10:
                                                break;
                                            case 11:
                                                UtilsMy.a4(downloadTask, context);
                                                return;
                                            default:
                                                return;
                                        }
                                    }
                                }
                            }
                        }
                        com.php25.PDownload.d.c(downloadTask, context);
                        return;
                    }
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                }
                com.php25.PDownload.d.l(context, downloadTask);
                return;
            }
            if (UtilsMy.x0(i5, downloadTask.getCrc_link_type_val()) > 0) {
                UtilsMy.d4(context, downloadTask.getCrc_link_type_val());
                return;
            }
            Object obj3 = this.f40221b;
            if (obj3 instanceof CollectionBeanSubBusiness) {
                CollectionBeanSubBusiness collectionBeanSubBusiness3 = (CollectionBeanSubBusiness) obj3;
                UtilsMy.y1(downloadTask, collectionBeanSubBusiness3);
                if (UtilsMy.o1(context, downloadTask)) {
                    return;
                }
                if (collectionBeanSubBusiness3.getDown_status() == 5) {
                    UtilsMy.l1(context, downloadTask);
                } else {
                    UtilsMy.R0(context, downloadTask, tp_down_url, other_down_switch, cdn_down_switch);
                }
            } else if (obj3 instanceof RecomDatabeanBusiness) {
                AppBean game_info3 = ((RecomDatabeanBusiness) obj3).getSub().get(0).getGame_info();
                UtilsMy.x1(downloadTask, game_info3);
                if (UtilsMy.o1(context, downloadTask)) {
                    return;
                }
                if (game_info3.getDown_status() == 5) {
                    UtilsMy.l1(context, downloadTask);
                } else {
                    UtilsMy.R0(context, downloadTask, tp_down_url, other_down_switch, cdn_down_switch);
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f40223a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f40224b;

        public d() {
        }
    }

    /* loaded from: classes4.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public TextView f40226a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f40227b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40228c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f40229d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f40230e;

        /* renamed from: f  reason: collision with root package name */
        public SimpleDraweeView f40231f;

        /* renamed from: g  reason: collision with root package name */
        public TextView f40232g;

        /* renamed from: h  reason: collision with root package name */
        public LinearLayout f40233h;

        /* renamed from: i  reason: collision with root package name */
        public TextView f40234i;

        public e() {
        }
    }

    /* loaded from: classes4.dex */
    public class f extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private Context f40236b;

        /* renamed from: c  reason: collision with root package name */
        private List<CollectionBeanSubBusiness> f40237c;

        public f(Context context) {
            this.f40236b = context;
        }

        public void a(List<CollectionBeanSubBusiness> list) {
            this.f40237c = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<CollectionBeanSubBusiness> list = this.f40237c;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<CollectionBeanSubBusiness> list = this.f40237c;
            if (list == null || i4 >= list.size()) {
                return null;
            }
            return this.f40237c.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(this.f40236b).inflate(R.layout.intersting_horiz_listitem, viewGroup, false);
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) com.join.mgps.Util.s2.a(view, R.id.image1);
            ImageView imageView = (ImageView) com.join.mgps.Util.s2.a(view, R.id.flag);
            TextView textView = (TextView) com.join.mgps.Util.s2.a(view, R.id.appname1);
            TextView textView2 = (TextView) com.join.mgps.Util.s2.a(view, R.id.mgListviewItemInstall);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) getItem(i4);
            boolean g4 = (collectionBeanSubBusiness == null || !com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getGame_open_time())) ? false : com.join.android.app.common.utils.g.g(Long.parseLong(collectionBeanSubBusiness.getGame_open_time()) * 1000);
            imageView.setVisibility(0);
            if (g4) {
                imageView.setImageResource(R.drawable.flag_new);
            } else {
                imageView.setImageResource(R.drawable.flag_old);
            }
            if (collectionBeanSubBusiness != null) {
                String ico_remote = collectionBeanSubBusiness.getIco_remote();
                textView.setText(collectionBeanSubBusiness.getGame_name());
                MyImageLoader.h(simpleDraweeView, ico_remote);
                IntentDateBean intentDateBean = new IntentDateBean();
                intentDateBean.setLink_type(1);
                intentDateBean.setTpl_type(collectionBeanSubBusiness.getGame_info_tpl_type() + "");
                intentDateBean.setCrc_link_type_val(collectionBeanSubBusiness.getGame_id());
                intentDateBean.setCrc_link_type_val(collectionBeanSubBusiness.getGame_id());
                intentDateBean.setExtBean(new ExtBean(collectionBeanSubBusiness.get_from_type()));
                EverydayNewGameAdapter.this.q(textView, intentDateBean);
                EverydayNewGameAdapter.this.q(simpleDraweeView, intentDateBean);
                EverydayNewGameAdapter.this.d(textView2, collectionBeanSubBusiness);
            }
            return view;
        }
    }

    /* loaded from: classes4.dex */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        public HListView f40239a;

        /* renamed from: b  reason: collision with root package name */
        public HorizontalRecyclerView f40240b;

        public g() {
        }
    }

    /* loaded from: classes4.dex */
    public class h {

        /* renamed from: a  reason: collision with root package name */
        public LinearLayout f40242a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f40243b;

        public h() {
        }
    }

    /* loaded from: classes4.dex */
    public interface i {
        void a(String str);
    }

    /* loaded from: classes4.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        ViewType f40245a;

        /* renamed from: b  reason: collision with root package name */
        Object f40246b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public RecomDatabean f40247a;

            public a(RecomDatabean recomDatabean) {
                this.f40247a = recomDatabean;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public RecomDatabeanBusiness f40248a;

            public b(RecomDatabeanBusiness recomDatabeanBusiness) {
                this.f40248a = recomDatabeanBusiness;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            private final String f40249a;

            /* renamed from: b  reason: collision with root package name */
            public List<CollectionBeanSubBusiness> f40250b;

            public c(String str, List<CollectionBeanSubBusiness> list) {
                this.f40249a = str;
                this.f40250b = list;
            }
        }

        /* loaded from: classes4.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public String f40251a;

            public d(String str) {
                this.f40251a = str;
            }
        }

        public j() {
        }

        public Object a() {
            return this.f40246b;
        }

        public ViewType b() {
            return this.f40245a;
        }

        public void c(Object obj) {
            this.f40246b = obj;
        }

        public void d(ViewType viewType) {
            this.f40245a = viewType;
        }

        public j(ViewType viewType, Object obj) {
            this.f40245a = viewType;
            this.f40246b = obj;
        }
    }

    public EverydayNewGameAdapter(Context context) {
        this.f40205b = context;
    }

    private View e(int i4, View view, ViewGroup viewGroup) {
        d dVar;
        try {
            if (view != null) {
                dVar = (d) view.getTag();
            } else {
                dVar = new d();
                view = LayoutInflater.from(this.f40205b).inflate(R.layout.collection_two_header, (ViewGroup) null);
                dVar.f40223a = (SimpleDraweeView) view.findViewById(R.id.imgBreak);
                dVar.f40224b = (TextView) view.findViewById(R.id.textViewBreak);
                view.setTag(dVar);
            }
            if (dVar != null) {
                dVar.f40224b.setVisibility(8);
                j.a aVar = (j.a) getItem(i4);
                RecomDatabean recomDatabean = aVar.f40247a;
                MyImageLoader.d(dVar.f40223a, R.drawable.banner_normal_icon, (recomDatabean == null || recomDatabean.getMain() == null) ? "" : aVar.f40247a.getMain().getPic_remote());
                RecomDatabean recomDatabean2 = aVar.f40247a;
                if (recomDatabean2 != null && recomDatabean2.getSub() != null && aVar.f40247a.getSub().size() > 0) {
                    AppBeanMain appBeanMain = aVar.f40247a.getSub().get(0);
                    IntentDateBean intentDateBean = new IntentDateBean(appBeanMain.getLink_type(), appBeanMain.getJump_type(), appBeanMain.getLink_type_val(), appBeanMain.getCrc_link_type_val(), appBeanMain.getTpl_type(), null);
                    if (appBeanMain.getGame_info() != null) {
                        intentDateBean.setExtBean(new ExtBean(appBeanMain.getGame_info().get_from_type()));
                    }
                    q(view, intentDateBean);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    private View f(int i4, View view, ViewGroup viewGroup) {
        View view2;
        e eVar;
        String str;
        try {
            if (view != null) {
                eVar = (e) view.getTag();
                view2 = view;
            } else {
                eVar = new e();
                view2 = LayoutInflater.from(this.f40205b).inflate(R.layout.new_game_explosion, (ViewGroup) null);
                try {
                    eVar.f40229d = (TextView) view2.findViewById(R.id.gameName);
                    eVar.f40230e = (TextView) view2.findViewById(R.id.installButton);
                    eVar.f40231f = (SimpleDraweeView) view2.findViewById(R.id.gameIcon);
                    eVar.f40226a = (TextView) view2.findViewById(R.id.sectionTitle);
                    eVar.f40232g = (TextView) view2.findViewById(R.id.openState);
                    eVar.f40233h = (LinearLayout) view2.findViewById(R.id.countdownLayout);
                    eVar.f40227b = (TextView) view2.findViewById(R.id.time_h);
                    eVar.f40228c = (TextView) view2.findViewById(R.id.time_m);
                    eVar.f40234i = (TextView) view2.findViewById(R.id.openTime);
                    view2.setTag(eVar);
                } catch (Exception e5) {
                    e = e5;
                    e.printStackTrace();
                    return view2;
                }
            }
            e eVar2 = eVar;
            if (eVar2 != null) {
                j.b bVar = (j.b) getItem(i4);
                AppBeanMain appBeanMain = bVar.f40248a.getSub().get(0);
                AppBean game_info = bVar.f40248a.getSub().get(0).getGame_info();
                ModleBean main = bVar.f40248a.getMain();
                String str2 = "";
                eVar2.f40226a.setText(main != null ? main.getTitle() : "");
                if (game_info != null) {
                    String ico_remote = game_info.getIco_remote();
                    str2 = game_info.getGame_name();
                    str = ico_remote;
                } else {
                    str = "";
                }
                eVar2.f40229d.setText(str2);
                MyImageLoader.d(eVar2.f40231f, R.drawable.main_normal_icon, str);
                UtilsMy.j3(game_info.getSp_tag_info(), view2, bVar.f40248a.a());
                IntentDateBean intentDateBean = new IntentDateBean(appBeanMain.getLink_type(), appBeanMain.getJump_type(), appBeanMain.getLink_type_val(), appBeanMain.getCrc_link_type_val(), appBeanMain.getTpl_type(), null);
                intentDateBean.setExtBean(new ExtBean(game_info.get_from_type()));
                q(view2, intentDateBean);
                d(eVar2.f40230e, bVar.f40248a);
                try {
                    eVar2.f40234i.setText(new SimpleDateFormat("MM月dd日 HH:mm").format(new Date(Long.parseLong(game_info.getGame_open_time()) * 1000)));
                } catch (NumberFormatException e6) {
                    e6.printStackTrace();
                }
                if ((game_info.getDown_status() == 2 || game_info.getDown_status() == 3) ? false : true) {
                    eVar2.f40234i.setVisibility(0);
                    eVar2.f40233h.setVisibility(8);
                    eVar2.f40232g.setText(this.f40205b.getString(R.string.explosion_open));
                } else {
                    eVar2.f40234i.setVisibility(8);
                    eVar2.f40233h.setVisibility(0);
                    eVar2.f40232g.setText(this.f40205b.getString(R.string.explosion_count_down));
                    s(eVar2, game_info);
                }
            }
        } catch (Exception e7) {
            e = e7;
            view2 = view;
        }
        return view2;
    }

    private View g(int i4, View view, ViewGroup viewGroup) {
        g gVar;
        try {
            if (view != null) {
                gVar = (g) view.getTag();
            } else {
                gVar = new g();
                view = LayoutInflater.from(this.f40205b).inflate(R.layout.papamain_intersting_midle_layout1, (ViewGroup) null);
                gVar.f40240b = (HorizontalRecyclerView) view.findViewById(R.id.hrecyclerview);
                view.setTag(gVar);
            }
            if (gVar != null) {
                List<CollectionBeanSubBusiness> list = ((j.c) getItem(i4)).f40250b;
                if (gVar.f40239a != null) {
                    f fVar = (f) view.getTag(R.id.everyday_new_game_list);
                    if (fVar == null) {
                        fVar = new f(this.f40205b);
                        view.setTag(R.id.everyday_new_game_list, fVar);
                    }
                    gVar.f40239a.setAdapter((ListAdapter) fVar);
                    fVar.a(list);
                    fVar.notifyDataSetChanged();
                }
                if (gVar.f40240b != null) {
                    GameListAdapter1 gameListAdapter1 = (GameListAdapter1) view.getTag(R.id.everyday_new_game_list);
                    if (gameListAdapter1 == null) {
                        gameListAdapter1 = new GameListAdapter1(this.f40205b);
                        view.setTag(R.id.everyday_new_game_list, gameListAdapter1);
                    }
                    gVar.f40240b.setAdapter(gameListAdapter1);
                    gameListAdapter1.setItems(list);
                    gameListAdapter1.notifyDataSetChanged();
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    private View j(int i4, View view, ViewGroup viewGroup) {
        h hVar;
        try {
            if (view != null) {
                hVar = (h) view.getTag();
            } else {
                hVar = new h();
                view = LayoutInflater.from(this.f40205b).inflate(R.layout.new_game_section_title, (ViewGroup) null);
                hVar.f40242a = (LinearLayout) view.findViewById(R.id.forumMore);
                hVar.f40243b = (TextView) view.findViewById(R.id.sectionTitle);
                view.setTag(hVar);
            }
            hVar.f40242a.setVisibility(8);
            hVar.f40243b.setText("游戏更新");
            j.d dVar = (j.d) getItem(i4);
            if (dVar != null && com.join.mgps.Util.g2.i(dVar.f40251a)) {
                hVar.f40243b.setText(dVar.f40251a);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str) {
        i iVar = this.f40207d;
        if (iVar != null) {
            iVar.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(e eVar, AppBean appBean) {
        if (eVar == null) {
            return;
        }
        eVar.f40233h.setVisibility(8);
        int i4 = 0;
        eVar.f40234i.setVisibility(0);
        eVar.f40232g.setText(this.f40205b.getString(R.string.explosion_open));
        int pay_game_amount = appBean.getPay_tag_info() != null ? appBean.getPay_tag_info().getPay_game_amount() : 0;
        if (pay_game_amount <= 0 || !b2.e0.o().p(appBean.getCrc_sign_id())) {
            i4 = pay_game_amount;
        }
        if (i4 > 0) {
            n(eVar.f40230e, i4);
        } else {
            m(eVar.f40230e, appBean.getDown_status());
        }
    }

    void d(TextView textView, Object obj) {
        DownloadTask a5;
        int down_status;
        String ver;
        String packageName;
        ArrayList<TipBean> tag_info;
        PayTagInfo pay_tag_info;
        boolean equals;
        int pay_game_amount;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        Resources resources = context.getResources();
        if (obj instanceof CollectionBeanSubBusiness) {
            CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) obj;
            a5 = collectionBeanSubBusiness.getDownloadTask();
            down_status = collectionBeanSubBusiness.getDown_status();
            ver = collectionBeanSubBusiness.getVer();
            packageName = collectionBeanSubBusiness.getPackage_name();
            tag_info = collectionBeanSubBusiness.getTag_info();
            pay_tag_info = collectionBeanSubBusiness.getPay_tag_info();
            String plugin_num = collectionBeanSubBusiness.getPlugin_num();
            equals = plugin_num.equals(ConstantIntEnum.H5.value() + "");
            int pay_game_amount2 = collectionBeanSubBusiness.getPay_tag_info() != null ? collectionBeanSubBusiness.getPay_tag_info().getPay_game_amount() : 0;
            if (pay_game_amount2 > 0 && b2.e0.o().p(collectionBeanSubBusiness.getCrc_sign_id())) {
                pay_game_amount2 = 0;
            }
            pay_game_amount = pay_game_amount2;
        } else if (!(obj instanceof RecomDatabeanBusiness)) {
            return;
        } else {
            RecomDatabeanBusiness recomDatabeanBusiness = (RecomDatabeanBusiness) obj;
            a5 = recomDatabeanBusiness.a();
            AppBean game_info = recomDatabeanBusiness.getSub().get(0).getGame_info();
            down_status = game_info.getDown_status();
            ver = game_info.getVer();
            packageName = game_info.getPackageName();
            tag_info = game_info.getTag_info();
            pay_tag_info = game_info.getPay_tag_info();
            equals = (ConstantIntEnum.H5.value() + "").equals(game_info.getPlugin_num());
            pay_game_amount = game_info.getPay_tag_info() != null ? game_info.getPay_tag_info().getPay_game_amount() : 0;
            if (pay_game_amount > 0 && b2.e0.o().p(game_info.getCrc_sign_id())) {
                pay_game_amount = 0;
            }
        }
        if (equals) {
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
            textView.setText("开始");
            textView.setTextColor(context.getResources().getColor(R.color.app_blue_color));
        } else if (a5 == null) {
            if (UtilsMy.o0(tag_info)) {
                if (pay_game_amount > 0 ? false : com.join.android.app.common.utils.e.l0(context).d(context, packageName)) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, packageName);
                    if (com.join.mgps.Util.g2.i(ver) && l4.d() < Integer.parseInt(ver)) {
                        textView.setBackgroundResource(R.drawable.recom_green_butn);
                        textView.setText("更新");
                        textView.setTextColor(resources.getColor(R.color.app_green_color));
                    } else {
                        textView.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        textView.setText(context.getResources().getString(R.string.download_status_finished));
                        textView.setTextColor(resources.getColor(R.color.app_main_color));
                    }
                } else {
                    textView.setBackgroundResource(R.drawable.recom_green_butn);
                    if (pay_game_amount > 0) {
                        n(textView, pay_game_amount);
                    } else {
                        m(textView, down_status);
                    }
                }
            } else {
                textView.setBackgroundResource(R.drawable.recom_green_butn);
                if (pay_game_amount > 0) {
                    n(textView, pay_game_amount);
                } else {
                    m(textView, down_status);
                }
            }
        } else {
            int status = a5.getStatus();
            if (UtilsMy.w0(pay_tag_info, a5.getCrc_link_type_val()) > 0) {
                status = 43;
            }
            if (status != 0) {
                if (status == 27) {
                    textView.setText("暂停中");
                } else if (status == 48) {
                    textView.setBackgroundResource(R.drawable.recom_blue_butn);
                    textView.setText("安装中");
                    textView.setTextColor(resources.getColor(R.color.app_blue_color));
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    textView.setBackgroundResource(R.drawable.recom_green_butn);
                                                    textView.setText("更新");
                                                    textView.setTextColor(resources.getColor(R.color.app_green_color));
                                                    break;
                                                case 10:
                                                    textView.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    textView.setText("等待");
                                                    textView.setTextColor(resources.getColor(R.color.app_blue_color));
                                                    break;
                                                case 11:
                                                    textView.setBackgroundResource(R.drawable.recom_green_butn);
                                                    textView.setText("安装");
                                                    textView.setTextColor(resources.getColor(R.color.app_green_color));
                                                    break;
                                                case 12:
                                                    textView.setBackgroundResource(R.drawable.extract);
                                                    textView.setText("解压中");
                                                    textView.setTextColor(resources.getColor(R.color.app_grey_color));
                                                    break;
                                                case 13:
                                                    textView.setBackgroundResource(R.drawable.reextract);
                                                    textView.setText("解压");
                                                    textView.setTextColor(resources.getColor(R.color.app_blue_color));
                                                    break;
                                            }
                                        } else {
                                            textView.setBackgroundResource(R.drawable.download_green_butn);
                                            if (pay_game_amount > 0) {
                                                n(textView, pay_game_amount);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        textView.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        textView.setText(context.getResources().getString(R.string.download_status_finished));
                        textView.setTextColor(resources.getColor(R.color.app_main_color));
                    }
                    textView.setBackgroundResource(R.drawable.recom_blue_butn);
                    textView.setText("继续");
                    textView.setTextColor(resources.getColor(R.color.app_blue_color));
                } else {
                    UtilsMy.x4(a5);
                    textView.setBackgroundResource(R.drawable.recom_blue_butn);
                    textView.setText("暂停");
                    textView.setTextColor(resources.getColor(R.color.app_blue_color));
                }
            }
            textView.setBackgroundResource(R.drawable.recom_green_butn);
            if (pay_game_amount > 0) {
                n(textView, pay_game_amount);
            } else {
                m(textView, down_status);
            }
        }
        textView.setOnClickListener(new c(obj));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<j> list = this.f40206c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<j> list = this.f40206c;
        if (list != null) {
            return list.get(i4).a();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        List<j> list = this.f40206c;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        View g4;
        try {
            List<j> list = this.f40206c;
            if (list == null && list.size() == 0) {
                return view;
            }
            int itemViewType = getItemViewType(i4);
            if (itemViewType == ViewType.VIEW_AD.ordinal()) {
                g4 = e(i4, view, viewGroup);
            } else if (itemViewType == ViewType.VIEW_EXPLOSION.ordinal()) {
                g4 = f(i4, view, viewGroup);
            } else if (itemViewType == ViewType.VIEW_SECTION_TITLE.ordinal()) {
                g4 = j(i4, view, viewGroup);
            } else if (itemViewType != ViewType.VIEW_GAME_LIST.ordinal()) {
                return view;
            } else {
                g4 = g(i4, view, viewGroup);
            }
            return g4;
        } catch (Exception e5) {
            e5.printStackTrace();
            return view;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    public List<j> h() {
        return this.f40206c;
    }

    public i i() {
        return this.f40207d;
    }

    public void l(DownloadTask downloadTask, Map<String, DownloadTask> map, int i4) {
        for (int i5 = 0; i5 < getCount(); i5++) {
            if (getItemViewType(i5) == ViewType.VIEW_GAME_LIST.ordinal()) {
                try {
                    Iterator<CollectionBeanSubBusiness> it2 = ((j.c) getItem(i5)).f40250b.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        CollectionBeanSubBusiness next = it2.next();
                        if (next.getMod_info() != null) {
                            ModInfoBean mod_info = next.getMod_info();
                            DownloadTask downloadTask2 = map.get(mod_info.getMain_game_id());
                            boolean d5 = (downloadTask2 == null || downloadTask2.getStatus() != 5) ? false : com.join.android.app.common.utils.e.l0(this.f40205b).d(this.f40205b, downloadTask2.getPackageName());
                            DownloadTask downloadTask3 = map.get(mod_info.getMod_game_id());
                            boolean F = (downloadTask3 == null || downloadTask3.getStatus() != 5) ? false : com.join.mgps.va.overmind.d.o().F(downloadTask3.getPackageName());
                            if (!F || !d5) {
                                if (F) {
                                    if (next.getMod_info() != null && downloadTask.getCrc_link_type_val().equals(next.getMod_info().getMod_game_id())) {
                                        next.setDownloadTask(downloadTask);
                                        break;
                                    }
                                } else if (d5) {
                                    if (downloadTask.getCrc_link_type_val().equals(next.getCrc_sign_id())) {
                                        next.setDownloadTask(downloadTask);
                                        break;
                                    }
                                } else {
                                    DownloadTask F2 = next.getMod_info() != null ? p1.f.K().F(next.getMod_info().getMod_game_id()) : null;
                                    if (F2 == null) {
                                        F2 = p1.f.K().F(next.getCrc_sign_id());
                                    }
                                    if (F2 != null && downloadTask.getCrc_link_type_val().equals(F2.getCrc_link_type_val())) {
                                        next.setDownloadTask(downloadTask);
                                        break;
                                    }
                                }
                            } else if (downloadTask.getCrc_link_type_val().equals(next.getCrc_sign_id())) {
                                next.setDownloadTask(downloadTask);
                                break;
                            }
                        } else if (next.getCrc_sign_id().equals(downloadTask.getCrc_link_type_val())) {
                            next.setDownloadTask(downloadTask);
                            break;
                        }
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                notifyDataSetChanged();
            } else if (getItemViewType(i5) == ViewType.VIEW_EXPLOSION.ordinal()) {
                try {
                    RecomDatabeanBusiness recomDatabeanBusiness = ((j.b) getItem(i5)).f40248a;
                    AppBean game_info = recomDatabeanBusiness.getSub().get(0).getGame_info();
                    if (game_info.getMod_info() != null) {
                        DownloadTask downloadTask4 = map.get(game_info.getMod_info().getMod_game_id());
                        DownloadTask downloadTask5 = map.get(game_info.getGame_id());
                        if (downloadTask4 == null && downloadTask5 == null) {
                            recomDatabeanBusiness.d(downloadTask);
                            if (i4 == 2) {
                                recomDatabeanBusiness.d(null);
                            }
                        } else if (downloadTask4 != null) {
                            recomDatabeanBusiness.d(downloadTask);
                            if (i4 == 2) {
                                recomDatabeanBusiness.d(downloadTask4);
                            }
                        } else if (downloadTask5 != null) {
                            recomDatabeanBusiness.d(downloadTask);
                            if (i4 == 2) {
                                recomDatabeanBusiness.d(downloadTask5);
                            }
                        } else if (game_info.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                            recomDatabeanBusiness.d(downloadTask);
                            if (i4 == 2) {
                                recomDatabeanBusiness.d(null);
                            }
                        }
                    } else if (game_info.getGame_id().equals(downloadTask.getCrc_link_type_val())) {
                        recomDatabeanBusiness.d(downloadTask);
                        if (i4 == 2) {
                            recomDatabeanBusiness.d(null);
                        }
                    }
                    notifyDataSetChanged();
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    void m(TextView textView, int i4) {
        textView.setEnabled(true);
        textView.setTextColor(-12802819);
        if (i4 == 3) {
            textView.setText(textView.getResources().getString(R.string.download_status_pre_download));
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        } else if (i4 == 2) {
            textView.setText("即将开放");
            textView.setTextSize(2, 11.0f);
            textView.setTextColor(-7763575);
            textView.setEnabled(false);
            textView.setBackgroundResource(R.drawable.recom_grey_butn);
        } else {
            textView.setText(this.f40205b.getResources().getString(R.string.download_status_download));
            textView.setTextSize(2, 13.0f);
            textView.setTextColor(-12802819);
            textView.setBackgroundResource(R.drawable.recom_blue_butn);
        }
    }

    void n(TextView textView, int i4) {
        textView.setEnabled(true);
        textView.setTextColor(-12802819);
        textView.setText(textView.getResources().getString(R.string.pay_game_amount, com.join.mgps.Util.g2.m(i4)));
        textView.setTextSize(2, 13.0f);
        textView.setTextColor(-12802819);
        textView.setBackgroundResource(R.drawable.recom_blue_butn);
    }

    public void o(List<j> list) {
        this.f40206c = list;
    }

    public void p(i iVar) {
        this.f40207d = iVar;
    }

    void q(View view, IntentDateBean intentDateBean) {
        if (view == null || intentDateBean == null) {
            return;
        }
        view.setOnClickListener(new a(intentDateBean));
    }

    public void s(e eVar, AppBean appBean) {
        String residual_time = appBean.getResidual_time();
        if (eVar == null || com.join.mgps.Util.g2.h(residual_time)) {
            return;
        }
        long time = new Date(Long.valueOf(Long.parseLong(residual_time)).longValue() * 1000).getTime();
        if (time > 0) {
            new b(time, 1000L, appBean, eVar).start();
        } else {
            r(eVar, appBean);
        }
    }
}
