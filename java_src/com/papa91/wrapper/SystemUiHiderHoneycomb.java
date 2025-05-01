package com.papa91.wrapper;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.View;
@TargetApi(11)
/* loaded from: classes5.dex */
class SystemUiHiderHoneycomb extends SystemUiHiderBase {
    private int mHideFlags;
    private int mShowFlags;
    private View.OnSystemUiVisibilityChangeListener mSystemUiVisibilityChangeListener;
    private View.OnSystemUiVisibilityChangeListener mSystemUiVisibilityChangeListener2;
    private int mTestFlags;
    private boolean mVisible;

    /* JADX INFO: Access modifiers changed from: protected */
    public SystemUiHiderHoneycomb(Activity activity, View view, int i4) {
        super(activity, view, i4);
        this.mVisible = true;
        this.mSystemUiVisibilityChangeListener2 = new View.OnSystemUiVisibilityChangeListener() { // from class: com.papa91.wrapper.SystemUiHiderHoneycomb.1
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i5) {
                if (Build.VERSION.SDK_INT < 16) {
                    SystemUiHiderHoneycomb.this.mActivity.getWindow().setFlags(1024, 1024);
                }
                SystemUiHiderHoneycomb.this.mOnVisibilityChangeListener.onVisibilityChange(false);
                SystemUiHiderHoneycomb.this.mVisible = false;
            }
        };
        this.mSystemUiVisibilityChangeListener = new View.OnSystemUiVisibilityChangeListener() { // from class: com.papa91.wrapper.SystemUiHiderHoneycomb.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i5) {
                if ((i5 & SystemUiHiderHoneycomb.this.mTestFlags) != 0) {
                    if (Build.VERSION.SDK_INT < 16) {
                        SystemUiHiderHoneycomb.this.mActivity.getWindow().setFlags(1024, 1024);
                    }
                    SystemUiHiderHoneycomb.this.mOnVisibilityChangeListener.onVisibilityChange(false);
                    SystemUiHiderHoneycomb.this.mVisible = false;
                    return;
                }
                SystemUiHiderHoneycomb systemUiHiderHoneycomb = SystemUiHiderHoneycomb.this;
                systemUiHiderHoneycomb.mAnchorView.setSystemUiVisibility(systemUiHiderHoneycomb.mShowFlags);
                if (Build.VERSION.SDK_INT < 16) {
                    SystemUiHiderHoneycomb.this.mActivity.getWindow().setFlags(0, 1024);
                }
                SystemUiHiderHoneycomb.this.mOnVisibilityChangeListener.onVisibilityChange(true);
                SystemUiHiderHoneycomb.this.mVisible = true;
            }
        };
        this.mShowFlags = 0;
        this.mHideFlags = 1;
        this.mTestFlags = 1;
        int i5 = this.mFlags;
        if ((i5 & 2) != 0) {
            this.mHideFlags = 1 | 1028;
        }
        if ((i5 & 6) != 0) {
            this.mTestFlags = 2;
        }
    }

    @Override // com.papa91.wrapper.SystemUiHiderBase, com.papa91.wrapper.SystemUiHider
    public void hide() {
        this.mAnchorView.setSystemUiVisibility(this.mHideFlags);
        if (Build.VERSION.SDK_INT >= 19) {
            this.mAnchorView.setSystemUiVisibility(this.mHideFlags | 2 | 512 | 4096);
        }
    }

    @Override // com.papa91.wrapper.SystemUiHiderBase, com.papa91.wrapper.SystemUiHider
    public boolean isVisible() {
        return this.mVisible;
    }

    @Override // com.papa91.wrapper.SystemUiHiderBase, com.papa91.wrapper.SystemUiHider
    public void setup() {
        this.mAnchorView.setOnSystemUiVisibilityChangeListener(this.mSystemUiVisibilityChangeListener2);
    }

    @Override // com.papa91.wrapper.SystemUiHiderBase, com.papa91.wrapper.SystemUiHider
    public void show() {
        this.mAnchorView.setSystemUiVisibility(this.mShowFlags);
    }
}
