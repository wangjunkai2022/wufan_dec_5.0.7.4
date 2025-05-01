package com.join.mgps.va.overmind;

import android.os.Build;
import android.os.Environment;
import com.join.kotlin.ui.cloudarchive.data.ArchiveData;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ArchiveUtils.kt */
/* loaded from: classes5.dex */
public final class a {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final C0388a f54933a = new C0388a(null);

    /* renamed from: b  reason: collision with root package name */
    private static long f54934b;

    /* compiled from: ArchiveUtils.kt */
    @SourceDebugExtension({"SMAP\nArchiveUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArchiveUtils.kt\ncom/join/mgps/va/overmind/ArchiveUtils$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,145:1\n37#2,2:146\n*S KotlinDebug\n*F\n+ 1 ArchiveUtils.kt\ncom/join/mgps/va/overmind/ArchiveUtils$Companion\n*L\n83#1:146,2\n*E\n"})
    /* renamed from: com.join.mgps.va.overmind.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0388a {
        private C0388a() {
        }

        public /* synthetic */ C0388a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(List<ArchiveData> list, String str, int i4, String str2, String str3) {
            File[] listFiles = new File(str).listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return;
            }
            int i5 = 0;
            if (i4 == 0) {
                ArchiveData archiveData = new ArchiveData();
                archiveData.setArchiveLocalPath(str);
                int length = listFiles.length;
                boolean z4 = false;
                while (i5 < length) {
                    File file = listFiles[i5];
                    Intrinsics.checkNotNullExpressionValue(file, "file");
                    z4 = b(str2, file);
                    if (z4) {
                        z4 = true;
                    }
                    if (z4) {
                        break;
                    }
                    i5++;
                }
                if (z4) {
                    archiveData.setAddTime(d(new File(archiveData.getArchiveLocalPath())));
                    archiveData.setPackageName(str3);
                    list.add(archiveData);
                    return;
                }
                return;
            }
            int length2 = listFiles.length;
            while (i5 < length2) {
                File file2 = listFiles[i5];
                Intrinsics.checkNotNullExpressionValue(file2, "file");
                if (b(str2, file2)) {
                    ArchiveData archiveData2 = new ArchiveData();
                    archiveData2.setArchiveLocalPath(file2.getAbsolutePath());
                    archiveData2.setAddTime(d(new File(archiveData2.getArchiveLocalPath())));
                    archiveData2.setPackageName(str3);
                    list.add(archiveData2);
                }
                i5++;
            }
        }

        private final boolean b(String str, File file) {
            if (str == null || Intrinsics.areEqual(str, "")) {
                return true;
            }
            String[] strArr = (String[]) StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (strArr.length > 0) {
                for (String str2 : strArr) {
                    if (str2 == file.getName()) {
                        return true;
                    }
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "file.name");
                    if (StringsKt.startsWith$default(name, str2, false, 2, (Object) null)) {
                        return true;
                    }
                    String name2 = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "file.name");
                    if (StringsKt.endsWith$default(name2, str2, false, 2, (Object) null)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        private final void c(File file) {
            int i4 = 0;
            if (Build.VERSION.SDK_INT >= 26) {
                if (file.isDirectory()) {
                    File[] filess = file.listFiles();
                    Intrinsics.checkNotNullExpressionValue(filess, "filess");
                    int length = filess.length;
                    while (i4 < length) {
                        File f5 = filess[i4];
                        Intrinsics.checkNotNullExpressionValue(f5, "f");
                        c(f5);
                        i4++;
                    }
                    return;
                }
                long j4 = 0;
                try {
                    j4 = Files.readAttributes(file.toPath(), BasicFileAttributes.class, new LinkOption[0]).lastModifiedTime().toMillis();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                if (j4 > e()) {
                    g(j4);
                }
            } else if (file.isDirectory()) {
                File[] filess2 = file.listFiles();
                Intrinsics.checkNotNullExpressionValue(filess2, "filess");
                int length2 = filess2.length;
                while (i4 < length2) {
                    File f6 = filess2[i4];
                    Intrinsics.checkNotNullExpressionValue(f6, "f");
                    c(f6);
                    i4++;
                }
            } else {
                long lastModified = file.lastModified();
                if (lastModified > e()) {
                    g(lastModified);
                }
            }
        }

        private final long d(File file) {
            g(0L);
            c(file);
            return e();
        }

        public final long e() {
            return a.f54934b;
        }

        @Nullable
        public final ArrayList<ArchiveData> f(@NotNull String packageName, @NotNull String path, @NotNull String archiveFileSuffix, int i4) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(archiveFileSuffix, "archiveFileSuffix");
            ArrayList<ArchiveData> arrayList = new ArrayList<>();
            if (!StringsKt.startsWith$default(path, "/Android/data", false, 2, (Object) null) && !StringsKt.startsWith$default(path, "Android/data", false, 2, (Object) null)) {
                if (StringsKt.startsWith$default(path, "/data/data", false, 2, (Object) null)) {
                    String absolutePath = com.xinzhu.overmind.a.s(packageName, 0).getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getDataDir_plugin(packageName, 0).absolutePath");
                    StringBuilder sb = new StringBuilder();
                    sb.append(absolutePath);
                    sb.append(StringsKt.replace$default(path, "/data/data/" + packageName, "", false, 4, (Object) null));
                    a(arrayList, sb.toString(), i4, archiveFileSuffix, packageName);
                } else {
                    a(arrayList, Environment.getExternalStorageDirectory().getAbsolutePath() + path, i4, archiveFileSuffix, packageName);
                }
            } else {
                if (StringsKt.startsWith$default(path, "Android/data", false, 2, (Object) null)) {
                    path = '/' + path;
                }
                String absolutePath2 = com.xinzhu.overmind.a.b0().getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath2, "getVirtualRoot_plugin().absolutePath");
                a(arrayList, absolutePath2 + path, i4, archiveFileSuffix, packageName);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(arrayList.size());
            sb2.append("");
            return arrayList;
        }

        public final void g(long j4) {
            a.f54934b = j4;
        }
    }
}
