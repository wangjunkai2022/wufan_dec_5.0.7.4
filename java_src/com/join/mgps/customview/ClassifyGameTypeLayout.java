package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.activity.ClassifyGameActivity_;
import com.join.mgps.dto.ClassifyGameTypeBean;
/* loaded from: classes4.dex */
public class ClassifyGameTypeLayout extends LinearLayout implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private SimpleDraweeView f46544b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f46545c;

    /* renamed from: d  reason: collision with root package name */
    private Context f46546d;

    /* renamed from: e  reason: collision with root package name */
    private ClassifyGameTypeBean f46547e;

    public ClassifyGameTypeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46546d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ClassifyGameActivity_.F0(this.f46546d).a(this.f46547e.getId()).b(0).c(this.f46547e.getTitle()).start();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f46544b = (SimpleDraweeView) findViewById(R.id.classify_game_img);
        this.f46545c = (TextView) findViewById(R.id.classify_game_name);
        setOnClickListener(this);
    }

    public void setClassifyGameTypeBean(ClassifyGameTypeBean classifyGameTypeBean) {
        if (classifyGameTypeBean != null) {
            this.f46547e = classifyGameTypeBean;
            MyImageLoader.h(this.f46544b, classifyGameTypeBean.getIco_remote());
            this.f46545c.setText(classifyGameTypeBean.getTitle());
        }
    }
}
