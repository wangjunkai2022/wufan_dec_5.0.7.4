package com.join.mgps.adapter;

import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.UtilsMy;
import com.join.mgps.activity.CommentSelfListActivity_;
import com.join.mgps.customview.HistogramView;
import com.join.mgps.customview.MStarBar;
import com.join.mgps.customview.VipView;
import com.join.mgps.dto.CommentAllListBean;
import com.join.mgps.dto.CommentBaseBean;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes4.dex */
public class CommentAllListFragmentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    private Context f39976a;

    /* renamed from: b  reason: collision with root package name */
    private List<i> f39977b;

    /* renamed from: c  reason: collision with root package name */
    private int f39978c;

    /* renamed from: d  reason: collision with root package name */
    private String f39979d;

    /* renamed from: e  reason: collision with root package name */
    private int f39980e;

    /* renamed from: g  reason: collision with root package name */
    CommentBaseBean f39982g;

    /* renamed from: i  reason: collision with root package name */
    h f39984i;

    /* renamed from: f  reason: collision with root package name */
    private int f39981f = -1;

    /* renamed from: h  reason: collision with root package name */
    private Map<Integer, Boolean> f39983h = new HashMap();

    /* loaded from: classes4.dex */
    public enum ViewType {
        TITLE,
        COMMENT,
        REPLY,
        HEAD
    }

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f39985b;

        a(CommentBaseBean commentBaseBean) {
            this.f39985b = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentSelfListActivity_.P0(view.getContext()).a(Integer.parseInt(this.f39985b.getUid())).start();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f39987b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f39988c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f39989d;

        b(CommentBaseBean commentBaseBean, g gVar, int i4) {
            this.f39987b = commentBaseBean;
            this.f39988c = gVar;
            this.f39989d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f39987b.isShowMore()) {
                return;
            }
            Layout layout = this.f39988c.f40019k.getLayout();
            if (layout != null) {
                int lineCount = layout.getLineCount();
                if (lineCount > 0) {
                    if (layout.getEllipsisCount(lineCount - 1) <= 0) {
                        if (!CommentAllListFragmentAdapter.this.f39983h.containsKey(Integer.valueOf(this.f39989d))) {
                            this.f39988c.f40020l.setVisibility(8);
                            return;
                        }
                        this.f39987b.setShowMore(true);
                        this.f39988c.f40020l.setVisibility(0);
                        return;
                    }
                    this.f39987b.setShowMore(true);
                    this.f39988c.f40020l.setVisibility(0);
                }
            } else if (this.f39987b.getContent().length() <= 115) {
                this.f39988c.f40020l.setVisibility(8);
            } else {
                this.f39987b.setShowMore(true);
                this.f39988c.f40020l.setVisibility(0);
            }
        }
    }

    /* loaded from: classes4.dex */
    class c implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f39991b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f39992c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f39993d;

        c(g gVar, int i4, CommentBaseBean commentBaseBean) {
            this.f39991b = gVar;
            this.f39992c = i4;
            this.f39993d = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f39991b.f40020l.getText().toString().equals("查看全部")) {
                CommentAllListFragmentAdapter.this.f39983h.put(Integer.valueOf(this.f39992c), Boolean.TRUE);
                if (Build.VERSION.SDK_INT == 19) {
                    this.f39991b.f40019k.setText(this.f39993d.getContent());
                }
                this.f39991b.f40019k.setMaxLines(Integer.MAX_VALUE);
                this.f39991b.f40020l.setText("收起");
                return;
            }
            CommentAllListFragmentAdapter.this.f39983h.put(Integer.valueOf(this.f39992c), Boolean.FALSE);
            if (Build.VERSION.SDK_INT == 19) {
                this.f39991b.f40019k.setText(this.f39993d.getContent().replaceAll("\n", ""));
            }
            this.f39991b.f40019k.setMaxLines(5);
            this.f39991b.f40020l.setText("查看全部");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f39995b;

        d(CommentBaseBean commentBaseBean) {
            this.f39995b = commentBaseBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar;
            CommentBaseBean commentBaseBean = this.f39995b;
            if (commentBaseBean == null || (hVar = CommentAllListFragmentAdapter.this.f39984i) == null) {
                return;
            }
            hVar.d(commentBaseBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f39997b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f39998c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f39999d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f40000e;

        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                long longValue = Long.valueOf(e.this.f40000e.getText().toString()).longValue();
                TextView textView = e.this.f40000e;
                textView.setText((longValue + 1) + "");
                e eVar = e.this;
                CommentAllListFragmentAdapter.this.d(eVar.f39998c);
                e eVar2 = e.this;
                h hVar = CommentAllListFragmentAdapter.this.f39984i;
                if (hVar != null) {
                    hVar.b(eVar2.f39997b, eVar2.f39998c, 1);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        e(CommentBaseBean commentBaseBean, int i4, ImageView imageView, TextView textView) {
            this.f39997b = commentBaseBean;
            this.f39998c = i4;
            this.f39999d = imageView;
            this.f40000e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentBaseBean commentBaseBean;
            if (IntentUtil.getInstance().goLoginInteractive(CommentAllListFragmentAdapter.this.f39976a) || (commentBaseBean = this.f39997b) == null) {
                return;
            }
            if (commentBaseBean.getIs_praise() == 1) {
                CommentAllListFragmentAdapter.this.q(this.f39998c);
                this.f39999d.setImageResource(R.drawable.up_ic);
                h hVar = CommentAllListFragmentAdapter.this.f39984i;
                if (hVar != null) {
                    hVar.b(this.f39997b, this.f39998c, 2);
                    return;
                }
                return;
            }
            this.f39997b.setIs_praise(1);
            if (AccountUtil_.getInstance_(CommentAllListFragmentAdapter.this.f39976a).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(CommentAllListFragmentAdapter.this.f39976a);
                return;
            }
            this.f39999d.setImageResource(R.drawable.uped_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(CommentAllListFragmentAdapter.this.f39976a, R.anim.scale_reset);
            this.f39999d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommentBaseBean f40003b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f40004c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ImageView f40005d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TextView f40006e;

        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                long longValue = Long.valueOf(f.this.f40006e.getText().toString()).longValue();
                TextView textView = f.this.f40006e;
                textView.setText((longValue + 1) + "");
                f fVar = f.this;
                CommentAllListFragmentAdapter.this.c(fVar.f40004c);
                f fVar2 = f.this;
                h hVar = CommentAllListFragmentAdapter.this.f39984i;
                if (hVar != null) {
                    hVar.c(fVar2.f40003b, fVar2.f40004c, 1);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        f(CommentBaseBean commentBaseBean, int i4, ImageView imageView, TextView textView) {
            this.f40003b = commentBaseBean;
            this.f40004c = i4;
            this.f40005d = imageView;
            this.f40006e = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentBaseBean commentBaseBean;
            if (IntentUtil.getInstance().goLoginInteractive(CommentAllListFragmentAdapter.this.f39976a) || (commentBaseBean = this.f40003b) == null) {
                return;
            }
            if (commentBaseBean.getIs_despise() == 1) {
                CommentAllListFragmentAdapter.this.p(this.f40004c);
                this.f40005d.setImageResource(R.drawable.down_ic);
                h hVar = CommentAllListFragmentAdapter.this.f39984i;
                if (hVar != null) {
                    hVar.c(this.f40003b, this.f40004c, 2);
                    return;
                }
                return;
            }
            this.f40003b.setIs_despise(1);
            if (AccountUtil_.getInstance_(CommentAllListFragmentAdapter.this.f39976a).getAccountData() == null) {
                IntentUtil.getInstance().goLoginInteractive(CommentAllListFragmentAdapter.this.f39976a);
                return;
            }
            this.f40005d.setImageResource(R.drawable.downed_ic);
            Animation loadAnimation = AnimationUtils.loadAnimation(CommentAllListFragmentAdapter.this.f39976a, R.anim.scale_reset);
            this.f40005d.startAnimation(loadAnimation);
            loadAnimation.setAnimationListener(new a());
        }
    }

    /* loaded from: classes4.dex */
    class g extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f40009a;

        /* renamed from: b  reason: collision with root package name */
        private SimpleDraweeView f40010b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f40011c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f40012d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f40013e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f40014f;

        /* renamed from: g  reason: collision with root package name */
        private MStarBar f40015g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f40016h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f40017i;

        /* renamed from: j  reason: collision with root package name */
        private ImageView f40018j;

        /* renamed from: k  reason: collision with root package name */
        private TextView f40019k;

        /* renamed from: l  reason: collision with root package name */
        private TextView f40020l;

        /* renamed from: m  reason: collision with root package name */
        public View f40021m;

        /* renamed from: n  reason: collision with root package name */
        private TextView f40022n;

        /* renamed from: o  reason: collision with root package name */
        private ImageView f40023o;

        /* renamed from: p  reason: collision with root package name */
        private TextView f40024p;

        /* renamed from: q  reason: collision with root package name */
        private ImageView f40025q;

        /* renamed from: r  reason: collision with root package name */
        private TextView f40026r;

        /* renamed from: s  reason: collision with root package name */
        private ImageView f40027s;

        /* renamed from: t  reason: collision with root package name */
        private TextView f40028t;

        /* renamed from: u  reason: collision with root package name */
        private VipView f40029u;

        public g(View view) {
            super(view);
            this.f40009a = (LinearLayout) view.findViewById(R.id.commentAllRootLl);
            this.f40010b = (SimpleDraweeView) view.findViewById(R.id.usericon);
            this.f40011c = (TextView) view.findViewById(R.id.userName);
            this.f40012d = (TextView) view.findViewById(R.id.isMe);
            this.f40029u = (VipView) view.findViewById(R.id.levelTv);
            this.f40013e = (ImageView) view.findViewById(R.id.isAuth);
            this.f40018j = (ImageView) view.findViewById(R.id.isGood);
            this.f40014f = (TextView) view.findViewById(R.id.isConnoisseurs);
            this.f40015g = (MStarBar) view.findViewById(R.id.comment_head_mstarBar);
            this.f40016h = (TextView) view.findViewById(R.id.comment_head_num_tx);
            this.f40017i = (TextView) view.findViewById(R.id.time);
            this.f40019k = (TextView) view.findViewById(R.id.content);
            this.f40020l = (TextView) view.findViewById(R.id.more);
            this.f40021m = view.findViewById(R.id.line);
            this.f40022n = (TextView) view.findViewById(R.id.phoneModle);
            this.f40023o = (ImageView) view.findViewById(R.id.parise);
            this.f40024p = (TextView) view.findViewById(R.id.pariseNumber);
            this.f40025q = (ImageView) view.findViewById(R.id.down);
            this.f40026r = (TextView) view.findViewById(R.id.downNumber);
            this.f40027s = (ImageView) view.findViewById(R.id.message);
            this.f40028t = (TextView) view.findViewById(R.id.messageNumber);
        }
    }

    /* loaded from: classes4.dex */
    public interface h {
        void I();

        void b(CommentBaseBean commentBaseBean, int i4, int i5);

        void c(CommentBaseBean commentBaseBean, int i4, int i5);

        void d(CommentBaseBean commentBaseBean);
    }

    /* loaded from: classes4.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        ViewType f40031a;

        /* renamed from: b  reason: collision with root package name */
        Object f40032b;

        /* loaded from: classes4.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public CommentBaseBean f40033a;

            public a(CommentBaseBean commentBaseBean) {
                this.f40033a = commentBaseBean;
            }
        }

        /* loaded from: classes4.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f40034a;

            /* renamed from: b  reason: collision with root package name */
            public CommentBaseBean f40035b;

            /* renamed from: c  reason: collision with root package name */
            public int f40036c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f40037d;

            /* renamed from: e  reason: collision with root package name */
            public int f40038e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f40039f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f40040g;

            public b(String str, CommentBaseBean commentBaseBean, int i4, boolean z4) {
                this.f40034a = str;
                this.f40035b = commentBaseBean;
                this.f40036c = i4;
                this.f40037d = z4;
            }
        }

        public i() {
        }

        public Object a() {
            return this.f40032b;
        }

        public ViewType b() {
            return this.f40031a;
        }

        public void c(Object obj) {
            this.f40032b = obj;
        }

        public void d(ViewType viewType) {
            this.f40031a = viewType;
        }

        public i(ViewType viewType, Object obj) {
            this.f40031a = viewType;
            this.f40032b = obj;
        }
    }

    /* loaded from: classes4.dex */
    class j {
        j() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class k extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private LinearLayout f40042a;

        /* renamed from: b  reason: collision with root package name */
        private LinearLayout f40043b;

        /* renamed from: c  reason: collision with root package name */
        private LinearLayout f40044c;

        /* renamed from: d  reason: collision with root package name */
        private MStarBar f40045d;

        /* renamed from: e  reason: collision with root package name */
        private TextView f40046e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f40047f;

        /* renamed from: g  reason: collision with root package name */
        private TextView f40048g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f40049h;

        /* renamed from: i  reason: collision with root package name */
        private HistogramView f40050i;

        /* renamed from: j  reason: collision with root package name */
        private HistogramView f40051j;

        /* renamed from: k  reason: collision with root package name */
        private HistogramView f40052k;

        /* renamed from: l  reason: collision with root package name */
        private HistogramView f40053l;

        /* renamed from: m  reason: collision with root package name */
        private HistogramView f40054m;

        /* loaded from: classes4.dex */
        class a implements View.OnClickListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CommentAllListFragmentAdapter f40056b;

            a(CommentAllListFragmentAdapter commentAllListFragmentAdapter) {
                this.f40056b = commentAllListFragmentAdapter;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CommentAllListFragmentAdapter.this.f39984i.I();
            }
        }

        public k(View view) {
            super(view);
            this.f40050i = (HistogramView) view.findViewById(R.id.oneHv);
            this.f40051j = (HistogramView) view.findViewById(R.id.twoHv);
            this.f40052k = (HistogramView) view.findViewById(R.id.threeHv);
            this.f40053l = (HistogramView) view.findViewById(R.id.fourHv);
            this.f40054m = (HistogramView) view.findViewById(R.id.fiveHv);
            this.f40045d = (MStarBar) view.findViewById(R.id.comment_head_mstarBar);
            this.f40048g = (TextView) view.findViewById(R.id.comment_head_point_tx);
            this.f40047f = (TextView) view.findViewById(R.id.comment_head_nopoint_tx);
            this.f40049h = (TextView) view.findViewById(R.id.comment_head_num_tx);
            TextView textView = (TextView) view.findViewById(R.id.editText5);
            this.f40046e = textView;
            textView.setText("写评论");
            this.f40042a = (LinearLayout) view.findViewById(R.id.start_ll);
            this.f40043b = (LinearLayout) view.findViewById(R.id.point_ll);
            view.findViewById(R.id.goCommit).setOnClickListener(new a(CommentAllListFragmentAdapter.this));
            this.f40045d.setIntegerMark(false);
            this.f40045d.setEnabled(false);
        }
    }

    /* loaded from: classes4.dex */
    class l extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f40058a;

        /* renamed from: b  reason: collision with root package name */
        public LinearLayout f40059b;

        /* renamed from: c  reason: collision with root package name */
        public View f40060c;

        /* renamed from: d  reason: collision with root package name */
        public View f40061d;

        public l(View view) {
            super(view);
            this.f40058a = (TextView) view.findViewById(R.id.titleText);
            this.f40060c = view.findViewById(R.id.layoutTop);
        }
    }

    public CommentAllListFragmentAdapter(Context context, int i4, List<i> list, String str, int i5, h hVar) {
        this.f39984i = null;
        this.f39976a = context;
        this.f39978c = i4;
        this.f39979d = str;
        this.f39980e = i5;
        this.f39977b = list;
        this.f39984i = hVar;
    }

    private int e(Context context, float f5) {
        return (int) ((f5 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private void m(View view, CommentBaseBean commentBaseBean) {
        view.setOnClickListener(new d(commentBaseBean));
    }

    private void n(ImageView imageView, TextView textView, CommentBaseBean commentBaseBean, int i4) {
        e eVar = new e(commentBaseBean, i4, imageView, textView);
        imageView.setOnClickListener(eVar);
        textView.setOnClickListener(eVar);
    }

    private void o(ImageView imageView, TextView textView, CommentBaseBean commentBaseBean, int i4) {
        f fVar = new f(commentBaseBean, i4, imageView, textView);
        imageView.setOnClickListener(fVar);
        textView.setOnClickListener(fVar);
    }

    public void c(int i4) {
        i.a aVar = (i.a) getItem(i4);
        long longValue = Long.valueOf(aVar.f40033a.getDespise_count()).longValue();
        aVar.f40033a.setIs_despise(1);
        CommentBaseBean commentBaseBean = aVar.f40033a;
        commentBaseBean.setDespise_count((longValue + 1) + "");
        notifyDataSetChanged();
    }

    public void d(int i4) {
        i.a aVar = (i.a) getItem(i4);
        long praise_count = aVar.f40033a.getPraise_count();
        aVar.f40033a.setIs_praise(1);
        aVar.f40033a.setPraise_count(praise_count + 1);
        notifyDataSetChanged();
    }

    public int f() {
        if (this.f39981f == -1) {
            int i4 = 0;
            while (true) {
                if (i4 < this.f39977b.size()) {
                    if (this.f39977b.get(i4).b() == ViewType.COMMENT && ((i.a) this.f39977b.get(i4).a()).f40033a.getUid().equals(String.valueOf(this.f39978c))) {
                        this.f39981f = i4;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
        }
        return this.f39981f;
    }

    public h g() {
        return this.f39984i;
    }

    public Object getItem(int i4) {
        List<i> list = this.f39977b;
        if (list != null) {
            return list.get(i4).a();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<i> list = this.f39977b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        List<i> list = this.f39977b;
        if (list != null) {
            return list.get(i4).b().ordinal();
        }
        return -1;
    }

    public void h(int i4, int i5) {
        i.a aVar = (i.a) getItem(i4);
        long longValue = Long.valueOf(aVar.f40033a.getDespise_count()).longValue();
        if (aVar.f40033a.getIs_despise() == 1) {
            aVar.f40033a.setIs_despise(0);
            long j4 = longValue - 1;
            if (j4 < 0) {
                aVar.f40033a.setDespise_count("0");
            } else {
                CommentBaseBean commentBaseBean = aVar.f40033a;
                commentBaseBean.setDespise_count(j4 + "");
            }
        } else if (i5 != 1) {
            aVar.f40033a.setIs_despise(1);
            CommentBaseBean commentBaseBean2 = aVar.f40033a;
            commentBaseBean2.setDespise_count((longValue + 1) + "");
        }
        notifyDataSetChanged();
    }

    public void i(int i4, int i5) {
        i.a aVar = (i.a) getItem(i4);
        long praise_count = aVar.f40033a.getPraise_count();
        if (aVar.f40033a.getIs_praise() == 1) {
            aVar.f40033a.setIs_praise(0);
            long j4 = praise_count - 1;
            if (j4 < 0) {
                aVar.f40033a.setPraise_count(0L);
            } else {
                aVar.f40033a.setPraise_count(j4);
            }
        } else if (i5 != 1) {
            aVar.f40033a.setIs_praise(1);
            aVar.f40033a.setPraise_count(praise_count + 1);
        }
        notifyDataSetChanged();
    }

    void j(CommentAllListBean.ScoringDetailsBean scoringDetailsBean, k kVar) {
        try {
            HistogramView[] histogramViewArr = {kVar.f40050i, kVar.f40051j, kVar.f40052k, kVar.f40053l, kVar.f40054m};
            String[] strArr = {"#F47500", "#FFA423", "#FFB53D", "#FBCD36", "#E4DECA"};
            kVar.f40048g.setText(new DecimalFormat("#.0").format(com.join.mgps.Util.g2.i(scoringDetailsBean.getTotal_score()) ? Double.valueOf(scoringDetailsBean.getTotal_score()).doubleValue() : 0.0d));
            kVar.f40045d.setStarMark(scoringDetailsBean.getTotal_stars());
            double[] dArr = {Double.valueOf(scoringDetailsBean.getStars_score5()).doubleValue(), Double.valueOf(scoringDetailsBean.getStars_score4()).doubleValue(), Double.valueOf(scoringDetailsBean.getStars_score3()).doubleValue(), Double.valueOf(scoringDetailsBean.getStars_score2()).doubleValue(), Double.valueOf(scoringDetailsBean.getStars_score1()).doubleValue()};
            double d5 = 0.0d;
            int i4 = 0;
            for (int i5 = 0; i5 < 5; i5++) {
                double d6 = dArr[i5];
                if (dArr[i5] > d5) {
                    d5 = dArr[i5];
                    i4 = i5;
                }
            }
            kVar.f40049h.setText(scoringDetailsBean.getP_count() + "人");
            if (scoringDetailsBean.getP_count() <= 0) {
                kVar.f40045d.setStarMark(0.0d);
                kVar.f40047f.setVisibility(0);
                kVar.f40048g.setVisibility(8);
                kVar.f40049h.setVisibility(8);
            } else {
                kVar.f40043b.setVisibility(0);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, e(this.f39976a, 10.0f));
            for (int i6 = 0; i6 < 5; i6++) {
                histogramViewArr[i6].setAnim(false);
                if (dArr[i6] == 0.0d) {
                    histogramViewArr[i6].setProgress(0.0d);
                } else if (i6 == i4) {
                    histogramViewArr[i6].setProgress(1.0d);
                } else if (d5 == dArr[i6]) {
                    histogramViewArr[i6].setProgress(1.0d);
                } else {
                    histogramViewArr[i6].setProgress(dArr[i6] / d5);
                }
                histogramViewArr[i6].setRateBackgroundColor(strArr[i6]);
                histogramViewArr[i6].setLayoutParams(layoutParams);
                histogramViewArr[i6].setOrientation(0);
            }
        } catch (Exception unused) {
        }
    }

    public void k(h hVar) {
        this.f39984i = hVar;
    }

    public void l(CommentBaseBean commentBaseBean) {
        this.f39982g = commentBaseBean;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i4) {
        String str;
        int itemViewType = getItemViewType(i4);
        if (itemViewType == ViewType.COMMENT.ordinal()) {
            CommentBaseBean commentBaseBean = ((i.a) getItem(i4)).f40033a;
            g gVar = (g) viewHolder;
            gVar.f40011c.setTextColor(-16777216);
            if (commentBaseBean.getVip_level() > 0) {
                gVar.f40011c.setTextColor(this.f39976a.getResources().getColor(R.color.vip_color));
            }
            if (commentBaseBean.getSvip_level() > 0) {
                gVar.f40011c.setTextColor(this.f39976a.getResources().getColor(R.color.vip_svip_color));
            }
            gVar.f40029u.setVipData(commentBaseBean.getVip_level(), commentBaseBean.getSvip_level());
            if (commentBaseBean.getUid().equals(String.valueOf(this.f39978c))) {
                gVar.f40012d.setVisibility(0);
                this.f39981f = i4;
            } else {
                gVar.f40012d.setVisibility(8);
            }
            gVar.f40010b.setOnClickListener(new a(commentBaseBean));
            gVar.f40011c.setText(commentBaseBean.getUser_name());
            if (Build.VERSION.SDK_INT == 19) {
                gVar.f40019k.setText(commentBaseBean.getContent().replaceAll("\n", ""));
            } else {
                gVar.f40019k.setText(commentBaseBean.getContent());
            }
            if (commentBaseBean.getIs_old() == 1 || commentBaseBean.getMobile_phone_model() == null || commentBaseBean.getMobile_phone_model().isEmpty()) {
                gVar.f40022n.setVisibility(4);
            } else {
                gVar.f40022n.setVisibility(0);
                gVar.f40022n.setText(commentBaseBean.getMobile_phone_model());
            }
            TextView textView = gVar.f40024p;
            textView.setText(commentBaseBean.getPraise_count() + "");
            TextView textView2 = gVar.f40026r;
            textView2.setText(commentBaseBean.getDespise_count() + "");
            TextView textView3 = gVar.f40028t;
            textView3.setText(commentBaseBean.getReply_count() + "");
            gVar.f40017i.setText(com.join.android.app.common.utils.g.a(Long.parseLong(commentBaseBean.getAdd_times() + "000")));
            if (commentBaseBean.getIs_old() == 1 || Float.valueOf(commentBaseBean.getStars_score()).floatValue() == 0.0f || ((str = this.f39979d) != null && !str.equals("1"))) {
                gVar.f40015g.setVisibility(8);
            } else {
                gVar.f40015g.setVisibility(0);
                gVar.f40015g.setStarMark(Float.valueOf(commentBaseBean.getStars_score()).floatValue());
            }
            if (this.f39980e != 1) {
                gVar.f40016h.setVisibility(8);
            } else if (commentBaseBean.getIs_old() == 0) {
                gVar.f40016h.setVisibility(0);
                TextView textView4 = gVar.f40016h;
                textView4.setText("启动游戏 " + commentBaseBean.getStart_game_count() + " 次");
            } else {
                gVar.f40016h.setVisibility(8);
            }
            gVar.f40015g.setEnabled(false);
            if (commentBaseBean.getApproval_rate() == null || Double.valueOf(commentBaseBean.getApproval_rate()).doubleValue() <= 70.0d) {
                gVar.f40018j.setVisibility(8);
            } else {
                gVar.f40018j.setVisibility(0);
            }
            if (commentBaseBean.getRank().equals("")) {
                gVar.f40013e.setVisibility(8);
            } else {
                gVar.f40013e.setVisibility(0);
            }
            gVar.f40014f.setText(commentBaseBean.getRank());
            if (commentBaseBean.getIs_praise() == 1) {
                gVar.f40023o.setImageResource(R.drawable.uped_ic);
            } else {
                gVar.f40023o.setImageResource(R.drawable.up_ic);
            }
            if (commentBaseBean.getIs_despise() == 1) {
                gVar.f40025q.setImageResource(R.drawable.downed_ic);
            } else {
                gVar.f40025q.setImageResource(R.drawable.down_ic);
            }
            UtilsMy.s3(this.f39976a, commentBaseBean.getHead_portrait(), gVar.f40010b);
            n(gVar.f40023o, gVar.f40024p, commentBaseBean, i4);
            o(gVar.f40025q, gVar.f40026r, commentBaseBean, i4);
            m(gVar.f40027s, commentBaseBean);
            m(gVar.f40009a, commentBaseBean);
            if (commentBaseBean.getContent().length() > 115) {
                commentBaseBean.setShowMore(true);
            }
            if (commentBaseBean.isShowMore()) {
                gVar.f40020l.setVisibility(0);
            }
            gVar.f40019k.post(new b(commentBaseBean, gVar, i4));
            gVar.f40020l.setOnClickListener(new c(gVar, i4, commentBaseBean));
        } else if (itemViewType == ViewType.HEAD.ordinal()) {
            j((CommentAllListBean.ScoringDetailsBean) getItem(i4), (k) viewHolder);
        } else if (itemViewType == ViewType.TITLE.ordinal()) {
            l lVar = (l) viewHolder;
            if (((i.a) getItem(i4)).f40033a.getIs_hot() == 1) {
                lVar.f40058a.setText("热门点评");
            } else {
                lVar.f40058a.setText("最新点评");
            }
            lVar.f40060c.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        if (i4 == ViewType.COMMENT.ordinal()) {
            return new g(LayoutInflater.from(this.f39976a).inflate(R.layout.comment_list_item_view, viewGroup, false));
        }
        if (i4 == ViewType.HEAD.ordinal()) {
            return new k(LayoutInflater.from(this.f39976a).inflate(R.layout.comment_list_head_view, viewGroup, false));
        }
        return new l(LayoutInflater.from(this.f39976a).inflate(R.layout.gamedetail_item_title, viewGroup, false));
    }

    public void p(int i4) {
        i.a aVar = (i.a) getItem(i4);
        long longValue = Long.valueOf(aVar.f40033a.getDespise_count()).longValue();
        aVar.f40033a.setIs_despise(0);
        long j4 = longValue - 1;
        if (j4 < 0) {
            aVar.f40033a.setDespise_count("0");
        } else {
            CommentBaseBean commentBaseBean = aVar.f40033a;
            commentBaseBean.setDespise_count(j4 + "");
        }
        notifyDataSetChanged();
    }

    public void q(int i4) {
        i.a aVar = (i.a) getItem(i4);
        long praise_count = aVar.f40033a.getPraise_count();
        aVar.f40033a.setIs_praise(0);
        long j4 = praise_count - 1;
        if (j4 < 0) {
            aVar.f40033a.setPraise_count(0L);
        } else {
            aVar.f40033a.setPraise_count(j4);
        }
        notifyDataSetChanged();
    }
}
