package com.join.mgps.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.activity.NowWufunFragment;
import com.join.mgps.customview.DownloadViewBig;
import com.join.mgps.customview.DownloadViewNormal;
import com.join.mgps.dto.TodayWufunBroadcast;
import com.join.mgps.dto.TodayWufunEverday;
import com.join.mgps.dto.TodayWufunTodayNew;
import com.join.mgps.dto.TodayWufunTopic;
import java.util.List;
/* compiled from: NowWufunAdapter.java */
/* loaded from: classes4.dex */
public class z2 extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    List<NowWufunFragment.c> f46108b;

    /* renamed from: c  reason: collision with root package name */
    private Context f46109c;

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TodayWufunEverday f46110b;

        a(TodayWufunEverday todayWufunEverday) {
            this.f46110b = todayWufunEverday;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goGameDetialActivity(z2.this.f46109c, this.f46110b.getGame_id(), this.f46110b.getTpl_type(), this.f46110b.getSp_tpl_two_position(), 0);
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TodayWufunBroadcast f46112b;

        b(TodayWufunBroadcast todayWufunBroadcast) {
            this.f46112b = todayWufunBroadcast;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(6);
            intentDateBean.setLink_type_val(this.f46112b.getId());
            IntentUtil.getInstance().intentActivity(z2.this.f46109c, intentDateBean);
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TodayWufunTodayNew f46114b;

        c(TodayWufunTodayNew todayWufunTodayNew) {
            this.f46114b = todayWufunTodayNew;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentUtil.getInstance().goGameDetialActivity(z2.this.f46109c, this.f46114b.getGame_id(), this.f46114b.getTpl_type(), this.f46114b.getSp_tpl_two_position(), 0);
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            z2.this.f46109c.sendBroadcast(new Intent("com.intent.nowwufun.everdaytab"));
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TodayWufunTopic f46117b;

        e(TodayWufunTopic todayWufunTopic) {
            this.f46117b = todayWufunTopic;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(6);
            intentDateBean.setLink_type_val(this.f46117b.getId());
            IntentUtil.getInstance().intentActivity(z2.this.f46109c, intentDateBean);
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TodayWufunTopic f46119b;

        f(TodayWufunTopic todayWufunTopic) {
            this.f46119b = todayWufunTopic;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IntentDateBean intentDateBean = new IntentDateBean();
            intentDateBean.setLink_type(6);
            intentDateBean.setLink_type_val(this.f46119b.getId());
            IntentUtil.getInstance().intentActivity(z2.this.f46109c, intentDateBean);
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f46121a;

        static {
            int[] iArr = new int[NowWufunFragment.ItemType.values().length];
            f46121a = iArr;
            try {
                iArr[NowWufunFragment.ItemType.DATETITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46121a[NowWufunFragment.ItemType.FIND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46121a[NowWufunFragment.ItemType.BROADCAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46121a[NowWufunFragment.ItemType.TODAYNEWTITLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46121a[NowWufunFragment.ItemType.TODAYNEWITEM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46121a[NowWufunFragment.ItemType.TODAYNEWBOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46121a[NowWufunFragment.ItemType.TOPIC.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46121a[NowWufunFragment.ItemType.TOPIC2.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    class h {

        /* renamed from: a  reason: collision with root package name */
        private TextView f46122a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f46123b;

        h() {
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    class i {

        /* renamed from: a  reason: collision with root package name */
        private TextView f46125a;

        i() {
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    class j {

        /* renamed from: a  reason: collision with root package name */
        private TextView f46127a;

        j() {
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    public class k {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f46129a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f46130b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f46131c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f46132d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f46133e;

        /* renamed from: f  reason: collision with root package name */
        public DownloadViewBig f46134f;

        /* renamed from: g  reason: collision with root package name */
        private DownloadViewNormal f46135g;

        /* renamed from: h  reason: collision with root package name */
        private LinearLayout f46136h;

        /* renamed from: i  reason: collision with root package name */
        private LinearLayout f46137i;

        public k() {
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    public class l {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f46139a;

        /* renamed from: b  reason: collision with root package name */
        private TextView f46140b;

        /* renamed from: c  reason: collision with root package name */
        private LinearLayout f46141c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f46142d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f46143e;

        /* renamed from: f  reason: collision with root package name */
        private DownloadViewNormal f46144f;

        /* renamed from: g  reason: collision with root package name */
        public ProgressBar f46145g;

        /* renamed from: h  reason: collision with root package name */
        public ProgressBar f46146h;

        /* renamed from: i  reason: collision with root package name */
        private LinearLayout f46147i;

        /* renamed from: j  reason: collision with root package name */
        public LinearLayout f46148j;

        public l() {
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    class m {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f46150a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f46151b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f46152c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f46153d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f46154e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f46155f;

        /* renamed from: g  reason: collision with root package name */
        private LinearLayout f46156g;

        m() {
        }
    }

    /* compiled from: NowWufunAdapter.java */
    /* loaded from: classes4.dex */
    class n {

        /* renamed from: a  reason: collision with root package name */
        private SimpleDraweeView f46158a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f46159b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f46160c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f46161d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f46162e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f46163f;

        /* renamed from: g  reason: collision with root package name */
        private LinearLayout f46164g;

        n() {
        }
    }

    public z2(Context context, List<NowWufunFragment.c> list) {
        this.f46108b = list;
        this.f46109c = context;
    }

    private NowWufunFragment.ItemType b(int i4) {
        return this.f46108b.get(i4).f36200a;
    }

    private void c(TextView textView, String str, int i4) {
        if (textView == null || com.join.mgps.Util.g2.h(str)) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new LeadingMarginSpan.Standard(i4 + ((int) (com.join.android.app.common.utils.n.n(this.f46109c).g() * 5.0f)), 0), 0, str.length(), 33);
        textView.setText(spannableStringBuilder);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f46108b.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        return this.f46108b.get(i4);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i4) {
        return this.f46108b.get(i4).f36200a.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0298  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
        /*
            Method dump skipped, instructions count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.adapter.z2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 9;
    }
}
