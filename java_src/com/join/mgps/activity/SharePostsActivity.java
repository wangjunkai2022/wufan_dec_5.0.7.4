package com.join.mgps.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.BaseActivity;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.component.album.MyAlbumActivity;
import com.join.android.app.component.album.lib.ImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.j0;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import com.join.mgps.dto.ForumRequestBean;
import com.join.mgps.dto.ForumResponse;
import it.sephiroth.android.library.widget.AbsHListView;
import it.sephiroth.android.library.widget.HListView;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.bither.util.b;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.springframework.util.LinkedMultiValueMap;
@EActivity(R.layout.share_posts_activity)
/* loaded from: classes4.dex */
public class SharePostsActivity extends BaseActivity {
    public static final String A = "forum_id";
    public static final String B = "key_from_posts_submit_request";
    public static final String C = "key_from_class";
    private static String D = "value_from_class";
    public static final int E = 9;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f37447c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    Button f37448d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f37449e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f37450f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    HListView f37451g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f37452h;

    /* renamed from: i  reason: collision with root package name */
    i f37453i;

    /* renamed from: j  reason: collision with root package name */
    List<String> f37454j;

    /* renamed from: k  reason: collision with root package name */
    com.join.mgps.rpc.i f37455k;

    /* renamed from: m  reason: collision with root package name */
    ForumRequestBean.ForumPostsSubmitRequestBean f37457m;

    /* renamed from: n  reason: collision with root package name */
    private com.join.mgps.dialog.w0 f37458n;

    /* renamed from: p  reason: collision with root package name */
    com.join.mgps.dialog.v0 f37460p;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    LinearLayout f37465u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    GridView f37466v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    TextView f37467w;

    /* renamed from: x  reason: collision with root package name */
    private SimpleAdapter f37468x;

    /* renamed from: b  reason: collision with root package name */
    public final String f37446b = getClass().getSimpleName();

    /* renamed from: l  reason: collision with root package name */
    int f37456l = -1;

    /* renamed from: o  reason: collision with root package name */
    int f37459o = (int) Math.random();

    /* renamed from: q  reason: collision with root package name */
    int f37461q = 0;

    /* renamed from: r  reason: collision with root package name */
    private j0.j f37462r = new a();

    /* renamed from: s  reason: collision with root package name */
    private b.e f37463s = new b();

    /* renamed from: t  reason: collision with root package name */
    private String[] f37464t = {"0", "5", com.join.mgps.Util.v.f28122v, "30", "50", "60", "80", "100"};

    /* renamed from: y  reason: collision with root package name */
    private int f37469y = -1;

    /* renamed from: z  reason: collision with root package name */
    com.join.mgps.customview.o f37470z = null;

    /* loaded from: classes4.dex */
    class a extends j0.j {
        a() {
        }

        @Override // com.join.mgps.Util.j0.j, com.join.mgps.Util.j0.i
        public void d(int i4) {
            super.d(i4);
            SharePostsActivity.this.C0(1);
        }

        @Override // com.join.mgps.Util.j0.j, com.join.mgps.Util.j0.i
        public void e(ForumData.ForumPostsSubmitData forumPostsSubmitData) {
            super.e(forumPostsSubmitData);
            SharePostsActivity.this.C0(2);
        }
    }

    /* loaded from: classes4.dex */
    class b implements b.e {
        b() {
        }

        private void b(List<String> list) {
            SharePostsActivity sharePostsActivity = SharePostsActivity.this;
            if (sharePostsActivity.f37461q == 1) {
                sharePostsActivity.f37461q = 2;
                if (list != null && list.size() != 0) {
                    SharePostsActivity.this.f37457m.setImages(list);
                }
                SharePostsActivity.this.p0();
            }
        }

        @Override // net.bither.util.b.e
        public void a(Boolean bool, Map<String, String> map, Map<String, Integer> map2) {
            List<String> list;
            if (bool.booleanValue() && (list = SharePostsActivity.this.f37454j) != null && list.size() != 0) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < SharePostsActivity.this.f37454j.size(); i4++) {
                    String str = SharePostsActivity.this.f37454j.get(i4);
                    int intValue = map2.get(str).intValue();
                    String str2 = map.get(str);
                    if (intValue == 1) {
                        arrayList.add(str2);
                    }
                }
                b(arrayList);
                return;
            }
            b(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements DialogInterface.OnCancelListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            SharePostsActivity.this.f37461q = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements i.d {
        d() {
        }

        @Override // com.join.mgps.activity.SharePostsActivity.i.d
        public void a(int i4, String str) {
            SharePostsActivity.this.f37454j.remove(i4);
            SharePostsActivity sharePostsActivity = SharePostsActivity.this;
            sharePostsActivity.f37453i.d(sharePostsActivity.f37454j);
            SharePostsActivity.this.f37453i.notifyDataSetChanged();
            net.bither.util.b.q().j(SharePostsActivity.this.getApplicationContext(), str, false);
        }

        @Override // com.join.mgps.activity.SharePostsActivity.i.d
        public void b() {
            SharePostsActivity.this.goMyAlbumActivity4PickPic();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharePostsActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SharePostsActivity.this.f37460p.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements AdapterView.OnItemClickListener {
        g() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (SharePostsActivity.this.f37469y != i4) {
                if (AccountUtil_.getInstance_(view.getContext()).getAccountData().O1() >= Integer.parseInt(SharePostsActivity.this.f37464t[i4])) {
                    if (SharePostsActivity.this.f37469y >= 0) {
                        SharePostsActivity sharePostsActivity = SharePostsActivity.this;
                        sharePostsActivity.l0(sharePostsActivity.f37468x, SharePostsActivity.this.f37469y, false);
                    }
                    SharePostsActivity.this.f37469y = i4;
                    SharePostsActivity sharePostsActivity2 = SharePostsActivity.this;
                    sharePostsActivity2.l0(sharePostsActivity2.f37468x, i4, true);
                    return;
                }
                SharePostsActivity.this.showToast(view.getContext().getString(R.string.share_posts_nomore_help_money));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class h implements InputFilter {

        /* renamed from: b  reason: collision with root package name */
        int f37478b;

        /* renamed from: c  reason: collision with root package name */
        String f37479c = "[\\u4e00-\\u9fa5]";

        public h(int i4) {
            this.f37478b = i4;
        }

        private int a(String str) {
            Matcher matcher = Pattern.compile(this.f37479c).matcher(str);
            int i4 = 0;
            while (matcher.find()) {
                for (int i5 = 0; i5 <= matcher.groupCount(); i5++) {
                    i4++;
                }
            }
            return i4;
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
            if (spanned.toString().length() + a(spanned.toString()) + charSequence.toString().length() + a(charSequence.toString()) > this.f37478b) {
                Toast.makeText(SharePostsActivity.this, "最多可以填写20个字", 0).show();
                return "";
            }
            return charSequence;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class i extends BaseAdapter {

        /* renamed from: f  reason: collision with root package name */
        private static final String f37481f = "add_image";

        /* renamed from: c  reason: collision with root package name */
        private Context f37483c;

        /* renamed from: e  reason: collision with root package name */
        private d f37485e;

        /* renamed from: d  reason: collision with root package name */
        boolean f37484d = false;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f37482b = new ArrayList();

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                i iVar = i.this;
                if (iVar.f37484d) {
                    return;
                }
                iVar.f37484d = true;
                if (iVar.f37485e != null) {
                    i.this.f37485e.b();
                }
            }
        }

        /* loaded from: classes4.dex */
        class b implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f37487b;

            b(int i4) {
                this.f37487b = i4;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (i.this.f37485e != null) {
                    d dVar = i.this.f37485e;
                    int i4 = this.f37487b;
                    dVar.a(i4, (String) i.this.getItem(i4));
                }
            }
        }

        /* loaded from: classes4.dex */
        class c implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f37489b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String[] f37490c;

            c(int i4, String[] strArr) {
                this.f37489b = i4;
                this.f37490c = strArr;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.join.mgps.Util.j0.G0(i.this.f37483c, this.f37489b, this.f37490c);
            }
        }

        /* loaded from: classes4.dex */
        public interface d {
            void a(int i4, String str);

            void b();
        }

        /* loaded from: classes4.dex */
        class e {

            /* renamed from: a  reason: collision with root package name */
            ImageView f37492a;

            /* renamed from: b  reason: collision with root package name */
            ImageView f37493b;

            e() {
            }
        }

        public i(Context context) {
            this.f37483c = context;
        }

        private ImageLoader c() {
            return ImageLoader.r(3, ImageLoader.Type.LIFO);
        }

        private void f(View view, View view2) {
            float f5 = this.f37483c.getResources().getDisplayMetrics().density;
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.share_posts_a_hlistview_padding);
            int i4 = dimensionPixelSize * 2;
            int dimensionPixelSize2 = ((this.f37483c.getResources().getDisplayMetrics().widthPixels - i4) - (view.getContext().getResources().getDimensionPixelSize(R.dimen.share_posts_a_hlistview_divider_width) * 3)) / 4;
            view2.setLayoutParams(new AbsHListView.LayoutParams(dimensionPixelSize2, dimensionPixelSize2));
            int i5 = dimensionPixelSize2 + i4;
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, i5));
            view.setMinimumHeight(i5);
        }

        public void d(List<String> list) {
            if (this.f37482b == null) {
                this.f37482b = new ArrayList();
            }
            this.f37482b.clear();
            this.f37482b.addAll(list);
            if (list.size() < 9) {
                this.f37482b.add(f37481f);
            }
        }

        public void e(boolean z4) {
            this.f37484d = z4;
        }

        public void g(d dVar) {
            this.f37485e = dVar;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<String> list = this.f37482b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<String> list = this.f37482b;
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
            e eVar;
            try {
                if (view != null) {
                    eVar = (e) view.getTag();
                } else {
                    view = LayoutInflater.from(this.f37483c).inflate(R.layout.forum_post_pic_item, (ViewGroup) null);
                    eVar = new e();
                    eVar.f37492a = (ImageView) view.findViewById(R.id.image);
                    eVar.f37493b = (ImageView) view.findViewById(R.id.image_delete);
                    view.setTag(eVar);
                }
                eVar.f37492a.setOnClickListener(null);
                eVar.f37493b.setVisibility(0);
                f(viewGroup, view);
                if (i4 == getCount() - 1 && this.f37482b.get(i4).equals(f37481f)) {
                    eVar.f37493b.setVisibility(8);
                    eVar.f37492a.setImageResource(R.drawable.pic_add);
                    eVar.f37492a.setOnClickListener(new a());
                } else {
                    c().v(this.f37482b.get(i4), eVar.f37492a);
                    eVar.f37493b.setOnClickListener(new b(i4));
                    ArrayList arrayList = new ArrayList();
                    arrayList.clear();
                    arrayList.addAll(this.f37482b);
                    int i5 = 9;
                    if (arrayList.size() < 9) {
                        i5 = arrayList.size() - 1;
                        arrayList.remove(i5);
                    }
                    String[] strArr = new String[i5];
                    arrayList.toArray(strArr);
                    for (int i6 = 0; i6 < i5; i6++) {
                        strArr[i6] = "file://" + strArr[i6];
                    }
                    eVar.f37492a.setOnClickListener(new c(i4, strArr));
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
        }
    }

    private void A0() {
        if (this.f37460p == null) {
            com.join.mgps.dialog.v0 v0Var = new com.join.mgps.dialog.v0(this);
            this.f37460p = v0Var;
            v0Var.b(8);
            this.f37460p.f("放弃发布");
            this.f37460p.d("继续编辑");
            this.f37460p.g("你要放弃发布吗？").c(new f()).e(new e());
        }
        if (this.f37460p.isShowing()) {
            return;
        }
        this.f37460p.show();
    }

    private com.wufan.user.service.protobuf.n0 accountBean(Context context) {
        return AccountUtil_.getInstance_(context).getAccountData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(SimpleAdapter simpleAdapter, int i4, boolean z4) {
        HashMap hashMap = (HashMap) simpleAdapter.getItem(i4);
        if (z4) {
            hashMap.put("itemRadioImg", Integer.valueOf((int) R.drawable.shape_forum_help_money_selected));
        } else {
            hashMap.put("itemRadioImg", Integer.valueOf((int) R.drawable.shape_forum_help_money_default));
        }
        simpleAdapter.notifyDataSetChanged();
        y0(i4);
    }

    private void m0() {
        if (com.join.mgps.Util.j0.Y0(this)) {
            return;
        }
        com.join.mgps.Util.j0.L0(this);
    }

    private void n0() {
        List<String> images = this.f37457m.getImages();
        if (images == null || images.size() == 0) {
            return;
        }
        for (int i4 = 0; i4 < images.size(); i4++) {
            try {
                File file = new File(images.get(i4));
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

    private void o0() {
        com.join.mgps.customview.o oVar = this.f37470z;
        if (oVar == null || !oVar.isShowing()) {
            return;
        }
        this.f37470z.dismiss();
    }

    private List<String> q0(Intent intent) {
        if (intent != null && intent.getExtras() != null) {
            return (List) intent.getExtras().get(MyAlbumActivity.f14984x);
        }
        return new ArrayList();
    }

    private SimpleAdapter r0(int i4, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            HashMap hashMap = new HashMap();
            hashMap.put("itemRadioImg", Integer.valueOf(i4));
            hashMap.put("itemRadioText", str);
            arrayList.add(hashMap);
        }
        return new SimpleAdapter(this, arrayList, R.layout.mg_forum_share_posts_a_item_help_money, new String[]{"itemRadioImg", "itemRadioText"}, new int[]{R.id.itemRadioImg, R.id.itemRadioText});
    }

    private void s0() {
        this.f37454j = new ArrayList();
        i iVar = new i(this);
        this.f37453i = iVar;
        iVar.d(this.f37454j);
        this.f37453i.g(new d());
        this.f37451g.setAdapter((ListAdapter) this.f37453i);
    }

    private void u0() {
        this.f37447c.setText("发帖");
        this.f37448d.setVisibility(0);
        com.join.mgps.dialog.w0 w0Var = new com.join.mgps.dialog.w0(this);
        this.f37458n = w0Var;
        w0Var.setCancelable(true);
        this.f37458n.setOnCancelListener(new c());
        com.join.mgps.Util.k0.I1(this).b(this.f37462r);
        SpannableString spannableString = new SpannableString("每次最多可以分享9张图");
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#808080")), 8, 9, 33);
        this.f37452h.setText(spannableString);
        this.f37449e.setFilters(new InputFilter[]{new h(40)});
        s0();
        t0();
    }

    private boolean v0() {
        return this.f37450f.getText().toString().equals("");
    }

    private boolean w0() {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                String p02 = com.join.mgps.Util.j0.p0(this);
                if (com.join.mgps.Util.g2.h(p02)) {
                    com.join.mgps.Util.j0.L0(this);
                    return false;
                }
                if (this.f37457m == null) {
                    this.f37457m = new ForumRequestBean.ForumPostsSubmitRequestBean();
                }
                this.f37457m.setFid(this.f37456l);
                this.f37457m.setUid(com.join.mgps.Util.j0.o0(this));
                this.f37457m.setToken(p02);
                this.f37457m.setRsid(this.f37459o);
                this.f37457m.setSubject(this.f37449e.getText().toString());
                this.f37457m.setMessage(this.f37450f.getText().toString());
                this.f37457m.setImages(this.f37454j);
                return true;
            }
            showToast(getString(R.string.net_connect_failed));
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private void z0(TextView textView, String str, String str2, String str3) {
        SpannableString spannableString = new SpannableString(str);
        int indexOf = str.indexOf(str2 + "");
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str3)), indexOf, (str2 + "").length() + indexOf, 33);
        textView.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void B0(int i4, int i5) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void C0(int i4) {
        if (this.f37458n == null) {
            this.f37458n = new com.join.mgps.dialog.w0(this);
        }
        this.f37458n.c(i4);
        if (i4 != 2) {
            return;
        }
        ForumBean forumBean = new ForumBean();
        forumBean.setFid(this.f37457m.getFid());
        com.join.mgps.Util.j0.r0(this, forumBean);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f37455k = com.join.mgps.rpc.impl.g.A0();
        String str = (String) getIntent().getSerializableExtra(B);
        D = getIntent().getStringExtra(C);
        if (com.join.mgps.Util.g2.h(str)) {
            finish();
            return;
        }
        ForumRequestBean.ForumPostsSubmitRequestBean forumPostsSubmitRequestBean = (ForumRequestBean.ForumPostsSubmitRequestBean) JsonMapper.getInstance().fromJson(str, ForumRequestBean.ForumPostsSubmitRequestBean.class);
        this.f37457m = forumPostsSubmitRequestBean;
        if (forumPostsSubmitRequestBean != null) {
            this.f37456l = forumPostsSubmitRequestBean.getFid();
            if (this.f37457m == null) {
                this.f37457m = new ForumRequestBean.ForumPostsSubmitRequestBean();
            }
            u0();
            m0();
            return;
        }
        this.f37456l = -1;
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        List<String> list;
        if (!com.join.mgps.Util.g2.i(this.f37449e.getText().toString()) && !com.join.mgps.Util.g2.i(this.f37450f.getText().toString()) && ((list = this.f37454j) == null || list.size() <= 1)) {
            finish();
        } else {
            A0();
        }
    }

    public void goMyAlbumActivity4PickPic() {
        Intent intent = new Intent(this, MyAlbumActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(MyAlbumActivity.f14984x, (Serializable) this.f37454j);
        intent.putExtras(bundle);
        startActivityForResult(intent, 256);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i4, int i5, Intent intent) {
        super.onActivityResult(i4, i5, intent);
        if (i4 == 256) {
            if (this.f37454j == null) {
                this.f37454j = new ArrayList();
            }
            this.f37454j.clear();
            this.f37454j.addAll(q0(intent));
            this.f37453i.d(this.f37454j);
            this.f37453i.notifyDataSetChanged();
            this.f37453i.e(false);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        back_image();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.dialog.v0 v0Var = this.f37460p;
        if (v0Var != null) {
            if (v0Var.isShowing()) {
                this.f37460p.dismiss();
            }
            this.f37460p = null;
        }
        com.join.mgps.dialog.w0 w0Var = this.f37458n;
        if (w0Var != null && w0Var.isShowing()) {
            this.f37458n.dismiss();
        }
        this.f37458n = null;
        com.join.mgps.Util.k0.I1(this).j1(this.f37462r);
        if (this.f37454j != null) {
            for (int i4 = 0; i4 < this.f37454j.size(); i4++) {
                try {
                    net.bither.util.b.q().j(getApplicationContext(), this.f37454j.get(i4), false);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            this.f37454j.clear();
            this.f37454j = null;
        }
        net.bither.util.b.q().z(this.f37463s);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        net.bither.util.b.q().e(this.f37463s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0() {
        try {
            if (IntentUtil.getInstance().goLoginInteractive(this)) {
                C0(-1);
                return;
            }
            this.f37457m.setDevice_id("");
            LinkedMultiValueMap<String, Object> params = this.f37457m.getParams();
            com.join.mgps.Util.w0.e("release-->images send to server - start request..");
            ForumResponse<ForumData.ForumPostsSubmitData> y02 = this.f37455k.y0(params);
            com.join.mgps.Util.w0.e("release-->images send to server - response received.");
            if (y02 != null) {
                if (y02.getError() == 706) {
                    showToast("发帖失败");
                    C0(-1);
                    IntentUtil.getInstance().goLoginInteractive(this);
                    return;
                } else if (y02.getError() == 403) {
                    showToast(y02.getError_message());
                    C0(-1);
                    return;
                } else if (y02.getError() == 404) {
                    showToast(y02.getError_message());
                    C0(-1);
                    IntentUtil.getInstance().goVip(this);
                    return;
                } else {
                    ForumData.ForumPostsSubmitData data = y02.getData();
                    if (data != null && data.isResult()) {
                        com.join.mgps.Util.w0.e("release-->images send to server - success");
                        if (data.getReward_money() > 0) {
                            B0(data.getReward_money(), data.getReward_exp());
                        } else {
                            showToast("发帖成功");
                        }
                        n0();
                        com.join.mgps.Util.k0.I1(this).e1(data);
                        return;
                    }
                    com.join.mgps.Util.w0.e("release-->images send to server - failed");
                    showToast("发帖失败");
                    C0(1);
                    com.join.mgps.Util.j0.l(this, y02.getError());
                    return;
                }
            }
            showToast("发帖失败");
            C0(1);
        } catch (Exception e5) {
            com.join.mgps.Util.w0.e("release-->images send to server - try/catch exception");
            C0(1);
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showToast(String str) {
        com.join.mgps.Util.l2.a(this).b(str);
    }

    void t0() {
        ForumRequestBean.ForumPostsSubmitRequestBean forumPostsSubmitRequestBean = this.f37457m;
        if (forumPostsSubmitRequestBean != null && forumPostsSubmitRequestBean.getHelp() == 1) {
            this.f37452h.setVisibility(8);
            this.f37465u.setVisibility(0);
            if (com.join.mgps.Util.j0.Y0(this)) {
                long O1 = AccountUtil_.getInstance_(this).getAccountData().O1();
                String string = getString(R.string.share_posts_myremain_help_money, new Object[]{Long.valueOf(O1)});
                TextView textView = this.f37467w;
                z0(textView, string, O1 + "", "#f47500");
            }
            SimpleAdapter r02 = r0(R.drawable.shape_forum_help_money_default, this.f37464t);
            this.f37468x = r02;
            this.f37466v.setAdapter((ListAdapter) r02);
            this.f37466v.setOnItemClickListener(new g());
            this.f37469y = 1;
            l0(this.f37468x, 1, true);
            return;
        }
        this.f37452h.setVisibility(0);
        this.f37465u.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void x0() {
        com.join.mgps.Util.w0.e("release-->release button pressed.");
        if (v0()) {
            Toast.makeText(this, "帖子内容不能为空", 0).show();
            return;
        }
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                if (w0()) {
                    C0(0);
                    this.f37461q = 1;
                    net.bither.util.b.q().y();
                }
            } else {
                this.f37461q = 0;
                com.join.mgps.Util.w0.e("release-->network connect failed.");
                showToast(getString(R.string.net_connect_failed));
            }
        } catch (Exception e5) {
            this.f37461q = 0;
            com.join.mgps.Util.w0.e("release-->try/catch exception.");
            e5.printStackTrace();
            C0(1);
        }
        com.join.mgps.Util.w0.e("release-->release method finished.");
    }

    void y0(int i4) {
        this.f37457m.setHelp_money(Integer.parseInt(this.f37464t[i4]));
    }
}
