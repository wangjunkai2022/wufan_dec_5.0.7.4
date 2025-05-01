.class final Lcom/kwad/components/core/webview/tachikoma/d/a$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/tachikoma/d/a;->aW(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic abE:I

.field final synthetic abF:Lcom/kwad/components/core/webview/tachikoma/d/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/tachikoma/d/a;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/d/a$1;->abF:Lcom/kwad/components/core/webview/tachikoma/d/a;

    iput p2, p0, Lcom/kwad/components/core/webview/tachikoma/d/a$1;->abE:I

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/d/a$1;->abF:Lcom/kwad/components/core/webview/tachikoma/d/a;

    iget v1, p0, Lcom/kwad/components/core/webview/tachikoma/d/a$1;->abE:I

    invoke-static {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/d/a;->a(Lcom/kwad/components/core/webview/tachikoma/d/a;I)V

    return-void
.end method
