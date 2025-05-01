.class public Lcom/mob/commons/SHARESDK;
.super Ljava/lang/Object;
.source "SHARESDK.java"

# interfaces
.implements Lcom/mob/commons/MobProduct;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private initBusiness()V
    .locals 4

    :try_start_0
    const-string v0, "cn.sharesdk.framework"

    .line 1
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "init"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    .line 2
    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->isAccessible()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Method;->setAccessible(Z)V

    :cond_0
    const/4 v1, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method


# virtual methods
.method public getProductTag()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/mob/commons/SHARESDK;->initBusiness()V

    const-string v0, "SHARESDK"

    return-object v0
.end method

.method public getSdkver()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/mob/commons/SHARESDK;->initBusiness()V

    .line 2
    sget v0, Lcn/sharesdk/framework/ShareSDK;->SDK_VERSION_CODE:I

    return v0
.end method
