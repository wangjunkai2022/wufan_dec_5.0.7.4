package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.adapter.ForumPostsAdapter;
/* loaded from: classes4.dex */
public class ForumStickView extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    TextView f47075b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f47076c;

    /* renamed from: d  reason: collision with root package name */
    TextView f47077d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f47078e;

    /* renamed from: f  reason: collision with root package name */
    e f47079f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f47080g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumStickView.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumStickView.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumStickView.this.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ForumStickView.this.d();
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        void H();

        void Z();
    }

    public ForumStickView(@NonNull Context context) {
        super(context);
        this.f47080g = false;
        c(context);
    }

    private void c(Context context) {
        LayoutInflater.from(context).inflate(R.layout.layout_forum_stick_view, this);
        this.f47075b = (TextView) findViewById(R.id.view_poster);
        this.f47078e = (ImageView) findViewById(R.id.iv_view_poster);
        this.f47076c = (ImageView) findViewById(R.id.iv_sort);
        this.f47077d = (TextView) findViewById(R.id.tv_sort);
        this.f47075b.setOnClickListener(new a());
        this.f47078e.setOnClickListener(new b());
        this.f47076c.setOnClickListener(new c());
        this.f47077d.setOnClickListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        e eVar = this.f47079f;
        if (eVar != null) {
            eVar.Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        boolean z4 = !this.f47080g;
        this.f47080g = z4;
        this.f47078e.setImageResource(z4 ? R.drawable.ic_forum_detail_check_h : R.drawable.ic_forum_detail_check_n);
        e eVar = this.f47079f;
        if (eVar != null) {
            eVar.H();
        }
    }

    public void setData(ForumPostsAdapter.e0 e0Var) {
    }

    public void setForumStickViewListener(e eVar) {
        this.f47079f = eVar;
    }

    public ForumStickView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47080g = false;
        c(context);
    }

    public ForumStickView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47080g = false;
        c(context);
    }
}
