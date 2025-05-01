.class public Lcom/join/mgps/dto/VideoInitCfgBean;
.super Ljava/lang/Object;
.source "VideoInitCfgBean.java"


# instance fields
.field private sdkKey:Ljava/lang/String;

.field private sdkType:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getSdkKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/VideoInitCfgBean;->sdkKey:Ljava/lang/String;

    return-object v0
.end method

.method public getSdkType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/VideoInitCfgBean;->sdkType:I

    return v0
.end method

.method public setSdkKey(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/VideoInitCfgBean;->sdkKey:Ljava/lang/String;

    return-void
.end method

.method public setSdkType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/VideoInitCfgBean;->sdkType:I

    return-void
.end method
