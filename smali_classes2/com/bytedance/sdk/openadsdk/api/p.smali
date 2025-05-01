.class public Lcom/bytedance/sdk/openadsdk/api/p;
.super Ljava/lang/Object;


# static fields
.field private static m:I = 0x4

.field private static vv:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public static varargs m(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    sget-boolean p0, Lcom/bytedance/sdk/openadsdk/api/p;->vv:Z

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 2
    :cond_1
    sget p0, Lcom/bytedance/sdk/openadsdk/api/p;->m:I

    const/4 v0, 0x5

    if-gt p0, v0, :cond_2

    .line 3
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/p;->vv([Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public static o(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method private static varargs vv([Ljava/lang/Object;)Ljava/lang/String;
    .locals 4

    if-eqz p0, :cond_3

    .line 9
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_2

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    if-eqz v3, :cond_1

    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v3, " null "

    .line 13
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v3, " "

    .line 14
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_2
    const-string p0, ""

    return-object p0
.end method

.method public static vv()V
    .locals 1

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/bytedance/sdk/openadsdk/api/p;->vv:Z

    const/4 v0, 0x3

    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/api/p;->vv(I)V

    return-void
.end method

.method public static vv(I)V
    .locals 0

    .line 1
    sput p0, Lcom/bytedance/sdk/openadsdk/api/p;->m:I

    return-void
.end method

.method public static vv(Ljava/lang/String;)V
    .locals 1

    .line 7
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/api/p;->vv:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "TTLogger"

    .line 8
    invoke-static {v0, p0}, Lcom/bytedance/sdk/openadsdk/api/p;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static vv(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static vv(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public static varargs vv(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 4
    sget-boolean p0, Lcom/bytedance/sdk/openadsdk/api/p;->vv:Z

    if-nez p0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    return-void

    .line 5
    :cond_1
    sget p0, Lcom/bytedance/sdk/openadsdk/api/p;->m:I

    const/4 v0, 0x3

    if-gt p0, v0, :cond_2

    .line 6
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/api/p;->vv([Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    return-void
.end method
