package com.join.mgps.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.Util.v;
import com.join.mgps.Util.v0;
import com.join.mgps.activity.MGMainActivity_;
import com.join.mgps.dto.VersionDto;
import io.netty.handler.codec.http.multipart.HttpPostBodyUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import net.lingala.zip4j.util.e;
import org.androidannotations.annotations.EService;
import org.apache.http.client.ClientProtocolException;
@EService
/* loaded from: classes4.dex */
public class UpdateService extends Service {

    /* renamed from: b  reason: collision with root package name */
    private NotificationManager f54568b;

    /* renamed from: e  reason: collision with root package name */
    private b f54571e;

    /* renamed from: h  reason: collision with root package name */
    private NotificationCompat.Builder f54574h;

    /* renamed from: j  reason: collision with root package name */
    private VersionDto f54576j;

    /* renamed from: c  reason: collision with root package name */
    private File f54569c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f54570d = false;

    /* renamed from: f  reason: collision with root package name */
    private int f54572f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f54573g = 1234;

    /* renamed from: i  reason: collision with root package name */
    boolean f54575i = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean f54577k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f54578b;

        a(String str) {
            this.f54578b = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i4 = 0;
            try {
                try {
                    try {
                        try {
                            UpdateService.this.f54577k = true;
                            HttpURLConnection o4 = UpdateService.o(this.f54578b);
                            long contentLength = o4.getContentLength();
                            v0.d("app更新文件大小", contentLength + " ");
                            v0.d("app更新code ", o4.getResponseCode() + " ");
                            InputStream inputStream = UpdateService.o(this.f54578b).getInputStream();
                            if (inputStream != null) {
                                File file = new File(v.f28104d, "/aia");
                                if (!file.exists() && !file.isDirectory()) {
                                    file.mkdir();
                                }
                                UpdateService updateService = UpdateService.this;
                                String str = v.f28104d;
                                StringBuilder sb = new StringBuilder();
                                sb.append("/aia/");
                                String str2 = this.f54578b;
                                sb.append(str2.substring(str2.lastIndexOf(e.F0) + 1));
                                updateService.f54569c = new File(str, sb.toString());
                                if (UpdateService.this.f54569c.exists()) {
                                    UpdateService.this.f54569c.delete();
                                }
                                UpdateService.this.f54569c.createNewFile();
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                                FileOutputStream fileOutputStream = new FileOutputStream(UpdateService.this.f54569c);
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                                long j4 = 0;
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read == -1 || UpdateService.this.f54570d) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, i4, read);
                                    j4 += read;
                                    double d5 = j4;
                                    double d6 = contentLength;
                                    Double.isNaN(d5);
                                    Double.isNaN(d6);
                                    int i5 = (int) ((d5 / d6) * 100.0d);
                                    if (i5 - UpdateService.this.f54572f >= 5) {
                                        UpdateService.this.f54572f = i5;
                                        UpdateService.this.f54571e.sendMessage(UpdateService.this.f54571e.obtainMessage(3, Integer.valueOf(i5)));
                                    }
                                    i4 = 0;
                                }
                                bufferedOutputStream.flush();
                                bufferedOutputStream.close();
                                fileOutputStream.flush();
                                fileOutputStream.close();
                                inputStream.close();
                                bufferedInputStream.close();
                            }
                            if (!UpdateService.this.f54570d) {
                                UpdateService.this.f54571e.sendMessage(UpdateService.this.f54571e.obtainMessage(2, UpdateService.this.f54569c));
                            } else {
                                UpdateService.this.f54569c.delete();
                            }
                        } catch (Exception e5) {
                            UpdateService.this.f54571e.sendMessage(UpdateService.this.f54571e.obtainMessage(4, "下载更新文件失败"));
                            e5.printStackTrace();
                        }
                    } catch (ClientProtocolException e6) {
                        UpdateService.this.f54571e.sendMessage(UpdateService.this.f54571e.obtainMessage(4, "下载更新文件失败"));
                        e6.printStackTrace();
                    }
                } catch (IOException e7) {
                    UpdateService.this.f54571e.sendMessage(UpdateService.this.f54571e.obtainMessage(4, "下载更新文件失败"));
                    e7.printStackTrace();
                }
            } finally {
                UpdateService.this.f54577k = false;
            }
        }
    }

    /* loaded from: classes4.dex */
    class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private Context f54580a;

        public b(Looper looper, Context context) {
            super(looper);
            this.f54580a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null) {
                UpdateService updateService = UpdateService.this;
                if (updateService.f54575i) {
                    if (message.what != 2) {
                        return;
                    }
                    Intent intent = new Intent(o1.a.f71999f0);
                    UpdateService.this.f54576j.setFilepath(((File) message.obj).getAbsolutePath());
                    intent.putExtra("papaUpdateinfo", UpdateService.this.f54576j);
                    UpdateService.this.sendBroadcast(intent);
                    UpdateService.this.stopSelf();
                    return;
                }
                int i4 = message.what;
                if (i4 == 0) {
                    Toast.makeText(this.f54580a, message.obj.toString(), 0).show();
                } else if (i4 == 2) {
                    updateService.f54572f = 0;
                    try {
                        UpdateService.this.f54568b.cancel(UpdateService.this.f54573g);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    UpdateService.this.a((File) message.obj, this.f54580a);
                    UpdateService.this.stopSelf();
                } else if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    try {
                        updateService.f54568b.cancel(UpdateService.this.f54573g);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                } else {
                    try {
                        NotificationCompat.Builder builder = updateService.f54574h;
                        builder.setContentText("已下载" + UpdateService.this.f54572f + "%");
                        UpdateService.this.f54574h.setProgress(100, UpdateService.this.f54572f, false);
                        UpdateService.this.f54568b.notify(UpdateService.this.f54573g, UpdateService.this.f54574h.build());
                    } catch (Exception e7) {
                        e7.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file, Context context) {
        com.join.android.app.common.utils.e.l0(context).w(this, file);
    }

    private void n(String str) {
        new a(str).start();
    }

    public static HttpURLConnection o(String str) throws Exception {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setRequestProperty("Content-Type", HttpPostBodyUtil.DEFAULT_BINARY_CONTENT_TYPE);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        try {
            if (intent != null) {
                try {
                    this.f54575i = intent.getBooleanExtra("downNotInstall", false);
                    this.f54576j = (VersionDto) intent.getSerializableExtra("papaUpdateinfo");
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
            if (!this.f54575i) {
                this.f54568b = (NotificationManager) getSystemService("notification");
                if (Build.VERSION.SDK_INT >= 26) {
                    NotificationChannel notificationChannel = new NotificationChannel("channel_1", "更新", 2);
                    notificationChannel.setSound(null, null);
                    notificationChannel.setImportance(2);
                    this.f54568b.createNotificationChannel(notificationChannel);
                    this.f54574h = new NotificationCompat.Builder(this, "channel_1");
                } else {
                    this.f54574h = new NotificationCompat.Builder(this);
                }
                this.f54574h.setSmallIcon(R.drawable.icon).setContentText("已下载0%").setContentTitle(getResources().getString(R.string.app_name)).setContentIntent(PendingIntent.getActivity(this, (int) SystemClock.uptimeMillis(), new Intent(this, MGMainActivity_.class), 134217728)).setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.icon));
                this.f54574h.setOnlyAlertOnce(true);
                this.f54568b.notify(this.f54573g, this.f54574h.build());
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        b bVar = new b(Looper.myLooper(), this);
        this.f54571e = bVar;
        this.f54571e.sendMessage(bVar.obtainMessage(3, 0));
        if (intent != null && !intent.getStringExtra("url").equals("") && !this.f54577k) {
            n(intent.getStringExtra("url"));
        }
        return super.onStartCommand(intent, i4, i5);
    }
}
