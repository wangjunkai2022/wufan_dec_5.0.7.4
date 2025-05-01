package com.cpoopc.scrollablelayoutlib;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes2.dex */
public class ScrollableHelper {
    private ScrollableContainer mCurrentScrollableCainer;

    /* loaded from: classes2.dex */
    public interface ScrollableContainer {
        View getScrollableView();
    }

    private View getScrollableView() {
        ScrollableContainer scrollableContainer = this.mCurrentScrollableCainer;
        if (scrollableContainer == null) {
            return null;
        }
        return scrollableContainer.getScrollableView();
    }

    private static boolean isAdapterViewTop(AdapterView adapterView) {
        if (adapterView != null) {
            int firstVisiblePosition = adapterView.getFirstVisiblePosition();
            View childAt = adapterView.getChildAt(0);
            if (childAt == null) {
                return true;
            }
            if (firstVisiblePosition == 0 && childAt.getTop() == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean isRecyclerViewTop(RecyclerView recyclerView) {
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                View childAt = recyclerView.getChildAt(0);
                if (childAt == null) {
                    return true;
                }
                if (findFirstVisibleItemPosition == 0 && layoutManager.getDecoratedTop(childAt) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isScrollViewTop(ScrollView scrollView) {
        return scrollView != null && scrollView.getScrollY() <= 0;
    }

    private static boolean isWebViewTop(WebView webView) {
        return webView != null && webView.getScrollY() <= 0;
    }

    public boolean isTop() {
        View scrollableView = getScrollableView();
        if (scrollableView == null) {
            return true;
        }
        if (scrollableView instanceof AdapterView) {
            return isAdapterViewTop((AdapterView) scrollableView);
        }
        if (scrollableView instanceof ScrollView) {
            return isScrollViewTop((ScrollView) scrollableView);
        }
        if (scrollableView instanceof RecyclerView) {
            return isRecyclerViewTop((RecyclerView) scrollableView);
        }
        if (scrollableView instanceof WebView) {
            return isWebViewTop((WebView) scrollableView);
        }
        throw new IllegalStateException("scrollableView must be a instance of AdapterView|ScrollView|RecyclerView");
    }

    public void setCurrentScrollableContainer(ScrollableContainer scrollableContainer) {
        this.mCurrentScrollableCainer = scrollableContainer;
    }

    @SuppressLint({"NewApi"})
    public void smoothScrollBy(int i4, int i5, int i6) {
        View scrollableView = getScrollableView();
        if (scrollableView instanceof AbsListView) {
            AbsListView absListView = (AbsListView) scrollableView;
            if (Build.VERSION.SDK_INT >= 21) {
                absListView.fling(i4);
            } else {
                absListView.smoothScrollBy(i5, i6);
            }
        } else if (scrollableView instanceof ScrollView) {
            ((ScrollView) scrollableView).fling(i4);
        } else if (scrollableView instanceof RecyclerView) {
            ((RecyclerView) scrollableView).fling(0, i4);
        } else if (scrollableView instanceof WebView) {
            ((WebView) scrollableView).flingScroll(0, i4);
        }
    }
}
