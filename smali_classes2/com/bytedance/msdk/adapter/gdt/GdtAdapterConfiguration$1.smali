.class Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/qq/e/comm/managers/GDTAdSdk$OnStartListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;->b(Landroid/content/Context;Ljava/lang/String;)Z
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

    iput-object p1, p0, Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration$1;->a:Lcom/bytedance/msdk/adapter/gdt/GdtAdapterConfiguration;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onStartFailed(Ljava/lang/Exception;)V
    .locals 0

    return-void
.end method

.method public onStartSuccess()V
    .locals 0

    return-void
.end method
