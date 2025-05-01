package com.join.mgps.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.BaseAppCompatActivity;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AESUtils;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.RequestBeanUtil;
import com.join.mgps.Util.a0;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.dto.CommentCreateArgs;
import com.join.mgps.dto.CommentCreateBean;
import com.join.mgps.dto.CommentModifyArgs;
import com.join.mgps.dto.CommentResponse;
import com.join.mgps.dto.CommentTokenBean;
import com.join.mgps.enums.Dtype;
import com.join.mgps.pref.PrefDef_;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.comment_creat_activity)
/* loaded from: classes4.dex */
public class CommentCreatActivity extends BaseAppCompatActivity {

    /* renamed from: b  reason: collision with root package name */
    private Context f29374b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f29375c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    TextView f29376d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    TextView f29377e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    MStarBar f29378f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f29379g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    TextView f29380h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    EditText f29381i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    CheckBox f29382j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    TextView f29383k;
    @Extra

    /* renamed from: l  reason: collision with root package name */
    String f29384l;
    @Extra

    /* renamed from: m  reason: collision with root package name */
    String f29385m;
    @Extra

    /* renamed from: n  reason: collision with root package name */
    float f29386n;
    @Extra

    /* renamed from: o  reason: collision with root package name */
    String f29387o;
    @Extra

    /* renamed from: p  reason: collision with root package name */
    String f29388p;
    @Extra

    /* renamed from: q  reason: collision with root package name */
    int f29389q;
    @Extra

    /* renamed from: r  reason: collision with root package name */
    String f29390r;
    @Extra

    /* renamed from: s  reason: collision with root package name */
    boolean f29391s;
    @Extra

    /* renamed from: t  reason: collision with root package name */
    String f29392t;
    @Extra

    /* renamed from: u  reason: collision with root package name */
    String f29393u;
    @Extra

    /* renamed from: v  reason: collision with root package name */
    int f29394v;

    /* renamed from: w  reason: collision with root package name */
    com.join.mgps.rpc.f f29395w;
    @Pref

    /* renamed from: x  reason: collision with root package name */
    PrefDef_ f29396x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f29397y = false;

    /* renamed from: z  reason: collision with root package name */
    private com.wufan.user.service.protobuf.n0 f29398z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements MStarBar.a {
        a() {
        }

        @Override // com.join.mgps.customview.MStarBar.a
        public void a(float f5) {
            CommentCreatActivity.this.n0(f5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b extends ClickableSpan {
        b() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type_val("8794114");
            intentDateBean.setLink_type(8);
            IntentUtil.getInstance().intentActivity(CommentCreatActivity.this, intentDateBean);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            textPaint.setUnderlineText(false);
        }
    }

    /* loaded from: classes4.dex */
    class c implements a0.o0 {
        c() {
        }

        @Override // com.join.mgps.Util.a0.o0
        public void a() {
            CommentCreatActivity.this.finish();
        }
    }

    public static String i0() {
        return Build.MODEL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(float f5) {
        int i4 = (int) f5;
        if (i4 == 1) {
            this.f29380h.setText("浪费生命");
        } else if (i4 == 2) {
            this.f29380h.setText("打发时间");
        } else if (i4 == 3) {
            this.f29380h.setText("值得一玩");
        } else if (i4 == 4) {
            this.f29380h.setText("强烈推荐");
        } else if (i4 != 5) {
            this.f29380h.setText("点击星星评分");
        } else {
            this.f29380h.setText("必玩神作");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        this.f29395w = com.join.mgps.rpc.impl.e.m();
        this.f29374b = this;
        String str = this.f29393u;
        if (str != null && str.equals("1")) {
            this.f29379g.setVisibility(0);
        } else {
            this.f29379g.setVisibility(8);
        }
        String str2 = this.f29385m;
        if (str2 != null) {
            this.f29381i.setText(str2);
        }
        this.f29378f.setStarMark(this.f29386n);
        n0(this.f29386n);
        if (this.f29394v == 1) {
            this.f29397y = true;
        } else if (this.f29387o != null && this.f29388p != null) {
            DownloadTask F = p1.f.K().F(this.f29387o);
            if (!this.f29388p.equals(Dtype.H5.name()) && !this.f29388p.equals("102") && !this.f29388p.equals("green")) {
                if (F != null && F.getStatus() == 5) {
                    if (F.getFileType().equals(Dtype.android.name())) {
                        if (com.join.android.app.common.utils.e.l0(this.f29374b).d(this.f29374b, this.f29390r)) {
                            this.f29397y = true;
                        } else {
                            this.f29397y = false;
                        }
                    } else {
                        this.f29397y = true;
                    }
                } else {
                    this.f29397y = false;
                }
            } else if (F == null && this.f29389q != 1) {
                this.f29397y = false;
            } else {
                this.f29397y = true;
            }
        }
        this.f29397y = true;
        String i02 = i0();
        if (i02 != null && !i02.isEmpty()) {
            this.f29382j.setText(i02);
        } else {
            com.join.mgps.Util.l2.a(this.f29374b).b("手机型号获取失败！");
        }
        if (this.f29391s) {
            String str3 = this.f29392t;
            if (str3 != null && !str3.isEmpty()) {
                this.f29382j.setChecked(true);
            } else {
                this.f29382j.setChecked(false);
            }
        } else {
            this.f29382j.setChecked(true);
        }
        this.f29378f.setOnStarChangeListener(new a());
        TextView textView = this.f29383k;
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            SpannableString spannableString = new SpannableString("请按照《悟饭评价规则》发布点评");
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#3CA4FD")), 3, 11, 0);
            spannableString.setSpan(new b(), 3, 11, 0);
            this.f29383k.setText(spannableString);
            this.f29383k.setHighlightColor(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back_image() {
        finish();
    }

    public CommentCreateArgs g0(float f5, String str, String str2) {
        String str3;
        String str4;
        String str5;
        int i4;
        String d5 = this.f29396x.commentToken().d();
        boolean isChecked = this.f29382j.isChecked();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f29374b).getAccountData();
        this.f29398z = accountData;
        if (accountData != null) {
            int uid = accountData.getUid();
            String nickname = this.f29398z.getNickname();
            i4 = uid;
            str3 = nickname;
            str4 = this.f29398z.d0();
            str5 = this.f29398z.getToken();
        } else {
            str3 = "";
            str4 = str3;
            str5 = str4;
            i4 = -1;
        }
        return RequestBeanUtil.getInstance(this.f29374b).getCreateCommentBean(this.f29387o, f5, str, d5, str2, 1, "0", str3, str4, str5, i4, 1, isChecked ? 1 : 0);
    }

    public CommentModifyArgs h0(float f5, String str, String str2) {
        String str3;
        int i4;
        String d5 = this.f29396x.commentToken().d();
        boolean isChecked = this.f29382j.isChecked();
        com.wufan.user.service.protobuf.n0 accountData = AccountUtil_.getInstance_(this.f29374b).getAccountData();
        this.f29398z = accountData;
        if (accountData != null) {
            i4 = accountData.getUid();
            str3 = this.f29398z.getToken();
        } else {
            str3 = "";
            i4 = -1;
        }
        return RequestBeanUtil.getInstance(this.f29374b).getModifyCommentBean(d5, str2, this.f29387o, i4, this.f29384l, str3, str, f5, isChecked ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void j0() {
        if (com.join.android.app.common.utils.j.j(this.f29374b)) {
            try {
                CommentResponse<CommentTokenBean> c5 = this.f29395w.c(RequestBeanUtil.getInstance(this).getTokenRequestBean(AccountUtil_.getInstance_(this).getUid(), ""));
                if (c5 == null || c5.getCode() != 0 || c5.getData_info() == null || TextUtils.isEmpty(c5.getData_info().getToken())) {
                    return;
                }
                this.f29396x.commentToken().g(AESUtils.f(c5.getData_info().getToken() + "|" + c5.getData_info().getTimes()));
                this.f29396x.lastCheckInTime().g(Long.valueOf(System.currentTimeMillis()));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void k0(int i4, double d5, String str, String str2) {
        org.greenrobot.eventbus.c.f().o(new com.join.mgps.event.j(i4, str, d5, System.currentTimeMillis() / 1000, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void l0(String str, boolean z4) {
        com.join.mgps.Util.l2.a(this.f29374b).b(str);
        if (z4) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void m0(CommentResponse commentResponse) {
        if (commentResponse.getCode() == 801) {
            j0();
            com.join.mgps.Util.l2.a(this.f29374b).b("数据访问失败，请稍候再试！");
            return;
        }
        com.join.mgps.Util.l2.a(this.f29374b).b(commentResponse.getMsg());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        float starMark = this.f29378f.getStarMark();
        String str = this.f29393u;
        if (str == null || !str.equals("1")) {
            starMark = 0.0f;
        } else if (starMark == 0.0f) {
            com.join.mgps.Util.l2.a(this.f29374b).b("请点击星星评分");
            return;
        }
        String trim = this.f29381i.getText().toString().trim();
        if (trim.length() >= 3 && trim.length() <= 800) {
            p0(starMark, trim, this.f29382j.getText().toString());
        } else {
            com.join.mgps.Util.l2.a(this.f29374b).b("请填写3~800个字");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (IntentUtil.getInstance().goLoginInteractive(this) || this.f29397y) {
            return;
        }
        com.join.mgps.Util.b0.f0(this).B(this, new c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void p0(float f5, String str, String str2) {
        CommentResponse<CommentCreateBean> a5;
        if (com.join.android.app.common.utils.j.j(this.f29374b)) {
            try {
                if (this.f29384l == null) {
                    a5 = this.f29395w.d(g0(f5, str, str2));
                } else {
                    a5 = this.f29395w.a(h0(f5, str, str2));
                }
                if (a5 != null) {
                    if (a5.getCode() != 0) {
                        if (a5.getCode() == 801) {
                            m0(a5);
                            return;
                        } else {
                            l0(a5.getMsg(), false);
                            return;
                        }
                    } else if (a5.getData_info().getInfo() != null) {
                        if (!this.f29382j.isChecked()) {
                            str2 = "";
                        }
                        String str3 = str2;
                        if (this.f29384l == null) {
                            k0(0, f5, str, str3);
                            l0("点评创建成功,内容将在审核后显示！", true);
                            return;
                        }
                        k0(2, f5, str, str3);
                        l0("点评修改成功,内容将在审核后显示！", true);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f29384l == null) {
                    l0("点评创建失败，请稍候再试~", true);
                    return;
                } else {
                    l0("点评修改失败，请稍候再试~", true);
                    return;
                }
            } catch (Exception e5) {
                l0(e5.getMessage(), false);
                e5.printStackTrace();
                return;
            }
        }
        l0("网络连接失败，再试试吧~", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void showMessage(String str) {
        com.join.mgps.Util.l2.a(this.f29374b).b(str);
    }
}
