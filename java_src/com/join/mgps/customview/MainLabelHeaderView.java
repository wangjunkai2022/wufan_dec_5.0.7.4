package com.join.mgps.customview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.label.MainLabelActivity;
import com.join.mgps.dto.MainLabelBean;
/* loaded from: classes4.dex */
public class MainLabelHeaderView extends ForumBaseHeaderView {

    /* renamed from: d  reason: collision with root package name */
    SimpleDraweeView f47388d;

    /* renamed from: e  reason: collision with root package name */
    TextView f47389e;

    /* renamed from: f  reason: collision with root package name */
    TextView f47390f;

    /* renamed from: g  reason: collision with root package name */
    RelativeLayout f47391g;

    /* renamed from: h  reason: collision with root package name */
    TextView f47392h;

    /* renamed from: i  reason: collision with root package name */
    ImageView f47393i;

    /* renamed from: j  reason: collision with root package name */
    View f47394j;

    /* renamed from: k  reason: collision with root package name */
    TextView f47395k;

    /* renamed from: l  reason: collision with root package name */
    boolean f47396l;

    /* renamed from: m  reason: collision with root package name */
    private View.OnClickListener f47397m;

    /* loaded from: classes4.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((MainLabelActivity) MainLabelHeaderView.this.getContext()).v0();
        }
    }

    public MainLabelHeaderView(@NonNull Context context) {
        super(context);
        this.f47396l = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f47397m.onClick(view);
    }

    public void d(String str) {
        TextView textView = this.f47395k;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public ImageView getPostsFilterSwitch() {
        return this.f47393i;
    }

    @Override // com.join.mgps.customview.ForumBaseHeaderView, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        LinearLayout.inflate(getContext(), R.layout.layout_main_label_header, this);
        this.f47388d = (SimpleDraweeView) findViewById(R.id.iv_label_icon);
        this.f47389e = (TextView) findViewById(R.id.tv_label_name);
        this.f47390f = (TextView) findViewById(R.id.tv_label_introduction);
        this.f47391g = (RelativeLayout) findViewById(R.id.rl_posts_filter);
        this.f47392h = (TextView) findViewById(R.id.tv_posts_filter_name);
        this.f47393i = (ImageView) findViewById(R.id.iv_posts_filter_switch);
        this.f47394j = findViewById(R.id.rl_last);
        this.f47393i.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.customview.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainLabelHeaderView.this.c(view);
            }
        });
        TextView textView = (TextView) findViewById(R.id.btnFocus);
        this.f47395k = textView;
        textView.setOnClickListener(new a());
    }

    public void setFilterVisibility(boolean z4, String str) {
        if (z4) {
            TextView textView = this.f47392h;
            textView.setText("显示小组“" + str + "”内容");
            this.f47391g.setVisibility(0);
            return;
        }
        this.f47391g.setVisibility(8);
    }

    public void setFocusVisibility(boolean z4) {
        if (this.f47396l != z4) {
            this.f47395k.setVisibility(z4 ? 0 : 8);
            this.f47396l = z4;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f47397m = onClickListener;
    }

    public void setViewData(MainLabelBean mainLabelBean) {
        MyImageLoader.h(this.f47388d, mainLabelBean.getTag_icon());
        TextView textView = this.f47389e;
        textView.setText("#" + mainLabelBean.getTag_name() + "#");
        if (TextUtils.isEmpty(mainLabelBean.getTag_desc())) {
            this.f47390f.setVisibility(8);
            return;
        }
        this.f47390f.setVisibility(0);
        this.f47390f.setText(mainLabelBean.getTag_desc());
    }

    public MainLabelHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47396l = true;
    }

    public MainLabelHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i4) {
        super(context, attributeSet, i4);
        this.f47396l = true;
    }
}
