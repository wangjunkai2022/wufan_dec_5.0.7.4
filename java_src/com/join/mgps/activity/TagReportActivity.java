package com.join.mgps.activity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.BaseFragmentActivity;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.customview.FlowLayout;
import com.join.mgps.dto.GameTagsBean;
import com.join.mgps.dto.ListUserCustomGameTagBean;
import com.join.mgps.dto.RequestFeedbackUserCustomTag;
import com.join.mgps.dto.RequestListUserCustomGameTagArgs;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.dto.TagReportReasonBean;
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
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_tag_report)
/* loaded from: classes4.dex */
public class TagReportActivity extends BaseFragmentActivity {

    /* renamed from: b  reason: collision with root package name */
    com.join.mgps.rpc.impl.i f38049b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    String f38050c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f38051d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    LinearLayout f38052e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    FlowLayout f38053f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    ListView f38054g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    EditText f38055h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    Button f38056i;
    @Extra

    /* renamed from: j  reason: collision with root package name */
    ListUserCustomGameTagBean f38057j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f38058k;

    /* renamed from: n  reason: collision with root package name */
    SimpleBaseAdapter<TagReportReasonBean> f38061n;

    /* renamed from: l  reason: collision with root package name */
    List<TagReportReasonBean> f38059l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    List<GameTagsBean> f38060m = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    com.join.mgps.dialog.d1 f38062o = null;

    /* loaded from: classes4.dex */
    class a extends SimpleBaseAdapter<TagReportReasonBean> {
        a() {
        }

        @Override // com.papa91.arc.adapter.SimpleBaseAdapter
        public void convert(int i4, View view, ViewGroup viewGroup, boolean z4) {
            TagReportReasonBean item = getItem(i4);
            ImageView imageView = (ImageView) view.findViewById(R.id.iv_check);
            ((TextView) view.findViewById(R.id.tv_reason_text)).setText(item.getText());
            imageView.setImageResource(item.isChecked() ? R.drawable.ic_chk_simulator_h : R.drawable.ic_chk_simulator_n);
        }

        @Override // com.papa91.arc.adapter.SimpleBaseAdapter
        public int getLayoutId() {
            return R.layout.item_tag_report_reason;
        }
    }

    /* loaded from: classes4.dex */
    class b implements IOnItemClickListener {
        b() {
        }

        @Override // com.papa91.arc.interfaces.IOnItemClickListener
        public void onItemClick(int i4) {
            for (TagReportReasonBean tagReportReasonBean : TagReportActivity.this.f38059l) {
                tagReportReasonBean.setChecked(false);
            }
            TagReportActivity.this.f38059l.get(i4).setChecked(true);
            TagReportActivity.this.f38061n.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GameTagsBean f38065b;

        c(GameTagsBean gameTagsBean) {
            this.f38065b = gameTagsBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagReportActivity.this.f38053f.removeAllViews();
            for (GameTagsBean gameTagsBean : TagReportActivity.this.f38060m) {
                gameTagsBean.setChecked(false);
                this.f38065b.setChecked(true);
                TagReportActivity tagReportActivity = TagReportActivity.this;
                tagReportActivity.g0(gameTagsBean, tagReportActivity.f38053f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(GameTagsBean gameTagsBean, FlowLayout flowLayout) {
        View inflate = View.inflate(this, R.layout.item_tag_report_view, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_title);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.ll_tag);
        textView.setText(gameTagsBean.getName());
        linearLayout.setBackgroundResource(gameTagsBean.isChecked() ? R.drawable.shape_ffa047_stroke_r_6 : R.drawable.shape_f7f7f7_r_6);
        textView.setTextColor(Color.parseColor(gameTagsBean.isChecked() ? "#FFA047" : "#555555"));
        inflate.setOnClickListener(new c(gameTagsBean));
        flowLayout.addView(inflate, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f38062o = com.join.mgps.Util.b0.f0(this).x(this);
        this.f38058k.setText("举报标签");
        this.f38058k.setTypeface(Typeface.defaultFromStyle(1));
        this.f38049b = com.join.mgps.rpc.impl.i.D0();
        this.f38059l.add(new TagReportReasonBean(1, "标签不适合此游戏"));
        this.f38059l.add(new TagReportReasonBean(2, "其他"));
        this.f38053f.setHorizontalDivider((int) getResources().getDimension(R.dimen.wdp20));
        this.f38053f.setVerticalDivider((int) getResources().getDimension(R.dimen.wdp28));
        if (this.f38057j == null) {
            showLoding();
            i0();
        } else {
            j0();
            if (this.f38057j.getGameTags() != null) {
                Iterator<GameTagsBean> it2 = this.f38057j.getGameTags().iterator();
                while (it2.hasNext()) {
                    GameTagsBean next = it2.next();
                    if (next.getTagType().intValue() == 2 || next.getTagType().intValue() == 3) {
                        this.f38060m.add(next);
                    }
                }
                Iterator<GameTagsBean> it3 = this.f38057j.getPersonalTags().iterator();
                while (it3.hasNext()) {
                    GameTagsBean next2 = it3.next();
                    if (next2.getTagType().intValue() == 2 || next2.getTagType().intValue() == 3) {
                        this.f38060m.add(next2);
                    }
                }
            }
            for (GameTagsBean gameTagsBean : this.f38060m) {
                g0(gameTagsBean, this.f38053f);
            }
        }
        if (this.f38061n == null) {
            a aVar = new a();
            this.f38061n = aVar;
            this.f38054g.setAdapter((ListAdapter) aVar);
            this.f38061n.setItemClickListener(new b());
        }
        this.f38061n.setDatas(this.f38059l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void h0() {
        this.f38062o.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0046 -> B:19:0x0051). Please submit an issue!!! */
    @Background
    public void i0() {
        if (com.join.android.app.common.utils.j.j(this)) {
            try {
                RequestModel requestModel = new RequestModel(this);
                RequestListUserCustomGameTagArgs requestListUserCustomGameTagArgs = new RequestListUserCustomGameTagArgs();
                requestListUserCustomGameTagArgs.setUid(AccountUtil_.getInstance_(this).getUid());
                requestListUserCustomGameTagArgs.setGameId(this.f38050c);
                requestModel.setArgs(requestListUserCustomGameTagArgs);
                ResponseModel<ListUserCustomGameTagBean> b02 = this.f38049b.b0(requestModel.makeSign());
                if (b02 != null && b02.getData() != null) {
                    m0(b02.getData());
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        try {
            this.f38051d.setVisibility(8);
            this.f38052e.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void k0(String str, int i4) {
        try {
            if (com.join.android.app.common.utils.j.j(this)) {
                try {
                    l0();
                    RequestModel requestModel = new RequestModel(this);
                    RequestFeedbackUserCustomTag requestFeedbackUserCustomTag = new RequestFeedbackUserCustomTag();
                    requestFeedbackUserCustomTag.setFeedbackUid(AccountUtil_.getInstance_(this).getUid());
                    requestFeedbackUserCustomTag.setGameId(this.f38050c);
                    requestFeedbackUserCustomTag.setTagName(str);
                    requestFeedbackUserCustomTag.setFeedbackType(Integer.valueOf(i4));
                    requestFeedbackUserCustomTag.setReason(this.f38055h.getText().toString());
                    requestFeedbackUserCustomTag.setReason(this.f38055h.getText().toString());
                    requestModel.setArgs(requestFeedbackUserCustomTag);
                    ResponseModel a5 = this.f38049b.a(requestModel.makeSign());
                    if (a5 != null && a5.getCode() == 200) {
                        com.join.mgps.Util.l2.a(this).b("举报标签成功");
                        h0();
                        finish();
                    } else if (a5 != null && com.join.mgps.Util.g2.i(a5.getMessage())) {
                        com.join.mgps.Util.l2.a(this).b(a5.getMessage());
                    } else {
                        com.join.mgps.Util.l2.a(this).b("数据异常，请重试");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                return;
            }
            com.join.mgps.Util.l2.a(this).b("网络连接失败，请重试");
        } finally {
            h0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0() {
        this.f38062o.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0(ListUserCustomGameTagBean listUserCustomGameTagBean) {
        if (listUserCustomGameTagBean == null) {
            return;
        }
        try {
            j0();
            this.f38060m.clear();
            Iterator<GameTagsBean> it2 = this.f38057j.getGameTags().iterator();
            while (it2.hasNext()) {
                GameTagsBean next = it2.next();
                if (next.getTagType().intValue() == 2 || next.getTagType().intValue() == 3) {
                    this.f38060m.add(next);
                }
            }
            Iterator<GameTagsBean> it3 = this.f38057j.getPersonalTags().iterator();
            while (it3.hasNext()) {
                GameTagsBean next2 = it3.next();
                if (next2.getTagType().intValue() == 2 || next2.getTagType().intValue() == 3) {
                    this.f38060m.add(next2);
                }
            }
            for (GameTagsBean gameTagsBean : this.f38060m) {
                g0(gameTagsBean, this.f38053f);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click({R.id.btn_commit})
    public void onCommit() {
        TagReportReasonBean tagReportReasonBean;
        GameTagsBean gameTagsBean;
        Iterator<GameTagsBean> it2 = this.f38060m.iterator();
        while (true) {
            tagReportReasonBean = null;
            if (!it2.hasNext()) {
                gameTagsBean = null;
                break;
            }
            gameTagsBean = it2.next();
            if (gameTagsBean.isChecked()) {
                break;
            }
        }
        if (gameTagsBean == null) {
            com.join.mgps.Util.l2.a(this).b("请选择想要投诉的标签");
            return;
        }
        Iterator<TagReportReasonBean> it3 = this.f38059l.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            TagReportReasonBean next = it3.next();
            if (next.isChecked()) {
                tagReportReasonBean = next;
                break;
            }
        }
        if (tagReportReasonBean == null) {
            com.join.mgps.Util.l2.a(this).b("请选择举报原因");
        } else if (tagReportReasonBean.getType() == 2 && com.join.mgps.Util.g2.h(this.f38055h.getText().toString())) {
            com.join.mgps.Util.l2.a(this).b("请输入举报说明");
        } else {
            k0(gameTagsBean.getName(), tagReportReasonBean.getType());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        showLoding();
        i0();
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
            this.f38051d.setVisibility(0);
            this.f38052e.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        try {
            this.f38052e.setVisibility(0);
            this.f38051d.setVisibility(8);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
