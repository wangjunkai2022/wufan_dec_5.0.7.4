.class final Lcom/kwad/sdk/api/loader/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/api/loader/n$b;,
        Lcom/kwad/sdk/api/loader/n$h;,
        Lcom/kwad/sdk/api/loader/n$d;,
        Lcom/kwad/sdk/api/loader/n$g;,
        Lcom/kwad/sdk/api/loader/n$e;,
        Lcom/kwad/sdk/api/loader/n$a;,
        Lcom/kwad/sdk/api/loader/n$c;,
        Lcom/kwad/sdk/api/loader/n$f;
    }
.end annotation


# direct methods
.method static AS()Lcom/kwad/sdk/api/loader/n$f;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kwad/sdk/api/loader/n$f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/sdk/api/loader/n$e;

    new-instance v1, Lcom/kwad/sdk/api/loader/n$g;

    new-instance v2, Lcom/kwad/sdk/api/loader/n$d;

    new-instance v3, Lcom/kwad/sdk/api/loader/n$h;

    new-instance v4, Lcom/kwad/sdk/api/loader/n$b;

    invoke-direct {v4}, Lcom/kwad/sdk/api/loader/n$b;-><init>()V

    invoke-direct {v3, v4}, Lcom/kwad/sdk/api/loader/n$h;-><init>(Lcom/kwad/sdk/api/loader/n$f;)V

    invoke-direct {v2, v3}, Lcom/kwad/sdk/api/loader/n$d;-><init>(Lcom/kwad/sdk/api/loader/n$f;)V

    invoke-direct {v1, v2}, Lcom/kwad/sdk/api/loader/n$g;-><init>(Lcom/kwad/sdk/api/loader/n$f;)V

    invoke-direct {v0, v1}, Lcom/kwad/sdk/api/loader/n$e;-><init>(Lcom/kwad/sdk/api/loader/n$f;)V

    return-object v0
.end method
