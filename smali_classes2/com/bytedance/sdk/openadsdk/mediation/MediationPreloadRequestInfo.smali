.class public Lcom/bytedance/sdk/openadsdk/mediation/MediationPreloadRequestInfo;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/mediation/IMediationPreloadRequestInfo;


# instance fields
.field private m:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private vv:I


# direct methods
.method public constructor <init>(ILcom/bytedance/sdk/openadsdk/AdSlot;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/bytedance/sdk/openadsdk/AdSlot;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationPreloadRequestInfo;->vv:I

    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationPreloadRequestInfo;->m:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 4
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationPreloadRequestInfo;->p:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getAdSlot()Lcom/bytedance/sdk/openadsdk/AdSlot;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationPreloadRequestInfo;->m:Lcom/bytedance/sdk/openadsdk/AdSlot;

    return-object v0
.end method

.method public getAdType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationPreloadRequestInfo;->vv:I

    return v0
.end method

.method public getPrimeRitList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/MediationPreloadRequestInfo;->p:Ljava/util/List;

    return-object v0
.end method
