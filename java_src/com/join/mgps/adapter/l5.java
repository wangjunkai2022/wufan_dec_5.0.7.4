package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.APKUtils;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.ImagePagerActivity;
import com.join.mgps.activity.SearchListActivity1;
import com.join.mgps.adapter.FullScreenActivity;
import com.join.mgps.business.CollectionBeanSubBusiness;
import com.join.mgps.dto.DetialShowImageBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.SearchIntegratedFavoriteBean;
import com.join.mgps.dto.SearchIntegratedPostBean;
import com.join.mgps.dto.SearchResultAdinfo;
import com.join.mgps.enums.ConstantIntEnum;
import com.papa.sim.statistic.Where;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SearchListAdapter.java */
/* loaded from: classes4.dex */
public class l5 extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    private Context f44574c;

    /* renamed from: d  reason: collision with root package name */
    private String f44575d;

    /* renamed from: e  reason: collision with root package name */
    private SearchResultAdinfo f44576e;

    /* renamed from: b  reason: collision with root package name */
    private List<o> f44573b = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private g f44577f = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class a implements AdapterView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f44578a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f44579b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSubBusiness f44580c;

        a(Context context, List list, CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f44578a = context;
            this.f44579b = list;
            this.f44580c = collectionBeanSubBusiness;
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.d
        public void a(AdapterView<?> adapterView, View view, int i4, long j4) {
            try {
                Intent intent = new Intent(this.f44578a, ImagePagerActivity.class);
                String[] strArr = new String[this.f44579b.size()];
                for (int i5 = 0; i5 < this.f44579b.size(); i5++) {
                    strArr[i5] = (String) this.f44579b.get(i5);
                }
                if (com.join.mgps.Util.g2.i(this.f44580c.getVedio_url()) && i4 == 0) {
                    FullScreenActivity.VideoInfo videoInfo = new FullScreenActivity.VideoInfo();
                    videoInfo.m(this.f44580c.getVedio_url());
                    videoInfo.h(strArr[0]);
                    FullScreenActivity_.i0(this.f44578a).a(videoInfo).start();
                    return;
                }
                intent.putExtra("image_urls", strArr);
                intent.putExtra("image_index", i4);
                this.f44578a.startActivity(intent);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CollectionBeanSubBusiness f44582b;

        b(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f44582b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f44582b.getCrc_sign_id() != null) {
                IntentUtil.getInstance().goGameDetialActivity(view.getContext(), this.f44582b.getCrc_sign_id(), this.f44582b.getGame_info_tpl_type(), this.f44582b.getSp_tpl_two_position(), this.f44582b.get_from_type(), this.f44582b.getReMarks(), Where.search.name(), l5.this.A(), "");
                if (l5.this.f44577f != null) {
                    l5.this.f44577f.e(this.f44582b.getCrc_sign_id());
                    l5.this.f44577f.k(this.f44582b.getCrc_sign_id());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f44584b;

        c(int i4) {
            this.f44584b = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((SearchListActivity1) l5.this.f44574c).L0(this.f44584b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchIntegratedFavoriteBean.FavoriteBean f44586b;

        d(SearchIntegratedFavoriteBean.FavoriteBean favoriteBean) {
            this.f44586b = favoriteBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (l5.this.f44577f != null) {
                g gVar = l5.this.f44577f;
                Context context = view.getContext();
                gVar.n(context, this.f44586b.getId() + "", this.f44586b.getUid(), "0", "0");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchIntegratedPostBean.TopArea f44588b;

        e(SearchIntegratedPostBean.TopArea topArea) {
            this.f44588b = topArea;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumBean forumBean = new ForumBean();
            forumBean.setFid(this.f44588b.getFid());
            com.join.mgps.Util.j0.r0(view.getContext(), forumBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44590b;

        f(String str) {
            this.f44590b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (l5.this.f44577f != null) {
                l5.this.f44577f.f(this.f44590b);
            }
        }
    }

    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public interface g {
        void e(String str);

        void f(String str);

        void j(String str);

        void k(String str);

        void n(Context context, String str, String str2, String str3, String str4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class h extends u {

        /* renamed from: b  reason: collision with root package name */
        public ImageView f44592b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f44593c;

        h() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class i extends u {

        /* renamed from: b  reason: collision with root package name */
        public TextView f44595b;

        /* renamed from: c  reason: collision with root package name */
        public View f44596c;

        i() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class j extends u {
        j() {
            super();
        }
    }

    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    class k extends ClickableSpan implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        private final View.OnClickListener f44599b;

        public k(View.OnClickListener onClickListener) {
            this.f44599b = onClickListener;
        }

        @Override // android.text.style.ClickableSpan, android.view.View.OnClickListener
        public void onClick(View view) {
            this.f44599b.onClick(view);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(Color.parseColor("#FF4A4A4A"));
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class l implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        CollectionBeanSubBusiness f44601b;

        public l(CollectionBeanSubBusiness collectionBeanSubBusiness) {
            this.f44601b = collectionBeanSubBusiness;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = view.getContext();
            DownloadTask downloadTask = this.f44601b.getDownloadTask();
            if (downloadTask == null) {
                if (this.f44601b.getMod_info() == null && UtilsMy.o0(this.f44601b.getTag_info())) {
                    if (this.f44601b.getMod_info() == null) {
                        if (com.join.android.app.common.utils.e.l0(context).d(context, this.f44601b.getPackage_name())) {
                            APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, this.f44601b.getPackage_name());
                            if (!com.join.mgps.Util.g2.i(this.f44601b.getVer()) || l4.d() >= Integer.parseInt(this.f44601b.getVer())) {
                                com.join.android.app.common.utils.e.l0(context);
                                APKUtils.a0(context, this.f44601b.getPackage_name());
                                return;
                            }
                        }
                    } else {
                        boolean d5 = com.join.android.app.common.utils.e.l0(context).d(context, this.f44601b.getPackage_name());
                        boolean F = com.join.mgps.va.overmind.d.o().F(this.f44601b.getPackage_name());
                        if (d5 || F) {
                            com.join.android.app.common.utils.e.l0(context);
                            APKUtils.V(context, this.f44601b.getMod_info());
                            return;
                        }
                    }
                }
                UtilsMy.Y0(context, this.f44601b);
                return;
            }
            String plugin_num = this.f44601b.getPlugin_num();
            if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
                IntentDateBean intentDateBean = new IntentDateBean();
                ExtBean extBean = new ExtBean();
                extBean.setReMarks(this.f44601b.getReMarks());
                intentDateBean.setExtBean(extBean);
                intentDateBean.setLink_type(4);
                intentDateBean.setLink_type_val(this.f44601b.getDown_url_remote());
                UtilsMy.T2(downloadTask, context);
                IntentUtil.getInstance().intentActivity(context, intentDateBean);
                return;
            }
            int status = downloadTask != null ? downloadTask.getStatus() : 0;
            if (UtilsMy.w0(this.f44601b.getPay_tag_info(), this.f44601b.getCrc_sign_id()) > 0) {
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
                                        if (com.join.android.app.common.utils.j.j(context)) {
                                            downloadTask.setKeyword(l5.this.f44575d);
                                            l5.this.g(downloadTask);
                                            UtilsMy.r4(context, downloadTask);
                                            return;
                                        }
                                        com.join.mgps.Util.l2.a(context).b("无网络连接");
                                        return;
                                    } else if (status != 43) {
                                        switch (status) {
                                            case 9:
                                                if (com.join.android.app.common.utils.j.j(context)) {
                                                    downloadTask.setKeyword(l5.this.f44575d);
                                                    l5.this.g(downloadTask);
                                                    UtilsMy.I2(context, downloadTask);
                                                    return;
                                                }
                                                com.join.mgps.Util.l2.a(context).b("无网络连接");
                                                return;
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
                        downloadTask.setKeyword(l5.this.f44575d);
                        l5.this.g(downloadTask);
                        com.php25.PDownload.d.c(downloadTask, context);
                        return;
                    }
                    com.php25.PDownload.d.i(downloadTask);
                    return;
                }
                com.php25.PDownload.d.l(context, downloadTask);
                return;
            }
            downloadTask.setKeyword(l5.this.f44575d);
            l5.this.g(downloadTask);
            if (UtilsMy.y0(this.f44601b.getPay_tag_info(), this.f44601b.getCrc_sign_id()) > 0) {
                UtilsMy.d4(context, downloadTask.getCrc_link_type_val());
            } else {
                UtilsMy.y1(downloadTask, this.f44601b);
                if (!UtilsMy.o1(context, downloadTask)) {
                    if (this.f44601b.getDown_status() == 5) {
                        UtilsMy.l1(context, downloadTask);
                    } else {
                        UtilsMy.R0(context, downloadTask, this.f44601b.getTp_down_url(), this.f44601b.getOther_down_switch(), this.f44601b.getCdn_down_switch());
                    }
                }
                if (l5.this.f44577f != null) {
                    l5.this.f44577f.j(downloadTask.getCrc_link_type_val());
                }
            }
            if (l5.this.f44577f != null) {
                l5.this.f44577f.e(downloadTask.getCrc_link_type_val());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class m extends u {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f44603b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f44604c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f44605d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f44606e;

        /* renamed from: f  reason: collision with root package name */
        public View f44607f;

        m() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class n extends u {

        /* renamed from: b  reason: collision with root package name */
        public TextView f44609b;

        n() {
            super();
        }
    }

    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public static class o {

        /* renamed from: d  reason: collision with root package name */
        public static final int f44611d = 1;

        /* renamed from: e  reason: collision with root package name */
        public static final int f44612e = 2;

        /* renamed from: f  reason: collision with root package name */
        public static final int f44613f = 3;

        /* renamed from: g  reason: collision with root package name */
        public static final int f44614g = 4;

        /* renamed from: h  reason: collision with root package name */
        public static final int f44615h = 5;

        /* renamed from: i  reason: collision with root package name */
        public static final int f44616i = 6;

        /* renamed from: j  reason: collision with root package name */
        public static final int f44617j = 7;

        /* renamed from: k  reason: collision with root package name */
        public static final int f44618k = 8;

        /* renamed from: l  reason: collision with root package name */
        public static final int f44619l = 9;

        /* renamed from: m  reason: collision with root package name */
        public static final int f44620m = 10;

        /* renamed from: n  reason: collision with root package name */
        public static final int f44621n = 11;

        /* renamed from: o  reason: collision with root package name */
        public static final int f44622o = 12;

        /* renamed from: p  reason: collision with root package name */
        public static final int f44623p = 12;

        /* renamed from: a  reason: collision with root package name */
        public int f44624a;

        /* renamed from: b  reason: collision with root package name */
        public Object f44625b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f44626c;

        public o(int i4, Object obj) {
            this.f44624a = i4;
            this.f44625b = obj;
        }

        public o a(boolean z4) {
            this.f44626c = z4;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class p extends u {

        /* renamed from: b  reason: collision with root package name */
        public TextView f44627b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f44628c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f44629d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f44630e;

        /* renamed from: f  reason: collision with root package name */
        public View f44631f;

        /* renamed from: g  reason: collision with root package name */
        public View f44632g;

        /* renamed from: h  reason: collision with root package name */
        public View f44633h;

        p() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class q extends u {

        /* renamed from: b  reason: collision with root package name */
        public TextView f44635b;

        /* renamed from: c  reason: collision with root package name */
        public View f44636c;

        q() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class r extends u {

        /* renamed from: b  reason: collision with root package name */
        public Button f44638b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f44639c;

        /* renamed from: d  reason: collision with root package name */
        public View f44640d;

        r() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class s extends u {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f44642b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f44643c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f44644d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f44645e;

        s() {
            super();
        }
    }

    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class t {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f44647a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f44648b;

        /* renamed from: c  reason: collision with root package name */
        TextView f44649c;

        /* renamed from: d  reason: collision with root package name */
        TextView f44650d;

        /* renamed from: e  reason: collision with root package name */
        RelativeLayout f44651e;

        /* renamed from: f  reason: collision with root package name */
        TextView f44652f;

        /* renamed from: g  reason: collision with root package name */
        LinearLayout f44653g;

        /* renamed from: h  reason: collision with root package name */
        TextView f44654h;

        /* renamed from: i  reason: collision with root package name */
        LinearLayout f44655i;

        /* renamed from: j  reason: collision with root package name */
        public TextView f44656j;

        /* renamed from: k  reason: collision with root package name */
        public TextView f44657k;

        /* renamed from: l  reason: collision with root package name */
        public ProgressBar f44658l;

        /* renamed from: m  reason: collision with root package name */
        public ProgressBar f44659m;

        /* renamed from: n  reason: collision with root package name */
        RelativeLayout f44660n;

        /* renamed from: o  reason: collision with root package name */
        View f44661o;

        public t() {
        }
    }

    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    class u {
        u() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class v {

        /* renamed from: a  reason: collision with root package name */
        TextView f44664a;

        /* renamed from: b  reason: collision with root package name */
        TextView f44665b;

        public v(View view) {
            this.f44664a = (TextView) view.findViewById(R.id.tips);
            this.f44665b = (TextView) view.findViewById(R.id.titleText);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchListAdapter.java */
    /* loaded from: classes4.dex */
    public class w {

        /* renamed from: a  reason: collision with root package name */
        HListView f44667a;

        public w(View view) {
            this.f44667a = (HListView) view.findViewById(R.id.screenListView);
        }
    }

    public l5(Context context) {
        this.f44574c = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(int i4, View view) {
        ((SearchListActivity1) this.f44574c).L0(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(int i4, View view) {
        ((SearchListActivity1) this.f44574c).L0(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(String str, View view) {
        E(view.getContext(), str);
    }

    private View i(int i4, View view, ViewGroup viewGroup) {
        h hVar;
        if (view != null) {
            hVar = (h) view.getTag();
        } else {
            h hVar2 = new h();
            View inflate = LayoutInflater.from(this.f44574c).inflate(R.layout.mg_forum_search_item_all_no_more, viewGroup, false);
            hVar2.f44592b = (ImageView) inflate.findViewById(R.id.icon);
            hVar2.f44593c = (TextView) inflate.findViewById(R.id.name);
            inflate.setTag(hVar2);
            hVar = hVar2;
            view = inflate;
        }
        int intValue = ((Integer) getItem(i4)).intValue();
        if (intValue == 1) {
            hVar.f44592b.setImageResource(R.drawable.img_bg_game);
            hVar.f44593c.setText("未搜索到相应游戏\n已为您推荐其它游戏");
        } else if (intValue == 2) {
            hVar.f44592b.setImageResource(R.drawable.img_bg_dell);
            hVar.f44593c.setText("未搜索到相应游戏单\n已为您推荐热门游戏单");
        } else if (intValue == 3) {
            hVar.f44592b.setImageResource(R.drawable.img_bg_talk);
            hVar.f44593c.setText("未搜索到相应社区\n已为您推荐其他热门社区");
        }
        return view;
    }

    private View j(int i4, View view, ViewGroup viewGroup) {
        i iVar;
        if (view != null) {
            iVar = (i) view.getTag();
        } else {
            iVar = new i();
            view = LayoutInflater.from(this.f44574c).inflate(R.layout.mg_forum_search_item_all_section_title, (ViewGroup) null);
            iVar.f44595b = (TextView) view.findViewById(R.id.title);
            view.setTag(iVar);
        }
        final int intValue = ((Integer) getItem(i4)).intValue();
        if (intValue == 1) {
            iVar.f44595b.setText("游戏");
        } else if (intValue == 2) {
            iVar.f44595b.setText("游戏单");
        } else if (intValue == 3) {
            iVar.f44595b.setText("帖子");
        }
        iVar.f44595b.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.j5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                l5.this.B(intValue, view2);
            }
        });
        iVar.f44596c.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.i5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                l5.this.C(intValue, view2);
            }
        });
        return view;
    }

    private View k(int i4, View view, ViewGroup viewGroup) {
        if (view != null) {
            j jVar = (j) view.getTag();
        } else {
            j jVar2 = new j();
            View inflate = LayoutInflater.from(this.f44574c).inflate(R.layout.mg_forum_search_item_all_view_more, viewGroup, false);
            inflate.setTag(jVar2);
            view = inflate;
        }
        view.setOnClickListener(new c(((Integer) getItem(i4)).intValue()));
        return view;
    }

    private View l(int i4, View view, ViewGroup viewGroup) {
        m mVar;
        if (view != null) {
            mVar = (m) view.getTag();
        } else {
            mVar = new m();
            view = LayoutInflater.from(this.f44574c).inflate(R.layout.mg_forum_search_item_favorite_game_list, (ViewGroup) null);
            mVar.f44603b = (SimpleDraweeView) view.findViewById(R.id.icon);
            mVar.f44604c = (TextView) view.findViewById(R.id.name);
            mVar.f44605d = (TextView) view.findViewById(R.id.desc);
            mVar.f44606e = (TextView) view.findViewById(R.id.count);
            mVar.f44607f = view.findViewById(R.id.divider);
            view.setTag(mVar);
        }
        SearchIntegratedFavoriteBean.FavoriteBean favoriteBean = (SearchIntegratedFavoriteBean.FavoriteBean) getItem(i4);
        MyImageLoader.h(mVar.f44603b, favoriteBean.getPic());
        mVar.f44604c.setText(favoriteBean.getTitle());
        mVar.f44605d.setText(favoriteBean.getAuth_name());
        TextView textView = mVar.f44606e;
        textView.setText(favoriteBean.getGame_count() + "款");
        if (favoriteBean.isShowDivider()) {
            mVar.f44607f.setVisibility(0);
        } else {
            mVar.f44607f.setVisibility(8);
        }
        view.setOnClickListener(new d(favoriteBean));
        return view;
    }

    private View m(int i4, View view, ViewGroup viewGroup) {
        n nVar;
        if (view != null) {
            nVar = (n) view.getTag();
        } else {
            nVar = new n();
            view = LayoutInflater.from(this.f44574c).inflate(R.layout.mg_forum_search_item_favorite_top_area, (ViewGroup) null);
            nVar.f44609b = (TextView) view.findViewById(R.id.title);
            view.setTag(nVar);
        }
        try {
            String str = (String) getItem(i4);
            SpannableString spannableString = new SpannableString(String.format("包含%s的游戏单", str));
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FFF47500")), 2, str.length() + 2, 18);
            nVar.f44609b.setText(spannableString);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return view;
    }

    private View n(int i4, View view, ViewGroup viewGroup) {
        return z(i4, view, viewGroup);
    }

    private View o(int i4, View view, ViewGroup viewGroup) {
        return y(i4, view, viewGroup);
    }

    private View p(int i4, View view, ViewGroup viewGroup) {
        return x(i4, view, viewGroup);
    }

    private View t(int i4, View view, ViewGroup viewGroup) {
        p pVar;
        ForumBean.ForumSearchQueryBean forumSearchQueryBean;
        if (view != null) {
            pVar = (p) view.getTag();
        } else {
            pVar = new p();
            view = LayoutInflater.from(this.f44574c).inflate(R.layout.mg_forum_search_list_item_post_footer, (ViewGroup) null);
            pVar.f44628c = (TextView) view.findViewById(R.id.forum_post_view);
            pVar.f44629d = (TextView) view.findViewById(R.id.forum_post_commit);
            pVar.f44630e = (TextView) view.findViewById(R.id.forum_post_praise);
            pVar.f44631f = view.findViewById(R.id.viewParent);
            pVar.f44632g = view.findViewById(R.id.commentParent);
            pVar.f44633h = view.findViewById(R.id.forum_post_praise_parent);
            view.setTag(pVar);
        }
        try {
            forumSearchQueryBean = (ForumBean.ForumSearchQueryBean) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (forumSearchQueryBean == null) {
            return view;
        }
        com.join.mgps.Util.j0.D1(pVar.f44628c, forumSearchQueryBean.getView(), "0");
        com.join.mgps.Util.j0.D1(pVar.f44629d, forumSearchQueryBean.getComment(), "0");
        com.join.mgps.Util.j0.D1(pVar.f44630e, forumSearchQueryBean.getPraise(), "0");
        K(view, forumSearchQueryBean.getPid());
        return view;
    }

    private View u(int i4, View view, ViewGroup viewGroup) {
        q qVar;
        ForumBean.ForumSearchQueryBean forumSearchQueryBean;
        if (view != null) {
            qVar = (q) view.getTag();
        } else {
            qVar = new q();
            view = LayoutInflater.from(this.f44574c).inflate(R.layout.mg_forum_search_item_post_message, (ViewGroup) null);
            qVar.f44635b = (TextView) view.findViewById(R.id.forum_post_message);
            qVar.f44636c = view.findViewById(R.id.messageParent);
            view.setTag(qVar);
        }
        try {
            forumSearchQueryBean = (ForumBean.ForumSearchQueryBean) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (forumSearchQueryBean == null) {
            return view;
        }
        String message = forumSearchQueryBean.getMessage();
        String g4 = com.join.mgps.Util.g2.g(forumSearchQueryBean.getKeyword());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(message);
        int color = this.f44574c.getResources().getColor(R.color.search_high_light);
        int indexOf = message.indexOf(g4);
        int length = g4.length() + indexOf;
        try {
            if (length <= message.length() && indexOf >= 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(color), indexOf, length, 33);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        final String pid = forumSearchQueryBean.getPid();
        view.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.adapter.k5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                l5.this.D(pid, view2);
            }
        });
        qVar.f44635b.setText(spannableStringBuilder);
        try {
            int i5 = 0;
            if (forumSearchQueryBean.isShowDivider()) {
                qVar.f44635b.setTextColor(Color.parseColor("#3b3b3b"));
                qVar.f44635b.setTypeface(Typeface.DEFAULT, 1);
                i5 = qVar.f44635b.getResources().getDimensionPixelOffset(R.dimen.wdp36);
            } else {
                qVar.f44635b.setTextColor(Color.parseColor("#FF4A4A4A"));
                qVar.f44635b.setTypeface(Typeface.DEFAULT, 0);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) qVar.f44635b.getLayoutParams();
            layoutParams.topMargin = i5;
            qVar.f44635b.setLayoutParams(layoutParams);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        view.requestLayout();
        return view;
    }

    private View v(int i4, View view, ViewGroup viewGroup) {
        r rVar;
        ForumBean.ForumSearchQueryBean forumSearchQueryBean;
        if (view != null) {
            rVar = (r) view.getTag();
        } else {
            rVar = new r();
            view = LayoutInflater.from(this.f44574c).inflate(R.layout.mg_forum_search_item_post_subject, (ViewGroup) null);
            rVar.f44638b = (Button) view.findViewById(R.id.forum_post_best);
            rVar.f44639c = (TextView) view.findViewById(R.id.forum_post_subject);
            View findViewById = view.findViewById(R.id.subject_parent);
            rVar.f44640d = findViewById;
            findViewById.setPadding(findViewById.getPaddingLeft(), com.join.android.app.component.optimizetext.a.a(10.0f), rVar.f44640d.getPaddingRight(), rVar.f44640d.getPaddingBottom());
            view.setTag(rVar);
        }
        try {
            forumSearchQueryBean = (ForumBean.ForumSearchQueryBean) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (forumSearchQueryBean == null) {
            return view;
        }
        String subject = forumSearchQueryBean.getSubject();
        String g4 = com.join.mgps.Util.g2.g(forumSearchQueryBean.getKeyword());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(subject);
        int color = this.f44574c.getResources().getColor(R.color.search_high_light);
        int indexOf = subject.indexOf(g4);
        int length = g4.length() + indexOf;
        try {
            if (length <= subject.length() && indexOf >= 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(color), indexOf, length, 33);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        rVar.f44639c.setText(spannableStringBuilder);
        K(view, forumSearchQueryBean.getPid());
        return view;
    }

    private View w(int i4, View view, ViewGroup viewGroup) {
        s sVar;
        if (view != null) {
            sVar = (s) view.getTag();
        } else {
            sVar = new s();
            view = LayoutInflater.from(this.f44574c).inflate(R.layout.mg_forum_search_item_post_top_area, (ViewGroup) null);
            sVar.f44642b = (SimpleDraweeView) view.findViewById(R.id.icon);
            sVar.f44643c = (TextView) view.findViewById(R.id.name);
            sVar.f44644d = (TextView) view.findViewById(R.id.desc);
            sVar.f44645e = (TextView) view.findViewById(R.id.count);
            view.setTag(sVar);
        }
        SearchIntegratedPostBean.TopArea topArea = (SearchIntegratedPostBean.TopArea) getItem(i4);
        MyImageLoader.h(sVar.f44642b, topArea.getIcon_src());
        sVar.f44643c.setText(topArea.getName());
        sVar.f44644d.setText(topArea.getDescription());
        TextView textView = sVar.f44645e;
        textView.setText("今日更新:" + topArea.getToday_posts());
        view.setOnClickListener(new e(topArea));
        return view;
    }

    public String A() {
        return this.f44575d;
    }

    public void E(Context context, String str) {
        ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
        forumPostsBean.setPid(Integer.parseInt(str));
        com.join.mgps.Util.j0.v0(context, forumPostsBean);
    }

    public void F(g gVar) {
        this.f44577f = gVar;
    }

    public void G(SearchResultAdinfo searchResultAdinfo) {
        this.f44576e = searchResultAdinfo;
    }

    void H(View view, int i4) {
        if (view == null) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), i4);
    }

    public void I(List<o> list) {
        if (list == null) {
            return;
        }
        if (this.f44573b == null) {
            this.f44573b = new ArrayList();
        }
        this.f44573b.clear();
        this.f44573b.addAll(list);
    }

    public void J(List<o> list) {
        this.f44573b = list;
    }

    public void K(View view, String str) {
        view.setOnClickListener(new f(str));
    }

    public void L(String str) {
        this.f44575d = str;
    }

    void M(t tVar, Boolean bool, Boolean bool2) {
        if (bool.booleanValue()) {
            tVar.f44655i.setVisibility(8);
            tVar.f44658l.setVisibility(8);
            tVar.f44659m.setVisibility(8);
            tVar.f44653g.setVisibility(0);
            tVar.f44654h.setVisibility(0);
            return;
        }
        tVar.f44655i.setVisibility(0);
        if (bool2.booleanValue()) {
            tVar.f44658l.setVisibility(8);
            tVar.f44659m.setVisibility(0);
        } else {
            tVar.f44659m.setVisibility(8);
            tVar.f44658l.setVisibility(0);
        }
        tVar.f44653g.setVisibility(8);
        tVar.f44654h.setVisibility(8);
    }

    void g(DownloadTask downloadTask) {
        if (downloadTask == null) {
            return;
        }
        ExtBean extBean = new ExtBean();
        extBean.setFrom("103");
        extBean.setLocation(A());
        downloadTask.setExt(JsonMapper.toJsonString(extBean));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f44573b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        if (i4 < this.f44573b.size()) {
            return this.f44573b.get(i4).f44625b;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return i4 < this.f44573b.size() ? this.f44573b.get(i4).f44624a : super.getItemViewType(i4);
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == 3) {
            return t(i4, view, viewGroup);
        }
        if (itemViewType == 2) {
            return u(i4, view, viewGroup);
        }
        if (itemViewType == 1) {
            return v(i4, view, viewGroup);
        }
        if (itemViewType == 4) {
            return w(i4, view, viewGroup);
        }
        if (itemViewType == 5) {
            return m(i4, view, viewGroup);
        }
        if (itemViewType == 6) {
            return l(i4, view, viewGroup);
        }
        if (itemViewType == 7) {
            return p(i4, view, viewGroup);
        }
        if (itemViewType == 8) {
            return o(i4, view, viewGroup);
        }
        if (itemViewType == 9) {
            return n(i4, view, viewGroup);
        }
        if (itemViewType == 10) {
            return j(i4, view, viewGroup);
        }
        if (itemViewType == 11) {
            return i(i4, view, viewGroup);
        }
        return itemViewType == 12 ? k(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return super.getViewTypeCount() + 12;
    }

    public SearchResultAdinfo h() {
        return this.f44576e;
    }

    public List<o> q() {
        return this.f44573b;
    }

    public o r(int i4) {
        if (i4 < this.f44573b.size()) {
            return this.f44573b.get(i4);
        }
        return null;
    }

    public List<o> s() {
        return this.f44573b;
    }

    public View x(int i4, View view, ViewGroup viewGroup) {
        t tVar;
        View view2;
        RelativeLayout.LayoutParams layoutParams;
        if (view == null) {
            View inflate = LayoutInflater.from(this.f44574c).inflate(R.layout.app_listview_item1, (ViewGroup) null);
            t tVar2 = new t();
            tVar2.f44647a = (SimpleDraweeView) inflate.findViewById(R.id.mgListviewItemIcon);
            tVar2.f44648b = (ImageView) inflate.findViewById(R.id.giftPackageSwich);
            tVar2.f44649c = (TextView) inflate.findViewById(R.id.mgListviewItemAppname);
            tVar2.f44650d = (TextView) inflate.findViewById(R.id.adText);
            tVar2.f44660n = (RelativeLayout) inflate.findViewById(R.id.relateLayoutApp);
            tVar2.f44651e = (RelativeLayout) inflate.findViewById(R.id.rLayoutRight);
            tVar2.f44652f = (TextView) inflate.findViewById(R.id.mgListviewItemInstall);
            tVar2.f44653g = (LinearLayout) inflate.findViewById(R.id.tipsLayout);
            tVar2.f44654h = (TextView) inflate.findViewById(R.id.mgListviewItemDescribe);
            tVar2.f44650d = (TextView) inflate.findViewById(R.id.adText);
            tVar2.f44655i = (LinearLayout) inflate.findViewById(R.id.linearLayout2);
            tVar2.f44656j = (TextView) inflate.findViewById(R.id.appSize);
            tVar2.f44657k = (TextView) inflate.findViewById(R.id.loding_info);
            tVar2.f44658l = (ProgressBar) inflate.findViewById(R.id.progressBar);
            tVar2.f44659m = (ProgressBar) inflate.findViewById(R.id.progressBarZip);
            tVar2.f44661o = inflate.findViewById(R.id.line);
            inflate.setTag(tVar2);
            tVar = tVar2;
            view2 = inflate;
        } else {
            tVar = (t) view.getTag();
            view2 = view;
        }
        CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) getItem(i4);
        DownloadTask downloadTask = collectionBeanSubBusiness.getDownloadTask();
        Context context = this.f44574c;
        o r4 = r(i4);
        if (r4 != null && r4.f44626c) {
            tVar.f44661o.setVisibility(0);
            if (tVar.f44661o.getLayoutParams() != null) {
                layoutParams = (RelativeLayout.LayoutParams) tVar.f44661o.getLayoutParams();
            } else {
                layoutParams = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
            }
            layoutParams.leftMargin = context.getResources().getDimensionPixelOffset(R.dimen.wdp34);
            layoutParams.rightMargin = context.getResources().getDimensionPixelOffset(R.dimen.wdp34);
            tVar.f44661o.setLayoutParams(layoutParams);
        } else {
            tVar.f44661o.setVisibility(8);
        }
        tVar.f44649c.setText(collectionBeanSubBusiness.getGame_name());
        tVar.f44649c.setTypeface(Typeface.DEFAULT, 0);
        tVar.f44654h.setText(collectionBeanSubBusiness.getInfo());
        tVar.f44660n.setOnClickListener(new b(collectionBeanSubBusiness));
        if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getIco_remote())) {
            MyImageLoader.h(tVar.f44647a, collectionBeanSubBusiness.getIco_remote().trim());
        }
        if (collectionBeanSubBusiness.getGift_package_switch() == 1) {
            tVar.f44648b.setVisibility(0);
        } else {
            tVar.f44648b.setVisibility(8);
        }
        long parseDouble = (long) (Double.parseDouble(collectionBeanSubBusiness.getSize()) * 1024.0d * 1024.0d);
        if (collectionBeanSubBusiness.isAd()) {
            UtilsMy.L(collectionBeanSubBusiness.getScore(), collectionBeanSubBusiness.getDown_count(), collectionBeanSubBusiness.getSize(), collectionBeanSubBusiness.getSp_tag_info(), tVar.f44653g, context);
        } else {
            UtilsMy.I(collectionBeanSubBusiness.getScore(), collectionBeanSubBusiness.getDown_count(), collectionBeanSubBusiness.getSize(), collectionBeanSubBusiness.getSp_tag_info(), collectionBeanSubBusiness.getTag_info(), tVar.f44653g, context);
        }
        UtilsMy.j3(collectionBeanSubBusiness.getSp_tag_info(), view2, downloadTask);
        String plugin_num = collectionBeanSubBusiness.getPlugin_num();
        if (plugin_num.equals(ConstantIntEnum.H5.value() + "")) {
            tVar.f44652f.setBackgroundResource(R.drawable.recom_blue_butn);
            tVar.f44652f.setText("开始");
            tVar.f44652f.setTextColor(context.getResources().getColor(R.color.app_blue_color));
            tVar.f44653g.setVisibility(8);
            tVar.f44648b.setVisibility(8);
        } else if (downloadTask == null) {
            M(tVar, Boolean.TRUE, Boolean.FALSE);
            if (UtilsMy.o0(collectionBeanSubBusiness.getTag_info())) {
                if (com.join.android.app.common.utils.e.l0(context).d(context, collectionBeanSubBusiness.getPackage_name()) && UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) == 0) {
                    APKUtils.a l4 = com.join.android.app.common.utils.e.l0(context).l(context, collectionBeanSubBusiness.getPackage_name());
                    if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getVer()) && l4.d() < Integer.parseInt(collectionBeanSubBusiness.getVer())) {
                        tVar.f44652f.setBackgroundResource(R.drawable.recom_green_butn);
                        tVar.f44652f.setText("更新");
                        tVar.f44652f.setTextColor(context.getResources().getColor(R.color.app_green_color));
                    } else {
                        tVar.f44652f.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        tVar.f44652f.setText(context.getResources().getString(R.string.download_status_finished));
                        tVar.f44652f.setTextColor(context.getResources().getColor(R.color.app_main_color));
                    }
                } else {
                    tVar.f44652f.setBackgroundResource(R.drawable.recom_green_butn);
                    UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                    UtilsMy.Z2(tVar.f44652f, tVar.f44651e, collectionBeanSubBusiness);
                }
            } else {
                tVar.f44652f.setBackgroundResource(R.drawable.recom_green_butn);
                UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
                UtilsMy.Z2(tVar.f44652f, tVar.f44651e, collectionBeanSubBusiness);
            }
        } else {
            int status = UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id()) > 0 ? 43 : downloadTask.getStatus();
            if (status != 0) {
                if (status == 27) {
                    tVar.f44652f.setText("暂停中");
                } else if (status == 48) {
                    tVar.f44652f.setBackgroundResource(R.drawable.recom_blue_butn);
                    tVar.f44652f.setText("安装中");
                    tVar.f44652f.setTextColor(context.getResources().getColor(R.color.app_blue_color));
                    M(tVar, Boolean.TRUE, Boolean.FALSE);
                } else if (status != 2) {
                    if (status != 3) {
                        if (status != 5) {
                            if (status != 6) {
                                if (status != 7) {
                                    if (status != 42) {
                                        if (status != 43) {
                                            switch (status) {
                                                case 9:
                                                    tVar.f44652f.setBackgroundResource(R.drawable.recom_green_butn);
                                                    tVar.f44652f.setText("更新");
                                                    tVar.f44652f.setTextColor(context.getResources().getColor(R.color.app_green_color));
                                                    M(tVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 10:
                                                    tVar.f44652f.setBackgroundResource(R.drawable.recom_blue_butn);
                                                    tVar.f44652f.setText("等待");
                                                    tVar.f44652f.setTextColor(context.getResources().getColor(R.color.app_blue_color));
                                                    Boolean bool = Boolean.FALSE;
                                                    M(tVar, bool, bool);
                                                    try {
                                                        TextView textView = tVar.f44656j;
                                                        textView.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                        tVar.f44658l.setProgress((int) downloadTask.getProgress());
                                                    } catch (Exception e5) {
                                                        e5.printStackTrace();
                                                    }
                                                    tVar.f44657k.setText("等待中");
                                                    break;
                                                case 11:
                                                    tVar.f44652f.setBackgroundResource(R.drawable.recom_green_butn);
                                                    tVar.f44652f.setText("安装");
                                                    tVar.f44652f.setTextColor(context.getResources().getColor(R.color.app_green_color));
                                                    M(tVar, Boolean.TRUE, Boolean.FALSE);
                                                    break;
                                                case 12:
                                                    M(tVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView2 = tVar.f44656j;
                                                    textView2.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    tVar.f44657k.setText("解压中..");
                                                    tVar.f44659m.setProgress((int) downloadTask.getProgress());
                                                    tVar.f44652f.setBackgroundResource(R.drawable.extract);
                                                    tVar.f44652f.setText("解压中");
                                                    tVar.f44652f.setTextColor(context.getResources().getColor(R.color.app_grey_color));
                                                    break;
                                                case 13:
                                                    M(tVar, Boolean.FALSE, Boolean.TRUE);
                                                    TextView textView3 = tVar.f44656j;
                                                    textView3.setText(UtilsMy.a(parseDouble) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                                                    tVar.f44657k.setText("点击重新解压");
                                                    tVar.f44659m.setProgress((int) downloadTask.getProgress());
                                                    tVar.f44652f.setBackgroundResource(R.drawable.reextract);
                                                    tVar.f44652f.setText("解压");
                                                    tVar.f44652f.setTextColor(context.getResources().getColor(R.color.app_blue_color));
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        tVar.f44652f.setBackgroundResource(R.drawable.recom_maincolor_butn);
                        tVar.f44652f.setText(context.getResources().getString(R.string.download_status_finished));
                        tVar.f44652f.setTextColor(context.getResources().getColor(R.color.app_main_color));
                        M(tVar, Boolean.TRUE, Boolean.FALSE);
                    }
                    tVar.f44652f.setBackgroundResource(R.drawable.recom_blue_butn);
                    tVar.f44652f.setText("继续");
                    tVar.f44652f.setTextColor(context.getResources().getColor(R.color.app_blue_color));
                    Boolean bool2 = Boolean.FALSE;
                    M(tVar, bool2, bool2);
                    try {
                        TextView textView4 = tVar.f44656j;
                        textView4.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                        tVar.f44658l.setProgress((int) downloadTask.getProgress());
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    tVar.f44657k.setText("暂停中");
                } else {
                    UtilsMy.x4(downloadTask);
                    tVar.f44652f.setBackgroundResource(R.drawable.recom_blue_butn);
                    tVar.f44652f.setText("暂停");
                    tVar.f44652f.setTextColor(context.getResources().getColor(R.color.app_blue_color));
                    Boolean bool3 = Boolean.FALSE;
                    M(tVar, bool3, bool3);
                    TextView textView5 = tVar.f44656j;
                    textView5.setText(UtilsMy.a(downloadTask.getCurrentSize()) + net.lingala.zip4j.util.e.F0 + UtilsMy.a(parseDouble));
                    TextView textView6 = tVar.f44657k;
                    textView6.setText(downloadTask.getSpeed() + "/S");
                    tVar.f44658l.setProgress((int) downloadTask.getProgress());
                }
            }
            tVar.f44652f.setBackgroundResource(R.drawable.recom_green_butn);
            UtilsMy.w0(collectionBeanSubBusiness.getPay_tag_info(), collectionBeanSubBusiness.getCrc_sign_id());
            UtilsMy.Z2(tVar.f44652f, tVar.f44651e, collectionBeanSubBusiness);
            M(tVar, Boolean.TRUE, Boolean.FALSE);
        }
        tVar.f44651e.setOnClickListener(new l(collectionBeanSubBusiness));
        return view2;
    }

    public View y(int i4, View view, ViewGroup viewGroup) {
        w wVar;
        boolean z4;
        Context context = this.f44574c;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.gamedetail_item_viewpage1, (ViewGroup) null);
            wVar = new w(view);
            view.setTag(wVar);
        } else {
            wVar = (w) view.getTag();
        }
        CollectionBeanSubBusiness collectionBeanSubBusiness = (CollectionBeanSubBusiness) getItem(i4);
        ArrayList arrayList = new ArrayList();
        if (arrayList.size() == 0) {
            if (com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getVedio_cover_pic()) && com.join.mgps.Util.g2.i(collectionBeanSubBusiness.getVedio_url())) {
                arrayList.add(collectionBeanSubBusiness.getVedio_cover_pic());
                z4 = true;
            } else {
                z4 = false;
            }
            List<DetialShowImageBean> pic_info = collectionBeanSubBusiness.getPic_info();
            if (pic_info != null) {
                for (int i5 = 0; i5 < pic_info.size(); i5++) {
                    arrayList.add(pic_info.get(i5).getRemote().getPath());
                }
            }
            if (arrayList.size() == 0) {
                wVar.f44667a.setVisibility(8);
            } else {
                wVar.f44667a.setVisibility(0);
                int pic_position = collectionBeanSubBusiness.getPic_position();
                wVar.f44667a.setAdapter((ListAdapter) new p0(context, pic_position, arrayList, z4));
                if (pic_position == 1) {
                    wVar.f44667a.setDividerWidth(context.getResources().getDimensionPixelSize(R.dimen.wdp10));
                    wVar.f44667a.postInvalidate();
                } else {
                    wVar.f44667a.setDividerWidth(context.getResources().getDimensionPixelSize(R.dimen.wdp20));
                    wVar.f44667a.postInvalidate();
                }
                wVar.f44667a.setOnItemClickListener(new a(context, arrayList, collectionBeanSubBusiness));
            }
        }
        return view;
    }

    public View z(int i4, View view, ViewGroup viewGroup) {
        v vVar;
        String str;
        if (view == null) {
            view = LayoutInflater.from(this.f44574c).inflate(R.layout.search_ad_title_view, (ViewGroup) null, false);
            vVar = new v(view);
            view.setTag(vVar);
        } else {
            vVar = (v) view.getTag();
        }
        if (this.f44576e != null) {
            view.setVisibility(0);
            vVar.f44664a.setText(this.f44576e.getLabel());
            int length = this.f44576e.getLabel() == null ? 0 : this.f44576e.getLabel().length();
            if (length == 2) {
                str = "\u3000\u3000 ";
            } else if (length == 3) {
                str = "\u3000\u3000\u3000";
            } else if (length == 4) {
                str = "\u3000\u3000\u3000\u3000";
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(" ");
                int i5 = ((length * 2) / 3) + 1;
                String str2 = "";
                for (int i6 = 0; i6 < i5; i6++) {
                    stringBuffer.append("\u3000");
                    str2 = stringBuffer.toString();
                }
                str = str2;
            }
            TextView textView = vVar.f44665b;
            textView.setText(str + this.f44576e.getTitle());
        } else {
            view.setVisibility(8);
        }
        return view;
    }
}
