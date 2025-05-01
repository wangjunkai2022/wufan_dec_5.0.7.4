package com.papa91.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.papa91.mix.R;
/* loaded from: classes5.dex */
public class ScoreBoardView extends FrameLayout {
    String name1;
    String name2;
    private TextView p1Name;
    private TextView p1Score;
    private ImageView p1Signal;
    private TextView p2Name;
    private TextView p2Score;
    private ImageView p2Signal;
    int score1;
    int score2;
    int signal1;
    int signal2;

    public ScoreBoardView(@NonNull Context context) {
        super(context);
        init();
    }

    private int signalResId(int i4) {
        if (i4 < 200) {
            return R.drawable.wifi_high;
        }
        if (i4 < 400) {
            return R.drawable.wifi_mid;
        }
        return R.drawable.wifi_low;
    }

    public String getName1() {
        return this.name1;
    }

    public String getName2() {
        return this.name2;
    }

    public int getScore1() {
        return this.score1;
    }

    public int getScore2() {
        return this.score2;
    }

    public int getSignal1() {
        return this.signal1;
    }

    public int getSignal2() {
        return this.signal2;
    }

    void init() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.score_board_layout, this);
        this.p1Name = (TextView) inflate.findViewById(R.id.name1);
        this.p1Score = (TextView) inflate.findViewById(R.id.score1);
        this.p1Signal = (ImageView) inflate.findViewById(R.id.signal1);
        this.p2Name = (TextView) inflate.findViewById(R.id.name2);
        this.p2Score = (TextView) inflate.findViewById(R.id.score2);
        this.p2Signal = (ImageView) inflate.findViewById(R.id.signal2);
    }

    public void setName1(String str) {
        this.name1 = str;
        this.p1Name.setText(str);
    }

    public void setName2(String str) {
        this.name2 = str;
        this.p2Name.setText(str);
    }

    public void setScore1(int i4) {
        this.score1 = i4;
        TextView textView = this.p1Score;
        textView.setText("" + i4);
    }

    public void setScore2(int i4) {
        this.score2 = i4;
        TextView textView = this.p2Score;
        textView.setText("" + i4);
    }

    public void setSignal1(int i4) {
        this.signal1 = i4;
    }

    public void setSignal2(int i4) {
        this.signal2 = i4;
    }

    public ScoreBoardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ScoreBoardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
