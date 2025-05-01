package com.papa91.view;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.papa91.activity.EmuBaseActivity;
import com.papa91.activity.EmuMenuBaseActivity;
import com.papa91.arc.CContext;
import com.papa91.arc.bean.EndGameAdBean;
import com.papa91.arc.bean.EndGameAllowBean;
import com.papa91.mix.R;
/* loaded from: classes5.dex */
public class EndGamePointGetDialog extends Dialog {
    private EndGameAllowBean bean;
    private Activity context;
    private String gameId;
    private int sdkType;

    public EndGamePointGetDialog(@NonNull Activity activity, EndGameAllowBean endGameAllowBean, String str) {
        super(activity, R.style.Dialog);
        this.bean = endGameAllowBean;
        this.context = activity;
        this.gameId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        dismiss();
        Activity activity = this.context;
        if (activity instanceof EmuMenuBaseActivity) {
            ((EmuMenuBaseActivity) activity).endGameAllow(false, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        CContext.mVideoAdListener.showEndAd(this.sdkType, this.gameId);
        Activity activity = this.context;
        if (activity instanceof EmuBaseActivity) {
            ((EmuBaseActivity) activity).senCommonEvent("clickGameVSAdVideo", "");
        }
        dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_end_game_get_point);
        ImageView imageView = (ImageView) findViewById(R.id.ivClose);
        ImageView imageView2 = (ImageView) findViewById(R.id.textEndless);
        TextView textView = (TextView) findViewById(R.id.tvPointCount);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.llBtn);
        ImageView imageView3 = (ImageView) findViewById(R.id.icMulti);
        ImageView imageView4 = (ImageView) findViewById(R.id.icVideoAd);
        ImageView imageView5 = (ImageView) findViewById(R.id.textReceive);
        setCanceledOnTouchOutside(false);
        if (this.bean.isAwardUnlimited()) {
            imageView2.setVisibility(0);
            textView.setVisibility(8);
            imageView3.setVisibility(8);
        } else {
            imageView2.setVisibility(8);
            textView.setVisibility(0);
            imageView3.setVisibility(0);
            textView.setText(this.bean.getAwardCards() + "");
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.papa91.view.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndGamePointGetDialog.this.lambda$onCreate$0(view);
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.papa91.view.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EndGamePointGetDialog.this.lambda$onCreate$1(view);
            }
        });
        if (this.bean.getAdVideoConfigList() != null) {
            for (EndGameAdBean endGameAdBean : this.bean.getAdVideoConfigList()) {
                if (endGameAdBean != null) {
                    this.sdkType = endGameAdBean.getSdkType();
                    CContext.mVideoAdListener.loadEndAd(endGameAdBean.getSdkType(), endGameAdBean.getAdId(), endGameAdBean.getSdkKey());
                    return;
                }
            }
        }
    }
}
