.class Lcom/xinzhu/overmind/client/hook/proxies/context/a$a;
.super Lcom/xinzhu/overmind/client/hook/e;
.source "ContentServiceStub.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/client/hook/proxies/context/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/hook/e;-><init>()V

    return-void
.end method


# virtual methods
.method protected c()Ljava/lang/String;
    .locals 1

    const-string v0, "notifyChange"

    return-object v0
.end method

.method protected d(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    .line 1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v3, v4, :cond_0

    .line 2
    array-length v3, v2

    const/4 v4, 0x6

    if-lt v3, v4, :cond_0

    const/4 v3, 0x5

    const/16 v4, 0x16

    .line 3
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    :cond_0
    const/4 v3, 0x1

    .line 4
    aget-object v4, v2, v3

    check-cast v4, Landroid/database/IContentObserver;

    const/4 v5, 0x2

    .line 5
    aget-object v5, v2, v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    const/4 v5, 0x3

    .line 6
    aget-object v6, v2, v5

    instance-of v6, v6, Ljava/lang/Integer;

    const/4 v13, 0x0

    if-eqz v6, :cond_2

    .line 7
    aget-object v5, v2, v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    and-int/2addr v5, v3

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    goto :goto_0

    .line 8
    :cond_2
    aget-object v3, v2, v5

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 9
    :goto_0
    invoke-static {}, Lcom/xinzhu/overmind/utils/e;->g()Z

    move-result v5

    const/4 v14, 0x4

    if-eqz v5, :cond_5

    .line 10
    aget-object v5, v2, v13

    move-object v15, v5

    check-cast v15, [Landroid/net/Uri;

    .line 11
    array-length v11, v15

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v11, :cond_4

    aget-object v6, v15, v10

    .line 12
    invoke-static {v6}, Lcom/xinzhu/overmind/client/hook/proxies/context/a;->c(Landroid/net/Uri;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 13
    invoke-static {}, Lcom/xinzhu/overmind/client/frameworks/b;->a()Lcom/xinzhu/overmind/client/frameworks/b;

    move-result-object v5

    invoke-static {}, Lcom/xinzhu/overmind/server/user/MindUserHandle;->r()I

    move-result v16

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getVUid()I

    move-result v17

    move-object v7, v4

    move v8, v12

    move v9, v3

    move/from16 v18, v10

    move/from16 v10, v16

    move/from16 v16, v11

    move/from16 v11, v17

    invoke-virtual/range {v5 .. v11}, Lcom/xinzhu/overmind/client/frameworks/b;->c(Landroid/net/Uri;Landroid/database/IContentObserver;ZZII)V

    goto :goto_2

    :cond_3
    move/from16 v18, v10

    move/from16 v16, v11

    .line 14
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getHostUserId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v14

    .line 15
    invoke-static/range {p3 .. p3}, Lcom/xinzhu/overmind/utils/helpers/c;->e([Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    add-int/lit8 v10, v18, 0x1

    move/from16 v11, v16

    goto :goto_1

    .line 17
    :cond_4
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 18
    :cond_5
    aget-object v5, v2, v13

    move-object v6, v5

    check-cast v6, Landroid/net/Uri;

    .line 19
    invoke-static {v6}, Lcom/xinzhu/overmind/client/hook/proxies/context/a;->c(Landroid/net/Uri;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 20
    invoke-static {}, Lcom/xinzhu/overmind/client/frameworks/b;->a()Lcom/xinzhu/overmind/client/frameworks/b;

    move-result-object v5

    invoke-static {}, Lcom/xinzhu/overmind/server/user/MindUserHandle;->r()I

    move-result v10

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getVUid()I

    move-result v11

    move-object v7, v4

    move v8, v12

    move v9, v3

    invoke-virtual/range {v5 .. v11}, Lcom/xinzhu/overmind/client/frameworks/b;->c(Landroid/net/Uri;Landroid/database/IContentObserver;ZZII)V

    .line 21
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    .line 22
    :cond_6
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getHostUserId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v14

    .line 23
    invoke-static/range {p3 .. p3}, Lcom/xinzhu/overmind/utils/helpers/c;->e([Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
