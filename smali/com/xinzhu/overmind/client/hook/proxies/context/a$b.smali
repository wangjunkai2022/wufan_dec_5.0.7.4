.class public Lcom/xinzhu/overmind/client/hook/proxies/context/a$b;
.super Lcom/xinzhu/overmind/client/hook/e;
.source "ContentServiceStub.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xinzhu/overmind/client/hook/proxies/context/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xinzhu/overmind/client/hook/e;-><init>()V

    return-void
.end method


# virtual methods
.method protected c()Ljava/lang/String;
    .locals 1

    const-string v0, "registerContentObserver"

    return-object v0
.end method

.method protected d(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 2
    array-length v0, p3

    const/4 v1, 0x5

    if-lt v0, v1, :cond_0

    const/4 v0, 0x4

    const/16 v1, 0x16

    .line 3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p3, v0

    :cond_0
    const/4 v0, 0x0

    .line 4
    aget-object v1, p3, v0

    move-object v3, v1

    check-cast v3, Landroid/net/Uri;

    const/4 v1, 0x1

    .line 5
    aget-object v1, p3, v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v1, 0x2

    .line 6
    aget-object v1, p3, v1

    move-object v5, v1

    check-cast v5, Landroid/database/IContentObserver;

    .line 7
    invoke-static {v3}, Lcom/xinzhu/overmind/client/hook/proxies/context/a;->c(Landroid/net/Uri;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    invoke-static {}, Lcom/xinzhu/overmind/client/frameworks/b;->a()Lcom/xinzhu/overmind/client/frameworks/b;

    move-result-object v2

    invoke-static {}, Lcom/xinzhu/overmind/server/user/MindUserHandle;->r()I

    move-result v6

    invoke-static {}, Lcom/xinzhu/overmind/client/e;->getVUid()I

    move-result v7

    invoke-virtual/range {v2 .. v7}, Lcom/xinzhu/overmind/client/frameworks/b;->d(Landroid/net/Uri;ZLandroid/database/IContentObserver;II)V

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x3

    .line 10
    invoke-static {}, Lcom/xinzhu/overmind/Overmind;->getHostUserId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p3, v0

    .line 11
    invoke-virtual {p2, p1, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
