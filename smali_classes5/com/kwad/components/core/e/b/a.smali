.class public final Lcom/kwad/components/core/e/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/e/b/a$a;
    }
.end annotation


# direct methods
.method public static ad(Ljava/lang/String;)J
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/components/core/e/b/a;->nM()Lcom/kwad/components/core/e/b/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/b/c;->ae(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method private static nM()Lcom/kwad/components/core/e/b/c;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/core/e/b/a$a;->nN()Lcom/kwad/components/core/e/b/c;

    move-result-object v0

    return-object v0
.end method

.method public static t(J)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/core/e/b/a;->nM()Lcom/kwad/components/core/e/b/c;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/kwad/components/core/e/b/c;->u(J)Ljava/lang/String;

    move-result-object p0

    const-string p1, "="

    .line 2
    invoke-virtual {p0, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    .line 3
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method
