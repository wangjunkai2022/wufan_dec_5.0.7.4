.class public Lcom/aggmoread/sdk/z/c/a/a/e/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/c/a/a/e/h$e;
    }
.end annotation


# static fields
.field private static b:Lcom/aggmoread/sdk/z/c/a/a/e/h;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/c;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a:Ljava/lang/String;

    return-void
.end method

.method public static a()Lcom/aggmoread/sdk/z/c/a/a/e/h;
    .locals 3

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b:Lcom/aggmoread/sdk/z/c/a/a/e/h;

    if-nez v0, :cond_1

    const-class v0, Lcom/aggmoread/sdk/z/c/a/a/e/h;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b:Lcom/aggmoread/sdk/z/c/a/a/e/h;

    if-nez v1, :cond_0

    new-instance v1, Lcom/aggmoread/sdk/z/c/a/a/e/h;

    const-string v2, "default"

    invoke-direct {v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/e/h;-><init>(Ljava/lang/String;)V

    sput-object v1, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b:Lcom/aggmoread/sdk/z/c/a/a/e/h;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b:Lcom/aggmoread/sdk/z/c/a/a/e/h;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;I)I
    .locals 1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public a(Ljava/lang/String;J)J
    .locals 1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/e/h$e;)V
    .locals 1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/h$e;->a(Landroid/content/SharedPreferences$Editor;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/h$d;

    invoke-direct {v0, p0, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/h$d;-><init>(Lcom/aggmoread/sdk/z/c/a/a/e/h;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a(Lcom/aggmoread/sdk/z/c/a/a/e/h$e;)V

    return-void
.end method

.method public a(Ljava/lang/String;Z)Z
    .locals 1

    invoke-virtual {p0}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method protected b()Landroid/content/SharedPreferences;
    .locals 3

    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->q:Landroid/content/Context;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method public b(Ljava/lang/String;J)V
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/h$b;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/aggmoread/sdk/z/c/a/a/e/h$b;-><init>(Lcom/aggmoread/sdk/z/c/a/a/e/h;Ljava/lang/String;J)V

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a(Lcom/aggmoread/sdk/z/c/a/a/e/h$e;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/h$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/h$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/e/h;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a(Lcom/aggmoread/sdk/z/c/a/a/e/h$e;)V

    return-void
.end method

.method public b(Ljava/lang/String;Z)V
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/h$c;

    invoke-direct {v0, p0, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/h$c;-><init>(Lcom/aggmoread/sdk/z/c/a/a/e/h;Ljava/lang/String;Z)V

    invoke-virtual {p0, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a(Lcom/aggmoread/sdk/z/c/a/a/e/h$e;)V

    return-void
.end method
