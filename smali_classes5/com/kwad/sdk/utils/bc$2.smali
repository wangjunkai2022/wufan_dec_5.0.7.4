.class final Lcom/kwad/sdk/utils/bc$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/utils/bb$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/utils/bc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aRd:Lcom/kwad/sdk/utils/bc;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/utils/bc;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/utils/bc$2;->aRd:Lcom/kwad/sdk/utils/bc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/utils/bc$2;->aRd:Lcom/kwad/sdk/utils/bc;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/bc;->a(Lcom/kwad/sdk/utils/bc;Z)Z

    return-void
.end method
