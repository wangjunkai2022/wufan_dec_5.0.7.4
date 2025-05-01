.class public Lcom/aggmoread/sdk/client/AMAdConfig$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/client/AMAdConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private appId:Ljava/lang/String;

.field private appName:Ljava/lang/String;

.field private customController:Lcom/aggmoread/sdk/client/AMCustomController;

.field private isAgreePrivacyRecommend:I

.field private isAgreeShake:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->isAgreePrivacyRecommend:I

    iput v0, p0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->isAgreeShake:I

    return-void
.end method

.method private setAppId(Ljava/lang/String;)Lcom/aggmoread/sdk/client/AMAdConfig$Builder;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->appId:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/aggmoread/sdk/client/AMAdConfig;
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/client/AMAdConfig;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/client/AMAdConfig;-><init>(Lcom/aggmoread/sdk/client/AMAdConfig$1;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->appId:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/client/AMAdConfig;->access$100(Lcom/aggmoread/sdk/client/AMAdConfig;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->appName:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/client/AMAdConfig;->access$200(Lcom/aggmoread/sdk/client/AMAdConfig;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->customController:Lcom/aggmoread/sdk/client/AMCustomController;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/client/AMAdConfig;->access$300(Lcom/aggmoread/sdk/client/AMAdConfig;Lcom/aggmoread/sdk/client/AMCustomController;)V

    iget v1, p0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->isAgreeShake:I

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/client/AMAdConfig;->setAgreeShake(I)V

    iget v1, p0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->isAgreePrivacyRecommend:I

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/client/AMAdConfig;->setAgreePrivacyRecommend(I)V

    return-object v0
.end method

.method public setAgreePrivacyRecommend(I)Lcom/aggmoread/sdk/client/AMAdConfig$Builder;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->isAgreePrivacyRecommend:I

    return-object p0
.end method

.method public setAgreeShake(I)Lcom/aggmoread/sdk/client/AMAdConfig$Builder;
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->isAgreeShake:I

    return-object p0
.end method

.method public setAppName(Ljava/lang/String;)Lcom/aggmoread/sdk/client/AMAdConfig$Builder;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->appName:Ljava/lang/String;

    return-object p0
.end method

.method public setCustomController(Lcom/aggmoread/sdk/client/AMCustomController;)Lcom/aggmoread/sdk/client/AMAdConfig$Builder;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdConfig$Builder;->customController:Lcom/aggmoread/sdk/client/AMCustomController;

    return-object p0
.end method
