.class public Lcom/googlecode/mp4parser/authoring/builder/d;
.super Ljava/lang/Object;
.source "FragmentedMp4Builder.java"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/builder/e;


# static fields
.field private static final b:Ljava/util/logging/Logger;

.field static final synthetic c:Z


# instance fields
.field protected a:Lcom/googlecode/mp4parser/authoring/builder/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/googlecode/mp4parser/authoring/builder/d;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/googlecode/mp4parser/authoring/builder/d;->b:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private I(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;)J
    .locals 4

    .line 1
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->getDuration()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->e()J

    move-result-wide v2

    mul-long v0, v0, v2

    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/i;->h()J

    move-result-wide p1

    div-long/2addr v0, p1

    return-wide v0
.end method


# virtual methods
.method protected A(JJLcom/googlecode/mp4parser/authoring/h;ILcom/coremedia/iso/boxes/fragment/c;)V
    .locals 16

    move-wide/from16 v8, p1

    move-object/from16 v10, p5

    .line 1
    new-instance v11, Lcom/coremedia/iso/boxes/fragment/k;

    invoke-direct {v11}, Lcom/coremedia/iso/boxes/fragment/k;-><init>()V

    move-object/from16 v0, p7

    .line 2
    invoke-virtual {v0, v11}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object v7, v11

    .line 3
    invoke-virtual/range {v0 .. v7}, Lcom/googlecode/mp4parser/authoring/builder/d;->x(JJLcom/googlecode/mp4parser/authoring/h;ILcom/coremedia/iso/boxes/fragment/k;)V

    move-object/from16 v12, p0

    .line 4
    invoke-virtual {v12, v8, v9, v10, v11}, Lcom/googlecode/mp4parser/authoring/builder/d;->w(JLcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/fragment/k;)V

    .line 5
    invoke-virtual/range {v0 .. v7}, Lcom/googlecode/mp4parser/authoring/builder/d;->D(JJLcom/googlecode/mp4parser/authoring/h;ILcom/coremedia/iso/boxes/fragment/k;)V

    .line 6
    instance-of v0, v10, Lcom/googlecode/mp4parser/authoring/tracks/g;

    if-eqz v0, :cond_0

    .line 7
    move-object v13, v10

    check-cast v13, Lcom/googlecode/mp4parser/authoring/tracks/g;

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-object v5, v13

    move/from16 v6, p6

    move-object v7, v11

    invoke-virtual/range {v0 .. v7}, Lcom/googlecode/mp4parser/authoring/builder/d;->s(JJLcom/googlecode/mp4parser/authoring/tracks/g;ILcom/coremedia/iso/boxes/fragment/k;)V

    .line 8
    invoke-virtual/range {v0 .. v7}, Lcom/googlecode/mp4parser/authoring/builder/d;->t(JJLcom/googlecode/mp4parser/authoring/tracks/g;ILcom/coremedia/iso/boxes/fragment/k;)V

    .line 9
    invoke-virtual/range {v0 .. v7}, Lcom/googlecode/mp4parser/authoring/builder/d;->r(JJLcom/googlecode/mp4parser/authoring/tracks/g;ILcom/coremedia/iso/boxes/fragment/k;)V

    .line 10
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->I()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_7

    .line 12
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 13
    new-instance v4, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/e;

    invoke-direct {v4}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/e;-><init>()V

    .line 14
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 15
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    invoke-virtual {v4, v1}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/e;->z(Ljava/util/List;)V

    .line 16
    new-instance v5, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f;

    invoke-direct {v5}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f;-><init>()V

    .line 17
    invoke-virtual {v5, v0}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f;->z(Ljava/lang/String;)V

    const/4 v0, 0x0

    const-wide/16 v6, 0x1

    sub-long v13, v8, v6

    .line 18
    invoke-static {v13, v14}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result v1

    move-object v13, v0

    move v14, v1

    :goto_2
    sub-long v0, p3, v6

    invoke-static {v0, v1}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result v0

    if-lt v14, v0, :cond_2

    .line 19
    invoke-virtual {v11, v4}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 20
    invoke-virtual {v11, v5}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 21
    :goto_3
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v15

    if-lt v0, v15, :cond_5

    if-eqz v13, :cond_4

    .line 22
    invoke-virtual {v13}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f$a;->a()I

    move-result v0

    if-eq v0, v1, :cond_3

    goto :goto_4

    .line 23
    :cond_3
    invoke-virtual {v13}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f$a;->b()J

    move-result-wide v0

    add-long/2addr v0, v6

    invoke-virtual {v13, v0, v1}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f$a;->d(J)V

    goto :goto_5

    .line 24
    :cond_4
    :goto_4
    new-instance v0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f$a;

    invoke-direct {v0, v6, v7, v1}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f$a;-><init>(JI)V

    .line 25
    invoke-virtual {v5}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/f;->v()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object v13, v0

    :goto_5
    add-int/lit8 v14, v14, 0x1

    goto :goto_2

    .line 26
    :cond_5
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/List;

    invoke-interface {v15, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/b;

    .line 27
    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->I()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [J

    move v15, v1

    move-object v7, v2

    int-to-long v1, v14

    .line 28
    invoke-static {v6, v1, v2}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v1

    if-ltz v1, :cond_6

    add-int/lit8 v1, v0, 0x1

    goto :goto_6

    :cond_6
    move v1, v15

    :goto_6
    add-int/lit8 v0, v0, 0x1

    move-object v2, v7

    const-wide/16 v6, 0x1

    goto :goto_3

    .line 29
    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 30
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/b;

    invoke-virtual {v3}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/b;->getType()Ljava/lang/String;

    move-result-object v3

    .line 31
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-nez v4, :cond_8

    .line 32
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 33
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    :cond_8
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/b;

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method protected B(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;
    .locals 3

    .line 1
    sget-object v0, Lcom/googlecode/mp4parser/authoring/builder/d;->b:Ljava/util/logging/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Creating Track "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/coremedia/iso/boxes/f1;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/f1;-><init>()V

    .line 3
    invoke-virtual {p0, p2, p1}, Lcom/googlecode/mp4parser/authoring/builder/d;->z(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;)Lcom/coremedia/iso/boxes/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/googlecode/mp4parser/authoring/builder/d;->c(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 5
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/googlecode/mp4parser/authoring/builder/d;->h(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-object v0
.end method

.method protected C(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;)Lcom/coremedia/iso/boxes/d;
    .locals 3

    .line 1
    new-instance p1, Lcom/coremedia/iso/boxes/fragment/i;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/fragment/i;-><init>()V

    .line 2
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/coremedia/iso/boxes/fragment/i;->F(J)V

    const-wide/16 v0, 0x1

    .line 3
    invoke-virtual {p1, v0, v1}, Lcom/coremedia/iso/boxes/fragment/i;->B(J)V

    const-wide/16 v0, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Lcom/coremedia/iso/boxes/fragment/i;->C(J)V

    .line 5
    invoke-virtual {p1, v0, v1}, Lcom/coremedia/iso/boxes/fragment/i;->E(J)V

    .line 6
    new-instance v0, Lcom/coremedia/iso/boxes/fragment/g;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/fragment/g;-><init>()V

    .line 7
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v1

    const-string v2, "soun"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object p2

    const-string/jumbo v1, "subt"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    :cond_0
    const/4 p2, 0x2

    .line 8
    invoke-virtual {v0, p2}, Lcom/coremedia/iso/boxes/fragment/g;->k(I)V

    .line 9
    invoke-virtual {v0, p2}, Lcom/coremedia/iso/boxes/fragment/g;->m(I)V

    .line 10
    :cond_1
    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/fragment/i;->D(Lcom/coremedia/iso/boxes/fragment/g;)V

    return-object p1
.end method

.method protected D(JJLcom/googlecode/mp4parser/authoring/h;ILcom/coremedia/iso/boxes/fragment/k;)V
    .locals 18

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/fragment/n;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/fragment/n;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/c;->setVersion(I)V

    .line 3
    invoke-virtual/range {p0 .. p6}, Lcom/googlecode/mp4parser/authoring/builder/d;->G(JJLcom/googlecode/mp4parser/authoring/h;I)[J

    move-result-object v2

    .line 4
    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/fragment/n;->L(Z)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/fragment/n;->N(Z)V

    .line 6
    new-instance v3, Ljava/util/ArrayList;

    sub-long v4, p3, p1

    invoke-static {v4, v5}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->n()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 8
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_0

    .line 9
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    new-array v5, v5, [Lcom/coremedia/iso/boxes/i$a;

    invoke-interface {v4, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lcom/coremedia/iso/boxes/i$a;

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x0

    if-eqz v4, :cond_1

    .line 10
    aget-object v6, v4, v5

    invoke-virtual {v6}, Lcom/coremedia/iso/boxes/i$a;->a()I

    move-result v6

    goto :goto_1

    :cond_1
    const/4 v6, -0x1

    :goto_1
    int-to-long v6, v6

    const-wide/16 v8, 0x0

    cmp-long v10, v6, v8

    if-lez v10, :cond_2

    const/4 v10, 0x1

    goto :goto_2

    :cond_2
    const/4 v10, 0x0

    .line 11
    :goto_2
    invoke-virtual {v0, v10}, Lcom/coremedia/iso/boxes/fragment/n;->K(Z)V

    const-wide/16 v12, 0x1

    const/4 v14, 0x0

    :goto_3
    cmp-long v15, v12, p1

    if-ltz v15, :cond_c

    .line 12
    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->U()Ljava/util/List;

    move-result-object v12

    if-eqz v12, :cond_3

    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->U()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_4

    .line 13
    :cond_3
    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->q()[J

    move-result-object v12

    if-eqz v12, :cond_5

    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->q()[J

    move-result-object v12

    array-length v12, v12

    if-nez v12, :cond_4

    goto :goto_4

    :cond_4
    const/4 v15, 0x1

    goto :goto_5

    :cond_5
    :goto_4
    const/4 v15, 0x0

    .line 14
    :goto_5
    invoke-virtual {v0, v15}, Lcom/coremedia/iso/boxes/fragment/n;->M(Z)V

    const/4 v12, 0x0

    .line 15
    :goto_6
    array-length v13, v2

    if-lt v12, v13, :cond_6

    .line 16
    invoke-virtual {v0, v3}, Lcom/coremedia/iso/boxes/fragment/n;->I(Ljava/util/List;)V

    move-object/from16 v13, p7

    .line 17
    invoke-virtual {v13, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-void

    :cond_6
    move-object/from16 v13, p7

    .line 18
    new-instance v8, Lcom/coremedia/iso/boxes/fragment/n$a;

    invoke-direct {v8}, Lcom/coremedia/iso/boxes/fragment/n$a;-><init>()V

    .line 19
    aget-wide v10, v2, v12

    invoke-virtual {v8, v10, v11}, Lcom/coremedia/iso/boxes/fragment/n$a;->p(J)V

    if-eqz v15, :cond_a

    .line 20
    new-instance v9, Lcom/coremedia/iso/boxes/fragment/g;

    invoke-direct {v9}, Lcom/coremedia/iso/boxes/fragment/g;-><init>()V

    .line 21
    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->U()Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_7

    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->U()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_7

    .line 22
    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->U()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/coremedia/iso/boxes/r0$a;

    .line 23
    invoke-virtual {v10}, Lcom/coremedia/iso/boxes/r0$a;->c()I

    move-result v11

    invoke-virtual {v9, v11}, Lcom/coremedia/iso/boxes/fragment/g;->k(I)V

    .line 24
    invoke-virtual {v10}, Lcom/coremedia/iso/boxes/r0$a;->e()I

    move-result v11

    invoke-virtual {v9, v11}, Lcom/coremedia/iso/boxes/fragment/g;->m(I)V

    .line 25
    invoke-virtual {v10}, Lcom/coremedia/iso/boxes/r0$a;->d()I

    move-result v10

    invoke-virtual {v9, v10}, Lcom/coremedia/iso/boxes/fragment/g;->l(I)V

    .line 26
    :cond_7
    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->q()[J

    move-result-object v10

    if-eqz v10, :cond_9

    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->q()[J

    move-result-object v10

    array-length v10, v10

    if-lez v10, :cond_9

    .line 27
    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->q()[J

    move-result-object v10

    move-object/from16 p6, v2

    int-to-long v1, v12

    add-long v1, p1, v1

    invoke-static {v10, v1, v2}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v1

    if-ltz v1, :cond_8

    .line 28
    invoke-virtual {v9, v5}, Lcom/coremedia/iso/boxes/fragment/g;->n(Z)V

    const/4 v1, 0x2

    .line 29
    invoke-virtual {v9, v1}, Lcom/coremedia/iso/boxes/fragment/g;->k(I)V

    goto :goto_7

    :cond_8
    const/4 v1, 0x1

    .line 30
    invoke-virtual {v9, v1}, Lcom/coremedia/iso/boxes/fragment/g;->n(Z)V

    .line 31
    invoke-virtual {v9, v1}, Lcom/coremedia/iso/boxes/fragment/g;->k(I)V

    goto :goto_7

    :cond_9
    move-object/from16 p6, v2

    .line 32
    :goto_7
    invoke-virtual {v8, v9}, Lcom/coremedia/iso/boxes/fragment/n$a;->o(Lcom/coremedia/iso/boxes/fragment/g;)V

    goto :goto_8

    :cond_a
    move-object/from16 p6, v2

    .line 33
    :goto_8
    invoke-interface/range {p5 .. p5}, Lcom/googlecode/mp4parser/authoring/h;->O()[J

    move-result-object v1

    int-to-long v9, v12

    add-long v9, p1, v9

    const-wide/16 v16, 0x1

    sub-long v9, v9, v16

    invoke-static {v9, v10}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result v2

    aget-wide v9, v1, v2

    invoke-virtual {v8, v9, v10}, Lcom/coremedia/iso/boxes/fragment/n$a;->n(J)V

    if-eqz v4, :cond_b

    .line 34
    aget-object v1, v4, v14

    invoke-virtual {v1}, Lcom/coremedia/iso/boxes/i$a;->b()I

    move-result v1

    invoke-virtual {v8, v1}, Lcom/coremedia/iso/boxes/fragment/n$a;->m(I)V

    sub-long v6, v6, v16

    const-wide/16 v1, 0x0

    cmp-long v9, v6, v1

    if-nez v9, :cond_b

    .line 35
    array-length v1, v4

    sub-int/2addr v1, v14

    const/4 v2, 0x1

    if-le v1, v2, :cond_b

    add-int/lit8 v14, v14, 0x1

    .line 36
    aget-object v1, v4, v14

    invoke-virtual {v1}, Lcom/coremedia/iso/boxes/i$a;->a()I

    move-result v1

    int-to-long v1, v1

    move-wide v6, v1

    .line 37
    :cond_b
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v2, p6

    const/4 v1, 0x1

    const-wide/16 v8, 0x0

    goto/16 :goto_6

    :cond_c
    move-object/from16 p6, v2

    if-eqz v4, :cond_d

    const-wide/16 v1, 0x1

    sub-long/2addr v6, v1

    const-wide/16 v1, 0x0

    cmp-long v8, v6, v1

    if-nez v8, :cond_e

    .line 38
    array-length v8, v4

    sub-int/2addr v8, v14

    const/4 v9, 0x1

    if-le v8, v9, :cond_f

    add-int/lit8 v14, v14, 0x1

    .line 39
    aget-object v6, v4, v14

    invoke-virtual {v6}, Lcom/coremedia/iso/boxes/i$a;->a()I

    move-result v6

    int-to-long v6, v6

    goto :goto_9

    :cond_d
    const-wide/16 v1, 0x0

    :cond_e
    const/4 v9, 0x1

    :cond_f
    :goto_9
    const-wide/16 v10, 0x1

    add-long/2addr v12, v10

    move-wide v8, v1

    const/4 v1, 0x1

    move-object/from16 v2, p6

    goto/16 :goto_3
.end method

.method public E()Ljava/util/Date;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    return-object v0
.end method

.method public F()Lcom/googlecode/mp4parser/authoring/builder/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/builder/d;->a:Lcom/googlecode/mp4parser/authoring/builder/c;

    return-object v0
.end method

.method protected G(JJLcom/googlecode/mp4parser/authoring/h;I)[J
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lcom/googlecode/mp4parser/authoring/builder/d;->H(JJLcom/googlecode/mp4parser/authoring/h;I)Ljava/util/List;

    move-result-object p1

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    new-array p3, p2, [J

    const/4 p4, 0x0

    :goto_0
    if-lt p4, p2, :cond_0

    return-object p3

    .line 3
    :cond_0
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/googlecode/mp4parser/authoring/f;

    invoke-interface {p5}, Lcom/googlecode/mp4parser/authoring/f;->getSize()J

    move-result-wide p5

    aput-wide p5, p3, p4

    add-int/lit8 p4, p4, 0x1

    goto :goto_0
.end method

.method protected H(JJLcom/googlecode/mp4parser/authoring/h;I)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "I)",
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/f;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p5}, Lcom/googlecode/mp4parser/authoring/h;->x()Ljava/util/List;

    move-result-object p5

    invoke-static {p1, p2}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-static {p3, p4}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-interface {p5, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public J(Lcom/googlecode/mp4parser/authoring/builder/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/builder/d;->a:Lcom/googlecode/mp4parser/authoring/builder/c;

    return-void
.end method

.method protected K(Ljava/util/List;ILjava/util/Map;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/h;",
            ">;I",
            "Ljava/util/Map<",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "[J>;)",
            "Ljava/util/List<",
            "Lcom/googlecode/mp4parser/authoring/h;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0, p1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    .line 2
    new-instance p1, Lcom/googlecode/mp4parser/authoring/builder/d$a;

    invoke-direct {p1, p0, p3, p2}, Lcom/googlecode/mp4parser/authoring/builder/d$a;-><init>(Lcom/googlecode/mp4parser/authoring/builder/d;Ljava/util/Map;I)V

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public a(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/j;
    .locals 5

    .line 1
    sget-object v0, Lcom/googlecode/mp4parser/authoring/builder/d;->b:Ljava/util/logging/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Creating movie "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/builder/d;->a:Lcom/googlecode/mp4parser/authoring/builder/c;

    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/googlecode/mp4parser/authoring/h;

    .line 4
    invoke-interface {v2}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "vide"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v0, v2

    .line 5
    :goto_0
    new-instance v1, Lcom/googlecode/mp4parser/authoring/builder/g;

    const/4 v2, -0x1

    invoke-direct {v1, p1, v0, v2}, Lcom/googlecode/mp4parser/authoring/builder/g;-><init>(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;I)V

    iput-object v1, p0, Lcom/googlecode/mp4parser/authoring/builder/d;->a:Lcom/googlecode/mp4parser/authoring/builder/c;

    .line 6
    :cond_2
    new-instance v0, Lcom/googlecode/mp4parser/d;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/d;-><init>()V

    .line 7
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/authoring/builder/d;->e(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 8
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/authoring/builder/d;->o(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 9
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/authoring/builder/d;->n(Lcom/googlecode/mp4parser/authoring/d;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    .line 10
    invoke-virtual {p0, p1, v0}, Lcom/googlecode/mp4parser/authoring/builder/d;->k(Lcom/googlecode/mp4parser/authoring/d;Lcom/coremedia/iso/boxes/j;)Lcom/coremedia/iso/boxes/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-object v0

    .line 11
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/coremedia/iso/boxes/d;

    .line 12
    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_1
.end method

.method protected b(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;)Lcom/coremedia/iso/boxes/n;
    .locals 2

    .line 1
    new-instance p1, Lcom/coremedia/iso/boxes/n;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/n;-><init>()V

    .line 2
    new-instance p2, Lcom/coremedia/iso/boxes/o;

    invoke-direct {p2}, Lcom/coremedia/iso/boxes/o;-><init>()V

    .line 3
    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 4
    new-instance v0, Lcom/coremedia/iso/boxes/l;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/l;-><init>()V

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/c;->setFlags(I)V

    .line 6
    invoke-virtual {p2, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-object p1
.end method

.method protected c(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;
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

.method protected d(Ljava/util/List;Lcom/googlecode/mp4parser/authoring/h;[JII)I
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/coremedia/iso/boxes/d;",
            ">;",
            "Lcom/googlecode/mp4parser/authoring/h;",
            "[JII)I"
        }
    .end annotation

    .line 1
    array-length v0, p3

    if-ge p4, v0, :cond_1

    .line 2
    aget-wide v8, p3, p4

    add-int/lit8 p4, p4, 0x1

    .line 3
    array-length v0, p3

    if-ge p4, v0, :cond_0

    aget-wide v0, p3, p4

    move-wide p3, v0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->x()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    add-int/lit8 p3, p3, 0x1

    int-to-long p3, p3

    :goto_0
    cmp-long v0, v8, p3

    if-eqz v0, :cond_1

    move-object v1, p0

    move-wide v2, v8

    move-wide v4, p3

    move-object v6, p2

    move v7, p5

    .line 4
    invoke-virtual/range {v1 .. v7}, Lcom/googlecode/mp4parser/authoring/builder/d;->m(JJLcom/googlecode/mp4parser/authoring/h;I)Lcom/coremedia/iso/boxes/d;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, p5, 0x1

    .line 5
    invoke-virtual/range {v1 .. v7}, Lcom/googlecode/mp4parser/authoring/builder/d;->f(JJLcom/googlecode/mp4parser/authoring/h;I)Lcom/coremedia/iso/boxes/d;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move p5, v0

    :cond_1
    return p5
.end method

.method public e(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;
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

.method protected f(JJLcom/googlecode/mp4parser/authoring/h;I)Lcom/coremedia/iso/boxes/d;
    .locals 9

    .line 1
    new-instance v8, Lcom/googlecode/mp4parser/authoring/builder/d$b;

    move-object v0, v8

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/googlecode/mp4parser/authoring/builder/d$b;-><init>(Lcom/googlecode/mp4parser/authoring/builder/d;JJLcom/googlecode/mp4parser/authoring/h;I)V

    return-object v8
.end method

.method protected g(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;)Lcom/coremedia/iso/boxes/d;
    .locals 2

    .line 1
    new-instance p1, Lcom/coremedia/iso/boxes/e0;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/e0;-><init>()V

    .line 2
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/i;->a()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/e0;->A(Ljava/util/Date;)V

    .line 3
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/builder/d;->E()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/e0;->D(Ljava/util/Date;)V

    const-wide/16 v0, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Lcom/coremedia/iso/boxes/e0;->B(J)V

    .line 5
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/i;->h()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/coremedia/iso/boxes/e0;->E(J)V

    .line 6
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object p2

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/authoring/i;->d()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/coremedia/iso/boxes/e0;->C(Ljava/lang/String;)V

    return-object p1
.end method

.method protected h(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;
    .locals 2

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/d0;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/d0;-><init>()V

    .line 2
    invoke-virtual {p0, p2, p1}, Lcom/googlecode/mp4parser/authoring/builder/d;->g(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;)Lcom/coremedia/iso/boxes/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/googlecode/mp4parser/authoring/builder/d;->i(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/googlecode/mp4parser/authoring/builder/d;->l(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-object v0
.end method

.method protected i(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;
    .locals 0

    .line 1
    new-instance p2, Lcom/coremedia/iso/boxes/x;

    invoke-direct {p2}, Lcom/coremedia/iso/boxes/x;-><init>()V

    .line 2
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/coremedia/iso/boxes/x;->y(Ljava/lang/String;)V

    return-object p2
.end method

.method protected j(JJLcom/googlecode/mp4parser/authoring/h;ILcom/coremedia/iso/boxes/fragment/c;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/coremedia/iso/boxes/fragment/d;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/fragment/d;-><init>()V

    int-to-long p2, p6

    .line 2
    invoke-virtual {p1, p2, p3}, Lcom/coremedia/iso/boxes/fragment/d;->w(J)V

    .line 3
    invoke-virtual {p7, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-void
.end method

.method protected k(Lcom/googlecode/mp4parser/authoring/d;Lcom/coremedia/iso/boxes/j;)Lcom/coremedia/iso/boxes/d;
    .locals 3

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/fragment/e;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/fragment/e;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    new-instance p1, Lcom/coremedia/iso/boxes/fragment/f;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/fragment/f;-><init>()V

    .line 4
    invoke-virtual {v0, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 5
    invoke-virtual {v0}, Lcom/googlecode/mp4parser/b;->getSize()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lcom/coremedia/iso/boxes/fragment/f;->w(J)V

    return-object v0

    .line 6
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/googlecode/mp4parser/authoring/h;

    .line 7
    invoke-virtual {p0, v1, p2}, Lcom/googlecode/mp4parser/authoring/builder/d;->y(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/j;)Lcom/coremedia/iso/boxes/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_0
.end method

.method protected l(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;
    .locals 3

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/f0;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/f0;-><init>()V

    .line 2
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "vide"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    new-instance v1, Lcom/coremedia/iso/boxes/m1;

    invoke-direct {v1}, Lcom/coremedia/iso/boxes/m1;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v1

    const-string v2, "soun"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    new-instance v1, Lcom/coremedia/iso/boxes/y0;

    invoke-direct {v1}, Lcom/coremedia/iso/boxes/y0;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "text"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    new-instance v1, Lcom/coremedia/iso/boxes/j0;

    invoke-direct {v1}, Lcom/coremedia/iso/boxes/j0;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_0

    .line 8
    :cond_2
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "subt"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 9
    new-instance v1, Lcom/coremedia/iso/boxes/b1;

    invoke-direct {v1}, Lcom/coremedia/iso/boxes/b1;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_0

    .line 10
    :cond_3
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v1

    const-string v2, "hint"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 11
    new-instance v1, Lcom/coremedia/iso/boxes/y;

    invoke-direct {v1}, Lcom/coremedia/iso/boxes/y;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_0

    .line 12
    :cond_4
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v1

    const-string v2, "sbtl"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 13
    new-instance v1, Lcom/coremedia/iso/boxes/j0;

    invoke-direct {v1}, Lcom/coremedia/iso/boxes/j0;-><init>()V

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 14
    :cond_5
    :goto_0
    invoke-virtual {p0, p2, p1}, Lcom/googlecode/mp4parser/authoring/builder/d;->b(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;)Lcom/coremedia/iso/boxes/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 15
    invoke-virtual {p0, p2, p1}, Lcom/googlecode/mp4parser/authoring/builder/d;->u(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;)Lcom/coremedia/iso/boxes/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-object v0
.end method

.method protected m(JJLcom/googlecode/mp4parser/authoring/h;I)Lcom/coremedia/iso/boxes/d;
    .locals 9

    .line 1
    new-instance v8, Lcom/coremedia/iso/boxes/fragment/c;

    invoke-direct {v8}, Lcom/coremedia/iso/boxes/fragment/c;-><init>()V

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    move v6, p6

    move-object v7, v8

    .line 2
    invoke-virtual/range {v0 .. v7}, Lcom/googlecode/mp4parser/authoring/builder/d;->j(JJLcom/googlecode/mp4parser/authoring/h;ILcom/coremedia/iso/boxes/fragment/c;)V

    .line 3
    invoke-virtual/range {v0 .. v7}, Lcom/googlecode/mp4parser/authoring/builder/d;->A(JJLcom/googlecode/mp4parser/authoring/h;ILcom/coremedia/iso/boxes/fragment/c;)V

    .line 4
    invoke-virtual {v8}, Lcom/coremedia/iso/boxes/fragment/c;->N()Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/coremedia/iso/boxes/fragment/n;

    const/4 p2, 0x1

    .line 5
    invoke-virtual {p1, p2}, Lcom/coremedia/iso/boxes/fragment/n;->G(I)V

    .line 6
    invoke-virtual {v8}, Lcom/googlecode/mp4parser/b;->getSize()J

    move-result-wide p2

    const-wide/16 p4, 0x8

    add-long/2addr p2, p4

    long-to-int p3, p2

    invoke-virtual {p1, p3}, Lcom/coremedia/iso/boxes/fragment/n;->G(I)V

    return-object v8
.end method

.method protected n(Lcom/googlecode/mp4parser/authoring/d;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/googlecode/mp4parser/authoring/d;",
            ")",
            "Ljava/util/List<",
            "Lcom/coremedia/iso/boxes/d;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v6, Ljava/util/LinkedList;

    invoke-direct {v6}, Ljava/util/LinkedList;-><init>()V

    .line 2
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 3
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v8, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v0, 0x1

    const/4 v9, 0x0

    :goto_1
    if-lt v9, v8, :cond_0

    return-object v6

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1, v9, v7}, Lcom/googlecode/mp4parser/authoring/builder/d;->K(Ljava/util/List;ILjava/util/Map;)Ljava/util/List;

    move-result-object v1

    .line 5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move v5, v0

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    add-int/lit8 v9, v9, 0x1

    move v0, v5

    goto :goto_1

    :cond_1
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/googlecode/mp4parser/authoring/h;

    .line 6
    invoke-virtual {v7, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [J

    move-object v0, p0

    move-object v1, v6

    move v4, v9

    .line 7
    invoke-virtual/range {v0 .. v5}, Lcom/googlecode/mp4parser/authoring/builder/d;->d(Ljava/util/List;Lcom/googlecode/mp4parser/authoring/h;[JII)I

    move-result v5

    goto :goto_2

    .line 8
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/googlecode/mp4parser/authoring/h;

    .line 9
    iget-object v3, p0, Lcom/googlecode/mp4parser/authoring/builder/d;->a:Lcom/googlecode/mp4parser/authoring/builder/c;

    invoke-interface {v3, v2}, Lcom/googlecode/mp4parser/authoring/builder/c;->a(Lcom/googlecode/mp4parser/authoring/h;)[J

    move-result-object v3

    .line 10
    invoke-virtual {v7, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    array-length v2, v3

    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    move-result v8

    goto :goto_0
.end method

.method protected o(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;
    .locals 3

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/h0;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/h0;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/authoring/builder/d;->q(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 3
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    .line 4
    invoke-virtual {p0, p1}, Lcom/googlecode/mp4parser/authoring/builder/d;->p(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-object v0

    .line 5
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/googlecode/mp4parser/authoring/h;

    .line 6
    invoke-virtual {p0, v2, p1}, Lcom/googlecode/mp4parser/authoring/builder/d;->B(Lcom/googlecode/mp4parser/authoring/h;Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_0
.end method

.method protected p(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;
    .locals 8

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/fragment/a;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/fragment/a;-><init>()V

    .line 2
    new-instance v1, Lcom/coremedia/iso/boxes/fragment/b;

    invoke-direct {v1}, Lcom/coremedia/iso/boxes/fragment/b;-><init>()V

    const/4 v2, 0x1

    .line 3
    invoke-virtual {v1, v2}, Lcom/googlecode/mp4parser/c;->setVersion(I)V

    .line 4
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_2

    .line 5
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 6
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/googlecode/mp4parser/authoring/h;

    .line 7
    invoke-virtual {p0, p1, v1}, Lcom/googlecode/mp4parser/authoring/builder/d;->C(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;)Lcom/coremedia/iso/boxes/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    goto :goto_1

    .line 8
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/googlecode/mp4parser/authoring/h;

    .line 9
    invoke-direct {p0, p1, v3}, Lcom/googlecode/mp4parser/authoring/builder/d;->I(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;)J

    move-result-wide v3

    .line 10
    invoke-virtual {v1}, Lcom/coremedia/iso/boxes/fragment/b;->v()J

    move-result-wide v5

    cmp-long v7, v5, v3

    if-gez v7, :cond_0

    .line 11
    invoke-virtual {v1, v3, v4}, Lcom/coremedia/iso/boxes/fragment/b;->w(J)V

    goto :goto_0
.end method

.method protected q(Lcom/googlecode/mp4parser/authoring/d;)Lcom/coremedia/iso/boxes/d;
    .locals 7

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/i0;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/i0;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/c;->setVersion(I)V

    .line 3
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/builder/d;->E()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/i0;->J(Ljava/util/Date;)V

    .line 4
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/builder/d;->E()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/i0;->N(Ljava/util/Date;)V

    const-wide/16 v1, 0x0

    .line 5
    invoke-virtual {v0, v1, v2}, Lcom/coremedia/iso/boxes/i0;->L(J)V

    .line 6
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->e()J

    move-result-wide v3

    .line 7
    invoke-virtual {v0, v3, v4}, Lcom/coremedia/iso/boxes/i0;->V(J)V

    .line 8
    invoke-virtual {p1}, Lcom/googlecode/mp4parser/authoring/d;->g()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/coremedia/iso/boxes/i0;->O(J)V

    return-object v0

    .line 10
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/googlecode/mp4parser/authoring/h;

    .line 11
    invoke-interface {v3}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v4

    invoke-virtual {v4}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v4

    cmp-long v6, v1, v4

    if-gez v6, :cond_0

    invoke-interface {v3}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v1

    goto :goto_0
.end method

.method protected r(JJLcom/googlecode/mp4parser/authoring/tracks/g;ILcom/coremedia/iso/boxes/fragment/k;)V
    .locals 2

    .line 1
    invoke-interface {p5}, Lcom/googlecode/mp4parser/authoring/h;->o()Lcom/coremedia/iso/boxes/s0;

    move-result-object p1

    const-string p2, "enc.[0]/sinf[0]/schm[0]"

    invoke-static {p1, p2}, Lcom/googlecode/mp4parser/util/m;->e(Lcom/googlecode/mp4parser/b;Ljava/lang/String;)Lcom/coremedia/iso/boxes/d;

    move-result-object p1

    check-cast p1, Lcom/coremedia/iso/boxes/x0;

    .line 2
    new-instance p1, Lcom/mp4parser/iso14496/part12/b;

    invoke-direct {p1}, Lcom/mp4parser/iso14496/part12/b;-><init>()V

    .line 3
    invoke-virtual {p7, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    const-string p2, "cenc"

    .line 4
    invoke-virtual {p1, p2}, Lcom/mp4parser/iso14496/part12/b;->y(Ljava/lang/String;)V

    const/4 p2, 0x1

    .line 5
    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/c;->setFlags(I)V

    const-wide/16 p3, 0x8

    .line 6
    invoke-virtual {p7}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object p5

    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result p6

    if-nez p6, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p6

    check-cast p6, Lcom/coremedia/iso/boxes/d;

    .line 7
    instance-of v0, p6, Lcom/googlecode/mp4parser/boxes/dece/d;

    if-eqz v0, :cond_3

    .line 8
    check-cast p6, Lcom/googlecode/mp4parser/boxes/dece/d;

    invoke-virtual {p6}, Lcom/googlecode/mp4parser/boxes/b;->x()I

    move-result p5

    int-to-long p5, p5

    add-long/2addr p3, p5

    .line 9
    :goto_1
    invoke-virtual {p7}, Lcom/googlecode/mp4parser/b;->getParent()Lcom/coremedia/iso/boxes/j;

    move-result-object p5

    check-cast p5, Lcom/coremedia/iso/boxes/fragment/c;

    const-wide/16 v0, 0x10

    add-long/2addr p3, v0

    .line 10
    invoke-virtual {p5}, Lcom/googlecode/mp4parser/d;->t()Ljava/util/List;

    move-result-object p5

    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-nez p5, :cond_1

    goto :goto_3

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lcom/coremedia/iso/boxes/d;

    if-ne p5, p7, :cond_2

    :goto_3
    new-array p2, p2, [J

    const/4 p5, 0x0

    aput-wide p3, p2, p5

    .line 11
    invoke-virtual {p1, p2}, Lcom/mp4parser/iso14496/part12/b;->A([J)V

    return-void

    .line 12
    :cond_2
    invoke-interface {p5}, Lcom/coremedia/iso/boxes/d;->getSize()J

    move-result-wide p5

    add-long/2addr p3, p5

    goto :goto_2

    .line 13
    :cond_3
    invoke-interface {p6}, Lcom/coremedia/iso/boxes/d;->getSize()J

    move-result-wide v0

    add-long/2addr p3, v0

    goto :goto_0
.end method

.method protected s(JJLcom/googlecode/mp4parser/authoring/tracks/g;ILcom/coremedia/iso/boxes/fragment/k;)V
    .locals 5

    .line 1
    invoke-interface {p5}, Lcom/googlecode/mp4parser/authoring/h;->o()Lcom/coremedia/iso/boxes/s0;

    move-result-object p6

    const-string v0, "enc.[0]/sinf[0]/schm[0]"

    .line 2
    invoke-static {p6, v0}, Lcom/googlecode/mp4parser/util/m;->e(Lcom/googlecode/mp4parser/b;Ljava/lang/String;)Lcom/coremedia/iso/boxes/d;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/x0;

    const-string v0, "enc.[0]/sinf[0]/schi[0]/tenc[0]"

    .line 3
    invoke-static {p6, v0}, Lcom/googlecode/mp4parser/util/m;->e(Lcom/googlecode/mp4parser/b;Ljava/lang/String;)Lcom/coremedia/iso/boxes/d;

    move-result-object p6

    check-cast p6, Lcom/mp4parser/iso23001/part7/c;

    .line 4
    new-instance v0, Lcom/mp4parser/iso14496/part12/c;

    invoke-direct {v0}, Lcom/mp4parser/iso14496/part12/c;-><init>()V

    const-string v1, "cenc"

    .line 5
    invoke-virtual {v0, v1}, Lcom/mp4parser/iso14496/part12/c;->B(Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/c;->setFlags(I)V

    .line 7
    invoke-interface {p5}, Lcom/googlecode/mp4parser/authoring/tracks/g;->F()Z

    move-result v1

    if-eqz v1, :cond_1

    sub-long v1, p3, p1

    .line 8
    invoke-static {v1, v2}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result v1

    new-array v2, v1, [S

    .line 9
    invoke-interface {p5}, Lcom/googlecode/mp4parser/authoring/tracks/g;->R()Ljava/util/List;

    move-result-object p5

    const-wide/16 v3, 0x1

    sub-long/2addr p1, v3

    invoke-static {p1, p2}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result p1

    sub-long/2addr p3, v3

    invoke-static {p3, p4}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result p2

    invoke-interface {p5, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p5

    const/4 p1, 0x0

    :goto_0
    if-lt p1, v1, :cond_0

    .line 10
    invoke-virtual {v0, v2}, Lcom/mp4parser/iso14496/part12/c;->F([S)V

    goto :goto_1

    .line 11
    :cond_0
    invoke-interface {p5, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/mp4parser/iso23001/part7/a;

    invoke-virtual {p2}, Lcom/mp4parser/iso23001/part7/a;->b()I

    move-result p2

    int-to-short p2, p2

    aput-short p2, v2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {p6}, Lcom/googlecode/mp4parser/boxes/c;->w()I

    move-result p5

    invoke-virtual {v0, p5}, Lcom/mp4parser/iso14496/part12/c;->D(I)V

    sub-long/2addr p3, p1

    .line 13
    invoke-static {p3, p4}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/mp4parser/iso14496/part12/c;->E(I)V

    .line 14
    :goto_1
    invoke-virtual {p7, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-void
.end method

.method protected t(JJLcom/googlecode/mp4parser/authoring/tracks/g;ILcom/coremedia/iso/boxes/fragment/k;)V
    .locals 2

    .line 1
    new-instance p6, Lcom/googlecode/mp4parser/boxes/dece/d;

    invoke-direct {p6}, Lcom/googlecode/mp4parser/boxes/dece/d;-><init>()V

    .line 2
    invoke-interface {p5}, Lcom/googlecode/mp4parser/authoring/tracks/g;->F()Z

    move-result v0

    invoke-virtual {p6, v0}, Lcom/googlecode/mp4parser/boxes/b;->C(Z)V

    .line 3
    invoke-interface {p5}, Lcom/googlecode/mp4parser/authoring/tracks/g;->R()Ljava/util/List;

    move-result-object p5

    const-wide/16 v0, 0x1

    sub-long/2addr p1, v0

    invoke-static {p1, p2}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result p1

    sub-long/2addr p3, v0

    invoke-static {p3, p4}, Lcom/googlecode/mp4parser/util/c;->a(J)I

    move-result p2

    invoke-interface {p5, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p6, p1}, Lcom/googlecode/mp4parser/boxes/b;->B(Ljava/util/List;)V

    .line 4
    invoke-virtual {p7, p6}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-void
.end method

.method protected u(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;)Lcom/coremedia/iso/boxes/d;
    .locals 0

    .line 1
    new-instance p1, Lcom/coremedia/iso/boxes/u0;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/u0;-><init>()V

    .line 2
    invoke-virtual {p0, p2, p1}, Lcom/googlecode/mp4parser/authoring/builder/d;->v(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V

    .line 3
    new-instance p2, Lcom/coremedia/iso/boxes/d1;

    invoke-direct {p2}, Lcom/coremedia/iso/boxes/d1;-><init>()V

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 4
    new-instance p2, Lcom/coremedia/iso/boxes/v0;

    invoke-direct {p2}, Lcom/coremedia/iso/boxes/v0;-><init>()V

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 5
    new-instance p2, Lcom/coremedia/iso/boxes/t0;

    invoke-direct {p2}, Lcom/coremedia/iso/boxes/t0;-><init>()V

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    .line 6
    new-instance p2, Lcom/coremedia/iso/boxes/z0;

    invoke-direct {p2}, Lcom/coremedia/iso/boxes/z0;-><init>()V

    invoke-virtual {p1, p2}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-object p1
.end method

.method protected v(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/u0;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/h;->o()Lcom/coremedia/iso/boxes/s0;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-void
.end method

.method protected w(JLcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/fragment/k;)V
    .locals 7

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/fragment/j;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/fragment/j;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/c;->setVersion(I)V

    .line 3
    invoke-interface {p3}, Lcom/googlecode/mp4parser/authoring/h;->O()[J

    move-result-object p3

    const-wide/16 v2, 0x0

    :goto_0
    int-to-long v4, v1

    cmp-long v6, v4, p1

    if-ltz v6, :cond_0

    .line 4
    invoke-virtual {v0, v2, v3}, Lcom/coremedia/iso/boxes/fragment/j;->w(J)V

    .line 5
    invoke-virtual {p4, v0}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-void

    :cond_0
    add-int/lit8 v4, v1, -0x1

    .line 6
    aget-wide v4, p3, v4

    add-long/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method protected x(JJLcom/googlecode/mp4parser/authoring/h;ILcom/coremedia/iso/boxes/fragment/k;)V
    .locals 0

    .line 1
    new-instance p1, Lcom/coremedia/iso/boxes/fragment/l;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/fragment/l;-><init>()V

    .line 2
    new-instance p2, Lcom/coremedia/iso/boxes/fragment/g;

    invoke-direct {p2}, Lcom/coremedia/iso/boxes/fragment/g;-><init>()V

    .line 3
    invoke-virtual {p1, p2}, Lcom/coremedia/iso/boxes/fragment/l;->L(Lcom/coremedia/iso/boxes/fragment/g;)V

    const-wide/16 p2, -0x1

    .line 4
    invoke-virtual {p1, p2, p3}, Lcom/coremedia/iso/boxes/fragment/l;->I(J)V

    .line 5
    invoke-interface {p5}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object p2

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lcom/coremedia/iso/boxes/fragment/l;->P(J)V

    const/4 p2, 0x1

    .line 6
    invoke-virtual {p1, p2}, Lcom/coremedia/iso/boxes/fragment/l;->J(Z)V

    .line 7
    invoke-virtual {p7, p1}, Lcom/googlecode/mp4parser/d;->v(Lcom/coremedia/iso/boxes/d;)V

    return-void
.end method

.method protected y(Lcom/googlecode/mp4parser/authoring/h;Lcom/coremedia/iso/boxes/j;)Lcom/coremedia/iso/boxes/d;
    .locals 33

    .line 1
    new-instance v0, Lcom/coremedia/iso/boxes/fragment/m;

    invoke-direct {v0}, Lcom/coremedia/iso/boxes/fragment/m;-><init>()V

    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/googlecode/mp4parser/c;->setVersion(I)V

    .line 3
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    const-string v2, "moov/mvex/trex"

    move-object/from16 v3, p2

    .line 4
    invoke-static {v3, v2}, Lcom/googlecode/mp4parser/util/m;->h(Lcom/coremedia/iso/boxes/j;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 5
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_d

    .line 6
    invoke-interface/range {p2 .. p2}, Lcom/coremedia/iso/boxes/j;->t()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const-wide/16 v2, 0x0

    move-wide v6, v2

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_0

    .line 7
    invoke-virtual {v0, v1}, Lcom/coremedia/iso/boxes/fragment/m;->C(Ljava/util/List;)V

    .line 8
    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/coremedia/iso/boxes/fragment/m;->G(J)V

    return-object v0

    .line 9
    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v15, v8

    check-cast v15, Lcom/coremedia/iso/boxes/d;

    .line 10
    instance-of v8, v15, Lcom/coremedia/iso/boxes/fragment/c;

    if-eqz v8, :cond_c

    .line 11
    move-object v8, v15

    check-cast v8, Lcom/coremedia/iso/boxes/fragment/c;

    const-class v9, Lcom/coremedia/iso/boxes/fragment/k;

    invoke-virtual {v8, v9}, Lcom/googlecode/mp4parser/d;->g(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v13

    const/4 v14, 0x0

    const/4 v11, 0x0

    .line 12
    :goto_2
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v8

    if-lt v11, v8, :cond_1

    goto/16 :goto_b

    .line 13
    :cond_1
    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/coremedia/iso/boxes/fragment/k;

    .line 14
    invoke-virtual {v8}, Lcom/coremedia/iso/boxes/fragment/k;->C()Lcom/coremedia/iso/boxes/fragment/l;

    move-result-object v9

    invoke-virtual {v9}, Lcom/coremedia/iso/boxes/fragment/l;->A()J

    move-result-wide v9

    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v12

    invoke-virtual {v12}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v16

    cmp-long v12, v9, v16

    if-nez v12, :cond_b

    .line 15
    const-class v9, Lcom/coremedia/iso/boxes/fragment/n;

    invoke-virtual {v8, v9}, Lcom/googlecode/mp4parser/d;->g(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v12

    const/4 v9, 0x0

    .line 16
    :goto_3
    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v8

    if-lt v9, v8, :cond_2

    goto/16 :goto_a

    .line 17
    :cond_2
    new-instance v10, Ljava/util/LinkedList;

    invoke-direct {v10}, Ljava/util/LinkedList;-><init>()V

    .line 18
    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v17, v8

    check-cast v17, Lcom/coremedia/iso/boxes/fragment/n;

    move-wide/from16 v18, v6

    const/4 v7, 0x0

    .line 19
    :goto_4
    invoke-virtual/range {v17 .. v17}, Lcom/coremedia/iso/boxes/fragment/n;->w()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lt v7, v6, :cond_4

    .line 20
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v6

    invoke-virtual/range {v17 .. v17}, Lcom/coremedia/iso/boxes/fragment/n;->w()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ne v6, v7, :cond_3

    invoke-virtual/range {v17 .. v17}, Lcom/coremedia/iso/boxes/fragment/n;->w()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_3

    .line 21
    invoke-interface {v10, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/coremedia/iso/boxes/fragment/m$a;

    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 22
    :cond_3
    invoke-interface {v1, v10}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :goto_5
    add-int/lit8 v9, v9, 0x1

    move-wide/from16 v6, v18

    goto :goto_3

    .line 23
    :cond_4
    invoke-virtual/range {v17 .. v17}, Lcom/coremedia/iso/boxes/fragment/n;->w()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v20, v6

    check-cast v20, Lcom/coremedia/iso/boxes/fragment/n$a;

    if-nez v7, :cond_5

    .line 24
    invoke-virtual/range {v17 .. v17}, Lcom/coremedia/iso/boxes/fragment/n;->B()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 25
    invoke-virtual/range {v17 .. v17}, Lcom/coremedia/iso/boxes/fragment/n;->x()Lcom/coremedia/iso/boxes/fragment/g;

    move-result-object v6

    goto :goto_6

    .line 26
    :cond_5
    invoke-virtual/range {v17 .. v17}, Lcom/coremedia/iso/boxes/fragment/n;->E()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 27
    invoke-virtual/range {v20 .. v20}, Lcom/coremedia/iso/boxes/fragment/n$a;->k()Lcom/coremedia/iso/boxes/fragment/g;

    move-result-object v6

    goto :goto_6

    .line 28
    :cond_6
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/fragment/i;->x()Lcom/coremedia/iso/boxes/fragment/g;

    move-result-object v6

    :goto_6
    if-nez v6, :cond_8

    .line 29
    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/h;->getHandler()Ljava/lang/String;

    move-result-object v8

    const-string/jumbo v14, "vide"

    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_7

    .line 30
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Cannot find SampleFlags for video track but it\'s required to build tfra"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_7
    if-eqz v6, :cond_a

    .line 31
    invoke-virtual {v6}, Lcom/coremedia/iso/boxes/fragment/g;->d()I

    move-result v6

    const/4 v8, 0x2

    if-ne v6, v8, :cond_9

    goto :goto_8

    :cond_9
    move-object/from16 v21, v0

    move-object/from16 v22, v1

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move/from16 v27, v7

    move/from16 v28, v9

    move-object v4, v10

    move/from16 v30, v11

    move-object/from16 v31, v12

    move-object v1, v13

    move-object/from16 v25, v15

    const/16 v32, 0x0

    goto :goto_9

    .line 32
    :cond_a
    :goto_8
    new-instance v14, Lcom/coremedia/iso/boxes/fragment/m$a;

    add-int/lit8 v6, v11, 0x1

    move-object/from16 v21, v0

    move-object/from16 v22, v1

    int-to-long v0, v6

    add-int/lit8 v6, v9, 0x1

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    int-to-long v4, v6

    add-int/lit8 v6, v7, 0x1

    move-wide/from16 v25, v4

    int-to-long v4, v6

    move-object v6, v14

    move/from16 v27, v7

    move-wide/from16 v7, v18

    move/from16 v28, v9

    move-object/from16 v29, v10

    move-wide v9, v2

    move/from16 v30, v11

    move-object/from16 v31, v12

    move-wide v11, v0

    move-object v1, v13

    move-object v0, v14

    const/16 v32, 0x0

    move-wide/from16 v13, v25

    move-object/from16 v25, v15

    move-wide v15, v4

    .line 33
    invoke-direct/range {v6 .. v16}, Lcom/coremedia/iso/boxes/fragment/m$a;-><init>(JJJJJ)V

    move-object/from16 v4, v29

    .line 34
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    :goto_9
    invoke-virtual/range {v20 .. v20}, Lcom/coremedia/iso/boxes/fragment/n$a;->j()J

    move-result-wide v5

    add-long v18, v18, v5

    add-int/lit8 v7, v27, 0x1

    move-object v13, v1

    move-object v10, v4

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    move-object/from16 v4, v23

    move-object/from16 v5, v24

    move-object/from16 v15, v25

    move/from16 v9, v28

    move/from16 v11, v30

    move-object/from16 v12, v31

    const/4 v14, 0x0

    goto/16 :goto_4

    :cond_b
    :goto_a
    move-object/from16 v21, v0

    move-object/from16 v22, v1

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move/from16 v30, v11

    move-object v1, v13

    move-object/from16 v25, v15

    const/16 v32, 0x0

    add-int/lit8 v11, v30, 0x1

    move-object v13, v1

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    move-object/from16 v4, v23

    move-object/from16 v5, v24

    move-object/from16 v15, v25

    const/4 v14, 0x0

    goto/16 :goto_2

    :cond_c
    :goto_b
    move-object/from16 v21, v0

    move-object/from16 v22, v1

    move-object/from16 v23, v4

    move-object/from16 v24, v5

    move-object/from16 v25, v15

    .line 36
    invoke-interface/range {v25 .. v25}, Lcom/coremedia/iso/boxes/d;->getSize()J

    move-result-wide v0

    add-long/2addr v2, v0

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    move-object/from16 v4, v23

    move-object/from16 v5, v24

    goto/16 :goto_1

    :cond_d
    move-object/from16 v21, v0

    move-object/from16 v22, v1

    move-object/from16 v23, v4

    .line 37
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/coremedia/iso/boxes/fragment/i;

    .line 38
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/fragment/i;->A()J

    move-result-wide v0

    invoke-interface/range {p1 .. p1}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v5

    invoke-virtual {v5}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v5

    cmp-long v7, v0, v5

    move-object/from16 v0, v21

    move-object/from16 v1, v22

    if-nez v7, :cond_e

    goto/16 :goto_0

    :cond_e
    move-object/from16 v4, v23

    goto/16 :goto_0
.end method

.method protected z(Lcom/googlecode/mp4parser/authoring/d;Lcom/googlecode/mp4parser/authoring/h;)Lcom/coremedia/iso/boxes/d;
    .locals 2

    .line 1
    new-instance p1, Lcom/coremedia/iso/boxes/g1;

    invoke-direct {p1}, Lcom/coremedia/iso/boxes/g1;-><init>()V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/c;->setVersion(I)V

    const/4 v0, 0x7

    .line 3
    invoke-virtual {p1, v0}, Lcom/googlecode/mp4parser/c;->setFlags(I)V

    .line 4
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/i;->b()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/g1;->J(I)V

    .line 5
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/i;->a()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/g1;->K(Ljava/util/Date;)V

    const-wide/16 v0, 0x0

    .line 6
    invoke-virtual {p1, v0, v1}, Lcom/coremedia/iso/boxes/g1;->L(J)V

    .line 7
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/i;->c()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/coremedia/iso/boxes/g1;->N(D)V

    .line 8
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/i;->k()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/coremedia/iso/boxes/g1;->W(D)V

    .line 9
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/i;->e()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/g1;->R(I)V

    .line 10
    invoke-virtual {p0}, Lcom/googlecode/mp4parser/authoring/builder/d;->E()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/coremedia/iso/boxes/g1;->T(Ljava/util/Date;)V

    .line 11
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/i;->i()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/coremedia/iso/boxes/g1;->U(J)V

    .line 12
    invoke-interface {p2}, Lcom/googlecode/mp4parser/authoring/h;->M()Lcom/googlecode/mp4parser/authoring/i;

    move-result-object p2

    invoke-virtual {p2}, Lcom/googlecode/mp4parser/authoring/i;->j()F

    move-result p2

    invoke-virtual {p1, p2}, Lcom/coremedia/iso/boxes/g1;->V(F)V

    return-object p1
.end method
