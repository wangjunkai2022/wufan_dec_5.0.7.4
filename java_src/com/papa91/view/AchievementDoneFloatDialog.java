package com.papa91.view;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.papa91.activity.EmuMenuBaseActivity;
import com.papa91.arc.bean.AchievementBean;
import java.util.ArrayList;
import java.util.List;
import org.ppsspp.ppsspp.R;
/* loaded from: classes5.dex */
public class AchievementDoneFloatDialog extends Dialog {
    Runnable changeRunable;
    private Context context;
    Runnable dimissRunnable;
    private Handler handler;
    private List<AchievementBean.AchievementInfo> infos;
    private boolean isLogin;
    private SimpleDraweeView ivAchievement;
    private ConstraintLayout root;
    private TextView tvDesc;
    private TextView tvTitle;

    public AchievementDoneFloatDialog(@NonNull Context context, AchievementBean.AchievementInfo achievementInfo, boolean z4) {
        super(context);
        this.infos = new ArrayList();
        this.changeRunable = new Runnable() { // from class: com.papa91.view.AchievementDoneFloatDialog.1
            @Override // java.lang.Runnable
            public void run() {
                if (AchievementDoneFloatDialog.this.infos.size() > 0) {
                    AchievementDoneFloatDialog.this.showData();
                    return;
                }
                if (AchievementDoneFloatDialog.this.handler == null) {
                    AchievementDoneFloatDialog.this.handler = new Handler();
                }
                AchievementDoneFloatDialog.this.handler.postDelayed(AchievementDoneFloatDialog.this.dimissRunnable, 4000L);
            }
        };
        this.dimissRunnable = new Runnable() { // from class: com.papa91.view.AchievementDoneFloatDialog.2
            @Override // java.lang.Runnable
            public void run() {
                AchievementDoneFloatDialog.this.dismiss();
            }
        };
        this.isLogin = z4;
        this.context = context;
        this.infos.add(achievementInfo);
    }

    private void initViews() {
        setContentView(R.layout.dialog_achievement_done_float);
        setCanceledOnTouchOutside(false);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.setGravity(8388659);
        attributes.dimAmount = 0.0f;
        attributes.y = 100;
        try {
            attributes.flags = 32;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        window.setAttributes(attributes);
        this.ivAchievement = (SimpleDraweeView) findViewById(R.id.ivAchievement);
        this.tvTitle = (TextView) findViewById(R.id.tvTitle);
        this.tvDesc = (TextView) findViewById(R.id.tvDesc);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.root);
        this.root = constraintLayout;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.papa91.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AchievementDoneFloatDialog.this.lambda$initViews$0(view);
            }
        });
        showData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        Context context = this.context;
        if (context instanceof EmuMenuBaseActivity) {
            ((EmuMenuBaseActivity) context).showAchievementDialog(this.isLogin ? 2 : 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showData() {
        String str;
        if (this.infos.size() <= 0) {
            dismiss();
            return;
        }
        AchievementBean.AchievementInfo achievementInfo = this.infos.get(0);
        this.ivAchievement.getHierarchy().H(R.drawable.shape_placeholder);
        this.ivAchievement.getHierarchy().B(R.drawable.wifi);
        this.ivAchievement.setImageURI(Uri.parse(achievementInfo.getIcon()));
        this.tvTitle.setText("恭喜你解锁成就【" + achievementInfo.getName() + "】");
        TextView textView = this.tvDesc;
        if (this.isLogin) {
            str = achievementInfo.getUnlock_rate() + "%玩家解锁此成就";
        } else {
            str = "登录账号即可保存成就";
        }
        textView.setText(str);
        this.infos.remove(0);
        if (this.handler == null) {
            this.handler = new Handler();
        }
        this.handler.postDelayed(this.changeRunable, 1000L);
    }

    public void addInfo(AchievementBean.AchievementInfo achievementInfo) {
        this.infos.add(achievementInfo);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.infos.clear();
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        initViews();
    }
}
