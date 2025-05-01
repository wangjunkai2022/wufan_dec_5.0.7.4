.class Lcom/googlecode/mp4parser/authoring/b$a;
.super Ljava/lang/Object;
.source "CencMp4TrackImplImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/authoring/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# static fields
.field static final synthetic e:Z


# instance fields
.field private a:Lcom/coremedia/iso/boxes/j;

.field private b:Lcom/mp4parser/iso14496/part12/c;

.field private c:Lcom/mp4parser/iso14496/part12/b;

.field final synthetic d:Lcom/googlecode/mp4parser/authoring/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/googlecode/mp4parser/authoring/b;

    return-void
.end method

.method public constructor <init>(Lcom/googlecode/mp4parser/authoring/b;Lcom/coremedia/iso/boxes/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/b$a;->d:Lcom/googlecode/mp4parser/authoring/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/googlecode/mp4parser/authoring/b$a;->a:Lcom/coremedia/iso/boxes/j;

    return-void
.end method

.method static synthetic a(Lcom/googlecode/mp4parser/authoring/b$a;)Lcom/mp4parser/iso14496/part12/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/googlecode/mp4parser/authoring/b$a;->c:Lcom/mp4parser/iso14496/part12/b;

    return-object p0
.end method

.method static synthetic b(Lcom/googlecode/mp4parser/authoring/b$a;)Lcom/mp4parser/iso14496/part12/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/googlecode/mp4parser/authoring/b$a;->b:Lcom/mp4parser/iso14496/part12/c;

    return-object p0
.end method


# virtual methods
.method public c()Lcom/mp4parser/iso14496/part12/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/b$a;->c:Lcom/mp4parser/iso14496/part12/b;

    return-object v0
.end method

.method public d()Lcom/mp4parser/iso14496/part12/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/b$a;->b:Lcom/mp4parser/iso14496/part12/c;

    return-object v0
.end method

.method public e()Lcom/googlecode/mp4parser/authoring/b$a;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/googlecode/mp4parser/authoring/b$a;->a:Lcom/coremedia/iso/boxes/j;

    const-class v1, Lcom/mp4parser/iso14496/part12/c;

    invoke-interface {v0, v1}, Lcom/coremedia/iso/boxes/j;->g(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/googlecode/mp4parser/authoring/b$a;->a:Lcom/coremedia/iso/boxes/j;

    const-class v2, Lcom/mp4parser/iso14496/part12/b;

    invoke-interface {v1, v2}, Lcom/coremedia/iso/boxes/j;->g(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    .line 3
    iput-object v2, p0, Lcom/googlecode/mp4parser/authoring/b$a;->b:Lcom/mp4parser/iso14496/part12/c;

    .line 4
    iput-object v2, p0, Lcom/googlecode/mp4parser/authoring/b$a;->c:Lcom/mp4parser/iso14496/part12/b;

    const/4 v2, 0x0

    .line 5
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lt v2, v3, :cond_0

    return-object p0

    .line 6
    :cond_0
    iget-object v3, p0, Lcom/googlecode/mp4parser/authoring/b$a;->b:Lcom/mp4parser/iso14496/part12/c;

    const-string v4, "cenc"

    if-nez v3, :cond_1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mp4parser/iso14496/part12/c;

    invoke-virtual {v3}, Lcom/mp4parser/iso14496/part12/c;->v()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mp4parser/iso14496/part12/c;

    invoke-virtual {v3}, Lcom/mp4parser/iso14496/part12/c;->v()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 7
    :cond_2
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mp4parser/iso14496/part12/c;

    iput-object v3, p0, Lcom/googlecode/mp4parser/authoring/b$a;->b:Lcom/mp4parser/iso14496/part12/c;

    goto :goto_1

    .line 8
    :cond_3
    iget-object v3, p0, Lcom/googlecode/mp4parser/authoring/b$a;->b:Lcom/mp4parser/iso14496/part12/c;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/mp4parser/iso14496/part12/c;->v()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_8

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mp4parser/iso14496/part12/c;

    invoke-virtual {v3}, Lcom/mp4parser/iso14496/part12/c;->v()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 9
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mp4parser/iso14496/part12/c;

    iput-object v3, p0, Lcom/googlecode/mp4parser/authoring/b$a;->b:Lcom/mp4parser/iso14496/part12/c;

    .line 10
    :goto_1
    iget-object v3, p0, Lcom/googlecode/mp4parser/authoring/b$a;->c:Lcom/mp4parser/iso14496/part12/b;

    if-nez v3, :cond_4

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mp4parser/iso14496/part12/b;

    invoke-virtual {v3}, Lcom/mp4parser/iso14496/part12/b;->v()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    :cond_4
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mp4parser/iso14496/part12/b;

    invoke-virtual {v3}, Lcom/mp4parser/iso14496/part12/b;->v()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 11
    :cond_5
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mp4parser/iso14496/part12/b;

    iput-object v3, p0, Lcom/googlecode/mp4parser/authoring/b$a;->c:Lcom/mp4parser/iso14496/part12/b;

    goto :goto_2

    .line 12
    :cond_6
    iget-object v3, p0, Lcom/googlecode/mp4parser/authoring/b$a;->c:Lcom/mp4parser/iso14496/part12/b;

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lcom/mp4parser/iso14496/part12/b;->v()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_7

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mp4parser/iso14496/part12/b;

    invoke-virtual {v3}, Lcom/mp4parser/iso14496/part12/b;->v()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 13
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mp4parser/iso14496/part12/b;

    iput-object v3, p0, Lcom/googlecode/mp4parser/authoring/b$a;->c:Lcom/mp4parser/iso14496/part12/b;

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 14
    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Are there two cenc labeled saio?"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 15
    :cond_8
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Are there two cenc labeled saiz?"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw v0

    :goto_4
    goto :goto_3
.end method
