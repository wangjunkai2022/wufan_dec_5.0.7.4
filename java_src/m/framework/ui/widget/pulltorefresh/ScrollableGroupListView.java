package m.framework.ui.widget.pulltorefresh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
/* loaded from: classes7.dex */
public class ScrollableGroupListView extends GroupListView implements Scrollable {
    private OnScrollListener osListener;
    private boolean pullEnable;

    public ScrollableGroupListView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        setCacheColorHint(0);
        setSelector(new ColorDrawable());
        this.osListener = new OnScrollListener() { // from class: m.framework.ui.widget.pulltorefresh.ScrollableGroupListView.1
            @Override // m.framework.ui.widget.pulltorefresh.OnScrollListener
            public void onScrollChanged(Scrollable scrollable, int i4, int i5, int i6, int i7) {
                ScrollableGroupListView.this.pullEnable = i5 <= 0 && i7 <= 0;
            }
        };
    }

    @Override // android.widget.AbsListView, android.view.View
    protected int computeVerticalScrollOffset() {
        int computeVerticalScrollOffset = super.computeVerticalScrollOffset();
        OnScrollListener onScrollListener = this.osListener;
        if (onScrollListener != null) {
            onScrollListener.onScrollChanged(this, 0, computeVerticalScrollOffset, 0, 0);
        }
        return computeVerticalScrollOffset;
    }

    public boolean isReadyToPull() {
        return this.pullEnable;
    }

    public ScrollableGroupListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ScrollableGroupListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init(context);
    }
}
