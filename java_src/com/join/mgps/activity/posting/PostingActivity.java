package com.join.mgps.activity.posting;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.component.album.MyAlbumActivity;
import com.join.android.app.component.album.lib.ImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.b0;
import com.join.mgps.Util.g0;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.j0;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.v0;
import com.join.mgps.Util.w0;
import com.join.mgps.activity.ForumPostsTagSelectActivity_;
import com.join.mgps.activity.GameSearchFavoriteActivity_;
import com.join.mgps.activity.LocalGameActivity_;
import com.join.mgps.activity.SearchLabelActivity_;
import com.join.mgps.activity.ShareWebActivity_;
import com.join.mgps.activity.login.LoginSplashActivity_;
import com.join.mgps.customview.CustomEdittext;
import com.join.mgps.customview.z;
import com.join.mgps.dialog.d1;
import com.join.mgps.dialog.w1;
import com.join.mgps.dialog.x1;
import com.join.mgps.dto.CollectionBeanSub;
import com.join.mgps.dto.GameTagBean;
import com.join.mgps.dto.GroupInfoBean;
import com.join.mgps.dto.GroupListBean;
import com.join.mgps.dto.LabelBean;
import com.join.mgps.dto.Response;
import com.join.mgps.dto.ResultResMainBean;
import com.wufan.user.service.protobuf.n0;
import io.reactivex.functions.Consumer;
import it.sephiroth.android.library.widget.AbsHListView;
import it.sephiroth.android.library.widget.HListView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import net.bither.util.b;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.activity_posting)
/* loaded from: classes4.dex */
public class PostingActivity extends BaseFragmentActivity {
    public static final int A1 = 1;
    public static final int B1 = 2;
    public static final int C1 = 3;
    public static final int D1 = 4;
    public static final int E1 = 6;
    static final int F1 = 9;
    static final boolean G1 = false;
    private static final int H1 = 4369;

    /* renamed from: p1  reason: collision with root package name */
    public static final int f39467p1 = 17476;

    /* renamed from: v1  reason: collision with root package name */
    public static final int f39468v1 = 100;
    @ViewById
    TextView A;
    @ViewById
    ImageView B;
    @ViewById
    Button C;
    @ViewById
    LinearLayout D;
    @ViewById
    RelativeLayout E;
    @ViewById
    LinearLayout F;
    @ViewById
    LinearLayout G;
    private w1 H;
    private x1 J;
    private d1 K;
    @ViewById
    FrameLayout Q;
    z R;
    @ViewById
    LinearLayout S;
    private GroupInfoBean T;
    private DownloadTask U;
    private CollectionBeanSub W;
    n Y;
    @Extra

    /* renamed from: b  reason: collision with root package name */
    int f39469b;
    @Bean

    /* renamed from: c  reason: collision with root package name */
    com.join.mgps.Util.b f39470c;
    @Extra

    /* renamed from: d  reason: collision with root package name */
    ArrayList<GameTagBean> f39471d;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    String f39473f;
    @Extra

    /* renamed from: g  reason: collision with root package name */
    String f39474g;
    @Extra

    /* renamed from: h  reason: collision with root package name */
    String f39475h;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    int f39476i;
    @Extra

    /* renamed from: j  reason: collision with root package name */
    String f39477j;
    @Extra

    /* renamed from: k  reason: collision with root package name */
    String f39478k;

    /* renamed from: l  reason: collision with root package name */
    com.join.mgps.rpc.i f39479l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    CustomEdittext f39480m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    CustomEdittext f39481n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    View f39482o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    EditText f39483p;

    /* renamed from: p0  reason: collision with root package name */
    private Dialog f39484p0;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    HListView f39485q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    FrameLayout f39486r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    LinearLayout f39487s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    TextView f39488t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    Button f39489u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    RelativeLayout f39490v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    TextView f39491w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    Button f39492x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    ImageView f39493y;
    @ViewById

    /* renamed from: z  reason: collision with root package name */
    ImageView f39494z;
    @Extra

    /* renamed from: e  reason: collision with root package name */
    int f39472e = 3;
    private int I = -1;
    List<String> L = new ArrayList();
    int M = 0;
    boolean N = false;
    boolean O = true;
    private b.e P = new c();
    private List<LabelBean> V = Collections.synchronizedList(new ArrayList());
    private final m X = new a();
    List<String> Z = new ArrayList();

    /* loaded from: classes4.dex */
    class a implements m {
        a() {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void a(int i4) {
            switch (i4) {
                case 4352:
                    PostingActivity.this.startActivityForResult(new Intent(PostingActivity.this, LocalGameActivity_.class), 4352);
                    return;
                case 4353:
                    Intent intent = new Intent(PostingActivity.this, GameSearchFavoriteActivity_.class);
                    intent.putExtra("type", 2);
                    PostingActivity.this.startActivityForResult(intent, 4353);
                    return;
                case 4354:
                    Intent intent2 = new Intent(PostingActivity.this, GameSearchFavoriteActivity_.class);
                    intent2.putExtra("type", 1);
                    PostingActivity.this.startActivityForResult(intent2, 4354);
                    return;
                default:
                    return;
            }
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void b(int i4) {
            PostingActivity.this.finish();
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void c(GroupInfoBean groupInfoBean) {
            PostingActivity.this.T = groupInfoBean;
            PostingActivity postingActivity = PostingActivity.this;
            postingActivity.e1(postingActivity.T.getName(), false);
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void d(int i4) {
            if (i4 <= PostingActivity.this.f39470c.getAccountData().O1()) {
                PostingActivity.this.I = i4;
                TextView textView = PostingActivity.this.f39488t;
                textView.setText(Html.fromHtml("悬赏铜板数：<font color=#000000>" + i4 + "</font>"));
                return;
            }
            l2.a(PostingActivity.this).b("当前铜板数不足!");
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.m
        public void e(int i4) {
            if (i4 == 4355) {
                PostingActivity.this.L0(com.join.mgps.rpc.h.f54083s);
            } else if (i4 != 4356) {
                PostingActivity.this.finish();
            } else {
                PostingActivity.this.L0(com.join.mgps.rpc.h.f54080r);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements n.c {
        b() {
        }

        @Override // com.join.mgps.activity.posting.PostingActivity.n.c
        public void a(int i4, String str) {
            PostingActivity.this.Z.remove(i4);
            PostingActivity postingActivity = PostingActivity.this;
            postingActivity.Y.d(postingActivity.Z);
            PostingActivity.this.Y.notifyDataSetChanged();
            net.bither.util.b.q().j(PostingActivity.this.getApplicationContext(), str, false);
            if (PostingActivity.this.Z.size() > 0) {
                PostingActivity.this.f39485q.setVisibility(0);
            } else {
                PostingActivity.this.f39485q.setVisibility(8);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements b.e {
        c() {
        }

        private void b(List<String> list) {
            PostingActivity postingActivity = PostingActivity.this;
            if (postingActivity.M == 1) {
                postingActivity.M = 2;
                if (list != null && list.size() != 0) {
                    PostingActivity.this.L.clear();
                    PostingActivity.this.L.addAll(list);
                }
                PostingActivity.this.u0();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0078 A[SYNTHETIC] */
        @Override // net.bither.util.b.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.lang.Boolean r9, java.util.Map<java.lang.String, java.lang.String> r10, java.util.Map<java.lang.String, java.lang.Integer> r11) {
            /*
                r8 = this;
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L7f
                com.join.mgps.activity.posting.PostingActivity r9 = com.join.mgps.activity.posting.PostingActivity.this
                java.util.List<java.lang.String> r9 = r9.Z
                if (r9 == 0) goto L7f
                int r9 = r9.size()
                if (r9 == 0) goto L7f
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                r0 = 0
                r1 = 0
            L19:
                com.join.mgps.activity.posting.PostingActivity r2 = com.join.mgps.activity.posting.PostingActivity.this
                java.util.List<java.lang.String> r2 = r2.Z
                int r2 = r2.size()
                if (r1 >= r2) goto L7b
                com.join.mgps.activity.posting.PostingActivity r2 = com.join.mgps.activity.posting.PostingActivity.this
                java.util.List<java.lang.String> r2 = r2.Z
                java.lang.Object r2 = r2.get(r1)
                java.lang.String r2 = (java.lang.String) r2
                java.util.Set r3 = r11.keySet()
                r4 = 1
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L57
                r5 = 0
            L37:
                boolean r6 = r3.hasNext()     // Catch: java.lang.Exception -> L55
                if (r6 == 0) goto L5c
                java.lang.Object r6 = r3.next()     // Catch: java.lang.Exception -> L55
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L55
                java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> L55
                r7.<init>(r6)     // Catch: java.lang.Exception -> L55
                java.lang.String r7 = r7.getName()     // Catch: java.lang.Exception -> L55
                boolean r7 = r2.contains(r7)     // Catch: java.lang.Exception -> L55
                if (r7 == 0) goto L37
                r2 = r6
                r5 = 1
                goto L37
            L55:
                r3 = move-exception
                goto L59
            L57:
                r3 = move-exception
                r5 = 0
            L59:
                r3.printStackTrace()
            L5c:
                if (r5 != 0) goto L6d
                java.lang.Object r3 = r11.get(r2)     // Catch: java.lang.Exception -> L69
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L69
                int r5 = r3.intValue()     // Catch: java.lang.Exception -> L69
                goto L6d
            L69:
                r3 = move-exception
                r3.printStackTrace()
            L6d:
                java.lang.Object r2 = r10.get(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r5 != r4) goto L78
                r9.add(r2)
            L78:
                int r1 = r1 + 1
                goto L19
            L7b:
                r8.b(r9)
                goto L83
            L7f:
                r9 = 0
                r8.b(r9)
            L83:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.activity.posting.PostingActivity.c.a(java.lang.Boolean, java.util.Map, java.util.Map):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements CustomEdittext.a {
        d() {
        }

        @Override // com.join.mgps.customview.CustomEdittext.a
        public void a(int i4, int i5) {
            int D0 = PostingActivity.this.D0(i4);
            w0.e("onSelectionChanged", "selStart=" + i4, "selEnd=" + i5, "pos=" + D0);
            if (D0 == i4) {
                return;
            }
            PostingActivity.this.f39480m.setSelection(D0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements TextWatcher {
        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            if (!PostingActivity.this.f39483p.getText().toString().trim().equals("") && PostingActivity.this.f39483p.getText().toString().trim().length() != 0) {
                PostingActivity.this.f1(true);
            } else {
                PostingActivity.this.f1(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnKeyListener {
        f() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            if (i4 == 67) {
                PostingActivity postingActivity = PostingActivity.this;
                return postingActivity.f39469b == 100 && postingActivity.f39480m.getText().toString().trim().length() == PostingActivity.this.f39478k.length() + 2;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PostingActivity.this.H != null) {
                PostingActivity.this.H.d();
            }
            PostingActivity postingActivity = PostingActivity.this;
            postingActivity.H = new w1(postingActivity, postingActivity.X);
            w1 w1Var = PostingActivity.this.H;
            w1Var.g("" + PostingActivity.this.f39470c.getAccountData().O1(), PostingActivity.this.I);
            PostingActivity.this.H.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PostingActivity.this.J != null) {
                PostingActivity.this.J.b();
            }
            PostingActivity postingActivity = PostingActivity.this;
            postingActivity.J = new x1(postingActivity, postingActivity.X);
            PostingActivity.this.J.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {
        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextUtils.isEmpty(PostingActivity.this.f39473f)) {
                PostingActivity.this.A.setText("选择小组");
                PostingActivity.this.A0(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements PopupWindow.OnDismissListener {
        j() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            PostingActivity.this.B.setImageResource(R.drawable.posting_load);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k implements Consumer<com.tbruyelle.rxpermissions2.b> {
        k() {
        }

        @Override // io.reactivex.functions.Consumer
        /* renamed from: a */
        public void accept(com.tbruyelle.rxpermissions2.b bVar) throws Exception {
            if (bVar.f62140b) {
                if (PostingActivity.this.checkPermiss(com.kuaishou.weapon.p0.g.f55590j)) {
                    PostingActivity.this.U0();
                }
            } else if (bVar.f62141c) {
            } else {
                b0.f0(PostingActivity.this).X(PostingActivity.this, bVar);
            }
        }
    }

    /* loaded from: classes4.dex */
    public class l implements TextWatcher {

        /* renamed from: b  reason: collision with root package name */
        List<Integer> f39506b = new ArrayList();

        public l() {
        }

        List<String> a() {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < PostingActivity.this.V.size(); i4++) {
                arrayList.add(((LabelBean) PostingActivity.this.V.get(i4)).getTag_name());
            }
            return arrayList;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            b(editable);
        }

        void b(Editable editable) {
            if (this.f39506b.size() < 2) {
                return;
            }
            char c5 = 0;
            int intValue = this.f39506b.get(0).intValue();
            int intValue2 = this.f39506b.get(1).intValue();
            ArrayList arrayList = new ArrayList();
            if (PostingActivity.this.V != null) {
                arrayList.addAll(PostingActivity.this.V);
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                LabelBean labelBean = (LabelBean) arrayList.get(i4);
                String tag_name = labelBean.getTag_name();
                int length = tag_name.length();
                if (intValue == i5 && intValue2 == (i5 + length) - 1) {
                    editable.delete(intValue, intValue2);
                    if (PostingActivity.this.r0(tag_name)) {
                        PostingActivity.this.V.remove(labelBean);
                    } else {
                        editable.insert(intValue, PostingActivity.this.y0(tag_name));
                    }
                    c5 = 1;
                } else {
                    i5 += length;
                    i4++;
                }
            }
            if (c5 > 0) {
                PostingActivity.this.c1();
                Selection.setSelection(editable, intValue);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            w0.e("beforeTextChanged", "charSequence=" + ((Object) charSequence), "start=" + i4, "count=" + i5, "after=" + i6);
            this.f39506b.clear();
            int i7 = i6 - i5;
            if (i7 == -1) {
                try {
                    int abs = Math.abs(i7);
                    String charSequence2 = charSequence.toString();
                    String substring = charSequence2.substring(i4, abs + i4);
                    int K0 = PostingActivity.this.K0();
                    if (!substring.equals("#") || i4 >= K0) {
                        return;
                    }
                    this.f39506b.add(Integer.valueOf(charSequence2.substring(0, i4).lastIndexOf("#")));
                    this.f39506b.add(Integer.valueOf(i4));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            w0.e("onTextChanged", "charSequence=" + ((Object) charSequence), "start=" + i4, "before=" + i5, "count=" + i6);
            Editable text = PostingActivity.this.f39480m.getText();
            int length = text.length();
            int K0 = PostingActivity.this.K0();
            if (!TextUtils.isEmpty(charSequence.toString()) && i4 < K0 && i6 > 0) {
                int i7 = i6 + i4;
                String charSequence2 = charSequence.subSequence(i4, i7).toString();
                if ((charSequence2.length() != length || i4 != 0) && !TextUtils.isEmpty(charSequence2) && !a().contains(charSequence2) && text.toString().length() >= K0) {
                    text.delete(i4, i7);
                    text.insert(Math.min(K0, text.toString().length()), charSequence2);
                }
            }
            if (length - K0 > 20) {
                PostingActivity.this.c1();
                PostingActivity.this.showToast("最大输入标题字数不能超过20个字!");
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface m {

        /* renamed from: a  reason: collision with root package name */
        public static final int f39508a = 4352;

        /* renamed from: b  reason: collision with root package name */
        public static final int f39509b = 4353;

        /* renamed from: c  reason: collision with root package name */
        public static final int f39510c = 4354;

        /* renamed from: d  reason: collision with root package name */
        public static final int f39511d = 4355;

        /* renamed from: e  reason: collision with root package name */
        public static final int f39512e = 4356;

        void a(int i4);

        void b(int i4);

        void c(GroupInfoBean groupInfoBean);

        void d(int i4);

        void e(int i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class n extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        private List<String> f39513b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private Context f39514c;

        /* renamed from: d  reason: collision with root package name */
        private c f39515d;

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f39516b;

            a(int i4) {
                this.f39516b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (n.this.f39515d != null) {
                    c cVar = n.this.f39515d;
                    int i4 = this.f39516b;
                    cVar.a(i4, (String) n.this.getItem(i4));
                }
            }
        }

        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f39518b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String[] f39519c;

            b(int i4, String[] strArr) {
                this.f39518b = i4;
                this.f39519c = strArr;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                j0.G0(n.this.f39514c, this.f39518b, this.f39519c);
            }
        }

        /* loaded from: classes4.dex */
        public interface c {
            void a(int i4, String str);
        }

        /* loaded from: classes4.dex */
        class d {

            /* renamed from: a  reason: collision with root package name */
            ImageView f39521a;

            /* renamed from: b  reason: collision with root package name */
            ImageView f39522b;

            d() {
            }
        }

        public n(Context context) {
            this.f39514c = context;
        }

        private ImageLoader c() {
            return ImageLoader.r(3, ImageLoader.Type.LIFO);
        }

        private void e(View view, View view2) {
            float f5 = this.f39514c.getResources().getDisplayMetrics().density;
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.share_posts_a_hlistview_padding);
            int i4 = dimensionPixelSize * 2;
            int dimensionPixelSize2 = ((this.f39514c.getResources().getDisplayMetrics().widthPixels - i4) - (view.getContext().getResources().getDimensionPixelSize(R.dimen.share_posts_a_hlistview_divider_width) * 3)) / 4;
            view2.setLayoutParams(new AbsHListView.LayoutParams(dimensionPixelSize2, dimensionPixelSize2));
            int i5 = dimensionPixelSize2 + i4;
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, i5));
            view.setMinimumHeight(i5);
        }

        public void d(List<String> list) {
            if (this.f39513b == null) {
                this.f39513b = new ArrayList();
            }
            this.f39513b.clear();
            this.f39513b.addAll(list);
        }

        public void f(c cVar) {
            this.f39515d = cVar;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<String> list = this.f39513b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<String> list = this.f39513b;
            if (list == null) {
                return null;
            }
            return list.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            d dVar;
            try {
                if (view != null) {
                    dVar = (d) view.getTag();
                } else {
                    view = LayoutInflater.from(this.f39514c).inflate(R.layout.forum_post_pic_item, (ViewGroup) null);
                    dVar = new d();
                    dVar.f39521a = (ImageView) view.findViewById(R.id.image);
                    dVar.f39522b = (ImageView) view.findViewById(R.id.image_delete);
                    view.setTag(dVar);
                }
                dVar.f39521a.setOnClickListener(null);
                dVar.f39522b.setVisibility(0);
                e(viewGroup, view);
                if (this.f39513b.get(i4).contains("content://")) {
                    dVar.f39521a.setImageURI(Uri.parse(this.f39513b.get(i4)));
                } else {
                    c().v(this.f39513b.get(i4), dVar.f39521a);
                }
                dVar.f39522b.setOnClickListener(new a(i4));
                ArrayList arrayList = new ArrayList();
                arrayList.clear();
                arrayList.addAll(this.f39513b);
                int size = arrayList.size() < 9 ? arrayList.size() : 9;
                String[] strArr = new String[size];
                arrayList.toArray(strArr);
                for (int i5 = 0; i5 < size; i5++) {
                    strArr[i5] = "file://" + strArr[i5];
                }
                dVar.f39521a.setOnClickListener(new b(i4, strArr));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return view;
        }
    }

    private List<String> C0(Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            return (List) intent.getExtras().get(MyAlbumActivity.f14984x);
        }
        return new ArrayList();
    }

    private String I0() {
        String obj = this.f39480m.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            return "";
        }
        String trim = obj.trim();
        List<LabelBean> list = this.V;
        if (list != null && list.size() > 0) {
            for (LabelBean labelBean : this.V) {
                if (trim.contains(labelBean.getTag_name())) {
                    trim = trim.replace(labelBean.getTag_name(), "");
                }
            }
        }
        v0.b("PostingActivity", "Subject:" + trim);
        return trim;
    }

    private void P0() {
        n nVar = new n(this);
        this.Y = nVar;
        nVar.d(this.Z);
        this.Y.f(new b());
        this.f39485q.setAdapter((ListAdapter) this.Y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U0() {
        Intent intent = new Intent(this, MyAlbumActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(MyAlbumActivity.f14984x, (Serializable) this.Z);
        intent.putExtras(bundle);
        startActivityForResult(intent, 256);
    }

    private void Y0(String str) {
        d1 d1Var = this.K;
        if (d1Var != null && d1Var.isShowing()) {
            this.K.dismiss();
        }
        d1 z4 = b0.f0(this).z(this, str, false);
        this.K = z4;
        z4.b();
    }

    private n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    private boolean isLogined(Context context) {
        n0 accountBean = accountBean(context);
        return accountBean != null && g2.i(accountBean.getToken());
    }

    private void t0() {
        List<String> list = this.L;
        if (list == null || list.size() == 0) {
            return;
        }
        for (int i4 = 0; i4 < list.size(); i4++) {
            try {
                File file = new File(list.get(i4));
                if (file.getParentFile().exists()) {
                    net.bither.util.b.k(file.getParentFile());
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        net.bither.util.b.q().f71696c = new Hashtable<>();
        net.bither.util.b.q().f71695b = new Hashtable<>();
    }

    private LinkedMultiValueMap<String, Object> x0() {
        LinkedMultiValueMap<String, Object> linkedMultiValueMap = new LinkedMultiValueMap<>();
        linkedMultiValueMap.add("uid", this.f39470c.getUid());
        linkedMultiValueMap.add("token", this.f39470c.getToken());
        linkedMultiValueMap.add("fid", z0() + "");
        linkedMultiValueMap.add("rsid", ((int) Math.random()) + "");
        linkedMultiValueMap.add("subject", I0());
        linkedMultiValueMap.add(ForumPostsTagSelectActivity_.f30895y, H0() + "");
        linkedMultiValueMap.add("game_id", getGameId());
        linkedMultiValueMap.add("comment_game_id", g2.g(this.f39477j));
        linkedMultiValueMap.add("help_money", this.I + "");
        linkedMultiValueMap.add("tag_ids", J0());
        linkedMultiValueMap.add("message", this.f39483p.getText().toString());
        for (int i4 = 0; i4 < this.L.size(); i4++) {
            if (this.L.get(i4).contains("content://")) {
                File o4 = g0.o(Uri.parse(this.L.get(i4)), this);
                linkedMultiValueMap.add("img_" + (i4 + 1), o4.getAbsolutePath());
            } else {
                linkedMultiValueMap.add("img_" + (i4 + 1), new FileSystemResource(this.L.get(i4)));
            }
        }
        if (this.f39472e == 6) {
            linkedMultiValueMap.add("resource_url", this.f39481n.getText().toString());
        }
        return linkedMultiValueMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void A0(boolean z4) {
        try {
            ResultResMainBean<GroupListBean> s4 = this.f39479l.s(this.f39470c.getUid(), this.f39470c.getAccountData().getToken(), this.f39474g, this.f39475h);
            if (s4 != null && s4.getData() != null) {
                if (z4) {
                    Q0(s4.getData());
                    return;
                } else {
                    Z0(s4.getData());
                    return;
                }
            }
            showToast("网络异常，请检查网络！");
        } catch (Exception unused) {
            showToast("网络异常，请检查网络！");
        }
    }

    String B0() {
        StringBuilder sb = new StringBuilder();
        int i4 = this.f39472e;
        if (i4 == 1) {
            sb.append("需要等级 首领\n");
            sb.append("-请发表对别人有意义的内容\n");
        } else if (i4 == 2) {
            sb.append("需要等级 巡山将\n");
            sb.append("-请发表对别人有意义的内容\n");
        } else if (i4 == 3) {
            sb.append("需要等级 无\n");
            sb.append("-请清晰说明求助的问题\n");
        } else if (i4 == 4) {
            sb.append("需要等级 山大王\n");
            sb.append("-请在推荐的游戏里附上详细的理由\n");
        }
        sb.append("-你可以插入话题，给帖子一个归属\n");
        sb.append("-你也可以给帖子配上图片方便别人理解\n");
        return sb.toString();
    }

    int D0(int i4) {
        if (i4 < K0()) {
            String obj = this.f39480m.getText().toString();
            int i5 = 0;
            for (LabelBean labelBean : this.V) {
                String tag_name = labelBean.getTag_name();
                if (!TextUtils.isEmpty(tag_name) && obj.contains(tag_name) && i4 <= (i5 = i5 + tag_name.length())) {
                    return Math.abs(i4 - (i5 - tag_name.length())) < Math.abs(i5 - i4) ? i5 - tag_name.length() : i5;
                }
            }
            return i4;
        }
        return i4;
    }

    String E0() {
        String substring = this.f39480m.getText().toString().substring(K0());
        return (TextUtils.isEmpty(substring) || substring.length() <= 20) ? substring : substring.substring(0, 20);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void F0() {
        if (this.N) {
            return;
        }
        if (com.join.android.app.common.utils.j.j(this)) {
            if (!isLogined(this)) {
                showToast(getString(R.string.forum_user_not_login));
                return;
            } else if (!g1()) {
                W0();
                return;
            } else {
                if (TextUtils.isEmpty(this.f39473f) && this.O) {
                    A0(true);
                }
                G0();
                try {
                    showLoading();
                    if (this.f39479l.H(this.f39470c.getUid(), this.f39470c.getToken(), this.f39472e).getError() == 0) {
                        this.N = true;
                        N0();
                    } else {
                        X0();
                    }
                    return;
                } catch (Exception e5) {
                    T0("getPostingAuthority Exception: " + e5.getMessage());
                    X0();
                    return;
                }
            }
        }
        X0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void G0() {
        try {
            ResultResMainBean<String> j02 = this.f39479l.j0(this.f39472e);
            if (j02 != null && j02.getData() != null) {
                V0(j02.getData());
            }
        } catch (Exception unused) {
        }
    }

    int H0() {
        int i4 = this.f39472e;
        if (i4 == 1) {
            return 1;
        }
        if (i4 == 2) {
            return 2;
        }
        if (i4 == 3) {
            return 3;
        }
        if (i4 == 4) {
            return 4;
        }
        return i4 == 6 ? 6 : 1;
    }

    String J0() {
        StringBuilder sb = new StringBuilder();
        if (this.V.size() <= 0) {
            return sb.length() > 0 ? sb.deleteCharAt(sb.length() - 1).toString() : "";
        }
        Iterator<LabelBean> it2 = this.V.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().getTag_id() + ",");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    int K0() {
        String obj = this.f39480m.getText().toString();
        int i4 = 0;
        if (!TextUtils.isEmpty(obj)) {
            for (LabelBean labelBean : this.V) {
                String tag_name = labelBean.getTag_name();
                if (!TextUtils.isEmpty(tag_name) && obj.contains(tag_name)) {
                    i4 += tag_name.length();
                }
            }
        }
        return i4;
    }

    void L0(String str) {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(4);
        intentDateBean.setLink_type_val(str);
        ShareWebActivity_.t2(this).b(intentDateBean).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void M0() {
        Intent intent = new Intent();
        intent.putExtra(PostingActivity_.M1, this.f39472e);
        setResult(-1, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void N0() {
        this.E.setVisibility(0);
        this.G.setVisibility(8);
        this.F.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void O0() {
        d1 d1Var = this.K;
        if (d1Var == null || !d1Var.isShowing()) {
            return;
        }
        this.K.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Q0(GroupListBean groupListBean) {
        this.O = false;
        GroupInfoBean groupInfoBean = groupListBean.getRecommendForum().get(0);
        this.T = groupInfoBean;
        e1(groupInfoBean.getName(), false);
    }

    void R0(String str) {
        Editable editableText = this.f39480m.getEditableText();
        editableText.insert(K0(), Html.fromHtml("<font color=#3CA4FD>" + str + "</font>"));
    }

    boolean S0() {
        if (isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && isDestroyed();
    }

    void T0(String str) {
        v0.b("PostingActivity", str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void V0(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split("#")) == null || split.length <= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            sb.append(str2);
            sb.append("\n");
        }
        try {
            this.f39483p.setHint(sb.deleteCharAt(sb.length() - 1).toString());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void W0() {
        ((LoginSplashActivity_.IntentBuilder_) LoginSplashActivity_.intent(this).flags(268435456)).start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void X0() {
        this.E.setVisibility(8);
        this.G.setVisibility(8);
        this.F.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void Z0(GroupListBean groupListBean) {
        z zVar = this.R;
        if (zVar != null) {
            zVar.dismiss();
        }
        z zVar2 = new z(this, this.X);
        this.R = zVar2;
        zVar2.setOnDismissListener(new j());
        this.B.setImageResource(R.drawable.posting_pull);
        this.R.a(groupListBean.getRecommendForum(), groupListBean.getFollowForum(), this.T);
        this.R.showAsDropDown(this.S);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void a1(int i4) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f39479l = com.join.mgps.rpc.impl.g.A0();
        this.f39485q.setVisibility(8);
        this.Q.setVisibility(8);
        this.f39480m.setOnSelectionChanged(new d());
        f1(false);
        this.f39483p.addTextChangedListener(new e());
        if (this.f39469b == 100) {
            LabelBean labelBean = new LabelBean();
            labelBean.setTag_id(Integer.parseInt(this.f39474g));
            labelBean.setTag_name(this.f39478k);
            b1(labelBean);
        }
        this.f39480m.setOnKeyListener(new f());
        this.f39480m.addTextChangedListener(new l());
        this.f39486r.setVisibility(0);
        if (this.f39472e == 3) {
            this.f39487s.setVisibility(0);
            this.f39490v.setVisibility(8);
            this.f39489u.setOnClickListener(new g());
        } else {
            this.f39487s.setVisibility(8);
            this.f39490v.setVisibility(0);
            this.f39492x.setOnClickListener(new h());
        }
        this.A.setOnClickListener(new i());
        P0();
        e1(this.f39473f, true);
        int i4 = this.f39472e;
        if (i4 == 1 || i4 == 2) {
            this.f39486r.setVisibility(8);
        }
        if (!(TextUtils.isEmpty(this.f39474g) && TextUtils.isEmpty(this.f39475h)) && this.f39472e == 6) {
            this.f39482o.setVisibility(0);
            this.f39481n.setVisibility(0);
            this.f39486r.setVisibility(8);
        }
    }

    void b1(LabelBean labelBean) {
        for (LabelBean labelBean2 : this.V) {
            if (labelBean2.getTag_id() == labelBean.getTag_id()) {
                return;
            }
        }
        String str = "#" + labelBean.getTag_name() + "#";
        labelBean.setTag_name(str);
        this.V.add(labelBean);
        R0(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        b0.f0(this).D(this);
    }

    void c1() {
        d1();
    }

    void d1() {
        int selectionStart = this.f39480m.getSelectionStart();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String E0 = E0();
        for (LabelBean labelBean : this.V) {
            String tag_name = labelBean.getTag_name();
            spannableStringBuilder.append((CharSequence) Html.fromHtml("<font color=#3CA4FD>" + tag_name + "</font>"));
        }
        spannableStringBuilder.append((CharSequence) E0);
        this.f39480m.setText(spannableStringBuilder);
        try {
            if (selectionStart > this.f39480m.getText().toString().length()) {
                selectionStart = this.f39480m.getText().toString().length();
            }
            Selection.setSelection(this.f39480m.getEditableText(), selectionStart);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    void e1(String str, boolean z4) {
        if (TextUtils.isEmpty(str)) {
            if (z4) {
                this.B.setVisibility(0);
            }
            this.A.setTextColor(Color.parseColor("#3CA4FD"));
            this.A.setText("选择小组");
            this.f39494z.setImageResource(R.drawable.posting_location_blue);
            return;
        }
        if (z4) {
            this.B.setVisibility(8);
        }
        this.f39494z.setImageResource(R.drawable.posting_location);
        this.A.setTextColor(Color.parseColor("#262626"));
        this.A.setText(str);
    }

    void f1(boolean z4) {
        if (z4) {
            this.C.setEnabled(true);
            this.C.setTextColor(Color.parseColor("#F47500"));
            this.C.setBackgroundResource(R.drawable.posting_publish_selected);
            return;
        }
        this.C.setEnabled(false);
        this.C.setTextColor(Color.parseColor("#A8A8A8"));
        this.C.setBackgroundResource(R.drawable.posting_publish_normal);
    }

    boolean g1() {
        if (accountBean(this) == null) {
            return false;
        }
        return !AccountUtil_.getInstance_(this).isTourist();
    }

    String getGameId() {
        DownloadTask downloadTask = this.U;
        if (downloadTask != null) {
            return downloadTask.getCrc_link_type_val();
        }
        CollectionBeanSub collectionBeanSub = this.W;
        return collectionBeanSub != null ? collectionBeanSub.getGame_id() : "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 256) {
            if (this.Z == null) {
                this.Z = new ArrayList();
            }
            this.Z.clear();
            this.Z.addAll(C0(intent));
            if (this.Z.size() > 0) {
                this.f39485q.setVisibility(0);
            } else {
                this.f39485q.setVisibility(8);
            }
            this.Y.d(this.Z);
            this.Y.notifyDataSetChanged();
        } else if (i5 == -1) {
            if (i4 != H1) {
                switch (i4) {
                    case 4352:
                        this.U = (DownloadTask) intent.getSerializableExtra("gameInfo");
                        TextView textView = this.f39491w;
                        textView.setText(Html.fromHtml("推荐游戏：<font color=#000000>" + this.U.getShowName() + "</font>"));
                        return;
                    case 4353:
                    case 4354:
                        this.W = (CollectionBeanSub) intent.getSerializableExtra("gameInfo");
                        TextView textView2 = this.f39491w;
                        textView2.setText(Html.fromHtml("推荐游戏：<font color=#000000>" + this.W.getGame_name() + "</font>"));
                        return;
                    default:
                        return;
                }
            }
            b1((LabelBean) intent.getSerializableExtra("label"));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        back_image();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        net.bither.util.b.q().z(this.P);
        net.bither.util.b.q().f71696c = new Hashtable<>();
        net.bither.util.b.q().f71695b = new Hashtable<>();
        s0();
        List<String> list = this.L;
        if (list != null) {
            list.clear();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        net.bither.util.b.q().e(this.P);
        F0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void q0() {
        try {
            if (!isLogined(this)) {
                showToast(getString(R.string.forum_user_not_login));
                return;
            }
            n0 accountData = AccountUtil_.getInstance_(this).getAccountData();
            if (!g2.h(accountData.getNickname()) && (!accountData.getAccount().equals(accountData.getNickname()) || !accountData.getAccount().startsWith("pa"))) {
                if (!g1()) {
                    W0();
                    return;
                } else if (z0() <= 0) {
                    showToast("请选择小组");
                    return;
                } else if (TextUtils.isEmpty(this.f39483p.getText().toString())) {
                    showToast("请输入帖子内容");
                    return;
                } else if (this.f39472e == 6 && TextUtils.isEmpty(this.f39481n.getText().toString())) {
                    showToast("请输入资源链接地址");
                    return;
                } else {
                    int i4 = this.f39472e;
                    if (i4 == 3 && this.I < 0) {
                        showToast("请选择悬赏铜板数");
                        return;
                    } else if (i4 == 4 && TextUtils.isEmpty(getGameId())) {
                        showToast("请选择推荐游戏");
                        return;
                    } else if (!com.join.android.app.common.utils.j.j(this)) {
                        this.M = 0;
                        showToast(getString(R.string.net_connect_failed));
                        return;
                    } else {
                        Y0("正在发帖， 请稍等...");
                        this.M = 1;
                        net.bither.util.b.q().y();
                        return;
                    }
                }
            }
            IntentUtil.getInstance().goChangeNickname(this);
        } catch (Exception e5) {
            this.M = 0;
            e5.printStackTrace();
        }
    }

    boolean r0(String str) {
        List<LabelBean> list;
        if (this.f39469b == 100 && (list = this.V) != null && list.size() > 0) {
            LabelBean labelBean = this.V.get(0);
            if (!TextUtils.isEmpty(labelBean.getTag_name()) && !TextUtils.isEmpty(str) && str.equals(labelBean.getTag_name())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        F0();
    }

    void s0() {
        if (this.Z.size() <= 0) {
            return;
        }
        System.gc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoading() {
        this.E.setVisibility(8);
        this.G.setVisibility(0);
        this.F.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        if (S0()) {
            return;
        }
        l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void u0() {
        try {
            ResultResMainBean<Response> x02 = this.f39479l.x0(x0());
            if (x02 != null) {
                if (x02.getData().isResult()) {
                    showToast("发帖成功,将在审核后显示");
                    t0();
                    O0();
                    M0();
                } else {
                    showToast(x02.getData().getMsg());
                    O0();
                }
            } else {
                showToast("发帖失败");
                O0();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
            showToast("发帖失败");
            O0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void v0() {
        if (this.V.size() >= 3) {
            showToast("最多只能选择3个话题");
            return;
        }
        Intent intent = new Intent(this, SearchLabelActivity_.class);
        intent.putExtra("postingLabelType", this.f39472e);
        startActivityForResult(intent, H1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        try {
            new com.tbruyelle.rxpermissions2.c(this).r(com.kuaishou.weapon.p0.g.f55590j).subscribe(new k());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    Spanned y0(String str) {
        return Html.fromHtml("<font color=#3CA4FD>" + str + "</font>");
    }

    int z0() {
        int i4 = this.f39476i;
        if (i4 > 0) {
            return i4;
        }
        GroupInfoBean groupInfoBean = this.T;
        if (groupInfoBean != null) {
            return groupInfoBean.getFid();
        }
        return 0;
    }
}
