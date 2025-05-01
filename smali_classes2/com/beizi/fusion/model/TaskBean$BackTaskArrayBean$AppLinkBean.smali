.class public Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean$AppLinkBean;
.super Ljava/lang/Object;
.source "TaskBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AppLinkBean"
.end annotation


# instance fields
.field private appLinkId:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "appLinkId"
    .end annotation
.end field

.field private testLink:Ljava/lang/String;
    .annotation runtime Lcom/beizi/fusion/model/JsonNode;
        key = "testLink"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppLinkId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean$AppLinkBean;->appLinkId:Ljava/lang/String;

    return-object v0
.end method

.method public getTestLink()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean$AppLinkBean;->testLink:Ljava/lang/String;

    return-object v0
.end method

.method public setAppLinkId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean$AppLinkBean;->appLinkId:Ljava/lang/String;

    return-void
.end method

.method public setTestLink(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/model/TaskBean$BackTaskArrayBean$AppLinkBean;->testLink:Ljava/lang/String;

    return-void
.end method
