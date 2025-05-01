.class public final Lcom/aggmoread/sdk/z/a/j/n$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/a/j/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:I

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Lcom/aggmoread/sdk/z/a/j/i;

.field private h:Landroid/content/Context;

.field private i:I

.field private j:Z

.field private k:Lcom/aggmoread/sdk/z/a/j/k;

.field private l:I

.field private final m:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->i:I

    iput v0, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->l:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->m:Ljava/util/Map;

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->h:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/aggmoread/sdk/z/a/j/n$a;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->i:I

    return-object p0
.end method

.method public a(Lcom/aggmoread/sdk/z/a/j/i;)Lcom/aggmoread/sdk/z/a/j/n$a;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->g:Lcom/aggmoread/sdk/z/a/j/i;

    return-object p0
.end method

.method public a(Lcom/aggmoread/sdk/z/a/j/k;)Lcom/aggmoread/sdk/z/a/j/n$a;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->k:Lcom/aggmoread/sdk/z/a/j/k;

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/j/n$a;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method public a(Z)Lcom/aggmoread/sdk/z/a/j/n$a;
    .locals 0

    iput-boolean p1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->j:Z

    return-object p0
.end method

.method public a()Lcom/aggmoread/sdk/z/a/j/n;
    .locals 4

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/n;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/a/j/n;-><init>()V

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/n;->a(Lcom/aggmoread/sdk/z/a/j/n;Ljava/lang/String;)Ljava/lang/String;

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/n;->b(Lcom/aggmoread/sdk/z/a/j/n;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->e:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->e:Ljava/lang/String;

    const-string v2, "apk"

    const-string v3, "tmp"

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->e:Ljava/lang/String;

    :cond_1
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/n;->c(Lcom/aggmoread/sdk/z/a/j/n;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/n;->d(Lcom/aggmoread/sdk/z/a/j/n;Ljava/lang/String;)Ljava/lang/String;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->f:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/n;->b(Lcom/aggmoread/sdk/z/a/j/n;I)I

    iget v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->c:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/n;->c(Lcom/aggmoread/sdk/z/a/j/n;I)I

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->j:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/n;->a(Lcom/aggmoread/sdk/z/a/j/n;Z)Z

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->h:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/n;->a(Lcom/aggmoread/sdk/z/a/j/n;Landroid/content/Context;)Landroid/content/Context;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->i:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/n;->d(Lcom/aggmoread/sdk/z/a/j/n;I)I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->k:Lcom/aggmoread/sdk/z/a/j/k;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/n;->a(Lcom/aggmoread/sdk/z/a/j/n;Lcom/aggmoread/sdk/z/a/j/k;)Lcom/aggmoread/sdk/z/a/j/k;

    iget v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->l:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/n;->a(Lcom/aggmoread/sdk/z/a/j/n;I)I

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->k:Lcom/aggmoread/sdk/z/a/j/k;

    if-eqz v1, :cond_2

    new-instance v1, Lcom/aggmoread/sdk/z/a/j/m;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->g:Lcom/aggmoread/sdk/z/a/j/i;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->k:Lcom/aggmoread/sdk/z/a/j/k;

    invoke-direct {v1, v2, v3}, Lcom/aggmoread/sdk/z/a/j/m;-><init>(Lcom/aggmoread/sdk/z/a/j/i;Lcom/aggmoread/sdk/z/a/j/k;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->g:Lcom/aggmoread/sdk/z/a/j/i;

    :goto_0
    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/j/n;->a(Lcom/aggmoread/sdk/z/a/j/n;Lcom/aggmoread/sdk/z/a/j/i;)Lcom/aggmoread/sdk/z/a/j/i;

    invoke-static {v0}, Lcom/aggmoread/sdk/z/a/j/n;->a(Lcom/aggmoread/sdk/z/a/j/n;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->m:Ljava/util/Map;

    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public b(I)Lcom/aggmoread/sdk/z/a/j/n$a;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->l:I

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/j/n$a;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/j/n$a;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/j/n$a;->b:Ljava/lang/String;

    return-object p0
.end method
