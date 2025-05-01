package com.tencent.cos.task.slice;

import android.os.Environment;
import android.text.TextUtils;
import com.tencent.cos.COSClient;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import q.a;
/* loaded from: classes6.dex */
public class FileSlicePart implements Serializable {
    private static final long serialVersionUID = -8625186156974023016L;
    public String appid;
    public String biz_attr;
    public String bucket;
    public String cosPath;
    public String insertOnly;
    public int requestId;
    public String session;
    public String sha;
    public String sign;
    public ArrayList<SlicePart> sliceParts;
    public int sliceSize;
    public boolean slice_init_flag;
    public String srcPath;

    public synchronized void deleteFile(String str) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            file.delete();
        }
    }

    public String getDirPath() {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        String str = File.separator;
        sb.append(str);
        sb.append(a.f73126a);
        sb.append(str);
        sb.append("data");
        sb.append(str);
        sb.append(COSClient.getContext().getPackageName());
        sb.append(str);
        sb.append("caches");
        String sb2 = sb.toString();
        File file = new File(sb2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return sb2;
    }

    protected synchronized void init(FileSlicePart fileSlicePart) {
        this.appid = fileSlicePart.appid;
        this.bucket = fileSlicePart.bucket;
        this.cosPath = fileSlicePart.cosPath;
        this.srcPath = fileSlicePart.srcPath;
        this.biz_attr = fileSlicePart.biz_attr;
        this.insertOnly = fileSlicePart.insertOnly;
        this.sliceSize = fileSlicePart.sliceSize;
        this.sha = fileSlicePart.sha;
        this.sliceParts = fileSlicePart.sliceParts;
        this.sign = fileSlicePart.sign;
        this.session = fileSlicePart.session;
        this.slice_init_flag = fileSlicePart.slice_init_flag;
        this.requestId = fileSlicePart.requestId;
    }

    public synchronized boolean isValid(String str) {
        if (TextUtils.isEmpty(str) && this.srcPath.equals(str)) {
            File file = new File(str);
            File file2 = new File(this.srcPath);
            if (file.canRead() && file.length() == file2.length()) {
                return file.lastModified() == file2.lastModified();
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public synchronized void loadFileSlicePart(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        ClassNotFoundException e5;
        IOException e6;
        StreamCorruptedException e7;
        FileNotFoundException e8;
        try {
            try {
                fileInputStream = new FileInputStream((String) str);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e9) {
            fileInputStream = null;
            e8 = e9;
            str = 0;
        } catch (StreamCorruptedException e10) {
            fileInputStream = null;
            e7 = e10;
            str = 0;
        } catch (IOException e11) {
            fileInputStream = null;
            e6 = e11;
            str = 0;
        } catch (ClassNotFoundException e12) {
            fileInputStream = null;
            e5 = e12;
            str = 0;
        } catch (Throwable th3) {
            fileInputStream = null;
            th = th3;
            str = 0;
        }
        try {
            str = new ObjectInputStream(fileInputStream);
        } catch (FileNotFoundException e13) {
            e8 = e13;
            str = 0;
        } catch (StreamCorruptedException e14) {
            e7 = e14;
            str = 0;
        } catch (IOException e15) {
            e6 = e15;
            str = 0;
        } catch (ClassNotFoundException e16) {
            e5 = e16;
            str = 0;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e17) {
                    e17.printStackTrace();
                }
            }
            if (str != 0) {
                try {
                    str.close();
                } catch (IOException e18) {
                    e18.printStackTrace();
                }
            }
            throw th;
        }
        try {
            init((FileSlicePart) str.readObject());
            try {
                fileInputStream.close();
            } catch (IOException e19) {
                e19.printStackTrace();
            }
            try {
                str.close();
            } catch (IOException e20) {
                e = e20;
                e.printStackTrace();
            }
        } catch (FileNotFoundException e21) {
            e8 = e21;
            e8.printStackTrace();
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e22) {
                    e22.printStackTrace();
                }
            }
            if (str != 0) {
                try {
                    str.close();
                } catch (IOException e23) {
                    e = e23;
                    e.printStackTrace();
                }
            }
        } catch (StreamCorruptedException e24) {
            e7 = e24;
            e7.printStackTrace();
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e25) {
                    e25.printStackTrace();
                }
            }
            if (str != 0) {
                try {
                    str.close();
                } catch (IOException e26) {
                    e = e26;
                    e.printStackTrace();
                }
            }
        } catch (IOException e27) {
            e6 = e27;
            e6.printStackTrace();
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e28) {
                    e28.printStackTrace();
                }
            }
            if (str != 0) {
                try {
                    str.close();
                } catch (IOException e29) {
                    e = e29;
                    e.printStackTrace();
                }
            }
        } catch (ClassNotFoundException e30) {
            e5 = e30;
            e5.printStackTrace();
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e31) {
                    e31.printStackTrace();
                }
            }
            if (str != 0) {
                try {
                    str.close();
                } catch (IOException e32) {
                    e = e32;
                    e.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.ObjectOutputStream] */
    public synchronized void saveFileSlicePart(String str) {
        FileOutputStream fileOutputStream;
        Throwable th;
        IOException e5;
        FileNotFoundException e6;
        try {
            try {
                fileOutputStream = new FileOutputStream((String) str);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                str = new ObjectOutputStream(fileOutputStream);
                try {
                    str.writeObject(this);
                    str.flush();
                    try {
                        fileOutputStream.close();
                    } catch (IOException e7) {
                        e7.printStackTrace();
                    }
                    try {
                        str.close();
                    } catch (IOException e8) {
                        e = e8;
                        e.printStackTrace();
                    }
                } catch (FileNotFoundException e9) {
                    e6 = e9;
                    e6.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (str != 0) {
                        try {
                            str.close();
                        } catch (IOException e11) {
                            e = e11;
                            e.printStackTrace();
                        }
                    }
                } catch (IOException e12) {
                    e5 = e12;
                    e5.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    if (str != 0) {
                        try {
                            str.close();
                        } catch (IOException e14) {
                            e = e14;
                            e.printStackTrace();
                        }
                    }
                }
            } catch (FileNotFoundException e15) {
                e6 = e15;
                str = 0;
            } catch (IOException e16) {
                e5 = e16;
                str = 0;
            } catch (Throwable th3) {
                th = th3;
                str = 0;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e17) {
                        e17.printStackTrace();
                    }
                }
                if (str != 0) {
                    try {
                        str.close();
                    } catch (IOException e18) {
                        e18.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e19) {
            fileOutputStream = null;
            e6 = e19;
            str = 0;
        } catch (IOException e20) {
            fileOutputStream = null;
            e5 = e20;
            str = 0;
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
            str = 0;
        }
    }

    public synchronized void updateAfterSliceInit(String str, int i4, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.session = str;
        this.sliceSize = i4;
        this.sha = str2;
        this.slice_init_flag = true;
        saveFileSlicePart(str3);
    }

    public synchronized void updateSlicePart(int i4, boolean z4) {
        this.sliceParts.get(i4).setOverFlag(z4);
    }
}
