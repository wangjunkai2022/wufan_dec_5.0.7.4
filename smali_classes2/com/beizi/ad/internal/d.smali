.class public Lcom/beizi/ad/internal/d;
.super Ljava/lang/Object;
.source "AdParameters.java"


# static fields
.field static a:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/beizi/ad/internal/j;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Z

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lcom/beizi/ad/internal/j;->f:Lcom/beizi/ad/internal/j;

    iput-object v0, p0, Lcom/beizi/ad/internal/d;->b:Lcom/beizi/ad/internal/j;

    const/4 v0, 0x3

    .line 3
    iput v0, p0, Lcom/beizi/ad/internal/d;->d:I

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/beizi/ad/internal/d;->e:Z

    const/4 v1, -0x1

    .line 5
    iput v1, p0, Lcom/beizi/ad/internal/d;->f:I

    .line 6
    iput v1, p0, Lcom/beizi/ad/internal/d;->g:I

    .line 7
    iput v1, p0, Lcom/beizi/ad/internal/d;->h:I

    .line 8
    iput v1, p0, Lcom/beizi/ad/internal/d;->i:I

    .line 9
    iput-boolean v0, p0, Lcom/beizi/ad/internal/d;->k:Z

    .line 10
    iput-boolean v0, p0, Lcom/beizi/ad/internal/d;->l:Z

    .line 11
    iput-boolean v0, p0, Lcom/beizi/ad/internal/d;->m:Z

    const-string v0, ""

    .line 12
    iput-object v0, p0, Lcom/beizi/ad/internal/d;->o:Ljava/lang/String;

    .line 13
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/beizi/ad/internal/d;->n:Ljava/lang/ref/WeakReference;

    .line 14
    iput-object p2, p0, Lcom/beizi/ad/internal/d;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/d;->o:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 4
    iput p1, p0, Lcom/beizi/ad/internal/d;->d:I

    return-void
.end method

.method public a(Lcom/beizi/ad/internal/j;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/beizi/ad/internal/d;->b:Lcom/beizi/ad/internal/j;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/beizi/ad/internal/d;->c:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/beizi/ad/internal/d;->k:Z

    return-void
.end method

.method public b()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/d;->n:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/internal/d;->n:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/beizi/ad/internal/d;->f:I

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 4
    iput-boolean p1, p0, Lcom/beizi/ad/internal/d;->e:Z

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/d;->c:Ljava/lang/String;

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/beizi/ad/internal/d;->g:I

    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/beizi/ad/internal/d;->m:Z

    return-void
.end method

.method public d()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/d;->b:Lcom/beizi/ad/internal/j;

    sget-object v1, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    if-ne v0, v1, :cond_0

    .line 2
    iget v0, p0, Lcom/beizi/ad/internal/d;->f:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/beizi/ad/internal/d;->h:I

    return-void
.end method

.method public e()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/d;->b:Lcom/beizi/ad/internal/j;

    sget-object v1, Lcom/beizi/ad/internal/j;->b:Lcom/beizi/ad/internal/j;

    if-ne v0, v1, :cond_0

    .line 2
    iget v0, p0, Lcom/beizi/ad/internal/d;->g:I

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 3
    iput p1, p0, Lcom/beizi/ad/internal/d;->i:I

    return-void
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/d;->h:I

    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/beizi/ad/internal/d;->i:I

    return v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/d;->e:Z

    return v0
.end method

.method public i()Lcom/beizi/ad/internal/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/d;->b:Lcom/beizi/ad/internal/j;

    return-object v0
.end method

.method public j()Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/g;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/beizi/ad/internal/d;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    .line 2
    :cond_1
    :goto_0
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget v1, Lcom/beizi/ad/R$string;->no_identification:I

    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/beizi/ad/internal/d;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const-string v1, "h"

    goto :goto_0

    :cond_0
    const-string v1, "v"

    .line 3
    :goto_0
    iput-object v1, p0, Lcom/beizi/ad/internal/d;->j:Ljava/lang/String;

    .line 4
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/StringUtil;->isEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "mOrientation"

    .line 5
    iget-object v2, p0, Lcom/beizi/ad/internal/d;->j:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 6
    :cond_1
    iget v1, p0, Lcom/beizi/ad/internal/d;->f:I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "size"

    const-string v3, "x"

    if-lez v1, :cond_2

    :try_start_1
    iget v1, p0, Lcom/beizi/ad/internal/d;->g:I

    if-lez v1, :cond_2

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v4, p0, Lcom/beizi/ad/internal/d;->f:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/beizi/ad/internal/d;->g:I

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 8
    :cond_2
    invoke-virtual {p0}, Lcom/beizi/ad/internal/d;->g()I

    move-result v1

    .line 9
    invoke-virtual {p0}, Lcom/beizi/ad/internal/d;->f()I

    move-result v4

    if-lez v1, :cond_5

    if-lez v4, :cond_5

    .line 10
    iget-object v5, p0, Lcom/beizi/ad/internal/d;->b:Lcom/beizi/ad/internal/j;

    sget-object v6, Lcom/beizi/ad/internal/j;->c:Lcom/beizi/ad/internal/j;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    iget v5, p0, Lcom/beizi/ad/internal/d;->f:I

    if-ltz v5, :cond_3

    iget v5, p0, Lcom/beizi/ad/internal/d;->g:I

    if-gez v5, :cond_4

    :cond_3
    const-string v2, "max_size"

    .line 11
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 12
    :cond_4
    iget-object v5, p0, Lcom/beizi/ad/internal/d;->b:Lcom/beizi/ad/internal/j;

    invoke-virtual {v5, v6}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 13
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    :cond_5
    :goto_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 15
    sget-object v1, Lcom/beizi/ad/internal/utilities/HaoboLog;->jsonLogTag:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to encode adUnitParams, err = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/ad/internal/d;->m:Z

    return v0
.end method
