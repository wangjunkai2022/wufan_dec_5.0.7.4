.class final Lcom/aggmoread/sdk/z/a/p/a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/p/a;->b(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lorg/json/JSONObject;

.field final synthetic d:Ljava/util/Map;


# direct methods
.method constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/p/a$f;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/p/a$d;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/p/a$d;->c:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/p/a$d;->d:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    invoke-static {}, Lcom/aggmoread/sdk/z/a/h/a;->d()Lcom/aggmoread/sdk/z/a/h/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/a/h/a;->c()Lcom/aggmoread/sdk/z/a/h/b;

    move-result-object v0

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/p/a$d;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/p/a$d;->c:Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/aggmoread/sdk/z/a/p/a$d;->d:Ljava/util/Map;

    new-instance v4, Lcom/aggmoread/sdk/z/a/p/a$d$a;

    invoke-direct {v4, p0}, Lcom/aggmoread/sdk/z/a/p/a$d$a;-><init>(Lcom/aggmoread/sdk/z/a/p/a$d;)V

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/aggmoread/sdk/z/a/h/b;->a(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/Map;Lcom/aggmoread/sdk/z/a/h/b$a;)V

    return-void
.end method
