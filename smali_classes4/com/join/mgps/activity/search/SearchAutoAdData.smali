.class public Lcom/join/mgps/activity/search/SearchAutoAdData;
.super Ljava/lang/Object;
.source "SearchAutoAdData.java"


# instance fields
.field private firstAd:Lcom/join/mgps/dto/CommonGameInfoBean;

.field private secondAd:Lcom/join/mgps/dto/CommonGameInfoBean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFirstAd()Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchAutoAdData;->firstAd:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-object v0
.end method

.method public getSecondAd()Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchAutoAdData;->secondAd:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-object v0
.end method

.method public setFirstAd(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/search/SearchAutoAdData;->firstAd:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-void
.end method

.method public setSecondAd(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/search/SearchAutoAdData;->secondAd:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-void
.end method
