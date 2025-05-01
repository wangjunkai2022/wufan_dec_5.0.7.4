package com.join.mgps.activity.screenshot;

import a1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.widget.MsgView;
import com.join.android.app.mgsim.wufun.R;
import java.util.ArrayList;
import java.util.Collections;
/* loaded from: classes4.dex */
public class SlidingTabLayoutScreenShort extends HorizontalScrollView implements ViewPager.OnPageChangeListener {
    private static final int STYLE_BLOCK = 2;
    private static final int STYLE_NORMAL = 0;
    private static final int STYLE_TRIANGLE = 1;
    private static final int TEXT_BOLD_BOTH = 2;
    private static final int TEXT_BOLD_NONE = 0;
    private static final int TEXT_BOLD_WHEN_SELECT = 1;
    private Context mContext;
    private float mCurrentPositionOffset;
    private int mCurrentTab;
    private int mDividerColor;
    private float mDividerPadding;
    private Paint mDividerPaint;
    private float mDividerWidth;
    private int mHeight;
    private int mIndicatorColor;
    private float mIndicatorCornerRadius;
    private GradientDrawable mIndicatorDrawable;
    private int mIndicatorGravity;
    private float mIndicatorHeight;
    private float mIndicatorMarginBottom;
    private float mIndicatorMarginLeft;
    private float mIndicatorMarginRight;
    private float mIndicatorMarginTop;
    private Rect mIndicatorRect;
    private int mIndicatorStyle;
    private float mIndicatorWidth;
    private boolean mIndicatorWidthEqualTitle;
    private SparseArray<Boolean> mInitSetMap;
    private int mLastScrollX;
    private b mListener;
    private Paint mRectPaint;
    private boolean mSnapOnTabClick;
    private int mTabCount;
    private float mTabPadding;
    private Rect mTabRect;
    private boolean mTabSpaceEqual;
    private float mTabWidth;
    private LinearLayout mTabsContainer;
    private boolean mTextAllCaps;
    private int mTextBold;
    private Paint mTextPaint;
    private int mTextSelectColor;
    private int mTextUnselectColor;
    private float mTextsize;
    private ArrayList<String> mTitles;
    private Paint mTrianglePaint;
    private Path mTrianglePath;
    private int mUnderlineColor;
    private int mUnderlineGravity;
    private float mUnderlineHeight;
    private ViewPager mViewPager;
    private float margin;

    /* loaded from: classes4.dex */
    class InnerPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragments;
        private String[] titles;

        public InnerPagerAdapter(FragmentManager fragmentManager, ArrayList<Fragment> arrayList, String[] strArr) {
            super(fragmentManager);
            this.fragments = new ArrayList<>();
            this.fragments = arrayList;
            this.titles = strArr;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.fragments.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i4) {
            return this.fragments.get(i4);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public CharSequence getPageTitle(int i4) {
            return this.titles[i4];
        }
    }

    public SlidingTabLayoutScreenShort(Context context) {
        this(context, null, 0);
    }

    private void addTab(int i4, String str, View view) {
        LinearLayout.LayoutParams layoutParams;
        TextView textView = (TextView) view.findViewById(R.id.tv_tab_title);
        if (textView != null && str != null) {
            textView.setText(str);
        }
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        view.setOnClickListener(new View.OnClickListener() { // from class: com.join.mgps.activity.screenshot.SlidingTabLayoutScreenShort.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int indexOfChild = SlidingTabLayoutScreenShort.this.mTabsContainer.indexOfChild(view2);
                if (indexOfChild != -1) {
                    if (SlidingTabLayoutScreenShort.this.mViewPager.getCurrentItem() != indexOfChild) {
                        if (SlidingTabLayoutScreenShort.this.mSnapOnTabClick) {
                            SlidingTabLayoutScreenShort.this.mViewPager.setCurrentItem(indexOfChild, false);
                        } else {
                            SlidingTabLayoutScreenShort.this.mViewPager.setCurrentItem(indexOfChild);
                        }
                        if (SlidingTabLayoutScreenShort.this.mListener != null) {
                            SlidingTabLayoutScreenShort.this.mListener.onTabSelect(indexOfChild);
                        }
                    } else if (SlidingTabLayoutScreenShort.this.mListener != null) {
                        SlidingTabLayoutScreenShort.this.mListener.onTabReselect(indexOfChild);
                    }
                }
            }
        });
        if (this.mTabSpaceEqual) {
            layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        } else {
            layoutParams = new LinearLayout.LayoutParams(-2, -1);
        }
        if (this.mTabWidth > 0.0f) {
            layoutParams = new LinearLayout.LayoutParams((int) this.mTabWidth, -1);
        }
        layoutParams.setMargins(0, 0, getResources().getDimensionPixelOffset(R.dimen.wdp15), 0);
        this.mTabsContainer.addView(view, i4, layoutParams);
    }

    private void calcIndicatorRect() {
        int i4;
        View childAt = this.mTabsContainer.getChildAt(this.mCurrentTab);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.mIndicatorStyle == 0 && this.mIndicatorWidthEqualTitle) {
            this.mTextPaint.setTextSize(this.mTextsize);
            this.margin = ((right - left) - this.mTextPaint.measureText(((TextView) childAt.findViewById(R.id.tv_tab_title)).getText().toString())) / 2.0f;
        }
        int i5 = this.mCurrentTab;
        if (i5 < this.mTabCount - 1) {
            View childAt2 = this.mTabsContainer.getChildAt(i5 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f5 = this.mCurrentPositionOffset;
            left += (left2 - left) * f5;
            right += f5 * (right2 - right);
            if (this.mIndicatorStyle == 0 && this.mIndicatorWidthEqualTitle) {
                this.mTextPaint.setTextSize(this.mTextsize);
                float f6 = this.margin;
                this.margin = f6 + (this.mCurrentPositionOffset * ((((right2 - left2) - this.mTextPaint.measureText(((TextView) childAt2.findViewById(R.id.tv_tab_title)).getText().toString())) / 2.0f) - f6));
            }
        }
        Rect rect = this.mIndicatorRect;
        int i6 = (int) left;
        rect.left = i6;
        int i7 = (int) right;
        rect.right = i7;
        if (this.mIndicatorStyle == 0 && this.mIndicatorWidthEqualTitle) {
            float f7 = this.margin;
            rect.left = (int) ((left + f7) - 1.0f);
            rect.right = (int) ((right - f7) - 1.0f);
        }
        Rect rect2 = this.mTabRect;
        rect2.left = i6;
        rect2.right = i7;
        if (this.mIndicatorWidth < 0.0f) {
            return;
        }
        float left3 = childAt.getLeft() + ((childAt.getWidth() - this.mIndicatorWidth) / 2.0f);
        if (this.mCurrentTab < this.mTabCount - 1) {
            left3 += this.mCurrentPositionOffset * ((childAt.getWidth() / 2) + (this.mTabsContainer.getChildAt(i4 + 1).getWidth() / 2));
        }
        Rect rect3 = this.mIndicatorRect;
        int i8 = (int) left3;
        rect3.left = i8;
        rect3.right = (int) (i8 + this.mIndicatorWidth);
    }

    private void obtainAttributes(Context context, AttributeSet attributeSet) {
        float f5;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.flyco.tablayout.R.styleable.SlidingTabLayout);
        int i4 = obtainStyledAttributes.getInt(11, 0);
        this.mIndicatorStyle = i4;
        this.mIndicatorColor = obtainStyledAttributes.getColor(3, Color.parseColor(i4 == 2 ? "#4B6A87" : "#ffffff"));
        int i5 = this.mIndicatorStyle;
        if (i5 == 1) {
            f5 = 4.0f;
        } else {
            f5 = i5 == 2 ? -1 : 2;
        }
        this.mIndicatorHeight = obtainStyledAttributes.getDimension(6, dp2px(f5));
        this.mIndicatorWidth = obtainStyledAttributes.getDimension(12, dp2px(this.mIndicatorStyle == 1 ? 10.0f : -1.0f));
        this.mIndicatorCornerRadius = obtainStyledAttributes.getDimension(4, dp2px(this.mIndicatorStyle == 2 ? -1.0f : 0.0f));
        this.mIndicatorMarginLeft = obtainStyledAttributes.getDimension(8, dp2px(0.0f));
        this.mIndicatorMarginTop = obtainStyledAttributes.getDimension(10, dp2px(this.mIndicatorStyle == 2 ? 7.0f : 0.0f));
        this.mIndicatorMarginRight = obtainStyledAttributes.getDimension(9, dp2px(0.0f));
        this.mIndicatorMarginBottom = obtainStyledAttributes.getDimension(7, dp2px(this.mIndicatorStyle != 2 ? 0.0f : 7.0f));
        this.mIndicatorGravity = obtainStyledAttributes.getInt(5, 80);
        this.mIndicatorWidthEqualTitle = obtainStyledAttributes.getBoolean(13, false);
        this.mUnderlineColor = obtainStyledAttributes.getColor(22, Color.parseColor("#ffffff"));
        this.mUnderlineHeight = obtainStyledAttributes.getDimension(24, dp2px(0.0f));
        this.mUnderlineGravity = obtainStyledAttributes.getInt(23, 80);
        this.mDividerColor = obtainStyledAttributes.getColor(0, Color.parseColor("#ffffff"));
        this.mDividerWidth = obtainStyledAttributes.getDimension(2, dp2px(0.0f));
        this.mDividerPadding = obtainStyledAttributes.getDimension(1, dp2px(12.0f));
        this.mTextsize = obtainStyledAttributes.getDimension(21, sp2px(14.0f));
        this.mTextSelectColor = obtainStyledAttributes.getColor(19, Color.parseColor("#ffffff"));
        this.mTextUnselectColor = obtainStyledAttributes.getColor(20, Color.parseColor("#848484"));
        this.mTextBold = obtainStyledAttributes.getInt(18, 0);
        this.mTextAllCaps = obtainStyledAttributes.getBoolean(17, false);
        this.mTabSpaceEqual = obtainStyledAttributes.getBoolean(15, false);
        float dimension = obtainStyledAttributes.getDimension(16, dp2px(-1.0f));
        this.mTabWidth = dimension;
        this.mTabPadding = obtainStyledAttributes.getDimension(14, (this.mTabSpaceEqual || dimension > 0.0f) ? dp2px(0.0f) : dp2px(20.0f));
        obtainStyledAttributes.recycle();
    }

    private void scrollToCurrentTab() {
        if (this.mTabCount <= 0) {
            return;
        }
        int width = (int) (this.mCurrentPositionOffset * this.mTabsContainer.getChildAt(this.mCurrentTab).getWidth());
        int left = this.mTabsContainer.getChildAt(this.mCurrentTab).getLeft() + width;
        if (this.mCurrentTab > 0 || width > 0) {
            int width2 = left - ((getWidth() / 2) - getPaddingLeft());
            calcIndicatorRect();
            Rect rect = this.mTabRect;
            left = width2 + ((rect.right - rect.left) / 2);
        }
        if (left != this.mLastScrollX) {
            this.mLastScrollX = left;
            scrollTo(left, 0);
        }
    }

    private void updateTabSelection(int i4) {
        int i5 = 0;
        while (i5 < this.mTabCount) {
            View childAt = this.mTabsContainer.getChildAt(i5);
            boolean z4 = i5 == i4;
            TextView textView = (TextView) childAt.findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(z4 ? this.mTextSelectColor : this.mTextUnselectColor);
                if (this.mTextBold == 1) {
                    textView.getPaint().setFakeBoldText(z4);
                }
                if (z4) {
                    textView.setBackgroundResource(R.drawable.stroke_mainyellow_butn);
                } else {
                    textView.setBackgroundResource(R.drawable.stroke_grey_butn);
                }
            }
            i5++;
        }
    }

    private void updateTabStyles() {
        int i4 = 0;
        while (i4 < this.mTabCount) {
            TextView textView = (TextView) this.mTabsContainer.getChildAt(i4).findViewById(R.id.tv_tab_title);
            if (textView != null) {
                textView.setTextColor(i4 == this.mCurrentTab ? this.mTextSelectColor : this.mTextUnselectColor);
                textView.setTextSize(0, this.mTextsize);
                float f5 = this.mTabPadding;
                textView.setPadding((int) f5, 0, (int) f5, 0);
                if (this.mTextAllCaps) {
                    textView.setText(textView.getText().toString().toUpperCase());
                }
                int i5 = this.mTextBold;
                if (i5 == 2) {
                    textView.getPaint().setFakeBoldText(true);
                } else if (i5 == 0) {
                    textView.getPaint().setFakeBoldText(false);
                }
                if (this.mCurrentTab == i4) {
                    textView.setBackgroundResource(R.drawable.stroke_mainyellow_butn);
                } else {
                    textView.setBackgroundResource(R.drawable.stroke_grey_butn);
                }
            }
            i4++;
        }
    }

    public void addNewTab(String str) {
        View inflate = View.inflate(this.mContext, R.layout.layout_tab, null);
        ArrayList<String> arrayList = this.mTitles;
        if (arrayList != null) {
            arrayList.add(str);
        }
        ArrayList<String> arrayList2 = this.mTitles;
        addTab(this.mTabCount, (arrayList2 == null ? this.mViewPager.getAdapter().getPageTitle(this.mTabCount) : arrayList2.get(this.mTabCount)).toString(), inflate);
        ArrayList<String> arrayList3 = this.mTitles;
        this.mTabCount = arrayList3 == null ? this.mViewPager.getAdapter().getCount() : arrayList3.size();
        updateTabStyles();
    }

    protected int dp2px(float f5) {
        return (int) ((f5 * this.mContext.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public int getCurrentTab() {
        return this.mCurrentTab;
    }

    public int getDividerColor() {
        return this.mDividerColor;
    }

    public float getDividerPadding() {
        return this.mDividerPadding;
    }

    public float getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getIndicatorColor() {
        return this.mIndicatorColor;
    }

    public float getIndicatorCornerRadius() {
        return this.mIndicatorCornerRadius;
    }

    public float getIndicatorHeight() {
        return this.mIndicatorHeight;
    }

    public float getIndicatorMarginBottom() {
        return this.mIndicatorMarginBottom;
    }

    public float getIndicatorMarginLeft() {
        return this.mIndicatorMarginLeft;
    }

    public float getIndicatorMarginRight() {
        return this.mIndicatorMarginRight;
    }

    public float getIndicatorMarginTop() {
        return this.mIndicatorMarginTop;
    }

    public int getIndicatorStyle() {
        return this.mIndicatorStyle;
    }

    public float getIndicatorWidth() {
        return this.mIndicatorWidth;
    }

    public MsgView getMsgView(int i4) {
        int i5 = this.mTabCount;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        return (MsgView) this.mTabsContainer.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
    }

    public int getTabCount() {
        return this.mTabCount;
    }

    public float getTabPadding() {
        return this.mTabPadding;
    }

    public float getTabWidth() {
        return this.mTabWidth;
    }

    public int getTextBold() {
        return this.mTextBold;
    }

    public int getTextSelectColor() {
        return this.mTextSelectColor;
    }

    public int getTextUnselectColor() {
        return this.mTextUnselectColor;
    }

    public float getTextsize() {
        return this.mTextsize;
    }

    public TextView getTitleView(int i4) {
        return (TextView) this.mTabsContainer.getChildAt(i4).findViewById(R.id.tv_tab_title);
    }

    public int getUnderlineColor() {
        return this.mUnderlineColor;
    }

    public float getUnderlineHeight() {
        return this.mUnderlineHeight;
    }

    public void hideMsg(int i4) {
        int i5 = this.mTabCount;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        MsgView msgView = (MsgView) this.mTabsContainer.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            msgView.setVisibility(8);
        }
    }

    public boolean isTabSpaceEqual() {
        return this.mTabSpaceEqual;
    }

    public boolean isTextAllCaps() {
        return this.mTextAllCaps;
    }

    public void notifyDataSetChanged() {
        this.mTabsContainer.removeAllViews();
        ArrayList<String> arrayList = this.mTitles;
        this.mTabCount = arrayList == null ? this.mViewPager.getAdapter().getCount() : arrayList.size();
        for (int i4 = 0; i4 < this.mTabCount; i4++) {
            View inflate = View.inflate(this.mContext, R.layout.layout_tab, null);
            ArrayList<String> arrayList2 = this.mTitles;
            addTab(i4, (arrayList2 == null ? this.mViewPager.getAdapter().getPageTitle(i4) : arrayList2.get(i4)).toString(), inflate);
        }
        updateTabStyles();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (isInEditMode() || this.mTabCount <= 0) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        float f5 = this.mDividerWidth;
        if (f5 > 0.0f) {
            this.mDividerPaint.setStrokeWidth(f5);
            this.mDividerPaint.setColor(this.mDividerColor);
            for (int i4 = 0; i4 < this.mTabCount - 1; i4++) {
                View childAt = this.mTabsContainer.getChildAt(i4);
                canvas.drawLine(childAt.getRight() + paddingLeft, this.mDividerPadding, childAt.getRight() + paddingLeft, height - this.mDividerPadding, this.mDividerPaint);
            }
        }
        if (this.mUnderlineHeight > 0.0f) {
            this.mRectPaint.setColor(this.mUnderlineColor);
            if (this.mUnderlineGravity == 80) {
                float f6 = height;
                canvas.drawRect(paddingLeft, f6 - this.mUnderlineHeight, this.mTabsContainer.getWidth() + paddingLeft, f6, this.mRectPaint);
            } else {
                canvas.drawRect(paddingLeft, 0.0f, this.mTabsContainer.getWidth() + paddingLeft, this.mUnderlineHeight, this.mRectPaint);
            }
        }
        calcIndicatorRect();
        int i5 = this.mIndicatorStyle;
        if (i5 == 1) {
            if (this.mIndicatorHeight > 0.0f) {
                this.mTrianglePaint.setColor(this.mIndicatorColor);
                this.mTrianglePath.reset();
                float f7 = height;
                this.mTrianglePath.moveTo(this.mIndicatorRect.left + paddingLeft, f7);
                Path path = this.mTrianglePath;
                Rect rect2 = this.mIndicatorRect;
                path.lineTo((rect2.left / 2) + paddingLeft + (rect2.right / 2), f7 - this.mIndicatorHeight);
                this.mTrianglePath.lineTo(paddingLeft + this.mIndicatorRect.right, f7);
                this.mTrianglePath.close();
                canvas.drawPath(this.mTrianglePath, this.mTrianglePaint);
            }
        } else if (i5 == 2) {
            if (this.mIndicatorHeight < 0.0f) {
                this.mIndicatorHeight = (height - this.mIndicatorMarginTop) - this.mIndicatorMarginBottom;
            }
            float f8 = this.mIndicatorHeight;
            if (f8 > 0.0f) {
                float f9 = this.mIndicatorCornerRadius;
                if (f9 < 0.0f || f9 > f8 / 2.0f) {
                    this.mIndicatorCornerRadius = f8 / 2.0f;
                }
                this.mIndicatorDrawable.setColor(this.mIndicatorColor);
                GradientDrawable gradientDrawable = this.mIndicatorDrawable;
                int i6 = ((int) this.mIndicatorMarginLeft) + paddingLeft + this.mIndicatorRect.left;
                float f10 = this.mIndicatorMarginTop;
                gradientDrawable.setBounds(i6, (int) f10, (int) ((paddingLeft + rect.right) - this.mIndicatorMarginRight), (int) (f10 + this.mIndicatorHeight));
                this.mIndicatorDrawable.setCornerRadius(this.mIndicatorCornerRadius);
                this.mIndicatorDrawable.draw(canvas);
            }
        } else if (this.mIndicatorHeight > 0.0f) {
            this.mIndicatorDrawable.setColor(this.mIndicatorColor);
            if (this.mIndicatorGravity == 80) {
                GradientDrawable gradientDrawable2 = this.mIndicatorDrawable;
                Rect rect3 = this.mIndicatorRect;
                float f11 = this.mIndicatorMarginBottom;
                gradientDrawable2.setBounds(((int) this.mIndicatorMarginLeft) + paddingLeft + rect3.left, (height - ((int) this.mIndicatorHeight)) - ((int) f11), (paddingLeft + rect3.right) - ((int) this.mIndicatorMarginRight), height - ((int) f11));
            } else {
                GradientDrawable gradientDrawable3 = this.mIndicatorDrawable;
                Rect rect4 = this.mIndicatorRect;
                int i7 = ((int) this.mIndicatorMarginLeft) + paddingLeft + rect4.left;
                float f12 = this.mIndicatorMarginTop;
                gradientDrawable3.setBounds(i7, (int) f12, (paddingLeft + rect4.right) - ((int) this.mIndicatorMarginRight), ((int) this.mIndicatorHeight) + ((int) f12));
            }
            this.mIndicatorDrawable.setCornerRadius(this.mIndicatorCornerRadius);
            this.mIndicatorDrawable.draw(canvas);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i4) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i4, float f5, int i5) {
        this.mCurrentTab = i4;
        this.mCurrentPositionOffset = f5;
        scrollToCurrentTab();
        invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i4) {
        updateTabSelection(i4);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.mCurrentTab = bundle.getInt("mCurrentTab");
            parcelable = bundle.getParcelable("instanceState");
            if (this.mCurrentTab != 0 && this.mTabsContainer.getChildCount() > 0) {
                updateTabSelection(this.mCurrentTab);
                scrollToCurrentTab();
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mCurrentTab", this.mCurrentTab);
        return bundle;
    }

    public void setCurrentTab(int i4) {
        this.mCurrentTab = i4;
        this.mViewPager.setCurrentItem(i4);
    }

    public void setDividerColor(int i4) {
        this.mDividerColor = i4;
        invalidate();
    }

    public void setDividerPadding(float f5) {
        this.mDividerPadding = dp2px(f5);
        invalidate();
    }

    public void setDividerWidth(float f5) {
        this.mDividerWidth = dp2px(f5);
        invalidate();
    }

    public void setIndicatorColor(int i4) {
        this.mIndicatorColor = i4;
        invalidate();
    }

    public void setIndicatorCornerRadius(float f5) {
        this.mIndicatorCornerRadius = dp2px(f5);
        invalidate();
    }

    public void setIndicatorGravity(int i4) {
        this.mIndicatorGravity = i4;
        invalidate();
    }

    public void setIndicatorHeight(float f5) {
        this.mIndicatorHeight = dp2px(f5);
        invalidate();
    }

    public void setIndicatorMargin(float f5, float f6, float f7, float f8) {
        this.mIndicatorMarginLeft = dp2px(f5);
        this.mIndicatorMarginTop = dp2px(f6);
        this.mIndicatorMarginRight = dp2px(f7);
        this.mIndicatorMarginBottom = dp2px(f8);
        invalidate();
    }

    public void setIndicatorStyle(int i4) {
        this.mIndicatorStyle = i4;
        invalidate();
    }

    public void setIndicatorWidth(float f5) {
        this.mIndicatorWidth = dp2px(f5);
        invalidate();
    }

    public void setIndicatorWidthEqualTitle(boolean z4) {
        this.mIndicatorWidthEqualTitle = z4;
        invalidate();
    }

    public void setMsgMargin(int i4, float f5, float f6) {
        float f7;
        int i5 = this.mTabCount;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        View childAt = this.mTabsContainer.getChildAt(i4);
        MsgView msgView = (MsgView) childAt.findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            this.mTextPaint.setTextSize(this.mTextsize);
            float measureText = this.mTextPaint.measureText(((TextView) childAt.findViewById(R.id.tv_tab_title)).getText().toString());
            float descent = this.mTextPaint.descent() - this.mTextPaint.ascent();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) msgView.getLayoutParams();
            float f8 = this.mTabWidth;
            if (f8 >= 0.0f) {
                f7 = f8 / 2.0f;
                measureText /= 2.0f;
            } else {
                f7 = this.mTabPadding;
            }
            marginLayoutParams.leftMargin = (int) (f7 + measureText + dp2px(f5));
            int i6 = this.mHeight;
            marginLayoutParams.topMargin = i6 > 0 ? (((int) (i6 - descent)) / 2) - dp2px(f6) : 0;
            msgView.setLayoutParams(marginLayoutParams);
        }
    }

    public void setOnTabSelectListener(b bVar) {
        this.mListener = bVar;
    }

    public void setSnapOnTabClick(boolean z4) {
        this.mSnapOnTabClick = z4;
    }

    public void setTabPadding(float f5) {
        this.mTabPadding = dp2px(f5);
        updateTabStyles();
    }

    public void setTabSpaceEqual(boolean z4) {
        this.mTabSpaceEqual = z4;
        updateTabStyles();
    }

    public void setTabWidth(float f5) {
        this.mTabWidth = dp2px(f5);
        updateTabStyles();
    }

    public void setTextAllCaps(boolean z4) {
        this.mTextAllCaps = z4;
        updateTabStyles();
    }

    public void setTextBold(int i4) {
        this.mTextBold = i4;
        updateTabStyles();
    }

    public void setTextSelectColor(int i4) {
        this.mTextSelectColor = i4;
        updateTabStyles();
    }

    public void setTextUnselectColor(int i4) {
        this.mTextUnselectColor = i4;
        updateTabStyles();
    }

    public void setTextsize(float f5) {
        this.mTextsize = sp2px(f5);
        updateTabStyles();
    }

    public void setUnderlineColor(int i4) {
        this.mUnderlineColor = i4;
        invalidate();
    }

    public void setUnderlineGravity(int i4) {
        this.mUnderlineGravity = i4;
        invalidate();
    }

    public void setUnderlineHeight(float f5) {
        this.mUnderlineHeight = dp2px(f5);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.mViewPager = viewPager;
            viewPager.removeOnPageChangeListener(this);
            this.mViewPager.addOnPageChangeListener(this);
            notifyDataSetChanged();
            return;
        }
        throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
    }

    public void showDot(int i4) {
        int i5 = this.mTabCount;
        if (i4 >= i5) {
            i4 = i5 - 1;
        }
        showMsg(i4, 0);
    }

    public void showMsg(int i4, int i5) {
        int i6 = this.mTabCount;
        if (i4 >= i6) {
            i4 = i6 - 1;
        }
        MsgView msgView = (MsgView) this.mTabsContainer.getChildAt(i4).findViewById(R.id.rtv_msg_tip);
        if (msgView != null) {
            b1.b.b(msgView, i5);
            if (this.mInitSetMap.get(i4) == null || !this.mInitSetMap.get(i4).booleanValue()) {
                setMsgMargin(i4, 4.0f, 2.0f);
                this.mInitSetMap.put(i4, Boolean.TRUE);
            }
        }
    }

    protected int sp2px(float f5) {
        return (int) ((f5 * this.mContext.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public SlidingTabLayoutScreenShort(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingTabLayoutScreenShort(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mIndicatorRect = new Rect();
        this.mTabRect = new Rect();
        this.mIndicatorDrawable = new GradientDrawable();
        this.mRectPaint = new Paint(1);
        this.mDividerPaint = new Paint(1);
        this.mTrianglePaint = new Paint(1);
        this.mTrianglePath = new Path();
        this.mIndicatorStyle = 0;
        this.mTextPaint = new Paint(1);
        this.mInitSetMap = new SparseArray<>();
        setFillViewport(true);
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
        this.mContext = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.mTabsContainer = linearLayout;
        addView(linearLayout);
        obtainAttributes(context, attributeSet);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "layout_height");
        if (attributeValue.equals("-1") || attributeValue.equals("-2")) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842997});
        this.mHeight = obtainStyledAttributes.getDimensionPixelSize(0, -2);
        obtainStyledAttributes.recycle();
    }

    public void setCurrentTab(int i4, boolean z4) {
        this.mCurrentTab = i4;
        this.mViewPager.setCurrentItem(i4, z4);
    }

    public void setViewPager(ViewPager viewPager, String[] strArr) {
        if (viewPager != null && viewPager.getAdapter() != null) {
            if (strArr != null && strArr.length != 0) {
                if (strArr.length == viewPager.getAdapter().getCount()) {
                    this.mViewPager = viewPager;
                    ArrayList<String> arrayList = new ArrayList<>();
                    this.mTitles = arrayList;
                    Collections.addAll(arrayList, strArr);
                    this.mViewPager.removeOnPageChangeListener(this);
                    this.mViewPager.addOnPageChangeListener(this);
                    notifyDataSetChanged();
                    return;
                }
                throw new IllegalStateException("Titles length must be the same as the page count !");
            }
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        throw new IllegalStateException("ViewPager or ViewPager adapter can not be NULL !");
    }

    public void setViewPager(ViewPager viewPager, String[] strArr, FragmentActivity fragmentActivity, ArrayList<Fragment> arrayList) {
        if (viewPager != null) {
            if (strArr != null && strArr.length != 0) {
                this.mViewPager = viewPager;
                viewPager.setAdapter(new InnerPagerAdapter(fragmentActivity.getSupportFragmentManager(), arrayList, strArr));
                this.mViewPager.removeOnPageChangeListener(this);
                this.mViewPager.addOnPageChangeListener(this);
                notifyDataSetChanged();
                return;
            }
            throw new IllegalStateException("Titles can not be EMPTY !");
        }
        throw new IllegalStateException("ViewPager can not be NULL !");
    }
}
