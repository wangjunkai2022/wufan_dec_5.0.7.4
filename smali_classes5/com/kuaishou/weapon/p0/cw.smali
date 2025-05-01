.class public Lcom/kuaishou/weapon/p0/cw;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kuaishou/weapon/p0/cw;->a:Landroid/content/Context;

    return-void
.end method

.method private b(Ljava/lang/String;)Lcom/kuaishou/weapon/p0/y;
    .locals 20

    const-string v0, "ie"

    const-string v1, "n"

    const-string v2, "btm"

    const-string v3, "ic"

    const-string v4, "w"

    const-string v5, "d"

    const-string v6, "p"

    const-string v7, "c"

    const-string v8, "r"

    const-string v9, "ac"

    const-string v10, "a"

    const-string v11, "mc"

    const-string v12, "is"

    .line 1
    :try_start_0
    new-instance v14, Lcom/kuaishou/weapon/p0/y;

    invoke-direct {v14}, Lcom/kuaishou/weapon/p0/y;-><init>()V

    .line 2
    new-instance v15, Lorg/json/JSONObject;

    move-object/from16 v13, p1

    invoke-direct {v15, v13}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v13, "status"

    move-object/from16 v16, v6

    const/4 v6, 0x1

    .line 3
    invoke-virtual {v15, v13, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v13

    invoke-virtual {v14, v13}, Lcom/kuaishou/weapon/p0/y;->e(I)V

    .line 4
    invoke-virtual {v14}, Lcom/kuaishou/weapon/p0/y;->z()I

    move-result v13

    if-eq v13, v6, :cond_0

    const/4 v13, 0x0

    return-object v13

    :cond_0
    const-string v13, "bwc"

    const/4 v6, 0x0

    .line 5
    invoke-virtual {v15, v13, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v13

    invoke-virtual {v14, v13}, Lcom/kuaishou/weapon/p0/y;->f(I)V

    const-string v13, "blpc"

    const/4 v6, 0x1

    .line 6
    invoke-virtual {v15, v13, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v13

    invoke-virtual {v14, v13}, Lcom/kuaishou/weapon/p0/y;->g(I)V

    const-string v6, "scc"

    const/4 v13, 0x0

    .line 7
    invoke-virtual {v15, v6, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v14, v6}, Lcom/kuaishou/weapon/p0/y;->h(I)V

    const-string v6, "dpver"

    .line 8
    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Lcom/kuaishou/weapon/p0/y;->j(Ljava/lang/String;)V

    const-string v6, "bver"

    .line 9
    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Lcom/kuaishou/weapon/p0/y;->k(Ljava/lang/String;)V

    const-string v6, "dpd"

    const/16 v13, 0xc

    .line 10
    invoke-virtual {v15, v6, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v14, v6}, Lcom/kuaishou/weapon/p0/y;->d(I)V

    const-string v6, "aar"

    const/16 v13, 0x1e

    .line 11
    invoke-virtual {v15, v6, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v14, v6}, Lcom/kuaishou/weapon/p0/y;->b(I)V

    const-string v6, "dir"

    .line 12
    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Lcom/kuaishou/weapon/p0/y;->e(Ljava/lang/String;)V

    .line 13
    invoke-virtual {v15, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Lcom/kuaishou/weapon/p0/y;->f(Ljava/lang/String;)V

    const-string v6, "ii"

    .line 14
    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v14, v6}, Lcom/kuaishou/weapon/p0/y;->a(I)V

    const-string v6, "act"

    const/4 v13, 0x0

    .line 15
    invoke-virtual {v15, v6, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v14, v6}, Lcom/kuaishou/weapon/p0/y;->c(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_11

    :try_start_1
    const-string v6, "aver"

    .line 16
    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v14, v6}, Lcom/kuaishou/weapon/p0/y;->h(Ljava/lang/String;)V

    .line 17
    invoke-virtual {v15, v10}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 18
    new-instance v13, Lcom/kuaishou/weapon/p0/y$a;

    invoke-direct {v13}, Lcom/kuaishou/weapon/p0/y$a;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v18, v2

    :try_start_2
    const-string v2, "as"
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-object/from16 v19, v3

    const/4 v3, 0x0

    .line 19
    :try_start_3
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$a;->c(I)V

    const/4 v2, 0x3

    .line 20
    invoke-virtual {v6, v9, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v13, v3}, Lcom/kuaishou/weapon/p0/y$a;->d(I)V

    const-string v2, "ai"

    const/16 v3, 0x8

    .line 21
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$a;->e(I)V

    const-string v2, "ab"

    const/4 v3, 0x0

    .line 22
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$a;->b(I)V

    const-string v2, "am"

    .line 23
    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$a;->a(I)V

    .line 24
    invoke-virtual {v14, v13}, Lcom/kuaishou/weapon/p0/y;->a(Lcom/kuaishou/weapon/p0/y$a;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_0

    :catch_0
    :cond_1
    move-object/from16 v18, v2

    :catch_1
    move-object/from16 v19, v3

    :catch_2
    :goto_0
    :try_start_4
    const-string v2, "acver"

    .line 25
    invoke-virtual {v15, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Lcom/kuaishou/weapon/p0/y;->b(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v15, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 27
    new-instance v3, Lcom/kuaishou/weapon/p0/y$b;

    invoke-direct {v3}, Lcom/kuaishou/weapon/p0/y$b;-><init>()V

    const-string v6, "acs"

    const/4 v9, 0x1

    .line 28
    invoke-virtual {v2, v6, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/kuaishou/weapon/p0/y$b;->a(I)V

    const-string v6, "acc"

    const/4 v9, 0x3

    .line 29
    invoke-virtual {v2, v6, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v3, v6}, Lcom/kuaishou/weapon/p0/y$b;->b(I)V

    const-string v6, "aci"

    const/16 v9, 0x8

    .line 30
    invoke-virtual {v2, v6, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v3, v2}, Lcom/kuaishou/weapon/p0/y$b;->c(I)V

    .line 31
    invoke-virtual {v14, v3}, Lcom/kuaishou/weapon/p0/y;->a(Lcom/kuaishou/weapon/p0/y$b;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_2
    :try_start_5
    const-string v2, "rver"

    .line 32
    invoke-virtual {v15, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Lcom/kuaishou/weapon/p0/y;->a(Ljava/lang/String;)V

    .line 33
    new-instance v2, Lcom/kuaishou/weapon/p0/y$g;

    invoke-direct {v2}, Lcom/kuaishou/weapon/p0/y$g;-><init>()V

    .line 34
    invoke-virtual {v15, v8}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_3

    const-string v6, "rs"

    const/4 v9, 0x1

    .line 35
    invoke-virtual {v3, v6, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v2, v6}, Lcom/kuaishou/weapon/p0/y$g;->b(I)V

    const-string v6, "rc"

    const/4 v9, 0x6

    .line 36
    invoke-virtual {v3, v6, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v2, v6}, Lcom/kuaishou/weapon/p0/y$g;->c(I)V

    const-string v6, "ri"

    const/4 v9, 0x4

    .line 37
    invoke-virtual {v3, v6, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v2, v6}, Lcom/kuaishou/weapon/p0/y$g;->d(I)V

    const-string v6, "ro"

    const/4 v9, 0x5

    .line 38
    invoke-virtual {v3, v6, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v2, v6}, Lcom/kuaishou/weapon/p0/y$g;->e(I)V

    const-string v6, "rb"

    const/4 v9, 0x0

    .line 39
    invoke-virtual {v3, v6, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v6

    invoke-virtual {v2, v6}, Lcom/kuaishou/weapon/p0/y$g;->a(I)V

    const-string v6, "rcl"

    .line 40
    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    .line 41
    new-instance v6, Lcom/kuaishou/weapon/p0/y$g$a;

    invoke-direct {v6}, Lcom/kuaishou/weapon/p0/y$g$a;-><init>()V

    const-string v9, "da"

    const/4 v13, 0x1

    .line 42
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->l(I)V

    const-string v9, "em"

    .line 43
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->b(I)V

    const-string v9, "li"

    .line 44
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->m(I)V

    const-string v9, "rcd"

    .line 45
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->f(I)V

    const-string v9, "dv"

    .line 46
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->g(I)V

    const-string v9, "re"

    .line 47
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->h(I)V

    const-string v9, "fr"

    .line 48
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->c(I)V

    const-string v9, "hk"

    const/4 v13, 0x0

    .line 49
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->a(I)V

    const-string v9, "vp"

    .line 50
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->k(I)V

    .line 51
    invoke-virtual {v3, v11, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->i(I)V

    const-string v9, "sc"

    const/4 v13, 0x1

    .line 52
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->e(I)V

    const-string v9, "ud"

    .line 53
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->d(I)V

    const-string v9, "xp"

    .line 54
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$g$a;->j(I)V

    const-string v9, "vl"

    const/4 v13, 0x0

    .line 55
    invoke-virtual {v3, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v6, v3}, Lcom/kuaishou/weapon/p0/y$g$a;->n(I)V

    .line 56
    invoke-virtual {v2, v6}, Lcom/kuaishou/weapon/p0/y$g;->a(Lcom/kuaishou/weapon/p0/y$g$a;)V

    .line 57
    invoke-virtual {v14, v2}, Lcom/kuaishou/weapon/p0/y;->a(Lcom/kuaishou/weapon/p0/y$g;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    :catch_4
    :cond_3
    const/4 v2, 0x2

    .line 58
    :try_start_6
    new-instance v3, Lcom/kuaishou/weapon/p0/y$c;

    invoke-direct {v3}, Lcom/kuaishou/weapon/p0/y$c;-><init>()V

    const-string v6, "b"

    .line 59
    invoke-virtual {v15, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v9, "bc"

    .line 60
    invoke-virtual {v6, v9, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v3, v9}, Lcom/kuaishou/weapon/p0/y$c;->b(I)V

    const-string v9, "bi"

    const/16 v13, 0xc

    .line 61
    invoke-virtual {v6, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v3, v9}, Lcom/kuaishou/weapon/p0/y$c;->c(I)V

    const-string v9, "bs"

    const/4 v13, 0x1

    .line 62
    invoke-virtual {v6, v9, v13}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v3, v9}, Lcom/kuaishou/weapon/p0/y$c;->a(I)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_9

    :try_start_7
    const-string v9, "pry"

    .line 63
    invoke-virtual {v6, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v9

    .line 64
    new-instance v13, Lcom/kuaishou/weapon/p0/y$c$b;

    invoke-direct {v13}, Lcom/kuaishou/weapon/p0/y$c$b;-><init>()V

    const-string v2, "gifa"
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    move-object/from16 v17, v15

    const/4 v15, 0x1

    .line 65
    :try_start_8
    invoke-virtual {v9, v2, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$c$b;->e(I)V

    const-string v2, "gnci"

    .line 66
    invoke-virtual {v9, v2, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$c$b;->d(I)V

    const-string v2, "gsl"

    .line 67
    invoke-virtual {v9, v2, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$c$b;->f(I)V

    const-string v2, "gso"

    .line 68
    invoke-virtual {v9, v2, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$c$b;->c(I)V

    const-string v2, "gno"

    .line 69
    invoke-virtual {v9, v2, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$c$b;->a(I)V

    const-string v2, "gnon"

    .line 70
    invoke-virtual {v9, v2, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$c$b;->b(I)V

    const-string v2, "rl"

    .line 71
    invoke-virtual {v9, v2, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$c$b;->g(I)V

    const-string v2, "grs"

    .line 72
    invoke-virtual {v9, v2, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$c$b;->i(I)V

    const-string v2, "grt"

    .line 73
    invoke-virtual {v9, v2, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v13, v2}, Lcom/kuaishou/weapon/p0/y$c$b;->h(I)V

    .line 74
    invoke-virtual {v3, v13}, Lcom/kuaishou/weapon/p0/y$c;->a(Lcom/kuaishou/weapon/p0/y$c$b;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    goto :goto_1

    :catch_5
    move-object/from16 v17, v15

    :catch_6
    :goto_1
    :try_start_9
    const-string v2, "bcl"

    .line 75
    invoke-virtual {v6, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 76
    new-instance v6, Lcom/kuaishou/weapon/p0/y$c$a;

    invoke-direct {v6}, Lcom/kuaishou/weapon/p0/y$c$a;-><init>()V

    const/4 v9, 0x1

    .line 77
    invoke-virtual {v2, v10, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v10

    invoke-virtual {v6, v10}, Lcom/kuaishou/weapon/p0/y$c$a;->a(I)V

    .line 78
    invoke-virtual {v2, v8, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    invoke-virtual {v6, v8}, Lcom/kuaishou/weapon/p0/y$c$a;->i(I)V

    .line 79
    invoke-virtual {v2, v7, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    invoke-virtual {v6, v8}, Lcom/kuaishou/weapon/p0/y$c$a;->b(I)V

    const-string v8, "s"

    .line 80
    invoke-virtual {v2, v8, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    invoke-virtual {v6, v8}, Lcom/kuaishou/weapon/p0/y$c$a;->j(I)V

    .line 81
    invoke-virtual {v2, v5, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    invoke-virtual {v6, v8}, Lcom/kuaishou/weapon/p0/y$c$a;->d(I)V

    const-string v8, "u"

    .line 82
    invoke-virtual {v2, v8, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v8

    invoke-virtual {v6, v8}, Lcom/kuaishou/weapon/p0/y$c$a;->k(I)V

    const/4 v8, 0x0

    .line 83
    invoke-virtual {v2, v4, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$c$a;->m(I)V

    .line 84
    invoke-virtual {v2, v1, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$c$a;->f(I)V

    const/4 v8, 0x1

    .line 85
    invoke-virtual {v2, v0, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$c$a;->p(I)V

    const/4 v8, 0x0

    .line 86
    invoke-virtual {v2, v12, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v9

    invoke-virtual {v6, v9}, Lcom/kuaishou/weapon/p0/y$c$a;->e(I)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_a

    move-object/from16 v8, v19

    const/4 v9, 0x1

    .line 87
    :try_start_a
    invoke-virtual {v2, v8, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v10

    invoke-virtual {v6, v10}, Lcom/kuaishou/weapon/p0/y$c$a;->n(I)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_8

    move-object/from16 v10, v18

    .line 88
    :try_start_b
    invoke-virtual {v2, v10, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v13

    invoke-virtual {v6, v13}, Lcom/kuaishou/weapon/p0/y$c$a;->o(I)V

    .line 89
    invoke-virtual {v2, v11, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v13

    invoke-virtual {v6, v13}, Lcom/kuaishou/weapon/p0/y$c$a;->l(I)V

    const-string v13, "rp"

    .line 90
    invoke-virtual {v2, v13, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v13

    invoke-virtual {v6, v13}, Lcom/kuaishou/weapon/p0/y$c$a;->q(I)V

    const-string v13, "tc"

    .line 91
    invoke-virtual {v2, v13, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v13

    invoke-virtual {v6, v13}, Lcom/kuaishou/weapon/p0/y$c$a;->g(I)V

    const-string v13, "il"

    .line 92
    invoke-virtual {v2, v13, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v13

    invoke-virtual {v6, v13}, Lcom/kuaishou/weapon/p0/y$c$a;->c(I)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_7

    move-object/from16 v13, v16

    .line 93
    :try_start_c
    invoke-virtual {v2, v13, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v15

    invoke-virtual {v6, v15}, Lcom/kuaishou/weapon/p0/y$c$a;->h(I)V

    const-string v15, "l"

    .line 94
    invoke-virtual {v2, v15, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v6, v2}, Lcom/kuaishou/weapon/p0/y$c$a;->r(I)V

    .line 95
    invoke-virtual {v3, v6}, Lcom/kuaishou/weapon/p0/y$c;->a(Lcom/kuaishou/weapon/p0/y$c$a;)V

    .line 96
    invoke-virtual {v14, v3}, Lcom/kuaishou/weapon/p0/y;->a(Lcom/kuaishou/weapon/p0/y$c;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_b

    goto :goto_2

    :catch_7
    move-object/from16 v13, v16

    goto :goto_2

    :catch_8
    move-object/from16 v13, v16

    move-object/from16 v10, v18

    goto :goto_2

    :catch_9
    move-object/from16 v17, v15

    :catch_a
    move-object/from16 v13, v16

    move-object/from16 v10, v18

    move-object/from16 v8, v19

    :catch_b
    :goto_2
    :try_start_d
    const-string v2, "cver"
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_c

    move-object/from16 v3, v17

    .line 97
    :try_start_e
    invoke-virtual {v3, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v2}, Lcom/kuaishou/weapon/p0/y;->g(Ljava/lang/String;)V

    .line 98
    new-instance v2, Lcom/kuaishou/weapon/p0/y$d;

    invoke-direct {v2}, Lcom/kuaishou/weapon/p0/y$d;-><init>()V

    .line 99
    invoke-virtual {v3, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    const-string v7, "cc"

    const/4 v9, 0x2

    .line 100
    invoke-virtual {v6, v7, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v2, v7}, Lcom/kuaishou/weapon/p0/y$d;->b(I)V

    const-string v7, "ci"

    const/16 v9, 0xc

    .line 101
    invoke-virtual {v6, v7, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v2, v7}, Lcom/kuaishou/weapon/p0/y$d;->c(I)V

    const-string v7, "cs"

    const/4 v9, 0x1

    .line 102
    invoke-virtual {v6, v7, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v2, v7}, Lcom/kuaishou/weapon/p0/y$d;->a(I)V

    const-string v7, "cb"

    const/4 v9, 0x0

    .line 103
    invoke-virtual {v6, v7, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    invoke-virtual {v2, v7}, Lcom/kuaishou/weapon/p0/y$d;->d(I)V

    const-string v7, "ccl"

    .line 104
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 105
    new-instance v7, Lcom/kuaishou/weapon/p0/y$d$a;

    invoke-direct {v7}, Lcom/kuaishou/weapon/p0/y$d$a;-><init>()V

    const/4 v9, 0x1

    .line 106
    invoke-virtual {v6, v5, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v7, v5}, Lcom/kuaishou/weapon/p0/y$d$a;->a(I)V

    .line 107
    invoke-virtual {v6, v11, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v7, v5}, Lcom/kuaishou/weapon/p0/y$d$a;->b(I)V

    const/4 v5, 0x0

    .line 108
    invoke-virtual {v6, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v7, v4}, Lcom/kuaishou/weapon/p0/y$d$a;->c(I)V

    const/4 v4, 0x1

    .line 109
    invoke-virtual {v6, v12, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v7, v5}, Lcom/kuaishou/weapon/p0/y$d$a;->d(I)V

    .line 110
    invoke-virtual {v6, v8, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v7, v5}, Lcom/kuaishou/weapon/p0/y$d$a;->e(I)V

    .line 111
    invoke-virtual {v6, v10, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v7, v5}, Lcom/kuaishou/weapon/p0/y$d$a;->f(I)V

    .line 112
    invoke-virtual {v6, v0, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/kuaishou/weapon/p0/y$d$a;->g(I)V

    const/4 v0, 0x0

    .line 113
    invoke-virtual {v6, v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v7, v1}, Lcom/kuaishou/weapon/p0/y$d$a;->h(I)V

    .line 114
    invoke-virtual {v2, v7}, Lcom/kuaishou/weapon/p0/y$d;->a(Lcom/kuaishou/weapon/p0/y$d$a;)V

    .line 115
    invoke-virtual {v14, v2}, Lcom/kuaishou/weapon/p0/y;->a(Lcom/kuaishou/weapon/p0/y$d;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_d

    goto :goto_3

    :catch_c
    move-object/from16 v3, v17

    :catch_d
    :goto_3
    :try_start_f
    const-string v0, "pgver"

    .line 116
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/kuaishou/weapon/p0/y;->i(Ljava/lang/String;)V

    .line 117
    invoke-virtual {v3, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 118
    new-instance v1, Lcom/kuaishou/weapon/p0/y$f;

    invoke-direct {v1}, Lcom/kuaishou/weapon/p0/y$f;-><init>()V

    const-string v2, "ps"

    const/4 v4, 0x1

    .line 119
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/y$f;->a(I)V

    const-string v2, "pc"

    const/4 v4, 0x2

    .line 120
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/y$f;->b(I)V

    const-string v2, "pi"

    const/16 v4, 0xc

    .line 121
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/y$f;->c(I)V

    const-string v2, "pcl"

    .line 122
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 123
    new-instance v2, Lcom/kuaishou/weapon/p0/y$f$a;

    invoke-direct {v2}, Lcom/kuaishou/weapon/p0/y$f$a;-><init>()V

    const-string v4, "cp"

    const/4 v5, 0x1

    .line 124
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/kuaishou/weapon/p0/y$f$a;->d(I)V

    const-string v4, "gc"

    .line 125
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/kuaishou/weapon/p0/y$f$a;->c(I)V

    const-string v4, "pke"

    .line 126
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/kuaishou/weapon/p0/y$f$a;->b(I)V

    const-string v4, "pds"

    .line 127
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/kuaishou/weapon/p0/y$f$a;->e(I)V

    const-string v4, "pam"

    .line 128
    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/kuaishou/weapon/p0/y$f$a;->a(I)V

    .line 129
    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/y$f;->a(Lcom/kuaishou/weapon/p0/y$f$a;)V

    .line 130
    :cond_4
    invoke-virtual {v14, v1}, Lcom/kuaishou/weapon/p0/y;->a(Lcom/kuaishou/weapon/p0/y$f;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_e

    :catch_e
    :cond_5
    :try_start_10
    const-string v0, "socver"

    .line 131
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/kuaishou/weapon/p0/y;->m(Ljava/lang/String;)V

    const-string v0, "soc"

    .line 132
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 133
    new-instance v1, Lcom/kuaishou/weapon/p0/y$h;

    invoke-direct {v1}, Lcom/kuaishou/weapon/p0/y$h;-><init>()V

    const-string v2, "socs"

    const/4 v4, 0x0

    .line 134
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/y$h;->c(I)V

    const-string v2, "socc"

    const/4 v4, 0x2

    .line 135
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/y$h;->d(I)V

    const-string v2, "soci"

    const/16 v4, 0xc

    .line 136
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/y$h;->b(I)V

    const-string v2, "snack"

    const/4 v4, 0x0

    .line 137
    invoke-virtual {v0, v2, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/kuaishou/weapon/p0/y$h;->a(I)V

    .line 138
    invoke-virtual {v14, v1}, Lcom/kuaishou/weapon/p0/y;->a(Lcom/kuaishou/weapon/p0/y$h;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_f

    :catch_f
    :cond_6
    :try_start_11
    const-string v0, "hver"

    .line 139
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Lcom/kuaishou/weapon/p0/y;->d(Ljava/lang/String;)V

    const-string v0, "h"

    .line 140
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 141
    new-instance v1, Lcom/kuaishou/weapon/p0/y$e;

    invoke-direct {v1}, Lcom/kuaishou/weapon/p0/y$e;-><init>()V

    const-string v2, "hs"

    const/4 v3, 0x1

    .line 142
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/y$e;->b(I)V

    const-string v2, "hc"

    const/4 v3, 0x2

    .line 143
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/y$e;->c(I)V

    const-string v2, "hi"

    const/16 v3, 0xc

    .line 144
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/y$e;->a(I)V

    const-string v2, "hsdc"

    const/4 v3, 0x1

    .line 145
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/y$e;->d(I)V

    const-string v2, "hlbr"

    .line 146
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kuaishou/weapon/p0/y$e;->e(I)V

    const-string v2, "pr"

    .line 147
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kuaishou/weapon/p0/y$e;->a(Ljava/lang/String;)V

    .line 148
    invoke-virtual {v14, v1}, Lcom/kuaishou/weapon/p0/y;->a(Lcom/kuaishou/weapon/p0/y$e;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_10

    :catch_10
    :cond_7
    return-object v14

    :catch_11
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v1, "result"

    const/4 v2, 0x0

    .line 2
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    const-string v1, "antispamPluginRsp"

    .line 3
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Lcom/kuaishou/weapon/p0/bn;

    iget-object v2, p0, Lcom/kuaishou/weapon/p0/cw;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/kuaishou/weapon/p0/bn;-><init>(Landroid/content/Context;)V

    .line 5
    invoke-virtual {v1, v0}, Lcom/kuaishou/weapon/p0/bn;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-direct {p0, v0}, Lcom/kuaishou/weapon/p0/cw;->b(Ljava/lang/String;)Lcom/kuaishou/weapon/p0/y;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 8
    iget-object v1, p0, Lcom/kuaishou/weapon/p0/cw;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/kuaishou/weapon/p0/df;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/df;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Lcom/kuaishou/weapon/p0/df;->a(Ljava/lang/String;Lcom/kuaishou/weapon/p0/y;)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/kuaishou/weapon/p0/cw;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/kuaishou/weapon/p0/df;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/df;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/kuaishou/weapon/p0/df;->b(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method

.method public run()V
    .locals 5

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/kuaishou/weapon/p0/cu;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v1, Lcom/kuaishou/weapon/p0/cu;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lcom/kuaishou/weapon/p0/cw;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/kuaishou/weapon/p0/cv;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "?"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 5
    :cond_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 6
    iget-object v2, p0, Lcom/kuaishou/weapon/p0/cw;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/kuaishou/weapon/p0/cv;->b(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 7
    new-instance v3, Lcom/kuaishou/weapon/p0/bn;

    iget-object v4, p0, Lcom/kuaishou/weapon/p0/cw;->a:Landroid/content/Context;

    invoke-direct {v3, v4}, Lcom/kuaishou/weapon/p0/bn;-><init>(Landroid/content/Context;)V

    .line 8
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lcom/kuaishou/weapon/p0/bn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "data"

    .line 9
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    :cond_1
    iget-object v2, p0, Lcom/kuaishou/weapon/p0/cw;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/kuaishou/weapon/p0/l;->a(Landroid/content/Context;)Lcom/kuaishou/weapon/p0/l;

    move-result-object v2

    .line 11
    new-instance v3, Lcom/kuaishou/weapon/p0/m;

    invoke-direct {v3, v0, v1}, Lcom/kuaishou/weapon/p0/m;-><init>(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 12
    sget-object v0, Lcom/kuaishou/weapon/p0/WeaponHI;->cookieData:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/kuaishou/weapon/p0/m;->a(Ljava/lang/String;)V

    .line 13
    sget-object v0, Lcom/kuaishou/weapon/p0/WeaponHI;->encryENV:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/kuaishou/weapon/p0/m;->b(Ljava/lang/String;)V

    .line 14
    new-instance v0, Lcom/kuaishou/weapon/p0/cw$1;

    invoke-direct {v0, p0}, Lcom/kuaishou/weapon/p0/cw$1;-><init>(Lcom/kuaishou/weapon/p0/cw;)V

    invoke-virtual {v2, v3, v0}, Lcom/kuaishou/weapon/p0/l;->b(Lcom/kuaishou/weapon/p0/m;Lcom/kuaishou/weapon/p0/j;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
