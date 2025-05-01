.class public Le1/a;
.super Ljava/lang/Object;
.source "MovieCreator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/googlecode/mp4parser/e;)Lcom/googlecode/mp4parser/authoring/d;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/coremedia/iso/f;

    invoke-direct {v0, p0}, Lcom/coremedia/iso/f;-><init>(Lcom/googlecode/mp4parser/e;)V

    .line 2
    new-instance v1, Lcom/googlecode/mp4parser/authoring/d;

    invoke-direct {v1}, Lcom/googlecode/mp4parser/authoring/d;-><init>()V

    .line 3
    invoke-virtual {v0}, Lcom/coremedia/iso/f;->D()Lcom/coremedia/iso/boxes/h0;

    move-result-object v2

    const-class v3, Lcom/coremedia/iso/boxes/f1;

    invoke-virtual {v2, v3}, Lcom/googlecode/mp4parser/d;->g(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 4
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/coremedia/iso/f;->D()Lcom/coremedia/iso/boxes/h0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/h0;->C()Lcom/coremedia/iso/boxes/i0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/i0;->y()Lcom/googlecode/mp4parser/util/l;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/googlecode/mp4parser/authoring/d;->h(Lcom/googlecode/mp4parser/util/l;)V

    return-object v1

    .line 6
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/coremedia/iso/boxes/f1;

    const-string v4, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]"

    .line 7
    invoke-static {v3, v4}, Lcom/googlecode/mp4parser/util/m;->e(Lcom/googlecode/mp4parser/b;Ljava/lang/String;)Lcom/coremedia/iso/boxes/d;

    move-result-object v4

    check-cast v4, Lcom/coremedia/iso/boxes/x0;

    const/4 v5, 0x0

    const-string v6, "]"

    const-string v7, "["

    if-eqz v4, :cond_2

    .line 8
    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/x0;->v()Ljava/lang/String;

    move-result-object v8

    const-string v9, "cenc"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v4}, Lcom/coremedia/iso/boxes/x0;->v()Ljava/lang/String;

    move-result-object v4

    const-string v8, "cbc1"

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 9
    :cond_1
    new-instance v4, Lcom/googlecode/mp4parser/authoring/b;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/f1;->E()Lcom/coremedia/iso/boxes/g1;

    move-result-object v7

    invoke-virtual {v7}, Lcom/coremedia/iso/boxes/g1;->C()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v5, v5, [Lcom/coremedia/iso/f;

    invoke-direct {v4, v6, v3, v5}, Lcom/googlecode/mp4parser/authoring/b;-><init>(Ljava/lang/String;Lcom/coremedia/iso/boxes/f1;[Lcom/coremedia/iso/f;)V

    invoke-virtual {v1, v4}, Lcom/googlecode/mp4parser/authoring/d;->a(Lcom/googlecode/mp4parser/authoring/h;)V

    goto :goto_0

    .line 10
    :cond_2
    new-instance v4, Lcom/googlecode/mp4parser/authoring/e;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/coremedia/iso/boxes/f1;->E()Lcom/coremedia/iso/boxes/g1;

    move-result-object v7

    invoke-virtual {v7}, Lcom/coremedia/iso/boxes/g1;->C()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v5, v5, [Lcom/coremedia/iso/f;

    invoke-direct {v4, v6, v3, v5}, Lcom/googlecode/mp4parser/authoring/e;-><init>(Ljava/lang/String;Lcom/coremedia/iso/boxes/f1;[Lcom/coremedia/iso/f;)V

    invoke-virtual {v1, v4}, Lcom/googlecode/mp4parser/authoring/d;->a(Lcom/googlecode/mp4parser/authoring/h;)V

    goto/16 :goto_0
.end method

.method public static b(Ljava/lang/String;)Lcom/googlecode/mp4parser/authoring/d;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/googlecode/mp4parser/g;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/googlecode/mp4parser/g;-><init>(Ljava/io/File;)V

    invoke-static {v0}, Le1/a;->a(Lcom/googlecode/mp4parser/e;)Lcom/googlecode/mp4parser/authoring/d;

    move-result-object p0

    return-object p0
.end method
