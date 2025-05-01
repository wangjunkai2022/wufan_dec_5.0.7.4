.class public final Lcom/kwad/sdk/components/a/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static BH()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/core/f/a;

    invoke-direct {v0}, Lcom/kwad/components/core/f/a;-><init>()V

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/components/a;->getComponentsType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/kwad/sdk/components/c;->a(Ljava/lang/Class;Lcom/kwad/sdk/components/a;)V

    .line 3
    new-instance v0, Lcom/kwad/components/core/f/b;

    invoke-direct {v0}, Lcom/kwad/components/core/f/b;-><init>()V

    .line 4
    invoke-interface {v0}, Lcom/kwad/sdk/components/a;->getComponentsType()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/kwad/sdk/components/c;->a(Ljava/lang/Class;Lcom/kwad/sdk/components/a;)V

    return-void
.end method
