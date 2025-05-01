package com.join.mgps.dto;

import android.content.Context;
import android.view.View;
import com.join.mgps.adapter.ForumPostsAdapter;
import com.join.mgps.customview.ForumStickView;
import com.xuanyu.stickyheader.a;
/* loaded from: classes4.dex */
public class ForumStickyHeaderModel extends a<ForumPostsAdapter.e0> {
    @Override // com.xuanyu.stickyheader.a
    public View getStickyView(Context context) {
        ForumStickView forumStickView = new ForumStickView(context);
        if (context instanceof ForumStickView.e) {
            forumStickView.setForumStickViewListener((ForumStickView.e) context);
        }
        return forumStickView;
    }

    @Override // com.xuanyu.stickyheader.a
    public void onBindView(View view, ForumPostsAdapter.e0 e0Var) {
        ((ForumStickView) view).setData(e0Var);
    }
}
