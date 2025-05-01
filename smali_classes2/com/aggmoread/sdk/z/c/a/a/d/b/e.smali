.class public Lcom/aggmoread/sdk/z/c/a/a/d/b/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;
    }
.end annotation


# instance fields
.field public a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

.field public b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

.field public c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

.field public d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

.field public e:I

.field public f:I

.field public g:I

.field private h:Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

.field private i:Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

.field public j:Z

.field public k:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->g:I

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->j:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->k:Z

    return-void
.end method

.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/d;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->g:I

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->j:Z

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->k:Z

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/e/f;

    invoke-direct {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;-><init>(Ljava/util/Map;)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->g:I

    return-void
.end method

.method public static i()V
    .locals 26

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/16 v2, 0x9

    new-array v3, v2, [Ljava/lang/Object;

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->g:Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->f:Ljava/lang/Object;

    const/4 v6, 0x1

    aput-object v4, v3, v6

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->d:Ljava/lang/Object;

    const/4 v7, 0x2

    aput-object v4, v3, v7

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->e:Ljava/lang/Object;

    aput-object v4, v3, v0

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->c:Ljava/lang/Object;

    const/4 v8, 0x4

    aput-object v4, v3, v8

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->b:Ljava/lang/Object;

    const/4 v9, 0x5

    aput-object v4, v3, v9

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->a:Ljava/lang/Object;

    const/4 v10, 0x6

    aput-object v4, v3, v10

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->h:Ljava/lang/Object;

    const/4 v11, 0x7

    aput-object v4, v3, v11

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->i:Ljava/lang/Object;

    const/16 v12, 0x8

    aput-object v4, v3, v12

    aput-object v3, v1, v5

    const/16 v3, 0x17

    new-array v4, v3, [Ljava/lang/Object;

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->K:Ljava/lang/Object;

    aput-object v13, v4, v5

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->Y:Ljava/lang/Object;

    aput-object v13, v4, v6

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->X:Ljava/lang/Object;

    aput-object v13, v4, v7

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->W:Ljava/lang/Object;

    aput-object v13, v4, v0

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->L:Ljava/lang/Object;

    aput-object v13, v4, v8

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->M:Ljava/lang/Object;

    aput-object v13, v4, v9

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->N:Ljava/lang/Object;

    aput-object v13, v4, v10

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->R:Ljava/lang/Object;

    aput-object v13, v4, v11

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->O:Ljava/lang/Object;

    aput-object v13, v4, v12

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->V:Ljava/lang/Object;

    aput-object v13, v4, v2

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->P:Ljava/lang/Object;

    const/16 v14, 0xa

    aput-object v13, v4, v14

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->Q:Ljava/lang/Object;

    const/16 v15, 0xb

    aput-object v13, v4, v15

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->S:Ljava/lang/Object;

    const/16 v16, 0xc

    aput-object v13, v4, v16

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    const/16 v17, 0xd

    aput-object v13, v4, v17

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->U:Ljava/lang/Object;

    const/16 v18, 0xe

    aput-object v13, v4, v18

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->Z:Ljava/lang/Object;

    const/16 v19, 0xf

    aput-object v13, v4, v19

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->a0:Ljava/lang/Object;

    const/16 v20, 0x10

    aput-object v13, v4, v20

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->b0:Ljava/lang/Object;

    const/16 v21, 0x11

    aput-object v13, v4, v21

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->c0:Ljava/lang/Object;

    const/16 v22, 0x12

    aput-object v13, v4, v22

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->d0:Ljava/lang/Object;

    const/16 v23, 0x13

    aput-object v13, v4, v23

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->e0:Ljava/lang/Object;

    const/16 v24, 0x14

    aput-object v13, v4, v24

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->f0:Ljava/lang/Object;

    const/16 v25, 0x15

    aput-object v13, v4, v25

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->g0:Ljava/lang/Object;

    const/16 v25, 0x16

    aput-object v13, v4, v25

    aput-object v4, v1, v6

    const/16 v4, 0x1b

    new-array v4, v4, [Ljava/lang/Object;

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->u:Ljava/lang/Object;

    aput-object v13, v4, v5

    sget-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->B:Ljava/lang/Object;

    aput-object v5, v4, v6

    sget-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->t:Ljava/lang/Object;

    aput-object v5, v4, v7

    sget-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->D:Ljava/lang/Object;

    aput-object v5, v4, v0

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->p:Ljava/lang/Object;

    aput-object v0, v4, v8

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->n:Ljava/lang/Object;

    aput-object v0, v4, v9

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->o:Ljava/lang/Object;

    aput-object v0, v4, v10

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->E:Ljava/lang/Object;

    aput-object v0, v4, v11

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->r:Ljava/lang/Object;

    aput-object v0, v4, v12

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->q:Ljava/lang/Object;

    aput-object v0, v4, v2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->j:Ljava/lang/Object;

    aput-object v0, v4, v14

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->y:Ljava/lang/Object;

    aput-object v0, v4, v15

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->w:Ljava/lang/Object;

    aput-object v0, v4, v16

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->k:Ljava/lang/Object;

    aput-object v0, v4, v17

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->x:Ljava/lang/Object;

    aput-object v0, v4, v18

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->F:Ljava/lang/Object;

    aput-object v0, v4, v19

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->l:Ljava/lang/Object;

    aput-object v0, v4, v20

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->m:Ljava/lang/Object;

    aput-object v0, v4, v21

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->A:Ljava/lang/Object;

    aput-object v0, v4, v22

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->v:Ljava/lang/Object;

    aput-object v0, v4, v23

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->C:Ljava/lang/Object;

    aput-object v0, v4, v24

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->s:Ljava/lang/Object;

    const/16 v2, 0x15

    aput-object v0, v4, v2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->z:Ljava/lang/Object;

    const/16 v2, 0x16

    aput-object v0, v4, v2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->G:Ljava/lang/Object;

    aput-object v0, v4, v3

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->H:Ljava/lang/Object;

    const/16 v2, 0x18

    aput-object v0, v4, v2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->I:Ljava/lang/Object;

    const/16 v2, 0x19

    aput-object v0, v4, v2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->J:Ljava/lang/Object;

    const/16 v2, 0x1a

    aput-object v0, v4, v2

    aput-object v4, v1, v7

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/b;->b([Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V
    .locals 1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->i:Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/f;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->j:Z

    const-string p1, "Request"

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/f;->b(Ljava/lang/String;)Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h:Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

    const-string p1, "Error"

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/f;->b(Ljava/lang/String;)Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->i:Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

    const-string p1, "AMHTTAG"

    const-string v0, "startBatchCollection"

    invoke-static {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public a()Z
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->i:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public b(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V
    .locals 1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h:Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/f;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V

    :cond_0
    return-void
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->z:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->F:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->d()I

    move-result v1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public c()Lcom/aggmoread/sdk/z/c/a/a/d/b/i;
    .locals 5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a:Ljava/util/Map;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->w:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->x:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge v2, v1, :cond_2

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/e/f;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-direct {v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;-><init>(Ljava/util/Map;)V

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    const-string v4, ""

    invoke-virtual {v1, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v4, v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->x:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iput-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iput v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/e/f;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-direct {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;-><init>(Ljava/util/Map;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->V:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result v0

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget v3, v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->v:I

    if-le v0, v3, :cond_2

    iput-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iput v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    :cond_2
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a:Ljava/util/Map;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object v2, v2, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;-><init>(Ljava/util/Map;)V

    goto :goto_1

    :cond_3
    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;-><init>(Ljava/util/Map;)V

    :goto_1
    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    if-nez v0, :cond_4

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const v1, 0x3baa1be1

    const-string v2, "\u5e7f\u544a\u65e0\u586b\u5145"

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    return-object v0

    :cond_4
    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$b;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    return-object v0
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->h:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public e()Z
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->x:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result v0

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-static {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->a(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->r:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    const-string v0, "deg "

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;)V

    return v2

    :cond_0
    if-nez v0, :cond_1

    return v2

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/m;->c(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "proxy break!"

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;)V

    return v2

    :cond_2
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->n:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_3

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->F:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->d()I

    move-result v1

    if-gt v0, v1, :cond_3

    return v2

    :cond_3
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->o:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_4

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->G:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->d()I

    move-result v1

    if-le v0, v1, :cond_5

    :cond_4
    const/4 v2, 0x1

    :cond_5
    return v2
.end method

.method public f()I
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->Y:Ljava/lang/Object;

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;I)I

    move-result v0

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->j:Z

    return v0
.end method

.method public j()V
    .locals 2

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->j:Z

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h:Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/f;->b()V

    iput-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h:Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->i:Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/f;->b()V

    iput-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->i:Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

    :cond_1
    const-string v0, "AMHTTAG"

    const-string v1, "stopBatchCollection"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public k()V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tryEnd "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->k:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AMHTTAG"

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->k:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->k:Z

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h:Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/f;->c()V

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->i:Lcom/aggmoread/sdk/z/c/a/a/d/b/f;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/f;->c()V

    :cond_1
    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->j()V

    :cond_2
    return-void
.end method

.method public l()Z
    .locals 6

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->w:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->x:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->k()V

    return v1

    :cond_0
    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->g:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->g:I

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->A:Ljava/lang/Object;

    invoke-virtual {v0, v3, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;I)I

    move-result v0

    if-ge v0, v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    iget v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->g:I

    rem-int/2addr v3, v0

    if-nez v3, :cond_2

    iget v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    add-int/2addr v4, v2

    iput v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "r = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", v1 = "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ",v2 = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->g:I

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", v3 = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a:Ljava/util/Map;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->a:Ljava/lang/Object;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_3

    iget v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_3

    const-string v3, "next "

    invoke-static {v3}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;)V

    new-instance v3, Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f:I

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-direct {v3, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;-><init>(Ljava/util/Map;)V

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->V:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result v0

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget v4, v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->v:I

    if-le v0, v4, :cond_3

    iput-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->y:Ljava/lang/Object;

    invoke-virtual {v0, v3, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;I)I

    move-result v0

    int-to-long v0, v0

    new-instance v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$a;

    invoke-direct {v3, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-static {v3, v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;J)V

    return v2

    :cond_3
    const-string v0, "next end!"

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->k()V

    return v1
.end method
