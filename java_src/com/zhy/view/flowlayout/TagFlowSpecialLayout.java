package com.zhy.view.flowlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.join.mgps.activity.vipzone.bean.SpecialTag;
import com.join.mgps.customview.WrapContentGridView;
import com.zhy.view.flowlayout.TagFlowSpecialLayout;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public class TagFlowSpecialLayout extends WrapContentGridView {

    /* renamed from: b  reason: collision with root package name */
    SpecialTag f68634b;

    /* renamed from: c  reason: collision with root package name */
    List<SpecialTag> f68635c;

    /* renamed from: d  reason: collision with root package name */
    a f68636d;

    /* renamed from: e  reason: collision with root package name */
    b f68637e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a extends BaseAdapter {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zhy.view.flowlayout.TagFlowSpecialLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public class C0765a {

            /* renamed from: a  reason: collision with root package name */
            public TextView f68639a;

            C0765a() {
            }
        }

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(SpecialTag specialTag, C0765a c0765a, ViewGroup viewGroup, View view) {
            for (SpecialTag specialTag2 : TagFlowSpecialLayout.this.f68635c) {
                specialTag2.setIsselected(false);
            }
            specialTag.setIsselected(true);
            TagFlowSpecialLayout tagFlowSpecialLayout = TagFlowSpecialLayout.this;
            tagFlowSpecialLayout.f68634b = specialTag;
            b bVar = tagFlowSpecialLayout.f68637e;
            if (bVar != null) {
                bVar.a(c0765a.f68639a, specialTag, viewGroup);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<SpecialTag> list = TagFlowSpecialLayout.this.f68635c;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            List<SpecialTag> list = TagFlowSpecialLayout.this.f68635c;
            if (list != null) {
                return list.get(i4);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i4) {
            return super.getItemViewType(i4);
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, final ViewGroup viewGroup) {
            final C0765a c0765a;
            if (view != null) {
                c0765a = (C0765a) view.getTag();
            } else {
                c0765a = new C0765a();
                view = LayoutInflater.from(TagFlowSpecialLayout.this.getContext()).inflate(com.join.android.app.mgsim.wufun.R.layout.specialtag_item_layout1, (ViewGroup) null);
                c0765a.f68639a = (TextView) view;
                view.setTag(c0765a);
            }
            final SpecialTag specialTag = (SpecialTag) getItem(i4);
            if (specialTag.isIsselected()) {
                TagFlowSpecialLayout.this.f68634b = specialTag;
            }
            c0765a.f68639a.setText(specialTag.getTitle());
            c0765a.f68639a.setOnClickListener(new View.OnClickListener() { // from class: com.zhy.view.flowlayout.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    TagFlowSpecialLayout.a.this.b(specialTag, c0765a, viewGroup, view2);
                }
            });
            if (specialTag.isIsselected()) {
                c0765a.f68639a.setTextColor(TagFlowSpecialLayout.this.getResources().getColor(com.join.android.app.mgsim.wufun.R.color.app_blue_color));
                c0765a.f68639a.setBackgroundResource(com.join.android.app.mgsim.wufun.R.drawable.specialtag_selected_back);
            } else {
                c0765a.f68639a.setTextColor(TagFlowSpecialLayout.this.getResources().getColor(com.join.android.app.mgsim.wufun.R.color.money_text_color));
                c0765a.f68639a.setBackgroundResource(com.join.android.app.mgsim.wufun.R.drawable.alph);
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return super.getViewTypeCount();
        }
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a(View view, SpecialTag specialTag, ViewGroup viewGroup);
    }

    public TagFlowSpecialLayout(Context context) {
        super(context);
        this.f68635c = new ArrayList();
        this.f68636d = new a();
        a(context);
    }

    private void a(Context context) {
        setAdapter((ListAdapter) this.f68636d);
    }

    public void b() {
        a aVar = this.f68636d;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public List<SpecialTag> getData() {
        return this.f68635c;
    }

    public b getListener() {
        return this.f68637e;
    }

    public void setData(List<SpecialTag> list) {
        this.f68635c.clear();
        if (list == null) {
            return;
        }
        this.f68635c.addAll(list);
        a aVar = this.f68636d;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void setListener(b bVar) {
        this.f68637e = bVar;
    }

    @Override // android.widget.AdapterView
    public SpecialTag getSelectedItem() {
        return this.f68634b;
    }

    public TagFlowSpecialLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68635c = new ArrayList();
        this.f68636d = new a();
        a(context);
    }

    public TagFlowSpecialLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f68635c = new ArrayList();
        this.f68636d = new a();
        a(context);
    }
}
