package com.papa91.arc.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import m.framework.ui.widget.asyncview.AsyncImageView;
import org.ppsspp.ppsspp.R;
/* loaded from: classes5.dex */
public class AchievmentTipsDialog extends PopupWindow {
    public AchievmentTipsDialog(Context context) {
        super(context);
        setContentView(LayoutInflater.from(context).inflate(R.layout.pop_achievement_tips, (ViewGroup) null));
        setBackgroundDrawable(context.getResources().getDrawable(AsyncImageView.DEFAULT_TRANSPARENT));
        setWidth((int) context.getResources().getDimension(R.dimen.wdp336));
        setOutsideTouchable(true);
    }
}
