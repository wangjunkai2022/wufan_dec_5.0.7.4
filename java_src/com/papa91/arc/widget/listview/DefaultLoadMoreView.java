package com.papa91.arc.widget.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.ppsspp.ppsspp.R;
/* loaded from: classes5.dex */
public class DefaultLoadMoreView extends RelativeLayout implements ILoadMoreView {
    private ProgressBar mPbLoading;
    private TextView mTvMessage;

    public DefaultLoadMoreView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        RelativeLayout.inflate(context, R.layout.loading_view_final_footer_default, this);
        this.mPbLoading = (ProgressBar) findViewById(R.id.pb_loading);
        this.mTvMessage = (TextView) findViewById(R.id.tv_loading_msg);
    }

    @Override // com.papa91.arc.widget.listview.ILoadMoreView
    public View getFooterView() {
        return this;
    }

    @Override // com.papa91.arc.widget.listview.ILoadMoreView
    public void showFail() {
        this.mPbLoading.setVisibility(8);
        this.mTvMessage.setText(R.string.loading_view_net_error);
    }

    @Override // com.papa91.arc.widget.listview.ILoadMoreView
    public void showLoading() {
        this.mPbLoading.setVisibility(0);
        this.mTvMessage.setText(R.string.loading_view_loading);
    }

    @Override // com.papa91.arc.widget.listview.ILoadMoreView
    public void showNoMore() {
        this.mPbLoading.setVisibility(8);
        this.mTvMessage.setText(R.string.loading_view_no_more);
    }

    @Override // com.papa91.arc.widget.listview.ILoadMoreView
    public void showNormal() {
        this.mPbLoading.setVisibility(8);
        this.mTvMessage.setText(R.string.loading_view_click_loading_more);
    }

    public DefaultLoadMoreView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public DefaultLoadMoreView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init(context);
    }
}
