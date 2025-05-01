package com.netease.nis.quicklogin.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.widget.Toast;
import android.widget.VideoView;
import com.netease.nis.basesdk.Logger;
/* loaded from: classes5.dex */
public class PlayerView extends VideoView {

    /* renamed from: a  reason: collision with root package name */
    private boolean f57651a;

    /* renamed from: b  reason: collision with root package name */
    private int f57652b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements MediaPlayer.OnPreparedListener {

        /* renamed from: com.netease.nis.quicklogin.view.PlayerView$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class C0574a implements MediaPlayer.OnInfoListener {
            C0574a() {
            }

            @Override // android.media.MediaPlayer.OnInfoListener
            public boolean onInfo(MediaPlayer mediaPlayer, int i4, int i5) {
                if (i4 == 3) {
                    PlayerView.this.setBackgroundColor(0);
                    return true;
                }
                return true;
            }
        }

        a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.setOnInfoListener(new C0574a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements MediaPlayer.OnCompletionListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (PlayerView.this.f57651a) {
                PlayerView.this.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c implements MediaPlayer.OnErrorListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i4, int i5) {
            Logger.e("[PlayerView#monitorOnErrorListener] onError what:" + i4 + " extra:" + i5);
            Toast.makeText(PlayerView.this.getContext(), "无法播放此视频,请检查视频文件是否损坏", 0).show();
            PlayerView.this.e();
            return true;
        }
    }

    public PlayerView(Context context) {
        super(context);
        this.f57651a = true;
        a();
    }

    private void b() {
        setOnCompletionListener(new b());
    }

    private void c() {
        setOnErrorListener(new c());
    }

    private void d() {
        setOnPreparedListener(new a());
    }

    public void e() {
        int i4 = this.f57652b;
        if (i4 != 0) {
            setBackgroundResource(i4);
        } else {
            setBackgroundColor(0);
        }
    }

    @Override // android.widget.VideoView, android.view.SurfaceView, android.view.View
    protected void onMeasure(int i4, int i5) {
        setMeasuredDimension(VideoView.resolveSize(getSuggestedMinimumWidth(), i4), VideoView.resolveSize(getSuggestedMinimumHeight(), i5));
    }

    public void setLoadingImageResId(int i4) {
        this.f57652b = i4;
    }

    public void setLoadingImageResId(Drawable drawable) {
    }

    public void setLoopPlay(boolean z4) {
        this.f57651a = z4;
    }

    private void a() {
        d();
        b();
        c();
    }
}
