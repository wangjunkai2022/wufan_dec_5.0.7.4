package com.join.mgps.adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.adapter.InformationAdapter;
import com.join.mgps.customview.CopyTextView;
import com.join.mgps.customview.CopyTextViewNew;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.CommentDetailBean;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class CommentDetailAdapter extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    private Context f40063b;

    /* renamed from: c  reason: collision with root package name */
    private List<j> f40064c;

    /* renamed from: d  reason: collision with root package name */
    h f40065d;

    /* loaded from: classes4.dex */
    public enum ViewType {
        TITLE,
        COMMENT,
        REPLY
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.MainCommentBean f40066b;

        a(CommentDetailBean.MainCommentBean mainCommentBean) {
            this.f40066b = mainCommentBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(Integer.parseInt(this.f40066b.getUid())).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.MainCommentBean f40068b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40069c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f40070d;

        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                long longValue = Long.valueOf(b.this.f40070d.getText().toString()).longValue();
                TextView textView = b.this.f40070d;
                textView.setText((longValue + 1) + "");
                b bVar = b.this;
                CommentDetailAdapter.this.c(bVar.f40069c);
                b bVar2 = b.this;
                h hVar = CommentDetailAdapter.this.f40065d;
                if (hVar != null) {
                    hVar.X(bVar2.f40068b, bVar2.f40069c, 1);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        b(CommentDetailBean.MainCommentBean mainCommentBean, int i4, TextView textView) {
            this.f40068b = mainCommentBean;
            this.f40069c = i4;
            this.f40070d = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentDetailBean.MainCommentBean mainCommentBean;
            if (IntentUtil.getInstance().goLoginInteractive(CommentDetailAdapter.this.f40063b) || (mainCommentBean = this.f40068b) == null) {
                return;
            }
            if (mainCommentBean.getIs_praise() == 1) {
                CommentDetailAdapter.this.q(this.f40069c);
                ((ImageView) view).setImageResource(R.drawable.up_ic);
                h hVar = CommentDetailAdapter.this.f40065d;
                if (hVar != null) {
                    hVar.X(this.f40068b, this.f40069c, 2);
                    return;
                }
                return;
            }
            this.f40068b.setIs_praise(1);
            if (AccountUtil_.getInstance_(CommentDetailAdapter.this.f40063b).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(CommentDetailAdapter.this.f40063b);
                return;
            }
            ((ImageView) view).setImageResource(R.drawable.like);
            Animation loadAnimation = AnimationUtils.loadAnimation(CommentDetailAdapter.this.f40063b, R.anim.scale_reset);
            view.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40073b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.MainCommentBean.SubCommentBean f40074c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f40075d;

        c(int i4, CommentDetailBean.MainCommentBean.SubCommentBean subCommentBean, int i5) {
            this.f40073b = i4;
            this.f40074c = subCommentBean;
            this.f40075d = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            int i4 = this.f40073b;
            while (true) {
                if (i4 < 0) {
                    str = "";
                    break;
                } else if (((j) CommentDetailAdapter.this.f40064c.get(i4)).b() == ViewType.COMMENT) {
                    str = ((j.a) ((j) CommentDetailAdapter.this.f40064c.get(i4)).a()).f40113a.getId();
                    break;
                } else {
                    i4--;
                }
            }
            h hVar = CommentDetailAdapter.this.f40065d;
            if (hVar != null) {
                hVar.m(this.f40074c, this.f40075d, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.MainCommentBean f40077b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40078c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CopyTextView f40079d;

        d(CommentDetailBean.MainCommentBean mainCommentBean, int i4, CopyTextView copyTextView) {
            this.f40077b = mainCommentBean;
            this.f40078c = i4;
            this.f40079d = copyTextView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar = CommentDetailAdapter.this.f40065d;
            if (hVar != null) {
                hVar.p(this.f40077b, this.f40078c);
            }
            this.f40079d.clearFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40081b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40082c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f40083d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j.b f40084e;

        e(int i4, int i5, String str, j.b bVar) {
            this.f40081b = i4;
            this.f40082c = i5;
            this.f40083d = str;
            this.f40084e = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f40081b == 0) {
                return;
            }
            CommentDetailBean.MainCommentBean mainCommentBean = new CommentDetailBean.MainCommentBean();
            ArrayList arrayList = new ArrayList();
            for (int i4 = this.f40081b; i4 >= 0; i4--) {
                j jVar = (j) CommentDetailAdapter.this.f40064c.get(this.f40082c - i4);
                j.b bVar = jVar.b() == ViewType.REPLY ? (j.b) jVar.a() : null;
                if (bVar != null && this.f40083d == bVar.f40114a) {
                    arrayList.addAll(bVar.f40115b.getSub_comment());
                }
            }
            for (int i5 = 0; i5 <= this.f40081b; i5++) {
                CommentDetailAdapter.this.f40064c.remove(this.f40082c - i5);
            }
            mainCommentBean.setSub_comment(arrayList);
            CommentDetailAdapter.this.f40064c.add(this.f40082c - this.f40081b, CommentDetailAdapter.this.d(this.f40083d, mainCommentBean, this.f40084e.f40116c, true));
            CommentDetailAdapter.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f40086b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CommentDetailBean.MainCommentBean f40087c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f40088d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j.b f40089e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f40090f;

        f(int i4, CommentDetailBean.MainCommentBean mainCommentBean, String str, j.b bVar, int i5) {
            this.f40086b = i4;
            this.f40087c = mainCommentBean;
            this.f40088d = str;
            this.f40089e = bVar;
            this.f40090f = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int i4 = 0;
            int i5 = 0;
            boolean z4 = false;
            while (i4 < this.f40086b) {
                CommentDetailBean.MainCommentBean mainCommentBean = new CommentDetailBean.MainCommentBean(this.f40087c);
                List<CommentDetailBean.MainCommentBean.SubCommentBean> sub_comment = mainCommentBean.getSub_comment();
                ArrayList arrayList = new ArrayList();
                int i6 = i4 + 3;
                if (i6 < sub_comment.size()) {
                    arrayList.addAll(sub_comment.subList(i4, i6));
                } else {
                    arrayList.addAll(sub_comment.subList(i4, sub_comment.size()));
                    z4 = true;
                }
                mainCommentBean.setSub_comment(arrayList);
                j d5 = CommentDetailAdapter.this.d(this.f40088d, mainCommentBean, this.f40089e.f40116c, i5 == 0);
                j.b bVar = (j.b) d5.a();
                bVar.f40118e = i5;
                bVar.f40119f = z4;
                bVar.f40117d = i5 == 0;
                CommentDetailAdapter.this.k(d5, !z4);
                CommentDetailAdapter.this.f40064c.add(this.f40090f + i5 + 1, d5);
                i5++;
                i4 = i6;
            }
            CommentDetailAdapter.this.f40064c.remove(this.f40090f);
            CommentDetailAdapter.this.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends l {

        /* renamed from: b  reason: collision with root package name */
        private RelativeLayout f40092b;

        /* renamed from: c  reason: collision with root package name */
        private SimpleDraweeView f40093c;

        /* renamed from: d  reason: collision with root package name */
        private VipView f40094d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f40095e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f40096f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f40097g;

        /* renamed from: h  reason: collision with root package name */
        private CopyTextView f40098h;

        /* renamed from: i  reason: collision with root package name */
        private CopyTextViewNew f40099i;

        /* renamed from: j  reason: collision with root package name */
        private TextView f40100j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f40101k;

        /* renamed from: l  reason: collision with root package name */
        public View f40102l;

        g() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public interface h {
        void X(CommentDetailBean.MainCommentBean mainCommentBean, int i4, int i5);

        void m(CommentDetailBean.MainCommentBean.SubCommentBean subCommentBean, int i4, String str);

        void p(CommentDetailBean.MainCommentBean mainCommentBean, int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i extends l {

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f40104b;

        /* renamed from: c  reason: collision with root package name */
        public View f40105c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f40106d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f40107e;

        /* renamed from: f  reason: collision with root package name */
        public View f40108f;

        /* renamed from: g  reason: collision with root package name */
        public View f40109g;

        i() {
            super();
        }
    }

    /* loaded from: classes4.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        ViewType f40111a;

        /* renamed from: b  reason: collision with root package name */
        Object f40112b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public CommentDetailBean.MainCommentBean f40113a;

            public a(CommentDetailBean.MainCommentBean mainCommentBean) {
                this.f40113a = mainCommentBean;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f40114a;

            /* renamed from: b  reason: collision with root package name */
            public CommentDetailBean.MainCommentBean f40115b;

            /* renamed from: c  reason: collision with root package name */
            public int f40116c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f40117d;

            /* renamed from: e  reason: collision with root package name */
            public int f40118e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f40119f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f40120g;

            public b(String str, CommentDetailBean.MainCommentBean mainCommentBean, int i4, boolean z4) {
                this.f40114a = str;
                this.f40115b = mainCommentBean;
                this.f40116c = i4;
                this.f40117d = z4;
            }
        }

        public j() {
        }

        public Object a() {
            return this.f40112b;
        }

        public ViewType b() {
            return this.f40111a;
        }

        public void c(Object obj) {
            this.f40112b = obj;
        }

        public void d(ViewType viewType) {
            this.f40111a = viewType;
        }

        public j(ViewType viewType, Object obj) {
            this.f40111a = viewType;
            this.f40112b = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k {

        /* renamed from: a  reason: collision with root package name */
        private TextView f40121a;

        k() {
        }
    }

    /* loaded from: classes4.dex */
    class l {
        l() {
        }
    }

    public CommentDetailAdapter(Context context, List<j> list, h hVar) {
        this.f40065d = null;
        this.f40063b = context;
        this.f40064c = list;
        this.f40065d = hVar;
    }

    private View g(int i4, View view, ViewGroup viewGroup) {
        i iVar;
        j.b bVar;
        try {
            if (view != null) {
                iVar = (i) view.getTag();
            } else {
                iVar = new i();
                view = LayoutInflater.from(this.f40063b).inflate(R.layout.detail_comment_activity_item_comment_message_reply, (ViewGroup) null);
                iVar.f40104b = (LinearLayout) view.findViewById(R.id.comment_reply_container);
                iVar.f40105c = view.findViewById(R.id.comment_reply_divider);
                iVar.f40106d = (TextView) view.findViewById(R.id.comment_reply_content);
                iVar.f40107e = (TextView) view.findViewById(R.id.comment_reply_more);
                iVar.f40108f = view.findViewById(R.id.line);
                iVar.f40109g = view.findViewById(R.id.bottom);
                view.setTag(iVar);
            }
            bVar = (j.b) getItem(i4);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (bVar == null || bVar.f40115b == null) {
            return view;
        }
        if (bVar.f40117d) {
            iVar.f40105c.setVisibility(0);
        } else {
            iVar.f40105c.setVisibility(8);
        }
        if (!bVar.f40120g) {
            iVar.f40108f.setVisibility(0);
            iVar.f40109g.setVisibility(0);
        } else {
            iVar.f40108f.setVisibility(8);
            iVar.f40109g.setVisibility(8);
        }
        List<CommentDetailBean.MainCommentBean.SubCommentBean> sub_comment = bVar.f40115b.getSub_comment();
        if (sub_comment != null && sub_comment.size() != 0) {
            i(iVar.f40104b, bVar, true, i4);
        } else {
            iVar.f40104b.removeAllViews();
        }
        return view;
    }

    private void i(View view, j.b bVar, boolean z4, int i4) {
        int i5;
        List<CommentDetailBean.MainCommentBean.SubCommentBean> list;
        int i6;
        boolean z5;
        View view2;
        int i7;
        CommentDetailBean.MainCommentBean mainCommentBean;
        CommentDetailAdapter commentDetailAdapter;
        List<CommentDetailBean.MainCommentBean.SubCommentBean> list2;
        LinearLayout linearLayout;
        String[] split;
        CommentDetailAdapter commentDetailAdapter2 = this;
        String str = bVar.f40114a;
        int i8 = bVar.f40118e;
        boolean z6 = bVar.f40119f;
        CommentDetailBean.MainCommentBean mainCommentBean2 = bVar.f40115b;
        List<CommentDetailBean.MainCommentBean.SubCommentBean> sub_comment = mainCommentBean2.getSub_comment();
        LinearLayout linearLayout2 = (LinearLayout) view;
        linearLayout2.removeAllViews();
        int size = sub_comment.size();
        int i9 = 0;
        while (i9 < size + 1) {
            if (i9 <= 3 || !z4) {
                View inflate = LayoutInflater.from(commentDetailAdapter2.f40063b).inflate(R.layout.comment_reply_item, (ViewGroup) null);
                LinearLayout linearLayout3 = linearLayout2;
                inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                TextView textView = (TextView) inflate.findViewById(R.id.comment_reply_content);
                TextView textView2 = (TextView) inflate.findViewById(R.id.comment_reply_more);
                if ((i9 != size || size <= 3) && !(i8 > 0 && z6 && i9 == size)) {
                    i5 = i9;
                    list = sub_comment;
                    i6 = i8;
                    z5 = z6;
                    view2 = inflate;
                    i7 = size;
                    if (i5 == 3 && z4 && i7 > 3) {
                        textView.setVisibility(8);
                        textView2.setVisibility(0);
                        textView2.setText(textView2.getResources().getString(R.string.comment_item_content_more, Integer.valueOf(i7 - 3)));
                        commentDetailAdapter = this;
                        mainCommentBean = mainCommentBean2;
                        view2.setOnClickListener(new f(i7, mainCommentBean2, str, bVar, i4));
                    } else {
                        mainCommentBean = mainCommentBean2;
                        if (i5 >= i7 || (i5 >= 3 && z4)) {
                            commentDetailAdapter = this;
                            list2 = list;
                            linearLayout = linearLayout3;
                        } else {
                            textView.setVisibility(0);
                            textView2.setVisibility(8);
                            CommentDetailBean.MainCommentBean.SubCommentBean subCommentBean = list.get(i5);
                            String content = subCommentBean.getContent();
                            try {
                                String str2 = subCommentBean.getUser_name() + " ";
                                String str3 = "";
                                if (content.contains(":")) {
                                    String[] split2 = content.split(":");
                                    if (split2.length == 2) {
                                        try {
                                            if (split2[0].contains("@")) {
                                                if (!split2[0].split("@")[1].equals("")) {
                                                    str3 = " " + split[1];
                                                }
                                            }
                                            com.join.mgps.Util.j0.v1(textView, str2, subCommentBean.getVip_level(), subCommentBean.getSvip_level(), str3, subCommentBean.getReply_vip_level(), subCommentBean.getReply_svip_level(), split2[1]);
                                        } catch (Exception e5) {
                                            e = e5;
                                            commentDetailAdapter = this;
                                            list2 = list;
                                            e.printStackTrace();
                                            linearLayout = linearLayout3;
                                            linearLayout.addView(view2);
                                            linearLayout2 = linearLayout;
                                            commentDetailAdapter2 = commentDetailAdapter;
                                            sub_comment = list2;
                                            size = i7;
                                            z6 = z5;
                                            i8 = i6;
                                            mainCommentBean2 = mainCommentBean;
                                            i9 = i5 + 1;
                                        }
                                    } else {
                                        com.join.mgps.Util.j0.v1(textView, str2, subCommentBean.getVip_level(), subCommentBean.getSvip_level(), "", subCommentBean.getReply_vip_level(), subCommentBean.getReply_svip_level(), content);
                                    }
                                } else {
                                    com.join.mgps.Util.j0.v1(textView, str2, subCommentBean.getVip_level(), subCommentBean.getSvip_level(), "", subCommentBean.getReply_vip_level(), subCommentBean.getReply_svip_level(), content);
                                }
                                commentDetailAdapter = this;
                                list2 = list;
                            } catch (Exception e6) {
                                e = e6;
                            }
                            try {
                                commentDetailAdapter.n(view2, subCommentBean, mainCommentBean.getPn(), i4);
                            } catch (Exception e7) {
                                e = e7;
                                e.printStackTrace();
                                linearLayout = linearLayout3;
                                linearLayout.addView(view2);
                                linearLayout2 = linearLayout;
                                commentDetailAdapter2 = commentDetailAdapter;
                                sub_comment = list2;
                                size = i7;
                                z6 = z5;
                                i8 = i6;
                                mainCommentBean2 = mainCommentBean;
                                i9 = i5 + 1;
                            }
                            linearLayout = linearLayout3;
                            linearLayout.addView(view2);
                        }
                    }
                } else {
                    textView.setVisibility(8);
                    textView2.setVisibility(0);
                    textView2.setText("收起");
                    i5 = i9;
                    commentDetailAdapter = this;
                    z5 = z6;
                    int i10 = i8;
                    i7 = size;
                    i6 = i8;
                    view2 = inflate;
                    list = sub_comment;
                    view2.setOnClickListener(new e(i10, i4, str, bVar));
                    mainCommentBean = mainCommentBean2;
                }
                list2 = list;
                linearLayout = linearLayout3;
                linearLayout.addView(view2);
            } else {
                i5 = i9;
                linearLayout = linearLayout2;
                mainCommentBean = mainCommentBean2;
                commentDetailAdapter = commentDetailAdapter2;
                i6 = i8;
                z5 = z6;
                i7 = size;
                list2 = sub_comment;
            }
            linearLayout2 = linearLayout;
            commentDetailAdapter2 = commentDetailAdapter;
            sub_comment = list2;
            size = i7;
            z6 = z5;
            i8 = i6;
            mainCommentBean2 = mainCommentBean;
            i9 = i5 + 1;
        }
    }

    private void n(View view, CommentDetailBean.MainCommentBean.SubCommentBean subCommentBean, int i4, int i5) {
        view.setOnClickListener(new c(i5, subCommentBean, i4));
    }

    private void o(View view, TextView textView, CommentDetailBean.MainCommentBean mainCommentBean, int i4) {
        view.setOnClickListener(new b(mainCommentBean, i4, textView));
    }

    private void p(View view, CommentDetailBean.MainCommentBean mainCommentBean, int i4, CopyTextView copyTextView) {
        view.setOnClickListener(new d(mainCommentBean, i4, copyTextView));
    }

    public void c(int i4) {
        j.a aVar = (j.a) getItem(i4);
        if (aVar == null) {
            return;
        }
        long longValue = Long.valueOf(aVar.f40113a.getPraise_count()).longValue();
        aVar.f40113a.setIs_praise(1);
        CommentDetailBean.MainCommentBean mainCommentBean = aVar.f40113a;
        mainCommentBean.setPraise_count((longValue + 1) + "");
        notifyDataSetChanged();
    }

    j d(String str, CommentDetailBean.MainCommentBean mainCommentBean, int i4, boolean z4) {
        return new j(ViewType.REPLY, new j.b(str, mainCommentBean, i4, z4));
    }

    public View e(int i4, View view, ViewGroup viewGroup, int i5) {
        j.a aVar = (j.a) getItem(i4);
        g gVar = null;
        if (view == null) {
            if (i5 == 1) {
                k kVar = new k();
                View inflate = LayoutInflater.from(this.f40063b).inflate(R.layout.gameinformation_comment_item_title, (ViewGroup) null);
                kVar.f40121a = (TextView) inflate.findViewById(R.id.title);
                inflate.setTag(kVar);
                view = inflate;
            } else if (i5 == 2) {
                g gVar2 = new g();
                View inflate2 = LayoutInflater.from(this.f40063b).inflate(R.layout.detail_commit_item_layout, (ViewGroup) null);
                gVar2.f40092b = (RelativeLayout) inflate2.findViewById(R.id.main);
                gVar2.f40093c = (SimpleDraweeView) inflate2.findViewById(R.id.usericon);
                gVar2.f40094d = (VipView) inflate2.findViewById(R.id.levelTv);
                gVar2.f40095e = (ImageView) inflate2.findViewById(R.id.parise);
                gVar2.f40096f = (TextView) inflate2.findViewById(R.id.username);
                gVar2.f40097g = (TextView) inflate2.findViewById(R.id.time);
                gVar2.f40098h = (CopyTextView) inflate2.findViewById(R.id.content);
                gVar2.f40099i = (CopyTextViewNew) inflate2.findViewById(R.id.contentWeb);
                gVar2.f40101k = (TextView) inflate2.findViewById(R.id.pariseNumber);
                gVar2.f40100j = (TextView) inflate2.findViewById(R.id.isConnoisseurs);
                gVar2.f40102l = inflate2.findViewById(R.id.line0);
                inflate2.setTag(gVar2);
                gVar = gVar2;
                view = inflate2;
            }
        } else if (i5 == 1) {
            k kVar2 = (k) view.getTag();
        } else if (i5 == 2) {
            gVar = (g) view.getTag();
        }
        if (aVar == null) {
            return view;
        }
        CommentDetailBean.MainCommentBean mainCommentBean = aVar.f40113a;
        if (i5 == 2) {
            gVar.f40097g.setText(com.join.android.app.common.utils.g.a(Long.parseLong(mainCommentBean.getAdd_times() + "000")));
            gVar.f40096f.setTextColor(-16777216);
            if (mainCommentBean.getVip_level() > 0) {
                gVar.f40096f.setTextColor(this.f40063b.getResources().getColor(R.color.vip_color));
            }
            if (mainCommentBean.getSvip_level() > 0) {
                gVar.f40096f.setTextColor(this.f40063b.getResources().getColor(R.color.vip_svip_color));
            }
            gVar.f40094d.setVipData(mainCommentBean.getVip_level(), mainCommentBean.getSvip_level());
            String content = mainCommentBean.getContent();
            if (content.contains(":") && !content.endsWith(":")) {
                content = content.split(":")[1];
            }
            gVar.f40099i.setText(content);
            TextView textView = gVar.f40101k;
            textView.setText(mainCommentBean.getPraise_count() + "");
            if (mainCommentBean.getIs_praise() == 1) {
                gVar.f40095e.setImageResource(R.drawable.like);
            } else {
                gVar.f40095e.setImageResource(R.drawable.unlike);
            }
            UtilsMy.s3(this.f40063b, mainCommentBean.getHead_portrait(), gVar.f40093c);
            gVar.f40093c.setOnClickListener(new a(mainCommentBean));
            gVar.f40096f.setText(Html.fromHtml(mainCommentBean.getUser_name()));
            if (mainCommentBean.getRank().equals("")) {
                gVar.f40100j.setVisibility(8);
            } else {
                gVar.f40100j.setVisibility(0);
                gVar.f40100j.setText(mainCommentBean.getRank());
            }
            if (i4 == 0) {
                gVar.f40102l.setVisibility(8);
            } else {
                gVar.f40102l.setVisibility(0);
            }
            o(gVar.f40095e, gVar.f40101k, mainCommentBean, i4);
            p(view, mainCommentBean, i4, gVar.f40098h);
            p(gVar.f40099i, mainCommentBean, i4, gVar.f40098h);
        }
        return view;
    }

    public List<j> f() {
        return this.f40064c;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        List<j> list = this.f40064c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        List<j> list = this.f40064c;
        if (list == null || i4 >= list.size()) {
            return null;
        }
        return this.f40064c.get(i4).a();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        List<j> list = this.f40064c;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.COMMENT.ordinal()) {
            return e(i4, view, viewGroup, 2);
        }
        if (itemViewType == ViewType.TITLE.ordinal()) {
            return e(i4, view, viewGroup, 1);
        }
        return itemViewType == InformationAdapter.ViewType.REPLY.ordinal() ? g(i4, view, viewGroup) : view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return ViewType.values().length;
    }

    public h h() {
        return this.f40065d;
    }

    public void j(int i4) {
        j.a aVar = (j.a) getItem(i4);
        if (aVar == null) {
            return;
        }
        long longValue = Long.valueOf(aVar.f40113a.getPraise_count()).longValue();
        if (aVar.f40113a.getIs_praise() == 1) {
            aVar.f40113a.setIs_praise(0);
            long j4 = longValue - 1;
            if (j4 < 0) {
                aVar.f40113a.setPraise_count("0");
            } else {
                CommentDetailBean.MainCommentBean mainCommentBean = aVar.f40113a;
                mainCommentBean.setPraise_count(j4 + "");
            }
        } else {
            aVar.f40113a.setIs_praise(1);
            CommentDetailBean.MainCommentBean mainCommentBean2 = aVar.f40113a;
            mainCommentBean2.setPraise_count((longValue + 1) + "");
        }
        notifyDataSetChanged();
    }

    void k(j jVar, boolean z4) {
        if (jVar == null) {
            return;
        }
        try {
            ((j.b) jVar.a()).f40120g = z4;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void l(List<j> list) {
        if (list == null) {
            return;
        }
        if (this.f40064c == null) {
            list = new ArrayList<>();
        }
        this.f40064c.clear();
        this.f40064c.addAll(list);
    }

    public void m(h hVar) {
        this.f40065d = hVar;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public void q(int i4) {
        j.a aVar = (j.a) getItem(i4);
        if (aVar == null) {
            return;
        }
        long longValue = Long.valueOf(aVar.f40113a.getPraise_count()).longValue();
        aVar.f40113a.setIs_praise(0);
        long j4 = longValue - 1;
        if (j4 < 0) {
            aVar.f40113a.setPraise_count("0");
        } else {
            CommentDetailBean.MainCommentBean mainCommentBean = aVar.f40113a;
            mainCommentBean.setPraise_count(j4 + "");
        }
        notifyDataSetChanged();
    }

    public CommentDetailAdapter(Context context) {
        this.f40065d = null;
        this.f40063b = context;
        this.f40064c = new ArrayList();
    }
}
