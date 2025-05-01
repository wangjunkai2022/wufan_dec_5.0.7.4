.class Lcom/aggmoread/sdk/z/c/a/a/d/b/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/c/a/a/e/d$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(Landroid/os/Handler$Callback;Lcom/aggmoread/sdk/z/c/a/a/d/b/h;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Handler$Callback;

.field final synthetic b:Lcom/aggmoread/sdk/z/c/a/a/d/b/h;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g;Landroid/os/Handler$Callback;Lcom/aggmoread/sdk/z/c/a/a/d/b/h;)V
    .locals 0

    iput-object p2, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$a;->a:Landroid/os/Handler$Callback;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I[BLcom/aggmoread/sdk/z/c/a/a/d/b/i;)V
    .locals 1

    if-nez p3, :cond_3

    if-eqz p2, :cond_3

    :try_start_0
    new-instance p1, Ljava/lang/String;

    const-string p3, "UTF-8"

    invoke-direct {p1, p2, p3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/b;->d(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    new-instance p2, Lcom/aggmoread/sdk/z/c/a/a/e/f;

    invoke-direct {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/e/f;-><init>(Ljava/util/Map;)V

    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$l;->a:Ljava/lang/Object;

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->r:Ljava/lang/Boolean;

    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/b;->c()V

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->r:Ljava/lang/Boolean;

    :goto_0
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$l;->b:Ljava/lang/Object;

    const/4 p3, 0x0

    invoke-virtual {p2, p1, p3}, Lcom/aggmoread/sdk/z/c/a/a/e/f;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$a;->a:Landroid/os/Handler$Callback;

    if-eqz p1, :cond_1

    new-instance p1, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$a$a;

    invoke-direct {p1, p0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$a$a;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/g$a;)V

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->a(Ljava/lang/Runnable;)Z

    :cond_1
    invoke-static {}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->a()Lcom/aggmoread/sdk/z/c/a/a/e/h;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    const-string p2, "debugLog"

    :try_start_1
    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/j;->r:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, p2, v0}, Lcom/aggmoread/sdk/z/c/a/a/e/h;->b(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g$a;->b:Lcom/aggmoread/sdk/z/c/a/a/d/b/h;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/h;->a()Ljava/lang/String;

    move-result-object p3

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "init set oaid "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    :cond_3
    :goto_2
    return-void
.end method
