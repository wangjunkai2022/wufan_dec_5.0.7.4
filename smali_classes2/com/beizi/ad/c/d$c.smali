.class public Lcom/beizi/ad/c/d$c;
.super Ljava/lang/Object;
.source "CommonInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/c/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/c/d$c$a;
    }
.end annotation


# instance fields
.field private a:Lcom/beizi/ad/c/e$d;

.field private b:Lcom/beizi/ad/c/e$c;

.field private c:Lcom/beizi/ad/c/d$b;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/ad/c/d$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/ad/c/d$c;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/c/d$c;Lcom/beizi/ad/c/d$b;)Lcom/beizi/ad/c/d$b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/d$c;->c:Lcom/beizi/ad/c/d$b;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/ad/c/d$c;Lcom/beizi/ad/c/e$c;)Lcom/beizi/ad/c/e$c;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/c/d$c;->b:Lcom/beizi/ad/c/e$c;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/ad/c/d$c;Lcom/beizi/ad/c/e$d;)Lcom/beizi/ad/c/e$d;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/beizi/ad/c/d$c;->a:Lcom/beizi/ad/c/e$d;

    return-object p1
.end method


# virtual methods
.method public a()Lorg/json/JSONObject;
    .locals 3

    .line 4
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "net"

    .line 5
    iget-object v2, p0, Lcom/beizi/ad/c/d$c;->a:Lcom/beizi/ad/c/e$d;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "isp"

    .line 6
    iget-object v2, p0, Lcom/beizi/ad/c/d$c;->b:Lcom/beizi/ad/c/e$c;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 7
    iget-object v1, p0, Lcom/beizi/ad/c/d$c;->c:Lcom/beizi/ad/c/d$b;

    if-eqz v1, :cond_0

    const-string v2, "geo"

    .line 8
    invoke-virtual {v1}, Lcom/beizi/ad/c/d$b;->a()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    .line 9
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public b()[B
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/beizi/ad/c/d$c;->a()Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    :goto_0
    return-object v0
.end method
