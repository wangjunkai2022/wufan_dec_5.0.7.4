.class final Lcom/efs/sdk/net/NetConfigManager$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/efs/sdk/net/NetConfigManager$1;->onChange(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/SharedPreferences$Editor;

.field final synthetic b:Ljava/lang/Object;

.field final synthetic c:Lcom/efs/sdk/net/NetConfigManager$1;


# direct methods
.method constructor <init>(Lcom/efs/sdk/net/NetConfigManager$1;Landroid/content/SharedPreferences$Editor;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/efs/sdk/net/NetConfigManager$1$1;->c:Lcom/efs/sdk/net/NetConfigManager$1;

    iput-object p2, p0, Lcom/efs/sdk/net/NetConfigManager$1$1;->a:Landroid/content/SharedPreferences$Editor;

    iput-object p3, p0, Lcom/efs/sdk/net/NetConfigManager$1$1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/efs/sdk/net/NetConfigManager$1$1;->a:Landroid/content/SharedPreferences$Editor;

    iget-object v1, p0, Lcom/efs/sdk/net/NetConfigManager$1$1;->b:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const-string v2, "apm_netperf_sampling_rate"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 2
    iget-object v0, p0, Lcom/efs/sdk/net/NetConfigManager$1$1;->a:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method
