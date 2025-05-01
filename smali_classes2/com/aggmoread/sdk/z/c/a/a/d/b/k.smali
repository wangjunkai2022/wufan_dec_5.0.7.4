.class public Lcom/aggmoread/sdk/z/c/a/a/d/b/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;
    }
.end annotation


# instance fields
.field public a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

.field public b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

.field public c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    return-void
.end method

.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/f;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    if-eqz p1, :cond_1

    iget-object v1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->c:Ljava/lang/String;

    if-eqz v1, :cond_1

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->b:Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->e:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/i;->a()I

    move-result v0

    iget-object v1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->e:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/c/i;->i:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    if-ne v1, v2, :cond_0

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/c/i;->g:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/i;->a()I

    move-result v0

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->h:Ljava/lang/Object;

    invoke-virtual {v1, v2, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->c:Ljava/lang/Object;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->i:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    if-eqz p2, :cond_2

    iget-object p1, p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->A:Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->f()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->g:Ljava/lang/Object;

    iget-object p2, p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    invoke-virtual {p2, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static a()V
    .locals 3

    const/16 v0, 0x34

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->a:Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->b:Ljava/lang/Object;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->c:Ljava/lang/Object;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->d:Ljava/lang/Object;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->e:Ljava/lang/Object;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->f:Ljava/lang/Object;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->g:Ljava/lang/Object;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->h:Ljava/lang/Object;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->i:Ljava/lang/Object;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->j:Ljava/lang/Object;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->k:Ljava/lang/Object;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->l:Ljava/lang/Object;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->m:Ljava/lang/Object;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->n:Ljava/lang/Object;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->o:Ljava/lang/Object;

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->p:Ljava/lang/Object;

    const/16 v2, 0xf

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->q:Ljava/lang/Object;

    const/16 v2, 0x10

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->r:Ljava/lang/Object;

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->s:Ljava/lang/Object;

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->t:Ljava/lang/Object;

    const/16 v2, 0x13

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->u:Ljava/lang/Object;

    const/16 v2, 0x14

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->v:Ljava/lang/Object;

    const/16 v2, 0x15

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->w:Ljava/lang/Object;

    const/16 v2, 0x16

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->x:Ljava/lang/Object;

    const/16 v2, 0x17

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->y:Ljava/lang/Object;

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->z:Ljava/lang/Object;

    const/16 v2, 0x19

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->A:Ljava/lang/Object;

    const/16 v2, 0x1a

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->B:Ljava/lang/Object;

    const/16 v2, 0x1b

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->C:Ljava/lang/Object;

    const/16 v2, 0x1c

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->D:Ljava/lang/Object;

    const/16 v2, 0x1d

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->E:Ljava/lang/Object;

    const/16 v2, 0x1e

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->F:Ljava/lang/Object;

    const/16 v2, 0x1f

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->G:Ljava/lang/Object;

    const/16 v2, 0x20

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->H:Ljava/lang/Object;

    const/16 v2, 0x21

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->I:Ljava/lang/Object;

    const/16 v2, 0x22

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->J:Ljava/lang/Object;

    const/16 v2, 0x23

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->K:Ljava/lang/Object;

    const/16 v2, 0x24

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->L:Ljava/lang/Object;

    const/16 v2, 0x25

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->M:Ljava/lang/Object;

    const/16 v2, 0x26

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->N:Ljava/lang/Object;

    const/16 v2, 0x27

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->O:Ljava/lang/Object;

    const/16 v2, 0x28

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->P:Ljava/lang/Object;

    const/16 v2, 0x29

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->Q:Ljava/lang/Object;

    const/16 v2, 0x2a

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->R:Ljava/lang/Object;

    const/16 v2, 0x2b

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->S:Ljava/lang/Object;

    const/16 v2, 0x2c

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->T:Ljava/lang/Object;

    const/16 v2, 0x2d

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->U:Ljava/lang/Object;

    const/16 v2, 0x2e

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->V:Ljava/lang/Object;

    const/16 v2, 0x2f

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->W:Ljava/lang/Object;

    const/16 v2, 0x30

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->X:Ljava/lang/Object;

    const/16 v2, 0x31

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->Y:Ljava/lang/Object;

    const/16 v2, 0x32

    aput-object v1, v0, v2

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->Z:Ljava/lang/Object;

    const/16 v2, 0x33

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/b;->f([Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(I)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;
    .locals 2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    return-object p0
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->f:Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;->a()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->F:Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;
    .locals 3

    instance-of v0, p2, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_0
    instance-of v0, p2, Ljava/lang/Long;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;J)V

    goto :goto_1

    :cond_1
    instance-of v0, p2, Ljava/lang/Double;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    :goto_0
    invoke-virtual {v0, p1, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;D)V

    goto :goto_1

    :cond_2
    instance-of v0, p2, Ljava/lang/Float;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    float-to-double v1, p2

    goto :goto_0

    :cond_3
    instance-of v0, p2, Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Z)V

    goto :goto_1

    :cond_4
    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    :goto_1
    return-object p0
.end method

.method public a(Ljava/util/Map;)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/aggmoread/sdk/z/c/a/a/d/b/k;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 3

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a:Ljava/util/Map;

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/b;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "Content-type"

    const-string v2, "application/json"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    :try_start_0
    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->b()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->f()Ljava/lang/String;

    move-result-object p2

    :goto_0
    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$a;

    invoke-direct {v1, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V

    invoke-static {p2, p1, v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/d;->a(Ljava/lang/String;[BLjava/util/Map;Lcom/aggmoread/sdk/z/c/a/a/e/d$c;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->a:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_4

    const/4 p2, 0x3

    if-eq p1, p2, :cond_3

    const/4 p2, 0x6

    if-eq p1, p2, :cond_2

    const/16 p2, 0x9

    if-eq p1, p2, :cond_3

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->D:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->a()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->E:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->B:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->a()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->C:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    :goto_1
    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->a()V

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->F:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->a()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->G:Lcom/aggmoread/sdk/z/c/a/a/e/o;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/o;->a()V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->s:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result p1

    if-lez p1, :cond_5

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->e()V

    :cond_5
    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    if-eqz p1, :cond_6

    iget-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object p2, p2, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->e()Z

    move-result p1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b()Z

    move-result v0

    invoke-static {p2, p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->b(Ljava/lang/Object;ZZ)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_6
    :goto_2
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;J[Ljava/lang/Object;)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(I)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    const/16 v4, 0x9

    aget-object v5, p5, v4

    check-cast v5, [I

    const/4 v6, 0x5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v2, :cond_2

    invoke-virtual/range {p2 .. p2}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v3

    invoke-virtual/range {p2 .. p2}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v10

    if-gtz v3, :cond_0

    const/4 v11, 0x0

    goto :goto_0

    :cond_0
    iget v11, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->a:F

    int-to-float v3, v3

    div-float/2addr v11, v3

    :goto_0
    if-gtz v10, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    iget v3, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->b:F

    invoke-virtual/range {p2 .. p2}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v10

    int-to-float v10, v10

    div-float/2addr v3, v10

    :goto_1
    iget-object v10, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v12, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->t:Ljava/lang/Object;

    float-to-double v13, v11

    invoke-virtual {v10, v12, v13, v14}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;D)V

    iget-object v10, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v12, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->u:Ljava/lang/Object;

    float-to-double v13, v3

    invoke-virtual {v10, v12, v13, v14}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;D)V

    iget-object v10, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v12, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->J:Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v13

    invoke-virtual {v10, v12, v13}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v10, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v12, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->K:Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v13

    invoke-virtual {v10, v12, v13}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v10, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v12, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->W:Ljava/lang/Object;

    iget v13, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->a:F

    float-to-int v13, v13

    invoke-virtual {v10, v12, v13}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v10, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v12, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->X:Ljava/lang/Object;

    iget v2, v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/m/a;->b:F

    float-to-int v2, v2

    invoke-virtual {v10, v12, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    goto/16 :goto_3

    :cond_2
    aget-object v2, p5, v6

    check-cast v2, [F

    const-string v10, "xxx"

    const/high16 v11, -0x40800000    # -1.0f

    if-eqz v2, :cond_3

    iget-object v11, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v12, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->t:Ljava/lang/Object;

    aget v13, v2, v8

    float-to-double v13, v13

    invoke-virtual {v11, v12, v13, v14}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;D)V

    iget-object v11, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v12, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->u:Ljava/lang/Object;

    aget v13, v2, v9

    float-to-double v13, v13

    invoke-virtual {v11, v12, v13, v14}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;D)V

    aget v11, v2, v8

    aget v2, v2, v9

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "screen strategy dx = "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v13, ", dy = "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v10, v12}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    move v15, v11

    move v11, v2

    move v2, v15

    goto :goto_2

    :cond_3
    const-string v2, "\u672a\u53d6\u5230\u70b9\u51fb\u5750\u6807"

    invoke-static {v10, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 v2, -0x40800000    # -1.0f

    :goto_2
    if-eqz v5, :cond_4

    iget-object v10, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v12, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->J:Ljava/lang/Object;

    aget v3, v5, v3

    invoke-virtual {v10, v12, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v3, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v10, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->K:Ljava/lang/Object;

    const/4 v12, 0x3

    aget v12, v5, v12

    invoke-virtual {v3, v10, v12}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v3, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v10, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->W:Ljava/lang/Object;

    const/16 v12, 0xe

    aget v12, v5, v12

    invoke-virtual {v3, v10, v12}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v3, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v10, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->X:Ljava/lang/Object;

    const/16 v12, 0xf

    aget v12, v5, v12

    invoke-virtual {v3, v10, v12}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    :cond_4
    move v3, v11

    move v11, v2

    :goto_3
    const/4 v2, 0x4

    const/16 v10, 0x8

    if-eqz v5, :cond_5

    iget-object v12, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->H:Ljava/lang/Object;

    aget v14, v5, v8

    invoke-virtual {v12, v13, v14}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v12, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->I:Ljava/lang/Object;

    aget v14, v5, v9

    invoke-virtual {v12, v13, v14}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v12, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->L:Ljava/lang/Object;

    aget v14, v5, v2

    invoke-virtual {v12, v13, v14}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v12, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v13, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->M:Ljava/lang/Object;

    aget v6, v5, v6

    invoke-virtual {v12, v13, v6}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v6, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v12, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->P:Ljava/lang/Object;

    aget v13, v5, v10

    invoke-virtual {v6, v12, v13}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v6, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v12, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->Q:Ljava/lang/Object;

    aget v4, v5, v4

    invoke-virtual {v6, v12, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v4, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v6, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->N:Ljava/lang/Object;

    const/4 v12, 0x6

    aget v12, v5, v12

    invoke-virtual {v4, v6, v12}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v4, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v6, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->O:Ljava/lang/Object;

    const/4 v12, 0x7

    aget v12, v5, v12

    invoke-virtual {v4, v6, v12}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v4, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v6, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->Y:Ljava/lang/Object;

    const/16 v12, 0x10

    aget v12, v5, v12

    invoke-virtual {v4, v6, v12}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v4, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v6, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->Z:Ljava/lang/Object;

    const/16 v12, 0x11

    aget v12, v5, v12

    invoke-virtual {v4, v6, v12}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v4, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v6, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->S:Ljava/lang/Object;

    const/16 v12, 0xa

    aget v12, v5, v12

    invoke-virtual {v4, v6, v12}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v4, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v6, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->T:Ljava/lang/Object;

    const/16 v12, 0xb

    aget v12, v5, v12

    invoke-virtual {v4, v6, v12}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v4, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v6, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->U:Ljava/lang/Object;

    const/16 v12, 0xc

    aget v12, v5, v12

    invoke-virtual {v4, v6, v12}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v4, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v6, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->V:Ljava/lang/Object;

    const/16 v12, 0xd

    aget v5, v5, v12

    invoke-virtual {v4, v6, v5}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    :cond_5
    aget-object v4, p5, v10

    check-cast v4, Ljava/lang/Boolean;

    iget-object v5, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v6, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->R:Ljava/lang/Object;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v4, 0x1

    goto :goto_4

    :cond_6
    const/4 v4, 0x0

    :goto_4
    invoke-virtual {v5, v6, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Z)V

    aget-object v2, p5, v2

    check-cast v2, Ljava/lang/Integer;

    if-nez v2, :cond_7

    const/4 v2, 0x0

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_5
    iget-object v4, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->s:Ljava/lang/Object;

    invoke-virtual {v4, v5, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    if-lez v2, :cond_e

    aget-object v2, p5, v9

    check-cast v2, [F

    if-eqz v2, :cond_8

    iget-object v3, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->v:Ljava/lang/Object;

    aget v5, v2, v8

    float-to-double v5, v5

    invoke-virtual {v3, v4, v5, v6}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;D)V

    iget-object v3, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->w:Ljava/lang/Object;

    aget v2, v2, v9

    float-to-double v5, v2

    invoke-virtual {v3, v4, v5, v6}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;D)V

    :cond_8
    iget-object v2, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    const-wide/high16 v3, -0x4010000000000000L    # -1.0

    if-eqz v2, :cond_9

    sget-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->f0:Ljava/lang/Object;

    invoke-virtual {v2, v5, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;D)D

    move-result-wide v5

    goto :goto_6

    :cond_9
    move-wide v5, v3

    :goto_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "dcsr "

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;)V

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->q:Ljava/lang/Object;

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    invoke-virtual {v1, v2, v10, v11}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;D)D

    move-result-wide v1

    cmpl-double v7, v5, v3

    if-eqz v7, :cond_a

    goto :goto_7

    :cond_a
    move-wide v5, v1

    :goto_7
    cmpl-double v1, v5, v10

    if-gez v1, :cond_b

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/c/a/a/e/i;->a(D)Z

    move-result v1

    if-eqz v1, :cond_c

    :cond_b
    const/4 v8, 0x1

    :cond_c
    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    if-eqz v1, :cond_d

    iget-object v2, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->e:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/c/i;->e:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    if-ne v2, v3, :cond_d

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->a([I)V

    :cond_d
    move v9, v8

    goto :goto_8

    :cond_e
    cmpl-float v1, v11, v7

    if-lez v1, :cond_f

    cmpl-float v1, v3, v7

    if-lez v1, :cond_f

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->v:Ljava/lang/Object;

    float-to-double v4, v11

    invoke-virtual {v1, v2, v4, v5}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;D)V

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->w:Ljava/lang/Object;

    float-to-double v3, v3

    invoke-virtual {v1, v2, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;D)V

    :cond_f
    :goto_8
    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->r:Ljava/lang/Object;

    invoke-virtual {v1, v2, v9}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    const-wide/16 v1, 0x0

    cmp-long v3, p3, v1

    if-lez v3, :cond_10

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->D:Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long v3, v3, p3

    invoke-virtual {v1, v2, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;J)V

    :cond_10
    return v9
.end method

.method public b()V
    .locals 8

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result v0

    const/4 v2, 0x3

    if-ne v2, v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(I)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->b:Ljava/lang/Object;

    invoke-virtual {v0, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->c(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->i:Ljava/lang/Object;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->e:Ljava/lang/Object;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->B()Z

    move-result v4

    invoke-virtual {v0, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Z)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->m:Ljava/lang/Object;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->z:Ljava/lang/Object;

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->l:Ljava/lang/Object;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->p()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->j:Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v0, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->k:Ljava/lang/Object;

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v0, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->y:Ljava/lang/Object;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->q()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->x:Ljava/lang/Object;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    const/4 v3, 0x0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->g()I

    move-result v0

    :goto_0
    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->G:Ljava/lang/Object;

    invoke-virtual {v4, v5, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;I)V

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v5, Lcom/aggmoread/sdk/z/c/a/a/d/b/k$b;->d:Ljava/lang/Object;

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6}, Ljava/util/Date;-><init>()V

    invoke-virtual {v6}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    invoke-virtual {v4, v5, v6, v7}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;J)V

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->h()Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    invoke-virtual {v4, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->b(Ljava/lang/Object;)I

    move-result v1

    if-eqz v1, :cond_5

    if-eq v1, v2, :cond_4

    const/16 v0, 0x8

    if-eq v1, v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V

    return-void

    :cond_4
    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->k()V

    goto :goto_1

    :cond_5
    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-virtual {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/k;)V

    return-void

    :cond_6
    :goto_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(Ljava/lang/String;Z)V

    return-void
.end method
