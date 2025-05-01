package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.g2;
import com.join.mgps.Util.t2;
import com.join.mgps.adapter.ForumBaseAdapter;
import com.join.mgps.dto.ForumBean;
import com.join.mgps.dto.ForumData;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class ForumGroupHeaderView extends ForumBaseHeaderView {

    /* renamed from: d  reason: collision with root package name */
    SimpleDraweeView f47005d;

    /* renamed from: e  reason: collision with root package name */
    TextView f47006e;

    /* renamed from: f  reason: collision with root package name */
    TextView f47007f;

    /* renamed from: g  reason: collision with root package name */
    View f47008g;

    /* renamed from: h  reason: collision with root package name */
    View f47009h;

    /* renamed from: i  reason: collision with root package name */
    SimpleDraweeView f47010i;

    /* renamed from: j  reason: collision with root package name */
    SimpleDraweeView f47011j;

    /* renamed from: k  reason: collision with root package name */
    SimpleDraweeView f47012k;

    /* renamed from: l  reason: collision with root package name */
    SimpleDraweeView f47013l;

    /* renamed from: m  reason: collision with root package name */
    SimpleDraweeView f47014m;

    /* renamed from: n  reason: collision with root package name */
    TextView f47015n;

    /* renamed from: o  reason: collision with root package name */
    TextView f47016o;

    /* renamed from: p  reason: collision with root package name */
    WrapContentListView f47017p;

    /* renamed from: q  reason: collision with root package name */
    View f47018q;

    /* renamed from: r  reason: collision with root package name */
    ForumBaseAdapter f47019r;

    /* renamed from: s  reason: collision with root package name */
    private ArrayList<Object> f47020s;

    /* renamed from: t  reason: collision with root package name */
    private ForumData.ForumGroupIndex f47021t;

    public ForumGroupHeaderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.customview.ForumBaseHeaderView
    public void a(Context context) {
        super.a(context);
        LinearLayout.inflate(getContext(), R.layout.mg_view_forum_group_header, this);
        this.f47005d = (SimpleDraweeView) t2.b(this, R.id.icon);
        this.f47006e = (TextView) t2.b(this, R.id.name);
        this.f47007f = (TextView) t2.b(this, R.id.desc);
        this.f47008g = t2.b(this, R.id.arrow);
        this.f47009h = t2.b(this, R.id.arrowParent);
        this.f47010i = (SimpleDraweeView) t2.b(this, R.id.img1);
        this.f47011j = (SimpleDraweeView) t2.b(this, R.id.img2);
        this.f47012k = (SimpleDraweeView) t2.b(this, R.id.img3);
        this.f47013l = (SimpleDraweeView) t2.b(this, R.id.img4);
        this.f47014m = (SimpleDraweeView) t2.b(this, R.id.img5);
        this.f47015n = (TextView) t2.b(this, R.id.count);
        this.f47016o = (TextView) t2.b(this, R.id.follow);
        this.f47017p = (WrapContentListView) t2.b(this, R.id.wrapListView);
        this.f47018q = t2.b(this, R.id.memberLL);
        this.f47008g.setOnClickListener(this);
        this.f47009h.setOnClickListener(this);
        this.f47018q.setOnClickListener(this);
        this.f47016o.setOnClickListener(this);
        ForumBaseAdapter forumBaseAdapter = new ForumBaseAdapter(getContext(), null);
        this.f47019r = forumBaseAdapter;
        this.f47017p.setAdapter((ListAdapter) forumBaseAdapter);
    }

    public boolean b() {
        ForumData.ForumGroupIndex forumGroupIndex = this.f47021t;
        return forumGroupIndex != null && forumGroupIndex.getIs_joined() == 1;
    }

    @Override // com.join.mgps.customview.ForumBaseHeaderView, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        int id = view.getId();
        if (id != R.id.memberLL && id == R.id.arrowParent) {
            if (this.f47008g.isSelected()) {
                this.f47007f.setVisibility(0);
                this.f47008g.setSelected(false);
                return;
            }
            this.f47007f.setVisibility(8);
            this.f47008g.setSelected(true);
        }
    }

    public void setData(ForumData.ForumGroupIndex forumGroupIndex) {
        if (forumGroupIndex == null) {
            return;
        }
        this.f47021t = forumGroupIndex;
        MyImageLoader.h(this.f47005d, forumGroupIndex.getForum_icon());
        this.f47006e.setText(forumGroupIndex.getForum_name());
        this.f47007f.setText(forumGroupIndex.getForum_description());
        int parseInt = TextUtils.isEmpty(forumGroupIndex.getForum_number()) ? 0 : Integer.parseInt(forumGroupIndex.getForum_number());
        TextView textView = this.f47015n;
        textView.setText(com.join.mgps.Util.j0.R(parseInt) + "");
        setJoinState(forumGroupIndex.getIs_joined() == 1);
        SimpleDraweeView[] simpleDraweeViewArr = {this.f47010i, this.f47011j, this.f47012k, this.f47013l, this.f47014m};
        for (int i4 = 0; i4 < 5; i4++) {
            SimpleDraweeView simpleDraweeView = simpleDraweeViewArr[i4];
            if (forumGroupIndex.getLast_joied() != null && i4 < forumGroupIndex.getLast_joied().size()) {
                simpleDraweeView.setVisibility(0);
                simpleDraweeView.getHierarchy().y(new com.facebook.drawee.drawable.n(Color.parseColor("#FFFFFF")));
                MyImageLoader.x(simpleDraweeView, forumGroupIndex.getLast_joied().get(i4));
            } else {
                simpleDraweeView.setVisibility(8);
            }
        }
        setTopPosts(forumGroupIndex.getTop_posts());
    }

    public void setJoinState(boolean z4) {
        if (z4) {
            this.f47016o.setSelected(true);
            this.f47016o.setText("已加入");
            if (!this.f47008g.isSelected()) {
                this.f47009h.performClick();
            }
        } else {
            this.f47016o.setSelected(false);
            this.f47016o.setText("加入小组");
        }
        ForumData.ForumGroupIndex forumGroupIndex = this.f47021t;
        if (forumGroupIndex != null) {
            forumGroupIndex.setIs_joined(z4 ? 1 : 0);
        }
    }

    public void setTopPosts(List<ForumBean.ForumPostsBean> list) {
        if (list == null) {
            return;
        }
        if (this.f47020s == null) {
            this.f47020s = new ArrayList<>();
        }
        this.f47019r.x().clear();
        this.f47020s.clear();
        this.f47020s.addAll(list);
        for (int i4 = 0; i4 < this.f47020s.size(); i4++) {
            ForumBean.ForumPostsBean forumPostsBean = list.get(i4);
            this.f47019r.f(new ForumBaseAdapter.r1(ForumBaseAdapter.ViewType.POST_TOP, new ForumBaseAdapter.r1.b0(forumPostsBean.getPid(), g2.h(forumPostsBean.getSubject()) ? forumPostsBean.getMessage() : forumPostsBean.getSubject(), forumPostsBean.getBest() > 0, forumPostsBean.isAttach_pic(), forumPostsBean.isAttach_video(), forumPostsBean.getTag_info())));
        }
        this.f47019r.notifyDataSetChanged();
    }

    public ForumGroupHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ForumGroupHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i4) {
        super(context, attributeSet, i4);
    }
}
