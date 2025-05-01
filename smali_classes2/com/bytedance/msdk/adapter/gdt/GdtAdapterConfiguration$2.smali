.class Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/qq/e/ads/dfa/GDTAppDialogClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->showOpenOrInstallAppDialog()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;


# direct methods
.method constructor <init>(Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;)V
    .locals 0

    iput-object p1, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onButtonClick(I)V
    .locals 3

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;

    invoke-static {v0}, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->a(Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;

    invoke-static {v0}, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->a(Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getInitCallback()Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->create()Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    move-result-object v0

    const/16 v1, 0x1f9f

    invoke-virtual {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->add(II)Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;

    iget-object p1, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration$2;->a:Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;

    invoke-static {p1}, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->a(Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;)Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/valueset/MediationInitConfig;->getInitCallback()Lcom/bykv/vk/openvk/api/proto/Bridge;

    move-result-object p1

    const/16 v1, 0x2014

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/mediation/bridge/MediationValueSetBuilder;->build()Lcom/bykv/vk/openvk/api/proto/ValueSet;

    move-result-object v0

    const-class v2, Ljava/lang/Void;

    invoke-interface {p1, v1, v0, v2}, Lcom/bykv/vk/openvk/api/proto/Caller;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
