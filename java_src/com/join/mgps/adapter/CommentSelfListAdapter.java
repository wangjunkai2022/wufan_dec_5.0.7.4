package com.join.mgps.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.GameAndProfileActivity_;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.FavoritesCenterData;
import it.sephiroth.android.library.widget.HListView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class CommentSelfListAdapter extends BaseAdapter {

    /* renamed from: c  reason: collision with root package name */
    private Context f40125c;

    /* renamed from: e  reason: collision with root package name */
    private int f40127e;

    /* renamed from: b  reason: collision with root package name */
    private final String f40124b = getClass().getSimpleName();

    /* renamed from: f  reason: collision with root package name */
    j f40128f = null;

    /* renamed from: d  reason: collision with root package name */
    private List<k> f40126d = new ArrayList();

    /* loaded from: classes4.dex */
    public enum ViewType {
        FAVORITES_TITLE,
        FAVORITES_ITEM_TITLE,
        FAVORITES_F,
        COMMENT_LIST_ITEM_HEADER,
        COMMENT_LIST_ITEM_CONTENT,
        COMMENT_LIST_ITEM_FOOTER
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameAndProfileActivity_.h0(view.getContext()).a(0).b(CommentSelfListAdapter.this.f40127e).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GameAndProfileActivity_.h0(view.getContext()).a(1).b(CommentSelfListAdapter.this.f40127e).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f40131b;

        c(g gVar) {
            this.f40131b = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f40131b.f40146c.getText().toString().equals("查看更多")) {
                this.f40131b.f40145b.setMaxLines(Integer.MAX_VALUE);
                this.f40131b.f40146c.setText("收起");
                return;
            }
            this.f40131b.f40145b.setMaxLines(7);
            this.f40131b.f40146c.setText("查看更多");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40133b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f40134c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f40135d;

        d(int i4, String str, int i5) {
            this.f40133b = i4;
            this.f40134c = str;
            this.f40135d = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.startAnimation(AnimationUtils.loadAnimation(CommentSelfListAdapter.this.f40125c, R.anim.scale_reset));
            j jVar = CommentSelfListAdapter.this.f40128f;
            if (jVar != null) {
                jVar.b(this.f40133b, this.f40134c, this.f40135d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40137b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f40138c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f40139d;

        e(int i4, String str, int i5) {
            this.f40137b = i4;
            this.f40138c = str;
            this.f40139d = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            view.startAnimation(AnimationUtils.loadAnimation(CommentSelfListAdapter.this.f40125c, R.anim.scale_reset));
            j jVar = CommentSelfListAdapter.this.f40128f;
            if (jVar != null) {
                jVar.a(this.f40137b, this.f40138c, this.f40139d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40141b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f40142c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f40143d;

        f(int i4, String str, String str2) {
            this.f40141b = i4;
            this.f40142c = str;
            this.f40143d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil intentUtil = IntentUtil.getInstance();
            Context context = view.getContext();
            intentUtil.goCommentDetailActivity(context, this.f40141b + "", this.f40142c, this.f40143d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends l {

        /* renamed from: b  reason: collision with root package name */
        public TextView f40145b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40146c;

        g() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h extends l {

        /* renamed from: b  reason: collision with root package name */
        public TextView f40148b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40149c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f40150d;

        /* renamed from: e  reason: collision with root package name */
        public ImageView f40151e;

        /* renamed from: f  reason: collision with root package name */
        public ImageView f40152f;

        /* renamed from: g  reason: collision with root package name */
        public View f40153g;

        /* renamed from: h  reason: collision with root package name */
        public View f40154h;

        h() {
            super();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i extends l {

        /* renamed from: b  reason: collision with root package name */
        public SimpleDraweeView f40156b;

        /* renamed from: c  reason: collision with root package name */
        public TextView f40157c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f40158d;

        /* renamed from: e  reason: collision with root package name */
        public MStarBar f40159e;

        /* renamed from: f  reason: collision with root package name */
        public View f40160f;

        /* renamed from: g  reason: collision with root package name */
        public View f40161g;

        i() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public interface j {
        void a(int i4, String str, int i5);

        void b(int i4, String str, int i5);

        void c(int i4, String str, String str2);
    }

    /* loaded from: classes4.dex */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        ViewType f40163a;

        /* renamed from: b  reason: collision with root package name */
        Object f40164b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f40165a;

            /* renamed from: b  reason: collision with root package name */
            public String f40166b;

            /* renamed from: c  reason: collision with root package name */
            public String f40167c;

            /* renamed from: d  reason: collision with root package name */
            public int f40168d;

            /* renamed from: e  reason: collision with root package name */
            public int f40169e;

            public a(int i4, String str, String str2, int i5, int i6) {
                this.f40165a = i4;
                this.f40166b = str;
                this.f40167c = str2;
                this.f40168d = i5;
                this.f40169e = i6;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public int f40170a;

            /* renamed from: b  reason: collision with root package name */
            public String f40171b;

            /* renamed from: c  reason: collision with root package name */
            public int f40172c;

            /* renamed from: d  reason: collision with root package name */
            public int f40173d;

            /* renamed from: e  reason: collision with root package name */
            public int f40174e;

            /* renamed from: f  reason: collision with root package name */
            public int f40175f;

            /* renamed from: g  reason: collision with root package name */
            public int f40176g;

            /* renamed from: h  reason: collision with root package name */
            public int f40177h;

            /* renamed from: i  reason: collision with root package name */
            public int f40178i;

            public b(int i4, String str, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                this.f40170a = i4;
                this.f40171b = str;
                this.f40172c = i5;
                this.f40173d = i6;
                this.f40174e = i7;
                this.f40175f = i8;
                this.f40176g = i9;
                this.f40177h = i10;
                this.f40178i = i11;
            }
        }

        /* loaded from: classes4.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public boolean f40179a;

            /* renamed from: b  reason: collision with root package name */
            public int f40180b;

            /* renamed from: c  reason: collision with root package name */
            public String f40181c;

            /* renamed from: d  reason: collision with root package name */
            public String f40182d;

            /* renamed from: e  reason: collision with root package name */
            public String f40183e;

            /* renamed from: f  reason: collision with root package name */
            public int f40184f;

            /* renamed from: g  reason: collision with root package name */
            public long f40185g;

            /* renamed from: h  reason: collision with root package name */
            public double f40186h;

            /* renamed from: i  reason: collision with root package name */
            public int f40187i;

            public c(boolean z4, int i4, String str, String str2, String str3, int i5, long j4, double d5, int i6) {
                this.f40179a = z4;
                this.f40180b = i4;
                this.f40181c = str;
                this.f40182d = str2;
                this.f40183e = str3;
                this.f40184f = i5;
                this.f40185g = j4;
                this.f40186h = d5;
                this.f40187i = i6;
            }
        }

        public k() {
        }

        public Object a() {
            return this.f40164b;
        }

        public ViewType b() {
            return this.f40163a;
        }

        public void c(Object obj) {
            this.f40164b = obj;
        }

        public void d(ViewType viewType) {
            this.f40163a = viewType;
        }

        public k(ViewType viewType, Object obj) {
            this.f40163a = viewType;
            this.f40164b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class l {
        l() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class m {

        /* renamed from: a  reason: collision with root package name */
        HListView f40189a;

        public m(View view) {
            this.f40189a = (HListView) view.findViewById(R.id.favoriteList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class n {

        /* renamed from: a  reason: collision with root package name */
        ImageView f40191a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f40192b;

        /* renamed from: c  reason: collision with root package name */
        TextView f40193c;

        /* renamed from: d  reason: collision with root package name */
        ImageView f40194d;

        /* renamed from: e  reason: collision with root package name */
        ImageView f40195e;

        /* renamed from: f  reason: collision with root package name */
        TextView f40196f;

        /* renamed from: g  reason: collision with root package name */
        LinearLayout f40197g;

        /* renamed from: h  reason: collision with root package name */
        VipView f40198h;

        public n(View view) {
            this.f40191a = (ImageView) view.findViewById(R.id.titleImg);
            this.f40192b = (SimpleDraweeView) view.findViewById(R.id.userIcon);
            this.f40193c = (TextView) view.findViewById(R.id.userName);
            this.f40196f = (TextView) view.findViewById(R.id.tipName);
            this.f40197g = (LinearLayout) view.findViewById(R.id.tipsLayout);
            this.f40194d = (ImageView) view.findViewById(R.id.vip);
            this.f40198h = (VipView) view.findViewById(R.id.svip);
            this.f40195e = (ImageView) view.findViewById(R.id.sexImg);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class o {

        /* renamed from: a  reason: collision with root package name */
        public TextView f40200a;

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f40201b;

        /* renamed from: c  reason: collision with root package name */
        public View f40202c;

        /* renamed from: d  reason: collision with root package name */
        public View f40203d;

        public o(View view) {
            this.f40200a = (TextView) view.findViewById(R.id.titleText);
            this.f40203d = view.findViewById(R.id.line_h);
            this.f40201b = (LinearLayout) view.findViewById(R.id.look_other);
            this.f40202c = view.findViewById(R.id.layoutTop);
        }
    }

    public CommentSelfListAdapter(Context context) {
        this.f40125c = context;
    }

    private View e(int i4, View view, ViewGroup viewGroup) {
        g gVar;
        k.a aVar;
        if (view != null) {
            gVar = (g) view.getTag();
        } else {
            gVar = new g();
            view = LayoutInflater.from(this.f40125c).inflate(R.layout.comment_list_item_content, (ViewGroup) null);
            gVar.f40145b = (TextView) view.findViewById(R.id.content);
            gVar.f40146c = (TextView) view.findViewById(R.id.more);
            view.setTag(gVar);
        }
        try {
            aVar = (k.a) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (aVar == null) {
            return view;
        }
        gVar.f40145b.setText(aVar.f40167c);
        if (gVar.f40145b.getLineCount() > 7) {
            gVar.f40146c.setVisibility(0);
            gVar.f40146c.setOnClickListener(new c(gVar));
        } else {
            gVar.f40146c.setVisibility(8);
        }
        String str = "0";
        if (aVar.f40168d != 1 && aVar.f40169e == 1) {
            str = "1";
        }
        p(view, aVar.f40165a, aVar.f40166b, str);
        return view;
    }

    private View f(int i4, View view, ViewGroup viewGroup) {
        h hVar;
        k.b bVar;
        if (view != null) {
            hVar = (h) view.getTag();
        } else {
            hVar = new h();
            view = LayoutInflater.from(this.f40125c).inflate(R.layout.comment_list_item_footer, (ViewGroup) null);
            hVar.f40148b = (TextView) view.findViewById(R.id.likeCount);
            hVar.f40149c = (TextView) view.findViewById(R.id.unlikeCount);
            hVar.f40150d = (TextView) view.findViewById(R.id.viewCount);
            hVar.f40151e = (ImageView) view.findViewById(R.id.like);
            hVar.f40152f = (ImageView) view.findViewById(R.id.unlike);
            hVar.f40153g = view.findViewById(R.id.llLike);
            hVar.f40154h = view.findViewById(R.id.llUnlike);
            view.setTag(hVar);
        }
        try {
            bVar = (k.b) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null) {
            return view;
        }
        hVar.f40148b.setText(com.join.mgps.Util.j0.R(bVar.f40172c));
        hVar.f40149c.setText(com.join.mgps.Util.j0.R(bVar.f40173d));
        hVar.f40150d.setText(com.join.mgps.Util.j0.R(bVar.f40174e));
        String str = "0";
        if (bVar.f40177h != 1 && bVar.f40178i == 1) {
            str = "1";
        }
        p(view, bVar.f40170a, bVar.f40171b, str);
        if (bVar.f40175f == 1) {
            hVar.f40151e.setImageResource(R.drawable.uped_ic);
        } else {
            hVar.f40151e.setImageResource(R.drawable.up_ic);
        }
        if (bVar.f40176g == 1) {
            hVar.f40152f.setImageResource(R.drawable.downed_ic);
        } else {
            hVar.f40152f.setImageResource(R.drawable.down_ic);
        }
        int i5 = bVar.f40170a;
        String str2 = bVar.f40171b;
        hVar.f40153g.setOnClickListener(new d(i5, str2, bVar.f40175f == 1 ? 2 : 1));
        hVar.f40154h.setOnClickListener(new e(i5, str2, bVar.f40176g == 1 ? 2 : 1));
        return view;
    }

    private View g(int i4, View view, ViewGroup viewGroup) {
        i iVar;
        k.c cVar;
        if (view != null) {
            iVar = (i) view.getTag();
        } else {
            iVar = new i();
            view = LayoutInflater.from(this.f40125c).inflate(R.layout.comment_list_item_header, (ViewGroup) null);
            iVar.f40156b = (SimpleDraweeView) view.findViewById(R.id.usericon);
            iVar.f40157c = (TextView) view.findViewById(R.id.addTime);
            iVar.f40160f = view.findViewById(R.id.divider);
            iVar.f40158d = (TextView) view.findViewById(R.id.username);
            iVar.f40159e = (MStarBar) view.findViewById(R.id.comment_head_mstarBar);
            iVar.f40161g = view.findViewById(R.id.commentAllRootLl);
            view.setTag(iVar);
        }
        try {
            cVar = (k.c) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (cVar == null) {
            return view;
        }
        if (cVar.f40179a) {
            iVar.f40160f.setVisibility(8);
        } else {
            iVar.f40160f.setVisibility(0);
        }
        String str = "0";
        if (cVar.f40187i != 1 && cVar.f40184f == 1) {
            iVar.f40159e.setVisibility(0);
            str = "1";
            iVar.f40159e.setStarCount((int) cVar.f40186h);
            iVar.f40159e.setStarMark(cVar.f40186h);
            iVar.f40159e.setEnabled(false);
            MyImageLoader.h(iVar.f40156b, cVar.f40182d);
            iVar.f40158d.setText(cVar.f40183e);
            iVar.f40157c.setText(com.join.android.app.common.utils.g.a(cVar.f40185g * 1000));
            p(iVar.f40161g, cVar.f40180b, cVar.f40181c, str);
            return view;
        }
        iVar.f40159e.setVisibility(4);
        iVar.f40159e.setStarCount((int) cVar.f40186h);
        iVar.f40159e.setStarMark(cVar.f40186h);
        iVar.f40159e.setEnabled(false);
        MyImageLoader.h(iVar.f40156b, cVar.f40182d);
        iVar.f40158d.setText(cVar.f40183e);
        iVar.f40157c.setText(com.join.android.app.common.utils.g.a(cVar.f40185g * 1000));
        p(iVar.f40161g, cVar.f40180b, cVar.f40181c, str);
        return view;
    }

    private View h(int i4, View view, ViewGroup viewGroup) {
        m mVar;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detial_favortis_layout, (ViewGroup) null);
            mVar = new m(view);
            view.setTag(mVar);
        } else {
            mVar = (m) view.getTag();
        }
        mVar.f40189a.setAdapter((ListAdapter) new com.join.mgps.adapter.i(this.f40125c, (List) getItem(i4), 2));
        return view;
    }

    private View j(int i4, View view, ViewGroup viewGroup) {
        o oVar;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gamedetail_item_title, (ViewGroup) null);
            oVar = new o(view);
            view.setTag(oVar);
        } else {
            oVar = (o) view.getTag();
        }
        int intValue = ((Integer) getItem(i4)).intValue();
        String str = "订阅的游戏单";
        if (intValue == 1) {
            oVar.f40201b.setVisibility(8);
        } else if (intValue == 2) {
            oVar.f40201b.setVisibility(0);
            oVar.f40201b.setOnClickListener(new a());
        } else {
            if (intValue == 3) {
                oVar.f40201b.setVisibility(8);
            } else if (intValue == 4) {
                oVar.f40201b.setVisibility(0);
                oVar.f40201b.setOnClickListener(new b());
            } else {
                oVar.f40201b.setVisibility(8);
                str = "点评的游戏";
            }
            oVar.f40200a.setText(str);
            oVar.f40203d.setVisibility(8);
            return view;
        }
        str = "创建的游戏单";
        oVar.f40200a.setText(str);
        oVar.f40203d.setVisibility(8);
        return view;
    }

    private View l(int i4, View view, ViewGroup viewGroup) {
        n nVar;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.favoriose_title_layout, (ViewGroup) null);
            nVar = new n(view);
            view.setTag(nVar);
        } else {
            nVar = (n) view.getTag();
        }
        FavoritesCenterData.MemberInfoBean memberInfoBean = (FavoritesCenterData.MemberInfoBean) getItem(i4);
        MyImageLoader.h(nVar.f40192b, memberInfoBean.getPortrait());
        nVar.f40193c.setText(memberInfoBean.getNick_name());
        if (com.join.mgps.Util.g2.i(memberInfoBean.getRank())) {
            nVar.f40196f.setText(memberInfoBean.getRank());
            nVar.f40196f.setVisibility(0);
        } else {
            nVar.f40196f.setVisibility(8);
        }
        if ("1".equals(memberInfoBean.getSex())) {
            nVar.f40195e.setImageResource(R.drawable.favorite_sex_men);
        } else {
            nVar.f40195e.setImageResource(R.drawable.favorite_sex_wumen);
        }
        int vip = memberInfoBean.getVip();
        int svip = memberInfoBean.getSvip();
        if (vip > 0) {
            nVar.f40194d.setVisibility(0);
        } else {
            nVar.f40194d.setVisibility(8);
        }
        if (svip > 0) {
            nVar.f40198h.setVipData(0, svip);
        }
        String tag_info = memberInfoBean.getTag_info();
        if (com.join.mgps.Util.g2.i(tag_info)) {
            String[] split = tag_info.split(",");
            nVar.f40197g.removeAllViews();
            for (String str : split) {
                View inflate = LayoutInflater.from(this.f40125c).inflate(R.layout.favoritecenter_item_tipitem, (ViewGroup) null);
                nVar.f40197g.addView(inflate);
                ((TextView) inflate.findViewById(R.id.tipText)).setText(str);
            }
        }
        return view;
    }

    public void c(k kVar) {
        if (kVar == null) {
            return;
        }
        if (this.f40126d == null) {
            this.f40126d = new ArrayList();
        }
        this.f40126d.add(kVar);
    }

    public void d(List<k> list) {
        if (list == null) {
            return;
        }
        if (this.f40126d == null) {
            this.f40126d = new ArrayList();
        }
        this.f40126d.addAll(list);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<k> list = this.f40126d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<k> list = this.f40126d;
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
        List<k> list = this.f40126d;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.COMMENT_LIST_ITEM_HEADER.ordinal()) {
            return g(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.COMMENT_LIST_ITEM_CONTENT.ordinal()) {
            return e(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.COMMENT_LIST_ITEM_FOOTER.ordinal()) {
            return f(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.FAVORITES_ITEM_TITLE.ordinal()) {
            return j(i4, view, viewGroup);
        }
        if (itemViewType == ViewType.FAVORITES_TITLE.ordinal()) {
            return l(i4, view, viewGroup);
        }
        return itemViewType == ViewType.FAVORITES_F.ordinal() ? h(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    public List<k> i() {
        return this.f40126d;
    }

    public List<k> k() {
        return this.f40126d;
    }

    public void m(List<k> list) {
        if (list == null) {
            return;
        }
        if (this.f40126d == null) {
            list = new ArrayList<>();
        }
        this.f40126d.clear();
        this.f40126d.addAll(list);
    }

    public void n(List<k> list) {
        if (list == null) {
            return;
        }
        if (this.f40126d == null) {
            this.f40126d = new ArrayList();
        }
        this.f40126d.clear();
        this.f40126d.addAll(list);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public void o(j jVar) {
        this.f40128f = jVar;
    }

    void p(View view, int i4, String str, String str2) {
        if (view == null) {
            return;
        }
        view.setOnClickListener(new f(i4, str, str2));
    }

    public CommentSelfListAdapter(Context context, int i4) {
        this.f40125c = context;
        this.f40127e = i4;
    }
}
