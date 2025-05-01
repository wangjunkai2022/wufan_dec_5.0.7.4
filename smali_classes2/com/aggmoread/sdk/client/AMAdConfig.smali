.class public Lcom/aggmoread/sdk/client/AMAdConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/client/AMAdConfig$Builder;
    }
.end annotation


# static fields
.field public static final AGREE_NO:I = 0x0

.field public static final AGREE_YES:I = 0x1


# instance fields
.field private appId:Ljava/lang/String;

.field private appName:Ljava/lang/String;

.field private customController:Lcom/aggmoread/sdk/client/AMCustomController;

.field private isAgreePrivacyRecommend:I

.field private isAgreeShake:I


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/aggmoread/sdk/client/AMAdConfig;->isAgreePrivacyRecommend:I

    iput v0, p0, Lcom/aggmoread/sdk/client/AMAdConfig;->isAgreeShake:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/aggmoread/sdk/client/AMAdConfig$1;)V
    .locals 0

    invoke-direct {p0}, Lcom/aggmoread/sdk/client/AMAdConfig;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/aggmoread/sdk/client/AMAdConfig;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/client/AMAdConfig;->setAppId(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/aggmoread/sdk/client/AMAdConfig;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/client/AMAdConfig;->setAppName(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$300(Lcom/aggmoread/sdk/client/AMAdConfig;Lcom/aggmoread/sdk/client/AMCustomController;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/client/AMAdConfig;->setCustomController(Lcom/aggmoread/sdk/client/AMCustomController;)V

    return-void
.end method

.method private setAppId(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdConfig;->appId:Ljava/lang/String;

    return-void
.end method

.method private setAppName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdConfig;->appName:Ljava/lang/String;

    return-void
.end method

.method private setCustomController(Lcom/aggmoread/sdk/client/AMCustomController;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/client/AMAdConfig;->customController:Lcom/aggmoread/sdk/client/AMCustomController;

    return-void
.end method


# virtual methods
.method public getAppId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAdConfig;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAdConfig;->appName:Ljava/lang/String;

    return-object v0
.end method

.method public getCustomController()Lcom/aggmoread/sdk/client/AMCustomController;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/client/AMAdConfig;->customController:Lcom/aggmoread/sdk/client/AMCustomController;

    return-object v0
.end method

.method public isAgreePrivacyRecommend()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/client/AMAdConfig;->isAgreePrivacyRecommend:I

    return v0
.end method

.method public isAgreeShake()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/client/AMAdConfig;->isAgreeShake:I

    return v0
.end method

.method public setAgreePrivacyRecommend(I)V
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/client/AMAdConfig;->isAgreePrivacyRecommend:I

    return-void
.end method

.method public setAgreeShake(I)V
    .locals 0

    iput p1, p0, Lcom/aggmoread/sdk/client/AMAdConfig;->isAgreeShake:I

    return-void
.end method
