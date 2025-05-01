package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.AccountUtil_;
import com.join.mgps.Util.IntentDateBean;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.t2;
import com.join.mgps.activity.LocalGameActivity;
import com.join.mgps.adapter.ForumBaseAdapter;
import com.join.mgps.dto.BannerBean;
import com.join.mgps.dto.ExtBean;
import com.join.mgps.dto.RecommenGroup;
import com.join.mgps.dto.RecommendLabelTag;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumIndexHeaderView extends LinearLayout implements View.OnClickListener {
    ForumBaseAdapter A;
    private List<RecommendLabelTag> B;
    private List<RecommenGroup> C;
    Animation D;
    LinearLayout.LayoutParams E;
    List<Integer> F;
    View.OnClickListener G;
    c H;

    /* renamed from: b  reason: collision with root package name */
    ViewPagerWithADs f47022b;

    /* renamed from: c  reason: collision with root package name */
    View f47023c;

    /* renamed from: d  reason: collision with root package name */
    TextView f47024d;

    /* renamed from: e  reason: collision with root package name */
    View f47025e;

    /* renamed from: f  reason: collision with root package name */
    TextView f47026f;

    /* renamed from: g  reason: collision with root package name */
    WrapContentListView f47027g;

    /* renamed from: h  reason: collision with root package name */
    TextView f47028h;

    /* renamed from: i  reason: collision with root package name */
    View f47029i;

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f47030j;

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f47031k;

    /* renamed from: l  reason: collision with root package name */
    View f47032l;

    /* renamed from: m  reason: collision with root package name */
    View f47033m;

    /* renamed from: n  reason: collision with root package name */
    MyFlowLayout f47034n;

    /* renamed from: o  reason: collision with root package name */
    View f47035o;

    /* renamed from: p  reason: collision with root package name */
    View f47036p;

    /* renamed from: q  reason: collision with root package name */
    TextView f47037q;

    /* renamed from: r  reason: collision with root package name */
    View f47038r;

    /* renamed from: s  reason: collision with root package name */
    View f47039s;

    /* renamed from: t  reason: collision with root package name */
    View f47040t;

    /* renamed from: u  reason: collision with root package name */
    SimpleDraweeView f47041u;

    /* renamed from: v  reason: collision with root package name */
    SimpleDraweeView f47042v;

    /* renamed from: w  reason: collision with root package name */
    SimpleDraweeView f47043w;

    /* renamed from: x  reason: collision with root package name */
    SimpleDraweeView f47044x;

    /* renamed from: y  reason: collision with root package name */
    private List<BannerBean> f47045y;

    /* renamed from: z  reason: collision with root package name */
    private volatile List<RecommenGroup> f47046z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IntentDateBean f47047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f47048c;

        a(IntentDateBean intentDateBean, int i4) {
            this.f47047b = intentDateBean;
            this.f47048c = i4;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context = view.getContext();
            if (this.f47047b == null) {
                return;
            }
            IntentUtil.getInstance().intentActivity(context, this.f47047b);
            com.papa.sim.statistic.p l4 = com.papa.sim.statistic.p.l(context);
            l4.u0("banner1-" + (this.f47048c + 1), AccountUtil_.getInstance_(context).getUid());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ RecommendLabelTag f47050b;

        b(RecommendLabelTag recommendLabelTag) {
            this.f47050b = recommendLabelTag;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean isSelected = view.isSelected();
            view.setSelected(!isSelected);
            if (isSelected) {
                if (ForumIndexHeaderView.this.F.contains(Integer.valueOf(this.f47050b.getTag_id()))) {
                    ForumIndexHeaderView.this.F.remove(Integer.valueOf(this.f47050b.getTag_id()));
                }
            } else {
                ForumIndexHeaderView.this.F.add(Integer.valueOf(this.f47050b.getTag_id()));
            }
            if (ForumIndexHeaderView.this.F.size() >= 3) {
                ForumIndexHeaderView forumIndexHeaderView = ForumIndexHeaderView.this;
                forumIndexHeaderView.f47037q.setText(forumIndexHeaderView.getResources().getString(R.string.forum_label_recomm));
                ForumIndexHeaderView.this.f47037q.setEnabled(true);
                return;
            }
            ForumIndexHeaderView forumIndexHeaderView2 = ForumIndexHeaderView.this;
            forumIndexHeaderView2.f47037q.setText(forumIndexHeaderView2.getResources().getString(R.string.forum_label_recomm_disable));
            ForumIndexHeaderView.this.f47037q.setEnabled(false);
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void h(int i4);
    }

    public ForumIndexHeaderView(@NonNull Context context) {
        super(context);
        this.F = new ArrayList();
        this.G = null;
        a(context);
    }

    private void a(Context context) {
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.mg_view_forum_index_header, this);
        this.f47022b = (ViewPagerWithADs) t2.b(this, R.id.ad_viewpager);
        this.f47023c = t2.b(this, R.id.section_follow);
        this.f47024d = (TextView) t2.b(this, R.id.title);
        this.f47025e = t2.b(this, R.id.more);
        this.f47026f = (TextView) t2.b(this, R.id.moreTv);
        this.f47027g = (WrapContentListView) t2.b(this, R.id.wrapListView);
        this.f47028h = (TextView) t2.b(this, R.id.forum_more);
        this.f47029i = t2.b(this, R.id.llForumMore);
        this.f47030j = (LinearLayout) t2.b(this, R.id.rlTagFollow);
        this.f47031k = (LinearLayout) t2.b(this, R.id.rlTagFollowB);
        this.f47033m = t2.b(this, R.id.forumExtFunc);
        this.f47032l = t2.b(this, R.id.rlTagTip);
        this.f47034n = (MyFlowLayout) t2.b(this, R.id.flowLayout);
        this.f47035o = t2.b(this, R.id.refreshTag);
        this.f47036p = t2.b(this, R.id.ivRefresh);
        this.f47037q = (TextView) t2.b(this, R.id.forumRecomm);
        this.f47039s = t2.b(this, R.id.llMyForum);
        this.f47040t = t2.b(this, R.id.llGroupAll);
        this.f47038r = t2.b(this, R.id.rlAdParent);
        this.f47041u = (SimpleDraweeView) t2.b(this, R.id.layout_forum_ad_1);
        this.f47042v = (SimpleDraweeView) t2.b(this, R.id.layout_forum_ad_2);
        this.f47043w = (SimpleDraweeView) t2.b(this, R.id.layout_forum_ad_3);
        this.f47044x = (SimpleDraweeView) t2.b(this, R.id.layout_forum_ad_4);
        this.f47035o.setOnClickListener(this);
        this.f47037q.setOnClickListener(this);
        this.f47033m.setOnClickListener(this);
        this.f47025e.setOnClickListener(this);
        this.f47028h.setOnClickListener(this);
        this.f47029i.setOnClickListener(this);
        this.f47039s.setOnClickListener(this);
        this.f47040t.setOnClickListener(this);
        ForumBaseAdapter forumBaseAdapter = new ForumBaseAdapter(getContext(), null);
        this.A = forumBaseAdapter;
        this.f47027g.setAdapter((ListAdapter) forumBaseAdapter);
        g();
    }

    private boolean b() {
        List<RecommenGroup> list = this.C;
        return list != null && list.size() > 0;
    }

    private View c(RecommendLabelTag recommendLabelTag) {
        View inflate = LinearLayout.inflate(getContext(), R.layout.forum_group_tag_item1, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.rightMargin = (int) TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, getResources().getDisplayMetrics());
        inflate.setLayoutParams(marginLayoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.tagTv);
        if (textView == null) {
            return null;
        }
        textView.setText("#" + recommendLabelTag.getTag_name() + "#");
        textView.setOnClickListener(new b(recommendLabelTag));
        if (this.F.contains(Integer.valueOf(recommendLabelTag.getTag_id()))) {
            textView.setSelected(true);
        }
        return inflate;
    }

    private void d() {
        if (this.B == null) {
            return;
        }
        this.f47034n.removeAllViews();
        for (RecommendLabelTag recommendLabelTag : this.B) {
            View c5 = c(recommendLabelTag);
            if (c5 != null) {
                this.f47034n.addView(c5);
            }
        }
        this.f47034n.invalidate();
    }

    private void f(SimpleDraweeView simpleDraweeView, BannerBean bannerBean, int i4) {
        if (bannerBean == null || simpleDraweeView == null) {
            return;
        }
        MyImageLoader.j(simpleDraweeView, bannerBean.getPic_remote(), MyImageLoader.z(simpleDraweeView.getContext()));
        if (this.E == null) {
            float f5 = getResources().getDisplayMetrics().density;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) simpleDraweeView.getLayoutParams();
            int i5 = ((int) (getResources().getDisplayMetrics().widthPixels - (f5 * 18.0f))) / 2;
            layoutParams.width = i5;
            layoutParams.height = (int) ((i5 * 1.0f) / 2.07f);
            this.E = layoutParams;
        }
        simpleDraweeView.setLayoutParams(this.E);
        IntentDateBean j02 = com.join.mgps.Util.j0.j0(bannerBean);
        ExtBean extBean = new ExtBean();
        extBean.setFrom("forum");
        extBean.setPosition(MediationConstant.RIT_TYPE_BANNER + (i4 + 1));
        j02.setExtBean(extBean);
        simpleDraweeView.setOnClickListener(new a(j02, i4));
    }

    private void setBanner(List<BannerBean> list) {
        if (this.f47045y == null) {
            this.f47045y = new ArrayList();
        }
        this.f47045y.clear();
        if (list != null) {
            this.f47045y.addAll(list);
        }
        SimpleDraweeView[] simpleDraweeViewArr = {this.f47041u, this.f47042v, this.f47043w, this.f47044x};
        int i4 = 0;
        while (true) {
            List<BannerBean> list2 = this.f47045y;
            if (list2 == null || i4 >= list2.size()) {
                break;
            }
            SimpleDraweeView simpleDraweeView = simpleDraweeViewArr[i4];
            f(simpleDraweeView, this.f47045y.get(i4), i4);
            if (i4 == 1 || i4 == 3) {
                try {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(simpleDraweeView.getLayoutParams().width, simpleDraweeView.getLayoutParams().height);
                    layoutParams.setMargins((int) (simpleDraweeView.getResources().getDisplayMetrics().density * 6.0f), 0, 0, 0);
                    simpleDraweeView.setLayoutParams(layoutParams);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            i4++;
        }
        List<BannerBean> list3 = this.f47045y;
        if (list3 == null) {
            this.f47038r.setVisibility(8);
        } else if (list3.size() < 2) {
            this.f47038r.setVisibility(8);
        } else if (this.f47045y.size() < 4) {
            ViewGroup viewGroup = (ViewGroup) simpleDraweeViewArr[2].getParent();
            viewGroup.setVisibility(8);
            ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).topMargin = 0;
        }
    }

    private void setBanner1(List<BannerBean> list) {
        if (this.f47022b == null) {
            return;
        }
        if (list != null && list.size() > 0) {
            if (this.f47045y == null) {
                this.f47045y = new ArrayList();
            }
            this.f47045y.clear();
            this.f47045y.addAll(list);
            if (this.f47022b.getVisibility() == 8) {
                this.f47022b.setVisibility(0);
            }
            this.f47022b.setAll(getContext(), this.f47045y, (int) getResources().getDimension(R.dimen.wdp25), (int) getResources().getDimension(R.dimen.wdp62), 4000, 1);
            return;
        }
        this.f47022b.setVisibility(8);
    }

    void e() {
        if (!b()) {
            this.f47024d.setText("推荐小组");
            this.f47026f.setText(LocalGameActivity.f34225s);
            this.f47028h.setText("发现更多小组");
            return;
        }
        this.f47024d.setText("我的小组");
        this.f47026f.setText(LocalGameActivity.f34225s);
        this.f47028h.setText("发现更多小组");
    }

    void g() {
        if (this.f47045y != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f47045y);
            setBanner(arrayList);
        }
    }

    public String getSelectedIds() {
        int i4 = 0;
        String str = "";
        while (true) {
            List<Integer> list = this.F;
            if (list == null || i4 >= list.size()) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.F.get(i4));
            sb.append(i4 == this.F.size() + (-1) ? "" : ",");
            str = sb.toString();
            i4++;
        }
        return str;
    }

    public List<Integer> getSelectedLabel() {
        return this.F;
    }

    public c getmOnMeasureHeight() {
        return this.H;
    }

    public void h() {
        if (this.f47036p == null) {
            return;
        }
        if (this.D == null) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -360.0f, 1, 0.5f, 1, 0.5f);
            this.D = rotateAnimation;
            rotateAnimation.setDuration(300L);
            this.D.setRepeatCount(-1);
            this.D.setRepeatMode(1);
        }
        this.f47036p.startAnimation(this.D);
    }

    public void i() {
        View view = this.f47036p;
        if (view == null || this.D == null) {
            return;
        }
        view.clearAnimation();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        View.OnClickListener onClickListener = this.G;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        if (id == R.id.forumExtFunc) {
            setLabelsTipVisibility(8);
            com.join.mgps.pref.h.n(getContext()).r0(false);
        } else if (id == R.id.more) {
            if (!b()) {
                IntentUtil.getInstance().goForumGroupActivity(getContext());
            } else {
                IntentUtil.getInstance().goForumMyDynamicActivity(getContext());
            }
        } else if (id == R.id.llMyForum) {
            IntentUtil.getInstance().goForumMyDynamicActivity(getContext());
        } else if (id == R.id.llForumMore || id == R.id.llGroupAll) {
            IntentUtil.getInstance().goForumGroupActivity(getContext());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        super.onMeasure(i4, i5);
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i4, i5);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int i10 = layoutParams2.leftMargin;
                    i7 = layoutParams2.topMargin;
                    i6 = layoutParams2.bottomMargin;
                } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams;
                    int i11 = layoutParams3.leftMargin;
                    i7 = layoutParams3.topMargin;
                    i6 = layoutParams3.bottomMargin;
                } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams;
                    int i12 = layoutParams4.leftMargin;
                    i7 = layoutParams4.topMargin;
                    i6 = layoutParams4.bottomMargin;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                childAt.getMeasuredWidth();
                i8 += childAt.getMeasuredHeight() + i7 + i6;
            }
        }
        if (mode != 1073741824) {
            size = 0;
        }
        if (mode2 != 1073741824) {
            size2 = i8;
        }
        setMeasuredDimension(size, size2);
        if (this.H != null) {
            this.H.h(i8 + (getLayoutParams() instanceof RelativeLayout.LayoutParams ? ((RelativeLayout.LayoutParams) getLayoutParams()).bottomMargin : 0));
        }
    }

    public void setBannerData(List<BannerBean> list) {
        setBanner(list);
    }

    public void setHeaderClickListener(View.OnClickListener onClickListener) {
        this.G = onClickListener;
    }

    public synchronized void setHomepageRecommendGroup(List<RecommenGroup> list) {
        if (list == null) {
            return;
        }
        if (this.f47046z == null) {
            this.f47046z = new ArrayList();
        }
        this.A.x().clear();
        this.f47046z.clear();
        if (b()) {
            this.f47046z.addAll(this.C);
        } else {
            this.f47046z.addAll(list);
        }
        boolean z4 = !AccountUtil_.getInstance_(getContext()).isTourist();
        e();
        for (int i4 = 0; i4 < this.f47046z.size(); i4++) {
            RecommenGroup recommenGroup = this.f47046z.get(i4);
            this.A.f(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.GROUP_ITEM, new ForumBaseAdapter.r1.d0(recommenGroup.getIcon_src(), recommenGroup.getName(), recommenGroup.getDescription(), z4, recommenGroup.getToday_posts(), recommenGroup.getFid(), b())));
        }
        this.A.notifyDataSetChanged();
    }

    public void setHomepageRecommendGroupMy(List<RecommenGroup> list) {
        this.C = list;
    }

    public void setHomepageRecommendLabel(List<RecommendLabelTag> list) {
        if (list == null) {
            return;
        }
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.clear();
        this.B.addAll(list);
        d();
    }

    public void setLabelsTipVisibility(int i4) {
        if (!com.join.mgps.pref.h.n(getContext()).D()) {
            this.f47032l.setVisibility(8);
        } else {
            this.f47032l.setVisibility(i4);
        }
    }

    public void setLabelsVisibility(int i4) {
        this.f47030j.setVisibility(i4);
        this.f47034n.setVisibility(i4);
        this.f47031k.setVisibility(i4);
    }

    public void setNoForumBanner() {
        ViewPagerWithADs viewPagerWithADs;
        List<BannerBean> list = this.f47045y;
        if ((list == null || list.size() == 0) && (viewPagerWithADs = this.f47022b) != null) {
            viewPagerWithADs.setVisibility(8);
        }
    }

    public void setmOnMeasureHeight(c cVar) {
        this.H = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        if (getOrientation() == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (getOrientation() == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return super.generateDefaultLayoutParams();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (getOrientation() == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (getOrientation() == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return super.generateLayoutParams(layoutParams);
    }

    public ForumIndexHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F = new ArrayList();
        this.G = null;
        a(context);
    }

    public ForumIndexHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i4) {
        super(context, attributeSet, i4);
        this.F = new ArrayList();
        this.G = null;
        a(context);
    }
}
