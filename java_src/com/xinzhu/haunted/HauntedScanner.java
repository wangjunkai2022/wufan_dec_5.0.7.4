package com.xinzhu.haunted;

import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.code.Type;
import com.xinzhu.overmind.annotation.Haunted;
import com.xinzhu.overmind.annotation.HauntedString;
import com.xinzhu.overmind.annotation.MethodParamString;
import com.xinzhu.overmind.annotation.MethodParamTemplate;
import com.xinzhu.overmind.annotation.ReflectiveName;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
/* loaded from: classes6.dex */
public class HauntedScanner {

    /* renamed from: i  reason: collision with root package name */
    private static final String f65642i = "initMetaClass";

    /* renamed from: j  reason: collision with root package name */
    private static final String f65643j = "getEgo";

    /* renamed from: k  reason: collision with root package name */
    private static final String f65644k = "initMetaMethod";

    /* renamed from: l  reason: collision with root package name */
    private static final String f65645l = "initMetaField";

    /* renamed from: a  reason: collision with root package name */
    public String f65646a;

    /* renamed from: b  reason: collision with root package name */
    public String f65647b;

    /* renamed from: c  reason: collision with root package name */
    public ClassDecl f65648c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f65649d;

    /* renamed from: e  reason: collision with root package name */
    public List<b> f65650e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public List<b> f65651f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public List<a> f65652g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public List<HauntedScanner> f65653h = new ArrayList();

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f65657a;

        /* renamed from: b  reason: collision with root package name */
        ClassDecl f65658b;

        /* renamed from: c  reason: collision with root package name */
        String f65659c;
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        boolean f65660a;

        /* renamed from: b  reason: collision with root package name */
        boolean f65661b;

        /* renamed from: c  reason: collision with root package name */
        ClassDecl f65662c;

        /* renamed from: d  reason: collision with root package name */
        String f65663d;

        /* renamed from: e  reason: collision with root package name */
        String f65664e;

        /* renamed from: f  reason: collision with root package name */
        String f65665f;

        /* renamed from: g  reason: collision with root package name */
        List<ClassDecl> f65666g = new ArrayList();

        /* renamed from: h  reason: collision with root package name */
        List<ClassDecl> f65667h = new ArrayList();
    }

    private HauntedScanner(Element element, String str, HauntedScanner hauntedScanner) {
        this.f65646a = str;
        this.f65647b = element.getSimpleName().toString();
        this.f65649d = element.getModifiers().contains(Modifier.STATIC);
        Symbol.ClassSymbol classSymbol = (Symbol.ClassSymbol) element;
        if (hauntedScanner == null) {
            com.xinzhu.haunted.a.c("class name " + this.f65647b + " " + element + " " + classSymbol.outermostClass());
            AnnotationMirror a5 = a(element, Haunted.class);
            if (a5 != null) {
                this.f65648c = c((TypeMirror) b(a5, "value").getValue());
            } else {
                AnnotationMirror a6 = a(element, HauntedString.class);
                if (a6 != null) {
                    this.f65648c = new ClassDecl((String) b(a6, "value").getValue(), ClassDecl.DeclKind.STRING_REFERENCE);
                } else {
                    throw new RuntimeException("Could not determine the ego of the class " + element.getSimpleName());
                }
            }
        } else {
            com.xinzhu.haunted.a.c("subclass name " + this.f65647b + " " + element + " " + classSymbol.outermostClass());
            StringBuilder sb = new StringBuilder();
            ClassDecl classDecl = hauntedScanner.f65648c;
            ClassDecl.DeclKind declKind = classDecl.f65656c;
            ClassDecl.DeclKind declKind2 = ClassDecl.DeclKind.STRING_REFERENCE;
            sb.append((Object) (declKind == declKind2 ? classDecl.f65654a : classDecl.f65655b));
            sb.append("$");
            sb.append(this.f65647b);
            this.f65648c = new ClassDecl(sb.toString(), declKind2);
        }
        g(element.getEnclosedElements());
    }

    private static AnnotationMirror a(Element element, Class<?> cls) {
        String name = cls.getName();
        for (AnnotationMirror annotationMirror : element.getAnnotationMirrors()) {
            if (annotationMirror.getAnnotationType().toString().equals(name)) {
                return annotationMirror;
            }
        }
        return null;
    }

    private static AnnotationValue b(AnnotationMirror annotationMirror, String str) {
        for (Map.Entry entry : annotationMirror.getElementValues().entrySet()) {
            if (((ExecutableElement) entry.getKey()).getSimpleName().toString().equals(str)) {
                return (AnnotationValue) entry.getValue();
            }
        }
        return null;
    }

    private ClassDecl c(TypeMirror typeMirror) {
        if (typeMirror instanceof Type.ClassType) {
            Type.ClassType classType = (Type.ClassType) typeMirror;
            if (e(classType)) {
                return new ClassDecl(classType.toString(), ClassDecl.DeclKind.EGO_REFERENCE);
            }
            return new ClassDecl(classType);
        } else if (typeMirror instanceof Type.JCPrimitiveType) {
            return new ClassDecl((Type.JCPrimitiveType) typeMirror);
        } else {
            if (typeMirror instanceof Type.JCVoidType) {
                return new ClassDecl((Type.JCVoidType) typeMirror);
            }
            if (typeMirror instanceof Type.ArrayType) {
                return new ClassDecl((Type.ArrayType) typeMirror);
            }
            com.xinzhu.haunted.a.b("getClassDeclFromTypeMirror: " + typeMirror.getClass().getCanonicalName());
            return null;
        }
    }

    private String d(String str) {
        return str.startsWith("Meta") ? str.substring(4) : str;
    }

    private static boolean e(Type.ClassType classType) {
        return classType.tsym.name.toString().startsWith("MetaHt");
    }

    private void f(Element element) {
        AnnotationMirror a5 = a(element, MethodParamTemplate.class);
        AnnotationMirror a6 = a(element, MethodParamString.class);
        if (a5 == null && a6 == null) {
            i(element);
        } else {
            j(element, a5, a6);
        }
    }

    private void g(List<? extends Element> list) {
        for (Element element : list) {
            com.xinzhu.haunted.a.c("element " + element + " type " + element.getKind());
            StringBuilder sb = new StringBuilder();
            sb.append("element class ");
            sb.append(element.getClass());
            com.xinzhu.haunted.a.c(sb.toString());
            if (!(element instanceof VariableElement) && !(element instanceof ExecutableElement)) {
                if (element instanceof TypeElement) {
                    this.f65653h.add(l(element, this.f65646a, this));
                }
            } else {
                f(element);
            }
        }
    }

    private static String h(Element element) {
        while (element.getKind() != ElementKind.PACKAGE) {
            element = element.getEnclosingElement();
        }
        return ((PackageElement) element).getQualifiedName().toString();
    }

    private void i(Element element) {
        if (element.getSimpleName().toString().equals("<init>")) {
            return;
        }
        a aVar = new a();
        aVar.f65657a = element.getModifiers().contains(Modifier.STATIC);
        aVar.f65659c = element.getSimpleName().toString();
        ClassDecl c5 = c(element.asType());
        aVar.f65658b = c5;
        if (c5 != null) {
            this.f65652g.add(aVar);
            return;
        }
        throw new RuntimeException("Cannot get type of " + element.getSimpleName());
    }

    private void j(Element element, AnnotationMirror annotationMirror, AnnotationMirror annotationMirror2) {
        b bVar = new b();
        int i4 = 0;
        bVar.f65661b = false;
        bVar.f65660a = element.getModifiers().contains(Modifier.STATIC);
        bVar.f65663d = element.getSimpleName().toString();
        if (element.getKind() == ElementKind.CONSTRUCTOR) {
            bVar.f65661b = true;
            String str = this.f65647b;
            bVar.f65663d = str;
            bVar.f65663d = d(str);
        }
        int i5 = -1;
        for (b bVar2 : bVar.f65661b ? this.f65650e : this.f65651f) {
            if (bVar2.f65663d.equals(bVar.f65663d)) {
                i5++;
            }
        }
        String str2 = bVar.f65663d;
        bVar.f65664e = str2;
        bVar.f65665f = str2;
        if (i5 != -1) {
            bVar.f65664e += i5;
        }
        AnnotationMirror a5 = a(element, ReflectiveName.class);
        if (a5 != null) {
            bVar.f65665f = (String) b(a5, "value").getValue();
        }
        if (element instanceof VariableElement) {
            bVar.f65662c = c(element.asType());
        } else if (element instanceof ExecutableElement) {
            bVar.f65662c = c(((ExecutableElement) element).getReturnType());
        }
        if (bVar.f65662c == null && !bVar.f65661b) {
            throw new RuntimeException("Cannot get type of " + element.getSimpleName());
        }
        if (annotationMirror == null) {
            for (AnnotationValue annotationValue : (List) b(annotationMirror2, "value").getValue()) {
                bVar.f65666g.add(new ClassDecl((String) annotationValue.getValue(), ClassDecl.DeclKind.STRING_REFERENCE));
            }
        } else {
            AnnotationValue b5 = b(annotationMirror, "value");
            List list = annotationMirror2 != null ? (List) b(annotationMirror2, "value").getValue() : null;
            if (b5 != null) {
                com.xinzhu.haunted.a.c("av class type: " + b5.getValue().getClass().getCanonicalName());
                for (AnnotationValue annotationValue2 : (List) b5.getValue()) {
                    TypeMirror typeMirror = (TypeMirror) annotationValue2.getValue();
                    if (typeMirror.toString().equals(e3.a.class.getCanonicalName())) {
                        if (list != null && i4 < list.size()) {
                            bVar.f65666g.add(new ClassDecl((String) ((Attribute.Constant) list.get(i4)).value, ClassDecl.DeclKind.STRING_REFERENCE));
                            i4++;
                        } else {
                            throw new RuntimeException("Strings and string stubs mismatch on " + element.getSimpleName());
                        }
                    } else {
                        bVar.f65666g.add(c(typeMirror));
                    }
                }
            }
            AnnotationValue b6 = b(annotationMirror, "throwz");
            if (b6 != null) {
                for (AnnotationValue annotationValue3 : (List) b6.getValue()) {
                    bVar.f65667h.add(c((TypeMirror) annotationValue3.getValue()));
                }
            }
        }
        if (bVar.f65661b) {
            this.f65650e.add(bVar);
        } else {
            this.f65651f.add(bVar);
        }
    }

    public static HauntedScanner k(Element element) {
        return l(element, h(element), null);
    }

    private static HauntedScanner l(Element element, String str, HauntedScanner hauntedScanner) {
        if (element.getKind() == ElementKind.CLASS) {
            com.xinzhu.haunted.a.c("root element " + element + " type " + element.getKind());
            HauntedScanner hauntedScanner2 = new HauntedScanner(element, str, hauntedScanner);
            com.xinzhu.haunted.a.c("root over");
            return hauntedScanner2;
        }
        throw new RuntimeException("root must be a class!");
    }

    /* loaded from: classes6.dex */
    public static class ClassDecl {

        /* renamed from: a  reason: collision with root package name */
        String f65654a;

        /* renamed from: b  reason: collision with root package name */
        TypeMirror f65655b;

        /* renamed from: c  reason: collision with root package name */
        DeclKind f65656c;

        /* loaded from: classes6.dex */
        public enum DeclKind {
            DIRECT_REFERENCE,
            STRING_REFERENCE,
            EGO_REFERENCE
        }

        public ClassDecl(String str, DeclKind declKind) {
            this.f65654a = str;
            this.f65656c = declKind;
        }

        public boolean a() {
            if (this.f65656c != DeclKind.DIRECT_REFERENCE) {
                return false;
            }
            return this.f65655b.toString().equals("java.lang.Boolean") || this.f65655b.toString().equals("boolean");
        }

        public boolean b() {
            if (this.f65656c != DeclKind.DIRECT_REFERENCE) {
                return false;
            }
            return this.f65655b.isNumeric();
        }

        public boolean c() {
            if (this.f65656c != DeclKind.DIRECT_REFERENCE) {
                return false;
            }
            return this.f65655b.toString().equals("java.lang.Void") || this.f65655b.toString().equals("void");
        }

        public ClassDecl(TypeMirror typeMirror) {
            this.f65655b = typeMirror;
            this.f65656c = DeclKind.DIRECT_REFERENCE;
        }
    }
}
