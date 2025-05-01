.class public Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/mediation/ad/IMediationViewBinder;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;
    }
.end annotation


# instance fields
.field public final callToActionId:I

.field public final decriptionTextId:I

.field public final extras:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final groupImage1Id:I

.field public final groupImage2Id:I

.field public final groupImage3Id:I

.field public final iconImageId:I

.field public final layoutId:I

.field public final logoLayoutId:I

.field public final mainImageId:I

.field public final mediaViewId:I

.field public final shakeViewContainerId:I

.field public final sourceId:I

.field public final titleId:I


# direct methods
.method protected constructor <init>(Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->vv:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->layoutId:I

    .line 3
    iget v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->m:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->titleId:I

    .line 4
    iget v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->p:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->decriptionTextId:I

    .line 5
    iget v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->i:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->callToActionId:I

    .line 6
    iget v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->o:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->iconImageId:I

    .line 7
    iget v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->u:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->mainImageId:I

    .line 8
    iget v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->n:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->mediaViewId:I

    .line 9
    iget v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->qv:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->sourceId:I

    .line 10
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->t:Ljava/util/Map;

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->extras:Ljava/util/Map;

    .line 11
    iget v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->k:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->groupImage1Id:I

    .line 12
    iget v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->b:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->groupImage2Id:I

    .line 13
    iget v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->jh:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->groupImage3Id:I

    .line 14
    iget v0, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->wv:I

    iput v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->logoLayoutId:I

    .line 15
    iget p1, p1, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder$Builder;->r:I

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->shakeViewContainerId:I

    return-void
.end method


# virtual methods
.method public getCallToActionId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->callToActionId:I

    return v0
.end method

.method public getDecriptionTextId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->decriptionTextId:I

    return v0
.end method

.method public getExtras()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->extras:Ljava/util/Map;

    return-object v0
.end method

.method public getGroupImage1Id()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->groupImage1Id:I

    return v0
.end method

.method public getGroupImage2Id()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->groupImage2Id:I

    return v0
.end method

.method public getGroupImage3Id()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->groupImage3Id:I

    return v0
.end method

.method public getIconImageId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->iconImageId:I

    return v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->layoutId:I

    return v0
.end method

.method public getLogoLayoutId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->logoLayoutId:I

    return v0
.end method

.method public getMainImageId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->mainImageId:I

    return v0
.end method

.method public getMediaViewId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->mediaViewId:I

    return v0
.end method

.method public getShakeViewContainerId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->shakeViewContainerId:I

    return v0
.end method

.method public getSourceId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->sourceId:I

    return v0
.end method

.method public getTitleId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/mediation/ad/MediationViewBinder;->titleId:I

    return v0
.end method
