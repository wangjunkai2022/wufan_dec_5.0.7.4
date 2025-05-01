package com.join.android.app.component.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.w0;
/* loaded from: classes3.dex */
public class MediaController extends android.widget.MediaController {
    private static final int A = 3000;
    private static final int B = 1;
    private static final int C = 2;

    /* renamed from: b  reason: collision with root package name */
    private e f15194b;

    /* renamed from: c  reason: collision with root package name */
    private Context f15195c;

    /* renamed from: d  reason: collision with root package name */
    private PopupWindow f15196d;

    /* renamed from: e  reason: collision with root package name */
    private int f15197e;

    /* renamed from: f  reason: collision with root package name */
    private View f15198f;

    /* renamed from: g  reason: collision with root package name */
    private View f15199g;

    /* renamed from: h  reason: collision with root package name */
    private SeekBar f15200h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f15201i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f15202j;

    /* renamed from: k  reason: collision with root package name */
    private ImageButton f15203k;

    /* renamed from: l  reason: collision with root package name */
    private OutlineTextView f15204l;

    /* renamed from: m  reason: collision with root package name */
    private long f15205m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f15206n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f15207o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f15208p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15209q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f15210r;

    /* renamed from: s  reason: collision with root package name */
    private ImageButton f15211s;

    /* renamed from: t  reason: collision with root package name */
    private AudioManager f15212t;

    /* renamed from: u  reason: collision with root package name */
    private g f15213u;

    /* renamed from: v  reason: collision with root package name */
    private f f15214v;
    @SuppressLint({"HandlerLeak"})

    /* renamed from: w  reason: collision with root package name */
    private Handler f15215w;

    /* renamed from: x  reason: collision with root package name */
    private View.OnClickListener f15216x;

    /* renamed from: y  reason: collision with root package name */
    private View.OnClickListener f15217y;

    /* renamed from: z  reason: collision with root package name */
    private SeekBar.OnSeekBarChangeListener f15218z;

    /* loaded from: classes3.dex */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                MediaController.this.hide();
            } else if (i4 != 2) {
            } else {
                long w4 = MediaController.this.w();
                if (MediaController.this.f15207o || !MediaController.this.f15206n) {
                    return;
                }
                sendMessageDelayed(obtainMessage(2), 1000 - (w4 % 1000));
                MediaController.this.y();
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaController.this.p();
            MediaController.this.show(3000);
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaController.this.o();
        }
    }

    /* loaded from: classes3.dex */
    class d implements SeekBar.OnSeekBarChangeListener {
        d() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i4, boolean z4) {
            if (z4) {
                long j4 = (MediaController.this.f15205m * i4) / 1000;
                String e5 = com.join.android.app.common.utils.g.e(j4);
                if (MediaController.this.f15209q) {
                    MediaController.this.f15194b.seekTo((int) j4);
                }
                if (MediaController.this.f15204l != null) {
                    MediaController.this.f15204l.setText(e5);
                }
                if (MediaController.this.f15202j != null) {
                    MediaController.this.f15202j.setText(e5);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            MediaController.this.f15207o = true;
            MediaController.this.show(3600000);
            MediaController.this.f15215w.removeMessages(2);
            if (MediaController.this.f15209q) {
                MediaController.this.f15212t.setStreamMute(3, true);
            }
            if (MediaController.this.f15204l != null) {
                MediaController.this.f15204l.setText("");
                MediaController.this.f15204l.setVisibility(0);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (!MediaController.this.f15209q) {
                MediaController.this.f15194b.seekTo((int) ((MediaController.this.f15205m * seekBar.getProgress()) / 1000));
            }
            if (MediaController.this.f15204l != null) {
                MediaController.this.f15204l.setText("");
                MediaController.this.f15204l.setVisibility(8);
            }
            MediaController.this.show(3000);
            MediaController.this.f15215w.removeMessages(2);
            MediaController.this.f15212t.setStreamMute(3, false);
            MediaController.this.f15207o = false;
            MediaController.this.f15215w.sendEmptyMessageDelayed(2, 1000L);
        }
    }

    /* loaded from: classes3.dex */
    public interface e {
        void a(boolean z4);

        boolean canPause();

        boolean canSeekBackward();

        boolean canSeekForward();

        int getAudioSessionId();

        int getBufferPercentage();

        int getCurrentPosition();

        int getDuration();

        boolean isPlaying();

        void pause();

        void seekTo(int i4);

        void start();
    }

    /* loaded from: classes3.dex */
    public interface f {
        void onHidden();
    }

    /* loaded from: classes3.dex */
    public interface g {
        void onShown();
    }

    public MediaController(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15209q = false;
        this.f15210r = false;
        this.f15215w = new a();
        this.f15216x = new b();
        this.f15217y = new c();
        this.f15218z = new d();
        this.f15199g = this;
        this.f15210r = true;
        r(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f15194b != null) {
            synchronized (Boolean.valueOf(this.f15208p)) {
                this.f15194b.a(this.f15208p);
            }
        }
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.f15194b.isPlaying()) {
            this.f15194b.pause();
        } else {
            this.f15194b.start();
        }
        y();
    }

    private boolean r(Context context) {
        this.f15195c = context;
        this.f15212t = (AudioManager) context.getSystemService("audio");
        return true;
    }

    private void s(View view) {
        ImageButton imageButton = (ImageButton) view.findViewById(getResources().getIdentifier("mediacontroller_play_pause", "id", this.f15195c.getPackageName()));
        this.f15211s = imageButton;
        if (imageButton != null) {
            imageButton.requestFocus();
            this.f15211s.setOnClickListener(this.f15216x);
        }
        SeekBar seekBar = (SeekBar) view.findViewById(getResources().getIdentifier("mediacontroller_seekbar", "id", this.f15195c.getPackageName()));
        this.f15200h = seekBar;
        if (seekBar != null) {
            if (seekBar instanceof SeekBar) {
                seekBar.setOnSeekBarChangeListener(this.f15218z);
            }
            this.f15200h.setMax(1000);
        }
        this.f15201i = (TextView) view.findViewById(getResources().getIdentifier("mediacontroller_time_total", "id", this.f15195c.getPackageName()));
        this.f15202j = (TextView) view.findViewById(getResources().getIdentifier("mediacontroller_time_current", "id", this.f15195c.getPackageName()));
        ImageButton imageButton2 = (ImageButton) view.findViewById(getResources().getIdentifier("mediacontroller_full_screen", "id", this.f15195c.getPackageName()));
        this.f15203k = imageButton2;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(this.f15217y);
        }
    }

    private void t() {
        PopupWindow popupWindow = new PopupWindow(this.f15195c);
        this.f15196d = popupWindow;
        popupWindow.setFocusable(false);
        this.f15196d.setBackgroundDrawable(null);
        this.f15196d.setOutsideTouchable(true);
        this.f15197e = 16973824;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long w() {
        e eVar = this.f15194b;
        if (eVar == null || this.f15207o) {
            return 0L;
        }
        long currentPosition = eVar.getCurrentPosition();
        long duration = this.f15194b.getDuration();
        SeekBar seekBar = this.f15200h;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((1000 * currentPosition) / duration));
            }
            this.f15200h.setSecondaryProgress(this.f15194b.getBufferPercentage() * 10);
        }
        this.f15205m = duration;
        TextView textView = this.f15201i;
        if (textView != null) {
            textView.setText(com.join.android.app.common.utils.g.e(duration));
        }
        TextView textView2 = this.f15202j;
        if (textView2 != null) {
            textView2.setText(com.join.android.app.common.utils.g.e(currentPosition));
        }
        return currentPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (this.f15199g == null || this.f15211s == null) {
            return;
        }
        if (this.f15194b.isPlaying()) {
            this.f15211s.setImageResource(getResources().getIdentifier("mediacontroller_pause", "drawable", this.f15195c.getPackageName()));
        } else {
            this.f15211s.setImageResource(getResources().getIdentifier("mediacontroller_play", "drawable", this.f15195c.getPackageName()));
        }
    }

    @Override // android.widget.MediaController, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getRepeatCount() == 0 && (keyCode == 79 || keyCode == 85 || keyCode == 62)) {
            p();
            show(3000);
            ImageButton imageButton = this.f15211s;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
            return true;
        } else if (keyCode == 86) {
            if (this.f15194b.isPlaying()) {
                this.f15194b.pause();
                y();
            }
            return true;
        } else if (keyCode != 4 && keyCode != 82) {
            show(3000);
            return super.dispatchKeyEvent(keyEvent);
        } else {
            hide();
            return true;
        }
    }

    @Override // android.widget.MediaController
    public void hide() {
        if (this.f15198f != null && this.f15206n) {
            try {
                this.f15215w.removeMessages(2);
                if (this.f15210r) {
                    setVisibility(8);
                } else {
                    this.f15196d.dismiss();
                }
            } catch (IllegalArgumentException unused) {
                w0.a("MediaController already removed", new Object[0]);
            }
            this.f15206n = false;
            f fVar = this.f15214v;
            if (fVar != null) {
                fVar.onHidden();
            }
        }
    }

    @Override // android.widget.MediaController
    public boolean isShowing() {
        return this.f15206n;
    }

    @Override // android.widget.MediaController, android.view.View
    public void onFinishInflate() {
        View view = this.f15199g;
        if (view != null) {
            s(view);
        }
        super.onFinishInflate();
    }

    @Override // android.widget.MediaController, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        show(3000);
        return true;
    }

    @Override // android.widget.MediaController, android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        show(3000);
        return false;
    }

    public void q() {
        this.f15210r = true;
    }

    @Override // android.widget.MediaController
    public void setAnchorView(View view) {
        this.f15198f = view;
        w0.e("setAnchorView", "mFromXml=" + this.f15210r);
        if (!this.f15210r) {
            removeAllViews();
            View v2 = v();
            this.f15199g = v2;
            this.f15196d.setContentView(v2);
            this.f15196d.setWidth(-1);
            this.f15196d.setHeight(-2);
        }
        if (this.f15199g == null) {
            this.f15199g = v();
        }
        if (this.f15210r) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
            View view2 = this.f15198f;
            if (view2 instanceof RelativeLayout) {
                ((RelativeLayout) view2).addView(this);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    layoutParams.height = getResources().getDimensionPixelSize(R.dimen.mediacontroller_height);
                    layoutParams.addRule(12, -1);
                }
            } else if (view2 instanceof LinearLayout) {
                ((LinearLayout) view2).addView(this);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = -1;
                    layoutParams2.height = getResources().getDimensionPixelSize(R.dimen.mediacontroller_height);
                    layoutParams2.gravity = 80;
                }
            } else if (view2 instanceof FrameLayout) {
                ((FrameLayout) view2).addView(this);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = -1;
                    layoutParams3.height = getResources().getDimensionPixelSize(R.dimen.mediacontroller_height);
                    layoutParams3.gravity = 80;
                }
            }
        }
        s(this.f15199g);
        postInvalidate();
    }

    public void setAnimationStyle(int i4) {
        this.f15197e = i4;
    }

    @Override // android.widget.MediaController, android.view.View
    public void setEnabled(boolean z4) {
        ImageButton imageButton = this.f15211s;
        if (imageButton != null) {
            imageButton.setEnabled(z4);
        }
        SeekBar seekBar = this.f15200h;
        if (seekBar != null) {
            seekBar.setEnabled(z4);
        }
        super.setEnabled(z4);
    }

    public void setFullScreen(boolean z4) {
        this.f15208p = z4;
        x();
    }

    public void setInfoView(OutlineTextView outlineTextView) {
        this.f15204l = outlineTextView;
    }

    public void setInstantSeeking(boolean z4) {
        this.f15209q = z4;
    }

    public void setMediaPlayer(e eVar) {
        this.f15194b = eVar;
        y();
        x();
    }

    public void setOnHiddenListener(f fVar) {
        this.f15214v = fVar;
    }

    public void setOnShownListener(g gVar) {
        this.f15213u = gVar;
    }

    @TargetApi(16)
    public void setWindowLayoutType() {
        if (Build.VERSION.SDK_INT >= 14) {
            try {
                this.f15198f.setSystemUiVisibility(512);
                PopupWindow.class.getMethod("setWindowLayoutType", Integer.TYPE).invoke(this.f15196d, 1003);
            } catch (Exception e5) {
                w0.b("setWindowLayoutType", e5);
            }
        }
    }

    @Override // android.widget.MediaController
    public void show() {
        show(3000);
    }

    public boolean u() {
        return this.f15208p;
    }

    protected View v() {
        return ((LayoutInflater) this.f15195c.getSystemService("layout_inflater")).inflate(getResources().getIdentifier("mediacontroller", "layout", this.f15195c.getPackageName()), this);
    }

    void x() {
        ImageButton imageButton;
        if (this.f15199g == null || (imageButton = this.f15203k) == null) {
            return;
        }
        if (this.f15208p) {
            imageButton.setImageResource(getResources().getIdentifier("mediacontroller_fullscreen_out", "drawable", this.f15195c.getPackageName()));
        } else {
            imageButton.setImageResource(getResources().getIdentifier("mediacontroller_fullscreen_in", "drawable", this.f15195c.getPackageName()));
        }
    }

    @Override // android.widget.MediaController
    public void show(int i4) {
        View view;
        if (!this.f15206n && (view = this.f15198f) != null && view.getWindowToken() != null) {
            ImageButton imageButton = this.f15211s;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
            if (this.f15210r) {
                setVisibility(0);
            } else {
                int[] iArr = new int[2];
                this.f15198f.getLocationOnScreen(iArr);
                Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + this.f15198f.getWidth(), iArr[1] + this.f15198f.getHeight());
                this.f15196d.setAnimationStyle(this.f15197e);
                setWindowLayoutType();
                this.f15196d.showAtLocation(this.f15198f, 0, rect.left, rect.bottom);
            }
            this.f15206n = true;
            g gVar = this.f15213u;
            if (gVar != null) {
                gVar.onShown();
            }
        }
        y();
        x();
        this.f15215w.sendEmptyMessage(2);
        if (i4 != 0) {
            this.f15215w.removeMessages(1);
            Handler handler = this.f15215w;
            handler.sendMessageDelayed(handler.obtainMessage(1), i4);
        }
    }

    public MediaController(Context context) {
        super(context);
        this.f15209q = false;
        this.f15210r = false;
        this.f15215w = new a();
        this.f15216x = new b();
        this.f15217y = new c();
        this.f15218z = new d();
        if (this.f15210r || !r(context)) {
            return;
        }
        t();
    }
}
