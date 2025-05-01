.class public Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/f;
.super Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/g$a;


# static fields
.field private static k:Ljava/lang/String; = "AMUTAGGDT"


# instance fields
.field public j:Lcom/qq/e/ads/nativ/NativeUnifiedAD;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    return-void
.end method

.method private r()V
    .locals 8

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/g;

    invoke-direct {v0, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/g;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/g$a;)V

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/g;->a()Lcom/qq/e/ads/nativ/NativeADUnifiedListener;

    move-result-object v6

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->X:Ljava/lang/Object;

    const-string v3, ""

    invoke-virtual {v0, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->T:Ljava/lang/Object;

    invoke-virtual {v0, v4, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;->d:Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->f:Ljava/lang/String;

    const/4 v0, 0x0

    new-array v7, v0, [Ljava/lang/Object;

    invoke-static/range {v1 .. v7}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d$e;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qq/e/ads/nativ/NativeUnifiedAD;

    iput-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/f;->j:Lcom/qq/e/ads/nativ/NativeUnifiedAD;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->m:I

    const/4 v2, 0x1

    if-ge v1, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v3, v3, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->d:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v4, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->w:Ljava/lang/Object;

    invoke-virtual {v3, v4, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;I)I

    move-result v3

    if-lez v3, :cond_2

    if-le v3, v2, :cond_1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    const/16 v3, 0x9

    invoke-static {v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;I)V

    :cond_1
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/f;->k:Ljava/lang/String;

    const-string v3, "load ad"

    invoke-static {v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->s:Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->c()I

    move-result v3

    const/16 v4, 0x3d

    const/4 v5, 0x5

    if-lt v3, v5, :cond_3

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->c()I

    move-result v3

    if-gt v3, v4, :cond_3

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/f;->j:Lcom/qq/e/ads/nativ/NativeUnifiedAD;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->c()I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/qq/e/ads/nativ/NativeUnifiedAD;->setMinVideoDuration(I)V

    :cond_3
    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->b()I

    move-result v3

    if-lt v3, v5, :cond_4

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->b()I

    move-result v3

    if-gt v3, v4, :cond_4

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/f;->j:Lcom/qq/e/ads/nativ/NativeUnifiedAD;

    invoke-virtual {v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b;->b()I

    move-result v1

    invoke-virtual {v3, v1}, Lcom/qq/e/ads/nativ/NativeUnifiedAD;->setMaxVideoDuration(I)V

    :cond_4
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/f;->j:Lcom/qq/e/ads/nativ/NativeUnifiedAD;

    invoke-virtual {v1, v2}, Lcom/qq/e/ads/nativ/NativeUnifiedAD;->loadData(I)V

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-direct {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)V

    invoke-virtual {v1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->a(I)Lcom/aggmoread/sdk/z/c/a/a/d/b/k;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/k;->b()V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/Object;II)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, p3, p2, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d;->a(Ljava/lang/Object;IILjava/lang/String;)V

    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qq/e/ads/nativ/NativeUnifiedADData;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/f;->k:Ljava/lang/String;

    const-string v1, "ad loaded"

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/l;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/d;)I

    move-result v0

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->i()V

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    const v0, 0x3baa23b0

    const-string v1, "GDT ad blocked"

    invoke-direct {p1, v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    const/16 v2, 0x10

    const-string v3, "com.sdk.key.ESP"

    invoke-virtual {v1, v3, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->a(Ljava/lang/String;I)Z

    move-result v8

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_5

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->q()Z

    move-result v10

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->o()Z

    move-result v11

    const/4 v1, -0x1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/qq/e/ads/nativ/NativeUnifiedADData;

    invoke-static {v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Ljava/lang/Object;)I

    move-result v12

    if-eqz v11, :cond_2

    if-eqz v10, :cond_1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    invoke-static {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->a(Ljava/lang/Object;I)V

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v2, v12}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->b(Ljava/lang/Object;I)V

    :cond_2
    if-eqz v8, :cond_3

    new-instance v13, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/a;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/f;->j:Lcom/qq/e/ads/nativ/NativeUnifiedAD;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v6, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    move-object v1, v13

    move v7, v0

    invoke-direct/range {v1 .. v7}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/a;-><init>(Lcom/qq/e/ads/nativ/NativeUnifiedADData;Lcom/qq/e/ads/nativ/NativeUnifiedAD;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;I)V

    goto :goto_1

    :cond_3
    new-instance v13, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/f;->j:Lcom/qq/e/ads/nativ/NativeUnifiedAD;

    iget-object v4, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v5, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v6, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->b:Ljava/util/HashMap;

    move-object v1, v13

    move v7, v0

    invoke-direct/range {v1 .. v7}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/e;-><init>(Lcom/qq/e/ads/nativ/NativeUnifiedADData;Lcom/qq/e/ads/nativ/NativeUnifiedAD;Lcom/aggmoread/sdk/z/c/a/a/d/b/d;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/util/Map;I)V

    :goto_1
    invoke-interface {v9, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    move v1, v12

    goto :goto_0

    :cond_4
    if-eqz v10, :cond_5

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p0, v1, v3}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->a(II)V

    return-void

    :cond_5
    invoke-virtual {p0, v9}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->e(Ljava/util/List;)V

    return-void
.end method

.method protected c(Ljava/lang/Object;I)V
    .locals 0

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/d;->a(Ljava/lang/Object;I)V

    return-void
.end method

.method public l()V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->c:Lcom/aggmoread/sdk/z/c/a/a/d/b/d;

    iget-object v0, v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/d;->d:Landroid/content/Context;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/a;->d:Lcom/aggmoread/sdk/z/c/a/a/d/b/e;

    iget-object v1, v1, Lcom/aggmoread/sdk/z/c/a/a/d/b/e;->c:Lcom/aggmoread/sdk/z/c/a/a/e/f;

    sget-object v2, Lcom/aggmoread/sdk/z/c/a/a/d/b/e$c;->X:Ljava/lang/Object;

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/f;->r()V

    return-void
.end method

.method public onNoAD(Lcom/qq/e/comm/util/AdError;)V
    .locals 3

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/t/g/f;->k:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "onAdError %s"

    invoke-static {v0, v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorCode()I

    move-result v1

    invoke-virtual {p1}, Lcom/qq/e/comm/util/AdError;->getErrorMsg()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/i;-><init>(ILjava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/k;->b(Lcom/aggmoread/sdk/z/c/a/a/d/b/i;)V

    return-void
.end method
