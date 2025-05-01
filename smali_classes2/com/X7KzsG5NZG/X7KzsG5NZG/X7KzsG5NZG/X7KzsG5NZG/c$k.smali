.class Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;->call(ILcom/bykv/vk/openvk/api/proto/ValueSet;Ljava/lang/Class;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Landroid/view/ViewGroup;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:Ljava/util/List;

.field final synthetic f:Ljava/util/List;

.field final synthetic g:Lcom/bykv/vk/openvk/api/proto/Bridge;

.field final synthetic h:Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;


# direct methods
.method constructor <init>(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;Landroid/app/Activity;Landroid/view/ViewGroup;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bykv/vk/openvk/api/proto/Bridge;)V
    .locals 0

    iput-object p1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->h:Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;

    iput-object p2, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->b:Landroid/app/Activity;

    iput-object p3, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->c:Landroid/view/ViewGroup;

    iput-object p4, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->d:Ljava/util/List;

    iput-object p5, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->e:Ljava/util/List;

    iput-object p6, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->f:Ljava/util/List;

    iput-object p7, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->g:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->h:Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;

    iget-object v1, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->c:Landroid/view/ViewGroup;

    iget-object v3, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->d:Ljava/util/List;

    iget-object v4, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->e:Ljava/util/List;

    iget-object v5, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->f:Ljava/util/List;

    iget-object v6, p0, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c$k;->g:Lcom/bykv/vk/openvk/api/proto/Bridge;

    invoke-static {v6}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/a;->b(Lcom/bykv/vk/openvk/api/proto/Bridge;)Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;

    move-result-object v6

    invoke-static/range {v0 .. v6}, Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;->d(Lcom/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/X7KzsG5NZG/c;Landroid/content/Context;Landroid/view/ViewGroup;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;)V

    return-void
.end method
