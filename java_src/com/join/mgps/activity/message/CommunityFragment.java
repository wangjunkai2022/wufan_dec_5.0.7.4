package com.join.mgps.activity.message;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.Editable;
import android.text.Html;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.MApplication;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.j0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.x;
import com.join.mgps.activity.ForumPostsTagSelectActivity_;
import com.join.mgps.activity.GivePraiceActivity_;
import com.join.mgps.customview.XListView2;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumProfileMessageBean;
import com.join.mgps.dto.ForumProfileMessageData;
import com.join.mgps.dto.ForumResponse;
import com.join.mgps.dto.MessageCommentReplyResponse;
import com.join.mgps.dto.MessageRedPointBean;
import com.join.mgps.ptr.PtrClassicFrameLayout;
import com.wufan.user.service.protobuf.n0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EFragment(R.layout.fragment_communtity)
/* loaded from: classes4.dex */
public class CommunityFragment extends Fragment {
    EditText A;
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f39127b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    PtrClassicFrameLayout f39128c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    XListView2 f39129d;

    /* renamed from: e  reason: collision with root package name */
    g f39130e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f39131f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f39132g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    LinearLayout f39133h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f39134i;

    /* renamed from: j  reason: collision with root package name */
    com.join.mgps.rpc.i f39135j;

    /* renamed from: k  reason: collision with root package name */
    Context f39136k;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    Button f39138m;

    /* renamed from: n  reason: collision with root package name */
    private n0 f39139n;

    /* renamed from: o  reason: collision with root package name */
    List<i> f39140o;

    /* renamed from: p  reason: collision with root package name */
    float f39141p;

    /* renamed from: q  reason: collision with root package name */
    float f39142q;

    /* renamed from: r  reason: collision with root package name */
    float f39143r;

    /* renamed from: s  reason: collision with root package name */
    private ObjectAnimator f39144s;

    /* renamed from: t  reason: collision with root package name */
    private ObjectAnimator f39145t;

    /* renamed from: v  reason: collision with root package name */
    PopupWindow f39147v;

    /* renamed from: w  reason: collision with root package name */
    InputFilter[] f39148w;

    /* renamed from: y  reason: collision with root package name */
    View f39150y;

    /* renamed from: z  reason: collision with root package name */
    View f39151z;

    /* renamed from: l  reason: collision with root package name */
    int f39137l = 1;

    /* renamed from: u  reason: collision with root package name */
    boolean f39146u = false;

    /* renamed from: x  reason: collision with root package name */
    boolean f39149x = false;
    boolean B = true;

    /* loaded from: classes4.dex */
    class a implements com.join.mgps.customview.f {
        a() {
        }

        @Override // com.join.mgps.customview.f
        public void onLoadMore() {
            CommunityFragment.this.V();
            CommunityFragment.this.Z();
        }
    }

    /* loaded from: classes4.dex */
    class b implements com.join.mgps.customview.g {
        b() {
        }

        @Override // com.join.mgps.customview.g
        public void onRefresh() {
            CommunityFragment.this.V();
            CommunityFragment communityFragment = CommunityFragment.this;
            communityFragment.f39137l = 1;
            communityFragment.Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupWindow popupWindow = CommunityFragment.this.f39147v;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            CommunityFragment.this.f39147v.dismiss();
            CommunityFragment.this.B = true;
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
        final /* synthetic */ int f39156b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f39157c;

        e(int i4, int i5) {
            this.f39156b = i4;
            this.f39157c = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommunityFragment.this.f39147v.dismiss();
            CommunityFragment communityFragment = CommunityFragment.this;
            communityFragment.e0(communityFragment.A.getText().toString().trim(), this.f39156b, this.f39157c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f39159b;

        f(View view) {
            this.f39159b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            Rect rect = new Rect();
            this.f39159b.getWindowVisibleDisplayFrame(rect);
            if (rect.bottom - rect.top > (this.f39159b.getHeight() / 3) * 2) {
                CommunityFragment communityFragment = CommunityFragment.this;
                if (communityFragment.f39149x) {
                    communityFragment.f39147v.dismiss();
                    CommunityFragment.this.f39149x = false;
                    return;
                }
                return;
            }
            CommunityFragment.this.f39149x = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        Context f39161b;

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ForumProfileMessageBean f39163b;

            a(ForumProfileMessageBean forumProfileMessageBean) {
                this.f39163b = forumProfileMessageBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CommunityFragment.this.i0(this.f39163b.getComment_id(), this.f39163b.getRid(), this.f39163b.getFrom_nickname());
            }
        }

        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ForumProfileMessageBean f39165b;

            b(ForumProfileMessageBean forumProfileMessageBean) {
                this.f39165b = forumProfileMessageBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
                forumPostsBean.setPid(this.f39165b.getPid());
                j0.w0(g.this.f39161b, forumPostsBean, null);
            }
        }

        /* loaded from: classes4.dex */
        class c implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ForumProfileMessageBean f39167b;

            c(ForumProfileMessageBean forumProfileMessageBean) {
                this.f39167b = forumProfileMessageBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CommunityFragment.this.i0(this.f39167b.getComment_id(), this.f39167b.getRid(), this.f39167b.getFrom_nickname());
            }
        }

        /* loaded from: classes4.dex */
        class d implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ForumBean.ForumPostsBean f39169b;

            d(ForumBean.ForumPostsBean forumPostsBean) {
                this.f39169b = forumPostsBean;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ForumBean.ForumPostsBean forumPostsBean = new ForumBean.ForumPostsBean();
                forumPostsBean.setPid(this.f39169b.getPid());
                j0.w0(g.this.f39161b, forumPostsBean, null);
            }
        }

        /* loaded from: classes4.dex */
        class e {

            /* renamed from: a  reason: collision with root package name */
            RelativeLayout f39171a;

            /* renamed from: b  reason: collision with root package name */
            SimpleDraweeView f39172b;

            /* renamed from: c  reason: collision with root package name */
            TextView f39173c;

            /* renamed from: d  reason: collision with root package name */
            TextView f39174d;

            /* renamed from: e  reason: collision with root package name */
            TextView f39175e;

            e() {
            }
        }

        /* loaded from: classes4.dex */
        class f {

            /* renamed from: a  reason: collision with root package name */
            TextView f39177a;

            f() {
            }
        }

        /* renamed from: com.join.mgps.activity.message.CommunityFragment$g$g  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class C0335g {

            /* renamed from: a  reason: collision with root package name */
            TextView f39179a;

            /* renamed from: b  reason: collision with root package name */
            LinearLayout f39180b;

            C0335g() {
            }
        }

        /* loaded from: classes4.dex */
        class h {

            /* renamed from: a  reason: collision with root package name */
            LinearLayout f39182a;

            /* renamed from: b  reason: collision with root package name */
            TextView f39183b;

            h() {
            }
        }

        /* loaded from: classes4.dex */
        class i {

            /* renamed from: a  reason: collision with root package name */
            TextView f39185a;

            /* renamed from: b  reason: collision with root package name */
            RelativeLayout f39186b;

            i() {
            }
        }

        public g(Context context) {
            this.f39161b = context;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return CommunityFragment.this.f39140o.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return CommunityFragment.this.f39140o.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return CommunityFragment.this.f39140o.get(i4).f39192b;
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
            String str6;
            String substring;
            i iVar;
            View view3;
            C0335g c0335g;
            View view4;
            h hVar;
            View view5;
            String message;
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 1) {
                String str7 = "";
                if (itemViewType == 2) {
                    if (view == null) {
                        view2 = LayoutInflater.from(this.f39161b).inflate(R.layout.community_iconitem, (ViewGroup) null);
                        eVar = new e();
                        eVar.f39171a = (RelativeLayout) view2.findViewById(R.id.rl_icon);
                        eVar.f39172b = (SimpleDraweeView) view2.findViewById(R.id.simv);
                        eVar.f39173c = (TextView) view2.findViewById(R.id.tv_name);
                        eVar.f39175e = (TextView) view2.findViewById(R.id.tv_reply);
                        eVar.f39174d = (TextView) view2.findViewById(R.id.tv_time);
                        view2.setTag(eVar);
                    } else {
                        eVar = (e) view.getTag();
                        view2 = view;
                    }
                    ForumProfileMessageBean forumProfileMessageBean = (ForumProfileMessageBean) CommunityFragment.this.f39140o.get(i4).f39191a;
                    eVar.f39172b.setImageURI(forumProfileMessageBean.getFrom_avatar_src());
                    eVar.f39173c.setText(forumProfileMessageBean.getFrom_nickname());
                    int i5 = i4 + 1;
                    if (CommunityFragment.this.f39140o.get(i5).f39192b == 4) {
                        str = "帖子";
                    } else {
                        int i6 = CommunityFragment.this.f39140o.get(i5).f39192b;
                        str = "了你";
                    }
                    TextView textView = eVar.f39175e;
                    textView.setText("回复" + str);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    Date date = new Date(System.currentTimeMillis());
                    Date date2 = new Date(forumProfileMessageBean.getAdd_time() * 1000);
                    String format = simpleDateFormat.format(date);
                    String format2 = simpleDateFormat.format(date2);
                    if (format2 == null || format2.equals("")) {
                        str2 = "";
                        str3 = str2;
                        str4 = str3;
                        str5 = str4;
                        str6 = str5;
                    } else {
                        str7 = format2.substring(0, format2.indexOf("年"));
                        str4 = format2.substring(format2.indexOf("年") + 1, format2.indexOf("月"));
                        str5 = format2.substring(format2.indexOf("月") + 1, format2.indexOf("日"));
                        str3 = format.substring(0, format.indexOf("年"));
                        str6 = format.substring(format.indexOf("年") + 1, format.indexOf("月"));
                        str2 = format.substring(format.indexOf("月") + 1, format.indexOf("日"));
                    }
                    if (str7.equals(str3)) {
                        if (str4.equals(str6)) {
                            if (str5.equals(str2)) {
                                if (format2.contains(":")) {
                                    substring = format2.substring(format2.indexOf(" ") + 1, format2.lastIndexOf(":"));
                                } else {
                                    substring = format2.substring(format2.indexOf(" ") + 1, format2.indexOf("分"));
                                }
                                eVar.f39174d.setText(substring);
                            } else {
                                TextView textView2 = eVar.f39174d;
                                textView2.setText(str4 + "月" + str5 + "日");
                            }
                        } else {
                            TextView textView3 = eVar.f39174d;
                            textView3.setText(str4 + "月" + str5 + "日");
                        }
                    } else {
                        TextView textView4 = eVar.f39174d;
                        textView4.setText(str7 + "年" + str4 + "月" + str5 + "日");
                    }
                    eVar.f39171a.setOnClickListener(new a(forumProfileMessageBean));
                    return view2;
                } else if (itemViewType == 3) {
                    if (view == null) {
                        view3 = LayoutInflater.from(this.f39161b).inflate(R.layout.community_replyitem, (ViewGroup) null);
                        iVar = new i();
                        iVar.f39185a = (TextView) view3.findViewById(R.id.reply_name);
                        iVar.f39186b = (RelativeLayout) view3.findViewById(R.id.rl_reply);
                        view3.setTag(iVar);
                    } else {
                        iVar = (i) view.getTag();
                        view3 = view;
                    }
                    ForumProfileMessageBean forumProfileMessageBean2 = (ForumProfileMessageBean) CommunityFragment.this.f39140o.get(i4).f39191a;
                    TextView textView5 = iVar.f39185a;
                    textView5.setText(Html.fromHtml("<font color='#3CA4FD'>" + forumProfileMessageBean2.getReply().getNickname() + ":  </font><font color='#000000'>" + forumProfileMessageBean2.getReply().getMessage() + "</font>"));
                    iVar.f39186b.setOnClickListener(new b(forumProfileMessageBean2));
                    return view3;
                } else if (itemViewType == 4) {
                    if (view == null) {
                        view4 = LayoutInflater.from(this.f39161b).inflate(R.layout.community_messageitem, (ViewGroup) null);
                        c0335g = new C0335g();
                        c0335g.f39179a = (TextView) view4.findViewById(R.id.tv_message);
                        c0335g.f39180b = (LinearLayout) view4.findViewById(R.id.LL_message);
                    } else {
                        c0335g = (C0335g) view.getTag();
                        view4 = view;
                    }
                    ForumProfileMessageBean forumProfileMessageBean3 = (ForumProfileMessageBean) CommunityFragment.this.f39140o.get(i4).f39191a;
                    c0335g.f39179a.setText(forumProfileMessageBean3.getMessage());
                    view4.setTag(c0335g);
                    CommunityFragment.this.c0(c0335g.f39179a);
                    c0335g.f39180b.setOnClickListener(new c(forumProfileMessageBean3));
                    return view4;
                } else if (itemViewType == 5) {
                    if (view == null) {
                        view5 = LayoutInflater.from(this.f39161b).inflate(R.layout.community_postitem, (ViewGroup) null);
                        hVar = new h();
                        hVar.f39182a = (LinearLayout) view5.findViewById(R.id.ll_post);
                        hVar.f39183b = (TextView) view5.findViewById(R.id.tv_post);
                        view5.setTag(hVar);
                    } else {
                        hVar = (h) view.getTag();
                        view5 = view;
                    }
                    ForumBean.ForumPostsBean forumPostsBean = (ForumBean.ForumPostsBean) CommunityFragment.this.f39140o.get(i4).f39191a;
                    if (forumPostsBean.getMessage() != null && !forumPostsBean.getSubject().equals("")) {
                        message = forumPostsBean.getSubject();
                    } else {
                        message = forumPostsBean.getMessage();
                    }
                    TextView textView6 = hVar.f39183b;
                    textView6.setText("原文：" + message);
                    hVar.f39182a.setOnClickListener(new d(forumPostsBean));
                    return view5;
                }
            } else if (view == null) {
                View inflate = LayoutInflater.from(this.f39161b).inflate(R.layout.community_lineitem, (ViewGroup) null);
                inflate.setTag(new f());
                return inflate;
            } else {
                f fVar = (f) view.getTag();
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
    public class h extends ClickableSpan {

        /* renamed from: b  reason: collision with root package name */
        private Context f39188b;

        /* renamed from: c  reason: collision with root package name */
        private String f39189c;

        public h(Context context, String str) {
            this.f39188b = context;
            this.f39189c = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IntentUtil.getInstance().goShareWebActivity(this.f39188b, this.f39189c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i {

        /* renamed from: a  reason: collision with root package name */
        public Object f39191a;

        /* renamed from: b  reason: collision with root package name */
        public int f39192b;

        public i(Object obj, int i4) {
            this.f39191a = obj;
            this.f39192b = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(TextView textView) {
        textView.setMovementMethod(x.a());
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            int length = text.length();
            Spannable spannable = (Spannable) textView.getText();
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, length, URLSpan.class);
            if (uRLSpanArr.length == 0) {
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            for (URLSpan uRLSpan : uRLSpanArr) {
                String url = uRLSpan.getURL();
                if (url.indexOf("http://") == 0 || url.indexOf("https://") == 0) {
                    spannableStringBuilder.setSpan(new h(textView.getContext(), url), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), 17);
                }
            }
            textView.setText(spannableStringBuilder);
        }
    }

    private void h0(View view) {
        this.f39147v.showAtLocation(view, 81, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V() {
        try {
            XListView2 xListView2 = this.f39129d;
            if (xListView2 != null) {
                xListView2.l();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X(List<i> list) {
        list.clear();
        g gVar = this.f39130e;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void Z() {
        try {
            if (j.j(this.f39136k)) {
                ArrayList arrayList = new ArrayList();
                com.join.mgps.rpc.i iVar = this.f39135j;
                int uid = this.f39139n.getUid();
                String token = this.f39139n.getToken();
                int i4 = this.f39137l;
                this.f39137l = i4 + 1;
                ForumResponse<ForumProfileMessageData> F = iVar.F(uid, token, i4, 10);
                m0();
                if (F == null || F.getData() == null) {
                    return;
                }
                F.getData().getUn_read_praise_count();
                if (F.getData().getMessage_list() != null && F.getData().getMessage_list().size() > 0) {
                    List<ForumProfileMessageBean> message_list = F.getData().getMessage_list();
                    if (this.f39137l == 2) {
                        arrayList.clear();
                        X(this.f39140o);
                    }
                    for (int i5 = 0; i5 < message_list.size(); i5++) {
                        arrayList.add(new i("", 1));
                        arrayList.add(new i(message_list.get(i5), 2));
                        if (message_list.get(i5).getReply() != null) {
                            arrayList.add(new i(message_list.get(i5), 3));
                        }
                        if (message_list.get(i5) != null && message_list.get(i5).getMessage() != null) {
                            arrayList.add(new i(message_list.get(i5), 4));
                        }
                        if (message_list.get(i5).getPosts() != null) {
                            arrayList.add(new i(message_list.get(i5).getPosts(), 5));
                        }
                    }
                    d0(arrayList);
                    a0();
                    if (message_list.size() < 10) {
                        f0();
                        return;
                    }
                    return;
                } else if (this.f39137l == 2) {
                    a0();
                    g0(1);
                    f0();
                    return;
                } else {
                    f0();
                    return;
                }
            }
            g0(2);
            a0();
            showLodingFailed();
        } catch (Exception e5) {
            e5.printStackTrace();
            a0();
            showLodingFailed();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a0() {
        LinearLayout linearLayout = this.f39131f;
        if (linearLayout == null || this.f39132g == null) {
            return;
        }
        try {
            linearLayout.setVisibility(8);
            this.f39132g.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    @SuppressLint({"ClickableViewAccessibility"})
    public void afterViews() {
        this.f39136k = getActivity();
        this.f39140o = new ArrayList();
        getArguments();
        g gVar = new g(getActivity());
        this.f39130e = gVar;
        this.f39129d.setAdapter((ListAdapter) gVar);
        this.f39135j = com.join.mgps.rpc.impl.g.A0();
        this.f39139n = AccountUtil_.getInstance_(getActivity()).getAccountData();
        this.f39129d.l();
        MessageRedPointBean.MessagesBean.DataBean dataBean = MApplication.M;
        if (dataBean != null && dataBean.getCommunity_praise_surplus_number() > 0) {
            k0();
        }
        this.f39129d.setPullLoadEnable(new a());
        this.f39129d.setPullRefreshEnable(new b());
        showLoding();
        Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void b0() {
        TextView textView = this.f39134i;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void d0(List<i> list) {
        try {
            this.f39140o.addAll(list);
            g gVar = this.f39130e;
            if (gVar != null) {
                gVar.notifyDataSetChanged();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void e0(String str, int i4, int i5) {
        if (str.equals("")) {
            showToast("不能回复空字符串");
            return;
        }
        String str2 = com.join.mgps.rpc.h.f54059k + "/group/comment/reply";
        if (j.j(this.f39136k)) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("uid", Integer.valueOf(this.f39139n.getUid()));
                hashMap.put("token", this.f39139n.getToken());
                hashMap.put(ForumPostsTagSelectActivity_.f30896z, Integer.valueOf(i4));
                hashMap.put("message", str);
                hashMap.put("device_id", "");
                hashMap.put("rid", Integer.valueOf(i5));
                ForumResponse<MessageCommentReplyResponse> b02 = this.f39135j.b0(str2, hashMap);
                if (b02 != null) {
                    if (b02.getData() != null) {
                        if (b02.getData().isResult()) {
                            showToast("评论成功，内容将在审核后显示");
                        } else {
                            showToast("评论失败");
                        }
                    } else {
                        showToast("评论失败");
                    }
                } else {
                    showToast("评论失败");
                }
                return;
            } catch (Exception e5) {
                e5.printStackTrace();
                return;
            }
        }
        showToast("暂无网络");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0() {
        XListView2 xListView2 = this.f39129d;
        if (xListView2 != null) {
            xListView2.setNoMore();
            this.f39129d.u();
            this.f39129d.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void g0(int i4) {
        PtrClassicFrameLayout ptrClassicFrameLayout = this.f39128c;
        if (ptrClassicFrameLayout == null || this.f39129d == null || this.f39133h == null) {
            return;
        }
        if (i4 == 1) {
            ptrClassicFrameLayout.setVisibility(8);
            this.f39129d.setVisibility(8);
            this.f39133h.setVisibility(0);
            return;
        }
        ptrClassicFrameLayout.setVisibility(8);
        this.f39129d.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0(int i4, int i5, String str) {
        this.B = false;
        if (this.f39150y == null) {
            this.f39150y = LayoutInflater.from(this.f39136k).inflate(R.layout.appointment_pay_popwindow_page, (ViewGroup) null);
            this.f39147v = new PopupWindow(this.f39150y, -1, -1, true);
            this.A = (EditText) this.f39150y.findViewById(R.id.edit);
            ((LinearLayout) this.f39150y.findViewById(R.id.ll_dismiss)).setOnClickListener(new c());
            SpannableString spannableString = new SpannableString("@ " + str + ":");
            spannableString.setSpan(new AbsoluteSizeSpan(15, true), 0, spannableString.length(), 33);
            this.A.setHint(new SpannedString(spannableString));
            this.A.addTextChangedListener(new d());
            ((Button) this.f39150y.findViewById(R.id.btn_confirm)).setOnClickListener(new e(i4, i5));
            this.A.setFocusable(true);
            this.f39147v.setFocusable(true);
            this.A.setFocusableInTouchMode(true);
            this.A.setFocusable(true);
            this.A.requestFocus();
            ((InputMethodManager) this.f39136k.getSystemService("input_method")).toggleSoftInput(0, 2);
            View decorView = getActivity().getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnGlobalLayoutListener(new f(decorView));
            View inflate = LayoutInflater.from(this.f39136k).inflate(R.layout.fragment_communtity, (ViewGroup) null);
            this.f39151z = inflate;
            h0(inflate);
            return;
        }
        ((InputMethodManager) this.f39136k.getSystemService("input_method")).toggleSoftInput(0, 2);
        SpannableString spannableString2 = new SpannableString("@ " + str + ":");
        spannableString2.setSpan(new AbsoluteSizeSpan(15, true), 0, spannableString2.length(), 33);
        this.A.setHint(new SpannedString(spannableString2));
        PopupWindow popupWindow = this.f39147v;
        if (popupWindow != null) {
            popupWindow.showAtLocation(this.f39151z, 81, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        LinearLayout linearLayout = this.f39127b;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0() {
        TextView textView = this.f39134i;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        b0();
        MessageRedPointBean.MessagesBean.DataBean dataBean = MApplication.M;
        if (dataBean != null) {
            dataBean.setCommunity_praise_surplus_number(0);
        }
        Intent intent = new Intent(getActivity(), GivePraiceActivity_.class);
        intent.putExtra("praice", 1);
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        XListView2 xListView2 = this.f39129d;
        if (xListView2 != null) {
            try {
                xListView2.u();
                this.f39129d.v();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this.f39136k);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z4) {
        super.setUserVisibleHint(z4);
        if (z4 && this.f39146u) {
            this.f39146u = false;
            this.f39137l = 1;
            Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            LinearLayout linearLayout = this.f39131f;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            LinearLayout linearLayout2 = this.f39132g;
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
        LinearLayout linearLayout = this.f39132g;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f39131f;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        l2.a(this.f39136k).b(str);
    }
}
