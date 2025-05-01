.class public Lcom/aggmoread/sdk/z/c/a/a/e/q/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/aggmoread/sdk/z/c/a/a/e/q/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/q/a;->a:Ljava/util/Map;

    return-void
.end method

.method public static a(Landroid/content/ContextWrapper;Ljava/lang/String;Ljava/lang/String;Lcom/aggmoread/sdk/z/c/a/a/d/b/e;)Z
    .locals 2

    :try_start_0
    sget-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/q/a;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p2, Lcom/aggmoread/sdk/z/c/a/a/e/q/a;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/aggmoread/sdk/z/c/a/a/e/q/i;

    invoke-virtual {p2}, Lcom/aggmoread/sdk/z/c/a/a/e/q/i;->a()V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/q/i;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/q/i;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    move-object p2, v0

    :goto_0
    const-class v0, Landroid/content/ContextWrapper;

    const-string v1, "mBase"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    invoke-virtual {v0, p0, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p3, p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/e/q/a;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/lang/String;Lcom/aggmoread/sdk/z/c/a/a/e/q/i;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return p0
.end method

.method public static a(Lcom/aggmoread/sdk/z/c/a/a/d/b/e;Ljava/lang/String;Lcom/aggmoread/sdk/z/c/a/a/e/q/i;)Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method
