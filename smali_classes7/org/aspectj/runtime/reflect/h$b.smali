.class Lorg/aspectj/runtime/reflect/h$b;
.super Ljava/lang/Object;
.source "JoinPointImpl.java"

# interfaces
.implements Lorg/aspectj/lang/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/aspectj/runtime/reflect/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:Ljava/lang/String;

.field b:Lorg/aspectj/lang/e;

.field c:Lorg/aspectj/lang/reflect/z;

.field private d:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Lorg/aspectj/lang/e;Lorg/aspectj/lang/reflect/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lorg/aspectj/runtime/reflect/h$b;->a:Ljava/lang/String;

    .line 3
    iput-object p3, p0, Lorg/aspectj/runtime/reflect/h$b;->b:Lorg/aspectj/lang/e;

    .line 4
    iput-object p4, p0, Lorg/aspectj/runtime/reflect/h$b;->c:Lorg/aspectj/lang/reflect/z;

    .line 5
    iput p1, p0, Lorg/aspectj/runtime/reflect/h$b;->d:I

    return-void
.end method


# virtual methods
.method a(Lorg/aspectj/runtime/reflect/n;)Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 2
    invoke-virtual {p0}, Lorg/aspectj/runtime/reflect/h$b;->getKind()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/aspectj/runtime/reflect/n;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "("

    .line 3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 4
    invoke-virtual {p0}, Lorg/aspectj/runtime/reflect/h$b;->h()Lorg/aspectj/lang/e;

    move-result-object v1

    check-cast v1, Lorg/aspectj/runtime/reflect/l;

    invoke-virtual {v1, p1}, Lorg/aspectj/runtime/reflect/l;->E(Lorg/aspectj/runtime/reflect/n;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string p1, ")"

    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 6
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lorg/aspectj/runtime/reflect/n;->j:Lorg/aspectj/runtime/reflect/n;

    invoke-virtual {p0, v0}, Lorg/aspectj/runtime/reflect/h$b;->a(Lorg/aspectj/runtime/reflect/n;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lorg/aspectj/runtime/reflect/n;->l:Lorg/aspectj/runtime/reflect/n;

    invoke-virtual {p0, v0}, Lorg/aspectj/runtime/reflect/h$b;->a(Lorg/aspectj/runtime/reflect/n;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Lorg/aspectj/lang/reflect/z;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/aspectj/runtime/reflect/h$b;->c:Lorg/aspectj/lang/reflect/z;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/aspectj/runtime/reflect/h$b;->d:I

    return v0
.end method

.method public getKind()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/aspectj/runtime/reflect/h$b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public h()Lorg/aspectj/lang/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/aspectj/runtime/reflect/h$b;->b:Lorg/aspectj/lang/e;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lorg/aspectj/runtime/reflect/n;->k:Lorg/aspectj/runtime/reflect/n;

    invoke-virtual {p0, v0}, Lorg/aspectj/runtime/reflect/h$b;->a(Lorg/aspectj/runtime/reflect/n;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
