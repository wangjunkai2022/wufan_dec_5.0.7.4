.class final Lcom/aggmoread/sdk/z/a/p/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/p/a$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/p/a;->a(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/p/a$f;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/p/a$f;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/p/a$a;->a:Lcom/aggmoread/sdk/z/a/p/a$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I[BLcom/aggmoread/sdk/z/a/g/e;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    :goto_0
    iget-object p2, p0, Lcom/aggmoread/sdk/z/a/p/a$a;->a:Lcom/aggmoread/sdk/z/a/p/a$f;

    invoke-interface {p2, p1, v0, p3}, Lcom/aggmoread/sdk/z/a/p/a$f;->a(ILorg/json/JSONObject;Lcom/aggmoread/sdk/z/a/g/e;)V

    return-void

    :cond_0
    if-nez p2, :cond_1

    return-void

    :cond_1
    :try_start_0
    new-instance v1, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v1, p2, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p2

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
