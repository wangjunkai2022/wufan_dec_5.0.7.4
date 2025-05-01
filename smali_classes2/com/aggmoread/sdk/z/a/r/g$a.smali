.class final Lcom/aggmoread/sdk/z/a/r/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/aggmoread/sdk/z/a/p/a$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/r/g;->a(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/r/g$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/r/g$c;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/r/g$c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/g$a;->a:Lcom/aggmoread/sdk/z/a/r/g$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I[BLcom/aggmoread/sdk/z/a/g/e;)V
    .locals 4

    const-string p1, "dstlink"

    const-string v0, "clickid"

    const-string v1, "data"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onResponse enter , err = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "CLKRJTAG"

    invoke-static {v3, v2}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p3, :cond_3

    if-eqz p2, :cond_2

    :try_start_0
    new-instance p3, Lcom/aggmoread/sdk/z/a/r/g$b;

    invoke-direct {p3}, Lcom/aggmoread/sdk/z/a/r/g$b;-><init>()V

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, p2}, Ljava/lang/String;-><init>([B)V

    const-string p2, "request response"

    invoke-static {v2, p2}, Lcom/aggmoread/sdk/z/a/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p3, Lcom/aggmoread/sdk/z/a/r/g$b;->a:Ljava/lang/String;

    :cond_0
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p3, Lcom/aggmoread/sdk/z/a/r/g$b;->b:Ljava/lang/String;

    :cond_1
    new-instance p1, Lcom/aggmoread/sdk/z/a/r/g$a$a;

    invoke-direct {p1, p0, p3}, Lcom/aggmoread/sdk/z/a/r/g$a$a;-><init>(Lcom/aggmoread/sdk/z/a/r/g$a;Lcom/aggmoread/sdk/z/a/r/g$b;)V

    invoke-static {p1}, Lcom/aggmoread/sdk/z/a/m/m;->b(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "get clk err ,"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "onResponse enter , response = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/r/g$a;->a:Lcom/aggmoread/sdk/z/a/r/g$c;

    sget-object p2, Lcom/aggmoread/sdk/z/a/r/g$b;->c:Lcom/aggmoread/sdk/z/a/r/g$b;

    invoke-virtual {p1, p2}, Lcom/aggmoread/sdk/z/a/r/g$c;->a(Lcom/aggmoread/sdk/z/a/r/g$b;)V

    :cond_4
    :goto_0
    return-void
.end method
