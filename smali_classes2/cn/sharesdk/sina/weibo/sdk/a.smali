.class public Lcn/sharesdk/sina/weibo/sdk/a;
.super Ljava/lang/Object;
.source "Utils.java"


# direct methods
.method public static a(II)Landroid/content/res/ColorStateList;
    .locals 6

    const/4 v0, 0x4

    new-array v1, v0, [I

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 v3, 0x1

    aput p1, v1, v3

    const/4 v4, 0x2

    aput p1, v1, v4

    const/4 p1, 0x3

    aput p0, v1, p1

    new-array p0, v0, [[I

    new-array v0, v3, [I

    const v5, 0x10100a7

    aput v5, v0, v2

    aput-object v0, p0, v2

    new-array v0, v3, [I

    const v5, 0x10100a1

    aput v5, v0, v2

    aput-object v0, p0, v3

    new-array v0, v3, [I

    const v3, 0x101009c

    aput v3, v0, v2

    aput-object v0, p0, v4

    .line 1
    sget-object v0, Landroid/util/StateSet;->WILD_CARD:[I

    aput-object v0, p0, p1

    .line 2
    new-instance p1, Landroid/content/res/ColorStateList;

    invoke-direct {p1, p0, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object p1
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcn/sharesdk/framework/ShareSDKCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcn/sharesdk/framework/ShareSDKCallback<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-static {p0}, Lcom/mob/tools/utils/DH;->requester(Landroid/content/Context;)Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object p0

    const/4 v0, 0x1

    const/16 v1, 0x40

    .line 4
    invoke-virtual {p0, v0, p1, v1}, Lcom/mob/tools/utils/DH$RequestBuilder;->getPInfoForce(ZLjava/lang/String;I)Lcom/mob/tools/utils/DH$RequestBuilder;

    move-result-object p0

    new-instance p1, Lcn/sharesdk/sina/weibo/sdk/a$1;

    invoke-direct {p1, p2}, Lcn/sharesdk/sina/weibo/sdk/a$1;-><init>(Lcn/sharesdk/framework/ShareSDKCallback;)V

    .line 5
    invoke-virtual {p0, p1}, Lcom/mob/tools/utils/DH$RequestBuilder;->request(Lcom/mob/tools/utils/DH$DHResponder;)V

    return-void
.end method

.method public static a([B)[B
    .locals 10

    const-string v0, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/="

    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 7
    array-length v1, p0

    add-int/lit8 v1, v1, 0x2

    div-int/lit8 v1, v1, 0x3

    mul-int/lit8 v1, v1, 0x4

    new-array v1, v1, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 8
    :goto_0
    array-length v5, p0

    if-ge v3, v5, :cond_4

    .line 9
    aget-byte v5, p0, v3

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x8

    add-int/lit8 v6, v3, 0x1

    .line 10
    array-length v7, p0

    const/4 v8, 0x1

    if-ge v6, v7, :cond_0

    .line 11
    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    or-int/2addr v5, v6

    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    shl-int/lit8 v5, v5, 0x8

    add-int/lit8 v7, v3, 0x2

    .line 12
    array-length v9, p0

    if-ge v7, v9, :cond_1

    .line 13
    aget-byte v7, p0, v7

    and-int/lit16 v7, v7, 0xff

    or-int/2addr v5, v7

    goto :goto_2

    :cond_1
    const/4 v8, 0x0

    :goto_2
    add-int/lit8 v7, v4, 0x3

    const/16 v9, 0x40

    if-eqz v8, :cond_2

    and-int/lit8 v8, v5, 0x3f

    goto :goto_3

    :cond_2
    const/16 v8, 0x40

    .line 14
    :goto_3
    aget-char v8, v0, v8

    int-to-byte v8, v8

    aput-byte v8, v1, v7

    shr-int/lit8 v5, v5, 0x6

    add-int/lit8 v7, v4, 0x2

    if-eqz v6, :cond_3

    and-int/lit8 v9, v5, 0x3f

    .line 15
    :cond_3
    aget-char v6, v0, v9

    int-to-byte v6, v6

    aput-byte v6, v1, v7

    shr-int/lit8 v5, v5, 0x6

    add-int/lit8 v6, v4, 0x1

    and-int/lit8 v7, v5, 0x3f

    .line 16
    aget-char v7, v0, v7

    int-to-byte v7, v7

    aput-byte v7, v1, v6

    shr-int/lit8 v5, v5, 0x6

    add-int/lit8 v6, v4, 0x0

    and-int/lit8 v5, v5, 0x3f

    .line 17
    aget-char v5, v0, v5

    int-to-byte v5, v5

    aput-byte v5, v1, v6

    add-int/lit8 v3, v3, 0x3

    add-int/lit8 v4, v4, 0x4

    goto :goto_0

    :cond_4
    return-object v1
.end method
