package com.xinzhu.haunted;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.ParameterizedTypeName;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import com.squareup.javapoet.WildcardTypeName;
import com.xinzhu.haunted.HauntedScanner;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import javax.lang.model.element.Modifier;
/* loaded from: classes6.dex */
public class HauntedWriter {

    /* renamed from: h  reason: collision with root package name */
    private static final TypeName f65668h = ParameterizedTypeName.get(ClassName.get(AtomicReference.class), new TypeName[]{ClassName.get(Field.class)});

    /* renamed from: i  reason: collision with root package name */
    private static final TypeName f65669i = ParameterizedTypeName.get(ClassName.get(AtomicReference.class), new TypeName[]{ClassName.get(Method.class)});

    /* renamed from: j  reason: collision with root package name */
    private static final TypeName f65670j = ParameterizedTypeName.get(ClassName.get(AtomicReference.class), new TypeName[]{ClassName.get(Constructor.class)});

    /* renamed from: k  reason: collision with root package name */
    private static final TypeName f65671k = ParameterizedTypeName.get(ClassName.get(Class.class), new TypeName[]{WildcardTypeName.subtypeOf(Object.class)});

    /* renamed from: a  reason: collision with root package name */
    private HauntedScanner f65672a;

    /* renamed from: b  reason: collision with root package name */
    private HauntedWriter f65673b;

    /* renamed from: c  reason: collision with root package name */
    private TypeSpec.Builder f65674c;

    /* renamed from: d  reason: collision with root package name */
    private String f65675d;

    /* renamed from: e  reason: collision with root package name */
    private String f65676e;

    /* renamed from: f  reason: collision with root package name */
    private TypeSpec.Builder f65677f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f65678g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public enum REFLECT_TYPE {
        TYPE_CONSTRUCTOR,
        TYPE_METHOD,
        TYPE_FIELD_GET,
        TYPE_FIELD_SET
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f65679a;

        static {
            int[] iArr = new int[HauntedScanner.ClassDecl.DeclKind.values().length];
            f65679a = iArr;
            try {
                iArr[HauntedScanner.ClassDecl.DeclKind.DIRECT_REFERENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65679a[HauntedScanner.ClassDecl.DeclKind.STRING_REFERENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65679a[HauntedScanner.ClassDecl.DeclKind.EGO_REFERENCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class b {
        private b() {
        }

        public static Object a(HauntedScanner.ClassDecl classDecl) {
            int i4 = a.f65679a[classDecl.f65656c.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new RuntimeException("Invalid ClassDecl kind!");
                    }
                    throw new RuntimeException("TODO");
                }
                return classDecl.f65654a.replace("MetaHt", "");
            }
            return classDecl.f65655b;
        }

        public static String b(HauntedScanner.ClassDecl classDecl) {
            int i4 = a.f65679a[classDecl.f65656c.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new RuntimeException("Invalid ClassDecl kind!");
                    }
                    throw new RuntimeException("TODO");
                }
                return "$S";
            }
            return "$T";
        }

        public static String[] c(String str) {
            int lastIndexOf = str.lastIndexOf(46);
            if (-1 != lastIndexOf) {
                String substring = str.substring(0, lastIndexOf);
                String[] split = str.substring(lastIndexOf + 1).split("$");
                String[] strArr = new String[split.length];
                strArr[0] = substring;
                System.arraycopy(strArr, 1, split, 0, split.length);
                return strArr;
            }
            throw new RuntimeException("Invalid full class name.");
        }
    }

    public HauntedWriter(HauntedScanner hauntedScanner) {
        this(hauntedScanner, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0774  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.squareup.javapoet.TypeSpec a() {
        /*
            Method dump skipped, instructions count: 3877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xinzhu.haunted.HauntedWriter.a():com.squareup.javapoet.TypeSpec");
    }

    private String b() {
        if (this.f65673b == null || this.f65672a.f65649d) {
            return "TYPE";
        }
        return d() + "_TYPE";
    }

    private String c(String str) {
        if (this.f65673b == null || this.f65672a.f65649d) {
            return str;
        }
        return d() + "_" + str;
    }

    private String d() {
        if (this.f65676e == null) {
            StringBuilder sb = new StringBuilder("");
            sb.insert(0, this.f65675d);
            for (HauntedWriter hauntedWriter = this.f65673b; hauntedWriter != null; hauntedWriter = hauntedWriter.f65673b) {
                if (hauntedWriter.f65673b != null) {
                    sb.insert(0, hauntedWriter.f65675d + "_");
                }
            }
            this.f65676e = sb.toString();
        }
        return this.f65676e;
    }

    private String f(HauntedScanner.ClassDecl classDecl) {
        return classDecl.c() ? "return" : classDecl.b() ? "return 0" : classDecl.a() ? "return false" : "return null";
    }

    private String g(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return str.substring(0, lastIndexOf + 1) + str.substring(lastIndexOf + 5);
    }

    private TypeSpec.Builder h() {
        if (this.f65677f == null) {
            HauntedWriter hauntedWriter = this;
            while (true) {
                HauntedWriter hauntedWriter2 = hauntedWriter.f65673b;
                if (hauntedWriter2 == null) {
                    break;
                }
                hauntedWriter = hauntedWriter2;
            }
            this.f65677f = hauntedWriter.f65674c;
        }
        return this.f65677f;
    }

    private boolean i() {
        if (this.f65678g == null) {
            for (HauntedScanner.a aVar : this.f65672a.f65652g) {
                if (!aVar.f65657a) {
                    this.f65678g = Boolean.TRUE;
                    return true;
                }
            }
            for (HauntedScanner.b bVar : this.f65672a.f65651f) {
                if (!bVar.f65660a) {
                    this.f65678g = Boolean.TRUE;
                    return true;
                }
            }
            for (HauntedScanner hauntedScanner : this.f65672a.f65653h) {
                if (!hauntedScanner.f65649d) {
                    this.f65678g = Boolean.TRUE;
                    return true;
                }
            }
            if (!this.f65672a.f65650e.isEmpty()) {
                this.f65678g = Boolean.TRUE;
                return true;
            }
            this.f65678g = Boolean.FALSE;
        }
        return this.f65678g.booleanValue();
    }

    private MethodSpec.Builder j(MethodSpec.Builder builder, String str, String str2, String str3, HauntedScanner.ClassDecl classDecl, REFLECT_TYPE reflect_type, String str4, HauntedScanner.ClassDecl... classDeclArr) {
        String str5;
        String str6;
        String str7 = str3 == null ? str : str3;
        String str8 = str2 == null ? str : str2;
        if (reflect_type == REFLECT_TYPE.TYPE_METHOD) {
            str5 = "method_" + c(str8);
            str6 = "HtClass.initHtMethod";
        } else if (reflect_type == REFLECT_TYPE.TYPE_FIELD_GET || reflect_type == REFLECT_TYPE.TYPE_FIELD_SET) {
            str5 = "field_" + c(str8);
            str6 = "HtClass.initHtField";
        } else if (reflect_type != REFLECT_TYPE.TYPE_CONSTRUCTOR) {
            throw new RuntimeException("TODO");
        } else {
            str5 = "constructor_" + c(str8);
            str6 = "HtClass.initHtConstructor";
        }
        for (int i4 = 0; i4 < classDeclArr.length; i4++) {
            HauntedScanner.ClassDecl classDecl2 = classDeclArr[i4];
            HauntedScanner.ClassDecl.DeclKind declKind = classDecl2.f65656c;
            if (declKind == HauntedScanner.ClassDecl.DeclKind.DIRECT_REFERENCE) {
                builder.addParameter(ClassName.get(classDecl2.f65655b), "arg" + i4, new Modifier[0]);
            } else if (declKind == HauntedScanner.ClassDecl.DeclKind.STRING_REFERENCE) {
                builder.addParameter(Object.class, "arg" + i4, new Modifier[0]);
            } else if (declKind == HauntedScanner.ClassDecl.DeclKind.EGO_REFERENCE) {
                builder.addParameter(ClassName.bestGuess(g(classDecl2.f65654a)), "arg" + i4, new Modifier[0]);
            }
        }
        builder.beginControlFlow("if(" + str5 + ".get() == null)", new Object[0]);
        builder.beginControlFlow("if(!init_" + str5 + ")", new Object[0]);
        StringBuilder sb = new StringBuilder(str5 + ".compareAndSet(null, " + str6 + "(" + str4 + ", \"" + str7 + m.a.f71493g);
        for (HauntedScanner.ClassDecl classDecl3 : classDeclArr) {
            HauntedScanner.ClassDecl.DeclKind declKind2 = classDecl3.f65656c;
            if (declKind2 == HauntedScanner.ClassDecl.DeclKind.DIRECT_REFERENCE) {
                sb.append(", " + classDecl3.f65655b.toString() + ".class");
            } else if (declKind2 == HauntedScanner.ClassDecl.DeclKind.STRING_REFERENCE) {
                sb.append(", \"" + classDecl3.f65654a.replace("$", "$$") + m.a.f71493g);
            } else if (declKind2 == HauntedScanner.ClassDecl.DeclKind.EGO_REFERENCE) {
                sb.append(", " + g(classDecl3.f65654a) + ".class");
            }
        }
        sb.append("))");
        builder.addStatement(sb.toString(), new Object[0]).addStatement("init_" + str5 + " = true", new Object[0]);
        builder.beginControlFlow("if(" + str5 + ".get() == null)", new Object[0]).addStatement("return false", new Object[0]).nextControlFlow("else", new Object[0]).addStatement("return true", new Object[0]).endControlFlow();
        builder.nextControlFlow("else", new Object[0]);
        builder.addStatement("return false", new Object[0]);
        builder.endControlFlow().endControlFlow().addStatement("return true", new Object[0]);
        return builder;
    }

    public JavaFile e() {
        return JavaFile.builder(this.f65672a.f65646a, a()).addFileComment("AUTO GENERATED FILE, DO NOT MODIFY", new Object[0]).build();
    }

    private HauntedWriter(HauntedScanner hauntedScanner, HauntedWriter hauntedWriter) {
        this.f65678g = null;
        this.f65672a = hauntedScanner;
        this.f65673b = hauntedWriter;
    }
}
