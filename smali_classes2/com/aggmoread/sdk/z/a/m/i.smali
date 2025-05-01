.class public Lcom/aggmoread/sdk/z/a/m/i;
.super Lcom/aggmoread/sdk/z/a/m/h;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Landroid/content/Context;

.field private c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/m/h;-><init>()V

    const-string v0, "devyok.DATA_PROVIDER"

    iput-object v0, p0, Lcom/aggmoread/sdk/z/a/m/i;->a:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, Lcom/aggmoread/sdk/z/a/m/i;->c:I

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/m/i;->b:Landroid/content/Context;

    return-void
.end method

.method private a(Landroid/content/SharedPreferences$Editor;)V
    .locals 2

    iget v0, p0, Lcom/aggmoread/sdk/z/a/m/i;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :goto_1
    return-void
.end method


# virtual methods
.method a()Landroid/content/SharedPreferences;
    .locals 3

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/m/i;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/m/i;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/m/i;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/m/i;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/m/i;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-direct {p0, v0}, Lcom/aggmoread/sdk/z/a/m/i;->a(Landroid/content/SharedPreferences$Editor;)V

    return-void
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/a/m/i;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/m/i;->a:Ljava/lang/String;

    return-void
.end method
