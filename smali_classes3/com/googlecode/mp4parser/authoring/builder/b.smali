.class public Lcom/googlecode/mp4parser/authoring/builder/b;
.super Ljava/lang/Object;
.source "DefaultMp4Builder.java"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/builder/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/authoring/builder/b$b;
    }
.end annotation


# static fields
.field private static f:Ljava/util/logging/Logger;

.field static final synthetic g:Z


# instance fields
.field a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/coremedia/iso/boxes/z0;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/mp4parser/iso14496/part12/b;",
            ">;"
        }
    .end annotation
.end field

.field c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;>;"
        }
    .end annotation
.end field

.field d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "[J>;"
        }
    .end annotation
.end field

.field private e:Lcom/googlecode/mp4parser/authoring/builder/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/googlecode/mp4parser/authoring/builder/b;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/authoring/builder/b;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->a:Ljava/util/Set;

    .line 3
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->b:Ljava/util/Set;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->c:Ljava/util/HashMap;

    .line 5
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->d:Ljava/util/HashMap;

    return-void
.end method

.method public static r(JJ)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    return-wide p0

    .line 1
    :cond_0
    rem-long/2addr p0, p2

    invoke-static {p2, p3, p0, p1}, Lcom/googlecode/mp4parser/authoring/builder/b;->r(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method private static w([I)J
    .locals 6

    .line 1
    array-length v0, p0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v0, :cond_0

    return-wide v1

    :cond_0
    aget v4, p0, v3

    int-to-long v4, v4

    add-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method private static x([J)J
    .locals 6

    .line 1
    array-length v0, p0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v0, :cond_0

    return-wide v1

    :cond_0
    aget-wide v4, p0, v3

    add-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/j;
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->e:Lcom/googlecode/mp4parser/authoring/builder/c;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/googlecode/mp4parser/authoring/builder/h;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, Lcom/googlecode/mp4parser/authoring/builder/h;-><init>(Lcom/googlecode/mp4parser/authoring/d;I)V

    iput-object v0, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->e:Lcom/googlecode/mp4parser/authoring/builder/c;

    .line 3
    :cond_0
    sget-object v0, Lcom/googlecode/mp4parser/authoring/builder/b;->f:Ljava/util/logging/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Creating movie "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_a

    .line 5
    new-instance v1, Lcom/googlecode/mp4parser/d;

    invoke-direct {v1}, Lcom/googlecode/mp4parser/d;-><init>()V

    .line 6
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/authoring/builder/b;->e(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/s;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 7
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 8
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_9

    .line 9
    invoke-virtual {p0, p1, v6}, Lcom/googlecode/mp4parser/authoring/builder/b;->f(Lcom/googlecode/mp4parser/authoring/d;Ljava/util/Map;)Lcom/coremedia/iso/boxes/h0;

    move-result-object v0

    .line 10
    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    const-string/jumbo v3, "trak/mdia/minf/stbl/stsz"

    .line 11
    invoke-static {v0, v3}, Lcom/googlecode/mp4parser/util/m;->f(Lcom/coremedia/iso/boxes/d;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    const-wide/16 v3, 0x0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-wide v7, v3

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_8

    .line 13
    new-instance v0, Lcom/googlecode/mp4parser/authoring/builder/b$b;

    const/4 v9, 0x0

    move-object v3, v0

    move-object v4, p0

    move-object v5, p1

    invoke-direct/range {v3 .. v9}, Lcom/googlecode/mp4parser/authoring/builder/b$b;-><init>(Lcom/googlecode/mp4parser/authoring/builder/b;Lcom/googlecode/mp4parser/authoring/d;Ljava/util/Map;JLcom/googlecode/mp4parser/authoring/builder/b$b;)V

    .line 14
    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 15
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/builder/b$b;->b()J

    move-result-wide v3

    .line 16
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->a:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-nez p1, :cond_6

    .line 17
    iget-object p1, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->b:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mp4parser/iso14496/part12/b;

    .line 18
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/a;->getSize()J

    move-result-wide v3

    const-wide/16 v5, 0x2c

    add-long/2addr v3, v5

    move-object v6, v0

    .line 19
    :goto_5
    move-object v5, v6

    check-cast v5, Lcom/coremedia/iso/boxes/d;

    invoke-interface {v5}, Lcom/coremedia/iso/boxes/d;->getParent()Lcom/coremedia/iso/boxes/j;

    move-result-object v7

    .line 20
    invoke-interface {v7}, Lcom/coremedia/iso/boxes/j;->t()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_7

    :cond_2
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/coremedia/iso/boxes/d;

    if-ne v5, v6, :cond_5

    .line 21
    :goto_7
    instance-of v5, v7, Lcom/coremedia/iso/boxes/d;

    if-nez v5, :cond_4

    .line 22
    invoke-virtual {v0}, Lcom/mp4parser/iso14496/part12/b;->x()[J

    move-result-object v5

    const/4 v6, 0x0

    .line 23
    :goto_8
    array-length v7, v5

    if-lt v6, v7, :cond_3

    .line 24
    invoke-virtual {v0, v5}, Lcom/mp4parser/iso14496/part12/b;->A([J)V

    goto :goto_4

    .line 25
    :cond_3
    aget-wide v7, v5, v6

    add-long/2addr v7, v3

    aput-wide v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_4
    move-object v6, v7

    goto :goto_5

    .line 26
    :cond_5
    invoke-interface {v5}, Lcom/coremedia/iso/boxes/d;->getSize()J

    move-result-wide v9

    add-long/2addr v3, v9

    goto :goto_6

    .line 27
    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/coremedia/iso/boxes/z0;

    .line 28
    invoke-virtual {p1}, Lcom/coremedia/iso/boxes/z0;->v()[J

    move-result-object v9

    const/4 p1, 0x0

    .line 29
    :goto_9
    array-length v0, v9

    if-lt p1, v0, :cond_7

    goto :goto_3

    .line 30
    :cond_7
    aget-wide v6, v9, p1

    add-long/2addr v6, v3

    aput-wide v6, v9, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_9

    .line 31
    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/coremedia/iso/boxes/t0;

    .line 32
    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/t0;->y()[J

    move-result-object v3

    invoke-static {v3}, Lcom/googlecode/mp4parser/authoring/builder/b;->x([J)J

    move-result-wide v3

    add-long/2addr v7, v3

    goto/16 :goto_2

    .line 33
    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/mp4parser/authoring/h;

    .line 34
    invoke-virtual {p0, v0, p1}, Lcom/googlecode/mp4parser/authoring/builder/b;->s(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)[I

    move-result-object v4

    invoke-interface {v6, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    .line 35
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/googlecode/mp4parser/authoring/h;

    .line 36
    invoke-interface {v1}, Lcom/googlecode/mp4parser/authoring/h;->x()Ljava/util/List;

    move-result-object v3

    .line 37
    invoke-virtual {p0, v1, v3}, Lcom/googlecode/mp4parser/authoring/builder/b;->u(Lcom/googlecode/mp4parser/authoring/h;Ljava/util/List;)Ljava/util/List;

    .line 38
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    new-array v5, v4, [J

    :goto_a
    if-lt v2, v4, :cond_b

    .line 39
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->d:Ljava/util/HashMap;

    invoke-virtual {v2, v1, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 40
    :cond_b
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/googlecode/mp4parser/authoring/f;

    .line 41
    invoke-interface {v6}, Lcom/googlecode/mp4parser/authoring/f;->getSize()J

    move-result-wide v6

    aput-wide v6, v5, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_a
.end method

.method protected b(Lcom/googlecode/mp4parser/authoring/tracks/g;Lcom/coremedia/iso/boxes/u0;[I)V
    .locals 16

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    .line 1
    new-instance v2, Lcom/mp4parser/iso14496/part12/c;

    invoke-direct {v2}, Lcom/mp4parser/iso14496/part12/c;-><init>()V

    const-string v3, "cenc"

    .line 2
    invoke-virtual {v2, v3}, Lcom/mp4parser/iso14496/part12/c;->B(Ljava/lang/String;)V

    const/4 v3, 0x1

    .line 3
    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/c;->setFlags(I)V

    .line 4
    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/tracks/g;->R()Ljava/util/List;

    move-result-object v3

    .line 5
    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/tracks/g;->F()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 6
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    new-array v6, v4, [S

    const/4 v7, 0x0

    :goto_0
    if-lt v7, v4, :cond_0

    .line 7
    invoke-virtual {v2, v6}, Lcom/mp4parser/iso14496/part12/c;->F([S)V

    goto :goto_1

    .line 8
    :cond_0
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/mp4parser/iso23001/part7/a;

    invoke-virtual {v8}, Lcom/mp4parser/iso23001/part7/a;->b()I

    move-result v8

    int-to-short v8, v8

    aput-short v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    const/16 v4, 0x8

    .line 9
    invoke-virtual {v2, v4}, Lcom/mp4parser/iso14496/part12/c;->D(I)V

    .line 10
    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/h;->x()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/mp4parser/iso14496/part12/c;->E(I)V

    .line 11
    :goto_1
    new-instance v4, Lcom/mp4parser/iso14496/part12/b;

    invoke-direct {v4}, Lcom/mp4parser/iso14496/part12/b;-><init>()V

    .line 12
    new-instance v6, Lcom/googlecode/mp4parser/boxes/dece/d;

    invoke-direct {v6}, Lcom/googlecode/mp4parser/boxes/dece/d;-><init>()V

    .line 13
    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/tracks/g;->F()Z

    move-result v7

    invoke-virtual {v6, v7}, Lcom/googlecode/mp4parser/boxes/b;->C(Z)V

    .line 14
    invoke-virtual {v6, v3}, Lcom/googlecode/mp4parser/boxes/b;->B(Ljava/util/List;)V

    .line 15
    invoke-virtual {v6}, Lcom/googlecode/mp4parser/boxes/b;->x()I

    move-result v7

    int-to-long v7, v7

    .line 16
    array-length v9, v1

    new-array v9, v9, [J

    const/4 v10, 0x0

    const/4 v11, 0x0

    .line 17
    :goto_2
    array-length v12, v1

    if-lt v10, v12, :cond_2

    .line 18
    invoke-virtual {v4, v9}, Lcom/mp4parser/iso14496/part12/b;->A([J)V

    .line 19
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 20
    invoke-virtual {v0, v4}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 21
    invoke-virtual {v0, v6}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    move-object/from16 v12, p0

    .line 22
    iget-object v0, v12, Lcom/googlecode/mp4parser/authoring/builder/b;->b:Ljava/util/Set;

    invoke-interface {v0, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    move-object/from16 v12, p0

    .line 23
    aput-wide v7, v9, v10

    const/4 v13, 0x0

    .line 24
    :goto_3
    aget v14, v1, v10

    if-lt v13, v14, :cond_3

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_3
    add-int/lit8 v14, v11, 0x1

    .line 25
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/mp4parser/iso23001/part7/a;

    invoke-virtual {v11}, Lcom/mp4parser/iso23001/part7/a;->b()I

    move-result v11

    move-object v15, v6

    int-to-long v5, v11

    add-long/2addr v7, v5

    add-int/lit8 v13, v13, 0x1

    move v11, v14

    move-object v6, v15

    goto :goto_3
.end method

.method protected c(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->n()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/coremedia/iso/boxes/i;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/i;-><init>()V

    .line 4
    invoke-virtual {v0, p1}, Lcom/coremedia/iso/boxes/i;->x(Ljava/util/List;)V

    .line 5
    invoke-virtual {p2, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    :cond_0
    return-void
.end method

.method protected d(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;
    .locals 12

    .line 1
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->H()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->H()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2
    new-instance v0, Lcom/coremedia/iso/boxes/r;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/r;-><init>()V

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/c;->setVersion(I)V

    .line 4
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->H()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 6
    invoke-virtual {v0, v9}, Lcom/coremedia/iso/boxes/r;->w(Ljava/util/List;)V

    .line 7
    new-instance p1, Lcom/coremedia/iso/boxes/q;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/q;-><init>()V

    .line 8
    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-object p1

    .line 9
    :cond_0
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/googlecode/mp4parser/authoring/c;

    .line 10
    new-instance v11, Lcom/coremedia/iso/boxes/r$a;

    .line 11
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/authoring/c;->c()D

    move-result-wide v2

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/authoring/d;->e()J

    move-result-wide v4

    long-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v2, v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v3

    .line 12
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/authoring/c;->b()J

    move-result-wide v5

    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/authoring/i;->h()J

    move-result-wide v7

    mul-long v5, v5, v7

    invoke-virtual {v1}, Lcom/googlecode/mp4parser/authoring/c;->d()J

    move-result-wide v7

    div-long/2addr v5, v7

    .line 13
    invoke-virtual {v1}, Lcom/googlecode/mp4parser/authoring/c;->a()D

    move-result-wide v7

    move-object v1, v11

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lcom/coremedia/iso/boxes/r$a;-><init>(Lcom/coremedia/iso/boxes/r;JJD)V

    .line 14
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected e(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/s;
    .locals 4

    .line 1
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    const-string v0, "isom"

    .line 2
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "iso2"

    .line 3
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v1, "avc1"

    .line 4
    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    new-instance v1, Lcom/coremedia/iso/boxes/s;

    const-wide/16 v2, 0x0

    invoke-direct {v1, v0, v2, v3, p1}, Lcom/coremedia/iso/boxes/s;-><init>(Ljava/lang/String;JLjava/util/List;)V

    return-object v1
.end method

.method protected f(Lcom/googlecode/mp4parser/authoring/d;Ljava/util/Map;)Lcom/coremedia/iso/boxes/h0;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/googlecode/mp4parser/authoring/d;",
            "Ljava/util/Map<",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "[I>;)",
            "Lcom/coremedia/iso/boxes/h0;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/h0;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/h0;-><init>()V

    .line 2
    new-instance v1, Lcom/coremedia/iso/boxes/i0;

    invoke-direct {v1}, Lcom/coremedia/iso/boxes/i0;-><init>()V

    .line 3
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Lcom/coremedia/iso/boxes/i0;->J(Ljava/util/Date;)V

    .line 4
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v2}, Lcom/coremedia/iso/boxes/i0;->N(Ljava/util/Date;)V

    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/d;->c()Lcom/googlecode/mp4parser/util/l;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/coremedia/iso/boxes/i0;->M(Lcom/googlecode/mp4parser/util/l;)V

    .line 6
    invoke-virtual/range {p0 .. p1}, Lcom/googlecode/mp4parser/authoring/builder/b;->t(Lcom/googlecode/mp4parser/authoring/d;)J

    move-result-wide v2

    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const-wide/16 v7, 0x0

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_5

    .line 8
    invoke-virtual {v1, v7, v8}, Lcom/coremedia/iso/boxes/i0;->L(J)V

    .line 9
    invoke-virtual {v1, v2, v3}, Lcom/coremedia/iso/boxes/i0;->V(J)V

    .line 10
    invoke-virtual/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const-wide/16 v5, 0x0

    :cond_1
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_4

    const-wide/16 v2, 0x1

    add-long/2addr v5, v2

    .line 11
    invoke-virtual {v1, v5, v6}, Lcom/coremedia/iso/boxes/i0;->O(J)V

    .line 12
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 13
    invoke-virtual/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_3

    .line 14
    invoke-virtual/range {p0 .. p1}, Lcom/googlecode/mp4parser/authoring/builder/b;->q(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 15
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    :cond_2
    return-object v0

    .line 16
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/googlecode/mp4parser/authoring/h;

    move-object/from16 v10, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    .line 17
    invoke-virtual {v10, v1, v11, v12}, Lcom/googlecode/mp4parser/authoring/builder/b;->p(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;Ljava/util/Map;)Lcom/coremedia/iso/boxes/f1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_2

    :cond_4
    move-object/from16 v10, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    .line 18
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/googlecode/mp4parser/authoring/h;

    .line 19
    invoke-interface {v2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v3

    cmp-long v7, v5, v3

    if-gez v7, :cond_1

    invoke-interface {v2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v2

    move-wide v5, v2

    goto :goto_1

    :cond_5
    move-object/from16 v10, p0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    .line 20
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/googlecode/mp4parser/authoring/h;

    .line 21
    invoke-interface {v9}, Lcom/googlecode/mp4parser/authoring/h;->H()Ljava/util/List;

    move-result-object v13

    if-eqz v13, :cond_8

    invoke-interface {v9}, Lcom/googlecode/mp4parser/authoring/h;->H()Ljava/util/List;

    move-result-object v13

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_6

    goto :goto_4

    .line 22
    :cond_6
    invoke-interface {v9}, Lcom/googlecode/mp4parser/authoring/h;->H()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    const-wide/16 v14, 0x0

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_7

    .line 23
    invoke-virtual/range {p0 .. p1}, Lcom/googlecode/mp4parser/authoring/builder/b;->t(Lcom/googlecode/mp4parser/authoring/d;)J

    move-result-wide v16

    mul-long v14, v14, v16

    goto :goto_5

    .line 24
    :cond_7
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/googlecode/mp4parser/authoring/c;

    .line 25
    invoke-virtual {v9}, Lcom/googlecode/mp4parser/authoring/c;->c()D

    move-result-wide v5

    double-to-long v5, v5

    add-long/2addr v14, v5

    goto :goto_3

    .line 26
    :cond_8
    :goto_4
    invoke-interface {v9}, Lcom/googlecode/mp4parser/authoring/h;->getDuration()J

    move-result-wide v5

    invoke-virtual/range {p0 .. p1}, Lcom/googlecode/mp4parser/authoring/builder/b;->t(Lcom/googlecode/mp4parser/authoring/d;)J

    move-result-wide v13

    mul-long v5, v5, v13

    invoke-interface {v9}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v9

    invoke-virtual {v9}, Lcom/googlecode/mp4parser/authoring/i;->h()J

    move-result-wide v13

    div-long v14, v5, v13

    :goto_5
    cmp-long v5, v14, v7

    if-lez v5, :cond_0

    move-wide v7, v14

    goto/16 :goto_0
.end method

.method protected g(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->U()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->U()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/coremedia/iso/boxes/r0;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/r0;-><init>()V

    .line 3
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->U()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/coremedia/iso/boxes/r0;->w(Ljava/util/List;)V

    .line 4
    invoke-virtual {p2, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    :cond_0
    return-void
.end method

.method protected h(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;Ljava/util/Map;)Lcom/coremedia/iso/boxes/d;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "Lcom/googlecode/mp4parser/authoring/d;",
            "Ljava/util/Map<",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "[I>;)",
            "Lcom/coremedia/iso/boxes/d;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 1
    new-instance v3, Lcom/coremedia/iso/boxes/u0;

    invoke-direct {v3}, Lcom/coremedia/iso/boxes/u0;-><init>()V

    .line 2
    invoke-virtual {v0, v1, v3}, Lcom/googlecode/mp4parser/authoring/builder/b;->k(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V

    .line 3
    invoke-virtual {v0, v1, v3}, Lcom/googlecode/mp4parser/authoring/builder/b;->n(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V

    .line 4
    invoke-virtual {v0, v1, v3}, Lcom/googlecode/mp4parser/authoring/builder/b;->c(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V

    .line 5
    invoke-virtual {v0, v1, v3}, Lcom/googlecode/mp4parser/authoring/builder/b;->l(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V

    .line 6
    invoke-virtual {v0, v1, v3}, Lcom/googlecode/mp4parser/authoring/builder/b;->g(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V

    .line 7
    invoke-virtual {v0, v1, v2, v3}, Lcom/googlecode/mp4parser/authoring/builder/b;->j(Lcom/googlecode/mp4parser/authoring/h;Ljava/util/Map;Lcom/coremedia/iso/boxes/u0;)V

    .line 8
    invoke-virtual {v0, v1, v3}, Lcom/googlecode/mp4parser/authoring/builder/b;->m(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V

    move-object/from16 v4, p2

    .line 9
    invoke-virtual {v0, v1, v4, v2, v3}, Lcom/googlecode/mp4parser/authoring/builder/b;->i(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;Ljava/util/Map;Lcom/coremedia/iso/boxes/u0;)V

    .line 10
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 11
    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/h;->I()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_7

    .line 12
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    .line 13
    instance-of v4, v1, Lcom/googlecode/mp4parser/authoring/tracks/g;

    if-eqz v4, :cond_0

    .line 14
    move-object v4, v1

    check-cast v4, Lcom/googlecode/mp4parser/authoring/tracks/g;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    invoke-virtual {v0, v4, v3, v2}, Lcom/googlecode/mp4parser/authoring/builder/b;->b(Lcom/googlecode/mp4parser/authoring/tracks/g;Lcom/coremedia/iso/boxes/u0;[I)V

    .line 15
    :cond_0
    invoke-virtual {v0, v1, v3}, Lcom/googlecode/mp4parser/authoring/builder/b;->o(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V

    return-object v3

    .line 16
    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ljava/util/Map$Entry;

    .line 17
    new-instance v8, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/e;

    invoke-direct {v8}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/e;-><init>()V

    .line 18
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 19
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v8, v5}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/e;->z(Ljava/util/List;)V

    .line 20
    new-instance v9, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f;

    invoke-direct {v9}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f;-><init>()V

    .line 21
    invoke-virtual {v9, v4}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f;->z(Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v10, 0x0

    move-object v11, v4

    const/4 v12, 0x0

    .line 22
    :goto_2
    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/h;->x()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lt v12, v4, :cond_2

    .line 23
    invoke-virtual {v3, v8}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 24
    invoke-virtual {v3, v9}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 25
    :goto_3
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    if-lt v4, v13, :cond_5

    const-wide/16 v13, 0x1

    if-eqz v11, :cond_4

    .line 26
    invoke-virtual {v11}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f$a;->a()I

    move-result v4

    if-eq v4, v5, :cond_3

    goto :goto_4

    .line 27
    :cond_3
    invoke-virtual {v11}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f$a;->b()J

    move-result-wide v4

    add-long/2addr v4, v13

    invoke-virtual {v11, v4, v5}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f$a;->d(J)V

    goto :goto_5

    .line 28
    :cond_4
    :goto_4
    new-instance v4, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f$a;

    invoke-direct {v4, v13, v14, v5}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f$a;-><init>(JI)V

    .line 29
    invoke-virtual {v9}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f;->v()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v11, v4

    :goto_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 30
    :cond_5
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    invoke-interface {v13, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/b;

    .line 31
    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/h;->I()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, [J

    int-to-long v14, v12

    .line 32
    invoke-static {v13, v14, v15}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v13

    if-ltz v13, :cond_6

    add-int/lit8 v5, v4, 0x1

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 33
    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 34
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/b;

    invoke-virtual {v7}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/b;->getType()Ljava/lang/String;

    move-result-object v7

    .line 35
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-nez v8, :cond_8

    .line 36
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 37
    invoke-interface {v4, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    :cond_8
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/b;

    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method protected i(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;Ljava/util/Map;Lcom/coremedia/iso/boxes/u0;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "Lcom/googlecode/mp4parser/authoring/d;",
            "Ljava/util/Map<",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "[I>;",
            "Lcom/coremedia/iso/boxes/u0;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 1
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [I

    .line 2
    new-instance v4, Lcom/coremedia/iso/boxes/z0;

    invoke-direct {v4}, Lcom/coremedia/iso/boxes/z0;-><init>()V

    .line 3
    iget-object v5, v0, Lcom/googlecode/mp4parser/authoring/builder/b;->a:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    array-length v5, v3

    new-array v5, v5, [J

    .line 5
    sget-object v6, Lcom/googlecode/mp4parser/authoring/builder/b;->f:Ljava/util/logging/Logger;

    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v6, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v6

    const-string v7, "Calculating chunk offsets for track_"

    if-eqz v6, :cond_0

    .line 6
    sget-object v6, Lcom/googlecode/mp4parser/authoring/builder/b;->f:Ljava/util/logging/Logger;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v9

    invoke-virtual {v9}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    .line 7
    :goto_0
    array-length v13, v3

    if-lt v10, v13, :cond_1

    .line 8
    invoke-virtual {v4, v5}, Lcom/coremedia/iso/boxes/z0;->w([J)V

    move-object/from16 v13, p4

    .line 9
    invoke-virtual {v13, v4}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-void

    :cond_1
    move-object/from16 v13, p4

    .line 10
    sget-object v14, Lcom/googlecode/mp4parser/authoring/builder/b;->f:Ljava/util/logging/Logger;

    sget-object v15, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    invoke-virtual {v14, v15}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v14

    if-eqz v14, :cond_2

    .line 11
    sget-object v14, Lcom/googlecode/mp4parser/authoring/builder/b;->f:Ljava/util/logging/Logger;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v16

    move-object/from16 v17, v7

    invoke-virtual/range {v16 .. v16}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v6

    invoke-virtual {v15, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " chunk "

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Ljava/util/logging/Logger;->finer(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    move-object/from16 v17, v7

    .line 12
    :goto_1
    invoke-virtual/range {p2 .. p2}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_3

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v7, v17

    goto :goto_0

    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/googlecode/mp4parser/authoring/h;

    .line 13
    sget-object v14, Lcom/googlecode/mp4parser/authoring/builder/b;->f:Ljava/util/logging/Logger;

    sget-object v15, Ljava/util/logging/Level;->FINEST:Ljava/util/logging/Level;

    invoke-virtual {v14, v15}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v14

    if-eqz v14, :cond_4

    .line 14
    sget-object v14, Lcom/googlecode/mp4parser/authoring/builder/b;->f:Ljava/util/logging/Logger;

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v8, "Adding offsets of track_"

    invoke-direct {v15, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v7}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v8

    invoke-virtual {v8}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v8

    invoke-virtual {v15, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v14, v8}, Ljava/util/logging/Logger;->finest(Ljava/lang/String;)V

    .line 15
    :cond_4
    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [I

    const/4 v9, 0x0

    const-wide/16 v14, 0x0

    :goto_3
    if-lt v9, v10, :cond_7

    if-ne v7, v1, :cond_5

    .line 16
    aput-wide v11, v5, v10

    .line 17
    :cond_5
    invoke-static {v14, v15}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result v9

    :goto_4
    int-to-long v1, v9

    move-object/from16 v16, v3

    aget v3, v8, v10

    move-object/from16 v18, v4

    int-to-long v3, v3

    add-long/2addr v3, v14

    cmp-long v19, v1, v3

    if-ltz v19, :cond_6

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, v16

    move-object/from16 v4, v18

    goto :goto_2

    .line 18
    :cond_6
    iget-object v1, v0, Lcom/googlecode/mp4parser/authoring/builder/b;->d:Ljava/util/HashMap;

    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [J

    aget-wide v2, v1, v9

    add-long/2addr v11, v2

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v3, v16

    move-object/from16 v4, v18

    goto :goto_4

    :cond_7
    move-object/from16 v16, v3

    move-object/from16 v18, v4

    .line 19
    aget v1, v8, v9

    int-to-long v1, v1

    add-long/2addr v14, v1

    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    goto :goto_3
.end method

.method protected j(Lcom/googlecode/mp4parser/authoring/h;Ljava/util/Map;Lcom/coremedia/iso/boxes/u0;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "Ljava/util/Map<",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "[I>;",
            "Lcom/coremedia/iso/boxes/u0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [I

    .line 2
    new-instance p2, Lcom/coremedia/iso/boxes/v0;

    invoke-direct {p2}, Lcom/coremedia/iso/boxes/v0;-><init>()V

    .line 3
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {p2, v0}, Lcom/coremedia/iso/boxes/v0;->x(Ljava/util/List;)V

    const-wide/32 v0, -0x80000000

    const/4 v2, 0x0

    .line 4
    :goto_0
    array-length v3, p1

    if-lt v2, v3, :cond_0

    .line 5
    invoke-virtual {p3, p2}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-void

    .line 6
    :cond_0
    aget v3, p1, v2

    int-to-long v3, v3

    cmp-long v5, v0, v3

    if-eqz v5, :cond_1

    .line 7
    invoke-virtual {p2}, Lcom/coremedia/iso/boxes/v0;->w()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/coremedia/iso/boxes/v0$a;

    add-int/lit8 v3, v2, 0x1

    int-to-long v4, v3

    aget v3, p1, v2

    int-to-long v6, v3

    const-wide/16 v8, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lcom/coremedia/iso/boxes/v0$a;-><init>(JJJ)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    aget v0, p1, v2

    int-to-long v0, v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method protected k(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->o()Lcom/coremedia/iso/boxes/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-void
.end method

.method protected l(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->q()[J

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    array-length v0, p1

    if-lez v0, :cond_0

    .line 3
    new-instance v0, Lcom/coremedia/iso/boxes/c1;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/c1;-><init>()V

    .line 4
    invoke-virtual {v0, p1}, Lcom/coremedia/iso/boxes/c1;->w([J)V

    .line 5
    invoke-virtual {p2, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    :cond_0
    return-void
.end method

.method protected m(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/t0;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/t0;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->d:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [J

    invoke-virtual {v0, p1}, Lcom/coremedia/iso/boxes/t0;->A([J)V

    .line 3
    invoke-virtual {p2, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-void
.end method

.method protected n(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V
    .locals 11

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->O()[J

    move-result-object p1

    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-lt v3, v1, :cond_0

    .line 3
    new-instance p1, Lcom/coremedia/iso/boxes/d1;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/d1;-><init>()V

    .line 4
    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/d1;->x(Ljava/util/List;)V

    .line 5
    invoke-virtual {p2, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-void

    .line 6
    :cond_0
    aget-wide v4, p1, v3

    const-wide/16 v6, 0x1

    if-eqz v2, :cond_1

    .line 7
    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/d1$a;->b()J

    move-result-wide v8

    cmp-long v10, v8, v4

    if-nez v10, :cond_1

    .line 8
    invoke-virtual {v2}, Lcom/coremedia/iso/boxes/d1$a;->a()J

    move-result-wide v4

    add-long/2addr v4, v6

    invoke-virtual {v2, v4, v5}, Lcom/coremedia/iso/boxes/d1$a;->c(J)V

    goto :goto_1

    .line 9
    :cond_1
    new-instance v2, Lcom/coremedia/iso/boxes/d1$a;

    invoke-direct {v2, v6, v7, v4, v5}, Lcom/coremedia/iso/boxes/d1$a;-><init>(JJ)V

    .line 10
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method protected o(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->s()Lcom/coremedia/iso/boxes/a1;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->s()Lcom/coremedia/iso/boxes/a1;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    :cond_0
    return-void
.end method

.method protected p(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;Ljava/util/Map;)Lcom/coremedia/iso/boxes/f1;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "Lcom/googlecode/mp4parser/authoring/d;",
            "Ljava/util/Map<",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "[I>;)",
            "Lcom/coremedia/iso/boxes/f1;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/f1;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/f1;-><init>()V

    .line 2
    new-instance v1, Lcom/coremedia/iso/boxes/g1;

    invoke-direct {v1}, Lcom/coremedia/iso/boxes/g1;-><init>()V

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v1, v2}, Lcom/coremedia/iso/boxes/g1;->M(Z)V

    .line 4
    invoke-virtual {v1, v2}, Lcom/coremedia/iso/boxes/g1;->O(Z)V

    .line 5
    invoke-virtual {v1, v2}, Lcom/coremedia/iso/boxes/g1;->Q(Z)V

    .line 6
    invoke-virtual {v1, v2}, Lcom/coremedia/iso/boxes/g1;->P(Z)V

    .line 7
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/authoring/i;->f()Lcom/googlecode/mp4parser/util/l;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/coremedia/iso/boxes/g1;->S(Lcom/googlecode/mp4parser/util/l;)V

    .line 8
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/authoring/i;->b()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/coremedia/iso/boxes/g1;->J(I)V

    .line 9
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/authoring/i;->a()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/coremedia/iso/boxes/g1;->K(Ljava/util/Date;)V

    .line 10
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->H()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->H()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v3, 0x0

    .line 11
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->H()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1

    .line 12
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v5

    invoke-virtual {v5}, Lcom/googlecode/mp4parser/authoring/i;->h()J

    move-result-wide v5

    mul-long v3, v3, v5

    invoke-virtual {v1, v3, v4}, Lcom/coremedia/iso/boxes/g1;->L(J)V

    goto :goto_2

    .line 13
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/googlecode/mp4parser/authoring/c;

    .line 14
    invoke-virtual {v6}, Lcom/googlecode/mp4parser/authoring/c;->c()D

    move-result-wide v6

    double-to-long v6, v6

    add-long/2addr v3, v6

    goto :goto_0

    .line 15
    :cond_2
    :goto_1
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getDuration()J

    move-result-wide v3

    invoke-virtual {p0, p2}, Lcom/googlecode/mp4parser/authoring/builder/b;->t(Lcom/googlecode/mp4parser/authoring/d;)J

    move-result-wide v5

    mul-long v3, v3, v5

    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v5

    invoke-virtual {v5}, Lcom/googlecode/mp4parser/authoring/i;->h()J

    move-result-wide v5

    div-long/2addr v3, v5

    invoke-virtual {v1, v3, v4}, Lcom/coremedia/iso/boxes/g1;->L(J)V

    .line 16
    :goto_2
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/authoring/i;->c()D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/coremedia/iso/boxes/g1;->N(D)V

    .line 17
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/authoring/i;->k()D

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/coremedia/iso/boxes/g1;->W(D)V

    .line 18
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/authoring/i;->e()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/coremedia/iso/boxes/g1;->R(I)V

    .line 19
    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1, v3}, Lcom/coremedia/iso/boxes/g1;->T(Ljava/util/Date;)V

    .line 20
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/coremedia/iso/boxes/g1;->U(J)V

    .line 21
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v3

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/authoring/i;->j()F

    move-result v3

    invoke-virtual {v1, v3}, Lcom/coremedia/iso/boxes/g1;->V(F)V

    .line 22
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 23
    invoke-virtual {p0, p1, p2}, Lcom/googlecode/mp4parser/authoring/builder/b;->d(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 24
    new-instance v1, Lcom/coremedia/iso/boxes/d0;

    invoke-direct {v1}, Lcom/coremedia/iso/boxes/d0;-><init>()V

    .line 25
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 26
    new-instance v3, Lcom/coremedia/iso/boxes/e0;

    invoke-direct {v3}, Lcom/coremedia/iso/boxes/e0;-><init>()V

    .line 27
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v4

    invoke-virtual {v4}, Lcom/googlecode/mp4parser/authoring/i;->a()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/coremedia/iso/boxes/e0;->A(Ljava/util/Date;)V

    .line 28
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getDuration()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/coremedia/iso/boxes/e0;->B(J)V

    .line 29
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v4

    invoke-virtual {v4}, Lcom/googlecode/mp4parser/authoring/i;->h()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/coremedia/iso/boxes/e0;->E(J)V

    .line 30
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v4

    invoke-virtual {v4}, Lcom/googlecode/mp4parser/authoring/i;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/coremedia/iso/boxes/e0;->C(Ljava/lang/String;)V

    .line 31
    invoke-virtual {v1, v3}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 32
    new-instance v3, Lcom/coremedia/iso/boxes/x;

    invoke-direct {v3}, Lcom/coremedia/iso/boxes/x;-><init>()V

    .line 33
    invoke-virtual {v1, v3}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 34
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/coremedia/iso/boxes/x;->y(Ljava/lang/String;)V

    .line 35
    new-instance v3, Lcom/coremedia/iso/boxes/f0;

    invoke-direct {v3}, Lcom/coremedia/iso/boxes/f0;-><init>()V

    .line 36
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "vide"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 37
    new-instance v4, Lcom/coremedia/iso/boxes/m1;

    invoke-direct {v4}, Lcom/coremedia/iso/boxes/m1;-><init>()V

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_3

    .line 38
    :cond_3
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v4

    const-string v5, "soun"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 39
    new-instance v4, Lcom/coremedia/iso/boxes/y0;

    invoke-direct {v4}, Lcom/coremedia/iso/boxes/y0;-><init>()V

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_3

    .line 40
    :cond_4
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "text"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 41
    new-instance v4, Lcom/coremedia/iso/boxes/j0;

    invoke-direct {v4}, Lcom/coremedia/iso/boxes/j0;-><init>()V

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_3

    .line 42
    :cond_5
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "subt"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    .line 43
    new-instance v4, Lcom/coremedia/iso/boxes/b1;

    invoke-direct {v4}, Lcom/coremedia/iso/boxes/b1;-><init>()V

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_3

    .line 44
    :cond_6
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v4

    const-string v5, "hint"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 45
    new-instance v4, Lcom/coremedia/iso/boxes/y;

    invoke-direct {v4}, Lcom/coremedia/iso/boxes/y;-><init>()V

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_3

    .line 46
    :cond_7
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v4

    const-string v5, "sbtl"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    .line 47
    new-instance v4, Lcom/coremedia/iso/boxes/j0;

    invoke-direct {v4}, Lcom/coremedia/iso/boxes/j0;-><init>()V

    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 48
    :cond_8
    :goto_3
    new-instance v4, Lcom/coremedia/iso/boxes/n;

    invoke-direct {v4}, Lcom/coremedia/iso/boxes/n;-><init>()V

    .line 49
    new-instance v5, Lcom/coremedia/iso/boxes/o;

    invoke-direct {v5}, Lcom/coremedia/iso/boxes/o;-><init>()V

    .line 50
    invoke-virtual {v4, v5}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 51
    new-instance v6, Lcom/coremedia/iso/boxes/l;

    invoke-direct {v6}, Lcom/coremedia/iso/boxes/l;-><init>()V

    .line 52
    invoke-virtual {v6, v2}, Lcom/googlecode/mp4parser/c;->setFlags(I)V

    .line 53
    invoke-virtual {v5, v6}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 54
    invoke-virtual {v3, v4}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 55
    invoke-virtual {p0, p1, p2, p3}, Lcom/googlecode/mp4parser/authoring/builder/b;->h(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;Ljava/util/Map;)Lcom/coremedia/iso/boxes/d;

    move-result-object p1

    .line 56
    invoke-virtual {v3, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 57
    invoke-virtual {v1, v3}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-object v0
.end method

.method protected q(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method s(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)[I
    .locals 10

    .line 1
    iget-object p2, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->e:Lcom/googlecode/mp4parser/authoring/builder/c;

    invoke-interface {p2, p1}, Lcom/googlecode/mp4parser/authoring/builder/c;->a(Lcom/googlecode/mp4parser/authoring/h;)[J

    move-result-object p2

    .line 2
    array-length v0, p2

    new-array v0, v0, [I

    const/4 v1, 0x0

    .line 3
    :goto_0
    array-length v2, p2

    if-lt v1, v2, :cond_0

    return-object v0

    .line 4
    :cond_0
    aget-wide v2, p2, v1

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    .line 5
    array-length v6, p2

    add-int/lit8 v7, v1, 0x1

    if-ne v6, v7, :cond_1

    .line 6
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->x()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    int-to-long v4, v4

    goto :goto_1

    .line 7
    :cond_1
    aget-wide v8, p2, v7

    sub-long v4, v8, v4

    :goto_1
    sub-long/2addr v4, v2

    .line 8
    invoke-static {v4, v5}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result v2

    aput v2, v0, v1

    move v1, v7

    goto :goto_0
.end method

.method public t(Lcom/googlecode/mp4parser/authoring/d;)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/mp4parser/authoring/h;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/i;->h()J

    move-result-wide v0

    .line 2
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/googlecode/mp4parser/authoring/h;

    .line 3
    invoke-interface {v2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/authoring/i;->h()J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Lcom/googlecode/mp4parser/authoring/builder/b;->r(JJ)J

    move-result-wide v0

    goto :goto_0
.end method

.method protected u(Lcom/googlecode/mp4parser/authoring/h;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public v(Lcom/googlecode/mp4parser/authoring/builder/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/builder/b;->e:Lcom/googlecode/mp4parser/authoring/builder/c;

    return-void
.end method
