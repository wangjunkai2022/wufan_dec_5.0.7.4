package com.join.mgps.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.core.widget.NestedScrollView;
import com.BaseFragmentActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.TagGameListActivity_;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.dto.GameTagsBean;
import com.join.mgps.dto.ListUserCustomGameTagBean;
import com.join.mgps.dto.RequestAddUserCustomGameTag;
import com.join.mgps.dto.RequestDeleteUserCustomGameTag;
import com.join.mgps.dto.RequestDeleteUserCustomTag;
import com.join.mgps.dto.RequestListUserCustomGameTagArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.RequestSearchUserCustomGameTag;
import com.join.mgps.dto.ResponseModel;
import com.papa91.arc.adapter.SimpleBaseAdapter;
import com.papa91.arc.interfaces.IOnItemClickListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.res.StringRes;
@EActivity(R.layout.activity_tag_add)
/* loaded from: classes4.dex */
public class TagAddActivity extends BaseFragmentActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    ImageView f37930b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    LinearLayout f37931c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f37932d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f37933e;
    @Extra

    /* renamed from: f  reason: collision with root package name */
    String f37934f;
    @Extra

    /* renamed from: g  reason: collision with root package name */
    String f37935g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    FlowLayout f37936h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    FlowLayout f37937i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f37938j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    NestedScrollView f37939k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    EditText f37940l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    ListView f37941m;
    @StringRes(resName = "net_excption")

    /* renamed from: n  reason: collision with root package name */
    String f37942n;
    @StringRes(resName = "connect_server_excption")

    /* renamed from: o  reason: collision with root package name */
    String f37943o;

    /* renamed from: p  reason: collision with root package name */
    com.join.mgps.rpc.impl.i f37944p;

    /* renamed from: r  reason: collision with root package name */
    SimpleBaseAdapter<String> f37946r;

    /* renamed from: t  reason: collision with root package name */
    ListUserCustomGameTagBean f37948t;

    /* renamed from: q  reason: collision with root package name */
    String f37945q = "";

    /* renamed from: s  reason: collision with root package name */
    Handler f37947s = new Handler();

    /* renamed from: u  reason: collision with root package name */
    boolean f37949u = false;

    /* renamed from: v  reason: collision with root package name */
    com.join.mgps.dialog.d1 f37950v = null;

    /* renamed from: w  reason: collision with root package name */
    TextWatcher f37951w = new d();

    /* renamed from: x  reason: collision with root package name */
    Runnable f37952x = new e();

    /* renamed from: y  reason: collision with root package name */
    AlertDialog.Builder f37953y = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class b extends SimpleBaseAdapter<String> {
        b() {
        }

        @Override // com.papa91.arc.adapter.SimpleBaseAdapter
        public void convert(int i4, View view, ViewGroup viewGroup, boolean z4) {
            ((TextView) view.findViewById(R.id.tv_tag_text)).setText(getItem(i4));
        }

        @Override // com.papa91.arc.adapter.SimpleBaseAdapter
        public int getLayoutId() {
            return R.layout.item_user_tag_auto_search;
        }
    }

    /* loaded from: classes4.dex */
    class c implements IOnItemClickListener {
        c() {
        }

        @Override // com.papa91.arc.interfaces.IOnItemClickListener
        public void onItemClick(int i4) {
            TagAddActivity tagAddActivity = TagAddActivity.this;
            tagAddActivity.f37940l.removeTextChangedListener(tagAddActivity.f37951w);
            String item = TagAddActivity.this.f37946r.getItem(i4);
            TagAddActivity.this.f37940l.setText(item);
            TagAddActivity.this.f37940l.setSelection(item.length());
            TagAddActivity.this.f37946r.clear();
            TagAddActivity tagAddActivity2 = TagAddActivity.this;
            tagAddActivity2.f37940l.addTextChangedListener(tagAddActivity2.f37951w);
            TagAddActivity.this.s0();
        }
    }

    /* loaded from: classes4.dex */
    class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            com.join.mgps.Util.w0.e("afterTextChanged", "keyword=" + TagAddActivity.this.f37940l.getText().toString());
            if (editable.length() <= 0) {
                SimpleBaseAdapter<String> simpleBaseAdapter = TagAddActivity.this.f37946r;
                if (simpleBaseAdapter != null) {
                    simpleBaseAdapter.clear();
                    return;
                }
                return;
            }
            TagAddActivity tagAddActivity = TagAddActivity.this;
            tagAddActivity.f37947s.removeCallbacks(tagAddActivity.f37952x);
            TagAddActivity tagAddActivity2 = TagAddActivity.this;
            tagAddActivity2.f37947s.postDelayed(tagAddActivity2.f37952x, 500L);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            com.join.mgps.Util.w0.e("beforeTextChanged", "keyword=" + TagAddActivity.this.f37940l.getText().toString());
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            com.join.mgps.Util.w0.e("onTextChanged", "keyword=" + TagAddActivity.this.f37940l.getText().toString());
        }
    }

    /* loaded from: classes4.dex */
    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TagAddActivity.this.isFinishing()) {
                return;
            }
            String obj = TagAddActivity.this.f37940l.getText().toString();
            if (obj.length() > 0) {
                TagAddActivity.this.n0(obj);
                return;
            }
            SimpleBaseAdapter<String> simpleBaseAdapter = TagAddActivity.this.f37946r;
            if (simpleBaseAdapter != null) {
                simpleBaseAdapter.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameTagsBean f37959b;

        f(GameTagsBean gameTagsBean) {
            this.f37959b = gameTagsBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagAddActivity.this.h0(this.f37959b.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameTagsBean f37961b;

        g(GameTagsBean gameTagsBean) {
            this.f37961b = gameTagsBean;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            TagAddActivity.this.t0(this.f37961b);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class h implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameTagsBean f37963b;

        h(GameTagsBean gameTagsBean) {
            this.f37963b = gameTagsBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagAddActivity.this.k0(this.f37963b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class i implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f37965b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ GameTagsBean f37966c;

        i(boolean z4, GameTagsBean gameTagsBean) {
            this.f37965b = z4;
            this.f37966c = gameTagsBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f37965b) {
                return;
            }
            if (this.f37966c.getTagType().intValue() == 2 || this.f37966c.getTagType().intValue() == 3) {
                TagGameListActivity_.r e5 = TagGameListActivity_.F0(TagAddActivity.this).b(2).d(this.f37966c.getName()).e(Integer.parseInt(this.f37966c.getId()));
                e5.f(this.f37966c.getTagType() + "").start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class j implements DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameTagsBean f37968b;

        j(GameTagsBean gameTagsBean) {
            this.f37968b = gameTagsBean;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            dialogInterface.dismiss();
            TagAddActivity.this.l0(this.f37968b);
        }
    }

    private void j0(GameTagsBean gameTagsBean, FlowLayout flowLayout, boolean z4) {
        View inflate = View.inflate(this, R.layout.item_tag_view, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_title);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_icon);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_root);
        imageView.setVisibility(0);
        if (z4) {
            if (gameTagsBean.isShowDelete()) {
                linearLayout.setBackgroundResource(R.drawable.shape_eef0f3_r_6);
                textView.setTextColor(Color.parseColor("#A4B5C7"));
                imageView.setVisibility(8);
            } else if (gameTagsBean.getVoteFlag().intValue() == 0) {
                linearLayout.setBackgroundResource(R.drawable.shape_f7f7f7_r_6);
                textView.setTextColor(Color.parseColor("#555555"));
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.ic_add_blue);
                imageView.setOnClickListener(new f(gameTagsBean));
            } else {
                linearLayout.setBackgroundResource(R.drawable.shape_eef0f3_r_6);
                textView.setTextColor(Color.parseColor("#A4B5C7"));
                imageView.setVisibility(8);
            }
            inflate.setOnLongClickListener(new g(gameTagsBean));
        } else if (gameTagsBean.getTagType().intValue() != 2 && gameTagsBean.getTagType().intValue() != 3) {
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.ic_delete_red);
            imageView.setOnClickListener(new h(gameTagsBean));
        } else {
            imageView.setImageResource(R.drawable.ic_arrow_right_black);
        }
        textView.setText(gameTagsBean.getName());
        inflate.setOnClickListener(new i(z4, gameTagsBean));
        flowLayout.addView(inflate, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        ListAdapter adapter = this.f37941m.getAdapter();
        if (adapter == null) {
            return;
        }
        int count = adapter.getCount();
        int i4 = 0;
        for (int i5 = 0; i5 < count; i5++) {
            View view = adapter.getView(i5, null, this.f37941m);
            view.measure(0, 0);
            i4 += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = this.f37941m.getLayoutParams();
        layoutParams.height = i4 + (this.f37941m.getDividerHeight() * (adapter.getCount() - 1));
        this.f37941m.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(GameTagsBean gameTagsBean) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.AlertDialogCustom);
        this.f37953y = builder;
        builder.setMessage("是否要删除\"" + gameTagsBean.getName() + "\"标签");
        this.f37953y.setPositiveButton("仍要删除", new j(gameTagsBean));
        this.f37953y.setNegativeButton("取消", new a());
        this.f37953y.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Receiver(actions = {o1.a.B})
    public void accountChange(Intent intent) {
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f37950v = com.join.mgps.Util.b0.f0(this).x(this);
        this.f37933e.setText(this.f37934f);
        this.f37933e.setTypeface(Typeface.defaultFromStyle(1));
        this.f37944p = com.join.mgps.rpc.impl.i.D0();
        this.f37936h.setHorizontalDivider((int) getResources().getDimension(R.dimen.wdp20));
        this.f37936h.setVerticalDivider((int) getResources().getDimension(R.dimen.wdp28));
        this.f37937i.setHorizontalDivider((int) getResources().getDimension(R.dimen.wdp20));
        this.f37937i.setVerticalDivider((int) getResources().getDimension(R.dimen.wdp28));
        this.f37949u = IntentUtil.getInstance().isLogined(this);
        showLoding();
        o0();
        this.f37940l.addTextChangedListener(this.f37951w);
        if (this.f37946r == null) {
            b bVar = new b();
            this.f37946r = bVar;
            this.f37941m.setAdapter((ListAdapter) bVar);
            s0();
            this.f37946r.setItemClickListener(new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        this.f37947s.removeCallbacks(this.f37952x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void h0(String str) {
        p0();
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                    u0();
                    RequestModel requestModel = new RequestModel(this);
                    RequestAddUserCustomGameTag requestAddUserCustomGameTag = new RequestAddUserCustomGameTag();
                    requestAddUserCustomGameTag.setTagName(str);
                    requestAddUserCustomGameTag.setGameId(this.f37935g);
                    requestAddUserCustomGameTag.setUid(AccountUtil_.getInstance_(this).getUid());
                    requestModel.setArgs(requestAddUserCustomGameTag);
                    ResponseModel<ListUserCustomGameTagBean> L = this.f37944p.L(requestModel.makeSign());
                    if (L != null && L.getCode() == 200) {
                        com.join.mgps.Util.l2.a(this).b("标签添加成功");
                        i0();
                        o0();
                    } else if (L != null && com.join.mgps.Util.g2.i(L.getMessage())) {
                        com.join.mgps.Util.l2.a(this).b(L.getMessage());
                    } else {
                        com.join.mgps.Util.l2.a(this).b("添加失败，请重试");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    com.join.mgps.Util.l2.a(this).b("标签添加失败");
                }
                return;
            }
            com.join.mgps.Util.l2.a(this).b("网络连接异常，请检查网络连接");
        } finally {
            m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void i0() {
        this.f37940l.setText("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(GameTagsBean gameTagsBean) {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                    RequestModel requestModel = new RequestModel();
                    requestModel.setDefault(this);
                    RequestDeleteUserCustomGameTag requestDeleteUserCustomGameTag = new RequestDeleteUserCustomGameTag();
                    requestDeleteUserCustomGameTag.setTagId(gameTagsBean.getId());
                    requestDeleteUserCustomGameTag.setGameId(this.f37935g);
                    requestDeleteUserCustomGameTag.setUid(AccountUtil_.getInstance_(this).getUid());
                    requestModel.setArgs(requestDeleteUserCustomGameTag);
                    u0();
                    ResponseModel i02 = this.f37944p.i0(requestModel.makeSign());
                    if (i02 != null && i02.getCode() == 200) {
                        o0();
                        com.join.mgps.Util.l2.a(this).b("自定义游戏标签删除成功");
                    } else if (i02 != null && com.join.mgps.Util.g2.i(i02.getMessage())) {
                        com.join.mgps.Util.l2.a(this).b(i02.getMessage());
                    } else {
                        com.join.mgps.Util.l2.a(this).b("自定义游戏标签删除失败");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    com.join.mgps.Util.l2.a(this).b("自定义游戏标签删除失败");
                }
                return;
            }
            com.join.mgps.Util.l2.a(this).b("网络连接异常，请检查网络连接");
        } finally {
            m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void l0(GameTagsBean gameTagsBean) {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                    RequestModel requestModel = new RequestModel();
                    requestModel.setDefault(this);
                    RequestDeleteUserCustomTag requestDeleteUserCustomTag = new RequestDeleteUserCustomTag();
                    requestDeleteUserCustomTag.setTagId(gameTagsBean.getId());
                    requestDeleteUserCustomTag.setGameId(this.f37935g);
                    requestDeleteUserCustomTag.setUid(AccountUtil_.getInstance_(this).getUid());
                    requestModel.setArgs(requestDeleteUserCustomTag);
                    u0();
                    ResponseModel z4 = this.f37944p.z(requestModel.makeSign());
                    if (z4 != null && z4.getCode() == 200) {
                        o0();
                        com.join.mgps.Util.l2.a(this).b("常用标签删除成功");
                    } else if (z4 != null && com.join.mgps.Util.g2.i(z4.getMessage())) {
                        com.join.mgps.Util.l2.a(this).b(z4.getMessage());
                    } else {
                        com.join.mgps.Util.l2.a(this).b("常用标签删除失败");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                    com.join.mgps.Util.l2.a(this).b("常用标签删除失败");
                }
                return;
            }
            com.join.mgps.Util.l2.a(this).b("网络连接异常，请检查网络连接");
        } finally {
            m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0() {
        this.f37950v.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void n0(String str) {
        if (com.join.android.app.common.utils.j.j(this)) {
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    RequestModel requestModel = new RequestModel(this);
                    RequestSearchUserCustomGameTag requestSearchUserCustomGameTag = new RequestSearchUserCustomGameTag();
                    requestSearchUserCustomGameTag.setSearchWord(str);
                    requestSearchUserCustomGameTag.setGameId(this.f37935g);
                    requestSearchUserCustomGameTag.setUid(AccountUtil_.getInstance_(this).getUid());
                    requestModel.setArgs(requestSearchUserCustomGameTag);
                    x0(this.f37944p.A(requestModel.makeSign()).getData());
                    return;
                } catch (Exception e5) {
                    e5.printStackTrace();
                    com.join.mgps.Util.l2.a(this).b(this.f37943o);
                    x0(arrayList);
                    return;
                }
            } catch (Throwable th) {
                x0(arrayList);
                throw th;
            }
        }
        com.join.mgps.Util.l2.a(this).b(this.f37942n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0049 -> B:19:0x0054). Please submit an issue!!! */
    @Background
    public void o0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RequestModel requestModel = new RequestModel(this);
                RequestListUserCustomGameTagArgs requestListUserCustomGameTagArgs = new RequestListUserCustomGameTagArgs();
                requestListUserCustomGameTagArgs.setUid(AccountUtil_.getInstance_(this).getUid());
                requestListUserCustomGameTagArgs.setGameId(this.f37935g);
                requestModel.setArgs(requestListUserCustomGameTagArgs);
                ResponseModel<ListUserCustomGameTagBean> b02 = this.f37944p.b0(requestModel.makeSign());
                if (b02 != null && b02.getData() != null) {
                    q0();
                    v0(b02.getData());
                } else {
                    showLodingFailed();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                showLodingFailed();
            }
            return;
        }
        showLodingFailed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f37949u || !IntentUtil.getInstance().isLogined(this)) {
            return;
        }
        o0();
    }

    void p0() {
        o2.a.b(this.f37940l);
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        try {
            this.f37931c.setVisibility(8);
            this.f37932d.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.ll_add_tag})
    public void r0() {
        if (com.join.mgps.Util.g2.h(this.f37940l.getText().toString())) {
            com.join.mgps.Util.l2.a(this).b("请输入游戏新标签！");
        } else if (IntentUtil.getInstance().goLogin(this)) {
            com.join.mgps.Util.l2.a(this).b("您还未登录请先登录帐号！");
        } else {
            SimpleBaseAdapter<String> simpleBaseAdapter = this.f37946r;
            if (simpleBaseAdapter != null) {
                simpleBaseAdapter.clear();
            }
            s0();
            h0(this.f37940l.getText().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        o0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        try {
            this.f37931c.setVisibility(0);
            this.f37932d.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            this.f37932d.setVisibility(0);
            this.f37931c.setVisibility(8);
            this.f37939k.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0() {
        this.f37950v.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void v0(ListUserCustomGameTagBean listUserCustomGameTagBean) {
        try {
            this.f37948t = listUserCustomGameTagBean;
            if (listUserCustomGameTagBean == null) {
                return;
            }
            this.f37937i.removeAllViews();
            this.f37936h.removeAllViews();
            this.f37939k.setVisibility(0);
            if (listUserCustomGameTagBean.getGameTags() != null) {
                Iterator<GameTagsBean> it2 = listUserCustomGameTagBean.getGameTags().iterator();
                while (it2.hasNext()) {
                    GameTagsBean next = it2.next();
                    if (!TextUtils.equals(next.getId(), "7") || next.getVoteFlag().intValue() != 0) {
                        j0(next, this.f37936h, false);
                    }
                }
            }
            if (listUserCustomGameTagBean.getPersonalTags() != null) {
                Iterator<GameTagsBean> it3 = listUserCustomGameTagBean.getPersonalTags().iterator();
                while (it3.hasNext()) {
                    j0(it3.next(), this.f37937i, true);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.tv_report})
    public void w0() {
        if (IntentUtil.getInstance().goLogin(this)) {
            com.join.mgps.Util.l2.a(this).b("您还未登录请先登录帐号！");
        } else {
            TagReportActivity_.v0(this).b(this.f37948t).a(this.f37935g).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void x0(List<String> list) {
        this.f37946r.setDatas(list);
        s0();
        this.f37946r.notifyDataSetChanged();
    }
}
