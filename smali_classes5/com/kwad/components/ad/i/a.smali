.class public final Lcom/kwad/components/ad/i/a;
.super Lcom/kwad/sdk/components/d;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/b/a/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/components/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final S()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/i/e;->eW()Lcom/kwad/components/ad/i/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/i/e;->S()Z

    move-result v0

    return v0
.end method

.method public final a(Lcom/kwad/components/ad/b/a/b;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/i/e;->eW()Lcom/kwad/components/ad/i/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/i/e;->a(Lcom/kwad/components/ad/b/a/b;)V

    return-void
.end method

.method public final b(Lcom/kwad/components/ad/b/a/b;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/i/e;->eW()Lcom/kwad/components/ad/i/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/i/e;->b(Lcom/kwad/components/ad/b/a/b;)V

    return-void
.end method

.method public final getComponentsType()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/kwad/components/ad/b/a/a;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/kwad/components/ad/b/a/a;

    return-object v0
.end method

.method public final init(Landroid/content/Context;)V
    .locals 0

    return-void
.end method
