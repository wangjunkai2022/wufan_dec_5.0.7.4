package com.join.mgps.activity.message;

import android.graphics.Color;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.BaseFragmentActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.common.utils.j;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.Util.l2;
import com.join.mgps.Util.v0;
import com.join.mgps.Util.y;
import com.join.mgps.base.BaseQuickAdapter;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.dto.MessageDetailFeedBackArgs;
import com.join.mgps.dto.MessageDetailFeedBackBean;
import com.join.mgps.dto.RequestModel;
import com.join.mgps.dto.ResponseModel;
import com.join.mgps.rpc.impl.i;
import com.join.mgps.rpc.k;
import java.util.ArrayList;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.TextChange;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_message_detail_feedback)
/* loaded from: classes4.dex */
public class FeedBackMessageDetailActivity extends BaseFragmentActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f39222b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    TextView f39223c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f39224d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f39225e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    TextView f39226f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    RecyclerView f39227g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    EditText f39228h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    TextView f39229i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f39230j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f39231k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    LinearLayout f39232l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    String f39233m;

    /* renamed from: n  reason: collision with root package name */
    private k f39234n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f39235o;

    /* renamed from: p  reason: collision with root package name */
    private a f39236p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends BaseQuickAdapter<MessageDetailFeedBackBean.FeedbackReplies, BaseViewHolder> {
        public a(@Nullable List<MessageDetailFeedBackBean.FeedbackReplies> list) {
            super(R.layout.item_message_feedback_reply, list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.join.mgps.base.BaseQuickAdapter
        /* renamed from: a */
        public void convert(@NonNull BaseViewHolder baseViewHolder, MessageDetailFeedBackBean.FeedbackReplies feedbackReplies) {
            baseViewHolder.setText(R.id.tvUserName, feedbackReplies.getUsername()).setText(R.id.tvTime, y.x(feedbackReplies.getCreateTime() / 1000)).setText(R.id.tvDesc, feedbackReplies.getReplyContent());
            MyImageLoader.h((SimpleDraweeView) baseViewHolder.getView(R.id.avatar), feedbackReplies.getAvatar());
        }
    }

    private String h0(int i4) {
        switch (i4) {
            case 1:
                return "无法下载";
            case 2:
                return "无法安装";
            case 3:
                return "版本太旧";
            case 4:
                return "携带病毒";
            case 5:
                return "色情内容";
            case 6:
                return "恶意扣费";
            case 7:
                return "侵权抄袭";
            case 8:
                return "暴力涉政";
            case 9:
                return "其他问题";
            default:
                return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f39234n = i.D0();
        this.f39222b.setVisibility(0);
        this.f39222b.setText("投诉详情");
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void f0(MessageDetailFeedBackBean.FeedbackReplies feedbackReplies) {
        if (this.f39236p != null) {
            this.f39228h.setText((CharSequence) null);
            this.f39236p.addData((a) feedbackReplies);
            o2.a.b(this.f39228h);
            this.f39227g.scrollToPosition(this.f39236p.getItemCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TextChange
    public void g0() {
        if (this.f39228h.getText().toString().trim().length() > 0) {
            this.f39235o = true;
            this.f39229i.setTextColor(Color.parseColor("#F47500"));
            return;
        }
        this.f39235o = false;
        this.f39229i.setTextColor(Color.parseColor("#C8C9CB"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void getData() {
        showLoding();
        if (j.j(this)) {
            try {
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this);
                MessageDetailFeedBackArgs messageDetailFeedBackArgs = new MessageDetailFeedBackArgs();
                messageDetailFeedBackArgs.setIssueId(this.f39233m);
                requestModel.setArgs(messageDetailFeedBackArgs);
                requestModel.setDefault(this);
                ResponseModel<MessageDetailFeedBackBean> Y = this.f39234n.Y(requestModel.makeSign());
                if (Y != null && Y.getCode() == 200 && Y.getData() != null) {
                    j0();
                    l0(Y.getData());
                } else {
                    showLodingFailed();
                }
                return;
            } catch (Exception e5) {
                showLodingFailed();
                e5.printStackTrace();
                return;
            }
        }
        showLodingFailed();
        showMessage(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void i0(String str) {
        if (j.j(this)) {
            try {
                RequestModel requestModel = new RequestModel();
                requestModel.setDefault(this);
                MessageDetailFeedBackArgs messageDetailFeedBackArgs = new MessageDetailFeedBackArgs();
                messageDetailFeedBackArgs.setIssueId(this.f39233m);
                messageDetailFeedBackArgs.setContent(str);
                messageDetailFeedBackArgs.setUid(AccountUtil_.getInstance_(this).getUid());
                requestModel.setArgs(messageDetailFeedBackArgs);
                requestModel.setDefault(this);
                ResponseModel<Boolean> a02 = this.f39234n.a0(requestModel.makeSign());
                if (a02 != null && a02.getCode() == 200) {
                    MessageDetailFeedBackBean.FeedbackReplies feedbackReplies = new MessageDetailFeedBackBean.FeedbackReplies();
                    feedbackReplies.setReplyUid(AccountUtil_.getInstance_(this).getUid());
                    feedbackReplies.setAvatar(AccountUtil_.getInstance_(this).getAccountData().d0());
                    feedbackReplies.setUsername(AccountUtil_.getInstance_(this).getAccountData().getNickname());
                    feedbackReplies.setCreateTime(System.currentTimeMillis());
                    feedbackReplies.setReplyContent(str);
                    f0(feedbackReplies);
                } else {
                    showMessage("添加评论失败");
                }
                return;
            } catch (Exception e5) {
                showMessage("添加评论失败");
                e5.printStackTrace();
                return;
            }
        }
        showMessage(getString(R.string.net_connect_failed));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void j0() {
        v0.c("显示主界面main");
        LinearLayout linearLayout = this.f39231k;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.f39230j;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f39232l;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        if (this.f39235o) {
            i0(this.f39228h.getText().toString().trim());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(MessageDetailFeedBackBean messageDetailFeedBackBean) {
        if (messageDetailFeedBackBean.getFeedbackIssue() != null) {
            MessageDetailFeedBackBean.FeedbackIssue feedbackIssue = messageDetailFeedBackBean.getFeedbackIssue();
            this.f39223c.setText(feedbackIssue.getGameName());
            this.f39224d.setText(h0(feedbackIssue.getIssueType()));
            this.f39225e.setText(feedbackIssue.getContent());
            this.f39226f.setText(y.n(feedbackIssue.getCreateTime()));
        }
        this.f39227g.setLayoutManager(new LinearLayoutManager(this));
        a aVar = new a(messageDetailFeedBackBean.getFeedbackReplies() != null ? messageDetailFeedBackBean.getFeedbackReplies() : new ArrayList<>());
        this.f39236p = aVar;
        this.f39227g.setAdapter(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void relodingimag() {
        getData();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        UtilsMy.w3(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLoding() {
        v0.c("显示加载中");
        LinearLayout linearLayout = this.f39230j;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f39231k;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f39232l;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showLodingFailed() {
        LinearLayout linearLayout = this.f39231k;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f39230j;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        LinearLayout linearLayout3 = this.f39232l;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        l2.a(this).b(str);
    }
}
