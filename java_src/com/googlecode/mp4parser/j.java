package com.googlecode.mp4parser;

import org.aspectj.lang.NoAspectBoundException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
/* compiled from: RequiresParseDetailAspect.java */
@Aspect
/* loaded from: classes3.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static /* synthetic */ Throwable f14210a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ j f14211b = null;

    static {
        try {
            a();
        } catch (Throwable th) {
            f14210a = th;
        }
    }

    private static /* synthetic */ void a() {
        f14211b = new j();
    }

    public static j b() {
        j jVar = f14211b;
        if (jVar != null) {
            return jVar;
        }
        throw new NoAspectBoundException("com.googlecode.mp4parser.RequiresParseDetailAspect", f14210a);
    }

    public static boolean d() {
        return f14211b != null;
    }

    @Before("this(com.googlecode.mp4parser.AbstractBox) && ((execution(public * * (..)) && !( execution(* parseDetails()) || execution(* getNumOfBytesToFirstChild()) || execution(* getType()) || execution(* isParsed()) || execution(* getHeader(*)) || execution(* parse()) || execution(* getBox(*)) || execution(* getSize()) || execution(* getOffset()) || execution(* parseDetails()) || execution(* _parseDetails(*)) || execution(* parse(*,*,*,*)) || execution(* getIsoFile()) || execution(* getParent()) || execution(* setParent(*)) || execution(* getUserType()) || execution(* setUserType(*))) && !@annotation(com.googlecode.mp4parser.annotations.DoNotParseDetail)) || @annotation(com.googlecode.mp4parser.annotations.ParseDetail))")
    public void c(org.aspectj.lang.c cVar) {
        if (cVar.c() instanceof a) {
            if (((a) cVar.c()).l()) {
                return;
            }
            ((a) cVar.c()).n();
            return;
        }
        throw new RuntimeException("Only methods in subclasses of " + a.class.getName() + " can  be annotated with ParseDetail");
    }
}
