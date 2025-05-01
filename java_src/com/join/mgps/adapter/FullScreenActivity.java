package com.join.mgps.adapter;

import android.content.Context;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.AbsListView;
import com.BaseAppCompatActivity;
import com.MApplication;
import com.join.android.app.common.utils.MyImageLoader;
import com.join.android.app.component.video.StandardVideoView;
import com.join.android.app.mgsim.wufun.R;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.fullscreen_activity)
/* loaded from: classes4.dex */
public class FullScreenActivity extends BaseAppCompatActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    StandardVideoView f42015b;
    @Extra

    /* renamed from: c  reason: collision with root package name */
    VideoInfo f42016c;

    /* renamed from: d  reason: collision with root package name */
    boolean f42017d = false;

    /* renamed from: e  reason: collision with root package name */
    com.danikula.videocache.i f42018e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FullScreenActivity.this.f42015b.getCurrentState() == 0 || FullScreenActivity.this.f42015b.getCurrentState() == 7) {
                FullScreenActivity.this.f42015b.setMute(false);
                FullScreenActivity.this.f42015b.startPlayLogic();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        if (this.f42016c == null) {
            finish();
            return;
        }
        this.f42018e = g0(this);
        String e5 = this.f42016c.e();
        String a5 = this.f42016c.a();
        this.f42015b.setMuteWhenPlay(false);
        this.f42015b.setNoneNetFinishActivity(true);
        MyImageLoader.h(this.f42015b.f15277b, a5);
        this.f42015b.setPlayTag("FullScreenActivity");
        this.f42015b.setUp(e5, 1, "", a5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void back() {
        finish();
    }

    public void f0(AbsListView absListView) {
    }

    public com.danikula.videocache.i g0(Context context) {
        return MApplication.m(context);
    }

    void h0() {
        new Handler().postDelayed(new a(), 500L);
    }

    @Override // com.BaseAppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (com.papa.gsyvideoplayer.d.c0(this)) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration == null || configuration.orientation != 2) {
            this.f42015b.getBackButton().performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSystemUiHide(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.papa.gsyvideoplayer.d.j0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.papa.gsyvideoplayer.d.j0();
        StandardVideoView.E = this.f42017d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f42017d = StandardVideoView.E;
        h0();
    }

    /* loaded from: classes4.dex */
    public static class VideoInfo implements Parcelable {
        public static final Parcelable.Creator<VideoInfo> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        private String f42019b;

        /* renamed from: c  reason: collision with root package name */
        private String f42020c;

        /* renamed from: d  reason: collision with root package name */
        private MediaPlayer f42021d;

        /* renamed from: e  reason: collision with root package name */
        private int f42022e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f42023f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f42024g;

        /* renamed from: h  reason: collision with root package name */
        private int f42025h;

        /* loaded from: classes4.dex */
        class a implements Parcelable.Creator<VideoInfo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public VideoInfo createFromParcel(Parcel parcel) {
                return new VideoInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public VideoInfo[] newArray(int i4) {
                return new VideoInfo[i4];
            }
        }

        public VideoInfo() {
            this.f42019b = "";
            this.f42020c = "";
            this.f42021d = null;
            this.f42022e = -1;
            this.f42023f = false;
            this.f42024g = false;
            this.f42025h = -1;
        }

        public String a() {
            return this.f42020c;
        }

        public int b() {
            return this.f42025h;
        }

        public MediaPlayer c() {
            return this.f42021d;
        }

        public int d() {
            return this.f42022e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String e() {
            return this.f42019b;
        }

        public boolean f() {
            return this.f42024g;
        }

        public boolean g() {
            return this.f42023f;
        }

        public void h(String str) {
            this.f42020c = str;
        }

        public void i(int i4) {
            this.f42025h = i4;
        }

        public void j(MediaPlayer mediaPlayer) {
            this.f42021d = mediaPlayer;
        }

        public void k(boolean z4) {
            this.f42024g = z4;
        }

        public void l(int i4) {
            this.f42022e = i4;
        }

        public void m(String str) {
            this.f42019b = str;
        }

        public void n(boolean z4) {
            this.f42023f = z4;
        }

        public String toString() {
            return "VideoInfo{playUrl='" + this.f42019b + "', coverUrl='" + this.f42020c + "', mediaPlayer=" + this.f42021d + ", playPosition=" + this.f42022e + ", isPlaying=" + this.f42023f + ", isPaused=" + this.f42024g + ", currentPosition=" + this.f42025h + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f42019b);
            parcel.writeString(this.f42020c);
            parcel.writeInt(this.f42022e);
            parcel.writeInt(this.f42025h);
        }

        public VideoInfo(String str, String str2, MediaPlayer mediaPlayer) {
            this.f42019b = "";
            this.f42020c = "";
            this.f42021d = null;
            this.f42022e = -1;
            this.f42023f = false;
            this.f42024g = false;
            this.f42025h = -1;
            this.f42019b = str;
            this.f42020c = str2;
            this.f42021d = mediaPlayer;
        }

        protected VideoInfo(Parcel parcel) {
            this.f42019b = "";
            this.f42020c = "";
            this.f42021d = null;
            this.f42022e = -1;
            this.f42023f = false;
            this.f42024g = false;
            this.f42025h = -1;
            this.f42019b = parcel.readString();
            this.f42020c = parcel.readString();
            this.f42022e = parcel.readInt();
            this.f42025h = parcel.readInt();
        }

        public VideoInfo(String str, String str2, int i4, boolean z4, boolean z5, int i5) {
            this.f42019b = "";
            this.f42020c = "";
            this.f42021d = null;
            this.f42022e = -1;
            this.f42023f = false;
            this.f42024g = false;
            this.f42025h = -1;
            this.f42019b = str;
            this.f42020c = str2;
            this.f42022e = i4;
            this.f42023f = z4;
            this.f42024g = z5;
            this.f42025h = i5;
        }
    }
}
