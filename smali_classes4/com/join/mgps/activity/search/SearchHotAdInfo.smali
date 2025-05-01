.class public Lcom/join/mgps/activity/search/SearchHotAdInfo;
.super Ljava/lang/Object;
.source "SearchHotAdInfo.java"


# instance fields
.field private jump_ad_info:Lcom/join/mgps/dto/CommonGameInfoBean;

.field private position:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getJump_ad_info()Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchHotAdInfo;->jump_ad_info:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-object v0
.end method

.method public getPosition()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/activity/search/SearchHotAdInfo;->position:I

    return v0
.end method

.method public setJump_ad_info(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/search/SearchHotAdInfo;->jump_ad_info:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-void
.end method

.method public setPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/search/SearchHotAdInfo;->position:I

    return-void
.end method
