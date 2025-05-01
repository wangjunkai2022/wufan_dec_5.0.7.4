.class public final Lcom/kwad/sdk/api/loader/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/api/loader/k$a;
    }
.end annotation


# static fields
.field public static anM:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private static a(ILcom/kwad/sdk/api/loader/a$a;JILjava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 6
    :cond_0
    :try_start_0
    new-instance v0, Lcom/kwad/sdk/api/loader/k$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/kwad/sdk/api/loader/k$a;-><init>(B)V

    .line 7
    invoke-static {v0, p0}, Lcom/kwad/sdk/api/loader/k$a;->a(Lcom/kwad/sdk/api/loader/k$a;I)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    sget v0, Lcom/kwad/sdk/api/loader/k;->anM:I

    .line 8
    invoke-static {p0, v0}, Lcom/kwad/sdk/api/loader/k$a;->b(Lcom/kwad/sdk/api/loader/k$a;I)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    iget-object v0, p1, Lcom/kwad/sdk/api/loader/a$a;->sdkVersion:Ljava/lang/String;

    .line 9
    invoke-static {p0, v0}, Lcom/kwad/sdk/api/loader/k$a;->a(Lcom/kwad/sdk/api/loader/k$a;Ljava/lang/String;)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    iget-object p1, p1, Lcom/kwad/sdk/api/loader/a$a;->amZ:Ljava/lang/String;

    .line 10
    invoke-static {p0, p1}, Lcom/kwad/sdk/api/loader/k$a;->b(Lcom/kwad/sdk/api/loader/k$a;Ljava/lang/String;)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    .line 11
    invoke-static {p0, p2, p3}, Lcom/kwad/sdk/api/loader/k$a;->a(Lcom/kwad/sdk/api/loader/k$a;J)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    .line 12
    invoke-static {p0, p4}, Lcom/kwad/sdk/api/loader/k$a;->c(Lcom/kwad/sdk/api/loader/k$a;I)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    .line 13
    invoke-static {p0, p5}, Lcom/kwad/sdk/api/loader/k$a;->c(Lcom/kwad/sdk/api/loader/k$a;Ljava/lang/String;)Lcom/kwad/sdk/api/loader/k$a;

    move-result-object p0

    .line 14
    invoke-static {p0}, Lcom/kwad/sdk/api/loader/k$a;->a(Lcom/kwad/sdk/api/loader/k$a;)Lorg/json/JSONObject;

    move-result-object p0

    .line 15
    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    const-string p1, "reportDynamicUpdate"

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    aput-object p0, p2, v1

    .line 16
    invoke-static {p1, p2}, Lcom/kwad/sdk/api/c;->f(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Lcom/kwad/sdk/api/loader/a$a;)V
    .locals 7

    .line 1
    sget v0, Lcom/kwad/sdk/api/loader/k;->anM:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/kwad/sdk/api/loader/k;->anM:I

    const/4 v1, 0x1

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const-string v6, ""

    move-object v2, p0

    .line 2
    invoke-static/range {v1 .. v6}, Lcom/kwad/sdk/api/loader/k;->a(ILcom/kwad/sdk/api/loader/a$a;JILjava/lang/String;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/api/loader/a$a;ILjava/lang/String;)V
    .locals 6

    const/4 v0, 0x4

    const-wide/16 v2, 0x0

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    .line 5
    invoke-static/range {v0 .. v5}, Lcom/kwad/sdk/api/loader/k;->a(ILcom/kwad/sdk/api/loader/a$a;JILjava/lang/String;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/api/loader/a$a;J)V
    .locals 6

    const/4 v0, 0x2

    const/4 v4, 0x0

    const-string v5, ""

    move-object v1, p0

    move-wide v2, p1

    .line 3
    invoke-static/range {v0 .. v5}, Lcom/kwad/sdk/api/loader/k;->a(ILcom/kwad/sdk/api/loader/a$a;JILjava/lang/String;)V

    return-void
.end method

.method public static a(Lcom/kwad/sdk/api/loader/a$a;JLjava/lang/String;)V
    .locals 6

    const/4 v0, 0x3

    const/4 v4, 0x0

    move-object v1, p0

    move-wide v2, p1

    move-object v5, p3

    .line 4
    invoke-static/range {v0 .. v5}, Lcom/kwad/sdk/api/loader/k;->a(ILcom/kwad/sdk/api/loader/a$a;JILjava/lang/String;)V

    return-void
.end method

.method public static b(Lcom/kwad/sdk/api/loader/a$a;)V
    .locals 6

    const/4 v0, 0x5

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const-string v5, ""

    move-object v1, p0

    .line 1
    invoke-static/range {v0 .. v5}, Lcom/kwad/sdk/api/loader/k;->a(ILcom/kwad/sdk/api/loader/a$a;JILjava/lang/String;)V

    return-void
.end method

.method public static b(Lcom/kwad/sdk/api/loader/a$a;ILjava/lang/String;)V
    .locals 6

    const/4 v0, 0x7

    const-wide/16 v2, 0x0

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    .line 3
    invoke-static/range {v0 .. v5}, Lcom/kwad/sdk/api/loader/k;->a(ILcom/kwad/sdk/api/loader/a$a;JILjava/lang/String;)V

    return-void
.end method

.method public static b(Lcom/kwad/sdk/api/loader/a$a;J)V
    .locals 6

    const/4 v0, 0x6

    const/4 v4, 0x0

    const-string v5, ""

    move-object v1, p0

    move-wide v2, p1

    .line 2
    invoke-static/range {v0 .. v5}, Lcom/kwad/sdk/api/loader/k;->a(ILcom/kwad/sdk/api/loader/a$a;JILjava/lang/String;)V

    return-void
.end method
