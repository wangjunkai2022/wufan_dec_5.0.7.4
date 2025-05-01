package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.bykv.vk.openvk.api.proto.EventListener;
import com.bykv.vv.vv.vv.vv.a;
import com.bykv.vv.vv.vv.vv.b;
/* loaded from: classes2.dex */
public class DislikeListView extends ListView {
    private EventListener mOnItemClickBridge;
    private AdapterView.OnItemClickListener mOnItemClickListener;
    private AdapterView.OnItemClickListener mOnItemClickListenerInner;

    public DislikeListView(Context context) {
        super(context);
        this.mOnItemClickListenerInner = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.DislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                if (DislikeListView.this.getAdapter() != null && DislikeListView.this.getAdapter().getItem(i4) != null && (DislikeListView.this.getAdapter().getItem(i4) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) DislikeListView.this.getAdapter().getItem(i4);
                    if (filterWord.hasSecondOptions()) {
                        return;
                    }
                    if (DislikeListView.this.mOnItemClickListener != null) {
                        DislikeListView.this.mOnItemClickListener.onItemClick(adapterView, view, i4, j4);
                    }
                    if (DislikeListView.this.mOnItemClickBridge != null) {
                        DislikeListView.this.mOnItemClickBridge.onEvent(0, b.b().d(a.b().i(0, filterWord.getId()).i(1, filterWord.getName()).a()).a());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("adapter数据异常，必须为FilterWord");
            }
        };
        init();
    }

    private void init() {
        super.setOnItemClickListener(this.mOnItemClickListenerInner);
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        if (onItemClickListener instanceof EventListener) {
            this.mOnItemClickBridge = (EventListener) onItemClickListener;
        } else {
            this.mOnItemClickListener = onItemClickListener;
        }
    }

    public DislikeListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mOnItemClickListenerInner = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.DislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                if (DislikeListView.this.getAdapter() != null && DislikeListView.this.getAdapter().getItem(i4) != null && (DislikeListView.this.getAdapter().getItem(i4) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) DislikeListView.this.getAdapter().getItem(i4);
                    if (filterWord.hasSecondOptions()) {
                        return;
                    }
                    if (DislikeListView.this.mOnItemClickListener != null) {
                        DislikeListView.this.mOnItemClickListener.onItemClick(adapterView, view, i4, j4);
                    }
                    if (DislikeListView.this.mOnItemClickBridge != null) {
                        DislikeListView.this.mOnItemClickBridge.onEvent(0, b.b().d(a.b().i(0, filterWord.getId()).i(1, filterWord.getName()).a()).a());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("adapter数据异常，必须为FilterWord");
            }
        };
        init();
    }

    public DislikeListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mOnItemClickListenerInner = new AdapterView.OnItemClickListener() { // from class: com.bytedance.sdk.openadsdk.DislikeListView.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i42, long j4) {
                if (DislikeListView.this.getAdapter() != null && DislikeListView.this.getAdapter().getItem(i42) != null && (DislikeListView.this.getAdapter().getItem(i42) instanceof FilterWord)) {
                    FilterWord filterWord = (FilterWord) DislikeListView.this.getAdapter().getItem(i42);
                    if (filterWord.hasSecondOptions()) {
                        return;
                    }
                    if (DislikeListView.this.mOnItemClickListener != null) {
                        DislikeListView.this.mOnItemClickListener.onItemClick(adapterView, view, i42, j4);
                    }
                    if (DislikeListView.this.mOnItemClickBridge != null) {
                        DislikeListView.this.mOnItemClickBridge.onEvent(0, b.b().d(a.b().i(0, filterWord.getId()).i(1, filterWord.getName()).a()).a());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("adapter数据异常，必须为FilterWord");
            }
        };
        init();
    }
}
