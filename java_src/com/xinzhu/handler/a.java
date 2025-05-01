package com.xinzhu.handler;

import com.google.auto.service.AutoService;
import com.join.mgps.Util.h0;
import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import com.xinzhu.overmind.annotation.HandlerClass;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Modifier;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
/* compiled from: HandlerProcessor.java */
@AutoService({Processor.class})
/* loaded from: classes6.dex */
public class a extends AbstractProcessor {

    /* renamed from: a  reason: collision with root package name */
    private Filer f65638a;

    /* renamed from: b  reason: collision with root package name */
    private Set<Element> f65639b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    String f65640c;

    /* renamed from: d  reason: collision with root package name */
    String f65641d;

    private TypeSpec a() {
        if (this.f65641d.endsWith("Base")) {
            String str = this.f65641d;
            TypeSpec.Builder classBuilder = TypeSpec.classBuilder(str.substring(0, str.length() - 4));
            TypeSpec.Builder addModifiers = classBuilder.superclass(ClassName.bestGuess(this.f65640c + h0.f27805a + this.f65641d)).addModifiers(new Modifier[]{Modifier.PUBLIC});
            MethodSpec.Builder addModifiers2 = MethodSpec.methodBuilder("addAllHandlers").addModifiers(new Modifier[]{Modifier.PROTECTED});
            Iterator<Element> it2 = this.f65639b.iterator();
            while (it2.hasNext()) {
                addModifiers2.addStatement("addHandler(new $T())", new Object[]{it2.next().asType()});
            }
            addModifiers.addMethod(addModifiers2.build());
            return addModifiers.build();
        }
        throw new RuntimeException("Handler class must end with Base! " + this.f65641d);
    }

    private void e(Element element) {
        Element element2 = element;
        while (element2.getKind() != ElementKind.PACKAGE) {
            element2 = element2.getEnclosingElement();
        }
        this.f65640c = ((PackageElement) element2).getQualifiedName().toString();
        this.f65641d = element.getSimpleName().toString();
        for (Element element3 : element.getEnclosedElements()) {
            if (element3 instanceof TypeElement) {
                this.f65639b.add(element3);
            }
        }
    }

    public Set<String> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(HandlerClass.class.getCanonicalName());
        return hashSet;
    }

    public SourceVersion c() {
        return SourceVersion.latestSupported();
    }

    public synchronized void d(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        this.f65638a = processingEnvironment.getFiler();
        com.xinzhu.haunted.a.d(processingEnvironment.getMessager());
    }

    public boolean f(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        com.xinzhu.haunted.a.c("annotations size--->" + set.size());
        Set<Element> elementsAnnotatedWith = roundEnvironment.getElementsAnnotatedWith(HandlerClass.class);
        if (elementsAnnotatedWith.isEmpty()) {
            com.xinzhu.haunted.a.c("Empty root element.");
            return false;
        }
        for (Element element : elementsAnnotatedWith) {
            this.f65639b.clear();
            e(element);
            try {
                JavaFile.builder(this.f65640c, a()).addFileComment("AUTO GENERATED FILE, DO NOT MODIFY", new Object[0]).build().writeTo(this.f65638a);
            } catch (IOException e5) {
                e5.printStackTrace();
            }
        }
        return true;
    }
}
