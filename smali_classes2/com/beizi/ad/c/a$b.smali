.class public Lcom/beizi/ad/c/a$b;
.super Ljava/lang/Object;
.source "AdRequest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/c/a$b$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/beizi/ad/c/e$i;

.field private c:Lcom/beizi/ad/c/e$g;

.field private d:J

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:J

.field private i:J

.field private j:Lcom/beizi/ad/c/d$a;

.field private k:Lcom/beizi/ad/c/d$c;

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/beizi/ad/c/a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/beizi/ad/c/a$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/ad/c/a$b;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/beizi/ad/c/a$b;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/ad/c/a$b;->h:J

    return-wide p1
.end method

.method static synthetic a(Lcom/beizi/ad/c/a$b;Lcom/beizi/ad/c/d$a;)Lcom/beizi/ad/c/d$a;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/c/a$b;->j:Lcom/beizi/ad/c/d$a;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/ad/c/a$b;Lcom/beizi/ad/c/d$c;)Lcom/beizi/ad/c/d$c;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/beizi/ad/c/a$b;->k:Lcom/beizi/ad/c/d$c;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/ad/c/a$b;Lcom/beizi/ad/c/e$g;)Lcom/beizi/ad/c/e$g;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/beizi/ad/c/a$b;->c:Lcom/beizi/ad/c/e$g;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/ad/c/a$b;Lcom/beizi/ad/c/e$i;)Lcom/beizi/ad/c/e$i;
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/beizi/ad/c/a$b;->b:Lcom/beizi/ad/c/e$i;

    return-object p1
.end method

.method private a()Ljava/lang/String;
    .locals 4

    .line 8
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "version"

    .line 9
    iget-object v2, p0, Lcom/beizi/ad/c/a$b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "srcType"

    .line 10
    iget-object v2, p0, Lcom/beizi/ad/c/a$b;->b:Lcom/beizi/ad/c/e$i;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "reqType"

    .line 11
    iget-object v2, p0, Lcom/beizi/ad/c/a$b;->c:Lcom/beizi/ad/c/e$g;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "timeStamp"

    .line 12
    iget-wide v2, p0, Lcom/beizi/ad/c/a$b;->d:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "appid"

    .line 13
    iget-object v2, p0, Lcom/beizi/ad/c/a$b;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "appVersion"

    .line 14
    iget-object v2, p0, Lcom/beizi/ad/c/a$b;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "apkName"

    .line 15
    iget-object v2, p0, Lcom/beizi/ad/c/a$b;->g:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "appInstallTime"

    .line 16
    iget-wide v2, p0, Lcom/beizi/ad/c/a$b;->h:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "appUpdateTime"

    .line 17
    iget-wide v2, p0, Lcom/beizi/ad/c/a$b;->i:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 18
    iget-object v1, p0, Lcom/beizi/ad/c/a$b;->j:Lcom/beizi/ad/c/d$a;

    if-eqz v1, :cond_0

    const-string v2, "devInfo"

    .line 19
    invoke-virtual {v1}, Lcom/beizi/ad/c/d$a;->a()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    :cond_0
    iget-object v1, p0, Lcom/beizi/ad/c/a$b;->k:Lcom/beizi/ad/c/d$c;

    if-eqz v1, :cond_1

    const-string v2, "envInfo"

    .line 21
    invoke-virtual {v1}, Lcom/beizi/ad/c/d$c;->a()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    :cond_1
    iget-object v1, p0, Lcom/beizi/ad/c/a$b;->l:Ljava/util/ArrayList;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_3

    .line 23
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    const/4 v2, 0x0

    .line 24
    :goto_0
    iget-object v3, p0, Lcom/beizi/ad/c/a$b;->l:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 25
    iget-object v3, p0, Lcom/beizi/ad/c/a$b;->l:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/beizi/ad/c/a$a;

    invoke-virtual {v3}, Lcom/beizi/ad/c/a$a;->a()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const-string v2, "adReqInfo"

    .line 26
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    :cond_3
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 28
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic a(Lcom/beizi/ad/c/a$b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/beizi/ad/c/a$b;->e:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lcom/beizi/ad/c/a$b;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/beizi/ad/c/a$b;->l:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic b(Lcom/beizi/ad/c/a$b;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/ad/c/a$b;->d:J

    return-wide p1
.end method

.method static synthetic b(Lcom/beizi/ad/c/a$b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/c/a$b;->g:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/beizi/ad/c/a$b;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/beizi/ad/c/a$b;->i:J

    return-wide p1
.end method

.method static synthetic c(Lcom/beizi/ad/c/a$b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/c/a$b;->f:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lcom/beizi/ad/c/a$b;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/c/a$b;->a:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/beizi/ad/c/a$b;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
