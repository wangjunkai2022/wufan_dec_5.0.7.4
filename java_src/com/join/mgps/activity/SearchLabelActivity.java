package com.join.mgps.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.label.MainLabelActivity_;
import com.join.mgps.dto.LabelBean;
import com.join.mgps.dto.ResultResMainBean;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_search_label)
/* loaded from: classes4.dex */
public class SearchLabelActivity extends Activity {

    /* renamed from: o  reason: collision with root package name */
    public static final int f37277o = 1;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ListView f37279c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ImageView f37280d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    EditText f37281e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f37282f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f37283g;

    /* renamed from: i  reason: collision with root package name */
    f f37285i;

    /* renamed from: j  reason: collision with root package name */
    com.join.mgps.rpc.i f37286j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f37287k;
    @Bean

    /* renamed from: m  reason: collision with root package name */
    com.join.mgps.Util.b f37289m;

    /* renamed from: n  reason: collision with root package name */
    int f37290n;
    @Extra

    /* renamed from: b  reason: collision with root package name */
    int f37278b = 0;

    /* renamed from: h  reason: collision with root package name */
    List<LabelBean> f37284h = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    private InputFilter f37288l = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements InputFilter {
        a() {
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
            if (charSequence.equals(" ")) {
                return "";
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            return i4 == 66;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements TextWatcher {
        c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String trim = editable.toString().trim();
            if (TextUtils.isEmpty(trim)) {
                SearchLabelActivity.this.c("");
                SearchLabelActivity.this.f37280d.setVisibility(8);
                return;
            }
            SearchLabelActivity.this.c(trim);
            SearchLabelActivity.this.f37280d.setVisibility(0);
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
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchLabelActivity.this.f37281e.setText("");
            SearchLabelActivity.this.f37284h.clear();
            f fVar = SearchLabelActivity.this.f37285i;
            if (fVar != null) {
                fVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements AdapterView.OnItemClickListener {
        e() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            LabelBean labelBean = SearchLabelActivity.this.f37284h.get(i4);
            SearchLabelActivity searchLabelActivity = SearchLabelActivity.this;
            if (searchLabelActivity.f37278b == 1) {
                MainLabelActivity_.O0(searchLabelActivity).d(labelBean.getTag_id()).start();
            } else {
                Intent intent = new Intent();
                intent.putExtra("label", labelBean);
                SearchLabelActivity.this.setResult(-1, intent);
            }
            SearchLabelActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class f extends BaseAdapter {

        /* loaded from: classes4.dex */
        class a {

            /* renamed from: a  reason: collision with root package name */
            SimpleDraweeView f37297a;

            /* renamed from: b  reason: collision with root package name */
            TextView f37298b;

            /* renamed from: c  reason: collision with root package name */
            TextView f37299c;

            a() {
            }
        }

        private f() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return SearchLabelActivity.this.f37284h.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            return SearchLabelActivity.this.f37284h.get(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            a aVar;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_label, (ViewGroup) null);
                aVar = new a();
                aVar.f37297a = (SimpleDraweeView) view.findViewById(R.id.iv_icon);
                aVar.f37298b = (TextView) view.findViewById(R.id.tv_label_name);
                aVar.f37299c = (TextView) view.findViewById(R.id.tv_count);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            LabelBean labelBean = SearchLabelActivity.this.f37284h.get(i4);
            MyImageLoader.h(aVar.f37297a, labelBean.getTag_icon());
            aVar.f37298b.setText(labelBean.getTag_name());
            TextView textView = aVar.f37299c;
            textView.setText(labelBean.getPosts() + "条帖子");
            return view;
        }

        /* synthetic */ f(SearchLabelActivity searchLabelActivity, a aVar) {
            this();
        }
    }

    private void d() {
        if (com.join.android.app.common.utils.j.j(this)) {
            j();
            c("");
            return;
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void a() {
        this.f37286j = com.join.mgps.rpc.impl.g.A0();
        this.f37290n = getIntent().getIntExtra("postingLabelType", 1);
        this.f37281e.setFilters(new InputFilter[]{this.f37288l});
        this.f37281e.setOnKeyListener(new b());
        this.f37281e.addTextChangedListener(new c());
        this.f37280d.setOnClickListener(new d());
        f fVar = new f(this, null);
        this.f37285i = fVar;
        this.f37279c.setAdapter((ListAdapter) fVar);
        this.f37279c.setOnItemClickListener(new e());
        if (this.f37278b != 1) {
            d();
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void b() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void c(String str) {
        ResultResMainBean<List<LabelBean>> D;
        try {
            if (this.f37278b == 1) {
                D = this.f37286j.d(str);
            } else {
                D = this.f37286j.D(this.f37289m.getUid(), str, this.f37290n);
            }
            if (f()) {
                return;
            }
            if (D.getError() == 0) {
                l(D.getData());
            } else if (this.f37284h.size() <= 0) {
                k("网络异常，请重试");
            } else {
                l(new ArrayList());
            }
        } catch (Exception unused) {
            if (this.f37284h.size() <= 0) {
                i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void e() {
        this.f37279c.setVisibility(0);
        this.f37283g.setVisibility(8);
        this.f37282f.setVisibility(8);
    }

    boolean f() {
        if (isFinishing()) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 17 && isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void g() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void h() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i() {
        this.f37279c.setVisibility(8);
        this.f37283g.setVisibility(8);
        this.f37282f.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j() {
        this.f37283g.setVisibility(0);
        this.f37282f.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k(String str) {
        if (f()) {
            return;
        }
        com.join.mgps.Util.l2.a(this).b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l(List<LabelBean> list) {
        if (TextUtils.isEmpty(this.f37281e.getText().toString().trim())) {
            if (this.f37278b == 1) {
                this.f37287k.setVisibility(8);
            } else {
                this.f37287k.setText("推荐话题");
                this.f37287k.setPadding(com.join.mgps.Util.c0.a(this, 15.0f), 0, 0, 0);
                this.f37287k.setGravity(19);
                this.f37287k.setVisibility(0);
            }
            this.f37279c.setVisibility(0);
        } else if (list != null && list.size() > 0) {
            this.f37287k.setVisibility(8);
            this.f37279c.setVisibility(0);
        } else {
            this.f37287k.setText("无匹配结果");
            this.f37287k.setPadding(0, 0, 0, 0);
            this.f37287k.setGravity(17);
            this.f37287k.setVisibility(0);
            this.f37279c.setVisibility(8);
        }
        this.f37283g.setVisibility(8);
        this.f37282f.setVisibility(8);
        this.f37284h.clear();
        if (list != null && list.size() >= 0) {
            this.f37284h.addAll(list);
        }
        this.f37285i.notifyDataSetChanged();
    }
}
