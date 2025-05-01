.class final Lcom/kwad/components/core/webview/tachikoma/d/b$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/tachikoma/d/b;->s(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic abJ:Ljava/lang/String;

.field final synthetic abK:Ljava/lang/String;

.field final synthetic abL:Lcom/kwad/components/core/webview/tachikoma/d/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/tachikoma/d/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/d/b$1;->abL:Lcom/kwad/components/core/webview/tachikoma/d/b;

    iput-object p2, p0, Lcom/kwad/components/core/webview/tachikoma/d/b$1;->abJ:Ljava/lang/String;

    iput-object p3, p0, Lcom/kwad/components/core/webview/tachikoma/d/b$1;->abK:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/d/b$1;->abL:Lcom/kwad/components/core/webview/tachikoma/d/b;

    iget-object v1, p0, Lcom/kwad/components/core/webview/tachikoma/d/b$1;->abJ:Ljava/lang/String;

    iget-object v2, p0, Lcom/kwad/components/core/webview/tachikoma/d/b$1;->abK:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/kwad/components/core/webview/tachikoma/d/b;->a(Lcom/kwad/components/core/webview/tachikoma/d/b;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
