.class public Lcom/coremedia/iso/boxes/f1;
.super Lcom/googlecode/mp4parser/b;
.source "TrackBox.java"


# static fields
.field public static final p:Ljava/lang/String; = "trak"


# instance fields
.field private o:Lcom/coremedia/iso/boxes/u0;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "trak"

    .line 1
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public C()Lcom/coremedia/iso/boxes/d0;
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
    instance-of v2, v1, Lcom/coremedia/iso/boxes/d0;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/coremedia/iso/boxes/d0;

    return-object v1
.end method

.method public D()Lcom/coremedia/iso/boxes/u0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/coremedia/iso/boxes/f1;->o:Lcom/coremedia/iso/boxes/u0;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/f1;->C()Lcom/coremedia/iso/boxes/d0;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/d0;->E()Lcom/coremedia/iso/boxes/f0;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/f0;->D()Lcom/coremedia/iso/boxes/u0;

    move-result-object v0

    iput-object v0, p0, Lcom/coremedia/iso/boxes/f1;->o:Lcom/coremedia/iso/boxes/u0;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public E()Lcom/coremedia/iso/boxes/g1;
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
    instance-of v2, v1, Lcom/coremedia/iso/boxes/g1;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/coremedia/iso/boxes/g1;

    return-object v1
.end method

.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/coremedia/iso/boxes/d;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/googlecode/mp4parser/d;->b(Ljava/util/List;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/coremedia/iso/boxes/f1;->o:Lcom/coremedia/iso/boxes/u0;

    return-void
.end method
