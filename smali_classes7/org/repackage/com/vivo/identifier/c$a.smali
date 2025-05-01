.class Lorg/repackage/com/vivo/identifier/c$a;
.super Ljava/lang/Object;
.source "IdentifierIdClient.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/repackage/com/vivo/identifier/c;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lorg/repackage/com/vivo/identifier/c;


# direct methods
.method constructor <init>(Lorg/repackage/com/vivo/identifier/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/repackage/com/vivo/identifier/c$a;->b:Lorg/repackage/com/vivo/identifier/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->V()I

    move-result v0

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->X()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->Y()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->Z()I

    move-result v1

    add-int/2addr v0, v1

    .line 2
    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->a0()I

    move-result v1

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->b0()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->c0()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->Z()I

    move-result v2

    add-int/2addr v1, v2

    .line 3
    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->d0()I

    move-result v2

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->e0()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->f0()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->g0()I

    move-result v3

    add-int/2addr v2, v3

    add-int/2addr v0, v1

    add-int/2addr v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [Landroid/content/ContentValues;

    .line 4
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    .line 5
    iget-object v2, p0, Lorg/repackage/com/vivo/identifier/c$a;->b:Lorg/repackage/com/vivo/identifier/c;

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->V()I

    move-result v3

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->X()I

    move-result v4

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->Y()I

    move-result v5

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->h0()I

    move-result v6

    invoke-static {v2, v3, v4, v5, v6}, Lorg/repackage/com/vivo/identifier/c;->j(Lorg/repackage/com/vivo/identifier/c;IIII)Ljava/lang/String;

    move-result-object v2

    const-string v3, "oaid"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v2, p0, Lorg/repackage/com/vivo/identifier/c$a;->b:Lorg/repackage/com/vivo/identifier/c;

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->a0()I

    move-result v3

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->b0()I

    move-result v4

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->c0()I

    move-result v5

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->Z()I

    move-result v6

    invoke-static {v2, v3, v4, v5, v6}, Lorg/repackage/com/vivo/identifier/c;->j(Lorg/repackage/com/vivo/identifier/c;IIII)Ljava/lang/String;

    move-result-object v2

    const-string v3, "vaid"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    iget-object v2, p0, Lorg/repackage/com/vivo/identifier/c$a;->b:Lorg/repackage/com/vivo/identifier/c;

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->d0()I

    move-result v3

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->e0()I

    move-result v4

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->f0()I

    move-result v5

    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->g0()I

    move-result v6

    invoke-static {v2, v3, v4, v5, v6}, Lorg/repackage/com/vivo/identifier/c;->j(Lorg/repackage/com/vivo/identifier/c;IIII)Ljava/lang/String;

    move-result-object v2

    const-string v3, "aaid"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 8
    invoke-static {}, Lorg/repackage/com/vivo/identifier/c;->i0()Lorg/repackage/com/vivo/identifier/b;

    move-result-object v1

    const/4 v3, 0x7

    const-string v4, "vivo"

    invoke-virtual {v1, v3, v4, v0}, Lorg/repackage/com/vivo/identifier/b;->c(ILjava/lang/String;[Landroid/content/ContentValues;)Z

    .line 9
    invoke-static {v2}, Lorg/repackage/com/vivo/identifier/c;->I(I)I

    move-result v0

    invoke-static {v0}, Lorg/repackage/com/vivo/identifier/c;->E(I)I

    move-result v0

    invoke-static {v0}, Lorg/repackage/com/vivo/identifier/c;->A(I)I

    move-result v0

    invoke-static {v0}, Lorg/repackage/com/vivo/identifier/c;->v(I)I

    move-result v0

    invoke-static {v0}, Lorg/repackage/com/vivo/identifier/c;->p(I)I

    move-result v0

    invoke-static {v0}, Lorg/repackage/com/vivo/identifier/c;->f(I)I

    .line 10
    invoke-static {v2}, Lorg/repackage/com/vivo/identifier/c;->W(I)I

    move-result v0

    invoke-static {v0}, Lorg/repackage/com/vivo/identifier/c;->T(I)I

    move-result v0

    invoke-static {v0}, Lorg/repackage/com/vivo/identifier/c;->R(I)I

    move-result v0

    invoke-static {v0}, Lorg/repackage/com/vivo/identifier/c;->P(I)I

    move-result v0

    invoke-static {v0}, Lorg/repackage/com/vivo/identifier/c;->N(I)I

    move-result v0

    invoke-static {v0}, Lorg/repackage/com/vivo/identifier/c;->L(I)I

    :cond_0
    return-void
.end method
