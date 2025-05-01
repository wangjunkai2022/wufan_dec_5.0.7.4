.class public Lcom/aggmoread/sdk/z/b/a/a;
.super Lcom/aggmoread/sdk/z/a/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/b/a/a$a;
    }
.end annotation


# instance fields
.field private b:Lcom/aggmoread/sdk/z/b/b/a;

.field public c:I

.field public d:Ljava/lang/String;

.field public e:Lcom/aggmoread/sdk/z/b/a/a$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/e;-><init>()V

    return-void
.end method

.method private static a(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/z/b/a/a$a$a$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    new-instance v2, Lcom/aggmoread/sdk/z/b/a/a$a$a$a;

    invoke-direct {v2}, Lcom/aggmoread/sdk/z/b/a/a$a$a$a;-><init>()V

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/json/JSONObject;

    const-string v4, "type"

    invoke-static {v3, v4}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    iput v4, v2, Lcom/aggmoread/sdk/z/b/a/a$a$a$a;->a:I

    :cond_0
    const-string v4, "urls"

    invoke-static {v3, v4}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-static {v3}, Lcom/aggmoread/sdk/z/b/a/a;->b(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v2, Lcom/aggmoread/sdk/z/b/a/a$a$a$a;->b:Ljava/util/List;

    :cond_1
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static a(Lorg/json/JSONObject;Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static b(Lorg/json/JSONObject;)Lcom/aggmoread/sdk/z/b/a/a;
    .locals 8

    new-instance v0, Lcom/aggmoread/sdk/z/b/a/a;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/b/a/a;-><init>()V

    const-string v1, "code"

    invoke-static {p0, v1}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lcom/aggmoread/sdk/z/b/a/a;->c:I

    :cond_0
    const-string v1, "msg"

    invoke-static {p0, v1}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/aggmoread/sdk/z/b/a/a;->d:Ljava/lang/String;

    :cond_1
    const-string v1, "ads"

    invoke-static {p0, v1}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_15

    new-instance v2, Lcom/aggmoread/sdk/z/b/a/a$a;

    invoke-direct {v2}, Lcom/aggmoread/sdk/z/b/a/a$a;-><init>()V

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v1, "slotCode"

    invoke-static {p0, v1}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    :cond_2
    const-string v1, "meta"

    invoke-static {p0, v1}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-lez v3, :cond_15

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_14

    new-instance v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;

    invoke-direct {v4}, Lcom/aggmoread/sdk/z/b/a/a$a$a;-><init>()V

    invoke-virtual {p0, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lorg/json/JSONObject;

    const-string v6, "title"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->a:Ljava/lang/String;

    :cond_3
    const-string v6, "desc"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->b:Ljava/lang/String;

    :cond_4
    const-string v6, "icon"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->c:Ljava/lang/String;

    :cond_5
    const-string v6, "click_url"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->d:Ljava/lang/String;

    :cond_6
    const-string v6, "deepLink"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->e:Ljava/lang/String;

    const-string v6, "arrDeepLinkTrackUrl"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    invoke-static {v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->f:Ljava/util/List;

    :cond_7
    const-string v6, "imgs"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    invoke-static {v6}, Lcom/aggmoread/sdk/z/b/a/a;->b(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->g:Ljava/util/List;

    :cond_8
    const-string v6, "creative_type"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    :cond_9
    const-string v6, "interaction_type"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v6

    iput v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->h:I

    :cond_a
    const-string v6, "package_name"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->i:Ljava/lang/String;

    :cond_b
    const-string v6, "package_size"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    :cond_c
    const-string v6, "show_track_url"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    invoke-static {v6}, Lcom/aggmoread/sdk/z/b/a/a;->b(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->l:Ljava/util/List;

    :cond_d
    const-string v6, "click_track_url"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    invoke-static {v6}, Lcom/aggmoread/sdk/z/b/a/a;->b(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->m:Ljava/util/List;

    :cond_e
    const-string v6, "download_track_url"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    invoke-static {v6}, Lcom/aggmoread/sdk/z/b/a/a;->b(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->n:Ljava/util/List;

    :cond_f
    const-string v6, "install_track_url"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    invoke-static {v6}, Lcom/aggmoread/sdk/z/b/a/a;->b(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->o:Ljava/util/List;

    :cond_10
    const-string v6, "w"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    :cond_11
    const-string v6, "tanUrl"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Lcom/aggmoread/sdk/z/b/a/a$a$a;->p:Ljava/lang/String;

    :cond_12
    const-string v6, "ci"

    invoke-static {v5, v6}, Lcom/aggmoread/sdk/z/b/a/a;->a(Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_13

    const-string v6, "ci"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    :cond_13
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_14
    iput-object v1, v2, Lcom/aggmoread/sdk/z/b/a/a$a;->a:Ljava/util/List;

    iput-object v2, v0, Lcom/aggmoread/sdk/z/b/a/a;->e:Lcom/aggmoread/sdk/z/b/a/a$a;

    :cond_15
    return-object v0
.end method

.method private static b(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/b/b/a;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/b/a/a;->b:Lcom/aggmoread/sdk/z/b/b/a;

    return-void
.end method

.method public d()Lcom/aggmoread/sdk/z/b/b/a;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/a/a;->b:Lcom/aggmoread/sdk/z/b/b/a;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/b/a/a;->e:Lcom/aggmoread/sdk/z/b/a/a$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/aggmoread/sdk/z/b/a/a$a;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public f()Z
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/b/a/a;->c:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
