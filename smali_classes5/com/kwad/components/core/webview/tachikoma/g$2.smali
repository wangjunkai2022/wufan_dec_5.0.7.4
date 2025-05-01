.class final Lcom/kwad/components/core/webview/tachikoma/g$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/tachikoma/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/tachikoma/g;->a(Landroid/content/Context;Lcom/kwad/components/offline/api/tk/model/StyleTemplate;Lcom/kwad/components/core/webview/tachikoma/g$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Zf:Lcom/kwad/components/core/webview/tachikoma/g;

.field final synthetic Zg:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

.field final synthetic Zh:Lcom/kwad/components/core/webview/tachikoma/g$a;

.field final synthetic Zi:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/tachikoma/g;Lcom/kwad/components/offline/api/tk/model/StyleTemplate;Lcom/kwad/components/core/webview/tachikoma/g$a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/g$2;->Zf:Lcom/kwad/components/core/webview/tachikoma/g;

    iput-object p2, p0, Lcom/kwad/components/core/webview/tachikoma/g$2;->Zg:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    iput-object p3, p0, Lcom/kwad/components/core/webview/tachikoma/g$2;->Zh:Lcom/kwad/components/core/webview/tachikoma/g$a;

    iput-object p4, p0, Lcom/kwad/components/core/webview/tachikoma/g$2;->Zi:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/a$a;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/aw;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/TKRenderFailReason;)V
    .locals 1

    const-string p1, "KSAdTKBundleService"

    const-string v0, "load bundle fail: execute fail"

    .line 1
    invoke-static {p1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/g$2;->Zh:Lcom/kwad/components/core/webview/tachikoma/g$a;

    const-string v0, "execute fail"

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/tachikoma/g$a;->aQ(Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/g$2;->Zf:Lcom/kwad/components/core/webview/tachikoma/g;

    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/g$2;->Zi:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/webview/tachikoma/g;->unloadBundle(Ljava/lang/String;)V

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/a/o;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/a/p;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/b/m;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/b/t;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/sdk/commercial/model/WebCloseStatus;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/sdk/components/r;Lcom/kwad/sdk/core/webview/b;)V
    .locals 0

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/webview/d/b/a;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/webview/d/b/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    return-void
.end method

.method public final b(Lcom/kwad/components/core/webview/jshandler/ac$a;)V
    .locals 0

    return-void
.end method

.method public final bF()V
    .locals 2

    const-string v0, "KSAdTKBundleService"

    const-string v1, "load bundle success: done"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/g$2;->Zh:Lcom/kwad/components/core/webview/tachikoma/g$a;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/kwad/components/core/webview/tachikoma/g$a;->Zk:Z

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/tachikoma/g$a;->td()V

    return-void
.end method

.method public final bG()V
    .locals 0

    return-void
.end method

.method public final getTKContainer()Landroid/widget/FrameLayout;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getTKReaderScene()Ljava/lang/String;
    .locals 1

    const-string v0, "tk_bundle_service"

    return-object v0
.end method

.method public final getTkTemplateId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/g$2;->Zg:Lcom/kwad/components/offline/api/tk/model/StyleTemplate;

    iget-object v0, v0, Lcom/kwad/components/offline/api/tk/model/StyleTemplate;->templateId:Ljava/lang/String;

    return-object v0
.end method

.method public final getTouchCoordsView()Lcom/kwad/sdk/widget/e;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
