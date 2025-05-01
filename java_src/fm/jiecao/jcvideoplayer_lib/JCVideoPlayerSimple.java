package fm.jiecao.jcvideoplayer_lib;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;
/* loaded from: classes6.dex */
public class JCVideoPlayerSimple extends JCVideoPlayer {
    public JCVideoPlayerSimple(Context context) {
        super(context);
    }

    private void W() {
        int i4 = this.f69012c;
        if (i4 == 3) {
            this.f69018i.setImageResource(R.drawable.jc_click_pause_selector);
        } else if (i4 == 7) {
            this.f69018i.setImageResource(R.drawable.jc_click_error_selector);
        } else {
            this.f69018i.setImageResource(R.drawable.jc_click_play_selector);
        }
    }

    public void V() {
        if (this.f69013d == 2) {
            this.f69020k.setImageResource(R.drawable.jc_shrink);
        } else {
            this.f69020k.setImageResource(R.drawable.jc_enlarge);
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public int getLayoutId() {
        return R.layout.jc_layout_base;
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.fullscreen && this.f69012c == 0) {
            Toast.makeText(getContext(), "Play video first", 0).show();
        } else {
            super.onClick(view);
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer, android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i4, boolean z4) {
        if (z4 && this.f69012c == 0) {
            Toast.makeText(getContext(), "Play video first", 0).show();
        } else {
            super.onProgressChanged(seekBar, i4, z4);
        }
    }

    @Override // fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
    public void setUp(String str, int i4, Object... objArr) {
        super.setUp(str, i4, objArr);
        V();
        this.f69020k.setVisibility(8);
    }

    public JCVideoPlayerSimple(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
