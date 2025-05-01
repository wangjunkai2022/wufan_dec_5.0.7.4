.class public Lcom/coremedia/iso/boxes/u0;
.super Lcom/googlecode/mp4parser/b;
.source "SampleTableBox.java"


# static fields
.field public static final p:Ljava/lang/String; = "stbl"


# instance fields
.field private o:Lcom/coremedia/iso/boxes/v0;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "stbl"

    .line 1
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public C()Lcom/coremedia/iso/boxes/f;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/d;

    .line 2
    instance-of v2, v1, Lcom/coremedia/iso/boxes/f;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/coremedia/iso/boxes/f;

    return-object v1
.end method

.method public D()Lcom/coremedia/iso/boxes/i;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/d;

    .line 2
    instance-of v2, v1, Lcom/coremedia/iso/boxes/i;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/coremedia/iso/boxes/i;

    return-object v1
.end method

.method public E()Lcom/coremedia/iso/boxes/r0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/d;

    .line 2
    instance-of v2, v1, Lcom/coremedia/iso/boxes/r0;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/coremedia/iso/boxes/r0;

    return-object v1
.end method

.method public J()Lcom/coremedia/iso/boxes/t0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/d;

    .line 2
    instance-of v2, v1, Lcom/coremedia/iso/boxes/t0;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/coremedia/iso/boxes/t0;

    return-object v1
.end method

.method public K()Lcom/coremedia/iso/boxes/v0;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/u0;->o:Lcom/coremedia/iso/boxes/v0;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v0, 0x0

    return-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/d;

    .line 3
    instance-of v2, v1, Lcom/coremedia/iso/boxes/v0;

    if-eqz v2, :cond_1

    .line 4
    check-cast v1, Lcom/coremedia/iso/boxes/v0;

    iput-object v1, p0, Lcom/coremedia/iso/boxes/u0;->o:Lcom/coremedia/iso/boxes/v0;

    return-object v1
.end method

.method public N()Lcom/coremedia/iso/boxes/c1;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/d;

    .line 2
    instance-of v2, v1, Lcom/coremedia/iso/boxes/c1;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/coremedia/iso/boxes/c1;

    return-object v1
.end method

.method public P()Lcom/coremedia/iso/boxes/d1;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/d;

    .line 2
    instance-of v2, v1, Lcom/coremedia/iso/boxes/d1;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/coremedia/iso/boxes/d1;

    return-object v1
.end method

.method public o()Lcom/coremedia/iso/boxes/s0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/coremedia/iso/boxes/d;

    .line 2
    instance-of v2, v1, Lcom/coremedia/iso/boxes/s0;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/coremedia/iso/boxes/s0;

    return-object v1
.end method
