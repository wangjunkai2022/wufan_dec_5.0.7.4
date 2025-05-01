package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.IntentUtil;
import com.join.mgps.Util.t2;
/* loaded from: classes4.dex */
public class ForumMyHeaderView extends ForumBaseHeaderView {

    /* renamed from: d  reason: collision with root package name */
    View f47073d;

    /* renamed from: e  reason: collision with root package name */
    View f47074e;

    public ForumMyHeaderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.customview.ForumBaseHeaderView
    public void a(Context context) {
        super.a(context);
        LinearLayout.inflate(getContext(), R.layout.mg_view_forum_my_header_view, this);
        this.f47073d = t2.b(this, R.id.llPost);
        this.f47074e = t2.b(this, R.id.llComment);
        this.f47073d.setOnClickListener(this);
        this.f47074e.setOnClickListener(this);
    }

    @Override // com.join.mgps.customview.ForumBaseHeaderView, android.view.View.OnClickListener
    public void onClick(View view) {
        super.onClick(view);
        int id = view.getId();
        if (id == R.id.llPost) {
            IntentUtil.getInstance().goForumMyPostsActivity(view.getContext());
        } else if (id == R.id.llComment) {
            IntentUtil.getInstance().goForumProfileCommentActivity(view.getContext());
        }
    }

    public ForumMyHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ForumMyHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i4) {
        super(context, attributeSet, i4);
    }
}
