.class public Lcom/coremedia/iso/boxes/fragment/c;
.super Lcom/googlecode/mp4parser/b;
.source "MovieFragmentBox.java"


# static fields
.field public static final o:Ljava/lang/String; = "moof"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "moof"

    .line 1
    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public C()Lcom/googlecode/mp4parser/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/d;->c:Lcom/googlecode/mp4parser/e;

    return-object v0
.end method

.method public D(Lcom/coremedia/iso/boxes/r0;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/coremedia/iso/boxes/r0;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/r0;->v()Ljava/util/List;

    move-result-object p1

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide/16 v1, 0x1

    move-wide v3, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/coremedia/iso/boxes/r0$a;

    .line 4
    invoke-virtual {v5}, Lcom/coremedia/iso/boxes/r0$a;->c()I

    move-result v5

    const/4 v6, 0x2

    if-ne v5, v6, :cond_1

    .line 5
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-long/2addr v3, v1

    goto :goto_0
.end method

.method public E()I
    .locals 2

    .line 1
    const-class v0, Lcom/coremedia/iso/boxes/fragment/k;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/mp4parser/d;->l(Ljava/lang/Class;Z)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public J()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/coremedia/iso/boxes/fragment/l;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/coremedia/iso/boxes/fragment/l;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/mp4parser/d;->l(Ljava/lang/Class;Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public K()[J
    .locals 5

    .line 1
    const-class v0, Lcom/coremedia/iso/boxes/fragment/k;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/mp4parser/d;->l(Ljava/lang/Class;Z)Ljava/util/List;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [J

    .line 3
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lt v1, v3, :cond_0

    return-object v2

    .line 4
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/coremedia/iso/boxes/fragment/k;

    .line 5
    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/fragment/k;->C()Lcom/coremedia/iso/boxes/fragment/l;

    move-result-object v3

    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/fragment/l;->A()J

    move-result-wide v3

    aput-wide v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public N()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/coremedia/iso/boxes/fragment/n;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/coremedia/iso/boxes/fragment/n;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/googlecode/mp4parser/d;->l(Ljava/lang/Class;Z)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
