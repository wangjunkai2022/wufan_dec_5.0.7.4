package com.join.mgps.activity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.BaseActivity;
import com.join.android.app.mgsim.wufun.R;
import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.sdcard_lay)
/* loaded from: classes4.dex */
public class SDCardFileExplorerActivity extends BaseActivity {
    @ViewById

    /* renamed from: b  reason: collision with root package name */
    TextView f37135b;
    @ViewById

    /* renamed from: c  reason: collision with root package name */
    ListView f37136c;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    Button f37137d;

    /* renamed from: e  reason: collision with root package name */
    File f37138e;

    /* renamed from: f  reason: collision with root package name */
    File[] f37139f;

    /* loaded from: classes4.dex */
    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            if (SDCardFileExplorerActivity.this.f37139f[i4].isFile()) {
                if (new BigDecimal(SDCardFileExplorerActivity.this.f37139f[i4].length()).divide(new BigDecimal(1048576), 2, 0).floatValue() > 100.0f) {
                    Toast.makeText(SDCardFileExplorerActivity.this, "为了你的流量，上传文件不能超过100M哦", 1).show();
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("srcFile", SDCardFileExplorerActivity.this.f37139f[i4]);
                SDCardFileExplorerActivity.this.setResult(100, intent);
                SDCardFileExplorerActivity.this.finish();
                return;
            }
            File[] listFiles = SDCardFileExplorerActivity.this.f37139f[i4].listFiles();
            if (listFiles != null && listFiles.length != 0) {
                SDCardFileExplorerActivity sDCardFileExplorerActivity = SDCardFileExplorerActivity.this;
                sDCardFileExplorerActivity.f37138e = sDCardFileExplorerActivity.f37139f[i4];
                sDCardFileExplorerActivity.f37139f = listFiles;
                sDCardFileExplorerActivity.h0(listFiles);
                return;
            }
            Toast.makeText(SDCardFileExplorerActivity.this, "当前路径不可访问或者该路径下没有文件", 1).show();
        }
    }

    /* loaded from: classes4.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (SDCardFileExplorerActivity.this.f37138e.getCanonicalPath().equals("/mnt/sdcard")) {
                    return;
                }
                SDCardFileExplorerActivity sDCardFileExplorerActivity = SDCardFileExplorerActivity.this;
                sDCardFileExplorerActivity.f37138e = sDCardFileExplorerActivity.f37138e.getParentFile();
                SDCardFileExplorerActivity sDCardFileExplorerActivity2 = SDCardFileExplorerActivity.this;
                sDCardFileExplorerActivity2.f37139f = sDCardFileExplorerActivity2.f37138e.listFiles();
                SDCardFileExplorerActivity sDCardFileExplorerActivity3 = SDCardFileExplorerActivity.this;
                sDCardFileExplorerActivity3.h0(sDCardFileExplorerActivity3.f37139f);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(File[] fileArr) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < fileArr.length; i4++) {
            HashMap hashMap = new HashMap();
            if (fileArr[i4].isDirectory()) {
                hashMap.put("iconFile", Integer.valueOf((int) R.drawable.folder));
            } else {
                hashMap.put("iconFile", Integer.valueOf((int) R.drawable.file));
            }
            hashMap.put("filename", fileArr[i4].getName());
            long lastModified = new File(fileArr[i4].getName()).lastModified();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(simpleDateFormat.format(new Date(lastModified)));
            hashMap.put("modify", "修改日期：" + simpleDateFormat.format(new Date(lastModified)));
            arrayList.add(hashMap);
        }
        this.f37136c.setAdapter((ListAdapter) new SimpleAdapter(this, arrayList, R.layout.sdcard_list_item, new String[]{"filename", "iconFile"}, new int[]{R.id.file_name, R.id.icon}));
        try {
            TextView textView = this.f37135b;
            textView.setText("当前路径为:" + this.f37138e.getCanonicalPath());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        File file = new File("/mnt/sdcard/");
        if (file.exists()) {
            this.f37138e = file;
            File[] listFiles = file.listFiles();
            this.f37139f = listFiles;
            h0(listFiles);
        }
        this.f37136c.setOnItemClickListener(new a());
        this.f37137d.setOnClickListener(new b());
    }
}
