.class public Lcom/coremedia/iso/boxes/h0;
.super Lcom/googlecode/mp4parser/b;
.source "MovieBox.java"


# static fields
.field public static final o:Ljava/lang/String; = "moov"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "moov"

    .line 1
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public C()Lcom/coremedia/iso/boxes/i0;
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
    instance-of v2, v1, Lcom/coremedia/iso/boxes/i0;

    if-eqz v2, :cond_0

    .line 3
    check-cast v1, Lcom/coremedia/iso/boxes/i0;

    return-object v1
.end method

.method public D()I
    .locals 1

    .line 1
    const-class v0, Lcom/coremedia/iso/boxes/f1;

    invoke-virtual {p0, v0}, Lcom/googlecode/mp4parser/d;->g(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public E()[J
    .locals 5

    .line 1
    const-class v0, Lcom/coremedia/iso/boxes/f1;

    invoke-virtual {p0, v0}, Lcom/googlecode/mp4parser/d;->g(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [J

    const/4 v2, 0x0

    .line 3
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lt v2, v3, :cond_0

    return-object v1

    .line 4
    :cond_0
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/coremedia/iso/boxes/f1;

    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/f1;->E()Lcom/coremedia/iso/boxes/g1;

    move-result-object v3

    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/g1;->C()J

    move-result-wide v3

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method
