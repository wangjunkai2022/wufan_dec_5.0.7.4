package com.vincent.videocompressor;

import android.os.AsyncTask;
import com.vincent.videocompressor.VideoController;
/* compiled from: VideoCompress.java */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f64830a = "h";

    /* compiled from: VideoCompress.java */
    /* loaded from: classes6.dex */
    public interface a {
        void onFail();

        void onProgress(float f5);

        void onStart();

        void onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VideoCompress.java */
    /* loaded from: classes6.dex */
    public static class b extends AsyncTask<String, Float, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private a f64831a;

        /* renamed from: b  reason: collision with root package name */
        private int f64832b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VideoCompress.java */
        /* loaded from: classes6.dex */
        public class a implements VideoController.b {
            a() {
            }

            @Override // com.vincent.videocompressor.VideoController.b
            public void onProgress(float f5) {
                b.this.publishProgress(Float.valueOf(f5));
            }
        }

        public b(a aVar, int i4) {
            this.f64831a = aVar;
            this.f64832b = i4;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public Boolean doInBackground(String... strArr) {
            return Boolean.valueOf(VideoController.d().a(strArr[0], strArr[1], this.f64832b, new a()));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (this.f64831a != null) {
                if (bool.booleanValue()) {
                    this.f64831a.onSuccess();
                } else {
                    this.f64831a.onFail();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: d */
        public void onProgressUpdate(Float... fArr) {
            super.onProgressUpdate(fArr);
            a aVar = this.f64831a;
            if (aVar != null) {
                aVar.onProgress(fArr[0].floatValue());
            }
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            a aVar = this.f64831a;
            if (aVar != null) {
                aVar.onStart();
            }
        }
    }

    public static b a(String str, String str2, a aVar) {
        b bVar = new b(aVar, 1);
        bVar.execute(str, str2);
        return bVar;
    }

    public static b b(String str, String str2, a aVar) {
        b bVar = new b(aVar, 3);
        bVar.execute(str, str2);
        return bVar;
    }

    public static b c(String str, String str2, a aVar) {
        b bVar = new b(aVar, 2);
        bVar.execute(str, str2);
        return bVar;
    }
}
