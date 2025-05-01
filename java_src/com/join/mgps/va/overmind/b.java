package com.join.mgps.va.overmind;

import android.annotation.TargetApi;
import java.io.File;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: NativeLibraryHelperCompat.kt */
/* loaded from: classes5.dex */
public final class b {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    public static final a f54935a = new a(null);

    /* compiled from: NativeLibraryHelperCompat.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean a(@NotNull Set<String> abiList) {
            Intrinsics.checkNotNullParameter(abiList, "abiList");
            for (String str : abiList) {
                if (e(str)) {
                    return true;
                }
            }
            return false;
        }

        @JvmStatic
        @TargetApi(21)
        public final boolean b(@NotNull Set<String> supportedAbis) {
            Intrinsics.checkNotNullParameter(supportedAbis, "supportedAbis");
            for (String str : supportedAbis) {
                if (f(str)) {
                    return true;
                }
            }
            return false;
        }

        @JvmStatic
        @Nullable
        public final String c(@NotNull String[] supportAbis, @NotNull Set<String> abis) {
            Intrinsics.checkNotNullParameter(supportAbis, "supportAbis");
            Intrinsics.checkNotNullParameter(abis, "abis");
            for (String str : supportAbis) {
                if (abis.contains(str)) {
                    return str;
                }
            }
            return null;
        }

        @JvmStatic
        @NotNull
        public final Set<String> d(@Nullable String str) {
            Set<String> emptySet;
            boolean contains$default;
            boolean startsWith$default;
            boolean endsWith$default;
            int indexOf$default;
            int lastIndexOf$default;
            try {
                if (new File(str).exists()) {
                    Enumeration<? extends ZipEntry> entries = new ZipFile(str).entries();
                    HashSet hashSet = new HashSet();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        String name = nextElement.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        contains$default = StringsKt__StringsKt.contains$default((CharSequence) name, (CharSequence) "../", false, 2, (Object) null);
                        if (!contains$default) {
                            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(name, "lib/", false, 2, null);
                            if (startsWith$default && !nextElement.isDirectory()) {
                                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(name, ".so", false, 2, null);
                                if (endsWith$default) {
                                    indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) name, net.lingala.zip4j.util.e.F0, 0, false, 6, (Object) null);
                                    lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) name, net.lingala.zip4j.util.e.F0, 0, false, 6, (Object) null);
                                    String substring = name.substring(indexOf$default + 1, lastIndexOf$default);
                                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    hashSet.add(substring);
                                }
                            }
                        }
                    }
                    return hashSet;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            emptySet = SetsKt__SetsKt.emptySet();
            return emptySet;
        }

        @JvmStatic
        public final boolean e(@NotNull String abi) {
            Intrinsics.checkNotNullParameter(abi, "abi");
            return Intrinsics.areEqual(com.join.mgps.mod.utils.d.f53621d, abi) || Intrinsics.areEqual("armeabi-v7a", abi) || Intrinsics.areEqual(com.join.mgps.mod.utils.d.f53623f, abi) || Intrinsics.areEqual(com.join.mgps.mod.utils.d.f53622e, abi);
        }

        @JvmStatic
        @TargetApi(21)
        public final boolean f(@NotNull String abi) {
            Intrinsics.checkNotNullParameter(abi, "abi");
            return Intrinsics.areEqual("arm64-v8a", abi) || Intrinsics.areEqual("x86_64", abi) || Intrinsics.areEqual("mips64", abi);
        }
    }

    @JvmStatic
    public static final boolean a(@NotNull Set<String> set) {
        return f54935a.a(set);
    }

    @JvmStatic
    @TargetApi(21)
    public static final boolean b(@NotNull Set<String> set) {
        return f54935a.b(set);
    }

    @JvmStatic
    @Nullable
    public static final String c(@NotNull String[] strArr, @NotNull Set<String> set) {
        return f54935a.c(strArr, set);
    }

    @JvmStatic
    @NotNull
    public static final Set<String> d(@Nullable String str) {
        return f54935a.d(str);
    }

    @JvmStatic
    public static final boolean e(@NotNull String str) {
        return f54935a.e(str);
    }

    @JvmStatic
    @TargetApi(21)
    public static final boolean f(@NotNull String str) {
        return f54935a.f(str);
    }
}
