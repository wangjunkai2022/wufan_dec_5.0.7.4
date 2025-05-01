.class final Lcom/kwad/components/core/proxy/h$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/f/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/proxy/h;->f(Lcom/kwad/components/core/proxy/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/kwad/sdk/f/a<",
        "Lcom/kwad/components/core/proxy/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic RE:Lcom/kwad/components/core/proxy/c;

.field final synthetic RG:Lcom/kwad/components/core/proxy/h;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/proxy/h;Lcom/kwad/components/core/proxy/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/proxy/h$3;->RG:Lcom/kwad/components/core/proxy/h;

    iput-object p2, p0, Lcom/kwad/components/core/proxy/h$3;->RE:Lcom/kwad/components/core/proxy/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private b(Lcom/kwad/components/core/proxy/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/proxy/h$3;->RE:Lcom/kwad/components/core/proxy/c;

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/proxy/i;->b(Lcom/kwad/components/core/proxy/c;)V

    return-void
.end method


# virtual methods
.method public final synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/core/proxy/i;

    invoke-direct {p0, p1}, Lcom/kwad/components/core/proxy/h$3;->b(Lcom/kwad/components/core/proxy/i;)V

    return-void
.end method
