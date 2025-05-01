package com.join.mgps.activity.message;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.f2;
import com.join.mgps.Util.l2;
import com.join.mgps.activity.CommentDetailActivity_;
import com.join.mgps.activity.GivePraiceActivity_;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.CommentCreateArgs;
import com.join.mgps.dto.CommentCreateBean;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.CommentTokenBean;
import com.join.mgps.dto.GameReplyMessageListBean;
import com.join.mgps.dto.MessageRedPointBean;
import com.join.mgps.pref.PrefDef_;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.wufan.user.service.protobuf.n0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EFragment(R.layout.fragment_communtity)
/* loaded from: classes4.dex */
public class MessagePriaceFragment extends Fragment {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f39290b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    PtrClassicFrameLayout f39291c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    XListView2 f39292d;

    /* renamed from: e  reason: collision with root package name */
    f f39293e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f39294f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f39295g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f39296h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f39297i;

    /* renamed from: j  reason: collision with root package name */
    com.join.mgps.rpc.e f39298j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.rpc.f f39299k;

    /* renamed from: l  reason: collision with root package name */
    Context f39300l;
    @Pref

    /* renamed from: n  reason: collision with root package name */
    PrefDef_ f39302n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    Button f39303o;

    /* renamed from: q  reason: collision with root package name */
    private n0 f39305q;

    /* renamed from: r  reason: collision with root package name */
    List<g> f39306r;

    /* renamed from: s  reason: collision with root package name */
    List<GameReplyMessageListBean.MessagesBean.DataBean> f39307s;

    /* renamed from: u  reason: collision with root package name */
    PopupWindow f39309u;

    /* renamed from: v  reason: collision with root package name */
    InputFilter[] f39310v;

    /* renamed from: x  reason: collision with root package name */
    View f39312x;

    /* renamed from: y  reason: collision with root package name */
    View f39313y;

    /* renamed from: z  reason: collision with root package name */
    EditText f39314z;

    /* renamed from: m  reason: collision with root package name */
    int f39301m = 1;

    /* renamed from: p  reason: collision with root package name */
    boolean f39304p = true;

    /* renamed from: t  reason: collision with root package name */
    boolean f39308t = false;

    /* renamed from: w  reason: collision with root package name */
    boolean f39311w = false;

    /* loaded from: classes4.dex */
    class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            MessagePriaceFragment.this.V();
            MessagePriaceFragment.this.a0();
        }
    }

    /* loaded from: classes4.dex */
    class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            MessagePriaceFragment.this.V();
            MessagePriaceFragment messagePriaceFragment = MessagePriaceFragment.this;
            messagePriaceFragment.f39301m = 1;
            messagePriaceFragment.a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupWindow popupWindow = MessagePriaceFragment.this.f39309u;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            MessagePriaceFragment.this.f39309u.dismiss();
            MessagePriaceFragment.this.f39304p = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameReplyMessageListBean.MessagesBean.DataBean f39319b;

        e(GameReplyMessageListBean.MessagesBean.DataBean dataBean) {
            this.f39319b = dataBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MessagePriaceFragment.this.f39309u.dismiss();
            MessagePriaceFragment messagePriaceFragment = MessagePriaceFragment.this;
            messagePriaceFragment.h0(messagePriaceFragment.f39314z.getText().toString().trim(), this.f39319b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        Context f39321b;

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameReplyMessageListBean.MessagesBean.DataBean f39323b;

            a(GameReplyMessageListBean.MessagesBean.DataBean dataBean) {
                this.f39323b = dataBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MessagePriaceFragment.this.k0(this.f39323b);
            }
        }

        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameReplyMessageListBean.MessagesBean.DataBean f39325b;

            b(GameReplyMessageListBean.MessagesBean.DataBean dataBean) {
                this.f39325b = dataBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CommentDetailActivity_.z d5 = CommentDetailActivity_.M1(f.this.f39321b).d(this.f39325b.getGame_id());
                CommentDetailActivity_.z g4 = d5.b(this.f39325b.getOriginal_text_id() + "").f("").a(1).e(0).h(1).g("");
                g4.c(this.f39325b.getComment_score_switch() + "").start();
            }
        }

        /* loaded from: classes4.dex */
        class c implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameReplyMessageListBean.MessagesBean.DataBean f39327b;

            c(GameReplyMessageListBean.MessagesBean.DataBean dataBean) {
                this.f39327b = dataBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MessagePriaceFragment.this.k0(this.f39327b);
            }
        }

        /* loaded from: classes4.dex */
        class d implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GameReplyMessageListBean.MessagesBean.DataBean f39329b;

            d(GameReplyMessageListBean.MessagesBean.DataBean dataBean) {
                this.f39329b = dataBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CommentDetailActivity_.z d5 = CommentDetailActivity_.M1(f.this.f39321b).d(this.f39329b.getGame_id());
                CommentDetailActivity_.z g4 = d5.b(this.f39329b.getOriginal_text_id() + "").f("").a(1).e(0).h(1).g("");
                g4.c(this.f39329b.getComment_score_switch() + "").start();
            }
        }

        /* loaded from: classes4.dex */
        class e {

            /* renamed from: a  reason: collision with root package name */
            RelativeLayout f39331a;

            /* renamed from: b  reason: collision with root package name */
            SimpleDraweeView f39332b;

            /* renamed from: c  reason: collision with root package name */
            TextView f39333c;

            /* renamed from: d  reason: collision with root package name */
            TextView f39334d;

            /* renamed from: e  reason: collision with root package name */
            TextView f39335e;

            e() {
            }
        }

        /* renamed from: com.join.mgps.activity.message.MessagePriaceFragment$f$f  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class C0336f {

            /* renamed from: a  reason: collision with root package name */
            TextView f39337a;

            C0336f() {
            }
        }

        /* loaded from: classes4.dex */
        class g {

            /* renamed from: a  reason: collision with root package name */
            TextView f39339a;

            /* renamed from: b  reason: collision with root package name */
            LinearLayout f39340b;

            g() {
            }
        }

        /* loaded from: classes4.dex */
        class h {

            /* renamed from: a  reason: collision with root package name */
            LinearLayout f39342a;

            /* renamed from: b  reason: collision with root package name */
            TextView f39343b;

            h() {
            }
        }

        /* loaded from: classes4.dex */
        class i {

            /* renamed from: a  reason: collision with root package name */
            TextView f39345a;

            /* renamed from: b  reason: collision with root package name */
            RelativeLayout f39346b;

            i() {
            }
        }

        public f(Context context) {
            this.f39321b = context;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return MessagePriaceFragment.this.f39306r.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return MessagePriaceFragment.this.f39306r.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return MessagePriaceFragment.this.f39306r.get(i4).f39349b;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            e eVar;
            View view2;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String substring;
            i iVar;
            View view3;
            g gVar;
            View view4;
            h hVar;
            View view5;
            String str6;
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 1) {
                if (itemViewType == 2) {
                    if (view == null) {
                        view2 = LayoutInflater.from(this.f39321b).inflate(R.layout.community_iconitem, (ViewGroup) null);
                        eVar = new e();
                        eVar.f39331a = (RelativeLayout) view2.findViewById(R.id.rl_icon);
                        eVar.f39332b = (SimpleDraweeView) view2.findViewById(R.id.simv);
                        eVar.f39333c = (TextView) view2.findViewById(R.id.tv_name);
                        eVar.f39335e = (TextView) view2.findViewById(R.id.tv_reply);
                        eVar.f39334d = (TextView) view2.findViewById(R.id.tv_time);
                        view2.setTag(eVar);
                    } else {
                        eVar = (e) view.getTag();
                        view2 = view;
                    }
                    GameReplyMessageListBean.MessagesBean.DataBean dataBean = (GameReplyMessageListBean.MessagesBean.DataBean) MessagePriaceFragment.this.f39306r.get(i4).f39348a;
                    eVar.f39332b.setImageURI(dataBean.getCurrent_reply_user_ico());
                    eVar.f39333c.setText(dataBean.getCurrent_reply_title().split(" ")[0]);
                    eVar.f39335e.setText(dataBean.getCurrent_reply_title().split(" ")[1]);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    Date date = new Date(System.currentTimeMillis());
                    Date date2 = new Date(dataBean.getCurrent_reply_time() * 1000);
                    String format = simpleDateFormat.format(date);
                    String format2 = simpleDateFormat.format(date2);
                    String str7 = "";
                    if (format2 == null || format2.equals("")) {
                        view = view2;
                        str = "";
                        str2 = str;
                        str3 = str2;
                        str4 = str3;
                        str5 = str4;
                    } else {
                        str7 = format2.substring(0, format2.indexOf("年"));
                        str5 = format2.substring(format2.indexOf("年") + 1, format2.indexOf("月"));
                        str2 = format2.substring(format2.indexOf("月") + 1, format2.indexOf("日"));
                        str3 = format.substring(0, format.indexOf("年"));
                        view = view2;
                        String substring2 = format.substring(format.indexOf("年") + 1, format.indexOf("月"));
                        str4 = format.substring(format.indexOf("月") + 1, format.indexOf("日"));
                        str = substring2;
                    }
                    if (str7.equals(str3)) {
                        if (str5.equals(str)) {
                            if (str2.equals(str4)) {
                                if (format2.contains(":")) {
                                    substring = format2.substring(format2.indexOf(" ") + 1, format2.lastIndexOf(":"));
                                } else {
                                    substring = format2.substring(format2.indexOf(" ") + 1, format2.indexOf("分"));
                                }
                                eVar.f39334d.setText(substring);
                            } else {
                                TextView textView = eVar.f39334d;
                                textView.setText(str5 + "月" + str2 + "日");
                            }
                        } else {
                            TextView textView2 = eVar.f39334d;
                            textView2.setText(str5 + "月" + str2 + "日");
                        }
                    } else {
                        TextView textView3 = eVar.f39334d;
                        textView3.setText(str7 + "年" + str5 + "月" + str2 + "日");
                    }
                    eVar.f39331a.setOnClickListener(new a(dataBean));
                } else if (itemViewType == 3) {
                    if (view == null) {
                        view3 = LayoutInflater.from(this.f39321b).inflate(R.layout.community_replyitem, (ViewGroup) null);
                        iVar = new i();
                        iVar.f39345a = (TextView) view3.findViewById(R.id.reply_name);
                        iVar.f39346b = (RelativeLayout) view3.findViewById(R.id.rl_reply);
                        view3.setTag(iVar);
                    } else {
                        iVar = (i) view.getTag();
                        view3 = view;
                    }
                    GameReplyMessageListBean.MessagesBean.DataBean dataBean2 = (GameReplyMessageListBean.MessagesBean.DataBean) MessagePriaceFragment.this.f39306r.get(i4).f39348a;
                    try {
                        if (dataBean2.getReply_sub().getReply_text().contains("@")) {
                            String str8 = dataBean2.getReply_sub().getReply_text().split("@")[1];
                            String str9 = dataBean2.getReply_sub().getReply_text().split("@")[0];
                            String str10 = str8.split(":")[1];
                            TextView textView4 = iVar.f39345a;
                            textView4.setText(Html.fromHtml("<font color='#3CA4FD'>" + str9 + "</font><font color='#000000'>" + str10 + "</font>"));
                        } else {
                            iVar.f39345a.setText(dataBean2.getReply_sub().getReply_text());
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    iVar.f39346b.setOnClickListener(new b(dataBean2));
                    return view3;
                } else if (itemViewType == 4) {
                    if (view == null) {
                        view4 = LayoutInflater.from(this.f39321b).inflate(R.layout.community_messageitem, (ViewGroup) null);
                        gVar = new g();
                        gVar.f39339a = (TextView) view4.findViewById(R.id.tv_message);
                        gVar.f39340b = (LinearLayout) view4.findViewById(R.id.LL_message);
                        view4.setTag(gVar);
                    } else {
                        gVar = (g) view.getTag();
                        view4 = view;
                    }
                    GameReplyMessageListBean.MessagesBean.DataBean dataBean3 = (GameReplyMessageListBean.MessagesBean.DataBean) MessagePriaceFragment.this.f39306r.get(i4).f39348a;
                    gVar.f39339a.setText(dataBean3.getCurrent_reply_text().substring(dataBean3.getCurrent_reply_text().indexOf(":") + 1, dataBean3.getCurrent_reply_text().length()));
                    gVar.f39340b.setOnClickListener(new c(dataBean3));
                    return view4;
                } else if (itemViewType == 5) {
                    if (view == null) {
                        view5 = LayoutInflater.from(this.f39321b).inflate(R.layout.community_postitem, (ViewGroup) null);
                        hVar = new h();
                        hVar.f39342a = (LinearLayout) view5.findViewById(R.id.ll_post);
                        hVar.f39343b = (TextView) view5.findViewById(R.id.tv_post);
                        view5.setTag(hVar);
                    } else {
                        hVar = (h) view.getTag();
                        view5 = view;
                    }
                    GameReplyMessageListBean.MessagesBean.DataBean dataBean4 = (GameReplyMessageListBean.MessagesBean.DataBean) MessagePriaceFragment.this.f39306r.get(i4).f39348a;
                    if (dataBean4.getOriginal_text().contains("@") && dataBean4.getOriginal_text().substring(0, 1).equals("@")) {
                        String[] split = dataBean4.getOriginal_text().split(":");
                        if (split.length > 1) {
                            str6 = split[1];
                        } else {
                            str6 = split[0];
                        }
                        TextView textView5 = hVar.f39343b;
                        textView5.setText("原文：" + str6);
                    } else {
                        TextView textView6 = hVar.f39343b;
                        textView6.setText("原文：" + dataBean4.getOriginal_text());
                    }
                    hVar.f39342a.setOnClickListener(new d(dataBean4));
                    return view5;
                }
            } else if (view == null) {
                View inflate = LayoutInflater.from(this.f39321b).inflate(R.layout.community_lineitem, (ViewGroup) null);
                inflate.setTag(new C0336f());
                return inflate;
            } else {
                C0336f c0336f = (C0336f) view.getTag();
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g {

        /* renamed from: a  reason: collision with root package name */
        public Object f39348a;

        /* renamed from: b  reason: collision with root package name */
        public int f39349b;

        /* renamed from: c  reason: collision with root package name */
        GameReplyMessageListBean.MessagesBean.DataBean f39350c;

        public g(Object obj, int i4) {
            this.f39348a = obj;
            this.f39349b = i4;
        }
    }

    private void j0(View view) {
        this.f39309u.showAtLocation(view, 81, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V() {
        try {
            XListView2 xListView2 = this.f39292d;
            if (xListView2 != null) {
                xListView2.l();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W(List<g> list) {
        list.clear();
        f fVar = this.f39293e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public CommentCreateArgs X(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i4) {
        String str8;
        String str9;
        String str10;
        int i5;
        String d5 = this.f39302n.commentToken().d();
        n0 accountData = AccountUtil_.getInstance_(this.f39300l).getAccountData();
        this.f39305q = accountData;
        if (accountData != null) {
            int uid = accountData.getUid();
            String nickname = this.f39305q.getNickname();
            i5 = uid;
            str8 = nickname;
            str9 = this.f39305q.d0();
            str10 = this.f39305q.getToken();
        } else {
            str8 = "";
            str9 = str8;
            str10 = str9;
            i5 = -1;
        }
        return RequestBeanUtil.getInstance(this.f39300l).getReplyCreateCommentBean(str, 0.0f, str3, d5, str4, 2, str2, str8, str9, str10, i5, str5, str6, str7, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Z() {
        if (j.j(this.f39300l)) {
            try {
                CommentResponse<CommentTokenBean> c5 = this.f39299k.c(RequestBeanUtil.getInstance(this.f39300l).getTokenRequestBean(AccountUtil_.getInstance_(this.f39300l).getUid(), ""));
                if (c5 == null || c5.getCode() != 0 || c5.getData_info() == null || TextUtils.isEmpty(c5.getData_info().getToken())) {
                    return;
                }
                this.f39302n.commentToken().g(AESUtils.f(c5.getData_info().getToken() + "|" + c5.getData_info().getTimes()));
                this.f39302n.lastCheckInTime().g(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void a0() {
        try {
            if (j.j(this.f39300l)) {
                ArrayList arrayList = new ArrayList();
                RequestBeanUtil requestBeanUtil = RequestBeanUtil.getInstance(this.f39300l);
                int i4 = this.f39301m;
                this.f39301m = i4 + 1;
                GameReplyMessageListBean b02 = this.f39298j.b0(requestBeanUtil.getGameReplyMessageRequestBean(i4, this.f39305q.getUid(), this.f39305q.getToken()));
                o0();
                if (b02 != null) {
                    if (b02.getMessages() != null && b02.getMessages().getData() != null && b02.getMessages().getData().size() > 0) {
                        this.f39307s = b02.getMessages().getData();
                        if (this.f39301m == 2) {
                            arrayList.clear();
                            W(this.f39306r);
                        }
                        for (int i5 = 0; i5 < this.f39307s.size(); i5++) {
                            arrayList.add(new g("", 1));
                            if (this.f39307s.get(i5).getCurrent_reply_text() != null && !this.f39307s.get(i5).getCurrent_reply_text().equals("")) {
                                arrayList.add(new g(this.f39307s.get(i5), 2));
                            }
                            if (this.f39307s.get(i5).getReply_sub() != null && this.f39307s.get(i5).getReply_sub().getReply_text() != null && !this.f39307s.get(i5).getReply_sub().getReply_text().equals("")) {
                                arrayList.add(new g(this.f39307s.get(i5), 3));
                            }
                            if (this.f39307s.get(i5).getCurrent_reply_text() != null && !this.f39307s.get(i5).getCurrent_reply_text().equals("")) {
                                arrayList.add(new g(this.f39307s.get(i5), 4));
                            }
                            if (this.f39307s.get(i5).getOriginal_text() != null && !this.f39307s.get(i5).getOriginal_text().equals("")) {
                                arrayList.add(new g(this.f39307s.get(i5), 5));
                            }
                        }
                        d0(arrayList);
                        b0();
                        if (this.f39307s.size() < 10) {
                            g0();
                            return;
                        }
                        return;
                    } else if (this.f39301m == 2) {
                        b0();
                        i0(1);
                        g0();
                        return;
                    } else {
                        g0();
                        return;
                    }
                }
                return;
            }
            i0(2);
            b0();
            showLodingFailed();
        } catch (Exception e5) {
            e5.printStackTrace();
            b0();
            showLodingFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f39300l = getActivity();
        this.f39306r = new ArrayList();
        this.f39307s = new ArrayList();
        getArguments();
        f fVar = new f(getActivity());
        this.f39293e = fVar;
        this.f39292d.setAdapter((ListAdapter) fVar);
        this.f39298j = com.join.mgps.rpc.impl.d.P1();
        this.f39299k = com.join.mgps.rpc.impl.e.m();
        this.f39305q = AccountUtil_.getInstance_(getActivity()).getAccountData();
        showLoding();
        a0();
        MessageRedPointBean.MessagesBean.DataBean dataBean = MApplication.M;
        if (dataBean != null && dataBean.getPraise_surplus_number() > 0) {
            m0();
        }
        this.f39292d.setPullLoadEnable(new a());
        this.f39292d.setPullRefreshEnable(new b());
        this.f39292d.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void b0() {
        LinearLayout linearLayout;
        if (this.f39295g == null || (linearLayout = this.f39294f) == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f39295g.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void c0() {
        TextView textView = this.f39297i;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d0(List<g> list) {
        try {
            this.f39306r.addAll(list);
            f fVar = this.f39293e;
            if (fVar != null) {
                fVar.notifyDataSetChanged();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e0(CommentResponse commentResponse) {
        if (commentResponse.getCode() == 801) {
            Z();
            l2.a(this.f39300l).b("数据访问失败，请稍候再试！");
            return;
        }
        l2.a(this.f39300l).b(commentResponse.getMsg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0(String str, CommentCreateBean.InfoBean infoBean, boolean z4) {
        l2.a(this.f39300l).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0() {
        XListView2 xListView2 = this.f39292d;
        if (xListView2 != null) {
            xListView2.setNoMore();
            this.f39292d.u();
            this.f39292d.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0(String str, GameReplyMessageListBean.MessagesBean.DataBean dataBean) {
        if (str.equals("")) {
            l2.a(this.f39300l).b("不能回复空字符串");
        } else if (!f2.d(str, 4)) {
            l2.a(this.f39300l).b("超过3个字才能回复");
        } else if (j.j(this.f39300l)) {
            try {
                String str2 = dataBean.getCurrent_reply_text_id() + "";
                String str3 = dataBean.getCurrent_reply_title().split(" ")[0];
                CommentResponse<CommentCreateBean> d5 = this.f39299k.d(X(dataBean.getGame_id(), str2, str, Build.MODEL, dataBean.getCurrent_reply_text_uid() + "", str3, str2, this.f39301m));
                if (d5 != null) {
                    if (d5.getCode() != 0) {
                        if (d5.getCode() == 801) {
                            e0(d5);
                        } else {
                            f0(d5.getMsg(), null, false);
                        }
                    } else if (d5.getData_info().getInfo() != null) {
                        f0("回复成功，内容将在审核后显示", d5.getData_info().getInfo(), true);
                    }
                } else {
                    f0("回复失败，请稍候再试~", null, false);
                }
            } catch (Exception e5) {
                f0(e5.getMessage(), null, false);
                e5.printStackTrace();
            }
        } else {
            f0("网络连接失败，再试试吧~", null, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0(int i4) {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f39291c;
        if (ptrClassicFrameLayout == null || this.f39292d == null || this.f39296h == null) {
            return;
        }
        if (i4 == 1) {
            ptrClassicFrameLayout.setVisibility(8);
            this.f39292d.setVisibility(8);
            this.f39296h.setVisibility(0);
            return;
        }
        ptrClassicFrameLayout.setVisibility(8);
        this.f39292d.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(GameReplyMessageListBean.MessagesBean.DataBean dataBean) {
        this.f39304p = false;
        if (this.f39312x == null) {
            this.f39312x = LayoutInflater.from(this.f39300l).inflate(R.layout.appointment_pay_popwindow_page, (ViewGroup) null);
            this.f39309u = new PopupWindow(this.f39312x, -1, -1, true);
            this.f39314z = (EditText) this.f39312x.findViewById(R.id.edit);
            ((LinearLayout) this.f39312x.findViewById(R.id.ll_dismiss)).setOnClickListener(new c());
            SpannableString spannableString = new SpannableString("@ " + dataBean.getCurrent_reply_title().split(" ")[0] + ":");
            spannableString.setSpan(new AbsoluteSizeSpan(15, true), 0, spannableString.length(), 33);
            this.f39314z.setHint(new SpannedString(spannableString));
            this.f39314z.addTextChangedListener(new d());
            ((Button) this.f39312x.findViewById(R.id.btn_confirm)).setOnClickListener(new e(dataBean));
            this.f39314z.setFocusable(true);
            this.f39309u.setFocusable(true);
            this.f39314z.setFocusableInTouchMode(true);
            this.f39314z.setFocusable(true);
            this.f39314z.requestFocus();
            ((InputMethodManager) this.f39300l.getSystemService("input_method")).toggleSoftInput(0, 2);
            View inflate = LayoutInflater.from(this.f39300l).inflate(R.layout.fragment_communtity, (ViewGroup) null);
            this.f39313y = inflate;
            j0(inflate);
            return;
        }
        ((InputMethodManager) this.f39300l.getSystemService("input_method")).toggleSoftInput(0, 2);
        SpannableString spannableString2 = new SpannableString("@ " + dataBean.getCurrent_reply_title().split(" ")[0] + ":");
        spannableString2.setSpan(new AbsoluteSizeSpan(15, true), 0, spannableString2.length(), 33);
        this.f39314z.setHint(new SpannedString(spannableString2));
        this.f39309u.showAtLocation(this.f39313y, 81, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        this.f39290b.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        TextView textView = this.f39297i;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void n0() {
        c0();
        MessageRedPointBean.MessagesBean.DataBean dataBean = MApplication.M;
        if (dataBean != null) {
            dataBean.setPraise_surplus_number(0);
        }
        Intent intent = new Intent(getActivity(), GivePraiceActivity_.class);
        intent.putExtra("praice", 2);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void o0() {
        XListView2 xListView2 = this.f39292d;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f39292d.v();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f39300l);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z4) {
        super.setUserVisibleHint(z4);
        if (z4 && this.f39308t) {
            this.f39308t = false;
            this.f39301m = 1;
            a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f39294f;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f39295g;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f39295g;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f39294f;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        Toast.makeText(this.f39300l, str, 0).show();
    }
}
