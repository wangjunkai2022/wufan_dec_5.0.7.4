.class final Lcom/kwad/components/core/webview/tachikoma/i$19$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/export/proxy/AdHttpBodyBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/tachikoma/i$19;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aal:Lcom/kwad/components/core/webview/tachikoma/i$19;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/tachikoma/i$19;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/i$19$1;->aal:Lcom/kwad/components/core/webview/tachikoma/i$19;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final buildFormData(Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$19$1;->aal:Lcom/kwad/components/core/webview/tachikoma/i$19;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/i$19;->aag:Ljava/lang/String;

    const-string v1, "task_id"

    invoke-interface {p1, v1, v0}, Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, "os_build_model"

    invoke-interface {p1, v1, v0}, Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "os_build_serial"

    const-string v1, "unknown"

    .line 3
    invoke-interface {p1, v0, v1}, Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v1, "os_build_brand"

    invoke-interface {p1, v1, v0}, Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "app_version"

    const-string v1, "3.3.63"

    .line 5
    invoke-interface {p1, v0, v1}, Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/i$19$1;->aal:Lcom/kwad/components/core/webview/tachikoma/i$19;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/i$19;->aaj:Ljava/lang/String;

    const-string v1, "git_head_commit"

    invoke-interface {p1, v1, v0}, Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "execute_type"

    const-string v1, "manual_qa"

    .line 7
    invoke-interface {p1, v0, v1}, Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "uid"

    const-string v1, ""

    .line 8
    invoke-interface {p1, v0, v1}, Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-static {}, Lcom/kwad/sdk/utils/aw;->getDeviceId()Ljava/lang/String;

    move-result-object v0

    const-string v2, "did"

    invoke-interface {p1, v2, v0}, Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "execute_user"

    .line 10
    invoke-interface {p1, v0, v1}, Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "url_type"

    const-string v1, "transform"

    .line 11
    invoke-interface {p1, v0, v1}, Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "file"

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".json"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "application/octet-stream"

    iget-object v3, p0, Lcom/kwad/components/core/webview/tachikoma/i$19$1;->aal:Lcom/kwad/components/core/webview/tachikoma/i$19;

    iget-object v3, v3, Lcom/kwad/components/core/webview/tachikoma/i$19;->aak:Ljava/lang/String;

    const-string v4, "UTF-8"

    .line 14
    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v3

    .line 15
    invoke-interface {p1, v0, v1, v2, v3}, Lcom/kwad/sdk/export/proxy/AdHttpFormDataBuilder;->addFormDataPart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 16
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void
.end method
