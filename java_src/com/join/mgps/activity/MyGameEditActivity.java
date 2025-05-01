package com.join.mgps.activity;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.BaseActivity;
import com.facebook.drawee.view.SimpleDraweeView;
import com.github.snowdream.android.app.downloader.DownloadTask;
import com.join.android.app.common.utils.JsonMapper;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.dto.ModleBean;
import com.join.mgps.dto.RecomDatabean;
import com.join.mgps.pref.PrefDef_;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;
import org.androidannotations.annotations.sharedpreferences.Pref;
@EActivity(R.layout.activity_mygame_edit)
/* loaded from: classes4.dex */
public class MyGameEditActivity extends BaseActivity {

    /* renamed from: b  reason: collision with root package name */
    private com.join.mgps.adapter.w2 f35648b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ImageView f35649c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    ListView f35650d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f35651e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f35652f;

    /* renamed from: g  reason: collision with root package name */
    List<DownloadTask> f35653g;
    @Pref

    /* renamed from: h  reason: collision with root package name */
    PrefDef_ f35654h;

    /* renamed from: i  reason: collision with root package name */
    private Context f35655i;

    /* renamed from: j  reason: collision with root package name */
    private DownloadTask f35656j;

    /* renamed from: k  reason: collision with root package name */
    private com.join.mgps.dialog.d1 f35657k;

    /* renamed from: l  reason: collision with root package name */
    private List<DownloadTask> f35658l;

    /* renamed from: m  reason: collision with root package name */
    RecomDatabean f35659m;

    /* renamed from: n  reason: collision with root package name */
    View f35660n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f35661o;

    /* renamed from: p  reason: collision with root package name */
    com.join.mgps.rpc.e f35662p;

    /* renamed from: q  reason: collision with root package name */
    Dialog f35663q;

    /* renamed from: r  reason: collision with root package name */
    boolean f35664r = false;

    /* renamed from: s  reason: collision with root package name */
    String f35665s = "在线玩H5";

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ImageView f35666b;

        a(ImageView imageView) {
            this.f35666b = imageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ImageView imageView = this.f35666b;
            imageView.setSelected(!imageView.isSelected());
            MyGameEditActivity.this.f35664r = this.f35666b.isSelected();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGameEditActivity.this.f35663q.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MyGameEditActivity.this.f35654h.hideGameTopAd().g(Boolean.TRUE);
            MyGameEditActivity.this.p0(null);
            MyGameEditActivity.this.f35663q.dismiss();
        }
    }

    /* loaded from: classes4.dex */
    public class d {

        /* renamed from: a  reason: collision with root package name */
        ImageView f35670a;

        /* renamed from: b  reason: collision with root package name */
        SimpleDraweeView f35671b;

        /* renamed from: c  reason: collision with root package name */
        TextView f35672c;

        /* renamed from: d  reason: collision with root package name */
        View f35673d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f35674e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f35675f;

        public d() {
        }
    }

    private void s0(RecomDatabean recomDatabean) {
        this.f35654h.gameTopAd().g(JsonMapper.toJsonString(recomDatabean));
    }

    private void v0() {
        if (this.f35648b == null) {
            return;
        }
        ImageView imageView = this.f35649c;
        boolean z4 = imageView != null ? !imageView.isSelected() : false;
        HashMap<Integer, Boolean> hashMap = this.f35648b.f45952d;
        for (int i4 = 0; i4 < hashMap.size(); i4++) {
            hashMap.put(Integer.valueOf(i4), Boolean.valueOf(z4));
        }
        this.f35649c.setSelected(z4);
        this.f35648b.notifyDataSetChanged();
        t0(hashMap);
    }

    private void z0() {
        this.f35652f.setVisibility(0);
        this.f35650d.setVisibility(8);
        this.f35651e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f35662p = com.join.mgps.rpc.impl.d.P1();
        this.f35655i = this;
        List<DownloadTask> R = p1.f.K().R(null);
        this.f35653g = R;
        if (R.size() == 0) {
            z0();
            return;
        }
        if (h0()) {
            m0();
        }
        com.join.mgps.adapter.w2 w2Var = new com.join.mgps.adapter.w2(this, this.f35653g);
        this.f35648b = w2Var;
        this.f35650d.setAdapter((ListAdapter) w2Var);
        this.f35651e.setText(String.format(getString(R.string.papa_del_game), "0", ""));
        this.f35657k = new com.join.mgps.dialog.d1(this, R.style.MyprogressDialog);
        this.f35658l = new ArrayList();
    }

    void g0() {
        View view = this.f35660n;
        if (view == null || !this.f35650d.removeHeaderView(view)) {
            return;
        }
        this.f35660n = null;
        this.f35659m = null;
    }

    boolean h0() {
        if (com.join.mgps.Util.g2.h(LocalGameActivity.f34225s)) {
            return false;
        }
        return Arrays.asList("全部游戏", "网游").contains(LocalGameActivity.f34225s);
    }

    void i0() {
        Dialog dialog = this.f35663q;
        if (dialog != null) {
            if (dialog.isShowing()) {
                this.f35663q.dismiss();
            }
            this.f35663q = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void j0() {
        v0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void k0() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void l0() {
        y0();
        r0(0);
    }

    void m0() {
        try {
            try {
                p0((RecomDatabean) JsonMapper.getInstance().fromJson(this.f35654h.gameTopAd().e(""), RecomDatabean.class));
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        } finally {
            this.f35661o = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void n0() {
        com.join.mgps.dialog.d1 d1Var = this.f35657k;
        if (d1Var != null) {
            d1Var.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void o0() {
        v0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        com.join.mgps.dialog.d1 d1Var = this.f35657k;
        if (d1Var != null) {
            d1Var.dismiss();
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f35656j != null) {
            if (!com.join.android.app.common.utils.e.l0(this.f35655i).d(this.f35655i, this.f35656j.getPackageName())) {
                int indexOf = this.f35653g.indexOf(this.f35656j);
                this.f35658l.add(this.f35656j);
                y0();
                if (indexOf < this.f35653g.size() - 1) {
                    r0(indexOf + 1);
                    return;
                }
                n0();
                q0();
                return;
            }
            n0();
            q0();
        }
    }

    void p0(RecomDatabean recomDatabean) {
        try {
            this.f35659m = recomDatabean;
            if (recomDatabean == null || recomDatabean.getMain() == null || this.f35659m.getMain().getAd_switch() != 1 || this.f35654h.hideGameTopAd().d().booleanValue() || this.f35659m == null) {
                return;
            }
            DownloadTask downloadTask = new DownloadTask();
            downloadTask.setExt1("h5");
            ModleBean main = this.f35659m.getMain();
            downloadTask.setPortraitURL(main.getPic_remote());
            downloadTask.setShowName(main.getTitle());
            downloadTask.setDescribe(main.getLabel());
            downloadTask.setShowSize("0.1");
            this.f35653g.add(0, downloadTask);
        } catch (Resources.NotFoundException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void q0() {
        HashMap<Integer, Boolean> hashMap = this.f35648b.f45952d;
        for (DownloadTask downloadTask : this.f35658l) {
            this.f35653g.remove(downloadTask);
        }
        this.f35658l.clear();
        hashMap.clear();
        for (int i4 = 0; i4 < this.f35653g.size(); i4++) {
            hashMap.put(Integer.valueOf(i4), Boolean.FALSE);
        }
        this.f35651e.setText(String.format(getString(R.string.papa_del_game), "0", ""));
        this.f35651e.setSelected(false);
        this.f35651e.setClickable(false);
        this.f35648b.notifyDataSetChanged();
        if (this.f35653g.size() == 0) {
            z0();
        }
        this.f35649c.setSelected(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Background
    public void r0(int i4) {
        HashMap<Integer, Boolean> hashMap = this.f35648b.f45952d;
        boolean z4 = false;
        while (true) {
            if (i4 >= this.f35653g.size()) {
                break;
            }
            if (hashMap.get(Integer.valueOf(i4)).booleanValue()) {
                this.f35656j = this.f35653g.get(i4);
                z4 = com.join.android.app.common.utils.e.l0(this.f35655i).d(this.f35655i, this.f35656j.getPackageName());
                if (z4) {
                    com.join.android.app.common.utils.e.l0(this.f35655i).f0(this.f35655i, this.f35656j.getPackageName());
                    break;
                }
                u0(String.format(getString(R.string.papa_del_game_test), this.f35656j.getShowName()));
                if (this.f35656j.getExt1() != null && this.f35656j.getExt1().equals("h5")) {
                    this.f35654h.hideGameTopAd().g(Boolean.TRUE);
                    this.f35658l.add(this.f35656j);
                } else {
                    com.php25.PDownload.d.a(this.f35656j);
                    UtilsMy.x4(this.f35656j);
                    this.f35658l.add(this.f35656j);
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e5) {
                        e5.printStackTrace();
                    }
                }
            }
            i4++;
        }
        if (!z4) {
            q0();
        }
        n0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void setNetwork() {
        IntentDateBean intentDateBean = new IntentDateBean();
        intentDateBean.setLink_type(3);
        intentDateBean.setJump_type(2);
        IntentUtil.getInstance().intentActivity(this, intentDateBean);
    }

    public void t0(HashMap<Integer, Boolean> hashMap) {
        long j4 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f35653g.size(); i5++) {
            if (hashMap.get(Integer.valueOf(i5)).booleanValue()) {
                j4 += (long) (Double.parseDouble(this.f35653g.get(i5).getShowSize()) * 1024.0d * 1024.0d);
                i4++;
            }
        }
        if (i4 == 0) {
            this.f35651e.setClickable(false);
            this.f35651e.setSelected(false);
            this.f35651e.setText(String.format(getString(R.string.papa_del_game), "0", ""));
        } else {
            this.f35651e.setClickable(true);
            this.f35651e.setSelected(true);
            Button button = this.f35651e;
            String string = getString(R.string.papa_del_game);
            button.setText(String.format(string, i4 + "", "，" + UtilsMy.J2(j4)));
        }
        if (i4 == this.f35653g.size()) {
            this.f35649c.setSelected(true);
        } else {
            this.f35649c.setSelected(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void u0(String str) {
        com.join.mgps.dialog.d1 d1Var = this.f35657k;
        if (d1Var != null) {
            d1Var.a(str);
        }
    }

    void w0(View view, ImageView imageView) {
        view.setOnClickListener(new a(imageView));
    }

    void x0() {
        if (this.f35663q == null) {
            com.join.mgps.customview.o oVar = new com.join.mgps.customview.o(this.f35655i, R.style.MyDialog);
            this.f35663q = oVar;
            oVar.setContentView(R.layout.delete_center_dialog);
            Button button = (Button) this.f35663q.findViewById(R.id.dialog_button_ok);
            ((TextView) this.f35663q.findViewById(R.id.tip_title)).setText("删除游戏");
            ((TextView) this.f35663q.findViewById(R.id.dialog_content)).setText("你确定要删除悟饭在线玩？");
            button.setText("删除");
            ((Button) this.f35663q.findViewById(R.id.dialog_button_cancle)).setOnClickListener(new b());
            button.setOnClickListener(new c());
        }
        Dialog dialog = this.f35663q;
        if (dialog == null || dialog.isShowing()) {
            return;
        }
        this.f35663q.show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void y0() {
        com.join.mgps.dialog.d1 d1Var = this.f35657k;
        if (d1Var == null || d1Var.isShowing()) {
            return;
        }
        this.f35657k.show();
    }
}
